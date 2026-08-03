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

    public C0865I0(Toolbar toolbar) {
        this.f3109c = toolbar;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: a */
    public final void mo1976a(MenuC0779j menuC0779j, boolean z2) {
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: b */
    public final void mo1977b() {
        if (this.f3108b != null) {
            MenuC0779j menuC0779j = this.f3107a;
            if (menuC0779j != null) {
                int size = menuC0779j.f2790f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f3107a.getItem(i2) == this.f3108b) {
                        return;
                    }
                }
            }
            mo2023c(this.f3108b);
        }
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: c */
    public final boolean mo2023c(MenuItemC0780k menuItemC0780k) {
        Toolbar toolbar = this.f3109c;
        toolbar.removeView(toolbar.f1235i);
        toolbar.removeView(toolbar.f1234h);
        toolbar.f1235i = null;
        ArrayList arrayList = toolbar.f1215E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3108b = null;
        toolbar.requestLayout();
        menuItemC0780k.f2806B = false;
        menuItemC0780k.f2820n.m2009o(false);
        toolbar.m1154t();
        return true;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: g */
    public final boolean mo1981g() {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: h */
    public final void mo2024h(Context context, MenuC0779j menuC0779j) {
        MenuItemC0780k menuItemC0780k;
        MenuC0779j menuC0779j2 = this.f3107a;
        if (menuC0779j2 != null && (menuItemC0780k = this.f3108b) != null) {
            menuC0779j2.mo1998d(menuItemC0780k);
        }
        this.f3107a = menuC0779j;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: i */
    public final boolean mo2025i(MenuItemC0780k menuItemC0780k) {
        Toolbar toolbar = this.f3109c;
        toolbar.m1141c();
        ViewParent parent = toolbar.f1234h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1234h);
            }
            toolbar.addView(toolbar.f1234h);
        }
        View view = menuItemC0780k.f2832z;
        if (view == null) {
            view = null;
        }
        toolbar.f1235i = view;
        this.f3108b = menuItemC0780k;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1235i);
            }
            C0867J0 c0867j0M1135g = Toolbar.m1135g();
            c0867j0M1135g.f3111a = (toolbar.f1240n & 112) | 8388611;
            c0867j0M1135g.f3112b = 2;
            toolbar.f1235i.setLayoutParams(c0867j0M1135g);
            toolbar.addView(toolbar.f1235i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C0867J0) childAt.getLayoutParams()).f3112b != 2 && childAt != toolbar.f1227a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1215E.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC0780k.f2806B = true;
        menuItemC0780k.f2820n.m2009o(false);
        toolbar.m1154t();
        return true;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: k */
    public final boolean mo1983k(SubMenuC0789t subMenuC0789t) {
        return false;
    }
}
