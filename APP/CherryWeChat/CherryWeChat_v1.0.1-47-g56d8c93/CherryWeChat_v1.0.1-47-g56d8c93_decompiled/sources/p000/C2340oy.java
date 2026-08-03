package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: oy */
/* JADX INFO: loaded from: classes.dex */
public final class C2340oy extends LinearLayout implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: e */
    public static boolean f8211e;

    /* JADX INFO: renamed from: a */
    public TextView f8212a;

    /* JADX INFO: renamed from: b */
    public TextView f8213b;

    /* JADX INFO: renamed from: c */
    public TextView f8214c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f8215d;

    static {
        AbstractC0295Gu.m625r(-477119326976053L);
    }

    /* JADX INFO: renamed from: a */
    public static final void m4746a(C2340oy c2340oy) {
        TextView textView = c2340oy.f8212a;
        TextView textView2 = null;
        if (textView == null) {
            AbstractC0295Gu.m625r(-476397772470325L);
            textView = null;
        }
        textView.setText(AbstractC0295Gu.m625r(-476453607045173L));
        textView.setClickable(false);
        textView.setAlpha(1.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(textView.getContext().getColor(R.color.colorError));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(8));
        textView.setBackground(gradientDrawable);
        TextView textView3 = c2340oy.f8214c;
        if (textView3 == null) {
            AbstractC0295Gu.m625r(-476483671816245L);
        } else {
            textView2 = textView3;
        }
        textView2.setText(AbstractC0295Gu.m625r(-476556686260277L));
        textView2.setTextColor(textView2.getContext().getColor(R.color.colorError));
    }

    /* JADX INFO: renamed from: e */
    public static final void m4747e(C2340oy c2340oy) {
        TextView textView = c2340oy.f8212a;
        if (textView == null) {
            AbstractC0295Gu.m625r(-476213088876597L);
            textView = null;
        }
        textView.setText(AbstractC0295Gu.m625r(-476268923451445L));
        textView.setClickable(true);
        textView.setAlpha(1.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1499549);
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(8));
        textView.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: f */
    public static final void m4748f(C2340oy c2340oy) {
        TextView textView = c2340oy.f8212a;
        if (textView == null) {
            AbstractC0295Gu.m625r(-476131484497973L);
            textView = null;
        }
        textView.setText(AbstractC0295Gu.m625r(-476187319072821L));
        textView.setClickable(false);
        textView.setAlpha(1.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-6381922);
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(8));
        textView.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: g */
    public static final void m4749g(C2340oy c2340oy, boolean z) {
        TextView textView = c2340oy.f8214c;
        LinearLayout linearLayout = null;
        if (textView == null) {
            AbstractC0295Gu.m625r(-478274673178677L);
            textView = null;
        }
        if (z) {
            textView.setText(AbstractC0295Gu.m625r(-477797931808821L));
            textView.setTextColor(textView.getContext().getColor(R.color.colorSuccess));
            LinearLayout linearLayout2 = c2340oy.f8215d;
            if (linearLayout2 == null) {
                AbstractC0295Gu.m625r(-477840881481781L);
            } else {
                linearLayout = linearLayout2;
            }
            linearLayout.setVisibility(0);
            return;
        }
        textView.setText(AbstractC0295Gu.m625r(-477918190893109L));
        textView.setTextColor(textView.getContext().getColor(R.color.colorError));
        LinearLayout linearLayout3 = c2340oy.f8215d;
        if (linearLayout3 == null) {
            AbstractC0295Gu.m625r(-477969730500661L);
        } else {
            linearLayout = linearLayout3;
        }
        linearLayout.setVisibility(8);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-476951823251509L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-476990477957173L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-476363412731957L);
    }

    @Override // p000.InterfaceC0972Wk
    public View getContentView() {
        return this;
    }

    @Override // p000.InterfaceC0972Wk
    public String getTitle() {
        return AbstractC0295Gu.m625r(-477029132662837L);
    }

    public int getViewId() {
        return 6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f8211e) {
            f8211e = false;
            C1498hd c1498hd = AbstractC1499he.f5282a;
            AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2297ny(this, (InterfaceC0190Eb) null, 0), 3);
        }
    }
}
