package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: t8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0736t8 extends AbstractC0758tu implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b */
    public final Context f4523b;

    /* JADX INFO: renamed from: c */
    public final int f4524c;

    /* JADX INFO: renamed from: d */
    public final int f4525d;

    /* JADX INFO: renamed from: e */
    public final boolean f4526e;

    /* JADX INFO: renamed from: f */
    public final Handler f4527f;

    /* JADX INFO: renamed from: n */
    public View f4535n;

    /* JADX INFO: renamed from: o */
    public View f4536o;

    /* JADX INFO: renamed from: p */
    public int f4537p;

    /* JADX INFO: renamed from: q */
    public boolean f4538q;

    /* JADX INFO: renamed from: r */
    public boolean f4539r;

    /* JADX INFO: renamed from: s */
    public int f4540s;

    /* JADX INFO: renamed from: t */
    public int f4541t;

    /* JADX INFO: renamed from: v */
    public boolean f4543v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0128cv f4544w;

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver f4545x;

    /* JADX INFO: renamed from: y */
    public PopupWindow.OnDismissListener f4546y;

    /* JADX INFO: renamed from: z */
    public boolean f4547z;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4528g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f4529h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0398k4 f4530i = new ViewTreeObserverOnGlobalLayoutListenerC0398k4(2, this);

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0625q8 f4531j = new ViewOnAttachStateChangeListenerC0625q8(0, this);

    /* JADX INFO: renamed from: k */
    public final C0431l0 f4532k = new C0431l0(5, this);

    /* JADX INFO: renamed from: l */
    public int f4533l = 0;

    /* JADX INFO: renamed from: m */
    public int f4534m = 0;

    /* JADX INFO: renamed from: u */
    public boolean f4542u = false;

    public ViewOnKeyListenerC0736t8(Context context, View view, int i, boolean z) {
        this.f4523b = context;
        this.f4535n = view;
        this.f4525d = i;
        this.f4526e = z;
        WeakHashMap weakHashMap = ja0.f2600a;
        this.f4537p = t90.m2367d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4524c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4527f = new Handler();
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: a */
    public final void mo949a(MenuC0424ku menuC0424ku, boolean z) {
        ArrayList arrayList = this.f4529h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0424ku == ((C0699s8) arrayList.get(i)).f4393b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C0699s8) arrayList.get(i2)).f4393b.m1718c(false);
        }
        C0699s8 c0699s8 = (C0699s8) arrayList.remove(i);
        MenuC0424ku menuC0424ku2 = c0699s8.f4393b;
        C0082bv c0082bv = c0699s8.f4392a;
        C0091c4 c0091c4 = c0082bv.f2945z;
        menuC0424ku2.m1725r(this);
        if (this.f4547z) {
            AbstractC0906xu.m2636b(c0091c4, null);
            c0091c4.setAnimationStyle(0);
        }
        c0082bv.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4537p = ((C0699s8) arrayList.get(size2 - 1)).f4394c;
        } else {
            View view = this.f4535n;
            WeakHashMap weakHashMap = ja0.f2600a;
            this.f4537p = t90.m2367d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0699s8) arrayList.get(0)).f4393b.m1718c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0128cv interfaceC0128cv = this.f4544w;
        if (interfaceC0128cv != null) {
            interfaceC0128cv.mo829a(menuC0424ku, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4545x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4545x.removeGlobalOnLayoutListener(this.f4530i);
            }
            this.f4545x = null;
        }
        this.f4536o.removeOnAttachStateChangeListener(this.f4531j);
        this.f4546y.onDismiss();
    }

    @Override // p000.r30
    /* JADX INFO: renamed from: b */
    public final boolean mo1705b() {
        ArrayList arrayList = this.f4529h;
        return arrayList.size() > 0 && ((C0699s8) arrayList.get(0)).f4392a.f2945z.isShowing();
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: c */
    public final boolean mo950c() {
        return false;
    }

    @Override // p000.r30
    public final void dismiss() {
        ArrayList arrayList = this.f4529h;
        int size = arrayList.size();
        if (size > 0) {
            C0699s8[] c0699s8Arr = (C0699s8[]) arrayList.toArray(new C0699s8[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0699s8 c0699s8 = c0699s8Arr[i];
                if (c0699s8.f4392a.f2945z.isShowing()) {
                    c0699s8.f4392a.dismiss();
                }
            }
        }
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: e */
    public final void mo952e(InterfaceC0128cv interfaceC0128cv) {
        this.f4544w = interfaceC0128cv;
    }

    @Override // p000.r30
    /* JADX INFO: renamed from: f */
    public final void mo1708f() {
        if (mo1705b()) {
            return;
        }
        ArrayList arrayList = this.f4528g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m2363u((MenuC0424ku) obj);
        }
        arrayList.clear();
        View view = this.f4535n;
        this.f4536o = view;
        if (view != null) {
            boolean z = this.f4545x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4545x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4530i);
            }
            this.f4536o.addOnAttachStateChangeListener(this.f4531j);
        }
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: h */
    public final void mo954h() {
        ArrayList arrayList = this.f4529h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((C0699s8) obj).f4392a.f2922c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0311hu) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.r30
    /* JADX INFO: renamed from: j */
    public final C0411kh mo1711j() {
        ArrayList arrayList = this.f4529h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0699s8) arrayList.get(arrayList.size() - 1)).f4392a.f2922c;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: k */
    public final boolean mo956k(c50 c50Var) {
        ArrayList arrayList = this.f4529h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0699s8 c0699s8 = (C0699s8) obj;
            if (c50Var == c0699s8.f4393b) {
                c0699s8.f4392a.f2922c.requestFocus();
                return true;
            }
        }
        if (!c50Var.hasVisibleItems()) {
            return false;
        }
        mo2142l(c50Var);
        InterfaceC0128cv interfaceC0128cv = this.f4544w;
        if (interfaceC0128cv != null) {
            interfaceC0128cv.mo830q(c50Var);
        }
        return true;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: l */
    public final void mo2142l(MenuC0424ku menuC0424ku) {
        menuC0424ku.m1717b(this, this.f4523b);
        if (mo1705b()) {
            m2363u(menuC0424ku);
        } else {
            this.f4528g.add(menuC0424ku);
        }
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: n */
    public final void mo2143n(View view) {
        if (this.f4535n != view) {
            this.f4535n = view;
            int i = this.f4533l;
            WeakHashMap weakHashMap = ja0.f2600a;
            this.f4534m = Gravity.getAbsoluteGravity(i, t90.m2367d(view));
        }
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: o */
    public final void mo2144o(boolean z) {
        this.f4542u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0699s8 c0699s8;
        ArrayList arrayList = this.f4529h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0699s8 = null;
                break;
            }
            c0699s8 = (C0699s8) arrayList.get(i);
            if (!c0699s8.f4392a.f2945z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0699s8 != null) {
            c0699s8.f4393b.m1718c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: p */
    public final void mo2145p(int i) {
        if (this.f4533l != i) {
            this.f4533l = i;
            View view = this.f4535n;
            WeakHashMap weakHashMap = ja0.f2600a;
            this.f4534m = Gravity.getAbsoluteGravity(i, t90.m2367d(view));
        }
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: q */
    public final void mo2146q(int i) {
        this.f4538q = true;
        this.f4540s = i;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: r */
    public final void mo2147r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4546y = onDismissListener;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: s */
    public final void mo2148s(boolean z) {
        this.f4543v = z;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: t */
    public final void mo2149t(int i) {
        this.f4539r = true;
        this.f4541t = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019c  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2363u(p000.MenuC0424ku r18) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnKeyListenerC0736t8.m2363u(ku):void");
    }
}
