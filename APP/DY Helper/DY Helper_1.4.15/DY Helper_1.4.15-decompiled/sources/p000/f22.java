package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f22 extends android.util.Property {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3736;

    public /* synthetic */ f22(int r1, java.lang.Class r2, java.lang.String r3) {
            r0 = this;
            r0.f3736 = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // android.util.Property
    public final java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f3736
            switch(r0) {
                case 0: goto L17;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r0 = r1.getClipBounds()
            return r0
        Lc:
            android.view.View r1 = (android.view.View) r1
            float r0 = r1.getTransitionAlpha()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L17:
            androidx.appcompat.widget.SwitchCompat r1 = (androidx.appcompat.widget.SwitchCompat) r1
            float r0 = r1.f698
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    @Override // android.util.Property
    public final void set(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.f3736
            switch(r0) {
                case 0: goto L19;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            r1.setClipBounds(r2)
            return
        Ld:
            android.view.View r1 = (android.view.View) r1
            java.lang.Float r2 = (java.lang.Float) r2
            float r0 = r2.floatValue()
            r1.setTransitionAlpha(r0)
            return
        L19:
            androidx.appcompat.widget.SwitchCompat r1 = (androidx.appcompat.widget.SwitchCompat) r1
            java.lang.Float r2 = (java.lang.Float) r2
            float r0 = r2.floatValue()
            r1.setThumbPosition(r0)
            return
    }
}
