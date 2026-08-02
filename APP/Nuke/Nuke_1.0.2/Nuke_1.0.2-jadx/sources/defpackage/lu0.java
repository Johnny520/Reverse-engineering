package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lu0 extends yn0 implements xm0 {
    public final /* synthetic */ o72 o;
    public final /* synthetic */ ViewGroup p;
    public final /* synthetic */ y62 q;
    public final /* synthetic */ l80 r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu0(o72 o72Var, ViewGroup viewGroup, y62 y62Var, l80 l80Var) {
        super(0, s11.class, "dismiss", "showHostComposeDialog$lambda$0$dismiss(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/ViewGroup;Lkotlin/jvm/internal/Ref$BooleanRef;Lnuke/ui/compose/DialogComposeOwner;)V", 0);
        this.o = o72Var;
        this.p = viewGroup;
        this.q = y62Var;
        this.r = l80Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        o72 o72Var = this.o;
        ix ixVar = (ix) o72Var.i;
        if (ixVar != null) {
            ViewParent parent = ixVar.getParent();
            ViewGroup viewGroup = this.p;
            if (parent == viewGroup) {
                viewGroup.removeView(ixVar);
            }
        }
        y62 y62Var = this.q;
        if (!y62Var.h) {
            y62Var.h = true;
            this.r.a();
            o72Var.i = null;
        }
        return a83.a;
    }
}
