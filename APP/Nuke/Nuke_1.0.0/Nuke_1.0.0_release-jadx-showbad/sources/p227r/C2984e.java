package p227r;

/* JADX INFO: renamed from: r.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2984e implements InterfaceC2982d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227r.InterfaceC2982d
    /* JADX INFO: renamed from: a */
    public final float mo5197a(float f2, float f5, float f6) {
        float fAbs = Math.abs((f5 + f2) - f2);
        float f7 = (0.3f * f6) - (0.0f * fAbs);
        float f8 = f6 - f7;
        if ((fAbs <= f6) && f8 < fAbs) {
            f7 = f6 - fAbs;
        }
        return f2 - f7;
    }
}
