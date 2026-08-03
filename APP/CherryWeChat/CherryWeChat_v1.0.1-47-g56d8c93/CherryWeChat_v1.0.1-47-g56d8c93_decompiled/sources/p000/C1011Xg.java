package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.youth.banner.config.BannerConfig;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Xg */
/* JADX INFO: loaded from: classes.dex */
public final class C1011Xg extends LinearLayout implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public final int f3216a;

    /* JADX INFO: renamed from: b */
    public final int f3217b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f3218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011Xg(Context context) {
        super(context);
        AbstractC0295Gu.m625r(-811856193124405L);
        this.f3216a = AbstractC0295Gu.m616i(Integer.valueOf(BannerConfig.SCROLL_TIME));
        this.f3217b = AbstractC0295Gu.m616i(16);
        setBackgroundColor(context.getColor(R.color.colorBackground));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(context.getColor(R.color.colorBackground));
        addView(frameLayout);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        scrollView.setBackgroundColor(context.getColor(R.color.colorBackground));
        frameLayout.addView(scrollView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(24));
        linearLayout.setGravity(1);
        this.f3218c = linearLayout;
        scrollView.addView(linearLayout);
        TextView textView = new TextView(context);
        AbstractC0213Ey.m414l(-811890552862773L, textView, 14.0f);
        textView.setTextColor(context.getColor(R.color.buttonTextPrimary));
        textView.setTypeface(Typeface.create(AbstractC0295Gu.m625r(-811903437764661L), 0));
        textView.setGravity(17);
        textView.setElevation(AbstractC0295Gu.m616i(8));
        int iM616i = AbstractC0295Gu.m616i(56);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM616i, iM616i);
        layoutParams.gravity = 8388693;
        layoutParams.setMarginEnd(AbstractC0295Gu.m616i(16));
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(16);
        textView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(context.getColor(R.color.buttonPrimary));
        textView.setBackground(gradientDrawable);
        textView.setClickable(true);
        textView.setFocusable(true);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {android.R.attr.state_pressed};
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(context.getColor(R.color.pressedStateColor));
        stateListDrawable.addState(iArr, gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(1);
        gradientDrawable3.setColor(context.getColor(R.color.buttonPrimary));
        stateListDrawable.addState(new int[0], gradientDrawable3);
        textView.setBackground(stateListDrawable);
        int i = 2;
        textView.setOnClickListener(new ViewOnClickListenerC0362Ib(context, i));
        frameLayout.addView(textView);
        C1498hd c1498hd = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l(this, null, i), 3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1902a(C1011Xg c1011Xg) {
        LinearLayout linearLayout = c1011Xg.f3218c;
        View view = new View(c1011Xg.getContext());
        view.setBackgroundColor(view.getContext().getColor(R.color.dividerColor));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
        layoutParams.topMargin = AbstractC0295Gu.m616i(24);
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(24);
        view.setLayoutParams(layoutParams);
        c1011Xg.m1906h(linearLayout, view);
    }

    /* JADX INFO: renamed from: e */
    public static final void m1903e(C1011Xg c1011Xg, String str) {
        LinearLayout linearLayout = c1011Xg.f3218c;
        LinearLayout linearLayout2 = new LinearLayout(c1011Xg.getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(linearLayout2.getContext());
        textView.setText(str);
        textView.setTextSize(16.0f);
        textView.setTextColor(textView.getContext().getColor(R.color.textSummary));
        textView.setTypeface(Typeface.create(AbstractC0295Gu.m625r(-811980747175989L), 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(AbstractC0295Gu.m616i(8));
        textView.setLayoutParams(layoutParams);
        linearLayout2.addView(textView);
        linearLayout2.setPadding(0, AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(12));
        c1011Xg.m1906h(linearLayout, linearLayout2);
    }

    /* JADX INFO: renamed from: f */
    public static final void m1904f(C1011Xg c1011Xg) {
        LinearLayout linearLayout = c1011Xg.f3218c;
        View view = new View(c1011Xg.getContext());
        view.setBackgroundColor(view.getContext().getColor(R.color.dividerColor));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
        layoutParams.topMargin = AbstractC0295Gu.m616i(8);
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(8);
        view.setLayoutParams(layoutParams);
        c1011Xg.m1906h(linearLayout, view);
    }

    /* JADX INFO: renamed from: g */
    public static final void m1905g(C1011Xg c1011Xg, C0968Wg c0968Wg, LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(c1011Xg.getContext());
        linearLayout2.setOrientation(1);
        ImageView imageView = new ImageView(linearLayout2.getContext());
        imageView.setImageResource(R.drawable.ic_expand);
        imageView.setColorFilter(imageView.getContext().getColor(R.color.textSummary));
        imageView.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20)));
        imageView.setRotation(c0968Wg.f3018c ? 180.0f : 0.0f);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(linearLayout3.getContext().getColor(R.color.pressedStateColor)));
        stateListDrawable.addState(new int[0], new ColorDrawable(linearLayout3.getContext().getColor(R.color.colorForeground)));
        linearLayout3.setBackground(stateListDrawable);
        linearLayout3.setClickable(true);
        linearLayout3.setFocusable(true);
        TextView textView = new TextView(linearLayout3.getContext());
        textView.setText(c0968Wg.f3016a);
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
        textView.setTypeface(Typeface.create(AbstractC0295Gu.m625r(-811508300773429L), 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        linearLayout3.addView(textView);
        linearLayout3.addView(imageView);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(linearLayout2.getContext());
        linearLayout4.setOrientation(1);
        linearLayout4.setBackground(new ColorDrawable(linearLayout4.getContext().getColor(R.color.colorForeground)));
        linearLayout4.setVisibility(c0968Wg.f3018c ? 0 : 8);
        View view = new View(linearLayout4.getContext());
        view.setBackgroundColor(view.getContext().getColor(R.color.dividerColor));
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1)));
        linearLayout4.addView(view);
        TextView textView2 = new TextView(linearLayout4.getContext());
        textView2.setText(c0968Wg.f3017b);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(textView2.getContext().getColor(R.color.textSummary));
        textView2.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
        textView2.setLineSpacing(AbstractC0295Gu.m616i(8), 1.0f);
        linearLayout4.addView(textView2);
        linearLayout2.addView(linearLayout4);
        linearLayout3.setOnClickListener(new ViewOnClickListenerC0496Lg(c0968Wg, imageView, linearLayout4, 1));
        c1011Xg.m1906h(linearLayout, linearLayout2);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-811624264890421L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-811662919596085L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-811585610184757L);
    }

    @Override // p000.InterfaceC0972Wk
    public View getContentView() {
        return this;
    }

    @Override // p000.InterfaceC0972Wk
    public String getTitle() {
        return AbstractC0295Gu.m625r(-811701574301749L);
    }

    public int getViewId() {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public final void m1906h(LinearLayout linearLayout, View view) {
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i = this.f3217b;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i);
        layoutParams.width = Math.min(this.f3216a, frameLayout.getContext().getResources().getDisplayMetrics().widthPixels - (i * 2));
        layoutParams.gravity = 1;
        frameLayout.addView(view, layoutParams);
        linearLayout.addView(frameLayout);
    }
}
