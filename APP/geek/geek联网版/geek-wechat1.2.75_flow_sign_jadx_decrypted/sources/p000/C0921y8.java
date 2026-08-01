package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: y8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0921y8 extends C0124cr {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f5361q = 1;

    public /* synthetic */ C0921y8(Context context) {
        super(context);
    }

    @Override // p000.C0124cr
    /* JADX INFO: renamed from: b */
    public int mo771b(View view, int i) {
        switch (this.f5361q) {
            case Base64.DEFAULT /* 0 */:
                return 0;
            default:
                return super.mo771b(view, i);
        }
    }

    @Override // p000.C0124cr
    /* JADX INFO: renamed from: c */
    public int mo772c(View view, int i) {
        switch (this.f5361q) {
            case Base64.DEFAULT /* 0 */:
                return 0;
            default:
                return super.mo772c(view, i);
        }
    }

    @Override // p000.C0124cr
    /* JADX INFO: renamed from: d */
    public float mo773d(DisplayMetrics displayMetrics) {
        switch (this.f5361q) {
            case Base64.NO_PADDING /* 1 */:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo773d(displayMetrics);
        }
    }

    @Override // p000.C0124cr
    /* JADX INFO: renamed from: f */
    public PointF mo775f(int i) {
        switch (this.f5361q) {
            case Base64.DEFAULT /* 0 */:
                return null;
            default:
                return super.mo775f(i);
        }
    }

    public C0921y8(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
