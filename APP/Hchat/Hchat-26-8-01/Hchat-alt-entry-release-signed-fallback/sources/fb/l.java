package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb.s0 f3614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fb.s1 f3617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fb.e0 f3618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3619f;

    public l(fb.s0 r1, java.lang.String r2, java.lang.String r3, fb.s1 r4, fb.e0 r5, boolean r6) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.f3614a = r1
            r0.f3615b = r2
            r0.f3616c = r3
            r0.f3617d = r4
            r0.f3618e = r5
            r0.f3619f = r6
            return
    }

    public final fb.s0 a() {
            r1 = this;
            fb.s0 r0 = r1.f3614a
            return r0
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f3615b
            return r0
    }

    public final boolean c() {
            r1 = this;
            boolean r0 = r1.f3619f
            return r0
    }

    public final fb.s1 d() {
            r1 = this;
            fb.s1 r0 = r1.f3617d
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof fb.l
            if (r0 != 0) goto L8
            goto L47
        L8:
            fb.l r3 = (fb.l) r3
            fb.s0 r0 = r2.f3614a
            fb.s0 r1 = r3.f3614a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L47
        L15:
            java.lang.String r0 = r2.f3615b
            java.lang.String r1 = r3.f3615b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L47
        L20:
            java.lang.String r0 = r2.f3616c
            java.lang.String r1 = r3.f3616c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L47
        L2b:
            fb.s1 r0 = r2.f3617d
            fb.s1 r1 = r3.f3617d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L47
        L36:
            fb.e0 r0 = r2.f3618e
            fb.e0 r1 = r3.f3618e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L41
            goto L47
        L41:
            boolean r0 = r2.f3619f
            boolean r3 = r3.f3619f
            if (r0 == r3) goto L49
        L47:
            r3 = 0
            return r3
        L49:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            fb.s0 r0 = r3.f3614a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3615b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3616c
            int r0 = eh.a.g(r0, r1, r2)
            fb.s1 r2 = r3.f3617d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            fb.e0 r0 = r3.f3618e
            if (r0 != 0) goto L23
            r0 = 0
            goto L27
        L23:
            int r0 = r0.hashCode()
        L27:
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f3619f
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NativeToolExecution(call="
            r0.<init>(r1)
            fb.s0 r1 = r2.f3614a
            r0.append(r1)
            java.lang.String r1 = ", eventId="
            r0.append(r1)
            java.lang.String r1 = r2.f3615b
            r0.append(r1)
            java.lang.String r1 = ", rawResult="
            r0.append(r1)
            java.lang.String r1 = r2.f3616c
            r0.append(r1)
            java.lang.String r1 = ", stored="
            r0.append(r1)
            fb.s1 r1 = r2.f3617d
            r0.append(r1)
            java.lang.String r1 = ", fileResult="
            r0.append(r1)
            fb.e0 r1 = r2.f3618e
            r0.append(r1)
            java.lang.String r1 = ", failed="
            r0.append(r1)
            boolean r1 = r2.f3619f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
