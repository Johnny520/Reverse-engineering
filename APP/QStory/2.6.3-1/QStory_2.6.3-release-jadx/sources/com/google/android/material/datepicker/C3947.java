package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3028;
import androidx.recyclerview.widget.AbstractC3317;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3947 extends AbstractC3317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final MaterialCalendarGridView f10635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextView f10636;

    public C3947(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(C0328R.id.month_title);
        this.f10636 = textView;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        new C3028(C0328R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m4563(Boolean.TRUE, textView);
        this.f10635 = (MaterialCalendarGridView) linearLayout.findViewById(C0328R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
