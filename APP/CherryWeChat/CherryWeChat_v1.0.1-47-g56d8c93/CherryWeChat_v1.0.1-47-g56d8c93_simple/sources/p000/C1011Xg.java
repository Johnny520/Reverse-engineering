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

    public C1011Xg(Context r10) {
        AbstractC0295Gu.m625r(-811856193124405L);
        super(r10);
        this.f3216a = AbstractC0295Gu.m616i(Integer.valueOf(BannerConfig.SCROLL_TIME));
        this.f3217b = AbstractC0295Gu.m616i(16);
        setBackgroundColor(r10.getColor(R.color.colorBackground));
        FrameLayout r2 = new FrameLayout(r10);
        r2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r2.setBackgroundColor(r10.getColor(R.color.colorBackground));
        addView(r2);
        ScrollView r3 = new ScrollView(r10);
        r3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r3.setBackgroundColor(r10.getColor(R.color.colorBackground));
        r2.addView(r3);
        LinearLayout r1 = new LinearLayout(r10);
        r1.setOrientation(1);
        r1.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r1.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(24));
        r1.setGravity(1);
        this.f3218c = r1;
        r3.addView(r1);
        TextView r12 = new TextView(r10);
        AbstractC0213Ey.m414l(-811890552862773L, r12, 14.0f);
        r12.setTextColor(r10.getColor(R.color.buttonTextPrimary));
        r12.setTypeface(Typeface.create(AbstractC0295Gu.m625r(-811903437764661L), 0));
        r12.setGravity(17);
        r12.setElevation(AbstractC0295Gu.m616i(8));
        int r32 = AbstractC0295Gu.m616i(56);
        FrameLayout.LayoutParams r4 = new FrameLayout.LayoutParams(r32, r32);
        r4.gravity = 8388693;
        r4.setMarginEnd(AbstractC0295Gu.m616i(16));
        r4.bottomMargin = AbstractC0295Gu.m616i(16);
        r12.setLayoutParams(r4);
        GradientDrawable r0 = new GradientDrawable();
        r0.setShape(1);
        r0.setColor(r10.getColor(R.color.buttonPrimary));
        r12.setBackground(r0);
        r12.setClickable(true);
        r12.setFocusable(true);
        StateListDrawable r02 = new StateListDrawable();
        int[] r42 = {android.R.attr.state_pressed};
        GradientDrawable r6 = new GradientDrawable();
        r6.setShape(1);
        r6.setColor(r10.getColor(R.color.pressedStateColor));
        r02.addState(r42, r6);
        GradientDrawable r62 = new GradientDrawable();
        r62.setShape(1);
        r62.setColor(r10.getColor(R.color.buttonPrimary));
        r02.addState(new int[0], r62);
        r12.setBackground(r02);
        int r33 = 2;
        r12.setOnClickListener(new ViewOnClickListenerC0362Ib(r10, r33));
        r2.addView(r12);
        C1498hd r102 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l(this, null, r33), 3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1902a(C1011Xg r5) {
        LinearLayout r0 = r5.f3218c;
        View r1 = new View(r5.getContext());
        r1.setBackgroundColor(r1.getContext().getColor(R.color.dividerColor));
        LinearLayout.LayoutParams r2 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
        r2.topMargin = AbstractC0295Gu.m616i(24);
        r2.bottomMargin = AbstractC0295Gu.m616i(24);
        r1.setLayoutParams(r2);
        r5.m1906h(r0, r1);
    }

    /* JADX INFO: renamed from: e */
    public static final void m1903e(C1011Xg r7, String r8) {
        LinearLayout r0 = r7.f3218c;
        LinearLayout r1 = new LinearLayout(r7.getContext());
        r1.setOrientation(0);
        r1.setGravity(16);
        TextView r4 = new TextView(r1.getContext());
        r4.setText(r8);
        r4.setTextSize(16.0f);
        r4.setTextColor(r4.getContext().getColor(R.color.textSummary));
        r4.setTypeface(Typeface.create(AbstractC0295Gu.m625r(-811980747175989L), 0));
        LinearLayout.LayoutParams r82 = new LinearLayout.LayoutParams(-2, -2);
        r82.setMarginStart(AbstractC0295Gu.m616i(8));
        r4.setLayoutParams(r82);
        r1.addView(r4);
        r1.setPadding(0, AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(12));
        r7.m1906h(r0, r1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m1904f(C1011Xg r5) {
        LinearLayout r0 = r5.f3218c;
        View r1 = new View(r5.getContext());
        r1.setBackgroundColor(r1.getContext().getColor(R.color.dividerColor));
        LinearLayout.LayoutParams r2 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
        r2.topMargin = AbstractC0295Gu.m616i(8);
        r2.bottomMargin = AbstractC0295Gu.m616i(8);
        r1.setLayoutParams(r2);
        r5.m1906h(r0, r1);
    }

    /* JADX INFO: renamed from: g */
    public static final void m1905g(C1011Xg r15, C0968Wg r16, LinearLayout r17) {
        LinearLayout r4 = new LinearLayout(r15.getContext());
        r4.setOrientation(1);
        ImageView r6 = new ImageView(r4.getContext());
        r6.setImageResource(R.drawable.ic_expand);
        r6.setColorFilter(r6.getContext().getColor(R.color.textSummary));
        r6.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20)));
        if (r16.f3018c == false) goto L5;
        float r7 = 180.0f;
    L6:
        r6.setRotation(r7);
        LinearLayout r72 = new LinearLayout(r4.getContext());
        int r10 = 0;
        r72.setOrientation(0);
        r72.setGravity(16);
        r72.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        StateListDrawable r2 = new StateListDrawable();
        r2.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(r72.getContext().getColor(R.color.pressedStateColor)));
        r2.addState(new int[0], new ColorDrawable(r72.getContext().getColor(R.color.colorForeground)));
        r72.setBackground(r2);
        r72.setClickable(true);
        r72.setFocusable(true);
        TextView r22 = new TextView(r72.getContext());
        r22.setText(r16.f3016a);
        r22.setTextSize(15.0f);
        r22.setTextColor(r22.getContext().getColor(R.color.textTitle));
        r22.setTypeface(Typeface.create(AbstractC0295Gu.m625r(-811508300773429L), 0));
        LinearLayout.LayoutParams r9 = new LinearLayout.LayoutParams(0, -2);
        r9.weight = 1.0f;
        r22.setLayoutParams(r9);
        r72.addView(r22);
        r72.addView(r6);
        r4.addView(r72);
        LinearLayout r23 = new LinearLayout(r4.getContext());
        r23.setOrientation(1);
        r23.setBackground(new ColorDrawable(r23.getContext().getColor(R.color.colorForeground)));
        if (r16.f3018c == true) goto L10;
        r10 = 8;
    L10:
        r23.setVisibility(r10);
        View r92 = new View(r23.getContext());
        r92.setBackgroundColor(r92.getContext().getColor(R.color.dividerColor));
        r92.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1)));
        r23.addView(r92);
        TextView r5 = new TextView(r23.getContext());
        r5.setText(r16.f3017b);
        r5.setTextSize(14.0f);
        r5.setTextColor(r5.getContext().getColor(R.color.textSummary));
        r5.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
        r5.setLineSpacing(AbstractC0295Gu.m616i(8), 1.0f);
        r23.addView(r5);
        r4.addView(r23);
        r72.setOnClickListener(new ViewOnClickListenerC0496Lg(r16, r6, r23, 1));
        r15.m1906h(r17, r4);
        return;
    L5:
        r7 = 0.0f;
        goto L6
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-811624264890421L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-811662919596085L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r3) {
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
    public final void m1906h(LinearLayout r5, View r6) {
        FrameLayout r0 = new FrameLayout(r5.getContext());
        r0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams r1 = new FrameLayout.LayoutParams(-1, -2);
        int r2 = this.f3217b;
        r1.setMarginStart(r2);
        r1.setMarginEnd(r2);
        int r3 = r0.getContext().getResources().getDisplayMetrics().widthPixels - (r2 * 2);
        r1.width = Math.min(this.f3216a, r3);
        r1.gravity = 1;
        r0.addView(r6, r1);
        r5.addView(r0);
    }
}
