package p000;

/* JADX INFO: renamed from: WD */
/* JADX INFO: loaded from: classes.dex */
public final class C0959WD {

    /* JADX INFO: renamed from: a */
    public int f2995a;

    /* JADX INFO: renamed from: b */
    public int f2996b;

    /* JADX INFO: renamed from: c */
    public int f2997c;

    /* JADX INFO: renamed from: d */
    public int f2998d;

    /* JADX INFO: renamed from: e */
    public int f2999e;

    /* JADX INFO: renamed from: a */
    public final boolean m1833a() {
        int i = this.f2995a;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f2998d;
            int i4 = this.f2996b;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.f2998d;
            int i6 = this.f2997c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f2999e;
            int i8 = this.f2996b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f2999e;
            int i10 = this.f2997c;
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
