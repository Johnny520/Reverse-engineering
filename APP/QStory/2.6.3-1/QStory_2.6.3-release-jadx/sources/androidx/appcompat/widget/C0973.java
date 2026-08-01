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
import io.ktor.client.plugins.AbstractC4765;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0973 extends ImageButton {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0984 f903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1038 f905;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0973(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0988.m1157(context);
        this.f904 = false;
        AbstractC0999.m1167(getContext(), this);
        C1038 c1038 = new C1038(this);
        this.f905 = c1038;
        c1038.m1226(attributeSet, i);
        C0984 c0984 = new C0984(this);
        this.f903 = c0984;
        c0984.m1138(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1038 c1038 = this.f905;
        if (c1038 != null) {
            c1038.m1238();
        }
        C0984 c0984 = this.f903;
        if (c0984 != null) {
            c0984.m1129();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1038 c1038 = this.f905;
        if (c1038 != null) {
            return c1038.m1241();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1038 c1038 = this.f905;
        if (c1038 != null) {
            return c1038.m1242();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0987 c0987;
        C0984 c0984 = this.f903;
        if (c0984 == null || (c0987 = (C0987) c0984.f939) == null) {
            return null;
        }
        return (ColorStateList) c0987.f945;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0987 c0987;
        C0984 c0984 = this.f903;
        if (c0984 == null || (c0987 = (C0987) c0984.f939) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0987.f944;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f903.f940).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1038 c1038 = this.f905;
        if (c1038 != null) {
            c1038.m1224();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1038 c1038 = this.f905;
        if (c1038 != null) {
            c1038.m1223(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0984 c0984 = this.f903;
        if (c0984 != null) {
            c0984.m1129();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0984 c0984 = this.f903;
        if (c0984 != null && drawable != null && !this.f904) {
            c0984.f941 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0984 != null) {
            c0984.m1129();
            if (this.f904) {
                return;
            }
            ImageView imageView = (ImageView) c0984.f940;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0984.f941);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f904 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0984 c0984 = this.f903;
        ImageView imageView = (ImageView) c0984.f940;
        if (i != 0) {
            Drawable drawableM8871 = AbstractC4765.m8871(imageView.getContext(), i);
            if (drawableM8871 != null) {
                AbstractC1063.m1283(drawableM8871);
            }
            imageView.setImageDrawable(drawableM8871);
        } else {
            imageView.setImageDrawable(null);
        }
        c0984.m1129();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0984 c0984 = this.f903;
        if (c0984 != null) {
            c0984.m1129();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1038 c1038 = this.f905;
        if (c1038 != null) {
            c1038.m1218(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1038 c1038 = this.f905;
        if (c1038 != null) {
            c1038.m1221(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0984 c0984 = this.f903;
        if (c0984 != null) {
            if (((C0987) c0984.f939) == null) {
                c0984.f939 = new C0987();
            }
            C0987 c0987 = (C0987) c0984.f939;
            c0987.f945 = colorStateList;
            c0987.f946 = true;
            c0984.m1129();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0984 c0984 = this.f903;
        if (c0984 != null) {
            if (((C0987) c0984.f939) == null) {
                c0984.f939 = new C0987();
            }
            C0987 c0987 = (C0987) c0984.f939;
            c0987.f944 = mode;
            c0987.f947 = true;
            c0984.m1129();
        }
    }
}
