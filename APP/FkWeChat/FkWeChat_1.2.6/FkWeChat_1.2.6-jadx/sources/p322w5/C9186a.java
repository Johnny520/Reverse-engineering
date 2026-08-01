package p322w5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: w5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9186a {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f31389a;

    /* JADX INFO: renamed from: b */
    public int f31390b;

    /* JADX INFO: renamed from: c */
    public int f31391c;

    /* JADX INFO: renamed from: d */
    public int[] f31392d;

    /* JADX INFO: renamed from: e */
    public int f31393e;

    /* JADX INFO: renamed from: f */
    public boolean f31394f;

    /* JADX INFO: renamed from: g */
    public boolean f31395g;

    /* JADX INFO: renamed from: h */
    public int f31396h;

    /* JADX INFO: renamed from: i */
    public int[] f31397i;

    /* JADX INFO: renamed from: j */
    public int f31398j;

    /* JADX INFO: renamed from: k */
    public int f31399k;

    /* JADX INFO: renamed from: l */
    public boolean f31400l;

    /* JADX INFO: renamed from: m */
    public a f31401m;

    /* JADX INFO: renamed from: n */
    public final AbstractC9188c f31402n;

    /* JADX INFO: renamed from: w5.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends a {

        /* JADX INFO: renamed from: a */
        public static final b f31403a = new b();

        @Override // p322w5.C9186a.a
        /* JADX INFO: renamed from: a */
        public ByteBuffer mo35781a(int i10) {
            return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public C9186a(int i10, a aVar, ByteBuffer byteBuffer, AbstractC9188c abstractC9188c) {
        this.f31391c = 1;
        this.f31392d = null;
        this.f31393e = 0;
        this.f31394f = false;
        this.f31395g = false;
        this.f31397i = new int[16];
        this.f31398j = 0;
        this.f31399k = 0;
        this.f31400l = false;
        i10 = i10 <= 0 ? 1024 : i10;
        this.f31401m = aVar;
        if (byteBuffer != null) {
            this.f31389a = byteBuffer;
            byteBuffer.clear();
            this.f31389a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f31389a = aVar.mo35781a(i10);
        }
        this.f31402n = abstractC9188c;
        this.f31390b = this.f31389a.capacity();
    }

    /* JADX INFO: renamed from: x */
    public static ByteBuffer m35741x(ByteBuffer byteBuffer, a aVar) {
        int i10;
        int iCapacity = byteBuffer.capacity();
        if (iCapacity == 0) {
            i10 = 1024;
        } else {
            i10 = 2147483639;
            if (iCapacity == 2147483639) {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
            if (((-1073741824) & iCapacity) == 0) {
                i10 = iCapacity << 1;
            }
        }
        byteBuffer.position(0);
        ByteBuffer byteBufferMo35781a = aVar.mo35781a(i10);
        byteBufferMo35781a.position(byteBufferMo35781a.clear().capacity() - iCapacity);
        byteBufferMo35781a.put(byteBuffer);
        return byteBufferMo35781a;
    }

    /* JADX INFO: renamed from: A */
    public void m35742A(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBuffer = this.f31389a;
            int i12 = this.f31390b - 1;
            this.f31390b = i12;
            byteBuffer.put(i12, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m35743B(int i10, int i11) {
        if (i10 > this.f31391c) {
            this.f31391c = i10;
        }
        int i12 = ((~((this.f31389a.capacity() - this.f31390b) + i11)) + 1) & (i10 - 1);
        while (this.f31390b < i12 + i10 + i11) {
            int iCapacity = this.f31389a.capacity();
            ByteBuffer byteBuffer = this.f31389a;
            ByteBuffer byteBufferM35741x = m35741x(byteBuffer, this.f31401m);
            this.f31389a = byteBufferM35741x;
            if (byteBuffer != byteBufferM35741x) {
                this.f31401m.m35782b(byteBuffer);
            }
            this.f31390b += this.f31389a.capacity() - iCapacity;
        }
        m35742A(i12);
    }

    /* JADX INFO: renamed from: C */
    public void m35744C(boolean z10) {
        ByteBuffer byteBuffer = this.f31389a;
        int i10 = this.f31390b - 1;
        this.f31390b = i10;
        byteBuffer.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: D */
    public void m35745D(byte b10) {
        ByteBuffer byteBuffer = this.f31389a;
        int i10 = this.f31390b - 1;
        this.f31390b = i10;
        byteBuffer.put(i10, b10);
    }

    /* JADX INFO: renamed from: E */
    public void m35746E(double d10) {
        ByteBuffer byteBuffer = this.f31389a;
        int i10 = this.f31390b - 8;
        this.f31390b = i10;
        byteBuffer.putDouble(i10, d10);
    }

    /* JADX INFO: renamed from: F */
    public void m35747F(float f10) {
        ByteBuffer byteBuffer = this.f31389a;
        int i10 = this.f31390b - 4;
        this.f31390b = i10;
        byteBuffer.putFloat(i10, f10);
    }

    /* JADX INFO: renamed from: G */
    public void m35748G(int i10) {
        ByteBuffer byteBuffer = this.f31389a;
        int i11 = this.f31390b - 4;
        this.f31390b = i11;
        byteBuffer.putInt(i11, i10);
    }

    /* JADX INFO: renamed from: H */
    public void m35749H(long j10) {
        ByteBuffer byteBuffer = this.f31389a;
        int i10 = this.f31390b - 8;
        this.f31390b = i10;
        byteBuffer.putLong(i10, j10);
    }

    /* JADX INFO: renamed from: I */
    public void m35750I(short s10) {
        ByteBuffer byteBuffer = this.f31389a;
        int i10 = this.f31390b - 2;
        this.f31390b = i10;
        byteBuffer.putShort(i10, s10);
    }

    /* JADX INFO: renamed from: J */
    public byte[] m35751J() {
        return m35752K(this.f31390b, this.f31389a.capacity() - this.f31390b);
    }

    /* JADX INFO: renamed from: K */
    public byte[] m35752K(int i10, int i11) {
        m35778w();
        byte[] bArr = new byte[i11];
        this.f31389a.position(i10);
        this.f31389a.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: L */
    public void m35753L(int i10) {
        this.f31392d[i10] = m35780z();
    }

    /* JADX INFO: renamed from: M */
    public void m35754M(int i10) {
        m35779y();
        int[] iArr = this.f31392d;
        if (iArr == null || iArr.length < i10) {
            this.f31392d = new int[i10];
        }
        this.f31393e = i10;
        Arrays.fill(this.f31392d, 0, i10, 0);
        this.f31394f = true;
        this.f31396h = m35780z();
    }

    /* JADX INFO: renamed from: N */
    public void m35755N(int i10, int i11, int i12) {
        m35779y();
        this.f31399k = i11;
        int i13 = i10 * i11;
        m35743B(4, i13);
        m35743B(i12, i13);
        this.f31394f = true;
    }

    /* JADX INFO: renamed from: a */
    public void m35756a(int i10, boolean z10, boolean z11) {
        if (this.f31400l || z10 != z11) {
            m35757b(z10);
            m35753L(i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35757b(boolean z10) {
        m35743B(1, 0);
        m35744C(z10);
    }

    /* JADX INFO: renamed from: c */
    public void m35758c(byte b10) {
        m35743B(1, 0);
        m35745D(b10);
    }

    /* JADX INFO: renamed from: d */
    public void m35759d(int i10, byte b10, int i11) {
        if (this.f31400l || b10 != i11) {
            m35758c(b10);
            m35753L(i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m35760e(double d10) {
        m35743B(8, 0);
        m35746E(d10);
    }

    /* JADX INFO: renamed from: f */
    public void m35761f(int i10, double d10, double d11) {
        if (this.f31400l || d10 != d11) {
            m35760e(d10);
            m35753L(i10);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m35762g(float f10) {
        m35743B(4, 0);
        m35747F(f10);
    }

    /* JADX INFO: renamed from: h */
    public void m35763h(int i10, float f10, double d10) {
        if (this.f31400l || f10 != d10) {
            m35762g(f10);
            m35753L(i10);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m35764i(int i10) {
        m35743B(4, 0);
        m35748G(i10);
    }

    /* JADX INFO: renamed from: j */
    public void m35765j(int i10, int i11, int i12) {
        if (this.f31400l || i11 != i12) {
            m35764i(i11);
            m35753L(i10);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m35766k(int i10, long j10, long j11) {
        if (this.f31400l || j10 != j11) {
            m35767l(j10);
            m35753L(i10);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m35767l(long j10) {
        m35743B(8, 0);
        m35749H(j10);
    }

    /* JADX INFO: renamed from: m */
    public void m35768m(int i10) {
        m35743B(4, 0);
        m35748G((m35780z() - i10) + 4);
    }

    /* JADX INFO: renamed from: n */
    public void m35769n(int i10, int i11, int i12) {
        if (this.f31400l || i11 != i12) {
            m35768m(i11);
            m35753L(i10);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m35770o(int i10, short s10, int i11) {
        if (this.f31400l || s10 != i11) {
            m35771p(s10);
            m35753L(i10);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m35771p(short s10) {
        m35743B(2, 0);
        m35750I(s10);
    }

    /* JADX INFO: renamed from: q */
    public int m35772q(CharSequence charSequence) {
        int iMo35797c = this.f31402n.mo35797c(charSequence);
        m35758c((byte) 0);
        m35755N(1, iMo35797c, 1);
        ByteBuffer byteBuffer = this.f31389a;
        int i10 = this.f31390b - iMo35797c;
        this.f31390b = i10;
        byteBuffer.position(i10);
        this.f31402n.mo35796b(charSequence, this.f31389a);
        return m35775t();
    }

    /* JADX INFO: renamed from: r */
    public int m35773r(int[] iArr) {
        m35779y();
        m35755N(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m35768m(iArr[length]);
        }
        return m35775t();
    }

    /* JADX INFO: renamed from: s */
    public int m35774s() {
        int i10;
        if (this.f31392d == null || !this.f31394f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m35764i(0);
        int iM35780z = m35780z();
        int i11 = this.f31393e - 1;
        while (i11 >= 0 && this.f31392d[i11] == 0) {
            i11--;
        }
        for (int i12 = i11; i12 >= 0; i12--) {
            int i13 = this.f31392d[i12];
            m35771p((short) (i13 != 0 ? iM35780z - i13 : 0));
        }
        m35771p((short) (iM35780z - this.f31396h));
        m35771p((short) ((i11 + 3) * 2));
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= this.f31398j) {
                i10 = 0;
                break;
            }
            int iCapacity = this.f31389a.capacity() - this.f31397i[i14];
            int i15 = this.f31390b;
            short s10 = this.f31389a.getShort(iCapacity);
            if (s10 == this.f31389a.getShort(i15)) {
                for (int i16 = 2; i16 < s10; i16 += 2) {
                    if (this.f31389a.getShort(iCapacity + i16) != this.f31389a.getShort(i15 + i16)) {
                        break;
                    }
                }
                i10 = this.f31397i[i14];
                break loop2;
            }
            i14++;
        }
        if (i10 != 0) {
            int iCapacity2 = this.f31389a.capacity() - iM35780z;
            this.f31390b = iCapacity2;
            this.f31389a.putInt(iCapacity2, i10 - iM35780z);
        } else {
            int i17 = this.f31398j;
            int[] iArr = this.f31397i;
            if (i17 == iArr.length) {
                this.f31397i = Arrays.copyOf(iArr, i17 * 2);
            }
            int[] iArr2 = this.f31397i;
            int i18 = this.f31398j;
            this.f31398j = i18 + 1;
            iArr2[i18] = m35780z();
            ByteBuffer byteBuffer = this.f31389a;
            byteBuffer.putInt(byteBuffer.capacity() - iM35780z, m35780z() - iM35780z);
        }
        this.f31394f = false;
        return iM35780z;
    }

    /* JADX INFO: renamed from: t */
    public int m35775t() {
        if (!this.f31394f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f31394f = false;
        m35748G(this.f31399k);
        return m35780z();
    }

    /* JADX INFO: renamed from: u */
    public void m35776u(int i10) {
        m35777v(i10, false);
    }

    /* JADX INFO: renamed from: v */
    public void m35777v(int i10, boolean z10) {
        m35743B(this.f31391c, (z10 ? 4 : 0) + 4);
        m35768m(i10);
        if (z10) {
            m35764i(this.f31389a.capacity() - this.f31390b);
        }
        this.f31389a.position(this.f31390b);
        this.f31395g = true;
    }

    /* JADX INFO: renamed from: w */
    public void m35778w() {
        if (!this.f31395g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    /* JADX INFO: renamed from: y */
    public void m35779y() {
        if (this.f31394f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    /* JADX INFO: renamed from: z */
    public int m35780z() {
        return this.f31389a.capacity() - this.f31390b;
    }

    /* JADX INFO: renamed from: w5.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract ByteBuffer mo35781a(int i10);

        /* JADX INFO: renamed from: b */
        public void m35782b(ByteBuffer byteBuffer) {
        }
    }

    public C9186a(int i10) {
        this(i10, b.f31403a, null, AbstractC9188c.m35794d());
    }

    public C9186a() {
        this(1024);
    }
}
