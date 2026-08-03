package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f15605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg.l f15606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Set f15607d;

    public d4(java.lang.String r1, java.lang.String r2, fg.l r3, java.util.LinkedHashSet r4) {
            r0 = this;
            r0.<init>()
            r0.f15604a = r1
            r0.f15605b = r2
            r0.f15606c = r3
            r0.f15607d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.d4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.d4 r5 = (wb.d4) r5
            java.lang.String r1 = r4.f15604a
            java.lang.String r3 = r5.f15604a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f15605b
            java.lang.String r3 = r5.f15605b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            fg.l r1 = r4.f15606c
            fg.l r3 = r5.f15606c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.Set r1 = r4.f15607d
            java.util.Set r5 = r5.f15607d
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f15604a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f15605b
            int r0 = eh.a.g(r0, r1, r2)
            fg.l r2 = r3.f15606c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.Set r0 = r3.f15607d
            if (r0 != 0) goto L1d
            r0 = 0
            goto L21
        L1d:
            int r0 = r0.hashCode()
        L21:
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", existingValue="
            java.lang.String r1 = ", onValue="
            java.lang.String r2 = "GroupMemberPickerRequest(title="
            java.lang.String r3 = r5.f15604a
            java.lang.String r4 = r5.f15605b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            fg.l r1 = r5.f15606c
            r0.append(r1)
            java.lang.String r1 = ", allowedGroupIds="
            r0.append(r1)
            java.util.Set r1 = r5.f15607d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
