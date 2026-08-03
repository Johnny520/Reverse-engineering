package p037U;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000A.C0002c;
import p006D.AbstractC0080Q;
import p008E.C0155i;
import p008E.C0156j;
import p018J0.C0234d;
import p035T.AbstractC0337a;
import p063j.C0966k;

/* JADX INFO: renamed from: U.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0343C {

    /* JADX INFO: renamed from: a */
    public C0234d f667a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f668b;

    /* JADX INFO: renamed from: c */
    public final C0002c f669c;

    /* JADX INFO: renamed from: d */
    public final C0002c f670d;

    /* JADX INFO: renamed from: e */
    public boolean f671e;

    /* JADX INFO: renamed from: f */
    public final boolean f672f;

    /* JADX INFO: renamed from: g */
    public int f673g;

    /* JADX INFO: renamed from: h */
    public int f674h;

    /* JADX INFO: renamed from: i */
    public int f675i;

    /* JADX INFO: renamed from: j */
    public int f676j;

    public AbstractC0343C() {
        C0342B r02 = new C0342B(this, 0);
        C0342B r1 = new C0342B(this, 1);
        this.f669c = new C0002c(r02);
        this.f670d = new C0002c(r1);
        this.f671e = false;
        this.f672f = true;
    }

    /* JADX INFO: renamed from: D */
    public static int m765D(View r02) {
        ((C0344D) r02.getLayoutParams()).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: E */
    public static C0381q m766E(Context r2, AttributeSet r3, int r4, int r5) {
        C0381q r02 = new C0381q(1);
        TypedArray r22 = r2.obtainStyledAttributes(r3, AbstractC0337a.f656a, r4, r5);
        r02.f850b = r22.getInt(0, 1);
        r02.f851c = r22.getInt(10, 1);
        r02.f852d = r22.getBoolean(9, false);
        r02.f853e = r22.getBoolean(11, false);
        r22.recycle();
        return r02;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m767I(int r3, int r4, int r5) {
        int r02 = View.MeasureSpec.getMode(r4);
        int r42 = View.MeasureSpec.getSize(r4);
        if (r5 <= 0) goto L7;
        if (r3 == r5) goto L7;
        return false;
    L7:
        if (r02 == Integer.MIN_VALUE) goto L16;
        if (r02 != 0) goto L10;
        return true;
    L10:
        if (r02 == 1073741824) goto L12;
        return false;
    L12:
        if (r42 == r3) goto L14;
        return false;
    L14:
        return true;
    L16:
        if (r42 >= r3) goto L18;
        return false;
    L18:
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m768f(int r2, int r3, int r4) {
        int r02 = View.MeasureSpec.getMode(r2);
        int r22 = View.MeasureSpec.getSize(r2);
        if (r02 == Integer.MIN_VALUE) goto L9;
        if (r02 != 1073741824) goto L7;
        return r22;
    L7:
        return Math.max(r3, r4);
    L9:
        return Math.min(r22, Math.max(r3, r4));
    }

    /* JADX INFO: renamed from: s */
    public static int m769s(boolean r4, int r5, int r6, int r7, int r8) {
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

    /* JADX INFO: renamed from: v */
    public static int m770v(View r2) {
        Rect r02 = ((C0344D) r2.getLayoutParams()).f677a;
        return (r2.getMeasuredHeight() + r02.top) + r02.bottom;
    }

    /* JADX INFO: renamed from: w */
    public static int m771w(View r2) {
        Rect r02 = ((C0344D) r2.getLayoutParams()).f677a;
        return (r2.getMeasuredWidth() + r02.left) + r02.right;
    }

    /* JADX INFO: renamed from: A */
    public final int m772A() {
        RecyclerView r02 = this.f668b;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.getPaddingLeft();
    }

    /* JADX INFO: renamed from: B */
    public final int m773B() {
        RecyclerView r02 = this.f668b;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.getPaddingRight();
    }

    /* JADX INFO: renamed from: C */
    public final int m774C() {
        RecyclerView r02 = this.f668b;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.getPaddingTop();
    }

    /* JADX INFO: renamed from: F */
    public int mo775F(C0349I r1, C0352L r2) {
        RecyclerView r12 = this.f668b;
        if (r12 == null) goto L5;
        r12.getClass();
    L5:
        return 1;
    }

    /* JADX INFO: renamed from: G */
    public final void m776G(View r7, Rect r8) {
        Rect r02 = ((C0344D) r7.getLayoutParams()).f677a;
        r8.set(-r02.left, -r02.top, r7.getWidth() + r02.right, r7.getHeight() + r02.bottom);
        if (this.f668b == null) goto L9;
        Matrix r03 = r7.getMatrix();
        if (r03 == null) goto L9;
        if (r03.isIdentity() == true) goto L9;
        RectF r1 = this.f668b.f1578i;
        r1.set(r8);
        r03.mapRect(r1);
        r8.set((int) Math.floor(r1.left), (int) Math.floor(r1.top), (int) Math.ceil(r1.right), (int) Math.ceil(r1.bottom));
    L9:
        r8.offset(r7.getLeft(), r7.getTop());
    }

    /* JADX INFO: renamed from: H */
    public abstract boolean mo777H();

    /* JADX INFO: renamed from: J */
    public void mo778J(RecyclerView r1) {
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo779K(RecyclerView r1);

    /* JADX INFO: renamed from: L */
    public abstract View mo780L(View r1, int r2, C0349I r3, C0352L r4);

    /* JADX INFO: renamed from: M */
    public void mo781M(AccessibilityEvent r4) {
        RecyclerView r02 = this.f668b;
        C0349I r1 = r02.f1562a;
        C0352L r12 = r02.f1561W;
        if (r02 == null) goto L18;
        if (r4 == null) goto L19;
        boolean r13 = true;
        if (r02.canScrollVertically(1) == false) goto L9;
    L16:
        r4.setScrollable(r13);
        this.f668b.getClass();
        return;
    L9:
        if (this.f668b.canScrollVertically(-1) == true) goto L16;
        if (this.f668b.canScrollHorizontally(-1) == true) goto L16;
        if (this.f668b.canScrollHorizontally(1) == true) goto L16;
        r13 = false;
        goto L16
    L19:
        return;
    }

    /* JADX INFO: renamed from: N */
    public void mo782N(C0349I r2, C0352L r3, View r4, C0156j r5) {
        if (mo800d() == false) goto L5;
        int r22 = m765D(r4);
    L7:
        if (mo799c() == false) goto L9;
        int r42 = m765D(r4);
    L10:
        r5.m511h(C0155i.m503a(false, r22, 1, r42, 1));
        return;
    L9:
        r42 = 0;
        goto L10
    L5:
        r22 = 0;
        goto L7
    }

    /* JADX INFO: renamed from: O */
    public final void m783O(View r1, C0156j r2) {
        RecyclerView.m1301u(r1);
    }

    /* JADX INFO: renamed from: P */
    public void mo784P(Parcelable r1) {
    }

    /* JADX INFO: renamed from: Q */
    public Parcelable mo785Q() {
        return null;
    }

    /* JADX INFO: renamed from: R */
    public void mo786R(int r1) {
    }

    /* JADX INFO: renamed from: S */
    public void m787S() {
        m793Y();
    }

    /* JADX INFO: renamed from: T */
    public final void m788T(C0349I r3) {
        int r02 = m813r() - 1;
    L3:
        if (r02 < 0) goto L8;
        if (RecyclerView.m1301u(m812q(r02)).m849o() == true) goto L7;
        View r1 = m812q(r02);
        m791W(r02);
        r3.m826f(r1);
    L7:
        r02 = r02 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: U */
    public final void m789U(C0349I r7) {
        int r02 = r7.f685a.size();
        int r1 = r02 - 1;
    L3:
        ArrayList r2 = r7.f685a;
        if (r1 < 0) goto L16;
        ((AbstractC0355O) r2.get(r1)).getClass();
        AbstractC0355O r22 = RecyclerView.m1301u(null);
        if (r22.m849o() == true) goto L15;
        r22.m848n(false);
        if (r22.m845k() == false) goto L11;
        this.f668b.removeDetachedView(null, false);
    L11:
        AbstractC0390z r5 = this.f668b.f1544F;
        if (r5 == null) goto L14;
        r5.mo946c(r22);
    L14:
        r22.m848n(true);
        AbstractC0355O r23 = RecyclerView.m1301u(null);
        r23.f712c = null;
        r23.f713d = false;
        r23.f711b &= -33;
        r7.m827g(r23);
    L15:
        r1 = r1 - 1;
        goto L3
    L16:
        r2.clear();
        ArrayList r72 = r7.f686b;
        if (r72 == null) goto L19;
        r72.clear();
    L19:
        if (r02 <= 0) goto L25;
        this.f668b.invalidate();
        return;
    }

    /* JADX INFO: renamed from: V */
    public final void m790V(View r5, C0349I r6) {
        C0234d r02 = this.f667a;
        C0386v r1 = (C0386v) r02.f474b;
        int r2 = r1.f875a.indexOfChild(r5);
        if (r2 >= 0) goto L6;
    L9:
        r6.m826f(r5);
        return;
    L6:
        if (((C0366b) r02.f475c).m942f(r2) == false) goto L8;
        r02.m660x(r5);
    L8:
        r1.m977a(r2);
        goto L9
    }

    /* JADX INFO: renamed from: W */
    public final void m791W(int r5) {
        if (m812q(r5) == null) goto L12;
        C0234d r02 = this.f667a;
        int r52 = r02.m648k(r5);
        C0386v r1 = (C0386v) r02.f474b;
        View r2 = r1.f875a.getChildAt(r52);
        if (r2 != null) goto L8;
        return;
    L8:
        if (((C0366b) r02.f475c).m942f(r52) == false) goto L10;
        r02.m660x(r2);
    L10:
        r1.m977a(r52);
        return;
    }

    /* JADX INFO: renamed from: X */
    public boolean mo792X(RecyclerView r9, View r10, Rect r11, boolean r12, boolean r13) {
        int r02 = m772A();
        int r1 = m774C();
        int r2 = this.f675i - m773B();
        int r3 = this.f676j - m818z();
        int r4 = (r10.getLeft() + r11.left) - r10.getScrollX();
        int r5 = (r10.getTop() + r11.top) - r10.getScrollY();
        int r102 = r11.width() + r4;
        int r112 = r11.height() + r5;
        int r42 = r4 - r02;
        int r6 = Math.min(0, r42);
        int r52 = r5 - r1;
        int r14 = Math.min(0, r52);
        int r103 = r102 - r2;
        int r22 = Math.max(0, r103);
        int r113 = Math.max(0, r112 - r3);
        if (m817y() != 1) goto L7;
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
        int r15 = m772A();
        int r23 = m774C();
        int r32 = this.f675i - m773B();
        int r43 = this.f676j - m818z();
        Rect r53 = this.f668b.f1574g;
        mo815u(r132, r53);
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
        if (r12 == false) goto L34;
        r9.scrollBy(r114, r105);
    L35:
        return true;
    L34:
        r9.m1309H(r114, r105, false);
        goto L35
    L7:
        if (r6 != 0) goto L10;
        r6 = Math.min(r42, r22);
    L10:
        r22 = r6;
        goto L11
    }

    /* JADX INFO: renamed from: Y */
    public final void m793Y() {
        RecyclerView r02 = this.f668b;
        if (r02 == null) goto L6;
        r02.requestLayout();
        return;
    }

    /* JADX INFO: renamed from: Z */
    public final void m794Z(RecyclerView r2) {
        if (r2 != null) goto L4;
        this.f668b = null;
        this.f667a = null;
        this.f675i = 0;
        this.f676j = 0;
    L5:
        this.f673g = 1073741824;
        this.f674h = 1073741824;
        return;
    L4:
        this.f668b = r2;
        this.f667a = r2.f1568d;
        this.f675i = r2.getWidth();
        this.f676j = r2.getHeight();
        goto L5
    }

    /* JADX INFO: renamed from: a */
    public final void m795a(View r8, int r9, boolean r10) {
        AbstractC0355O r02 = RecyclerView.m1301u(r8);
        if (r10 == false) goto L5;
    L8:
        C0966k r102 = (C0966k) this.f668b.f1570e.f7b;
        C0364Y r3 = (C0364Y) r102.getOrDefault(r02, null);
        if (r3 != null) goto L11;
        r3 = C0364Y.m936a();
        r102.put(r02, r3);
    L11:
        r3.f773a |= 1;
    L12:
        C0344D r103 = (C0344D) r8.getLayoutParams();
        if (r02.m850p() == true) goto L46;
        if (r02.m844j() == true) goto L46;
        if (r8.getParent() != this.f668b) goto L44;
        C0234d r32 = this.f667a;
        int r4 = ((C0386v) r32.f474b).f875a.indexOfChild(r8);
        if (r4 != (-1)) goto L22;
    L21:
        int r42 = -1;
    L26:
        if (r9 != (-1)) goto L28;
        r9 = this.f667a.m644g();
    L28:
        if (r42 == (-1)) goto L43;
        if (r42 == r9) goto L51;
        AbstractC0343C r82 = this.f668b.f1580j;
        View r33 = r82.m812q(r42);
        if (r33 == null) goto L41;
        r82.m812q(r42);
        r82.f667a.m641d(r42);
        C0344D r43 = (C0344D) r33.getLayoutParams();
        AbstractC0355O r5 = RecyclerView.m1301u(r33);
        if (r5.m843i() == false) goto L38;
        C0966k r6 = (C0966k) r82.f668b.f1570e.f7b;
        C0364Y r1 = (C0364Y) r6.getOrDefault(r5, null);
        if (r1 != null) goto L37;
        r1 = C0364Y.m936a();
        r6.put(r5, r1);
    L37:
        r1.f773a = 1 | r1.f773a;
    L39:
        r82.f667a.m640b(r33, r9, r43, r5.m843i());
        goto L51
    L38:
        r82.f668b.f1570e.m12m(r5);
        goto L39
    L41:
        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + r42 + r82.f668b.toString());
    L51:
        if (r103.f679c == true) goto L53;
        return;
    L53:
        r02.getClass();
        throw null;
    L43:
        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f668b.indexOfChild(r8) + this.f668b.m1324p());
    L22:
        C0366b r34 = (C0366b) r32.f475c;
        if (r34.m940d(r4) == true) goto L21;
        r42 = r4 - r34.m938b(r4);
        goto L26
    L44:
        this.f667a.m639a(r8, r9, false);
        r103.f678b = true;
    L46:
        if (r02.m844j() == false) goto L48;
        r02.f712c.m830j(r02);
    L49:
        this.f667a.m640b(r8, r9, r8.getLayoutParams(), false);
        goto L51
    L48:
        r02.f711b &= -33;
        goto L49
    L5:
        if (r02.m843i() == true) goto L8;
        this.f668b.f1570e.m12m(r02);
        goto L12
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m796a0(View r3, int r4, int r5, C0344D r6) {
        if (r3.isLayoutRequested() == false) goto L5;
    L12:
        return true;
    L5:
        if (this.f672f == false) goto L12;
        if (m767I(r3.getWidth(), r4, ((ViewGroup.MarginLayoutParams) r6).width) == false) goto L12;
        if (m767I(r3.getHeight(), r5, ((ViewGroup.MarginLayoutParams) r6).height) == false) goto L12;
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void mo797b(String r2) {
        RecyclerView r02 = this.f668b;
        if (r02 == null) goto L6;
        r02.m1313d(r2);
        return;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m798b0(View r3, int r4, int r5, C0344D r6) {
        if (this.f672f == true) goto L5;
    L10:
        return true;
    L5:
        if (m767I(r3.getMeasuredWidth(), r4, ((ViewGroup.MarginLayoutParams) r6).width) == false) goto L10;
        if (m767I(r3.getMeasuredHeight(), r5, ((ViewGroup.MarginLayoutParams) r6).height) == false) goto L10;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo799c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo800d();

    /* JADX INFO: renamed from: e */
    public boolean mo801e(C0344D r1) {
        if (r1 == null) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo802g(C0352L r1);

    /* JADX INFO: renamed from: h */
    public abstract int mo803h(C0352L r1);

    /* JADX INFO: renamed from: i */
    public abstract int mo804i(C0352L r1);

    /* JADX INFO: renamed from: j */
    public abstract int mo805j(C0352L r1);

    /* JADX INFO: renamed from: k */
    public abstract int mo806k(C0352L r1);

    /* JADX INFO: renamed from: l */
    public abstract int mo807l(C0352L r1);

    /* JADX INFO: renamed from: m */
    public View mo808m(int r3) {
        int r32 = m813r();
        int r02 = 0;
    L3:
        if (r02 >= r32) goto L5;
        RecyclerView.m1301u(m812q(r02));
        r02 = r02 + 1;
        goto L3
    L5:
        return null;
    }

    /* JADX INFO: renamed from: n */
    public abstract C0344D mo809n();

    /* JADX INFO: renamed from: o */
    public C0344D mo810o(Context r2, AttributeSet r3) {
        return new C0344D(r2, r3);
    }

    /* JADX INFO: renamed from: p */
    public C0344D mo811p(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C0344D) == false) goto L7;
        return new C0344D((C0344D) r2);
    L7:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        return new C0344D((ViewGroup.MarginLayoutParams) r2);
    L11:
        return new C0344D(r2);
    }

    /* JADX INFO: renamed from: q */
    public final View m812q(int r2) {
        C0234d r02 = this.f667a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m643f(r2);
    }

    /* JADX INFO: renamed from: r */
    public final int m813r() {
        C0234d r02 = this.f667a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.m644g();
    }

    /* JADX INFO: renamed from: t */
    public int mo814t(C0349I r1, C0352L r2) {
        RecyclerView r12 = this.f668b;
        if (r12 == null) goto L5;
        r12.getClass();
    L5:
        return 1;
    }

    /* JADX INFO: renamed from: u */
    public void mo815u(View r7, Rect r8) {
        int[] r02 = RecyclerView.f1536k0;
        C0344D r03 = (C0344D) r7.getLayoutParams();
        Rect r1 = r03.f677a;
        r8.set((r7.getLeft() - r1.left) - ((ViewGroup.MarginLayoutParams) r03).leftMargin, (r7.getTop() - r1.top) - ((ViewGroup.MarginLayoutParams) r03).topMargin, (r7.getRight() + r1.right) + ((ViewGroup.MarginLayoutParams) r03).rightMargin, (r7.getBottom() + r1.bottom) + ((ViewGroup.MarginLayoutParams) r03).bottomMargin);
    }

    /* JADX INFO: renamed from: x */
    public final int m816x() {
        RecyclerView r02 = this.f668b;
        if (r02 == null) goto L7;
        r02.getAdapter();
        return 0;
    L7:
        return 0;
    }

    /* JADX INFO: renamed from: y */
    public final int m817y() {
        RecyclerView r02 = this.f668b;
        Field r1 = AbstractC0080Q.f219a;
        return r02.getLayoutDirection();
    }

    /* JADX INFO: renamed from: z */
    public final int m818z() {
        RecyclerView r02 = this.f668b;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.getPaddingBottom();
    }
}
