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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0827TA(Context context) {
        super(context);
        AbstractC0295Gu.m625r(-488707148740661L);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getColor(R.color.cardBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), context.getColor(R.color.cardStroke));
        setBackground(gradientDrawable);
        setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12));
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(160)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setClipToOutline(true);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(12));
        imageView.setBackground(gradientDrawable2);
        this.f2605a = imageView;
        addView(imageView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = AbstractC0295Gu.m616i(10);
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(context);
        textView.setTextSize(16.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(context.getColor(R.color.textTitle));
        this.f2606b = textView;
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(13.0f);
        textView2.setTextColor(context.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = AbstractC0295Gu.m616i(4);
        textView2.setLayoutParams(layoutParams2);
        this.f2607c = textView2;
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(context);
        textView3.setTextSize(14.0f);
        textView3.setTextColor(context.getColor(R.color.textTitle));
        this.f2608d = textView3;
        linearLayout.addView(textView3);
        addView(linearLayout);
    }
}
