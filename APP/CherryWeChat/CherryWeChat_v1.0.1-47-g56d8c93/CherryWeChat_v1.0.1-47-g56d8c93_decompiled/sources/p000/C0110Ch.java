package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: Ch */
/* JADX INFO: loaded from: classes.dex */
public final class C0110Ch {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f258a;

    /* JADX INFO: renamed from: b */
    public int f259b;

    /* JADX INFO: renamed from: c */
    public int f260c;

    /* JADX INFO: renamed from: d */
    public int[] f261d;

    /* JADX INFO: renamed from: e */
    public int f262e;

    /* JADX INFO: renamed from: f */
    public boolean f263f;

    /* JADX INFO: renamed from: g */
    public boolean f264g;

    /* JADX INFO: renamed from: h */
    public int f265h;

    /* JADX INFO: renamed from: i */
    public int[] f266i;

    /* JADX INFO: renamed from: j */
    public int f267j;

    /* JADX INFO: renamed from: k */
    public int f268k;

    /* JADX INFO: renamed from: l */
    public final C1456gf f269l;

    /* JADX INFO: renamed from: m */
    public final C1517hw f270m;

    public C0110Ch() {
        C1456gf c1456gf = C1456gf.f5160d;
        if (C1517hw.f5366b == null) {
            C1517hw.f5366b = new C1517hw(19);
        }
        C1517hw c1517hw = C1517hw.f5366b;
        this.f260c = 1;
        this.f261d = null;
        this.f262e = 0;
        this.f263f = false;
        this.f264g = false;
        this.f266i = new int[16];
        this.f267j = 0;
        this.f268k = 0;
        this.f269l = c1456gf;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f258a = byteBufferOrder;
        this.f270m = c1517hw;
        this.f259b = byteBufferOrder.capacity();
    }

    /* JADX INFO: renamed from: a */
    public final void m162a(int i, int i2) {
        if (i2 != 0) {
            m168g(4, 0);
            int iM167f = (m167f() - i2) + 4;
            ByteBuffer byteBuffer = this.f258a;
            int i3 = this.f259b - 4;
            this.f259b = i3;
            byteBuffer.putInt(i3, iM167f);
            this.f261d[i] = m167f();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m163b(short s) {
        m168g(2, 0);
        ByteBuffer byteBuffer = this.f258a;
        int i = this.f259b - 2;
        this.f259b = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX INFO: renamed from: c */
    public final int m164c(int[] iArr) {
        boolean z = this.f263f;
        if (z) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int length = iArr.length;
        if (z) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f268k = length;
        int i = length * 4;
        m168g(4, i);
        m168g(4, i);
        this.f263f = true;
        for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
            int i2 = iArr[length2];
            m168g(4, 0);
            int iM167f = (m167f() - i2) + 4;
            ByteBuffer byteBuffer = this.f258a;
            int i3 = this.f259b - 4;
            this.f259b = i3;
            byteBuffer.putInt(i3, iM167f);
        }
        if (!this.f263f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f263f = false;
        int i4 = this.f268k;
        ByteBuffer byteBuffer2 = this.f258a;
        int i5 = this.f259b - 4;
        this.f259b = i5;
        byteBuffer2.putInt(i5, i4);
        return m167f();
    }

    /* JADX INFO: renamed from: d */
    public final int m165d() {
        int i;
        if (this.f261d == null || !this.f263f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m168g(4, 0);
        ByteBuffer byteBuffer = this.f258a;
        int i2 = this.f259b - 4;
        this.f259b = i2;
        byteBuffer.putInt(i2, 0);
        int iM167f = m167f();
        int i3 = this.f262e - 1;
        while (i3 >= 0 && this.f261d[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = this.f261d[i4];
            m163b((short) (i5 != 0 ? iM167f - i5 : 0));
        }
        m163b((short) (iM167f - this.f265h));
        m163b((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f267j) {
                i = 0;
                break;
            }
            int iCapacity = this.f258a.capacity() - this.f266i[i6];
            int i7 = this.f259b;
            short s = this.f258a.getShort(iCapacity);
            if (s == this.f258a.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.f258a.getShort(iCapacity + i8) != this.f258a.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.f266i[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = this.f258a.capacity() - iM167f;
            this.f259b = iCapacity2;
            this.f258a.putInt(iCapacity2, i - iM167f);
        } else {
            int i9 = this.f267j;
            int[] iArr = this.f266i;
            if (i9 == iArr.length) {
                this.f266i = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f266i;
            int i10 = this.f267j;
            this.f267j = i10 + 1;
            iArr2[i10] = m167f();
            ByteBuffer byteBuffer2 = this.f258a;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM167f, m167f() - iM167f);
        }
        this.f263f = false;
        return iM167f;
    }

    /* JADX INFO: renamed from: e */
    public final void m166e(int i) {
        m168g(this.f260c, 4);
        m168g(4, 0);
        int iM167f = (m167f() - i) + 4;
        ByteBuffer byteBuffer = this.f258a;
        int i2 = this.f259b - 4;
        this.f259b = i2;
        byteBuffer.putInt(i2, iM167f);
        this.f258a.position(this.f259b);
        this.f264g = true;
    }

    /* JADX INFO: renamed from: f */
    public final int m167f() {
        return this.f258a.capacity() - this.f259b;
    }

    /* JADX INFO: renamed from: g */
    public final void m168g(int i, int i2) {
        int i3;
        if (i > this.f260c) {
            this.f260c = i;
        }
        int i4 = ((~((this.f258a.capacity() - this.f259b) + i2)) + 1) & (i - 1);
        while (this.f259b < i4 + i + i2) {
            int iCapacity = this.f258a.capacity();
            ByteBuffer byteBuffer = this.f258a;
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
            this.f269l.getClass();
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f258a = byteBufferOrder;
            this.f259b = (byteBufferOrder.capacity() - iCapacity) + this.f259b;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.f258a;
            int i6 = this.f259b - 1;
            this.f259b = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m169h() {
        int i = this.f259b;
        int iCapacity = this.f258a.capacity() - this.f259b;
        if (!this.f264g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        this.f258a.position(i);
        this.f258a.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: i */
    public final void m170i(int i) {
        if (this.f263f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f261d;
        if (iArr == null || iArr.length < i) {
            this.f261d = new int[i];
        }
        this.f262e = i;
        Arrays.fill(this.f261d, 0, i, 0);
        this.f263f = true;
        this.f265h = m167f();
    }
}
