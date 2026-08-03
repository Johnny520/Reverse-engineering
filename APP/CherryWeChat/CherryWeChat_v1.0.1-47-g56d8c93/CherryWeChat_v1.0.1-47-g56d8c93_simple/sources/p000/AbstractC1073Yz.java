package p000;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Yz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1073Yz extends CompoundButton {

    /* JADX INFO: renamed from: R */
    public static final C2264n7 f3394R = null;

    /* JADX INFO: renamed from: S */
    public static final int[] f3395S = null;

    /* JADX INFO: renamed from: A */
    public int f3396A;

    /* JADX INFO: renamed from: B */
    public int f3397B;

    /* JADX INFO: renamed from: C */
    public int f3398C;

    /* JADX INFO: renamed from: D */
    public int f3399D;

    /* JADX INFO: renamed from: E */
    public int f3400E;

    /* JADX INFO: renamed from: F */
    public int f3401F;

    /* JADX INFO: renamed from: G */
    public int f3402G;

    /* JADX INFO: renamed from: H */
    public boolean f3403H;

    /* JADX INFO: renamed from: I */
    public final TextPaint f3404I;

    /* JADX INFO: renamed from: J */
    public final ColorStateList f3405J;

    /* JADX INFO: renamed from: K */
    public StaticLayout f3406K;

    /* JADX INFO: renamed from: L */
    public StaticLayout f3407L;

    /* JADX INFO: renamed from: M */
    public final C2740y2 f3408M;

    /* JADX INFO: renamed from: N */
    public ObjectAnimator f3409N;

    /* JADX INFO: renamed from: O */
    public C0391J3 f3410O;

    /* JADX INFO: renamed from: P */
    public C0151Df f3411P;

    /* JADX INFO: renamed from: Q */
    public final Rect f3412Q;

    /* JADX INFO: renamed from: a */
    public Drawable f3413a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f3414b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f3415c;

    /* JADX INFO: renamed from: d */
    public boolean f3416d;

    /* JADX INFO: renamed from: e */
    public boolean f3417e;

    /* JADX INFO: renamed from: f */
    public Drawable f3418f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f3419g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f3420h;

    /* JADX INFO: renamed from: i */
    public boolean f3421i;

    /* JADX INFO: renamed from: j */
    public boolean f3422j;

    /* JADX INFO: renamed from: k */
    public int f3423k;

    /* JADX INFO: renamed from: l */
    public int f3424l;

    /* JADX INFO: renamed from: m */
    public int f3425m;

    /* JADX INFO: renamed from: n */
    public boolean f3426n;

    /* JADX INFO: renamed from: o */
    public CharSequence f3427o;

    /* JADX INFO: renamed from: p */
    public CharSequence f3428p;

    /* JADX INFO: renamed from: q */
    public CharSequence f3429q;

    /* JADX INFO: renamed from: r */
    public CharSequence f3430r;

    /* JADX INFO: renamed from: s */
    public boolean f3431s;

    /* JADX INFO: renamed from: t */
    public int f3432t;

    /* JADX INFO: renamed from: u */
    public final int f3433u;

    /* JADX INFO: renamed from: v */
    public float f3434v;

    /* JADX INFO: renamed from: w */
    public float f3435w;

    /* JADX INFO: renamed from: x */
    public final VelocityTracker f3436x;

    /* JADX INFO: renamed from: y */
    public final int f3437y;

    /* JADX INFO: renamed from: z */
    public float f3438z;

    static {
        f3394R = new C2264n7(5, Float.class, "thumbPos");
        f3395S = new int[]{R.attr.state_checked};
    }

    public AbstractC1073Yz(Context r14, AttributeSet r15) {
        super(r14, r15, io.github.cherrywechat.R.attr.switchStyle);
        this.f3414b = null;
        this.f3415c = null;
        this.f3416d = false;
        this.f3417e = false;
        this.f3419g = null;
        this.f3420h = null;
        this.f3421i = false;
        this.f3422j = false;
        this.f3436x = VelocityTracker.obtain();
        boolean r8 = true;
        this.f3403H = true;
        this.f3412Q = new Rect();
        AbstractC1042YA.m1987a(getContext(), this);
        TextPaint r9 = new TextPaint(1);
        this.f3404I = r9;
        r9.density = getResources().getDisplayMetrics().density;
        int[] r2 = AbstractC0982Wu.f3087v;
        TypedArray r4 = r14.obtainStyledAttributes(r15, r2, io.github.cherrywechat.R.attr.switchStyle, 0);
        C2656w4 r10 = new C2656w4(r14, r4);
        AbstractC2185lE.m4398k(this, r14, r2, r15, r4, io.github.cherrywechat.R.attr.switchStyle);
        Drawable r152 = r10.m5210q(2);
        this.f3413a = r152;
        if (r152 == null) goto L5;
        r152.setCallback(this);
    L5:
        Drawable r153 = r10.m5210q(11);
        this.f3418f = r153;
        if (r153 == null) goto L8;
        r153.setCallback(this);
    L8:
        setTextOnInternal(r4.getText(0));
        setTextOffInternal(r4.getText(1));
        this.f3431s = r4.getBoolean(3, true);
        this.f3423k = r4.getDimensionPixelSize(8, 0);
        this.f3424l = r4.getDimensionPixelSize(5, 0);
        this.f3425m = r4.getDimensionPixelSize(6, 0);
        this.f3426n = r4.getBoolean(4, false);
        ColorStateList r22 = r10.m5209p(9);
        if (r22 == null) goto L11;
        this.f3414b = r22;
        this.f3416d = true;
    L11:
        PorterDuff.Mode r23 = AbstractC0107Ce.m161c(r4.getInt(10, -1), null);
        if (this.f3415c == r23) goto L15;
        this.f3415c = r23;
        this.f3417e = true;
    L15:
        if (this.f3416d == false) goto L17;
    L18:
        m2009a();
    L19:
        ColorStateList r24 = r10.m5209p(12);
        if (r24 == null) goto L22;
        this.f3419g = r24;
        this.f3421i = true;
    L22:
        PorterDuff.Mode r25 = AbstractC0107Ce.m161c(r4.getInt(13, -1), null);
        if (this.f3420h == r25) goto L26;
        this.f3420h = r25;
        this.f3422j = true;
    L26:
        if (this.f3421i == false) goto L28;
    L29:
        m2010b();
    L30:
        int r26 = r4.getResourceId(7, 0);
        if (r26 == 0) goto L79;
        TypedArray r27 = r14.obtainStyledAttributes(r26, AbstractC0982Wu.f3088w);
        if (r27.hasValue(3) == false) goto L39;
        int r42 = r27.getResourceId(3, 0);
        if (r42 == 0) goto L39;
        ColorStateList r43 = AbstractC0295Gu.m622o(r14, r42);
        if (r43 == null) goto L39;
    L40:
        if (r43 == null) goto L42;
        this.f3405J = r43;
    L43:
        int r44 = r27.getDimensionPixelSize(0, 0);
        if (r44 == 0) goto L48;
        float r45 = r44;
        if (r45 == r9.getTextSize()) goto L48;
        r9.setTextSize(r45);
        requestLayout();
    L48:
        int r46 = r27.getInt(1, -1);
        int r11 = r27.getInt(2, -1);
        if (r46 == 1) goto L55;
        if (r46 == 2) goto L54;
        if (r46 == 3) goto L53;
        Typeface r154 = null;
    L56:
        float r47 = 0.0f;
        if (r11 <= 0) goto L73;
        if (r154 != null) goto L60;
        Typeface r155 = Typeface.defaultFromStyle(r11);
    L61:
        setSwitchTypeface(r155);
        if (r155 == null) goto L64;
        int r156 = r155.getStyle();
    L65:
        int r157 = (~r156) & r11;
        if ((r157 & 1) != 0) goto L69;
        r8 = false;
    L69:
        r9.setFakeBoldText(r8);
        if ((2 & r157) == 0) goto L72;
        r47 = -0.25f;
    L72:
        r9.setTextSkewX(r47);
    L75:
        if (r27.getBoolean(14, false) == false) goto L77;
        Context r158 = getContext();
        C2740y2 r142 = new C2740y2();
        r142.f9344a = r158.getResources().getConfiguration().locale;
        this.f3408M = r142;
    L78:
        setTextOnInternal(this.f3427o);
        setTextOffInternal(this.f3429q);
        r27.recycle();
        goto L79
    L77:
        this.f3408M = null;
        goto L78
    L64:
        r156 = 0;
        goto L65
    L60:
        r155 = Typeface.create(r154, r11);
        goto L61
    L73:
        r9.setFakeBoldText(false);
        r9.setTextSkewX(0.0f);
        setSwitchTypeface(r154);
        goto L75
    L53:
        r154 = Typeface.MONOSPACE;
        goto L56
    L54:
        r154 = Typeface.SERIF;
        goto L56
    L55:
        r154 = Typeface.SANS_SERIF;
        goto L56
    L42:
        this.f3405J = getTextColors();
    L39:
        r43 = r27.getColorStateList(3);
    L79:
        new C2175l4(this).m4378f(r15, io.github.cherrywechat.R.attr.switchStyle);
        r10.m5195E();
        ViewConfiguration r143 = ViewConfiguration.get(r14);
        this.f3433u = r143.getScaledTouchSlop();
        this.f3437y = r143.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m829b(r15, io.github.cherrywechat.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
        return;
    L28:
        if (this.f3422j == false) goto L30;
    L17:
        if (this.f3417e == false) goto L19;
        goto L18
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f3410O != null) goto L6;
        this.f3410O = new C0391J3(this);
    L6:
        return this.f3410O;
    }

    private boolean getTargetCheckedState() {
        if (this.f3438z <= 0.5f) goto L6;
        return true;
    L6:
        return false;
    }

    private int getThumbOffset() {
        if (getLayoutDirection() != 1) goto L5;
        float r0 = 1.0f - this.f3438z;
    L7:
        return (int) ((r0 * getThumbScrollRange()) + 0.5f);
    L5:
        r0 = this.f3438z;
        goto L7
    }

    private int getThumbScrollRange() {
        Drawable r0 = this.f3418f;
        if (r0 == null) goto L10;
        Rect r1 = this.f3412Q;
        r0.getPadding(r1);
        Drawable r02 = this.f3413a;
        if (r02 == null) goto L7;
        Rect r03 = AbstractC0107Ce.m160b(r02);
    L9:
        return ((((this.f3396A - this.f3398C) - r1.left) - r1.right) - r03.left) - r03.right;
    L7:
        r03 = AbstractC0107Ce.f252c;
        goto L9
    L10:
        return 0;
    }

    private void setTextOffInternal(CharSequence r3) {
        this.f3429q = r3;
        TransformationMethod r0 = ((AbstractC0828TB) getEmojiTextViewHelper().f1327b.f328b).mo103L(this.f3408M);
        if (r0 == null) goto L5;
        r3 = r0.getTransformation(r3, this);
    L5:
        this.f3430r = r3;
        this.f3407L = null;
        if (this.f3431s == false) goto L9;
        m2012d();
        return;
    }

    private void setTextOnInternal(CharSequence r3) {
        this.f3427o = r3;
        TransformationMethod r0 = ((AbstractC0828TB) getEmojiTextViewHelper().f1327b.f328b).mo103L(this.f3408M);
        if (r0 == null) goto L5;
        r3 = r0.getTransformation(r3, this);
    L5:
        this.f3428p = r3;
        this.f3406K = null;
        if (this.f3431s == false) goto L9;
        m2012d();
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m2009a() {
        Drawable r0 = this.f3413a;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f3416d == false) goto L7;
    L8:
        Drawable r02 = r0.mutate();
        this.f3413a = r02;
        if (this.f3416d == false) goto L12;
        r02.setTintList(this.f3414b);
    L12:
        if (this.f3417e == false) goto L15;
        this.f3413a.setTintMode(this.f3415c);
    L15:
        if (this.f3413a.isStateful() == false) goto L20;
        this.f3413a.setState(getDrawableState());
        return;
    L20:
        return;
    L7:
        if (this.f3417e == true) goto L8;
    }

    /* JADX INFO: renamed from: b */
    public final void m2010b() {
        Drawable r0 = this.f3418f;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f3421i == false) goto L7;
    L8:
        Drawable r02 = r0.mutate();
        this.f3418f = r02;
        if (this.f3421i == false) goto L12;
        r02.setTintList(this.f3419g);
    L12:
        if (this.f3422j == false) goto L15;
        this.f3418f.setTintMode(this.f3420h);
    L15:
        if (this.f3418f.isStateful() == false) goto L20;
        this.f3418f.setState(getDrawableState());
        return;
    L20:
        return;
    L7:
        if (this.f3422j == true) goto L8;
    }

    /* JADX INFO: renamed from: c */
    public final void m2011c() {
        setTextOnInternal(this.f3427o);
        setTextOffInternal(this.f3429q);
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m2012d() {
        if (this.f3411P == null) goto L5;
        return;
    L5:
        if (((AbstractC0828TB) this.f3410O.f1327b.f328b).mo105s() == true) goto L8;
        return;
    L8:
        if (C2372pf.f8342k == null) goto L15;
        C2372pf r0 = C2372pf.m4798a();
        int r1 = r0.m4799b();
        if (r1 == 3) goto L12;
        if (r1 == 0) goto L12;
        return;
    L12:
        C0151Df r12 = new C0151Df(this);
        this.f3411P = r12;
        r0.m4803f(r12);
        return;
    }

    @Override // android.view.View
    public final void draw(Canvas r11) {
        int r0 = this.f3399D;
        int r1 = this.f3400E;
        int r2 = this.f3401F;
        int r3 = this.f3402G;
        int r4 = getThumbOffset() + r0;
        Drawable r5 = this.f3413a;
        if (r5 == null) goto L5;
        Rect r52 = AbstractC0107Ce.m160b(r5);
    L6:
        Drawable r6 = this.f3418f;
        Rect r7 = this.f3412Q;
        if (r6 == null) goto L26;
        r6.getPadding(r7);
        int r62 = r7.left;
        r4 = r4 + r62;
        if (r52 == null) goto L24;
        int r8 = r52.left;
        if (r8 <= r62) goto L13;
        r0 = r0 + (r8 - r62);
    L13:
        int r63 = r52.top;
        int r82 = r7.top;
        if (r63 <= r82) goto L16;
        int r64 = (r63 - r82) + r1;
    L17:
        int r83 = r52.right;
        int r9 = r7.right;
        if (r83 <= r9) goto L20;
        r2 = r2 - (r83 - r9);
    L20:
        int r53 = r52.bottom;
        int r84 = r7.bottom;
        if (r53 <= r84) goto L23;
        int r54 = r3 - (r53 - r84);
    L25:
        this.f3418f.setBounds(r0, r64, r2, r54);
    L23:
        r54 = r3;
        goto L25
    L16:
        r64 = r1;
        goto L17
    L24:
        r64 = r1;
    L26:
        Drawable r02 = this.f3413a;
        if (r02 == null) goto L31;
        r02.getPadding(r7);
        int r03 = r4 - r7.left;
        int r42 = (r4 + this.f3398C) + r7.right;
        this.f3413a.setBounds(r03, r1, r42, r3);
        Drawable r22 = getBackground();
        if (r22 == null) goto L31;
        r22.setHotspotBounds(r03, r1, r42, r3);
    L31:
        super.draw(r11);
        return;
    L5:
        r52 = AbstractC0107Ce.f252c;
        goto L6
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float r2, float r3) {
        super.drawableHotspotChanged(r2, r3);
        Drawable r0 = this.f3413a;
        if (r0 == null) goto L5;
        r0.setHotspot(r2, r3);
    L5:
        Drawable r02 = this.f3418f;
        if (r02 == null) goto L9;
        r02.setHotspot(r2, r3);
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] r0 = getDrawableState();
        Drawable r1 = this.f3413a;
        if (r1 != null) goto L5;
    L7:
        boolean r12 = false;
    L8:
        Drawable r2 = this.f3418f;
        if (r2 != null) goto L11;
    L13:
        if (r12 == false) goto L16;
        invalidate();
        return;
    L16:
        return;
    L11:
        if (r2.isStateful() == false) goto L13;
        r12 = r12 | r2.setState(r0);
        goto L13
    L5:
        if (r1.isStateful() == false) goto L7;
        r12 = r1.setState(r0);
        goto L8
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) goto L9;
        int r0 = super.getCompoundPaddingLeft() + this.f3396A;
        if (TextUtils.isEmpty(getText()) == false) goto L7;
        return r0;
    L7:
        return r0 + this.f3425m;
    L9:
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) goto L5;
        int r0 = super.getCompoundPaddingRight() + this.f3396A;
        if (TextUtils.isEmpty(getText()) == false) goto L9;
        return r0;
    L9:
        return r0 + this.f3425m;
    L5:
        return super.getCompoundPaddingRight();
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.f3431s;
    }

    public boolean getSplitTrack() {
        return this.f3426n;
    }

    public int getSwitchMinWidth() {
        return this.f3424l;
    }

    public int getSwitchPadding() {
        return this.f3425m;
    }

    public CharSequence getTextOff() {
        return this.f3429q;
    }

    public CharSequence getTextOn() {
        return this.f3427o;
    }

    public Drawable getThumbDrawable() {
        return this.f3413a;
    }

    public final float getThumbPosition() {
        return this.f3438z;
    }

    public int getThumbTextPadding() {
        return this.f3423k;
    }

    public ColorStateList getThumbTintList() {
        return this.f3414b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3415c;
    }

    public Drawable getTrackDrawable() {
        return this.f3418f;
    }

    public ColorStateList getTrackTintList() {
        return this.f3419g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3420h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r0 = this.f3413a;
        if (r0 == null) goto L5;
        r0.jumpToCurrentState();
    L5:
        Drawable r02 = this.f3418f;
        if (r02 == null) goto L8;
        r02.jumpToCurrentState();
    L8:
        ObjectAnimator r03 = this.f3409N;
        if (r03 != null) goto L11;
        return;
    L11:
        if (r03.isStarted() == false) goto L15;
        this.f3409N.end();
        this.f3409N = null;
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 1);
        if (isChecked() == false) goto L5;
        View.mergeDrawableStates(r22, f3395S);
    L5:
        return r22;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas r10) {
        super.onDraw(r10);
        Drawable r0 = this.f3418f;
        Rect r1 = this.f3412Q;
        if (r0 == null) goto L5;
        r0.getPadding(r1);
    L6:
        int r2 = this.f3400E;
        int r3 = this.f3402G;
        int r22 = r2 + r1.top;
        int r32 = r3 - r1.bottom;
        Drawable r4 = this.f3413a;
        if (r0 != null) goto L9;
    L13:
        int r02 = r10.save();
        if (r4 == null) goto L17;
        r4.draw(r10);
    L17:
        if (getTargetCheckedState() == false) goto L19;
        StaticLayout r12 = this.f3406K;
    L20:
        if (r12 == null) goto L29;
        int[] r5 = getDrawableState();
        TextPaint r6 = this.f3404I;
        ColorStateList r7 = this.f3405J;
        if (r7 == null) goto L24;
        r6.setColor(r7.getColorForState(r5, 0));
    L24:
        r6.drawableState = r5;
        if (r4 == null) goto L27;
        Rect r42 = r4.getBounds();
        int r52 = r42.left + r42.right;
    L28:
        r10.translate((r52 / 2) - (r12.getWidth() / 2), ((r22 + r32) / 2) - (r12.getHeight() / 2));
        r12.draw(r10);
        goto L29
    L27:
        r52 = getWidth();
    L29:
        r10.restoreToCount(r02);
        return;
    L19:
        r12 = this.f3407L;
        goto L20
    L9:
        if (this.f3426n == false) goto L12;
        if (r4 == null) goto L12;
        Rect r53 = AbstractC0107Ce.m160b(r4);
        r4.copyBounds(r1);
        r1.left += r53.left;
        r1.right -= r53.right;
        int r54 = r10.save();
        r10.clipRect(r1, Region.Op.DIFFERENCE);
        r0.draw(r10);
        r10.restoreToCount(r54);
    L12:
        r0.draw(r10);
        goto L13
    L5:
        r1.setEmpty();
        goto L6
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r4) {
        super.onInitializeAccessibilityNodeInfo(r4);
        r4.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) goto L5;
        return;
    L5:
        if (isChecked() == false) goto L7;
        CharSequence r0 = this.f3427o;
    L9:
        if (TextUtils.isEmpty(r0) == true) goto L17;
        CharSequence r1 = r4.getText();
        if (TextUtils.isEmpty(r1) == false) goto L14;
        r4.setText(r0);
        return;
    L14:
        StringBuilder r2 = new StringBuilder();
        r2.append(r1);
        r2.append(' ');
        r2.append(r0);
        r4.setText(r2);
        return;
    L17:
        return;
    L7:
        r0 = this.f3429q;
        goto L9
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        super.onLayout(r3, r4, r5, r6, r7);
        int r52 = 0;
        if (this.f3413a == null) goto L9;
        Drawable r42 = this.f3418f;
        Rect r62 = this.f3412Q;
        if (r42 == null) goto L7;
        r42.getPadding(r62);
    L8:
        Rect r43 = AbstractC0107Ce.m160b(this.f3413a);
        int r72 = Math.max(0, r43.left - r62.left);
        r52 = Math.max(0, r43.right - r62.right);
    L11:
        if (getLayoutDirection() != 1) goto L13;
        int r44 = getPaddingLeft() + r72;
        int r63 = ((this.f3396A + r44) - r72) - r52;
    L14:
        int r53 = getGravity() & 112;
        if (r53 != 16) goto L17;
        int r73 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
        int r54 = this.f3397B;
        int r74 = r73 - (r54 / 2);
        int r75 = r54 + r74;
        int r55 = r74;
    L21:
        this.f3399D = r44;
        this.f3400E = r55;
        this.f3402G = r75;
        this.f3401F = r63;
        return;
    L17:
        if (r53 == 80) goto L19;
        r55 = getPaddingTop();
        r75 = this.f3397B + r55;
        goto L21
    L19:
        r75 = getHeight() - getPaddingBottom();
        r55 = r75 - this.f3397B;
        goto L21
    L13:
        r63 = (getWidth() - getPaddingRight()) - r52;
        r44 = ((r63 - this.f3396A) + r72) + r52;
        goto L14
    L7:
        r62.setEmpty();
        goto L8
    L9:
        r72 = 0;
        goto L11
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r11, int r12) {
        int r1 = 0;
        if (this.f3431s == false) goto L18;
        StaticLayout r0 = this.f3406K;
        TextPaint r4 = this.f3404I;
        if (r0 != null) goto L12;
        CharSequence r3 = this.f3428p;
        if (r3 == null) goto L9;
        int r5 = (int) Math.ceil(Layout.getDesiredWidth(r3, r4));
    L10:
        this.f3406K = new StaticLayout(r3, r4, r5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        goto L12
    L9:
        r5 = 0;
    L12:
        if (this.f3407L != null) goto L18;
        CharSequence r32 = this.f3430r;
        if (r32 == null) goto L16;
        int r52 = (int) Math.ceil(Layout.getDesiredWidth(r32, r4));
    L17:
        this.f3407L = new StaticLayout(r32, r4, r52, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        goto L18
    L16:
        r52 = 0;
    L18:
        Drawable r02 = this.f3413a;
        Rect r2 = this.f3412Q;
        if (r02 == null) goto L21;
        r02.getPadding(r2);
        int r03 = (this.f3413a.getIntrinsicWidth() - r2.left) - r2.right;
        int r33 = this.f3413a.getIntrinsicHeight();
    L23:
        if (this.f3431s == false) goto L25;
        int r53 = (this.f3423k * 2) + Math.max(this.f3406K.getWidth(), this.f3407L.getWidth());
    L26:
        this.f3398C = Math.max(r53, r03);
        Drawable r04 = this.f3418f;
        if (r04 == null) goto L29;
        r04.getPadding(r2);
        r1 = this.f3418f.getIntrinsicHeight();
    L30:
        int r05 = r2.left;
        int r22 = r2.right;
        Drawable r42 = this.f3413a;
        if (r42 == null) goto L34;
        Rect r43 = AbstractC0107Ce.m160b(r42);
        r05 = Math.max(r05, r43.left);
        r22 = Math.max(r22, r43.right);
    L34:
        if (this.f3403H == false) goto L36;
        int r06 = Math.max(this.f3424l, ((this.f3398C * 2) + r05) + r22);
    L37:
        int r13 = Math.max(r1, r33);
        this.f3396A = r06;
        this.f3397B = r13;
        super.onMeasure(r11, r12);
        if (getMeasuredHeight() >= r13) goto L41;
        setMeasuredDimension(getMeasuredWidthAndState(), r13);
        return;
    L41:
        return;
    L36:
        r06 = this.f3424l;
        goto L37
    L29:
        r2.setEmpty();
        goto L30
    L25:
        r53 = 0;
        goto L26
    L21:
        r03 = 0;
        r33 = 0;
        goto L23
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent r2) {
        super.onPopulateAccessibilityEvent(r2);
        if (isChecked() == false) goto L5;
        CharSequence r0 = this.f3427o;
    L6:
        if (r0 == null) goto L9;
        r2.getText().add(r0);
        return;
    L9:
        return;
    L5:
        r0 = this.f3429q;
        goto L6
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent r10) {
        VelocityTracker r0 = this.f3436x;
        r0.addMovement(r10);
        int r1 = r10.getActionMasked();
        int r2 = this.f3433u;
        if (r1 == 0) goto L68;
        float r5 = 0.0f;
        if (r1 == 1) goto L41;
        if (r1 == 2) goto L9;
        if (r1 == 3) goto L41;
    L83:
        return super.onTouchEvent(r10);
    L9:
        int r02 = this.f3432t;
        if (r02 == 1) goto L34;
        if (r02 != 2) goto L83;
        float r102 = r10.getX();
        int r03 = getThumbScrollRange();
        float r12 = r102 - this.f3434v;
        if (r03 == 0) goto L17;
        float r13 = r12 / r03;
    L21:
        if (getLayoutDirection() != 1) goto L23;
        r13 = -r13;
    L23:
        float r04 = this.f3438z;
        float r14 = r13 + r04;
        if (r14 < 0.0f) goto L31;
        if (r14 <= 1.0f) goto L29;
        r5 = 1.0f;
        goto L31
    L29:
        r5 = r14;
    L31:
        if (r5 == r04) goto L33;
        this.f3434v = r102;
        setThumbPosition(r5);
    L33:
        return true;
    L17:
        if (r12 <= 0.0f) goto L19;
        r13 = 1.0f;
        goto L21
    L19:
        r13 = -1.0f;
        goto L21
    L34:
        float r05 = r10.getX();
        float r15 = r10.getY();
        float r22 = r2;
        if (Math.abs(r05 - this.f3434v) <= r22) goto L37;
    L38:
        this.f3432t = 2;
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f3434v = r05;
        this.f3435w = r15;
        return true;
    L37:
        if (Math.abs(r15 - this.f3435w) <= r22) goto L83;
    L41:
        if (this.f3432t != 2) goto L67;
        this.f3432t = 0;
        if (r10.getAction() == 1) goto L45;
    L47:
        boolean r16 = false;
    L48:
        boolean r6 = isChecked();
        if (r16 == false) goto L62;
        r0.computeCurrentVelocity(1000);
        float r06 = r0.getXVelocity();
        if (Math.abs(r06) > this.f3437y) goto L53;
        boolean r07 = getTargetCheckedState();
    L63:
        if (r07 == r6) goto L65;
        playSoundEffect(0);
    L65:
        setChecked(r07);
        MotionEvent r08 = MotionEvent.obtain(r10);
        r08.setAction(3);
        super.onTouchEvent(r08);
        r08.recycle();
        super.onTouchEvent(r10);
        return true;
    L53:
        if (getLayoutDirection() != 1) goto L59;
        if (r06 >= 0.0f) goto L57;
    L56:
        r07 = true;
    L57:
        r07 = false;
        goto L63
    L59:
        if (r06 <= 0.0f) goto L57;
    L62:
        r07 = r6;
        goto L63
    L45:
        if (isEnabled() == false) goto L47;
        r16 = true;
        goto L48
    L67:
        this.f3432t = 0;
        r0.clear();
        goto L83
    L68:
        float r09 = r10.getX();
        float r17 = r10.getY();
        if (isEnabled() == false) goto L83;
        if (this.f3413a == null) goto L83;
        int r4 = getThumbOffset();
        Drawable r52 = this.f3413a;
        Rect r62 = this.f3412Q;
        r52.getPadding(r62);
        int r53 = this.f3400E - r2;
        int r7 = (this.f3399D + r4) - r2;
        int r42 = (((this.f3398C + r7) + r62.left) + r62.right) + r2;
        int r63 = this.f3402G + r2;
        if (r09 <= r7) goto L83;
        if (r09 >= r42) goto L83;
        if (r17 <= r53) goto L83;
        if (r17 >= r63) goto L83;
        this.f3432t = 1;
        this.f3434v = r09;
        this.f3435w = r17;
        goto L83
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().m830c(r2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r8) {
        super.setChecked(r8);
        boolean r82 = isChecked();
        if (r82 == false) goto L11;
        if (Build.VERSION.SDK_INT < 30) goto L16;
        Object r0 = this.f3427o;
        if (r0 != null) goto L9;
        r0 = getResources().getString(io.github.cherrywechat.R.string.abc_capital_on);
    L9:
        Object r6 = r0;
        WeakHashMap r02 = AbstractC2185lE.f7617a;
        new C1132aE(io.github.cherrywechat.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m4627f(this, r6);
    L16:
        float r1 = 0.0f;
        if (getWindowToken() != null) goto L19;
    L24:
        ObjectAnimator r03 = this.f3409N;
        if (r03 == null) goto L27;
        r03.cancel();
    L27:
        if (r82 == false) goto L29;
        r1 = 1.0f;
    L29:
        setThumbPosition(r1);
        return;
    L19:
        if (isLaidOut() == false) goto L24;
        if (r82 == false) goto L22;
        r1 = 1.0f;
    L22:
        ObjectAnimator r04 = ObjectAnimator.ofFloat(this, f3394R, new float[]{r1});
        this.f3409N = r04;
        r04.setDuration(250);
        this.f3409N.setAutoCancel(true);
        this.f3409N.start();
        return;
    L11:
        if (Build.VERSION.SDK_INT < 30) goto L16;
        Object r05 = this.f3429q;
        if (r05 != null) goto L15;
        r05 = getResources().getString(io.github.cherrywechat.R.string.abc_capital_off);
    L15:
        Object r62 = r05;
        WeakHashMap r06 = AbstractC2185lE.f7617a;
        new C1132aE(io.github.cherrywechat.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m4627f(this, r62);
        goto L16
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(r1);
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().m831d(r2);
        setTextOnInternal(this.f3427o);
        setTextOffInternal(this.f3429q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean r1) {
        this.f3403H = r1;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(getEmojiTextViewHelper().m828a(r2));
    }

    public void setShowText(boolean r2) {
        if (this.f3431s == r2) goto L8;
        this.f3431s = r2;
        requestLayout();
        if (r2 == false) goto L9;
        m2012d();
        return;
    L9:
        return;
    }

    public void setSplitTrack(boolean r1) {
        this.f3426n = r1;
        invalidate();
    }

    public void setSwitchMinWidth(int r1) {
        this.f3424l = r1;
        requestLayout();
    }

    public void setSwitchPadding(int r1) {
        this.f3425m = r1;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface r3) {
        TextPaint r0 = this.f3404I;
        if (r0.getTypeface() == null) goto L7;
        if (r0.getTypeface().equals(r3) == true) goto L7;
    L9:
        r0.setTypeface(r3);
        requestLayout();
        invalidate();
        return;
    L7:
        if (r0.getTypeface() != null) goto L11;
        if (r3 != null) goto L9;
        return;
    }

    public void setTextOff(CharSequence r7) {
        setTextOffInternal(r7);
        requestLayout();
        if (isChecked() == false) goto L5;
        return;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L12;
        Object r72 = this.f3429q;
        if (r72 != null) goto L9;
        r72 = getResources().getString(io.github.cherrywechat.R.string.abc_capital_off);
    L9:
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        new C1132aE(io.github.cherrywechat.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m4627f(this, r72);
        return;
    }

    public void setTextOn(CharSequence r7) {
        setTextOnInternal(r7);
        requestLayout();
        if (isChecked() == true) goto L5;
        return;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L12;
        Object r72 = this.f3427o;
        if (r72 != null) goto L9;
        r72 = getResources().getString(io.github.cherrywechat.R.string.abc_capital_on);
    L9:
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        new C1132aE(io.github.cherrywechat.R.id.tag_state_description, CharSequence.class, 64, 30, 2).m4627f(this, r72);
        return;
    }

    public void setThumbDrawable(Drawable r3) {
        Drawable r0 = this.f3413a;
        if (r0 == null) goto L5;
        r0.setCallback(null);
    L5:
        this.f3413a = r3;
        if (r3 == null) goto L8;
        r3.setCallback(this);
    L8:
        requestLayout();
    }

    public void setThumbPosition(float r1) {
        this.f3438z = r1;
        invalidate();
    }

    public void setThumbResource(int r2) {
        setThumbDrawable(AbstractC1406fG.m2695U(getContext(), r2));
    }

    public void setThumbTextPadding(int r1) {
        this.f3423k = r1;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList r1) {
        this.f3414b = r1;
        this.f3416d = true;
        m2009a();
    }

    public void setThumbTintMode(PorterDuff.Mode r1) {
        this.f3415c = r1;
        this.f3417e = true;
        m2009a();
    }

    public void setTrackDrawable(Drawable r3) {
        Drawable r0 = this.f3418f;
        if (r0 == null) goto L5;
        r0.setCallback(null);
    L5:
        this.f3418f = r3;
        if (r3 == null) goto L8;
        r3.setCallback(this);
    L8:
        requestLayout();
    }

    public void setTrackResource(int r2) {
        setTrackDrawable(AbstractC1406fG.m2695U(getContext(), r2));
    }

    public void setTrackTintList(ColorStateList r1) {
        this.f3419g = r1;
        this.f3421i = true;
        m2010b();
    }

    public void setTrackTintMode(PorterDuff.Mode r1) {
        this.f3420h = r1;
        this.f3422j = true;
        m2010b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 != this.f3413a) goto L7;
        return true;
    L7:
        if (r2 == this.f3418f) goto L14;
        return false;
    L14:
        return true;
    }
}
