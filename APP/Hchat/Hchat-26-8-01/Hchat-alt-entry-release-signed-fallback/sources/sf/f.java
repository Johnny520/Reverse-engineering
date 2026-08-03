package sf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Throwable f12420g;

    public f(java.lang.Throwable r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f12420g = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L12
            sf.f r2 = (sf.f) r2
            java.lang.Throwable r2 = r2.f12420g
            java.lang.Throwable r0 = r1.f12420g
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Throwable r0 = r1.f12420g
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failure("
            r0.<init>(r1)
            java.lang.Throwable r1 = r2.f12420g
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
