package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d32 extends android.text.style.CharacterStyle {

    /* JADX INFO: renamed from: α */
    public final boolean f2877;

    /* JADX INFO: renamed from: β */
    public final boolean f2878;

    public d32(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f2877 = r1
            r0.f2878 = r2
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            boolean r0 = r1.f2877
            r2.setUnderlineText(r0)
            boolean r1 = r1.f2878
            r2.setStrikeThruText(r1)
            return
    }
}
