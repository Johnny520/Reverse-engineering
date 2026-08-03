package ua;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f13599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f13600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f13601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f13602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f13605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f13606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f13607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f13608j;

    public d(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, int r6, double r7, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.f13599a = r1
            r0.f13600b = r2
            r0.f13601c = r3
            r0.f13602d = r4
            r0.f13603e = r5
            r0.f13604f = r6
            r0.f13605g = r7
            r0.f13606h = r9
            r0.f13607i = r10
            r0.f13608j = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L73
        L4:
            boolean r0 = r5 instanceof ua.d
            if (r0 != 0) goto La
            goto L71
        La:
            ua.d r5 = (ua.d) r5
            java.lang.String r0 = r4.f13599a
            java.lang.String r1 = r5.f13599a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L71
        L17:
            java.lang.String r0 = r4.f13600b
            java.lang.String r1 = r5.f13600b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L71
        L22:
            java.lang.String r0 = r4.f13601c
            java.lang.String r1 = r5.f13601c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L71
        L2d:
            java.lang.String r0 = r4.f13602d
            java.lang.String r1 = r5.f13602d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L71
        L38:
            int r0 = r4.f13603e
            int r1 = r5.f13603e
            if (r0 == r1) goto L3f
            goto L71
        L3f:
            int r0 = r4.f13604f
            int r1 = r5.f13604f
            if (r0 == r1) goto L46
            goto L71
        L46:
            double r0 = r4.f13605g
            double r2 = r5.f13605g
            int r0 = java.lang.Double.compare(r0, r2)
            if (r0 == 0) goto L51
            goto L71
        L51:
            java.lang.String r0 = r4.f13606h
            java.lang.String r1 = r5.f13606h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5c
            goto L71
        L5c:
            java.lang.String r0 = r4.f13607i
            java.lang.String r1 = r5.f13607i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            goto L71
        L67:
            java.lang.String r0 = r4.f13608j
            java.lang.String r5 = r5.f13608j
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L73
        L71:
            r5 = 0
            return r5
        L73:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f13599a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f13600b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f13601c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f13602d
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r4.f13603e
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r4.f13604f
            int r0 = eh.a.e(r2, r0, r1)
            double r2 = r4.f13605g
            int r2 = java.lang.Double.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r4.f13606h
            int r0 = eh.a.g(r2, r1, r0)
            java.lang.String r2 = r4.f13607i
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r4.f13608j
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", transId="
            java.lang.String r1 = ", payerUsername="
            java.lang.String r2 = "TransferMessageInfo(transactionId="
            java.lang.String r3 = r5.f13599a
            java.lang.String r4 = r5.f13600b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", receiverUsername="
            java.lang.String r2 = ", invalidTime="
            java.lang.String r3 = r5.f13601c
            java.lang.String r4 = r5.f13602d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", totalFee="
            java.lang.String r2 = ", amount="
            int r3 = r5.f13603e
            int r4 = r5.f13604f
            wb.en.p(r0, r3, r1, r4, r2)
            double r1 = r5.f13605g
            r0.append(r1)
            java.lang.String r1 = ", paySubtype="
            r0.append(r1)
            java.lang.String r1 = r5.f13606h
            r0.append(r1)
            java.lang.String r1 = ", transferAttach="
            java.lang.String r2 = ", rawXml="
            java.lang.String r3 = r5.f13607i
            java.lang.String r4 = r5.f13608j
            j8.b.t(r0, r1, r3, r2, r4)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
