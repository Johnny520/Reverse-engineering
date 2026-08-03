package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
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
    public C0494Le(C1141ag r4) {
        super(r4);
        this.f1610i = new ViewOnClickListenerC1477h(4, this);
        this.f1611j = new ViewOnFocusChangeListenerC0440K9(this, 1);
        this.f1612k = new AccessibilityManagerTouchExplorationStateChangeListenerC0451Ke(this);
        this.f1616o = Long.MAX_VALUE;
        this.f1607f = AbstractC0714Qj.m1473D(r4.getContext(), R.attr.motionDurationShort3, 67);
        this.f1606e = AbstractC0714Qj.m1473D(r4.getContext(), R.attr.motionDurationShort3, 50);
        this.f1608g = AbstractC0714Qj.m1474E(r4.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0776S2.f2453a);
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: a */
    public final void mo946a() {
        if (this.f1617p.isTouchExplorationEnabled() == true) goto L5;
    L9:
        this.f1609h.post(new RunnableC0562N2(10, this));
        return;
    L5:
        if (this.f1609h.getInputType() == 0) goto L9;
        if (this.f4176d.hasFocus() == true) goto L9;
        this.f1609h.dismissDropDown();
        goto L9
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
    public final boolean mo952i(int r1) {
        if (r1 == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: k */
    public final boolean mo953k() {
        return this.f1615n;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: l */
    public final void mo954l(EditText r4) {
        if ((r4 instanceof AutoCompleteTextView) == false) goto L13;
        AutoCompleteTextView r0 = (AutoCompleteTextView) r4;
        this.f1609h = r0;
        r0.setOnTouchListener(new ViewOnTouchListenerC2586ue(1, this));
        this.f1609h.setOnDismissListener(new C0408Je(this));
        this.f1609h.setThreshold(0);
        TextInputLayout r1 = this.f4173a;
        r1.setErrorIconDrawable(null);
        if (r4.getInputType() == 0) goto L8;
    L10:
        r1.setEndIconVisible(true);
        return;
    L8:
        if (this.f1617p.isTouchExplorationEnabled() == false) goto L10;
        this.f4176d.setImportantForAccessibility(2);
        goto L10
    L13:
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: m */
    public final void mo955m(C1118a0 r3) {
        AccessibilityNodeInfo r0 = r3.f3530a;
        if (this.f1609h.getInputType() != 0) goto L7;
        r3.m2046h(Spinner.class.getName());
    L7:
        if (r0.isShowingHintText() == false) goto L10;
        r0.setHintText(null);
        return;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: n */
    public final void mo956n(AccessibilityEvent r4) {
        if (this.f1617p.isEnabled() == true) goto L5;
        return;
    L5:
        if (this.f1609h.getInputType() == 0) goto L8;
        return;
    L8:
        if (r4.getEventType() == 32768) goto L12;
        if (r4.getEventType() == 8) goto L12;
    L16:
        boolean r0 = false;
    L18:
        if (r4.getEventType() == 1) goto L20;
        if (r0 == true) goto L20;
        return;
    L20:
        m960t();
        this.f1614m = true;
        this.f1616o = SystemClock.uptimeMillis();
        return;
    L12:
        if (this.f1615n == false) goto L16;
        if (this.f1609h.isPopupShowing() == true) goto L16;
        r0 = true;
        goto L18
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: q */
    public final void mo957q() {
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator r2 = this.f1608g;
        r1.setInterpolator(r2);
        r1.setDuration(this.f1607f);
        int r4 = 1;
        r1.addUpdateListener(new C0733R2(r4, this));
        this.f1619r = r1;
        ValueAnimator r12 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r12.setInterpolator(r2);
        r12.setDuration(this.f1606e);
        r12.addUpdateListener(new C0733R2(r4, this));
        this.f1618q = r12;
        r12.addListener(new C2437r0(2, this));
        this.f1617p = (AccessibilityManager) this.f4175c.getSystemService("accessibility");
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: r */
    public final void mo958r() {
        AutoCompleteTextView r0 = this.f1609h;
        if (r0 == null) goto L6;
        r0.setOnTouchListener(null);
        this.f1609h.setOnDismissListener(null);
        return;
    }

    /* JADX INFO: renamed from: s */
    public final void m959s(boolean r2) {
        if (this.f1615n == r2) goto L6;
        this.f1615n = r2;
        this.f1619r.cancel();
        this.f1618q.start();
        return;
    }

    /* JADX INFO: renamed from: t */
    public final void m960t() {
        if (this.f1609h != null) goto L5;
        return;
    L5:
        long r0 = SystemClock.uptimeMillis() - this.f1616o;
        if (r0 >= 0) goto L8;
    L9:
        this.f1614m = false;
    L11:
        if (this.f1614m == true) goto L18;
        m959s(!this.f1615n);
        if (this.f1615n == false) goto L16;
        this.f1609h.requestFocus();
        this.f1609h.showDropDown();
        return;
    L16:
        this.f1609h.dismissDropDown();
        return;
    L18:
        this.f1614m = false;
        return;
    L8:
        if (r0 <= 300) goto L11;
        goto L9
    }
}
