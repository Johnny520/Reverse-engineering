package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements v1.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.j1 f14528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2.z f14530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg.a f14531d;

    public l0(w.j1 r1, int r2, n2.z r3, fg.a r4) {
            r0 = this;
            r0.<init>()
            r0.f14528a = r1
            r0.f14529b = r2
            r0.f14530c = r3
            r0.f14531d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof w.l0
            if (r0 != 0) goto L8
            goto L31
        L8:
            w.l0 r3 = (w.l0) r3
            w.j1 r0 = r2.f14528a
            w.j1 r1 = r3.f14528a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            int r0 = r2.f14529b
            int r1 = r3.f14529b
            if (r0 == r1) goto L1c
            goto L31
        L1c:
            n2.z r0 = r2.f14530c
            n2.z r1 = r3.f14530c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L31
        L27:
            fg.a r0 = r2.f14531d
            fg.a r3 = r3.f14531d
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            w.j1 r0 = r3.f14528a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f14529b
            int r0 = eh.a.e(r2, r0, r1)
            n2.z r2 = r3.f14530c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            fg.a r0 = r3.f14531d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
    }

    @Override // v1.y
    public final v1.o0 j(v1.p0 r10, v1.m0 r11, long r12) {
            r9 = this;
            int r0 = u2.a.g(r12)
            int r0 = r11.M(r0)
            int r1 = u2.a.h(r12)
            if (r0 >= r1) goto L10
            r2 = r12
            goto L1d
        L10:
            r7 = 0
            r8 = 13
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r2 = r12
            long r12 = u2.a.a(r2, r4, r5, r6, r7, r8)
        L1d:
            v1.b1 r11 = r11.Q(r12)
            int r12 = r11.f13900g
            int r13 = u2.a.h(r2)
            int r4 = java.lang.Math.min(r12, r13)
            int r12 = r11.f13901h
            ca.k r0 = new ca.k
            r5 = 5
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            tf.u r10 = tf.u.f13168g
            v1.o0 r10 = r2.z(r4, r12, r10, r0)
            return r10
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HorizontalScrollLayoutModifier(scrollerPosition="
            r0.<init>(r1)
            w.j1 r1 = r2.f14528a
            r0.append(r1)
            java.lang.String r1 = ", cursorOffset="
            r0.append(r1)
            int r1 = r2.f14529b
            r0.append(r1)
            java.lang.String r1 = ", transformedText="
            r0.append(r1)
            n2.z r1 = r2.f14530c
            r0.append(r1)
            java.lang.String r1 = ", textLayoutResultProvider="
            r0.append(r1)
            fg.a r1 = r2.f14531d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
