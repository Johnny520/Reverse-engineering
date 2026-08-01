package p168l4;

import com.alibaba.fastjson2.JSONB;
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

/* JADX INFO: renamed from: l4.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4632j {

    /* JADX INFO: renamed from: a */
    public static final byte[] f13791a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f13792b = {112, 114, JSONB.Constants.BC_STR_ASCII_FIX_36, 0};

    /* JADX INFO: renamed from: A */
    public static void m18585A(byte[] bArr, int i10, int i11, C4624b c4624b) {
        int iM18614m = m18614m(i10, i11, c4624b.f13774g);
        int i12 = iM18614m / 8;
        bArr[i12] = (byte) ((1 << (iM18614m % 8)) | bArr[i12]);
    }

    /* JADX INFO: renamed from: B */
    public static void m18586B(InputStream inputStream) {
        AbstractC4625c.m18572h(inputStream);
        int iM18574j = AbstractC4625c.m18574j(inputStream);
        if (iM18574j == 6 || iM18574j == 7) {
            return;
        }
        while (iM18574j > 0) {
            AbstractC4625c.m18574j(inputStream);
            for (int iM18574j2 = AbstractC4625c.m18574j(inputStream); iM18574j2 > 0; iM18574j2--) {
                AbstractC4625c.m18572h(inputStream);
            }
            iM18574j--;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m18587C(OutputStream outputStream, byte[] bArr, C4624b[] c4624bArr) throws IOException {
        if (Arrays.equals(bArr, AbstractC4633k.f13793a)) {
            m18600P(outputStream, c4624bArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC4633k.f13794b)) {
            m18599O(outputStream, c4624bArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC4633k.f13796d)) {
            m18597M(outputStream, c4624bArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC4633k.f13795c)) {
            m18598N(outputStream, c4624bArr);
            return true;
        }
        if (!Arrays.equals(bArr, AbstractC4633k.f13797e)) {
            return false;
        }
        m18596L(outputStream, c4624bArr);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static void m18588D(OutputStream outputStream, C4624b c4624b) throws IOException {
        int[] iArr = c4624b.f13775h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            AbstractC4625c.m18580p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: E */
    public static C4634l m18589E(C4624b[] c4624bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC4625c.m18580p(byteArrayOutputStream, c4624bArr.length);
            int i10 = 2;
            for (C4624b c4624b : c4624bArr) {
                AbstractC4625c.m18581q(byteArrayOutputStream, c4624b.f13770c);
                AbstractC4625c.m18581q(byteArrayOutputStream, c4624b.f13771d);
                AbstractC4625c.m18581q(byteArrayOutputStream, c4624b.f13774g);
                String strM18611j = m18611j(c4624b.f13768a, c4624b.f13769b, AbstractC4633k.f13793a);
                int iM18575k = AbstractC4625c.m18575k(strM18611j);
                AbstractC4625c.m18580p(byteArrayOutputStream, iM18575k);
                i10 = i10 + 14 + iM18575k;
                AbstractC4625c.m18578n(byteArrayOutputStream, strM18611j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                C4634l c4634l = new C4634l(EnumC4626d.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return c4634l;
            }
            throw AbstractC4625c.m18567c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m18590F(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f13791a);
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: G */
    public static void m18591G(OutputStream outputStream, C4624b c4624b) throws IOException {
        m18595K(outputStream, c4624b);
        m18588D(outputStream, c4624b);
        m18593I(outputStream, c4624b);
    }

    /* JADX INFO: renamed from: H */
    public static void m18592H(OutputStream outputStream, C4624b c4624b, String str) throws IOException {
        AbstractC4625c.m18580p(outputStream, AbstractC4625c.m18575k(str));
        AbstractC4625c.m18580p(outputStream, c4624b.f13772e);
        AbstractC4625c.m18581q(outputStream, c4624b.f13773f);
        AbstractC4625c.m18581q(outputStream, c4624b.f13770c);
        AbstractC4625c.m18581q(outputStream, c4624b.f13774g);
        AbstractC4625c.m18578n(outputStream, str);
    }

    /* JADX INFO: renamed from: I */
    public static void m18593I(OutputStream outputStream, C4624b c4624b) throws IOException {
        byte[] bArr = new byte[m18612k(c4624b.f13774g)];
        for (Map.Entry entry : c4624b.f13776i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                m18585A(bArr, 2, iIntValue, c4624b);
            }
            if ((iIntValue2 & 4) != 0) {
                m18585A(bArr, 4, iIntValue, c4624b);
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: J */
    public static void m18594J(OutputStream outputStream, int i10, C4624b c4624b) throws IOException {
        byte[] bArr = new byte[m18613l(i10, c4624b.f13774g)];
        for (Map.Entry entry : c4624b.f13776i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i10) != 0) {
                    if ((i12 & iIntValue2) == i12) {
                        int i13 = (c4624b.f13774g * i11) + iIntValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: K */
    public static void m18595K(OutputStream outputStream, C4624b c4624b) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : c4624b.f13776i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC4625c.m18580p(outputStream, iIntValue - i10);
                AbstractC4625c.m18580p(outputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m18596L(OutputStream outputStream, C4624b[] c4624bArr) throws IOException {
        AbstractC4625c.m18580p(outputStream, c4624bArr.length);
        for (C4624b c4624b : c4624bArr) {
            String strM18611j = m18611j(c4624b.f13768a, c4624b.f13769b, AbstractC4633k.f13797e);
            AbstractC4625c.m18580p(outputStream, AbstractC4625c.m18575k(strM18611j));
            AbstractC4625c.m18580p(outputStream, c4624b.f13776i.size());
            AbstractC4625c.m18580p(outputStream, c4624b.f13775h.length);
            AbstractC4625c.m18581q(outputStream, c4624b.f13770c);
            AbstractC4625c.m18578n(outputStream, strM18611j);
            Iterator it = c4624b.f13776i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC4625c.m18580p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i10 : c4624b.f13775h) {
                AbstractC4625c.m18580p(outputStream, i10);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m18597M(OutputStream outputStream, C4624b[] c4624bArr) throws IOException {
        AbstractC4625c.m18582r(outputStream, c4624bArr.length);
        for (C4624b c4624b : c4624bArr) {
            int size = c4624b.f13776i.size() * 4;
            String strM18611j = m18611j(c4624b.f13768a, c4624b.f13769b, AbstractC4633k.f13796d);
            AbstractC4625c.m18580p(outputStream, AbstractC4625c.m18575k(strM18611j));
            AbstractC4625c.m18580p(outputStream, c4624b.f13775h.length);
            AbstractC4625c.m18581q(outputStream, size);
            AbstractC4625c.m18581q(outputStream, c4624b.f13770c);
            AbstractC4625c.m18578n(outputStream, strM18611j);
            Iterator it = c4624b.f13776i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC4625c.m18580p(outputStream, ((Integer) it.next()).intValue());
                AbstractC4625c.m18580p(outputStream, 0);
            }
            for (int i10 : c4624b.f13775h) {
                AbstractC4625c.m18580p(outputStream, i10);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m18598N(OutputStream outputStream, C4624b[] c4624bArr) throws IOException {
        byte[] bArrM18603b = m18603b(c4624bArr, AbstractC4633k.f13795c);
        AbstractC4625c.m18582r(outputStream, c4624bArr.length);
        AbstractC4625c.m18577m(outputStream, bArrM18603b);
    }

    /* JADX INFO: renamed from: O */
    public static void m18599O(OutputStream outputStream, C4624b[] c4624bArr) throws IOException {
        byte[] bArrM18603b = m18603b(c4624bArr, AbstractC4633k.f13794b);
        AbstractC4625c.m18582r(outputStream, c4624bArr.length);
        AbstractC4625c.m18577m(outputStream, bArrM18603b);
    }

    /* JADX INFO: renamed from: P */
    public static void m18600P(OutputStream outputStream, C4624b[] c4624bArr) throws IOException {
        m18601Q(outputStream, c4624bArr);
    }

    /* JADX INFO: renamed from: Q */
    public static void m18601Q(OutputStream outputStream, C4624b[] c4624bArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m18589E(c4624bArr));
        arrayList.add(m18604c(c4624bArr));
        arrayList.add(m18605d(c4624bArr));
        long length2 = ((long) AbstractC4633k.f13793a.length) + ((long) f13791a.length) + 4 + ((long) (arrayList.size() * 16));
        AbstractC4625c.m18581q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C4634l c4634l = (C4634l) arrayList.get(i10);
            AbstractC4625c.m18581q(outputStream, c4634l.f13800a.m18584c());
            AbstractC4625c.m18581q(outputStream, length2);
            boolean z10 = c4634l.f13803d;
            byte[] bArr = c4634l.f13802c;
            if (z10) {
                long length3 = bArr.length;
                byte[] bArrM18566b = AbstractC4625c.m18566b(bArr);
                arrayList2.add(bArrM18566b);
                AbstractC4625c.m18581q(outputStream, bArrM18566b.length);
                AbstractC4625c.m18581q(outputStream, length3);
                length = bArrM18566b.length;
            } else {
                arrayList2.add(bArr);
                AbstractC4625c.m18581q(outputStream, c4634l.f13802c.length);
                AbstractC4625c.m18581q(outputStream, 0L);
                length = c4634l.f13802c.length;
            }
            length2 += (long) length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m18602a(C4624b c4624b) {
        Iterator it = c4624b.f13776i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m18603b(C4624b[] c4624bArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int iM18575k = 0;
        for (C4624b c4624b : c4624bArr) {
            iM18575k += AbstractC4625c.m18575k(m18611j(c4624b.f13768a, c4624b.f13769b, bArr)) + 16 + (c4624b.f13772e * 2) + c4624b.f13773f + m18612k(c4624b.f13774g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM18575k);
        if (Arrays.equals(bArr, AbstractC4633k.f13795c)) {
            int length = c4624bArr.length;
            while (i10 < length) {
                C4624b c4624b2 = c4624bArr[i10];
                m18592H(byteArrayOutputStream, c4624b2, m18611j(c4624b2.f13768a, c4624b2.f13769b, bArr));
                m18591G(byteArrayOutputStream, c4624b2);
                i10++;
            }
        } else {
            for (C4624b c4624b3 : c4624bArr) {
                m18592H(byteArrayOutputStream, c4624b3, m18611j(c4624b3.f13768a, c4624b3.f13769b, bArr));
            }
            int length2 = c4624bArr.length;
            while (i10 < length2) {
                m18591G(byteArrayOutputStream, c4624bArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == iM18575k) {
            return byteArrayOutputStream.toByteArray();
        }
        throw AbstractC4625c.m18567c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM18575k);
    }

    /* JADX INFO: renamed from: c */
    public static C4634l m18604c(C4624b[] c4624bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < c4624bArr.length; i11++) {
            try {
                C4624b c4624b = c4624bArr[i11];
                AbstractC4625c.m18580p(byteArrayOutputStream, i11);
                AbstractC4625c.m18580p(byteArrayOutputStream, c4624b.f13772e);
                i10 = i10 + 4 + (c4624b.f13772e * 2);
                m18588D(byteArrayOutputStream, c4624b);
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
        if (i10 == byteArray.length) {
            C4634l c4634l = new C4634l(EnumC4626d.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return c4634l;
        }
        throw AbstractC4625c.m18567c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: d */
    public static C4634l m18605d(C4624b[] c4624bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < c4624bArr.length; i11++) {
            try {
                C4624b c4624b = c4624bArr[i11];
                int iM18602a = m18602a(c4624b);
                byte[] bArrM18606e = m18606e(iM18602a, c4624b);
                byte[] bArrM18607f = m18607f(c4624b);
                AbstractC4625c.m18580p(byteArrayOutputStream, i11);
                int length = bArrM18606e.length + 2 + bArrM18607f.length;
                AbstractC4625c.m18581q(byteArrayOutputStream, length);
                AbstractC4625c.m18580p(byteArrayOutputStream, iM18602a);
                byteArrayOutputStream.write(bArrM18606e);
                byteArrayOutputStream.write(bArrM18607f);
                i10 = i10 + 6 + length;
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
        if (i10 == byteArray.length) {
            C4634l c4634l = new C4634l(EnumC4626d.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return c4634l;
        }
        throw AbstractC4625c.m18567c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m18606e(int i10, C4624b c4624b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m18594J(byteArrayOutputStream, i10, c4624b);
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

    /* JADX INFO: renamed from: f */
    public static byte[] m18607f(C4624b c4624b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m18595K(byteArrayOutputStream, c4624b);
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

    /* JADX INFO: renamed from: g */
    public static String m18608g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    /* JADX INFO: renamed from: h */
    public static String m18609h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: i */
    public static C4624b m18610i(C4624b[] c4624bArr, String str) {
        if (c4624bArr.length <= 0) {
            return null;
        }
        String strM18609h = m18609h(str);
        for (int i10 = 0; i10 < c4624bArr.length; i10++) {
            if (c4624bArr[i10].f13769b.equals(strM18609h)) {
                return c4624bArr[i10];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static String m18611j(String str, String str2, byte[] bArr) {
        String strM18628a = AbstractC4633k.m18628a(bArr);
        if (str.length() <= 0) {
            return m18608g(str2, strM18628a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m18608g(str2, strM18628a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + AbstractC4633k.m18628a(bArr) + str2;
    }

    /* JADX INFO: renamed from: k */
    public static int m18612k(int i10) {
        return m18627z(i10 * 2) / 8;
    }

    /* JADX INFO: renamed from: l */
    public static int m18613l(int i10, int i11) {
        return m18627z(Integer.bitCount(i10 & (-2)) * i11) / 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m18614m(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw AbstractC4625c.m18567c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw AbstractC4625c.m18567c("Unexpected flag: " + i10);
    }

    /* JADX INFO: renamed from: n */
    public static int[] m18615n(InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int iM18572h = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM18572h += AbstractC4625c.m18572h(inputStream);
            iArr[i11] = iM18572h;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: o */
    public static int m18616o(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(m18614m(2, i10, i11)) ? 2 : 0;
        return bitSet.get(m18614m(4, i10, i11)) ? i12 | 4 : i12;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m18617p(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, AbstractC4625c.m18568d(inputStream, bArr.length))) {
            return AbstractC4625c.m18568d(inputStream, AbstractC4633k.f13794b.length);
        }
        throw AbstractC4625c.m18567c("Invalid magic");
    }

    /* JADX INFO: renamed from: q */
    public static void m18618q(InputStream inputStream, C4624b c4624b) {
        int iAvailable = inputStream.available() - c4624b.f13773f;
        int iM18572h = 0;
        while (inputStream.available() > iAvailable) {
            iM18572h += AbstractC4625c.m18572h(inputStream);
            c4624b.f13776i.put(Integer.valueOf(iM18572h), 1);
            for (int iM18572h2 = AbstractC4625c.m18572h(inputStream); iM18572h2 > 0; iM18572h2--) {
                m18586B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw AbstractC4625c.m18567c("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: renamed from: r */
    public static C4624b[] m18619r(InputStream inputStream, byte[] bArr, byte[] bArr2, C4624b[] c4624bArr) {
        if (Arrays.equals(bArr, AbstractC4633k.f13798f)) {
            if (Arrays.equals(AbstractC4633k.f13793a, bArr2)) {
                throw AbstractC4625c.m18567c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m18620s(inputStream, bArr, c4624bArr);
        }
        if (Arrays.equals(bArr, AbstractC4633k.f13799g)) {
            return m18622u(inputStream, bArr2, c4624bArr);
        }
        throw AbstractC4625c.m18567c("Unsupported meta version");
    }

    /* JADX INFO: renamed from: s */
    public static C4624b[] m18620s(InputStream inputStream, byte[] bArr, C4624b[] c4624bArr) throws IOException {
        if (!Arrays.equals(bArr, AbstractC4633k.f13798f)) {
            throw AbstractC4625c.m18567c("Unsupported meta version");
        }
        int iM18574j = AbstractC4625c.m18574j(inputStream);
        byte[] bArrM18569e = AbstractC4625c.m18569e(inputStream, (int) AbstractC4625c.m18573i(inputStream), (int) AbstractC4625c.m18573i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC4625c.m18567c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM18569e);
        try {
            C4624b[] c4624bArrM18621t = m18621t(byteArrayInputStream, iM18574j, c4624bArr);
            byteArrayInputStream.close();
            return c4624bArrM18621t;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public static C4624b[] m18621t(InputStream inputStream, int i10, C4624b[] c4624bArr) {
        if (inputStream.available() == 0) {
            return new C4624b[0];
        }
        if (i10 != c4624bArr.length) {
            throw AbstractC4625c.m18567c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM18572h = AbstractC4625c.m18572h(inputStream);
            iArr[i11] = AbstractC4625c.m18572h(inputStream);
            strArr[i11] = AbstractC4625c.m18570f(inputStream, iM18572h);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C4624b c4624b = c4624bArr[i12];
            if (!c4624b.f13769b.equals(strArr[i12])) {
                throw AbstractC4625c.m18567c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            c4624b.f13772e = i13;
            c4624b.f13775h = m18615n(inputStream, i13);
        }
        return c4624bArr;
    }

    /* JADX INFO: renamed from: u */
    public static C4624b[] m18622u(InputStream inputStream, byte[] bArr, C4624b[] c4624bArr) throws IOException {
        int iM18572h = AbstractC4625c.m18572h(inputStream);
        byte[] bArrM18569e = AbstractC4625c.m18569e(inputStream, (int) AbstractC4625c.m18573i(inputStream), (int) AbstractC4625c.m18573i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC4625c.m18567c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM18569e);
        try {
            C4624b[] c4624bArrM18623v = m18623v(byteArrayInputStream, bArr, iM18572h, c4624bArr);
            byteArrayInputStream.close();
            return c4624bArrM18623v;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public static C4624b[] m18623v(InputStream inputStream, byte[] bArr, int i10, C4624b[] c4624bArr) {
        if (inputStream.available() == 0) {
            return new C4624b[0];
        }
        if (i10 != c4624bArr.length) {
            throw AbstractC4625c.m18567c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            AbstractC4625c.m18572h(inputStream);
            String strM18570f = AbstractC4625c.m18570f(inputStream, AbstractC4625c.m18572h(inputStream));
            long jM18573i = AbstractC4625c.m18573i(inputStream);
            int iM18572h = AbstractC4625c.m18572h(inputStream);
            C4624b c4624bM18610i = m18610i(c4624bArr, strM18570f);
            if (c4624bM18610i == null) {
                throw AbstractC4625c.m18567c("Missing profile key: " + strM18570f);
            }
            c4624bM18610i.f13771d = jM18573i;
            int[] iArrM18615n = m18615n(inputStream, iM18572h);
            if (Arrays.equals(bArr, AbstractC4633k.f13797e)) {
                c4624bM18610i.f13772e = iM18572h;
                c4624bM18610i.f13775h = iArrM18615n;
            }
        }
        return c4624bArr;
    }

    /* JADX INFO: renamed from: w */
    public static void m18624w(InputStream inputStream, C4624b c4624b) {
        BitSet bitSetValueOf = BitSet.valueOf(AbstractC4625c.m18568d(inputStream, AbstractC4625c.m18565a(c4624b.f13774g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = c4624b.f13774g;
            if (i10 >= i11) {
                return;
            }
            int iM18616o = m18616o(bitSetValueOf, i10, i11);
            if (iM18616o != 0) {
                Integer num = (Integer) c4624b.f13776i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                c4624b.f13776i.put(Integer.valueOf(i10), Integer.valueOf(iM18616o | num.intValue()));
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static C4624b[] m18625x(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC4633k.f13794b)) {
            throw AbstractC4625c.m18567c("Unsupported version");
        }
        int iM18574j = AbstractC4625c.m18574j(inputStream);
        byte[] bArrM18569e = AbstractC4625c.m18569e(inputStream, (int) AbstractC4625c.m18573i(inputStream), (int) AbstractC4625c.m18573i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC4625c.m18567c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM18569e);
        try {
            C4624b[] c4624bArrM18626y = m18626y(byteArrayInputStream, str, iM18574j);
            byteArrayInputStream.close();
            return c4624bArrM18626y;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public static C4624b[] m18626y(InputStream inputStream, String str, int i10) {
        if (inputStream.available() == 0) {
            return new C4624b[0];
        }
        C4624b[] c4624bArr = new C4624b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM18572h = AbstractC4625c.m18572h(inputStream);
            int iM18572h2 = AbstractC4625c.m18572h(inputStream);
            c4624bArr[i11] = new C4624b(str, AbstractC4625c.m18570f(inputStream, iM18572h), AbstractC4625c.m18573i(inputStream), 0L, iM18572h2, (int) AbstractC4625c.m18573i(inputStream), (int) AbstractC4625c.m18573i(inputStream), new int[iM18572h2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C4624b c4624b = c4624bArr[i12];
            m18618q(inputStream, c4624b);
            c4624b.f13775h = m18615n(inputStream, c4624b.f13772e);
            m18624w(inputStream, c4624b);
        }
        return c4624bArr;
    }

    /* JADX INFO: renamed from: z */
    public static int m18627z(int i10) {
        return (i10 + 7) & (-8);
    }
}
