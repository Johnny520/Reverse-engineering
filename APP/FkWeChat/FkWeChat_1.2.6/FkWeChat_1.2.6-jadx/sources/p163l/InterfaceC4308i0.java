package p163l;

/* JADX INFO: renamed from: l.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4308i0 extends InterfaceC4317k {
    @Override // p163l.InterfaceC4317k
    /* JADX INFO: renamed from: a */
    default C4366t3 mo16829a(InterfaceC4365t2 interfaceC4365t2) {
        return new C4366t3(this);
    }

    /* JADX INFO: renamed from: b */
    float mo16935b(long j10, float f10, float f11, float f12);

    /* JADX INFO: renamed from: c */
    long mo16936c(float f10, float f11, float f12);

    /* JADX INFO: renamed from: d */
    default float mo16937d(float f10, float f11, float f12) {
        return mo16935b(mo16936c(f10, f11, f12), f10, f11, f12);
    }

    /* JADX INFO: renamed from: e */
    float mo16938e(long j10, float f10, float f11, float f12);
}
