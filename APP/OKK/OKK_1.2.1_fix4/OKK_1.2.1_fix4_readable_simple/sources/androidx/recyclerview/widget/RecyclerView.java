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
import p001A0.AbstractC0016B;
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
    public static final int[] f1536k0 = null;

    /* JADX INFO: renamed from: l0 */
    public static final Class[] f1537l0 = null;

    /* JADX INFO: renamed from: m0 */
    public static final InterpolatorC0244d f1538m0 = null;

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
        f1536k0 = new int[]{R.attr.nestedScrollingEnabled};
        Class r02 = Integer.TYPE;
        f1537l0 = new Class[]{Context.class, AttributeSet.class, r02, r02};
        f1538m0 = new InterpolatorC0244d(1);
    }

    public RecyclerView(Context r2, AttributeSet r3) {
        this(r2, r3, C1031R.attr.recyclerViewStyle);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1297a(RecyclerView r02, View r1, int r2, ViewGroup.LayoutParams r3) {
        r02.attachViewToParent(r1, r2, r3);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1298b(RecyclerView r02, int r1) {
        r02.detachViewFromParent(r1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m1299c(RecyclerView r02) {
        return r02.awakenScrollBars();
    }

    /* JADX INFO: renamed from: e */
    public static void m1300e(AbstractC0355O r3) {
        WeakReference r02 = r3.f710a;
        if (r02 == null) goto L23;
        View r03 = (View) r02.get();
    L6:
        if (r03 == null) goto L14;
        r3.getClass();
        if (r03 == null) goto L9;
        Object r04 = r03.getParent();
        if ((r04 instanceof View) == true) goto L12;
        r03 = null;
        goto L6
    L12:
        r03 = (View) r04;
        goto L6
    L9:
        return;
    L14:
        r3.f710a = null;
        return;
    }

    private C0113m getScrollingChildHelper() {
        if (this.f1571e0 != null) goto L6;
        this.f1571e0 = new C0113m(this);
    L6:
        return this.f1571e0;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC0355O m1301u(View r1) {
        if (r1 != null) goto L5;
        return null;
    L5:
        ((C0344D) r1.getLayoutParams()).getClass();
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final void m1302A(boolean r4) {
        int r02 = this.f1596y - 1;
        this.f1596y = r02;
        if (r02 >= 1) goto L18;
        this.f1596y = 0;
        if (r4 == false) goto L19;
        int r42 = this.f1592u;
        this.f1592u = 0;
        if (r42 == 0) goto L13;
        AccessibilityManager r03 = this.f1593v;
        if (r03 == null) goto L13;
        if (r03.isEnabled() == false) goto L13;
        AccessibilityEvent r04 = AccessibilityEvent.obtain();
        r04.setEventType(2048);
        r04.setContentChangeTypes(r42);
        sendAccessibilityEventUnchecked(r04);
    L13:
        ArrayList r43 = this.f1579i0;
        int r05 = r43.size() - 1;
        if (r05 >= 0) goto L16;
        r43.clear();
        return;
    L16:
        ((AbstractC0355O) r43.get(r05)).getClass();
        throw null;
    L19:
        return;
    }

    /* JADX INFO: renamed from: B */
    public final void m1303B(MotionEvent r4) {
        int r02 = r4.getActionIndex();
        if (r4.getPointerId(r02) != this.f1546H) goto L9;
        if (r02 != 0) goto L6;
        int r03 = 1;
    L7:
        this.f1546H = r4.getPointerId(r03);
        int r1 = (int) (r4.getX(r03) + 0.5f);
        this.f1550L = r1;
        this.f1548J = r1;
        int r42 = (int) (r4.getY(r03) + 0.5f);
        this.f1551M = r42;
        this.f1549K = r42;
        return;
    L6:
        r03 = 0;
        goto L7
    }

    /* JADX INFO: renamed from: C */
    public final void m1304C(boolean r5) {
        this.f1595x = r5 | this.f1595x;
        this.f1594w = true;
        int r52 = this.f1568d.m650m();
        int r02 = 0;
        int r1 = 0;
    L3:
        if (r1 >= r52) goto L5;
        m1301u(this.f1568d.m649l(r1));
        r1 = r1 + 1;
        goto L3
    L5:
        m1332y();
        C0349I r53 = this.f1562a;
        ArrayList r12 = r53.f687c;
        int r2 = r12.size();
    L6:
        if (r02 >= r2) goto L8;
        AbstractC0355O r3 = (AbstractC0355O) r12.get(r02);
        r02 = r02 + 1;
        goto L6
    L8:
        r53.f691g.getClass();
        r53.m824d();
    }

    /* JADX INFO: renamed from: D */
    public final void m1305D(AbstractC0355O r4, C1121e r5) {
        r4.f711b &= -8193;
        boolean r52 = this.f1561W.f699g;
        C0002c r02 = this.f1570e;
        if (r52 == true) goto L5;
    L11:
        C0966k r53 = (C0966k) r02.f7b;
        C0364Y r03 = (C0364Y) r53.getOrDefault(r4, null);
        if (r03 != null) goto L14;
        r03 = C0364Y.m936a();
        r53.put(r4, r03);
    L14:
        r03.getClass();
        r03.f773a |= 4;
        return;
    L5:
        if (r4.m846l() == false) goto L11;
        if (r4.m843i() == true) goto L11;
        if (r4.m849o() == true) goto L11;
        ((C0960e) r02.f8c).m2310e(m1328t(r4), r4);
        goto L11
    }

    /* JADX INFO: renamed from: E */
    public final void m1306E(View r12, View r13) {
        if (r13 == null) goto L4;
        View r02 = r13;
    L5:
        int r1 = r02.getWidth();
        int r2 = r02.getHeight();
        Rect r3 = this.f1574g;
        r3.set(0, 0, r1, r2);
        ViewGroup.LayoutParams r03 = r02.getLayoutParams();
        if ((r03 instanceof C0344D) == false) goto L10;
        C0344D r04 = (C0344D) r03;
        if (r04.f678b == true) goto L10;
        int r14 = r3.left;
        Rect r05 = r04.f677a;
        r3.left = r14 - r05.left;
        r3.right += r05.right;
        r3.top -= r05.top;
        r3.bottom += r05.bottom;
    L10:
        if (r13 == null) goto L12;
        offsetDescendantRectToMyCoords(r13, r3);
        offsetRectIntoDescendantCoords(r12, r3);
    L12:
        AbstractC0343C r5 = this.f1580j;
        boolean r9 = !this.f1587p;
        if (r13 != null) goto L15;
        boolean r10 = true;
    L16:
        r5.mo792X(this, r12, this.f1574g, r9, r10);
        return;
    L15:
        r10 = false;
        goto L16
    L4:
        r02 = r12;
        goto L5
    }

    /* JADX INFO: renamed from: F */
    public final void m1307F() {
        VelocityTracker r02 = this.f1547I;
        if (r02 == null) goto L5;
        r02.clear();
    L5:
        boolean r03 = false;
        m1312K(0);
        EdgeEffect r1 = this.f1540B;
        if (r1 == null) goto L8;
        r1.onRelease();
        r03 = this.f1540B.isFinished();
    L8:
        EdgeEffect r12 = this.f1541C;
        if (r12 == null) goto L11;
        r12.onRelease();
        r03 = r03 | this.f1541C.isFinished();
    L11:
        EdgeEffect r13 = this.f1542D;
        if (r13 == null) goto L14;
        r13.onRelease();
        r03 = r03 | this.f1542D.isFinished();
    L14:
        EdgeEffect r14 = this.f1543E;
        if (r14 == null) goto L17;
        r14.onRelease();
        r03 = r03 | this.f1543E.isFinished();
    L17:
        if (r03 == false) goto L20;
        Field r04 = AbstractC0080Q.f219a;
        postInvalidateOnAnimation();
        return;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m1308G(int r12, int r13, MotionEvent r14) {
        m1315g();
        if (this.f1582k.isEmpty() == true) goto L5;
        invalidate();
    L5:
        int[] r02 = this.f1577h0;
        boolean r9 = false;
        r02[0] = 0;
        boolean r10 = true;
        r02[1] = 0;
        m1319k(0, 0, 0, 0, this.f1573f0, 0, r02);
        int r1 = r02[0];
        int r2 = 0 - r1;
        int r03 = r02[1];
        int r3 = 0 - r03;
        if (r1 != 0) goto L10;
        if (r03 != 0) goto L10;
        boolean r04 = false;
    L11:
        int r15 = this.f1550L;
        int[] r4 = this.f1573f0;
        int r5 = r4[0];
        this.f1550L = r15 - r5;
        int r16 = this.f1551M;
        int r42 = r4[1];
        this.f1551M = r16 - r42;
        int[] r17 = this.f1575g0;
        r17[0] = r17[0] + r5;
        r17[1] = r17[1] + r42;
        if (getOverScrollMode() == 2) goto L39;
        if (r14 != null) goto L15;
    L37:
        m1314f(r12, r13);
        goto L39
    L15:
        if ((r14.getSource() & 8194) == 8194) goto L37;
        float r18 = r14.getX();
        float r22 = r2;
        float r142 = r14.getY();
        float r32 = r3;
        if (r22 >= 0.0f) goto L22;
        m1321m();
        AbstractC0215d.m598a(this.f1540B, (-r22) / getWidth(), 1.0f - (r142 / getHeight()));
    L20:
        r9 = true;
    L25:
        if (r32 >= 0.0f) goto L28;
        m1323o();
        AbstractC0215d.m598a(this.f1541C, (-r32) / getHeight(), r18 / getWidth());
    L31:
        if (r10 == false) goto L33;
    L36:
        Field r143 = AbstractC0080Q.f219a;
        postInvalidateOnAnimation();
        goto L37
    L33:
        if (r22 != 0.0f) goto L36;
        if (r32 == 0.0f) goto L37;
    L28:
        if (r32 <= 0.0f) goto L30;
        m1320l();
        AbstractC0215d.m598a(this.f1543E, r32 / getHeight(), 1.0f - (r18 / getWidth()));
        goto L31
    L30:
        r10 = r9;
        goto L31
    L22:
        if (r22 <= 0.0f) goto L25;
        m1322n();
        AbstractC0215d.m598a(this.f1542D, r22 / getWidth(), r142 / getHeight());
    L39:
        if (awakenScrollBars() == true) goto L41;
        invalidate();
    L41:
        return r04;
    L10:
        r04 = true;
        goto L11
    }

    /* JADX INFO: renamed from: H */
    public final void m1309H(int r3, int r4, boolean r5) {
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L6;
        return;
    L6:
        if (this.f1590s == false) goto L8;
        return;
    L8:
        int r1 = 0;
        if (r02.mo799c() == true) goto L12;
        r3 = 0;
    L12:
        if (this.f1580j.mo800d() == true) goto L14;
        r4 = 0;
    L14:
        if (r3 != 0) goto L16;
        if (r4 != 0) goto L16;
        return;
    L16:
        if (r5 == true) goto L18;
    L23:
        this.f1558T.m834b(r3, r4, Integer.MIN_VALUE, null);
        return;
    L18:
        if (r3 == 0) goto L20;
        r1 = 1;
    L20:
        if (r4 == 0) goto L22;
        r1 = r1 | 2;
    L22:
        getScrollingChildHelper().m416h(r1, 1);
        goto L23
    }

    /* JADX INFO: renamed from: I */
    public final void m1310I() {
        int r02 = this.f1588q + 1;
        this.f1588q = r02;
        if (r02 == 1) goto L5;
        return;
    L5:
        if (this.f1590s == true) goto L9;
        this.f1589r = false;
        return;
    }

    /* JADX INFO: renamed from: J */
    public final void m1311J(boolean r4) {
        if (this.f1588q >= 1) goto L6;
        this.f1588q = 1;
    L6:
        if (r4 == true) goto L11;
        if (this.f1590s == true) goto L11;
        this.f1589r = false;
    L11:
        if (this.f1588q != 1) goto L19;
        if (r4 == false) goto L17;
        if (this.f1589r == false) goto L17;
        boolean r42 = this.f1590s;
    L17:
        if (this.f1590s == true) goto L19;
        this.f1589r = false;
    L19:
        this.f1588q--;
    }

    /* JADX INFO: renamed from: K */
    public final void m1312K(int r2) {
        getScrollingChildHelper().m417i(r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList r2, int r3, int r4) {
        AbstractC0343C r02 = this.f1580j;
        if (r02 == null) goto L5;
        r02.getClass();
    L5:
        super.addFocusables(r2, r3, r4);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C0344D) == true) goto L5;
    L7:
        return false;
    L5:
        if (this.f1580j.mo801e((C0344D) r2) == false) goto L7;
        return true;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L6;
        return 0;
    L6:
        if (r02.mo799c() == true) goto L8;
        return 0;
    L8:
        return this.f1580j.mo802g(this.f1561W);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L6;
        return 0;
    L6:
        if (r02.mo799c() == true) goto L8;
        return 0;
    L8:
        return this.f1580j.mo803h(this.f1561W);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L6;
        return 0;
    L6:
        if (r02.mo799c() == true) goto L8;
        return 0;
    L8:
        return this.f1580j.mo804i(this.f1561W);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L6;
        return 0;
    L6:
        if (r02.mo800d() == true) goto L8;
        return 0;
    L8:
        return this.f1580j.mo805j(this.f1561W);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L6;
        return 0;
    L6:
        if (r02.mo800d() == true) goto L8;
        return 0;
    L8:
        return this.f1580j.mo806k(this.f1561W);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L6;
        return 0;
    L6:
        if (r02.mo800d() == true) goto L8;
        return 0;
    L8:
        return this.f1580j.mo807l(this.f1561W);
    }

    /* JADX INFO: renamed from: d */
    public final void m1313d(String r3) {
        if (m1331x() == false) goto L10;
        if (r3 != null) goto L8;
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m1324p());
    L8:
        throw new IllegalStateException(r3);
    L10:
        if (this.f1597z <= 0) goto L13;
        new IllegalStateException("" + m1324p());
        return;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
        return getScrollingChildHelper().m409a(r2, r3, r4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
        return getScrollingChildHelper().m410b(r2, r3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return getScrollingChildHelper().m411c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return getScrollingChildHelper().m413e(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        onPopulateAccessibilityEvent(r1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray r1) {
        dispatchThawSelfOnly(r1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray r1) {
        dispatchFreezeSelfOnly(r1);
    }

    @Override // android.view.View
    public final void draw(Canvas r9) {
        boolean r02 = true;
        super.draw(r9);
        ArrayList r1 = this.f1582k;
        int r2 = r1.size();
        boolean r3 = false;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L5;
        ((AbstractC0341A) r1.get(r4)).mo759b(r9, this);
        r4 = r4 + 1;
        goto L3
    L5:
        EdgeEffect r22 = this.f1540B;
        if (r22 != null) goto L8;
    L20:
        boolean r42 = false;
    L21:
        EdgeEffect r23 = this.f1541C;
        if (r23 != null) goto L24;
    L35:
        EdgeEffect r24 = this.f1542D;
        if (r24 != null) goto L38;
    L50:
        EdgeEffect r25 = this.f1543E;
        if (r25 != null) goto L53;
    L64:
        if (r42 == false) goto L66;
    L72:
        r02 = r42;
    L73:
        if (r02 == false) goto L77;
        Field r92 = AbstractC0080Q.f219a;
        postInvalidateOnAnimation();
        return;
    L77:
        return;
    L66:
        if (this.f1544F == null) goto L72;
        if (r1.size() <= 0) goto L72;
        if (this.f1544F.mo948e() == false) goto L72;
    L53:
        if (r25.isFinished() == true) goto L64;
        int r26 = r9.save();
        r9.rotate(180.0f);
        if (this.f1572f == false) goto L57;
        float r5 = getPaddingRight() + (-getWidth());
        int r6 = -getHeight();
        r9.translate(r5, getPaddingBottom() + r6);
    L58:
        EdgeEffect r52 = this.f1543E;
        if (r52 != null) goto L61;
    L63:
        r42 = r42 | r3;
        r9.restoreToCount(r26);
        goto L64
    L61:
        if (r52.draw(r9) == false) goto L63;
        r3 = true;
        goto L63
    L57:
        r9.translate(-getWidth(), -getHeight());
        goto L58
    L38:
        if (r24.isFinished() == true) goto L50;
        int r27 = r9.save();
        int r53 = getWidth();
        if (this.f1572f == false) goto L42;
        int r62 = getPaddingTop();
    L43:
        r9.rotate(90.0f);
        r9.translate(-r62, -r53);
        EdgeEffect r54 = this.f1542D;
        if (r54 != null) goto L46;
    L48:
        boolean r55 = false;
    L49:
        r42 = r42 | r55;
        r9.restoreToCount(r27);
        goto L50
    L46:
        if (r54.draw(r9) == false) goto L48;
        r55 = true;
        goto L49
    L42:
        r62 = 0;
        goto L43
    L24:
        if (r23.isFinished() == true) goto L35;
        int r28 = r9.save();
        if (this.f1572f == false) goto L28;
        r9.translate(getPaddingLeft(), getPaddingTop());
    L28:
        EdgeEffect r56 = this.f1541C;
        if (r56 != null) goto L31;
    L33:
        boolean r57 = false;
    L34:
        r42 = r42 | r57;
        r9.restoreToCount(r28);
        goto L35
    L31:
        if (r56.draw(r9) == false) goto L33;
        r57 = true;
        goto L34
    L8:
        if (r22.isFinished() == true) goto L20;
        int r29 = r9.save();
        if (this.f1572f == false) goto L12;
        int r43 = getPaddingBottom();
    L13:
        r9.rotate(270.0f);
        r9.translate((-getHeight()) + r43, 0.0f);
        EdgeEffect r44 = this.f1540B;
        if (r44 != null) goto L16;
    L18:
        r42 = false;
    L19:
        r9.restoreToCount(r29);
        goto L21
    L16:
        if (r44.draw(r9) == false) goto L18;
        r42 = true;
        goto L19
    L12:
        r43 = 0;
        goto L13
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas r1, View r2, long r3) {
        return super.drawChild(r1, r2, r3);
    }

    /* JADX INFO: renamed from: f */
    public final void m1314f(int r3, int r4) {
        EdgeEffect r02 = this.f1540B;
        if (r02 != null) goto L5;
    L8:
        boolean r03 = false;
    L9:
        EdgeEffect r1 = this.f1542D;
        if (r1 != null) goto L12;
    L15:
        EdgeEffect r32 = this.f1541C;
        if (r32 != null) goto L18;
    L21:
        EdgeEffect r33 = this.f1543E;
        if (r33 != null) goto L24;
    L27:
        if (r03 == false) goto L30;
        Field r34 = AbstractC0080Q.f219a;
        postInvalidateOnAnimation();
        return;
    L30:
        return;
    L24:
        if (r33.isFinished() == true) goto L27;
        if (r4 >= 0) goto L27;
        this.f1543E.onRelease();
        r03 = r03 | this.f1543E.isFinished();
        goto L27
    L18:
        if (r32.isFinished() == true) goto L21;
        if (r4 <= 0) goto L21;
        this.f1541C.onRelease();
        r03 = r03 | this.f1541C.isFinished();
        goto L21
    L12:
        if (r1.isFinished() == true) goto L15;
        if (r3 >= 0) goto L15;
        this.f1542D.onRelease();
        r03 = r03 | this.f1542D.isFinished();
        goto L15
    L5:
        if (r02.isFinished() == true) goto L8;
        if (r3 <= 0) goto L8;
        this.f1540B.onRelease();
        r03 = this.f1540B.isFinished();
        goto L9
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View r17, int r18) {
        this.f1580j.getClass();
        boolean r3 = true;
        View r5 = FocusFinder.getInstance().findNextFocus(this, r17, r18);
        if (r5 != null) goto L5;
    L12:
        if (r5 == null) goto L81;
        if (r5 == this) goto L81;
        if (m1325q(r5) != null) goto L18;
        r3 = false;
    L82:
        if (r3 == false) goto L85;
        return r5;
    L85:
        return super.focusSearch(r17, r18);
    L18:
        if (r17 == null) goto L82;
        if (m1325q(r17) == null) goto L82;
        int r10 = r17.getWidth();
        int r12 = r17.getHeight();
        Rect r13 = this.f1574g;
        r13.set(0, 0, r10, r12);
        int r102 = r5.getWidth();
        int r122 = r5.getHeight();
        Rect r14 = this.f1576h;
        r14.set(0, 0, r102, r122);
        offsetDescendantRectToMyCoords(r17, r13);
        offsetDescendantRectToMyCoords(r5, r14);
        if (this.f1580j.m817y() != 1) goto L26;
        int r103 = -1;
    L27:
        int r15 = r13.left;
        int r4 = r14.left;
        if (r15 < r4) goto L32;
        if (r13.right <= r4) goto L32;
    L34:
        int r9 = r13.right;
        int r123 = r14.right;
        if (r9 > r123) goto L37;
        if (r15 >= r123) goto L37;
    L39:
        int r42 = 0;
    L40:
        int r92 = r13.top;
        int r124 = r14.top;
        if (r92 < r124) goto L45;
        if (r13.bottom <= r124) goto L45;
    L47:
        int r7 = r13.bottom;
        int r132 = r14.bottom;
        if (r7 > r132) goto L50;
        if (r92 >= r132) goto L50;
    L52:
        byte r125 = 0;
    L53:
        if (r18 == 1) goto L76;
        if (r18 == 2) goto L71;
        if (r18 == 17) goto L69;
        if (r18 != 33) goto L58;
        if (r125 >= 0) goto L81;
    L58:
        if (r18 != 66) goto L60;
        if (r42 <= 0) goto L81;
    L60:
        if (r18 != 130) goto L64;
        if (r125 <= 0) goto L81;
    L64:
        throw new IllegalArgumentException("Invalid direction: " + r18 + m1324p());
    L69:
        if (r42 >= 0) goto L81;
    L71:
        if (r125 > 0) goto L82;
        if (r125 != 0) goto L81;
        if ((r42 * r103) < 0) goto L81;
    L76:
        if (r125 < 0) goto L82;
        if (r125 != 0) goto L81;
        if ((r42 * r103) > 0) goto L81;
    L50:
        if (r92 <= r124) goto L52;
        r125 = -1;
    L45:
        if (r13.bottom >= r14.bottom) goto L47;
        r125 = 1;
    L37:
        if (r15 <= r4) goto L39;
        r42 = -1;
    L32:
        if (r13.right >= r14.right) goto L34;
        r42 = 1;
        goto L40
    L26:
        r103 = 1;
    L81:
        r3 = false;
        goto L82
    L5:
        if (r5.hasFocusable() == true) goto L12;
        if (getFocusedChild() == null) goto L9;
        m1306E(r5, null);
        return r17;
    L9:
        return super.focusSearch(r17, r18);
    }

    /* JADX INFO: renamed from: g */
    public final void m1315g() {
        C0234d r02 = this.f1566c;
        if (this.f1587p == true) goto L5;
    L14:
        int r03 = AbstractC1142a.f4403a;
        Trace.beginSection("RV FullInvalidate");
        Trace.endSection();
        return;
    L5:
        if (this.f1594w == true) goto L14;
        if (r02.m652o() == true) goto L10;
        return;
    L10:
        r02.getClass();
        if (r02.m652o() == false) goto L16;
        int r04 = AbstractC1142a.f4403a;
        Trace.beginSection("RV FullInvalidate");
        Trace.endSection();
        return;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0343C r02 = this.f1580j;
        if (r02 == null) goto L7;
        return r02.mo809n();
    L7:
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1324p());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        AbstractC0343C r02 = this.f1580j;
        if (r02 == null) goto L7;
        return r02.mo810o(getContext(), r3);
    L7:
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
        AbstractC0343C r02 = this.f1580j;
        if (r02 == null) goto L7;
        r02.getClass();
        return -1;
    L7:
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r1, int r2) {
        return super.getChildDrawingOrder(r1, r2);
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
    public final void m1316h(int r3, int r4) {
        int r02 = getPaddingLeft();
        int r1 = getPaddingRight() + r02;
        Field r03 = AbstractC0080Q.f219a;
        int r32 = AbstractC0343C.m768f(r3, r1, getMinimumWidth());
        int r04 = getPaddingTop();
        setMeasuredDimension(r32, AbstractC0343C.m768f(r4, getPaddingBottom() + r04, getMinimumHeight()));
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
    public final boolean m1318j(int r7, int r8, int[] r9, int[] r10, int r11) {
        return getScrollingChildHelper().m411c(r7, r8, r9, r10, r11);
    }

    /* JADX INFO: renamed from: k */
    public final void m1319k(int r9, int r10, int r11, int r12, int[] r13, int r14, int[] r15) {
        getScrollingChildHelper().m413e(r9, r10, r11, r12, r13, r14, r15);
    }

    /* JADX INFO: renamed from: l */
    public final void m1320l() {
        if (this.f1543E == null) goto L5;
        return;
    L5:
        this.f1539A.getClass();
        EdgeEffect r02 = new EdgeEffect(getContext());
        this.f1543E = r02;
        if (this.f1572f == false) goto L8;
        r02.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        return;
    L8:
        r02.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX INFO: renamed from: m */
    public final void m1321m() {
        if (this.f1540B == null) goto L5;
        return;
    L5:
        this.f1539A.getClass();
        EdgeEffect r02 = new EdgeEffect(getContext());
        this.f1540B = r02;
        if (this.f1572f == false) goto L8;
        r02.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        return;
    L8:
        r02.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    /* JADX INFO: renamed from: n */
    public final void m1322n() {
        if (this.f1542D == null) goto L5;
        return;
    L5:
        this.f1539A.getClass();
        EdgeEffect r02 = new EdgeEffect(getContext());
        this.f1542D = r02;
        if (this.f1572f == false) goto L8;
        r02.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        return;
    L8:
        r02.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    /* JADX INFO: renamed from: o */
    public final void m1323o() {
        if (this.f1541C == null) goto L5;
        return;
    L5:
        this.f1539A.getClass();
        EdgeEffect r02 = new EdgeEffect(getContext());
        this.f1541C = r02;
        if (this.f1572f == false) goto L8;
        r02.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        return;
    L8:
        r02.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean r02 = false;
        this.f1596y = 0;
        this.f1585n = true;
        if (this.f1587p == true) goto L5;
    L7:
        this.f1587p = r02;
        AbstractC0343C r03 = this.f1580j;
        if (r03 == null) goto L10;
        r03.f671e = true;
        r03.mo778J(this);
    L10:
        ThreadLocal r04 = RunnableC0378n.f832e;
        RunnableC0378n r1 = (RunnableC0378n) r04.get();
        this.f1559U = r1;
        if (r1 != null) goto L20;
        RunnableC0378n r12 = new RunnableC0378n();
        r12.f834a = new ArrayList();
        r12.f837d = new ArrayList();
        this.f1559U = r12;
        Field r13 = AbstractC0080Q.f219a;
        Display r14 = getDisplay();
        if (isInEditMode() == true) goto L18;
        if (r14 == null) goto L18;
        float r15 = r14.getRefreshRate();
        if (r15 < 30.0f) goto L18;
    L19:
        RunnableC0378n r2 = this.f1559U;
        r2.f836c = (long) (1.0E9f / r15);
        r04.set(r2);
    L18:
        r15 = 60.0f;
    L20:
        this.f1559U.f834a.add(this);
        return;
    L5:
        if (isLayoutRequested() == true) goto L7;
        r02 = true;
        goto L7
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0390z r02 = this.f1544F;
        if (r02 == null) goto L5;
        r02.mo947d();
    L5:
        setScrollState(0);
        RunnableC0354N r1 = this.f1558T;
        r1.f709g.removeCallbacks(r1);
        r1.f705c.abortAnimation();
        AbstractC0343C r12 = this.f1580j;
        if (r12 == null) goto L8;
        r12.getClass();
    L8:
        this.f1585n = false;
        AbstractC0343C r13 = this.f1580j;
        if (r13 == null) goto L11;
        r13.f671e = false;
        r13.mo779K(this);
    L11:
        this.f1579i0.clear();
        removeCallbacks(this.f1581j0);
        this.f1570e.getClass();
    L13:
        if (C0364Y.f772b.mo198a() != null) goto L13;
        RunnableC0378n r03 = this.f1559U;
        if (r03 == null) goto L21;
        r03.f834a.remove(this);
        this.f1559U = null;
        return;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r4) {
        super.onDraw(r4);
        ArrayList r42 = this.f1582k;
        int r02 = r42.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        ((AbstractC0341A) r42.get(r1)).m758a(this);
        r1 = r1 + 1;
        goto L3
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent r6) {
        if (this.f1580j != null) goto L6;
        return false;
    L6:
        if (this.f1590s == false) goto L9;
        return false;
    L9:
        if (r6.getAction() == 8) goto L11;
    L34:
        return false;
    L11:
        if ((r6.getSource() & 2) == 0) goto L21;
        if (this.f1580j.mo800d() == false) goto L15;
        float r02 = -r6.getAxisValue(9);
    L17:
        if (this.f1580j.mo799c() == false) goto L19;
        float r3 = r6.getAxisValue(10);
    L30:
        if (r02 == 0.0f) goto L32;
    L33:
        m1308G((int) (r3 * this.f1555Q), (int) (r02 * this.f1556R), r6);
        goto L34
    L32:
        if (r3 == 0.0f) goto L34;
    L19:
        r3 = 0.0f;
        goto L30
    L15:
        r02 = 0.0f;
        goto L17
    L21:
        if ((r6.getSource() & 4194304) == 0) goto L28;
        float r03 = r6.getAxisValue(26);
        if (this.f1580j.mo800d() == false) goto L26;
        r02 = -r03;
        goto L19
    L26:
        if (this.f1580j.mo799c() == false) goto L28;
        r3 = r03;
        r02 = 0.0f;
    L28:
        r02 = 0.0f;
        r3 = 0.0f;
        goto L30
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r9) {
        if (this.f1590s == false) goto L5;
        return false;
    L5:
        this.f1584m = null;
        if (m1326r(r9) == false) goto L9;
        m1307F();
        setScrollState(0);
        return true;
    L9:
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L12;
        return false;
    L12:
        boolean r03 = r02.mo799c();
        boolean r3 = this.f1580j.mo800d();
        if (this.f1547I != null) goto L15;
        this.f1547I = VelocityTracker.obtain();
    L15:
        this.f1547I.addMovement(r9);
        int r4 = r9.getActionMasked();
        int r5 = r9.getActionIndex();
        if (r4 == 0) goto L48;
        if (r4 == 1) goto L46;
        if (r4 != 2) goto L20;
        int r42 = r9.findPointerIndex(this.f1546H);
        if (r42 >= 0) goto L32;
        return false;
    L32:
        int r52 = (int) (r9.getX(r42) + 0.5f);
        int r92 = (int) (r9.getY(r42) + 0.5f);
        if (this.f1545G == 1) goto L58;
        int r43 = r52 - this.f1548J;
        int r6 = r92 - this.f1549K;
        if (r03 == true) goto L37;
    L39:
        boolean r04 = false;
    L40:
        if (r3 == true) goto L42;
    L44:
        if (r04 == false) goto L58;
        setScrollState(1);
        goto L58
    L42:
        if (Math.abs(r6) <= this.f1552N) goto L44;
        this.f1551M = r92;
        r04 = true;
        goto L44
    L37:
        if (Math.abs(r43) <= this.f1552N) goto L39;
        this.f1550L = r52;
        r04 = true;
    L58:
        if (this.f1545G == 1) goto L60;
        return false;
    L60:
        return true;
    L20:
        if (r4 != 3) goto L22;
        m1307F();
        setScrollState(0);
        goto L58
    L22:
        if (r4 != 5) goto L24;
        this.f1546H = r9.getPointerId(r5);
        int r05 = (int) (r9.getX(r5) + 0.5f);
        this.f1550L = r05;
        this.f1548J = r05;
        int r93 = (int) (r9.getY(r5) + 0.5f);
        this.f1551M = r93;
        this.f1549K = r93;
        goto L58
    L24:
        if (r4 != 6) goto L58;
        m1303B(r9);
        goto L58
    L46:
        this.f1547I.clear();
        m1312K(0);
        goto L58
    L48:
        if (this.f1591t == false) goto L50;
        this.f1591t = false;
    L50:
        this.f1546H = r9.getPointerId(0);
        int r44 = (int) (r9.getX() + 0.5f);
        this.f1550L = r44;
        this.f1548J = r44;
        int r94 = (int) (r9.getY() + 0.5f);
        this.f1551M = r94;
        this.f1549K = r94;
        if (this.f1545G != 2) goto L53;
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
        m1312K(1);
    L53:
        int[] r95 = this.f1575g0;
        r95[1] = 0;
        r95[0] = 0;
        int r06 = r03;
        if (r3 == false) goto L56;
        r06 = (r03 ? 1 : 0) | 2;
    L56:
        getScrollingChildHelper().m416h(r06, 0);
        goto L58
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        int r12 = AbstractC1142a.f4403a;
        Trace.beginSection("RV OnLayout");
        Trace.endSection();
        this.f1587p = true;
    }

    @Override // android.view.View
    public final void onMeasure(int r4, int r5) {
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L7;
        m1316h(r4, r5);
        return;
    L7:
        if (r02.mo777H() == false) goto L11;
        View.MeasureSpec.getMode(r4);
        View.MeasureSpec.getMode(r5);
        this.f1580j.f668b.m1316h(r4, r5);
        return;
    L11:
        if (this.f1586o == false) goto L14;
        this.f1580j.f668b.m1316h(r4, r5);
        return;
    L14:
        C0352L r03 = this.f1561W;
        if (r03.f702j == false) goto L18;
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        return;
    L18:
        r03.f696d = 0;
        m1310I();
        this.f1580j.f668b.m1316h(r4, r5);
        m1311J(false);
        r03.f698f = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, Rect r3) {
        if (m1331x() == false) goto L7;
        return false;
    L7:
        return super.onRequestFocusInDescendants(r2, r3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C0351K) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C0351K r22 = (C0351K) r2;
        this.f1564b = r22;
        super.onRestoreInstanceState(r22.f481a);
        AbstractC0343C r23 = this.f1580j;
        if (r23 == null) goto L12;
        Parcelable r02 = this.f1564b.f692c;
        if (r02 == null) goto L13;
        r23.mo784P(r02);
        return;
    L13:
        return;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0351K r02 = new C0351K(super.onSaveInstanceState());
        C0351K r1 = this.f1564b;
        if (r1 == null) goto L5;
        r02.f692c = r1.f692c;
    L9:
        return r02;
    L5:
        AbstractC0343C r12 = this.f1580j;
        if (r12 == null) goto L8;
        r02.f692c = r12.mo785Q();
        goto L9
    L8:
        r02.f692c = null;
        goto L9
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        if (r1 != r3) goto L5;
        if (r2 != r4) goto L5;
        return;
    L5:
        this.f1543E = null;
        this.f1541C = null;
        this.f1542D = null;
        this.f1540B = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r24) {
        int r8 = 0;
        if (this.f1590s == false) goto L5;
    L182:
        return false;
    L5:
        if (this.f1591t == true) goto L182;
        C0374j r02 = this.f1584m;
        if (r02 != null) goto L14;
        if (r24.getAction() != 0) goto L12;
        boolean r03 = false;
    L58:
        if (r03 == false) goto L61;
        m1307F();
        setScrollState(0);
        return true;
    L61:
        AbstractC0343C r04 = this.f1580j;
        if (r04 != null) goto L64;
        return false;
    L64:
        boolean r10 = r04.mo799c();
        boolean r11 = this.f1580j.mo800d();
        if (this.f1547I != null) goto L67;
        this.f1547I = VelocityTracker.obtain();
    L67:
        int r05 = r24.getActionMasked();
        int r4 = r24.getActionIndex();
        int[] r12 = this.f1575g0;
        if (r05 != 0) goto L70;
        r12[1] = 0;
        r12[0] = 0;
    L70:
        MotionEvent r13 = MotionEvent.obtain(r24);
        r13.offsetLocation(r12[0], r12[1]);
        if (r05 == 0) goto L175;
        if (r05 == 1) goto L129;
        if (r05 == 2) goto L83;
        if (r05 != 3) goto L76;
        m1307F();
        setScrollState(0);
    L179:
        this.f1547I.addMovement(r13);
    L180:
        r13.recycle();
        return true;
    L76:
        if (r05 != 5) goto L78;
        this.f1546H = r24.getPointerId(r4);
        int r06 = (int) (r24.getX(r4) + 0.5f);
        this.f1550L = r06;
        this.f1548J = r06;
        int r07 = (int) (r24.getY(r4) + 0.5f);
        this.f1551M = r07;
        this.f1549K = r07;
        goto L179
    L78:
        if (r05 != 6) goto L179;
        m1303B(r24);
        goto L179
    L83:
        int r08 = r24.findPointerIndex(this.f1546H);
        if (r08 >= 0) goto L86;
        return false;
    L86:
        int r14 = (int) (r24.getX(r08) + 0.5f);
        int r15 = (int) (r24.getY(r08) + 0.5f);
        int r09 = this.f1550L - r14;
        int r1 = this.f1551M - r15;
        if (this.f1545G == 1) goto L103;
        if (r10 == false) goto L94;
        if (r09 <= 0) goto L91;
        r09 = Math.max(0, r09 - this.f1552N);
    L92:
        if (r09 == 0) goto L94;
        boolean r2 = true;
    L95:
        if (r11 == false) goto L101;
        if (r1 <= 0) goto L98;
        r1 = Math.max(0, r1 - this.f1552N);
    L99:
        if (r1 == 0) goto L101;
        r2 = true;
        goto L101
    L98:
        r1 = Math.min(0, r1 + this.f1552N);
    L101:
        if (r2 == false) goto L103;
        setScrollState(1);
        goto L103
    L91:
        r09 = Math.min(0, r09 + this.f1552N);
    L94:
        r2 = false;
    L103:
        int r16 = r09;
        int r17 = r1;
        if (this.f1545G != 1) goto L179;
        int[] r5 = this.f1577h0;
        r5[0] = 0;
        r5[1] = 0;
        if (r10 == false) goto L108;
        int r18 = r16;
    L109:
        if (r11 == false) goto L111;
        int r22 = r17;
    L112:
        boolean r010 = m1318j(r18, r22, r5, this.f1573f0, 0);
        int[] r19 = this.f1573f0;
        if (r010 == false) goto L115;
        r16 = r16 - r5[0];
        r17 = r17 - r5[1];
        r12[0] = r12[0] + r19[0];
        r12[1] = r12[1] + r19[1];
        getParent().requestDisallowInterceptTouchEvent(true);
    L115:
        int r011 = r16;
        int r23 = r17;
        this.f1550L = r14 - r19[0];
        this.f1551M = r15 - r19[1];
        if (r10 == false) goto L118;
        int r110 = r011;
    L119:
        if (r11 == false) goto L122;
        r8 = r23;
    L122:
        if (m1308G(r110, r8, r24) == false) goto L124;
        getParent().requestDisallowInterceptTouchEvent(true);
    L124:
        RunnableC0378n r111 = this.f1559U;
        if (r111 == null) goto L179;
        if (r011 != 0) goto L128;
        if (r23 == 0) goto L179;
    L128:
        r111.m958a(this, r011, r23);
        goto L179
    L118:
        r110 = 0;
        goto L119
    L111:
        r22 = 0;
        goto L112
    L108:
        r18 = 0;
        goto L109
    L129:
        this.f1547I.addMovement(r13);
        VelocityTracker r012 = this.f1547I;
        int r25 = this.f1554P;
        r012.computeCurrentVelocity(1000, r25);
        if (r10 == false) goto L132;
        float r013 = -this.f1547I.getXVelocity(this.f1546H);
    L133:
        if (r11 == false) goto L135;
        float r42 = -this.f1547I.getYVelocity(this.f1546H);
    L137:
        if (r013 == 0.0f) goto L139;
    L140:
        int r014 = (int) r013;
        int r3 = (int) r42;
        AbstractC0343C r43 = this.f1580j;
        if (r43 != null) goto L144;
    L173:
        setScrollState(0);
    L174:
        m1307F();
        goto L180
    L144:
        if (this.f1590s == true) goto L173;
        boolean r44 = r43.mo799c();
        boolean r52 = this.f1580j.mo800d();
        int r7 = this.f1553O;
        if (r44 == true) goto L149;
    L150:
        r014 = 0;
    L151:
        if (r52 == true) goto L153;
    L154:
        r3 = 0;
    L155:
        if (r014 != 0) goto L158;
        if (r3 == 0) goto L173;
    L158:
        float r72 = r014;
        float r102 = r3;
        if (dispatchNestedPreFling(r72, r102) == true) goto L173;
        if (r44 == true) goto L164;
        if (r52 == true) goto L164;
        boolean r112 = false;
    L165:
        dispatchNestedFling(r72, r102, r112);
        int r45 = r44;
        if (r112 == false) goto L173;
        if (r52 == false) goto L169;
        r45 = (r44 ? 1 : 0) | 2;
    L169:
        getScrollingChildHelper().m416h(r45, 1);
        int r46 = -r25;
        int r172 = Math.max(r46, Math.min(r014, r25));
        int r182 = Math.max(r46, Math.min(r3, r25));
        RunnableC0354N r015 = this.f1558T;
        RecyclerView r26 = r015.f709g;
        r26.setScrollState(2);
        r015.f704b = 0;
        r015.f703a = 0;
        Interpolator r113 = r015.f706d;
        InterpolatorC0244d r32 = f1538m0;
        if (r113 == r32) goto L172;
        r015.f706d = r32;
        r015.f705c = new OverScroller(r26.getContext(), r32);
    L172:
        r015.f705c.fling(0, 0, r172, r182, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        r015.m833a();
    L164:
        r112 = true;
        goto L165
    L153:
        if (Math.abs(r3) >= r7) goto L155;
    L149:
        if (Math.abs(r014) >= r7) goto L151;
    L139:
        if (r42 == 0.0f) goto L173;
    L135:
        r42 = 0.0f;
        goto L137
    L132:
        r013 = 0.0f;
        goto L133
    L175:
        this.f1546H = r24.getPointerId(0);
        int r016 = (int) (r24.getX() + 0.5f);
        this.f1550L = r016;
        this.f1548J = r016;
        int r017 = (int) (r24.getY() + 0.5f);
        this.f1551M = r017;
        this.f1549K = r017;
        int r103 = r10;
        if (r11 == false) goto L178;
        r103 = (r10 ? 1 : 0) | 2;
    L178:
        getScrollingChildHelper().m416h(r103, 0);
        goto L179
    L12:
        r03 = m1326r(r24);
        goto L58
    L14:
        if (r02.f816q != 0) goto L17;
    L53:
        int r018 = r24.getAction();
        if (r018 == 3) goto L56;
        if (r018 == 1) goto L56;
    L57:
        r03 = true;
    L56:
        this.f1584m = null;
        goto L57
    L17:
        if (r24.getAction() != 0) goto L27;
        boolean r47 = r02.m954d(r24.getX(), r24.getY());
        boolean r53 = r02.m953c(r24.getX(), r24.getY());
        if (r47 == true) goto L21;
        if (r53 == false) goto L53;
    L21:
        if (r53 == false) goto L23;
        r02.f817r = 1;
        r02.f810k = (int) r24.getX();
    L25:
        r02.m955f(2);
        goto L53
    L23:
        if (r47 == false) goto L25;
        r02.f817r = 2;
        r02.f809j = (int) r24.getY();
        goto L25
    L27:
        if (r24.getAction() != 1) goto L32;
        if (r02.f816q != 2) goto L32;
        r02.f809j = 0.0f;
        r02.f810k = 0.0f;
        r02.m955f(1);
        r02.f817r = 0;
    L32:
        if (r24.getAction() != 2) goto L53;
        if (r02.f816q != 2) goto L53;
        r02.m956g();
        int r48 = r02.f817r;
        int r104 = r02.f800a;
        if (r48 != 1) goto L45;
        float r49 = r24.getX();
        int[] r132 = r02.f819t;
        r132[0] = r104;
        int r114 = r02.f811l - r104;
        r132[1] = r114;
        float r410 = Math.max(r104, Math.min(r114, r49));
        r02.getClass();
        if (Math.abs(0 - r410) < 2.0f) goto L45;
        int r115 = C0374j.m952e(r02.f810k, r410, r132, r02.f813n.computeHorizontalScrollRange(), r02.f813n.computeHorizontalScrollOffset(), r02.f811l);
        if (r115 == 0) goto L43;
        r02.f813n.scrollBy(r115, 0);
    L43:
        r02.f810k = r410;
    L45:
        if (r02.f817r != 2) goto L53;
        float r411 = r24.getY();
        int[] r133 = r02.f818s;
        r133[0] = r104;
        int r116 = r02.f812m - r104;
        r133[1] = r116;
        float r412 = Math.max(r104, Math.min(r116, r411));
        r02.getClass();
        if (Math.abs(0 - r412) < 2.0f) goto L53;
        int r54 = C0374j.m952e(r02.f809j, r412, r133, r02.f813n.computeVerticalScrollRange(), r02.f813n.computeVerticalScrollOffset(), r02.f812m);
        if (r54 == 0) goto L52;
        r02.f813n.scrollBy(0, r54);
    L52:
        r02.f809j = r412;
        goto L53
    }

    /* JADX INFO: renamed from: p */
    public final String m1324p() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f1580j + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: q */
    public final View m1325q(View r3) {
        ViewParent r02 = r3.getParent();
    L3:
        if (r02 == null) goto L8;
        if (r02 == this) goto L8;
        if ((r02 instanceof View) == false) goto L8;
        r3 = r02;
        r02 = r3.getParent();
    L8:
        if (r02 == this) goto L15;
        return null;
    L15:
        return r3;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1326r(MotionEvent r12) {
        int r02 = r12.getAction();
        ArrayList r1 = this.f1583l;
        int r2 = r1.size();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L24;
        C0374j r5 = (C0374j) r1.get(r4);
        int r6 = r5.f816q;
        if (r6 != 1) goto L15;
        boolean r62 = r5.m954d(r12.getX(), r12.getY());
        boolean r9 = r5.m953c(r12.getX(), r12.getY());
        if (r12.getAction() != 0) goto L17;
        if (r62 == true) goto L10;
        if (r9 == false) goto L17;
    L10:
        if (r9 == false) goto L12;
        r5.f817r = 1;
        r5.f810k = (int) r12.getX();
    L14:
        r5.m955f(2);
    L16:
        boolean r63 = true;
    L18:
        if (r63 == false) goto L23;
        if (r02 == 3) goto L23;
        this.f1584m = r5;
        return true;
    L23:
        r4 = r4 + 1;
        goto L3
    L12:
        if (r62 == false) goto L14;
        r5.f817r = 2;
        r5.f809j = (int) r12.getY();
    L17:
        r63 = false;
        goto L18
    L15:
        if (r6 != 2) goto L17;
    L24:
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View r1, boolean r2) {
        m1301u(r1);
        r1.clearAnimation();
        m1301u(r1);
        super.removeDetachedView(r1, r2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View r2, View r3) {
        this.f1580j.getClass();
        if (m1331x() == true) goto L7;
        if (r3 == null) goto L7;
        m1306E(r2, r3);
    L7:
        super.requestChildFocus(r2, r3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View r7, Rect r8, boolean r9) {
        return this.f1580j.mo792X(this, r7, r8, r9, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r5) {
        ArrayList r02 = this.f1583l;
        int r1 = r02.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        ((C0374j) r02.get(r2)).getClass();
        r2 = r2 + 1;
        goto L3
    L5:
        super.requestDisallowInterceptTouchEvent(r5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1588q == 0) goto L5;
    L7:
        this.f1589r = true;
        return;
    L5:
        if (this.f1590s == true) goto L7;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final int m1327s(AbstractC0355O r5) {
        int r1 = -1;
        if (r5.m838d(524) == false) goto L5;
    L10:
        return r1;
    L5:
        if (r5.m840f() == false) goto L10;
        C0234d r02 = this.f1566c;
        r1 = 0;
        r5.getClass();
        ArrayList r52 = (ArrayList) r02.f475c;
        int r03 = r52.size();
        int r2 = 0;
    L8:
        if (r2 >= r03) goto L10;
        ((AbstractC0365a) r52.get(r2)).getClass();
        r2 = r2 + 1;
        goto L8
    }

    @Override // android.view.View
    public final void scrollBy(int r4, int r5) {
        AbstractC0343C r02 = this.f1580j;
        if (r02 != null) goto L6;
        return;
    L6:
        if (this.f1590s == false) goto L8;
        return;
    L8:
        boolean r03 = r02.mo799c();
        boolean r1 = this.f1580j.mo800d();
        if (r03 == true) goto L12;
        if (r1 == true) goto L12;
        return;
    L12:
        if (r03 == true) goto L15;
        r4 = 0;
    L15:
        if (r1 == true) goto L18;
        r5 = 0;
    L18:
        m1308G(r4, r5, null);
    }

    @Override // android.view.View
    public final void scrollTo(int r1, int r2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent r2) {
        if (m1331x() == false) goto L13;
        int r02 = 0;
        if (r2 == null) goto L7;
        int r22 = r2.getContentChangeTypes();
    L8:
        if (r22 == 0) goto L11;
        r02 = r22;
    L11:
        this.f1592u |= r02;
        return;
    L7:
        r22 = 0;
        goto L8
    L13:
        super.sendAccessibilityEventUnchecked(r2);
    }

    public void setAccessibilityDelegateCompat(C0357Q r1) {
        this.f1569d0 = r1;
        AbstractC0080Q.m291j(this, r1);
    }

    public void setAdapter(AbstractC0387w r5) {
        setLayoutFrozen(false);
        AbstractC0390z r02 = this.f1544F;
        if (r02 == null) goto L5;
        r02.mo947d();
    L5:
        AbstractC0343C r03 = this.f1580j;
        C0349I r1 = this.f1562a;
        if (r03 == null) goto L8;
        r03.m788T(r1);
        this.f1580j.m789U(r1);
    L8:
        r1.f685a.clear();
        r1.m824d();
        C0234d r04 = this.f1566c;
        r04.m658v((ArrayList) r04.f475c);
        r04.m658v((ArrayList) r04.f476d);
        r1.f685a.clear();
        r1.m824d();
        C0348H r05 = r1.m823c();
        if (r05.f684b != 0) goto L14;
        int r12 = 0;
    L11:
        SparseArray r2 = r05.f683a;
        if (r12 >= r2.size()) goto L14;
        ((C0347G) r2.valueAt(r12)).f680a.clear();
        r12 = r12 + 1;
    L14:
        this.f1561W.f697e = true;
        m1304C(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0388x r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean r2) {
        if (r2 == this.f1572f) goto L5;
        this.f1543E = null;
        this.f1541C = null;
        this.f1542D = null;
        this.f1540B = null;
    L5:
        this.f1572f = r2;
        super.setClipToPadding(r2);
        if (this.f1587p == false) goto L9;
        requestLayout();
        return;
    }

    public void setEdgeEffectFactory(C0389y r1) {
        r1.getClass();
        this.f1539A = r1;
        this.f1543E = null;
        this.f1541C = null;
        this.f1542D = null;
        this.f1540B = null;
    }

    public void setHasFixedSize(boolean r1) {
        this.f1586o = r1;
    }

    public void setItemAnimator(AbstractC0390z r3) {
        AbstractC0390z r02 = this.f1544F;
        if (r02 == null) goto L5;
        r02.mo947d();
        this.f1544F.f876a = null;
    L5:
        this.f1544F = r3;
        if (r3 == null) goto L9;
        r3.f876a = this.f1567c0;
        return;
    }

    public void setItemViewCacheSize(int r2) {
        C0349I r02 = this.f1562a;
        r02.f688d = r2;
        r02.m831k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean r1) {
        suppressLayout(r1);
    }

    public void setLayoutManager(AbstractC0343C r9) {
        if (r9 != this.f1580j) goto L5;
        return;
    L5:
        int r2 = 0;
        setScrollState(0);
        RunnableC0354N r3 = this.f1558T;
        r3.f709g.removeCallbacks(r3);
        r3.f705c.abortAnimation();
        AbstractC0343C r32 = this.f1580j;
        if (r32 == null) goto L8;
        r32.getClass();
    L8:
        AbstractC0343C r33 = this.f1580j;
        C0349I r4 = this.f1562a;
        if (r33 == null) goto L17;
        AbstractC0390z r34 = this.f1544F;
        if (r34 == null) goto L13;
        r34.mo947d();
    L13:
        this.f1580j.m788T(r4);
        this.f1580j.m789U(r4);
        r4.f685a.clear();
        r4.m824d();
        if (this.f1585n == false) goto L16;
        AbstractC0343C r35 = this.f1580j;
        r35.f671e = false;
        r35.mo779K(this);
    L16:
        this.f1580j.m794Z(null);
        this.f1580j = null;
    L18:
        C0234d r1 = this.f1568d;
        ((C0366b) r1.f475c).m943g();
        ArrayList r36 = (ArrayList) r1.f476d;
        int r5 = r36.size() - 1;
    L19:
        C0386v r6 = (C0386v) r1.f474b;
        if (r5 < 0) goto L22;
        View r7 = (View) r36.get(r5);
        r6.getClass();
        m1301u(r7);
        r36.remove(r5);
        r5 = r5 - 1;
        goto L19
    L22:
        RecyclerView r12 = r6.f875a;
        int r37 = r12.getChildCount();
    L23:
        if (r2 >= r37) goto L25;
        View r52 = r12.getChildAt(r2);
        m1301u(r52);
        r52.clearAnimation();
        r2 = r2 + 1;
        goto L23
    L25:
        r12.removeAllViews();
        this.f1580j = r9;
        if (r9 != null) goto L28;
    L34:
        r4.m831k();
        requestLayout();
        return;
    L28:
        if (r9.f668b != null) goto L33;
        r9.m794Z(this);
        if (this.f1585n == false) goto L34;
        AbstractC0343C r92 = this.f1580j;
        r92.f671e = true;
        r92.mo778J(this);
        goto L34
    L33:
        throw new IllegalArgumentException("LayoutManager " + r9 + " is already attached to a RecyclerView:" + r9.f668b.m1324p());
    L17:
        r4.f685a.clear();
        r4.m824d();
        goto L18
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition r2) {
        if (r2 != null) goto L6;
        super.setLayoutTransition(null);
        return;
    L6:
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r3) {
        C0113m r02 = getScrollingChildHelper();
        if (r02.f298d == false) goto L5;
        Field r1 = AbstractC0080Q.f219a;
        AbstractC0070G.m236z(r02.f297c);
    L5:
        r02.f298d = r3;
    }

    public void setOnFlingListener(AbstractC0345E r1) {
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0346F r1) {
        this.f1563a0 = r1;
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
        this.f1557S = r1;
    }

    public void setRecycledViewPool(C0348H r4) {
        C0349I r02 = this.f1562a;
        if (r02.f690f == null) goto L5;
        r1.f684b--;
    L5:
        r02.f690f = r4;
        if (r4 == null) goto L9;
        r02.f691g.getAdapter();
        return;
    }

    public void setRecyclerListener(InterfaceC0350J r1) {
    }

    public void setScrollState(int r3) {
        if (r3 != this.f1545G) goto L5;
        return;
    L5:
        this.f1545G = r3;
        if (r3 == 2) goto L10;
        RunnableC0354N r02 = this.f1558T;
        r02.f709g.removeCallbacks(r02);
        r02.f705c.abortAnimation();
        AbstractC0343C r03 = this.f1580j;
        if (r03 == null) goto L10;
        r03.getClass();
    L10:
        AbstractC0343C r04 = this.f1580j;
        if (r04 == null) goto L13;
        r04.mo786R(r3);
    L13:
        AbstractC0346F r05 = this.f1563a0;
        if (r05 == null) goto L16;
        r05.m819a(this, r3);
    L16:
        ArrayList r06 = this.f1565b0;
        if (r06 == null) goto L21;
        int r07 = r06.size() - 1;
    L19:
        if (r07 < 0) goto L23;
        ((AbstractC0346F) this.f1565b0.get(r07)).m819a(this, r3);
        r07 = r07 - 1;
        goto L19
    L23:
        return;
    }

    public void setScrollingTouchSlop(int r3) {
        ViewConfiguration r02 = ViewConfiguration.get(getContext());
        if (r3 == 1) goto L5;
        this.f1552N = r02.getScaledTouchSlop();
        return;
    L5:
        this.f1552N = r02.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0353M r1) {
        this.f1562a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return getScrollingChildHelper().m416h(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m417i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean r10) {
        if (r10 == this.f1590s) goto L11;
        m1313d("Do not suppressLayout in layout or scroll");
        if (r10 == true) goto L7;
        this.f1590s = false;
        this.f1589r = false;
        return;
    L7:
        long r3 = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(r3, r3, 3, 0.0f, 0.0f, 0));
        this.f1590s = true;
        this.f1591t = true;
        setScrollState(0);
        RunnableC0354N r102 = this.f1558T;
        r102.f709g.removeCallbacks(r102);
        r102.f705c.abortAnimation();
        AbstractC0343C r103 = this.f1580j;
        if (r103 == null) goto L13;
        r103.getClass();
        return;
    L13:
        return;
    }

    /* JADX INFO: renamed from: t */
    public final long m1328t(AbstractC0355O r1) {
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final Rect m1329v(View r6) {
        C0344D r02 = (C0344D) r6.getLayoutParams();
        boolean r1 = r02.f678b;
        Rect r2 = r02.f677a;
        if (r1 == true) goto L6;
        return r2;
    L6:
        if (this.f1561W.f698f == true) goto L13;
        r2.set(0, 0, 0, 0);
        ArrayList r3 = this.f1582k;
        if (r3.size() > 0) goto L11;
        r02.f678b = false;
        return r2;
    L11:
        this.f1574g.set(0, 0, 0, 0);
        ((AbstractC0341A) r3.get(0)).getClass();
        ((C0344D) r6.getLayoutParams()).getClass();
        throw null;
    L13:
        r02.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1330w() {
        if (this.f1587p == true) goto L5;
    L10:
        return true;
    L5:
        if (this.f1594w == true) goto L10;
        if (this.f1566c.m652o() == true) goto L10;
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m1331x() {
        if (this.f1596y <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m1332y() {
        int r02 = this.f1568d.m650m();
        int r2 = 0;
    L4:
        if (r2 >= r02) goto L6;
        ((C0344D) this.f1568d.m649l(r2).getLayoutParams()).f678b = true;
        r2 = r2 + 1;
        goto L4
    L6:
        ArrayList r03 = this.f1562a.f687c;
        if (r03.size() > 0) goto L9;
        return;
    L9:
        ((AbstractC0355O) r03.get(0)).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public final void m1333z() {
        this.f1596y++;
    }

    public RecyclerView(Context r20, AttributeSet r21, int r22) {
        super(r20, r21, r22);
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
        C0371g r1 = new C0371g();
        r1.f876a = null;
        r1.f877b = new ArrayList();
        r1.f878c = 120;
        r1.f879d = 120;
        r1.f880e = 250;
        r1.f881f = 250;
        r1.f784g = true;
        r1.f785h = new ArrayList();
        r1.f786i = new ArrayList();
        r1.f787j = new ArrayList();
        r1.f788k = new ArrayList();
        r1.f789l = new ArrayList();
        r1.f790m = new ArrayList();
        r1.f791n = new ArrayList();
        r1.f792o = new ArrayList();
        r1.f793p = new ArrayList();
        r1.f794q = new ArrayList();
        r1.f795r = new ArrayList();
        this.f1544F = r1;
        this.f1545G = 0;
        this.f1546H = -1;
        this.f1555Q = Float.MIN_VALUE;
        this.f1556R = Float.MIN_VALUE;
        this.f1557S = true;
        this.f1558T = new RunnableC0354N(this);
        this.f1560V = new C0376l();
        C0352L r12 = new C0352L();
        r12.f693a = -1;
        r12.f694b = 0;
        r12.f695c = 0;
        r12.f696d = 0;
        r12.f697e = false;
        r12.f698f = false;
        r12.f699g = false;
        r12.f700h = false;
        r12.f701i = false;
        r12.f702j = false;
        this.f1561W = r12;
        C0386v r13 = new C0386v(this);
        this.f1567c0 = r13;
        this.f1573f0 = new int[2];
        this.f1575g0 = new int[2];
        this.f1577h0 = new int[2];
        this.f1579i0 = new ArrayList();
        this.f1581j0 = new RunnableC0019E(4, this);
        new C1121e(13, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration r2 = ViewConfiguration.get(r20);
        this.f1552N = r2.getScaledTouchSlop();
        this.f1555Q = AbstractC0081S.m293a(r2);
        this.f1556R = AbstractC0081S.m294b(r2);
        this.f1553O = r2.getScaledMinimumFlingVelocity();
        this.f1554P = r2.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() != 2) goto L5;
        boolean r23 = true;
    L6:
        setWillNotDraw(r23);
        this.f1544F.f876a = r13;
        this.f1566c = new C0234d(new C1121e(14, this));
        this.f1568d = new C0234d(new C0386v(this));
        Field r14 = AbstractC0080Q.f219a;
        if (AbstractC0072I.m243c(this) != 0) goto L10;
        AbstractC0072I.m253m(this, 8);
    L10:
        if (getImportantForAccessibility() != 0) goto L12;
        setImportantForAccessibility(1);
    L12:
        this.f1593v = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0357Q(this));
        int[] r3 = AbstractC0337a.f656a;
        TypedArray r5 = r20.obtainStyledAttributes(r21, r3, r22, 0);
        if (Build.VERSION.SDK_INT < 29) goto L15;
        int r15 = 8;
        AbstractC0016B.m44q(this, r20, r3, r21, r5, r22);
        TypedArray r6 = r5;
    L16:
        String r152 = r6.getString(r15);
        if (r6.getInt(2, -1) != (-1)) goto L19;
        setDescendantFocusability(262144);
    L19:
        this.f1572f = r6.getBoolean(1, true);
        if (r6.getBoolean(3, false) == false) goto L29;
        StateListDrawable r32 = (StateListDrawable) r6.getDrawable(6);
        Drawable r4 = r6.getDrawable(7);
        StateListDrawable r52 = (StateListDrawable) r6.getDrawable(4);
        Drawable r16 = r6.getDrawable(5);
        if (r32 == null) goto L28;
        if (r4 == null) goto L28;
        if (r52 == null) goto L28;
        if (r16 == null) goto L28;
        Resources r17 = getContext().getResources();
        TypedArray r18 = r6;
        char r162 = 3;
        char r172 = 2;
        new C0374j(this, r32, r4, r52, r16, r17.getDimensionPixelSize(C1031R.dimen.fastscroll_default_thickness), r17.getDimensionPixelSize(C1031R.dimen.fastscroll_minimum_range), r17.getDimensionPixelOffset(C1031R.dimen.fastscroll_margin));
    L30:
        r18.recycle();
        if (r152 == null) goto L80;
        String r24 = r152.trim();
        if (r24.isEmpty() == true) goto L80;
        if (r24.charAt(0) != '.') goto L38;
        r24 = r20.getPackageName() + r24;
    L92:
    L44:
        e = move-exception;
        throw new IllegalStateException(r21.getPositionDescription() + ": Class is not a LayoutManager " + r24, e);
    L52:
        e = move-exception;
        throw new IllegalStateException(r21.getPositionDescription() + ": Unable to find LayoutManager " + r24, e);
    L46:
        e = move-exception;
        throw new IllegalStateException(r21.getPositionDescription() + ": Cannot access non-public constructor " + r24, e);
    L48:
        e = move-exception;
        throw new IllegalStateException(r21.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r24, e);
    L50:
        e = move-exception;
        throw new IllegalStateException(r21.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r24, e);
    L42:
        if (isInEditMode() == false) goto L54;
        ClassLoader r33 = getClass().getClassLoader();     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
    L55:
        Class<? extends U> r34 = Class.forName(r24, false, r33).asSubclass(AbstractC0343C.class);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
        Constructor r42 = r34.getConstructor(f1537l0);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L62
        Object[] r02 = new Object[4];     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L62
        r02[0] = r20;     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L62
        boolean r7 = true;
        r02[1] = r21;     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L60
        r02[r172] = Integer.valueOf(r22);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L60
        r02[r162] = 0;     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L60
        Object[] r153 = r02;
    L66:
        r42.setAccessible(r7);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
        setLayoutManager((AbstractC0343C) r42.newInstance(r153));     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
    L81:
        int r03 = Build.VERSION.SDK_INT;
        int[] r35 = f1536k0;
        TypedArray r8 = r20.obtainStyledAttributes(r21, r35, r22, 0);
        if (r03 < 29) goto L84;
        AbstractC0016B.m44q(this, r20, r35, r21, r8, r22);
    L84:
        boolean r04 = r8.getBoolean(0, r7);
        r8.recycle();
        setNestedScrollingEnabled(r04);
        return;
    L60:
        e = e;
    L61:
        NoSuchMethodException r53 = e;
        r153 = null;
        r42 = r34.getConstructor(null);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L67
    L67:
        e = move-exception;
        e.initCause(r53);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
        throw new IllegalStateException(r21.getPositionDescription() + ": Error creating LayoutManager " + r24, e);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
    L62:
        e = e;
        r7 = true;
        goto L61
    L54:
        r33 = r20.getClassLoader();     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
        goto L55
    L38:
        if (r24.contains(".") == true) goto L92;
        r24 = RecyclerView.class.getPackage().getName() + '.' + r24;
    L80:
        r7 = true;
    L28:
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m1324p());
    L29:
        r18 = r6;
        r162 = 3;
        r172 = 2;
        goto L30
    L15:
        r15 = 8;
        r6 = r5;
        goto L16
    L5:
        r23 = false;
        goto L6
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r3) {
        AbstractC0343C r02 = this.f1580j;
        if (r02 == null) goto L7;
        return r02.mo811p(r3);
    L7:
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1324p());
    }
}
