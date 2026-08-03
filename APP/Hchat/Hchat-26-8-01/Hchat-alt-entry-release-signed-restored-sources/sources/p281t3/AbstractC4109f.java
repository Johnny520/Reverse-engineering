package p281t3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
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
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p162l3.C2469w;

/* JADX INFO: renamed from: t3.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4109f {

    /* JADX INFO: renamed from: a */
    public static final C2469w f13593a = new C2469w(24);

    /* JADX INFO: renamed from: b */
    public static final byte[] f13594b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f13595c = {112, 114, JSONB.Constants.BC_STR_ASCII_FIX_36, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f13596d = {JSONB.Constants.BC_INT32_BYTE_MIN, 49, 53, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f13597e = {JSONB.Constants.BC_INT32_BYTE_MIN, 49, JSONB.Constants.BC_INT32_BYTE_MIN, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f13598f = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 57, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f13599g = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 53, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f13600h = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f13601i = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 49, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f13602j = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 50, 0};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static byte[] m8281a(byte[] bArr) {
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
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static byte[] m8282b(C4105b[] c4105bArr, byte[] bArr) throws IOException {
        int i9 = 0;
        int length = 0;
        for (C4105b c4105b : c4105bArr) {
            length += ((((c4105b.f13589g * 2) + 7) & (-8)) / 8) + (c4105b.f13587e * 2) + m8284d(c4105b.f13583a, c4105b.f13584b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c4105b.f13588f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f13598f)) {
            int length2 = c4105bArr.length;
            while (i9 < length2) {
                C4105b c4105b2 = c4105bArr[i9];
                m8297q(byteArrayOutputStream, c4105b2, m8284d(c4105b2.f13583a, c4105b2.f13584b, bArr));
                m8296p(byteArrayOutputStream, c4105b2);
                i9++;
            }
        } else {
            for (C4105b c4105b3 : c4105bArr) {
                m8297q(byteArrayOutputStream, c4105b3, m8284d(c4105b3.f13583a, c4105b3.f13584b, bArr));
            }
            int length3 = c4105bArr.length;
            while (i9 < length3) {
                m8296p(byteArrayOutputStream, c4105bArr[i9]);
                i9++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m8283c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z9 = true;
        for (File file2 : fileArrListFiles) {
            z9 = m8283c(file2) && z9;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m8284d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f13600h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f13599g;
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
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                return AbstractC0921a.m2255r(sb2, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m8285e(PackageInfo packageInfo, File file) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static byte[] m8286f(InputStream inputStream, int i9) throws IOException {
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (i10 < i9) {
            int i11 = inputStream.read(bArr, i10, i9 - i10);
            if (i11 < 0) {
                C2104o.m5276A(AbstractC0921a.m2249l(i9, "Not enough bytes to read: "));
                return null;
            }
            i10 += i11;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int[] m8287g(ByteArrayInputStream byteArrayInputStream, int i9) {
        int[] iArr = new int[i9];
        int iM8293m = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            iM8293m += (int) m8293m(byteArrayInputStream, 2);
            iArr[i10] = iM8293m;
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static byte[] m8288h(FileInputStream fileInputStream, int i9, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[Opcodes.ACC_STRICT];
            int i11 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i9) {
                int i12 = fileInputStream.read(bArr2);
                if (i12 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i9 + " bytes");
                }
                inflater.setInput(bArr2, 0, i12);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i10 - iInflate);
                    i11 += i12;
                } catch (DataFormatException e6) {
                    throw new IllegalStateException(e6.getMessage());
                }
            }
            if (i11 == i9) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i9 + " actual=" + i11);
        } finally {
            inflater.end();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C4105b[] m8289i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C4105b[] c4105bArr) throws IOException {
        byte[] bArr3 = f13601i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f13602j)) {
                C2104o.m5276A("Unsupported meta version");
                return null;
            }
            int iM8293m = (int) m8293m(fileInputStream, 2);
            byte[] bArrM8288h = m8288h(fileInputStream, (int) m8293m(fileInputStream, 4), (int) m8293m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C2104o.m5276A("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM8288h);
            try {
                C4105b[] c4105bArrM8291k = m8291k(byteArrayInputStream, bArr2, iM8293m, c4105bArr);
                byteArrayInputStream.close();
                return c4105bArrM8291k;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f13596d, bArr2)) {
            C2104o.m5276A("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C2104o.m5276A("Unsupported meta version");
            return null;
        }
        int iM8293m2 = (int) m8293m(fileInputStream, 1);
        byte[] bArrM8288h2 = m8288h(fileInputStream, (int) m8293m(fileInputStream, 4), (int) m8293m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C2104o.m5276A("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM8288h2);
        try {
            C4105b[] c4105bArrM8290j = m8290j(byteArrayInputStream2, iM8293m2, c4105bArr);
            byteArrayInputStream2.close();
            return c4105bArrM8290j;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C4105b[] m8290j(ByteArrayInputStream byteArrayInputStream, int i9, C4105b[] c4105bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C4105b[0];
        }
        if (i9 != c4105bArr.length) {
            C2104o.m5276A("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i9];
        int[] iArr = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int iM8293m = (int) m8293m(byteArrayInputStream, 2);
            iArr[i10] = (int) m8293m(byteArrayInputStream, 2);
            strArr[i10] = new String(m8286f(byteArrayInputStream, iM8293m), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i9; i11++) {
            C4105b c4105b = c4105bArr[i11];
            if (!c4105b.f13584b.equals(strArr[i11])) {
                C2104o.m5276A("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i12 = iArr[i11];
            c4105b.f13587e = i12;
            c4105b.f13590h = m8287g(byteArrayInputStream, i12);
        }
        return c4105bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C4105b[] m8291k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i9, C4105b[] c4105bArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C4105b[0];
        }
        if (i9 != c4105bArr.length) {
            C2104o.m5276A("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            m8293m(byteArrayInputStream, 2);
            String str = new String(m8286f(byteArrayInputStream, (int) m8293m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM8293m = m8293m(byteArrayInputStream, 4);
            int iM8293m = (int) m8293m(byteArrayInputStream, 2);
            C4105b c4105b = null;
            if (c4105bArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i11 = 0;
                while (true) {
                    if (i11 >= c4105bArr.length) {
                        break;
                    }
                    if (c4105bArr[i11].f13584b.equals(strSubstring)) {
                        c4105b = c4105bArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (c4105b == null) {
                C2104o.m5276A("Missing profile key: ".concat(str));
                return null;
            }
            c4105b.f13586d = jM8293m;
            int[] iArrM8287g = m8287g(byteArrayInputStream, iM8293m);
            if (Arrays.equals(bArr, f13600h)) {
                c4105b.f13587e = iM8293m;
                c4105b.f13590h = iArrM8287g;
            }
        }
        return c4105bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static C4105b[] m8292l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f13597e)) {
            C2104o.m5276A("Unsupported version");
            return null;
        }
        int iM8293m = (int) m8293m(fileInputStream, 1);
        byte[] bArrM8288h = m8288h(fileInputStream, (int) m8293m(fileInputStream, 4), (int) m8293m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C2104o.m5276A("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM8288h);
        try {
            C4105b[] c4105bArrM8294n = m8294n(byteArrayInputStream, str, iM8293m);
            byteArrayInputStream.close();
            return c4105bArrM8294n;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static long m8293m(InputStream inputStream, int i9) throws IOException {
        byte[] bArrM8286f = m8286f(inputStream, i9);
        long j3 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j3 += ((long) (bArrM8286f[i10] & 255)) << (i10 * 8);
        }
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C4105b[] m8294n(ByteArrayInputStream byteArrayInputStream, String str, int i9) throws IOException {
        int i10 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C4105b[0];
        }
        C4105b[] c4105bArr = new C4105b[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            int iM8293m = (int) m8293m(byteArrayInputStream, 2);
            int iM8293m2 = (int) m8293m(byteArrayInputStream, 2);
            c4105bArr[i11] = new C4105b(str, new String(m8286f(byteArrayInputStream, iM8293m), StandardCharsets.UTF_8), m8293m(byteArrayInputStream, 4), iM8293m2, (int) m8293m(byteArrayInputStream, 4), (int) m8293m(byteArrayInputStream, 4), new int[iM8293m2], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i9) {
            C4105b c4105b = c4105bArr[i12];
            int iAvailable = byteArrayInputStream.available();
            int i13 = c4105b.f13588f;
            int i14 = c4105b.f13589g;
            TreeMap treeMap = c4105b.f13591i;
            int i15 = iAvailable - i13;
            int iM8293m3 = i10;
            while (byteArrayInputStream.available() > i15) {
                iM8293m3 += (int) m8293m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM8293m3), 1);
                int iM8293m4 = (int) m8293m(byteArrayInputStream, 2);
                while (iM8293m4 > 0) {
                    m8293m(byteArrayInputStream, 2);
                    int iM8293m5 = (int) m8293m(byteArrayInputStream, 1);
                    if (iM8293m5 != 6 && iM8293m5 != 7) {
                        while (iM8293m5 > 0) {
                            m8293m(byteArrayInputStream, 1);
                            int i16 = i10;
                            int i17 = i12;
                            for (int iM8293m6 = (int) m8293m(byteArrayInputStream, 1); iM8293m6 > 0; iM8293m6--) {
                                m8293m(byteArrayInputStream, 2);
                            }
                            iM8293m5--;
                            i10 = i16;
                            i12 = i17;
                        }
                    }
                    iM8293m4--;
                    i10 = i10;
                    i12 = i12;
                }
            }
            int i18 = i10;
            int i19 = i12;
            if (byteArrayInputStream.available() != i15) {
                C2104o.m5276A("Read too much data during profile line parse");
                return null;
            }
            c4105b.f13590h = m8287g(byteArrayInputStream, c4105b.f13587e);
            BitSet bitSetValueOf = BitSet.valueOf(m8286f(byteArrayInputStream, (((i14 * 2) + 7) & (-8)) / 8));
            for (int i20 = i18; i20 < i14; i20++) {
                int i21 = bitSetValueOf.get(i20) ? 2 : i18;
                if (bitSetValueOf.get(i20 + i14)) {
                    i21 |= 4;
                }
                if (i21 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i20));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i18);
                    }
                    treeMap.put(Integer.valueOf(i20), Integer.valueOf(i21 | numValueOf.intValue()));
                }
            }
            i12 = i19 + 1;
            i10 = i18;
        }
        return c4105bArr;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: o */
    public static boolean m8295o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C4105b[] c4105bArr) throws IOException {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f13596d;
        int i9 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f13597e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM8282b = m8282b(c4105bArr, bArr3);
                m8301u(byteArrayOutputStream, c4105bArr.length, 1);
                m8301u(byteArrayOutputStream, bArrM8282b.length, 4);
                byte[] bArrM8281a = m8281a(bArrM8282b);
                m8301u(byteArrayOutputStream, bArrM8281a.length, 4);
                byteArrayOutputStream.write(bArrM8281a);
                return true;
            }
            byte[] bArr4 = f13599g;
            if (Arrays.equals(bArr, bArr4)) {
                m8301u(byteArrayOutputStream, c4105bArr.length, 1);
                for (C4105b c4105b : c4105bArr) {
                    int size = c4105b.f13591i.size() * 4;
                    String strM8284d = m8284d(c4105b.f13583a, c4105b.f13584b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m8302v(byteArrayOutputStream, strM8284d.getBytes(charset).length);
                    m8302v(byteArrayOutputStream, c4105b.f13590h.length);
                    m8301u(byteArrayOutputStream, size, 4);
                    m8301u(byteArrayOutputStream, c4105b.f13585c, 4);
                    byteArrayOutputStream.write(strM8284d.getBytes(charset));
                    Iterator it = c4105b.f13591i.keySet().iterator();
                    while (it.hasNext()) {
                        m8302v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m8302v(byteArrayOutputStream, 0);
                    }
                    for (int i10 : c4105b.f13590h) {
                        m8302v(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f13598f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM8282b2 = m8282b(c4105bArr, bArr5);
                m8301u(byteArrayOutputStream, c4105bArr.length, 1);
                m8301u(byteArrayOutputStream, bArrM8282b2.length, 4);
                byte[] bArrM8281a2 = m8281a(bArrM8282b2);
                m8301u(byteArrayOutputStream, bArrM8281a2.length, 4);
                byteArrayOutputStream.write(bArrM8281a2);
                return true;
            }
            byte[] bArr6 = f13600h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m8302v(byteArrayOutputStream, c4105bArr.length);
            for (C4105b c4105b2 : c4105bArr) {
                String str = c4105b2.f13583a;
                TreeMap treeMap = c4105b2.f13591i;
                String strM8284d2 = m8284d(str, c4105b2.f13584b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m8302v(byteArrayOutputStream, strM8284d2.getBytes(charset2).length);
                m8302v(byteArrayOutputStream, treeMap.size());
                m8302v(byteArrayOutputStream, c4105b2.f13590h.length);
                m8301u(byteArrayOutputStream, c4105b2.f13585c, 4);
                byteArrayOutputStream.write(strM8284d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m8302v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : c4105b2.f13590h) {
                    m8302v(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m8302v(byteArrayOutputStream2, c4105bArr.length);
            int i12 = 2;
            int i13 = 2;
            for (C4105b c4105b3 : c4105bArr) {
                m8301u(byteArrayOutputStream2, c4105b3.f13585c, 4);
                m8301u(byteArrayOutputStream2, c4105b3.f13586d, 4);
                m8301u(byteArrayOutputStream2, c4105b3.f13589g, 4);
                String strM8284d3 = m8284d(c4105b3.f13583a, c4105b3.f13584b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM8284d3.getBytes(charset3).length;
                m8302v(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(strM8284d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            C4113j c4113j = new C4113j(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c4113j);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < c4105bArr.length) {
                try {
                    C4105b c4105b4 = c4105bArr[i14];
                    m8302v(byteArrayOutputStream3, i14);
                    m8302v(byteArrayOutputStream3, c4105b4.f13587e);
                    i15 = i15 + 4 + (c4105b4.f13587e * i12);
                    int[] iArr = c4105b4.f13590h;
                    int length3 = iArr.length;
                    int i16 = i9;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length3) {
                        int i19 = iArr[i18];
                        m8302v(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i9 = 0;
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            C4113j c4113j2 = new C4113j(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c4113j2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < c4105bArr.length) {
                try {
                    C4105b c4105b5 = c4105bArr[i20];
                    Iterator it3 = c4105b5.f13591i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m8298r(byteArrayOutputStream4, iIntValue, c4105b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m8299s(byteArrayOutputStream4, c4105b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m8302v(byteArrayOutputStream3, i20);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i22 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m8301u(byteArrayOutputStream3, length4, 4);
                            m8302v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i21 = i22 + length4;
                            i20++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            C4113j c4113j3 = new C4113j(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c4113j3);
            long j4 = 4;
            long size2 = j4 + j4 + 4 + ((long) (arrayList2.size() * 16));
            m8301u(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                C4113j c4113j4 = (C4113j) arrayList2.get(i23);
                int i24 = c4113j4.f13610a;
                byte[] bArr7 = c4113j4.f13611b;
                if (i24 == 1) {
                    j3 = 0;
                } else if (i24 == 2) {
                    j3 = 1;
                } else if (i24 == 3) {
                    j3 = 2;
                } else if (i24 == 4) {
                    j3 = 3;
                } else {
                    if (i24 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                m8301u(byteArrayOutputStream, j3, 4);
                m8301u(byteArrayOutputStream, size2, 4);
                if (c4113j4.f13612c) {
                    long length5 = bArr7.length;
                    byte[] bArrM8281a3 = m8281a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM8281a3);
                    m8301u(byteArrayOutputStream, bArrM8281a3.length, 4);
                    m8301u(byteArrayOutputStream, length5, 4);
                    length = bArrM8281a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m8301u(byteArrayOutputStream, bArr7.length, 4);
                    m8301u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i23++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i25));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m8296p(ByteArrayOutputStream byteArrayOutputStream, C4105b c4105b) throws IOException {
        m8299s(byteArrayOutputStream, c4105b);
        int i9 = c4105b.f13589g;
        int[] iArr = c4105b.f13590h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            m8302v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        byte[] bArr = new byte[(((i9 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c4105b.f13591i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i13 = iIntValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i14 = iIntValue + i9;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m8297q(ByteArrayOutputStream byteArrayOutputStream, C4105b c4105b, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m8302v(byteArrayOutputStream, str.getBytes(charset).length);
        m8302v(byteArrayOutputStream, c4105b.f13587e);
        m8301u(byteArrayOutputStream, c4105b.f13588f, 4);
        m8301u(byteArrayOutputStream, c4105b.f13585c, 4);
        m8301u(byteArrayOutputStream, c4105b.f13589g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m8298r(ByteArrayOutputStream byteArrayOutputStream, int i9, C4105b c4105b) throws IOException {
        int i10 = c4105b.f13589g;
        byte[] bArr = new byte[(((Integer.bitCount(i9 & (-2)) * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : c4105b.f13591i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i9) != 0) {
                    if ((i12 & iIntValue2) == i12) {
                        int i13 = (i11 * i10) + iIntValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m8299s(ByteArrayOutputStream byteArrayOutputStream, C4105b c4105b) throws IOException {
        int i9 = 0;
        for (Map.Entry entry : c4105b.f13591i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m8302v(byteArrayOutputStream, iIntValue - i9);
                m8302v(byteArrayOutputStream, 0);
                i9 = iIntValue;
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:115:0x01a7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:174:0x024f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:176:0x0252 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
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
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8300t(Context context, Executor executor, InterfaceC4108e interfaceC4108e, boolean z9) {
        boolean z10;
        ?? M8276a;
        C4105b[] c4105bArrM8292l;
        C4105b[] c4105bArr;
        C4105b[] c4105bArr2;
        byte[] bArr;
        ?? r72;
        boolean z11;
        Throwable th2;
        Throwable th3;
        ?? r73;
        boolean z12;
        boolean z13;
        ?? r74;
        ByteArrayOutputStream byteArrayOutputStream;
        C4104a c4104a;
        ?? r75;
        String str;
        FileInputStream fileInputStreamM8276a;
        ?? r76;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z9) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j3 = dataInputStream.readLong();
                            dataInputStream.close();
                            z14 = j3 == packageInfo.lastUpdateTime;
                            if (z14) {
                                interfaceC4108e.mo5871c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z14 = false;
                    }
                    if (z14) {
                    }
                } else {
                    z14 = false;
                    if (z14) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC4112i.m8308c(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C4104a c4104a2 = new C4104a(assets, executor, interfaceC4108e, name, file2);
            byte[] bArr2 = c4104a2.f13577c;
            if (bArr2 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c4104a2.m8277b(4, null);
                    }
                    c4104a2.f13580f = true;
                    try {
                        M8276a = c4104a2.m8276a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e6) {
                        interfaceC4108e.mo5871c(6, e6);
                        M8276a = 0;
                    } catch (IOException e7) {
                        interfaceC4108e.mo5871c(7, e7);
                        M8276a = 0;
                    }
                    byte[] bArr3 = f13594b;
                    try {
                        if (M8276a != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e10) {
                                    interfaceC4108e.mo5871c(8, e10);
                                    try {
                                        M8276a.close();
                                    } catch (IOException e11) {
                                        interfaceC4108e.mo5871c(7, e11);
                                    }
                                    c4105bArrM8292l = null;
                                    c4104a2.f13581g = c4105bArrM8292l;
                                    c4105bArr = c4104a2.f13581g;
                                    if (c4105bArr != null) {
                                    }
                                    InterfaceC4108e interfaceC4108e2 = c4104a2.f13576b;
                                    c4105bArr2 = c4104a2.f13581g;
                                    byte[] bArr4 = c4104a2.f13577c;
                                    ?? r77 = M8276a;
                                    r77 = M8276a;
                                    if (c4105bArr2 != null) {
                                    }
                                    bArr = c4104a2.f13582h;
                                    if (bArr != null) {
                                    }
                                    if (z11) {
                                    }
                                    z12 = z11;
                                    r76 = r73;
                                    AbstractC4112i.m8308c(context, (z12 || !z9) ? 0 : r76);
                                }
                            } catch (IOException e12) {
                                interfaceC4108e.mo5871c(7, e12);
                                M8276a.close();
                                c4105bArrM8292l = null;
                                c4104a2.f13581g = c4105bArrM8292l;
                                c4105bArr = c4104a2.f13581g;
                                if (c4105bArr != null) {
                                }
                                InterfaceC4108e interfaceC4108e22 = c4104a2.f13576b;
                                c4105bArr2 = c4104a2.f13581g;
                                byte[] bArr42 = c4104a2.f13577c;
                                ?? r772 = M8276a;
                                r772 = M8276a;
                                if (c4105bArr2 != null) {
                                }
                                bArr = c4104a2.f13582h;
                                if (bArr != null) {
                                }
                                if (z11) {
                                }
                                z12 = z11;
                                r76 = r73;
                                AbstractC4112i.m8308c(context, (z12 || !z9) ? 0 : r76);
                            }
                            if (!Arrays.equals(bArr3, m8286f(M8276a, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c4105bArrM8292l = m8292l(M8276a, m8286f(M8276a, 4), c4104a2.f13579e);
                            try {
                                M8276a.close();
                            } catch (IOException e13) {
                                interfaceC4108e.mo5871c(7, e13);
                            }
                            c4104a2.f13581g = c4105bArrM8292l;
                        }
                        c4105bArr = c4104a2.f13581g;
                        if (c4105bArr != null && (M8276a = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamM8276a = c4104a2.m8276a(assets, "dexopt/baseline.profm");
                                r75 = str;
                            } catch (FileNotFoundException e14) {
                                interfaceC4108e.mo5871c(9, e14);
                                r75 = M8276a;
                            } catch (IOException e15) {
                                interfaceC4108e.mo5871c(7, e15);
                                r75 = M8276a;
                            } catch (IllegalStateException e16) {
                                c4104a2.f13581g = null;
                                interfaceC4108e.mo5871c(8, e16);
                                r75 = M8276a;
                            }
                            if (fileInputStreamM8276a == null) {
                                try {
                                    if (!Arrays.equals(f13595c, m8286f(fileInputStreamM8276a, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrM8286f = m8286f(fileInputStreamM8276a, 4);
                                    c4104a2.f13581g = m8289i(fileInputStreamM8276a, bArrM8286f, bArr2, c4105bArr);
                                    fileInputStreamM8276a.close();
                                    c4104a = c4104a2;
                                    M8276a = bArrM8286f;
                                    if (c4104a != null) {
                                        c4104a2 = c4104a;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM8276a != null) {
                                    fileInputStreamM8276a.close();
                                    r75 = str;
                                }
                                c4104a = null;
                                M8276a = r75;
                                if (c4104a != null) {
                                }
                            }
                        }
                        InterfaceC4108e interfaceC4108e222 = c4104a2.f13576b;
                        c4105bArr2 = c4104a2.f13581g;
                        byte[] bArr422 = c4104a2.f13577c;
                        ?? r7722 = M8276a;
                        r7722 = M8276a;
                        if (c4105bArr2 != null && bArr422 != null) {
                            z13 = c4104a2.f13580f;
                            if (z13) {
                                C2104o.m5276A("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr3);
                                    byteArrayOutputStream.write(bArr422);
                                } finally {
                                }
                            } catch (IOException e17) {
                                interfaceC4108e222.mo5871c(7, e17);
                                r74 = z13;
                            } catch (IllegalStateException e18) {
                                interfaceC4108e222.mo5871c(8, e18);
                                r74 = z13;
                            }
                            if (m8295o(byteArrayOutputStream, bArr422, c4105bArr2)) {
                                c4104a2.f13582h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                r74 = byteArrayOutputStream;
                                c4104a2.f13581g = null;
                                r7722 = r74;
                            } else {
                                interfaceC4108e222.mo5871c(5, null);
                                c4104a2.f13581g = null;
                                byteArrayOutputStream.close();
                                r7722 = byteArrayOutputStream;
                            }
                        }
                        bArr = c4104a2.f13582h;
                        if (bArr != null) {
                            z11 = false;
                            r73 = 1;
                        } else {
                            try {
                                if (!c4104a2.f13580f) {
                                    C2104o.m5276A("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(c4104a2.f13578d);
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
                                                                                byte[] bArr5 = new byte[Opcodes.ACC_INTERFACE];
                                                                                while (true) {
                                                                                    int i9 = byteArrayInputStream.read(bArr5);
                                                                                    if (i9 <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i9);
                                                                                    }
                                                                                }
                                                                                r73 = 1;
                                                                                c4104a2.m8277b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c4104a2.f13582h = null;
                                                                                c4104a2.f13581g = null;
                                                                                z11 = true;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            Throwable th5 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th5;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th5;
                                                                            } catch (Throwable th6) {
                                                                                th5.addSuppressed(th6);
                                                                                throw th5;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    Throwable th8 = th;
                                                                    if (channel == null) {
                                                                        throw th8;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th8;
                                                                    } catch (Throwable th9) {
                                                                        th8.addSuppressed(th9);
                                                                        throw th8;
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
                                                        th3 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th3;
                                                        } catch (Throwable th13) {
                                                            th3.addSuppressed(th13);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    th3 = th;
                                                    fileOutputStream.close();
                                                    throw th3;
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                                th2 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th2;
                                                } catch (Throwable th16) {
                                                    th2.addSuppressed(th16);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            th2 = th;
                                            byteArrayInputStream.close();
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException e19) {
                                        e = e19;
                                        r7722 = 1;
                                        c4104a2.m8277b(6, e);
                                        r72 = r7722;
                                        z11 = false;
                                        r73 = r72;
                                        if (z11) {
                                        }
                                        z12 = z11;
                                        r76 = r73;
                                        AbstractC4112i.m8308c(context, (z12 || !z9) ? 0 : r76);
                                    } catch (IOException e20) {
                                        e = e20;
                                        r7722 = 1;
                                        c4104a2.m8277b(7, e);
                                        r72 = r7722;
                                        z11 = false;
                                        r73 = r72;
                                        if (z11) {
                                        }
                                        z12 = z11;
                                        r76 = r73;
                                        AbstractC4112i.m8308c(context, (z12 || !z9) ? 0 : r76);
                                    }
                                } catch (FileNotFoundException e21) {
                                    e = e21;
                                    c4104a2.m8277b(6, e);
                                    r72 = r7722;
                                    z11 = false;
                                    r73 = r72;
                                    if (z11) {
                                    }
                                    z12 = z11;
                                    r76 = r73;
                                    AbstractC4112i.m8308c(context, (z12 || !z9) ? 0 : r76);
                                } catch (IOException e22) {
                                    e = e22;
                                    c4104a2.m8277b(7, e);
                                    r72 = r7722;
                                    z11 = false;
                                    r73 = r72;
                                    if (z11) {
                                    }
                                    z12 = z11;
                                    r76 = r73;
                                    AbstractC4112i.m8308c(context, (z12 || !z9) ? 0 : r76);
                                }
                            } finally {
                                c4104a2.f13582h = null;
                                c4104a2.f13581g = null;
                            }
                        }
                        if (z11) {
                            m8285e(packageInfo, filesDir);
                        }
                        z12 = z11;
                        r76 = r73;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c4104a2.m8277b(4, null);
                        }
                        c4104a2.f13580f = true;
                        M8276a = c4104a2.m8276a(assets, "dexopt/baseline.prof");
                        byte[] bArr32 = f13594b;
                        if (M8276a != 0) {
                        }
                        c4105bArr = c4104a2.f13581g;
                        if (c4105bArr != null) {
                            str = "dexopt/baseline.profm";
                            fileInputStreamM8276a = c4104a2.m8276a(assets, "dexopt/baseline.profm");
                            r75 = str;
                            if (fileInputStreamM8276a == null) {
                            }
                        }
                        InterfaceC4108e interfaceC4108e2222 = c4104a2.f13576b;
                        c4105bArr2 = c4104a2.f13581g;
                        byte[] bArr4222 = c4104a2.f13577c;
                        ?? r77222 = M8276a;
                        r77222 = M8276a;
                        if (c4105bArr2 != null) {
                            z13 = c4104a2.f13580f;
                            if (z13) {
                            }
                        }
                        bArr = c4104a2.f13582h;
                        if (bArr != null) {
                        }
                        if (z11) {
                        }
                        z12 = z11;
                        r76 = r73;
                    } catch (IOException unused2) {
                        z10 = true;
                        c4104a2.m8277b(4, null);
                    }
                }
                AbstractC4112i.m8308c(context, (z12 || !z9) ? 0 : r76);
            }
            c4104a2.m8277b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z10 = true;
            z12 = false;
            r76 = z10;
            AbstractC4112i.m8308c(context, (z12 || !z9) ? 0 : r76);
        } catch (PackageManager.NameNotFoundException e23) {
            interfaceC4108e.mo5871c(7, e23);
            AbstractC4112i.m8308c(context, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m8301u(ByteArrayOutputStream byteArrayOutputStream, long j3, int i9) throws IOException {
        byte[] bArr = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = (byte) ((j3 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m8302v(ByteArrayOutputStream byteArrayOutputStream, int i9) throws IOException {
        m8301u(byteArrayOutputStream, i9, 2);
    }
}
