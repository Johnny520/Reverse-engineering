package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public final class ej extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final dj h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final g5 q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public a0 u;
    public final bj v;

    public ej(TextInputLayout r18, r5 r19) {
        super(r18.getContext());
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new bj(this);
        cj r4 = new cj(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = r18;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout r6 = new FrameLayout(getContext());
        this.b = r6;
        r6.setVisibility(8);
        r6.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater r7 = LayoutInflater.from(getContext());
        CheckableImageButton r10 = a(this, r7, R.id.text_input_error_icon);
        this.c = r10;
        CheckableImageButton r72 = a(r6, r7, R.id.text_input_end_icon);
        this.g = r72;
        this.h = new dj(this, r19);
        CharSequence r13 = null;
        g5 r11 = new g5(getContext(), null);
        this.q = r11;
        TypedArray r12 = (TypedArray) r19.b;
        if (r12.hasValue(38) == false) goto L6;
        this.d = ct.m(getContext(), r19, 38);
    L6:
        if (r12.hasValue(39) == false) goto L9;
        this.e = gt.v(r12.getInt(39, -1), null);
    L9:
        if (r12.hasValue(37) == false) goto L11;
        i(r19.m(37));
    L11:
        r10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap r14 = ja0.a;
        s90.s(r10, 2);
        r10.setClickable(false);
        r10.setPressable(false);
        r10.setFocusable(false);
        if (r12.hasValue(53) == false) goto L14;
    L19:
        int r5 = 1;
        if (r12.hasValue(30) == false) goto L28;
        g(r12.getInt(30, 0));
        if (r12.hasValue(27) == false) goto L26;
        CharSequence r8 = r12.getText(27);
        if (r72.getContentDescription() == r8) goto L26;
        r72.setContentDescription(r8);
    L26:
        r72.setCheckable(r12.getBoolean(26, true));
    L38:
        int r82 = r12.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (r82 < 0) goto L59;
        if (r82 == this.m) goto L44;
        this.m = r82;
        r72.setMinimumWidth(r82);
        r72.setMinimumHeight(r82);
        r10.setMinimumWidth(r82);
        r10.setMinimumHeight(r82);
    L44:
        if (r12.hasValue(31) == false) goto L46;
        ImageView.ScaleType r83 = ff.l(r12.getInt(31, -1));
        this.n = r83;
        r72.setScaleType(r83);
        r10.setScaleType(r83);
    L46:
        r11.setVisibility(8);
        r11.setId(R.id.textinput_suffix_text);
        r11.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        v90.f(r11, 1);
        r11.setTextAppearance(r12.getResourceId(72, 0));
        if (r12.hasValue(73) == false) goto L49;
        r11.setTextColor(r19.l(73));
    L49:
        CharSequence r2 = r12.getText(71);
        if (TextUtils.isEmpty(r2) == true) goto L53;
        r13 = r2;
    L53:
        this.p = r13;
        r11.setText(r2);
        n();
        r6.addView(r72);
        addView(r11);
        addView(r6);
        addView(r10);
        r18.e0.add(r4);
        if (r18.d == null) goto L56;
        r4.a(r18);
    L56:
        addOnAttachStateChangeListener(new q8(r5, this));
        return;
    L59:
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    L28:
        if (r12.hasValue(53) == false) goto L38;
        if (r12.hasValue(54) == false) goto L33;
        this.k = ct.m(getContext(), r19, 54);
    L33:
        if (r12.hasValue(55) == false) goto L35;
        this.l = gt.v(r12.getInt(55, -1), null);
    L35:
        g(r12.getBoolean(53, false) ? 1 : 0);
        CharSequence r84 = r12.getText(51);
        if (r72.getContentDescription() == r84) goto L38;
        r72.setContentDescription(r84);
        goto L38
    L14:
        if (r12.hasValue(32) == false) goto L17;
        this.k = ct.m(getContext(), r19, 32);
    L17:
        if (r12.hasValue(33) == false) goto L19;
        this.l = gt.v(r12.getInt(33, -1), null);
        goto L19
    }

    public final CheckableImageButton a(ViewGroup r3, LayoutInflater r4, int r5) {
        CheckableImageButton r32 = (CheckableImageButton) r4.inflate(R.layout.design_text_input_end_icon, r3, false);
        r32.setId(r5);
        if (ct.s(getContext()) == false) goto L5;
        et.h((ViewGroup.MarginLayoutParams) r32.getLayoutParams(), 0);
    L5:
        return r32;
    }

    public final fj b() {
        int r0 = this.i;
        dj r1 = this.h;
        SparseArray r2 = r1.a;
        fj r3 = (fj) r2.get(r0);
        if (r3 != null) goto L22;
        ej r32 = r1.b;
        if (r0 == (-1)) goto L19;
        if (r0 != 0) goto L8;
        fj r12 = new ye(r32, 1);
    L20:
        r2.append(r0, r12);
        return r12;
    L8:
        if (r0 != 1) goto L10;
        r12 = new mx(r32, r1.d);
        goto L20
    L10:
        if (r0 != 2) goto L12;
        r12 = new ua(r32);
        goto L20
    L12:
        if (r0 != 3) goto L15;
        r12 = new ph(r32);
        goto L20
    L15:
        throw new IllegalArgumentException("Invalid end icon mode: " + r0);
    L19:
        r12 = new ye(r32, 0);
        goto L20
    L22:
        return r3;
    }

    public final int c() {
        if (d() == false) goto L5;
    L8:
        CheckableImageButton r0 = this.g;
        int r1 = r0.getMeasuredWidth();
        int r02 = et.c((ViewGroup.MarginLayoutParams) r0.getLayoutParams()) + r1;
    L9:
        WeakHashMap r12 = ja0.a;
        int r13 = t90.e(this);
        return (t90.e(this.q) + r13) + r02;
    L5:
        if (e() == true) goto L8;
        r02 = 0;
        goto L9
    }

    public final boolean d() {
        if (this.b.getVisibility() == 0) goto L5;
        return false;
    L5:
        if (this.g.getVisibility() != 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean e() {
        if (this.c.getVisibility() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void f(boolean r6) {
        fj r0 = b();
        boolean r1 = r0.j();
        CheckableImageButton r2 = this.g;
        boolean r3 = true;
        if (r1 == false) goto L7;
        boolean r12 = r2.d;
        if (r12 == r0.k()) goto L7;
        r2.setChecked(!r12);
        boolean r13 = true;
    L9:
        if ((r0 instanceof ph) == false) goto L13;
        boolean r4 = r2.isActivated();
        if (r4 == ((ph) r0).l) goto L13;
        r2.setActivated(!r4);
    L14:
        if (r6 == true) goto L18;
        if (r3 == true) goto L18;
        return;
    L18:
        ff.K(this.a, r2, this.k);
        return;
    L13:
        r3 = r13;
    L7:
        r13 = false;
        goto L9
    }

    public final void g(int r9) {
        if (this.i != r9) goto L5;
        return;
    L5:
        fj r0 = b();
        a0 r1 = this.u;
        AccessibilityManager r2 = this.t;
        if (r1 == null) goto L9;
        if (r2 == null) goto L9;
        z.b(r2, r1);
    L9:
        CharSequence r12 = null;
        this.u = null;
        r0.r();
        this.i = r9;
        Iterator r02 = this.j.iterator();
        if (r02.hasNext() == true) goto L46;
        if (r9 == 0) goto L14;
        boolean r3 = true;
    L15:
        h(r3);
        fj r32 = b();
        int r4 = this.h.c;
        if (r4 != 0) goto L18;
        r4 = r32.d();
    L18:
        if (r4 == 0) goto L20;
        Drawable r42 = ff.r(getContext(), r4);
    L21:
        CheckableImageButton r5 = this.g;
        r5.setImageDrawable(r42);
        TextInputLayout r6 = this.a;
        if (r42 == null) goto L24;
        ff.a(r6, r5, this.k, this.l);
        ff.K(r6, r5, this.k);
    L24:
        int r43 = r32.c();
        if (r43 == 0) goto L28;
        r12 = getResources().getText(r43);
    L28:
        if (r5.getContentDescription() == r12) goto L30;
        r5.setContentDescription(r12);
    L30:
        r5.setCheckable(r32.j());
        if (r32.i(r6.getBoxBackgroundMode()) == false) goto L44;
        r32.q();
        a0 r92 = r32.h();
        this.u = r92;
        if (r92 == null) goto L38;
        if (r2 == null) goto L38;
        WeakHashMap r93 = ja0.a;
        if (v90.b(this) == false) goto L38;
        z.a(r2, this.u);
    L38:
        View.OnClickListener r94 = r32.f();
        View.OnLongClickListener r13 = this.o;
        r5.setOnClickListener(r94);
        ff.M(r5, r13);
        EditText r95 = this.s;
        if (r95 == null) goto L41;
        r32.l(r95);
        j(r32);
    L41:
        ff.a(r6, r5, this.k, this.l);
        f(true);
        return;
    L44:
        throw new IllegalStateException("The current box background mode " + r6.getBoxBackgroundMode() + " is not supported by the end icon mode " + r9);
    L20:
        r42 = null;
        goto L21
    L14:
        r3 = false;
        goto L15
    L46:
        throw z30.h(r02);
    }

    public final void h(boolean r2) {
        if (d() == r2) goto L9;
        if (r2 == false) goto L6;
        int r22 = 0;
    L7:
        this.g.setVisibility(r22);
        k();
        m();
        this.a.q();
        return;
    L6:
        r22 = 8;
        goto L7
    }

    public final void i(Drawable r4) {
        CheckableImageButton r0 = this.c;
        r0.setImageDrawable(r4);
        l();
        ColorStateList r42 = this.d;
        PorterDuff.Mode r1 = this.e;
        ff.a(this.a, r0, r42, r1);
    }

    public final void j(fj r3) {
        if (this.s != null) goto L6;
        return;
    L6:
        if (r3.e() == null) goto L9;
        this.s.setOnFocusChangeListener(r3.e());
    L9:
        if (r3.g() == null) goto L12;
        this.g.setOnFocusChangeListener(r3.g());
        return;
    }

    public final void k() {
        int r1 = 8;
        if (this.g.getVisibility() == 0) goto L5;
    L7:
        int r0 = 8;
    L8:
        this.b.setVisibility(r0);
        if (this.p != null) goto L11;
    L13:
        char r02 = '\b';
    L15:
        if (d() == false) goto L17;
    L19:
        r1 = 0;
    L20:
        setVisibility(r1);
        return;
    L17:
        if (e() == true) goto L19;
        if (r02 != 0) goto L20;
    L11:
        if (this.r == true) goto L13;
        r02 = 0;
        goto L15
    L5:
        if (e() == true) goto L7;
        r0 = 0;
        goto L8
    }

    public final void l() {
        CheckableImageButton r0 = this.c;
        Drawable r1 = r0.getDrawable();
        TextInputLayout r2 = this.a;
        if (r1 != null) goto L5;
    L9:
        int r12 = 8;
    L10:
        r0.setVisibility(r12);
        k();
        m();
        if (this.i == 0) goto L13;
        return;
    L13:
        r2.q();
        return;
    L5:
        if (r2.j.q == false) goto L9;
        if (r2.m() == false) goto L9;
        r12 = 0;
        goto L10
    }

    public final void m() {
        TextInputLayout r0 = this.a;
        if (r0.d != null) goto L6;
        return;
    L6:
        if (d() == false) goto L8;
    L11:
        int r1 = 0;
    L12:
        int r2 = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int r3 = r0.d.getPaddingTop();
        int r02 = r0.d.getPaddingBottom();
        WeakHashMap r4 = ja0.a;
        t90.k(this.q, r2, r3, r1, r02);
        return;
    L8:
        if (e() == true) goto L11;
        EditText r12 = r0.d;
        WeakHashMap r22 = ja0.a;
        r1 = t90.e(r12);
        goto L12
    }

    public final void n() {
        g5 r0 = this.q;
        int r1 = r0.getVisibility();
        boolean r3 = false;
        if (this.p != null) goto L5;
    L7:
        int r2 = 8;
    L8:
        if (r1 == r2) goto L13;
        fj r12 = b();
        if (r2 != 0) goto L12;
        r3 = true;
    L12:
        r12.o(r3);
    L13:
        k();
        r0.setVisibility(r2);
        this.a.q();
        return;
    L5:
        if (this.r == true) goto L7;
        r2 = 0;
        goto L8
    }
}
