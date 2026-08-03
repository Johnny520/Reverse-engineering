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

    public C1393f3(Context r1, AttributeSet r2, int r3) {
        AbstractC1533iB.m2903a(r1);
        super(r1, r2, r3);
        AbstractC1042YA.m1987a(getContext(), this);
        C1349e3 r12 = new C1349e3(this);
        this.f4945a = r12;
        r12.m2603d(r2, r3);
        C2175l4 r13 = new C2175l4(this);
        this.f4946b = r13;
        r13.m4378f(r2, r3);
        r13.m4375b();
        getEmojiTextViewHelper().m829b(r2, r3);
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f4947c != null) goto L6;
        this.f4947c = new C0391J3(this);
    L6:
        return this.f4947c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 r0 = this.f4945a;
        if (r0 == null) goto L5;
        r0.m2600a();
    L5:
        C2175l4 r02 = this.f4946b;
        if (r02 == null) goto L9;
        r02.m4375b();
        return;
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
        if (super.getAutoSizeTextType() != 1) goto L5;
        return 1;
    L5:
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f4945a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f4945a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4946b.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4946b.m4377e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        C2175l4 r22 = this.f4946b;
        if (r22 == null) goto L6;
        r22.getClass();
        return;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().m830c(r2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r1) {
        super.setAutoSizeTextTypeWithDefaults(r1);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C1349e3 r12 = this.f4945a;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f4945a;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(r1);
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().m831d(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(getEmojiTextViewHelper().m828a(r2));
    }

    public void setSupportAllCaps(boolean r2) {
        C2175l4 r0 = this.f4946b;
        if (r0 == null) goto L6;
        r0.f7571a.setAllCaps(r2);
        return;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C1349e3 r0 = this.f4945a;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f4945a;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C2175l4 r0 = this.f4946b;
        r0.m4380i(r2);
        r0.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C2175l4 r0 = this.f4946b;
        r0.m4381j(r2);
        r0.m4375b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C2175l4 r0 = this.f4946b;
        if (r0 == null) goto L6;
        r0.m4379g(r2, r3);
        return;
    }
}
