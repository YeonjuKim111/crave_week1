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
        appBar: AppBar(title:Text('금호동3가'),actions: [Icon(Icons.search),Icon(Icons.menu),Icon(Icons.alarm)]),
        body:Container(
          height: 150,
          padding: EdgeInsets.all(30),
          child: Row(
          children: [Flexible(child: Image.asset('dog.jpg',width: 150,),flex:3),
            Flexible(child:Container(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [Text('캐논 DSLR 100D (단렌즈,충전기 16기가SD 포함)'),Text('성동구 행당동 끌올 10분 전'),Text('210,000원'),
                  Container(
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.end,
                      children: [Icon(Icons.favorite),Text('4')],
                    ),
                  )],
              ),
            ),flex: 7)],
        ),
        ),
      )
    );
  }
}
