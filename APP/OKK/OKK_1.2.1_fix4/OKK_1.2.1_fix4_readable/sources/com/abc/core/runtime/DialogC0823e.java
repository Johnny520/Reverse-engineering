package com.abc.core.runtime;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.e */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0823e extends Dialog {

    /* JADX INFO: renamed from: a */
    public final Activity f2982a;

    /* JADX INFO: renamed from: b */
    public final int f2983b;

    /* JADX INFO: renamed from: c */
    public TextView f2984c;

    /* JADX INFO: renamed from: d */
    public TextView f2985d;

    /* JADX INFO: renamed from: e */
    public TextView f2986e;

    /* JADX INFO: renamed from: f */
    public ProgressBar f2987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0823e(Activity activity, int i2) {
        super(activity, R.style.Theme.DeviceDefault.Light.Dialog.NoActionBar.MinWidth);
        AbstractC0307g.m703e(activity, "host");
        this.f2982a = activity;
        this.f2983b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2131a() {
        try {
            if (isShowing()) {
                dismiss();
            }
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2132b(int i2) {
        return (int) ((i2 * this.f2982a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public final TextView m2133c(String str, int i2, boolean z2, int i3) {
        TextView textView = new TextView(this.f2982a);
        textView.setText(str);
        textView.setTextSize(2, i2);
        textView.setTextColor(i3);
        if (z2) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        return textView;
    }

    /* JADX INFO: renamed from: d */
    public final void m2134d(int i2, int i3, String str) {
        AbstractC0307g.m703e(str, "title");
        if (isShowing()) {
            try {
                ProgressBar progressBar = this.f2987f;
                if (progressBar == null) {
                    AbstractC0307g.m705g("bar");
                    throw null;
                }
                progressBar.setMax(i3 >= 1 ? i3 : 1);
                ProgressBar progressBar2 = this.f2987f;
                if (progressBar2 == null) {
                    AbstractC0307g.m705g("bar");
                    throw null;
                }
                progressBar2.setProgress(AbstractC0040p.m111p(i2, 0, i3));
                TextView textView = this.f2986e;
                if (textView == null) {
                    AbstractC0307g.m705g("tvCount");
                    throw null;
                }
                textView.setText(i2 + " / " + i3);
                TextView textView2 = this.f2985d;
                if (textView2 != null) {
                    textView2.setText("正在检查：".concat(str));
                } else {
                    AbstractC0307g.m705g("tvCurrent");
                    throw null;
                }
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        int iM2132b = m2132b(20);
        Activity activity = this.f2982a;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(iM2132b, iM2132b, iM2132b, iM2132b);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(m2132b(16));
        gradientDrawable.setColor(Color.parseColor("#F7F8FA"));
        linearLayout.setBackground(gradientDrawable);
        this.f2984c = m2133c("功能适配检查", 17, true, Color.parseColor("#1A1A1A"));
        this.f2985d = m2133c("准备中…", 13, false, Color.parseColor("#444444"));
        StringBuilder sb = new StringBuilder("0 / ");
        int i2 = this.f2983b;
        sb.append(i2);
        this.f2986e = m2133c(sb.toString(), 14, true, Color.parseColor("#336940"));
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        if (i2 < 1) {
            i2 = 1;
        }
        progressBar.setMax(i2);
        progressBar.setProgress(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, m2132b(8));
        layoutParams.topMargin = m2132b(12);
        layoutParams.bottomMargin = m2132b(8);
        progressBar.setLayoutParams(layoutParams);
        this.f2987f = progressBar;
        TextView textView = this.f2984c;
        if (textView == null) {
            AbstractC0307g.m705g("tvTitle");
            throw null;
        }
        linearLayout.addView(textView);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(1, m2132b(8)));
        linearLayout.addView(view);
        TextView textView2 = this.f2986e;
        if (textView2 == null) {
            AbstractC0307g.m705g("tvCount");
            throw null;
        }
        linearLayout.addView(textView2);
        ProgressBar progressBar2 = this.f2987f;
        if (progressBar2 == null) {
            AbstractC0307g.m705g("bar");
            throw null;
        }
        linearLayout.addView(progressBar2);
        TextView textView3 = this.f2985d;
        if (textView3 == null) {
            AbstractC0307g.m705g("tvCurrent");
            throw null;
        }
        linearLayout.addView(textView3);
        View view2 = new View(activity);
        view2.setLayoutParams(new LinearLayout.LayoutParams(1, m2132b(4)));
        linearLayout.addView(view2);
        linearLayout.addView(m2133c("正在检测各功能在当前微信上的适配点…", 11, false, Color.parseColor("#888888")));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(m2132b(28), m2132b(28), m2132b(28), m2132b(28));
        frameLayout.addView(linearLayout);
        setContentView(frameLayout);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }
}
