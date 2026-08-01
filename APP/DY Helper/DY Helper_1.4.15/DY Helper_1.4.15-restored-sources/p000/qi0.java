package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9015;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f9016;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f9017;

    public /* synthetic */ qi0(int r1, android.view.View r2, java.lang.Object r3) {
            r0 = this;
            r0.f9015 = r1
            r0.f9016 = r2
            r0.f9017 = r3
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m4884(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            int r0 = r0.f9015
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            r1.getClass()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r3) {
            r2 = this;
            int r0 = r2.f9015
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            android.view.View r3 = r2.f9016
            r3.removeOnAttachStateChangeListener(r2)
            java.lang.Object r2 = r2.f9017
            kl1 r2 = (p000.kl1) r2
            r2.m3332()
            return
        L12:
            r3.getClass()
            android.view.View r0 = r2.f9016
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.Object r1 = r2.f9017
            androidx.appcompat.widget.AppCompatImageButton r1 = (androidx.appcompat.widget.AppCompatImageButton) r1
            r0.removeView(r1)     // Catch: java.lang.Throwable -> L20
        L20:
            r3.removeOnAttachStateChangeListener(r2)
            return
    }
}
