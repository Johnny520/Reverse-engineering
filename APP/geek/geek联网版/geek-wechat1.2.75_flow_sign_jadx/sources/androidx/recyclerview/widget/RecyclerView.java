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
import p000.AbstractC0132cz;
import p000.AbstractC0503mz;
import p000.AbstractC0651qz;
import p000.AbstractC0688rz;
import p000.AbstractC0799uz;
import p000.AbstractC0874wz;
import p000.AbstractC0911xz;
import p000.AbstractC0912y;
import p000.C0124cr;
import p000.C0138d4;
import p000.C0157dn;
import p000.C0235fs;
import p000.C0426kw;
import p000.C0466lz;
import p000.C0515na;
import p000.C0614pz;
import p000.C0648qw;
import p000.C0658r5;
import p000.C0759tw;
import p000.C0816vf;
import p000.C0836vz;
import p000.C0877x1;
import p000.C0914y1;
import p000.C0932yj;
import p000.C0948yz;
import p000.C0985zz;
import p000.InterfaceC0577oz;
import p000.InterpolatorC0429kz;
import p000.RunnableC0230fn;
import p000.RunnableC0325i7;
import p000.a00;
import p000.b00;
import p000.b40;
import p000.c00;
import p000.da0;
import p000.f00;
import p000.fa0;
import p000.g00;
import p000.h00;
import p000.i00;
import p000.k00;
import p000.oa0;
import p000.pa0;
import p000.s70;
import p000.t70;
import p000.ta0;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: s0 */
    public static final int[] f520s0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: t0 */
    public static final Class[] f521t0;

    /* JADX INFO: renamed from: u0 */
    public static final InterpolatorC0429kz f522u0;

    /* JADX INFO: renamed from: A */
    public int f523A;

    /* JADX INFO: renamed from: B */
    public int f524B;

    /* JADX INFO: renamed from: C */
    public C0614pz f525C;

    /* JADX INFO: renamed from: D */
    public EdgeEffect f526D;

    /* JADX INFO: renamed from: E */
    public EdgeEffect f527E;

    /* JADX INFO: renamed from: F */
    public EdgeEffect f528F;

    /* JADX INFO: renamed from: G */
    public EdgeEffect f529G;

    /* JADX INFO: renamed from: H */
    public AbstractC0651qz f530H;

    /* JADX INFO: renamed from: I */
    public int f531I;

    /* JADX INFO: renamed from: J */
    public int f532J;

    /* JADX INFO: renamed from: K */
    public VelocityTracker f533K;

    /* JADX INFO: renamed from: L */
    public int f534L;

    /* JADX INFO: renamed from: M */
    public int f535M;

    /* JADX INFO: renamed from: N */
    public int f536N;

    /* JADX INFO: renamed from: O */
    public int f537O;

    /* JADX INFO: renamed from: P */
    public int f538P;

    /* JADX INFO: renamed from: Q */
    public AbstractC0874wz f539Q;

    /* JADX INFO: renamed from: R */
    public final int f540R;

    /* JADX INFO: renamed from: S */
    public final int f541S;

    /* JADX INFO: renamed from: T */
    public final float f542T;

    /* JADX INFO: renamed from: U */
    public final float f543U;

    /* JADX INFO: renamed from: V */
    public boolean f544V;

    /* JADX INFO: renamed from: W */
    public final h00 f545W;

    /* JADX INFO: renamed from: a */
    public final C0426kw f546a;

    /* JADX INFO: renamed from: a0 */
    public RunnableC0230fn f547a0;

    /* JADX INFO: renamed from: b */
    public final a00 f548b;

    /* JADX INFO: renamed from: b0 */
    public final C0157dn f549b0;

    /* JADX INFO: renamed from: c */
    public c00 f550c;

    /* JADX INFO: renamed from: c0 */
    public final f00 f551c0;

    /* JADX INFO: renamed from: d */
    public final C0914y1 f552d;

    /* JADX INFO: renamed from: d0 */
    public AbstractC0911xz f553d0;

    /* JADX INFO: renamed from: e */
    public final C0658r5 f554e;

    /* JADX INFO: renamed from: e0 */
    public ArrayList f555e0;

    /* JADX INFO: renamed from: f */
    public final C0138d4 f556f;

    /* JADX INFO: renamed from: f0 */
    public boolean f557f0;

    /* JADX INFO: renamed from: g */
    public boolean f558g;

    /* JADX INFO: renamed from: g0 */
    public boolean f559g0;

    /* JADX INFO: renamed from: h */
    public final Rect f560h;

    /* JADX INFO: renamed from: h0 */
    public final C0466lz f561h0;

    /* JADX INFO: renamed from: i */
    public final Rect f562i;

    /* JADX INFO: renamed from: i0 */
    public boolean f563i0;

    /* JADX INFO: renamed from: j */
    public final RectF f564j;

    /* JADX INFO: renamed from: j0 */
    public k00 f565j0;

    /* JADX INFO: renamed from: k */
    public AbstractC0503mz f566k;

    /* JADX INFO: renamed from: k0 */
    public final int[] f567k0;

    /* JADX INFO: renamed from: l */
    public AbstractC0799uz f568l;

    /* JADX INFO: renamed from: l0 */
    public C0648qw f569l0;

    /* JADX INFO: renamed from: m */
    public final ArrayList f570m;

    /* JADX INFO: renamed from: m0 */
    public final int[] f571m0;

    /* JADX INFO: renamed from: n */
    public final ArrayList f572n;

    /* JADX INFO: renamed from: n0 */
    public final int[] f573n0;

    /* JADX INFO: renamed from: o */
    public C0932yj f574o;

    /* JADX INFO: renamed from: o0 */
    public final int[] f575o0;

    /* JADX INFO: renamed from: p */
    public boolean f576p;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f577p0;

    /* JADX INFO: renamed from: q */
    public boolean f578q;

    /* JADX INFO: renamed from: q0 */
    public final RunnableC0325i7 f579q0;

    /* JADX INFO: renamed from: r */
    public boolean f580r;

    /* JADX INFO: renamed from: r0 */
    public final C0466lz f581r0;

    /* JADX INFO: renamed from: s */
    public int f582s;

    /* JADX INFO: renamed from: t */
    public boolean f583t;

    /* JADX INFO: renamed from: u */
    public boolean f584u;

    /* JADX INFO: renamed from: v */
    public boolean f585v;

    /* JADX INFO: renamed from: w */
    public int f586w;

    /* JADX INFO: renamed from: x */
    public final AccessibilityManager f587x;

    /* JADX INFO: renamed from: y */
    public boolean f588y;

    /* JADX INFO: renamed from: z */
    public boolean f589z;

    static {
        Class cls = Integer.TYPE;
        f521t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f522u0 = new InterpolatorC0429kz(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ljx.wechatmod.R.attr.recyclerViewStyle);
    }

    /* JADX INFO: renamed from: D */
    public static RecyclerView m351D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM351D = m351D(viewGroup.getChildAt(i));
            if (recyclerViewM351D != null) {
                return recyclerViewM351D;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static i00 m352I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0836vz) view.getLayoutParams()).f5017a;
    }

    private C0648qw getScrollingChildHelper() {
        if (this.f569l0 == null) {
            this.f569l0 = new C0648qw(this);
        }
        return this.f569l0;
    }

    /* JADX INFO: renamed from: j */
    public static void m357j(i00 i00Var) {
        WeakReference weakReference = i00Var.f2297b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == i00Var.f2296a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            i00Var.f2297b = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final View m358A(View view) {
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
    public final boolean m359B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f572n
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            yj r5 = (p000.C0932yj) r5
            int r6 = r5.f5458v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.m2767d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.m2766c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f5459w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f5452p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f5459w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f5449m = r6
        L55:
            r5.m2768f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f574o = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m359B(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: C */
    public final void m360C(int[] iArr) {
        int iM2239k = this.f554e.m2239k();
        if (iM2239k == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM2239k; i3++) {
            i00 i00VarM352I = m352I(this.f554e.m2238j(i3));
            if (!i00VarM352I.m1433o()) {
                int iM1420b = i00VarM352I.m1420b();
                if (iM1420b < i) {
                    i = iM1420b;
                }
                if (iM1420b > i2) {
                    i2 = iM1420b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: E */
    public final i00 m361E(int i) {
        i00 i00Var = null;
        if (this.f588y) {
            return null;
        }
        int iM2247t = this.f554e.m2247t();
        for (int i2 = 0; i2 < iM2247t; i2++) {
            i00 i00VarM352I = m352I(this.f554e.m2246s(i2));
            if (i00VarM352I != null && !i00VarM352I.m1426h() && m362F(i00VarM352I) == i) {
                if (!((ArrayList) this.f554e.f4066d).contains(i00VarM352I.f2296a)) {
                    return i00VarM352I;
                }
                i00Var = i00VarM352I;
            }
        }
        return i00Var;
    }

    /* JADX INFO: renamed from: F */
    public final int m362F(i00 i00Var) {
        if ((i00Var.f2305j & 524) == 0 && i00Var.m1423e()) {
            int i = i00Var.f2298c;
            ArrayList arrayList = (ArrayList) this.f552d.f5324c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0877x1 c0877x1 = (C0877x1) arrayList.get(i2);
                int i3 = c0877x1.f5152a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = c0877x1.f5153b;
                        if (i4 <= i) {
                            int i5 = c0877x1.f5154c;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = c0877x1.f5153b;
                        if (i6 == i) {
                            i = c0877x1.f5154c;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (c0877x1.f5154c <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c0877x1.f5153b <= i) {
                    i += c0877x1.f5154c;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public final long m363G(i00 i00Var) {
        return this.f566k.f3197b ? i00Var.f2300e : i00Var.f2298c;
    }

    /* JADX INFO: renamed from: H */
    public final i00 m364H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m352I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX INFO: renamed from: J */
    public final Rect m365J(View view) {
        C0836vz c0836vz = (C0836vz) view.getLayoutParams();
        boolean z = c0836vz.f5019c;
        Rect rect = c0836vz.f5018b;
        if (!z || (this.f551c0.f1711g && (c0836vz.f5017a.m1429k() || c0836vz.f5017a.m1424f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f570m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f560h;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0688rz) arrayList.get(i)).getClass();
            ((C0836vz) view.getLayoutParams()).f5017a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0836vz.f5019c = false;
        return rect;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m366K() {
        return !this.f580r || this.f588y || this.f552d.m2718f();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m367L() {
        return this.f523A > 0;
    }

    /* JADX INFO: renamed from: M */
    public final void m368M(int i) {
        if (this.f568l == null) {
            return;
        }
        setScrollState(2);
        this.f568l.mo345l0(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: N */
    public final void m369N() {
        int iM2247t = this.f554e.m2247t();
        for (int i = 0; i < iM2247t; i++) {
            ((C0836vz) this.f554e.m2246s(i).getLayoutParams()).f5019c = true;
        }
        ArrayList arrayList = this.f548b.f5c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0836vz c0836vz = (C0836vz) ((i00) arrayList.get(i2)).f2296a.getLayoutParams();
            if (c0836vz != null) {
                c0836vz.f5019c = true;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m370O(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM2247t = this.f554e.m2247t();
        for (int i4 = 0; i4 < iM2247t; i4++) {
            i00 i00VarM352I = m352I(this.f554e.m2246s(i4));
            if (i00VarM352I != null && !i00VarM352I.m1433o()) {
                int i5 = i00VarM352I.f2298c;
                f00 f00Var = this.f551c0;
                if (i5 >= i3) {
                    i00VarM352I.m1430l(-i2, z);
                    f00Var.f1710f = true;
                } else if (i5 >= i) {
                    i00VarM352I.m1419a(8);
                    i00VarM352I.m1430l(-i2, z);
                    i00VarM352I.f2298c = i - 1;
                    f00Var.f1710f = true;
                }
            }
        }
        a00 a00Var = this.f548b;
        ArrayList arrayList = a00Var.f5c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i00 i00Var = (i00) arrayList.get(size);
            if (i00Var != null) {
                int i6 = i00Var.f2298c;
                if (i6 >= i3) {
                    i00Var.m1430l(-i2, z);
                } else if (i6 >= i) {
                    i00Var.m1419a(8);
                    a00Var.m7e(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: P */
    public final void m371P() {
        this.f523A++;
    }

    /* JADX INFO: renamed from: Q */
    public final void m372Q(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f523A - 1;
        this.f523A = i2;
        if (i2 < 1) {
            this.f523A = 0;
            if (z) {
                int i3 = this.f586w;
                this.f586w = 0;
                if (i3 != 0 && (accessibilityManager = this.f587x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    AbstractC0912y.m2712b(accessibilityEventObtain, i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f577p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i00 i00Var = (i00) arrayList.get(size);
                    if (i00Var.f2296a.getParent() == this && !i00Var.m1433o() && (i = i00Var.f2312q) != -1) {
                        View view = i00Var.f2296a;
                        WeakHashMap weakHashMap = oa0.f3426a;
                        x90.m2671s(view, i);
                        i00Var.f2312q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m373R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f532J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f532J = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f536N = x;
            this.f534L = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f537O = y;
            this.f535M = y;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m374S() {
        if (this.f563i0 || !this.f576p) {
            return;
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2665m(this, this.f579q0);
        this.f563i0 = true;
    }

    /* JADX INFO: renamed from: T */
    public final void m375T(i00 i00Var, C0759tw c0759tw) {
        i00Var.f2305j &= -8193;
        boolean z = this.f551c0.f1712h;
        C0138d4 c0138d4 = this.f556f;
        if (z && i00Var.m1429k() && !i00Var.m1426h() && !i00Var.m1433o()) {
            ((C0235fs) c0138d4.f1298c).m1110d(m363G(i00Var), i00Var);
        }
        b40 b40Var = (b40) c0138d4.f1297b;
        ta0 ta0VarM2405a = (ta0) b40Var.getOrDefault(i00Var, null);
        if (ta0VarM2405a == null) {
            ta0VarM2405a = ta0.m2405a();
            b40Var.put(i00Var, ta0VarM2405a);
        }
        ta0VarM2405a.f4435b = c0759tw;
        ta0VarM2405a.f4434a |= 4;
    }

    /* JADX INFO: renamed from: U */
    public final void m376U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f560h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0836vz) {
            C0836vz c0836vz = (C0836vz) layoutParams;
            if (!c0836vz.f5019c) {
                Rect rect2 = c0836vz.f5018b;
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
        this.f568l.mo703i0(this, view, this.f560h, !this.f580r, view2 == null);
    }

    /* JADX INFO: renamed from: V */
    public final void m377V() {
        VelocityTracker velocityTracker = this.f533K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m384c0(0);
        EdgeEffect edgeEffect = this.f526D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f526D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f527E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f527E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f528F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f528F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f529G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f529G.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = oa0.f3426a;
            x90.m2663k(this);
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
    public final boolean m378W(int r17, int r18, android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m378W(int, int, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: X */
    public final void m379X(int i, int i2, int[] iArr) {
        i00 i00Var;
        m382a0();
        m371P();
        int i3 = t70.f4419a;
        s70.m2309a("RV Scroll");
        f00 f00Var = this.f551c0;
        m404z(f00Var);
        a00 a00Var = this.f548b;
        int iMo296k0 = i != 0 ? this.f568l.mo296k0(i, a00Var, f00Var) : 0;
        int iMo299m0 = i2 != 0 ? this.f568l.mo299m0(i2, a00Var, f00Var) : 0;
        s70.m2310b();
        C0658r5 c0658r5 = this.f554e;
        int iM2239k = c0658r5.m2239k();
        for (int i4 = 0; i4 < iM2239k; i4++) {
            View viewM2238j = c0658r5.m2238j(i4);
            i00 i00VarM364H = m364H(viewM2238j);
            if (i00VarM364H != null && (i00Var = i00VarM364H.f2304i) != null) {
                View view = i00Var.f2296a;
                int left = viewM2238j.getLeft();
                int top = viewM2238j.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m372Q(true);
        m383b0(false);
        if (iArr != null) {
            iArr[0] = iMo296k0;
            iArr[1] = iMo299m0;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m380Y(int i) {
        C0124cr c0124cr;
        if (this.f584u) {
            return;
        }
        setScrollState(0);
        h00 h00Var = this.f545W;
        h00Var.f2086g.removeCallbacks(h00Var);
        h00Var.f2082c.abortAnimation();
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null && (c0124cr = abstractC0799uz.f4859e) != null) {
            c0124cr.m778i();
        }
        AbstractC0799uz abstractC0799uz2 = this.f568l;
        if (abstractC0799uz2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0799uz2.mo345l0(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m381Z(int i, int i2, boolean z) {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f584u) {
            return;
        }
        if (!abstractC0799uz.mo340d()) {
            i = 0;
        }
        if (!this.f568l.mo341e()) {
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
            getScrollingChildHelper().m2186g(i3, 1);
        }
        this.f545W.m1350b(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m382a0() {
        int i = this.f582s + 1;
        this.f582s = i;
        if (i != 1 || this.f584u) {
            return;
        }
        this.f583t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null) {
            abstractC0799uz.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m383b0(boolean z) {
        if (this.f582s < 1) {
            this.f582s = 1;
        }
        if (!z && !this.f584u) {
            this.f583t = false;
        }
        if (this.f582s == 1) {
            if (z && this.f583t && !this.f584u && this.f568l != null && this.f566k != null) {
                m393o();
            }
            if (!this.f584u) {
                this.f583t = false;
            }
        }
        this.f582s--;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m384c0(int i) {
        getScrollingChildHelper().m2187h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0836vz) && this.f568l.mo289f((C0836vz) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null && abstractC0799uz.mo340d()) {
            return this.f568l.mo344j(this.f551c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null && abstractC0799uz.mo340d()) {
            return this.f568l.mo295k(this.f551c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null && abstractC0799uz.mo340d()) {
            return this.f568l.mo298l(this.f551c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null && abstractC0799uz.mo341e()) {
            return this.f568l.mo346m(this.f551c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null && abstractC0799uz.mo341e()) {
            return this.f568l.mo300n(this.f551c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null && abstractC0799uz.mo341e()) {
            return this.f568l.mo301o(this.f551c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m2180a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m2181b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2182c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m2183d(i, i2, i3, i4, iArr, 0, null);
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
        ArrayList arrayList = this.f570m;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0688rz) arrayList.get(i)).mo2302b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f526D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f558g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f526D;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f527E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f558g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f527E;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f528F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f558g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f528F;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f529G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f558g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f529G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f530H == null || arrayList.size() <= 0 || !this.f530H.mo2194f()) ? z : true) {
            WeakHashMap weakHashMap = oa0.f3426a;
            x90.m2663k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: renamed from: f */
    public final void m385f(i00 i00Var) {
        View view = i00Var.f2296a;
        boolean z = view.getParent() == this;
        this.f548b.m12j(m364H(view));
        if (i00Var.m1428j()) {
            this.f554e.m2231c(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f554e.m2230b(view, -1, true);
            return;
        }
        C0658r5 c0658r5 = this.f554e;
        int iIndexOfChild = ((C0466lz) c0658r5.f4064b).f3055a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0515na) c0658r5.f4065c).m1936h(iIndexOfChild);
            c0658r5.m2248u(view);
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
    public final void m386g(AbstractC0688rz abstractC0688rz) {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null) {
            abstractC0799uz.mo338c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f570m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0688rz);
        m369N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null) {
            return abstractC0799uz.mo303r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m403y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null) {
            return abstractC0799uz.mo304s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m403y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0503mz getAdapter() {
        return this.f566k;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz == null) {
            return super.getBaseline();
        }
        abstractC0799uz.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f558g;
    }

    public k00 getCompatAccessibilityDelegate() {
        return this.f565j0;
    }

    public C0614pz getEdgeEffectFactory() {
        return this.f525C;
    }

    public AbstractC0651qz getItemAnimator() {
        return this.f530H;
    }

    public int getItemDecorationCount() {
        return this.f570m.size();
    }

    public AbstractC0799uz getLayoutManager() {
        return this.f568l;
    }

    public int getMaxFlingVelocity() {
        return this.f541S;
    }

    public int getMinFlingVelocity() {
        return this.f540R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0874wz getOnFlingListener() {
        return this.f539Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f544V;
    }

    public C0985zz getRecycledViewPool() {
        return this.f548b.m5c();
    }

    public int getScrollState() {
        return this.f531I;
    }

    /* JADX INFO: renamed from: h */
    public final void m387h(AbstractC0911xz abstractC0911xz) {
        if (this.f555e0 == null) {
            this.f555e0 = new ArrayList();
        }
        this.f555e0.add(abstractC0911xz);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2185f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m388i(String str) {
        if (m367L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m403y());
        }
        if (this.f524B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m403y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f576p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f584u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3982d;
    }

    /* JADX INFO: renamed from: k */
    public final void m389k() {
        int iM2247t = this.f554e.m2247t();
        for (int i = 0; i < iM2247t; i++) {
            i00 i00VarM352I = m352I(this.f554e.m2246s(i));
            if (!i00VarM352I.m1433o()) {
                i00VarM352I.f2299d = -1;
                i00VarM352I.f2302g = -1;
            }
        }
        a00 a00Var = this.f548b;
        ArrayList arrayList = a00Var.f3a;
        ArrayList arrayList2 = a00Var.f5c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            i00 i00Var = (i00) arrayList2.get(i2);
            i00Var.f2299d = -1;
            i00Var.f2302g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            i00 i00Var2 = (i00) arrayList.get(i3);
            i00Var2.f2299d = -1;
            i00Var2.f2302g = -1;
        }
        ArrayList arrayList3 = a00Var.f4b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                i00 i00Var3 = (i00) a00Var.f4b.get(i4);
                i00Var3.f2299d = -1;
                i00Var3.f2302g = -1;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m390l(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f526D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f526D.onRelease();
            zIsFinished = this.f526D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f528F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f528F.onRelease();
            zIsFinished |= this.f528F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f527E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f527E.onRelease();
            zIsFinished |= this.f527E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f529G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f529G.onRelease();
            zIsFinished |= this.f529G.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = oa0.f3426a;
            x90.m2663k(this);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m391m() {
        if (!this.f580r || this.f588y) {
            int i = t70.f4419a;
            s70.m2309a("RV FullInvalidate");
            m393o();
            s70.m2310b();
            return;
        }
        C0914y1 c0914y1 = this.f552d;
        if (c0914y1.m2718f()) {
            c0914y1.getClass();
            if (c0914y1.m2718f()) {
                int i2 = t70.f4419a;
                s70.m2309a("RV FullInvalidate");
                m393o();
                s70.m2310b();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m392n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = oa0.f3426a;
        setMeasuredDimension(AbstractC0799uz.m2505g(i, paddingRight, x90.m2657e(this)), AbstractC0799uz.m2505g(i2, getPaddingBottom() + getPaddingTop(), x90.m2656d(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039a  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [i00] */
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
    public final void m393o() {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m393o():void");
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
            r5.f523A = r0
            r1 = 1
            r5.f576p = r1
            boolean r2 = r5.f580r
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f580r = r2
            uz r2 = r5.f568l
            if (r2 == 0) goto L21
            r2.f4861g = r1
            r2.mo702O(r5)
        L21:
            r5.f563i0 = r0
            java.lang.ThreadLocal r0 = p000.RunnableC0230fn.f1808e
            java.lang.Object r1 = r0.get()
            fn r1 = (p000.RunnableC0230fn) r1
            r5.f547a0 = r1
            if (r1 != 0) goto L6b
            fn r1 = new fn
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1810a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1813d = r2
            r5.f547a0 = r1
            java.util.WeakHashMap r1 = p000.oa0.f3426a
            android.view.Display r1 = p000.y90.m2730b(r5)
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
            fn r2 = r5.f547a0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f1812c = r3
            r0.set(r2)
        L6b:
            fn r0 = r5.f547a0
            java.util.ArrayList r0 = r0.f1810a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0124cr c0124cr;
        super.onDetachedFromWindow();
        AbstractC0651qz abstractC0651qz = this.f530H;
        if (abstractC0651qz != null) {
            abstractC0651qz.mo2193e();
        }
        setScrollState(0);
        h00 h00Var = this.f545W;
        h00Var.f2086g.removeCallbacks(h00Var);
        h00Var.f2082c.abortAnimation();
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null && (c0124cr = abstractC0799uz.f4859e) != null) {
            c0124cr.m778i();
        }
        this.f576p = false;
        AbstractC0799uz abstractC0799uz2 = this.f568l;
        if (abstractC0799uz2 != null) {
            abstractC0799uz2.f4861g = false;
            abstractC0799uz2.mo324P(this);
        }
        this.f577p0.clear();
        removeCallbacks(this.f579q0);
        this.f556f.getClass();
        while (ta0.f4433d.mo475a() != null) {
        }
        RunnableC0230fn runnableC0230fn = this.f547a0;
        if (runnableC0230fn != null) {
            runnableC0230fn.f1810a.remove(this);
            this.f547a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f570m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0688rz) arrayList.get(i)).mo2301a(this);
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
            uz r0 = r5.f568l
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.f584u
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
            uz r0 = r5.f568l
            boolean r0 = r0.mo341e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            uz r3 = r5.f568l
            boolean r3 = r3.mo340d()
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
            uz r3 = r5.f568l
            boolean r3 = r3.mo341e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            uz r3 = r5.f568l
            boolean r3 = r3.mo340d()
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
            float r2 = r5.f542T
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f543U
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m378W(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f584u) {
            this.f574o = null;
            if (m359B(motionEvent)) {
                m377V();
                setScrollState(0);
                return true;
            }
            AbstractC0799uz abstractC0799uz = this.f568l;
            if (abstractC0799uz != null) {
                boolean zMo340d = abstractC0799uz.mo340d();
                boolean zMo341e = this.f568l.mo341e();
                if (this.f533K == null) {
                    this.f533K = VelocityTracker.obtain();
                }
                this.f533K.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f585v) {
                        this.f585v = false;
                    }
                    this.f532J = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f536N = x;
                    this.f534L = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f537O = y;
                    this.f535M = y;
                    if (this.f531I == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m384c0(1);
                    }
                    int[] iArr = this.f573n0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zMo340d;
                    if (zMo341e) {
                        i = (zMo340d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m2186g(i, 0);
                } else if (actionMasked == 1) {
                    this.f533K.clear();
                    m384c0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f532J);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f532J + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f531I != 1) {
                        int i2 = x2 - this.f534L;
                        int i3 = y2 - this.f535M;
                        if (!zMo340d || Math.abs(i2) <= this.f538P) {
                            z = false;
                        } else {
                            this.f536N = x2;
                            z = true;
                        }
                        if (zMo341e && Math.abs(i3) > this.f538P) {
                            this.f537O = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    m377V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f532J = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f536N = x3;
                    this.f534L = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f537O = y3;
                    this.f535M = y3;
                } else if (actionMasked == 6) {
                    m373R(motionEvent);
                }
                if (this.f531I == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = t70.f4419a;
        s70.m2309a("RV OnLayout");
        m393o();
        s70.m2310b();
        this.f580r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz == null) {
            m392n(i, i2);
            return;
        }
        boolean zMo318J = abstractC0799uz.mo318J();
        f00 f00Var = this.f551c0;
        if (!zMo318J) {
            if (this.f578q) {
                this.f568l.f4856b.m392n(i, i2);
                return;
            }
            if (f00Var.f1715k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0503mz abstractC0503mz = this.f566k;
            if (abstractC0503mz != null) {
                f00Var.f1709e = abstractC0503mz.mo715a();
            } else {
                f00Var.f1709e = 0;
            }
            m382a0();
            this.f568l.f4856b.m392n(i, i2);
            m383b0(false);
            f00Var.f1711g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f568l.f4856b.m392n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f566k == null) {
            return;
        }
        if (f00Var.f1708d == 1) {
            m394p();
        }
        this.f568l.m2521o0(i, i2);
        f00Var.f1713i = true;
        m395q();
        this.f568l.m2523q0(i, i2);
        if (this.f568l.mo348t0()) {
            this.f568l.m2521o0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            f00Var.f1713i = true;
            m395q();
            this.f568l.m2523q0(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m367L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof c00)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c00 c00Var = (c00) parcelable;
        this.f550c = c00Var;
        super.onRestoreInstanceState(c00Var.f1274a);
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz == null || (parcelable2 = this.f550c.f793c) == null) {
            return;
        }
        abstractC0799uz.mo336b0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c00 c00Var = new c00(super.onSaveInstanceState());
        c00 c00Var2 = this.f550c;
        if (c00Var2 != null) {
            c00Var.f793c = c00Var2.f793c;
            return c00Var;
        }
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null) {
            c00Var.f793c = abstractC0799uz.mo339c0();
            return c00Var;
        }
        c00Var.f793c = null;
        return c00Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f529G = null;
        this.f527E = null;
        this.f528F = null;
        this.f526D = null;
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
    public final void m394p() {
        /*
            Method dump skipped, instruction units count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m394p():void");
    }

    /* JADX INFO: renamed from: q */
    public final void m395q() {
        m382a0();
        m371P();
        f00 f00Var = this.f551c0;
        f00Var.m1067a(6);
        this.f552d.m2714b();
        f00Var.f1709e = this.f566k.mo715a();
        f00Var.f1707c = 0;
        f00Var.f1711g = false;
        this.f568l.mo284Z(this.f548b, f00Var);
        f00Var.f1710f = false;
        this.f550c = null;
        f00Var.f1714j = f00Var.f1714j && this.f530H != null;
        f00Var.f1708d = 4;
        m372Q(true);
        m383b0(false);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m396r(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m2182c(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        i00 i00VarM352I = m352I(view);
        if (i00VarM352I != null) {
            if (i00VarM352I.m1428j()) {
                i00VarM352I.f2305j &= -257;
            } else if (!i00VarM352I.m1433o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + i00VarM352I + m403y());
            }
        }
        view.clearAnimation();
        m352I(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0124cr c0124cr = this.f568l.f4859e;
        if ((c0124cr == null || !c0124cr.f1240e) && !m367L() && view2 != null) {
            m376U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f568l.mo703i0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f572n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0932yj) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f582s != 0 || this.f584u) {
            this.f583t = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m397s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m2183d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f584u) {
            return;
        }
        boolean zMo340d = abstractC0799uz.mo340d();
        boolean zMo341e = this.f568l.mo341e();
        if (zMo340d || zMo341e) {
            if (!zMo340d) {
                i = 0;
            }
            if (!zMo341e) {
                i2 = 0;
            }
            m378W(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m367L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iM2711a = accessibilityEvent != null ? AbstractC0912y.m2711a(accessibilityEvent) : 0;
            this.f586w |= iM2711a != 0 ? iM2711a : 0;
        }
    }

    public void setAccessibilityDelegateCompat(k00 k00Var) {
        this.f565j0 = k00Var;
        oa0.m2012l(this, k00Var);
    }

    public void setAdapter(AbstractC0503mz abstractC0503mz) {
        setLayoutFrozen(false);
        AbstractC0503mz abstractC0503mz2 = this.f566k;
        C0426kw c0426kw = this.f546a;
        if (abstractC0503mz2 != null) {
            abstractC0503mz2.f3196a.unregisterObserver(c0426kw);
            this.f566k.getClass();
        }
        AbstractC0651qz abstractC0651qz = this.f530H;
        if (abstractC0651qz != null) {
            abstractC0651qz.mo2193e();
        }
        AbstractC0799uz abstractC0799uz = this.f568l;
        a00 a00Var = this.f548b;
        if (abstractC0799uz != null) {
            abstractC0799uz.m2515e0(a00Var);
            this.f568l.m2516f0(a00Var);
        }
        a00Var.f3a.clear();
        a00Var.m6d();
        C0914y1 c0914y1 = this.f552d;
        c0914y1.m2721i((ArrayList) c0914y1.f5324c);
        c0914y1.m2721i((ArrayList) c0914y1.f5325d);
        AbstractC0503mz abstractC0503mz3 = this.f566k;
        this.f566k = abstractC0503mz;
        if (abstractC0503mz != null) {
            abstractC0503mz.f3196a.registerObserver(c0426kw);
        }
        AbstractC0503mz abstractC0503mz4 = this.f566k;
        a00Var.f3a.clear();
        a00Var.m6d();
        C0985zz c0985zzM5c = a00Var.m5c();
        if (abstractC0503mz3 != null) {
            c0985zzM5c.f5632b--;
        }
        if (c0985zzM5c.f5632b == 0) {
            SparseArray sparseArray = c0985zzM5c.f5631a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((C0948yz) sparseArray.valueAt(i)).f5518a.clear();
            }
        }
        if (abstractC0503mz4 != null) {
            c0985zzM5c.f5632b++;
        }
        this.f551c0.f1710f = true;
        this.f589z |= false;
        this.f588y = true;
        int iM2247t = this.f554e.m2247t();
        for (int i2 = 0; i2 < iM2247t; i2++) {
            i00 i00VarM352I = m352I(this.f554e.m2246s(i2));
            if (i00VarM352I != null && !i00VarM352I.m1433o()) {
                i00VarM352I.m1419a(6);
            }
        }
        m369N();
        a00 a00Var2 = this.f548b;
        ArrayList arrayList = a00Var2.f5c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            i00 i00Var = (i00) arrayList.get(i3);
            if (i00Var != null) {
                i00Var.m1419a(6);
                i00Var.m1419a(1024);
            }
        }
        AbstractC0503mz abstractC0503mz5 = a00Var2.f10h.f566k;
        if (abstractC0503mz5 == null || !abstractC0503mz5.f3197b) {
            a00Var2.m6d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0577oz interfaceC0577oz) {
        if (interfaceC0577oz == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f558g) {
            this.f529G = null;
            this.f527E = null;
            this.f528F = null;
            this.f526D = null;
        }
        this.f558g = z;
        super.setClipToPadding(z);
        if (this.f580r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0614pz c0614pz) {
        c0614pz.getClass();
        this.f525C = c0614pz;
        this.f529G = null;
        this.f527E = null;
        this.f528F = null;
        this.f526D = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f578q = z;
    }

    public void setItemAnimator(AbstractC0651qz abstractC0651qz) {
        AbstractC0651qz abstractC0651qz2 = this.f530H;
        if (abstractC0651qz2 != null) {
            abstractC0651qz2.mo2193e();
            this.f530H.f3984a = null;
        }
        this.f530H = abstractC0651qz;
        if (abstractC0651qz != null) {
            abstractC0651qz.f3984a = this.f561h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        a00 a00Var = this.f548b;
        a00Var.f7e = i;
        a00Var.m13k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0799uz abstractC0799uz) {
        C0124cr c0124cr;
        if (abstractC0799uz == this.f568l) {
            return;
        }
        setScrollState(0);
        h00 h00Var = this.f545W;
        h00Var.f2086g.removeCallbacks(h00Var);
        h00Var.f2082c.abortAnimation();
        AbstractC0799uz abstractC0799uz2 = this.f568l;
        if (abstractC0799uz2 != null && (c0124cr = abstractC0799uz2.f4859e) != null) {
            c0124cr.m778i();
        }
        AbstractC0799uz abstractC0799uz3 = this.f568l;
        a00 a00Var = this.f548b;
        if (abstractC0799uz3 != null) {
            AbstractC0651qz abstractC0651qz = this.f530H;
            if (abstractC0651qz != null) {
                abstractC0651qz.mo2193e();
            }
            this.f568l.m2515e0(a00Var);
            this.f568l.m2516f0(a00Var);
            a00Var.f3a.clear();
            a00Var.m6d();
            if (this.f576p) {
                AbstractC0799uz abstractC0799uz4 = this.f568l;
                abstractC0799uz4.f4861g = false;
                abstractC0799uz4.mo324P(this);
            }
            this.f568l.m2524r0(null);
            this.f568l = null;
        } else {
            a00Var.f3a.clear();
            a00Var.m6d();
        }
        C0658r5 c0658r5 = this.f554e;
        RecyclerView recyclerView = ((C0466lz) c0658r5.f4064b).f3055a;
        ((C0515na) c0658r5.f4065c).m1935g();
        ArrayList arrayList = (ArrayList) c0658r5.f4066d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i00 i00VarM352I = m352I((View) arrayList.get(size));
            if (i00VarM352I != null) {
                int i = i00VarM352I.f2311p;
                if (recyclerView.m367L()) {
                    i00VarM352I.f2312q = i;
                    recyclerView.f577p0.add(i00VarM352I);
                } else {
                    View view = i00VarM352I.f2296a;
                    WeakHashMap weakHashMap = oa0.f3426a;
                    x90.m2671s(view, i);
                }
                i00VarM352I.f2311p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            m352I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f568l = abstractC0799uz;
        if (abstractC0799uz != null) {
            if (abstractC0799uz.f4856b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0799uz + " is already attached to a RecyclerView:" + abstractC0799uz.f4856b.m403y());
            }
            abstractC0799uz.m2524r0(this);
            if (this.f576p) {
                AbstractC0799uz abstractC0799uz5 = this.f568l;
                abstractC0799uz5.f4861g = true;
                abstractC0799uz5.mo702O(this);
            }
        }
        a00Var.m13k();
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
        C0648qw scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3982d) {
            ViewGroup viewGroup = scrollingChildHelper.f3981c;
            WeakHashMap weakHashMap = oa0.f3426a;
            da0.m908z(viewGroup);
        }
        scrollingChildHelper.f3982d = z;
    }

    public void setOnFlingListener(AbstractC0874wz abstractC0874wz) {
        this.f539Q = abstractC0874wz;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0911xz abstractC0911xz) {
        this.f553d0 = abstractC0911xz;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f544V = z;
    }

    public void setRecycledViewPool(C0985zz c0985zz) {
        a00 a00Var = this.f548b;
        if (a00Var.f9g != null) {
            r1.f5632b--;
        }
        a00Var.f9g = c0985zz;
        if (c0985zz == null || a00Var.f10h.getAdapter() == null) {
            return;
        }
        a00Var.f9g.f5632b++;
    }

    public void setScrollState(int i) {
        C0124cr c0124cr;
        if (i == this.f531I) {
            return;
        }
        this.f531I = i;
        if (i != 2) {
            h00 h00Var = this.f545W;
            h00Var.f2086g.removeCallbacks(h00Var);
            h00Var.f2082c.abortAnimation();
            AbstractC0799uz abstractC0799uz = this.f568l;
            if (abstractC0799uz != null && (c0124cr = abstractC0799uz.f4859e) != null) {
                c0124cr.m778i();
            }
        }
        AbstractC0799uz abstractC0799uz2 = this.f568l;
        if (abstractC0799uz2 != null) {
            abstractC0799uz2.mo432d0(i);
        }
        AbstractC0911xz abstractC0911xz = this.f553d0;
        if (abstractC0911xz != null) {
            abstractC0911xz.mo865a(this, i);
        }
        ArrayList arrayList = this.f555e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0911xz) this.f555e0.get(size)).mo865a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f538P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f538P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(g00 g00Var) {
        this.f548b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m2186g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m2187h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        C0124cr c0124cr;
        if (z != this.f584u) {
            m388i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f584u = false;
                if (this.f583t && this.f568l != null && this.f566k != null) {
                    requestLayout();
                }
                this.f583t = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f584u = true;
            this.f585v = true;
            setScrollState(0);
            h00 h00Var = this.f545W;
            h00Var.f2086g.removeCallbacks(h00Var);
            h00Var.f2082c.abortAnimation();
            AbstractC0799uz abstractC0799uz = this.f568l;
            if (abstractC0799uz == null || (c0124cr = abstractC0799uz.f4859e) == null) {
                return;
            }
            c0124cr.m778i();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m398t(int i, int i2) {
        this.f524B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC0911xz abstractC0911xz = this.f553d0;
        if (abstractC0911xz != null) {
            abstractC0911xz.mo866b(this, i, i2);
        }
        ArrayList arrayList = this.f555e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0911xz) this.f555e0.get(size)).mo866b(this, i, i2);
            }
        }
        this.f524B--;
    }

    /* JADX INFO: renamed from: u */
    public final void m399u() {
        if (this.f529G != null) {
            return;
        }
        this.f525C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f529G = edgeEffect;
        if (this.f558g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m400v() {
        if (this.f526D != null) {
            return;
        }
        this.f525C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f526D = edgeEffect;
        if (this.f558g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m401w() {
        if (this.f528F != null) {
            return;
        }
        this.f525C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f528F = edgeEffect;
        if (this.f558g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m402x() {
        if (this.f527E != null) {
            return;
        }
        this.f525C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f527E = edgeEffect;
        if (this.f558g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: y */
    public final String m403y() {
        return " " + super.toString() + ", adapter:" + this.f566k + ", layout:" + this.f568l + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: z */
    public final void m404z(f00 f00Var) {
        if (getScrollState() != 2) {
            f00Var.getClass();
            return;
        }
        OverScroller overScroller = this.f545W.f2082c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        f00Var.getClass();
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
        this.f546a = new C0426kw(this);
        this.f548b = new a00(this);
        this.f556f = new C0138d4(19);
        this.f560h = new Rect();
        this.f562i = new Rect();
        this.f564j = new RectF();
        this.f570m = new ArrayList();
        this.f572n = new ArrayList();
        this.f582s = 0;
        this.f588y = false;
        this.f589z = false;
        this.f523A = 0;
        this.f524B = 0;
        this.f525C = new C0614pz();
        C0816vf c0816vf = new C0816vf();
        Object[] objArr = null;
        c0816vf.f3984a = null;
        c0816vf.f3985b = new ArrayList();
        c0816vf.f3986c = 120L;
        c0816vf.f3987d = 120L;
        c0816vf.f3988e = 250L;
        c0816vf.f3989f = 250L;
        c0816vf.f4942g = true;
        c0816vf.f4943h = new ArrayList();
        c0816vf.f4944i = new ArrayList();
        c0816vf.f4945j = new ArrayList();
        c0816vf.f4946k = new ArrayList();
        c0816vf.f4947l = new ArrayList();
        c0816vf.f4948m = new ArrayList();
        c0816vf.f4949n = new ArrayList();
        c0816vf.f4950o = new ArrayList();
        c0816vf.f4951p = new ArrayList();
        c0816vf.f4952q = new ArrayList();
        c0816vf.f4953r = new ArrayList();
        this.f530H = c0816vf;
        this.f531I = 0;
        this.f532J = -1;
        this.f542T = Float.MIN_VALUE;
        this.f543U = Float.MIN_VALUE;
        this.f544V = true;
        this.f545W = new h00(this);
        this.f549b0 = new C0157dn();
        f00 f00Var = new f00();
        f00Var.f1705a = -1;
        f00Var.f1706b = 0;
        f00Var.f1707c = 0;
        f00Var.f1708d = 1;
        f00Var.f1709e = 0;
        f00Var.f1710f = false;
        f00Var.f1711g = false;
        f00Var.f1712h = false;
        f00Var.f1713i = false;
        f00Var.f1714j = false;
        f00Var.f1715k = false;
        this.f551c0 = f00Var;
        this.f557f0 = false;
        this.f559g0 = false;
        C0466lz c0466lz = new C0466lz(this);
        this.f561h0 = c0466lz;
        this.f563i0 = false;
        this.f567k0 = new int[2];
        this.f571m0 = new int[2];
        this.f573n0 = new int[2];
        this.f575o0 = new int[2];
        this.f577p0 = new ArrayList();
        this.f579q0 = new RunnableC0325i7(8, this);
        this.f581r0 = new C0466lz(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f538P = viewConfiguration.getScaledTouchSlop();
        this.f542T = pa0.m2079a(viewConfiguration);
        this.f543U = pa0.m2080b(viewConfiguration);
        this.f540R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f541S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f530H.f3984a = c0466lz;
        this.f552d = new C0914y1(new C0466lz(this));
        this.f554e = new C0658r5(new C0466lz(this));
        WeakHashMap weakHashMap = oa0.f3426a;
        if (fa0.m1076b(this) == 0) {
            fa0.m1086l(this, 8);
        }
        if (x90.m2655c(this) == 0) {
            x90.m2671s(this, 1);
        }
        this.f587x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new k00(this));
        int[] iArr = AbstractC0132cz.f1272a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f558g = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m403y());
            }
            Resources resources = getContext().getResources();
            c3 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            c = 3;
            i2 = i;
            c2 = 1;
            i3 = 4;
            new C0932yj(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.fastscroll_margin));
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
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0799uz.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(f521t0);
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
                    setLayoutManager((AbstractC0799uz) constructor.newInstance(objArr));
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
        int[] iArr2 = f520s0;
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
        AbstractC0799uz abstractC0799uz = this.f568l;
        if (abstractC0799uz != null) {
            return abstractC0799uz.mo305t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m403y());
    }

    public void setRecyclerListener(b00 b00Var) {
    }
}
