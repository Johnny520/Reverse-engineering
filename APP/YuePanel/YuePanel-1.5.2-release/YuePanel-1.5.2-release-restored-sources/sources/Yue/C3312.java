package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C3312 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final ImageView f214;

    /* JADX INFO: renamed from: ۥ۟ */
    public C7835 f215;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C7835 f5202;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C7835 f5203;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5204 = 0;

    public C3312(@InterfaceC6391 ImageView imageView) {
        this.f214 = imageView;
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m380(@InterfaceC6391 Drawable drawable) {
        if (this.f5203 == null) {
            this.f5203 = new C7835();
        }
        C7835 c7835 = this.f5203;
        c7835.m3932();
        ColorStateList colorStateListM2190 = C5421.m2190(this.f214);
        if (colorStateListM2190 != null) {
            c7835.f23447 = true;
            c7835.f3108 = colorStateListM2190;
        }
        PorterDuff.Mode modeM2191 = C5421.m2191(this.f214);
        if (modeM2191 != null) {
            c7835.f23446 = true;
            c7835.f3109 = modeM2191;
        }
        if (!c7835.f23447 && !c7835.f23446) {
            return false;
        }
        C3304.m6744(drawable, c7835, this.f214.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m381() {
        if (this.f214.getDrawable() != null) {
            this.f214.getDrawable().setLevel(this.f5204);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m6770() {
        Drawable drawable = this.f214.getDrawable();
        if (drawable != null) {
            C4533.m1469(drawable);
        }
        if (drawable != null) {
            if (m6780() && m380(drawable)) {
                return;
            }
            C7835 c7835 = this.f5202;
            if (c7835 != null) {
                C3304.m6744(drawable, c7835, this.f214.getDrawableState());
                return;
            }
            C7835 c78352 = this.f215;
            if (c78352 != null) {
                C3304.m6744(drawable, c78352, this.f214.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public ColorStateList m6771() {
        C7835 c7835 = this.f5202;
        if (c7835 != null) {
            return c7835.f3108;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public PorterDuff.Mode m6772() {
        C7835 c7835 = this.f5202;
        if (c7835 != null) {
            return c7835.f3109;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m6773() {
        return !(this.f214.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m6774(AttributeSet attributeSet, int i) {
        int iM24888;
        C7837 c7837M24869 = C7837.m24869(this.f214.getContext(), attributeSet, C6898.C6909.f19420, i, 0);
        ImageView imageView = this.f214;
        C8273.m27437(imageView, imageView.getContext(), C6898.C6909.f19420, attributeSet, c7837M24869.m24895(), i, 0);
        try {
            Drawable drawable = this.f214.getDrawable();
            if (drawable == null && (iM24888 = c7837M24869.m24888(C6898.C6909.f19422, -1)) != -1 && (drawable = C3323.m396(this.f214.getContext(), iM24888)) != null) {
                this.f214.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C4533.m1469(drawable);
            }
            if (c7837M24869.m24896(C6898.C6909.f19423)) {
                C5421.m16907(this.f214, c7837M24869.m24871(C6898.C6909.f19423));
            }
            if (c7837M24869.m24896(C6898.C6909.f19424)) {
                C5421.m16908(this.f214, C4533.m13289(c7837M24869.m24882(C6898.C6909.f19424, -1), null));
            }
            c7837M24869.m24899();
        } catch (Throwable th) {
            c7837M24869.m24899();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m6775(@InterfaceC6391 Drawable drawable) {
        this.f5204 = drawable.getLevel();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m6776(int i) {
        if (i != 0) {
            Drawable drawableM396 = C3323.m396(this.f214.getContext(), i);
            if (drawableM396 != null) {
                C4533.m1469(drawableM396);
            }
            this.f214.setImageDrawable(drawableM396);
        } else {
            this.f214.setImageDrawable(null);
        }
        m6770();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m6777(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f215 == null) {
                this.f215 = new C7835();
            }
            C7835 c7835 = this.f215;
            c7835.f3108 = colorStateList;
            c7835.f23447 = true;
        } else {
            this.f215 = null;
        }
        m6770();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m6778(ColorStateList colorStateList) {
        if (this.f5202 == null) {
            this.f5202 = new C7835();
        }
        C7835 c7835 = this.f5202;
        c7835.f3108 = colorStateList;
        c7835.f23447 = true;
        m6770();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m6779(PorterDuff.Mode mode) {
        if (this.f5202 == null) {
            this.f5202 = new C7835();
        }
        C7835 c7835 = this.f5202;
        c7835.f3109 = mode;
        c7835.f23446 = true;
        m6770();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m6780() {
        return this.f215 != null;
    }
}
