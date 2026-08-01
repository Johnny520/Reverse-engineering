package p000;

/* JADX INFO: renamed from: rt */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class C0701rt extends te0 {

    /* JADX INFO: renamed from: a */
    public final EnumC0062bo f5552a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0701rt(EnumC0062bo enumC0062bo) {
        this.f5552a = enumC0062bo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        C0738st c0738st = new C0738st();
        c0738st.f5829r = this.f5552a;
        c0738st.f5830s = 1.0f;
        return c0738st;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0701rt) {
            return this.f5552a == ((C0701rt) obj).f5552a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        C0738st c0738st = (C0738st) oe0Var;
        c0738st.f5829r = this.f5552a;
        c0738st.f5830s = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.f5552a.hashCode() * 31);
    }
}
