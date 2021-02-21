package com.erik.mvows;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 */
public final class TestServer  {

    public static void main (String [] args) {
        try (final ServerSocket server = new ServerSocket(1234);) {
            for (;;) {
                final Socket socket = server.accept();
                new ServerInstance(socket).start();
                System.out.println("Chillin");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
