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

    public C1141ag(TextInputLayout textInputLayout, C2656w4 c2656w4) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f3614i = 0;
        this.f3615j = new LinkedHashSet();
        this.f3627v = new C1010Xf(this);
        C1053Yf c1053Yf = new C1053Yf(this);
        this.f3625t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3606a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3607b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM2058a = m2058a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f3608c = checkableImageButtonM2058a;
        CheckableImageButton checkableImageButtonM2058a2 = m2058a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f3612g = checkableImageButtonM2058a2;
        this.f3613h = new C1096Zf(this, c2656w4);
        C2304o4 c2304o4 = new C2304o4(getContext(), null);
        this.f3622q = c2304o4;
        TypedArray typedArray = (TypedArray) c2656w4.f9196b;
        if (typedArray.hasValue(38)) {
            this.f3609d = AbstractC0828TB.m1642i(getContext(), c2656w4, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f3610e = AbstractC0148Dc.m282p(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m2066i(c2656w4.m5210q(37));
        }
        checkableImageButtonM2058a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonM2058a.setImportantForAccessibility(2);
        checkableImageButtonM2058a.setClickable(false);
        checkableImageButtonM2058a.setPressable(false);
        checkableImageButtonM2058a.setCheckable(false);
        checkableImageButtonM2058a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f3616k = AbstractC0828TB.m1642i(getContext(), c2656w4, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f3617l = AbstractC0148Dc.m282p(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            m2064g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonM2058a2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonM2058a2.setContentDescription(text);
            }
            checkableImageButtonM2058a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f3616k = AbstractC0828TB.m1642i(getContext(), c2656w4, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f3617l = AbstractC0148Dc.m282p(typedArray.getInt(56, -1), null);
            }
            m2064g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonM2058a2.getContentDescription() != text2) {
                checkableImageButtonM2058a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3618m) {
            this.f3618m = dimensionPixelSize;
            checkableImageButtonM2058a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM2058a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM2058a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM2058a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM613f = AbstractC0295Gu.m613f(typedArray.getInt(31, -1));
            this.f3619n = scaleTypeM613f;
            checkableImageButtonM2058a2.setScaleType(scaleTypeM613f);
            checkableImageButtonM2058a.setScaleType(scaleTypeM613f);
        }
        c2304o4.setVisibility(8);
        c2304o4.setId(R.id.textinput_suffix_text);
        c2304o4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c2304o4.setAccessibilityLiveRegion(1);
        c2304o4.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            c2304o4.setTextColor(c2656w4.m5209p(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.f3621p = TextUtils.isEmpty(text3) ? null : text3;
        c2304o4.setText(text3);
        m2071n();
        frameLayout.addView(checkableImageButtonM2058a2);
        addView(c2304o4);
        addView(frameLayout);
        addView(checkableImageButtonM2058a);
        textInputLayout.f4628f0.add(c1053Yf);
        if (textInputLayout.f4625e != null) {
            c1053Yf.m1999a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(2, this));
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m2058a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC0828TB.m1650t(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1221bg m2059b() {
        AbstractC1221bg c2232mc;
        int i = this.f3614i;
        C1096Zf c1096Zf = this.f3613h;
        SparseArray sparseArray = c1096Zf.f3481a;
        AbstractC1221bg abstractC1221bg = (AbstractC1221bg) sparseArray.get(i);
        if (abstractC1221bg != null) {
            return abstractC1221bg;
        }
        C1141ag c1141ag = c1096Zf.f3482b;
        if (i == -1) {
            c2232mc = new C2232mc(c1141ag, 0);
        } else if (i == 0) {
            c2232mc = new C2232mc(c1141ag, 1);
        } else if (i == 1) {
            c2232mc = new C0509Lt(c1141ag, c1096Zf.f3484d);
        } else if (i == 2) {
            c2232mc = new C0569N9(c1141ag);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Invalid end icon mode: "));
            }
            c2232mc = new C0494Le(c1141ag);
        }
        sparseArray.append(i, c2232mc);
        return c2232mc;
    }

    /* JADX INFO: renamed from: c */
    public final int m2060c() {
        int marginStart;
        if (m2061d() || m2062e()) {
            CheckableImageButton checkableImageButton = this.f3612g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f3622q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2061d() {
        return this.f3607b.getVisibility() == 0 && this.f3612g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2062e() {
        return this.f3608c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m2063f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC1221bg abstractC1221bgM2059b = m2059b();
        boolean zMo993j = abstractC1221bgM2059b.mo993j();
        CheckableImageButton checkableImageButton = this.f3612g;
        boolean z4 = true;
        if (!zMo993j || (z3 = checkableImageButton.f4545d) == abstractC1221bgM2059b.mo953k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC1221bgM2059b instanceof C0494Le) || (zIsActivated = checkableImageButton.isActivated()) == ((C0494Le) abstractC1221bgM2059b).f1613l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC0295Gu.m600A(this.f3606a, checkableImageButton, this.f3616k);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2064g(int i) {
        if (this.f3614i == i) {
            return;
        }
        AbstractC1221bg abstractC1221bgM2059b = m2059b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f3626u;
        AccessibilityManager accessibilityManager = this.f3625t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f3626u = null;
        abstractC1221bgM2059b.mo958r();
        this.f3614i = i;
        Iterator it = this.f3615j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m2065h(i != 0);
        AbstractC1221bg abstractC1221bgM2059b2 = m2059b();
        int iMo948d = this.f3613h.f3483c;
        if (iMo948d == 0) {
            iMo948d = abstractC1221bgM2059b2.mo948d();
        }
        Drawable drawableM2695U = iMo948d != 0 ? AbstractC1406fG.m2695U(getContext(), iMo948d) : null;
        CheckableImageButton checkableImageButton = this.f3612g;
        checkableImageButton.setImageDrawable(drawableM2695U);
        TextInputLayout textInputLayout = this.f3606a;
        if (drawableM2695U != null) {
            AbstractC0295Gu.m608a(textInputLayout, checkableImageButton, this.f3616k, this.f3617l);
            AbstractC0295Gu.m600A(textInputLayout, checkableImageButton, this.f3616k);
        }
        int iMo947c = abstractC1221bgM2059b2.mo947c();
        CharSequence text = iMo947c != 0 ? getResources().getText(iMo947c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC1221bgM2059b2.mo993j());
        if (!abstractC1221bgM2059b2.mo952i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC1221bgM2059b2.mo957q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerMo951h = abstractC1221bgM2059b2.mo951h();
        this.f3626u = touchExplorationStateChangeListenerMo951h;
        if (touchExplorationStateChangeListenerMo951h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f3626u);
        }
        View.OnClickListener onClickListenerMo950f = abstractC1221bgM2059b2.mo950f();
        View.OnLongClickListener onLongClickListener = this.f3620o;
        checkableImageButton.setOnClickListener(onClickListenerMo950f);
        AbstractC0295Gu.m602C(checkableImageButton, onLongClickListener);
        EditText editText = this.f3624s;
        if (editText != null) {
            abstractC1221bgM2059b2.mo954l(editText);
            m2067j(abstractC1221bgM2059b2);
        }
        AbstractC0295Gu.m608a(textInputLayout, checkableImageButton, this.f3616k, this.f3617l);
        m2063f(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m2065h(boolean z) {
        if (m2061d() != z) {
            this.f3612g.setVisibility(z ? 0 : 8);
            m2068k();
            m2070m();
            this.f3606a.m2491s();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2066i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3608c;
        checkableImageButton.setImageDrawable(drawable);
        m2069l();
        AbstractC0295Gu.m608a(this.f3606a, checkableImageButton, this.f3609d, this.f3610e);
    }

    /* JADX INFO: renamed from: j */
    public final void m2067j(AbstractC1221bg abstractC1221bg) {
        if (this.f3624s == null) {
            return;
        }
        if (abstractC1221bg.mo949e() != null) {
            this.f3624s.setOnFocusChangeListener(abstractC1221bg.mo949e());
        }
        if (abstractC1221bg.mo1112g() != null) {
            this.f3612g.setOnFocusChangeListener(abstractC1221bg.mo1112g());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2068k() {
        this.f3607b.setVisibility((this.f3612g.getVisibility() != 0 || m2062e()) ? 8 : 0);
        setVisibility((m2061d() || m2062e() || ((this.f3621p == null || this.f3623r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: l */
    public final void m2069l() {
        CheckableImageButton checkableImageButton = this.f3608c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f3606a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f4637k.f7911q && textInputLayout.m2487o()) ? 0 : 8);
        m2068k();
        m2070m();
        if (this.f3614i != 0) {
            return;
        }
        textInputLayout.m2491s();
    }

    /* JADX INFO: renamed from: m */
    public final void m2070m() {
        TextInputLayout textInputLayout = this.f3606a;
        if (textInputLayout.f4625e == null) {
            return;
        }
        this.f3622q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f4625e.getPaddingTop(), (m2061d() || m2062e()) ? 0 : textInputLayout.f4625e.getPaddingEnd(), textInputLayout.f4625e.getPaddingBottom());
    }

    /* JADX INFO: renamed from: n */
    public final void m2071n() {
        C2304o4 c2304o4 = this.f3622q;
        int visibility = c2304o4.getVisibility();
        int i = (this.f3621p == null || this.f3623r) ? 8 : 0;
        if (visibility != i) {
            m2059b().mo1113o(i == 0);
        }
        m2068k();
        c2304o4.setVisibility(i);
        this.f3606a.m2491s();
    }
}
