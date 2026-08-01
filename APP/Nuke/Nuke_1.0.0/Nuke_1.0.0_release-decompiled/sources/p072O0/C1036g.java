package p072O0;

import p096T0.C1410j;

/* JADX INFO: renamed from: O0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1036g {

    /* JADX INFO: renamed from: a */
    public int f3228a;

    /* JADX INFO: renamed from: b */
    public float f3229b;

    /* JADX INFO: renamed from: c */
    public final Object f3230c;

    public C1036g(int i5, C1032c c1032c) {
        this.f3228a = i5;
        this.f3230c = c1032c;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float m2111a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f3230c
            T0.j r0 = (p096T0.C1410j) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f5044f
            int r3 = p096T0.AbstractC1407g.m2701d(r3, r6, r7)
            android.text.Layout r4 = r0.f5044f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.m2710f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.f3228a
            if (r1 != r4) goto L35
            float r6 = r5.f3229b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.m2712h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.m2713i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.f3228a = r4
            r5.f3229b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p072O0.C1036g.m2111a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2112b(float r5, p084Q2.AbstractC1178c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p072O0.C1035f
            if (r0 == 0) goto L13
            r0 = r6
            O0.f r0 = (p072O0.C1035f) r0
            int r1 = r0.f3227i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3227i = r1
            goto L18
        L13:
            O0.f r0 = new O0.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3225g
            int r1 = r0.f3227i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            p127Z2.AbstractC1784a.m3205S(r6)
            goto L44
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            p127Z2.AbstractC1784a.m3205S(r6)
            java.lang.Object r6 = r4.f3230c
            O0.c r6 = (p072O0.C1032c) r6
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r0.f3227i = r2
            java.lang.Object r6 = r6.mo0g(r1, r0)
            P2.a r5 = p079P2.EnumC1152a.f3788d
            if (r6 != r5) goto L44
            return r5
        L44:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f3229b
            float r6 = r6 + r5
            r4.f3229b = r6
            K2.q r5 = p056K2.C0891q.f2780a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p072O0.C1036g.m2112b(float, Q2.c):java.lang.Object");
    }

    public C1036g(C1410j c1410j) {
        this.f3230c = c1410j;
        this.f3228a = -1;
    }
}
