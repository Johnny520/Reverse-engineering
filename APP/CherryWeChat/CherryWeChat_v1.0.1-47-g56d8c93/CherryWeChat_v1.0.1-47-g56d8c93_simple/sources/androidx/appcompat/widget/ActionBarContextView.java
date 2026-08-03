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
import io.github.cherrywechat.R;
import p000.AbstractC0345I0;
import p000.AbstractC0982Wu;
import p000.AbstractC1406fG;
import p000.AbstractC2185lE;
import p000.C0130D0;
import p000.C0273GE;
import p000.C2256n;
import p000.C2781z0;
import p000.InterfaceC0292Gr;
import p000.MenuC2204lr;
import p000.ViewOnClickListenerC2343p0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C2256n f3725a;

    /* JADX INFO: renamed from: b */
    public final Context f3726b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f3727c;

    /* JADX INFO: renamed from: d */
    public C0130D0 f3728d;

    /* JADX INFO: renamed from: e */
    public int f3729e;

    /* JADX INFO: renamed from: f */
    public C0273GE f3730f;

    /* JADX INFO: renamed from: g */
    public boolean f3731g;

    /* JADX INFO: renamed from: h */
    public boolean f3732h;

    /* JADX INFO: renamed from: i */
    public CharSequence f3733i;

    /* JADX INFO: renamed from: j */
    public CharSequence f3734j;

    /* JADX INFO: renamed from: k */
    public View f3735k;

    /* JADX INFO: renamed from: l */
    public View f3736l;

    /* JADX INFO: renamed from: m */
    public View f3737m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f3738n;

    /* JADX INFO: renamed from: o */
    public TextView f3739o;

    /* JADX INFO: renamed from: p */
    public TextView f3740p;

    /* JADX INFO: renamed from: q */
    public final int f3741q;

    /* JADX INFO: renamed from: r */
    public final int f3742r;

    /* JADX INFO: renamed from: s */
    public boolean f3743s;

    /* JADX INFO: renamed from: t */
    public final int f3744t;

    public ActionBarContextView(Context r6, AttributeSet r7) {
        super(r6, r7, R.attr.actionModeStyle);
        this.f3725a = new C2256n(this);
        TypedValue r1 = new TypedValue();
        if (r6.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, r1, true) == true) goto L5;
    L7:
        this.f3726b = r6;
    L8:
        TypedArray r72 = r6.obtainStyledAttributes(r7, AbstractC0982Wu.f3069d, R.attr.actionModeStyle, 0);
        if (r72.hasValue(0) == false) goto L13;
        int r0 = r72.getResourceId(0, 0);
        if (r0 == 0) goto L13;
        Drawable r62 = AbstractC1406fG.m2695U(r6, r0);
    L14:
        setBackground(r62);
        this.f3741q = r72.getResourceId(5, 0);
        this.f3742r = r72.getResourceId(4, 0);
        this.f3729e = r72.getLayoutDimension(3, 0);
        this.f3744t = r72.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        r72.recycle();
        return;
    L13:
        r62 = r72.getDrawable(0);
        goto L14
    L5:
        if (r1.resourceId == 0) goto L7;
        this.f3726b = new ContextThemeWrapper(r6, r1.resourceId);
        goto L8
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2075a(ActionBarContextView r1) {
        super.setVisibility(0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2076b(ActionBarContextView r0, int r1) {
        super.setVisibility(r1);
    }

    /* JADX INFO: renamed from: f */
    public static int m2077f(View r1, int r2, int r3) {
        r1.measure(View.MeasureSpec.makeMeasureSpec(r2, Integer.MIN_VALUE), r3);
        return Math.max(0, r2 - r1.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m2078g(int r2, int r3, int r4, View r5, boolean r6) {
        int r0 = r5.getMeasuredWidth();
        int r1 = r5.getMeasuredHeight();
        int r42 = ((r4 - r1) / 2) + r3;
        if (r6 == false) goto L5;
        r5.layout(r2 - r0, r42, r2, r1 + r42);
    L6:
        if (r6 == true) goto L8;
        return r0;
    L8:
        return -r0;
    L5:
        r5.layout(r2, r42, r2 + r0, r1 + r42);
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public final void m2079c(AbstractC0345I0 r6) {
        View r0 = this.f3735k;
        if (r0 != null) goto L6;
        View r02 = LayoutInflater.from(getContext()).inflate(this.f3744t, this, false);
        this.f3735k = r02;
        addView(r02);
    L8:
        View r03 = this.f3735k.findViewById(R.id.action_mode_close_button);
        this.f3736l = r03;
        r03.setOnClickListener(new ViewOnClickListenerC2343p0(0, r6));
        MenuC2204lr r62 = r6.mo737c();
        C0130D0 r04 = this.f3728d;
        if (r04 == null) goto L15;
        r04.m214c();
        C2781z0 r05 = r04.f321t;
        if (r05 == null) goto L15;
        if (r05.m5291b() == false) goto L15;
        r05.f9323i.dismiss();
    L15:
        C0130D0 r06 = new C0130D0(getContext());
        this.f3728d = r06;
        r06.f313l = true;
        r06.f314m = true;
        ViewGroup.LayoutParams r07 = new ViewGroup.LayoutParams(-2, -1);
        r62.m4429b(this.f3728d, this.f3726b);
        C0130D0 r63 = this.f3728d;
        InterfaceC0292Gr r2 = r63.f309h;
        if (r2 != null) goto L18;
        InterfaceC0292Gr r1 = (InterfaceC0292Gr) r63.f305d.inflate(r63.f307f, this, false);
        r63.f309h = r1;
        r1.mo591b(r63.f304c);
        r63.mo218g();
    L18:
        InterfaceC0292Gr r12 = r63.f309h;
        if (r2 == r12) goto L21;
        ((ActionMenuView) r12).setPresenter(r63);
    L21:
        ActionMenuView r13 = (ActionMenuView) r12;
        this.f3727c = r13;
        r13.setBackground(null);
        addView(this.f3727c, r07);
        return;
    L6:
        if (r0.getParent() != null) goto L8;
        addView(this.f3735k);
        goto L8
    }

    /* JADX INFO: renamed from: d */
    public final void m2080d() {
        if (this.f3738n != null) goto L10;
        LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
        LinearLayout r0 = (LinearLayout) getChildAt(getChildCount() - 1);
        this.f3738n = r0;
        this.f3739o = (TextView) r0.findViewById(R.id.action_bar_title);
        this.f3740p = (TextView) this.f3738n.findViewById(R.id.action_bar_subtitle);
        int r02 = this.f3741q;
        if (r02 == 0) goto L7;
        this.f3739o.setTextAppearance(getContext(), r02);
    L7:
        int r03 = this.f3742r;
        if (r03 == 0) goto L10;
        this.f3740p.setTextAppearance(getContext(), r03);
    L10:
        this.f3739o.setText(this.f3733i);
        this.f3740p.setText(this.f3734j);
        boolean r04 = TextUtils.isEmpty(this.f3733i);
        boolean r1 = TextUtils.isEmpty(this.f3734j);
        TextView r2 = this.f3740p;
        int r3 = 8;
        if (r1 == true) goto L13;
        int r5 = 0;
    L14:
        r2.setVisibility(r5);
        LinearLayout r22 = this.f3738n;
        if (r04 == false) goto L17;
        if (r1 == false) goto L17;
    L18:
        r22.setVisibility(r3);
        if (this.f3738n.getParent() != null) goto L22;
        addView(this.f3738n);
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

    /* JADX INFO: renamed from: e */
    public final void m2081e() {
        removeAllViews();
        this.f3737m = null;
        this.f3727c = null;
        this.f3728d = null;
        View r1 = this.f3736l;
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
        if (this.f3730f == null) goto L7;
        return this.f3725a.f7968b;
    L7:
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f3729e;
    }

    public CharSequence getSubtitle() {
        return this.f3734j;
    }

    public CharSequence getTitle() {
        return this.f3733i;
    }

    /* JADX INFO: renamed from: h */
    public final void m2082h(int r2) {
        if (r2 == getVisibility()) goto L9;
        C0273GE r0 = this.f3730f;
        if (r0 == null) goto L7;
        r0.m554b();
    L7:
        super.setVisibility(r2);
        return;
    }

    /* JADX INFO: renamed from: i */
    public final C0273GE m2083i(int r4, long r5) {
        C0273GE r0 = this.f3730f;
        if (r0 == null) goto L5;
        r0.m554b();
    L5:
        C2256n r02 = this.f3725a;
        if (r4 == 0) goto L8;
        C0273GE r2 = AbstractC2185lE.m4388a(this);
        r2.m553a(0.0f);
        r2.m555c(r5);
        ((ActionBarContextView) r02.f7969c).f3730f = r2;
        r02.f7968b = r4;
        r2.m556d(r02);
        return r2;
    L8:
        if (getVisibility() == 0) goto L10;
        setAlpha(0.0f);
    L10:
        C0273GE r1 = AbstractC2185lE.m4388a(this);
        r1.m553a(1.0f);
        r1.m555c(r5);
        ((ActionBarContextView) r02.f7969c).f3730f = r1;
        r02.f7968b = r4;
        r1.m556d(r02);
        return r1;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r5) {
        super.onConfigurationChanged(r5);
        TypedArray r52 = getContext().obtainStyledAttributes(null, AbstractC0982Wu.f3066a, R.attr.actionBarStyle, 0);
        setContentHeight(r52.getLayoutDimension(13, 0));
        r52.recycle();
        C0130D0 r53 = this.f3728d;
        if (r53 == null) goto L31;
        Configuration r0 = r53.f303b.getResources().getConfiguration();
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
        r53.f317p = r02;
        MenuC2204lr r54 = r53.f304c;
        if (r54 == null) goto L32;
        r54.m4435p(true);
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
        C0130D0 r0 = this.f3728d;
        if (r0 == null) goto L10;
        r0.m214c();
        C2781z0 r02 = this.f3728d.f321t;
        if (r02 != null) goto L7;
        return;
    L7:
        if (r02.m5291b() == false) goto L12;
        r02.f9323i.dismiss();
        return;
    L12:
        return;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent r6) {
        int r0 = r6.getActionMasked();
        if (r0 != 9) goto L6;
        this.f3732h = false;
    L6:
        if (this.f3732h == true) goto L12;
        boolean r62 = super.onHoverEvent(r6);
        if (r0 != 9) goto L12;
        if (r62 == true) goto L12;
        this.f3732h = true;
    L12:
        if (r0 != 10) goto L14;
    L17:
        this.f3732h = false;
        return true;
    L14:
        if (r0 == 3) goto L17;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        if (getLayoutDirection() != 1) goto L5;
        boolean r62 = true;
    L6:
        if (r62 == false) goto L8;
        int r1 = (r9 - r7) - getPaddingRight();
    L9:
        int r2 = getPaddingTop();
        int r102 = ((r10 - r8) - getPaddingTop()) - getPaddingBottom();
        View r82 = this.f3735k;
        if (r82 != null) goto L12;
    L28:
        LinearLayout r83 = this.f3738n;
        if (r83 != null) goto L31;
    L35:
        View r84 = this.f3737m;
        if (r84 == null) goto L38;
        m2078g(r1, r2, r102, r84, r62);
    L38:
        if (r62 == false) goto L40;
        int r72 = getPaddingLeft();
    L41:
        ActionMenuView r85 = this.f3727c;
        if (r85 == null) goto L45;
        m2078g(r72, r2, r102, r85, !r62);
        return;
    L45:
        return;
    L40:
        r72 = (r9 - r7) - getPaddingRight();
        goto L41
    L31:
        if (this.f3737m != null) goto L35;
        if (r83.getVisibility() == 8) goto L35;
        r1 = r1 + m2078g(r1, r2, r102, this.f3738n, r62);
        goto L35
    L12:
        if (r82.getVisibility() == 8) goto L28;
        ViewGroup.MarginLayoutParams r86 = (ViewGroup.MarginLayoutParams) this.f3735k.getLayoutParams();
        if (r62 == false) goto L16;
        int r4 = r86.rightMargin;
    L17:
        if (r62 == false) goto L19;
        int r87 = r86.leftMargin;
    L20:
        if (r62 == false) goto L22;
        int r12 = r1 - r4;
    L23:
        int r42 = m2078g(r12, r2, r102, this.f3735k, r62) + r12;
        if (r62 == false) goto L27;
        int r43 = r42 - r87;
    L26:
        r1 = r43;
        goto L28
    L27:
        r43 = r42 + r87;
        goto L26
    L22:
        r12 = r1 + r4;
        goto L23
    L19:
        r87 = r86.rightMargin;
        goto L20
    L16:
        r4 = r86.leftMargin;
        goto L17
    L8:
        r1 = getPaddingLeft();
        goto L9
    L5:
        r62 = false;
        goto L6
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
        int r1 = 1073741824;
        if (View.MeasureSpec.getMode(r11) != 1073741824) goto L66;
        if (View.MeasureSpec.getMode(r12) == 0) goto L64;
        int r112 = View.MeasureSpec.getSize(r11);
        int r0 = this.f3729e;
        if (r0 > 0) goto L10;
        r0 = View.MeasureSpec.getSize(r12);
    L10:
        int r2 = getPaddingBottom() + getPaddingTop();
        int r122 = (r112 - getPaddingLeft()) - getPaddingRight();
        int r3 = r0 - r2;
        int r5 = View.MeasureSpec.makeMeasureSpec(r3, Integer.MIN_VALUE);
        View r6 = this.f3735k;
        if (r6 == null) goto L13;
        int r123 = m2077f(r6, r122, r5);
        ViewGroup.MarginLayoutParams r62 = (ViewGroup.MarginLayoutParams) this.f3735k.getLayoutParams();
        r122 = r123 - (r62.leftMargin + r62.rightMargin);
    L13:
        ActionMenuView r63 = this.f3727c;
        if (r63 != null) goto L16;
    L18:
        LinearLayout r64 = this.f3738n;
        int r7 = 0;
        if (r64 != null) goto L21;
    L36:
        View r52 = this.f3737m;
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
        this.f3737m.measure(View.MeasureSpec.makeMeasureSpec(r122, r9), View.MeasureSpec.makeMeasureSpec(r3, r1));
        goto L52
    L41:
        r9 = Integer.MIN_VALUE;
    L52:
        if (this.f3729e > 0) goto L61;
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
        if (this.f3737m != null) goto L36;
        if (this.f3743s == false) goto L35;
        this.f3738n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), r5);
        int r55 = this.f3738n.getMeasuredWidth();
        if (r55 > r122) goto L27;
        boolean r66 = true;
    L28:
        if (r66 == false) goto L30;
        r122 = r122 - r55;
    L30:
        LinearLayout r56 = this.f3738n;
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
        r122 = m2077f(r64, r122, r5);
        goto L36
    L16:
        if (r63.getParent() != this) goto L18;
        r122 = m2077f(this.f3727c, r122, r5);
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
        this.f3731g = false;
    L6:
        if (this.f3731g == true) goto L11;
        boolean r52 = super.onTouchEvent(r5);
        if (r0 != 0) goto L11;
        if (r52 == true) goto L11;
        this.f3731g = true;
    L11:
        if (r0 != 1) goto L13;
    L16:
        this.f3731g = false;
        return true;
    L13:
        if (r0 == 3) goto L16;
        return true;
    }

    public void setContentHeight(int r1) {
        this.f3729e = r1;
    }

    public void setCustomView(View r2) {
        View r0 = this.f3737m;
        if (r0 == null) goto L5;
        removeView(r0);
    L5:
        this.f3737m = r2;
        if (r2 == null) goto L10;
        LinearLayout r02 = this.f3738n;
        if (r02 == null) goto L10;
        removeView(r02);
        this.f3738n = null;
    L10:
        if (r2 == null) goto L12;
        addView(r2);
    L12:
        requestLayout();
    }

    public void setSubtitle(CharSequence r1) {
        this.f3734j = r1;
        m2080d();
    }

    public void setTitle(CharSequence r1) {
        this.f3733i = r1;
        m2080d();
        AbstractC2185lE.m4400m(this, r1);
    }

    public void setTitleOptional(boolean r2) {
        if (r2 == this.f3743s) goto L5;
        requestLayout();
    L5:
        this.f3743s = r2;
    }

    @Override // android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
        m2082h(r1);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
