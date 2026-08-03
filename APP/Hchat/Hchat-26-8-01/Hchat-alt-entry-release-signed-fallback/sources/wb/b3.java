package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f15147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg.l f15148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f15150e;

    public b3(java.lang.String r1, java.lang.String r2, fg.l r3, boolean r4, java.lang.String r5) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f15146a = r1
            r0.f15147b = r2
            r0.f15148c = r3
            r0.f15149d = r4
            r0.f15150e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof wb.b3
            if (r0 != 0) goto L8
            goto L3c
        L8:
            wb.b3 r3 = (wb.b3) r3
            java.lang.String r0 = r2.f15146a
            java.lang.String r1 = r3.f15146a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            java.lang.String r0 = r2.f15147b
            java.lang.String r1 = r3.f15147b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            fg.l r0 = r2.f15148c
            fg.l r1 = r3.f15148c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L3c
        L2b:
            boolean r0 = r2.f15149d
            boolean r1 = r3.f15149d
            if (r0 == r1) goto L32
            goto L3c
        L32:
            java.lang.String r0 = r2.f15150e
            java.lang.String r3 = r3.f15150e
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L3e
        L3c:
            r3 = 0
            return r3
        L3e:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f15146a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f15147b
            int r0 = eh.a.g(r0, r1, r2)
            fg.l r2 = r3.f15148c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f15149d
            int r0 = eh.a.h(r2, r1, r0)
            java.lang.String r1 = r3.f15150e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", existingValue="
            java.lang.String r1 = ", onValue="
            java.lang.String r2 = "FavoritePickerRequest(title="
            java.lang.String r3 = r5.f15146a
            java.lang.String r4 = r5.f15147b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            fg.l r1 = r5.f15148c
            r0.append(r1)
            java.lang.String r1 = ", multiSelect="
            r0.append(r1)
            boolean r1 = r5.f15149d
            r0.append(r1)
            java.lang.String r1 = ", delimiter="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f15150e
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
