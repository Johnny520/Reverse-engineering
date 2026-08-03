package p001A0;

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

    public C0039o(C0045u r4) {
        super(r4);
        int r1 = 1;
        this.f98i = new ViewOnClickListenerC0025a(r1, this);
        this.f99j = new ViewOnFocusChangeListenerC0026b(this, r1);
        this.f100k = new C0037m(this);
        this.f104o = Long.MAX_VALUE;
        this.f95f = AbstractC0805P.m2038R(r4.getContext(), C1031R.attr.motionDurationShort3, 67);
        this.f94e = AbstractC0805P.m2038R(r4.getContext(), C1031R.attr.motionDurationShort3, 50);
        this.f96g = AbstractC0805P.m2039S(r4.getContext(), C1031R.attr.motionEasingLinearInterpolator, AbstractC0945a.f3354a);
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: a */
    public final void mo57a() {
        if (this.f105p.isTouchExplorationEnabled() == true) goto L5;
    L9:
        this.f97h.post(new RunnableC0028d(1, this));
        return;
    L5:
        if (AbstractC0040p.m80C(this.f97h) == false) goto L9;
        if (this.f141d.hasFocus() == true) goto L9;
        this.f97h.dismissDropDown();
        goto L9
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
    public final boolean mo72i(int r1) {
        if (r1 == 0) goto L4;
        return true;
    L4:
        return false;
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
    public final void mo63m(EditText r3) {
        if ((r3 instanceof AutoCompleteTextView) == false) goto L12;
        AutoCompleteTextView r02 = (AutoCompleteTextView) r3;
        this.f97h = r02;
        r02.setOnTouchListener(new ViewOnTouchListenerC0035k(this));
        this.f97h.setOnDismissListener(new C0036l(this));
        this.f97h.setThreshold(0);
        TextInputLayout r1 = this.f138a;
        r1.setErrorIconDrawable(null);
        if (AbstractC0040p.m80C(r3) == false) goto L7;
    L9:
        r1.setEndIconVisible(true);
        return;
    L7:
        if (this.f105p.isTouchExplorationEnabled() == false) goto L9;
        Field r32 = AbstractC0080Q.f219a;
        this.f141d.setImportantForAccessibility(2);
        goto L9
    L12:
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: n */
    public final void mo75n(C0156j r2) {
        boolean r02 = AbstractC0040p.m80C(this.f97h);
        AccessibilityNodeInfo r22 = r2.f357a;
        if (r02 == true) goto L6;
        r22.setClassName(Spinner.class.getName());
    L6:
        if (r22.isShowingHintText() == false) goto L9;
        r22.setHintText(null);
        return;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: o */
    public final void mo76o(AccessibilityEvent r4) {
        if (this.f105p.isEnabled() == true) goto L5;
        return;
    L5:
        if (AbstractC0040p.m80C(this.f97h) == false) goto L8;
        return;
    L8:
        if (r4.getEventType() == 32768) goto L12;
        if (r4.getEventType() == 8) goto L12;
    L16:
        boolean r02 = false;
    L18:
        if (r4.getEventType() == 1) goto L20;
        if (r02 == true) goto L20;
        return;
    L20:
        m78u();
        this.f102m = true;
        this.f104o = System.currentTimeMillis();
        return;
    L12:
        if (this.f103n == false) goto L16;
        if (this.f97h.isPopupShowing() == true) goto L16;
        r02 = true;
        goto L18
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: r */
    public final void mo65r() {
        int r1 = 0;
        ValueAnimator r2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator r3 = this.f96g;
        r2.setInterpolator(r3);
        r2.setDuration(this.f95f);
        r2.addUpdateListener(new C0034j(r1, this));
        this.f107r = r2;
        ValueAnimator r02 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r02.setInterpolator(r3);
        r02.setDuration(this.f94e);
        r02.addUpdateListener(new C0034j(r1, this));
        this.f106q = r02;
        r02.addListener(new C0038n(0, this));
        this.f105p = (AccessibilityManager) this.f140c.getSystemService("accessibility");
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: s */
    public final void mo66s() {
        AutoCompleteTextView r02 = this.f97h;
        if (r02 == null) goto L6;
        r02.setOnTouchListener(null);
        this.f97h.setOnDismissListener(null);
        return;
    }

    /* JADX INFO: renamed from: t */
    public final void m77t(boolean r2) {
        if (this.f103n == r2) goto L6;
        this.f103n = r2;
        this.f107r.cancel();
        this.f106q.start();
        return;
    }

    /* JADX INFO: renamed from: u */
    public final void m78u() {
        if (this.f97h != null) goto L5;
        return;
    L5:
        long r02 = System.currentTimeMillis() - this.f104o;
        if (r02 >= 0) goto L8;
    L11:
        boolean r03 = true;
    L12:
        if (r03 == false) goto L15;
        this.f102m = false;
    L15:
        if (this.f102m == true) goto L20;
        m77t(!this.f103n);
        if (this.f103n == false) goto L19;
        this.f97h.requestFocus();
        this.f97h.showDropDown();
        return;
    L19:
        this.f97h.dismissDropDown();
        return;
    L20:
        this.f102m = false;
        return;
    L8:
        if (r02 > 300) goto L11;
        r03 = false;
        goto L12
    }
}
