package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class a90 extends z80 {

    /* JADX INFO: renamed from: a */
    public C0575ox[] f97a;

    /* JADX INFO: renamed from: b */
    public String f98b;

    /* JADX INFO: renamed from: c */
    public int f99c;

    public a90() {
        this.f97a = null;
        this.f99c = 0;
    }

    public C0575ox[] getPathData() {
        return this.f97a;
    }

    public String getPathName() {
        return this.f98b;
    }

    public void setPathData(C0575ox[] c0575oxArr) {
        C0575ox[] c0575oxArr2 = this.f97a;
        boolean z = false;
        if (c0575oxArr2 != null && c0575oxArr != null && c0575oxArr2.length == c0575oxArr.length) {
            int i = 0;
            while (true) {
                if (i >= c0575oxArr2.length) {
                    z = true;
                    break;
                }
                C0575ox c0575ox = c0575oxArr2[i];
                char c = c0575ox.f3615a;
                C0575ox c0575ox2 = c0575oxArr[i];
                if (c != c0575ox2.f3615a || c0575ox.f3616b.length != c0575ox2.f3616b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z) {
            this.f97a = AbstractC0126ct.m814k(c0575oxArr);
            return;
        }
        C0575ox[] c0575oxArr3 = this.f97a;
        for (int i2 = 0; i2 < c0575oxArr.length; i2++) {
            c0575oxArr3[i2].f3615a = c0575oxArr[i2].f3615a;
            int i3 = 0;
            while (true) {
                float[] fArr = c0575oxArr[i2].f3616b;
                if (i3 < fArr.length) {
                    c0575oxArr3[i2].f3616b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public a90(a90 a90Var) {
        this.f97a = null;
        this.f99c = 0;
        this.f98b = a90Var.f98b;
        this.f97a = AbstractC0126ct.m814k(a90Var.f97a);
    }
}
