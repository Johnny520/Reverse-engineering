package p000;

/* JADX INFO: renamed from: ec */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0167ec implements InterfaceC0331iu {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1371d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1372e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0167ec(int i, Object obj) {
        this.f1371d = i;
        this.f1372e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0331iu
    /* JADX INFO: renamed from: f */
    public final Object mo827f(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f1371d;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f1372e;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                c31 c31Var = (c31) obj2;
                if (f30Var instanceof C0264gz) {
                    c31Var.add(f30Var);
                } else if (f30Var instanceof C0301hz) {
                    c31Var.remove(((C0301hz) f30Var).f2378a);
                } else if (f30Var instanceof C0702ru) {
                    c31Var.add(f30Var);
                } else if (f30Var instanceof C0739su) {
                    c31Var.remove(((C0739su) f30Var).f5836a);
                } else if (f30Var instanceof js0) {
                    c31Var.add(f30Var);
                } else if (f30Var instanceof ks0) {
                    c31Var.remove(((ks0) f30Var).f3260a);
                } else if (f30Var instanceof is0) {
                    c31Var.remove(((is0) f30Var).f2615a);
                }
                break;
            default:
                ((yf0) obj2).f7619d.m597h(((Number) obj).floatValue());
                break;
        }
        return na1Var;
    }
}
