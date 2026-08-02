package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface sj0 extends InterfaceC0273hd {
    @Override // p000.InterfaceC0273hd
    /* JADX INFO: renamed from: a */
    default x93 mo512a(n43 n43Var) {
        return new kj1(this);
    }

    /* JADX INFO: renamed from: b */
    float mo4877b(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: c */
    float mo4878c(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: d */
    long mo4879d(float f, float f2, float f3);

    /* JADX INFO: renamed from: e */
    default float mo4880e(float f, float f2, float f3) {
        return mo4878c(mo4879d(f, f2, f3), f, f2, f3);
    }
}
