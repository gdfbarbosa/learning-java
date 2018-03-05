package com.gdfbarbosa.java.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite um formato para a data atual (seguindo padrões java.text.SimpleDateFormat): ");
        String cmd = br.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat(cmd);
        String dataFormatada = sdf.format(new Date());
        System.out.println("Data formatada = " + dataFormatada);
    }
}
