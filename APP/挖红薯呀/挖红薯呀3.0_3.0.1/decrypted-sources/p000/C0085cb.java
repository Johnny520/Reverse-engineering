package p000;

import java.util.List;

/* JADX INFO: renamed from: cb */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0085cb implements xd0 {

    /* JADX INFO: renamed from: a */
    public final C0276ha f775a;

    /* JADX INFO: renamed from: b */
    public final boolean f776b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0085cb(C0276ha c0276ha, boolean z) {
        this.f775a = c0276ha;
        this.f776b = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0085cb)) {
            return false;
        }
        C0085cb c0085cb = (C0085cb) obj;
        return this.f775a.equals(c0085cb.f775a) && this.f776b == c0085cb.f776b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: g */
    public final yd0 mo213g(final zd0 zd0Var, final List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        C0330is c0330is = C0330is.f2614d;
        if (zIsEmpty) {
            return zd0Var.mo1279Q(C0617pj.m3139j(j), C0617pj.m3138i(j), c0330is, new C0621pn(25));
        }
        long j2 = this.f776b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final sd0 sd0Var = (sd0) list.get(0);
            sd0Var.mo50j();
            final xq0 xq0VarMo184e = sd0Var.mo184e(j2);
            final int iMax = Math.max(C0617pj.m3139j(j), xq0VarMo184e.f7400d);
            final int iMax2 = Math.max(C0617pj.m3138i(j), xq0VarMo184e.f7401e);
            return zd0Var.mo1279Q(iMax, iMax2, c0330is, new InterfaceC0742sw() { // from class: ab
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0742sw
                public final Object invoke(Object obj) {
                    AbstractC0993za.m5465b((wq0) obj, xq0VarMo184e, sd0Var, zd0Var.getLayoutDirection(), iMax, iMax2, this.f775a);
                    return na1.f4229a;
                }
            });
        }
        final xq0[] xq0VarArr = new xq0[list.size()];
        final xt0 xt0Var = new xt0();
        xt0Var.f7423d = C0617pj.m3139j(j);
        final xt0 xt0Var2 = new xt0();
        xt0Var2.f7423d = C0617pj.m3138i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sd0 sd0Var2 = (sd0) list.get(i);
            sd0Var2.mo50j();
            xq0 xq0VarMo184e2 = sd0Var2.mo184e(j2);
            xq0VarArr[i] = xq0VarMo184e2;
            xt0Var.f7423d = Math.max(xt0Var.f7423d, xq0VarMo184e2.f7400d);
            xt0Var2.f7423d = Math.max(xt0Var2.f7423d, xq0VarMo184e2.f7401e);
        }
        return zd0Var.mo1279Q(xt0Var.f7423d, xt0Var2.f7423d, c0330is, new InterfaceC0742sw() { // from class: bb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                wq0 wq0Var = (wq0) obj;
                xq0[] xq0VarArr2 = xq0VarArr;
                int length = xq0VarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    xq0 xq0Var = xq0VarArr2[i3];
                    xq0Var.getClass();
                    AbstractC0993za.m5465b(wq0Var, xq0Var, (sd0) list.get(i4), zd0Var.getLayoutDirection(), xt0Var.f7423d, xt0Var2.f7423d, this.f775a);
                    i3++;
                    i2 = i4 + 1;
                }
                return na1.f4229a;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f776b) + (this.f775a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f775a + ", propagateMinConstraints=" + this.f776b + ')';
    }
}
