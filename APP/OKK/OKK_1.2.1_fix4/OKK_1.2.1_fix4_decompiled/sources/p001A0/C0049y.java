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
import android.util.Property;
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

    public C0049y(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f157g = context;
        this.f158h = textInputLayout;
        this.f163m = context.getResources().getDimensionPixelSize(C1031R.dimen.design_textinput_caption_translate_y);
        this.f151a = AbstractC0805P.m2038R(context, C1031R.attr.motionDurationShort4, 217);
        this.f152b = AbstractC0805P.m2038R(context, C1031R.attr.motionDurationMedium4, 167);
        this.f153c = AbstractC0805P.m2038R(context, C1031R.attr.motionDurationShort4, 167);
        this.f154d = AbstractC0805P.m2039S(context, C1031R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0945a.f3357d);
        LinearInterpolator linearInterpolator = AbstractC0945a.f3354a;
        this.f155e = AbstractC0805P.m2039S(context, C1031R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f156f = AbstractC0805P.m2039S(context, C1031R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m157a(TextView textView, int i2) {
        if (this.f159i == null && this.f161k == null) {
            Context context = this.f157g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f159i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f159i;
            TextInputLayout textInputLayout = this.f158h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f161k = new FrameLayout(context);
            this.f159i.addView(this.f161k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m158b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f161k.setVisibility(0);
            this.f161k.addView(textView);
        } else {
            this.f159i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f159i.setVisibility(0);
        this.f160j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m158b() {
        if (this.f159i != null) {
            TextInputLayout textInputLayout = this.f158h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f157g;
                boolean zM2031E = AbstractC0805P.m2031E(context);
                LinearLayout linearLayout = this.f159i;
                Field field = AbstractC0080Q.f219a;
                int paddingStart = editText.getPaddingStart();
                if (zM2031E) {
                    paddingStart = context.getResources().getDimensionPixelSize(C1031R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C1031R.dimen.material_helper_text_default_padding_top);
                if (zM2031E) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(C1031R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM2031E) {
                    paddingEnd = context.getResources().getDimensionPixelSize(C1031R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m159c() {
        Animator animator = this.f162l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m160d(ArrayList arrayList, boolean z2, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z2) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            boolean z3 = i4 == i2;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i5 = this.f153c;
            objectAnimatorOfFloat.setDuration(z3 ? this.f152b : i5);
            objectAnimatorOfFloat.setInterpolator(z3 ? this.f155e : this.f156f);
            if (i2 == i4 && i3 != 0) {
                objectAnimatorOfFloat.setStartDelay(i5);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i4 != i2 || i3 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f163m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f151a);
            objectAnimatorOfFloat2.setInterpolator(this.f154d);
            objectAnimatorOfFloat2.setStartDelay(i5);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m161e(int i2) {
        if (i2 == 1) {
            return this.f168r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f175y;
    }

    /* JADX INFO: renamed from: f */
    public final void m162f() {
        this.f166p = null;
        m159c();
        if (this.f164n == 1) {
            if (!this.f174x || TextUtils.isEmpty(this.f173w)) {
                this.f165o = 0;
            } else {
                this.f165o = 2;
            }
        }
        m165i(this.f164n, this.f165o, m164h(this.f168r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m163g(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f159i;
        if (linearLayout == null) {
            return;
        }
        if ((i2 == 0 || i2 == 1) && (frameLayout = this.f161k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i3 = this.f160j - 1;
        this.f160j = i3;
        LinearLayout linearLayout2 = this.f159i;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m164h(TextView textView, CharSequence charSequence) {
        Field field = AbstractC0080Q.f219a;
        TextInputLayout textInputLayout = this.f158h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f165o == this.f164n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* JADX INFO: renamed from: i */
    public final void m165i(int i2, int i3, boolean z2) {
        TextView textViewM161e;
        TextView textViewM161e2;
        if (i2 == i3) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f162l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m160d(arrayList, this.f174x, this.f175y, 2, i2, i3);
            m160d(arrayList, this.f167q, this.f168r, 1, i2, i3);
            int size = arrayList.size();
            long jMax = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Animator animator = (Animator) arrayList.get(i4);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new C0047w(this, i3, m161e(i2), i2, m161e(i3)));
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (textViewM161e2 = m161e(i3)) != null) {
                textViewM161e2.setVisibility(0);
                textViewM161e2.setAlpha(1.0f);
            }
            if (i2 != 0 && (textViewM161e = m161e(i2)) != null) {
                textViewM161e.setVisibility(4);
                if (i2 == 1) {
                    textViewM161e.setText((CharSequence) null);
                }
            }
            this.f164n = i3;
        }
        TextInputLayout textInputLayout = this.f158h;
        textInputLayout.m1904r();
        textInputLayout.m1907u(z2, false);
        textInputLayout.m1910x();
    }
}
