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
import android.util.Property;
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

    public C2241ml(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7901g = context;
        this.f7902h = textInputLayout;
        this.f7907m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f7895a = AbstractC0714Qj.m1473D(context, R.attr.motionDurationShort4, 217);
        this.f7896b = AbstractC0714Qj.m1473D(context, R.attr.motionDurationMedium4, 167);
        this.f7897c = AbstractC0714Qj.m1473D(context, R.attr.motionDurationShort4, 167);
        this.f7898d = AbstractC0714Qj.m1474E(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0776S2.f2456d);
        LinearInterpolator linearInterpolator = AbstractC0776S2.f2453a;
        this.f7899e = AbstractC0714Qj.m1474E(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f7900f = AbstractC0714Qj.m1474E(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m4541a(C2304o4 c2304o4, int i) {
        if (this.f7903i == null && this.f7905k == null) {
            Context context = this.f7901g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f7903i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f7903i;
            TextInputLayout textInputLayout = this.f7902h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f7905k = new FrameLayout(context);
            this.f7903i.addView(this.f7905k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m4542b();
            }
        }
        if (i == 0 || i == 1) {
            this.f7905k.setVisibility(0);
            this.f7905k.addView(c2304o4);
        } else {
            this.f7903i.addView(c2304o4, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f7903i.setVisibility(0);
        this.f7904j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m4542b() {
        if (this.f7903i != null) {
            TextInputLayout textInputLayout = this.f7902h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f7901g;
                boolean zM1650t = AbstractC0828TB.m1650t(context);
                LinearLayout linearLayout = this.f7903i;
                int paddingStart = editText.getPaddingStart();
                if (zM1650t) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM1650t) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM1650t) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4543c() {
        AnimatorSet animatorSet = this.f7906l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4544d(ArrayList arrayList, boolean z, C2304o4 c2304o4, int i, int i2, int i3) {
        if (c2304o4 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c2304o4, (Property<C2304o4, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f7897c;
            objectAnimatorOfFloat.setDuration(z2 ? this.f7896b : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f7899e : this.f7900f);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c2304o4, (Property<C2304o4, Float>) View.TRANSLATION_Y, -this.f7907m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f7895a);
            objectAnimatorOfFloat2.setInterpolator(this.f7898d);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m4545e(int i) {
        if (i == 1) {
            return this.f7912r;
        }
        if (i != 2) {
            return null;
        }
        return this.f7919y;
    }

    /* JADX INFO: renamed from: f */
    public final void m4546f() {
        this.f7910p = null;
        m4543c();
        if (this.f7908n == 1) {
            if (!this.f7918x || TextUtils.isEmpty(this.f7917w)) {
                this.f7909o = 0;
            } else {
                this.f7909o = 2;
            }
        }
        m4549i(this.f7908n, this.f7909o, m4548h(this.f7912r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m4547g(C2304o4 c2304o4, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f7903i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f7905k) != null) {
            frameLayout.removeView(c2304o4);
        } else {
            linearLayout.removeView(c2304o4);
        }
        int i2 = this.f7904j - 1;
        this.f7904j = i2;
        LinearLayout linearLayout2 = this.f7903i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4548h(C2304o4 c2304o4, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f7902h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f7909o == this.f7908n && c2304o4 != null && TextUtils.equals(c2304o4.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m4549i(int i, int i2, boolean z) {
        TextView textViewM4545e;
        TextView textViewM4545e2;
        C2241ml c2241ml = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c2241ml.f7906l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c2241ml.m4544d(arrayList, c2241ml.f7918x, c2241ml.f7919y, 2, i, i2);
            c2241ml.m4544d(arrayList, c2241ml.f7911q, c2241ml.f7912r, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            C2151kl c2151kl = new C2151kl(this, i2, m4545e(i), i, c2241ml.m4545e(i2));
            c2241ml = this;
            animatorSet.addListener(c2151kl);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM4545e2 = c2241ml.m4545e(i2)) != null) {
                textViewM4545e2.setVisibility(0);
                textViewM4545e2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM4545e = m4545e(i)) != null) {
                textViewM4545e.setVisibility(4);
                if (i == 1) {
                    textViewM4545e.setText((CharSequence) null);
                }
            }
            c2241ml.f7908n = i2;
        }
        TextInputLayout textInputLayout = c2241ml.f7902h;
        textInputLayout.m2492t();
        textInputLayout.m2495w(z, false);
        textInputLayout.m2498z();
    }
}
