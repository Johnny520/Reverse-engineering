package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements y1.v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.graphics.Matrix f22144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f22145h;

    public w0() {
            r1 = this;
            r1.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f22144g = r0
            r0 = 2
            int[] r0 = new int[r0]
            r1.f22145h = r0
            return
    }

    @Override // y1.v0
    public void h(android.view.View r7, float[] r8) {
            r6 = this;
            android.graphics.Matrix r0 = r6.f22144g
            r0.reset()
            j2.b.p(r7, r0)
            android.view.ViewParent r1 = r7.getParent()
        Lc:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L18
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            android.view.ViewParent r1 = r7.getParent()
            goto Lc
        L18:
            int[] r1 = r6.f22145h
            r7.getLocationOnScreen(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r5 = r1[r4]
            r7.getLocationInWindow(r1)
            r7 = r1[r2]
            r1 = r1[r4]
            int r7 = r7 - r3
            float r7 = (float) r7
            int r1 = r1 - r5
            float r1 = (float) r1
            r0.postTranslate(r7, r1)
            f1.c0.q(r0, r8)
            return
    }
}
