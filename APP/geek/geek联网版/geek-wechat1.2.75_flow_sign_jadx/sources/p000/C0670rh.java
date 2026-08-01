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

/* JADX INFO: renamed from: rh */
/* JADX INFO: loaded from: classes.dex */
public final class C0670rh extends AbstractC0300hj {

    /* JADX INFO: renamed from: e */
    public final int f4130e;

    /* JADX INFO: renamed from: f */
    public final int f4131f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f4132g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f4133h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC0923ya f4134i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC0960za f4135j;

    /* JADX INFO: renamed from: k */
    public final C0633qh f4136k;

    /* JADX INFO: renamed from: l */
    public boolean f4137l;

    /* JADX INFO: renamed from: m */
    public boolean f4138m;

    /* JADX INFO: renamed from: n */
    public boolean f4139n;

    /* JADX INFO: renamed from: o */
    public long f4140o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f4141p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f4142q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f4143r;

    public C0670rh(C0263gj c0263gj) {
        super(c0263gj);
        int i = 1;
        this.f4134i = new ViewOnClickListenerC0923ya(i, this);
        this.f4135j = new ViewOnFocusChangeListenerC0960za(this, i);
        this.f4136k = new C0633qh(this);
        this.f4140o = Long.MAX_VALUE;
        this.f4131f = AbstractC0274gu.m1302E(c0263gj.getContext(), R.attr.motionDurationShort3, 67);
        this.f4130e = AbstractC0274gu.m1302E(c0263gj.getContext(), R.attr.motionDurationShort3, 50);
        this.f4132g = AbstractC0274gu.m1303F(c0263gj.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0618q2.f3770a);
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: a */
    public final void mo598a() {
        if (this.f4141p.isTouchExplorationEnabled() && this.f4133h.getInputType() != 0 && !this.f2231d.hasFocus()) {
            this.f4133h.dismissDropDown();
        }
        this.f4133h.post(new RunnableC0884x8(5, this));
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: c */
    public final int mo599c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: d */
    public final int mo600d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo601e() {
        return this.f4135j;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo602f() {
        return this.f4134i;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: h */
    public final InterfaceC0001a0 mo1397h() {
        return this.f4136k;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: i */
    public final boolean mo1398i(int i) {
        return i != 0;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: k */
    public final boolean mo1400k() {
        return this.f4139n;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: l */
    public final void mo604l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f4133h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC0559oh(0, this));
        this.f4133h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ph
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0670rh c0670rh = this.f3710a;
                c0670rh.f4138m = true;
                c0670rh.f4140o = System.currentTimeMillis();
                c0670rh.m2291s(false);
            }
        });
        this.f4133h.setThreshold(0);
        TextInputLayout textInputLayout = this.f2228a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f4141p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = oa0.f3426a;
            x90.m2671s(this.f2231d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: m */
    public final void mo1401m(C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2619a;
        if (this.f4133h.getInputType() == 0) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: n */
    public final void mo1402n(AccessibilityEvent accessibilityEvent) {
        if (this.f4141p.isEnabled() && this.f4133h.getInputType() == 0) {
            boolean z = accessibilityEvent.getEventType() == 32768 && this.f4139n && !this.f4133h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                m2292t();
                this.f4138m = true;
                this.f4140o = System.currentTimeMillis();
            }
        }
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: q */
    public final void mo606q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f4132g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f4131f);
        int i = 0;
        valueAnimatorOfFloat.addUpdateListener(new C0522nh(i, this));
        this.f4143r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f4130e);
        valueAnimatorOfFloat2.addUpdateListener(new C0522nh(i, this));
        this.f4142q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0913y0(2, this));
        this.f4141p = (AccessibilityManager) this.f2230c.getSystemService("accessibility");
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: r */
    public final void mo607r() {
        AutoCompleteTextView autoCompleteTextView = this.f4133h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f4133h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2291s(boolean z) {
        if (this.f4139n != z) {
            this.f4139n = z;
            this.f4143r.cancel();
            this.f4142q.start();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2292t() {
        if (this.f4133h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f4140o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f4138m = false;
        }
        if (this.f4138m) {
            this.f4138m = false;
            return;
        }
        m2291s(!this.f4139n);
        if (!this.f4139n) {
            this.f4133h.dismissDropDown();
        } else {
            this.f4133h.requestFocus();
            this.f4133h.showDropDown();
        }
    }
}
