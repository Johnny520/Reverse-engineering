package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: xg */
/* JADX INFO: loaded from: classes.dex */
public final class C2717xg extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final C0701QC f9295a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2717xg(Context context, C0701QC c0701qc) {
        super(context);
        AbstractC0295Gu.m625r(-101971113539637L);
        AbstractC0295Gu.m625r(-100356205836341L);
        this.f9295a = c0701qc;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{-1509912, -984592});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), -2824492);
        setBackground(gradientDrawable);
        setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16));
        setGravity(16);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(40));
        layoutParams.setMarginEnd(AbstractC0295Gu.m616i(16));
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.ic_code);
        imageView.setColorFilter(-11751600);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(imageView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(context);
        AbstractC0213Ey.m414l(-100403450476597L, textView, 16.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(-13730510);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText(AbstractC0295Gu.m625r(-100424925313077L));
        textView2.setTextSize(12.0f);
        textView2.setTextColor(-13070788);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0295Gu.m616i(4);
        textView2.setLayoutParams(layoutParams2);
        linearLayout.addView(textView2);
        addView(linearLayout);
        TextView textView3 = new TextView(context);
        textView3.setText(AbstractC0295Gu.m625r(-100476464920629L));
        textView3.setTextSize(14.0f);
        textView3.setGravity(17);
        textView3.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        textView3.setTextColor(context.getColor(android.R.color.white));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(20));
        gradientDrawable2.setColor(-11751600);
        textView3.setBackground(gradientDrawable2);
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(textView3);
        final int i = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: wg

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2717xg f9235b;

            {
                this.f9235b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f9235b.f9295a.m1434h();
                        break;
                    default:
                        this.f9235b.f9295a.m1434h();
                        break;
                }
            }
        });
        final int i2 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: wg

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C2717xg f9235b;

            {
                this.f9235b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f9235b.f9295a.m1434h();
                        break;
                    default:
                        this.f9235b.f9295a.m1434h();
                        break;
                }
            }
        });
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(541896528);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(16));
        setForeground(new RippleDrawable(colorStateListValueOf, null, gradientDrawable3));
        setClickable(true);
        setFocusable(true);
    }
}
