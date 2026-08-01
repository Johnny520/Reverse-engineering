package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class dm0 extends pm0 {

    /* JADX INFO: renamed from: c */
    public static final dm0 f1156c = new dm0(0, 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pm0
    /* JADX INFO: renamed from: a */
    public final void mo186a(rm0 rm0Var, InterfaceC0643q8 interfaceC0643q8, z11 z11Var, iu0 iu0Var, qm0 qm0Var) {
        ht0 ht0Var = (ht0) rm0Var.m3517b(0);
        Set set = iu0Var.f2618a;
        if (set == null) {
            return;
        }
        zp0 zp0Var = new zp0(set);
        jh0 jh0Var = iu0Var.f2626i;
        if (jh0Var == null) {
            long[] jArr = dy0.f1212a;
            jh0Var = new jh0();
            iu0Var.f2626i = jh0Var;
        }
        jh0Var.m1707m(ht0Var, zp0Var);
        iu0Var.f2622e.m4072b(new ku0(zp0Var, -1));
    }
}
