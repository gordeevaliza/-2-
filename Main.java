����   A �
      java/lang/Object <init> ()V  java/io/File 
 numbers.txt
     (Ljava/lang/String;)V  java/util/Scanner
     (Ljava/io/File;)V
     nextLine ()Ljava/lang/String;   
      java/lang/String split '(Ljava/lang/String;)[Ljava/lang/String;
   ! " # $ java/lang/Integer parseInt (Ljava/lang/String;)I
 & ' ( ) * Main testMin ([II)V
 & , - * testMax
 & / 0 * testSum       
 & 4 5 6 testMult ([IJ)V
 8 9 : ; < NumberOperations _min ([I)I	 > ? @ A B java/lang/System out Ljava/io/PrintStream; D Min: Passed
 F G H I  java/io/PrintStream println   K L M makeConcatWithConstants (II)Ljava/lang/String;
 8 O P < _max R Max: Passed  K
 8 U V < _sum X Sum: Passed  K
 8 [ \ < _mult ^ Mult: Passed  ` L a (JJ)Ljava/lang/String; Code LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; file Ljava/io/File; scanner Ljava/util/Scanner; line Ljava/lang/String; nrr numbers [I StackMapTable l u 
Exceptions { java/io/FileNotFoundException expected result J 
SourceFile 	Main.java BootstrapMethods � "Min: Failed. Expected , but got  � "Max: Failed. Expected , but got  � "Sum: Failed. Expected , but got  � #Mult: Failed. Expected , but got  �
 � � � L � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! &           b   /     *� �    c        d        e f   	 g h  b       a� Y	� L� Y+� M,� N-� :��
:6�� 2� O����� %� +
� . 1� 3�    c   6     
 	  
      '  2  ?  E  K  Q  X  `  d   H  *  i j    a k l   
 W m n   N o p   I q r    A s l  ' : t u  v    � *  w    w x  �  y     z 	 ) *  b   ~     #*� 7=� � =C� E� � =� J  � E�    c          
    "  d        # t u     # | j    } j  v    �  	 - *  b   ~     #*� N=� � =Q� E� � =� S  � E�    c       "  # 
 $  & " ( d        # t u     # | j    } j  v    �  	 0 *  b   ~     #*� T=� � =W� E� � =� Y  � E�    c       +  , 
 -  / " 1 d        # t u     # | j    } j  v    �  	 5 6  b   �     %*� Z�B!�� � =]� E� � =!� _  � E�    c       4  5  6  8 $ : d        % t u     % | ~    } ~  v    �       � �     �  � �  � �  � �  � �   
  � � � 