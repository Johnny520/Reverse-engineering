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
import defpackage.cb0;
import defpackage.d70;
import defpackage.f1;
import defpackage.fv;
import defpackage.i1;
import defpackage.j1;
import defpackage.ju;
import defpackage.k1;
import defpackage.ku;
import defpackage.l0;
import defpackage.l1;
import defpackage.m1;
import defpackage.ou;
import defpackage.sq;
import defpackage.tq;
import defpackage.vh;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends tq implements ju, fv {
    public ku p;
    public Context q;
    public int r;
    public boolean s;
    public j1 t;
    public d70 u;
    public boolean v;
    public int w;
    public final int x;
    public final int y;
    public m1 z;

    public ActionMenuView(Context r3, AttributeSet r4) {
        super(r3, r4, 0);
        setBaselineAligned(false);
        float r42 = r3.getResources().getDisplayMetrics().density;
        this.x = (int) (56.0f * r42);
        this.y = (int) (r42 * 4.0f);
        this.q = r3;
        this.r = 0;
    }

    public static l1 j() {
        l1 r0 = new l1(-2, -2);
        r0.a = false;
        ((LinearLayout.LayoutParams) r0).gravity = 16;
        return r0;
    }

    public static l1 k(ViewGroup.LayoutParams r1) {
        if (r1 == null) goto L12;
        if ((r1 instanceof l1) == false) goto L6;
        l1 r12 = (l1) r1;
        l1 r0 = new l1(r12);
        r0.a = r12.a;
    L8:
        if (((LinearLayout.LayoutParams) r0).gravity > 0) goto L10;
        ((LinearLayout.LayoutParams) r0).gravity = 16;
    L10:
        return r0;
    L6:
        r0 = new l1(r1);
        goto L8
    L12:
        return j();
    }

    @Override // defpackage.ju
    public final boolean a(ou r4) {
        return this.p.q(r4, null, 0);
    }

    @Override // defpackage.fv
    public final void b(ku r1) {
        this.p = r1;
    }

    @Override // defpackage.tq, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof l1;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        return false;
    }

    @Override // defpackage.tq
    public final /* bridge */ /* synthetic */ sq f() {
        return j();
    }

    @Override // defpackage.tq
    public final sq g(AttributeSet r3) {
        return new l1(getContext(), r3);
    }

    @Override // defpackage.tq, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.tq, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return k(r1);
    }

    public Menu getMenu() {
        if (this.p != null) goto L6;
        Context r0 = getContext();
        ku r1 = new ku(r0);
        this.p = r1;
        r1.e = new l0(2, this);
        j1 r12 = new j1(r0);
        this.t = r12;
        r12.l = true;
        r12.m = true;
        r12.e = new vh(13);
        this.p.b(r12, this.q);
        j1 r02 = this.t;
        r02.h = this;
        this.p = r02.c;
    L6:
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        j1 r0 = this.t;
        i1 r1 = r0.i;
        if (r1 == null) goto L7;
        return r1.getDrawable();
    L7:
        if (r0.k == true) goto L9;
        return null;
    L9:
        return r0.j;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.tq
    public final /* bridge */ /* synthetic */ sq h(ViewGroup.LayoutParams r1) {
        return k(r1);
    }

    public final boolean l(int r5) {
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
        if ((r2 instanceof k1) == false) goto L15;
        return ((k1) r2).b() | r0;
    L8:
        if ((r1 instanceof k1) == false) goto L10;
        r0 = ((k1) r1).a();
        goto L10
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        j1 r12 = this.t;
        if (r12 == null) goto L8;
        r12.h();
        if (this.t.j() == false) goto L9;
        this.t.f();
        this.t.l();
        return;
    L9:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j1 r0 = this.t;
        if (r0 == null) goto L10;
        r0.f();
        f1 r02 = r0.t;
        if (r02 != null) goto L7;
        return;
    L7:
        if (r02.b() == false) goto L12;
        r02.i.dismiss();
        return;
    L12:
        return;
    }

    @Override // defpackage.tq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        if (this.v == true) goto L6;
        super.onLayout(r18, r19, r20, r21, r22);
        return;
    L6:
        int r1 = getChildCount();
        int r2 = (r22 - r20) / 2;
        int r3 = getDividerWidth();
        int r4 = r21 - r19;
        int r5 = (r4 - getPaddingRight()) - getPaddingLeft();
        boolean r6 = cb0.a(this);
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
    L8:
        if (r8 >= r1) goto L24;
        View r13 = getChildAt(r8);
        if (r13.getVisibility() == 8) goto L23;
        l1 r11 = (l1) r13.getLayoutParams();
        if (r11.a == false) goto L22;
        int r92 = r13.getMeasuredWidth();
        if (l(r8) == false) goto L17;
        r92 = r92 + r3;
    L17:
        int r14 = r13.getMeasuredHeight();
        if (r6 == false) goto L20;
        int r15 = getPaddingLeft() + ((LinearLayout.LayoutParams) r11).leftMargin;
        int r112 = r15 + r92;
    L21:
        int r7 = r2 - (r14 / 2);
        r13.layout(r15, r7, r112, r14 + r7);
        r5 = r5 - r92;
        r9 = 1;
        goto L23
    L20:
        r112 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) r11).rightMargin;
        r15 = r112 - r92;
        goto L21
    L22:
        r5 = r5 - ((r13.getMeasuredWidth() + ((LinearLayout.LayoutParams) r11).leftMargin) + ((LinearLayout.LayoutParams) r11).rightMargin);
        l(r8);
        r10 = r10 + 1;
    L23:
        r8 = r8 + 1;
        goto L8
    L24:
        if (r1 != 1) goto L28;
        if (r9 != 0) goto L28;
        View r12 = getChildAt(0);
        int r32 = r12.getMeasuredWidth();
        int r52 = r12.getMeasuredHeight();
        int r42 = (r4 / 2) - (r32 / 2);
        int r23 = r2 - (r52 / 2);
        r12.layout(r42, r23, r32 + r42, r52 + r23);
        return;
    L28:
        int r102 = r10 - (r9 ^ 1);
        if (r102 <= 0) goto L32;
        int r33 = r5 / r102;
    L33:
        int r34 = Math.max(0, r33);
        if (r6 == false) goto L44;
        int r53 = getWidth() - getPaddingRight();
        int r72 = 0;
    L36:
        if (r72 >= r1) goto L53;
        View r43 = getChildAt(r72);
        l1 r62 = (l1) r43.getLayoutParams();
        if (r43.getVisibility() == 8) goto L43;
        if (r62.a == true) goto L43;
        int r54 = r53 - ((LinearLayout.LayoutParams) r62).rightMargin;
        int r82 = r43.getMeasuredWidth();
        int r93 = r43.getMeasuredHeight();
        int r103 = r2 - (r93 / 2);
        r43.layout(r54 - r82, r103, r54, r93 + r103);
        r53 = r54 - ((r82 + ((LinearLayout.LayoutParams) r62).leftMargin) + r34);
    L43:
        r72 = r72 + 1;
        goto L36
    L53:
        return;
    L44:
        int r55 = getPaddingLeft();
        int r73 = 0;
    L45:
        if (r73 >= r1) goto L66;
        View r44 = getChildAt(r73);
        l1 r63 = (l1) r44.getLayoutParams();
        if (r44.getVisibility() == 8) goto L52;
        if (r63.a == true) goto L52;
        int r56 = r55 + ((LinearLayout.LayoutParams) r63).leftMargin;
        int r83 = r44.getMeasuredWidth();
        int r94 = r44.getMeasuredHeight();
        int r104 = r2 - (r94 / 2);
        r44.layout(r56, r104, r56 + r83, r94 + r104);
        r55 = ((r83 + ((LinearLayout.LayoutParams) r63).rightMargin) + r34) + r56;
    L52:
        r73 = r73 + 1;
        goto L45
    L66:
        return;
    L32:
        r33 = 0;
        goto L33
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.tq, android.view.View
    public final void onMeasure(int r31, int r32) {
        boolean r1 = this.v;
        if (View.MeasureSpec.getMode(r31) != 1073741824) goto L5;
        boolean r2 = true;
    L6:
        this.v = r2;
        if (r1 == r2) goto L9;
        this.w = 0;
    L9:
        int r12 = View.MeasureSpec.getSize(r31);
        if (this.v == false) goto L16;
        ku r22 = this.p;
        if (r22 == null) goto L16;
        if (r12 == this.w) goto L16;
        this.w = r12;
        r22.p(true);
    L16:
        int r13 = getChildCount();
        if (this.v == false) goto L188;
        if (r13 <= 0) goto L188;
        int r14 = View.MeasureSpec.getMode(r32);
        int r23 = View.MeasureSpec.getSize(r31);
        int r6 = View.MeasureSpec.getSize(r32);
        int r8 = getPaddingRight() + getPaddingLeft();
        int r9 = getPaddingBottom() + getPaddingTop();
        int r7 = ViewGroup.getChildMeasureSpec(r32, r9, -2);
        int r24 = r23 - r8;
        int r82 = this.x;
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
        int r5 = this.y;
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
        l1 r52 = (l1) r4.getLayoutParams();
        r52.f = false;
        r52.c = 0;
        r52.b = 0;
        r52.d = false;
        ((LinearLayout.LayoutParams) r52).leftMargin = 0;
        ((LinearLayout.LayoutParams) r52).rightMargin = 0;
        if (r62 == true) goto L35;
    L37:
        boolean r92 = false;
    L38:
        r52.e = r92;
        if (r52.a == false) goto L41;
        int r93 = 1;
    L42:
        l1 r63 = (l1) r4.getLayoutParams();
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
        if (r63.a == true) goto L68;
        if (r242 == false) goto L68;
        boolean r95 = true;
    L69:
        r63.d = r95;
        r63.b = r115;
        r4.measure(View.MeasureSpec.makeMeasureSpec(r115 * r232, 1073741824), r102);
        r132 = Math.max(r132, r115);
        if (r52.d == false) goto L73;
        r16 = r16 + 1;
    L73:
        if (r52.a == false) goto L75;
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
        l1 r33 = (l1) getChildAt(r143).getLayoutParams();
        boolean r223 = r42;
        if (r33.d == false) goto L99;
        int r34 = r33.b;
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
        l1 r65 = (l1) r43.getLayoutParams();
        boolean r29 = r15;
        long r144 = 1 << r35;
        if ((r26 & r144) == 0) goto L108;
        if (r224 == true) goto L112;
    L116:
        ?? r117 = 1;
    L117:
        r65.b += r117;
        r65.f = r117;
        r103 = r103 - 1;
    L118:
        r35 = r35 + 1;
        r15 = r29;
        goto L104
    L112:
        if (r65.e == false) goto L116;
        r117 = 1;
        r117 = 1;
        if (r103 != 1) goto L117;
        r43.setPadding(r5 + r233, 0, r5, 0);
        goto L117
    L108:
        if (r65.b != r97) goto L118;
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
        l1 r53 = (l1) r37.getLayoutParams();
        if (r53.f == false) goto L181;
        r37.measure(View.MeasureSpec.makeMeasureSpec((r53.b * r233) + r53.c, 1073741824), r7);
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
        if (((l1) getChildAt(r38).getLayoutParams()).e == true) goto L146;
        r45 = r45 - 0.5f;
        goto L146
    L138:
        if (((l1) getChildAt(0).getLayoutParams()).e == true) goto L140;
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
        l1 r67 = (l1) r54.getLayoutParams();
        if ((r54 instanceof ActionMenuItemView) == false) goto L164;
        r67.c = r98;
        r67.f = true;
        if (r39 != 0) goto L162;
        if (r67.e == true) goto L162;
        ((LinearLayout.LayoutParams) r67).leftMargin = (-r98) / 2;
    L162:
        r46 = true;
        goto L172
    L164:
        if (r67.a == false) goto L167;
        r67.c = r98;
        r67.f = true;
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
        l1 r27 = (l1) getChildAt(r99).getLayoutParams();
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
        this.t.q = r2;
    }

    public void setOnMenuItemClickListener(m1 r1) {
        this.z = r1;
    }

    public void setOverflowIcon(Drawable r3) {
        getMenu();
        j1 r0 = this.t;
        i1 r1 = r0.i;
        if (r1 == null) goto L6;
        r1.setImageDrawable(r3);
        return;
    L6:
        r0.k = true;
        r0.j = r3;
    }

    public void setOverflowReserved(boolean r1) {
        this.s = r1;
    }

    public void setPopupTheme(int r3) {
        if (this.r == r3) goto L10;
        this.r = r3;
        if (r3 != 0) goto L8;
        this.q = getContext();
        return;
    L8:
        this.q = new ContextThemeWrapper(getContext(), r3);
        return;
    }

    public void setPresenter(j1 r1) {
        this.t = r1;
        r1.h = this;
        this.p = r1.c;
    }

    @Override // defpackage.tq, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new l1(getContext(), r3);
    }
}
