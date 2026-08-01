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
import p000.AbstractC0126ct;
import p000.AbstractC0538nx;
import p000.AbstractC0852wd;
import p000.AbstractC0873wy;
import p000.C0014ad;
import p000.C0138d4;
import p000.C0163du;
import p000.C0200eu;
import p000.C0209f2;
import p000.C0281h0;
import p000.C0624q7;
import p000.C0661r7;
import p000.C0698s7;
import p000.C0735t7;
import p000.C0772u7;
import p000.C0801v;
import p000.C0875x;
import p000.C0963zd;
import p000.RunnableC0917y4;
import p000.ViewOnAttachStateChangeListenerC0862wn;
import p000.ab0;
import p000.bc0;
import p000.dc0;
import p000.f30;
import p000.ja0;
import p000.ma0;
import p000.s90;
import p000.t90;
import p000.v90;
import p000.w90;
import p000.y90;
import p000.z30;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0852wd {

    /* JADX INFO: renamed from: A */
    public final C0772u7 f1013A;

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f1014B;

    /* JADX INFO: renamed from: C */
    public final int f1015C;

    /* JADX INFO: renamed from: D */
    public int f1016D;

    /* JADX INFO: renamed from: E */
    public int f1017E;

    /* JADX INFO: renamed from: F */
    public final float f1018F;

    /* JADX INFO: renamed from: G */
    public int f1019G;

    /* JADX INFO: renamed from: H */
    public final float f1020H;

    /* JADX INFO: renamed from: I */
    public boolean f1021I;

    /* JADX INFO: renamed from: J */
    public boolean f1022J;

    /* JADX INFO: renamed from: K */
    public final boolean f1023K;

    /* JADX INFO: renamed from: L */
    public int f1024L;

    /* JADX INFO: renamed from: M */
    public ma0 f1025M;

    /* JADX INFO: renamed from: N */
    public boolean f1026N;

    /* JADX INFO: renamed from: O */
    public int f1027O;

    /* JADX INFO: renamed from: P */
    public boolean f1028P;

    /* JADX INFO: renamed from: Q */
    public final float f1029Q;

    /* JADX INFO: renamed from: R */
    public int f1030R;

    /* JADX INFO: renamed from: S */
    public int f1031S;

    /* JADX INFO: renamed from: T */
    public int f1032T;

    /* JADX INFO: renamed from: U */
    public WeakReference f1033U;

    /* JADX INFO: renamed from: V */
    public WeakReference f1034V;

    /* JADX INFO: renamed from: W */
    public final ArrayList f1035W;

    /* JADX INFO: renamed from: X */
    public VelocityTracker f1036X;

    /* JADX INFO: renamed from: Y */
    public int f1037Y;

    /* JADX INFO: renamed from: Z */
    public int f1038Z;

    /* JADX INFO: renamed from: a */
    public final int f1039a;

    /* JADX INFO: renamed from: a0 */
    public boolean f1040a0;

    /* JADX INFO: renamed from: b */
    public boolean f1041b;

    /* JADX INFO: renamed from: b0 */
    public HashMap f1042b0;

    /* JADX INFO: renamed from: c */
    public final float f1043c;

    /* JADX INFO: renamed from: c0 */
    public final SparseIntArray f1044c0;

    /* JADX INFO: renamed from: d */
    public final int f1045d;

    /* JADX INFO: renamed from: d0 */
    public final C0698s7 f1046d0;

    /* JADX INFO: renamed from: e */
    public int f1047e;

    /* JADX INFO: renamed from: f */
    public boolean f1048f;

    /* JADX INFO: renamed from: g */
    public int f1049g;

    /* JADX INFO: renamed from: h */
    public final int f1050h;

    /* JADX INFO: renamed from: i */
    public final C0200eu f1051i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f1052j;

    /* JADX INFO: renamed from: k */
    public final int f1053k;

    /* JADX INFO: renamed from: l */
    public final int f1054l;

    /* JADX INFO: renamed from: m */
    public int f1055m;

    /* JADX INFO: renamed from: n */
    public final boolean f1056n;

    /* JADX INFO: renamed from: o */
    public final boolean f1057o;

    /* JADX INFO: renamed from: p */
    public final boolean f1058p;

    /* JADX INFO: renamed from: q */
    public final boolean f1059q;

    /* JADX INFO: renamed from: r */
    public final boolean f1060r;

    /* JADX INFO: renamed from: s */
    public final boolean f1061s;

    /* JADX INFO: renamed from: t */
    public final boolean f1062t;

    /* JADX INFO: renamed from: u */
    public final boolean f1063u;

    /* JADX INFO: renamed from: v */
    public int f1064v;

    /* JADX INFO: renamed from: w */
    public int f1065w;

    /* JADX INFO: renamed from: x */
    public final boolean f1066x;

    /* JADX INFO: renamed from: y */
    public final f30 f1067y;

    /* JADX INFO: renamed from: z */
    public boolean f1068z;

    public BottomSheetBehavior() {
        this.f1039a = 0;
        this.f1041b = true;
        this.f1053k = -1;
        this.f1054l = -1;
        this.f1013A = new C0772u7(this);
        this.f1018F = 0.5f;
        this.f1020H = -1.0f;
        this.f1023K = true;
        this.f1024L = 4;
        this.f1029Q = 0.1f;
        this.f1035W = new ArrayList();
        this.f1038Z = -1;
        this.f1044c0 = new SparseIntArray();
        this.f1046d0 = new C0698s7(this, 0);
    }

    /* JADX INFO: renamed from: v */
    public static View m713v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        if (y90.m2670p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM713v = m713v(viewGroup.getChildAt(i));
            if (viewM713v != null) {
                return viewM713v;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static int m714w(int i, int i2, int i3, int i4) {
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
    public final void m715A(int i) {
        if (i == -1) {
            if (this.f1048f) {
                return;
            } else {
                this.f1048f = true;
            }
        } else {
            if (!this.f1048f && this.f1047e == i) {
                return;
            }
            this.f1048f = false;
            this.f1047e = Math.max(0, i);
        }
        m723I();
    }

    /* JADX INFO: renamed from: B */
    public final void m716B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(z30.m2767l(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f1021I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f1041b && m732y(i) <= this.f1016D) ? 3 : i;
        WeakReference weakReference = this.f1033U;
        if (weakReference == null || weakReference.get() == null) {
            m717C(i);
            return;
        }
        View view = (View) this.f1033U.get();
        RunnableC0917y4 runnableC0917y4 = new RunnableC0917y4(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = ja0.f2600a;
            if (v90.m2495b(view)) {
                view.post(runnableC0917y4);
                return;
            }
        }
        runnableC0917y4.run();
    }

    /* JADX INFO: renamed from: C */
    public final void m717C(int i) {
        if (this.f1024L == i) {
            return;
        }
        this.f1024L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f1021I;
        }
        WeakReference weakReference = this.f1033U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m722H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m722H(false);
        }
        m721G(i, true);
        ArrayList arrayList = this.f1035W;
        if (arrayList.size() <= 0) {
            m720F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m718D(View view, float f) {
        if (this.f1022J) {
            return true;
        }
        if (view.getTop() < this.f1019G) {
            return false;
        }
        return Math.abs(((f * this.f1029Q) + ((float) view.getTop())) - ((float) this.f1019G)) / ((float) m729t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m717C(2);
        m721G(r4, true);
        r2.f1013A.m2425a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m1815o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m719E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.m732y(r4)
            ma0 r1 = r2.f1025M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.m1815o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f3181r = r3
            r3 = -1
            r1.f3166c = r3
            r3 = 0
            boolean r3 = r1.m1808h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f3164a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f3181r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f3181r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.m717C(r3)
            r3 = 1
            r2.m721G(r4, r3)
            u7 r3 = r2.f1013A
            r3.m2425a(r4)
            return
        L40:
            r2.m717C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m719E(android.view.View, int, boolean):void");
    }

    /* JADX INFO: renamed from: F */
    public final void m720F() {
        View view;
        int iM1335a;
        WeakReference weakReference = this.f1033U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ja0.m1572i(view, 524288);
        ja0.m1570g(view, 0);
        ja0.m1572i(view, 262144);
        ja0.m1570g(view, 0);
        ja0.m1572i(view, 1048576);
        ja0.m1570g(view, 0);
        SparseIntArray sparseIntArray = this.f1044c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            ja0.m1572i(view, i);
            ja0.m1570g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f1041b && this.f1024L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0209f2 c0209f2 = new C0209f2(this, 6);
            ArrayList arrayListM1568e = ja0.m1568e(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListM1568e.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = ja0.f2603d;
                        if (i3 >= iArr.length || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListM1568e.size(); i6++) {
                            z &= ((C0281h0) arrayListM1568e.get(i6)).m1335a() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iM1335a = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0281h0) arrayListM1568e.get(i2)).f2188a).getLabel())) {
                        iM1335a = ((C0281h0) arrayListM1568e.get(i2)).m1335a();
                        break;
                    }
                    i2++;
                }
            }
            if (iM1335a != -1) {
                C0281h0 c0281h0 = new C0281h0(null, iM1335a, string, c0209f2, null);
                View.AccessibilityDelegate accessibilityDelegateM1566c = ja0.m1566c(view);
                C0875x c0875x = accessibilityDelegateM1566c == null ? null : accessibilityDelegateM1566c instanceof C0801v ? ((C0801v) accessibilityDelegateM1566c).f4784a : new C0875x(accessibilityDelegateM1566c);
                if (c0875x == null) {
                    c0875x = new C0875x();
                }
                ja0.m1575l(view, c0875x);
                ja0.m1572i(view, c0281h0.m1335a());
                ja0.m1568e(view).add(c0281h0);
                ja0.m1570g(view, 0);
            }
            sparseIntArray.put(0, iM1335a);
        }
        if (this.f1021I && this.f1024L != 5) {
            ja0.m1573j(view, C0281h0.f2185j, new C0209f2(this, 5));
        }
        int i7 = this.f1024L;
        if (i7 == 3) {
            ja0.m1573j(view, C0281h0.f2184i, new C0209f2(this, this.f1041b ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            ja0.m1573j(view, C0281h0.f2183h, new C0209f2(this, this.f1041b ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            ja0.m1573j(view, C0281h0.f2184i, new C0209f2(this, 4));
            ja0.m1573j(view, C0281h0.f2183h, new C0209f2(this, 3));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m721G(int i, boolean z) {
        C0200eu c0200eu;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f1024L == 3 && (this.f1066x || m733z());
        if (this.f1068z == z2 || (c0200eu = this.f1051i) == null) {
            return;
        }
        this.f1068z = z2;
        ValueAnimator valueAnimator = this.f1014B;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c0200eu.f1842a.f1641i, z2 ? m728s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM728s = this.f1068z ? m728s() : 1.0f;
        C0163du c0163du = c0200eu.f1842a;
        if (c0163du.f1641i != fM728s) {
            c0163du.f1641i = fM728s;
            c0200eu.f1846e = true;
            c0200eu.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m722H(boolean z) {
        WeakReference weakReference = this.f1033U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f1042b0 != null) {
                    return;
                } else {
                    this.f1042b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f1033U.get() && z) {
                    this.f1042b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f1042b0 = null;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m723I() {
        View view;
        if (this.f1033U != null) {
            m727r();
            if (this.f1024L != 4 || (view = (View) this.f1033U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: c */
    public final void mo724c(C0963zd c0963zd) {
        this.f1033U = null;
        this.f1025M = null;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: e */
    public final void mo725e() {
        this.f1033U = null;
        this.f1025M = null;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: f */
    public final boolean mo696f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        ma0 ma0Var;
        if (!view.isShown() || !this.f1023K) {
            this.f1026N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1037Y = -1;
            this.f1038Z = -1;
            VelocityTracker velocityTracker = this.f1036X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1036X = null;
            }
        }
        if (this.f1036X == null) {
            this.f1036X = VelocityTracker.obtain();
        }
        this.f1036X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f1038Z = (int) motionEvent.getY();
            if (this.f1024L != 2) {
                WeakReference weakReference = this.f1034V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m222o(view2, x, this.f1038Z)) {
                    this.f1037Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1040a0 = true;
                }
            }
            this.f1026N = this.f1037Y == -1 && !coordinatorLayout.m222o(view, x, this.f1038Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1040a0 = false;
            this.f1037Y = -1;
            if (this.f1026N) {
                this.f1026N = false;
                return false;
            }
        }
        if (this.f1026N || (ma0Var = this.f1025M) == null || !ma0Var.m1816p(motionEvent)) {
            WeakReference weakReference2 = this.f1034V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f1026N || this.f1024L == 1 || coordinatorLayout.m222o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1025M == null || (i = this.f1038Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.f1025M.f3165b) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: g */
    public final boolean mo697g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = ja0.f2600a;
        int i2 = 1;
        if (s90.m2310b(coordinatorLayout) && !s90.m2310b(view)) {
            view.setFitsSystemWindows(true);
        }
        boolean z = false;
        if (this.f1033U == null) {
            this.f1049g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            boolean z2 = (i3 < 29 || this.f1056n || this.f1048f) ? false : true;
            if (this.f1057o || this.f1058p || this.f1059q || this.f1061s || this.f1062t || this.f1063u || z2) {
                C0661r7 c0661r7 = new C0661r7(this, z2);
                int iM2369f = t90.m2369f(view);
                view.getPaddingTop();
                int iM2368e = t90.m2368e(view);
                int paddingBottom = view.getPaddingBottom();
                ab0 ab0Var = new ab0();
                ab0Var.f102a = iM2369f;
                ab0Var.f103b = iM2368e;
                ab0Var.f104c = paddingBottom;
                y90.m2675u(view, new C0138d4(c0661r7, ab0Var, 20, z));
                if (v90.m2495b(view)) {
                    w90.m2552c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0862wn(i2));
                }
            }
            C0014ad c0014ad = new C0014ad(view);
            if (i3 >= 30) {
                view.setWindowInsetsAnimationCallback(new dc0(c0014ad));
            } else {
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener bc0Var = new bc0(view, c0014ad);
                view.setTag(R.id.tag_window_insets_animation_callback, bc0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(bc0Var);
                }
            }
            this.f1033U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0126ct.m825w(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0538nx.m1950b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0126ct.m824v(context, R.attr.motionDurationMedium2, 300);
            AbstractC0126ct.m824v(context, R.attr.motionDurationShort3, 150);
            AbstractC0126ct.m824v(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C0200eu c0200eu = this.f1051i;
            if (c0200eu != null) {
                s90.m2325q(view, c0200eu);
                float fM2663i = this.f1020H;
                if (fM2663i == -1.0f) {
                    fM2663i = y90.m2663i(view);
                }
                c0200eu.m1084i(fM2663i);
            } else {
                ColorStateList colorStateList = this.f1052j;
                if (colorStateList != null) {
                    y90.m2671q(view, colorStateList);
                }
            }
            m720F();
            if (s90.m2311c(view) == 0) {
                s90.m2327s(view, 1);
            }
        }
        if (this.f1025M == null) {
            this.f1025M = new ma0(coordinatorLayout.getContext(), coordinatorLayout, this.f1046d0);
        }
        int top = view.getTop();
        coordinatorLayout.m224q(view, i);
        this.f1031S = coordinatorLayout.getWidth();
        this.f1032T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1030R = height;
        int iMin = this.f1032T;
        int i4 = iMin - height;
        int i5 = this.f1065w;
        if (i4 < i5) {
            boolean z3 = this.f1060r;
            int i6 = this.f1054l;
            if (z3) {
                if (i6 != -1) {
                    iMin = Math.min(iMin, i6);
                }
                this.f1030R = iMin;
            } else {
                int iMin2 = iMin - i5;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.f1030R = iMin2;
            }
        }
        this.f1016D = Math.max(0, this.f1032T - this.f1030R);
        this.f1017E = (int) ((1.0f - this.f1018F) * this.f1032T);
        m727r();
        int i7 = this.f1024L;
        if (i7 == 3) {
            view.offsetTopAndBottom(m731x());
        } else if (i7 == 6) {
            view.offsetTopAndBottom(this.f1017E);
        } else if (this.f1021I && i7 == 5) {
            view.offsetTopAndBottom(this.f1032T);
        } else if (i7 == 4) {
            view.offsetTopAndBottom(this.f1019G);
        } else if (i7 == 1 || i7 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m721G(this.f1024L, false);
        this.f1034V = new WeakReference(m713v(view));
        ArrayList arrayList = this.f1035W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: h */
    public final boolean mo698h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m714w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f1053k, marginLayoutParams.width), m714w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1054l, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: i */
    public final boolean mo726i(View view) {
        WeakReference weakReference = this.f1034V;
        return (weakReference == null || view != weakReference.get() || this.f1024L == 3) ? false : true;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: j */
    public final void mo699j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f1034V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.f1023K;
        if (i2 > 0) {
            if (i4 < m731x()) {
                int iM731x = top - m731x();
                iArr[1] = iM731x;
                int i5 = -iM731x;
                WeakHashMap weakHashMap = ja0.f2600a;
                view.offsetTopAndBottom(i5);
                m717C(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = ja0.f2600a;
                view.offsetTopAndBottom(-i2);
                m717C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f1019G;
            if (i4 > i6 && !this.f1021I) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = ja0.f2600a;
                view.offsetTopAndBottom(i8);
                m717C(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = ja0.f2600a;
                view.offsetTopAndBottom(-i2);
                m717C(1);
            }
        }
        m730u(view.getTop());
        this.f1027O = i2;
        this.f1028P = true;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: m */
    public final void mo701m(View view, Parcelable parcelable) {
        C0735t7 c0735t7 = (C0735t7) parcelable;
        int i = this.f1039a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1047e = c0735t7.f4517d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1041b = c0735t7.f4518e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f1021I = c0735t7.f4519f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f1022J = c0735t7.f4520g;
            }
        }
        int i2 = c0735t7.f4516c;
        if (i2 == 1 || i2 == 2) {
            this.f1024L = 4;
        } else {
            this.f1024L = i2;
        }
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: n */
    public final Parcelable mo702n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C0735t7(this);
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: o */
    public final boolean mo703o(View view, int i, int i2) {
        this.f1027O = 0;
        this.f1028P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo704p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.m731x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.m717C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f1034V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f1028P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f1027O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f1041b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f1017E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f1021I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f1036X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f1043c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f1036X
            int r0 = r3.f1037Y
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.m718D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f1027O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f1041b
            if (r2 == 0) goto L74
            int r6 = r3.f1016D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f1019G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f1017E
            if (r5 >= r2) goto L83
            int r0 = r3.f1019G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f1019G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f1041b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f1017E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f1019G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.m719E(r4, r1, r5)
            r3.f1028P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo704p(android.view.View, android.view.View, int):void");
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: q */
    public final boolean mo705q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f1024L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ma0 ma0Var = this.f1025M;
        if (ma0Var != null && (this.f1023K || i == 1)) {
            ma0Var.m1810j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1037Y = -1;
            this.f1038Z = -1;
            VelocityTracker velocityTracker = this.f1036X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1036X = null;
            }
        }
        if (this.f1036X == null) {
            this.f1036X = VelocityTracker.obtain();
        }
        this.f1036X.addMovement(motionEvent);
        if (this.f1025M != null && ((this.f1023K || this.f1024L == 1) && actionMasked == 2 && !this.f1026N)) {
            float fAbs = Math.abs(this.f1038Z - motionEvent.getY());
            ma0 ma0Var2 = this.f1025M;
            if (fAbs > ma0Var2.f3165b) {
                ma0Var2.m1802b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1026N;
    }

    /* JADX INFO: renamed from: r */
    public final void m727r() {
        int iM729t = m729t();
        if (this.f1041b) {
            this.f1019G = Math.max(this.f1032T - iM729t, this.f1016D);
        } else {
            this.f1019G = this.f1032T - iM729t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m728s() {
        /*
            r5 = this;
            eu r0 = r5.f1051i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f1033U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f1033U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.m733z()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            eu r2 = r5.f1051i
            du r3 = r2.f1842a
            f30 r3 = r3.f1633a
            de r3 = r3.f1879e
            android.graphics.RectF r2 = r2.m1081f()
            float r2 = r3.mo940a(r2)
            android.view.RoundedCorner r3 = p000.AbstractC0587p7.m2054i(r0)
            if (r3 == 0) goto L4e
            int r3 = p000.AbstractC0587p7.m2048c(r3)
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
            eu r2 = r5.f1051i
            du r4 = r2.f1842a
            f30 r4 = r4.f1633a
            de r4 = r4.f1880f
            android.graphics.RectF r2 = r2.m1081f()
            float r2 = r4.mo940a(r2)
            android.view.RoundedCorner r0 = p000.AbstractC0587p7.m2065t(r0)
            if (r0 == 0) goto L74
            int r0 = p000.AbstractC0587p7.m2048c(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m728s():float");
    }

    /* JADX INFO: renamed from: t */
    public final int m729t() {
        int i;
        return this.f1048f ? Math.min(Math.max(this.f1049g, this.f1032T - ((this.f1031S * 9) / 16)), this.f1030R) + this.f1064v : (this.f1056n || this.f1057o || (i = this.f1055m) <= 0) ? this.f1047e + this.f1064v : Math.max(this.f1047e, i + this.f1050h);
    }

    /* JADX INFO: renamed from: u */
    public final void m730u(int i) {
        if (((View) this.f1033U.get()) != null) {
            ArrayList arrayList = this.f1035W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f1019G;
            if (i <= i2 && i2 != m731x()) {
                m731x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m731x() {
        if (this.f1041b) {
            return this.f1016D;
        }
        return Math.max(this.f1015C, this.f1060r ? 0 : this.f1065w);
    }

    /* JADX INFO: renamed from: y */
    public final int m732y(int i) {
        if (i == 3) {
            return m731x();
        }
        if (i == 4) {
            return this.f1019G;
        }
        if (i == 5) {
            return this.f1032T;
        }
        if (i == 6) {
            return this.f1017E;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m733z() {
        WeakReference weakReference = this.f1033U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f1033U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.f1039a = 0;
        this.f1041b = true;
        this.f1053k = -1;
        this.f1054l = -1;
        this.f1013A = new C0772u7(this);
        this.f1018F = 0.5f;
        this.f1020H = -1.0f;
        this.f1023K = true;
        this.f1024L = 4;
        this.f1029Q = 0.1f;
        this.f1035W = new ArrayList();
        this.f1038Z = -1;
        this.f1044c0 = new SparseIntArray();
        this.f1046d0 = new C0698s7(this, i2);
        this.f1050h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5042a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f1052j = AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f1067y = f30.m1136b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m982a();
        }
        f30 f30Var = this.f1067y;
        if (f30Var != null) {
            C0200eu c0200eu = new C0200eu(f30Var);
            this.f1051i = c0200eu;
            c0200eu.m1083h(context);
            ColorStateList colorStateList = this.f1052j;
            if (colorStateList != null) {
                this.f1051i.m1085j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1051i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m728s(), 1.0f);
        this.f1014B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f1014B.addUpdateListener(new C0624q7(i2, this));
        this.f1020H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f1053k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f1054l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m715A(i);
        } else {
            m715A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f1021I != z) {
            this.f1021I = z;
            if (!z && this.f1024L == 5) {
                m716B(4);
            }
            m720F();
        }
        this.f1056n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f1041b != z2) {
            this.f1041b = z2;
            if (this.f1033U != null) {
                m727r();
            }
            m717C((this.f1041b && this.f1024L == 6) ? 3 : this.f1024L);
            m721G(this.f1024L, true);
            m720F();
        }
        this.f1022J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f1023K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f1039a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f1018F = f;
            if (this.f1033U != null) {
                this.f1017E = (int) ((1.0f - f) * this.f1032T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.f1015C = i3;
                    m721G(this.f1024L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f1015C = dimensionPixelOffset;
                    m721G(this.f1024L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f1045d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f1057o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f1058p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f1059q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f1060r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f1061s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f1062t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f1063u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f1066x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f1043c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: k */
    public final void mo700k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
