package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C1001i;
import androidx.appcompat.view.menu.InterfaceC1002j;
import p000a.AbstractC0557eb;
import p000a.C0006A5;
import p000a.C0576fb;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.l */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1004l extends AbstractC0557eb implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: u */
    public static final int f3853u = C0983R.layout.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: b */
    public final Context f3854b;

    /* JADX INFO: renamed from: c */
    public final C0998f f3855c;

    /* JADX INFO: renamed from: d */
    public final C0997e f3856d;

    /* JADX INFO: renamed from: e */
    public final boolean f3857e;

    /* JADX INFO: renamed from: f */
    public final int f3858f;

    /* JADX INFO: renamed from: g */
    public final int f3859g;

    /* JADX INFO: renamed from: h */
    public final C0576fb f3860h;

    /* JADX INFO: renamed from: k */
    public C1001i.a f3863k;

    /* JADX INFO: renamed from: l */
    public View f3864l;

    /* JADX INFO: renamed from: m */
    public View f3865m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1002j.a f3866n;

    /* JADX INFO: renamed from: o */
    public ViewTreeObserver f3867o;

    /* JADX INFO: renamed from: p */
    public boolean f3868p;

    /* JADX INFO: renamed from: q */
    public boolean f3869q;

    /* JADX INFO: renamed from: r */
    public int f3870r;

    /* JADX INFO: renamed from: t */
    public boolean f3872t;

    /* JADX INFO: renamed from: i */
    public final a f3861i = new a();

    /* JADX INFO: renamed from: j */
    public final b f3862j = new b();

    /* JADX INFO: renamed from: s */
    public int f3871s = 0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.l$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewOnKeyListenerC1004l viewOnKeyListenerC1004l = ViewOnKeyListenerC1004l.this;
            if (viewOnKeyListenerC1004l.mo276b()) {
                C0576fb c0576fb = viewOnKeyListenerC1004l.f3860h;
                if (c0576fb.f352y) {
                    return;
                }
                View view = viewOnKeyListenerC1004l.f3865m;
                if (view == null || !view.isShown()) {
                    viewOnKeyListenerC1004l.dismiss();
                } else {
                    c0576fb.mo279f();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.l$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewOnKeyListenerC1004l viewOnKeyListenerC1004l = ViewOnKeyListenerC1004l.this;
            ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1004l.f3867o;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewOnKeyListenerC1004l.f3867o = view.getViewTreeObserver();
                }
                viewOnKeyListenerC1004l.f3867o.removeGlobalOnLayoutListener(viewOnKeyListenerC1004l.f3861i);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC1004l(int i, Context context, View view, C0998f c0998f, boolean z) {
        this.f3854b = context;
        this.f3855c = c0998f;
        this.f3857e = z;
        this.f3856d = new C0997e(c0998f, LayoutInflater.from(context), z, f3853u);
        this.f3859g = i;
        Resources resources = context.getResources();
        this.f3858f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0983R.dimen.abc_config_prefDialogWidth));
        this.f3864l = view;
        this.f3860h = new C0576fb(context, null, i);
        c0998f.m2317b(this, context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: a */
    public final void mo2306a(C0998f c0998f, boolean z) {
        if (c0998f != this.f3855c) {
            return;
        }
        dismiss();
        InterfaceC1002j.a aVar = this.f3866n;
        if (aVar != null) {
            aVar.mo818a(c0998f, z);
        }
    }

    @Override // p000a.InterfaceC0541de
    /* JADX INFO: renamed from: b */
    public final boolean mo276b() {
        return !this.f3868p && this.f3860h.f353z.isShowing();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: d */
    public final boolean mo2307d() {
        return false;
    }

    @Override // p000a.InterfaceC0541de
    public final void dismiss() {
        if (mo276b()) {
            this.f3860h.dismiss();
        }
    }

    @Override // p000a.InterfaceC0541de
    /* JADX INFO: renamed from: f */
    public final void mo279f() {
        View view;
        if (mo276b()) {
            return;
        }
        if (this.f3868p || (view = this.f3864l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3865m = view;
        C0576fb c0576fb = this.f3860h;
        c0576fb.f353z.setOnDismissListener(this);
        c0576fb.f343p = this;
        c0576fb.f352y = true;
        c0576fb.f353z.setFocusable(true);
        View view2 = this.f3865m;
        boolean z = this.f3867o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3867o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3861i);
        }
        view2.addOnAttachStateChangeListener(this.f3862j);
        c0576fb.f342o = view2;
        c0576fb.f339l = this.f3871s;
        boolean z2 = this.f3869q;
        Context context = this.f3854b;
        C0997e c0997e = this.f3856d;
        if (!z2) {
            this.f3870r = AbstractC0557eb.m1394m(c0997e, context, this.f3858f);
            this.f3869q = true;
        }
        c0576fb.m287r(this.f3870r);
        c0576fb.f353z.setInputMethodMode(2);
        Rect rect = this.f2101a;
        c0576fb.f351x = rect != null ? new Rect(rect) : null;
        c0576fb.mo279f();
        C0006A5 c0006a5 = c0576fb.f330c;
        c0006a5.setOnKeyListener(this);
        if (this.f3872t) {
            C0998f c0998f = this.f3855c;
            if (c0998f.f3796m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(C0983R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0006a5, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(c0998f.f3796m);
                }
                frameLayout.setEnabled(false);
                c0006a5.addHeaderView(frameLayout, null, false);
            }
        }
        c0576fb.mo285o(c0997e);
        c0576fb.mo279f();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: g */
    public final void mo2308g() {
        this.f3869q = false;
        C0997e c0997e = this.f3856d;
        if (c0997e != null) {
            c0997e.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: h */
    public final void mo2309h(InterfaceC1002j.a aVar) {
        this.f3866n = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: j */
    public final boolean mo2310j(SubMenuC1005m subMenuC1005m) {
        if (subMenuC1005m.hasVisibleItems()) {
            View view = this.f3865m;
            C1001i c1001i = new C1001i(this.f3859g, this.f3854b, view, subMenuC1005m, this.f3857e);
            InterfaceC1002j.a aVar = this.f3866n;
            c1001i.f3848h = aVar;
            AbstractC0557eb abstractC0557eb = c1001i.f3849i;
            if (abstractC0557eb != null) {
                abstractC0557eb.mo2309h(aVar);
            }
            boolean zM1395u = AbstractC0557eb.m1395u(subMenuC1005m);
            c1001i.f3847g = zM1395u;
            AbstractC0557eb abstractC0557eb2 = c1001i.f3849i;
            if (abstractC0557eb2 != null) {
                abstractC0557eb2.mo1401o(zM1395u);
            }
            c1001i.f3850j = this.f3863k;
            this.f3863k = null;
            this.f3855c.m2318c(false);
            C0576fb c0576fb = this.f3860h;
            int width = c0576fb.f333f;
            int iM280g = c0576fb.m280g();
            if ((Gravity.getAbsoluteGravity(this.f3871s, this.f3864l.getLayoutDirection()) & 7) == 5) {
                width += this.f3864l.getWidth();
            }
            if (!c1001i.m2344b()) {
                if (c1001i.f3845e != null) {
                    c1001i.m2346d(width, iM280g, true, true);
                }
            }
            InterfaceC1002j.a aVar2 = this.f3866n;
            if (aVar2 != null) {
                aVar2.mo819b(subMenuC1005m);
            }
            return true;
        }
        return false;
    }

    @Override // p000a.InterfaceC0541de
    /* JADX INFO: renamed from: k */
    public final C0006A5 mo282k() {
        return this.f3860h.f330c;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: l */
    public final void mo1399l(C0998f c0998f) {
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: n */
    public final void mo1400n(View view) {
        this.f3864l = view;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: o */
    public final void mo1401o(boolean z) {
        this.f3856d.f3779c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3868p = true;
        this.f3855c.m2318c(true);
        ViewTreeObserver viewTreeObserver = this.f3867o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3867o = this.f3865m.getViewTreeObserver();
            }
            this.f3867o.removeGlobalOnLayoutListener(this.f3861i);
            this.f3867o = null;
        }
        this.f3865m.removeOnAttachStateChangeListener(this.f3862j);
        C1001i.a aVar = this.f3863k;
        if (aVar != null) {
            aVar.onDismiss();
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

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: p */
    public final void mo1402p(int i) {
        this.f3871s = i;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: q */
    public final void mo1403q(int i) {
        this.f3860h.f333f = i;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: r */
    public final void mo1404r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3863k = (C1001i.a) onDismissListener;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: s */
    public final void mo1405s(boolean z) {
        this.f3872t = z;
    }

    @Override // p000a.AbstractC0557eb
    /* JADX INFO: renamed from: t */
    public final void mo1406t(int i) {
        this.f3860h.m284n(i);
    }
}
