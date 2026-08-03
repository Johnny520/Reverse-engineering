package p001A0;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p008E.AccessibilityManagerTouchExplorationStateChangeListenerC0148b;
import p018J0.C0234d;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p056f0.AbstractC0805P;
import p057g.C0868K;
import p081s0.AbstractC1077k;

/* JADX INFO: renamed from: A0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0045u extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f116a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f117b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f118c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f119d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f120e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f121f;

    /* JADX INFO: renamed from: g */
    public final CheckableImageButton f122g;

    /* JADX INFO: renamed from: h */
    public final C0044t f123h;

    /* JADX INFO: renamed from: i */
    public int f124i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f125j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f126k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f127l;

    /* JADX INFO: renamed from: m */
    public int f128m;

    /* JADX INFO: renamed from: n */
    public ImageView.ScaleType f129n;

    /* JADX INFO: renamed from: o */
    public View.OnLongClickListener f130o;

    /* JADX INFO: renamed from: p */
    public CharSequence f131p;

    /* JADX INFO: renamed from: q */
    public final C0868K f132q;

    /* JADX INFO: renamed from: r */
    public boolean f133r;

    /* JADX INFO: renamed from: s */
    public EditText f134s;

    /* JADX INFO: renamed from: t */
    public final AccessibilityManager f135t;

    /* JADX INFO: renamed from: u */
    public C0037m f136u;

    /* JADX INFO: renamed from: v */
    public final C0041q f137v;

    public C0045u(TextInputLayout textInputLayout, C0234d c0234d) {
        CharSequence text;
        super(textInputLayout.getContext());
        int i2 = 0;
        this.f124i = 0;
        this.f125j = new LinkedHashSet();
        this.f137v = new C0041q(this);
        C0042r c0042r = new C0042r(this);
        this.f135t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f116a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f117b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM140a = m140a(this, layoutInflaterFrom, C1031R.id.text_input_error_icon);
        this.f118c = checkableImageButtonM140a;
        CheckableImageButton checkableImageButtonM140a2 = m140a(frameLayout, layoutInflaterFrom, C1031R.id.text_input_end_icon);
        this.f122g = checkableImageButtonM140a2;
        this.f123h = new C0044t(this, c0234d);
        C0868K c0868k = new C0868K(getContext(), null);
        this.f132q = c0868k;
        TypedArray typedArray = (TypedArray) c0234d.f475c;
        if (typedArray.hasValue(38)) {
            this.f119d = AbstractC0805P.m2050q(getContext(), c0234d, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f120e = AbstractC1077k.m2558f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m148i(c0234d.m646i(37));
        }
        checkableImageButtonM140a.setContentDescription(getResources().getText(C1031R.string.error_icon_content_description));
        Field field = AbstractC0080Q.f219a;
        checkableImageButtonM140a.setImportantForAccessibility(2);
        checkableImageButtonM140a.setClickable(false);
        checkableImageButtonM140a.setPressable(false);
        checkableImageButtonM140a.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f126k = AbstractC0805P.m2050q(getContext(), c0234d, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f127l = AbstractC1077k.m2558f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            m146g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonM140a2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonM140a2.setContentDescription(text);
            }
            checkableImageButtonM140a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f126k = AbstractC0805P.m2050q(getContext(), c0234d, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f127l = AbstractC1077k.m2558f(typedArray.getInt(55, -1), null);
            }
            m146g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonM140a2.getContentDescription() != text2) {
                checkableImageButtonM140a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(C1031R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f128m) {
            this.f128m = dimensionPixelSize;
            checkableImageButtonM140a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM140a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM140a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM140a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM113r = AbstractC0040p.m113r(typedArray.getInt(31, -1));
            this.f129n = scaleTypeM113r;
            checkableImageButtonM140a2.setScaleType(scaleTypeM113r);
            checkableImageButtonM140a.setScaleType(scaleTypeM113r);
        }
        c0868k.setVisibility(8);
        c0868k.setId(C1031R.id.textinput_suffix_text);
        c0868k.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0868k.setAccessibilityLiveRegion(1);
        c0868k.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0868k.setTextColor(c0234d.m645h(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f131p = TextUtils.isEmpty(text3) ? null : text3;
        c0868k.setText(text3);
        m153n();
        frameLayout.addView(checkableImageButtonM140a2);
        addView(c0868k);
        addView(frameLayout);
        addView(checkableImageButtonM140a);
        textInputLayout.f2472e0.add(c0042r);
        if (textInputLayout.f2469d != null) {
            c0042r.m137a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0043s(i2, this));
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m140a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C1031R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        if (AbstractC0805P.m2031E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0046v m141b() {
        AbstractC0046v c0031g;
        int i2 = this.f124i;
        C0044t c0044t = this.f123h;
        SparseArray sparseArray = c0044t.f112a;
        AbstractC0046v c0050z = (AbstractC0046v) sparseArray.get(i2);
        if (c0050z == null) {
            C0045u c0045u = c0044t.f113b;
            if (i2 == -1) {
                c0031g = new C0031g(c0045u, 0);
            } else if (i2 == 0) {
                c0031g = new C0031g(c0045u, 1);
            } else if (i2 == 1) {
                c0050z = new C0050z(c0045u, c0044t.f115d);
                sparseArray.append(i2, c0050z);
            } else if (i2 == 2) {
                c0031g = new C0030f(c0045u);
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException(AbstractC0324d.m720c("Invalid end icon mode: ", i2));
                }
                c0031g = new C0039o(c0045u);
            }
            c0050z = c0031g;
            sparseArray.append(i2, c0050z);
        }
        return c0050z;
    }

    /* JADX INFO: renamed from: c */
    public final int m142c() {
        int marginStart;
        if (m143d() || m144e()) {
            CheckableImageButton checkableImageButton = this.f122g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        Field field = AbstractC0080Q.f219a;
        return this.f132q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m143d() {
        return this.f117b.getVisibility() == 0 && this.f122g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m144e() {
        return this.f118c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m145f(boolean z2) {
        boolean z3;
        boolean zIsActivated;
        boolean z4;
        AbstractC0046v abstractC0046vM141b = m141b();
        boolean zMo155k = abstractC0046vM141b.mo155k();
        CheckableImageButton checkableImageButton = this.f122g;
        boolean z5 = true;
        if (!zMo155k || (z4 = checkableImageButton.f2393d) == abstractC0046vM141b.mo74l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(abstractC0046vM141b instanceof C0039o) || (zIsActivated = checkableImageButton.isActivated()) == abstractC0046vM141b.mo73j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z2 || z5) {
            AbstractC0040p.m86O(this.f116a, checkableImageButton, this.f126k);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m146g(int i2) {
        if (this.f124i == i2) {
            return;
        }
        AbstractC0046v abstractC0046vM141b = m141b();
        C0037m c0037m = this.f136u;
        AccessibilityManager accessibilityManager = this.f135t;
        if (c0037m != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0148b(c0037m));
        }
        this.f136u = null;
        abstractC0046vM141b.mo66s();
        this.f124i = i2;
        Iterator it = this.f125j.iterator();
        if (it.hasNext()) {
            AbstractC0324d.m726i(it.next());
            throw null;
        }
        m147h(i2 != 0);
        AbstractC0046v abstractC0046vM141b2 = m141b();
        int iMo59d = this.f123h.f114c;
        if (iMo59d == 0) {
            iMo59d = abstractC0046vM141b2.mo59d();
        }
        Drawable drawableM916w = iMo59d != 0 ? AbstractC0358S.m916w(getContext(), iMo59d) : null;
        CheckableImageButton checkableImageButton = this.f122g;
        checkableImageButton.setImageDrawable(drawableM916w);
        TextInputLayout textInputLayout = this.f116a;
        if (drawableM916w != null) {
            AbstractC0040p.m98c(textInputLayout, checkableImageButton, this.f126k, this.f127l);
            AbstractC0040p.m86O(textInputLayout, checkableImageButton, this.f126k);
        }
        int iMo58c = abstractC0046vM141b2.mo58c();
        CharSequence text = iMo58c != 0 ? getResources().getText(iMo58c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0046vM141b2.mo155k());
        if (!abstractC0046vM141b2.mo72i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
        abstractC0046vM141b2.mo65r();
        C0037m c0037mMo71h = abstractC0046vM141b2.mo71h();
        this.f136u = c0037mMo71h;
        if (c0037mMo71h != null && accessibilityManager != null) {
            Field field = AbstractC0080Q.f219a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0148b(this.f136u));
            }
        }
        View.OnClickListener onClickListenerMo61f = abstractC0046vM141b2.mo61f();
        View.OnLongClickListener onLongClickListener = this.f130o;
        checkableImageButton.setOnClickListener(onClickListenerMo61f);
        AbstractC0040p.m89T(checkableImageButton, onLongClickListener);
        EditText editText = this.f134s;
        if (editText != null) {
            abstractC0046vM141b2.mo63m(editText);
            m149j(abstractC0046vM141b2);
        }
        AbstractC0040p.m98c(textInputLayout, checkableImageButton, this.f126k, this.f127l);
        m145f(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m147h(boolean z2) {
        if (m143d() != z2) {
            this.f122g.setVisibility(z2 ? 0 : 8);
            m150k();
            m152m();
            this.f116a.m1903q();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m148i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f118c;
        checkableImageButton.setImageDrawable(drawable);
        m151l();
        AbstractC0040p.m98c(this.f116a, checkableImageButton, this.f119d, this.f120e);
    }

    /* JADX INFO: renamed from: j */
    public final void m149j(AbstractC0046v abstractC0046v) {
        if (this.f134s == null) {
            return;
        }
        if (abstractC0046v.mo60e() != null) {
            this.f134s.setOnFocusChangeListener(abstractC0046v.mo60e());
        }
        if (abstractC0046v.mo62g() != null) {
            this.f122g.setOnFocusChangeListener(abstractC0046v.mo62g());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m150k() {
        this.f117b.setVisibility((this.f122g.getVisibility() != 0 || m144e()) ? 8 : 0);
        setVisibility((m143d() || m144e() || ((this.f131p == null || this.f133r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: l */
    public final void m151l() {
        CheckableImageButton checkableImageButton = this.f118c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f116a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2481j.f167q && textInputLayout.m1899m()) ? 0 : 8);
        m150k();
        m152m();
        if (this.f124i != 0) {
            return;
        }
        textInputLayout.m1903q();
    }

    /* JADX INFO: renamed from: m */
    public final void m152m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f116a;
        if (textInputLayout.f2469d == null) {
            return;
        }
        if (m143d() || m144e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f2469d;
            Field field = AbstractC0080Q.f219a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C1031R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2469d.getPaddingTop();
        int paddingBottom = textInputLayout.f2469d.getPaddingBottom();
        Field field2 = AbstractC0080Q.f219a;
        this.f132q.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: renamed from: n */
    public final void m153n() {
        C0868K c0868k = this.f132q;
        int visibility = c0868k.getVisibility();
        int i2 = (this.f131p == null || this.f133r) ? 8 : 0;
        if (visibility != i2) {
            m141b().mo64p(i2 == 0);
        }
        m150k();
        c0868k.setVisibility(i2);
        this.f116a.m1903q();
    }
}
