package p000;

/* JADX INFO: renamed from: zm */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0967zm implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13948h;

    /* JADX INFO: renamed from: i */
    public Object f13949i;

    public /* synthetic */ C0967zm(int i, Object obj) {
        this.f13948h = i;
        this.f13949i = obj;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f13948h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                ((InterfaceC0508np) this.f13949i).cancel();
                break;
            case 1:
                ((s52) this.f13949i).cancel();
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                u12 u12Var = (u12) this.f13949i;
                if (u12Var != null) {
                    u12Var.f11058c = zBooleanValue;
                }
                break;
            default:
                float[] fArr = ((hf1) obj).f3992a;
                c61 c61Var = (c61) this.f13949i;
                if (c61Var.mo653w()) {
                    s11.m4665J(c61Var).mo643H(c61Var, fArr);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0967zm() {
        this.f13948h = 2;
    }
}
