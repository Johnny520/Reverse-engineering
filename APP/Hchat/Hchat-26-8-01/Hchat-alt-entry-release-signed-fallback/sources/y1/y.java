package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1.z f22162h;

    public /* synthetic */ y(y1.z r1, int r2) {
            r0 = this;
            r0.f22161g = r2
            r0.f22162h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f22161g
            switch(r0) {
                case 0: goto L29;
                default: goto L5;
            }
        L5:
            y1.e2 r6 = (y1.e2) r6
            java.util.List r0 = r6.f21882h
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L10
            goto L26
        L10:
            y1.z r0 = r5.f22162h
            y1.t r1 = r0.f22166j
            x1.t1 r1 = r1.getSnapshotObserver()
            y1.y r2 = r0.S
            c1.b r3 = new c1.b
            r4 = 9
            r3.<init>(r6, r4, r0)
            w0.s r0 = r1.f21066a
            r0.c(r6, r2, r3)
        L26:
            sf.n r6 = sf.n.f12433a
            return r6
        L29:
            android.view.accessibility.AccessibilityEvent r6 = (android.view.accessibility.AccessibilityEvent) r6
            y1.z r0 = r5.f22162h
            y1.t r0 = r0.f22166j
            android.view.ViewParent r1 = r0.getParent()
            boolean r6 = r1.requestSendAccessibilityEvent(r0, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
    }
}
