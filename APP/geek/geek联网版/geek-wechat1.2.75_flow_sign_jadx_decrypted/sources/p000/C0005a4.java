package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: a4 */
/* JADX INFO: loaded from: classes.dex */
public class C0005a4 extends ImageView {

    /* JADX INFO: renamed from: a */
    public final C0803v2 f23a;

    /* JADX INFO: renamed from: b */
    public final C0953z3 f24b;

    /* JADX INFO: renamed from: c */
    public boolean f25c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0005a4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d70.m881a(context);
        this.f25c = false;
        x60.m2635a(this, getContext());
        C0803v2 c0803v2 = new C0803v2(this);
        this.f23a = c0803v2;
        c0803v2.m2536d(attributeSet, i);
        C0953z3 c0953z3 = new C0953z3(this);
        this.f24b = c0953z3;
        c0953z3.m2791d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803v2 c0803v2 = this.f23a;
        if (c0803v2 != null) {
            c0803v2.m2533a();
        }
        C0953z3 c0953z3 = this.f24b;
        if (c0953z3 != null) {
            c0953z3.m2789a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0803v2 c0803v2 = this.f23a;
        if (c0803v2 != null) {
            return c0803v2.m2534b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0803v2 c0803v2 = this.f23a;
        if (c0803v2 != null) {
            return c0803v2.m2535c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e70 e70Var;
        C0953z3 c0953z3 = this.f24b;
        if (c0953z3 == null || (e70Var = (e70) c0953z3.f5537c) == null) {
            return null;
        }
        return e70Var.f1522a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e70 e70Var;
        C0953z3 c0953z3 = this.f24b;
        if (c0953z3 == null || (e70Var = (e70) c0953z3.f5537c) == null) {
            return null;
        }
        return e70Var.f1523b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f24b.f5536b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803v2 c0803v2 = this.f23a;
        if (c0803v2 != null) {
            c0803v2.m2537e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803v2 c0803v2 = this.f23a;
        if (c0803v2 != null) {
            c0803v2.m2538f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0953z3 c0953z3 = this.f24b;
        if (c0953z3 != null) {
            c0953z3.m2789a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0953z3 c0953z3 = this.f24b;
        if (c0953z3 != null && drawable != null && !this.f25c) {
            c0953z3.f5535a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0953z3 != null) {
            c0953z3.m2789a();
            if (this.f25c) {
                return;
            }
            ImageView imageView = (ImageView) c0953z3.f5536b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0953z3.f5535a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f25c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0953z3 c0953z3 = this.f24b;
        if (c0953z3 != null) {
            ImageView imageView = (ImageView) c0953z3.f5536b;
            if (i != 0) {
                Drawable drawableM1261w = AbstractC0259gf.m1261w(imageView.getContext(), i);
                if (drawableM1261w != null) {
                    AbstractC0261gh.m1275a(drawableM1261w);
                }
                imageView.setImageDrawable(drawableM1261w);
            } else {
                imageView.setImageDrawable(null);
            }
            c0953z3.m2789a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0953z3 c0953z3 = this.f24b;
        if (c0953z3 != null) {
            c0953z3.m2789a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803v2 c0803v2 = this.f23a;
        if (c0803v2 != null) {
            c0803v2.m2540h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803v2 c0803v2 = this.f23a;
        if (c0803v2 != null) {
            c0803v2.m2541i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0953z3 c0953z3 = this.f24b;
        if (c0953z3 != null) {
            if (((e70) c0953z3.f5537c) == null) {
                c0953z3.f5537c = new e70();
            }
            e70 e70Var = (e70) c0953z3.f5537c;
            e70Var.f1522a = colorStateList;
            e70Var.f1525d = true;
            c0953z3.m2789a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0953z3 c0953z3 = this.f24b;
        if (c0953z3 != null) {
            if (((e70) c0953z3.f5537c) == null) {
                c0953z3.f5537c = new e70();
            }
            e70 e70Var = (e70) c0953z3.f5537c;
            e70Var.f1523b = mode;
            e70Var.f1524c = true;
            c0953z3.m2789a();
        }
    }
}
