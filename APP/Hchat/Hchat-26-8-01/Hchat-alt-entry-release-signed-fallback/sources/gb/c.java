package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f4413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f4414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4415f;

    public c(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f4410a = r1
            r0.f4411b = r2
            r0.f4412c = r3
            r0.f4413d = r4
            r0.f4414e = r5
            r0.f4415f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof gb.c
            if (r0 != 0) goto L8
            goto L47
        L8:
            gb.c r3 = (gb.c) r3
            java.lang.String r0 = r2.f4410a
            java.lang.String r1 = r3.f4410a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L47
        L15:
            java.lang.String r0 = r2.f4411b
            java.lang.String r1 = r3.f4411b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L47
        L20:
            java.lang.String r0 = r2.f4412c
            java.lang.String r1 = r3.f4412c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L47
        L2b:
            java.lang.String r0 = r2.f4413d
            java.lang.String r1 = r3.f4413d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L47
        L36:
            java.lang.String r0 = r2.f4414e
            java.lang.String r1 = r3.f4414e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L47
        L41:
            boolean r0 = r2.f4415f
            boolean r3 = r3.f4415f
            if (r0 == r3) goto L49
        L47:
            r3 = 0
            return r3
        L49:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4410a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4411b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4412c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4413d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4414e
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r3.f4415f
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", remotePluginId="
            java.lang.String r1 = ", userNickname="
            java.lang.String r2 = "PluginMarketComment(commentId="
            java.lang.String r3 = r5.f4410a
            java.lang.String r4 = r5.f4411b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", content="
            java.lang.String r2 = ", createdAt="
            java.lang.String r3 = r5.f4412c
            java.lang.String r4 = r5.f4413d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f4414e
            r0.append(r1)
            java.lang.String r1 = ", canDelete="
            r0.append(r1)
            boolean r1 = r5.f4415f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
