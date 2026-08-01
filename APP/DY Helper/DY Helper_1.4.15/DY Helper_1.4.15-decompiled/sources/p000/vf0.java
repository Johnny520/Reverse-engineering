package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class vf0 {

    /* JADX INFO: renamed from: α */
    public static final p000.C0208dd f11255 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.String[] f11256 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.lang.String[] f11257 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.lang.String[] f11258 = null;

    static {
            dd r0 = p000.C0208dd.f3085
            java.lang.String r0 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
            dd r0 = p000.C0381i2.m2592(r0)
            p000.vf0.f11255 = r0
            java.lang.String r9 = "WINDOW_UPDATE"
            java.lang.String r10 = "CONTINUATION"
            java.lang.String r1 = "DATA"
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PRIORITY"
            java.lang.String r4 = "RST_STREAM"
            java.lang.String r5 = "SETTINGS"
            java.lang.String r6 = "PUSH_PROMISE"
            java.lang.String r7 = "PING"
            java.lang.String r8 = "GOAWAY"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            p000.vf0.f11256 = r0
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            p000.vf0.f11257 = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L30:
            r4 = 32
            if (r3 >= r0) goto L53
            java.lang.String r5 = java.lang.Integer.toBinaryString(r3)
            r5.getClass()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "%8s"
            java.lang.String r5 = p000.ud2.m5846(r6, r5)
            r6 = 48
            java.lang.String r4 = r5.replace(r4, r6)
            r4.getClass()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L30
        L53:
            p000.vf0.f11258 = r1
            java.lang.String[] r0 = p000.vf0.f11257
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
            java.lang.String r8 = "|PADDED"
            java.lang.String r3 = p000.lz1.m3691(r7, r3, r8)
            r0[r6] = r3
            java.lang.String r3 = "END_HEADERS"
            r6 = 4
            r0[r6] = r3
            java.lang.String r3 = "PRIORITY"
            r0[r4] = r3
            java.lang.String r3 = "END_HEADERS|PRIORITY"
            r7 = 36
            r0[r7] = r3
            int[] r0 = new int[]{r6, r4, r7}
            r3 = r2
        L91:
            r4 = 3
            if (r3 >= r4) goto Lcf
            r4 = r0[r3]
            r6 = r1[r2]
            java.lang.String[] r7 = p000.vf0.f11257
            r9 = r6 | r4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = r7[r6]
            r10.append(r11)
            r11 = 124(0x7c, float:1.74E-43)
            r10.append(r11)
            r12 = r7[r4]
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r7[r9] = r10
            r9 = r9 | r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r6 = r7[r6]
            r10.append(r6)
            r10.append(r11)
            r4 = r7[r4]
            java.lang.String r4 = p000.lz1.m3691(r10, r4, r8)
            r7[r9] = r4
            int r3 = r3 + 1
            goto L91
        Lcf:
            java.lang.String[] r0 = p000.vf0.f11257
            int r0 = r0.length
        Ld2:
            if (r2 >= r0) goto Le3
            java.lang.String[] r1 = p000.vf0.f11257
            r3 = r1[r2]
            if (r3 != 0) goto Le0
            java.lang.String[] r3 = p000.vf0.f11258
            r3 = r3[r2]
            r1[r2] = r3
        Le0:
            int r2 = r2 + 1
            goto Ld2
        Le3:
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m6214(int r2) {
            java.lang.String[] r0 = p000.vf0.f11256
            int r1 = r0.length
            if (r2 >= r1) goto L8
            r2 = r0[r2]
            return r2
        L8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = "0x%02x"
            java.lang.String r2 = p000.ud2.m5846(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m6215(boolean r4, int r5, int r6, int r7, int r8) {
            java.lang.String r0 = m6214(r7)
            if (r8 != 0) goto L9
            java.lang.String r7 = ""
            goto L57
        L9:
            r1 = 2
            java.lang.String[] r2 = p000.vf0.f11258
            if (r7 == r1) goto L55
            r1 = 3
            if (r7 == r1) goto L55
            r1 = 4
            if (r7 == r1) goto L4c
            r1 = 6
            if (r7 == r1) goto L4c
            r1 = 7
            if (r7 == r1) goto L55
            r1 = 8
            if (r7 == r1) goto L55
            java.lang.String[] r1 = p000.vf0.f11257
            int r3 = r1.length
            if (r8 >= r3) goto L29
            r1 = r1[r8]
            r1.getClass()
            goto L2b
        L29:
            r1 = r2[r8]
        L2b:
            r2 = 5
            if (r7 != r2) goto L3b
            r2 = r8 & 4
            if (r2 == 0) goto L3b
            java.lang.String r7 = "HEADERS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r7 = p000.x02.m6483(r1, r7, r8)
            goto L57
        L3b:
            if (r7 != 0) goto L4a
            r7 = r8 & 32
            if (r7 == 0) goto L4a
            java.lang.String r7 = "PRIORITY"
            java.lang.String r8 = "COMPRESSED"
            java.lang.String r7 = p000.x02.m6483(r1, r7, r8)
            goto L57
        L4a:
            r7 = r1
            goto L57
        L4c:
            r7 = 1
            if (r8 != r7) goto L52
            java.lang.String r7 = "ACK"
            goto L57
        L52:
            r7 = r2[r8]
            goto L57
        L55:
            r7 = r2[r8]
        L57:
            if (r4 == 0) goto L5c
            java.lang.String r4 = "<<"
            goto L5e
        L5c:
            java.lang.String r4 = ">>"
        L5e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = p000.ud2.m5846(r5, r4)
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m6216(boolean r1, int r2, int r3, long r4) {
            r0 = 8
            java.lang.String r0 = m6214(r0)
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
            java.lang.String r1 = p000.ud2.m5846(r2, r1)
            return r1
    }
}
