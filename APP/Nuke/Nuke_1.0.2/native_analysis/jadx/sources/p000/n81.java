package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n81 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7049h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ q81 f7050i;

    public /* synthetic */ n81(q81 q81Var, int i) {
        this.f7049h = i;
        this.f7050i = q81Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f7049h;
        q81 q81Var = this.f7050i;
        switch (i) {
            case 0:
                t81 t81Var = (t81) q81Var.f8821v.mo6a();
                int iM5133c = t81Var.m5133c();
                int i2 = 0;
                while (true) {
                    if (i2 >= iM5133c) {
                        i2 = -1;
                    } else if (!t81Var.m5134d(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                t81 t81Var2 = (t81) q81Var.f8821v.mo6a();
                if (iIntValue < 0 || iIntValue >= t81Var2.m5133c()) {
                    StringBuilder sbM5695n = vi0.m5695n(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM5695n.append(t81Var2.m5133c());
                    sbM5695n.append(')');
                    nz0.m3456a(sbM5695n.toString());
                }
                AbstractC0570p7.m3745A(q81Var.m5255A0(), null, new p81(q81Var, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
