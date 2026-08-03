package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.util.function.IntFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f935a;

    public /* synthetic */ e(int r1) {
            r0 = this;
            r0.f935a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int r2) {
            r1 = this;
            int r0 = r1.f935a
            switch(r0) {
                case 0: goto L46;
                case 1: goto L41;
                case 2: goto L3c;
                case 3: goto L37;
                case 4: goto L32;
                case 5: goto L2d;
                case 6: goto L28;
                case 7: goto L23;
                case 8: goto L1e;
                case 9: goto L19;
                case 10: goto L14;
                case 11: goto Lf;
                case 12: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String[] r2 = bsh.StringUtil.d(r2)
            return r2
        La:
            java.lang.String[] r2 = bsh.StringUtil.c(r2)
            return r2
        Lf:
            java.lang.String[] r2 = bsh.Reflect.b(r2)
            return r2
        L14:
            bsh.Variable[] r2 = bsh.Reflect.h(r2)
            return r2
        L19:
            java.lang.Class[] r2 = bsh.Reflect.d(r2)
            return r2
        L1e:
            java.lang.String[] r2 = bsh.NameSpace.c(r2)
            return r2
        L23:
            bsh.BshMethod[] r2 = bsh.NameSpace.b(r2)
            return r2
        L28:
            java.lang.String[] r2 = bsh.NameSpace.d(r2)
            return r2
        L2d:
            bsh.Variable[] r2 = bsh.NameSpace.f(r2)
            return r2
        L32:
            bsh.Variable[] r2 = bsh.NameSpace.a(r2)
            return r2
        L37:
            java.lang.String[] r2 = bsh.Invocable.c(r2)
            return r2
        L3c:
            java.lang.String[] r2 = bsh.ExternalNameSpace.h(r2)
            return r2
        L41:
            java.lang.reflect.Method[] r2 = bsh.ClassGeneratorUtil.a(r2)
            return r2
        L46:
            java.lang.String[] r2 = bsh.BshMethod.a(r2)
            return r2
    }
}
