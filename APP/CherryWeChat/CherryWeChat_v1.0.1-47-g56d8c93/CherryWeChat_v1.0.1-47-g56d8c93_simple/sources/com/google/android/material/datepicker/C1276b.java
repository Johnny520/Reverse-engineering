package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1166o;
import io.github.cherrywechat.R;
import java.util.WeakHashMap;
import p000.AbstractC2185lE;
import p000.C1132aE;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1276b extends AbstractC1166o {

    /* JADX INFO: renamed from: a */
    public final TextView f4532a;

    /* JADX INFO: renamed from: b */
    public final MaterialCalendarGridView f4533b;

    public C1276b(LinearLayout r9, boolean r10) {
        super(r9);
        TextView r0 = (TextView) r9.findViewById(R.id.month_title);
        this.f4532a = r0;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        new C1132aE(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).m4627f(r0, Boolean.TRUE);
        this.f4533b = (MaterialCalendarGridView) r9.findViewById(R.id.month_grid);
        if (r10 == true) goto L6;
        r0.setVisibility(8);
        return;
    }
}
