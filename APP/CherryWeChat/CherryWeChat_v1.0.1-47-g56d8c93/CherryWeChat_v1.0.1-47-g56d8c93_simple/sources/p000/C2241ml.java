package p000;

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
import io.github.cherrywechat.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: ml */
/* JADX INFO: loaded from: classes.dex */
public final class C2241ml {

    /* JADX INFO: renamed from: A */
    public ColorStateList f7893A;

    /* JADX INFO: renamed from: B */
    public Typeface f7894B;

    /* JADX INFO: renamed from: a */
    public final int f7895a;

    /* JADX INFO: renamed from: b */
    public final int f7896b;

    /* JADX INFO: renamed from: c */
    public final int f7897c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f7898d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f7899e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f7900f;

    /* JADX INFO: renamed from: g */
    public final Context f7901g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f7902h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f7903i;

    /* JADX INFO: renamed from: j */
    public int f7904j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f7905k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f7906l;

    /* JADX INFO: renamed from: m */
    public final float f7907m;

    /* JADX INFO: renamed from: n */
    public int f7908n;

    /* JADX INFO: renamed from: o */
    public int f7909o;

    /* JADX INFO: renamed from: p */
    public CharSequence f7910p;

    /* JADX INFO: renamed from: q */
    public boolean f7911q;

    /* JADX INFO: renamed from: r */
    public C2304o4 f7912r;

    /* JADX INFO: renamed from: s */
    public CharSequence f7913s;

    /* JADX INFO: renamed from: t */
    public int f7914t;

    /* JADX INFO: renamed from: u */
    public int f7915u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f7916v;

    /* JADX INFO: renamed from: w */
    public CharSequence f7917w;

    /* JADX INFO: renamed from: x */
    public boolean f7918x;

    /* JADX INFO: renamed from: y */
    public C2304o4 f7919y;

    /* JADX INFO: renamed from: z */
    public int f7920z;

    public C2241ml(TextInputLayout r4) {
        Context r0 = r4.getContext();
        this.f7901g = r0;
        this.f7902h = r4;
        this.f7907m = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f7895a = AbstractC0714Qj.m1473D(r0, R.attr.motionDurationShort4, 217);
        this.f7896b = AbstractC0714Qj.m1473D(r0, R.attr.motionDurationMedium4, 167);
        this.f7897c = AbstractC0714Qj.m1473D(r0, R.attr.motionDurationShort4, 167);
        this.f7898d = AbstractC0714Qj.m1474E(r0, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0776S2.f2456d);
        LinearInterpolator r42 = AbstractC0776S2.f2453a;
        this.f7899e = AbstractC0714Qj.m1474E(r0, R.attr.motionEasingEmphasizedDecelerateInterpolator, r42);
        this.f7900f = AbstractC0714Qj.m1474E(r0, R.attr.motionEasingLinearInterpolator, r42);
    }

