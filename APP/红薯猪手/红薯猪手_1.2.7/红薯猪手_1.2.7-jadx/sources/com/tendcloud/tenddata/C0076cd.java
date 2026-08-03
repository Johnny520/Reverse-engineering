package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cd */
/* JADX INFO: loaded from: classes.dex */
public class C0076cd {

    /* JADX INFO: renamed from: b */
    private static volatile C0076cd f372b = new C0076cd();

    /* JADX INFO: renamed from: a */
    private final LinkedBlockingQueue<IBinder> f373a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: c */
    private ServiceConnection f374c = new ServiceConnection() { // from class: com.tendcloud.tenddata.cd.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.cd.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C0076cd.this.f373a.size() > 0) {
                            C0076cd.this.f373a.clear();
                        }
                        C0076cd.this.f373a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cd$a */
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
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.mIBinder.transact(1, parcelObtain, parcelObtain2, 0);
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

    private C0076cd() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m404a(Context context) {
        try {
            if (!C0069bx.m383k()) {
                return false;
            }
            context.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m405b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (context.bindService(intent, this.f374c, 1)) {
                try {
                    C0105df.m491a().setOAID(new a(this.f373a.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f374c);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void bindLENOVOServiceGetOAID(Context context) {
        f372b.m405b(context);
    }
}
