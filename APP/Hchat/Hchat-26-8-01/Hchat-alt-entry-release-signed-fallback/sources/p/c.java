package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9868a;

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.f9868a = r1
            r0.<init>()
            return
    }

    public static final p.b c(int r1, java.lang.String r2) {
            java.util.WeakHashMap r0 = p.s1.f9986v
            p.b r0 = new p.b
            r0.<init>(r1, r2)
            return r0
    }

    public static final p.o1 d(int r2, java.lang.String r3) {
            java.util.WeakHashMap r2 = p.s1.f9986v
            p.o1 r2 = new p.o1
            p.k0 r0 = new p.k0
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            r2.<init>(r0, r3)
            return r2
    }

    public static p.s1 e(i0.h0 r4) {
            i0.m2 r0 = y1.i0.f21970f
            java.lang.Object r0 = r4.j(r0)
            android.view.View r0 = (android.view.View) r0
            p.s1 r1 = f(r0)
            boolean r2 = r4.h(r1)
            boolean r3 = r4.h(r0)
            r2 = r2 | r3
            java.lang.Object r3 = r4.P()
            if (r2 != 0) goto L1f
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto L28
        L1f:
            m.b r3 = new m.b
            r2 = 7
            r3.<init>(r1, r2, r0)
            r4.k0(r3)
        L28:
            fg.l r3 = (fg.l) r3
            i0.r.c(r1, r3, r4)
            return r1
    }

    public static p.s1 f(android.view.View r2) {
            java.util.WeakHashMap r0 = p.s1.f9986v
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            p.s1 r1 = new p.s1     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L18
        L14:
            p.s1 r1 = (p.s1) r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L18:
            monitor-exit(r0)
            throw r2
    }

    @Override // p.g
    public void b(v1.p0 r1, int r2, int[] r3, u2.m r4, int[] r5) {
            r0 = this;
            int r1 = r0.f9868a
            switch(r1) {
                case 0: goto L26;
                case 1: goto L21;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            u2.m r1 = u2.m.f13354g
            if (r4 != r1) goto Le
            r1 = 0
            p.j.b(r3, r5, r1)
            goto L12
        Le:
            r1 = 1
            p.j.c(r2, r3, r5, r1)
        L12:
            return
        L13:
            u2.m r1 = u2.m.f13354g
            if (r4 != r1) goto L1c
            r1 = 0
            p.j.c(r2, r3, r5, r1)
            goto L20
        L1c:
            r1 = 1
            p.j.b(r3, r5, r1)
        L20:
            return
        L21:
            r1 = 0
            p.j.c(r2, r3, r5, r1)
            return
        L26:
            r1 = 0
            p.j.b(r3, r5, r1)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f9868a
            switch(r0) {
                case 0: goto L13;
                case 1: goto L10;
                case 2: goto Ld;
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = "Arrangement#Start"
            return r0
        Ld:
            java.lang.String r0 = "Arrangement#End"
            return r0
        L10:
            java.lang.String r0 = "AbsoluteArrangement#Right"
            return r0
        L13:
            java.lang.String r0 = "AbsoluteArrangement#Left"
            return r0
    }
}
