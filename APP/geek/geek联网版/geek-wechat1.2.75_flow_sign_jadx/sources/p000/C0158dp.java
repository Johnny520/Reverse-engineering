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

/* JADX INFO: renamed from: dp */
/* JADX INFO: loaded from: classes.dex */
public final class C0158dp {

    /* JADX INFO: renamed from: A */
    public ColorStateList f1400A;

    /* JADX INFO: renamed from: B */
    public Typeface f1401B;

    /* JADX INFO: renamed from: a */
    public final int f1402a;

    /* JADX INFO: renamed from: b */
    public final int f1403b;

    /* JADX INFO: renamed from: c */
    public final int f1404c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f1405d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f1406e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f1407f;

    /* JADX INFO: renamed from: g */
    public final Context f1408g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f1409h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1410i;

    /* JADX INFO: renamed from: j */
    public int f1411j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f1412k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f1413l;

    /* JADX INFO: renamed from: m */
    public final float f1414m;

    /* JADX INFO: renamed from: n */
    public int f1415n;

    /* JADX INFO: renamed from: o */
    public int f1416o;

    /* JADX INFO: renamed from: p */
    public CharSequence f1417p;

    /* JADX INFO: renamed from: q */
    public boolean f1418q;

    /* JADX INFO: renamed from: r */
    public C0249g5 f1419r;

    /* JADX INFO: renamed from: s */
    public CharSequence f1420s;

    /* JADX INFO: renamed from: t */
    public int f1421t;

    /* JADX INFO: renamed from: u */
    public int f1422u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f1423v;

    /* JADX INFO: renamed from: w */
    public CharSequence f1424w;

    /* JADX INFO: renamed from: x */
    public boolean f1425x;

    /* JADX INFO: renamed from: y */
    public C0249g5 f1426y;

    /* JADX INFO: renamed from: z */
    public int f1427z;

    public C0158dp(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1408g = context;
        this.f1409h = textInputLayout;
        this.f1414m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1402a = AbstractC0274gu.m1302E(context, R.attr.motionDurationShort4, 217);
        this.f1403b = AbstractC0274gu.m1302E(context, R.attr.motionDurationMedium4, 167);
        this.f1404c = AbstractC0274gu.m1302E(context, R.attr.motionDurationShort4, 167);
        this.f1405d = AbstractC0274gu.m1303F(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0618q2.f3773d);
        LinearInterpolator linearInterpolator = AbstractC0618q2.f3770a;
        this.f1406e = AbstractC0274gu.m1303F(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1407f = AbstractC0274gu.m1303F(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m931a(C0249g5 c0249g5, int i) {
        if (this.f1410i == null && this.f1412k == null) {
            Context context = this.f1408g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1410i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1410i;
            TextInputLayout textInputLayout = this.f1409h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1412k = new FrameLayout(context);
            this.f1410i.addView(this.f1412k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m932b();
            }
        }
        if (i == 0 || i == 1) {
            this.f1412k.setVisibility(0);
            this.f1412k.addView(c0249g5);
        } else {
            this.f1410i.addView(c0249g5, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1410i.setVisibility(0);
        this.f1411j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m932b() {
        if (this.f1410i != null) {
            TextInputLayout textInputLayout = this.f1409h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1408g;
                boolean zM1321x = AbstractC0274gu.m1321x(context);
                LinearLayout linearLayout = this.f1410i;
                WeakHashMap weakHashMap = oa0.f3426a;
                int iM2734f = y90.m2734f(editText);
                if (zM1321x) {
                    iM2734f = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM1321x) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int iM2733e = y90.m2733e(editText);
                if (zM1321x) {
                    iM2733e = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                y90.m2739k(linearLayout, iM2734f, dimensionPixelSize, iM2733e, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m933c() {
        AnimatorSet animatorSet = this.f1413l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m934d(ArrayList arrayList, boolean z, C0249g5 c0249g5, int i, int i2, int i3) {
        if (c0249g5 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0249g5, (Property<C0249g5, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f1404c;
            objectAnimatorOfFloat.setDuration(z2 ? this.f1403b : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f1406e : this.f1407f);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0249g5, (Property<C0249g5, Float>) View.TRANSLATION_Y, -this.f1414m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f1402a);
            objectAnimatorOfFloat2.setInterpolator(this.f1405d);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m935e(int i) {
        if (i == 1) {
            return this.f1419r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1426y;
    }

    /* JADX INFO: renamed from: f */
    public final void m936f() {
        this.f1417p = null;
        m933c();
        if (this.f1415n == 1) {
            if (!this.f1425x || TextUtils.isEmpty(this.f1424w)) {
                this.f1416o = 0;
            } else {
                this.f1416o = 2;
            }
        }
        m939i(this.f1415n, this.f1416o, m938h(this.f1419r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m937g(C0249g5 c0249g5, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f1410i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f1412k) != null) {
            frameLayout.removeView(c0249g5);
        } else {
            linearLayout.removeView(c0249g5);
        }
        int i2 = this.f1411j - 1;
        this.f1411j = i2;
        LinearLayout linearLayout2 = this.f1410i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m938h(C0249g5 c0249g5, CharSequence charSequence) {
        WeakHashMap weakHashMap = oa0.f3426a;
        TextInputLayout textInputLayout = this.f1409h;
        if (aa0.m40c(textInputLayout) && textInputLayout.isEnabled()) {
            return (this.f1416o == this.f1415n && c0249g5 != null && TextUtils.equals(c0249g5.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m939i(int i, int i2, boolean z) {
        TextView textViewM935e;
        TextView textViewM935e2;
        C0158dp c0158dp = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c0158dp.f1413l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c0158dp.m934d(arrayList, c0158dp.f1425x, c0158dp.f1426y, 2, i, i2);
            c0158dp.m934d(arrayList, c0158dp.f1418q, c0158dp.f1419r, 1, i, i2);
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
            C0076bp c0076bp = new C0076bp(this, i2, m935e(i), i, c0158dp.m935e(i2));
            c0158dp = this;
            animatorSet.addListener(c0076bp);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM935e2 = c0158dp.m935e(i2)) != null) {
                textViewM935e2.setVisibility(0);
                textViewM935e2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM935e = m935e(i)) != null) {
                textViewM935e.setVisibility(4);
                if (i == 1) {
                    textViewM935e.setText((CharSequence) null);
                }
            }
            c0158dp.f1415n = i2;
        }
        TextInputLayout textInputLayout = c0158dp.f1409h;
        textInputLayout.m742r();
        textInputLayout.m745u(z, false);
        textInputLayout.m748x();
    }
}
