package p001A0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p008E.C0156j;
import p056f0.AbstractC0805P;
import p060h0.AbstractC0945a;

/* JADX INFO: renamed from: A0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0039o extends AbstractC0046v {

    /* JADX INFO: renamed from: e */
    public final int f94e;

    /* JADX INFO: renamed from: f */
    public final int f95f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f96g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f97h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC0025a f98i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC0026b f99j;

    /* JADX INFO: renamed from: k */
    public final C0037m f100k;

    /* JADX INFO: renamed from: l */
    public boolean f101l;

    /* JADX INFO: renamed from: m */
    public boolean f102m;

    /* JADX INFO: renamed from: n */
    public boolean f103n;

    /* JADX INFO: renamed from: o */
    public long f104o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f105p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f106q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f107r;

    public C0039o(C0045u c0045u) {
        super(c0045u);
        int i2 = 1;
        this.f98i = new ViewOnClickListenerC0025a(i2, this);
        this.f99j = new ViewOnFocusChangeListenerC0026b(this, i2);
        this.f100k = new C0037m(this);
        this.f104o = Long.MAX_VALUE;
        this.f95f = AbstractC0805P.m2038R(c0045u.getContext(), C1031R.attr.motionDurationShort3, 67);
        this.f94e = AbstractC0805P.m2038R(c0045u.getContext(), C1031R.attr.motionDurationShort3, 50);
        this.f96g = AbstractC0805P.m2039S(c0045u.getContext(), C1031R.attr.motionEasingLinearInterpolator, AbstractC0945a.f3354a);
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: a */
    public final void mo57a() {
        if (this.f105p.isTouchExplorationEnabled() && AbstractC0040p.m80C(this.f97h) && !this.f141d.hasFocus()) {
            this.f97h.dismissDropDown();
        }
        this.f97h.post(new RunnableC0028d(1, this));
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: c */
    public final int mo58c() {
        return C1031R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: d */
    public final int mo59d() {
        return C1031R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo60e() {
        return this.f99j;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo61f() {
        return this.f98i;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: h */
    public final C0037m mo71h() {
        return this.f100k;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: i */
    public final boolean mo72i(int i2) {
        return i2 != 0;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: j */
    public final boolean mo73j() {
        return this.f101l;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: l */
    public final boolean mo74l() {
        return this.f103n;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: m */
    public final void mo63m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f97h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: A0.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0039o c0039o = this.f89a;
                c0039o.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0039o.f104o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c0039o.f102m = false;
                    }
                    c0039o.m78u();
                    c0039o.f102m = true;
                    c0039o.f104o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f97h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: A0.l
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0039o c0039o = this.f90a;
                c0039o.f102m = true;
                c0039o.f104o = System.currentTimeMillis();
                c0039o.m77t(false);
            }
        });
        this.f97h.setThreshold(0);
        TextInputLayout textInputLayout = this.f138a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC0040p.m80C(editText) && this.f105p.isTouchExplorationEnabled()) {
            Field field = AbstractC0080Q.f219a;
            this.f141d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: n */
    public final void mo75n(C0156j c0156j) {
        boolean zM80C = AbstractC0040p.m80C(this.f97h);
        AccessibilityNodeInfo accessibilityNodeInfo = c0156j.f357a;
        if (!zM80C) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: o */
    public final void mo76o(AccessibilityEvent accessibilityEvent) {
        if (!this.f105p.isEnabled() || AbstractC0040p.m80C(this.f97h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f103n && !this.f97h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            m78u();
            this.f102m = true;
            this.f104o = System.currentTimeMillis();
        }
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: r */
    public final void mo65r() {
        int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f96g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f95f);
        valueAnimatorOfFloat.addUpdateListener(new C0034j(i2, this));
        this.f107r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f94e);
        valueAnimatorOfFloat2.addUpdateListener(new C0034j(i2, this));
        this.f106q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0038n(0, this));
        this.f105p = (AccessibilityManager) this.f140c.getSystemService("accessibility");
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: s */
    public final void mo66s() {
        AutoCompleteTextView autoCompleteTextView = this.f97h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f97h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m77t(boolean z2) {
        if (this.f103n != z2) {
            this.f103n = z2;
            this.f107r.cancel();
            this.f106q.start();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m78u() {
        if (this.f97h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f104o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f102m = false;
        }
        if (this.f102m) {
            this.f102m = false;
            return;
        }
        m77t(!this.f103n);
        if (!this.f103n) {
            this.f97h.dismissDropDown();
        } else {
            this.f97h.requestFocus();
            this.f97h.showDropDown();
        }
    }
}
