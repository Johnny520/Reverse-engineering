package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
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

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0949W3 f3282i;

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0995X6 f3283j;

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

    /* JADX INFO: renamed from: s */
    public int f3292s;

    /* JADX INFO: renamed from: t */
    public boolean f3293t;

    public ViewOnKeyListenerC1029Xy(Context r5, MenuC2204lr r6, View r7, int r8, boolean r9) {
        this.f3282i = new ViewTreeObserverOnGlobalLayoutListenerC0949W3(3, this);
        this.f3283j = new ViewOnAttachStateChangeListenerC0995X6(6, this);
        this.f3292s = 0;
        this.f3275b = r5;
        this.f3276c = r6;
        this.f3278e = r9;
        this.f3277d = new C2070ir(r6, LayoutInflater.from(r5), r9, R.layout.abc_popup_menu_item_layout);
        this.f3280g = r8;
        Resources r92 = r5.getResources();
        this.f3279f = Math.max(r92.getDisplayMetrics().widthPixels / 2, r92.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3285l = r7;
        this.f3281h = new C0077Br(r5, null, r8, 0);
        r6.m4429b(this, r5);
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: a */
    public final boolean mo575a() {
        if (this.f3289p == false) goto L5;
        return false;
    L5:
        if (this.f3281h.f962z.isShowing() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr r2, boolean r3) {
        if (r2 != this.f3276c) goto L10;
        dismiss();
        InterfaceC0120Cr r0 = this.f3287n;
        if (r0 == null) goto L9;
        r0.mo193b(r2, r3);
        return;
    L9:
        return;
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: c */
    public final void mo577c() {
        if (mo575a() == false) goto L6;
        return;
    L6:
        if (this.f3289p == true) goto L34;
        View r0 = this.f3285l;
        if (r0 == null) goto L34;
        this.f3286m = r0;
        C0077Br r02 = this.f3281h;
        C0606O3 r1 = r02.f962z;
        C0606O3 r2 = r02.f962z;
        r1.setOnDismissListener(this);
        r02.f952p = this;
        r02.f961y = true;
        r2.setFocusable(true);
        View r3 = this.f3286m;
        if (this.f3288o != null) goto L12;
        boolean r4 = true;
    L13:
        ViewTreeObserver r6 = r3.getViewTreeObserver();
        this.f3288o = r6;
        if (r4 == false) goto L16;
        r6.addOnGlobalLayoutListener(this.f3282i);
    L16:
        r3.addOnAttachStateChangeListener(this.f3283j);
        r02.f951o = r3;
        r02.f948l = this.f3292s;
        boolean r32 = this.f3290q;
        Context r42 = this.f3275b;
        C2070ir r62 = this.f3277d;
        if (r32 == true) goto L19;
        this.f3291r = AbstractC2642vr.m5176m(r62, r42, this.f3279f);
        this.f3290q = true;
    L19:
        r02.m585r(this.f3291r);
        r2.setInputMethodMode(2);
        Rect r12 = this.f9155a;
        if (r12 == null) goto L22;
        Rect r33 = new Rect(r12);
    L23:
        r02.f960x = r33;
        r02.mo577c();
        C0365Ie r13 = r02.f939c;
        r13.setOnKeyListener(this);
        if (this.f3293t == false) goto L31;
        MenuC2204lr r34 = this.f3276c;
        if (r34.f7672m == null) goto L31;
        FrameLayout r43 = (FrameLayout) LayoutInflater.from(r42).inflate(R.layout.abc_popup_menu_header_item_layout, r13, false);
        TextView r7 = (TextView) r43.findViewById(android.R.id.title);
        if (r7 == null) goto L30;
        r7.setText(r34.f7672m);
    L30:
        r43.setEnabled(false);
        r13.addHeaderView(r43, null, false);
    L31:
        r02.mo584p(r62);
        r02.mo577c();
        return;
    L22:
        r33 = null;
        goto L23
    L12:
        r4 = false;
    L34:
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // p000.InterfaceC2168ky
    public final void dismiss() {
        if (mo575a() == false) goto L6;
        this.f3281h.dismiss();
        return;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: e */
    public final void mo216e(InterfaceC0120Cr r1) {
        this.f3287n = r1;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        this.f3290q = false;
        C2070ir r0 = this.f3277d;
        if (r0 == null) goto L6;
        r0.notifyDataSetChanged();
        return;
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: h */
    public final C0365Ie mo580h() {
        return this.f3281h.f939c;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez r10) {
        if (r10.hasVisibleItems() == false) goto L34;
        C2728xr r2 = new C2728xr(this.f3275b, r10, this.f3286m, this.f3278e, this.f3280g, 0);
        InterfaceC0120Cr r102 = this.f3287n;
        r2.f9322h = r102;
        AbstractC2642vr r0 = r2.f9323i;
        if (r0 == null) goto L7;
        r0.mo216e(r102);
    L7:
        int r103 = r10.f7665f.size();
        int r02 = 0;
    L9:
        if (r02 >= r103) goto L16;
        MenuItem r5 = r10.getItem(r02);
        if (r5.isVisible() == false) goto L15;
        if (r5.getIcon() == null) goto L15;
        boolean r104 = true;
    L17:
        r2.f9321g = r104;
        AbstractC2642vr r03 = r2.f9323i;
        if (r03 == null) goto L20;
        r03.mo1947o(r104);
    L20:
        r2.f9324j = this.f3284k;
        this.f3284k = null;
        this.f3276c.m4430c(false);
        C0077Br r105 = this.f3281h;
        int r04 = r105.f942f;
        int r106 = r105.m583n();
        if ((Gravity.getAbsoluteGravity(this.f3292s, this.f3285l.getLayoutDirection()) & 7) != 5) goto L24;
        r04 = r04 + this.f3285l.getWidth();
    L24:
        if (r2.m5291b() == false) goto L27;
    L30:
        InterfaceC0120Cr r107 = this.f3287n;
        if (r107 == null) goto L33;
        r107.mo194s(r10);
    L33:
        return true;
    L27:
        if (r2.f9319e == null) goto L34;
        r2.m5293d(r04, r106, true, true);
    L15:
        r02 = r02 + 1;
        goto L9
    L16:
        r104 = false;
    L34:
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        return false;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: l */
    public final void mo1945l(MenuC2204lr r1) {
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: n */
    public final void mo1946n(View r1) {
        this.f3285l = r1;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: o */
    public final void mo1947o(boolean r2) {
        this.f3277d.f7326c = r2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3289p = true;
        this.f3276c.m4430c(true);
        ViewTreeObserver r0 = this.f3288o;
        if (r0 != null) goto L5;
    L8:
        this.f3286m.removeOnAttachStateChangeListener(this.f3283j);
        PopupWindow.OnDismissListener r02 = this.f3284k;
        if (r02 == null) goto L12;
        r02.onDismiss();
        return;
    L12:
        return;
    L5:
        if (r0.isAlive() == true) goto L7;
        this.f3288o = this.f3286m.getViewTreeObserver();
    L7:
        this.f3288o.removeGlobalOnLayoutListener(this.f3282i);
        this.f3288o = null;
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

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: p */
    public final void mo1948p(int r1) {
        this.f3292s = r1;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: q */
    public final void mo1949q(int r2) {
        this.f3281h.f942f = r2;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: r */
    public final void mo1950r(PopupWindow.OnDismissListener r1) {
        this.f3284k = r1;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: s */
    public final void mo1951s(boolean r1) {
        this.f3293t = r1;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: t */
    public final void mo1952t(int r2) {
        this.f3281h.m581j(r2);
    }
}
