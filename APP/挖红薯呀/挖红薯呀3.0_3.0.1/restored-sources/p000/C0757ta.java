package p000;

/* JADX INFO: renamed from: ta */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0757ta extends te0 {

    /* JADX INFO: renamed from: a */
    public final float f5963a;

    /* JADX INFO: renamed from: b */
    public final g31 f5964b;

    /* JADX INFO: renamed from: c */
    public final x01 f5965c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0757ta(float f, g31 g31Var, x01 x01Var) {
        this.f5963a = f;
        this.f5964b = g31Var;
        this.f5965c = x01Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new C0719sa(this.f5963a, this.f5964b, this.f5965c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0757ta)) {
            return false;
        }
        C0757ta c0757ta = (C0757ta) obj;
        return C0520np.m2732b(this.f5963a, c0757ta.f5963a) && this.f5964b.equals(c0757ta.f5964b) && p30.m3002l(this.f5965c, c0757ta.f5965c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        C0719sa c0719sa = (C0719sa) oe0Var;
        float f = c0719sa.f5726u;
        C0469mc c0469mc = c0719sa.f5729x;
        float f2 = this.f5963a;
        if (!C0520np.m2732b(f, f2)) {
            c0719sa.f5726u = f2;
            c0469mc.m2491w0();
        }
        g31 g31Var = c0719sa.f5727v;
        g31 g31Var2 = this.f5964b;
        if (!p30.m3002l(g31Var, g31Var2)) {
            c0719sa.f5727v = g31Var2;
            c0469mc.m2491w0();
        }
        x01 x01Var = c0719sa.f5728w;
        x01 x01Var2 = this.f5965c;
        if (p30.m3002l(x01Var, x01Var2)) {
            return;
        }
        c0719sa.f5728w = x01Var2;
        c0469mc.m2491w0();
        z60.m5417D(c0719sa);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5965c.hashCode() + ((this.f5964b.hashCode() + (Float.hashCode(this.f5963a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C0520np.m2733c(this.f5963a)) + ", brush=" + this.f5964b + ", shape=" + this.f5965c + ')';
    }
}
