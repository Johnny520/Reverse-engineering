package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb.a f15601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.c3 f15602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f15603c;

    public d3(vb.a r1, wb.c3 r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f15601a = r1
            r0.f15602b = r2
            r0.f15603c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof wb.d3
            if (r0 != 0) goto L8
            goto L2a
        L8:
            wb.d3 r3 = (wb.d3) r3
            vb.a r0 = r2.f15601a
            vb.a r1 = r3.f15601a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            wb.c3 r0 = r2.f15602b
            wb.c3 r1 = r3.f15602b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r0 = r2.f15603c
            java.lang.String r3 = r3.f15603c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            vb.a r0 = r2.f15601a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            wb.c3 r1 = r2.f15602b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f15603c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FeatureSearchResult(provider="
            r0.<init>(r1)
            vb.a r1 = r3.f15601a
            r0.append(r1)
            java.lang.String r1 = ", group="
            r0.append(r1)
            wb.c3 r1 = r3.f15602b
            r0.append(r1)
            java.lang.String r1 = ", summary="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f15603c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
