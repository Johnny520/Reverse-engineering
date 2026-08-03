package sf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f12421g;

    public /* synthetic */ g(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f12421g = r1
            return
    }

    public static final /* synthetic */ sf.g a(java.lang.Object r1) {
            sf.g r0 = new sf.g
            r0.<init>(r1)
            return r0
    }

    public static final java.lang.Throwable b(java.lang.Object r1) {
            boolean r0 = r1 instanceof sf.f
            if (r0 == 0) goto L9
            sf.f r1 = (sf.f) r1
            java.lang.Throwable r1 = r1.f12420g
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static final boolean c(java.lang.Object r0) {
            boolean r0 = r0 instanceof sf.f
            return r0
    }

    public static final boolean d(java.lang.Object r0) {
            boolean r0 = r0 instanceof sf.f
            r0 = r0 ^ 1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof sf.g
            if (r0 != 0) goto L5
            goto L11
        L5:
            sf.g r2 = (sf.g) r2
            java.lang.Object r2 = r2.f12421g
            java.lang.Object r0 = r1.f12421g
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f12421g
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.f12421g
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto Ld
            sf.f r0 = (sf.f) r0
            java.lang.String r0 = r0.toString()
            return r0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Success("
            r1.<init>(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
