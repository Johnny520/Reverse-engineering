package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import io.github.cherrywechat.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0130D0 implements InterfaceC0163Dr {

    /* JADX INFO: renamed from: a */
    public final Context f302a;

    /* JADX INFO: renamed from: b */
    public Context f303b;

    /* JADX INFO: renamed from: c */
    public MenuC2204lr f304c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f305d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0120Cr f306e;

    /* JADX INFO: renamed from: f */
    public final int f307f;

    /* JADX INFO: renamed from: g */
    public final int f308g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0292Gr f309h;

    /* JADX INFO: renamed from: i */
    public C0087C0 f310i;

    /* JADX INFO: renamed from: j */
    public Drawable f311j;

    /* JADX INFO: renamed from: k */
    public boolean f312k;

    /* JADX INFO: renamed from: l */
    public boolean f313l;

    /* JADX INFO: renamed from: m */
    public boolean f314m;

    /* JADX INFO: renamed from: n */
    public int f315n;

    /* JADX INFO: renamed from: o */
    public int f316o;

    /* JADX INFO: renamed from: p */
    public int f317p;

    /* JADX INFO: renamed from: q */
    public boolean f318q;

    /* JADX INFO: renamed from: r */
    public final SparseBooleanArray f319r;

    /* JADX INFO: renamed from: s */
    public C2781z0 f320s;

    /* JADX INFO: renamed from: t */
    public C2781z0 f321t;

    /* JADX INFO: renamed from: u */
    public RunnableC0044B0 f322u;

    /* JADX INFO: renamed from: v */
    public C0001A0 f323v;

    /* JADX INFO: renamed from: w */
    public final C0132D2 f324w;

    public C0130D0(Context r2) {
        this.f302a = r2;
        this.f305d = LayoutInflater.from(r2);
        this.f307f = R.layout.abc_action_menu_layout;
        this.f308g = R.layout.abc_action_menu_item_layout;
        this.f319r = new SparseBooleanArray();
        this.f324w = new C0132D2(3, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m212a(C2427qr r4, View r5, ViewGroup r6) {
        View r0 = r4.getActionView();
        int r1 = 0;
        if (r0 == null) goto L7;
        if (r4.m4860e() == true) goto L7;
    L15:
        if (r4.f8491C == false) goto L17;
        r1 = 8;
    L17:
        r0.setVisibility(r1);
        ViewGroup.LayoutParams r42 = r0.getLayoutParams();
        ((ActionMenuView) r6).getClass();
        if ((r42 instanceof C0216F0) == true) goto L20;
        r0.setLayoutParams(ActionMenuView.m2091k(r42));
    L20:
        return r0;
    L7:
        if ((r5 instanceof InterfaceC0249Fr) == false) goto L9;
        InterfaceC0249Fr r52 = (InterfaceC0249Fr) r5;
    L10:
        r52.mo521c(r4);
        ActionMenuItemView r2 = (ActionMenuItemView) r52;
        r2.setItemInvoker((ActionMenuView) this.f309h);
        if (this.f323v != null) goto L13;
        this.f323v = new C0001A0(this);
    L13:
        r2.setPopupCallback(this.f323v);
        r0 = (View) r52;
        goto L15
    L9:
        r52 = (InterfaceC0249Fr) this.f305d.inflate(this.f308g, r6, false);
        goto L10
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr r3, boolean r4) {
        m214c();
        C2781z0 r0 = this.f321t;
        if (r0 != null) goto L5;
    L7:
        InterfaceC0120Cr r02 = this.f306e;
        if (r02 == null) goto L11;
        r02.mo193b(r3, r4);
        return;
    L11:
        return;
    L5:
        if (r0.m5291b() == false) goto L7;
        r0.f9323i.dismiss();
        goto L7
    }

    /* JADX INFO: renamed from: c */
    public final boolean m214c() {
        RunnableC0044B0 r0 = this.f322u;
        if (r0 == null) goto L8;
        Object r2 = this.f309h;
        if (r2 == null) goto L8;
        ((View) r2).removeCallbacks(r0);
        this.f322u = null;
        return true;
    L8:
        C2781z0 r02 = this.f320s;
        if (r02 != null) goto L11;
        return false;
    L11:
        if (r02.m5291b() == false) goto L13;
        r02.f9323i.dismiss();
    L13:
        return true;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: d */
    public final boolean mo215d(C2427qr r1) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: e */
    public final void mo216e(InterfaceC0120Cr r1) {
        throw null;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: f */
    public final boolean mo217f(C2427qr r1) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        ViewGroup r0 = (ViewGroup) this.f309h;
        ArrayList r1 = null;
        boolean r2 = false;
        if (r0 == null) goto L32;
        MenuC2204lr r3 = this.f304c;
        if (r3 == null) goto L25;
        r3.m4433i();
        ArrayList r32 = this.f304c.m4434l();
        int r4 = r32.size();
        int r5 = 0;
        int r6 = 0;
    L8:
        if (r5 >= r4) goto L27;
        C2427qr r7 = (C2427qr) r32.get(r5);
        if ((r7.f8515x & 32) != 32) goto L24;
        View r8 = r0.getChildAt(r6);
        if ((r8 instanceof InterfaceC0249Fr) == false) goto L14;
        C2427qr r9 = ((InterfaceC0249Fr) r8).getItemData();
    L15:
        View r10 = m212a(r7, r8, r0);
        if (r7 == r9) goto L18;
        r10.setPressed(false);
        r10.jumpDrawablesToCurrentState();
    L18:
        if (r10 == r8) goto L23;
        ViewGroup r72 = (ViewGroup) r10.getParent();
        if (r72 == null) goto L22;
        r72.removeView(r10);
    L22:
        ((ViewGroup) this.f309h).addView(r10, r6);
    L23:
        r6 = r6 + 1;
        goto L24
    L14:
        r9 = null;
    L24:
        r5 = r5 + 1;
    L27:
        if (r6 >= r0.getChildCount()) goto L32;
        if (r0.getChildAt(r6) == this.f310i) goto L30;
        r0.removeViewAt(r6);
        goto L27
    L30:
        r6 = r6 + 1;
        goto L27
    L25:
        r6 = 0;
    L32:
        ((View) this.f309h).requestLayout();
        MenuC2204lr r02 = this.f304c;
        if (r02 == null) goto L37;
        r02.m4433i();
        ArrayList r03 = r02.f7668i;
        int r33 = r03.size();
        int r42 = 0;
    L35:
        if (r42 >= r33) goto L37;
        ActionProviderVisibilityListenerC2470rr r52 = ((C2427qr) r03.get(r42)).f8489A;
        r42 = r42 + 1;
    L37:
        MenuC2204lr r04 = this.f304c;
        if (r04 == null) goto L41;
        r04.m4433i();
        r1 = r04.f7669j;
    L41:
        if (this.f313l == false) goto L48;
        if (r1 == null) goto L48;
        int r05 = r1.size();
        if (r05 != 1) goto L46;
        r2 = !((C2427qr) r1.get(0)).f8491C;
        goto L48
    L46:
        if (r05 <= 0) goto L48;
        r2 = true;
    L48:
        if (r2 == true) goto L50;
        C0087C0 r06 = this.f310i;
        if (r06 == null) goto L62;
        Object r07 = r06.getParent();
        Object r12 = this.f309h;
        if (r07 != r12) goto L62;
        ((ViewGroup) r12).removeView(this.f310i);
    L62:
        ((ActionMenuView) this.f309h).setOverflowReserved(this.f313l);
        return;
    L50:
        if (this.f310i != null) goto L52;
        this.f310i = new C0087C0(this, this.f302a);
    L52:
        ViewGroup r08 = (ViewGroup) this.f310i.getParent();
        if (r08 == this.f309h) goto L62;
        if (r08 == null) goto L56;
        r08.removeView(this.f310i);
    L56:
        ActionMenuView r09 = (ActionMenuView) this.f309h;
        C0087C0 r13 = this.f310i;
        r09.getClass();
        C0216F0 r22 = ActionMenuView.m2090j();
        r22.f635a = true;
        r09.addView(r13, r22);
        goto L62
    }

    /* JADX INFO: renamed from: h */
    public final boolean m219h() {
        C2781z0 r0 = this.f320s;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.m5291b() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: i */
    public final void mo220i(Context r5, MenuC2204lr r6) {
        this.f303b = r5;
        LayoutInflater.from(r5);
        this.f304c = r6;
        Resources r62 = r5.getResources();
        if (this.f314m == true) goto L5;
        this.f313l = true;
    L5:
        int r1 = 2;
        this.f315n = r5.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration r52 = r5.getResources().getConfiguration();
        int r0 = r52.screenWidthDp;
        int r2 = r52.screenHeightDp;
        if (r52.smallestScreenWidthDp > 600) goto L26;
        if (r0 > 600) goto L26;
        if (r0 <= 960) goto L11;
        if (r2 > 720) goto L26;
    L11:
        if (r0 <= 720) goto L15;
        if (r2 > 960) goto L26;
    L15:
        if (r0 < 500) goto L17;
    L25:
        r1 = 4;
    L27:
        this.f317p = r1;
        int r53 = this.f315n;
        if (this.f313l == true) goto L30;
        this.f310i = null;
    L37:
        this.f316o = r53;
        float r54 = r62.getDisplayMetrics().density;
        return;
    L30:
        if (this.f310i != null) goto L35;
        C0087C0 r02 = new C0087C0(this, this.f302a);
        this.f310i = r02;
        if (this.f312k == false) goto L34;
        r02.setImageDrawable(this.f311j);
        this.f311j = null;
        this.f312k = false;
    L34:
        int r03 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f310i.measure(r03, r03);
    L35:
        r53 = r53 - this.f310i.getMeasuredWidth();
        goto L37
    L17:
        if (r0 <= 640) goto L19;
        if (r2 > 480) goto L25;
    L19:
        if (r0 <= 480) goto L23;
        if (r2 > 640) goto L25;
    L23:
        if (r0 < 360) goto L27;
        r1 = 3;
    L26:
        r1 = 5;
        goto L27
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez r9) {
        if (r9.hasVisibleItems() == false) goto L21;
        SubMenuC0214Ez r0 = r9;
    L6:
        MenuC2204lr r2 = r0.f631z;
        if (r2 == this.f304c) goto L9;
        r0 = (SubMenuC0214Ez) r2;
        goto L6
    L9:
        C2427qr r02 = r0.f630A;
        ViewGroup r22 = (ViewGroup) this.f309h;
        View r3 = null;
        r3 = null;
        if (r22 == null) goto L20;
        int r4 = r22.getChildCount();
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L20;
        View r6 = r22.getChildAt(r5);
        if ((r6 instanceof InterfaceC0249Fr) == false) goto L19;
        if (((InterfaceC0249Fr) r6).getItemData() != r02) goto L19;
        r3 = r6;
    L19:
        r5 = r5 + 1;
    L20:
        if (r3 == null) goto L21;
        r9.f630A.getClass();
        int r03 = r9.f7665f.size();
        int r23 = 0;
    L24:
        if (r23 >= r03) goto L31;
        MenuItem r52 = r9.getItem(r23);
        if (r52.isVisible() == false) goto L30;
        if (r52.getIcon() == null) goto L30;
        boolean r04 = true;
    L32:
        C2781z0 r24 = new C2781z0(this, this.f303b, r9, r3);
        this.f321t = r24;
        r24.f9321g = r04;
        AbstractC2642vr r25 = r24.f9323i;
        if (r25 == null) goto L35;
        r25.mo1947o(r04);
    L35:
        C2781z0 r05 = this.f321t;
        if (r05.m5291b() == false) goto L39;
    L41:
        InterfaceC0120Cr r06 = this.f306e;
        if (r06 == null) goto L44;
        r06.mo194s(r9);
    L44:
        return true;
    L39:
        if (r05.f9319e == null) goto L46;
        r05.m5293d(0, 0, false, false);
        goto L41
    L46:
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    L30:
        r23 = r23 + 1;
        goto L24
    L31:
        r04 = false;
    L21:
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        C0130D0 r0 = this;
        MenuC2204lr r1 = r0.f304c;
        if (r1 == null) goto L5;
        ArrayList r12 = r1.m4434l();
        int r4 = r12.size();
    L6:
        int r5 = r0.f317p;
        int r6 = r0.f316o;
        int r7 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup r8 = (ViewGroup) r0.f309h;
        int r9 = 0;
        boolean r10 = false;
        int r11 = 0;
        int r122 = 0;
    L7:
        int r13 = 2;
        boolean r14 = true;
        if (r9 >= r4) goto L23;
        C2427qr r15 = (C2427qr) r12.get(r9);
        int r3 = r15.f8516y;
        if ((r3 & 2) != 2) goto L13;
        r11 = r11 + 1;
    L17:
        if (r0.f318q == false) goto L21;
        if (r15.f8491C == false) goto L21;
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
        if (r0.f313l == false) goto L28;
        if (r10 == false) goto L26;
    L27:
        r5 = r5 - 1;
        goto L28
    L26:
        if ((r122 + r11) > r5) goto L27;
    L28:
        int r52 = r5 - r11;
        SparseBooleanArray r2 = r0.f319r;
        r2.clear();
        int r32 = 0;
        int r92 = 0;
    L29:
        if (r32 >= r4) goto L80;
        C2427qr r102 = (C2427qr) r12.get(r32);
        int r112 = r102.f8516y;
        if ((r112 & 2) != r13) goto L33;
        boolean r123 = r14;
    L34:
        int r152 = r102.f8493b;
        if (r123 == false) goto L44;
        View r113 = r0.m212a(r102, null, r8);
        r113.measure(r7, r7);
        int r114 = r113.getMeasuredWidth();
        r6 = r6 - r114;
        if (r92 != 0) goto L39;
        r92 = r114;
    L39:
        if (r152 == 0) goto L41;
        r2.put(r152, r14);
    L41:
        r102.m4861f(r14);
    L78:
        r32 = r32 + 1;
        r13 = 2;
        r0 = this;
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
        View r142 = r0.m212a(r102, null, r8);
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
        r102.m4861f(r124);
    L64:
        if (r115 == false) goto L74;
        r2.put(r152, false);
        int r116 = 0;
    L66:
        if (r116 >= r32) goto L74;
        C2427qr r145 = (C2427qr) r12.get(r116);
        if (r145.f8493b != r152) goto L73;
        if ((r145.f8515x & 32) != 32) goto L72;
        r52 = r52 + 1;
    L72:
        r145.m4861f(false);
    L73:
        r116 = r116 + 1;
    L48:
        if (r6 <= 0) goto L50;
        r124 = r14;
        goto L52
    L77:
        r102.m4861f(false);
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

    /* JADX INFO: renamed from: l */
    public final boolean m223l() {
        if (this.f313l == true) goto L5;
        return false;
    L5:
        if (m219h() == true) goto L18;
        MenuC2204lr r0 = this.f304c;
        if (r0 != null) goto L9;
        return false;
    L9:
        if (this.f309h != null) goto L11;
        return false;
    L11:
        if (this.f322u != null) goto L21;
        r0.m4433i();
        if (r0.f7669j.isEmpty() == true) goto L22;
        C2781z0 r02 = new C2781z0(this, this.f303b, this.f304c, this.f310i);
        RunnableC0044B0 r1 = new RunnableC0044B0(0, this, r02);
        this.f322u = r1;
        ((View) this.f309h).post(r1);
        return true;
    L22:
        return false;
    L21:
        return false;
    L18:
        return false;
    }
}
