package androidx.recyclerview.widget;

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
import androidx.collection.C0283;
import androidx.compose.foundation.text.selection.C0920;
import androidx.core.view.AbstractC2270;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p124.C7412;
import p141.AbstractC7535;
import p155.C7606;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2519 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f7579;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f7580;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f7581;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f7582;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f7583;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f7584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C2459 f7585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2491 f7586;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f7587;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f7588;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f7589;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f7590;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public RecyclerView f7591;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2491 f7592;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2495 f7593;

    public AbstractC2519() {
        C2521 c2521 = new C2521(this, 0);
        C2521 c25212 = new C2521(this, 1);
        this.f7592 = new C2491(c2521);
        this.f7586 = new C2491(c25212);
        this.f7589 = false;
        this.f7590 = false;
        this.f7587 = true;
        this.f7588 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static int m4971(View view) {
        return view.getTop() - ((C2518) view.getLayoutParams()).f7576.top;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static C2520 m4972(Context context, AttributeSet attributeSet, int i, int i2) {
        C2520 c2520 = new C2520();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7535.f20422, i, i2);
        c2520.f7597 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c2520.f7596 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c2520.f7595 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c2520.f7594 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c2520;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static int m4973(View view) {
        return ((C2518) view.getLayoutParams()).f7578.getLayoutPosition();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static int m4974(View view) {
        Rect rect = ((C2518) view.getLayoutParams()).f7576;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static int m4975(View view) {
        return view.getRight() + ((C2518) view.getLayoutParams()).f7576.right;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static int m4976(View view) {
        return view.getBottom() + ((C2518) view.getLayoutParams()).f7576.bottom;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static int m4977(View view) {
        Rect rect = ((C2518) view.getLayoutParams()).f7576;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static int m4978(View view) {
        return view.getLeft() - ((C2518) view.getLayoutParams()).f7576.left;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m4979(boolean r4, int r5, int r6, int r7, int r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC2519.m4979(boolean, int, int, int, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static int m4980(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static boolean m4981(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static void m4982(View view, int i, int i2, int i3, int i4) {
        C2518 c2518 = (C2518) view.getLayoutParams();
        Rect rect = c2518.f7576;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c2518).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c2518).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c2518).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c2518).bottomMargin);
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public int mo4590(C2531 c2531, C2525 c2525) {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView == null || recyclerView.f7193 == null || !mo4665()) {
            return 1;
        }
        return this.f7591.f7193.mo4784();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m4983(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C2518) view.getLayoutParams()).f7576;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f7591 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f7591.f7194;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int m4984() {
        RecyclerView recyclerView = this.f7591;
        AbstractC2450 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo4784();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public void mo4985(Rect rect, View view) {
        RecyclerView.m4680(rect, view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract C2518 mo4591();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public View mo4634(int i) {
        int iM4987 = m4987();
        for (int i2 = 0; i2 < iM4987; i2++) {
            View viewM4988 = m4988(i2);
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(viewM4988);
            if (abstractC2484M4679 != null && abstractC2484M4679.getLayoutPosition() == i && !abstractC2484M4679.shouldIgnore() && (this.f7591.f7240.f7616 || !abstractC2484M4679.isRemoved())) {
                return viewM4988;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m4986(C2531 c2531) {
        for (int iM4987 = m4987() - 1; iM4987 >= 0; iM4987--) {
            View viewM4988 = m4988(iM4987);
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(viewM4988);
            if (abstractC2484M4679.shouldIgnore()) {
                if (RecyclerView.f7176) {
                    Log.d("RecyclerView", "ignoring view " + abstractC2484M4679);
                }
            } else if (!abstractC2484M4679.isInvalid() || abstractC2484M4679.isRemoved() || this.f7591.f7193.f7296) {
                m4988(iM4987);
                this.f7593.m4930(iM4987);
                c2531.m5029(viewM4988);
                this.f7591.f7228.m4912(abstractC2484M4679);
            } else {
                if (m4988(iM4987) != null) {
                    this.f7593.m4936(iM4987);
                }
                c2531.m5032(abstractC2484M4679);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public int mo4592(C2525 c2525) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public int mo4593(C2525 c2525) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public int mo4635(C2525 c2525) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public int mo4594(C2531 c2531, C2525 c2525) {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView == null || recyclerView.f7193 == null || !mo4666()) {
            return 1;
        }
        return this.f7591.f7193.mo4784();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int m4987() {
        C2495 c2495 = this.f7593;
        if (c2495 != null) {
            return c2495.m4928();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final View m4988(int i) {
        C2495 c2495 = this.f7593;
        if (c2495 != null) {
            return c2495.m4929(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public C2518 mo4595(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2518 ? new C2518((C2518) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2518((ViewGroup.MarginLayoutParams) layoutParams) : new C2518(layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public C2518 mo4596(Context context, AttributeSet attributeSet) {
        return new C2518(context, attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public int mo4601(int i, C2531 c2531, C2525 c2525) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public void mo4656(int i) {
        if (RecyclerView.f7176) {
            Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final void m4989(View view, C2531 c2531) {
        C2495 c2495 = this.f7593;
        C2454 c2454 = (C2454) c2495.f7470;
        int i = c2495.f7471;
        if (i == 1) {
            C5919.m11250("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            C5919.m11250("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            c2495.f7471 = 1;
            c2495.f7467 = view;
            int iIndexOfChild = c2454.f7303.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C2496) c2495.f7469).m4947(iIndexOfChild)) {
                    c2495.m4937(view);
                }
                c2454.m4823(iIndexOfChild);
            }
            c2495.f7471 = 0;
            c2495.f7467 = null;
            c2531.m5031(view);
        } catch (Throwable th) {
            c2495.f7471 = 0;
            c2495.f7467 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final void m4990(C2531 c2531) {
        ArrayList arrayList;
        int size = c2531.f7634.size();
        int i = size - 1;
        while (true) {
            arrayList = c2531.f7634;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC2484) arrayList.get(i)).itemView;
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
            if (!abstractC2484M4679.shouldIgnore()) {
                abstractC2484M4679.setIsRecyclable(false);
                if (abstractC2484M4679.isTmpDetached()) {
                    this.f7591.removeDetachedView(view, false);
                }
                AbstractC2536 abstractC2536 = this.f7591.f7253;
                if (abstractC2536 != null) {
                    abstractC2536.mo4959(abstractC2484M4679);
                }
                abstractC2484M4679.setIsRecyclable(true);
                AbstractC2484 abstractC2484M46792 = RecyclerView.m4679(view);
                abstractC2484M46792.mScrapContainer = null;
                abstractC2484M46792.mInChangeScrap = false;
                abstractC2484M46792.clearReturnedFromScrapFlag();
                c2531.m5032(abstractC2484M46792);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c2531.f7633;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f7591.invalidate();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final void m4991() {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo4992(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.f7580
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.f7579
            int r4 = r8.getPaddingBottom()
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
            androidx.recyclerview.widget.RecyclerView r3 = r8.f7591
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r3 = r8.f7580
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.f7579
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f7591
            android.graphics.Rect r5 = r5.f7196
            r8.mo4985(r5, r13)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb5
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb5
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb5
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.m4738(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC2519.mo4992(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final boolean m4993(View view, int i, int i2, C2518 c2518) {
        return (this.f7587 && m4981(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c2518).width) && m4981(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c2518).height)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public void mo4657(RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    final boolean m4994(View view, int i, int i2, C2518 c2518) {
        return (!view.isLayoutRequested() && this.f7587 && m4981(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c2518).width) && m4981(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c2518).height)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public boolean mo4658() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public boolean mo4602() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m4995(C2459 c2459) {
        C2459 c24592 = this.f7585;
        if (c24592 != null && c2459 != c24592 && c24592.f7312) {
            c24592.m4852();
        }
        this.f7585 = c2459;
        RecyclerView recyclerView = this.f7591;
        RunnableC2480 runnableC2480 = recyclerView.f7239;
        runnableC2480.f7429.removeCallbacks(runnableC2480);
        runnableC2480.f7431.abortAnimation();
        if (c2459.f7321) {
            Log.w("RecyclerView", "An instance of " + c2459.getClass().getSimpleName() + " was started more than once. Each instance of" + c2459.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c2459.f7315 = recyclerView;
        c2459.f7314 = this;
        int i = c2459.f7316;
        if (i == -1) {
            C5919.m11249("Invalid target position");
            return;
        }
        recyclerView.f7240.f7612 = i;
        c2459.f7312 = true;
        c2459.f7313 = true;
        c2459.f7311 = recyclerView.f7192.mo4634(i);
        c2459.f7315.f7239.m4886();
        c2459.f7321 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public Parcelable mo4659() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final void m4996() {
        for (int iM4987 = m4987() - 1; iM4987 >= 0; iM4987--) {
            this.f7593.m4936(iM4987);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final void m4997(C2531 c2531) {
        for (int iM4987 = m4987() - 1; iM4987 >= 0; iM4987--) {
            if (!RecyclerView.m4679(m4988(iM4987)).shouldIgnore()) {
                View viewM4988 = m4988(iM4987);
                if (m4988(iM4987) != null) {
                    this.f7593.m4936(iM4987);
                }
                c2531.m5031(viewM4988);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public boolean mo4603(int i, Bundle bundle) {
        RecyclerView recyclerView = this.f7591;
        return mo4998(recyclerView.f7230, recyclerView.f7240, i, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[PHI: r8
  0x0062: PHI (r8v8 int) = (r8v5 int), (r8v20 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo4998(androidx.recyclerview.widget.C2531 r8, androidx.recyclerview.widget.C2525 r9, int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC2519.mo4998(androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世, int, android.os.Bundle):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public void mo4604(Rect rect, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        RecyclerView recyclerView = this.f7591;
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        this.f7591.setMeasuredDimension(m4980(i, paddingRight, recyclerView.getMinimumWidth()), m4980(i2, paddingBottom, this.f7591.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void m4999(int i, int i2) {
        this.f7580 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f7582 = mode;
        if (mode == 0 && !RecyclerView.f7171) {
            this.f7580 = 0;
        }
        this.f7579 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f7581 = mode2;
        if (mode2 != 0 || RecyclerView.f7171) {
            return;
        }
        this.f7579 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void m5000(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7591 = null;
            this.f7593 = null;
            this.f7580 = 0;
            this.f7579 = 0;
        } else {
            this.f7591 = recyclerView;
            this.f7593 = recyclerView.f7227;
            this.f7580 = recyclerView.getWidth();
            this.f7579 = recyclerView.getHeight();
        }
        this.f7582 = 1073741824;
        this.f7581 = 1073741824;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void m5001(int i, int i2) {
        int iM4987 = m4987();
        if (iM4987 == 0) {
            this.f7591.m4719(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM4987; i7++) {
            View viewM4988 = m4988(i7);
            Rect rect = this.f7591.f7196;
            mo4985(rect, viewM4988);
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
        this.f7591.f7196.set(i6, i4, i3, i5);
        mo4604(this.f7591.f7196, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract int mo4605(int i, C2531 c2531, C2525 c2525);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final void m5002(RecyclerView recyclerView) {
        m4999(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo4606(C2525 c2525) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public int mo4607(C2525 c2525) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public int mo4663(C2525 c2525) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo4664(String str) {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView != null) {
            recyclerView.m4722(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m5003(View view, int i, boolean z) {
        AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
        if (z || abstractC2484M4679.isRemoved()) {
            C0283 c0283 = (C0283) this.f7591.f7228.f7455;
            C2488 c2488M4903 = (C2488) c0283.get(abstractC2484M4679);
            if (c2488M4903 == null) {
                c2488M4903 = C2488.m4903();
                c0283.put(abstractC2484M4679, c2488M4903);
            }
            c2488M4903.f7448 |= 1;
        } else {
            this.f7591.f7228.m4912(abstractC2484M4679);
        }
        C2518 c2518 = (C2518) view.getLayoutParams();
        if (abstractC2484M4679.wasReturnedFromScrap() || abstractC2484M4679.isScrap()) {
            if (abstractC2484M4679.isScrap()) {
                abstractC2484M4679.unScrap();
            } else {
                abstractC2484M4679.clearReturnedFromScrapFlag();
            }
            this.f7593.m4931(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f7591;
            C2495 c2495 = this.f7593;
            if (parent == recyclerView) {
                C2496 c2496 = (C2496) c2495.f7469;
                int iIndexOfChild = ((C2454) c2495.f7470).f7303.indexOfChild(view);
                int iM4944 = (iIndexOfChild == -1 || c2496.m4942(iIndexOfChild)) ? -1 : iIndexOfChild - c2496.m4944(iIndexOfChild);
                if (i == -1) {
                    i = this.f7593.m4928();
                }
                if (iM4944 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f7591.indexOfChild(view) + this.f7591.m4700());
                }
                if (iM4944 != i) {
                    AbstractC2519 abstractC2519 = this.f7591.f7192;
                    View viewM4988 = abstractC2519.m4988(iM4944);
                    if (viewM4988 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM4944 + abstractC2519.f7591.toString());
                    }
                    abstractC2519.m4988(iM4944);
                    abstractC2519.f7593.m4930(iM4944);
                    C2518 c25182 = (C2518) viewM4988.getLayoutParams();
                    AbstractC2484 abstractC2484M46792 = RecyclerView.m4679(viewM4988);
                    boolean zIsRemoved = abstractC2484M46792.isRemoved();
                    RecyclerView recyclerView2 = abstractC2519.f7591;
                    if (zIsRemoved) {
                        C0283 c02832 = (C0283) recyclerView2.f7228.f7455;
                        C2488 c2488M49032 = (C2488) c02832.get(abstractC2484M46792);
                        if (c2488M49032 == null) {
                            c2488M49032 = C2488.m4903();
                            c02832.put(abstractC2484M46792, c2488M49032);
                        }
                        c2488M49032.f7448 = 1 | c2488M49032.f7448;
                    } else {
                        recyclerView2.f7228.m4912(abstractC2484M46792);
                    }
                    abstractC2519.f7593.m4931(viewM4988, i, c25182, abstractC2484M46792.isRemoved());
                }
            } else {
                c2495.m4932(view, i, false);
                c2518.f7577 = true;
                C2459 c2459 = this.f7585;
                if (c2459 != null && c2459.f7312) {
                    c2459.f7315.getClass();
                    AbstractC2484 abstractC2484M46793 = RecyclerView.m4679(view);
                    if ((abstractC2484M46793 != null ? abstractC2484M46793.getLayoutPosition() : -1) == c2459.f7316) {
                        c2459.f7311 = view;
                        if (RecyclerView.f7176) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c2518.f7575) {
            if (RecyclerView.f7176) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c2518.f7578);
            }
            abstractC2484M4679.itemView.invalidate();
            c2518.f7575 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract boolean mo4665();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public boolean mo4608(C2518 c2518) {
        return c2518 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m5004(Rect rect, View view) {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m4693(view));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public boolean mo4666() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m5005(View view) {
        m5003(view, -1, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public void mo4667(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7591;
        C2531 c2531 = recyclerView.f7230;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7591.canScrollVertically(-1) && !this.f7591.canScrollHorizontally(-1) && !this.f7591.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC2450 abstractC2450 = this.f7591.f7193;
        if (abstractC2450 != null) {
            accessibilityEvent.setItemCount(abstractC2450.mo4784());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public View mo4609(View view, int i, C2531 c2531, C2525 c2525) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public void mo4775(int i) {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView != null) {
            int iM4928 = recyclerView.f7227.m4928();
            for (int i2 = 0; i2 < iM4928; i2++) {
                recyclerView.f7227.m4929(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public abstract void mo4610(C2531 c2531, C2525 c2525);

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public void mo4611(RecyclerView recyclerView, int i, int i2) {
        mo5007(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public void mo4615(C2531 c2531, C2525 c2525, View view, C7606 c7606) {
        c7606.m12812(C7412.m12615(false, mo4665() ? m4973(view) : 0, 1, mo4666() ? m4973(view) : 0, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public void mo4618(C2531 c2531, C2525 c2525, C7606 c7606) {
        if (this.f7591.canScrollVertically(-1) || this.f7591.canScrollHorizontally(-1)) {
            c7606.m12806(8192);
            c7606.m12808(true);
            c7606.m12809(67108864, true);
        }
        if (this.f7591.canScrollVertically(1) || this.f7591.canScrollHorizontally(1)) {
            c7606.m12806(4096);
            c7606.m12808(true);
            c7606.m12809(67108864, true);
        }
        c7606.m12811(C7412.m12616(mo4590(c2531, c2525), mo4594(c2531, c2525), 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final void m5008(View view, C7606 c7606) {
        AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
        if (abstractC2484M4679 == null || abstractC2484M4679.isRemoved()) {
            return;
        }
        C2495 c2495 = this.f7593;
        if (((ArrayList) c2495.f7468).contains(abstractC2484M4679.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.f7591;
        mo4615(recyclerView.f7230, recyclerView.f7240, view, c7606);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public boolean mo4670() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public boolean mo4671() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public void mo5009(View view) {
        C2518 c2518 = (C2518) view.getLayoutParams();
        Rect rectM4693 = this.f7591.m4693(view);
        int i = rectM4693.left + rectM4693.right;
        int i2 = rectM4693.top + rectM4693.bottom;
        int iM4979 = m4979(mo4666(), this.f7580, this.f7582, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2518).leftMargin + ((ViewGroup.MarginLayoutParams) c2518).rightMargin + i, ((ViewGroup.MarginLayoutParams) c2518).width);
        int iM49792 = m4979(mo4665(), this.f7579, this.f7581, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2518).topMargin + ((ViewGroup.MarginLayoutParams) c2518).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) c2518).height);
        if (m4994(view, iM4979, iM49792, c2518)) {
            view.measure(iM4979, iM49792);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public void mo4776(int i) {
        RecyclerView recyclerView = this.f7591;
        if (recyclerView != null) {
            int iM4928 = recyclerView.f7227.m4928();
            for (int i2 = 0; i2 < iM4928; i2++) {
                recyclerView.f7227.m4929(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public void mo4617() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public void mo4773(int i) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public void mo4668(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public void mo5006(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public void mo4774(AbstractC2450 abstractC2450) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public void mo4669(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public void mo4612(C2525 c2525) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public void mo5007(int i) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo4662(int i, C0920 c0920) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public void mo4613(int i, int i2) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public void mo4614(int i, int i2) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public void mo4616(int i, int i2) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo4661(int i, int i2, C2525 c2525, C0920 c0920) {
    }
}
