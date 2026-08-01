package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import defpackage.b00;
import defpackage.ja0;
import defpackage.p90;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends b00 {
    public final TextView t;
    public final MaterialCalendarGridView u;

    public b(LinearLayout r9, boolean r10) {
        super(r9);
        TextView r0 = (TextView) r9.findViewById(R.id.month_title);
        this.t = r0;
        WeakHashMap r1 = ja0.a;
        new p90(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(r0, Boolean.TRUE);
        this.u = (MaterialCalendarGridView) r9.findViewById(R.id.month_grid);
        if (r10 == true) goto L6;
        r0.setVisibility(8);
        return;
    }
}
