package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class n8 extends yq {
    public final /* synthetic */ int q;

    public /* synthetic */ n8(Context r2) {
        this.q = 1;
        super(r2);
    }

    @Override // defpackage.yq
    public int b(View r2, int r3) {
        switch(this.q) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return super.b(r2, r3);
    }

    @Override // defpackage.yq
    public int c(View r2, int r3) {
        switch(this.q) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return super.c(r2, r3);
    }

    @Override // defpackage.yq
    public float d(DisplayMetrics r2) {
        switch(this.q) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.d(r2);
    L7:
        return 100.0f / r2.densityDpi;
    }

    @Override // defpackage.yq
    public PointF f(int r2) {
        switch(this.q) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return null;
    L5:
        return super.f(r2);
    }

    public n8(CarouselLayoutManager r1, Context r2) {
        this.q = 0;
        super(r2);
    }
}
