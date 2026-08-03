package p174m;

/* JADX INFO: renamed from: m.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2642q implements InterfaceC2660u1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2646r f8630a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2642q(C2646r c2646r) {
        this.f8630a = c2646r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2660u1
    /* JADX INFO: renamed from: a */
    public final float mo6077a(float f3) {
        if (Float.isNaN(f3)) {
            return 0.0f;
        }
        C2646r c2646r = this.f8630a;
        float fFloatValue = ((Number) c2646r.f8638a.invoke(Float.valueOf(f3))).floatValue();
        c2646r.f8642e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        c2646r.f8643f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
