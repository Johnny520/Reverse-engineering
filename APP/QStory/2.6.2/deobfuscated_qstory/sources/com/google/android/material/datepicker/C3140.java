package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.C0191;
import androidx.core.util.C2187;
import androidx.recyclerview.widget.AbstractC2537;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3140 extends AbstractC2537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Calendar f10358 = AbstractC3120.m7148(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Calendar f10357 = AbstractC3120.m7148(null);

    public C3140(MaterialCalendar materialCalendar) {
        this.f10356 = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4878(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C3111) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C3111 c3111 = (C3111) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.f10356;
            for (C2187 c2187 : materialCalendar.f10255.mo7114()) {
                Object obj = c2187.f6459;
                Object obj2 = c2187.f6458;
                if (obj != null && obj2 != null) {
                    long jLongValue = ((Long) obj).longValue();
                    Calendar calendar = this.f10358;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) obj2).longValue();
                    Calendar calendar2 = this.f10357;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - c3111.f10275.f10258.f10235.f10267;
                    int i2 = calendar2.get(1) - c3111.f10275.f10258.f10235.f10267;
                    View viewMo4634 = gridLayoutManager.mo4634(i);
                    View viewMo46342 = gridLayoutManager.mo4634(i2);
                    int i3 = gridLayoutManager.f7141;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View viewMo46343 = gridLayoutManager.mo4634(gridLayoutManager.f7141 * i6);
                        if (viewMo46343 != null) {
                            int top2 = viewMo46343.getTop() + ((Rect) ((C0191) materialCalendar.f10250.f7458).f749).top;
                            int bottom = viewMo46343.getBottom() - ((Rect) ((C0191) materialCalendar.f10250.f7458).f749).bottom;
                            canvas.drawRect((i6 != i4 || viewMo4634 == null) ? 0 : (viewMo4634.getWidth() / 2) + viewMo4634.getLeft(), top2, (i6 != i5 || viewMo46342 == null) ? recyclerView.getWidth() : (viewMo46342.getWidth() / 2) + viewMo46342.getLeft(), bottom, (Paint) materialCalendar.f10250.f7462);
                        }
                    }
                }
            }
        }
    }
}
