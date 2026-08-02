package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 implements cy0 {

    /* JADX INFO: renamed from: h */
    public final boolean f12970h;

    public xd0(boolean z) {
        this.f12970h = z;
    }

    @Override // p000.cy0
    /* JADX INFO: renamed from: b */
    public final boolean mo302b() {
        return this.f12970h;
    }

    @Override // p000.cy0
    /* JADX INFO: renamed from: d */
    public final bo1 mo303d() {
        return null;
    }

    public final String toString() {
        return hk1.m2210i(new StringBuilder("Empty{"), this.f12970h ? "Active" : "New", '}');
    }
}
