package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import io.ktor.client.plugins.AbstractC3933;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0136 extends ImageView {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0137 f591;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f592;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0191 f593;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0141.m597(context);
        this.f592 = false;
        AbstractC0152.m607(getContext(), this);
        C0191 c0191 = new C0191(this);
        this.f593 = c0191;
        c0191.m666(attributeSet, i);
        C0137 c0137 = new C0137(this);
        this.f591 = c0137;
        c0137.m578(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f593;
        if (c0191 != null) {
            c0191.m678();
        }
        C0137 c0137 = this.f591;
        if (c0137 != null) {
            c0137.m569();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f593;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f593;
        if (c0191 != null) {
            return c0191.m682();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0140 c0140;
        C0137 c0137 = this.f591;
        if (c0137 == null || (c0140 = (C0140) c0137.f594) == null) {
            return null;
        }
        return (ColorStateList) c0140.f600;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0140 c0140;
        C0137 c0137 = this.f591;
        if (c0137 == null || (c0140 = (C0140) c0137.f594) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0140.f599;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f591.f595).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f593;
        if (c0191 != null) {
            c0191.m664();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f593;
        if (c0191 != null) {
            c0191.m663(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0137 c0137 = this.f591;
        if (c0137 != null) {
            c0137.m569();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0137 c0137 = this.f591;
        if (c0137 != null && drawable != null && !this.f592) {
            c0137.f596 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0137 != null) {
            c0137.m569();
            if (this.f592) {
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
        this.f592 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0137 c0137 = this.f591;
        if (c0137 != null) {
            ImageView imageView = (ImageView) c0137.f595;
            if (i != 0) {
                Drawable drawableM8312 = AbstractC3933.m8312(imageView.getContext(), i);
                if (drawableM8312 != null) {
                    AbstractC0216.m723(drawableM8312);
                }
                imageView.setImageDrawable(drawableM8312);
            } else {
                imageView.setImageDrawable(null);
            }
            c0137.m569();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0137 c0137 = this.f591;
        if (c0137 != null) {
            c0137.m569();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f593;
        if (c0191 != null) {
            c0191.m658(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f593;
        if (c0191 != null) {
            c0191.m661(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0137 c0137 = this.f591;
        if (c0137 != null) {
            if (((C0140) c0137.f594) == null) {
                c0137.f594 = new C0140();
            }
            C0140 c0140 = (C0140) c0137.f594;
            c0140.f600 = colorStateList;
            c0140.f601 = true;
            c0137.m569();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0137 c0137 = this.f591;
        if (c0137 != null) {
            if (((C0140) c0137.f594) == null) {
                c0137.f594 = new C0140();
            }
            C0140 c0140 = (C0140) c0137.f594;
            c0140.f599 = mode;
            c0140.f602 = true;
            c0137.m569();
        }
    }
}
