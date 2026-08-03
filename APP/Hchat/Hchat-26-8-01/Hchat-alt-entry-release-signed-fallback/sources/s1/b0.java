package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x2.v f12209h;

    public /* synthetic */ b0(x2.v r1, int r2) {
            r0 = this;
            r0.f12208g = r2
            r0.f12209h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f12208g
            switch(r0) {
                case 0: goto L48;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            fg.l r3 = (fg.l) r3
            x2.v r0 = r2.f12209h
            r0.f21139w = r3
            sf.n r3 = sf.n.f12433a
            return r3
        Le:
            x1.r1 r3 = (x1.r1) r3
            boolean r0 = r3 instanceof y1.t
            if (r0 == 0) goto L17
            y1.t r3 = (y1.t) r3
            goto L18
        L17:
            r3 = 0
        L18:
            x2.v r0 = r2.f12209h
            if (r3 == 0) goto L42
            y1.r0 r1 = r3.getAndroidViewsHandler$ui()
            r1.removeViewInLayout(r0)
            y1.r0 r1 = r3.getAndroidViewsHandler$ui()
            java.util.HashMap r1 = r1.getLayoutNodeToHolder()
            y1.r0 r3 = r3.getAndroidViewsHandler$ui()
            java.util.HashMap r3 = r3.getHolderToLayoutNode()
            java.lang.Object r3 = r3.remove(r0)
            java.util.Map r1 = gg.x.b(r1)
            r1.remove(r3)
            r3 = 0
            r0.setImportantForAccessibility(r3)
        L42:
            r0.removeAllViewsInLayout()
            sf.n r3 = sf.n.f12433a
            return r3
        L48:
            android.view.MotionEvent r3 = (android.view.MotionEvent) r3
            int r0 = r3.getActionMasked()
            x2.v r1 = r2.f12209h
            switch(r0) {
                case 0: goto L58;
                case 1: goto L58;
                case 2: goto L58;
                case 3: goto L58;
                case 4: goto L58;
                case 5: goto L58;
                case 6: goto L58;
                default: goto L53;
            }
        L53:
            boolean r3 = r1.dispatchGenericMotionEvent(r3)
            goto L5c
        L58:
            boolean r3 = r1.dispatchTouchEvent(r3)
        L5c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
    }
}
