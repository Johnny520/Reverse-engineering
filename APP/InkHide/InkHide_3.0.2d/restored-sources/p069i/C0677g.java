package p069i;

import android.content.Context;
import android.view.View;
import com.p055lu.wxmask272.R;
import p004C.C0066j;
import p068h.AbstractC0602u;
import p068h.C0605x;
import p068h.MenuC0594m;
import p068h.SubMenuC0581F;

/* JADX INFO: renamed from: i.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0677g extends C0605x {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f2291l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0689k f2292m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677g(C0689k c0689k, Context context, MenuC0594m menuC0594m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0594m, true);
        this.f2292m = c0689k;
        this.f2103f = 8388613;
        C0066j c0066j = c0689k.f2324x;
        this.f2105h = c0066j;
        AbstractC0602u abstractC0602u = this.f2106i;
        if (abstractC0602u != null) {
            abstractC0602u.mo1149e(c0066j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.C0605x
    /* JADX INFO: renamed from: c */
    public final void mo1207c() {
        switch (this.f2291l) {
            case 0:
                C0689k c0689k = this.f2292m;
                c0689k.f2321u = null;
                c0689k.getClass();
                super.mo1207c();
                break;
            default:
                C0689k c0689k2 = this.f2292m;
                MenuC0594m menuC0594m = c0689k2.f2304d;
                if (menuC0594m != null) {
                    menuC0594m.m1184c(true);
                }
                c0689k2.f2320t = null;
                super.mo1207c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677g(C0689k c0689k, Context context, SubMenuC0581F subMenuC0581F, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0581F, false);
        this.f2292m = c0689k;
        if ((subMenuC0581F.f1961A.f2083x & 32) != 32) {
            View view2 = c0689k.f2310j;
            this.f2102e = view2 == null ? (View) c0689k.f2309i : view2;
        }
        C0066j c0066j = c0689k.f2324x;
        this.f2105h = c0066j;
        AbstractC0602u abstractC0602u = this.f2106i;
        if (abstractC0602u != null) {
            abstractC0602u.mo1149e(c0066j);
        }
    }
}
