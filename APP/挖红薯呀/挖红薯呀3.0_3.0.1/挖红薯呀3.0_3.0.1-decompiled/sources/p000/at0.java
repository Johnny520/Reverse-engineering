package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class at0 {

    /* JADX INFO: renamed from: a */
    public final h90 f264a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public at0(InterfaceC0298hw interfaceC0298hw) {
        this.f264a = new h90(interfaceC0298hw);
    }

    /* JADX INFO: renamed from: a */
    public abstract ct0 mo206a(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public cb1 mo207b() {
        return this.f264a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:11:0x0022 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ar */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: ar */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: ar */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: ar */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: ar */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: ar */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: ar */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: ar */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final cb1 m208c(ct0 ct0Var, cb1 cb1Var) {
        Object obj = ct0Var.f890e;
        boolean z = ct0Var.f889d;
        C0028ar c0028ar = 0;
        c0028ar = 0;
        c0028ar = 0;
        c0028ar = 0;
        c0028ar = 0;
        if (cb1Var instanceof C0028ar) {
            if (z) {
                c0028ar = (C0028ar) cb1Var;
                c0028ar.f243a.setValue(ct0Var.m602a());
            }
        } else if ((cb1Var instanceof h41) && ((ct0Var.f887b || obj != null) && !z)) {
            h41 h41Var = (h41) cb1Var;
            if (p30.m3002l(ct0Var.m602a(), h41Var.f2142a)) {
                c0028ar = h41Var;
            }
        }
        if (c0028ar != 0) {
            return c0028ar;
        }
        if (!z) {
            return new h41(ct0Var.m602a());
        }
        C0496n2 c0496n2 = ct0Var.f888c;
        if (c0496n2 == null) {
            c0496n2 = C0496n2.f4141U;
        }
        return new C0028ar(new gp0(obj, c0496n2));
    }
}
