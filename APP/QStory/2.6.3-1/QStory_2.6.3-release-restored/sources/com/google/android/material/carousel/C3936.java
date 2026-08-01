package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.AbstractC3370;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p180.AbstractC8496;

/* JADX INFO: renamed from: com.google.android.material.carousel.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3936 extends AbstractC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f10526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Paint f10527;

    public C3936() {
        Paint paint = new Paint();
        this.f10527 = paint;
        this.f10526 = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo5447(Canvas canvas, RecyclerView recyclerView) {
        int paddingRight;
        Canvas canvas2;
        int paddingBottom;
        float dimension = recyclerView.getResources().getDimension(C0328R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f10527;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f10526.iterator();
        while (it.hasNext()) {
            ((AbstractC3934) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC8496.f21156;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int paddingLeft = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m7637()) {
                C3935 c3935 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10521;
                switch (c3935.f10524) {
                    case 0:
                        break;
                    default:
                        paddingLeft = c3935.f10523.getPaddingTop();
                        break;
                }
                float f2 = paddingLeft;
                C3935 c39352 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10521;
                switch (c39352.f10524) {
                    case 0:
                        paddingBottom = c39352.f10523.f7925;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c39352.f10523;
                        paddingBottom = carouselLayoutManager.f7925 - carouselLayoutManager.getPaddingBottom();
                        break;
                }
                float f3 = paddingBottom;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, f3, paint);
            } else {
                C3935 c39353 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10521;
                switch (c39353.f10524) {
                    case 0:
                        paddingLeft = c39353.f10523.getPaddingLeft();
                        break;
                }
                float f4 = paddingLeft;
                C3935 c39354 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f10521;
                switch (c39354.f10524) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c39354.f10523;
                        paddingRight = carouselLayoutManager2.f7926 - carouselLayoutManager2.getPaddingRight();
                        break;
                    default:
                        paddingRight = c39354.f10523.f7926;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, 0.0f, paddingRight, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
