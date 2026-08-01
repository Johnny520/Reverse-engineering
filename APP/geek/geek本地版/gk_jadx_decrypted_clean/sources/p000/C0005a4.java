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
    public final C0804v2 f25a;

    /* JADX INFO: renamed from: b */
    public final C0953z3 f26b;

    /* JADX INFO: renamed from: c */
    public boolean f27c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0005a4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        x60.m2614a(context);
        this.f27c = false;
        r60.m2247a(this, getContext());
        C0804v2 c0804v2 = new C0804v2(this);
        this.f25a = c0804v2;
        c0804v2.m2482d(attributeSet, i);
        C0953z3 c0953z3 = new C0953z3(this);
        this.f26b = c0953z3;
        c0953z3.m2755d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0804v2 c0804v2 = this.f25a;
        if (c0804v2 != null) {
            c0804v2.m2479a();
        }
        C0953z3 c0953z3 = this.f26b;
        if (c0953z3 != null) {
            c0953z3.m2753a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0804v2 c0804v2 = this.f25a;
        if (c0804v2 != null) {
            return c0804v2.m2480b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0804v2 c0804v2 = this.f25a;
        if (c0804v2 != null) {
            return c0804v2.m2481c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        y60 y60Var;
        C0953z3 c0953z3 = this.f26b;
        if (c0953z3 == null || (y60Var = (y60) c0953z3.f5448c) == null) {
            return null;
        }
        return y60Var.f5279a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        y60 y60Var;
        C0953z3 c0953z3 = this.f26b;
        if (c0953z3 == null || (y60Var = (y60) c0953z3.f5448c) == null) {
            return null;
        }
        return y60Var.f5280b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f26b.f5447b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0804v2 c0804v2 = this.f25a;
        if (c0804v2 != null) {
            c0804v2.m2483e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0804v2 c0804v2 = this.f25a;
        if (c0804v2 != null) {
            c0804v2.m2484f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0953z3 c0953z3 = this.f26b;
        if (c0953z3 != null) {
            c0953z3.m2753a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0953z3 c0953z3 = this.f26b;
        if (c0953z3 != null && drawable != null && !this.f27c) {
            c0953z3.f5446a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0953z3 != null) {
            c0953z3.m2753a();
            if (this.f27c) {
                return;
            }
            ImageView imageView = (ImageView) c0953z3.f5447b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0953z3.f5446a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f27c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0953z3 c0953z3 = this.f26b;
        if (c0953z3 != null) {
            ImageView imageView = (ImageView) c0953z3.f5447b;
            if (i != 0) {
                Drawable drawableM1196r = AbstractC0222ff.m1196r(imageView.getContext(), i);
                if (drawableM1196r != null) {
                    AbstractC0187eh.m1027a(drawableM1196r);
                }
                imageView.setImageDrawable(drawableM1196r);
            } else {
                imageView.setImageDrawable(null);
            }
            c0953z3.m2753a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0953z3 c0953z3 = this.f26b;
        if (c0953z3 != null) {
            c0953z3.m2753a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0804v2 c0804v2 = this.f25a;
        if (c0804v2 != null) {
            c0804v2.m2486h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0804v2 c0804v2 = this.f25a;
        if (c0804v2 != null) {
            c0804v2.m2487i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0953z3 c0953z3 = this.f26b;
        if (c0953z3 != null) {
            if (((y60) c0953z3.f5448c) == null) {
                c0953z3.f5448c = new y60();
            }
            y60 y60Var = (y60) c0953z3.f5448c;
            y60Var.f5279a = colorStateList;
            y60Var.f5282d = true;
            c0953z3.m2753a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0953z3 c0953z3 = this.f26b;
        if (c0953z3 != null) {
            if (((y60) c0953z3.f5448c) == null) {
                c0953z3.f5448c = new y60();
            }
            y60 y60Var = (y60) c0953z3.f5448c;
            y60Var.f5280b = mode;
            y60Var.f5281c = true;
            c0953z3.m2753a();
        }
    }
}
