package q9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f10760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f10763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f10764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f10765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f10766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f10767i;

    public g(java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.f10759a = r1
            r0.f10760b = r2
            r0.f10761c = r3
            r0.f10762d = r4
            r0.f10763e = r5
            r0.f10764f = r6
            r0.f10765g = r7
            r0.f10766h = r8
            r0.f10767i = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L67
        L4:
            boolean r0 = r3 instanceof q9.g
            if (r0 != 0) goto L9
            goto L65
        L9:
            q9.g r3 = (q9.g) r3
            java.lang.String r0 = r2.f10759a
            java.lang.String r1 = r3.f10759a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            goto L65
        L16:
            java.lang.String r0 = r2.f10760b
            java.lang.String r1 = r3.f10760b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L65
        L21:
            boolean r0 = r2.f10761c
            boolean r1 = r3.f10761c
            if (r0 == r1) goto L28
            goto L65
        L28:
            int r0 = r2.f10762d
            int r1 = r3.f10762d
            if (r0 == r1) goto L2f
            goto L65
        L2f:
            java.lang.String r0 = r2.f10763e
            java.lang.String r1 = r3.f10763e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a
            goto L65
        L3a:
            java.lang.String r0 = r2.f10764f
            java.lang.String r1 = r3.f10764f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L45
            goto L65
        L45:
            java.lang.String r0 = r2.f10765g
            java.lang.String r1 = r3.f10765g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50
            goto L65
        L50:
            java.lang.String r0 = r2.f10766h
            java.lang.String r1 = r3.f10766h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
            goto L65
        L5b:
            java.lang.String r0 = r2.f10767i
            java.lang.String r3 = r3.f10767i
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
            java.lang.String r0 = r3.f10759a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10760b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f10761c
            int r0 = eh.a.h(r0, r1, r2)
            int r2 = r3.f10762d
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r3.f10763e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10764f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10765g
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10766h
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f10767i
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", enabled="
            java.lang.String r2 = "GroupRenameReplyTemplate(id="
            java.lang.String r3 = r5.f10759a
            java.lang.String r4 = r5.f10760b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            boolean r1 = r5.f10761c
            r0.append(r1)
            java.lang.String r1 = ", delaySeconds="
            r0.append(r1)
            int r1 = r5.f10762d
            r0.append(r1)
            java.lang.String r1 = ", promptType="
            r0.append(r1)
            java.lang.String r1 = ", bothOrder="
            java.lang.String r2 = ", text="
            java.lang.String r3 = r5.f10763e
            java.lang.String r4 = r5.f10764f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", cardTitle="
            java.lang.String r2 = ", cardDesc="
            java.lang.String r3 = r5.f10765g
            java.lang.String r4 = r5.f10766h
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f10767i
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
