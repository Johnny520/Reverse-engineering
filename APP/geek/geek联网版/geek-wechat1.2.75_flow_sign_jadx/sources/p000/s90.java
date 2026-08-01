package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s90 {

    /* JADX INFO: renamed from: a */
    public int f4220a;

    /* JADX INFO: renamed from: b */
    public int f4221b;

    /* JADX INFO: renamed from: c */
    public int f4222c;

    /* JADX INFO: renamed from: d */
    public int f4223d;

    /* JADX INFO: renamed from: e */
    public int f4224e;

    /* JADX INFO: renamed from: a */
    public final boolean m2326a() {
        int i = this.f4220a;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f4223d;
            int i4 = this.f4221b;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.f4223d;
            int i6 = this.f4222c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f4224e;
            int i8 = this.f4221b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f4224e;
            int i10 = this.f4222c;
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
