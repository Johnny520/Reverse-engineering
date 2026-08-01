package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class py0 implements ez0 {

    /* JADX INFO: renamed from: j */
    public static final C0111d f4987j = new C0111d(19, new rx0(25), new sx0(12));

    /* JADX INFO: renamed from: a */
    public final dp0 f4988a;

    /* JADX INFO: renamed from: f */
    public float f4993f;

    /* JADX INFO: renamed from: h */
    public final C0135dn f4995h;

    /* JADX INFO: renamed from: i */
    public final C0135dn f4996i;

    /* JADX INFO: renamed from: b */
    public final dp0 f4989b = new dp0(0);

    /* JADX INFO: renamed from: c */
    public final dp0 f4990c = new dp0(0);

    /* JADX INFO: renamed from: d */
    public final xg0 f4991d = new xg0();

    /* JADX INFO: renamed from: e */
    public final dp0 f4992e = new dp0(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g */
    public final C0517nm f4994g = new C0517nm(new C0532o(19, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public py0(int i) {
        this.f4988a = new dp0(i);
        final int i2 = 0;
        this.f4995h = r60.m3411m(new InterfaceC0298hw(this) { // from class: oy0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ py0 f4679e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4679e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i3 = i2;
                py0 py0Var = this.f4679e;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(py0Var.f4988a.m720g() < py0Var.f4992e.m720g());
                    default:
                        return Boolean.valueOf(py0Var.f4988a.m720g() > 0);
                }
            }
        });
        final int i3 = 1;
        this.f4996i = r60.m3411m(new InterfaceC0298hw(this) { // from class: oy0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ py0 f4679e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4679e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i32 = i3;
                py0 py0Var = this.f4679e;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(py0Var.f4988a.m720g() < py0Var.f4992e.m720g());
                    default:
                        return Boolean.valueOf(py0Var.f4988a.m720g() > 0);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: a */
    public final boolean mo500a() {
        return ((Boolean) this.f4996i.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: b */
    public final boolean mo501b() {
        return this.f4994g.mo501b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: c */
    public final boolean mo502c() {
        return ((Boolean) this.f4995h.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: d */
    public final Object mo503d(vh0 vh0Var, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) {
        Object objMo503d = this.f4994g.mo503d(vh0Var, interfaceC0904ww, abstractC0358jk);
        return objMo503d == EnumC1007zk.f7916d ? objMo503d : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: e */
    public final float mo504e(float f) {
        return this.f4994g.mo504e(f);
    }
}
