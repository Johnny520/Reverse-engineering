package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m60 extends y50 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q60 f3819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0904ww f3820c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m60(q60 q60Var, InterfaceC0904ww interfaceC0904ww, String str) {
        super(str);
        this.f3819b = q60Var;
        this.f3820c = interfaceC0904ww;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: g */
    public final yd0 mo213g(zd0 zd0Var, List list, long j) {
        q60 q60Var = this.f3819b;
        k60 k60Var = q60Var.f5063k;
        k60Var.f3025d = zd0Var.getLayoutDirection();
        k60Var.f3026e = zd0Var.mo48b();
        k60Var.f3027f = zd0Var.mo49h();
        boolean zMo53m = zd0Var.mo53m();
        InterfaceC0904ww interfaceC0904ww = this.f3820c;
        if (zMo53m || q60Var.f5056d.f413l == null) {
            q60Var.f5059g = 0;
            yd0 yd0Var = (yd0) interfaceC0904ww.invoke(k60Var, new C0617pj(j));
            return new l60(yd0Var, q60Var, q60Var.f5059g, yd0Var, 1);
        }
        q60Var.f5060h = 0;
        yd0 yd0Var2 = (yd0) interfaceC0904ww.invoke(q60Var.f5064l, new C0617pj(j));
        return new l60(yd0Var2, q60Var, q60Var.f5060h, yd0Var2, 0);
    }
}
