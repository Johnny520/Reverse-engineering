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

/* JADX INFO: renamed from: z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0958z8 extends AbstractC0688rz {

    /* JADX INFO: renamed from: a */
    public final Paint f5558a;

    /* JADX INFO: renamed from: b */
    public final List f5559b;

    public C0958z8() {
        Paint paint = new Paint();
        this.f5558a = paint;
        this.f5559b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p000.AbstractC0688rz
    /* JADX INFO: renamed from: b */
    public final void mo2302b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iM2510D;
        int iM2508B;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f5558a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f5559b.iterator();
        while (it.hasNext()) {
            ((AbstractC0233fq) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC0627qb.f3889a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int iM2509C = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m705y0()) {
                C0010a9 c0010a9 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1021p;
                switch (c0010a9.f53b) {
                    case Base64.DEFAULT /* 0 */:
                        break;
                    default:
                        iM2509C = c0010a9.f54c.m2511E();
                        break;
                }
                float f2 = iM2509C;
                C0010a9 c0010a92 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1021p;
                switch (c0010a92.f53b) {
                    case Base64.DEFAULT /* 0 */:
                        iM2508B = c0010a92.f54c.f4869o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0010a92.f54c;
                        iM2508B = carouselLayoutManager.f4869o - carouselLayoutManager.m2508B();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, iM2508B, paint);
            } else {
                canvas2 = canvas;
                C0010a9 c0010a93 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1021p;
                switch (c0010a93.f53b) {
                    case Base64.DEFAULT /* 0 */:
                        iM2509C = c0010a93.f54c.m2509C();
                        break;
                }
                float f3 = iM2509C;
                C0010a9 c0010a94 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1021p;
                switch (c0010a94.f53b) {
                    case Base64.DEFAULT /* 0 */:
                        CarouselLayoutManager carouselLayoutManager2 = c0010a94.f54c;
                        iM2510D = carouselLayoutManager2.f4868n - carouselLayoutManager2.m2510D();
                        break;
                    default:
                        iM2510D = c0010a94.f54c.f4868n;
                        break;
                }
                canvas2.drawLine(f3, 0.0f, iM2510D, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
