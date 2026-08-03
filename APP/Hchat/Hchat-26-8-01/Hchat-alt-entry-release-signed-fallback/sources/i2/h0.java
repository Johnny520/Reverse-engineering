package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements i2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6322a;

    public /* synthetic */ h0(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f6322a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i2.h0
            if (r0 != 0) goto L5
            goto L11
        L5:
            i2.h0 r2 = (i2.h0) r2
            java.lang.String r2 = r2.f6322a
            java.lang.String r0 = r1.f6322a
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
            java.lang.String r0 = r1.f6322a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StringAnnotation(value="
            r0.<init>(r1)
            java.lang.String r1 = r2.f6322a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
