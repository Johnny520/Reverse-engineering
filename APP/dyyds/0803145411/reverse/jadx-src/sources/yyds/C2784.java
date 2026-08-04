package yyds;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲈᲇᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2784 implements InterfaceC0613 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f13606;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public MenuC0836 f13607;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C1148 f13608;

    public C2784(Toolbar toolbar) {
        this.f13606 = toolbar;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo1501() {
        return false;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final boolean mo1502(C1148 c1148) {
        Toolbar toolbar = this.f13606;
        KeyEvent.Callback callback = toolbar.f223;
        if (callback instanceof InterfaceC2697) {
            ((InterfaceC2697) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f223);
        toolbar.removeView(toolbar.f229);
        toolbar.f223 = null;
        ArrayList arrayList = toolbar.f226;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f13608 = null;
        toolbar.requestLayout();
        c1148.f5273 = false;
        c1148.f5276.m1915(false);
        toolbar.m81();
        return true;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1503() {
        if (this.f13608 != null) {
            MenuC0836 menuC0836 = this.f13607;
            if (menuC0836 != null) {
                int size = menuC0836.f3823.size();
                for (int i = 0; i < size; i++) {
                    if (this.f13607.getItem(i) == this.f13608) {
                        return;
                    }
                }
            }
            mo1502(this.f13608);
        }
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1504(MenuC0836 menuC0836, boolean z) {
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo1505(SubMenuC1011 subMenuC1011) {
        return false;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final boolean mo1506(C1148 c1148) {
        Toolbar toolbar = this.f13606;
        toolbar.m89();
        ViewParent parent = toolbar.f229.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f229);
            }
            toolbar.addView(toolbar.f229);
        }
        View actionView = c1148.getActionView();
        toolbar.f223 = actionView;
        this.f13608 = c1148;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f223);
            }
            C1026 c1026M73 = Toolbar.m73();
            c1026M73.f4675 = (toolbar.f237 & 112) | 8388611;
            c1026M73.f4676 = 2;
            toolbar.f223.setLayoutParams(c1026M73);
            toolbar.addView(toolbar.f223);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1026) childAt.getLayoutParams()).f4676 != 2 && childAt != toolbar.f234) {
                toolbar.removeViewAt(childCount);
                toolbar.f226.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1148.f5273 = true;
        c1148.f5276.m1915(false);
        KeyEvent.Callback callback = toolbar.f223;
        if (callback instanceof InterfaceC2697) {
            ((InterfaceC2697) callback).onActionViewExpanded();
        }
        toolbar.m81();
        return true;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1507(Context context, MenuC0836 menuC0836) {
        C1148 c1148;
        MenuC0836 menuC08362 = this.f13607;
        if (menuC08362 != null && (c1148 = this.f13608) != null) {
            menuC08362.mo1917(c1148);
        }
        this.f13607 = menuC0836;
    }
}
