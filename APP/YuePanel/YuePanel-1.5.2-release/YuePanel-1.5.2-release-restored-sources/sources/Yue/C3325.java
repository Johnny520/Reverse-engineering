package Yue;

import Yue.C6898;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3325 extends C3318 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final SeekBar f5223;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Drawable f5224;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public ColorStateList f5225;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public PorterDuff.Mode f5226;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f5227;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f5228;

    public C3325(SeekBar seekBar) {
        super(seekBar);
        this.f5225 = null;
        this.f5226 = null;
        this.f5227 = false;
        this.f5228 = false;
        this.f5223 = seekBar;
    }

    @Override // Yue.C3318
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo6781(AttributeSet attributeSet, int i) {
        super.mo6781(attributeSet, i);
        C7837 c7837M24869 = C7837.m24869(this.f5223.getContext(), attributeSet, C6898.C6909.f19425, i, 0);
        SeekBar seekBar = this.f5223;
        C8273.m27437(seekBar, seekBar.getContext(), C6898.C6909.f19425, attributeSet, c7837M24869.m24895(), i, 0);
        Drawable drawableM24876 = c7837M24869.m24876(C6898.C6909.f19426);
        if (drawableM24876 != null) {
            this.f5223.setThumb(drawableM24876);
        }
        m6792(c7837M24869.m24875(C6898.C6909.f19427));
        if (c7837M24869.m24896(C6898.C6909.f19429)) {
            this.f5226 = C4533.m13289(c7837M24869.m24882(C6898.C6909.f19429, -1), this.f5226);
            this.f5228 = true;
        }
        if (c7837M24869.m24896(C6898.C6909.f19428)) {
            this.f5225 = c7837M24869.m24871(C6898.C6909.f19428);
            this.f5227 = true;
        }
        c7837M24869.m24899();
        m6785();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m6785() {
        Drawable drawable = this.f5224;
        if (drawable != null) {
            if (this.f5227 || this.f5228) {
                Drawable drawableM13239 = C4520.m13239(drawable.mutate());
                this.f5224 = drawableM13239;
                if (this.f5227) {
                    C4520.m13236(drawableM13239, this.f5225);
                }
                if (this.f5228) {
                    C4520.m13237(this.f5224, this.f5226);
                }
                if (this.f5224.isStateful()) {
                    this.f5224.setState(this.f5223.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m6786(Canvas canvas) {
        if (this.f5224 != null) {
            int max = this.f5223.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f5224.getIntrinsicWidth();
                int intrinsicHeight = this.f5224.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f5224.setBounds(-i, -i2, i, i2);
                float width = ((this.f5223.getWidth() - this.f5223.getPaddingLeft()) - this.f5223.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f5223.getPaddingLeft(), this.f5223.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f5224.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m6787() {
        Drawable drawable = this.f5224;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f5223.getDrawableState())) {
            this.f5223.invalidateDrawable(drawable);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Drawable m6788() {
        return this.f5224;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public ColorStateList m6789() {
        return this.f5225;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public PorterDuff.Mode m6790() {
        return this.f5226;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m6791() {
        Drawable drawable = this.f5224;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m6792(@InterfaceC6490 Drawable drawable) {
        Drawable drawable2 = this.f5224;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5224 = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f5223);
            C4520.m13234(drawable, this.f5223.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f5223.getDrawableState());
            }
            m6785();
        }
        this.f5223.invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m6793(@InterfaceC6490 ColorStateList colorStateList) {
        this.f5225 = colorStateList;
        this.f5227 = true;
        m6785();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m6794(@InterfaceC6490 PorterDuff.Mode mode) {
        this.f5226 = mode;
        this.f5228 = true;
        m6785();
    }
}
