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
import p000A.C0066i0;
import p042H1.AbstractC0638f;
import p042H1.AbstractC0641i;
import p042H1.C0634b;
import p042H1.C0635c;
import p042H1.ExecutorC0637e;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:194:0x0266 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0166  */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [H1.c[], byte[]] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [H1.c[], byte[]] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27 */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        FileInputStream fileInputStreamM1086a;
        C0635c[] c0635cArrM1100l;
        C0635c[] c0635cArr;
        C0635c[] c0635cArr2;
        byte[] bArr;
        ?? r32;
        ?? r33;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        FileChannel channel;
        FileLock fileLockTryLock;
        boolean z5;
        ByteArrayOutputStream byteArrayOutputStream;
        C0634b c0634b;
        FileInputStream fileInputStreamM1086a2;
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
                    C0066i0 c0066i0 = new C0066i0(6, this);
                    try {
                        AbstractC0638f.m1093e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        c0066i0.m71k(10, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e5) {
                        c0066i0.m71k(7, e5);
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
                C0066i0 c0066i02 = new C0066i0(6, this);
                if (!"DROP_SHADER_CACHE".equals(string2)) {
                    c0066i02.m71k(16, null);
                    return;
                }
                if (AbstractC0638f.m1091c(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    c0066i02.m71k(14, null);
                    return;
                } else {
                    c0066i02.m71k(15, null);
                    return;
                }
            }
        }
        ExecutorC0637e executorC0637e = new ExecutorC0637e();
        C0066i0 c0066i03 = new C0066i0(6, this);
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = AbstractC0638f.f2027a;
            File file = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0634b c0634b2 = new C0634b(assets, executorC0637e, c0066i03, name, file);
            byte[] bArr3 = c0634b2.f2012b;
            if (bArr3 != null) {
                if (file.exists()) {
                    if (!file.canWrite()) {
                        c0634b2.m1087b(4, null);
                    }
                    c0634b2.f2015e = true;
                    try {
                        fileInputStreamM1086a = c0634b2.m1086a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e6) {
                        c0066i03.m71k(6, e6);
                        fileInputStreamM1086a = null;
                    } catch (IOException e7) {
                        c0066i03.m71k(7, e7);
                        fileInputStreamM1086a = null;
                    }
                    try {
                        if (fileInputStreamM1086a != null) {
                            try {
                            } catch (IOException e8) {
                                c0066i03.m71k(7, e8);
                                try {
                                    fileInputStreamM1086a.close();
                                } catch (IOException e9) {
                                    c0066i03.m71k(7, e9);
                                }
                                c0635cArrM1100l = null;
                            } catch (IllegalStateException e10) {
                                c0066i03.m71k(8, e10);
                                fileInputStreamM1086a.close();
                                c0635cArrM1100l = null;
                            }
                            if (!Arrays.equals(bArr2, AbstractC0638f.m1094f(fileInputStreamM1086a, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c0635cArrM1100l = AbstractC0638f.m1100l(fileInputStreamM1086a, AbstractC0638f.m1094f(fileInputStreamM1086a, 4), c0634b2.f2014d);
                            try {
                                fileInputStreamM1086a.close();
                            } catch (IOException e11) {
                                c0066i03.m71k(7, e11);
                            }
                            c0634b2.f2016f = c0635cArrM1100l;
                        }
                        c0635cArr = c0634b2.f2016f;
                        if (c0635cArr != null && Build.VERSION.SDK_INT >= 31) {
                            try {
                                fileInputStreamM1086a2 = c0634b2.m1086a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e12) {
                                c0066i03.m71k(9, e12);
                            } catch (IOException e13) {
                                c0066i03.m71k(7, e13);
                            } catch (IllegalStateException e14) {
                                c0634b2.f2016f = null;
                                c0066i03.m71k(8, e14);
                            }
                            if (fileInputStreamM1086a2 == null) {
                                try {
                                    if (!Arrays.equals(AbstractC0638f.f2028b, AbstractC0638f.m1094f(fileInputStreamM1086a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c0634b2.f2016f = AbstractC0638f.m1097i(fileInputStreamM1086a2, AbstractC0638f.m1094f(fileInputStreamM1086a2, 4), bArr3, c0635cArr);
                                    fileInputStreamM1086a2.close();
                                    c0634b = c0634b2;
                                    if (c0634b != null) {
                                        c0634b2 = c0634b;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM1086a2 != null) {
                                    fileInputStreamM1086a2.close();
                                }
                                c0634b = null;
                                if (c0634b != null) {
                                }
                            }
                        }
                        C0066i0 c0066i04 = c0634b2.f2011a;
                        c0635cArr2 = c0634b2.f2016f;
                        byte[] bArr4 = c0634b2.f2012b;
                        if (c0635cArr2 != null && bArr4 != null) {
                            if (c0634b2.f2015e) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e15) {
                                c0066i04.m71k(7, e15);
                            } catch (IllegalStateException e16) {
                                c0066i04.m71k(8, e16);
                            }
                            if (AbstractC0638f.m1103o(byteArrayOutputStream, bArr4, c0635cArr2)) {
                                c0634b2.f2017g = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                c0634b2.f2016f = null;
                            } else {
                                c0066i04.m71k(5, null);
                                c0634b2.f2016f = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = c0634b2.f2017g;
                        if (bArr == null) {
                            try {
                                if (!c0634b2.f2015e) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        fileOutputStream = new FileOutputStream(c0634b2.f2013c);
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
                                } catch (FileNotFoundException e17) {
                                    r32 = 0;
                                    r33 = 0;
                                    try {
                                        c0634b2.m1087b(6, e17);
                                        c0634b2.f2017g = r33;
                                        c0634b2.f2016f = r33;
                                        z5 = false;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (IOException e18) {
                                    c0634b2.m1087b(7, e18);
                                    r33 = 0;
                                    c0634b2.f2017g = r33;
                                    c0634b2.f2016f = r33;
                                    z5 = false;
                                }
                                if (fileLockTryLock != null) {
                                    try {
                                        if (fileLockTryLock.isValid()) {
                                            byte[] bArr5 = new byte[512];
                                            while (true) {
                                                int i5 = byteArrayInputStream.read(bArr5);
                                                if (i5 <= 0) {
                                                    break;
                                                } else {
                                                    fileOutputStream.write(bArr5, 0, i5);
                                                }
                                            }
                                            c0634b2.m1087b(1, null);
                                            fileLockTryLock.close();
                                            channel.close();
                                            fileOutputStream.close();
                                            byteArrayInputStream.close();
                                            c0634b2.f2017g = null;
                                            c0634b2.f2016f = null;
                                            z5 = true;
                                            if (z5) {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } catch (Throwable th2) {
                                th = th2;
                                r32 = 0;
                            }
                            c0634b2.f2017g = r32;
                            c0634b2.f2016f = r32;
                            throw th;
                        }
                        z5 = false;
                        if (z5) {
                            AbstractC0638f.m1093e(packageInfo, filesDir);
                        }
                    } finally {
                    }
                } else {
                    try {
                        if (!file.createNewFile()) {
                            c0634b2.m1087b(4, null);
                        }
                        c0634b2.f2015e = true;
                        fileInputStreamM1086a = c0634b2.m1086a(assets, "dexopt/baseline.prof");
                        if (fileInputStreamM1086a != null) {
                        }
                        c0635cArr = c0634b2.f2016f;
                        if (c0635cArr != null) {
                            fileInputStreamM1086a2 = c0634b2.m1086a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamM1086a2 == null) {
                            }
                        }
                        C0066i0 c0066i042 = c0634b2.f2011a;
                        c0635cArr2 = c0634b2.f2016f;
                        byte[] bArr42 = c0634b2.f2012b;
                        if (c0635cArr2 != null) {
                            if (c0634b2.f2015e) {
                            }
                        }
                        bArr = c0634b2.f2017g;
                        if (bArr == null) {
                        }
                    } catch (IOException unused) {
                        c0634b2.m1087b(4, null);
                    }
                }
                AbstractC0641i.m1115c(context, z5);
            }
            c0634b2.m1087b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z5 = false;
            AbstractC0641i.m1115c(context, z5);
        } catch (PackageManager.NameNotFoundException e19) {
            c0066i03.m71k(7, e19);
            AbstractC0641i.m1115c(context, false);
        }
    }
}
