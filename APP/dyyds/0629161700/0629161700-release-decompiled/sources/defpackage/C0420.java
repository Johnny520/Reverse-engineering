package defpackage;

/* JADX INFO: renamed from: ᛳᛲᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0420 extends android.view.TouchDelegate {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f2102;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.graphics.Rect f2103;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Rect f2104;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.view.View f2105;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Rect f2106;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f2107;

    public C0420(android.graphics.Rect r5, android.graphics.Rect r6, android.view.View r7) {
            r4 = this;
            r4.<init>(r5, r7)
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f2102 = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.f2106 = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r4.f2103 = r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4.f2104 = r3
            r1.set(r5)
            r2.set(r5)
            int r5 = -r0
            r2.inset(r5, r5)
            r3.set(r6)
            r4.f2105 = r7
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
            boolean r2 = r8.f2107
            r8.f2107 = r4
        L1f:
            r7 = r5
            r5 = r2
            r2 = r7
            goto L40
        L23:
            boolean r2 = r8.f2107
            if (r2 == 0) goto L1f
            android.graphics.Rect r6 = r8.f2103
            boolean r6 = r6.contains(r0, r1)
            if (r6 != 0) goto L1f
            r5 = r2
            r2 = r4
            goto L40
        L32:
            android.graphics.Rect r2 = r8.f2106
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L3e
            r8.f2107 = r5
            r2 = r5
            goto L40
        L3e:
            r2 = r5
            r5 = r4
        L40:
            if (r5 == 0) goto L6e
            android.graphics.Rect r4 = r8.f2104
            android.view.View r8 = r8.f2105
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
