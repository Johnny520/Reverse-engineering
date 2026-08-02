package p000;

/* JADX INFO: renamed from: rz */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0675rz extends AbstractC0637qz {

    /* JADX INFO: renamed from: b */
    public boolean f9826b;

    public C0675rz(int i, boolean z) {
        this.f9291a = i;
        this.f9826b = z;
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: a */
    public final byte mo4017a() {
        return (byte) 1;
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: b */
    public final boolean mo4296b() {
        return this.f9826b;
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: c */
    public final float mo4297c() {
        return this.f9826b ? 1.0f : 0.0f;
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: d */
    public final int mo4298d() {
        return this.f9826b ? 1 : 0;
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: e */
    public final long mo4299e() {
        return this.f9826b ? 1L : 0L;
    }

    @Override // p000.AbstractC0637qz
    /* JADX INFO: renamed from: f */
    public final String mo4300f() {
        return this.f9826b ? "true" : "false";
    }
}
