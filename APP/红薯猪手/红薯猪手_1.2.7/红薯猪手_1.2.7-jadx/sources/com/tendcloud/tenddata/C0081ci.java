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

/* JADX INFO: renamed from: com.tendcloud.tenddata.ci */
/* JADX INFO: loaded from: classes.dex */
public class C0081ci {

    /* JADX INFO: renamed from: b */
    private static String f377b;

    /* JADX INFO: renamed from: c */
    private static volatile C0081ci f378c = new C0081ci();

    /* JADX INFO: renamed from: a */
    private final LinkedBlockingQueue<IBinder> f379a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: d */
    private ServiceConnection f380d = new ServiceConnection() { // from class: com.tendcloud.tenddata.ci.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.ci.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C0081ci.this.f379a.size() > 0) {
                            C0081ci.this.f379a.clear();
                        }
                        C0081ci.this.f379a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: com.tendcloud.tenddata.ci$a */
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

    private C0081ci() {
    }

    /* JADX INFO: renamed from: a */
    private static String m411a(String str, Context context, a aVar) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        if (f377b == null) {
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
            f377b = string;
        }
        return aVar.getSerID(packageName, f377b, str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m413a(Context context) {
        PackageInfo packageInfo;
        try {
            if (C0069bx.m377e() && (packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0)) != null) {
                return packageInfo.versionCode >= 1;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m414b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (context.bindService(intent, this.f380d, 1)) {
                a aVar = new a(this.f379a.take());
                try {
                    C0105df.m491a().setOAID(m411a("OUID", context, aVar));
                } catch (Throwable unused) {
                }
                try {
                    C0105df.m491a().setVAID(m411a("DUID", context, aVar));
                } catch (Throwable unused2) {
                }
                try {
                    C0105df.m491a().setAAID(m411a("AUID", context, aVar));
                } catch (Throwable unused3) {
                }
                context.unbindService(this.f380d);
            }
        } catch (Throwable unused4) {
        }
    }

    public static void bindONEPLUSServiceGetOAID(Context context) {
        f378c.m414b(context);
    }
}
