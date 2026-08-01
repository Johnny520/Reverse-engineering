package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.widget.C0188;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.core.view.C2266;
import bsh.C2633;
import com.alibaba.fastjson2.AbstractC2905;
import com.davemorrissey.labs.subscaleview.R;
import p034.AbstractC6347;
import p155.C7607;
import p317.AbstractC8672;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3199 extends AbstractC3192 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f10785;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f10786;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f10787;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f10788;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ValueAnimator f10789;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ValueAnimator f10790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public long f10791;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AccessibilityManager f10792;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AutoCompleteTextView f10793;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final TimeInterpolator f10794;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC3198 f10795;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f10796;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ViewOnClickListenerC3183 f10797;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC3182 f10798;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.飘花落叶言子楪苏兰世哲] */
    public C3199(C3195 c3195) {
        super(c3195);
        this.f10797 = new ViewOnClickListenerC3183(this, 1);
        this.f10798 = new ViewOnFocusChangeListenerC3182(this, 1);
        this.f10795 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.飘花落叶言子楪苏兰世哲
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C3199 c3199 = this.f10784;
                AutoCompleteTextView autoCompleteTextView = c3199.f10793;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                c3199.f10749.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.f10791 = Long.MAX_VALUE;
        this.f10785 = AbstractC6347.m11922(c3195.getContext(), R.attr.motionDurationShort3, 67);
        this.f10786 = AbstractC6347.m11922(c3195.getContext(), R.attr.motionDurationShort3, 50);
        this.f10794 = AbstractC6347.m11923(c3195.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC8672.f24468);
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final View.OnClickListener mo7220() {
        return this.f10797;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final View.OnFocusChangeListener mo7221() {
        return this.f10798;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo7222() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo7223() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7224() {
        if (this.f10792.isTouchExplorationEnabled() && AbstractC2905.m6301(this.f10793) && !this.f10749.hasFocus()) {
            this.f10793.dismissDropDown();
        }
        this.f10793.post(new RunnableC1107(this, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7276() {
        if (this.f10793 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f10791;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f10788 = false;
        }
        if (this.f10788) {
            this.f10788 = false;
            return;
        }
        m7277(!this.f10787);
        boolean z = this.f10787;
        AutoCompleteTextView autoCompleteTextView = this.f10793;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.f10793.showDropDown();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7277(boolean z) {
        if (this.f10787 != z) {
            this.f10787 = z;
            this.f10790.cancel();
            this.f10789.start();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo7253(AccessibilityEvent accessibilityEvent) {
        if (!this.f10792.isEnabled() || AbstractC2905.m6301(this.f10793)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f10787 && !this.f10793.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            m7276();
            this.f10788 = true;
            this.f10791 = SystemClock.uptimeMillis();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo7254(C7607 c7607) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7607.f20630;
        if (!AbstractC2905.m6301(this.f10793)) {
            c7607.m12843(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7219() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f10794;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f10785);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new C2266(this, i));
        this.f10790 = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f10786);
        valueAnimatorOfFloat2.addUpdateListener(new C2266(this, i));
        this.f10789 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0188(this, 2));
        this.f10792 = (AccessibilityManager) this.f10750.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7227() {
        AutoCompleteTextView autoCompleteTextView = this.f10793;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f10793.setOnDismissListener(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final AccessibilityManager.TouchExplorationStateChangeListener mo7256() {
        return this.f10795;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo7251() {
        return this.f10787;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo7230(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            C2633.m5339("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f10793 = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.飘花落叶言子楪苏哲世兰
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    C3199 c3199 = this.f10799;
                    long j = jUptimeMillis - c3199.f10791;
                    if (j < 0 || j > 300) {
                        c3199.f10788 = false;
                    }
                    c3199.m7276();
                    c3199.f10788 = true;
                    c3199.f10791 = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f10793.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.飘花落叶言子楪苏哲兰世
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C3199 c3199 = this.f10800;
                c3199.f10788 = true;
                c3199.f10791 = SystemClock.uptimeMillis();
                c3199.m7277(false);
            }
        });
        this.f10793.setThreshold(0);
        TextInputLayout textInputLayout = this.f10752;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f10792.isTouchExplorationEnabled()) {
            this.f10749.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo7257(int i) {
        return i != 0;
    }
}
