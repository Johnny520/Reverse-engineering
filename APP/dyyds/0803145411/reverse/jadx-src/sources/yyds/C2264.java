package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: yyds.ᲁᛶᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2264 extends ImageView {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f11166;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1231 f11167;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1607 f11168;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2264(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2790.m4904(context);
        this.f11166 = false;
        AbstractC2251.m4251(getContext(), this);
        C1231 c1231 = new C1231(this);
        this.f11167 = c1231;
        c1231.m2518(attributeSet, i);
        C1607 c1607 = new C1607(this);
        this.f11168 = c1607;
        c1607.m3308(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1231 c1231 = this.f11167;
        if (c1231 != null) {
            c1231.m2510();
        }
        C1607 c1607 = this.f11168;
        if (c1607 != null) {
            c1607.m3307();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1231 c1231 = this.f11167;
        if (c1231 != null) {
            return c1231.m2506();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1231 c1231 = this.f11167;
        if (c1231 != null) {
            return c1231.m2508();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2731 c2731;
        C1607 c1607 = this.f11168;
        if (c1607 == null || (c2731 = (C2731) c1607.f8180) == null) {
            return null;
        }
        return (ColorStateList) c2731.f13430;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2731 c2731;
        C1607 c1607 = this.f11168;
        if (c1607 == null || (c2731 = (C2731) c1607.f8180) == null) {
            return null;
        }
        return (PorterDuff.Mode) c2731.f13431;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f11168.f8179).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1231 c1231 = this.f11167;
        if (c1231 != null) {
            c1231.m2507();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1231 c1231 = this.f11167;
        if (c1231 != null) {
            c1231.m2505(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1607 c1607 = this.f11168;
        if (c1607 != null) {
            c1607.m3307();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1607 c1607 = this.f11168;
        if (c1607 != null && drawable != null && !this.f11166) {
            c1607.f8178 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c1607 != null) {
            c1607.m3307();
            if (this.f11166) {
                return;
            }
            ImageView imageView = (ImageView) c1607.f8179;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c1607.f8178);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f11166 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C1607 c1607 = this.f11168;
        if (c1607 != null) {
            ImageView imageView = (ImageView) c1607.f8179;
            if (i != 0) {
                Drawable drawableM2767 = AbstractC1367.m2767(imageView.getContext(), i);
                if (drawableM2767 != null) {
                    AbstractC2137.m4075(drawableM2767);
                }
                imageView.setImageDrawable(drawableM2767);
            } else {
                imageView.setImageDrawable(null);
            }
            c1607.m3307();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1607 c1607 = this.f11168;
        if (c1607 != null) {
            c1607.m3307();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1231 c1231 = this.f11167;
        if (c1231 != null) {
            c1231.m2511(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1231 c1231 = this.f11167;
        if (c1231 != null) {
            c1231.m2517(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1607 c1607 = this.f11168;
        if (c1607 != null) {
            C2731 c2731 = (C2731) c1607.f8180;
            if (c2731 == null) {
                c2731 = new C2731();
                c1607.f8180 = c2731;
            }
            c2731.f13430 = colorStateList;
            c2731.f13429 = true;
            c1607.m3307();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1607 c1607 = this.f11168;
        if (c1607 != null) {
            C2731 c2731 = (C2731) c1607.f8180;
            if (c2731 == null) {
                c2731 = new C2731();
                c1607.f8180 = c2731;
            }
            c2731.f13431 = mode;
            c2731.f13428 = true;
            c1607.m3307();
        }
    }
}
