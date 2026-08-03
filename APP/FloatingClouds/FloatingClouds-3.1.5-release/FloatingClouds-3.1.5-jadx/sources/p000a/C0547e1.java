package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: a.e1 */
/* JADX INFO: loaded from: classes.dex */
public class C0547e1 extends ImageView {

    /* JADX INFO: renamed from: a */
    public final C0111G0 f2019a;

    /* JADX INFO: renamed from: b */
    public final C0528d1 f2020b;

    /* JADX INFO: renamed from: c */
    public boolean f2021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0547e1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0694lf.m1563a(context);
        this.f2021c = false;
        C0542df.m1311a(this, getContext());
        C0111G0 c0111g0 = new C0111G0(this);
        this.f2019a = c0111g0;
        c0111g0.m299d(attributeSet, i);
        C0528d1 c0528d1 = new C0528d1(this);
        this.f2020b = c0528d1;
        c0528d1.m1304b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0111G0 c0111g0 = this.f2019a;
        if (c0111g0 != null) {
            c0111g0.m296a();
        }
        C0528d1 c0528d1 = this.f2020b;
        if (c0528d1 != null) {
            c0528d1.m1303a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0111G0 c0111g0 = this.f2019a;
        if (c0111g0 != null) {
            return c0111g0.m297b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0111G0 c0111g0 = this.f2019a;
        if (c0111g0 != null) {
            return c0111g0.m298c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0713mf c0713mf;
        C0528d1 c0528d1 = this.f2020b;
        if (c0528d1 == null || (c0713mf = c0528d1.f1919b) == null) {
            return null;
        }
        return c0713mf.f2693a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0713mf c0713mf;
        C0528d1 c0528d1 = this.f2020b;
        if (c0528d1 == null || (c0713mf = c0528d1.f1919b) == null) {
            return null;
        }
        return c0713mf.f2694b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f2020b.f1918a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0111G0 c0111g0 = this.f2019a;
        if (c0111g0 != null) {
            c0111g0.m300e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0111G0 c0111g0 = this.f2019a;
        if (c0111g0 != null) {
            c0111g0.m301f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0528d1 c0528d1 = this.f2020b;
        if (c0528d1 != null) {
            c0528d1.m1303a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0528d1 c0528d1 = this.f2020b;
        if (c0528d1 != null && drawable != null && !this.f2021c) {
            c0528d1.f1920c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0528d1 != null) {
            c0528d1.m1303a();
            if (this.f2021c) {
                return;
            }
            ImageView imageView = c0528d1.f1918a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0528d1.f1920c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f2021c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0528d1 c0528d1 = this.f2020b;
        if (c0528d1 != null) {
            ImageView imageView = c0528d1.f1918a;
            if (i != 0) {
                Drawable drawableM2115A = C0889w1.m2115A(imageView.getContext(), i);
                if (drawableM2115A != null) {
                    C0912x5.m2198a(drawableM2115A);
                }
                imageView.setImageDrawable(drawableM2115A);
            } else {
                imageView.setImageDrawable(null);
            }
            c0528d1.m1303a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0528d1 c0528d1 = this.f2020b;
        if (c0528d1 != null) {
            c0528d1.m1303a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0111G0 c0111g0 = this.f2019a;
        if (c0111g0 != null) {
            c0111g0.m303h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0111G0 c0111g0 = this.f2019a;
        if (c0111g0 != null) {
            c0111g0.m304i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0528d1 c0528d1 = this.f2020b;
        if (c0528d1 != null) {
            if (c0528d1.f1919b == null) {
                c0528d1.f1919b = new C0713mf();
            }
            C0713mf c0713mf = c0528d1.f1919b;
            c0713mf.f2693a = colorStateList;
            c0713mf.f2696d = true;
            c0528d1.m1303a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0528d1 c0528d1 = this.f2020b;
        if (c0528d1 != null) {
            if (c0528d1.f1919b == null) {
                c0528d1.f1919b = new C0713mf();
            }
            C0713mf c0713mf = c0528d1.f1919b;
            c0713mf.f2694b = mode;
            c0713mf.f2695c = true;
            c0528d1.m1303a();
        }
    }
}
