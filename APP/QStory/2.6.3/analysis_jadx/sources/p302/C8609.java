package p302;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.core.view.C2266;
import com.android.dx.io.Opcodes;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.focus.FocusRingDrawable;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p018.AbstractC6253;
import p034.AbstractC6347;
import p182.AbstractC7761;
import p186.AbstractC7770;
import p186.C7771;
import p305.C8624;
import p305.C8636;
import p305.C8639;
import p305.C8640;
import p305.C8643;
import p305.InterfaceC8635;
import p317.AbstractC8672;

/* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8609 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final ColorDrawable f24149;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final double f24150 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f24152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f24153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8643 f24154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8643 f24155;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8611 f24157;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f24158;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f24160;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f24161;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ValueAnimator f24162;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final TimeInterpolator f24163;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC8635 f24164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ColorStateList f24165;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public LayerDrawable f24166;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C8643 f24167;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ColorStateList f24168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public RippleDrawable f24169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f24170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f24171;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Drawable f24172;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ColorStateList f24173;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f24174;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Drawable f24175;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Rect f24156 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f24159 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f24151 = 0.0f;

    static {
        f24149 = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C8609(AbstractC8611 abstractC8611, AttributeSet attributeSet) {
        this.f24153 = -1.0f;
        this.f24157 = abstractC8611;
        TypedArray typedArrayObtainStyledAttributes = abstractC8611.getContext().obtainStyledAttributes(attributeSet, AbstractC7761.f21050, R.attr.materialCardViewStyle, R.style.CardView);
        C8643 c8643 = new C8643(abstractC8611.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f24155 = c8643;
        c8643.m14338(abstractC8611.getContext());
        c8643.m14332();
        C8639 c8639M14323 = c8643.m14348().m14323();
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            this.f24153 = dimension;
            c8639M14323.m14318(dimension);
        }
        this.f24154 = new C8643();
        m14281(c8639M14323.m14319());
        this.f24163 = AbstractC6347.m11923(abstractC8611.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC8672.f24468);
        this.f24160 = AbstractC6347.m11922(abstractC8611.getContext(), R.attr.motionDurationShort2, 300);
        this.f24161 = AbstractC6347.m11922(abstractC8611.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static float m14274(AbstractC6253 abstractC6253, float f) {
        if (abstractC6253 instanceof C8636) {
            return (float) ((1.0d - f24150) * ((double) f));
        }
        if (abstractC6253 instanceof C8624) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14275(boolean z, boolean z2) {
        Drawable drawable = this.f24172;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? Opcodes.CONST_METHOD_TYPE : 0);
                this.f24151 = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = this.f24151;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.f24162;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f24162 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f24151, f);
            this.f24162 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C2266(this, 2));
            this.f24162.setInterpolator(this.f24163);
            this.f24162.setDuration((long) ((z ? this.f24160 : this.f24161) * f2));
            this.f24162.start();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14276(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f24166 != null) {
            AbstractC8611 abstractC8611 = this.f24157;
            if (abstractC8611.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((abstractC8611.getMaxCardElevation() * 1.5f) + (m14285() ? m14279() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((abstractC8611.getMaxCardElevation() + (m14285() ? m14279() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.f24170;
            boolean z = (i5 & 8388613) == 8388613;
            int i6 = this.f24152;
            int i7 = z ? ((i - i6) - this.f24171) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.f24171) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.f24171) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.f24171) - iCeil;
            }
            int i10 = i6;
            if (abstractC8611.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.f24166.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8610 m14277(Drawable drawable) {
        int iCeil;
        int i;
        if (this.f24157.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (m14285() ? m14279() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (m14285() ? m14279() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new C8610(drawable, iCeil, i, iCeil, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LayerDrawable m14278() {
        if (this.f24169 == null) {
            this.f24167 = new C8643(this.f24164);
            this.f24169 = new RippleDrawable(this.f24173, null, this.f24167);
        }
        if (this.f24166 == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f24169, this.f24154, this.f24172});
            FocusRingDrawable.m7149(this.f24157.getContext(), layerDrawable, this.f24167);
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
            this.f24166 = layerDrawable;
        }
        return this.f24166;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m14279() {
        float fMax = 0.0f;
        for (C8640 c8640 : this.f24164.mo14293()) {
            if (c8640 != null) {
                AbstractC6253 abstractC6253 = c8640.f24271;
                C8643 c8643 = this.f24155;
                float fM14274 = m14274(abstractC6253, c8643.m14346());
                AbstractC6253 abstractC62532 = c8640.f24270;
                float[] fArr = c8643.f24298;
                float fMax2 = Math.max(fM14274, m14274(abstractC62532, fArr != null ? fArr[0] : c8643.f24324.f24283.mo14292().f24266.mo14312(c8643.m14345())));
                AbstractC6253 abstractC62533 = c8640.f24269;
                float[] fArr2 = c8643.f24298;
                float fM142742 = m14274(abstractC62533, fArr2 != null ? fArr2[1] : c8643.f24324.f24283.mo14292().f24273.mo14312(c8643.m14345()));
                AbstractC6253 abstractC62534 = c8640.f24268;
                float[] fArr3 = c8643.f24298;
                fMax = Math.max(fMax, Math.max(fMax2, Math.max(fM142742, m14274(abstractC62534, fArr3 != null ? fArr3[2] : c8643.f24324.f24283.mo14292().f24272.mo14312(c8643.m14345())))));
            }
        }
        return fMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14280() {
        boolean z = this.f24159;
        AbstractC8611 abstractC8611 = this.f24157;
        if (!z) {
            abstractC8611.setBackgroundInternal(m14277(this.f24155));
        }
        abstractC8611.setForeground(m14277(this.f24175));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14281(InterfaceC8635 interfaceC8635) {
        this.f24164 = interfaceC8635;
        C8643 c8643 = this.f24155;
        c8643.m14336(interfaceC8635);
        this.f24154.m14336(interfaceC8635);
        C8643 c86432 = this.f24167;
        if (c86432 != null) {
            c86432.m14336(interfaceC8635);
        }
        c8643.f24302 = !c8643.m14342();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14282(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f24172 = drawableMutate;
            drawableMutate.setTintList(this.f24165);
            m14275(this.f24157.f24182, false);
        } else {
            this.f24172 = f24149;
        }
        LayerDrawable layerDrawable = this.f24166;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f24172);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14283() {
        Drawable drawable = this.f24175;
        Drawable drawableM14278 = m14286() ? m14278() : this.f24154;
        this.f24175 = drawableM14278;
        if (drawable != drawableM14278) {
            AbstractC8611 abstractC8611 = this.f24157;
            if (abstractC8611.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) abstractC8611.getForeground()).setDrawable(drawableM14278);
            } else {
                abstractC8611.setForeground(m14277(drawableM14278));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14284() {
        AbstractC8611 abstractC8611 = this.f24157;
        float cardViewRadius = 0.0f;
        float fM14279 = ((!abstractC8611.getPreventCornerOverlap() || this.f24155.m14342()) && !m14285()) ? 0.0f : m14279();
        if (abstractC8611.getPreventCornerOverlap() && abstractC8611.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f24150) * ((double) abstractC8611.getCardViewRadius()));
        }
        int i = (int) (fM14279 - cardViewRadius);
        Rect rect = this.f24156;
        abstractC8611.f872.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        C4871 c4871 = abstractC8611.f869;
        if (!((CardView) c4871.f14165).getUseCompatPadding()) {
            c4871.m9752(0, 0, 0, 0);
            return;
        }
        C7771 c7771 = (C7771) c4871.f14164;
        float f = c7771.f21069;
        float f2 = c7771.f21073;
        int iCeil = (int) Math.ceil(AbstractC7770.m13120(f, f2, r0.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC7770.m13119(f, f2, r0.getPreventCornerOverlap()));
        c4871.m9752(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m14285() {
        AbstractC8611 abstractC8611 = this.f24157;
        return abstractC8611.getPreventCornerOverlap() && this.f24155.m14342() && abstractC8611.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m14286() {
        View view = this.f24157;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }
}
