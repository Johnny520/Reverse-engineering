package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.client.plugins.api.C4718;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3272 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4718 f7452 = new C4718(11);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f7451 = {112, 114, 111, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f7450 = {112, 114, 109, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f7449 = {48, 49, 53, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f7448 = {48, 49, 48, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final byte[] f7447 = {48, 48, 57, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final byte[] f7454 = {48, 48, 53, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final byte[] f7453 = {48, 48, 49, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final byte[] f7455 = {48, 48, 49, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final byte[] f7456 = {48, 48, 50, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static byte[] m5098(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C6755.m11870(AbstractC7012.m12147(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m5099(PackageInfo packageInfo, File file) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m5100(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f7453;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f7454;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC0900.m711(AbstractC0900.m700(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m5101(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m5101(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static byte[] m5102(C3276[] c3276Arr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C3276 c3276 : c3276Arr) {
            length += ((((c3276.f7464 * 2) + 7) & (-8)) / 8) + (c3276.f7458 * 2) + m5100(c3276.f7462, c3276.f7461, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c3276.f7457;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f7447)) {
            int length2 = c3276Arr.length;
            while (i < length2) {
                C3276 c32762 = c3276Arr[i];
                m5110(byteArrayOutputStream, c32762, m5100(c32762.f7462, c32762.f7461, bArr));
                m5113(byteArrayOutputStream, c32762);
                i++;
            }
        } else {
            for (C3276 c32763 : c3276Arr) {
                m5110(byteArrayOutputStream, c32763, m5100(c32763.f7462, c32763.f7461, bArr));
            }
            int length3 = c3276Arr.length;
            while (i < length3) {
                m5113(byteArrayOutputStream, c3276Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static byte[] m5103(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5104(Context context, Executor executor, InterfaceC3273 interfaceC3273, boolean z) {
        boolean z2;
        ?? M5152;
        C3276[] c3276ArrM5117;
        C3276[] c3276Arr;
        C3276[] c3276Arr2;
        byte[] bArr;
        ?? r7;
        boolean z3;
        Throwable th;
        Throwable th2;
        ?? r72;
        boolean z4;
        ?? byteArrayOutputStream;
        ?? r73;
        C3277 c3277;
        ?? r74;
        FileInputStream fileInputStreamM5152;
        ?? r75;
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
                                interfaceC3273.mo4729(2, null);
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
                        AbstractC3282.m5157(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C3277 c32772 = new C3277(assets, executor, interfaceC3273, name, file2);
            byte[] bArr2 = (byte[]) c32772.f7468;
            if (bArr2 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c32772.m5151(4, null);
                    }
                    c32772.f7471 = true;
                    try {
                        M5152 = c32772.m5152(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        interfaceC3273.mo4729(6, e);
                        M5152 = 0;
                    } catch (IOException e2) {
                        interfaceC3273.mo4729(7, e2);
                        M5152 = 0;
                    }
                    byte[] bArr3 = f7451;
                    try {
                        if (M5152 != 0) {
                            try {
                                try {
                                } catch (IOException e3) {
                                    interfaceC3273.mo4729(7, e3);
                                    try {
                                        M5152.close();
                                    } catch (IOException e4) {
                                        interfaceC3273.mo4729(7, e4);
                                    }
                                    c3276ArrM5117 = null;
                                    c32772.f7472 = c3276ArrM5117;
                                    c3276Arr = (C3276[]) c32772.f7472;
                                    if (c3276Arr != null) {
                                    }
                                    InterfaceC3273 interfaceC32732 = (InterfaceC3273) c32772.f7469;
                                    c3276Arr2 = (C3276[]) c32772.f7472;
                                    byte[] bArr4 = (byte[]) c32772.f7468;
                                    ?? r76 = M5152;
                                    r76 = M5152;
                                    if (c3276Arr2 != null) {
                                    }
                                    bArr = (byte[]) c32772.f7467;
                                    if (bArr != null) {
                                    }
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    AbstractC3282.m5157(context, (z4 || !z) ? 0 : r75);
                                }
                            } catch (IllegalStateException e5) {
                                interfaceC3273.mo4729(8, e5);
                                M5152.close();
                                c3276ArrM5117 = null;
                                c32772.f7472 = c3276ArrM5117;
                                c3276Arr = (C3276[]) c32772.f7472;
                                if (c3276Arr != null) {
                                }
                                InterfaceC3273 interfaceC327322 = (InterfaceC3273) c32772.f7469;
                                c3276Arr2 = (C3276[]) c32772.f7472;
                                byte[] bArr42 = (byte[]) c32772.f7468;
                                ?? r762 = M5152;
                                r762 = M5152;
                                if (c3276Arr2 != null) {
                                }
                                bArr = (byte[]) c32772.f7467;
                                if (bArr != null) {
                                }
                                if (z3) {
                                }
                                z4 = z3;
                                r75 = r72;
                                AbstractC3282.m5157(context, (z4 || !z) ? 0 : r75);
                            }
                            if (!Arrays.equals(bArr3, m5098(M5152, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c3276ArrM5117 = m5117(M5152, m5098(M5152, 4), (String) c32772.f7473);
                            try {
                                M5152.close();
                            } catch (IOException e6) {
                                interfaceC3273.mo4729(7, e6);
                            }
                            c32772.f7472 = c3276ArrM5117;
                        }
                        c3276Arr = (C3276[]) c32772.f7472;
                        if (c3276Arr != null && (M5152 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                M5152 = "dexopt/baseline.profm";
                                fileInputStreamM5152 = c32772.m5152(assets, "dexopt/baseline.profm");
                                r74 = M5152;
                            } catch (FileNotFoundException e7) {
                                interfaceC3273.mo4729(9, e7);
                                r74 = M5152;
                                c3277 = null;
                                M5152 = r74;
                            } catch (IOException e8) {
                                interfaceC3273.mo4729(7, e8);
                                r74 = M5152;
                                c3277 = null;
                                M5152 = r74;
                            } catch (IllegalStateException e9) {
                                c32772.f7472 = null;
                                interfaceC3273.mo4729(8, e9);
                                r74 = M5152;
                                c3277 = null;
                                M5152 = r74;
                            }
                            if (fileInputStreamM5152 == null) {
                                try {
                                    if (!Arrays.equals(f7450, m5098(fileInputStreamM5152, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrM5098 = m5098(fileInputStreamM5152, 4);
                                    c32772.f7472 = m5118(fileInputStreamM5152, bArrM5098, bArr2, c3276Arr);
                                    fileInputStreamM5152.close();
                                    c3277 = c32772;
                                    M5152 = bArrM5098;
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM5152 != null) {
                                    fileInputStreamM5152.close();
                                    r74 = M5152;
                                }
                                c3277 = null;
                                M5152 = r74;
                            }
                            if (c3277 != null) {
                                c32772 = c3277;
                            }
                        }
                        InterfaceC3273 interfaceC3273222 = (InterfaceC3273) c32772.f7469;
                        c3276Arr2 = (C3276[]) c32772.f7472;
                        byte[] bArr422 = (byte[]) c32772.f7468;
                        ?? r7622 = M5152;
                        r7622 = M5152;
                        if (c3276Arr2 != null && bArr422 != null) {
                            byteArrayOutputStream = c32772.f7471;
                            if (byteArrayOutputStream != 0) {
                                C6755.m11870("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr3);
                                    byteArrayOutputStream.write(bArr422);
                                } finally {
                                }
                            } catch (IOException e10) {
                                interfaceC3273222.mo4729(7, e10);
                                r73 = byteArrayOutputStream;
                            } catch (IllegalStateException e11) {
                                interfaceC3273222.mo4729(8, e11);
                                r73 = byteArrayOutputStream;
                            }
                            if (m5112(byteArrayOutputStream, bArr422, c3276Arr2)) {
                                c32772.f7467 = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                r73 = byteArrayOutputStream;
                                c32772.f7472 = null;
                                r7622 = r73;
                            } else {
                                interfaceC3273222.mo4729(5, null);
                                c32772.f7472 = null;
                                byteArrayOutputStream.close();
                                r7622 = byteArrayOutputStream;
                            }
                        }
                        bArr = (byte[]) c32772.f7467;
                        if (bArr != null) {
                            z3 = false;
                            r72 = 1;
                        } else {
                            try {
                                if (!c32772.f7471) {
                                    C6755.m11870("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) c32772.f7466);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i = byteArrayInputStream.read(bArr5);
                                                                                    if (i <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i);
                                                                                    }
                                                                                }
                                                                                r72 = 1;
                                                                                c32772.m5151(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c32772.f7467 = null;
                                                                                c32772.f7472 = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                    th2 = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th2;
                                                                    } catch (Throwable th9) {
                                                                        th2.addSuppressed(th9);
                                                                        throw th2;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                        }
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        th2 = th;
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        c32772.m5151(6, e);
                                        r7 = r7622;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        AbstractC3282.m5157(context, (z4 || !z) ? 0 : r75);
                                    } catch (IOException e13) {
                                        e = e13;
                                        c32772.m5151(7, e);
                                        r7 = r7622;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        AbstractC3282.m5157(context, (z4 || !z) ? 0 : r75);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    r7622 = 1;
                                    c32772.m5151(6, e);
                                    r7 = r7622;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    AbstractC3282.m5157(context, (z4 || !z) ? 0 : r75);
                                } catch (IOException e15) {
                                    e = e15;
                                    r7622 = 1;
                                    c32772.m5151(7, e);
                                    r7 = r7622;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    AbstractC3282.m5157(context, (z4 || !z) ? 0 : r75);
                                }
                            } finally {
                                c32772.f7467 = null;
                                c32772.f7472 = null;
                            }
                        }
                        if (z3) {
                            m5099(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r75 = r72;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c32772.m5151(4, null);
                        }
                        c32772.f7471 = true;
                        M5152 = c32772.m5152(assets, "dexopt/baseline.prof");
                        byte[] bArr32 = f7451;
                        if (M5152 != 0) {
                        }
                        c3276Arr = (C3276[]) c32772.f7472;
                        if (c3276Arr != null) {
                            M5152 = "dexopt/baseline.profm";
                            fileInputStreamM5152 = c32772.m5152(assets, "dexopt/baseline.profm");
                            r74 = M5152;
                            if (fileInputStreamM5152 == null) {
                            }
                            if (c3277 != null) {
                            }
                        }
                        InterfaceC3273 interfaceC32732222 = (InterfaceC3273) c32772.f7469;
                        c3276Arr2 = (C3276[]) c32772.f7472;
                        byte[] bArr4222 = (byte[]) c32772.f7468;
                        ?? r76222 = M5152;
                        r76222 = M5152;
                        if (c3276Arr2 != null) {
                            byteArrayOutputStream = c32772.f7471;
                            if (byteArrayOutputStream != 0) {
                            }
                        }
                        bArr = (byte[]) c32772.f7467;
                        if (bArr != null) {
                        }
                        if (z3) {
                        }
                        z4 = z3;
                        r75 = r72;
                    } catch (IOException unused2) {
                        z2 = true;
                        c32772.m5151(4, null);
                    }
                }
                AbstractC3282.m5157(context, (z4 || !z) ? 0 : r75);
            }
            c32772.m5151(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r75 = z2;
            AbstractC3282.m5157(context, (z4 || !z) ? 0 : r75);
        } catch (PackageManager.NameNotFoundException e16) {
            interfaceC3273.mo4729(7, e16);
            AbstractC3282.m5157(context, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m5105(ByteArrayOutputStream byteArrayOutputStream, C3276 c3276) throws IOException {
        int i = 0;
        for (Map.Entry entry : c3276.f7465.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m5107(byteArrayOutputStream, iIntValue - i);
                m5107(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m5106(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m5107(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m5106(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C3276[] m5108(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C3276[0];
        }
        C3276[] c3276Arr = new C3276[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM5109 = (int) m5109(byteArrayInputStream, 2);
            int iM51092 = (int) m5109(byteArrayInputStream, 2);
            c3276Arr[i3] = new C3276(str, new String(m5098(byteArrayInputStream, iM5109), StandardCharsets.UTF_8), m5109(byteArrayInputStream, 4), iM51092, (int) m5109(byteArrayInputStream, 4), (int) m5109(byteArrayInputStream, 4), new int[iM51092], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C3276 c3276 = c3276Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c3276.f7457;
            int i6 = c3276.f7464;
            TreeMap treeMap = c3276.f7465;
            int i7 = iAvailable - i5;
            int iM51093 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM51093 += (int) m5109(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM51093), 1);
                int iM51094 = (int) m5109(byteArrayInputStream, 2);
                while (iM51094 > 0) {
                    m5109(byteArrayInputStream, 2);
                    int iM51095 = (int) m5109(byteArrayInputStream, 1);
                    if (iM51095 != 6 && iM51095 != 7) {
                        while (iM51095 > 0) {
                            m5109(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM51096 = (int) m5109(byteArrayInputStream, 1); iM51096 > 0; iM51096--) {
                                m5109(byteArrayInputStream, 2);
                            }
                            iM51095--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM51094--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                C6755.m11870("Read too much data during profile line parse");
                return null;
            }
            c3276.f7463 = m5115(byteArrayInputStream, c3276.f7458);
            BitSet bitSetValueOf = BitSet.valueOf(m5098(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c3276Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static long m5109(InputStream inputStream, int i) throws IOException {
        byte[] bArrM5098 = m5098(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM5098[i2] & DefaultClassResolver.NAME)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m5110(ByteArrayOutputStream byteArrayOutputStream, C3276 c3276, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m5107(byteArrayOutputStream, str.getBytes(charset).length);
        m5107(byteArrayOutputStream, c3276.f7458);
        m5106(byteArrayOutputStream, c3276.f7457, 4);
        m5106(byteArrayOutputStream, c3276.f7460, 4);
        m5106(byteArrayOutputStream, c3276.f7464, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m5111(ByteArrayOutputStream byteArrayOutputStream, int i, C3276 c3276) throws IOException {
        int i2 = c3276.f7464;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c3276.f7465.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m5112(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C3276[] c3276Arr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f7449;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f7448;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM5102 = m5102(c3276Arr, bArr3);
                m5106(byteArrayOutputStream, c3276Arr.length, 1);
                m5106(byteArrayOutputStream, bArrM5102.length, 4);
                byte[] bArrM5103 = m5103(bArrM5102);
                m5106(byteArrayOutputStream, bArrM5103.length, 4);
                byteArrayOutputStream.write(bArrM5103);
                return true;
            }
            byte[] bArr4 = f7454;
            if (Arrays.equals(bArr, bArr4)) {
                m5106(byteArrayOutputStream, c3276Arr.length, 1);
                for (C3276 c3276 : c3276Arr) {
                    int size = c3276.f7465.size() * 4;
                    String strM5100 = m5100(c3276.f7462, c3276.f7461, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m5107(byteArrayOutputStream, strM5100.getBytes(charset).length);
                    m5107(byteArrayOutputStream, c3276.f7463.length);
                    m5106(byteArrayOutputStream, size, 4);
                    m5106(byteArrayOutputStream, c3276.f7460, 4);
                    byteArrayOutputStream.write(strM5100.getBytes(charset));
                    Iterator it = c3276.f7465.keySet().iterator();
                    while (it.hasNext()) {
                        m5107(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m5107(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c3276.f7463) {
                        m5107(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = f7447;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM51022 = m5102(c3276Arr, bArr5);
                m5106(byteArrayOutputStream, c3276Arr.length, 1);
                m5106(byteArrayOutputStream, bArrM51022.length, 4);
                byte[] bArrM51032 = m5103(bArrM51022);
                m5106(byteArrayOutputStream, bArrM51032.length, 4);
                byteArrayOutputStream.write(bArrM51032);
                return true;
            }
            byte[] bArr6 = f7453;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m5107(byteArrayOutputStream, c3276Arr.length);
            for (C3276 c32762 : c3276Arr) {
                String str = c32762.f7462;
                TreeMap treeMap = c32762.f7465;
                String strM51002 = m5100(str, c32762.f7461, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m5107(byteArrayOutputStream, strM51002.getBytes(charset2).length);
                m5107(byteArrayOutputStream, treeMap.size());
                m5107(byteArrayOutputStream, c32762.f7463.length);
                m5106(byteArrayOutputStream, c32762.f7460, 4);
                byteArrayOutputStream.write(strM51002.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m5107(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : c32762.f7463) {
                    m5107(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m5107(byteArrayOutputStream2, c3276Arr.length);
            int i4 = 2;
            int i5 = 2;
            for (C3276 c32763 : c3276Arr) {
                m5106(byteArrayOutputStream2, c32763.f7460, 4);
                m5106(byteArrayOutputStream2, c32763.f7459, 4);
                m5106(byteArrayOutputStream2, c32763.f7464, 4);
                String strM51003 = m5100(c32763.f7462, c32763.f7461, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM51003.getBytes(charset3).length;
                m5107(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM51003.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C3280 c3280 = new C3280(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c3280);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < c3276Arr.length; i7++) {
                try {
                    C3276 c32764 = c3276Arr[i7];
                    m5107(byteArrayOutputStream3, i7);
                    m5107(byteArrayOutputStream3, c32764.f7458);
                    i6 = i6 + 4 + (c32764.f7458 * i4);
                    int[] iArr = c32764.f7463;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        m5107(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i4 = i4;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            C3280 c32802 = new C3280(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c32802);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c3276Arr.length) {
                try {
                    C3276 c32765 = c3276Arr[i11];
                    Iterator it3 = c32765.f7465.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m5111(byteArrayOutputStream4, iIntValue, c32765);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m5105(byteArrayOutputStream4, c32765);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m5107(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m5106(byteArrayOutputStream3, length4, 4);
                            m5107(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C3280 c32803 = new C3280(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c32803);
            long size2 = 12 + ((long) (arrayList2.size() * 16));
            m5106(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                C3280 c32804 = (C3280) arrayList2.get(i14);
                FileSectionType fileSectionType = c32804.f7478;
                byte[] bArr7 = c32804.f7477;
                m5106(byteArrayOutputStream, fileSectionType.getValue(), 4);
                m5106(byteArrayOutputStream, size2, 4);
                if (c32804.f7476) {
                    long length5 = bArr7.length;
                    byte[] bArrM51033 = m5103(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM51033);
                    m5106(byteArrayOutputStream, bArrM51033.length, 4);
                    m5106(byteArrayOutputStream, length5, 4);
                    length = bArrM51033.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m5106(byteArrayOutputStream, bArr7.length, 4);
                    m5106(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m5113(ByteArrayOutputStream byteArrayOutputStream, C3276 c3276) throws IOException {
        m5105(byteArrayOutputStream, c3276);
        int i = c3276.f7464;
        int[] iArr = c3276.f7463;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            m5107(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c3276.f7465.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static byte[] m5114(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int[] m5115(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM5109 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM5109 += (int) m5109(byteArrayInputStream, 2);
            iArr[i2] = iM5109;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C3276[] m5116(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C3276[] c3276Arr) throws IOException {
        C3276 c3276;
        if (byteArrayInputStream.available() == 0) {
            return new C3276[0];
        }
        if (i != c3276Arr.length) {
            C6755.m11870("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            m5109(byteArrayInputStream, 2);
            String str = new String(m5098(byteArrayInputStream, (int) m5109(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM5109 = m5109(byteArrayInputStream, 4);
            int iM5109 = (int) m5109(byteArrayInputStream, 2);
            if (c3276Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c3276Arr.length; i3++) {
                    if (c3276Arr[i3].f7461.equals(strSubstring)) {
                        c3276 = c3276Arr[i3];
                        break;
                    }
                }
                c3276 = null;
            } else {
                c3276 = null;
            }
            if (c3276 == null) {
                C6755.m11870("Missing profile key: ".concat(str));
                return null;
            }
            c3276.f7459 = jM5109;
            int[] iArrM5115 = m5115(byteArrayInputStream, iM5109);
            if (Arrays.equals(bArr, f7453)) {
                c3276.f7458 = iM5109;
                c3276.f7463 = iArrM5115;
            }
        }
        return c3276Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C3276[] m5117(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f7448)) {
            C6755.m11870("Unsupported version");
            return null;
        }
        int iM5109 = (int) m5109(fileInputStream, 1);
        byte[] bArrM5114 = m5114(fileInputStream, (int) m5109(fileInputStream, 4), (int) m5109(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C6755.m11870("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5114);
        try {
            C3276[] c3276ArrM5108 = m5108(byteArrayInputStream, str, iM5109);
            byteArrayInputStream.close();
            return c3276ArrM5108;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C3276[] m5118(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C3276[] c3276Arr) throws IOException {
        byte[] bArr3 = f7455;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f7456)) {
                C6755.m11870("Unsupported meta version");
                return null;
            }
            int iM5109 = (int) m5109(fileInputStream, 2);
            byte[] bArrM5114 = m5114(fileInputStream, (int) m5109(fileInputStream, 4), (int) m5109(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C6755.m11870("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5114);
            try {
                C3276[] c3276ArrM5116 = m5116(byteArrayInputStream, bArr2, iM5109, c3276Arr);
                byteArrayInputStream.close();
                return c3276ArrM5116;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f7449, bArr2)) {
            C6755.m11870("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C6755.m11870("Unsupported meta version");
            return null;
        }
        int iM51092 = (int) m5109(fileInputStream, 1);
        byte[] bArrM51142 = m5114(fileInputStream, (int) m5109(fileInputStream, 4), (int) m5109(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C6755.m11870("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM51142);
        try {
            C3276[] c3276ArrM5119 = m5119(byteArrayInputStream2, iM51092, c3276Arr);
            byteArrayInputStream2.close();
            return c3276ArrM5119;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C3276[] m5119(ByteArrayInputStream byteArrayInputStream, int i, C3276[] c3276Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C3276[0];
        }
        if (i != c3276Arr.length) {
            C6755.m11870("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM5109 = (int) m5109(byteArrayInputStream, 2);
            iArr[i2] = (int) m5109(byteArrayInputStream, 2);
            strArr[i2] = new String(m5098(byteArrayInputStream, iM5109), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C3276 c3276 = c3276Arr[i3];
            if (!c3276.f7461.equals(strArr[i3])) {
                C6755.m11870("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            c3276.f7458 = i4;
            c3276.f7463 = m5115(byteArrayInputStream, i4);
        }
        return c3276Arr;
    }
}
