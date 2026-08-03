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

    public DialogC0823e(Activity r2, int r3) {
        AbstractC0307g.m703e(r2, "host");
        super(r2, R.style.Theme.DeviceDefault.Light.Dialog.NoActionBar.MinWidth);
        this.f2982a = r2;
        this.f2983b = r3;
    }

    /* JADX INFO: renamed from: a */
    public final void m2131a() {
    L6:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L3:
        if (isShowing() == false) goto L11;
        dismiss();     // Catch: Throwable -> L6
        return;
    }

    /* JADX INFO: renamed from: b */
    public final int m2132b(int r2) {
        return (int) ((r2 * this.f2982a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public final TextView m2133c(String r3, int r4, boolean r5, int r6) {
        TextView r02 = new TextView(this.f2982a);
        r02.setText(r3);
        r02.setTextSize(2, r4);
        r02.setTextColor(r6);
        if (r5 == false) goto L5;
        r02.setTypeface(Typeface.DEFAULT_BOLD);
    L5:
        return r02;
    }

    /* JADX INFO: renamed from: d */
    public final void m2134d(int r6, int r7, String r8) {
        AbstractC0307g.m703e(r8, "title");
        if (isShowing() == true) goto L31;
        return;
    L31:
        ProgressBar r1 = this.f2987f;     // Catch: Throwable -> L19
        if (r1 == null) goto L27;
        int r4 = 1;
        if (r7 < 1) goto L12;
        r4 = r7;
    L12:
        r1.setMax(r4);     // Catch: Throwable -> L19
        ProgressBar r12 = this.f2987f;     // Catch: Throwable -> L19
        if (r12 == null) goto L25;
        r12.setProgress(AbstractC0040p.m111p(r6, 0, r7));     // Catch: Throwable -> L19
        TextView r13 = this.f2986e;     // Catch: Throwable -> L19
        if (r13 == null) goto L23;
        r13.setText(r6 + " / " + r7);     // Catch: Throwable -> L19
        TextView r62 = this.f2985d;     // Catch: Throwable -> L19
        if (r62 == null) goto L21;
        r62.setText("正在检查：".concat(r8));     // Catch: Throwable -> L19
        return;
    L21:
        AbstractC0307g.m705g("tvCurrent");     // Catch: Throwable -> L19
        throw null;     // Catch: Throwable -> L19
    L23:
        AbstractC0307g.m705g("tvCount");     // Catch: Throwable -> L19
        throw null;     // Catch: Throwable -> L19
    L25:
        AbstractC0307g.m705g("bar");     // Catch: Throwable -> L19
        throw null;     // Catch: Throwable -> L19
    L27:
        AbstractC0307g.m705g("bar");     // Catch: Throwable -> L19
        throw null;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle r10) {
        super.onCreate(r10);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        int r02 = m2132b(20);
        Activity r2 = this.f2982a;
        LinearLayout r1 = new LinearLayout(r2);
        r1.setOrientation(1);
        r1.setPadding(r02, r02, r02, r02);
        GradientDrawable r03 = new GradientDrawable();
        r03.setCornerRadius(m2132b(16));
        r03.setColor(Color.parseColor("#F7F8FA"));
        r1.setBackground(r03);
        this.f2984c = m2133c("功能适配检查", 17, true, Color.parseColor("#1A1A1A"));
        this.f2985d = m2133c("准备中…", 13, false, Color.parseColor("#444444"));
        StringBuilder r04 = new StringBuilder("0 / ");
        int r4 = this.f2983b;
        r04.append(r4);
        this.f2986e = m2133c(r04.toString(), 14, true, Color.parseColor("#336940"));
        ProgressBar r05 = new ProgressBar(r2, null, R.attr.progressBarStyleHorizontal);
        if (r4 >= 1) goto L5;
        r4 = 1;
    L5:
        r05.setMax(r4);
        r05.setProgress(0);
        LinearLayout.LayoutParams r42 = new LinearLayout.LayoutParams(-1, m2132b(8));
        r42.topMargin = m2132b(12);
        r42.bottomMargin = m2132b(8);
        r05.setLayoutParams(r42);
        this.f2987f = r05;
        TextView r06 = this.f2984c;
        if (r06 == null) goto L23;
        r1.addView(r06);
        View r07 = new View(r2);
        r07.setLayoutParams(new LinearLayout.LayoutParams(1, m2132b(8)));
        r1.addView(r07);
        TextView r08 = this.f2986e;
        if (r08 == null) goto L21;
        r1.addView(r08);
        ProgressBar r09 = this.f2987f;
        if (r09 == null) goto L19;
        r1.addView(r09);
        TextView r010 = this.f2985d;
        if (r010 == null) goto L17;
        r1.addView(r010);
        View r011 = new View(r2);
        r011.setLayoutParams(new LinearLayout.LayoutParams(1, m2132b(4)));
        r1.addView(r011);
        r1.addView(m2133c("正在检测各功能在当前微信上的适配点…", 11, false, Color.parseColor("#888888")));
        FrameLayout r102 = new FrameLayout(r2);
        r102.setPadding(m2132b(28), m2132b(28), m2132b(28), m2132b(28));
        r102.addView(r1);
        setContentView(r102);
        Window r103 = getWindow();
        if (r103 == null) goto L25;
        r103.setBackgroundDrawableResource(R.color.transparent);
        return;
    L25:
        return;
    L17:
        AbstractC0307g.m705g("tvCurrent");
        throw null;
    L19:
        AbstractC0307g.m705g("bar");
        throw null;
    L21:
        AbstractC0307g.m705g("tvCount");
        throw null;
    L23:
        AbstractC0307g.m705g("tvTitle");
        throw null;
    }
}
