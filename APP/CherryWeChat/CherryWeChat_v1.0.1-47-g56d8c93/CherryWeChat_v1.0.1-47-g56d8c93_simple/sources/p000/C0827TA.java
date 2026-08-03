package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: TA */
/* JADX INFO: loaded from: classes.dex */
public final class C0827TA extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final ImageView f2605a;

    /* JADX INFO: renamed from: b */
    public final TextView f2606b;

    /* JADX INFO: renamed from: c */
    public final TextView f2607c;

    /* JADX INFO: renamed from: d */
    public final TextView f2608d;

    public C0827TA(Context r10) {
        AbstractC0295Gu.m625r(-488707148740661L);
        super(r10);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable r1 = new GradientDrawable();
        r1.setColor(r10.getColor(R.color.cardBackground));
        r1.setCornerRadius(AbstractC0295Gu.m616i(16));
        r1.setStroke(AbstractC0295Gu.m616i(1), r10.getColor(R.color.cardStroke));
        setBackground(r1);
        setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12));
        ImageView r5 = new ImageView(r10);
        r5.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(160)));
        r5.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r5.setClipToOutline(true);
        GradientDrawable r6 = new GradientDrawable();
        r6.setCornerRadius(AbstractC0295Gu.m616i(12));
        r5.setBackground(r6);
        this.f2605a = r5;
        addView(r5);
        LinearLayout r12 = new LinearLayout(r10);
        r12.setOrientation(0);
        r12.setGravity(16);
        LinearLayout.LayoutParams r4 = new LinearLayout.LayoutParams(-1, -2);
        r4.topMargin = AbstractC0295Gu.m616i(10);
        r12.setLayoutParams(r4);
        LinearLayout r2 = new LinearLayout(r10);
        r2.setOrientation(1);
        r2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r0 = new TextView(r10);
        r0.setTextSize(16.0f);
        r0.setTypeface(Typeface.DEFAULT_BOLD);
        r0.setTextColor(r10.getColor(R.color.textTitle));
        this.f2606b = r0;
        r2.addView(r0);
        TextView r02 = new TextView(r10);
        r02.setTextSize(13.0f);
        r02.setTextColor(r10.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r52 = new LinearLayout.LayoutParams(-2, -2);
        r52.topMargin = AbstractC0295Gu.m616i(4);
        r02.setLayoutParams(r52);
        this.f2607c = r02;
        r2.addView(r02);
        r12.addView(r2);
        TextView r03 = new TextView(r10);
        r03.setTextSize(14.0f);
        r03.setTextColor(r10.getColor(R.color.textTitle));
        this.f2608d = r03;
        r12.addView(r03);
        addView(r12);
    }
}
