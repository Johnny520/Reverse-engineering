package defpackage;

/* JADX INFO: renamed from: ᛲᛶᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0306 implements defpackage.InterfaceC0099 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f1627;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1628;

    public /* synthetic */ C0306(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1627 = r1
            r0.f1628 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    private final void m982(boolean r1) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0099
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo592(boolean r2) {
            r1 = this;
            int r0 = r1.f1627
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            if (r2 != 0) goto L9
            goto L12
        L9:
            java.lang.Object r1 = r1.f1628
            ᛲᲇᛷᲁ r1 = (defpackage.C0375) r1
            r2 = 0
            r0 = 0
            r1.m1113(r2, r0)
        L12:
            return
    }

    @Override // defpackage.InterfaceC0099
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo593(android.view.MotionEvent r9) {
            r8 = this;
            int r0 = r8.f1627
            java.lang.Object r8 = r8.f1628
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            ᛱᲇᛴᛲ r8 = (defpackage.C0196) r8
            r8.m739(r9)
            return
        Ld:
            ᛲᲇᛷᲁ r8 = (defpackage.C0375) r8
            ᛳᛳᛵᛲ r0 = r8.f1931
            android.view.GestureDetector r1 = r8.f1942
            r1.onTouchEvent(r9)
            android.view.VelocityTracker r1 = r8.f1929
            if (r1 == 0) goto L1d
            r1.addMovement(r9)
        L1d:
            int r1 = r8.f1926
            r2 = -1
            if (r1 != r2) goto L23
            goto L86
        L23:
            int r1 = r9.getActionMasked()
            int r3 = r8.f1926
            int r3 = r9.findPointerIndex(r3)
            if (r3 < 0) goto L32
            r8.m1105(r1, r3, r9)
        L32:
            ᲈᛸᲈᛷ r4 = r8.f1937
            if (r4 != 0) goto L37
            goto L86
        L37:
            r5 = 0
            r6 = 1
            if (r1 == r6) goto L80
            r7 = 2
            if (r1 == r7) goto L68
            r0 = 3
            if (r1 == r0) goto L60
            r0 = 6
            if (r1 == r0) goto L45
            goto L86
        L45:
            int r0 = r9.getActionIndex()
            int r1 = r9.getPointerId(r0)
            int r2 = r8.f1926
            if (r1 != r2) goto L86
            if (r0 != 0) goto L54
            r5 = r6
        L54:
            int r1 = r9.getPointerId(r5)
            r8.f1926 = r1
            int r1 = r8.f1930
            r8.m1111(r1, r0, r9)
            goto L86
        L60:
            android.view.VelocityTracker r9 = r8.f1929
            if (r9 == 0) goto L80
            r9.clear()
            goto L80
        L68:
            if (r3 < 0) goto L86
            int r1 = r8.f1930
            r8.m1111(r1, r3, r9)
            r8.m1106(r4)
            ᛱᛳᛶᛱ r9 = r8.f1945
            r9.removeCallbacks(r0)
            r0.run()
            ᛱᛳᛶᛱ r8 = r8.f1945
            r8.invalidate()
            goto L86
        L80:
            r9 = 0
            r8.m1113(r9, r5)
            r8.f1926 = r2
        L86:
            return
    }

    @Override // defpackage.InterfaceC0099
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo594(android.view.MotionEvent r9) {
            r8 = this;
            int r0 = r8.f1627
            java.lang.Object r8 = r8.f1628
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            ᛱᲇᛴᛲ r8 = (defpackage.C0196) r8
            boolean r8 = r8.m739(r9)
            return r8
        Le:
            ᛲᲇᛷᲁ r8 = (defpackage.C0375) r8
            android.view.GestureDetector r0 = r8.f1942
            r0.onTouchEvent(r9)
            int r0 = r9.getActionMasked()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L97
            int r0 = r9.getPointerId(r3)
            r8.f1926 = r0
            float r0 = r9.getX()
            r8.f1935 = r0
            float r0 = r9.getY()
            r8.f1933 = r0
            android.view.VelocityTracker r0 = r8.f1929
            if (r0 == 0) goto L37
            r0.recycle()
        L37:
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r8.f1929 = r0
            ᲈᛸᲈᛷ r0 = r8.f1937
            if (r0 != 0) goto Lb1
            java.util.ArrayList r0 = r8.f1949
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L4a
            goto L66
        L4a:
            android.view.View r4 = r8.m1104(r9)
            int r5 = r0.size()
            int r5 = r5 - r2
        L53:
            if (r5 < 0) goto L66
            java.lang.Object r6 = r0.get(r5)
            ᛶᛱᲁᛳ r6 = (defpackage.C1017) r6
            ᲈᛸᲈᛷ r7 = r6.f4533
            android.view.View r7 = r7.f9791
            if (r7 != r4) goto L63
            r1 = r6
            goto L66
        L63:
            int r5 = r5 + (-1)
            goto L53
        L66:
            if (r1 == 0) goto Lb1
            ᲈᛸᲈᛷ r0 = r1.f4533
            float r4 = r8.f1935
            float r5 = r1.f4531
            float r4 = r4 - r5
            r8.f1935 = r4
            float r4 = r8.f1933
            float r5 = r1.f4538
            float r4 = r4 - r5
            r8.f1933 = r4
            r8.m1103(r0, r2)
            java.util.ArrayList r4 = r8.f1938
            android.view.View r5 = r0.f9791
            boolean r4 = r4.remove(r5)
            if (r4 == 0) goto L8c
            ᛱᛵᛷᲈ r4 = r8.f1934
            ᛱᛳᛶᛱ r5 = r8.f1945
            r4.mo588(r5, r0)
        L8c:
            int r1 = r1.f4541
            r8.m1113(r0, r1)
            int r0 = r8.f1930
            r8.m1111(r0, r3, r9)
            goto Lb1
        L97:
            r4 = 3
            r5 = -1
            if (r0 == r4) goto Lac
            if (r0 != r2) goto L9e
            goto Lac
        L9e:
            int r1 = r8.f1926
            if (r1 == r5) goto Lb1
            int r1 = r9.findPointerIndex(r1)
            if (r1 < 0) goto Lb1
            r8.m1105(r0, r1, r9)
            goto Lb1
        Lac:
            r8.f1926 = r5
            r8.m1113(r1, r3)
        Lb1:
            android.view.VelocityTracker r0 = r8.f1929
            if (r0 == 0) goto Lb8
            r0.addMovement(r9)
        Lb8:
            ᲈᛸᲈᛷ r8 = r8.f1937
            if (r8 == 0) goto Lbd
            goto Lbe
        Lbd:
            r2 = r3
        Lbe:
            return r2
    }
}
