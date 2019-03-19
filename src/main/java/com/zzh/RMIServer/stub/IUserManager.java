package com.zzh.RMIServer.stub;
import java.rmi.Remote;
import java.rmi.RemoteException;

import com.zzh.RMIServer.bean.Account;

public interface IUserManager extends Remote{

	public String getUserName() throws RemoteException;
	public Account getAdminAccount() throws RemoteException;
}
