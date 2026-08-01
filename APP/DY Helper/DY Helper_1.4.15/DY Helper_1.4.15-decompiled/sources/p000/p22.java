package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class p22 {

    /* JADX INFO: renamed from: bb */
    protected java.nio.ByteBuffer f8399bb;
    protected int bb_pos;
    p000.f72 utf8;
    private int vtable_size;
    private int vtable_start;

    public p22() {
            r1 = this;
            r1.<init>()
            h72 r0 = p000.f72.f3770
            if (r0 != 0) goto Le
            h72 r0 = new h72
            r0.<init>()
            p000.f72.f3770 = r0
        Le:
            h72 r0 = p000.f72.f3770
            r1.utf8 = r0
            return
    }

    public static boolean __has_identifier(java.nio.ByteBuffer r5, java.lang.String r6) {
            int r0 = r6.length()
            r1 = 4
            if (r0 != r1) goto L22
            r0 = 0
            r2 = r0
        L9:
            if (r2 >= r1) goto L20
            char r3 = r6.charAt(r2)
            int r4 = r5.position()
            int r4 = r4 + r1
            int r4 = r4 + r2
            byte r4 = r5.get(r4)
            char r4 = (char) r4
            if (r3 == r4) goto L1d
            return r0
        L1d:
            int r2 = r2 + 1
            goto L9
        L20:
            r5 = 1
            return r5
        L22:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = "FlatBuffers: file identifier must be length 4"
            r5.<init>(r6)
            throw r5
    }

    public static int __indirect(int r0, java.nio.ByteBuffer r1) {
            int r1 = r1.getInt(r0)
            int r1 = r1 + r0
            return r1
    }

    public static int __offset(int r1, int r2, java.nio.ByteBuffer r3) {
            int r0 = r3.capacity()
            int r0 = r0 - r2
            int r1 = r1 + r0
            int r2 = r3.getInt(r0)
            int r1 = r1 - r2
            short r1 = r3.getShort(r1)
            int r1 = r1 + r0
            return r1
    }

    public static java.lang.String __string(int r11, java.nio.ByteBuffer r12, p000.f72 r13) {
            int r0 = r12.getInt(r11)
            int r0 = r0 + r11
            int r11 = r12.getInt(r0)
            int r0 = r0 + 4
            h72 r13 = (p000.h72) r13
            r13.getClass()
            boolean r13 = r12.hasArray()
            r1 = -16
            r2 = -32
            java.lang.String r3 = "Invalid UTF-8"
            r4 = 0
            if (r13 == 0) goto Ld0
            byte[] r13 = r12.array()
            int r12 = r12.arrayOffset()
            int r12 = r12 + r0
            r0 = r12 | r11
            int r5 = r13.length
            int r5 = r5 - r12
            int r5 = r5 - r11
            r0 = r0 | r5
            if (r0 < 0) goto Lb3
            int r0 = r12 + r11
            char[] r9 = new char[r11]
            r11 = r4
        L33:
            if (r12 >= r0) goto L42
            r5 = r13[r12]
            if (r5 < 0) goto L42
            int r12 = r12 + 1
            int r6 = r11 + 1
            char r5 = (char) r5
            r9[r11] = r5
            r11 = r6
            goto L33
        L42:
            r10 = r11
        L43:
            if (r12 >= r0) goto Lad
            int r11 = r12 + 1
            r5 = r13[r12]
            if (r5 < 0) goto L62
            int r12 = r10 + 1
            char r5 = (char) r5
            r9[r10] = r5
        L50:
            if (r11 >= r0) goto L5f
            r5 = r13[r11]
            if (r5 < 0) goto L5f
            int r11 = r11 + 1
            int r6 = r12 + 1
            char r5 = (char) r5
            r9[r12] = r5
            r12 = r6
            goto L50
        L5f:
            r10 = r12
            r12 = r11
            goto L43
        L62:
            if (r5 >= r2) goto L76
            if (r11 >= r0) goto L71
            int r12 = r12 + 2
            r11 = r13[r11]
            int r6 = r10 + 1
            p000.g81.m2278(r5, r11, r9, r10)
            r10 = r6
            goto L43
        L71:
            p000.C1080.m7275(r3)
            r11 = 0
            return r11
        L76:
            if (r5 >= r1) goto L90
            int r6 = r0 + (-1)
            if (r11 >= r6) goto L8b
            int r6 = r12 + 2
            r11 = r13[r11]
            int r12 = r12 + 3
            r6 = r13[r6]
            int r7 = r10 + 1
            p000.g81.m2277(r5, r11, r6, r9, r10)
            r10 = r7
            goto L43
        L8b:
            p000.C1080.m7275(r3)
            r11 = 0
            return r11
        L90:
            int r6 = r0 + (-2)
            if (r11 >= r6) goto La8
            int r6 = r12 + 2
            r11 = r13[r11]
            int r7 = r12 + 3
            r6 = r13[r6]
            int r12 = r12 + 4
            r8 = r13[r7]
            r7 = r6
            r6 = r11
            p000.g81.m2276(r5, r6, r7, r8, r9, r10)
            int r10 = r10 + 2
            goto L43
        La8:
            p000.C1080.m7275(r3)
            r11 = 0
            return r11
        Lad:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r9, r4, r10)
            return r11
        Lb3:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r13, r12, r11}
            java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r0.<init>(r11)
            throw r0
        Ld0:
            r13 = r0 | r11
            int r5 = r12.limit()
            int r5 = r5 - r0
            int r5 = r5 - r11
            r13 = r13 | r5
            if (r13 < 0) goto L172
            int r13 = r0 + r11
            char[] r9 = new char[r11]
            r11 = r4
        Le0:
            if (r0 >= r13) goto Lf1
            byte r5 = r12.get(r0)
            if (r5 < 0) goto Lf1
            int r0 = r0 + 1
            int r6 = r11 + 1
            char r5 = (char) r5
            r9[r11] = r5
            r11 = r6
            goto Le0
        Lf1:
            r10 = r11
        Lf2:
            if (r0 >= r13) goto L16c
            int r11 = r0 + 1
            byte r5 = r12.get(r0)
            if (r5 < 0) goto L115
            int r0 = r10 + 1
            char r5 = (char) r5
            r9[r10] = r5
        L101:
            if (r11 >= r13) goto L112
            byte r5 = r12.get(r11)
            if (r5 < 0) goto L112
            int r11 = r11 + 1
            int r6 = r0 + 1
            char r5 = (char) r5
            r9[r0] = r5
            r0 = r6
            goto L101
        L112:
            r10 = r0
            r0 = r11
            goto Lf2
        L115:
            if (r5 >= r2) goto L12b
            if (r11 >= r13) goto L126
            int r0 = r0 + 2
            byte r11 = r12.get(r11)
            int r6 = r10 + 1
            p000.g81.m2278(r5, r11, r9, r10)
            r10 = r6
            goto Lf2
        L126:
            p000.C1080.m7275(r3)
            r11 = 0
            return r11
        L12b:
            if (r5 >= r1) goto L149
            int r6 = r13 + (-1)
            if (r11 >= r6) goto L144
            int r6 = r0 + 2
            byte r11 = r12.get(r11)
            int r0 = r0 + 3
            byte r6 = r12.get(r6)
            int r7 = r10 + 1
            p000.g81.m2277(r5, r11, r6, r9, r10)
            r10 = r7
            goto Lf2
        L144:
            p000.C1080.m7275(r3)
            r11 = 0
            return r11
        L149:
            int r6 = r13 + (-2)
            if (r11 >= r6) goto L167
            int r6 = r0 + 2
            byte r11 = r12.get(r11)
            int r7 = r0 + 3
            byte r6 = r12.get(r6)
            int r0 = r0 + 4
            byte r8 = r12.get(r7)
            r7 = r6
            r6 = r11
            p000.g81.m2276(r5, r6, r7, r8, r9, r10)
            int r10 = r10 + 2
            goto Lf2
        L167:
            p000.C1080.m7275(r3)
            r11 = 0
            return r11
        L16c:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r9, r4, r10)
            return r11
        L172:
            java.lang.ArrayIndexOutOfBoundsException r13 = new java.lang.ArrayIndexOutOfBoundsException
            int r12 = r12.limit()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r12, r0, r11}
            java.lang.String r12 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r13.<init>(r11)
            throw r13
    }

    public static p000.p22 __union(p000.p22 r0, int r1, java.nio.ByteBuffer r2) {
            int r1 = __indirect(r1, r2)
            r0.__reset(r1, r2)
            return r0
    }

    public static int compareStrings(int r8, int r9, java.nio.ByteBuffer r10) {
            int r0 = r10.getInt(r8)
            int r0 = r0 + r8
            int r8 = r10.getInt(r9)
            int r8 = r8 + r9
            int r9 = r10.getInt(r0)
            int r1 = r10.getInt(r8)
            int r0 = r0 + 4
            int r8 = r8 + 4
            int r2 = java.lang.Math.min(r9, r1)
            r3 = 0
        L1b:
            if (r3 >= r2) goto L38
            int r4 = r3 + r0
            byte r5 = r10.get(r4)
            int r6 = r3 + r8
            byte r7 = r10.get(r6)
            if (r5 == r7) goto L35
            byte r8 = r10.get(r4)
            byte r9 = r10.get(r6)
            int r8 = r8 - r9
            return r8
        L35:
            int r3 = r3 + 1
            goto L1b
        L38:
            int r9 = r9 - r1
            return r9
    }

    public static int compareStrings(int r7, byte[] r8, java.nio.ByteBuffer r9) {
            int r0 = r9.getInt(r7)
            int r0 = r0 + r7
            int r7 = r9.getInt(r0)
            int r1 = r8.length
            int r0 = r0 + 4
            int r2 = java.lang.Math.min(r7, r1)
            r3 = 0
        L11:
            if (r3 >= r2) goto L28
            int r4 = r3 + r0
            byte r5 = r9.get(r4)
            r6 = r8[r3]
            if (r5 == r6) goto L25
            byte r7 = r9.get(r4)
            r8 = r8[r3]
            int r7 = r7 - r8
            return r7
        L25:
            int r3 = r3 + 1
            goto L11
        L28:
            int r7 = r7 - r1
            return r7
    }

    public int __indirect(int r1) {
            r0 = this;
            java.nio.ByteBuffer r0 = r0.f8399bb
            int r0 = r0.getInt(r1)
            int r0 = r0 + r1
            return r0
    }

    public int __offset(int r2) {
            r1 = this;
            int r0 = r1.vtable_size
            if (r2 >= r0) goto Le
            java.nio.ByteBuffer r0 = r1.f8399bb
            int r1 = r1.vtable_start
            int r1 = r1 + r2
            short r1 = r0.getShort(r1)
            return r1
        Le:
            r1 = 0
            return r1
    }

    public void __reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r1)
            return
    }

    public void __reset(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.f8399bb = r2
            if (r2 == 0) goto L16
            r0.bb_pos = r1
            int r2 = r2.getInt(r1)
            int r1 = r1 - r2
            r0.vtable_start = r1
            java.nio.ByteBuffer r2 = r0.f8399bb
            short r1 = r2.getShort(r1)
            r0.vtable_size = r1
            return
        L16:
            r1 = 0
            r0.bb_pos = r1
            r0.vtable_start = r1
            r0.vtable_size = r1
            return
    }

    public java.lang.String __string(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f8399bb
            f72 r1 = r1.utf8
            java.lang.String r1 = __string(r2, r0, r1)
            return r1
    }

    public p000.p22 __union(p000.p22 r1, int r2) {
            r0 = this;
            java.nio.ByteBuffer r0 = r0.f8399bb
            p22 r0 = __union(r1, r2, r0)
            return r0
    }

    public int __vector(int r2) {
            r1 = this;
            int r0 = r1.bb_pos
            int r2 = r2 + r0
            java.nio.ByteBuffer r1 = r1.f8399bb
            int r1 = r1.getInt(r2)
            int r1 = r1 + r2
            int r1 = r1 + 4
            return r1
    }

    public java.nio.ByteBuffer __vector_as_bytebuffer(int r3, int r4) {
            r2 = this;
            int r3 = r2.__offset(r3)
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.nio.ByteBuffer r0 = r2.f8399bb
            java.nio.ByteBuffer r0 = r0.duplicate()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            int r1 = r2.__vector(r3)
            r0.position(r1)
            int r2 = r2.__vector_len(r3)
            int r2 = r2 * r4
            int r2 = r2 + r1
            r0.limit(r2)
            return r0
    }

    public java.nio.ByteBuffer __vector_in_bytebuffer(java.nio.ByteBuffer r2, int r3, int r4) {
            r1 = this;
            int r3 = r1.__offset(r3)
            if (r3 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r1.__vector(r3)
            r2.rewind()
            int r1 = r1.__vector_len(r3)
            int r1 = r1 * r4
            int r1 = r1 + r0
            r2.limit(r1)
            r2.position(r0)
            return r2
    }

    public int __vector_len(int r2) {
            r1 = this;
            int r0 = r1.bb_pos
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.f8399bb
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            java.nio.ByteBuffer r1 = r1.f8399bb
            int r1 = r1.getInt(r0)
            return r1
    }

    public java.nio.ByteBuffer getByteBuffer() {
            r0 = this;
            java.nio.ByteBuffer r0 = r0.f8399bb
            return r0
    }

    public int keysCompare(java.lang.Integer r1, java.lang.Integer r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    public void sortTables(int[] r5, java.nio.ByteBuffer r6) {
            r4 = this;
            int r0 = r5.length
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 0
            r2 = r1
        L5:
            int r3 = r5.length
            if (r2 >= r3) goto L13
            r3 = r5[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L5
        L13:
            iz1 r2 = new iz1
            r2.<init>(r4, r6)
            java.util.Arrays.sort(r0, r2)
        L1b:
            int r4 = r5.length
            if (r1 >= r4) goto L29
            r4 = r0[r1]
            int r4 = r4.intValue()
            r5[r1] = r4
            int r1 = r1 + 1
            goto L1b
        L29:
            return
    }
}
