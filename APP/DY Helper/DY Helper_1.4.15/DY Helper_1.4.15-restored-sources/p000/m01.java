package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class m01 {
    public static final int $stable = 0;
    public static final p000.j01 Companion = null;
    public static final int PRIORITY_DEFAULT = 50;
    public static final int PRIORITY_HIGHEST = Integer.MAX_VALUE;
    public static final int PRIORITY_LOWEST = Integer.MIN_VALUE;
    private final int priority;

    static {
            j01 r0 = new j01
            r0.<init>()
            p000.m01.Companion = r0
            return
    }

    public /* synthetic */ m01() {
            r1 = this;
            r0 = 50
            r1.<init>(r0)
            return
    }

    public m01(int r1) {
            r0 = this;
            r0.<init>()
            r0.priority = r1
            return
    }

    public void afterHookedMethod(p000.k01 r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public void beforeHookedMethod(p000.k01 r1) {
            r0 = this;
            r1.getClass()
            return
    }

    public final java.lang.Object dispatch$app(io.github.libxposed.api.XposedInterface.Chain r8) {
            r7 = this;
            r8.getClass()
            k01 r0 = new k01
            java.lang.reflect.Executable r1 = r8.getExecutable()
            r1.getClass()
            java.lang.Object r2 = r8.getThisObject()
            java.util.List r3 = r8.getArgs()
            r3.getClass()
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object[] r3 = r3.toArray(r5)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r7.beforeHookedMethod(r0)     // Catch: java.lang.Throwable -> L26
            goto L3b
        L26:
            r2 = move-exception
            yq0 r3 = p000.yq0.f12764
            java.lang.reflect.Executable r5 = r8.getExecutable()
            r5.getClass()
            java.lang.String r6 = "before"
            r3.m7022(r6, r5, r2)
            r0.f5696 = r4
            r0.f5694 = r1
            r0.f5695 = r1
        L3b:
            boolean r2 = r0.f5696
            if (r2 != 0) goto L4f
            java.lang.Object[] r2 = r0.f5692     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r8.proceed(r2)     // Catch: java.lang.Throwable -> L4a
            r0.f5694 = r2     // Catch: java.lang.Throwable -> L4a
            r0.f5695 = r1     // Catch: java.lang.Throwable -> L4a
            goto L4f
        L4a:
            r2 = move-exception
            r0.f5695 = r2
            r0.f5694 = r1
        L4f:
            java.lang.Object r1 = r0.f5694
            java.lang.Throwable r2 = r0.f5695
            r7.afterHookedMethod(r0)     // Catch: java.lang.Throwable -> L57
            goto L6a
        L57:
            r7 = move-exception
            yq0 r3 = p000.yq0.f12764
            java.lang.reflect.Executable r8 = r8.getExecutable()
            r8.getClass()
            java.lang.String r4 = "after"
            r3.m7022(r4, r8, r7)
            r0.f5694 = r1
            r0.f5695 = r2
        L6a:
            java.lang.Throwable r7 = r0.f5695
            if (r7 != 0) goto L71
            java.lang.Object r7 = r0.f5694
            return r7
        L71:
            throw r7
    }

    public final int getPriority$app() {
            r0 = this;
            int r0 = r0.priority
            return r0
    }
}
