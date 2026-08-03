package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0501a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import org.luckypray.dexkit.C1031R;
import p000A.C0002c;
import p000A.C0010k;
import p001A0.C0020F;
import p002B.C0057g;
import p006D.AbstractC0068E;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p006D.C0088Z;
import p006D.C0089a;
import p006D.C0090a0;
import p006D.C0091b;
import p006D.C0099f;
import p006D.ViewOnApplyWindowInsetsListenerC0087Y;
import p008E.C0151e;
import p010F.AbstractC0196a;
import p021L.C0245e;
import p034S.AbstractC0324d;
import p037U.C0376l;
import p056f0.AbstractC0805P;
import p057g.RunnableC0852C;
import p058g0.AbstractC0942a;
import p068l0.C0979a;
import p068l0.C0980b;
import p078r.AbstractC1058a;
import p078r.C1061d;
import p081s0.ViewOnAttachStateChangeListenerC1079m;
import p089x0.C1122f;
import p089x0.C1123g;
import p089x0.C1127k;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC1058a {

    /* JADX INFO: renamed from: A */
    public final C0501a f2281A;

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f2282B;

    /* JADX INFO: renamed from: C */
    public final int f2283C;

    /* JADX INFO: renamed from: D */
    public int f2284D;

    /* JADX INFO: renamed from: E */
    public int f2285E;

    /* JADX INFO: renamed from: F */
    public final float f2286F;

    /* JADX INFO: renamed from: G */
    public int f2287G;

    /* JADX INFO: renamed from: H */
    public final float f2288H;

    /* JADX INFO: renamed from: I */
    public boolean f2289I;

    /* JADX INFO: renamed from: J */
    public boolean f2290J;

    /* JADX INFO: renamed from: K */
    public final boolean f2291K;

    /* JADX INFO: renamed from: L */
    public int f2292L;

    /* JADX INFO: renamed from: M */
    public C0245e f2293M;

    /* JADX INFO: renamed from: N */
    public boolean f2294N;

    /* JADX INFO: renamed from: O */
    public int f2295O;

    /* JADX INFO: renamed from: P */
    public boolean f2296P;

    /* JADX INFO: renamed from: Q */
    public final float f2297Q;

    /* JADX INFO: renamed from: R */
    public int f2298R;

    /* JADX INFO: renamed from: S */
    public int f2299S;

    /* JADX INFO: renamed from: T */
    public int f2300T;

    /* JADX INFO: renamed from: U */
    public WeakReference f2301U;

    /* JADX INFO: renamed from: V */
    public WeakReference f2302V;

    /* JADX INFO: renamed from: W */
    public final ArrayList f2303W;

    /* JADX INFO: renamed from: X */
    public VelocityTracker f2304X;

    /* JADX INFO: renamed from: Y */
    public int f2305Y;

    /* JADX INFO: renamed from: Z */
    public int f2306Z;

    /* JADX INFO: renamed from: a */
    public final int f2307a;

    /* JADX INFO: renamed from: a0 */
    public boolean f2308a0;

    /* JADX INFO: renamed from: b */
    public boolean f2309b;

    /* JADX INFO: renamed from: b0 */
    public HashMap f2310b0;

    /* JADX INFO: renamed from: c */
    public final float f2311c;

    /* JADX INFO: renamed from: c0 */
    public final SparseIntArray f2312c0;

    /* JADX INFO: renamed from: d */
    public final int f2313d;

    /* JADX INFO: renamed from: d0 */
    public final C0979a f2314d0;

    /* JADX INFO: renamed from: e */
    public int f2315e;

    /* JADX INFO: renamed from: f */
    public boolean f2316f;

    /* JADX INFO: renamed from: g */
    public int f2317g;

    /* JADX INFO: renamed from: h */
    public final int f2318h;

    /* JADX INFO: renamed from: i */
    public final C1123g f2319i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f2320j;

    /* JADX INFO: renamed from: k */
    public final int f2321k;

    /* JADX INFO: renamed from: l */
    public final int f2322l;

    /* JADX INFO: renamed from: m */
    public int f2323m;

    /* JADX INFO: renamed from: n */
    public final boolean f2324n;

    /* JADX INFO: renamed from: o */
    public final boolean f2325o;

    /* JADX INFO: renamed from: p */
    public final boolean f2326p;

    /* JADX INFO: renamed from: q */
    public final boolean f2327q;

    /* JADX INFO: renamed from: r */
    public final boolean f2328r;

    /* JADX INFO: renamed from: s */
    public final boolean f2329s;

    /* JADX INFO: renamed from: t */
    public final boolean f2330t;

    /* JADX INFO: renamed from: u */
    public final boolean f2331u;

    /* JADX INFO: renamed from: v */
    public int f2332v;

    /* JADX INFO: renamed from: w */
    public int f2333w;

    /* JADX INFO: renamed from: x */
    public final boolean f2334x;

    /* JADX INFO: renamed from: y */
    public final C1127k f2335y;

    /* JADX INFO: renamed from: z */
    public boolean f2336z;

    public BottomSheetBehavior() {
        this.f2307a = 0;
        this.f2309b = true;
        this.f2321k = -1;
        this.f2322l = -1;
        this.f2281A = new C0501a(this);
        this.f2286F = 0.5f;
        this.f2288H = -1.0f;
        this.f2291K = true;
        this.f2292L = 4;
        this.f2297Q = 0.1f;
        this.f2303W = new ArrayList();
        this.f2306Z = -1;
        this.f2312c0 = new SparseIntArray();
        this.f2314d0 = new C0979a(this, 0);
    }

    /* JADX INFO: renamed from: v */
    public static View m1832v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        Field field = AbstractC0080Q.f219a;
        if (AbstractC0070G.m226p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View viewM1832v = m1832v(viewGroup.getChildAt(i2));
                if (viewM1832v != null) {
                    return viewM1832v;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static int m1833w(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: A */
    public final void m1834A(int i2) {
        if (i2 == -1) {
            if (this.f2316f) {
                return;
            } else {
                this.f2316f = true;
            }
        } else {
            if (!this.f2316f && this.f2315e == i2) {
                return;
            }
            this.f2316f = false;
            this.f2315e = Math.max(0, i2);
        }
        m1842I();
    }

    /* JADX INFO: renamed from: B */
    public final void m1835B(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.f2289I || i2 != 5) {
            int i3 = (i2 == 6 && this.f2309b && m1851y(i2) <= this.f2284D) ? 3 : i2;
            WeakReference weakReference = this.f2301U;
            if (weakReference == null || weakReference.get() == null) {
                m1836C(i2);
                return;
            }
            View view = (View) this.f2301U.get();
            RunnableC0852C runnableC0852C = new RunnableC0852C(this, view, i3);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                Field field = AbstractC0080Q.f219a;
                if (view.isAttachedToWindow()) {
                    view.post(runnableC0852C);
                    return;
                }
            }
            runnableC0852C.run();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1836C(int i2) {
        if (this.f2292L == i2) {
            return;
        }
        this.f2292L = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z2 = this.f2289I;
        }
        WeakReference weakReference = this.f2301U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            m1841H(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            m1841H(false);
        }
        m1840G(i2, true);
        ArrayList arrayList = this.f2303W;
        if (arrayList.size() <= 0) {
            m1839F();
        } else {
            AbstractC0324d.m726i(arrayList.get(0));
            throw null;
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m1837D(View view, float f2) {
        if (this.f2290J) {
            return true;
        }
        if (view.getTop() < this.f2287G) {
            return false;
        }
        return Math.abs(((f2 * this.f2297Q) + ((float) view.getTop())) - ((float) this.f2287G)) / ((float) m1848t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m1836C(2);
        m1840G(r4, true);
        r2.f2281A.m1226c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m682n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1838E(View view, int i2, boolean z2) {
        int iM1851y = m1851y(i2);
        C0245e c0245e = this.f2293M;
        if (c0245e != null) {
            if (!z2) {
                int left = view.getLeft();
                c0245e.f520r = view;
                c0245e.f505c = -1;
                boolean zM676h = c0245e.m676h(left, iM1851y, 0, 0);
                if (!zM676h && c0245e.f503a == 0 && c0245e.f520r != null) {
                    c0245e.f520r = null;
                }
            }
        }
        m1836C(i2);
    }

    /* JADX INFO: renamed from: F */
    public final void m1839F() {
        View view;
        int iM477a;
        WeakReference weakReference = this.f2301U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0080Q.m288g(view, 524288);
        AbstractC0080Q.m286e(view, 0);
        AbstractC0080Q.m288g(view, 262144);
        AbstractC0080Q.m286e(view, 0);
        AbstractC0080Q.m288g(view, 1048576);
        AbstractC0080Q.m286e(view, 0);
        SparseIntArray sparseIntArray = this.f2312c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            AbstractC0080Q.m288g(view, i2);
            AbstractC0080Q.m286e(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2309b && this.f2292L != 6) {
            String string = view.getResources().getString(C1031R.string.bottomsheet_action_expand_halfway);
            C0010k c0010k = new C0010k(this, 6);
            ArrayList arrayListM284c = AbstractC0080Q.m284c(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListM284c.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = AbstractC0080Q.f221c[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < arrayListM284c.size(); i7++) {
                            z2 &= ((C0151e) arrayListM284c.get(i7)).m477a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    iM477a = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0151e) arrayListM284c.get(i3)).f352a).getLabel())) {
                        iM477a = ((C0151e) arrayListM284c.get(i3)).m477a();
                        break;
                    }
                    i3++;
                }
            }
            if (iM477a != -1) {
                C0151e c0151e = new C0151e(null, iM477a, string, c0010k, null);
                View.AccessibilityDelegate accessibilityDelegateM282a = AbstractC0080Q.m282a(view);
                C0091b c0091b = accessibilityDelegateM282a == null ? null : accessibilityDelegateM282a instanceof C0089a ? ((C0089a) accessibilityDelegateM282a).f237a : new C0091b(accessibilityDelegateM282a);
                if (c0091b == null) {
                    c0091b = new C0091b();
                }
                AbstractC0080Q.m291j(view, c0091b);
                AbstractC0080Q.m288g(view, c0151e.m477a());
                AbstractC0080Q.m284c(view).add(c0151e);
                AbstractC0080Q.m286e(view, 0);
            }
            sparseIntArray.put(0, iM477a);
        }
        if (this.f2289I && this.f2292L != 5) {
            AbstractC0080Q.m289h(view, C0151e.f349j, new C0010k(this, 5));
        }
        int i8 = this.f2292L;
        if (i8 == 3) {
            AbstractC0080Q.m289h(view, C0151e.f348i, new C0010k(this, this.f2309b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            AbstractC0080Q.m289h(view, C0151e.f347h, new C0010k(this, this.f2309b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            AbstractC0080Q.m289h(view, C0151e.f348i, new C0010k(this, 4));
            AbstractC0080Q.m289h(view, C0151e.f347h, new C0010k(this, 3));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m1840G(int i2, boolean z2) {
        C1123g c1123g = this.f2319i;
        ValueAnimator valueAnimator = this.f2282B;
        if (i2 == 2) {
            return;
        }
        boolean z3 = this.f2292L == 3 && (this.f2334x || m1852z());
        if (this.f2336z == z3 || c1123g == null) {
            return;
        }
        this.f2336z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c1123g.f4312a.f4299j, z3 ? m1847s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM1847s = this.f2336z ? m1847s() : 1.0f;
        C1122f c1122f = c1123g.f4312a;
        if (c1122f.f4299j != fM1847s) {
            c1122f.f4299j = fM1847s;
            c1123g.f4316e = true;
            c1123g.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m1841H(boolean z2) {
        WeakReference weakReference = this.f2301U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f2310b0 != null) {
                    return;
                } else {
                    this.f2310b0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f2301U.get() && z2) {
                    this.f2310b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f2310b0 = null;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1842I() {
        View view;
        if (this.f2301U != null) {
            m1846r();
            if (this.f2292L != 4 || (view = (View) this.f2301U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: c */
    public final void mo1843c(C1061d c1061d) {
        this.f2301U = null;
        this.f2293M = null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: e */
    public final void mo1844e() {
        this.f2301U = null;
        this.f2293M = null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: f */
    public final boolean mo1815f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i2;
        C0245e c0245e;
        if (!view.isShown() || !this.f2291K) {
            this.f2294N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2305Y = -1;
            this.f2306Z = -1;
            VelocityTracker velocityTracker = this.f2304X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2304X = null;
            }
        }
        if (this.f2304X == null) {
            this.f2304X = VelocityTracker.obtain();
        }
        this.f2304X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f2306Z = (int) motionEvent.getY();
            if (this.f2292L != 2) {
                WeakReference weakReference = this.f2302V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m1172n(view2, x, this.f2306Z)) {
                    this.f2305Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2308a0 = true;
                }
            }
            this.f2294N = this.f2305Y == -1 && !coordinatorLayout.m1172n(view, x, this.f2306Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2308a0 = false;
            this.f2305Y = -1;
            if (this.f2294N) {
                this.f2294N = false;
                return false;
            }
        }
        if (!this.f2294N && (c0245e = this.f2293M) != null && c0245e.m683o(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f2302V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f2294N || this.f2292L == 1 || coordinatorLayout.m1172n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2293M == null || (i2 = this.f2306Z) == -1 || Math.abs(((float) i2) - motionEvent.getY()) <= ((float) this.f2293M.f504b)) ? false : true;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3 = this.f2322l;
        C1123g c1123g = this.f2319i;
        Field field = AbstractC0080Q.f219a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2301U == null) {
            this.f2317g = coordinatorLayout.getResources().getDimensionPixelSize(C1031R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f2324n || this.f2316f) ? false : true;
            if (this.f2325o || this.f2326p || this.f2327q || this.f2329s || this.f2330t || this.f2331u || z2) {
                C0057g c0057g = new C0057g(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0376l c0376l = new C0376l();
                c0376l.f824a = paddingStart;
                c0376l.f825b = paddingEnd;
                c0376l.f826c = paddingBottom;
                AbstractC0070G.m231u(view, new C0002c(c0057g, c0376l, 11));
                if (view.isAttachedToWindow()) {
                    AbstractC0068E.m210c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1079m());
                }
            }
            C0099f c0099f = new C0099f(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new C0090a0(c0099f));
            } else {
                PathInterpolator pathInterpolator = C0088Z.f234e;
                Object tag = view.getTag(C1031R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0087Y = new ViewOnApplyWindowInsetsListenerC0087Y(view, c0099f);
                view.setTag(C1031R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0087Y);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0087Y);
                }
            }
            this.f2301U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0805P.m2039S(context, C1031R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0196a.m567b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0805P.m2038R(context, C1031R.attr.motionDurationMedium2, 300);
            AbstractC0805P.m2038R(context, C1031R.attr.motionDurationShort3, 150);
            AbstractC0805P.m2038R(context, C1031R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C1031R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(C1031R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (c1123g != null) {
                view.setBackground(c1123g);
                float fM219i = this.f2288H;
                if (fM219i == -1.0f) {
                    fM219i = AbstractC0070G.m219i(view);
                }
                c1123g.m2650j(fM219i);
            } else {
                ColorStateList colorStateList = this.f2320j;
                if (colorStateList != null) {
                    AbstractC0070G.m227q(view, colorStateList);
                }
            }
            m1839F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2293M == null) {
            this.f2293M = new C0245e(coordinatorLayout.getContext(), coordinatorLayout, this.f2314d0);
        }
        int top = view.getTop();
        coordinatorLayout.m1174p(view, i2);
        this.f2299S = coordinatorLayout.getWidth();
        this.f2300T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2298R = height;
        int iMin = this.f2300T;
        int i5 = iMin - height;
        int i6 = this.f2333w;
        if (i5 < i6) {
            if (this.f2328r) {
                if (i3 != -1) {
                    iMin = Math.min(iMin, i3);
                }
                this.f2298R = iMin;
            } else {
                int iMin2 = iMin - i6;
                if (i3 != -1) {
                    iMin2 = Math.min(iMin2, i3);
                }
                this.f2298R = iMin2;
            }
        }
        this.f2284D = Math.max(0, this.f2300T - this.f2298R);
        this.f2285E = (int) ((1.0f - this.f2286F) * this.f2300T);
        m1846r();
        int i7 = this.f2292L;
        if (i7 == 3) {
            view.offsetTopAndBottom(m1850x());
        } else if (i7 == 6) {
            view.offsetTopAndBottom(this.f2285E);
        } else if (this.f2289I && i7 == 5) {
            view.offsetTopAndBottom(this.f2300T);
        } else if (i7 == 4) {
            view.offsetTopAndBottom(this.f2287G);
        } else if (i7 == 1 || i7 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m1840G(this.f2292L, false);
        this.f2302V = new WeakReference(m1832v(view));
        ArrayList arrayList = this.f2303W;
        if (arrayList.size() <= 0) {
            return true;
        }
        AbstractC0324d.m726i(arrayList.get(0));
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: h */
    public final boolean mo1817h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m1833w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f2321k, marginLayoutParams.width), m1833w(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2322l, marginLayoutParams.height));
        return true;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: i */
    public final boolean mo1845i(View view) {
        WeakReference weakReference = this.f2302V;
        return (weakReference == null || view != weakReference.get() || this.f2292L == 3) ? false : true;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: j */
    public final void mo1818j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        boolean z2 = this.f2291K;
        if (i4 == 1) {
            return;
        }
        WeakReference weakReference = this.f2302V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < m1850x()) {
                int iM1850x = top - m1850x();
                iArr[1] = iM1850x;
                Field field = AbstractC0080Q.f219a;
                view.offsetTopAndBottom(-iM1850x);
                m1836C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i3;
                Field field2 = AbstractC0080Q.f219a;
                view.offsetTopAndBottom(-i3);
                m1836C(1);
            }
        } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f2287G;
            if (i5 > i6 && !this.f2289I) {
                int i7 = top - i6;
                iArr[1] = i7;
                Field field3 = AbstractC0080Q.f219a;
                view.offsetTopAndBottom(-i7);
                m1836C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i3;
                Field field4 = AbstractC0080Q.f219a;
                view.offsetTopAndBottom(-i3);
                m1836C(1);
            }
        }
        m1849u(view.getTop());
        this.f2295O = i3;
        this.f2296P = true;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: k */
    public final void mo1819k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: m */
    public final void mo1820m(View view, Parcelable parcelable) {
        C0980b c0980b = (C0980b) parcelable;
        int i2 = this.f2307a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f2315e = c0980b.f3465d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f2309b = c0980b.f3466e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.f2289I = c0980b.f3467f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.f2290J = c0980b.f3468g;
            }
        }
        int i3 = c0980b.f3464c;
        if (i3 == 1 || i3 == 2) {
            this.f2292L = 4;
        } else {
            this.f2292L = i3;
        }
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1821n(View view) {
        return new C0980b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: o */
    public final boolean mo1822o(View view, int i2, int i3) {
        this.f2295O = 0;
        this.f2296P = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1823p(View view, View view2, int i2) {
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == m1850x()) {
            m1836C(3);
            return;
        }
        WeakReference weakReference = this.f2302V;
        if (weakReference != null && view2 == weakReference.get() && this.f2296P) {
            if (this.f2295O > 0) {
                if (!this.f2309b && view.getTop() > this.f2285E) {
                    i3 = 6;
                }
            } else if (this.f2289I) {
                VelocityTracker velocityTracker = this.f2304X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f2311c);
                    yVelocity = this.f2304X.getYVelocity(this.f2305Y);
                }
                if (m1837D(view, yVelocity)) {
                    i3 = 5;
                }
            } else if (this.f2295O == 0) {
                int top = view.getTop();
                if (!this.f2309b) {
                    int i4 = this.f2285E;
                    if (top < i4) {
                        if (top >= Math.abs(top - this.f2287G)) {
                        }
                    } else if (Math.abs(top - i4) < Math.abs(top - this.f2287G)) {
                    }
                    i3 = 6;
                } else if (Math.abs(top - this.f2284D) >= Math.abs(top - this.f2287G)) {
                    i3 = 4;
                }
            } else {
                if (!this.f2309b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f2285E) < Math.abs(top2 - this.f2287G)) {
                    }
                }
                i3 = 4;
            }
            m1838E(view, i3, false);
            this.f2296P = false;
        }
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: q */
    public final boolean mo1824q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f2292L;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        C0245e c0245e = this.f2293M;
        if (c0245e != null && (this.f2291K || i2 == 1)) {
            c0245e.m677i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2305Y = -1;
            this.f2306Z = -1;
            VelocityTracker velocityTracker = this.f2304X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2304X = null;
            }
        }
        if (this.f2304X == null) {
            this.f2304X = VelocityTracker.obtain();
        }
        this.f2304X.addMovement(motionEvent);
        if (this.f2293M != null && ((this.f2291K || this.f2292L == 1) && actionMasked == 2 && !this.f2294N)) {
            float fAbs = Math.abs(this.f2306Z - motionEvent.getY());
            C0245e c0245e2 = this.f2293M;
            if (fAbs > c0245e2.f504b) {
                c0245e2.m670b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2294N;
    }

    /* JADX INFO: renamed from: r */
    public final void m1846r() {
        int iM1848t = m1848t();
        if (this.f2309b) {
            this.f2287G = Math.max(this.f2300T - iM1848t, this.f2284D);
        } else {
            this.f2287G = this.f2300T - iM1848t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m1847s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f2;
        float f3 = 0.0f;
        if (this.f2319i != null && (weakReference = this.f2301U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f2301U.get();
            if (m1852z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                C1123g c1123g = this.f2319i;
                float fMo2634a = c1123g.f4312a.f4290a.f4351e.mo2634a(c1123g.m2647g());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    f2 = (radius <= 0.0f || fMo2634a <= 0.0f) ? 0.0f : radius / fMo2634a;
                }
                C1123g c1123g2 = this.f2319i;
                float fMo2634a2 = c1123g2.f4312a.f4290a.f4352f.mo2634a(c1123g2.m2647g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo2634a2 > 0.0f) {
                        f3 = radius2 / fMo2634a2;
                    }
                }
                return Math.max(f2, f3);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: t */
    public final int m1848t() {
        int i2;
        return this.f2316f ? Math.min(Math.max(this.f2317g, this.f2300T - ((this.f2299S * 9) / 16)), this.f2298R) + this.f2332v : (this.f2324n || this.f2325o || (i2 = this.f2323m) <= 0) ? this.f2315e + this.f2332v : Math.max(this.f2315e, i2 + this.f2318h);
    }

    /* JADX INFO: renamed from: u */
    public final void m1849u(int i2) {
        if (((View) this.f2301U.get()) != null) {
            ArrayList arrayList = this.f2303W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.f2287G;
            if (i2 <= i3 && i3 != m1850x()) {
                m1850x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            AbstractC0324d.m726i(arrayList.get(0));
            throw null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m1850x() {
        if (this.f2309b) {
            return this.f2284D;
        }
        return Math.max(this.f2283C, this.f2328r ? 0 : this.f2333w);
    }

    /* JADX INFO: renamed from: y */
    public final int m1851y(int i2) {
        if (i2 == 3) {
            return m1850x();
        }
        if (i2 == 4) {
            return this.f2287G;
        }
        if (i2 == 5) {
            return this.f2300T;
        }
        if (i2 == 6) {
            return this.f2285E;
        }
        throw new IllegalArgumentException(AbstractC0324d.m720c("Invalid state to get top offset: ", i2));
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1852z() {
        WeakReference weakReference = this.f2301U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f2301U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        int i3 = 2;
        this.f2307a = 0;
        this.f2309b = true;
        this.f2321k = -1;
        this.f2322l = -1;
        this.f2281A = new C0501a(this);
        this.f2286F = 0.5f;
        this.f2288H = -1.0f;
        this.f2291K = true;
        this.f2292L = 4;
        this.f2297Q = 0.1f;
        this.f2303W = new ArrayList();
        this.f2306Z = -1;
        this.f2312c0 = new SparseIntArray();
        this.f2314d0 = new C0979a(this, 0);
        this.f2318h = context.getResources().getDimensionPixelSize(C1031R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3329a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f2320j = AbstractC0805P.m2051r(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f2335y = C1127k.m2657a(context, attributeSet, C1031R.attr.bottomSheetStyle, C1031R.style.Widget_Design_BottomSheet_Modal).m2656a();
        }
        C1127k c1127k = this.f2335y;
        if (c1127k != null) {
            C1123g c1123g = new C1123g(c1127k);
            this.f2319i = c1123g;
            c1123g.m2649i(context);
            ColorStateList colorStateList = this.f2320j;
            if (colorStateList != null) {
                this.f2319i.m2651k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f2319i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m1847s(), 1.0f);
        this.f2282B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f2282B.addUpdateListener(new C0020F(i3, this));
        this.f2288H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f2321k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f2322l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            m1834A(i2);
        } else {
            m1834A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f2289I != z2) {
            this.f2289I = z2;
            if (!z2 && this.f2292L == 5) {
                m1835B(4);
            }
            m1839F();
        }
        this.f2324n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f2309b != z3) {
            this.f2309b = z3;
            if (this.f2301U != null) {
                m1846r();
            }
            m1836C((this.f2309b && this.f2292L == 6) ? 3 : this.f2292L);
            m1840G(this.f2292L, true);
            m1839F();
        }
        this.f2290J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f2291K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f2307a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f2 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f2286F = f2;
            if (this.f2301U != null) {
                this.f2285E = (int) ((1.0f - f2) * this.f2300T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i4 = typedValuePeekValue2.data;
                if (i4 >= 0) {
                    this.f2283C = i4;
                    m1840G(this.f2292L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2283C = dimensionPixelOffset;
                    m1840G(this.f2292L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2313d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f2325o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f2326p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f2327q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f2328r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f2329s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f2330t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f2331u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f2334x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f2311c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
