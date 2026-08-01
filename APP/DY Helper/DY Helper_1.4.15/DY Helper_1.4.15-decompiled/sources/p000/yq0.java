package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yq0 {

    /* JADX INFO: renamed from: α */
    public static final p000.yq0 f12764 = null;

    /* JADX INFO: renamed from: β */
    private static final java.lang.String f12765 = "r29ad36de2985c377";

    /* JADX INFO: renamed from: γ */
    private static volatile io.github.libxposed.api.XposedModule f12766;

    /* JADX INFO: renamed from: δ */
    public static final int f12767 = 0;

    static {
            yq0 r0 = new yq0
            r0.<init>()
            p000.yq0.f12764 = r0
            r0 = 8
            p000.yq0.f12767 = r0
            return
    }

    private yq0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: η */
    private final io.github.libxposed.api.XposedModule m7016() {
            r0 = this;
            io.github.libxposed.api.XposedModule r0 = p000.yq0.f12766
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "libxposed runtime is not bound; hooks must be installed after onModuleLoaded"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final void m7017(io.github.libxposed.api.XposedModule r1) {
            r0 = this;
            r1.getClass()
            p000.yq0.f12766 = r1
            return
    }

    /* JADX INFO: renamed from: β */
    public final io.github.libxposed.api.XposedInterface.HookHandle m7018(java.lang.reflect.Executable r2, p000.m01 r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            io.github.libxposed.api.XposedModule r1 = r1.m7016()
            io.github.libxposed.api.XposedInterface$HookBuilder r1 = r1.hook(r2)
            int r2 = r3.getPriority$app()
            io.github.libxposed.api.XposedInterface$HookBuilder r1 = r1.setPriority(r2)
            io.github.libxposed.api.XposedInterface$ExceptionMode r2 = io.github.libxposed.api.XposedInterface.ExceptionMode.PASSTHROUGH
            io.github.libxposed.api.XposedInterface$HookBuilder r1 = r1.setExceptionMode(r2)
            ob r2 = new ob
            r0 = 1
            r2.<init>(r0, r3)
            io.github.libxposed.api.XposedInterface$HookHandle r1 = r1.intercept(r2)
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object m7019(java.lang.reflect.Method r1, java.lang.Object r2, java.lang.Object[] r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            io.github.libxposed.api.XposedModule r0 = r0.m7016()
            io.github.libxposed.api.XposedInterface$Invoker r0 = r0.getInvoker(r1)
            r0.getClass()
            io.github.libxposed.api.XposedInterface$Invoker$Type$Origin r1 = io.github.libxposed.api.XposedInterface.Invoker.Type.ORIGIN
            r0.setType(r1)
            int r1 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.lang.Object r0 = r0.invoke(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final void m7020(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            io.github.libxposed.api.XposedModule r1 = p000.yq0.f12766
            if (r1 != 0) goto Le
            android.util.Log.d(r2, r3)
            return
        Le:
            r0 = 3
            r1.log(r0, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m7021(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            io.github.libxposed.api.XposedModule r1 = p000.yq0.f12766
            if (r1 != 0) goto L11
            android.util.Log.e(r2, r3, r4)
            return
        L11:
            r0 = 6
            r1.log(r0, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m7022(java.lang.String r2, java.lang.reflect.Executable r3, java.lang.Throwable r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " callback failed: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "r29ad36de2985c377"
            r1.m7021(r3, r2, r4)
            return
    }
}
