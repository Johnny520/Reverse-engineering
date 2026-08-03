package com.tendcloud.tenddata;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.tendcloud.tenddata.InterfaceC0070by;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ch */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC0080ch extends IInterface {

    /* JADX INFO: renamed from: com.tendcloud.tenddata.ch$a */
    public static abstract class a extends Binder implements InterfaceC0080ch {

        /* JADX INFO: renamed from: c */
        public static final int f375c = 0;

        /* JADX INFO: renamed from: com.tendcloud.tenddata.ch$a$a, reason: collision with other inner class name */
        public static class C0489a implements InterfaceC0080ch {

            /* JADX INFO: renamed from: a */
            public IBinder f376a;

            public C0489a(IBinder iBinder) {
                this.f376a = iBinder;
            }

            @Override // com.tendcloud.tenddata.InterfaceC0080ch
            /* JADX INFO: renamed from: a */
            public void mo409a(InterfaceC0070by interfaceC0070by) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                        parcelObtain.writeStrongBinder(interfaceC0070by != null ? (InterfaceC0070by.a) interfaceC0070by : null);
                        this.f376a.transact(3, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f376a;
            }

            @Override // com.tendcloud.tenddata.InterfaceC0080ch
            /* JADX INFO: renamed from: b */
            public void mo410b(InterfaceC0070by interfaceC0070by) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                        parcelObtain.writeStrongBinder(interfaceC0070by != null ? (InterfaceC0070by.a) interfaceC0070by : null);
                        this.f376a.transact(2, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo409a(InterfaceC0070by interfaceC0070by);

    /* JADX INFO: renamed from: b */
    void mo410b(InterfaceC0070by interfaceC0070by);
}
