package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x2.v f21122h;

    public /* synthetic */ g(x2.v r1, int r2) {
            r0 = this;
            r0.f21121g = r2
            r0.f21122h = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f21121g
            switch(r0) {
                case 0: goto L67;
                case 1: goto L3f;
                case 2: goto L32;
                case 3: goto L21;
                case 4: goto L13;
                default: goto L5;
            }
        L5:
            x2.v r0 = r4.f21122h
            android.view.View r1 = r0.G
            fg.l r0 = r0.getUpdateBlock()
            r0.invoke(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L13:
            x2.v r0 = r4.f21122h
            android.view.View r1 = r0.G
            fg.l r0 = r0.getResetBlock()
            r0.invoke(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L21:
            x2.v r0 = r4.f21122h
            android.view.View r1 = r0.G
            fg.l r2 = r0.getReleaseBlock()
            r2.invoke(r1)
            x2.v.h(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L32:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            x2.v r1 = r4.f21122h
            android.view.View r1 = r1.G
            r1.saveHierarchyState(r0)
            return r0
        L3f:
            x2.v r0 = r4.f21122h
            boolean r1 = r0.f21127k
            if (r1 == 0) goto L64
            boolean r1 = r0.isAttachedToWindow()
            if (r1 == 0) goto L64
            android.view.View r1 = r0.getView()
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != r0) goto L64
            x1.t1 r1 = x2.h.d(r0)
            x2.b r2 = x2.b.f21103h
            fg.a r3 = r0.getUpdate()
            w0.s r1 = r1.f21066a
            r1.c(r0, r2, r3)
        L64:
            sf.n r0 = sf.n.f12433a
            return r0
        L67:
            x2.v r0 = r4.f21122h
            x1.f0 r0 = r0.getLayoutNode()
            r0.B()
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
