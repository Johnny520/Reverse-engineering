package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sz2 implements bm2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bm2 f10443a;

    /* JADX INFO: renamed from: b */
    public final n70 f10444b;

    /* JADX INFO: renamed from: c */
    public final n70 f10445c;

    public sz2(bm2 bm2Var, final tz2 tz2Var) {
        this.f10443a = bm2Var;
        final int i = 0;
        this.f10444b = op0.m3590m(new xm0() { // from class: rz2
            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i2 = i;
                tz2 tz2Var2 = tz2Var;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(tz2Var2.f11013a.m2591g() < tz2Var2.f11014b.m2591g());
                    default:
                        return Boolean.valueOf(tz2Var2.f11013a.m2591g() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.f10445c = op0.m3590m(new xm0() { // from class: rz2
            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i22 = i2;
                tz2 tz2Var2 = tz2Var;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(tz2Var2.f11013a.m2591g() < tz2Var2.f11014b.m2591g());
                    default:
                        return Boolean.valueOf(tz2Var2.f11013a.m2591g() > 0.0f);
                }
            }
        });
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: a */
    public final boolean mo567a() {
        return ((Boolean) this.f10445c.getValue()).booleanValue();
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: b */
    public final boolean mo568b() {
        return this.f10443a.mo568b();
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: c */
    public final boolean mo569c() {
        return ((Boolean) this.f10444b.getValue()).booleanValue();
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: d */
    public final Object mo570d(bl1 bl1Var, mn0 mn0Var, u00 u00Var) {
        return this.f10443a.mo570d(bl1Var, mn0Var, u00Var);
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: e */
    public final float mo571e(float f) {
        return this.f10443a.mo571e(f);
    }
}
