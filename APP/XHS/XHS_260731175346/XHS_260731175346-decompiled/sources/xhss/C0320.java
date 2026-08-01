package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0320 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.nio.ByteBuffer f1202;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f1203;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0564 f1204;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f1205;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f1206;

    public C0320() {
            r2 = this;
            r2.<init>()
            xhss.ᛶᛵᲇᛸ r0 = xhss.C0564.f1995
            if (r0 != 0) goto L10
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r1 = 25
            r0.<init>(r1)
            xhss.C0564.f1995 = r0
        L10:
            r2.f1204 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int m654(int r2) {
            r1 = this;
            int r0 = r1.f1206
            if (r2 >= r0) goto Le
            java.nio.ByteBuffer r0 = r1.f1202
            int r1 = r1.f1203
            int r1 = r1 + r2
            short r1 = r0.getShort(r1)
            return r1
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m655(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.f1202 = r2
            if (r2 == 0) goto L16
            r0.f1205 = r1
            int r2 = r2.getInt(r1)
            int r1 = r1 - r2
            r0.f1203 = r1
            java.nio.ByteBuffer r2 = r0.f1202
            short r1 = r2.getShort(r1)
            r0.f1206 = r1
            return
        L16:
            r1 = 0
            r0.f1205 = r1
            r0.f1203 = r1
            r0.f1206 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int m656(int r2) {
            r1 = this;
            int r0 = r1.f1205
            int r2 = r2 + r0
            java.nio.ByteBuffer r1 = r1.f1202
            int r1 = r1.getInt(r2)
            int r1 = r1 + r2
            int r1 = r1 + 4
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int m657(int r1) {
            r0 = this;
            java.nio.ByteBuffer r0 = r0.f1202
            int r0 = r0.getInt(r1)
            int r0 = r0 + r1
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public xhss.C0320 m658(int r4) {
            r3 = this;
            xhss.ᛳᲁᲇᛸ r0 = new xhss.ᛳᲁᲇᛸ
            r0.<init>()
            r1 = 4
            int r2 = r3.m654(r1)
            if (r2 == 0) goto L1c
            int r2 = r3.m656(r2)
            int r4 = r4 * r1
            int r4 = r4 + r2
            int r4 = r3.m657(r4)
            java.nio.ByteBuffer r3 = r3.f1202
            r0.m655(r4, r3)
            return r0
        L1c:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0320 m659(int r4) {
            r3 = this;
            xhss.ᛳᲁᲇᛸ r0 = new xhss.ᛳᲁᲇᛸ
            r0.<init>()
            r1 = 4
            int r2 = r3.m654(r1)
            if (r2 == 0) goto L1c
            int r2 = r3.m656(r2)
            int r4 = r4 * r1
            int r4 = r4 + r2
            int r4 = r3.m657(r4)
            java.nio.ByteBuffer r3 = r3.f1202
            r0.m655(r4, r3)
            return r0
        L1c:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String m660(int r14) {
            r13 = this;
            java.nio.ByteBuffer r0 = r13.f1202
            int r1 = r0.getInt(r14)
            int r1 = r1 + r14
            int r14 = r0.getInt(r1)
            int r1 = r1 + 4
            xhss.ᛶᛵᲇᛸ r13 = r13.f1204
            r13.getClass()
            boolean r13 = r0.hasArray()
            r2 = 0
            r3 = -16
            r4 = -32
            java.lang.String r5 = "Invalid UTF-8"
            r6 = 0
            if (r13 == 0) goto Ld0
            byte[] r13 = r0.array()
            int r0 = r0.arrayOffset()
            int r0 = r0 + r1
            r1 = r0 | r14
            int r7 = r13.length
            int r7 = r7 - r0
            int r7 = r7 - r14
            r1 = r1 | r7
            if (r1 < 0) goto Lb3
            int r1 = r0 + r14
            char[] r11 = new char[r14]
            r14 = r6
        L36:
            if (r0 >= r1) goto L45
            r7 = r13[r0]
            if (r7 < 0) goto L45
            int r0 = r0 + 1
            int r8 = r14 + 1
            char r7 = (char) r7
            r11[r14] = r7
            r14 = r8
            goto L36
        L45:
            r12 = r14
        L46:
            if (r0 >= r1) goto Lad
            int r14 = r0 + 1
            r7 = r13[r0]
            if (r7 < 0) goto L65
            int r0 = r12 + 1
            char r7 = (char) r7
            r11[r12] = r7
        L53:
            if (r14 >= r1) goto L62
            r7 = r13[r14]
            if (r7 < 0) goto L62
            int r14 = r14 + 1
            int r8 = r0 + 1
            char r7 = (char) r7
            r11[r0] = r7
            r0 = r8
            goto L53
        L62:
            r12 = r0
            r0 = r14
            goto L46
        L65:
            if (r7 >= r4) goto L78
            if (r14 >= r1) goto L74
            int r0 = r0 + 2
            r14 = r13[r14]
            int r8 = r12 + 1
            xhss.AbstractC0561.m1009(r7, r14, r11, r12)
            r12 = r8
            goto L46
        L74:
            xhss.C0532.m959(r5)
            return r2
        L78:
            if (r7 >= r3) goto L91
            int r8 = r1 + (-1)
            if (r14 >= r8) goto L8d
            int r8 = r0 + 2
            r14 = r13[r14]
            int r0 = r0 + 3
            r8 = r13[r8]
            int r9 = r12 + 1
            xhss.AbstractC0561.m1023(r7, r14, r8, r11, r12)
            r12 = r9
            goto L46
        L8d:
            xhss.C0532.m959(r5)
            return r2
        L91:
            int r8 = r1 + (-2)
            if (r14 >= r8) goto La9
            int r8 = r0 + 2
            r14 = r13[r14]
            int r9 = r0 + 3
            r8 = r13[r8]
            int r0 = r0 + 4
            r10 = r13[r9]
            r9 = r8
            r8 = r14
            xhss.AbstractC0561.m1013(r7, r8, r9, r10, r11, r12)
            int r12 = r12 + 2
            goto L46
        La9:
            xhss.C0532.m959(r5)
            return r2
        Lad:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r11, r6, r12)
            return r13
        Lb3:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r0, r14}
            java.lang.String r14 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r13 = java.lang.String.format(r14, r13)
            r1.<init>(r13)
            throw r1
        Ld0:
            r13 = r1 | r14
            int r7 = r0.limit()
            int r7 = r7 - r1
            int r7 = r7 - r14
            r13 = r13 | r7
            if (r13 < 0) goto L16f
            int r13 = r1 + r14
            char[] r11 = new char[r14]
            r14 = r6
        Le0:
            if (r1 >= r13) goto Lf1
            byte r7 = r0.get(r1)
            if (r7 < 0) goto Lf1
            int r1 = r1 + 1
            int r8 = r14 + 1
            char r7 = (char) r7
            r11[r14] = r7
            r14 = r8
            goto Le0
        Lf1:
            r12 = r14
        Lf2:
            if (r1 >= r13) goto L169
            int r14 = r1 + 1
            byte r7 = r0.get(r1)
            if (r7 < 0) goto L115
            int r1 = r12 + 1
            char r7 = (char) r7
            r11[r12] = r7
        L101:
            if (r14 >= r13) goto L112
            byte r7 = r0.get(r14)
            if (r7 < 0) goto L112
            int r14 = r14 + 1
            int r8 = r1 + 1
            char r7 = (char) r7
            r11[r1] = r7
            r1 = r8
            goto L101
        L112:
            r12 = r1
            r1 = r14
            goto Lf2
        L115:
            if (r7 >= r4) goto L12a
            if (r14 >= r13) goto L126
            int r1 = r1 + 2
            byte r14 = r0.get(r14)
            int r8 = r12 + 1
            xhss.AbstractC0561.m1009(r7, r14, r11, r12)
            r12 = r8
            goto Lf2
        L126:
            xhss.C0532.m959(r5)
            return r2
        L12a:
            if (r7 >= r3) goto L147
            int r8 = r13 + (-1)
            if (r14 >= r8) goto L143
            int r8 = r1 + 2
            byte r14 = r0.get(r14)
            int r1 = r1 + 3
            byte r8 = r0.get(r8)
            int r9 = r12 + 1
            xhss.AbstractC0561.m1023(r7, r14, r8, r11, r12)
            r12 = r9
            goto Lf2
        L143:
            xhss.C0532.m959(r5)
            return r2
        L147:
            int r8 = r13 + (-2)
            if (r14 >= r8) goto L165
            int r8 = r1 + 2
            byte r14 = r0.get(r14)
            int r9 = r1 + 3
            byte r8 = r0.get(r8)
            int r1 = r1 + 4
            byte r10 = r0.get(r9)
            r9 = r8
            r8 = r14
            xhss.AbstractC0561.m1013(r7, r8, r9, r10, r11, r12)
            int r12 = r12 + 2
            goto Lf2
        L165:
            xhss.C0532.m959(r5)
            return r2
        L169:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r11, r6, r12)
            return r13
        L16f:
            java.lang.ArrayIndexOutOfBoundsException r13 = new java.lang.ArrayIndexOutOfBoundsException
            int r0 = r0.limit()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r0, r1, r14}
            java.lang.String r0 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.String r14 = java.lang.String.format(r0, r14)
            r13.<init>(r14)
            throw r13
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int m661(int r2) {
            r1 = this;
            int r0 = r1.f1205
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.f1202
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            java.nio.ByteBuffer r1 = r1.f1202
            int r1 = r1.getInt(r0)
            return r1
    }
}
