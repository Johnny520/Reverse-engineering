package defpackage;

/* JADX INFO: renamed from: ᲈᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2343 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.ref.WeakReference f10101;

    public ViewTreeObserverOnPreDrawListenerC2343(defpackage.C0798 r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f10101 = r0
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r6 = this;
            r0 = 2
            java.lang.String r1 = "ViewTarget"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "OnGlobalLayoutListener called attachStateListener="
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L1a:
            java.lang.ref.WeakReference r6 = r6.f10101
            java.lang.Object r6 = r6.get()
            ᛴᲈᛶᛱ r6 = (defpackage.C0798) r6
            if (r6 == 0) goto L9c
            java.util.ArrayList r0 = r6.f3696
            android.widget.ImageView r1 = r6.f3695
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L2f
            goto L9c
        L2f:
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingRight()
            int r3 = r3 + r2
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r4 = 0
            if (r2 == 0) goto L42
            int r2 = r2.width
            goto L43
        L42:
            r2 = r4
        L43:
            int r5 = r1.getWidth()
            int r2 = r6.m1743(r5, r2, r3)
            int r3 = r1.getPaddingTop()
            int r5 = r1.getPaddingBottom()
            int r5 = r5 + r3
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 == 0) goto L5c
            int r4 = r3.height
        L5c:
            int r3 = r1.getHeight()
            int r3 = r6.m1743(r3, r4, r5)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > 0) goto L6a
            if (r2 != r4) goto L9c
        L6a:
            if (r3 > 0) goto L6e
            if (r3 != r4) goto L9c
        L6e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L77:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L87
            java.lang.Object r5 = r4.next()
            ᲀᛱᲇᛶ r5 = (defpackage.C1622) r5
            r5.m2934(r2, r3)
            goto L77
        L87:
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            boolean r2 = r1.isAlive()
            if (r2 == 0) goto L96
            ᲈᲁᲀᲇ r2 = r6.f3694
            r1.removeOnPreDrawListener(r2)
        L96:
            r1 = 0
            r6.f3694 = r1
            r0.clear()
        L9c:
            r6 = 1
            return r6
    }
}
