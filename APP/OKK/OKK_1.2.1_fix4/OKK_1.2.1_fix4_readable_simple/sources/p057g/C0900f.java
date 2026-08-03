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
    public final /* synthetic */ int f3183m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0906i f3184n;

    public C0900f(C0906i r9, Context r10, MenuC0779j r11, View r12) {
        this.f3183m = 1;
        this.f3184n = r9;
        super(C1031R.attr.actionOverflowMenuStyle, 0, r10, r12, r11, true);
        this.f2841g = 8388613;
        C0095d r92 = r9.f3224v;
        this.f2843i = r92;
        AbstractC0781l r102 = this.f2844j;
        if (r102 == null) goto L6;
        r102.mo1982j(r92);
        return;
    }

    @Override // p055f.C0783n
    /* JADX INFO: renamed from: c */
    public final void mo2028c() {
        switch(this.f3183m) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C0906i r02 = this.f3184n;
        MenuC0779j r1 = r02.f3205c;
        if (r1 == null) goto L7;
        r1.m1997c(true);
    L7:
        r02.f3220r = null;
        super.mo2028c();
        return;
    L9:
        this.f3184n.f3221s = null;
        super.mo2028c();
    }

    public C0900f(C0906i r9, Context r10, SubMenuC0789t r11, View r12) {
        this.f3183m = 0;
        this.f3184n = r9;
        super(C1031R.attr.actionOverflowMenuStyle, 0, r10, r12, r11, false);
        if (r11.f2868w.m2017d() == true) goto L8;
        View r102 = r9.f3210h;
        if (r102 != null) goto L7;
        r102 = r9.f3209g;
    L7:
        this.f2840f = r102;
    L8:
        C0095d r92 = r9.f3224v;
        this.f2843i = r92;
        AbstractC0781l r103 = this.f2844j;
        if (r103 == null) goto L12;
        r103.mo1982j(r92);
        return;
    }
}
