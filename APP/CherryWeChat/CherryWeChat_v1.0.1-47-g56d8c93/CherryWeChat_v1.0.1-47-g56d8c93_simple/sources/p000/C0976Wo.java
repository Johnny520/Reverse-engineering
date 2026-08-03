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

    public C0976Wo(Context r17, C0693Q4 r18) {
        AbstractC0295Gu.m625r(-85753317029941L);
        super(r17);
        this.f3055a = r18;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LinearLayout r2 = new LinearLayout(r17);
        r2.setOrientation(1);
        r2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        GradientDrawable r6 = new GradientDrawable();
        r6.setColor(r17.getColor(R.color.cardBackground));
        r6.setCornerRadius(AbstractC0295Gu.m616i(16));
        r6.setStroke(AbstractC0295Gu.m616i(1), r17.getColor(R.color.cardStroke));
        r2.setBackground(r6);
        r2.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        LinearLayout r62 = new LinearLayout(r17);
        r62.setOrientation(0);
        r62.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ImageView r10 = new ImageView(r17);
        LinearLayout.LayoutParams r11 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48));
        r11.setMarginEnd(AbstractC0295Gu.m616i(12));
        r11.gravity = 16;
        r10.setLayoutParams(r11);
        GradientDrawable r112 = new GradientDrawable();
        r112.setColor(r17.getColor(R.color.iconBackground));
        r112.setCornerRadius(AbstractC0295Gu.m616i(8));
        r10.setBackground(r112);
        r10.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f3056b = r10;
        r62.addView(r10);
        LinearLayout r102 = new LinearLayout(r17);
        r102.setOrientation(1);
        r102.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r5 = new TextView(r17);
        r5.setTextSize(16.0f);
        r5.setTextColor(r17.getColor(R.color.textTitle));
        r5.setTypeface(Typeface.DEFAULT_BOLD);
        r5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f3057c = r5;
        r102.addView(r5);
        LinearLayout r52 = new LinearLayout(r17);
        r52.setOrientation(0);
        LinearLayout.LayoutParams r9 = new LinearLayout.LayoutParams(-1, -2);
        r9.topMargin = AbstractC0295Gu.m616i(4);
        r52.setLayoutParams(r9);
        TextView r92 = new TextView(r17);
        r92.setTextSize(12.0f);
        r92.setTextColor(r17.getColor(R.color.textSummary));
        this.f3058d = r92;
        LinearLayout.LayoutParams r14 = new LinearLayout.LayoutParams(-2, -2);
        r14.gravity = 16;
        r52.addView(r92, r14);
        TextView r93 = new TextView(r17);
        AbstractC0213Ey.m414l(-85375359907893L, r93, 12.0f);
        r93.setTextColor(r17.getColor(R.color.textSecondary));
        LinearLayout.LayoutParams r142 = new LinearLayout.LayoutParams(-2, -2);
        r142.setMarginStart(AbstractC0295Gu.m616i(6));
        r142.setMarginEnd(AbstractC0295Gu.m616i(6));
        r142.gravity = 16;
        r93.setLayoutParams(r142);
        r52.addView(r93);
        TextView r3 = new TextView(r17);
        r3.setTextSize(12.0f);
        r3.setTextColor(r17.getColor(R.color.textSummary));
        this.f3059e = r3;
        LinearLayout.LayoutParams r94 = new LinearLayout.LayoutParams(-2, -2);
        r94.gravity = 16;
        r52.addView(r3, r94);
        r102.addView(r52);
        TextView r32 = new TextView(r17);
        r32.setTextSize(12.0f);
        r32.setTextColor(r17.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r53 = new LinearLayout.LayoutParams(-1, -2);
        r53.topMargin = AbstractC0295Gu.m616i(8);
        r32.setLayoutParams(r53);
        r32.setMaxLines(2);
        r32.setEllipsize(TextUtils.TruncateAt.END);
        this.f3060f = r32;
        r102.addView(r32);
        r62.addView(r102);
        TextView r33 = new TextView(r17);
        r33.setTextSize(12.0f);
        r33.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        LinearLayout.LayoutParams r1 = new LinearLayout.LayoutParams(-2, -2);
        r1.setMarginStart(AbstractC0295Gu.m616i(16));
        r1.gravity = 16;
        r33.setLayoutParams(r1);
        r33.setGravity(17);
        this.f3061g = r33;
        r62.addView(r33);
        r2.addView(r62);
        addView(r2);
    }
}
