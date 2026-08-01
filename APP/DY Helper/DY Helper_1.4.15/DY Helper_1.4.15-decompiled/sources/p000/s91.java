package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class s91 {

    /* JADX INFO: renamed from: α */
    public static final long f9773 = 0;

    /* JADX INFO: renamed from: β */
    public static final /* synthetic */ int f9774 = 0;

    static {
            z32[] r0 = p000.y32.f12440
            long r0 = p000.y32.f12441
            p000.s91.f9773 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final p000.r91 m5378(p000.r91 r17, int r18, int r19, long r20, p000.h32 r22, p000.kh1 r23, p000.wr0 r24, int r25, int r26, p000.q32 r27) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = 0
            r13 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            if (r1 != 0) goto L1e
            goto L22
        L1e:
            int r15 = r0.f9301
            if (r1 != r15) goto L74
        L22:
            z32[] r15 = p000.y32.f12440
            long r15 = r3 & r13
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 != 0) goto L2c
            r15 = r11
            goto L35
        L2c:
            r15 = r11
            long r11 = r0.f9303
            boolean r11 = p000.y32.m6818(r3, r11)
            if (r11 == 0) goto L75
        L35:
            if (r5 == 0) goto L3f
            h32 r11 = r0.f9304
            boolean r11 = r5.equals(r11)
            if (r11 == 0) goto L75
        L3f:
            if (r2 != 0) goto L42
            goto L46
        L42:
            int r11 = r0.f9302
            if (r2 != r11) goto L75
        L46:
            if (r6 == 0) goto L50
            kh1 r11 = r0.f9305
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L75
        L50:
            if (r7 == 0) goto L5a
            wr0 r11 = r0.f9306
            boolean r11 = r7.equals(r11)
            if (r11 == 0) goto L75
        L5a:
            if (r8 != 0) goto L5d
            goto L61
        L5d:
            int r11 = r0.f9307
            if (r8 != r11) goto L75
        L61:
            if (r9 != 0) goto L64
            goto L68
        L64:
            int r11 = r0.f9308
            if (r9 != r11) goto L75
        L68:
            if (r10 == 0) goto L73
            q32 r11 = r0.f9309
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L73
            goto L75
        L73:
            return r0
        L74:
            r15 = r11
        L75:
            z32[] r11 = p000.y32.f12440
            long r11 = r3 & r13
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto L7f
            long r3 = r0.f9303
        L7f:
            if (r5 != 0) goto L83
            h32 r5 = r0.f9304
        L83:
            if (r1 != 0) goto L87
            int r1 = r0.f9301
        L87:
            if (r2 != 0) goto L8b
            int r2 = r0.f9302
        L8b:
            kh1 r11 = r0.f9305
            if (r11 != 0) goto L90
            goto L93
        L90:
            if (r6 != 0) goto L93
            r6 = r11
        L93:
            if (r7 != 0) goto L97
            wr0 r7 = r0.f9306
        L97:
            if (r8 != 0) goto L9b
            int r8 = r0.f9307
        L9b:
            if (r9 != 0) goto L9f
            int r9 = r0.f9308
        L9f:
            if (r10 != 0) goto La4
            q32 r0 = r0.f9309
            r10 = r0
        La4:
            r91 r0 = new r91
            r17 = r0
            r18 = r1
            r19 = r2
            r20 = r3
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r17.<init>(r18, r19, r20, r22, r23, r24, r25, r26, r27)
            return r0
    }
}
