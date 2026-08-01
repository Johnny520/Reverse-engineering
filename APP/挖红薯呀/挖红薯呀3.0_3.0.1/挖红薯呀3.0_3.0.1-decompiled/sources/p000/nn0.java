package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class nn0 implements f70 {

    /* JADX INFO: renamed from: a */
    public final C0399km f4299a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nn0(C0399km c0399km) {
        this.f4299a = c0399km;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: a */
    public final int mo1044a() {
        return this.f4299a.mo1941n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: b */
    public final int mo1045b() {
        return Math.min(r1.mo1941n() - 1, ((ae0) AbstractC0960ye.m5246P(this.f4299a.m2038m().f7937a)).f133a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: c */
    public final boolean mo1046c() {
        return !this.f4299a.m2038m().f7937a.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: d */
    public final int mo1047d() {
        int i;
        C0399km c0399km = this.f4299a;
        if (c0399km.m2038m().f7937a.size() == 0) {
            return 0;
        }
        int iM4914u = w60.m4914u(c0399km.m2038m());
        int i2 = c0399km.m2038m().f7938b + c0399km.m2038m().f7939c;
        if (i2 != 0 && (i = iM4914u / i2) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f70
    /* JADX INFO: renamed from: e */
    public final int mo1048e() {
        return Math.max(0, this.f4299a.f3544e);
    }
}
