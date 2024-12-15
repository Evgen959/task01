package controller;

import controller.interfeces.StartProject;
import service.CatalanNumberImpl;
import service.interfeces.CatalanNamber;

import java.util.Scanner;

// This class is designed to interact with the user.

public class StartProjectImpl implements StartProject {

    private CatalanNamber catalanNumber = new CatalanNumberImpl();

    public StartProjectImpl() {
    }

    public StartProjectImpl(CatalanNamber catalanNumber) {
        this.catalanNumber = catalanNumber;
    }

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value N: ");
        int a = scanner.nextInt();

        System.out.println("Number of correct parenthetical expressions for N = " + a + " equals: " + catalanNumber.catalan(a));
    }
}
