package p022L;

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
import p012G.C0140d;

/* JADX INFO: renamed from: L.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0177g {

    /* JADX INFO: renamed from: a */
    public static final C0140d f514a = new C0140d(4);

    /* JADX INFO: renamed from: b */
    public static final byte[] f515b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f516c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f517d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f518e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f519f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f520g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f521h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f522i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f523j = {48, 48, 50, 0};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static byte[] m362a(byte[] bArr) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static byte[] m363b(C0173c[] c0173cArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C0173c c0173c : c0173cArr) {
            length += ((((c0173c.f511g * 2) + 7) & (-8)) / 8) + (c0173c.f509e * 2) + m365d(c0173c.f505a, c0173c.f506b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0173c.f510f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f519f)) {
            for (C0173c c0173c2 : c0173cArr) {
                m377p(byteArrayOutputStream, c0173c2, m365d(c0173c2.f505a, c0173c2.f506b, bArr));
                m379r(byteArrayOutputStream, c0173c2);
                int[] iArr = c0173c2.f512h;
                int length2 = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = iArr[i2];
                    m382u(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                m378q(byteArrayOutputStream, c0173c2);
            }
        } else {
            for (C0173c c0173c3 : c0173cArr) {
                m377p(byteArrayOutputStream, c0173c3, m365d(c0173c3.f505a, c0173c3.f506b, bArr));
            }
            for (C0173c c0173c4 : c0173cArr) {
                m379r(byteArrayOutputStream, c0173c4);
                int[] iArr2 = c0173c4.f512h;
                int length3 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length3) {
                    int i7 = iArr2[i5];
                    m382u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                m378q(byteArrayOutputStream, c0173c4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m364c(File file) {
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
            z2 = m364c(file2) && z2;
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m365d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f521h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f520g;
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
                return AbstractC0174d.m356l(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m366e(PackageInfo packageInfo, File file) {
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
    public static byte[] m367f(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException(AbstractC0174d.m351g(i2, "Not enough bytes to read: "));
            }
            i3 += i4;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int[] m368g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iM374m = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iM374m += (int) m374m(byteArrayInputStream, 2);
            iArr[i3] = iM374m;
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static byte[] m369h(FileInputStream fileInputStream, int i2, int i3) {
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

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C0173c[] m370i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0173c[] c0173cArr) throws IOException {
        byte[] bArr3 = f522i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f523j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM374m = (int) m374m(fileInputStream, 2);
            byte[] bArrM369h = m369h(fileInputStream, (int) m374m(fileInputStream, 4), (int) m374m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM369h);
            try {
                C0173c[] c0173cArrM372k = m372k(byteArrayInputStream, bArr2, iM374m, c0173cArr);
                byteArrayInputStream.close();
                return c0173cArrM372k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f517d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM374m2 = (int) m374m(fileInputStream, 1);
        byte[] bArrM369h2 = m369h(fileInputStream, (int) m374m(fileInputStream, 4), (int) m374m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM369h2);
        try {
            C0173c[] c0173cArrM371j = m371j(byteArrayInputStream2, iM374m2, c0173cArr);
            byteArrayInputStream2.close();
            return c0173cArrM371j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C0173c[] m371j(ByteArrayInputStream byteArrayInputStream, int i2, C0173c[] c0173cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0173c[0];
        }
        if (i2 != c0173cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM374m = (int) m374m(byteArrayInputStream, 2);
            iArr[i3] = (int) m374m(byteArrayInputStream, 2);
            strArr[i3] = new String(m367f(byteArrayInputStream, iM374m), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0173c c0173c = c0173cArr[i4];
            if (!c0173c.f506b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c0173c.f509e = i5;
            c0173c.f512h = m368g(byteArrayInputStream, i5);
        }
        return c0173cArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C0173c[] m372k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0173c[] c0173cArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0173c[0];
        }
        if (i2 != c0173cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m374m(byteArrayInputStream, 2);
            String str = new String(m367f(byteArrayInputStream, (int) m374m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM374m = m374m(byteArrayInputStream, 4);
            int iM374m = (int) m374m(byteArrayInputStream, 2);
            C0173c c0173c = null;
            if (c0173cArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= c0173cArr.length) {
                        break;
                    }
                    if (c0173cArr[i4].f506b.equals(strSubstring)) {
                        c0173c = c0173cArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (c0173c == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0173c.f508d = jM374m;
            int[] iArrM368g = m368g(byteArrayInputStream, iM374m);
            if (Arrays.equals(bArr, f521h)) {
                c0173c.f509e = iM374m;
                c0173c.f512h = iArrM368g;
            }
        }
        return c0173cArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static C0173c[] m373l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f518e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM374m = (int) m374m(fileInputStream, 1);
        byte[] bArrM369h = m369h(fileInputStream, (int) m374m(fileInputStream, 4), (int) m374m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM369h);
        try {
            C0173c[] c0173cArrM375n = m375n(byteArrayInputStream, str, iM374m);
            byteArrayInputStream.close();
            return c0173cArrM375n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static long m374m(InputStream inputStream, int i2) throws IOException {
        byte[] bArrM367f = m367f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrM367f[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C0173c[] m375n(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0173c[0];
        }
        C0173c[] c0173cArr = new C0173c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM374m = (int) m374m(byteArrayInputStream, 2);
            int iM374m2 = (int) m374m(byteArrayInputStream, 2);
            c0173cArr[i3] = new C0173c(str, new String(m367f(byteArrayInputStream, iM374m), StandardCharsets.UTF_8), m374m(byteArrayInputStream, 4), iM374m2, (int) m374m(byteArrayInputStream, 4), (int) m374m(byteArrayInputStream, 4), new int[iM374m2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0173c c0173c = c0173cArr[i4];
            int iAvailable = byteArrayInputStream.available() - c0173c.f510f;
            int iM374m3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c0173c.f513i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM374m3 += (int) m374m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM374m3), 1);
                for (int iM374m4 = (int) m374m(byteArrayInputStream, 2); iM374m4 > 0; iM374m4--) {
                    m374m(byteArrayInputStream, 2);
                    int iM374m5 = (int) m374m(byteArrayInputStream, 1);
                    if (iM374m5 != 6 && iM374m5 != 7) {
                        while (iM374m5 > 0) {
                            m374m(byteArrayInputStream, 1);
                            for (int iM374m6 = (int) m374m(byteArrayInputStream, 1); iM374m6 > 0; iM374m6--) {
                                m374m(byteArrayInputStream, 2);
                            }
                            iM374m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0173c.f512h = m368g(byteArrayInputStream, c0173c.f509e);
            int i5 = c0173c.f511g;
            BitSet bitSetValueOf = BitSet.valueOf(m367f(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
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
        return c0173cArr;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: o */
    public static boolean m376o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0173c[] c0173cArr) throws IOException {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f517d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f518e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM363b = m363b(c0173cArr, bArr3);
                m381t(byteArrayOutputStream, c0173cArr.length, 1);
                m381t(byteArrayOutputStream, bArrM363b.length, 4);
                byte[] bArrM362a = m362a(bArrM363b);
                m381t(byteArrayOutputStream, bArrM362a.length, 4);
                byteArrayOutputStream.write(bArrM362a);
                return true;
            }
            byte[] bArr4 = f520g;
            if (Arrays.equals(bArr, bArr4)) {
                m381t(byteArrayOutputStream, c0173cArr.length, 1);
                for (C0173c c0173c : c0173cArr) {
                    int size = c0173c.f513i.size() * 4;
                    String strM365d = m365d(c0173c.f505a, c0173c.f506b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m382u(byteArrayOutputStream, strM365d.getBytes(charset).length);
                    m382u(byteArrayOutputStream, c0173c.f512h.length);
                    m381t(byteArrayOutputStream, size, 4);
                    m381t(byteArrayOutputStream, c0173c.f507c, 4);
                    byteArrayOutputStream.write(strM365d.getBytes(charset));
                    Iterator it = c0173c.f513i.keySet().iterator();
                    while (it.hasNext()) {
                        m382u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m382u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0173c.f512h) {
                        m382u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f519f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM363b2 = m363b(c0173cArr, bArr5);
                m381t(byteArrayOutputStream, c0173cArr.length, 1);
                m381t(byteArrayOutputStream, bArrM363b2.length, 4);
                byte[] bArrM362a2 = m362a(bArrM363b2);
                m381t(byteArrayOutputStream, bArrM362a2.length, 4);
                byteArrayOutputStream.write(bArrM362a2);
                return true;
            }
            byte[] bArr6 = f521h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m382u(byteArrayOutputStream, c0173cArr.length);
            for (C0173c c0173c2 : c0173cArr) {
                String strM365d2 = m365d(c0173c2.f505a, c0173c2.f506b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m382u(byteArrayOutputStream, strM365d2.getBytes(charset2).length);
                TreeMap treeMap = c0173c2.f513i;
                m382u(byteArrayOutputStream, treeMap.size());
                m382u(byteArrayOutputStream, c0173c2.f512h.length);
                m381t(byteArrayOutputStream, c0173c2.f507c, 4);
                byteArrayOutputStream.write(strM365d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m382u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0173c2.f512h) {
                    m382u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m382u(byteArrayOutputStream2, c0173cArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0173c c0173c3 : c0173cArr) {
                m381t(byteArrayOutputStream2, c0173c3.f507c, 4);
                m381t(byteArrayOutputStream2, c0173c3.f508d, 4);
                m381t(byteArrayOutputStream2, c0173c3.f511g, 4);
                String strM365d3 = m365d(c0173c3.f505a, c0173c3.f506b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM365d3.getBytes(charset3).length;
                m382u(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strM365d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C0185o c0185o = new C0185o(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0185o);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0173cArr.length) {
                try {
                    C0173c c0173c4 = c0173cArr[i7];
                    m382u(byteArrayOutputStream3, i7);
                    m382u(byteArrayOutputStream3, c0173c4.f509e);
                    i8 = i8 + 4 + (c0173c4.f509e * i5);
                    int[] iArr = c0173c4.f512h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    int i10 = i5;
                    int i11 = i9;
                    while (i11 < length3) {
                        int i12 = iArr[i11];
                        m382u(byteArrayOutputStream3, i12 - i9);
                        i11++;
                        i9 = i12;
                    }
                    i7++;
                    i5 = i10;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C0185o c0185o2 = new C0185o(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0185o2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < c0173cArr.length) {
                try {
                    C0173c c0173c5 = c0173cArr[i13];
                    Iterator it3 = c0173c5.f513i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m378q(byteArrayOutputStream4, c0173c5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m379r(byteArrayOutputStream4, c0173c5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m382u(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i14 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m381t(byteArrayOutputStream3, length4, 4);
                            m382u(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i15 + length4;
                            i13++;
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
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            C0185o c0185o3 = new C0185o(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0185o3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + ((long) (arrayList2.size() * 16));
            m381t(byteArrayOutputStream, arrayList2.size(), 4);
            int i16 = 0;
            while (i16 < arrayList2.size()) {
                C0185o c0185o4 = (C0185o) arrayList2.get(i16);
                int i17 = c0185o4.f534a;
                if (i17 == 1) {
                    j2 = 0;
                } else if (i17 == 2) {
                    j2 = 1;
                } else if (i17 == 3) {
                    j2 = 2;
                } else if (i17 == 4) {
                    j2 = 3;
                } else {
                    if (i17 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                m381t(byteArrayOutputStream, j2, 4);
                m381t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0185o4.f535b;
                if (c0185o4.f536c) {
                    long length5 = bArr7.length;
                    byte[] bArrM362a3 = m362a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM362a3);
                    m381t(byteArrayOutputStream, bArrM362a3.length, 4);
                    m381t(byteArrayOutputStream, length5, 4);
                    length = bArrM362a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m381t(byteArrayOutputStream, bArr7.length, 4);
                    m381t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m377p(ByteArrayOutputStream byteArrayOutputStream, C0173c c0173c, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m382u(byteArrayOutputStream, str.getBytes(charset).length);
        m382u(byteArrayOutputStream, c0173c.f509e);
        m381t(byteArrayOutputStream, c0173c.f510f, 4);
        m381t(byteArrayOutputStream, c0173c.f507c, 4);
        m381t(byteArrayOutputStream, c0173c.f511g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m378q(ByteArrayOutputStream byteArrayOutputStream, C0173c c0173c) throws IOException {
        byte[] bArr = new byte[(((c0173c.f511g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0173c.f513i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i2 = iIntValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i3 = iIntValue + c0173c.f511g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m379r(ByteArrayOutputStream byteArrayOutputStream, C0173c c0173c) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : c0173c.f513i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m382u(byteArrayOutputStream, iIntValue - i2);
                m382u(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:0x0237 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:171:0x0239 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m380s(Context context, Executor executor, InterfaceC0176f interfaceC0176f, boolean z2) {
        FileInputStream fileInputStreamM343a;
        C0173c[] c0173cArrM373l;
        C0173c[] c0173cArr;
        byte[] bArr;
        ?? r7;
        boolean z3;
        ?? r72;
        boolean z4;
        byte[] bArr2;
        ?? byteArrayOutputStream;
        int i2;
        C0172b c0172b;
        FileInputStream fileInputStreamM343a2;
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
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j2 == packageInfo.lastUpdateTime;
                            if (z5) {
                                interfaceC0176f.mo141l(2, null);
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
                        AbstractC0184n.m390c(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0172b c0172b2 = new C0172b(assets, executor, interfaceC0176f, name, file2);
            byte[] bArr3 = c0172b2.f499c;
            if (bArr3 == null) {
                c0172b2.m344b(3, Integer.valueOf(i3));
            } else {
                if (file2.canWrite()) {
                    c0172b2.f502f = true;
                    ?? r74 = f515b;
                    try {
                        fileInputStreamM343a = c0172b2.m343a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        interfaceC0176f.mo141l(6, e2);
                        fileInputStreamM343a = null;
                    } catch (IOException e3) {
                        interfaceC0176f.mo141l(7, e3);
                        fileInputStreamM343a = null;
                    }
                    try {
                        try {
                        } finally {
                        }
                    } catch (IOException e4) {
                        interfaceC0176f.mo141l(7, e4);
                    }
                    if (fileInputStreamM343a != null) {
                        try {
                        } catch (IOException e5) {
                            interfaceC0176f.mo141l(7, e5);
                            fileInputStreamM343a.close();
                            c0173cArrM373l = null;
                        } catch (IllegalStateException e6) {
                            interfaceC0176f.mo141l(8, e6);
                            fileInputStreamM343a.close();
                            c0173cArrM373l = null;
                        }
                        if (!Arrays.equals((byte[]) r74, m367f(fileInputStreamM343a, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c0173cArrM373l = m373l(fileInputStreamM343a, m367f(fileInputStreamM343a, 4), c0172b2.f501e);
                        try {
                            fileInputStreamM343a.close();
                        } catch (IOException e7) {
                            interfaceC0176f.mo141l(7, e7);
                        }
                        c0172b2.f503g = c0173cArrM373l;
                    }
                    C0173c[] c0173cArr2 = c0172b2.f503g;
                    if (c0173cArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 33) {
                        if (i2 != 24 && i2 != 25) {
                            switch (i2) {
                                case 31:
                                case 32:
                                case 33:
                                default:
                                    InterfaceC0176f interfaceC0176f2 = c0172b2.f498b;
                                    c0173cArr = c0172b2.f503g;
                                    if (c0173cArr != null && (bArr2 = c0172b2.f499c) != null) {
                                        if (c0172b2.f502f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(r74);
                                                byteArrayOutputStream.write(bArr2);
                                            } finally {
                                            }
                                        } catch (IOException e8) {
                                            interfaceC0176f2.mo141l(7, e8);
                                        } catch (IllegalStateException e9) {
                                            interfaceC0176f2.mo141l(8, e9);
                                        }
                                        if (m376o(byteArrayOutputStream, bArr2, c0173cArr)) {
                                            c0172b2.f504h = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            c0172b2.f503g = null;
                                        } else {
                                            interfaceC0176f2.mo141l(5, null);
                                            c0172b2.f503g = null;
                                            byteArrayOutputStream.close();
                                        }
                                    }
                                    bArr = c0172b2.f504h;
                                    if (bArr != null) {
                                        z3 = false;
                                        r72 = 1;
                                    } else {
                                        try {
                                            if (!c0172b2.f502f) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                try {
                                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                    try {
                                                        FileOutputStream fileOutputStream = new FileOutputStream(c0172b2.f500d);
                                                        try {
                                                            try {
                                                                byte[] bArr4 = new byte[512];
                                                                while (true) {
                                                                    int i4 = byteArrayInputStream.read(bArr4);
                                                                    if (i4 > 0) {
                                                                        fileOutputStream.write(bArr4, 0, i4);
                                                                    } else {
                                                                        r72 = 1;
                                                                        try {
                                                                            c0172b2.m344b(1, null);
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            c0172b2.f504h = null;
                                                                            c0172b2.f503g = null;
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
                                                } catch (FileNotFoundException e10) {
                                                    e = e10;
                                                    c0172b2.m344b(6, e);
                                                    r7 = r74;
                                                    z3 = false;
                                                    r72 = r7;
                                                    if (z3) {
                                                    }
                                                    z4 = z3;
                                                    r73 = r72;
                                                    AbstractC0184n.m390c(context, (z4 && z2) ? r73 : 0);
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    c0172b2.m344b(7, e);
                                                    r7 = r74;
                                                    z3 = false;
                                                    r72 = r7;
                                                    if (z3) {
                                                    }
                                                    z4 = z3;
                                                    r73 = r72;
                                                    AbstractC0184n.m390c(context, (z4 && z2) ? r73 : 0);
                                                }
                                            } catch (FileNotFoundException e12) {
                                                e = e12;
                                                r74 = 1;
                                                c0172b2.m344b(6, e);
                                                r7 = r74;
                                                z3 = false;
                                                r72 = r7;
                                                if (z3) {
                                                }
                                                z4 = z3;
                                                r73 = r72;
                                                AbstractC0184n.m390c(context, (z4 && z2) ? r73 : 0);
                                            } catch (IOException e13) {
                                                e = e13;
                                                r74 = 1;
                                                c0172b2.m344b(7, e);
                                                r7 = r74;
                                                z3 = false;
                                                r72 = r7;
                                                if (z3) {
                                                }
                                                z4 = z3;
                                                r73 = r72;
                                                AbstractC0184n.m390c(context, (z4 && z2) ? r73 : 0);
                                            }
                                        } finally {
                                            c0172b2.f504h = null;
                                            c0172b2.f503g = null;
                                        }
                                    }
                                    if (z3) {
                                        m366e(packageInfo, filesDir);
                                    }
                                    z4 = z3;
                                    r73 = r72;
                                    break;
                            }
                        } else {
                            try {
                                fileInputStreamM343a2 = c0172b2.m343a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e14) {
                                interfaceC0176f.mo141l(9, e14);
                            } catch (IOException e15) {
                                interfaceC0176f.mo141l(7, e15);
                            } catch (IllegalStateException e16) {
                                c0172b2.f503g = null;
                                interfaceC0176f.mo141l(8, e16);
                            }
                            if (fileInputStreamM343a2 != null) {
                                try {
                                    if (!Arrays.equals(f516c, m367f(fileInputStreamM343a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c0172b2.f503g = m370i(fileInputStreamM343a2, m367f(fileInputStreamM343a2, 4), bArr3, c0173cArr2);
                                    fileInputStreamM343a2.close();
                                    c0172b = c0172b2;
                                    if (c0172b != null) {
                                        c0172b2 = c0172b;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM343a2 != null) {
                                    fileInputStreamM343a2.close();
                                }
                                c0172b = null;
                                if (c0172b != null) {
                                }
                            }
                        }
                        AbstractC0184n.m390c(context, (z4 && z2) ? r73 : 0);
                    }
                    InterfaceC0176f interfaceC0176f22 = c0172b2.f498b;
                    c0173cArr = c0172b2.f503g;
                    if (c0173cArr != null) {
                        if (c0172b2.f502f) {
                        }
                    }
                    bArr = c0172b2.f504h;
                    if (bArr != null) {
                    }
                    if (z3) {
                    }
                    z4 = z3;
                    r73 = r72;
                    AbstractC0184n.m390c(context, (z4 && z2) ? r73 : 0);
                }
                c0172b2.m344b(4, null);
            }
            z4 = false;
            r73 = 1;
            AbstractC0184n.m390c(context, (z4 && z2) ? r73 : 0);
        } catch (PackageManager.NameNotFoundException e17) {
            interfaceC0176f.mo141l(7, e17);
            AbstractC0184n.m390c(context, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m381t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m382u(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        m381t(byteArrayOutputStream, i2, 2);
    }
}
