package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bz */
/* JADX INFO: loaded from: classes.dex */
public class C0071bz {

    /* JADX INFO: renamed from: b */
    private static volatile C0071bz f359b = new C0071bz();

    /* JADX INFO: renamed from: a */
    private final LinkedBlockingQueue<IBinder> f360a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: c */
    private ServiceConnection f361c = new ServiceConnection() { // from class: com.tendcloud.tenddata.bz.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.bz.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C0071bz.this.f360a.size() > 0) {
                            C0071bz.this.f360a.clear();
                        }
                        C0071bz.this.f360a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bz$a */
    public static class a implements IInterface {
        private IBinder mIBinder;

        public a(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        public String getOAID() {
            String string = null;
            try {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.mIBinder.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                } catch (Throwable unused) {
                }
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable unused2) {
            }
            return string;
        }
    }

    private C0071bz() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m386a(Context context) {
        try {
            return C0069bx.m382j();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m387b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.asus.msa.action.ACCESS_DID");
            intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
            if (context.bindService(intent, this.f361c, 1)) {
                try {
                    C0105df.m491a().setOAID(new a(this.f360a.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f361c);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void bindASUSServiceGetOAID(Context context) {
        f359b.m387b(context);
    }
}
