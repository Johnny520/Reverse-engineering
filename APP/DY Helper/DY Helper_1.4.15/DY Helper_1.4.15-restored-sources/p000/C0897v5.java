package p000;

/* JADX INFO: renamed from: v5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0897v5 implements android.widget.PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.ViewTreeObserverOnGlobalLayoutListenerC0194d f11105;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.appcompat.widget.C0031 f11106;

    public C0897v5(androidx.appcompat.widget.C0031 r1, p000.ViewTreeObserverOnGlobalLayoutListenerC0194d r2) {
            r0 = this;
            r0.<init>()
            r0.f11106 = r1
            r0.f11105 = r2
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r1 = this;
            androidx.appcompat.widget.δ r0 = r1.f11106
            androidx.appcompat.widget.AppCompatSpinner r0 = r0.f814
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto Lf
            d r1 = r1.f11105
            r0.removeGlobalOnLayoutListener(r1)
        Lf:
            return
    }
}
