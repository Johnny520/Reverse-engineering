package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class qt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f18733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f18734c;

    public qt(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f18732a = r1
            r0.f18733b = r2
            r0.f18734c = r3
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.f18732a
            return r0
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f18733b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof wb.qt
            if (r0 != 0) goto L8
            goto L26
        L8:
            wb.qt r3 = (wb.qt) r3
            int r0 = r2.f18732a
            int r1 = r3.f18732a
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f18733b
            java.lang.String r1 = r3.f18733b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r0 = r2.f18734c
            java.lang.String r3 = r3.f18734c
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f18732a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f18733b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f18734c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScriptPluginAgentPendingDelete(messageIndex="
            r0.<init>(r1)
            int r1 = r3.f18732a
            r0.append(r1)
            java.lang.String r1 = ", pluginId="
            r0.append(r1)
            java.lang.String r1 = r3.f18733b
            r0.append(r1)
            java.lang.String r1 = ", pluginName="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f18734c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
