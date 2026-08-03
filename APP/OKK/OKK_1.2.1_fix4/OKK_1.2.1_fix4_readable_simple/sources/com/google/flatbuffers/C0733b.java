package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.flatbuffers.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0733b {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f2558a;

    /* JADX INFO: renamed from: b */
    public int f2559b;

    /* JADX INFO: renamed from: c */
    public int f2560c;

    /* JADX INFO: renamed from: d */
    public int[] f2561d;

    /* JADX INFO: renamed from: e */
    public int f2562e;

    /* JADX INFO: renamed from: f */
    public boolean f2563f;

    /* JADX INFO: renamed from: g */
    public boolean f2564g;

    /* JADX INFO: renamed from: h */
    public int f2565h;

    /* JADX INFO: renamed from: i */
    public int[] f2566i;

    /* JADX INFO: renamed from: j */
    public int f2567j;

    /* JADX INFO: renamed from: k */
    public int f2568k;

    /* JADX INFO: renamed from: l */
    public final C0732a f2569l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0736e f2570m;

    public C0733b() {
        C0732a r02 = C0732a.f2557a;
        if (AbstractC0736e.f2574a != null) goto L5;
        AbstractC0736e.f2574a = new C0738g();
    L5:
        C0738g r1 = AbstractC0736e.f2574a;
        this.f2560c = 1;
        this.f2561d = null;
        this.f2562e = 0;
        this.f2563f = false;
        this.f2564g = false;
        this.f2566i = new int[16];
        this.f2567j = 0;
        this.f2568k = 0;
        this.f2569l = r02;
        ByteBuffer r03 = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f2558a = r03;
        this.f2570m = r1;
        this.f2559b = r03.capacity();
    }

    /* JADX INFO: renamed from: a */
    public final void m1918a(int r4, boolean r5) {
        if (r5 == false) goto L5;
        m1933p(1, 0);
        ByteBuffer r02 = this.f2558a;
        int r2 = this.f2559b - 1;
        this.f2559b = r2;
        r02.put(r2, r5 ? 1 : 0);
        m1935r(r4);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m1919b(byte r4) {
        m1933p(1, 0);
        ByteBuffer r02 = this.f2558a;
        int r2 = this.f2559b - 1;
        this.f2559b = r2;
        r02.put(r2, r4);
    }

    /* JADX INFO: renamed from: c */
    public final void m1920c(int r1, byte r2) {
        if (r2 == 0) goto L5;
        m1919b(r2);
        m1935r(r1);
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m1921d(int r4) {
        m1933p(4, 0);
        ByteBuffer r02 = this.f2558a;
        int r2 = this.f2559b - 4;
        this.f2559b = r2;
        r02.putInt(r2, r4);
    }

    /* JADX INFO: renamed from: e */
    public final void m1922e(int r1, int r2) {
        if (r2 == 0) goto L5;
        m1921d(r2);
        m1935r(r1);
        return;
    }

    /* JADX INFO: renamed from: f */
    public final void m1923f(long r4) {
        m1933p(8, 0);
        ByteBuffer r02 = this.f2558a;
        int r2 = this.f2559b - 8;
        this.f2559b = r2;
        r02.putLong(r2, r4);
    }

    /* JADX INFO: renamed from: g */
    public final void m1924g(int r4) {
        m1933p(4, 0);
        int r1 = (m1932o() - r4) + 4;
        ByteBuffer r42 = this.f2558a;
        int r2 = this.f2559b - 4;
        this.f2559b = r2;
        r42.putInt(r2, r1);
    }

    /* JADX INFO: renamed from: h */
    public final void m1925h(int r1, int r2) {
        if (r2 == 0) goto L5;
        m1924g(r2);
        m1935r(r1);
        return;
    }

    /* JADX INFO: renamed from: i */
    public final void m1926i(short r4) {
        m1933p(2, 0);
        ByteBuffer r02 = this.f2558a;
        int r2 = this.f2559b - 2;
        this.f2559b = r2;
        r02.putShort(r2, r4);
    }

    /* JADX INFO: renamed from: j */
    public final int m1927j(CharSequence r18) {
        AbstractC0736e r2 = this.f2570m;
        ((C0738g) r2).getClass();
        int r3 = r18.length();
        int r4 = 0;
        int r5 = 0;
    L4:
        if (r5 >= r3) goto L8;
        if (r18.charAt(r5) >= 128) goto L8;
        r5 = r5 + 1;
    L8:
        int r7 = r3;
    L9:
        char r9 = 55296;
        char r10 = 2048;
        if (r5 >= r3) goto L29;
        char r12 = r18.charAt(r5);
        if (r12 >= 2048) goto L14;
        r7 = r7 + ((127 - r12) >>> 31);
        r5 = r5 + 1;
        goto L9
    L14:
        int r122 = r18.length();
        int r13 = 0;
    L15:
        if (r5 >= r122) goto L28;
        char r14 = r18.charAt(r5);
        if (r14 >= 2048) goto L19;
        r13 = r13 + ((127 - r14) >>> 31);
    L27:
        r5 = r5 + 1;
        goto L15
    L19:
        r13 = r13 + 2;
        if (55296 > r14) goto L27;
        if (r14 > 57343) goto L27;
        if (Character.codePointAt(r18, r5) < 65536) goto L26;
        r5 = r5 + 1;
        goto L27
    L26:
        throw new C0737f(r5, r122);
    L28:
        r7 = r7 + r13;
    L29:
        if (r7 < r3) goto L138;
        m1919b((byte) 0);
        m1937t(1, r7, 1);
        ByteBuffer r32 = this.f2558a;
        int r52 = this.f2559b - r7;
        this.f2559b = r52;
        r32.position(r52);
        ByteBuffer r33 = this.f2558a;
        ((C0738g) r2).getClass();
        if (r33.hasArray() == false) goto L83;
        int r22 = r33.arrayOffset();
        byte[] r123 = r33.array();
        int r132 = r33.position() + r22;
        int r142 = r33.remaining();
        int r15 = r18.length();
        int r143 = r142 + r132;
    L33:
        if (r4 >= r15) goto L39;
        int r11 = r4 + r132;
        if (r11 >= r143) goto L39;
        char r8 = r18.charAt(r4);
        if (r8 >= 128) goto L39;
        r123[r11] = (byte) r8;
        r4 = r4 + 1;
    L39:
        if (r4 != r15) goto L41;
        int r133 = r132 + r15;
    L82:
        r33.position(r133 - r22);
    L134:
        return m1930m();
    L41:
        r133 = r132 + r4;
    L42:
        if (r4 >= r15) goto L82;
        char r82 = r18.charAt(r4);
        if (r82 >= 128) goto L48;
        if (r133 >= r143) goto L48;
        r123[r133] = (byte) r82;
        r133 = r133 + 1;
    L65:
        r4 = r4 + 1;
        r9 = 55296;
        r10 = 2048;
    L48:
        if (r82 < r10) goto L50;
    L52:
        if (r82 < r9) goto L56;
        if (57343 < r82) goto L56;
    L59:
        if (r133 > (r143 - 4)) goto L71;
        int r92 = r4 + 1;
        if (r92 == r18.length()) goto L67;
        char r42 = r18.charAt(r92);
        if (Character.isSurrogatePair(r82, r42) == false) goto L66;
        int r43 = Character.toCodePoint(r82, r42);
        r123[r133] = (byte) ((r43 >>> 18) | 240);
        r123[r133 + 1] = (byte) (((r43 >>> 12) & 63) | 128);
        int r83 = r133 + 3;
        r123[r133 + 2] = (byte) (((r43 >>> 6) & 63) | 128);
        r133 = r133 + 4;
        r123[r83] = (byte) ((r43 & 63) | 128);
        r4 = r92;
        goto L65
    L66:
        int r84 = 1;
        r4 = r92;
    L69:
        throw new C0737f(r4 - r84, r15);
    L67:
        r84 = 1;
        goto L69
    L71:
        if (55296 > r82) goto L81;
        if (r82 > 57343) goto L81;
        int r23 = r4 + 1;
        if (r23 == r18.length()) goto L79;
        if (Character.isSurrogatePair(r82, r18.charAt(r23)) == true) goto L81;
    L79:
        throw new C0737f(r4, r15);
    L81:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + r82 + " at index " + r133);
    L56:
        if (r133 > (r143 - 3)) goto L59;
        r123[r133] = (byte) ((r82 >>> '\f') | 480);
        int r112 = r133 + 2;
        r123[r133 + 1] = (byte) (((r82 >>> 6) & 63) | 128);
        r133 = r133 + 3;
        r123[r112] = (byte) ((r82 & '?') | 128);
        goto L65
    L50:
        if (r133 > (r143 - 2)) goto L52;
        int r113 = r133 + 1;
        r123[r133] = (byte) ((r82 >>> 6) | 960);
        r133 = r133 + 2;
        r123[r113] = (byte) ((r82 & '?') | 128);
        goto L65
    L83:
        int r24 = r18.length();
        int r85 = r33.position();
    L84:
        if (r4 >= r24) goto L88;
        char r93 = r18.charAt(r4);     // Catch: IndexOutOfBoundsException -> L140
        if (r93 >= 128) goto L88;
        r33.put(r85 + r4, (byte) r93);     // Catch: IndexOutOfBoundsException -> L140
        r4 = r4 + 1;     // Catch: IndexOutOfBoundsException -> L140
    L136:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + r18.charAt(r4) + " at index " + (Math.max(r4, (r85 - r33.position()) + 1) + r33.position()));
    L88:
        if (r4 != r24) goto L90;
        r33.position(r85 + r4);     // Catch: IndexOutOfBoundsException -> L140
        goto L134
    L90:
        r85 = r85 + r4;     // Catch: IndexOutOfBoundsException -> L140
    L91:
        if (r4 >= r24) goto L132;
        char r94 = r18.charAt(r4);     // Catch: IndexOutOfBoundsException -> L140
        if (r94 >= 128) goto L98;
        r33.put(r85, (byte) r94);     // Catch: IndexOutOfBoundsException -> L140
        int r95 = 1;
    L130:
        r4 = r4 + r95;     // Catch: IndexOutOfBoundsException -> L140
        r85 = r85 + r95;     // Catch: IndexOutOfBoundsException -> L140
        goto L91
    L98:
        if (r94 >= 2048) goto L104;
        int r114 = r85 + 1;
        r33.put(r85, (byte) ((r94 >>> 6) | 192));     // Catch: IndexOutOfBoundsException -> L102
        r33.put(r114, (byte) ((r94 & '?') | 128));     // Catch: IndexOutOfBoundsException -> L102
        r85 = r114;
        r95 = 1;
    L102:
        r85 = r114;
        goto L136
    L104:
        if (r94 < 55296) goto L126;
        if (57343 < r94) goto L126;
        int r134 = r4 + 1;
        if (r134 == r24) goto L125;
        char r44 = r18.charAt(r134);     // Catch: IndexOutOfBoundsException -> L139
        if (Character.isSurrogatePair(r94, r44) == false) goto L123;
        int r45 = Character.toCodePoint(r94, r44);     // Catch: IndexOutOfBoundsException -> L139
        int r96 = r85 + 1;
        r33.put(r85, (byte) ((r45 >>> 18) | 240));     // Catch: IndexOutOfBoundsException -> L122
        int r144 = r85 + 2;
        r33.put(r96, (byte) (((r45 >>> 12) & 63) | 128));     // Catch: IndexOutOfBoundsException -> L121
        r85 = r85 + 3;
        r33.put(r144, (byte) (((r45 >>> 6) & 63) | 128));     // Catch: IndexOutOfBoundsException -> L139
        r33.put(r85, (byte) ((r45 & 63) | 128));     // Catch: IndexOutOfBoundsException -> L139
        r4 = r134;
    L119:
        r95 = 1;
    L121:
        r4 = r134;
        r85 = r144;
    L122:
        r85 = r96;
        goto L120
    L123:
        r4 = r134;
    L120:
        r4 = r134;
    L125:
        throw new C0737f(r4, r24);     // Catch: IndexOutOfBoundsException -> L140
    L126:
        int r135 = r85 + 1;
        r33.put(r85, (byte) ((r94 >>> '\f') | 224));     // Catch: IndexOutOfBoundsException -> L131
        r85 = r85 + 2;
        r33.put(r135, (byte) (((r94 >>> 6) & 63) | 128));     // Catch: IndexOutOfBoundsException -> L140
        r33.put(r85, (byte) ((r94 & '?') | 128));     // Catch: IndexOutOfBoundsException -> L140
    L131:
        r85 = r135;
        goto L136
    L132:
        r33.position(r85);     // Catch: IndexOutOfBoundsException -> L140
        goto L134
    L138:
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) r7) + 4294967296L));
    }

    /* JADX INFO: renamed from: k */
    public final int m1928k(int[] r3) {
        if (this.f2563f == true) goto L10;
        m1937t(4, r3.length, 4);
        int r02 = r3.length - 1;
    L5:
        if (r02 < 0) goto L8;
        m1924g(r3[r02]);
        r02 = r02 - 1;
        goto L5
    L8:
        return m1930m();
    L10:
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    /* JADX INFO: renamed from: l */
    public final int m1929l() {
        if (this.f2561d == null) goto L41;
        if (this.f2563f == false) goto L41;
        m1921d(0);
        int r1 = m1932o();
        int r2 = this.f2562e - 1;
    L7:
        if (r2 < 0) goto L11;
        if (this.f2561d[r2] != 0) goto L11;
        r2 = r2 - 1;
    L11:
        int r3 = r2;
    L12:
        if (r3 < 0) goto L18;
        int r4 = this.f2561d[r3];
        if (r4 == 0) goto L16;
        int r42 = r1 - r4;
    L17:
        m1926i((short) r42);
        r3 = r3 - 1;
        goto L12
    L16:
        r42 = 0;
        goto L17
    L18:
        m1926i((short) (r1 - this.f2565h));
        m1926i((short) ((r2 + 3) * 2));
        int r22 = 0;
    L20:
        if (r22 >= this.f2567j) goto L31;
        int r43 = this.f2558a.capacity() - this.f2566i[r22];
        int r5 = this.f2559b;
        short r6 = this.f2558a.getShort(r43);
        if (r6 != this.f2558a.getShort(r5)) goto L30;
        int r7 = 2;
    L24:
        if (r7 >= r6) goto L29;
        if (this.f2558a.getShort(r43 + r7) != this.f2558a.getShort(r5 + r7)) goto L30;
        r7 = r7 + 2;
        goto L24
    L29:
        int r23 = this.f2566i[r22];
    L32:
        if (r23 == 0) goto L34;
        int r32 = this.f2558a.capacity() - r1;
        this.f2559b = r32;
        this.f2558a.putInt(r32, r23 - r1);
    L38:
        this.f2563f = false;
        return r1;
    L34:
        int r24 = this.f2567j;
        int[] r44 = this.f2566i;
        if (r24 != r44.length) goto L37;
        this.f2566i = Arrays.copyOf(r44, r24 * 2);
    L37:
        int[] r25 = this.f2566i;
        int r33 = this.f2567j;
        this.f2567j = r33 + 1;
        r25[r33] = m1932o();
        ByteBuffer r26 = this.f2558a;
        r26.putInt(r26.capacity() - r1, m1932o() - r1);
    L30:
        r22 = r22 + 1;
        goto L20
    L31:
        r23 = 0;
    L41:
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    /* JADX INFO: renamed from: m */
    public final int m1930m() {
        if (this.f2563f == false) goto L7;
        this.f2563f = false;
        int r02 = this.f2568k;
        ByteBuffer r1 = this.f2558a;
        int r2 = this.f2559b - 4;
        this.f2559b = r2;
        r1.putInt(r2, r02);
        return m1932o();
    L7:
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    /* JADX INFO: renamed from: n */
    public final void m1931n(int r3) {
        m1933p(this.f2560c, 4);
        m1924g(r3);
        this.f2558a.position(this.f2559b);
        this.f2564g = true;
    }

    /* JADX INFO: renamed from: o */
    public final int m1932o() {
        return this.f2558a.capacity() - this.f2559b;
    }

    /* JADX INFO: renamed from: p */
    public final void m1933p(int r8, int r9) {
        if (r8 <= this.f2560c) goto L5;
        this.f2560c = r8;
    L5:
        int r02 = ((~((this.f2558a.capacity() - this.f2559b) + r9)) + 1) & (r8 - 1);
    L7:
        if (this.f2559b >= ((r02 + r8) + r9)) goto L20;
        int r1 = this.f2558a.capacity();
        ByteBuffer r2 = this.f2558a;
        int r4 = r2.capacity();
        if (r4 != 0) goto L11;
        int r5 = 1024;
    L17:
        r2.position(0);
        this.f2569l.getClass();
        ByteBuffer r3 = ByteBuffer.allocate(r5).order(ByteOrder.LITTLE_ENDIAN);
        r3.position(r3.clear().capacity() - r4);
        r3.put(r2);
        this.f2558a = r3;
        this.f2559b = (r3.capacity() - r1) + this.f2559b;
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
        if (r82 >= r02) goto L23;
        ByteBuffer r92 = this.f2558a;
        int r12 = this.f2559b - 1;
        this.f2559b = r12;
        r92.put(r12, (byte) 0);
        r82 = r82 + 1;
        goto L21
    }

    /* JADX INFO: renamed from: q */
    public final byte[] m1934q() {
        int r02 = this.f2559b;
        int r1 = this.f2558a.capacity() - this.f2559b;
        if (this.f2564g == false) goto L7;
        byte[] r12 = new byte[r1];
        this.f2558a.position(r02);
        this.f2558a.get(r12);
        return r12;
    L7:
        throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }

    /* JADX INFO: renamed from: r */
    public final void m1935r(int r3) {
        this.f2561d[r3] = m1932o();
    }

    /* JADX INFO: renamed from: s */
    public final void m1936s(int r3) {
        if (this.f2563f == true) goto L12;
        int[] r02 = this.f2561d;
        if (r02 != null) goto L7;
    L8:
        this.f2561d = new int[r3];
    L9:
        this.f2562e = r3;
        Arrays.fill(this.f2561d, 0, r3, 0);
        this.f2563f = true;
        this.f2565h = m1932o();
        return;
    L7:
        if (r02.length >= r3) goto L9;
    L12:
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    /* JADX INFO: renamed from: t */
    public final void m1937t(int r2, int r3, int r4) {
        if (this.f2563f == true) goto L7;
        this.f2568k = r3;
        int r22 = r2 * r3;
        m1933p(4, r22);
        m1933p(r4, r22);
        this.f2563f = true;
        return;
    L7:
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }
}
