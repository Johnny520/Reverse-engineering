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
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Xy */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1029Xy extends AbstractC2642vr implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b */
    public final Context f3275b;

    /* JADX INFO: renamed from: c */
    public final MenuC2204lr f3276c;

    /* JADX INFO: renamed from: d */
    public final C2070ir f3277d;

    /* JADX INFO: renamed from: e */
    public final boolean f3278e;

    /* JADX INFO: renamed from: f */
    public final int f3279f;

    /* JADX INFO: renamed from: g */
    public final int f3280g;

    /* JADX INFO: renamed from: h */
    public final C0077Br f3281h;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f3284k;

    /* JADX INFO: renamed from: l */
    public View f3285l;

    /* JADX INFO: renamed from: m */
    public View f3286m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0120Cr f3287n;

    /* JADX INFO: renamed from: o */
    public ViewTreeObserver f3288o;

    /* JADX INFO: renamed from: p */
    public boolean f3289p;

    /* JADX INFO: renamed from: q */
    public boolean f3290q;

    /* JADX INFO: renamed from: r */
    public int f3291r;

    /* JADX INFO: renamed from: t */
    public boolean f3293t;

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0949W3 f3282i = new ViewTreeObserverOnGlobalLayoutListenerC0949W3(3, this);

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0995X6 f3283j = new ViewOnAttachStateChangeListenerC0995X6(6, this);

    /* JADX INFO: renamed from: s */
    public int f3292s = 0;

    public ViewOnKeyListenerC1029Xy(Context context, MenuC2204lr menuC2204lr, View view, int i, boolean z) {
        this.f3275b = context;
        this.f3276c = menuC2204lr;
        this.f3278e = z;
        this.f3277d = new C2070ir(menuC2204lr, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f3280g = i;
        Resources resources = context.getResources();
        this.f3279f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3285l = view;
        this.f3281h = new C0077Br(context, null, i, 0);
        menuC2204lr.m4429b(this, context);
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: a */
    public final boolean mo575a() {
        return !this.f3289p && this.f3281h.f962z.isShowing();
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr menuC2204lr, boolean z) {
        if (menuC2204lr != this.f3276c) {
            return;
        }
        dismiss();
        InterfaceC0120Cr interfaceC0120Cr = this.f3287n;
        if (interfaceC0120Cr != null) {
            interfaceC0120Cr.mo193b(menuC2204lr, z);
        }
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: c */
    public final void mo577c() {
        View view;
        if (mo575a()) {
            return;
        }
        if (this.f3289p || (view = this.f3285l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3286m = view;
        C0077Br c0077Br = this.f3281h;
        C0606O3 c0606o3 = c0077Br.f962z;
        C0606O3 c0606o32 = c0077Br.f962z;
        c0606o3.setOnDismissListener(this);
        c0077Br.f952p = this;
        c0077Br.f961y = true;
        c0606o32.setFocusable(true);
        View view2 = this.f3286m;
        boolean z = this.f3288o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3288o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3282i);
        }
        view2.addOnAttachStateChangeListener(this.f3283j);
        c0077Br.f951o = view2;
        c0077Br.f948l = this.f3292s;
        boolean z2 = this.f3290q;
        Context context = this.f3275b;
        C2070ir c2070ir = this.f3277d;
        if (!z2) {
            this.f3291r = AbstractC2642vr.m5176m(c2070ir, context, this.f3279f);
            this.f3290q = true;
        }
        c0077Br.m585r(this.f3291r);
        c0606o32.setInputMethodMode(2);
        Rect rect = this.f9155a;
        c0077Br.f960x = rect != null ? new Rect(rect) : null;
        c0077Br.mo577c();
        C0365Ie c0365Ie = c0077Br.f939c;
        c0365Ie.setOnKeyListener(this);
        if (this.f3293t) {
            MenuC2204lr menuC2204lr = this.f3276c;
            if (menuC2204lr.f7672m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0365Ie, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC2204lr.f7672m);
                }
                frameLayout.setEnabled(false);
                c0365Ie.addHeaderView(frameLayout, null, false);
            }
        }
        c0077Br.mo584p(c2070ir);
        c0077Br.mo577c();
    }

    @Override // p000.InterfaceC2168ky
    public final void dismiss() {
        if (mo575a()) {
            this.f3281h.dismiss();
        }
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: e */
    public final void mo216e(InterfaceC0120Cr interfaceC0120Cr) {
        this.f3287n = interfaceC0120Cr;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        this.f3290q = false;
        C2070ir c2070ir = this.f3277d;
        if (c2070ir != null) {
            c2070ir.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: h */
    public final C0365Ie mo580h() {
        return this.f3281h.f939c;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez subMenuC0214Ez) {
        boolean z;
        if (subMenuC0214Ez.hasVisibleItems()) {
            C2728xr c2728xr = new C2728xr(this.f3275b, subMenuC0214Ez, this.f3286m, this.f3278e, this.f3280g, 0);
            InterfaceC0120Cr interfaceC0120Cr = this.f3287n;
            c2728xr.f9322h = interfaceC0120Cr;
            AbstractC2642vr abstractC2642vr = c2728xr.f9323i;
            if (abstractC2642vr != null) {
                abstractC2642vr.mo216e(interfaceC0120Cr);
            }
            int size = subMenuC0214Ez.f7665f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC0214Ez.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c2728xr.f9321g = z;
            AbstractC2642vr abstractC2642vr2 = c2728xr.f9323i;
            if (abstractC2642vr2 != null) {
                abstractC2642vr2.mo1947o(z);
            }
            c2728xr.f9324j = this.f3284k;
            this.f3284k = null;
            this.f3276c.m4430c(false);
            C0077Br c0077Br = this.f3281h;
            int width = c0077Br.f942f;
            int iM583n = c0077Br.m583n();
            if ((Gravity.getAbsoluteGravity(this.f3292s, this.f3285l.getLayoutDirection()) & 7) == 5) {
                width += this.f3285l.getWidth();
            }
            if (!c2728xr.m5291b()) {
                if (c2728xr.f9319e != null) {
                    c2728xr.m5293d(width, iM583n, true, true);
                }
            }
            InterfaceC0120Cr interfaceC0120Cr2 = this.f3287n;
            if (interfaceC0120Cr2 != null) {
                interfaceC0120Cr2.mo194s(subMenuC0214Ez);
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        return false;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: l */
    public final void mo1945l(MenuC2204lr menuC2204lr) {
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: n */
    public final void mo1946n(View view) {
        this.f3285l = view;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: o */
    public final void mo1947o(boolean z) {
        this.f3277d.f7326c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3289p = true;
        this.f3276c.m4430c(true);
        ViewTreeObserver viewTreeObserver = this.f3288o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3288o = this.f3286m.getViewTreeObserver();
            }
            this.f3288o.removeGlobalOnLayoutListener(this.f3282i);
            this.f3288o = null;
        }
        this.f3286m.removeOnAttachStateChangeListener(this.f3283j);
        PopupWindow.OnDismissListener onDismissListener = this.f3284k;
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

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: p */
    public final void mo1948p(int i) {
        this.f3292s = i;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: q */
    public final void mo1949q(int i) {
        this.f3281h.f942f = i;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: r */
    public final void mo1950r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3284k = onDismissListener;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: s */
    public final void mo1951s(boolean z) {
        this.f3293t = z;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: t */
    public final void mo1952t(int i) {
        this.f3281h.m581j(i);
    }
}
