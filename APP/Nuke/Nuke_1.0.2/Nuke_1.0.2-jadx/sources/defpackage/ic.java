package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic extends ViewGroup implements uw, aw1, gt1 {
    public in0 A;
    public final int[] B;
    public int C;
    public int D;
    public final j51 E;
    public boolean F;
    public final r61 G;
    public final tm1 h;
    public final View i;
    public final zv1 j;
    public xm0 k;
    public boolean l;
    public xm0 m;
    public xm0 n;
    public uh1 o;
    public in0 p;
    public e70 q;
    public in0 r;
    public ia1 s;
    public tc2 t;
    public final int[] u;
    public long v;
    public cf3 w;
    public in0 x;
    public final hc y;
    public final hc z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ic(Context context, eo0 eo0Var, int i, tm1 tm1Var, View view, zv1 zv1Var) {
        super(context);
        this.h = tm1Var;
        this.i = view;
        this.j = zv1Var;
        rk1 rk1Var = wf3.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, eo0Var);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        ab3 ab3Var = (ab3) this;
        wa3.b(this, new ac(ab3Var, i2));
        ra3.b(this, this);
        this.k = q7.v;
        this.m = q7.u;
        this.n = q7.t;
        this.o = rh1.a;
        this.q = up0.a();
        int i3 = 2;
        this.u = new int[2];
        this.v = 0L;
        int i4 = 1;
        this.y = new hc(ab3Var, i4);
        this.z = new hc(ab3Var, i2);
        this.B = new int[2];
        this.C = Integer.MIN_VALUE;
        this.D = Integer.MIN_VALUE;
        this.E = new j51(6);
        r61 r61Var = new r61(3);
        r61Var.v = ab3Var;
        uh1 uh1VarA = nn2.a(op0.v(tm1Var), true, v6.u);
        u12 u12Var = new u12();
        u12Var.a = new cc(ab3Var, i3);
        zm zmVar = new zm();
        zm zmVar2 = u12Var.b;
        if (zmVar2 != null) {
            zmVar2.i = null;
        }
        u12Var.b = zmVar;
        zmVar.i = u12Var;
        setOnRequestDisallowInterceptTouchEvent$ui(zmVar);
        uh1 uh1VarC = t11.E(qp0.s(uh1VarA.c(u12Var), new ec(ab3Var, r61Var, ab3Var)), new bc(ab3Var, r61Var, i3)).c(new im(new cc(ab3Var, i4)));
        r61Var.d0(this.o.c(uh1VarC));
        int i5 = 5;
        this.p = new fa(i5, r61Var, uh1VarC);
        r61Var.Z(this.q);
        this.r = new v5(i5, r61Var);
        r61Var.T = new bc(ab3Var, r61Var, i2);
        r61Var.U = new cc(ab3Var, i2);
        r61Var.c0(new dc(ab3Var, r61Var));
        this.G = r61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(ab3 ab3Var, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(ci0.D(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zz0 f(zz0 zz0Var, int i, int i2, int i3, int i4) {
        int i5 = zz0Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = zz0Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = zz0Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = zz0Var.d - i4;
        return zz0.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final bw1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            kz0.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((b7) this.j).getSnapshotObserver();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.aw1
    public final boolean B() {
        return isAttachedToWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uw
    public final void a() {
        this.n.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gt1
    public final cf3 b(View view, cf3 cf3Var) {
        this.w = new cf3(cf3Var);
        return g(cf3Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uw
    public final void c() {
        this.m.a();
        removeAllViewsInLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final cf3 g(cf3 cf3Var) {
        ye3 ye3Var = cf3Var.a;
        zz0 zz0VarI = ye3Var.i(-1);
        zz0 zz0Var = zz0.e;
        if (!zz0VarI.equals(zz0Var) || !ye3Var.j(-9).equals(zz0Var) || ye3Var.h() != null) {
            qz0 qz0Var = (qz0) this.G.M.d;
            if (qz0Var.Y.u) {
                long J = tp0.J(qz0Var.M(0L));
                int i = (int) (J >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (J & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jL = s11.J(qz0Var).L();
                int i3 = (int) (jL >> 32);
                int i4 = (int) (jL & 4294967295L);
                long j = qz0Var.j;
                long J2 = tp0.J(qz0Var.M((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (J2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & J2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return cf3Var.a.r(i, i2, i5, i7);
                }
            }
        }
        return cf3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.B;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e70 getDensity() {
        return this.q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getInteropView() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r61 getLayoutNode() {
        return this.G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ia1 getLifecycleOwner() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final uh1 getModifier() {
        return this.o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        this.E.getClass();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final in0 getOnDensityChanged$ui() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final in0 getOnModifierChanged$ui() {
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final in0 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final xm0 getRelease() {
        return this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final xm0 getReset() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final tc2 getSavedStateRegistryOwner() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final xm0 getUpdate() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getView() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.F) {
            this.G.C();
            return null;
        }
        this.i.postOnAnimation(new l6(this.z, 3));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.i.isNestedScrollingEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.F) {
            this.G.C();
        } else {
            this.i.postOnAnimation(new l6(this.z, 3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        ts2 ts2Var = getSnapshotObserver().a;
        synchronized (ts2Var.g) {
            try {
                zk1 zk1Var = ts2Var.f;
                int i3 = zk1Var.j;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = zk1Var.h;
                    if (i4 < i3) {
                        ss2 ss2Var = (ss2) objArr[i4];
                        gk1 gk1Var = (gk1) ss2Var.f.k(this);
                        if (gk1Var == null) {
                            i = i4;
                        } else {
                            Object[] objArr2 = gk1Var.b;
                            int[] iArr = gk1Var.c;
                            long[] jArr = gk1Var.a;
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
                                                ss2Var.c(this, obj);
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
                        if (!ss2Var.f.j()) {
                            i5++;
                        } else if (i5 > 0) {
                            Object[] objArr3 = zk1Var.h;
                            objArr3[i - i5] = objArr3[i];
                        }
                        i4 = i + 1;
                    } else {
                        int i12 = i3 - i5;
                        Arrays.fill(objArr, i12, i3, (Object) null);
                        zk1Var.j = i12;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.i.layout(0, 0, i3 - i, i4 - i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.i;
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
        this.C = i;
        this.D = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.i.isNestedScrollingEnabled()) {
            return false;
        }
        p7.A(this.h.c(), null, new fc(z, this, ea3.a(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.i.isNestedScrollingEnabled()) {
            return false;
        }
        p7.A(this.h.c(), null, new gc(this, ea3.a(f * (-1.0f), f2 * (-1.0f)), null, 0), 3);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        in0 in0Var = this.x;
        if (in0Var == null) {
            return true;
        }
        in0Var.j(rect != null ? new o62(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        in0 in0Var = this.A;
        if (in0Var != null) {
            in0Var.j(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDensity(e70 e70Var) {
        if (e70Var != this.q) {
            this.q = e70Var;
            in0 in0Var = this.r;
            if (in0Var != null) {
                in0Var.j(e70Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLifecycleOwner(ia1 ia1Var) {
        if (ia1Var != this.s) {
            this.s = ia1Var;
            setTag(R.id.view_tree_lifecycle_owner, ia1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setModifier(uh1 uh1Var) {
        if (uh1Var != this.o) {
            this.o = uh1Var;
            in0 in0Var = this.p;
            if (in0Var != null) {
                in0Var.j(uh1Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnDensityChanged$ui(in0 in0Var) {
        this.r = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnModifierChanged$ui(in0 in0Var) {
        this.p = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnRequestDisallowInterceptTouchEvent$ui(in0 in0Var) {
        this.A = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setRelease(xm0 xm0Var) {
        this.n = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReset(xm0 xm0Var) {
        this.m = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSavedStateRegistryOwner(tc2 tc2Var) {
        if (tc2Var != this.t) {
            this.t = tc2Var;
            setTag(R.id.view_tree_saved_state_registry_owner, tc2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpdate(xm0 xm0Var) {
        this.k = xm0Var;
        this.l = true;
        this.y.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
