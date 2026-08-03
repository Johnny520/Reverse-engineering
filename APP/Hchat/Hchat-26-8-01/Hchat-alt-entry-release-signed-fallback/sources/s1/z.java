package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.a0 f12329h;

    public /* synthetic */ z(s1.a0 r1, int r2) {
            r0 = this;
            r0.f12328g = r2
            r0.f12329h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f12328g
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            s1.a0 r0 = r1.f12329h
            s1.b0 r0 = r0.f12203a
            if (r0 == 0) goto L13
            r0.invoke(r2)
            sf.n r2 = sf.n.f12433a
            return r2
        L13:
            java.lang.String r2 = "onTouchEvent"
            gg.l.g(r2)
            r2 = 0
            throw r2
        L1a:
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            s1.a0 r0 = r1.f12329h
            s1.b0 r0 = r0.f12203a
            if (r0 == 0) goto L28
            r0.invoke(r2)
            sf.n r2 = sf.n.f12433a
            return r2
        L28:
            java.lang.String r2 = "onTouchEvent"
            gg.l.g(r2)
            r2 = 0
            throw r2
    }
}
