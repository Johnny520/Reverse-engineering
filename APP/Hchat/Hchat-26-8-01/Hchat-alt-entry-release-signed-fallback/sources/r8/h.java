package r8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f11629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f11630b;

    public h() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11629a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11630b = r0
            return
    }

    public static java.lang.String b(r8.f r2) {
            java.lang.String r0 = r2.name()     // Catch: java.lang.Throwable -> L14
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L13
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L14
            return r2
        L13:
            return r0
        L14:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            return r2
    }

    public final void a(r8.f r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f11629a
            r0.add(r2)
            return
    }
}
