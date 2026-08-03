package p072n0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p037U.AbstractC0341A;
import p085v.AbstractC1100a;

/* JADX INFO: renamed from: n0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1007b extends AbstractC0341A {

    /* JADX INFO: renamed from: a */
    public final Paint f3717a;

    /* JADX INFO: renamed from: b */
    public final List f3718b;

    public C1007b() {
        Paint paint = new Paint();
        this.f3717a = paint;
        this.f3718b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p037U.AbstractC0341A
    /* JADX INFO: renamed from: b */
    public final void mo759b(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f3717a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(C1031R.dimen.m3_carousel_debug_keyline_width));
        for (AbstractC1010e abstractC1010e : this.f3718b) {
            abstractC1010e.getClass();
            int i2 = AbstractC1100a.f4247a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m1865e0()) {
                float fM2444e = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2365l.m2444e();
                float fM2440a = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2365l.m2440a();
                abstractC1010e.getClass();
                canvas.drawLine(0.0f, fM2444e, 0.0f, fM2440a, paint);
            } else {
                float fM2441b = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2365l.m2441b();
                float fM2442c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2365l.m2442c();
                abstractC1010e.getClass();
                canvas.drawLine(fM2441b, 0.0f, fM2442c, 0.0f, paint);
            }
        }
    }
}
