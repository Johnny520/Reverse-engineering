package p000;

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

/* JADX INFO: renamed from: K3 */
/* JADX INFO: loaded from: classes.dex */
public class C0434K3 extends ImageButton {

    /* JADX INFO: renamed from: a */
    public final C1349e3 f1424a;

    /* JADX INFO: renamed from: b */
    public final C0477L3 f1425b;

    /* JADX INFO: renamed from: c */
    public boolean f1426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0434K3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1533iB.m2903a(context);
        this.f1426c = false;
        AbstractC1042YA.m1987a(getContext(), this);
        C1349e3 c1349e3 = new C1349e3(this);
        this.f1424a = c1349e3;
        c1349e3.m2603d(attributeSet, i);
        C0477L3 c0477l3 = new C0477L3(this);
        this.f1425b = c0477l3;
        c0477l3.m936e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 c1349e3 = this.f1424a;
        if (c1349e3 != null) {
            c1349e3.m2600a();
        }
        C0477L3 c0477l3 = this.f1425b;
        if (c0477l3 != null) {
            c0477l3.m933a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 c1349e3 = this.f1424a;
        if (c1349e3 != null) {
            return c1349e3.m2601b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 c1349e3 = this.f1424a;
        if (c1349e3 != null) {
            return c1349e3.m2602c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2090jB c2090jB;
        C0477L3 c0477l3 = this.f1425b;
        if (c0477l3 == null || (c2090jB = (C2090jB) c0477l3.f1576d) == null) {
            return null;
        }
        return c2090jB.f7358a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2090jB c2090jB;
        C0477L3 c0477l3 = this.f1425b;
        if (c0477l3 == null || (c2090jB = (C2090jB) c0477l3.f1576d) == null) {
            return null;
        }
        return c2090jB.f7359b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f1425b.f1575c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1349e3 c1349e3 = this.f1424a;
        if (c1349e3 != null) {
            c1349e3.m2604e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1349e3 c1349e3 = this.f1424a;
        if (c1349e3 != null) {
            c1349e3.m2605f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0477L3 c0477l3 = this.f1425b;
        if (c0477l3 != null) {
            c0477l3.m933a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0477L3 c0477l3 = this.f1425b;
        if (c0477l3 != null && drawable != null && !this.f1426c) {
            c0477l3.f1574b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0477l3 != null) {
            c0477l3.m933a();
            if (this.f1426c) {
                return;
            }
            ImageView imageView = (ImageView) c0477l3.f1575c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0477l3.f1574b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1426c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0477L3 c0477l3 = this.f1425b;
        ImageView imageView = (ImageView) c0477l3.f1575c;
        if (i != 0) {
            Drawable drawableM2695U = AbstractC1406fG.m2695U(imageView.getContext(), i);
            if (drawableM2695U != null) {
                AbstractC0107Ce.m159a(drawableM2695U);
            }
            imageView.setImageDrawable(drawableM2695U);
        } else {
            imageView.setImageDrawable(null);
        }
        c0477l3.m933a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0477L3 c0477l3 = this.f1425b;
        if (c0477l3 != null) {
            c0477l3.m933a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1349e3 c1349e3 = this.f1424a;
        if (c1349e3 != null) {
            c1349e3.m2607h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1349e3 c1349e3 = this.f1424a;
        if (c1349e3 != null) {
            c1349e3.m2608i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0477L3 c0477l3 = this.f1425b;
        if (c0477l3 != null) {
            if (((C2090jB) c0477l3.f1576d) == null) {
                c0477l3.f1576d = new C2090jB();
            }
            C2090jB c2090jB = (C2090jB) c0477l3.f1576d;
            c2090jB.f7358a = colorStateList;
            c2090jB.f7361d = true;
            c0477l3.m933a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0477L3 c0477l3 = this.f1425b;
        if (c0477l3 != null) {
            if (((C2090jB) c0477l3.f1576d) == null) {
                c0477l3.f1576d = new C2090jB();
            }
            C2090jB c2090jB = (C2090jB) c0477l3.f1576d;
            c2090jB.f7359b = mode;
            c2090jB.f7360c = true;
            c0477l3.m933a();
        }
    }
}
