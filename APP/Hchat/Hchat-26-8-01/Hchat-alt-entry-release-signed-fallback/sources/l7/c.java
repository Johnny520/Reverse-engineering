package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l7.a implements java.lang.Iterable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j8.o f7871q = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7.b f7873p;

    static {
            j8.o r0 = new j8.o
            r0.<init>()
            l7.c.f7871q = r0
            return
    }

    public c(int r3) {
            r2 = this;
            r2.f7872o = r3
            switch(r3) {
                case 1: goto L32;
                case 2: goto L1d;
                default: goto L5;
            }
        L5:
            p7.e r3 = new p7.e
            r3.<init>()
            r0 = 1
            r2.<init>(r3, r0)
            o7.c r0 = new o7.c
            j8.o r1 = l7.c.f7871q
            r7.f r3 = r3.f10277s
            r0.<init>(r1, r3)
            r2.f7873p = r0
            r2.P(r0)
            return
        L1d:
            p7.d r3 = new p7.d
            r3.<init>()
            r0 = 2
            r2.<init>(r3, r0)
            o7.b r3 = new o7.b
            r0 = 0
            r3.<init>(r0)
            r2.f7873p = r3
            r2.P(r3)
            return
        L32:
            p7.c r3 = new p7.c
            r3.<init>()
            r0 = 1
            r2.<init>(r3, r0)
            j7.a r0 = new j7.a
            r7.f r3 = r3.f10273r
            r1 = 0
            r0.<init>(r3, r1)
            r2.f7873p = r0
            r2.P(r0)
            return
    }

    private final void U() {
            r0 = this;
            return
    }

    private final void V() {
            r0 = this;
            return
    }

    @Override // l7.a, k7.c, k7.a
    public void B(q7.b r5) {
            r4 = this;
            int r0 = r4.f7872o
            switch(r0) {
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.B(r5)
            return
        L9:
            r5.getClass()
            p7.b r0 = p7.b.T(r5)
            r4.Q(r0)
            r7.f r0 = r0.f10270o
            int r0 = r0.f11560n
            q7.b r1 = r5.a(r0)
            p7.a r2 = r4.f7869m
            r2.G(r1)
            p7.b r2 = p7.b.T(r1)
        L24:
            if (r2 == 0) goto L41
            int r2 = r2.Q()
            r3 = 17
            if (r2 != r3) goto L41
            l7.c r2 = new l7.c
            r3 = 0
            r2.<init>(r3)
            o7.b r3 = r4.f7873p
            r3.M(r2)
            r2.G(r1)
            p7.b r2 = p7.b.T(r1)
            goto L24
        L41:
            r5.c(r0)
            r1.close()
            return
    }

    @Override // l7.a
    public final void S() {
            r2 = this;
            int r0 = r2.f7872o
            switch(r0) {
                case 0: goto L19;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            p7.a r0 = r2.f7869m
            p7.c r0 = (p7.c) r0
            r7.f r0 = r0.f10273r
            o7.b r1 = r2.f7873p
            j7.a r1 = (j7.a) r1
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.k(r1)
        L19:
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f7872o
            switch(r0) {
                case 0: goto L18;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            o7.b r0 = r2.f7873p
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
            return r0
        Le:
            o7.b r0 = r2.f7873p
            j7.a r0 = (j7.a) r0
            r1 = 1
            java.util.Iterator r0 = r0.j0(r1)
            return r0
        L18:
            o7.b r0 = r2.f7873p
            o7.c r0 = (o7.c) r0
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // l7.a
    public java.lang.String toString() {
            r13 = this;
            int r0 = r13.f7872o
            o7.b r1 = r13.f7873p
            p7.a r2 = r13.f7869m
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L9;
                case 2: goto Le;
                default: goto L9;
            }
        L9:
            java.lang.String r0 = super.toString()
            return r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "name='"
            r0.<init>(r3)
            p7.d r2 = (p7.d) r2
            r7.d r3 = r2.f10274r
            java.lang.String r3 = r3.f11578m
            r0.append(r3)
            java.lang.String r3 = "', actor='"
            r0.append(r3)
            r7.d r2 = r2.f10275s
            java.lang.String r2 = r2.f11578m
            r0.append(r2)
            java.lang.String r2 = "', policies="
            r0.append(r2)
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<l7.c> r3 = l7.c.class
            java.lang.String r3 = r3.getSimpleName()
            r0.append(r3)
            java.lang.String r3 = ": flags="
            r0.append(r3)
            p7.e r2 = (p7.e) r2
            r7.f r2 = r2.f10276r
            int r2 = r2.f11560n
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L5d
            l7.h[] r2 = l7.h.f7879c
            goto L8e
        L5d:
            l7.h[] r5 = l7.h.f7879c
            r6 = 9
            l7.h[] r7 = new l7.h[r6]
            r8 = r4
            r9 = r8
        L65:
            if (r8 >= r6) goto L76
            r10 = r5[r8]
            int r11 = r10.f7880a
            r12 = r11 & r2
            if (r12 != r11) goto L73
            r7[r8] = r10
            int r9 = r9 + 1
        L73:
            int r8 = r8 + 1
            goto L65
        L76:
            if (r9 != 0) goto L79
            goto L8e
        L79:
            if (r9 != r6) goto L7d
            r3 = r7
            goto L8e
        L7d:
            l7.h[] r3 = new l7.h[r9]
            r2 = r4
            r5 = r2
        L81:
            if (r2 >= r6) goto L8e
            r8 = r7[r2]
            if (r8 == 0) goto L8b
            r3[r5] = r8
            int r5 = r5 + 1
        L8b:
            int r2 = r2 + 1
            goto L81
        L8e:
            l7.h[] r2 = l7.h.f7879c
            if (r3 == 0) goto Lb9
            int r2 = r3.length
            if (r2 != 0) goto L96
            goto Lb9
        L96:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r5 = r3.length
            r6 = r4
        L9d:
            if (r4 >= r5) goto Lb4
            r7 = r3[r4]
            if (r7 != 0) goto La4
            goto Lb1
        La4:
            if (r6 == 0) goto Lab
            r6 = 124(0x7c, float:1.74E-43)
            r2.append(r6)
        Lab:
            java.lang.String r6 = r7.f7881b
            r2.append(r6)
            r6 = 1
        Lb1:
            int r4 = r4 + 1
            goto L9d
        Lb4:
            java.lang.String r2 = r2.toString()
            goto Lbb
        Lb9:
            java.lang.String r2 = ""
        Lbb:
            r0.append(r2)
            java.lang.String r2 = "', count="
            r0.append(r2)
            o7.c r1 = (o7.c) r1
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // k7.a
    public boolean y() {
            r1 = this;
            int r0 = r1.f7872o
            switch(r0) {
                case 0: goto L15;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r0 = super.y()
            return r0
        La:
            java.util.Iterator r0 = r1.iterator()
            boolean r0 = r0.hasNext()
            r0 = r0 ^ 1
            return r0
        L15:
            o7.b r0 = r1.f7873p
            o7.c r0 = (o7.c) r0
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            if (r0 != 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }
}
