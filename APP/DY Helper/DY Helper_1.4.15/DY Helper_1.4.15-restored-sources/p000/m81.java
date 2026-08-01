package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m81 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7012;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.util.List f7013;

    public /* synthetic */ m81(int r1, java.util.List r2) {
            r0 = this;
            r0.f7012 = r1
            r0.f7013 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f7012
            switch(r0) {
                case 0: goto L74;
                case 1: goto L51;
                case 2: goto L40;
                default: goto L5;
            }
        L5:
            r1 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r1.getClass()
            r5 = 6
            r6 = 0
            java.lang.String r2 = "java.lang.String"
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r1, r2, r3, r4, r5, r6)
            java.util.List r8 = p000.ki1.f5937
            r0 = 0
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.Object[] r8 = r8.toArray(r2)
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r2 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r1.paramTypes(r8)
            java.lang.String[] r8 = new java.lang.String[r0]
            java.util.List r7 = r7.f7013
            java.lang.Object[] r7 = r7.toArray(r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r8 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r1.usingStrings(r7)
        L3d:
            s62 r7 = p000.s62.f9751
            return r7
        L40:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            m81 r0 = new m81
            r1 = 3
            java.util.List r7 = r7.f7013
            r0.<init>(r1, r7)
            r8.matcher(r0)
            goto L3d
        L51:
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r8
            r8.getClass()
            java.lang.String r0 = "void"
            r8.setReturnType(r0)
            java.lang.String r0 = "~79285FCA4BF93B20DAE3F7561F6F9778B9C5EA825069EB9A10DE90A4B36D7D429A65E398626709F07A2B641B8F22F3"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "android.content.Context"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            r8.setParamTypes(r0)
            java.util.List r7 = r7.f7013
            r8.setUsingStrings(r7)
            goto L3d
        L74:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            m81 r0 = new m81
            r1 = 1
            java.util.List r7 = r7.f7013
            r0.<init>(r1, r7)
            r8.matcher(r0)
            goto L3d
    }
}
