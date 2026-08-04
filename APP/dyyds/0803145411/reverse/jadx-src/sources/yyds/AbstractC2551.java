package yyds;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲇᲇᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2551 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f12593;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean f12594;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f12595;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean f12596;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C0053 f12597;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C2791 f12598;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f12599;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C1213 f12600;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f12601;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f12602;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f12603;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f12604;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0119 f12605;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f12606;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0119 f12607;

    public AbstractC2551() {
        C1831 c1831 = new C1831(this, 0);
        C1831 c18312 = new C1831(this, 1);
        this.f12605 = new C0119(c1831);
        this.f12607 = new C0119(c18312);
        this.f12606 = false;
        this.f12601 = false;
        this.f12594 = true;
        this.f12596 = true;
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static int m4594(View view) {
        return view.getTop() - ((C2526) view.getLayoutParams()).f12449.top;
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static C2540 m4595(Context context, AttributeSet attributeSet, int i, int i2) {
        C2540 c2540 = new C2540();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1848.f9317, i, i2);
        c2540.f12518 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c2540.f12519 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c2540.f12520 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c2540.f12521 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c2540;
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static int m4596(View view) {
        Rect rect = ((C2526) view.getLayoutParams()).f12449;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public static boolean m4597(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static int m4598(View view) {
        return view.getLeft() - ((C2526) view.getLayoutParams()).f12449.left;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m4599(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 < 0) {
                if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            }
            i2 = 1073741824;
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 != -1) {
            if (i4 == -2) {
                if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                    i4 = iMax;
                    i2 = Integer.MIN_VALUE;
                } else {
                    i4 = iMax;
                    i2 = 0;
                }
            }
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static int m4600(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public static void m4601(View view, int i, int i2, int i3, int i4) {
        C2526 c2526 = (C2526) view.getLayoutParams();
        Rect rect = c2526.f12449;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c2526).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c2526).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c2526).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c2526).bottomMargin);
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static int m4602(View view) {
        return view.getRight() + ((C2526) view.getLayoutParams()).f12449.right;
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public static int m4603(View view) {
        return ((C2526) view.getLayoutParams()).f12448.m787();
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static int m4604(View view) {
        return view.getBottom() + ((C2526) view.getLayoutParams()).f12449.bottom;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public abstract int mo128(C2637 c2637);

    /* JADX INFO: renamed from: ᛱᛵᛳᛳ */
    public abstract int mo129(int i, C2808 c2808, C2637 c2637);

    /* JADX INFO: renamed from: ᛱᛵᲈᛸ, reason: contains not printable characters */
    public final void m4605() {
        C1213 c1213 = this.f12600;
        if (c1213 != null) {
            c1213.requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ */
    public int mo130(C2808 c2808, C2637 c2637) {
        C1213 c1213 = this.f12600;
        if (c1213 == null || c1213.f5537 == null || !mo174()) {
            return 1;
        }
        return this.f12600.f5537.mo531();
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ */
    public void mo214() {
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public abstract void mo171(int i, int i2, C2637 c2637, C2347 c2347);

    /* JADX INFO: renamed from: ᛲᛱᛵᛱ */
    public abstract boolean mo133();

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public abstract int mo172(C2637 c2637);

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ */
    public void mo135(int i, int i2) {
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public void mo173(int i, C2347 c2347) {
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public abstract boolean mo174();

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ */
    public int mo136(C2808 c2808, C2637 c2637) {
        C1213 c1213 = this.f12600;
        if (c1213 == null || c1213.f5537 == null || !mo206()) {
            return 1;
        }
        return this.f12600.f5537.mo531();
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ */
    public void mo216(int i) {
        C1213 c1213 = this.f12600;
        if (c1213 != null) {
            int iM4917 = c1213.f5523.m4917();
            for (int i2 = 0; i2 < iM4917; i2++) {
                c1213.f5523.m4919(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ */
    public void mo141(C2808 c2808, C2637 c2637, View view, C0134 c0134) {
        c0134.f833.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(mo174() ? m4603(view) : 0, 1, mo206() ? m4603(view) : 0, 1, false, false));
    }

    /* JADX INFO: renamed from: ᛳᛵᛶᲀ, reason: contains not printable characters */
    public final void m4606(C1213 c1213) {
        if (c1213 == null) {
            this.f12600 = null;
            this.f12598 = null;
            this.f12593 = 0;
            this.f12599 = 0;
        } else {
            this.f12600 = c1213;
            this.f12598 = c1213.f5523;
            this.f12593 = c1213.getWidth();
            this.f12599 = c1213.getHeight();
        }
        this.f12603 = 1073741824;
        this.f12595 = 1073741824;
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ */
    public abstract View mo142(View view, int i, C2808 c2808, C2637 c2637);

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ */
    public C2526 mo143(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2526 ? new C2526((C2526) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2526((ViewGroup.MarginLayoutParams) layoutParams) : new C2526(layoutParams);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public abstract int mo144(C2637 c2637);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[PHI: r0
  0x0060: PHI (r0v8 int) = (r0v5 int), (r0v14 int) binds: [B:24:0x007c, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛴᛵᛷᛳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo146(int i, Bundle bundle) {
        int iM4616;
        int iM4621;
        float f;
        C2808 c2808 = this.f12600.f5529;
        int iHeight = this.f12599;
        int iWidth = this.f12593;
        Rect rect = new Rect();
        if (this.f12600.getMatrix().isIdentity() && this.f12600.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i == 4096) {
            iM4616 = this.f12600.canScrollVertically(1) ? (iHeight - m4616()) - m4620() : 0;
            if (this.f12600.canScrollHorizontally(1)) {
                iM4621 = (iWidth - m4621()) - m4615();
            }
        } else if (i != 8192) {
            iM4616 = 0;
            iM4621 = 0;
        } else {
            iM4616 = this.f12600.canScrollVertically(-1) ? -((iHeight - m4616()) - m4620()) : 0;
            iM4621 = this.f12600.canScrollHorizontally(-1) ? -((iWidth - m4621()) - m4615()) : 0;
        }
        if (iM4616 != 0 || iM4621 != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (C1213.f5511) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    iM4621 = (int) (iM4621 * f);
                    iM4616 = (int) (iM4616 * f);
                }
                this.f12600.m2434(iM4621, iM4616, null, Integer.MIN_VALUE, true);
                return true;
            }
            C1213 c1213 = this.f12600;
            AbstractC0359 abstractC0359 = c1213.f5537;
            if (abstractC0359 != null) {
                if (i == 4096) {
                    c1213.m2438(abstractC0359.mo531() - 1);
                    return true;
                }
                if (i != 8192) {
                    return true;
                }
                c1213.m2438(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ */
    public void mo181(AccessibilityEvent accessibilityEvent) {
        C1213 c1213 = this.f12600;
        C2808 c2808 = c1213.f5529;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!c1213.canScrollVertically(1) && !this.f12600.canScrollVertically(-1) && !this.f12600.canScrollHorizontally(-1) && !this.f12600.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC0359 abstractC0359 = this.f12600.f5537;
        if (abstractC0359 != null) {
            accessibilityEvent.setItemCount(abstractC0359.mo531());
        }
    }

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ */
    public void mo147(int i, int i2) {
    }

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ */
    public void mo149() {
    }

    /* JADX INFO: renamed from: ᛵᛲᛶᲁ, reason: contains not printable characters */
    public final void m4607(C2808 c2808) {
        for (int iM4613 = m4613() - 1; iM4613 >= 0; iM4613--) {
            if (!C1213.m2412(m4614(iM4613)).m785()) {
                View viewM4614 = m4614(iM4613);
                m4611(iM4613);
                c2808.m4927(viewM4614);
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛵᛷᲀ */
    public abstract void mo183(int i);

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ */
    public abstract C2526 mo150();

    /* JADX INFO: renamed from: ᛵᛸᛵᛶ, reason: contains not printable characters */
    public final void m4608(C2808 c2808) {
        ArrayList arrayList;
        int size = c2808.f13689.size();
        int i = size - 1;
        while (true) {
            arrayList = c2808.f13689;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC0185) arrayList.get(i)).f1093;
            AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
            if (!abstractC0185M2412.m785()) {
                abstractC0185M2412.m777(false);
                if (abstractC0185M2412.m781()) {
                    this.f12600.removeDetachedView(view, false);
                }
                AbstractC2411 abstractC2411 = this.f12600.f5532;
                if (abstractC2411 != null) {
                    abstractC2411.mo4467(abstractC0185M2412);
                }
                abstractC0185M2412.m777(true);
                AbstractC0185 abstractC0185M24122 = C1213.m2412(view);
                abstractC0185M24122.f1090 = null;
                abstractC0185M24122.f1088 = false;
                abstractC0185M24122.f1091 &= -33;
                c2808.m4929(abstractC0185M24122);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c2808.f13690;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f12600.invalidate();
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4609(View view, int i, boolean z) {
        AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
        if (z || abstractC0185M2412.m774()) {
            C0988 c0988 = (C0988) this.f12600.f5528.f812;
            C2229 c2229M4232 = (C2229) c0988.get(abstractC0185M2412);
            if (c2229M4232 == null) {
                c2229M4232 = C2229.m4232();
                c0988.put(abstractC0185M2412, c2229M4232);
            }
            c2229M4232.f11025 |= 1;
        } else {
            this.f12600.f5528.m542(abstractC0185M2412);
        }
        C2526 c2526 = (C2526) view.getLayoutParams();
        if (abstractC0185M2412.m779() || abstractC0185M2412.m783()) {
            if (abstractC0185M2412.m783()) {
                abstractC0185M2412.f1090.m4935(abstractC0185M2412);
            } else {
                abstractC0185M2412.f1091 &= -33;
            }
            this.f12598.m4915(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            C1213 c1213 = this.f12600;
            C2791 c2791 = this.f12598;
            if (parent == c1213) {
                C1641 c1641 = (C1641) c2791.f13645;
                int iIndexOfChild = ((C2378) c2791.f13650).f11724.indexOfChild(view);
                int iM3351 = (iIndexOfChild == -1 || c1641.m3355(iIndexOfChild)) ? -1 : iIndexOfChild - c1641.m3351(iIndexOfChild);
                if (i == -1) {
                    i = this.f12598.m4917();
                }
                if (iM3351 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f12600.indexOfChild(view) + this.f12600.m2454());
                }
                if (iM3351 != i) {
                    AbstractC2551 abstractC2551 = this.f12600.f5583;
                    View viewM4614 = abstractC2551.m4614(iM3351);
                    if (viewM4614 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM3351 + abstractC2551.f12600.toString());
                    }
                    abstractC2551.m4614(iM3351);
                    abstractC2551.f12598.m4920(iM3351);
                    C2526 c25262 = (C2526) viewM4614.getLayoutParams();
                    AbstractC0185 abstractC0185M24122 = C1213.m2412(viewM4614);
                    boolean zM774 = abstractC0185M24122.m774();
                    C1213 c12132 = abstractC2551.f12600;
                    if (zM774) {
                        C0988 c09882 = (C0988) c12132.f5528.f812;
                        C2229 c2229M42322 = (C2229) c09882.get(abstractC0185M24122);
                        if (c2229M42322 == null) {
                            c2229M42322 = C2229.m4232();
                            c09882.put(abstractC0185M24122, c2229M42322);
                        }
                        c2229M42322.f11025 = 1 | c2229M42322.f11025;
                    } else {
                        c12132.f5528.m542(abstractC0185M24122);
                    }
                    abstractC2551.f12598.m4915(viewM4614, i, c25262, abstractC0185M24122.m774());
                }
            } else {
                c2791.m4912(view, i, false);
                c2526.f12450 = true;
                C0053 c0053 = this.f12597;
                if (c0053 != null && c0053.f556) {
                    c0053.f559.getClass();
                    AbstractC0185 abstractC0185M24123 = C1213.m2412(view);
                    if ((abstractC0185M24123 != null ? abstractC0185M24123.m787() : -1) == c0053.f557) {
                        c0053.f566 = view;
                        if (C1213.f5512) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c2526.f12451) {
            if (C1213.f5512) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c2526.f12448);
            }
            abstractC0185M2412.f1093.invalidate();
            c2526.f12451 = false;
        }
    }

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ */
    public void mo152(C2808 c2808, C2637 c2637, C0134 c0134) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0134.f833;
        if (this.f12600.canScrollVertically(-1) || this.f12600.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
            c0134.m585();
        }
        if (this.f12600.canScrollVertically(1) || this.f12600.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
            c0134.m585();
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo130(c2808, c2637), mo136(c2808, c2637), false, 0));
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ */
    public View mo187(int i) {
        int iM4613 = m4613();
        for (int i2 = 0; i2 < iM4613; i2++) {
            View viewM4614 = m4614(i2);
            AbstractC0185 abstractC0185M2412 = C1213.m2412(viewM4614);
            if (abstractC0185M2412 != null && abstractC0185M2412.m787() == i && !abstractC0185M2412.m785() && (this.f12600.f5568.f12977 || !abstractC0185M2412.m774())) {
                return viewM4614;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ */
    public void mo227(int i) {
        C1213 c1213 = this.f12600;
        if (c1213 != null) {
            int iM4917 = c1213.f5523.m4917();
            for (int i2 = 0; i2 < iM4917; i2++) {
                c1213.f5523.m4919(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public final void m4610(View view, C0134 c0134) {
        AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
        if (abstractC0185M2412 == null || abstractC0185M2412.m774()) {
            return;
        }
        C2791 c2791 = this.f12598;
        if (((ArrayList) c2791.f13647).contains(abstractC0185M2412.f1093)) {
            return;
        }
        C1213 c1213 = this.f12600;
        mo141(c1213.f5529, c1213.f5568, view, c0134);
    }

    /* JADX INFO: renamed from: ᛶᛵᛸᛳ */
    public abstract void mo189(C1213 c1213, int i);

    /* JADX INFO: renamed from: ᛶᛵᲁᲈ, reason: contains not printable characters */
    public final void m4611(int i) {
        if (m4614(i) != null) {
            C2791 c2791 = this.f12598;
            C2378 c2378 = (C2378) c2791.f13650;
            int i2 = c2791.f13648;
            if (i2 == 1) {
                C0188.m800("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                C0188.m800("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int iM4918 = c2791.m4918(i);
                View childAt = c2378.f11724.getChildAt(iM4918);
                if (childAt == null) {
                    c2791.f13648 = 0;
                    c2791.f13649 = null;
                    return;
                }
                c2791.f13648 = 1;
                c2791.f13649 = childAt;
                if (((C1641) c2791.f13645).m3352(iM4918)) {
                    c2791.m4914(childAt);
                }
                c2378.m4416(iM4918);
                c2791.f13648 = 0;
                c2791.f13649 = null;
            } catch (Throwable th) {
                c2791.f13648 = 0;
                c2791.f13649 = null;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛶᛲ, reason: contains not printable characters */
    public final void m4612(C0053 c0053) {
        C0053 c00532 = this.f12597;
        if (c00532 != null && c0053 != c00532 && c00532.f556) {
            c00532.m412();
        }
        this.f12597 = c0053;
        C1213 c1213 = this.f12600;
        RunnableC1177 runnableC1177 = c1213.f5540;
        runnableC1177.f5406.removeCallbacks(runnableC1177);
        runnableC1177.f5407.abortAnimation();
        if (c0053.f553) {
            Log.w("RecyclerView", "An instance of " + c0053.getClass().getSimpleName() + " was started more than once. Each instance of" + c0053.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0053.f559 = c1213;
        c0053.f564 = this;
        int i = c0053.f557;
        if (i == -1) {
            C0188.m798("Invalid target position");
            return;
        }
        c1213.f5568.f12975 = i;
        c0053.f556 = true;
        c0053.f567 = true;
        c0053.f566 = c1213.f5583.mo187(i);
        c0053.f559.f5540.m2372();
        c0053.f553 = true;
    }

    /* JADX INFO: renamed from: ᛶᛸᛱᲁ */
    public void mo153(Rect rect, int i, int i2) {
        int iM4615 = m4615() + m4621() + rect.width();
        int iM4620 = m4620() + m4616() + rect.height();
        C1213 c1213 = this.f12600;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        this.f12600.setMeasuredDimension(m4600(i, iM4615, c1213.getMinimumWidth()), m4600(i2, iM4620, this.f12600.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final int m4613() {
        C2791 c2791 = this.f12598;
        if (c2791 != null) {
            return c2791.m4917();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ */
    public abstract boolean mo190();

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final View m4614(int i) {
        C2791 c2791 = this.f12598;
        if (c2791 != null) {
            return c2791.m4919(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public abstract int mo154(C2637 c2637);

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public abstract int mo155(C2637 c2637);

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final int m4615() {
        C1213 c1213 = this.f12600;
        if (c1213 != null) {
            return c1213.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final int m4616() {
        C1213 c1213 = this.f12600;
        if (c1213 != null) {
            return c1213.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛷᲈᛳᛲ */
    public abstract void mo157(C2808 c2808, C2637 c2637);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public abstract int mo193(C2637 c2637);

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public final void m4617(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C2526) view.getLayoutParams()).f12449;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f12600 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f12600.f5518;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final int m4618() {
        C1213 c1213 = this.f12600;
        AbstractC0359 adapter = c1213 != null ? c1213.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo531();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛸᲀᛷᛲ */
    public abstract void mo194(Parcelable parcelable);

    /* JADX INFO: renamed from: ᛸᲇᛱᲇ */
    public abstract int mo159(int i, C2808 c2808, C2637 c2637);

    /* JADX INFO: renamed from: ᛸᲇᛴᲀ, reason: contains not printable characters */
    public final void m4619(int i, int i2) {
        this.f12593 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f12603 = mode;
        if (mode == 0 && !C1213.f5515) {
            this.f12593 = 0;
        }
        this.f12599 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f12595 = mode2;
        if (mode2 != 0 || C1213.f5515) {
            return;
        }
        this.f12599 = 0;
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final int m4620() {
        C1213 c1213 = this.f12600;
        if (c1213 != null) {
            return c1213.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public C2526 mo160(Context context, AttributeSet attributeSet) {
        return new C2526(context, attributeSet);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public abstract void mo196(String str);

    /* JADX INFO: renamed from: ᲀᛳᛷᛷ */
    public void mo231(int i) {
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public final int m4621() {
        C1213 c1213 = this.f12600;
        if (c1213 != null) {
            return c1213.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᲀᛸᲈᲁ */
    public abstract Parcelable mo198();

    /* JADX INFO: renamed from: ᲀᲇᛱᛲ, reason: contains not printable characters */
    public final boolean m4622(View view, int i, int i2, C2526 c2526) {
        return (!view.isLayoutRequested() && this.f12594 && m4597(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c2526).width) && m4597(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c2526).height)) ? false : true;
    }

    /* JADX INFO: renamed from: ᲀᲇᛶᲈ, reason: contains not printable characters */
    public final boolean m4623(View view, int i, int i2, C2526 c2526) {
        return (this.f12594 && m4597(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c2526).width) && m4597(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c2526).height)) ? false : true;
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ */
    public abstract void mo199(C1213 c1213);

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ */
    public abstract boolean mo200();

    /* JADX INFO: renamed from: ᲁᲀᛱᛴ, reason: contains not printable characters */
    public final void m4624(C1213 c1213) {
        m4619(View.MeasureSpec.makeMeasureSpec(c1213.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c1213.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: ᲁᲁᛵ, reason: contains not printable characters */
    public final void m4625(int i, int i2) {
        int iM4613 = m4613();
        if (iM4613 == 0) {
            this.f12600.m2466(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM4613; i7++) {
            View viewM4614 = m4614(i7);
            Rect rect = this.f12600.f5560;
            C1213.m2414(rect, viewM4614);
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
        this.f12600.f5560.set(i6, i4, i3, i5);
        mo153(this.f12600.f5560, i, i2);
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m4626(C2808 c2808) {
        for (int iM4613 = m4613() - 1; iM4613 >= 0; iM4613--) {
            View viewM4614 = m4614(iM4613);
            AbstractC0185 abstractC0185M2412 = C1213.m2412(viewM4614);
            if (abstractC0185M2412.m785()) {
                if (C1213.f5512) {
                    Log.d("RecyclerView", "ignoring view " + abstractC0185M2412);
                }
            } else if (!abstractC0185M2412.m780() || abstractC0185M2412.m774()) {
                m4614(iM4613);
                this.f12598.m4920(iM4613);
                c2808.m4936(viewM4614);
                this.f12600.f5528.m542(abstractC0185M2412);
            } else {
                this.f12600.f5537.getClass();
                m4611(iM4613);
                c2808.m4929(abstractC0185M2412);
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᛶᲀᲇ, reason: contains not printable characters */
    public final void m4627(View view, C2808 c2808) {
        C2791 c2791 = this.f12598;
        C2378 c2378 = (C2378) c2791.f13650;
        int i = c2791.f13648;
        if (i == 1) {
            C0188.m800("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            C0188.m800("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            c2791.f13648 = 1;
            c2791.f13649 = view;
            int iIndexOfChild = c2378.f11724.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C1641) c2791.f13645).m3352(iIndexOfChild)) {
                    c2791.m4914(view);
                }
                c2378.m4416(iIndexOfChild);
            }
            c2791.f13648 = 0;
            c2791.f13649 = null;
            c2808.m4927(view);
        } catch (Throwable th) {
            c2791.f13648 = 0;
            c2791.f13649 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public boolean mo163(C2526 c2526) {
        return true;
    }

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ */
    public void mo164(int i, int i2) {
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public abstract boolean mo206();

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX INFO: renamed from: ᲈᛲᛳᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4628(C1213 c1213, View view, Rect rect, boolean z, boolean z2) {
        int iM4621 = m4621();
        int iM4616 = m4616();
        int iM4615 = this.f12593 - m4615();
        int iM4620 = this.f12599 - m4620();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iM4621;
        int iMin = Math.min(0, i);
        int i2 = top - iM4616;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iM4615;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iM4620);
        if (this.f12600.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = c1213.getFocusedChild();
            if (focusedChild != null) {
                int iM46212 = m4621();
                int iM46162 = m4616();
                int iM46152 = this.f12593 - m4615();
                int iM46202 = this.f12599 - m4620();
                Rect rect2 = this.f12600.f5560;
                C1213.m2414(rect2, focusedChild);
                if (rect2.left - i4 < iM46152 && rect2.right - i4 > iM46212 && rect2.top - i5 < iM46202 && rect2.bottom - i5 > iM46162) {
                }
            }
        } else if (i4 != 0 || i5 != 0) {
            if (z) {
                c1213.scrollBy(i4, i5);
                return true;
            }
            c1213.m2434(i4, i5, null, Integer.MIN_VALUE, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲈᛳ */
    public abstract void mo0(C2637 c2637);

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ */
    public void mo165(int i, int i2) {
    }

    /* JADX INFO: renamed from: ᲈᲁᛵᛶ */
    public boolean mo211() {
        return false;
    }
}
