package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: ic */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0309ic extends ViewGroup implements InterfaceC0788uw, aw1, gt1 {

    /* JADX INFO: renamed from: A */
    public in0 f4525A;

    /* JADX INFO: renamed from: B */
    public final int[] f4526B;

    /* JADX INFO: renamed from: C */
    public int f4527C;

    /* JADX INFO: renamed from: D */
    public int f4528D;

    /* JADX INFO: renamed from: E */
    public final j51 f4529E;

    /* JADX INFO: renamed from: F */
    public boolean f4530F;

    /* JADX INFO: renamed from: G */
    public final r61 f4531G;

    /* JADX INFO: renamed from: h */
    public final tm1 f4532h;

    /* JADX INFO: renamed from: i */
    public final View f4533i;

    /* JADX INFO: renamed from: j */
    public final zv1 f4534j;

    /* JADX INFO: renamed from: k */
    public xm0 f4535k;

    /* JADX INFO: renamed from: l */
    public boolean f4536l;

    /* JADX INFO: renamed from: m */
    public xm0 f4537m;

    /* JADX INFO: renamed from: n */
    public xm0 f4538n;

    /* JADX INFO: renamed from: o */
    public uh1 f4539o;

    /* JADX INFO: renamed from: p */
    public in0 f4540p;

    /* JADX INFO: renamed from: q */
    public e70 f4541q;

    /* JADX INFO: renamed from: r */
    public in0 f4542r;

    /* JADX INFO: renamed from: s */
    public ia1 f4543s;

    /* JADX INFO: renamed from: t */
    public tc2 f4544t;

    /* JADX INFO: renamed from: u */
    public final int[] f4545u;

    /* JADX INFO: renamed from: v */
    public long f4546v;

    /* JADX INFO: renamed from: w */
    public cf3 f4547w;

    /* JADX INFO: renamed from: x */
    public in0 f4548x;

    /* JADX INFO: renamed from: y */
    public final C0272hc f4549y;

    /* JADX INFO: renamed from: z */
    public final C0272hc f4550z;

    public AbstractC0309ic(Context context, eo0 eo0Var, int i, tm1 tm1Var, View view, zv1 zv1Var) {
        super(context);
        this.f4532h = tm1Var;
        this.f4533i = view;
        this.f4534j = zv1Var;
        rk1 rk1Var = wf3.f12494a;
        setTag(R.id.androidx_compose_ui_view_composition_context, eo0Var);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        ab3 ab3Var = (ab3) this;
        wa3.m5863b(this, new C0013ac(ab3Var, i2));
        ra3.m4425b(this, this);
        this.f4535k = C0607q7.f8801v;
        this.f4537m = C0607q7.f8800u;
        this.f4538n = C0607q7.f8799t;
        this.f4539o = rh1.f9587a;
        this.f4541q = up0.m5536a();
        int i3 = 2;
        this.f4545u = new int[2];
        this.f4546v = 0L;
        int i4 = 1;
        this.f4549y = new C0272hc(ab3Var, i4);
        this.f4550z = new C0272hc(ab3Var, i2);
        this.f4526B = new int[2];
        this.f4527C = Integer.MIN_VALUE;
        this.f4528D = Integer.MIN_VALUE;
        this.f4529E = new j51(6);
        r61 r61Var = new r61(3);
        r61Var.f9398v = ab3Var;
        uh1 uh1VarM3321a = nn2.m3321a(op0.m3599v(tm1Var), true, C0799v6.f11772u);
        u12 u12Var = new u12();
        u12Var.f11056a = new C0086cc(ab3Var, i3);
        C0967zm c0967zm = new C0967zm();
        C0967zm c0967zm2 = u12Var.f11057b;
        if (c0967zm2 != null) {
            c0967zm2.f13949i = null;
        }
        u12Var.f11057b = c0967zm;
        c0967zm.f13949i = u12Var;
        setOnRequestDisallowInterceptTouchEvent$ui(c0967zm);
        uh1 uh1VarMo4491c = t11.m5053E(qp0.m4264s(uh1VarM3321a.mo4491c(u12Var), new C0161ec(ab3Var, r61Var, ab3Var)), new C0050bc(ab3Var, r61Var, i3)).mo4491c(new C0318im(new C0086cc(ab3Var, i4)));
        r61Var.m4371d0(this.f4539o.mo4491c(uh1VarMo4491c));
        int i5 = 5;
        this.f4540p = new C0196fa(i5, r61Var, uh1VarMo4491c);
        r61Var.m4365Z(this.f4541q);
        this.f4542r = new C0798v5(i5, r61Var);
        r61Var.f9379T = new C0050bc(ab3Var, r61Var, i2);
        r61Var.f9380U = new C0086cc(ab3Var, i2);
        r61Var.m4369c0(new C0125dc(ab3Var, r61Var));
        this.f4531G = r61Var;
    }

    /* JADX INFO: renamed from: e */
    public static final int m2321e(ab3 ab3Var, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(ci0.m779D(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: f */
    public static zz0 m2322f(zz0 zz0Var, int i, int i2, int i3, int i4) {
        int i5 = zz0Var.f14157a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = zz0Var.f14158b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = zz0Var.f14159c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = zz0Var.f14160d - i4;
        return zz0.m6518b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bw1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            kz0.m2764b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) this.f4534j).getSnapshotObserver();
    }

    @Override // p000.aw1
    /* JADX INFO: renamed from: B */
    public final boolean mo298B() {
        return isAttachedToWindow();
    }

    @Override // p000.InterfaceC0788uw
    /* JADX INFO: renamed from: a */
    public final void mo1537a() {
        this.f4538n.mo6a();
    }

    @Override // p000.gt1
    /* JADX INFO: renamed from: b */
    public final cf3 mo333b(View view, cf3 cf3Var) {
        this.f4547w = new cf3(cf3Var);
        return m2323g(cf3Var);
    }

    @Override // p000.InterfaceC0788uw
    /* JADX INFO: renamed from: c */
    public final void mo1538c() {
        this.f4537m.mo6a();
        removeAllViewsInLayout();
    }

    /* JADX INFO: renamed from: g */
    public final cf3 m2323g(cf3 cf3Var) {
        ye3 ye3Var = cf3Var.f1518a;
        zz0 zz0VarMo4165i = ye3Var.mo4165i(-1);
        zz0 zz0Var = zz0.f14156e;
        if (!zz0VarMo4165i.equals(zz0Var) || !ye3Var.mo4166j(-9).equals(zz0Var) || ye3Var.mo4858h() != null) {
            qz0 qz0Var = (qz0) this.f4531G.f9372M.f12033d;
            if (qz0Var.f9293Y.f10770u) {
                long jM5346J = tp0.m5346J(qz0Var.mo646M(0L));
                int i = (int) (jM5346J >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jM5346J & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jMo645L = s11.m4665J(qz0Var).mo645L();
                int i3 = (int) (jMo645L >> 32);
                int i4 = (int) (jMo645L & 4294967295L);
                long j = qz0Var.f10440j;
                long jM5346J2 = tp0.m5346J(qz0Var.mo646M((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jM5346J2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jM5346J2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return cf3Var.f1518a.mo4170r(i, i2, i5, i7);
                }
            }
        }
        return cf3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f4526B;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final e70 getDensity() {
        return this.f4541q;
    }

    public final View getInteropView() {
        return this.f4533i;
    }

    public final r61 getLayoutNode() {
        return this.f4531G;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f4533i.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final ia1 getLifecycleOwner() {
        return this.f4543s;
    }

    public final uh1 getModifier() {
        return this.f4539o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        this.f4529E.getClass();
        return 0;
    }

    public final in0 getOnDensityChanged$ui() {
        return this.f4542r;
    }

    public final in0 getOnModifierChanged$ui() {
        return this.f4540p;
    }

    public final in0 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f4525A;
    }

    public final xm0 getRelease() {
        return this.f4538n;
    }

    public final xm0 getReset() {
        return this.f4537m;
    }

    public final tc2 getSavedStateRegistryOwner() {
        return this.f4544t;
    }

    public final xm0 getUpdate() {
        return this.f4535k;
    }

    public final View getView() {
        return this.f4533i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f4530F) {
            this.f4531G.m4345C();
            return null;
        }
        this.f4533i.postOnAnimation(new RunnableC0413l6(this.f4550z, 3));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4533i.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4549y.mo6a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f4530F) {
            this.f4531G.m4345C();
        } else {
            this.f4533i.postOnAnimation(new RunnableC0413l6(this.f4550z, 3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i;
        int i2;
        super.onDetachedFromWindow();
        ts2 ts2Var = getSnapshotObserver().f1051a;
        synchronized (ts2Var.f10953g) {
            try {
                zk1 zk1Var = ts2Var.f10952f;
                int i3 = zk1Var.f13936j;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = zk1Var.f13934h;
                    if (i4 < i3) {
                        ss2 ss2Var = (ss2) objArr[i4];
                        gk1 gk1Var = (gk1) ss2Var.f10354f.m4509k(this);
                        if (gk1Var == null) {
                            i = i4;
                        } else {
                            Object[] objArr2 = gk1Var.f3553b;
                            int[] iArr = gk1Var.f3554c;
                            long[] jArr = gk1Var.f3552a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j & 255) < 128) {
                                                int i10 = (i6 << 3) + i9;
                                                i2 = i7;
                                                Object obj = objArr2[i10];
                                                int i11 = iArr[i10];
                                                ss2Var.m4998c(this, obj);
                                            } else {
                                                i2 = i7;
                                            }
                                            j >>= i2;
                                            i9++;
                                            i7 = i2;
                                        }
                                        if (i8 != i7) {
                                            break;
                                        }
                                        if (i6 == length) {
                                            break;
                                        }
                                        i6++;
                                        i4 = i;
                                    }
                                }
                            }
                        }
                        if (!ss2Var.f10354f.m4508j()) {
                            i5++;
                        } else if (i5 > 0) {
                            Object[] objArr3 = zk1Var.f13934h;
                            objArr3[i - i5] = objArr3[i];
                        }
                        i4 = i + 1;
                    } else {
                        int i12 = i3 - i5;
                        Arrays.fill(objArr, i12, i3, (Object) null);
                        zk1Var.f13936j = i12;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f4533i.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f4533i;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f4527C = i;
        this.f4528D = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f4533i.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0570p7.m3745A(this.f4532h.m5331c(), null, new C0198fc(z, this, ea3.m1314a(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f4533i.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0570p7.m3745A(this.f4532h.m5331c(), null, new C0235gc(this, ea3.m1314a(f * (-1.0f), f2 * (-1.0f)), null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        in0 in0Var = this.f4548x;
        if (in0Var == null) {
            return true;
        }
        in0Var.mo5j(rect != null ? new o62(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        in0 in0Var = this.f4525A;
        if (in0Var != null) {
            in0Var.mo5j(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(e70 e70Var) {
        if (e70Var != this.f4541q) {
            this.f4541q = e70Var;
            in0 in0Var = this.f4542r;
            if (in0Var != null) {
                in0Var.mo5j(e70Var);
            }
        }
    }

    public final void setLifecycleOwner(ia1 ia1Var) {
        if (ia1Var != this.f4543s) {
            this.f4543s = ia1Var;
            setTag(R.id.view_tree_lifecycle_owner, ia1Var);
        }
    }

    public final void setModifier(uh1 uh1Var) {
        if (uh1Var != this.f4539o) {
            this.f4539o = uh1Var;
            in0 in0Var = this.f4540p;
            if (in0Var != null) {
                in0Var.mo5j(uh1Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(in0 in0Var) {
        this.f4542r = in0Var;
    }

    public final void setOnModifierChanged$ui(in0 in0Var) {
        this.f4540p = in0Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(in0 in0Var) {
        this.f4525A = in0Var;
    }

    public final void setRelease(xm0 xm0Var) {
        this.f4538n = xm0Var;
    }

    public final void setReset(xm0 xm0Var) {
        this.f4537m = xm0Var;
    }

    public final void setSavedStateRegistryOwner(tc2 tc2Var) {
        if (tc2Var != this.f4544t) {
            this.f4544t = tc2Var;
            setTag(R.id.view_tree_saved_state_registry_owner, tc2Var);
        }
    }

    public final void setUpdate(xm0 xm0Var) {
        this.f4535k = xm0Var;
        this.f4536l = true;
        this.f4549y.mo6a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
