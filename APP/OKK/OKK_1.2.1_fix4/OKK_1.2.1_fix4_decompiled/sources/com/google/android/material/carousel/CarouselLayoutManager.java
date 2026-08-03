package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p001A0.RunnableC0028d;
import p034S.AbstractC0324d;
import p037U.AbstractC0343C;
import p037U.C0344D;
import p037U.C0349I;
import p037U.C0352L;
import p058g0.AbstractC0942a;
import p072n0.AbstractC1010e;
import p072n0.C1007b;
import p072n0.C1008c;
import p072n0.C1009d;
import p072n0.C1011f;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0343C {

    /* JADX INFO: renamed from: k */
    public final C1011f f2364k;

    /* JADX INFO: renamed from: l */
    public C1009d f2365l;

    /* JADX INFO: renamed from: m */
    public final View.OnLayoutChangeListener f2366m;

    public CarouselLayoutManager() {
        C1011f c1011f = new C1011f();
        new C1007b();
        this.f2366m = new View.OnLayoutChangeListener() { // from class: n0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager carouselLayoutManager = this.f3716a;
                carouselLayoutManager.getClass();
                if (i2 == i6 && i3 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                view.post(new RunnableC0028d(11, carouselLayoutManager));
            }
        };
        this.f2364k = c1011f;
        m793Y();
        m1867g0(0);
    }

    /* JADX INFO: renamed from: d0 */
    public static C1008c m1863d0(List list, float f2, boolean z2) {
        float f3 = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        float f4 = -3.4028235E38f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((AbstractC1010e) list.get(i6)).getClass();
            float fAbs = Math.abs(0.0f - f2);
            if (0.0f <= f2 && fAbs <= f3) {
                i2 = i6;
                f3 = fAbs;
            }
            if (0.0f > f2 && fAbs <= f5) {
                i4 = i6;
                f5 = fAbs;
            }
            if (0.0f <= f6) {
                f6 = 0.0f;
                i3 = i6;
            }
            if (0.0f > f4) {
                f4 = 0.0f;
                i5 = i6;
            }
        }
        if (i2 == -1) {
            i2 = i3;
        }
        if (i4 == -1) {
            i4 = i5;
        }
        AbstractC1010e abstractC1010e = (AbstractC1010e) list.get(i2);
        AbstractC1010e abstractC1010e2 = (AbstractC1010e) list.get(i4);
        C1008c c1008c = new C1008c();
        abstractC1010e.getClass();
        abstractC1010e2.getClass();
        if (0.0f <= 0.0f) {
            return c1008c;
        }
        throw new IllegalArgumentException();
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: H */
    public final boolean mo777H() {
        return true;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: J */
    public final void mo778J(RecyclerView recyclerView) {
        C1011f c1011f = this.f2364k;
        Context context = recyclerView.getContext();
        float dimension = c1011f.f3722a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(C1031R.dimen.m3_carousel_small_item_size_min);
        }
        c1011f.f3722a = dimension;
        float dimension2 = c1011f.f3723b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(C1031R.dimen.m3_carousel_small_item_size_max);
        }
        c1011f.f3723b = dimension2;
        m787S();
        recyclerView.addOnLayoutChangeListener(this.f2366m);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: K */
    public final void mo779K(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2366m);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo780L(View view, int i2, C0349I c0349i, C0352L c0352l) {
        byte b2;
        if (m813r() == 0) {
            return null;
        }
        int i3 = this.f2365l.f3719a;
        if (i2 == 1) {
            b2 = -1;
        } else if (i2 == 2) {
            b2 = 1;
        } else if (i2 == 17) {
            if (i3 == 0) {
                if (m1866f0()) {
                }
            }
            b2 = -2147483648;
        } else if (i2 != 33) {
            if (i2 == 66) {
                if (i3 == 0) {
                    if (m1866f0()) {
                    }
                }
                b2 = -2147483648;
            } else if (i2 != 130 || i3 != 1) {
                b2 = -2147483648;
            }
        } else if (i3 == 1) {
        }
        if (b2 == -2147483648) {
            return null;
        }
        if (b2 == -1) {
            if (AbstractC0343C.m765D(view) == 0) {
                return null;
            }
            int iM765D = AbstractC0343C.m765D(m812q(0)) - 1;
            if (iM765D < 0 || iM765D >= m816x()) {
                return m812q(m1866f0() ? m813r() - 1 : 0);
            }
            m1864c0(iM765D);
            c0349i.m829i(iM765D, Long.MAX_VALUE);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        if (AbstractC0343C.m765D(view) == m816x() - 1) {
            return null;
        }
        int iM765D2 = AbstractC0343C.m765D(m812q(m813r() - 1)) + 1;
        if (iM765D2 < 0 || iM765D2 >= m816x()) {
            return m812q(m1866f0() ? 0 : m813r() - 1);
        }
        m1864c0(iM765D2);
        c0349i.m829i(iM765D2, Long.MAX_VALUE);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: M */
    public final void mo781M(AccessibilityEvent accessibilityEvent) {
        super.mo781M(accessibilityEvent);
        if (m813r() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0343C.m765D(m812q(0)));
            accessibilityEvent.setToIndex(AbstractC0343C.m765D(m812q(m813r() - 1)));
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: X */
    public final boolean mo792X(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: c */
    public final boolean mo799c() {
        return m1865e0();
    }

    /* JADX INFO: renamed from: c0 */
    public final float m1864c0(int i2) {
        this.f2365l.m2443d();
        throw null;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: d */
    public final boolean mo800d() {
        return !m1865e0();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m1865e0() {
        return this.f2365l.f3719a == 0;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m1866f0() {
        return m1865e0() && m817y() == 1;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: g */
    public final int mo802g(C0352L c0352l) {
        m813r();
        return 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1867g0(int i2) {
        C1009d c1009d;
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(AbstractC0324d.m720c("invalid orientation:", i2));
        }
        mo797b(null);
        C1009d c1009d2 = this.f2365l;
        if (c1009d2 == null || i2 != c1009d2.f3719a) {
            if (i2 == 0) {
                c1009d = new C1009d(this, 1);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c1009d = new C1009d(this, 0);
            }
            this.f2365l = c1009d;
            m793Y();
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: h */
    public final int mo803h(C0352L c0352l) {
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: i */
    public final int mo804i(C0352L c0352l) {
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: j */
    public final int mo805j(C0352L c0352l) {
        m813r();
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: k */
    public final int mo806k(C0352L c0352l) {
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: l */
    public final int mo807l(C0352L c0352l) {
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: n */
    public final C0344D mo809n() {
        return new C0344D(-2, -2);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: u */
    public final void mo815u(View view, Rect rect) {
        super.mo815u(view, rect);
        rect.centerY();
        if (m1865e0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        new C1007b();
        this.f2366m = new View.OnLayoutChangeListener() { // from class: n0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i32, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager carouselLayoutManager = this.f3716a;
                carouselLayoutManager.getClass();
                if (i22 == i6 && i32 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                view.post(new RunnableC0028d(11, carouselLayoutManager));
            }
        };
        this.f2364k = new C1011f();
        m793Y();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3330b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m793Y();
            m1867g0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
