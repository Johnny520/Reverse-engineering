package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: renamed from: pB */
/* JADX INFO: loaded from: classes.dex */
public final class C2354pB implements InterfaceC0163Dr {

    /* JADX INFO: renamed from: a */
    public MenuC2204lr f8237a;

    /* JADX INFO: renamed from: b */
    public C2427qr f8238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Toolbar f8239c;

    public C2354pB(Toolbar toolbar) {
        this.f8239c = toolbar;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr menuC2204lr, boolean z) {
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: d */
    public final boolean mo215d(C2427qr c2427qr) {
        Toolbar toolbar = this.f8239c;
        KeyEvent.Callback callback = toolbar.f3831i;
        if (callback instanceof InterfaceC2316oa) {
            ((C2513sr) ((InterfaceC2316oa) callback)).f8802a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f3831i);
        toolbar.removeView(toolbar.f3830h);
        toolbar.f3831i = null;
        ArrayList arrayList = toolbar.f3807E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f8238b = null;
        toolbar.requestLayout();
        c2427qr.f8491C = false;
        c2427qr.f8505n.m4435p(false);
        toolbar.m2118v();
        return true;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: f */
    public final boolean mo217f(C2427qr c2427qr) {
        Toolbar toolbar = this.f8239c;
        toolbar.m2103c();
        ViewParent parent = toolbar.f3830h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f3830h);
            }
            toolbar.addView(toolbar.f3830h);
        }
        View actionView = c2427qr.getActionView();
        toolbar.f3831i = actionView;
        this.f8238b = c2427qr;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f3831i);
            }
            C2405qB c2405qBM2097h = Toolbar.m2097h();
            c2405qBM2097h.f8438a = (toolbar.f3836n & 112) | 8388611;
            c2405qBM2097h.f8439b = 2;
            toolbar.f3831i.setLayoutParams(c2405qBM2097h);
            toolbar.addView(toolbar.f3831i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C2405qB) childAt.getLayoutParams()).f8439b != 2 && childAt != toolbar.f3823a) {
                toolbar.removeViewAt(childCount);
                toolbar.f3807E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c2427qr.f8491C = true;
        c2427qr.f8505n.m4435p(false);
        KeyEvent.Callback callback = toolbar.f3831i;
        if (callback instanceof InterfaceC2316oa) {
            ((C2513sr) ((InterfaceC2316oa) callback)).f8802a.onActionViewExpanded();
        }
        toolbar.m2118v();
        return true;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        if (this.f8238b != null) {
            MenuC2204lr menuC2204lr = this.f8237a;
            if (menuC2204lr != null) {
                int size = menuC2204lr.f7665f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f8237a.getItem(i) == this.f8238b) {
                        return;
                    }
                }
            }
            mo215d(this.f8238b);
        }
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: i */
    public final void mo220i(Context context, MenuC2204lr menuC2204lr) {
        C2427qr c2427qr;
        MenuC2204lr menuC2204lr2 = this.f8237a;
        if (menuC2204lr2 != null && (c2427qr = this.f8238b) != null) {
            menuC2204lr2.mo426d(c2427qr);
        }
        this.f8237a = menuC2204lr;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez subMenuC0214Ez) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        return false;
    }
}
