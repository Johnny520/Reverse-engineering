package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC0628Oj;
import p000.AbstractC0706Qb;
import p000.AbstractC0714Qj;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1360eE;
import p000.AbstractC1492hE;
import p000.AbstractC2185lE;
import p000.AbstractC2374ph;
import p000.C0417Jn;
import p000.C0685Px;
import p000.C0728Qx;
import p000.C0834Tb;
import p000.C0902V;
import p000.C1021Xq;
import p000.C1080Z5;
import p000.C1204b6;
import p000.C2228mE;
import p000.C2254my;
import p000.C2436r;
import p000.InterfaceC2123k0;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0706Qb {

    /* JADX INFO: renamed from: a */
    public AbstractC0628Oj f4562a;

    /* JADX INFO: renamed from: b */
    public final C1021Xq f4563b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f4564c;

    /* JADX INFO: renamed from: d */
    public final C0728Qx f4565d;

    /* JADX INFO: renamed from: e */
    public final C1204b6 f4566e;

    /* JADX INFO: renamed from: f */
    public final float f4567f;

    /* JADX INFO: renamed from: g */
    public final boolean f4568g;

    /* JADX INFO: renamed from: h */
    public int f4569h;

    /* JADX INFO: renamed from: i */
    public C2228mE f4570i;

    /* JADX INFO: renamed from: j */
    public boolean f4571j;

    /* JADX INFO: renamed from: k */
    public final float f4572k;

    /* JADX INFO: renamed from: l */
    public int f4573l;

    /* JADX INFO: renamed from: m */
    public int f4574m;

    /* JADX INFO: renamed from: n */
    public int f4575n;

    /* JADX INFO: renamed from: o */
    public int f4576o;

    /* JADX INFO: renamed from: p */
    public WeakReference f4577p;

    /* JADX INFO: renamed from: q */
    public WeakReference f4578q;

    /* JADX INFO: renamed from: r */
    public final int f4579r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f4580s;

    /* JADX INFO: renamed from: t */
    public int f4581t;

    /* JADX INFO: renamed from: u */
    public final LinkedHashSet f4582u;

    /* JADX INFO: renamed from: v */
    public final C1080Z5 f4583v;

    public SideSheetBehavior() {
        this.f4566e = new C1204b6(this);
        this.f4568g = true;
        this.f4569h = 5;
        this.f4572k = 0.1f;
        this.f4579r = -1;
        this.f4582u = new LinkedHashSet();
        this.f4583v = new C1080Z5(this, 1);
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: c */
    public final void mo1455c(C0834Tb c0834Tb) {
        this.f4577p = null;
        this.f4570i = null;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: e */
    public final void mo1457e() {
        this.f4577p = null;
        this.f4570i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1458f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C2228mE c2228mE;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            if (AbstractC1492hE.m2850a(view) != null) {
                if (this.f4568g) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 && (velocityTracker = this.f4580s) != null) {
                        velocityTracker.recycle();
                        this.f4580s = null;
                    }
                    if (this.f4580s == null) {
                        this.f4580s = VelocityTracker.obtain();
                    }
                    this.f4580s.addMovement(motionEvent);
                    if (actionMasked == 0) {
                        this.f4581t = (int) motionEvent.getX();
                    } else if ((actionMasked == 1 || actionMasked == 3) && this.f4571j) {
                        this.f4571j = false;
                        return false;
                    }
                    return (this.f4571j || (c2228mE = this.f4570i) == null || !c2228mE.m4500o(motionEvent)) ? false : true;
                }
            }
        }
        this.f4571j = true;
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f4577p;
        C1021Xq c1021Xq = this.f4563b;
        int iMo876w = 0;
        if (weakReference == null) {
            this.f4577p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC0714Qj.m1473D(context, R.attr.motionDurationMedium2, 300);
            AbstractC0714Qj.m1473D(context, R.attr.motionDurationShort3, 150);
            AbstractC0714Qj.m1473D(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c1021Xq != null) {
                view.setBackground(c1021Xq);
                float elevation = this.f4567f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c1021Xq.m1927m(elevation);
            } else {
                ColorStateList colorStateList = this.f4564c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                    AbstractC1360eE.m2637i(view, colorStateList);
                }
            }
            int i4 = this.f4569h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            m2471u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
            if (AbstractC1492hE.m2850a(view) == null) {
                AbstractC2185lE.m4400m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((C0834Tb) view.getLayoutParams()).f2647c, i) == 3 ? 1 : 0;
        AbstractC0628Oj abstractC0628Oj = this.f4562a;
        if (abstractC0628Oj == null || abstractC0628Oj.mo878z() != i5) {
            C0834Tb c0834Tb = null;
            C0728Qx c0728Qx = this.f4565d;
            if (i5 == 0) {
                this.f4562a = new C0417Jn(this, i3);
                if (c0728Qx != null) {
                    WeakReference weakReference2 = this.f4577p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C0834Tb)) {
                        c0834Tb = (C0834Tb) view3.getLayoutParams();
                    }
                    if (c0834Tb == null || ((ViewGroup.MarginLayoutParams) c0834Tb).rightMargin <= 0) {
                        C0685Px c0685PxM1516f = c0728Qx.m1516f();
                        c0685PxM1516f.f2197f = new C2436r(0.0f);
                        c0685PxM1516f.f2198g = new C2436r(0.0f);
                        C0728Qx c0728QxM1383a = c0685PxM1516f.m1383a();
                        if (c1021Xq != null) {
                            c1021Xq.setShapeAppearanceModel(c0728QxM1383a);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(AbstractC2374ph.m4813j(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f4562a = new C0417Jn(this, iMo876w);
                if (c0728Qx != null) {
                    WeakReference weakReference3 = this.f4577p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C0834Tb)) {
                        c0834Tb = (C0834Tb) view2.getLayoutParams();
                    }
                    if (c0834Tb == null || ((ViewGroup.MarginLayoutParams) c0834Tb).leftMargin <= 0) {
                        C0685Px c0685PxM1516f2 = c0728Qx.m1516f();
                        c0685PxM1516f2.f2196e = new C2436r(0.0f);
                        c0685PxM1516f2.f2199h = new C2436r(0.0f);
                        C0728Qx c0728QxM1383a2 = c0685PxM1516f2.m1383a();
                        if (c1021Xq != null) {
                            c1021Xq.setShapeAppearanceModel(c0728QxM1383a2);
                        }
                    }
                }
            }
        }
        if (this.f4570i == null) {
            this.f4570i = new C2228mE(coordinatorLayout.getContext(), coordinatorLayout, this.f4583v);
        }
        int iMo876w2 = this.f4562a.mo876w(view);
        coordinatorLayout.m2140p(view, i);
        this.f4574m = coordinatorLayout.getWidth();
        this.f4575n = this.f4562a.mo877x(coordinatorLayout);
        this.f4573l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f4576o = marginLayoutParams != null ? this.f4562a.mo870d(marginLayoutParams) : 0;
        int i6 = this.f4569h;
        if (i6 == 1 || i6 == 2) {
            iMo876w = iMo876w2 - this.f4562a.mo876w(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f4569h);
            }
            iMo876w = this.f4562a.mo873r();
        }
        WeakHashMap weakHashMap3 = AbstractC2185lE.f7617a;
        view.offsetLeftAndRight(iMo876w);
        if (this.f4578q == null && (i2 = this.f4579r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f4578q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f4582u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: h */
    public final boolean mo1460h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: m */
    public final void mo1465m(View view, Parcelable parcelable) {
        int i = ((C2254my) parcelable).f7965c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f4569h = i;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1466n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C2254my(this);
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: q */
    public final boolean mo1469q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4569h == 1 && actionMasked == 0) {
            return true;
        }
        if (m2469s()) {
            this.f4570i.m4494i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f4580s) != null) {
            velocityTracker.recycle();
            this.f4580s = null;
        }
        if (this.f4580s == null) {
            this.f4580s = VelocityTracker.obtain();
        }
        this.f4580s.addMovement(motionEvent);
        if (m2469s() && actionMasked == 2 && !this.f4571j && m2469s()) {
            float fAbs = Math.abs(this.f4581t - motionEvent.getX());
            C2228mE c2228mE = this.f4570i;
            if (fAbs > c2228mE.f7750b) {
                c2228mE.m4487b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f4571j;
    }

    /* JADX INFO: renamed from: r */
    public final void m2468r(int i) {
        View view;
        if (this.f4569h == i) {
            return;
        }
        this.f4569h = i;
        WeakReference weakReference = this.f4577p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f4569h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f4582u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m2471u();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2469s() {
        if (this.f4570i != null) {
            return this.f4568g || this.f4569h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m4499n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m2468r(2);
        r2.f4566e.m2324a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2470t(View view, int i, boolean z) {
        int iMo872q;
        if (i == 3) {
            iMo872q = this.f4562a.mo872q();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Invalid state to get outer edge offset: "));
            }
            iMo872q = this.f4562a.mo873r();
        }
        C2228mE c2228mE = this.f4570i;
        if (c2228mE != null) {
            if (!z) {
                int top = view.getTop();
                c2228mE.f7766r = view;
                c2228mE.f7751c = -1;
                boolean zM4493h = c2228mE.m4493h(iMo872q, top, 0, 0);
                if (!zM4493h && c2228mE.f7749a == 0 && c2228mE.f7766r != null) {
                    c2228mE.f7766r = null;
                }
            }
        }
        m2468r(i);
    }

    /* JADX INFO: renamed from: u */
    public final void m2471u() {
        View view;
        WeakReference weakReference = this.f4577p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2185lE.m4396i(view, 262144);
        AbstractC2185lE.m4393f(view, 0);
        AbstractC2185lE.m4396i(view, 1048576);
        AbstractC2185lE.m4393f(view, 0);
        final int i = 5;
        if (this.f4569h != 5) {
            AbstractC2185lE.m4397j(view, C0902V.f2807j, new InterfaceC2123k0() { // from class: ly
                @Override // p000.InterfaceC2123k0
                public final boolean perform(View view2, AbstractC1241c0 abstractC1241c0) {
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(AbstractC0213Ey.m410h(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f7698a;
                    WeakReference weakReference2 = sideSheetBehavior.f4577p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m2468r(i2);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f4577p.get();
                    RunnableC2371pe runnableC2371pe = new RunnableC2371pe(i2, 2, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(runnableC2371pe);
                        return true;
                    }
                    runnableC2371pe.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f4569h != 3) {
            AbstractC2185lE.m4397j(view, C0902V.f2805h, new InterfaceC2123k0() { // from class: ly
                @Override // p000.InterfaceC2123k0
                public final boolean perform(View view2, AbstractC1241c0 abstractC1241c0) {
                    int i22 = i2;
                    if (i22 == 1 || i22 == 2) {
                        throw new IllegalArgumentException(AbstractC0213Ey.m410h(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f7698a;
                    WeakReference weakReference2 = sideSheetBehavior.f4577p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m2468r(i22);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f4577p.get();
                    RunnableC2371pe runnableC2371pe = new RunnableC2371pe(i22, 2, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(runnableC2371pe);
                        return true;
                    }
                    runnableC2371pe.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f4566e = new C1204b6(this);
        this.f4568g = true;
        this.f4569h = 5;
        this.f4572k = 0.1f;
        this.f4579r = -1;
        this.f4582u = new LinkedHashSet();
        this.f4583v = new C1080Z5(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2957z);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f4564c = AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f4565d = C0728Qx.m1512b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m1383a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f4579r = resourceId;
            WeakReference weakReference = this.f4578q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f4578q = null;
            WeakReference weakReference2 = this.f4577p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        C0728Qx c0728Qx = this.f4565d;
        if (c0728Qx != null) {
            C1021Xq c1021Xq = new C1021Xq(c0728Qx);
            this.f4563b = c1021Xq;
            c1021Xq.m1925k(context);
            ColorStateList colorStateList = this.f4564c;
            if (colorStateList != null) {
                this.f4563b.m1928n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f4563b.setTint(typedValue.data);
            }
        }
        this.f4567f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f4568g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
