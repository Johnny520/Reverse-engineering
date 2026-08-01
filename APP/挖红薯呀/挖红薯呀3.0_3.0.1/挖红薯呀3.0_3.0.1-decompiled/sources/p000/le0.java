package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class le0 extends oe0 implements InterfaceC1005zi, r50 {

    /* JADX INFO: renamed from: r */
    public LinkedHashMap f3424r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        float f = ((C0520np) pf1.m3058r(this, j30.f2669c)).f4301d;
        if (f < 0.0f) {
            f = 0.0f;
        }
        xq0 xq0VarMo184e = sd0Var.mo184e(j);
        boolean z = this.f4542q && !Float.isNaN(f) && C0520np.m2731a(f, 0.0f) > 0;
        int iMo641F = !Float.isNaN(f) ? zd0Var.mo641F(f) : 0;
        int iMax = xq0VarMo184e.f7400d;
        if (z) {
            iMax = Math.max(iMax, iMo641F);
        }
        int iMax2 = xq0VarMo184e.f7401e;
        if (z) {
            iMax2 = Math.max(iMax2, iMo641F);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.f3424r;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f3424r = linkedHashMap;
            }
            ac1 ac1Var = j30.f2668b;
            int iRound = Math.round((iMo641F - xq0VarMo184e.f7400d) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(ac1Var, Integer.valueOf(iRound));
            C0110cz c0110cz = j30.f2667a;
            int iRound2 = Math.round((iMo641F - xq0VarMo184e.f7401e) / 2.0f);
            linkedHashMap.put(c0110cz, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.f3424r;
        if (map == null) {
            map = C0330is.f2614d;
        }
        return zd0Var.mo1279Q(iMax, iMax2, map, new o20(iMax, xq0VarMo184e, iMax2));
    }
}
