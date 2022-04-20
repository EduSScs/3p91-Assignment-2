//Create 4 different sockets and connect them to the server 
//Create a thread for each socket and start it
//Create a thread for the server and start it
Socket socket1 = new Socket("localhost", 1234);
Socket socket2 = new Socket("localhost", 2345);
Socket socket3 = new Socket("localhost", 3456);
Socket socket4 = new Socket("localhost", 4567);

Thread thread1 = new Thread (new Client(socket1));
Thread thread2 = new Thread (new Client(socket2));
Thread thread3 = new Thread (new Client(socket3));
Thread thread4 = new Thread (new Client(socket4));

thread1.start();
thread2.start();
thread3.start();
thread4.start();