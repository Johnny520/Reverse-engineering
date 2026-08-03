package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fb.j2 f3453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3456h;

    public /* synthetic */ c1(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, fb.j2 r18, long r19, long r21, int r23) {
            r13 = this;
            r0 = r23 & 4
            java.lang.String r1 = ""
            if (r0 == 0) goto L8
            r5 = r1
            goto La
        L8:
            r5 = r16
        La:
            r0 = r23 & 8
            if (r0 == 0) goto L10
            r6 = r1
            goto L12
        L10:
            r6 = r17
        L12:
            r0 = r23 & 16
            if (r0 == 0) goto L19
            r0 = 0
            r7 = r0
            goto L1b
        L19:
            r7 = r18
        L1b:
            r8 = 1
            r2 = r13
            r3 = r14
            r4 = r15
            r9 = r19
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11)
            return
    }

    public c1(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, fb.j2 r5, boolean r6, long r7, long r9) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f3449a = r1
            r0.f3450b = r2
            r0.f3451c = r3
            r0.f3452d = r4
            r0.f3453e = r5
            r0.f3454f = r6
            r0.f3455g = r7
            r0.f3456h = r9
            return
    }

    public static fb.c1 a(fb.c1 r11, java.lang.String r12, java.lang.String r13, boolean r14, long r15, int r17) {
            r0 = r17 & 1
            if (r0 == 0) goto L6
            java.lang.String r12 = r11.f3449a
        L6:
            r1 = r12
            r12 = r17 & 2
            if (r12 == 0) goto Ld
            java.lang.String r13 = r11.f3450b
        Ld:
            r2 = r13
            java.lang.String r3 = r11.f3451c
            java.lang.String r4 = r11.f3452d
            fb.j2 r5 = r11.f3453e
            long r7 = r11.f3455g
            r11.getClass()
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            fb.c1 r0 = new fb.c1
            r6 = r14
            r9 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof fb.c1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.c1 r8 = (fb.c1) r8
            java.lang.String r1 = r7.f3449a
            java.lang.String r3 = r8.f3449a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f3450b
            java.lang.String r3 = r8.f3450b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f3451c
            java.lang.String r3 = r8.f3451c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.f3452d
            java.lang.String r3 = r8.f3452d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            fb.j2 r1 = r7.f3453e
            fb.j2 r3 = r8.f3453e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            boolean r1 = r7.f3454f
            boolean r3 = r8.f3454f
            if (r1 == r3) goto L4a
            return r2
        L4a:
            long r3 = r7.f3455g
            long r5 = r8.f3455g
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L53
            return r2
        L53:
            long r3 = r7.f3456h
            long r5 = r8.f3456h
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L5c
            return r2
        L5c:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f3449a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f3450b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f3451c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f3452d
            int r0 = eh.a.g(r0, r1, r2)
            fb.j2 r2 = r4.f3453e
            if (r2 != 0) goto L21
            r2 = 0
            goto L25
        L21:
            int r2 = r2.hashCode()
        L25:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r4.f3454f
            int r0 = eh.a.h(r0, r1, r2)
            long r2 = r4.f3455g
            int r0 = eh.a.f(r0, r1, r2)
            long r1 = r4.f3456h
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", sourceUserMessageId="
            java.lang.String r1 = ", taskGoal="
            java.lang.String r2 = "ScriptPluginAgentResumeState(turnId="
            java.lang.String r3 = r5.f3449a
            java.lang.String r4 = r5.f3450b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", workContext="
            java.lang.String r2 = ", workspaceCheckpoint="
            java.lang.String r3 = r5.f3451c
            java.lang.String r4 = r5.f3452d
            j8.b.t(r0, r3, r1, r4, r2)
            fb.j2 r1 = r5.f3453e
            r0.append(r1)
            java.lang.String r1 = ", autoOpen="
            r0.append(r1)
            boolean r1 = r5.f3454f
            r0.append(r1)
            java.lang.String r1 = ", startedAt="
            r0.append(r1)
            long r1 = r5.f3455g
            r0.append(r1)
            java.lang.String r1 = ", updatedAt="
            r0.append(r1)
            long r1 = r5.f3456h
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
