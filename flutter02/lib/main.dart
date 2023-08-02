import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home:Scaffold(
        appBar: AppBar(backgroundColor: Colors.blue,title: Text('앱임'),), //상단
        body:Text('안녕') //중간
        bottomNavigationBar: BottomAppBar(
          child:SizedBox(
            height: 50,
            child:Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: [Icon(Icons.phone),Icon(Icons.message),Icon(Icons.contact_page)]
            )
          )
        ), //하단
      )
    );
  }
}
