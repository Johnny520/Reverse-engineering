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

/* JADX INFO: renamed from: f3 */
/* JADX INFO: loaded from: classes.dex */
public class C1393f3 extends Button {

    /* JADX INFO: renamed from: a */
    public final C1349e3 f4945a;

    /* JADX INFO: renamed from: b */
    public final C2175l4 f4946b;

    /* JADX INFO: renamed from: c */
    public C0391J3 f4947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1393f3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1533iB.m2903a(context);
        AbstractC1042YA.m1987a(getContext(), this);
        C1349e3 c1349e3 = new C1349e3(this);
        this.f4945a = c1349e3;
        c1349e3.m2603d(attributeSet, i);
        C2175l4 c2175l4 = new C2175l4(this);
        this.f4946b = c2175l4;
        c2175l4.m4378f(attributeSet, i);
        c2175l4.m4375b();
        getEmojiTextViewHelper().m829b(attributeSet, i);
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f4947c == null) {
            this.f4947c = new C0391J3(this);
        }
        return this.f4947c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 c1349e3 = this.f4945a;
        if (c1349e3 != null) {
            c1349e3.m2600a();
        }
        C2175l4 c2175l4 = this.f4946b;
        if (c2175l4 != null) {
            c2175l4.m4375b();
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
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 c1349e3 = this.f4945a;
        if (c1349e3 != null) {
            return c1349e3.m2601b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 c1349e3 = this.f4945a;
        if (c1349e3 != null) {
            return c1349e3.m2602c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4946b.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4946b.m4377e();
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
        C2175l4 c2175l4 = this.f4946b;
        if (c2175l4 != null) {
            c2175l4.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m830c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1349e3 c1349e3 = this.f4945a;
        if (c1349e3 != null) {
            c1349e3.m2604e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1349e3 c1349e3 = this.f4945a;
        if (c1349e3 != null) {
            c1349e3.m2605f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m831d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m828a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C2175l4 c2175l4 = this.f4946b;
        if (c2175l4 != null) {
            c2175l4.f7571a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1349e3 c1349e3 = this.f4945a;
        if (c1349e3 != null) {
            c1349e3.m2607h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1349e3 c1349e3 = this.f4945a;
        if (c1349e3 != null) {
            c1349e3.m2608i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2175l4 c2175l4 = this.f4946b;
        c2175l4.m4380i(colorStateList);
        c2175l4.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2175l4 c2175l4 = this.f4946b;
        c2175l4.m4381j(mode);
        c2175l4.m4375b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2175l4 c2175l4 = this.f4946b;
        if (c2175l4 != null) {
            c2175l4.m4379g(context, i);
        }
    }
}
