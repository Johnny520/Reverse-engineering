package p000;

import java.util.List;

/* JADX INFO: renamed from: vf */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0838vf implements xd0, fw0 {

    /* JADX INFO: renamed from: a */
    public final C0202fa f6670a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0838vf(C0202fa c0202fa) {
        this.f6670a = c0202fa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: a */
    public final yd0 mo1190a(final xq0[] xq0VarArr, final zd0 zd0Var, final int[] iArr, int i, final int i2) {
        return zd0Var.mo1279Q(i2, i, C0330is.f2614d, new InterfaceC0742sw() { // from class: uf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                wq0 wq0Var = (wq0) obj;
                xq0[] xq0VarArr2 = xq0VarArr;
                int length = xq0VarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    xq0 xq0Var = xq0VarArr2[i3];
                    int i5 = i4 + 1;
                    xq0Var.getClass();
                    Object objMo50j = xq0Var.mo50j();
                    gw0 gw0Var = objMo50j instanceof gw0 ? (gw0) objMo50j : null;
                    k50 layoutDirection = zd0Var.getLayoutDirection();
                    C0213fl c0213fl = gw0Var != null ? gw0Var.f2084c : null;
                    int i6 = i2;
                    wq0.m5015i(wq0Var, xq0Var, c0213fl != null ? c0213fl.f1766a.m1072a(xq0Var.f7400d, i6, layoutDirection) : this.f6670a.m1072a(xq0Var.f7400d, i6, layoutDirection), iArr[i4]);
                    i3++;
                    i4 = i5;
                }
                return na1.f4229a;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: b */
    public final int mo1223b(l30 l30Var, List list, int i) {
        int iMo641F = l30Var.mo641F(0.0f);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        float f = 0.0f;
        int iMax = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            sd0 sd0Var = (sd0) list.get(i3);
            float fM4274q = u50.m4274q(u50.m4272o(sd0Var));
            int iMo185f = sd0Var.mo185f(i);
            if (fM4274q == 0.0f) {
                i2 += iMo185f;
            } else if (fM4274q > 0.0f) {
                f += fM4274q;
                iMax = Math.max(iMax, Math.round(iMo185f / fM4274q));
            }
        }
        return ((list.size() - 1) * iMo641F) + Math.round(iMax * f) + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: c */
    public final int mo1224c(l30 l30Var, List list, int i) {
        int iMo641F = l30Var.mo641F(0.0f);
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo641F, i);
        int size = list.size();
        float f = 0.0f;
        int iMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            sd0 sd0Var = (sd0) list.get(i2);
            float fM4274q = u50.m4274q(u50.m4272o(sd0Var));
            if (fM4274q == 0.0f) {
                int iMin2 = Math.min(sd0Var.mo185f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, sd0Var.mo182O(iMin2));
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
                iMax = Math.max(iMax, sd0Var2.mo182O(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM4274q2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: d */
    public final void mo1191d(int i, int[] iArr, int[] iArr2, zd0 zd0Var) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = iArr[i2];
            iArr2[i3] = i4;
            i4 += i5;
            i2++;
            i3++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: e */
    public final long mo1192e(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC0654qj.m3254a(0, i3, i, i2) : o30.m2774n(0, i3, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0838vf) && this.f6670a.equals(((C0838vf) obj).f6670a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: f */
    public final int mo1193f(xq0 xq0Var) {
        return xq0Var.f7400d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: g */
    public final yd0 mo213g(zd0 zd0Var, List list, long j) {
        return v50.m4409o(this, C0617pj.m3138i(j), C0617pj.m3139j(j), C0617pj.m3136g(j), C0617pj.m3137h(j), zd0Var.mo641F(0.0f), zd0Var, list, new xq0[list.size()], list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: h */
    public final int mo1225h(l30 l30Var, List list, int i) {
        int iMo641F = l30Var.mo641F(0.0f);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        float f = 0.0f;
        int iMax = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            sd0 sd0Var = (sd0) list.get(i3);
            float fM4274q = u50.m4274q(u50.m4272o(sd0Var));
            int iMo183R = sd0Var.mo183R(i);
            if (fM4274q == 0.0f) {
                i2 += iMo183R;
            } else if (fM4274q > 0.0f) {
                f += fM4274q;
                iMax = Math.max(iMax, Math.round(iMo183R / fM4274q));
            }
        }
        return ((list.size() - 1) * iMo641F) + Math.round(iMax * f) + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f6670a.f1639a) + (rd0.f5363b.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.fw0
    /* JADX INFO: renamed from: i */
    public final int mo1194i(xq0 xq0Var) {
        return xq0Var.f7401e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: j */
    public final int mo1226j(l30 l30Var, List list, int i) {
        int iMo641F = l30Var.mo641F(0.0f);
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo641F, i);
        int size = list.size();
        float f = 0.0f;
        int iMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            sd0 sd0Var = (sd0) list.get(i2);
            float fM4274q = u50.m4274q(u50.m4272o(sd0Var));
            if (fM4274q == 0.0f) {
                int iMin2 = Math.min(sd0Var.mo185f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, sd0Var.mo181I(iMin2));
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
                iMax = Math.max(iMax, sd0Var2.mo181I(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM4274q2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + rd0.f5363b + ", horizontalAlignment=" + this.f6670a + ')';
    }
}
