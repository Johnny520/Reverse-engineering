package p001;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ۟.j8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0269j8 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: ۥ۟ */
    public int f879 = 30;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1530 = 1;

    /* JADX INFO: renamed from: ۥ */
    public ColorDrawable f878 = new ColorDrawable(-1118481);

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.set(0, 0, 0, this.f1530);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        int paddingLeft = recyclerView.getPaddingLeft() + this.f879;
        int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + childAt.getLayoutParams().bottomMargin;
            int i2 = this.f1530 + bottom;
            ColorDrawable colorDrawable = this.f878;
            if (colorDrawable != null) {
                colorDrawable.setBounds(paddingLeft, bottom, measuredWidth, i2);
                this.f878.draw(canvas);
            }
        }
    }
}
