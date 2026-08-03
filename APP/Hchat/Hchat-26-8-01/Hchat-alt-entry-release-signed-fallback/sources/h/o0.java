package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.q0 f4727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f4728i;

    public /* synthetic */ o0(h.q0 r1, long r2, int r4) {
            r0 = this;
            r0.f4726g = r4
            r0.f4727h = r1
            r0.f4728i = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f4726g
            switch(r0) {
                case 0: goto L94;
                case 1: goto L59;
                default: goto L5;
            }
        L5:
            h.f0 r9 = (h.f0) r9
            h.q0 r0 = r8.f4727h
            h.r0 r1 = r0.f4741z
            h.h1 r1 = r1.f4746a
            h.f1 r1 = r1.f4691b
            long r2 = r8.f4728i
            r4 = 0
            if (r1 == 0) goto L25
            gg.m r1 = r1.f4663a
            u2.l r6 = new u2.l
            r6.<init>(r2)
            java.lang.Object r1 = r1.invoke(r6)
            u2.j r1 = (u2.j) r1
            long r6 = r1.f13347a
            goto L26
        L25:
            r6 = r4
        L26:
            h.s0 r0 = r0.A
            h.h1 r0 = r0.f4753a
            h.f1 r0 = r0.f4691b
            if (r0 == 0) goto L3e
            gg.m r0 = r0.f4663a
            u2.l r1 = new u2.l
            r1.<init>(r2)
            java.lang.Object r0 = r0.invoke(r1)
            u2.j r0 = (u2.j) r0
            long r0 = r0.f13347a
            goto L3f
        L3e:
            r0 = r4
        L3f:
            int r9 = r9.ordinal()
            if (r9 == 0) goto L52
            r2 = 1
            if (r9 == r2) goto L53
            r2 = 2
            if (r9 != r2) goto L4d
            r4 = r0
            goto L53
        L4d:
            okio.a.k()
            r9 = 0
            goto L58
        L52:
            r4 = r6
        L53:
            u2.j r9 = new u2.j
            r9.<init>(r4)
        L58:
            return r9
        L59:
            h.f0 r9 = (h.f0) r9
            h.q0 r0 = r8.f4727h
            y0.c r1 = r0.E
            if (r1 != 0) goto L62
            goto L8c
        L62:
            y0.c r1 = r0.m1()
            if (r1 != 0) goto L69
            goto L8c
        L69:
            y0.c r1 = r0.E
            y0.c r2 = r0.m1()
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L76
            goto L8c
        L76:
            int r9 = r9.ordinal()
            if (r9 == 0) goto L8c
            r1 = 1
            if (r9 == r1) goto L8c
            r1 = 2
            if (r9 != r1) goto L87
            h.s0 r9 = r0.A
            h.h1 r9 = r9.f4753a
            goto L8c
        L87:
            okio.a.k()
            r9 = 0
            goto L93
        L8c:
            u2.j r9 = new u2.j
            r0 = 0
            r9.<init>(r0)
        L93:
            return r9
        L94:
            h.f0 r9 = (h.f0) r9
            int r9 = r9.ordinal()
            if (r9 == 0) goto Lae
            r0 = 1
            if (r9 == r0) goto Lae
            r0 = 2
            if (r9 != r0) goto La9
            h.q0 r9 = r8.f4727h
            h.s0 r9 = r9.A
            h.h1 r9 = r9.f4753a
            goto Lae
        La9:
            okio.a.k()
            r9 = 0
            goto Lb5
        Lae:
            u2.l r9 = new u2.l
            long r0 = r8.f4728i
            r9.<init>(r0)
        Lb5:
            return r9
    }
}
