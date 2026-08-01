package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 extends pm0 {

    /* JADX INFO: renamed from: c */
    public static final ul0 f6258c = new ul0(0, 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pm0
    /* JADX INFO: renamed from: a */
    public final void mo186a(rm0 rm0Var, InterfaceC0643q8 interfaceC0643q8, z11 z11Var, iu0 iu0Var, qm0 qm0Var) {
        sh0 sh0Var;
        ht0 ht0Var = (ht0) rm0Var.m3517b(0);
        jh0 jh0Var = iu0Var.f2626i;
        if (jh0Var == null || ((zp0) jh0Var.m1701g(ht0Var)) == null) {
            return;
        }
        ArrayList arrayList = iu0Var.f2627j;
        if (arrayList != null && (sh0Var = (sh0) arrayList.remove(arrayList.size() - 1)) != null) {
            iu0Var.f2622e = sh0Var;
        }
        jh0Var.m1705k(ht0Var);
    }
}
