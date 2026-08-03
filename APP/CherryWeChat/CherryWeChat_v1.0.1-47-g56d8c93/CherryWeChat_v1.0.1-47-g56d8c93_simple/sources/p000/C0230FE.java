package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Scroller;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import com.youth.banner.config.BannerConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: FE */
/* JADX INFO: loaded from: classes.dex */
public final class C0230FE extends ViewGroup {

    /* JADX INFO: renamed from: T */
    public static final int[] f683T = null;

    /* JADX INFO: renamed from: U */
    public static final C0963Wb f684U = null;

    /* JADX INFO: renamed from: V */
    public static final InterpolatorC0844Tl f685V = null;

    /* JADX INFO: renamed from: A */
    public float f686A;

    /* JADX INFO: renamed from: B */
    public float f687B;

    /* JADX INFO: renamed from: C */
    public float f688C;

    /* JADX INFO: renamed from: D */
    public float f689D;

    /* JADX INFO: renamed from: E */
    public int f690E;

    /* JADX INFO: renamed from: F */
    public VelocityTracker f691F;

    /* JADX INFO: renamed from: G */
    public final int f692G;

    /* JADX INFO: renamed from: H */
    public final int f693H;

    /* JADX INFO: renamed from: I */
    public final int f694I;

    /* JADX INFO: renamed from: J */
    public final int f695J;

    /* JADX INFO: renamed from: K */
    public final EdgeEffect f696K;

    /* JADX INFO: renamed from: L */
    public final EdgeEffect f697L;

    /* JADX INFO: renamed from: M */
    public boolean f698M;

    /* JADX INFO: renamed from: N */
    public boolean f699N;

    /* JADX INFO: renamed from: O */
    public int f700O;

    /* JADX INFO: renamed from: P */
    public ArrayList f701P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC0144DE f702Q;

    /* JADX INFO: renamed from: R */
    public final RunnableC0431K0 f703R;

    /* JADX INFO: renamed from: S */
    public int f704S;

    /* JADX INFO: renamed from: a */
    public int f705a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f706b;

    /* JADX INFO: renamed from: c */
    public final C0058BE f707c;

    /* JADX INFO: renamed from: d */
    public final Rect f708d;

    /* JADX INFO: renamed from: e */
    public AbstractC0036At f709e;

    /* JADX INFO: renamed from: f */
    public int f710f;

    /* JADX INFO: renamed from: g */
    public int f711g;

    /* JADX INFO: renamed from: h */
    public final Scroller f712h;

    /* JADX INFO: renamed from: i */
    public boolean f713i;

    /* JADX INFO: renamed from: j */
    public C0160Do f714j;

    /* JADX INFO: renamed from: k */
    public int f715k;

    /* JADX INFO: renamed from: l */
    public Drawable f716l;

    /* JADX INFO: renamed from: m */
    public int f717m;

    /* JADX INFO: renamed from: n */
    public int f718n;

    /* JADX INFO: renamed from: o */
    public float f719o;

    /* JADX INFO: renamed from: p */
    public float f720p;

    /* JADX INFO: renamed from: q */
    public int f721q;

    /* JADX INFO: renamed from: r */
    public boolean f722r;

    /* JADX INFO: renamed from: s */
    public boolean f723s;

    /* JADX INFO: renamed from: t */
    public boolean f724t;

    /* JADX INFO: renamed from: u */
    public int f725u;

    /* JADX INFO: renamed from: v */
    public boolean f726v;

    /* JADX INFO: renamed from: w */
    public boolean f727w;

    /* JADX INFO: renamed from: x */
    public final int f728x;

    /* JADX INFO: renamed from: y */
    public int f729y;

    /* JADX INFO: renamed from: z */
    public final int f730z;

    static {
        f683T = new int[]{R.attr.layout_gravity};
        f684U = new C0963Wb(14);
        f685V = new InterpolatorC0844Tl(4);
    }

    public C0230FE(Activity r5) {
        super(r5);
        this.f706b = new ArrayList();
        this.f707c = new C0058BE();
        this.f708d = new Rect();
        this.f711g = -1;
        this.f719o = -3.4028235E38f;
        this.f720p = Float.MAX_VALUE;
        this.f725u = 1;
        this.f690E = -1;
        this.f698M = true;
        this.f703R = new RunnableC0431K0(19, this);
        this.f704S = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context r52 = getContext();
        this.f712h = new Scroller(r52, f685V);
        ViewConfiguration r1 = ViewConfiguration.get(r52);
        float r2 = r52.getResources().getDisplayMetrics().density;
        this.f730z = r1.getScaledPagingTouchSlop();
        this.f692G = (int) (400.0f * r2);
        this.f693H = r1.getScaledMaximumFlingVelocity();
        this.f696K = new EdgeEffect(r52);
        this.f697L = new EdgeEffect(r52);
        this.f694I = (int) (25.0f * r2);
        this.f695J = (int) (2.0f * r2);
        this.f728x = (int) (r2 * 16.0f);
        AbstractC2185lE.m4399l(this, new C1486h8(4, this));
        if (getImportantForAccessibility() != 0) goto L5;
        setImportantForAccessibility(1);
    L5:
        AbstractC1360eE.m2640l(this, new C0299Gy(this));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m451c(int r9, int r10, int r11, View r12, boolean r13) {
        if ((r12 instanceof ViewGroup) == false) goto L18;
        ViewGroup r0 = (ViewGroup) r12;
        int r2 = r12.getScrollX();
        int r3 = r12.getScrollY();
        int r4 = r0.getChildCount() - 1;
    L5:
        if (r4 < 0) goto L18;
        View r5 = r0.getChildAt(r4);
        int r6 = r10 + r2;
        if (r6 < r5.getLeft()) goto L17;
        if (r6 >= r5.getRight()) goto L17;
        int r7 = r11 + r3;
        if (r7 < r5.getTop()) goto L17;
        if (r7 >= r5.getBottom()) goto L17;
        if (m451c(r9, r6 - r5.getLeft(), r7 - r5.getTop(), r5, true) == false) goto L17;
    L21:
        return true;
    L17:
        r4 = r4 - 1;
    L18:
        if (r13 == true) goto L20;
        return false;
    L20:
        if (r12.canScrollHorizontally(-r9) == true) goto L21;
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean r2) {
        if (this.f723s == r2) goto L6;
        this.f723s = r2;
        return;
    }

    /* JADX INFO: renamed from: a */
    public final C0058BE m452a(int r11, int r12) {
        C0058BE r0 = new C0058BE();
        r0.f134b = r11;
        C0355IA r1 = (C0355IA) this.f709e;
        r1.getClass();
        AbstractC0295Gu.m625r(-491979913820213L);
        Context r3 = r1.f1190a;
        FrameLayout r2 = new FrameLayout(r3);
        r2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ProgressBar r4 = new ProgressBar(r3);
        FrameLayout.LayoutParams r6 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(60), AbstractC0295Gu.m616i(60));
        r6.gravity = 17;
        r4.setLayoutParams(r6);
        r4.setIndeterminate(true);
        C0613OA r7 = new C0613OA(r3);
        r7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r7.setTag(AbstractC0295Gu.m625r(-492022863493173L) + r11);
        r2.addView(r7);
        r2.addView(r4);
        ComponentCallbacks2C1273a.m2414c(r3).m2833n((String) r1.f1191b.get(r11)).m2304w(((C2252mw) ((C2252mw) new C2252mw().m5318m(C2457re.f8656b, new C2804zh(), true)).m5316k()).m5312f(io.github.cherrywechat.R.drawable.ic_theme)).m2299B(new C1461gk(1, r4)).m2298A(r7);
        addView(r2);
        r0.f133a = r2;
        this.f709e.getClass();
        r0.f136d = 1.0f;
        ArrayList r112 = this.f706b;
        if (r12 >= 0) goto L5;
    L9:
        r112.add(r0);
        return r0;
    L5:
        if (r12 >= r112.size()) goto L9;
        r112.add(r12, r0);
        return r0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList r7, int r8, int r9) {
        int r0 = r7.size();
        int r1 = getDescendantFocusability();
        if (r1 == 393216) goto L16;
        int r2 = 0;
    L6:
        if (r2 >= getChildCount()) goto L16;
        View r3 = getChildAt(r2);
        if (r3.getVisibility() != 0) goto L14;
        C0058BE r4 = m458h(r3);
        if (r4 == null) goto L14;
        if (r4.f134b != this.f710f) goto L14;
        r3.addFocusables(r7, r8, r9);
    L14:
        r2 = r2 + 1;
    L16:
        if (r1 != 262144) goto L20;
        if (r0 == r7.size()) goto L20;
        return;
    L20:
        if (isFocusable() == true) goto L23;
        return;
    L23:
        if ((r9 & 1) == 1) goto L25;
    L29:
        r7.add(this);
        return;
    L25:
        if (isInTouchMode() == false) goto L29;
        if (isFocusableInTouchMode() == true) goto L29;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList r5) {
        int r0 = 0;
    L4:
        if (r0 >= getChildCount()) goto L13;
        View r1 = getChildAt(r0);
        if (r1.getVisibility() != 0) goto L12;
        C0058BE r2 = m458h(r1);
        if (r2 == null) goto L12;
        if (r2.f134b != this.f710f) goto L12;
        r1.addTouchables(r5);
    L12:
        r0 = r0 + 1;
        goto L4
    }

