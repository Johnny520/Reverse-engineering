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
import androidx.appcompat.widget.C1035;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.core.view.C3099;
import bsh.C3466;
import com.alibaba.fastjson2.AbstractC3738;
import com.davemorrissey.labs.subscaleview.C0328R;
import p050.AbstractC7176;
import p171.C8436;
import p333.AbstractC9501;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4031 extends AbstractC4024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f11130;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f11131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f11132;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f11133;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ValueAnimator f11134;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ValueAnimator f11135;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public long f11136;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AccessibilityManager f11137;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AutoCompleteTextView f11138;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final TimeInterpolator f11139;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC4030 f11140;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f11141;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ViewOnClickListenerC4015 f11142;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC4014 f11143;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.飘花落叶言子楪苏兰世哲] */
    public C4031(C4027 c4027) {
        super(c4027);
        this.f11142 = new ViewOnClickListenerC4015(this, 1);
        this.f11143 = new ViewOnFocusChangeListenerC4014(this, 1);
        this.f11140 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.飘花落叶言子楪苏兰世哲
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C4031 c4031 = this.f11129;
                AutoCompleteTextView autoCompleteTextView = c4031.f11138;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                c4031.f11094.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.f11136 = Long.MAX_VALUE;
        this.f11130 = AbstractC7176.m12481(c4027.getContext(), C0328R.attr.motionDurationShort3, 67);
        this.f11131 = AbstractC7176.m12481(c4027.getContext(), C0328R.attr.motionDurationShort3, 50);
        this.f11139 = AbstractC7176.m12482(c4027.getContext(), C0328R.attr.motionEasingLinearInterpolator, AbstractC9501.f24813);
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final View.OnClickListener mo7779() {
        return this.f11142;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final View.OnFocusChangeListener mo7780() {
        return this.f11143;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo7781() {
        return C0328R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo7782() {
        return C0328R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7783() {
        if (this.f11137.isTouchExplorationEnabled() && AbstractC3738.m6861(this.f11138) && !this.f11094.hasFocus()) {
            this.f11138.dismissDropDown();
        }
        this.f11138.post(new RunnableC1945(this, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7835() {
        if (this.f11138 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f11136;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f11133 = false;
        }
        if (this.f11133) {
            this.f11133 = false;
            return;
        }
        m7836(!this.f11132);
        boolean z = this.f11132;
        AutoCompleteTextView autoCompleteTextView = this.f11138;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.f11138.showDropDown();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7836(boolean z) {
        if (this.f11132 != z) {
            this.f11132 = z;
            this.f11135.cancel();
            this.f11134.start();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo7812(AccessibilityEvent accessibilityEvent) {
        if (!this.f11137.isEnabled() || AbstractC3738.m6861(this.f11138)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f11132 && !this.f11138.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            m7835();
            this.f11133 = true;
            this.f11136 = SystemClock.uptimeMillis();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo7813(C8436 c8436) {
        AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
        if (!AbstractC3738.m6861(this.f11138)) {
            c8436.m13402(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7778() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f11139;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f11130);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new C3099(this, i));
        this.f11135 = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f11131);
        valueAnimatorOfFloat2.addUpdateListener(new C3099(this, i));
        this.f11134 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C1035(this, 2));
        this.f11137 = (AccessibilityManager) this.f11095.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7786() {
        AutoCompleteTextView autoCompleteTextView = this.f11138;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f11138.setOnDismissListener(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final AccessibilityManager.TouchExplorationStateChangeListener mo7815() {
        return this.f11140;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo7810() {
        return this.f11132;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo7789(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            C3466.m5899("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f11138 = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.飘花落叶言子楪苏哲世兰
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    C4031 c4031 = this.f11144;
                    long j = jUptimeMillis - c4031.f11136;
                    if (j < 0 || j > 300) {
                        c4031.f11133 = false;
                    }
                    c4031.m7835();
                    c4031.f11133 = true;
                    c4031.f11136 = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f11138.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.飘花落叶言子楪苏哲兰世
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C4031 c4031 = this.f11145;
                c4031.f11133 = true;
                c4031.f11136 = SystemClock.uptimeMillis();
                c4031.m7836(false);
            }
        });
        this.f11138.setThreshold(0);
        TextInputLayout textInputLayout = this.f11097;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f11137.isTouchExplorationEnabled()) {
            this.f11094.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo7816(int i) {
        return i != 0;
    }
}
