package p174m;

/* JADX INFO: renamed from: m.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2601g implements InterfaceC2596f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2596f
    /* JADX INFO: renamed from: a */
    public final float mo6056a(float f3, float f10, float f11) {
        float fAbs = Math.abs((f10 + f3) - f3);
        float f12 = (0.3f * f11) - (0.0f * fAbs);
        float f13 = f11 - f12;
        if ((fAbs <= f11) && f13 < fAbs) {
            f12 = f11 - fAbs;
        }
        return f3 - f12;
    }
}
