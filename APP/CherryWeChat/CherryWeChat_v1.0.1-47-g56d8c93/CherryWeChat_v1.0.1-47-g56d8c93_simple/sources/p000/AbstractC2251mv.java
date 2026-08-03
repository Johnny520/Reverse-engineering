package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: mv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2251mv {
    @Deprecated
    public void getItemOffsets(Rect r1, int r2, RecyclerView r3) {
        r1.set(0, 0, 0, 0);
    }

    public void onDraw(Canvas r1, RecyclerView r2, C0038Av r3) {
        onDraw(r1, r2);
    }

    public void onDrawOver(Canvas r1, RecyclerView r2, C0038Av r3) {
        onDrawOver(r1, r2);
    }

    public void getItemOffsets(Rect r1, View r2, RecyclerView r3, C0038Av r4) {
        getItemOffsets(r1, ((C2431qv) r2.getLayoutParams()).f8526a.getLayoutPosition(), r3);
    }

    @Deprecated
    public void onDraw(Canvas r1, RecyclerView r2) {
    }

    @Deprecated
    public void onDrawOver(Canvas r1, RecyclerView r2) {
    }
}
