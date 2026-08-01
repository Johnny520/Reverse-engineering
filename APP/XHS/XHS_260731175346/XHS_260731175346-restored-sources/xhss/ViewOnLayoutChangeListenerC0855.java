package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛴᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0855 implements android.view.View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2764;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2765;

    public /* synthetic */ ViewOnLayoutChangeListenerC0855(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2765 = r1
            r0.f2764 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            int r2 = r0.f2765
            java.lang.Object r3 = r0.f2764
            switch(r2) {
                case 0: goto L1d;
                default: goto L7;
            }
        L7:
            r4 = -353072543270981(0xfffebee1e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r1.removeOnLayoutChangeListener(r0)
            xhss.ᛴᛶᛴᛲ r0 = xhss.C0371.f1353
            android.app.Activity r3 = (android.app.Activity) r3
            r0.getClass()
            xhss.C0371.m722(r3)
            return
        L1d:
            android.view.View r0 = r1.getRootView()
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            xhss.ᲇᛵᛴᛲ r3 = (xhss.ViewOnAttachStateChangeListenerC1039) r3
            java.lang.Object r1 = r3.f3358
            xhss.ᛷᛴᛱᲀ r1 = (xhss.C0644) r1
            if (r0 == 0) goto L41
            int r2 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f97
            r2 = 0
            xhss.ᲀᛳᛲᛶ r0 = xhss.C0847.m1430(r2, r0)
            xhss.ᲇᲇᛱ r2 = new xhss.ᲇᲇᛱ
            java.lang.Object r3 = r3.f3357
            xhss.ᲇᲇᛱ r3 = (xhss.C1096) r3
            r2.<init>(r3)
            r1.m1126(r0, r2)
            goto L43
        L41:
            int r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f97
        L43:
            return
    }
}
