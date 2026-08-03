package p000a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: a.B6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0026B6 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f76a;

    /* JADX INFO: renamed from: b */
    public int f77b;

    /* JADX INFO: renamed from: c */
    public int f78c;

    /* JADX INFO: renamed from: d */
    public int[] f79d;

    /* JADX INFO: renamed from: e */
    public int f80e;

    /* JADX INFO: renamed from: f */
    public boolean f81f;

    /* JADX INFO: renamed from: g */
    public boolean f82g;

    /* JADX INFO: renamed from: h */
    public int f83h;

    /* JADX INFO: renamed from: i */
    public int[] f84i;

    /* JADX INFO: renamed from: j */
    public int f85j;

    /* JADX INFO: renamed from: k */
    public int f86k;

    /* JADX INFO: renamed from: l */
    public final b f87l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0486ag f88m;

    /* JADX INFO: renamed from: a.B6$a */
    public static abstract class a {
    }

    /* JADX INFO: renamed from: a.B6$b */
    public static final class b extends a {

        /* JADX INFO: renamed from: a */
        public static final b f89a = new b();
    }

    public C0026B6() {
        b bVar = b.f89a;
        if (AbstractC0486ag.f1813a == null) {
            AbstractC0486ag.f1813a = new C0505bg();
        }
        C0505bg c0505bg = AbstractC0486ag.f1813a;
        this.f78c = 1;
        this.f79d = null;
        this.f80e = 0;
        this.f81f = false;
        this.f82g = false;
        this.f84i = new int[16];
        this.f85j = 0;
        this.f86k = 0;
        this.f87l = bVar;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f76a = byteBufferOrder;
        this.f88m = c0505bg;
        this.f77b = byteBufferOrder.capacity();
    }

    /* JADX INFO: renamed from: a */
    public final void m60a(int i, int i2) {
        if (i2 != 0) {
            m67h(4, 0);
            int iM66g = (m66g() - i2) + 4;
            ByteBuffer byteBuffer = this.f76a;
            int i3 = this.f77b - 4;
            this.f77b = i3;
            byteBuffer.putInt(i3, iM66g);
            this.f79d[i] = m66g();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m61b(short s) {
        m67h(2, 0);
        ByteBuffer byteBuffer = this.f76a;
        int i = this.f77b - 2;
        this.f77b = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX INFO: renamed from: c */
    public final int m62c(CharSequence charSequence) {
        AbstractC0486ag abstractC0486ag = this.f88m;
        int iMo1175c = abstractC0486ag.mo1175c(charSequence);
        m67h(1, 0);
        ByteBuffer byteBuffer = this.f76a;
        int i = this.f77b - 1;
        this.f77b = i;
        byteBuffer.put(i, (byte) 0);
        if (this.f81f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f86k = iMo1175c;
        m67h(4, iMo1175c);
        m67h(1, iMo1175c);
        this.f81f = true;
        ByteBuffer byteBuffer2 = this.f76a;
        int i2 = this.f77b - iMo1175c;
        this.f77b = i2;
        byteBuffer2.position(i2);
        abstractC0486ag.mo1174b(charSequence, this.f76a);
        if (!this.f81f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f81f = false;
        int i3 = this.f86k;
        ByteBuffer byteBuffer3 = this.f76a;
        int i4 = this.f77b - 4;
        this.f77b = i4;
        byteBuffer3.putInt(i4, i3);
        return m66g();
    }

    /* JADX INFO: renamed from: d */
    public final int m63d(int[] iArr) {
        boolean z = this.f81f;
        if (z) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int length = iArr.length;
        if (z) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f86k = length;
        int i = length * 4;
        m67h(4, i);
        m67h(4, i);
        this.f81f = true;
        for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
            int i2 = iArr[length2];
            m67h(4, 0);
            int iM66g = (m66g() - i2) + 4;
            ByteBuffer byteBuffer = this.f76a;
            int i3 = this.f77b - 4;
            this.f77b = i3;
            byteBuffer.putInt(i3, iM66g);
        }
        if (!this.f81f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f81f = false;
        int i4 = this.f86k;
        ByteBuffer byteBuffer2 = this.f76a;
        int i5 = this.f77b - 4;
        this.f77b = i5;
        byteBuffer2.putInt(i5, i4);
        return m66g();
    }

    /* JADX INFO: renamed from: e */
    public final int m64e() {
        int i;
        if (this.f79d == null || !this.f81f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m67h(4, 0);
        ByteBuffer byteBuffer = this.f76a;
        int i2 = this.f77b - 4;
        this.f77b = i2;
        byteBuffer.putInt(i2, 0);
        int iM66g = m66g();
        int i3 = this.f80e - 1;
        while (i3 >= 0 && this.f79d[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.f79d[i4];
            m61b((short) (i5 != 0 ? iM66g - i5 : 0));
        }
        m61b((short) (iM66g - this.f83h));
        m61b((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f85j) {
                i = 0;
                break;
            }
            int iCapacity = this.f76a.capacity() - this.f84i[i6];
            int i7 = this.f77b;
            short s = this.f76a.getShort(iCapacity);
            if (s == this.f76a.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.f76a.getShort(iCapacity + i8) != this.f76a.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.f84i[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = this.f76a.capacity() - iM66g;
            this.f77b = iCapacity2;
            this.f76a.putInt(iCapacity2, i - iM66g);
        } else {
            int i9 = this.f85j;
            int[] iArr = this.f84i;
            if (i9 == iArr.length) {
                this.f84i = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f84i;
            int i10 = this.f85j;
            this.f85j = i10 + 1;
            iArr2[i10] = m66g();
            ByteBuffer byteBuffer2 = this.f76a;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM66g, m66g() - iM66g);
        }
        this.f81f = false;
        return iM66g;
    }

    /* JADX INFO: renamed from: f */
    public final void m65f(int i) {
        m67h(this.f78c, 4);
        m67h(4, 0);
        int iM66g = (m66g() - i) + 4;
        ByteBuffer byteBuffer = this.f76a;
        int i2 = this.f77b - 4;
        this.f77b = i2;
        byteBuffer.putInt(i2, iM66g);
        this.f76a.position(this.f77b);
        this.f82g = true;
    }

    /* JADX INFO: renamed from: g */
    public final int m66g() {
        return this.f76a.capacity() - this.f77b;
    }

    /* JADX INFO: renamed from: h */
    public final void m67h(int i, int i2) {
        int i3;
        if (i > this.f78c) {
            this.f78c = i;
        }
        int i4 = ((~((this.f76a.capacity() - this.f77b) + i2)) + 1) & (i - 1);
        while (this.f77b < i4 + i + i2) {
            int iCapacity = this.f76a.capacity();
            ByteBuffer byteBuffer = this.f76a;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            this.f87l.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f76a = byteBufferOrder;
            this.f77b = (byteBufferOrder.capacity() - iCapacity) + this.f77b;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.f76a;
            int i6 = this.f77b - 1;
            this.f77b = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m68i(int i) {
        if (this.f81f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f79d;
        if (iArr == null || iArr.length < i) {
            this.f79d = new int[i];
        }
        this.f80e = i;
        Arrays.fill(this.f79d, 0, i, 0);
        this.f81f = true;
        this.f83h = m66g();
    }
}
