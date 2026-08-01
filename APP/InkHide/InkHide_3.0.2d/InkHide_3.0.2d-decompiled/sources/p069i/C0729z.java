package p069i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: i.z */
/* JADX INFO: loaded from: classes.dex */
public class C0729z extends ImageView {

    /* JADX INFO: renamed from: b */
    public final C0704p f2479b;

    /* JADX INFO: renamed from: c */
    public final C0727y f2480c;

    /* JADX INFO: renamed from: d */
    public boolean f2481d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0729z(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC0673e1.m1303a(context);
        this.f2481d = false;
        AbstractC0670d1.m1297a(this, getContext());
        C0704p c0704p = new C0704p(this);
        this.f2479b = c0704p;
        c0704p.m1330d(attributeSet, i2);
        C0727y c0727y = new C0727y(this);
        this.f2480c = c0727y;
        c0727y.m1377b(attributeSet, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0704p c0704p = this.f2479b;
        if (c0704p != null) {
            c0704p.m1327a();
        }
        C0727y c0727y = this.f2480c;
        if (c0727y != null) {
            c0727y.m1376a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        C0704p c0704p = this.f2479b;
        if (c0704p != null) {
            return c0704p.m1328b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0704p c0704p = this.f2479b;
        if (c0704p != null) {
            return c0704p.m1329c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportImageTintList() {
        C0676f1 c0676f1;
        C0727y c0727y = this.f2480c;
        if (c0727y == null || (c0676f1 = c0727y.f2462b) == null) {
            return null;
        }
        return c0676f1.f2287a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportImageTintMode() {
        C0676f1 c0676f1;
        C0727y c0727y = this.f2480c;
        if (c0727y == null || (c0676f1 = c0727y.f2462b) == null) {
            return null;
        }
        return c0676f1.f2288b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f2480c.f2461a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0704p c0704p = this.f2479b;
        if (c0704p != null) {
            c0704p.m1331e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0704p c0704p = this.f2479b;
        if (c0704p != null) {
            c0704p.m1332f(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0727y c0727y = this.f2480c;
        if (c0727y != null) {
            c0727y.m1376a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0727y c0727y = this.f2480c;
        if (c0727y != null && drawable != null && !this.f2481d) {
            c0727y.f2463c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0727y != null) {
            c0727y.m1376a();
            if (this.f2481d) {
                return;
            }
            ImageView imageView = c0727y.f2461a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0727y.f2463c);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f2481d = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0727y c0727y = this.f2480c;
        if (c0727y != null) {
            ImageView imageView = c0727y.f2461a;
            if (i2 != 0) {
                Drawable drawableM992y = AbstractC0503h.m992y(imageView.getContext(), i2);
                if (drawableM992y != null) {
                    AbstractC0705p0.m1336a(drawableM992y);
                }
                imageView.setImageDrawable(drawableM992y);
            } else {
                imageView.setImageDrawable(null);
            }
            c0727y.m1376a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0727y c0727y = this.f2480c;
        if (c0727y != null) {
            c0727y.m1376a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0704p c0704p = this.f2479b;
        if (c0704p != null) {
            c0704p.m1334h(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0704p c0704p = this.f2479b;
        if (c0704p != null) {
            c0704p.m1335i(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0727y c0727y = this.f2480c;
        if (c0727y != null) {
            if (c0727y.f2462b == null) {
                c0727y.f2462b = new C0676f1();
            }
            C0676f1 c0676f1 = c0727y.f2462b;
            c0676f1.f2287a = colorStateList;
            c0676f1.f2290d = true;
            c0727y.m1376a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0727y c0727y = this.f2480c;
        if (c0727y != null) {
            if (c0727y.f2462b == null) {
                c0727y.f2462b = new C0676f1();
            }
            C0676f1 c0676f1 = c0727y.f2462b;
            c0676f1.f2288b = mode;
            c0676f1.f2289c = true;
            c0727y.m1376a();
        }
    }
}
