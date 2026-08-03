package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f3827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f3831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f3832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f3833k;

    public v(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.List r5, boolean r6, int r7, boolean r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.f3823a = r1
            r0.f3824b = r2
            r0.f3825c = r3
            r0.f3826d = r4
            r0.f3827e = r5
            r0.f3828f = r6
            r0.f3829g = r7
            r0.f3830h = r8
            r0.f3831i = r9
            r0.f3832j = r10
            r0.f3833k = r11
            return
    }

    public static fb.v a(fb.v r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.ArrayList r18, int r19, boolean r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24) {
            r0 = r24
            r1 = r0 & 1
            if (r1 == 0) goto La
            java.lang.String r1 = r14.f3823a
            r3 = r1
            goto Lb
        La:
            r3 = r15
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L13
            java.lang.String r1 = r14.f3824b
        L11:
            r4 = r1
            goto L16
        L13:
            java.lang.String r1 = ""
            goto L11
        L16:
            r1 = r0 & 4
            if (r1 == 0) goto L1e
            java.lang.String r1 = r14.f3825c
            r5 = r1
            goto L20
        L1e:
            r5 = r16
        L20:
            r1 = r0 & 8
            if (r1 == 0) goto L28
            java.lang.String r1 = r14.f3826d
            r6 = r1
            goto L2a
        L28:
            r6 = r17
        L2a:
            r1 = r0 & 16
            if (r1 == 0) goto L32
            java.util.List r1 = r14.f3827e
            r7 = r1
            goto L34
        L32:
            r7 = r18
        L34:
            boolean r8 = r14.f3828f
            r1 = r0 & 64
            if (r1 == 0) goto L3e
            int r1 = r14.f3829g
            r9 = r1
            goto L40
        L3e:
            r9 = r19
        L40:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L48
            boolean r1 = r14.f3830h
            r10 = r1
            goto L4a
        L48:
            r10 = r20
        L4a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L52
            java.lang.String r1 = r14.f3831i
            r11 = r1
            goto L54
        L52:
            r11 = r21
        L54:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L5c
            java.lang.String r1 = r14.f3832j
            r12 = r1
            goto L5e
        L5c:
            r12 = r22
        L5e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L66
            java.lang.String r14 = r14.f3833k
            r13 = r14
            goto L68
        L66:
            r13 = r23
        L68:
            r3.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            fb.v r2 = new fb.v
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r2
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f3825c
            return r0
    }

    public final boolean c() {
            r1 = this;
            boolean r0 = r1.f3828f
            return r0
    }

    public final int d() {
            r1 = this;
            int r0 = r1.f3829g
            return r0
    }

    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f3833k
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L7b
        L4:
            boolean r0 = r3 instanceof fb.v
            if (r0 != 0) goto La
            goto L79
        La:
            fb.v r3 = (fb.v) r3
            java.lang.String r0 = r2.f3823a
            java.lang.String r1 = r3.f3823a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L18
            goto L79
        L18:
            java.lang.String r0 = r2.f3824b
            java.lang.String r1 = r3.f3824b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L79
        L23:
            java.lang.String r0 = r2.f3825c
            java.lang.String r1 = r3.f3825c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2e
            goto L79
        L2e:
            java.lang.String r0 = r2.f3826d
            java.lang.String r1 = r3.f3826d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L39
            goto L79
        L39:
            java.util.List r0 = r2.f3827e
            java.util.List r1 = r3.f3827e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L44
            goto L79
        L44:
            boolean r0 = r2.f3828f
            boolean r1 = r3.f3828f
            if (r0 == r1) goto L4b
            goto L79
        L4b:
            int r0 = r2.f3829g
            int r1 = r3.f3829g
            if (r0 == r1) goto L52
            goto L79
        L52:
            boolean r0 = r2.f3830h
            boolean r1 = r3.f3830h
            if (r0 == r1) goto L59
            goto L79
        L59:
            java.lang.String r0 = r2.f3831i
            java.lang.String r1 = r3.f3831i
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L64
            goto L79
        L64:
            java.lang.String r0 = r2.f3832j
            java.lang.String r1 = r3.f3832j
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L6f
            goto L79
        L6f:
            java.lang.String r0 = r2.f3833k
            java.lang.String r3 = r3.f3833k
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L7b
        L79:
            r3 = 0
            return r3
        L7b:
            r3 = 1
            return r3
    }

    public final java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f3832j
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3823a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3824b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3825c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3826d
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r2 = r3.f3827e
            int r0 = j8.b.e(r2, r0, r1)
            boolean r2 = r3.f3828f
            int r0 = eh.a.h(r0, r1, r2)
            int r2 = r3.f3829g
            int r0 = eh.a.e(r2, r0, r1)
            boolean r2 = r3.f3830h
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f3831i
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3832j
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3833k
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", apiPath="
            java.lang.String r1 = ", apiKey="
            java.lang.String r2 = "ScriptPluginAgentConfig(apiBaseUrl="
            java.lang.String r3 = r5.f3823a
            java.lang.String r4 = r5.f3824b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", model="
            java.lang.String r2 = ", mcpServers="
            java.lang.String r3 = r5.f3825c
            java.lang.String r4 = r5.f3826d
            j8.b.t(r0, r3, r1, r4, r2)
            java.util.List r1 = r5.f3827e
            r0.append(r1)
            java.lang.String r1 = ", autoCompactEnabled="
            r0.append(r1)
            boolean r1 = r5.f3828f
            r0.append(r1)
            java.lang.String r1 = ", compactTokenThreshold="
            r0.append(r1)
            int r1 = r5.f3829g
            r0.append(r1)
            java.lang.String r1 = ", webSearchEnabled="
            r0.append(r1)
            boolean r1 = r5.f3830h
            r0.append(r1)
            java.lang.String r1 = ", workspaceWriteApprovalMode="
            r0.append(r1)
            java.lang.String r1 = ", promptCacheMode="
            java.lang.String r2 = ", endpointMode="
            java.lang.String r3 = r5.f3831i
            java.lang.String r4 = r5.f3832j
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f3833k
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
