package p163l;

/* JADX INFO: renamed from: l.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4318k0 implements InterfaceC4313j0 {

    /* JADX INFO: renamed from: a */
    public final float f12640a;

    /* JADX INFO: renamed from: b */
    public final float f12641b;

    public C4318k0(float f10, float f11) {
        this.f12640a = Math.max(1.0E-7f, Math.abs(f11));
        this.f12641b = Math.max(1.0E-4f, f10) * (-4.2f);
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: a */
    public float mo15444a() {
        return this.f12640a;
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: b */
    public float mo15445b(long j10, float f10, float f11) {
        return f11 * ((float) Math.exp(((j10 / 1000000) / 1000.0f) * this.f12641b));
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: c */
    public long mo15446c(float f10, float f11) {
        return ((long) ((((float) Math.log(mo15444a() / Math.abs(f11))) * 1000.0f) / this.f12641b)) * 1000000;
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: d */
    public float mo15447d(float f10, float f11) {
        if (Math.abs(f11) <= mo15444a()) {
            return f10;
        }
        double dLog = Math.log(Math.abs(mo15444a() / f11));
        float f12 = this.f12641b;
        return (f10 - (f11 / f12)) + ((f11 / f12) * ((float) Math.exp((((double) f12) * ((dLog / ((double) f12)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: e */
    public float mo15448e(long j10, float f10, float f11) {
        float f12 = this.f12641b;
        return (f10 - (f11 / f12)) + ((f11 / f12) * ((float) Math.exp((f12 * (j10 / 1000000)) / 1000.0f)));
    }
}
