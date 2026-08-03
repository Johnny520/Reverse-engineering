package p000;

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
import io.github.cherrywechat.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ag */
/* JADX INFO: loaded from: classes.dex */
public final class C1141ag extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f3606a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f3607b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f3608c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f3609d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f3610e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f3611f;

    /* JADX INFO: renamed from: g */
    public final CheckableImageButton f3612g;

    /* JADX INFO: renamed from: h */
    public final C1096Zf f3613h;

    /* JADX INFO: renamed from: i */
    public int f3614i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f3615j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f3616k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f3617l;

    /* JADX INFO: renamed from: m */
    public int f3618m;

    /* JADX INFO: renamed from: n */
    public ImageView.ScaleType f3619n;

    /* JADX INFO: renamed from: o */
    public View.OnLongClickListener f3620o;

    /* JADX INFO: renamed from: p */
    public CharSequence f3621p;

    /* JADX INFO: renamed from: q */
    public final C2304o4 f3622q;

    /* JADX INFO: renamed from: r */
    public boolean f3623r;

    /* JADX INFO: renamed from: s */
    public EditText f3624s;

    /* JADX INFO: renamed from: t */
    public final AccessibilityManager f3625t;

    /* JADX INFO: renamed from: u */
    public AccessibilityManager.TouchExplorationStateChangeListener f3626u;

    /* JADX INFO: renamed from: v */
    public final C1010Xf f3627v;

    public C1141ag(TextInputLayout r18, C2656w4 r19) {
        super(r18.getContext());
        this.f3614i = 0;
        this.f3615j = new LinkedHashSet();
        this.f3627v = new C1010Xf(this);
        C1053Yf r4 = new C1053Yf(this);
        this.f3625t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3606a = r18;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout r6 = new FrameLayout(getContext());
        this.f3607b = r6;
        r6.setVisibility(8);
        r6.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater r7 = LayoutInflater.from(getContext());
        CheckableImageButton r10 = m2058a(this, r7, R.id.text_input_error_icon);
        this.f3608c = r10;
        CheckableImageButton r72 = m2058a(r6, r7, R.id.text_input_end_icon);
        this.f3612g = r72;
        this.f3613h = new C1096Zf(this, r19);
        CharSequence r13 = null;
        C2304o4 r11 = new C2304o4(getContext(), null);
        this.f3622q = r11;
        TypedArray r12 = (TypedArray) r19.f9196b;
        if (r12.hasValue(38) == false) goto L6;
        this.f3609d = AbstractC0828TB.m1642i(getContext(), r19, 38);
    L6:
        if (r12.hasValue(39) == false) goto L9;
        this.f3610e = AbstractC0148Dc.m282p(r12.getInt(39, -1), null);
    L9:
        if (r12.hasValue(37) == false) goto L11;
        m2066i(r19.m5210q(37));
    L11:
        r10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        r10.setImportantForAccessibility(2);
        r10.setClickable(false);
        r10.setPressable(false);
        r10.setCheckable(false);
        r10.setFocusable(false);
        if (r12.hasValue(54) == true) goto L20;
        if (r12.hasValue(32) == false) goto L17;
        this.f3616k = AbstractC0828TB.m1642i(getContext(), r19, 32);
    L17:
        if (r12.hasValue(33) == false) goto L20;
        this.f3617l = AbstractC0148Dc.m282p(r12.getInt(33, -1), null);
    L20:
        if (r12.hasValue(30) == false) goto L28;
        m2064g(r12.getInt(30, 0));
        if (r12.hasValue(27) == false) goto L26;
        CharSequence r8 = r12.getText(27);
        if (r72.getContentDescription() == r8) goto L26;
        r72.setContentDescription(r8);
    L26:
        r72.setCheckable(r12.getBoolean(26, true));
    L38:
        int r82 = r12.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (r82 < 0) goto L59;
        if (r82 == this.f3618m) goto L44;
        this.f3618m = r82;
        r72.setMinimumWidth(r82);
        r72.setMinimumHeight(r82);
        r10.setMinimumWidth(r82);
        r10.setMinimumHeight(r82);
    L44:
        if (r12.hasValue(31) == false) goto L46;
        ImageView.ScaleType r83 = AbstractC0295Gu.m613f(r12.getInt(31, -1));
        this.f3619n = r83;
        r72.setScaleType(r83);
        r10.setScaleType(r83);
    L46:
        r11.setVisibility(8);
        r11.setId(R.id.textinput_suffix_text);
        r11.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        r11.setAccessibilityLiveRegion(1);
        r11.setTextAppearance(r12.getResourceId(73, 0));
        if (r12.hasValue(74) == false) goto L49;
        r11.setTextColor(r19.m5209p(74));
    L49:
        CharSequence r2 = r12.getText(72);
        if (TextUtils.isEmpty(r2) == true) goto L53;
        r13 = r2;
    L53:
        this.f3621p = r13;
        r11.setText(r2);
        m2071n();
        r6.addView(r72);
        addView(r11);
        addView(r6);
        addView(r10);
        r18.f4628f0.add(r4);
        if (r18.f4625e == null) goto L56;
        r4.m1999a(r18);
    L56:
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(2, this));
        return;
    L59:
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    L28:
        if (r12.hasValue(54) == false) goto L38;
        if (r12.hasValue(55) == false) goto L33;
        this.f3616k = AbstractC0828TB.m1642i(getContext(), r19, 55);
    L33:
        if (r12.hasValue(56) == false) goto L35;
        this.f3617l = AbstractC0148Dc.m282p(r12.getInt(56, -1), null);
    L35:
        m2064g(r12.getBoolean(54, false) ? 1 : 0);
        CharSequence r84 = r12.getText(52);
        if (r72.getContentDescription() == r84) goto L38;
        r72.setContentDescription(r84);
        goto L38
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m2058a(ViewGroup r3, LayoutInflater r4, int r5) {
        CheckableImageButton r32 = (CheckableImageButton) r4.inflate(R.layout.design_text_input_end_icon, r3, false);
        r32.setId(r5);
        if (AbstractC0828TB.m1650t(getContext()) == false) goto L5;
        ((ViewGroup.MarginLayoutParams) r32.getLayoutParams()).setMarginStart(0);
    L5:
        return r32;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1221bg m2059b() {
        int r0 = this.f3614i;
        C1096Zf r1 = this.f3613h;
        SparseArray r2 = r1.f3481a;
        AbstractC1221bg r3 = (AbstractC1221bg) r2.get(r0);
        if (r3 != null) goto L22;
        C1141ag r32 = r1.f3482b;
        if (r0 == (-1)) goto L19;
        if (r0 != 0) goto L8;
        AbstractC1221bg r12 = new C2232mc(r32, 1);
    L20:
        r2.append(r0, r12);
        return r12;
    L8:
        if (r0 != 1) goto L10;
        r12 = new C0509Lt(r32, r1.f3484d);
        goto L20
    L10:
        if (r0 != 2) goto L12;
        r12 = new C0569N9(r32);
        goto L20
    L12:
        if (r0 != 3) goto L15;
        r12 = new C0494Le(r32);
        goto L20
    L15:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r0, "Invalid end icon mode: "));
    L19:
        r12 = new C2232mc(r32, 0);
        goto L20
    L22:
        return r3;
    }

    /* JADX INFO: renamed from: c */
    public final int m2060c() {
        if (m2061d() == false) goto L5;
    L8:
        CheckableImageButton r0 = this.f3612g;
        int r1 = r0.getMeasuredWidth();
        int r02 = ((ViewGroup.MarginLayoutParams) r0.getLayoutParams()).getMarginStart() + r1;
    L9:
        int r12 = getPaddingEnd();
        return (this.f3622q.getPaddingEnd() + r12) + r02;
    L5:
        if (m2062e() == true) goto L8;
        r02 = 0;
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2061d() {
        if (this.f3607b.getVisibility() == 0) goto L5;
        return false;
    L5:
        if (this.f3612g.getVisibility() != 0) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2062e() {
        if (this.f3608c.getVisibility() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2063f(boolean r6) {
        AbstractC1221bg r0 = m2059b();
        boolean r1 = r0.mo993j();
        CheckableImageButton r2 = this.f3612g;
        boolean r3 = true;
        if (r1 == false) goto L7;
        boolean r12 = r2.f4545d;
        if (r12 == r0.mo953k()) goto L7;
        r2.setChecked(!r12);
        boolean r13 = true;
    L9:
        if ((r0 instanceof C0494Le) == false) goto L13;
        boolean r4 = r2.isActivated();
        if (r4 == ((C0494Le) r0).f1613l) goto L13;
        r2.setActivated(!r4);
    L14:
        if (r6 == true) goto L18;
        if (r3 == true) goto L18;
        return;
    L18:
        AbstractC0295Gu.m600A(this.f3606a, r2, this.f3616k);
        return;
    L13:
        r3 = r13;
    L7:
        r13 = false;
        goto L9
    }

    /* JADX INFO: renamed from: g */
    public final void m2064g(int r9) {
        if (this.f3614i != r9) goto L5;
        return;
    L5:
        AbstractC1221bg r0 = m2059b();
        AccessibilityManager.TouchExplorationStateChangeListener r1 = this.f3626u;
        AccessibilityManager r2 = this.f3625t;
        if (r1 == null) goto L9;
        if (r2 == null) goto L9;
        r2.removeTouchExplorationStateChangeListener(r1);
    L9:
        CharSequence r12 = null;
        this.f3626u = null;
        r0.mo958r();
        this.f3614i = r9;
        Iterator r02 = this.f3615j.iterator();
        if (r02.hasNext() == false) goto L12;
        r02.next().getClass();
        throw new ClassCastException();
    L12:
        if (r9 == 0) goto L14;
        boolean r3 = true;
    L15:
        m2065h(r3);
        AbstractC1221bg r32 = m2059b();
        int r4 = this.f3613h.f3483c;
        if (r4 != 0) goto L18;
        r4 = r32.mo948d();
    L18:
        if (r4 == 0) goto L20;
        Drawable r42 = AbstractC1406fG.m2695U(getContext(), r4);
    L21:
        CheckableImageButton r5 = this.f3612g;
        r5.setImageDrawable(r42);
        TextInputLayout r6 = this.f3606a;
        if (r42 == null) goto L24;
        AbstractC0295Gu.m608a(r6, r5, this.f3616k, this.f3617l);
        AbstractC0295Gu.m600A(r6, r5, this.f3616k);
    L24:
        int r43 = r32.mo947c();
        if (r43 == 0) goto L28;
        r12 = getResources().getText(r43);
    L28:
        if (r5.getContentDescription() == r12) goto L30;
        r5.setContentDescription(r12);
    L30:
        r5.setCheckable(r32.mo993j());
        if (r32.mo952i(r6.getBoxBackgroundMode()) == false) goto L44;
        r32.mo957q();
        AccessibilityManager.TouchExplorationStateChangeListener r92 = r32.mo951h();
        this.f3626u = r92;
        if (r92 == null) goto L38;
        if (r2 == null) goto L38;
        if (isAttachedToWindow() == false) goto L38;
        r2.addTouchExplorationStateChangeListener(this.f3626u);
    L38:
        View.OnClickListener r93 = r32.mo950f();
        View.OnLongClickListener r13 = this.f3620o;
        r5.setOnClickListener(r93);
        AbstractC0295Gu.m602C(r5, r13);
        EditText r94 = this.f3624s;
        if (r94 == null) goto L41;
        r32.mo954l(r94);
        m2067j(r32);
    L41:
        AbstractC0295Gu.m608a(r6, r5, this.f3616k, this.f3617l);
        m2063f(true);
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
    public final void m2065h(boolean r2) {
        if (m2061d() == r2) goto L9;
        if (r2 == false) goto L6;
        int r22 = 0;
    L7:
        this.f3612g.setVisibility(r22);
        m2068k();
        m2070m();
        this.f3606a.m2491s();
        return;
    L6:
        r22 = 8;
        goto L7
    }

    /* JADX INFO: renamed from: i */
    public final void m2066i(Drawable r4) {
        CheckableImageButton r0 = this.f3608c;
        r0.setImageDrawable(r4);
        m2069l();
        ColorStateList r42 = this.f3609d;
        PorterDuff.Mode r1 = this.f3610e;
        AbstractC0295Gu.m608a(this.f3606a, r0, r42, r1);
    }

    /* JADX INFO: renamed from: j */
    public final void m2067j(AbstractC1221bg r3) {
        if (this.f3624s != null) goto L6;
        return;
    L6:
        if (r3.mo949e() == null) goto L9;
        this.f3624s.setOnFocusChangeListener(r3.mo949e());
    L9:
        if (r3.mo1112g() == null) goto L12;
        this.f3612g.setOnFocusChangeListener(r3.mo1112g());
        return;
    }

    /* JADX INFO: renamed from: k */
    public final void m2068k() {
        int r1 = 8;
        if (this.f3612g.getVisibility() == 0) goto L5;
    L7:
        int r0 = 8;
    L8:
        this.f3607b.setVisibility(r0);
        if (this.f3621p != null) goto L11;
    L13:
        char r02 = '\b';
    L15:
        if (m2061d() == false) goto L17;
    L19:
        r1 = 0;
    L20:
        setVisibility(r1);
        return;
    L17:
        if (m2062e() == true) goto L19;
        if (r02 != 0) goto L20;
    L11:
        if (this.f3623r == true) goto L13;
        r02 = 0;
        goto L15
    L5:
        if (m2062e() == true) goto L7;
        r0 = 0;
        goto L8
    }

    /* JADX INFO: renamed from: l */
    public final void m2069l() {
        CheckableImageButton r0 = this.f3608c;
        Drawable r1 = r0.getDrawable();
        TextInputLayout r2 = this.f3606a;
        if (r1 != null) goto L5;
    L9:
        int r12 = 8;
    L10:
        r0.setVisibility(r12);
        m2068k();
        m2070m();
        if (this.f3614i == 0) goto L13;
        return;
    L13:
        r2.m2491s();
        return;
    L5:
        if (r2.f4637k.f7911q == false) goto L9;
        if (r2.m2487o() == false) goto L9;
        r12 = 0;
        goto L10
    }

    /* JADX INFO: renamed from: m */
    public final void m2070m() {
        TextInputLayout r0 = this.f3606a;
        if (r0.f4625e != null) goto L6;
        return;
    L6:
        if (m2061d() == false) goto L8;
    L11:
        int r1 = 0;
    L12:
        int r2 = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int r3 = r0.f4625e.getPaddingTop();
        int r02 = r0.f4625e.getPaddingBottom();
        this.f3622q.setPaddingRelative(r2, r3, r1, r02);
        return;
    L8:
        if (m2062e() == true) goto L11;
        r1 = r0.f4625e.getPaddingEnd();
        goto L12
    }

    /* JADX INFO: renamed from: n */
    public final void m2071n() {
        C2304o4 r0 = this.f3622q;
        int r1 = r0.getVisibility();
        boolean r3 = false;
        if (this.f3621p != null) goto L5;
    L7:
        int r2 = 8;
    L8:
        if (r1 == r2) goto L13;
        AbstractC1221bg r12 = m2059b();
        if (r2 != 0) goto L12;
        r3 = true;
    L12:
        r12.mo1113o(r3);
    L13:
        m2068k();
        r0.setVisibility(r2);
        this.f3606a.m2491s();
        return;
    L5:
        if (this.f3623r == true) goto L7;
        r2 = 0;
        goto L8
    }
}
