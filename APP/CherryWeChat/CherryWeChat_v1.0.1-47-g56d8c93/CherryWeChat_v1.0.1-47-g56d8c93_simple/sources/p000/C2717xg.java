package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: xg */
/* JADX INFO: loaded from: classes.dex */
public final class C2717xg extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final C0701QC f9295a;

    public C2717xg(Context r11, C0701QC r12) {
        AbstractC0295Gu.m625r(-101971113539637L);
        AbstractC0295Gu.m625r(-100356205836341L);
        super(r11);
        this.f9295a = r12;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable r0 = new GradientDrawable();
        r0.setColors(new int[]{-1509912, -984592});
        r0.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        r0.setCornerRadius(AbstractC0295Gu.m616i(16));
        r0.setStroke(AbstractC0295Gu.m616i(1), -2824492);
        setBackground(r0);
        setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16));
        setGravity(16);
        ImageView r3 = new ImageView(r11);
        LinearLayout.LayoutParams r6 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(40));
        r6.setMarginEnd(AbstractC0295Gu.m616i(16));
        r3.setLayoutParams(r6);
        r3.setImageResource(R.drawable.ic_code);
        r3.setColorFilter(-11751600);
        r3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(r3);
        LinearLayout r32 = new LinearLayout(r11);
        r32.setOrientation(1);
        r32.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r122 = new TextView(r11);
        AbstractC0213Ey.m414l(-100403450476597L, r122, 16.0f);
        r122.setTypeface(Typeface.DEFAULT_BOLD);
        r122.setTextColor(-13730510);
        r32.addView(r122);
        TextView r123 = new TextView(r11);
        r123.setText(AbstractC0295Gu.m625r(-100424925313077L));
        r123.setTextSize(12.0f);
        r123.setTextColor(-13070788);
        LinearLayout.LayoutParams r7 = new LinearLayout.LayoutParams(-1, -2);
        r7.topMargin = AbstractC0295Gu.m616i(4);
        r123.setLayoutParams(r7);
        r32.addView(r123);
        addView(r32);
        TextView r124 = new TextView(r11);
        r124.setText(AbstractC0295Gu.m625r(-100476464920629L));
        r124.setTextSize(14.0f);
        r124.setGravity(17);
        r124.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r124.setTextColor(r11.getColor(android.R.color.white));
        GradientDrawable r112 = new GradientDrawable();
        r112.setCornerRadius(AbstractC0295Gu.m616i(20));
        r112.setColor(-11751600);
        r124.setBackground(r112);
        r124.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(r124);
        final int r02 = 0;
        setOnClickListener(new ViewOnClickListenerC2674wg(this, r02));
        final int r03 = 1;
        r124.setOnClickListener(new ViewOnClickListenerC2674wg(this, r03));
        ColorStateList r113 = ColorStateList.valueOf(541896528);
        GradientDrawable r125 = new GradientDrawable();
        r125.setCornerRadius(AbstractC0295Gu.m616i(16));
        setForeground(new RippleDrawable(r113, null, r125));
        setClickable(true);
        setFocusable(true);
    }
}
