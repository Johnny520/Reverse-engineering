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
    public static final int[] f683T = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: U */
    public static final C0963Wb f684U = new C0963Wb(14);

    /* JADX INFO: renamed from: V */
    public static final InterpolatorC0844Tl f685V = new InterpolatorC0844Tl(4);

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

    public C0230FE(Activity activity) {
        super(activity);
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
        Context context = getContext();
        this.f712h = new Scroller(context, f685V);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f730z = viewConfiguration.getScaledPagingTouchSlop();
        this.f692G = (int) (400.0f * f);
        this.f693H = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f696K = new EdgeEffect(context);
        this.f697L = new EdgeEffect(context);
        this.f694I = (int) (25.0f * f);
        this.f695J = (int) (2.0f * f);
        this.f728x = (int) (f * 16.0f);
        AbstractC2185lE.m4399l(this, new C1486h8(4, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        AbstractC1360eE.m2640l(this, new C0299Gy(this));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m451c(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i5 = i2 + scrollX;
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m451c(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                break;
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f723s != z) {
            this.f723s = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0058BE m452a(int i, int i2) {
        C0058BE c0058be = new C0058BE();
        c0058be.f134b = i;
        C0355IA c0355ia = (C0355IA) this.f709e;
        c0355ia.getClass();
        AbstractC0295Gu.m625r(-491979913820213L);
        Context context = c0355ia.f1190a;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(60), AbstractC0295Gu.m616i(60));
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        progressBar.setIndeterminate(true);
        C0613OA c0613oa = new C0613OA(context);
        c0613oa.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c0613oa.setTag(AbstractC0295Gu.m625r(-492022863493173L) + i);
        frameLayout.addView(c0613oa);
        frameLayout.addView(progressBar);
        ComponentCallbacks2C1273a.m2414c(context).m2833n((String) c0355ia.f1191b.get(i)).mo2301a(((C2252mw) ((C2252mw) new C2252mw().m5318m(C2457re.f8656b, new C2804zh(), true)).m5316k()).m5312f(io.github.cherrywechat.R.drawable.ic_theme)).m2299B(new C1461gk(1, progressBar)).m2298A(c0613oa);
        addView(frameLayout);
        c0058be.f133a = frameLayout;
        this.f709e.getClass();
        c0058be.f136d = 1.0f;
        ArrayList arrayList = this.f706b;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(c0058be);
            return c0058be;
        }
        arrayList.add(i2, c0058be);
        return c0058be;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C0058BE c0058beM458h;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c0058beM458h = m458h(childAt)) != null && c0058beM458h.f134b == this.f710f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        C0058BE c0058beM458h;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0058beM458h = m458h(childAt)) != null && c0058beM458h.f134b == this.f710f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        C0101CE c0101ce = (C0101CE) layoutParams;
        boolean z = c0101ce.f239a | (view.getClass().getAnnotation(InterfaceC0015AE.class) != null);
        c0101ce.f239a = z;
        if (!this.f722r) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0101ce.f242d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m453b(int i) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
            }
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean z = true;
        boolean zM463m = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f708d;
            if (i == 17) {
                int i2 = m457g(viewFindNextFocus, rect).left;
                int i3 = m457g(viewFindFocus, rect).left;
                if (viewFindFocus == null || i2 < i3) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    int i4 = this.f710f;
                    if (i4 > 0) {
                        this.f724t = false;
                        m471u(i4 - 1, 0, true, false);
                    }
                    zM463m = z;
                }
            } else if (i == 66) {
                zRequestFocus = (viewFindFocus == null || m457g(viewFindNextFocus, rect).left > m457g(viewFindFocus, rect).left) ? viewFindNextFocus.requestFocus() : m463m();
            }
            zM463m = zRequestFocus;
        } else if (i == 17 || i == 1) {
            int i5 = this.f710f;
            if (i5 > 0) {
                this.f724t = false;
                m471u(i5 - 1, 0, true, false);
            } else {
                z = false;
            }
            zM463m = z;
        } else if (i == 66 || i == 2) {
            zM463m = m463m();
        }
        if (zM463m) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM463m;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f709e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f719o)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f720p));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0101CE) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f713i = true;
        Scroller scroller = this.f712h;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            m454d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m464n(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: d */
    public final void m454d(boolean z) {
        boolean z2 = this.f704S == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            Scroller scroller = this.f712h;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m464n(currX);
                    }
                }
            }
        }
        this.f724t = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f706b;
            if (i >= arrayList.size()) {
                break;
            }
            C0058BE c0058be = (C0058BE) arrayList.get(i);
            if (c0058be.f135c) {
                c0058be.f135c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            RunnableC0431K0 runnableC0431K0 = this.f703R;
            if (!z) {
                runnableC0431K0.run();
            } else {
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                postOnAnimation(runnableC0431K0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM453b;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zM453b = false;
                if (!zM453b) {
                    return false;
                }
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        zM453b = keyEvent.hasModifiers(2) ? m463m() : m453b(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            zM453b = m453b(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zM453b = m453b(1);
                        }
                    }
                    if (!zM453b) {
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i = this.f710f;
                        if (i > 0) {
                            this.f724t = false;
                            m471u(i - 1, 0, true, false);
                            zM453b = true;
                        }
                    } else {
                        zM453b = m453b(17);
                    }
                    if (!zM453b) {
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0058BE c0058beM458h;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0058beM458h = m458h(childAt)) != null && c0058beM458h.f134b == this.f710f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC0036At abstractC0036At;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f697L;
        EdgeEffect edgeEffect2 = this.f696K;
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC0036At = this.f709e) != null && ((C0355IA) abstractC0036At).f1191b.size() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f719o * width);
                edgeEffect2.setSize(height, width);
                zDraw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f720p + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f716l;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public final void m455e() {
        int size = ((C0355IA) this.f709e).f1191b.size();
        this.f705a = size;
        ArrayList arrayList = this.f706b;
        boolean z = arrayList.size() < (this.f725u * 2) + 1 && arrayList.size() < size;
        int i = this.f710f;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C0058BE c0058be = (C0058BE) arrayList.get(i2);
            AbstractC0036At abstractC0036At = this.f709e;
            FrameLayout frameLayout = c0058be.f133a;
            abstractC0036At.getClass();
        }
        Collections.sort(arrayList, f684U);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C0101CE c0101ce = (C0101CE) getChildAt(i3).getLayoutParams();
                if (!c0101ce.f239a) {
                    c0101ce.f241c = 0.0f;
                }
            }
            m471u(i, 0, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m456f(int i) {
        InterfaceC0144DE interfaceC0144DE = this.f702Q;
        if (interfaceC0144DE != null) {
            ((C0699QA) interfaceC0144DE).m1429a(i);
        }
        ArrayList arrayList = this.f701P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0144DE interfaceC0144DE2 = (InterfaceC0144DE) this.f701P.get(i2);
                if (interfaceC0144DE2 != null) {
                    ((C0699QA) interfaceC0144DE2).m1429a(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Rect m457g(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0101CE c0101ce = new C0101CE(-1, -1);
        c0101ce.f241c = 0.0f;
        return c0101ce;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0036At getAdapter() {
        return this.f709e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
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
    public final C0058BE m458h(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f706b;
            if (i >= arrayList.size()) {
                return null;
            }
            C0058BE c0058be = (C0058BE) arrayList.get(i);
            AbstractC0036At abstractC0036At = this.f709e;
            FrameLayout frameLayout = c0058be.f133a;
            ((C0355IA) abstractC0036At).getClass();
            AbstractC0295Gu.m625r(-491941259114549L);
            AbstractC0295Gu.m625r(-491962733951029L);
            if (view.equals(frameLayout)) {
                return c0058be;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return r7;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0058BE m459i() {
        C0058BE c0058be;
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f715k / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        C0058BE c0058be2 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f706b;
            if (i2 >= arrayList.size()) {
                break;
            }
            C0058BE c0058be3 = (C0058BE) arrayList.get(i2);
            if (z || c0058be3.f134b == (i = i3 + 1)) {
                c0058be = c0058be3;
            } else {
                float f4 = f + f3 + f2;
                C0058BE c0058be4 = this.f707c;
                c0058be4.f137e = f4;
                c0058be4.f134b = i;
                this.f709e.getClass();
                c0058be4.f136d = 1.0f;
                i2--;
                c0058be = c0058be4;
            }
            f = c0058be.f137e;
            float f5 = c0058be.f136d + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f5 || i2 == arrayList.size() - 1) {
                break;
            }
            int i4 = c0058be.f134b;
            float f6 = c0058be.f136d;
            i2++;
            C0058BE c0058be5 = c0058be;
            i3 = i4;
            f3 = f6;
            c0058be2 = c0058be5;
            z = false;
        }
        return c0058be;
    }

    /* JADX INFO: renamed from: j */
    public final C0058BE m460j(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f706b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C0058BE c0058be = (C0058BE) arrayList.get(i2);
            if (c0058be.f134b == i) {
                return c0058be;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m461k() {
        int iMax;
        int width;
        int left;
        if (this.f700O > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                C0101CE c0101ce = (C0101CE) childAt.getLayoutParams();
                if (c0101ce.f239a) {
                    int i2 = c0101ce.f240b & 7;
                    if (i2 != 1) {
                        if (i2 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i2 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i3 = iMax;
                    width = paddingLeft;
                    paddingLeft = i3;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = width;
                }
            }
        }
        ArrayList arrayList = this.f701P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
            }
        }
        this.f699N = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m462l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f690E) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f686A = motionEvent.getX(i);
            this.f690E = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f691F;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m463m() {
        AbstractC0036At abstractC0036At = this.f709e;
        if (abstractC0036At == null || this.f710f >= ((C0355IA) abstractC0036At).f1191b.size() - 1) {
            return false;
        }
        int i = this.f710f + 1;
        this.f724t = false;
        m471u(i, 0, true, false);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m464n(int i) {
        if (this.f706b.size() == 0) {
            if (!this.f698M) {
                this.f699N = false;
                m461k();
                if (!this.f699N) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        C0058BE c0058beM459i = m459i();
        getClientWidth();
        int i2 = c0058beM459i.f134b;
        this.f699N = false;
        m461k();
        if (this.f699N) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: o */
    public final boolean m465o(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f686A - f;
        this.f686A = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f719o * clientWidth;
        float f4 = this.f720p * clientWidth;
        ArrayList arrayList = this.f706b;
        boolean z3 = false;
        C0058BE c0058be = (C0058BE) arrayList.get(0);
        C0058BE c0058be2 = (C0058BE) arrayList.get(arrayList.size() - 1);
        if (c0058be.f134b != 0) {
            f3 = c0058be.f137e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0058be2.f134b != ((C0355IA) this.f709e).f1191b.size() - 1) {
            f4 = c0058be2.f137e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f696K.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f697L.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f686A = (scrollX - i) + this.f686A;
        scrollTo(i, getScrollY());
        m464n(i);
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f698M = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f703R);
        Scroller scroller = this.f712h;
        if (scroller != null && !scroller.isFinished()) {
            this.f712h.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        ArrayList arrayList;
        int i2;
        super.onDraw(canvas);
        if (this.f715k <= 0 || this.f716l == null) {
            return;
        }
        ArrayList arrayList2 = this.f706b;
        if (arrayList2.size() <= 0 || this.f709e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f2 = this.f715k / width;
        int i3 = 0;
        C0058BE c0058be = (C0058BE) arrayList2.get(0);
        float f3 = c0058be.f137e;
        int size = arrayList2.size();
        int i4 = c0058be.f134b;
        int i5 = ((C0058BE) arrayList2.get(size - 1)).f134b;
        while (i4 < i5) {
            while (true) {
                i = c0058be.f134b;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                c0058be = (C0058BE) arrayList2.get(i3);
            }
            if (i4 == i) {
                float f4 = c0058be.f137e;
                float f5 = c0058be.f136d;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                this.f709e.getClass();
                f = (f3 + 1.0f) * width;
                f3 = 1.0f + f2 + f3;
            }
            if (this.f715k + f > scrollX) {
                arrayList = arrayList2;
                i2 = scrollX;
                this.f716l.setBounds(Math.round(f), this.f717m, Math.round(this.f715k + f), this.f718n);
                this.f716l.draw(canvas);
            } else {
                arrayList = arrayList2;
                i2 = scrollX;
            }
            if (f > i2 + r3) {
                return;
            }
            i4++;
            arrayList2 = arrayList;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m469s();
            return false;
        }
        if (action != 0) {
            if (this.f726v) {
                return true;
            }
            if (this.f727w) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f688C = x;
            this.f686A = x;
            float y = motionEvent.getY();
            this.f689D = y;
            this.f687B = y;
            this.f690E = motionEvent.getPointerId(0);
            this.f727w = false;
            this.f713i = true;
            Scroller scroller = this.f712h;
            scroller.computeScrollOffset();
            if (this.f704S != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f695J) {
                m454d(false);
                this.f726v = false;
            } else {
                scroller.abortAnimation();
                this.f724t = false;
                m466p();
                this.f726v = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f690E;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f686A;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f689D);
                if (f != 0.0f) {
                    float f2 = this.f686A;
                    if ((f2 >= this.f729y || f <= 0.0f) && ((f2 <= getWidth() - this.f729y || f >= 0.0f) && m451c((int) f, (int) x2, (int) y2, this, false))) {
                        this.f686A = x2;
                        this.f687B = y2;
                        this.f727w = true;
                        return false;
                    }
                }
                int i2 = this.f730z;
                float f3 = i2;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.f726v = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.f688C;
                    float f5 = i2;
                    this.f686A = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.f687B = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.f727w = true;
                }
                if (this.f726v && m465o(x2)) {
                    WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m462l(motionEvent);
        }
        if (this.f691F == null) {
            this.f691F = VelocityTracker.obtain();
        }
        this.f691F.addMovement(motionEvent);
        return this.f726v;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C0058BE c0058beM458h;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0101CE c0101ce = (C0101CE) childAt.getLayoutParams();
                if (c0101ce.f239a) {
                    int i9 = c0101ce.f240b;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 == 16) {
                            if (i11 == 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i122 = paddingLeft + scrollX;
                        childAt.layout(i122, paddingTop, childAt.getMeasuredWidth() + i122, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i14;
                    if (i11 == 16) {
                    }
                    int i132 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i132;
                    int i1222 = paddingLeft + scrollX;
                    childAt.layout(i1222, paddingTop, childAt.getMeasuredWidth() + i1222, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i15 = (i5 - paddingLeft) - paddingRight;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                C0101CE c0101ce2 = (C0101CE) childAt2.getLayoutParams();
                if (!c0101ce2.f239a && (c0058beM458h = m458h(childAt2)) != null) {
                    float f = i15;
                    int i17 = ((int) (c0058beM458h.f137e * f)) + paddingLeft;
                    if (c0101ce2.f242d) {
                        c0101ce2.f242d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0101ce2.f241c), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i17, paddingTop, childAt2.getMeasuredWidth() + i17, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f717m = paddingTop;
        this.f718n = i6 - paddingBottom;
        this.f700O = i7;
        if (this.f698M) {
            z2 = false;
            m470t(this.f710f, 0, false, false);
        } else {
            z2 = false;
        }
        this.f698M = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C0101CE c0101ce;
        C0101CE c0101ce2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f729y = Math.min(measuredWidth / 10, this.f728x);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c0101ce2 = (C0101CE) childAt.getLayoutParams()) != null && c0101ce2.f239a) {
                int i6 = c0101ce2.f240b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c0101ce2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c0101ce2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f721q = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f722r = true;
        m466p();
        this.f722r = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0101ce = (C0101CE) childAt2.getLayoutParams()) == null || !c0101ce.f239a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0101ce.f241c), 1073741824), this.f721q);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C0058BE c0058beM458h;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c0058beM458h = m458h(childAt)) != null && c0058beM458h.f134b == this.f710f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0187EE)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0187EE c0187ee = (C0187EE) parcelable;
        super.onRestoreInstanceState(c0187ee.f8397a);
        if (this.f709e != null) {
            m471u(c0187ee.f571c, 0, false, true);
        } else {
            this.f711g = c0187ee.f571c;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0187EE c0187ee = new C0187EE(super.onSaveInstanceState());
        c0187ee.f571c = this.f710f;
        AbstractC0036At abstractC0036At = this.f709e;
        if (abstractC0036At != null) {
            abstractC0036At.getClass();
            c0187ee.f572d = null;
        }
        return c0187ee;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f715k;
            m468r(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC0036At abstractC0036At;
        boolean zM469s = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC0036At = this.f709e) == null || ((C0355IA) abstractC0036At).f1191b.size() == 0) {
            return false;
        }
        if (this.f691F == null) {
            this.f691F = VelocityTracker.obtain();
        }
        this.f691F.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f712h.abortAnimation();
            this.f724t = false;
            m466p();
            float x = motionEvent.getX();
            this.f688C = x;
            this.f686A = x;
            float y = motionEvent.getY();
            this.f689D = y;
            this.f687B = y;
            this.f690E = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f686A = motionEvent.getX(actionIndex);
                        this.f690E = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m462l(motionEvent);
                        this.f686A = motionEvent.getX(motionEvent.findPointerIndex(this.f690E));
                    }
                } else if (this.f726v) {
                    m470t(this.f710f, 0, true, false);
                    zM469s = m469s();
                }
            } else if (!this.f726v) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f690E);
                if (iFindPointerIndex == -1) {
                    zM469s = m469s();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f686A);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f687B);
                    int i = this.f730z;
                    if (fAbs > i && fAbs > fAbs2) {
                        this.f726v = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f = this.f688C;
                        this.f686A = x2 - f > 0.0f ? f + i : f - i;
                        this.f687B = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f726v) {
                    }
                }
            } else if (this.f726v) {
                zM469s = m465o(motionEvent.getX(motionEvent.findPointerIndex(this.f690E)));
            }
        } else if (this.f726v) {
            VelocityTracker velocityTracker = this.f691F;
            velocityTracker.computeCurrentVelocity(1000, this.f693H);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f690E);
            this.f724t = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0058BE c0058beM459i = m459i();
            float f2 = clientWidth;
            int iMax = c0058beM459i.f134b;
            float f3 = ((scrollX / f2) - c0058beM459i.f137e) / (c0058beM459i.f136d + (this.f715k / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f690E)) - this.f688C)) <= this.f694I || Math.abs(xVelocity) <= this.f692G) {
                iMax += (int) (f3 + (iMax >= this.f710f ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList arrayList = this.f706b;
            if (arrayList.size() > 0) {
                iMax = Math.max(((C0058BE) arrayList.get(0)).f134b, Math.min(iMax, ((C0058BE) arrayList.get(arrayList.size() - 1)).f134b));
            }
            m471u(iMax, xVelocity, true, true);
            zM469s = m469s();
        }
        if (zM469s) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m466p() {
        m467q(this.f710f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc A[PHI: r7 r11 r15
  0x00dc: PHI (r7v15 int) = (r7v14 int), (r7v4 int), (r7v18 int) binds: [B:63:0x0100, B:60:0x00ec, B:51:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r11v26 int) = (r11v1 int), (r11v25 int), (r11v29 int) binds: [B:63:0x0100, B:60:0x00ec, B:51:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:63:0x0100, B:60:0x00ec, B:51:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0169 A[PHI: r3 r12
  0x0169: PHI (r3v20 float) = (r3v18 float), (r3v19 float), (r3v17 float) binds: [B:97:0x0190, B:94:0x017a, B:87:0x0160] A[DONT_GENERATE, DONT_INLINE]
  0x0169: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:97:0x0190, B:94:0x017a, B:87:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m467q(int i) {
        C0058BE c0058beM460j;
        String hexString;
        ArrayList arrayList;
        C0058BE c0058beM452a;
        float f;
        C0058BE c0058beM458h;
        C0058BE c0058beM458h2;
        int i2;
        int i3;
        C0058BE c0058be;
        C0058BE c0058be2;
        C0058BE c0058be3;
        int i4 = this.f710f;
        if (i4 != i) {
            c0058beM460j = m460j(i4);
            this.f710f = i;
        } else {
            c0058beM460j = null;
        }
        if (this.f709e == null || this.f724t || getWindowToken() == null) {
            return;
        }
        this.f709e.getClass();
        int i5 = this.f725u;
        int iMax = Math.max(0, this.f710f - i5);
        int size = ((C0355IA) this.f709e).f1191b.size();
        int iMin = Math.min(size - 1, this.f710f + i5);
        if (size != this.f705a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f705a + ", found: " + size + " Pager id: " + hexString + " Pager class: " + C0230FE.class + " Problematic adapter: " + this.f709e.getClass());
        }
        int i6 = 0;
        while (true) {
            arrayList = this.f706b;
            if (i6 >= arrayList.size()) {
                break;
            }
            c0058beM452a = (C0058BE) arrayList.get(i6);
            int i7 = c0058beM452a.f134b;
            int i8 = this.f710f;
            if (i7 >= i8) {
                if (i7 != i8) {
                    break;
                }
            } else {
                i6++;
            }
        }
        if (c0058beM452a == null && size > 0) {
            c0058beM452a = m452a(this.f710f, i6);
        }
        if (c0058beM452a != null) {
            int i9 = i6 - 1;
            C0058BE c0058be4 = i9 >= 0 ? (C0058BE) arrayList.get(i9) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - c0058beM452a.f136d);
            float f2 = 0.0f;
            for (int i10 = this.f710f - 1; i10 >= 0; i10--) {
                if (f2 >= paddingLeft && i10 < iMax) {
                    if (c0058be4 == null) {
                        break;
                    }
                    if (i10 == c0058be4.f134b && !c0058be4.f135c) {
                        arrayList.remove(i9);
                        AbstractC0036At abstractC0036At = this.f709e;
                        FrameLayout frameLayout = c0058be4.f133a;
                        ((C0355IA) abstractC0036At).getClass();
                        AbstractC0295Gu.m625r(-491503172450357L);
                        AbstractC0295Gu.m625r(-491546122123317L);
                        removeView(frameLayout);
                        i9--;
                        i6--;
                        if (i9 >= 0) {
                            c0058be3 = (C0058BE) arrayList.get(i9);
                        }
                        c0058be4 = c0058be3;
                    }
                } else if (c0058be4 == null || i10 != c0058be4.f134b) {
                    f2 += m452a(i10, i9 + 1).f136d;
                    i6++;
                    c0058be3 = i9 >= 0 ? (C0058BE) arrayList.get(i9) : null;
                    c0058be4 = c0058be3;
                } else {
                    f2 += c0058be4.f136d;
                    i9--;
                    if (i9 >= 0) {
                        c0058be3 = (C0058BE) arrayList.get(i9);
                    }
                    c0058be4 = c0058be3;
                }
            }
            f = 0.0f;
            float f3 = c0058beM452a.f136d;
            int i11 = i6 + 1;
            if (f3 < 2.0f) {
                C0058BE c0058be5 = i11 < arrayList.size() ? (C0058BE) arrayList.get(i11) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i12 = i11;
                for (int i13 = this.f710f + 1; i13 < size; i13++) {
                    if (f3 >= paddingRight && i13 > iMin) {
                        if (c0058be5 == null) {
                            break;
                        }
                        if (i13 == c0058be5.f134b && !c0058be5.f135c) {
                            arrayList.remove(i12);
                            AbstractC0036At abstractC0036At2 = this.f709e;
                            FrameLayout frameLayout2 = c0058be5.f133a;
                            ((C0355IA) abstractC0036At2).getClass();
                            AbstractC0295Gu.m625r(-491503172450357L);
                            AbstractC0295Gu.m625r(-491546122123317L);
                            removeView(frameLayout2);
                            if (i12 < arrayList.size()) {
                                c0058be5 = (C0058BE) arrayList.get(i12);
                            }
                        }
                    } else if (c0058be5 == null || i13 != c0058be5.f134b) {
                        C0058BE c0058beM452a2 = m452a(i13, i12);
                        i12++;
                        f3 += c0058beM452a2.f136d;
                        c0058be5 = i12 < arrayList.size() ? (C0058BE) arrayList.get(i12) : null;
                    } else {
                        f3 += c0058be5.f136d;
                        i12++;
                        if (i12 < arrayList.size()) {
                            c0058be5 = (C0058BE) arrayList.get(i12);
                        }
                    }
                }
            }
            int size2 = ((C0355IA) this.f709e).f1191b.size();
            int clientWidth2 = getClientWidth();
            float f4 = clientWidth2 > 0 ? this.f715k / clientWidth2 : 0.0f;
            if (c0058beM460j != null) {
                int i14 = c0058beM460j.f134b;
                int i15 = c0058beM452a.f134b;
                if (i14 < i15) {
                    float f5 = c0058beM460j.f137e + c0058beM460j.f136d + f4;
                    int i16 = i14 + 1;
                    int i17 = 0;
                    while (i16 <= c0058beM452a.f134b && i17 < arrayList.size()) {
                        Object obj = arrayList.get(i17);
                        while (true) {
                            c0058be2 = (C0058BE) obj;
                            if (i16 <= c0058be2.f134b || i17 >= arrayList.size() - 1) {
                                break;
                            }
                            i17++;
                            obj = arrayList.get(i17);
                        }
                        while (i16 < c0058be2.f134b) {
                            this.f709e.getClass();
                            f5 += 1.0f + f4;
                            i16++;
                        }
                        c0058be2.f137e = f5;
                        f5 += c0058be2.f136d + f4;
                        i16++;
                    }
                } else if (i14 > i15) {
                    int size3 = arrayList.size() - 1;
                    float f6 = c0058beM460j.f137e;
                    while (true) {
                        i14--;
                        if (i14 < c0058beM452a.f134b || size3 < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size3);
                        while (true) {
                            c0058be = (C0058BE) obj2;
                            if (i14 >= c0058be.f134b || size3 <= 0) {
                                break;
                            }
                            size3--;
                            obj2 = arrayList.get(size3);
                        }
                        while (i14 > c0058be.f134b) {
                            this.f709e.getClass();
                            f6 -= 1.0f + f4;
                            i14--;
                        }
                        f6 -= c0058be.f136d + f4;
                        c0058be.f137e = f6;
                    }
                }
            }
            int size4 = arrayList.size();
            float f7 = c0058beM452a.f137e;
            int i18 = c0058beM452a.f134b;
            int i19 = i18 - 1;
            this.f719o = i18 == 0 ? f7 : -3.4028235E38f;
            int i20 = size2 - 1;
            this.f720p = i18 == i20 ? (c0058beM452a.f136d + f7) - 1.0f : Float.MAX_VALUE;
            int i21 = i6 - 1;
            while (i21 >= 0) {
                C0058BE c0058be6 = (C0058BE) arrayList.get(i21);
                while (true) {
                    i3 = c0058be6.f134b;
                    if (i19 <= i3) {
                        break;
                    }
                    i19--;
                    this.f709e.getClass();
                    f7 -= 1.0f + f4;
                }
                f7 -= c0058be6.f136d + f4;
                c0058be6.f137e = f7;
                if (i3 == 0) {
                    this.f719o = f7;
                }
                i21--;
                i19--;
            }
            float f8 = c0058beM452a.f137e + c0058beM452a.f136d + f4;
            int i22 = c0058beM452a.f134b;
            while (true) {
                i22++;
                if (i11 >= size4) {
                    break;
                }
                C0058BE c0058be7 = (C0058BE) arrayList.get(i11);
                while (true) {
                    i2 = c0058be7.f134b;
                    if (i22 >= i2) {
                        break;
                    }
                    i22++;
                    this.f709e.getClass();
                    f8 += 1.0f + f4;
                }
                if (i2 == i20) {
                    this.f720p = (c0058be7.f136d + f8) - 1.0f;
                }
                c0058be7.f137e = f8;
                f8 += c0058be7.f136d + f4;
                i11++;
            }
            this.f709e.getClass();
        } else {
            f = 0.0f;
        }
        this.f709e.getClass();
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            C0101CE c0101ce = (C0101CE) childAt.getLayoutParams();
            c0101ce.getClass();
            if (!c0101ce.f239a && c0101ce.f241c == f && (c0058beM458h2 = m458h(childAt)) != null) {
                c0101ce.f241c = c0058beM458h2.f136d;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                while (true) {
                    Object parent = viewFindFocus.getParent();
                    if (parent == this) {
                        c0058beM458h = m458h(viewFindFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        viewFindFocus = (View) parent;
                    }
                }
                c0058beM458h = null;
            } else {
                c0058beM458h = null;
            }
            if (c0058beM458h == null || c0058beM458h.f134b != this.f710f) {
                for (int i24 = 0; i24 < getChildCount(); i24++) {
                    View childAt2 = getChildAt(i24);
                    C0058BE c0058beM458h3 = m458h(childAt2);
                    if (c0058beM458h3 != null && c0058beM458h3.f134b == this.f710f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m468r(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f706b.isEmpty()) {
            if (!this.f712h.isFinished()) {
                this.f712h.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C0058BE c0058beM460j = m460j(this.f710f);
        int iMin = (int) ((c0058beM460j != null ? Math.min(c0058beM460j.f137e, this.f720p) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m454d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f722r) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m469s() {
        this.f690E = -1;
        this.f726v = false;
        this.f727w = false;
        VelocityTracker velocityTracker = this.f691F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f691F = null;
        }
        this.f696K.onRelease();
        this.f697L.onRelease();
        return this.f696K.isFinished() || this.f697L.isFinished();
    }

    public void setAdapter(AbstractC0036At abstractC0036At) {
        ArrayList arrayList = this.f706b;
        AbstractC0036At abstractC0036At2 = this.f709e;
        if (abstractC0036At2 != null) {
            synchronized (abstractC0036At2) {
            }
            this.f709e.getClass();
            for (int i = 0; i < arrayList.size(); i++) {
                C0058BE c0058be = (C0058BE) arrayList.get(i);
                AbstractC0036At abstractC0036At3 = this.f709e;
                int i2 = c0058be.f134b;
                FrameLayout frameLayout = c0058be.f133a;
                ((C0355IA) abstractC0036At3).getClass();
                AbstractC0295Gu.m625r(-491503172450357L);
                AbstractC0295Gu.m625r(-491546122123317L);
                removeView(frameLayout);
            }
            this.f709e.getClass();
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((C0101CE) getChildAt(i3).getLayoutParams()).f239a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f710f = 0;
            scrollTo(0, 0);
        }
        this.f709e = abstractC0036At;
        this.f705a = 0;
        if (abstractC0036At != null) {
            if (this.f714j == null) {
                this.f714j = new C0160Do(1, this);
            }
            synchronized (this.f709e) {
            }
            this.f724t = false;
            boolean z = this.f698M;
            this.f698M = true;
            this.f705a = ((C0355IA) this.f709e).f1191b.size();
            if (this.f711g >= 0) {
                this.f709e.getClass();
                m471u(this.f711g, 0, false, true);
                this.f711g = -1;
            } else if (z) {
                requestLayout();
            } else {
                m466p();
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f724t = false;
        m471u(i, 0, !this.f698M, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.f725u) {
            this.f725u = i;
            m466p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0144DE interfaceC0144DE) {
        this.f702Q = interfaceC0144DE;
    }

    public void setPageMargin(int i) {
        int i2 = this.f715k;
        this.f715k = i;
        int width = getWidth();
        m468r(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f716l = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f704S == i) {
            return;
        }
        this.f704S = i;
        ArrayList arrayList = this.f701P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m470t(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        int iAbs;
        C0058BE c0058beM460j = m460j(i);
        int iMax = c0058beM460j != null ? (int) (Math.max(this.f719o, Math.min(c0058beM460j.f137e, this.f720p)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                m456f(i);
            }
            m454d(false);
            scrollTo(iMax, 0);
            m464n(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f712h;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f713i ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                m454d(false);
                m466p();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f709e.getClass();
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.f715k)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, BannerConfig.SCROLL_TIME);
                this.f713i = false;
                this.f712h.startScroll(i3, scrollY, i4, i5, iMin);
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            m456f(i);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m471u(int i, int i2, boolean z, boolean z2) {
        AbstractC0036At abstractC0036At = this.f709e;
        if (abstractC0036At == null || ((C0355IA) abstractC0036At).f1191b.size() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f706b;
        if (!z2 && this.f710f == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= ((C0355IA) this.f709e).f1191b.size()) {
            i = ((C0355IA) this.f709e).f1191b.size() - 1;
        }
        int i3 = this.f725u;
        int i4 = this.f710f;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C0058BE) arrayList.get(i5)).f135c = true;
            }
        }
        boolean z3 = this.f710f != i;
        if (!this.f698M) {
            m467q(i);
            m470t(i, i2, z, z3);
        } else {
            this.f710f = i;
            if (z3) {
                m456f(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f716l;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0101CE c0101ce = new C0101CE(context, attributeSet);
        c0101ce.f241c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f683T);
        c0101ce.f240b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return c0101ce;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }
}
