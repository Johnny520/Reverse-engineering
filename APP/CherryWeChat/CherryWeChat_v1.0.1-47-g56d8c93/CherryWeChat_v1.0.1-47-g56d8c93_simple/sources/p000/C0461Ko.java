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

    public C0461Ko(Context r14) {
        AbstractC0295Gu.m625r(-71193377896501L);
        super(r14);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable r1 = new GradientDrawable();
        r1.setColor(r14.getColor(R.color.cardBackground));
        r1.setCornerRadius(AbstractC0295Gu.m616i(16));
        r1.setStroke(AbstractC0295Gu.m616i(1), r14.getColor(R.color.cardStroke));
        setBackground(r1);
        setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        setGravity(16);
        ImageView r12 = new ImageView(r14);
        LinearLayout.LayoutParams r7 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48));
        r7.setMarginEnd(AbstractC0295Gu.m616i(12));
        r12.setLayoutParams(r7);
        r12.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable r72 = new GradientDrawable();
        r72.setCornerRadius(AbstractC0295Gu.m616i(8));
        r72.setColor(r14.getColor(R.color.iconBackground));
        r12.setBackground(r72);
        this.f1502b = r12;
        addView(r12);
        LinearLayout r13 = new LinearLayout(r14);
        r13.setOrientation(1);
        r13.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r6 = new TextView(r14);
        r6.setTextSize(16.0f);
        r6.setTypeface(Typeface.DEFAULT_BOLD);
        r6.setTextColor(r14.getColor(R.color.textTitle));
        this.f1503c = r6;
        r13.addView(r6);
        LinearLayout r62 = new LinearLayout(r14);
        r62.setOrientation(0);
        LinearLayout.LayoutParams r0 = new LinearLayout.LayoutParams(-1, -2);
        r0.topMargin = AbstractC0295Gu.m616i(4);
        r62.setLayoutParams(r0);
        r62.setGravity(16);
        TextView r02 = new TextView(r14);
        r02.setTextSize(12.0f);
        r02.setTextColor(r14.getColor(R.color.textSummary));
        this.f1504d = r02;
        r62.addView(r02);
        TextView r03 = new TextView(r14);
        r03.setTextSize(12.0f);
        r03.setTextColor(r14.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r11 = new LinearLayout.LayoutParams(-2, -2);
        r11.setMarginStart(AbstractC0295Gu.m616i(12));
        r03.setLayoutParams(r11);
        this.f1506f = r03;
        r62.addView(r03);
        TextView r04 = new TextView(r14);
        r04.setTextSize(12.0f);
        LinearLayout.LayoutParams r112 = new LinearLayout.LayoutParams(-2, -2);
        r112.setMarginStart(AbstractC0295Gu.m616i(12));
        r04.setLayoutParams(r112);
        this.f1507g = r04;
        r62.addView(r04);
        r13.addView(r62);
        TextView r05 = new TextView(r14);
        r05.setTextSize(12.0f);
        r05.setTextColor(r14.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r63 = new LinearLayout.LayoutParams(-1, -2);
        r63.topMargin = AbstractC0295Gu.m616i(4);
        r05.setLayoutParams(r63);
        r05.setMaxLines(2);
        r05.setEllipsize(TextUtils.TruncateAt.END);
        this.f1505e = r05;
        r13.addView(r05);
        addView(r13);
        TextView r06 = new TextView(r14);
        r06.setTextSize(12.0f);
        r06.setGravity(17);
        r06.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        LinearLayout.LayoutParams r142 = new LinearLayout.LayoutParams(-2, -2);
        r142.setMarginStart(AbstractC0295Gu.m616i(12));
        r06.setLayoutParams(r142);
        GradientDrawable r143 = new GradientDrawable();
        r143.setCornerRadius(AbstractC0295Gu.m616i(16));
        r06.setBackground(r143);
        this.f1508h = r06;
        addView(r06);
    }

    /* JADX INFO: renamed from: a */
    public final void m909a(C0185EC r7) {
        if (r7.f568t == false) goto L6;
        AbstractC0213Ey.m413k(-86461986633781L, getContext(), 0);
        return;
    L6:
        C0183EA r0 = C0183EA.f539a;
        String r2 = r7.f549a;
        r0.getClass();
        if (C0183EA.m379g(r2) == true) goto L10;
        AbstractC0213Ey.m413k(-86496346372149L, getContext(), 0);
        return;
    L10:
        Context r02 = getContext();
        AbstractC0295Gu.m625r(-86526411143221L);
        C1456gf.m2801S(r02, AbstractC0295Gu.m625r(-84945863178293L), AbstractC0295Gu.m625r(-84967338014773L) + r7.f551c + AbstractC0295Gu.m625r(-85001697753141L), new DialogInterfaceOnClickListenerC0375Io(1, this, r7), false);
    }

    /* JADX INFO: renamed from: b */
    public final void m910b(final C0185EC r19, boolean r20) {
        AbstractC0295Gu.m625r(-85804856637493L);
        AbstractC0295Gu.m625r(-85877871081525L);
        String r6 = r19.f549a;
        AbstractC0295Gu.m625r(-86036784871477L);
        View r7 = this.f1508h;
        ViewParent r8 = r7.getParent();
        if ((r8 instanceof LinearLayout) == false) goto L5;
        ViewGroup r82 = (LinearLayout) r8;
    L6:
        if (r82 == null) goto L8;
        r82.removeView(r7);
    L8:
        LinearLayout r72 = new LinearLayout(getContext());
        r72.setOrientation(0);
        LinearLayout.LayoutParams r9 = new LinearLayout.LayoutParams(-2, -2);
        r9.setMarginStart(AbstractC0295Gu.m616i(12));
        r72.setLayoutParams(r9);
        r72.setGravity(16);
        if (r20 == false) goto L13;
        TextView r15 = new TextView(getContext());
        r15.setText(AbstractC0295Gu.m625r(-86663850096693L));
        r15.setTextSize(12.0f);
        r15.setGravity(17);
        r15.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r15.setTextColor(r15.getContext().getColor(R.color.buttonTextSecondary));
        GradientDrawable r4 = new GradientDrawable();
        r4.setCornerRadius(AbstractC0295Gu.m616i(16));
        r4.setColor(r15.getContext().getColor(R.color.buttonSecondary));
        r4.setStroke(AbstractC0295Gu.m616i(1), r15.getContext().getColor(R.color.cardStroke));
        r15.setBackground(r4);
        LinearLayout.LayoutParams r42 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2);
        r42.setMarginEnd(AbstractC0295Gu.m616i(8));
        r15.setLayoutParams(r42);
        r15.setMinWidth(AbstractC0295Gu.m616i(72));
        r72.addView(r15);
        TextView r43 = new TextView(getContext());
        r43.setText(AbstractC0295Gu.m625r(-86681029965877L));
        r43.setTextSize(12.0f);
        r43.setGravity(17);
        r43.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r43.setTextColor(r43.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r92 = new GradientDrawable();
        r92.setCornerRadius(AbstractC0295Gu.m616i(16));
        r92.setColor(r43.getContext().getColor(R.color.buttonPrimary));
        r43.setBackground(r92);
        LinearLayout.LayoutParams r93 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2);
        r93.setMarginEnd(AbstractC0295Gu.m616i(8));
        r43.setLayoutParams(r93);
        r43.setMinWidth(AbstractC0295Gu.m616i(72));
        final int r11 = 0;
        r43.setOnClickListener(new ViewOnClickListenerC0332Ho(r11, this, r19));
        r72.addView(r43);
        if (AbstractC0585Nj.m1134a(r6, AbstractC0295Gu.m625r(-86702504802357L)) == true) goto L16;
        TextView r44 = new TextView(getContext());
        r44.setText(AbstractC0295Gu.m625r(-86711094736949L));
        r44.setTextSize(12.0f);
        r44.setGravity(17);
        r44.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r44.setTextColor(r44.getContext().getColor(android.R.color.white));
        GradientDrawable r3 = new GradientDrawable();
        r3.setCornerRadius(AbstractC0295Gu.m616i(16));
        r3.setColor(r44.getContext().getColor(android.R.color.holo_red_light));
        r44.setBackground(r3);
        r44.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2));
        r44.setMinWidth(AbstractC0295Gu.m616i(72));
        final int r32 = 1;
        r44.setOnClickListener(new ViewOnClickListenerC0332Ho(r32, this, r19));
        r72.addView(r44);
    L16:
        if (r82 == null) goto L19;
        r82.addView(r72);
        return;
    L19:
        return;
    L13:
        TextView r45 = new TextView(getContext());
        r45.setText(AbstractC0295Gu.m625r(-86723979638837L));
        r45.setTextSize(12.0f);
        r45.setGravity(17);
        r45.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r45.setTextColor(r45.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r94 = new GradientDrawable();
        r94.setCornerRadius(AbstractC0295Gu.m616i(16));
        r94.setColor(r45.getContext().getColor(R.color.buttonPrimary));
        r45.setBackground(r94);
        LinearLayout.LayoutParams r95 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2);
        r95.setMarginEnd(AbstractC0295Gu.m616i(8));
        r45.setLayoutParams(r95);
        r45.setMinWidth(AbstractC0295Gu.m616i(72));
        final int r112 = 2;
        r45.setOnClickListener(new ViewOnClickListenerC0332Ho(r112, this, r19));
        r72.addView(r45);
        if (AbstractC0585Nj.m1134a(r6, AbstractC0295Gu.m625r(-86736864540725L)) == true) goto L16;
        TextView r46 = new TextView(getContext());
        r46.setText(AbstractC0295Gu.m625r(-86745454475317L));
        r46.setTextSize(12.0f);
        r46.setGravity(17);
        r46.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r46.setTextColor(r46.getContext().getColor(android.R.color.white));
        GradientDrawable r33 = new GradientDrawable();
        r33.setCornerRadius(AbstractC0295Gu.m616i(16));
        r33.setColor(r46.getContext().getColor(android.R.color.holo_red_light));
        r46.setBackground(r33);
        r46.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(72), -2));
        r46.setMinWidth(AbstractC0295Gu.m616i(72));
        final int r34 = 3;
        r46.setOnClickListener(new ViewOnClickListenerC0332Ho(r34, this, r19));
        r72.addView(r46);
        goto L16
    L5:
        r82 = null;
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public final void m911c(C0185EC r7) {
        if (r7.f568t == false) goto L6;
        AbstractC0213Ey.m413k(-86758339377205L, getContext(), 0);
        return;
    L6:
        Context r0 = getContext();
        AbstractC0295Gu.m625r(-86809878984757L);
        C1456gf.m2801S(r0, AbstractC0295Gu.m625r(-86328842647605L), AbstractC0295Gu.m625r(-86358907418677L) + r7.f551c + AbstractC0295Gu.m625r(-86406152058933L), new DialogInterfaceOnClickListenerC0375Io(0, this, r7), false);
    }

    public final InterfaceC0418Jo getOnThemeActionListener() {
        return this.f1501a;
    }

    public final void setOnThemeActionListener(InterfaceC0418Jo r1) {
        this.f1501a = r1;
    }
}
