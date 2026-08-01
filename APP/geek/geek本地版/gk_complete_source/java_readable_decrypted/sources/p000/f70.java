package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f70 implements InterfaceC0164dv {

    /* JADX INFO: renamed from: a */
    public MenuC0424ku f1900a;

    /* JADX INFO: renamed from: b */
    public C0572ou f1901b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Toolbar f1902c;

    public f70(Toolbar toolbar) {
        this.f1902c = toolbar;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: c */
    public final boolean mo950c() {
        return false;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: d */
    public final boolean mo951d(C0572ou c0572ou) {
        Toolbar toolbar = this.f1902c;
        KeyEvent.Callback callback = toolbar.f374i;
        if (callback instanceof InterfaceC0923ya) {
            ((InterfaceC0923ya) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f374i);
        toolbar.removeView(toolbar.f373h);
        toolbar.f374i = null;
        ArrayList arrayList = toolbar.f353E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f1901b = null;
        toolbar.requestLayout();
        c0572ou.f3585C = false;
        c0572ou.f3599n.m1723p(false);
        toolbar.m202u();
        return true;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: g */
    public final boolean mo953g(C0572ou c0572ou) {
        Toolbar toolbar = this.f1902c;
        toolbar.m188c();
        ViewParent parent = toolbar.f373h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f373h);
            }
            toolbar.addView(toolbar.f373h);
        }
        View actionView = c0572ou.getActionView();
        toolbar.f374i = actionView;
        this.f1901b = c0572ou;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f374i);
            }
            g70 g70VarM182h = Toolbar.m182h();
            g70VarM182h.f2033a = (toolbar.f379n & 112) | 8388611;
            g70VarM182h.f2034b = 2;
            toolbar.f374i.setLayoutParams(g70VarM182h);
            toolbar.addView(toolbar.f374i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((g70) childAt.getLayoutParams()).f2034b != 2 && childAt != toolbar.f366a) {
                toolbar.removeViewAt(childCount);
                toolbar.f353E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0572ou.f3585C = true;
        c0572ou.f3599n.m1723p(false);
        KeyEvent.Callback callback = toolbar.f374i;
        if (callback instanceof InterfaceC0923ya) {
            ((InterfaceC0923ya) callback).onActionViewExpanded();
        }
        toolbar.m202u();
        return true;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: h */
    public final void mo954h() {
        if (this.f1901b != null) {
            MenuC0424ku menuC0424ku = this.f1900a;
            if (menuC0424ku != null) {
                int size = menuC0424ku.f2955f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f1900a.getItem(i) == this.f1901b) {
                        return;
                    }
                }
            }
            mo951d(this.f1901b);
        }
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: i */
    public final void mo955i(Context context, MenuC0424ku menuC0424ku) {
        C0572ou c0572ou;
        MenuC0424ku menuC0424ku2 = this.f1900a;
        if (menuC0424ku2 != null && (c0572ou = this.f1901b) != null) {
            menuC0424ku2.mo629d(c0572ou);
        }
        this.f1900a = menuC0424ku;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: k */
    public final boolean mo956k(c50 c50Var) {
        return false;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: a */
    public final void mo949a(MenuC0424ku menuC0424ku, boolean z) {
    }
}
