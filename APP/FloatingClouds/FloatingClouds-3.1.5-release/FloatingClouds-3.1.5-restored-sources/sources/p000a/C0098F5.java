package p000a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.C1247R;
import com.google.android.material.textfield.C1318a;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.F5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0098F5 extends AbstractC0514c6 {

    /* JADX INFO: renamed from: e */
    public final int f311e;

    /* JADX INFO: renamed from: f */
    public final int f312f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f313g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f314h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC0606h3 f315i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC0625i3 f316j;

    /* JADX INFO: renamed from: k */
    public final C0080E5 f317k;

    /* JADX INFO: renamed from: l */
    public boolean f318l;

    /* JADX INFO: renamed from: m */
    public boolean f319m;

    /* JADX INFO: renamed from: n */
    public boolean f320n;

    /* JADX INFO: renamed from: o */
    public long f321o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f322p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f323q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f324r;

    public C0098F5(C1318a c1318a) {
        super(c1318a);
        int i = 1;
        this.f315i = new ViewOnClickListenerC0606h3(i, this);
        this.f316j = new ViewOnFocusChangeListenerC0625i3(this, i);
        this.f317k = new C0080E5(this);
        this.f321o = Long.MAX_VALUE;
        this.f312f = C0899wb.m2187c(c1318a.getContext(), C1247R.attr.motionDurationShort3, 67);
        this.f311e = C0899wb.m2187c(c1318a.getContext(), C1247R.attr.motionDurationShort3, 50);
        this.f313g = C0899wb.m2188d(c1318a.getContext(), C1247R.attr.motionEasingLinearInterpolator, C0888w0.f3468a);
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: a */
    public final void mo261a() {
        if (this.f322p.isTouchExplorationEnabled() && C0889w1.m2120G(this.f314h) && !this.f1878d.hasFocus()) {
            this.f314h.dismissDropDown();
        }
        this.f314h.post(new RunnableC0221M2(7, this));
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: c */
    public final int mo262c() {
        return C1247R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: d */
    public final int mo263d() {
        return C1247R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo264e() {
        return this.f316j;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo265f() {
        return this.f315i;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: h */
    public final C0080E5 mo266h() {
        return this.f317k;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: i */
    public final boolean mo267i(int i) {
        return i != 0;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: j */
    public final boolean mo268j() {
        return this.f318l;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: l */
    public final boolean mo269l() {
        return this.f320n;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: m */
    public final void mo270m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f314h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: a.C5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0098F5 c0098f5 = this.f167a;
                c0098f5.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0098f5.f321o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c0098f5.f319m = false;
                    }
                    c0098f5.m275u();
                    c0098f5.f319m = true;
                    c0098f5.f321o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f314h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: a.D5
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0098F5 c0098f5 = this.f210a;
                c0098f5.f319m = true;
                c0098f5.f321o = System.currentTimeMillis();
                c0098f5.m274t(false);
            }
        });
        this.f314h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1875a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!C0889w1.m2120G(editText) && this.f322p.isTouchExplorationEnabled()) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            this.f1878d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: n */
    public final void mo271n(C0146I c0146i) {
        if (!C0889w1.m2120G(this.f314h)) {
            c0146i.m382h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p000a.AbstractC0514c6
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: o */
    public final void mo272o(AccessibilityEvent accessibilityEvent) {
        if (!this.f322p.isEnabled() || C0889w1.m2120G(this.f314h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f320n && !this.f314h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            m275u();
            this.f319m = true;
            this.f321o = System.currentTimeMillis();
        }
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: r */
    public final void mo155r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f313g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f312f);
        valueAnimatorOfFloat.addUpdateListener(new C0025B5(this));
        this.f324r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f311e);
        valueAnimatorOfFloat2.addUpdateListener(new C0025B5(this));
        this.f323q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0869v0(1, this));
        this.f322p = (AccessibilityManager) this.f1877c.getSystemService("accessibility");
    }

    @Override // p000a.AbstractC0514c6
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: s */
    public final void mo273s() {
        AutoCompleteTextView autoCompleteTextView = this.f314h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f314h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m274t(boolean z) {
        if (this.f320n != z) {
            this.f320n = z;
            this.f324r.cancel();
            this.f323q.start();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m275u() {
        if (this.f314h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f321o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f319m = false;
        }
        if (this.f319m) {
            this.f319m = false;
            return;
        }
        m274t(!this.f320n);
        if (!this.f320n) {
            this.f314h.dismissDropDown();
        } else {
            this.f314h.requestFocus();
            this.f314h.showDropDown();
        }
    }
}
