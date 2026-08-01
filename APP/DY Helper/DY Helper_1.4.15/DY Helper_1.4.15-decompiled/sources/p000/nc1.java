package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7517;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Long f7518;

    public /* synthetic */ nc1(java.lang.Long r1, int r2) {
            r0 = this;
            r0.f7517 = r2
            r0.f7518 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f7517
            switch(r0) {
                case 0: goto La0;
                case 1: goto L4e;
                default: goto L5;
            }
        L5:
            r1 = r13
            jb1 r1 = (p000.jb1) r1
            r1.getClass()
            java.lang.Long r12 = r12.f7518
            r13 = 0
            if (r12 == 0) goto L1b
            long r2 = r12.longValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L1b
            goto L1c
        L1b:
            r12 = r13
        L1c:
            long r2 = r1.f5412
            if (r12 == 0) goto L32
            long r4 = r12.longValue()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r6 - r2
            int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r13 <= 0) goto L31
            r2 = r6
            goto L32
        L31:
            long r2 = r2 + r4
        L32:
            r3 = r2
            int r13 = r1.f5416
            if (r12 != 0) goto L40
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r12) goto L3e
            r13 = r12
            goto L40
        L3e:
            int r13 = r13 + 1
        L40:
            r9 = r13
            r10 = 0
            r11 = 93
            r2 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            jb1 r12 = p000.jb1.m2926(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r12
        L4e:
            r0 = r13
            jb1 r0 = (p000.jb1) r0
            r0.getClass()
            java.lang.Long r12 = r12.f7518
            r13 = 0
            if (r12 == 0) goto L64
            long r1 = r12.longValue()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L64
            goto L65
        L64:
            r12 = r13
        L65:
            long r1 = r0.f5413
            if (r12 == 0) goto L7b
            long r3 = r12.longValue()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r7 = r5 - r1
            int r13 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r13 <= 0) goto L7a
            r1 = r5
            goto L7b
        L7a:
            long r1 = r1 + r3
        L7b:
            r4 = r1
            int r13 = r0.f5414
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r1) goto L85
            r6 = r1
            goto L88
        L85:
            int r13 = r13 + 1
            r6 = r13
        L88:
            int r13 = r0.f5417
            if (r12 != 0) goto L93
            if (r13 != r1) goto L8f
            goto L91
        L8f:
            int r1 = r13 + 1
        L91:
            r9 = r1
            goto L94
        L93:
            r9 = r13
        L94:
            r10 = 51
            r1 = 0
            r2 = 0
            r7 = 0
            r8 = 0
            jb1 r12 = p000.jb1.m2926(r0, r1, r2, r4, r6, r7, r8, r9, r10)
            return r12
        La0:
            id1 r13 = (p000.id1) r13
            r13.getClass()
            java.lang.Integer r13 = r13.f5019
            if (r13 == 0) goto Lc5
            int r13 = r13.intValue()
            if (r13 == 0) goto Lbf
            java.lang.Long r12 = r12.f7518
            if (r12 == 0) goto Lbd
            long r0 = r12.longValue()
            long r12 = (long) r13
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 < 0) goto Lbd
            goto Lbf
        Lbd:
            r12 = 0
            goto Lc0
        Lbf:
            r12 = 1
        Lc0:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            goto Lcb
        Lc5:
            java.lang.String r12 = "Required value was null."
            p000.C1080.m7279(r12)
            r12 = 0
        Lcb:
            return r12
    }
}
