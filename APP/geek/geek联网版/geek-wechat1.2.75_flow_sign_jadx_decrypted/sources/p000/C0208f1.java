package p000;

import android.content.Context;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0208f1 extends C0201ev {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f1719l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0358j1 f1720m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208f1(C0358j1 c0358j1, Context context, MenuC0646qu menuC0646qu, View view) {
        super(context, menuC0646qu, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f1720m = c0358j1;
        this.f1666f = 8388613;
        C0431l0 c0431l0 = c0358j1.f2645w;
        this.f1668h = c0431l0;
        AbstractC0082bv abstractC0082bv = this.f1669i;
        if (abstractC0082bv != null) {
            abstractC0082bv.mo975e(c0431l0);
        }
    }

    @Override // p000.C0201ev
    /* JADX INFO: renamed from: c */
    public final void mo1030c() {
        switch (this.f1719l) {
            case Base64.DEFAULT /* 0 */:
                C0358j1 c0358j1 = this.f1720m;
                c0358j1.f2642t = null;
                c0358j1.getClass();
                super.mo1030c();
                break;
            default:
                C0358j1 c0358j12 = this.f1720m;
                MenuC0646qu menuC0646qu = c0358j12.f2625c;
                if (menuC0646qu != null) {
                    menuC0646qu.m2167c(true);
                }
                c0358j12.f2641s = null;
                super.mo1030c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208f1(C0358j1 c0358j1, Context context, j50 j50Var, View view) {
        super(context, j50Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f1720m = c0358j1;
        if ((j50Var.f2660A.f5135x & 32) != 32) {
            View view2 = c0358j1.f2631i;
            this.f1665e = view2 == null ? (View) c0358j1.f2630h : view2;
        }
        C0431l0 c0431l0 = c0358j1.f2645w;
        this.f1668h = c0431l0;
        AbstractC0082bv abstractC0082bv = this.f1669i;
        if (abstractC0082bv != null) {
            abstractC0082bv.mo975e(c0431l0);
        }
    }
}
