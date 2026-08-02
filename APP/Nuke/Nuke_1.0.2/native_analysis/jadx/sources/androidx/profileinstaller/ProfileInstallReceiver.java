package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import nuke.module.wechat.p002ai.AIChatConfig;
import p000.C0676s;
import p000.h80;
import p000.hh1;
import p000.p32;
import p000.p70;
import p000.pp0;
import p000.qp0;
import p000.r32;
import p000.sp0;
import p000.t11;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0161  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        FileInputStream fileInputStreamM3791a;
        h80[] h80VarArrM4235Q;
        h80[] h80VarArr;
        h80[] h80VarArr2;
        byte[] bArr;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        FileChannel channel;
        FileLock fileLockTryLock;
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream;
        p70 p70Var;
        FileInputStream fileInputStreamM3791a2;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (!"androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if (!"WRITE_SKIP_FILE".equals(string)) {
                        if ("DELETE_SKIP_FILE".equals(string)) {
                            new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                            Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                            setResultCode(11);
                            return;
                        }
                        return;
                    }
                    hh1 hh1Var = new hh1(6, this);
                    try {
                        pp0.m3928z(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        hh1Var.m2180C(10, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e) {
                        hh1Var.m2180C(7, e);
                        return;
                    }
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
                return;
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                hh1 hh1Var2 = new hh1(6, this);
                if (!"DROP_SHADER_CACHE".equals(string2)) {
                    hh1Var2.m2180C(16, null);
                    return;
                }
                if (sp0.m4965y(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    hh1Var2.m2180C(14, null);
                    return;
                } else {
                    hh1Var2.m2180C(15, null);
                    return;
                }
            }
        }
        p32 p32Var = new p32();
        hh1 hh1Var3 = new hh1(6, this);
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = qp0.f9073o;
            File file = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            p70 p70Var2 = new p70(assets, p32Var, hh1Var3, name, file);
            byte[] bArr3 = p70Var2.f8005b;
            if (bArr3 != null) {
                if (file.exists()) {
                    if (!file.canWrite()) {
                        p70Var2.m3792b(4, null);
                    }
                    p70Var2.f8008e = true;
                    try {
                        fileInputStreamM3791a = p70Var2.m3791a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        hh1Var3.m2180C(6, e2);
                        fileInputStreamM3791a = null;
                    } catch (IOException e3) {
                        hh1Var3.m2180C(7, e3);
                        fileInputStreamM3791a = null;
                    }
                    try {
                        if (fileInputStreamM3791a != null) {
                            try {
                            } catch (IOException e4) {
                                hh1Var3.m2180C(7, e4);
                                try {
                                    fileInputStreamM3791a.close();
                                } catch (IOException e5) {
                                    hh1Var3.m2180C(7, e5);
                                }
                                h80VarArrM4235Q = null;
                            } catch (IllegalStateException e6) {
                                hh1Var3.m2180C(8, e6);
                                fileInputStreamM3791a.close();
                                h80VarArrM4235Q = null;
                            }
                            if (!Arrays.equals(bArr2, t11.m5058J(fileInputStreamM3791a, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            h80VarArrM4235Q = qp0.m4235Q(fileInputStreamM3791a, t11.m5058J(fileInputStreamM3791a, 4), p70Var2.f8007d);
                            try {
                                fileInputStreamM3791a.close();
                            } catch (IOException e7) {
                                hh1Var3.m2180C(7, e7);
                            }
                            p70Var2.f8009f = h80VarArrM4235Q;
                        }
                        h80VarArr = p70Var2.f8009f;
                        if (h80VarArr != null && Build.VERSION.SDK_INT >= 31) {
                            try {
                                fileInputStreamM3791a2 = p70Var2.m3791a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e8) {
                                hh1Var3.m2180C(9, e8);
                            } catch (IOException e9) {
                                hh1Var3.m2180C(7, e9);
                            } catch (IllegalStateException e10) {
                                p70Var2.f8009f = null;
                                hh1Var3.m2180C(8, e10);
                            }
                            if (fileInputStreamM3791a2 == null) {
                                try {
                                    if (!Arrays.equals(qp0.f9074p, t11.m5058J(fileInputStreamM3791a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    p70Var2.f8009f = qp0.m4232N(fileInputStreamM3791a2, t11.m5058J(fileInputStreamM3791a2, 4), bArr3, h80VarArr);
                                    fileInputStreamM3791a2.close();
                                    p70Var = p70Var2;
                                    if (p70Var != null) {
                                        p70Var2 = p70Var;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM3791a2 != null) {
                                    fileInputStreamM3791a2.close();
                                }
                                p70Var = null;
                                if (p70Var != null) {
                                }
                            }
                        }
                        hh1 hh1Var4 = p70Var2.f8004a;
                        h80VarArr2 = p70Var2.f8009f;
                        byte[] bArr4 = p70Var2.f8005b;
                        if (h80VarArr2 != null && bArr4 != null) {
                            if (p70Var2.f8008e) {
                                C0676s.m4653l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e11) {
                                hh1Var4.m2180C(7, e11);
                            } catch (IllegalStateException e12) {
                                hh1Var4.m2180C(8, e12);
                            }
                            if (qp0.m4240V(byteArrayOutputStream, bArr4, h80VarArr2)) {
                                p70Var2.f8010g = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                p70Var2.f8009f = null;
                            } else {
                                hh1Var4.m2180C(5, null);
                                p70Var2.f8009f = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = p70Var2.f8010g;
                        if (bArr == null) {
                            try {
                                if (!p70Var2.f8008e) {
                                    C0676s.m4653l("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        fileOutputStream = new FileOutputStream(p70Var2.f8006c);
                                        try {
                                            channel = fileOutputStream.getChannel();
                                            try {
                                                fileLockTryLock = channel.tryLock();
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } catch (FileNotFoundException e13) {
                                    p70Var2.m3792b(6, e13);
                                    z = false;
                                } catch (IOException e14) {
                                    p70Var2.m3792b(7, e14);
                                    z = false;
                                }
                                if (fileLockTryLock != null) {
                                    try {
                                        if (fileLockTryLock.isValid()) {
                                            byte[] bArr5 = new byte[AIChatConfig.DefaultMaxTokens];
                                            while (true) {
                                                int i = byteArrayInputStream.read(bArr5);
                                                if (i <= 0) {
                                                    break;
                                                } else {
                                                    fileOutputStream.write(bArr5, 0, i);
                                                }
                                            }
                                            p70Var2.m3792b(1, null);
                                            fileLockTryLock.close();
                                            channel.close();
                                            fileOutputStream.close();
                                            byteArrayInputStream.close();
                                            p70Var2.f8010g = null;
                                            p70Var2.f8009f = null;
                                            z = true;
                                            if (z) {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } finally {
                                p70Var2.f8010g = null;
                                p70Var2.f8009f = null;
                            }
                        }
                        z = false;
                        if (z) {
                            pp0.m3928z(packageInfo, filesDir);
                        }
                    } finally {
                    }
                } else {
                    try {
                        if (!file.createNewFile()) {
                            p70Var2.m3792b(4, null);
                        }
                        p70Var2.f8008e = true;
                        fileInputStreamM3791a = p70Var2.m3791a(assets, "dexopt/baseline.prof");
                        if (fileInputStreamM3791a != null) {
                        }
                        h80VarArr = p70Var2.f8009f;
                        if (h80VarArr != null) {
                            fileInputStreamM3791a2 = p70Var2.m3791a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamM3791a2 == null) {
                            }
                        }
                        hh1 hh1Var42 = p70Var2.f8004a;
                        h80VarArr2 = p70Var2.f8009f;
                        byte[] bArr42 = p70Var2.f8005b;
                        if (h80VarArr2 != null) {
                            if (p70Var2.f8008e) {
                            }
                        }
                        bArr = p70Var2.f8010g;
                        if (bArr == null) {
                        }
                    } catch (IOException unused) {
                        p70Var2.m3792b(4, null);
                    }
                }
                r32.m4331c(context, z);
            }
            p70Var2.m3792b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z = false;
            r32.m4331c(context, z);
        } catch (PackageManager.NameNotFoundException e15) {
            hh1Var3.m2180C(7, e15);
            r32.m4331c(context, false);
        }
    }
}
