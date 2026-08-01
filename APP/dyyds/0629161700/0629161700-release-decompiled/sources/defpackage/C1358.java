package defpackage;

/* JADX INFO: renamed from: ᛷᲀᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1358 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f5943;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0375 f5944;

    public C1358(defpackage.C0375 r1) {
            r0 = this;
            r0.f5944 = r1
            r0.<init>()
            r1 = 1
            r0.f5943 = r1
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent r4) {
            r3 = this;
            boolean r0 = r3.f5943
            if (r0 != 0) goto L5
            goto L49
        L5:
            ᛲᲇᛷᲁ r3 = r3.f5944
            android.view.View r0 = r3.m1104(r4)
            if (r0 == 0) goto L49
            ᛱᛳᛶᛱ r1 = r3.f1945
            ᲈᛸᲈᛷ r0 = r1.m439(r0)
            if (r0 == 0) goto L49
            ᛱᛳᛶᛱ r1 = r3.f1945
            r2 = 196611(0x30003, float:2.7551E-40)
            int r1 = r1.getLayoutDirection()
            int r1 = defpackage.AbstractC0094.m586(r2, r1)
            r2 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            if (r1 == 0) goto L49
            r1 = 0
            int r1 = r4.getPointerId(r1)
            int r2 = r3.f1926
            if (r1 != r2) goto L49
            int r1 = r4.findPointerIndex(r2)
            float r2 = r4.getX(r1)
            float r4 = r4.getY(r1)
            r3.f1935 = r2
            r3.f1933 = r4
            r4 = 0
            r3.f1927 = r4
            r3.f1924 = r4
            r4 = 2
            r3.m1113(r0, r4)
        L49:
            return
    }
}
