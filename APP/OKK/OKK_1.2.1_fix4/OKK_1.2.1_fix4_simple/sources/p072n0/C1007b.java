package p072n0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
        Paint r02 = new Paint();
        this.f3717a = r02;
        this.f3718b = Collections.unmodifiableList(new ArrayList());
        r02.setStrokeWidth(5.0f);
        r02.setColor(-65281);
    }

    @Override // p037U.AbstractC0341A
    /* JADX INFO: renamed from: b */
    public final void mo759b(Canvas r12, RecyclerView r13) {
        Paint r6 = this.f3717a;
        r6.setStrokeWidth(r13.getResources().getDimension(C1031R.dimen.m3_carousel_debug_keyline_width));
        Iterator r7 = this.f3718b.iterator();
    L4:
        if (r7.hasNext() == false) goto L9;
        AbstractC1010e r02 = (AbstractC1010e) r7.next();
        r02.getClass();
        int r2 = AbstractC1100a.f4247a;
        float r22 = 1.0f - 0.0f;
        r6.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * r22)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * r22)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * r22)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * r22))));
        if (((CarouselLayoutManager) r13.getLayoutManager()).m1865e0() == true) goto L7;
        float r1 = ((CarouselLayoutManager) r13.getLayoutManager()).f2365l.m2441b();
        float r3 = ((CarouselLayoutManager) r13.getLayoutManager()).f2365l.m2442c();
        r02.getClass();
        r12.drawLine(r1, 0.0f, r3, 0.0f, r6);
        goto L4
    L7:
        float r23 = ((CarouselLayoutManager) r13.getLayoutManager()).f2365l.m2444e();
        float r4 = ((CarouselLayoutManager) r13.getLayoutManager()).f2365l.m2440a();
        r02.getClass();
        r12.drawLine(0.0f, r23, 0.0f, r4, r6);
        goto L4
    }
}
