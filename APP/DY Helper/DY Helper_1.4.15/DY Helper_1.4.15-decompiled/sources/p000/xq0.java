package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 {

    /* JADX INFO: renamed from: α */
    public static final p000.xq0 f12253 = null;

    /* JADX INFO: renamed from: β */
    public static final int f12254 = 0;

    static {
            xq0 r0 = new xq0
            r0.<init>()
            p000.xq0.f12253 = r0
            return
    }

    private xq0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ boolean m6771(java.lang.String r0, java.lang.reflect.Method r1) {
            boolean r0 = m6772(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    private static final boolean m6772(java.lang.String r0, java.lang.reflect.Method r1) {
            java.lang.String r1 = r1.getName()
            boolean r0 = p000.ln0.m3626(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.util.Set<p000.l01> m6773(java.lang.Class<?> r3, p000.m01 r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.lang.reflect.Constructor[] r2 = r3.getDeclaredConstructors()
            r2.getClass()
            ss1 r2 = p000.AbstractC0312g7.m2232(r2)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            r1 = 1
            r0.setAccessible(r1)
            xq0 r1 = p000.xq0.f12253
            l01 r0 = r1.m6775(r0, r4)
            r3.add(r0)
            goto L1a
        L34:
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public final java.util.Set<p000.l01> m6774(java.lang.Class<?> r3, java.lang.String r4, p000.m01 r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            java.lang.reflect.Method[] r2 = r3.getDeclaredMethods()
            r2.getClass()
            ss1 r2 = p000.AbstractC0312g7.m2232(r2)
            yh0 r3 = new yh0
            r0 = 2
            r3.<init>(r4, r0)
            y30 r4 = new y30
            r0 = 1
            r4.<init>(r2, r0, r3)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            x30 r3 = new x30
            r3.<init>(r4)
        L2a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.setAccessible(r0)
            xq0 r1 = p000.xq0.f12253
            l01 r4 = r1.m6775(r4, r5)
            r2.add(r4)
            goto L2a
        L43:
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public final p000.l01 m6775(java.lang.reflect.Member r2, p000.m01 r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            boolean r1 = r2 instanceof java.lang.reflect.Executable
            if (r1 == 0) goto Le
            r1 = r2
            java.lang.reflect.Executable r1 = (java.lang.reflect.Executable) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L1d
            l01 r2 = new l01
            yq0 r0 = p000.yq0.f12764
            io.github.libxposed.api.XposedInterface$HookHandle r1 = r0.m7018(r1, r3)
            r2.<init>(r1)
            return r2
        L1d:
            java.lang.String r1 = "Only methods and constructors can be hooked: "
            p000.C1080.m7274(r2, r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object m6776(java.lang.reflect.Member r1, java.lang.Object r2, java.lang.Object[] r3) {
            r0 = this;
            r1.getClass()
            boolean r0 = r1 instanceof java.lang.reflect.Method
            if (r0 == 0) goto Lb
            r0 = r1
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L1a
            yq0 r1 = p000.yq0.f12764
            if (r3 != 0) goto L15
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
        L15:
            java.lang.Object r0 = r1.m7019(r0, r2, r3)
            return r0
        L1a:
            java.lang.String r0 = "Original invocation only supports Method: "
            p000.C1080.m7274(r1, r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final void m6777(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            yq0 r1 = p000.yq0.f12764
            java.lang.String r0 = "DYHelper"
            r1.m7020(r0, r2)
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m6778(java.lang.Throwable r3) {
            r2 = this;
            r3.getClass()
            yq0 r2 = p000.yq0.f12764
            java.lang.String r0 = r3.getMessage()
            if (r0 != 0) goto L13
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
        L13:
            java.lang.String r1 = "DYHelper"
            r2.m7021(r1, r0, r3)
            return
    }
}
