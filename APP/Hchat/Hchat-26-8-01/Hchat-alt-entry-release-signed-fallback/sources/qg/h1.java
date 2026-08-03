package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f11058a = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            qg.h1.f11058a = r0
            return
    }

    public static qg.g0 a() {
            java.lang.ThreadLocal r0 = qg.h1.f11058a
            java.lang.Object r1 = r0.get()
            qg.g0 r1 = (qg.g0) r1
            if (r1 != 0) goto L16
            qg.d r1 = new qg.d
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.<init>(r2)
            r0.set(r1)
        L16:
            return r1
    }
}
