package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n90 {

    /* JADX INFO: renamed from: a */
    public int f3358a;

    /* JADX INFO: renamed from: b */
    public int f3359b;

    /* JADX INFO: renamed from: c */
    public int f3360c;

    /* JADX INFO: renamed from: d */
    public int f3361d;

    /* JADX INFO: renamed from: e */
    public int f3362e;

    /* JADX INFO: renamed from: a */
    public final boolean m1923a() {
        int i = this.f3358a;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f3361d;
            int i4 = this.f3359b;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.f3361d;
            int i6 = this.f3360c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f3362e;
            int i8 = this.f3359b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f3362e;
            int i10 = this.f3360c;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
