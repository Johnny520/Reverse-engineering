package p000;

/* JADX INFO: renamed from: ub */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0866ub implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10672;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f10673;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f10674;

    public /* synthetic */ C0866ub(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.f10672 = r1
            r0.f10673 = r2
            r0.f10674 = r3
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f10672
            switch(r0) {
                case 0: goto L42;
                case 1: goto L2f;
                case 2: goto L1a;
                default: goto L5;
            }
        L5:
            org.luckypray.dexkit.query.FindMethod r7 = (org.luckypray.dexkit.query.FindMethod) r7
            r7.getClass()
            ub r0 = new ub
            r1 = 2
            java.lang.String r2 = r6.f10673
            java.lang.String r6 = r6.f10674
            r0.<init>(r1, r2, r6)
            r7.matcher(r0)
        L17:
            s62 r6 = p000.s62.f9751
            return r6
        L1a:
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            r4 = 6
            r5 = 0
            java.lang.String r1 = r6.f10673
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r6.f10674
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            goto L17
        L2f:
            org.luckypray.dexkit.query.FindMethod r7 = (org.luckypray.dexkit.query.FindMethod) r7
            r7.getClass()
            ub r0 = new ub
            r1 = 0
            java.lang.String r2 = r6.f10673
            java.lang.String r6 = r6.f10674
            r0.<init>(r1, r2, r6)
            r7.matcher(r0)
            goto L17
        L42:
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String r1 = r6.f10673
            if (r1 == 0) goto L5a
            boolean r7 = p000.q02.m4671(r1)
            if (r7 == 0) goto L53
            goto L5a
        L53:
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
        L5a:
            java.lang.String r1 = r6.f10674
            if (r1 == 0) goto L6c
            boolean r6 = p000.q02.m4671(r1)
            if (r6 == 0) goto L65
            goto L6c
        L65:
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
        L6c:
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            jz r7 = p000.C0450jz.f5672
            java.lang.Object[] r6 = p000.AbstractC0782s1.m5321(r7, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r0.paramTypes(r6)
            goto L17
    }
}
