package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;
import p000.i00;
import p000.oa0;
import p000.u90;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0113b extends i00 {

    /* JADX INFO: renamed from: t */
    public final TextView f1047t;

    /* JADX INFO: renamed from: u */
    public final MaterialCalendarGridView f1048u;

    public C0113b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1047t = textView;
        WeakHashMap weakHashMap = oa0.f3426a;
        new u90(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m2796d(textView, Boolean.TRUE);
        this.f1048u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
