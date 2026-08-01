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
import p164.AbstractC7666;

/* JADX INFO: renamed from: com.google.android.material.carousel.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3103 extends AbstractC2537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f10176;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Paint f10177;

    public C3103() {
        Paint paint = new Paint();
        this.f10177 = paint;
        this.f10176 = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo4877(Canvas canvas, RecyclerView recyclerView) {
        int paddingRight;
        Canvas canvas2;
        int paddingBottom;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f10177;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f10176.iterator();
        while (it.hasNext()) {
            ((AbstractC3101) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC7666.f20816;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int paddingLeft = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m7091()) {
                C3102 c3102 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10171;
                switch (c3102.f10174) {
                    case 0:
                        break;
                    default:
                        paddingLeft = c3102.f10173.getPaddingTop();
                        break;
                }
                float f2 = paddingLeft;
                C3102 c31022 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10171;
                switch (c31022.f10174) {
                    case 0:
                        paddingBottom = c31022.f10173.f7579;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c31022.f10173;
                        paddingBottom = carouselLayoutManager.f7579 - carouselLayoutManager.getPaddingBottom();
                        break;
                }
                float f3 = paddingBottom;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, f3, paint);
            } else {
                C3102 c31023 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10171;
                switch (c31023.f10174) {
                    case 0:
                        paddingLeft = c31023.f10173.getPaddingLeft();
                        break;
                }
                float f4 = paddingLeft;
                C3102 c31024 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10171;
                switch (c31024.f10174) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c31024.f10173;
                        paddingRight = carouselLayoutManager2.f7580 - carouselLayoutManager2.getPaddingRight();
                        break;
                    default:
                        paddingRight = c31024.f10173.f7580;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, 0.0f, paddingRight, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
