package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.luckypray.dexkit.C1031R;
import p000A.C0002c;
import p001A0.RunnableC0019E;
import p006D.AbstractC0070G;
import p006D.AbstractC0072I;
import p006D.AbstractC0080Q;
import p006D.AbstractC0081S;
import p006D.C0113m;
import p017J.AbstractC0215d;
import p018J0.C0234d;
import p021L.InterpolatorC0244d;
import p035T.AbstractC0337a;
import p037U.AbstractC0341A;
import p037U.AbstractC0343C;
import p037U.AbstractC0345E;
import p037U.AbstractC0346F;
import p037U.AbstractC0353M;
import p037U.AbstractC0355O;
import p037U.AbstractC0365a;
import p037U.AbstractC0387w;
import p037U.AbstractC0390z;
import p037U.C0344D;
import p037U.C0347G;
import p037U.C0348H;
import p037U.C0349I;
import p037U.C0351K;
import p037U.C0352L;
import p037U.C0357Q;
import p037U.C0364Y;
import p037U.C0366b;
import p037U.C0371g;
import p037U.C0374j;
import p037U.C0376l;
import p037U.C0386v;
import p037U.C0389y;
import p037U.InterfaceC0350J;
import p037U.InterfaceC0388x;
import p037U.RunnableC0354N;
import p037U.RunnableC0378n;
import p063j.C0960e;
import p063j.C0966k;
import p089x0.C1121e;
import p091z.AbstractC1142a;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: k0 */
    public static final int[] f1536k0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: l0 */
    public static final Class[] f1537l0;

    /* JADX INFO: renamed from: m0 */
    public static final InterpolatorC0244d f1538m0;

    /* JADX INFO: renamed from: A */
    public C0389y f1539A;

    /* JADX INFO: renamed from: B */
    public EdgeEffect f1540B;

    /* JADX INFO: renamed from: C */
    public EdgeEffect f1541C;

    /* JADX INFO: renamed from: D */
    public EdgeEffect f1542D;

    /* JADX INFO: renamed from: E */
    public EdgeEffect f1543E;

    /* JADX INFO: renamed from: F */
    public AbstractC0390z f1544F;

    /* JADX INFO: renamed from: G */
    public int f1545G;

    /* JADX INFO: renamed from: H */
    public int f1546H;

    /* JADX INFO: renamed from: I */
    public VelocityTracker f1547I;

    /* JADX INFO: renamed from: J */
    public int f1548J;

    /* JADX INFO: renamed from: K */
    public int f1549K;

    /* JADX INFO: renamed from: L */
    public int f1550L;

    /* JADX INFO: renamed from: M */
    public int f1551M;

    /* JADX INFO: renamed from: N */
    public int f1552N;

    /* JADX INFO: renamed from: O */
    public final int f1553O;

    /* JADX INFO: renamed from: P */
    public final int f1554P;

    /* JADX INFO: renamed from: Q */
    public final float f1555Q;

    /* JADX INFO: renamed from: R */
    public final float f1556R;

    /* JADX INFO: renamed from: S */
    public boolean f1557S;

    /* JADX INFO: renamed from: T */
    public final RunnableC0354N f1558T;

    /* JADX INFO: renamed from: U */
    public RunnableC0378n f1559U;

    /* JADX INFO: renamed from: V */
    public final C0376l f1560V;

    /* JADX INFO: renamed from: W */
    public final C0352L f1561W;

    /* JADX INFO: renamed from: a */
    public final C0349I f1562a;

    /* JADX INFO: renamed from: a0 */
    public AbstractC0346F f1563a0;

    /* JADX INFO: renamed from: b */
    public C0351K f1564b;

    /* JADX INFO: renamed from: b0 */
    public ArrayList f1565b0;

    /* JADX INFO: renamed from: c */
    public final C0234d f1566c;

    /* JADX INFO: renamed from: c0 */
    public final C0386v f1567c0;

    /* JADX INFO: renamed from: d */
    public final C0234d f1568d;

    /* JADX INFO: renamed from: d0 */
    public C0357Q f1569d0;

    /* JADX INFO: renamed from: e */
    public final C0002c f1570e;

    /* JADX INFO: renamed from: e0 */
    public C0113m f1571e0;

    /* JADX INFO: renamed from: f */
    public boolean f1572f;

    /* JADX INFO: renamed from: f0 */
    public final int[] f1573f0;

    /* JADX INFO: renamed from: g */
    public final Rect f1574g;

    /* JADX INFO: renamed from: g0 */
    public final int[] f1575g0;

    /* JADX INFO: renamed from: h */
    public final Rect f1576h;

    /* JADX INFO: renamed from: h0 */
    public final int[] f1577h0;

    /* JADX INFO: renamed from: i */
    public final RectF f1578i;

    /* JADX INFO: renamed from: i0 */
    public final ArrayList f1579i0;

    /* JADX INFO: renamed from: j */
    public AbstractC0343C f1580j;

    /* JADX INFO: renamed from: j0 */
    public final RunnableC0019E f1581j0;

    /* JADX INFO: renamed from: k */
    public final ArrayList f1582k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f1583l;

    /* JADX INFO: renamed from: m */
    public C0374j f1584m;

    /* JADX INFO: renamed from: n */
    public boolean f1585n;

    /* JADX INFO: renamed from: o */
    public boolean f1586o;

    /* JADX INFO: renamed from: p */
    public boolean f1587p;

    /* JADX INFO: renamed from: q */
    public int f1588q;

    /* JADX INFO: renamed from: r */
    public boolean f1589r;

    /* JADX INFO: renamed from: s */
    public boolean f1590s;

    /* JADX INFO: renamed from: t */
    public boolean f1591t;

    /* JADX INFO: renamed from: u */
    public int f1592u;

    /* JADX INFO: renamed from: v */
    public final AccessibilityManager f1593v;

    /* JADX INFO: renamed from: w */
    public boolean f1594w;

    /* JADX INFO: renamed from: x */
    public boolean f1595x;

    /* JADX INFO: renamed from: y */
    public int f1596y;

    /* JADX INFO: renamed from: z */
    public final int f1597z;

    static {
        Class cls = Integer.TYPE;
        f1537l0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1538m0 = new InterpolatorC0244d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1031R.attr.recyclerViewStyle);
    }

    /* JADX INFO: renamed from: e */
    public static void m1300e(AbstractC0355O abstractC0355O) {
        WeakReference weakReference = abstractC0355O.f710a;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                abstractC0355O.getClass();
                if (view == null) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0355O.f710a = null;
        }
    }

    private C0113m getScrollingChildHelper() {
        if (this.f1571e0 == null) {
            this.f1571e0 = new C0113m(this);
        }
        return this.f1571e0;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC0355O m1301u(View view) {
        if (view == null) {
            return null;
        }
        ((C0344D) view.getLayoutParams()).getClass();
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final void m1302A(boolean z2) {
        AccessibilityManager accessibilityManager;
        int i2 = this.f1596y - 1;
        this.f1596y = i2;
        if (i2 < 1) {
            this.f1596y = 0;
            if (z2) {
                int i3 = this.f1592u;
                this.f1592u = 0;
                if (i3 != 0 && (accessibilityManager = this.f1593v) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f1579i0;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    arrayList.clear();
                } else {
                    ((AbstractC0355O) arrayList.get(size)).getClass();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m1303B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1546H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1546H = motionEvent.getPointerId(i2);
            int x = (int) (motionEvent.getX(i2) + 0.5f);
            this.f1550L = x;
            this.f1548J = x;
            int y = (int) (motionEvent.getY(i2) + 0.5f);
            this.f1551M = y;
            this.f1549K = y;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1304C(boolean z2) {
        this.f1595x = z2 | this.f1595x;
        this.f1594w = true;
        int iM650m = this.f1568d.m650m();
        for (int i2 = 0; i2 < iM650m; i2++) {
            m1301u(this.f1568d.m649l(i2));
        }
        m1332y();
        C0349I c0349i = this.f1562a;
        ArrayList arrayList = c0349i.f687c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
        c0349i.f691g.getClass();
        c0349i.m824d();
    }

    /* JADX INFO: renamed from: D */
    public final void m1305D(AbstractC0355O abstractC0355O, C1121e c1121e) {
        abstractC0355O.f711b &= -8193;
        boolean z2 = this.f1561W.f699g;
        C0002c c0002c = this.f1570e;
        if (z2 && abstractC0355O.m846l() && !abstractC0355O.m843i() && !abstractC0355O.m849o()) {
            ((C0960e) c0002c.f8c).m2310e(m1328t(abstractC0355O), abstractC0355O);
        }
        C0966k c0966k = (C0966k) c0002c.f7b;
        C0364Y c0364yM936a = (C0364Y) c0966k.getOrDefault(abstractC0355O, null);
        if (c0364yM936a == null) {
            c0364yM936a = C0364Y.m936a();
            c0966k.put(abstractC0355O, c0364yM936a);
        }
        c0364yM936a.getClass();
        c0364yM936a.f773a |= 4;
    }

    /* JADX INFO: renamed from: E */
    public final void m1306E(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1574g;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0344D) {
            C0344D c0344d = (C0344D) layoutParams;
            if (!c0344d.f678b) {
                int i2 = rect.left;
                Rect rect2 = c0344d.f677a;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1580j.mo792X(this, view, this.f1574g, !this.f1587p, view2 == null);
    }

    /* JADX INFO: renamed from: F */
    public final void m1307F() {
        VelocityTracker velocityTracker = this.f1547I;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m1312K(0);
        EdgeEffect edgeEffect = this.f1540B;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f1540B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1541C;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f1541C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1542D;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f1542D.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1543E;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f1543E.isFinished();
        }
        if (zIsFinished) {
            Field field = AbstractC0080Q.f219a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1308G(int i2, int i3, MotionEvent motionEvent) {
        m1315g();
        if (!this.f1582k.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f1577h0;
        boolean z2 = false;
        iArr[0] = 0;
        boolean z3 = true;
        iArr[1] = 0;
        m1319k(0, 0, 0, 0, this.f1573f0, 0, iArr);
        int i4 = iArr[0];
        int i5 = 0 - i4;
        int i6 = iArr[1];
        int i7 = 0 - i6;
        boolean z4 = (i4 == 0 && i6 == 0) ? false : true;
        int i8 = this.f1550L;
        int[] iArr2 = this.f1573f0;
        int i9 = iArr2[0];
        this.f1550L = i8 - i9;
        int i10 = this.f1551M;
        int i11 = iArr2[1];
        this.f1551M = i10 - i11;
        int[] iArr3 = this.f1575g0;
        iArr3[0] = iArr3[0] + i9;
        iArr3[1] = iArr3[1] + i11;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x = motionEvent.getX();
                float f2 = i5;
                float y = motionEvent.getY();
                float f3 = i7;
                if (f2 < 0.0f) {
                    m1321m();
                    AbstractC0215d.m598a(this.f1540B, (-f2) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    if (f2 > 0.0f) {
                        m1322n();
                        AbstractC0215d.m598a(this.f1542D, f2 / getWidth(), y / getHeight());
                    }
                    if (f3 >= 0.0f) {
                        m1323o();
                        AbstractC0215d.m598a(this.f1541C, (-f3) / getHeight(), x / getWidth());
                    } else if (f3 > 0.0f) {
                        m1320l();
                        AbstractC0215d.m598a(this.f1543E, f3 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        z3 = z2;
                    }
                    if (!z3 || f2 != 0.0f || f3 != 0.0f) {
                        Field field = AbstractC0080Q.f219a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = true;
                if (f3 >= 0.0f) {
                }
                if (!z3) {
                    Field field2 = AbstractC0080Q.f219a;
                    postInvalidateOnAnimation();
                }
            }
            m1314f(i2, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return z4;
    }

    /* JADX INFO: renamed from: H */
    public final void m1309H(int i2, int i3, boolean z2) {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C == null || this.f1590s) {
            return;
        }
        if (!abstractC0343C.mo799c()) {
            i2 = 0;
        }
        if (!this.f1580j.mo800d()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().m416h(i4, 1);
        }
        this.f1558T.m834b(i2, i3, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: I */
    public final void m1310I() {
        int i2 = this.f1588q + 1;
        this.f1588q = i2;
        if (i2 != 1 || this.f1590s) {
            return;
        }
        this.f1589r = false;
    }

    /* JADX INFO: renamed from: J */
    public final void m1311J(boolean z2) {
        if (this.f1588q < 1) {
            this.f1588q = 1;
        }
        if (!z2 && !this.f1590s) {
            this.f1589r = false;
        }
        if (this.f1588q == 1) {
            if (z2 && this.f1589r) {
                boolean z3 = this.f1590s;
            }
            if (!this.f1590s) {
                this.f1589r = false;
            }
        }
        this.f1588q--;
    }

    /* JADX INFO: renamed from: K */
    public final void m1312K(int i2) {
        getScrollingChildHelper().m417i(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null) {
            abstractC0343C.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0344D) && this.f1580j.mo801e((C0344D) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null && abstractC0343C.mo799c()) {
            return this.f1580j.mo802g(this.f1561W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null && abstractC0343C.mo799c()) {
            return this.f1580j.mo803h(this.f1561W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null && abstractC0343C.mo799c()) {
            return this.f1580j.mo804i(this.f1561W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null && abstractC0343C.mo800d()) {
            return this.f1580j.mo805j(this.f1561W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null && abstractC0343C.mo800d()) {
            return this.f1580j.mo806k(this.f1561W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null && abstractC0343C.mo800d()) {
            return this.f1580j.mo807l(this.f1561W);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m1313d(String str) {
        if (m1331x()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m1324p());
        }
        if (this.f1597z > 0) {
            new IllegalStateException("" + m1324p());
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().m409a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().m410b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m411c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().m413e(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f1582k;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0341A) arrayList.get(i2)).mo759b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1540B;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1572f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1540B;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f1541C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1572f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1541C;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f1542D;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1572f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1542D;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f1543E;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1572f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1543E;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f1544F == null || arrayList.size() <= 0 || !this.f1544F.mo948e()) ? z2 : true) {
            Field field = AbstractC0080Q.f219a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* JADX INFO: renamed from: f */
    public final void m1314f(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1540B;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.f1540B.onRelease();
            zIsFinished = this.f1540B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1542D;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f1542D.onRelease();
            zIsFinished |= this.f1542D.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1541C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f1541C.onRelease();
            zIsFinished |= this.f1541C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1543E;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f1543E.onRelease();
            zIsFinished |= this.f1543E.isFinished();
        }
        if (zIsFinished) {
            Field field = AbstractC0080Q.f219a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i2) {
        int i3;
        byte b2;
        this.f1580j.getClass();
        boolean z2 = true;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (viewFindNextFocus != null && !viewFindNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            m1306E(viewFindNextFocus, null);
            return view;
        }
        if (viewFindNextFocus == null || viewFindNextFocus == this) {
            z2 = false;
        } else if (m1325q(viewFindNextFocus) == null) {
            z2 = false;
        } else if (view != null && m1325q(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f1574g;
            rect.set(0, 0, width, height);
            int width2 = viewFindNextFocus.getWidth();
            int height2 = viewFindNextFocus.getHeight();
            Rect rect2 = this.f1576h;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect2);
            int i4 = this.f1580j.m817y() == 1 ? -1 : 1;
            int i5 = rect.left;
            int i6 = rect2.left;
            if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
                i3 = 1;
            } else {
                int i7 = rect.right;
                int i8 = rect2.right;
                i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                b2 = 1;
            } else {
                int i11 = rect.bottom;
                int i12 = rect2.bottom;
                b2 = ((i11 > i12 || i9 >= i12) && i9 > i10) ? (byte) -1 : (byte) 0;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 17) {
                        if (i2 != 33) {
                            if (i2 != 66) {
                                if (i2 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i2 + m1324p());
                                }
                                if (b2 <= 0) {
                                }
                            } else if (i3 <= 0) {
                            }
                        } else if (b2 >= 0) {
                        }
                    } else if (i3 >= 0) {
                    }
                } else if (b2 <= 0 && (b2 != 0 || i3 * i4 < 0)) {
                }
            } else if (b2 >= 0 && (b2 != 0 || i3 * i4 > 0)) {
            }
        }
        return z2 ? viewFindNextFocus : super.focusSearch(view, i2);
    }

    /* JADX INFO: renamed from: g */
    public final void m1315g() {
        C0234d c0234d = this.f1566c;
        if (!this.f1587p || this.f1594w) {
            int i2 = AbstractC1142a.f4403a;
            Trace.beginSection("RV FullInvalidate");
            Trace.endSection();
        } else if (c0234d.m652o()) {
            c0234d.getClass();
            if (c0234d.m652o()) {
                int i3 = AbstractC1142a.f4403a;
                Trace.beginSection("RV FullInvalidate");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null) {
            return abstractC0343C.mo809n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1324p());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null) {
            return abstractC0343C.mo810o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1324p());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0387w getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C == null) {
            return super.getBaseline();
        }
        abstractC0343C.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1572f;
    }

    public C0357Q getCompatAccessibilityDelegate() {
        return this.f1569d0;
    }

    public C0389y getEdgeEffectFactory() {
        return this.f1539A;
    }

    public AbstractC0390z getItemAnimator() {
        return this.f1544F;
    }

    public int getItemDecorationCount() {
        return this.f1582k.size();
    }

    public AbstractC0343C getLayoutManager() {
        return this.f1580j;
    }

    public int getMaxFlingVelocity() {
        return this.f1554P;
    }

    public int getMinFlingVelocity() {
        return this.f1553O;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0345E getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1557S;
    }

    public C0348H getRecycledViewPool() {
        return this.f1562a.m823c();
    }

    public int getScrollState() {
        return this.f1545G;
    }

    /* JADX INFO: renamed from: h */
    public final void m1316h(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = AbstractC0080Q.f219a;
        setMeasuredDimension(AbstractC0343C.m768f(i2, paddingRight, getMinimumWidth()), AbstractC0343C.m768f(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m415g(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m1317i() {
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1585n;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1590s;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f298d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1318j(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().m411c(i2, i3, iArr, iArr2, i4);
    }

    /* JADX INFO: renamed from: k */
    public final void m1319k(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().m413e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    /* JADX INFO: renamed from: l */
    public final void m1320l() {
        if (this.f1543E != null) {
            return;
        }
        this.f1539A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1543E = edgeEffect;
        if (this.f1572f) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1321m() {
        if (this.f1540B != null) {
            return;
        }
        this.f1539A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1540B = edgeEffect;
        if (this.f1572f) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1322n() {
        if (this.f1542D != null) {
            return;
        }
        this.f1539A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1542D = edgeEffect;
        if (this.f1572f) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1323o() {
        if (this.f1541C != null) {
            return;
        }
        this.f1539A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1541C = edgeEffect;
        if (this.f1572f) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        boolean z2 = false;
        this.f1596y = 0;
        this.f1585n = true;
        if (this.f1587p && !isLayoutRequested()) {
            z2 = true;
        }
        this.f1587p = z2;
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null) {
            abstractC0343C.f671e = true;
            abstractC0343C.mo778J(this);
        }
        ThreadLocal threadLocal = RunnableC0378n.f832e;
        RunnableC0378n runnableC0378n = (RunnableC0378n) threadLocal.get();
        this.f1559U = runnableC0378n;
        if (runnableC0378n == null) {
            RunnableC0378n runnableC0378n2 = new RunnableC0378n();
            runnableC0378n2.f834a = new ArrayList();
            runnableC0378n2.f837d = new ArrayList();
            this.f1559U = runnableC0378n2;
            Field field = AbstractC0080Q.f219a;
            Display display = getDisplay();
            if (isInEditMode() || display == null) {
                refreshRate = 60.0f;
                RunnableC0378n runnableC0378n3 = this.f1559U;
                runnableC0378n3.f836c = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC0378n3);
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
                RunnableC0378n runnableC0378n32 = this.f1559U;
                runnableC0378n32.f836c = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC0378n32);
            }
        }
        this.f1559U.f834a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0390z abstractC0390z = this.f1544F;
        if (abstractC0390z != null) {
            abstractC0390z.mo947d();
        }
        setScrollState(0);
        RunnableC0354N runnableC0354N = this.f1558T;
        runnableC0354N.f709g.removeCallbacks(runnableC0354N);
        runnableC0354N.f705c.abortAnimation();
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null) {
            abstractC0343C.getClass();
        }
        this.f1585n = false;
        AbstractC0343C abstractC0343C2 = this.f1580j;
        if (abstractC0343C2 != null) {
            abstractC0343C2.f671e = false;
            abstractC0343C2.mo779K(this);
        }
        this.f1579i0.clear();
        removeCallbacks(this.f1581j0);
        this.f1570e.getClass();
        while (C0364Y.f772b.mo198a() != null) {
        }
        RunnableC0378n runnableC0378n = this.f1559U;
        if (runnableC0378n != null) {
            runnableC0378n.f834a.remove(this);
            this.f1559U = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1582k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0341A) arrayList.get(i2)).m758a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float axisValue;
        if (this.f1580j != null && !this.f1590s && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1580j.mo800d() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f1580j.mo799c() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f2 != 0.0f || axisValue != 0.0f) {
                    m1308G((int) (axisValue * this.f1555Q), (int) (f2 * this.f1556R), motionEvent);
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f1580j.mo800d()) {
                    f2 = -axisValue2;
                    if (f2 != 0.0f) {
                        m1308G((int) (axisValue * this.f1555Q), (int) (f2 * this.f1556R), motionEvent);
                    }
                } else {
                    if (this.f1580j.mo799c()) {
                        axisValue = axisValue2;
                        f2 = 0.0f;
                    } else {
                        f2 = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f2 != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1590s) {
            return false;
        }
        this.f1584m = null;
        if (m1326r(motionEvent)) {
            m1307F();
            setScrollState(0);
            return true;
        }
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C == null) {
            return false;
        }
        boolean zMo799c = abstractC0343C.mo799c();
        boolean zMo800d = this.f1580j.mo800d();
        if (this.f1547I == null) {
            this.f1547I = VelocityTracker.obtain();
        }
        this.f1547I.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1591t) {
                this.f1591t = false;
            }
            this.f1546H = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f1550L = x;
            this.f1548J = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f1551M = y;
            this.f1549K = y;
            if (this.f1545G == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m1312K(1);
            }
            int[] iArr = this.f1575g0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zMo799c;
            if (zMo800d) {
                i2 = (zMo799c ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m416h(i2, 0);
        } else if (actionMasked == 1) {
            this.f1547I.clear();
            m1312K(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f1546H);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f1545G != 1) {
                int i3 = x2 - this.f1548J;
                int i4 = y2 - this.f1549K;
                if (!zMo799c || Math.abs(i3) <= this.f1552N) {
                    z2 = false;
                } else {
                    this.f1550L = x2;
                    z2 = true;
                }
                if (zMo800d && Math.abs(i4) > this.f1552N) {
                    this.f1551M = y2;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m1307F();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1546H = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1550L = x3;
            this.f1548J = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1551M = y3;
            this.f1549K = y3;
        } else if (actionMasked == 6) {
            m1303B(motionEvent);
        }
        return this.f1545G == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = AbstractC1142a.f4403a;
        Trace.beginSection("RV OnLayout");
        Trace.endSection();
        this.f1587p = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C == null) {
            m1316h(i2, i3);
            return;
        }
        if (abstractC0343C.mo777H()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f1580j.f668b.m1316h(i2, i3);
        } else {
            if (this.f1586o) {
                this.f1580j.f668b.m1316h(i2, i3);
                return;
            }
            C0352L c0352l = this.f1561W;
            if (c0352l.f702j) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c0352l.f696d = 0;
            m1310I();
            this.f1580j.f668b.m1316h(i2, i3);
            m1311J(false);
            c0352l.f698f = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (m1331x()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0351K)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0351K c0351k = (C0351K) parcelable;
        this.f1564b = c0351k;
        super.onRestoreInstanceState(c0351k.f481a);
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C == null || (parcelable2 = this.f1564b.f692c) == null) {
            return;
        }
        abstractC0343C.mo784P(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0351K c0351k = new C0351K(super.onSaveInstanceState());
        C0351K c0351k2 = this.f1564b;
        if (c0351k2 != null) {
            c0351k.f692c = c0351k2.f692c;
        } else {
            AbstractC0343C abstractC0343C = this.f1580j;
            if (abstractC0343C != null) {
                c0351k.f692c = abstractC0343C.mo785Q();
            } else {
                c0351k.f692c = null;
            }
        }
        return c0351k;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f1543E = null;
        this.f1541C = null;
        this.f1542D = null;
        this.f1540B = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2 A[PHI: r0
  0x01e2: PHI (r0v51 int) = (r0v38 int), (r0v55 int) binds: [B:88:0x01cb, B:92:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1326r;
        boolean z2;
        if (this.f1590s || this.f1591t) {
            return false;
        }
        C0374j c0374j = this.f1584m;
        if (c0374j == null) {
            zM1326r = motionEvent.getAction() == 0 ? false : m1326r(motionEvent);
        } else {
            if (c0374j.f816q != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean zM954d = c0374j.m954d(motionEvent.getX(), motionEvent.getY());
                    boolean zM953c = c0374j.m953c(motionEvent.getX(), motionEvent.getY());
                    if (zM954d || zM953c) {
                        if (zM953c) {
                            c0374j.f817r = 1;
                            c0374j.f810k = (int) motionEvent.getX();
                        } else if (zM954d) {
                            c0374j.f817r = 2;
                            c0374j.f809j = (int) motionEvent.getY();
                        }
                        c0374j.m955f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0374j.f816q == 2) {
                    c0374j.f809j = 0.0f;
                    c0374j.f810k = 0.0f;
                    c0374j.m955f(1);
                    c0374j.f817r = 0;
                } else if (motionEvent.getAction() == 2 && c0374j.f816q == 2) {
                    c0374j.m956g();
                    int i2 = c0374j.f817r;
                    int i3 = c0374j.f800a;
                    if (i2 == 1) {
                        float x = motionEvent.getX();
                        int[] iArr = c0374j.f819t;
                        iArr[0] = i3;
                        int i4 = c0374j.f811l - i3;
                        iArr[1] = i4;
                        float fMax = Math.max(i3, Math.min(i4, x));
                        c0374j.getClass();
                        if (Math.abs(0 - fMax) >= 2.0f) {
                            int iM952e = C0374j.m952e(c0374j.f810k, fMax, iArr, c0374j.f813n.computeHorizontalScrollRange(), c0374j.f813n.computeHorizontalScrollOffset(), c0374j.f811l);
                            if (iM952e != 0) {
                                c0374j.f813n.scrollBy(iM952e, 0);
                            }
                            c0374j.f810k = fMax;
                        }
                    }
                    if (c0374j.f817r == 2) {
                        float y = motionEvent.getY();
                        int[] iArr2 = c0374j.f818s;
                        iArr2[0] = i3;
                        int i5 = c0374j.f812m - i3;
                        iArr2[1] = i5;
                        float fMax2 = Math.max(i3, Math.min(i5, y));
                        c0374j.getClass();
                        if (Math.abs(0 - fMax2) >= 2.0f) {
                            int iM952e2 = C0374j.m952e(c0374j.f809j, fMax2, iArr2, c0374j.f813n.computeVerticalScrollRange(), c0374j.f813n.computeVerticalScrollOffset(), c0374j.f812m);
                            if (iM952e2 != 0) {
                                c0374j.f813n.scrollBy(0, iM952e2);
                            }
                            c0374j.f809j = fMax2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1584m = null;
            }
            zM1326r = true;
        }
        if (zM1326r) {
            m1307F();
            setScrollState(0);
            return true;
        }
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C == null) {
            return false;
        }
        boolean zMo799c = abstractC0343C.mo799c();
        boolean zMo800d = this.f1580j.mo800d();
        if (this.f1547I == null) {
            this.f1547I = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f1575g0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            this.f1546H = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1550L = x2;
            this.f1548J = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1551M = y2;
            this.f1549K = y2;
            int i6 = zMo799c;
            if (zMo800d) {
                i6 = (zMo799c ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m416h(i6, 0);
        } else {
            if (actionMasked == 1) {
                this.f1547I.addMovement(motionEventObtain);
                VelocityTracker velocityTracker = this.f1547I;
                int i7 = this.f1554P;
                velocityTracker.computeCurrentVelocity(1000, i7);
                float f2 = zMo799c ? -this.f1547I.getXVelocity(this.f1546H) : 0.0f;
                float f3 = zMo800d ? -this.f1547I.getYVelocity(this.f1546H) : 0.0f;
                if (f2 != 0.0f || f3 != 0.0f) {
                    int i8 = (int) f2;
                    int i9 = (int) f3;
                    AbstractC0343C abstractC0343C2 = this.f1580j;
                    if (abstractC0343C2 != null && !this.f1590s) {
                        boolean zMo799c2 = abstractC0343C2.mo799c();
                        boolean zMo800d2 = this.f1580j.mo800d();
                        int i10 = this.f1553O;
                        if (!zMo799c2 || Math.abs(i8) < i10) {
                            i8 = 0;
                        }
                        if (!zMo800d2 || Math.abs(i9) < i10) {
                            i9 = 0;
                        }
                        if (i8 != 0 || i9 != 0) {
                            float f4 = i8;
                            float f5 = i9;
                            if (dispatchNestedPreFling(f4, f5)) {
                                setScrollState(0);
                                m1307F();
                            } else {
                                boolean z3 = zMo799c2 || zMo800d2;
                                dispatchNestedFling(f4, f5, z3);
                                int i11 = zMo799c2;
                                if (z3) {
                                    if (zMo800d2) {
                                        i11 = (zMo799c2 ? 1 : 0) | 2;
                                    }
                                    getScrollingChildHelper().m416h(i11, 1);
                                    int i12 = -i7;
                                    int iMax = Math.max(i12, Math.min(i8, i7));
                                    int iMax2 = Math.max(i12, Math.min(i9, i7));
                                    RunnableC0354N runnableC0354N = this.f1558T;
                                    RecyclerView recyclerView = runnableC0354N.f709g;
                                    recyclerView.setScrollState(2);
                                    runnableC0354N.f704b = 0;
                                    runnableC0354N.f703a = 0;
                                    Interpolator interpolator = runnableC0354N.f706d;
                                    InterpolatorC0244d interpolatorC0244d = f1538m0;
                                    if (interpolator != interpolatorC0244d) {
                                        runnableC0354N.f706d = interpolatorC0244d;
                                        runnableC0354N.f705c = new OverScroller(recyclerView.getContext(), interpolatorC0244d);
                                    }
                                    runnableC0354N.f705c.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                    runnableC0354N.m833a();
                                }
                                m1307F();
                            }
                        }
                    }
                }
                motionEventObtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1546H);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax3 = this.f1550L - x3;
                int iMax4 = this.f1551M - y3;
                if (this.f1545G != 1) {
                    if (zMo799c) {
                        iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f1552N) : Math.min(0, iMax3 + this.f1552N);
                        if (iMax3 != 0) {
                            z2 = true;
                        }
                        if (zMo800d) {
                        }
                        if (z2) {
                        }
                    } else {
                        z2 = false;
                        if (zMo800d) {
                            iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - this.f1552N) : Math.min(0, iMax4 + this.f1552N);
                            if (iMax4 != 0) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                int i13 = iMax3;
                int i14 = iMax4;
                if (this.f1545G == 1) {
                    int[] iArr4 = this.f1577h0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    boolean zM1318j = m1318j(zMo799c ? i13 : 0, zMo800d ? i14 : 0, iArr4, this.f1573f0, 0);
                    int[] iArr5 = this.f1573f0;
                    if (zM1318j) {
                        i13 -= iArr4[0];
                        i14 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i15 = i13;
                    int i16 = i14;
                    this.f1550L = x3 - iArr5[0];
                    this.f1551M = y3 - iArr5[1];
                    if (m1308G(zMo799c ? i15 : 0, zMo800d ? i16 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0378n runnableC0378n = this.f1559U;
                    if (runnableC0378n != null && (i15 != 0 || i16 != 0)) {
                        runnableC0378n.m958a(this, i15, i16);
                    }
                }
            } else if (actionMasked == 3) {
                m1307F();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1546H = motionEvent.getPointerId(actionIndex);
                int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1550L = x4;
                this.f1548J = x4;
                int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1551M = y4;
                this.f1549K = y4;
            } else if (actionMasked == 6) {
                m1303B(motionEvent);
            }
        }
        this.f1547I.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final String m1324p() {
        return " " + super.toString() + ", adapter:" + ((Object) null) + ", layout:" + this.f1580j + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: q */
    public final View m1325q(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1326r(MotionEvent motionEvent) {
        boolean z2;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f1583l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0374j c0374j = (C0374j) arrayList.get(i2);
            int i3 = c0374j.f816q;
            if (i3 == 1) {
                boolean zM954d = c0374j.m954d(motionEvent.getX(), motionEvent.getY());
                boolean zM953c = c0374j.m953c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zM954d || zM953c)) {
                    if (zM953c) {
                        c0374j.f817r = 1;
                        c0374j.f810k = (int) motionEvent.getX();
                    } else if (zM954d) {
                        c0374j.f817r = 2;
                        c0374j.f809j = (int) motionEvent.getY();
                    }
                    c0374j.m955f(2);
                }
            } else {
                z2 = i3 == 2;
            }
            if (z2 && action != 3) {
                this.f1584m = c0374j;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        m1301u(view);
        view.clearAnimation();
        m1301u(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f1580j.getClass();
        if (!m1331x() && view2 != null) {
            m1306E(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1580j.mo792X(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1583l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0374j) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1588q != 0 || this.f1590s) {
            this.f1589r = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m1327s(AbstractC0355O abstractC0355O) {
        int i2 = -1;
        if (!abstractC0355O.m838d(524) && abstractC0355O.m840f()) {
            C0234d c0234d = this.f1566c;
            i2 = 0;
            abstractC0355O.getClass();
            ArrayList arrayList = (ArrayList) c0234d.f475c;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0365a) arrayList.get(i3)).getClass();
            }
        }
        return i2;
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C == null || this.f1590s) {
            return;
        }
        boolean zMo799c = abstractC0343C.mo799c();
        boolean zMo800d = this.f1580j.mo800d();
        if (zMo799c || zMo800d) {
            if (!zMo799c) {
                i2 = 0;
            }
            if (!zMo800d) {
                i3 = 0;
            }
            m1308G(i2, i3, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1331x()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1592u |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0357Q c0357q) {
        this.f1569d0 = c0357q;
        AbstractC0080Q.m291j(this, c0357q);
    }

    public void setAdapter(AbstractC0387w abstractC0387w) {
        setLayoutFrozen(false);
        AbstractC0390z abstractC0390z = this.f1544F;
        if (abstractC0390z != null) {
            abstractC0390z.mo947d();
        }
        AbstractC0343C abstractC0343C = this.f1580j;
        C0349I c0349i = this.f1562a;
        if (abstractC0343C != null) {
            abstractC0343C.m788T(c0349i);
            this.f1580j.m789U(c0349i);
        }
        c0349i.f685a.clear();
        c0349i.m824d();
        C0234d c0234d = this.f1566c;
        c0234d.m658v((ArrayList) c0234d.f475c);
        c0234d.m658v((ArrayList) c0234d.f476d);
        c0349i.f685a.clear();
        c0349i.m824d();
        C0348H c0348hM823c = c0349i.m823c();
        if (c0348hM823c.f684b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c0348hM823c.f683a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((C0347G) sparseArray.valueAt(i2)).f680a.clear();
                i2++;
            }
        }
        this.f1561W.f697e = true;
        m1304C(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0388x interfaceC0388x) {
        if (interfaceC0388x == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1572f) {
            this.f1543E = null;
            this.f1541C = null;
            this.f1542D = null;
            this.f1540B = null;
        }
        this.f1572f = z2;
        super.setClipToPadding(z2);
        if (this.f1587p) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0389y c0389y) {
        c0389y.getClass();
        this.f1539A = c0389y;
        this.f1543E = null;
        this.f1541C = null;
        this.f1542D = null;
        this.f1540B = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1586o = z2;
    }

    public void setItemAnimator(AbstractC0390z abstractC0390z) {
        AbstractC0390z abstractC0390z2 = this.f1544F;
        if (abstractC0390z2 != null) {
            abstractC0390z2.mo947d();
            this.f1544F.f876a = null;
        }
        this.f1544F = abstractC0390z;
        if (abstractC0390z != null) {
            abstractC0390z.f876a = this.f1567c0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        C0349I c0349i = this.f1562a;
        c0349i.f688d = i2;
        c0349i.m831k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC0343C abstractC0343C) {
        C0386v c0386v;
        if (abstractC0343C == this.f1580j) {
            return;
        }
        setScrollState(0);
        RunnableC0354N runnableC0354N = this.f1558T;
        runnableC0354N.f709g.removeCallbacks(runnableC0354N);
        runnableC0354N.f705c.abortAnimation();
        AbstractC0343C abstractC0343C2 = this.f1580j;
        if (abstractC0343C2 != null) {
            abstractC0343C2.getClass();
        }
        AbstractC0343C abstractC0343C3 = this.f1580j;
        C0349I c0349i = this.f1562a;
        if (abstractC0343C3 != null) {
            AbstractC0390z abstractC0390z = this.f1544F;
            if (abstractC0390z != null) {
                abstractC0390z.mo947d();
            }
            this.f1580j.m788T(c0349i);
            this.f1580j.m789U(c0349i);
            c0349i.f685a.clear();
            c0349i.m824d();
            if (this.f1585n) {
                AbstractC0343C abstractC0343C4 = this.f1580j;
                abstractC0343C4.f671e = false;
                abstractC0343C4.mo779K(this);
            }
            this.f1580j.m794Z(null);
            this.f1580j = null;
        } else {
            c0349i.f685a.clear();
            c0349i.m824d();
        }
        C0234d c0234d = this.f1568d;
        ((C0366b) c0234d.f475c).m943g();
        ArrayList arrayList = (ArrayList) c0234d.f476d;
        int size = arrayList.size() - 1;
        while (true) {
            c0386v = (C0386v) c0234d.f474b;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            c0386v.getClass();
            m1301u(view);
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView = c0386v.f875a;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            m1301u(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1580j = abstractC0343C;
        if (abstractC0343C != null) {
            if (abstractC0343C.f668b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0343C + " is already attached to a RecyclerView:" + abstractC0343C.f668b.m1324p());
            }
            abstractC0343C.m794Z(this);
            if (this.f1585n) {
                AbstractC0343C abstractC0343C5 = this.f1580j;
                abstractC0343C5.f671e = true;
                abstractC0343C5.mo778J(this);
            }
        }
        c0349i.m831k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0113m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f298d) {
            Field field = AbstractC0080Q.f219a;
            AbstractC0070G.m236z(scrollingChildHelper.f297c);
        }
        scrollingChildHelper.f298d = z2;
    }

    public void setOnFlingListener(AbstractC0345E abstractC0345E) {
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0346F abstractC0346F) {
        this.f1563a0 = abstractC0346F;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1557S = z2;
    }

    public void setRecycledViewPool(C0348H c0348h) {
        C0349I c0349i = this.f1562a;
        if (c0349i.f690f != null) {
            r1.f684b--;
        }
        c0349i.f690f = c0348h;
        if (c0348h != null) {
            c0349i.f691g.getAdapter();
        }
    }

    public void setRecyclerListener(InterfaceC0350J interfaceC0350J) {
    }

    public void setScrollState(int i2) {
        if (i2 == this.f1545G) {
            return;
        }
        this.f1545G = i2;
        if (i2 != 2) {
            RunnableC0354N runnableC0354N = this.f1558T;
            runnableC0354N.f709g.removeCallbacks(runnableC0354N);
            runnableC0354N.f705c.abortAnimation();
            AbstractC0343C abstractC0343C = this.f1580j;
            if (abstractC0343C != null) {
                abstractC0343C.getClass();
            }
        }
        AbstractC0343C abstractC0343C2 = this.f1580j;
        if (abstractC0343C2 != null) {
            abstractC0343C2.mo786R(i2);
        }
        AbstractC0346F abstractC0346F = this.f1563a0;
        if (abstractC0346F != null) {
            abstractC0346F.m819a(this, i2);
        }
        ArrayList arrayList = this.f1565b0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0346F) this.f1565b0.get(size)).m819a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 1) {
            this.f1552N = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f1552N = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(AbstractC0353M abstractC0353M) {
        this.f1562a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().m416h(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m417i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.f1590s) {
            m1313d("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1590s = false;
                this.f1589r = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1590s = true;
            this.f1591t = true;
            setScrollState(0);
            RunnableC0354N runnableC0354N = this.f1558T;
            runnableC0354N.f709g.removeCallbacks(runnableC0354N);
            runnableC0354N.f705c.abortAnimation();
            AbstractC0343C abstractC0343C = this.f1580j;
            if (abstractC0343C != null) {
                abstractC0343C.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final long m1328t(AbstractC0355O abstractC0355O) {
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final Rect m1329v(View view) {
        C0344D c0344d = (C0344D) view.getLayoutParams();
        boolean z2 = c0344d.f678b;
        Rect rect = c0344d.f677a;
        if (!z2) {
            return rect;
        }
        if (this.f1561W.f698f) {
            c0344d.getClass();
            throw null;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1582k;
        if (arrayList.size() <= 0) {
            c0344d.f678b = false;
            return rect;
        }
        this.f1574g.set(0, 0, 0, 0);
        ((AbstractC0341A) arrayList.get(0)).getClass();
        ((C0344D) view.getLayoutParams()).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1330w() {
        return !this.f1587p || this.f1594w || this.f1566c.m652o();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m1331x() {
        return this.f1596y > 0;
    }

    /* JADX INFO: renamed from: y */
    public final void m1332y() {
        int iM650m = this.f1568d.m650m();
        for (int i2 = 0; i2 < iM650m; i2++) {
            ((C0344D) this.f1568d.m649l(i2).getLayoutParams()).f678b = true;
        }
        ArrayList arrayList = this.f1562a.f687c;
        if (arrayList.size() <= 0) {
            return;
        }
        ((AbstractC0355O) arrayList.get(0)).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public final void m1333z() {
        this.f1596y++;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException {
        int i3;
        TypedArray typedArray;
        TypedArray typedArray2;
        char c;
        char c2;
        boolean z2;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i2);
        new C1121e(16, this);
        this.f1562a = new C0349I(this);
        this.f1570e = new C0002c();
        this.f1574g = new Rect();
        this.f1576h = new Rect();
        this.f1578i = new RectF();
        this.f1582k = new ArrayList();
        this.f1583l = new ArrayList();
        this.f1588q = 0;
        this.f1594w = false;
        this.f1595x = false;
        this.f1596y = 0;
        this.f1597z = 0;
        this.f1539A = new C0389y();
        C0371g c0371g = new C0371g();
        c0371g.f876a = null;
        c0371g.f877b = new ArrayList();
        c0371g.f878c = 120L;
        c0371g.f879d = 120L;
        c0371g.f880e = 250L;
        c0371g.f881f = 250L;
        c0371g.f784g = true;
        c0371g.f785h = new ArrayList();
        c0371g.f786i = new ArrayList();
        c0371g.f787j = new ArrayList();
        c0371g.f788k = new ArrayList();
        c0371g.f789l = new ArrayList();
        c0371g.f790m = new ArrayList();
        c0371g.f791n = new ArrayList();
        c0371g.f792o = new ArrayList();
        c0371g.f793p = new ArrayList();
        c0371g.f794q = new ArrayList();
        c0371g.f795r = new ArrayList();
        this.f1544F = c0371g;
        this.f1545G = 0;
        this.f1546H = -1;
        this.f1555Q = Float.MIN_VALUE;
        this.f1556R = Float.MIN_VALUE;
        this.f1557S = true;
        this.f1558T = new RunnableC0354N(this);
        this.f1560V = new C0376l();
        C0352L c0352l = new C0352L();
        c0352l.f693a = -1;
        c0352l.f694b = 0;
        c0352l.f695c = 0;
        c0352l.f696d = 0;
        c0352l.f697e = false;
        c0352l.f698f = false;
        c0352l.f699g = false;
        c0352l.f700h = false;
        c0352l.f701i = false;
        c0352l.f702j = false;
        this.f1561W = c0352l;
        C0386v c0386v = new C0386v(this);
        this.f1567c0 = c0386v;
        this.f1573f0 = new int[2];
        this.f1575g0 = new int[2];
        this.f1577h0 = new int[2];
        this.f1579i0 = new ArrayList();
        this.f1581j0 = new RunnableC0019E(4, this);
        new C1121e(13, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1552N = viewConfiguration.getScaledTouchSlop();
        this.f1555Q = AbstractC0081S.m293a(viewConfiguration);
        this.f1556R = AbstractC0081S.m294b(viewConfiguration);
        this.f1553O = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1554P = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1544F.f876a = c0386v;
        this.f1566c = new C0234d(new C1121e(14, this));
        this.f1568d = new C0234d(new C0386v(this));
        Field field = AbstractC0080Q.f219a;
        if (AbstractC0072I.m243c(this) == 0) {
            AbstractC0072I.m253m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1593v = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0357Q(this));
        int[] iArr = AbstractC0337a.f656a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            i3 = 8;
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
            typedArray = typedArrayObtainStyledAttributes;
        } else {
            i3 = 8;
            typedArray = typedArrayObtainStyledAttributes;
        }
        String string = typedArray.getString(i3);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1572f = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m1324p());
            }
            Resources resources = getContext().getResources();
            typedArray2 = typedArray;
            c = 3;
            c2 = 2;
            new C0374j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C1031R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C1031R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C1031R.dimen.fastscroll_margin));
        } else {
            typedArray2 = typedArray;
            c = 3;
            c2 = 2;
        }
        typedArray2.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (strTrim.isEmpty()) {
                z2 = true;
            } else {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0343C.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f1537l0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        z2 = true;
                        try {
                            objArr2[1] = attributeSet;
                            objArr2[c2] = Integer.valueOf(i2);
                            objArr2[c] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            NoSuchMethodException noSuchMethodException = e;
                            try {
                                objArr = null;
                                constructor = clsAsSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e3);
                            }
                        }
                    } catch (NoSuchMethodException e4) {
                        e = e4;
                        z2 = true;
                    }
                    constructor.setAccessible(z2);
                    setLayoutManager((AbstractC0343C) constructor.newInstance(objArr));
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e9);
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        int[] iArr2 = f1536k0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        if (i4 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
        }
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, z2);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0343C abstractC0343C = this.f1580j;
        if (abstractC0343C != null) {
            return abstractC0343C.mo811p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1324p());
    }
}
