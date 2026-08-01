package p203n;

/* JADX INFO: renamed from: n.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2679x implements InterfaceC2678w {

    /* JADX INFO: renamed from: a */
    public final float f8544a;

    /* JADX INFO: renamed from: b */
    public final C2625H f8545b;

    public C2679x(float f2, float f5, float f6) {
        this.f8544a = f6;
        C2625H c2625h = new C2625H();
        c2625h.f8336a = 1.0f;
        c2625h.f8337b = Math.sqrt(50.0d);
        c2625h.f8338c = 1.0f;
        if (f2 < 0.0f) {
            AbstractC2624G.m4574a("Damping ratio must be non-negative");
        }
        c2625h.f8338c = f2;
        double d5 = c2625h.f8337b;
        if (((float) (d5 * d5)) <= 0.0f) {
            AbstractC2624G.m4574a("Spring stiffness constant must be positive.");
        }
        c2625h.f8337b = Math.sqrt(f5);
        this.f8545b = c2625h;
    }

    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: b */
    public final float mo4635b(long j5, float f2, float f5, float f6) {
        C2625H c2625h = this.f8545b;
        c2625h.f8336a = f5;
        return Float.intBitsToFloat((int) (c2625h.m4576a(f2, f6, j5 / 1000000) >> 32));
    }

    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: c */
    public final float mo4636c(long j5, float f2, float f5, float f6) {
        C2625H c2625h = this.f8545b;
        c2625h.f8336a = f5;
        return Float.intBitsToFloat((int) (c2625h.m4576a(f2, f6, j5 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo4637d(float r33, float r34, float r35) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p203n.C2679x.mo4637d(float, float, float):long");
    }

    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: e */
    public final float mo4638e(float f2, float f5, float f6) {
        return 0.0f;
    }
}
