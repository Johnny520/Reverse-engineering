package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Wo */
/* JADX INFO: loaded from: classes.dex */
public final class C0976Wo extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0884Ui f3055a;

    /* JADX INFO: renamed from: b */
    public final ImageView f3056b;

    /* JADX INFO: renamed from: c */
    public final TextView f3057c;

    /* JADX INFO: renamed from: d */
    public final TextView f3058d;

    /* JADX INFO: renamed from: e */
    public final TextView f3059e;

    /* JADX INFO: renamed from: f */
    public final TextView f3060f;

    /* JADX INFO: renamed from: g */
    public final TextView f3061g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0976Wo(Context context, C0693Q4 c0693q4) {
        super(context);
        AbstractC0295Gu.m625r(-85753317029941L);
        this.f3055a = c0693q4;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getColor(R.color.cardBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), context.getColor(R.color.cardStroke));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48));
        layoutParams.setMarginEnd(AbstractC0295Gu.m616i(12));
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(context.getColor(R.color.iconBackground));
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(8));
        imageView.setBackground(gradientDrawable2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f3056b = imageView;
        linearLayout2.addView(imageView);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(context);
        textView.setTextSize(16.0f);
        textView.setTextColor(context.getColor(R.color.textTitle));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f3057c = textView;
        linearLayout3.addView(textView);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0295Gu.m616i(4);
        linearLayout4.setLayoutParams(layoutParams2);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(context.getColor(R.color.textSummary));
        this.f3058d = textView2;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        linearLayout4.addView(textView2, layoutParams3);
        TextView textView3 = new TextView(context);
        AbstractC0213Ey.m414l(-85375359907893L, textView3, 12.0f);
        textView3.setTextColor(context.getColor(R.color.textSecondary));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.setMarginStart(AbstractC0295Gu.m616i(6));
        layoutParams4.setMarginEnd(AbstractC0295Gu.m616i(6));
        layoutParams4.gravity = 16;
        textView3.setLayoutParams(layoutParams4);
        linearLayout4.addView(textView3);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(12.0f);
        textView4.setTextColor(context.getColor(R.color.textSummary));
        this.f3059e = textView4;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 16;
        linearLayout4.addView(textView4, layoutParams5);
        linearLayout3.addView(linearLayout4);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(12.0f);
        textView5.setTextColor(context.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = AbstractC0295Gu.m616i(8);
        textView5.setLayoutParams(layoutParams6);
        textView5.setMaxLines(2);
        textView5.setEllipsize(TextUtils.TruncateAt.END);
        this.f3060f = textView5;
        linearLayout3.addView(textView5);
        linearLayout2.addView(linearLayout3);
        TextView textView6 = new TextView(context);
        textView6.setTextSize(12.0f);
        textView6.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.setMarginStart(AbstractC0295Gu.m616i(16));
        layoutParams7.gravity = 16;
        textView6.setLayoutParams(layoutParams7);
        textView6.setGravity(17);
        this.f3061g = textView6;
        linearLayout2.addView(textView6);
        linearLayout.addView(linearLayout2);
        addView(linearLayout);
    }
}
