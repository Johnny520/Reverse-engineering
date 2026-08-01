package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public abstract class nz {
    public r5 a;
    public RecyclerView b;
    public final d4 c;
    public final d4 d;
    public yq e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public nz() {
        lz r0 = new lz(this, 0);
        lz r1 = new lz(this, 1);
        this.c = new d4(r0);
        this.d = new d4(r1);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int F(View r0) {
        return ((oz) r0.getLayoutParams()).a.b();
    }

    public static mz G(Context r2, AttributeSet r3, int r4, int r5) {
        mz r0 = new mz();
        TypedArray r22 = r2.obtainStyledAttributes(r3, vy.a, r4, r5);
        r0.a = r22.getInt(0, 1);
        r0.b = r22.getInt(10, 1);
        r0.c = r22.getBoolean(9, false);
        r0.d = r22.getBoolean(11, false);
        r22.recycle();
        return r0;
    }

    public static boolean K(int r3, int r4, int r5) {
        int r0 = View.MeasureSpec.getMode(r4);
        int r42 = View.MeasureSpec.getSize(r4);
        if (r5 <= 0) goto L7;
        if (r3 == r5) goto L7;
        return false;
    L7:
        if (r0 == Integer.MIN_VALUE) goto L16;
        if (r0 != 0) goto L10;
        return true;
    L10:
        if (r0 == 1073741824) goto L12;
        return false;
    L12:
        if (r42 != r3) goto L14;
        return true;
    L14:
        return false;
    L16:
        if (r42 < r3) goto L18;
        return true;
    L18:
        return false;
    }

    public static void L(View r3, int r4, int r5, int r6, int r7) {
        oz r0 = (oz) r3.getLayoutParams();
        Rect r1 = r0.b;
        r3.layout((r4 + r1.left) + ((ViewGroup.MarginLayoutParams) r0).leftMargin, (r5 + r1.top) + ((ViewGroup.MarginLayoutParams) r0).topMargin, (r6 - r1.right) - ((ViewGroup.MarginLayoutParams) r0).rightMargin, (r7 - r1.bottom) - ((ViewGroup.MarginLayoutParams) r0).bottomMargin);
    }

    public static int g(int r2, int r3, int r4) {
        int r0 = View.MeasureSpec.getMode(r2);
        int r22 = View.MeasureSpec.getSize(r2);
        if (r0 == Integer.MIN_VALUE) goto L9;
        if (r0 != 1073741824) goto L7;
        return r22;
    L7:
        return Math.max(r3, r4);
    L9:
        return Math.min(r22, Math.max(r3, r4));
    }

    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        int r52 = Math.max(0, r5 - r7);
        if (r4 == false) goto L11;
        if (r8 < 0) goto L6;
    L5:
        r6 = 1073741824;
    L22:
        return View.MeasureSpec.makeMeasureSpec(r8, r6);
    L6:
        if (r8 != (-1)) goto L10;
        if (r6 == Integer.MIN_VALUE) goto L14;
        if (r6 == 0) goto L10;
        if (r6 != 1073741824) goto L10;
    L14:
        r8 = r52;
    L10:
        r6 = 0;
        r8 = 0;
        goto L22
    L11:
        if (r8 >= 0) goto L5;
        if (r8 == (-1)) goto L14;
        if (r8 != (-2)) goto L10;
        if (r6 == Integer.MIN_VALUE) goto L20;
        if (r6 == 1073741824) goto L20;
        r8 = r52;
        r6 = 0;
    L20:
        r8 = r52;
        r6 = Integer.MIN_VALUE;
        goto L22
    }

    public final int A() {
        RecyclerView r0 = this.b;
        WeakHashMap r1 = ja0.a;
        return t90.d(r0);
    }

    public final int B() {
        RecyclerView r0 = this.b;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingBottom();
    }

    public final int C() {
        RecyclerView r0 = this.b;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingLeft();
    }

    public final int D() {
        RecyclerView r0 = this.b;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingRight();
    }

    public final int E() {
        RecyclerView r0 = this.b;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingTop();
    }

    public int H(tz r1, yz r2) {
        RecyclerView r12 = this.b;
        if (r12 != null) goto L5;
    L11:
        return 1;
    L5:
        if (r12.k == null) goto L11;
        if (e() == false) goto L11;
        return this.b.k.a();
    }

    public final void I(View r7, Rect r8) {
        Rect r0 = ((oz) r7.getLayoutParams()).b;
        r8.set(-r0.left, -r0.top, r7.getWidth() + r0.right, r7.getHeight() + r0.bottom);
        if (this.b == null) goto L9;
        Matrix r02 = r7.getMatrix();
        if (r02 == null) goto L9;
        if (r02.isIdentity() == true) goto L9;
        RectF r1 = this.b.j;
        r1.set(r8);
        r02.mapRect(r1);
        r8.set((int) Math.floor(r1.left), (int) Math.floor(r1.top), (int) Math.ceil(r1.right), (int) Math.ceil(r1.bottom));
    L9:
        r8.offset(r7.getLeft(), r7.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int r5) {
        RecyclerView r0 = this.b;
        if (r0 == null) goto L7;
        int r1 = r0.e.k();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L9;
        r0.e.j(r2).offsetLeftAndRight(r5);
        r2 = r2 + 1;
        goto L5
    L9:
        return;
    }

    public void N(int r5) {
        RecyclerView r0 = this.b;
        if (r0 == null) goto L7;
        int r1 = r0.e.k();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L9;
        r0.e.j(r2).offsetTopAndBottom(r5);
        r2 = r2 + 1;
        goto L5
    L9:
        return;
    }

    public abstract void P(RecyclerView r1);

    public abstract View Q(View r1, int r2, tz r3, yz r4);

    public void R(AccessibilityEvent r4) {
        RecyclerView r0 = this.b;
        tz r1 = r0.b;
        yz r12 = r0.c0;
        if (r0 == null) goto L20;
        if (r4 == null) goto L22;
        boolean r13 = true;
        if (r0.canScrollVertically(1) == false) goto L9;
    L16:
        r4.setScrollable(r13);
        fz r02 = this.b.k;
        if (r02 == null) goto L21;
        r4.setItemCount(r02.a());
        return;
    L21:
        return;
    L9:
        if (this.b.canScrollVertically(-1) == true) goto L16;
        if (this.b.canScrollHorizontally(-1) == true) goto L16;
        if (this.b.canScrollHorizontally(1) == true) goto L16;
        r13 = false;
        goto L16
    L22:
        return;
    }

    public void S(tz r2, yz r3, View r4, j0 r5) {
        if (e() == false) goto L5;
        int r22 = F(r4);
    L7:
        if (d() == false) goto L9;
        int r42 = F(r4);
    L10:
        r5.f(i0.a(false, r22, 1, r42, 1));
        return;
    L9:
        r42 = 0;
        goto L10
    L5:
        r22 = 0;
        goto L7
    }

    public final void T(View r3, j0 r4) {
        b00 r0 = RecyclerView.I(r3);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.h() == true) goto L11;
        r5 r1 = this.a;
        View r02 = r0.a;
        if (((ArrayList) r1.d).contains(r02) == true) goto L12;
        RecyclerView r03 = this.b;
        S(r03.b, r03.c0, r3, r4);
        return;
    L12:
        return;
    }

    public abstract void Z(tz r1, yz r2);

    public abstract void a0(yz r1);

    public final void b(View r9, int r10, boolean r11) {
        b00 r0 = RecyclerView.I(r9);
        if (r11 == false) goto L5;
    L8:
        u30 r112 = (u30) this.b.f.b;
        oa0 r3 = (oa0) r112.getOrDefault(r0, null);
        if (r3 != null) goto L11;
        r3 = oa0.a();
        r112.put(r0, r3);
    L11:
        r3.a |= 1;
    L12:
        oz r113 = (oz) r9.getLayoutParams();
        if (r0.p() == true) goto L55;
        if (r0.i() == true) goto L55;
        int r6 = -1;
        if (r9.getParent() != this.b) goto L44;
        r5 r32 = this.a;
        fa r5 = (fa) r32.c;
        int r33 = ((ez) r32.b).a.indexOfChild(r9);
        if (r33 != (-1)) goto L23;
    L21:
        int r34 = -1;
    L26:
        if (r10 != (-1)) goto L28;
        r10 = this.a.k();
    L28:
        if (r34 == (-1)) goto L43;
        if (r34 == r10) goto L60;
        nz r92 = this.b.l;
        View r52 = r92.u(r34);
        if (r52 == null) goto L41;
        r92.u(r34);
        r92.a.d(r34);
        oz r35 = (oz) r52.getLayoutParams();
        b00 r62 = RecyclerView.I(r52);
        if (r62.h() == false) goto L38;
        u30 r7 = (u30) r92.b.f.b;
        oa0 r1 = (oa0) r7.getOrDefault(r62, null);
        if (r1 != null) goto L37;
        r1 = oa0.a();
        r7.put(r62, r1);
    L37:
        r1.a = 1 | r1.a;
    L39:
        r92.a.c(r52, r10, r35, r62.h());
        goto L60
    L38:
        r92.b.f.I(r62);
        goto L39
    L41:
        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + r34 + r92.b.toString());
    L60:
        if (r113.d == false) goto L63;
        r0.a.invalidate();
        r113.d = false;
        return;
    L63:
        return;
    L43:
        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(r9) + this.b.y());
    L23:
        if (r5.d(r33) == true) goto L21;
        r34 = r33 - r5.b(r33);
        goto L26
    L44:
        this.a.b(r9, r10, false);
        r113.c = true;
        yq r102 = this.e;
        if (r102 == null) goto L60;
        if (r102.e == false) goto L60;
        r102.b.getClass();
        b00 r12 = RecyclerView.I(r9);
        if (r12 == null) goto L52;
        r6 = r12.b();
    L52:
        if (r6 != r102.a) goto L60;
        r102.f = r9;
    L55:
        if (r0.i() == false) goto L57;
        r0.n.j(r0);
    L58:
        this.a.c(r9, r10, r9.getLayoutParams(), false);
        goto L60
    L57:
        r0.j &= -33;
        goto L58
    L5:
        if (r0.h() == true) goto L8;
        this.b.f.I(r0);
        goto L12
    }

    public void c(String r2) {
        RecyclerView r0 = this.b;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    public Parcelable c0() {
        return null;
    }

    public abstract boolean d();

    public abstract boolean e();

    public final void e0(tz r3) {
        int r0 = v() - 1;
    L3:
        if (r0 < 0) goto L8;
        if (RecyclerView.I(u(r0)).o() == true) goto L7;
        View r1 = u(r0);
        h0(r0);
        r3.f(r1);
    L7:
        r0 = r0 - 1;
        goto L3
    }

    public boolean f(oz r1) {
        if (r1 == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final void f0(tz r8) {
        ArrayList r0 = r8.a;
        int r1 = r0.size();
        int r2 = r1 - 1;
    L3:
        if (r2 < 0) goto L15;
        View r3 = ((b00) r0.get(r2)).a;
        b00 r4 = RecyclerView.I(r3);
        if (r4.o() == true) goto L14;
        r4.n(false);
        if (r4.j() == false) goto L10;
        this.b.removeDetachedView(r3, false);
    L10:
        jz r6 = this.b.H;
        if (r6 == null) goto L13;
        r6.d(r4);
    L13:
        r4.n(true);
        b00 r32 = RecyclerView.I(r3);
        r32.n = null;
        r32.o = false;
        r32.j &= -33;
        r8.g(r32);
    L14:
        r2 = r2 - 1;
        goto L3
    L15:
        r0.clear();
        ArrayList r82 = r8.b;
        if (r82 == null) goto L18;
        r82.clear();
    L18:
        if (r1 <= 0) goto L24;
        this.b.invalidate();
        return;
    }

    public final void g0(View r5, tz r6) {
        r5 r0 = this.a;
        ez r1 = (ez) r0.b;
        int r2 = r1.a.indexOfChild(r5);
        if (r2 >= 0) goto L6;
    L9:
        r6.f(r5);
        return;
    L6:
        if (((fa) r0.c).f(r2) == false) goto L8;
        r0.B(r5);
    L8:
        r1.h(r2);
        goto L9
    }

    public final void h0(int r5) {
        if (u(r5) == null) goto L12;
        r5 r0 = this.a;
        int r52 = r0.r(r5);
        ez r1 = (ez) r0.b;
        View r2 = r1.a.getChildAt(r52);
        if (r2 != null) goto L8;
        return;
    L8:
        if (((fa) r0.c).f(r52) == false) goto L10;
        r0.B(r2);
    L10:
        r1.h(r52);
        return;
    }

    public boolean i0(RecyclerView r9, View r10, Rect r11, boolean r12, boolean r13) {
        int r0 = C();
        int r1 = E();
        int r2 = this.n - D();
        int r3 = this.o - B();
        int r4 = (r10.getLeft() + r11.left) - r10.getScrollX();
        int r5 = (r10.getTop() + r11.top) - r10.getScrollY();
        int r102 = r11.width() + r4;
        int r112 = r11.height() + r5;
        int r42 = r4 - r0;
        int r6 = Math.min(0, r42);
        int r52 = r5 - r1;
        int r14 = Math.min(0, r52);
        int r103 = r102 - r2;
        int r22 = Math.max(0, r103);
        int r113 = Math.max(0, r112 - r3);
        if (A() != 1) goto L7;
        if (r22 != 0) goto L11;
        r22 = Math.max(r6, r103);
    L11:
        if (r14 != 0) goto L14;
        r14 = Math.min(r52, r113);
    L14:
        int[] r104 = {r22, r14};
        int r114 = r104[0];
        int r105 = r104[1];
        if (r13 == false) goto L28;
        View r132 = r9.getFocusedChild();
        if (r132 == null) goto L31;
        int r15 = C();
        int r23 = E();
        int r32 = this.n - D();
        int r43 = this.o - B();
        Rect r53 = this.b.h;
        y(r132, r53);
        if ((r53.left - r114) >= r32) goto L31;
        if ((r53.right - r114) <= r15) goto L31;
        if ((r53.top - r105) >= r43) goto L31;
        if ((r53.bottom - r105) > r23) goto L28;
    L31:
        return false;
    L28:
        if (r114 != 0) goto L32;
        if (r105 == 0) goto L31;
    L32:
        if (r12 == false) goto L35;
        r9.scrollBy(r114, r105);
        return true;
    L35:
        r9.Z(r114, r105, false);
        return true;
    L7:
        if (r6 != 0) goto L10;
        r6 = Math.min(r42, r22);
    L10:
        r22 = r6;
        goto L11
    }

    public abstract int j(yz r1);

    public final void j0() {
        RecyclerView r0 = this.b;
        if (r0 == null) goto L6;
        r0.requestLayout();
        return;
    }

    public abstract int k(yz r1);

    public abstract int k0(int r1, tz r2, yz r3);

    public abstract int l(yz r1);

    public abstract void l0(int r1);

    public abstract int m(yz r1);

    public abstract int m0(int r1, tz r2, yz r3);

    public abstract int n(yz r1);

    public final void n0(RecyclerView r3) {
        o0(View.MeasureSpec.makeMeasureSpec(r3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r3.getHeight(), 1073741824));
    }

    public abstract int o(yz r1);

    public final void o0(int r2, int r3) {
        this.n = View.MeasureSpec.getSize(r2);
        int r22 = View.MeasureSpec.getMode(r2);
        this.l = r22;
        if (r22 != 0) goto L5;
        int[] r23 = RecyclerView.s0;
    L5:
        this.o = View.MeasureSpec.getSize(r3);
        int r24 = View.MeasureSpec.getMode(r3);
        this.m = r24;
        if (r24 != 0) goto L9;
        int[] r25 = RecyclerView.s0;
        return;
    }

    public final void p(tz r5) {
        int r0 = v() - 1;
    L3:
        if (r0 < 0) goto L16;
        View r1 = u(r0);
        b00 r2 = RecyclerView.I(r1);
        if (r2.o() == true) goto L15;
        if (r2.f() == true) goto L10;
    L14:
        u(r0);
        this.a.d(r0);
        r5.h(r1);
        this.b.f.I(r2);
        goto L15
    L10:
        if (r2.h() == true) goto L14;
        if (this.b.k.b == true) goto L14;
        h0(r0);
        r5.g(r2);
    L15:
        r0 = r0 - 1;
        goto L3
    }

    public void p0(Rect r4, int r5, int r6) {
        int r0 = r4.width();
        int r1 = C() + r0;
        int r02 = D() + r1;
        int r42 = r4.height();
        int r12 = E() + r42;
        int r43 = B() + r12;
        RecyclerView r13 = this.b;
        WeakHashMap r2 = ja0.a;
        int r52 = g(r5, r02, s90.e(r13));
        int r44 = g(r6, r43, s90.d(this.b));
        RecyclerView.e(this.b, r52, r44);
    }

    public View q(int r6) {
        int r0 = v();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L17;
        View r2 = u(r1);
        b00 r3 = RecyclerView.I(r2);
        if (r3 == null) goto L16;
        if (r3.b() != r6) goto L16;
        if (r3.o() == true) goto L16;
        if (this.b.c0.g == true) goto L15;
        if (r3.h() == true) goto L16;
    L15:
        return r2;
    L16:
        r1 = r1 + 1;
        goto L3
    L17:
        return null;
    }

    public final void q0(int r9, int r10) {
        int r0 = v();
        if (r0 != 0) goto L6;
        this.b.n(r9, r10);
        return;
    L6:
        int r1 = Integer.MIN_VALUE;
        int r4 = Integer.MAX_VALUE;
        int r5 = 0;
        int r2 = Integer.MIN_VALUE;
        int r3 = Integer.MAX_VALUE;
    L7:
        if (r5 >= r0) goto L21;
        View r6 = u(r5);
        Rect r7 = this.b.h;
        y(r6, r7);
        int r62 = r7.left;
        if (r62 >= r3) goto L11;
        r3 = r62;
    L11:
        int r63 = r7.right;
        if (r63 <= r1) goto L14;
        r1 = r63;
    L14:
        int r64 = r7.top;
        if (r64 >= r4) goto L17;
        r4 = r64;
    L17:
        int r65 = r7.bottom;
        if (r65 <= r2) goto L20;
        r2 = r65;
    L20:
        r5 = r5 + 1;
        goto L7
    L21:
        this.b.h.set(r3, r4, r1, r2);
        p0(this.b.h, r9, r10);
    }

    public abstract oz r();

    public final void r0(RecyclerView r2) {
        if (r2 != null) goto L4;
        this.b = null;
        this.a = null;
        this.n = 0;
        this.o = 0;
    L5:
        this.l = 1073741824;
        this.m = 1073741824;
        return;
    L4:
        this.b = r2;
        this.a = r2.e;
        this.n = r2.getWidth();
        this.o = r2.getHeight();
        goto L5
    }

    public oz s(Context r2, AttributeSet r3) {
        return new oz(r2, r3);
    }

    public final boolean s0(View r3, int r4, int r5, oz r6) {
        if (r3.isLayoutRequested() == false) goto L5;
        return true;
    L5:
        if (this.h == true) goto L7;
        return true;
    L7:
        if (K(r3.getWidth(), r4, ((ViewGroup.MarginLayoutParams) r6).width) == true) goto L9;
        return true;
    L9:
        if (K(r3.getHeight(), r5, ((ViewGroup.MarginLayoutParams) r6).height) == false) goto L17;
        return false;
    L17:
        return true;
    }

    public oz t(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof oz) == false) goto L7;
        return new oz((oz) r2);
    L7:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        return new oz((ViewGroup.MarginLayoutParams) r2);
    L11:
        return new oz(r2);
    }

    public boolean t0() {
        return false;
    }

    public final View u(int r2) {
        r5 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.j(r2);
    }

    public final boolean u0(View r3, int r4, int r5, oz r6) {
        if (this.h == true) goto L5;
        return true;
    L5:
        if (K(r3.getMeasuredWidth(), r4, ((ViewGroup.MarginLayoutParams) r6).width) == true) goto L7;
        return true;
    L7:
        if (K(r3.getMeasuredHeight(), r5, ((ViewGroup.MarginLayoutParams) r6).height) == false) goto L14;
        return false;
    L14:
        return true;
    }

    public final int v() {
        r5 r0 = this.a;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.k();
    }

    public abstract void v0(RecyclerView r1, int r2);

    public final void w0(yq r4) {
        yq r0 = this.e;
        if (r0 == null) goto L8;
        if (r4 == r0) goto L8;
        if (r0.e == false) goto L8;
        r0.i();
    L8:
        this.e = r4;
        RecyclerView r02 = this.b;
        a00 r1 = r02.W;
        r1.g.removeCallbacks(r1);
        r1.c.abortAnimation();
        if (r4.h == false) goto L11;
        Log.w("RecyclerView", "An instance of " + r4.getClass().getSimpleName() + " was started more than once. Each instance of" + r4.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
    L11:
        r4.b = r02;
        r4.c = this;
        int r12 = r4.a;
        if (r12 == (-1)) goto L16;
        r02.c0.a = r12;
        r4.e = true;
        r4.d = true;
        r4.f = r02.l.q(r12);
        r4.b.W.a();
        r4.h = true;
        return;
    L16:
        throw new IllegalArgumentException("Invalid target position");
    }

    public int x(tz r1, yz r2) {
        RecyclerView r12 = this.b;
        if (r12 != null) goto L5;
    L11:
        return 1;
    L5:
        if (r12.k == null) goto L11;
        if (d() == false) goto L11;
        return this.b.k.a();
    }

    public boolean x0() {
        return false;
    }

    public void y(View r7, Rect r8) {
        int[] r0 = RecyclerView.s0;
        oz r02 = (oz) r7.getLayoutParams();
        Rect r1 = r02.b;
        r8.set((r7.getLeft() - r1.left) - ((ViewGroup.MarginLayoutParams) r02).leftMargin, (r7.getTop() - r1.top) - ((ViewGroup.MarginLayoutParams) r02).topMargin, (r7.getRight() + r1.right) + ((ViewGroup.MarginLayoutParams) r02).rightMargin, (r7.getBottom() + r1.bottom) + ((ViewGroup.MarginLayoutParams) r02).bottomMargin);
    }

    public final int z() {
        RecyclerView r0 = this.b;
        if (r0 == null) goto L5;
        fz r02 = r0.getAdapter();
    L6:
        if (r02 != null) goto L8;
        return 0;
    L8:
        return r02.a();
    L5:
        r02 = null;
        goto L6
    }

    public void O(RecyclerView r1) {
    }

    public void b0(Parcelable r1) {
    }

    public void d0(int r1) {
    }

    public void V() {
    }

    public void U(int r1, int r2) {
    }

    public void W(int r1, int r2) {
    }

    public void X(int r1, int r2) {
    }

    public void Y(int r1, int r2) {
    }

    public void i(int r1, bn r2) {
    }

    public void h(int r1, int r2, yz r3, bn r4) {
    }
}
