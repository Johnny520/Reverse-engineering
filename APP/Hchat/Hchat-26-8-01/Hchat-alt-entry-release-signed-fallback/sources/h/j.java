package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends gg.m implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h.j f4703h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h.j f4704i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4705g;

    static {
            h.j r0 = new h.j
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            h.j.f4703h = r0
            h.j r0 = new h.j
            r2 = 1
            r0.<init>(r1, r2)
            h.j.f4704i = r0
            return
    }

    public /* synthetic */ j(int r1, int r2) {
            r0 = this;
            r0.f4705g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f4705g
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            h.f0 r7 = (h.f0) r7
            h.f0 r8 = (h.f0) r8
            if (r7 != r8) goto L11
            h.f0 r7 = h.f0.f4661i
            if (r8 != r7) goto L11
            r7 = 1
            goto L12
        L11:
            r7 = 0
        L12:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L17:
            u2.l r7 = (u2.l) r7
            long r0 = r7.f13353a
            u2.l r8 = (u2.l) r8
            long r7 = r8.f13353a
            r7 = 1
            long r0 = (long) r7
            r8 = 32
            long r2 = r0 << r8
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            u2.l r8 = new u2.l
            r8.<init>(r0)
            r0 = 0
            r1 = 1137180672(0x43c80000, float:400.0)
            i.r0 r7 = i.d.o(r0, r1, r8, r7)
            return r7
    }
}
