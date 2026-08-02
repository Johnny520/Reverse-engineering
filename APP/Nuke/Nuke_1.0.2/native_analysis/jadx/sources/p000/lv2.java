package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lv2 extends qp0 {

    /* JADX INFO: renamed from: t */
    public final String f6339t;

    /* JADX INFO: renamed from: u */
    public int f6340u;

    public lv2(String str, int i) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        this.f6339t = str;
        this.f6340u = i;
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: D */
    public final int mo170D(mj0 mj0Var) {
        byte b;
        String str = this.f6339t;
        if (str == null) {
            C0676s.m4651j("value must be specified");
            return 0;
        }
        if (str.length() == 0 && this.f6340u != 5) {
            this.f6340u = 5;
        }
        int iM3114e = mj0Var.m3114e(str);
        int i = this.f6340u;
        if (i != 1) {
            b = 2;
            if (i == 2) {
                b = 1;
            } else if (i != 3) {
                b = 4;
                if (i == 4) {
                    b = 3;
                } else if (i != 5) {
                    throw null;
                }
            }
        } else {
            b = 0;
        }
        mj0Var.m3122m(3);
        mj0Var.m3112c(0, iM3114e);
        if (b != 0) {
            mj0Var.m3110a(b);
            mj0Var.m3121l(1);
        }
        int iM3116g = mj0Var.m3116g();
        mj0Var.m3118i(iM3116g);
        return iM3116g;
    }
}
