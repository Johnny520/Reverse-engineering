package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p000.AbstractC1465go;
import p000.C0087C0;
import p000.C0130D0;
import p000.C0132D2;
import p000.C0216F0;
import p000.C1037Y5;
import p000.C1421fo;
import p000.C1456gf;
import p000.C2427qr;
import p000.C2781z0;
import p000.InterfaceC0120Cr;
import p000.InterfaceC0173E0;
import p000.InterfaceC0259G0;
import p000.InterfaceC0292Gr;
import p000.InterfaceC2113jr;
import p000.InterfaceC2161kr;
import p000.MenuC2204lr;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC1465go implements InterfaceC2161kr, InterfaceC0292Gr {

    /* JADX INFO: renamed from: A */
    public InterfaceC0259G0 f3776A;

    /* JADX INFO: renamed from: p */
    public MenuC2204lr f3777p;

    /* JADX INFO: renamed from: q */
    public Context f3778q;

    /* JADX INFO: renamed from: r */
    public int f3779r;

    /* JADX INFO: renamed from: s */
    public boolean f3780s;

    /* JADX INFO: renamed from: t */
    public C0130D0 f3781t;

    /* JADX INFO: renamed from: u */
    public C1037Y5 f3782u;

    /* JADX INFO: renamed from: v */
    public InterfaceC2113jr f3783v;

    /* JADX INFO: renamed from: w */
    public boolean f3784w;

    /* JADX INFO: renamed from: x */
    public int f3785x;

    /* JADX INFO: renamed from: y */
    public final int f3786y;

    /* JADX INFO: renamed from: z */
    public final int f3787z;

    public ActionMenuView(Context r3, AttributeSet r4) {
        super(r3, r4, 0);
        setBaselineAligned(false);
        float r42 = r3.getResources().getDisplayMetrics().density;
        this.f3786y = (int) (56.0f * r42);
        this.f3787z = (int) (r42 * 4.0f);
        this.f3778q = r3;
        this.f3779r = 0;
    }

    /* JADX INFO: renamed from: j */
    public static C0216F0 m2090j() {
        C0216F0 r0 = new C0216F0(-2, -2);
        r0.f635a = false;
        ((LinearLayout.LayoutParams) r0).gravity = 16;
        return r0;
    }

    /* JADX INFO: renamed from: k */
    public static C0216F0 m2091k(ViewGroup.LayoutParams r1) {
        if (r1 == null) goto L12;
        if ((r1 instanceof C0216F0) == false) goto L6;
        C0216F0 r12 = (C0216F0) r1;
        C0216F0 r0 = new C0216F0(r12);
        r0.f635a = r12.f635a;
    L8:
        if (((LinearLayout.LayoutParams) r0).gravity > 0) goto L10;
        ((LinearLayout.LayoutParams) r0).gravity = 16;
    L10:
        return r0;
    L6:
        r0 = new C0216F0(r1);
        goto L8
    L12:
        return m2090j();
    }

    @Override // p000.InterfaceC2161kr
    /* JADX INFO: renamed from: a */
    public final boolean mo2074a(C2427qr r4) {
        return this.f3777p.m4436q(r4, null, 0);
    }

    @Override // p000.InterfaceC0292Gr
    /* JADX INFO: renamed from: b */
    public final void mo591b(MenuC2204lr r1) {
        this.f3777p = r1;
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof C0216F0;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        return false;
    }

    @Override // p000.AbstractC1465go
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C1421fo mo2092f() {
        return m2090j();
    }

    @Override // p000.AbstractC1465go
    /* JADX INFO: renamed from: g */
    public final C1421fo mo2093g(AttributeSet r3) {
        return new C0216F0(getContext(), r3);
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2090j();
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return m2091k(r1);
    }

    public Menu getMenu() {
        if (this.f3777p != null) goto L10;
        Context r0 = getContext();
        MenuC2204lr r1 = new MenuC2204lr(r0);
        this.f3777p = r1;
        r1.f7664e = new C0132D2(4, this);
        C0130D0 r12 = new C0130D0(r0);
        this.f3781t = r12;
        r12.f313l = true;
        r12.f314m = true;
        InterfaceC0120Cr r02 = this.f3782u;
        if (r02 != null) goto L8;
        r02 = new C1456gf(19);
    L8:
        r12.f306e = r02;
        this.f3777p.m4429b(r12, this.f3778q);
        C0130D0 r03 = this.f3781t;
        r03.f309h = this;
        this.f3777p = r03.f304c;
    L10:
        return this.f3777p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0130D0 r0 = this.f3781t;
        C0087C0 r1 = r0.f310i;
        if (r1 == null) goto L7;
        return r1.getDrawable();
    L7:
        if (r0.f312k == true) goto L9;
        return null;
    L9:
        return r0.f311j;
    }

    public int getPopupTheme() {
        return this.f3779r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p000.AbstractC1465go
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C1421fo mo2094h(ViewGroup.LayoutParams r1) {
        return m2091k(r1);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2095l(int r5) {
        boolean r0 = false;
        if (r5 != 0) goto L5;
        return false;
    L5:
        KeyEvent.Callback r1 = getChildAt(r5 - 1);
        KeyEvent.Callback r2 = getChildAt(r5);
        if (r5 < getChildCount()) goto L8;
    L10:
        if (r5 > 0) goto L12;
    L15:
        return r0;
    L12:
        if ((r2 instanceof InterfaceC0173E0) == false) goto L15;
        return ((InterfaceC0173E0) r2).mo136b() | r0;
    L8:
        if ((r1 instanceof InterfaceC0173E0) == false) goto L10;
        r0 = ((InterfaceC0173E0) r1).mo135a();
        goto L10
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        C0130D0 r12 = this.f3781t;
        if (r12 == null) goto L8;
        r12.mo218g();
        if (this.f3781t.m219h() == false) goto L9;
        this.f3781t.m214c();
        this.f3781t.m223l();
        return;
    L9:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0130D0 r0 = this.f3781t;
        if (r0 == null) goto L10;
        r0.m214c();
        C2781z0 r02 = r0.f321t;
        if (r02 != null) goto L7;
        return;
    L7:
        if (r02.m5291b() == false) goto L12;
        r02.f9323i.dismiss();
        return;
    L12:
        return;
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        if (this.f3784w == true) goto L6;
        super.onLayout(r18, r19, r20, r21, r22);
        return;
    L6:
        int r1 = getChildCount();
        int r2 = (r22 - r20) / 2;
        int r3 = getDividerWidth();
        int r4 = r21 - r19;
        int r5 = (r4 - getPaddingRight()) - getPaddingLeft();
        if (getLayoutDirection() != 1) goto L9;
        boolean r6 = true;
    L10:
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
    L12:
        if (r9 >= r1) goto L28;
        View r13 = getChildAt(r9);
        if (r13.getVisibility() == 8) goto L27;
        C0216F0 r12 = (C0216F0) r13.getLayoutParams();
        if (r12.f635a == false) goto L26;
        int r102 = r13.getMeasuredWidth();
        if (m2095l(r9) == false) goto L21;
        r102 = r102 + r3;
    L21:
        int r14 = r13.getMeasuredHeight();
        if (r6 == false) goto L24;
        int r15 = getPaddingLeft() + ((LinearLayout.LayoutParams) r12).leftMargin;
        int r122 = r15 + r102;
    L25:
        int r8 = r2 - (r14 / 2);
        r13.layout(r15, r8, r122, r14 + r8);
        r5 = r5 - r102;
        r10 = 1;
        goto L27
    L24:
        r122 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) r12).rightMargin;
        r15 = r122 - r102;
        goto L25
    L26:
        r5 = r5 - ((r13.getMeasuredWidth() + ((LinearLayout.LayoutParams) r12).leftMargin) + ((LinearLayout.LayoutParams) r12).rightMargin);
        m2095l(r9);
        r11 = r11 + 1;
    L27:
        r9 = r9 + 1;
        goto L12
    L28:
        if (r1 != 1) goto L32;
        if (r10 != 0) goto L32;
        View r16 = getChildAt(0);
        int r32 = r16.getMeasuredWidth();
        int r52 = r16.getMeasuredHeight();
        int r42 = (r4 / 2) - (r32 / 2);
        int r23 = r2 - (r52 / 2);
        r16.layout(r42, r23, r32 + r42, r52 + r23);
        return;
    L32:
        int r112 = r11 - (r10 ^ 1);
        if (r112 <= 0) goto L36;
        int r33 = r5 / r112;
    L37:
        int r34 = Math.max(0, r33);
        if (r6 == false) goto L48;
        int r53 = getWidth() - getPaddingRight();
        int r82 = 0;
    L40:
        if (r82 >= r1) goto L57;
        View r43 = getChildAt(r82);
        C0216F0 r62 = (C0216F0) r43.getLayoutParams();
        if (r43.getVisibility() == 8) goto L47;
        if (r62.f635a == true) goto L47;
        int r54 = r53 - ((LinearLayout.LayoutParams) r62).rightMargin;
        int r7 = r43.getMeasuredWidth();
        int r92 = r43.getMeasuredHeight();
        int r103 = r2 - (r92 / 2);
        r43.layout(r54 - r7, r103, r54, r92 + r103);
        r53 = r54 - ((r7 + ((LinearLayout.LayoutParams) r62).leftMargin) + r34);
    L47:
        r82 = r82 + 1;
        goto L40
    L57:
        return;
    L48:
        int r55 = getPaddingLeft();
        int r83 = 0;
    L49:
        if (r83 >= r1) goto L70;
        View r44 = getChildAt(r83);
        C0216F0 r63 = (C0216F0) r44.getLayoutParams();
        if (r44.getVisibility() == 8) goto L56;
        if (r63.f635a == true) goto L56;
        int r56 = r55 + ((LinearLayout.LayoutParams) r63).leftMargin;
        int r72 = r44.getMeasuredWidth();
        int r93 = r44.getMeasuredHeight();
        int r104 = r2 - (r93 / 2);
        r44.layout(r56, r104, r56 + r72, r93 + r104);
        r55 = ((r72 + ((LinearLayout.LayoutParams) r63).rightMargin) + r34) + r56;
    L56:
        r83 = r83 + 1;
        goto L49
    L70:
        return;
    L36:
        r33 = 0;
        goto L37
    L9:
        r6 = false;
        goto L10
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p000.AbstractC1465go, android.view.View
    public final void onMeasure(int r31, int r32) {
        boolean r1 = this.f3784w;
        if (View.MeasureSpec.getMode(r31) != 1073741824) goto L5;
        boolean r2 = true;
    L6:
        this.f3784w = r2;
        if (r1 == r2) goto L9;
        this.f3785x = 0;
    L9:
        int r12 = View.MeasureSpec.getSize(r31);
        if (this.f3784w == false) goto L16;
        MenuC2204lr r22 = this.f3777p;
        if (r22 == null) goto L16;
        if (r12 == this.f3785x) goto L16;
        this.f3785x = r12;
        r22.m4435p(true);
    L16:
        int r13 = getChildCount();
        if (this.f3784w == false) goto L188;
        if (r13 <= 0) goto L188;
        int r14 = View.MeasureSpec.getMode(r32);
        int r23 = View.MeasureSpec.getSize(r31);
        int r6 = View.MeasureSpec.getSize(r32);
        int r8 = getPaddingRight() + getPaddingLeft();
        int r9 = getPaddingBottom() + getPaddingTop();
        int r7 = ViewGroup.getChildMeasureSpec(r32, r9, -2);
        int r24 = r23 - r8;
        int r82 = this.f3786y;
        int r10 = r24 / r82;
        int r11 = r24 % r82;
        if (r10 != 0) goto L23;
        setMeasuredDimension(r24, 0);
        return;
    L23:
        int r112 = (r11 / r10) + r82;
        int r83 = getChildCount();
        int r3 = 0;
        int r122 = 0;
        int r132 = 0;
        int r142 = 0;
        boolean r15 = false;
        int r16 = 0;
        long r18 = 0;
    L24:
        int r5 = this.f3787z;
        if (r142 >= r83) goto L79;
        View r4 = getChildAt(r142);
        int r21 = r6;
        int r222 = r9;
        if (r4.getVisibility() != 8) goto L29;
        int r232 = r112;
    L78:
        r142 = r142 + 1;
        r6 = r21;
        r9 = r222;
        r112 = r232;
        goto L24
    L29:
        boolean r62 = r4 instanceof ActionMenuItemView;
        r122 = r122 + 1;
        if (r62 == false) goto L32;
        r4.setPadding(r5, 0, r5, 0);
    L32:
        C0216F0 r52 = (C0216F0) r4.getLayoutParams();
        r52.f640f = false;
        r52.f637c = 0;
        r52.f636b = 0;
        r52.f638d = false;
        ((LinearLayout.LayoutParams) r52).leftMargin = 0;
        ((LinearLayout.LayoutParams) r52).rightMargin = 0;
        if (r62 == true) goto L35;
    L37:
        boolean r92 = false;
    L38:
        r52.f639e = r92;
        if (r52.f635a == false) goto L41;
        int r93 = 1;
    L42:
        C0216F0 r63 = (C0216F0) r4.getLayoutParams();
        int r25 = r10;
        r232 = r112;
        int r102 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(r7) - r222, View.MeasureSpec.getMode(r7));
        if (r62 == false) goto L45;
        ActionMenuItemView r113 = (ActionMenuItemView) r4;
    L46:
        if (r113 != null) goto L48;
    L50:
        boolean r114 = false;
    L51:
        boolean r242 = r114;
        if (r93 <= 0) goto L63;
        if (r114 == true) goto L55;
    L56:
        r4.measure(View.MeasureSpec.makeMeasureSpec(r232 * r93, Integer.MIN_VALUE), r102);
        int r94 = r4.getMeasuredWidth();
        int r115 = r94 / r232;
        if ((r94 % r232) == 0) goto L59;
        r115 = r115 + 1;
    L59:
        if (r242 == false) goto L65;
        if (r115 >= 2) goto L65;
        r115 = 2;
    L65:
        if (r63.f635a == true) goto L68;
        if (r242 == false) goto L68;
        boolean r95 = true;
    L69:
        r63.f638d = r95;
        r63.f636b = r115;
        r4.measure(View.MeasureSpec.makeMeasureSpec(r115 * r232, 1073741824), r102);
        r132 = Math.max(r132, r115);
        if (r52.f638d == false) goto L73;
        r16 = r16 + 1;
    L73:
        if (r52.f635a == false) goto L75;
        r15 = true;
    L75:
        r10 = r25 - r115;
        r3 = Math.max(r3, r4.getMeasuredHeight());
        if (r115 != 1) goto L78;
        r18 = r18 | ((long) (1 << r142));
    L68:
        r95 = false;
        goto L69
    L55:
        if (r93 >= 2) goto L56;
    L63:
        r115 = 0;
        goto L65
    L48:
        if (TextUtils.isEmpty(r113.getText()) == true) goto L50;
        r114 = true;
        goto L51
    L45:
        r113 = null;
        goto L46
    L41:
        r93 = r10;
        goto L42
    L35:
        if (TextUtils.isEmpty(((ActionMenuItemView) r4).getText()) == true) goto L37;
        r92 = true;
        goto L38
    L79:
        int r212 = r6;
        int r252 = r10;
        int r233 = r112;
        if (r15 == true) goto L82;
    L84:
        boolean r42 = false;
    L85:
        int r103 = r252;
        boolean r64 = false;
    L87:
        if (r16 <= 0) goto L120;
        if (r103 <= 0) goto L120;
        int r96 = Integer.MAX_VALUE;
        long r26 = 0;
        int r116 = 0;
        int r143 = 0;
    L90:
        if (r143 >= r83) goto L100;
        int r28 = r3;
        C0216F0 r33 = (C0216F0) getChildAt(r143).getLayoutParams();
        boolean r223 = r42;
        if (r33.f638d == false) goto L99;
        int r34 = r33.f636b;
        if (r34 >= r96) goto L97;
        r26 = 1 << r143;
        r96 = r34;
        r116 = 1;
        goto L99
    L97:
        if (r34 != r96) goto L99;
        r26 = r26 | (1 << r143);
        r116 = r116 + 1;
    L99:
        r143 = r143 + 1;
        r42 = r223;
        r3 = r28;
        goto L90
    L100:
        int r282 = r3;
        boolean r224 = r42;
        r18 = r18 | r26;
        if (r116 > r103) goto L122;
        int r97 = r96 + 1;
        int r35 = 0;
    L104:
        if (r35 >= r83) goto L119;
        View r43 = getChildAt(r35);
        C0216F0 r65 = (C0216F0) r43.getLayoutParams();
        boolean r29 = r15;
        long r144 = 1 << r35;
        if ((r26 & r144) == 0) goto L108;
        if (r224 == true) goto L112;
    L116:
        ?? r117 = 1;
    L117:
        r65.f636b += r117;
        r65.f640f = r117;
        r103 = r103 - 1;
    L118:
        r35 = r35 + 1;
        r15 = r29;
        goto L104
    L112:
        if (r65.f639e == false) goto L116;
        r117 = 1;
        r117 = 1;
        if (r103 != 1) goto L117;
        r43.setPadding(r5 + r233, 0, r5, 0);
        goto L117
    L108:
        if (r65.f636b != r97) goto L118;
        r18 = r18 | r144;
        goto L118
    L119:
        r42 = r224;
        r3 = r282;
        r64 = true;
    L122:
        if (r15 == true) goto L125;
        if (r122 != 1) goto L125;
        boolean r36 = true;
    L126:
        if (r103 > 0) goto L128;
    L174:
        if (r64 == false) goto L183;
        int r44 = 0;
    L176:
        if (r44 >= r83) goto L183;
        View r37 = getChildAt(r44);
        C0216F0 r53 = (C0216F0) r37.getLayoutParams();
        if (r53.f640f == false) goto L181;
        r37.measure(View.MeasureSpec.makeMeasureSpec((r53.f636b * r233) + r53.f637c, 1073741824), r7);
    L181:
        r44 = r44 + 1;
    L183:
        if (r14 == 1073741824) goto L185;
        int r66 = r282;
    L186:
        setMeasuredDimension(r24, r66);
        return;
    L185:
        r66 = r212;
        goto L186
    L128:
        if (r18 == 0) goto L174;
        if (r103 < (r122 - 1)) goto L133;
        if (r36 == true) goto L133;
        if (r132 <= 1) goto L174;
    L133:
        float r45 = Long.bitCount(r18);
        if (r36 == true) goto L146;
        if ((r18 & 1) != 0) goto L138;
    L140:
        int r38 = r83 - 1;
        if ((r18 & ((long) (1 << r38))) == 0) goto L146;
        if (((C0216F0) getChildAt(r38).getLayoutParams()).f639e == true) goto L146;
        r45 = r45 - 0.5f;
        goto L146
    L138:
        if (((C0216F0) getChildAt(0).getLayoutParams()).f639e == true) goto L140;
        r45 = r45 - 0.5f;
    L146:
        if (r45 <= 0.0f) goto L148;
        int r98 = (int) ((r103 * r233) / r45);
    L149:
        boolean r46 = r64;
        int r39 = 0;
    L150:
        if (r39 >= r83) goto L173;
        if ((r18 & ((long) (1 << r39))) == 0) goto L172;
        View r54 = getChildAt(r39);
        C0216F0 r67 = (C0216F0) r54.getLayoutParams();
        if ((r54 instanceof ActionMenuItemView) == false) goto L164;
        r67.f637c = r98;
        r67.f640f = true;
        if (r39 != 0) goto L162;
        if (r67.f639e == true) goto L162;
        ((LinearLayout.LayoutParams) r67).leftMargin = (-r98) / 2;
    L162:
        r46 = true;
        goto L172
    L164:
        if (r67.f635a == false) goto L167;
        r67.f637c = r98;
        r67.f640f = true;
        ((LinearLayout.LayoutParams) r67).rightMargin = (-r98) / 2;
        r46 = true;
        goto L172
    L167:
        if (r39 == 0) goto L170;
        ((LinearLayout.LayoutParams) r67).leftMargin = r98 / 2;
    L170:
        if (r39 == (r83 - 1)) goto L172;
        ((LinearLayout.LayoutParams) r67).rightMargin = r98 / 2;
    L172:
        r39 = r39 + 1;
        goto L150
    L173:
        r64 = r46;
        goto L174
    L148:
        r98 = 0;
    L125:
        r36 = false;
    L120:
        r282 = r3;
        goto L122
    L82:
        if (r122 != 2) goto L84;
        r42 = true;
    L188:
        int r99 = 0;
    L189:
        if (r99 >= r13) goto L191;
        C0216F0 r27 = (C0216F0) getChildAt(r99).getLayoutParams();
        ((LinearLayout.LayoutParams) r27).rightMargin = 0;
        ((LinearLayout.LayoutParams) r27).leftMargin = 0;
        r99 = r99 + 1;
        goto L189
    L191:
        super.onMeasure(r31, r32);
        return;
    L5:
        r2 = false;
        goto L6
    }

    public void setExpandedActionViewsExclusive(boolean r2) {
        this.f3781t.f318q = r2;
    }

    public void setOnMenuItemClickListener(InterfaceC0259G0 r1) {
        this.f3776A = r1;
    }

    public void setOverflowIcon(Drawable r3) {
        getMenu();
        C0130D0 r0 = this.f3781t;
        C0087C0 r1 = r0.f310i;
        if (r1 == null) goto L6;
        r1.setImageDrawable(r3);
        return;
    L6:
        r0.f312k = true;
        r0.f311j = r3;
    }

    public void setOverflowReserved(boolean r1) {
        this.f3780s = r1;
    }

    public void setPopupTheme(int r3) {
        if (this.f3779r == r3) goto L10;
        this.f3779r = r3;
        if (r3 != 0) goto L8;
        this.f3778q = getContext();
        return;
    L8:
        this.f3778q = new ContextThemeWrapper(getContext(), r3);
        return;
    }

    public void setPresenter(C0130D0 r1) {
        this.f3781t = r1;
        r1.f309h = this;
        this.f3777p = r1.f304c;
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new C0216F0(getContext(), r3);
    }
}
