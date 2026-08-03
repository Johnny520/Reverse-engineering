package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Ko */
/* JADX INFO: loaded from: classes.dex */
public final class C0461Ko extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC0418Jo f1501a;

    /* JADX INFO: renamed from: b */
    public final ImageView f1502b;

    /* JADX INFO: renamed from: c */
    public final TextView f1503c;

    /* JADX INFO: renamed from: d */
    public final TextView f1504d;

    /* JADX INFO: renamed from: e */
    public final TextView f1505e;

    /* JADX INFO: renamed from: f */
    public final TextView f1506f;

    /* JADX INFO: renamed from: g */
    public final TextView f1507g;

    /* JADX INFO: renamed from: h */
    public final TextView f1508h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461Ko(Context context) {
        super(context);
        AbstractC0295Gu.m625r(-71193377896501L);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getColor(R.color.cardBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), context.getColor(R.color.cardStroke));
        setBackground(gradientDrawable);
        setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        setGravity(16);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48));
        layoutParams.setMarginEnd(AbstractC0295Gu.m616i(12));
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(8));
        gradientDrawable2.setColor(context.getColor(R.color.iconBackground));
        imageView.setBackground(gradientDrawable2);
        this.f1502b = imageView;
        addView(imageView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(context);
        textView.setTextSize(16.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(context.getColor(R.color.textTitle));
        this.f1503c = textView;
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0295Gu.m616i(4);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setGravity(16);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(context.getColor(R.color.textSummary));
        this.f1504d = textView2;
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setTextSize(12.0f);
        textView3.setTextColor(context.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(AbstractC0295Gu.m616i(12));
        textView3.setLayoutParams(layoutParams3);
        this.f1506f = textView3;
        linearLayout2.addView(textView3);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.setMarginStart(AbstractC0295Gu.m616i(12));
        textView4.setLayoutParams(layoutParams4);
        this.f1507g = textView4;
        linearLayout2.addView(textView4);
        linearLayout.addView(linearLayout2);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(12.0f);
        textView5.setTextColor(context.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = AbstractC0295Gu.m616i(4);
        textView5.setLayoutParams(layoutParams5);
        textView5.setMaxLines(2);
        textView5.setEllipsize(TextUtils.TruncateAt.END);
        this.f1505e = textView5;
        linearLayout.addView(textView5);
        addView(linearLayout);
        TextView textView6 = new TextView(context);
        textView6.setTextSize(12.0f);
        textView6.setGravity(17);
        textView6.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMarginStart(AbstractC0295Gu.m616i(12));
        textView6.setLayoutParams(layoutParams6);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(16));
        textView6.setBackground(gradientDrawable3);
        this.f1508h = textView6;
        addView(textView6);
    }

    /* JADX INFO: renamed from: a */
    public final void m909a(C0185EC c0185ec) {
        if (c0185ec.f568t) {
            AbstractC0213Ey.m413k(-86461986633781L, getContext(), 0);
            return;
        }
        C0183EA c0183ea = C0183EA.f539a;
        String str = c0185ec.f549a;
        c0183ea.getClass();
        if (!C0183EA.m379g(str)) {
            AbstractC0213Ey.m413k(-86496346372149L, getContext(), 0);
            return;
        }
        Context context = getContext();
        AbstractC0295Gu.m625r(-86526411143221L);
        C1456gf.m2801S(context, AbstractC0295Gu.m625r(-84945863178293L), AbstractC0295Gu.m625r(-84967338014773L) + c0185ec.f551c + AbstractC0295Gu.m625r(-85001697753141L), new DialogInterfaceOnClickListenerC0375Io(1, this, c0185ec), false);
    }

    /* JADX INFO: renamed from: b */
    public final void m910b(final C0185EC c0185ec, boolean z) {
        AbstractC0295Gu.m625r(-85804856637493L);
        AbstractC0295Gu.m625r(-85877871081525L);
        String str = c0185ec.f549a;
        AbstractC0295Gu.m625r(-86036784871477L);
        View view = this.f1508h;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof LinearLayout ? (LinearLayout) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(AbstractC0295Gu.m616i(12));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(16);
        if (z) {
            TextView textView = new TextView(getContext());
            textView.setText(AbstractC0295Gu.m625r(-86663850096693L));
            textView.setTextSize(12.0f);
            textView.setGravity(17);
            textView.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
            textView.setTextColor(textView.getContext().getColor(R.color.buttonTextSecondary));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
            gradientDrawable.setColor(textView.getContext().getColor(R.color.buttonSecondary));
            gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), textView.getContext().getColor(R.color.cardStroke));
            textView.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2);
            layoutParams2.setMarginEnd(AbstractC0295Gu.m616i(8));
            textView.setLayoutParams(layoutParams2);
            textView.setMinWidth(AbstractC0295Gu.m616i(72));
            linearLayout.addView(textView);
            TextView textView2 = new TextView(getContext());
            textView2.setText(AbstractC0295Gu.m625r(-86681029965877L));
            textView2.setTextSize(12.0f);
            textView2.setGravity(17);
            textView2.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
            textView2.setTextColor(textView2.getContext().getColor(R.color.buttonTextPrimary));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(16));
            gradientDrawable2.setColor(textView2.getContext().getColor(R.color.buttonPrimary));
            textView2.setBackground(gradientDrawable2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2);
            layoutParams3.setMarginEnd(AbstractC0295Gu.m616i(8));
            textView2.setLayoutParams(layoutParams3);
            textView2.setMinWidth(AbstractC0295Gu.m616i(72));
            final int i = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: Ho
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            this.m909a(c0185ec);
                            break;
                        case 1:
                            this.m911c(c0185ec);
                            break;
                        case 2:
                            this.m909a(c0185ec);
                            break;
                        default:
                            this.m911c(c0185ec);
                            break;
                    }
                }
            });
            linearLayout.addView(textView2);
            if (!AbstractC0585Nj.m1134a(str, AbstractC0295Gu.m625r(-86702504802357L))) {
                TextView textView3 = new TextView(getContext());
                textView3.setText(AbstractC0295Gu.m625r(-86711094736949L));
                textView3.setTextSize(12.0f);
                textView3.setGravity(17);
                textView3.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
                textView3.setTextColor(textView3.getContext().getColor(android.R.color.white));
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(16));
                gradientDrawable3.setColor(textView3.getContext().getColor(android.R.color.holo_red_light));
                textView3.setBackground(gradientDrawable3);
                textView3.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2));
                textView3.setMinWidth(AbstractC0295Gu.m616i(72));
                final int i2 = 1;
                textView3.setOnClickListener(new View.OnClickListener() { // from class: Ho
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i2) {
                            case 0:
                                this.m909a(c0185ec);
                                break;
                            case 1:
                                this.m911c(c0185ec);
                                break;
                            case 2:
                                this.m909a(c0185ec);
                                break;
                            default:
                                this.m911c(c0185ec);
                                break;
                        }
                    }
                });
                linearLayout.addView(textView3);
            }
        } else {
            TextView textView4 = new TextView(getContext());
            textView4.setText(AbstractC0295Gu.m625r(-86723979638837L));
            textView4.setTextSize(12.0f);
            textView4.setGravity(17);
            textView4.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
            textView4.setTextColor(textView4.getContext().getColor(R.color.buttonTextPrimary));
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setCornerRadius(AbstractC0295Gu.m616i(16));
            gradientDrawable4.setColor(textView4.getContext().getColor(R.color.buttonPrimary));
            textView4.setBackground(gradientDrawable4);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2);
            layoutParams4.setMarginEnd(AbstractC0295Gu.m616i(8));
            textView4.setLayoutParams(layoutParams4);
            textView4.setMinWidth(AbstractC0295Gu.m616i(72));
            final int i3 = 2;
            textView4.setOnClickListener(new View.OnClickListener() { // from class: Ho
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i3) {
                        case 0:
                            this.m909a(c0185ec);
                            break;
                        case 1:
                            this.m911c(c0185ec);
                            break;
                        case 2:
                            this.m909a(c0185ec);
                            break;
                        default:
                            this.m911c(c0185ec);
                            break;
                    }
                }
            });
            linearLayout.addView(textView4);
            if (!AbstractC0585Nj.m1134a(str, AbstractC0295Gu.m625r(-86736864540725L))) {
                TextView textView5 = new TextView(getContext());
                textView5.setText(AbstractC0295Gu.m625r(-86745454475317L));
                textView5.setTextSize(12.0f);
                textView5.setGravity(17);
                textView5.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
                textView5.setTextColor(textView5.getContext().getColor(android.R.color.white));
                GradientDrawable gradientDrawable5 = new GradientDrawable();
                gradientDrawable5.setCornerRadius(AbstractC0295Gu.m616i(16));
                gradientDrawable5.setColor(textView5.getContext().getColor(android.R.color.holo_red_light));
                textView5.setBackground(gradientDrawable5);
                textView5.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2));
                textView5.setMinWidth(AbstractC0295Gu.m616i(72));
                final int i4 = 3;
                textView5.setOnClickListener(new View.OnClickListener() { // from class: Ho
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i4) {
                            case 0:
                                this.m909a(c0185ec);
                                break;
                            case 1:
                                this.m911c(c0185ec);
                                break;
                            case 2:
                                this.m909a(c0185ec);
                                break;
                            default:
                                this.m911c(c0185ec);
                                break;
                        }
                    }
                });
                linearLayout.addView(textView5);
            }
        }
        if (viewGroup != null) {
            viewGroup.addView(linearLayout);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m911c(C0185EC c0185ec) {
        if (c0185ec.f568t) {
            AbstractC0213Ey.m413k(-86758339377205L, getContext(), 0);
            return;
        }
        Context context = getContext();
        AbstractC0295Gu.m625r(-86809878984757L);
        C1456gf.m2801S(context, AbstractC0295Gu.m625r(-86328842647605L), AbstractC0295Gu.m625r(-86358907418677L) + c0185ec.f551c + AbstractC0295Gu.m625r(-86406152058933L), new DialogInterfaceOnClickListenerC0375Io(0, this, c0185ec), false);
    }

    public final InterfaceC0418Jo getOnThemeActionListener() {
        return this.f1501a;
    }

    public final void setOnThemeActionListener(InterfaceC0418Jo interfaceC0418Jo) {
        this.f1501a = interfaceC0418Jo;
    }
}
