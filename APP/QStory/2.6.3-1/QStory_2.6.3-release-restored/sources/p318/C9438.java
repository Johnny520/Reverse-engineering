package p318;

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
import androidx.core.view.C3099;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.focus.FocusRingDrawable;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p034.AbstractC7082;
import p050.AbstractC7176;
import p198.AbstractC8590;
import p202.AbstractC8599;
import p202.C8600;
import p321.C9453;
import p321.C9465;
import p321.C9468;
import p321.C9469;
import p321.C9472;
import p321.InterfaceC9464;
import p333.AbstractC9501;

/* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9438 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final ColorDrawable f24494;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final double f24495 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f24497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f24498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9472 f24499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9472 f24500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC9440 f24502;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f24503;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f24505;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f24506;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ValueAnimator f24507;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final TimeInterpolator f24508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC9464 f24509;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ColorStateList f24510;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public LayerDrawable f24511;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C9472 f24512;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ColorStateList f24513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public RippleDrawable f24514;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f24515;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f24516;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Drawable f24517;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ColorStateList f24518;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f24519;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Drawable f24520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Rect f24501 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f24504 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f24496 = 0.0f;

    static {
        f24494 = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C9438(AbstractC9440 abstractC9440, AttributeSet attributeSet) {
        this.f24498 = -1.0f;
        this.f24502 = abstractC9440;
        TypedArray typedArrayObtainStyledAttributes = abstractC9440.getContext().obtainStyledAttributes(attributeSet, AbstractC8590.f21395, C0328R.attr.materialCardViewStyle, C0328R.style.CardView);
        C9472 c9472 = new C9472(abstractC9440.getContext(), attributeSet, C0328R.attr.materialCardViewStyle, C0328R.style.Widget_MaterialComponents_CardView);
        this.f24500 = c9472;
        c9472.m14897(abstractC9440.getContext());
        c9472.m14891();
        C9468 c9468M14882 = c9472.m14907().m14882();
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            this.f24498 = dimension;
            c9468M14882.m14877(dimension);
        }
        this.f24499 = new C9472();
        m14840(c9468M14882.m14878());
        this.f24508 = AbstractC7176.m12482(abstractC9440.getContext(), C0328R.attr.motionEasingLinearInterpolator, AbstractC9501.f24813);
        this.f24505 = AbstractC7176.m12481(abstractC9440.getContext(), C0328R.attr.motionDurationShort2, 300);
        this.f24506 = AbstractC7176.m12481(abstractC9440.getContext(), C0328R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static float m14833(AbstractC7082 abstractC7082, float f) {
        if (abstractC7082 instanceof C9465) {
            return (float) ((1.0d - f24495) * ((double) f));
        }
        if (abstractC7082 instanceof C9453) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14834(boolean z, boolean z2) {
        Drawable drawable = this.f24517;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? Opcodes.CONST_METHOD_TYPE : 0);
                this.f24496 = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = this.f24496;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.f24507;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f24507 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f24496, f);
            this.f24507 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C3099(this, 2));
            this.f24507.setInterpolator(this.f24508);
            this.f24507.setDuration((long) ((z ? this.f24505 : this.f24506) * f2));
            this.f24507.start();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14835(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f24511 != null) {
            AbstractC9440 abstractC9440 = this.f24502;
            if (abstractC9440.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((abstractC9440.getMaxCardElevation() * 1.5f) + (m14844() ? m14838() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((abstractC9440.getMaxCardElevation() + (m14844() ? m14838() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.f24515;
            boolean z = (i5 & 8388613) == 8388613;
            int i6 = this.f24497;
            int i7 = z ? ((i - i6) - this.f24516) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.f24516) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.f24516) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.f24516) - iCeil;
            }
            int i10 = i6;
            if (abstractC9440.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.f24511.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9439 m14836(Drawable drawable) {
        int iCeil;
        int i;
        if (this.f24502.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (m14844() ? m14838() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (m14844() ? m14838() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new C9439(drawable, iCeil, i, iCeil, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LayerDrawable m14837() {
        if (this.f24514 == null) {
            this.f24512 = new C9472(this.f24509);
            this.f24514 = new RippleDrawable(this.f24518, null, this.f24512);
        }
        if (this.f24511 == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f24514, this.f24499, this.f24517});
            FocusRingDrawable.m7708(this.f24502.getContext(), layerDrawable, this.f24512);
            layerDrawable.setId(2, C0328R.id.mtrl_card_checked_layer_id);
            this.f24511 = layerDrawable;
        }
        return this.f24511;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m14838() {
        float fMax = 0.0f;
        for (C9469 c9469 : this.f24509.mo14852()) {
            if (c9469 != null) {
                AbstractC7082 abstractC7082 = c9469.f24616;
                C9472 c9472 = this.f24500;
                float fM14833 = m14833(abstractC7082, c9472.m14905());
                AbstractC7082 abstractC70822 = c9469.f24615;
                float[] fArr = c9472.f24643;
                float fMax2 = Math.max(fM14833, m14833(abstractC70822, fArr != null ? fArr[0] : c9472.f24669.f24628.mo14851().f24611.mo14871(c9472.m14904())));
                AbstractC7082 abstractC70823 = c9469.f24614;
                float[] fArr2 = c9472.f24643;
                float fM148332 = m14833(abstractC70823, fArr2 != null ? fArr2[1] : c9472.f24669.f24628.mo14851().f24618.mo14871(c9472.m14904()));
                AbstractC7082 abstractC70824 = c9469.f24613;
                float[] fArr3 = c9472.f24643;
                fMax = Math.max(fMax, Math.max(fMax2, Math.max(fM148332, m14833(abstractC70824, fArr3 != null ? fArr3[2] : c9472.f24669.f24628.mo14851().f24617.mo14871(c9472.m14904())))));
            }
        }
        return fMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14839() {
        boolean z = this.f24504;
        AbstractC9440 abstractC9440 = this.f24502;
        if (!z) {
            abstractC9440.setBackgroundInternal(m14836(this.f24500));
        }
        abstractC9440.setForeground(m14836(this.f24520));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14840(InterfaceC9464 interfaceC9464) {
        this.f24509 = interfaceC9464;
        C9472 c9472 = this.f24500;
        c9472.m14895(interfaceC9464);
        this.f24499.m14895(interfaceC9464);
        C9472 c94722 = this.f24512;
        if (c94722 != null) {
            c94722.m14895(interfaceC9464);
        }
        c9472.f24647 = !c9472.m14901();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14841(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f24517 = drawableMutate;
            drawableMutate.setTintList(this.f24510);
            m14834(this.f24502.f24527, false);
        } else {
            this.f24517 = f24494;
        }
        LayerDrawable layerDrawable = this.f24511;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C0328R.id.mtrl_card_checked_layer_id, this.f24517);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14842() {
        Drawable drawable = this.f24520;
        Drawable drawableM14837 = m14845() ? m14837() : this.f24499;
        this.f24520 = drawableM14837;
        if (drawable != drawableM14837) {
            AbstractC9440 abstractC9440 = this.f24502;
            if (abstractC9440.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) abstractC9440.getForeground()).setDrawable(drawableM14837);
            } else {
                abstractC9440.setForeground(m14836(drawableM14837));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14843() {
        AbstractC9440 abstractC9440 = this.f24502;
        float cardViewRadius = 0.0f;
        float fM14838 = ((!abstractC9440.getPreventCornerOverlap() || this.f24500.m14901()) && !m14844()) ? 0.0f : m14838();
        if (abstractC9440.getPreventCornerOverlap() && abstractC9440.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f24495) * ((double) abstractC9440.getCardViewRadius()));
        }
        int i = (int) (fM14838 - cardViewRadius);
        Rect rect = this.f24501;
        abstractC9440.f1217.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        C5703 c5703 = abstractC9440.f1214;
        if (!((CardView) c5703.f14510).getUseCompatPadding()) {
            c5703.m10311(0, 0, 0, 0);
            return;
        }
        C8600 c8600 = (C8600) c5703.f14509;
        float f = c8600.f21414;
        float f2 = c8600.f21418;
        int iCeil = (int) Math.ceil(AbstractC8599.m13679(f, f2, r0.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC8599.m13678(f, f2, r0.getPreventCornerOverlap()));
        c5703.m10311(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m14844() {
        AbstractC9440 abstractC9440 = this.f24502;
        return abstractC9440.getPreventCornerOverlap() && this.f24500.m14901() && abstractC9440.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m14845() {
        View view = this.f24502;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }
}
