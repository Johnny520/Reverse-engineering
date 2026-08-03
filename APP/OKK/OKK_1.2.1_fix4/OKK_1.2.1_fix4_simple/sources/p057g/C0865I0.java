package p057g;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p055f.InterfaceC0785p;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;
import p055f.SubMenuC0789t;

/* JADX INFO: renamed from: g.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0865I0 implements InterfaceC0785p {

    /* JADX INFO: renamed from: a */
    public MenuC0779j f3107a;

    /* JADX INFO: renamed from: b */
    public MenuItemC0780k f3108b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Toolbar f3109c;

    public C0865I0(Toolbar r1) {
        this.f3109c = r1;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: a */
    public final void mo1976a(MenuC0779j r1, boolean r2) {
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: b */
    public final void mo1977b() {
        if (this.f3108b == null) goto L16;
        MenuC0779j r02 = this.f3107a;
        if (r02 == null) goto L12;
        int r03 = r02.f2790f.size();
        int r1 = 0;
    L7:
        if (r1 >= r03) goto L12;
        if (this.f3107a.getItem(r1) == this.f3108b) goto L17;
        r1 = r1 + 1;
        goto L7
    L17:
        return;
    L12:
        mo2023c(this.f3108b);
        return;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: c */
    public final boolean mo2023c(MenuItemC0780k r7) {
        Toolbar r02 = this.f3109c;
        r02.removeView(r02.f1235i);
        r02.removeView(r02.f1234h);
        r02.f1235i = null;
        ArrayList r2 = r02.f1215E;
        int r3 = r2.size() - 1;
    L3:
        if (r3 < 0) goto L5;
        r02.addView((View) r2.get(r3));
        r3 = r3 - 1;
        goto L3
    L5:
        r2.clear();
        this.f3108b = null;
        r02.requestLayout();
        r7.f2806B = false;
        r7.f2820n.m2009o(false);
        r02.m1154t();
        return true;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: g */
    public final boolean mo1981g() {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: h */
    public final void mo2024h(Context r2, MenuC0779j r3) {
        MenuC0779j r22 = this.f3107a;
        if (r22 == null) goto L7;
        MenuItemC0780k r02 = this.f3108b;
        if (r02 == null) goto L7;
        r22.mo1998d(r02);
    L7:
        this.f3107a = r3;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: i */
    public final boolean mo2025i(MenuItemC0780k r7) {
        Toolbar r02 = this.f3109c;
        r02.m1141c();
        ViewParent r1 = r02.f1234h.getParent();
        if (r1 != r02) goto L5;
    L8:
        View r12 = r7.f2832z;
        if (r12 != null) goto L12;
        r12 = null;
    L12:
        r02.f1235i = r12;
        this.f3108b = r7;
        ViewParent r13 = r12.getParent();
        if (r13 != r02) goto L15;
    L18:
        int r14 = r02.getChildCount() - 1;
    L19:
        if (r14 < 0) goto L26;
        View r4 = r02.getChildAt(r14);
        if (((C0867J0) r4.getLayoutParams()).f3112b == 2) goto L25;
        if (r4 == r02.f1227a) goto L25;
        r02.removeViewAt(r14);
        r02.f1215E.add(r4);
    L25:
        r14 = r14 - 1;
        goto L19
    L26:
        r02.requestLayout();
        r7.f2806B = true;
        r7.f2820n.m2009o(false);
        r02.m1154t();
        return true;
    L15:
        if ((r13 instanceof ViewGroup) == false) goto L17;
        ((ViewGroup) r13).removeView(r02.f1235i);
    L17:
        C0867J0 r15 = Toolbar.m1135g();
        r15.f3111a = (r02.f1240n & 112) | 8388611;
        r15.f3112b = 2;
        r02.f1235i.setLayoutParams(r15);
        r02.addView(r02.f1235i);
        goto L18
    L5:
        if ((r1 instanceof ViewGroup) == false) goto L7;
        ((ViewGroup) r1).removeView(r02.f1234h);
    L7:
        r02.addView(r02.f1234h);
        goto L8
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: k */
    public final boolean mo1983k(SubMenuC0789t r1) {
        return false;
    }
}
