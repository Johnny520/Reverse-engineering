package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.s f4743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f4744i;

    public /* synthetic */ r(h.s r1, long r2, int r4) {
            r0 = this;
            r0.f4742g = r4
            r0.f4743h = r1
            r0.f4744i = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f4742g
            switch(r0) {
                case 0: goto L40;
                default: goto L5;
            }
        L5:
            h.s r0 = r8.f4743h
            h.t r1 = r0.f4749x
            java.lang.Object r1 = r1.b()
            boolean r1 = gg.l.a(r9, r1)
            if (r1 == 0) goto L23
            long r1 = r0.f4750y
            long r3 = h.k.f4707a
            boolean r9 = u2.l.a(r1, r3)
            if (r9 == 0) goto L20
            long r0 = r8.f4744i
            goto L3a
        L20:
            long r0 = r0.f4750y
            goto L3a
        L23:
            h.t r0 = r0.f4749x
            f.k0 r0 = r0.f4756c
            java.lang.Object r9 = r0.g(r9)
            i0.l2 r9 = (i0.l2) r9
            if (r9 == 0) goto L38
            java.lang.Object r9 = r9.getValue()
            u2.l r9 = (u2.l) r9
            long r0 = r9.f13353a
            goto L3a
        L38:
            r0 = 0
        L3a:
            u2.l r9 = new u2.l
            r9.<init>(r0)
            return r9
        L40:
            i.e1 r9 = (i.e1) r9
            java.lang.Object r0 = r9.b()
            h.s r1 = r8.f4743h
            h.t r2 = r1.f4749x
            java.lang.Object r2 = r2.b()
            boolean r0 = gg.l.a(r0, r2)
            r2 = 0
            if (r0 == 0) goto L66
            long r4 = r1.f4750y
            long r6 = h.k.f4707a
            boolean r0 = u2.l.a(r4, r6)
            if (r0 == 0) goto L63
            long r4 = r8.f4744i
            goto L80
        L63:
            long r4 = r1.f4750y
            goto L80
        L66:
            h.t r0 = r1.f4749x
            f.k0 r0 = r0.f4756c
            java.lang.Object r4 = r9.b()
            java.lang.Object r0 = r0.g(r4)
            i0.l2 r0 = (i0.l2) r0
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r0.getValue()
            u2.l r0 = (u2.l) r0
            long r4 = r0.f13353a
            goto L80
        L7f:
            r4 = r2
        L80:
            h.t r0 = r1.f4749x
            f.k0 r0 = r0.f4756c
            java.lang.Object r9 = r9.c()
            java.lang.Object r9 = r0.g(r9)
            i0.l2 r9 = (i0.l2) r9
            if (r9 == 0) goto L98
            java.lang.Object r9 = r9.getValue()
            u2.l r9 = (u2.l) r9
            long r2 = r9.f13353a
        L98:
            i0.a1 r9 = r1.f4748w
            java.lang.Object r9 = r9.getValue()
            h.e1 r9 = (h.e1) r9
            if (r9 == 0) goto Lb6
            fg.p r9 = r9.f4654a
            u2.l r0 = new u2.l
            r0.<init>(r4)
            u2.l r1 = new u2.l
            r1.<init>(r2)
            java.lang.Object r9 = r9.invoke(r0, r1)
            i.y r9 = (i.y) r9
            if (r9 != 0) goto Lbf
        Lb6:
            r9 = 1137180672(0x43c80000, float:400.0)
            r0 = 5
            r1 = 0
            r2 = 0
            i.r0 r9 = i.d.o(r1, r9, r2, r0)
        Lbf:
            return r9
    }
}
