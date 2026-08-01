package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.C1038;
import androidx.core.util.C3020;
import androidx.recyclerview.widget.AbstractC3370;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3973 extends AbstractC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Calendar f10708 = AbstractC3953.m7694(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Calendar f10707 = AbstractC3953.m7694(null);

    public C3973(MaterialCalendar materialCalendar) {
        this.f10706 = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo5448(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C3944) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C3944 c3944 = (C3944) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.f10706;
            for (C3020 c3020 : materialCalendar.f10605.mo7660()) {
                Object obj = c3020.f6805;
                Object obj2 = c3020.f6804;
                if (obj != null && obj2 != null) {
                    long jLongValue = ((Long) obj).longValue();
                    Calendar calendar = this.f10708;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) obj2).longValue();
                    Calendar calendar2 = this.f10707;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - c3944.f10625.f10608.f10585.f10617;
                    int i2 = calendar2.get(1) - c3944.f10625.f10608.f10585.f10617;
                    View viewMo5204 = gridLayoutManager.mo5204(i);
                    View viewMo52042 = gridLayoutManager.mo5204(i2);
                    int i3 = gridLayoutManager.f7487;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View viewMo52043 = gridLayoutManager.mo5204(gridLayoutManager.f7487 * i6);
                        if (viewMo52043 != null) {
                            int top2 = viewMo52043.getTop() + ((Rect) ((C1038) materialCalendar.f10600.f7804).f1094).top;
                            int bottom = viewMo52043.getBottom() - ((Rect) ((C1038) materialCalendar.f10600.f7804).f1094).bottom;
                            canvas.drawRect((i6 != i4 || viewMo5204 == null) ? 0 : (viewMo5204.getWidth() / 2) + viewMo5204.getLeft(), top2, (i6 != i5 || viewMo52042 == null) ? recyclerView.getWidth() : (viewMo52042.getWidth() / 2) + viewMo52042.getLeft(), bottom, (Paint) materialCalendar.f10600.f7808);
                        }
                    }
                }
            }
        }
    }
}
