package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lr1 extends android.view.TouchDelegate {

    /* JADX INFO: renamed from: α */
    public final android.view.View f6752;

    /* JADX INFO: renamed from: β */
    public final android.graphics.Rect f6753;

    /* JADX INFO: renamed from: γ */
    public final android.graphics.Rect f6754;

    /* JADX INFO: renamed from: δ */
    public final android.graphics.Rect f6755;

    /* JADX INFO: renamed from: ε */
    public final int f6756;

    /* JADX INFO: renamed from: ζ */
    public boolean f6757;

    public lr1(android.view.View r5, android.graphics.Rect r6, android.graphics.Rect r7) {
            r4 = this;
            r4.<init>(r6, r5)
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f6756 = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.f6753 = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r4.f6755 = r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4.f6754 = r3
            r1.set(r6)
            r2.set(r6)
            int r6 = -r0
            r2.inset(r6, r6)
            r3.set(r7)
            r4.f6752 = r5
            return
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            int r2 = r9.getAction()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 == r5) goto L23
            if (r2 == r3) goto L23
            r6 = 3
            if (r2 == r6) goto L1b
            goto L3e
        L1b:
            boolean r2 = r8.f6757
            r8.f6757 = r4
        L1f:
            r7 = r5
            r5 = r2
            r2 = r7
            goto L40
        L23:
            boolean r2 = r8.f6757
            if (r2 == 0) goto L1f
            android.graphics.Rect r6 = r8.f6755
            boolean r6 = r6.contains(r0, r1)
            if (r6 != 0) goto L1f
            r5 = r2
            r2 = r4
            goto L40
        L32:
            android.graphics.Rect r2 = r8.f6753
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L3e
            r8.f6757 = r5
            r2 = r5
            goto L40
        L3e:
            r2 = r5
            r5 = r4
        L40:
            if (r5 == 0) goto L6e
            android.graphics.Rect r4 = r8.f6754
            android.view.View r8 = r8.f6752
            if (r2 == 0) goto L5e
            boolean r2 = r4.contains(r0, r1)
            if (r2 != 0) goto L5e
            int r0 = r8.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r1 = r8.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            r9.setLocation(r0, r1)
            goto L69
        L5e:
            int r2 = r4.left
            int r0 = r0 - r2
            float r0 = (float) r0
            int r2 = r4.top
            int r1 = r1 - r2
            float r1 = (float) r1
            r9.setLocation(r0, r1)
        L69:
            boolean r8 = r8.dispatchTouchEvent(r9)
            return r8
        L6e:
            return r4
    }
}
