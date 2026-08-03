package Yue;

import Yue.C6898;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3278 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final View f187;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C7835 f5152;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C7835 f5153;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C7835 f5154;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5151 = -1;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C3304 f188 = C3304.m368();

    public C3278(@InterfaceC6391 View view) {
        this.f187 = view;
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m348(@InterfaceC6391 Drawable drawable) {
        if (this.f5154 == null) {
            this.f5154 = new C7835();
        }
        C7835 c7835 = this.f5154;
        c7835.m3932();
        ColorStateList colorStateListM27342 = C8273.m27342(this.f187);
        if (colorStateListM27342 != null) {
            c7835.f23447 = true;
            c7835.f3108 = colorStateListM27342;
        }
        PorterDuff.Mode modeM27343 = C8273.m27343(this.f187);
        if (modeM27343 != null) {
            c7835.f23446 = true;
            c7835.f3109 = modeM27343;
        }
        if (!c7835.f23447 && !c7835.f23446) {
            return false;
        }
        C3304.m6744(drawable, c7835, this.f187.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m349() {
        Drawable background = this.f187.getBackground();
        if (background != null) {
            if (m6731() && m348(background)) {
                return;
            }
            C7835 c7835 = this.f5153;
            if (c7835 != null) {
                C3304.m6744(background, c7835, this.f187.getDrawableState());
                return;
            }
            C7835 c78352 = this.f5152;
            if (c78352 != null) {
                C3304.m6744(background, c78352, this.f187.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ColorStateList m6723() {
        C7835 c7835 = this.f5153;
        if (c7835 != null) {
            return c7835.f3108;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public PorterDuff.Mode m6724() {
        C7835 c7835 = this.f5153;
        if (c7835 != null) {
            return c7835.f3109;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m6725(@InterfaceC6490 AttributeSet attributeSet, int i) {
        C7837 c7837M24869 = C7837.m24869(this.f187.getContext(), attributeSet, C6898.C6909.f19783, i, 0);
        View view = this.f187;
        C8273.m27437(view, view.getContext(), C6898.C6909.f19783, attributeSet, c7837M24869.m24895(), i, 0);
        try {
            if (c7837M24869.m24896(C6898.C6909.f19784)) {
                this.f5151 = c7837M24869.m24888(C6898.C6909.f19784, -1);
                ColorStateList colorStateListM6747 = this.f188.m6747(this.f187.getContext(), this.f5151);
                if (colorStateListM6747 != null) {
                    m6728(colorStateListM6747);
                }
            }
            if (c7837M24869.m24896(C6898.C6909.f19785)) {
                C8273.m27448(this.f187, c7837M24869.m24871(C6898.C6909.f19785));
            }
            if (c7837M24869.m24896(C6898.C6909.f19786)) {
                C8273.m27449(this.f187, C4533.m13289(c7837M24869.m24882(C6898.C6909.f19786, -1), null));
            }
            c7837M24869.m24899();
        } catch (Throwable th) {
            c7837M24869.m24899();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m6726(Drawable drawable) {
        this.f5151 = -1;
        m6728(null);
        m349();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m6727(int i) {
        this.f5151 = i;
        C3304 c3304 = this.f188;
        m6728(c3304 != null ? c3304.m6747(this.f187.getContext(), i) : null);
        m349();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m6728(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f5152 == null) {
                this.f5152 = new C7835();
            }
            C7835 c7835 = this.f5152;
            c7835.f3108 = colorStateList;
            c7835.f23447 = true;
        } else {
            this.f5152 = null;
        }
        m349();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m6729(ColorStateList colorStateList) {
        if (this.f5153 == null) {
            this.f5153 = new C7835();
        }
        C7835 c7835 = this.f5153;
        c7835.f3108 = colorStateList;
        c7835.f23447 = true;
        m349();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m6730(PorterDuff.Mode mode) {
        if (this.f5153 == null) {
            this.f5153 = new C7835();
        }
        C7835 c7835 = this.f5153;
        c7835.f3109 = mode;
        c7835.f23446 = true;
        m349();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m6731() {
        return this.f5152 != null;
    }
}
