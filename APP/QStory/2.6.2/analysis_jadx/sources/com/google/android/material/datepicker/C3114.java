package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2195;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3114 extends AbstractC2484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final MaterialCalendarGridView f10285;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextView f10286;

    public C3114(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f10286 = textView;
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        new C2195(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m3993(Boolean.TRUE, textView);
        this.f10285 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
