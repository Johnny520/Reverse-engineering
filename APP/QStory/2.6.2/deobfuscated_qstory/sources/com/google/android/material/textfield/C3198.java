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
import bsh.C2632;
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import p155.C7606;
import p175.AbstractC7738;
import p317.AbstractC8680;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3198 extends AbstractC3191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f10780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f10781;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f10782;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f10783;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ValueAnimator f10784;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ValueAnimator f10785;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public long f10786;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AccessibilityManager f10787;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AutoCompleteTextView f10788;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final TimeInterpolator f10789;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC3197 f10790;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f10791;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ViewOnClickListenerC3182 f10792;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC3181 f10793;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.飘花落叶言子楪苏兰世哲] */
    public C3198(C3194 c3194) {
        super(c3194);
        this.f10792 = new ViewOnClickListenerC3182(this, 1);
        this.f10793 = new ViewOnFocusChangeListenerC3181(this, 1);
        this.f10790 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.飘花落叶言子楪苏兰世哲
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C3198 c3198 = this.f10779;
                AutoCompleteTextView autoCompleteTextView = c3198.f10788;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                c3198.f10744.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.f10786 = Long.MAX_VALUE;
        this.f10780 = AbstractC7738.m13024(c3194.getContext(), R.attr.motionDurationShort3, 67);
        this.f10781 = AbstractC7738.m13024(c3194.getContext(), R.attr.motionDurationShort3, 50);
        this.f10789 = AbstractC7738.m13027(c3194.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC8680.f24476);
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final View.OnClickListener mo7233() {
        return this.f10792;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final View.OnFocusChangeListener mo7234() {
        return this.f10793;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo7235() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo7236() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7237() {
        if (this.f10787.isTouchExplorationEnabled() && AbstractC3055.m6642(this.f10788) && !this.f10744.hasFocus()) {
            this.f10788.dismissDropDown();
        }
        this.f10788.post(new RunnableC1107(this, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7289() {
        if (this.f10788 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f10786;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f10783 = false;
        }
        if (this.f10783) {
            this.f10783 = false;
            return;
        }
        m7290(!this.f10782);
        boolean z = this.f10782;
        AutoCompleteTextView autoCompleteTextView = this.f10788;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.f10788.showDropDown();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7290(boolean z) {
        if (this.f10782 != z) {
            this.f10782 = z;
            this.f10785.cancel();
            this.f10784.start();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo7266(AccessibilityEvent accessibilityEvent) {
        if (!this.f10787.isEnabled() || AbstractC3055.m6642(this.f10788)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f10782 && !this.f10788.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            m7289();
            this.f10783 = true;
            this.f10786 = SystemClock.uptimeMillis();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo7267(C7606 c7606) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7606.f20635;
        if (!AbstractC3055.m6642(this.f10788)) {
            c7606.m12814(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7232() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f10789;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f10780);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new C2266(this, i));
        this.f10785 = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f10781);
        valueAnimatorOfFloat2.addUpdateListener(new C2266(this, i));
        this.f10784 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0188(this, 2));
        this.f10787 = (AccessibilityManager) this.f10745.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7240() {
        AutoCompleteTextView autoCompleteTextView = this.f10788;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f10788.setOnDismissListener(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final AccessibilityManager.TouchExplorationStateChangeListener mo7269() {
        return this.f10790;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo7264() {
        return this.f10782;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo7243(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            C2632.m5294("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f10788 = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.飘花落叶言子楪苏哲世兰
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    C3198 c3198 = this.f10794;
                    long j = jUptimeMillis - c3198.f10786;
                    if (j < 0 || j > 300) {
                        c3198.f10783 = false;
                    }
                    c3198.m7289();
                    c3198.f10783 = true;
                    c3198.f10786 = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f10788.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.飘花落叶言子楪苏哲兰世
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C3198 c3198 = this.f10795;
                c3198.f10783 = true;
                c3198.f10786 = SystemClock.uptimeMillis();
                c3198.m7290(false);
            }
        });
        this.f10788.setThreshold(0);
        TextInputLayout textInputLayout = this.f10747;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f10787.isTouchExplorationEnabled()) {
            this.f10744.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo7270(int i) {
        return i != 0;
    }
}
