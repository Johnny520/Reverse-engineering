package p000;

/* JADX INFO: renamed from: nb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0580nb implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7493;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.reflect.Method f7494;

    public /* synthetic */ C0580nb(int r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.f7493 = r1
            r0.f7494 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f7493
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L7a;
                case 2: goto L30;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.reflect.Method r6 = r6.f7494
            if (r6 == 0) goto L2a
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = r6.getName()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L28
            java.lang.Class[] r7 = r7.getParameterTypes()
            java.lang.Class[] r6 = r6.getParameterTypes()
            boolean r6 = java.util.Arrays.equals(r7, r6)
            if (r6 == 0) goto L28
            goto L2a
        L28:
            r6 = 0
            goto L2b
        L2a:
            r6 = 1
        L2b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L30:
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.reflect.Method r6 = r6.f7494
            java.lang.String r1 = r6.getName()
            r1.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.name$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = "void"
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            java.lang.Class[] r6 = r6.getParameterTypes()
            r6.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r1 = r6.length
            r7.<init>(r1)
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L5b:
            if (r3 >= r1) goto L65
            r4 = r6[r3]
            r5 = 1
            int r3 = p000.lz1.m3679(r4, r7, r3, r5)
            goto L5b
        L65:
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.Object[] r6 = r7.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r0.paramTypes(r6)
            s62 r6 = p000.s62.f9751
            return r6
        L7a:
            org.luckypray.dexkit.query.FindMethod r7 = (org.luckypray.dexkit.query.FindMethod) r7
            r7.getClass()
            nb r0 = new nb
            r1 = 2
            java.lang.reflect.Method r6 = r6.f7494
            r0.<init>(r1, r6)
            r7.matcher(r0)
            s62 r6 = p000.s62.f9751
            return r6
        L8d:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r7 = r7.getName()
            java.lang.reflect.Method r6 = r6.f7494
            java.lang.String r6 = r6.getName()
            boolean r6 = p000.ln0.m3626(r7, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
    }
}
