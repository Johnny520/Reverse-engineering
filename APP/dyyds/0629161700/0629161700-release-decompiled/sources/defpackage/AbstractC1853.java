package defpackage;

/* JADX INFO: renamed from: ᲁᛵᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1853 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.lang.String[] f8091 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.lang.String[] f8092 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1128 f8093 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.lang.String[] f8094 = null;

    static {
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            java.lang.String r2 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            r0.f5018 = r2
            defpackage.AbstractC1853.f8093 = r0
            java.lang.String r11 = "WINDOW_UPDATE"
            java.lang.String r12 = "CONTINUATION"
            java.lang.String r3 = "DATA"
            java.lang.String r4 = "HEADERS"
            java.lang.String r5 = "PRIORITY"
            java.lang.String r6 = "RST_STREAM"
            java.lang.String r7 = "SETTINGS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r9 = "PING"
            java.lang.String r10 = "GOAWAY"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            defpackage.AbstractC1853.f8094 = r0
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            defpackage.AbstractC1853.f8092 = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L37:
            r4 = 32
            if (r3 >= r0) goto L54
            java.lang.String r5 = java.lang.Integer.toBinaryString(r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "%8s"
            java.lang.String r5 = defpackage.AbstractC0508.m1293(r6, r5)
            r6 = 48
            java.lang.String r4 = r5.replace(r4, r6)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L37
        L54:
            defpackage.AbstractC1853.f8091 = r1
            java.lang.String[] r0 = defpackage.AbstractC1853.f8092
            java.lang.String r1 = ""
            r0[r2] = r1
            java.lang.String r1 = "END_STREAM"
            r3 = 1
            r0[r3] = r1
            int[] r1 = new int[]{r3}
            java.lang.String r3 = "PADDED"
            r5 = 8
            r0[r5] = r3
            r3 = r1[r2]
            r6 = r3 | 8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r3 = r0[r3]
            r7.append(r3)
            java.lang.String r3 = "|PADDED"
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            r0[r6] = r7
            java.lang.String r6 = "END_HEADERS"
            r7 = 4
            r0[r7] = r6
            java.lang.String r6 = "PRIORITY"
            r0[r4] = r6
            java.lang.String r6 = "END_HEADERS|PRIORITY"
            r8 = 36
            r0[r8] = r6
            int[] r0 = new int[]{r7, r4, r8}
            r4 = r2
        L98:
            r6 = 3
            if (r4 >= r6) goto Ldc
            r6 = r0[r4]
            r7 = r1[r2]
            java.lang.String[] r8 = defpackage.AbstractC1853.f8092
            r9 = r7 | r6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = r8[r7]
            r10.append(r11)
            r11 = 124(0x7c, float:1.74E-43)
            r10.append(r11)
            r12 = r8[r6]
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r8[r9] = r10
            r9 = r9 | r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r7 = r8[r7]
            r10.append(r7)
            r10.append(r11)
            r6 = r8[r6]
            r10.append(r6)
            r10.append(r3)
            java.lang.String r6 = r10.toString()
            r8[r9] = r6
            int r4 = r4 + 1
            goto L98
        Ldc:
            java.lang.String[] r0 = defpackage.AbstractC1853.f8092
            int r0 = r0.length
        Ldf:
            if (r2 >= r0) goto Lf0
            java.lang.String[] r1 = defpackage.AbstractC1853.f8092
            r3 = r1[r2]
            if (r3 != 0) goto Led
            java.lang.String[] r3 = defpackage.AbstractC1853.f8091
            r3 = r3[r2]
            r1[r2] = r3
        Led:
            int r2 = r2 + 1
            goto Ldf
        Lf0:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m3267(boolean r1, int r2, int r3, long r4) {
            r0 = 8
            java.lang.String r0 = m3268(r0)
            if (r1 == 0) goto Lb
            java.lang.String r1 = "<<"
            goto Ld
        Lb:
            java.lang.String r1 = ">>"
        Ld:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r0, r4}
            java.lang.String r2 = "%s 0x%08x %5d %-13s %d"
            java.lang.String r1 = defpackage.AbstractC0508.m1293(r2, r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.String m3268(int r2) {
            java.lang.String[] r0 = defpackage.AbstractC1853.f8094
            int r1 = r0.length
            if (r2 >= r1) goto L8
            r2 = r0[r2]
            return r2
        L8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = "0x%02x"
            java.lang.String r2 = defpackage.AbstractC0508.m1293(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m3269(boolean r4, int r5, int r6, int r7, int r8) {
            java.lang.String r0 = m3268(r7)
            if (r8 != 0) goto L9
            java.lang.String r7 = ""
            goto L54
        L9:
            r1 = 2
            java.lang.String[] r2 = defpackage.AbstractC1853.f8091
            if (r7 == r1) goto L52
            r1 = 3
            if (r7 == r1) goto L52
            r1 = 4
            if (r7 == r1) goto L49
            r1 = 6
            if (r7 == r1) goto L49
            r1 = 7
            if (r7 == r1) goto L52
            r1 = 8
            if (r7 == r1) goto L52
            java.lang.String[] r1 = defpackage.AbstractC1853.f8092
            int r3 = r1.length
            if (r8 >= r3) goto L26
            r1 = r1[r8]
            goto L28
        L26:
            r1 = r2[r8]
        L28:
            r2 = 5
            if (r7 != r2) goto L38
            r2 = r8 & 4
            if (r2 == 0) goto L38
            java.lang.String r7 = "HEADERS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r7 = defpackage.AbstractC0651.m1485(r1, r7, r8)
            goto L54
        L38:
            if (r7 != 0) goto L47
            r7 = r8 & 32
            if (r7 == 0) goto L47
            java.lang.String r7 = "PRIORITY"
            java.lang.String r8 = "COMPRESSED"
            java.lang.String r7 = defpackage.AbstractC0651.m1485(r1, r7, r8)
            goto L54
        L47:
            r7 = r1
            goto L54
        L49:
            r7 = 1
            if (r8 != r7) goto L4f
            java.lang.String r7 = "ACK"
            goto L54
        L4f:
            r7 = r2[r8]
            goto L54
        L52:
            r7 = r2[r8]
        L54:
            if (r4 == 0) goto L59
            java.lang.String r4 = "<<"
            goto L5b
        L59:
            java.lang.String r4 = ">>"
        L5b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = defpackage.AbstractC0508.m1293(r5, r4)
            return r4
    }
}
