package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class b20 extends ac0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: I */
    public final int mo181I(int i) {
        C0111d c0111dM314u = this.f101r.f5180r.m314u();
        xd0 xd0VarM616m = c0111dM314u.m616m();
        b60 b60Var = (b60) c0111dM314u.f919e;
        return xd0VarM616m.mo1226j(b60Var.f395I.f3996d, b60Var.m305l(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: O */
    public final int mo182O(int i) {
        C0111d c0111dM314u = this.f101r.f5180r.m314u();
        xd0 xd0VarM616m = c0111dM314u.m616m();
        b60 b60Var = (b60) c0111dM314u.f919e;
        return xd0VarM616m.mo1224c(b60Var.f395I.f3996d, b60Var.m305l(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: R */
    public final int mo183R(int i) {
        C0111d c0111dM314u = this.f101r.f5180r.m314u();
        xd0 xd0VarM616m = c0111dM314u.m616m();
        b60 b60Var = (b60) c0111dM314u.f919e;
        return xd0VarM616m.mo1225h(b60Var.f395I.f3996d, b60Var.m305l(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: c0 */
    public final int mo234c0(AbstractC0535o2 abstractC0535o2) {
        ec0 ec0Var = this.f101r.f5180r.f396J.f1608q;
        ec0Var.getClass();
        f60 f60Var = ec0Var.f1377i;
        x50 x50Var = f60Var.f1595d;
        c60 c60Var = ec0Var.f1388t;
        if (x50Var == x50.f7265e) {
            c60Var.f710d = true;
            if (c60Var.f708b) {
                f60Var.f1597f = true;
                f60Var.f1598g = true;
            }
        } else {
            c60Var.f711e = true;
        }
        b20 b20Var = ec0Var.mo840r().f644U;
        if (b20Var != null) {
            b20Var.f7597n = true;
        }
        ec0Var.mo842u();
        b20 b20Var2 = ec0Var.mo840r().f644U;
        if (b20Var2 != null) {
            b20Var2.f7597n = false;
        }
        Integer num = (Integer) c60Var.f713g.get(abstractC0535o2);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f106w.m537g(iIntValue, abstractC0535o2);
        return iIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: e */
    public final xq0 mo184e(long j) {
        m5146a0(j);
        qj0 qj0Var = this.f101r;
        sh0 sh0VarM319z = qj0Var.f5180r.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            ec0 ec0Var = ((b60) objArr[i2]).f396J.f1608q;
            ec0Var.getClass();
            ec0Var.f1381m = z50.f7802f;
        }
        b60 b60Var = qj0Var.f5180r;
        ac0.m46v0(this, b60Var.f427z.mo213g(this, b60Var.m305l(), j));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: f */
    public final int mo185f(int i) {
        C0111d c0111dM314u = this.f101r.f5180r.m314u();
        xd0 xd0VarM616m = c0111dM314u.m616m();
        b60 b60Var = (b60) c0111dM314u.f919e;
        return xd0VarM616m.mo1223b(b60Var.f395I.f3996d, b60Var.m305l(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ac0
    /* JADX INFO: renamed from: w0 */
    public final void mo60w0() {
        ec0 ec0Var = this.f101r.f5180r.f396J.f1608q;
        ec0Var.getClass();
        ec0Var.m836k0();
    }
}
