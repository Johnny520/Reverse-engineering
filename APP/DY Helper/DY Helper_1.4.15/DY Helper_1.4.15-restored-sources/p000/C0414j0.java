package p000;

/* JADX INFO: renamed from: j0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0414j0 extends p000.bp0 implements p000.g80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.C0452k0 f5279;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f5280;

    public C0414j0(p000.C0452k0 r1, int r2) {
            r0 = this;
            r0.f5279 = r1
            r0.f5280 = r2
            r1 = 4
            r0.<init>(r1)
            return
    }

    @Override // p000.g80
    /* JADX INFO: renamed from: ε */
    public final java.lang.Object mo183(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            k0 r0 = r3.f5279
            y21 r1 = r0.f5681
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.f5683
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r4, r5, r6, r7)
            java.lang.Object r4 = r1.f12428
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            int r3 = r3.f5280
            r4.notifyViewEntered(r0, r3, r2)
            s62 r3 = p000.s62.f9751
            return r3
    }
}
