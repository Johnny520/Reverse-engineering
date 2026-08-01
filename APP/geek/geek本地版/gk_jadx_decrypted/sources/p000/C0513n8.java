package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: n8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0513n8 extends C0939yq {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f3351q = 1;

    public /* synthetic */ C0513n8(Context context) {
        super(context);
    }

    @Override // p000.C0939yq
    /* JADX INFO: renamed from: b */
    public int mo1919b(View view, int i) {
        switch (this.f3351q) {
            case Base64.DEFAULT /* 0 */:
                return 0;
            default:
                return super.mo1919b(view, i);
        }
    }

    @Override // p000.C0939yq
    /* JADX INFO: renamed from: c */
    public int mo1920c(View view, int i) {
        switch (this.f3351q) {
            case Base64.DEFAULT /* 0 */:
                return 0;
            default:
                return super.mo1920c(view, i);
        }
    }

    @Override // p000.C0939yq
    /* JADX INFO: renamed from: d */
    public float mo1330d(DisplayMetrics displayMetrics) {
        switch (this.f3351q) {
            case Base64.NO_PADDING /* 1 */:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo1330d(displayMetrics);
        }
    }

    @Override // p000.C0939yq
    /* JADX INFO: renamed from: f */
    public PointF mo1921f(int i) {
        switch (this.f3351q) {
            case Base64.DEFAULT /* 0 */:
                return null;
            default:
                return super.mo1921f(i);
        }
    }

    public C0513n8(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
