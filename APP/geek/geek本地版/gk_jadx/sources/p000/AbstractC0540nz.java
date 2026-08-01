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

/* JADX INFO: renamed from: nz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0540nz {

    /* JADX INFO: renamed from: a */
    public C0659r5 f3455a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f3456b;

    /* JADX INFO: renamed from: c */
    public final C0138d4 f3457c;

    /* JADX INFO: renamed from: d */
    public final C0138d4 f3458d;

    /* JADX INFO: renamed from: e */
    public C0939yq f3459e;

    /* JADX INFO: renamed from: f */
    public boolean f3460f;

    /* JADX INFO: renamed from: g */
    public boolean f3461g;

    /* JADX INFO: renamed from: h */
    public final boolean f3462h;

    /* JADX INFO: renamed from: i */
    public final boolean f3463i;

    /* JADX INFO: renamed from: j */
    public int f3464j;

    /* JADX INFO: renamed from: k */
    public boolean f3465k;

    /* JADX INFO: renamed from: l */
    public int f3466l;

    /* JADX INFO: renamed from: m */
    public int f3467m;

    /* JADX INFO: renamed from: n */
    public int f3468n;

    /* JADX INFO: renamed from: o */
    public int f3469o;

    public AbstractC0540nz() {
        C0466lz c0466lz = new C0466lz(this, 0);
        C0466lz c0466lz2 = new C0466lz(this, 1);
        this.f3457c = new C0138d4(c0466lz);
        this.f3458d = new C0138d4(c0466lz2);
        this.f3460f = false;
        this.f3461g = false;
        this.f3462h = true;
        this.f3463i = true;
    }

    /* JADX INFO: renamed from: F */
    public static int m1953F(View view) {
        return ((C0577oz) view.getLayoutParams()).f3621a.m482b();
    }

    /* JADX INFO: renamed from: G */
    public static C0503mz m1954G(Context context, AttributeSet attributeSet, int i, int i2) {
        C0503mz c0503mz = new C0503mz();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0836vy.f4889a, i, i2);
        c0503mz.f3297a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0503mz.f3298b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0503mz.f3299c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0503mz.f3300d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0503mz;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m1955K(int i, int i2, int i3) {
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
    public static void m1956L(View view, int i, int i2, int i3, int i4) {
        C0577oz c0577oz = (C0577oz) view.getLayoutParams();
        Rect rect = c0577oz.f3622b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0577oz).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0577oz).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0577oz).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0577oz).bottomMargin);
    }

    /* JADX INFO: renamed from: g */
    public static int m1957g(int i, int i2, int i3) {
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
    public static int m1958w(boolean r4, int r5, int r6, int r7, int r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0540nz.m1958w(boolean, int, int, int, int):int");
    }

    /* JADX INFO: renamed from: A */
    public final int m1959A() {
        RecyclerView recyclerView = this.f3456b;
        WeakHashMap weakHashMap = ja0.f2600a;
        return t90.m2367d(recyclerView);
    }

    /* JADX INFO: renamed from: B */
    public final int m1960B() {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final int m1961C() {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public final int m1962D() {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final int m1963E() {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public int mo287H(C0763tz c0763tz, C0948yz c0948yz) {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView == null || recyclerView.f603k == null || !mo356e()) {
            return 1;
        }
        return this.f3456b.f603k.mo757a();
    }

    /* JADX INFO: renamed from: I */
    public final void m1964I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0577oz) view.getLayoutParams()).f3622b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3456b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3456b.f601j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: J */
    public boolean mo333J() {
        return false;
    }

    /* JADX INFO: renamed from: M */
    public void mo433M(int i) {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView != null) {
            int iM2232k = recyclerView.f591e.m2232k();
            for (int i2 = 0; i2 < iM2232k; i2++) {
                recyclerView.f591e.m2231j(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void mo435N(int i) {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView != null) {
            int iM2232k = recyclerView.f591e.m2232k();
            for (int i2 = 0; i2 < iM2232k; i2++) {
                recyclerView.f591e.m2231j(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo339P(RecyclerView recyclerView);

    /* JADX INFO: renamed from: Q */
    public abstract View mo289Q(View view, int i, C0763tz c0763tz, C0948yz c0948yz);

    /* JADX INFO: renamed from: R */
    public void mo342R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3456b;
        C0763tz c0763tz = recyclerView.f585b;
        C0948yz c0948yz = recyclerView.f588c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3456b.canScrollVertically(-1) && !this.f3456b.canScrollHorizontally(-1) && !this.f3456b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC0242fz abstractC0242fz = this.f3456b.f603k;
        if (abstractC0242fz != null) {
            accessibilityEvent.setItemCount(abstractC0242fz.mo757a());
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo291S(C0763tz c0763tz, C0948yz c0948yz, View view, C0357j0 c0357j0) {
        c0357j0.m1538f(C0318i0.m1382a(false, mo356e() ? m1953F(view) : 0, 1, mo355d() ? m1953F(view) : 0, 1));
    }

    /* JADX INFO: renamed from: T */
    public final void m1965T(View view, C0357j0 c0357j0) {
        b00 b00VarM367I = RecyclerView.m367I(view);
        if (b00VarM367I == null || b00VarM367I.m488h()) {
            return;
        }
        C0659r5 c0659r5 = this.f3455a;
        if (((ArrayList) c0659r5.f4211d).contains(b00VarM367I.f697a)) {
            return;
        }
        RecyclerView recyclerView = this.f3456b;
        mo291S(recyclerView.f585b, recyclerView.f588c0, view, c0357j0);
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo299Z(C0763tz c0763tz, C0948yz c0948yz);

    /* JADX INFO: renamed from: a0 */
    public abstract void mo300a0(C0948yz c0948yz);

    /* JADX INFO: renamed from: b */
    public final void m1966b(View view, int i, boolean z) {
        b00 b00VarM367I = RecyclerView.m367I(view);
        if (z || b00VarM367I.m488h()) {
            u30 u30Var = (u30) this.f3456b.f593f.f1363b;
            oa0 oa0VarM2004a = (oa0) u30Var.getOrDefault(b00VarM367I, null);
            if (oa0VarM2004a == null) {
                oa0VarM2004a = oa0.m2004a();
                u30Var.put(b00VarM367I, oa0VarM2004a);
            }
            oa0VarM2004a.f3519a |= 1;
        } else {
            this.f3456b.f593f.m878I(b00VarM367I);
        }
        C0577oz c0577oz = (C0577oz) view.getLayoutParams();
        if (b00VarM367I.m496p() || b00VarM367I.m489i()) {
            if (b00VarM367I.m489i()) {
                b00VarM367I.f710n.m2402j(b00VarM367I);
            } else {
                b00VarM367I.f706j &= -33;
            }
            this.f3455a.m2224c(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f3456b) {
                C0659r5 c0659r5 = this.f3455a;
                C0217fa c0217fa = (C0217fa) c0659r5.f4210c;
                int iIndexOfChild = ((C0205ez) c0659r5.f4209b).f1865a.indexOfChild(view);
                int iM1145b = (iIndexOfChild == -1 || c0217fa.m1147d(iIndexOfChild)) ? -1 : iIndexOfChild - c0217fa.m1145b(iIndexOfChild);
                if (i == -1) {
                    i = this.f3455a.m2232k();
                }
                if (iM1145b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3456b.indexOfChild(view) + this.f3456b.m418y());
                }
                if (iM1145b != i) {
                    AbstractC0540nz abstractC0540nz = this.f3456b.f605l;
                    View viewM1978u = abstractC0540nz.m1978u(iM1145b);
                    if (viewM1978u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM1145b + abstractC0540nz.f3456b.toString());
                    }
                    abstractC0540nz.m1978u(iM1145b);
                    abstractC0540nz.f3455a.m2225d(iM1145b);
                    C0577oz c0577oz2 = (C0577oz) viewM1978u.getLayoutParams();
                    b00 b00VarM367I2 = RecyclerView.m367I(viewM1978u);
                    if (b00VarM367I2.m488h()) {
                        u30 u30Var2 = (u30) abstractC0540nz.f3456b.f593f.f1363b;
                        oa0 oa0VarM2004a2 = (oa0) u30Var2.getOrDefault(b00VarM367I2, null);
                        if (oa0VarM2004a2 == null) {
                            oa0VarM2004a2 = oa0.m2004a();
                            u30Var2.put(b00VarM367I2, oa0VarM2004a2);
                        }
                        oa0VarM2004a2.f3519a = 1 | oa0VarM2004a2.f3519a;
                    } else {
                        abstractC0540nz.f3456b.f593f.m878I(b00VarM367I2);
                    }
                    abstractC0540nz.f3455a.m2224c(viewM1978u, i, c0577oz2, b00VarM367I2.m488h());
                }
            } else {
                this.f3455a.m2223b(view, i, false);
                c0577oz.f3623c = true;
                C0939yq c0939yq = this.f3459e;
                if (c0939yq != null && c0939yq.f5383e) {
                    c0939yq.f5380b.getClass();
                    b00 b00VarM367I3 = RecyclerView.m367I(view);
                    if ((b00VarM367I3 != null ? b00VarM367I3.m482b() : -1) == c0939yq.f5379a) {
                        c0939yq.f5384f = view;
                    }
                }
            }
        }
        if (c0577oz.f3624d) {
            b00VarM367I.f697a.invalidate();
            c0577oz.f3624d = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo353c(String str) {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView != null) {
            recyclerView.m403i(str);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public Parcelable mo354c0() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo355d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo356e();

    /* JADX INFO: renamed from: e0 */
    public final void m1967e0(C0763tz c0763tz) {
        for (int iM1980v = m1980v() - 1; iM1980v >= 0; iM1980v--) {
            if (!RecyclerView.m367I(m1978u(iM1980v)).m495o()) {
                View viewM1978u = m1978u(iM1980v);
                m1970h0(iM1980v);
                c0763tz.m2398f(viewM1978u);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean mo304f(C0577oz c0577oz) {
        return c0577oz != null;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1968f0(C0763tz c0763tz) {
        ArrayList arrayList = c0763tz.f4633a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((b00) arrayList.get(i)).f697a;
            b00 b00VarM367I = RecyclerView.m367I(view);
            if (!b00VarM367I.m495o()) {
                b00VarM367I.m494n(false);
                if (b00VarM367I.m490j()) {
                    this.f3456b.removeDetachedView(view, false);
                }
                AbstractC0392jz abstractC0392jz = this.f3456b.f567H;
                if (abstractC0392jz != null) {
                    abstractC0392jz.mo1613d(b00VarM367I);
                }
                b00VarM367I.m494n(true);
                b00 b00VarM367I2 = RecyclerView.m367I(view);
                b00VarM367I2.f710n = null;
                b00VarM367I2.f711o = false;
                b00VarM367I2.f706j &= -33;
                c0763tz.m2399g(b00VarM367I2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c0763tz.f4634b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3456b.invalidate();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1969g0(View view, C0763tz c0763tz) {
        C0659r5 c0659r5 = this.f3455a;
        C0205ez c0205ez = (C0205ez) c0659r5.f4209b;
        int iIndexOfChild = c0205ez.f1865a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0217fa) c0659r5.f4210c).m1149f(iIndexOfChild)) {
                c0659r5.m2221B(view);
            }
            c0205ez.m1100h(iIndexOfChild);
        }
        c0763tz.m2398f(view);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1970h0(int i) {
        if (m1978u(i) != null) {
            C0659r5 c0659r5 = this.f3455a;
            int iM2238r = c0659r5.m2238r(i);
            C0205ez c0205ez = (C0205ez) c0659r5.f4209b;
            View childAt = c0205ez.f1865a.getChildAt(iM2238r);
            if (childAt == null) {
                return;
            }
            if (((C0217fa) c0659r5.f4210c).m1149f(iM2238r)) {
                c0659r5.m2221B(childAt);
            }
            c0205ez.m1100h(iM2238r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo745i0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.m1961C()
            int r1 = r8.m1963E()
            int r2 = r8.f3468n
            int r3 = r8.m1962D()
            int r2 = r2 - r3
            int r3 = r8.f3469o
            int r4 = r8.m1960B()
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
            int r3 = r8.m1959A()
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
            int r1 = r8.m1961C()
            int r2 = r8.m1963E()
            int r3 = r8.f3468n
            int r4 = r8.m1962D()
            int r3 = r3 - r4
            int r4 = r8.f3469o
            int r5 = r8.m1960B()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3456b
            android.graphics.Rect r5 = r5.f597h
            r8.mo746y(r13, r5)
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
            r9.m396Z(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0540nz.mo745i0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo359j(C0948yz c0948yz);

    /* JADX INFO: renamed from: j0 */
    public final void m1971j0() {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo310k(C0948yz c0948yz);

    /* JADX INFO: renamed from: k0 */
    public abstract int mo311k0(int i, C0763tz c0763tz, C0948yz c0948yz);

    /* JADX INFO: renamed from: l */
    public abstract int mo313l(C0948yz c0948yz);

    /* JADX INFO: renamed from: l0 */
    public abstract void mo360l0(int i);

    /* JADX INFO: renamed from: m */
    public abstract int mo361m(C0948yz c0948yz);

    /* JADX INFO: renamed from: m0 */
    public abstract int mo314m0(int i, C0763tz c0763tz, C0948yz c0948yz);

    /* JADX INFO: renamed from: n */
    public abstract int mo315n(C0948yz c0948yz);

    /* JADX INFO: renamed from: n0 */
    public final void m1972n0(RecyclerView recyclerView) {
        m1973o0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo316o(C0948yz c0948yz);

    /* JADX INFO: renamed from: o0 */
    public final void m1973o0(int i, int i2) {
        this.f3468n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f3466l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f557s0;
        }
        this.f3469o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f3467m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f557s0;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1974p(C0763tz c0763tz) {
        for (int iM1980v = m1980v() - 1; iM1980v >= 0; iM1980v--) {
            View viewM1978u = m1978u(iM1980v);
            b00 b00VarM367I = RecyclerView.m367I(viewM1978u);
            if (!b00VarM367I.m495o()) {
                if (!b00VarM367I.m486f() || b00VarM367I.m488h() || this.f3456b.f603k.f1998b) {
                    m1978u(iM1980v);
                    this.f3455a.m2225d(iM1980v);
                    c0763tz.m2400h(viewM1978u);
                    this.f3456b.f593f.m878I(b00VarM367I);
                } else {
                    m1970h0(iM1980v);
                    c0763tz.m2399g(b00VarM367I);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void mo317p0(Rect rect, int i, int i2) {
        int iM1962D = m1962D() + m1961C() + rect.width();
        int iM1960B = m1960B() + m1963E() + rect.height();
        RecyclerView recyclerView = this.f3456b;
        WeakHashMap weakHashMap = ja0.f2600a;
        this.f3456b.setMeasuredDimension(m1957g(i, iM1962D, s90.m2313e(recyclerView)), m1957g(i2, iM1960B, s90.m2312d(this.f3456b)));
    }

    /* JADX INFO: renamed from: q */
    public View mo362q(int i) {
        int iM1980v = m1980v();
        for (int i2 = 0; i2 < iM1980v; i2++) {
            View viewM1978u = m1978u(i2);
            b00 b00VarM367I = RecyclerView.m367I(viewM1978u);
            if (b00VarM367I != null && b00VarM367I.m482b() == i && !b00VarM367I.m495o() && (this.f3456b.f588c0.f5421g || !b00VarM367I.m488h())) {
                return viewM1978u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m1975q0(int i, int i2) {
        int iM1980v = m1980v();
        if (iM1980v == 0) {
            this.f3456b.m407n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM1980v; i7++) {
            View viewM1978u = m1978u(i7);
            Rect rect = this.f3456b.f597h;
            mo746y(viewM1978u, rect);
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
        this.f3456b.f597h.set(i6, i4, i3, i5);
        mo317p0(this.f3456b.f597h, i, i2);
    }

    /* JADX INFO: renamed from: r */
    public abstract C0577oz mo318r();

    /* JADX INFO: renamed from: r0 */
    public final void m1976r0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3456b = null;
            this.f3455a = null;
            this.f3468n = 0;
            this.f3469o = 0;
        } else {
            this.f3456b = recyclerView;
            this.f3455a = recyclerView.f591e;
            this.f3468n = recyclerView.getWidth();
            this.f3469o = recyclerView.getHeight();
        }
        this.f3466l = 1073741824;
        this.f3467m = 1073741824;
    }

    /* JADX INFO: renamed from: s */
    public C0577oz mo319s(Context context, AttributeSet attributeSet) {
        return new C0577oz(context, attributeSet);
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m1977s0(View view, int i, int i2, C0577oz c0577oz) {
        return (!view.isLayoutRequested() && this.f3462h && m1955K(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0577oz).width) && m1955K(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0577oz).height)) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    public C0577oz mo320t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0577oz ? new C0577oz((C0577oz) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0577oz((ViewGroup.MarginLayoutParams) layoutParams) : new C0577oz(layoutParams);
    }

    /* JADX INFO: renamed from: t0 */
    public boolean mo363t0() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final View m1978u(int i) {
        C0659r5 c0659r5 = this.f3455a;
        if (c0659r5 != null) {
            return c0659r5.m2231j(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m1979u0(View view, int i, int i2, C0577oz c0577oz) {
        return (this.f3462h && m1955K(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0577oz).width) && m1955K(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0577oz).height)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public final int m1980v() {
        C0659r5 c0659r5 = this.f3455a;
        if (c0659r5 != null) {
            return c0659r5.m2232k();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public abstract void mo364v0(RecyclerView recyclerView, int i);

    /* JADX INFO: renamed from: w0 */
    public final void m1981w0(C0939yq c0939yq) {
        C0939yq c0939yq2 = this.f3459e;
        if (c0939yq2 != null && c0939yq != c0939yq2 && c0939yq2.f5383e) {
            c0939yq2.m2737i();
        }
        this.f3459e = c0939yq;
        RecyclerView recyclerView = this.f3456b;
        a00 a00Var = recyclerView.f582W;
        a00Var.f9g.removeCallbacks(a00Var);
        a00Var.f5c.abortAnimation();
        if (c0939yq.f5386h) {
            Log.w("RecyclerView", "An instance of " + c0939yq.getClass().getSimpleName() + " was started more than once. Each instance of" + c0939yq.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0939yq.f5380b = recyclerView;
        c0939yq.f5381c = this;
        int i = c0939yq.f5379a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f588c0.f5415a = i;
        c0939yq.f5383e = true;
        c0939yq.f5382d = true;
        c0939yq.f5384f = recyclerView.f605l.mo362q(i);
        c0939yq.f5380b.f582W.m3a();
        c0939yq.f5386h = true;
    }

    /* JADX INFO: renamed from: x */
    public int mo321x(C0763tz c0763tz, C0948yz c0948yz) {
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView == null || recyclerView.f603k == null || !mo355d()) {
            return 1;
        }
        return this.f3456b.f603k.mo757a();
    }

    /* JADX INFO: renamed from: x0 */
    public boolean mo322x0() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public void mo746y(View view, Rect rect) {
        int[] iArr = RecyclerView.f557s0;
        C0577oz c0577oz = (C0577oz) view.getLayoutParams();
        Rect rect2 = c0577oz.f3622b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0577oz).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0577oz).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0577oz).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0577oz).bottomMargin);
    }

    /* JADX INFO: renamed from: z */
    public final int m1982z() {
        RecyclerView recyclerView = this.f3456b;
        AbstractC0242fz adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo757a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: O */
    public void mo744O(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: b0 */
    public void mo351b0(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: d0 */
    public void mo447d0(int i) {
    }

    /* JADX INFO: renamed from: V */
    public void mo294V() {
    }

    /* JADX INFO: renamed from: U */
    public void mo293U(int i, int i2) {
    }

    /* JADX INFO: renamed from: W */
    public void mo295W(int i, int i2) {
    }

    /* JADX INFO: renamed from: X */
    public void mo296X(int i, int i2) {
    }

    /* JADX INFO: renamed from: Y */
    public void mo297Y(int i, int i2) {
    }

    /* JADX INFO: renamed from: i */
    public void mo358i(int i, C0074bn c0074bn) {
    }

    /* JADX INFO: renamed from: h */
    public void mo357h(int i, int i2, C0948yz c0948yz, C0074bn c0074bn) {
    }
}
