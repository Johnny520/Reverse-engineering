package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0501a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p008E.C0151e;
import p008E.InterfaceC0166t;
import p010F.AbstractC0196a;
import p021L.C0245e;
import p034S.AbstractC0324d;
import p050c0.RunnableC0714z0;
import p056f0.AbstractC0805P;
import p058g0.AbstractC0942a;
import p068l0.C0979a;
import p078r.AbstractC1058a;
import p078r.C1061d;
import p089x0.C1117a;
import p089x0.C1123g;
import p089x0.C1126j;
import p089x0.C1127k;
import p090y0.C1139a;
import p090y0.C1141c;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC1058a {

    /* JADX INFO: renamed from: a */
    public AbstractC0805P f2409a;

    /* JADX INFO: renamed from: b */
    public final C1123g f2410b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f2411c;

    /* JADX INFO: renamed from: d */
    public final C1127k f2412d;

    /* JADX INFO: renamed from: e */
    public final C0501a f2413e;

    /* JADX INFO: renamed from: f */
    public final float f2414f;

    /* JADX INFO: renamed from: g */
    public final boolean f2415g;

    /* JADX INFO: renamed from: h */
    public int f2416h;

    /* JADX INFO: renamed from: i */
    public C0245e f2417i;

    /* JADX INFO: renamed from: j */
    public boolean f2418j;

    /* JADX INFO: renamed from: k */
    public final float f2419k;

    /* JADX INFO: renamed from: l */
    public int f2420l;

    /* JADX INFO: renamed from: m */
    public int f2421m;

    /* JADX INFO: renamed from: n */
    public int f2422n;

    /* JADX INFO: renamed from: o */
    public int f2423o;

    /* JADX INFO: renamed from: p */
    public WeakReference f2424p;

    /* JADX INFO: renamed from: q */
    public WeakReference f2425q;

    /* JADX INFO: renamed from: r */
    public final int f2426r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f2427s;

    /* JADX INFO: renamed from: t */
    public int f2428t;

    /* JADX INFO: renamed from: u */
    public final LinkedHashSet f2429u;

    /* JADX INFO: renamed from: v */
    public final C0979a f2430v;

    public SideSheetBehavior() {
        this.f2413e = new C0501a(this);
        this.f2415g = true;
        this.f2416h = 5;
        this.f2419k = 0.1f;
        this.f2426r = -1;
        this.f2429u = new LinkedHashSet();
        this.f2430v = new C0979a(this, 1);
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: c */
    public final void mo1843c(C1061d c1061d) {
        this.f2424p = null;
        this.f2417i = null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: e */
    public final void mo1844e() {
        this.f2424p = null;
        this.f2417i = null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: f */
    public final boolean mo1815f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0245e c0245e;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC0080Q.m283b(view) == null) || !this.f2415g) {
            this.f2418j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2427s) != null) {
            velocityTracker.recycle();
            this.f2427s = null;
        }
        if (this.f2427s == null) {
            this.f2427s = VelocityTracker.obtain();
        }
        this.f2427s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2428t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2418j) {
            this.f2418j = false;
            return false;
        }
        return (this.f2418j || (c0245e = this.f2417i) == null || !c0245e.m683o(motionEvent)) ? false : true;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View view2;
        View view3;
        int i3;
        View viewFindViewById;
        int iMo2079z = 0;
        int i4 = 1;
        C1123g c1123g = this.f2410b;
        Field field = AbstractC0080Q.f219a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2424p == null) {
            this.f2424p = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0805P.m2039S(context, C1031R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0196a.m567b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0805P.m2038R(context, C1031R.attr.motionDurationMedium2, 300);
            AbstractC0805P.m2038R(context, C1031R.attr.motionDurationShort3, 150);
            AbstractC0805P.m2038R(context, C1031R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C1031R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(C1031R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(C1031R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c1123g != null) {
                view.setBackground(c1123g);
                float fM219i = this.f2414f;
                if (fM219i == -1.0f) {
                    fM219i = AbstractC0070G.m219i(view);
                }
                c1123g.m2650j(fM219i);
            } else {
                ColorStateList colorStateList = this.f2411c;
                if (colorStateList != null) {
                    AbstractC0070G.m227q(view, colorStateList);
                }
            }
            int i5 = this.f2416h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            m1885u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC0080Q.m283b(view) == null) {
                AbstractC0080Q.m292k(view, view.getResources().getString(C1031R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C1061d) view.getLayoutParams()).f4066c, i2) == 3 ? 1 : 0;
        AbstractC0805P abstractC0805P = this.f2409a;
        if (abstractC0805P == null || abstractC0805P.mo2055B() != i6) {
            C1127k c1127k = this.f2412d;
            C1061d c1061d = null;
            if (i6 == 0) {
                this.f2409a = new C1139a(this, i4);
                if (c1127k != null) {
                    WeakReference weakReference = this.f2424p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C1061d)) {
                        c1061d = (C1061d) view3.getLayoutParams();
                    }
                    if (c1061d == null || ((ViewGroup.MarginLayoutParams) c1061d).rightMargin <= 0) {
                        C1126j c1126jM2660d = c1127k.m2660d();
                        c1126jM2660d.f4340f = new C1117a(0.0f);
                        c1126jM2660d.f4341g = new C1117a(0.0f);
                        C1127k c1127kM2656a = c1126jM2660d.m2656a();
                        if (c1123g != null) {
                            c1123g.setShapeAppearanceModel(c1127kM2656a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f2409a = new C1139a(this, iMo2079z);
                if (c1127k != null) {
                    WeakReference weakReference2 = this.f2424p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C1061d)) {
                        c1061d = (C1061d) view2.getLayoutParams();
                    }
                    if (c1061d == null || ((ViewGroup.MarginLayoutParams) c1061d).leftMargin <= 0) {
                        C1126j c1126jM2660d2 = c1127k.m2660d();
                        c1126jM2660d2.f4339e = new C1117a(0.0f);
                        c1126jM2660d2.f4342h = new C1117a(0.0f);
                        C1127k c1127kM2656a2 = c1126jM2660d2.m2656a();
                        if (c1123g != null) {
                            c1123g.setShapeAppearanceModel(c1127kM2656a2);
                        }
                    }
                }
            }
        }
        if (this.f2417i == null) {
            this.f2417i = new C0245e(coordinatorLayout.getContext(), coordinatorLayout, this.f2430v);
        }
        int iMo2079z2 = this.f2409a.mo2079z(view);
        coordinatorLayout.m1174p(view, i2);
        this.f2421m = coordinatorLayout.getWidth();
        this.f2422n = this.f2409a.mo2054A(coordinatorLayout);
        this.f2420l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2423o = marginLayoutParams != null ? this.f2409a.mo2065a(marginLayoutParams) : 0;
        int i7 = this.f2416h;
        if (i7 == 1 || i7 == 2) {
            iMo2079z = iMo2079z2 - this.f2409a.mo2079z(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f2416h);
            }
            iMo2079z = this.f2409a.mo2076v();
        }
        view.offsetLeftAndRight(iMo2079z);
        if (this.f2425q == null && (i3 = this.f2426r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f2425q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f2429u.iterator();
        while (it.hasNext()) {
            AbstractC0324d.m726i(it.next());
        }
        return true;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: h */
    public final boolean mo1817h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: m */
    public final void mo1820m(View view, Parcelable parcelable) {
        int i2 = ((C1141c) parcelable).f4402c;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.f2416h = i2;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1821n(View view) {
        return new C1141c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: q */
    public final boolean mo1824q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2416h == 1 && actionMasked == 0) {
            return true;
        }
        if (m1883s()) {
            this.f2417i.m677i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2427s) != null) {
            velocityTracker.recycle();
            this.f2427s = null;
        }
        if (this.f2427s == null) {
            this.f2427s = VelocityTracker.obtain();
        }
        this.f2427s.addMovement(motionEvent);
        if (m1883s() && actionMasked == 2 && !this.f2418j && m1883s()) {
            float fAbs = Math.abs(this.f2428t - motionEvent.getX());
            C0245e c0245e = this.f2417i;
            if (fAbs > c0245e.f504b) {
                c0245e.m670b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2418j;
    }

    /* JADX INFO: renamed from: r */
    public final void m1882r(int i2) {
        View view;
        if (this.f2416h == i2) {
            return;
        }
        this.f2416h = i2;
        WeakReference weakReference = this.f2424p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = this.f2416h == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
        Iterator it = this.f2429u.iterator();
        if (it.hasNext()) {
            AbstractC0324d.m726i(it.next());
            throw null;
        }
        m1885u();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1883s() {
        return this.f2417i != null && (this.f2415g || this.f2416h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m682n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m1882r(2);
        r2.f2413e.m1226c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1884t(View view, int i2, boolean z2) {
        int iMo2075u;
        if (i2 == 3) {
            iMo2075u = this.f2409a.mo2075u();
        } else {
            if (i2 != 5) {
                throw new IllegalArgumentException(AbstractC0324d.m720c("Invalid state to get outer edge offset: ", i2));
            }
            iMo2075u = this.f2409a.mo2076v();
        }
        C0245e c0245e = this.f2417i;
        if (c0245e != null) {
            if (!z2) {
                int top = view.getTop();
                c0245e.f520r = view;
                c0245e.f505c = -1;
                boolean zM676h = c0245e.m676h(iMo2075u, top, 0, 0);
                if (!zM676h && c0245e.f503a == 0 && c0245e.f520r != null) {
                    c0245e.f520r = null;
                }
            }
        }
        m1882r(i2);
    }

    /* JADX INFO: renamed from: u */
    public final void m1885u() {
        View view;
        WeakReference weakReference = this.f2424p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0080Q.m288g(view, 262144);
        AbstractC0080Q.m286e(view, 0);
        AbstractC0080Q.m288g(view, 1048576);
        AbstractC0080Q.m286e(view, 0);
        final int i2 = 5;
        if (this.f2416h != 5) {
            AbstractC0080Q.m289h(view, C0151e.f349j, new InterfaceC0166t() { // from class: y0.b
                /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
                @Override // p008E.InterfaceC0166t
                /* JADX INFO: renamed from: j */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean mo18j(View view2) {
                    SideSheetBehavior sideSheetBehavior = this.f4400a;
                    sideSheetBehavior.getClass();
                    int i3 = i2;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2424p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m1882r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2424p.get();
                        RunnableC0714z0 runnableC0714z0 = new RunnableC0714z0(sideSheetBehavior, i3, 3);
                        ViewParent parent = view3.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            runnableC0714z0.run();
                        } else {
                            Field field = AbstractC0080Q.f219a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(runnableC0714z0);
                            }
                        }
                    }
                    return true;
                }
            });
        }
        final int i3 = 3;
        if (this.f2416h != 3) {
            AbstractC0080Q.m289h(view, C0151e.f347h, new InterfaceC0166t() { // from class: y0.b
                /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
                @Override // p008E.InterfaceC0166t
                /* JADX INFO: renamed from: j */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean mo18j(View view2) {
                    SideSheetBehavior sideSheetBehavior = this.f4400a;
                    sideSheetBehavior.getClass();
                    int i32 = i3;
                    if (i32 == 1 || i32 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i32 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2424p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m1882r(i32);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2424p.get();
                        RunnableC0714z0 runnableC0714z0 = new RunnableC0714z0(sideSheetBehavior, i32, 3);
                        ViewParent parent = view3.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            runnableC0714z0.run();
                        } else {
                            Field field = AbstractC0080Q.f219a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(runnableC0714z0);
                            }
                        }
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f2413e = new C0501a(this);
        this.f2415g = true;
        this.f2416h = 5;
        this.f2419k = 0.1f;
        this.f2426r = -1;
        this.f2429u = new LinkedHashSet();
        this.f2430v = new C0979a(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3345q);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f2411c = AbstractC0805P.m2051r(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f2412d = C1127k.m2657a(context, attributeSet, 0, C1031R.style.Widget_Material3_SideSheet).m2656a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f2426r = resourceId;
            WeakReference weakReference = this.f2425q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2425q = null;
            WeakReference weakReference2 = this.f2424p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    Field field = AbstractC0080Q.f219a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C1127k c1127k = this.f2412d;
        if (c1127k != null) {
            C1123g c1123g = new C1123g(c1127k);
            this.f2410b = c1123g;
            c1123g.m2649i(context);
            ColorStateList colorStateList = this.f2411c;
            if (colorStateList != null) {
                this.f2410b.m2651k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f2410b.setTint(typedValue.data);
            }
        }
        this.f2414f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f2415g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
