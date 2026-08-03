package d3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3.b f1972a;

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            android.os.LocaleList r1 = new android.os.LocaleList
            r1.<init>(r0)
            return
    }

    public a(d3.b r1) {
            r0 = this;
            r0.<init>()
            r0.f1972a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof d3.a
            if (r0 == 0) goto L12
            d3.a r2 = (d3.a) r2
            d3.b r2 = r2.f1972a
            d3.b r0 = r1.f1972a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            d3.b r0 = r1.f1972a
            android.os.LocaleList r0 = r0.f1973a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            d3.b r0 = r1.f1972a
            android.os.LocaleList r0 = r0.f1973a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
