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
import androidx.collection.C1130;
import androidx.compose.foundation.text.selection.C1758;
import androidx.core.view.AbstractC3103;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p140.C8242;
import p157.AbstractC8365;
import p171.C8436;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3352 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f7925;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f7926;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f7927;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f7928;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f7929;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f7930;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C3292 f7931;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3324 f7932;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f7933;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f7934;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f7935;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f7936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public RecyclerView f7937;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3324 f7938;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3328 f7939;

    public AbstractC3352() {
        C3354 c3354 = new C3354(this, 0);
        C3354 c33542 = new C3354(this, 1);
        this.f7938 = new C3324(c3354);
        this.f7932 = new C3324(c33542);
        this.f7935 = false;
        this.f7936 = false;
        this.f7933 = true;
        this.f7934 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static int m5541(View view) {
        return view.getTop() - ((C3351) view.getLayoutParams()).f7922.top;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static C3353 m5542(Context context, AttributeSet attributeSet, int i, int i2) {
        C3353 c3353 = new C3353();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8365.f20762, i, i2);
        c3353.f7943 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c3353.f7942 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c3353.f7941 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c3353.f7940 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c3353;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static int m5543(View view) {
        return ((C3351) view.getLayoutParams()).f7924.getLayoutPosition();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static int m5544(View view) {
        Rect rect = ((C3351) view.getLayoutParams()).f7922;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static int m5545(View view) {
        return view.getRight() + ((C3351) view.getLayoutParams()).f7922.right;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static int m5546(View view) {
        return view.getBottom() + ((C3351) view.getLayoutParams()).f7922.bottom;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static int m5547(View view) {
        Rect rect = ((C3351) view.getLayoutParams()).f7922;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static int m5548(View view) {
        return view.getLeft() - ((C3351) view.getLayoutParams()).f7922.left;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m5549(boolean z, int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static int m5550(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static boolean m5551(int i, int i2, int i3) {
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
    public static void m5552(View view, int i, int i2, int i3, int i4) {
        C3351 c3351 = (C3351) view.getLayoutParams();
        Rect rect = c3351.f7922;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c3351).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c3351).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c3351).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c3351).bottomMargin);
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public int mo5160(C3364 c3364, C3358 c3358) {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView == null || recyclerView.f7539 == null || !mo5235()) {
            return 1;
        }
        return this.f7937.f7539.mo5354();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m5553(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C3351) view.getLayoutParams()).f7922;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f7937 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f7937.f7540;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final int m5554() {
        RecyclerView recyclerView = this.f7937;
        AbstractC3283 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo5354();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public void mo5555(Rect rect, View view) {
        RecyclerView.m5250(rect, view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract C3351 mo5161();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public View mo5204(int i) {
        int iM5557 = m5557();
        for (int i2 = 0; i2 < iM5557; i2++) {
            View viewM5558 = m5558(i2);
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(viewM5558);
            if (abstractC3317M5249 != null && abstractC3317M5249.getLayoutPosition() == i && !abstractC3317M5249.shouldIgnore() && (this.f7937.f7586.f7962 || !abstractC3317M5249.isRemoved())) {
                return viewM5558;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m5556(C3364 c3364) {
        for (int iM5557 = m5557() - 1; iM5557 >= 0; iM5557--) {
            View viewM5558 = m5558(iM5557);
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(viewM5558);
            if (abstractC3317M5249.shouldIgnore()) {
                if (RecyclerView.f7522) {
                    Log.d("RecyclerView", "ignoring view " + abstractC3317M5249);
                }
            } else if (!abstractC3317M5249.isInvalid() || abstractC3317M5249.isRemoved() || this.f7937.f7539.f7642) {
                m5558(iM5557);
                this.f7939.m5500(iM5557);
                c3364.m5599(viewM5558);
                this.f7937.f7574.m5482(abstractC3317M5249);
            } else {
                if (m5558(iM5557) != null) {
                    this.f7939.m5506(iM5557);
                }
                c3364.m5602(abstractC3317M5249);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public int mo5162(C3358 c3358) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public int mo5163(C3358 c3358) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public int mo5205(C3358 c3358) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public int mo5164(C3364 c3364, C3358 c3358) {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView == null || recyclerView.f7539 == null || !mo5236()) {
            return 1;
        }
        return this.f7937.f7539.mo5354();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int m5557() {
        C3328 c3328 = this.f7939;
        if (c3328 != null) {
            return c3328.m5498();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final View m5558(int i) {
        C3328 c3328 = this.f7939;
        if (c3328 != null) {
            return c3328.m5499(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public C3351 mo5165(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3351 ? new C3351((C3351) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3351((ViewGroup.MarginLayoutParams) layoutParams) : new C3351(layoutParams);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public C3351 mo5166(Context context, AttributeSet attributeSet) {
        return new C3351(context, attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public int mo5171(int i, C3364 c3364, C3358 c3358) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public void mo5226(int i) {
        if (RecyclerView.f7522) {
            Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final void m5559(View view, C3364 c3364) {
        C3328 c3328 = this.f7939;
        C3287 c3287 = (C3287) c3328.f7816;
        int i = c3328.f7817;
        if (i == 1) {
            C6755.m11870("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            C6755.m11870("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            c3328.f7817 = 1;
            c3328.f7813 = view;
            int iIndexOfChild = c3287.f7649.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((C3329) c3328.f7815).m5517(iIndexOfChild)) {
                    c3328.m5507(view);
                }
                c3287.m5393(iIndexOfChild);
            }
            c3328.f7817 = 0;
            c3328.f7813 = null;
            c3364.m5601(view);
        } catch (Throwable th) {
            c3328.f7817 = 0;
            c3328.f7813 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final void m5560(C3364 c3364) {
        ArrayList arrayList;
        int size = c3364.f7980.size();
        int i = size - 1;
        while (true) {
            arrayList = c3364.f7980;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC3317) arrayList.get(i)).itemView;
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
            if (!abstractC3317M5249.shouldIgnore()) {
                abstractC3317M5249.setIsRecyclable(false);
                if (abstractC3317M5249.isTmpDetached()) {
                    this.f7937.removeDetachedView(view, false);
                }
                AbstractC3369 abstractC3369 = this.f7937.f7599;
                if (abstractC3369 != null) {
                    abstractC3369.mo5529(abstractC3317M5249);
                }
                abstractC3317M5249.setIsRecyclable(true);
                AbstractC3317 abstractC3317M52492 = RecyclerView.m5249(view);
                abstractC3317M52492.mScrapContainer = null;
                abstractC3317M52492.mInChangeScrap = false;
                abstractC3317M52492.clearReturnedFromScrapFlag();
                c3364.m5602(abstractC3317M52492);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c3364.f7979;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f7937.invalidate();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final void m5561() {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo5562(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.f7926 - getPaddingRight();
        int paddingBottom = this.f7925 - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top2 = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top2;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top2 - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - paddingRight;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - paddingBottom);
        if (this.f7937.getLayoutDirection() != 1) {
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
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int paddingRight2 = this.f7926 - getPaddingRight();
                int paddingBottom2 = this.f7925 - getPaddingBottom();
                Rect rect2 = this.f7937.f7542;
                mo5555(rect2, focusedChild);
                if (rect2.left - i4 < paddingRight2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < paddingBottom2 && rect2.bottom - i5 > paddingTop2) {
                }
            }
        } else if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.m5308(i4, i5, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final boolean m5563(View view, int i, int i2, C3351 c3351) {
        return (this.f7933 && m5551(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c3351).width) && m5551(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c3351).height)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public void mo5227(RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    final boolean m5564(View view, int i, int i2, C3351 c3351) {
        return (!view.isLayoutRequested() && this.f7933 && m5551(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c3351).width) && m5551(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c3351).height)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public boolean mo5228() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public boolean mo5172() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m5565(C3292 c3292) {
        C3292 c32922 = this.f7931;
        if (c32922 != null && c3292 != c32922 && c32922.f7658) {
            c32922.m5422();
        }
        this.f7931 = c3292;
        RecyclerView recyclerView = this.f7937;
        RunnableC3313 runnableC3313 = recyclerView.f7585;
        runnableC3313.f7775.removeCallbacks(runnableC3313);
        runnableC3313.f7777.abortAnimation();
        if (c3292.f7667) {
            Log.w("RecyclerView", "An instance of " + c3292.getClass().getSimpleName() + " was started more than once. Each instance of" + c3292.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c3292.f7661 = recyclerView;
        c3292.f7660 = this;
        int i = c3292.f7662;
        if (i == -1) {
            C6755.m11869("Invalid target position");
            return;
        }
        recyclerView.f7586.f7958 = i;
        c3292.f7658 = true;
        c3292.f7659 = true;
        c3292.f7657 = recyclerView.f7538.mo5204(i);
        c3292.f7661.f7585.m5456();
        c3292.f7667 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public Parcelable mo5229() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final void m5566() {
        for (int iM5557 = m5557() - 1; iM5557 >= 0; iM5557--) {
            this.f7939.m5506(iM5557);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final void m5567(C3364 c3364) {
        for (int iM5557 = m5557() - 1; iM5557 >= 0; iM5557--) {
            if (!RecyclerView.m5249(m5558(iM5557)).shouldIgnore()) {
                View viewM5558 = m5558(iM5557);
                if (m5558(iM5557) != null) {
                    this.f7939.m5506(iM5557);
                }
                c3364.m5601(viewM5558);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public boolean mo5173(int i, Bundle bundle) {
        RecyclerView recyclerView = this.f7937;
        return mo5568(recyclerView.f7576, recyclerView.f7586, i, bundle);
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
    */
    public boolean mo5568(C3364 c3364, C3358 c3358, int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
        if (this.f7937 != null) {
            int iHeight = this.f7925;
            int iWidth = this.f7926;
            Rect rect = new Rect();
            if (this.f7937.getMatrix().isIdentity() && this.f7937.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i != 4096) {
                if (i != 8192) {
                    paddingTop = 0;
                    paddingLeft = 0;
                } else {
                    paddingTop = this.f7937.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
                    paddingLeft = this.f7937.canScrollHorizontally(-1) ? -((iWidth - getPaddingLeft()) - getPaddingRight()) : 0;
                }
                if (paddingTop == 0 || paddingLeft != 0) {
                    if (bundle == null) {
                        f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                        if (f < 0.0f) {
                            if (RecyclerView.f7521) {
                                throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                            }
                        }
                    } else {
                        f = 1.0f;
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
                        if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                            paddingLeft = (int) (paddingLeft * f);
                            paddingTop = (int) (paddingTop * f);
                        }
                        this.f7937.m5308(paddingLeft, paddingTop, true);
                        return true;
                    }
                    RecyclerView recyclerView = this.f7937;
                    AbstractC3283 abstractC3283 = recyclerView.f7539;
                    if (abstractC3283 != null) {
                        if (i == 4096) {
                            recyclerView.m5304(abstractC3283.mo5354() - 1);
                            return true;
                        }
                        if (i != 8192) {
                            return true;
                        }
                        recyclerView.m5304(0);
                        return true;
                    }
                }
            } else {
                paddingTop = this.f7937.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f7937.canScrollHorizontally(1)) {
                    paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
                }
                if (paddingTop == 0) {
                    if (bundle == null) {
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public void mo5174(Rect rect, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        RecyclerView recyclerView = this.f7937;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        this.f7937.setMeasuredDimension(m5550(i, paddingRight, recyclerView.getMinimumWidth()), m5550(i2, paddingBottom, this.f7937.getMinimumHeight()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void m5569(int i, int i2) {
        this.f7926 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f7928 = mode;
        if (mode == 0 && !RecyclerView.f7517) {
            this.f7926 = 0;
        }
        this.f7925 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f7927 = mode2;
        if (mode2 != 0 || RecyclerView.f7517) {
            return;
        }
        this.f7925 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void m5570(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7937 = null;
            this.f7939 = null;
            this.f7926 = 0;
            this.f7925 = 0;
        } else {
            this.f7937 = recyclerView;
            this.f7939 = recyclerView.f7573;
            this.f7926 = recyclerView.getWidth();
            this.f7925 = recyclerView.getHeight();
        }
        this.f7928 = 1073741824;
        this.f7927 = 1073741824;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void m5571(int i, int i2) {
        int iM5557 = m5557();
        if (iM5557 == 0) {
            this.f7937.m5289(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM5557; i7++) {
            View viewM5558 = m5558(i7);
            Rect rect = this.f7937.f7542;
            mo5555(rect, viewM5558);
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
        this.f7937.f7542.set(i6, i4, i3, i5);
        mo5174(this.f7937.f7542, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract int mo5175(int i, C3364 c3364, C3358 c3358);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final void m5572(RecyclerView recyclerView) {
        m5569(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo5176(C3358 c3358) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public int mo5177(C3358 c3358) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public int mo5233(C3358 c3358) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo5234(String str) {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView != null) {
            recyclerView.m5292(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m5573(View view, int i, boolean z) {
        AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
        if (z || abstractC3317M5249.isRemoved()) {
            C1130 c1130 = (C1130) this.f7937.f7574.f7801;
            C3321 c3321M5473 = (C3321) c1130.get(abstractC3317M5249);
            if (c3321M5473 == null) {
                c3321M5473 = C3321.m5473();
                c1130.put(abstractC3317M5249, c3321M5473);
            }
            c3321M5473.f7794 |= 1;
        } else {
            this.f7937.f7574.m5482(abstractC3317M5249);
        }
        C3351 c3351 = (C3351) view.getLayoutParams();
        if (abstractC3317M5249.wasReturnedFromScrap() || abstractC3317M5249.isScrap()) {
            if (abstractC3317M5249.isScrap()) {
                abstractC3317M5249.unScrap();
            } else {
                abstractC3317M5249.clearReturnedFromScrapFlag();
            }
            this.f7939.m5501(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f7937;
            C3328 c3328 = this.f7939;
            if (parent == recyclerView) {
                C3329 c3329 = (C3329) c3328.f7815;
                int iIndexOfChild = ((C3287) c3328.f7816).f7649.indexOfChild(view);
                int iM5514 = (iIndexOfChild == -1 || c3329.m5512(iIndexOfChild)) ? -1 : iIndexOfChild - c3329.m5514(iIndexOfChild);
                if (i == -1) {
                    i = this.f7939.m5498();
                }
                if (iM5514 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f7937.indexOfChild(view) + this.f7937.m5270());
                }
                if (iM5514 != i) {
                    AbstractC3352 abstractC3352 = this.f7937.f7538;
                    View viewM5558 = abstractC3352.m5558(iM5514);
                    if (viewM5558 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM5514 + abstractC3352.f7937.toString());
                    }
                    abstractC3352.m5558(iM5514);
                    abstractC3352.f7939.m5500(iM5514);
                    C3351 c33512 = (C3351) viewM5558.getLayoutParams();
                    AbstractC3317 abstractC3317M52492 = RecyclerView.m5249(viewM5558);
                    boolean zIsRemoved = abstractC3317M52492.isRemoved();
                    RecyclerView recyclerView2 = abstractC3352.f7937;
                    if (zIsRemoved) {
                        C1130 c11302 = (C1130) recyclerView2.f7574.f7801;
                        C3321 c3321M54732 = (C3321) c11302.get(abstractC3317M52492);
                        if (c3321M54732 == null) {
                            c3321M54732 = C3321.m5473();
                            c11302.put(abstractC3317M52492, c3321M54732);
                        }
                        c3321M54732.f7794 = 1 | c3321M54732.f7794;
                    } else {
                        recyclerView2.f7574.m5482(abstractC3317M52492);
                    }
                    abstractC3352.f7939.m5501(viewM5558, i, c33512, abstractC3317M52492.isRemoved());
                }
            } else {
                c3328.m5502(view, i, false);
                c3351.f7923 = true;
                C3292 c3292 = this.f7931;
                if (c3292 != null && c3292.f7658) {
                    c3292.f7661.getClass();
                    AbstractC3317 abstractC3317M52493 = RecyclerView.m5249(view);
                    if ((abstractC3317M52493 != null ? abstractC3317M52493.getLayoutPosition() : -1) == c3292.f7662) {
                        c3292.f7657 = view;
                        if (RecyclerView.f7522) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c3351.f7921) {
            if (RecyclerView.f7522) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c3351.f7924);
            }
            abstractC3317M5249.itemView.invalidate();
            c3351.f7921 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract boolean mo5235();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public boolean mo5178(C3351 c3351) {
        return c3351 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m5574(Rect rect, View view) {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m5263(view));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public boolean mo5236() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m5575(View view) {
        m5573(view, -1, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public void mo5237(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7937;
        C3364 c3364 = recyclerView.f7576;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7937.canScrollVertically(-1) && !this.f7937.canScrollHorizontally(-1) && !this.f7937.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC3283 abstractC3283 = this.f7937.f7539;
        if (abstractC3283 != null) {
            accessibilityEvent.setItemCount(abstractC3283.mo5354());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public View mo5179(View view, int i, C3364 c3364, C3358 c3358) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public void mo5345(int i) {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView != null) {
            int iM5498 = recyclerView.f7573.m5498();
            for (int i2 = 0; i2 < iM5498; i2++) {
                recyclerView.f7573.m5499(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public abstract void mo5180(C3364 c3364, C3358 c3358);

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public void mo5181(RecyclerView recyclerView, int i, int i2) {
        mo5577(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public void mo5185(C3364 c3364, C3358 c3358, View view, C8436 c8436) {
        c8436.m13400(C8242.m13201(false, mo5235() ? m5543(view) : 0, 1, mo5236() ? m5543(view) : 0, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public void mo5188(C3364 c3364, C3358 c3358, C8436 c8436) {
        if (this.f7937.canScrollVertically(-1) || this.f7937.canScrollHorizontally(-1)) {
            c8436.m13394(8192);
            c8436.m13396(true);
            c8436.m13397(67108864, true);
        }
        if (this.f7937.canScrollVertically(1) || this.f7937.canScrollHorizontally(1)) {
            c8436.m13394(4096);
            c8436.m13396(true);
            c8436.m13397(67108864, true);
        }
        c8436.m13399(C8242.m13202(mo5160(c3364, c3358), mo5164(c3364, c3358), 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final void m5578(View view, C8436 c8436) {
        AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
        if (abstractC3317M5249 == null || abstractC3317M5249.isRemoved()) {
            return;
        }
        C3328 c3328 = this.f7939;
        if (((ArrayList) c3328.f7814).contains(abstractC3317M5249.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.f7937;
        mo5185(recyclerView.f7576, recyclerView.f7586, view, c8436);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public boolean mo5240() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public boolean mo5241() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public void mo5579(View view) {
        C3351 c3351 = (C3351) view.getLayoutParams();
        Rect rectM5263 = this.f7937.m5263(view);
        int i = rectM5263.left + rectM5263.right;
        int i2 = rectM5263.top + rectM5263.bottom;
        int iM5549 = m5549(mo5236(), this.f7926, this.f7928, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c3351).leftMargin + ((ViewGroup.MarginLayoutParams) c3351).rightMargin + i, ((ViewGroup.MarginLayoutParams) c3351).width);
        int iM55492 = m5549(mo5235(), this.f7925, this.f7927, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3351).topMargin + ((ViewGroup.MarginLayoutParams) c3351).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) c3351).height);
        if (m5564(view, iM5549, iM55492, c3351)) {
            view.measure(iM5549, iM55492);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public void mo5346(int i) {
        RecyclerView recyclerView = this.f7937;
        if (recyclerView != null) {
            int iM5498 = recyclerView.f7573.m5498();
            for (int i2 = 0; i2 < iM5498; i2++) {
                recyclerView.f7573.m5499(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public void mo5187() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public void mo5343(int i) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public void mo5238(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public void mo5576(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public void mo5344(AbstractC3283 abstractC3283) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public void mo5239(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public void mo5182(C3358 c3358) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public void mo5577(int i) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo5232(int i, C1758 c1758) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public void mo5183(int i, int i2) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public void mo5184(int i, int i2) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public void mo5186(int i, int i2) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo5231(int i, int i2, C3358 c3358, C1758 c1758) {
    }
}
