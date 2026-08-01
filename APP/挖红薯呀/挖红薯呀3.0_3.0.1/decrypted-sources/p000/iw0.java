package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class iw0 implements xd0, fw0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0794u8 f2632a;

    /* JADX INFO: renamed from: b */
    public final C0239ga f2633b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public iw0(InterfaceC0794u8 interfaceC0794u8, C0239ga c0239ga) {
        this.f2632a = interfaceC0794u8;
        this.f2633b = c0239ga;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: a */
    public final yd0 mo1190a(xq0[] xq0VarArr, zd0 zd0Var, int[] iArr, int i, int i2) {
        return zd0Var.mo1279Q(i, i2, C0330is.f2614d, new C0340j2(xq0VarArr, this, i2, iArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: b */
    public final int mo1223b(l30 l30Var, List list, int i) {
        int iMo641F = l30Var.mo641F(this.f2632a.mo3374a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo641F, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            sd0 sd0Var = (sd0) list.get(i2);
            float fM4274q = u50.m4274q(u50.m4272o(sd0Var));
            if (fM4274q == 0.0f) {
                int iMin2 = Math.min(sd0Var.mo182O(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, sd0Var.mo185f(iMin2));
            } else if (fM4274q > 0.0f) {
                f += fM4274q;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            sd0 sd0Var2 = (sd0) list.get(i3);
            float fM4274q2 = u50.m4274q(u50.m4272o(sd0Var2));
            if (fM4274q2 > 0.0f) {
                iMax = Math.max(iMax, sd0Var2.mo185f(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM4274q2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: c */
    public final int mo1224c(l30 l30Var, List list, int i) {
        int iMo641F = l30Var.mo641F(this.f2632a.mo3374a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            sd0 sd0Var = (sd0) list.get(i3);
            float fM4274q = u50.m4274q(u50.m4272o(sd0Var));
            int iMo182O = sd0Var.mo182O(i);
            if (fM4274q == 0.0f) {
                i2 += iMo182O;
            } else if (fM4274q > 0.0f) {
                f += fM4274q;
                iMax = Math.max(iMax, Math.round(iMo182O / fM4274q));
            }
        }
        return ((list.size() - 1) * iMo641F) + Math.round(iMax * f) + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: d */
    public final void mo1191d(int i, int[] iArr, int[] iArr2, zd0 zd0Var) {
        this.f2632a.mo3375b(zd0Var, i, iArr, zd0Var.getLayoutDirection(), iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: e */
    public final long mo1192e(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC0654qj.m3254a(i, i2, 0, i3) : o30.m2775o(i, i2, 0, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw0)) {
            return false;
        }
        iw0 iw0Var = (iw0) obj;
        return this.f2632a.equals(iw0Var.f2632a) && this.f2633b.equals(iw0Var.f2633b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: f */
    public final int mo1193f(xq0 xq0Var) {
        return xq0Var.f7401e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: g */
    public final yd0 mo213g(zd0 zd0Var, List list, long j) {
        return v50.m4409o(this, C0617pj.m3139j(j), C0617pj.m3138i(j), C0617pj.m3137h(j), C0617pj.m3136g(j), zd0Var.mo641F(this.f2632a.mo3374a()), zd0Var, list, new xq0[list.size()], list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: h */
    public final int mo1225h(l30 l30Var, List list, int i) {
        int iMo641F = l30Var.mo641F(this.f2632a.mo3374a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo641F, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            sd0 sd0Var = (sd0) list.get(i2);
            float fM4274q = u50.m4274q(u50.m4272o(sd0Var));
            if (fM4274q == 0.0f) {
                int iMin2 = Math.min(sd0Var.mo182O(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, sd0Var.mo183R(iMin2));
            } else if (fM4274q > 0.0f) {
                f += fM4274q;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            sd0 sd0Var2 = (sd0) list.get(i3);
            float fM4274q2 = u50.m4274q(u50.m4272o(sd0Var2));
            if (fM4274q2 > 0.0f) {
                iMax = Math.max(iMax, sd0Var2.mo183R(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM4274q2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f2633b.f1897a) + (this.f2632a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: i */
    public final int mo1194i(xq0 xq0Var) {
        return xq0Var.f7400d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: j */
    public final int mo1226j(l30 l30Var, List list, int i) {
        int iMo641F = l30Var.mo641F(this.f2632a.mo3374a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            sd0 sd0Var = (sd0) list.get(i3);
            float fM4274q = u50.m4274q(u50.m4272o(sd0Var));
            int iMo181I = sd0Var.mo181I(i);
            if (fM4274q == 0.0f) {
                i2 += iMo181I;
            } else if (fM4274q > 0.0f) {
                f += fM4274q;
                iMax = Math.max(iMax, Math.round(iMo181I / fM4274q));
            }
        }
        return ((list.size() - 1) * iMo641F) + Math.round(iMax * f) + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f2632a + ", verticalAlignment=" + this.f2633b + ')';
    }
}
