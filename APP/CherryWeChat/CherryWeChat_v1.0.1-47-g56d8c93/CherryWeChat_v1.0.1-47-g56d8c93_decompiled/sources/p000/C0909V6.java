package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: V6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0909V6 extends AbstractC2251mv {

    /* JADX INFO: renamed from: a */
    public final Paint f2830a;

    /* JADX INFO: renamed from: b */
    public final List f2831b;

    public C0909V6() {
        Paint paint = new Paint();
        this.f2830a = paint;
        this.f2831b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p000.AbstractC2251mv
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0038Av c0038Av) {
        Canvas canvas2;
        super.onDrawOver(canvas, recyclerView, c0038Av);
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f2830a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f2831b.iterator();
        while (it.hasNext()) {
            ((AbstractC2109jn) it.next()).getClass();
            paint.setColor(AbstractC2797za.m5364b(-65281, -16776961, 0.0f));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m2458e()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f4506b.mo1740i(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f4506b.mo1736e(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f4506b.mo1737f(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f4506b.mo1738g(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
