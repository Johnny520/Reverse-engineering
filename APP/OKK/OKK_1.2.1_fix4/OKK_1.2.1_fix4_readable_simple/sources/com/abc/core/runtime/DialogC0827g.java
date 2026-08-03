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
import android.widget.ScrollView;
import android.widget.TextView;
import com.abc.internal.probe.AppFingerprint;
import com.abc.internal.probe.DiagnosticItem;
import com.abc.internal.probe.DiagnosticLevel;
import com.abc.ui.ViewOnClickListenerC0745f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007D0.C0137c;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.g */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0827g extends Dialog {

    /* JADX INFO: renamed from: a */
    public final Activity f2998a;

    /* JADX INFO: renamed from: b */
    public final AppFingerprint f2999b;

    public DialogC0827g(Activity r2, AppFingerprint r3) {
        AbstractC0307g.m703e(r2, "host");
        super(r2, R.style.Theme.DeviceDefault.Light.Dialog.NoActionBar.MinWidth);
        this.f2998a = r2;
        this.f2999b = r3;
    }

    /* JADX INFO: renamed from: a */
    public final TextView m2147a(String r5, InterfaceC0275a r6) {
        TextView r02 = new TextView(this.f2998a);
        r02.setText(r5);
        r02.setTextSize(2, 14.0f);
        r02.setTextColor(-1);
        r02.setPadding(m2148b(16), m2148b(10), m2148b(16), m2148b(10));
        GradientDrawable r52 = new GradientDrawable();
        r52.setCornerRadius(m2148b(20));
        r52.setColor(Color.parseColor("#336940"));
        r02.setBackground(r52);
        r02.setOnClickListener(new ViewOnClickListenerC0745f(r6, 3));
        return r02;
    }

    /* JADX INFO: renamed from: b */
    public final int m2148b(int r2) {
        return (int) ((r2 * this.f2998a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public final View m2149c(int r4) {
        View r02 = new View(this.f2998a);
        r02.setLayoutParams(new LinearLayout.LayoutParams(1, m2148b(r4)));
        return r02;
    }

    /* JADX INFO: renamed from: d */
    public final TextView m2150d(String r3, int r4, boolean r5, int r6) {
        TextView r02 = new TextView(this.f2998a);
        r02.setText(r3);
        r02.setTextSize(2, r4);
        r02.setTextColor(r6);
        if (r5 == false) goto L5;
        r02.setTypeface(Typeface.DEFAULT_BOLD);
    L5:
        return r02;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle r13) {
        super.onCreate(r13);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        int r1 = m2148b(16);
        Activity r3 = this.f2998a;
        LinearLayout r2 = new LinearLayout(r3);
        r2.setOrientation(1);
        r2.setPadding(r1, r1, r1, r1);
        GradientDrawable r12 = new GradientDrawable();
        r12.setCornerRadius(m2148b(16));
        r12.setColor(Color.parseColor("#F7F8FA"));
        r2.setBackground(r12);
        r2.addView(m2150d("适配完成", 18, true, Color.parseColor("#1A1A1A")));
        r2.addView(m2149c(6));
        AppFingerprint r02 = this.f2999b;
        r2.addView(m2150d(r02.f1639b, 12, false, Color.parseColor("#666666")));
        List r14 = r02.f1641d;
        ArrayList r5 = new ArrayList();
        Iterator r15 = r14.iterator();
    L4:
        if (r15.hasNext() == false) goto L8;
        Object r8 = r15.next();
        if (((DiagnosticItem) r8).f1670c == DiagnosticLevel.f1664a) goto L4;
        r5.add(r8);
        goto L4
    L8:
        r2.addView(m2150d("正常 " + r02.m1359c() + " · 需关注 " + r02.m1360d() + " · 不适配 " + r02.m1358b(), 13, true, Color.parseColor("#336940")));
        r2.addView(m2149c(4));
        if (r5.isEmpty() == false) goto L11;
        String r16 = "当前版本命中全部已知适配点，可直接使用。";
    L12:
        r2.addView(m2150d(r16, 12, false, Color.parseColor("#666666")));
        r2.addView(m2149c(10));
        if ((!r5.isEmpty()) == false) goto L37;
        ScrollView r17 = new ScrollView(r3);
        r17.setLayoutParams(new LinearLayout.LayoutParams(-1, m2148b(220)));
        LinearLayout r4 = new LinearLayout(r3);
        r4.setOrientation(1);
        Iterator r52 = r5.iterator();
    L16:
        if (r52.hasNext() == false) goto L36;
        DiagnosticItem r82 = (DiagnosticItem) r52.next();
        int r9 = r82.f1670c.ordinal();
        if (r9 == 0) goto L25;
        if (r9 == 1) goto L24;
        if (r9 != 2) goto L23;
        String r92 = "×";
    L26:
        int r11 = r82.f1670c.ordinal();
        if (r11 == 0) goto L34;
        if (r11 == 1) goto L33;
        if (r11 != 2) goto L32;
        int r10 = Color.parseColor("#C62828");
    L35:
        TextView r83 = m2150d(r92 + "  " + r82.f1669b + "  ·  " + r82.f1671d, 12, false, r10);
        r83.setPadding(0, m2148b(4), 0, m2148b(4));
        r4.addView(r83);
        goto L16
    L32:
        throw new C0137c();
    L33:
        r10 = Color.parseColor("#F9A825");
        goto L35
    L34:
        r10 = Color.parseColor("#2E7D32");
        goto L35
    L23:
        throw new C0137c();
    L24:
        r92 = "!";
        goto L26
    L25:
        r92 = "✓";
        goto L26
    L36:
        r17.addView(r4);
        r2.addView(r17);
        r2.addView(m2149c(12));
    L37:
        LinearLayout r132 = new LinearLayout(r3);
        r132.setOrientation(0);
        r132.setGravity(8388613);
        final int r18 = 0;
        r132.addView(m2147a("复制报告", new C0825f(this, r18)));
        r132.addView(m2149c(8));
        final int r19 = 1;
        r132.addView(m2147a("完成", new C0825f(this, r19)));
        r2.addView(r132);
        FrameLayout r133 = new FrameLayout(r3);
        r133.setPadding(m2148b(24), m2148b(24), m2148b(24), m2148b(24));
        r133.addView(r2);
        setContentView(r133);
        Window r134 = getWindow();
        if (r134 == null) goto L52;
        r134.setBackgroundDrawableResource(R.color.transparent);
        return;
    L52:
        return;
    L11:
        r16 = "以下仅展示需关注或不适配的项目；未列出的功能默认按正常处理。";
        goto L12
    }
}
