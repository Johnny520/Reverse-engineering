package Yue;

import Yue.C6898;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3291 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final CompoundButton f198;

    /* JADX INFO: renamed from: ۥ۟ */
    public ColorStateList f199 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public PorterDuff.Mode f5180 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f5181 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f5182 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f5183;

    public C3291(@InterfaceC6391 CompoundButton compoundButton) {
        this.f198 = compoundButton;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m360() {
        Drawable drawableM1021 = C4068.m1021(this.f198);
        if (drawableM1021 != null) {
            if (this.f5181 || this.f5182) {
                Drawable drawableMutate = C4520.m13239(drawableM1021).mutate();
                if (this.f5181) {
                    C4520.m13236(drawableMutate, this.f199);
                }
                if (this.f5182) {
                    C4520.m13237(drawableMutate, this.f5180);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f198.getDrawableState());
                }
                this.f198.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public ColorStateList m361() {
        return this.f199;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public PorterDuff.Mode m6737() {
        return this.f5180;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m6738(@InterfaceC6490 AttributeSet attributeSet, int i) {
        int iM24888;
        int iM248882;
        C7837 c7837M24869 = C7837.m24869(this.f198.getContext(), attributeSet, C6898.C6909.f19596, i, 0);
        CompoundButton compoundButton = this.f198;
        C8273.m27437(compoundButton, compoundButton.getContext(), C6898.C6909.f19596, attributeSet, c7837M24869.m24895(), i, 0);
        try {
            if (c7837M24869.m24896(C6898.C6909.f19598) && (iM248882 = c7837M24869.m24888(C6898.C6909.f19598, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f198;
                    compoundButton2.setButtonDrawable(C3323.m396(compoundButton2.getContext(), iM248882));
                } catch (Resources.NotFoundException unused) {
                    if (c7837M24869.m24896(C6898.C6909.f19597)) {
                        CompoundButton compoundButton3 = this.f198;
                        compoundButton3.setButtonDrawable(C3323.m396(compoundButton3.getContext(), iM24888));
                    }
                }
            } else if (c7837M24869.m24896(C6898.C6909.f19597) && (iM24888 = c7837M24869.m24888(C6898.C6909.f19597, 0)) != 0) {
                CompoundButton compoundButton32 = this.f198;
                compoundButton32.setButtonDrawable(C3323.m396(compoundButton32.getContext(), iM24888));
            }
            if (c7837M24869.m24896(C6898.C6909.f19599)) {
                C4068.m11502(this.f198, c7837M24869.m24871(C6898.C6909.f19599));
            }
            if (c7837M24869.m24896(C6898.C6909.f19600)) {
                C4068.m11503(this.f198, C4533.m13289(c7837M24869.m24882(C6898.C6909.f19600, -1), null));
            }
        } finally {
            c7837M24869.m24899();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m6739() {
        if (this.f5183) {
            this.f5183 = false;
        } else {
            this.f5183 = true;
            m360();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m6740(ColorStateList colorStateList) {
        this.f199 = colorStateList;
        this.f5181 = true;
        m360();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m6741(@InterfaceC6490 PorterDuff.Mode mode) {
        this.f5180 = mode;
        this.f5182 = true;
        m360();
    }
}
