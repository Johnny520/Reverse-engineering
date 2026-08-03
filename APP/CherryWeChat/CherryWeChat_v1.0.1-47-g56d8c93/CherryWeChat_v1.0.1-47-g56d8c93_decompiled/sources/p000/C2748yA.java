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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2748yA(Context context) {
        super(context, null, 0);
        AbstractC0295Gu.m625r(-493203979499573L);
        setMinimumHeight(AbstractC0295Gu.m616i(50));
        TextView textView = new TextView(context);
        textView.setTextSize(14.0f);
        this.f9377b = textView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        addView(textView, layoutParams);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_arrow_right);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(context.getColor(R.color.textSummary));
        this.f9380e = imageView;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        layoutParams2.gravity = 8388629;
        addView(imageView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388627;
        layoutParams3.rightMargin = AbstractC0295Gu.m616i(50);
        linearLayout.setLayoutParams(layoutParams3);
        addView(linearLayout);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(16.0f);
        textView2.setTextColor(context.getColor(R.color.textTitle));
        this.f9378c = textView2;
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setTextSize(14.0f);
        textView3.setVisibility(8);
        textView3.setTextColor(context.getColor(R.color.textSummary));
        this.f9379d = textView3;
        linearLayout.addView(textView3);
    }

    /* JADX INFO: renamed from: a */
    public final void m5330a() {
        ImageView imageView = this.f9380e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final String getKey() {
        return this.f9376a;
    }

    public final void setKey(String str) {
        AbstractC0295Gu.m625r(-493238339237941L);
        this.f9376a = str;
    }

    public final void setSummary(String str) {
        AbstractC0295Gu.m625r(-493281288910901L);
        TextView textView = this.f9379d;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setTitle(String str) {
        AbstractC0295Gu.m625r(-493255519107125L);
        TextView textView = this.f9378c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setValue(String str) {
        AbstractC0295Gu.m625r(-493315648649269L);
        TextView textView = this.f9377b;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
