package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3396c;

    public a1(long r1, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f3394a = r3
            r0.f3395b = r4
            r0.f3396c = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2a
        L3:
            boolean r0 = r5 instanceof fb.a1
            if (r0 != 0) goto L8
            goto L28
        L8:
            fb.a1 r5 = (fb.a1) r5
            java.lang.String r0 = r4.f3394a
            java.lang.String r1 = r5.f3394a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L28
        L15:
            java.lang.String r0 = r4.f3395b
            java.lang.String r1 = r5.f3395b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L28
        L20:
            long r0 = r4.f3396c
            long r2 = r5.f3396c
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L2a
        L28:
            r5 = 0
            return r5
        L2a:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3394a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3395b
            int r0 = eh.a.g(r0, r1, r2)
            long r1 = r3.f3396c
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", content="
            java.lang.String r1 = ", createdAt="
            java.lang.String r2 = "ScriptPluginAgentQuotedMessage(role="
            java.lang.String r3 = r5.f3394a
            java.lang.String r4 = r5.f3395b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            long r2 = r5.f3396c
            java.lang.String r0 = eh.a.p(r0, r2, r1)
            return r0
    }
}
