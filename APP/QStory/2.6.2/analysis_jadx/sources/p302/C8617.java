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
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p033.AbstractC6325;
import p175.AbstractC7738;
import p182.AbstractC7760;
import p186.AbstractC7769;
import p186.C7770;
import p305.C8632;
import p305.C8644;
import p305.C8647;
import p305.C8648;
import p305.C8651;
import p305.InterfaceC8643;
import p317.AbstractC8680;

/* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8617 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final ColorDrawable f24158;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final double f24159 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f24161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f24162;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8651 f24163;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8651 f24164;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8619 f24166;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f24167;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f24169;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f24170;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ValueAnimator f24171;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final TimeInterpolator f24172;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC8643 f24173;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ColorStateList f24174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public LayerDrawable f24175;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C8651 f24176;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ColorStateList f24177;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public RippleDrawable f24178;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f24179;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f24180;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Drawable f24181;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ColorStateList f24182;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f24183;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Drawable f24184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Rect f24165 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f24168 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f24160 = 0.0f;

    static {
        f24158 = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C8617(AbstractC8619 abstractC8619, AttributeSet attributeSet) {
        this.f24162 = -1.0f;
        this.f24166 = abstractC8619;
        TypedArray typedArrayObtainStyledAttributes = abstractC8619.getContext().obtainStyledAttributes(attributeSet, AbstractC7760.f21053, R.attr.materialCardViewStyle, R.style.CardView);
        C8651 c8651 = new C8651(abstractC8619.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f24164 = c8651;
        c8651.m14320(abstractC8619.getContext());
        c8651.m14314();
        C8647 c8647M14305 = c8651.m14330().m14305();
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            this.f24162 = dimension;
            c8647M14305.m14300(dimension);
        }
        this.f24163 = new C8651();
        m14262(c8647M14305.m14301());
        this.f24172 = AbstractC7738.m13027(abstractC8619.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC8680.f24476);
        this.f24169 = AbstractC7738.m13024(abstractC8619.getContext(), R.attr.motionDurationShort2, 300);
        this.f24170 = AbstractC7738.m13024(abstractC8619.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static float m14255(AbstractC6325 abstractC6325, float f) {
        if (abstractC6325 instanceof C8644) {
            return (float) ((1.0d - f24159) * ((double) f));
        }
        if (abstractC6325 instanceof C8632) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14256(boolean z, boolean z2) {
        Drawable drawable = this.f24181;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? Opcodes.CONST_METHOD_TYPE : 0);
                this.f24160 = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = this.f24160;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.f24171;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f24171 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f24160, f);
            this.f24171 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C2266(this, 2));
            this.f24171.setInterpolator(this.f24172);
            this.f24171.setDuration((long) ((z ? this.f24169 : this.f24170) * f2));
            this.f24171.start();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14257(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f24175 != null) {
            AbstractC8619 abstractC8619 = this.f24166;
            if (abstractC8619.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((abstractC8619.getMaxCardElevation() * 1.5f) + (m14266() ? m14260() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((abstractC8619.getMaxCardElevation() + (m14266() ? m14260() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.f24179;
            boolean z = (i5 & 8388613) == 8388613;
            int i6 = this.f24161;
            int i7 = z ? ((i - i6) - this.f24180) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.f24180) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.f24180) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.f24180) - iCeil;
            }
            int i10 = i6;
            if (abstractC8619.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.f24175.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8618 m14258(Drawable drawable) {
        int iCeil;
        int i;
        if (this.f24166.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (m14266() ? m14260() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (m14266() ? m14260() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new C8618(drawable, iCeil, i, iCeil, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LayerDrawable m14259() {
        if (this.f24178 == null) {
            this.f24176 = new C8651(this.f24173);
            this.f24178 = new RippleDrawable(this.f24182, null, this.f24176);
        }
        if (this.f24175 == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f24178, this.f24163, this.f24181});
            FocusRingDrawable.m7162(this.f24166.getContext(), layerDrawable, this.f24176);
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
            this.f24175 = layerDrawable;
        }
        return this.f24175;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m14260() {
        float fMax = 0.0f;
        for (C8648 c8648 : this.f24173.mo14274()) {
            if (c8648 != null) {
                AbstractC6325 abstractC6325 = c8648.f24280;
                C8651 c8651 = this.f24164;
                float fM14255 = m14255(abstractC6325, c8651.m14328());
                AbstractC6325 abstractC63252 = c8648.f24279;
                float[] fArr = c8651.f24307;
                float fMax2 = Math.max(fM14255, m14255(abstractC63252, fArr != null ? fArr[0] : c8651.f24333.f24292.mo14273().f24275.mo14294(c8651.m14327())));
                AbstractC6325 abstractC63253 = c8648.f24278;
                float[] fArr2 = c8651.f24307;
                float fM142552 = m14255(abstractC63253, fArr2 != null ? fArr2[1] : c8651.f24333.f24292.mo14273().f24282.mo14294(c8651.m14327()));
                AbstractC6325 abstractC63254 = c8648.f24277;
                float[] fArr3 = c8651.f24307;
                fMax = Math.max(fMax, Math.max(fMax2, Math.max(fM142552, m14255(abstractC63254, fArr3 != null ? fArr3[2] : c8651.f24333.f24292.mo14273().f24281.mo14294(c8651.m14327())))));
            }
        }
        return fMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14261() {
        boolean z = this.f24168;
        AbstractC8619 abstractC8619 = this.f24166;
        if (!z) {
            abstractC8619.setBackgroundInternal(m14258(this.f24164));
        }
        abstractC8619.setForeground(m14258(this.f24184));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14262(InterfaceC8643 interfaceC8643) {
        this.f24173 = interfaceC8643;
        C8651 c8651 = this.f24164;
        c8651.m14318(interfaceC8643);
        this.f24163.m14318(interfaceC8643);
        C8651 c86512 = this.f24176;
        if (c86512 != null) {
            c86512.m14318(interfaceC8643);
        }
        c8651.f24311 = !c8651.m14324();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14263(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f24181 = drawableMutate;
            drawableMutate.setTintList(this.f24174);
            m14256(this.f24166.f24191, false);
        } else {
            this.f24181 = f24158;
        }
        LayerDrawable layerDrawable = this.f24175;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f24181);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14264() {
        Drawable drawable = this.f24184;
        Drawable drawableM14259 = m14267() ? m14259() : this.f24163;
        this.f24184 = drawableM14259;
        if (drawable != drawableM14259) {
            AbstractC8619 abstractC8619 = this.f24166;
            if (abstractC8619.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) abstractC8619.getForeground()).setDrawable(drawableM14259);
            } else {
                abstractC8619.setForeground(m14258(drawableM14259));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14265() {
        AbstractC8619 abstractC8619 = this.f24166;
        float cardViewRadius = 0.0f;
        float fM14260 = ((!abstractC8619.getPreventCornerOverlap() || this.f24164.m14324()) && !m14266()) ? 0.0f : m14260();
        if (abstractC8619.getPreventCornerOverlap() && abstractC8619.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f24159) * ((double) abstractC8619.getCardViewRadius()));
        }
        int i = (int) (fM14260 - cardViewRadius);
        Rect rect = this.f24165;
        abstractC8619.f872.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        C4870 c4870 = abstractC8619.f869;
        if (!((CardView) c4870.f14161).getUseCompatPadding()) {
            c4870.m9760(0, 0, 0, 0);
            return;
        }
        C7770 c7770 = (C7770) c4870.f14160;
        float f = c7770.f21072;
        float f2 = c7770.f21076;
        int iCeil = (int) Math.ceil(AbstractC7769.m13092(f, f2, r0.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC7769.m13091(f, f2, r0.getPreventCornerOverlap()));
        c4870.m9760(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m14266() {
        AbstractC8619 abstractC8619 = this.f24166;
        return abstractC8619.getPreventCornerOverlap() && this.f24164.m14324() && abstractC8619.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m14267() {
        View view = this.f24166;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }
}