    /* JADX INFO: renamed from: a */
    public final void m4541a(C2304o4 r7, int r8) {
        if (this.f7903i != null) goto L10;
        if (this.f7905k != null) goto L10;
        Context r3 = this.f7901g;
        LinearLayout r0 = new LinearLayout(r3);
        this.f7903i = r0;
        r0.setOrientation(0);
        LinearLayout r02 = this.f7903i;
        TextInputLayout r5 = this.f7902h;
        r5.addView(r02, -1, -2);
        this.f7905k = new FrameLayout(r3);
        this.f7903i.addView(this.f7905k, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (r5.getEditText() == null) goto L10;
        m4542b();
    L10:
        if (r8 == 0) goto L14;
        if (r8 == 1) goto L14;
        this.f7903i.addView(r7, new LinearLayout.LayoutParams(-2, -2));
    L15:
        this.f7903i.setVisibility(0);
        this.f7904j++;
        return;
    L14:
        this.f7905k.setVisibility(0);
        this.f7905k.addView(r7);
        goto L15
    }

    /* JADX INFO: renamed from: b */
    public final void m4542b() {
        if (this.f7903i == null) goto L17;
        TextInputLayout r0 = this.f7902h;
        if (r0.getEditText() == null) goto L18;
        EditText r02 = r0.getEditText();
        Context r1 = this.f7901g;
        boolean r2 = AbstractC0828TB.m1650t(r1);
        LinearLayout r3 = this.f7903i;
        int r4 = r02.getPaddingStart();
        if (r2 == false) goto L9;
        r4 = r1.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
    L9:
        int r6 = r1.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
        if (r2 == false) goto L12;
        r6 = r1.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
    L12:
        int r03 = r02.getPaddingEnd();
        if (r2 == false) goto L15;
        r03 = r1.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
    L15:
        r3.setPaddingRelative(r4, r6, r03, 0);
        return;
    L18:
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m4543c() {
        AnimatorSet r0 = this.f7906l;
        if (r0 == null) goto L6;
        r0.cancel();
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m4544d(ArrayList r8, boolean r9, C2304o4 r10, int r11, int r12, int r13) {
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
        int r4 = this.f7897c;
        if (r1 == false) goto L18;
        long r5 = this.f7896b;
    L19:
        r32.setDuration(r5);
        if (r1 == false) goto L22;
        TimeInterpolator r14 = this.f7899e;
    L23:
        r32.setInterpolator(r14);
        if (r11 != r13) goto L27;
        if (r12 == 0) goto L27;
        r32.setStartDelay(r4);
    L27:
        r8.add(r32);
        if (r13 != r11) goto L34;
        if (r12 == 0) goto L35;
        ObjectAnimator r92 = ObjectAnimator.ofFloat(r10, View.TRANSLATION_Y, new float[]{-this.f7907m, 0.0f});
        r92.setDuration(this.f7895a);
        r92.setInterpolator(this.f7898d);
        r92.setStartDelay(r4);
        r8.add(r92);
        return;
    L35:
        return;
    L34:
        return;
    L22:
        r14 = this.f7900f;
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

    /* JADX INFO: renamed from: e */
    public final TextView m4545e(int r2) {
        if (r2 == 1) goto L11;
        if (r2 == 2) goto L9;
        return null;
    L9:
        return this.f7919y;
    L11:
        return this.f7912r;
    }

    /* JADX INFO: renamed from: f */
    public final void m4546f() {
        this.f7910p = null;
        m4543c();
        if (this.f7908n == 1) goto L5;
    L10:
        m4549i(this.f7908n, this.f7909o, m4548h(this.f7912r, ""));
        return;
    L5:
        if (this.f7918x == true) goto L7;
    L9:
        this.f7909o = 0;
        goto L10
    L7:
        if (TextUtils.isEmpty(this.f7917w) == true) goto L9;
        this.f7909o = 2;
        goto L10
    }

    /* JADX INFO: renamed from: g */
    public final void m4547g(C2304o4 r3, int r4) {
        LinearLayout r0 = this.f7903i;
        if (r0 != null) goto L6;
        return;
    L6:
        if (r4 == 0) goto L8;
        if (r4 == 1) goto L8;
    L11:
        r0.removeView(r3);
    L12:
        int r32 = this.f7904j - 1;
        this.f7904j = r32;
        LinearLayout r42 = this.f7903i;
        if (r32 != 0) goto L16;
        r42.setVisibility(8);
        return;
    L16:
        return;
    L8:
        FrameLayout r43 = this.f7905k;
        if (r43 == null) goto L11;
        r43.removeView(r3);
        goto L12
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4548h(C2304o4 r3, CharSequence r4) {
        TextInputLayout r0 = this.f7902h;
        if (r0.isLaidOut() == true) goto L5;
        return false;
    L5:
        if (r0.isEnabled() == true) goto L7;
        return false;
    L7:
        if (this.f7909o != this.f7908n) goto L11;
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

    /* JADX INFO: renamed from: i */
    public final void m4549i(int r17, int r18, boolean r19) {
        C2241ml r0 = this;
        if (r17 != r18) goto L6;
        return;
    L6:
        if (r19 == false) goto L11;
        AnimatorSet r9 = new AnimatorSet();
        r0.f7906l = r9;
        ArrayList r1 = new ArrayList();
        r0.m4544d(r1, r0.f7918x, r0.f7919y, 2, r17, r18);
        r0.m4544d(r1, r0.f7911q, r0.f7912r, 1, r17, r18);
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
        C2151kl r02 = new C2151kl(this, r18, m4545e(r17), r17, r0.m4545e(r18));
        r0 = this;
        r9.addListener(r02);
        r9.start();
    L24:
        TextInputLayout r12 = r0.f7902h;
        r12.m2492t();
        r12.m2495w(r19, false);
        r12.m2498z();
        return;
    L11:
        if (r17 == r18) goto L24;
        if (r18 == 0) goto L17;
        TextView r13 = r0.m4545e(r18);
        if (r13 == null) goto L17;
        r13.setVisibility(0);
        r13.setAlpha(1.0f);
    L17:
        if (r17 == 0) goto L23;
        TextView r14 = m4545e(r17);
        if (r14 == null) goto L23;
        r14.setVisibility(4);
        if (r17 != 1) goto L23;
        r14.setText(null);
    L23:
        r0.f7908n = r18;
        goto L24
    }
}
