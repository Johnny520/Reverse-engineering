package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.animation.C1232;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.C3351;
import androidx.recyclerview.widget.C3358;
import androidx.recyclerview.widget.C3364;
import androidx.recyclerview.widget.InterfaceC3355;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.C0328R;
import p025.AbstractC7012;
import p330.AbstractC9490;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC3352 implements InterfaceC3355 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final View.OnLayoutChangeListener f10520;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C3935 f10521;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C1232 f10522;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C3936();
        this.f10520 = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.飘花落叶言子楪世苏哲兰
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new RunnableC1945(this.f10529, 4));
            }
        };
        this.f10522 = new C1232(2);
        m5561();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9490.f24772);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m5561();
            m7640(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo5555(Rect rect, View view) {
        RecyclerView.m5250(rect, view);
        rect.centerY();
        if (m7637()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C3351 mo5161() {
        return new C3351(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo5162(C3358 c3358) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo5163(C3358 c3358) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int mo5205(C3358 c3358) {
        m5557();
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final boolean m7637() {
        return this.f10521.f10525 == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final float m7638(float f, float f2) {
        return m7639() ? f - f2 : f + f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final boolean m7639() {
        return m7637() && this.f7937.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m7640(int i) {
        C3935 c3935;
        if (i != 0 && i != 1) {
            C6755.m11869(AbstractC7012.m12147(i, "invalid orientation:"));
            return;
        }
        mo5234(null);
        C3935 c39352 = this.f10521;
        if (c39352 == null || i != c39352.f10525) {
            if (i == 0) {
                c3935 = new C3935(this, 1);
            } else {
                if (i != 1) {
                    C6755.m11869("invalid orientation");
                    return;
                }
                c3935 = new C3935(this, 0);
            }
            this.f10521 = c3935;
            m5561();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final int mo5171(int i, C3364 c3364, C3358 c3358) {
        if (!m7637() || m5557() == 0 || i == 0) {
            return 0;
        }
        mo5579(c3364.m5591(0));
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo5562(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final void mo5227(RecyclerView recyclerView, int i) {
        C3937 c3937 = new C3937(this, recyclerView.getContext());
        c3937.f7662 = i;
        m5565(c3937);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo5175(int i, C3364 c3364, C3358 c3358) {
        if (!mo5235() || m5557() == 0 || i == 0) {
            return 0;
        }
        mo5579(c3364.m5591(0));
        throw null;
    }

    @Override // androidx.recyclerview.widget.InterfaceC3355
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final PointF mo5230(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo5176(C3358 c3358) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo5177(C3358 c3358) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo5233(C3358 c3358) {
        m5557();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo5235() {
        return !m7637();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo5236() {
        return m7637();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo5237(AccessibilityEvent accessibilityEvent) {
        super.mo5237(accessibilityEvent);
        if (m5557() > 0) {
            accessibilityEvent.setFromIndex(AbstractC3352.m5543(m5558(0)));
            accessibilityEvent.setToIndex(AbstractC3352.m5543(m5558(m5557() - 1)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo5179(View view, int i, C3364 c3364, C3358 c3358) {
        byte b;
        if (m5557() != 0) {
            int i2 = this.f10521.f10525;
            if (i == 1) {
                b = -1;
                if (b != -2147483648) {
                    if (b == -1) {
                        if (AbstractC3352.m5543(view) != 0) {
                            int iM5543 = AbstractC3352.m5543(m5558(0)) - 1;
                            if (iM5543 < 0 || iM5543 >= m5554()) {
                                return m5558(m7639() ? m5557() - 1 : 0);
                            }
                            this.f10521.m7641();
                            throw null;
                        }
                    } else if (AbstractC3352.m5543(view) != m5554() - 1) {
                        int iM55432 = AbstractC3352.m5543(m5558(m5557() - 1)) + 1;
                        if (iM55432 < 0 || iM55432 >= m5554()) {
                            return m5558(m7639() ? 0 : m5557() - 1);
                        }
                        this.f10521.m7641();
                        throw null;
                    }
                }
            } else if (i == 2) {
                b = 1;
                if (b != -2147483648) {
                }
            } else {
                if (i == 17) {
                    if (i2 == 0) {
                        if (m7639()) {
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
                            if (m7639()) {
                            }
                        }
                        b = -2147483648;
                    }
                } else if (i2 != 1) {
                    b = -2147483648;
                }
                if (b != -2147483648) {
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo5238(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f10520);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo5576(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C1232 c1232 = this.f10522;
        float dimension = c1232.f1643;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(C0328R.dimen.m3_carousel_small_item_size_min);
        }
        c1232.f1643 = dimension;
        float dimension2 = c1232.f1642;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(C0328R.dimen.m3_carousel_small_item_size_max);
        }
        c1232.f1642 = dimension2;
        m5561();
        recyclerView.addOnLayoutChangeListener(this.f10520);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo5180(C3364 c3364, C3358 c3358) {
        if (c3358.m5585() > 0) {
            if ((m7637() ? this.f7926 : this.f7925) > 0.0f) {
                m7639();
                mo5579(c3364.m5591(0));
                throw null;
            }
        }
        m5567(c3364);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo5182(C3358 c3358) {
        if (m5557() == 0) {
            return;
        }
        AbstractC3352.m5543(m5558(0));
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo5183(int i, int i2) {
        m5554();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final void mo5184(int i, int i2) {
        m5554();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final void mo5187() {
        m5554();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo5241() {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final void mo5579(View view) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo5226(int i) {
    }

    public CarouselLayoutManager() {
        C1232 c1232 = new C1232(2);
        new C3936();
        this.f10520 = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.飘花落叶言子楪世苏哲兰
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new RunnableC1945(this.f10529, 4));
            }
        };
        this.f10522 = c1232;
        m5561();
        m7640(0);
    }
}
