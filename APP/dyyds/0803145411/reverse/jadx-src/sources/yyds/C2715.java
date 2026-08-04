package yyds;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᲈᛸᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2715 extends AbstractC0185 {

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final TextView f13340;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final TextView f13341;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2715(LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(linearLayout);
        AbstractC2328.m4341(-180418264073070L);
        AbstractC2328.m4341(-180456918778734L);
        AbstractC2328.m4341(-180482688582510L);
        this.f13340 = textView;
        this.f13341 = textView2;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void m4822(boolean z) {
        GradientDrawable gradientDrawable;
        TextView textView = this.f13341;
        Context context = textView.getContext();
        textView.setText(AbstractC2328.m4341(z ? -180538523157358L : -180551408059246L));
        textView.setTextColor(z ? context.getColor(R.color.douyin_white) : context.getColor(R.color.secondary_text));
        if (z) {
            int color = context.getColor(R.color.douyin_primary);
            int iM2904 = AbstractC1426.m2904(16);
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(color);
            gradientDrawable.setCornerRadius(iM2904);
        } else {
            int color2 = context.getColor(R.color.surface_bg);
            int iM29042 = AbstractC1426.m2904(16);
            int color3 = context.getColor(R.color.divider_color);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(color2);
            gradientDrawable2.setCornerRadius(iM29042);
            gradientDrawable2.setStroke(1, color3);
            gradientDrawable = gradientDrawable2;
        }
        textView.setBackground(gradientDrawable);
    }
}
