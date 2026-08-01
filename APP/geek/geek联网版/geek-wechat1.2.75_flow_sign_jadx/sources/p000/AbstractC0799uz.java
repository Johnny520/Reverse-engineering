package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: uz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0799uz {

    /* JADX INFO: renamed from: a */
    public C0658r5 f4855a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f4856b;

    /* JADX INFO: renamed from: c */
    public final C0138d4 f4857c;

    /* JADX INFO: renamed from: d */
    public final C0138d4 f4858d;

    /* JADX INFO: renamed from: e */
    public C0124cr f4859e;

    /* JADX INFO: renamed from: f */
    public boolean f4860f;

    /* JADX INFO: renamed from: g */
    public boolean f4861g;

    /* JADX INFO: renamed from: h */
    public final boolean f4862h;

    /* JADX INFO: renamed from: i */
    public final boolean f4863i;

    /* JADX INFO: renamed from: j */
    public int f4864j;

    /* JADX INFO: renamed from: k */
    public boolean f4865k;

    /* JADX INFO: renamed from: l */
    public int f4866l;

    /* JADX INFO: renamed from: m */
    public int f4867m;

    /* JADX INFO: renamed from: n */
    public int f4868n;

    /* JADX INFO: renamed from: o */
    public int f4869o;

    public AbstractC0799uz() {
        C0725sz c0725sz = new C0725sz(this, 0);
        C0725sz c0725sz2 = new C0725sz(this, 1);
        this.f4857c = new C0138d4(c0725sz);
        this.f4858d = new C0138d4(c0725sz2);
        this.f4860f = false;
        this.f4861g = false;
        this.f4862h = true;
        this.f4863i = true;
    }

    /* JADX INFO: renamed from: F */
    public static int m2501F(View view) {
        return ((C0836vz) view.getLayoutParams()).f5017a.m1420b();
    }

    /* JADX INFO: renamed from: G */
    public static C0762tz m2502G(Context context, AttributeSet attributeSet, int i, int i2) {
        C0762tz c0762tz = new C0762tz();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0132cz.f1272a, i, i2);
        c0762tz.f4595a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0762tz.f4596b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0762tz.f4597c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0762tz.f4598d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0762tz;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m2503K(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static void m2504L(View view, int i, int i2, int i3, int i4) {
        C0836vz c0836vz = (C0836vz) view.getLayoutParams();
        Rect rect = c0836vz.f5018b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0836vz).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0836vz).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0836vz).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0836vz).bottomMargin);
    }

    /* JADX INFO: renamed from: g */
    public static int m2505g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2506w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0799uz.m2506w(boolean, int, int, int, int):int");
    }

    /* JADX INFO: renamed from: A */
    public final int m2507A() {
        RecyclerView recyclerView = this.f4856b;
        WeakHashMap weakHashMap = oa0.f3426a;
        return y90.m2732d(recyclerView);
    }

    /* JADX INFO: renamed from: B */
    public final int m2508B() {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final int m2509C() {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public final int m2510D() {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final int m2511E() {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public int mo272H(a00 a00Var, f00 f00Var) {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView == null || recyclerView.f566k == null || !mo341e()) {
            return 1;
        }
        return this.f4856b.f566k.mo715a();
    }

    /* JADX INFO: renamed from: I */
    public final void m2512I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0836vz) view.getLayoutParams()).f5018b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f4856b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f4856b.f564j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: J */
    public boolean mo318J() {
        return false;
    }

    /* JADX INFO: renamed from: M */
    public void mo418M(int i) {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView != null) {
            int iM2239k = recyclerView.f554e.m2239k();
            for (int i2 = 0; i2 < iM2239k; i2++) {
                recyclerView.f554e.m2238j(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void mo420N(int i) {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView != null) {
            int iM2239k = recyclerView.f554e.m2239k();
            for (int i2 = 0; i2 < iM2239k; i2++) {
                recyclerView.f554e.m2238j(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo324P(RecyclerView recyclerView);

    /* JADX INFO: renamed from: Q */
    public abstract View mo274Q(View view, int i, a00 a00Var, f00 f00Var);

    /* JADX INFO: renamed from: R */
    public void mo327R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f4856b;
        a00 a00Var = recyclerView.f548b;
        f00 f00Var = recyclerView.f551c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f4856b.canScrollVertically(-1) && !this.f4856b.canScrollHorizontally(-1) && !this.f4856b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC0503mz abstractC0503mz = this.f4856b.f566k;
        if (abstractC0503mz != null) {
            accessibilityEvent.setItemCount(abstractC0503mz.mo715a());
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo276S(a00 a00Var, f00 f00Var, View view, C0357j0 c0357j0) {
        c0357j0.m1552f(C0318i0.m1418a(false, mo341e() ? m2501F(view) : 0, 1, mo340d() ? m2501F(view) : 0, 1));
    }

    /* JADX INFO: renamed from: T */
    public final void m2513T(View view, C0357j0 c0357j0) {
        i00 i00VarM352I = RecyclerView.m352I(view);
        if (i00VarM352I == null || i00VarM352I.m1426h()) {
            return;
        }
        C0658r5 c0658r5 = this.f4855a;
        if (((ArrayList) c0658r5.f4066d).contains(i00VarM352I.f2296a)) {
            return;
        }
        RecyclerView recyclerView = this.f4856b;
        mo276S(recyclerView.f548b, recyclerView.f551c0, view, c0357j0);
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo284Z(a00 a00Var, f00 f00Var);

    /* JADX INFO: renamed from: a0 */
    public abstract void mo285a0(f00 f00Var);

    /* JADX INFO: renamed from: b */
    public final void m2514b(View view, int i, boolean z) {
        i00 i00VarM352I = RecyclerView.m352I(view);
        if (z || i00VarM352I.m1426h()) {
            b40 b40Var = (b40) this.f4856b.f556f.f1297b;
            ta0 ta0VarM2405a = (ta0) b40Var.getOrDefault(i00VarM352I, null);
            if (ta0VarM2405a == null) {
                ta0VarM2405a = ta0.m2405a();
                b40Var.put(i00VarM352I, ta0VarM2405a);
            }
            ta0VarM2405a.f4434a |= 1;
        } else {
            this.f4856b.f556f.m837I(i00VarM352I);
        }
        C0836vz c0836vz = (C0836vz) view.getLayoutParams();
        if (i00VarM352I.m1434p() || i00VarM352I.m1427i()) {
            if (i00VarM352I.m1427i()) {
                i00VarM352I.f2309n.m12j(i00VarM352I);
            } else {
                i00VarM352I.f2305j &= -33;
            }
            this.f4855a.m2231c(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f4856b) {
                C0658r5 c0658r5 = this.f4855a;
                C0515na c0515na = (C0515na) c0658r5.f4065c;
                int iIndexOfChild = ((C0466lz) c0658r5.f4064b).f3055a.indexOfChild(view);
                int iM1930b = (iIndexOfChild == -1 || c0515na.m1932d(iIndexOfChild)) ? -1 : iIndexOfChild - c0515na.m1930b(iIndexOfChild);
                if (i == -1) {
                    i = this.f4855a.m2239k();
                }
                if (iM1930b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4856b.indexOfChild(view) + this.f4856b.m403y());
                }
                if (iM1930b != i) {
                    AbstractC0799uz abstractC0799uz = this.f4856b.f568l;
                    View viewM2526u = abstractC0799uz.m2526u(iM1930b);
                    if (viewM2526u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM1930b + abstractC0799uz.f4856b.toString());
                    }
                    abstractC0799uz.m2526u(iM1930b);
                    abstractC0799uz.f4855a.m2232d(iM1930b);
                    C0836vz c0836vz2 = (C0836vz) viewM2526u.getLayoutParams();
                    i00 i00VarM352I2 = RecyclerView.m352I(viewM2526u);
                    if (i00VarM352I2.m1426h()) {
                        b40 b40Var2 = (b40) abstractC0799uz.f4856b.f556f.f1297b;
                        ta0 ta0VarM2405a2 = (ta0) b40Var2.getOrDefault(i00VarM352I2, null);
                        if (ta0VarM2405a2 == null) {
                            ta0VarM2405a2 = ta0.m2405a();
                            b40Var2.put(i00VarM352I2, ta0VarM2405a2);
                        }
                        ta0VarM2405a2.f4434a = 1 | ta0VarM2405a2.f4434a;
                    } else {
                        abstractC0799uz.f4856b.f556f.m837I(i00VarM352I2);
                    }
                    abstractC0799uz.f4855a.m2231c(viewM2526u, i, c0836vz2, i00VarM352I2.m1426h());
                }
            } else {
                this.f4855a.m2230b(view, i, false);
                c0836vz.f5019c = true;
                C0124cr c0124cr = this.f4859e;
                if (c0124cr != null && c0124cr.f1240e) {
                    c0124cr.f1237b.getClass();
                    i00 i00VarM352I3 = RecyclerView.m352I(view);
                    if ((i00VarM352I3 != null ? i00VarM352I3.m1420b() : -1) == c0124cr.f1236a) {
                        c0124cr.f1241f = view;
                    }
                }
            }
        }
        if (c0836vz.f5020d) {
            i00VarM352I.f2296a.invalidate();
            c0836vz.f5020d = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo338c(String str) {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView != null) {
            recyclerView.m388i(str);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public Parcelable mo339c0() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo340d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo341e();

    /* JADX INFO: renamed from: e0 */
    public final void m2515e0(a00 a00Var) {
        for (int iM2528v = m2528v() - 1; iM2528v >= 0; iM2528v--) {
            if (!RecyclerView.m352I(m2526u(iM2528v)).m1433o()) {
                View viewM2526u = m2526u(iM2528v);
                m2518h0(iM2528v);
                a00Var.m8f(viewM2526u);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean mo289f(C0836vz c0836vz) {
        return c0836vz != null;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m2516f0(a00 a00Var) {
        ArrayList arrayList = a00Var.f3a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((i00) arrayList.get(i)).f2296a;
            i00 i00VarM352I = RecyclerView.m352I(view);
            if (!i00VarM352I.m1433o()) {
                i00VarM352I.m1432n(false);
                if (i00VarM352I.m1428j()) {
                    this.f4856b.removeDetachedView(view, false);
                }
                AbstractC0651qz abstractC0651qz = this.f4856b.f530H;
                if (abstractC0651qz != null) {
                    abstractC0651qz.mo2192d(i00VarM352I);
                }
                i00VarM352I.m1432n(true);
                i00 i00VarM352I2 = RecyclerView.m352I(view);
                i00VarM352I2.f2309n = null;
                i00VarM352I2.f2310o = false;
                i00VarM352I2.f2305j &= -33;
                a00Var.m9g(i00VarM352I2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = a00Var.f4b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f4856b.invalidate();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m2517g0(View view, a00 a00Var) {
        C0658r5 c0658r5 = this.f4855a;
        C0466lz c0466lz = (C0466lz) c0658r5.f4064b;
        int iIndexOfChild = c0466lz.f3055a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0515na) c0658r5.f4065c).m1934f(iIndexOfChild)) {
                c0658r5.m2228B(view);
            }
            c0466lz.m1788h(iIndexOfChild);
        }
        a00Var.m8f(view);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m2518h0(int i) {
        if (m2526u(i) != null) {
            C0658r5 c0658r5 = this.f4855a;
            int iM2245r = c0658r5.m2245r(i);
            C0466lz c0466lz = (C0466lz) c0658r5.f4064b;
            View childAt = c0466lz.f3055a.getChildAt(iM2245r);
            if (childAt == null) {
                return;
            }
            if (((C0515na) c0658r5.f4065c).m1934f(iM2245r)) {
                c0658r5.m2228B(childAt);
            }
            c0466lz.m1788h(iM2245r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo703i0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.m2509C()
            int r1 = r8.m2511E()
            int r2 = r8.f4868n
            int r3 = r8.m2510D()
            int r2 = r2 - r3
            int r3 = r8.f4869o
            int r4 = r8.m2508B()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.m2507A()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.m2509C()
            int r2 = r8.m2511E()
            int r3 = r8.f4868n
            int r4 = r8.m2510D()
            int r3 = r3 - r4
            int r4 = r8.f4869o
            int r5 = r8.m2508B()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f4856b
            android.graphics.Rect r5 = r5.f560h
            r8.mo704y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.m381Z(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0799uz.mo703i0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo344j(f00 f00Var);

    /* JADX INFO: renamed from: j0 */
    public final void m2519j0() {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo295k(f00 f00Var);

    /* JADX INFO: renamed from: k0 */
    public abstract int mo296k0(int i, a00 a00Var, f00 f00Var);

    /* JADX INFO: renamed from: l */
    public abstract int mo298l(f00 f00Var);

    /* JADX INFO: renamed from: l0 */
    public abstract void mo345l0(int i);

    /* JADX INFO: renamed from: m */
    public abstract int mo346m(f00 f00Var);

    /* JADX INFO: renamed from: m0 */
    public abstract int mo299m0(int i, a00 a00Var, f00 f00Var);

    /* JADX INFO: renamed from: n */
    public abstract int mo300n(f00 f00Var);

    /* JADX INFO: renamed from: n0 */
    public final void m2520n0(RecyclerView recyclerView) {
        m2521o0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo301o(f00 f00Var);

    /* JADX INFO: renamed from: o0 */
    public final void m2521o0(int i, int i2) {
        this.f4868n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f4866l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f520s0;
        }
        this.f4869o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f4867m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f520s0;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2522p(a00 a00Var) {
        for (int iM2528v = m2528v() - 1; iM2528v >= 0; iM2528v--) {
            View viewM2526u = m2526u(iM2528v);
            i00 i00VarM352I = RecyclerView.m352I(viewM2526u);
            if (!i00VarM352I.m1433o()) {
                if (!i00VarM352I.m1424f() || i00VarM352I.m1426h() || this.f4856b.f566k.f3197b) {
                    m2526u(iM2528v);
                    this.f4855a.m2232d(iM2528v);
                    a00Var.m10h(viewM2526u);
                    this.f4856b.f556f.m837I(i00VarM352I);
                } else {
                    m2518h0(iM2528v);
                    a00Var.m9g(i00VarM352I);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void mo302p0(Rect rect, int i, int i2) {
        int iM2510D = m2510D() + m2509C() + rect.width();
        int iM2508B = m2508B() + m2511E() + rect.height();
        RecyclerView recyclerView = this.f4856b;
        WeakHashMap weakHashMap = oa0.f3426a;
        this.f4856b.setMeasuredDimension(m2505g(i, iM2510D, x90.m2657e(recyclerView)), m2505g(i2, iM2508B, x90.m2656d(this.f4856b)));
    }

    /* JADX INFO: renamed from: q */
    public View mo347q(int i) {
        int iM2528v = m2528v();
        for (int i2 = 0; i2 < iM2528v; i2++) {
            View viewM2526u = m2526u(i2);
            i00 i00VarM352I = RecyclerView.m352I(viewM2526u);
            if (i00VarM352I != null && i00VarM352I.m1420b() == i && !i00VarM352I.m1433o() && (this.f4856b.f551c0.f1711g || !i00VarM352I.m1426h())) {
                return viewM2526u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m2523q0(int i, int i2) {
        int iM2528v = m2528v();
        if (iM2528v == 0) {
            this.f4856b.m392n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM2528v; i7++) {
            View viewM2526u = m2526u(i7);
            Rect rect = this.f4856b.f560h;
            mo704y(viewM2526u, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f4856b.f560h.set(i6, i4, i3, i5);
        mo302p0(this.f4856b.f560h, i, i2);
    }

    /* JADX INFO: renamed from: r */
    public abstract C0836vz mo303r();

    /* JADX INFO: renamed from: r0 */
    public final void m2524r0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f4856b = null;
            this.f4855a = null;
            this.f4868n = 0;
            this.f4869o = 0;
        } else {
            this.f4856b = recyclerView;
            this.f4855a = recyclerView.f554e;
            this.f4868n = recyclerView.getWidth();
            this.f4869o = recyclerView.getHeight();
        }
        this.f4866l = 1073741824;
        this.f4867m = 1073741824;
    }

    /* JADX INFO: renamed from: s */
    public C0836vz mo304s(Context context, AttributeSet attributeSet) {
        return new C0836vz(context, attributeSet);
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m2525s0(View view, int i, int i2, C0836vz c0836vz) {
        return (!view.isLayoutRequested() && this.f4862h && m2503K(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0836vz).width) && m2503K(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0836vz).height)) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    public C0836vz mo305t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0836vz ? new C0836vz((C0836vz) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0836vz((ViewGroup.MarginLayoutParams) layoutParams) : new C0836vz(layoutParams);
    }

    /* JADX INFO: renamed from: t0 */
    public boolean mo348t0() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final View m2526u(int i) {
        C0658r5 c0658r5 = this.f4855a;
        if (c0658r5 != null) {
            return c0658r5.m2238j(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m2527u0(View view, int i, int i2, C0836vz c0836vz) {
        return (this.f4862h && m2503K(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0836vz).width) && m2503K(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0836vz).height)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public final int m2528v() {
        C0658r5 c0658r5 = this.f4855a;
        if (c0658r5 != null) {
            return c0658r5.m2239k();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public abstract void mo349v0(RecyclerView recyclerView, int i);

    /* JADX INFO: renamed from: w0 */
    public final void m2529w0(C0124cr c0124cr) {
        C0124cr c0124cr2 = this.f4859e;
        if (c0124cr2 != null && c0124cr != c0124cr2 && c0124cr2.f1240e) {
            c0124cr2.m778i();
        }
        this.f4859e = c0124cr;
        RecyclerView recyclerView = this.f4856b;
        h00 h00Var = recyclerView.f545W;
        h00Var.f2086g.removeCallbacks(h00Var);
        h00Var.f2082c.abortAnimation();
        if (c0124cr.f1243h) {
            Log.w("RecyclerView", "An instance of " + c0124cr.getClass().getSimpleName() + " was started more than once. Each instance of" + c0124cr.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0124cr.f1237b = recyclerView;
        c0124cr.f1238c = this;
        int i = c0124cr.f1236a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f551c0.f1705a = i;
        c0124cr.f1240e = true;
        c0124cr.f1239d = true;
        c0124cr.f1241f = recyclerView.f568l.mo347q(i);
        c0124cr.f1237b.f545W.m1349a();
        c0124cr.f1243h = true;
    }

    /* JADX INFO: renamed from: x */
    public int mo306x(a00 a00Var, f00 f00Var) {
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView == null || recyclerView.f566k == null || !mo340d()) {
            return 1;
        }
        return this.f4856b.f566k.mo715a();
    }

    /* JADX INFO: renamed from: x0 */
    public boolean mo307x0() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public void mo704y(View view, Rect rect) {
        int[] iArr = RecyclerView.f520s0;
        C0836vz c0836vz = (C0836vz) view.getLayoutParams();
        Rect rect2 = c0836vz.f5018b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0836vz).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0836vz).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0836vz).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0836vz).bottomMargin);
    }

    /* JADX INFO: renamed from: z */
    public final int m2530z() {
        RecyclerView recyclerView = this.f4856b;
        AbstractC0503mz adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo715a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: O */
    public void mo702O(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: b0 */
    public void mo336b0(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: d0 */
    public void mo432d0(int i) {
    }

    /* JADX INFO: renamed from: V */
    public void mo279V() {
    }

    /* JADX INFO: renamed from: U */
    public void mo278U(int i, int i2) {
    }

    /* JADX INFO: renamed from: W */
    public void mo280W(int i, int i2) {
    }

    /* JADX INFO: renamed from: X */
    public void mo281X(int i, int i2) {
    }

    /* JADX INFO: renamed from: Y */
    public void mo282Y(int i, int i2) {
    }

    /* JADX INFO: renamed from: i */
    public void mo343i(int i, C0157dn c0157dn) {
    }

    /* JADX INFO: renamed from: h */
    public void mo342h(int i, int i2, f00 f00Var, C0157dn c0157dn) {
    }
}
