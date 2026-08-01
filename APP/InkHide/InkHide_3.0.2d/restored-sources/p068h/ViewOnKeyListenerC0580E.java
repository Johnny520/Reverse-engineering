package p068h;

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
import androidx.fragment.app.ViewOnAttachStateChangeListenerC0414E;
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p069i.C0631L0;
import p069i.C0717t0;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: h.E */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0580E extends AbstractC0602u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: c */
    public final Context f1942c;

    /* JADX INFO: renamed from: d */
    public final MenuC0594m f1943d;

    /* JADX INFO: renamed from: e */
    public final C0591j f1944e;

    /* JADX INFO: renamed from: f */
    public final boolean f1945f;

    /* JADX INFO: renamed from: g */
    public final int f1946g;

    /* JADX INFO: renamed from: h */
    public final int f1947h;

    /* JADX INFO: renamed from: i */
    public final C0631L0 f1948i;

    /* JADX INFO: renamed from: l */
    public C0603v f1951l;

    /* JADX INFO: renamed from: m */
    public View f1952m;

    /* JADX INFO: renamed from: n */
    public View f1953n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0606y f1954o;

    /* JADX INFO: renamed from: p */
    public ViewTreeObserver f1955p;

    /* JADX INFO: renamed from: q */
    public boolean f1956q;

    /* JADX INFO: renamed from: r */
    public boolean f1957r;

    /* JADX INFO: renamed from: s */
    public int f1958s;

    /* JADX INFO: renamed from: u */
    public boolean f1960u;

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC0585d f1949j = new ViewTreeObserverOnGlobalLayoutListenerC0585d(1, this);

    /* JADX INFO: renamed from: k */
    public final ViewOnAttachStateChangeListenerC0414E f1950k = new ViewOnAttachStateChangeListenerC0414E(2, this);

    /* JADX INFO: renamed from: t */
    public int f1959t = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnKeyListenerC0580E(int i2, Context context, View view, MenuC0594m menuC0594m, boolean z2) {
        this.f1942c = context;
        this.f1943d = menuC0594m;
        this.f1945f = z2;
        this.f1944e = new C0591j(menuC0594m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f1947h = i2;
        Resources resources = context.getResources();
        this.f1946g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1952m = view;
        this.f1948i = new C0631L0(context, null, i2);
        menuC0594m.m1183b(this, context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    /* JADX INFO: renamed from: a */
    public final boolean mo1144a() {
        return !this.f1956q && this.f1948i.f2152z.isShowing();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: b */
    public final void mo1147b(MenuC0594m menuC0594m, boolean z2) {
        if (menuC0594m != this.f1943d) {
            return;
        }
        dismiss();
        InterfaceC0606y interfaceC0606y = this.f1954o;
        if (interfaceC0606y != null) {
            interfaceC0606y.mo132b(menuC0594m, z2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: c */
    public final void mo1148c() {
        this.f1957r = false;
        C0591j c0591j = this.f1944e;
        if (c0591j != null) {
            c0591j.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    public final void dismiss() {
        if (mo1144a()) {
            this.f1948i.dismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: e */
    public final void mo1149e(InterfaceC0606y interfaceC0606y) {
        this.f1954o = interfaceC0606y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    /* JADX INFO: renamed from: f */
    public final C0717t0 mo1145f() {
        return this.f1948i.f2130d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0579D
    /* JADX INFO: renamed from: h */
    public final void mo1146h() {
        View view;
        if (mo1144a()) {
            return;
        }
        if (this.f1956q || (view = this.f1952m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f1953n = view;
        C0631L0 c0631l0 = this.f1948i;
        c0631l0.f2152z.setOnDismissListener(this);
        c0631l0.f2143q = this;
        c0631l0.f2151y = true;
        c0631l0.f2152z.setFocusable(true);
        View view2 = this.f1953n;
        boolean z2 = this.f1955p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1955p = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1949j);
        }
        view2.addOnAttachStateChangeListener(this.f1950k);
        c0631l0.f2142p = view2;
        c0631l0.f2139m = this.f1959t;
        boolean z3 = this.f1957r;
        Context context = this.f1942c;
        C0591j c0591j = this.f1944e;
        if (!z3) {
            this.f1958s = AbstractC0602u.m1202m(c0591j, context, this.f1946g);
            this.f1957r = true;
        }
        c0631l0.m1227p(this.f1958s);
        c0631l0.f2152z.setInputMethodMode(2);
        Rect rect = this.f2096b;
        c0631l0.f2150x = rect != null ? new Rect(rect) : null;
        c0631l0.mo1146h();
        C0717t0 c0717t0 = c0631l0.f2130d;
        c0717t0.setOnKeyListener(this);
        if (this.f1960u) {
            MenuC0594m menuC0594m = this.f1943d;
            if (menuC0594m.f2042m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0717t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0594m.f2042m);
                }
                frameLayout.setEnabled(false);
                c0717t0.addHeaderView(frameLayout, null, false);
            }
        }
        c0631l0.mo1225m(c0591j);
        c0631l0.mo1146h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: i */
    public final boolean mo1150i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: j */
    public final boolean mo1151j(SubMenuC0581F subMenuC0581F) {
        if (subMenuC0581F.hasVisibleItems()) {
            View view = this.f1953n;
            C0605x c0605x = new C0605x(this.f1947h, this.f1942c, view, subMenuC0581F, this.f1945f);
            InterfaceC0606y interfaceC0606y = this.f1954o;
            c0605x.f2105h = interfaceC0606y;
            AbstractC0602u abstractC0602u = c0605x.f2106i;
            if (abstractC0602u != null) {
                abstractC0602u.mo1149e(interfaceC0606y);
            }
            boolean zM1203u = AbstractC0602u.m1203u(subMenuC0581F);
            c0605x.f2104g = zM1203u;
            AbstractC0602u abstractC0602u2 = c0605x.f2106i;
            if (abstractC0602u2 != null) {
                abstractC0602u2.mo1154o(zM1203u);
            }
            c0605x.f2107j = this.f1951l;
            this.f1951l = null;
            this.f1943d.m1184c(false);
            C0631L0 c0631l0 = this.f1948i;
            int width = c0631l0.f2133g;
            int iM1221i = c0631l0.m1221i();
            int i2 = this.f1959t;
            View view2 = this.f1952m;
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            if ((Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 7) == 5) {
                width += this.f1952m.getWidth();
            }
            if (!c0605x.m1206b()) {
                if (c0605x.f2102e != null) {
                    c0605x.m1208d(width, iM1221i, true, true);
                }
            }
            InterfaceC0606y interfaceC0606y2 = this.f1954o;
            if (interfaceC0606y2 != null) {
                interfaceC0606y2.mo142m(subMenuC0581F);
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: n */
    public final void mo1153n(View view) {
        this.f1952m = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: o */
    public final void mo1154o(boolean z2) {
        this.f1944e.f2025d = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f1956q = true;
        this.f1943d.m1184c(true);
        ViewTreeObserver viewTreeObserver = this.f1955p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1955p = this.f1953n.getViewTreeObserver();
            }
            this.f1955p.removeGlobalOnLayoutListener(this.f1949j);
            this.f1955p = null;
        }
        this.f1953n.removeOnAttachStateChangeListener(this.f1950k);
        C0603v c0603v = this.f1951l;
        if (c0603v != null) {
            c0603v.onDismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: p */
    public final void mo1155p(int i2) {
        this.f1959t = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: q */
    public final void mo1156q(int i2) {
        this.f1948i.f2133g = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: r */
    public final void mo1157r(PopupWindow.OnDismissListener onDismissListener) {
        this.f1951l = (C0603v) onDismissListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: s */
    public final void mo1158s(boolean z2) {
        this.f1960u = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: t */
    public final void mo1159t(int i2) {
        this.f1948i.m1223k(i2);
    }

    @Override // p068h.AbstractC0602u
    /* JADX INFO: renamed from: l */
    public final void mo1152l(MenuC0594m menuC0594m) {
    }
}
