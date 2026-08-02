package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fk1 extends se1 implements r41 {

    /* JADX INFO: renamed from: k */
    public final ez1 f3027k;

    /* JADX INFO: renamed from: l */
    public Object f3028l;

    public fk1(ez1 ez1Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f3027k = ez1Var;
        this.f3028l = obj2;
    }

    @Override // p000.se1, java.util.Map.Entry
    public final Object getValue() {
        return this.f3028l;
    }

    @Override // p000.se1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f3028l;
        this.f3028l = obj;
        cz1 cz1Var = (cz1) this.f3027k.f2695i;
        bz1 bz1Var = cz1Var.f1792k;
        Object obj3 = this.f10077i;
        if (!bz1Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = cz1Var.f455j;
        if (!z) {
            bz1Var.put(obj3, obj);
        } else {
            if (!z) {
                um2.m5513b();
                return null;
            }
            i43 i43Var = cz1Var.f453h[cz1Var.f454i];
            Object obj4 = i43Var.f4268h[i43Var.f4270j];
            bz1Var.put(obj3, obj);
            cz1Var.m925c(obj4 != null ? obj4.hashCode() : 0, bz1Var.f1084j, obj4, 0);
        }
        cz1Var.f1795n = bz1Var.f1086l;
        return obj2;
    }
}
