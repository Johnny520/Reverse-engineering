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
import androidx.core.widget.ActionModeCallbackC3132;
import p069.AbstractC7390;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1042 extends Button {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1059 f1112;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0974 f1113;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1038 f1114;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0988.m1157(context);
        AbstractC0999.m1167(getContext(), this);
        C1038 c1038 = new C1038(this);
        this.f1114 = c1038;
        c1038.m1226(attributeSet, i);
        C1059 c1059 = new C1059(this);
        this.f1112 = c1059;
        c1059.m1267(attributeSet, i);
        c1059.m1270();
        getEmojiTextViewHelper().m1095(attributeSet, i);
    }

    private C0974 getEmojiTextViewHelper() {
        if (this.f1113 == null) {
            this.f1113 = new C0974(this);
        }
        return this.f1113;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1038 c1038 = this.f1114;
        if (c1038 != null) {
            c1038.m1238();
        }
        C1059 c1059 = this.f1112;
        if (c1059 != null) {
            c1059.m1270();
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
        return customSelectionActionModeCallback instanceof ActionModeCallbackC3132 ? ((ActionModeCallbackC3132) customSelectionActionModeCallback).f7042 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1038 c1038 = this.f1114;
        if (c1038 != null) {
            return c1038.m1241();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1038 c1038 = this.f1114;
        if (c1038 != null) {
            return c1038.m1242();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1112.m1269();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1112.m1268();
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
        C1059 c1059 = this.f1112;
        if (c1059 != null) {
            c1059.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m1094(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1038 c1038 = this.f1114;
        if (c1038 != null) {
            c1038.m1224();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1038 c1038 = this.f1114;
        if (c1038 != null) {
            c1038.m1223(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC7390.m12619(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1093(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC9019) getEmojiTextViewHelper().f906.f16359).mo13548(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C1059 c1059 = this.f1112;
        if (c1059 != null) {
            c1059.f1164.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1038 c1038 = this.f1114;
        if (c1038 != null) {
            c1038.m1218(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1038 c1038 = this.f1114;
        if (c1038 != null) {
            c1038.m1221(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1059 c1059 = this.f1112;
        c1059.m1272(colorStateList);
        c1059.m1270();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1059 c1059 = this.f1112;
        c1059.m1274(mode);
        c1059.m1270();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1059 c1059 = this.f1112;
        if (c1059 != null) {
            c1059.m1273(context, i);
        }
    }
}
