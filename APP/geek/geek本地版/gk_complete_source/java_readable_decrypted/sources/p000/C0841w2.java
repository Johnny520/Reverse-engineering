package p000;

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

/* JADX INFO: renamed from: w2 */
/* JADX INFO: loaded from: classes.dex */
public class C0841w2 extends Button {

    /* JADX INFO: renamed from: a */
    public final C0804v2 f4904a;

    /* JADX INFO: renamed from: b */
    public final C0139d5 f4905b;

    /* JADX INFO: renamed from: c */
    public C0879x3 f4906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0841w2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        x60.m2614a(context);
        r60.m2247a(this, getContext());
        C0804v2 c0804v2 = new C0804v2(this);
        this.f4904a = c0804v2;
        c0804v2.m2482d(attributeSet, i);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f4905b = c0139d5;
        c0139d5.m916f(attributeSet, i);
        c0139d5.m913b();
        getEmojiTextViewHelper().m2605a(attributeSet, i);
    }

    private C0879x3 getEmojiTextViewHelper() {
        if (this.f4906c == null) {
            this.f4906c = new C0879x3(this);
        }
        return this.f4906c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0804v2 c0804v2 = this.f4904a;
        if (c0804v2 != null) {
            c0804v2.m2479a();
        }
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (cb0.f943b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1375i.f3338e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (cb0.f943b) {
            return super.getAutoSizeMinTextSize();
        }
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1375i.f3337d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (cb0.f943b) {
            return super.getAutoSizeStepGranularity();
        }
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1375i.f3336c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (cb0.f943b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0139d5 c0139d5 = this.f4905b;
        return c0139d5 != null ? c0139d5.f1375i.f3339f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (cb0.f943b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            return c0139d5.f1375i.f3334a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof o60 ? ((o60) customSelectionActionModeCallback).f3499a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0804v2 c0804v2 = this.f4904a;
        if (c0804v2 != null) {
            return c0804v2.m2480b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0804v2 c0804v2 = this.f4904a;
        if (c0804v2 != null) {
            return c0804v2.m2481c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4905b.m914d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4905b.m915e();
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
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 == null || cb0.f943b) {
            return;
        }
        c0139d5.f1375i.m1908a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            C0510n5 c0510n5 = c0139d5.f1375i;
            if (cb0.f943b || !c0510n5.m1910f()) {
                return;
            }
            c0510n5.m1908a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m2606b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (cb0.f943b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            c0139d5.m918i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (cb0.f943b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            c0139d5.m919j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (cb0.f943b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            c0139d5.m920k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0804v2 c0804v2 = this.f4904a;
        if (c0804v2 != null) {
            c0804v2.m2483e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0804v2 c0804v2 = this.f4904a;
        if (c0804v2 != null) {
            c0804v2.m2484f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0979zt.m2822S(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m2607c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a80) getEmojiTextViewHelper().f5089b.f2980b).mo64l(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            c0139d5.f1367a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0804v2 c0804v2 = this.f4904a;
        if (c0804v2 != null) {
            c0804v2.m2486h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0804v2 c0804v2 = this.f4904a;
        if (c0804v2 != null) {
            c0804v2.m2487i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f4905b;
        c0139d5.m921l(colorStateList);
        c0139d5.m913b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f4905b;
        c0139d5.m922m(mode);
        c0139d5.m913b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            c0139d5.m917g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = cb0.f943b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0139d5 c0139d5 = this.f4905b;
        if (c0139d5 != null) {
            C0510n5 c0510n5 = c0139d5.f1375i;
            if (z || c0510n5.m1910f()) {
                return;
            }
            c0510n5.m1911g(i, f);
        }
    }
}
