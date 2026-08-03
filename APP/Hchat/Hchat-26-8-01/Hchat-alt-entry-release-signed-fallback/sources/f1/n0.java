package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 implements ke.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f3080g;

    public n0(int r1) {
            r0 = this;
            switch(r1) {
                case 3: goto L19;
                case 4: goto Le;
                default: goto L3;
            }
        L3:
            r0.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f3080g = r1
            return
        Le:
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3080g = r1
            return
        L19:
            r0.<init>()
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f3080g = r1
            return
    }

    public n0(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3080g = r1
            return
    }

    public static long k(int r2, int r3) {
            long r0 = (long) r2
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r3
            long r2 = r2 | r0
            return r2
    }

    @Override // ke.e
    public boolean a(ud.r r1, ud.n r2) {
            r0 = this;
            java.lang.Object r1 = r0.f3080g
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            r1.push(r2)
            r1 = 1
            return r1
    }

    @Override // ke.e
    public void b(ud.r r1, ud.n r2) {
            r0 = this;
            java.lang.Object r1 = r0.f3080g
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            r1.pop()
            return
    }

    public boolean c(int r8, l0.c r9, java.lang.Object r10) {
            r7 = this;
            java.util.ArrayList r0 = r9.f7655a
            r1 = 1
            if (r0 != 0) goto La
            r10 = 0
            r7.e(r8, r9, r10)
            return r1
        La:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L3f
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof l0.b
            if (r6 == 0) goto L24
            boolean r6 = r5.equals(r10)
            if (r6 == 0) goto L35
            r7.e(r3, r9, r5)
            return r1
        L24:
            boolean r6 = r5 instanceof l0.c
            if (r6 == 0) goto L38
            r6 = r5
            l0.c r6 = (l0.c) r6
            boolean r6 = r7.c(r8, r6, r10)
            if (r6 == 0) goto L35
            r7.e(r3, r9, r5)
            return r1
        L35:
            int r4 = r4 + 1
            goto L10
        L38:
            java.lang.String r8 = "Unexpected child source info "
            okio.a.p(r5, r8)
            r8 = 0
            return r8
        L3f:
            return r3
    }

    @Override // ke.e
    public void d(ud.r r2, ud.h r3) {
            r1 = this;
            java.lang.Object r0 = r1.f3080g
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r0 = r0.peek()
            ud.n r0 = (ud.n) r0
            r1.l(r2, r3, r0)
            return
    }

    public void e(int r1, l0.c r2, java.lang.Object r3) {
            r0 = this;
            x0.b r2 = new x0.b
            r3 = 0
            r2.<init>(r1, r3, r3)
            java.lang.Object r1 = r0.f3080g
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r2)
            return
    }

    public android.graphics.RenderEffect f() {
            r1 = this;
            java.lang.Object r0 = r1.f3080g
            android.graphics.RenderEffect r0 = (android.graphics.RenderEffect) r0
            if (r0 != 0) goto Lc
            android.graphics.RenderEffect r0 = r1.i()
            r1.f3080g = r0
        Lc:
            return r0
    }

    public abstract void g(sg.p r1);

    public abstract void h();

    public abstract android.graphics.RenderEffect i();

    public abstract void j();

    public abstract void l(ud.r r1, ud.h r2, ud.n r3);

    public void m(int r1, java.lang.Object r2, l0.c r3, java.lang.Object r4) {
            r0 = this;
            i0.e r4 = i0.l.f5952a
            boolean r2 = gg.l.a(r2, r4)
            if (r2 != 0) goto L9
            return
        L9:
            r2 = 0
            r0.e(r1, r3, r2)
            return
    }

    public abstract fg.l n(sg.p r1);

    public abstract void o(sg.g r1);
}
