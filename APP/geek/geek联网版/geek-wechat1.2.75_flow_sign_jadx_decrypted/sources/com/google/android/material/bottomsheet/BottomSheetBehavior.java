package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000.AbstractC0168dz;
import p000.AbstractC0274gu;
import p000.AbstractC0834vx;
import p000.AbstractC0889xd;
import p000.C0009a8;
import p000.C0015ae;
import p000.C0059b8;
import p000.C0095c8;
import p000.C0138d4;
import p000.C0142d8;
import p000.C0178e8;
import p000.C0209f2;
import p000.C0281h0;
import p000.C0311hu;
import p000.C0350iu;
import p000.C0407kd;
import p000.C0800v;
import p000.C0875x;
import p000.RunnableC0917y4;
import p000.ViewOnAttachStateChangeListenerC0038ao;
import p000.aa0;
import p000.ba0;
import p000.da0;
import p000.fb0;
import p000.g40;
import p000.gc0;
import p000.ic0;
import p000.m30;
import p000.oa0;
import p000.ra0;
import p000.x90;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0889xd {

    /* JADX INFO: renamed from: A */
    public final C0178e8 f938A;

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f939B;

    /* JADX INFO: renamed from: C */
    public final int f940C;

    /* JADX INFO: renamed from: D */
    public int f941D;

    /* JADX INFO: renamed from: E */
    public int f942E;

    /* JADX INFO: renamed from: F */
    public final float f943F;

    /* JADX INFO: renamed from: G */
    public int f944G;

    /* JADX INFO: renamed from: H */
    public final float f945H;

    /* JADX INFO: renamed from: I */
    public boolean f946I;

    /* JADX INFO: renamed from: J */
    public boolean f947J;

    /* JADX INFO: renamed from: K */
    public final boolean f948K;

    /* JADX INFO: renamed from: L */
    public int f949L;

    /* JADX INFO: renamed from: M */
    public ra0 f950M;

    /* JADX INFO: renamed from: N */
    public boolean f951N;

    /* JADX INFO: renamed from: O */
    public int f952O;

    /* JADX INFO: renamed from: P */
    public boolean f953P;

    /* JADX INFO: renamed from: Q */
    public final float f954Q;

    /* JADX INFO: renamed from: R */
    public int f955R;

    /* JADX INFO: renamed from: S */
    public int f956S;

    /* JADX INFO: renamed from: T */
    public int f957T;

    /* JADX INFO: renamed from: U */
    public WeakReference f958U;

    /* JADX INFO: renamed from: V */
    public WeakReference f959V;

    /* JADX INFO: renamed from: W */
    public final ArrayList f960W;

    /* JADX INFO: renamed from: X */
    public VelocityTracker f961X;

    /* JADX INFO: renamed from: Y */
    public int f962Y;

    /* JADX INFO: renamed from: Z */
    public int f963Z;

    /* JADX INFO: renamed from: a */
    public final int f964a;

    /* JADX INFO: renamed from: a0 */
    public boolean f965a0;

    /* JADX INFO: renamed from: b */
    public boolean f966b;

    /* JADX INFO: renamed from: b0 */
    public HashMap f967b0;

    /* JADX INFO: renamed from: c */
    public final float f968c;

    /* JADX INFO: renamed from: c0 */
    public final SparseIntArray f969c0;

    /* JADX INFO: renamed from: d */
    public final int f970d;

    /* JADX INFO: renamed from: d0 */
    public final C0095c8 f971d0;

    /* JADX INFO: renamed from: e */
    public int f972e;

    /* JADX INFO: renamed from: f */
    public boolean f973f;

    /* JADX INFO: renamed from: g */
    public int f974g;

    /* JADX INFO: renamed from: h */
    public final int f975h;

    /* JADX INFO: renamed from: i */
    public final C0350iu f976i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f977j;

    /* JADX INFO: renamed from: k */
    public final int f978k;

    /* JADX INFO: renamed from: l */
    public final int f979l;

    /* JADX INFO: renamed from: m */
    public int f980m;

    /* JADX INFO: renamed from: n */
    public final boolean f981n;

    /* JADX INFO: renamed from: o */
    public final boolean f982o;

    /* JADX INFO: renamed from: p */
    public final boolean f983p;

    /* JADX INFO: renamed from: q */
    public final boolean f984q;

    /* JADX INFO: renamed from: r */
    public final boolean f985r;

    /* JADX INFO: renamed from: s */
    public final boolean f986s;

    /* JADX INFO: renamed from: t */
    public final boolean f987t;

    /* JADX INFO: renamed from: u */
    public final boolean f988u;

    /* JADX INFO: renamed from: v */
    public int f989v;

    /* JADX INFO: renamed from: w */
    public int f990w;

    /* JADX INFO: renamed from: x */
    public final boolean f991x;

    /* JADX INFO: renamed from: y */
    public final m30 f992y;

    /* JADX INFO: renamed from: z */
    public boolean f993z;

    public BottomSheetBehavior() {
        this.f964a = 0;
        this.f966b = true;
        this.f978k = -1;
        this.f979l = -1;
        this.f938A = new C0178e8(this);
        this.f943F = 0.5f;
        this.f945H = -1.0f;
        this.f948K = true;
        this.f949L = 4;
        this.f954Q = 0.1f;
        this.f960W = new ArrayList();
        this.f963Z = -1;
        this.f969c0 = new SparseIntArray();
        this.f971d0 = new C0095c8(this, 0);
    }

    /* JADX INFO: renamed from: v */
    public static View m671v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        if (da0.m898p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM671v = m671v(viewGroup.getChildAt(i));
            if (viewM671v != null) {
                return viewM671v;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static int m672w(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: A */
    public final void m673A(int i) {
        if (i == -1) {
            if (this.f973f) {
                return;
            } else {
                this.f973f = true;
            }
        } else {
            if (!this.f973f && this.f972e == i) {
                return;
            }
            this.f973f = false;
            this.f972e = Math.max(0, i);
        }
        m681I();
    }

    /* JADX INFO: renamed from: B */
    public final void m674B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(g40.m1149l(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f946I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f966b && m690y(i) <= this.f941D) ? 3 : i;
        WeakReference weakReference = this.f958U;
        if (weakReference == null || weakReference.get() == null) {
            m675C(i);
            return;
        }
        View view = (View) this.f958U.get();
        RunnableC0917y4 runnableC0917y4 = new RunnableC0917y4(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = oa0.f3426a;
            if (aa0.m39b(view)) {
                view.post(runnableC0917y4);
                return;
            }
        }
        runnableC0917y4.run();
    }

    /* JADX INFO: renamed from: C */
    public final void m675C(int i) {
        if (this.f949L == i) {
            return;
        }
        this.f949L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f946I;
        }
        WeakReference weakReference = this.f958U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m680H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m680H(false);
        }
        m679G(i, true);
        ArrayList arrayList = this.f960W;
        if (arrayList.size() <= 0) {
            m678F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m676D(View view, float f) {
        if (this.f947J) {
            return true;
        }
        if (view.getTop() < this.f944G) {
            return false;
        }
        return Math.abs(((f * this.f954Q) + ((float) view.getTop())) - ((float) this.f944G)) / ((float) m687t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m675C(2);
        m679G(r4, true);
        r2.f938A.m970a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m2280o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m677E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.m690y(r4)
            ra0 r1 = r2.f950M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.m2280o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f4107r = r3
            r3 = -1
            r1.f4092c = r3
            r3 = 0
            boolean r3 = r1.m2273h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f4090a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f4107r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f4107r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.m675C(r3)
            r3 = 1
            r2.m679G(r4, r3)
            e8 r3 = r2.f938A
            r3.m970a(r4)
            return
        L40:
            r2.m675C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m677E(android.view.View, int, boolean):void");
    }

    /* JADX INFO: renamed from: F */
    public final void m678F() {
        View view;
        int iM1348a;
        WeakReference weakReference = this.f958U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        oa0.m2009i(view, 524288);
        oa0.m2007g(view, 0);
        oa0.m2009i(view, 262144);
        oa0.m2007g(view, 0);
        oa0.m2009i(view, 1048576);
        oa0.m2007g(view, 0);
        SparseIntArray sparseIntArray = this.f969c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            oa0.m2009i(view, i);
            oa0.m2007g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f966b && this.f949L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0209f2 c0209f2 = new C0209f2(this, 6);
            ArrayList arrayListM2005e = oa0.m2005e(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListM2005e.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = oa0.f3429d;
                        if (i3 >= iArr.length || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListM2005e.size(); i6++) {
                            z &= ((C0281h0) arrayListM2005e.get(i6)).m1348a() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iM1348a = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0281h0) arrayListM2005e.get(i2)).f2076a).getLabel())) {
                        iM1348a = ((C0281h0) arrayListM2005e.get(i2)).m1348a();
                        break;
                    }
                    i2++;
                }
            }
            if (iM1348a != -1) {
                C0281h0 c0281h0 = new C0281h0(null, iM1348a, string, c0209f2, null);
                View.AccessibilityDelegate accessibilityDelegateM2003c = oa0.m2003c(view);
                C0875x c0875x = accessibilityDelegateM2003c == null ? null : accessibilityDelegateM2003c instanceof C0800v ? ((C0800v) accessibilityDelegateM2003c).f4870a : new C0875x(accessibilityDelegateM2003c);
                if (c0875x == null) {
                    c0875x = new C0875x();
                }
                oa0.m2012l(view, c0875x);
                oa0.m2009i(view, c0281h0.m1348a());
                oa0.m2005e(view).add(c0281h0);
                oa0.m2007g(view, 0);
            }
            sparseIntArray.put(0, iM1348a);
        }
        if (this.f946I && this.f949L != 5) {
            oa0.m2010j(view, C0281h0.f2073j, new C0209f2(this, 5));
        }
        int i7 = this.f949L;
        if (i7 == 3) {
            oa0.m2010j(view, C0281h0.f2072i, new C0209f2(this, this.f966b ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            oa0.m2010j(view, C0281h0.f2071h, new C0209f2(this, this.f966b ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            oa0.m2010j(view, C0281h0.f2072i, new C0209f2(this, 4));
            oa0.m2010j(view, C0281h0.f2071h, new C0209f2(this, 3));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m679G(int i, boolean z) {
        C0350iu c0350iu;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f949L == 3 && (this.f991x || m691z());
        if (this.f993z == z2 || (c0350iu = this.f976i) == null) {
            return;
        }
        this.f993z = z2;
        ValueAnimator valueAnimator = this.f939B;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c0350iu.f2585a.f2274i, z2 ? m686s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM686s = this.f993z ? m686s() : 1.0f;
        C0311hu c0311hu = c0350iu.f2585a;
        if (c0311hu.f2274i != fM686s) {
            c0311hu.f2274i = fM686s;
            c0350iu.f2589e = true;
            c0350iu.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m680H(boolean z) {
        WeakReference weakReference = this.f958U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f967b0 != null) {
                    return;
                } else {
                    this.f967b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f958U.get() && z) {
                    this.f967b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f967b0 = null;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m681I() {
        View view;
        if (this.f958U != null) {
            m685r();
            if (this.f949L != 4 || (view = (View) this.f958U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: c */
    public final void mo682c(C0015ae c0015ae) {
        this.f958U = null;
        this.f950M = null;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: e */
    public final void mo683e() {
        this.f958U = null;
        this.f950M = null;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: f */
    public final boolean mo654f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        ra0 ra0Var;
        if (!view.isShown() || !this.f948K) {
            this.f951N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f962Y = -1;
            this.f963Z = -1;
            VelocityTracker velocityTracker = this.f961X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f961X = null;
            }
        }
        if (this.f961X == null) {
            this.f961X = VelocityTracker.obtain();
        }
        this.f961X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f963Z = (int) motionEvent.getY();
            if (this.f949L != 2) {
                WeakReference weakReference = this.f959V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m207o(view2, x, this.f963Z)) {
                    this.f962Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f965a0 = true;
                }
            }
            this.f951N = this.f962Y == -1 && !coordinatorLayout.m207o(view, x, this.f963Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f965a0 = false;
            this.f962Y = -1;
            if (this.f951N) {
                this.f951N = false;
                return false;
            }
        }
        if (this.f951N || (ra0Var = this.f950M) == null || !ra0Var.m2281p(motionEvent)) {
            WeakReference weakReference2 = this.f959V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f951N || this.f949L == 1 || coordinatorLayout.m207o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f950M == null || (i = this.f963Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.f950M.f4091b) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: g */
    public final boolean mo655g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = oa0.f3426a;
        int i2 = 1;
        if (x90.m2654b(coordinatorLayout) && !x90.m2654b(view)) {
            view.setFitsSystemWindows(true);
        }
        boolean z = false;
        if (this.f958U == null) {
            this.f974g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            boolean z2 = (i3 < 29 || this.f981n || this.f973f) ? false : true;
            if (this.f982o || this.f983p || this.f984q || this.f986s || this.f987t || this.f988u || z2) {
                C0059b8 c0059b8 = new C0059b8(this, z2);
                int iM2734f = y90.m2734f(view);
                view.getPaddingTop();
                int iM2733e = y90.m2733e(view);
                int paddingBottom = view.getPaddingBottom();
                fb0 fb0Var = new fb0();
                fb0Var.f1786a = iM2734f;
                fb0Var.f1787b = iM2733e;
                fb0Var.f1788c = paddingBottom;
                da0.m903u(view, new C0138d4(c0059b8, fb0Var, 20, z));
                if (aa0.m39b(view)) {
                    ba0.m506c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0038ao(i2));
                }
            }
            C0407kd c0407kd = new C0407kd(view);
            if (i3 >= 30) {
                view.setWindowInsetsAnimationCallback(new ic0(c0407kd));
            } else {
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener gc0Var = new gc0(view, c0407kd);
                view.setTag(R.id.tag_window_insets_animation_callback, gc0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(gc0Var);
                }
            }
            this.f958U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0274gu.m1303F(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0834vx.m2579b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0274gu.m1302E(context, R.attr.motionDurationMedium2, 300);
            AbstractC0274gu.m1302E(context, R.attr.motionDurationShort3, 150);
            AbstractC0274gu.m1302E(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C0350iu c0350iu = this.f976i;
            if (c0350iu != null) {
                x90.m2669q(view, c0350iu);
                float fM891i = this.f945H;
                if (fM891i == -1.0f) {
                    fM891i = da0.m891i(view);
                }
                c0350iu.m1536i(fM891i);
            } else {
                ColorStateList colorStateList = this.f977j;
                if (colorStateList != null) {
                    da0.m899q(view, colorStateList);
                }
            }
            m678F();
            if (x90.m2655c(view) == 0) {
                x90.m2671s(view, 1);
            }
        }
        if (this.f950M == null) {
            this.f950M = new ra0(coordinatorLayout.getContext(), coordinatorLayout, this.f971d0);
        }
        int top = view.getTop();
        coordinatorLayout.m209q(view, i);
        this.f956S = coordinatorLayout.getWidth();
        this.f957T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f955R = height;
        int iMin = this.f957T;
        int i4 = iMin - height;
        int i5 = this.f990w;
        if (i4 < i5) {
            boolean z3 = this.f985r;
            int i6 = this.f979l;
            if (z3) {
                if (i6 != -1) {
                    iMin = Math.min(iMin, i6);
                }
                this.f955R = iMin;
            } else {
                int iMin2 = iMin - i5;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.f955R = iMin2;
            }
        }
        this.f941D = Math.max(0, this.f957T - this.f955R);
        this.f942E = (int) ((1.0f - this.f943F) * this.f957T);
        m685r();
        int i7 = this.f949L;
        if (i7 == 3) {
            view.offsetTopAndBottom(m689x());
        } else if (i7 == 6) {
            view.offsetTopAndBottom(this.f942E);
        } else if (this.f946I && i7 == 5) {
            view.offsetTopAndBottom(this.f957T);
        } else if (i7 == 4) {
            view.offsetTopAndBottom(this.f944G);
        } else if (i7 == 1 || i7 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m679G(this.f949L, false);
        this.f959V = new WeakReference(m671v(view));
        ArrayList arrayList = this.f960W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: h */
    public final boolean mo656h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m672w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f978k, marginLayoutParams.width), m672w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f979l, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: i */
    public final boolean mo684i(View view) {
        WeakReference weakReference = this.f959V;
        return (weakReference == null || view != weakReference.get() || this.f949L == 3) ? false : true;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: j */
    public final void mo657j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f959V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.f948K;
        if (i2 > 0) {
            if (i4 < m689x()) {
                int iM689x = top - m689x();
                iArr[1] = iM689x;
                int i5 = -iM689x;
                WeakHashMap weakHashMap = oa0.f3426a;
                view.offsetTopAndBottom(i5);
                m675C(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = oa0.f3426a;
                view.offsetTopAndBottom(-i2);
                m675C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f944G;
            if (i4 > i6 && !this.f946I) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = oa0.f3426a;
                view.offsetTopAndBottom(i8);
                m675C(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = oa0.f3426a;
                view.offsetTopAndBottom(-i2);
                m675C(1);
            }
        }
        m688u(view.getTop());
        this.f952O = i2;
        this.f953P = true;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: m */
    public final void mo659m(View view, Parcelable parcelable) {
        C0142d8 c0142d8 = (C0142d8) parcelable;
        int i = this.f964a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f972e = c0142d8.f1330d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f966b = c0142d8.f1331e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f946I = c0142d8.f1332f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f947J = c0142d8.f1333g;
            }
        }
        int i2 = c0142d8.f1329c;
        if (i2 == 1 || i2 == 2) {
            this.f949L = 4;
        } else {
            this.f949L = i2;
        }
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: n */
    public final Parcelable mo660n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C0142d8(this);
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: o */
    public final boolean mo661o(View view, int i, int i2) {
        this.f952O = 0;
        this.f953P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo662p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.m689x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.m675C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f959V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f953P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f952O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f966b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f942E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f946I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f961X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f968c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f961X
            int r0 = r3.f962Y
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.m676D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f952O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f966b
            if (r2 == 0) goto L74
            int r6 = r3.f941D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f944G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f942E
            if (r5 >= r2) goto L83
            int r0 = r3.f944G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f944G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f966b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f942E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f944G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.m677E(r4, r1, r5)
            r3.f953P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo662p(android.view.View, android.view.View, int):void");
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: q */
    public final boolean mo663q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f949L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ra0 ra0Var = this.f950M;
        if (ra0Var != null && (this.f948K || i == 1)) {
            ra0Var.m2275j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f962Y = -1;
            this.f963Z = -1;
            VelocityTracker velocityTracker = this.f961X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f961X = null;
            }
        }
        if (this.f961X == null) {
            this.f961X = VelocityTracker.obtain();
        }
        this.f961X.addMovement(motionEvent);
        if (this.f950M != null && ((this.f948K || this.f949L == 1) && actionMasked == 2 && !this.f951N)) {
            float fAbs = Math.abs(this.f963Z - motionEvent.getY());
            ra0 ra0Var2 = this.f950M;
            if (fAbs > ra0Var2.f4091b) {
                ra0Var2.m2267b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f951N;
    }

    /* JADX INFO: renamed from: r */
    public final void m685r() {
        int iM687t = m687t();
        if (this.f966b) {
            this.f944G = Math.max(this.f957T - iM687t, this.f941D);
        } else {
            this.f944G = this.f957T - iM687t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m686s() {
        /*
            r5 = this;
            iu r0 = r5.f976i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f958U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f958U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.m691z()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            iu r2 = r5.f976i
            hu r3 = r2.f2585a
            m30 r3 = r3.f2266a
            ee r3 = r3.f3065e
            android.graphics.RectF r2 = r2.m1533f()
            float r2 = r3.mo943a(r2)
            android.view.RoundedCorner r3 = p000.AbstractC0957z7.m2806i(r0)
            if (r3 == 0) goto L4e
            int r3 = p000.AbstractC0957z7.m2800c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            iu r2 = r5.f976i
            hu r4 = r2.f2585a
            m30 r4 = r4.f2266a
            ee r4 = r4.f3066f
            android.graphics.RectF r2 = r2.m1533f()
            float r2 = r4.mo943a(r2)
            android.view.RoundedCorner r0 = p000.AbstractC0957z7.m2817t(r0)
            if (r0 == 0) goto L74
            int r0 = p000.AbstractC0957z7.m2800c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m686s():float");
    }

    /* JADX INFO: renamed from: t */
    public final int m687t() {
        int i;
        return this.f973f ? Math.min(Math.max(this.f974g, this.f957T - ((this.f956S * 9) / 16)), this.f955R) + this.f989v : (this.f981n || this.f982o || (i = this.f980m) <= 0) ? this.f972e + this.f989v : Math.max(this.f972e, i + this.f975h);
    }

    /* JADX INFO: renamed from: u */
    public final void m688u(int i) {
        if (((View) this.f958U.get()) != null) {
            ArrayList arrayList = this.f960W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f944G;
            if (i <= i2 && i2 != m689x()) {
                m689x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m689x() {
        if (this.f966b) {
            return this.f941D;
        }
        return Math.max(this.f940C, this.f985r ? 0 : this.f990w);
    }

    /* JADX INFO: renamed from: y */
    public final int m690y(int i) {
        if (i == 3) {
            return m689x();
        }
        if (i == 4) {
            return this.f944G;
        }
        if (i == 5) {
            return this.f957T;
        }
        if (i == 6) {
            return this.f942E;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m691z() {
        WeakReference weakReference = this.f958U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f958U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.f964a = 0;
        this.f966b = true;
        this.f978k = -1;
        this.f979l = -1;
        this.f938A = new C0178e8(this);
        this.f943F = 0.5f;
        this.f945H = -1.0f;
        this.f948K = true;
        this.f949L = 4;
        this.f954Q = 0.1f;
        this.f960W = new ArrayList();
        this.f963Z = -1;
        this.f969c0 = new SparseIntArray();
        this.f971d0 = new C0095c8(this, i2);
        this.f975h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1438a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f977j = AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f992y = m30.m1799b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m1731a();
        }
        m30 m30Var = this.f992y;
        if (m30Var != null) {
            C0350iu c0350iu = new C0350iu(m30Var);
            this.f976i = c0350iu;
            c0350iu.m1535h(context);
            ColorStateList colorStateList = this.f977j;
            if (colorStateList != null) {
                this.f976i.m1537j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f976i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m686s(), 1.0f);
        this.f939B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f939B.addUpdateListener(new C0009a8(i2, this));
        this.f945H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f978k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f979l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m673A(i);
        } else {
            m673A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f946I != z) {
            this.f946I = z;
            if (!z && this.f949L == 5) {
                m674B(4);
            }
            m678F();
        }
        this.f981n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f966b != z2) {
            this.f966b = z2;
            if (this.f958U != null) {
                m685r();
            }
            m675C((this.f966b && this.f949L == 6) ? 3 : this.f949L);
            m679G(this.f949L, true);
            m678F();
        }
        this.f947J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f948K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f964a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f943F = f;
            if (this.f958U != null) {
                this.f942E = (int) ((1.0f - f) * this.f957T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.f940C = i3;
                    m679G(this.f949L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f940C = dimensionPixelOffset;
                    m679G(this.f949L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f970d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f982o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f983p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f984q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f985r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f986s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f987t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f988u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f991x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f968c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: k */
    public final void mo658k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
