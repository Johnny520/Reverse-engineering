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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3141 extends AbstractC2537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Calendar f10363 = AbstractC3121.m7135(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Calendar f10362 = AbstractC3121.m7135(null);

    public C3141(MaterialCalendar materialCalendar) {
        this.f10361 = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4888(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C3112) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C3112 c3112 = (C3112) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.f10361;
            for (C2187 c2187 : materialCalendar.f10260.mo7101()) {
                Object obj = c2187.f6460;
                Object obj2 = c2187.f6459;
                if (obj != null && obj2 != null) {
                    long jLongValue = ((Long) obj).longValue();
                    Calendar calendar = this.f10363;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) obj2).longValue();
                    Calendar calendar2 = this.f10362;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - c3112.f10280.f10263.f10240.f10272;
                    int i2 = calendar2.get(1) - c3112.f10280.f10263.f10240.f10272;
                    View viewMo4644 = gridLayoutManager.mo4644(i);
                    View viewMo46442 = gridLayoutManager.mo4644(i2);
                    int i3 = gridLayoutManager.f7142;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View viewMo46443 = gridLayoutManager.mo4644(gridLayoutManager.f7142 * i6);
                        if (viewMo46443 != null) {
                            int top2 = viewMo46443.getTop() + ((Rect) ((C0191) materialCalendar.f10255.f7459).f749).top;
                            int bottom = viewMo46443.getBottom() - ((Rect) ((C0191) materialCalendar.f10255.f7459).f749).bottom;
                            canvas.drawRect((i6 != i4 || viewMo4644 == null) ? 0 : (viewMo4644.getWidth() / 2) + viewMo4644.getLeft(), top2, (i6 != i5 || viewMo46442 == null) ? recyclerView.getWidth() : (viewMo46442.getWidth() / 2) + viewMo46442.getLeft(), bottom, (Paint) materialCalendar.f10255.f7463);
                        }
                    }
                }
            }
        }
    }
}
