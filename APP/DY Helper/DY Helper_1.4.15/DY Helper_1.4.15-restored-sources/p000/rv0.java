package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rv0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9525;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.tv0 f9526;

    public /* synthetic */ rv0(p000.tv0 r1, int r2) {
            r0 = this;
            r0.f9525 = r2
            r0.f9526 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f9525
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            org.luckypray.dexkit.query.FindMethod r7 = (org.luckypray.dexkit.query.FindMethod) r7
            r7.getClass()
            rv0 r0 = new rv0
            r1 = 0
            tv0 r6 = r6.f9526
            r0.<init>(r6, r1)
            r7.matcher(r0)
        L15:
            s62 r6 = p000.s62.f9751
            return r6
        L18:
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            r4 = 6
            r5 = 0
            java.lang.String r1 = "java.util.List"
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            tv0 r6 = r6.f9526
            java.lang.String r7 = r6.f10473
            java.lang.String r6 = r6.f10474
            java.lang.String[] r6 = new java.lang.String[]{r7, r6}
            r0.paramTypes(r6)
            goto L15
    }
}
