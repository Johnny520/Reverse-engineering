package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashMap f3595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f3596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f3601l;

    public j2(java.lang.String r1, java.lang.String r2, boolean r3, java.lang.String r4, java.lang.String r5, java.util.LinkedHashMap r6, java.lang.String r7, int r8, int r9, int r10, boolean r11, long r12) {
            r0 = this;
            r7.getClass()
            r0.<init>()
            r0.f3590a = r1
            r0.f3591b = r2
            r0.f3592c = r3
            r0.f3593d = r4
            r0.f3594e = r5
            r0.f3595f = r6
            r0.f3596g = r7
            r0.f3597h = r8
            r0.f3598i = r9
            r0.f3599j = r10
            r0.f3600k = r11
            r0.f3601l = r12
            return
    }

    public final long a() {
            r2 = this;
            long r0 = r2.f3601l
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L7c
        L4:
            boolean r0 = r5 instanceof fb.j2
            if (r0 != 0) goto La
            goto L7a
        La:
            fb.j2 r5 = (fb.j2) r5
            java.lang.String r0 = r4.f3590a
            java.lang.String r1 = r5.f3590a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L7a
        L18:
            java.lang.String r0 = r4.f3591b
            java.lang.String r1 = r5.f3591b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L7a
        L23:
            boolean r0 = r4.f3592c
            boolean r1 = r5.f3592c
            if (r0 == r1) goto L2a
            goto L7a
        L2a:
            java.lang.String r0 = r4.f3593d
            java.lang.String r1 = r5.f3593d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L7a
        L35:
            java.lang.String r0 = r4.f3594e
            java.lang.String r1 = r5.f3594e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L7a
        L40:
            java.util.LinkedHashMap r0 = r4.f3595f
            java.util.LinkedHashMap r1 = r5.f3595f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L7a
        L4b:
            java.lang.String r0 = r4.f3596g
            java.lang.String r1 = r5.f3596g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L56
            goto L7a
        L56:
            int r0 = r4.f3597h
            int r1 = r5.f3597h
            if (r0 == r1) goto L5d
            goto L7a
        L5d:
            int r0 = r4.f3598i
            int r1 = r5.f3598i
            if (r0 == r1) goto L64
            goto L7a
        L64:
            int r0 = r4.f3599j
            int r1 = r5.f3599j
            if (r0 == r1) goto L6b
            goto L7a
        L6b:
            boolean r0 = r4.f3600k
            boolean r1 = r5.f3600k
            if (r0 == r1) goto L72
            goto L7a
        L72:
            long r0 = r4.f3601l
            long r2 = r5.f3601l
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L7c
        L7a:
            r5 = 0
            return r5
        L7c:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3590a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3591b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f3592c
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f3593d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3594e
            int r0 = eh.a.g(r0, r1, r2)
            java.util.LinkedHashMap r2 = r3.f3595f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f3596g
            int r0 = eh.a.g(r2, r1, r0)
            int r2 = r3.f3597h
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f3598i
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f3599j
            int r0 = eh.a.e(r2, r0, r1)
            boolean r2 = r3.f3600k
            int r0 = eh.a.h(r0, r1, r2)
            long r1 = r3.f3601l
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", pluginId="
            java.lang.String r1 = ", existed="
            java.lang.String r2 = "ScriptPluginAgentWorkspaceCheckpoint(stagingPath="
            java.lang.String r3 = r5.f3590a
            java.lang.String r4 = r5.f3591b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            boolean r1 = r5.f3592c
            r0.append(r1)
            java.lang.String r1 = ", baseFingerprint="
            r0.append(r1)
            java.lang.String r1 = r5.f3593d
            r0.append(r1)
            java.lang.String r1 = ", stageFingerprint="
            r0.append(r1)
            java.lang.String r1 = r5.f3594e
            r0.append(r1)
            java.lang.String r1 = ", basePathStates="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r5.f3595f
            r0.append(r1)
            java.lang.String r1 = ", initialPluginName="
            r0.append(r1)
            java.lang.String r1 = r5.f3596g
            r0.append(r1)
            java.lang.String r1 = ", revision="
            r0.append(r1)
            int r1 = r5.f3597h
            r0.append(r1)
            java.lang.String r1 = ", checkedRevision="
            r0.append(r1)
            java.lang.String r1 = ", shownRevision="
            java.lang.String r2 = ", deletePlugin="
            int r3 = r5.f3598i
            int r4 = r5.f3599j
            wb.en.p(r0, r3, r1, r4, r2)
            boolean r1 = r5.f3600k
            r0.append(r1)
            java.lang.String r1 = ", updatedAt="
            r0.append(r1)
            long r1 = r5.f3601l
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
