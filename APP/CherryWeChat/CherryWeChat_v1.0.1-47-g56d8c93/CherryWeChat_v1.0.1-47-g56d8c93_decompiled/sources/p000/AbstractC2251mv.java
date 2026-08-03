package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: mv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2251mv {
    @Deprecated
    public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C0038Av c0038Av) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0038Av c0038Av) {
        onDrawOver(canvas, recyclerView);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0038Av c0038Av) {
        getItemOffsets(rect, ((C2431qv) view.getLayoutParams()).f8526a.getLayoutPosition(), recyclerView);
    }

    @Deprecated
    public void onDraw(Canvas canvas, RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
    }
}
