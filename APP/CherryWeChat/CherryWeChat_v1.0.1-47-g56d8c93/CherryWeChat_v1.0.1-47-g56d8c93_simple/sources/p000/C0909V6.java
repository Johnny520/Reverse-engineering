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
        Paint r0 = new Paint();
        this.f2830a = r0;
        this.f2831b = Collections.unmodifiableList(new ArrayList());
        r0.setStrokeWidth(5.0f);
        r0.setColor(-65281);
    }

    @Override // p000.AbstractC2251mv
    public final void onDrawOver(Canvas r7, RecyclerView r8, C0038Av r9) {
        super.onDrawOver(r7, r8, r9);
        float r92 = r8.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint r5 = this.f2830a;
        r5.setStrokeWidth(r92);
        Iterator r93 = this.f2831b.iterator();
    L4:
        if (r93.hasNext() == false) goto L10;
        ((AbstractC2109jn) r93.next()).getClass();
        r5.setColor(AbstractC2797za.m5364b(-65281, -16776961, 0.0f));
        if (((CarouselLayoutManager) r8.getLayoutManager()).m2458e() == false) goto L8;
        Canvas r0 = r7;
        r0.drawLine(0.0f, ((CarouselLayoutManager) r8.getLayoutManager()).f4506b.mo1740i(), 0.0f, ((CarouselLayoutManager) r8.getLayoutManager()).f4506b.mo1736e(), r5);
    L9:
        r7 = r0;
        goto L4
    L8:
        r0 = r7;
        r0.drawLine(((CarouselLayoutManager) r8.getLayoutManager()).f4506b.mo1737f(), 0.0f, ((CarouselLayoutManager) r8.getLayoutManager()).f4506b.mo1738g(), 0.0f, r5);
        goto L9
    }
}
