package p000;

import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lu0 extends yn0 implements xm0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ o72 f6325o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ ViewGroup f6326p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ y62 f6327q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ l80 f6328r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu0(o72 o72Var, ViewGroup viewGroup, y62 y62Var, l80 l80Var) {
        super(0, s11.class, "dismiss", "showHostComposeDialog$lambda$0$dismiss(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/ViewGroup;Lkotlin/jvm/internal/Ref$BooleanRef;Lnuke/ui/compose/DialogComposeOwner;)V", 0);
        this.f6325o = o72Var;
        this.f6326p = viewGroup;
        this.f6327q = y62Var;
        this.f6328r = l80Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        o72 o72Var = this.f6325o;
        C0328ix c0328ix = (C0328ix) o72Var.f7574i;
        if (c0328ix != null) {
            ViewParent parent = c0328ix.getParent();
            ViewGroup viewGroup = this.f6326p;
            if (parent == viewGroup) {
                viewGroup.removeView(c0328ix);
            }
        }
        y62 y62Var = this.f6327q;
        if (!y62Var.f13324h) {
            y62Var.f13324h = true;
            this.f6328r.m2875a();
            o72Var.f7574i = null;
        }
        return a83.f116a;
    }
}
