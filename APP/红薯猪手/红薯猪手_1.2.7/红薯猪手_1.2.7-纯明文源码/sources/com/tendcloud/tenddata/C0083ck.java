package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ck */
/* JADX INFO: loaded from: classes.dex */
public final class C0083ck {

    /* JADX INFO: renamed from: c */
    private static volatile C0083ck f385c = new C0083ck();

    /* JADX INFO: renamed from: b */
    private final LinkedBlockingQueue<IBinder> f387b = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: a */
    public ServiceConnection f386a = new ServiceConnection() { // from class: com.tendcloud.tenddata.ck.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.ck.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C0083ck.this.f387b.size() > 0) {
                            C0083ck.this.f387b.clear();
                        }
                        C0083ck.this.f387b.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: com.tendcloud.tenddata.ck$a */
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
            Parcel parcelObtain;
            Parcel parcelObtain2;
            String string = null;
            try {
                parcelObtain = Parcel.obtain();
                parcelObtain2 = Parcel.obtain();
            } catch (Throwable unused) {
            }
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.mIBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                } catch (Throwable unused2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
                return string;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    private C0083ck() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m420a(Context context) {
        try {
            if (!C0069bx.m379g()) {
                return false;
            }
            context.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m421b(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, this.f386a, 1)) {
            try {
                C0105df.m491a().setOAID(new a(this.f387b.take()).getOAID());
            } catch (Throwable unused) {
            }
            try {
                context.unbindService(this.f386a);
            } catch (Throwable unused2) {
            }
        }
    }

    public static void bindSECServiceGetOAID(Context context) {
        f385c.m421b(context);
    }
}
