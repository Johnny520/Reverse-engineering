package com.lxj.xpopup.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2537;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3792 extends AbstractC2537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f11950 = {R.attr.listDivider};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f11951;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Drawable f11952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Rect f11953 = new Rect();

    public C3792(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f11950);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f11952 = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f11951 = 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4879(Rect rect, View view, RecyclerView recyclerView, C2525 c2525) {
        Drawable drawable = this.f11952;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f11951 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4888(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int width;
        int paddingStart;
        if (recyclerView.getLayoutManager() == null || this.f11952 == null) {
            return;
        }
        int i = 0;
        int i2 = this.f11951;
        Rect rect = this.f11953;
        if (i2 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingStart = recyclerView.getPaddingStart();
                width = recyclerView.getWidth() - recyclerView.getPaddingEnd();
                canvas.clipRect(paddingStart, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingStart = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i < childCount && i != childCount - 1) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.m4690(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f11952.setBounds(paddingStart, iRound - this.f11952.getIntrinsicHeight(), width, iRound);
                this.f11952.draw(canvas);
                i++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingStart(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingEnd(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2 && i != childCount2 - 1) {
            View childAt2 = recyclerView.getChildAt(i);
            recyclerView.getLayoutManager().mo4995(rect, childAt2);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f11952.setBounds(iRound2 - this.f11952.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f11952.draw(canvas);
            i++;
        }
        canvas.restore();
    }
}
