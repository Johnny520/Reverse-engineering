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
        C1456gf r0 = C1456gf.f5160d;
        if (C1517hw.f5366b != null) goto L5;
        C1517hw.f5366b = new C1517hw(19);
    L5:
        C1517hw r1 = C1517hw.f5366b;
        this.f260c = 1;
        this.f261d = null;
        this.f262e = 0;
        this.f263f = false;
        this.f264g = false;
        this.f266i = new int[16];
        this.f267j = 0;
        this.f268k = 0;
        this.f269l = r0;
        ByteBuffer r02 = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f258a = r02;
        this.f270m = r1;
        this.f259b = r02.capacity();
    }

    /* JADX INFO: renamed from: a */
    public final void m162a(int r4, int r5) {
        if (r5 == 0) goto L5;
        m168g(4, 0);
        int r0 = (m167f() - r5) + 4;
        ByteBuffer r52 = this.f258a;
        int r2 = this.f259b - 4;
        this.f259b = r2;
        r52.putInt(r2, r0);
        this.f261d[r4] = m167f();
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m163b(short r4) {
        m168g(2, 0);
        ByteBuffer r0 = this.f258a;
        int r2 = this.f259b - 2;
        this.f259b = r2;
        r0.putShort(r2, r4);
    }

    /* JADX INFO: renamed from: c */
    public final int m164c(int[] r6) {
        boolean r0 = this.f263f;
        if (r0 == true) goto L19;
        int r2 = r6.length;
        if (r0 == true) goto L17;
        this.f268k = r2;
        int r22 = r2 * 4;
        m168g(4, r22);
        m168g(4, r22);
        this.f263f = true;
        int r23 = r6.length - 1;
    L8:
        if (r23 < 0) goto L11;
        int r3 = r6[r23];
        m168g(4, 0);
        int r1 = (m167f() - r3) + 4;
        ByteBuffer r32 = this.f258a;
        int r4 = this.f259b - 4;
        this.f259b = r4;
        r32.putInt(r4, r1);
        r23 = r23 - 1;
        goto L8
    L11:
        if (this.f263f == false) goto L15;
        this.f263f = false;
        int r62 = this.f268k;
        ByteBuffer r12 = this.f258a;
        int r24 = this.f259b - 4;
        this.f259b = r24;
        r12.putInt(r24, r62);
        return m167f();
    L15:
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    L17:
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    L19:
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    /* JADX INFO: renamed from: d */
    public final int m165d() {
        if (this.f261d == null) goto L41;
        if (this.f263f == false) goto L41;
        m168g(4, 0);
        ByteBuffer r2 = this.f258a;
        int r3 = this.f259b - 4;
        this.f259b = r3;
        r2.putInt(r3, 0);
        int r0 = m167f();
        int r22 = this.f262e - 1;
    L7:
        if (r22 < 0) goto L11;
        if (this.f261d[r22] != 0) goto L11;
        r22 = r22 - 1;
    L11:
        int r32 = r22;
    L12:
        if (r32 < 0) goto L18;
        int r4 = this.f261d[r32];
        if (r4 == 0) goto L16;
        int r42 = r0 - r4;
    L17:
        m163b((short) r42);
        r32 = r32 - 1;
        goto L12
    L16:
        r42 = 0;
        goto L17
    L18:
        m163b((short) (r0 - this.f265h));
        m163b((short) ((r22 + 3) * 2));
        int r23 = 0;
    L20:
        if (r23 >= this.f267j) goto L31;
        int r43 = this.f258a.capacity() - this.f266i[r23];
        int r5 = this.f259b;
        short r6 = this.f258a.getShort(r43);
        if (r6 != this.f258a.getShort(r5)) goto L30;
        int r7 = 2;
    L24:
        if (r7 >= r6) goto L29;
        if (this.f258a.getShort(r43 + r7) != this.f258a.getShort(r5 + r7)) goto L30;
        r7 = r7 + 2;
        goto L24
    L29:
        int r24 = this.f266i[r23];
    L32:
        if (r24 == 0) goto L34;
        int r33 = this.f258a.capacity() - r0;
        this.f259b = r33;
        this.f258a.putInt(r33, r24 - r0);
    L38:
        this.f263f = false;
        return r0;
    L34:
        int r25 = this.f267j;
        int[] r44 = this.f266i;
        if (r25 != r44.length) goto L37;
        this.f266i = Arrays.copyOf(r44, r25 * 2);
    L37:
        int[] r26 = this.f266i;
        int r34 = this.f267j;
        this.f267j = r34 + 1;
        r26[r34] = m167f();
        ByteBuffer r27 = this.f258a;
        r27.putInt(r27.capacity() - r0, m167f() - r0);
    L30:
        r23 = r23 + 1;
        goto L20
    L31:
        r24 = 0;
    L41:
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    /* JADX INFO: renamed from: e */
    public final void m166e(int r4) {
        m168g(this.f260c, 4);
        m168g(4, 0);
        int r0 = (m167f() - r4) + 4;
        ByteBuffer r42 = this.f258a;
        int r2 = this.f259b - 4;
        this.f259b = r2;
        r42.putInt(r2, r0);
        this.f258a.position(this.f259b);
        this.f264g = true;
    }

    /* JADX INFO: renamed from: f */
    public final int m167f() {
        return this.f258a.capacity() - this.f259b;
    }

    /* JADX INFO: renamed from: g */
    public final void m168g(int r8, int r9) {
        if (r8 <= this.f260c) goto L5;
        this.f260c = r8;
    L5:
        int r0 = ((~((this.f258a.capacity() - this.f259b) + r9)) + 1) & (r8 - 1);
    L7:
        if (this.f259b >= ((r0 + r8) + r9)) goto L20;
        int r1 = this.f258a.capacity();
        ByteBuffer r2 = this.f258a;
        int r4 = r2.capacity();
        if (r4 != 0) goto L11;
        int r5 = 1024;
    L17:
        r2.position(0);
        this.f269l.getClass();
        ByteBuffer r3 = ByteBuffer.allocate(r5).order(ByteOrder.LITTLE_ENDIAN);
        r3.position(r3.clear().capacity() - r4);
        r3.put(r2);
        this.f258a = r3;
        this.f259b = (r3.capacity() - r1) + this.f259b;
        goto L7
    L11:
        r5 = 2147483639;
        if (r4 == 2147483639) goto L19;
        if (((-1073741824) & r4) != 0) goto L17;
        r5 = r4 << 1;
        goto L17
    L19:
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    L20:
        int r82 = 0;
    L21:
        if (r82 >= r0) goto L23;
        ByteBuffer r92 = this.f258a;
        int r12 = this.f259b - 1;
        this.f259b = r12;
        r92.put(r12, (byte) 0);
        r82 = r82 + 1;
        goto L21
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m169h() {
        int r0 = this.f259b;
        int r1 = this.f258a.capacity() - this.f259b;
        if (this.f264g == false) goto L7;
        byte[] r12 = new byte[r1];
        this.f258a.position(r0);
        this.f258a.get(r12);
        return r12;
    L7:
        throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }

    /* JADX INFO: renamed from: i */
    public final void m170i(int r3) {
        if (this.f263f == true) goto L12;
        int[] r0 = this.f261d;
        if (r0 != null) goto L7;
    L8:
        this.f261d = new int[r3];
    L9:
        this.f262e = r3;
        Arrays.fill(this.f261d, 0, r3, 0);
        this.f263f = true;
        this.f265h = m167f();
        return;
    L7:
        if (r0.length >= r3) goto L9;
    L12:
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }
}
