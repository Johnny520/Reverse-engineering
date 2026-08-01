package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class yu0 {

    /* JADX INFO: renamed from: α */
    public static final p000.ak1 f12796 = null;

    static {
            r0 = 0
            java.lang.Class<kq1> r1 = p000.kq1.class
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
            boolean r5 = r5 instanceof p000.InterfaceC0088bs     // Catch: java.lang.Throwable -> L2c
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
            boolean r2 = r1 instanceof p000.ak1     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L27
            ak1 r1 = (p000.ak1) r1     // Catch: java.lang.Throwable -> L2c
            goto L3f
        L39:
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L3f:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            ak1 r0 = (p000.ak1) r0
            if (r0 != 0) goto L55
            kt0 r0 = new kt0
            r1 = 7
            r0.<init>(r1)
            m02 r1 = new m02
            r1.<init>(r0)
            r0 = r1
        L55:
            p000.yu0.f12796 = r0
            return
    }
}
