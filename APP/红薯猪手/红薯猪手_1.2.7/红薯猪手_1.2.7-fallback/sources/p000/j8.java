package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j8 extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.graphics.drawable.ColorDrawable f522;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f523;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f524;

    public j8() {
            r2 = this;
            r2.<init>()
            r0 = 30
            r2.f523 = r0
            r0 = 1
            r2.f524 = r0
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = -1118481(0xffffffffffeeeeef, float:NaN)
            r0.<init>(r1)
            r2.f522 = r0
            return
    }

    public final void getItemOffsets(android.graphics.Rect r1, android.view.View r2, androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r0 = this;
            super.getItemOffsets(r1, r2, r3, r4)
            int r2 = r0.f524
            r3 = 0
            r1.set(r3, r3, r3, r2)
            return
    }

    public final void onDraw(android.graphics.Canvas r7, androidx.recyclerview.widget.RecyclerView r8, androidx.recyclerview.widget.RecyclerView.State r9) {
            r6 = this;
            super.onDraw(r7, r8, r9)
            int r9 = r8.getPaddingLeft()
            int r0 = r6.f523
            int r9 = r9 + r0
            int r0 = r8.getMeasuredWidth()
            int r1 = r8.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r8.getChildCount()
            r2 = 0
        L18:
            if (r2 >= r1) goto L3d
            android.view.View r3 = r8.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
            int r3 = r3.getBottom()
            int r4 = r4.bottomMargin
            int r3 = r3 + r4
            int r4 = r6.f524
            int r4 = r4 + r3
            android.graphics.drawable.ColorDrawable r5 = r6.f522
            if (r5 == 0) goto L3a
            r5.setBounds(r9, r3, r0, r4)
            android.graphics.drawable.ColorDrawable r3 = r6.f522
            r3.draw(r7)
        L3a:
            int r2 = r2 + 1
            goto L18
        L3d:
            return
    }
}
