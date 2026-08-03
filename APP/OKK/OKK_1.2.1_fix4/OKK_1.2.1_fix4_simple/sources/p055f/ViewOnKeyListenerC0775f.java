package p055f;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.luckypray.dexkit.C1031R;
import p001A0.ViewOnAttachStateChangeListenerC0043s;
import p006D.C0095d;
import p057g.AbstractC0923q0;
import p057g.AbstractC0925r0;
import p057g.C0927s0;
import p057g.C0929t0;
import p057g.C0938y;

/* JADX INFO: renamed from: f.f */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0775f extends AbstractC0781l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A */
    public boolean f2752A;

    /* JADX INFO: renamed from: b */
    public final Context f2753b;

    /* JADX INFO: renamed from: c */
    public final int f2754c;

    /* JADX INFO: renamed from: d */
    public final int f2755d;

    /* JADX INFO: renamed from: e */
    public final int f2756e;

    /* JADX INFO: renamed from: f */
    public final boolean f2757f;

    /* JADX INFO: renamed from: g */
    public final Handler f2758g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2759h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2760i;

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772c f2761j;

    /* JADX INFO: renamed from: k */
    public final ViewOnAttachStateChangeListenerC0043s f2762k;

    /* JADX INFO: renamed from: l */
    public final C0095d f2763l;

    /* JADX INFO: renamed from: m */
    public int f2764m;

    /* JADX INFO: renamed from: n */
    public int f2765n;

    /* JADX INFO: renamed from: o */
    public View f2766o;

    /* JADX INFO: renamed from: p */
    public View f2767p;

    /* JADX INFO: renamed from: q */
    public int f2768q;

    /* JADX INFO: renamed from: r */
    public boolean f2769r;

    /* JADX INFO: renamed from: s */
    public boolean f2770s;

    /* JADX INFO: renamed from: t */
    public int f2771t;

    /* JADX INFO: renamed from: u */
    public int f2772u;

    /* JADX INFO: renamed from: v */
    public boolean f2773v;

    /* JADX INFO: renamed from: w */
    public boolean f2774w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0784o f2775x;

    /* JADX INFO: renamed from: y */
    public ViewTreeObserver f2776y;

    /* JADX INFO: renamed from: z */
    public PopupWindow.OnDismissListener f2777z;

    public ViewOnKeyListenerC0775f(Context r3, View r4, int r5, int r6, boolean r7) {
        this.f2759h = new ArrayList();
        this.f2760i = new ArrayList();
        this.f2761j = new ViewTreeObserverOnGlobalLayoutListenerC0772c(this, 0);
        this.f2762k = new ViewOnAttachStateChangeListenerC0043s(1, this);
        this.f2763l = new C0095d(16, this);
        int r02 = 0;
        this.f2764m = 0;
        this.f2765n = 0;
        this.f2753b = r3;
        this.f2766o = r4;
        this.f2755d = r5;
        this.f2756e = r6;
        this.f2757f = r7;
        this.f2773v = false;
        if (r4.getLayoutDirection() == 1) goto L6;
        r02 = 1;
    L6:
        this.f2768q = r02;
        Resources r32 = r3.getResources();
        this.f2754c = Math.max(r32.getDisplayMetrics().widthPixels / 2, r32.getDimensionPixelSize(C1031R.dimen.abc_config_prefDialogWidth));
        this.f2758g = new Handler();
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: a */
    public final void mo1976a(MenuC0779j r8, boolean r9) {
        ArrayList r02 = this.f2760i;
        int r1 = r02.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r8 == ((C0774e) r02.get(r3)).f2750b) goto L9;
        r3 = r3 + 1;
    L9:
        if (r3 >= 0) goto L11;
        return;
    L11:
        int r12 = r3 + 1;
        if (r12 >= r02.size()) goto L14;
        ((C0774e) r02.get(r12)).f2750b.m1997c(false);
    L14:
        C0774e r13 = (C0774e) r02.remove(r3);
        CopyOnWriteArrayList r32 = r13.f2750b.f2802r;
        Iterator r4 = r32.iterator();
    L16:
        if (r4.hasNext() == false) goto L21;
        WeakReference r5 = (WeakReference) r4.next();
        InterfaceC0785p r6 = (InterfaceC0785p) r5.get();
        if (r6 == null) goto L20;
        if (r6 != this) goto L16;
    L20:
        r32.remove(r5);
        goto L16
    L21:
        boolean r33 = this.f2752A;
        C0929t0 r14 = r13.f2749a;
        if (r33 == false) goto L24;
        AbstractC0923q0.m2252b(r14.f3272v, null);
        r14.f3272v.setAnimationStyle(0);
    L24:
        r14.dismiss();
        int r15 = r02.size();
        if (r15 <= 0) goto L28;
        this.f2768q = ((C0774e) r02.get(r15 - 1)).f2751c;
    L32:
        if (r15 != 0) goto L43;
        dismiss();
        InterfaceC0784o r92 = this.f2775x;
        if (r92 == null) goto L36;
        r92.mo339a(r8, true);
    L36:
        ViewTreeObserver r82 = this.f2776y;
        if (r82 != null) goto L39;
    L42:
        this.f2767p.removeOnAttachStateChangeListener(this.f2762k);
        this.f2777z.onDismiss();
        return;
    L39:
        if (r82.isAlive() == false) goto L41;
        this.f2776y.removeGlobalOnLayoutListener(this.f2761j);
    L41:
        this.f2776y = null;
        goto L42
    L43:
        if (r9 == false) goto L55;
        ((C0774e) r02.get(0)).f2750b.m1997c(false);
        return;
    L55:
        return;
    L28:
        if (this.f2766o.getLayoutDirection() != 1) goto L30;
        int r52 = 0;
    L31:
        this.f2768q = r52;
        goto L32
    L30:
        r52 = 1;
        goto L31
    L8:
        r3 = -1;
        goto L9
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: b */
    public final void mo1977b() {
        Iterator r02 = this.f2760i.iterator();
    L4:
        if (r02.hasNext() == false) goto L10;
        ListAdapter r1 = ((C0774e) r02.next()).f2749a.f3253c.getAdapter();
        if ((r1 instanceof HeaderViewListAdapter) == false) goto L9;
        r1 = ((HeaderViewListAdapter) r1).getWrappedAdapter();
    L9:
        ((C0776g) r1).notifyDataSetChanged();
        goto L4
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: d */
    public final boolean mo1978d() {
        ArrayList r02 = this.f2760i;
        if (r02.size() > 0) goto L5;
        return false;
    L5:
        if (((C0774e) r02.get(0)).f2749a.f3272v.isShowing() == false) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // p055f.InterfaceC0787r
    public final void dismiss() {
        ArrayList r02 = this.f2760i;
        int r1 = r02.size();
        if (r1 <= 0) goto L10;
        C0774e[] r03 = (C0774e[]) r02.toArray(new C0774e[r1]);
        int r12 = r1 - 1;
    L5:
        if (r12 < 0) goto L14;
        C0774e r2 = r03[r12];
        if (r2.f2749a.f3272v.isShowing() == false) goto L9;
        r2.f2749a.dismiss();
    L9:
        r12 = r12 - 1;
        goto L5
    L14:
        return;
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: e */
    public final ListView mo1979e() {
        ArrayList r02 = this.f2760i;
        if (r02.isEmpty() == false) goto L6;
        return null;
    L6:
        return ((C0774e) r02.get(r02.size() - 1)).f2749a.f3253c;
    }

    @Override // p055f.InterfaceC0787r
    /* JADX INFO: renamed from: f */
    public final void mo1980f() {
        if (mo1978d() == false) goto L5;
        return;
    L5:
        ArrayList r02 = this.f2759h;
        Iterator r1 = r02.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        m1992v((MenuC0779j) r1.next());
        goto L7
    L9:
        r02.clear();
        View r03 = this.f2766o;
        this.f2767p = r03;
        if (r03 != null) goto L12;
        return;
    L12:
        if (this.f2776y != null) goto L14;
        boolean r12 = true;
    L15:
        ViewTreeObserver r04 = r03.getViewTreeObserver();
        this.f2776y = r04;
        if (r12 == false) goto L18;
        r04.addOnGlobalLayoutListener(this.f2761j);
    L18:
        this.f2767p.addOnAttachStateChangeListener(this.f2762k);
        return;
    L14:
        r12 = false;
        goto L15
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: g */
    public final boolean mo1981g() {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: j */
    public final void mo1982j(InterfaceC0784o r1) {
        this.f2775x = r1;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: k */
    public final boolean mo1983k(SubMenuC0789t r5) {
        Iterator r02 = this.f2760i.iterator();
    L4:
        if (r02.hasNext() == false) goto L10;
        C0774e r1 = (C0774e) r02.next();
        if (r5 != r1.f2750b) goto L4;
        r1.f2749a.f3253c.requestFocus();
        return true;
    L10:
        if (r5.hasVisibleItems() == false) goto L15;
        mo1984l(r5);
        InterfaceC0784o r03 = this.f2775x;
        if (r03 == null) goto L14;
        r03.mo345k(r5);
    L14:
        return true;
    L15:
        return false;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: l */
    public final void mo1984l(MenuC0779j r2) {
        r2.m1996b(this, this.f2753b);
        if (mo1978d() == false) goto L5;
        m1992v(r2);
        return;
    L5:
        this.f2759h.add(r2);
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: n */
    public final void mo1985n(View r2) {
        if (this.f2766o == r2) goto L6;
        this.f2766o = r2;
        this.f2765n = Gravity.getAbsoluteGravity(this.f2764m, r2.getLayoutDirection());
        return;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: o */
    public final void mo1986o(boolean r1) {
        this.f2773v = r1;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ArrayList r02 = this.f2760i;
        int r1 = r02.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        C0774e r4 = (C0774e) r02.get(r3);
        if (r4.f2749a.f3272v.isShowing() == false) goto L9;
        r3 = r3 + 1;
    L9:
        if (r4 == null) goto L14;
        r4.f2750b.m1997c(false);
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

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: p */
    public final void mo1987p(int r2) {
        if (this.f2764m == r2) goto L6;
        this.f2764m = r2;
        this.f2765n = Gravity.getAbsoluteGravity(r2, this.f2766o.getLayoutDirection());
        return;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: q */
    public final void mo1988q(int r2) {
        this.f2769r = true;
        this.f2771t = r2;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: r */
    public final void mo1989r(PopupWindow.OnDismissListener r1) {
        this.f2777z = r1;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: s */
    public final void mo1990s(boolean r1) {
        this.f2774w = r1;
    }

    @Override // p055f.AbstractC0781l
    /* JADX INFO: renamed from: t */
    public final void mo1991t(int r2) {
        this.f2770s = true;
        this.f2772u = r2;
    }

    /* JADX INFO: renamed from: v */
    public final void m1992v(MenuC0779j r17) {
        Context r2 = this.f2753b;
        LayoutInflater r3 = LayoutInflater.from(r2);
        C0776g r4 = new C0776g(r17, r3, this.f2757f, C1031R.layout.abc_cascading_menu_item_layout);
        if (mo1978d() == true) goto L8;
        if (this.f2773v == false) goto L8;
        r4.f2780c = true;
    L10:
        int r5 = AbstractC0781l.m2021m(r4, r2, this.f2754c);
        C0929t0 r7 = new C0929t0(r2, this.f2755d, this.f2756e);
        r7.f3298y = this.f2763l;
        r7.f3263m = this;
        r7.f3272v.setOnDismissListener(this);
        r7.f3262l = this.f2766o;
        r7.f3260j = this.f2765n;
        r7.f3271u = true;
        r7.f3272v.setFocusable(true);
        r7.f3272v.setInputMethodMode(2);
        r7.m2249a(r4);
        Drawable r22 = r7.f3272v.getBackground();
        if (r22 == null) goto L13;
        Rect r42 = r7.f3269s;
        r22.getPadding(r42);
        r7.f3254d = (r42.left + r42.right) + r5;
    L14:
        r7.f3260j = this.f2765n;
        ArrayList r23 = this.f2760i;
        if (r23.size() <= 0) goto L47;
        C0774e r43 = (C0774e) r23.get(r23.size() - 1);
        MenuC0779j r11 = r43.f2750b;
        int r12 = r11.f2790f.size();
        int r13 = 0;
    L17:
        if (r13 >= r12) goto L24;
        MenuItem r14 = r11.getItem(r13);
        if (r14.hasSubMenu() == false) goto L23;
        if (r17 != r14.getSubMenu()) goto L23;
    L25:
        if (r14 == null) goto L48;
        C0927s0 r112 = r43.f2749a.f3253c;
        ListAdapter r122 = r112.getAdapter();
        if ((r122 instanceof HeaderViewListAdapter) == false) goto L30;
        HeaderViewListAdapter r123 = (HeaderViewListAdapter) r122;
        int r132 = r123.getHeadersCount();
        C0776g r124 = (C0776g) r123.getWrappedAdapter();
    L31:
        int r15 = r124.getCount();
        int r8 = 0;
    L33:
        if (r8 >= r15) goto L38;
        if (r14 == r124.m1994b(r8)) goto L39;
        r8 = r8 + 1;
    L39:
        if (r8 == (-1)) goto L48;
        int r82 = (r8 + r132) - r112.getFirstVisiblePosition();
        if (r82 < 0) goto L48;
        if (r82 >= r112.getChildCount()) goto L48;
        View r6 = r112.getChildAt(r82);
    L49:
        if (r6 == null) goto L80;
        int r83 = Build.VERSION.SDK_INT;
        C0938y r10 = r7.f3272v;
        if (r83 > 28) goto L56;
        Method r84 = C0929t0.f3297z;
        if (r84 != null) goto L99;
    L57:
        AbstractC0923q0.m2251a(r7.f3272v, null);
        C0927s0 r85 = ((C0774e) r23.get(r23.size() - 1)).f2749a.f3253c;
        int[] r102 = new int[2];
        r85.getLocationOnScreen(r102);
        Rect r113 = new Rect();
        this.f2767p.getWindowVisibleDisplayFrame(r113);
        if (this.f2768q != 1) goto L65;
        if (((r85.getWidth() + r102[0]) + r5) <= r113.right) goto L63;
    L61:
        int r86 = 0;
    L67:
        if (r86 != 1) goto L69;
        boolean r103 = true;
    L70:
        this.f2768q = r86;
        r7.f3262l = r6;
        if ((this.f2765n & 5) != 5) goto L75;
        if (r103 == true) goto L78;
        r5 = 0 - r6.getWidth();
    L78:
        r7.f3255e = r5;
        r7.f3259i = true;
        r7.f3258h = true;
        r7.f3256f = 0;
        r7.f3257g = true;
    L90:
        r23.add(new C0774e(r7, r17, this.f2768q));
        r7.mo1980f();
        C0927s0 r24 = r7.f3253c;
        r24.setOnKeyListener(this);
        if (r43 == null) goto L93;
        return;
    L93:
        if (this.f2774w == true) goto L95;
        return;
    L95:
        if (r17.f2796l == null) goto L109;
        FrameLayout r32 = (FrameLayout) r3.inflate(C1031R.layout.abc_popup_menu_header_item_layout, r24, false);
        TextView r44 = (TextView) r32.findViewById(R.id.title);
        r32.setEnabled(false);
        r44.setText(r17.f2796l);
        r24.addHeaderView(r32, null, false);
        r7.mo1980f();
        return;
    L109:
        return;
    L75:
        if (r103 == false) goto L77;
        r5 = r6.getWidth();
        goto L78
    L77:
        r5 = 0 - r5;
        goto L78
    L69:
        r103 = false;
    L63:
        r86 = 1;
        goto L67
    L65:
        if ((r102[0] - r5) >= 0) goto L61;
    L99:
        r84.invoke(r10, new Object[]{Boolean.FALSE});     // Catch: Exception -> L98
        goto L57
    L56:
        AbstractC0925r0.m2258a(r10, false);
        goto L57
    L80:
        if (this.f2769r == false) goto L83;
        r7.f3255e = this.f2771t;
    L83:
        if (this.f2770s == false) goto L85;
        r7.f3256f = this.f2772u;
        r7.f3257g = true;
    L85:
        Rect r52 = this.f2833a;
        if (r52 == null) goto L88;
        Rect r104 = new Rect(r52);
    L89:
        r7.f3270t = r104;
        goto L90
    L88:
        r104 = null;
        goto L89
    L38:
        r8 = -1;
        goto L39
    L30:
        r124 = (C0776g) r122;
        r132 = 0;
    L48:
        r6 = null;
    L23:
        r13 = r13 + 1;
        goto L17
    L24:
        r14 = null;
        goto L25
    L47:
        r43 = null;
        goto L48
    L13:
        r7.f3254d = r5;
    L8:
        if (mo1978d() == false) goto L10;
        r4.f2780c = AbstractC0781l.m2022u(r17);
        goto L10
    }
}
