package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f15272c;

    public bp(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.f15270a = r1
            r0.f15271b = r2
            r0.f15272c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.bp
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.bp r5 = (wb.bp) r5
            java.lang.String r1 = r4.f15270a
            java.lang.String r3 = r5.f15270a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f15271b
            int r3 = r5.f15271b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f15272c
            java.lang.String r5 = r5.f15272c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f15270a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f15271b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r1 = r3.f15272c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", value="
            java.lang.String r1 = ", summary="
            int r2 = r5.f15271b
            java.lang.String r3 = "OptionItem(label="
            java.lang.String r4 = r5.f15270a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f15272c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
