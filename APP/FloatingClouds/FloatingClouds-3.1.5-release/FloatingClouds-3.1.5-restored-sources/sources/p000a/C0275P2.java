package p000a;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: a.P2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0275P2 extends AbstractC0293Q2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CarouselLayoutManager f964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275P2(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f964b = carouselLayoutManager;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: a */
    public final void mo730a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f = rectF2.left;
        float f2 = rectF3.left;
        if (f < f2 && rectF2.right > f2) {
            float f3 = f2 - f;
            rectF.left += f3;
            rectF2.left += f3;
        }
        float f4 = rectF2.right;
        float f5 = rectF3.right;
        if (f4 <= f5 || rectF2.left >= f5) {
            return;
        }
        float f6 = f4 - f5;
        rectF.right = Math.max(rectF.right - f6, rectF.left);
        rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: b */
    public final float mo731b(RecyclerView.C1176m c1176m) {
        return ((ViewGroup.MarginLayoutParams) c1176m).rightMargin + ((ViewGroup.MarginLayoutParams) c1176m).leftMargin;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: c */
    public final RectF mo732c(float f, float f2, float f3, float f4) {
        return new RectF(f4, 0.0f, f2 - f4, f);
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: d */
    public final int mo733d() {
        CarouselLayoutManager carouselLayoutManager = this.f964b;
        return carouselLayoutManager.f4940o - carouselLayoutManager.m2837D();
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: e */
    public final int mo734e() {
        CarouselLayoutManager carouselLayoutManager = this.f964b;
        if (carouselLayoutManager.m3141Q0()) {
            return 0;
        }
        return carouselLayoutManager.f4939n;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: f */
    public final int mo735f() {
        return 0;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: g */
    public final int mo736g() {
        return this.f964b.f4939n;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: h */
    public final int mo737h() {
        CarouselLayoutManager carouselLayoutManager = this.f964b;
        if (carouselLayoutManager.m3141Q0()) {
            return carouselLayoutManager.f4939n;
        }
        return 0;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: i */
    public final int mo738i() {
        return this.f964b.m2840G();
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: j */
    public final void mo739j(View view, int i, int i2) {
        CarouselLayoutManager carouselLayoutManager = this.f964b;
        int iM2840G = carouselLayoutManager.m2840G();
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        int iM2833z = RecyclerView.AbstractC1175l.m2833z(view) + ((ViewGroup.MarginLayoutParams) c1176m).topMargin + ((ViewGroup.MarginLayoutParams) c1176m).bottomMargin + iM2840G;
        carouselLayoutManager.getClass();
        RecyclerView.AbstractC1175l.m2830N(view, i, iM2840G, i2, iM2833z);
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: k */
    public final void mo740k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = fFloor;
            rectF.left = Math.min(rectF.left, fFloor);
        }
        if (rectF2.left >= rectF3.right) {
            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = fCeil;
            rectF.right = Math.max(fCeil, rectF.right);
        }
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: l */
    public final void mo741l(View view, Rect rect, float f, float f2) {
        view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
    }
}
