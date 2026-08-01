package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p069.AbstractC7390;
import p181.C8506;
import p321.C9470;
import p321.C9472;
import p321.InterfaceC9448;
import p321.InterfaceC9464;
import p321.InterfaceC9474;
import p323.AbstractC9479;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f10485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC9474 f10486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8506 f10487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC9464 f10488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MaterialButton f10489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f10491;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public RippleDrawable f10492;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f10493;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public ColorStateList f10494;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ColorStateList f10495;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C9472 f10498;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10500;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f10501;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public PorterDuff.Mode f10502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ColorStateList f10503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f10504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10505;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f10499 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f10496 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f10497 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f10490 = true;

    public C3930(MaterialButton materialButton, InterfaceC9464 interfaceC9464) {
        this.f10489 = materialButton;
        this.f10488 = interfaceC9464;
    }

    public void setCornerSizeChangeListener(InterfaceC9474 interfaceC9474) {
        this.f10486 = interfaceC9474;
        C9472 c9472M7625 = m7625(false);
        if (c9472M7625 != null) {
            c9472M7625.setOnCornerSizeChangeListener(interfaceC9474);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7621() {
        int iM10585 = 0;
        C9472 c9472M7625 = m7625(false);
        C9472 c9472M76252 = m7625(true);
        if (c9472M7625 != null) {
            float f = this.f10505;
            ColorStateList colorStateList = this.f10495;
            c9472M7625.f24669.f24638 = f;
            c9472M7625.invalidateSelf();
            C9470 c9470 = c9472M7625.f24669;
            if (c9470.f24625 != colorStateList) {
                c9470.f24625 = colorStateList;
                c9472M7625.onStateChange(c9472M7625.getState());
            }
            if (c9472M76252 != null) {
                float f2 = this.f10505;
                if (this.f10499) {
                    MaterialButton materialButton = this.f10489;
                    iM10585 = AbstractC5894.m10585(materialButton.getContext(), AbstractC7390.m12618(materialButton, C0328R.attr.colorSurface));
                }
                c9472M76252.f24669.f24638 = f2;
                c9472M76252.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM10585);
                C9470 c94702 = c9472M76252.f24669;
                if (c94702.f24625 != colorStateListValueOf) {
                    c94702.f24625 = colorStateListValueOf;
                    c9472M76252.onStateChange(c9472M76252.getState());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7622() {
        InterfaceC9448 interfaceC9448;
        C9472 c9472M7625 = m7625(false);
        if (c9472M7625 != null) {
            c9472M7625.m14895(this.f10488);
            C8506 c8506 = this.f10487;
            if (c8506 != null) {
                c9472M7625.m14902(c8506);
            }
        }
        C9472 c9472M76252 = m7625(true);
        if (c9472M76252 != null) {
            c9472M76252.m14895(this.f10488);
            C8506 c85062 = this.f10487;
            if (c85062 != null) {
                c9472M76252.m14902(c85062);
            }
        }
        RippleDrawable rippleDrawable = this.f10492;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
            interfaceC9448 = objFindDrawableByLayerId instanceof InterfaceC9448 ? (InterfaceC9448) objFindDrawableByLayerId : null;
        }
        if (interfaceC9448 != null) {
            boolean z = interfaceC9448 instanceof C9472;
            InterfaceC9464 interfaceC9464 = this.f10488;
            if (!z) {
                interfaceC9448.setShapeAppearanceModel(interfaceC9464.mo14851());
                return;
            }
            C9472 c9472 = (C9472) interfaceC9448;
            c9472.m14895(interfaceC9464);
            C8506 c85063 = this.f10487;
            if (c85063 != null) {
                c9472.m14902(c85063);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7623() {
        C9472 c9472 = new C9472(this.f10488);
        C8506 c8506 = this.f10487;
        if (c8506 != null) {
            c9472.m14902(c8506);
        }
        InterfaceC9474 interfaceC9474 = this.f10486;
        if (interfaceC9474 != null) {
            c9472.setOnCornerSizeChangeListener(interfaceC9474);
        }
        MaterialButton materialButton = this.f10489;
        Context context = materialButton.getContext();
        c9472.m14897(context);
        c9472.setTintList(this.f10503);
        PorterDuff.Mode mode = this.f10502;
        if (mode != null) {
            c9472.setTintMode(mode);
        }
        float f = this.f10505;
        ColorStateList colorStateList = this.f10495;
        c9472.f24669.f24638 = f;
        c9472.invalidateSelf();
        C9470 c9470 = c9472.f24669;
        if (c9470.f24625 != colorStateList) {
            c9470.f24625 = colorStateList;
            c9472.onStateChange(c9472.getState());
        }
        C9472 c94722 = new C9472(this.f10488);
        C8506 c85062 = this.f10487;
        if (c85062 != null) {
            c94722.m14902(c85062);
        }
        int i = 0;
        c94722.setTint(0);
        float f2 = this.f10505;
        int iM10585 = this.f10499 ? AbstractC5894.m10585(materialButton.getContext(), AbstractC7390.m12618(materialButton, C0328R.attr.colorSurface)) : 0;
        c94722.f24669.f24638 = f2;
        c94722.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM10585);
        C9470 c94702 = c94722.f24669;
        if (c94702.f24625 != colorStateListValueOf) {
            c94702.f24625 = colorStateListValueOf;
            c94722.onStateChange(c94722.getState());
        }
        C9472 c94723 = new C9472(this.f10488);
        this.f10498 = c94723;
        C8506 c85063 = this.f10487;
        if (c85063 != null) {
            c94723.m14902(c85063);
        }
        this.f10498.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC9479.m14909(this.f10494), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c94722, c9472}), this.f10485, this.f10501, this.f10484, this.f10500), this.f10498);
        this.f10492 = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.m7708(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.f10492);
        C9472 c9472M7625 = m7625(false);
        if (c9472M7625 != null) {
            c9472M7625.m14899(this.f10493);
            c9472M7625.setState(materialButton.getDrawableState());
        }
        Drawable background = materialButton.getBackground();
        if (background instanceof FocusRingDrawable) {
            focusRingDrawable = (FocusRingDrawable) background;
        } else if (background instanceof DrawableWrapper) {
            Drawable drawable = ((DrawableWrapper) background).getDrawable();
            if (drawable instanceof FocusRingDrawable) {
                focusRingDrawable = (FocusRingDrawable) drawable;
            } else if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                while (true) {
                    if (i >= layerDrawable.getNumberOfLayers()) {
                        break;
                    }
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (drawable2 instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable2;
                        break;
                    }
                    i++;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.f10748 = new WeakReference(c9472M7625);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7624(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.f10489;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.f10485;
        int i6 = this.f10501;
        int i7 = this.f10484;
        int i8 = this.f10500;
        this.f10485 = i;
        this.f10501 = i2;
        this.f10484 = i3;
        this.f10500 = i4;
        if (!this.f10496) {
            m7623();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9472 m7625(boolean z) {
        RippleDrawable rippleDrawable = this.f10492;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C9472) ((LayerDrawable) ((InsetDrawable) this.f10492.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }
}
