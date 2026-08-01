package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fq0 extends gq0 implements InterfaceC0057bj {

    /* JADX INFO: renamed from: g */
    public static final fq0 f1796g = new fq0(l91.f3393e, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final fq0 m1175b(at0 at0Var, cb1 cb1Var) {
        C0070bw c0070bwM2004u = this.f2037d.m2004u(at0Var.hashCode(), 0, at0Var, cb1Var);
        return c0070bwM2004u == null ? this : new fq0((l91) c0070bwM2004u.f595e, this.f2038e + c0070bwM2004u.f594d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gq0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof at0) {
            return super.containsKey((at0) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gq0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof cb1) {
            return super.containsValue((cb1) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gq0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof at0) {
            return (cb1) super.get((at0) obj);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof at0) ? obj2 : (cb1) super.getOrDefault((at0) obj, (cb1) obj2);
    }
}
