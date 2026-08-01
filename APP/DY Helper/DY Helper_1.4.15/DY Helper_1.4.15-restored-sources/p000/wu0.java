package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wu0 {

    /* JADX INFO: renamed from: α */
    public static final p000.ak1 f11867 = null;

    static {
            r0 = 0
            java.lang.Class<hr0> r1 = p000.hr0.class
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
            boolean r5 = r5 instanceof p000.InterfaceC0088bs     // Catch: java.lang.Throwable -> L29
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
            boolean r2 = r1 instanceof p000.ak1     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L24
            ak1 r1 = (p000.ak1) r1     // Catch: java.lang.Throwable -> L29
            goto L3c
        L36:
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L3c:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = r1
        L42:
            ak1 r0 = (p000.ak1) r0
            if (r0 != 0) goto L52
            kt0 r0 = new kt0
            r1 = 5
            r0.<init>(r1)
            m02 r1 = new m02
            r1.<init>(r0)
            r0 = r1
        L52:
            p000.wu0.f11867 = r0
            return
    }
}
