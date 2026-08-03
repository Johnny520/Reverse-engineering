package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements i2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t2.q f6394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i2.w f6395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t2.i f6396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t2.s f6399i;

    public u(int r1, int r2, long r3, t2.q r5, i2.w r6, t2.i r7, int r8, int r9, t2.s r10) {
            r0 = this;
            r0.<init>()
            r0.f6391a = r1
            r0.f6392b = r2
            r0.f6393c = r3
            r0.f6394d = r5
            r0.f6395e = r6
            r0.f6396f = r7
            r0.f6397g = r8
            r0.f6398h = r9
            r0.f6399i = r10
            long r1 = u2.o.f13359c
            boolean r1 = u2.o.a(r3, r1)
            if (r1 != 0) goto L41
            float r1 = u2.o.c(r3)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L27
            goto L41
        L27:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lineHeight can't be negative ("
            r1.<init>(r2)
            float r2 = u2.o.c(r3)
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            o2.a.b(r1)
        L41:
            return
    }

    public final i2.u a(i2.u r12) {
            r11 = this;
            if (r12 != 0) goto L3
            return r11
        L3:
            int r1 = r12.f6391a
            int r2 = r12.f6392b
            long r3 = r12.f6393c
            t2.q r5 = r12.f6394d
            i2.w r6 = r12.f6395e
            t2.i r7 = r12.f6396f
            int r8 = r12.f6397g
            int r9 = r12.f6398h
            t2.s r10 = r12.f6399i
            r0 = r11
            i2.u r12 = i2.v.a(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r12
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L59
        L3:
            boolean r0 = r5 instanceof i2.u
            if (r0 != 0) goto L8
            goto L5b
        L8:
            i2.u r5 = (i2.u) r5
            int r0 = r5.f6391a
            int r1 = r4.f6391a
            if (r1 != r0) goto L5b
            int r0 = r4.f6392b
            int r1 = r5.f6392b
            if (r0 != r1) goto L5b
            long r0 = r4.f6393c
            long r2 = r5.f6393c
            boolean r0 = u2.o.a(r0, r2)
            if (r0 != 0) goto L21
            goto L5b
        L21:
            t2.q r0 = r4.f6394d
            t2.q r1 = r5.f6394d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2c
            goto L5b
        L2c:
            i2.w r0 = r4.f6395e
            i2.w r1 = r5.f6395e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L37
            goto L5b
        L37:
            t2.i r0 = r4.f6396f
            t2.i r1 = r5.f6396f
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L42
            goto L5b
        L42:
            int r0 = r4.f6397g
            int r1 = r5.f6397g
            if (r0 != r1) goto L5b
            int r0 = r4.f6398h
            int r1 = r5.f6398h
            if (r0 != r1) goto L5b
            t2.s r0 = r4.f6399i
            t2.s r5 = r5.f6399i
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto L59
            goto L5b
        L59:
            r5 = 1
            return r5
        L5b:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f6391a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f6392b
            int r0 = eh.a.e(r2, r0, r1)
            u2.p[] r2 = u2.o.f13358b
            long r2 = r4.f6393c
            int r0 = eh.a.f(r0, r1, r2)
            r2 = 0
            t2.q r3 = r4.f6394d
            if (r3 == 0) goto L21
            int r3 = r3.hashCode()
            goto L22
        L21:
            r3 = r2
        L22:
            int r0 = r0 + r3
            int r0 = r0 * r1
            i2.w r3 = r4.f6395e
            if (r3 == 0) goto L2d
            int r3 = r3.hashCode()
            goto L2e
        L2d:
            r3 = r2
        L2e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            t2.i r3 = r4.f6396f
            if (r3 == 0) goto L39
            int r3 = r3.hashCode()
            goto L3a
        L39:
            r3 = r2
        L3a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f6397g
            int r0 = eh.a.e(r3, r0, r1)
            int r3 = r4.f6398h
            int r0 = eh.a.e(r3, r0, r1)
            t2.s r1 = r4.f6399i
            if (r1 == 0) goto L50
            int r2 = r1.hashCode()
        L50:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphStyle(textAlign="
            r0.<init>(r1)
            int r1 = r3.f6391a
            java.lang.String r1 = t2.k.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", textDirection="
            r0.append(r1)
            int r1 = r3.f6392b
            java.lang.String r1 = t2.m.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", lineHeight="
            r0.append(r1)
            long r1 = r3.f6393c
            java.lang.String r1 = u2.o.d(r1)
            r0.append(r1)
            java.lang.String r1 = ", textIndent="
            r0.append(r1)
            t2.q r1 = r3.f6394d
            r0.append(r1)
            java.lang.String r1 = ", platformStyle="
            r0.append(r1)
            i2.w r1 = r3.f6395e
            r0.append(r1)
            java.lang.String r1 = ", lineHeightStyle="
            r0.append(r1)
            t2.i r1 = r3.f6396f
            r0.append(r1)
            java.lang.String r1 = ", lineBreak="
            r0.append(r1)
            int r1 = r3.f6397g
            java.lang.String r1 = t2.e.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", hyphens="
            r0.append(r1)
            int r1 = r3.f6398h
            java.lang.String r1 = t2.d.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", textMotion="
            r0.append(r1)
            t2.s r1 = r3.f6399i
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
