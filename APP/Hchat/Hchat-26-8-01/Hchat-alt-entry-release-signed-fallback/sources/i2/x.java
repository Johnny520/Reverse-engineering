package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.w f6404a;

    public x(i2.w r1) {
            r0 = this;
            r0.<init>()
            r0.f6404a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof i2.x
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i2.x r4 = (i2.x) r4
            i2.w r4 = r4.f6404a
            i2.w r1 = r3.f6404a
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            i2.w r0 = r1.f6404a
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlatformTextStyle(spanStyle=null, paragraphSyle="
            r0.<init>(r1)
            i2.w r1 = r2.f6404a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
