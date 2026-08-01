package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha extends defpackage.gt {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ha(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    private final void I(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.gt
    public final void p(int r2) {
            r1 = this;
            int r2 = r1.a
            switch(r2) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r1.b
            d60 r2 = (defpackage.d60) r2
            r0 = 1
            r2.d = r0
            java.lang.ref.WeakReference r2 = r2.e
            java.lang.Object r2 = r2.get()
            c60 r2 = (defpackage.c60) r2
            if (r2 == 0) goto L1e
            ka r2 = (defpackage.ka) r2
            r2.u()
            r2.invalidateSelf()
        L1e:
            return
    }

    @Override // defpackage.gt
    public final void q(android.graphics.Typeface r2, boolean r3) {
            r1 = this;
            int r2 = r1.a
            switch(r2) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            if (r3 == 0) goto L8
            goto L21
        L8:
            java.lang.Object r2 = r1.b
            d60 r2 = (defpackage.d60) r2
            r3 = 1
            r2.d = r3
            java.lang.ref.WeakReference r2 = r2.e
            java.lang.Object r2 = r2.get()
            c60 r2 = (defpackage.c60) r2
            if (r2 == 0) goto L21
            ka r2 = (defpackage.ka) r2
            r2.u()
            r2.invalidateSelf()
        L21:
            return
        L22:
            java.lang.Object r2 = r1.b
            com.google.android.material.chip.Chip r2 = (com.google.android.material.chip.Chip) r2
            ka r3 = r2.e
            boolean r0 = r3.C0
            if (r0 == 0) goto L2f
            java.lang.CharSequence r3 = r3.E
            goto L33
        L2f:
            java.lang.CharSequence r3 = r2.getText()
        L33:
            r2.setText(r3)
            r2.requestLayout()
            r2.invalidate()
            return
    }
}
