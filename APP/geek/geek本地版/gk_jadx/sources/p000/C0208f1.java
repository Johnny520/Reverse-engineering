package p000;

import android.content.Context;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0208f1 extends C0869wu {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f1869l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0358j1 f1870m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208f1(C0358j1 c0358j1, Context context, MenuC0424ku menuC0424ku, View view) {
        super(context, menuC0424ku, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f1870m = c0358j1;
        this.f5028f = 8388613;
        C0431l0 c0431l0 = c0358j1.f2538w;
        this.f5030h = c0431l0;
        AbstractC0758tu abstractC0758tu = this.f5031i;
        if (abstractC0758tu != null) {
            abstractC0758tu.mo952e(c0431l0);
        }
    }

    @Override // p000.C0869wu
    /* JADX INFO: renamed from: c */
    public final void mo1131c() {
        switch (this.f1869l) {
            case Base64.DEFAULT /* 0 */:
                C0358j1 c0358j1 = this.f1870m;
                c0358j1.f2535t = null;
                c0358j1.getClass();
                super.mo1131c();
                break;
            default:
                C0358j1 c0358j12 = this.f1870m;
                MenuC0424ku menuC0424ku = c0358j12.f2518c;
                if (menuC0424ku != null) {
                    menuC0424ku.m1718c(true);
                }
                c0358j12.f2534s = null;
                super.mo1131c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208f1(C0358j1 c0358j1, Context context, c50 c50Var, View view) {
        super(context, c50Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f1870m = c0358j1;
        if ((c50Var.f889A.f3609x & 32) != 32) {
            View view2 = c0358j1.f2524i;
            this.f5027e = view2 == null ? (View) c0358j1.f2523h : view2;
        }
        C0431l0 c0431l0 = c0358j1.f2538w;
        this.f5030h = c0431l0;
        AbstractC0758tu abstractC0758tu = this.f5031i;
        if (abstractC0758tu != null) {
            abstractC0758tu.mo952e(c0431l0);
        }
    }
}
