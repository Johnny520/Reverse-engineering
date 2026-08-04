package yyds;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛱᛳᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0094 extends ArrayAdapter {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Context f708;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0094(Context context, ArrayList arrayList) {
        super(context, R.layout.simple_spinner_item, arrayList);
        this.f708 = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        AbstractC2328.m4341(-133182213751662L);
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        TextView textView = dropDownView instanceof TextView ? (TextView) dropDownView : null;
        if (textView != null) {
            Context context = this.f708;
            textView.setTextColor(context.getColor(com.p000ss.android.ugc.aweme.yyds.R.color.primary_text));
            textView.setBackgroundColor(context.getColor(com.p000ss.android.ugc.aweme.yyds.R.color.list_item_bg));
            textView.setPadding(24, 18, 24, 18);
        }
        AbstractC2328.m4341(-133212278522734L);
        return dropDownView;
    }
}
