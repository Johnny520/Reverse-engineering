package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.AbstractC2537;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p164.AbstractC7667;

/* JADX INFO: renamed from: com.google.android.material.carousel.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3104 extends AbstractC2537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f10181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Paint f10182;

    public C3104() {
        Paint paint = new Paint();
        this.f10182 = paint;
        this.f10181 = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo4887(Canvas canvas, RecyclerView recyclerView) {
        int paddingRight;
        Canvas canvas2;
        int paddingBottom;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f10182;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f10181.iterator();
        while (it.hasNext()) {
            ((AbstractC3102) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC7667.f20811;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int paddingLeft = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m7078()) {
                C3103 c3103 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10176;
                switch (c3103.f10179) {
                    case 0:
                        break;
                    default:
                        paddingLeft = c3103.f10178.getPaddingTop();
                        break;
                }
                float f2 = paddingLeft;
                C3103 c31032 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10176;
                switch (c31032.f10179) {
                    case 0:
                        paddingBottom = c31032.f10178.f7580;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c31032.f10178;
                        paddingBottom = carouselLayoutManager.f7580 - carouselLayoutManager.getPaddingBottom();
                        break;
                }
                float f3 = paddingBottom;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, f3, paint);
            } else {
                C3103 c31033 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10176;
                switch (c31033.f10179) {
                    case 0:
                        paddingLeft = c31033.f10178.getPaddingLeft();
                        break;
                }
                float f4 = paddingLeft;
                C3103 c31034 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10176;
                switch (c31034.f10179) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c31034.f10178;
                        paddingRight = carouselLayoutManager2.f7581 - carouselLayoutManager2.getPaddingRight();
                        break;
                    default:
                        paddingRight = c31034.f10178.f7581;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, 0.0f, paddingRight, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
