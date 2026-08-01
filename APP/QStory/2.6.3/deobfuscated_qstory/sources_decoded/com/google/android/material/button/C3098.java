package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p053.AbstractC6561;
import p165.C7677;
import p305.C8641;
import p305.C8643;
import p305.InterfaceC8635;
import p305.InterfaceC8645;

/* JADX INFO: renamed from: com.google.android.material.button.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3098 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f10140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC8645 f10141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7677 f10142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC8635 f10143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MaterialButton f10144;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f10146;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public RippleDrawable f10147;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f10148;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public ColorStateList f10149;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ColorStateList f10150;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C8643 f10153;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10155;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f10156;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public PorterDuff.Mode f10157;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public ColorStateList f10158;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f10159;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10160;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f10154 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f10151 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f10152 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f10145 = true;

    public C3098(MaterialButton materialButton, InterfaceC8635 interfaceC8635) {
        this.f10144 = materialButton;
        this.f10143 = interfaceC8635;
    }

    public void setCornerSizeChangeListener(InterfaceC8645 interfaceC8645) {
        this.f10141 = interfaceC8645;
        C8643 c8643M7066 = m7066(false);
        if (c8643M7066 != null) {
            c8643M7066.setOnCornerSizeChangeListener(interfaceC8645);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7062() {
        int iM10026 = 0;
        C8643 c8643M7066 = m7066(false);
        C8643 c8643M70662 = m7066(true);
        if (c8643M7066 != null) {
            float f = this.f10160;
            ColorStateList colorStateList = this.f10150;
            c8643M7066.f24324.f24293 = f;
            c8643M7066.invalidateSelf();
            C8641 c8641 = c8643M7066.f24324;
            if (c8641.f24280 != colorStateList) {
                c8641.f24280 = colorStateList;
                c8643M7066.onStateChange(c8643M7066.getState());
            }
            if (c8643M70662 != null) {
                float f2 = this.f10160;
                if (this.f10154) {
                    MaterialButton materialButton = this.f10144;
                    iM10026 = AbstractC5062.m10026(materialButton.getContext(), AbstractC6561.m12059(materialButton, R.attr.colorSurface));
                }
                c8643M70662.f24324.f24293 = f2;
                c8643M70662.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM10026);
                C8641 c86412 = c8643M70662.f24324;
                if (c86412.f24280 != colorStateListValueOf) {
                    c86412.f24280 = colorStateListValueOf;
                    c8643M70662.onStateChange(c8643M70662.getState());
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
    public final void m7063() {
        /*
            r3 = this;
            r0 = 0
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲 r0 = r3.m7066(r0)
            if (r0 == 0) goto L13
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r1 = r3.f10143
            r0.m14336(r1)
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r1 = r3.f10142
            if (r1 == 0) goto L13
            r0.m14343(r1)
        L13:
            r0 = 1
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲 r0 = r3.m7066(r0)
            if (r0 == 0) goto L26
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r1 = r3.f10143
            r0.m14336(r1)
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r1 = r3.f10142
            if (r1 == 0) goto L26
            r0.m14343(r1)
        L26:
            android.graphics.drawable.RippleDrawable r0 = r3.f10147
            if (r0 == 0) goto L38
            r1 = 16908334(0x102002e, float:2.3877358E-38)
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r1)
            boolean r1 = r0 instanceof p305.InterfaceC8619
            if (r1 == 0) goto L38
            飘花落叶言楪苏兰世子哲.飘花落叶言子世楪哲苏兰 r0 = (p305.InterfaceC8619) r0
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L55
            boolean r1 = r0 instanceof p305.C8643
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r2 = r3.f10143
            if (r1 == 0) goto L4e
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲 r0 = (p305.C8643) r0
            r0.m14336(r2)
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r3 = r3.f10142
            if (r3 == 0) goto L55
            r0.m14343(r3)
            return
        L4e:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世 r3 = r2.mo14292()
            r0.setShapeAppearanceModel(r3)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.C3098.m7063():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7064() {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.C3098.m7064():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7065(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.f10144;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.f10140;
        int i6 = this.f10156;
        int i7 = this.f10139;
        int i8 = this.f10155;
        this.f10140 = i;
        this.f10156 = i2;
        this.f10139 = i3;
        this.f10155 = i4;
        if (!this.f10151) {
            m7064();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8643 m7066(boolean z) {
        RippleDrawable rippleDrawable = this.f10147;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C8643) ((LayerDrawable) ((InsetDrawable) this.f10147.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }
}
