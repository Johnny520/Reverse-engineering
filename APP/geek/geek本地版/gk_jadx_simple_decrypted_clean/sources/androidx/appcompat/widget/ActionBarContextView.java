package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import defpackage.cb0;
import defpackage.f1;
import defpackage.ff;
import defpackage.fv;
import defpackage.j1;
import defpackage.ja0;
import defpackage.ku;
import defpackage.n1;
import defpackage.s90;
import defpackage.wa0;
import defpackage.x0;
import defpackage.xy;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final defpackage.a a;
    public final Context b;
    public ActionMenuView c;
    public j1 d;
    public int e;
    public wa0 f;
    public boolean g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public View k;
    public View l;
    public View m;
    public LinearLayout n;
    public TextView o;
    public TextView p;
    public final int q;
    public final int r;
    public boolean s;
    public final int t;

    public ActionBarContextView(Context r6, AttributeSet r7) {
        super(r6, r7, R.attr.actionModeStyle);
        this.a = new defpackage.a(this);
        TypedValue r1 = new TypedValue();
        if (r6.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, r1, true) == true) goto L5;
    L7:
        this.b = r6;
    L8:
        TypedArray r72 = r6.obtainStyledAttributes(r7, xy.d, R.attr.actionModeStyle, 0);
        if (r72.hasValue(0) == false) goto L13;
        int r0 = r72.getResourceId(0, 0);
        if (r0 == 0) goto L13;
        Drawable r62 = ff.r(r6, r0);
    L14:
        WeakHashMap r02 = ja0.a;
        s90.q(this, r62);
        this.q = r72.getResourceId(5, 0);
        this.r = r72.getResourceId(4, 0);
        this.e = r72.getLayoutDimension(3, 0);
        this.t = r72.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        r72.recycle();
        return;
    L13:
        r62 = r72.getDrawable(0);
        goto L14
    L5:
        if (r1.resourceId == 0) goto L7;
        this.b = new ContextThemeWrapper(r6, r1.resourceId);
        goto L8
    }

    public static /* synthetic */ void a(ActionBarContextView r1) {
        super.setVisibility(0);
    }

    public static /* synthetic */ void b(ActionBarContextView r0, int r1) {
        super.setVisibility(r1);
    }

    public static int f(View r1, int r2, int r3) {
        r1.measure(View.MeasureSpec.makeMeasureSpec(r2, Integer.MIN_VALUE), r3);
        return Math.max(0, r2 - r1.getMeasuredWidth());
    }

    public static int g(View r2, int r3, int r4, int r5, boolean r6) {
        int r0 = r2.getMeasuredWidth();
        int r1 = r2.getMeasuredHeight();
        int r52 = ((r5 - r1) / 2) + r4;
        if (r6 == false) goto L5;
        r2.layout(r3 - r0, r52, r3, r1 + r52);
    L6:
        if (r6 == true) goto L8;
        return r0;
    L8:
        return -r0;
    L5:
        r2.layout(r3, r52, r3 + r0, r1 + r52);
        goto L6
    }

    public final void c(n1 r6) {
        View r0 = this.k;
        int r1 = 0;
        if (r0 != null) goto L6;
        View r02 = LayoutInflater.from(getContext()).inflate(this.t, this, false);
        this.k = r02;
        addView(r02);
    L8:
        View r03 = this.k.findViewById(R.id.action_mode_close_button);
        this.l = r03;
        r03.setOnClickListener(new x0(r1, r6));
        ku r62 = r6.c();
        j1 r04 = this.d;
        if (r04 == null) goto L15;
        r04.f();
        f1 r05 = r04.t;
        if (r05 == null) goto L15;
        if (r05.b() == false) goto L15;
        r05.i.dismiss();
    L15:
        j1 r06 = new j1(getContext());
        this.d = r06;
        r06.l = true;
        r06.m = true;
        ViewGroup.LayoutParams r07 = new ViewGroup.LayoutParams(-2, -1);
        r62.b(this.d, this.b);
        j1 r63 = this.d;
        fv r2 = r63.h;
        if (r2 != null) goto L18;
        fv r12 = (fv) r63.d.inflate(r63.f, this, false);
        r63.h = r12;
        r12.b(r63.c);
        r63.h();
    L18:
        fv r13 = r63.h;
        if (r2 == r13) goto L21;
        ((ActionMenuView) r13).setPresenter(r63);
    L21:
        ActionMenuView r14 = (ActionMenuView) r13;
        this.c = r14;
        WeakHashMap r64 = ja0.a;
        s90.q(r14, null);
        addView(this.c, r07);
        return;
    L6:
        if (r0.getParent() != null) goto L8;
        addView(this.k);
        goto L8
    }

    public final void d() {
        if (this.n != null) goto L10;
        LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
        LinearLayout r0 = (LinearLayout) getChildAt(getChildCount() - 1);
        this.n = r0;
        this.o = (TextView) r0.findViewById(R.id.action_bar_title);
        this.p = (TextView) this.n.findViewById(R.id.action_bar_subtitle);
        int r02 = this.q;
        if (r02 == 0) goto L7;
        this.o.setTextAppearance(getContext(), r02);
    L7:
        int r03 = this.r;
        if (r03 == 0) goto L10;
        this.p.setTextAppearance(getContext(), r03);
    L10:
        this.o.setText(this.i);
        this.p.setText(this.j);
        boolean r04 = TextUtils.isEmpty(this.i);
        boolean r1 = TextUtils.isEmpty(this.j);
        TextView r2 = this.p;
        int r3 = 8;
        if (r1 == true) goto L13;
        int r5 = 0;
    L14:
        r2.setVisibility(r5);
        LinearLayout r22 = this.n;
        if (r04 == false) goto L17;
        if (r1 == false) goto L17;
    L18:
        r22.setVisibility(r3);
        if (this.n.getParent() != null) goto L22;
        addView(this.n);
        return;
    L22:
        return;
    L17:
        r3 = 0;
        goto L18
    L13:
        r5 = 8;
        goto L14
    }

    public final void e() {
        removeAllViews();
        this.m = null;
        this.c = null;
        this.d = null;
        View r1 = this.l;
        if (r1 == null) goto L6;
        r1.setOnClickListener(null);
        return;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new ViewGroup.MarginLayoutParams(getContext(), r3);
    }

    public int getAnimatedVisibility() {
        if (this.f == null) goto L7;
        return this.a.b;
    L7:
        return getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    public final void h(int r2) {
        if (r2 == getVisibility()) goto L9;
        wa0 r0 = this.f;
        if (r0 == null) goto L7;
        r0.b();
    L7:
        super.setVisibility(r2);
        return;
    }

    public final wa0 i(int r4, long r5) {
        wa0 r0 = this.f;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        defpackage.a r02 = this.a;
        if (r4 == 0) goto L8;
        wa0 r2 = ja0.a(this);
        r2.a(0.0f);
        r2.c(r5);
        r02.c.f = r2;
        r02.b = r4;
        r2.d(r02);
        return r2;
    L8:
        if (getVisibility() == 0) goto L10;
        setAlpha(0.0f);
    L10:
        wa0 r1 = ja0.a(this);
        r1.a(1.0f);
        r1.c(r5);
        r02.c.f = r1;
        r02.b = r4;
        r1.d(r02);
        return r1;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r5) {
        super.onConfigurationChanged(r5);
        TypedArray r52 = getContext().obtainStyledAttributes(null, xy.a, R.attr.actionBarStyle, 0);
        setContentHeight(r52.getLayoutDimension(13, 0));
        r52.recycle();
        j1 r53 = this.d;
        if (r53 == null) goto L31;
        Configuration r0 = r53.b.getResources().getConfiguration();
        int r1 = r0.screenWidthDp;
        int r2 = r0.screenHeightDp;
        if (r0.smallestScreenWidthDp > 600) goto L26;
        if (r1 > 600) goto L26;
        if (r1 <= 960) goto L10;
        if (r2 > 720) goto L26;
    L10:
        if (r1 <= 720) goto L14;
        if (r2 > 960) goto L26;
    L14:
        if (r1 < 500) goto L16;
    L25:
        int r02 = 4;
    L27:
        r53.p = r02;
        ku r54 = r53.c;
        if (r54 == null) goto L32;
        r54.p(true);
        return;
    L32:
        return;
    L16:
        if (r1 <= 640) goto L18;
        if (r2 > 480) goto L25;
    L18:
        if (r1 <= 480) goto L22;
        if (r2 > 640) goto L25;
    L22:
        if (r1 < 360) goto L24;
        r02 = 3;
        goto L27
    L24:
        r02 = 2;
    L26:
        r02 = 5;
        goto L27
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j1 r0 = this.d;
        if (r0 == null) goto L10;
        r0.f();
        f1 r02 = this.d.t;
        if (r02 != null) goto L7;
        return;
    L7:
        if (r02.b() == false) goto L12;
        r02.i.dismiss();
        return;
    L12:
        return;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent r6) {
        int r0 = r6.getActionMasked();
        if (r0 != 9) goto L6;
        this.h = false;
    L6:
        if (this.h == true) goto L12;
        boolean r62 = super.onHoverEvent(r6);
        if (r0 != 9) goto L12;
        if (r62 == true) goto L12;
        this.h = true;
    L12:
        if (r0 != 10) goto L14;
    L17:
        this.h = false;
        return true;
    L14:
        if (r0 == 3) goto L17;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        boolean r52 = cb0.a(this);
        if (r52 == false) goto L5;
        int r0 = (r8 - r6) - getPaddingRight();
    L6:
        int r1 = getPaddingTop();
        int r92 = ((r9 - r7) - getPaddingTop()) - getPaddingBottom();
        View r72 = this.k;
        if (r72 != null) goto L9;
    L25:
        LinearLayout r73 = this.n;
        if (r73 != null) goto L28;
    L32:
        View r74 = this.m;
        if (r74 == null) goto L35;
        g(r74, r0, r1, r92, r52);
    L35:
        if (r52 == false) goto L37;
        int r62 = getPaddingLeft();
    L38:
        ActionMenuView r75 = this.c;
        if (r75 == null) goto L42;
        g(r75, r62, r1, r92, !r52);
        return;
    L42:
        return;
    L37:
        r62 = (r8 - r6) - getPaddingRight();
        goto L38
    L28:
        if (this.m != null) goto L32;
        if (r73.getVisibility() == 8) goto L32;
        r0 = r0 + g(this.n, r0, r1, r92, r52);
        goto L32
    L9:
        if (r72.getVisibility() == 8) goto L25;
        ViewGroup.MarginLayoutParams r76 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        if (r52 == false) goto L13;
        int r3 = r76.rightMargin;
    L14:
        if (r52 == false) goto L16;
        int r77 = r76.leftMargin;
    L17:
        if (r52 == false) goto L19;
        int r02 = r0 - r3;
    L20:
        int r32 = g(this.k, r02, r1, r92, r52) + r02;
        if (r52 == false) goto L24;
        int r33 = r32 - r77;
    L23:
        r0 = r33;
        goto L25
    L24:
        r33 = r32 + r77;
        goto L23
    L19:
        r02 = r0 + r3;
        goto L20
    L16:
        r77 = r76.rightMargin;
        goto L17
    L13:
        r3 = r76.leftMargin;
        goto L14
    L5:
        r0 = getPaddingLeft();
        goto L6
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
        int r1 = 1073741824;
        if (View.MeasureSpec.getMode(r11) != 1073741824) goto L66;
        if (View.MeasureSpec.getMode(r12) == 0) goto L64;
        int r112 = View.MeasureSpec.getSize(r11);
        int r0 = this.e;
        if (r0 > 0) goto L10;
        r0 = View.MeasureSpec.getSize(r12);
    L10:
        int r2 = getPaddingBottom() + getPaddingTop();
        int r122 = (r112 - getPaddingLeft()) - getPaddingRight();
        int r3 = r0 - r2;
        int r5 = View.MeasureSpec.makeMeasureSpec(r3, Integer.MIN_VALUE);
        View r6 = this.k;
        if (r6 == null) goto L13;
        int r123 = f(r6, r122, r5);
        ViewGroup.MarginLayoutParams r62 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        r122 = r123 - (r62.leftMargin + r62.rightMargin);
    L13:
        ActionMenuView r63 = this.c;
        if (r63 != null) goto L16;
    L18:
        LinearLayout r64 = this.n;
        int r7 = 0;
        if (r64 != null) goto L21;
    L36:
        View r52 = this.m;
        if (r52 == null) goto L52;
        ViewGroup.LayoutParams r53 = r52.getLayoutParams();
        int r65 = r53.width;
        if (r65 == (-2)) goto L41;
        int r9 = 1073741824;
    L42:
        if (r65 < 0) goto L44;
        r122 = Math.min(r65, r122);
    L44:
        int r54 = r53.height;
        if (r54 != (-2)) goto L48;
        r1 = Integer.MIN_VALUE;
    L48:
        if (r54 < 0) goto L50;
        r3 = Math.min(r54, r3);
    L50:
        this.m.measure(View.MeasureSpec.makeMeasureSpec(r122, r9), View.MeasureSpec.makeMeasureSpec(r3, r1));
        goto L52
    L41:
        r9 = Integer.MIN_VALUE;
    L52:
        if (this.e > 0) goto L61;
        int r124 = getChildCount();
        int r02 = 0;
    L54:
        if (r7 >= r124) goto L59;
        int r13 = getChildAt(r7).getMeasuredHeight() + r2;
        if (r13 <= r02) goto L58;
        r02 = r13;
    L58:
        r7 = r7 + 1;
        goto L54
    L59:
        setMeasuredDimension(r112, r02);
        return;
    L61:
        setMeasuredDimension(r112, r0);
        return;
    L21:
        if (this.m != null) goto L36;
        if (this.s == false) goto L35;
        this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), r5);
        int r55 = this.n.getMeasuredWidth();
        if (r55 > r122) goto L27;
        boolean r66 = true;
    L28:
        if (r66 == false) goto L30;
        r122 = r122 - r55;
    L30:
        LinearLayout r56 = this.n;
        if (r66 == false) goto L33;
        int r67 = 0;
    L34:
        r56.setVisibility(r67);
        goto L36
    L33:
        r67 = 8;
        goto L34
    L27:
        r66 = false;
        goto L28
    L35:
        r122 = f(r64, r122, r5);
        goto L36
    L16:
        if (r63.getParent() != this) goto L18;
        r122 = f(this.c, r122, r5);
        goto L18
    L64:
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
    L66:
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r5) {
        int r0 = r5.getActionMasked();
        if (r0 != 0) goto L6;
        this.g = false;
    L6:
        if (this.g == true) goto L11;
        boolean r52 = super.onTouchEvent(r5);
        if (r0 != 0) goto L11;
        if (r52 == true) goto L11;
        this.g = true;
    L11:
        if (r0 != 1) goto L13;
    L16:
        this.g = false;
        return true;
    L13:
        if (r0 == 3) goto L16;
        return true;
    }

    public void setContentHeight(int r1) {
        this.e = r1;
    }

    public void setCustomView(View r2) {
        View r0 = this.m;
        if (r0 == null) goto L5;
        removeView(r0);
    L5:
        this.m = r2;
        if (r2 == null) goto L10;
        LinearLayout r02 = this.n;
        if (r02 == null) goto L10;
        removeView(r02);
        this.n = null;
    L10:
        if (r2 == null) goto L12;
        addView(r2);
    L12:
        requestLayout();
    }

    public void setSubtitle(CharSequence r1) {
        this.j = r1;
        d();
    }

    public void setTitle(CharSequence r1) {
        this.i = r1;
        d();
        ja0.m(this, r1);
    }

    public void setTitleOptional(boolean r2) {
        if (r2 == this.s) goto L5;
        requestLayout();
    L5:
        this.s = r2;
    }

    @Override // android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
        h(r1);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
