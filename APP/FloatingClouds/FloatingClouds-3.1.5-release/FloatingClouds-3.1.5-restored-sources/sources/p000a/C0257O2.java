package p000a;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: a.O2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0257O2 extends AbstractC0293Q2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CarouselLayoutManager f926b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0257O2(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f926b = carouselLayoutManager;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: a */
    public final void mo730a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f = rectF2.top;
        float f2 = rectF3.top;
        if (f < f2 && rectF2.bottom > f2) {
            float f3 = f2 - f;
            rectF.top += f3;
            rectF3.top += f3;
        }
        float f4 = rectF2.bottom;
        float f5 = rectF3.bottom;
        if (f4 <= f5 || rectF2.top >= f5) {
            return;
        }
        float f6 = f4 - f5;
        rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: b */
    public final float mo731b(RecyclerView.C1176m c1176m) {
        return ((ViewGroup.MarginLayoutParams) c1176m).topMargin + ((ViewGroup.MarginLayoutParams) c1176m).bottomMargin;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: c */
    public final RectF mo732c(float f, float f2, float f3, float f4) {
        return new RectF(0.0f, f3, f2, f - f3);
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: d */
    public final int mo733d() {
        return this.f926b.f4940o;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: e */
    public final int mo734e() {
        return this.f926b.f4940o;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: f */
    public final int mo735f() {
        return this.f926b.m2838E();
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: g */
    public final int mo736g() {
        CarouselLayoutManager carouselLayoutManager = this.f926b;
        return carouselLayoutManager.f4939n - carouselLayoutManager.m2839F();
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: h */
    public final int mo737h() {
        return 0;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: i */
    public final int mo738i() {
        return 0;
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: j */
    public final void mo739j(View view, int i, int i2) {
        CarouselLayoutManager carouselLayoutManager = this.f926b;
        int iM2838E = carouselLayoutManager.m2838E();
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        int iM2826A = RecyclerView.AbstractC1175l.m2826A(view) + ((ViewGroup.MarginLayoutParams) c1176m).leftMargin + ((ViewGroup.MarginLayoutParams) c1176m).rightMargin + iM2838E;
        carouselLayoutManager.getClass();
        RecyclerView.AbstractC1175l.m2830N(view, iM2838E, i, iM2826A, i2);
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: k */
    public final void mo740k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = fFloor;
            rectF.top = Math.min(rectF.top, fFloor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = fCeil;
            rectF.bottom = Math.max(fCeil, rectF.bottom);
        }
    }

    @Override // p000a.AbstractC0293Q2
    /* JADX INFO: renamed from: l */
    public final void mo741l(View view, Rect rect, float f, float f2) {
        view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
    }
}
