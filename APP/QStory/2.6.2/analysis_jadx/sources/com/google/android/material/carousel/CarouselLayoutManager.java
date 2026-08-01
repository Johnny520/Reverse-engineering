package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.animation.C0386;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.C2518;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.C2531;
import androidx.recyclerview.widget.InterfaceC2522;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.R;
import p007.AbstractC6136;
import p314.AbstractC8669;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC2519 implements InterfaceC2522 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final View.OnLayoutChangeListener f10170;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C3102 f10171;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0386 f10172;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C3103();
        this.f10170 = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.飘花落叶言子楪世苏哲兰
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new RunnableC1107(this.f10179, 4));
            }
        };
        this.f10172 = new C0386(2);
        m4991();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8669.f24436);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m4991();
            m7094(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo4985(Rect rect, View view) {
        RecyclerView.m4680(rect, view);
        rect.centerY();
        if (m7091()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C2518 mo4591() {
        return new C2518(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo4592(C2525 c2525) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo4593(C2525 c2525) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int mo4635(C2525 c2525) {
        m4987();
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final boolean m7091() {
        return this.f10171.f10175 == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final float m7092(float f, float f2) {
        return m7093() ? f - f2 : f + f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final boolean m7093() {
        return m7091() && this.f7591.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m7094(int i) {
        C3102 c3102;
        if (i != 0 && i != 1) {
            C5919.m11249(AbstractC6136.m11556(i, "invalid orientation:"));
            return;
        }
        mo4664(null);
        C3102 c31022 = this.f10171;
        if (c31022 == null || i != c31022.f10175) {
            if (i == 0) {
                c3102 = new C3102(this, 1);
            } else {
                if (i != 1) {
                    C5919.m11249("invalid orientation");
                    return;
                }
                c3102 = new C3102(this, 0);
            }
            this.f10171 = c3102;
            m4991();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final int mo4601(int i, C2531 c2531, C2525 c2525) {
        if (!m7091() || m4987() == 0 || i == 0) {
            return 0;
        }
        mo5009(c2531.m5021(0));
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo4992(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final void mo4657(RecyclerView recyclerView, int i) {
        C3104 c3104 = new C3104(this, recyclerView.getContext());
        c3104.f7316 = i;
        m4995(c3104);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo4605(int i, C2531 c2531, C2525 c2525) {
        if (!mo4665() || m4987() == 0 || i == 0) {
            return 0;
        }
        mo5009(c2531.m5021(0));
        throw null;
    }

    @Override // androidx.recyclerview.widget.InterfaceC2522
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final PointF mo4660(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo4606(C2525 c2525) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo4607(C2525 c2525) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo4663(C2525 c2525) {
        m4987();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo4665() {
        return !m7091();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo4666() {
        return m7091();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo4667(AccessibilityEvent accessibilityEvent) {
        super.mo4667(accessibilityEvent);
        if (m4987() > 0) {
            accessibilityEvent.setFromIndex(AbstractC2519.m4973(m4988(0)));
            accessibilityEvent.setToIndex(AbstractC2519.m4973(m4988(m4987() - 1)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo4609(android.view.View r5, int r6, androidx.recyclerview.widget.C2531 r7, androidx.recyclerview.widget.C2525 r8) {
        /*
            r4 = this;
            int r7 = r4.m4987()
            r8 = 0
            if (r7 != 0) goto L9
            goto L96
        L9:
            com.google.android.material.carousel.飘花落叶言子楪世哲兰苏 r7 = r4.f10171
            int r7 = r7.f10175
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L47
            r3 = 2
            if (r6 == r3) goto L3d
            r3 = 17
            if (r6 == r3) goto L4c
            r3 = 33
            if (r6 == r3) goto L49
            r3 = 66
            if (r6 == r3) goto L3f
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L39:
            r6 = r0
            goto L55
        L3b:
            if (r7 != r2) goto L39
        L3d:
            r6 = r2
            goto L55
        L3f:
            if (r7 != 0) goto L39
            boolean r6 = r4.m7093()
            if (r6 == 0) goto L3d
        L47:
            r6 = r1
            goto L55
        L49:
            if (r7 != r2) goto L39
            goto L47
        L4c:
            if (r7 != 0) goto L39
            boolean r6 = r4.m7093()
            if (r6 == 0) goto L47
            goto L3d
        L55:
            if (r6 != r0) goto L58
            goto L96
        L58:
            r7 = 0
            if (r6 != r1) goto L8b
            int r5 = androidx.recyclerview.widget.AbstractC2519.m4973(r5)
            if (r5 != 0) goto L62
            goto L96
        L62:
            android.view.View r5 = r4.m4988(r7)
            int r5 = androidx.recyclerview.widget.AbstractC2519.m4973(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L7a
            int r6 = r4.m4984()
            if (r5 < r6) goto L74
            goto L7a
        L74:
            com.google.android.material.carousel.飘花落叶言子楪世哲兰苏 r4 = r4.f10171
            r4.m7095()
            throw r8
        L7a:
            boolean r5 = r4.m7093()
            if (r5 == 0) goto L86
            int r5 = r4.m4987()
            int r7 = r5 + (-1)
        L86:
            android.view.View r4 = r4.m4988(r7)
            return r4
        L8b:
            int r5 = androidx.recyclerview.widget.AbstractC2519.m4973(r5)
            int r6 = r4.m4984()
            int r6 = r6 - r2
            if (r5 != r6) goto L97
        L96:
            return r8
        L97:
            int r5 = r4.m4987()
            int r5 = r5 - r2
            android.view.View r5 = r4.m4988(r5)
            int r5 = androidx.recyclerview.widget.AbstractC2519.m4973(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb4
            int r6 = r4.m4984()
            if (r5 < r6) goto Lae
            goto Lb4
        Lae:
            com.google.android.material.carousel.飘花落叶言子楪世哲兰苏 r4 = r4.f10171
            r4.m7095()
            throw r8
        Lb4:
            boolean r5 = r4.m7093()
            if (r5 == 0) goto Lbb
            goto Lc1
        Lbb:
            int r5 = r4.m4987()
            int r7 = r5 + (-1)
        Lc1:
            android.view.View r4 = r4.m4988(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.mo4609(android.view.View, int, androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世, androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世):android.view.View");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo4668(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f10170);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo5006(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C0386 c0386 = this.f10172;
        float dimension = c0386.f1298;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0386.f1298 = dimension;
        float dimension2 = c0386.f1297;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0386.f1297 = dimension2;
        m4991();
        recyclerView.addOnLayoutChangeListener(this.f10170);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo4610(C2531 c2531, C2525 c2525) {
        if (c2525.m5015() > 0) {
            if ((m7091() ? this.f7580 : this.f7579) > 0.0f) {
                m7093();
                mo5009(c2531.m5021(0));
                throw null;
            }
        }
        m4997(c2531);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo4612(C2525 c2525) {
        if (m4987() == 0) {
            return;
        }
        AbstractC2519.m4973(m4988(0));
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo4613(int i, int i2) {
        m4984();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final void mo4614(int i, int i2) {
        m4984();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final void mo4617() {
        m4984();
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo4671() {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final void mo5009(View view) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo4656(int i) {
    }

    public CarouselLayoutManager() {
        C0386 c0386 = new C0386(2);
        new C3103();
        this.f10170 = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.飘花落叶言子楪世苏哲兰
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new RunnableC1107(this.f10179, 4));
            }
        };
        this.f10172 = c0386;
        m4991();
        m7094(0);
    }
}
