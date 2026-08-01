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
import com.ljx.wechatmod.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ej */
/* JADX INFO: loaded from: classes.dex */
public final class C0189ej extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f1786a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f1787b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f1788c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f1789d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f1790e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f1791f;

    /* JADX INFO: renamed from: g */
    public final CheckableImageButton f1792g;

    /* JADX INFO: renamed from: h */
    public final C0153dj f1793h;

    /* JADX INFO: renamed from: i */
    public int f1794i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f1795j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f1796k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f1797l;

    /* JADX INFO: renamed from: m */
    public int f1798m;

    /* JADX INFO: renamed from: n */
    public ImageView.ScaleType f1799n;

    /* JADX INFO: renamed from: o */
    public View.OnLongClickListener f1800o;

    /* JADX INFO: renamed from: p */
    public CharSequence f1801p;

    /* JADX INFO: renamed from: q */
    public final C0249g5 f1802q;

    /* JADX INFO: renamed from: r */
    public boolean f1803r;

    /* JADX INFO: renamed from: s */
    public EditText f1804s;

    /* JADX INFO: renamed from: t */
    public final AccessibilityManager f1805t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0001a0 f1806u;

    /* JADX INFO: renamed from: v */
    public final C0070bj f1807v;

    public C0189ej(TextInputLayout textInputLayout, C0659r5 c0659r5) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f1794i = 0;
        this.f1795j = new LinkedHashSet();
        this.f1807v = new C0070bj(this);
        C0106cj c0106cj = new C0106cj(this);
        this.f1805t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1786a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1787b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM1035a = m1035a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f1788c = checkableImageButtonM1035a;
        CheckableImageButton checkableImageButtonM1035a2 = m1035a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f1792g = checkableImageButtonM1035a2;
        this.f1793h = new C0153dj(this, c0659r5);
        C0249g5 c0249g5 = new C0249g5(getContext(), null);
        this.f1802q = c0249g5;
        TypedArray typedArray = (TypedArray) c0659r5.f4209b;
        if (typedArray.hasValue(38)) {
            this.f1789d = AbstractC0126ct.m815m(getContext(), c0659r5, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f1790e = AbstractC0273gt.m1313v(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m1043i(c0659r5.m2234m(37));
        }
        checkableImageButtonM1035a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2327s(checkableImageButtonM1035a, 2);
        checkableImageButtonM1035a.setClickable(false);
        checkableImageButtonM1035a.setPressable(false);
        checkableImageButtonM1035a.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f1796k = AbstractC0126ct.m815m(getContext(), c0659r5, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1797l = AbstractC0273gt.m1313v(typedArray.getInt(33, -1), null);
            }
        }
        int i = 1;
        if (typedArray.hasValue(30)) {
            m1041g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonM1035a2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonM1035a2.setContentDescription(text);
            }
            checkableImageButtonM1035a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f1796k = AbstractC0126ct.m815m(getContext(), c0659r5, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f1797l = AbstractC0273gt.m1313v(typedArray.getInt(55, -1), null);
            }
            m1041g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonM1035a2.getContentDescription() != text2) {
                checkableImageButtonM1035a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1798m) {
            this.f1798m = dimensionPixelSize;
            checkableImageButtonM1035a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM1035a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM1035a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM1035a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM1190l = AbstractC0222ff.m1190l(typedArray.getInt(31, -1));
            this.f1799n = scaleTypeM1190l;
            checkableImageButtonM1035a2.setScaleType(scaleTypeM1190l);
            checkableImageButtonM1035a.setScaleType(scaleTypeM1190l);
        }
        c0249g5.setVisibility(8);
        c0249g5.setId(R.id.textinput_suffix_text);
        c0249g5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        v90.m2499f(c0249g5, 1);
        c0249g5.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0249g5.setTextColor(c0659r5.m2233l(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f1801p = TextUtils.isEmpty(text3) ? null : text3;
        c0249g5.setText(text3);
        m1048n();
        frameLayout.addView(checkableImageButtonM1035a2);
        addView(c0249g5);
        addView(frameLayout);
        addView(checkableImageButtonM1035a);
        textInputLayout.f1207e0.add(c0106cj);
        if (textInputLayout.f1204d != null) {
            c0106cj.m691a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0625q8(i, this));
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m1035a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC0126ct.m821s(getContext())) {
            AbstractC0199et.m1076h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0226fj m1036b() {
        AbstractC0226fj c0927ye;
        int i = this.f1794i;
        C0153dj c0153dj = this.f1793h;
        SparseArray sparseArray = c0153dj.f1599a;
        AbstractC0226fj abstractC0226fj = (AbstractC0226fj) sparseArray.get(i);
        if (abstractC0226fj != null) {
            return abstractC0226fj;
        }
        C0189ej c0189ej = c0153dj.f1600b;
        if (i == -1) {
            c0927ye = new C0927ye(c0189ej, 0);
        } else if (i == 0) {
            c0927ye = new C0927ye(c0189ej, 1);
        } else if (i == 1) {
            c0927ye = new C0501mx(c0189ej, c0153dj.f1602d);
        } else if (i == 2) {
            c0927ye = new C0775ua(c0189ej);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Invalid end icon mode: " + i);
            }
            c0927ye = new C0597ph(c0189ej);
        }
        sparseArray.append(i, c0927ye);
        return c0927ye;
    }

    /* JADX INFO: renamed from: c */
    public final int m1037c() {
        int iM1071c;
        if (m1038d() || m1039e()) {
            CheckableImageButton checkableImageButton = this.f1792g;
            iM1071c = AbstractC0199et.m1071c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iM1071c = 0;
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        return t90.m2368e(this.f1802q) + t90.m2368e(this) + iM1071c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1038d() {
        return this.f1787b.getVisibility() == 0 && this.f1792g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1039e() {
        return this.f1788c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m1040f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC0226fj abstractC0226fjM1036b = m1036b();
        boolean zMo1222j = abstractC0226fjM1036b.mo1222j();
        CheckableImageButton checkableImageButton = this.f1792g;
        boolean z4 = true;
        if (!zMo1222j || (z3 = checkableImageButton.f1129d) == abstractC0226fjM1036b.mo1223k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC0226fjM1036b instanceof C0597ph) || (zIsActivated = checkableImageButton.isActivated()) == ((C0597ph) abstractC0226fjM1036b).f3898l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC0222ff.m1165K(this.f1786a, checkableImageButton, this.f1796k);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1041g(int i) {
        if (this.f1794i == i) {
            return;
        }
        AbstractC0226fj abstractC0226fjM1036b = m1036b();
        InterfaceC0001a0 interfaceC0001a0 = this.f1806u;
        AccessibilityManager accessibilityManager = this.f1805t;
        if (interfaceC0001a0 != null && accessibilityManager != null) {
            AbstractC0949z.m2747b(accessibilityManager, interfaceC0001a0);
        }
        this.f1806u = null;
        abstractC0226fjM1036b.mo1230r();
        this.f1794i = i;
        Iterator it = this.f1795j.iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
        m1042h(i != 0);
        AbstractC0226fj abstractC0226fjM1036b2 = m1036b();
        int iMo1216d = this.f1793h.f1601c;
        if (iMo1216d == 0) {
            iMo1216d = abstractC0226fjM1036b2.mo1216d();
        }
        Drawable drawableM1196r = iMo1216d != 0 ? AbstractC0222ff.m1196r(getContext(), iMo1216d) : null;
        CheckableImageButton checkableImageButton = this.f1792g;
        checkableImageButton.setImageDrawable(drawableM1196r);
        TextInputLayout textInputLayout = this.f1786a;
        if (drawableM1196r != null) {
            AbstractC0222ff.m1181a(textInputLayout, checkableImageButton, this.f1796k, this.f1797l);
            AbstractC0222ff.m1165K(textInputLayout, checkableImageButton, this.f1796k);
        }
        int iMo1215c = abstractC0226fjM1036b2.mo1215c();
        CharSequence text = iMo1215c != 0 ? getResources().getText(iMo1215c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0226fjM1036b2.mo1222j());
        if (!abstractC0226fjM1036b2.mo1221i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC0226fjM1036b2.mo1229q();
        InterfaceC0001a0 interfaceC0001a0Mo1220h = abstractC0226fjM1036b2.mo1220h();
        this.f1806u = interfaceC0001a0Mo1220h;
        if (interfaceC0001a0Mo1220h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = ja0.f2600a;
            if (v90.m2495b(this)) {
                AbstractC0949z.m2746a(accessibilityManager, this.f1806u);
            }
        }
        View.OnClickListener onClickListenerMo1218f = abstractC0226fjM1036b2.mo1218f();
        View.OnLongClickListener onLongClickListener = this.f1800o;
        checkableImageButton.setOnClickListener(onClickListenerMo1218f);
        AbstractC0222ff.m1167M(checkableImageButton, onLongClickListener);
        EditText editText = this.f1804s;
        if (editText != null) {
            abstractC0226fjM1036b2.mo1224l(editText);
            m1044j(abstractC0226fjM1036b2);
        }
        AbstractC0222ff.m1181a(textInputLayout, checkableImageButton, this.f1796k, this.f1797l);
        m1040f(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m1042h(boolean z) {
        if (m1038d() != z) {
            this.f1792g.setVisibility(z ? 0 : 8);
            m1045k();
            m1047m();
            this.f1786a.m783q();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1043i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1788c;
        checkableImageButton.setImageDrawable(drawable);
        m1046l();
        AbstractC0222ff.m1181a(this.f1786a, checkableImageButton, this.f1789d, this.f1790e);
    }

    /* JADX INFO: renamed from: j */
    public final void m1044j(AbstractC0226fj abstractC0226fj) {
        if (this.f1804s == null) {
            return;
        }
        if (abstractC0226fj.mo1217e() != null) {
            this.f1804s.setOnFocusChangeListener(abstractC0226fj.mo1217e());
        }
        if (abstractC0226fj.mo1219g() != null) {
            this.f1792g.setOnFocusChangeListener(abstractC0226fj.mo1219g());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1045k() {
        this.f1787b.setVisibility((this.f1792g.getVisibility() != 0 || m1039e()) ? 8 : 0);
        setVisibility((m1038d() || m1039e() || ((this.f1801p == null || this.f1803r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: l */
    public final void m1046l() {
        CheckableImageButton checkableImageButton = this.f1788c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1786a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1216j.f5594q && textInputLayout.m779m()) ? 0 : 8);
        m1045k();
        m1047m();
        if (this.f1794i != 0) {
            return;
        }
        textInputLayout.m783q();
    }

    /* JADX INFO: renamed from: m */
    public final void m1047m() {
        int iM2368e;
        TextInputLayout textInputLayout = this.f1786a;
        if (textInputLayout.f1204d == null) {
            return;
        }
        if (m1038d() || m1039e()) {
            iM2368e = 0;
        } else {
            EditText editText = textInputLayout.f1204d;
            WeakHashMap weakHashMap = ja0.f2600a;
            iM2368e = t90.m2368e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f1204d.getPaddingTop();
        int paddingBottom = textInputLayout.f1204d.getPaddingBottom();
        WeakHashMap weakHashMap2 = ja0.f2600a;
        t90.m2374k(this.f1802q, dimensionPixelSize, paddingTop, iM2368e, paddingBottom);
    }

    /* JADX INFO: renamed from: n */
    public final void m1048n() {
        C0249g5 c0249g5 = this.f1802q;
        int visibility = c0249g5.getVisibility();
        int i = (this.f1801p == null || this.f1803r) ? 8 : 0;
        if (visibility != i) {
            m1036b().mo1227o(i == 0);
        }
        m1045k();
        c0249g5.setVisibility(i);
        this.f1786a.m783q();
    }
}
