package p000a;

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
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.H0 */
/* JADX INFO: loaded from: classes.dex */
public class C0129H0 extends Button {

    /* JADX INFO: renamed from: a */
    public final C0111G0 f426a;

    /* JADX INFO: renamed from: b */
    public final C0756p1 f427b;

    /* JADX INFO: renamed from: c */
    public C0490b1 f428c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0129H0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0983R.attr.buttonStyle);
    }

    private C0490b1 getEmojiTextViewHelper() {
        if (this.f428c == null) {
            this.f428c = new C0490b1(this);
        }
        return this.f428c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0111G0 c0111g0 = this.f426a;
        if (c0111g0 != null) {
            c0111g0.m296a();
        }
        C0756p1 c0756p1 = this.f427b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
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
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0466Ze.m1121b(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0111G0 c0111g0 = this.f426a;
        if (c0111g0 != null) {
            return c0111g0.m297b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0111G0 c0111g0 = this.f426a;
        if (c0111g0 != null) {
            return c0111g0.m298c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f427b.m1784d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f427b.m1785e();
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
        C0756p1 c0756p1 = this.f427b;
        if (c0756p1 != null) {
            c0756p1.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m1191c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0111G0 c0111g0 = this.f426a;
        if (c0111g0 != null) {
            c0111g0.m300e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0111G0 c0111g0 = this.f426a;
        if (c0111g0 != null) {
            c0111g0.m301f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1192d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1189a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0756p1 c0756p1 = this.f427b;
        if (c0756p1 != null) {
            c0756p1.f2965a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0111G0 c0111g0 = this.f426a;
        if (c0111g0 != null) {
            c0111g0.m303h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0111G0 c0111g0 = this.f426a;
        if (c0111g0 != null) {
            c0111g0.m304i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0756p1 c0756p1 = this.f427b;
        c0756p1.m1788i(colorStateList);
        c0756p1.m1783b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0756p1 c0756p1 = this.f427b;
        c0756p1.m1789j(mode);
        c0756p1.m1783b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0756p1 c0756p1 = this.f427b;
        if (c0756p1 != null) {
            c0756p1.m1787g(context, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129H0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0694lf.m1563a(context);
        C0542df.m1311a(this, getContext());
        C0111G0 c0111g0 = new C0111G0(this);
        this.f426a = c0111g0;
        c0111g0.m299d(attributeSet, i);
        C0756p1 c0756p1 = new C0756p1(this);
        this.f427b = c0756p1;
        c0756p1.m1786f(attributeSet, i);
        c0756p1.m1783b();
        getEmojiTextViewHelper().m1190b(attributeSet, i);
    }
}
