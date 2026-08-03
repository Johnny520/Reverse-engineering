package com.google.android.material.divider;

import Yue.C4187;
import Yue.C4520;
import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import Yue.InterfaceC4398;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1980R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDividerItemDecoration extends RecyclerView.AbstractC8918 {
    private static final int DEF_STYLE_RES = C1980R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    @InterfaceC3897
    private int color;

    @InterfaceC6391
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialDividerItemDecoration(@InterfaceC6391 Context context, int i) {
        this(context, null, i);
    }

    private void drawForHorizontalOrientation(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i3 = paddingTop + this.insetStart;
        int i4 = height - this.insetEnd;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationX());
                if (zIsLayoutRtl) {
                    i2 = this.tempRect.left + iRound;
                    i = this.thickness + i2;
                } else {
                    i = iRound + this.tempRect.right;
                    i2 = i - this.thickness;
                }
                this.dividerDrawable.setBounds(i2, i3, i, i4);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int i = paddingLeft + (zIsLayoutRtl ? this.insetEnd : this.insetStart);
        int i2 = width - (zIsLayoutRtl ? this.insetStart : this.insetEnd);
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = this.tempRect.bottom + Math.round(childAt.getTranslationY());
                this.dividerDrawable.setBounds(i, iRound - this.thickness, i2, iRound);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @InterfaceC3897
    public int getDividerColor() {
        return this.color;
    }

    @InterfaceC6844
    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    @InterfaceC6844
    public int getDividerInsetStart() {
        return this.insetStart;
    }

    @InterfaceC6844
    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
    public void getItemOffsets(@InterfaceC6391 Rect rect, @InterfaceC6391 View view, @InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.C8935 c8935) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(recyclerView, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (ViewUtils.isLayoutRtl(recyclerView)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
    public void onDraw(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.C8935 c8935) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColor(@InterfaceC3897 int i) {
        this.color = i;
        Drawable drawableM13239 = C4520.m13239(this.dividerDrawable);
        this.dividerDrawable = drawableM13239;
        C4520.m13235(drawableM13239, i);
    }

    public void setDividerColorResource(@InterfaceC6391 Context context, @InterfaceC3906 int i) {
        setDividerColor(C4187.m12060(context, i));
    }

    public void setDividerInsetEnd(@InterfaceC6844 int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(@InterfaceC6391 Context context, @InterfaceC4398 int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@InterfaceC6844 int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(@InterfaceC6391 Context context, @InterfaceC4398 int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@InterfaceC6844 int i) {
        this.thickness = i;
    }

    public void setDividerThicknessResource(@InterfaceC6391 Context context, @InterfaceC4398 int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public void setLastItemDecorated(boolean z) {
        this.lastItemDecorated = z;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.orientation = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean shouldDrawDivider(int i, @InterfaceC6490 RecyclerView.AbstractC8909<?> abstractC8909) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialDividerItemDecoration(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        this(context, attributeSet, C1980R.attr.materialDividerStyle, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private boolean shouldDrawDivider(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.AbstractC8909 adapter = recyclerView.getAdapter();
        boolean z = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
        if (childAdapterPosition != -1) {
            return (!z || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, (RecyclerView.AbstractC8909<?>) adapter);
        }
        return false;
    }

    public MaterialDividerItemDecoration(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        this.tempRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C1980R.styleable.MaterialDivider, i, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(C1980R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.MaterialDivider_lastItemDecorated, true);
        typedArrayObtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i2);
    }
}
