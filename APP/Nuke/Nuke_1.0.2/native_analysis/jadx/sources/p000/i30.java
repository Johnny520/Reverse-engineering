package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i30 extends k30 {

    /* JADX INFO: renamed from: h */
    public final int f4250h;

    public i30(int i) {
        this.f4250h = i;
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: e */
    public final int mo626e(AbstractC0147dz abstractC0147dz) {
        int i = ((i30) abstractC0147dz).f4250h;
        int i2 = this.f4250h;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f4250h == ((i30) obj).f4250h;
    }

    @Override // p000.k30
    /* JADX INFO: renamed from: g */
    public final boolean mo2046g() {
        return true;
    }

    @Override // p000.k30
    /* JADX INFO: renamed from: h */
    public final int mo2047h() {
        return this.f4250h;
    }

    public final int hashCode() {
        return this.f4250h;
    }

    @Override // p000.k30
    /* JADX INFO: renamed from: i */
    public final long mo2048i() {
        return this.f4250h;
    }
}
