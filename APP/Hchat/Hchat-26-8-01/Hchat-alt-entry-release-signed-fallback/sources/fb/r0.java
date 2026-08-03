package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3748e;

    public r0(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f3744a = r1
            r0.f3745b = r2
            r0.f3746c = r5
            r0.f3747d = r3
            r0.f3748e = r4
            return
    }

    public static fb.r0 a(fb.r0 r6, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, java.lang.String r11, int r12) {
            r0 = r12 & 1
            if (r0 == 0) goto L6
            java.lang.String r7 = r6.f3744a
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Ld
            java.lang.String r8 = r6.f3745b
        Ld:
            r2 = r8
            r7 = r12 & 4
            if (r7 == 0) goto L14
            boolean r9 = r6.f3746c
        L14:
            r5 = r9
            r7 = r12 & 8
            if (r7 == 0) goto L1b
            java.lang.String r10 = r6.f3747d
        L1b:
            r3 = r10
            r7 = r12 & 16
            if (r7 == 0) goto L22
            java.lang.String r11 = r6.f3748e
        L22:
            r4 = r11
            r3.getClass()
            r4.getClass()
            fb.r0 r0 = new fb.r0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean b() {
            r1 = this;
            boolean r0 = r1.f3746c
            return r0
    }

    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f3747d
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof fb.r0
            if (r0 != 0) goto L8
            goto L3c
        L8:
            fb.r0 r3 = (fb.r0) r3
            java.lang.String r0 = r2.f3744a
            java.lang.String r1 = r3.f3744a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            java.lang.String r0 = r2.f3745b
            java.lang.String r1 = r3.f3745b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            boolean r0 = r2.f3746c
            boolean r1 = r3.f3746c
            if (r0 == r1) goto L27
            goto L3c
        L27:
            java.lang.String r0 = r2.f3747d
            java.lang.String r1 = r3.f3747d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L3c
        L32:
            java.lang.String r0 = r2.f3748e
            java.lang.String r3 = r3.f3748e
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L3e
        L3c:
            r3 = 0
            return r3
        L3e:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3744a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3745b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f3746c
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f3747d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3748e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", enabled="
            java.lang.String r2 = "ScriptPluginAgentMcpServer(id="
            java.lang.String r3 = r5.f3744a
            java.lang.String r4 = r5.f3745b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            boolean r1 = r5.f3746c
            r0.append(r1)
            java.lang.String r1 = ", endpoint="
            r0.append(r1)
            java.lang.String r1 = r5.f3747d
            r0.append(r1)
            java.lang.String r1 = ", authorization="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f3748e
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
