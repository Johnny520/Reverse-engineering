package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gg.w f4565a = null;

    static {
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> Le
            gg.w r1 = (gg.w) r1     // Catch: java.lang.Throwable -> Le
            r0 = r1
        Le:
            if (r0 == 0) goto L11
            goto L16
        L11:
            gg.w r0 = new gg.w
            r0.<init>()
        L16:
            gg.v.f4565a = r0
            return
    }

    public static gg.f a(java.lang.Class r1) {
            gg.w r0 = gg.v.f4565a
            r0.getClass()
            gg.f r0 = new gg.f
            r0.<init>(r1)
            return r0
    }
}
