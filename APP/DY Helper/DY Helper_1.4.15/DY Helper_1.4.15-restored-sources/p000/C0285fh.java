package p000;

/* JADX INFO: renamed from: fh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0285fh implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3933;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Class f3934;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f3935;

    public /* synthetic */ C0285fh(int r1, java.lang.Class r2, java.lang.String r3) {
            r0 = this;
            r0.f3933 = r1
            r0.f3934 = r2
            r0.f3935 = r3
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f3933
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r1 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r1.getClass()
            java.lang.Class r8 = r7.f3934
            java.lang.String r2 = r8.getName()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r7 = r7.f3935
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r1.usingStrings(r7)
        L21:
            s62 r7 = p000.s62.f9751
            return r7
        L24:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            fh r0 = new fh
            r1 = 1
            java.lang.Class r2 = r7.f3934
            java.lang.String r7 = r7.f3935
            r0.<init>(r1, r2, r7)
            r8.matcher(r0)
            goto L21
    }
}
