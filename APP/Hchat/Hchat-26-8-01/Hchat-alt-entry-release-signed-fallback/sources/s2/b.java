package s2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1.p0 f12331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.j1 f12333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i0.x f12334j;

    public b(f1.p0 r3, float r4) {
            r2 = this;
            r2.<init>()
            r2.f12331g = r3
            r2.f12332h = r4
            e1.e r3 = new e1.e
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r3.<init>(r0)
            i0.j1 r3 = i0.r.u(r3)
            r2.f12333i = r3
            i.e0 r3 = new i.e0
            r4 = 18
            r3.<init>(r2, r4)
            i0.x r3 = i0.r.p(r3)
            r2.f12334j = r3
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r2) {
            r1 = this;
            float r0 = r1.f12332h
            q2.j.c(r2, r0)
            i0.x r0 = r1.f12334j
            java.lang.Object r0 = r0.getValue()
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            r2.setShader(r0)
            return
    }
}
