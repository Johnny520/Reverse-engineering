package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f11816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Set f11818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.time.format.DateTimeFormatter f11819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f11820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f11824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f11828n;

    public z(boolean r1, java.lang.String r2, java.lang.String r3, java.util.Set r4, java.time.format.DateTimeFormatter r5, float r6, int r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
            r0 = this;
            r0.<init>()
            r0.f11815a = r1
            r0.f11816b = r2
            r0.f11817c = r3
            r0.f11818d = r4
            r0.f11819e = r5
            r0.f11820f = r6
            r0.f11821g = r7
            r0.f11822h = r8
            r0.f11823i = r9
            r0.f11824j = r10
            r0.f11825k = r11
            r0.f11826l = r12
            r0.f11827m = r13
            r0.f11828n = r14
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L85
        L4:
            boolean r0 = r3 instanceof r9.z
            if (r0 != 0) goto La
            goto L83
        La:
            r9.z r3 = (r9.z) r3
            boolean r0 = r2.f11815a
            boolean r1 = r3.f11815a
            if (r0 == r1) goto L14
            goto L83
        L14:
            java.lang.String r0 = r2.f11816b
            java.lang.String r1 = r3.f11816b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L83
        L20:
            java.lang.String r0 = r2.f11817c
            java.lang.String r1 = r3.f11817c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L83
        L2b:
            java.util.Set r0 = r2.f11818d
            java.util.Set r1 = r3.f11818d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L83
        L36:
            java.time.format.DateTimeFormatter r0 = r2.f11819e
            java.time.format.DateTimeFormatter r1 = r3.f11819e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L83
        L41:
            float r0 = r2.f11820f
            float r1 = r3.f11820f
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L4c
            goto L83
        L4c:
            int r0 = r2.f11821g
            int r1 = r3.f11821g
            if (r0 == r1) goto L53
            goto L83
        L53:
            int r0 = r2.f11822h
            int r1 = r3.f11822h
            if (r0 == r1) goto L5a
            goto L83
        L5a:
            int r0 = r2.f11823i
            int r1 = r3.f11823i
            if (r0 == r1) goto L61
            goto L83
        L61:
            boolean r0 = r2.f11824j
            boolean r1 = r3.f11824j
            if (r0 == r1) goto L68
            goto L83
        L68:
            int r0 = r2.f11825k
            int r1 = r3.f11825k
            if (r0 == r1) goto L6f
            goto L83
        L6f:
            int r0 = r2.f11826l
            int r1 = r3.f11826l
            if (r0 == r1) goto L76
            goto L83
        L76:
            int r0 = r2.f11827m
            int r1 = r3.f11827m
            if (r0 == r1) goto L7d
            goto L83
        L7d:
            int r0 = r2.f11828n
            int r3 = r3.f11828n
            if (r0 == r3) goto L85
        L83:
            r3 = 0
            return r3
        L85:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f11815a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f11816b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f11817c
            int r0 = eh.a.g(r0, r1, r2)
            java.util.Set r2 = r3.f11818d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.time.format.DateTimeFormatter r0 = r3.f11819e
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r3.f11820f
            int r0 = eh.a.d(r2, r0, r1)
            int r2 = r3.f11821g
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f11822h
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f11823i
            int r0 = eh.a.e(r2, r0, r1)
            boolean r2 = r3.f11824j
            int r0 = eh.a.h(r0, r1, r2)
            int r2 = r3.f11825k
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f11826l
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f11827m
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f11828n
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageDetailsConfig(enabled="
            r0.<init>(r1)
            boolean r1 = r5.f11815a
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            java.lang.String r1 = r5.f11816b
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            java.lang.String r1 = r5.f11817c
            r0.append(r1)
            java.lang.String r1 = ", tokens="
            r0.append(r1)
            java.util.Set r1 = r5.f11818d
            r0.append(r1)
            java.lang.String r1 = ", timeFormatter="
            r0.append(r1)
            java.time.format.DateTimeFormatter r1 = r5.f11819e
            r0.append(r1)
            java.lang.String r1 = ", textSizeSp="
            r0.append(r1)
            float r1 = r5.f11820f
            r0.append(r1)
            java.lang.String r1 = ", avatarGapDp="
            r0.append(r1)
            java.lang.String r1 = ", leftMarginDp="
            java.lang.String r2 = ", rightMarginDp="
            int r3 = r5.f11821g
            int r4 = r5.f11822h
            wb.en.p(r0, r3, r1, r4, r2)
            int r1 = r5.f11823i
            r0.append(r1)
            java.lang.String r1 = ", clickShow="
            r0.append(r1)
            boolean r1 = r5.f11824j
            r0.append(r1)
            java.lang.String r1 = ", lightTextColor="
            r0.append(r1)
            java.lang.String r1 = ", darkTextColor="
            java.lang.String r2 = ", lightBgColor="
            int r3 = r5.f11825k
            int r4 = r5.f11826l
            wb.en.p(r0, r3, r1, r4, r2)
            int r1 = r5.f11827m
            r0.append(r1)
            java.lang.String r1 = ", darkBgColor="
            r0.append(r1)
            int r1 = r5.f11828n
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
