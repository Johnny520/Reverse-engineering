package androidx.recyclerview.widget;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8967 extends RecyclerView.AbstractC8918 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f30166 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f30167 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f30168 = "DividerItem";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int[] f30169 = {R.attr.listDivider};

    /* JADX INFO: renamed from: ۥ */
    public Drawable f3950;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3951;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Rect f30170 = new Rect();

    public C8967(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f30169);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f3950 = drawable;
        if (drawable == null) {
            Log.w(f30168, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C8935 c8935) {
        Drawable drawable = this.f3950;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f3951 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C8935 c8935) {
        if (recyclerView.getLayoutManager() == null || this.f3950 == null) {
            return;
        }
        if (this.f3951 == 1) {
            m30582(canvas, recyclerView);
        } else {
            m30581(canvas, recyclerView);
        }
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f3951 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m30581(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f30170);
            int iRound = this.f30170.right + Math.round(childAt.getTranslationX());
            this.f3950.setBounds(iRound - this.f3950.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f3950.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30582(Canvas canvas, RecyclerView recyclerView) {
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
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f30170);
            int iRound = this.f30170.bottom + Math.round(childAt.getTranslationY());
            this.f3950.setBounds(paddingLeft, iRound - this.f3950.getIntrinsicHeight(), width, iRound);
            this.f3950.draw(canvas);
        }
        canvas.restore();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Drawable m30583() {
        return this.f3950;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m30584(@InterfaceC6391 Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f3950 = drawable;
    }
}
