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
 H I J K L 
MyFunction findMin ([I)I
 H N O L findMax
 H Q R L calculateSum
 H T U L calculateProduct	 B W X Y out Ljava/io/PrintStream;   [ \ ! makeConcatWithConstants
 ^ _ ` a  java/io/PrintStream println Code LineNumberTable LocalVariableTable this LMyFunction; num I nrr [I minim StackMapTable j maxim sum mult main ([Ljava/lang/String;)V i args [Ljava/lang/String; filename Ljava/lang/String; writer Ljava/io/BufferedWriter; file Ljava/io/File; scanner Ljava/util/Scanner; numbers index 	startTime J 	minResult A 	maxResult B 	sumResult C productResult D u 
Exceptions � java/io/IOException 
SourceFile MyFunction.java BootstrapMethods � MВремя работы всей программы:  миллисекунд �
 � � � \ � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! H           b   /     *� �    c        d        e f   	 K L  b   �     )*.<*M,�>6� ,.6� <�����    c           	  
 !  '  d       	 g h    ) i j    % k h  l    �   m m  �  	 O L  b   �     )*.<*M,�>6� ,.6� <�����    c              !  '  d       	 g h    ) i j    % n h  l    �   m m  �  	 R L  b   �     #<*M,�>6� ,.6`<�����    c              !  d        g h    # i j    ! o h  l    � 
  m m  �  	 U L  b   �     #<*M,�>6� ,.6h<�����    c       "  #  $  # ! & d        g h    # i j    ! p h  l    � 
  m m  �  	 q r  b  C     �L� 	Y� Y+� � M>� ,�  k�`� � ",� %����,� (� +Y� -N� .Y-� 0:�
:6� 3� � 7� ;O���� A7� G6	� Ae�6
� A7� M6� Ae�6� A7� P6� Ae�6� A7� S6� Ae�6� V
```� Z  � ]�    c   r    +  -  .  / , 0 0 . 6 2 : 4 D 5 N 7 T 9 W : _ ; l < r ? w @ ~ A � C � D � E � G � H � I � K � L � M � O � P d   �   ! s h    � t u    � v w   � x y  D � z {  N � | }  T � ~ j  W �  h  w f � �  ~ _ � h 	 � V � h 
 � J � h  � A � h  � 5 � h  � , � h  �   � h  �  � h  l   * �   	�  �    �  	 + . m   �     �  �    � �     �  � �   
  � � � 