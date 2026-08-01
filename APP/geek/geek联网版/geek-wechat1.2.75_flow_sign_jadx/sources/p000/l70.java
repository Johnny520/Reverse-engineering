package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l70 implements InterfaceC0462lv {

    /* JADX INFO: renamed from: a */
    public MenuC0646qu f2965a;

    /* JADX INFO: renamed from: b */
    public C0869wu f2966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Toolbar f2967c;

    public l70(Toolbar toolbar) {
        this.f2967c = toolbar;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: c */
    public final boolean mo974c() {
        return false;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: d */
    public final boolean mo530d(C0869wu c0869wu) {
        Toolbar toolbar = this.f2967c;
        KeyEvent.Callback callback = toolbar.f337i;
        if (callback instanceof InterfaceC0255gb) {
            ((InterfaceC0255gb) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f337i);
        toolbar.removeView(toolbar.f336h);
        toolbar.f337i = null;
        ArrayList arrayList = toolbar.f316E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2966b = null;
        toolbar.requestLayout();
        c0869wu.f5111C = false;
        c0869wu.f5125n.m2172p(false);
        toolbar.m187u();
        return true;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: g */
    public final boolean mo531g(C0869wu c0869wu) {
        Toolbar toolbar = this.f2967c;
        toolbar.m173c();
        ViewParent parent = toolbar.f336h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f336h);
            }
            toolbar.addView(toolbar.f336h);
        }
        View actionView = c0869wu.getActionView();
        toolbar.f337i = actionView;
        this.f2966b = c0869wu;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f337i);
            }
            m70 m70VarM167h = Toolbar.m167h();
            m70VarM167h.f3097a = (toolbar.f342n & 112) | 8388611;
            m70VarM167h.f3098b = 2;
            toolbar.f337i.setLayoutParams(m70VarM167h);
            toolbar.addView(toolbar.f337i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((m70) childAt.getLayoutParams()).f3098b != 2 && childAt != toolbar.f329a) {
                toolbar.removeViewAt(childCount);
                toolbar.f316E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0869wu.f5111C = true;
        c0869wu.f5125n.m2172p(false);
        KeyEvent.Callback callback = toolbar.f337i;
        if (callback instanceof InterfaceC0255gb) {
            ((InterfaceC0255gb) callback).onActionViewExpanded();
        }
        toolbar.m187u();
        return true;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: h */
    public final void mo977h() {
        if (this.f2966b != null) {
            MenuC0646qu menuC0646qu = this.f2965a;
            if (menuC0646qu != null) {
                int size = menuC0646qu.f3956f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2965a.getItem(i) == this.f2966b) {
                        return;
                    }
                }
            }
            mo530d(this.f2966b);
        }
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: i */
    public final void mo532i(Context context, MenuC0646qu menuC0646qu) {
        C0869wu c0869wu;
        MenuC0646qu menuC0646qu2 = this.f2965a;
        if (menuC0646qu2 != null && (c0869wu = this.f2966b) != null) {
            menuC0646qu2.mo1566d(c0869wu);
        }
        this.f2965a = menuC0646qu;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: k */
    public final boolean mo979k(j50 j50Var) {
        return false;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: a */
    public final void mo972a(MenuC0646qu menuC0646qu, boolean z) {
    }
}
