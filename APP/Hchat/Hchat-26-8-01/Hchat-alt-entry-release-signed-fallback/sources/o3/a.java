package o3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0.p1 f9501a = null;

    static {
            r0 = 0
            java.lang.Class<androidx.lifecycle.q> r1 = androidx.lifecycle.q.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L29
            r1.getClass()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L29
            int r3 = r2.length     // Catch: java.lang.Throwable -> L29
            r4 = 0
        L1c:
            if (r4 >= r3) goto L2b
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L29
            boolean r5 = r5 instanceof sf.a     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L26
        L24:
            r1 = r0
            goto L3c
        L26:
            int r4 = r4 + 1
            goto L1c
        L29:
            r1 = move-exception
            goto L36
        L2b:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L29
            boolean r2 = r1 instanceof i0.p1     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L24
            i0.p1 r1 = (i0.p1) r1     // Catch: java.lang.Throwable -> L29
            goto L3c
        L36:
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L3c:
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            i0.p1 r0 = (i0.p1) r0
            if (r0 != 0) goto L53
            k.s1 r0 = new k.s1
            r1 = 3
            r0.<init>(r1)
            i0.m2 r1 = new i0.m2
            r1.<init>(r0)
            r0 = r1
        L53:
            o3.a.f9501a = r0
            return
    }
}
