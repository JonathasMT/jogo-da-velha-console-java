//Developers: @jonathasmt e @matheus925467
import java.util.Scanner;
public class JogodaVelha {
	public static void main(String[] args) {
		String  [][]velha={{"_","_","_"},{"_","_","_"},{"_","_","_"}};
		int jogada=0;
		int vencedor=0;
		int jogadorX=0;
		int jogadorO=0;
		int rodada=0;
		String X="X";
		String O="O";
		
		System.out.println("TECLAS CORRESPONDENTES: ");
		System.out.println("[7][8][9]");
		System.out.println("[4][5][6]");
		System.out.println("[1][2][3]");
		
		//loop enquanto não houver vencedor ou enquanto não estiver tudo preenchido
		while(vencedor==0 && rodada!=9) {
		
		if(vencedor==0){
		System.out.println(" ");
		System.out.println("JOGO ATUAL:");
		System.out.println(velha[0][0]+" "+velha[0][1]+" "+velha[0][2]+" ");
		System.out.println(velha[1][0]+" "+velha[1][1]+" "+velha[1][2]+" ");
		System.out.println(velha[2][0]+" "+velha[2][1]+" "+velha[2][2]+" ");
		}
		
		//RODADA DO JOGADOR "X"
		while(jogadorX==0&&vencedor==0) {
		System.out.println("Jogador 'X', onde séra sua jogada? ");
		jogada = new Scanner(System.in).nextInt();
		switch(jogada) {
		case 1:if(velha[2][0]=="_"){velha[2][0]=X;jogadorX++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 2:if(velha[2][1]=="_"){velha[2][1]=X;jogadorX++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 3:if(velha[2][2]=="_"){velha[2][2]=X;jogadorX++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 4:if(velha[1][0]=="_"){velha[1][0]=X;jogadorX++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 5:if(velha[1][1]=="_"){velha[1][1]=X;jogadorX++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 6:if(velha[1][2]=="_"){velha[1][2]=X;jogadorX++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 7:if(velha[0][0]=="_"){velha[0][0]=X;jogadorX++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 8:if(velha[0][1]=="_"){velha[0][1]=X;jogadorX++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 9:if(velha[0][2]=="_"){velha[0][2]=X;jogadorX++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		}		

		//CASO JOGADOR "X" GANHE NAS HORIZONTAIS
		if(velha[0][0]==X && velha[0][1]==X && velha[0][2]==X) {
			vencedor++; System.out.println("JOGADOR 'X' FOI O VENCEDOR!");
			}
		if(velha[1][0]==X && velha[1][1]==X && velha[1][2]==X) {
			vencedor++; System.out.println("JOGADOR 'X' FOI O VENCEDOR!");
			}
		if(velha[2][0]==X && velha[2][1]==X && velha[2][2]==X) {
			vencedor++; System.out.println("JOGADOR 'X' FOI O VENCEDOR!");
			}
		//CASO JOGADOR "X" GANHE NAS VERTICAIS
		if(velha[0][0]==X && velha[1][0]==X && velha[2][0]==X) {
			vencedor++; System.out.println("JOGADOR 'X' FOI O VENCEDOR!");
			}
		if(velha[0][1]==X && velha[1][1]==X && velha[2][1]==X) {
			vencedor++; System.out.println("JOGADOR 'X' FOI O VENCEDOR!");
			}
		if(velha[0][2]==X && velha[1][2]==X && velha[2][2]==X) {
			vencedor++; System.out.println("JOGADOR 'X' FOI O VENCEDOR!");
			}
		//CASO JOGADOR "X" GANHE NAS DIAGONAIS
		if(velha[0][0]==X && velha[1][1]==X && velha[2][2]==X) {
			vencedor++; System.out.println("JOGADOR 'X' FOI O VENCEDOR!");
			}
		if(velha[2][0]==X && velha[1][1]==X && velha[0][2]==X) {
			vencedor++; System.out.println("JOGADOR 'X' FOI O VENCEDOR!");
			}
		}
		if(vencedor==0){
		System.out.println(" ");
		System.out.println("JOGO ATUAL:");
		System.out.println(velha[0][0]+" "+velha[0][1]+" "+velha[0][2]+" ");
		System.out.println(velha[1][0]+" "+velha[1][1]+" "+velha[1][2]+" ");
		System.out.println(velha[2][0]+" "+velha[2][1]+" "+velha[2][2]+" ");
			}
		//RODADA DO JOGADOR "O"
		while(jogadorO==0&&vencedor==0&&rodada!=9){
		System.out.println("Jogador 'O', onde séra sua jogada? ");
		jogada = new Scanner(System.in).nextInt();
		switch(jogada) {
		case 1:if(velha[2][0]=="_"){velha[2][0]=O;jogadorO++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 2:if(velha[2][1]=="_"){velha[2][1]=O;jogadorO++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 3:if(velha[2][2]=="_"){velha[2][2]=O;jogadorO++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 4:if(velha[1][0]=="_"){velha[1][0]=O;jogadorO++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 5:if(velha[1][1]=="_"){velha[1][1]=O;jogadorO++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 6:if(velha[1][2]=="_"){velha[1][2]=O;jogadorO++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 7:if(velha[0][0]=="_"){velha[0][0]=O;jogadorO++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 8:if(velha[0][1]=="_"){velha[0][1]=O;jogadorO++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		case 9:if(velha[0][2]=="_"){velha[0][2]=O;jogadorO++;rodada++;}else{System.out.println("Jogada não Permitida!");}break;
		}

		//CASO JOGADOR "O" GANHE NAS HORIZONTAIS
		if(velha[0][0]==O && velha[0][1]==O && velha[0][2]==O) {
			vencedor++; System.out.println("JOGADOR 'O' FOI O VENCEDOR!");
			}
		if(velha[1][0]==O && velha[1][1]==O && velha[1][2]==O) {
			vencedor++; System.out.println("JOGADOR 'O' FOI O VENCEDOR!");
			}
		if(velha[2][0]==O && velha[2][1]==O && velha[2][2]==O) {
			vencedor++; System.out.println("JOGADOR 'O' FOI O VENCEDOR!");
			}
		//CASO JOGADOR "O" GANHE NAS VERTICAIS
		if(velha[0][0]==O && velha[1][0]==O && velha[2][0]==O) {
			vencedor++; System.out.println("JOGADOR 'O' FOI O VENCEDOR!");
			}
		if(velha[0][1]==O && velha[1][1]==O && velha[2][1]==O) {
			vencedor++; System.out.println("JOGADOR 'O' FOI O VENCEDOR!");
			}
		if(velha[0][2]==O && velha[1][2]==O && velha[2][2]==O) {
			vencedor++; System.out.println("JOGADOR 'O' FOI O VENCEDOR!");
			}
		//CASO JOGADOR "O" GANHE NAS DIAGONAIS
		if(velha[0][0]==O && velha[1][1]==O && velha[2][2]==O) {
			vencedor++; System.out.println("JOGADOR 'O' FOI O VENCEDOR!");
			}
		if(velha[2][0]==O && velha[1][1]==O && velha[0][2]==O) {
			vencedor++; System.out.println("JOGADOR 'O' FOI O VENCEDOR!");
			}
		}jogadorX--;jogadorO--;
		}
		//Se não houver vencedor ao acabar todas as rodadas imprimira EMPATE!
		if(rodada==9&&vencedor==0){
		System.out.println(" ");System.out.println("EMPATE!");
		}
		System.out.println(" ");
		System.out.println("FIM DE JOGO");
		System.out.println(" ");
		System.out.println("JOGO FINAL:");
		System.out.println(velha[0][0]+" "+velha[0][1]+" "+velha[0][2]+" ");
		System.out.println(velha[1][0]+" "+velha[1][1]+" "+velha[1][2]+" ");
		System.out.println(velha[2][0]+" "+velha[2][1]+" "+velha[2][2]+" ");
	}
}
