package i1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends android.view.ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6233a;

    public /* synthetic */ l(int r1) {
            r0 = this;
            r0.f6233a = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r3, android.graphics.Outline r4) {
            r2 = this;
            int r0 = r2.f6233a
            switch(r0) {
                case 0: goto L30;
                case 1: goto L27;
                case 2: goto L16;
                default: goto L5;
            }
        L5:
            int r0 = r3.getWidth()
            int r3 = r3.getHeight()
            r1 = 0
            r4.setRect(r1, r1, r0, r3)
            r3 = 0
            r4.setAlpha(r3)
            return
        L16:
            int r0 = r3.getWidth()
            int r3 = r3.getHeight()
            r1 = 0
            r4.setRect(r1, r1, r0, r3)
            r3 = 0
            r4.setAlpha(r3)
            return
        L27:
            r3.getClass()
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L30:
            boolean r0 = r3 instanceof i1.m
            if (r0 == 0) goto L3d
            i1.m r3 = (i1.m) r3
            android.graphics.Outline r3 = r3.f6239k
            if (r3 == 0) goto L3d
            r4.set(r3)
        L3d:
            return
    }
}
