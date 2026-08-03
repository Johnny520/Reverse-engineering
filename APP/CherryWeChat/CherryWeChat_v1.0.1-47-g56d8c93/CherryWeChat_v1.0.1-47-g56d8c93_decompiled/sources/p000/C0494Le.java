package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Le */
/* JADX INFO: loaded from: classes.dex */
public final class C0494Le extends AbstractC1221bg {

    /* JADX INFO: renamed from: e */
    public final int f1606e;

    /* JADX INFO: renamed from: f */
    public final int f1607f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f1608g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f1609h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC1477h f1610i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC0440K9 f1611j;

    /* JADX INFO: renamed from: k */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC0451Ke f1612k;

    /* JADX INFO: renamed from: l */
    public boolean f1613l;

    /* JADX INFO: renamed from: m */
    public boolean f1614m;

    /* JADX INFO: renamed from: n */
    public boolean f1615n;

    /* JADX INFO: renamed from: o */
    public long f1616o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f1617p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f1618q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f1619r;

    /* JADX WARN: Type inference failed for: r0v2, types: [Ke] */
    public C0494Le(C1141ag c1141ag) {
        super(c1141ag);
        this.f1610i = new ViewOnClickListenerC1477h(4, this);
        this.f1611j = new ViewOnFocusChangeListenerC0440K9(this, 1);
        this.f1612k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: Ke
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C0494Le c0494Le = this.f1483a;
                AutoCompleteTextView autoCompleteTextView = c0494Le.f1609h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                c0494Le.f4176d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.f1616o = Long.MAX_VALUE;
        this.f1607f = AbstractC0714Qj.m1473D(c1141ag.getContext(), R.attr.motionDurationShort3, 67);
        this.f1606e = AbstractC0714Qj.m1473D(c1141ag.getContext(), R.attr.motionDurationShort3, 50);
        this.f1608g = AbstractC0714Qj.m1474E(c1141ag.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0776S2.f2453a);
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: a */
    public final void mo946a() {
        if (this.f1617p.isTouchExplorationEnabled() && this.f1609h.getInputType() != 0 && !this.f4176d.hasFocus()) {
            this.f1609h.dismissDropDown();
        }
        this.f1609h.post(new RunnableC0562N2(10, this));
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: c */
    public final int mo947c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: d */
    public final int mo948d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo949e() {
        return this.f1611j;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo950f() {
        return this.f1610i;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: h */
    public final AccessibilityManager.TouchExplorationStateChangeListener mo951h() {
        return this.f1612k;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: i */
    public final boolean mo952i(int i) {
        return i != 0;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: k */
    public final boolean mo953k() {
        return this.f1615n;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: l */
    public final void mo954l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1609h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC2586ue(1, this));
        this.f1609h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: Je
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0494Le c0494Le = this.f1371a;
                c0494Le.f1614m = true;
                c0494Le.f1616o = SystemClock.uptimeMillis();
                c0494Le.m959s(false);
            }
        });
        this.f1609h.setThreshold(0);
        TextInputLayout textInputLayout = this.f4173a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f1617p.isTouchExplorationEnabled()) {
            this.f4176d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: m */
    public final void mo955m(C1118a0 c1118a0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1118a0.f3530a;
        if (this.f1609h.getInputType() == 0) {
            c1118a0.m2046h(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: n */
    public final void mo956n(AccessibilityEvent accessibilityEvent) {
        if (this.f1617p.isEnabled() && this.f1609h.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1615n && !this.f1609h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                m960t();
                this.f1614m = true;
                this.f1616o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: q */
    public final void mo957q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1608g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f1607f);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new C0733R2(i, this));
        this.f1619r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f1606e);
        valueAnimatorOfFloat2.addUpdateListener(new C0733R2(i, this));
        this.f1618q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C2437r0(2, this));
        this.f1617p = (AccessibilityManager) this.f4175c.getSystemService("accessibility");
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: r */
    public final void mo958r() {
        AutoCompleteTextView autoCompleteTextView = this.f1609h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1609h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m959s(boolean z) {
        if (this.f1615n != z) {
            this.f1615n = z;
            this.f1619r.cancel();
            this.f1618q.start();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m960t() {
        if (this.f1609h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f1616o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f1614m = false;
        }
        if (this.f1614m) {
            this.f1614m = false;
            return;
        }
        m959s(!this.f1615n);
        if (!this.f1615n) {
            this.f1609h.dismissDropDown();
        } else {
            this.f1609h.requestFocus();
            this.f1609h.showDropDown();
        }
    }
}
