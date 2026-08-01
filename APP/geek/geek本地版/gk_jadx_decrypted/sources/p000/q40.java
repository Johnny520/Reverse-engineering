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
public final class q40 extends AbstractC0758tu implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b */
    public final Context f3995b;

    /* JADX INFO: renamed from: c */
    public final MenuC0424ku f3996c;

    /* JADX INFO: renamed from: d */
    public final C0311hu f3997d;

    /* JADX INFO: renamed from: e */
    public final boolean f3998e;

    /* JADX INFO: renamed from: f */
    public final int f3999f;

    /* JADX INFO: renamed from: g */
    public final int f4000g;

    /* JADX INFO: renamed from: h */
    public final C0082bv f4001h;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f4004k;

    /* JADX INFO: renamed from: l */
    public View f4005l;

    /* JADX INFO: renamed from: m */
    public View f4006m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0128cv f4007n;

    /* JADX INFO: renamed from: o */
    public ViewTreeObserver f4008o;

    /* JADX INFO: renamed from: p */
    public boolean f4009p;

    /* JADX INFO: renamed from: q */
    public boolean f4010q;

    /* JADX INFO: renamed from: r */
    public int f4011r;

    /* JADX INFO: renamed from: t */
    public boolean f4013t;

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0398k4 f4002i = new ViewTreeObserverOnGlobalLayoutListenerC0398k4(3, this);

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0625q8 f4003j = new ViewOnAttachStateChangeListenerC0625q8(2, this);

    /* JADX INFO: renamed from: s */
    public int f4012s = 0;

    public q40(Context context, MenuC0424ku menuC0424ku, View view, int i, boolean z) {
        this.f3995b = context;
        this.f3996c = menuC0424ku;
        this.f3998e = z;
        this.f3997d = new C0311hu(menuC0424ku, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f4000g = i;
        Resources resources = context.getResources();
        this.f3999f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4005l = view;
        this.f4001h = new C0082bv(context, null, i, 0);
        menuC0424ku.m1717b(this, context);
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: a */
    public final void mo949a(MenuC0424ku menuC0424ku, boolean z) {
        if (menuC0424ku != this.f3996c) {
            return;
        }
        dismiss();
        InterfaceC0128cv interfaceC0128cv = this.f4007n;
        if (interfaceC0128cv != null) {
            interfaceC0128cv.mo829a(menuC0424ku, z);
        }
    }

    @Override // p000.r30
    /* JADX INFO: renamed from: b */
    public final boolean mo1705b() {
        return !this.f4009p && this.f4001h.f2945z.isShowing();
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: c */
    public final boolean mo950c() {
        return false;
    }

    @Override // p000.r30
    public final void dismiss() {
        if (mo1705b()) {
            this.f4001h.dismiss();
        }
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: e */
    public final void mo952e(InterfaceC0128cv interfaceC0128cv) {
        this.f4007n = interfaceC0128cv;
    }

    @Override // p000.r30
    /* JADX INFO: renamed from: f */
    public final void mo1708f() {
        View view;
        if (mo1705b()) {
            return;
        }
        if (this.f4009p || (view = this.f4005l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4006m = view;
        C0082bv c0082bv = this.f4001h;
        C0091c4 c0091c4 = c0082bv.f2945z;
        C0091c4 c0091c42 = c0082bv.f2945z;
        c0091c4.setOnDismissListener(this);
        c0082bv.f2935p = this;
        c0082bv.f2944y = true;
        c0091c42.setFocusable(true);
        View view2 = this.f4006m;
        boolean z = this.f4008o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4008o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4002i);
        }
        view2.addOnAttachStateChangeListener(this.f4003j);
        c0082bv.f2934o = view2;
        c0082bv.f2931l = this.f4012s;
        boolean z2 = this.f4010q;
        Context context = this.f3995b;
        C0311hu c0311hu = this.f3997d;
        if (!z2) {
            this.f4011r = AbstractC0758tu.m2389m(c0311hu, context, this.f3999f);
            this.f4010q = true;
        }
        c0082bv.m1715q(this.f4011r);
        c0091c42.setInputMethodMode(2);
        Rect rect = this.f4619a;
        c0082bv.f2943x = rect != null ? new Rect(rect) : null;
        c0082bv.mo1708f();
        C0411kh c0411kh = c0082bv.f2922c;
        c0411kh.setOnKeyListener(this);
        if (this.f4013t) {
            MenuC0424ku menuC0424ku = this.f3996c;
            if (menuC0424ku.f2962m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0411kh, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0424ku.f2962m);
                }
                frameLayout.setEnabled(false);
                c0411kh.addHeaderView(frameLayout, null, false);
            }
        }
        c0082bv.mo1714n(c0311hu);
        c0082bv.mo1708f();
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: h */
    public final void mo954h() {
        this.f4010q = false;
        C0311hu c0311hu = this.f3997d;
        if (c0311hu != null) {
            c0311hu.notifyDataSetChanged();
        }
    }

    @Override // p000.r30
    /* JADX INFO: renamed from: j */
    public final C0411kh mo1711j() {
        return this.f4001h.f2922c;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: k */
    public final boolean mo956k(c50 c50Var) {
        boolean z;
        if (c50Var.hasVisibleItems()) {
            C0869wu c0869wu = new C0869wu(this.f3995b, c50Var, this.f4006m, this.f3998e, this.f4000g, 0);
            InterfaceC0128cv interfaceC0128cv = this.f4007n;
            c0869wu.f5030h = interfaceC0128cv;
            AbstractC0758tu abstractC0758tu = c0869wu.f5031i;
            if (abstractC0758tu != null) {
                abstractC0758tu.mo952e(interfaceC0128cv);
            }
            int size = c50Var.f2955f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = c50Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c0869wu.f5029g = z;
            AbstractC0758tu abstractC0758tu2 = c0869wu.f5031i;
            if (abstractC0758tu2 != null) {
                abstractC0758tu2.mo2144o(z);
            }
            c0869wu.f5032j = this.f4004k;
            this.f4004k = null;
            this.f3996c.m1718c(false);
            C0082bv c0082bv = this.f4001h;
            int width = c0082bv.f2925f;
            int iM1709g = c0082bv.m1709g();
            int i2 = this.f4012s;
            View view = this.f4005l;
            WeakHashMap weakHashMap = ja0.f2600a;
            if ((Gravity.getAbsoluteGravity(i2, t90.m2367d(view)) & 7) == 5) {
                width += this.f4005l.getWidth();
            }
            if (!c0869wu.m2600b()) {
                if (c0869wu.f5027e != null) {
                    c0869wu.m2601d(width, iM1709g, true, true);
                }
            }
            InterfaceC0128cv interfaceC0128cv2 = this.f4007n;
            if (interfaceC0128cv2 != null) {
                interfaceC0128cv2.mo830q(c50Var);
            }
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: n */
    public final void mo2143n(View view) {
        this.f4005l = view;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: o */
    public final void mo2144o(boolean z) {
        this.f3997d.f2308c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4009p = true;
        this.f3996c.m1718c(true);
        ViewTreeObserver viewTreeObserver = this.f4008o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4008o = this.f4006m.getViewTreeObserver();
            }
            this.f4008o.removeGlobalOnLayoutListener(this.f4002i);
            this.f4008o = null;
        }
        this.f4006m.removeOnAttachStateChangeListener(this.f4003j);
        PopupWindow.OnDismissListener onDismissListener = this.f4004k;
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

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: p */
    public final void mo2145p(int i) {
        this.f4012s = i;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: q */
    public final void mo2146q(int i) {
        this.f4001h.f2925f = i;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: r */
    public final void mo2147r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4004k = onDismissListener;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: s */
    public final void mo2148s(boolean z) {
        this.f4013t = z;
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: t */
    public final void mo2149t(int i) {
        this.f4001h.m1713m(i);
    }

    @Override // p000.AbstractC0758tu
    /* JADX INFO: renamed from: l */
    public final void mo2142l(MenuC0424ku menuC0424ku) {
    }
}
