package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bv extends defpackage.kr implements defpackage.nu {
    public static final java.lang.reflect.Method D = null;
    public defpackage.l0 C;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoSuchMethodException -> L17
            r1 = 28
            if (r0 > r1) goto L16
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r1 = "setTouchModal"
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L17
            defpackage.bv.D = r0     // Catch: java.lang.NoSuchMethodException -> L17
        L16:
            return
        L17:
            java.lang.String r0 = "MenuPopupWindow"
            java.lang.String r1 = "Could not find method setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
            return
    }

    @Override // defpackage.kr
    public final defpackage.kh a(android.content.Context r2, boolean r3) {
            r1 = this;
            av r0 = new av
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }

    @Override // defpackage.nu
    public final void p(defpackage.ku r2, android.view.MenuItem r3) {
            r1 = this;
            l0 r0 = r1.C
            if (r0 == 0) goto L7
            r0.p(r2, r3)
        L7:
            return
    }

    @Override // defpackage.nu
    public final void r(defpackage.ku r2, defpackage.ou r3) {
            r1 = this;
            l0 r0 = r1.C
            if (r0 == 0) goto L7
            r0.r(r2, r3)
        L7:
            return
    }
}
