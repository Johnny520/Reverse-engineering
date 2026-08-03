package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ca */
/* JADX INFO: loaded from: classes.dex */
public final class C0073ca {

    /* JADX INFO: renamed from: c */
    private static volatile C0073ca f362c = new C0073ca();

    /* JADX INFO: renamed from: b */
    private final LinkedBlockingQueue<IBinder> f364b = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: a */
    public ServiceConnection f363a = new ServiceConnection() { // from class: com.tendcloud.tenddata.ca.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.ca.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C0073ca.this.f364b.size() > 0) {
                            C0073ca.this.f364b.clear();
                        }
                        C0073ca.this.f364b.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: com.tendcloud.tenddata.ca$a */
    public static final class a implements IInterface {
        private IBinder iBinder;

        private a(IBinder iBinder) {
            this.iBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.iBinder;
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
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                } catch (Throwable unused2) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
                return string;
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }
    }

    private C0073ca() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m394a(Context context) {
        try {
            if (C0069bx.m374b() || C0069bx.m375c()) {
                return !TextUtils.isEmpty(m397b(context));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m395a(Context context, String str) {
        return m396b(context, str) != null;
    }

    /* JADX INFO: renamed from: b */
    private static PackageInfo m396b(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getPackageInfo(str, 128);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m397b(Context context) {
        return m395a(context, "com.huawei.hwid") ? "com.huawei.hwid" : m395a(context, "com.huawei.hms") ? "com.huawei.hms" : m395a(context, "com.huawei.hwid.tv") ? "com.huawei.hwid.tv" : "com.huawei.hwid";
    }

    public static void bindHWServiceGetOAID(Context context) {
        f362c.m398c(context);
    }

    /* JADX INFO: renamed from: c */
    private void m398c(Context context) {
        try {
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(m397b(context));
            if (context.bindService(intent, this.f363a, 1)) {
                try {
                    C0105df.m491a().setOAID(new a(this.f364b.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f363a);
            }
        } catch (Throwable unused2) {
        }
    }
}
