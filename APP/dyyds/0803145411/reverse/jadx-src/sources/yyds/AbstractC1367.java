package yyds;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛶᛶᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1367 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0415 f6359 = new C0415("CLOSED", 1);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final byte[] f6360 = {112, 114, 111, 0};

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final byte[] f6361 = {112, 114, 109, 0};

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static int[] m2764(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM1837 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM1837 += (int) AbstractC0797.m1837(byteArrayInputStream, 2);
            iArr[i2] = iM1837;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static String m2765(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC0024.f8171;
        byte[] bArr3 = AbstractC0024.f8169;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
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
                return AbstractC2104.m4015(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static PorterDuff.Mode m2766(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i != 5) {
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
            }
        }
        return mode;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Drawable m2767(Context context, int i) {
        return C1542.m3174().m3181(context, i);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final long m2768(long j) {
        long j2 = (j << 1) + 1;
        AbstractC0848.f3910.getClass();
        int i = AbstractC0542.f2598;
        return j2;
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static void m2769(ByteArrayOutputStream byteArrayOutputStream, C2265 c2265, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC0797.m1834(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC0797.m1834(byteArrayOutputStream, c2265.f11171);
        AbstractC0797.m1811(byteArrayOutputStream, c2265.f11176, 4);
        AbstractC0797.m1811(byteArrayOutputStream, c2265.f11175, 4);
        AbstractC0797.m1811(byteArrayOutputStream, c2265.f11174, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final long m2770(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : AbstractC0598.m1488(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static final long m2771(int i, EnumC0426 enumC0426) {
        if (enumC0426.compareTo(EnumC0426.SECONDS) > 0) {
            return m2780(i, enumC0426);
        }
        long jConvert = TimeUnit.NANOSECONDS.convert(i, enumC0426.f2176);
        C0135 c0135 = AbstractC0848.f3910;
        long j = jConvert << 1;
        int i2 = AbstractC0542.f2598;
        return j;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static C2265[] m2772(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C2265[] c2265Arr) throws IOException {
        byte[] bArr3 = AbstractC0024.f8164;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC0024.f8165)) {
                C0188.m800("Unsupported meta version");
                return null;
            }
            int iM1837 = (int) AbstractC0797.m1837(fileInputStream, 2);
            byte[] bArrM1821 = AbstractC0797.m1821(fileInputStream, (int) AbstractC0797.m1837(fileInputStream, 4), (int) AbstractC0797.m1837(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C0188.m800("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1821);
            try {
                C2265[] c2265ArrM2777 = m2777(byteArrayInputStream, bArr2, iM1837, c2265Arr);
                byteArrayInputStream.close();
                return c2265ArrM2777;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC0024.f8170, bArr2)) {
            C0188.m800("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C0188.m800("Unsupported meta version");
            return null;
        }
        int iM18372 = (int) AbstractC0797.m1837(fileInputStream, 1);
        byte[] bArrM18212 = AbstractC0797.m1821(fileInputStream, (int) AbstractC0797.m1837(fileInputStream, 4), (int) AbstractC0797.m1837(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C0188.m800("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM18212);
        try {
            C2265[] c2265ArrM2786 = m2786(byteArrayInputStream2, iM18372, c2265Arr);
            byteArrayInputStream2.close();
            return c2265ArrM2786;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static C2265[] m2773(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC0024.f8172)) {
            C0188.m800("Unsupported version");
            return null;
        }
        int iM1837 = (int) AbstractC0797.m1837(fileInputStream, 1);
        byte[] bArrM1821 = AbstractC0797.m1821(fileInputStream, (int) AbstractC0797.m1837(fileInputStream, 4), (int) AbstractC0797.m1837(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C0188.m800("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1821);
        try {
            C2265[] c2265ArrM2784 = m2784(byteArrayInputStream, str, iM1837);
            byteArrayInputStream.close();
            return c2265ArrM2784;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final void m2774(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1579.m3235(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static void m2775(ByteArrayOutputStream byteArrayOutputStream, C2265 c2265) throws IOException {
        int i = 0;
        for (Map.Entry entry : c2265.f11170.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC0797.m1834(byteArrayOutputStream, iIntValue - i);
                AbstractC0797.m1834(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static void m2776(ByteArrayOutputStream byteArrayOutputStream, C2265 c2265) throws IOException {
        m2775(byteArrayOutputStream, c2265);
        int i = c2265.f11174;
        int[] iArr = c2265.f11169;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            AbstractC0797.m1834(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c2265.f11170.entrySet()) {
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

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static C2265[] m2777(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C2265[] c2265Arr) throws IOException {
        C2265 c2265;
        if (byteArrayInputStream.available() == 0) {
            return new C2265[0];
        }
        if (i != c2265Arr.length) {
            C0188.m800("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC0797.m1837(byteArrayInputStream, 2);
            String str = new String(AbstractC0797.m1812(byteArrayInputStream, (int) AbstractC0797.m1837(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM1837 = AbstractC0797.m1837(byteArrayInputStream, 4);
            int iM1837 = (int) AbstractC0797.m1837(byteArrayInputStream, 2);
            if (c2265Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c2265Arr.length; i3++) {
                    if (c2265Arr[i3].f11173.equals(strSubstring)) {
                        c2265 = c2265Arr[i3];
                        break;
                    }
                }
                c2265 = null;
            } else {
                c2265 = null;
            }
            if (c2265 == null) {
                C0188.m800("Missing profile key: ".concat(str));
                return null;
            }
            c2265.f11177 = jM1837;
            int[] iArrM2764 = m2764(byteArrayInputStream, iM1837);
            if (Arrays.equals(bArr, AbstractC0024.f8169)) {
                c2265.f11171 = iM1837;
                c2265.f11169 = iArrM2764;
            }
        }
        return c2265Arr;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final String m2778(Collection collection) {
        return !collection.isEmpty() ? AbstractC0786.m1777(AbstractC1595.m3285(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static boolean m2779(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C2265[] c2265Arr) throws IOException {
        int i;
        long j;
        int length;
        byte[] bArr2 = AbstractC0024.f8169;
        byte[] bArr3 = AbstractC0024.f8171;
        byte[] bArr4 = AbstractC0024.f8170;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = AbstractC0024.f8172;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM2785 = m2785(c2265Arr, bArr5);
                AbstractC0797.m1811(byteArrayOutputStream, c2265Arr.length, 1);
                AbstractC0797.m1811(byteArrayOutputStream, bArrM2785.length, 4);
                byte[] bArrM1838 = AbstractC0797.m1838(bArrM2785);
                AbstractC0797.m1811(byteArrayOutputStream, bArrM1838.length, 4);
                byteArrayOutputStream.write(bArrM1838);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                AbstractC0797.m1811(byteArrayOutputStream, c2265Arr.length, 1);
                for (C2265 c2265 : c2265Arr) {
                    int size = c2265.f11170.size() * 4;
                    String strM2765 = m2765(c2265.f11172, c2265.f11173, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC0797.m1834(byteArrayOutputStream, strM2765.getBytes(charset).length);
                    AbstractC0797.m1834(byteArrayOutputStream, c2265.f11169.length);
                    AbstractC0797.m1811(byteArrayOutputStream, size, 4);
                    AbstractC0797.m1811(byteArrayOutputStream, c2265.f11175, 4);
                    byteArrayOutputStream.write(strM2765.getBytes(charset));
                    Iterator it = c2265.f11170.keySet().iterator();
                    while (it.hasNext()) {
                        AbstractC0797.m1834(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        AbstractC0797.m1834(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c2265.f11169) {
                        AbstractC0797.m1834(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = AbstractC0024.f8166;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM27852 = m2785(c2265Arr, bArr6);
                AbstractC0797.m1811(byteArrayOutputStream, c2265Arr.length, 1);
                AbstractC0797.m1811(byteArrayOutputStream, bArrM27852.length, 4);
                byte[] bArrM18382 = AbstractC0797.m1838(bArrM27852);
                AbstractC0797.m1811(byteArrayOutputStream, bArrM18382.length, 4);
                byteArrayOutputStream.write(bArrM18382);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            AbstractC0797.m1834(byteArrayOutputStream, c2265Arr.length);
            for (C2265 c22652 : c2265Arr) {
                String str = c22652.f11172;
                TreeMap treeMap = c22652.f11170;
                String strM27652 = m2765(str, c22652.f11173, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                AbstractC0797.m1834(byteArrayOutputStream, strM27652.getBytes(charset2).length);
                AbstractC0797.m1834(byteArrayOutputStream, treeMap.size());
                AbstractC0797.m1834(byteArrayOutputStream, c22652.f11169.length);
                AbstractC0797.m1811(byteArrayOutputStream, c22652.f11175, 4);
                byteArrayOutputStream.write(strM27652.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    AbstractC0797.m1834(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c22652.f11169) {
                    AbstractC0797.m1834(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            AbstractC0797.m1834(byteArrayOutputStream2, c2265Arr.length);
            int i5 = 2;
            int i6 = 2;
            for (C2265 c22653 : c2265Arr) {
                AbstractC0797.m1811(byteArrayOutputStream2, c22653.f11175, 4);
                AbstractC0797.m1811(byteArrayOutputStream2, c22653.f11177, 4);
                AbstractC0797.m1811(byteArrayOutputStream2, c22653.f11174, 4);
                String strM27653 = m2765(c22653.f11172, c22653.f11173, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM27653.getBytes(charset3).length;
                AbstractC0797.m1834(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strM27653.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C0210 c0210 = new C0210(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(c0210);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c2265Arr.length) {
                try {
                    C2265 c22654 = c2265Arr[i7];
                    AbstractC0797.m1834(byteArrayOutputStream3, i7);
                    AbstractC0797.m1834(byteArrayOutputStream3, c22654.f11171);
                    i8 = i8 + 4 + (c22654.f11171 * i5);
                    int[] iArr = c22654.f11169;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        AbstractC0797.m1834(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C0210 c02102 = new C0210(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(c02102);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < c2265Arr.length; i13++) {
                try {
                    C2265 c22655 = c2265Arr[i13];
                    Iterator it3 = c22655.f11170.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m2789(byteArrayOutputStream4, iIntValue, c22655);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m2775(byteArrayOutputStream4, c22655);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            AbstractC0797.m1834(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            AbstractC0797.m1811(byteArrayOutputStream3, length4, 4);
                            AbstractC0797.m1834(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
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
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C0210 c02103 = new C0210(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(c02103);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            AbstractC0797.m1811(byteArrayOutputStream, arrayList.size(), 4);
            int i15 = 0;
            while (i15 < arrayList.size()) {
                C0210 c02104 = (C0210) arrayList.get(i15);
                int i16 = c02104.f1216;
                byte[] bArr7 = c02104.f1217;
                if (i16 != 1) {
                    i = i11;
                    if (i16 == i) {
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
                } else {
                    i = i11;
                    j = 0;
                }
                AbstractC0797.m1811(byteArrayOutputStream, j, 4);
                AbstractC0797.m1811(byteArrayOutputStream, size2, 4);
                if (c02104.f1218) {
                    long length5 = bArr7.length;
                    byte[] bArrM18383 = AbstractC0797.m1838(bArr7);
                    arrayList2.add(bArrM18383);
                    AbstractC0797.m1811(byteArrayOutputStream, bArrM18383.length, 4);
                    AbstractC0797.m1811(byteArrayOutputStream, length5, 4);
                    length = bArrM18383.length;
                } else {
                    arrayList2.add(bArr7);
                    AbstractC0797.m1811(byteArrayOutputStream, bArr7.length, 4);
                    AbstractC0797.m1811(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                i11 = i;
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[PHI: r4
  0x006d: PHI (r4v5 long) = (r4v3 long), (r4v4 long), (r4v4 long), (r4v4 long), (r4v4 long) binds: [B:31:0x006b, B:47:0x0099, B:50:0x009f, B:42:0x0085, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m2780(long j, EnumC0426 enumC0426) {
        long j2;
        TimeUnit timeUnit = enumC0426.f2176;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            C0135 c0135 = AbstractC0848.f3910;
            long j3 = jConvert2 << 1;
            int i = AbstractC0542.f2598;
            return j3;
        }
        if (enumC0426.compareTo(EnumC0426.MILLISECONDS) < 0) {
            return m2768(AbstractC0598.m1488(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long jAbs = Math.abs(j);
        int iOrdinal = enumC0426.ordinal();
        long j4 = 0;
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                C0188.m791(enumC0426, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (jAbs == 0) {
            jAbs = j4;
        } else {
            j4 = 4611686018427387903L;
            if (jAbs == 1) {
                if (j2 <= 4611686018427387903L) {
                    jAbs = j2;
                }
            } else if (j2 != 1) {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j2);
                if (iNumberOfLeadingZeros < 63) {
                    jAbs *= j2;
                } else if (iNumberOfLeadingZeros <= 63) {
                    jAbs *= j2;
                    if (jAbs > 4611686018427387903L) {
                    }
                }
            } else if (jAbs > 4611686018427387903L) {
            }
        }
        return m2768(jSignum * jAbs);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static boolean m2781(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static void m2782(Context context, String str) {
        AbstractC2328.m4341(-389707725439854L);
        AbstractC2328.m4341(-389742085178222L);
        try {
            Object objM1375 = null;
            Class clsM2792 = AbstractC1371.m2792(AbstractC2328.m4341(-389759265047406L), null, 3);
            if (clsM2792 != null) {
                int i = AbstractC2293.f11258;
                C2014 c2014M1327 = AbstractC0476.m1327(clsM2792);
                ((C0903) c2014M1327.f10074).f4118 = 2;
                C1189 c1189M3892 = c2014M1327.m3892();
                c1189M3892.m2391(EnumC2298.f11300, EnumC2298.f11299);
                c1189M3892.f12003 = AbstractC2328.m4341(-389900998968174L);
                c1189M3892.m4189(Arrays.copyOf(new Object[]{AbstractC2328.m4341(-389948243608430L), AbstractC1700.m3448(String.class)}, 2));
                c1189M3892.f5455 = AbstractC2328.m4341(-390051322823534L);
                C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                if (c0536 != null) {
                    objM1375 = c0536.m1375(context, AbstractC2328.m4341(-390188761777006L).concat(str));
                }
            }
            C0718.f3373.getClass();
            AbstractC0145.m672(objM1375, AbstractC2328.m4341(-390283251057518L), new Object[0]);
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-390304725893998L), e);
            AbstractC1960.m3789(AbstractC2328.m4341(-390334790665070L) + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static InterfaceC0274 m2783(InterfaceC0274 interfaceC0274) {
        AbstractC1320 abstractC1320 = interfaceC0274 instanceof AbstractC1320 ? (AbstractC1320) interfaceC0274 : null;
        if (abstractC1320 == null || (interfaceC0274 = abstractC1320.f6069) != null) {
            return interfaceC0274;
        }
        AbstractC0974 abstractC0974 = (AbstractC0974) abstractC1320.f6070.mo423(C0135.f836);
        InterfaceC0274 c1118 = abstractC0974 != null ? new C1118(abstractC0974, abstractC1320) : abstractC1320;
        abstractC1320.f6069 = c1118;
        return c1118;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static C2265[] m2784(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C2265[0];
        }
        C2265[] c2265Arr = new C2265[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM1837 = (int) AbstractC0797.m1837(byteArrayInputStream, 2);
            int iM18372 = (int) AbstractC0797.m1837(byteArrayInputStream, 2);
            c2265Arr[i3] = new C2265(str, new String(AbstractC0797.m1812(byteArrayInputStream, iM1837), StandardCharsets.UTF_8), AbstractC0797.m1837(byteArrayInputStream, 4), iM18372, (int) AbstractC0797.m1837(byteArrayInputStream, 4), (int) AbstractC0797.m1837(byteArrayInputStream, 4), new int[iM18372], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C2265 c2265 = c2265Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c2265.f11176;
            int i6 = c2265.f11174;
            TreeMap treeMap = c2265.f11170;
            int i7 = iAvailable - i5;
            int iM18373 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM18373 += (int) AbstractC0797.m1837(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM18373), 1);
                int iM18374 = (int) AbstractC0797.m1837(byteArrayInputStream, 2);
                while (iM18374 > 0) {
                    AbstractC0797.m1837(byteArrayInputStream, 2);
                    int iM18375 = (int) AbstractC0797.m1837(byteArrayInputStream, 1);
                    if (iM18375 != 6 && iM18375 != 7) {
                        while (iM18375 > 0) {
                            AbstractC0797.m1837(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM18376 = (int) AbstractC0797.m1837(byteArrayInputStream, 1); iM18376 > 0; iM18376--) {
                                AbstractC0797.m1837(byteArrayInputStream, 2);
                            }
                            iM18375--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM18374--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                C0188.m800("Read too much data during profile line parse");
                return null;
            }
            c2265.f11169 = m2764(byteArrayInputStream, c2265.f11171);
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC0797.m1812(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
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
        return c2265Arr;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static byte[] m2785(C2265[] c2265Arr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C2265 c2265 : c2265Arr) {
            length += ((((c2265.f11174 * 2) + 7) & (-8)) / 8) + (c2265.f11171 * 2) + m2765(c2265.f11172, c2265.f11173, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c2265.f11176;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC0024.f8166)) {
            int length2 = c2265Arr.length;
            while (i < length2) {
                C2265 c22652 = c2265Arr[i];
                m2769(byteArrayOutputStream, c22652, m2765(c22652.f11172, c22652.f11173, bArr));
                m2776(byteArrayOutputStream, c22652);
                i++;
            }
        } else {
            for (C2265 c22653 : c2265Arr) {
                m2769(byteArrayOutputStream, c22653, m2765(c22653.f11172, c22653.f11173, bArr));
            }
            int length3 = c2265Arr.length;
            while (i < length3) {
                m2776(byteArrayOutputStream, c2265Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static C2265[] m2786(ByteArrayInputStream byteArrayInputStream, int i, C2265[] c2265Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C2265[0];
        }
        if (i != c2265Arr.length) {
            C0188.m800("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM1837 = (int) AbstractC0797.m1837(byteArrayInputStream, 2);
            iArr[i2] = (int) AbstractC0797.m1837(byteArrayInputStream, 2);
            strArr[i2] = new String(AbstractC0797.m1812(byteArrayInputStream, iM1837), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C2265 c2265 = c2265Arr[i3];
            if (!c2265.f11173.equals(strArr[i3])) {
                C0188.m800("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            c2265.f11171 = i4;
            c2265.f11169 = m2764(byteArrayInputStream, i4);
        }
        return c2265Arr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yyds.ᛲᛶᲁᛴ, yyds.ᛶᛱᛳᲇ] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [yyds.ᛵᛳᛳᛷ] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [yyds.ᛲᛶᲁᛴ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [yyds.ᛲᲇᲁᛴ] */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final Object m2787(C1056 c1056, long j, InterfaceC0477 interfaceC0477) {
        while (true) {
            ?? r1 = c1056;
            while (true) {
                if (r1.f1959 >= j && !r1.mo1084()) {
                    return r1;
                }
                Object objectVolatile = AbstractC2112.f10448.getObjectVolatile((Object) r1, AbstractC1262.f5819);
                C0415 c0415 = f6359;
                if (objectVolatile == c0415) {
                    return c0415;
                }
                c1056 = (AbstractC0381) ((AbstractC1262) objectVolatile);
                if (c1056 != 0) {
                    break;
                }
                AbstractC0381 abstractC0381 = (AbstractC0381) interfaceC0477.mo511(Long.valueOf(r1.f1959 + 1), r1);
                while (true) {
                    Unsafe unsafe = AbstractC2112.f10448;
                    long j2 = AbstractC1262.f5819;
                    if (unsafe.compareAndSwapObject((Object) r1, j2, (Object) null, abstractC0381)) {
                        if (r1.mo1084()) {
                            r1.m2538();
                        }
                        r1 = abstractC0381;
                    } else if (unsafe.getObjectVolatile((Object) r1, j2) != null) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final boolean m2788(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return AbstractC1544.m3188(AbstractC0473.m1314(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static void m2789(ByteArrayOutputStream byteArrayOutputStream, int i, C2265 c2265) throws IOException {
        int i2 = c2265.f11174;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c2265.f11170.entrySet()) {
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
}
