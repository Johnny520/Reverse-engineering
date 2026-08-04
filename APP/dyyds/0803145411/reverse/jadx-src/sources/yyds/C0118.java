package yyds;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛱᛴᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0118 extends AbstractC0359 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f809;

    public C0118(ArrayList arrayList) {
        AbstractC2328.m4341(-193595223737198L);
        this.f809 = arrayList;
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo472(AbstractC0185 abstractC0185, int i) {
        C2715 c2715 = (C2715) abstractC0185;
        AbstractC2328.m4341(-193659648246638L);
        C1672 c1672 = (C1672) this.f809.get(i);
        AbstractC2328.m4341(-180517048320878L);
        c2715.f13340.setText(c1672.f8530);
        List list = AbstractC2801.f13670;
        C1509.f7142.getClass();
        c2715.m4822(!C1509.m3042().contains(c1672.f8529));
        c2715.f13341.setOnClickListener(new ViewOnClickListenerC1374(c1672, 20, c2715));
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int mo531() {
        return this.f809.size();
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final AbstractC0185 mo473(ViewGroup viewGroup, int i) {
        AbstractC2328.m4341(-193620993540974L);
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(AbstractC1426.m2904(10), AbstractC1426.m2904(6), AbstractC1426.m2904(8), AbstractC1426.m2904(6));
        int color = context.getColor(R.color.card_bg);
        int iM2904 = AbstractC1426.m2904(12);
        int color2 = context.getColor(R.color.divider_color);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(iM2904);
        gradientDrawable.setStroke(1, color2);
        linearLayout.setBackground(gradientDrawable);
        C2526 c2526 = new C2526(-1, AbstractC1426.m2904(48));
        ((ViewGroup.MarginLayoutParams) c2526).bottomMargin = AbstractC1426.m2904(6);
        linearLayout.setLayoutParams(c2526);
        TextView textView = new TextView(context);
        textView.setText(AbstractC2328.m4341(-193651058312046L));
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        textView.setTextColor(context.getColor(R.color.secondary_text));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(15.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        textView2.setTextColor(context.getColor(R.color.primary_text));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(13.0f);
        textView3.setTypeface(typeface);
        textView3.setGravity(17);
        textView3.setClickable(true);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(AbstractC1426.m2904(36), -1));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(AbstractC1426.m2904(60), AbstractC1426.m2904(28)));
        return new C2715(linearLayout, textView2, textView3);
    }
}
