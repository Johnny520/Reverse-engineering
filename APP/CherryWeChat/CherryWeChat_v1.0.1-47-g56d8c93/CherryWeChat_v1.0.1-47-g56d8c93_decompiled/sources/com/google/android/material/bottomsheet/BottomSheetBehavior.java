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
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
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
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000.AbstractC0213Ey;
import p000.AbstractC0706Qb;
import p000.AbstractC0714Qj;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1360eE;
import p000.AbstractC2185lE;
import p000.AbstractC2374ph;
import p000.C0299Gy;
import p000.C0307H5;
import p000.C0602O;
import p000.C0645P;
import p000.C0728Qx;
import p000.C0834Tb;
import p000.C0902V;
import p000.C0935Vq;
import p000.C0994X5;
import p000.C1021Xq;
import p000.C1037Y5;
import p000.C1080Z5;
import p000.C1124a6;
import p000.C1204b6;
import p000.C1512hr;
import p000.C2228mE;
import p000.C2358pF;
import p000.C2409qF;
import p000.C2712xb;
import p000.RunnableC1482h4;
import p000.ViewOnApplyWindowInsetsListenerC2315oF;
import p000.ViewOnAttachStateChangeListenerC0488LE;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0706Qb {

    /* JADX INFO: renamed from: A */
    public final C1204b6 f4409A;

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f4410B;

    /* JADX INFO: renamed from: C */
    public final int f4411C;

    /* JADX INFO: renamed from: D */
    public int f4412D;

    /* JADX INFO: renamed from: E */
    public int f4413E;

    /* JADX INFO: renamed from: F */
    public final float f4414F;

    /* JADX INFO: renamed from: G */
    public int f4415G;

    /* JADX INFO: renamed from: H */
    public final float f4416H;

    /* JADX INFO: renamed from: I */
    public boolean f4417I;

    /* JADX INFO: renamed from: J */
    public boolean f4418J;

    /* JADX INFO: renamed from: K */
    public final boolean f4419K;

    /* JADX INFO: renamed from: L */
    public final boolean f4420L;

    /* JADX INFO: renamed from: M */
    public boolean f4421M;

    /* JADX INFO: renamed from: N */
    public int f4422N;

    /* JADX INFO: renamed from: O */
    public C2228mE f4423O;

    /* JADX INFO: renamed from: P */
    public boolean f4424P;

    /* JADX INFO: renamed from: Q */
    public int f4425Q;

    /* JADX INFO: renamed from: R */
    public boolean f4426R;

    /* JADX INFO: renamed from: S */
    public final float f4427S;

    /* JADX INFO: renamed from: T */
    public int f4428T;

    /* JADX INFO: renamed from: U */
    public int f4429U;

    /* JADX INFO: renamed from: V */
    public int f4430V;

    /* JADX INFO: renamed from: W */
    public WeakReference f4431W;

    /* JADX INFO: renamed from: X */
    public WeakReference f4432X;

    /* JADX INFO: renamed from: Y */
    public final ArrayList f4433Y;

    /* JADX INFO: renamed from: Z */
    public VelocityTracker f4434Z;

    /* JADX INFO: renamed from: a */
    public final int f4435a;

    /* JADX INFO: renamed from: a0 */
    public int f4436a0;

    /* JADX INFO: renamed from: b */
    public boolean f4437b;

    /* JADX INFO: renamed from: b0 */
    public int f4438b0;

    /* JADX INFO: renamed from: c */
    public final float f4439c;

    /* JADX INFO: renamed from: c0 */
    public boolean f4440c0;

    /* JADX INFO: renamed from: d */
    public final int f4441d;

    /* JADX INFO: renamed from: d0 */
    public HashMap f4442d0;

    /* JADX INFO: renamed from: e */
    public int f4443e;

    /* JADX INFO: renamed from: e0 */
    public final SparseIntArray f4444e0;

    /* JADX INFO: renamed from: f */
    public boolean f4445f;

    /* JADX INFO: renamed from: f0 */
    public final C1080Z5 f4446f0;

    /* JADX INFO: renamed from: g */
    public int f4447g;

    /* JADX INFO: renamed from: h */
    public final int f4448h;

    /* JADX INFO: renamed from: i */
    public final C1021Xq f4449i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f4450j;

    /* JADX INFO: renamed from: k */
    public final int f4451k;

    /* JADX INFO: renamed from: l */
    public final int f4452l;

    /* JADX INFO: renamed from: m */
    public int f4453m;

    /* JADX INFO: renamed from: n */
    public final boolean f4454n;

    /* JADX INFO: renamed from: o */
    public final boolean f4455o;

    /* JADX INFO: renamed from: p */
    public final boolean f4456p;

    /* JADX INFO: renamed from: q */
    public final boolean f4457q;

    /* JADX INFO: renamed from: r */
    public final boolean f4458r;

    /* JADX INFO: renamed from: s */
    public final boolean f4459s;

    /* JADX INFO: renamed from: t */
    public final boolean f4460t;

    /* JADX INFO: renamed from: u */
    public final boolean f4461u;

    /* JADX INFO: renamed from: v */
    public int f4462v;

    /* JADX INFO: renamed from: w */
    public int f4463w;

    /* JADX INFO: renamed from: x */
    public final boolean f4464x;

    /* JADX INFO: renamed from: y */
    public final C0728Qx f4465y;

    /* JADX INFO: renamed from: z */
    public boolean f4466z;

    public BottomSheetBehavior() {
        this.f4435a = 0;
        this.f4437b = true;
        this.f4451k = -1;
        this.f4452l = -1;
        this.f4409A = new C1204b6(this);
        this.f4414F = 0.5f;
        this.f4416H = -1.0f;
        this.f4419K = true;
        this.f4420L = true;
        this.f4422N = 4;
        this.f4427S = 0.1f;
        this.f4433Y = new ArrayList();
        this.f4438b0 = -1;
        this.f4444e0 = new SparseIntArray();
        this.f4446f0 = new C1080Z5(this, 0);
    }

    /* JADX INFO: renamed from: v */
    public static View m2427v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM2427v = m2427v(viewGroup.getChildAt(i));
            if (viewM2427v != null) {
                return viewM2427v;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static int m2428w(int i, int i2, int i3, int i4) {
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
    public final void m2429A(int i) {
        if (i == -1) {
            if (this.f4445f) {
                return;
            } else {
                this.f4445f = true;
            }
        } else {
            if (!this.f4445f && this.f4443e == i) {
                return;
            }
            this.f4445f = false;
            this.f4443e = Math.max(0, i);
        }
        m2437I();
    }

    /* JADX INFO: renamed from: B */
    public final void m2430B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0213Ey.m410h(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.f4417I || i != 5) {
            int i2 = (i == 6 && this.f4437b && m2443y(i) <= this.f4412D) ? 3 : i;
            WeakReference weakReference = this.f4431W;
            if (weakReference == null || weakReference.get() == null) {
                m2431C(i);
                return;
            }
            View view = (View) this.f4431W.get();
            RunnableC1482h4 runnableC1482h4 = new RunnableC1482h4(this, view, i2);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(runnableC1482h4);
            } else {
                runnableC1482h4.run();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2431C(int i) {
        if (this.f4422N == i) {
            return;
        }
        this.f4422N = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f4417I;
        }
        WeakReference weakReference = this.f4431W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m2436H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m2436H(false);
        }
        m2435G(i, true);
        ArrayList arrayList = this.f4433Y;
        if (arrayList.size() <= 0) {
            m2434F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2432D(View view, float f) {
        if (this.f4418J) {
            return true;
        }
        if (view.getTop() < this.f4415G) {
            return false;
        }
        return Math.abs(((f * this.f4427S) + ((float) view.getTop())) - ((float) this.f4415G)) / ((float) m2440t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m2431C(2);
        m2435G(r4, true);
        r2.f4409A.m2324a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m4499n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2433E(View view, int i, boolean z) {
        int iM2443y = m2443y(i);
        C2228mE c2228mE = this.f4423O;
        if (c2228mE != null) {
            if (!z) {
                int left = view.getLeft();
                c2228mE.f7766r = view;
                c2228mE.f7751c = -1;
                boolean zM4493h = c2228mE.m4493h(left, iM2443y, 0, 0);
                if (!zM4493h && c2228mE.f7749a == 0 && c2228mE.f7766r != null) {
                    c2228mE.f7766r = null;
                }
            }
        }
        m2431C(i);
    }

    /* JADX INFO: renamed from: F */
    public final void m2434F() {
        View view;
        int iM1752a;
        WeakReference weakReference = this.f4431W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2185lE.m4396i(view, 524288);
        AbstractC2185lE.m4393f(view, 0);
        AbstractC2185lE.m4396i(view, 262144);
        AbstractC2185lE.m4393f(view, 0);
        AbstractC2185lE.m4396i(view, 1048576);
        AbstractC2185lE.m4393f(view, 0);
        SparseIntArray sparseIntArray = this.f4444e0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC2185lE.m4396i(view, i);
            AbstractC2185lE.m4393f(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f4437b && this.f4422N != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0307H5 c0307h5 = new C0307H5(i, this);
            ArrayList arrayListM4391d = AbstractC2185lE.m4391d(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListM4391d.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = AbstractC2185lE.f7620d;
                        if (i3 >= 32 || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListM4391d.size(); i6++) {
                            z &= ((C0902V) arrayListM4391d.get(i6)).m1752a() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iM1752a = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0902V) arrayListM4391d.get(i2)).f2810a).getLabel())) {
                        iM1752a = ((C0902V) arrayListM4391d.get(i2)).m1752a();
                        break;
                    }
                    i2++;
                }
            }
            if (iM1752a != -1) {
                C0902V c0902v = new C0902V(null, iM1752a, string, c0307h5, null);
                View.AccessibilityDelegate accessibilityDelegateM4390c = AbstractC2185lE.m4390c(view);
                C0645P c0645p = accessibilityDelegateM4390c == null ? null : accessibilityDelegateM4390c instanceof C0602O ? ((C0602O) accessibilityDelegateM4390c).f1942a : new C0645P(accessibilityDelegateM4390c);
                if (c0645p == null) {
                    c0645p = new C0645P();
                }
                AbstractC2185lE.m4399l(view, c0645p);
                AbstractC2185lE.m4396i(view, c0902v.m1752a());
                AbstractC2185lE.m4391d(view).add(c0902v);
                AbstractC2185lE.m4393f(view, 0);
            }
            sparseIntArray.put(0, iM1752a);
        }
        if (this.f4417I) {
            int i7 = 5;
            if (this.f4422N != 5) {
                AbstractC2185lE.m4397j(view, C0902V.f2807j, new C0307H5(i7, this));
            }
        }
        int i8 = this.f4422N;
        int i9 = 4;
        int i10 = 3;
        if (i8 == 3) {
            AbstractC2185lE.m4397j(view, C0902V.f2806i, new C0307H5(this.f4437b ? 4 : 6, this));
            return;
        }
        if (i8 == 4) {
            AbstractC2185lE.m4397j(view, C0902V.f2805h, new C0307H5(this.f4437b ? 3 : 6, this));
        } else {
            if (i8 != 6) {
                return;
            }
            AbstractC2185lE.m4397j(view, C0902V.f2806i, new C0307H5(i9, this));
            AbstractC2185lE.m4397j(view, C0902V.f2805h, new C0307H5(i10, this));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m2435G(int i, boolean z) {
        C1021Xq c1021Xq;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f4422N == 3 && (this.f4464x || m2444z());
        if (this.f4466z == z2 || (c1021Xq = this.f4449i) == null) {
            return;
        }
        this.f4466z = z2;
        ValueAnimator valueAnimator = this.f4410B;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c1021Xq.f3241b.f2911j, z2 ? m2439s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM2439s = this.f4466z ? m2439s() : 1.0f;
        C0935Vq c0935Vq = c1021Xq.f3241b;
        if (c0935Vq.f2911j != fM2439s) {
            c0935Vq.f2911j = fM2439s;
            c1021Xq.f3245f = true;
            c1021Xq.f3246g = true;
            c1021Xq.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2436H(boolean z) {
        WeakReference weakReference = this.f4431W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f4442d0 != null) {
                    return;
                } else {
                    this.f4442d0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f4431W.get() && z) {
                    this.f4442d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f4442d0 = null;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m2437I() {
        View view;
        if (this.f4431W != null) {
            m2438r();
            if (this.f4422N != 4 || (view = (View) this.f4431W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: c */
    public final void mo1455c(C0834Tb c0834Tb) {
        this.f4431W = null;
        this.f4423O = null;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: e */
    public final void mo1457e() {
        this.f4431W = null;
        this.f4423O = null;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    public final boolean mo1458f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C2228mE c2228mE;
        if (!view.isShown() || !this.f4419K) {
            this.f4424P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4436a0 = -1;
            this.f4438b0 = -1;
            VelocityTracker velocityTracker = this.f4434Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4434Z = null;
            }
        }
        if (this.f4434Z == null) {
            this.f4434Z = VelocityTracker.obtain();
        }
        this.f4434Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.f4438b0 = y;
            if (this.f4422N != 2) {
                WeakReference weakReference = this.f4432X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m2138n(view2, x, y)) {
                    this.f4436a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f4440c0 = true;
                }
            }
            this.f4424P = this.f4436a0 == -1 && !coordinatorLayout.m2138n(view, x, this.f4438b0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4440c0 = false;
            this.f4436a0 = -1;
            if (this.f4424P) {
                this.f4424P = false;
                return false;
            }
        }
        if (this.f4424P || (c2228mE = this.f4423O) == null || !c2228mE.m4500o(motionEvent)) {
            WeakReference weakReference2 = this.f4432X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f4424P || this.f4422N == 1 || coordinatorLayout.m2138n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f4423O == null || (i = this.f4438b0) == -1 || Math.abs(i - motionEvent.getY()) <= this.f4423O.f7750b) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 5;
        if (this.f4431W == null) {
            this.f4447g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            boolean z = (i3 < 29 || this.f4454n || this.f4445f) ? false : true;
            if (this.f4455o || this.f4456p || this.f4457q || this.f4459s || this.f4460t || this.f4461u || z) {
                C1037Y5 c1037y5 = new C1037Y5(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C1512hr c1512hr = new C1512hr();
                c1512hr.f5354a = paddingStart;
                c1512hr.f5355b = paddingEnd;
                c1512hr.f5356c = paddingBottom;
                C0299Gy c0299Gy = new C0299Gy(i2, c1037y5, c1512hr);
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                AbstractC1360eE.m2640l(view, c0299Gy);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0488LE());
                }
            }
            C2712xb c2712xb = new C2712xb(view);
            WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
            if (i3 >= 30) {
                view.setWindowInsetsAnimationCallback(new C2409qF(c2712xb));
            } else {
                PathInterpolator pathInterpolator = C2358pF.f8245e;
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC2315oF = new ViewOnApplyWindowInsetsListenerC2315oF(view, c2712xb);
                view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC2315oF);
                if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC2315oF);
                }
            }
            this.f4431W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC0714Qj.m1473D(context, R.attr.motionDurationMedium2, 300);
            AbstractC0714Qj.m1473D(context, R.attr.motionDurationShort3, 150);
            AbstractC0714Qj.m1473D(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C1021Xq c1021Xq = this.f4449i;
            if (c1021Xq != null) {
                view.setBackground(c1021Xq);
                float elevation = this.f4416H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c1021Xq.m1927m(elevation);
            } else {
                ColorStateList colorStateList = this.f4450j;
                if (colorStateList != null) {
                    AbstractC1360eE.m2637i(view, colorStateList);
                }
            }
            m2434F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f4423O == null) {
            this.f4423O = new C2228mE(coordinatorLayout.getContext(), coordinatorLayout, this.f4446f0);
        }
        int top = view.getTop();
        coordinatorLayout.m2140p(view, i);
        this.f4429U = coordinatorLayout.getWidth();
        this.f4430V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f4428T = height;
        int iMin = this.f4430V;
        int i4 = iMin - height;
        int i5 = this.f4463w;
        if (i4 < i5) {
            boolean z2 = this.f4458r;
            int i6 = this.f4452l;
            if (z2) {
                if (i6 != -1) {
                    iMin = Math.min(iMin, i6);
                }
                this.f4428T = iMin;
            } else {
                int iMin2 = iMin - i5;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.f4428T = iMin2;
            }
        }
        this.f4412D = Math.max(0, this.f4430V - this.f4428T);
        this.f4413E = (int) ((1.0f - this.f4414F) * this.f4430V);
        m2438r();
        int i7 = this.f4422N;
        if (i7 == 3) {
            int iM2442x = m2442x();
            WeakHashMap weakHashMap3 = AbstractC2185lE.f7617a;
            view.offsetTopAndBottom(iM2442x);
        } else if (i7 == 6) {
            int i8 = this.f4413E;
            WeakHashMap weakHashMap4 = AbstractC2185lE.f7617a;
            view.offsetTopAndBottom(i8);
        } else if (this.f4417I && i7 == 5) {
            int i9 = this.f4430V;
            WeakHashMap weakHashMap5 = AbstractC2185lE.f7617a;
            view.offsetTopAndBottom(i9);
        } else if (i7 == 4) {
            int i10 = this.f4415G;
            WeakHashMap weakHashMap6 = AbstractC2185lE.f7617a;
            view.offsetTopAndBottom(i10);
        } else if (i7 == 1 || i7 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap7 = AbstractC2185lE.f7617a;
            view.offsetTopAndBottom(top2);
        }
        m2435G(this.f4422N, false);
        this.f4432X = new WeakReference(m2427v(view));
        ArrayList arrayList = this.f4433Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: h */
    public final boolean mo1460h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m2428w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f4451k, marginLayoutParams.width), m2428w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f4452l, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: i */
    public final boolean mo1461i(View view) {
        WeakReference weakReference = this.f4432X;
        return (weakReference == null || view != weakReference.get() || this.f4422N == 3 || this.f4421M) ? false : true;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: j */
    public final void mo1462j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f4432X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.f4419K;
        boolean z2 = this.f4420L;
        if (i2 > 0) {
            if (!this.f4426R && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                this.f4421M = true;
                return;
            }
            if (i4 < m2442x()) {
                int iM2442x = top - m2442x();
                iArr[1] = iM2442x;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                view.offsetTopAndBottom(-iM2442x);
                m2431C(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
                view.offsetTopAndBottom(-i2);
                m2431C(1);
            }
        } else if (i2 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.f4426R && !z2 && view2 == view3 && zCanScrollVertically) {
                this.f4421M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i5 = this.f4415G;
                if (i4 > i5 && !this.f4417I) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    WeakHashMap weakHashMap3 = AbstractC2185lE.f7617a;
                    view.offsetTopAndBottom(-i6);
                    m2431C(4);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap4 = AbstractC2185lE.f7617a;
                    view.offsetTopAndBottom(-i2);
                    m2431C(1);
                }
            }
        }
        m2441u(view.getTop());
        this.f4425Q = i2;
        this.f4426R = true;
        this.f4421M = false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: k */
    public final void mo1463k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: m */
    public final void mo1465m(View view, Parcelable parcelable) {
        C1124a6 c1124a6 = (C1124a6) parcelable;
        int i = this.f4435a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f4443e = c1124a6.f3538d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f4437b = c1124a6.f3539e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f4417I = c1124a6.f3540f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f4418J = c1124a6.f3541g;
            }
        }
        int i2 = c1124a6.f3537c;
        if (i2 == 1 || i2 == 2) {
            this.f4422N = 4;
        } else {
            this.f4422N = i2;
        }
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1466n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C1124a6(this);
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: o */
    public final boolean mo1467o(View view, int i, int i2) {
        this.f4425Q = 0;
        this.f4426R = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1468p(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == m2442x()) {
            m2431C(3);
            return;
        }
        WeakReference weakReference = this.f4432X;
        if (weakReference != null && view2 == weakReference.get() && this.f4426R) {
            if (this.f4425Q > 0) {
                if (!this.f4437b && view.getTop() > this.f4413E) {
                    i2 = 6;
                }
            } else if (this.f4417I) {
                VelocityTracker velocityTracker = this.f4434Z;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f4439c);
                    yVelocity = this.f4434Z.getYVelocity(this.f4436a0);
                }
                if (m2432D(view, yVelocity)) {
                    i2 = 5;
                }
            } else if (this.f4425Q == 0) {
                int top = view.getTop();
                if (!this.f4437b) {
                    int i3 = this.f4413E;
                    if (top < i3) {
                        if (top >= Math.abs(top - this.f4415G)) {
                        }
                    } else if (Math.abs(top - i3) < Math.abs(top - this.f4415G)) {
                    }
                    i2 = 6;
                } else if (Math.abs(top - this.f4412D) >= Math.abs(top - this.f4415G)) {
                    i2 = 4;
                }
            } else {
                if (!this.f4437b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f4413E) < Math.abs(top2 - this.f4415G)) {
                    }
                }
                i2 = 4;
            }
            m2433E(view, i2, false);
            this.f4426R = false;
        }
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: q */
    public final boolean mo1469q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f4422N;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C2228mE c2228mE = this.f4423O;
        if (c2228mE != null && (this.f4419K || i == 1)) {
            c2228mE.m4494i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f4436a0 = -1;
            this.f4438b0 = -1;
            VelocityTracker velocityTracker = this.f4434Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4434Z = null;
            }
        }
        if (this.f4434Z == null) {
            this.f4434Z = VelocityTracker.obtain();
        }
        this.f4434Z.addMovement(motionEvent);
        if (this.f4423O != null && ((this.f4419K || this.f4422N == 1) && actionMasked == 2 && !this.f4424P)) {
            float fAbs = Math.abs(this.f4438b0 - motionEvent.getY());
            C2228mE c2228mE2 = this.f4423O;
            if (fAbs > c2228mE2.f7750b) {
                c2228mE2.m4487b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f4424P;
    }

    /* JADX INFO: renamed from: r */
    public final void m2438r() {
        int iM2440t = m2440t();
        if (this.f4437b) {
            this.f4415G = Math.max(this.f4430V - iM2440t, this.f4412D);
        } else {
            this.f4415G = this.f4430V - iM2440t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m2439s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.f4449i != null && (weakReference = this.f4431W) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f4431W.get();
            if (m2444z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                C1021Xq c1021Xq = this.f4449i;
                float[] fArr = c1021Xq.f3237B;
                float fMo1563a = fArr != null ? fArr[3] : c1021Xq.f3241b.f2902a.f2328e.mo1563a(c1021Xq.m1921g());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    f = (radius <= 0.0f || fMo1563a <= 0.0f) ? 0.0f : radius / fMo1563a;
                }
                C1021Xq c1021Xq2 = this.f4449i;
                float[] fArr2 = c1021Xq2.f3237B;
                float fMo1563a2 = fArr2 != null ? fArr2[0] : c1021Xq2.f3241b.f2902a.f2329f.mo1563a(c1021Xq2.m1921g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo1563a2 > 0.0f) {
                        f2 = radius2 / fMo1563a2;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: t */
    public final int m2440t() {
        int i;
        return this.f4445f ? Math.min(Math.max(this.f4447g, this.f4430V - ((this.f4429U * 9) / 16)), this.f4428T) + this.f4462v : (this.f4454n || this.f4455o || (i = this.f4453m) <= 0) ? this.f4443e + this.f4462v : Math.max(this.f4443e, i + this.f4448h);
    }

    /* JADX INFO: renamed from: u */
    public final void m2441u(int i) {
        if (((View) this.f4431W.get()) != null) {
            ArrayList arrayList = this.f4433Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f4415G;
            if (i <= i2 && i2 != m2442x()) {
                m2442x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m2442x() {
        if (this.f4437b) {
            return this.f4412D;
        }
        return Math.max(this.f4411C, this.f4458r ? 0 : this.f4463w);
    }

    /* JADX INFO: renamed from: y */
    public final int m2443y(int i) {
        if (i == 3) {
            return m2442x();
        }
        if (i == 4) {
            return this.f4415G;
        }
        if (i == 5) {
            return this.f4430V;
        }
        if (i == 6) {
            return this.f4413E;
        }
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Invalid state to get top offset: "));
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2444z() {
        WeakReference weakReference = this.f4431W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f4431W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.f4435a = 0;
        this.f4437b = true;
        this.f4451k = -1;
        this.f4452l = -1;
        this.f4409A = new C1204b6(this);
        this.f4414F = 0.5f;
        this.f4416H = -1.0f;
        this.f4419K = true;
        this.f4420L = true;
        this.f4422N = 4;
        this.f4427S = 0.1f;
        this.f4433Y = new ArrayList();
        this.f4438b0 = -1;
        this.f4444e0 = new SparseIntArray();
        this.f4446f0 = new C1080Z5(this, i2);
        this.f4448h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2932a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f4450j = AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f4465y = C0728Qx.m1512b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m1383a();
        }
        C0728Qx c0728Qx = this.f4465y;
        if (c0728Qx != null) {
            C1021Xq c1021Xq = new C1021Xq(c0728Qx);
            this.f4449i = c1021Xq;
            c1021Xq.m1925k(context);
            ColorStateList colorStateList = this.f4450j;
            if (colorStateList != null) {
                this.f4449i.m1928n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f4449i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m2439s(), 1.0f);
        this.f4410B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f4410B.addUpdateListener(new C0994X5(i2, this));
        this.f4416H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f4451k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f4452l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m2429A(i);
        } else {
            m2429A(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.f4417I != z) {
            this.f4417I = z;
            if (!z && this.f4422N == 5) {
                m2430B(4);
            }
            m2434F();
        }
        this.f4454n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.f4437b != z2) {
            this.f4437b = z2;
            if (this.f4431W != null) {
                m2438r();
            }
            m2431C((this.f4437b && this.f4422N == 6) ? 3 : this.f4422N);
            m2435G(this.f4422N, true);
            m2434F();
        }
        this.f4418J = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f4419K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f4420L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f4435a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f4414F = f;
            if (this.f4431W != null) {
                this.f4413E = (int) ((1.0f - f) * this.f4430V);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.f4411C = i3;
                    m2435G(this.f4422N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f4411C = dimensionPixelOffset;
                    m2435G(this.f4422N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f4441d = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.f4455o = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f4456p = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f4457q = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.f4458r = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.f4459s = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f4460t = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f4461u = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f4464x = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f4439c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
