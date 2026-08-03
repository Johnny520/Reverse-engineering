package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends oh.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7653c;

    public a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f7653c = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof l0.a
            if (r0 == 0) goto Le
            l0.a r2 = (l0.a) r2
            int r2 = r2.f7653c
            int r0 = r1.f7653c
            if (r2 != r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f7653c
            int r0 = r0 * 31
            return r0
    }
}
