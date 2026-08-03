package v3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0.p1 f14063a = null;

    static {
            r0 = 0
            java.lang.Class<u3.c> r1 = u3.c.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalSavedStateRegistryOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L2c
            r2.getClass()     // Catch: java.lang.Throwable -> L2c
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2c
            r4 = 0
        L1f:
            if (r4 >= r3) goto L2e
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r5 instanceof sf.a     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L29
        L27:
            r1 = r0
            goto L3f
        L29:
            int r4 = r4 + 1
            goto L1f
        L2c:
            r1 = move-exception
            goto L39
        L2e:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r1 instanceof i0.p1     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L27
            i0.p1 r1 = (i0.p1) r1     // Catch: java.lang.Throwable -> L2c
            goto L3f
        L39:
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L3f:
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto L45
            goto L46
        L45:
            r0 = r1
        L46:
            i0.p1 r0 = (i0.p1) r0
            if (r0 != 0) goto L57
            k.s1 r0 = new k.s1
            r1 = 16
            r0.<init>(r1)
            i0.m2 r1 = new i0.m2
            r1.<init>(r0)
            r0 = r1
        L57:
            v3.a.f14063a = r0
            return
    }
}
