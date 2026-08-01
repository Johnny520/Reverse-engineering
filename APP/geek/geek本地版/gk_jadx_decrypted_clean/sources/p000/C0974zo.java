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
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: zo */
/* JADX INFO: loaded from: classes.dex */
public final class C0974zo {

    /* JADX INFO: renamed from: A */
    public ColorStateList f5576A;

    /* JADX INFO: renamed from: B */
    public Typeface f5577B;

    /* JADX INFO: renamed from: a */
    public final int f5578a;

    /* JADX INFO: renamed from: b */
    public final int f5579b;

    /* JADX INFO: renamed from: c */
    public final int f5580c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f5581d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f5582e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f5583f;

    /* JADX INFO: renamed from: g */
    public final Context f5584g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f5585h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f5586i;

    /* JADX INFO: renamed from: j */
    public int f5587j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f5588k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f5589l;

    /* JADX INFO: renamed from: m */
    public final float f5590m;

    /* JADX INFO: renamed from: n */
    public int f5591n;

    /* JADX INFO: renamed from: o */
    public int f5592o;

    /* JADX INFO: renamed from: p */
    public CharSequence f5593p;

    /* JADX INFO: renamed from: q */
    public boolean f5594q;

    /* JADX INFO: renamed from: r */
    public C0249g5 f5595r;

    /* JADX INFO: renamed from: s */
    public CharSequence f5596s;

    /* JADX INFO: renamed from: t */
    public int f5597t;

    /* JADX INFO: renamed from: u */
    public int f5598u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f5599v;

    /* JADX INFO: renamed from: w */
    public CharSequence f5600w;

    /* JADX INFO: renamed from: x */
    public boolean f5601x;

    /* JADX INFO: renamed from: y */
    public C0249g5 f5602y;

    /* JADX INFO: renamed from: z */
    public int f5603z;

    public C0974zo(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5584g = context;
        this.f5585h = textInputLayout;
        this.f5590m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f5578a = AbstractC0126ct.m824v(context, R.attr.motionDurationShort4, 217);
        this.f5579b = AbstractC0126ct.m824v(context, R.attr.motionDurationMedium4, 167);
        this.f5580c = AbstractC0126ct.m824v(context, R.attr.motionDurationShort4, 167);
        this.f5581d = AbstractC0126ct.m825w(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0619q2.f3974d);
        LinearInterpolator linearInterpolator = AbstractC0619q2.f3971a;
        this.f5582e = AbstractC0126ct.m825w(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f5583f = AbstractC0126ct.m825w(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m2804a(C0249g5 c0249g5, int i) {
        if (this.f5586i == null && this.f5588k == null) {
            Context context = this.f5584g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f5586i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f5586i;
            TextInputLayout textInputLayout = this.f5585h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f5588k = new FrameLayout(context);
            this.f5586i.addView(this.f5588k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m2805b();
            }
        }
        if (i == 0 || i == 1) {
            this.f5588k.setVisibility(0);
            this.f5588k.addView(c0249g5);
        } else {
            this.f5586i.addView(c0249g5, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5586i.setVisibility(0);
        this.f5587j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m2805b() {
        if (this.f5586i != null) {
            TextInputLayout textInputLayout = this.f5585h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f5584g;
                boolean zM821s = AbstractC0126ct.m821s(context);
                LinearLayout linearLayout = this.f5586i;
                WeakHashMap weakHashMap = ja0.f2600a;
                int iM2369f = t90.m2369f(editText);
                if (zM821s) {
                    iM2369f = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM821s) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int iM2368e = t90.m2368e(editText);
                if (zM821s) {
                    iM2368e = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                t90.m2374k(linearLayout, iM2369f, dimensionPixelSize, iM2368e, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2806c() {
        AnimatorSet animatorSet = this.f5589l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2807d(ArrayList arrayList, boolean z, C0249g5 c0249g5, int i, int i2, int i3) {
        if (c0249g5 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0249g5, (Property<C0249g5, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f5580c;
            objectAnimatorOfFloat.setDuration(z2 ? this.f5579b : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f5582e : this.f5583f);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0249g5, (Property<C0249g5, Float>) View.TRANSLATION_Y, -this.f5590m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f5578a);
            objectAnimatorOfFloat2.setInterpolator(this.f5581d);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m2808e(int i) {
        if (i == 1) {
            return this.f5595r;
        }
        if (i != 2) {
            return null;
        }
        return this.f5602y;
    }

    /* JADX INFO: renamed from: f */
    public final void m2809f() {
        this.f5593p = null;
        m2806c();
        if (this.f5591n == 1) {
            if (!this.f5601x || TextUtils.isEmpty(this.f5600w)) {
                this.f5592o = 0;
            } else {
                this.f5592o = 2;
            }
        }
        m2812i(this.f5591n, this.f5592o, m2811h(this.f5595r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m2810g(C0249g5 c0249g5, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f5586i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f5588k) != null) {
            frameLayout.removeView(c0249g5);
        } else {
            linearLayout.removeView(c0249g5);
        }
        int i2 = this.f5587j - 1;
        this.f5587j = i2;
        LinearLayout linearLayout2 = this.f5586i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2811h(C0249g5 c0249g5, CharSequence charSequence) {
        WeakHashMap weakHashMap = ja0.f2600a;
        TextInputLayout textInputLayout = this.f5585h;
        if (v90.m2496c(textInputLayout) && textInputLayout.isEnabled()) {
            return (this.f5592o == this.f5591n && c0249g5 != null && TextUtils.equals(c0249g5.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m2812i(int i, int i2, boolean z) {
        TextView textViewM2808e;
        TextView textViewM2808e2;
        C0974zo c0974zo = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c0974zo.f5589l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c0974zo.m2807d(arrayList, c0974zo.f5601x, c0974zo.f5602y, 2, i, i2);
            c0974zo.m2807d(arrayList, c0974zo.f5594q, c0974zo.f5595r, 1, i, i2);
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
            C0900xo c0900xo = new C0900xo(this, i2, m2808e(i), i, c0974zo.m2808e(i2));
            c0974zo = this;
            animatorSet.addListener(c0900xo);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM2808e2 = c0974zo.m2808e(i2)) != null) {
                textViewM2808e2.setVisibility(0);
                textViewM2808e2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM2808e = m2808e(i)) != null) {
                textViewM2808e.setVisibility(4);
                if (i == 1) {
                    textViewM2808e.setText((CharSequence) null);
                }
            }
            c0974zo.f5591n = i2;
        }
        TextInputLayout textInputLayout = c0974zo.f5585h;
        textInputLayout.m784r();
        textInputLayout.m787u(z, false);
        textInputLayout.m790x();
    }
}
