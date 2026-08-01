package p000;

/* JADX INFO: renamed from: ab */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0012ab implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f164;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f165;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f166;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.util.List f167;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.util.List f168;

    public /* synthetic */ C0012ab(java.lang.String r1, java.lang.String r2, java.util.List r3, java.util.List r4, int r5) {
            r0 = this;
            r0.f164 = r5
            r0.f165 = r1
            r0.f166 = r2
            r0.f167 = r3
            r0.f168 = r4
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f164
            switch(r0) {
                case 0: goto L65;
                default: goto L5;
            }
        L5:
            r1 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r1.getClass()
            java.lang.String r2 = r7.f165
            if (r2 == 0) goto L1d
            boolean r8 = p000.q02.m4671(r2)
            if (r8 == 0) goto L16
            goto L1d
        L16:
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r1, r2, r3, r4, r5, r6)
        L1d:
            java.lang.String r2 = r7.f166
            boolean r8 = p000.q02.m4671(r2)
            if (r8 == 0) goto L26
            goto L2d
        L26:
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r1, r2, r3, r4, r5, r6)
        L2d:
            java.util.List r8 = r7.f167
            boolean r0 = r8.isEmpty()
            r2 = 0
            if (r0 != 0) goto L48
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r8 = r8.toArray(r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r0 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r1.paramTypes(r8)
        L48:
            java.util.List r7 = r7.f168
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L62
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r7 = r7.toArray(r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r8 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r1.usingStrings(r7)
        L62:
            s62 r7 = p000.s62.f9751
            return r7
        L65:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            ab r0 = new ab
            r5 = 1
            java.lang.String r1 = r7.f165
            java.lang.String r2 = r7.f166
            java.util.List r3 = r7.f167
            java.util.List r4 = r7.f168
            r0.<init>(r1, r2, r3, r4, r5)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
    }
}
