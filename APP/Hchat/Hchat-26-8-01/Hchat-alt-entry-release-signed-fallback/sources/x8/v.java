package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f21375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f21376e;

    public v(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f21372a = r1
            r0.f21373b = r2
            r0.f21374c = r3
            r0.f21375d = r4
            r0.f21376e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof x8.v
            if (r0 != 0) goto L8
            goto L40
        L8:
            x8.v r3 = (x8.v) r3
            java.lang.String r0 = r2.f21372a
            java.lang.String r1 = r3.f21372a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.String r0 = r2.f21373b
            java.lang.String r1 = r3.f21373b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.lang.String r0 = r2.f21374c
            java.lang.String r1 = r3.f21374c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.lang.String r0 = r2.f21375d
            java.lang.String r1 = r3.f21375d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.lang.String r0 = r2.f21376e
            java.lang.String r3 = r3.f21376e
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L42
        L40:
            r3 = 0
            return r3
        L42:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f21372a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f21373b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f21374c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f21375d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f21376e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", assistantName="
            java.lang.String r2 = "XiaozhiAgentOption(id="
            java.lang.String r3 = r5.f21372a
            java.lang.String r4 = r5.f21373b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", model="
            java.lang.String r2 = ", voice="
            java.lang.String r3 = r5.f21374c
            java.lang.String r4 = r5.f21375d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f21376e
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
