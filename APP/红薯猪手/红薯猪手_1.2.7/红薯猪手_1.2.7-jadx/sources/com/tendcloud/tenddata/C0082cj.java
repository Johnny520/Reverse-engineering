package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cj */
/* JADX INFO: loaded from: classes.dex */
public class C0082cj {

    /* JADX INFO: renamed from: b */
    private static String f381b;

    /* JADX INFO: renamed from: c */
    private static volatile C0082cj f382c = new C0082cj();

    /* JADX INFO: renamed from: a */
    private final LinkedBlockingQueue<IBinder> f383a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: d */
    private ServiceConnection f384d = new ServiceConnection() { // from class: com.tendcloud.tenddata.cj.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.cj.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C0082cj.this.f383a.size() > 0) {
                            C0082cj.this.f383a.clear();
                        }
                        C0082cj.this.f383a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cj$a */
    public static class a implements IInterface {
        private IBinder mIBinder;

        public a(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        public String getSerID(String str, String str2, String str3) {
            String string = null;
            try {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
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

    private C0082cj() {
    }

    /* JADX INFO: renamed from: a */
    private static String m415a(String str, Context context, a aVar) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        if (f381b == null) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Throwable unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (Throwable unused2) {
                }
            }
            f381b = string;
        }
        return aVar.getSerID(packageName, f381b, str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m417a(Context context) {
        PackageInfo packageInfo;
        try {
            if (C0069bx.m376d() && (packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0)) != null) {
                return packageInfo.versionCode >= 1;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m418b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (context.bindService(intent, this.f384d, 1)) {
                a aVar = new a(this.f383a.take());
                try {
                    C0105df.m491a().setOAID(m415a("OUID", context, aVar));
                } catch (Throwable unused) {
                }
                try {
                    C0105df.m491a().setVAID(m415a("DUID", context, aVar));
                } catch (Throwable unused2) {
                }
                try {
                    C0105df.m491a().setAAID(m415a("AUID", context, aVar));
                } catch (Throwable unused3) {
                }
                context.unbindService(this.f384d);
            }
        } catch (Throwable unused4) {
        }
    }

    public static void bindOPPOServiceGetOAID(Context context) {
        f382c.m418b(context);
    }
}
