package p2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Locale f10085a;

    public a(java.util.Locale r1) {
            r0 = this;
            r0.<init>()
            r0.f10085a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p2.a
            if (r1 != 0) goto L9
            return r0
        L9:
            if (r2 != r3) goto Ld
            r3 = 1
            return r3
        Ld:
            java.util.Locale r0 = r2.f10085a
            java.lang.String r0 = r0.toLanguageTag()
            p2.a r3 = (p2.a) r3
            java.util.Locale r3 = r3.f10085a
            java.lang.String r3 = r3.toLanguageTag()
            boolean r3 = gg.l.a(r0, r3)
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.util.Locale r0 = r1.f10085a
            java.lang.String r0 = r0.toLanguageTag()
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.util.Locale r0 = r1.f10085a
            java.lang.String r0 = r0.toLanguageTag()
            return r0
    }
}
