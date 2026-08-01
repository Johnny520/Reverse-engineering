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

/* JADX INFO: renamed from: e9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0179e9 extends AbstractC0082bv implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b */
    public final Context f1535b;

    /* JADX INFO: renamed from: c */
    public final int f1536c;

    /* JADX INFO: renamed from: d */
    public final int f1537d;

    /* JADX INFO: renamed from: e */
    public final boolean f1538e;

    /* JADX INFO: renamed from: f */
    public final Handler f1539f;

    /* JADX INFO: renamed from: n */
    public View f1547n;

    /* JADX INFO: renamed from: o */
    public View f1548o;

    /* JADX INFO: renamed from: p */
    public int f1549p;

    /* JADX INFO: renamed from: q */
    public boolean f1550q;

    /* JADX INFO: renamed from: r */
    public boolean f1551r;

    /* JADX INFO: renamed from: s */
    public int f1552s;

    /* JADX INFO: renamed from: t */
    public int f1553t;

    /* JADX INFO: renamed from: v */
    public boolean f1555v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0425kv f1556w;

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver f1557x;

    /* JADX INFO: renamed from: y */
    public PopupWindow.OnDismissListener f1558y;

    /* JADX INFO: renamed from: z */
    public boolean f1559z;

    /* JADX INFO: renamed from: g */
    public final ArrayList f1540g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f1541h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0398k4 f1542i = new ViewTreeObserverOnGlobalLayoutListenerC0398k4(2, this);

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0060b9 f1543j = new ViewOnAttachStateChangeListenerC0060b9(0, this);

    /* JADX INFO: renamed from: k */
    public final C0431l0 f1544k = new C0431l0(5, this);

    /* JADX INFO: renamed from: l */
    public int f1545l = 0;

    /* JADX INFO: renamed from: m */
    public int f1546m = 0;

    /* JADX INFO: renamed from: u */
    public boolean f1554u = false;

    public ViewOnKeyListenerC0179e9(Context context, View view, int i, boolean z) {
        this.f1535b = context;
        this.f1547n = view;
        this.f1537d = i;
        this.f1538e = z;
        WeakHashMap weakHashMap = oa0.f3426a;
        this.f1549p = y90.m2732d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1536c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1539f = new Handler();
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: a */
    public final void mo972a(MenuC0646qu menuC0646qu, boolean z) {
        ArrayList arrayList = this.f1541h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0646qu == ((C0143d9) arrayList.get(i)).f1338b) {
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
            ((C0143d9) arrayList.get(i2)).f1338b.m2167c(false);
        }
        C0143d9 c0143d9 = (C0143d9) arrayList.remove(i);
        MenuC0646qu menuC0646qu2 = c0143d9.f1338b;
        C0388jv c0388jv = c0143d9.f1337a;
        C0091c4 c0091c4 = c0388jv.f3542z;
        menuC0646qu2.m2174r(this);
        if (this.f1559z) {
            AbstractC0238fv.m1114b(c0091c4, null);
            c0091c4.setAnimationStyle(0);
        }
        c0388jv.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f1549p = ((C0143d9) arrayList.get(size2 - 1)).f1339c;
        } else {
            View view = this.f1547n;
            WeakHashMap weakHashMap = oa0.f3426a;
            this.f1549p = y90.m2732d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0143d9) arrayList.get(0)).f1338b.m2167c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0425kv interfaceC0425kv = this.f1556w;
        if (interfaceC0425kv != null) {
            interfaceC0425kv.mo1134a(menuC0646qu, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1557x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1557x.removeGlobalOnLayoutListener(this.f1542i);
            }
            this.f1557x = null;
        }
        this.f1548o.removeOnAttachStateChangeListener(this.f1543j);
        this.f1558y.onDismiss();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: b */
    public final boolean mo973b() {
        ArrayList arrayList = this.f1541h;
        return arrayList.size() > 0 && ((C0143d9) arrayList.get(0)).f1337a.f3542z.isShowing();
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: c */
    public final boolean mo974c() {
        return false;
    }

    @Override // p000.y30
    public final void dismiss() {
        ArrayList arrayList = this.f1541h;
        int size = arrayList.size();
        if (size > 0) {
            C0143d9[] c0143d9Arr = (C0143d9[]) arrayList.toArray(new C0143d9[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0143d9 c0143d9 = c0143d9Arr[i];
                if (c0143d9.f1337a.f3542z.isShowing()) {
                    c0143d9.f1337a.dismiss();
                }
            }
        }
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: e */
    public final void mo975e(InterfaceC0425kv interfaceC0425kv) {
        this.f1556w = interfaceC0425kv;
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: f */
    public final void mo976f() {
        if (mo973b()) {
            return;
        }
        ArrayList arrayList = this.f1540g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m980u((MenuC0646qu) obj);
        }
        arrayList.clear();
        View view = this.f1547n;
        this.f1548o = view;
        if (view != null) {
            boolean z = this.f1557x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1557x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1542i);
            }
            this.f1548o.addOnAttachStateChangeListener(this.f1543j);
        }
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: h */
    public final void mo977h() {
        ArrayList arrayList = this.f1541h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((C0143d9) obj).f1337a.f3519c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0535nu) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: j */
    public final C0485mh mo978j() {
        ArrayList arrayList = this.f1541h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0143d9) arrayList.get(arrayList.size() - 1)).f1337a.f3519c;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: k */
    public final boolean mo979k(j50 j50Var) {
        ArrayList arrayList = this.f1541h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0143d9 c0143d9 = (C0143d9) obj;
            if (j50Var == c0143d9.f1338b) {
                c0143d9.f1337a.f3519c.requestFocus();
                return true;
            }
        }
        if (!j50Var.hasVisibleItems()) {
            return false;
        }
        mo533l(j50Var);
        InterfaceC0425kv interfaceC0425kv = this.f1556w;
        if (interfaceC0425kv != null) {
            interfaceC0425kv.mo1135q(j50Var);
        }
        return true;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: l */
    public final void mo533l(MenuC0646qu menuC0646qu) {
        menuC0646qu.m2166b(this, this.f1535b);
        if (mo973b()) {
            m980u(menuC0646qu);
        } else {
            this.f1540g.add(menuC0646qu);
        }
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: n */
    public final void mo534n(View view) {
        if (this.f1547n != view) {
            this.f1547n = view;
            int i = this.f1545l;
            WeakHashMap weakHashMap = oa0.f3426a;
            this.f1546m = Gravity.getAbsoluteGravity(i, y90.m2732d(view));
        }
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: o */
    public final void mo535o(boolean z) {
        this.f1554u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0143d9 c0143d9;
        ArrayList arrayList = this.f1541h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0143d9 = null;
                break;
            }
            c0143d9 = (C0143d9) arrayList.get(i);
            if (!c0143d9.f1337a.f3542z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0143d9 != null) {
            c0143d9.f1338b.m2167c(false);
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

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: p */
    public final void mo536p(int i) {
        if (this.f1545l != i) {
            this.f1545l = i;
            View view = this.f1547n;
            WeakHashMap weakHashMap = oa0.f3426a;
            this.f1546m = Gravity.getAbsoluteGravity(i, y90.m2732d(view));
        }
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: q */
    public final void mo537q(int i) {
        this.f1550q = true;
        this.f1552s = i;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: r */
    public final void mo538r(PopupWindow.OnDismissListener onDismissListener) {
        this.f1558y = onDismissListener;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: s */
    public final void mo539s(boolean z) {
        this.f1555v = z;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: t */
    public final void mo540t(int i) {
        this.f1551r = true;
        this.f1553t = i;
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
    public final void m980u(p000.MenuC0646qu r18) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnKeyListenerC0179e9.m980u(qu):void");
    }
}
