package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲁᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0099 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f455;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f456;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f457;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public java.nio.ByteBuffer f458;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final xhss.C0564 f459;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public int[] f460;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f461;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int f462;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public boolean f463;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int[] f464;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f465;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public int f466;

    public C0099() {
            r3 = this;
            xhss.ᛶᛵᲇᛸ r0 = xhss.C0564.f1995
            if (r0 != 0) goto Ld
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r1 = 25
            r0.<init>(r1)
            xhss.C0564.f1995 = r0
        Ld:
            r3.<init>()
            r1 = 1
            r3.f456 = r1
            r1 = 0
            r3.f464 = r1
            r1 = 0
            r3.f457 = r1
            r3.f465 = r1
            r3.f463 = r1
            r2 = 16
            int[] r2 = new int[r2]
            r3.f460 = r2
            r3.f462 = r1
            r3.f466 = r1
            r1 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r3.f458 = r1
            r3.f459 = r0
            int r0 = r1.capacity()
            r3.f455 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m251(int r1, byte r2) {
            r0 = this;
            if (r2 == 0) goto Ld
            r0.m254(r2)
            int[] r2 = r0.f464
            int r0 = r0.m264()
            r2[r1] = r0
        Ld:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m252(long r4) {
            r3 = this;
            r0 = 0
            r1 = 8
            r3.m255(r1, r0)
            java.nio.ByteBuffer r0 = r3.f458
            int r2 = r3.f455
            int r2 = r2 - r1
            r3.f455 = r2
            r0.putLong(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m253(int r1, int r2) {
            r0 = this;
            if (r2 == 0) goto Ld
            r0.m261(r2)
            int[] r2 = r0.f464
            int r0 = r0.m264()
            r2[r1] = r0
        Ld:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m254(byte r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            r3.m255(r1, r0)
            java.nio.ByteBuffer r0 = r3.f458
            int r2 = r3.f455
            int r2 = r2 - r1
            r3.f455 = r2
            r0.put(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final void m255(int r8, int r9) {
            r7 = this;
            int r0 = r7.f456
            if (r8 <= r0) goto L6
            r7.f456 = r8
        L6:
            java.nio.ByteBuffer r0 = r7.f458
            int r0 = r0.capacity()
            int r1 = r7.f455
            int r0 = r0 - r1
            int r0 = r0 + r9
            int r0 = ~r0
            int r0 = r0 + 1
            int r1 = r8 + (-1)
            r0 = r0 & r1
        L16:
            int r1 = r7.f455
            int r2 = r0 + r8
            int r2 = r2 + r9
            r3 = 0
            if (r1 >= r2) goto L6d
            java.nio.ByteBuffer r1 = r7.f458
            int r1 = r1.capacity()
            java.nio.ByteBuffer r2 = r7.f458
            int r4 = r2.capacity()
            if (r4 != 0) goto L2f
            r5 = 1024(0x400, float:1.435E-42)
            goto L3c
        L2f:
            r5 = 2147483639(0x7ffffff7, float:NaN)
            if (r4 == r5) goto L65
            r6 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6 = r6 & r4
            if (r6 == 0) goto L3a
            goto L3c
        L3a:
            int r5 = r4 << 1
        L3c:
            r2.position(r3)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r5)
            java.nio.Buffer r5 = r3.clear()
            int r5 = r5.capacity()
            int r5 = r5 - r4
            r3.position(r5)
            r3.put(r2)
            r7.f458 = r3
            int r2 = r7.f455
            int r3 = r3.capacity()
            int r3 = r3 - r1
            int r3 = r3 + r2
            r7.f455 = r3
            goto L16
        L65:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "FlatBuffers: cannot grow buffer beyond 2 gigabytes."
            r7.<init>(r8)
            throw r7
        L6d:
            r8 = r3
        L6e:
            if (r8 >= r0) goto L7e
            java.nio.ByteBuffer r9 = r7.f458
            int r1 = r7.f455
            int r1 = r1 + (-1)
            r7.f455 = r1
            r9.put(r1, r3)
            int r8 = r8 + 1
            goto L6e
        L7e:
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final int m256() {
            r3 = this;
            boolean r0 = r3.f465
            if (r0 == 0) goto L19
            r0 = 0
            r3.f465 = r0
            int r0 = r3.f466
            java.nio.ByteBuffer r1 = r3.f458
            int r2 = r3.f455
            int r2 = r2 + (-4)
            r3.f455 = r2
            r1.putInt(r2, r0)
            int r3 = r3.m264()
            return r3
        L19:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: endVector called without startVector"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int m257() {
            r11 = this;
            int[] r0 = r11.f464
            if (r0 == 0) goto Lce
            boolean r0 = r11.f465
            if (r0 == 0) goto Lce
            r0 = 4
            r1 = 0
            r11.m255(r0, r1)
            java.nio.ByteBuffer r2 = r11.f458
            int r3 = r11.f455
            int r3 = r3 - r0
            r11.f455 = r3
            r2.putInt(r3, r1)
            int r0 = r11.m264()
            int r2 = r11.f457
            int r2 = r2 + (-1)
        L1f:
            if (r2 < 0) goto L2a
            int[] r3 = r11.f464
            r3 = r3[r2]
            if (r3 != 0) goto L2a
            int r2 = r2 + (-1)
            goto L1f
        L2a:
            r3 = r2
        L2b:
            if (r3 < 0) goto L3e
            int[] r4 = r11.f464
            r4 = r4[r3]
            if (r4 == 0) goto L36
            int r4 = r0 - r4
            goto L37
        L36:
            r4 = r1
        L37:
            short r4 = (short) r4
            r11.m262(r4)
            int r3 = r3 + (-1)
            goto L2b
        L3e:
            int r3 = r11.f461
            int r3 = r0 - r3
            short r3 = (short) r3
            r11.m262(r3)
            int r2 = r2 + 3
            r3 = 2
            int r2 = r2 * r3
            short r2 = (short) r2
            r11.m262(r2)
            r2 = r1
        L4f:
            int r4 = r11.f462
            if (r2 >= r4) goto L8f
            java.nio.ByteBuffer r4 = r11.f458
            int r4 = r4.capacity()
            int[] r5 = r11.f460
            r5 = r5[r2]
            int r4 = r4 - r5
            int r5 = r11.f455
            java.nio.ByteBuffer r6 = r11.f458
            short r6 = r6.getShort(r4)
            java.nio.ByteBuffer r7 = r11.f458
            short r7 = r7.getShort(r5)
            if (r6 != r7) goto L8c
            r7 = r3
        L6f:
            if (r7 >= r6) goto L87
            java.nio.ByteBuffer r8 = r11.f458
            int r9 = r4 + r7
            short r8 = r8.getShort(r9)
            java.nio.ByteBuffer r9 = r11.f458
            int r10 = r5 + r7
            short r9 = r9.getShort(r10)
            if (r8 == r9) goto L84
            goto L8c
        L84:
            int r7 = r7 + 2
            goto L6f
        L87:
            int[] r4 = r11.f460
            r2 = r4[r2]
            goto L90
        L8c:
            int r2 = r2 + 1
            goto L4f
        L8f:
            r2 = r1
        L90:
            if (r2 == 0) goto La2
            java.nio.ByteBuffer r3 = r11.f458
            int r3 = r3.capacity()
            int r3 = r3 - r0
            r11.f455 = r3
            java.nio.ByteBuffer r4 = r11.f458
            int r2 = r2 - r0
            r4.putInt(r3, r2)
            goto Lcb
        La2:
            int r2 = r11.f462
            int[] r4 = r11.f460
            int r5 = r4.length
            if (r2 != r5) goto Lb0
            int r2 = r2 * r3
            int[] r4 = java.util.Arrays.copyOf(r4, r2)
            r11.f460 = r4
        Lb0:
            int r2 = r11.f462
            int r3 = r2 + 1
            r11.f462 = r3
            int r3 = r11.m264()
            r4[r2] = r3
            java.nio.ByteBuffer r2 = r11.f458
            int r3 = r2.capacity()
            int r3 = r3 - r0
            int r4 = r11.m264()
            int r4 = r4 - r0
            r2.putInt(r3, r4)
        Lcb:
            r11.f465 = r1
            return r0
        Lce:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: endTable called without startTable"
            r11.<init>(r0)
            throw r11
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final void m258(int r3) {
            r2 = this;
            boolean r0 = r2.f465
            if (r0 != 0) goto L1f
            int[] r0 = r2.f464
            if (r0 == 0) goto Lb
            int r1 = r0.length
            if (r1 >= r3) goto Lf
        Lb:
            int[] r0 = new int[r3]
            r2.f464 = r0
        Lf:
            r2.f457 = r3
            r1 = 0
            java.util.Arrays.fill(r0, r1, r3, r1)
            r3 = 1
            r2.f465 = r3
            int r3 = r2.m264()
            r2.f461 = r3
            return
        L1f:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "FlatBuffers: object serialization must not be nested."
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final void m259(int r3) {
            r2 = this;
            int r0 = r2.f456
            r1 = 4
            r2.m255(r0, r1)
            r2.m261(r3)
            java.nio.ByteBuffer r3 = r2.f458
            int r0 = r2.f455
            r3.position(r0)
            r3 = 1
            r2.f463 = r3
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final int m260(int[] r3) {
            r2 = this;
            boolean r0 = r2.f465
            if (r0 != 0) goto L1b
            r0 = 4
            int r1 = r3.length
            r2.m263(r0, r1, r0)
            int r0 = r3.length
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L16
            r1 = r3[r0]
            r2.m261(r1)
            int r0 = r0 + (-1)
            goto Lc
        L16:
            int r2 = r2.m256()
            return r2
        L1b:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "FlatBuffers: object serialization must not be nested."
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m261(int r4) {
            r3 = this;
            r0 = 0
            r1 = 4
            r3.m255(r1, r0)
            int r0 = r3.m264()
            int r0 = r0 - r4
            int r0 = r0 + r1
            java.nio.ByteBuffer r4 = r3.f458
            int r2 = r3.f455
            int r2 = r2 - r1
            r3.f455 = r2
            r4.putInt(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m262(short r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r3.m255(r1, r0)
            java.nio.ByteBuffer r0 = r3.f458
            int r2 = r3.f455
            int r2 = r2 - r1
            r3.f455 = r2
            r0.putShort(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final void m263(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.f465
            if (r0 != 0) goto L12
            r1.f466 = r3
            int r2 = r2 * r3
            r3 = 4
            r1.m255(r3, r2)
            r1.m255(r4, r2)
            r2 = 1
            r1.f465 = r2
            return
        L12:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "FlatBuffers: object serialization must not be nested."
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final int m264() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f458
            int r0 = r0.capacity()
            int r1 = r1.f455
            int r0 = r0 - r1
            return r0
    }
}
