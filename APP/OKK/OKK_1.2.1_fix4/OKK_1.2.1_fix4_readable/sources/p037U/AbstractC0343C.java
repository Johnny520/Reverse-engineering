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
        C0342B c0342b = new C0342B(this, 0);
        C0342B c0342b2 = new C0342B(this, 1);
        this.f669c = new C0002c(c0342b);
        this.f670d = new C0002c(c0342b2);
        this.f671e = false;
        this.f672f = true;
    }

    /* JADX INFO: renamed from: D */
    public static int m765D(View view) {
        ((C0344D) view.getLayoutParams()).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: E */
    public static C0381q m766E(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0381q c0381q = new C0381q(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0337a.f656a, i2, i3);
        c0381q.f850b = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0381q.f851c = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0381q.f852d = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0381q.f853e = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0381q;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m767I(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m768f(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m769s(boolean z2, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, i2 - i4);
        if (z2) {
            if (i5 < 0) {
                if (i5 != -1 || (i3 != Integer.MIN_VALUE && (i3 == 0 || i3 != 1073741824))) {
                    i3 = 0;
                    i5 = 0;
                } else {
                    i5 = iMax;
                }
            }
            i3 = 1073741824;
        } else if (i5 >= 0) {
            i3 = 1073741824;
        } else if (i5 != -1) {
            if (i5 == -2) {
                if (i3 == Integer.MIN_VALUE || i3 == 1073741824) {
                    i5 = iMax;
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = iMax;
                    i3 = 0;
                }
            }
        }
        return View.MeasureSpec.makeMeasureSpec(i5, i3);
    }

    /* JADX INFO: renamed from: v */
    public static int m770v(View view) {
        Rect rect = ((C0344D) view.getLayoutParams()).f677a;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: w */
    public static int m771w(View view) {
        Rect rect = ((C0344D) view.getLayoutParams()).f677a;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: A */
    public final int m772A() {
        RecyclerView recyclerView = this.f668b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public final int m773B() {
        RecyclerView recyclerView = this.f668b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final int m774C() {
        RecyclerView recyclerView = this.f668b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: F */
    public int mo775F(C0349I c0349i, C0352L c0352l) {
        RecyclerView recyclerView = this.f668b;
        if (recyclerView != null) {
            recyclerView.getClass();
        }
        return 1;
    }

    /* JADX INFO: renamed from: G */
    public final void m776G(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0344D) view.getLayoutParams()).f677a;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f668b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f668b.f1578i;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: H */
    public abstract boolean mo777H();

    /* JADX INFO: renamed from: J */
    public void mo778J(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo779K(RecyclerView recyclerView);

    /* JADX INFO: renamed from: L */
    public abstract View mo780L(View view, int i2, C0349I c0349i, C0352L c0352l);

    /* JADX INFO: renamed from: M */
    public void mo781M(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f668b;
        C0349I c0349i = recyclerView.f1562a;
        C0352L c0352l = recyclerView.f1561W;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f668b.canScrollVertically(-1) && !this.f668b.canScrollHorizontally(-1) && !this.f668b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        this.f668b.getClass();
    }

    /* JADX INFO: renamed from: N */
    public void mo782N(C0349I c0349i, C0352L c0352l, View view, C0156j c0156j) {
        c0156j.m511h(C0155i.m503a(false, mo800d() ? m765D(view) : 0, 1, mo799c() ? m765D(view) : 0, 1));
    }

    /* JADX INFO: renamed from: O */
    public final void m783O(View view, C0156j c0156j) {
        RecyclerView.m1301u(view);
    }

    /* JADX INFO: renamed from: P */
    public void mo784P(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: Q */
    public Parcelable mo785Q() {
        return null;
    }

    /* JADX INFO: renamed from: R */
    public void mo786R(int i2) {
    }

    /* JADX INFO: renamed from: S */
    public void m787S() {
        m793Y();
    }

    /* JADX INFO: renamed from: T */
    public final void m788T(C0349I c0349i) {
        for (int iM813r = m813r() - 1; iM813r >= 0; iM813r--) {
            if (!RecyclerView.m1301u(m812q(iM813r)).m849o()) {
                View viewM812q = m812q(iM813r);
                m791W(iM813r);
                c0349i.m826f(viewM812q);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m789U(C0349I c0349i) {
        ArrayList arrayList;
        int size = c0349i.f685a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = c0349i.f685a;
            if (i2 < 0) {
                break;
            }
            ((AbstractC0355O) arrayList.get(i2)).getClass();
            AbstractC0355O abstractC0355OM1301u = RecyclerView.m1301u(null);
            if (!abstractC0355OM1301u.m849o()) {
                abstractC0355OM1301u.m848n(false);
                if (abstractC0355OM1301u.m845k()) {
                    this.f668b.removeDetachedView(null, false);
                }
                AbstractC0390z abstractC0390z = this.f668b.f1544F;
                if (abstractC0390z != null) {
                    abstractC0390z.mo946c(abstractC0355OM1301u);
                }
                abstractC0355OM1301u.m848n(true);
                AbstractC0355O abstractC0355OM1301u2 = RecyclerView.m1301u(null);
                abstractC0355OM1301u2.f712c = null;
                abstractC0355OM1301u2.f713d = false;
                abstractC0355OM1301u2.f711b &= -33;
                c0349i.m827g(abstractC0355OM1301u2);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0349i.f686b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f668b.invalidate();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m790V(View view, C0349I c0349i) {
        C0234d c0234d = this.f667a;
        C0386v c0386v = (C0386v) c0234d.f474b;
        int iIndexOfChild = c0386v.f875a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0366b) c0234d.f475c).m942f(iIndexOfChild)) {
                c0234d.m660x(view);
            }
            c0386v.m977a(iIndexOfChild);
        }
        c0349i.m826f(view);
    }

    /* JADX INFO: renamed from: W */
    public final void m791W(int i2) {
        if (m812q(i2) != null) {
            C0234d c0234d = this.f667a;
            int iM648k = c0234d.m648k(i2);
            C0386v c0386v = (C0386v) c0234d.f474b;
            View childAt = c0386v.f875a.getChildAt(iM648k);
            if (childAt == null) {
                return;
            }
            if (((C0366b) c0234d.f475c).m942f(iM648k)) {
                c0234d.m660x(childAt);
            }
            c0386v.m977a(iM648k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo792X(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int iM772A = m772A();
        int iM774C = m774C();
        int iM773B = this.f675i - m773B();
        int iM818z = this.f676j - m818z();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i2 = left - iM772A;
        int iMin = Math.min(0, i2);
        int i3 = top - iM774C;
        int iMin2 = Math.min(0, i3);
        int i4 = iWidth - iM773B;
        int iMax = Math.max(0, i4);
        int iMax2 = Math.max(0, iHeight - iM818z);
        if (m817y() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i2, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i4);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i3, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iM772A2 = m772A();
                int iM774C2 = m774C();
                int iM773B2 = this.f675i - m773B();
                int iM818z2 = this.f676j - m818z();
                Rect rect2 = this.f668b.f1574g;
                mo815u(focusedChild, rect2);
                if (rect2.left - i5 < iM773B2 && rect2.right - i5 > iM772A2 && rect2.top - i6 < iM818z2 && rect2.bottom - i6 > iM774C2) {
                }
            }
        } else if (i5 != 0 || i6 != 0) {
            if (z2) {
                recyclerView.scrollBy(i5, i6);
            } else {
                recyclerView.m1309H(i5, i6, false);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public final void m793Y() {
        RecyclerView recyclerView = this.f668b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m794Z(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f668b = null;
            this.f667a = null;
            this.f675i = 0;
            this.f676j = 0;
        } else {
            this.f668b = recyclerView;
            this.f667a = recyclerView.f1568d;
            this.f675i = recyclerView.getWidth();
            this.f676j = recyclerView.getHeight();
        }
        this.f673g = 1073741824;
        this.f674h = 1073741824;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m795a(View view, int i2, boolean z2) {
        int iM938b;
        AbstractC0355O abstractC0355OM1301u = RecyclerView.m1301u(view);
        if (z2 || abstractC0355OM1301u.m843i()) {
            C0966k c0966k = (C0966k) this.f668b.f1570e.f7b;
            C0364Y c0364yM936a = (C0364Y) c0966k.getOrDefault(abstractC0355OM1301u, null);
            if (c0364yM936a == null) {
                c0364yM936a = C0364Y.m936a();
                c0966k.put(abstractC0355OM1301u, c0364yM936a);
            }
            c0364yM936a.f773a |= 1;
        } else {
            this.f668b.f1570e.m12m(abstractC0355OM1301u);
        }
        C0344D c0344d = (C0344D) view.getLayoutParams();
        if (abstractC0355OM1301u.m850p() || abstractC0355OM1301u.m844j()) {
            if (abstractC0355OM1301u.m844j()) {
                abstractC0355OM1301u.f712c.m830j(abstractC0355OM1301u);
            } else {
                abstractC0355OM1301u.f711b &= -33;
            }
            this.f667a.m640b(view, i2, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f668b) {
            C0234d c0234d = this.f667a;
            int iIndexOfChild = ((C0386v) c0234d.f474b).f875a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                iM938b = -1;
                if (i2 == -1) {
                    i2 = this.f667a.m644g();
                }
                if (iM938b != -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f668b.indexOfChild(view) + this.f668b.m1324p());
                }
                if (iM938b != i2) {
                    AbstractC0343C abstractC0343C = this.f668b.f1580j;
                    View viewM812q = abstractC0343C.m812q(iM938b);
                    if (viewM812q == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM938b + abstractC0343C.f668b.toString());
                    }
                    abstractC0343C.m812q(iM938b);
                    abstractC0343C.f667a.m641d(iM938b);
                    C0344D c0344d2 = (C0344D) viewM812q.getLayoutParams();
                    AbstractC0355O abstractC0355OM1301u2 = RecyclerView.m1301u(viewM812q);
                    if (abstractC0355OM1301u2.m843i()) {
                        C0966k c0966k2 = (C0966k) abstractC0343C.f668b.f1570e.f7b;
                        C0364Y c0364yM936a2 = (C0364Y) c0966k2.getOrDefault(abstractC0355OM1301u2, null);
                        if (c0364yM936a2 == null) {
                            c0364yM936a2 = C0364Y.m936a();
                            c0966k2.put(abstractC0355OM1301u2, c0364yM936a2);
                        }
                        c0364yM936a2.f773a = 1 | c0364yM936a2.f773a;
                    } else {
                        abstractC0343C.f668b.f1570e.m12m(abstractC0355OM1301u2);
                    }
                    abstractC0343C.f667a.m640b(viewM812q, i2, c0344d2, abstractC0355OM1301u2.m843i());
                }
            } else {
                C0366b c0366b = (C0366b) c0234d.f475c;
                if (!c0366b.m940d(iIndexOfChild)) {
                    iM938b = iIndexOfChild - c0366b.m938b(iIndexOfChild);
                }
                if (i2 == -1) {
                }
                if (iM938b != -1) {
                }
            }
        } else {
            this.f667a.m639a(view, i2, false);
            c0344d.f678b = true;
        }
        if (c0344d.f679c) {
            abstractC0355OM1301u.getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m796a0(View view, int i2, int i3, C0344D c0344d) {
        return (!view.isLayoutRequested() && this.f672f && m767I(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) c0344d).width) && m767I(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) c0344d).height)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public void mo797b(String str) {
        RecyclerView recyclerView = this.f668b;
        if (recyclerView != null) {
            recyclerView.m1313d(str);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m798b0(View view, int i2, int i3, C0344D c0344d) {
        return (this.f672f && m767I(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) c0344d).width) && m767I(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) c0344d).height)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo799c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo800d();

    /* JADX INFO: renamed from: e */
    public boolean mo801e(C0344D c0344d) {
        return c0344d != null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo802g(C0352L c0352l);

    /* JADX INFO: renamed from: h */
    public abstract int mo803h(C0352L c0352l);

    /* JADX INFO: renamed from: i */
    public abstract int mo804i(C0352L c0352l);

    /* JADX INFO: renamed from: j */
    public abstract int mo805j(C0352L c0352l);

    /* JADX INFO: renamed from: k */
    public abstract int mo806k(C0352L c0352l);

    /* JADX INFO: renamed from: l */
    public abstract int mo807l(C0352L c0352l);

    /* JADX INFO: renamed from: m */
    public View mo808m(int i2) {
        int iM813r = m813r();
        for (int i3 = 0; i3 < iM813r; i3++) {
            RecyclerView.m1301u(m812q(i3));
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public abstract C0344D mo809n();

    /* JADX INFO: renamed from: o */
    public C0344D mo810o(Context context, AttributeSet attributeSet) {
        return new C0344D(context, attributeSet);
    }

    /* JADX INFO: renamed from: p */
    public C0344D mo811p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0344D ? new C0344D((C0344D) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0344D((ViewGroup.MarginLayoutParams) layoutParams) : new C0344D(layoutParams);
    }

    /* JADX INFO: renamed from: q */
    public final View m812q(int i2) {
        C0234d c0234d = this.f667a;
        if (c0234d != null) {
            return c0234d.m643f(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final int m813r() {
        C0234d c0234d = this.f667a;
        if (c0234d != null) {
            return c0234d.m644g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public int mo814t(C0349I c0349i, C0352L c0352l) {
        RecyclerView recyclerView = this.f668b;
        if (recyclerView != null) {
            recyclerView.getClass();
        }
        return 1;
    }

    /* JADX INFO: renamed from: u */
    public void mo815u(View view, Rect rect) {
        int[] iArr = RecyclerView.f1536k0;
        C0344D c0344d = (C0344D) view.getLayoutParams();
        Rect rect2 = c0344d.f677a;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0344d).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0344d).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0344d).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0344d).bottomMargin);
    }

    /* JADX INFO: renamed from: x */
    public final int m816x() {
        RecyclerView recyclerView = this.f668b;
        if (recyclerView == null) {
            return 0;
        }
        recyclerView.getAdapter();
        return 0;
    }

    /* JADX INFO: renamed from: y */
    public final int m817y() {
        RecyclerView recyclerView = this.f668b;
        Field field = AbstractC0080Q.f219a;
        return recyclerView.getLayoutDirection();
    }

    /* JADX INFO: renamed from: z */
    public final int m818z() {
        RecyclerView recyclerView = this.f668b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }
}
