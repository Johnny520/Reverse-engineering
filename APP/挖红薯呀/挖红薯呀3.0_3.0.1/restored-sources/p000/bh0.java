package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class bh0 extends id0 {

    /* JADX INFO: renamed from: g */
    public final C0016af f513g;

    /* JADX INFO: renamed from: h */
    public Object f514h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bh0(C0016af c0016af, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f513g = c0016af;
        this.f514h = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.id0, java.util.Map.Entry
    public final Object getValue() {
        return this.f514h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.id0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f514h;
        this.f514h = obj;
        iq0 iq0Var = (iq0) this.f513g.f145e;
        eq0 eq0Var = iq0Var.f2606g;
        Object obj3 = this.f2524e;
        if (!eq0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = iq0Var.f2352f;
        if (!z) {
            eq0Var.put(obj3, obj);
        } else {
            if (!z) {
                C0921xc.m5132m();
                return null;
            }
            m91 m91Var = iq0Var.f2350d[iq0Var.f2351e];
            Object obj4 = m91Var.f3889d[m91Var.f3891f];
            eq0Var.put(obj3, obj);
            iq0Var.m1594c(obj4 != null ? obj4.hashCode() : 0, eq0Var.f1505e, obj4, 0);
        }
        iq0Var.f2609j = eq0Var.f1507g;
        return obj2;
    }
}
