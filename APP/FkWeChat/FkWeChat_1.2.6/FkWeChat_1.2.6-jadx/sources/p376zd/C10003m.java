package p376zd;

import ae.AbstractC0303b;
import ae.AbstractC0304c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5102r;
import p215oc.C5725t;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: zd.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C10003m implements Serializable, Comparable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: t */
    public static final a f33582t = new a(null);

    /* JADX INFO: renamed from: u */
    public static final C10003m f33583u = new C10003m(new byte[0]);

    /* JADX INFO: renamed from: q */
    public final byte[] f33584q;

    /* JADX INFO: renamed from: r */
    public transient int f33585r;

    /* JADX INFO: renamed from: s */
    public transient String f33586s;

    public C10003m(byte[] bArr) {
        bArr.getClass();
        this.f33584q = bArr;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ C10003m m38756K(C10003m c10003m, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: substring");
            return null;
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = AbstractC9978b.m38616c();
        }
        return c10003m.mo38768J(i10, i11);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        C10003m c10003mM38797h = f33582t.m38797h(objectInputStream, objectInputStream.readInt());
        Field declaredField = C10003m.class.getDeclaredField("q");
        declaredField.setAccessible(true);
        declaredField.set(this, c10003mM38797h.f33584q);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m38757t(C10003m c10003m, C10003m c10003m2, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: indexOf");
            return 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c10003m.m38783r(c10003m2, i10);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f33584q.length);
        objectOutputStream.write(this.f33584q);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m38758y(C10003m c10003m, C10003m c10003m2, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: lastIndexOf");
            return 0;
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC9978b.m38616c();
        }
        return c10003m.m38787w(c10003m2, i10);
    }

    /* JADX INFO: renamed from: A */
    public boolean mo38759A(int i10, C10003m c10003m, int i11, int i12) {
        c10003m.getClass();
        return c10003m.mo38760B(i11, m38778k(), i10, i12);
    }

    /* JADX INFO: renamed from: B */
    public boolean mo38760B(int i10, byte[] bArr, int i11, int i12) {
        bArr.getClass();
        return i10 >= 0 && i10 <= m38778k().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && AbstractC9978b.m38614a(m38778k(), i10, bArr, i11, i12);
    }

    /* JADX INFO: renamed from: C */
    public final void m38761C(int i10) {
        this.f33585r = i10;
    }

    /* JADX INFO: renamed from: D */
    public final void m38762D(String str) {
        this.f33586s = str;
    }

    /* JADX INFO: renamed from: E */
    public final C10003m m38763E() {
        return mo38775h("SHA-1");
    }

    /* JADX INFO: renamed from: F */
    public final C10003m m38764F() {
        return mo38775h("SHA-256");
    }

    /* JADX INFO: renamed from: G */
    public final int m38765G() {
        return mo38780m();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m38766H(C10003m c10003m) {
        c10003m.getClass();
        return mo38759A(0, c10003m, 0, c10003m.m38765G());
    }

    /* JADX INFO: renamed from: I */
    public String mo38767I(Charset charset) {
        charset.getClass();
        return new String(this.f33584q, charset);
    }

    /* JADX INFO: renamed from: J */
    public C10003m mo38768J(int i10, int i11) {
        int iM38618e = AbstractC9978b.m38618e(this, i11);
        if (i10 < 0) {
            C9987e.m38645a("beginIndex < 0");
            return null;
        }
        if (iM38618e > m38778k().length) {
            C10001l.m38755a("endIndex > length(", m38778k().length, 41);
            return null;
        }
        if (iM38618e - i10 >= 0) {
            return (i10 == 0 && iM38618e == m38778k().length) ? this : new C10003m(AbstractC5102r.m20666r(m38778k(), i10, iM38618e));
        }
        C9987e.m38645a("endIndex < beginIndex");
        return null;
    }

    /* JADX INFO: renamed from: L */
    public C10003m mo38769L() {
        for (int i10 = 0; i10 < m38778k().length; i10++) {
            byte b10 = m38778k()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrM38778k = m38778k();
                byte[] bArrCopyOf = Arrays.copyOf(bArrM38778k, bArrM38778k.length);
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C10003m(bArrCopyOf);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: M */
    public String m38770M() {
        String strM38781n = m38781n();
        if (strM38781n != null) {
            return strM38781n;
        }
        String strM38644c = AbstractC9986d1.m38644c(mo38785u());
        m38762D(strM38644c);
        return strM38644c;
    }

    /* JADX INFO: renamed from: N */
    public void mo38771N(C9995i c9995i, int i10, int i11) {
        c9995i.getClass();
        AbstractC0303b.m908c(this, c9995i, i10, i11);
    }

    /* JADX INFO: renamed from: a */
    public String mo38772a() {
        return AbstractC9975a.m38611c(m38778k(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C10003m c10003m) {
        c10003m.getClass();
        int iM38765G = m38765G();
        int iM38765G2 = c10003m.m38765G();
        int iMin = Math.min(iM38765G, iM38765G2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iM38777j = m38777j(i10) & 255;
            int iM38777j2 = c10003m.m38777j(i10) & 255;
            if (iM38777j != iM38777j2) {
                return iM38777j < iM38777j2 ? -1 : 1;
            }
        }
        if (iM38765G == iM38765G2) {
            return 0;
        }
        return iM38765G < iM38765G2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10003m) {
            C10003m c10003m = (C10003m) obj;
            if (c10003m.m38765G() == m38778k().length && c10003m.mo38760B(0, m38778k(), 0, m38778k().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void mo38774g(int i10, byte[] bArr, int i11, int i12) {
        bArr.getClass();
        AbstractC5102r.m20655g(m38778k(), bArr, i11, i10, i12 + i10);
    }

    /* JADX INFO: renamed from: h */
    public C10003m mo38775h(String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f33584q, 0, m38765G());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new C10003m(bArrDigest);
    }

    public int hashCode() {
        int iM38779l = m38779l();
        if (iM38779l != 0) {
            return iM38779l;
        }
        int iHashCode = Arrays.hashCode(m38778k());
        m38761C(iHashCode);
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m38776i(C10003m c10003m) {
        c10003m.getClass();
        return mo38759A(m38765G() - c10003m.m38765G(), c10003m, 0, c10003m.m38765G());
    }

    /* JADX INFO: renamed from: j */
    public final byte m38777j(int i10) {
        return mo38786v(i10);
    }

    /* JADX INFO: renamed from: k */
    public final byte[] m38778k() {
        return this.f33584q;
    }

    /* JADX INFO: renamed from: l */
    public final int m38779l() {
        return this.f33585r;
    }

    /* JADX INFO: renamed from: m */
    public int mo38780m() {
        return m38778k().length;
    }

    /* JADX INFO: renamed from: n */
    public final String m38781n() {
        return this.f33586s;
    }

    /* JADX INFO: renamed from: p */
    public String mo38782p() {
        char[] cArr = new char[m38778k().length * 2];
        int i10 = 0;
        for (byte b10 : m38778k()) {
            int i11 = i10 + 1;
            cArr[i10] = AbstractC0303b.m909d()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = AbstractC0303b.m909d()[b10 & 15];
        }
        return AbstractC8611a0.m33076w(cArr);
    }

    /* JADX INFO: renamed from: r */
    public final int m38783r(C10003m c10003m, int i10) {
        c10003m.getClass();
        return mo38784s(c10003m.mo38785u(), i10);
    }

    /* JADX INFO: renamed from: s */
    public int mo38784s(byte[] bArr, int i10) {
        bArr.getClass();
        int length = m38778k().length - bArr.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC9978b.m38614a(m38778k(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public String toString() {
        if (m38778k().length == 0) {
            return "[size=0]";
        }
        int iM907b = AbstractC0303b.m907b(m38778k(), 64);
        if (iM907b != -1) {
            String strM38770M = m38770M();
            String strM33069N = AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(strM38770M.substring(0, iM907b), "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iM907b >= strM38770M.length()) {
                return "[text=" + strM33069N + ']';
            }
            return "[size=" + m38778k().length + " text=" + strM33069N + "…]";
        }
        if (m38778k().length <= 64) {
            return "[hex=" + mo38782p() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(m38778k().length);
        sb2.append(" hex=");
        int iM38618e = AbstractC9978b.m38618e(this, 64);
        if (iM38618e > m38778k().length) {
            C10001l.m38755a("endIndex > length(", m38778k().length, 41);
            return null;
        }
        if (iM38618e < 0) {
            C9987e.m38645a("endIndex < beginIndex");
            return null;
        }
        sb2.append((iM38618e == m38778k().length ? this : new C10003m(AbstractC5102r.m20666r(m38778k(), 0, iM38618e))).mo38782p());
        sb2.append("…]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public byte[] mo38785u() {
        return m38778k();
    }

    /* JADX INFO: renamed from: v */
    public byte mo38786v(int i10) {
        return m38778k()[i10];
    }

    /* JADX INFO: renamed from: w */
    public final int m38787w(C10003m c10003m, int i10) {
        c10003m.getClass();
        return mo38788x(c10003m.mo38785u(), i10);
    }

    /* JADX INFO: renamed from: x */
    public int mo38788x(byte[] bArr, int i10) {
        bArr.getClass();
        for (int iMin = Math.min(AbstractC9978b.m38618e(this, i10), m38778k().length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC9978b.m38614a(m38778k(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public final C10003m m38789z() {
        return mo38775h("MD5");
    }

    /* JADX INFO: renamed from: zd.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ C10003m m38790g(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC9978b.m38616c();
            }
            return aVar.m38796f(bArr, i10, i11);
        }

        /* JADX INFO: renamed from: a */
        public final C10003m m38791a(String str) {
            str.getClass();
            byte[] bArrM38609a = AbstractC9975a.m38609a(str);
            if (bArrM38609a != null) {
                return new C10003m(bArrM38609a);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final C10003m m38792b(String str) {
            str.getClass();
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((AbstractC0304c.m911b(str.charAt(i11)) << 4) + AbstractC0304c.m911b(str.charAt(i11 + 1)));
            }
            return new C10003m(bArr);
        }

        /* JADX INFO: renamed from: c */
        public final C10003m m38793c(String str, Charset charset) {
            str.getClass();
            charset.getClass();
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return new C10003m(bytes);
        }

        /* JADX INFO: renamed from: d */
        public final C10003m m38794d(String str) {
            str.getClass();
            C10003m c10003m = new C10003m(AbstractC9986d1.m38642a(str));
            c10003m.m38762D(str);
            return c10003m;
        }

        /* JADX INFO: renamed from: e */
        public final C10003m m38795e(byte... bArr) {
            bArr.getClass();
            return new C10003m(Arrays.copyOf(bArr, bArr.length));
        }

        /* JADX INFO: renamed from: f */
        public final C10003m m38796f(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            int iM38619f = AbstractC9978b.m38619f(bArr, i11);
            AbstractC9978b.m38615b(bArr.length, i10, iM38619f);
            return new C10003m(AbstractC5102r.m20666r(bArr, i10, iM38619f + i10));
        }

        /* JADX INFO: renamed from: h */
        public final C10003m m38797h(InputStream inputStream, int i10) throws IOException {
            inputStream.getClass();
            if (i10 < 0) {
                C10030z0.m38853a("byteCount < 0: ", i10);
                return null;
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new C10003m(bArr);
        }

        public a() {
        }
    }
}
