package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import p000.AbstractC0540nz;
import p000.AbstractC0873wy;
import p000.C0513n8;
import p000.C0550o8;
import p000.C0577oz;
import p000.C0588p8;
import p000.C0763tz;
import p000.C0819vh;
import p000.C0948yz;
import p000.InterfaceC0911xz;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0540nz implements InterfaceC0911xz {

    /* JADX INFO: renamed from: p */
    public C0588p8 f1096p;

    /* JADX INFO: renamed from: q */
    public final View.OnLayoutChangeListener f1097q;

    public CarouselLayoutManager() {
        new C0819vh(27);
        new C0550o8();
        this.f1097q = new View.OnLayoutChangeListener() { // from class: m8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0581p1(1, this.f3156a));
            }
        };
        m1971j0();
        m743A0(0);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m743A0(int i) {
        C0588p8 c0588p8;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo353c(null);
        C0588p8 c0588p82 = this.f1096p;
        if (c0588p82 == null || i != c0588p82.f3680a) {
            if (i == 0) {
                c0588p8 = new C0588p8(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0588p8 = new C0588p8(this, 0);
            }
            this.f1096p = c0588p8;
            m1971j0();
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: O */
    public final void mo744O(RecyclerView recyclerView) {
        m1971j0();
        recyclerView.addOnLayoutChangeListener(this.f1097q);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: P */
    public final void mo339P(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1097q);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo289Q(android.view.View r4, int r5, p000.C0763tz r6, p000.C0948yz r7) {
        /*
            r3 = this;
            int r6 = r3.m1980v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            p8 r6 = r3.f1096p
            int r6 = r6.f3680a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.m748z0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.m748z0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = p000.AbstractC0540nz.m1953F(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.m1978u(r6)
            int r4 = p000.AbstractC0540nz.m1953F(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.m1982z()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            p8 r4 = r3.f1096p
            r4.m2067a()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.m748z0()
            if (r4 == 0) goto L86
            int r4 = r3.m1980v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.m1978u(r6)
            return r4
        L8b:
            int r4 = p000.AbstractC0540nz.m1953F(r4)
            int r5 = r3.m1982z()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.m1980v()
            int r4 = r4 - r1
            android.view.View r4 = r3.m1978u(r4)
            int r4 = p000.AbstractC0540nz.m1953F(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.m1982z()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            p8 r4 = r3.f1096p
            r4.m2067a()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.m748z0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.m1980v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.m1978u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.mo289Q(android.view.View, int, tz, yz):android.view.View");
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: R */
    public final void mo342R(AccessibilityEvent accessibilityEvent) {
        super.mo342R(accessibilityEvent);
        if (m1980v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0540nz.m1953F(m1978u(0)));
            accessibilityEvent.setToIndex(AbstractC0540nz.m1953F(m1978u(m1980v() - 1)));
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: U */
    public final void mo293U(int i, int i2) {
        m1982z();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: X */
    public final void mo296X(int i, int i2) {
        m1982z();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: Z */
    public final void mo299Z(C0763tz c0763tz, C0948yz c0948yz) {
        if (c0948yz.m2745b() > 0) {
            if ((m747y0() ? this.f3468n : this.f3469o) > 0.0f) {
                m748z0();
                View view = c0763tz.m2401i(0, Long.MAX_VALUE).f697a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m1967e0(c0763tz);
    }

    @Override // p000.InterfaceC0911xz
    /* JADX INFO: renamed from: a */
    public final PointF mo349a(int i) {
        return null;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: a0 */
    public final void mo300a0(C0948yz c0948yz) {
        if (m1980v() == 0) {
            return;
        }
        AbstractC0540nz.m1953F(m1978u(0));
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: d */
    public final boolean mo355d() {
        return m747y0();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: e */
    public final boolean mo356e() {
        return !m747y0();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: i0 */
    public final boolean mo745i0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: j */
    public final int mo359j(C0948yz c0948yz) {
        m1980v();
        return 0;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: k */
    public final int mo310k(C0948yz c0948yz) {
        return 0;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: k0 */
    public final int mo311k0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        if (!m747y0() || m1980v() == 0 || i == 0) {
            return 0;
        }
        View view = c0763tz.m2401i(0, Long.MAX_VALUE).f697a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: l */
    public final int mo313l(C0948yz c0948yz) {
        return 0;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: m */
    public final int mo361m(C0948yz c0948yz) {
        m1980v();
        return 0;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: m0 */
    public final int mo314m0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        if (!mo356e() || m1980v() == 0 || i == 0) {
            return 0;
        }
        View view = c0763tz.m2401i(0, Long.MAX_VALUE).f697a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: n */
    public final int mo315n(C0948yz c0948yz) {
        return 0;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: o */
    public final int mo316o(C0948yz c0948yz) {
        return 0;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: r */
    public final C0577oz mo318r() {
        return new C0577oz(-2, -2);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: v0 */
    public final void mo364v0(RecyclerView recyclerView, int i) {
        C0513n8 c0513n8 = new C0513n8(this, recyclerView.getContext());
        c0513n8.f5379a = i;
        m1981w0(c0513n8);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: y */
    public final void mo746y(View view, Rect rect) {
        super.mo746y(view, rect);
        rect.centerY();
        if (m747y0()) {
            rect.centerX();
        }
        throw null;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m747y0() {
        return this.f1096p.f3680a == 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m748z0() {
        return m747y0() && m1959A() == 1;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0550o8();
        this.f1097q = new View.OnLayoutChangeListener() { // from class: m8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0581p1(1, this.f3156a));
            }
        };
        new C0819vh(27);
        m1971j0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5043b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m1971j0();
            m743A0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: l0 */
    public final void mo360l0(int i) {
    }
}
