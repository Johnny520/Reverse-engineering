package p174m;

/* JADX INFO: renamed from: m.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2596f {

    /* JADX INFO: renamed from: a */
    public static final C2591e f8409a = C2591e.f8391a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    default float mo6056a(float f3, float f10, float f11) {
        f8409a.getClass();
        float f12 = f10 + f3;
        if ((f3 >= 0.0f && f12 <= f11) || (f3 < 0.0f && f12 > f11)) {
            return 0.0f;
        }
        float f13 = f12 - f11;
        return Math.abs(f3) < Math.abs(f13) ? f3 : f13;
    }
}
