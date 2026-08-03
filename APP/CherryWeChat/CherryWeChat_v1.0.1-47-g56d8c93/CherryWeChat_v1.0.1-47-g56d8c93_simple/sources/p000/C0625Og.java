package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.ViewPropertyAnimator;
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

    public C0625Og(Context r17, C1258ca r18) {
        AbstractC0295Gu.m625r(-99694780872757L);
        AbstractC0295Gu.m625r(-99729140611125L);
        super(r17);
        this.f1989a = r18;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable r3 = new GradientDrawable();
        r3.setColor(r17.getColor(R.color.cardBackground));
        r3.setCornerRadius(AbstractC0295Gu.m616i(16));
        r3.setStroke(AbstractC0295Gu.m616i(1), r17.getColor(R.color.cardStroke));
        setBackground(r3);
        setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        LinearLayout r32 = new LinearLayout(r17);
        r32.setOrientation(0);
        r32.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r32.setGravity(16);
        ColorStateList r9 = ColorStateList.valueOf(r17.getColor(R.color.colorPrimary) & 268435455);
        GradientDrawable r10 = new GradientDrawable();
        r10.setCornerRadius(AbstractC0295Gu.m616i(12));
        r32.setBackground(new RippleDrawable(r9, null, r10));
        r32.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
        r32.setClickable(true);
        r32.setFocusable(true);
        this.f1990b = r32;
        ImageView r12 = new ImageView(r17);
        LinearLayout.LayoutParams r13 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(48), AbstractC0295Gu.m616i(48));
        r13.setMarginEnd(AbstractC0295Gu.m616i(12));
        r12.setLayoutParams(r13);
        r12.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable r11 = new GradientDrawable();
        r11.setCornerRadius(AbstractC0295Gu.m616i(8));
        r11.setColor(r17.getColor(R.color.iconBackground));
        r12.setBackground(r11);
        this.f1991c = r12;
        r32.addView(r12);
        LinearLayout r112 = new LinearLayout(r17);
        r112.setOrientation(1);
        r112.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout r122 = new LinearLayout(r17);
        r122.setOrientation(0);
        r122.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r122.setGravity(16);
        TextView r6 = new TextView(r17);
        r6.setTextSize(16.0f);
        r6.setTypeface(Typeface.DEFAULT_BOLD);
        r6.setTextColor(r17.getColor(R.color.textTitle));
        r6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f1992d = r6;
        r122.addView(r6);
        TextView r62 = new TextView(r17);
        r62.setTextSize(12.0f);
        r62.setPadding(AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2));
        GradientDrawable r92 = new GradientDrawable();
        r92.setCornerRadius(AbstractC0295Gu.m616i(8));
        r62.setBackground(r92);
        r62.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        r122.addView(r62);
        r112.addView(r122);
        TextView r63 = new TextView(r17);
        r63.setTextSize(12.0f);
        r63.setTextColor(r17.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r123 = new LinearLayout.LayoutParams(-1, -2);
        r123.topMargin = AbstractC0295Gu.m616i(4);
        r63.setLayoutParams(r123);
        this.f1993e = r63;
        r112.addView(r63);
        r32.addView(r112);
        TextView r64 = new TextView(r17);
        r64.setTextSize(12.0f);
        r64.setGravity(17);
        r64.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        LinearLayout.LayoutParams r8 = new LinearLayout.LayoutParams(-2, -2);
        r8.setMarginStart(AbstractC0295Gu.m616i(8));
        r64.setLayoutParams(r8);
        GradientDrawable r82 = new GradientDrawable();
        r82.setCornerRadius(AbstractC0295Gu.m616i(16));
        r64.setBackground(r82);
        r64.setClickable(true);
        r64.setFocusable(true);
        this.f1994f = r64;
        r32.addView(r64);
        ImageView r65 = new ImageView(r17);
        LinearLayout.LayoutParams r7 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        r7.setMarginStart(AbstractC0295Gu.m616i(8));
        r65.setLayoutParams(r7);
        r65.setImageResource(R.drawable.ic_expand);
        r65.setColorFilter(r17.getColor(R.color.textSecondary));
        r65.setFocusable(true);
        this.f1995g = r65;
        r32.addView(r65);
        addView(r32);
        TextView r33 = new TextView(r17);
        r33.setTextSize(14.0f);
        r33.setTextColor(r17.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r66 = new LinearLayout.LayoutParams(-1, -2);
        r66.topMargin = AbstractC0295Gu.m616i(8);
        r33.setLayoutParams(r66);
        r33.setVisibility(8);
        this.f1997i = r33;
        addView(r33);
        LinearLayout r34 = new LinearLayout(r17);
        r34.setOrientation(1);
        LinearLayout.LayoutParams r1 = new LinearLayout.LayoutParams(-1, -2);
        r1.topMargin = AbstractC0295Gu.m616i(8);
        r34.setLayoutParams(r1);
        r34.setVisibility(8);
        this.f1996h = r34;
        addView(r34);
    }

    /* JADX INFO: renamed from: a */
    public final void m1215a(String r6) {
        C0183EA.f539a.getClass();
        if (C0183EA.m379g(r6) == true) goto L11;
        AbstractC0213Ey.m413k(-97624606636085L, getContext(), 0);
        return;
    L11:
        C0183EA.m383k(r6);     // Catch: Exception -> L8
        Toast.makeText(getContext(), AbstractC0295Gu.m625r(-97654671407157L), 0).show();     // Catch: Exception -> L8
        AbstractC1208bA.m2329b(new RunnableC0562N2(11, this), 100);     // Catch: Exception -> L8
        return;
    L8:
        e = move-exception;
        Toast.makeText(getContext(), AbstractC0213Ey.m405c(-97684736178229L, new StringBuilder(), e), 0).show();
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
    public final void m1216b(C0185EC r28) {
        C0625Og r1 = this;
        C0185EC r2 = r28;
        String r6 = r2.f549a;
        Integer r8 = 6;
        Integer r10 = 1;
        ?? r13 = r1.f1996h;
        r13.removeAllViews();
        String r14 = r2.f564p;
        List r15 = r2.f558j;
        if (r14.length() <= 0) goto L5;
        ?? r0 = new LinearLayout(r1.getContext());
        r0.setOrientation(0);
        LinearLayout.LayoutParams r5 = new LinearLayout.LayoutParams(-1, -2);
        r5.topMargin = AbstractC0295Gu.m616i(8);
        r0.setLayoutParams(r5);
        r0.setGravity(16);
        r0.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
        GradientDrawable r3 = new GradientDrawable();
        r3.setCornerRadius(AbstractC0295Gu.m616i(8));
        r3.setColor(r0.getContext().getColor(R.color.iconBackground));
        r0.setBackground(r3);
        LinearLayout r32 = new LinearLayout(r0.getContext());
        r32.setOrientation(1);
        Integer r18 = 60;
        r32.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r4 = new TextView(r32.getContext());
        r4.setText(AbstractC0295Gu.m625r(-97173635070005L));
        r4.setTextSize(14.0f);
        r4.setTextColor(r4.getContext().getColor(R.color.textTitle));
        r32.addView(r4);
        r0.addView(r32);
        TextView r33 = new TextView(r0.getContext());
        r33.setText(AbstractC0295Gu.m625r(-97207994808373L));
        r33.setTextSize(12.0f);
        r33.setTextColor(r33.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r42 = new GradientDrawable();
        r42.setCornerRadius(AbstractC0295Gu.m616i(8));
        r42.setColor(r33.getContext().getColor(R.color.buttonPrimary));
        r33.setBackground(r42);
        r33.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r8));
        r33.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(60), -2));
        r33.setMinWidth(AbstractC0295Gu.m616i(60));
        r33.setGravity(17);
        r33.setOnClickListener(new ViewOnClickListenerC2176l5(8, r33, r2));
        r0.addView(r33);
        r13.addView(r0);
    L6:
        Iterator r7 = r15.iterator();
    L8:
        if (r7.hasNext() == false) goto L20;
        C0140DA r02 = (C0140DA) r7.next();
        ?? r43 = new LinearLayout(r1.getContext());
        r43.setOrientation(0);
        LinearLayout.LayoutParams r52 = new LinearLayout.LayoutParams(-1, -2);
        r52.topMargin = AbstractC0295Gu.m616i(8);
        r43.setLayoutParams(r52);
        r43.setGravity(16);
        Iterator r23 = r7;
        r43.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
        GradientDrawable r34 = new GradientDrawable();
        r34.setCornerRadius(AbstractC0295Gu.m616i(8));
        r34.setColor(r43.getContext().getColor(R.color.iconBackground));
        r43.setBackground(r34);
        LinearLayout r35 = new LinearLayout(r43.getContext());
        r35.setOrientation(1);
        Integer r17 = r8;
        r35.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r53 = new TextView(r35.getContext());
        r53.setText(r02.f365b);
        r53.setTextSize(14.0f);
        r53.setTextColor(r53.getContext().getColor(R.color.textTitle));
        r35.addView(r53);
        r43.addView(r35);
        ?? r82 = new LinearLayout(r43.getContext());
        r82.setOrientation(0);
        r82.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C0183EA r54 = C0183EA.f539a;
        String r72 = r02.f364a;
        r54.getClass();
        File r44 = new File(C0183EA.m378f(r72));
        boolean r55 = C0183EA.m373a().equals(r72);
        if (r44.exists() == false) goto L18;
        if (r55 == true) goto L13;
        TextView r73 = new TextView(r43.getContext());
        r73.setText(AbstractC0295Gu.m625r(-97220879710261L));
        r73.setTextSize(12.0f);
        r73.setGravity(17);
        ?? r24 = r43;
        File r25 = r44;
        boolean r26 = r55;
        r73.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r17), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r17));
        r73.setTextColor(r73.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r36 = new GradientDrawable();
        r36.setCornerRadius(AbstractC0295Gu.m616i(8));
        r36.setColor(r73.getContext().getColor(R.color.buttonPrimary));
        r73.setBackground(r36);
        LinearLayout.LayoutParams r37 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r18), -2);
        r37.setMarginEnd(AbstractC0295Gu.m616i(8));
        r73.setLayoutParams(r37);
        r73.setMinWidth(AbstractC0295Gu.m616i(r18));
        r73.setOnClickListener(new ViewOnClickListenerC2176l5(r1, r02, r2));
        r82.addView(r73);
    L14:
        if (r26 == true) goto L17;
        TextView r74 = new TextView(r24.getContext());
        r74.setText(AbstractC0295Gu.m625r(-97250944481333L));
        r74.setTextSize(12.0f);
        r74.setGravity(17);
        r74.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r17), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r17));
        r74.setTextColor(r74.getContext().getColor(android.R.color.white));
        GradientDrawable r38 = new GradientDrawable();
        r38.setCornerRadius(AbstractC0295Gu.m616i(8));
        r38.setColor(r74.getContext().getColor(android.R.color.holo_red_light));
        r74.setBackground(r38);
        r74.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r18), -2));
        r74.setMinWidth(AbstractC0295Gu.m616i(r18));
        Integer r16 = r10;
        ?? r9 = r24;
        r74.setOnClickListener(new ViewOnClickListenerC1433g(r1, r2, r02, r25, 2));
        r82.addView(r74);
    L16:
        r1 = this;
        r2 = r28;
    L19:
        r9.addView(r82);
        r13.addView(r9);
        r10 = r16;
        r8 = r17;
        r7 = r23;
        goto L8
    L17:
        r16 = r10;
        r9 = r24;
        goto L16
    L13:
        ?? r242 = r43;
        r25 = r44;
        r26 = r55;
        TextView r39 = new TextView(r242.getContext());
        r39.setText(AbstractC0295Gu.m625r(-97233764612149L));
        r39.setTextSize(12.0f);
        r39.setGravity(17);
        r39.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r17), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r17));
        r39.setTextColor(r39.getContext().getColor(R.color.buttonTextSecondary));
        GradientDrawable r45 = new GradientDrawable();
        r45.setCornerRadius(AbstractC0295Gu.m616i(8));
        r45.setColor(r39.getContext().getColor(R.color.buttonSecondary));
        r45.setStroke(AbstractC0295Gu.m616i(r10), r39.getContext().getColor(R.color.cardStroke));
        r39.setBackground(r45);
        LinearLayout.LayoutParams r46 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r18), -2);
        r46.setMarginEnd(AbstractC0295Gu.m616i(8));
        r39.setLayoutParams(r46);
        r39.setMinWidth(AbstractC0295Gu.m616i(r18));
        r82.addView(r39);
        r24 = r242;
        goto L14
    L18:
        r9 = r43;
        r16 = r10;
        Context r03 = r9.getContext();
        AbstractC0295Gu.m625r(-97263829383221L);
        C2414qe r47 = new C2414qe(r03);
        r47.setText(AbstractC0295Gu.m625r(-96782793046069L));
        r47.setBackgroundColor(r47.getContext().getColor(R.color.buttonPrimary));
        r47.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r18), -2));
        r47.setMinWidth(AbstractC0295Gu.m616i(r18));
        r1 = this;
        r2 = r28;
        r47.setOnClickListener(new ViewOnClickListenerC1433g(r1, r2, r02, r47, 3));
        r82.addView(r47);
        goto L19
    L20:
        Integer r172 = r8;
        Integer r162 = r10;
        if (AbstractC0585Nj.m1134a(r6, AbstractC0295Gu.m625r(-97104915593269L)) == false) goto L23;
    L33:
        int r56 = 0;
    L34:
        r13.setVisibility(r56);
        return;
    L23:
        if (r15.isEmpty() == false) goto L33;
        if (r14.length() != 0) goto L33;
        ?? r04 = new LinearLayout(r1.getContext());
        r56 = 0;
        r04.setOrientation(0);
        LinearLayout.LayoutParams r310 = new LinearLayout.LayoutParams(-1, -2);
        r310.topMargin = AbstractC0295Gu.m616i(8);
        r04.setLayoutParams(r310);
        r04.setGravity(16);
        r04.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
        GradientDrawable r311 = new GradientDrawable();
        r311.setCornerRadius(AbstractC0295Gu.m616i(8));
        r311.setColor(r04.getContext().getColor(R.color.iconBackground));
        r04.setBackground(r311);
        LinearLayout r312 = new LinearLayout(r04.getContext());
        r312.setOrientation(1);
        r312.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r48 = new TextView(r312.getContext());
        r48.setText(r2.f551c);
        r48.setTextSize(14.0f);
        r48.setTextColor(r48.getContext().getColor(R.color.textTitle));
        r312.addView(r48);
        r04.addView(r312);
        ?? r313 = new LinearLayout(r04.getContext());
        r313.setOrientation(0);
        r313.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C0183EA.f539a.getClass();
        File r49 = new File(C0183EA.m378f(r6));
        boolean r62 = C0183EA.m373a().equals(r6);
        if (r49.exists() == false) goto L31;
        if (r62 == true) goto L30;
        TextView r410 = new TextView(r04.getContext());
        r410.setText(AbstractC0295Gu.m625r(-97113505527861L));
        r410.setTextSize(12.0f);
        r410.setGravity(17);
        r410.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r172), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r172));
        r410.setTextColor(r410.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r63 = new GradientDrawable();
        r63.setCornerRadius(AbstractC0295Gu.m616i(8));
        r63.setColor(r410.getContext().getColor(R.color.buttonPrimary));
        r410.setBackground(r63);
        LinearLayout.LayoutParams r64 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r18), -2);
        r64.setMarginEnd(AbstractC0295Gu.m616i(8));
        r410.setLayoutParams(r64);
        r410.setMinWidth(AbstractC0295Gu.m616i(r18));
        r410.setOnClickListener(new ViewOnClickListenerC0453Kg(r1, r2, 1));
        r313.addView(r410);
        TextView r411 = new TextView(r04.getContext());
        r411.setText(AbstractC0295Gu.m625r(-97126390429749L));
        r411.setTextSize(12.0f);
        r411.setGravity(17);
        r411.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r172), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r172));
        r411.setTextColor(r411.getContext().getColor(android.R.color.white));
        GradientDrawable r65 = new GradientDrawable();
        r65.setCornerRadius(AbstractC0295Gu.m616i(8));
        r65.setColor(r411.getContext().getColor(android.R.color.holo_red_light));
        r411.setBackground(r65);
        r411.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r18), -2));
        r411.setMinWidth(AbstractC0295Gu.m616i(r18));
        r411.setOnClickListener(new ViewOnClickListenerC0496Lg(r411, r2, r1, 0));
        r313.addView(r411);
    L32:
        r04.addView(r313);
        r13.addView(r04);
        goto L34
    L30:
        TextView r22 = new TextView(r04.getContext());
        r22.setText(AbstractC0295Gu.m625r(-97139275331637L));
        r22.setTextSize(12.0f);
        r22.setGravity(17);
        r22.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r172), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r172));
        r22.setTextColor(r22.getContext().getColor(R.color.buttonTextSecondary));
        GradientDrawable r412 = new GradientDrawable();
        r412.setCornerRadius(AbstractC0295Gu.m616i(8));
        r412.setColor(r22.getContext().getColor(R.color.buttonSecondary));
        r412.setStroke(AbstractC0295Gu.m616i(r162), r22.getContext().getColor(R.color.cardStroke));
        r22.setBackground(r412);
        r22.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r18), -2));
        r22.setMinWidth(AbstractC0295Gu.m616i(r18));
        r313.addView(r22);
        goto L32
    L31:
        TextView r27 = new TextView(r04.getContext());
        r27.setText(AbstractC0295Gu.m625r(-97156455200821L));
        r27.setTextSize(12.0f);
        r27.setGravity(17);
        r27.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r172), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(r172));
        r27.setTextColor(r27.getContext().getColor(R.color.textSecondary));
        GradientDrawable r413 = new GradientDrawable();
        r413.setCornerRadius(AbstractC0295Gu.m616i(8));
        r413.setColor(r27.getContext().getColor(R.color.buttonSecondary));
        r413.setStroke(AbstractC0295Gu.m616i(r162), r27.getContext().getColor(R.color.cardStroke));
        r27.setBackground(r413);
        r27.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(r18), -2));
        r27.setMinWidth(AbstractC0295Gu.m616i(r18));
        r313.addView(r27);
        goto L32
    L5:
        r18 = 60;
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public final void m1217c(boolean r5) {
        float r0 = 0.0f;
        if (r5 == false) goto L5;
        float r2 = 180.0f;
    L6:
        ImageView r3 = this.f1995g;
        r3.setRotation(r2);
        ViewPropertyAnimator r22 = r3.animate();
        if (r5 == false) goto L9;
        r0 = 180.0f;
    L9:
        r22.rotation(r0).setDuration(300).start();
        return;
    L5:
        r2 = 0.0f;
        goto L6
    }
}
