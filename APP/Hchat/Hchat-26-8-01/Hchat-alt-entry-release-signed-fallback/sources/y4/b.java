package y4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f22289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f22290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.ClassLoader f22291c;

    public b(java.lang.Class r1, java.util.ArrayList r2, java.lang.ClassLoader r3) {
            r0 = this;
            r0.<init>()
            r0.f22289a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r0.f22290b = r1
            r0.f22291c = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r4 == 0) goto L28
            java.lang.Class<y4.b> r1 = y4.b.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto Lf
            goto L28
        Lf:
            y4.b r4 = (y4.b) r4
            java.lang.Class r1 = r3.f22289a
            java.lang.Class r2 = r4.f22289a
            if (r1 != r2) goto L28
            java.util.ArrayList r1 = r3.f22290b
            java.util.ArrayList r2 = r4.f22290b
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L28
            java.lang.ClassLoader r1 = r3.f22291c
            java.lang.ClassLoader r4 = r4.f22291c
            if (r1 != r4) goto L28
            return r0
        L28:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.f22289a
            int r0 = r0.hashCode()
            java.util.ArrayList r1 = r2.f22290b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            java.lang.ClassLoader r0 = r2.f22291c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
