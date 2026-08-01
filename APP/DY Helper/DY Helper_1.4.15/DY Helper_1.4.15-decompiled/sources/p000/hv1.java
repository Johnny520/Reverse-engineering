package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hv1 extends android.text.style.CharacterStyle {

    /* JADX INFO: renamed from: α */
    public final int f4823;

    /* JADX INFO: renamed from: β */
    public final float f4824;

    /* JADX INFO: renamed from: γ */
    public final float f4825;

    /* JADX INFO: renamed from: δ */
    public final float f4826;

    public hv1(float r1, float r2, float r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f4823 = r4
            r0.f4824 = r1
            r0.f4825 = r2
            r0.f4826 = r3
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r4) {
            r3 = this;
            float r0 = r3.f4825
            int r1 = r3.f4823
            float r2 = r3.f4826
            float r3 = r3.f4824
            r4.setShadowLayer(r2, r3, r0, r1)
            return
    }
}
