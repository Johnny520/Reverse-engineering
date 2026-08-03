package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1125a7 extends AbstractC2642vr implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b */
    public final Context f3542b;

    /* JADX INFO: renamed from: c */
    public final int f3543c;

    /* JADX INFO: renamed from: d */
    public final int f3544d;

    /* JADX INFO: renamed from: e */
    public final boolean f3545e;

    /* JADX INFO: renamed from: f */
    public final Handler f3546f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f3547g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f3548h;

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0949W3 f3549i;

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0995X6 f3550j;

    /* JADX INFO: renamed from: k */
    public final C0132D2 f3551k;

    /* JADX INFO: renamed from: l */
    public int f3552l;

    /* JADX INFO: renamed from: m */
    public int f3553m;

    /* JADX INFO: renamed from: n */
    public View f3554n;

    /* JADX INFO: renamed from: o */
    public View f3555o;

    /* JADX INFO: renamed from: p */
    public int f3556p;

    /* JADX INFO: renamed from: q */
    public boolean f3557q;

    /* JADX INFO: renamed from: r */
    public boolean f3558r;

    /* JADX INFO: renamed from: s */
    public int f3559s;

    /* JADX INFO: renamed from: t */
    public int f3560t;

    /* JADX INFO: renamed from: u */
    public boolean f3561u;

    /* JADX INFO: renamed from: v */
    public boolean f3562v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0120Cr f3563w;

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver f3564x;

    /* JADX INFO: renamed from: y */
    public PopupWindow.OnDismissListener f3565y;

    /* JADX INFO: renamed from: z */
    public boolean f3566z;

    public ViewOnKeyListenerC1125a7(Context r3, View r4, int r5, boolean r6) {
        this.f3547g = new ArrayList();
        this.f3548h = new ArrayList();
        this.f3549i = new ViewTreeObserverOnGlobalLayoutListenerC0949W3(2, this);
        this.f3550j = new ViewOnAttachStateChangeListenerC0995X6(0, this);
        this.f3551k = new C0132D2(7, this);
        int r0 = 0;
        this.f3552l = 0;
        this.f3553m = 0;
        this.f3542b = r3;
        this.f3554n = r4;
        this.f3544d = r5;
        this.f3545e = r6;
        this.f3561u = false;
        if (r4.getLayoutDirection() == 1) goto L6;
        r0 = 1;
    L6:
        this.f3556p = r0;
        Resources r32 = r3.getResources();
        this.f3543c = Math.max(r32.getDisplayMetrics().widthPixels / 2, r32.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3546f = new Handler();
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: a */
    public final boolean mo575a() {
        ArrayList r0 = this.f3548h;
        if (r0.size() > 0) goto L5;
    L8:
        return false;
    L5:
        if (((C1081Z6) r0.get(0)).f3447a.f962z.isShowing() == false) goto L8;
        return true;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr r7, boolean r8) {
        ArrayList r0 = this.f3548h;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r7 == ((C1081Z6) r0.get(r3)).f3448b) goto L9;
        r3 = r3 + 1;
    L9:
        if (r3 < 0) goto L43;
        int r12 = r3 + 1;
        if (r12 >= r0.size()) goto L14;
        ((C1081Z6) r0.get(r12)).f3448b.m4430c(false);
    L14:
        C1081Z6 r13 = (C1081Z6) r0.remove(r3);
        MenuC2204lr r32 = r13.f3448b;
        C0077Br r14 = r13.f3447a;
        C0606O3 r4 = r14.f962z;
        r32.m4437r(this);
        if (this.f3566z == false) goto L17;
        AbstractC2771yr.m5342b(r4, null);
        r4.setAnimationStyle(0);
    L17:
        r14.dismiss();
        int r15 = r0.size();
        if (r15 <= 0) goto L21;
        this.f3556p = ((C1081Z6) r0.get(r15 - 1)).f3449c;
    L25:
        if (r15 != 0) goto L37;
        dismiss();
        InterfaceC0120Cr r82 = this.f3563w;
        if (r82 == null) goto L29;
        r82.mo193b(r7, true);
    L29:
        ViewTreeObserver r72 = this.f3564x;
        if (r72 != null) goto L32;
    L35:
        this.f3555o.removeOnAttachStateChangeListener(this.f3550j);
        this.f3565y.onDismiss();
        return;
    L32:
        if (r72.isAlive() == false) goto L34;
        this.f3564x.removeGlobalOnLayoutListener(this.f3549i);
    L34:
        this.f3564x = null;
        goto L35
    L37:
        if (r8 == false) goto L42;
        ((C1081Z6) r0.get(0)).f3448b.m4430c(false);
        return;
    L42:
        return;
    L21:
        if (this.f3554n.getLayoutDirection() != 1) goto L23;
        int r42 = 0;
    L24:
        this.f3556p = r42;
        goto L25
    L23:
        r42 = 1;
        goto L24
    L43:
        return;
    L8:
        r3 = -1;
        goto L9
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: c */
    public final void mo577c() {
        if (mo575a() == true) goto L22;
        ArrayList r0 = this.f3547g;
        Iterator r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        m2049u((MenuC2204lr) r1.next());
        goto L7
    L9:
        r0.clear();
        View r02 = this.f3554n;
        this.f3555o = r02;
        if (r02 != null) goto L12;
        return;
    L12:
        if (this.f3564x != null) goto L14;
        boolean r12 = true;
    L15:
        ViewTreeObserver r03 = r02.getViewTreeObserver();
        this.f3564x = r03;
        if (r12 == false) goto L18;
        r03.addOnGlobalLayoutListener(this.f3549i);
    L18:
        this.f3555o.addOnAttachStateChangeListener(this.f3550j);
        return;
    L14:
        r12 = false;
        goto L15
    }

    @Override // p000.InterfaceC2168ky
    public final void dismiss() {
        ArrayList r0 = this.f3548h;
        int r1 = r0.size();
        if (r1 <= 0) goto L10;
        C1081Z6[] r02 = (C1081Z6[]) r0.toArray(new C1081Z6[r1]);
        int r12 = r1 - 1;
    L5:
        if (r12 < 0) goto L14;
        C1081Z6 r2 = r02[r12];
        if (r2.f3447a.f962z.isShowing() == false) goto L9;
        r2.f3447a.dismiss();
    L9:
        r12 = r12 - 1;
        goto L5
    L14:
        return;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: e */
    public final void mo216e(InterfaceC0120Cr r1) {
        this.f3563w = r1;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        Iterator r0 = this.f3548h.iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        ListAdapter r1 = ((C1081Z6) r0.next()).f3447a.f939c.getAdapter();
        if ((r1 instanceof HeaderViewListAdapter) == false) goto L9;
        r1 = ((HeaderViewListAdapter) r1).getWrappedAdapter();
    L9:
        ((C2070ir) r1).notifyDataSetChanged();
        goto L4
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: h */
    public final C0365Ie mo580h() {
        ArrayList r0 = this.f3548h;
        if (r0.isEmpty() == false) goto L7;
        return null;
    L7:
        return ((C1081Z6) r0.get(r0.size() - 1)).f3447a.f939c;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez r5) {
        Iterator r0 = this.f3548h.iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        C1081Z6 r1 = (C1081Z6) r0.next();
        if (r5 != r1.f3448b) goto L4;
        r1.f3447a.f939c.requestFocus();
        return true;
    L10:
        if (r5.hasVisibleItems() == false) goto L15;
        mo1945l(r5);
        InterfaceC0120Cr r02 = this.f3563w;
        if (r02 == null) goto L14;
        r02.mo194s(r5);
    L14:
        return true;
    L15:
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        return false;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: l */
    public final void mo1945l(MenuC2204lr r2) {
        r2.m4429b(this, this.f3542b);
        if (mo575a() == false) goto L6;
        m2049u(r2);
        return;
    L6:
        this.f3547g.add(r2);
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: n */
    public final void mo1946n(View r2) {
        if (this.f3554n == r2) goto L6;
        this.f3554n = r2;
        this.f3553m = Gravity.getAbsoluteGravity(this.f3552l, r2.getLayoutDirection());
        return;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: o */
    public final void mo1947o(boolean r1) {
        this.f3561u = r1;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ArrayList r0 = this.f3548h;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        C1081Z6 r4 = (C1081Z6) r0.get(r3);
        if (r4.f3447a.f962z.isShowing() == false) goto L9;
        r3 = r3 + 1;
    L9:
        if (r4 == null) goto L14;
        r4.f3448b.m4430c(false);
        return;
    L14:
        return;
    L8:
        r4 = null;
        goto L9
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
    public final void mo1948p(int r2) {
        if (this.f3552l == r2) goto L6;
        this.f3552l = r2;
        this.f3553m = Gravity.getAbsoluteGravity(r2, this.f3554n.getLayoutDirection());
        return;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: q */
    public final void mo1949q(int r2) {
        this.f3557q = true;
        this.f3559s = r2;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: r */
    public final void mo1950r(PopupWindow.OnDismissListener r1) {
        this.f3565y = r1;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: s */
    public final void mo1951s(boolean r1) {
        this.f3562v = r1;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: t */
    public final void mo1952t(int r2) {
        this.f3558r = true;
        this.f3560t = r2;
    }

    /* JADX INFO: renamed from: u */
    public final void m2049u(MenuC2204lr r18) {
        Context r2 = this.f3542b;
        LayoutInflater r3 = LayoutInflater.from(r2);
        C2070ir r4 = new C2070ir(r18, r3, this.f3545e, R.layout.abc_cascading_menu_item_layout);
        if (mo575a() == true) goto L8;
        if (this.f3561u == false) goto L8;
        r4.f7326c = true;
    L19:
        int r5 = AbstractC2642vr.m5176m(r4, r2, this.f3543c);
        C0077Br r8 = new C0077Br(r2, null, this.f3544d, 0);
        r8.f186C = this.f3551k;
        r8.f952p = this;
        r8.f962z.setOnDismissListener(this);
        r8.f951o = this.f3554n;
        r8.f948l = this.f3553m;
        r8.f961y = true;
        r8.f962z.setFocusable(true);
        r8.f962z.setInputMethodMode(2);
        r8.mo584p(r4);
        r8.m585r(r5);
        r8.f948l = this.f3553m;
        ArrayList r22 = this.f3548h;
        if (r22.size() <= 0) goto L52;
        C1081Z6 r42 = (C1081Z6) r22.get(r22.size() - 1);
        MenuC2204lr r11 = r42.f3448b;
        int r12 = r11.f7665f.size();
        int r13 = 0;
    L22:
        if (r13 >= r12) goto L29;
        MenuItem r14 = r11.getItem(r13);
        if (r14.hasSubMenu() == false) goto L28;
        if (r18 != r14.getSubMenu()) goto L28;
    L30:
        if (r14 != null) goto L32;
        int r16 = 1;
        View r7 = null;
    L54:
        if (r7 == null) goto L84;
        int r9 = Build.VERSION.SDK_INT;
        C0606O3 r112 = r8.f962z;
        if (r9 > 28) goto L61;
        Method r92 = C0077Br.f185D;
        if (r92 != null) goto L103;
    L62:
        AbstractC2771yr.m5341a(r8.f962z, null);
        C0365Ie r93 = ((C1081Z6) r22.get(r22.size() - 1)).f3447a.f939c;
        int[] r10 = new int[2];
        r93.getLocationOnScreen(r10);
        Rect r113 = new Rect();
        this.f3555o.getWindowVisibleDisplayFrame(r113);
        if (this.f3556p != r16) goto L69;
        if (((r93.getWidth() + r10[0]) + r5) <= r113.right) goto L67;
    L66:
        int r132 = 0;
        int r94 = 1;
    L71:
        if (r132 != r94) goto L73;
        boolean r95 = true;
    L74:
        this.f3556p = r132;
        r8.f951o = r7;
        if ((this.f3553m & 5) != 5) goto L79;
        if (r95 == true) goto L82;
        r5 = 0 - r7.getWidth();
    L82:
        r8.f942f = r5;
        r8.f947k = true;
        r8.f946j = true;
        r8.m581j(0);
    L94:
        r22.add(new C1081Z6(r8, r18, this.f3556p));
        r8.mo577c();
        C0365Ie r23 = r8.f939c;
        r23.setOnKeyListener(this);
        if (r42 == null) goto L97;
        return;
    L97:
        if (this.f3562v == true) goto L99;
        return;
    L99:
        if (r18.f7672m == null) goto L117;
        FrameLayout r32 = (FrameLayout) r3.inflate(R.layout.abc_popup_menu_header_item_layout, r23, false);
        TextView r43 = (TextView) r32.findViewById(android.R.id.title);
        r32.setEnabled(false);
        r43.setText(r18.f7672m);
        r23.addHeaderView(r32, null, false);
        r8.mo577c();
        return;
    L117:
        return;
    L79:
        if (r95 == false) goto L81;
        r5 = r7.getWidth();
        goto L82
    L81:
        r5 = 0 - r5;
        goto L82
    L73:
        r95 = false;
    L67:
        r94 = 1;
        r132 = 1;
        goto L71
    L69:
        if ((r10[0] - r5) >= 0) goto L66;
    L103:
        r92.invoke(r112, new Object[]{Boolean.FALSE});     // Catch: Exception -> L102
        goto L62
    L61:
        AbstractC2814zr.m5448a(r112, false);
        goto L62
    L84:
        if (this.f3557q == false) goto L87;
        r8.f942f = this.f3559s;
    L87:
        if (this.f3558r == false) goto L89;
        r8.m581j(this.f3560t);
    L89:
        Rect r52 = this.f9155a;
        if (r52 == null) goto L92;
        Rect r102 = new Rect(r52);
    L93:
        r8.f960x = r102;
        goto L94
    L92:
        r102 = null;
        goto L93
    L32:
        C0365Ie r114 = r42.f3447a.f939c;
        ListAdapter r122 = r114.getAdapter();
        if ((r122 instanceof HeaderViewListAdapter) == false) goto L35;
        HeaderViewListAdapter r123 = (HeaderViewListAdapter) r122;
        int r133 = r123.getHeadersCount();
        C2070ir r124 = (C2070ir) r123.getWrappedAdapter();
    L36:
        int r15 = r124.getCount();
        r16 = 1;
        int r72 = 0;
    L38:
        if (r72 >= r15) goto L43;
        if (r14 == r124.m4240b(r72)) goto L44;
        r72 = r72 + 1;
    L44:
        if (r72 == (-1)) goto L53;
        int r73 = (r72 + r133) - r114.getFirstVisiblePosition();
        if (r73 < 0) goto L53;
        if (r73 >= r114.getChildCount()) goto L53;
        r7 = r114.getChildAt(r73);
    L53:
        r7 = null;
        goto L54
    L43:
        r72 = -1;
        goto L44
    L35:
        r124 = (C2070ir) r122;
        r133 = 0;
    L28:
        r13 = r13 + 1;
        goto L22
    L29:
        r14 = null;
        goto L30
    L52:
        r16 = 1;
        r42 = null;
    L8:
        if (mo575a() == false) goto L19;
        int r53 = r18.f7665f.size();
        int r82 = 0;
    L10:
        if (r82 >= r53) goto L17;
        MenuItem r96 = r18.getItem(r82);
        if (r96.isVisible() == false) goto L16;
        if (r96.getIcon() == null) goto L16;
        boolean r54 = true;
    L18:
        r4.f7326c = r54;
    L16:
        r82 = r82 + 1;
        goto L10
    L17:
        r54 = false;
        goto L18
    }
}
