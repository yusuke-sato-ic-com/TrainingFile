package jp.co.iccom.sato_yusuke.calculate_sales.TrainingFile;

import java.io.*;
import java.util.*;

public class CalculateSales {
	public static void main(String[] args) {
		// コマンドライン引数で、ディレクトリより支店定義ファイルを読み込む
		// ディレクトリまでのパス指定
		File file = new File(args[0]); //Fileオブジェクトの生成１
		File branch = new File(file,"branch.lst"); // Fileオブジェクトの生成２

		try {
			if (!branch.exists()) { // 指定したファイルが存在しているか確認し、false時の処理
				System.out.println("支店定義ファイルは存在しません");
				return;
			}
			FileReader fr = new FileReader(branch); // FileReaderオブジェクトの生成
			BufferedReader br = new BufferedReader(fr); // BufferedReaderオブジェクトの生成
			String line; // ファイルから１行だけ読み込み
			Map<String, String> map = new HashMap<String, String>();
			while ((line = br.readLine()) != null) {
				String[] branchData = line.split(",");
				System.out.println(branchData[0]);
				map.put(branchData[0], branchData[1]);
			}
			br.close(); // ストリームを閉じる

		} catch(IOException e) { // 例外を受け取る
				System.out.println(e);

		}
	}
}


/*

Map<String, String> map = new HashMap<String, String>();
while ((s = br.readLine()) != null) {
String line = s;
String[] bra = line.split(",");
map.put(bra[0], bra[1]);

*/