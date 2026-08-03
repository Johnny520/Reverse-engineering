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

/* JADX INFO: renamed from: hk */
/* JADX INFO: loaded from: classes.dex */
public final class C1505hk extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f5336g = 0;

    /* JADX INFO: renamed from: a */
    public final ImageView f5337a;

    /* JADX INFO: renamed from: b */
    public final TextView f5338b;

    /* JADX INFO: renamed from: c */
    public final TextView f5339c;

    /* JADX INFO: renamed from: d */
    public final TextView f5340d;

    /* JADX INFO: renamed from: e */
    public final TextView f5341e;

    /* JADX INFO: renamed from: f */
    public final TextView f5342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1505hk(Context context) {
        super(context);
        AbstractC0295Gu.m625r(-71816148154421L);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getColor(R.color.cardBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), context.getColor(R.color.cardStroke));
        setBackground(gradientDrawable);
        setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(120)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(8));
        gradientDrawable2.setColor(context.getColor(R.color.iconBackground));
        imageView.setBackground(gradientDrawable2);
        this.f5337a = imageView;
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(0, AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), 0);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(10.0f);
        textView.setPadding(AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(8));
        textView.setBackground(gradientDrawable3);
        textView.setVisibility(8);
        this.f5340d = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0295Gu.m616i(8);
        textView2.setLayoutParams(layoutParams2);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setTextColor(context.getColor(R.color.textTitle));
        textView2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f5338b = textView2;
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = AbstractC0295Gu.m616i(2);
        textView3.setLayoutParams(layoutParams3);
        textView3.setTextSize(12.0f);
        textView3.setTextColor(context.getColor(R.color.textSummary));
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        this.f5339c = textView3;
        linearLayout.addView(textView3);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = AbstractC0295Gu.m616i(8);
        linearLayout2.setLayoutParams(layoutParams4);
        linearLayout2.setGravity(16);
        TextView textView4 = new TextView(context);
        textView4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        textView4.setTextSize(12.0f);
        textView4.setTextColor(context.getColor(R.color.textTitle));
        this.f5342f = textView4;
        linearLayout2.addView(textView4);
        TextView textView5 = new TextView(context);
        textView5.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(60), -2));
        textView5.setTextSize(12.0f);
        textView5.setGravity(17);
        textView5.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6));
        textView5.setMinWidth(AbstractC0295Gu.m616i(60));
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setCornerRadius(AbstractC0295Gu.m616i(12));
        textView5.setBackground(gradientDrawable4);
        this.f5341e = textView5;
        linearLayout2.addView(textView5);
        linearLayout.addView(linearLayout2);
        addView(linearLayout);
    }

    /* JADX INFO: renamed from: a */
    public static final void m2880a(C1505hk c1505hk, C0185EC c0185ec) {
        c1505hk.getClass();
        C0357IC c0357ic = C0357IC.f1218a;
        String str = c0185ec.f549a;
        EnumC0099CC enumC0099CC = EnumC0099CC.f234b;
        c0357ic.getClass();
        C0357IC.m794f(str, enumC0099CC);
        TextView textView = c1505hk.f5341e;
        textView.setText(AbstractC0295Gu.m625r(-71287867177013L));
        textView.setEnabled(true);
    }

    /* JADX INFO: renamed from: b */
    public final void m2881b(C0185EC c0185ec) {
        if (c0185ec.f568t) {
            AbstractC0213Ey.m413k(-71300752078901L, getContext(), 0);
            return;
        }
        C0183EA c0183ea = C0183EA.f539a;
        String str = c0185ec.f549a;
        c0183ea.getClass();
        if (!C0183EA.m379g(str)) {
            AbstractC0213Ey.m413k(-71335111817269L, getContext(), 0);
            return;
        }
        Context context = getContext();
        AbstractC0295Gu.m625r(-71365176588341L);
        C1456gf.m2801S(context, AbstractC0295Gu.m625r(-71433896065077L), AbstractC0295Gu.m625r(-71455370901557L) + c0185ec.f551c + AbstractC0295Gu.m625r(-70939974826037L), new DialogInterfaceOnClickListenerC1330dk(c0185ec, this), false);
    }
}