    @Override // android.view.ViewGroup
    public final void addView(View r5, int r6, ViewGroup.LayoutParams r7) {
        if (checkLayoutParams(r7) == true) goto L5;
        r7 = generateDefaultLayoutParams();
    L5:
        C0101CE r0 = (C0101CE) r7;
        boolean r1 = r0.f239a;
        if (r5.getClass().getAnnotation(InterfaceC0015AE.class) == null) goto L8;
        boolean r2 = true;
    L9:
        boolean r12 = r1 | r2;
        r0.f239a = r12;
        if (this.f722r == false) goto L16;
        if (r12 == true) goto L15;
        r0.f242d = true;
        addViewInLayout(r5, r6, r7);
        return;
    L15:
        throw new IllegalStateException("Cannot add pager decor view during layout");
    L16:
        super.addView(r5, r6, r7);
        return;
    L8:
        r2 = false;
        goto L9
    }

    /* JADX INFO: renamed from: b */
    public final boolean m453b(int r8) {
        View r0 = findFocus();
        if (r0 != this) goto L5;
    L4:
        r0 = null;
    L16:
        View r1 = FocusFinder.getInstance().findNextFocus(this, r0, r8);
        boolean r2 = true;
        boolean r3 = false;
        if (r1 == null) goto L35;
        if (r1 == r0) goto L35;
        Rect r6 = this.f708d;
        if (r8 != 17) goto L29;
        int r4 = m457g(r1, r6).left;
        int r5 = m457g(r0, r6).left;
        if (r0 == null) goto L27;
        if (r4 < r5) goto L27;
        int r02 = this.f710f;
        if (r02 <= 0) goto L45;
        this.f724t = false;
        m471u(r02 - 1, 0, true, false);
    L46:
        r3 = r2;
    L47:
        if (r3 == false) goto L49;
        playSoundEffect(SoundEffectConstants.getContantForFocusDirection(r8));
    L49:
        return r3;
    L45:
        r2 = false;
    L27:
        boolean r03 = r1.requestFocus();
    L28:
        r3 = r03;
        goto L47
    L29:
        if (r8 != 66) goto L47;
        int r22 = m457g(r1, r6).left;
        int r32 = m457g(r0, r6).left;
        if (r0 == null) goto L34;
        if (r22 > r32) goto L34;
        r03 = m463m();
    L34:
        r03 = r1.requestFocus();
    L35:
        if (r8 == 17) goto L42;
        if (r8 == 1) goto L42;
        if (r8 != 66) goto L40;
    L41:
        r3 = m463m();
        goto L47
    L40:
        if (r8 != 2) goto L47;
    L42:
        int r04 = this.f710f;
        if (r04 <= 0) goto L45;
        this.f724t = false;
        m471u(r04 - 1, 0, true, false);
        goto L46
    L5:
        if (r0 == null) goto L16;
        ViewParent r23 = r0.getParent();
    L8:
        if ((r23 instanceof ViewGroup) == false) goto L12;
        if (r23 == this) goto L16;
        r23 = r23.getParent();
        goto L8
    L12:
        ViewParent r05 = r0.getParent();
    L14:
        if ((r05 instanceof ViewGroup) == false) goto L4;
        r05 = r05.getParent();
        goto L14
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int r5) {
        if (this.f709e != null) goto L5;
        return false;
    L5:
        int r0 = getClientWidth();
        int r2 = getScrollX();
        if (r5 < 0) goto L8;
        if (r5 > 0) goto L13;
    L15:
        return false;
    L13:
        if (r2 >= ((int) (r0 * this.f720p))) goto L15;
        return true;
    L8:
        if (r2 <= ((int) (r0 * this.f719o))) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C0101CE) == true) goto L5;
        return false;
    L5:
        if (super.checkLayoutParams(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f713i = true;
        Scroller r1 = this.f712h;
        if (r1.isFinished() == false) goto L5;
    L14:
        m454d(true);
        return;
    L5:
        if (r1.computeScrollOffset() == false) goto L14;
        int r0 = getScrollX();
        int r2 = getScrollY();
        int r3 = r1.getCurrX();
        int r4 = r1.getCurrY();
        if (r0 != r3) goto L9;
        if (r2 != r4) goto L9;
    L12:
        WeakHashMap r02 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        return;
    L9:
        scrollTo(r3, r4);
        if (m464n(r3) == true) goto L12;
        r1.abortAnimation();
        scrollTo(0, r4);
        goto L12
    }

    /* JADX INFO: renamed from: d */
    public final void m454d(boolean r8) {
        if (this.f704S != 2) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L15;
        setScrollingCacheEnabled(false);
        Scroller r1 = this.f712h;
        if (r1.isFinished() == true) goto L15;
        r1.abortAnimation();
        int r4 = getScrollX();
        int r5 = getScrollY();
        int r6 = r1.getCurrX();
        int r12 = r1.getCurrY();
        if (r4 != r6) goto L12;
        if (r5 == r12) goto L15;
    L12:
        scrollTo(r6, r12);
        if (r6 == r4) goto L15;
        m464n(r6);
    L15:
        this.f724t = false;
        int r13 = 0;
    L16:
        ArrayList r42 = this.f706b;
        if (r13 >= r42.size()) goto L22;
        C0058BE r43 = (C0058BE) r42.get(r13);
        if (r43.f135c == false) goto L21;
        r43.f135c = false;
        r0 = true;
    L21:
        r13 = r13 + 1;
        goto L16
    L22:
        if (r0 == false) goto L32;
        RunnableC0431K0 r02 = this.f703R;
        if (r8 == false) goto L27;
        WeakHashMap r82 = AbstractC2185lE.f7617a;
        postOnAnimation(r02);
        return;
    L27:
        r02.run();
        return;
    L32:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r6) {
        if (super.dispatchKeyEvent(r6) == false) goto L5;
    L33:
        return true;
    L5:
        if (r6.getAction() != 0) goto L29;
        int r0 = r6.getKeyCode();
        if (r0 == 21) goto L24;
        if (r0 == 22) goto L20;
        if (r0 != 61) goto L29;
        if (r6.hasNoModifiers() == false) goto L17;
        boolean r62 = m453b(2);
    L30:
        if (r62 == true) goto L33;
        return false;
    L17:
        if (r6.hasModifiers(1) == false) goto L29;
        r62 = m453b(1);
        goto L30
    L20:
        if (r6.hasModifiers(2) == false) goto L22;
        r62 = m463m();
        goto L30
    L22:
        r62 = m453b(66);
        goto L30
    L24:
        if (r6.hasModifiers(2) == false) goto L28;
        int r63 = this.f710f;
        if (r63 <= 0) goto L29;
        this.f724t = false;
        m471u(r63 - 1, 0, true, false);
        r62 = true;
        goto L30
    L28:
        r62 = m453b(17);
    L29:
        r62 = false;
        goto L30
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r7) {
        if (r7.getEventType() == 4096) goto L5;
        int r0 = getChildCount();
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L19;
        View r3 = getChildAt(r2);
        if (r3.getVisibility() != 0) goto L18;
        C0058BE r4 = m458h(r3);
        if (r4 == null) goto L18;
        if (r4.f134b != this.f710f) goto L18;
        if (r3.dispatchPopulateAccessibilityEvent(r7) == false) goto L18;
        return true;
    L18:
        r2 = r2 + 1;
        goto L7
    L19:
        return false;
    L5:
        return super.dispatchPopulateAccessibilityEvent(r7);
    }

    @Override // android.view.View
    public final void draw(Canvas r9) {
        super.draw(r9);
        int r0 = getOverScrollMode();
        EdgeEffect r1 = this.f697L;
        EdgeEffect r2 = this.f696K;
        boolean r3 = false;
        if (r0 == 0) goto L13;
        if (r0 != 1) goto L11;
        AbstractC0036At r02 = this.f709e;
        if (r02 == null) goto L11;
        if (((C0355IA) r02).f1191b.size() > 1) goto L13;
    L11:
        r2.finish();
        r1.finish();
    L18:
        if (r3 == false) goto L21;
        WeakHashMap r92 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        return;
    L21:
        return;
    L13:
        if (r2.isFinished() == true) goto L16;
        int r03 = r9.save();
        int r32 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int r4 = getWidth();
        r9.rotate(270.0f);
        int r6 = getPaddingTop();
        r9.translate(r6 + (-r32), this.f719o * r4);
        r2.setSize(r32, r4);
        r3 = r2.draw(r9);
        r9.restoreToCount(r03);
    L16:
        if (r1.isFinished() == true) goto L18;
        int r04 = r9.save();
        int r22 = getWidth();
        int r42 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r9.rotate(90.0f);
        r9.translate(-getPaddingTop(), (-(this.f720p + 1.0f)) * r22);
        r1.setSize(r42, r22);
        r3 = r3 | r1.draw(r9);
        r9.restoreToCount(r04);
        goto L18
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable r0 = this.f716l;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isStateful() == false) goto L9;
        r0.setState(getDrawableState());
        return;
    }

    /* JADX INFO: renamed from: e */
    public final void m455e() {
        int r0 = ((C0355IA) this.f709e).f1191b.size();
        this.f705a = r0;
        ArrayList r1 = this.f706b;
        if (r1.size() < ((this.f725u * 2) + 1)) goto L5;
    L7:
        boolean r02 = false;
    L8:
        int r2 = this.f710f;
        int r3 = 0;
    L10:
        if (r3 >= r1.size()) goto L12;
        C0058BE r6 = (C0058BE) r1.get(r3);
        AbstractC0036At r7 = this.f709e;
        FrameLayout r62 = r6.f133a;
        r7.getClass();
        r3 = r3 + 1;
        goto L10
    L12:
        Collections.sort(r1, f684U);
        if (r02 == false) goto L26;
        int r03 = getChildCount();
        int r12 = 0;
    L15:
        if (r12 >= r03) goto L20;
        C0101CE r32 = (C0101CE) getChildAt(r12).getLayoutParams();
        if (r32.f239a == true) goto L19;
        r32.f241c = 0.0f;
    L19:
        r12 = r12 + 1;
        goto L15
    L20:
        m471u(r2, 0, false, true);
        requestLayout();
        return;
    L26:
        return;
    L5:
        if (r1.size() >= r0) goto L7;
        r02 = true;
        goto L8
    }

    /* JADX INFO: renamed from: f */
    public final void m456f(int r4) {
        InterfaceC0144DE r0 = this.f702Q;
        if (r0 == null) goto L5;
        ((C0699QA) r0).m1429a(r4);
    L5:
        ArrayList r02 = this.f701P;
        if (r02 == null) goto L13;
        int r03 = r02.size();
        int r1 = 0;
    L8:
        if (r1 >= r03) goto L17;
        InterfaceC0144DE r2 = (InterfaceC0144DE) this.f701P.get(r1);
        if (r2 == null) goto L12;
        ((C0699QA) r2).m1429a(r4);
    L12:
        r1 = r1 + 1;
        goto L8
    L17:
        return;
    }

    /* JADX INFO: renamed from: g */
    public final Rect m457g(View r3, Rect r4) {
        if (r4 != null) goto L4;
        r4 = new Rect();
    L4:
        if (r3 != null) goto L7;
        r4.set(0, 0, 0, 0);
        return r4;
    L7:
        r4.left = r3.getLeft();
        r4.right = r3.getRight();
        r4.top = r3.getTop();
        r4.bottom = r3.getBottom();
        ViewParent r32 = r3.getParent();
    L9:
        if ((r32 instanceof ViewGroup) == false) goto L12;
        if (r32 == this) goto L12;
        ViewGroup r33 = (ViewGroup) r32;
        int r0 = r4.left;
        r4.left = r33.getLeft() + r0;
        int r02 = r4.right;
        r4.right = r33.getRight() + r02;
        int r03 = r4.top;
        r4.top = r33.getTop() + r03;
        int r04 = r4.bottom;
        r4.bottom = r33.getBottom() + r04;
        r32 = r33.getParent();
    L12:
        return r4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0101CE r0 = new C0101CE(-1, -1);
        r0.f241c = 0.0f;
        return r0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0036At getAdapter() {
        return this.f709e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r1, int r2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f710f;
    }

    public int getOffscreenPageLimit() {
        return this.f725u;
    }

    public int getPageMargin() {
        return this.f715k;
    }

    /* JADX INFO: renamed from: h */
    public final C0058BE m458h(View r7) {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f706b;
        if (r0 >= r1.size()) goto L9;
        C0058BE r12 = (C0058BE) r1.get(r0);
        AbstractC0036At r2 = this.f709e;
        FrameLayout r3 = r12.f133a;
        ((C0355IA) r2).getClass();
        AbstractC0295Gu.m625r(-491941259114549L);
        AbstractC0295Gu.m625r(-491962733951029L);
        if (r7.equals(r3) == true) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r12;
    L9:
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final C0058BE m459i() {
        int r0 = getClientWidth();
        float r1 = 0.0f;
        if (r0 <= 0) goto L5;
        float r2 = getScrollX() / r0;
    L6:
        if (r0 <= 0) goto L8;
        float r3 = this.f715k / r0;
    L9:
        int r8 = 0;
        boolean r9 = true;
        C0058BE r7 = null;
        int r6 = -1;
        float r4 = 0.0f;
    L10:
        ArrayList r10 = this.f706b;
        if (r8 >= r10.size()) goto L29;
        C0058BE r11 = (C0058BE) r10.get(r8);
        if (r9 == true) goto L17;
        int r62 = r6 + 1;
        if (r11.f134b == r62) goto L17;
        float r12 = (r1 + r4) + r3;
        C0058BE r42 = this.f707c;
        r42.f137e = r12;
        r42.f134b = r62;
        this.f709e.getClass();
        r42.f136d = 1.0f;
        r8 = r8 - 1;
        C0058BE r63 = r42;
    L18:
        r1 = r63.f137e;
        float r43 = (r63.f136d + r1) + r3;
        if (r9 == true) goto L23;
        if (r2 < r1) goto L29;
    L23:
        if (r2 < r43) goto L28;
        if (r8 == (r10.size() - 1)) goto L28;
        int r44 = r63.f134b;
        float r72 = r63.f136d;
        r8 = r8 + 1;
        C0058BE r92 = r63;
        r6 = r44;
        r4 = r72;
        r7 = r92;
        r9 = false;
    L28:
        return r63;
    L17:
        r63 = r11;
    L29:
        return r7;
    L8:
        r3 = 0.0f;
        goto L9
    L5:
        r2 = 0.0f;
        goto L6
    }

    /* JADX INFO: renamed from: j */
    public final C0058BE m460j(int r4) {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f706b;
        if (r0 >= r1.size()) goto L9;
        C0058BE r12 = (C0058BE) r1.get(r0);
        if (r12.f134b == r4) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r12;
    L9:
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m461k() {
        int r1 = 0;
        if (this.f700O <= 0) goto L25;
        int r0 = getScrollX();
        int r3 = getPaddingLeft();
        int r4 = getPaddingRight();
        int r5 = getWidth();
        int r6 = getChildCount();
        int r7 = 0;
    L5:
        if (r7 >= r6) goto L25;
        View r8 = getChildAt(r7);
        C0101CE r9 = (C0101CE) r8.getLayoutParams();
        if (r9.f239a == false) goto L24;
        int r92 = r9.f240b & 7;
        if (r92 != 1) goto L12;
        int r93 = Math.max((r5 - r8.getMeasuredWidth()) / 2, r3);
    L17:
        int r11 = r93;
        int r94 = r3;
        r3 = r11;
    L20:
        int r32 = (r3 + r0) - r8.getLeft();
        if (r32 == 0) goto L23;
        r8.offsetLeftAndRight(r32);
    L23:
        r3 = r94;
        goto L24
    L12:
        if (r92 != 3) goto L14;
        r94 = r8.getWidth() + r3;
        goto L20
    L14:
        if (r92 == 5) goto L16;
        r94 = r3;
        goto L20
    L16:
        r93 = (r5 - r4) - r8.getMeasuredWidth();
        r4 = r4 + r8.getMeasuredWidth();
    L24:
        r7 = r7 + 1;
    L25:
        ArrayList r02 = this.f701P;
        if (r02 == null) goto L30;
        int r03 = r02.size();
    L28:
        if (r1 >= r03) goto L30;
        InterfaceC0144DE r33 = (InterfaceC0144DE) this.f701P.get(r1);
        r1 = r1 + 1;
    L30:
        this.f699N = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m462l(MotionEvent r4) {
        int r0 = r4.getActionIndex();
        if (r4.getPointerId(r0) != this.f690E) goto L11;
        if (r0 != 0) goto L6;
        int r02 = 1;
    L7:
        this.f686A = r4.getX(r02);
        this.f690E = r4.getPointerId(r02);
        VelocityTracker r42 = this.f691F;
        if (r42 == null) goto L12;
        r42.clear();
        return;
    L12:
        return;
    L6:
        r02 = 0;
        goto L7
    }

    /* JADX INFO: renamed from: m */
    public final boolean m463m() {
        AbstractC0036At r0 = this.f709e;
        if (r0 != null) goto L5;
    L8:
        return false;
    L5:
        if (this.f710f >= (((C0355IA) r0).f1191b.size() - 1)) goto L8;
        int r02 = this.f710f + 1;
        this.f724t = false;
        m471u(r02, 0, true, false);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m464n(int r3) {
        if (this.f706b.size() == 0) goto L5;
        C0058BE r32 = m459i();
        getClientWidth();
        int r33 = r32.f134b;
        this.f699N = false;
        m461k();
        if (this.f699N == false) goto L17;
        return true;
    L17:
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    L5:
        if (this.f698M == true) goto L9;
        this.f699N = false;
        m461k();
        if (this.f699N == true) goto L9;
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    L9:
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m465o(float r10) {
        float r0 = this.f686A - r10;
        this.f686A = r10;
        float r102 = getScrollX() + r0;
        float r02 = getClientWidth();
        float r1 = this.f719o * r02;
        float r2 = this.f720p * r02;
        ArrayList r3 = this.f706b;
        boolean r4 = false;
        C0058BE r5 = (C0058BE) r3.get(0);
        C0058BE r32 = (C0058BE) r3.get(r3.size() - 1);
        if (r5.f134b == 0) goto L5;
        r1 = r5.f137e * r02;
        boolean r52 = false;
    L7:
        if (r32.f134b == (((C0355IA) this.f709e).f1191b.size() - 1)) goto L9;
        r2 = r32.f137e * r02;
        boolean r33 = false;
    L11:
        if (r102 >= r1) goto L16;
        if (r52 == false) goto L14;
        this.f696K.onPull(Math.abs(r1 - r102) / r02);
        r4 = true;
    L14:
        r102 = r1;
    L20:
        int r12 = (int) r102;
        this.f686A = (r102 - r12) + this.f686A;
        scrollTo(r12, getScrollY());
        m464n(r12);
        return r4;
    L16:
        if (r102 <= r2) goto L20;
        if (r33 == false) goto L19;
        this.f697L.onPull(Math.abs(r102 - r2) / r02);
        r4 = true;
    L19:
        r102 = r2;
        goto L20
    L9:
        r33 = true;
        goto L11
    L5:
        r52 = true;
        goto L7
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f698M = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f703R);
        Scroller r0 = this.f712h;
        if (r0 != null) goto L5;
    L7:
        super.onDetachedFromWindow();
        return;
    L5:
        if (r0.isFinished() == true) goto L7;
        this.f712h.abortAnimation();
        goto L7
    }

    @Override // android.view.View
    public final void onDraw(Canvas r19) {
        super.onDraw(r19);
        if (this.f715k > 0) goto L5;
        return;
    L5:
        if (this.f716l == null) goto L32;
        ArrayList r1 = this.f706b;
        if (r1.size() > 0) goto L9;
        return;
    L9:
        if (this.f709e == null) goto L34;
        int r2 = getScrollX();
        float r5 = getWidth();
        float r4 = this.f715k / r5;
        int r6 = 0;
        C0058BE r7 = (C0058BE) r1.get(0);
        float r8 = r7.f137e;
        int r9 = r1.size();
        int r10 = r7.f134b;
        int r11 = ((C0058BE) r1.get(r9 - 1)).f134b;
    L11:
        if (r10 >= r11) goto L35;
    L12:
        int r12 = r7.f134b;
        if (r10 <= r12) goto L16;
        if (r6 >= r9) goto L16;
        r6 = r6 + 1;
        r7 = (C0058BE) r1.get(r6);
    L16:
        if (r10 != r12) goto L18;
        float r82 = r7.f137e;
        float r122 = r7.f136d;
        float r13 = (r82 + r122) * r5;
        r8 = (r82 + r122) + r4;
    L20:
        if ((this.f715k + r13) <= r2) goto L22;
        ArrayList r16 = r1;
        int r17 = r2;
        this.f716l.setBounds(Math.round(r13), this.f717m, Math.round(this.f715k + r13), this.f718n);
        this.f716l.draw(r19);
    L24:
        if (r13 > (r17 + r3)) goto L36;
        r10 = r10 + 1;
        r1 = r16;
        r2 = r17;
        goto L11
    L36:
        return;
    L22:
        r16 = r1;
        r17 = r2;
        goto L24
    L18:
        this.f709e.getClass();
        r13 = (r8 + 1.0f) * r5;
        r8 = (1.0f + r4) + r8;
        goto L20
    L35:
        return;
    L34:
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r13) {
        int r0 = r13.getAction() & 255;
        if (r0 != 3) goto L5;
    L72:
        m469s();
        return false;
    L5:
        if (r0 == 1) goto L72;
        if (r0 == 0) goto L15;
        if (this.f726v == false) goto L12;
        return true;
    L12:
        if (this.f727w == false) goto L15;
        return false;
    L15:
        if (r0 == 0) goto L58;
        if (r0 != 2) goto L18;
        int r02 = this.f690E;
        if (r02 == (-1)) goto L68;
        int r03 = r13.findPointerIndex(r02);
        float r3 = r13.getX(r03);
        float r4 = r3 - this.f686A;
        float r5 = Math.abs(r4);
        float r04 = r13.getY(r03);
        float r6 = Math.abs(r04 - this.f689D);
        if (r4 == 0.0f) goto L38;
        float r9 = this.f686A;
        if (r9 >= this.f729y) goto L30;
        if (r4 > 0.0f) goto L38;
    L30:
        if (r9 <= (getWidth() - this.f729y)) goto L35;
        if (r4 < 0.0f) goto L38;
    L35:
        if (m451c((int) r4, (int) r3, (int) r04, this, false) == false) goto L38;
        this.f686A = r3;
        this.f687B = r04;
        this.f727w = true;
        return false;
    L38:
        int r2 = this.f730z;
        float r42 = r2;
        if (r5 <= r42) goto L51;
        if ((r5 * 0.5f) <= r6) goto L51;
        this.f726v = true;
        ViewParent r43 = getParent();
        if (r43 == null) goto L45;
        r43.requestDisallowInterceptTouchEvent(true);
    L45:
        setScrollState(1);
        float r44 = this.f688C;
        float r22 = r2;
        if (r4 <= 0.0f) goto L48;
        float r45 = r44 + r22;
    L49:
        this.f686A = r45;
        this.f687B = r04;
        setScrollingCacheEnabled(true);
    L54:
        if (this.f726v == false) goto L68;
        if (m465o(r3) == false) goto L68;
        WeakHashMap r05 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        goto L68
    L48:
        r45 = r44 - r22;
    L51:
        if (r6 <= r42) goto L54;
        this.f727w = true;
    L68:
        if (this.f691F != null) goto L70;
        this.f691F = VelocityTracker.obtain();
    L70:
        this.f691F.addMovement(r13);
        return this.f726v;
    L18:
        if (r0 != 6) goto L68;
        m462l(r13);
        goto L68
    L58:
        float r06 = r13.getX();
        this.f688C = r06;
        this.f686A = r06;
        float r07 = r13.getY();
        this.f689D = r07;
        this.f687B = r07;
        this.f690E = r13.getPointerId(0);
        this.f727w = false;
        this.f713i = true;
        Scroller r08 = this.f712h;
        r08.computeScrollOffset();
        if (this.f704S == 2) goto L61;
    L66:
        m454d(false);
        this.f726v = false;
        goto L68
    L61:
        if (Math.abs(r08.getFinalX() - r08.getCurrX()) <= this.f695J) goto L66;
        r08.abortAnimation();
        this.f724t = false;
        m466p();
        this.f726v = true;
        ViewParent r09 = getParent();
        if (r09 == null) goto L65;
        r09.requestDisallowInterceptTouchEvent(true);
    L65:
        setScrollState(1);
        goto L68
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        int r1 = getChildCount();
        int r2 = r22 - r20;
        int r3 = r23 - r21;
        int r4 = getPaddingLeft();
        int r5 = getPaddingTop();
        int r6 = getPaddingRight();
        int r7 = getPaddingBottom();
        int r8 = getScrollX();
        int r10 = 0;
        int r11 = 0;
    L4:
        if (r10 >= r1) goto L33;
        View r13 = getChildAt(r10);
        if (r13.getVisibility() == 8) goto L32;
        C0101CE r12 = (C0101CE) r13.getLayoutParams();
        if (r12.f239a == false) goto L32;
        int r122 = r12.f240b;
        int r14 = r122 & 7;
        int r123 = r122 & 112;
        if (r14 != 1) goto L12;
        int r142 = Math.max((r2 - r13.getMeasuredWidth()) / 2, r4);
    L17:
        int r17 = r142;
        int r143 = r4;
        r4 = r17;
    L21:
        if (r123 != 16) goto L23;
        int r124 = Math.max((r3 - r13.getMeasuredHeight()) / 2, r5);
    L28:
        int r172 = r124;
        int r125 = r5;
        r5 = r172;
    L31:
        int r42 = r4 + r8;
        r13.layout(r42, r5, r13.getMeasuredWidth() + r42, r13.getMeasuredHeight() + r5);
        r11 = r11 + 1;
        r5 = r125;
        r4 = r143;
        goto L32
    L23:
        if (r123 != 48) goto L25;
        r125 = r13.getMeasuredHeight() + r5;
        goto L31
    L25:
        if (r123 == 80) goto L27;
        r125 = r5;
        goto L31
    L27:
        r124 = (r3 - r7) - r13.getMeasuredHeight();
        r7 = r7 + r13.getMeasuredHeight();
        goto L28
    L12:
        if (r14 != 3) goto L14;
        r143 = r13.getMeasuredWidth() + r4;
        goto L21
    L14:
        if (r14 == 5) goto L16;
        r143 = r4;
        goto L21
    L16:
        r142 = (r2 - r6) - r13.getMeasuredWidth();
        r6 = r6 + r13.getMeasuredWidth();
    L32:
        r10 = r10 + 1;
        goto L4
    L33:
        int r24 = (r2 - r4) - r6;
        int r62 = 0;
    L34:
        if (r62 >= r1) goto L46;
        View r82 = getChildAt(r62);
        if (r82.getVisibility() == 8) goto L45;
        C0101CE r9 = (C0101CE) r82.getLayoutParams();
        if (r9.f239a == true) goto L45;
        C0058BE r102 = m458h(r82);
        if (r102 == null) goto L45;
        float r132 = r24;
        int r103 = ((int) (r102.f137e * r132)) + r4;
        if (r9.f242d == false) goto L44;
        r9.f242d = false;
        r82.measure(View.MeasureSpec.makeMeasureSpec((int) (r132 * r9.f241c), 1073741824), View.MeasureSpec.makeMeasureSpec((r3 - r5) - r7, 1073741824));
    L44:
        r82.layout(r103, r5, r82.getMeasuredWidth() + r103, r82.getMeasuredHeight() + r5);
    L45:
        r62 = r62 + 1;
        goto L34
    L46:
        this.f717m = r5;
        this.f718n = r3 - r7;
        this.f700O = r11;
        if (this.f698M == false) goto L49;
        boolean r144 = false;
        m470t(this.f710f, 0, false, false);
    L50:
        this.f698M = r144;
        return;
    L49:
        r144 = false;
        goto L50
    }

    @Override // android.view.View
    public final void onMeasure(int r14, int r15) {
        int r0 = 0;
        setMeasuredDimension(View.getDefaultSize(0, r14), View.getDefaultSize(0, r15));
        int r142 = getMeasuredWidth();
        this.f729y = Math.min(r142 / 10, this.f728x);
        int r143 = (r142 - getPaddingLeft()) - getPaddingRight();
        int r152 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int r1 = getChildCount();
        int r2 = 0;
    L3:
        boolean r4 = true;
        int r5 = 1073741824;
        if (r2 >= r1) goto L48;
        View r6 = getChildAt(r2);
        if (r6.getVisibility() == 8) goto L47;
        C0101CE r3 = (C0101CE) r6.getLayoutParams();
        if (r3 == null) goto L47;
        if (r3.f239a == false) goto L47;
        int r7 = r3.f240b;
        int r8 = r7 & 7;
        int r72 = r7 & 112;
        if (r72 != 48) goto L14;
    L17:
        boolean r73 = true;
    L19:
        if (r8 != 3) goto L21;
    L24:
        int r82 = Integer.MIN_VALUE;
        if (r73 == false) goto L27;
        int r9 = Integer.MIN_VALUE;
        r82 = 1073741824;
    L30:
        int r10 = ((ViewGroup.LayoutParams) r3).width;
        if (r10 == (-2)) goto L35;
        if (r10 == (-1)) goto L34;
    L33:
        r82 = 1073741824;
    L36:
        int r32 = ((ViewGroup.LayoutParams) r3).height;
        if (r32 == (-2)) goto L41;
        if (r32 != (-1)) goto L42;
        r32 = r152;
    L42:
        r6.measure(View.MeasureSpec.makeMeasureSpec(r10, r82), View.MeasureSpec.makeMeasureSpec(r32, r5));
        if (r73 == false) goto L45;
        r152 = r152 - r6.getMeasuredHeight();
        goto L47
    L45:
        if (r4 == false) goto L47;
        r143 = r143 - r6.getMeasuredWidth();
        goto L47
    L41:
        r32 = r152;
        r5 = r9;
        goto L42
    L34:
        r10 = r143;
        goto L33
    L35:
        r10 = r143;
        goto L36
    L27:
        if (r4 == false) goto L29;
        r9 = 1073741824;
        goto L30
    L29:
        r9 = Integer.MIN_VALUE;
        goto L30
    L21:
        if (r8 == 5) goto L24;
        r4 = false;
        goto L24
    L14:
        if (r72 == 80) goto L17;
        r73 = false;
    L47:
        r2 = r2 + 1;
        goto L3
    L48:
        View.MeasureSpec.makeMeasureSpec(r143, 1073741824);
        this.f721q = View.MeasureSpec.makeMeasureSpec(r152, 1073741824);
        this.f722r = true;
        m466p();
        this.f722r = false;
        int r153 = getChildCount();
    L49:
        if (r0 >= r153) goto L58;
        View r12 = getChildAt(r0);
        if (r12.getVisibility() == 8) goto L57;
        C0101CE r22 = (C0101CE) r12.getLayoutParams();
        if (r22 != null) goto L55;
    L56:
        r12.measure(View.MeasureSpec.makeMeasureSpec((int) (r143 * r22.f241c), 1073741824), this.f721q);
        goto L57
    L55:
        if (r22.f239a == false) goto L56;
    L57:
        r0 = r0 + 1;
        goto L49
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r9, Rect r10) {
        int r0 = getChildCount();
        if ((r9 & 2) == 0) goto L5;
        int r1 = r0;
        int r02 = 0;
        int r4 = 1;
    L6:
        if (r02 == r1) goto L17;
        View r5 = getChildAt(r02);
        if (r5.getVisibility() != 0) goto L16;
        C0058BE r6 = m458h(r5);
        if (r6 == null) goto L16;
        if (r6.f134b != this.f710f) goto L16;
        if (r5.requestFocus(r9, r10) == false) goto L16;
        return true;
    L16:
        r02 = r02 + r4;
        goto L6
    L17:
        return false;
    L5:
        r02 = r0 - 1;
        r1 = -1;
        r4 = -1;
        goto L6
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r3) {
        if ((r3 instanceof C0187EE) == true) goto L6;
        super.onRestoreInstanceState(r3);
        return;
    L6:
        C0187EE r32 = (C0187EE) r3;
        super.onRestoreInstanceState(r32.f8397a);
        if (this.f709e == null) goto L10;
        m471u(r32.f571c, 0, false, true);
        return;
    L10:
        this.f711g = r32.f571c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0187EE r1 = new C0187EE(super.onSaveInstanceState());
        r1.f571c = this.f710f;
        AbstractC0036At r0 = this.f709e;
        if (r0 == null) goto L5;
        r0.getClass();
        r1.f572d = null;
    L5:
        return r1;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        if (r1 == r3) goto L6;
        int r22 = this.f715k;
        m468r(r1, r3, r22, r22);
        return;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r9) {
        boolean r1 = false;
        if (r9.getAction() == 0) goto L5;
    L7:
        AbstractC0036At r0 = this.f709e;
        if (r0 != null) goto L10;
    L76:
        return false;
    L10:
        if (((C0355IA) r0).f1191b.size() == 0) goto L76;
        if (this.f691F != null) goto L15;
        this.f691F = VelocityTracker.obtain();
    L15:
        this.f691F.addMovement(r9);
        int r02 = r9.getAction() & 255;
        if (r02 == 0) goto L72;
        if (r02 == 1) goto L55;
        if (r02 == 2) goto L33;
        if (r02 == 3) goto L30;
        if (r02 != 5) goto L25;
        int r03 = r9.getActionIndex();
        this.f686A = r9.getX(r03);
        this.f690E = r9.getPointerId(r03);
    L73:
        if (r1 == false) goto L75;
        WeakHashMap r92 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
    L75:
        return true;
    L25:
        if (r02 != 6) goto L73;
        m462l(r9);
        this.f686A = r9.getX(r9.findPointerIndex(this.f690E));
        goto L73
    L30:
        if (this.f726v == false) goto L73;
        m470t(this.f710f, 0, true, false);
        r1 = m469s();
        goto L73
    L33:
        if (this.f726v == true) goto L52;
        int r04 = r9.findPointerIndex(this.f690E);
        if (r04 != (-1)) goto L37;
        r1 = m469s();
        goto L73
    L37:
        float r3 = r9.getX(r04);
        float r4 = Math.abs(r3 - this.f686A);
        float r05 = r9.getY(r04);
        float r5 = Math.abs(r05 - this.f687B);
        int r6 = this.f730z;
        if (r4 <= r6) goto L52;
        if (r4 <= r5) goto L52;
        this.f726v = true;
        ViewParent r42 = getParent();
        if (r42 == null) goto L44;
        r42.requestDisallowInterceptTouchEvent(true);
    L44:
        float r43 = this.f688C;
        if ((r3 - r43) <= 0.0f) goto L47;
        float r44 = r43 + r6;
    L48:
        this.f686A = r44;
        this.f687B = r05;
        setScrollState(1);
        setScrollingCacheEnabled(true);
        ViewParent r06 = getParent();
        if (r06 == null) goto L52;
        r06.requestDisallowInterceptTouchEvent(true);
        goto L52
    L47:
        r44 = r43 - r6;
    L52:
        if (this.f726v == false) goto L73;
        r1 = m465o(r9.getX(r9.findPointerIndex(this.f690E)));
        goto L73
    L55:
        if (this.f726v == false) goto L73;
        VelocityTracker r07 = this.f691F;
        r07.computeCurrentVelocity(1000, this.f693H);
        int r08 = (int) r07.getXVelocity(this.f690E);
        this.f724t = true;
        int r32 = getClientWidth();
        int r45 = getScrollX();
        C0058BE r52 = m459i();
        float r33 = r32;
        int r7 = r52.f134b;
        float r46 = ((r45 / r33) - r52.f137e) / (r52.f136d + (this.f715k / r33));
        if (Math.abs((int) (r9.getX(r9.findPointerIndex(this.f690E)) - this.f688C)) <= this.f694I) goto L64;
        if (Math.abs(r08) <= this.f692G) goto L64;
        if (r08 > 0) goto L68;
        r7 = r7 + 1;
    L68:
        ArrayList r93 = this.f706b;
        if (r93.size() <= 0) goto L71;
        r7 = Math.max(((C0058BE) r93.get(0)).f134b, Math.min(r7, ((C0058BE) r93.get(r93.size() - 1)).f134b));
    L71:
        m471u(r7, r08, true, true);
        r1 = m469s();
    L64:
        if (r7 < this.f710f) goto L66;
        float r94 = 0.4f;
    L67:
        r7 = r7 + ((int) (r46 + r94));
        goto L68
    L66:
        r94 = 0.6f;
        goto L67
    L72:
        this.f712h.abortAnimation();
        this.f724t = false;
        m466p();
        float r09 = r9.getX();
        this.f688C = r09;
        this.f686A = r09;
        float r010 = r9.getY();
        this.f689D = r010;
        this.f687B = r010;
        this.f690E = r9.getPointerId(0);
        goto L73
    L5:
        if (r9.getEdgeFlags() == 0) goto L7;
        goto L7
    }

    /* JADX INFO: renamed from: p */
    public final void m466p() {
        m467q(this.f710f);
    }

    /* JADX INFO: renamed from: q */
    public final void m467q(int r22) {
        int r2 = this.f710f;
        if (r2 == r22) goto L5;
        C0058BE r23 = m460j(r2);
        this.f710f = r22;
    L7:
        if (this.f709e != null) goto L10;
        return;
    L10:
        if (this.f724t == false) goto L13;
        return;
    L13:
        if (getWindowToken() == null) goto L263;
        this.f709e.getClass();
        int r1 = this.f725u;
        int r4 = Math.max(0, this.f710f - r1);
        int r6 = ((C0355IA) this.f709e).f1191b.size();
        int r12 = Math.min(r6 - 1, this.f710f + r1);
        if (r6 != this.f705a) goto L210;
        int r7 = 0;
    L18:
        ArrayList r8 = this.f706b;
        if (r7 >= r8.size()) goto L25;
        C0058BE r9 = (C0058BE) r8.get(r7);
        int r10 = r9.f134b;
        int r11 = this.f710f;
        if (r10 >= r11) goto L22;
        r7 = r7 + 1;
        goto L18
    L22:
        if (r10 != r11) goto L25;
    L26:
        if (r9 != null) goto L29;
        if (r6 <= 0) goto L29;
        r9 = m452a(this.f710f, r7);
    L29:
        if (r9 == null) goto L166;
        int r112 = r7 - 1;
        if (r112 < 0) goto L33;
        C0058BE r122 = (C0058BE) r8.get(r112);
    L34:
        int r13 = getClientWidth();
        if (r13 > 0) goto L37;
        float r3 = 0.0f;
    L38:
        int r5 = this.f710f - 1;
        float r15 = 0.0f;
    L40:
        if (r5 < 0) goto L45;
        if (r15 < r3) goto L56;
        if (r5 >= r4) goto L56;
        if (r122 == null) goto L45;
        if (r5 != r122.f134b) goto L65;
        if (r122.f135c == true) goto L65;
        r8.remove(r112);
        AbstractC0036At r102 = this.f709e;
        FrameLayout r123 = r122.f133a;
        ((C0355IA) r102).getClass();
        AbstractC0295Gu.m625r(-491503172450357L);
        AbstractC0295Gu.m625r(-491546122123317L);
        removeView(r123);
        r112 = r112 - 1;
        r7 = r7 - 1;
        if (r112 < 0) goto L53;
        C0058BE r103 = (C0058BE) r8.get(r112);
    L54:
        r122 = r103;
    L53:
        r103 = null;
    L65:
        r5 = r5 - 1;
    L56:
        if (r122 != null) goto L58;
    L62:
        r15 = r15 + m452a(r5, r112 + 1).f136d;
        r7 = r7 + 1;
        if (r112 < 0) goto L53;
        r103 = (C0058BE) r8.get(r112);
        goto L54
    L58:
        if (r5 != r122.f134b) goto L62;
        r15 = r15 + r122.f136d;
        r112 = r112 - 1;
        if (r112 < 0) goto L53;
        r103 = (C0058BE) r8.get(r112);
    L45:
        float r20 = 0.0f;
        float r32 = r9.f136d;
        int r42 = r7 + 1;
        if (r32 < 2.0f) goto L69;
    L100:
        int r14 = ((C0355IA) this.f709e).f1191b.size();
        int r33 = getClientWidth();
        if (r33 <= 0) goto L103;
        float r52 = this.f715k / r33;
    L105:
        if (r23 == null) goto L137;
        int r62 = r23.f134b;
        int r104 = r9.f134b;
        if (r62 >= r104) goto L123;
        float r105 = (r23.f137e + r23.f136d) + r52;
        int r63 = r62 + 1;
        int r24 = 0;
    L110:
        if (r63 > r9.f134b) goto L137;
        if (r24 >= r8.size()) goto L137;
        Object r113 = r8.get(r24);
    L114:
        C0058BE r114 = (C0058BE) r113;
        if (r63 <= r114.f134b) goto L120;
        if (r24 >= (r8.size() - 1)) goto L120;
        r24 = r24 + 1;
        r113 = r8.get(r24);
    L120:
        if (r63 >= r114.f134b) goto L122;
        this.f709e.getClass();
        r105 = r105 + (1.0f + r52);
        r63 = r63 + 1;
        goto L120
    L122:
        r114.f137e = r105;
        r105 = r105 + (r114.f136d + r52);
        r63 = r63 + 1;
        goto L110
    L123:
        if (r62 <= r104) goto L137;
        int r106 = r8.size() - 1;
        float r25 = r23.f137e;
    L125:
        r62 = r62 - 1;
        if (r62 < r9.f134b) goto L137;
        if (r106 < 0) goto L137;
        Object r115 = r8.get(r106);
    L129:
        C0058BE r116 = (C0058BE) r115;
        if (r62 >= r116.f134b) goto L134;
        if (r106 <= 0) goto L134;
        r106 = r106 - 1;
        r115 = r8.get(r106);
    L134:
        if (r62 <= r116.f134b) goto L136;
        this.f709e.getClass();
        r25 = r25 - (1.0f + r52);
        r62 = r62 - 1;
        goto L134
    L136:
        r25 = r25 - (r116.f136d + r52);
        r116.f137e = r25;
    L137:
        int r26 = r8.size();
        float r64 = r9.f137e;
        int r107 = r9.f134b;
        int r117 = r107 - 1;
        if (r107 != 0) goto L140;
        float r124 = r64;
    L141:
        this.f719o = r124;
        int r16 = r14 - 1;
        if (r107 != r16) goto L144;
        float r108 = (r9.f136d + r64) - 1.0f;
    L145:
        this.f720p = r108;
        int r72 = r7 - 1;
    L146:
        if (r72 < 0) goto L155;
        C0058BE r109 = (C0058BE) r8.get(r72);
    L148:
        int r125 = r109.f134b;
        if (r117 <= r125) goto L151;
        r117 = r117 - 1;
        this.f709e.getClass();
        r64 = r64 - (1.0f + r52);
        goto L148
    L151:
        r64 = r64 - (r109.f136d + r52);
        r109.f137e = r64;
        if (r125 != 0) goto L154;
        this.f719o = r64;
    L154:
        r72 = r72 - 1;
        r117 = r117 - 1;
        goto L146
    L155:
        float r65 = (r9.f137e + r9.f136d) + r52;
        int r73 = r9.f134b;
    L156:
        r73 = r73 + 1;
        if (r42 >= r26) goto L165;
        C0058BE r92 = (C0058BE) r8.get(r42);
    L159:
        int r1010 = r92.f134b;
        if (r73 >= r1010) goto L162;
        r73 = r73 + 1;
        this.f709e.getClass();
        r65 = r65 + (1.0f + r52);
        goto L159
    L162:
        if (r1010 != r16) goto L164;
        this.f720p = (r92.f136d + r65) - 1.0f;
    L164:
        r92.f137e = r65;
        r65 = r65 + (r92.f136d + r52);
        r42 = r42 + 1;
        goto L156
    L165:
        this.f709e.getClass();
    L167:
        this.f709e.getClass();
        int r17 = getChildCount();
        int r27 = 0;
    L168:
        if (r27 >= r17) goto L178;
        View r34 = getChildAt(r27);
        C0101CE r43 = (C0101CE) r34.getLayoutParams();
        r43.getClass();
        if (r43.f239a == true) goto L176;
        if (r43.f241c != r20) goto L176;
        C0058BE r35 = m458h(r34);
        if (r35 == null) goto L176;
        r43.f241c = r35.f136d;
    L176:
        r27 = r27 + 1;
        goto L168
    L178:
        if (hasFocus() == false) goto L204;
        View r18 = findFocus();
        if (r18 == null) goto L189;
    L181:
        Object r28 = r18.getParent();
        if (r28 == this) goto L188;
        if (r28 == null) goto L189;
        if ((r28 instanceof View) == false) goto L189;
        r18 = (View) r28;
        goto L181
    L188:
        C0058BE r36 = m458h(r18);
    L190:
        if (r36 != null) goto L192;
    L193:
        int r53 = 0;
    L195:
        if (r53 >= getChildCount()) goto L264;
        View r19 = getChildAt(r53);
        C0058BE r29 = m458h(r19);
        if (r29 == null) goto L203;
        if (r29.f134b != this.f710f) goto L203;
        if (r19.requestFocus(2) == false) goto L203;
        return;
    L203:
        r53 = r53 + 1;
        goto L195
    L264:
        return;
    L192:
        if (r36.f134b != this.f710f) goto L193;
        return;
    L189:
        r36 = null;
        goto L190
    L204:
        return;
    L144:
        r108 = Float.MAX_VALUE;
        goto L145
    L140:
        r124 = -3.4028235E38f;
        goto L141
    L103:
        r52 = 0.0f;
        goto L105
    L69:
        if (r42 >= r8.size()) goto L71;
        C0058BE r54 = (C0058BE) r8.get(r42);
    L72:
        if (r13 > 0) goto L74;
        float r1011 = 0.0f;
    L75:
        int r118 = this.f710f + 1;
        int r126 = r42;
    L76:
        if (r118 >= r6) goto L100;
        if (r32 < r1011) goto L90;
        if (r118 <= r12) goto L90;
        if (r54 == null) goto L100;
        if (r118 != r54.f134b) goto L99;
        if (r54.f135c == true) goto L99;
        r8.remove(r126);
        AbstractC0036At r132 = this.f709e;
        FrameLayout r55 = r54.f133a;
        ((C0355IA) r132).getClass();
        AbstractC0295Gu.m625r(-491503172450357L);
        AbstractC0295Gu.m625r(-491546122123317L);
        removeView(r55);
        if (r126 >= r8.size()) goto L89;
        r54 = (C0058BE) r8.get(r126);
    L89:
        r54 = null;
    L99:
        r118 = r118 + 1;
    L90:
        if (r54 != null) goto L92;
    L96:
        C0058BE r56 = m452a(r118, r126);
        r126 = r126 + 1;
        r32 = r32 + r56.f136d;
        if (r126 >= r8.size()) goto L89;
        r54 = (C0058BE) r8.get(r126);
        goto L99
    L92:
        if (r118 != r54.f134b) goto L96;
        r32 = r32 + r54.f136d;
        r126 = r126 + 1;
        if (r126 >= r8.size()) goto L89;
        r54 = (C0058BE) r8.get(r126);
        goto L99
    L74:
        r1011 = (getPaddingRight() / r13) + 2.0f;
        goto L75
    L71:
        r54 = null;
        goto L72
    L37:
        r3 = (getPaddingLeft() / r13) + (2.0f - r9.f136d);
        goto L38
    L33:
        r122 = null;
        goto L34
    L166:
        r20 = 0.0f;
    L25:
        r9 = null;
        goto L26
    L210:
        String r110 = getResources().getResourceName(getId());     // Catch: Resources.NotFoundException -> L207
    L209:
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f705a + ", found: " + r6 + " Pager id: " + r110 + " Pager class: " + C0230FE.class + " Problematic adapter: " + this.f709e.getClass());
    L207:
        r110 = Integer.toHexString(getId());
        goto L209
    L263:
        return;
    L5:
        r23 = null;
        goto L7
    }

    /* JADX INFO: renamed from: r */
    public final void m468r(int r2, int r3, int r4, int r5) {
        if (r3 > 0) goto L4;
    L11:
        C0058BE r32 = m460j(this.f710f);
        if (r32 == null) goto L14;
        float r33 = Math.min(r32.f137e, this.f720p);
    L15:
        int r22 = (int) (r33 * ((r2 - getPaddingLeft()) - getPaddingRight()));
        if (r22 == getScrollX()) goto L19;
        m454d(false);
        scrollTo(r22, getScrollY());
        return;
    L19:
        return;
    L14:
        r33 = 0.0f;
        goto L15
    L4:
        if (this.f706b.isEmpty() == true) goto L11;
        if (this.f712h.isFinished() == true) goto L9;
        this.f712h.setFinalX(getCurrentItem() * getClientWidth());
        return;
    L9:
        scrollTo((int) ((getScrollX() / (((r3 - getPaddingLeft()) - getPaddingRight()) + r5)) * (((r2 - getPaddingLeft()) - getPaddingRight()) + r4)), getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View r2) {
        if (this.f722r == false) goto L6;
        removeViewInLayout(r2);
        return;
    L6:
        super.removeView(r2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m469s() {
        this.f690E = -1;
        this.f726v = false;
        this.f727w = false;
        VelocityTracker r1 = this.f691F;
        if (r1 == null) goto L5;
        r1.recycle();
        this.f691F = null;
    L5:
        this.f696K.onRelease();
        this.f697L.onRelease();
        if (this.f696K.isFinished() == false) goto L8;
        return true;
    L8:
        if (this.f697L.isFinished() == true) goto L13;
        return false;
    L13:
        return true;
    }

    public void setAdapter(AbstractC0036At r8) {
        ArrayList r0 = this.f706b;
        AbstractC0036At r1 = this.f709e;
        if (r1 == null) goto L21;
        monitor-enter(r1);
        monitor-exit(r1);     // Catch: Throwable -> L18
        this.f709e.getClass();
        int r12 = 0;
    L8:
        if (r12 >= r0.size()) goto L10;
        C0058BE r4 = (C0058BE) r0.get(r12);
        AbstractC0036At r5 = this.f709e;
        int r6 = r4.f134b;
        FrameLayout r42 = r4.f133a;
        ((C0355IA) r5).getClass();
        AbstractC0295Gu.m625r(-491503172450357L);
        AbstractC0295Gu.m625r(-491546122123317L);
        removeView(r42);
        r12 = r12 + 1;
        goto L8
    L10:
        this.f709e.getClass();
        r0.clear();
        int r02 = 0;
    L12:
        if (r02 >= getChildCount()) goto L17;
        if (((C0101CE) getChildAt(r02).getLayoutParams()).f239a == true) goto L16;
        removeViewAt(r02);
        r02 = r02 - 1;
    L16:
        r02 = r02 + 1;
        goto L12
    L17:
        this.f710f = 0;
        scrollTo(0, 0);
    L18:
        th = move-exception;
        throw th;
    L21:
        this.f709e = r8;
        this.f705a = 0;
        if (r8 != null) goto L24;
        return;
    L24:
        if (this.f714j != null) goto L26;
        this.f714j = new C0160Do(1, this);
    L26:
        AbstractC0036At r82 = this.f709e;
        monitor-enter(r82);
        monitor-exit(r82);     // Catch: Throwable -> L38
        this.f724t = false;
        boolean r83 = this.f698M;
        this.f698M = true;
        this.f705a = ((C0355IA) this.f709e).f1191b.size();
        if (this.f711g < 0) goto L33;
        this.f709e.getClass();
        m471u(this.f711g, 0, false, true);
        this.f711g = -1;
        return;
    L33:
        if (r83 == true) goto L36;
        m466p();
        return;
    L36:
        requestLayout();
        return;
    L38:
        th = move-exception;
        throw th;
    }

    public void setCurrentItem(int r3) {
        this.f724t = false;
        m471u(r3, 0, !this.f698M, false);
    }

    public void setOffscreenPageLimit(int r2) {
        if (r2 >= 1) goto L6;
        r2 = 1;
    L6:
        if (r2 == this.f725u) goto L9;
        this.f725u = r2;
        m466p();
        return;
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0144DE r1) {
        this.f702Q = r1;
    }

    public void setPageMargin(int r3) {
        int r0 = this.f715k;
        this.f715k = r3;
        int r1 = getWidth();
        m468r(r1, r1, r3, r0);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable r1) {
        this.f716l = r1;
        if (r1 == null) goto L5;
        refreshDrawableState();
    L5:
        if (r1 != null) goto L7;
        boolean r12 = true;
    L8:
        setWillNotDraw(r12);
        invalidate();
        return;
    L7:
        r12 = false;
        goto L8
    }

    public void setScrollState(int r3) {
        if (this.f704S == r3) goto L12;
        this.f704S = r3;
        ArrayList r32 = this.f701P;
        if (r32 == null) goto L10;
        int r33 = r32.size();
        int r0 = 0;
    L8:
        if (r0 >= r33) goto L13;
        InterfaceC0144DE r1 = (InterfaceC0144DE) this.f701P.get(r0);
        r0 = r0 + 1;
        goto L8
    L13:
        return;
    L10:
        return;
    }

    /* JADX INFO: renamed from: t */
    public final void m470t(int r11, int r12, boolean r13, boolean r14) {
        C0058BE r0 = m460j(r11);
        if (r0 == null) goto L5;
        int r02 = (int) (Math.max(this.f719o, Math.min(r0.f137e, this.f720p)) * getClientWidth());
    L6:
        if (r13 == true) goto L8;
        if (r14 == false) goto L35;
        m456f(r11);
    L35:
        m454d(false);
        scrollTo(r02, 0);
        m464n(r02);
        return;
    L8:
        if (getChildCount() != 0) goto L10;
        setScrollingCacheEnabled(false);
    L30:
        if (r14 == false) goto L37;
        m456f(r11);
        return;
    L37:
        return;
    L10:
        Scroller r132 = this.f712h;
        if (r132 != null) goto L13;
    L20:
        int r2 = getScrollX();
    L19:
        int r4 = r2;
        int r5 = getScrollY();
        int r6 = r02 - r4;
        int r7 = 0 - r5;
        if (r6 != 0) goto L25;
        if (r7 != 0) goto L25;
        m454d(false);
        m466p();
        setScrollState(0);
    L25:
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int r133 = getClientWidth();
        int r03 = r133 / 2;
        float r134 = r133;
        float r04 = r03;
        float r22 = (((float) Math.sin((Math.min(1.0f, (Math.abs(r6) * 1.0f) / r134) - 0.5f) * 0.47123894f)) * r04) + r04;
        int r122 = Math.abs(r12);
        if (r122 <= 0) goto L28;
        int r123 = Math.round(Math.abs(r22 / r122) * 1000.0f) * 4;
    L29:
        int r8 = Math.min(r123, BannerConfig.SCROLL_TIME);
        this.f713i = false;
        this.f712h.startScroll(r4, r5, r6, r7, r8);
        WeakHashMap r124 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        goto L30
    L28:
        this.f709e.getClass();
        r123 = (int) (((Math.abs(r6) / ((r134 * 1.0f) + this.f715k)) + 1.0f) * 100.0f);
        goto L29
    L13:
        if (r132.isFinished() == true) goto L20;
        if (this.f713i == false) goto L17;
        r2 = r132.getCurrX();
    L18:
        r132.abortAnimation();
        setScrollingCacheEnabled(false);
        goto L19
    L17:
        r2 = r132.getStartX();
        goto L18
    L5:
        r02 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: u */
    public final void m471u(int r6, int r7, boolean r8, boolean r9) {
        AbstractC0036At r0 = this.f709e;
        boolean r1 = false;
        if (r0 != null) goto L5;
    L41:
        setScrollingCacheEnabled(false);
        return;
    L5:
        if (((C0355IA) r0).f1191b.size() <= 0) goto L41;
        ArrayList r02 = this.f706b;
        if (r9 == true) goto L16;
        if (this.f710f != r6) goto L16;
        if (r02.size() == 0) goto L16;
        setScrollingCacheEnabled(false);
        return;
    L16:
        if (r6 >= 0) goto L19;
        r6 = 0;
    L21:
        int r2 = this.f725u;
        int r3 = this.f710f;
        if (r6 <= (r3 + r2)) goto L24;
    L25:
        int r22 = 0;
    L27:
        if (r22 >= r02.size()) goto L30;
        ((C0058BE) r02.get(r22)).f135c = true;
        r22 = r22 + 1;
    L30:
        if (this.f710f == r6) goto L33;
        r1 = true;
    L33:
        if (this.f698M == false) goto L39;
        this.f710f = r6;
        if (r1 == false) goto L37;
        m456f(r6);
    L37:
        requestLayout();
        return;
    L39:
        m467q(r6);
        m470t(r6, r7, r8, r1);
        return;
    L24:
        if (r6 >= (r3 - r2)) goto L30;
    L19:
        if (r6 < ((C0355IA) this.f709e).f1191b.size()) goto L21;
        r6 = ((C0355IA) this.f709e).f1191b.size() - 1;
        goto L21
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 == this.f716l) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r4) {
        Context r1 = getContext();
        C0101CE r0 = new C0101CE(r1, r4);
        r0.f241c = 0.0f;
        TypedArray r42 = r1.obtainStyledAttributes(r4, f683T);
        r0.f240b = r42.getInteger(0, 48);
        r42.recycle();
        return r0;
    }

    public void setPageMarginDrawable(int r2) {
        setPageMarginDrawable(getContext().getDrawable(r2));
    }
}
