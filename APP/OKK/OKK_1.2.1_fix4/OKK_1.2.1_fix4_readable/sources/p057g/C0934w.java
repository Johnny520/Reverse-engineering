package p057g;

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
import com.abc.core.features.C0691r1;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: g.w */
/* JADX INFO: loaded from: classes.dex */
public class C0934w extends ImageButton {

    /* JADX INFO: renamed from: a */
    public final C0916n f3315a;

    /* JADX INFO: renamed from: b */
    public final C0691r1 f3316b;

    /* JADX INFO: renamed from: c */
    public boolean f3317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934w(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC0851B0.m2165a(context);
        this.f3317c = false;
        AbstractC0849A0.m2159a(this, getContext());
        C0916n c0916n = new C0916n(this);
        this.f3315a = c0916n;
        c0916n.m2243d(attributeSet, i2);
        C0691r1 c0691r1 = new C0691r1(this);
        this.f3316b = c0691r1;
        c0691r1.m1787b(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n c0916n = this.f3315a;
        if (c0916n != null) {
            c0916n.m2240a();
        }
        C0691r1 c0691r1 = this.f3316b;
        if (c0691r1 != null) {
            c0691r1.m1786a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n c0916n = this.f3315a;
        if (c0916n != null) {
            return c0916n.m2241b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n c0916n = this.f3315a;
        if (c0916n != null) {
            return c0916n.m2242c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0853C0 c0853c0;
        C0691r1 c0691r1 = this.f3316b;
        if (c0691r1 == null || (c0853c0 = (C0853C0) c0691r1.f2185c) == null) {
            return null;
        }
        return c0853c0.f3084a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0853C0 c0853c0;
        C0691r1 c0691r1 = this.f3316b;
        if (c0691r1 == null || (c0853c0 = (C0853C0) c0691r1.f2185c) == null) {
            return null;
        }
        return c0853c0.f3085b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.f3316b.f2184b).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0916n c0916n = this.f3315a;
        if (c0916n != null) {
            c0916n.m2244e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0916n c0916n = this.f3315a;
        if (c0916n != null) {
            c0916n.m2245f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0691r1 c0691r1 = this.f3316b;
        if (c0691r1 != null) {
            c0691r1.m1786a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0691r1 c0691r1 = this.f3316b;
        if (c0691r1 != null && drawable != null && !this.f3317c) {
            c0691r1.f2183a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0691r1 != null) {
            c0691r1.m1786a();
            if (this.f3317c) {
                return;
            }
            ImageView imageView = (ImageView) c0691r1.f2184b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0691r1.f2183a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f3317c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0691r1 c0691r1 = this.f3316b;
        ImageView imageView = (ImageView) c0691r1.f2184b;
        if (i2 != 0) {
            Drawable drawableM916w = AbstractC0358S.m916w(imageView.getContext(), i2);
            if (drawableM916w != null) {
                AbstractC0886W.m2219a(drawableM916w);
            }
            imageView.setImageDrawable(drawableM916w);
        } else {
            imageView.setImageDrawable(null);
        }
        c0691r1.m1786a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0691r1 c0691r1 = this.f3316b;
        if (c0691r1 != null) {
            c0691r1.m1786a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0916n c0916n = this.f3315a;
        if (c0916n != null) {
            c0916n.m2247h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0916n c0916n = this.f3315a;
        if (c0916n != null) {
            c0916n.m2248i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0691r1 c0691r1 = this.f3316b;
        if (c0691r1 != null) {
            if (((C0853C0) c0691r1.f2185c) == null) {
                c0691r1.f2185c = new C0853C0();
            }
            C0853C0 c0853c0 = (C0853C0) c0691r1.f2185c;
            c0853c0.f3084a = colorStateList;
            c0853c0.f3087d = true;
            c0691r1.m1786a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0691r1 c0691r1 = this.f3316b;
        if (c0691r1 != null) {
            if (((C0853C0) c0691r1.f2185c) == null) {
                c0691r1.f2185c = new C0853C0();
            }
            C0853C0 c0853c0 = (C0853C0) c0691r1.f2185c;
            c0853c0.f3085b = mode;
            c0853c0.f3086c = true;
            c0691r1.m1786a();
        }
    }
}
