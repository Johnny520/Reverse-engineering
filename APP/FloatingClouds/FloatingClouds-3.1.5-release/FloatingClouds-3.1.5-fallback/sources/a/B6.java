package a;

/* JADX INFO: loaded from: classes.dex */
public final class B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.nio.ByteBuffer f26a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int[] i;
    public int j;
    public int k;
    public final a.B6.b l;
    public final a.AbstractC0054ag m;

    public static abstract class a {
    }

    public static final class b extends a.B6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.B6.b f27a = null;

        static {
                a.B6$b r0 = new a.B6$b
                r0.<init>()
                a.B6.b.f27a = r0
                return
        }
    }

    public B6() {
            r4 = this;
            a.B6$b r0 = a.B6.b.f27a
            a.bg r1 = a.AbstractC0054ag.f405a
            if (r1 != 0) goto Ld
            a.bg r1 = new a.bg
            r1.<init>()
            a.AbstractC0054ag.f405a = r1
        Ld:
            a.bg r1 = a.AbstractC0054ag.f405a
            r4.<init>()
            r2 = 1
            r4.c = r2
            r2 = 0
            r4.d = r2
            r2 = 0
            r4.e = r2
            r4.f = r2
            r4.g = r2
            r3 = 16
            int[] r3 = new int[r3]
            r4.i = r3
            r4.j = r2
            r4.k = r2
            r4.l = r0
            r0 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r2)
            r4.f26a = r0
            r4.m = r1
            int r0 = r0.capacity()
            r4.b = r0
            return
    }

    public final void a(int r4, int r5) {
            r3 = this;
            if (r5 == 0) goto L1f
            r0 = 0
            r1 = 4
            r3.h(r1, r0)
            int r0 = r3.g()
            int r0 = r0 - r5
            int r0 = r0 + r1
            java.nio.ByteBuffer r5 = r3.f26a
            int r2 = r3.b
            int r2 = r2 - r1
            r3.b = r2
            r5.putInt(r2, r0)
            int[] r5 = r3.d
            int r0 = r3.g()
            r5[r4] = r0
        L1f:
            return
    }

    public final void b(short r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r3.h(r1, r0)
            java.nio.ByteBuffer r0 = r3.f26a
            int r2 = r3.b
            int r2 = r2 - r1
            r3.b = r2
            r0.putShort(r2, r4)
            return
    }

    public final int c(java.lang.CharSequence r7) {
            r6 = this;
            a.ag r0 = r6.m
            int r1 = r0.c(r7)
            r2 = 1
            r3 = 0
            r6.h(r2, r3)
            java.nio.ByteBuffer r4 = r6.f26a
            int r5 = r6.b
            int r5 = r5 - r2
            r6.b = r5
            r4.put(r5, r3)
            boolean r4 = r6.f
            if (r4 != 0) goto L52
            r6.k = r1
            r4 = 4
            r6.h(r4, r1)
            r6.h(r2, r1)
            r6.f = r2
            java.nio.ByteBuffer r2 = r6.f26a
            int r5 = r6.b
            int r5 = r5 - r1
            r6.b = r5
            r2.position(r5)
            java.nio.ByteBuffer r1 = r6.f26a
            r0.b(r7, r1)
            boolean r7 = r6.f
            if (r7 == 0) goto L4a
            r6.f = r3
            int r7 = r6.k
            java.nio.ByteBuffer r0 = r6.f26a
            int r1 = r6.b
            int r1 = r1 - r4
            r6.b = r1
            r0.putInt(r1, r7)
            int r7 = r6.g()
            return r7
        L4a:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: endVector called without startVector"
            r7.<init>(r0)
            throw r7
        L52:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: object serialization must not be nested."
            r7.<init>(r0)
            throw r7
    }

    public final int d(int[] r6) {
            r5 = this;
            boolean r0 = r5.f
            java.lang.String r1 = "FlatBuffers: object serialization must not be nested."
            if (r0 != 0) goto L58
            int r2 = r6.length
            if (r0 != 0) goto L52
            r5.k = r2
            r0 = 4
            int r2 = r2 * r0
            r5.h(r0, r2)
            r5.h(r0, r2)
            r1 = 1
            r5.f = r1
            int r2 = r6.length
            int r2 = r2 - r1
        L18:
            r1 = 0
            if (r2 < 0) goto L33
            r3 = r6[r2]
            r5.h(r0, r1)
            int r1 = r5.g()
            int r1 = r1 - r3
            int r1 = r1 + r0
            java.nio.ByteBuffer r3 = r5.f26a
            int r4 = r5.b
            int r4 = r4 - r0
            r5.b = r4
            r3.putInt(r4, r1)
            int r2 = r2 + (-1)
            goto L18
        L33:
            boolean r6 = r5.f
            if (r6 == 0) goto L4a
            r5.f = r1
            int r6 = r5.k
            java.nio.ByteBuffer r1 = r5.f26a
            int r2 = r5.b
            int r2 = r2 - r0
            r5.b = r2
            r1.putInt(r2, r6)
            int r6 = r5.g()
            return r6
        L4a:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: endVector called without startVector"
            r6.<init>(r0)
            throw r6
        L52:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>(r1)
            throw r6
        L58:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>(r1)
            throw r6
    }

    public final int e() {
            r11 = this;
            int[] r0 = r11.d
            if (r0 == 0) goto Ld0
            boolean r0 = r11.f
            if (r0 == 0) goto Ld0
            r0 = 4
            r1 = 0
            r11.h(r0, r1)
            java.nio.ByteBuffer r2 = r11.f26a
            int r3 = r11.b
            int r3 = r3 - r0
            r11.b = r3
            r2.putInt(r3, r1)
            int r0 = r11.g()
            int r2 = r11.e
            int r2 = r2 + (-1)
        L1f:
            if (r2 < 0) goto L2a
            int[] r3 = r11.d
            r3 = r3[r2]
            if (r3 != 0) goto L2a
            int r2 = r2 + (-1)
            goto L1f
        L2a:
            r3 = r2
        L2b:
            if (r3 < 0) goto L3e
            int[] r4 = r11.d
            r4 = r4[r3]
            if (r4 == 0) goto L36
            int r4 = r0 - r4
            goto L37
        L36:
            r4 = r1
        L37:
            short r4 = (short) r4
            r11.b(r4)
            int r3 = r3 + (-1)
            goto L2b
        L3e:
            int r3 = r11.h
            int r3 = r0 - r3
            short r3 = (short) r3
            r11.b(r3)
            int r2 = r2 + 3
            r3 = 2
            int r2 = r2 * r3
            short r2 = (short) r2
            r11.b(r2)
            r2 = r1
        L4f:
            int r4 = r11.j
            if (r2 >= r4) goto L8f
            java.nio.ByteBuffer r4 = r11.f26a
            int r4 = r4.capacity()
            int[] r5 = r11.i
            r5 = r5[r2]
            int r4 = r4 - r5
            int r5 = r11.b
            java.nio.ByteBuffer r6 = r11.f26a
            short r6 = r6.getShort(r4)
            java.nio.ByteBuffer r7 = r11.f26a
            short r7 = r7.getShort(r5)
            if (r6 != r7) goto L8c
            r7 = r3
        L6f:
            if (r7 >= r6) goto L87
            java.nio.ByteBuffer r8 = r11.f26a
            int r9 = r4 + r7
            short r8 = r8.getShort(r9)
            java.nio.ByteBuffer r9 = r11.f26a
            int r10 = r5 + r7
            short r9 = r9.getShort(r10)
            if (r8 == r9) goto L84
            goto L8c
        L84:
            int r7 = r7 + 2
            goto L6f
        L87:
            int[] r4 = r11.i
            r2 = r4[r2]
            goto L90
        L8c:
            int r2 = r2 + 1
            goto L4f
        L8f:
            r2 = r1
        L90:
            if (r2 == 0) goto La2
            java.nio.ByteBuffer r3 = r11.f26a
            int r3 = r3.capacity()
            int r3 = r3 - r0
            r11.b = r3
            java.nio.ByteBuffer r4 = r11.f26a
            int r2 = r2 - r0
            r4.putInt(r3, r2)
            goto Lcd
        La2:
            int r2 = r11.j
            int[] r4 = r11.i
            int r5 = r4.length
            if (r2 != r5) goto Lb0
            int r2 = r2 * r3
            int[] r2 = java.util.Arrays.copyOf(r4, r2)
            r11.i = r2
        Lb0:
            int[] r2 = r11.i
            int r3 = r11.j
            int r4 = r3 + 1
            r11.j = r4
            int r4 = r11.g()
            r2[r3] = r4
            java.nio.ByteBuffer r2 = r11.f26a
            int r3 = r2.capacity()
            int r3 = r3 - r0
            int r4 = r11.g()
            int r4 = r4 - r0
            r2.putInt(r3, r4)
        Lcd:
            r11.f = r1
            return r0
        Ld0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: endTable called without startTable"
            r0.<init>(r1)
            throw r0
    }

    public final void f(int r4) {
            r3 = this;
            int r0 = r3.c
            r1 = 4
            r3.h(r0, r1)
            r0 = 0
            r3.h(r1, r0)
            int r0 = r3.g()
            int r0 = r0 - r4
            int r0 = r0 + r1
            java.nio.ByteBuffer r4 = r3.f26a
            int r2 = r3.b
            int r2 = r2 - r1
            r3.b = r2
            r4.putInt(r2, r0)
            java.nio.ByteBuffer r4 = r3.f26a
            int r0 = r3.b
            r4.position(r0)
            r4 = 1
            r3.g = r4
            return
    }

    public final int g() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f26a
            int r0 = r0.capacity()
            int r1 = r2.b
            int r0 = r0 - r1
            return r0
    }

    public final void h(int r8, int r9) {
            r7 = this;
            int r0 = r7.c
            if (r8 <= r0) goto L6
            r7.c = r8
        L6:
            java.nio.ByteBuffer r0 = r7.f26a
            int r0 = r0.capacity()
            int r1 = r7.b
            int r0 = r0 - r1
            int r0 = r0 + r9
            int r0 = ~r0
            int r0 = r0 + 1
            int r1 = r8 + (-1)
            r0 = r0 & r1
        L16:
            int r1 = r7.b
            int r2 = r0 + r8
            int r2 = r2 + r9
            r3 = 0
            if (r1 >= r2) goto L72
            java.nio.ByteBuffer r1 = r7.f26a
            int r1 = r1.capacity()
            java.nio.ByteBuffer r2 = r7.f26a
            int r4 = r2.capacity()
            if (r4 != 0) goto L2f
            r5 = 1024(0x400, float:1.435E-42)
            goto L3c
        L2f:
            r5 = 2147483639(0x7ffffff7, float:NaN)
            if (r4 == r5) goto L6a
            r6 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6 = r6 & r4
            if (r6 == 0) goto L3a
            goto L3c
        L3a:
            int r5 = r4 << 1
        L3c:
            r2.position(r3)
            a.B6$b r3 = r7.l
            r3.getClass()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r5)
            java.nio.Buffer r5 = r3.clear()
            int r5 = r5.capacity()
            int r5 = r5 - r4
            r3.position(r5)
            r3.put(r2)
            r7.f26a = r3
            int r2 = r7.b
            int r3 = r3.capacity()
            int r3 = r3 - r1
            int r3 = r3 + r2
            r7.b = r3
            goto L16
        L6a:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "FlatBuffers: cannot grow buffer beyond 2 gigabytes."
            r8.<init>(r9)
            throw r8
        L72:
            r8 = r3
        L73:
            if (r8 >= r0) goto L83
            java.nio.ByteBuffer r9 = r7.f26a
            int r1 = r7.b
            int r1 = r1 + (-1)
            r7.b = r1
            r9.put(r1, r3)
            int r8 = r8 + 1
            goto L73
        L83:
            return
    }

    public final void i(int r3) {
            r2 = this;
            boolean r0 = r2.f
            if (r0 != 0) goto L21
            int[] r0 = r2.d
            if (r0 == 0) goto Lb
            int r0 = r0.length
            if (r0 >= r3) goto Lf
        Lb:
            int[] r0 = new int[r3]
            r2.d = r0
        Lf:
            r2.e = r3
            int[] r0 = r2.d
            r1 = 0
            java.util.Arrays.fill(r0, r1, r3, r1)
            r3 = 1
            r2.f = r3
            int r3 = r2.g()
            r2.h = r3
            return
        L21:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: object serialization must not be nested."
            r3.<init>(r0)
            throw r3
    }
}
