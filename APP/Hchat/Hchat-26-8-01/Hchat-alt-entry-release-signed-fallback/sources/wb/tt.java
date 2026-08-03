package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class tt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fb.y f19333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19337f;

    public tt(int r1, fb.y r2, java.lang.String r3, boolean r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f19332a = r1
            r0.f19333b = r2
            r0.f19334c = r3
            r0.f19335d = r4
            r0.f19336e = r5
            r0.f19337f = r6
            return
    }

    public final boolean a() {
            r1 = this;
            boolean r0 = r1.f19336e
            return r0
    }

    public final fb.y b() {
            r1 = this;
            fb.y r0 = r1.f19333b
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.f19332a
            return r0
    }

    public final boolean d() {
            r1 = this;
            boolean r0 = r1.f19337f
            return r0
    }

    public final boolean e() {
            r1 = this;
            boolean r0 = r1.f19335d
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3d
        L3:
            boolean r0 = r3 instanceof wb.tt
            if (r0 != 0) goto L8
            goto L3b
        L8:
            wb.tt r3 = (wb.tt) r3
            int r0 = r2.f19332a
            int r1 = r3.f19332a
            if (r0 == r1) goto L11
            goto L3b
        L11:
            fb.y r0 = r2.f19333b
            fb.y r1 = r3.f19333b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L3b
        L1c:
            java.lang.String r0 = r2.f19334c
            java.lang.String r1 = r3.f19334c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L3b
        L27:
            boolean r0 = r2.f19335d
            boolean r1 = r3.f19335d
            if (r0 == r1) goto L2e
            goto L3b
        L2e:
            boolean r0 = r2.f19336e
            boolean r1 = r3.f19336e
            if (r0 == r1) goto L35
            goto L3b
        L35:
            boolean r0 = r2.f19337f
            boolean r3 = r3.f19337f
            if (r0 == r3) goto L3d
        L3b:
            r3 = 0
            return r3
        L3d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f19332a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            fb.y r2 = r3.f19333b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f19334c
            int r0 = eh.a.g(r2, r1, r0)
            boolean r2 = r3.f19335d
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f19336e
            int r0 = eh.a.h(r0, r1, r2)
            boolean r1 = r3.f19337f
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScriptPluginAgentPendingWrite(messageIndex="
            r0.<init>(r1)
            int r1 = r2.f19332a
            r0.append(r1)
            java.lang.String r1 = ", draft="
            r0.append(r1)
            fb.y r1 = r2.f19333b
            r0.append(r1)
            java.lang.String r1 = ", diff="
            r0.append(r1)
            java.lang.String r1 = r2.f19334c
            r0.append(r1)
            java.lang.String r1 = ", isNewPlugin="
            r0.append(r1)
            boolean r1 = r2.f19335d
            r0.append(r1)
            java.lang.String r1 = ", confirmsCreation="
            r0.append(r1)
            boolean r1 = r2.f19336e
            r0.append(r1)
            java.lang.String r1 = ", risky="
            r0.append(r1)
            boolean r1 = r2.f19337f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
