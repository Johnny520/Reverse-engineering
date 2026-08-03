package p034S;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
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
import p089x0.C1121e;

/* JADX INFO: renamed from: S.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0327g {

    /* JADX INFO: renamed from: a */
    public static final C1121e f630a = new C1121e(8);

    /* JADX INFO: renamed from: b */
    public static final byte[] f631b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f632c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f633d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f634e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f635f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f636g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f637h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f638i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f639j = {48, 48, 50, 0};

    /* JADX INFO: renamed from: a */
    public static byte[] m728a(byte[] bArr) {
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

    /* JADX INFO: renamed from: b */
    public static byte[] m729b(C0323c[] c0323cArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C0323c c0323c : c0323cArr) {
            length += ((((c0323c.f627g * 2) + 7) & (-8)) / 8) + (c0323c.f625e * 2) + m731d(c0323c.f621a, c0323c.f622b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0323c.f626f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f635f)) {
            for (C0323c c0323c2 : c0323cArr) {
                m743p(byteArrayOutputStream, c0323c2, m731d(c0323c2.f621a, c0323c2.f622b, bArr));
                m745r(byteArrayOutputStream, c0323c2);
                int[] iArr = c0323c2.f628h;
                int length2 = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = iArr[i2];
                    m748u(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                m744q(byteArrayOutputStream, c0323c2);
            }
        } else {
            for (C0323c c0323c3 : c0323cArr) {
                m743p(byteArrayOutputStream, c0323c3, m731d(c0323c3.f621a, c0323c3.f622b, bArr));
            }
            for (C0323c c0323c4 : c0323cArr) {
                m745r(byteArrayOutputStream, c0323c4);
                int[] iArr2 = c0323c4.f628h;
                int length3 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length3) {
                    int i7 = iArr2[i5];
                    m748u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                m744q(byteArrayOutputStream, c0323c4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m730c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = m730c(file2) && z2;
        }
        return z2;
    }

    /* JADX INFO: renamed from: d */
    public static String m731d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f637h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f636g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static void m732e(PackageInfo packageInfo, File file) {
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

    /* JADX INFO: renamed from: f */
    public static byte[] m733f(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException(AbstractC0324d.m720c("Not enough bytes to read: ", i2));
            }
            i3 += i4;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m734g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iM740m = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iM740m += (int) m740m(byteArrayInputStream, 2);
            iArr[i3] = iM740m;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m735h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0323c[] m736i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0323c[] c0323cArr) throws IOException {
        byte[] bArr3 = f638i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f639j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM740m = (int) m740m(fileInputStream, 2);
            byte[] bArrM735h = m735h(fileInputStream, (int) m740m(fileInputStream, 4), (int) m740m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM735h);
            try {
                C0323c[] c0323cArrM738k = m738k(byteArrayInputStream, bArr2, iM740m, c0323cArr);
                byteArrayInputStream.close();
                return c0323cArrM738k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f633d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM740m2 = (int) m740m(fileInputStream, 1);
        byte[] bArrM735h2 = m735h(fileInputStream, (int) m740m(fileInputStream, 4), (int) m740m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM735h2);
        try {
            C0323c[] c0323cArrM737j = m737j(byteArrayInputStream2, iM740m2, c0323cArr);
            byteArrayInputStream2.close();
            return c0323cArrM737j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public static C0323c[] m737j(ByteArrayInputStream byteArrayInputStream, int i2, C0323c[] c0323cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0323c[0];
        }
        if (i2 != c0323cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM740m = (int) m740m(byteArrayInputStream, 2);
            iArr[i3] = (int) m740m(byteArrayInputStream, 2);
            strArr[i3] = new String(m733f(byteArrayInputStream, iM740m), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0323c c0323c = c0323cArr[i4];
            if (!c0323c.f622b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c0323c.f625e = i5;
            c0323c.f628h = m734g(byteArrayInputStream, i5);
        }
        return c0323cArr;
    }

    /* JADX INFO: renamed from: k */
    public static C0323c[] m738k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0323c[] c0323cArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0323c[0];
        }
        if (i2 != c0323cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m740m(byteArrayInputStream, 2);
            String str = new String(m733f(byteArrayInputStream, (int) m740m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM740m = m740m(byteArrayInputStream, 4);
            int iM740m = (int) m740m(byteArrayInputStream, 2);
            C0323c c0323c = null;
            if (c0323cArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= c0323cArr.length) {
                        break;
                    }
                    if (c0323cArr[i4].f622b.equals(strSubstring)) {
                        c0323c = c0323cArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (c0323c == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0323c.f624d = jM740m;
            int[] iArrM734g = m734g(byteArrayInputStream, iM740m);
            if (Arrays.equals(bArr, f637h)) {
                c0323c.f625e = iM740m;
                c0323c.f628h = iArrM734g;
            }
        }
        return c0323cArr;
    }

    /* JADX INFO: renamed from: l */
    public static C0323c[] m739l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f634e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM740m = (int) m740m(fileInputStream, 1);
        byte[] bArrM735h = m735h(fileInputStream, (int) m740m(fileInputStream, 4), (int) m740m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM735h);
        try {
            C0323c[] c0323cArrM741n = m741n(byteArrayInputStream, str, iM740m);
            byteArrayInputStream.close();
            return c0323cArrM741n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m740m(InputStream inputStream, int i2) throws IOException {
        byte[] bArrM733f = m733f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrM733f[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    /* JADX INFO: renamed from: n */
    public static C0323c[] m741n(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0323c[0];
        }
        C0323c[] c0323cArr = new C0323c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM740m = (int) m740m(byteArrayInputStream, 2);
            int iM740m2 = (int) m740m(byteArrayInputStream, 2);
            c0323cArr[i3] = new C0323c(str, new String(m733f(byteArrayInputStream, iM740m), StandardCharsets.UTF_8), m740m(byteArrayInputStream, 4), iM740m2, (int) m740m(byteArrayInputStream, 4), (int) m740m(byteArrayInputStream, 4), new int[iM740m2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0323c c0323c = c0323cArr[i4];
            int iAvailable = byteArrayInputStream.available() - c0323c.f626f;
            int iM740m3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c0323c.f629i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM740m3 += (int) m740m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM740m3), 1);
                for (int iM740m4 = (int) m740m(byteArrayInputStream, 2); iM740m4 > 0; iM740m4--) {
                    m740m(byteArrayInputStream, 2);
                    int iM740m5 = (int) m740m(byteArrayInputStream, 1);
                    if (iM740m5 != 6 && iM740m5 != 7) {
                        while (iM740m5 > 0) {
                            m740m(byteArrayInputStream, 1);
                            for (int iM740m6 = (int) m740m(byteArrayInputStream, 1); iM740m6 > 0; iM740m6--) {
                                m740m(byteArrayInputStream, 2);
                            }
                            iM740m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0323c.f628h = m734g(byteArrayInputStream, c0323c.f625e);
            int i5 = c0323c.f627g;
            BitSet bitSetValueOf = BitSet.valueOf(m733f(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bitSetValueOf.get(i6) ? 2 : 0;
                if (bitSetValueOf.get(i6 + i5)) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return c0323cArr;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: o */
    public static boolean m742o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0323c[] c0323cArr) throws IOException {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f633d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f634e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM729b = m729b(c0323cArr, bArr3);
                m747t(byteArrayOutputStream, c0323cArr.length, 1);
                m747t(byteArrayOutputStream, bArrM729b.length, 4);
                byte[] bArrM728a = m728a(bArrM729b);
                m747t(byteArrayOutputStream, bArrM728a.length, 4);
                byteArrayOutputStream.write(bArrM728a);
                return true;
            }
            byte[] bArr4 = f636g;
            if (Arrays.equals(bArr, bArr4)) {
                m747t(byteArrayOutputStream, c0323cArr.length, 1);
                for (C0323c c0323c : c0323cArr) {
                    int size = c0323c.f629i.size() * 4;
                    String strM731d = m731d(c0323c.f621a, c0323c.f622b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m748u(byteArrayOutputStream, strM731d.getBytes(charset).length);
                    m748u(byteArrayOutputStream, c0323c.f628h.length);
                    m747t(byteArrayOutputStream, size, 4);
                    m747t(byteArrayOutputStream, c0323c.f623c, 4);
                    byteArrayOutputStream.write(strM731d.getBytes(charset));
                    Iterator it = c0323c.f629i.keySet().iterator();
                    while (it.hasNext()) {
                        m748u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m748u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0323c.f628h) {
                        m748u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f635f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM729b2 = m729b(c0323cArr, bArr5);
                m747t(byteArrayOutputStream, c0323cArr.length, 1);
                m747t(byteArrayOutputStream, bArrM729b2.length, 4);
                byte[] bArrM728a2 = m728a(bArrM729b2);
                m747t(byteArrayOutputStream, bArrM728a2.length, 4);
                byteArrayOutputStream.write(bArrM728a2);
                return true;
            }
            byte[] bArr6 = f637h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m748u(byteArrayOutputStream, c0323cArr.length);
            for (C0323c c0323c2 : c0323cArr) {
                String strM731d2 = m731d(c0323c2.f621a, c0323c2.f622b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m748u(byteArrayOutputStream, strM731d2.getBytes(charset2).length);
                TreeMap treeMap = c0323c2.f629i;
                m748u(byteArrayOutputStream, treeMap.size());
                m748u(byteArrayOutputStream, c0323c2.f628h.length);
                m747t(byteArrayOutputStream, c0323c2.f623c, 4);
                byteArrayOutputStream.write(strM731d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m748u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0323c2.f628h) {
                    m748u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m748u(byteArrayOutputStream2, c0323cArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0323c c0323c3 : c0323cArr) {
                m747t(byteArrayOutputStream2, c0323c3.f623c, 4);
                m747t(byteArrayOutputStream2, c0323c3.f624d, 4);
                m747t(byteArrayOutputStream2, c0323c3.f627g, 4);
                String strM731d3 = m731d(c0323c3.f621a, c0323c3.f622b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM731d3.getBytes(charset3).length;
                m748u(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strM731d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C0336p c0336p = new C0336p(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0336p);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0323cArr.length) {
                try {
                    C0323c c0323c4 = c0323cArr[i7];
                    m748u(byteArrayOutputStream3, i7);
                    m748u(byteArrayOutputStream3, c0323c4.f625e);
                    i8 = i8 + 4 + (c0323c4.f625e * 2);
                    int[] iArr = c0323c4.f628h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        m748u(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C0336p c0336p2 = new C0336p(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0336p2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c0323cArr.length) {
                try {
                    C0323c c0323c5 = c0323cArr[i11];
                    Iterator it3 = c0323c5.f629i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m744q(byteArrayOutputStream4, c0323c5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m745r(byteArrayOutputStream4, c0323c5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m748u(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m747t(byteArrayOutputStream3, length4, 4);
                            m748u(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i5 = 2;
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
            C0336p c0336p3 = new C0336p(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0336p3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + ((long) (arrayList2.size() * 16));
            m747t(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                C0336p c0336p4 = (C0336p) arrayList2.get(i14);
                int i15 = c0336p4.f653a;
                if (i15 == 1) {
                    j2 = 0;
                } else if (i15 == 2) {
                    j2 = 1;
                } else if (i15 == 3) {
                    j2 = 2;
                } else if (i15 == 4) {
                    j2 = 3;
                } else {
                    if (i15 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                m747t(byteArrayOutputStream, j2, 4);
                m747t(byteArrayOutputStream, size2, 4);
                boolean z2 = c0336p4.f655c;
                byte[] bArr7 = c0336p4.f654b;
                if (z2) {
                    long length5 = bArr7.length;
                    byte[] bArrM728a3 = m728a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM728a3);
                    m747t(byteArrayOutputStream, bArrM728a3.length, 4);
                    m747t(byteArrayOutputStream, length5, 4);
                    length = bArrM728a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m747t(byteArrayOutputStream, bArr7.length, 4);
                    m747t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
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

    /* JADX INFO: renamed from: p */
    public static void m743p(ByteArrayOutputStream byteArrayOutputStream, C0323c c0323c, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m748u(byteArrayOutputStream, str.getBytes(charset).length);
        m748u(byteArrayOutputStream, c0323c.f625e);
        m747t(byteArrayOutputStream, c0323c.f626f, 4);
        m747t(byteArrayOutputStream, c0323c.f623c, 4);
        m747t(byteArrayOutputStream, c0323c.f627g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: q */
    public static void m744q(ByteArrayOutputStream byteArrayOutputStream, C0323c c0323c) throws IOException {
        byte[] bArr = new byte[(((c0323c.f627g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0323c.f629i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i2 = iIntValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i3 = iIntValue + c0323c.f627g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: r */
    public static void m745r(ByteArrayOutputStream byteArrayOutputStream, C0323c c0323c) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : c0323c.f629i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m748u(byteArrayOutputStream, iIntValue - i2);
                m748u(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019d A[FALL_THROUGH, PHI: r11
  0x019d: PHI (r11v2 S.b) = (r11v1 S.b), (r11v1 S.b), (r11v1 S.b), (r11v1 S.b), (r11v3 S.b) binds: [B:88:0x013a, B:90:0x0140, B:92:0x0143, B:124:0x019a, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x027f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m746s(Context context, Executor executor, InterfaceC0326f interfaceC0326f, boolean z2) throws Throwable {
        ?? r4;
        FileInputStream fileInputStreamM716a;
        IOException iOException;
        int i2;
        C0323c[] c0323cArrM739l;
        C0323c[] c0323cArr;
        C0323c[] c0323cArr2;
        byte[] bArr;
        ?? r42;
        boolean z3;
        ?? r43;
        ByteArrayOutputStream byteArrayOutputStream;
        int i3;
        C0322b c0322b;
        FileInputStream fileInputStreamM716a2;
        boolean z4;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z4 = j2 == packageInfo.lastUpdateTime;
                            if (z4) {
                                interfaceC0326f.mo348n(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (z4) {
                    context.getPackageName();
                    AbstractC0335o.m756c(context, false);
                    return;
                }
            }
            context.getPackageName();
            int i4 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0322b c0322b2 = new C0322b(assets, executor, interfaceC0326f, name, file2);
            byte[] bArr2 = c0322b2.f615c;
            if (bArr2 == null) {
                c0322b2.m717b(3, Integer.valueOf(i4));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        r4 = 1;
                        c0322b2.m717b(4, null);
                        z3 = false;
                    }
                } else if (!file2.canWrite()) {
                    c0322b2.m717b(4, null);
                }
                c0322b2.f618f = true;
                byte[] bArr3 = f631b;
                try {
                    fileInputStreamM716a = c0322b2.m716a(assets, "dexopt/baseline.prof");
                } catch (FileNotFoundException e2) {
                    interfaceC0326f.mo348n(6, e2);
                    fileInputStreamM716a = null;
                } catch (IOException e3) {
                    interfaceC0326f.mo348n(7, e3);
                    fileInputStreamM716a = null;
                }
                try {
                    if (fileInputStreamM716a != null) {
                        try {
                        } catch (IOException e4) {
                            i2 = 7;
                            interfaceC0326f.mo348n(7, e4);
                            try {
                                fileInputStreamM716a.close();
                            } catch (IOException e5) {
                                iOException = e5;
                                interfaceC0326f.mo348n(i2, iOException);
                                c0323cArrM739l = null;
                                c0322b2.f619g = c0323cArrM739l;
                                c0323cArr = c0322b2.f619g;
                                if (c0323cArr != null) {
                                }
                                InterfaceC0326f interfaceC0326f2 = c0322b2.f614b;
                                c0323cArr2 = c0322b2.f619g;
                                ?? r44 = bArr3;
                                if (c0323cArr2 != null) {
                                }
                                bArr = c0322b2.f620h;
                                if (bArr != null) {
                                }
                                if (z3) {
                                }
                                AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                            }
                            c0323cArrM739l = null;
                            c0322b2.f619g = c0323cArrM739l;
                            c0323cArr = c0322b2.f619g;
                            if (c0323cArr != null) {
                            }
                            InterfaceC0326f interfaceC0326f22 = c0322b2.f614b;
                            c0323cArr2 = c0322b2.f619g;
                            ?? r442 = bArr3;
                            if (c0323cArr2 != null) {
                            }
                            bArr = c0322b2.f620h;
                            if (bArr != null) {
                            }
                            if (z3) {
                            }
                            AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                        } catch (IllegalStateException e6) {
                            try {
                                interfaceC0326f.mo348n(8, e6);
                                try {
                                    fileInputStreamM716a.close();
                                } catch (IOException e7) {
                                    iOException = e7;
                                    i2 = 7;
                                    interfaceC0326f.mo348n(i2, iOException);
                                    c0323cArrM739l = null;
                                    c0322b2.f619g = c0323cArrM739l;
                                    c0323cArr = c0322b2.f619g;
                                    if (c0323cArr != null) {
                                        switch (i3) {
                                        }
                                    }
                                    InterfaceC0326f interfaceC0326f222 = c0322b2.f614b;
                                    c0323cArr2 = c0322b2.f619g;
                                    ?? r4422 = bArr3;
                                    if (c0323cArr2 != null) {
                                    }
                                    bArr = c0322b2.f620h;
                                    if (bArr != null) {
                                    }
                                    if (z3) {
                                    }
                                    AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                                }
                                c0323cArrM739l = null;
                                c0322b2.f619g = c0323cArrM739l;
                                c0323cArr = c0322b2.f619g;
                                if (c0323cArr != null) {
                                }
                                InterfaceC0326f interfaceC0326f2222 = c0322b2.f614b;
                                c0323cArr2 = c0322b2.f619g;
                                ?? r44222 = bArr3;
                                if (c0323cArr2 != null) {
                                }
                                bArr = c0322b2.f620h;
                                if (bArr != null) {
                                }
                                if (z3) {
                                }
                                AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    fileInputStreamM716a.close();
                                    throw th2;
                                } catch (IOException e8) {
                                    interfaceC0326f.mo348n(7, e8);
                                    throw th2;
                                }
                            }
                        }
                        if (!Arrays.equals(bArr3, m733f(fileInputStreamM716a, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c0323cArrM739l = m739l(fileInputStreamM716a, m733f(fileInputStreamM716a, 4), c0322b2.f617e);
                        try {
                            fileInputStreamM716a.close();
                        } catch (IOException e9) {
                            interfaceC0326f.mo348n(7, e9);
                        }
                        c0322b2.f619g = c0323cArrM739l;
                    }
                    c0323cArr = c0322b2.f619g;
                    if (c0323cArr != null && (i3 = Build.VERSION.SDK_INT) <= 34) {
                        switch (i3) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                                try {
                                    fileInputStreamM716a2 = c0322b2.m716a(assets, "dexopt/baseline.profm");
                                } catch (FileNotFoundException e10) {
                                    interfaceC0326f.mo348n(9, e10);
                                } catch (IOException e11) {
                                    interfaceC0326f.mo348n(7, e11);
                                } catch (IllegalStateException e12) {
                                    c0322b2.f619g = null;
                                    interfaceC0326f.mo348n(8, e12);
                                }
                                if (fileInputStreamM716a2 != null) {
                                    try {
                                        if (!Arrays.equals(f632c, m733f(fileInputStreamM716a2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        c0322b2.f619g = m736i(fileInputStreamM716a2, m733f(fileInputStreamM716a2, 4), bArr2, c0323cArr);
                                        fileInputStreamM716a2.close();
                                        c0322b = c0322b2;
                                        if (c0322b != null) {
                                            c0322b2 = c0322b;
                                        }
                                    } finally {
                                    }
                                    break;
                                } else {
                                    if (fileInputStreamM716a2 != null) {
                                        fileInputStreamM716a2.close();
                                    }
                                    c0322b = null;
                                    if (c0322b != null) {
                                    }
                                }
                            default:
                                InterfaceC0326f interfaceC0326f22222 = c0322b2.f614b;
                                c0323cArr2 = c0322b2.f619g;
                                ?? r442222 = bArr3;
                                if (c0323cArr2 != null) {
                                    byte[] bArr4 = c0322b2.f615c;
                                    r442222 = bArr3;
                                    if (bArr4 != null) {
                                        if (!c0322b2.f618f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(bArr3);
                                                byteArrayOutputStream.write(bArr4);
                                            } finally {
                                            }
                                        } catch (IOException e13) {
                                            r43 = 7;
                                            interfaceC0326f22222.mo348n(7, e13);
                                        } catch (IllegalStateException e14) {
                                            interfaceC0326f22222.mo348n(8, e14);
                                            r43 = bArr3;
                                        }
                                        if (m742o(byteArrayOutputStream, bArr4, c0323cArr2)) {
                                            c0322b2.f620h = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            r43 = bArr3;
                                            c0322b2.f619g = null;
                                            r442222 = r43;
                                        } else {
                                            interfaceC0326f22222.mo348n(5, null);
                                            c0322b2.f619g = null;
                                            byteArrayOutputStream.close();
                                            r442222 = bArr3;
                                        }
                                    }
                                }
                                bArr = c0322b2.f620h;
                                if (bArr != null) {
                                    z3 = false;
                                    r4 = 1;
                                } else {
                                    try {
                                        if (!c0322b2.f618f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(c0322b2.f616d);
                                                    try {
                                                        try {
                                                            byte[] bArr5 = new byte[512];
                                                            while (true) {
                                                                int i5 = byteArrayInputStream.read(bArr5);
                                                                if (i5 > 0) {
                                                                    fileOutputStream.write(bArr5, 0, i5);
                                                                } else {
                                                                    r4 = 1;
                                                                    try {
                                                                        c0322b2.m717b(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        c0322b2.f620h = null;
                                                                        c0322b2.f619g = null;
                                                                        z3 = true;
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        Throwable th4 = th;
                                                                        try {
                                                                            fileOutputStream.close();
                                                                            throw th4;
                                                                        } catch (Throwable th5) {
                                                                            th4.addSuppressed(th5);
                                                                            throw th4;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            Throwable th7 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th7;
                                                            } catch (Throwable th8) {
                                                                th7.addSuppressed(th8);
                                                                throw th7;
                                                            }
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                }
                                            } catch (FileNotFoundException e15) {
                                                e = e15;
                                                r442222 = 1;
                                                c0322b2.m717b(6, e);
                                                r42 = r442222;
                                                z3 = false;
                                                r4 = r42;
                                                if (z3) {
                                                }
                                                AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                                            } catch (IOException e16) {
                                                e = e16;
                                                r442222 = 1;
                                                c0322b2.m717b(7, e);
                                                r42 = r442222;
                                                z3 = false;
                                                r4 = r42;
                                                if (z3) {
                                                }
                                                AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                                            }
                                        } catch (FileNotFoundException e17) {
                                            e = e17;
                                            c0322b2.m717b(6, e);
                                            r42 = r442222;
                                            z3 = false;
                                            r4 = r42;
                                            if (z3) {
                                            }
                                            AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                                        } catch (IOException e18) {
                                            e = e18;
                                            c0322b2.m717b(7, e);
                                            r42 = r442222;
                                            z3 = false;
                                            r4 = r42;
                                            if (z3) {
                                            }
                                            AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                                        }
                                    } finally {
                                        c0322b2.f620h = null;
                                        c0322b2.f619g = null;
                                    }
                                }
                                if (z3) {
                                    m732e(packageInfo, filesDir);
                                }
                                AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                        }
                    }
                    InterfaceC0326f interfaceC0326f222222 = c0322b2.f614b;
                    c0323cArr2 = c0322b2.f619g;
                    ?? r4422222 = bArr3;
                    if (c0323cArr2 != null) {
                    }
                    bArr = c0322b2.f620h;
                    if (bArr != null) {
                    }
                    if (z3) {
                    }
                    AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
                } catch (Throwable th11) {
                    th = th11;
                }
            }
            r4 = 1;
            z3 = false;
            AbstractC0335o.m756c(context, (z3 && z2) ? r4 : 0);
        } catch (PackageManager.NameNotFoundException e19) {
            interfaceC0326f.mo348n(7, e19);
            AbstractC0335o.m756c(context, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m747t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: u */
    public static void m748u(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        m747t(byteArrayOutputStream, i2, 2);
    }
}
