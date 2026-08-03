package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x2.v f21109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x1.f0 f21110i;

    public /* synthetic */ c(x2.v r1, x1.f0 r2, int r3) {
            r0 = this;
            r0.f21108g = r3
            r0.f21109h = r1
            r0.f21110i = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f21108g
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L51;
                default: goto L5;
            }
        L5:
            v1.t r11 = (v1.t) r11
            x1.f0 r0 = r10.f21110i
            x2.v r1 = r10.f21109h
            x2.i.d(r1, r0)
            x1.r1 r0 = r1.f21125i
            y1.t r0 = (y1.t) r0
            r2 = 1
            r0.N = r2
            int[] r0 = r1.f21136t
            r3 = 0
            r4 = r0[r3]
            r5 = r0[r2]
            android.view.View r6 = r1.getView()
            r6.getLocationOnScreen(r0)
            long r6 = r1.f21137u
            long r8 = r11.F()
            r1.f21137u = r8
            g3.r0 r11 = r1.f21138v
            if (r11 == 0) goto L4e
            r3 = r0[r3]
            if (r4 != r3) goto L3d
            r0 = r0[r2]
            if (r5 != r0) goto L3d
            boolean r0 = u2.l.a(r6, r8)
            if (r0 != 0) goto L4e
        L3d:
            g3.r0 r11 = r1.g(r11)
            android.view.WindowInsets r11 = r11.b()
            if (r11 == 0) goto L4e
            android.view.View r0 = r1.getView()
            r0.dispatchApplyWindowInsets(r11)
        L4e:
            sf.n r11 = sf.n.f12433a
            return r11
        L51:
            v1.a1 r11 = (v1.a1) r11
            x2.v r11 = r10.f21109h
            x1.f0 r0 = r10.f21110i
            x2.i.d(r11, r0)
            sf.n r11 = sf.n.f12433a
            return r11
        L5d:
            x1.r1 r11 = (x1.r1) r11
            boolean r0 = r11 instanceof y1.t
            if (r0 == 0) goto L66
            y1.t r11 = (y1.t) r11
            goto L67
        L66:
            r11 = 0
        L67:
            x2.v r0 = r10.f21109h
            if (r11 == 0) goto L96
            y1.r0 r1 = r11.getAndroidViewsHandler$ui()
            java.util.HashMap r1 = r1.getHolderToLayoutNode()
            x1.f0 r2 = r10.f21110i
            r1.put(r0, r2)
            y1.r0 r1 = r11.getAndroidViewsHandler$ui()
            r1.addView(r0)
            y1.r0 r1 = r11.getAndroidViewsHandler$ui()
            java.util.HashMap r1 = r1.getLayoutNodeToHolder()
            r1.put(r2, r0)
            r1 = 1
            r0.setImportantForAccessibility(r1)
            y1.m r1 = new y1.m
            r1.<init>(r11, r2, r11)
            g3.q.a(r0, r1)
        L96:
            android.view.View r11 = r0.getView()
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == r0) goto La7
            android.view.View r11 = r0.getView()
            r0.addView(r11)
        La7:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
