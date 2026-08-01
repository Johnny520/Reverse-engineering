package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0550o8 extends AbstractC0429kz {

    /* JADX INFO: renamed from: a */
    public final Paint f3510a;

    /* JADX INFO: renamed from: b */
    public final List f3511b;

    public C0550o8() {
        Paint paint = new Paint();
        this.f3510a = paint;
        this.f3511b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p000.AbstractC0429kz
    /* JADX INFO: renamed from: b */
    public final void mo1732b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iM1962D;
        int iM1960B;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f3510a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f3511b.iterator();
        while (it.hasNext()) {
            ((AbstractC0077bq) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC0329ib.f2405a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int iM1961C = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m747y0()) {
                C0588p8 c0588p8 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1096p;
                switch (c0588p8.f3681b) {
                    case Base64.DEFAULT /* 0 */:
                        break;
                    default:
                        iM1961C = c0588p8.f3682c.m1963E();
                        break;
                }
                float f2 = iM1961C;
                C0588p8 c0588p82 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1096p;
                switch (c0588p82.f3681b) {
                    case Base64.DEFAULT /* 0 */:
                        iM1960B = c0588p82.f3682c.f3469o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0588p82.f3682c;
                        iM1960B = carouselLayoutManager.f3469o - carouselLayoutManager.m1960B();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, iM1960B, paint);
            } else {
                canvas2 = canvas;
                C0588p8 c0588p83 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1096p;
                switch (c0588p83.f3681b) {
                    case Base64.DEFAULT /* 0 */:
                        iM1961C = c0588p83.f3682c.m1961C();
                        break;
                }
                float f3 = iM1961C;
                C0588p8 c0588p84 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1096p;
                switch (c0588p84.f3681b) {
                    case Base64.DEFAULT /* 0 */:
                        CarouselLayoutManager carouselLayoutManager2 = c0588p84.f3682c;
                        iM1962D = carouselLayoutManager2.f3468n - carouselLayoutManager2.m1962D();
                        break;
                    default:
                        iM1962D = c0588p84.f3682c.f3468n;
                        break;
                }
                canvas2.drawLine(f3, 0.0f, iM1962D, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
