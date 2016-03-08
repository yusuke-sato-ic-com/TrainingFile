package jp.co.iccom.yusuke_sato.calculate_sales;

import java.io.*;

public class CalculateSales {
	public static void main(String[] args) {
		// コマンドライン引数で、ディレクトリより支店定義ファイルを読み込む
		// ファイルが存在しない場合はエラーメッセージ "支店定義ファイルが存在しません"を表示

		try {
			File file = new File(args[0]);
			FileReader fr = new FileReader(file); // FileReaderオブジェクトの生成
			BufferedReader br = new BufferedReader(fr); // BufferedReaderオブジェクトの生成
			String line; // ファイルから１行だけ読み込み
			while((line = br.readLine()) != null) { // 読み込むデータがなくなったらfalse
				System.out.println(line);
			}
			br.close(); // ストリームを閉じる


		} catch(IOException e) {
			 System.out.println(e);
		}
	}
}