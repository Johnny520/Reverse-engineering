package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10381;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f10382;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String[] f10383;

    public /* synthetic */ th1(java.lang.String r1, java.lang.String[] r2, int r3) {
            r0 = this;
            r0.f10381 = r3
            r0.f10382 = r1
            r0.f10383 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f10381
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            org.luckypray.dexkit.query.matchers.MethodMatcher r4 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r4
            r4.getClass()
            java.lang.String r0 = r3.f10382
            r4.setName(r0)
            java.lang.String r0 = "void"
            r4.setReturnType(r0)
            java.lang.String[] r3 = r3.f10383
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r4.paramTypes(r3)
        L20:
            s62 r3 = p000.s62.f9751
            return r3
        L23:
            org.luckypray.dexkit.query.FindMethod r4 = (org.luckypray.dexkit.query.FindMethod) r4
            r4.getClass()
            th1 r0 = new th1
            r1 = 1
            java.lang.String r2 = r3.f10382
            java.lang.String[] r3 = r3.f10383
            r0.<init>(r2, r3, r1)
            r4.matcher(r0)
            goto L20
    }
}
