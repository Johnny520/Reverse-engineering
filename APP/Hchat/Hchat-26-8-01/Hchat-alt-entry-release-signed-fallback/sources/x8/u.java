package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f21368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f21369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f21370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21371g;

    public u(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            r0 = this;
            j8.b.q(r1, r2, r3, r4, r5)
            r6.getClass()
            r0.<init>()
            r0.f21365a = r1
            r0.f21366b = r2
            r0.f21367c = r3
            r0.f21368d = r4
            r0.f21369e = r5
            r0.f21370f = r6
            r0.f21371g = r7
            return
    }

    public static x8.u a(x8.u r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, int r14) {
            java.lang.String r2 = r8.f21366b
            r0 = r14 & 4
            if (r0 == 0) goto L8
            java.lang.String r10 = r8.f21367c
        L8:
            r3 = r10
            r10 = r14 & 8
            if (r10 == 0) goto Lf
            java.lang.String r11 = r8.f21368d
        Lf:
            r4 = r11
            r10 = r14 & 16
            if (r10 == 0) goto L16
            java.lang.String r12 = r8.f21369e
        L16:
            r5 = r12
            java.lang.String r6 = r8.f21370f
            r10 = r14 & 64
            if (r10 == 0) goto L1f
            int r13 = r8.f21371g
        L1f:
            r7 = r13
            j8.b.q(r9, r2, r3, r4, r5)
            r6.getClass()
            x8.u r0 = new x8.u
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final x8.u b() {
            r8 = this;
            java.lang.String r0 = r8.f21365a
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L12
            java.lang.String r0 = "默认配置"
        L12:
            r2 = r0
            java.lang.String r0 = r8.f21367c
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L25
            java.lang.String r0 = "https://api.siliconflow.cn/v1"
        L25:
            r3 = r0
            java.lang.String r0 = r8.f21368d
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L38
            java.lang.String r0 = "/chat/completions"
        L38:
            r4 = r0
            java.lang.String r0 = r8.f21369e
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L4b
            java.lang.String r0 = "deepseek-ai/DeepSeek-V3"
        L4b:
            r5 = r0
            r0 = 0
            r1 = 50
            int r6 = r8.f21371g
            int r6 = r9.e0.r(r6, r0, r1)
            r7 = 34
            r1 = r8
            x8.u r0 = a(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof x8.u
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            x8.u r5 = (x8.u) r5
            java.lang.String r1 = r4.f21365a
            java.lang.String r3 = r5.f21365a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f21366b
            java.lang.String r3 = r5.f21366b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f21367c
            java.lang.String r3 = r5.f21367c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f21368d
            java.lang.String r3 = r5.f21368d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f21369e
            java.lang.String r3 = r5.f21369e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.f21370f
            java.lang.String r3 = r5.f21370f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            int r1 = r4.f21371g
            int r5 = r5.f21371g
            if (r1 == r5) goto L55
            return r2
        L55:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f21365a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f21366b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f21367c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f21368d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f21369e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f21370f
            int r0 = eh.a.g(r0, r1, r2)
            int r1 = r3.f21371g
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", apiKey="
            java.lang.String r1 = ", apiBaseUrl="
            java.lang.String r2 = "AutoReplyZhiliaConfig(name="
            java.lang.String r3 = r5.f21365a
            java.lang.String r4 = r5.f21366b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", apiPath="
            java.lang.String r2 = ", model="
            java.lang.String r3 = r5.f21367c
            java.lang.String r4 = r5.f21368d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", systemPrompt="
            java.lang.String r2 = ", contextLimit="
            java.lang.String r3 = r5.f21369e
            java.lang.String r4 = r5.f21370f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            int r2 = r5.f21371g
            java.lang.String r0 = j8.b.j(r0, r2, r1)
            return r0
    }
}
