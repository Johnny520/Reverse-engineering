package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class f90 extends e90 {

    /* JADX INFO: renamed from: a */
    public C0872wx[] f1773a;

    /* JADX INFO: renamed from: b */
    public String f1774b;

    /* JADX INFO: renamed from: c */
    public int f1775c;

    public f90() {
        this.f1773a = null;
        this.f1775c = 0;
    }

    public C0872wx[] getPathData() {
        return this.f1773a;
    }

    public String getPathName() {
        return this.f1774b;
    }

    public void setPathData(C0872wx[] c0872wxArr) {
        C0872wx[] c0872wxArr2 = this.f1773a;
        boolean z = false;
        if (c0872wxArr2 != null && c0872wxArr != null && c0872wxArr2.length == c0872wxArr.length) {
            int i = 0;
            while (true) {
                if (i >= c0872wxArr2.length) {
                    z = true;
                    break;
                }
                C0872wx c0872wx = c0872wxArr2[i];
                char c = c0872wx.f5141a;
                C0872wx c0872wx2 = c0872wxArr[i];
                if (c != c0872wx2.f5141a || c0872wx.f5142b.length != c0872wx2.f5142b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z) {
            this.f1773a = AbstractC0274gu.m1313g(c0872wxArr);
            return;
        }
        C0872wx[] c0872wxArr3 = this.f1773a;
        for (int i2 = 0; i2 < c0872wxArr.length; i2++) {
            c0872wxArr3[i2].f5141a = c0872wxArr[i2].f5141a;
            int i3 = 0;
            while (true) {
                float[] fArr = c0872wxArr[i2].f5142b;
                if (i3 < fArr.length) {
                    c0872wxArr3[i2].f5142b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public f90(f90 f90Var) {
        this.f1773a = null;
        this.f1775c = 0;
        this.f1774b = f90Var.f1774b;
        this.f1773a = AbstractC0274gu.m1313g(f90Var.f1773a);
    }
}
