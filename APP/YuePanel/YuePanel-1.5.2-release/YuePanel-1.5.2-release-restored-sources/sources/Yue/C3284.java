package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3284 extends Button implements InterfaceC7838, InterfaceC3499, InterfaceC7841, InterfaceC4608 {

    @InterfaceC6391
    private C3308 mAppCompatEmojiTextHelper;
    private final C3278 mBackgroundTintHelper;
    private final C3337 mTextHelper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3284(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6391
    private C3308 getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C3308(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m349();
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m410();
        }
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (C8370.f24972) {
            return super.getAutoSizeMaxTextSize();
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            return c3337.m6811();
        }
        return -1;
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (C8370.f24972) {
            return super.getAutoSizeMinTextSize();
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            return c3337.m6812();
        }
        return -1;
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (C8370.f24972) {
            return super.getAutoSizeStepGranularity();
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            return c3337.m6813();
        }
        return -1;
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (C8370.f24972) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C3337 c3337 = this.mTextHelper;
        return c3337 != null ? c3337.m6814() : new int[0];
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C8370.f24972) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            return c3337.m6815();
        }
        return 0;
    }

    @Override // android.widget.TextView
    @InterfaceC6490
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C7759.m24678(super.getCustomSelectionActionModeCallback());
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportBackgroundTintList() {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            return c3278.m6723();
        }
        return null;
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            return c3278.m6724();
        }
        return null;
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m6816();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m6817();
    }

    @Override // Yue.InterfaceC4608
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m377();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6821(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3337 c3337 = this.mTextHelper;
        if (c3337 == null || C8370.f24972 || !c3337.m6818()) {
            return;
        }
        this.mTextHelper.m6810();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m6767(z);
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C8370.f24972) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6826(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@InterfaceC6391 int[] iArr, int i) throws IllegalArgumentException {
        if (C8370.f24972) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6827(iArr, i);
        }
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C8370.f24972) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6828(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6726(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4525 int i) {
        super.setBackgroundResource(i);
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6727(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@InterfaceC6490 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C7759.m24679(this, callback));
    }

    @Override // Yue.InterfaceC4608
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m6768(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@InterfaceC6391 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m376(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6825(z);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6729(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6730(mode);
        }
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.mTextHelper.m6829(colorStateList);
        this.mTextHelper.m410();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.mTextHelper.m6830(mode);
        this.mTextHelper.m410();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6823(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C8370.f24972) {
            super.setTextSize(i, f);
            return;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6833(i, f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3284(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18416);
    }

    public C3284(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(C7834.m3931(context), attributeSet, i);
        C7772.m3866(this, getContext());
        C3278 c3278 = new C3278(this);
        this.mBackgroundTintHelper = c3278;
        c3278.m6725(attributeSet, i);
        C3337 c3337 = new C3337(this);
        this.mTextHelper = c3337;
        c3337.m6819(attributeSet, i);
        c3337.m410();
        getEmojiTextViewHelper().m6766(attributeSet, i);
    }
}
