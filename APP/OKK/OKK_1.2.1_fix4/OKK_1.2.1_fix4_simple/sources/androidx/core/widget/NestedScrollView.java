package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.luckypray.dexkit.C1031R;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p006D.AbstractC0083U;
import p006D.AbstractC0132x;
import p006D.AbstractC0133y;
import p006D.C0095d;
import p006D.C0105i;
import p006D.C0113m;
import p006D.C0119p;
import p006D.C0134z;
import p006D.InterfaceC0117o;
import p017J.AbstractC0216e;
import p017J.AbstractC0220i;
import p017J.C0219h;
import p017J.C0223l;
import p017J.InterfaceC0221j;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0117o {

    /* JADX INFO: renamed from: B */
    public static final float f1314B = 0.0f;

    /* JADX INFO: renamed from: C */
    public static final C0219h f1315C = null;

    /* JADX INFO: renamed from: D */
    public static final int[] f1316D = null;

    /* JADX INFO: renamed from: A */
    public final C0105i f1317A;

    /* JADX INFO: renamed from: a */
    public final float f1318a;

    /* JADX INFO: renamed from: b */
    public long f1319b;

    /* JADX INFO: renamed from: c */
    public final Rect f1320c;

    /* JADX INFO: renamed from: d */
    public final OverScroller f1321d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f1322e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f1323f;

    /* JADX INFO: renamed from: g */
    public int f1324g;

    /* JADX INFO: renamed from: h */
    public boolean f1325h;

    /* JADX INFO: renamed from: i */
    public boolean f1326i;

    /* JADX INFO: renamed from: j */
    public View f1327j;

    /* JADX INFO: renamed from: k */
    public boolean f1328k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f1329l;

    /* JADX INFO: renamed from: m */
    public boolean f1330m;

    /* JADX INFO: renamed from: n */
    public boolean f1331n;

    /* JADX INFO: renamed from: o */
    public final int f1332o;

    /* JADX INFO: renamed from: p */
    public final int f1333p;

    /* JADX INFO: renamed from: q */
    public final int f1334q;

    /* JADX INFO: renamed from: r */
    public int f1335r;

    /* JADX INFO: renamed from: s */
    public final int[] f1336s;

    /* JADX INFO: renamed from: t */
    public final int[] f1337t;

    /* JADX INFO: renamed from: u */
    public int f1338u;

    /* JADX INFO: renamed from: v */
    public int f1339v;

    /* JADX INFO: renamed from: w */
    public C0223l f1340w;

    /* JADX INFO: renamed from: x */
    public final C0119p f1341x;

    /* JADX INFO: renamed from: y */
    public final C0113m f1342y;

    /* JADX INFO: renamed from: z */
    public float f1343z;

    static {
        f1314B = (float) (Math.log(0.78d) / Math.log(0.9d));
        f1315C = new C0219h(0);
        f1316D = new int[]{R.attr.fillViewport};
    }

    public NestedScrollView(Context r7, AttributeSet r8) {
        super(r7, r8, C1031R.attr.nestedScrollViewStyle);
        this.f1320c = new Rect();
        this.f1325h = true;
        this.f1326i = false;
        this.f1327j = null;
        this.f1328k = false;
        this.f1331n = true;
        this.f1335r = -1;
        this.f1336s = new int[2];
        this.f1337t = new int[2];
        C0095d r3 = new C0095d(7, this);
        this.f1317A = new C0105i(getContext(), r3);
        int r32 = Build.VERSION.SDK_INT;
        if (r32 < 31) goto L5;
        EdgeEffect r5 = AbstractC0216e.m599a(r7, r8);
    L6:
        this.f1322e = r5;
        if (r32 < 31) goto L9;
        EdgeEffect r33 = AbstractC0216e.m599a(r7, r8);
    L10:
        this.f1323f = r33;
        this.f1318a = ((r7.getResources().getDisplayMetrics().density * 160.0f) * 386.0878f) * 0.84f;
        this.f1321d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration r34 = ViewConfiguration.get(getContext());
        this.f1332o = r34.getScaledTouchSlop();
        this.f1333p = r34.getScaledMinimumFlingVelocity();
        this.f1334q = r34.getScaledMaximumFlingVelocity();
        TypedArray r72 = r7.obtainStyledAttributes(r8, f1316D, C1031R.attr.nestedScrollViewStyle, 0);
        setFillViewport(r72.getBoolean(0, false));
        r72.recycle();
        this.f1341x = new C0119p();
        this.f1342y = new C0113m(this);
        setNestedScrollingEnabled(true);
        AbstractC0080Q.m291j(this, f1315C);
        return;
    L9:
        r33 = new EdgeEffect(r7);
        goto L10
    L5:
        r5 = new EdgeEffect(r7);
        goto L6
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1179k(View r2, View r3) {
        if (r2 != r3) goto L5;
        return true;
    L5:
        Object r22 = r2.getParent();
        if ((r22 instanceof ViewGroup) == true) goto L8;
    L10:
        return false;
    L8:
        if (m1179k((View) r22, r3) == false) goto L10;
        return true;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: a */
    public final void mo421a(View r1, View r2, int r3, int r4) {
        C0119p r22 = this.f1341x;
        if (r4 != 1) goto L5;
        r22.f307b = r3;
    L6:
        this.f1342y.m416h(2, r4);
        return;
    L5:
        r22.f306a = r3;
        goto L6
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2) {
        if (getChildCount() > 0) goto L7;
        super.addView(r2);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // p006D.InterfaceC0117o
    /* JADX INFO: renamed from: b */
    public final void mo426b(View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
        m1185m(r5, r6, r7);
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: c */
    public final void mo422c(View r1, int r2, int r3, int r4, int r5, int r6) {
        m1185m(r5, r6, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f1321d.isFinished() == false) goto L5;
        return;
    L5:
        this.f1321d.computeScrollOffset();
        int r02 = this.f1321d.getCurrY();
        int r1 = r02 - this.f1339v;
        int r2 = getHeight();
        EdgeEffect r3 = this.f1323f;
        EdgeEffect r4 = this.f1322e;
        if (r1 > 0) goto L8;
    L13:
        if (r1 < 0) goto L15;
    L19:
        this.f1339v = r02;
        int[] r03 = this.f1337t;
        r03[1] = 0;
        this.f1342y.m411c(0, r1, r03, null, 1);
        int r12 = r1 - r03[1];
        int r13 = getScrollRange();
        if (r12 == 0) goto L22;
        int r5 = getScrollY();
        m1187o(r12, getScrollX(), r5, r13);
        int r7 = getScrollY() - r5;
        int r14 = r12 - r7;
        r03[1] = 0;
        this.f1342y.m413e(0, r7, 0, r14, this.f1336s, 1, r03);
        r12 = r14 - r03[1];
    L22:
        if (r12 == 0) goto L36;
        int r04 = getOverScrollMode();
        if (r04 == 0) goto L27;
        if (r04 != 1) goto L34;
        if (r13 > 0) goto L27;
    L34:
        this.f1321d.abortAnimation();
        m1194v(1);
    L27:
        if (r12 >= 0) goto L32;
        if (r4.isFinished() == false) goto L34;
        r4.onAbsorb((int) this.f1321d.getCurrVelocity());
        goto L34
    L32:
        if (r3.isFinished() == false) goto L34;
        r3.onAbsorb((int) this.f1321d.getCurrVelocity());
    L36:
        if (this.f1321d.isFinished() == true) goto L38;
        postInvalidateOnAnimation();
        return;
    L38:
        m1194v(1);
        return;
    L15:
        if (AbstractC0040p.m117v(r3) == 0.0f) goto L19;
        float r22 = r2;
        int r23 = Math.round(AbstractC0040p.m85J(r3, (r1 * 4.0f) / r22, 0.5f) * (r22 / 4.0f));
        if (r23 != r1) goto L18;
    L12:
        r1 = r1 - r23;
        goto L19
    L18:
        r3.finish();
        goto L12
    L8:
        if (AbstractC0040p.m117v(r4) == 0.0f) goto L13;
        r23 = Math.round(AbstractC0040p.m85J(r4, ((-r1) * 4.0f) / r2, 0.5f) * ((-r2) / 4.0f));
        if (r23 == r1) goto L12;
        r4.finish();
        goto L12
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int r02 = getChildCount();
        int r1 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (r02 != 0) goto L5;
        return r1;
    L5:
        View r2 = getChildAt(0);
        FrameLayout.LayoutParams r3 = (FrameLayout.LayoutParams) r2.getLayoutParams();
        int r22 = r2.getBottom() + r3.bottomMargin;
        int r32 = getScrollY();
        int r03 = Math.max(0, r22 - r1);
        if (r32 < 0) goto L11;
        if (r32 > r03) goto L10;
        return r22;
    L10:
        return r22 + (r32 - r03);
    L11:
        return r22 - r32;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: d */
    public final void mo423d(View r3, int r4) {
        C0119p r32 = this.f1341x;
        if (r4 != 1) goto L5;
        r32.f307b = 0;
    L6:
        m1194v(r4);
        return;
    L5:
        r32.f306a = 0;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r7) {
        if (super.dispatchKeyEvent(r7) == true) goto L59;
        this.f1320c.setEmpty();
        int r3 = 130;
        if (getChildCount() <= 0) goto L42;
        View r02 = getChildAt(0);
        FrameLayout.LayoutParams r4 = (FrameLayout.LayoutParams) r02.getLayoutParams();
        if (((r02.getHeight() + r4.topMargin) + r4.bottomMargin) <= ((getHeight() - getPaddingTop()) - getPaddingBottom())) goto L42;
        if (r7.getAction() != 0) goto L54;
        int r03 = r7.getKeyCode();
        if (r03 == 19) goto L38;
        if (r03 == 20) goto L34;
        if (r03 == 62) goto L30;
        if (r03 != 92) goto L19;
        boolean r72 = m1183j(33);
    L55:
        if (r72 == false) goto L58;
        return true;
    L58:
        return false;
    L19:
        if (r03 != 93) goto L21;
        r72 = m1183j(130);
        goto L55
    L21:
        if (r03 != 122) goto L23;
        m1188p(33);
        goto L54
    L23:
        if (r03 != 123) goto L54;
        m1188p(130);
        goto L54
    L30:
        if (r7.isShiftPressed() == false) goto L32;
        r3 = 33;
    L32:
        m1188p(r3);
        goto L54
    L34:
        if (r7.isAltPressed() == false) goto L36;
        r72 = m1183j(130);
        goto L55
    L36:
        r72 = m1180g(130);
        goto L55
    L38:
        if (r7.isAltPressed() == false) goto L40;
        r72 = m1183j(33);
        goto L55
    L40:
        r72 = m1180g(33);
    L54:
        r72 = false;
    L42:
        if (isFocused() == false) goto L54;
        if (r7.getKeyCode() == 4) goto L54;
        View r73 = findFocus();
        if (r73 != this) goto L48;
        r73 = null;
    L48:
        View r74 = FocusFinder.getInstance().findNextFocus(this, r73, 130);
        if (r74 == null) goto L54;
        if (r74 == this) goto L54;
        if (r74.requestFocus(130) == false) goto L54;
        r72 = true;
        goto L55
    L59:
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
        return this.f1342y.m409a(r2, r3, r4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
        return this.f1342y.m410b(r2, r3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return this.f1342y.m411c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return this.f1342y.m413e(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas r11) {
        super.draw(r11);
        int r02 = getScrollY();
        EdgeEffect r1 = this.f1322e;
        int r3 = 0;
        if (r1.isFinished() == true) goto L15;
        int r2 = r11.save();
        int r4 = getWidth();
        int r5 = getHeight();
        int r6 = Math.min(0, r02);
        if (AbstractC0220i.m611a(this) == false) goto L7;
        r4 = r4 - (getPaddingRight() + getPaddingLeft());
        int r7 = getPaddingLeft();
    L9:
        if (AbstractC0220i.m611a(this) == false) goto L11;
        r5 = r5 - (getPaddingBottom() + getPaddingTop());
        r6 = r6 + getPaddingTop();
    L11:
        r11.translate(r7, r6);
        r1.setSize(r4, r5);
        if (r1.draw(r11) == false) goto L14;
        postInvalidateOnAnimation();
    L14:
        r11.restoreToCount(r2);
        goto L15
    L7:
        r7 = 0;
    L15:
        EdgeEffect r12 = this.f1323f;
        if (r12.isFinished() == true) goto L28;
        int r22 = r11.save();
        int r42 = getWidth();
        int r52 = getHeight();
        int r03 = Math.max(getScrollRange(), r02) + r52;
        if (AbstractC0220i.m611a(this) == false) goto L21;
        r42 = r42 - (getPaddingRight() + getPaddingLeft());
        r3 = getPaddingLeft();
    L21:
        if (AbstractC0220i.m611a(this) == false) goto L23;
        r52 = r52 - (getPaddingBottom() + getPaddingTop());
        r03 = r03 - getPaddingBottom();
    L23:
        r11.translate(r3 - r42, r03);
        r11.rotate(180.0f, r42, 0.0f);
        r12.setSize(r42, r52);
        if (r12.draw(r11) == false) goto L26;
        postInvalidateOnAnimation();
    L26:
        r11.restoreToCount(r22);
        return;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: e */
    public final void mo424e(View r7, int r8, int r9, int[] r10, int r11) {
        this.f1342y.m411c(r8, r9, r10, null, r11);
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: f */
    public final boolean mo425f(View r1, View r2, int r3, int r4) {
        if ((r3 & 2) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1180g(int r9) {
        View r02 = findFocus();
        if (r02 != this) goto L5;
        r02 = null;
    L5:
        View r1 = FocusFinder.getInstance().findNextFocus(this, r02, r9);
        int r2 = getMaxScrollAmount();
        if (r1 == null) goto L11;
        if (m1184l(r1, r2, getHeight()) == false) goto L11;
        Rect r22 = this.f1320c;
        r1.getDrawingRect(r22);
        offsetDescendantRectToMyCoords(r1, r22);
        m1190r(m1181h(r22), 0, 1, true);
        r1.requestFocus(r9);
    L25:
        if (r02 != null) goto L27;
    L31:
        return true;
    L27:
        if (r02.isFocused() == false) goto L31;
        if ((!m1184l(r02, 0, getHeight())) == false) goto L31;
        int r92 = getDescendantFocusability();
        setDescendantFocusability(MethodData.ACC_DECLARED_SYNCHRONIZED);
        requestFocus();
        setDescendantFocusability(r92);
    L11:
        if (r9 == 33) goto L13;
    L15:
        if (r9 == 130) goto L17;
    L19:
        if (r2 != 0) goto L21;
        return false;
    L21:
        if (r9 == 130) goto L24;
        r2 = -r2;
    L24:
        m1190r(r2, 0, 1, true);
        goto L25
    L17:
        if (getChildCount() <= 0) goto L19;
        View r12 = getChildAt(0);
        r2 = Math.min((r12.getBottom() + ((FrameLayout.LayoutParams) r12.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), r2);
        goto L19
    L13:
        if (getScrollY() >= r2) goto L15;
        r2 = getScrollY();
        goto L19
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() != 0) goto L6;
        return 0.0f;
    L6:
        View r02 = getChildAt(0);
        FrameLayout.LayoutParams r1 = (FrameLayout.LayoutParams) r02.getLayoutParams();
        int r2 = getVerticalFadingEdgeLength();
        int r03 = ((r02.getBottom() + r1.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (r03 < r2) goto L9;
        return 1.0f;
    L9:
        return r03 / r2;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0119p r02 = this.f1341x;
        int r1 = r02.f306a;
        return r02.f307b | r1;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) goto L6;
        View r02 = getChildAt(0);
        FrameLayout.LayoutParams r2 = (FrameLayout.LayoutParams) r02.getLayoutParams();
        return Math.max(0, ((r02.getHeight() + r2.topMargin) + r2.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    L6:
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() != 0) goto L6;
        return 0.0f;
    L6:
        int r02 = getVerticalFadingEdgeLength();
        int r1 = getScrollY();
        if (r1 < r02) goto L9;
        return 1.0f;
    L9:
        return r1 / r02;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1343z != 0.0f) goto L10;
        TypedValue r02 = new TypedValue();
        Context r1 = getContext();
        if (r1.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, r02, true) == false) goto L8;
        this.f1343z = r02.getDimension(r1.getResources().getDisplayMetrics());
        goto L10
    L8:
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
    L10:
        return this.f1343z;
    }

    /* JADX INFO: renamed from: h */
    public final int m1181h(Rect r11) {
        if (getChildCount() != 0) goto L5;
        return 0;
    L5:
        int r02 = getHeight();
        int r2 = getScrollY();
        int r3 = r2 + r02;
        int r4 = getVerticalFadingEdgeLength();
        if (r11.top <= 0) goto L8;
        r2 = r2 + r4;
    L8:
        View r5 = getChildAt(0);
        FrameLayout.LayoutParams r6 = (FrameLayout.LayoutParams) r5.getLayoutParams();
        if (r11.bottom >= ((r5.getHeight() + r6.topMargin) + r6.bottomMargin)) goto L11;
        int r42 = r3 - r4;
    L12:
        int r7 = r11.bottom;
        if (r7 <= r42) goto L22;
        if (r11.top <= r2) goto L22;
        if (r11.height() <= r02) goto L19;
        int r112 = r11.top - r2;
    L30:
        return Math.min(r112, (r5.getBottom() + r6.bottomMargin) - r3);
    L19:
        r112 = r11.bottom - r42;
    L22:
        if (r11.top >= r2) goto L31;
        if (r7 < r42) goto L25;
        return 0;
    L25:
        if (r11.height() <= r02) goto L27;
        int r1 = 0 - (r42 - r11.bottom);
    L29:
        return Math.max(r1, -getScrollY());
    L27:
        r1 = 0 - (r2 - r11.top);
        goto L29
    L31:
        return 0;
    L11:
        r42 = r3;
        goto L12
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1342y.m415g(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m1182i(int r13) {
        if (getChildCount() <= 0) goto L6;
        this.f1321d.fling(getScrollX(), getScrollY(), 0, r13, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        this.f1342y.m416h(2, 1);
        this.f1339v = getScrollY();
        postInvalidateOnAnimation();
        return;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1342y.f298d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1183j(int r6) {
        if (r6 != 130) goto L5;
        boolean r02 = true;
    L6:
        int r3 = getHeight();
        Rect r4 = this.f1320c;
        r4.top = 0;
        r4.bottom = r3;
        if (r02 == false) goto L12;
        int r03 = getChildCount();
        if (r03 <= 0) goto L12;
        View r04 = getChildAt(r03 - 1);
        int r1 = getPaddingBottom() + (r04.getBottom() + ((FrameLayout.LayoutParams) r04.getLayoutParams()).bottomMargin);
        r4.bottom = r1;
        r4.top = r1 - r3;
    L12:
        return m1189q(r6, r4.top, r4.bottom);
    L5:
        r02 = false;
        goto L6
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1184l(View r3, int r4, int r5) {
        Rect r02 = this.f1320c;
        r3.getDrawingRect(r02);
        offsetDescendantRectToMyCoords(r3, r02);
        if ((r02.bottom + r4) >= getScrollY()) goto L5;
    L7:
        return false;
    L5:
        if ((r02.top - r4) > (getScrollY() + r5)) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m1185m(int r4, int r5, int[] r6) {
        int r02 = getScrollY();
        scrollBy(0, r4);
        int r1 = getScrollY() - r02;
        if (r6 == null) goto L5;
        r6[1] = r6[1] + r1;
    L5:
        C0113m r03 = this.f1342y;
        r03.m412d(r1, r4 - r1, r5, r6);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View r3, int r4, int r5) {
        ViewGroup.LayoutParams r52 = r3.getLayoutParams();
        int r02 = getPaddingLeft();
        r3.measure(ViewGroup.getChildMeasureSpec(r4, getPaddingRight() + r02, r52.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View r2, int r3, int r4, int r5, int r6) {
        ViewGroup.MarginLayoutParams r52 = (ViewGroup.MarginLayoutParams) r2.getLayoutParams();
        int r62 = getPaddingLeft();
        r2.measure(ViewGroup.getChildMeasureSpec(r3, (((getPaddingRight() + r62) + r52.leftMargin) + r52.rightMargin) + r4, r52.width), View.MeasureSpec.makeMeasureSpec(r52.topMargin + r52.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final void m1186n(MotionEvent r4) {
        int r02 = r4.getActionIndex();
        if (r4.getPointerId(r02) != this.f1335r) goto L11;
        if (r02 != 0) goto L6;
        int r03 = 1;
    L7:
        this.f1324g = (int) r4.getY(r03);
        this.f1335r = r4.getPointerId(r03);
        VelocityTracker r42 = this.f1329l;
        if (r42 == null) goto L12;
        r42.clear();
        return;
    L12:
        return;
    L6:
        r03 = 0;
        goto L7
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1187o(int r10, int r11, int r12, int r13) {
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int r122 = r12 + r10;
        if (r11 <= 0) goto L5;
    L4:
        r11 = 0;
        boolean r02 = true;
    L8:
        if (r122 <= r13) goto L10;
    L9:
        boolean r123 = true;
    L13:
        if (r123 == true) goto L15;
    L17:
        super.scrollTo(r11, r13);
        if (r02 == true) goto L23;
        if (r123 == false) goto L22;
        return true;
    L22:
        return false;
    L23:
        return true;
    L15:
        if (this.f1342y.m415g(1) == true) goto L17;
        this.f1321d.springBack(r11, r13, 0, 0, 0, getScrollRange());
        goto L17
    L10:
        if (r122 >= 0) goto L12;
        r13 = 0;
        goto L9
    L12:
        r13 = r122;
        r123 = false;
        goto L13
    L5:
        if (r11 < 0) goto L4;
        r02 = false;
        goto L8
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1326i = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent r29) {
        if (r29.getAction() == 8) goto L5;
        return false;
    L5:
        if (this.f1328k == false) goto L7;
        return false;
    L7:
        if ((r29.getSource() & 2) != 2) goto L9;
        boolean r4 = true;
    L11:
        if (r4 == false) goto L14;
        int r42 = 9;
        float r10 = r29.getAxisValue(9);
        int r11 = (int) r29.getX();
    L18:
        if (r10 == 0.0f) goto L193;
        int r102 = (int) (getVerticalScrollFactorCompat() * r10);
        if ((r29.getSource() & 8194) != 8194) goto L22;
        boolean r12 = true;
    L23:
        m1190r(-r102, r11, 1, r12);
        if (r42 == 0) goto L184;
        C0105i r103 = this.f1317A;
        r103.getClass();
        int r112 = r29.getSource();
        int r122 = r29.getDeviceId();
        int r13 = r103.f278h;
        int[] r5 = r103.f280j;
        if (r13 == r112) goto L28;
    L33:
        r103.f273c.getClass();
        Context r132 = r103.f271a;
        ViewConfiguration r2 = ViewConfiguration.get(r132);
        int r7 = r29.getDeviceId();
        int r14 = r29.getSource();
        int r3 = Build.VERSION.SDK_INT;
        if (r3 < 34) goto L37;
        int r72 = AbstractC0083U.m298b(r2, r7, r42, r14);
    L55:
        r5[0] = r72;
        int r73 = r29.getDeviceId();
        int r142 = r29.getSource();
        if (r3 < 34) goto L59;
        int r22 = AbstractC0083U.m297a(r2, r73, r42, r142);
    L82:
        r5[1] = r22;
        r103.f278h = r112;
        r103.f279i = r122;
        r103.f277g = r42;
        char r23 = 0;
        boolean r6 = true;
    L84:
        if (r5[r23] != Integer.MAX_VALUE) goto L89;
        VelocityTracker r1 = r103.f275e;
        if (r1 == null) goto L182;
        r1.recycle();
        r103.f275e = null;
    L182:
        return true;
    L89:
        if (r103.f275e != null) goto L91;
        r103.f275e = VelocityTracker.obtain();
    L91:
        VelocityTracker r24 = r103.f275e;
        r103.f274d.getClass();
        Map r32 = AbstractC0133y.f322a;
        r24.addMovement(r29);
        if (Build.VERSION.SDK_INT < 34) goto L95;
    L108:
        r24.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0134z r74 = (C0134z) AbstractC0133y.f322a.get(r24);
        if (r74 == null) goto L150;
        int r8 = r74.f326d;
        if (r8 >= 2) goto L113;
    L112:
        VelocityTracker r16 = r24;
        int r25 = 1000;
        float r15 = 0.0f;
    L144:
        float r17 = r15 * r25;
        r74.f325c = r17;
        if (r17 >= (-Math.abs(Float.MAX_VALUE))) goto L148;
        r74.f325c = -Math.abs(Float.MAX_VALUE);
    L152:
        if (Build.VERSION.SDK_INT < 34) goto L154;
        float r18 = AbstractC0132x.m462a(r16, r42);
    L167:
        C0095d r26 = r103.f272b;
        float r19 = r18 * (-((NestedScrollView) r26.f251b).getVerticalScrollFactorCompat());
        float r33 = Math.signum(r19);
        NestedScrollView r27 = (NestedScrollView) r26.f251b;
        if (r6 == false) goto L170;
    L173:
        r27.f1321d.abortAnimation();
    L175:
        if (Math.abs(r19) < r5[0]) goto L182;
        float r110 = Math.max(-r4, Math.min(r19, r5[1]));
        if (r110 != 0.0f) goto L180;
        float r75 = 0.0f;
    L181:
        r103.f276f = r75;
        goto L182
    L180:
        r27.f1321d.abortAnimation();
        r27.m1182i((int) r110);
        r75 = r110;
        goto L181
    L170:
        if (r33 == Math.signum(r103.f276f)) goto L175;
        if (r33 == 0.0f) goto L175;
    L154:
        VelocityTracker r111 = r16;
        if (r42 != 0) goto L158;
        r18 = r111.getXVelocity();
        goto L167
    L158:
        if (r42 != 1) goto L160;
        r18 = r111.getYVelocity();
        goto L167
    L160:
        C0134z r113 = (C0134z) AbstractC0133y.f322a.get(r111);
        if (r113 != null) goto L163;
    L166:
        r18 = 0.0f;
        goto L167
    L163:
        if (r42 != 26) goto L166;
        r18 = r113.f325c;
        goto L167
    L148:
        if (r74.f325c <= Math.abs(Float.MAX_VALUE)) goto L152;
        r74.f325c = Math.abs(Float.MAX_VALUE);
        goto L152
    L113:
        int r9 = r74.f327e;
        int r123 = ((r9 + 20) - (r8 - 1)) % 20;
        long[] r82 = r74.f324b;
        long r133 = r82[r9];
    L114:
        long r21 = r82[r123];
        if ((r133 - r21) <= 100) goto L117;
        r74.f326d--;
        r123 = (r123 + 1) % 20;
        goto L114
    L117:
        int r134 = r74.f326d;
        if (r134 < 2) goto L112;
        float[] r152 = r74.f323a;
        if (r134 != 2) goto L126;
        int r124 = (r123 + 1) % 20;
        if (r21 == r82[r124]) goto L112;
        r16 = r24;
        r25 = 1000;
        r15 = r152[r124] / (r13 - r21);
        goto L144
    L126:
        float r92 = 0.0f;
        int r114 = 0;
        int r135 = 0;
    L127:
        float r20 = 1.0f;
        if (r114 >= (r74.f326d - 1)) goto L140;
        int r143 = r114 + r123;
        long r222 = r82[r143 % 20];
        int r144 = (r143 + 1) % 20;
        if (r82[r144] != r222) goto L132;
        VelocityTracker r162 = r24;
        int r28 = 1;
    L139:
        r114 = r114 + r28;
        r24 = r162;
        goto L127
    L132:
        r135 = r135 + 1;
        if (r92 >= 0.0f) goto L135;
        r20 = -1.0f;
    L135:
        r162 = r24;
        float r202 = r20 * ((float) Math.sqrt(Math.abs(r92) * 2.0f));
        float r115 = r152[r144] / (r82[r144] - r222);
        float r116 = (Math.abs(r115) * (r115 - r202)) + r92;
        r28 = 1;
        if (r135 != 1) goto L138;
        r116 = r116 * 0.5f;
    L138:
        r92 = r116;
        goto L139
    L140:
        r16 = r24;
        if (r92 >= 0.0f) goto L143;
        r20 = -1.0f;
    L143:
        r15 = ((float) Math.sqrt(Math.abs(r92) * 2.0f)) * r20;
        r25 = 1000;
        goto L144
    L150:
        r16 = r24;
        goto L152
    L95:
        if (r29.getSource() != 4194304) goto L108;
        Map r34 = AbstractC0133y.f322a;
        if (r34.containsKey(r24) == true) goto L99;
        r34.put(r24, new C0134z());
    L99:
        C0134z r35 = (C0134z) r34.get(r24);
        r35.getClass();
        long r76 = r29.getEventTime();
        int r93 = r35.f326d;
        long[] r117 = r35.f324b;
        if (r93 != 0) goto L102;
    L104:
        int r94 = (r35.f327e + 1) % 20;
        r35.f327e = r94;
        int r145 = r35.f326d;
        if (r145 == 20) goto L107;
        r35.f326d = r145 + 1;
    L107:
        r35.f323a[r94] = r29.getAxisValue(26);
        r117[r35.f327e] = r76;
        goto L108
    L102:
        if ((r76 - r117[r35.f327e]) <= 40) goto L104;
        r35.f326d = 0;
        r35.f325c = 0.0f;
        goto L104
    L59:
        InputDevice r36 = InputDevice.getDevice(r73);
        if (r36 != null) goto L62;
    L64:
        boolean r37 = false;
    L65:
        int r77 = Integer.MIN_VALUE;
        if (r37 == true) goto L68;
    L67:
        r22 = r77;
        goto L82
    L68:
        Resources r38 = r132.getResources();
        if (r142 == 4194304) goto L71;
    L73:
        int r62 = -1;
    L74:
        Objects.requireNonNull(r2);
        if (r62 == (-1)) goto L81;
        if (r62 == 0) goto L67;
        int r210 = r38.getDimensionPixelSize(r62);
        if (r210 < 0) goto L67;
        r77 = r210;
        goto L67
    L81:
        r22 = r2.getScaledMaximumFlingVelocity();
        goto L82
    L71:
        if (r42 != 26) goto L73;
        r62 = r38.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
        goto L74
    L62:
        if (r36.getMotionRange(r42, r142) == null) goto L64;
        r37 = true;
        goto L65
    L37:
        InputDevice r78 = InputDevice.getDevice(r7);
        if (r78 != null) goto L40;
    L54:
        r72 = Integer.MAX_VALUE;
        goto L55
    L40:
        if (r78.getMotionRange(r42, r14) == null) goto L54;
        Resources r79 = r132.getResources();
        if (r14 == 4194304) goto L44;
    L46:
        int r146 = -1;
    L47:
        Objects.requireNonNull(r2);
        if (r146 == (-1)) goto L53;
        if (r146 == 0) goto L54;
        r72 = r79.getDimensionPixelSize(r146);
        if (r72 >= 0) goto L55;
    L53:
        r72 = r2.getScaledMinimumFlingVelocity();
        goto L55
    L44:
        if (r42 != 26) goto L46;
        r146 = r79.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
        goto L47
    L28:
        if (r103.f279i != r122) goto L33;
        if (r103.f277g != r42) goto L33;
        r23 = 0;
        r6 = false;
        goto L84
    L184:
        return true;
    L22:
        r12 = false;
        goto L23
    L193:
        return false;
    L14:
        if ((r29.getSource() & 4194304) != 4194304) goto L16;
        r10 = r29.getAxisValue(26);
        r11 = getWidth() / 2;
        r42 = 26;
        goto L18
    L16:
        r10 = 0.0f;
        r42 = 0;
        r11 = 0;
        goto L18
    L9:
        r4 = false;
        goto L11
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r13) {
        int r02 = r13.getAction();
        boolean r1 = true;
        if (r02 == 2) goto L5;
    L7:
        int r03 = r02 & 255;
        if (r03 != 0) goto L10;
        int r04 = (int) r13.getY();
        int r5 = (int) r13.getX();
        if (getChildCount() <= 0) goto L63;
        int r6 = getScrollY();
        View r7 = getChildAt(0);
        if (r04 < (r7.getTop() - r6)) goto L63;
        if (r04 >= (r7.getBottom() - r6)) goto L63;
        if (r5 < r7.getLeft()) goto L63;
        if (r5 >= r7.getRight()) goto L63;
        this.f1324g = r04;
        this.f1335r = r13.getPointerId(0);
        VelocityTracker r05 = this.f1329l;
        if (r05 != null) goto L54;
        this.f1329l = VelocityTracker.obtain();
    L55:
        this.f1329l.addMovement(r13);
        this.f1321d.computeScrollOffset();
        if (m1193u(r13) == false) goto L58;
    L61:
        this.f1328k = r1;
        this.f1342y.m416h(2, 0);
    L72:
        return this.f1328k;
    L58:
        if (this.f1321d.isFinished() == false) goto L61;
        r1 = false;
        goto L61
    L54:
        r05.clear();
    L63:
        if (m1193u(r13) == false) goto L65;
    L68:
        this.f1328k = r1;
        VelocityTracker r132 = this.f1329l;
        if (r132 == null) goto L72;
        r132.recycle();
        this.f1329l = null;
        goto L72
    L65:
        if (this.f1321d.isFinished() == false) goto L68;
        r1 = false;
        goto L68
    L10:
        if (r03 == 1) goto L34;
        if (r03 != 2) goto L13;
        int r06 = this.f1335r;
        if (r06 == (-1)) goto L72;
        int r07 = r13.findPointerIndex(r06);
        if (r07 == (-1)) goto L72;
        int r08 = (int) r13.getY(r07);
        if (Math.abs(r08 - this.f1324g) <= this.f1332o) goto L72;
        if ((2 & getNestedScrollAxes()) != 0) goto L72;
        this.f1328k = true;
        this.f1324g = r08;
        if (this.f1329l != null) goto L31;
        this.f1329l = VelocityTracker.obtain();
    L31:
        this.f1329l.addMovement(r13);
        this.f1338u = 0;
        ViewParent r133 = getParent();
        if (r133 == null) goto L72;
        r133.requestDisallowInterceptTouchEvent(true);
        goto L72
    L13:
        if (r03 == 3) goto L34;
        if (r03 != 6) goto L72;
        m1186n(r13);
    L34:
        this.f1328k = false;
        this.f1335r = -1;
        VelocityTracker r134 = this.f1329l;
        if (r134 == null) goto L38;
        r134.recycle();
        this.f1329l = null;
    L38:
        if (this.f1321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L40;
        postInvalidateOnAnimation();
    L40:
        m1194v(0);
        goto L72
    L5:
        if (this.f1328k == false) goto L7;
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        super.onLayout(r2, r3, r4, r5, r6);
        int r22 = 0;
        this.f1325h = false;
        View r32 = this.f1327j;
        if (r32 != null) goto L5;
    L9:
        this.f1327j = null;
        if (this.f1326i == false) goto L12;
    L28:
        scrollTo(getScrollX(), getScrollY());
        this.f1326i = true;
        return;
    L12:
        if (this.f1340w == null) goto L15;
        scrollTo(getScrollX(), this.f1340w.f464a);
        this.f1340w = null;
    L15:
        if (getChildCount() <= 0) goto L17;
        View r33 = getChildAt(0);
        FrameLayout.LayoutParams r52 = (FrameLayout.LayoutParams) r33.getLayoutParams();
        int r34 = (r33.getMeasuredHeight() + r52.topMargin) + r52.bottomMargin;
    L18:
        int r62 = ((r6 - r4) - getPaddingTop()) - getPaddingBottom();
        int r42 = getScrollY();
        if (r62 >= r34) goto L26;
        if (r42 < 0) goto L26;
        if ((r62 + r42) <= r34) goto L25;
        r22 = r34 - r62;
        goto L26
    L25:
        r22 = r42;
    L26:
        if (r22 == r42) goto L28;
        scrollTo(getScrollX(), r22);
        goto L28
    L17:
        r34 = 0;
        goto L18
    L5:
        if (m1179k(r32, this) == false) goto L9;
        View r35 = this.f1327j;
        Rect r53 = this.f1320c;
        r35.getDrawingRect(r53);
        offsetDescendantRectToMyCoords(r35, r53);
        int r36 = m1181h(r53);
        if (r36 == 0) goto L9;
        scrollBy(0, r36);
        goto L9
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
        super.onMeasure(r5, r6);
        if (this.f1330m == true) goto L6;
        return;
    L6:
        if (View.MeasureSpec.getMode(r6) != 0) goto L9;
        return;
    L9:
        if (getChildCount() <= 0) goto L14;
        View r62 = getChildAt(0);
        FrameLayout.LayoutParams r02 = (FrameLayout.LayoutParams) r62.getLayoutParams();
        int r1 = r62.getMeasuredHeight();
        int r2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - r02.topMargin) - r02.bottomMargin;
        if (r1 >= r2) goto L15;
        int r12 = getPaddingLeft();
        r62.measure(ViewGroup.getChildMeasureSpec(r5, ((getPaddingRight() + r12) + r02.leftMargin) + r02.rightMargin, r02.width), View.MeasureSpec.makeMeasureSpec(r2, 1073741824));
        return;
    L15:
        return;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View r1, float r2, float r3, boolean r4) {
        if (r4 == true) goto L5;
        dispatchNestedFling(0.0f, r3, true);
        m1182i((int) r3);
        return true;
    L5:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View r1, float r2, float r3) {
        return this.f1342y.m410b(r2, r3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View r7, int r8, int r9, int[] r10) {
        this.f1342y.m411c(r8, r9, r10, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View r1, int r2, int r3, int r4, int r5) {
        m1185m(r5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r2, View r3, int r4) {
        mo421a(r2, r3, r4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
        super.scrollTo(r1, r2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r5, Rect r6) {
        if (r5 != 2) goto L5;
        r5 = 130;
    L7:
        if (r6 != null) goto L9;
        View r02 = FocusFinder.getInstance().findNextFocus(this, null, r5);
    L11:
        if (r02 != null) goto L14;
        return false;
    L14:
        if ((true ^ m1184l(r02, 0, getHeight())) == false) goto L17;
        return false;
    L17:
        return r02.requestFocus(r5, r6);
    L9:
        r02 = FocusFinder.getInstance().findNextFocusFromRect(this, r6, r5);
        goto L11
    L5:
        if (r5 != 1) goto L7;
        r5 = 33;
        goto L7
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C0223l) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C0223l r22 = (C0223l) r2;
        super.onRestoreInstanceState(r22.getSuperState());
        this.f1340w = r22;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0223l r1 = new C0223l(super.onSaveInstanceState());
        r1.f464a = getScrollY();
        return r1;
    }

    @Override // android.view.View
    public final void onScrollChanged(int r1, int r2, int r3, int r4) {
        super.onScrollChanged(r1, r2, r3, r4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        View r12 = findFocus();
        if (r12 == null) goto L15;
        if (this != r12) goto L7;
        return;
    L7:
        if (m1184l(r12, 0, r4) == false) goto L16;
        Rect r32 = this.f1320c;
        r12.getDrawingRect(r32);
        offsetDescendantRectToMyCoords(r12, r32);
        int r13 = m1181h(r32);
        if (r13 != 0) goto L11;
        return;
    L11:
        if (this.f1331n == false) goto L13;
        m1192t(0, r13, false);
        return;
    L13:
        scrollBy(0, r13);
        return;
    L16:
        return;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View r2, View r3, int r4) {
        return mo425f(r2, r3, r4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View r2) {
        mo423d(r2, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r21) {
        if (this.f1329l != null) goto L5;
        this.f1329l = VelocityTracker.obtain();
    L5:
        int r2 = r21.getActionMasked();
        if (r2 != 0) goto L8;
        this.f1338u = 0;
    L8:
        MotionEvent r4 = MotionEvent.obtain(r21);
        float r6 = 0.0f;
        r4.offsetLocation(0.0f, this.f1338u);
        C0113m r5 = this.f1342y;
        if (r2 == 0) goto L90;
        EdgeEffect r9 = this.f1323f;
        EdgeEffect r10 = this.f1322e;
        if (r2 == 1) goto L65;
        if (r2 != 2) goto L14;
        int r22 = r21.findPointerIndex(this.f1335r);
        if (r22 == (-1)) goto L101;
        int r52 = (int) r21.getY(r22);
        int r8 = this.f1324g - r52;
        float r11 = r21.getX(r22) / getWidth();
        float r12 = r8 / getHeight();
        if (AbstractC0040p.m117v(r10) == 0.0f) goto L43;
        float r92 = -AbstractC0040p.m85J(r10, -r12, r11);
        if (AbstractC0040p.m117v(r10) != 0.0f) goto L41;
        r10.onRelease();
    L41:
        r6 = r92;
    L48:
        int r62 = Math.round(r6 * getHeight());
        if (r62 == 0) goto L51;
        invalidate();
    L51:
        int r82 = r8 - r62;
        if (this.f1328k == true) goto L63;
        if (Math.abs(r82) <= this.f1332o) goto L63;
        ViewParent r63 = getParent();
        if (r63 == null) goto L58;
        r63.requestDisallowInterceptTouchEvent(true);
    L58:
        this.f1328k = true;
        if (r82 <= 0) goto L61;
        r82 = r82 - this.f1332o;
        goto L63
    L61:
        r82 = r82 + this.f1332o;
    L63:
        if (this.f1328k == false) goto L101;
        int r1 = m1190r(r82, (int) r21.getX(r22), 0, false);
        this.f1324g = r52 - r1;
        this.f1338u += r1;
        goto L101
    L43:
        if (AbstractC0040p.m117v(r9) == 0.0f) goto L48;
        float r102 = AbstractC0040p.m85J(r9, r12, 1.0f - r11);
        if (AbstractC0040p.m117v(r9) != 0.0f) goto L47;
        r9.onRelease();
    L47:
        r6 = r102;
    L101:
        VelocityTracker r13 = this.f1329l;
        if (r13 == null) goto L104;
        r13.addMovement(r4);
    L104:
        r4.recycle();
        return true;
    L14:
        if (r2 == 3) goto L23;
        if (r2 != 5) goto L18;
        int r23 = r21.getActionIndex();
        this.f1324g = (int) r21.getY(r23);
        this.f1335r = r21.getPointerId(r23);
        goto L101
    L18:
        if (r2 != 6) goto L101;
        m1186n(r21);
        this.f1324g = (int) r21.getY(r21.findPointerIndex(this.f1335r));
        goto L101
    L23:
        if (this.f1328k == true) goto L25;
    L29:
        this.f1335r = -1;
        this.f1328k = false;
        VelocityTracker r14 = this.f1329l;
        if (r14 == null) goto L32;
        r14.recycle();
        this.f1329l = null;
    L32:
        m1194v(0);
        this.f1322e.onRelease();
        this.f1323f.onRelease();
        goto L101
    L25:
        if (getChildCount() <= 0) goto L29;
        if (this.f1321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L29;
        postInvalidateOnAnimation();
        goto L29
    L65:
        VelocityTracker r15 = this.f1329l;
        r15.computeCurrentVelocity(1000, this.f1334q);
        int r16 = (int) r15.getYVelocity(this.f1335r);
        if (Math.abs(r16) < this.f1333p) goto L83;
        if (AbstractC0040p.m117v(r10) == 0.0f) goto L74;
        if (m1191s(r10, r16) == false) goto L72;
        r10.onAbsorb(r16);
    L85:
        this.f1335r = -1;
        this.f1328k = false;
        VelocityTracker r17 = this.f1329l;
        if (r17 == null) goto L88;
        r17.recycle();
        this.f1329l = null;
    L88:
        m1194v(0);
        this.f1322e.onRelease();
        this.f1323f.onRelease();
        goto L101
    L72:
        m1182i(-r16);
        goto L85
    L74:
        if (AbstractC0040p.m117v(r9) == 0.0f) goto L79;
        int r18 = -r16;
        if (m1191s(r9, r18) == false) goto L78;
        r9.onAbsorb(r18);
        goto L85
    L78:
        m1182i(r18);
        goto L85
    L79:
        int r19 = -r16;
        float r24 = r19;
        if (r5.m410b(0.0f, r24) == true) goto L85;
        dispatchNestedFling(0.0f, r24, true);
        m1182i(r19);
        goto L85
    L83:
        if (this.f1321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L85;
        postInvalidateOnAnimation();
        goto L85
    L90:
        if (getChildCount() != 0) goto L93;
        return false;
    L93:
        if (this.f1328k == false) goto L98;
        ViewParent r25 = getParent();
        if (r25 == null) goto L98;
        r25.requestDisallowInterceptTouchEvent(true);
    L98:
        if (this.f1321d.isFinished() == true) goto L100;
        this.f1321d.abortAnimation();
        m1194v(1);
    L100:
        int r26 = (int) r21.getY();
        int r110 = r21.getPointerId(0);
        this.f1324g = r26;
        this.f1335r = r110;
        r5.m416h(2, 0);
        goto L101
    }

    /* JADX INFO: renamed from: p */
    public final void m1188p(int r6) {
        if (r6 != 130) goto L5;
        boolean r02 = true;
    L6:
        int r3 = getHeight();
        Rect r4 = this.f1320c;
        if (r02 == false) goto L13;
        r4.top = getScrollY() + r3;
        int r03 = getChildCount();
        if (r03 <= 0) goto L16;
        View r04 = getChildAt(r03 - 1);
        int r1 = getPaddingBottom() + (r04.getBottom() + ((FrameLayout.LayoutParams) r04.getLayoutParams()).bottomMargin);
        if ((r4.top + r3) <= r1) goto L16;
        r4.top = r1 - r3;
    L16:
        int r05 = r4.top;
        int r32 = r3 + r05;
        r4.bottom = r32;
        m1189q(r6, r05, r32);
        return;
    L13:
        int r06 = getScrollY() - r3;
        r4.top = r06;
        if (r06 >= 0) goto L16;
        r4.top = 0;
        goto L16
    L5:
        r02 = false;
        goto L6
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1189q(int r18, int r19, int r20) {
        int r4 = getHeight();
        int r5 = getScrollY();
        int r42 = r4 + r5;
        if (r18 != 33) goto L5;
        boolean r6 = true;
    L6:
        ArrayList<View> r9 = getFocusables(2);
        int r10 = r9.size();
        View r11 = null;
        int r12 = 0;
        boolean r13 = false;
    L7:
        if (r12 >= r10) goto L34;
        View r14 = r9.get(r12);
        int r15 = r14.getTop();
        int r7 = r14.getBottom();
        if (r19 >= r7) goto L33;
        if (r15 >= r20) goto L33;
        if (r19 >= r15) goto L14;
        if (r7 >= r20) goto L14;
        boolean r16 = true;
    L15:
        if (r11 != null) goto L17;
        r11 = r14;
        r13 = r16;
        goto L33
    L17:
        if (r6 == true) goto L19;
    L20:
        if (r6 == false) goto L22;
    L24:
        boolean r72 = false;
    L25:
        if (r13 == false) goto L29;
        if (r16 == false) goto L33;
        if (r72 == false) goto L33;
    L32:
        r11 = r14;
        goto L33
    L29:
        if (r16 == false) goto L31;
        r11 = r14;
        r13 = true;
        goto L33
    L31:
        if (r72 == false) goto L33;
    L22:
        if (r7 <= r11.getBottom()) goto L24;
    L23:
        r72 = true;
        goto L25
    L19:
        if (r15 < r11.getTop()) goto L23;
    L14:
        r16 = false;
    L33:
        r12 = r12 + 1;
        goto L7
    L34:
        if (r11 != null) goto L36;
        r11 = this;
    L36:
        if (r19 < r5) goto L39;
        if (r20 > r42) goto L39;
        boolean r73 = false;
    L45:
        if (r11 == findFocus()) goto L47;
        r11.requestFocus(r18);
    L47:
        return r73;
    L39:
        if (r6 == false) goto L42;
        int r2 = r19 - r5;
    L43:
        m1190r(r2, 0, 1, true);
        r73 = true;
        goto L45
    L42:
        r2 = r20 - r42;
        goto L43
    L5:
        r6 = false;
        goto L6
    }

    /* JADX INFO: renamed from: r */
    public final int m1190r(int r21, int r22, int r23, boolean r24) {
        C0113m r8 = this.f1342y;
        if (r23 != 1) goto L5;
        r8.m416h(2, r23);
    L5:
        boolean r2 = this.f1342y.m411c(0, r21, this.f1337t, this.f1336s, r23);
        int[] r13 = this.f1337t;
        int[] r14 = this.f1336s;
        if (r2 == false) goto L8;
        int r15 = r21 - r13[1];
        int r16 = r14[1];
    L9:
        int r9 = getScrollY();
        int r7 = getScrollRange();
        int r25 = getOverScrollMode();
        if (r25 == 0) goto L14;
        if (r25 == 1) goto L13;
    L16:
        boolean r17 = false;
    L18:
        if (m1187o(r15, 0, r9, r7) == true) goto L20;
    L22:
        boolean r18 = false;
    L23:
        int r4 = getScrollY() - r9;
        r13[1] = 0;
        this.f1342y.m413e(0, r4, 0, r15 - r4, this.f1336s, r23, r13);
        int r162 = r16 + r14[1];
        int r152 = r15 - r13[1];
        int r92 = r9 + r152;
        EdgeEffect r26 = this.f1323f;
        EdgeEffect r3 = this.f1322e;
        if (r92 >= 0) goto L29;
        if (r17 == false) goto L35;
        AbstractC0040p.m85J(r3, (-r152) / getHeight(), r22 / getWidth());
        if (r26.isFinished() == true) goto L35;
        r26.onRelease();
    L35:
        if (r3.isFinished() == true) goto L37;
    L40:
        postInvalidateOnAnimation();
        boolean r12 = false;
    L41:
        if (r12 == false) goto L46;
        if (r23 != 0) goto L46;
        VelocityTracker r1 = this.f1329l;
        if (r1 == null) goto L46;
        r1.clear();
    L46:
        if (r23 != 1) goto L48;
        m1194v(r23);
        r3.onRelease();
        r26.onRelease();
    L48:
        return r162;
    L37:
        if (r26.isFinished() == false) goto L40;
        r12 = r18;
        goto L41
    L29:
        if (r92 <= r7) goto L35;
        if (r17 == false) goto L35;
        AbstractC0040p.m85J(r26, r152 / getHeight(), 1.0f - (r22 / getWidth()));
        if (r3.isFinished() == true) goto L35;
        r3.onRelease();
        goto L35
    L20:
        if (r8.m415g(r23) == true) goto L22;
        r18 = true;
        goto L23
    L13:
        if (getScrollRange() <= 0) goto L16;
    L14:
        if (r24 == true) goto L16;
        r17 = true;
        goto L18
    L8:
        r15 = r21;
        r16 = 0;
        goto L9
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View r3, View r4) {
        if (this.f1325h == true) goto L7;
        Rect r02 = this.f1320c;
        r4.getDrawingRect(r02);
        offsetDescendantRectToMyCoords(r4, r02);
        int r03 = m1181h(r02);
        if (r03 == 0) goto L8;
        scrollBy(0, r03);
    L8:
        super.requestChildFocus(r3, r4);
        return;
    L7:
        this.f1327j = r4;
        goto L8
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View r3, Rect r4, boolean r5) {
        r4.offset(r3.getLeft() - r3.getScrollX(), r3.getTop() - r3.getScrollY());
        int r32 = m1181h(r4);
        if (r32 == 0) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == false) goto L10;
        if (r5 == false) goto L9;
        scrollBy(0, r32);
        goto L10
    L9:
        m1192t(0, r32, false);
    L10:
        return r02;
    L5:
        r02 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r2) {
        if (r2 == false) goto L6;
        VelocityTracker r02 = this.f1329l;
        if (r02 == null) goto L6;
        r02.recycle();
        this.f1329l = null;
    L6:
        super.requestDisallowInterceptTouchEvent(r2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1325h = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1191s(EdgeEffect r11, int r12) {
        if (r12 <= 0) goto L5;
        return true;
    L5:
        float r112 = AbstractC0040p.m117v(r11) * getHeight();
        float r122 = Math.abs(-r12) * 0.35f;
        float r1 = this.f1318a * 0.015f;
        double r2 = Math.log(r122 / r1);
        double r4 = f1314B;
        if (((float) (Math.exp((r4 / (r4 - 1.0d)) * r2) * r1)) < r112) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // android.view.View
    public final void scrollTo(int r8, int r9) {
        if (getChildCount() <= 0) goto L25;
        View r1 = getChildAt(0);
        FrameLayout.LayoutParams r2 = (FrameLayout.LayoutParams) r1.getLayoutParams();
        int r3 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int r4 = (r1.getWidth() + r2.leftMargin) + r2.rightMargin;
        int r5 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int r12 = (r1.getHeight() + r2.topMargin) + r2.bottomMargin;
        if (r3 >= r4) goto L11;
        if (r8 < 0) goto L11;
        if ((r3 + r8) <= r4) goto L12;
        r8 = r4 - r3;
    L12:
        if (r5 >= r12) goto L18;
        if (r9 < 0) goto L18;
        if ((r5 + r9) <= r12) goto L20;
        r9 = r12 - r5;
    L20:
        if (r8 == getScrollX()) goto L22;
    L23:
        super.scrollTo(r8, r9);
        return;
    L22:
        if (r9 != getScrollY()) goto L23;
        return;
    L18:
        r9 = 0;
    L11:
        r8 = 0;
        goto L12
    }

    public void setFillViewport(boolean r2) {
        if (r2 == this.f1330m) goto L6;
        this.f1330m = r2;
        requestLayout();
        return;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r3) {
        C0113m r02 = this.f1342y;
        if (r02.f298d == false) goto L5;
        Field r1 = AbstractC0080Q.f219a;
        AbstractC0070G.m236z(r02.f297c);
    L5:
        r02.f298d = r3;
    }

    public void setOnScrollChangeListener(InterfaceC0221j r1) {
    }

    public void setSmoothScrollingEnabled(boolean r1) {
        this.f1331n = r1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return this.f1342y.m416h(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1194v(0);
    }

    /* JADX INFO: renamed from: t */
    public final void m1192t(int r10, int r11, boolean r12) {
        if (getChildCount() != 0) goto L6;
        return;
    L6:
        if ((AnimationUtils.currentAnimationTimeMillis() - this.f1319b) <= 250) goto L13;
        View r02 = getChildAt(0);
        FrameLayout.LayoutParams r2 = (FrameLayout.LayoutParams) r02.getLayoutParams();
        int r03 = (r02.getHeight() + r2.topMargin) + r2.bottomMargin;
        int r22 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int r5 = getScrollY();
        int r112 = r11 + r5;
        int r7 = Math.max(0, Math.min(r112, Math.max(0, r03 - r22))) - r5;
        this.f1321d.startScroll(getScrollX(), r5, 0, r7, 250);
        if (r12 == false) goto L10;
        this.f1342y.m416h(2, 1);
    L11:
        this.f1339v = getScrollY();
        postInvalidateOnAnimation();
    L16:
        this.f1319b = AnimationUtils.currentAnimationTimeMillis();
        return;
    L10:
        m1194v(1);
        goto L11
    L13:
        if (this.f1321d.isFinished() == true) goto L15;
        this.f1321d.abortAnimation();
        m1194v(1);
    L15:
        scrollBy(r10, r11);
        goto L16
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1193u(MotionEvent r6) {
        EdgeEffect r02 = this.f1322e;
        if (AbstractC0040p.m117v(r02) == 0.0f) goto L5;
        AbstractC0040p.m85J(r02, 0.0f, r6.getX() / getWidth());
        boolean r03 = true;
    L6:
        EdgeEffect r1 = this.f1323f;
        if (AbstractC0040p.m117v(r1) == 0.0f) goto L10;
        AbstractC0040p.m85J(r1, 0.0f, 1.0f - (r6.getX() / getWidth()));
        return true;
    L10:
        return r03;
    L5:
        r03 = false;
        goto L6
    }

    /* JADX INFO: renamed from: v */
    public final void m1194v(int r2) {
        this.f1342y.m417i(r2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2, int r3) {
        if (getChildCount() > 0) goto L7;
        super.addView(r2, r3);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View r2, ViewGroup.LayoutParams r3) {
        if (getChildCount() > 0) goto L7;
        super.addView(r2, r3);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2, int r3, ViewGroup.LayoutParams r4) {
        if (getChildCount() > 0) goto L7;
        super.addView(r2, r3, r4);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
