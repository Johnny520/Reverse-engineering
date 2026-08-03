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
import com.abc.core.runtime.AbstractC0805P;
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

    public C0045u(TextInputLayout r18, C0234d r19) {
        super(r18.getContext());
        int r3 = 0;
        this.f124i = 0;
        this.f125j = new LinkedHashSet();
        this.f137v = new C0041q(this);
        C0042r r4 = new C0042r(this);
        this.f135t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f116a = r18;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout r6 = new FrameLayout(getContext());
        this.f117b = r6;
        r6.setVisibility(8);
        r6.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater r9 = LayoutInflater.from(getContext());
        CheckableImageButton r10 = m140a(this, r9, C1031R.id.text_input_error_icon);
        this.f118c = r10;
        CheckableImageButton r92 = m140a(r6, r9, C1031R.id.text_input_end_icon);
        this.f122g = r92;
        this.f123h = new C0044t(this, r19);
        CharSequence r13 = null;
        C0868K r11 = new C0868K(getContext(), null);
        this.f132q = r11;
        TypedArray r12 = (TypedArray) r19.f475c;
        if (r12.hasValue(38) == false) goto L6;
        this.f119d = AbstractC0805P.m2050q(getContext(), r19, 38);
    L6:
        if (r12.hasValue(39) == false) goto L9;
        this.f120e = AbstractC1077k.m2558f(r12.getInt(39, -1), null);
    L9:
        if (r12.hasValue(37) == false) goto L11;
        m148i(r19.m646i(37));
    L11:
        r10.setContentDescription(getResources().getText(C1031R.string.error_icon_content_description));
        Field r14 = AbstractC0080Q.f219a;
        r10.setImportantForAccessibility(2);
        r10.setClickable(false);
        r10.setPressable(false);
        r10.setFocusable(false);
        if (r12.hasValue(53) == true) goto L20;
        if (r12.hasValue(32) == false) goto L17;
        this.f126k = AbstractC0805P.m2050q(getContext(), r19, 32);
    L17:
        if (r12.hasValue(33) == false) goto L20;
        this.f127l = AbstractC1077k.m2558f(r12.getInt(33, -1), null);
    L20:
        if (r12.hasValue(30) == false) goto L28;
        m146g(r12.getInt(30, 0));
        if (r12.hasValue(27) == false) goto L26;
        CharSequence r7 = r12.getText(27);
        if (r92.getContentDescription() == r7) goto L26;
        r92.setContentDescription(r7);
    L26:
        r92.setCheckable(r12.getBoolean(26, true));
    L38:
        int r72 = r12.getDimensionPixelSize(29, getResources().getDimensionPixelSize(C1031R.dimen.mtrl_min_touch_target_size));
        if (r72 < 0) goto L59;
        if (r72 == this.f128m) goto L44;
        this.f128m = r72;
        r92.setMinimumWidth(r72);
        r92.setMinimumHeight(r72);
        r10.setMinimumWidth(r72);
        r10.setMinimumHeight(r72);
    L44:
        if (r12.hasValue(31) == false) goto L46;
        ImageView.ScaleType r73 = AbstractC0040p.m113r(r12.getInt(31, -1));
        this.f129n = r73;
        r92.setScaleType(r73);
        r10.setScaleType(r73);
    L46:
        r11.setVisibility(8);
        r11.setId(C1031R.id.textinput_suffix_text);
        r11.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        r11.setAccessibilityLiveRegion(1);
        r11.setTextAppearance(r12.getResourceId(72, 0));
        if (r12.hasValue(73) == false) goto L49;
        r11.setTextColor(r19.m645h(73));
    L49:
        CharSequence r2 = r12.getText(71);
        if (TextUtils.isEmpty(r2) == true) goto L53;
        r13 = r2;
    L53:
        this.f131p = r13;
        r11.setText(r2);
        m153n();
        r6.addView(r92);
        addView(r11);
        addView(r6);
        addView(r10);
        r18.f2472e0.add(r4);
        if (r18.f2469d == null) goto L56;
        r4.m137a(r18);
    L56:
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0043s(r3, this));
        return;
    L59:
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    L28:
        if (r12.hasValue(53) == false) goto L38;
        if (r12.hasValue(54) == false) goto L33;
        this.f126k = AbstractC0805P.m2050q(getContext(), r19, 54);
    L33:
        if (r12.hasValue(55) == false) goto L35;
        this.f127l = AbstractC1077k.m2558f(r12.getInt(55, -1), null);
    L35:
        m146g(r12.getBoolean(53, false) ? 1 : 0);
        CharSequence r74 = r12.getText(51);
        if (r92.getContentDescription() == r74) goto L38;
        r92.setContentDescription(r74);
        goto L38
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m140a(ViewGroup r3, LayoutInflater r4, int r5) {
        CheckableImageButton r32 = (CheckableImageButton) r4.inflate(C1031R.layout.design_text_input_end_icon, r3, false);
        r32.setId(r5);
        if (AbstractC0805P.m2031E(getContext()) == false) goto L5;
        ((ViewGroup.MarginLayoutParams) r32.getLayoutParams()).setMarginStart(0);
    L5:
        return r32;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0046v m141b() {
        int r02 = this.f124i;
        C0044t r1 = this.f123h;
        SparseArray r2 = r1.f112a;
        AbstractC0046v r3 = (AbstractC0046v) r2.get(r02);
        if (r3 != null) goto L22;
        C0045u r4 = r1.f113b;
        if (r02 == (-1)) goto L20;
        if (r02 != 0) goto L8;
        AbstractC0046v r12 = new C0031g(r4, 1);
    L14:
        r3 = r12;
    L21:
        r2.append(r02, r3);
        goto L22
    L8:
        if (r02 != 1) goto L10;
        r3 = new C0050z(r4, r1.f115d);
        goto L21
    L10:
        if (r02 != 2) goto L12;
        r12 = new C0030f(r4);
        goto L14
    L12:
        if (r02 != 3) goto L16;
        r12 = new C0039o(r4);
        goto L14
    L16:
        throw new IllegalArgumentException(AbstractC0324d.m720c("Invalid end icon mode: ", r02));
    L20:
        r12 = new C0031g(r4, 0);
    L22:
        return r3;
    }

    /* JADX INFO: renamed from: c */
    public final int m142c() {
        if (m143d() == false) goto L5;
    L8:
        CheckableImageButton r02 = this.f122g;
        int r1 = r02.getMeasuredWidth();
        int r03 = ((ViewGroup.MarginLayoutParams) r02.getLayoutParams()).getMarginStart() + r1;
    L9:
        Field r12 = AbstractC0080Q.f219a;
        int r13 = getPaddingEnd();
        return (this.f132q.getPaddingEnd() + r13) + r03;
    L5:
        if (m144e() == true) goto L8;
        r03 = 0;
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public final boolean m143d() {
        if (this.f117b.getVisibility() == 0) goto L5;
    L7:
        return false;
    L5:
        if (this.f122g.getVisibility() != 0) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m144e() {
        if (this.f118c.getVisibility() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m145f(boolean r6) {
        AbstractC0046v r02 = m141b();
        boolean r1 = r02.mo155k();
        CheckableImageButton r2 = this.f122g;
        boolean r3 = true;
        if (r1 == false) goto L7;
        boolean r12 = r2.f2393d;
        if (r12 == r02.mo74l()) goto L7;
        r2.setChecked(!r12);
        boolean r13 = true;
    L9:
        if ((r02 instanceof C0039o) == false) goto L13;
        boolean r4 = r2.isActivated();
        if (r4 == r02.mo73j()) goto L13;
        r2.setActivated(!r4);
    L14:
        if (r6 == true) goto L16;
        if (r3 == true) goto L16;
        return;
    L16:
        AbstractC0040p.m86O(this.f116a, r2, this.f126k);
        return;
    L13:
        r3 = r13;
    L7:
        r13 = false;
        goto L9
    }

    /* JADX INFO: renamed from: g */
    public final void m146g(int r9) {
        if (this.f124i != r9) goto L5;
        return;
    L5:
        AbstractC0046v r02 = m141b();
        C0037m r1 = this.f136u;
        AccessibilityManager r2 = this.f135t;
        if (r1 == null) goto L9;
        if (r2 == null) goto L9;
        r2.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0148b(r1));
    L9:
        CharSequence r12 = null;
        this.f136u = null;
        r02.mo66s();
        this.f124i = r9;
        Iterator r03 = this.f125j.iterator();
        if (r03.hasNext() == false) goto L12;
        AbstractC0324d.m726i(r03.next());
        throw null;
    L12:
        if (r9 == 0) goto L14;
        boolean r3 = true;
    L15:
        m147h(r3);
        AbstractC0046v r32 = m141b();
        int r4 = this.f123h.f114c;
        if (r4 != 0) goto L18;
        r4 = r32.mo59d();
    L18:
        if (r4 == 0) goto L20;
        Drawable r42 = AbstractC0358S.m916w(getContext(), r4);
    L21:
        CheckableImageButton r5 = this.f122g;
        r5.setImageDrawable(r42);
        TextInputLayout r6 = this.f116a;
        if (r42 == null) goto L24;
        AbstractC0040p.m98c(r6, r5, this.f126k, this.f127l);
        AbstractC0040p.m86O(r6, r5, this.f126k);
    L24:
        int r43 = r32.mo58c();
        if (r43 == 0) goto L28;
        r12 = getResources().getText(r43);
    L28:
        if (r5.getContentDescription() == r12) goto L30;
        r5.setContentDescription(r12);
    L30:
        r5.setCheckable(r32.mo155k());
        if (r32.mo72i(r6.getBoxBackgroundMode()) == false) goto L44;
        r32.mo65r();
        C0037m r92 = r32.mo71h();
        this.f136u = r92;
        if (r92 == null) goto L38;
        if (r2 == null) goto L38;
        Field r93 = AbstractC0080Q.f219a;
        if (isAttachedToWindow() == false) goto L38;
        r2.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0148b(this.f136u));
    L38:
        View.OnClickListener r94 = r32.mo61f();
        View.OnLongClickListener r13 = this.f130o;
        r5.setOnClickListener(r94);
        AbstractC0040p.m89T(r5, r13);
        EditText r95 = this.f134s;
        if (r95 == null) goto L41;
        r32.mo63m(r95);
        m149j(r32);
    L41:
        AbstractC0040p.m98c(r6, r5, this.f126k, this.f127l);
        m145f(true);
        return;
    L44:
        throw new IllegalStateException("The current box background mode " + r6.getBoxBackgroundMode() + " is not supported by the end icon mode " + r9);
    L20:
        r42 = null;
        goto L21
    L14:
        r3 = false;
        goto L15
    }

    /* JADX INFO: renamed from: h */
    public final void m147h(boolean r2) {
        if (m143d() == r2) goto L9;
        if (r2 == false) goto L6;
        int r22 = 0;
    L7:
        this.f122g.setVisibility(r22);
        m150k();
        m152m();
        this.f116a.m1903q();
        return;
    L6:
        r22 = 8;
        goto L7
    }

    /* JADX INFO: renamed from: i */
    public final void m148i(Drawable r4) {
        CheckableImageButton r02 = this.f118c;
        r02.setImageDrawable(r4);
        m151l();
        ColorStateList r42 = this.f119d;
        PorterDuff.Mode r1 = this.f120e;
        AbstractC0040p.m98c(this.f116a, r02, r42, r1);
    }

    /* JADX INFO: renamed from: j */
    public final void m149j(AbstractC0046v r3) {
        if (this.f134s != null) goto L6;
        return;
    L6:
        if (r3.mo60e() == null) goto L9;
        this.f134s.setOnFocusChangeListener(r3.mo60e());
    L9:
        if (r3.mo62g() == null) goto L12;
        this.f122g.setOnFocusChangeListener(r3.mo62g());
        return;
    }

    /* JADX INFO: renamed from: k */
    public final void m150k() {
        int r1 = 8;
        if (this.f122g.getVisibility() == 0) goto L5;
    L7:
        int r02 = 8;
    L8:
        this.f117b.setVisibility(r02);
        if (this.f131p != null) goto L11;
    L13:
        char r03 = '\b';
    L15:
        if (m143d() == false) goto L17;
    L19:
        r1 = 0;
    L20:
        setVisibility(r1);
        return;
    L17:
        if (m144e() == true) goto L19;
        if (r03 != 0) goto L20;
    L11:
        if (this.f133r == true) goto L13;
        r03 = 0;
        goto L15
    L5:
        if (m144e() == true) goto L7;
        r02 = 0;
        goto L8
    }

    /* JADX INFO: renamed from: l */
    public final void m151l() {
        CheckableImageButton r02 = this.f118c;
        Drawable r1 = r02.getDrawable();
        TextInputLayout r2 = this.f116a;
        if (r1 != null) goto L5;
    L9:
        int r12 = 8;
    L10:
        r02.setVisibility(r12);
        m150k();
        m152m();
        if (this.f124i != 0) goto L15;
        r2.m1903q();
        return;
    L15:
        return;
    L5:
        if (r2.f2481j.f167q == false) goto L9;
        if (r2.m1899m() == false) goto L9;
        r12 = 0;
        goto L10
    }

    /* JADX INFO: renamed from: m */
    public final void m152m() {
        TextInputLayout r02 = this.f116a;
        if (r02.f2469d != null) goto L6;
        return;
    L6:
        if (m143d() == false) goto L8;
    L11:
        int r1 = 0;
    L12:
        int r2 = getContext().getResources().getDimensionPixelSize(C1031R.dimen.material_input_text_to_prefix_suffix_padding);
        int r3 = r02.f2469d.getPaddingTop();
        int r03 = r02.f2469d.getPaddingBottom();
        Field r4 = AbstractC0080Q.f219a;
        this.f132q.setPaddingRelative(r2, r3, r1, r03);
        return;
    L8:
        if (m144e() == true) goto L11;
        EditText r12 = r02.f2469d;
        Field r22 = AbstractC0080Q.f219a;
        r1 = r12.getPaddingEnd();
        goto L12
    }

    /* JADX INFO: renamed from: n */
    public final void m153n() {
        C0868K r02 = this.f132q;
        int r1 = r02.getVisibility();
        boolean r3 = false;
        if (this.f131p != null) goto L5;
    L7:
        int r2 = 8;
    L8:
        if (r1 == r2) goto L13;
        AbstractC0046v r12 = m141b();
        if (r2 != 0) goto L12;
        r3 = true;
    L12:
        r12.mo64p(r3);
    L13:
        m150k();
        r02.setVisibility(r2);
        this.f116a.m1903q();
        return;
    L5:
        if (this.f133r == true) goto L7;
        r2 = 0;
        goto L8
    }
}
