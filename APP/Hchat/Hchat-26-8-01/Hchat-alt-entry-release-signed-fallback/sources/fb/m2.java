package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f3647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f3648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.Integer f3649n;

    public m2(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, java.lang.String r12, java.lang.Integer r13, java.lang.Integer r14) {
            r0 = this;
            r0.<init>()
            r0.f3636a = r1
            r0.f3637b = r2
            r0.f3638c = r3
            r0.f3639d = r4
            r0.f3640e = r5
            r0.f3641f = r6
            r0.f3642g = r7
            r0.f3643h = r8
            r0.f3644i = r9
            r0.f3645j = r10
            r0.f3646k = r11
            r0.f3647l = r12
            r0.f3648m = r13
            r0.f3649n = r14
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L85
        L4:
            boolean r0 = r3 instanceof fb.m2
            if (r0 != 0) goto La
            goto L83
        La:
            fb.m2 r3 = (fb.m2) r3
            java.lang.String r0 = r2.f3636a
            java.lang.String r1 = r3.f3636a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L83
        L18:
            boolean r0 = r2.f3637b
            boolean r1 = r3.f3637b
            if (r0 == r1) goto L20
            goto L83
        L20:
            java.lang.String r0 = r2.f3638c
            java.lang.String r1 = r3.f3638c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L83
        L2b:
            boolean r0 = r2.f3639d
            boolean r1 = r3.f3639d
            if (r0 == r1) goto L32
            goto L83
        L32:
            boolean r0 = r2.f3640e
            boolean r1 = r3.f3640e
            if (r0 == r1) goto L39
            goto L83
        L39:
            boolean r0 = r2.f3641f
            boolean r1 = r3.f3641f
            if (r0 == r1) goto L40
            goto L83
        L40:
            boolean r0 = r2.f3642g
            boolean r1 = r3.f3642g
            if (r0 == r1) goto L47
            goto L83
        L47:
            boolean r0 = r2.f3643h
            boolean r1 = r3.f3643h
            if (r0 == r1) goto L4e
            goto L83
        L4e:
            boolean r0 = r2.f3644i
            boolean r1 = r3.f3644i
            if (r0 == r1) goto L55
            goto L83
        L55:
            boolean r0 = r2.f3645j
            boolean r1 = r3.f3645j
            if (r0 == r1) goto L5c
            goto L83
        L5c:
            boolean r0 = r2.f3646k
            boolean r1 = r3.f3646k
            if (r0 == r1) goto L63
            goto L83
        L63:
            java.lang.String r0 = r2.f3647l
            java.lang.String r1 = r3.f3647l
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6e
            goto L83
        L6e:
            java.lang.Integer r0 = r2.f3648m
            java.lang.Integer r1 = r3.f3648m
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L79
            goto L83
        L79:
            java.lang.Integer r0 = r2.f3649n
            java.lang.Integer r3 = r3.f3649n
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L85
        L83:
            r3 = 0
            return r3
        L85:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f3636a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r4.f3637b
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r4.f3638c
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r4.f3639d
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f3640e
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f3641f
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f3642g
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f3643h
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f3644i
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f3645j
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f3646k
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r4.f3647l
            int r0 = eh.a.g(r0, r1, r2)
            r2 = 0
            java.lang.Integer r3 = r4.f3648m
            if (r3 != 0) goto L52
            r3 = r2
            goto L56
        L52:
            int r3 = r3.hashCode()
        L56:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r1 = r4.f3649n
            if (r1 != 0) goto L5d
            goto L61
        L5d:
            int r2 = r1.hashCode()
        L61:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AccessState(path="
            r0.<init>(r1)
            java.lang.String r1 = r5.f3636a
            r0.append(r1)
            java.lang.String r1 = ", exists="
            r0.append(r1)
            boolean r1 = r5.f3637b
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            java.lang.String r1 = r5.f3638c
            r0.append(r1)
            java.lang.String r1 = ", readable="
            r0.append(r1)
            boolean r1 = r5.f3639d
            r0.append(r1)
            java.lang.String r1 = ", writable="
            r0.append(r1)
            java.lang.String r1 = ", executable="
            java.lang.String r2 = ", symbolicLink="
            boolean r3 = r5.f3640e
            boolean r4 = r5.f3641f
            p.a.x(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", parentWritable="
            java.lang.String r2 = ", replaceable="
            boolean r3 = r5.f3642g
            boolean r4 = r5.f3643h
            p.a.x(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", workspaceReadable="
            java.lang.String r2 = ", modifiable="
            boolean r3 = r5.f3644i
            boolean r4 = r5.f3645j
            p.a.x(r0, r3, r1, r4, r2)
            boolean r1 = r5.f3646k
            r0.append(r1)
            java.lang.String r1 = ", mode="
            r0.append(r1)
            java.lang.String r1 = r5.f3647l
            r0.append(r1)
            java.lang.String r1 = ", ownerUid="
            r0.append(r1)
            java.lang.Integer r1 = r5.f3648m
            r0.append(r1)
            java.lang.String r1 = ", ownerGid="
            r0.append(r1)
            java.lang.Integer r1 = r5.f3649n
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
