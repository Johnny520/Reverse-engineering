package p000;

/* JADX INFO: renamed from: rp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0697rp extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5521d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5522e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f5523f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f5524g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0697rp(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f5521d = i;
        this.f5522e = obj;
        this.f5523f = obj2;
        this.f5524g = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        long j;
        boolean zBooleanValue;
        int i = this.f5521d;
        Object obj2 = this.f5524g;
        Object obj3 = this.f5523f;
        Object obj4 = this.f5522e;
        switch (i) {
            case 0:
                h91 h91Var = (h91) obj;
                C0734sp c0734sp = (C0734sp) h91Var;
                if (!((ViewOnDragListenerC0197f5) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R((C0734sp) obj3)).m5745getDragAndDropManager()).f1580b.contains(c0734sp) || !s91.m4043h(c0734sp, pf1.m3026B((C0910x1) obj2))) {
                    return g91.f1893d;
                }
                ((zt0) obj4).f7995d = h91Var;
                return g91.f1895f;
            case 1:
                gv0 gv0Var = (gv0) obj;
                w31 w31Var = (w31) obj3;
                w31 w31Var2 = (w31) obj4;
                gv0Var.m1260d(w31Var2 != null ? ((Number) w31Var2.getValue()).floatValue() : 1.0f);
                gv0Var.m1261e(w31Var != null ? ((Number) w31Var.getValue()).floatValue() : 1.0f);
                gv0Var.m1262f(w31Var != null ? ((Number) w31Var.getValue()).floatValue() : 1.0f);
                w31 w31Var3 = (w31) obj2;
                if (w31Var3 != null) {
                    ((t81) w31Var3.getValue()).getClass();
                    j = 0;
                } else {
                    j = t81.f5953a;
                }
                gv0Var.m1263i(j);
                return na1.f4229a;
            default:
                C0149dv c0149dv = (C0149dv) obj;
                if (p30.m3002l(c0149dv, (C0149dv) obj4)) {
                    zBooleanValue = false;
                } else {
                    if (p30.m3002l(c0149dv, ((C1017zu) obj3).f7998c)) {
                        C0921xc.m5134o("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((InterfaceC0742sw) obj2).invoke(c0149dv)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }
}
