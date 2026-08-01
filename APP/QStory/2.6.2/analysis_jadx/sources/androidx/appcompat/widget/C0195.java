package androidx.appcompat.widget;

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
import androidx.core.widget.ActionModeCallbackC2299;
import p053.AbstractC6560;
import p251.AbstractC8174;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0195 extends Button {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0212 f767;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0127 f768;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0191 f769;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0195(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0141.m596(context);
        AbstractC0152.m606(getContext(), this);
        C0191 c0191 = new C0191(this);
        this.f769 = c0191;
        c0191.m665(attributeSet, i);
        C0212 c0212 = new C0212(this);
        this.f767 = c0212;
        c0212.m706(attributeSet, i);
        c0212.m709();
        getEmojiTextViewHelper().m534(attributeSet, i);
    }

    private C0127 getEmojiTextViewHelper() {
        if (this.f768 == null) {
            this.f768 = new C0127(this);
        }
        return this.f768;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f769;
        if (c0191 != null) {
            c0191.m677();
        }
        C0212 c0212 = this.f767;
        if (c0212 != null) {
            c0212.m709();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2299 ? ((ActionModeCallbackC2299) customSelectionActionModeCallback).f6696 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f769;
        if (c0191 != null) {
            return c0191.m680();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f769;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f767.m708();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f767.m707();
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
        C0212 c0212 = this.f767;
        if (c0212 != null) {
            c0212.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m533(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f769;
        if (c0191 != null) {
            c0191.m663();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f769;
        if (c0191 != null) {
            c0191.m662(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC8174.m13594(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m532(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC6560) getEmojiTextViewHelper().f561.f16007).mo12045(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0212 c0212 = this.f767;
        if (c0212 != null) {
            c0212.f819.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f769;
        if (c0191 != null) {
            c0191.m657(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f769;
        if (c0191 != null) {
            c0191.m660(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0212 c0212 = this.f767;
        c0212.m711(colorStateList);
        c0212.m709();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0212 c0212 = this.f767;
        c0212.m713(mode);
        c0212.m709();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0212 c0212 = this.f767;
        if (c0212 != null) {
            c0212.m712(context, i);
        }
    }
}
