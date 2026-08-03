package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1247R;
import com.google.android.material.carousel.C1277b;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p000a.AbstractC0293Q2;
import p000a.AbstractC0310R2;
import p000a.C0058D1;
import p000a.C0239N2;
import p000a.C0257O2;
import p000a.C0275P2;
import p000a.C0726n9;
import p000a.C0872v3;
import p000a.C0888w0;
import p000a.C0937yb;
import p000a.C0944z;
import p000a.InterfaceC0860ua;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.AbstractC1175l implements RecyclerView.AbstractC1185v.b {

    /* JADX INFO: renamed from: A */
    public int f5542A;

    /* JADX INFO: renamed from: B */
    public int f5543B;

    /* JADX INFO: renamed from: C */
    public final int f5544C;

    /* JADX INFO: renamed from: p */
    public int f5545p;

    /* JADX INFO: renamed from: q */
    public int f5546q;

    /* JADX INFO: renamed from: r */
    public int f5547r;

    /* JADX INFO: renamed from: s */
    public final C1274b f5548s;

    /* JADX INFO: renamed from: t */
    public final C0937yb f5549t;

    /* JADX INFO: renamed from: u */
    public C1278c f5550u;

    /* JADX INFO: renamed from: v */
    public C1277b f5551v;

    /* JADX INFO: renamed from: w */
    public int f5552w;

    /* JADX INFO: renamed from: x */
    public HashMap f5553x;

    /* JADX INFO: renamed from: y */
    public AbstractC0293Q2 f5554y;

    /* JADX INFO: renamed from: z */
    public final View.OnLayoutChangeListener f5555z;

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    public static final class C1273a {

        /* JADX INFO: renamed from: a */
        public final View f5556a;

        /* JADX INFO: renamed from: b */
        public final float f5557b;

        /* JADX INFO: renamed from: c */
        public final float f5558c;

        /* JADX INFO: renamed from: d */
        public final C1275c f5559d;

        public C1273a(View view, float f, float f2, C1275c c1275c) {
            this.f5556a = view;
            this.f5557b = f;
            this.f5558c = f2;
            this.f5559d = c1275c;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    public static class C1274b extends RecyclerView.AbstractC1174k {

        /* JADX INFO: renamed from: a */
        public final Paint f5560a;

        /* JADX INFO: renamed from: b */
        public List<C1277b.b> f5561b;

        public C1274b() {
            Paint paint = new Paint();
            this.f5560a = paint;
            this.f5561b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1174k
        /* JADX INFO: renamed from: d */
        public final void mo2825d(Canvas canvas, RecyclerView recyclerView) {
            Canvas canvas2;
            Paint paint = this.f5560a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(C1247R.dimen.m3_carousel_debug_keyline_width));
            for (C1277b.b bVar : this.f5561b) {
                float f = bVar.f5579c;
                ThreadLocal<double[]> threadLocal = C0872v3.f3417a;
                float f2 = 1.0f - f;
                paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * f) + (Color.blue(-65281) * f2))));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m3140P0()) {
                    float fMo738i = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5554y.mo738i();
                    float fMo733d = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5554y.mo733d();
                    float f3 = bVar.f5578b;
                    canvas2 = canvas;
                    canvas2.drawLine(f3, fMo738i, f3, fMo733d, paint);
                } else {
                    float fMo735f = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5554y.mo735f();
                    float fMo736g = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5554y.mo736g();
                    float f4 = bVar.f5578b;
                    canvas2 = canvas;
                    canvas2.drawLine(fMo735f, f4, fMo736g, f4, paint);
                }
                canvas = canvas2;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    public static class C1275c {

        /* JADX INFO: renamed from: a */
        public final C1277b.b f5562a;

        /* JADX INFO: renamed from: b */
        public final C1277b.b f5563b;

        public C1275c(C1277b.b bVar, C1277b.b bVar2) {
            if (bVar.f5577a > bVar2.f5577a) {
                throw new IllegalArgumentException();
            }
            this.f5562a = bVar;
            this.f5563b = bVar2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CarouselLayoutManager() {
        C0937yb c0937yb = new C0937yb();
        this.f5548s = new C1274b();
        this.f5552w = 0;
        this.f5555z = new View.OnLayoutChangeListener() { // from class: a.L2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = this.f691a;
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0221M2(0, carouselLayoutManager));
            }
        };
        this.f5543B = -1;
        this.f5544C = 0;
        this.f5549t = c0937yb;
        m3147W0();
        m3149Y0(0);
    }

    /* JADX INFO: renamed from: O0 */
    public static C1275c m3127O0(List<C1277b.b> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            C1277b.b bVar = list.get(i5);
            float f6 = z ? bVar.f5578b : bVar.f5577a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new C1275c(list.get(i), list.get(i3));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m3128C0(View view, int i, C1273a c1273a) {
        float f = this.f5551v.f5564a / 2.0f;
        m2847b(view, i, false);
        float f2 = c1273a.f5558c;
        this.f5554y.mo739j(view, (int) (f2 - f), (int) (f2 + f));
        m3150Z0(view, c1273a.f5557b, c1273a.f5559d);
    }

    /* JADX INFO: renamed from: D0 */
    public final float m3129D0(float f, float f2) {
        return m3141Q0() ? f - f2 : f + f2;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m3130E0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        float fM3133H0 = m3133H0(i);
        while (i < c1186w.m2887b()) {
            C1273a c1273aM3144T0 = m3144T0(c1181r, fM3133H0, i);
            float f = c1273aM3144T0.f5558c;
            C1275c c1275c = c1273aM3144T0.f5559d;
            if (m3142R0(f, c1275c)) {
                return;
            }
            fM3133H0 = m3129D0(fM3133H0, this.f5551v.f5564a);
            if (!m3143S0(f, c1275c)) {
                m3128C0(c1273aM3144T0.f5556a, -1, c1273aM3144T0);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m3131F0(RecyclerView.C1181r c1181r, int i) {
        float fM3133H0 = m3133H0(i);
        while (i >= 0) {
            C1273a c1273aM3144T0 = m3144T0(c1181r, fM3133H0, i);
            C1275c c1275c = c1273aM3144T0.f5559d;
            float f = c1273aM3144T0.f5558c;
            if (m3143S0(f, c1275c)) {
                return;
            }
            float f2 = this.f5551v.f5564a;
            fM3133H0 = m3141Q0() ? fM3133H0 + f2 : fM3133H0 - f2;
            if (!m3142R0(f, c1275c)) {
                m3128C0(c1273aM3144T0.f5556a, 0, c1273aM3144T0);
            }
            i--;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final float m3132G0(View view, float f, C1275c c1275c) {
        C1277b.b bVar = c1275c.f5562a;
        float f2 = bVar.f5578b;
        C1277b.b bVar2 = c1275c.f5563b;
        float f3 = bVar2.f5578b;
        float f4 = bVar.f5577a;
        float f5 = bVar2.f5577a;
        float fM2113b = C0888w0.m2113b(f2, f3, f4, f5, f);
        if (bVar2 != this.f5551v.m3157b() && bVar != this.f5551v.m3159d()) {
            return fM2113b;
        }
        return (((1.0f - bVar2.f5579c) + (this.f5554y.mo731b((RecyclerView.C1176m) view.getLayoutParams()) / this.f5551v.f5564a)) * (f - f5)) + fM2113b;
    }

    /* JADX INFO: renamed from: H0 */
    public final float m3133H0(int i) {
        return m3129D0(this.f5554y.mo737h() - this.f5545p, this.f5551v.f5564a * i);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m3134I0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        while (m2860v() > 0) {
            View viewM2858u = m2858u(0);
            float fM3136K0 = m3136K0(viewM2858u);
            if (!m3143S0(fM3136K0, m3127O0(this.f5551v.f5565b, fM3136K0, true))) {
                break;
            } else {
                m2851k0(viewM2858u, c1181r);
            }
        }
        while (m2860v() - 1 >= 0) {
            View viewM2858u2 = m2858u(m2860v() - 1);
            float fM3136K02 = m3136K0(viewM2858u2);
            if (!m3142R0(fM3136K02, m3127O0(this.f5551v.f5565b, fM3136K02, true))) {
                break;
            } else {
                m2851k0(viewM2858u2, c1181r);
            }
        }
        if (m2860v() == 0) {
            m3131F0(c1181r, this.f5552w - 1);
            m3130E0(this.f5552w, c1181r, c1186w);
        } else {
            int iM2827H = RecyclerView.AbstractC1175l.m2827H(m2858u(0));
            int iM2827H2 = RecyclerView.AbstractC1175l.m2827H(m2858u(m2860v() - 1));
            m3131F0(c1181r, iM2827H - 1);
            m3130E0(iM2827H2 + 1, c1181r, c1186w);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final int m3135J0() {
        return m3140P0() ? this.f4939n : this.f4940o;
    }

    /* JADX INFO: renamed from: K0 */
    public final float m3136K0(View view) {
        super.mo2863y(view, new Rect());
        return m3140P0() ? r0.centerX() : r0.centerY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: L */
    public final boolean mo2695L() {
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public final C1277b m3137L0(int i) {
        C1277b c1277b;
        HashMap map = this.f5553x;
        return (map == null || (c1277b = (C1277b) map.get(Integer.valueOf(C0726n9.m1667j(i, 0, Math.max(0, m2835B() + (-1)))))) == null) ? this.f5550u.f5585a : c1277b;
    }

    /* JADX INFO: renamed from: M0 */
    public final int m3138M0(int i, C1277b c1277b) {
        if (!m3141Q0()) {
            return (int) ((c1277b.f5564a / 2.0f) + ((i * c1277b.f5564a) - c1277b.m3156a().f5577a));
        }
        float fM3135J0 = m3135J0() - c1277b.m3158c().f5577a;
        float f = c1277b.f5564a;
        return (int) ((fM3135J0 - (i * f)) - (f / 2.0f));
    }

    /* JADX INFO: renamed from: N0 */
    public final int m3139N0(int i, C1277b c1277b) {
        int i2 = Integer.MAX_VALUE;
        for (C1277b.b bVar : c1277b.f5565b.subList(c1277b.f5566c, c1277b.f5567d + 1)) {
            float f = c1277b.f5564a;
            float f2 = (f / 2.0f) + (i * f);
            int iM3135J0 = (m3141Q0() ? (int) ((m3135J0() - bVar.f5577a) - f2) : (int) (f2 - bVar.f5577a)) - this.f5545p;
            if (Math.abs(i2) > Math.abs(iM3135J0)) {
                i2 = iM3135J0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m3140P0() {
        return this.f5554y.f1077a == 0;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m3141Q0() {
        return m3140P0() && m2836C() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: R */
    public final void mo2845R(RecyclerView recyclerView) {
        C0937yb c0937yb = this.f5549t;
        Context context = recyclerView.getContext();
        float dimension = c0937yb.f1113a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(C1247R.dimen.m3_carousel_small_item_size_min);
        }
        c0937yb.f1113a = dimension;
        float dimension2 = c0937yb.f1114b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(C1247R.dimen.m3_carousel_small_item_size_max);
        }
        c0937yb.f1114b = dimension2;
        m3147W0();
        recyclerView.addOnLayoutChangeListener(this.f5555z);
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m3142R0(float f, C1275c c1275c) {
        C1277b.b bVar = c1275c.f5562a;
        float f2 = bVar.f5580d;
        C1277b.b bVar2 = c1275c.f5563b;
        float fM2113b = C0888w0.m2113b(f2, bVar2.f5580d, bVar.f5578b, bVar2.f5578b, f) / 2.0f;
        float f3 = m3141Q0() ? f + fM2113b : f - fM2113b;
        return m3141Q0() ? f3 < 0.0f : f3 > ((float) m3135J0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: S */
    public final void mo2702S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f5555z);
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m3143S0(float f, C1275c c1275c) {
        C1277b.b bVar = c1275c.f5562a;
        float f2 = bVar.f5580d;
        C1277b.b bVar2 = c1275c.f5563b;
        float fM3129D0 = m3129D0(f, C0888w0.m2113b(f2, bVar2.f5580d, bVar.f5578b, bVar2.f5578b, f) / 2.0f);
        return m3141Q0() ? fM3129D0 > ((float) m3135J0()) : fM3129D0 < 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo2651T(View view, int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        byte b;
        if (m2860v() == 0) {
            return null;
        }
        int i2 = this.f5554y.f1077a;
        if (i == 1) {
            b = -1;
        } else if (i == 2) {
            b = 1;
        } else if (i == 17) {
            if (i2 == 0) {
                if (m3141Q0()) {
                }
            }
            b = -2147483648;
        } else if (i != 33) {
            if (i != 66) {
                if (i != 130) {
                    Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                } else if (i2 == 1) {
                }
                b = -2147483648;
            } else {
                if (i2 == 0) {
                    if (m3141Q0()) {
                    }
                }
                b = -2147483648;
            }
        } else if (i2 != 1) {
            b = -2147483648;
        }
        if (b == -2147483648) {
            return null;
        }
        if (b == -1) {
            if (RecyclerView.AbstractC1175l.m2827H(view) == 0) {
                return null;
            }
            int iM2827H = RecyclerView.AbstractC1175l.m2827H(m2858u(0)) - 1;
            if (iM2827H >= 0 && iM2827H < m2835B()) {
                C1273a c1273aM3144T0 = m3144T0(c1181r, m3133H0(iM2827H), iM2827H);
                m3128C0(c1273aM3144T0.f5556a, 0, c1273aM3144T0);
            }
            return m2858u(m3141Q0() ? m2860v() - 1 : 0);
        }
        if (RecyclerView.AbstractC1175l.m2827H(view) == m2835B() - 1) {
            return null;
        }
        int iM2827H2 = RecyclerView.AbstractC1175l.m2827H(m2858u(m2860v() - 1)) + 1;
        if (iM2827H2 >= 0 && iM2827H2 < m2835B()) {
            C1273a c1273aM3144T02 = m3144T0(c1181r, m3133H0(iM2827H2), iM2827H2);
            m3128C0(c1273aM3144T02.f5556a, -1, c1273aM3144T02);
        }
        return m2858u(m3141Q0() ? 0 : m2860v() - 1);
    }

    /* JADX INFO: renamed from: T0 */
    public final C1273a m3144T0(RecyclerView.C1181r c1181r, float f, int i) {
        View view = c1181r.m2878k(Long.MAX_VALUE, i).f4891a;
        m3145U0(view);
        float fM3129D0 = m3129D0(f, this.f5551v.f5564a / 2.0f);
        C1275c c1275cM3127O0 = m3127O0(this.f5551v.f5565b, fM3129D0, false);
        return new C1273a(view, fM3129D0, m3132G0(view, fM3129D0, c1275cM3127O0), c1275cM3127O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: U */
    public final void mo2705U(AccessibilityEvent accessibilityEvent) {
        super.mo2705U(accessibilityEvent);
        if (m2860v() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.AbstractC1175l.m2827H(m2858u(0)));
            accessibilityEvent.setToIndex(RecyclerView.AbstractC1175l.m2827H(m2858u(m2860v() - 1)));
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m3145U0(View view) {
        if (!(view instanceof InterfaceC0860ua)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        Rect rect = new Rect();
        RecyclerView recyclerView = this.f4927b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m2754M(view));
        }
        int i = rect.left + rect.right;
        int i2 = rect.top + rect.bottom;
        C1278c c1278c = this.f5550u;
        view.measure(RecyclerView.AbstractC1175l.m2832w(m3140P0(), this.f4939n, this.f4937l, m2839F() + m2838E() + ((ViewGroup.MarginLayoutParams) c1176m).leftMargin + ((ViewGroup.MarginLayoutParams) c1176m).rightMargin + i, (int) ((c1278c == null || this.f5554y.f1077a != 0) ? ((ViewGroup.MarginLayoutParams) c1176m).width : c1278c.f5585a.f5564a)), RecyclerView.AbstractC1175l.m2832w(mo2716e(), this.f4940o, this.f4938m, m2837D() + m2840G() + ((ViewGroup.MarginLayoutParams) c1176m).topMargin + ((ViewGroup.MarginLayoutParams) c1176m).bottomMargin + i2, (int) ((c1278c == null || this.f5554y.f1077a != 1) ? ((ViewGroup.MarginLayoutParams) c1176m).height : c1278c.f5585a.f5564a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0476 A[PHI: r25
  0x0476: PHI (r25v1 float) = (r25v3 float), (r25v4 float) binds: [B:147:0x0474, B:143:0x046c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0575 A[SYNTHETIC] */
    /* JADX INFO: renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3146V0(RecyclerView.C1181r c1181r) {
        float f;
        int i;
        C1277b c1277bM3163d;
        int i2;
        int iM2840G;
        int iM2837D;
        List<C1277b.b> list;
        float f2;
        int i3;
        int i4;
        int size;
        int i5;
        int i6;
        C1277b.b bVar;
        int i7;
        boolean z;
        C1277b.b bVar2;
        int i8;
        int i9;
        View view = c1181r.m2878k(Long.MAX_VALUE, 0).f4891a;
        m3145U0(view);
        C0937yb c0937yb = this.f5549t;
        c0937yb.getClass();
        float f3 = this.f4940o;
        if (m3140P0()) {
            f3 = this.f4939n;
        }
        float f4 = f3;
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        float f5 = ((ViewGroup.MarginLayoutParams) c1176m).topMargin + ((ViewGroup.MarginLayoutParams) c1176m).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (m3140P0()) {
            f5 = ((ViewGroup.MarginLayoutParams) c1176m).leftMargin + ((ViewGroup.MarginLayoutParams) c1176m).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f6 = f5;
        float f7 = c0937yb.f1113a + f6;
        float fMax = Math.max(c0937yb.f1114b + f6, f7);
        float fMin = Math.min(measuredHeight + f6, f4);
        float f8 = (measuredHeight / 3.0f) + f6;
        float f9 = f7 + f6;
        float f10 = fMax + f6;
        if (f8 < f9) {
            f8 = f9;
        } else if (f8 > f10) {
            f8 = f10;
        }
        float f11 = (fMin + f8) / 2.0f;
        int[] iArr = C0937yb.f3547d;
        if (f4 < f7 * 2.0f) {
            iArr = new int[]{0};
        }
        int[] iArr2 = C0937yb.f3548e;
        if (this.f5544C == 1) {
            int length = iArr.length;
            f = 2.0f;
            int[] iArr3 = new int[length];
            i = 1;
            for (int i10 = 0; i10 < length; i10++) {
                iArr3[i10] = iArr[i10] * 2;
            }
            int[] iArr4 = new int[2];
            for (int i11 = 0; i11 < 2; i11++) {
                iArr4[i11] = iArr2[i11] * 2;
            }
            iArr2 = iArr4;
            iArr = iArr3;
        } else {
            f = 2.0f;
            i = 1;
        }
        int i12 = Integer.MIN_VALUE;
        for (int i13 : iArr2) {
            if (i13 > i12) {
                i12 = i13;
            }
        }
        float f12 = f4 - (i12 * f11);
        int length2 = iArr.length;
        int i14 = Integer.MIN_VALUE;
        int i15 = 0;
        while (i15 < length2) {
            View view2 = view;
            int i16 = iArr[i15];
            if (i16 > i14) {
                i14 = i16;
            }
            i15++;
            view = view2;
        }
        View view3 = view;
        int iMax = (int) Math.max(1.0d, Math.floor((f12 - (i14 * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f4 / fMin);
        int i17 = (iCeil - iMax) + 1;
        int[] iArr5 = new int[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            iArr5[i18] = iCeil - i18;
        }
        float f13 = f8;
        C0058D1 c0058d1M154a = C0058D1.m154a(f4, f13, f7, fMax, iArr, f11, iArr2, fMin, iArr5);
        int i19 = c0058d1M154a.f196c + c0058d1M154a.f197d;
        int i20 = c0058d1M154a.f200g;
        c0937yb.f3549c = i19 + i20;
        int iM2835B = m2835B();
        int i21 = c0058d1M154a.f196c;
        int i22 = c0058d1M154a.f197d;
        int i23 = ((i21 + i22) + i20) - iM2835B;
        boolean z2 = i23 > 0 && (i21 > 0 || i22 > i);
        while (i23 > 0) {
            int i24 = c0058d1M154a.f196c;
            if (i24 > 0) {
                c0058d1M154a.f196c = i24 - 1;
            } else {
                int i25 = c0058d1M154a.f197d;
                if (i25 > 1) {
                    c0058d1M154a.f197d = i25 - 1;
                }
            }
            i23--;
        }
        if (z2) {
            c0058d1M154a = C0058D1.m154a(f4, f13, f7, fMax, new int[]{c0058d1M154a.f196c}, f11, new int[]{c0058d1M154a.f197d}, fMin, new int[]{i20});
        }
        Context context = view3.getContext();
        if (this.f5544C == 1) {
            float fMin2 = Math.min(context.getResources().getDimension(C1247R.dimen.m3_carousel_gone_size) + f6, c0058d1M154a.f199f);
            float f14 = fMin2 / f;
            float f15 = 0.0f - f14;
            float fM3154b = C1276a.m3154b(0.0f, c0058d1M154a.f195b, c0058d1M154a.f196c);
            float fM3155c = C1276a.m3155c(0.0f, C1276a.m3153a(fM3154b, c0058d1M154a.f195b, (int) Math.floor(c0058d1M154a.f196c / f)), c0058d1M154a.f195b, c0058d1M154a.f196c);
            float fM3154b2 = C1276a.m3154b(fM3155c, c0058d1M154a.f198e, c0058d1M154a.f197d);
            float fM3155c2 = C1276a.m3155c(fM3155c, C1276a.m3153a(fM3154b2, c0058d1M154a.f198e, (int) Math.floor(c0058d1M154a.f197d / f)), c0058d1M154a.f198e, c0058d1M154a.f197d);
            float f16 = c0058d1M154a.f199f;
            int i26 = c0058d1M154a.f200g;
            float fM3154b3 = C1276a.m3154b(fM3155c2, f16, i26);
            float fM3155c3 = C1276a.m3155c(fM3155c2, C1276a.m3153a(fM3154b3, c0058d1M154a.f199f, i26), c0058d1M154a.f199f, i26);
            float fM3154b4 = C1276a.m3154b(fM3155c3, c0058d1M154a.f198e, c0058d1M154a.f197d);
            float fM3154b5 = C1276a.m3154b(C1276a.m3155c(fM3155c3, C1276a.m3153a(fM3154b4, c0058d1M154a.f198e, (int) Math.ceil(c0058d1M154a.f197d / f)), c0058d1M154a.f198e, c0058d1M154a.f197d), c0058d1M154a.f195b, c0058d1M154a.f196c);
            float f17 = f14 + f4;
            float fM856a = AbstractC0310R2.m856a(fMin2, c0058d1M154a.f199f, f6);
            float fM856a2 = AbstractC0310R2.m856a(c0058d1M154a.f195b, c0058d1M154a.f199f, f6);
            float fM856a3 = AbstractC0310R2.m856a(c0058d1M154a.f198e, c0058d1M154a.f199f, f6);
            C1277b.a aVar = new C1277b.a(c0058d1M154a.f199f, f4);
            aVar.m3160a(f15, fM856a, fMin2, false, true);
            if (c0058d1M154a.f196c > 0) {
                aVar.m3162c(fM3154b, fM856a2, c0058d1M154a.f195b, (int) Math.floor(r5 / f), false);
            }
            if (c0058d1M154a.f197d > 0) {
                aVar.m3162c(fM3154b2, fM856a3, c0058d1M154a.f198e, (int) Math.floor(r5 / f), false);
            }
            aVar.m3162c(fM3154b3, 0.0f, c0058d1M154a.f199f, c0058d1M154a.f200g, true);
            if (c0058d1M154a.f197d > 0) {
                aVar.m3162c(fM3154b4, fM856a3, c0058d1M154a.f198e, (int) Math.ceil(r5 / f), false);
            }
            if (c0058d1M154a.f196c > 0) {
                aVar.m3162c(fM3154b5, fM856a2, c0058d1M154a.f195b, (int) Math.ceil(r4 / f), false);
            }
            aVar.m3160a(f17, fM856a, fMin2, false, true);
            c1277bM3163d = aVar.m3163d();
        } else {
            float fMin3 = Math.min(context.getResources().getDimension(C1247R.dimen.m3_carousel_gone_size) + f6, c0058d1M154a.f199f);
            float f18 = fMin3 / f;
            float f19 = 0.0f - f18;
            float f20 = c0058d1M154a.f199f;
            int i27 = c0058d1M154a.f200g;
            float fM3154b6 = C1276a.m3154b(0.0f, f20, i27);
            float fM3155c4 = C1276a.m3155c(0.0f, C1276a.m3153a(fM3154b6, c0058d1M154a.f199f, i27), c0058d1M154a.f199f, i27);
            float fM3154b7 = C1276a.m3154b(fM3155c4, c0058d1M154a.f198e, c0058d1M154a.f197d);
            float fM3154b8 = C1276a.m3154b(C1276a.m3155c(fM3155c4, fM3154b7, c0058d1M154a.f198e, c0058d1M154a.f197d), c0058d1M154a.f195b, c0058d1M154a.f196c);
            float f21 = f18 + f4;
            float fM856a4 = AbstractC0310R2.m856a(fMin3, c0058d1M154a.f199f, f6);
            float fM856a5 = AbstractC0310R2.m856a(c0058d1M154a.f195b, c0058d1M154a.f199f, f6);
            float fM856a6 = AbstractC0310R2.m856a(c0058d1M154a.f198e, c0058d1M154a.f199f, f6);
            C1277b.a aVar2 = new C1277b.a(c0058d1M154a.f199f, f4);
            aVar2.m3160a(f19, fM856a4, fMin3, false, true);
            aVar2.m3162c(fM3154b6, 0.0f, c0058d1M154a.f199f, c0058d1M154a.f200g, true);
            if (c0058d1M154a.f197d > 0) {
                aVar2.m3160a(fM3154b7, fM856a6, c0058d1M154a.f198e, false, false);
            }
            int i28 = c0058d1M154a.f196c;
            if (i28 > 0) {
                aVar2.m3162c(fM3154b8, fM856a5, c0058d1M154a.f195b, i28, false);
            }
            aVar2.m3160a(f21, fM856a4, fMin3, false, true);
            c1277bM3163d = aVar2.m3163d();
        }
        if (m3141Q0()) {
            float fM3135J0 = m3135J0();
            C1277b.a aVar3 = new C1277b.a(c1277bM3163d.f5564a, fM3135J0);
            float f22 = (fM3135J0 - c1277bM3163d.m3159d().f5578b) - (c1277bM3163d.m3159d().f5580d / f);
            List<C1277b.b> list2 = c1277bM3163d.f5565b;
            int size2 = list2.size() - 1;
            while (size2 >= 0) {
                C1277b.b bVar3 = list2.get(size2);
                float f23 = bVar3.f5580d;
                aVar3.m3160a((f23 / f) + f22, bVar3.f5579c, f23, size2 >= c1277bM3163d.f5566c && size2 <= c1277bM3163d.f5567d, bVar3.f5581e);
                f22 += bVar3.f5580d;
                size2--;
            }
            c1277bM3163d = aVar3.m3163d();
        }
        C1277b c1277b = c1277bM3163d;
        if (m2860v() > 0) {
            RecyclerView.C1176m c1176m2 = (RecyclerView.C1176m) m2858u(0).getLayoutParams();
            if (this.f5554y.f1077a == 0) {
                i8 = ((ViewGroup.MarginLayoutParams) c1176m2).leftMargin;
                i9 = ((ViewGroup.MarginLayoutParams) c1176m2).rightMargin;
            } else {
                i8 = ((ViewGroup.MarginLayoutParams) c1176m2).topMargin;
                i9 = ((ViewGroup.MarginLayoutParams) c1176m2).bottomMargin;
            }
            i2 = i9 + i8;
        } else {
            i2 = 0;
        }
        float f24 = i2;
        RecyclerView recyclerView = this.f4927b;
        if (recyclerView == null || !recyclerView.f4854h) {
            this.f5549t.getClass();
            iM2840G = this.f5554y.f1077a == 1 ? m2840G() : m2838E();
        } else {
            iM2840G = 0;
        }
        float f25 = iM2840G;
        RecyclerView recyclerView2 = this.f4927b;
        if (recyclerView2 == null || !recyclerView2.f4854h) {
            this.f5549t.getClass();
            iM2837D = this.f5554y.f1077a == 1 ? m2837D() : m2839F();
        } else {
            iM2837D = 0;
        }
        float f26 = iM2837D;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1277b);
        int i29 = 0;
        while (true) {
            list = c1277b.f5565b;
            if (i29 >= list.size()) {
                i29 = -1;
                break;
            } else if (!list.get(i29).f5581e) {
                break;
            } else {
                i29++;
            }
        }
        float f27 = m3140P0() ? this.f4939n : this.f4940o;
        float f28 = c1277b.m3156a().f5578b - (c1277b.m3156a().f5580d / f);
        int i30 = c1277b.f5567d;
        int i31 = c1277b.f5566c;
        if (f28 >= 0.0f) {
            C1277b.b bVarM3156a = c1277b.m3156a();
            f2 = 0.0f;
            int i32 = 0;
            while (true) {
                if (i32 >= list.size()) {
                    bVar2 = null;
                    break;
                }
                bVar2 = list.get(i32);
                if (!bVar2.f5581e) {
                    break;
                } else {
                    i32++;
                }
            }
            if (bVarM3156a == bVar2) {
                if (f25 > f2) {
                    arrayList.add(C1278c.m3166f(c1277b, f25, f27, true, f24));
                }
                i3 = i30;
                i4 = i31;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c1277b);
            size = list.size() - 1;
            while (true) {
                if (size >= 0) {
                    size = -1;
                    break;
                } else if (!list.get(size).f5581e) {
                    break;
                } else {
                    size--;
                }
            }
            float f29 = !m3140P0() ? this.f4939n : this.f4940o;
            i5 = this.f4940o;
            if (m3140P0()) {
                i5 = this.f4939n;
            }
            if ((c1277b.m3158c().f5580d / f) + c1277b.m3158c().f5578b > i5) {
                C1277b.b bVarM3158c = c1277b.m3158c();
                int size3 = list.size() - 1;
                while (true) {
                    if (size3 < 0) {
                        bVar = null;
                        break;
                    }
                    bVar = list.get(size3);
                    if (!bVar.f5581e) {
                        break;
                    } else {
                        size3--;
                    }
                }
                if (bVarM3158c == bVar) {
                    if (f26 > f2) {
                        arrayList2.add(C1278c.m3166f(c1277b, f26, f29, false, f24));
                    }
                } else if (size != -1) {
                    int i33 = size - i3;
                    float f30 = c1277b.m3157b().f5578b - (c1277b.m3157b().f5580d / f);
                    if (i33 > 0 || c1277b.m3158c().f5582f <= f2) {
                        float f31 = f29;
                        float f32 = f2;
                        int i34 = 0;
                        while (i34 < i33) {
                            C1277b c1277b2 = (C1277b) arrayList2.get(arrayList2.size() - 1);
                            int i35 = size - i34;
                            int i36 = size;
                            f32 += list.get(i35).f5582f;
                            int i37 = i35 + 1;
                            if (i37 < list.size()) {
                                float f33 = list.get(i37).f5579c;
                                int i38 = c1277b2.f5566c - 1;
                                while (true) {
                                    if (i38 < 0) {
                                        i38 = 0;
                                        break;
                                    }
                                    float f34 = f33;
                                    if (f34 == c1277b2.f5565b.get(i38).f5579c) {
                                        break;
                                    }
                                    i38--;
                                    f33 = f34;
                                }
                                i6 = i38 + 1;
                            } else {
                                i6 = 0;
                            }
                            C1277b c1277bM3165e = C1278c.m3165e(c1277b2, i36, i6, f30 - f32, i4 + i34 + 1, i3 + i34 + 1, f31);
                            float f35 = f31;
                            if (i34 == i33 - 1 && f26 > f2) {
                                c1277bM3165e = C1278c.m3166f(c1277bM3165e, f26, f35, false, f24);
                            }
                            arrayList2.add(c1277bM3165e);
                            i34++;
                            f31 = f35;
                            size = i36;
                        }
                    } else {
                        arrayList2.add(C1278c.m3165e(c1277b, 0, 0, f30 - c1277b.m3158c().f5582f, c1277b.f5566c, c1277b.f5567d, f29));
                    }
                }
            }
            this.f5550u = new C1278c(c1277b, arrayList, arrayList2);
        }
        f2 = 0.0f;
        if (i29 != -1) {
            int i39 = i31 - i29;
            float f36 = c1277b.m3157b().f5578b - (c1277b.m3157b().f5580d / f);
            if (i39 > 0 || c1277b.m3156a().f5582f <= f2) {
                i3 = i30;
                i4 = i31;
                float f37 = f27;
                float f38 = f2;
                int i40 = 0;
                while (i40 < i39) {
                    C1277b c1277b3 = (C1277b) arrayList.get(arrayList.size() - 1);
                    int i41 = i29 + i40;
                    int size4 = list.size() - 1;
                    int i42 = i39;
                    f38 += list.get(i41).f5582f;
                    int i43 = i41 - 1;
                    if (i43 >= 0) {
                        float f39 = list.get(i43).f5579c;
                        int size5 = c1277b3.f5567d;
                        while (true) {
                            List<C1277b.b> list3 = c1277b3.f5565b;
                            i7 = i29;
                            if (size5 >= list3.size()) {
                                z = true;
                                size5 = list3.size() - 1;
                                break;
                            } else if (f39 == list3.get(size5).f5579c) {
                                z = true;
                                break;
                            } else {
                                size5++;
                                i29 = i7;
                            }
                        }
                        size4 = size5 - 1;
                    } else {
                        i7 = i29;
                        z = true;
                    }
                    C1277b c1277bM3165e2 = C1278c.m3165e(c1277b3, i7, size4, f36 + f38, (i4 - i40) - 1, (i3 - i40) - 1, f37);
                    float f40 = f37;
                    if (i40 == i42 - 1 && f25 > f2) {
                        c1277bM3165e2 = C1278c.m3166f(c1277bM3165e2, f25, f40, z, f24);
                    }
                    arrayList.add(c1277bM3165e2);
                    i40++;
                    f37 = f40;
                    i29 = i7;
                    i39 = i42;
                }
            } else {
                i4 = i31;
                i3 = i30;
                arrayList.add(C1278c.m3165e(c1277b, 0, 0, f36 + c1277b.m3156a().f5582f, c1277b.f5566c, c1277b.f5567d, f27));
            }
        }
        ArrayList arrayList22 = new ArrayList();
        arrayList22.add(c1277b);
        size = list.size() - 1;
        while (true) {
            if (size >= 0) {
            }
            size--;
        }
        float f292 = !m3140P0() ? this.f4939n : this.f4940o;
        i5 = this.f4940o;
        if (m3140P0()) {
        }
        if ((c1277b.m3158c().f5580d / f) + c1277b.m3158c().f5578b > i5) {
        }
        this.f5550u = new C1278c(c1277b, arrayList, arrayList22);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m3147W0() {
        this.f5550u = null;
        m2854n0();
    }

    /* JADX INFO: renamed from: X0 */
    public final int m3148X0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        if (m2860v() == 0 || i == 0) {
            return 0;
        }
        if (this.f5550u == null) {
            m3146V0(c1181r);
        }
        int i2 = this.f5545p;
        int i3 = this.f5546q;
        int i4 = this.f5547r;
        int i5 = i2 + i;
        if (i5 < i3) {
            i = i3 - i2;
        } else if (i5 > i4) {
            i = i4 - i2;
        }
        this.f5545p = i2 + i;
        m3151a1(this.f5550u);
        float f = this.f5551v.f5564a / 2.0f;
        float fM3133H0 = m3133H0(RecyclerView.AbstractC1175l.m2827H(m2858u(0)));
        Rect rect = new Rect();
        float f2 = m3141Q0() ? this.f5551v.m3158c().f5578b : this.f5551v.m3156a().f5578b;
        float f3 = Float.MAX_VALUE;
        for (int i6 = 0; i6 < m2860v(); i6++) {
            View viewM2858u = m2858u(i6);
            float fM3129D0 = m3129D0(fM3133H0, f);
            C1275c c1275cM3127O0 = m3127O0(this.f5551v.f5565b, fM3129D0, false);
            float fM3132G0 = m3132G0(viewM2858u, fM3129D0, c1275cM3127O0);
            super.mo2863y(viewM2858u, rect);
            m3150Z0(viewM2858u, fM3129D0, c1275cM3127O0);
            this.f5554y.mo741l(viewM2858u, rect, f, fM3132G0);
            float fAbs = Math.abs(f2 - fM3132G0);
            if (fAbs < f3) {
                this.f5543B = RecyclerView.AbstractC1175l.m2827H(viewM2858u);
                f3 = fAbs;
            }
            fM3133H0 = m3129D0(fM3133H0, this.f5551v.f5564a);
        }
        m3134I0(c1181r, c1186w);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: Y */
    public final void mo2656Y(int i, int i2) {
        m3152b1();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m3149Y0(int i) {
        AbstractC0293Q2 c0275p2;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C0944z.m2225e("invalid orientation:", i));
        }
        mo2713c(null);
        AbstractC0293Q2 abstractC0293Q2 = this.f5554y;
        if (abstractC0293Q2 == null || i != abstractC0293Q2.f1077a) {
            if (i == 0) {
                c0275p2 = new C0275P2(this);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0275p2 = new C0257O2(this);
            }
            this.f5554y = c0275p2;
            m3147W0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z0 */
    public final void m3150Z0(View view, float f, C1275c c1275c) {
        if (view instanceof InterfaceC0860ua) {
            C1277b.b bVar = c1275c.f5562a;
            float f2 = bVar.f5579c;
            C1277b.b bVar2 = c1275c.f5563b;
            float fM2113b = C0888w0.m2113b(f2, bVar2.f5579c, bVar.f5577a, bVar2.f5577a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFMo732c = this.f5554y.mo732c(height, width, C0888w0.m2113b(0.0f, height / 2.0f, 0.0f, 1.0f, fM2113b), C0888w0.m2113b(0.0f, width / 2.0f, 0.0f, 1.0f, fM2113b));
            float fM3132G0 = m3132G0(view, f, c1275c);
            RectF rectF = new RectF(fM3132G0 - (rectFMo732c.width() / 2.0f), fM3132G0 - (rectFMo732c.height() / 2.0f), (rectFMo732c.width() / 2.0f) + fM3132G0, (rectFMo732c.height() / 2.0f) + fM3132G0);
            RectF rectF2 = new RectF(this.f5554y.mo735f(), this.f5554y.mo738i(), this.f5554y.mo736g(), this.f5554y.mo733d());
            this.f5549t.getClass();
            this.f5554y.mo730a(rectFMo732c, rectF, rectF2);
            this.f5554y.mo740k(rectFMo732c, rectF, rectF2);
            ((InterfaceC0860ua) view).m1989a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1185v.b
    /* JADX INFO: renamed from: a */
    public final PointF mo2710a(int i) {
        if (this.f5550u == null) {
            return null;
        }
        int iM3138M0 = m3138M0(i, m3137L0(i)) - this.f5545p;
        return m3140P0() ? new PointF(iM3138M0, 0.0f) : new PointF(0.0f, iM3138M0);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m3151a1(C1278c c1278c) {
        int i = this.f5547r;
        int i2 = this.f5546q;
        if (i <= i2) {
            this.f5551v = m3141Q0() ? c1278c.m3167a() : c1278c.m3169c();
        } else {
            this.f5551v = c1278c.m3168b(this.f5545p, i2, i);
        }
        List<C1277b.b> list = this.f5551v.f5565b;
        C1274b c1274b = this.f5548s;
        c1274b.getClass();
        c1274b.f5561b = Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: b0 */
    public final void mo2659b0(int i, int i2) {
        m3152b1();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m3152b1() {
        int iM2835B = m2835B();
        int i = this.f5542A;
        if (iM2835B == i || this.f5550u == null) {
            return;
        }
        C0937yb c0937yb = this.f5549t;
        if ((i < c0937yb.f3549c && m2835B() >= c0937yb.f3549c) || (i >= c0937yb.f3549c && m2835B() < c0937yb.f3549c)) {
            m3147W0();
        }
        this.f5542A = iM2835B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: d */
    public final boolean mo2714d() {
        return m3140P0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: d0 */
    public final void mo2662d0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        float f;
        if (c1186w.m2887b() <= 0 || m3135J0() <= 0.0f) {
            m2849i0(c1181r);
            this.f5552w = 0;
            return;
        }
        boolean zM3141Q0 = m3141Q0();
        boolean z = this.f5550u == null;
        if (z) {
            m3146V0(c1181r);
        }
        C1278c c1278c = this.f5550u;
        boolean zM3141Q02 = m3141Q0();
        C1277b c1277bM3167a = zM3141Q02 ? c1278c.m3167a() : c1278c.m3169c();
        float f2 = (zM3141Q02 ? c1277bM3167a.m3158c() : c1277bM3167a.m3156a()).f5577a;
        float f3 = c1277bM3167a.f5564a / 2.0f;
        int iMo737h = (int) (this.f5554y.mo737h() - (m3141Q0() ? f2 + f3 : f2 - f3));
        C1278c c1278c2 = this.f5550u;
        boolean zM3141Q03 = m3141Q0();
        C1277b c1277bM3169c = zM3141Q03 ? c1278c2.m3169c() : c1278c2.m3167a();
        C1277b.b bVarM3156a = zM3141Q03 ? c1277bM3169c.m3156a() : c1277bM3169c.m3158c();
        int iM2887b = (int) (((((c1186w.m2887b() - 1) * c1277bM3169c.f5564a) * (zM3141Q03 ? -1.0f : 1.0f)) - (bVarM3156a.f5577a - this.f5554y.mo737h())) + (this.f5554y.mo734e() - bVarM3156a.f5577a) + (zM3141Q03 ? -bVarM3156a.f5583g : bVarM3156a.f5584h));
        int iMin = zM3141Q03 ? Math.min(0, iM2887b) : Math.max(0, iM2887b);
        this.f5546q = zM3141Q0 ? iMin : iMo737h;
        if (zM3141Q0) {
            iMin = iMo737h;
        }
        this.f5547r = iMin;
        if (z) {
            this.f5545p = iMo737h;
            C1278c c1278c3 = this.f5550u;
            int iM2835B = m2835B();
            int i = this.f5546q;
            int i2 = this.f5547r;
            boolean zM3141Q04 = m3141Q0();
            C1277b c1277b = c1278c3.f5585a;
            HashMap map = new HashMap();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                f = c1277b.f5564a;
                if (i3 >= iM2835B) {
                    break;
                }
                int i5 = zM3141Q04 ? (iM2835B - i3) - 1 : i3;
                float f4 = i5 * f * (zM3141Q04 ? -1 : 1);
                float f5 = i2 - c1278c3.f5591g;
                List<C1277b> list = c1278c3.f5587c;
                if (f4 > f5 || i3 >= iM2835B - list.size()) {
                    map.put(Integer.valueOf(i5), list.get(C0726n9.m1667j(i4, 0, list.size() - 1)));
                    i4++;
                }
                i3++;
            }
            int i6 = 0;
            for (int i7 = iM2835B - 1; i7 >= 0; i7--) {
                int i8 = zM3141Q04 ? (iM2835B - i7) - 1 : i7;
                float f6 = i8 * f * (zM3141Q04 ? -1 : 1);
                float f7 = i + c1278c3.f5590f;
                List<C1277b> list2 = c1278c3.f5586b;
                if (f6 < f7 || i7 < list2.size()) {
                    map.put(Integer.valueOf(i8), list2.get(C0726n9.m1667j(i6, 0, list2.size() - 1)));
                    i6++;
                }
            }
            this.f5553x = map;
            int i9 = this.f5543B;
            if (i9 != -1) {
                this.f5545p = m3138M0(i9, m3137L0(i9));
            }
        }
        int i10 = this.f5545p;
        int i11 = this.f5546q;
        int i12 = this.f5547r;
        this.f5545p = (i10 < i11 ? i11 - i10 : i10 > i12 ? i12 - i10 : 0) + i10;
        this.f5552w = C0726n9.m1667j(this.f5552w, 0, c1186w.m2887b());
        m3151a1(this.f5550u);
        m2855p(c1181r);
        m3134I0(c1181r, c1186w);
        this.f5542A = m2835B();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: e */
    public final boolean mo2716e() {
        return !m3140P0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: e0 */
    public final void mo2663e0(RecyclerView.C1186w c1186w) {
        if (m2860v() == 0) {
            this.f5552w = 0;
        } else {
            this.f5552w = RecyclerView.AbstractC1175l.m2827H(m2858u(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: j */
    public final int mo2723j(RecyclerView.C1186w c1186w) {
        if (m2860v() == 0 || this.f5550u == null || m2835B() <= 1) {
            return 0;
        }
        return (int) (this.f4939n * (this.f5550u.f5585a.f5564a / mo2671l(c1186w)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: k */
    public final int mo2669k(RecyclerView.C1186w c1186w) {
        return this.f5545p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: l */
    public final int mo2671l(RecyclerView.C1186w c1186w) {
        return this.f5547r - this.f5546q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: m */
    public final int mo2724m(RecyclerView.C1186w c1186w) {
        if (m2860v() == 0 || this.f5550u == null || m2835B() <= 1) {
            return 0;
        }
        return (int) (this.f4940o * (this.f5550u.f5585a.f5564a / mo2676o(c1186w)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: m0 */
    public final boolean mo2853m0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iM3139N0;
        if (this.f5550u == null || (iM3139N0 = m3139N0(RecyclerView.AbstractC1175l.m2827H(view), m3137L0(RecyclerView.AbstractC1175l.m2827H(view)))) == 0) {
            return false;
        }
        int i = this.f5545p;
        int i2 = this.f5546q;
        int i3 = this.f5547r;
        int i4 = i + iM3139N0;
        if (i4 < i2) {
            iM3139N0 = i2 - i;
        } else if (i4 > i3) {
            iM3139N0 = i3 - i;
        }
        int iM3139N02 = m3139N0(RecyclerView.AbstractC1175l.m2827H(view), this.f5550u.m3168b(i + iM3139N0, i2, i3));
        if (m3140P0()) {
            recyclerView.scrollBy(iM3139N02, 0);
            return true;
        }
        recyclerView.scrollBy(0, iM3139N02);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: n */
    public final int mo2674n(RecyclerView.C1186w c1186w) {
        return this.f5545p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: o */
    public final int mo2676o(RecyclerView.C1186w c1186w) {
        return this.f5547r - this.f5546q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: o0 */
    public final int mo2677o0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        if (m3140P0()) {
            return m3148X0(i, c1181r, c1186w);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: p0 */
    public final void mo2725p0(int i) {
        this.f5543B = i;
        if (this.f5550u == null) {
            return;
        }
        this.f5545p = m3138M0(i, m3137L0(i));
        this.f5552w = C0726n9.m1667j(i, 0, Math.max(0, m2835B() - 1));
        m3151a1(this.f5550u);
        m2854n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: q0 */
    public final int mo2679q0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        if (mo2716e()) {
            return m3148X0(i, c1181r, c1186w);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: r */
    public final RecyclerView.C1176m mo2680r() {
        return new RecyclerView.C1176m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: y */
    public final void mo2863y(View view, Rect rect) {
        super.mo2863y(view, rect);
        float fCenterY = rect.centerY();
        if (m3140P0()) {
            fCenterY = rect.centerX();
        }
        C1275c c1275cM3127O0 = m3127O0(this.f5551v.f5565b, fCenterY, true);
        C1277b.b bVar = c1275cM3127O0.f5562a;
        float f = bVar.f5580d;
        C1277b.b bVar2 = c1275cM3127O0.f5563b;
        float fM2113b = C0888w0.m2113b(f, bVar2.f5580d, bVar.f5578b, bVar2.f5578b, fCenterY);
        float fWidth = m3140P0() ? (rect.width() - fM2113b) / 2.0f : 0.0f;
        float fHeight = m3140P0() ? 0.0f : (rect.height() - fM2113b) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: z0 */
    public final void mo1486z0(RecyclerView recyclerView, int i) {
        C0239N2 c0239n2 = new C0239N2(this, recyclerView.getContext());
        c0239n2.f4968a = i;
        m2834A0(c0239n2);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f5548s = new C1274b();
        this.f5552w = 0;
        this.f5555z = new View.OnLayoutChangeListener() { // from class: a.L2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = this.f691a;
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0221M2(0, carouselLayoutManager));
            }
        };
        this.f5543B = -1;
        this.f5544C = 0;
        this.f5549t = new C0937yb();
        m3147W0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.Carousel);
            this.f5544C = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.Carousel_carousel_alignment, 0);
            m3147W0();
            m3149Y0(typedArrayObtainStyledAttributes.getInt(C1247R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
