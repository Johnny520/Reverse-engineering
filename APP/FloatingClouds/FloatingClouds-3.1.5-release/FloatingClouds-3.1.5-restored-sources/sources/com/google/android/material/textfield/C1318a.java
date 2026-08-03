package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
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
import com.google.android.material.C1247R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000a.AbstractC0514c6;
import p000a.AccessibilityManagerTouchExplorationStateChangeListenerC0056D;
import p000a.C0061D4;
import p000a.C0080E5;
import p000a.C0098F5;
import p000a.C0181Jg;
import p000a.C0227M8;
import p000a.C0248Nb;
import p000a.C0324Rg;
import p000a.C0336Sa;
import p000a.C0504bf;
import p000a.C0682l3;
import p000a.C0751of;
import p000a.C0786qc;
import p000a.C0794r1;
import p000a.C0866ug;
import p000a.C0889w1;
import p000a.C0944z;

/* JADX INFO: renamed from: com.google.android.material.textfield.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C1318a extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f5964a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f5965b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f5966c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f5967d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f5968e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f5969f;

    /* JADX INFO: renamed from: g */
    public final CheckableImageButton f5970g;

    /* JADX INFO: renamed from: h */
    public final d f5971h;

    /* JADX INFO: renamed from: i */
    public int f5972i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet<TextInputLayout.InterfaceC1316g> f5973j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f5974k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f5975l;

    /* JADX INFO: renamed from: m */
    public int f5976m;

    /* JADX INFO: renamed from: n */
    public ImageView.ScaleType f5977n;

    /* JADX INFO: renamed from: o */
    public View.OnLongClickListener f5978o;

    /* JADX INFO: renamed from: p */
    public CharSequence f5979p;

    /* JADX INFO: renamed from: q */
    public final C0794r1 f5980q;

    /* JADX INFO: renamed from: r */
    public boolean f5981r;

    /* JADX INFO: renamed from: s */
    public EditText f5982s;

    /* JADX INFO: renamed from: t */
    public final AccessibilityManager f5983t;

    /* JADX INFO: renamed from: u */
    public C0080E5 f5984u;

    /* JADX INFO: renamed from: v */
    public final a f5985v;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a */
    public class a extends C0504bf {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            C1318a.this.m3283b().mo261a();
        }

        @Override // p000a.C0504bf, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C1318a.this.m3283b().mo1265b();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$b */
    public class b implements TextInputLayout.InterfaceC1315f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1315f
        /* JADX INFO: renamed from: a */
        public final void mo3280a(TextInputLayout textInputLayout) {
            C1318a c1318a = C1318a.this;
            if (c1318a.f5982s == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = c1318a.f5982s;
            a aVar = c1318a.f5985v;
            if (editText != null) {
                editText.removeTextChangedListener(aVar);
                if (c1318a.f5982s.getOnFocusChangeListener() == c1318a.m3283b().mo264e()) {
                    c1318a.f5982s.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            c1318a.f5982s = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(aVar);
            }
            c1318a.m3283b().mo270m(c1318a.f5982s);
            c1318a.m3291j(c1318a.m3283b());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$c */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            C1318a c1318a = C1318a.this;
            if (c1318a.f5984u == null || (accessibilityManager = c1318a.f5983t) == null) {
                return;
            }
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            if (c1318a.isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0056D(c1318a.f5984u));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            C1318a c1318a = C1318a.this;
            C0080E5 c0080e5 = c1318a.f5984u;
            if (c0080e5 == null || (accessibilityManager = c1318a.f5983t) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0056D(c0080e5));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final SparseArray<AbstractC0514c6> f5989a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public final C1318a f5990b;

        /* JADX INFO: renamed from: c */
        public final int f5991c;

        /* JADX INFO: renamed from: d */
        public final int f5992d;

        public d(C1318a c1318a, C0751of c0751of) {
            this.f5990b = c1318a;
            int i = C1247R.styleable.TextInputLayout_endIconDrawable;
            TypedArray typedArray = c0751of.f2960b;
            this.f5991c = typedArray.getResourceId(i, 0);
            this.f5992d = typedArray.getResourceId(C1247R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }
    }

    public C1318a(TextInputLayout textInputLayout, C0751of c0751of) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f5972i = 0;
        this.f5973j = new LinkedHashSet<>();
        this.f5985v = new a();
        b bVar = new b();
        this.f5983t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f5964a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f5965b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM3282a = m3282a(this, layoutInflaterFrom, C1247R.id.text_input_error_icon);
        this.f5966c = checkableImageButtonM3282a;
        CheckableImageButton checkableImageButtonM3282a2 = m3282a(frameLayout, layoutInflaterFrom, C1247R.id.text_input_end_icon);
        this.f5970g = checkableImageButtonM3282a2;
        this.f5971h = new d(this, c0751of);
        C0794r1 c0794r1 = new C0794r1(getContext(), null);
        this.f5980q = c0794r1;
        int i = C1247R.styleable.TextInputLayout_errorIconTint;
        TypedArray typedArray = c0751of.f2960b;
        if (typedArray.hasValue(i)) {
            this.f5967d = C0336Sa.m924a(getContext(), c0751of, C1247R.styleable.TextInputLayout_errorIconTint);
        }
        if (typedArray.hasValue(C1247R.styleable.TextInputLayout_errorIconTintMode)) {
            this.f5968e = C0324Rg.m896b(typedArray.getInt(C1247R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray.hasValue(C1247R.styleable.TextInputLayout_errorIconDrawable)) {
            m3290i(c0751of.m1770b(C1247R.styleable.TextInputLayout_errorIconDrawable));
        }
        checkableImageButtonM3282a.setContentDescription(getResources().getText(C1247R.string.error_icon_content_description));
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        checkableImageButtonM3282a.setImportantForAccessibility(2);
        checkableImageButtonM3282a.setClickable(false);
        checkableImageButtonM3282a.setPressable(false);
        checkableImageButtonM3282a.setFocusable(false);
        if (!typedArray.hasValue(C1247R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(C1247R.styleable.TextInputLayout_endIconTint)) {
                this.f5974k = C0336Sa.m924a(getContext(), c0751of, C1247R.styleable.TextInputLayout_endIconTint);
            }
            if (typedArray.hasValue(C1247R.styleable.TextInputLayout_endIconTintMode)) {
                this.f5975l = C0324Rg.m896b(typedArray.getInt(C1247R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray.hasValue(C1247R.styleable.TextInputLayout_endIconMode)) {
            m3288g(typedArray.getInt(C1247R.styleable.TextInputLayout_endIconMode, 0));
            if (typedArray.hasValue(C1247R.styleable.TextInputLayout_endIconContentDescription) && checkableImageButtonM3282a2.getContentDescription() != (text = typedArray.getText(C1247R.styleable.TextInputLayout_endIconContentDescription))) {
                checkableImageButtonM3282a2.setContentDescription(text);
            }
            checkableImageButtonM3282a2.setCheckable(typedArray.getBoolean(C1247R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (typedArray.hasValue(C1247R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(C1247R.styleable.TextInputLayout_passwordToggleTint)) {
                this.f5974k = C0336Sa.m924a(getContext(), c0751of, C1247R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (typedArray.hasValue(C1247R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.f5975l = C0324Rg.m896b(typedArray.getInt(C1247R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            m3288g(typedArray.getBoolean(C1247R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(C1247R.styleable.TextInputLayout_passwordToggleContentDescription);
            if (checkableImageButtonM3282a2.getContentDescription() != text2) {
                checkableImageButtonM3282a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C1247R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(C1247R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f5976m) {
            this.f5976m = dimensionPixelSize;
            checkableImageButtonM3282a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM3282a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM3282a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM3282a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(C1247R.styleable.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType scaleTypeM618b = C0227M8.m618b(typedArray.getInt(C1247R.styleable.TextInputLayout_endIconScaleType, -1));
            this.f5977n = scaleTypeM618b;
            checkableImageButtonM3282a2.setScaleType(scaleTypeM618b);
            checkableImageButtonM3282a.setScaleType(scaleTypeM618b);
        }
        c0794r1.setVisibility(8);
        c0794r1.setId(C1247R.id.textinput_suffix_text);
        c0794r1.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0794r1.setAccessibilityLiveRegion(1);
        c0794r1.setTextAppearance(typedArray.getResourceId(C1247R.styleable.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray.hasValue(C1247R.styleable.TextInputLayout_suffixTextColor)) {
            c0794r1.setTextColor(c0751of.m1769a(C1247R.styleable.TextInputLayout_suffixTextColor));
        }
        CharSequence text3 = typedArray.getText(C1247R.styleable.TextInputLayout_suffixText);
        this.f5979p = TextUtils.isEmpty(text3) ? null : text3;
        c0794r1.setText(text3);
        m3295n();
        frameLayout.addView(checkableImageButtonM3282a2);
        addView(c0794r1);
        addView(frameLayout);
        addView(checkableImageButtonM3282a);
        textInputLayout.f5913e0.add(bVar);
        if (textInputLayout.f5910d != null) {
            bVar.mo3280a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m3282a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C1247R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (C0336Sa.m927d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0514c6 m3283b() {
        AbstractC0514c6 c0061d4;
        int i = this.f5972i;
        d dVar = this.f5971h;
        SparseArray<AbstractC0514c6> sparseArray = dVar.f5989a;
        AbstractC0514c6 abstractC0514c6 = sparseArray.get(i);
        if (abstractC0514c6 != null) {
            return abstractC0514c6;
        }
        C1318a c1318a = dVar.f5990b;
        if (i == -1) {
            c0061d4 = new C0061D4(c1318a);
        } else if (i == 0) {
            c0061d4 = new C0248Nb(c1318a);
        } else if (i == 1) {
            c0061d4 = new C0786qc(c1318a, dVar.f5992d);
        } else if (i == 2) {
            c0061d4 = new C0682l3(c1318a);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C0944z.m2225e("Invalid end icon mode: ", i));
            }
            c0061d4 = new C0098F5(c1318a);
        }
        sparseArray.append(i, c0061d4);
        return c0061d4;
    }

    /* JADX INFO: renamed from: c */
    public final int m3284c() {
        int marginStart;
        if (m3285d() || m3286e()) {
            CheckableImageButton checkableImageButton = this.f5970g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        return this.f5980q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3285d() {
        return this.f5965b.getVisibility() == 0 && this.f5970g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3286e() {
        return this.f5966c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m3287f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC0514c6 abstractC0514c6M3283b = m3283b();
        boolean zMo1267k = abstractC0514c6M3283b.mo1267k();
        CheckableImageButton checkableImageButton = this.f5970g;
        boolean z4 = true;
        if (!zMo1267k || (z3 = checkableImageButton.f5799d) == abstractC0514c6M3283b.mo269l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC0514c6M3283b instanceof C0098F5) || (zIsActivated = checkableImageButton.isActivated()) == abstractC0514c6M3283b.mo268j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            C0227M8.m619c(this.f5964a, checkableImageButton, this.f5974k);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3288g(int i) {
        if (this.f5972i == i) {
            return;
        }
        AbstractC0514c6 abstractC0514c6M3283b = m3283b();
        C0080E5 c0080e5 = this.f5984u;
        AccessibilityManager accessibilityManager = this.f5983t;
        if (c0080e5 != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0056D(c0080e5));
        }
        this.f5984u = null;
        abstractC0514c6M3283b.mo273s();
        this.f5972i = i;
        Iterator<TextInputLayout.InterfaceC1316g> it = this.f5973j.iterator();
        while (it.hasNext()) {
            it.next().m3281a();
        }
        m3289h(i != 0);
        AbstractC0514c6 abstractC0514c6M3283b2 = m3283b();
        int iMo263d = this.f5971h.f5991c;
        if (iMo263d == 0) {
            iMo263d = abstractC0514c6M3283b2.mo263d();
        }
        Drawable drawableM2115A = iMo263d != 0 ? C0889w1.m2115A(getContext(), iMo263d) : null;
        CheckableImageButton checkableImageButton = this.f5970g;
        checkableImageButton.setImageDrawable(drawableM2115A);
        TextInputLayout textInputLayout = this.f5964a;
        if (drawableM2115A != null) {
            C0227M8.m617a(textInputLayout, checkableImageButton, this.f5974k, this.f5975l);
            C0227M8.m619c(textInputLayout, checkableImageButton, this.f5974k);
        }
        int iMo262c = abstractC0514c6M3283b2.mo262c();
        CharSequence text = iMo262c != 0 ? getResources().getText(iMo262c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0514c6M3283b2.mo1267k());
        if (!abstractC0514c6M3283b2.mo267i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC0514c6M3283b2.mo155r();
        C0080E5 c0080e5Mo266h = abstractC0514c6M3283b2.mo266h();
        this.f5984u = c0080e5Mo266h;
        if (c0080e5Mo266h != null && accessibilityManager != null) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0056D(this.f5984u));
            }
        }
        View.OnClickListener onClickListenerMo265f = abstractC0514c6M3283b2.mo265f();
        View.OnLongClickListener onLongClickListener = this.f5978o;
        checkableImageButton.setOnClickListener(onClickListenerMo265f);
        C0227M8.m620d(checkableImageButton, onLongClickListener);
        EditText editText = this.f5982s;
        if (editText != null) {
            abstractC0514c6M3283b2.mo270m(editText);
            m3291j(abstractC0514c6M3283b2);
        }
        C0227M8.m617a(textInputLayout, checkableImageButton, this.f5974k, this.f5975l);
        m3287f(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m3289h(boolean z) {
        if (m3285d() != z) {
            this.f5970g.setVisibility(z ? 0 : 8);
            m3292k();
            m3294m();
            this.f5964a.m3272q();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3290i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f5966c;
        checkableImageButton.setImageDrawable(drawable);
        m3293l();
        C0227M8.m617a(this.f5964a, checkableImageButton, this.f5967d, this.f5968e);
    }

    /* JADX INFO: renamed from: j */
    public final void m3291j(AbstractC0514c6 abstractC0514c6) {
        if (this.f5982s == null) {
            return;
        }
        if (abstractC0514c6.mo264e() != null) {
            this.f5982s.setOnFocusChangeListener(abstractC0514c6.mo264e());
        }
        if (abstractC0514c6.mo1266g() != null) {
            this.f5970g.setOnFocusChangeListener(abstractC0514c6.mo1266g());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3292k() {
        this.f5965b.setVisibility((this.f5970g.getVisibility() != 0 || m3286e()) ? 8 : 0);
        setVisibility((m3285d() || m3286e() || ((this.f5979p == null || this.f5981r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: l */
    public final void m3293l() {
        CheckableImageButton checkableImageButton = this.f5966c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f5964a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f5922j.f1272q && textInputLayout.m3268m()) ? 0 : 8);
        m3292k();
        m3294m();
        if (this.f5972i != 0) {
            return;
        }
        textInputLayout.m3272q();
    }

    /* JADX INFO: renamed from: m */
    public final void m3294m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f5964a;
        if (textInputLayout.f5910d == null) {
            return;
        }
        if (m3285d() || m3286e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f5910d;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C1247R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f5910d.getPaddingTop();
        int paddingBottom = textInputLayout.f5910d.getPaddingBottom();
        WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
        this.f5980q.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: renamed from: n */
    public final void m3295n() {
        C0794r1 c0794r1 = this.f5980q;
        int visibility = c0794r1.getVisibility();
        int i = (this.f5979p == null || this.f5981r) ? 8 : 0;
        if (visibility != i) {
            m3283b().mo1268p(i == 0);
        }
        m3292k();
        c0794r1.setVisibility(i);
        this.f5964a.m3272q();
    }
}
