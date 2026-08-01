package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC3054;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0126 extends ImageButton {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0137 f558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0191 f560;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0126(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0141.m596(context);
        this.f559 = false;
        AbstractC0152.m606(getContext(), this);
        C0191 c0191 = new C0191(this);
        this.f560 = c0191;
        c0191.m665(attributeSet, i);
        C0137 c0137 = new C0137(this);
        this.f558 = c0137;
        c0137.m577(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f560;
        if (c0191 != null) {
            c0191.m677();
        }
        C0137 c0137 = this.f558;
        if (c0137 != null) {
            c0137.m568();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f560;
        if (c0191 != null) {
            return c0191.m680();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f560;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0140 c0140;
        C0137 c0137 = this.f558;
        if (c0137 == null || (c0140 = (C0140) c0137.f594) == null) {
            return null;
        }
        return (ColorStateList) c0140.f600;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0140 c0140;
        C0137 c0137 = this.f558;
        if (c0137 == null || (c0140 = (C0140) c0137.f594) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0140.f599;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f558.f595).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f560;
        if (c0191 != null) {
            c0191.m663();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f560;
        if (c0191 != null) {
            c0191.m662(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0137 c0137 = this.f558;
        if (c0137 != null) {
            c0137.m568();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0137 c0137 = this.f558;
        if (c0137 != null && drawable != null && !this.f559) {
            c0137.f596 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0137 != null) {
            c0137.m568();
            if (this.f559) {
                return;
            }
            ImageView imageView = (ImageView) c0137.f595;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0137.f596);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f559 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0137 c0137 = this.f558;
        ImageView imageView = (ImageView) c0137.f595;
        if (i != 0) {
            Drawable drawableM6607 = AbstractC3054.m6607(imageView.getContext(), i);
            if (drawableM6607 != null) {
                AbstractC0216.m722(drawableM6607);
            }
            imageView.setImageDrawable(drawableM6607);
        } else {
            imageView.setImageDrawable(null);
        }
        c0137.m568();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0137 c0137 = this.f558;
        if (c0137 != null) {
            c0137.m568();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f560;
        if (c0191 != null) {
            c0191.m657(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f560;
        if (c0191 != null) {
            c0191.m660(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0137 c0137 = this.f558;
        if (c0137 != null) {
            if (((C0140) c0137.f594) == null) {
                c0137.f594 = new C0140();
            }
            C0140 c0140 = (C0140) c0137.f594;
            c0140.f600 = colorStateList;
            c0140.f601 = true;
            c0137.m568();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0137 c0137 = this.f558;
        if (c0137 != null) {
            if (((C0140) c0137.f594) == null) {
                c0137.f594 = new C0140();
            }
            C0140 c0140 = (C0140) c0137.f594;
            c0140.f599 = mode;
            c0140.f602 = true;
            c0137.m568();
        }
    }
}
