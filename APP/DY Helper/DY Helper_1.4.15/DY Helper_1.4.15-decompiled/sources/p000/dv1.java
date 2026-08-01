package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dv1 extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* JADX INFO: renamed from: ε */
    public final float f3301;

    /* JADX INFO: renamed from: ζ */
    public final p000.x91 f3302;

    /* JADX INFO: renamed from: η */
    public final p000.C0296fs f3303;

    public dv1(p000.AbstractC0682pc r3, float r4) {
            r2 = this;
            r2.<init>()
            r2.f3301 = r4
            jw1 r3 = new jw1
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r3.<init>(r0)
            x91 r3 = p000.j81.m2882(r3)
            r2.f3302 = r3
            η r3 = new η
            r4 = 15
            r3.<init>(r4, r2)
            m6 r4 = p000.gx1.f4502
            fs r4 = new fs
            r4.<init>(r3)
            r2.f3303 = r4
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            float r0 = r1.f3301
            p000.AbstractC0978xb.m6577(r2, r0)
            fs r1 = r1.f3303
            java.lang.Object r1 = r1.getValue()
            android.graphics.Shader r1 = (android.graphics.Shader) r1
            r2.setShader(r1)
            return
    }
}
