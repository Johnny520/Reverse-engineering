package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p165.C7676;
import p251.AbstractC8174;
import p305.C8649;
import p305.C8651;
import p305.InterfaceC8643;
import p305.InterfaceC8653;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3097 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f10135;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC8653 f10136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7676 f10137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC8643 f10138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MaterialButton f10139;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f10141;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public RippleDrawable f10142;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f10143;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public ColorStateList f10144;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ColorStateList f10145;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C8651 f10148;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10150;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f10151;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public PorterDuff.Mode f10152;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ColorStateList f10153;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f10154;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10155;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f10149 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f10146 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f10147 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f10140 = true;

    public C3097(MaterialButton materialButton, InterfaceC8643 interfaceC8643) {
        this.f10139 = materialButton;
        this.f10138 = interfaceC8643;
    }

    public void setCornerSizeChangeListener(InterfaceC8653 interfaceC8653) {
        this.f10136 = interfaceC8653;
        C8651 c8651M7079 = m7079(false);
        if (c8651M7079 != null) {
            c8651M7079.setOnCornerSizeChangeListener(interfaceC8653);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7075() {
        int iM9876 = 0;
        C8651 c8651M7079 = m7079(false);
        C8651 c8651M70792 = m7079(true);
        if (c8651M7079 != null) {
            float f = this.f10155;
            ColorStateList colorStateList = this.f10145;
            c8651M7079.f24333.f24302 = f;
            c8651M7079.invalidateSelf();
            C8649 c8649 = c8651M7079.f24333;
            if (c8649.f24289 != colorStateList) {
                c8649.f24289 = colorStateList;
                c8651M7079.onStateChange(c8651M7079.getState());
            }
            if (c8651M70792 != null) {
                float f2 = this.f10155;
                if (this.f10149) {
                    MaterialButton materialButton = this.f10139;
                    iM9876 = AbstractC4921.m9876(materialButton.getContext(), AbstractC8174.m13603(materialButton, R.attr.colorSurface));
                }
                c8651M70792.f24333.f24302 = f2;
                c8651M70792.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM9876);
                C8649 c86492 = c8651M70792.f24333;
                if (c86492.f24289 != colorStateListValueOf) {
                    c86492.f24289 = colorStateListValueOf;
                    c8651M70792.onStateChange(c8651M70792.getState());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7076() {
        /*
            r3 = this;
            r0 = 0
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲 r0 = r3.m7079(r0)
            if (r0 == 0) goto L13
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r1 = r3.f10138
            r0.m14318(r1)
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r1 = r3.f10137
            if (r1 == 0) goto L13
            r0.m14325(r1)
        L13:
            r0 = 1
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲 r0 = r3.m7079(r0)
            if (r0 == 0) goto L26
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r1 = r3.f10138
            r0.m14318(r1)
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r1 = r3.f10137
            if (r1 == 0) goto L26
            r0.m14325(r1)
        L26:
            android.graphics.drawable.RippleDrawable r0 = r3.f10142
            if (r0 == 0) goto L38
            r1 = 16908334(0x102002e, float:2.3877358E-38)
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r1)
            boolean r1 = r0 instanceof p305.InterfaceC8627
            if (r1 == 0) goto L38
            飘花落叶言楪苏兰世子哲.飘花落叶言子世楪哲苏兰 r0 = (p305.InterfaceC8627) r0
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L55
            boolean r1 = r0 instanceof p305.C8651
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r2 = r3.f10138
            if (r1 == 0) goto L4e
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲 r0 = (p305.C8651) r0
            r0.m14318(r2)
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r3 = r3.f10137
            if (r3 == 0) goto L55
            r0.m14325(r3)
            return
        L4e:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世 r3 = r2.mo14273()
            r0.setShapeAppearanceModel(r3)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.C3097.m7076():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7077() {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.C3097.m7077():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7078(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.f10139;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.f10135;
        int i6 = this.f10151;
        int i7 = this.f10134;
        int i8 = this.f10150;
        this.f10135 = i;
        this.f10151 = i2;
        this.f10134 = i3;
        this.f10150 = i4;
        if (!this.f10146) {
            m7077();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8651 m7079(boolean z) {
        RippleDrawable rippleDrawable = this.f10142;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C8651) ((LayerDrawable) ((InsetDrawable) this.f10142.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }
}
