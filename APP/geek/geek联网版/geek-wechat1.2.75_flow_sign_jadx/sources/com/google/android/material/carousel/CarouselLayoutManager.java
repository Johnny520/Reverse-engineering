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
import p000.AbstractC0168dz;
import p000.AbstractC0799uz;
import p000.C0010a9;
import p000.C0836vz;
import p000.C0893xh;
import p000.C0921y8;
import p000.C0958z8;
import p000.a00;
import p000.e00;
import p000.f00;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0799uz implements e00 {

    /* JADX INFO: renamed from: p */
    public C0010a9 f1021p;

    /* JADX INFO: renamed from: q */
    public final View.OnLayoutChangeListener f1022q;

    public CarouselLayoutManager() {
        new C0893xh(29);
        new C0958z8();
        this.f1022q = new View.OnLayoutChangeListener() { // from class: w8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0884x8(0, this.f5072a));
            }
        };
        m2519j0();
        m701A0(0);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m701A0(int i) {
        C0010a9 c0010a9;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo338c(null);
        C0010a9 c0010a92 = this.f1021p;
        if (c0010a92 == null || i != c0010a92.f52a) {
            if (i == 0) {
                c0010a9 = new C0010a9(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0010a9 = new C0010a9(this, 0);
            }
            this.f1021p = c0010a9;
            m2519j0();
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: O */
    public final void mo702O(RecyclerView recyclerView) {
        m2519j0();
        recyclerView.addOnLayoutChangeListener(this.f1022q);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: P */
    public final void mo324P(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1022q);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo274Q(android.view.View r4, int r5, p000.a00 r6, p000.f00 r7) {
        /*
            r3 = this;
            int r6 = r3.m2528v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            a9 r6 = r3.f1021p
            int r6 = r6.f52a
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
            boolean r5 = r3.m706z0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.m706z0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = p000.AbstractC0799uz.m2501F(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.m2526u(r6)
            int r4 = p000.AbstractC0799uz.m2501F(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.m2530z()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            a9 r4 = r3.f1021p
            r4.m34a()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.m706z0()
            if (r4 == 0) goto L86
            int r4 = r3.m2528v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.m2526u(r6)
            return r4
        L8b:
            int r4 = p000.AbstractC0799uz.m2501F(r4)
            int r5 = r3.m2530z()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.m2528v()
            int r4 = r4 - r1
            android.view.View r4 = r3.m2526u(r4)
            int r4 = p000.AbstractC0799uz.m2501F(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.m2530z()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            a9 r4 = r3.f1021p
            r4.m34a()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.m706z0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.m2528v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.m2526u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.mo274Q(android.view.View, int, a00, f00):android.view.View");
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: R */
    public final void mo327R(AccessibilityEvent accessibilityEvent) {
        super.mo327R(accessibilityEvent);
        if (m2528v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0799uz.m2501F(m2526u(0)));
            accessibilityEvent.setToIndex(AbstractC0799uz.m2501F(m2526u(m2528v() - 1)));
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: U */
    public final void mo278U(int i, int i2) {
        m2530z();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: X */
    public final void mo281X(int i, int i2) {
        m2530z();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: Z */
    public final void mo284Z(a00 a00Var, f00 f00Var) {
        if (f00Var.m1068b() > 0) {
            if ((m705y0() ? this.f4868n : this.f4869o) > 0.0f) {
                m706z0();
                View view = a00Var.m11i(0, Long.MAX_VALUE).f2296a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m2515e0(a00Var);
    }

    @Override // p000.e00
    /* JADX INFO: renamed from: a */
    public final PointF mo334a(int i) {
        return null;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: a0 */
    public final void mo285a0(f00 f00Var) {
        if (m2528v() == 0) {
            return;
        }
        AbstractC0799uz.m2501F(m2526u(0));
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: d */
    public final boolean mo340d() {
        return m705y0();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: e */
    public final boolean mo341e() {
        return !m705y0();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: i0 */
    public final boolean mo703i0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: j */
    public final int mo344j(f00 f00Var) {
        m2528v();
        return 0;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: k */
    public final int mo295k(f00 f00Var) {
        return 0;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: k0 */
    public final int mo296k0(int i, a00 a00Var, f00 f00Var) {
        if (!m705y0() || m2528v() == 0 || i == 0) {
            return 0;
        }
        View view = a00Var.m11i(0, Long.MAX_VALUE).f2296a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: l */
    public final int mo298l(f00 f00Var) {
        return 0;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: m */
    public final int mo346m(f00 f00Var) {
        m2528v();
        return 0;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: m0 */
    public final int mo299m0(int i, a00 a00Var, f00 f00Var) {
        if (!mo341e() || m2528v() == 0 || i == 0) {
            return 0;
        }
        View view = a00Var.m11i(0, Long.MAX_VALUE).f2296a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: n */
    public final int mo300n(f00 f00Var) {
        return 0;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: o */
    public final int mo301o(f00 f00Var) {
        return 0;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: r */
    public final C0836vz mo303r() {
        return new C0836vz(-2, -2);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: v0 */
    public final void mo349v0(RecyclerView recyclerView, int i) {
        C0921y8 c0921y8 = new C0921y8(this, recyclerView.getContext());
        c0921y8.f1236a = i;
        m2529w0(c0921y8);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: y */
    public final void mo704y(View view, Rect rect) {
        super.mo704y(view, rect);
        rect.centerY();
        if (m705y0()) {
            rect.centerX();
        }
        throw null;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m705y0() {
        return this.f1021p.f52a == 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m706z0() {
        return m705y0() && m2507A() == 1;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0958z8();
        this.f1022q = new View.OnLayoutChangeListener() { // from class: w8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0884x8(0, this.f5072a));
            }
        };
        new C0893xh(29);
        m2519j0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1439b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m2519j0();
            m701A0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: l0 */
    public final void mo345l0(int i) {
    }
}
