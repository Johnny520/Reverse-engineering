package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
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
import com.google.android.material.C1247R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.T8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0352T8 {

    /* JADX INFO: renamed from: A */
    public ColorStateList f1254A;

    /* JADX INFO: renamed from: B */
    public Typeface f1255B;

    /* JADX INFO: renamed from: a */
    public final int f1256a;

    /* JADX INFO: renamed from: b */
    public final int f1257b;

    /* JADX INFO: renamed from: c */
    public final int f1258c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f1259d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f1260e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f1261f;

    /* JADX INFO: renamed from: g */
    public final Context f1262g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f1263h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1264i;

    /* JADX INFO: renamed from: j */
    public int f1265j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f1266k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f1267l;

    /* JADX INFO: renamed from: m */
    public final float f1268m;

    /* JADX INFO: renamed from: n */
    public int f1269n;

    /* JADX INFO: renamed from: o */
    public int f1270o;

    /* JADX INFO: renamed from: p */
    public CharSequence f1271p;

    /* JADX INFO: renamed from: q */
    public boolean f1272q;

    /* JADX INFO: renamed from: r */
    public C0794r1 f1273r;

    /* JADX INFO: renamed from: s */
    public CharSequence f1274s;

    /* JADX INFO: renamed from: t */
    public int f1275t;

    /* JADX INFO: renamed from: u */
    public int f1276u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f1277v;

    /* JADX INFO: renamed from: w */
    public CharSequence f1278w;

    /* JADX INFO: renamed from: x */
    public boolean f1279x;

    /* JADX INFO: renamed from: y */
    public C0794r1 f1280y;

    /* JADX INFO: renamed from: z */
    public int f1281z;

    /* JADX INFO: renamed from: a.T8$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1282a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f1283b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f1284c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TextView f1285d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.f1282a = i;
            this.f1283b = textView;
            this.f1284c = i2;
            this.f1285d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C0794r1 c0794r1;
            int i = this.f1282a;
            C0352T8 c0352t8 = C0352T8.this;
            c0352t8.f1269n = i;
            c0352t8.f1267l = null;
            TextView textView = this.f1283b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f1284c == 1 && (c0794r1 = c0352t8.f1273r) != null) {
                    c0794r1.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f1285d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f1285d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public C0352T8(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1262g = context;
        this.f1263h = textInputLayout;
        this.f1268m = context.getResources().getDimensionPixelSize(C1247R.dimen.design_textinput_caption_translate_y);
        this.f1256a = C0899wb.m2187c(context, C1247R.attr.motionDurationShort4, 217);
        this.f1257b = C0899wb.m2187c(context, C1247R.attr.motionDurationMedium4, 167);
        this.f1258c = C0899wb.m2187c(context, C1247R.attr.motionDurationShort4, 167);
        this.f1259d = C0899wb.m2188d(context, C1247R.attr.motionEasingEmphasizedDecelerateInterpolator, C0888w0.f3471d);
        int i = C1247R.attr.motionEasingEmphasizedDecelerateInterpolator;
        LinearInterpolator linearInterpolator = C0888w0.f3468a;
        this.f1260e = C0899wb.m2188d(context, i, linearInterpolator);
        this.f1261f = C0899wb.m2188d(context, C1247R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m944a(C0794r1 c0794r1, int i) {
        if (this.f1264i == null && this.f1266k == null) {
            Context context = this.f1262g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1264i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1264i;
            TextInputLayout textInputLayout = this.f1263h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1266k = new FrameLayout(context);
            this.f1264i.addView(this.f1266k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m945b();
            }
        }
        if (i == 0 || i == 1) {
            this.f1266k.setVisibility(0);
            this.f1266k.addView(c0794r1);
        } else {
            this.f1264i.addView(c0794r1, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1264i.setVisibility(0);
        this.f1265j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m945b() {
        if (this.f1264i != null) {
            TextInputLayout textInputLayout = this.f1263h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1262g;
                boolean zM927d = C0336Sa.m927d(context);
                LinearLayout linearLayout = this.f1264i;
                int i = C1247R.dimen.material_helper_text_font_1_3_padding_horizontal;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                int paddingStart = editText.getPaddingStart();
                if (zM927d) {
                    paddingStart = context.getResources().getDimensionPixelSize(i);
                }
                int i2 = C1247R.dimen.material_helper_text_font_1_3_padding_top;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C1247R.dimen.material_helper_text_default_padding_top);
                if (zM927d) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                }
                int i3 = C1247R.dimen.material_helper_text_font_1_3_padding_horizontal;
                int paddingEnd = editText.getPaddingEnd();
                if (zM927d) {
                    paddingEnd = context.getResources().getDimensionPixelSize(i3);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m946c() {
        AnimatorSet animatorSet = this.f1267l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m947d(ArrayList arrayList, boolean z, C0794r1 c0794r1, int i, int i2, int i3) {
        if (c0794r1 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0794r1, (Property<C0794r1, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f1258c;
            objectAnimatorOfFloat.setDuration(z2 ? this.f1257b : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f1260e : this.f1261f);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0794r1, (Property<C0794r1, Float>) View.TRANSLATION_Y, -this.f1268m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f1256a);
            objectAnimatorOfFloat2.setInterpolator(this.f1259d);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m948e(int i) {
        if (i == 1) {
            return this.f1273r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1280y;
    }

    /* JADX INFO: renamed from: f */
    public final void m949f() {
        this.f1271p = null;
        m946c();
        if (this.f1269n == 1) {
            if (!this.f1279x || TextUtils.isEmpty(this.f1278w)) {
                this.f1270o = 0;
            } else {
                this.f1270o = 2;
            }
        }
        m952i(this.f1269n, this.f1270o, m951h(this.f1273r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m950g(C0794r1 c0794r1, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f1264i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f1266k) != null) {
            frameLayout.removeView(c0794r1);
        } else {
            linearLayout.removeView(c0794r1);
        }
        int i2 = this.f1265j - 1;
        this.f1265j = i2;
        LinearLayout linearLayout2 = this.f1264i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m951h(C0794r1 c0794r1, CharSequence charSequence) {
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        TextInputLayout textInputLayout = this.f1263h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f1270o == this.f1269n && c0794r1 != null && TextUtils.equals(c0794r1.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m952i(int i, int i2, boolean z) {
        TextView textViewM948e;
        TextView textViewM948e2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1267l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m947d(arrayList, this.f1279x, this.f1280y, 2, i, i2);
            m947d(arrayList, this.f1272q, this.f1273r, 1, i, i2);
            C0889w1.m2127N(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, m948e(i), i, m948e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM948e2 = m948e(i2)) != null) {
                textViewM948e2.setVisibility(0);
                textViewM948e2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM948e = m948e(i)) != null) {
                textViewM948e.setVisibility(4);
                if (i == 1) {
                    textViewM948e.setText((CharSequence) null);
                }
            }
            this.f1269n = i2;
        }
        TextInputLayout textInputLayout = this.f1263h;
        textInputLayout.m3273r();
        textInputLayout.m3276u(z, false);
        textInputLayout.m3279x();
    }
}
