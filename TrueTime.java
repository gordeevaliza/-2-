����   A �
      java/lang/Object <init> ()V  prov.txt 
 java/io/BufferedWriter  java/io/FileWriter
     (Ljava/lang/String;)V
 	    (Ljava/io/Writer;)V ���
      java/lang/Math random ()D@Y      
      ! java/lang/String valueOf (I)Ljava/lang/String;
 	 # $  write
 	 & '  newLine
 	 ) *  close , java/io/File
 +  / java/util/Scanner
 . 1  2 (Ljava/io/File;)V
 . 4 5 6 hasNext ()Z
 . 8 9 : next ()Ljava/lang/String;
 < = > ? @ java/lang/Integer parseInt (Ljava/lang/String;)I
 B C D E F java/lang/System currentTimeMillis ()J
 H I J K L TrueTime findMin ([I)I	 B N O P out Ljava/io/PrintStream;   R S ! makeConcatWithConstants
 U V W X  java/io/PrintStream println  Z S [ (J)Ljava/lang/String;
 H ] ^ L findMax  R  Z
 H b c L calculateSum  R  Z
 H g h L calculateProduct  R  Z Code LineNumberTable LocalVariableTable this 
LTrueTime; num I nrr [I minim StackMapTable s maxim sum mult main ([Ljava/lang/String;)V i args [Ljava/lang/String; filename Ljava/lang/String; writer Ljava/io/BufferedWriter; file Ljava/io/File; scanner Ljava/util/Scanner; numbers index 	startTime J 	minResult 	maxResult 	sumResult productResult ~ 
Exceptions � java/io/IOException 
SourceFile TrueTime.java BootstrapMethods � Минимум:  � PВремя выполнения функции findMin:  миллисекунд � Максимум:  � PВремя выполнения функции findMax:  миллисекунд � Сумма:  � UВремя выполнения функции calculateSum:  миллисекунд � Произведение:  � YВремя выполнения функции calculateProduct:  миллисекунд �
 � � � S � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! H           k   /     *� �    l        m        n o   	 K L  k   �     )*.<*M,�>6� ,.6� <�����    l           	  
 !  '  m       	 p q    ) r s    % t q  u    �   v v  �  	 ^ L  k   �     )*.<*M,�>6� ,.6� <�����    l              !  '  m       	 p q    ) r s    % w q  u    �   v v  �  	 c L  k   �     #<*M,�>6� ,.6`<�����    l              !  m        p q    # r s    ! x q  u    � 
  v v  �  	 h L  k   �     #<*M,�>6� ,.6h<�����    l       "  #  $  # ! & m        p q    # r s    ! y q  u    � 
  v v  �  	 z {  k  e    L� 	Y� Y+� � M>� ,�  k�`� � ",� %����,� (� +Y� -N� .Y-� 0:�
:6� 3� � 7� ;O���� A7� G6	� M	� Q  � T� M� Ae� Y  � T� A7� \6
� M
� _  � T� M� Ae� `  � T� A7� a6� M� d  � T� M� Ae� e  � T� A7� f6� M� i  � T� M� Ae� j  � T�    l   ~    +  -  .  / , 0 0 . 6 2 : 4 D 5 N 7 T 9 W : _ ; l < r ? w @ ~ A � B � D � E � F � G � I � J � K � L � N � O � P	 Q R m   �   ! | q    } ~     �   � �  D � � �  N � � �  T � � s  W � � q  w � � �  ~ � � q 	 � s � q 
 � I � q  �  � q  u   * �   	�  �    �  	 + . v   �     �  �    � �   2  �  � �  � �  � �  � �  � �  � �  � �  � �   
  � � � 