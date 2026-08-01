package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o8 extends kz {
    public final Paint a;
    public final List b;

    public o8() {
        Paint r0 = new Paint();
        this.a = r0;
        this.b = Collections.unmodifiableList(new ArrayList());
        r0.setStrokeWidth(5.0f);
        r0.setColor(-65281);
    }

    @Override // defpackage.kz
    public final void b(Canvas r11, RecyclerView r12) {
        float r0 = r12.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint r6 = this.a;
        r6.setStrokeWidth(r0);
        Iterator r02 = this.b.iterator();
    L4:
        if (r02.hasNext() == false) goto L25;
        ((bq) r02.next()).getClass();
        ThreadLocal r1 = ib.a;
        float r13 = 1.0f - 0.0f;
        r6.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * r13)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * r13)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * r13)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * r13))));
        int r2 = 0;
        if (((CarouselLayoutManager) r12.getLayoutManager()).y0() == false) goto L15;
        p8 r14 = ((CarouselLayoutManager) r12.getLayoutManager()).p;
        switch(r14.b) {
            case 0: goto L10;
            default: goto L9;
        };
    L9:
        r2 = r14.c.E();
    L10:
        float r3 = r2;
        p8 r15 = ((CarouselLayoutManager) r12.getLayoutManager()).p;
        switch(r15.b) {
            case 0: goto L13;
            default: goto L12;
        };
    L12:
        CarouselLayoutManager r16 = r15.c;
        int r22 = r16.o - r16.B();
    L14:
        Canvas r17 = r11;
        r17.drawLine(0.0f, r3, 0.0f, r22, r6);
    L24:
        r11 = r17;
        goto L4
    L13:
        r22 = r15.c.o;
        goto L14
    L15:
        r17 = r11;
        p8 r112 = ((CarouselLayoutManager) r12.getLayoutManager()).p;
        switch(r112.b) {
            case 0: goto L18;
            default: goto L19;
        };
    L18:
        r2 = r112.c.C();
    L19:
        float r23 = r2;
        p8 r113 = ((CarouselLayoutManager) r12.getLayoutManager()).p;
        switch(r113.b) {
            case 0: goto L22;
            default: goto L21;
        };
    L21:
        int r114 = r113.c.n;
    L23:
        r17.drawLine(r23, 0.0f, r114, 0.0f, r6);
        goto L24
    L22:
        CarouselLayoutManager r115 = r113.c;
        r114 = r115.n - r115.D();
        goto L23
    }
}
