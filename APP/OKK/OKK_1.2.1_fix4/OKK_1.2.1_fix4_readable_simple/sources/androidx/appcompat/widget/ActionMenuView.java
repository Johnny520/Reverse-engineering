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
import p006D.C0095d;
import p055f.InterfaceC0777h;
import p055f.InterfaceC0778i;
import p055f.InterfaceC0784o;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;
import p057g.AbstractC0881Q0;
import p057g.AbstractC0903g0;
import p057g.C0900f;
import p057g.C0901f0;
import p057g.C0904h;
import p057g.C0906i;
import p057g.C0910k;
import p057g.InterfaceC0908j;
import p057g.InterfaceC0912l;
import p089x0.C1121e;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0903g0 implements InterfaceC0778i {

    /* JADX INFO: renamed from: p */
    public MenuC0779j f1141p;

    /* JADX INFO: renamed from: q */
    public Context f1142q;

    /* JADX INFO: renamed from: r */
    public int f1143r;

    /* JADX INFO: renamed from: s */
    public C0906i f1144s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0784o f1145t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0777h f1146u;

    /* JADX INFO: renamed from: v */
    public boolean f1147v;

    /* JADX INFO: renamed from: w */
    public int f1148w;

    /* JADX INFO: renamed from: x */
    public final int f1149x;

    /* JADX INFO: renamed from: y */
    public final int f1150y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0912l f1151z;

    public ActionMenuView(Context r3, AttributeSet r4) {
        super(r3, r4);
        setBaselineAligned(false);
        float r02 = r3.getResources().getDisplayMetrics().density;
        this.f1149x = (int) (56.0f * r02);
        this.f1150y = (int) (r02 * 4.0f);
        this.f1142q = r3;
        this.f1143r = 0;
    }

    /* JADX INFO: renamed from: i */
    public static C0910k m1124i() {
        C0910k r02 = new C0910k(-2, -2);
        r02.f3225a = false;
        ((LinearLayout.LayoutParams) r02).gravity = 16;
        return r02;
    }

    /* JADX INFO: renamed from: j */
    public static C0910k m1125j(ViewGroup.LayoutParams r1) {
        if (r1 == null) goto L12;
        if ((r1 instanceof C0910k) == false) goto L6;
        C0910k r12 = (C0910k) r1;
        C0910k r02 = new C0910k(r12);
        r02.f3225a = r12.f3225a;
    L8:
        if (((LinearLayout.LayoutParams) r02).gravity > 0) goto L10;
        ((LinearLayout.LayoutParams) r02).gravity = 16;
    L10:
        return r02;
    L6:
        r02 = new C0910k(r1);
        goto L8
    L12:
        return m1124i();
    }

    @Override // p055f.InterfaceC0778i
    /* JADX INFO: renamed from: a */
    public final boolean mo1116a(MenuItemC0780k r4) {
        return this.f1141p.m2010p(r4, null, 0);
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof C0910k;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        return false;
    }

    @Override // p057g.AbstractC0903g0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C0901f0 mo1126e() {
        return m1124i();
    }

    @Override // p057g.AbstractC0903g0
    /* JADX INFO: renamed from: f */
    public final C0901f0 mo1127f(AttributeSet r3) {
        return new C0910k(getContext(), r3);
    }

    @Override // p057g.AbstractC0903g0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C0901f0 mo1128g(ViewGroup.LayoutParams r1) {
        return m1125j(r1);
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1124i();
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return m1125j(r1);
    }

    public Menu getMenu() {
        if (this.f1141p != null) goto L10;
        Context r02 = getContext();
        MenuC0779j r1 = new MenuC0779j(r02);
        this.f1141p = r1;
        r1.f2789e = new C0095d(18, this);
        C0906i r12 = new C0906i(r02);
        this.f1144s = r12;
        r12.f3213k = true;
        r12.f3214l = true;
        InterfaceC0784o r03 = this.f1145t;
        if (r03 != null) goto L8;
        r03 = new C1121e(29);
    L8:
        r12.f3207e = r03;
        this.f1141p.m1996b(r12, this.f1142q);
        C0906i r04 = this.f1144s;
        r04.f3209g = this;
        this.f1141p = r04.f3205c;
    L10:
        return this.f1141p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0906i r02 = this.f1144s;
        C0904h r1 = r02.f3210h;
        if (r1 == null) goto L6;
        return r1.getDrawable();
    L6:
        if (r02.f3212j == true) goto L11;
        return null;
    L11:
        return r02.f3211i;
    }

    public int getPopupTheme() {
        return this.f1143r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1129k(int r5) {
        boolean r02 = false;
        if (r5 != 0) goto L5;
        return false;
    L5:
        KeyEvent.Callback r1 = getChildAt(r5 - 1);
        KeyEvent.Callback r2 = getChildAt(r5);
        if (r5 < getChildCount()) goto L8;
    L10:
        if (r5 > 0) goto L12;
        return r02;
    L12:
        if ((r2 instanceof InterfaceC0908j) == true) goto L14;
        return r02;
    L14:
        return r02 | ((InterfaceC0908j) r2).mo1111a();
    L8:
        if ((r1 instanceof InterfaceC0908j) == false) goto L10;
        r02 = ((InterfaceC0908j) r1).mo1112b();
        goto L10
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        C0906i r12 = this.f1144s;
        if (r12 == null) goto L10;
        r12.mo1977b();
        C0900f r13 = this.f1144s.f3220r;
        if (r13 != null) goto L7;
        return;
    L7:
        if (r13.m2027b() == false) goto L12;
        this.f1144s.m2235e();
        this.f1144s.m2236f();
        return;
    L12:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0906i r02 = this.f1144s;
        if (r02 == null) goto L10;
        r02.m2235e();
        C0900f r03 = r02.f3221s;
        if (r03 != null) goto L7;
        return;
    L7:
        if (r03.m2027b() == false) goto L12;
        r03.f2844j.dismiss();
        return;
    L12:
        return;
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        if (this.f1147v == true) goto L6;
        super.onLayout(r18, r19, r20, r21, r22);
        return;
    L6:
        int r2 = getChildCount();
        int r3 = (r22 - r20) / 2;
        int r4 = getDividerWidth();
        int r5 = r21 - r19;
        int r6 = (r5 - getPaddingRight()) - getPaddingLeft();
        boolean r7 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() != 1) goto L9;
        boolean r72 = true;
    L10:
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
    L12:
        if (r9 >= r2) goto L28;
        View r13 = getChildAt(r9);
        if (r13.getVisibility() == 8) goto L27;
        C0910k r12 = (C0910k) r13.getLayoutParams();
        if (r12.f3225a == false) goto L26;
        int r102 = r13.getMeasuredWidth();
        if (m1129k(r9) == false) goto L21;
        r102 = r102 + r4;
    L21:
        int r14 = r13.getMeasuredHeight();
        if (r72 == false) goto L24;
        int r15 = getPaddingLeft() + ((LinearLayout.LayoutParams) r12).leftMargin;
        int r122 = r15 + r102;
    L25:
        int r8 = r3 - (r14 / 2);
        r13.layout(r15, r8, r122, r14 + r8);
        r6 = r6 - r102;
        r10 = 1;
        goto L27
    L24:
        r122 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) r12).rightMargin;
        r15 = r122 - r102;
        goto L25
    L26:
        r6 = r6 - ((r13.getMeasuredWidth() + ((LinearLayout.LayoutParams) r12).leftMargin) + ((LinearLayout.LayoutParams) r12).rightMargin);
        m1129k(r9);
        r11 = r11 + 1;
    L27:
        r9 = r9 + 1;
        goto L12
    L28:
        if (r2 != 1) goto L32;
        if (r10 != 0) goto L32;
        View r1 = getChildAt(0);
        int r23 = r1.getMeasuredWidth();
        int r42 = r1.getMeasuredHeight();
        int r52 = (r5 / 2) - (r23 / 2);
        int r32 = r3 - (r42 / 2);
        r1.layout(r52, r32, r23 + r52, r42 + r32);
        return;
    L32:
        int r112 = r11 - (r10 ^ 1);
        if (r112 <= 0) goto L36;
        int r43 = r6 / r112;
    L37:
        int r44 = Math.max(0, r43);
        if (r72 == false) goto L48;
        int r62 = getWidth() - getPaddingRight();
        int r82 = 0;
    L40:
        if (r82 >= r2) goto L57;
        View r53 = getChildAt(r82);
        C0910k r73 = (C0910k) r53.getLayoutParams();
        if (r53.getVisibility() == 8) goto L47;
        if (r73.f3225a == true) goto L47;
        int r63 = r62 - ((LinearLayout.LayoutParams) r73).rightMargin;
        int r92 = r53.getMeasuredWidth();
        int r103 = r53.getMeasuredHeight();
        int r113 = r3 - (r103 / 2);
        r53.layout(r63 - r92, r113, r63, r103 + r113);
        r62 = r63 - ((r92 + ((LinearLayout.LayoutParams) r73).leftMargin) + r44);
    L47:
        r82 = r82 + 1;
        goto L40
    L57:
        return;
    L48:
        int r64 = getPaddingLeft();
        int r83 = 0;
    L49:
        if (r83 >= r2) goto L70;
        View r54 = getChildAt(r83);
        C0910k r74 = (C0910k) r54.getLayoutParams();
        if (r54.getVisibility() == 8) goto L56;
        if (r74.f3225a == true) goto L56;
        int r65 = r64 + ((LinearLayout.LayoutParams) r74).leftMargin;
        int r93 = r54.getMeasuredWidth();
        int r104 = r54.getMeasuredHeight();
        int r114 = r3 - (r104 / 2);
        r54.layout(r65, r114, r65 + r93, r104 + r114);
        r64 = ((r93 + ((LinearLayout.LayoutParams) r74).rightMargin) + r44) + r65;
    L56:
        r83 = r83 + 1;
        goto L49
    L70:
        return;
    L36:
        r43 = 0;
        goto L37
    L9:
        r72 = false;
        goto L10
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // p057g.AbstractC0903g0, android.view.View
    public final void onMeasure(int r33, int r34) {
        boolean r1 = this.f1147v;
        if (View.MeasureSpec.getMode(r33) != 1073741824) goto L5;
        boolean r2 = true;
    L6:
        this.f1147v = r2;
        if (r1 == r2) goto L9;
        this.f1148w = 0;
    L9:
        int r12 = View.MeasureSpec.getSize(r33);
        if (this.f1147v == false) goto L16;
        MenuC0779j r22 = this.f1141p;
        if (r22 == null) goto L16;
        if (r12 == this.f1148w) goto L16;
        this.f1148w = r12;
        r22.m2009o(true);
    L16:
        int r13 = getChildCount();
        if (this.f1147v == false) goto L189;
        if (r13 <= 0) goto L189;
        int r14 = View.MeasureSpec.getMode(r34);
        int r23 = View.MeasureSpec.getSize(r33);
        int r6 = View.MeasureSpec.getSize(r34);
        int r8 = getPaddingRight() + getPaddingLeft();
        int r9 = getPaddingBottom() + getPaddingTop();
        int r7 = ViewGroup.getChildMeasureSpec(r34, r9, -2);
        int r24 = r23 - r8;
        int r82 = this.f1149x;
        int r10 = r24 / r82;
        int r11 = r24 % r82;
        if (r10 != 0) goto L22;
        setMeasuredDimension(r24, 0);
        return;
    L22:
        int r112 = (r11 / r10) + r82;
        int r83 = getChildCount();
        int r122 = 0;
        int r132 = 0;
        int r142 = 0;
        boolean r15 = false;
        int r18 = 0;
        int r19 = 0;
        long r16 = 0;
    L23:
        int r5 = this.f1150y;
        if (r142 >= r83) goto L78;
        View r4 = getChildAt(r142);
        int r21 = r6;
        if (r4.getVisibility() != 8) goto L28;
        int r242 = r24;
        int r222 = r9;
    L77:
        r142 = r142 + 1;
        r6 = r21;
        r9 = r222;
        r24 = r242;
        goto L23
    L28:
        boolean r3 = r4 instanceof ActionMenuItemView;
        int r123 = r122 + 1;
        if (r3 == false) goto L31;
        r4.setPadding(r5, 0, r5, 0);
    L31:
        C0910k r52 = (C0910k) r4.getLayoutParams();
        r52.f3230f = false;
        r52.f3227c = 0;
        r52.f3226b = 0;
        r52.f3228d = false;
        ((LinearLayout.LayoutParams) r52).leftMargin = 0;
        ((LinearLayout.LayoutParams) r52).rightMargin = 0;
        if (r3 == true) goto L34;
    L36:
        boolean r62 = false;
    L37:
        r52.f3229e = r62;
        if (r52.f3225a == false) goto L40;
        int r63 = 1;
    L41:
        C0910k r124 = (C0910k) r4.getLayoutParams();
        r242 = r24;
        r222 = r9;
        int r25 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(r7) - r9, View.MeasureSpec.getMode(r7));
        if (r3 == false) goto L44;
        ActionMenuItemView r32 = (ActionMenuItemView) r4;
    L45:
        if (r32 != null) goto L47;
    L49:
        boolean r35 = false;
    L50:
        if (r63 <= 0) goto L61;
        if (r35 == true) goto L53;
    L54:
        r4.measure(View.MeasureSpec.makeMeasureSpec(r63 * r112, Integer.MIN_VALUE), r25);
        int r64 = r4.getMeasuredWidth();
        int r92 = r64 / r112;
        if ((r64 % r112) == 0) goto L57;
        r92 = r92 + 1;
    L57:
        if (r35 == false) goto L63;
        if (r92 >= 2) goto L63;
        r92 = 2;
    L63:
        if (r124.f3225a == true) goto L66;
        if (r35 == false) goto L66;
        boolean r36 = true;
    L67:
        r124.f3228d = r36;
        r124.f3226b = r92;
        r4.measure(View.MeasureSpec.makeMeasureSpec(r92 * r112, 1073741824), r25);
        r132 = Math.max(r132, r92);
        if (r52.f3228d == false) goto L71;
        r18 = r18 + 1;
    L71:
        if (r52.f3225a == false) goto L73;
        r15 = true;
    L73:
        r10 = r10 - r92;
        r19 = Math.max(r19, r4.getMeasuredHeight());
        if (r92 != 1) goto L76;
        r16 = r16 | ((long) (1 << r142));
    L76:
        r122 = r123;
    L66:
        r36 = false;
        goto L67
    L53:
        if (r63 >= 2) goto L54;
    L61:
        r92 = 0;
        goto L63
    L47:
        if ((!TextUtils.isEmpty(r32.getText())) == false) goto L49;
        r35 = true;
        goto L50
    L44:
        r32 = null;
        goto L45
    L40:
        r63 = r10;
        goto L41
    L34:
        if ((!TextUtils.isEmpty(((ActionMenuItemView) r4).getText())) == false) goto L36;
        r62 = true;
        goto L37
    L78:
        int r243 = r24;
        int r212 = r6;
        int r37 = r19;
        if (r15 == true) goto L81;
    L83:
        boolean r26 = false;
    L84:
        boolean r42 = false;
    L86:
        if (r18 <= 0) goto L120;
        if (r10 <= 0) goto L120;
        int r65 = Integer.MAX_VALUE;
        int r93 = 0;
        int r143 = 0;
        long r252 = 0;
    L89:
        if (r143 >= r83) goto L99;
        int r27 = r37;
        C0910k r38 = (C0910k) getChildAt(r143).getLayoutParams();
        boolean r192 = r42;
        if (r38.f3228d == false) goto L98;
        int r39 = r38.f3226b;
        if (r39 >= r65) goto L96;
        r252 = 1 << r143;
        r65 = r39;
        r93 = 1;
        goto L98
    L96:
        if (r39 != r65) goto L98;
        r93 = r93 + 1;
        r252 = r252 | (1 << r143);
    L98:
        r143 = r143 + 1;
        r42 = r192;
        r37 = r27;
        goto L89
    L99:
        int r272 = r37;
        boolean r193 = r42;
        r16 = r16 | r252;
        if (r93 > r10) goto L101;
        int r66 = r65 + 1;
        int r310 = 0;
    L104:
        if (r310 >= r83) goto L119;
        View r43 = getChildAt(r310);
        C0910k r94 = (C0910k) r43.getLayoutParams();
        int r28 = r14;
        int r144 = r7;
        int r29 = r83;
        long r72 = 1 << r310;
        if ((r252 & r72) == 0) goto L108;
        if (r26 == true) goto L112;
    L116:
        ?? r17 = 1;
    L117:
        r94.f3226b += r17;
        r94.f3230f = r17;
        r10 = r10 - 1;
    L118:
        r310 = r310 + 1;
        r7 = r144;
        r14 = r28;
        r83 = r29;
        goto L104
    L112:
        if (r94.f3229e == false) goto L116;
        r17 = 1;
        r17 = 1;
        if (r10 != 1) goto L117;
        r43.setPadding(r5 + r112, 0, r5, 0);
        goto L117
    L108:
        if (r94.f3226b != r66) goto L118;
        r16 = r16 | r72;
        goto L118
    L119:
        r37 = r272;
        r42 = true;
        goto L86
    L101:
        int r282 = r14;
    L102:
        int r145 = r7;
        int r292 = r83;
        if (r15 == true) goto L125;
        if (r122 != 1) goto L125;
        boolean r210 = true;
    L126:
        if (r10 > 0) goto L128;
    L134:
        int r211 = r292;
    L176:
        if (r193 == false) goto L185;
        int r311 = 0;
    L178:
        if (r311 >= r211) goto L185;
        View r110 = getChildAt(r311);
        C0910k r44 = (C0910k) r110.getLayoutParams();
        if (r44.f3230f == true) goto L182;
        int r67 = r145;
    L183:
        r311 = r311 + 1;
        r145 = r67;
        goto L178
    L182:
        r67 = r145;
        r110.measure(View.MeasureSpec.makeMeasureSpec((r44.f3226b * r112) + r44.f3227c, 1073741824), r67);
    L185:
        if (r282 == 1073741824) goto L187;
        int r213 = r243;
        int r68 = r272;
    L188:
        setMeasuredDimension(r213, r68);
        return;
    L187:
        r68 = r212;
        r213 = r243;
        goto L188
    L128:
        if (r16 == 0) goto L134;
        if (r10 < (r122 - 1)) goto L135;
        if (r210 == true) goto L135;
        if (r132 <= 1) goto L134;
    L135:
        float r111 = Long.bitCount(r16);
        if (r210 == true) goto L148;
        if ((r16 & 1) != 0) goto L140;
    L142:
        int r84 = r292 - 1;
        if ((r16 & ((long) (1 << r84))) == 0) goto L148;
        if (((C0910k) getChildAt(r84).getLayoutParams()).f3229e == true) goto L148;
        r111 = r111 - 0.5f;
        goto L148
    L140:
        if (((C0910k) getChildAt(0).getLayoutParams()).f3229e == true) goto L142;
        r111 = r111 - 0.5f;
    L148:
        if (r111 <= 0.0f) goto L150;
        int r69 = (int) ((r10 * r112) / r111);
    L151:
        r211 = r292;
        int r113 = 0;
    L152:
        if (r113 >= r211) goto L176;
        if ((r16 & ((long) (1 << r113))) == 0) goto L174;
        View r312 = getChildAt(r113);
        C0910k r45 = (C0910k) r312.getLayoutParams();
        if ((r312 instanceof ActionMenuItemView) == false) goto L166;
        r45.f3227c = r69;
        r45.f3230f = true;
        if (r113 != 0) goto L164;
        if (r45.f3229e == true) goto L164;
        ((LinearLayout.LayoutParams) r45).leftMargin = (-r69) / 2;
    L164:
        r193 = true;
        goto L174
    L166:
        if (r45.f3225a == false) goto L169;
        r45.f3227c = r69;
        r45.f3230f = true;
        ((LinearLayout.LayoutParams) r45).rightMargin = (-r69) / 2;
        r193 = true;
        goto L174
    L169:
        if (r113 == 0) goto L172;
        ((LinearLayout.LayoutParams) r45).leftMargin = r69 / 2;
    L172:
        if (r113 == (r211 - 1)) goto L174;
        ((LinearLayout.LayoutParams) r45).rightMargin = r69 / 2;
    L174:
        r113 = r113 + 1;
        goto L152
    L150:
        r69 = 0;
    L125:
        r210 = false;
    L120:
        r282 = r14;
        r272 = r37;
        r193 = r42;
        goto L102
    L81:
        if (r122 != 2) goto L83;
        r26 = true;
    L189:
        int r610 = 0;
    L190:
        if (r610 >= r13) goto L192;
        C0910k r214 = (C0910k) getChildAt(r610).getLayoutParams();
        ((LinearLayout.LayoutParams) r214).rightMargin = 0;
        ((LinearLayout.LayoutParams) r214).leftMargin = 0;
        r610 = r610 + 1;
        goto L190
    L192:
        super.onMeasure(r33, r34);
        return;
    L5:
        r2 = false;
        goto L6
    }

    public void setExpandedActionViewsExclusive(boolean r2) {
        this.f1144s.f3218p = r2;
    }

    public void setOnMenuItemClickListener(InterfaceC0912l r1) {
        this.f1151z = r1;
    }

    public void setOverflowIcon(Drawable r3) {
        getMenu();
        C0906i r02 = this.f1144s;
        C0904h r1 = r02.f3210h;
        if (r1 == null) goto L5;
        r1.setImageDrawable(r3);
        return;
    L5:
        r02.f3212j = true;
        r02.f3211i = r3;
    }

    public void setOverflowReserved(boolean r1) {
    }

    public void setPopupTheme(int r3) {
        if (this.f1143r == r3) goto L9;
        this.f1143r = r3;
        if (r3 != 0) goto L7;
        this.f1142q = getContext();
        return;
    L7:
        this.f1142q = new ContextThemeWrapper(getContext(), r3);
        return;
    }

    public void setPresenter(C0906i r1) {
        this.f1144s = r1;
        r1.f3209g = this;
        this.f1141p = r1.f3205c;
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new C0910k(getContext(), r3);
    }
}
