package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f10317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f10318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f10319d;

    public c(java.lang.String r3, java.util.ArrayList r4, java.lang.String r5, java.lang.String r6, int r7) {
            r2 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L6
            tf.t r4 = tf.t.f13167g
        L6:
            r0 = r7 & 4
            java.lang.String r1 = ""
            if (r0 == 0) goto Ld
            r5 = r1
        Ld:
            r7 = r7 & 8
            if (r7 == 0) goto L12
            r6 = r1
        L12:
            r2.<init>()
            r2.f10316a = r3
            r2.f10317b = r4
            r2.f10318c = r5
            r2.f10319d = r6
            return
    }

    public final uf.c a() {
            r6 = this;
            uf.c r0 = a.a.E()
            java.lang.String r1 = r6.f10316a
            boolean r2 = og.m.t0(r1)
            r3 = 0
            if (r2 != 0) goto Le
            goto Lf
        Le:
            r1 = r3
        Lf:
            if (r1 == 0) goto L1a
            db.a r2 = new db.a
            r4 = 0
            r2.<init>(r4, r1)
            r0.add(r2)
        L1a:
            java.util.ArrayList r1 = r6.b()
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            db.a r4 = new db.a
            r5 = 1
            r4.<init>(r5, r2)
            r0.add(r4)
            goto L22
        L38:
            java.lang.String r1 = r6.f10318c
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L41
            r3 = r1
        L41:
            if (r3 == 0) goto L4c
            db.a r1 = new db.a
            r2 = 2
            r1.<init>(r2, r3)
            r0.add(r1)
        L4c:
            uf.c r0 = a.a.t(r0)
            return r0
    }

    public final java.util.ArrayList b() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r3.f10317b
            int r2 = tf.n.e1(r1)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            p8.d r2 = (p8.d) r2
            java.lang.String r2 = r2.f10322a
            r0.add(r2)
            goto Lf
        L21:
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p8.c
            if (r0 != 0) goto L8
            goto L35
        L8:
            p8.c r3 = (p8.c) r3
            java.lang.String r0 = r2.f10316a
            java.lang.String r1 = r3.f10316a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.util.List r0 = r2.f10317b
            java.util.List r1 = r3.f10317b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.f10318c
            java.lang.String r1 = r3.f10318c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r0 = r2.f10319d
            java.lang.String r3 = r3.f10319d
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10316a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f10317b
            int r0 = j8.b.e(r2, r0, r1)
            java.lang.String r2 = r3.f10318c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f10319d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PreparedSnsForward(text="
            r0.<init>(r1)
            java.lang.String r1 = r5.f10316a
            r0.append(r1)
            java.lang.String r1 = ", imageItems="
            r0.append(r1)
            java.util.List r1 = r5.f10317b
            r0.append(r1)
            java.lang.String r1 = ", video="
            r0.append(r1)
            java.lang.String r1 = ", videoThumb="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f10318c
            java.lang.String r4 = r5.f10319d
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
