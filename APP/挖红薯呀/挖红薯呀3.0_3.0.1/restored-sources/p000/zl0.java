package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zl0 extends pm0 {

    /* JADX INFO: renamed from: c */
    public static final zl0 f7923c = new zl0(0, 3, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pm0
    /* JADX INFO: renamed from: a */
    public final void mo186a(rm0 rm0Var, InterfaceC0643q8 interfaceC0643q8, z11 z11Var, iu0 iu0Var, qm0 qm0Var) {
        C0111d c0111d;
        w11 w11Var = (w11) rm0Var.m3517b(1);
        C0788u2 c0788u2 = (C0788u2) rm0Var.m3517b(0);
        C0901wt c0901wt = (C0901wt) rm0Var.m3517b(2);
        z11 z11VarM4830d = w11Var.m4830d();
        if (qm0Var != null) {
            try {
                c0111d = new C0111d(16, qm0Var, z11Var);
            } catch (Throwable th) {
                z11VarM4830d.m5392e(false);
                throw th;
            }
        } else {
            c0111d = null;
        }
        if (!c0901wt.f7188b.m4091G()) {
            AbstractC0653qi.m3252a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c0901wt.f7187a.m4090F(interfaceC0643q8, z11VarM4830d, iu0Var, c0111d);
        z11VarM4830d.m5392e(true);
        z11Var.m5391d();
        c0788u2.getClass();
        z11Var.m5367A(w11Var, w11Var.m4827a(c0788u2));
        z11Var.m5397k();
    }
}
