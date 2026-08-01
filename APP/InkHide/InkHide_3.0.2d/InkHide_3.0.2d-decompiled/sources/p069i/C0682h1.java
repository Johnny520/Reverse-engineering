package p069i;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p066g.InterfaceC0562b;
import p068h.C0596o;
import p068h.InterfaceC0607z;
import p068h.MenuC0594m;
import p068h.SubMenuC0581F;

/* JADX INFO: renamed from: i.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0682h1 implements InterfaceC0607z {

    /* JADX INFO: renamed from: b */
    public MenuC0594m f2294b;

    /* JADX INFO: renamed from: c */
    public C0596o f2295c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Toolbar f2296d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0682h1(Toolbar toolbar) {
        this.f2296d = toolbar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: c */
    public final void mo1148c() {
        if (this.f2295c != null) {
            MenuC0594m menuC0594m = this.f2294b;
            if (menuC0594m != null) {
                int size = menuC0594m.f2035f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2294b.getItem(i2) == this.f2295c) {
                        return;
                    }
                }
            }
            mo1177d(this.f2295c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: d */
    public final boolean mo1177d(C0596o c0596o) {
        Toolbar toolbar = this.f2296d;
        KeyEvent.Callback callback = toolbar.f1092j;
        if (callback instanceof InterfaceC0562b) {
            ((InterfaceC0562b) callback).mo679c();
        }
        toolbar.removeView(toolbar.f1092j);
        toolbar.removeView(toolbar.f1091i);
        toolbar.f1092j = null;
        ArrayList arrayList = toolbar.f1074F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2295c = null;
        toolbar.requestLayout();
        c0596o.f2059C = false;
        c0596o.f2073n.m1189p(false);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: g */
    public final void mo1178g(Context context, MenuC0594m menuC0594m) {
        C0596o c0596o;
        MenuC0594m menuC0594m2 = this.f2294b;
        if (menuC0594m2 != null && (c0596o = this.f2295c) != null) {
            menuC0594m2.mo1160d(c0596o);
        }
        this.f2294b = menuC0594m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: i */
    public final boolean mo1150i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: j */
    public final boolean mo1151j(SubMenuC0581F subMenuC0581F) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: k */
    public final boolean mo1179k(C0596o c0596o) {
        Toolbar toolbar = this.f2296d;
        toolbar.m701c();
        ViewParent parent = toolbar.f1091i.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1091i);
            }
            toolbar.addView(toolbar.f1091i);
        }
        View actionView = c0596o.getActionView();
        toolbar.f1092j = actionView;
        this.f2295c = c0596o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1092j);
            }
            C0685i1 c0685i1M695h = Toolbar.m695h();
            c0685i1M695h.f2299a = (toolbar.f1097o & 112) | 8388611;
            c0685i1M695h.f2300b = 2;
            toolbar.f1092j.setLayoutParams(c0685i1M695h);
            toolbar.addView(toolbar.f1092j);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C0685i1) childAt.getLayoutParams()).f2300b != 2 && childAt != toolbar.f1084b) {
                toolbar.removeViewAt(childCount);
                toolbar.f1074F.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0596o.f2059C = true;
        c0596o.f2073n.m1189p(false);
        KeyEvent.Callback callback = toolbar.f1092j;
        if (callback instanceof InterfaceC0562b) {
            ((InterfaceC0562b) callback).mo678a();
        }
        return true;
    }

    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: b */
    public final void mo1147b(MenuC0594m menuC0594m, boolean z2) {
    }
}
