package com.zzh.RMIServer.entry;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.zzh.RMIServer.stub.IUserManager;

public class Entry {

	public static void main(String[] args)throws AlreadyBoundException, RemoteException, MalformedURLException{
		IUserManager userManager = new UserManagerImpl();
		Registry registry = LocateRegistry.createRegistry(2019);
		registry.rebind("userManager", userManager);
		//通过Naming绑定 rmi服务报错,需要查查为何报错
		//Naming.rebind("rmi://127.0.0.1/userManager", userManager);
		System.out.println("server is ready");
	}
}
