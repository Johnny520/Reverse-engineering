package p000a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: a.Kc */
/* JADX INFO: loaded from: classes.dex */
public final class C0195Kc {

    /* JADX INFO: renamed from: a */
    public static final byte[] f660a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f661b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: a */
    public static byte[] m533a(C0589g5[] c0589g5Arr, byte[] bArr) throws IOException {
        int length = 0;
        for (C0589g5 c0589g5 : c0589g5Arr) {
            length += ((((c0589g5.f2198g * 2) + 7) & (-8)) / 8) + (c0589g5.f2196e * 2) + m534b(c0589g5.f2192a, c0589g5.f2193b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0589g5.f2197f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, C0213Lc.f727c)) {
            for (C0589g5 c0589g52 : c0589g5Arr) {
                m542j(byteArrayOutputStream, c0589g52, m534b(c0589g52.f2192a, c0589g52.f2193b, bArr));
                m544l(byteArrayOutputStream, c0589g52);
                int[] iArr = c0589g52.f2199h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    C0889w1.m2141a0(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m543k(byteArrayOutputStream, c0589g52);
            }
        } else {
            for (C0589g5 c0589g53 : c0589g5Arr) {
                m542j(byteArrayOutputStream, c0589g53, m534b(c0589g53.f2192a, c0589g53.f2193b, bArr));
            }
            for (C0589g5 c0589g54 : c0589g5Arr) {
                m544l(byteArrayOutputStream, c0589g54);
                int[] iArr2 = c0589g54.f2199h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    C0889w1.m2141a0(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m543k(byteArrayOutputStream, c0589g54);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: b */
    public static String m534b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = C0213Lc.f729e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C0213Lc.f728d;
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
                return C0944z.m2228h(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m535c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM2134U = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM2134U += (int) C0889w1.m2134U(byteArrayInputStream, 2);
            iArr[i2] = iM2134U;
        }
        return iArr;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX INFO: renamed from: d */
    public static C0589g5[] m536d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0589g5[] c0589g5Arr) throws IOException {
        byte[] bArr3 = C0213Lc.f730f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C0213Lc.f731g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM2134U = (int) C0889w1.m2134U(fileInputStream, 2);
            byte[] bArrM2130Q = C0889w1.m2130Q(fileInputStream, (int) C0889w1.m2134U(fileInputStream, 4), (int) C0889w1.m2134U(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2130Q);
            try {
                C0589g5[] c0589g5ArrM538f = m538f(byteArrayInputStream, bArr2, iM2134U, c0589g5Arr);
                byteArrayInputStream.close();
                return c0589g5ArrM538f;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(C0213Lc.f725a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2134U2 = (int) C0889w1.m2134U(fileInputStream, 1);
        byte[] bArrM2130Q2 = C0889w1.m2130Q(fileInputStream, (int) C0889w1.m2134U(fileInputStream, 4), (int) C0889w1.m2134U(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM2130Q2);
        try {
            C0589g5[] c0589g5ArrM537e = m537e(byteArrayInputStream2, iM2134U2, c0589g5Arr);
            byteArrayInputStream2.close();
            return c0589g5ArrM537e;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0589g5[] m537e(ByteArrayInputStream byteArrayInputStream, int i, C0589g5[] c0589g5Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0589g5[0];
        }
        if (i != c0589g5Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM2134U = (int) C0889w1.m2134U(byteArrayInputStream, 2);
            iArr[i2] = (int) C0889w1.m2134U(byteArrayInputStream, 2);
            strArr[i2] = new String(C0889w1.m2129P(byteArrayInputStream, iM2134U), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0589g5 c0589g5 = c0589g5Arr[i3];
            if (!c0589g5.f2193b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c0589g5.f2196e = i4;
            c0589g5.f2199h = m535c(byteArrayInputStream, i4);
        }
        return c0589g5Arr;
    }

    /* JADX INFO: renamed from: f */
    public static C0589g5[] m538f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0589g5[] c0589g5Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0589g5[0];
        }
        if (i != c0589g5Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            C0889w1.m2134U(byteArrayInputStream, 2);
            String str = new String(C0889w1.m2129P(byteArrayInputStream, (int) C0889w1.m2134U(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM2134U = C0889w1.m2134U(byteArrayInputStream, 4);
            int iM2134U = (int) C0889w1.m2134U(byteArrayInputStream, 2);
            C0589g5 c0589g5 = null;
            if (c0589g5Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c0589g5Arr.length) {
                        break;
                    }
                    if (c0589g5Arr[i3].f2193b.equals(strSubstring)) {
                        c0589g5 = c0589g5Arr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c0589g5 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0589g5.f2195d = jM2134U;
            int[] iArrM535c = m535c(byteArrayInputStream, iM2134U);
            if (Arrays.equals(bArr, C0213Lc.f729e)) {
                c0589g5.f2196e = iM2134U;
                c0589g5.f2199h = iArrM535c;
            }
        }
        return c0589g5Arr;
    }

    /* JADX INFO: renamed from: g */
    public static C0589g5[] m539g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, C0213Lc.f726b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM2134U = (int) C0889w1.m2134U(fileInputStream, 1);
        byte[] bArrM2130Q = C0889w1.m2130Q(fileInputStream, (int) C0889w1.m2134U(fileInputStream, 4), (int) C0889w1.m2134U(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2130Q);
        try {
            C0589g5[] c0589g5ArrM540h = m540h(byteArrayInputStream, str, iM2134U);
            byteArrayInputStream.close();
            return c0589g5ArrM540h;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static C0589g5[] m540h(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0589g5[0];
        }
        C0589g5[] c0589g5Arr = new C0589g5[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM2134U = (int) C0889w1.m2134U(byteArrayInputStream, 2);
            int iM2134U2 = (int) C0889w1.m2134U(byteArrayInputStream, 2);
            c0589g5Arr[i2] = new C0589g5(str, new String(C0889w1.m2129P(byteArrayInputStream, iM2134U), StandardCharsets.UTF_8), C0889w1.m2134U(byteArrayInputStream, 4), iM2134U2, (int) C0889w1.m2134U(byteArrayInputStream, 4), (int) C0889w1.m2134U(byteArrayInputStream, 4), new int[iM2134U2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0589g5 c0589g5 = c0589g5Arr[i3];
            int iAvailable = byteArrayInputStream.available() - c0589g5.f2197f;
            int iM2134U3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c0589g5.f2200i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM2134U3 += (int) C0889w1.m2134U(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM2134U3), 1);
                for (int iM2134U4 = (int) C0889w1.m2134U(byteArrayInputStream, 2); iM2134U4 > 0; iM2134U4--) {
                    C0889w1.m2134U(byteArrayInputStream, 2);
                    int iM2134U5 = (int) C0889w1.m2134U(byteArrayInputStream, 1);
                    if (iM2134U5 != 6 && iM2134U5 != 7) {
                        while (iM2134U5 > 0) {
                            C0889w1.m2134U(byteArrayInputStream, 1);
                            for (int iM2134U6 = (int) C0889w1.m2134U(byteArrayInputStream, 1); iM2134U6 > 0; iM2134U6--) {
                                C0889w1.m2134U(byteArrayInputStream, 2);
                            }
                            iM2134U5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0589g5.f2199h = m535c(byteArrayInputStream, c0589g5.f2196e);
            int i4 = c0589g5.f2198g;
            BitSet bitSetValueOf = BitSet.valueOf(C0889w1.m2129P(byteArrayInputStream, (((i4 * 2) + 7) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(i5) ? 2 : 0;
                if (bitSetValueOf.get(i5 + i4)) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return c0589g5Arr;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: i */
    public static boolean m541i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0589g5[] c0589g5Arr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = C0213Lc.f725a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C0213Lc.f726b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM533a = m533a(c0589g5Arr, bArr3);
                C0889w1.m2139Z(byteArrayOutputStream, c0589g5Arr.length, 1);
                C0889w1.m2139Z(byteArrayOutputStream, bArrM533a.length, 4);
                byte[] bArrM2148g = C0889w1.m2148g(bArrM533a);
                C0889w1.m2139Z(byteArrayOutputStream, bArrM2148g.length, 4);
                byteArrayOutputStream.write(bArrM2148g);
                return true;
            }
            byte[] bArr4 = C0213Lc.f728d;
            if (Arrays.equals(bArr, bArr4)) {
                C0889w1.m2139Z(byteArrayOutputStream, c0589g5Arr.length, 1);
                for (C0589g5 c0589g5 : c0589g5Arr) {
                    int size = c0589g5.f2200i.size() * 4;
                    String strM534b = m534b(c0589g5.f2192a, c0589g5.f2193b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    C0889w1.m2141a0(byteArrayOutputStream, strM534b.getBytes(charset).length);
                    C0889w1.m2141a0(byteArrayOutputStream, c0589g5.f2199h.length);
                    C0889w1.m2139Z(byteArrayOutputStream, size, 4);
                    C0889w1.m2139Z(byteArrayOutputStream, c0589g5.f2194c, 4);
                    byteArrayOutputStream.write(strM534b.getBytes(charset));
                    Iterator<Integer> it = c0589g5.f2200i.keySet().iterator();
                    while (it.hasNext()) {
                        C0889w1.m2141a0(byteArrayOutputStream, it.next().intValue());
                        C0889w1.m2141a0(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c0589g5.f2199h) {
                        C0889w1.m2141a0(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = C0213Lc.f727c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM533a2 = m533a(c0589g5Arr, bArr5);
                C0889w1.m2139Z(byteArrayOutputStream, c0589g5Arr.length, 1);
                C0889w1.m2139Z(byteArrayOutputStream, bArrM533a2.length, 4);
                byte[] bArrM2148g2 = C0889w1.m2148g(bArrM533a2);
                C0889w1.m2139Z(byteArrayOutputStream, bArrM2148g2.length, 4);
                byteArrayOutputStream.write(bArrM2148g2);
                return true;
            }
            byte[] bArr6 = C0213Lc.f729e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C0889w1.m2141a0(byteArrayOutputStream, c0589g5Arr.length);
            for (C0589g5 c0589g52 : c0589g5Arr) {
                String strM534b2 = m534b(c0589g52.f2192a, c0589g52.f2193b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                C0889w1.m2141a0(byteArrayOutputStream, strM534b2.getBytes(charset2).length);
                TreeMap<Integer, Integer> treeMap = c0589g52.f2200i;
                C0889w1.m2141a0(byteArrayOutputStream, treeMap.size());
                C0889w1.m2141a0(byteArrayOutputStream, c0589g52.f2199h.length);
                C0889w1.m2139Z(byteArrayOutputStream, c0589g52.f2194c, 4);
                byteArrayOutputStream.write(strM534b2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C0889w1.m2141a0(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i3 : c0589g52.f2199h) {
                    C0889w1.m2141a0(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C0889w1.m2141a0(byteArrayOutputStream2, c0589g5Arr.length);
            int i4 = 2;
            int i5 = 2;
            for (C0589g5 c0589g53 : c0589g5Arr) {
                C0889w1.m2139Z(byteArrayOutputStream2, c0589g53.f2194c, 4);
                C0889w1.m2139Z(byteArrayOutputStream2, c0589g53.f2195d, 4);
                C0889w1.m2139Z(byteArrayOutputStream2, c0589g53.f2198g, 4);
                String strM534b3 = m534b(c0589g53.f2192a, c0589g53.f2193b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM534b3.getBytes(charset3).length;
                C0889w1.m2141a0(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM534b3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C0905wh c0905wh = new C0905wh(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0905wh);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c0589g5Arr.length) {
                try {
                    C0589g5 c0589g54 = c0589g5Arr[i6];
                    C0889w1.m2141a0(byteArrayOutputStream3, i6);
                    C0889w1.m2141a0(byteArrayOutputStream3, c0589g54.f2196e);
                    i7 = i7 + 4 + (c0589g54.f2196e * i4);
                    int[] iArr = c0589g54.f2199h;
                    int length3 = iArr.length;
                    int i8 = i;
                    int i9 = i4;
                    int i10 = i8;
                    while (i10 < length3) {
                        int i11 = iArr[i10];
                        C0889w1.m2141a0(byteArrayOutputStream3, i11 - i8);
                        i10++;
                        i8 = i11;
                    }
                    i6++;
                    i4 = i9;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            C0905wh c0905wh2 = new C0905wh(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0905wh2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < c0589g5Arr.length) {
                try {
                    C0589g5 c0589g55 = c0589g5Arr[i12];
                    Iterator<Map.Entry<Integer, Integer>> it3 = c0589g55.f2200i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m543k(byteArrayOutputStream4, c0589g55);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m544l(byteArrayOutputStream4, c0589g55);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            C0889w1.m2141a0(byteArrayOutputStream3, i12);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            C0889w1.m2139Z(byteArrayOutputStream3, length4, 4);
                            C0889w1.m2141a0(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
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
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            C0905wh c0905wh3 = new C0905wh(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0905wh3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + ((long) (arrayList2.size() * 16));
            C0889w1.m2139Z(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                C0905wh c0905wh4 = (C0905wh) arrayList2.get(i15);
                int i16 = c0905wh4.f3506a;
                if (i16 == 1) {
                    j = 0;
                } else if (i16 == 2) {
                    j = 1;
                } else if (i16 == 3) {
                    j = 2;
                } else if (i16 == 4) {
                    j = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                C0889w1.m2139Z(byteArrayOutputStream, j, 4);
                C0889w1.m2139Z(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0905wh4.f3507b;
                if (c0905wh4.f3508c) {
                    long length5 = bArr7.length;
                    byte[] bArrM2148g3 = C0889w1.m2148g(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM2148g3);
                    C0889w1.m2139Z(byteArrayOutputStream, bArrM2148g3.length, 4);
                    C0889w1.m2139Z(byteArrayOutputStream, length5, 4);
                    length = bArrM2148g3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    C0889w1.m2139Z(byteArrayOutputStream, bArr7.length, 4);
                    C0889w1.m2139Z(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
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

    /* JADX INFO: renamed from: j */
    public static void m542j(ByteArrayOutputStream byteArrayOutputStream, C0589g5 c0589g5, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        C0889w1.m2141a0(byteArrayOutputStream, str.getBytes(charset).length);
        C0889w1.m2141a0(byteArrayOutputStream, c0589g5.f2196e);
        C0889w1.m2139Z(byteArrayOutputStream, c0589g5.f2197f, 4);
        C0889w1.m2139Z(byteArrayOutputStream, c0589g5.f2194c, 4);
        C0889w1.m2139Z(byteArrayOutputStream, c0589g5.f2198g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: k */
    public static void m543k(ByteArrayOutputStream byteArrayOutputStream, C0589g5 c0589g5) throws IOException {
        byte[] bArr = new byte[(((c0589g5.f2198g * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c0589g5.f2200i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c0589g5.f2198g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m544l(ByteArrayOutputStream byteArrayOutputStream, C0589g5 c0589g5) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c0589g5.f2200i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C0889w1.m2141a0(byteArrayOutputStream, iIntValue - i);
                C0889w1.m2141a0(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
