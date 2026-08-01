package com.lxj.xpopup.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.AbstractC3370;
import androidx.recyclerview.widget.C3358;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4624 extends AbstractC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f12295 = {R.attr.listDivider};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f12296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Drawable f12297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Rect f12298 = new Rect();

    public C4624(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f12295);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f12297 = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f12296 = 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo5439(Rect rect, View view, RecyclerView recyclerView, C3358 c3358) {
        Drawable drawable = this.f12297;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f12296 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo5448(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int width;
        int paddingStart;
        if (recyclerView.getLayoutManager() == null || this.f12297 == null) {
            return;
        }
        int i = 0;
        int i2 = this.f12296;
        Rect rect = this.f12298;
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
                RecyclerView.m5250(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f12297.setBounds(paddingStart, iRound - this.f12297.getIntrinsicHeight(), width, iRound);
                this.f12297.draw(canvas);
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
            recyclerView.getLayoutManager().mo5555(rect, childAt2);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f12297.setBounds(iRound2 - this.f12297.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f12297.draw(canvas);
            i++;
        }
        canvas.restore();
    }
}
