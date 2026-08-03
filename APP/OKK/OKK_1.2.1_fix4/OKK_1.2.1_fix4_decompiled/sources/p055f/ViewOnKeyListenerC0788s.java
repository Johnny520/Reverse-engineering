package p055f;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.luckypray.dexkit.C1031R;
import p001A0.ViewOnAttachStateChangeListenerC0043s;
import p057g.C0927s0;
import p057g.C0929t0;

/* JADX INFO: renamed from: f.s */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0788s extends AbstractC0781l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b */
    public final Context f2847b;

    /* JADX INFO: renamed from: c */
    public final MenuC0779j f2848c;

    /* JADX INFO: renamed from: d */
    public final C0776g f2849d;

    /* JADX INFO: renamed from: e */
    public final boolean f2850e;

    /* JADX INFO: renamed from: f */
    public final int f2851f;

    /* JADX INFO: renamed from: g */
    public final int f2852g;

    /* JADX INFO: renamed from: h */
    public final int f2853h;

    /* JADX INFO: renamed from: i */
    public final C0929t0 f2854i;

    /* JADX INFO: renamed from: l */
    public PopupWindow.OnDismissListener f2857l;

    /* JADX INFO: renamed from: m */
    public View f2858m;

    /* JADX INFO: renamed from: n */
    public View f2859n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0784o f2860o;

    /* JADX INFO: renamed from: p */
    public ViewTreeObserver f2861p;

    /* JADX INFO: renamed from: q */
    public boolean f2862q;

    /* JADX INFO: renamed from: r */
    public boolean f2863r;

    /* JADX INFO: renamed from: s */
    public int f2864s;

    /* JADX INFO: renamed from: u */
    public boolean f2866u;

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772c f2855j = new ViewTreeObserverOnGlobalLayoutListenerC0772c(this, 1);

    /* JADX INFO: renamed from: k */
    public final ViewOnAttachStateChangeListenerC0043s f2856k = new ViewOnAttachStateChangeListenerC0043s(2, this);

    /* JADX INFO: renamed from: t */
    public int f2865t = 0;

    public ViewOnKeyListenerC0788s(int i2, int i3, Context context, View view, MenuC0779j menuC0779j, boolean z2) {
        this.f2847b = context;
        this.f2848c = menuC0779j;
        this.f2850e = z2;
        this.f2849d = new C0776g(menuC0779j, LayoutInflater.from(context), z2, C1031R.layout.abc_popup_menu_item_layout);
        this.f2852g = i2;
        this.f2853h = i3;
        Resources resources = context.getResources();
        this.f2851f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1031R.dimen.abc_config_prefDialogWidth));
        this.f2858m = view;
        this.f2854i = new C0929t0(context, i2, i3);
        menuC0779j.m1996b(this, context);
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: a */
    public final void mo1976a(MenuC0779j menuC0779j, boolean z2) {
        if (menuC0779j != this.f2848c) {
            return;
        }
        dismiss();
        InterfaceC0784o interfaceC0784o = this.f2860o;
        if (interfaceC0784o != null) {
            interfaceC0784o.mo339a(menuC0779j, z2);
        }
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: b */
    public final void mo1977b() {
        this.f2863r = false;
        C0776g c0776g = this.f2849d;
        if (c0776g != null) {
            c0776g.notifyDataSetChanged();
        }
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: d */
    public final boolean mo1978d() {
        return !this.f2862q && this.f2854i.f3272v.isShowing();
    }

    @Override // p055f.InterfaceC0787r
    public final void dismiss() {
        if (mo1978d()) {
            this.f2854i.dismiss();
        }
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: e */
    public final ListView mo1979e() {
        return this.f2854i.f3253c;
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: f */
    public final void mo1980f() {
        View view;
        if (mo1978d()) {
            return;
        }
        if (this.f2862q || (view = this.f2858m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2859n = view;
        C0929t0 c0929t0 = this.f2854i;
        c0929t0.f3272v.setOnDismissListener(this);
        c0929t0.f3263m = this;
        c0929t0.f3271u = true;
        c0929t0.f3272v.setFocusable(true);
        View view2 = this.f2859n;
        boolean z2 = this.f2861p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2861p = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2855j);
        }
        view2.addOnAttachStateChangeListener(this.f2856k);
        c0929t0.f3262l = view2;
        c0929t0.f3260j = this.f2865t;
        boolean z3 = this.f2863r;
        Context context = this.f2847b;
        C0776g c0776g = this.f2849d;
        if (!z3) {
            this.f2864s = AbstractC0781l.m2021m(c0776g, context, this.f2851f);
            this.f2863r = true;
        }
        int i2 = this.f2864s;
        Drawable background = c0929t0.f3272v.getBackground();
        if (background != null) {
            Rect rect = c0929t0.f3269s;
            background.getPadding(rect);
            c0929t0.f3254d = rect.left + rect.right + i2;
        } else {
            c0929t0.f3254d = i2;
        }
        c0929t0.f3272v.setInputMethodMode(2);
        Rect rect2 = this.f2833a;
        c0929t0.f3270t = rect2 != null ? new Rect(rect2) : null;
        c0929t0.mo1980f();
        C0927s0 c0927s0 = c0929t0.f3253c;
        c0927s0.setOnKeyListener(this);
        if (this.f2866u) {
            MenuC0779j menuC0779j = this.f2848c;
            if (menuC0779j.f2796l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(C1031R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0927s0, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(menuC0779j.f2796l);
                }
                frameLayout.setEnabled(false);
                c0927s0.addHeaderView(frameLayout, null, false);
            }
        }
        c0929t0.m2249a(c0776g);
        c0929t0.mo1980f();
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: g */
    public final boolean mo1981g() {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: j */
    public final void mo1982j(InterfaceC0784o interfaceC0784o) {
        this.f2860o = interfaceC0784o;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: k */
    public final boolean mo1983k(SubMenuC0789t subMenuC0789t) {
        if (subMenuC0789t.hasVisibleItems()) {
            C0783n c0783n = new C0783n(this.f2852g, this.f2853h, this.f2847b, this.f2859n, subMenuC0789t, this.f2850e);
            InterfaceC0784o interfaceC0784o = this.f2860o;
            c0783n.f2843i = interfaceC0784o;
            AbstractC0781l abstractC0781l = c0783n.f2844j;
            if (abstractC0781l != null) {
                abstractC0781l.mo1982j(interfaceC0784o);
            }
            boolean zM2022u = AbstractC0781l.m2022u(subMenuC0789t);
            c0783n.f2842h = zM2022u;
            AbstractC0781l abstractC0781l2 = c0783n.f2844j;
            if (abstractC0781l2 != null) {
                abstractC0781l2.mo1986o(zM2022u);
            }
            c0783n.f2845k = this.f2857l;
            this.f2857l = null;
            this.f2848c.m1997c(false);
            C0929t0 c0929t0 = this.f2854i;
            int width = c0929t0.f3255e;
            int i2 = !c0929t0.f3257g ? 0 : c0929t0.f3256f;
            if ((Gravity.getAbsoluteGravity(this.f2865t, this.f2858m.getLayoutDirection()) & 7) == 5) {
                width += this.f2858m.getWidth();
            }
            if (!c0783n.m2027b()) {
                if (c0783n.f2840f != null) {
                    c0783n.m2029d(width, i2, true, true);
                }
            }
            InterfaceC0784o interfaceC0784o2 = this.f2860o;
            if (interfaceC0784o2 != null) {
                interfaceC0784o2.mo345k(subMenuC0789t);
            }
            return true;
        }
        return false;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: l */
    public final void mo1984l(MenuC0779j menuC0779j) {
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: n */
    public final void mo1985n(View view) {
        this.f2858m = view;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: o */
    public final void mo1986o(boolean z2) {
        this.f2849d.f2780c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2862q = true;
        this.f2848c.m1997c(true);
        ViewTreeObserver viewTreeObserver = this.f2861p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2861p = this.f2859n.getViewTreeObserver();
            }
            this.f2861p.removeGlobalOnLayoutListener(this.f2855j);
            this.f2861p = null;
        }
        this.f2859n.removeOnAttachStateChangeListener(this.f2856k);
        PopupWindow.OnDismissListener onDismissListener = this.f2857l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: p */
    public final void mo1987p(int i2) {
        this.f2865t = i2;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: q */
    public final void mo1988q(int i2) {
        this.f2854i.f3255e = i2;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: r */
    public final void mo1989r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2857l = onDismissListener;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: s */
    public final void mo1990s(boolean z2) {
        this.f2866u = z2;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: t */
    public final void mo1991t(int i2) {
        C0929t0 c0929t0 = this.f2854i;
        c0929t0.f3256f = i2;
        c0929t0.f3257g = true;
    }
}
