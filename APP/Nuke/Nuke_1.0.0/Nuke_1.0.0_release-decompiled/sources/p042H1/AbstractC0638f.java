package p042H1;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: H1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0638f {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2027a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f2028b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f2029c = {48, 49, 53, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f2030d = {48, 49, 48, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f2031e = {48, 48, 57, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f2032f = {48, 48, 53, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f2033g = {48, 48, 49, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f2034h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f2035i = {48, 48, 50, 0};

    /* JADX INFO: renamed from: a */
    public static byte[] m1089a(byte[] bArr) {
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
    public static byte[] m1090b(C0635c[] c0635cArr, byte[] bArr) throws IOException {
        int i5 = 0;
        int length = 0;
        for (C0635c c0635c : c0635cArr) {
            length += ((((c0635c.f2024g * 2) + 7) & (-8)) / 8) + (c0635c.f2022e * 2) + m1092d(c0635c.f2018a, c0635c.f2019b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0635c.f2023f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f2031e)) {
            int length2 = c0635cArr.length;
            while (i5 < length2) {
                C0635c c0635c2 = c0635cArr[i5];
                m1105q(byteArrayOutputStream, c0635c2, m1092d(c0635c2.f2018a, c0635c2.f2019b, bArr));
                m1104p(byteArrayOutputStream, c0635c2);
                i5++;
            }
        } else {
            for (C0635c c0635c3 : c0635cArr) {
                m1105q(byteArrayOutputStream, c0635c3, m1092d(c0635c3.f2018a, c0635c3.f2019b, bArr));
            }
            int length3 = c0635cArr.length;
            while (i5 < length3) {
                m1104p(byteArrayOutputStream, c0635cArr[i5]);
                i5++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1091c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z5 = true;
        for (File file2 : fileArrListFiles) {
            z5 = m1091c(file2) && z5;
        }
        return z5;
    }

    /* JADX INFO: renamed from: d */
    public static String m1092d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f2033g;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f2032f;
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
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return AbstractC0231b.m403n(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: e */
    public static void m1093e(PackageInfo packageInfo, File file) {
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
    public static byte[] m1094f(InputStream inputStream, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int i7 = inputStream.read(bArr, i6, i5 - i6);
            if (i7 < 0) {
                throw new IllegalStateException(AbstractC0231b.m398i("Not enough bytes to read: ", i5));
            }
            i6 += i7;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m1095g(ByteArrayInputStream byteArrayInputStream, int i5) {
        int[] iArr = new int[i5];
        int iM1101m = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            iM1101m += (int) m1101m(byteArrayInputStream, 2);
            iArr[i6] = iM1101m;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m1096h(FileInputStream fileInputStream, int i5, int i6) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i6];
            byte[] bArr2 = new byte[2048];
            int i7 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i7 < i5) {
                int i8 = fileInputStream.read(bArr2);
                if (i8 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i5 + " bytes");
                }
                inflater.setInput(bArr2, 0, i8);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i6 - iInflate);
                    i7 += i8;
                } catch (DataFormatException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            }
            if (i7 == i5) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i5 + " actual=" + i7);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0635c[] m1097i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0635c[] c0635cArr) throws IOException {
        byte[] bArr3 = f2034h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f2035i)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM1101m = (int) m1101m(fileInputStream, 2);
            byte[] bArrM1096h = m1096h(fileInputStream, (int) m1101m(fileInputStream, 4), (int) m1101m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1096h);
            try {
                C0635c[] c0635cArrM1099k = m1099k(byteArrayInputStream, bArr2, iM1101m, c0635cArr);
                byteArrayInputStream.close();
                return c0635cArrM1099k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f2029c, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM1101m2 = (int) m1101m(fileInputStream, 1);
        byte[] bArrM1096h2 = m1096h(fileInputStream, (int) m1101m(fileInputStream, 4), (int) m1101m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM1096h2);
        try {
            C0635c[] c0635cArrM1098j = m1098j(byteArrayInputStream2, iM1101m2, c0635cArr);
            byteArrayInputStream2.close();
            return c0635cArrM1098j;
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
    public static C0635c[] m1098j(ByteArrayInputStream byteArrayInputStream, int i5, C0635c[] c0635cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0635c[0];
        }
        if (i5 != c0635cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i5];
        int[] iArr = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int iM1101m = (int) m1101m(byteArrayInputStream, 2);
            iArr[i6] = (int) m1101m(byteArrayInputStream, 2);
            strArr[i6] = new String(m1094f(byteArrayInputStream, iM1101m), StandardCharsets.UTF_8);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            C0635c c0635c = c0635cArr[i7];
            if (!c0635c.f2019b.equals(strArr[i7])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i8 = iArr[i7];
            c0635c.f2022e = i8;
            c0635c.f2025h = m1095g(byteArrayInputStream, i8);
        }
        return c0635cArr;
    }

    /* JADX INFO: renamed from: k */
    public static C0635c[] m1099k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i5, C0635c[] c0635cArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0635c[0];
        }
        if (i5 != c0635cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            m1101m(byteArrayInputStream, 2);
            String str = new String(m1094f(byteArrayInputStream, (int) m1101m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM1101m = m1101m(byteArrayInputStream, 4);
            int iM1101m = (int) m1101m(byteArrayInputStream, 2);
            C0635c c0635c = null;
            if (c0635cArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i7 = 0;
                while (true) {
                    if (i7 >= c0635cArr.length) {
                        break;
                    }
                    if (c0635cArr[i7].f2019b.equals(strSubstring)) {
                        c0635c = c0635cArr[i7];
                        break;
                    }
                    i7++;
                }
            }
            if (c0635c == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0635c.f2021d = jM1101m;
            int[] iArrM1095g = m1095g(byteArrayInputStream, iM1101m);
            if (Arrays.equals(bArr, f2033g)) {
                c0635c.f2022e = iM1101m;
                c0635c.f2025h = iArrM1095g;
            }
        }
        return c0635cArr;
    }

    /* JADX INFO: renamed from: l */
    public static C0635c[] m1100l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f2030d)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM1101m = (int) m1101m(fileInputStream, 1);
        byte[] bArrM1096h = m1096h(fileInputStream, (int) m1101m(fileInputStream, 4), (int) m1101m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1096h);
        try {
            C0635c[] c0635cArrM1102n = m1102n(byteArrayInputStream, str, iM1101m);
            byteArrayInputStream.close();
            return c0635cArrM1102n;
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
    public static long m1101m(InputStream inputStream, int i5) throws IOException {
        byte[] bArrM1094f = m1094f(inputStream, i5);
        long j5 = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            j5 += ((long) (bArrM1094f[i6] & 255)) << (i6 * 8);
        }
        return j5;
    }

    /* JADX INFO: renamed from: n */
    public static C0635c[] m1102n(ByteArrayInputStream byteArrayInputStream, String str, int i5) throws IOException {
        int i6 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0635c[0];
        }
        C0635c[] c0635cArr = new C0635c[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            int iM1101m = (int) m1101m(byteArrayInputStream, 2);
            int iM1101m2 = (int) m1101m(byteArrayInputStream, 2);
            c0635cArr[i7] = new C0635c(str, new String(m1094f(byteArrayInputStream, iM1101m), StandardCharsets.UTF_8), m1101m(byteArrayInputStream, 4), iM1101m2, (int) m1101m(byteArrayInputStream, 4), (int) m1101m(byteArrayInputStream, 4), new int[iM1101m2], new TreeMap());
        }
        int i8 = 0;
        while (i8 < i5) {
            C0635c c0635c = c0635cArr[i8];
            int iAvailable = byteArrayInputStream.available();
            int i9 = c0635c.f2023f;
            int i10 = c0635c.f2024g;
            TreeMap treeMap = c0635c.f2026i;
            int i11 = iAvailable - i9;
            int iM1101m3 = i6;
            while (byteArrayInputStream.available() > i11) {
                iM1101m3 += (int) m1101m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM1101m3), 1);
                int iM1101m4 = (int) m1101m(byteArrayInputStream, 2);
                while (iM1101m4 > 0) {
                    m1101m(byteArrayInputStream, 2);
                    int iM1101m5 = (int) m1101m(byteArrayInputStream, 1);
                    if (iM1101m5 != 6 && iM1101m5 != 7) {
                        while (iM1101m5 > 0) {
                            m1101m(byteArrayInputStream, 1);
                            int i12 = i6;
                            int i13 = i8;
                            for (int iM1101m6 = (int) m1101m(byteArrayInputStream, 1); iM1101m6 > 0; iM1101m6--) {
                                m1101m(byteArrayInputStream, 2);
                            }
                            iM1101m5--;
                            i6 = i12;
                            i8 = i13;
                        }
                    }
                    iM1101m4--;
                    i6 = i6;
                    i8 = i8;
                }
            }
            int i14 = i6;
            int i15 = i8;
            if (byteArrayInputStream.available() != i11) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0635c.f2025h = m1095g(byteArrayInputStream, c0635c.f2022e);
            BitSet bitSetValueOf = BitSet.valueOf(m1094f(byteArrayInputStream, (((i10 * 2) + 7) & (-8)) / 8));
            for (int i16 = i14; i16 < i10; i16++) {
                int i17 = bitSetValueOf.get(i16) ? 2 : i14;
                if (bitSetValueOf.get(i16 + i10)) {
                    i17 |= 4;
                }
                if (i17 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i16));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i14);
                    }
                    treeMap.put(Integer.valueOf(i16), Integer.valueOf(i17 | numValueOf.intValue()));
                }
            }
            i8 = i15 + 1;
            i6 = i14;
        }
        return c0635cArr;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: o */
    public static boolean m1103o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0635c[] c0635cArr) throws IOException {
        long j5;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f2029c;
        int i5 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f2030d;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM1090b = m1090b(c0635cArr, bArr3);
                m1108t(byteArrayOutputStream, c0635cArr.length, 1);
                m1108t(byteArrayOutputStream, bArrM1090b.length, 4);
                byte[] bArrM1089a = m1089a(bArrM1090b);
                m1108t(byteArrayOutputStream, bArrM1089a.length, 4);
                byteArrayOutputStream.write(bArrM1089a);
                return true;
            }
            byte[] bArr4 = f2032f;
            if (Arrays.equals(bArr, bArr4)) {
                m1108t(byteArrayOutputStream, c0635cArr.length, 1);
                for (C0635c c0635c : c0635cArr) {
                    int size = c0635c.f2026i.size() * 4;
                    String strM1092d = m1092d(c0635c.f2018a, c0635c.f2019b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m1109u(byteArrayOutputStream, strM1092d.getBytes(charset).length);
                    m1109u(byteArrayOutputStream, c0635c.f2025h.length);
                    m1108t(byteArrayOutputStream, size, 4);
                    m1108t(byteArrayOutputStream, c0635c.f2020c, 4);
                    byteArrayOutputStream.write(strM1092d.getBytes(charset));
                    Iterator it = c0635c.f2026i.keySet().iterator();
                    while (it.hasNext()) {
                        m1109u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m1109u(byteArrayOutputStream, 0);
                    }
                    for (int i6 : c0635c.f2025h) {
                        m1109u(byteArrayOutputStream, i6);
                    }
                }
                return true;
            }
            byte[] bArr5 = f2031e;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM1090b2 = m1090b(c0635cArr, bArr5);
                m1108t(byteArrayOutputStream, c0635cArr.length, 1);
                m1108t(byteArrayOutputStream, bArrM1090b2.length, 4);
                byte[] bArrM1089a2 = m1089a(bArrM1090b2);
                m1108t(byteArrayOutputStream, bArrM1089a2.length, 4);
                byteArrayOutputStream.write(bArrM1089a2);
                return true;
            }
            byte[] bArr6 = f2033g;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m1109u(byteArrayOutputStream, c0635cArr.length);
            for (C0635c c0635c2 : c0635cArr) {
                String str = c0635c2.f2018a;
                TreeMap treeMap = c0635c2.f2026i;
                String strM1092d2 = m1092d(str, c0635c2.f2019b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m1109u(byteArrayOutputStream, strM1092d2.getBytes(charset2).length);
                m1109u(byteArrayOutputStream, treeMap.size());
                m1109u(byteArrayOutputStream, c0635c2.f2025h.length);
                m1108t(byteArrayOutputStream, c0635c2.f2020c, 4);
                byteArrayOutputStream.write(strM1092d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m1109u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i7 : c0635c2.f2025h) {
                    m1109u(byteArrayOutputStream, i7);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m1109u(byteArrayOutputStream2, c0635cArr.length);
            int i8 = 2;
            int i9 = 2;
            for (C0635c c0635c3 : c0635cArr) {
                m1108t(byteArrayOutputStream2, c0635c3.f2020c, 4);
                m1108t(byteArrayOutputStream2, c0635c3.f2021d, 4);
                m1108t(byteArrayOutputStream2, c0635c3.f2024g, 4);
                String strM1092d3 = m1092d(c0635c3.f2018a, c0635c3.f2019b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM1092d3.getBytes(charset3).length;
                m1109u(byteArrayOutputStream2, length2);
                i9 = i9 + 14 + length2;
                byteArrayOutputStream2.write(strM1092d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i9 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            }
            C0642j c0642j = new C0642j(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0642j);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < c0635cArr.length) {
                try {
                    C0635c c0635c4 = c0635cArr[i10];
                    m1109u(byteArrayOutputStream3, i10);
                    m1109u(byteArrayOutputStream3, c0635c4.f2022e);
                    i11 = i11 + 4 + (c0635c4.f2022e * i8);
                    int[] iArr = c0635c4.f2025h;
                    int length3 = iArr.length;
                    int i12 = i5;
                    int i13 = i8;
                    int i14 = i12;
                    while (i14 < length3) {
                        int i15 = iArr[i14];
                        m1109u(byteArrayOutputStream3, i15 - i12);
                        i14++;
                        i12 = i15;
                    }
                    i10++;
                    i8 = i13;
                    i5 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
            }
            C0642j c0642j2 = new C0642j(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0642j2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i16 = 0;
            int i17 = 0;
            while (i16 < c0635cArr.length) {
                try {
                    C0635c c0635c5 = c0635cArr[i16];
                    Iterator it3 = c0635c5.f2026i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m1106r(byteArrayOutputStream4, iIntValue, c0635c5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m1107s(byteArrayOutputStream4, c0635c5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m1109u(byteArrayOutputStream3, i16);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i18 = i17 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m1108t(byteArrayOutputStream3, length4, 4);
                            m1109u(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i17 = i18 + length4;
                            i16++;
                            arrayList3 = arrayList4;
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
            if (i17 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
            }
            C0642j c0642j3 = new C0642j(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0642j3);
            long j6 = 4;
            long size2 = j6 + j6 + 4 + ((long) (arrayList2.size() * 16));
            m1108t(byteArrayOutputStream, arrayList2.size(), 4);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                C0642j c0642j4 = (C0642j) arrayList2.get(i19);
                int i20 = c0642j4.f2043a;
                byte[] bArr7 = c0642j4.f2044b;
                if (i20 == 1) {
                    j5 = 0;
                } else if (i20 == 2) {
                    j5 = 1;
                } else if (i20 == 3) {
                    j5 = 2;
                } else if (i20 == 4) {
                    j5 = 3;
                } else {
                    if (i20 != 5) {
                        throw null;
                    }
                    j5 = 4;
                }
                m1108t(byteArrayOutputStream, j5, 4);
                m1108t(byteArrayOutputStream, size2, 4);
                if (c0642j4.f2045c) {
                    long length5 = bArr7.length;
                    byte[] bArrM1089a3 = m1089a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM1089a3);
                    m1108t(byteArrayOutputStream, bArrM1089a3.length, 4);
                    m1108t(byteArrayOutputStream, length5, 4);
                    length = bArrM1089a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m1108t(byteArrayOutputStream, bArr7.length, 4);
                    m1108t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i19++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
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
    public static void m1104p(ByteArrayOutputStream byteArrayOutputStream, C0635c c0635c) throws IOException {
        m1107s(byteArrayOutputStream, c0635c);
        int i5 = c0635c.f2024g;
        int[] iArr = c0635c.f2025h;
        int length = iArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = iArr[i6];
            m1109u(byteArrayOutputStream, i8 - i7);
            i6++;
            i7 = i8;
        }
        byte[] bArr = new byte[(((i5 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0635c.f2026i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i9 = iIntValue / 8;
                bArr[i9] = (byte) (bArr[i9] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i10 = iIntValue + i5;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: q */
    public static void m1105q(ByteArrayOutputStream byteArrayOutputStream, C0635c c0635c, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m1109u(byteArrayOutputStream, str.getBytes(charset).length);
        m1109u(byteArrayOutputStream, c0635c.f2022e);
        m1108t(byteArrayOutputStream, c0635c.f2023f, 4);
        m1108t(byteArrayOutputStream, c0635c.f2020c, 4);
        m1108t(byteArrayOutputStream, c0635c.f2024g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: r */
    public static void m1106r(ByteArrayOutputStream byteArrayOutputStream, int i5, C0635c c0635c) throws IOException {
        int i6 = c0635c.f2024g;
        byte[] bArr = new byte[(((Integer.bitCount(i5 & (-2)) * i6) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0635c.f2026i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i7 = 0;
            for (int i8 = 1; i8 <= 4; i8 <<= 1) {
                if (i8 != 1 && (i8 & i5) != 0) {
                    if ((i8 & iIntValue2) == i8) {
                        int i9 = (i7 * i6) + iIntValue;
                        int i10 = i9 / 8;
                        bArr[i10] = (byte) ((1 << (i9 % 8)) | bArr[i10]);
                    }
                    i7++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: s */
    public static void m1107s(ByteArrayOutputStream byteArrayOutputStream, C0635c c0635c) throws IOException {
        int i5 = 0;
        for (Map.Entry entry : c0635c.f2026i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m1109u(byteArrayOutputStream, iIntValue - i5);
                m1109u(byteArrayOutputStream, 0);
                i5 = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m1108t(ByteArrayOutputStream byteArrayOutputStream, long j5, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i6] = (byte) ((j5 >> (i6 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: u */
    public static void m1109u(ByteArrayOutputStream byteArrayOutputStream, int i5) throws IOException {
        m1108t(byteArrayOutputStream, i5, 2);
    }
}
