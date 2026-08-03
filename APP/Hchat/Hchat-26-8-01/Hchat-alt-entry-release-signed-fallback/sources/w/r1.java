package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements v1.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.j1 f14637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2.z f14639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg.a f14640d;

    public r1(w.j1 r1, int r2, n2.z r3, fg.a r4) {
            r0 = this;
            r0.<init>()
            r0.f14637a = r1
            r0.f14638b = r2
            r0.f14639c = r3
            r0.f14640d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof w.r1
            if (r0 != 0) goto L8
            goto L31
        L8:
            w.r1 r3 = (w.r1) r3
            w.j1 r0 = r2.f14637a
            w.j1 r1 = r3.f14637a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            int r0 = r2.f14638b
            int r1 = r3.f14638b
            if (r0 == r1) goto L1c
            goto L31
        L1c:
            n2.z r0 = r2.f14639c
            n2.z r1 = r3.f14639c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L31
        L27:
            fg.a r0 = r2.f14640d
            fg.a r3 = r3.f14640d
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
            w.j1 r0 = r3.f14637a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f14638b
            int r0 = eh.a.e(r2, r0, r1)
            n2.z r2 = r3.f14639c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            fg.a r0 = r3.f14640d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
    }

    @Override // v1.y
    public final v1.o0 j(v1.p0 r8, v1.m0 r9, long r10) {
            r7 = this;
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r10
            long r10 = u2.a.a(r0, r2, r3, r4, r5, r6)
            v1.b1 r9 = r9.Q(r10)
            int r10 = r9.f13901h
            int r11 = u2.a.g(r0)
            int r10 = java.lang.Math.min(r10, r11)
            int r11 = r9.f13900g
            eb.v0 r0 = new eb.v0
            r1 = 3
            r0.<init>(r7, r9, r10, r1)
            tf.u r9 = tf.u.f13168g
            v1.o0 r8 = r8.z(r11, r10, r9, r0)
            return r8
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VerticalScrollLayoutModifier(scrollerPosition="
            r0.<init>(r1)
            w.j1 r1 = r2.f14637a
            r0.append(r1)
            java.lang.String r1 = ", cursorOffset="
            r0.append(r1)
            int r1 = r2.f14638b
            r0.append(r1)
            java.lang.String r1 = ", transformedText="
            r0.append(r1)
            n2.z r1 = r2.f14639c
            r0.append(r1)
            java.lang.String r1 = ", textLayoutResultProvider="
            r0.append(r1)
            fg.a r1 = r2.f14640d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
