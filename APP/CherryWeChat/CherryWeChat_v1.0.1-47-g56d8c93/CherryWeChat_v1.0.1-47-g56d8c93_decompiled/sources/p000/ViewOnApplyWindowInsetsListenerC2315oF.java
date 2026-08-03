package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: oF */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2315oF implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final C2712xb f8158a;

    /* JADX INFO: renamed from: b */
    public C0489LF f8159b;

    public ViewOnApplyWindowInsetsListenerC2315oF(View view, C2712xb c2712xb) {
        C0489LF c0489lfMo5084b;
        this.f8158a = c2712xb;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        C0489LF c0489lfM2675a = AbstractC1404fE.m2675a(view);
        if (c0489lfM2675a != null) {
            int i = Build.VERSION.SDK_INT;
            c0489lfMo5084b = (i >= 34 ? new C2753yF(c0489lfM2675a) : i >= 31 ? new C2710xF(c0489lfM2675a) : i >= 30 ? new C2667wF(c0489lfM2675a) : i >= 29 ? new C2624vF(c0489lfM2675a) : new C2581uF(c0489lfM2675a)).mo5084b();
        } else {
            c0489lfMo5084b = null;
        }
        this.f8159b = c0489lfMo5084b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.f8159b = C0489LF.m939h(view, windowInsets);
            return C2358pF.m4778i(view, windowInsets);
        }
        C0489LF c0489lfM939h = C0489LF.m939h(view, windowInsets);
        C0317HF c0317hf = c0489lfM939h.f1602a;
        if (this.f8159b == null) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            this.f8159b = AbstractC1404fE.m2675a(view);
        }
        if (this.f8159b == null) {
            this.f8159b = c0489lfM939h;
            return C2358pF.m4778i(view, windowInsets);
        }
        C2712xb c2712xbM4779j = C2358pF.m4779j(view);
        if (c2712xbM4779j != null && Objects.equals((C0489LF) c2712xbM4779j.f9286b, c0489lfM939h)) {
            return C2358pF.m4778i(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        C0489LF c0489lf = this.f8159b;
        int i = 1;
        while (i <= 512) {
            C2765yl c2765ylMo14g = c0317hf.mo14g(i);
            C2765yl c2765ylMo14g2 = c0489lf.f1602a.mo14g(i);
            int i2 = c2765ylMo14g.f9405a;
            int i3 = c2765ylMo14g.f9408d;
            int i4 = c2765ylMo14g.f9407c;
            int i5 = c2765ylMo14g.f9406b;
            int i6 = c2765ylMo14g2.f9405a;
            int i7 = c2765ylMo14g2.f9408d;
            int i8 = c2765ylMo14g2.f9407c;
            int i9 = c2765ylMo14g2.f9406b;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.f8159b = c0489lfM939h;
            return C2358pF.m4778i(view, windowInsets);
        }
        C0489LF c0489lf2 = this.f8159b;
        C2538tF c2538tF = new C2538tF(i12, (i10 & 8) != 0 ? C2358pF.f8245e : (i11 & 8) != 0 ? C2358pF.f8246f : (i10 & 519) != 0 ? C2358pF.f8247g : (i11 & 519) != 0 ? C2358pF.f8248h : null, (i12 & 8) != 0 ? 160L : 250L);
        c2538tF.f8846a.mo4896d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c2538tF.f8846a.mo4893a());
        C2765yl c2765ylMo14g3 = c0317hf.mo14g(i12);
        C2765yl c2765ylMo14g4 = c0489lf2.f1602a.mo14g(i12);
        int iMin = Math.min(c2765ylMo14g3.f9405a, c2765ylMo14g4.f9405a);
        int i13 = c2765ylMo14g3.f9406b;
        int i14 = c2765ylMo14g4.f9406b;
        int iMin2 = Math.min(i13, i14);
        int i15 = c2765ylMo14g3.f9407c;
        int i16 = c2765ylMo14g4.f9407c;
        int iMin3 = Math.min(i15, i16);
        int i17 = c2765ylMo14g3.f9408d;
        int i18 = c2765ylMo14g4.f9408d;
        C0299Gy c0299Gy = new C0299Gy(6, C2765yl.m5337b(iMin, iMin2, iMin3, Math.min(i17, i18)), C2765yl.m5337b(Math.max(c2765ylMo14g3.f9405a, c2765ylMo14g4.f9405a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        C2358pF.m4775f(view, c0489lfM939h, false);
        duration.addUpdateListener(new C2272nF(c2538tF, c0489lfM939h, c0489lf2, i12, view));
        duration.addListener(new C0227FB(c2538tF, view));
        ViewTreeObserverOnPreDrawListenerC2515st.m4996a(view, new RunnableC1385ew(view, c2538tF, c0299Gy, duration));
        this.f8159b = c0489lfM939h;
        return C2358pF.m4778i(view, windowInsets);
    }
}
