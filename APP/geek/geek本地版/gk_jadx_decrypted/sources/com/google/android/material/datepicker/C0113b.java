package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;
import p000.b00;
import p000.ja0;
import p000.p90;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0113b extends b00 {

    /* JADX INFO: renamed from: t */
    public final TextView f1122t;

    /* JADX INFO: renamed from: u */
    public final MaterialCalendarGridView f1123u;

    public C0113b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1122t = textView;
        WeakHashMap weakHashMap = ja0.f2600a;
        new p90(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m2360d(textView, Boolean.TRUE);
        this.f1123u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
