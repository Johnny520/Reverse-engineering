package p000;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0712q5 extends androidx.appcompat.widget.AbstractViewOnTouchListenerC0033 {

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ androidx.appcompat.widget.C0031 f8868;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner f8869;

    public C0712q5(androidx.appcompat.widget.AppCompatSpinner r1, androidx.appcompat.widget.AppCompatSpinner r2, androidx.appcompat.widget.C0031 r3) {
            r0 = this;
            r0.f8869 = r1
            r0.f8868 = r3
            r0.<init>(r2)
            return
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0033
    /* JADX INFO: renamed from: β */
    public final p000.ew1 mo317() {
            r0 = this;
            androidx.appcompat.widget.δ r0 = r0.f8868
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0033
    /* JADX INFO: renamed from: γ */
    public final boolean mo318() {
            r2 = this;
            androidx.appcompat.widget.AppCompatSpinner r2 = r2.f8869
            x5 r0 = r2.getInternalPopup()
            boolean r0 = r0.mo5365()
            if (r0 != 0) goto L19
            x5 r0 = r2.f583
            int r1 = r2.getTextDirection()
            int r2 = r2.getTextAlignment()
            r0.mo334(r1, r2)
        L19:
            r2 = 1
            return r2
    }
}
