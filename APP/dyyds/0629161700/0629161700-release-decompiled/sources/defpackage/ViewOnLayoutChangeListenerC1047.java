package defpackage;

/* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1047 implements android.view.View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.ViewOnTouchListenerC1074 f4638;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ double f4639;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ double f4640;

    public ViewOnLayoutChangeListenerC1047(defpackage.ViewOnTouchListenerC1074 r1, double r2, double r4) {
            r0 = this;
            r0.<init>()
            r0.f4638 = r1
            r0.f4639 = r2
            r0.f4640 = r4
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            r1.removeOnLayoutChangeListener(r0)
            r6 = r1
            r1 = r0
            ᛴᲀᲁᛴ r0 = new ᛴᲀᲁᛴ
            double r2 = r1.f4639
            double r4 = r1.f4640
            r0.<init>(r1, r2, r4, r6)
            r1 = 100
            r6.postDelayed(r0, r1)
            return
    }
}
