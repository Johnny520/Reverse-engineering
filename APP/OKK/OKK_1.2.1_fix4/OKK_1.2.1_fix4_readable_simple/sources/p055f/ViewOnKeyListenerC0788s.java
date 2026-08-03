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

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772c f2855j;

    /* JADX INFO: renamed from: k */
    public final ViewOnAttachStateChangeListenerC0043s f2856k;

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

    /* JADX INFO: renamed from: t */
    public int f2865t;

    /* JADX INFO: renamed from: u */
    public boolean f2866u;

    public ViewOnKeyListenerC0788s(int r4, int r5, Context r6, View r7, MenuC0779j r8, boolean r9) {
        this.f2855j = new ViewTreeObserverOnGlobalLayoutListenerC0772c(this, 1);
        this.f2856k = new ViewOnAttachStateChangeListenerC0043s(2, this);
        this.f2865t = 0;
        this.f2847b = r6;
        this.f2848c = r8;
        this.f2850e = r9;
        this.f2849d = new C0776g(r8, LayoutInflater.from(r6), r9, C1031R.layout.abc_popup_menu_item_layout);
        this.f2852g = r4;
        this.f2853h = r5;
        Resources r92 = r6.getResources();
        this.f2851f = Math.max(r92.getDisplayMetrics().widthPixels / 2, r92.getDimensionPixelSize(C1031R.dimen.abc_config_prefDialogWidth));
        this.f2858m = r7;
        this.f2854i = new C0929t0(r6, r4, r5);
        r8.m1996b(this, r6);
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: a */
    public final void mo1976a(MenuC0779j r2, boolean r3) {
        if (r2 == this.f2848c) goto L5;
        return;
    L5:
        dismiss();
        InterfaceC0784o r02 = this.f2860o;
        if (r02 == null) goto L9;
        r02.mo339a(r2, r3);
        return;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: b */
    public final void mo1977b() {
        this.f2863r = false;
        C0776g r02 = this.f2849d;
        if (r02 == null) goto L6;
        r02.notifyDataSetChanged();
        return;
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: d */
    public final boolean mo1978d() {
        if (this.f2862q == false) goto L5;
    L7:
        return false;
    L5:
        if (this.f2854i.f3272v.isShowing() == false) goto L7;
        return true;
    }

    @Override // p055f.InterfaceC0787r
    public final void dismiss() {
        if (mo1978d() == false) goto L6;
        this.f2854i.dismiss();
        return;
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: e */
    public final ListView mo1979e() {
        return this.f2854i.f3253c;
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: f */
    public final void mo1980f() {
        if (mo1978d() == false) goto L6;
        return;
    L6:
        if (this.f2862q == true) goto L38;
        View r02 = this.f2858m;
        if (r02 == null) goto L38;
        this.f2859n = r02;
        C0929t0 r03 = this.f2854i;
        r03.f3272v.setOnDismissListener(this);
        r03.f3263m = this;
        r03.f3271u = true;
        r03.f3272v.setFocusable(true);
        View r2 = this.f2859n;
        if (this.f2861p != null) goto L12;
        boolean r3 = true;
    L13:
        ViewTreeObserver r5 = r2.getViewTreeObserver();
        this.f2861p = r5;
        if (r3 == false) goto L16;
        r5.addOnGlobalLayoutListener(this.f2855j);
    L16:
        r2.addOnAttachStateChangeListener(this.f2856k);
        r03.f3262l = r2;
        r03.f3260j = this.f2865t;
        boolean r22 = this.f2863r;
        Context r32 = this.f2847b;
        C0776g r52 = this.f2849d;
        if (r22 == true) goto L19;
        this.f2864s = AbstractC0781l.m2021m(r52, r32, this.f2851f);
        this.f2863r = true;
    L19:
        int r1 = this.f2864s;
        Drawable r23 = r03.f3272v.getBackground();
        if (r23 == null) goto L22;
        Rect r6 = r03.f3269s;
        r23.getPadding(r6);
        r03.f3254d = (r6.left + r6.right) + r1;
    L23:
        r03.f3272v.setInputMethodMode(2);
        Rect r12 = this.f2833a;
        if (r12 == null) goto L26;
        Rect r62 = new Rect(r12);
    L27:
        r03.f3270t = r62;
        r03.mo1980f();
        C0927s0 r13 = r03.f3253c;
        r13.setOnKeyListener(this);
        if (this.f2866u == false) goto L35;
        MenuC0779j r63 = this.f2848c;
        if (r63.f2796l == null) goto L35;
        FrameLayout r33 = (FrameLayout) LayoutInflater.from(r32).inflate(C1031R.layout.abc_popup_menu_header_item_layout, r13, false);
        TextView r7 = (TextView) r33.findViewById(R.id.title);
        if (r7 == null) goto L34;
        r7.setText(r63.f2796l);
    L34:
        r33.setEnabled(false);
        r13.addHeaderView(r33, null, false);
    L35:
        r03.m2249a(r52);
        r03.mo1980f();
        return;
    L26:
        r62 = null;
        goto L27
    L22:
        r03.f3254d = r1;
        goto L23
    L12:
        r3 = false;
    L38:
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: g */
    public final boolean mo1981g() {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: j */
    public final void mo1982j(InterfaceC0784o r1) {
        this.f2860o = r1;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: k */
    public final boolean mo1983k(SubMenuC0789t r10) {
        if (r10.hasVisibleItems() == false) goto L28;
        View r6 = this.f2859n;
        C0783n r02 = new C0783n(this.f2852g, this.f2853h, this.f2847b, r6, r10, this.f2850e);
        InterfaceC0784o r2 = this.f2860o;
        r02.f2843i = r2;
        AbstractC0781l r3 = r02.f2844j;
        if (r3 == null) goto L7;
        r3.mo1982j(r2);
    L7:
        boolean r22 = AbstractC0781l.m2022u(r10);
        r02.f2842h = r22;
        AbstractC0781l r32 = r02.f2844j;
        if (r32 == null) goto L10;
        r32.mo1986o(r22);
    L10:
        r02.f2845k = this.f2857l;
        this.f2857l = null;
        this.f2848c.m1997c(false);
        C0929t0 r23 = this.f2854i;
        int r33 = r23.f3255e;
        if (r23.f3257g == true) goto L13;
        int r24 = 0;
    L15:
        if ((Gravity.getAbsoluteGravity(this.f2865t, this.f2858m.getLayoutDirection()) & 7) != 5) goto L18;
        r33 = r33 + this.f2858m.getWidth();
    L18:
        if (r02.m2027b() == false) goto L21;
    L24:
        InterfaceC0784o r03 = this.f2860o;
        if (r03 == null) goto L27;
        r03.mo345k(r10);
    L27:
        return true;
    L21:
        if (r02.f2840f == null) goto L28;
        r02.m2029d(r33, r24, true, true);
        goto L24
    L13:
        r24 = r23.f3256f;
    L28:
        return false;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: l */
    public final void mo1984l(MenuC0779j r1) {
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: n */
    public final void mo1985n(View r1) {
        this.f2858m = r1;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: o */
    public final void mo1986o(boolean r2) {
        this.f2849d.f2780c = r2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2862q = true;
        this.f2848c.m1997c(true);
        ViewTreeObserver r02 = this.f2861p;
        if (r02 != null) goto L5;
    L8:
        this.f2859n.removeOnAttachStateChangeListener(this.f2856k);
        PopupWindow.OnDismissListener r03 = this.f2857l;
        if (r03 == null) goto L12;
        r03.onDismiss();
        return;
    L12:
        return;
    L5:
        if (r02.isAlive() == true) goto L7;
        this.f2861p = this.f2859n.getViewTreeObserver();
    L7:
        this.f2861p.removeGlobalOnLayoutListener(this.f2855j);
        this.f2861p = null;
        goto L8
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View r1, int r2, KeyEvent r3) {
        if (r3.getAction() == 1) goto L5;
        return false;
    L5:
        if (r2 != 82) goto L10;
        dismiss();
        return true;
    L10:
        return false;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: p */
    public final void mo1987p(int r1) {
        this.f2865t = r1;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: q */
    public final void mo1988q(int r2) {
        this.f2854i.f3255e = r2;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: r */
    public final void mo1989r(PopupWindow.OnDismissListener r1) {
        this.f2857l = r1;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: s */
    public final void mo1990s(boolean r1) {
        this.f2866u = r1;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: t */
    public final void mo1991t(int r2) {
        C0929t0 r02 = this.f2854i;
        r02.f3256f = r2;
        r02.f3257g = true;
    }
}
