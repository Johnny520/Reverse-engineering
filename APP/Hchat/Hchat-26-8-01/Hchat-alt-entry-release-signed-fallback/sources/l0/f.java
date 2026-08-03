package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends oh.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oh.h f7664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7665d;

    public f(oh.h r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f7664c = r1
            r0.f7665d = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof l0.f
            if (r0 == 0) goto L18
            l0.f r3 = (l0.f) r3
            oh.h r0 = r3.f7664c
            oh.h r1 = r2.f7664c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            int r3 = r3.f7665d
            int r0 = r2.f7665d
            if (r3 != r0) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f7665d
            int r0 = r0 * 31
            oh.h r1 = r2.f7664c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
