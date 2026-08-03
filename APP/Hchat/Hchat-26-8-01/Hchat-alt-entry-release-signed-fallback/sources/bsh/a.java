package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f926g;

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.f926g = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f926g
            switch(r0) {
                case 0: goto L34;
                case 1: goto L2d;
                case 2: goto L26;
                case 3: goto L1f;
                case 4: goto L18;
                case 5: goto L13;
                case 6: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = bsh.Reflect.g(r2)
            return r2
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = bsh.Reflect.a(r2)
            return r2
        L13:
            boolean r2 = java.util.Objects.nonNull(r2)
            return r2
        L18:
            bsh.Variable r2 = (bsh.Variable) r2
            boolean r2 = java.util.Objects.nonNull(r2)
            return r2
        L1f:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r2 = bsh.ClassGeneratorUtil.e(r2)
            return r2
        L26:
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = bsh.Reflect.isGeneratedClass(r2)
            return r2
        L2d:
            bsh.Invocable r2 = (bsh.Invocable) r2
            boolean r2 = r2.isStatic()
            return r2
        L34:
            bsh.BshMethod r2 = (bsh.BshMethod) r2
            boolean r2 = bsh.BSHClassDeclaration.a(r2)
            return r2
    }
}
