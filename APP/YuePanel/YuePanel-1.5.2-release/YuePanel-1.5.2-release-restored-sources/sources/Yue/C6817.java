package Yue;

import com.android.dex.DexFormat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: Yue.ۥۡۥۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(19)
public class C6817 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f2335 = 1;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2336 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f17703 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f17704 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f17705 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final byte[] f17706 = {112, 114, 111, 0};

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final byte[] f17707 = {112, 114, 109, 0};

    /* JADX INFO: renamed from: ۥ */
    public static int m3274(@InterfaceC6391 C4384 c4384) {
        Iterator<Map.Entry<Integer, Integer>> it = c4384.f9034.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static byte[] m3275(@InterfaceC6391 C4384[] c4384Arr, @InterfaceC6391 byte[] bArr) throws IOException {
        int i = 0;
        int iM13953 = 0;
        for (C4384 c4384 : c4384Arr) {
            iM13953 += C4639.m13953(m21538(c4384.f852, c4384.f853, bArr)) + 16 + (c4384.f9030 * 2) + c4384.f9031 + m21539(c4384.f9032);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM13953);
        if (Arrays.equals(bArr, C6818.f17708)) {
            int length = c4384Arr.length;
            while (i < length) {
                C4384 c43842 = c4384Arr[i];
                m21561(byteArrayOutputStream, c43842, m21538(c43842.f852, c43842.f853, bArr));
                m21560(byteArrayOutputStream, c43842);
                i++;
            }
        } else {
            for (C4384 c43843 : c4384Arr) {
                m21561(byteArrayOutputStream, c43843, m21538(c43843.f852, c43843.f853, bArr));
            }
            int length2 = c4384Arr.length;
            while (i < length2) {
                m21560(byteArrayOutputStream, c4384Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iM13953) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C4639.m13945("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM13953);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C8539 m21531(@InterfaceC6391 C4384[] c4384Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < c4384Arr.length; i2++) {
            try {
                C4384 c4384 = c4384Arr[i2];
                C4639.m13958(byteArrayOutputStream, i2);
                C4639.m13958(byteArrayOutputStream, c4384.f9030);
                i = i + 4 + (c4384.f9030 * 2);
                m21557(byteArrayOutputStream, c4384);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C8539 c8539 = new C8539(EnumC4816.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return c8539;
        }
        throw C4639.m13945("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C8539 m21532(@InterfaceC6391 C4384[] c4384Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < c4384Arr.length; i2++) {
            try {
                C4384 c4384 = c4384Arr[i2];
                int iM3274 = m3274(c4384);
                byte[] bArrM21533 = m21533(c4384);
                byte[] bArrM21534 = m21534(c4384);
                C4639.m13958(byteArrayOutputStream, i2);
                int length = bArrM21533.length + 2 + bArrM21534.length;
                C4639.m13959(byteArrayOutputStream, length);
                C4639.m13958(byteArrayOutputStream, iM3274);
                byteArrayOutputStream.write(bArrM21533);
                byteArrayOutputStream.write(bArrM21534);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C8539 c8539 = new C8539(EnumC4816.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return c8539;
        }
        throw C4639.m13945("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static byte[] m21533(@InterfaceC6391 C4384 c4384) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m21562(byteArrayOutputStream, c4384);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static byte[] m21534(@InterfaceC6391 C4384 c4384) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m21563(byteArrayOutputStream, c4384);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static String m21535(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m21536(@InterfaceC6391 String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static C4384 m21537(@InterfaceC6391 C4384[] c4384Arr, @InterfaceC6391 String str) {
        if (c4384Arr.length <= 0) {
            return null;
        }
        String strM21536 = m21536(str);
        for (int i = 0; i < c4384Arr.length; i++) {
            if (c4384Arr[i].f853.equals(strM21536)) {
                return c4384Arr[i];
            }
        }
        return null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static String m21538(@InterfaceC6391 String str, @InterfaceC6391 String str2, @InterfaceC6391 byte[] bArr) {
        String strM3276 = C6818.m3276(bArr);
        if (str.length() <= 0) {
            return m21535(str2, strM3276);
        }
        if (str2.equals(DexFormat.DEX_IN_JAR_NAME)) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m21535(str2, strM3276);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + C6818.m3276(bArr) + str2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m21539(int i) {
        return m21553(i * 2) / 8;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static int m21540(int i, int i2, int i3) {
        if (i == 1) {
            throw C4639.m13945("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw C4639.m13945("Unexpected flag: " + i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int[] m21541(@InterfaceC6391 InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iM13950 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM13950 += C4639.m13950(inputStream);
            iArr[i2] = iM13950;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m21542(@InterfaceC6391 BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(m21540(2, i, i2)) ? 2 : 0;
        return bitSet.get(m21540(4, i, i2)) ? i3 | 4 : i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static byte[] m21543(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, C4639.m13946(inputStream, bArr.length))) {
            return C4639.m13946(inputStream, C6818.f2338.length);
        }
        throw C4639.m13945("Invalid magic");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m21544(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 C4384 c4384) throws IOException {
        int iAvailable = inputStream.available() - c4384.f9031;
        int iM13950 = 0;
        while (inputStream.available() > iAvailable) {
            iM13950 += C4639.m13950(inputStream);
            c4384.f9034.put(Integer.valueOf(iM13950), 1);
            for (int iM139502 = C4639.m13950(inputStream); iM139502 > 0; iM139502--) {
                m21555(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw C4639.m13945("Read too much data during profile line parse");
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static C4384[] m21545(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 byte[] bArr, @InterfaceC6391 byte[] bArr2, C4384[] c4384Arr) throws IOException {
        if (Arrays.equals(bArr, C6818.f17711)) {
            if (Arrays.equals(C6818.f2337, bArr2)) {
                throw C4639.m13945("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m21546(inputStream, bArr, c4384Arr);
        }
        if (Arrays.equals(bArr, C6818.f17712)) {
            return m21548(inputStream, bArr2, c4384Arr);
        }
        throw C4639.m13945("Unsupported meta version");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static C4384[] m21546(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 byte[] bArr, C4384[] c4384Arr) throws IOException {
        if (!Arrays.equals(bArr, C6818.f17711)) {
            throw C4639.m13945("Unsupported meta version");
        }
        int iM13952 = C4639.m13952(inputStream);
        byte[] bArrM13947 = C4639.m13947(inputStream, (int) C4639.m13951(inputStream), (int) C4639.m13951(inputStream));
        if (inputStream.read() > 0) {
            throw C4639.m13945("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM13947);
        try {
            C4384[] c4384ArrM21547 = m21547(byteArrayInputStream, iM13952, c4384Arr);
            byteArrayInputStream.close();
            return c4384ArrM21547;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static C4384[] m21547(@InterfaceC6391 InputStream inputStream, int i, C4384[] c4384Arr) throws IOException {
        if (inputStream.available() == 0) {
            return new C4384[0];
        }
        if (i != c4384Arr.length) {
            throw C4639.m13945("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM13950 = C4639.m13950(inputStream);
            iArr[i2] = C4639.m13950(inputStream);
            strArr[i2] = C4639.m13948(inputStream, iM13950);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C4384 c4384 = c4384Arr[i3];
            if (!c4384.f853.equals(strArr[i3])) {
                throw C4639.m13945("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c4384.f9030 = i4;
            c4384.f9033 = m21541(inputStream, i4);
        }
        return c4384Arr;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static C4384[] m21548(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 byte[] bArr, C4384[] c4384Arr) throws IOException {
        int iM13950 = C4639.m13950(inputStream);
        byte[] bArrM13947 = C4639.m13947(inputStream, (int) C4639.m13951(inputStream), (int) C4639.m13951(inputStream));
        if (inputStream.read() > 0) {
            throw C4639.m13945("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM13947);
        try {
            C4384[] c4384ArrM21549 = m21549(byteArrayInputStream, bArr, iM13950, c4384Arr);
            byteArrayInputStream.close();
            return c4384ArrM21549;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static C4384[] m21549(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 byte[] bArr, int i, C4384[] c4384Arr) throws IOException {
        if (inputStream.available() == 0) {
            return new C4384[0];
        }
        if (i != c4384Arr.length) {
            throw C4639.m13945("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            C4639.m13950(inputStream);
            String strM13948 = C4639.m13948(inputStream, C4639.m13950(inputStream));
            long jM13951 = C4639.m13951(inputStream);
            int iM13950 = C4639.m13950(inputStream);
            C4384 c4384M21537 = m21537(c4384Arr, strM13948);
            if (c4384M21537 == null) {
                throw C4639.m13945("Missing profile key: " + strM13948);
            }
            c4384M21537.f9029 = jM13951;
            int[] iArrM21541 = m21541(inputStream, iM13950);
            if (Arrays.equals(bArr, C6818.f17710)) {
                c4384M21537.f9030 = iM13950;
                c4384M21537.f9033 = iArrM21541;
            }
        }
        return c4384Arr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m21550(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 C4384 c4384) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(C4639.m13946(inputStream, C4639.m1597(c4384.f9032 * 2)));
        int i = 0;
        while (true) {
            int i2 = c4384.f9032;
            if (i >= i2) {
                return;
            }
            int iM21542 = m21542(bitSetValueOf, i, i2);
            if (iM21542 != 0) {
                Integer num = c4384.f9034.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                c4384.f9034.put(Integer.valueOf(i), Integer.valueOf(iM21542 | num.intValue()));
            }
            i++;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static C4384[] m21551(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 byte[] bArr, @InterfaceC6391 String str) throws IOException {
        if (!Arrays.equals(bArr, C6818.f2338)) {
            throw C4639.m13945("Unsupported version");
        }
        int iM13952 = C4639.m13952(inputStream);
        byte[] bArrM13947 = C4639.m13947(inputStream, (int) C4639.m13951(inputStream), (int) C4639.m13951(inputStream));
        if (inputStream.read() > 0) {
            throw C4639.m13945("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM13947);
        try {
            C4384[] c4384ArrM21552 = m21552(byteArrayInputStream, str, iM13952);
            byteArrayInputStream.close();
            return c4384ArrM21552;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static C4384[] m21552(@InterfaceC6391 InputStream inputStream, @InterfaceC6391 String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new C4384[0];
        }
        C4384[] c4384Arr = new C4384[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM13950 = C4639.m13950(inputStream);
            int iM139502 = C4639.m13950(inputStream);
            c4384Arr[i2] = new C4384(str, C4639.m13948(inputStream, iM13950), C4639.m13951(inputStream), 0L, iM139502, (int) C4639.m13951(inputStream), (int) C4639.m13951(inputStream), new int[iM139502], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C4384 c4384 = c4384Arr[i3];
            m21544(inputStream, c4384);
            c4384.f9033 = m21541(inputStream, c4384.f9030);
            m21550(inputStream, c4384);
        }
        return c4384Arr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static int m21553(int i) {
        return (i + 7) & (-8);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m21554(@InterfaceC6391 byte[] bArr, int i, int i2, @InterfaceC6391 C4384 c4384) {
        int iM21540 = m21540(i, i2, c4384.f9032);
        int i3 = iM21540 / 8;
        bArr[i3] = (byte) ((1 << (iM21540 % 8)) | bArr[i3]);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m21555(@InterfaceC6391 InputStream inputStream) throws IOException {
        C4639.m13950(inputStream);
        int iM13952 = C4639.m13952(inputStream);
        if (iM13952 == 6 || iM13952 == 7) {
            return;
        }
        while (iM13952 > 0) {
            C4639.m13952(inputStream);
            for (int iM139522 = C4639.m13952(inputStream); iM139522 > 0; iM139522--) {
                C4639.m13950(inputStream);
            }
            iM13952--;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static boolean m21556(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 byte[] bArr, @InterfaceC6391 C4384[] c4384Arr) throws IOException {
        if (Arrays.equals(bArr, C6818.f2337)) {
            m21568(outputStream, c4384Arr);
            return true;
        }
        if (Arrays.equals(bArr, C6818.f2338)) {
            m21567(outputStream, c4384Arr);
            return true;
        }
        if (Arrays.equals(bArr, C6818.f17709)) {
            m21565(outputStream, c4384Arr);
            return true;
        }
        if (Arrays.equals(bArr, C6818.f17708)) {
            m21566(outputStream, c4384Arr);
            return true;
        }
        if (!Arrays.equals(bArr, C6818.f17710)) {
            return false;
        }
        m21564(outputStream, c4384Arr);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m21557(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384 c4384) throws IOException {
        int[] iArr = c4384.f9033;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            C4639.m13958(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static C8539 m21558(@InterfaceC6391 C4384[] c4384Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C4639.m13958(byteArrayOutputStream, c4384Arr.length);
            int i = 2;
            for (C4384 c4384 : c4384Arr) {
                C4639.m13959(byteArrayOutputStream, c4384.f9028);
                C4639.m13959(byteArrayOutputStream, c4384.f9029);
                C4639.m13959(byteArrayOutputStream, c4384.f9032);
                String strM21538 = m21538(c4384.f852, c4384.f853, C6818.f2337);
                int iM13953 = C4639.m13953(strM21538);
                C4639.m13958(byteArrayOutputStream, iM13953);
                i = i + 14 + iM13953;
                C4639.m13956(byteArrayOutputStream, strM21538);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                C8539 c8539 = new C8539(EnumC4816.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return c8539;
            }
            throw C4639.m13945("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m21559(@InterfaceC6391 OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f17706);
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static void m21560(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384 c4384) throws IOException {
        m21563(outputStream, c4384);
        m21557(outputStream, c4384);
        m21562(outputStream, c4384);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static void m21561(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384 c4384, @InterfaceC6391 String str) throws IOException {
        C4639.m13958(outputStream, C4639.m13953(str));
        C4639.m13958(outputStream, c4384.f9030);
        C4639.m13959(outputStream, c4384.f9031);
        C4639.m13959(outputStream, c4384.f9028);
        C4639.m13959(outputStream, c4384.f9032);
        C4639.m13956(outputStream, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static void m21562(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384 c4384) throws IOException {
        byte[] bArr = new byte[m21539(c4384.f9032)];
        for (Map.Entry<Integer, Integer> entry : c4384.f9034.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                m21554(bArr, 2, iIntValue, c4384);
            }
            if ((iIntValue2 & 4) != 0) {
                m21554(bArr, 4, iIntValue, c4384);
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static void m21563(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384 c4384) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c4384.f9034.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C4639.m13958(outputStream, iIntValue - i);
                C4639.m13958(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static void m21564(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384[] c4384Arr) throws IOException {
        C4639.m13958(outputStream, c4384Arr.length);
        for (C4384 c4384 : c4384Arr) {
            String strM21538 = m21538(c4384.f852, c4384.f853, C6818.f17710);
            C4639.m13958(outputStream, C4639.m13953(strM21538));
            C4639.m13958(outputStream, c4384.f9034.size());
            C4639.m13958(outputStream, c4384.f9033.length);
            C4639.m13959(outputStream, c4384.f9028);
            C4639.m13956(outputStream, strM21538);
            Iterator<Integer> it = c4384.f9034.keySet().iterator();
            while (it.hasNext()) {
                C4639.m13958(outputStream, it.next().intValue());
            }
            for (int i : c4384.f9033) {
                C4639.m13958(outputStream, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static void m21565(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384[] c4384Arr) throws IOException {
        C4639.m13960(outputStream, c4384Arr.length);
        for (C4384 c4384 : c4384Arr) {
            int size = c4384.f9034.size() * 4;
            String strM21538 = m21538(c4384.f852, c4384.f853, C6818.f17709);
            C4639.m13958(outputStream, C4639.m13953(strM21538));
            C4639.m13958(outputStream, c4384.f9033.length);
            C4639.m13959(outputStream, size);
            C4639.m13959(outputStream, c4384.f9028);
            C4639.m13956(outputStream, strM21538);
            Iterator<Integer> it = c4384.f9034.keySet().iterator();
            while (it.hasNext()) {
                C4639.m13958(outputStream, it.next().intValue());
                C4639.m13958(outputStream, 0);
            }
            for (int i : c4384.f9033) {
                C4639.m13958(outputStream, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static void m21566(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384[] c4384Arr) throws IOException {
        byte[] bArrM3275 = m3275(c4384Arr, C6818.f17708);
        C4639.m13960(outputStream, c4384Arr.length);
        C4639.m13955(outputStream, bArrM3275);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static void m21567(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384[] c4384Arr) throws IOException {
        byte[] bArrM3275 = m3275(c4384Arr, C6818.f2338);
        C4639.m13960(outputStream, c4384Arr.length);
        C4639.m13955(outputStream, bArrM3275);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static void m21568(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384[] c4384Arr) throws IOException {
        m21569(outputStream, c4384Arr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static void m21569(@InterfaceC6391 OutputStream outputStream, @InterfaceC6391 C4384[] c4384Arr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m21558(c4384Arr));
        arrayList.add(m21531(c4384Arr));
        arrayList.add(m21532(c4384Arr));
        long length2 = ((long) C6818.f2337.length) + ((long) f17706.length) + 4 + ((long) (arrayList.size() * 16));
        C4639.m13959(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C8539 c8539 = (C8539) arrayList.get(i);
            C4639.m13959(outputStream, c8539.f3546.m14620());
            C4639.m13959(outputStream, length2);
            if (c8539.f25370) {
                byte[] bArr = c8539.f25369;
                long length3 = bArr.length;
                byte[] bArrM1598 = C4639.m1598(bArr);
                arrayList2.add(bArrM1598);
                C4639.m13959(outputStream, bArrM1598.length);
                C4639.m13959(outputStream, length3);
                length = bArrM1598.length;
            } else {
                arrayList2.add(c8539.f25369);
                C4639.m13959(outputStream, c8539.f25369.length);
                C4639.m13959(outputStream, 0L);
                length = c8539.f25369.length;
            }
            length2 += (long) length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }
}
