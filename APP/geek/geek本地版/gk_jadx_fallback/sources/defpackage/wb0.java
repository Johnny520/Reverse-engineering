package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 extends defpackage.ct {
    public final /* synthetic */ int d;
    public final /* synthetic */ defpackage.yb0 e;

    public /* synthetic */ wb0(defpackage.yb0 r1, int r2) {
            r0 = this;
            r0.d = r2
            r0.e = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ya0
    public final void a() {
            r4 = this;
            int r0 = r4.d
            r1 = 0
            yb0 r2 = r4.e
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            r2.O = r1
            androidx.appcompat.widget.ActionBarContainer r0 = r2.z
            r0.requestLayout()
            return
        L10:
            boolean r0 = r2.K
            if (r0 == 0) goto L21
            android.view.View r0 = r2.C
            if (r0 == 0) goto L21
            r3 = 0
            r0.setTranslationY(r3)
            androidx.appcompat.widget.ActionBarContainer r0 = r2.z
            r0.setTranslationY(r3)
        L21:
            androidx.appcompat.widget.ActionBarContainer r0 = r2.z
            r3 = 8
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContainer r0 = r2.z
            r3 = 0
            r0.setTransitioning(r3)
            r2.O = r1
            d4 r0 = r2.G
            if (r0 == 0) goto L3d
            xb0 r3 = r2.F
            r0.D(r3)
            r2.F = r1
            r2.G = r1
        L3d:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.y
            if (r0 == 0) goto L46
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.w90.c(r0)
        L46:
            return
    }
}
