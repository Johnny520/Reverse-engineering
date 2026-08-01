package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zo {
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public AnimatorSet l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public g5 r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public g5 y;
    public int z;

    public zo(TextInputLayout r4) {
        Context r0 = r4.getContext();
        this.g = r0;
        this.h = r4;
        this.m = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.a = ct.v(r0, R.attr.motionDurationShort4, 217);
        this.b = ct.v(r0, R.attr.motionDurationMedium4, 167);
        this.c = ct.v(r0, R.attr.motionDurationShort4, 167);
        this.d = ct.w(r0, R.attr.motionEasingEmphasizedDecelerateInterpolator, q2.d);
        LinearInterpolator r42 = q2.a;
        this.e = ct.w(r0, R.attr.motionEasingEmphasizedDecelerateInterpolator, r42);
        this.f = ct.w(r0, R.attr.motionEasingLinearInterpolator, r42);
    }

    public final void a(g5 r7, int r8) {
        if (this.i != null) goto L10;
        if (this.k != null) goto L10;
        Context r3 = this.g;
        LinearLayout r0 = new LinearLayout(r3);
        this.i = r0;
        r0.setOrientation(0);
        LinearLayout r02 = this.i;
        TextInputLayout r5 = this.h;
        r5.addView(r02, -1, -2);
        this.k = new FrameLayout(r3);
        this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (r5.getEditText() == null) goto L10;
        b();
    L10:
        if (r8 == 0) goto L14;
        if (r8 == 1) goto L14;
        this.i.addView(r7, new LinearLayout.LayoutParams(-2, -2));
    L15:
        this.i.setVisibility(0);
        this.j++;
        return;
    L14:
        this.k.setVisibility(0);
        this.k.addView(r7);
        goto L15
    }

    public final void b() {
        if (this.i == null) goto L17;
        TextInputLayout r0 = this.h;
        if (r0.getEditText() == null) goto L18;
        EditText r02 = r0.getEditText();
        Context r1 = this.g;
        boolean r2 = ct.s(r1);
        LinearLayout r3 = this.i;
        WeakHashMap r4 = ja0.a;
        int r42 = t90.f(r02);
        if (r2 == false) goto L9;
        r42 = r1.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
    L9:
        int r6 = r1.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
        if (r2 == false) goto L12;
        r6 = r1.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
    L12:
        int r03 = t90.e(r02);
        if (r2 == false) goto L15;
        r03 = r1.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
    L15:
        t90.k(r3, r42, r6, r03, 0);
        return;
    L18:
        return;
    }

    public final void c() {
        AnimatorSet r0 = this.l;
        if (r0 == null) goto L6;
        r0.cancel();
        return;
    }

    public final void d(ArrayList r8, boolean r9, g5 r10, int r11, int r12, int r13) {
        if (r10 == null) goto L32;
        if (r9 == false) goto L36;
        if (r11 == r13) goto L8;
        if (r11 == r12) goto L8;
        return;
    L8:
        if (r13 != r11) goto L10;
        boolean r1 = true;
    L12:
        if (r1 == false) goto L14;
        float r3 = 1.0f;
    L15:
        ObjectAnimator r32 = ObjectAnimator.ofFloat(r10, View.ALPHA, new float[]{r3});
        int r4 = this.c;
        if (r1 == false) goto L18;
        long r5 = this.b;
    L19:
        r32.setDuration(r5);
        if (r1 == false) goto L22;
        TimeInterpolator r14 = this.e;
    L23:
        r32.setInterpolator(r14);
        if (r11 != r13) goto L27;
        if (r12 == 0) goto L27;
        r32.setStartDelay(r4);
    L27:
        r8.add(r32);
        if (r13 != r11) goto L34;
        if (r12 == 0) goto L35;
        ObjectAnimator r92 = ObjectAnimator.ofFloat(r10, View.TRANSLATION_Y, new float[]{-this.m, 0.0f});
        r92.setDuration(this.a);
        r92.setInterpolator(this.d);
        r92.setStartDelay(r4);
        r8.add(r92);
        return;
    L35:
        return;
    L34:
        return;
    L22:
        r14 = this.f;
        goto L23
    L18:
        r5 = r4;
        goto L19
    L14:
        r3 = 0.0f;
        goto L15
    L10:
        r1 = false;
        goto L12
    L36:
        return;
    }

    public final TextView e(int r2) {
        if (r2 == 1) goto L11;
        if (r2 == 2) goto L9;
        return null;
    L9:
        return this.y;
    L11:
        return this.r;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.n == 1) goto L5;
    L10:
        i(this.n, this.o, h(this.r, ""));
        return;
    L5:
        if (this.x == true) goto L7;
    L9:
        this.o = 0;
        goto L10
    L7:
        if (TextUtils.isEmpty(this.w) == true) goto L9;
        this.o = 2;
        goto L10
    }

    public final void g(g5 r3, int r4) {
        LinearLayout r0 = this.i;
        if (r0 != null) goto L6;
        return;
    L6:
        if (r4 == 0) goto L8;
        if (r4 == 1) goto L8;
    L11:
        r0.removeView(r3);
    L12:
        int r32 = this.j - 1;
        this.j = r32;
        LinearLayout r42 = this.i;
        if (r32 != 0) goto L16;
        r42.setVisibility(8);
        return;
    L16:
        return;
    L8:
        FrameLayout r43 = this.k;
        if (r43 == null) goto L11;
        r43.removeView(r3);
        goto L12
    }

    public final boolean h(g5 r3, CharSequence r4) {
        WeakHashMap r0 = ja0.a;
        TextInputLayout r02 = this.h;
        if (v90.c(r02) == true) goto L5;
        return false;
    L5:
        if (r02.isEnabled() == true) goto L7;
        return false;
    L7:
        if (this.o != this.n) goto L11;
        if (r3 != null) goto L10;
        return true;
    L10:
        if (TextUtils.equals(r3.getText(), r4) == true) goto L18;
        return true;
    L18:
        return false;
    L11:
        return true;
    }

    public final void i(int r17, int r18, boolean r19) {
        zo r0 = this;
        if (r17 != r18) goto L6;
        return;
    L6:
        if (r19 == false) goto L11;
        AnimatorSet r9 = new AnimatorSet();
        r0.l = r9;
        ArrayList r1 = new ArrayList();
        r0.d(r1, r0.x, r0.y, 2, r17, r18);
        r0.d(r1, r0.q, r0.r, 1, r17, r18);
        int r2 = r1.size();
        long r3 = 0;
        int r5 = 0;
    L8:
        if (r5 >= r2) goto L10;
        Animator r10 = (Animator) r1.get(r5);
        r3 = Math.max(r3, r10.getDuration() + r10.getStartDelay());
        r5 = r5 + 1;
        goto L8
    L10:
        ValueAnimator r22 = ValueAnimator.ofInt(new int[]{0, 0});
        r22.setDuration(r3);
        r1.add(0, r22);
        r9.playTogether(r1);
        xo r02 = new xo(this, r18, e(r17), r17, r0.e(r18));
        r0 = this;
        r9.addListener(r02);
        r9.start();
    L24:
        TextInputLayout r12 = r0.h;
        r12.r();
        r12.u(r19, false);
        r12.x();
        return;
    L11:
        if (r17 == r18) goto L24;
        if (r18 == 0) goto L17;
        TextView r13 = r0.e(r18);
        if (r13 == null) goto L17;
        r13.setVisibility(0);
        r13.setAlpha(1.0f);
    L17:
        if (r17 == 0) goto L23;
        TextView r14 = e(r17);
        if (r14 == null) goto L23;
        r14.setVisibility(4);
        if (r17 != 1) goto L23;
        r14.setText(null);
    L23:
        r0.n = r18;
        goto L24
    }
}
