package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gg.m f4663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.y f4664b;

    public f1(fg.l r1, i.y r2) {
            r0 = this;
            r0.<init>()
            gg.m r1 = (gg.m) r1
            r0.f4663a = r1
            r0.f4664b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof h.f1
            if (r0 != 0) goto L8
            goto L1f
        L8:
            h.f1 r3 = (h.f1) r3
            gg.m r0 = r2.f4663a
            gg.m r1 = r3.f4663a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            i.y r0 = r2.f4664b
            i.y r3 = r3.f4664b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            gg.m r0 = r2.f4663a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            i.y r1 = r2.f4664b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Slide(slideOffset="
            r0.<init>(r1)
            gg.m r1 = r2.f4663a
            r0.append(r1)
            java.lang.String r1 = ", animationSpec="
            r0.append(r1)
            i.y r1 = r2.f4664b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
