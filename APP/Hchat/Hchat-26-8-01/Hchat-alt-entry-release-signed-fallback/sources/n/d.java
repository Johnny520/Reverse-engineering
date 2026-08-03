package n;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements tg.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f8903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f8904i;

    public /* synthetic */ d(java.util.ArrayList r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f8902g = r3
            r0.f8903h = r1
            r0.f8904i = r2
            r0.<init>()
            return
    }

    @Override // tg.e
    public final java.lang.Object e(java.lang.Object r2, wf.c r3) {
            r1 = this;
            int r3 = r1.f8902g
            switch(r3) {
                case 0: goto L63;
                case 1: goto L3a;
                default: goto L5;
            }
        L5:
            n.j r2 = (n.j) r2
            boolean r3 = r2 instanceof n.m
            java.util.ArrayList r0 = r1.f8903h
            if (r3 == 0) goto L11
            r0.add(r2)
            goto L28
        L11:
            boolean r3 = r2 instanceof n.n
            if (r3 == 0) goto L1d
            n.n r2 = (n.n) r2
            n.m r2 = r2.f8913a
            r0.remove(r2)
            goto L28
        L1d:
            boolean r3 = r2 instanceof n.l
            if (r3 == 0) goto L28
            n.l r2 = (n.l) r2
            n.m r2 = r2.f8912a
            r0.remove(r2)
        L28:
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            i0.a1 r3 = r1.f8904i
            r3.setValue(r2)
            sf.n r2 = sf.n.f12433a
            return r2
        L3a:
            n.j r2 = (n.j) r2
            boolean r3 = r2 instanceof n.h
            java.util.ArrayList r0 = r1.f8903h
            if (r3 == 0) goto L46
            r0.add(r2)
            goto L51
        L46:
            boolean r3 = r2 instanceof n.i
            if (r3 == 0) goto L51
            n.i r2 = (n.i) r2
            n.h r2 = r2.f8910a
            r0.remove(r2)
        L51:
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            i0.a1 r3 = r1.f8904i
            r3.setValue(r2)
            sf.n r2 = sf.n.f12433a
            return r2
        L63:
            n.j r2 = (n.j) r2
            boolean r3 = r2 instanceof n.b
            java.util.ArrayList r0 = r1.f8903h
            if (r3 == 0) goto L6f
            r0.add(r2)
            goto L86
        L6f:
            boolean r3 = r2 instanceof n.c
            if (r3 == 0) goto L7b
            n.c r2 = (n.c) r2
            n.b r2 = r2.f8901a
            r0.remove(r2)
            goto L86
        L7b:
            boolean r3 = r2 instanceof n.a
            if (r3 == 0) goto L86
            n.a r2 = (n.a) r2
            n.b r2 = r2.f8900a
            r0.remove(r2)
        L86:
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            i0.a1 r3 = r1.f8904i
            r3.setValue(r2)
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
