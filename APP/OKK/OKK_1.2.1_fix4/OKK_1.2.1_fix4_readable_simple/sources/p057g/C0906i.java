package p057g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import org.luckypray.dexkit.C1031R;
import p000A.RunnableC0000a;
import p006D.C0095d;
import p055f.AbstractC0781l;
import p055f.InterfaceC0784o;
import p055f.InterfaceC0785p;
import p055f.InterfaceC0786q;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;
import p055f.SubMenuC0789t;

/* JADX INFO: renamed from: g.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0906i implements InterfaceC0785p {

    /* JADX INFO: renamed from: a */
    public final Context f3203a;

    /* JADX INFO: renamed from: b */
    public Context f3204b;

    /* JADX INFO: renamed from: c */
    public MenuC0779j f3205c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f3206d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0784o f3207e;

    /* JADX INFO: renamed from: f */
    public final int f3208f;

    /* JADX INFO: renamed from: g */
    public ActionMenuView f3209g;

    /* JADX INFO: renamed from: h */
    public C0904h f3210h;

    /* JADX INFO: renamed from: i */
    public Drawable f3211i;

    /* JADX INFO: renamed from: j */
    public boolean f3212j;

    /* JADX INFO: renamed from: k */
    public boolean f3213k;

    /* JADX INFO: renamed from: l */
    public boolean f3214l;

    /* JADX INFO: renamed from: m */
    public int f3215m;

    /* JADX INFO: renamed from: n */
    public int f3216n;

    /* JADX INFO: renamed from: o */
    public int f3217o;

    /* JADX INFO: renamed from: p */
    public boolean f3218p;

    /* JADX INFO: renamed from: q */
    public final SparseBooleanArray f3219q;

    /* JADX INFO: renamed from: r */
    public C0900f f3220r;

    /* JADX INFO: renamed from: s */
    public C0900f f3221s;

    /* JADX INFO: renamed from: t */
    public RunnableC0000a f3222t;

    /* JADX INFO: renamed from: u */
    public C0902g f3223u;

    /* JADX INFO: renamed from: v */
    public final C0095d f3224v;

    public C0906i(Context r2) {
        this.f3203a = r2;
        this.f3206d = LayoutInflater.from(r2);
        this.f3208f = C1031R.layout.abc_action_menu_item_layout;
        this.f3219q = new SparseBooleanArray();
        this.f3224v = new C0095d(17, this);
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: a */
    public final void mo1976a(MenuC0779j r3, boolean r4) {
        m2235e();
        C0900f r02 = this.f3221s;
        if (r02 != null) goto L5;
    L7:
        InterfaceC0784o r03 = this.f3207e;
        if (r03 == null) goto L11;
        r03.mo339a(r3, r4);
        return;
    L11:
        return;
    L5:
        if (r02.m2027b() == false) goto L7;
        r02.f2844j.dismiss();
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: b */
    public final void mo1977b() {
        ViewGroup r02 = this.f3209g;
        ArrayList r1 = null;
        boolean r2 = false;
        if (r02 == null) goto L32;
        MenuC0779j r3 = this.f3205c;
        if (r3 == null) goto L25;
        r3.m2003i();
        ArrayList r32 = this.f3205c.m2005k();
        int r4 = r32.size();
        int r5 = 0;
        int r6 = 0;
    L8:
        if (r5 >= r4) goto L27;
        MenuItemC0780k r7 = (MenuItemC0780k) r32.get(r5);
        if (r7.m2017d() == false) goto L24;
        View r8 = r02.getChildAt(r6);
        if ((r8 instanceof InterfaceC0786q) == false) goto L14;
        MenuItemC0780k r9 = ((InterfaceC0786q) r8).getItemData();
    L15:
        View r10 = m2234d(r7, r8, r02);
        if (r7 == r9) goto L18;
        r10.setPressed(false);
        r10.jumpDrawablesToCurrentState();
    L18:
        if (r10 == r8) goto L23;
        ViewGroup r72 = (ViewGroup) r10.getParent();
        if (r72 == null) goto L22;
        r72.removeView(r10);
    L22:
        this.f3209g.addView(r10, r6);
    L23:
        r6 = r6 + 1;
        goto L24
    L14:
        r9 = null;
    L24:
        r5 = r5 + 1;
    L27:
        if (r6 >= r02.getChildCount()) goto L32;
        if (r02.getChildAt(r6) == this.f3210h) goto L30;
        r02.removeViewAt(r6);
        goto L27
    L30:
        r6 = r6 + 1;
        goto L27
    L25:
        r6 = 0;
    L32:
        this.f3209g.requestLayout();
        MenuC0779j r03 = this.f3205c;
        if (r03 == null) goto L37;
        r03.m2003i();
        ArrayList r04 = r03.f2793i;
        int r33 = r04.size();
        int r42 = 0;
    L35:
        if (r42 >= r33) goto L37;
        ((MenuItemC0780k) r04.get(r42)).getClass();
        r42 = r42 + 1;
    L37:
        MenuC0779j r05 = this.f3205c;
        if (r05 == null) goto L41;
        r05.m2003i();
        r1 = r05.f2794j;
    L41:
        if (this.f3213k == false) goto L48;
        if (r1 == null) goto L48;
        int r06 = r1.size();
        if (r06 != 1) goto L46;
        r2 = !((MenuItemC0780k) r1.get(0)).f2806B;
        goto L48
    L46:
        if (r06 <= 0) goto L48;
        r2 = true;
    L48:
        if (r2 == true) goto L50;
        C0904h r07 = this.f3210h;
        if (r07 == null) goto L62;
        ViewParent r08 = r07.getParent();
        ActionMenuView r12 = this.f3209g;
        if (r08 != r12) goto L62;
        r12.removeView(this.f3210h);
    L62:
        this.f3209g.setOverflowReserved(this.f3213k);
        return;
    L50:
        if (this.f3210h != null) goto L52;
        this.f3210h = new C0904h(this, this.f3203a);
    L52:
        ViewGroup r09 = (ViewGroup) this.f3210h.getParent();
        if (r09 == this.f3209g) goto L62;
        if (r09 == null) goto L56;
        r09.removeView(this.f3210h);
    L56:
        ActionMenuView r010 = this.f3209g;
        C0904h r13 = this.f3210h;
        r010.getClass();
        C0910k r22 = ActionMenuView.m1124i();
        r22.f3225a = true;
        r010.addView(r13, r22);
        goto L62
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: c */
    public final boolean mo2023c(MenuItemC0780k r1) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final View m2234d(MenuItemC0780k r4, View r5, ViewGroup r6) {
        View r02 = r4.f2832z;
        if (r02 != null) goto L6;
        r02 = null;
    L6:
        int r1 = 0;
        if (r02 == null) goto L11;
        if (r4.m2016c() == true) goto L11;
    L19:
        if (r4.f2806B == false) goto L21;
        r1 = 8;
    L21:
        r02.setVisibility(r1);
        ViewGroup.LayoutParams r42 = r02.getLayoutParams();
        ((ActionMenuView) r6).getClass();
        if ((r42 instanceof C0910k) == true) goto L24;
        r02.setLayoutParams(ActionMenuView.m1125j(r42));
    L24:
        return r02;
    L11:
        if ((r5 instanceof InterfaceC0786q) == false) goto L13;
        InterfaceC0786q r52 = (InterfaceC0786q) r5;
    L14:
        r52.mo1113c(r4);
        ActionMenuItemView r2 = (ActionMenuItemView) r52;
        r2.setItemInvoker(this.f3209g);
        if (this.f3223u != null) goto L17;
        this.f3223u = new C0902g(this);
    L17:
        r2.setPopupCallback(this.f3223u);
        r02 = (View) r52;
        goto L19
    L13:
        int r53 = this.f3208f;
        r52 = (InterfaceC0786q) this.f3206d.inflate(r53, r6, false);
        goto L14
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2235e() {
        RunnableC0000a r02 = this.f3222t;
        if (r02 == null) goto L8;
        ActionMenuView r2 = this.f3209g;
        if (r2 == null) goto L8;
        r2.removeCallbacks(r02);
        this.f3222t = null;
        return true;
    L8:
        C0900f r03 = this.f3220r;
        if (r03 != null) goto L11;
        return false;
    L11:
        if (r03.m2027b() == false) goto L13;
        r03.f2844j.dismiss();
    L13:
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2236f() {
        if (this.f3213k == false) goto L19;
        C0900f r02 = this.f3220r;
        if (r02 != null) goto L7;
    L9:
        MenuC0779j r03 = this.f3205c;
        if (r03 != null) goto L12;
        return false;
    L12:
        if (this.f3209g != null) goto L14;
        return false;
    L14:
        if (this.f3222t != null) goto L23;
        r03.m2003i();
        if (r03.f2794j.isEmpty() == true) goto L24;
        RunnableC0000a r1 = new RunnableC0000a(this, new C0900f(this, this.f3204b, this.f3205c, this.f3210h));
        this.f3222t = r1;
        this.f3209g.post(r1);
        return true;
    L24:
        return false;
    L23:
        return false;
    L7:
        if (r02.m2027b() == false) goto L9;
        return false;
    L19:
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: g */
    public final boolean mo1981g() {
        MenuC0779j r1 = this.f3205c;
        if (r1 == null) goto L5;
        ArrayList r12 = r1.m2005k();
        int r4 = r12.size();
    L6:
        int r5 = this.f3217o;
        int r6 = this.f3216n;
        int r7 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView r8 = this.f3209g;
        int r9 = 0;
        boolean r10 = false;
        int r11 = 0;
        int r122 = 0;
    L7:
        int r13 = 2;
        boolean r14 = true;
        if (r9 >= r4) goto L23;
        MenuItemC0780k r15 = (MenuItemC0780k) r12.get(r9);
        int r3 = r15.f2831y;
        if ((r3 & 2) != 2) goto L13;
        r11 = r11 + 1;
    L17:
        if (this.f3218p == false) goto L21;
        if (r15.f2806B == false) goto L21;
        r5 = 0;
    L21:
        r9 = r9 + 1;
        goto L7
    L13:
        if ((r3 & 1) != 1) goto L15;
        r122 = r122 + 1;
        goto L17
    L15:
        r10 = true;
        goto L17
    L23:
        if (this.f3213k == false) goto L28;
        if (r10 == false) goto L26;
    L27:
        r5 = r5 - 1;
        goto L28
    L26:
        if ((r122 + r11) > r5) goto L27;
    L28:
        int r52 = r5 - r11;
        SparseBooleanArray r2 = this.f3219q;
        r2.clear();
        int r32 = 0;
        int r92 = 0;
    L29:
        if (r32 >= r4) goto L80;
        MenuItemC0780k r102 = (MenuItemC0780k) r12.get(r32);
        int r112 = r102.f2831y;
        if ((r112 & 2) != r13) goto L33;
        boolean r123 = r14;
    L34:
        int r152 = r102.f2808b;
        if (r123 == false) goto L44;
        View r113 = m2234d(r102, null, r8);
        r113.measure(r7, r7);
        int r114 = r113.getMeasuredWidth();
        r6 = r6 - r114;
        if (r92 != 0) goto L39;
        r92 = r114;
    L39:
        if (r152 == 0) goto L41;
        r2.put(r152, r14);
    L41:
        r102.m2019f(r14);
    L78:
        r32 = r32 + 1;
        r13 = 2;
        r14 = true;
        goto L29
    L44:
        if ((r112 & 1) != r14) goto L77;
        boolean r115 = r2.get(r152);
        if (r52 > 0) goto L48;
        if (r115 == true) goto L48;
    L50:
        boolean r124 = false;
    L52:
        if (r124 == false) goto L61;
        View r142 = m2234d(r102, null, r8);
        r142.measure(r7, r7);
        int r143 = r142.getMeasuredWidth();
        r6 = r6 - r143;
        if (r92 != 0) goto L57;
        r92 = r143;
    L57:
        if ((r6 + r92) <= 0) goto L59;
        boolean r144 = true;
    L60:
        r124 = r124 & r144;
        goto L61
    L59:
        r144 = false;
    L61:
        if (r124 == false) goto L64;
        if (r152 == 0) goto L64;
        r2.put(r152, true);
    L74:
        if (r124 == false) goto L76;
        r52 = r52 - 1;
    L76:
        r102.m2019f(r124);
    L64:
        if (r115 == false) goto L74;
        r2.put(r152, false);
        int r116 = 0;
    L66:
        if (r116 >= r32) goto L74;
        MenuItemC0780k r145 = (MenuItemC0780k) r12.get(r116);
        if (r145.f2808b != r152) goto L73;
        if (r145.m2017d() == false) goto L72;
        r52 = r52 + 1;
    L72:
        r145.m2019f(false);
    L73:
        r116 = r116 + 1;
    L48:
        if (r6 <= 0) goto L50;
        r124 = r14;
        goto L52
    L77:
        r102.m2019f(false);
        goto L78
    L33:
        r123 = false;
        goto L34
    L80:
        return r14;
    L5:
        r4 = 0;
        r12 = null;
        goto L6
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: h */
    public final void mo2024h(Context r5, MenuC0779j r6) {
        this.f3204b = r5;
        LayoutInflater.from(r5);
        this.f3205c = r6;
        Resources r62 = r5.getResources();
        if (this.f3214l == true) goto L5;
        this.f3213k = true;
    L5:
        int r1 = 2;
        this.f3215m = r5.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration r52 = r5.getResources().getConfiguration();
        int r02 = r52.screenWidthDp;
        int r2 = r52.screenHeightDp;
        if (r52.smallestScreenWidthDp > 600) goto L26;
        if (r02 > 600) goto L26;
        if (r02 <= 960) goto L11;
        if (r2 > 720) goto L26;
    L11:
        if (r02 <= 720) goto L15;
        if (r2 > 960) goto L26;
    L15:
        if (r02 < 500) goto L17;
    L25:
        r1 = 4;
    L27:
        this.f3217o = r1;
        int r53 = this.f3215m;
        if (this.f3213k == true) goto L30;
        this.f3210h = null;
    L37:
        this.f3216n = r53;
        float r54 = r62.getDisplayMetrics().density;
        return;
    L30:
        if (this.f3210h != null) goto L35;
        C0904h r03 = new C0904h(this, this.f3203a);
        this.f3210h = r03;
        if (this.f3212j == false) goto L34;
        r03.setImageDrawable(this.f3211i);
        this.f3211i = null;
        this.f3212j = false;
    L34:
        int r04 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3210h.measure(r04, r04);
    L35:
        r53 = r53 - this.f3210h.getMeasuredWidth();
        goto L37
    L17:
        if (r02 <= 640) goto L19;
        if (r2 > 480) goto L25;
    L19:
        if (r02 <= 480) goto L23;
        if (r2 > 640) goto L25;
    L23:
        if (r02 < 360) goto L27;
        r1 = 3;
    L26:
        r1 = 5;
        goto L27
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: i */
    public final boolean mo2025i(MenuItemC0780k r1) {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: j */
    public final void mo1982j(InterfaceC0784o r1) {
        this.f3207e = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: k */
    public final boolean mo1983k(SubMenuC0789t r10) {
        if (r10.hasVisibleItems() == true) goto L5;
        return false;
    L5:
        SubMenuC0789t r02 = r10;
    L6:
        MenuC0779j r2 = r02.f2867v;
        if (r2 == this.f3205c) goto L9;
        r02 = (SubMenuC0789t) r2;
        goto L6
    L9:
        ActionMenuView r22 = this.f3209g;
        View r3 = null;
        r3 = null;
        if (r22 == null) goto L20;
        int r4 = r22.getChildCount();
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L20;
        View r6 = r22.getChildAt(r5);
        if ((r6 instanceof InterfaceC0786q) == false) goto L19;
        if (((InterfaceC0786q) r6).getItemData() != r02.f2868w) goto L19;
        r3 = r6;
    L19:
        r5 = r5 + 1;
    L20:
        if (r3 != null) goto L22;
        return false;
    L22:
        r10.f2868w.getClass();
        int r03 = r10.f2790f.size();
        int r23 = 0;
    L24:
        if (r23 >= r03) goto L31;
        MenuItem r52 = r10.getItem(r23);
        if (r52.isVisible() == false) goto L30;
        if (r52.getIcon() == null) goto L30;
        boolean r04 = true;
    L32:
        C0900f r24 = new C0900f(this, this.f3204b, r10, r3);
        this.f3221s = r24;
        r24.f2842h = r04;
        AbstractC0781l r25 = r24.f2844j;
        if (r25 == null) goto L35;
        r25.mo1986o(r04);
    L35:
        C0900f r05 = this.f3221s;
        if (r05.m2027b() == false) goto L39;
    L41:
        InterfaceC0784o r06 = this.f3207e;
        if (r06 == null) goto L44;
        r06.mo345k(r10);
    L44:
        return true;
    L39:
        if (r05.f2840f == null) goto L46;
        r05.m2029d(0, 0, false, false);
        goto L41
    L46:
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    L30:
        r23 = r23 + 1;
        goto L24
    L31:
        r04 = false;
        goto L32
    }
}
