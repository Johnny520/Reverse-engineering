package p166;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
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
import android.widget.Scroller;
import androidx.appcompat.app.RunnableC0909;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import androidx.core.widget.C3125;
import androidx.viewpager.widget.ViewPager$SavedState;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.p005io.Opcodes;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8412 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final RunnableC0909 f20861;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f20862;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f20863;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f20864;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public ArrayList f20865;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public ArrayList f20866;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final EdgeEffect f20867;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f20868;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public VelocityTracker f20869;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f20870;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final EdgeEffect f20871;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final int f20872;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f20873;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f20874;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f20875;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f20876;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f20877;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f20878;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public float f20879;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f20880;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f20881;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f20882;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f20883;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int f20884;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Scroller f20885;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Parcelable f20886;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f20887;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final float f20888;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f20889;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Drawable f20890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8408 f20891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Rect f20892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f20893;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final int[] f20860 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static final InterpolatorC8410 f20859 = new InterpolatorC8410(0);

    public AbstractC8412(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20893 = new ArrayList();
        this.f20891 = new C8408();
        this.f20892 = new Rect();
        this.f20887 = -3.4028235E38f;
        this.f20888 = Float.MAX_VALUE;
        this.f20875 = 1;
        this.f20870 = -1;
        this.f20868 = true;
        this.f20861 = new RunnableC0909(this, 18);
        this.f20862 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f20885 = new Scroller(context2, f20859);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f20882 = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.f20871 = new EdgeEffect(context2);
        this.f20867 = new EdgeEffect(context2);
        this.f20872 = (int) (2.0f * f);
        this.f20884 = (int) (f * 16.0f);
        AbstractC3103.m4804(this, new C3125(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        AbstractC3026.m4564(this, new C5703(this));
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f20876 != z) {
            this.f20876 = z;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m13366(int i, int i2, int i3, View view, boolean z) {
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
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m13366(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                break;
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3).getVisibility() == 0) {
                    m13368();
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

    public void addOnAdapterChangeListener(InterfaceC8406 interfaceC8406) {
        if (this.f20865 == null) {
            this.f20865 = new ArrayList();
        }
        this.f20865.add(interfaceC8406);
    }

    public void addOnPageChangeListener(InterfaceC8413 interfaceC8413) {
        if (this.f20866 == null) {
            this.f20866 = new ArrayList();
        }
        this.f20866.add(interfaceC8413);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i).getVisibility() == 0) {
                m13368();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        C8407 c8407 = (C8407) layoutParams;
        boolean z = c8407.f20855 | (view.getClass().getAnnotation(InterfaceC8409.class) != null);
        c8407.f20855 = z;
        if (!this.f20877) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            C6755.m11870("Cannot add pager decor view during layout");
        } else {
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C8407) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.f20885;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            m13370(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m13372(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM13371;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zM13371 = false;
                if (zM13371) {
                    return false;
                }
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    if (!keyEvent.hasModifiers(2)) {
                        zM13371 = m13371(17);
                    }
                    if (zM13371) {
                    }
                } else if (keyCode == 22) {
                    if (!keyEvent.hasModifiers(2)) {
                        zM13371 = m13371(66);
                    }
                    if (zM13371) {
                    }
                } else if (keyCode == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        zM13371 = m13371(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        zM13371 = m13371(1);
                    }
                    if (zM13371) {
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                m13368();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f20867;
        EdgeEffect edgeEffect2 = this.f20871;
        boolean zDraw = false;
        if (overScrollMode != 0) {
            edgeEffect2.finish();
            edgeEffect.finish();
        } else {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f20887 * width);
                edgeEffect2.setSize(height, width);
                zDraw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f20888 + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f20890;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8407(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C8407 c8407 = new C8407(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f20860);
        c8407.f20854 = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return c8407;
    }

    public AbstractC8411 getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.f20875;
    }

    public int getPageMargin() {
        return this.f20889;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20868 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f20861);
        Scroller scroller = this.f20885;
        if (scroller != null && !scroller.isFinished()) {
            scroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f20889 <= 0 || this.f20890 == null) {
            return;
        }
        this.f20893.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r13.f20873 != false) goto L84;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & Opcodes.CONST_METHOD_TYPE;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f20874) {
                    return true;
                }
            }
            if (action == 0) {
                float x = motionEvent.getX();
                this.f20880 = x;
                this.f20881 = x;
                this.f20879 = motionEvent.getY();
                this.f20870 = motionEvent.getPointerId(0);
                this.f20873 = false;
                Scroller scroller = this.f20885;
                scroller.computeScrollOffset();
                if (this.f20862 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f20872) {
                    m13370(false);
                    this.f20874 = false;
                } else {
                    scroller.abortAnimation();
                    this.f20874 = true;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                }
            } else if (action == 2) {
                int i = this.f20870;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f = x2 - this.f20881;
                    float fAbs = Math.abs(f);
                    float y = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y - this.f20879);
                    if (f != 0.0f) {
                        float f2 = this.f20881;
                        if ((f2 >= this.f20883 || f <= 0.0f) && ((f2 <= getWidth() - this.f20883 || f >= 0.0f) && m13366((int) f, (int) x2, (int) y, this, false))) {
                            this.f20881 = x2;
                            this.f20873 = true;
                            return false;
                        }
                    }
                    int i2 = this.f20882;
                    float f3 = i2;
                    if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                        this.f20874 = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                        float f4 = this.f20880;
                        float f5 = i2;
                        this.f20881 = f > 0.0f ? f4 + f5 : f4 - f5;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs2 > f3) {
                        this.f20873 = true;
                    }
                    if (this.f20874) {
                        this.f20881 = x2;
                        getScrollX();
                        getClientWidth();
                        ArrayList arrayList = this.f20893;
                        C8408 c8408 = (C8408) arrayList.get(0);
                        C8408 c84082 = (C8408) AbstractC7012.m12145(1, arrayList);
                        int i3 = c8408.f20857;
                        int i4 = c84082.f20857;
                        throw null;
                    }
                }
            } else if (action == 6) {
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == this.f20870) {
                    int i5 = actionIndex == 0 ? 1 : 0;
                    this.f20881 = motionEvent.getX(i5);
                    this.f20870 = motionEvent.getPointerId(i5);
                    VelocityTracker velocityTracker = this.f20869;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                }
            }
            if (this.f20869 == null) {
                this.f20869 = VelocityTracker.obtain();
            }
            this.f20869.addMovement(motionEvent);
            return this.f20874;
        }
        this.f20870 = -1;
        this.f20874 = false;
        this.f20873 = false;
        VelocityTracker velocityTracker2 = this.f20869;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f20869 = null;
        }
        EdgeEffect edgeEffect = this.f20871;
        edgeEffect.onRelease();
        EdgeEffect edgeEffect2 = this.f20867;
        edgeEffect2.onRelease();
        if (!edgeEffect.isFinished()) {
            edgeEffect2.isFinished();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
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
                C8407 c8407 = (C8407) childAt.getLayoutParams();
                if (c8407.f20855) {
                    int i9 = c8407.f20854;
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
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8 && !((C8407) childAt2.getLayoutParams()).f20855) {
                m13368();
            }
        }
        this.f20863 = i7;
        if (this.f20868) {
            C8408 c8408M13367 = m13367();
            int iMax3 = c8408M13367 != null ? (int) (Math.max(this.f20887, Math.min(c8408M13367.f20856, this.f20888)) * getClientWidth()) : 0;
            z2 = false;
            m13370(false);
            scrollTo(iMax3, 0);
            m13372(iMax3);
        } else {
            z2 = false;
        }
        this.f20868 = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C8407 c8407;
        C8407 c84072;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f20883 = Math.min(measuredWidth / 10, this.f20884);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c84072 = (C8407) childAt.getLayoutParams()) != null && c84072.f20855) {
                int i6 = c84072.f20854;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z = true;
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
                int i10 = ((ViewGroup.LayoutParams) c84072).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c84072).height;
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
        this.f20878 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f20877 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c8407 = (C8407) childAt2.getLayoutParams()) == null || !c8407.f20855)) {
                c8407.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), this.f20878);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i4 = childCount;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            if (getChildAt(i2).getVisibility() == 0) {
                m13368();
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) parcelable;
        super.onRestoreInstanceState(viewPager$SavedState.f7044);
        this.f20886 = viewPager$SavedState.f7990;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.f7991 = 0;
        return viewPager$SavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f20889;
            m13374(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    public void removeOnAdapterChangeListener(InterfaceC8406 interfaceC8406) {
        ArrayList arrayList = this.f20865;
        if (arrayList != null) {
            arrayList.remove(interfaceC8406);
        }
    }

    public void removeOnPageChangeListener(InterfaceC8413 interfaceC8413) {
        ArrayList arrayList = this.f20866;
        if (arrayList != null) {
            arrayList.remove(interfaceC8413);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f20877) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC8411 abstractC8411) {
        ArrayList arrayList = this.f20865;
        if (arrayList == null || arrayList.isEmpty() || this.f20865.size() <= 0) {
            return;
        }
        this.f20865.get(0).getClass();
        C3775.m6954();
    }

    public void setCurrentItem(int i) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f20875) {
            this.f20875 = i;
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f20889;
        this.f20889 = i;
        int width = getWidth();
        m13374(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f20890 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f20862 == i) {
            return;
        }
        this.f20862 = i;
        ArrayList arrayList = this.f20866;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f20866.get(i2) != null) {
                    C3775.m6954();
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f20890;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8408 m13367() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20893;
            if (i >= arrayList.size()) {
                return null;
            }
            C8408 c8408 = (C8408) arrayList.get(i);
            if (c8408.f20857 == 0) {
                return c8408;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13368() {
        ArrayList arrayList = this.f20893;
        if (arrayList.size() <= 0) {
            return;
        }
        ((C8408) arrayList.get(0)).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect m13369(Rect rect, View view) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13370(boolean z) {
        int i = 0;
        boolean z2 = this.f20862 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            Scroller scroller = this.f20885;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m13372(currX);
                    }
                }
            }
        }
        while (true) {
            ArrayList arrayList = this.f20893;
            if (i >= arrayList.size()) {
                break;
            }
            ((C8408) arrayList.get(i)).getClass();
            i++;
        }
        if (z2) {
            RunnableC0909 runnableC0909 = this.f20861;
            if (!z) {
                runnableC0909.run();
            } else {
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                postOnAnimation(runnableC0909);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13371(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean zRequestFocus = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f20892;
            if (i == 17) {
                int i2 = m13369(rect, viewFindNextFocus).left;
                int i3 = m13369(rect, viewFindFocus).left;
                if (viewFindFocus == null || i2 < i3) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            } else if (i == 66) {
                int i4 = m13369(rect, viewFindNextFocus).left;
                int i5 = m13369(rect, viewFindFocus).left;
                if (viewFindFocus == null || i4 > i5) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
        } else if (i != 17) {
        }
        if (zRequestFocus) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zRequestFocus;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m13372(int i) {
        int i2;
        ArrayList arrayList = this.f20893;
        if (arrayList.size() == 0) {
            if (!this.f20868) {
                this.f20864 = false;
                m13373();
                if (!this.f20864) {
                    C6755.m11870("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.f20889 / clientWidth : 0.0f;
        int i3 = -1;
        boolean z = true;
        int i4 = 0;
        float f2 = 0.0f;
        C8408 c8408 = null;
        while (i4 < arrayList.size()) {
            C8408 c84082 = (C8408) arrayList.get(i4);
            if (!z && c84082.f20857 != (i2 = i3 + 1)) {
                C8408 c84083 = this.f20891;
                c84083.f20856 = f2 + 0.0f + f;
                c84083.f20857 = i2;
                throw null;
            }
            f2 = c84082.f20856;
            float f3 = f2 + 0.0f + f;
            if (!z && scrollX < f2) {
                break;
            }
            if (scrollX < f3 || i4 == arrayList.size() - 1) {
                c8408 = c84082;
                break;
            }
            i3 = c84082.f20857;
            i4++;
            z = false;
            c8408 = c84082;
        }
        getClientWidth();
        int i5 = c8408.f20857;
        this.f20864 = false;
        m13373();
        if (this.f20864) {
            return true;
        }
        C6755.m11870("onPageScrolled did not call superclass implementation");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13373() {
        int iMax;
        int width;
        int left;
        if (this.f20863 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                C8407 c8407 = (C8407) childAt.getLayoutParams();
                if (c8407.f20855) {
                    int i2 = c8407.f20854 & 7;
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
        ArrayList arrayList = this.f20866;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f20866.get(i4) != null) {
                    C3775.m6954();
                    return;
                }
            }
        }
        this.f20864 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13374(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f20893.isEmpty()) {
            C8408 c8408M13367 = m13367();
            int iMin = (int) ((c8408M13367 != null ? Math.min(c8408M13367.f20856, this.f20888) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                m13370(false);
                scrollTo(iMin, getScrollY());
                return;
            }
            return;
        }
        Scroller scroller = this.f20885;
        if (!scroller.isFinished()) {
            scroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
        }
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC8413 interfaceC8413) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }
}
