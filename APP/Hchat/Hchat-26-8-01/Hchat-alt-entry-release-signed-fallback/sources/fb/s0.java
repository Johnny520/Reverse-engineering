package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f3763f;

    public s0(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r6.getClass()
            r0.<init>()
            r0.f3758a = r1
            r0.f3759b = r2
            r0.f3760c = r3
            r0.f3761d = r4
            r0.f3762e = r5
            r0.f3763f = r6
            return
    }

    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f3758a
            return r0
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f3760c
            return r0
    }

    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f3761d
            return r0
    }

    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f3759b
            return r0
    }

    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f3763f
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof fb.s0
            if (r0 != 0) goto L8
            goto L4b
        L8:
            fb.s0 r3 = (fb.s0) r3
            java.lang.String r0 = r2.f3758a
            java.lang.String r1 = r3.f3758a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            java.lang.String r0 = r2.f3759b
            java.lang.String r1 = r3.f3759b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            java.lang.String r0 = r2.f3760c
            java.lang.String r1 = r3.f3760c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            java.lang.String r0 = r2.f3761d
            java.lang.String r1 = r3.f3761d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            java.lang.String r0 = r2.f3762e
            java.lang.String r1 = r3.f3762e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.lang.String r0 = r2.f3763f
            java.lang.String r3 = r3.f3763f
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L4d
        L4b:
            r3 = 0
            return r3
        L4d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3758a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3759b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3760c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3761d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3762e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3763f
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", protocolName="
            java.lang.String r1 = ", kind="
            java.lang.String r2 = "ScriptPluginAgentNativeToolCall(id="
            java.lang.String r3 = r5.f3758a
            java.lang.String r4 = r5.f3759b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", originalName="
            java.lang.String r2 = ", arguments="
            java.lang.String r3 = r5.f3760c
            java.lang.String r4 = r5.f3761d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", providerMetadata="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f3762e
            java.lang.String r4 = r5.f3763f
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
