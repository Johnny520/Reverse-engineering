package p037U;

/* JADX INFO: renamed from: U.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0363X {

    /* JADX INFO: renamed from: a */
    public int f767a;

    /* JADX INFO: renamed from: b */
    public int f768b;

    /* JADX INFO: renamed from: c */
    public int f769c;

    /* JADX INFO: renamed from: d */
    public int f770d;

    /* JADX INFO: renamed from: e */
    public int f771e;

    /* JADX INFO: renamed from: a */
    public final boolean m935a() {
        int i2 = this.f767a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i4 = this.f770d;
            int i5 = this.f768b;
            if (((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i6 = this.f770d;
            int i7 = this.f769c;
            if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i8 = this.f771e;
            int i9 = this.f768b;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i10 = this.f771e;
            int i11 = this.f769c;
            if (i10 > i11) {
                i3 = 1;
            } else if (i10 != i11) {
                i3 = 4;
            }
            if ((i2 & (i3 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
