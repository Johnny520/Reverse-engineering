package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f6400a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6401b = 0;

    static {
            u2.p[] r0 = u2.o.f13358b
            long r0 = u2.o.f13359c
            i2.v.f6400a = r0
            return
    }

    public static final i2.u a(i2.u r17, int r18, int r19, long r20, t2.q r22, i2.w r23, t2.i r24, int r25, int r26, t2.s r27) {
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
            int r15 = r0.f6391a
            if (r1 != r15) goto L74
        L22:
            u2.p[] r15 = u2.o.f13358b
            long r15 = r3 & r13
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 != 0) goto L2c
            r15 = r11
            goto L35
        L2c:
            r15 = r11
            long r11 = r0.f6393c
            boolean r11 = u2.o.a(r3, r11)
            if (r11 == 0) goto L75
        L35:
            if (r5 == 0) goto L3f
            t2.q r11 = r0.f6394d
            boolean r11 = r5.equals(r11)
            if (r11 == 0) goto L75
        L3f:
            if (r2 != 0) goto L42
            goto L46
        L42:
            int r11 = r0.f6392b
            if (r2 != r11) goto L75
        L46:
            if (r6 == 0) goto L50
            i2.w r11 = r0.f6395e
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L75
        L50:
            if (r7 == 0) goto L5a
            t2.i r11 = r0.f6396f
            boolean r11 = r7.equals(r11)
            if (r11 == 0) goto L75
        L5a:
            if (r8 != 0) goto L5d
            goto L61
        L5d:
            int r11 = r0.f6397g
            if (r8 != r11) goto L75
        L61:
            if (r9 != 0) goto L64
            goto L68
        L64:
            int r11 = r0.f6398h
            if (r9 != r11) goto L75
        L68:
            if (r10 == 0) goto L73
            t2.s r11 = r0.f6399i
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L73
            goto L75
        L73:
            return r0
        L74:
            r15 = r11
        L75:
            u2.p[] r11 = u2.o.f13358b
            long r11 = r3 & r13
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto L7f
            long r3 = r0.f6393c
        L7f:
            if (r5 != 0) goto L83
            t2.q r5 = r0.f6394d
        L83:
            if (r1 != 0) goto L87
            int r1 = r0.f6391a
        L87:
            if (r2 != 0) goto L8b
            int r2 = r0.f6392b
        L8b:
            i2.w r11 = r0.f6395e
            if (r11 != 0) goto L90
            goto L93
        L90:
            if (r6 != 0) goto L93
            r6 = r11
        L93:
            if (r7 != 0) goto L97
            t2.i r7 = r0.f6396f
        L97:
            if (r8 != 0) goto L9b
            int r8 = r0.f6397g
        L9b:
            if (r9 != 0) goto L9f
            int r9 = r0.f6398h
        L9f:
            if (r10 != 0) goto La4
            t2.s r0 = r0.f6399i
            r10 = r0
        La4:
            i2.u r0 = new i2.u
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
