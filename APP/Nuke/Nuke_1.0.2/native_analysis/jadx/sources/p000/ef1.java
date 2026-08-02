package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ef1 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ o63 f2423h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0402kw f2424i;

    public ef1(o63 o63Var, C0402kw c0402kw) {
        this.f2423h = o63Var;
        this.f2424i = c0402kw;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        int iIntValue = ((Number) obj2).intValue();
        go0 go0Var = (go0) interfaceC0596px;
        if (go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
            v03.m5600a(this.f2423h.f7553j, this.f2424i, go0Var, 0);
        } else {
            go0Var.m1961R();
        }
        return a83.f116a;
    }
}
