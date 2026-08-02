package p000;

/* JADX INFO: renamed from: bk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0058bk extends kj0 {

    /* JADX INFO: renamed from: j */
    public final v01 f903j;

    /* JADX INFO: renamed from: k */
    public int f904k;

    public C0058bk(int i) {
        super(i);
        this.f903j = new v01(i);
        this.f904k = -1;
    }

    /* JADX INFO: renamed from: h */
    public final int m552h() {
        v01 v01Var = this.f903j;
        int i = v01Var.f11588j - 1;
        while (i >= 0 && v01Var.m5598f(i) < 0) {
            i--;
        }
        int i2 = i + 1;
        if (i2 < 0) {
            v01Var.getClass();
            C0676s.m4651j("newSize < 0");
            return 0;
        }
        if (i2 > v01Var.f11588j) {
            C0676s.m4651j("newSize > size");
            return 0;
        }
        v01Var.m5707d();
        v01Var.f11588j = i2;
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public final C0964zj m553i(int i) {
        v01 v01Var = this.f903j;
        int iM5598f = i >= v01Var.f11588j ? -1 : v01Var.m5598f(i);
        if (iM5598f >= 0) {
            return (C0964zj) m2693e(iM5598f);
        }
        C0676s.m4651j("no such label: ".concat(pp0.m3898J(i)));
        return null;
    }
}
