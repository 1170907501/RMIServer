package com.zzh.RMIServer.entry;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.zzh.RMIServer.bean.Account;
import com.zzh.RMIServer.stub.IUserManager;

public class UserManagerImpl extends UnicastRemoteObject implements IUserManager{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected UserManagerImpl() throws RemoteException {
		super();
	}

	@Override
	public String getUserName() throws RemoteException {
		return "zzh";
	}

	@Override
	public Account getAdminAccount() throws RemoteException {
		Account account = new Account();
		account.setUserName("zzh");
		account.setPassword("123456");
		return account;
	}

}
