package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class st {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fb.i2 f19138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19142f;

    public st(int r1, fb.i2 r2, boolean r3, boolean r4, boolean r5, java.lang.String r6) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f19137a = r1
            r0.f19138b = r2
            r0.f19139c = r3
            r0.f19140d = r4
            r0.f19141e = r5
            r0.f19142f = r6
            return
    }

    public final boolean a() {
            r1 = this;
            boolean r0 = r1.f19140d
            return r0
    }

    public final boolean b() {
            r1 = this;
            boolean r0 = r1.f19141e
            return r0
    }

    public final boolean c() {
            r1 = this;
            boolean r0 = r1.f19139c
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3d
        L3:
            boolean r0 = r3 instanceof wb.st
            if (r0 != 0) goto L8
            goto L3b
        L8:
            wb.st r3 = (wb.st) r3
            int r0 = r2.f19137a
            int r1 = r3.f19137a
            if (r0 == r1) goto L11
            goto L3b
        L11:
            fb.i2 r0 = r2.f19138b
            fb.i2 r1 = r3.f19138b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1c
            goto L3b
        L1c:
            boolean r0 = r2.f19139c
            boolean r1 = r3.f19139c
            if (r0 == r1) goto L23
            goto L3b
        L23:
            boolean r0 = r2.f19140d
            boolean r1 = r3.f19140d
            if (r0 == r1) goto L2a
            goto L3b
        L2a:
            boolean r0 = r2.f19141e
            boolean r1 = r3.f19141e
            if (r0 == r1) goto L31
            goto L3b
        L31:
            java.lang.String r0 = r2.f19142f
            java.lang.String r3 = r3.f19142f
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L3d
        L3b:
            r3 = 0
            return r3
        L3d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f19137a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            fb.i2 r2 = r3.f19138b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f19139c
            int r0 = eh.a.h(r2, r1, r0)
            boolean r2 = r3.f19140d
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f19141e
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r1 = r3.f19142f
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScriptPluginAgentPendingWorkspaceChange(messageIndex="
            r0.<init>(r1)
            int r1 = r5.f19137a
            r0.append(r1)
            java.lang.String r1 = ", change="
            r0.append(r1)
            fb.i2 r1 = r5.f19138b
            r0.append(r1)
            java.lang.String r1 = ", isNewPlugin="
            r0.append(r1)
            java.lang.String r1 = ", hasDeletedPaths="
            java.lang.String r2 = ", risky="
            boolean r3 = r5.f19139c
            boolean r4 = r5.f19140d
            p.a.x(r0, r3, r1, r4, r2)
            boolean r1 = r5.f19141e
            r0.append(r1)
            java.lang.String r1 = ", applyError="
            r0.append(r1)
            java.lang.String r1 = r5.f19142f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
