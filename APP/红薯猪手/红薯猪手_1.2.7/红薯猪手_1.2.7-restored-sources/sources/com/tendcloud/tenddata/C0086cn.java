package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.reflect.Constructor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cn */
/* JADX INFO: loaded from: classes.dex */
public class C0086cn {

    /* JADX INFO: renamed from: b */
    private static final String f388b = "android.app.ZteDeviceIdentifyManager";

    /* JADX INFO: renamed from: c */
    private static String f389c = "com.mdid.msa";

    /* JADX INFO: renamed from: d */
    private static volatile C0086cn f390d = new C0086cn();

    /* JADX INFO: renamed from: a */
    private final LinkedBlockingQueue<IBinder> f391a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: e */
    private ServiceConnection f392e = new ServiceConnection() { // from class: com.tendcloud.tenddata.cn.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.cn.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C0086cn.this.f391a.size() > 0) {
                            C0086cn.this.f391a.clear();
                        }
                        C0086cn.this.f391a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cn$a */
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
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
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

    private C0086cn() {
    }

    /* JADX INFO: renamed from: a */
    private static void m427a(String str, Context context) {
        Intent intent = new Intent();
        intent.setClassName(f389c, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m428a(Context context) {
        try {
            if (!C0069bx.m380h()) {
                return false;
            }
            if (Build.VERSION.SDK_INT > 29) {
                return true;
            }
            context.getPackageManager().getPackageInfo(f389c, 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m429b(Context context) {
        try {
            Class<?> cls = Class.forName(f388b);
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(Context.class);
            if (declaredConstructor != null) {
                C0105df.m491a().setOAID((String) cls.getDeclaredMethod("getOAID", Context.class).invoke(declaredConstructor.newInstance(context), context));
            }
        } catch (Throwable unused) {
        }
    }

    public static void bindZTEServiceGetOAID(Context context) {
        if (Build.VERSION.SDK_INT <= 29) {
            f390d.m430c(context);
        } else {
            m429b(context);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m430c(Context context) {
        try {
            String packageName = context.getPackageName();
            m427a(packageName, context);
            Intent intent = new Intent();
            intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
            intent.setAction("com.bun.msa.action.bindto.service");
            intent.putExtra("com.bun.msa.param.pkgname", packageName);
            if (context.bindService(intent, this.f392e, 1)) {
                try {
                    C0105df.m491a().setOAID(new a(this.f391a.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f392e);
            }
        } catch (Throwable unused2) {
        }
    }
}
