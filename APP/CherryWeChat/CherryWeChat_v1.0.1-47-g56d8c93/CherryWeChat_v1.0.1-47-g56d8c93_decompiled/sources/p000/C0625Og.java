package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import io.github.cherrywechat.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Og */
/* JADX INFO: loaded from: classes.dex */
public final class C0625Og extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f1988k = 0;

    /* JADX INFO: renamed from: a */
    public final C1258ca f1989a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f1990b;

    /* JADX INFO: renamed from: c */
    public final ImageView f1991c;

    /* JADX INFO: renamed from: d */
    public final TextView f1992d;

    /* JADX INFO: renamed from: e */
    public final TextView f1993e;

    /* JADX INFO: renamed from: f */
    public final TextView f1994f;

    /* JADX INFO: renamed from: g */
    public final ImageView f1995g;

    /* JADX INFO: renamed from: h */
    public final LinearLayout f1996h;

    /* JADX INFO: renamed from: i */
    public final TextView f1997i;

    /* JADX INFO: renamed from: j */
    public C0185EC f1998j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0625Og(Context context, C1258ca c1258ca) {
        super(context);
        AbstractC0295Gu.m625r(-99694780872757L);
        AbstractC0295Gu.m625r(-99729140611125L);
        this.f1989a = c1258ca;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getColor(R.color.cardBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), context.getColor(R.color.cardStroke));
        setBackground(gradientDrawable);
        setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(16);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(context.getColor(R.color.colorPrimary) & 268435455);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(12));
        linearLayout.setBackground(new RippleDrawable(colorStateListValueOf, null, gradientDrawable2));
        linearLayout.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
        linearLayout.setClickable(true);
        linearLayout.setFocusable(true);
        this.f1990b = linearLayout;
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48));
        layoutParams.setMarginEnd(AbstractC0295Gu.m616i(12));
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(8));
        gradientDrawable3.setColor(context.getColor(R.color.iconBackground));
        imageView.setBackground(gradientDrawable3);
        this.f1991c = imageView;
        linearLayout.addView(imageView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.setGravity(16);
        TextView textView = new TextView(context);
        textView.setTextSize(16.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(context.getColor(R.color.textTitle));
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f1992d = textView;
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(12.0f);
        textView2.setPadding(AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2));
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setCornerRadius(AbstractC0295Gu.m616i(8));
        textView2.setBackground(gradientDrawable4);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        TextView textView3 = new TextView(context);
        textView3.setTextSize(12.0f);
        textView3.setTextColor(context.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0295Gu.m616i(4);
        textView3.setLayoutParams(layoutParams2);
        this.f1993e = textView3;
        linearLayout2.addView(textView3);
        linearLayout.addView(linearLayout2);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(12.0f);
        textView4.setGravity(17);
        textView4.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(AbstractC0295Gu.m616i(8));
        textView4.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setCornerRadius(AbstractC0295Gu.m616i(16));
        textView4.setBackground(gradientDrawable5);
        textView4.setClickable(true);
        textView4.setFocusable(true);
        this.f1994f = textView4;
        linearLayout.addView(textView4);
        ImageView imageView2 = new ImageView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        layoutParams4.setMarginStart(AbstractC0295Gu.m616i(8));
        imageView2.setLayoutParams(layoutParams4);
        imageView2.setImageResource(R.drawable.ic_expand);
        imageView2.setColorFilter(context.getColor(R.color.textSecondary));
        imageView2.setFocusable(true);
        this.f1995g = imageView2;
        linearLayout.addView(imageView2);
        addView(linearLayout);
        TextView textView5 = new TextView(context);
        textView5.setTextSize(14.0f);
        textView5.setTextColor(context.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = AbstractC0295Gu.m616i(8);
        textView5.setLayoutParams(layoutParams5);
        textView5.setVisibility(8);
        this.f1997i = textView5;
        addView(textView5);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = AbstractC0295Gu.m616i(8);
        linearLayout4.setLayoutParams(layoutParams6);
        linearLayout4.setVisibility(8);
        this.f1996h = linearLayout4;
        addView(linearLayout4);
    }

    /* JADX INFO: renamed from: a */
    public final void m1215a(String str) {
        C0183EA.f539a.getClass();
        if (!C0183EA.m379g(str)) {
            AbstractC0213Ey.m413k(-97624606636085L, getContext(), 0);
            return;
        }
        try {
            C0183EA.m383k(str);
            Toast.makeText(getContext(), AbstractC0295Gu.m625r(-97654671407157L), 0).show();
            AbstractC1208bA.m2329b(new RunnableC0562N2(11, this), 100L);
        } catch (Exception e) {
            Toast.makeText(getContext(), AbstractC0213Ey.m405c(-97684736178229L, new StringBuilder(), e), 0).show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r24v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r24v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v40, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v20, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v21, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX INFO: renamed from: b */
    public final void m1216b(C0185EC c0185ec) {
        Integer num;
        int i;
        ?? r9;
        Integer num2;
        File file;
        boolean z;
        ?? r24;
        C0625Og c0625Og = this;
        C0185EC c0185ec2 = c0185ec;
        String str = c0185ec2.f549a;
        Integer num3 = 6;
        Integer num4 = 1;
        ?? r13 = c0625Og.f1996h;
        r13.removeAllViews();
        String str2 = c0185ec2.f564p;
        List list = c0185ec2.f558j;
        if (str2.length() > 0) {
            ?? linearLayout = new LinearLayout(c0625Og.getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = AbstractC0295Gu.m616i(8);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setGravity(16);
            linearLayout.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(8));
            gradientDrawable.setColor(linearLayout.getContext().getColor(R.color.iconBackground));
            linearLayout.setBackground(gradientDrawable);
            LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
            linearLayout2.setOrientation(1);
            num = 60;
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView = new TextView(linearLayout2.getContext());
            textView.setText(AbstractC0295Gu.m625r(-97173635070005L));
            textView.setTextSize(14.0f);
            textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
            linearLayout2.addView(textView);
            linearLayout.addView(linearLayout2);
            TextView textView2 = new TextView(linearLayout.getContext());
            textView2.setText(AbstractC0295Gu.m625r(-97207994808373L));
            textView2.setTextSize(12.0f);
            textView2.setTextColor(textView2.getContext().getColor(R.color.buttonTextPrimary));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(8));
            gradientDrawable2.setColor(textView2.getContext().getColor(R.color.buttonPrimary));
            textView2.setBackground(gradientDrawable2);
            textView2.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num3), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num3));
            textView2.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(60), -2));
            textView2.setMinWidth(AbstractC0295Gu.m616i(60));
            textView2.setGravity(17);
            textView2.setOnClickListener(new ViewOnClickListenerC2176l5(8, textView2, c0185ec2));
            linearLayout.addView(textView2);
            r13.addView(linearLayout);
        } else {
            num = 60;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0140DA c0140da = (C0140DA) it.next();
            ?? linearLayout3 = new LinearLayout(c0625Og.getContext());
            linearLayout3.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = AbstractC0295Gu.m616i(8);
            linearLayout3.setLayoutParams(layoutParams2);
            linearLayout3.setGravity(16);
            Iterator it2 = it;
            linearLayout3.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(8));
            gradientDrawable3.setColor(linearLayout3.getContext().getColor(R.color.iconBackground));
            linearLayout3.setBackground(gradientDrawable3);
            LinearLayout linearLayout4 = new LinearLayout(linearLayout3.getContext());
            linearLayout4.setOrientation(1);
            Integer num5 = num3;
            linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView3 = new TextView(linearLayout4.getContext());
            textView3.setText(c0140da.f365b);
            textView3.setTextSize(14.0f);
            textView3.setTextColor(textView3.getContext().getColor(R.color.textTitle));
            linearLayout4.addView(textView3);
            linearLayout3.addView(linearLayout4);
            ?? linearLayout5 = new LinearLayout(linearLayout3.getContext());
            linearLayout5.setOrientation(0);
            linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            C0183EA c0183ea = C0183EA.f539a;
            String str3 = c0140da.f364a;
            c0183ea.getClass();
            File file2 = new File(C0183EA.m378f(str3));
            boolean zEquals = C0183EA.m373a().equals(str3);
            if (file2.exists()) {
                if (zEquals) {
                    ?? r242 = linearLayout3;
                    file = file2;
                    z = zEquals;
                    TextView textView4 = new TextView(r242.getContext());
                    textView4.setText(AbstractC0295Gu.m625r(-97233764612149L));
                    textView4.setTextSize(12.0f);
                    textView4.setGravity(17);
                    textView4.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num5), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num5));
                    textView4.setTextColor(textView4.getContext().getColor(R.color.buttonTextSecondary));
                    GradientDrawable gradientDrawable4 = new GradientDrawable();
                    gradientDrawable4.setCornerRadius(AbstractC0295Gu.m616i(8));
                    gradientDrawable4.setColor(textView4.getContext().getColor(R.color.buttonSecondary));
                    gradientDrawable4.setStroke(AbstractC0295Gu.m616i(num4), textView4.getContext().getColor(R.color.cardStroke));
                    textView4.setBackground(gradientDrawable4);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num), -2);
                    layoutParams3.setMarginEnd(AbstractC0295Gu.m616i(8));
                    textView4.setLayoutParams(layoutParams3);
                    textView4.setMinWidth(AbstractC0295Gu.m616i(num));
                    linearLayout5.addView(textView4);
                    r24 = r242;
                } else {
                    TextView textView5 = new TextView(linearLayout3.getContext());
                    textView5.setText(AbstractC0295Gu.m625r(-97220879710261L));
                    textView5.setTextSize(12.0f);
                    textView5.setGravity(17);
                    r24 = linearLayout3;
                    file = file2;
                    z = zEquals;
                    textView5.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num5), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num5));
                    textView5.setTextColor(textView5.getContext().getColor(R.color.buttonTextPrimary));
                    GradientDrawable gradientDrawable5 = new GradientDrawable();
                    gradientDrawable5.setCornerRadius(AbstractC0295Gu.m616i(8));
                    gradientDrawable5.setColor(textView5.getContext().getColor(R.color.buttonPrimary));
                    textView5.setBackground(gradientDrawable5);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num), -2);
                    layoutParams4.setMarginEnd(AbstractC0295Gu.m616i(8));
                    textView5.setLayoutParams(layoutParams4);
                    textView5.setMinWidth(AbstractC0295Gu.m616i(num));
                    textView5.setOnClickListener(new ViewOnClickListenerC2176l5(c0625Og, c0140da, c0185ec2));
                    linearLayout5.addView(textView5);
                }
                if (z) {
                    num2 = num4;
                    r9 = r24;
                } else {
                    TextView textView6 = new TextView(r24.getContext());
                    textView6.setText(AbstractC0295Gu.m625r(-97250944481333L));
                    textView6.setTextSize(12.0f);
                    textView6.setGravity(17);
                    textView6.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num5), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num5));
                    textView6.setTextColor(textView6.getContext().getColor(android.R.color.white));
                    GradientDrawable gradientDrawable6 = new GradientDrawable();
                    gradientDrawable6.setCornerRadius(AbstractC0295Gu.m616i(8));
                    gradientDrawable6.setColor(textView6.getContext().getColor(android.R.color.holo_red_light));
                    textView6.setBackground(gradientDrawable6);
                    textView6.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num), -2));
                    textView6.setMinWidth(AbstractC0295Gu.m616i(num));
                    num2 = num4;
                    r9 = r24;
                    textView6.setOnClickListener(new ViewOnClickListenerC1433g(c0625Og, c0185ec2, c0140da, file, 2));
                    linearLayout5.addView(textView6);
                }
                c0625Og = this;
                c0185ec2 = c0185ec;
            } else {
                r9 = linearLayout3;
                num2 = num4;
                Context context = r9.getContext();
                AbstractC0295Gu.m625r(-97263829383221L);
                C2414qe c2414qe = new C2414qe(context);
                c2414qe.setText(AbstractC0295Gu.m625r(-96782793046069L));
                c2414qe.setBackgroundColor(c2414qe.getContext().getColor(R.color.buttonPrimary));
                c2414qe.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num), -2));
                c2414qe.setMinWidth(AbstractC0295Gu.m616i(num));
                c0625Og = this;
                c0185ec2 = c0185ec;
                c2414qe.setOnClickListener(new ViewOnClickListenerC1433g(c0625Og, c0185ec2, c0140da, c2414qe, 3));
                linearLayout5.addView(c2414qe);
            }
            r9.addView(linearLayout5);
            r13.addView(r9);
            num4 = num2;
            num3 = num5;
            it = it2;
        }
        Integer num6 = num3;
        Integer num7 = num4;
        if (!AbstractC0585Nj.m1134a(str, AbstractC0295Gu.m625r(-97104915593269L)) && list.isEmpty() && str2.length() == 0) {
            ?? linearLayout6 = new LinearLayout(c0625Og.getContext());
            i = 0;
            linearLayout6.setOrientation(0);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.topMargin = AbstractC0295Gu.m616i(8);
            linearLayout6.setLayoutParams(layoutParams5);
            linearLayout6.setGravity(16);
            linearLayout6.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
            GradientDrawable gradientDrawable7 = new GradientDrawable();
            gradientDrawable7.setCornerRadius(AbstractC0295Gu.m616i(8));
            gradientDrawable7.setColor(linearLayout6.getContext().getColor(R.color.iconBackground));
            linearLayout6.setBackground(gradientDrawable7);
            LinearLayout linearLayout7 = new LinearLayout(linearLayout6.getContext());
            linearLayout7.setOrientation(1);
            linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView7 = new TextView(linearLayout7.getContext());
            textView7.setText(c0185ec2.f551c);
            textView7.setTextSize(14.0f);
            textView7.setTextColor(textView7.getContext().getColor(R.color.textTitle));
            linearLayout7.addView(textView7);
            linearLayout6.addView(linearLayout7);
            ?? linearLayout8 = new LinearLayout(linearLayout6.getContext());
            linearLayout8.setOrientation(0);
            linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            C0183EA.f539a.getClass();
            File file3 = new File(C0183EA.m378f(str));
            boolean zEquals2 = C0183EA.m373a().equals(str);
            if (!file3.exists()) {
                TextView textView8 = new TextView(linearLayout6.getContext());
                textView8.setText(AbstractC0295Gu.m625r(-97156455200821L));
                textView8.setTextSize(12.0f);
                textView8.setGravity(17);
                textView8.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num6));
                textView8.setTextColor(textView8.getContext().getColor(R.color.textSecondary));
                GradientDrawable gradientDrawable8 = new GradientDrawable();
                gradientDrawable8.setCornerRadius(AbstractC0295Gu.m616i(8));
                gradientDrawable8.setColor(textView8.getContext().getColor(R.color.buttonSecondary));
                gradientDrawable8.setStroke(AbstractC0295Gu.m616i(num7), textView8.getContext().getColor(R.color.cardStroke));
                textView8.setBackground(gradientDrawable8);
                textView8.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num), -2));
                textView8.setMinWidth(AbstractC0295Gu.m616i(num));
                linearLayout8.addView(textView8);
            } else if (zEquals2) {
                TextView textView9 = new TextView(linearLayout6.getContext());
                textView9.setText(AbstractC0295Gu.m625r(-97139275331637L));
                textView9.setTextSize(12.0f);
                textView9.setGravity(17);
                textView9.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num6));
                textView9.setTextColor(textView9.getContext().getColor(R.color.buttonTextSecondary));
                GradientDrawable gradientDrawable9 = new GradientDrawable();
                gradientDrawable9.setCornerRadius(AbstractC0295Gu.m616i(8));
                gradientDrawable9.setColor(textView9.getContext().getColor(R.color.buttonSecondary));
                gradientDrawable9.setStroke(AbstractC0295Gu.m616i(num7), textView9.getContext().getColor(R.color.cardStroke));
                textView9.setBackground(gradientDrawable9);
                textView9.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num), -2));
                textView9.setMinWidth(AbstractC0295Gu.m616i(num));
                linearLayout8.addView(textView9);
            } else {
                TextView textView10 = new TextView(linearLayout6.getContext());
                textView10.setText(AbstractC0295Gu.m625r(-97113505527861L));
                textView10.setTextSize(12.0f);
                textView10.setGravity(17);
                textView10.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num6));
                textView10.setTextColor(textView10.getContext().getColor(R.color.buttonTextPrimary));
                GradientDrawable gradientDrawable10 = new GradientDrawable();
                gradientDrawable10.setCornerRadius(AbstractC0295Gu.m616i(8));
                gradientDrawable10.setColor(textView10.getContext().getColor(R.color.buttonPrimary));
                textView10.setBackground(gradientDrawable10);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num), -2);
                layoutParams6.setMarginEnd(AbstractC0295Gu.m616i(8));
                textView10.setLayoutParams(layoutParams6);
                textView10.setMinWidth(AbstractC0295Gu.m616i(num));
                textView10.setOnClickListener(new ViewOnClickListenerC0453Kg(c0625Og, c0185ec2, 1));
                linearLayout8.addView(textView10);
                TextView textView11 = new TextView(linearLayout6.getContext());
                textView11.setText(AbstractC0295Gu.m625r(-97126390429749L));
                textView11.setTextSize(12.0f);
                textView11.setGravity(17);
                textView11.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(num6));
                textView11.setTextColor(textView11.getContext().getColor(android.R.color.white));
                GradientDrawable gradientDrawable11 = new GradientDrawable();
                gradientDrawable11.setCornerRadius(AbstractC0295Gu.m616i(8));
                gradientDrawable11.setColor(textView11.getContext().getColor(android.R.color.holo_red_light));
                textView11.setBackground(gradientDrawable11);
                textView11.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(num), -2));
                textView11.setMinWidth(AbstractC0295Gu.m616i(num));
                textView11.setOnClickListener(new ViewOnClickListenerC0496Lg(textView11, c0185ec2, c0625Og, 0));
                linearLayout8.addView(textView11);
            }
            linearLayout6.addView(linearLayout8);
            r13.addView(linearLayout6);
        } else {
            i = 0;
        }
        r13.setVisibility(i);
    }

    /* JADX INFO: renamed from: c */
    public final void m1217c(boolean z) {
        float f = z ? 180.0f : 0.0f;
        ImageView imageView = this.f1995g;
        imageView.setRotation(f);
        imageView.animate().rotation(z ? 180.0f : 0.0f).setDuration(300L).start();
    }
}
