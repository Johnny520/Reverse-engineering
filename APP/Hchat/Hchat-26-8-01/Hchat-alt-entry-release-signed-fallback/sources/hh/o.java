package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f5568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f5570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sf.i f5571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sf.i f5572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sf.i f5573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sf.i f5574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sf.i f5575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf.i f5576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sf.i f5577s;

    public o(org.luckypray.dexkit.DexKitBridge r7, int r8, int r9, int r10, int r11, java.lang.String r12, int r13, java.util.ArrayList r14) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r6.f5566h = r10
            r6.f5567i = r11
            r6.f5568j = r12
            r6.f5569k = r13
            r6.f5570l = r14
            d1.c0 r10 = new d1.c0
            r11 = 6
            r10.<init>(r6, r11)
            sf.i r11 = new sf.i
            r11.<init>(r10)
            r6.f5571m = r11
            hh.n r10 = new hh.n
            r11 = 0
            r10.<init>(r7, r6, r9, r11)
            sf.i r11 = new sf.i
            r11.<init>(r10)
            hh.n r10 = new hh.n
            r11 = 2
            r10.<init>(r7, r6, r9, r11)
            sf.i r11 = new sf.i
            r11.<init>(r10)
            hh.n r10 = new hh.n
            r11 = 1
            r10.<init>(r7, r6, r9, r11)
            sf.i r11 = new sf.i
            r11.<init>(r10)
            hh.f r0 = new hh.f
            r5 = 9
            r2 = r6
            r1 = r7
            r4 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8 = r1
            r10 = r3
            r11 = r4
            sf.i r7 = new sf.i
            r7.<init>(r0)
            hh.f r7 = new hh.f
            r12 = 4
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            sf.i r12 = new sf.i
            r12.<init>(r7)
            r9.f5572n = r12
            hh.f r7 = new hh.f
            r12 = 8
            r7.<init>(r8, r9, r10, r11, r12)
            sf.i r9 = new sf.i
            r9.<init>(r7)
            hh.f r7 = new hh.f
            r12 = 7
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            sf.i r12 = new sf.i
            r12.<init>(r7)
            r9.f5573o = r12
            hh.f r7 = new hh.f
            r12 = 5
            r7.<init>(r8, r9, r10, r11, r12)
            sf.i r12 = new sf.i
            r12.<init>(r7)
            r9.f5574p = r12
            hh.f r7 = new hh.f
            r12 = 6
            r7.<init>(r8, r9, r10, r11, r12)
            sf.i r12 = new sf.i
            r12.<init>(r7)
            r9.f5575q = r12
            hh.f r7 = new hh.f
            r12 = 11
            r7.<init>(r8, r9, r10, r11, r12)
            sf.i r12 = new sf.i
            r12.<init>(r7)
            r9.f5576r = r12
            hh.f r7 = new hh.f
            r12 = 10
            r7.<init>(r8, r9, r10, r11, r12)
            sf.i r8 = new sf.i
            r8.<init>(r7)
            r9.f5577s = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof hh.o
            if (r1 == 0) goto L15
            hh.o r3 = (hh.o) r3
            java.lang.String r3 = r3.f5568j
            java.lang.String r1 = r2.f5568j
            boolean r3 = gg.l.a(r3, r1)
            if (r3 == 0) goto L15
            return r0
        L15:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f5568j
            int r0 = r0.hashCode()
            return r0
    }

    public final lh.d p() {
            r1 = this;
            sf.i r0 = r1.f5571m
            java.lang.Object r0 = r0.getValue()
            lh.d r0 = (lh.d) r0
            return r0
    }

    public final hh.p q() {
            r1 = this;
            sf.i r0 = r1.f5575q
            java.lang.Object r0 = r0.getValue()
            hh.p r0 = (hh.p) r0
            return r0
    }

    public final java.lang.reflect.Method r(java.lang.ClassLoader r2) {
            r1 = this;
            r2.getClass()
            lh.d r0 = r1.p()
            java.lang.reflect.Method r2 = r0.b(r2)
            return r2
    }

    public final java.util.ArrayList s() {
            r5 = this;
            sf.i r0 = r5.f5573o
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 < 0) goto L33
            java.lang.String[] r3 = kh.d.f7615a
            r4 = 256(0x100, float:3.59E-43)
            if (r2 >= r4) goto L35
            r2 = r3[r2]
            r1.add(r2)
            goto L15
        L33:
            java.lang.String[] r0 = kh.d.f7615a
        L35:
            r0 = 16
            a.a.w(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            r0.getClass()
            java.lang.String r1 = "opcode: "
            java.lang.String r2 = " is out of range"
            bsh.j.b(r0, r1, r2)
            r0 = 0
            return r0
        L4a:
            return r1
    }

    public final boolean t() {
            r2 = this;
            lh.d r0 = r2.p()
            java.lang.String r0 = r0.f8064h
            java.lang.String r1 = "<init>"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            int r2 = r8.f5567i
            if (r2 == 0) goto L21
            java.lang.String r2 = java.lang.reflect.Modifier.toString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
        L21:
            lh.d r2 = r8.p()
            java.lang.String r2 = r2.f8066j
            r0.append(r2)
            r0.append(r1)
            lh.d r1 = r8.p()
            java.lang.String r1 = r1.f8063g
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            lh.d r1 = r8.p()
            java.lang.String r1 = r1.f8064h
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            lh.d r1 = r8.p()
            java.util.ArrayList r2 = r1.f8065i
            r6 = 0
            r7 = 62
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            java.lang.String r1 = tf.m.A1(r2, r3, r4, r5, r6, r7)
            java.lang.String r2 = ")"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
