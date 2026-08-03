package p001A0;

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
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p056f0.AbstractC0805P;
import p057g.C0868K;
import p060h0.AbstractC0945a;

/* JADX INFO: renamed from: A0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0049y {

    /* JADX INFO: renamed from: A */
    public ColorStateList f149A;

    /* JADX INFO: renamed from: B */
    public Typeface f150B;

    /* JADX INFO: renamed from: a */
    public final int f151a;

    /* JADX INFO: renamed from: b */
    public final int f152b;

    /* JADX INFO: renamed from: c */
    public final int f153c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f154d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f155e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f156f;

    /* JADX INFO: renamed from: g */
    public final Context f157g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f158h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f159i;

    /* JADX INFO: renamed from: j */
    public int f160j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f161k;

    /* JADX INFO: renamed from: l */
    public Animator f162l;

    /* JADX INFO: renamed from: m */
    public final float f163m;

    /* JADX INFO: renamed from: n */
    public int f164n;

    /* JADX INFO: renamed from: o */
    public int f165o;

    /* JADX INFO: renamed from: p */
    public CharSequence f166p;

    /* JADX INFO: renamed from: q */
    public boolean f167q;

    /* JADX INFO: renamed from: r */
    public C0868K f168r;

    /* JADX INFO: renamed from: s */
    public CharSequence f169s;

    /* JADX INFO: renamed from: t */
    public int f170t;

    /* JADX INFO: renamed from: u */
    public int f171u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f172v;

    /* JADX INFO: renamed from: w */
    public CharSequence f173w;

    /* JADX INFO: renamed from: x */
    public boolean f174x;

    /* JADX INFO: renamed from: y */
    public C0868K f175y;

    /* JADX INFO: renamed from: z */
    public int f176z;

    public C0049y(TextInputLayout r4) {
        Context r02 = r4.getContext();
        this.f157g = r02;
        this.f158h = r4;
        this.f163m = r02.getResources().getDimensionPixelSize(C1031R.dimen.design_textinput_caption_translate_y);
        this.f151a = AbstractC0805P.m2038R(r02, C1031R.attr.motionDurationShort4, 217);
        this.f152b = AbstractC0805P.m2038R(r02, C1031R.attr.motionDurationMedium4, 167);
        this.f153c = AbstractC0805P.m2038R(r02, C1031R.attr.motionDurationShort4, 167);
        this.f154d = AbstractC0805P.m2039S(r02, C1031R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0945a.f3357d);
        LinearInterpolator r42 = AbstractC0945a.f3354a;
        this.f155e = AbstractC0805P.m2039S(r02, C1031R.attr.motionEasingEmphasizedDecelerateInterpolator, r42);
        this.f156f = AbstractC0805P.m2039S(r02, C1031R.attr.motionEasingLinearInterpolator, r42);
    }

    /* JADX INFO: renamed from: a */
    public final void m157a(TextView r7, int r8) {
        if (this.f159i != null) goto L10;
        if (this.f161k != null) goto L10;
        Context r3 = this.f157g;
        LinearLayout r02 = new LinearLayout(r3);
        this.f159i = r02;
        r02.setOrientation(0);
        LinearLayout r03 = this.f159i;
        TextInputLayout r4 = this.f158h;
        r4.addView(r03, -1, -2);
        this.f161k = new FrameLayout(r3);
        this.f159i.addView(this.f161k, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (r4.getEditText() == null) goto L10;
        m158b();
    L10:
        if (r8 == 0) goto L14;
        if (r8 == 1) goto L14;
        this.f159i.addView(r7, new LinearLayout.LayoutParams(-2, -2));
    L15:
        this.f159i.setVisibility(0);
        this.f160j++;
        return;
    L14:
        this.f161k.setVisibility(0);
        this.f161k.addView(r7);
        goto L15
    }

    /* JADX INFO: renamed from: b */
    public final void m158b() {
        if (this.f159i == null) goto L17;
        TextInputLayout r02 = this.f158h;
        if (r02.getEditText() == null) goto L18;
        EditText r03 = r02.getEditText();
        Context r1 = this.f157g;
        boolean r2 = AbstractC0805P.m2031E(r1);
        LinearLayout r3 = this.f159i;
        Field r4 = AbstractC0080Q.f219a;
        int r42 = r03.getPaddingStart();
        if (r2 == false) goto L9;
        r42 = r1.getResources().getDimensionPixelSize(C1031R.dimen.material_helper_text_font_1_3_padding_horizontal);
    L9:
        int r6 = r1.getResources().getDimensionPixelSize(C1031R.dimen.material_helper_text_default_padding_top);
        if (r2 == false) goto L12;
        r6 = r1.getResources().getDimensionPixelSize(C1031R.dimen.material_helper_text_font_1_3_padding_top);
    L12:
        int r04 = r03.getPaddingEnd();
        if (r2 == false) goto L15;
        r04 = r1.getResources().getDimensionPixelSize(C1031R.dimen.material_helper_text_font_1_3_padding_horizontal);
    L15:
        r3.setPaddingRelative(r42, r6, r04, 0);
        return;
    L18:
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m159c() {
        Animator r02 = this.f162l;
        if (r02 == null) goto L6;
        r02.cancel();
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m160d(ArrayList r8, boolean r9, TextView r10, int r11, int r12, int r13) {
        if (r10 == null) goto L32;
        if (r9 == false) goto L36;
        if (r11 == r13) goto L8;
        if (r11 == r12) goto L8;
        return;
    L8:
        if (r13 != r11) goto L10;
        boolean r92 = true;
    L12:
        if (r92 == false) goto L14;
        float r3 = 1.0f;
    L15:
        ObjectAnimator r32 = ObjectAnimator.ofFloat(r10, View.ALPHA, new float[]{r3});
        int r4 = this.f153c;
        if (r92 == false) goto L18;
        long r5 = this.f152b;
    L19:
        r32.setDuration(r5);
        if (r92 == false) goto L22;
        TimeInterpolator r93 = this.f155e;
    L23:
        r32.setInterpolator(r93);
        if (r11 != r13) goto L27;
        if (r12 == 0) goto L27;
        r32.setStartDelay(r4);
    L27:
        r8.add(r32);
        if (r13 != r11) goto L34;
        if (r12 == 0) goto L35;
        ObjectAnimator r94 = ObjectAnimator.ofFloat(r10, View.TRANSLATION_Y, new float[]{-this.f163m, 0.0f});
        r94.setDuration(this.f151a);
        r94.setInterpolator(this.f154d);
        r94.setStartDelay(r4);
        r8.add(r94);
        return;
    L35:
        return;
    L34:
        return;
    L22:
        r93 = this.f156f;
        goto L23
    L18:
        r5 = r4;
        goto L19
    L14:
        r3 = 0.0f;
        goto L15
    L10:
        r92 = false;
        goto L12
    L36:
        return;
    }

    /* JADX INFO: renamed from: e */
    public final TextView m161e(int r2) {
        if (r2 == 1) goto L11;
        if (r2 == 2) goto L9;
        return null;
    L9:
        return this.f175y;
    L11:
        return this.f168r;
    }

    /* JADX INFO: renamed from: f */
    public final void m162f() {
        this.f166p = null;
        m159c();
        if (this.f164n == 1) goto L5;
    L10:
        m165i(this.f164n, this.f165o, m164h(this.f168r, ""));
        return;
    L5:
        if (this.f174x == true) goto L7;
    L9:
        this.f165o = 0;
        goto L10
    L7:
        if (TextUtils.isEmpty(this.f173w) == true) goto L9;
        this.f165o = 2;
        goto L10
    }

    /* JADX INFO: renamed from: g */
    public final void m163g(TextView r3, int r4) {
        LinearLayout r02 = this.f159i;
        if (r02 != null) goto L6;
        return;
    L6:
        if (r4 == 0) goto L8;
        if (r4 == 1) goto L8;
    L11:
        r02.removeView(r3);
    L12:
        int r32 = this.f160j - 1;
        this.f160j = r32;
        LinearLayout r42 = this.f159i;
        if (r32 != 0) goto L16;
        r42.setVisibility(8);
        return;
    L16:
        return;
    L8:
        FrameLayout r43 = this.f161k;
        if (r43 == null) goto L11;
        r43.removeView(r3);
        goto L12
    }

    /* JADX INFO: renamed from: h */
    public final boolean m164h(TextView r3, CharSequence r4) {
        Field r02 = AbstractC0080Q.f219a;
        TextInputLayout r03 = this.f158h;
        if (r03.isLaidOut() == true) goto L5;
    L12:
        return false;
    L5:
        if (r03.isEnabled() == false) goto L12;
        if (this.f165o != this.f164n) goto L11;
        if (r3 == null) goto L11;
        if (TextUtils.equals(r3.getText(), r4) == true) goto L12;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m165i(int r17, int r18, boolean r19) {
        if (r17 != r18) goto L6;
        return;
    L6:
        if (r19 == false) goto L11;
        AnimatorSet r12 = new AnimatorSet();
        this.f162l = r12;
        ArrayList r13 = new ArrayList();
        m160d(r13, this.f174x, this.f175y, 2, r17, r18);
        m160d(r13, this.f167q, this.f168r, 1, r17, r18);
        int r02 = r13.size();
        long r1 = 0;
        int r4 = 0;
    L8:
        if (r4 >= r02) goto L10;
        Animator r5 = (Animator) r13.get(r4);
        r1 = Math.max(r1, r5.getDuration() + r5.getStartDelay());
        r4 = r4 + 1;
        goto L8
    L10:
        ValueAnimator r03 = ValueAnimator.ofInt(new int[]{0, 0});
        r03.setDuration(r1);
        r13.add(0, r03);
        r12.playTogether(r13);
        r12.addListener(new C0047w(this, r18, m161e(r17), r17, m161e(r18)));
        r12.start();
    L24:
        TextInputLayout r04 = this.f158h;
        r04.m1904r();
        r04.m1907u(r19, false);
        r04.m1910x();
        return;
    L11:
        if (r17 == r18) goto L24;
        if (r18 == 0) goto L17;
        TextView r05 = m161e(r18);
        if (r05 == null) goto L17;
        r05.setVisibility(0);
        r05.setAlpha(1.0f);
    L17:
        if (r17 == 0) goto L23;
        TextView r06 = m161e(r17);
        if (r06 == null) goto L23;
        r06.setVisibility(4);
        if (r17 != 1) goto L23;
        r06.setText(null);
    L23:
        this.f164n = r18;
        goto L24
    }
}
