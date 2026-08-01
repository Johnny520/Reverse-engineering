package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x40 extends AbstractC0082bv implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b */
    public final Context f5164b;

    /* JADX INFO: renamed from: c */
    public final MenuC0646qu f5165c;

    /* JADX INFO: renamed from: d */
    public final C0535nu f5166d;

    /* JADX INFO: renamed from: e */
    public final boolean f5167e;

    /* JADX INFO: renamed from: f */
    public final int f5168f;

    /* JADX INFO: renamed from: g */
    public final int f5169g;

    /* JADX INFO: renamed from: h */
    public final C0388jv f5170h;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f5173k;

    /* JADX INFO: renamed from: l */
    public View f5174l;

    /* JADX INFO: renamed from: m */
    public View f5175m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0425kv f5176n;

    /* JADX INFO: renamed from: o */
    public ViewTreeObserver f5177o;

    /* JADX INFO: renamed from: p */
    public boolean f5178p;

    /* JADX INFO: renamed from: q */
    public boolean f5179q;

    /* JADX INFO: renamed from: r */
    public int f5180r;

    /* JADX INFO: renamed from: t */
    public boolean f5182t;

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0398k4 f5171i = new ViewTreeObserverOnGlobalLayoutListenerC0398k4(3, this);

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0060b9 f5172j = new ViewOnAttachStateChangeListenerC0060b9(2, this);

    /* JADX INFO: renamed from: s */
    public int f5181s = 0;

    public x40(Context context, MenuC0646qu menuC0646qu, View view, int i, boolean z) {
        this.f5164b = context;
        this.f5165c = menuC0646qu;
        this.f5167e = z;
        this.f5166d = new C0535nu(menuC0646qu, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f5169g = i;
        Resources resources = context.getResources();
        this.f5168f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f5174l = view;
        this.f5170h = new C0388jv(context, null, i, 0);
        menuC0646qu.m2166b(this, context);
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: a */
    public final void mo972a(MenuC0646qu menuC0646qu, boolean z) {
        if (menuC0646qu != this.f5165c) {
            return;
        }
        dismiss();
        InterfaceC0425kv interfaceC0425kv = this.f5176n;
        if (interfaceC0425kv != null) {
            interfaceC0425kv.mo1134a(menuC0646qu, z);
        }
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: b */
    public final boolean mo973b() {
        return !this.f5178p && this.f5170h.f3542z.isShowing();
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: c */
    public final boolean mo974c() {
        return false;
    }

    @Override // p000.y30
    public final void dismiss() {
        if (mo973b()) {
            this.f5170h.dismiss();
        }
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: e */
    public final void mo975e(InterfaceC0425kv interfaceC0425kv) {
        this.f5176n = interfaceC0425kv;
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: f */
    public final void mo976f() {
        View view;
        if (mo973b()) {
            return;
        }
        if (this.f5178p || (view = this.f5174l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f5175m = view;
        C0388jv c0388jv = this.f5170h;
        C0091c4 c0091c4 = c0388jv.f3542z;
        C0091c4 c0091c42 = c0388jv.f3542z;
        c0091c4.setOnDismissListener(this);
        c0388jv.f3532p = this;
        c0388jv.f3541y = true;
        c0091c42.setFocusable(true);
        View view2 = this.f5175m;
        boolean z = this.f5177o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f5177o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f5171i);
        }
        view2.addOnAttachStateChangeListener(this.f5172j);
        c0388jv.f3531o = view2;
        c0388jv.f3528l = this.f5181s;
        boolean z2 = this.f5179q;
        Context context = this.f5164b;
        C0535nu c0535nu = this.f5166d;
        if (!z2) {
            this.f5180r = AbstractC0082bv.m529m(c0535nu, context, this.f5168f);
            this.f5179q = true;
        }
        c0388jv.m2058q(this.f5180r);
        c0091c42.setInputMethodMode(2);
        Rect rect = this.f782a;
        c0388jv.f3540x = rect != null ? new Rect(rect) : null;
        c0388jv.mo976f();
        C0485mh c0485mh = c0388jv.f3519c;
        c0485mh.setOnKeyListener(this);
        if (this.f5182t) {
            MenuC0646qu menuC0646qu = this.f5165c;
            if (menuC0646qu.f3963m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0485mh, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0646qu.f3963m);
                }
                frameLayout.setEnabled(false);
                c0485mh.addHeaderView(frameLayout, null, false);
            }
        }
        c0388jv.mo1982n(c0535nu);
        c0388jv.mo976f();
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: h */
    public final void mo977h() {
        this.f5179q = false;
        C0535nu c0535nu = this.f5166d;
        if (c0535nu != null) {
            c0535nu.notifyDataSetChanged();
        }
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: j */
    public final C0485mh mo978j() {
        return this.f5170h.f3519c;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: k */
    public final boolean mo979k(j50 j50Var) {
        boolean z;
        if (j50Var.hasVisibleItems()) {
            C0201ev c0201ev = new C0201ev(this.f5164b, j50Var, this.f5175m, this.f5167e, this.f5169g, 0);
            InterfaceC0425kv interfaceC0425kv = this.f5176n;
            c0201ev.f1668h = interfaceC0425kv;
            AbstractC0082bv abstractC0082bv = c0201ev.f1669i;
            if (abstractC0082bv != null) {
                abstractC0082bv.mo975e(interfaceC0425kv);
            }
            int size = j50Var.f3956f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = j50Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c0201ev.f1667g = z;
            AbstractC0082bv abstractC0082bv2 = c0201ev.f1669i;
            if (abstractC0082bv2 != null) {
                abstractC0082bv2.mo535o(z);
            }
            c0201ev.f1670j = this.f5173k;
            this.f5173k = null;
            this.f5165c.m2167c(false);
            C0388jv c0388jv = this.f5170h;
            int width = c0388jv.f3522f;
            int iM2054g = c0388jv.m2054g();
            int i2 = this.f5181s;
            View view = this.f5174l;
            WeakHashMap weakHashMap = oa0.f3426a;
            if ((Gravity.getAbsoluteGravity(i2, y90.m2732d(view)) & 7) == 5) {
                width += this.f5174l.getWidth();
            }
            if (!c0201ev.m1029b()) {
                if (c0201ev.f1665e != null) {
                    c0201ev.m1031d(width, iM2054g, true, true);
                }
            }
            InterfaceC0425kv interfaceC0425kv2 = this.f5176n;
            if (interfaceC0425kv2 != null) {
                interfaceC0425kv2.mo1135q(j50Var);
            }
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: n */
    public final void mo534n(View view) {
        this.f5174l = view;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: o */
    public final void mo535o(boolean z) {
        this.f5166d.f3350c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f5178p = true;
        this.f5165c.m2167c(true);
        ViewTreeObserver viewTreeObserver = this.f5177o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f5177o = this.f5175m.getViewTreeObserver();
            }
            this.f5177o.removeGlobalOnLayoutListener(this.f5171i);
            this.f5177o = null;
        }
        this.f5175m.removeOnAttachStateChangeListener(this.f5172j);
        PopupWindow.OnDismissListener onDismissListener = this.f5173k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f5181s = i;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: q */
    public final void mo537q(int i) {
        this.f5170h.f3522f = i;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: r */
    public final void mo538r(PopupWindow.OnDismissListener onDismissListener) {
        this.f5173k = onDismissListener;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: s */
    public final void mo539s(boolean z) {
        this.f5182t = z;
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: t */
    public final void mo540t(int i) {
        this.f5170h.m2057m(i);
    }

    @Override // p000.AbstractC0082bv
    /* JADX INFO: renamed from: l */
    public final void mo533l(MenuC0646qu menuC0646qu) {
    }
}
