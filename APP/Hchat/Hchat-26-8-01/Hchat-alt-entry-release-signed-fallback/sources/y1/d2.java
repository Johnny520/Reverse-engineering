package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0.m2 f21877a = null;

    static {
            y1.t1 r0 = y1.t1.f22122i
            i0.m2 r1 = new i0.m2
            r1.<init>(r0)
            y1.d2.f21877a = r1
            return
    }

    public static final void a(f0.p r4, ci.e r5, yf.c r6) {
            boolean r0 = r6 instanceof y1.b2
            if (r0 == 0) goto L13
            r0 = r6
            y1.b2 r0 = (y1.b2) r0
            int r1 = r0.f21854h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21854h = r1
            goto L18
        L13:
            y1.b2 r0 = new y1.b2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f21853g
            int r1 = r0.f21854h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            return
        L27:
            f8.i.I0(r6)
            okio.a.c()
            return
        L2e:
            f8.i.I0(r6)
            y0.n r6 = r4.f21819g
            boolean r6 = r6.f21832t
            if (r6 == 0) goto L58
            x1.r1 r6 = x1.k.x(r4)
            x1.f0 r4 = x1.k.w(r4)
            i0.t r4 = r4.H
            s0.h r4 = (s0.h) r4
            r4.getClass()
            i0.m2 r1 = y1.d2.f21877a
            java.lang.Object r4 = i0.r.v(r4, r1)
            if (r4 != 0) goto L54
            r0.f21854h = r2
            b(r6, r5, r0)
            return
        L54:
            ah.a.d()
            return
        L58:
            java.lang.String r4 = "establishTextInputSession called from an unattached node"
            j8.o.t(r4)
            return
    }

    public static final void b(x1.r1 r4, fg.p r5, yf.c r6) {
            boolean r0 = r6 instanceof y1.c2
            if (r0 == 0) goto L13
            r0 = r6
            y1.c2 r0 = (y1.c2) r0
            int r1 = r0.f21866h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21866h = r1
            goto L18
        L13:
            y1.c2 r0 = new y1.c2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f21865g
            int r1 = r0.f21866h
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 == r2) goto L31
            r4 = 2
            if (r1 == r4) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            return
        L2a:
            f8.i.I0(r6)
            okio.a.c()
            return
        L31:
            f8.i.I0(r6)
            okio.a.c()
            return
        L38:
            f8.i.I0(r6)
            r0.f21866h = r2
            y1.t r4 = (y1.t) r4
            r4.M(r5, r0)
            return
    }
}
