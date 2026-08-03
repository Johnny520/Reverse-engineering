package Yue;

import Yue.InterfaceC7144;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3352 extends ToggleButton implements InterfaceC7838, InterfaceC4608, InterfaceC7841 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C3278 f5313;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final C3337 f5314;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C3308 f5315;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3352(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6391
    private C3308 getEmojiTextViewHelper() {
        if (this.f5315 == null) {
            this.f5315 = new C3308(this);
        }
        return this.f5315;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3278 c3278 = this.f5313;
        if (c3278 != null) {
            c3278.m349();
        }
        C3337 c3337 = this.f5314;
        if (c3337 != null) {
            c3337.m410();
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportBackgroundTintList() {
        C3278 c3278 = this.f5313;
        if (c3278 != null) {
            return c3278.m6723();
        }
        return null;
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3278 c3278 = this.f5313;
        if (c3278 != null) {
            return c3278.m6724();
        }
        return null;
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5314.m6816();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5314.m6817();
    }

    @Override // Yue.InterfaceC4608
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m377();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m6767(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3278 c3278 = this.f5313;
        if (c3278 != null) {
            c3278.m6726(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4525 int i) {
        super.setBackgroundResource(i);
        C3278 c3278 = this.f5313;
        if (c3278 != null) {
            c3278.m6727(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.f5314;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.f5314;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // Yue.InterfaceC4608
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m6768(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@InterfaceC6391 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m376(inputFilterArr));
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3278 c3278 = this.f5313;
        if (c3278 != null) {
            c3278.m6729(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3278 c3278 = this.f5313;
        if (c3278 != null) {
            c3278.m6730(mode);
        }
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.f5314.m6829(colorStateList);
        this.f5314.m410();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.f5314.m6830(mode);
        this.f5314.m410();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3352(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public C3352(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C7772.m3866(this, getContext());
        C3278 c3278 = new C3278(this);
        this.f5313 = c3278;
        c3278.m6725(attributeSet, i);
        C3337 c3337 = new C3337(this);
        this.f5314 = c3337;
        c3337.m6819(attributeSet, i);
        getEmojiTextViewHelper().m6766(attributeSet, i);
    }
}
