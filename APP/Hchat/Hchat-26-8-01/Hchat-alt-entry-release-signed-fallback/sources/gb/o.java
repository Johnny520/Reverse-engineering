package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f4452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f4453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f4454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f4455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f4457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f4459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.List f4460l;

    public o(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, long r10, long r12, java.lang.String r14, java.util.List r15) {
            r0 = this;
            r0.<init>()
            r0.f4449a = r1
            r0.f4450b = r2
            r0.f4451c = r3
            r0.f4452d = r4
            r0.f4453e = r5
            r0.f4454f = r6
            r0.f4455g = r7
            r0.f4456h = r8
            r0.f4457i = r10
            r0.f4458j = r12
            r0.f4459k = r14
            r0.f4460l = r15
            return
    }

    public static gb.o a(gb.o r18, long r19, long r21, long r23, int r25) {
            r0 = r18
            r1 = r25
            java.lang.String r2 = r0.f4449a
            r3 = r2
            java.lang.String r2 = r0.f4450b
            r4 = r3
            java.lang.String r3 = r0.f4451c
            r5 = r4
            java.lang.String r4 = r0.f4452d
            r6 = r5
            java.lang.String r5 = r0.f4453e
            r7 = r6
            java.lang.String r6 = r0.f4454f
            r8 = r7
            java.lang.String r7 = r0.f4455g
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L1f
            long r9 = r0.f4456h
            goto L21
        L1f:
            r9 = r19
        L21:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L28
            long r11 = r0.f4457i
            goto L2a
        L28:
            r11 = r21
        L2a:
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L31
            long r13 = r0.f4458j
            goto L33
        L31:
            r13 = r23
        L33:
            java.lang.String r1 = r0.f4459k
            java.util.List r15 = r0.f4460l
            r0.getClass()
            gb.o r0 = new gb.o
            r16 = r13
            r14 = r1
            r1 = r8
            r8 = r9
            r10 = r11
            r12 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L8d
        L4:
            boolean r0 = r5 instanceof gb.o
            if (r0 != 0) goto La
            goto L8b
        La:
            gb.o r5 = (gb.o) r5
            java.lang.String r0 = r4.f4449a
            java.lang.String r1 = r5.f4449a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L8b
        L18:
            java.lang.String r0 = r4.f4450b
            java.lang.String r1 = r5.f4450b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L8b
        L24:
            java.lang.String r0 = r4.f4451c
            java.lang.String r1 = r5.f4451c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2f
            goto L8b
        L2f:
            java.lang.String r0 = r4.f4452d
            java.lang.String r1 = r5.f4452d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a
            goto L8b
        L3a:
            java.lang.String r0 = r4.f4453e
            java.lang.String r1 = r5.f4453e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L45
            goto L8b
        L45:
            java.lang.String r0 = r4.f4454f
            java.lang.String r1 = r5.f4454f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50
            goto L8b
        L50:
            java.lang.String r0 = r4.f4455g
            java.lang.String r1 = r5.f4455g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
            goto L8b
        L5b:
            long r0 = r4.f4456h
            long r2 = r5.f4456h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L64
            goto L8b
        L64:
            long r0 = r4.f4457i
            long r2 = r5.f4457i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L6d
            goto L8b
        L6d:
            long r0 = r4.f4458j
            long r2 = r5.f4458j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L76
            goto L8b
        L76:
            java.lang.String r0 = r4.f4459k
            java.lang.String r1 = r5.f4459k
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L81
            goto L8b
        L81:
            java.util.List r0 = r4.f4460l
            java.util.List r5 = r5.f4460l
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L8d
        L8b:
            r5 = 0
            return r5
        L8d:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f4449a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f4450b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f4451c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f4452d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f4453e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f4454f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f4455g
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f4456h
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f4457i
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f4458j
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.f4459k
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r1 = r4.f4460l
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", sourcePluginId="
            java.lang.String r1 = ", name="
            java.lang.String r2 = "PluginMarketPlugin(remotePluginId="
            java.lang.String r3 = r5.f4449a
            java.lang.String r4 = r5.f4450b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", author="
            java.lang.String r2 = ", version="
            java.lang.String r3 = r5.f4451c
            java.lang.String r4 = r5.f4452d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", versionId="
            java.lang.String r2 = ", updateTime="
            java.lang.String r3 = r5.f4453e
            java.lang.String r4 = r5.f4454f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f4455g
            r0.append(r1)
            java.lang.String r1 = ", downloadCount="
            r0.append(r1)
            long r1 = r5.f4456h
            r0.append(r1)
            java.lang.String r1 = ", likeCount="
            java.lang.String r2 = ", commentCount="
            long r3 = r5.f4457i
            j8.b.s(r0, r1, r3, r2)
            long r1 = r5.f4458j
            r0.append(r1)
            java.lang.String r1 = ", description="
            r0.append(r1)
            java.lang.String r1 = r5.f4459k
            r0.append(r1)
            java.lang.String r1 = ", files="
            r0.append(r1)
            java.util.List r1 = r5.f4460l
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
