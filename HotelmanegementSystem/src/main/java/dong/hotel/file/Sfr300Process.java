/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import dong.hotel.check.CheckOutInformation;
import dong.hotel.check.RoomState;

/**
 *
 * @author nifskorea
 */
public class Sfr300Process implements Fileinterface { // 체크인 관련 처리부 

    private ArrayList<String> readInfo = new ArrayList();
    private ArrayList<RoomState> roomstate = new ArrayList<>();
    private ArrayList<CheckOutInformation> checkout = new ArrayList<>();

    //checkout파일을 sfr400으로 가져가야하나?
    private String macosxroom = "/Users/nifskorea/Desktop/DB/roomState.txt";
    private String windowsroom = "C:\\DB\\roomState.txt";
    private String macosxcheckout = "/Users/nifskorea/Desktop/DB/checkout.txt";
    private String windowscheckout = "C:\\DB\\checkout.txt";
    private String line = "";  // 파일 공백시 

    SFR100Process fileae = new SFR100Process();

    @Override
    public void fRead() {
        if (fileae.getOssystem() == 1) {
            try {
                BufferedReader fileread = new BufferedReader(new FileReader(macosxroom)); // 한줄씩 읽어들임 
                while ((line = fileread.readLine()) != null) { // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
                    readInfo.add(line); // 읽은 정보 기록      
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (fileae.getOssystem() == 2) {
            try {
                BufferedReader fileread = new BufferedReader(new FileReader(windowsroom)); // 한줄씩 읽어들임 
                while ((line = fileread.readLine()) != null) { // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
                    readInfo.add(line); // 읽은 정보 기록      
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void fWrite(String a) throws IOException {
        String oslocation = "";

       if (fileae.getOssystem() == 1) {
            oslocation = macosxroom;
        } else if (fileae.getOssystem() == 2) {
            oslocation = windowsroom;
        }
        BufferedWriter log = new BufferedWriter(new FileWriter(oslocation, false));
        PrintWriter pw = new PrintWriter(log, true);
        pw.write(a + "\n"); // 출력
        pw.flush(); // 남아있는 데이터를 모두 출력 
        pw.close(); // 스트림 클로스 
    }

    public void CRead() {

        if (fileae.getOssystem() == 1) {
            try {
                BufferedReader fileread = new BufferedReader(new FileReader(macosxcheckout)); // 한줄씩 읽어들임 
                while ((line = fileread.readLine()) != null) { // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
                    readInfo.add(line); // 읽은 정보 기록      
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (fileae.getOssystem() == 2) {
            try {
                BufferedReader fileread = new BufferedReader(new FileReader(windowscheckout)); // 한줄씩 읽어들임 
                while ((line = fileread.readLine()) != null) { // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
                    readInfo.add(line); // 읽은 정보 기록      
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void CSplite() {
        for (int i = 0; i < readInfo.size(); i++) { // 윗 부분은 체크인 아웃 정보 처리 
            line = readInfo.get(i);
            String[] str = line.split(" ");
            checkout.add(new CheckOutInformation(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8], str[9], str[10]));
        }
    }

    @Override
    public void sPlite() {

        for (int i = 0; i < readInfo.size(); i++) { // 기타 예외변수 처리를 위해 조금더 확장해서 처리를해놈 아래는 룸스테이트 
            line = readInfo.get(i);
            String[] str = line.split(" ");
            roomstate.add(new RoomState(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8], str[9]));
        }
    }

    public ArrayList<CheckOutInformation> returnGuestInfo() throws IOException {
        return checkout;
    }

    public ArrayList<RoomState> returnRoomState() throws IOException {
        return roomstate;
    }

}
