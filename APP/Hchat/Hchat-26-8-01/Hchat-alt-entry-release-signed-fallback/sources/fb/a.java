package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3390e;

    public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.f3386a = r1
            r0.f3387b = r2
            r0.f3388c = r3
            r0.f3389d = r5
            r0.f3390e = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L40
        L3:
            boolean r0 = r5 instanceof fb.a
            if (r0 != 0) goto L8
            goto L3e
        L8:
            fb.a r5 = (fb.a) r5
            java.lang.String r0 = r4.f3386a
            java.lang.String r1 = r5.f3386a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3e
        L15:
            java.lang.String r0 = r4.f3387b
            java.lang.String r1 = r5.f3387b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3e
        L20:
            java.lang.String r0 = r4.f3388c
            java.lang.String r1 = r5.f3388c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L3e
        L2b:
            long r0 = r4.f3389d
            long r2 = r5.f3389d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L34
            goto L3e
        L34:
            java.lang.String r0 = r4.f3390e
            java.lang.String r5 = r5.f3390e
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L40
        L3e:
            r5 = 0
            return r5
        L40:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f3386a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f3387b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f3388c
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f3389d
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r1 = r4.f3390e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", path="
            java.lang.String r1 = ", mimeType="
            java.lang.String r2 = "ScriptPluginAgentAttachment(name="
            java.lang.String r3 = r5.f3386a
            java.lang.String r4 = r5.f3387b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f3388c
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r5.f3389d
            r0.append(r1)
            java.lang.String r1 = ", sourceUri="
            r0.append(r1)
            java.lang.String r1 = r5.f3390e
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
