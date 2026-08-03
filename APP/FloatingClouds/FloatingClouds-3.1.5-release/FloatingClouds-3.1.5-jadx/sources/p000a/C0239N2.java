package p000a;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.C1210o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: a.N2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0239N2 extends C1210o {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ CarouselLayoutManager f782q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0239N2(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f782q = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1185v
    /* JADX INFO: renamed from: a */
    public final PointF mo634a(int i) {
        return this.f782q.mo2710a(i);
    }

    @Override // androidx.recyclerview.widget.C1210o
    /* JADX INFO: renamed from: f */
    public final int mo635f(View view, int i) {
        CarouselLayoutManager carouselLayoutManager = this.f782q;
        if (carouselLayoutManager.f5550u == null || !carouselLayoutManager.m3140P0()) {
            return 0;
        }
        int iM2827H = RecyclerView.AbstractC1175l.m2827H(view);
        return (int) (carouselLayoutManager.f5545p - carouselLayoutManager.m3138M0(iM2827H, carouselLayoutManager.m3137L0(iM2827H)));
    }

    @Override // androidx.recyclerview.widget.C1210o
    /* JADX INFO: renamed from: g */
    public final int mo636g(View view, int i) {
        CarouselLayoutManager carouselLayoutManager = this.f782q;
        if (carouselLayoutManager.f5550u == null || carouselLayoutManager.m3140P0()) {
            return 0;
        }
        int iM2827H = RecyclerView.AbstractC1175l.m2827H(view);
        return (int) (carouselLayoutManager.f5545p - carouselLayoutManager.m3138M0(iM2827H, carouselLayoutManager.m3137L0(iM2827H)));
    }
}
