package p000;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: yA */
/* JADX INFO: loaded from: classes.dex */
public final class C2748yA extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public String f9376a;

    /* JADX INFO: renamed from: b */
    public final TextView f9377b;

    /* JADX INFO: renamed from: c */
    public final TextView f9378c;

    /* JADX INFO: renamed from: d */
    public final TextView f9379d;

    /* JADX INFO: renamed from: e */
    public final ImageView f9380e;

    public C2748yA(Context r11) {
        AbstractC0295Gu.m625r(-493203979499573L);
        super(r11, null, 0);
        setMinimumHeight(AbstractC0295Gu.m616i(50));
        TextView r1 = new TextView(r11);
        r1.setTextSize(14.0f);
        this.f9377b = r1;
        FrameLayout.LayoutParams r3 = new FrameLayout.LayoutParams(-2, -2);
        r3.gravity = 8388629;
        addView(r1, r3);
        ImageView r12 = new ImageView(r11);
        r12.setImageResource(R.drawable.ic_arrow_right);
        r12.setVisibility(8);
        r12.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r12.setColorFilter(r11.getColor(R.color.textSummary));
        this.f9380e = r12;
        FrameLayout.LayoutParams r7 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        r7.gravity = 8388629;
        addView(r12, r7);
        LinearLayout r13 = new LinearLayout(r11);
        r13.setOrientation(1);
        FrameLayout.LayoutParams r5 = new FrameLayout.LayoutParams(-2, -2);
        r5.gravity = 8388627;
        r5.rightMargin = AbstractC0295Gu.m616i(50);
        r13.setLayoutParams(r5);
        addView(r13);
        TextView r0 = new TextView(r11);
        r0.setTextSize(16.0f);
        r0.setTextColor(r11.getColor(R.color.textTitle));
        this.f9378c = r0;
        r13.addView(r0);
        TextView r02 = new TextView(r11);
        r02.setTextSize(14.0f);
        r02.setVisibility(8);
        r02.setTextColor(r11.getColor(R.color.textSummary));
        this.f9379d = r02;
        r13.addView(r02);
    }

    /* JADX INFO: renamed from: a */
    public final void m5330a() {
        ImageView r0 = this.f9380e;
        if (r0 == null) goto L6;
        r0.setVisibility(0);
        return;
    }

    public final String getKey() {
        return this.f9376a;
    }

    public final void setKey(String r3) {
        AbstractC0295Gu.m625r(-493238339237941L);
        this.f9376a = r3;
    }

    public final void setSummary(String r3) {
        AbstractC0295Gu.m625r(-493281288910901L);
        TextView r0 = this.f9379d;
        if (r0 == null) goto L5;
        r0.setVisibility(0);
    L5:
        if (r0 == null) goto L8;
        r0.setText(r3);
        return;
    }

    public final void setTitle(String r3) {
        AbstractC0295Gu.m625r(-493255519107125L);
        TextView r0 = this.f9378c;
        if (r0 == null) goto L6;
        r0.setText(r3);
        return;
    }

    public final void setValue(String r3) {
        AbstractC0295Gu.m625r(-493315648649269L);
        TextView r0 = this.f9377b;
        if (r0 == null) goto L6;
        r0.setText(r3);
        return;
    }
}
