package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.Executor;
import p000a.C0195Kc;
import p000a.C0589g5;
import p000a.C0889w1;

/* JADX INFO: renamed from: androidx.profileinstaller.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1150c {

    /* JADX INFO: renamed from: a */
    public static final a f4732a = new a();

    /* JADX INFO: renamed from: androidx.profileinstaller.c$a */
    public class a implements c {
        @Override // androidx.profileinstaller.C1150c.c
        /* JADX INFO: renamed from: a */
        public final void mo2617a(int i, Serializable serializable) {
        }

        @Override // androidx.profileinstaller.C1150c.c
        /* JADX INFO: renamed from: b */
        public final void mo2618b() {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$b */
    public class b implements c {
        @Override // androidx.profileinstaller.C1150c.c
        /* JADX INFO: renamed from: a */
        public final void mo2617a(int i, Serializable serializable) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) serializable);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.C1150c.c
        /* JADX INFO: renamed from: b */
        public final void mo2618b() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo2617a(int i, Serializable serializable);

        /* JADX INFO: renamed from: b */
        void mo2618b();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX INFO: renamed from: a */
    public static void m2624a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:170:0x0238 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:172:0x023a */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a9 A[FALL_THROUGH, PHI: r2
  0x01a9: PHI (r2v3 androidx.profileinstaller.b) = 
  (r2v2 androidx.profileinstaller.b)
  (r2v2 androidx.profileinstaller.b)
  (r2v2 androidx.profileinstaller.b)
  (r2v2 androidx.profileinstaller.b)
  (r2v4 androidx.profileinstaller.b)
 binds: [B:81:0x0148, B:83:0x014e, B:85:0x0151, B:116:0x01a6, B:117:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0287 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2625b(Context context, Executor executor, c cVar, boolean z) {
        boolean z2;
        FileInputStream fileInputStreamM2622a;
        C0589g5[] c0589g5ArrM539g;
        C0589g5[] c0589g5Arr;
        C0589g5[] c0589g5Arr2;
        byte[] bArr;
        ?? r7;
        boolean z3;
        ?? r72;
        boolean z4;
        byte[] bArr2;
        ?? byteArrayOutputStream;
        int i;
        C1149b c1149b;
        FileInputStream fileInputStreamM2622a2;
        ?? r73;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                cVar.mo2617a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                    if (z5) {
                    }
                } else {
                    z5 = false;
                    if (z5) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        C1151d.m2628c(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i2 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C1149b c1149b2 = new C1149b(assets, executor, cVar, name, file2);
            byte[] bArr3 = c1149b2.f4726c;
            if (bArr3 == null) {
                c1149b2.m2623b(3, Integer.valueOf(i2));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z2 = true;
                        c1149b2.m2623b(4, null);
                        z4 = false;
                        r73 = z2;
                    }
                } else if (!file2.canWrite()) {
                    c1149b2.m2623b(4, null);
                }
                c1149b2.f4729f = true;
                ?? r74 = C0195Kc.f660a;
                try {
                    fileInputStreamM2622a = c1149b2.m2622a(assets, "dexopt/baseline.prof");
                } catch (FileNotFoundException e) {
                    cVar.mo2617a(6, e);
                    fileInputStreamM2622a = null;
                } catch (IOException e2) {
                    cVar.mo2617a(7, e2);
                    fileInputStreamM2622a = null;
                }
                try {
                    try {
                    } catch (IOException e3) {
                        cVar.mo2617a(7, e3);
                    }
                    if (fileInputStreamM2622a != null) {
                        try {
                            try {
                            } catch (IllegalStateException e4) {
                                cVar.mo2617a(8, e4);
                                fileInputStreamM2622a.close();
                                c0589g5ArrM539g = null;
                                c1149b2.f4730g = c0589g5ArrM539g;
                                c0589g5Arr = c1149b2.f4730g;
                                if (c0589g5Arr != null) {
                                    switch (i) {
                                    }
                                }
                                c cVar2 = c1149b2.f4725b;
                                c0589g5Arr2 = c1149b2.f4730g;
                                if (c0589g5Arr2 != null) {
                                }
                                bArr = c1149b2.f4731h;
                                if (bArr != null) {
                                }
                                if (z3) {
                                }
                                z4 = z3;
                                r73 = r72;
                                C1151d.m2628c(context, (z4 && z) ? r73 : 0);
                            }
                        } catch (IOException e5) {
                            cVar.mo2617a(7, e5);
                            fileInputStreamM2622a.close();
                            c0589g5ArrM539g = null;
                            c1149b2.f4730g = c0589g5ArrM539g;
                            c0589g5Arr = c1149b2.f4730g;
                            if (c0589g5Arr != null) {
                            }
                            c cVar22 = c1149b2.f4725b;
                            c0589g5Arr2 = c1149b2.f4730g;
                            if (c0589g5Arr2 != null) {
                            }
                            bArr = c1149b2.f4731h;
                            if (bArr != null) {
                            }
                            if (z3) {
                            }
                            z4 = z3;
                            r73 = r72;
                            C1151d.m2628c(context, (z4 && z) ? r73 : 0);
                        }
                        if (!Arrays.equals((byte[]) r74, C0889w1.m2129P(fileInputStreamM2622a, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c0589g5ArrM539g = C0195Kc.m539g(fileInputStreamM2622a, C0889w1.m2129P(fileInputStreamM2622a, 4), c1149b2.f4728e);
                        try {
                            fileInputStreamM2622a.close();
                        } catch (IOException e6) {
                            cVar.mo2617a(7, e6);
                        }
                        c1149b2.f4730g = c0589g5ArrM539g;
                    }
                    c0589g5Arr = c1149b2.f4730g;
                    if (c0589g5Arr != null && (i = Build.VERSION.SDK_INT) <= 34) {
                        switch (i) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                                try {
                                    fileInputStreamM2622a2 = c1149b2.m2622a(assets, "dexopt/baseline.profm");
                                } catch (FileNotFoundException e7) {
                                    cVar.mo2617a(9, e7);
                                } catch (IOException e8) {
                                    cVar.mo2617a(7, e8);
                                } catch (IllegalStateException e9) {
                                    c1149b2.f4730g = null;
                                    cVar.mo2617a(8, e9);
                                }
                                if (fileInputStreamM2622a2 != null) {
                                    try {
                                        if (!Arrays.equals(C0195Kc.f661b, C0889w1.m2129P(fileInputStreamM2622a2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        c1149b2.f4730g = C0195Kc.m536d(fileInputStreamM2622a2, C0889w1.m2129P(fileInputStreamM2622a2, 4), bArr3, c0589g5Arr);
                                        fileInputStreamM2622a2.close();
                                        c1149b = c1149b2;
                                        if (c1149b != null) {
                                            c1149b2 = c1149b;
                                        }
                                    } finally {
                                    }
                                    break;
                                } else {
                                    if (fileInputStreamM2622a2 != null) {
                                        fileInputStreamM2622a2.close();
                                    }
                                    c1149b = null;
                                    if (c1149b != null) {
                                    }
                                }
                            default:
                                c cVar222 = c1149b2.f4725b;
                                c0589g5Arr2 = c1149b2.f4730g;
                                if (c0589g5Arr2 != null && (bArr2 = c1149b2.f4726c) != null) {
                                    if (c1149b2.f4729f) {
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(r74);
                                            byteArrayOutputStream.write(bArr2);
                                        } finally {
                                        }
                                    } catch (IOException e10) {
                                        cVar222.mo2617a(7, e10);
                                    } catch (IllegalStateException e11) {
                                        cVar222.mo2617a(8, e11);
                                    }
                                    if (C0195Kc.m541i(byteArrayOutputStream, bArr2, c0589g5Arr2)) {
                                        c1149b2.f4731h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        c1149b2.f4730g = null;
                                    } else {
                                        cVar222.mo2617a(5, null);
                                        c1149b2.f4730g = null;
                                        byteArrayOutputStream.close();
                                    }
                                }
                                bArr = c1149b2.f4731h;
                                if (bArr != null) {
                                    z3 = false;
                                    r72 = 1;
                                } else {
                                    try {
                                        if (!c1149b2.f4729f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(c1149b2.f4727d);
                                                    try {
                                                        try {
                                                            byte[] bArr4 = new byte[512];
                                                            while (true) {
                                                                int i3 = byteArrayInputStream.read(bArr4);
                                                                if (i3 > 0) {
                                                                    fileOutputStream.write(bArr4, 0, i3);
                                                                } else {
                                                                    r72 = 1;
                                                                    try {
                                                                        c1149b2.m2623b(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        c1149b2.f4731h = null;
                                                                        c1149b2.f4730g = null;
                                                                        z3 = true;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        Throwable th2 = th;
                                                                        try {
                                                                            fileOutputStream.close();
                                                                            throw th2;
                                                                        } catch (Throwable th3) {
                                                                            th2.addSuppressed(th3);
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            Throwable th5 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th5;
                                                            } catch (Throwable th6) {
                                                                th5.addSuppressed(th6);
                                                                throw th5;
                                                            }
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                }
                                            } catch (FileNotFoundException e12) {
                                                e = e12;
                                                r74 = 1;
                                                c1149b2.m2623b(6, e);
                                                r7 = r74;
                                                z3 = false;
                                                r72 = r7;
                                                if (z3) {
                                                }
                                                z4 = z3;
                                                r73 = r72;
                                                C1151d.m2628c(context, (z4 && z) ? r73 : 0);
                                            } catch (IOException e13) {
                                                e = e13;
                                                r74 = 1;
                                                c1149b2.m2623b(7, e);
                                                r7 = r74;
                                                z3 = false;
                                                r72 = r7;
                                                if (z3) {
                                                }
                                                z4 = z3;
                                                r73 = r72;
                                                C1151d.m2628c(context, (z4 && z) ? r73 : 0);
                                            }
                                        } catch (FileNotFoundException e14) {
                                            e = e14;
                                            c1149b2.m2623b(6, e);
                                            r7 = r74;
                                            z3 = false;
                                            r72 = r7;
                                            if (z3) {
                                            }
                                            z4 = z3;
                                            r73 = r72;
                                            C1151d.m2628c(context, (z4 && z) ? r73 : 0);
                                        } catch (IOException e15) {
                                            e = e15;
                                            c1149b2.m2623b(7, e);
                                            r7 = r74;
                                            z3 = false;
                                            r72 = r7;
                                            if (z3) {
                                            }
                                            z4 = z3;
                                            r73 = r72;
                                            C1151d.m2628c(context, (z4 && z) ? r73 : 0);
                                        }
                                    } finally {
                                        c1149b2.f4731h = null;
                                        c1149b2.f4730g = null;
                                    }
                                }
                                if (z3) {
                                    m2624a(packageInfo, filesDir);
                                }
                                z4 = z3;
                                r73 = r72;
                                C1151d.m2628c(context, (z4 && z) ? r73 : 0);
                        }
                    }
                    c cVar2222 = c1149b2.f4725b;
                    c0589g5Arr2 = c1149b2.f4730g;
                    if (c0589g5Arr2 != null) {
                        if (c1149b2.f4729f) {
                        }
                    }
                    bArr = c1149b2.f4731h;
                    if (bArr != null) {
                    }
                    if (z3) {
                    }
                    z4 = z3;
                    r73 = r72;
                    C1151d.m2628c(context, (z4 && z) ? r73 : 0);
                } finally {
                }
            }
            z2 = true;
            z4 = false;
            r73 = z2;
            C1151d.m2628c(context, (z4 && z) ? r73 : 0);
        } catch (PackageManager.NameNotFoundException e16) {
            cVar.mo2617a(7, e16);
            C1151d.m2628c(context, false);
        }
    }
}
