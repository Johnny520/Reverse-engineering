package p227r;

/* JADX INFO: renamed from: r.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2998l implements InterfaceC2991h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3000m f9492a;

    public C2998l(C3000m c3000m) {
        this.f9492a = c3000m;
    }

    @Override // p227r.InterfaceC2991h0
    /* JADX INFO: renamed from: a */
    public final float mo5202a(float f2) {
        if (Float.isNaN(f2)) {
            return 0.0f;
        }
        C3000m c3000m = this.f9492a;
        float fFloatValue = ((Number) c3000m.f9493a.mo1h(Float.valueOf(f2))).floatValue();
        c3000m.f9497e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        c3000m.f9498f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
