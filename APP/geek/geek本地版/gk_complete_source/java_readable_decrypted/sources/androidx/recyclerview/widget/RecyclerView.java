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
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC0242fz;
import p000.AbstractC0392jz;
import p000.AbstractC0429kz;
import p000.AbstractC0540nz;
import p000.AbstractC0615pz;
import p000.AbstractC0652qz;
import p000.AbstractC0836vy;
import p000.AbstractC0912y;
import p000.AbstractC0985zz;
import p000.C0074bn;
import p000.C0079bs;
import p000.C0138d4;
import p000.C0205ez;
import p000.C0217fa;
import p000.C0352iw;
import p000.C0354iy;
import p000.C0355iz;
import p000.C0463lw;
import p000.C0577oz;
import p000.C0659r5;
import p000.C0689rz;
import p000.C0726sz;
import p000.C0763tz;
import p000.C0780uf;
import p000.C0837vz;
import p000.C0858wj;
import p000.C0877x1;
import p000.C0914y1;
import p000.C0939yq;
import p000.C0948yz;
import p000.InterfaceC0316hz;
import p000.InterfaceC0800uz;
import p000.InterpolatorC0168dz;
import p000.RunnableC0157dn;
import p000.RunnableC0919y6;
import p000.a00;
import p000.aa0;
import p000.b00;
import p000.d00;
import p000.ja0;
import p000.ka0;
import p000.m70;
import p000.n70;
import p000.oa0;
import p000.s90;
import p000.u30;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: s0 */
    public static final int[] f557s0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: t0 */
    public static final Class[] f558t0;

    /* JADX INFO: renamed from: u0 */
    public static final InterpolatorC0168dz f559u0;

    /* JADX INFO: renamed from: A */
    public int f560A;

    /* JADX INFO: renamed from: B */
    public int f561B;

    /* JADX INFO: renamed from: C */
    public C0355iz f562C;

    /* JADX INFO: renamed from: D */
    public EdgeEffect f563D;

    /* JADX INFO: renamed from: E */
    public EdgeEffect f564E;

    /* JADX INFO: renamed from: F */
    public EdgeEffect f565F;

    /* JADX INFO: renamed from: G */
    public EdgeEffect f566G;

    /* JADX INFO: renamed from: H */
    public AbstractC0392jz f567H;

    /* JADX INFO: renamed from: I */
    public int f568I;

    /* JADX INFO: renamed from: J */
    public int f569J;

    /* JADX INFO: renamed from: K */
    public VelocityTracker f570K;

    /* JADX INFO: renamed from: L */
    public int f571L;

    /* JADX INFO: renamed from: M */
    public int f572M;

    /* JADX INFO: renamed from: N */
    public int f573N;

    /* JADX INFO: renamed from: O */
    public int f574O;

    /* JADX INFO: renamed from: P */
    public int f575P;

    /* JADX INFO: renamed from: Q */
    public AbstractC0615pz f576Q;

    /* JADX INFO: renamed from: R */
    public final int f577R;

    /* JADX INFO: renamed from: S */
    public final int f578S;

    /* JADX INFO: renamed from: T */
    public final float f579T;

    /* JADX INFO: renamed from: U */
    public final float f580U;

    /* JADX INFO: renamed from: V */
    public boolean f581V;

    /* JADX INFO: renamed from: W */
    public final a00 f582W;

    /* JADX INFO: renamed from: a */
    public final C0354iy f583a;

    /* JADX INFO: renamed from: a0 */
    public RunnableC0157dn f584a0;

    /* JADX INFO: renamed from: b */
    public final C0763tz f585b;

    /* JADX INFO: renamed from: b0 */
    public final C0074bn f586b0;

    /* JADX INFO: renamed from: c */
    public C0837vz f587c;

    /* JADX INFO: renamed from: c0 */
    public final C0948yz f588c0;

    /* JADX INFO: renamed from: d */
    public final C0914y1 f589d;

    /* JADX INFO: renamed from: d0 */
    public AbstractC0652qz f590d0;

    /* JADX INFO: renamed from: e */
    public final C0659r5 f591e;

    /* JADX INFO: renamed from: e0 */
    public ArrayList f592e0;

    /* JADX INFO: renamed from: f */
    public final C0138d4 f593f;

    /* JADX INFO: renamed from: f0 */
    public boolean f594f0;

    /* JADX INFO: renamed from: g */
    public boolean f595g;

    /* JADX INFO: renamed from: g0 */
    public boolean f596g0;

    /* JADX INFO: renamed from: h */
    public final Rect f597h;

    /* JADX INFO: renamed from: h0 */
    public final C0205ez f598h0;

    /* JADX INFO: renamed from: i */
    public final Rect f599i;

    /* JADX INFO: renamed from: i0 */
    public boolean f600i0;

    /* JADX INFO: renamed from: j */
    public final RectF f601j;

    /* JADX INFO: renamed from: j0 */
    public d00 f602j0;

    /* JADX INFO: renamed from: k */
    public AbstractC0242fz f603k;

    /* JADX INFO: renamed from: k0 */
    public final int[] f604k0;

    /* JADX INFO: renamed from: l */
    public AbstractC0540nz f605l;

    /* JADX INFO: renamed from: l0 */
    public C0352iw f606l0;

    /* JADX INFO: renamed from: m */
    public final ArrayList f607m;

    /* JADX INFO: renamed from: m0 */
    public final int[] f608m0;

    /* JADX INFO: renamed from: n */
    public final ArrayList f609n;

    /* JADX INFO: renamed from: n0 */
    public final int[] f610n0;

    /* JADX INFO: renamed from: o */
    public C0858wj f611o;

    /* JADX INFO: renamed from: o0 */
    public final int[] f612o0;

    /* JADX INFO: renamed from: p */
    public boolean f613p;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f614p0;

    /* JADX INFO: renamed from: q */
    public boolean f615q;

    /* JADX INFO: renamed from: q0 */
    public final RunnableC0919y6 f616q0;

    /* JADX INFO: renamed from: r */
    public boolean f617r;

    /* JADX INFO: renamed from: r0 */
    public final C0205ez f618r0;

    /* JADX INFO: renamed from: s */
    public int f619s;

    /* JADX INFO: renamed from: t */
    public boolean f620t;

    /* JADX INFO: renamed from: u */
    public boolean f621u;

    /* JADX INFO: renamed from: v */
    public boolean f622v;

    /* JADX INFO: renamed from: w */
    public int f623w;

    /* JADX INFO: renamed from: x */
    public final AccessibilityManager f624x;

    /* JADX INFO: renamed from: y */
    public boolean f625y;

    /* JADX INFO: renamed from: z */
    public boolean f626z;

    static {
        Class cls = Integer.TYPE;
        f558t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f559u0 = new InterpolatorC0168dz(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ljx.wechatmod.R.attr.recyclerViewStyle);
    }

    /* JADX INFO: renamed from: D */
    public static RecyclerView m366D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM366D = m366D(viewGroup.getChildAt(i));
            if (recyclerViewM366D != null) {
                return recyclerViewM366D;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static b00 m367I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0577oz) view.getLayoutParams()).f3621a;
    }

    private C0352iw getScrollingChildHelper() {
        if (this.f606l0 == null) {
            this.f606l0 = new C0352iw(this);
        }
        return this.f606l0;
    }

    /* JADX INFO: renamed from: j */
    public static void m372j(b00 b00Var) {
        WeakReference weakReference = b00Var.f698b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == b00Var.f697a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            b00Var.f698b = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final View m373A(View view) {
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m374B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f609n
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            wj r5 = (p000.C0858wj) r5
            int r6 = r5.f4992v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.m2572d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.m2571c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f4993w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f4986p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f4993w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f4983m = r6
        L55:
            r5.m2573f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f611o = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m374B(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: C */
    public final void m375C(int[] iArr) {
        int iM2232k = this.f591e.m2232k();
        if (iM2232k == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM2232k; i3++) {
            b00 b00VarM367I = m367I(this.f591e.m2231j(i3));
            if (!b00VarM367I.m495o()) {
                int iM482b = b00VarM367I.m482b();
                if (iM482b < i) {
                    i = iM482b;
                }
                if (iM482b > i2) {
                    i2 = iM482b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: E */
    public final b00 m376E(int i) {
        b00 b00Var = null;
        if (this.f625y) {
            return null;
        }
        int iM2240t = this.f591e.m2240t();
        for (int i2 = 0; i2 < iM2240t; i2++) {
            b00 b00VarM367I = m367I(this.f591e.m2239s(i2));
            if (b00VarM367I != null && !b00VarM367I.m488h() && m377F(b00VarM367I) == i) {
                if (!((ArrayList) this.f591e.f4211d).contains(b00VarM367I.f697a)) {
                    return b00VarM367I;
                }
                b00Var = b00VarM367I;
            }
        }
        return b00Var;
    }

    /* JADX INFO: renamed from: F */
    public final int m377F(b00 b00Var) {
        if ((b00Var.f706j & 524) == 0 && b00Var.m485e()) {
            int i = b00Var.f699c;
            ArrayList arrayList = (ArrayList) this.f589d.f5247c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0877x1 c0877x1 = (C0877x1) arrayList.get(i2);
                int i3 = c0877x1.f5080a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = c0877x1.f5081b;
                        if (i4 <= i) {
                            int i5 = c0877x1.f5082c;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = c0877x1.f5081b;
                        if (i6 == i) {
                            i = c0877x1.f5082c;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (c0877x1.f5082c <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c0877x1.f5081b <= i) {
                    i += c0877x1.f5082c;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public final long m378G(b00 b00Var) {
        return this.f603k.f1998b ? b00Var.f701e : b00Var.f699c;
    }

    /* JADX INFO: renamed from: H */
    public final b00 m379H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m367I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: J */
    public final Rect m380J(View view) {
        C0577oz c0577oz = (C0577oz) view.getLayoutParams();
        boolean z = c0577oz.f3623c;
        Rect rect = c0577oz.f3622b;
        if (!z || (this.f588c0.f5421g && (c0577oz.f3621a.m491k() || c0577oz.f3621a.m486f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f607m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f597h;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0429kz) arrayList.get(i)).getClass();
            ((C0577oz) view.getLayoutParams()).f3621a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0577oz.f3623c = false;
        return rect;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m381K() {
        return !this.f617r || this.f625y || this.f589d.m2648f();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m382L() {
        return this.f560A > 0;
    }

    /* JADX INFO: renamed from: M */
    public final void m383M(int i) {
        if (this.f605l == null) {
            return;
        }
        setScrollState(2);
        this.f605l.mo360l0(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: N */
    public final void m384N() {
        int iM2240t = this.f591e.m2240t();
        for (int i = 0; i < iM2240t; i++) {
            ((C0577oz) this.f591e.m2239s(i).getLayoutParams()).f3623c = true;
        }
        ArrayList arrayList = this.f585b.f4635c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0577oz c0577oz = (C0577oz) ((b00) arrayList.get(i2)).f697a.getLayoutParams();
            if (c0577oz != null) {
                c0577oz.f3623c = true;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m385O(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM2240t = this.f591e.m2240t();
        for (int i4 = 0; i4 < iM2240t; i4++) {
            b00 b00VarM367I = m367I(this.f591e.m2239s(i4));
            if (b00VarM367I != null && !b00VarM367I.m495o()) {
                int i5 = b00VarM367I.f699c;
                C0948yz c0948yz = this.f588c0;
                if (i5 >= i3) {
                    b00VarM367I.m492l(-i2, z);
                    c0948yz.f5420f = true;
                } else if (i5 >= i) {
                    b00VarM367I.m481a(8);
                    b00VarM367I.m492l(-i2, z);
                    b00VarM367I.f699c = i - 1;
                    c0948yz.f5420f = true;
                }
            }
        }
        C0763tz c0763tz = this.f585b;
        ArrayList arrayList = c0763tz.f4635c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b00 b00Var = (b00) arrayList.get(size);
            if (b00Var != null) {
                int i6 = b00Var.f699c;
                if (i6 >= i3) {
                    b00Var.m492l(-i2, z);
                } else if (i6 >= i) {
                    b00Var.m481a(8);
                    c0763tz.m2397e(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: P */
    public final void m386P() {
        this.f560A++;
    }

    /* JADX INFO: renamed from: Q */
    public final void m387Q(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f560A - 1;
        this.f560A = i2;
        if (i2 < 1) {
            this.f560A = 0;
            if (z) {
                int i3 = this.f623w;
                this.f623w = 0;
                if (i3 != 0 && (accessibilityManager = this.f624x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    AbstractC0912y.m2640b(accessibilityEventObtain, i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f614p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b00 b00Var = (b00) arrayList.get(size);
                    if (b00Var.f697a.getParent() == this && !b00Var.m495o() && (i = b00Var.f713q) != -1) {
                        View view = b00Var.f697a;
                        WeakHashMap weakHashMap = ja0.f2600a;
                        s90.m2327s(view, i);
                        b00Var.f713q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m388R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f569J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f569J = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f573N = x;
            this.f571L = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f574O = y;
            this.f572M = y;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m389S() {
        if (this.f600i0 || !this.f613p) {
            return;
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2321m(this, this.f616q0);
        this.f600i0 = true;
    }

    /* JADX INFO: renamed from: T */
    public final void m390T(b00 b00Var, C0463lw c0463lw) {
        b00Var.f706j &= -8193;
        boolean z = this.f588c0.f5422h;
        C0138d4 c0138d4 = this.f593f;
        if (z && b00Var.m491k() && !b00Var.m488h() && !b00Var.m495o()) {
            ((C0079bs) c0138d4.f1364c).m567d(m378G(b00Var), b00Var);
        }
        u30 u30Var = (u30) c0138d4.f1363b;
        oa0 oa0VarM2004a = (oa0) u30Var.getOrDefault(b00Var, null);
        if (oa0VarM2004a == null) {
            oa0VarM2004a = oa0.m2004a();
            u30Var.put(b00Var, oa0VarM2004a);
        }
        oa0VarM2004a.f3520b = c0463lw;
        oa0VarM2004a.f3519a |= 4;
    }

    /* JADX INFO: renamed from: U */
    public final void m391U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f597h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0577oz) {
            C0577oz c0577oz = (C0577oz) layoutParams;
            if (!c0577oz.f3623c) {
                Rect rect2 = c0577oz.f3622b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f605l.mo745i0(this, view, this.f597h, !this.f617r, view2 == null);
    }

    /* JADX INFO: renamed from: V */
    public final void m392V() {
        VelocityTracker velocityTracker = this.f570K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m399c0(0);
        EdgeEffect edgeEffect = this.f563D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f563D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f564E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f564E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f565F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f565F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f566G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f566G.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = ja0.f2600a;
            s90.m2319k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m393W(int r17, int r18, android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m393W(int, int, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: X */
    public final void m394X(int i, int i2, int[] iArr) {
        b00 b00Var;
        m397a0();
        m386P();
        int i3 = n70.f3350a;
        m70.m1798a("RV Scroll");
        C0948yz c0948yz = this.f588c0;
        m419z(c0948yz);
        C0763tz c0763tz = this.f585b;
        int iMo311k0 = i != 0 ? this.f605l.mo311k0(i, c0763tz, c0948yz) : 0;
        int iMo314m0 = i2 != 0 ? this.f605l.mo314m0(i2, c0763tz, c0948yz) : 0;
        m70.m1799b();
        C0659r5 c0659r5 = this.f591e;
        int iM2232k = c0659r5.m2232k();
        for (int i4 = 0; i4 < iM2232k; i4++) {
            View viewM2231j = c0659r5.m2231j(i4);
            b00 b00VarM379H = m379H(viewM2231j);
            if (b00VarM379H != null && (b00Var = b00VarM379H.f705i) != null) {
                View view = b00Var.f697a;
                int left = viewM2231j.getLeft();
                int top = viewM2231j.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m387Q(true);
        m398b0(false);
        if (iArr != null) {
            iArr[0] = iMo311k0;
            iArr[1] = iMo314m0;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m395Y(int i) {
        C0939yq c0939yq;
        if (this.f621u) {
            return;
        }
        setScrollState(0);
        a00 a00Var = this.f582W;
        a00Var.f9g.removeCallbacks(a00Var);
        a00Var.f5c.abortAnimation();
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null && (c0939yq = abstractC0540nz.f3459e) != null) {
            c0939yq.m2737i();
        }
        AbstractC0540nz abstractC0540nz2 = this.f605l;
        if (abstractC0540nz2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0540nz2.mo360l0(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m396Z(int i, int i2, boolean z) {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f621u) {
            return;
        }
        if (!abstractC0540nz.mo355d()) {
            i = 0;
        }
        if (!this.f605l.mo356e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m1524g(i3, 1);
        }
        this.f582W.m4b(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m397a0() {
        int i = this.f619s + 1;
        this.f619s = i;
        if (i != 1 || this.f621u) {
            return;
        }
        this.f620t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null) {
            abstractC0540nz.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m398b0(boolean z) {
        if (this.f619s < 1) {
            this.f619s = 1;
        }
        if (!z && !this.f621u) {
            this.f620t = false;
        }
        if (this.f619s == 1) {
            if (z && this.f620t && !this.f621u && this.f605l != null && this.f603k != null) {
                m408o();
            }
            if (!this.f621u) {
                this.f620t = false;
            }
        }
        this.f619s--;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m399c0(int i) {
        getScrollingChildHelper().m1525h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0577oz) && this.f605l.mo304f((C0577oz) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null && abstractC0540nz.mo355d()) {
            return this.f605l.mo359j(this.f588c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null && abstractC0540nz.mo355d()) {
            return this.f605l.mo310k(this.f588c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null && abstractC0540nz.mo355d()) {
            return this.f605l.mo313l(this.f588c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null && abstractC0540nz.mo356e()) {
            return this.f605l.mo361m(this.f588c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null && abstractC0540nz.mo356e()) {
            return this.f605l.mo315n(this.f588c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null && abstractC0540nz.mo356e()) {
            return this.f605l.mo316o(this.f588c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m1518a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m1519b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m1520c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m1521d(i, i2, i3, i4, iArr, 0, null);
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
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.f607m;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0429kz) arrayList.get(i)).mo1732b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f563D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f595g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f563D;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f564E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f595g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f564E;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f565F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f595g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f565F;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f566G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f595g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f566G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f567H == null || arrayList.size() <= 0 || !this.f567H.mo1615f()) ? z : true) {
            WeakHashMap weakHashMap = ja0.f2600a;
            s90.m2319k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: renamed from: f */
    public final void m400f(b00 b00Var) {
        View view = b00Var.f697a;
        boolean z = view.getParent() == this;
        this.f585b.m2402j(m379H(view));
        if (b00Var.m490j()) {
            this.f591e.m2224c(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f591e.m2223b(view, -1, true);
            return;
        }
        C0659r5 c0659r5 = this.f591e;
        int iIndexOfChild = ((C0205ez) c0659r5.f4209b).f1865a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0217fa) c0659r5.f4210c).m1151h(iIndexOfChild);
            c0659r5.m2241u(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX INFO: renamed from: g */
    public final void m401g(AbstractC0429kz abstractC0429kz) {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null) {
            abstractC0540nz.mo353c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f607m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0429kz);
        m384N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null) {
            return abstractC0540nz.mo318r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m418y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null) {
            return abstractC0540nz.mo319s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m418y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0242fz getAdapter() {
        return this.f603k;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz == null) {
            return super.getBaseline();
        }
        abstractC0540nz.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f595g;
    }

    public d00 getCompatAccessibilityDelegate() {
        return this.f602j0;
    }

    public C0355iz getEdgeEffectFactory() {
        return this.f562C;
    }

    public AbstractC0392jz getItemAnimator() {
        return this.f567H;
    }

    public int getItemDecorationCount() {
        return this.f607m.size();
    }

    public AbstractC0540nz getLayoutManager() {
        return this.f605l;
    }

    public int getMaxFlingVelocity() {
        return this.f578S;
    }

    public int getMinFlingVelocity() {
        return this.f577R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0615pz getOnFlingListener() {
        return this.f576Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f581V;
    }

    public C0726sz getRecycledViewPool() {
        return this.f585b.m2395c();
    }

    public int getScrollState() {
        return this.f568I;
    }

    /* JADX INFO: renamed from: h */
    public final void m402h(AbstractC0652qz abstractC0652qz) {
        if (this.f592e0 == null) {
            this.f592e0 = new ArrayList();
        }
        this.f592e0.add(abstractC0652qz);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m1523f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m403i(String str) {
        if (m382L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m418y());
        }
        if (this.f561B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m418y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f613p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f621u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2508d;
    }

    /* JADX INFO: renamed from: k */
    public final void m404k() {
        int iM2240t = this.f591e.m2240t();
        for (int i = 0; i < iM2240t; i++) {
            b00 b00VarM367I = m367I(this.f591e.m2239s(i));
            if (!b00VarM367I.m495o()) {
                b00VarM367I.f700d = -1;
                b00VarM367I.f703g = -1;
            }
        }
        C0763tz c0763tz = this.f585b;
        ArrayList arrayList = c0763tz.f4633a;
        ArrayList arrayList2 = c0763tz.f4635c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            b00 b00Var = (b00) arrayList2.get(i2);
            b00Var.f700d = -1;
            b00Var.f703g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            b00 b00Var2 = (b00) arrayList.get(i3);
            b00Var2.f700d = -1;
            b00Var2.f703g = -1;
        }
        ArrayList arrayList3 = c0763tz.f4634b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                b00 b00Var3 = (b00) c0763tz.f4634b.get(i4);
                b00Var3.f700d = -1;
                b00Var3.f703g = -1;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m405l(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f563D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f563D.onRelease();
            zIsFinished = this.f563D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f565F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f565F.onRelease();
            zIsFinished |= this.f565F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f564E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f564E.onRelease();
            zIsFinished |= this.f564E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f566G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f566G.onRelease();
            zIsFinished |= this.f566G.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = ja0.f2600a;
            s90.m2319k(this);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m406m() {
        if (!this.f617r || this.f625y) {
            int i = n70.f3350a;
            m70.m1798a("RV FullInvalidate");
            m408o();
            m70.m1799b();
            return;
        }
        C0914y1 c0914y1 = this.f589d;
        if (c0914y1.m2648f()) {
            c0914y1.getClass();
            if (c0914y1.m2648f()) {
                int i2 = n70.f3350a;
                m70.m1798a("RV FullInvalidate");
                m408o();
                m70.m1799b();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m407n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ja0.f2600a;
        setMeasuredDimension(AbstractC0540nz.m1957g(i, paddingRight, s90.m2313e(this)), AbstractC0540nz.m1957g(i2, getPaddingBottom() + getPaddingTop(), s90.m2312d(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039a  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [b00] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m408o() {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m408o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f560A = r0
            r1 = 1
            r5.f613p = r1
            boolean r2 = r5.f617r
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f617r = r2
            nz r2 = r5.f605l
            if (r2 == 0) goto L21
            r2.f3461g = r1
            r2.mo744O(r5)
        L21:
            r5.f600i0 = r0
            java.lang.ThreadLocal r0 = p000.RunnableC0157dn.f1607e
            java.lang.Object r1 = r0.get()
            dn r1 = (p000.RunnableC0157dn) r1
            r5.f584a0 = r1
            if (r1 != 0) goto L6b
            dn r1 = new dn
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1609a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1612d = r2
            r5.f584a0 = r1
            java.util.WeakHashMap r1 = p000.ja0.f2600a
            android.view.Display r1 = p000.t90.m2365b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            dn r2 = r5.f584a0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f1611c = r3
            r0.set(r2)
        L6b:
            dn r0 = r5.f584a0
            java.util.ArrayList r0 = r0.f1609a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0939yq c0939yq;
        super.onDetachedFromWindow();
        AbstractC0392jz abstractC0392jz = this.f567H;
        if (abstractC0392jz != null) {
            abstractC0392jz.mo1614e();
        }
        setScrollState(0);
        a00 a00Var = this.f582W;
        a00Var.f9g.removeCallbacks(a00Var);
        a00Var.f5c.abortAnimation();
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null && (c0939yq = abstractC0540nz.f3459e) != null) {
            c0939yq.m2737i();
        }
        this.f613p = false;
        AbstractC0540nz abstractC0540nz2 = this.f605l;
        if (abstractC0540nz2 != null) {
            abstractC0540nz2.f3461g = false;
            abstractC0540nz2.mo339P(this);
        }
        this.f614p0.clear();
        removeCallbacks(this.f616q0);
        this.f593f.getClass();
        while (oa0.f3518d.mo2338a() != null) {
        }
        RunnableC0157dn runnableC0157dn = this.f584a0;
        if (runnableC0157dn != null) {
            runnableC0157dn.f1609a.remove(this);
            this.f584a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f607m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0429kz) arrayList.get(i)).mo1731a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            nz r0 = r5.f605l
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.f621u
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            nz r0 = r5.f605l
            boolean r0 = r0.mo356e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            nz r3 = r5.f605l
            boolean r3 = r3.mo355d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            nz r3 = r5.f605l
            boolean r3 = r3.mo356e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            nz r3 = r5.f605l
            boolean r3 = r3.mo355d()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.f579T
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f580U
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m393W(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f621u) {
            this.f611o = null;
            if (m374B(motionEvent)) {
                m392V();
                setScrollState(0);
                return true;
            }
            AbstractC0540nz abstractC0540nz = this.f605l;
            if (abstractC0540nz != null) {
                boolean zMo355d = abstractC0540nz.mo355d();
                boolean zMo356e = this.f605l.mo356e();
                if (this.f570K == null) {
                    this.f570K = VelocityTracker.obtain();
                }
                this.f570K.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f622v) {
                        this.f622v = false;
                    }
                    this.f569J = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f573N = x;
                    this.f571L = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f574O = y;
                    this.f572M = y;
                    if (this.f568I == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m399c0(1);
                    }
                    int[] iArr = this.f610n0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zMo355d;
                    if (zMo356e) {
                        i = (zMo355d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m1524g(i, 0);
                } else if (actionMasked == 1) {
                    this.f570K.clear();
                    m399c0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f569J);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f569J + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f568I != 1) {
                        int i2 = x2 - this.f571L;
                        int i3 = y2 - this.f572M;
                        if (!zMo355d || Math.abs(i2) <= this.f575P) {
                            z = false;
                        } else {
                            this.f573N = x2;
                            z = true;
                        }
                        if (zMo356e && Math.abs(i3) > this.f575P) {
                            this.f574O = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    m392V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f569J = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f573N = x3;
                    this.f571L = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f574O = y3;
                    this.f572M = y3;
                } else if (actionMasked == 6) {
                    m388R(motionEvent);
                }
                if (this.f568I == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = n70.f3350a;
        m70.m1798a("RV OnLayout");
        m408o();
        m70.m1799b();
        this.f617r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz == null) {
            m407n(i, i2);
            return;
        }
        boolean zMo333J = abstractC0540nz.mo333J();
        C0948yz c0948yz = this.f588c0;
        if (!zMo333J) {
            if (this.f615q) {
                this.f605l.f3456b.m407n(i, i2);
                return;
            }
            if (c0948yz.f5425k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0242fz abstractC0242fz = this.f603k;
            if (abstractC0242fz != null) {
                c0948yz.f5419e = abstractC0242fz.mo757a();
            } else {
                c0948yz.f5419e = 0;
            }
            m397a0();
            this.f605l.f3456b.m407n(i, i2);
            m398b0(false);
            c0948yz.f5421g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f605l.f3456b.m407n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f603k == null) {
            return;
        }
        if (c0948yz.f5418d == 1) {
            m409p();
        }
        this.f605l.m1973o0(i, i2);
        c0948yz.f5423i = true;
        m410q();
        this.f605l.m1975q0(i, i2);
        if (this.f605l.mo363t0()) {
            this.f605l.m1973o0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c0948yz.f5423i = true;
            m410q();
            this.f605l.m1975q0(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m382L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0837vz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0837vz c0837vz = (C0837vz) parcelable;
        this.f587c = c0837vz;
        super.onRestoreInstanceState(c0837vz.f1344a);
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz == null || (parcelable2 = this.f587c.f4890c) == null) {
            return;
        }
        abstractC0540nz.mo351b0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0837vz c0837vz = new C0837vz(super.onSaveInstanceState());
        C0837vz c0837vz2 = this.f587c;
        if (c0837vz2 != null) {
            c0837vz.f4890c = c0837vz2.f4890c;
            return c0837vz;
        }
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null) {
            c0837vz.f4890c = abstractC0540nz.mo354c0();
            return c0837vz;
        }
        c0837vz.f4890c = null;
        return c0837vz;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f566G = null;
        this.f564E = null;
        this.f565F = null;
        this.f563D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8 A[PHI: r1
  0x01f8: PHI (r1v53 int) = (r1v38 int), (r1v57 int) binds: [B:90:0x01e1, B:94:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instruction units count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m409p() {
        /*
            Method dump skipped, instruction units count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m409p():void");
    }

    /* JADX INFO: renamed from: q */
    public final void m410q() {
        m397a0();
        m386P();
        C0948yz c0948yz = this.f588c0;
        c0948yz.m2744a(6);
        this.f589d.m2644b();
        c0948yz.f5419e = this.f603k.mo757a();
        c0948yz.f5417c = 0;
        c0948yz.f5421g = false;
        this.f605l.mo299Z(this.f585b, c0948yz);
        c0948yz.f5420f = false;
        this.f587c = null;
        c0948yz.f5424j = c0948yz.f5424j && this.f567H != null;
        c0948yz.f5418d = 4;
        m387Q(true);
        m398b0(false);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m411r(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m1520c(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        b00 b00VarM367I = m367I(view);
        if (b00VarM367I != null) {
            if (b00VarM367I.m490j()) {
                b00VarM367I.f706j &= -257;
            } else if (!b00VarM367I.m495o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + b00VarM367I + m418y());
            }
        }
        view.clearAnimation();
        m367I(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0939yq c0939yq = this.f605l.f3459e;
        if ((c0939yq == null || !c0939yq.f5383e) && !m382L() && view2 != null) {
            m391U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f605l.mo745i0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f609n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0858wj) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f619s != 0 || this.f621u) {
            this.f620t = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m412s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m1521d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f621u) {
            return;
        }
        boolean zMo355d = abstractC0540nz.mo355d();
        boolean zMo356e = this.f605l.mo356e();
        if (zMo355d || zMo356e) {
            if (!zMo355d) {
                i = 0;
            }
            if (!zMo356e) {
                i2 = 0;
            }
            m393W(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m382L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iM2639a = accessibilityEvent != null ? AbstractC0912y.m2639a(accessibilityEvent) : 0;
            this.f623w |= iM2639a != 0 ? iM2639a : 0;
        }
    }

    public void setAccessibilityDelegateCompat(d00 d00Var) {
        this.f602j0 = d00Var;
        ja0.m1575l(this, d00Var);
    }

    public void setAdapter(AbstractC0242fz abstractC0242fz) {
        setLayoutFrozen(false);
        AbstractC0242fz abstractC0242fz2 = this.f603k;
        C0354iy c0354iy = this.f583a;
        if (abstractC0242fz2 != null) {
            abstractC0242fz2.f1997a.unregisterObserver(c0354iy);
            this.f603k.getClass();
        }
        AbstractC0392jz abstractC0392jz = this.f567H;
        if (abstractC0392jz != null) {
            abstractC0392jz.mo1614e();
        }
        AbstractC0540nz abstractC0540nz = this.f605l;
        C0763tz c0763tz = this.f585b;
        if (abstractC0540nz != null) {
            abstractC0540nz.m1967e0(c0763tz);
            this.f605l.m1968f0(c0763tz);
        }
        c0763tz.f4633a.clear();
        c0763tz.m2396d();
        C0914y1 c0914y1 = this.f589d;
        c0914y1.m2651i((ArrayList) c0914y1.f5247c);
        c0914y1.m2651i((ArrayList) c0914y1.f5248d);
        AbstractC0242fz abstractC0242fz3 = this.f603k;
        this.f603k = abstractC0242fz;
        if (abstractC0242fz != null) {
            abstractC0242fz.f1997a.registerObserver(c0354iy);
        }
        AbstractC0242fz abstractC0242fz4 = this.f603k;
        c0763tz.f4633a.clear();
        c0763tz.m2396d();
        C0726sz c0726szM2395c = c0763tz.m2395c();
        if (abstractC0242fz3 != null) {
            c0726szM2395c.f4473b--;
        }
        if (c0726szM2395c.f4473b == 0) {
            SparseArray sparseArray = c0726szM2395c.f4472a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((C0689rz) sparseArray.valueAt(i)).f4358a.clear();
            }
        }
        if (abstractC0242fz4 != null) {
            c0726szM2395c.f4473b++;
        }
        this.f588c0.f5420f = true;
        this.f626z |= false;
        this.f625y = true;
        int iM2240t = this.f591e.m2240t();
        for (int i2 = 0; i2 < iM2240t; i2++) {
            b00 b00VarM367I = m367I(this.f591e.m2239s(i2));
            if (b00VarM367I != null && !b00VarM367I.m495o()) {
                b00VarM367I.m481a(6);
            }
        }
        m384N();
        C0763tz c0763tz2 = this.f585b;
        ArrayList arrayList = c0763tz2.f4635c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            b00 b00Var = (b00) arrayList.get(i3);
            if (b00Var != null) {
                b00Var.m481a(6);
                b00Var.m481a(1024);
            }
        }
        AbstractC0242fz abstractC0242fz5 = c0763tz2.f4640h.f603k;
        if (abstractC0242fz5 == null || !abstractC0242fz5.f1998b) {
            c0763tz2.m2396d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0316hz interfaceC0316hz) {
        if (interfaceC0316hz == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f595g) {
            this.f566G = null;
            this.f564E = null;
            this.f565F = null;
            this.f563D = null;
        }
        this.f595g = z;
        super.setClipToPadding(z);
        if (this.f617r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0355iz c0355iz) {
        c0355iz.getClass();
        this.f562C = c0355iz;
        this.f566G = null;
        this.f564E = null;
        this.f565F = null;
        this.f563D = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f615q = z;
    }

    public void setItemAnimator(AbstractC0392jz abstractC0392jz) {
        AbstractC0392jz abstractC0392jz2 = this.f567H;
        if (abstractC0392jz2 != null) {
            abstractC0392jz2.mo1614e();
            this.f567H.f2677a = null;
        }
        this.f567H = abstractC0392jz;
        if (abstractC0392jz != null) {
            abstractC0392jz.f2677a = this.f598h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0763tz c0763tz = this.f585b;
        c0763tz.f4637e = i;
        c0763tz.m2403k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0540nz abstractC0540nz) {
        C0939yq c0939yq;
        if (abstractC0540nz == this.f605l) {
            return;
        }
        setScrollState(0);
        a00 a00Var = this.f582W;
        a00Var.f9g.removeCallbacks(a00Var);
        a00Var.f5c.abortAnimation();
        AbstractC0540nz abstractC0540nz2 = this.f605l;
        if (abstractC0540nz2 != null && (c0939yq = abstractC0540nz2.f3459e) != null) {
            c0939yq.m2737i();
        }
        AbstractC0540nz abstractC0540nz3 = this.f605l;
        C0763tz c0763tz = this.f585b;
        if (abstractC0540nz3 != null) {
            AbstractC0392jz abstractC0392jz = this.f567H;
            if (abstractC0392jz != null) {
                abstractC0392jz.mo1614e();
            }
            this.f605l.m1967e0(c0763tz);
            this.f605l.m1968f0(c0763tz);
            c0763tz.f4633a.clear();
            c0763tz.m2396d();
            if (this.f613p) {
                AbstractC0540nz abstractC0540nz4 = this.f605l;
                abstractC0540nz4.f3461g = false;
                abstractC0540nz4.mo339P(this);
            }
            this.f605l.m1976r0(null);
            this.f605l = null;
        } else {
            c0763tz.f4633a.clear();
            c0763tz.m2396d();
        }
        C0659r5 c0659r5 = this.f591e;
        RecyclerView recyclerView = ((C0205ez) c0659r5.f4209b).f1865a;
        ((C0217fa) c0659r5.f4210c).m1150g();
        ArrayList arrayList = (ArrayList) c0659r5.f4211d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b00 b00VarM367I = m367I((View) arrayList.get(size));
            if (b00VarM367I != null) {
                int i = b00VarM367I.f712p;
                if (recyclerView.m382L()) {
                    b00VarM367I.f713q = i;
                    recyclerView.f614p0.add(b00VarM367I);
                } else {
                    View view = b00VarM367I.f697a;
                    WeakHashMap weakHashMap = ja0.f2600a;
                    s90.m2327s(view, i);
                }
                b00VarM367I.f712p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            m367I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f605l = abstractC0540nz;
        if (abstractC0540nz != null) {
            if (abstractC0540nz.f3456b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0540nz + " is already attached to a RecyclerView:" + abstractC0540nz.f3456b.m418y());
            }
            abstractC0540nz.m1976r0(this);
            if (this.f613p) {
                AbstractC0540nz abstractC0540nz5 = this.f605l;
                abstractC0540nz5.f3461g = true;
                abstractC0540nz5.mo744O(this);
            }
        }
        c0763tz.m2403k();
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
    public void setNestedScrollingEnabled(boolean z) {
        C0352iw scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2508d) {
            ViewGroup viewGroup = scrollingChildHelper.f2507c;
            WeakHashMap weakHashMap = ja0.f2600a;
            y90.m2680z(viewGroup);
        }
        scrollingChildHelper.f2508d = z;
    }

    public void setOnFlingListener(AbstractC0615pz abstractC0615pz) {
        this.f576Q = abstractC0615pz;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0652qz abstractC0652qz) {
        this.f590d0 = abstractC0652qz;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f581V = z;
    }

    public void setRecycledViewPool(C0726sz c0726sz) {
        C0763tz c0763tz = this.f585b;
        if (c0763tz.f4639g != null) {
            r1.f4473b--;
        }
        c0763tz.f4639g = c0726sz;
        if (c0726sz == null || c0763tz.f4640h.getAdapter() == null) {
            return;
        }
        c0763tz.f4639g.f4473b++;
    }

    public void setScrollState(int i) {
        C0939yq c0939yq;
        if (i == this.f568I) {
            return;
        }
        this.f568I = i;
        if (i != 2) {
            a00 a00Var = this.f582W;
            a00Var.f9g.removeCallbacks(a00Var);
            a00Var.f5c.abortAnimation();
            AbstractC0540nz abstractC0540nz = this.f605l;
            if (abstractC0540nz != null && (c0939yq = abstractC0540nz.f3459e) != null) {
                c0939yq.m2737i();
            }
        }
        AbstractC0540nz abstractC0540nz2 = this.f605l;
        if (abstractC0540nz2 != null) {
            abstractC0540nz2.mo447d0(i);
        }
        AbstractC0652qz abstractC0652qz = this.f590d0;
        if (abstractC0652qz != null) {
            abstractC0652qz.mo2184a(this, i);
        }
        ArrayList arrayList = this.f592e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0652qz) this.f592e0.get(size)).mo2184a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f575P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f575P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0985zz abstractC0985zz) {
        this.f585b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m1524g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m1525h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        C0939yq c0939yq;
        if (z != this.f621u) {
            m403i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f621u = false;
                if (this.f620t && this.f605l != null && this.f603k != null) {
                    requestLayout();
                }
                this.f620t = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f621u = true;
            this.f622v = true;
            setScrollState(0);
            a00 a00Var = this.f582W;
            a00Var.f9g.removeCallbacks(a00Var);
            a00Var.f5c.abortAnimation();
            AbstractC0540nz abstractC0540nz = this.f605l;
            if (abstractC0540nz == null || (c0939yq = abstractC0540nz.f3459e) == null) {
                return;
            }
            c0939yq.m2737i();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m413t(int i, int i2) {
        this.f561B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC0652qz abstractC0652qz = this.f590d0;
        if (abstractC0652qz != null) {
            abstractC0652qz.mo2185b(this, i, i2);
        }
        ArrayList arrayList = this.f592e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0652qz) this.f592e0.get(size)).mo2185b(this, i, i2);
            }
        }
        this.f561B--;
    }

    /* JADX INFO: renamed from: u */
    public final void m414u() {
        if (this.f566G != null) {
            return;
        }
        this.f562C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f566G = edgeEffect;
        if (this.f595g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m415v() {
        if (this.f563D != null) {
            return;
        }
        this.f562C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f563D = edgeEffect;
        if (this.f595g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m416w() {
        if (this.f565F != null) {
            return;
        }
        this.f562C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f565F = edgeEffect;
        if (this.f595g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m417x() {
        if (this.f564E != null) {
            return;
        }
        this.f562C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f564E = edgeEffect;
        if (this.f595g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: y */
    public final String m418y() {
        return " " + super.toString() + ", adapter:" + this.f603k + ", layout:" + this.f605l + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: z */
    public final void m419z(C0948yz c0948yz) {
        if (getScrollState() != 2) {
            c0948yz.getClass();
            return;
        }
        OverScroller overScroller = this.f582W.f5c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0948yz.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        char c;
        TypedArray typedArray;
        char c2;
        char c3;
        int i2;
        int i3;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f583a = new C0354iy(this);
        this.f585b = new C0763tz(this);
        this.f593f = new C0138d4(19);
        this.f597h = new Rect();
        this.f599i = new Rect();
        this.f601j = new RectF();
        this.f607m = new ArrayList();
        this.f609n = new ArrayList();
        this.f619s = 0;
        this.f625y = false;
        this.f626z = false;
        this.f560A = 0;
        this.f561B = 0;
        this.f562C = new C0355iz();
        C0780uf c0780uf = new C0780uf();
        Object[] objArr = null;
        c0780uf.f2677a = null;
        c0780uf.f2678b = new ArrayList();
        c0780uf.f2679c = 120L;
        c0780uf.f2680d = 120L;
        c0780uf.f2681e = 250L;
        c0780uf.f2682f = 250L;
        c0780uf.f4717g = true;
        c0780uf.f4718h = new ArrayList();
        c0780uf.f4719i = new ArrayList();
        c0780uf.f4720j = new ArrayList();
        c0780uf.f4721k = new ArrayList();
        c0780uf.f4722l = new ArrayList();
        c0780uf.f4723m = new ArrayList();
        c0780uf.f4724n = new ArrayList();
        c0780uf.f4725o = new ArrayList();
        c0780uf.f4726p = new ArrayList();
        c0780uf.f4727q = new ArrayList();
        c0780uf.f4728r = new ArrayList();
        this.f567H = c0780uf;
        this.f568I = 0;
        this.f569J = -1;
        this.f579T = Float.MIN_VALUE;
        this.f580U = Float.MIN_VALUE;
        this.f581V = true;
        this.f582W = new a00(this);
        this.f586b0 = new C0074bn();
        C0948yz c0948yz = new C0948yz();
        c0948yz.f5415a = -1;
        c0948yz.f5416b = 0;
        c0948yz.f5417c = 0;
        c0948yz.f5418d = 1;
        c0948yz.f5419e = 0;
        c0948yz.f5420f = false;
        c0948yz.f5421g = false;
        c0948yz.f5422h = false;
        c0948yz.f5423i = false;
        c0948yz.f5424j = false;
        c0948yz.f5425k = false;
        this.f588c0 = c0948yz;
        this.f594f0 = false;
        this.f596g0 = false;
        C0205ez c0205ez = new C0205ez(this);
        this.f598h0 = c0205ez;
        this.f600i0 = false;
        this.f604k0 = new int[2];
        this.f608m0 = new int[2];
        this.f610n0 = new int[2];
        this.f612o0 = new int[2];
        this.f614p0 = new ArrayList();
        this.f616q0 = new RunnableC0919y6(8, this);
        this.f618r0 = new C0205ez(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f575P = viewConfiguration.getScaledTouchSlop();
        this.f579T = ka0.m1687a(viewConfiguration);
        this.f580U = ka0.m1688b(viewConfiguration);
        this.f577R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f578S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f567H.f2677a = c0205ez;
        this.f589d = new C0914y1(new C0205ez(this));
        this.f591e = new C0659r5(new C0205ez(this));
        WeakHashMap weakHashMap = ja0.f2600a;
        if (aa0.m68b(this) == 0) {
            aa0.m78l(this, 8);
        }
        if (s90.m2311c(this) == 0) {
            s90.m2327s(this, 1);
        }
        this.f624x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new d00(this));
        int[] iArr = AbstractC0836vy.f4889a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f595g = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m418y());
            }
            Resources resources = getContext().getResources();
            c3 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            c = 3;
            i2 = i;
            c2 = 1;
            i3 = 4;
            new C0858wj(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            typedArray = typedArrayObtainStyledAttributes;
            c2 = 1;
            c3 = 2;
            i2 = i;
            i3 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0540nz.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(f558t0);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = context;
                        objArr2[c2] = attributeSet;
                        objArr2[c3] = Integer.valueOf(i2);
                        objArr2[c] = 0;
                        objArr = objArr2;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(c2);
                    setLayoutManager((AbstractC0540nz) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        int[] iArr2 = f557s0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        if (i4 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
        }
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0540nz abstractC0540nz = this.f605l;
        if (abstractC0540nz != null) {
            return abstractC0540nz.mo320t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m418y());
    }

    public void setRecyclerListener(InterfaceC0800uz interfaceC0800uz) {
    }
}
