package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f10373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg.a f10375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f10376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fg.a f10377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fg.l f10378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fg.p f10379i;

    public i(java.lang.String r1, int r2, java.lang.String r3, int r4, fg.a r5, java.lang.String r6, fg.a r7, fg.l r8, fg.p r9) {
            r0 = this;
            r0.<init>()
            r0.f10371a = r1
            r0.f10372b = r2
            r0.f10373c = r3
            r0.f10374d = r4
            r0.f10375e = r5
            r0.f10376f = r6
            r0.f10377g = r7
            r0.f10378h = r8
            r0.f10379i = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L67
        L4:
            boolean r0 = r3 instanceof p8.i
            if (r0 != 0) goto L9
            goto L65
        L9:
            p8.i r3 = (p8.i) r3
            java.lang.String r0 = r2.f10371a
            java.lang.String r1 = r3.f10371a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            goto L65
        L16:
            int r0 = r2.f10372b
            int r1 = r3.f10372b
            if (r0 == r1) goto L1d
            goto L65
        L1d:
            java.lang.String r0 = r2.f10373c
            java.lang.String r1 = r3.f10373c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            goto L65
        L28:
            int r0 = r2.f10374d
            int r1 = r3.f10374d
            if (r0 == r1) goto L2f
            goto L65
        L2f:
            fg.a r0 = r2.f10375e
            fg.a r1 = r3.f10375e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3a
            goto L65
        L3a:
            java.lang.String r0 = r2.f10376f
            java.lang.String r1 = r3.f10376f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L45
            goto L65
        L45:
            fg.a r0 = r2.f10377g
            fg.a r1 = r3.f10377g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50
            goto L65
        L50:
            fg.l r0 = r2.f10378h
            fg.l r1 = r3.f10378h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
            goto L65
        L5b:
            fg.p r0 = r2.f10379i
            fg.p r3 = r3.f10379i
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L67
        L65:
            r3 = 0
            return r3
        L67:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10371a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f10372b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r3.f10373c
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f10374d
            int r0 = eh.a.e(r2, r0, r1)
            fg.a r2 = r3.f10375e
            if (r2 != 0) goto L21
            r2 = 0
            goto L25
        L21:
            int r2 = r2.hashCode()
        L25:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10376f
            int r0 = eh.a.g(r0, r1, r2)
            fg.a r2 = r3.f10377g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            fg.l r0 = r3.f10378h
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            fg.p r1 = r3.f10379i
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", itemId="
            java.lang.String r1 = ", title="
            int r2 = r5.f10372b
            java.lang.String r3 = "Entry(owner="
            java.lang.String r4 = r5.f10371a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = r5.f10373c
            r0.append(r1)
            java.lang.String r1 = ", order="
            r0.append(r1)
            int r1 = r5.f10374d
            r0.append(r1)
            java.lang.String r1 = ", titleProvider="
            r0.append(r1)
            fg.a r1 = r5.f10375e
            r0.append(r1)
            java.lang.String r1 = ", iconName="
            r0.append(r1)
            java.lang.String r1 = r5.f10376f
            r0.append(r1)
            java.lang.String r1 = ", isEnabled="
            r0.append(r1)
            fg.a r1 = r5.f10377g
            r0.append(r1)
            java.lang.String r1 = ", isApplicable="
            r0.append(r1)
            fg.l r1 = r5.f10378h
            r0.append(r1)
            java.lang.String r1 = ", onClick="
            r0.append(r1)
            fg.p r1 = r5.f10379i
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
