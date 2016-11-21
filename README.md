#SpringMVC勉強会 
ゴールとしてはメモ帳アプリを作成

# SpringMVCで使用するライブラリ
jarをそろえるのに一苦労する(今回は手動で用意した)
・jstl-1.2.jar
・log4j-1.2-api-2.7.jar
・log4j-core-2.7.jar
（springに内蔵されてるので必須jarです)
・mysql-connection-java-5.1.40-bin.jar
・org-apache-commons-logging.jar
・spring-aop-4.3.2.RELEASE-sources.jar
・spring-aop-4.3.2.RELEASE.jar
・spring-beans-4.3.2.RELEASE-sources.jar
・spring-beans-4.3.2.RELEASE.jar
・spring-context-4.3.2.RELEASE-sources.jar
・spring-context-4.3.2.RELEASE.jar
・spring-core-4.3.2.RELEASE-sources.jar
・spring-core-4.3.2.RELEASE.jar
・spring-dao-2.0.8.jar
・spring-expression-4.3.2.RELEASE-sources.jar
・spring-expression-4.3.2.RELEASE.jar
・spring-jdbc-4.3.4.RELEASE.jar
・spring-web-4.3.2.RELEASE-sources.jar
・spring-web-4.3.2.RELEASE.jar

#Bean定義ファイル(xml)を任意のファイルで用意する
SpringBootでは不要だった気がする
・component-scanすることによって@AutoWiredでインスタンスを取得できる(インジェクション)

#mvc-configファイルを任意のファイル名で取得する
・ViewReSolverにView名(画面名)を登録する
・Controller側で戻り値にファイル名(拡張子抜き)で指定すればok

#web.xml
・DispatherServletを登録(リクエスト時に呼ばれる)
・configファイル系をLoarderに登録

##メンバー
イッシー

##開発履歴
2016/11開始

#課題 SELECT文で取得件数を変えずに取得結果を動的に変更したい
(1件目～10件目)
between 1 and 10
 
(11件目～20件目)
between 11 and 20
