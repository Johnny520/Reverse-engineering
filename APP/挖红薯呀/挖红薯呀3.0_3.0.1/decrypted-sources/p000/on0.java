package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class on0 implements InterfaceC0386kb {

    /* JADX INFO: renamed from: b */
    public final C0399km f4597b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0386kb f4598c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public on0(C0399km c0399km, InterfaceC0386kb interfaceC0386kb) {
        this.f4597b = c0399km;
        this.f4598c = interfaceC0386kb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0386kb
    /* JADX INFO: renamed from: a */
    public final float mo1782a(float f, float f2, float f3) {
        float fMo1782a = this.f4598c.mo1782a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f ? f + f2 <= 0.0f : f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fMo1782a);
        C0399km c0399km = this.f4597b;
        if (fAbs == 0.0f || !z) {
            if (Math.abs(c0399km.f3545f) < 1.0E-6d) {
                return 0.0f;
            }
            float fM2040p = c0399km.f3545f * (-1.0f);
            if (((Boolean) c0399km.f3538G.getValue()).booleanValue()) {
                fM2040p += c0399km.m2040p();
            }
            return w60.m4906m(fM2040p, -f3, f3);
        }
        float fM2040p2 = c0399km.f3545f * (-1.0f);
        while (fMo1782a > 0.0f && fM2040p2 < fMo1782a) {
            fM2040p2 += c0399km.m2040p();
        }
        while (fMo1782a < 0.0f && fM2040p2 > fMo1782a) {
            fM2040p2 -= c0399km.m2040p();
        }
        return fM2040p2;
    }
}
