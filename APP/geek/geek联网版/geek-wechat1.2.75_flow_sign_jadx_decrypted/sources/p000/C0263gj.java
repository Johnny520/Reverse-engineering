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

/* JADX INFO: renamed from: gj */
/* JADX INFO: loaded from: classes.dex */
public final class C0263gj extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f1997a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f1998b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f1999c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f2000d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f2001e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f2002f;

    /* JADX INFO: renamed from: g */
    public final CheckableImageButton f2003g;

    /* JADX INFO: renamed from: h */
    public final C0226fj f2004h;

    /* JADX INFO: renamed from: i */
    public int f2005i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f2006j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f2007k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f2008l;

    /* JADX INFO: renamed from: m */
    public int f2009m;

    /* JADX INFO: renamed from: n */
    public ImageView.ScaleType f2010n;

    /* JADX INFO: renamed from: o */
    public View.OnLongClickListener f2011o;

    /* JADX INFO: renamed from: p */
    public CharSequence f2012p;

    /* JADX INFO: renamed from: q */
    public final C0249g5 f2013q;

    /* JADX INFO: renamed from: r */
    public boolean f2014r;

    /* JADX INFO: renamed from: s */
    public EditText f2015s;

    /* JADX INFO: renamed from: t */
    public final AccessibilityManager f2016t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0001a0 f2017u;

    /* JADX INFO: renamed from: v */
    public final C0153dj f2018v;

    public C0263gj(TextInputLayout textInputLayout, C0658r5 c0658r5) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f2005i = 0;
        this.f2006j = new LinkedHashSet();
        this.f2018v = new C0153dj(this);
        C0189ej c0189ej = new C0189ej(this);
        this.f2016t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1997a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1998b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM1283a = m1283a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f1999c = checkableImageButtonM1283a;
        CheckableImageButton checkableImageButtonM1283a2 = m1283a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f2003g = checkableImageButtonM1283a2;
        this.f2004h = new C0226fj(this, c0658r5);
        C0249g5 c0249g5 = new C0249g5(getContext(), null);
        this.f2013q = c0249g5;
        TypedArray typedArray = (TypedArray) c0658r5.f4064b;
        if (typedArray.hasValue(38)) {
            this.f2000d = AbstractC0274gu.m1314h(getContext(), c0658r5, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f2001e = AbstractC0498mu.m1881C(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m1291i(c0658r5.m2241m(37));
        }
        checkableImageButtonM1283a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2671s(checkableImageButtonM1283a, 2);
        checkableImageButtonM1283a.setClickable(false);
        checkableImageButtonM1283a.setPressable(false);
        checkableImageButtonM1283a.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f2007k = AbstractC0274gu.m1314h(getContext(), c0658r5, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f2008l = AbstractC0498mu.m1881C(typedArray.getInt(33, -1), null);
            }
        }
        int i = 1;
        if (typedArray.hasValue(30)) {
            m1289g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonM1283a2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonM1283a2.setContentDescription(text);
            }
            checkableImageButtonM1283a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f2007k = AbstractC0274gu.m1314h(getContext(), c0658r5, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f2008l = AbstractC0498mu.m1881C(typedArray.getInt(55, -1), null);
            }
            m1289g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonM1283a2.getContentDescription() != text2) {
                checkableImageButtonM1283a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2009m) {
            this.f2009m = dimensionPixelSize;
            checkableImageButtonM1283a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM1283a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM1283a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM1283a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM1258s = AbstractC0259gf.m1258s(typedArray.getInt(31, -1));
            this.f2010n = scaleTypeM1258s;
            checkableImageButtonM1283a2.setScaleType(scaleTypeM1258s);
            checkableImageButtonM1283a.setScaleType(scaleTypeM1258s);
        }
        c0249g5.setVisibility(8);
        c0249g5.setId(R.id.textinput_suffix_text);
        c0249g5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        aa0.m43f(c0249g5, 1);
        c0249g5.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0249g5.setTextColor(c0658r5.m2240l(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f2012p = TextUtils.isEmpty(text3) ? null : text3;
        c0249g5.setText(text3);
        m1296n();
        frameLayout.addView(checkableImageButtonM1283a2);
        addView(c0249g5);
        addView(frameLayout);
        addView(checkableImageButtonM1283a);
        textInputLayout.f1132e0.add(c0189ej);
        if (textInputLayout.f1129d != null) {
            c0189ej.m998a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0060b9(i, this));
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m1283a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC0274gu.m1321x(getContext())) {
            AbstractC0423kt.m1715h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0300hj m1284b() {
        AbstractC0300hj c0964ze;
        int i = this.f2005i;
        C0226fj c0226fj = this.f2004h;
        SparseArray sparseArray = c0226fj.f1800a;
        AbstractC0300hj abstractC0300hj = (AbstractC0300hj) sparseArray.get(i);
        if (abstractC0300hj != null) {
            return abstractC0300hj;
        }
        C0263gj c0263gj = c0226fj.f1801b;
        if (i == -1) {
            c0964ze = new C0964ze(c0263gj, 0);
        } else if (i == 0) {
            c0964ze = new C0964ze(c0263gj, 1);
        } else if (i == 1) {
            c0964ze = new C0797ux(c0263gj, c0226fj.f1803d);
        } else if (i == 2) {
            c0964ze = new C0098cb(c0263gj);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Invalid end icon mode: " + i);
            }
            c0964ze = new C0670rh(c0263gj);
        }
        sparseArray.append(i, c0964ze);
        return c0964ze;
    }

    /* JADX INFO: renamed from: c */
    public final int m1285c() {
        int iM1710c;
        if (m1286d() || m1287e()) {
            CheckableImageButton checkableImageButton = this.f2003g;
            iM1710c = AbstractC0423kt.m1710c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iM1710c = 0;
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        return y90.m2733e(this.f2013q) + y90.m2733e(this) + iM1710c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1286d() {
        return this.f1998b.getVisibility() == 0 && this.f2003g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1287e() {
        return this.f1999c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m1288f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC0300hj abstractC0300hjM1284b = m1284b();
        boolean zMo1399j = abstractC0300hjM1284b.mo1399j();
        CheckableImageButton checkableImageButton = this.f2003g;
        boolean z4 = true;
        if (!zMo1399j || (z3 = checkableImageButton.f1054d) == abstractC0300hjM1284b.mo1400k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC0300hjM1284b instanceof C0670rh) || (zIsActivated = checkableImageButton.isActivated()) == ((C0670rh) abstractC0300hjM1284b).f4137l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC0259gf.m1233Q(this.f1997a, checkableImageButton, this.f2007k);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1289g(int i) {
        if (this.f2005i == i) {
            return;
        }
        AbstractC0300hj abstractC0300hjM1284b = m1284b();
        InterfaceC0001a0 interfaceC0001a0 = this.f2017u;
        AccessibilityManager accessibilityManager = this.f2016t;
        if (interfaceC0001a0 != null && accessibilityManager != null) {
            AbstractC0949z.m2783b(accessibilityManager, interfaceC0001a0);
        }
        this.f2017u = null;
        abstractC0300hjM1284b.mo607r();
        this.f2005i = i;
        Iterator it = this.f2006j.iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        m1290h(i != 0);
        AbstractC0300hj abstractC0300hjM1284b2 = m1284b();
        int iMo600d = this.f2004h.f1802c;
        if (iMo600d == 0) {
            iMo600d = abstractC0300hjM1284b2.mo600d();
        }
        Drawable drawableM1261w = iMo600d != 0 ? AbstractC0259gf.m1261w(getContext(), iMo600d) : null;
        CheckableImageButton checkableImageButton = this.f2003g;
        checkableImageButton.setImageDrawable(drawableM1261w);
        TextInputLayout textInputLayout = this.f1997a;
        if (drawableM1261w != null) {
            AbstractC0259gf.m1249g(textInputLayout, checkableImageButton, this.f2007k, this.f2008l);
            AbstractC0259gf.m1233Q(textInputLayout, checkableImageButton, this.f2007k);
        }
        int iMo599c = abstractC0300hjM1284b2.mo599c();
        CharSequence text = iMo599c != 0 ? getResources().getText(iMo599c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0300hjM1284b2.mo1399j());
        if (!abstractC0300hjM1284b2.mo1398i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC0300hjM1284b2.mo606q();
        InterfaceC0001a0 interfaceC0001a0Mo1397h = abstractC0300hjM1284b2.mo1397h();
        this.f2017u = interfaceC0001a0Mo1397h;
        if (interfaceC0001a0Mo1397h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = oa0.f3426a;
            if (aa0.m39b(this)) {
                AbstractC0949z.m2782a(accessibilityManager, this.f2017u);
            }
        }
        View.OnClickListener onClickListenerMo602f = abstractC0300hjM1284b2.mo602f();
        View.OnLongClickListener onLongClickListener = this.f2011o;
        checkableImageButton.setOnClickListener(onClickListenerMo602f);
        AbstractC0259gf.m1236T(checkableImageButton, onLongClickListener);
        EditText editText = this.f2015s;
        if (editText != null) {
            abstractC0300hjM1284b2.mo604l(editText);
            m1292j(abstractC0300hjM1284b2);
        }
        AbstractC0259gf.m1249g(textInputLayout, checkableImageButton, this.f2007k, this.f2008l);
        m1288f(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m1290h(boolean z) {
        if (m1286d() != z) {
            this.f2003g.setVisibility(z ? 0 : 8);
            m1293k();
            m1295m();
            this.f1997a.m741q();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1291i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1999c;
        checkableImageButton.setImageDrawable(drawable);
        m1294l();
        AbstractC0259gf.m1249g(this.f1997a, checkableImageButton, this.f2000d, this.f2001e);
    }

    /* JADX INFO: renamed from: j */
    public final void m1292j(AbstractC0300hj abstractC0300hj) {
        if (this.f2015s == null) {
            return;
        }
        if (abstractC0300hj.mo601e() != null) {
            this.f2015s.setOnFocusChangeListener(abstractC0300hj.mo601e());
        }
        if (abstractC0300hj.mo603g() != null) {
            this.f2003g.setOnFocusChangeListener(abstractC0300hj.mo603g());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1293k() {
        this.f1998b.setVisibility((this.f2003g.getVisibility() != 0 || m1287e()) ? 8 : 0);
        setVisibility((m1286d() || m1287e() || ((this.f2012p == null || this.f2014r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: l */
    public final void m1294l() {
        CheckableImageButton checkableImageButton = this.f1999c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1997a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1141j.f1418q && textInputLayout.m737m()) ? 0 : 8);
        m1293k();
        m1295m();
        if (this.f2005i != 0) {
            return;
        }
        textInputLayout.m741q();
    }

    /* JADX INFO: renamed from: m */
    public final void m1295m() {
        int iM2733e;
        TextInputLayout textInputLayout = this.f1997a;
        if (textInputLayout.f1129d == null) {
            return;
        }
        if (m1286d() || m1287e()) {
            iM2733e = 0;
        } else {
            EditText editText = textInputLayout.f1129d;
            WeakHashMap weakHashMap = oa0.f3426a;
            iM2733e = y90.m2733e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f1129d.getPaddingTop();
        int paddingBottom = textInputLayout.f1129d.getPaddingBottom();
        WeakHashMap weakHashMap2 = oa0.f3426a;
        y90.m2739k(this.f2013q, dimensionPixelSize, paddingTop, iM2733e, paddingBottom);
    }

    /* JADX INFO: renamed from: n */
    public final void m1296n() {
        C0249g5 c0249g5 = this.f2013q;
        int visibility = c0249g5.getVisibility();
        int i = (this.f2012p == null || this.f2014r) ? 8 : 0;
        if (visibility != i) {
            m1284b().mo605o(i == 0);
        }
        m1293k();
        c0249g5.setVisibility(i);
        this.f1997a.m741q();
    }
}
