package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f3563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f3564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f3565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f3566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fb.y f3567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.LinkedHashMap f3568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Object f3570m;

    public i2(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, java.lang.String r5, java.util.List r6, java.util.List r7, java.util.List r8, java.lang.String r9, fb.y r10, java.util.LinkedHashMap r11, boolean r12, java.util.List r13) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f3558a = r1
            r0.f3559b = r2
            r0.f3560c = r3
            r0.f3561d = r4
            r0.f3562e = r5
            r0.f3563f = r6
            r0.f3564g = r7
            r0.f3565h = r8
            r0.f3566i = r9
            r0.f3567j = r10
            r0.f3568k = r11
            r0.f3569l = r12
            r0.f3570m = r13
            return
    }

    public final boolean a() {
            r1 = this;
            boolean r0 = r1.f3569l
            return r0
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f3558a
            return r0
    }

    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f3560c
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L97
        L4:
            boolean r0 = r3 instanceof fb.i2
            if (r0 != 0) goto La
            goto L95
        La:
            fb.i2 r3 = (fb.i2) r3
            java.lang.String r0 = r2.f3558a
            java.lang.String r1 = r3.f3558a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L95
        L18:
            java.lang.String r0 = r2.f3559b
            java.lang.String r1 = r3.f3559b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L24
            goto L95
        L24:
            java.lang.String r0 = r2.f3560c
            java.lang.String r1 = r3.f3560c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L95
        L30:
            boolean r0 = r2.f3561d
            boolean r1 = r3.f3561d
            if (r0 == r1) goto L37
            goto L95
        L37:
            java.lang.String r0 = r2.f3562e
            java.lang.String r1 = r3.f3562e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L95
        L42:
            java.util.List r0 = r2.f3563f
            java.util.List r1 = r3.f3563f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            goto L95
        L4d:
            java.util.List r0 = r2.f3564g
            java.util.List r1 = r3.f3564g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L58
            goto L95
        L58:
            java.util.List r0 = r2.f3565h
            java.util.List r1 = r3.f3565h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L95
        L63:
            java.lang.String r0 = r2.f3566i
            java.lang.String r1 = r3.f3566i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6e
            goto L95
        L6e:
            fb.y r0 = r2.f3567j
            fb.y r1 = r3.f3567j
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L79
            goto L95
        L79:
            java.util.LinkedHashMap r0 = r2.f3568k
            java.util.LinkedHashMap r1 = r3.f3568k
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L84
            goto L95
        L84:
            boolean r0 = r2.f3569l
            boolean r1 = r3.f3569l
            if (r0 == r1) goto L8b
            goto L95
        L8b:
            java.lang.Object r0 = r2.f3570m
            java.lang.Object r3 = r3.f3570m
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L97
        L95:
            r3 = 0
            return r3
        L97:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3558a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3559b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3560c
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f3561d
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f3562e
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r2 = r3.f3563f
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r2 = r3.f3564g
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r2 = r3.f3565h
            int r0 = j8.b.e(r2, r0, r1)
            java.lang.String r2 = r3.f3566i
            int r0 = eh.a.g(r0, r1, r2)
            fb.y r2 = r3.f3567j
            if (r2 != 0) goto L3f
            r2 = 0
            goto L43
        L3f:
            int r2 = r2.hashCode()
        L43:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.LinkedHashMap r2 = r3.f3568k
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f3569l
            int r0 = eh.a.h(r2, r1, r0)
            java.lang.Object r1 = r3.f3570m
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", pluginName="
            java.lang.String r1 = ", stagingPath="
            java.lang.String r2 = "ScriptPluginAgentWorkspaceChange(pluginId="
            java.lang.String r3 = r5.f3558a
            java.lang.String r4 = r5.f3559b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f3560c
            r0.append(r1)
            java.lang.String r1 = ", existed="
            r0.append(r1)
            boolean r1 = r5.f3561d
            r0.append(r1)
            java.lang.String r1 = ", baseFingerprint="
            r0.append(r1)
            java.lang.String r1 = r5.f3562e
            r0.append(r1)
            java.lang.String r1 = ", createdPaths="
            r0.append(r1)
            java.util.List r1 = r5.f3563f
            r0.append(r1)
            java.lang.String r1 = ", modifiedPaths="
            r0.append(r1)
            java.util.List r1 = r5.f3564g
            r0.append(r1)
            java.lang.String r1 = ", deletedPaths="
            r0.append(r1)
            java.util.List r1 = r5.f3565h
            r0.append(r1)
            java.lang.String r1 = ", diff="
            r0.append(r1)
            java.lang.String r1 = r5.f3566i
            r0.append(r1)
            java.lang.String r1 = ", draft="
            r0.append(r1)
            fb.y r1 = r5.f3567j
            r0.append(r1)
            java.lang.String r1 = ", basePathStates="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r5.f3568k
            r0.append(r1)
            java.lang.String r1 = ", deletePlugin="
            r0.append(r1)
            boolean r1 = r5.f3569l
            r0.append(r1)
            java.lang.String r1 = ", warnings="
            r0.append(r1)
            java.lang.Object r1 = r5.f3570m
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
