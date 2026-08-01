package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ph */
/* JADX INFO: loaded from: classes.dex */
public final class C0597ph extends AbstractC0226fj {

    /* JADX INFO: renamed from: e */
    public final int f3891e;

    /* JADX INFO: renamed from: f */
    public final int f3892f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f3893g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f3894h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC0627qa f3895i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC0664ra f3896j;

    /* JADX INFO: renamed from: k */
    public final C0559oh f3897k;

    /* JADX INFO: renamed from: l */
    public boolean f3898l;

    /* JADX INFO: renamed from: m */
    public boolean f3899m;

    /* JADX INFO: renamed from: n */
    public boolean f3900n;

    /* JADX INFO: renamed from: o */
    public long f3901o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f3902p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f3903q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f3904r;

    public C0597ph(C0189ej c0189ej) {
        super(c0189ej);
        int i = 1;
        this.f3895i = new ViewOnClickListenerC0627qa(i, this);
        this.f3896j = new ViewOnFocusChangeListenerC0664ra(this, i);
        this.f3897k = new C0559oh(this);
        this.f3901o = Long.MAX_VALUE;
        this.f3892f = AbstractC0126ct.m824v(c0189ej.getContext(), R.attr.motionDurationShort3, 67);
        this.f3891e = AbstractC0126ct.m824v(c0189ej.getContext(), R.attr.motionDurationShort3, 50);
        this.f3893g = AbstractC0126ct.m825w(c0189ej.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0619q2.f3971a);
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: a */
    public final void mo1213a() {
        if (this.f3902p.isTouchExplorationEnabled() && this.f3894h.getInputType() != 0 && !this.f1972d.hasFocus()) {
            this.f3894h.dismissDropDown();
        }
        this.f3894h.post(new RunnableC0581p1(6, this));
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: c */
    public final int mo1215c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: d */
    public final int mo1216d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo1217e() {
        return this.f3896j;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo1218f() {
        return this.f3895i;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: h */
    public final InterfaceC0001a0 mo1220h() {
        return this.f3897k;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: i */
    public final boolean mo1221i(int i) {
        return i != 0;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: k */
    public final boolean mo1223k() {
        return this.f3900n;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: l */
    public final void mo1224l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f3894h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC0485mh(0, this));
        this.f3894h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: nh
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0597ph c0597ph = this.f3413a;
                c0597ph.f3899m = true;
                c0597ph.f3901o = System.currentTimeMillis();
                c0597ph.m2117s(false);
            }
        });
        this.f3894h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1969a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f3902p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = ja0.f2600a;
            s90.m2327s(this.f1972d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: m */
    public final void mo1225m(C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2513a;
        if (this.f3894h.getInputType() == 0) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: n */
    public final void mo1226n(AccessibilityEvent accessibilityEvent) {
        if (this.f3902p.isEnabled() && this.f3894h.getInputType() == 0) {
            boolean z = accessibilityEvent.getEventType() == 32768 && this.f3900n && !this.f3894h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                m2118t();
                this.f3899m = true;
                this.f3901o = System.currentTimeMillis();
            }
        }
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: q */
    public final void mo1229q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3893g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f3892f);
        int i = 0;
        valueAnimatorOfFloat.addUpdateListener(new C0448lh(i, this));
        this.f3904r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f3891e);
        valueAnimatorOfFloat2.addUpdateListener(new C0448lh(i, this));
        this.f3903q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0913y0(2, this));
        this.f3902p = (AccessibilityManager) this.f1971c.getSystemService("accessibility");
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: r */
    public final void mo1230r() {
        AutoCompleteTextView autoCompleteTextView = this.f3894h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f3894h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2117s(boolean z) {
        if (this.f3900n != z) {
            this.f3900n = z;
            this.f3904r.cancel();
            this.f3903q.start();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2118t() {
        if (this.f3894h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f3901o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f3899m = false;
        }
        if (this.f3899m) {
            this.f3899m = false;
            return;
        }
        m2117s(!this.f3900n);
        if (!this.f3900n) {
            this.f3894h.dismissDropDown();
        } else {
            this.f3894h.requestFocus();
            this.f3894h.showDropDown();
        }
    }
}
