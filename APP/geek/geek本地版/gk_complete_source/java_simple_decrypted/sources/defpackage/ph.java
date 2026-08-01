package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
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

/* JADX INFO: loaded from: classes.dex */
public final class ph extends fj {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final qa i;
    public final ra j;
    public final oh k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public ph(ej r4) {
        super(r4);
        int r1 = 1;
        this.i = new qa(r1, this);
        this.j = new ra(this, r1);
        this.k = new oh(this);
        this.o = Long.MAX_VALUE;
        this.f = ct.v(r4.getContext(), R.attr.motionDurationShort3, 67);
        this.e = ct.v(r4.getContext(), R.attr.motionDurationShort3, 50);
        this.g = ct.w(r4.getContext(), R.attr.motionEasingLinearInterpolator, q2.a);
    }

    @Override // defpackage.fj
    public final void a() {
        if (this.p.isTouchExplorationEnabled() == true) goto L5;
    L9:
        this.h.post(new p1(6, this));
        return;
    L5:
        if (this.h.getInputType() == 0) goto L9;
        if (this.d.hasFocus() == true) goto L9;
        this.h.dismissDropDown();
        goto L9
    }

    @Override // defpackage.fj
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.fj
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.fj
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.fj
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.fj
    public final a0 h() {
        return this.k;
    }

    @Override // defpackage.fj
    public final boolean i(int r1) {
        if (r1 == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // defpackage.fj
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.fj
    public final void l(EditText r4) {
        if ((r4 instanceof AutoCompleteTextView) == false) goto L13;
        AutoCompleteTextView r0 = (AutoCompleteTextView) r4;
        this.h = r0;
        r0.setOnTouchListener(new mh(0, this));
        this.h.setOnDismissListener(new nh(this));
        this.h.setThreshold(0);
        TextInputLayout r1 = this.a;
        r1.setErrorIconDrawable(null);
        if (r4.getInputType() == 0) goto L8;
    L10:
        r1.setEndIconVisible(true);
        return;
    L8:
        if (this.p.isTouchExplorationEnabled() == false) goto L10;
        WeakHashMap r42 = ja0.a;
        s90.s(this.d, 2);
        goto L10
    L13:
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // defpackage.fj
    public final void m(j0 r2) {
        AccessibilityNodeInfo r22 = r2.a;
        if (this.h.getInputType() != 0) goto L7;
        r22.setClassName(Spinner.class.getName());
    L7:
        if (r22.isShowingHintText() == false) goto L10;
        r22.setHintText(null);
        return;
    }

    @Override // defpackage.fj
    public final void n(AccessibilityEvent r4) {
        if (this.p.isEnabled() == true) goto L5;
        return;
    L5:
        if (this.h.getInputType() == 0) goto L8;
        return;
    L8:
        if (r4.getEventType() == 32768) goto L10;
    L14:
        boolean r0 = false;
    L16:
        if (r4.getEventType() == 1) goto L18;
        if (r0 == true) goto L18;
        return;
    L18:
        t();
        this.m = true;
        this.o = System.currentTimeMillis();
        return;
    L10:
        if (this.n == false) goto L14;
        if (this.h.isPopupShowing() == true) goto L14;
        r0 = true;
        goto L16
    }

    @Override // defpackage.fj
    public final void q() {
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator r2 = this.g;
        r1.setInterpolator(r2);
        r1.setDuration(this.f);
        int r4 = 0;
        r1.addUpdateListener(new lh(r4, this));
        this.r = r1;
        ValueAnimator r12 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r12.setInterpolator(r2);
        r12.setDuration(this.e);
        r12.addUpdateListener(new lh(r4, this));
        this.q = r12;
        r12.addListener(new y0(2, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.fj
    public final void r() {
        AutoCompleteTextView r0 = this.h;
        if (r0 == null) goto L6;
        r0.setOnTouchListener(null);
        this.h.setOnDismissListener(null);
        return;
    }

    public final void s(boolean r2) {
        if (this.n == r2) goto L6;
        this.n = r2;
        this.r.cancel();
        this.q.start();
        return;
    }

    public final void t() {
        if (this.h != null) goto L5;
        return;
    L5:
        long r0 = System.currentTimeMillis() - this.o;
        if (r0 >= 0) goto L8;
    L9:
        this.m = false;
    L11:
        if (this.m == true) goto L18;
        s(!this.n);
        if (this.n == false) goto L16;
        this.h.requestFocus();
        this.h.showDropDown();
        return;
    L16:
        this.h.dismissDropDown();
        return;
    L18:
        this.m = false;
        return;
    L8:
        if (r0 <= 300) goto L11;
        goto L9
    }
}
