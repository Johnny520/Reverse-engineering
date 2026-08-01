package p000;

/* JADX INFO: renamed from: jf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0429jf extends p000.do1 implements p000.e80 {

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f5444;

    /* JADX INFO: renamed from: θ */
    public java.lang.Class f5445;

    /* JADX INFO: renamed from: ι */
    public java.lang.Object[] f5446;

    /* JADX INFO: renamed from: κ */
    public int f5447;

    /* JADX INFO: renamed from: λ */
    public int f5448;

    /* JADX INFO: renamed from: μ */
    public int f5449;

    /* JADX INFO: renamed from: ν */
    public int f5450;

    /* JADX INFO: renamed from: ξ */
    public /* synthetic */ java.lang.Object f5451;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ java.lang.Class f5452;

    public /* synthetic */ C0429jf(java.lang.Class r1, p000.InterfaceC0631op r2, int r3) {
            r0 = this;
            r0.f5444 = r3
            r0.f5452 = r1
            r0.<init>(r2)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f5444
            ts1 r2 = (p000.ts1) r2
            op r3 = (p000.InterfaceC0631op) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            op r1 = r1.mo1119(r3, r2)
            jf r1 = (p000.C0429jf) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L16:
            op r1 = r1.mo1119(r3, r2)
            jf r1 = (p000.C0429jf) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f5444
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            jf r0 = new jf
            java.lang.Class r2 = r2.f5452
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.f5451 = r4
            return r0
        L10:
            jf r0 = new jf
            java.lang.Class r2 = r2.f5452
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.f5451 = r4
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f5444
            switch(r0) {
                case 0: goto L65;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f5451
            ts1 r0 = (p000.ts1) r0
            int r1 = r7.f5450
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 != r2) goto L1f
            int r1 = r7.f5449
            int r3 = r7.f5448
            int r4 = r7.f5447
            java.lang.Object[] r5 = r7.f5446
            java.lang.Class r6 = r7.f5445
            p000.i81.m2649(r8)
            int r3 = r3 + r2
            goto L40
        L1f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r7)
            r7 = 0
            goto L64
        L26:
            p000.i81.m2649(r8)
            java.lang.Class r8 = r7.f5452
            r6 = r8
        L2c:
            if (r6 == 0) goto L62
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L62
            java.lang.reflect.Field[] r5 = r6.getDeclaredFields()
            r5.getClass()
            int r1 = r5.length
            r4 = 0
            r3 = r4
        L40:
            if (r3 >= r1) goto L5d
            r8 = r5[r3]
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            r8.getClass()
            r7.f5451 = r0
            r7.f5445 = r6
            r7.f5446 = r5
            r7.f5447 = r4
            r7.f5448 = r3
            r7.f5449 = r1
            r7.f5450 = r2
            r0.m5740(r7, r8)
            cq r7 = p000.EnumC0184cq.f2716
            goto L64
        L5d:
            java.lang.Class r6 = r6.getSuperclass()
            goto L2c
        L62:
            s62 r7 = p000.s62.f9751
        L64:
            return r7
        L65:
            java.lang.Object r0 = r7.f5451
            ts1 r0 = (p000.ts1) r0
            int r1 = r7.f5450
            r2 = 1
            if (r1 == 0) goto L86
            if (r1 != r2) goto L7f
            int r1 = r7.f5449
            int r3 = r7.f5448
            int r4 = r7.f5447
            java.lang.Object[] r5 = r7.f5446
            java.lang.Class r6 = r7.f5445
            p000.i81.m2649(r8)
            int r3 = r3 + r2
            goto La0
        L7f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r7)
            r7 = 0
            goto Lc4
        L86:
            p000.i81.m2649(r8)
            java.lang.Class r8 = r7.f5452
            r6 = r8
        L8c:
            if (r6 == 0) goto Lc2
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto Lc2
            java.lang.reflect.Method[] r5 = r6.getDeclaredMethods()
            r5.getClass()
            int r1 = r5.length
            r4 = 0
            r3 = r4
        La0:
            if (r3 >= r1) goto Lbd
            r8 = r5[r3]
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            r8.getClass()
            r7.f5451 = r0
            r7.f5445 = r6
            r7.f5446 = r5
            r7.f5447 = r4
            r7.f5448 = r3
            r7.f5449 = r1
            r7.f5450 = r2
            r0.m5740(r7, r8)
            cq r7 = p000.EnumC0184cq.f2716
            goto Lc4
        Lbd:
            java.lang.Class r6 = r6.getSuperclass()
            goto L8c
        Lc2:
            s62 r7 = p000.s62.f9751
        Lc4:
            return r7
    }
}
