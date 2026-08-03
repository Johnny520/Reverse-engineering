package p057g;

import android.content.Context;
import android.view.View;
import org.luckypray.dexkit.C1031R;
import p006D.C0095d;
import p055f.AbstractC0781l;
import p055f.C0783n;
import p055f.MenuC0779j;
import p055f.SubMenuC0789t;

/* JADX INFO: renamed from: g.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0900f extends C0783n {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f3183m = 1;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0906i f3184n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0900f(C0906i c0906i, Context context, MenuC0779j menuC0779j, View view) {
        super(C1031R.attr.actionOverflowMenuStyle, 0, context, view, menuC0779j, true);
        this.f3184n = c0906i;
        this.f2841g = 8388613;
        C0095d c0095d = c0906i.f3224v;
        this.f2843i = c0095d;
        AbstractC0781l abstractC0781l = this.f2844j;
        if (abstractC0781l != null) {
            abstractC0781l.mo1982j(c0095d);
        }
    }

    @Override // p055f.C0783n
    /* JADX INFO: renamed from: c */
    public final void mo2028c() {
        switch (this.f3183m) {
            case 0:
                this.f3184n.f3221s = null;
                super.mo2028c();
                break;
            default:
                C0906i c0906i = this.f3184n;
                MenuC0779j menuC0779j = c0906i.f3205c;
                if (menuC0779j != null) {
                    menuC0779j.m1997c(true);
                }
                c0906i.f3220r = null;
                super.mo2028c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0900f(C0906i c0906i, Context context, SubMenuC0789t subMenuC0789t, View view) {
        super(C1031R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC0789t, false);
        this.f3184n = c0906i;
        if (!subMenuC0789t.f2868w.m2017d()) {
            View view2 = c0906i.f3210h;
            this.f2840f = view2 == null ? c0906i.f3209g : view2;
        }
        C0095d c0095d = c0906i.f3224v;
        this.f2843i = c0095d;
        AbstractC0781l abstractC0781l = this.f2844j;
        if (abstractC0781l != null) {
            abstractC0781l.mo1982j(c0095d);
        }
    }
}
