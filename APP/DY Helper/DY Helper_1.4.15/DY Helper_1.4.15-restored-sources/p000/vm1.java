package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class vm1 {

    /* JADX INFO: renamed from: α */
    public static final p000.wm1 f11350 = null;

    static {
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> Le
            wm1 r1 = (p000.wm1) r1     // Catch: java.lang.Throwable -> Le
            r0 = r1
        Le:
            if (r0 == 0) goto L11
            goto L16
        L11:
            wm1 r0 = new wm1
            r0.<init>()
        L16:
            p000.vm1.f11350 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C0945wf m6272(java.lang.Class r1) {
            wm1 r0 = p000.vm1.f11350
            r0.getClass()
            wf r0 = new wf
            r0.<init>(r1)
            return r0
    }
}
