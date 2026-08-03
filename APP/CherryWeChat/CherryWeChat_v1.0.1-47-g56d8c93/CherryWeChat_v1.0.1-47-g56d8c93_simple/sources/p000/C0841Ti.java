package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Ti */
/* JADX INFO: loaded from: classes.dex */
public final class C0841Ti implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public LinearLayout f2673a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f2674b;

    /* JADX INFO: renamed from: c */
    public Activity f2675c;

    /* JADX INFO: renamed from: d */
    public final List f2676d;

    /* JADX INFO: renamed from: e */
    public Object f2677e;

    /* JADX INFO: renamed from: f */
    public Object f2678f;

    /* JADX INFO: renamed from: g */
    public String f2679g;

    /* JADX INFO: renamed from: h */
    public String f2680h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2681i;

    public C0841Ti() {
        this.f2676d = AbstractC2496sa.m4977b0(new C0755Ri[]{new C0755Ri(R.color.colorPrimary, AbstractC0295Gu.m625r(-76072460744757L), AbstractC0295Gu.m625r(-76085345646645L)), new C0755Ri(R.color.colorPrimary, AbstractC0295Gu.m625r(-76089640613941L), AbstractC0295Gu.m625r(-76102525515829L)), new C0755Ri(R.color.colorSuccess, AbstractC0295Gu.m625r(-76124000352309L), AbstractC0295Gu.m625r(-76136885254197L)), new C0755Ri(R.color.colorInfo, AbstractC0295Gu.m625r(-76708115904565L), AbstractC0295Gu.m625r(-76721000806453L)), new C0755Ri(R.color.colorWarning, AbstractC0295Gu.m625r(-76742475642933L), AbstractC0295Gu.m625r(-76755360544821L)), new C0755Ri(R.color.colorError, AbstractC0295Gu.m625r(-76776835381301L), AbstractC0295Gu.m625r(-76789720283189L))});
        C0452Kf r0 = C0452Kf.f1484a;
        this.f2677e = r0;
        this.f2678f = r0;
        this.f2679g = AbstractC0295Gu.m625r(-76815490086965L);
        this.f2680h = AbstractC0295Gu.m625r(-76819785054261L);
        this.f2681i = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m1663a() {
        ?? r0 = this.f2677e;
        ArrayList r1 = new ArrayList();
        Iterator r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L21;
        Object r2 = r02.next();
        C0798Si r3 = (C0798Si) r2;
        boolean r5 = false;
        if (this.f2679g.length() != 0) goto L9;
    L10:
        boolean r4 = true;
    L13:
        if (this.f2680h.length() != 0) goto L16;
    L17:
        r5 = true;
    L18:
        if (r4 == false) goto L4;
        if (r5 == false) goto L4;
        r1.add(r2);
        goto L4
    L16:
        if (AbstractC2564tz.m5051L(r3.f2500a.f3491a.f3521d, this.f2680h, true) == false) goto L18;
    L9:
        if (AbstractC0585Nj.m1134a(r3.f2501b, this.f2679g) == true) goto L10;
        r4 = false;
        goto L13
    L21:
        this.f2678f = r1;
        m1664e();
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-75582834473013L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-73972221737013L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r20) {
        Integer r2 = 8;
        AbstractC0295Gu.m625r(-76824080021557L);
        this.f2675c = r20;
        ArrayList r7 = AbstractC0714Qj.m1499u();
        ArrayList r8 = new ArrayList(AbstractC2539ta.m5019d0(r7, 10));
        Iterator r72 = r7.iterator();
    L3:
        boolean r10 = r72.hasNext();
        List r11 = this.f2676d;
        if (r10 == false) goto L18;
        AbstractC1101Zk r102 = (AbstractC1101Zk) r72.next();
        String r13 = r102.f3491a.f3518a;
        Iterator r112 = r11.iterator();
    L7:
        if (r112.hasNext() == false) goto L11;
        Object r14 = r112.next();
        if (AbstractC0585Nj.m1134a(((C0755Ri) r14).f2393b, r13) == false) goto L7;
        Object r12 = r14;
    L12:
        C0755Ri r122 = (C0755Ri) r12;
        if (r122 == null) goto L16;
        String r113 = r122.f2392a;
        if (r113 == null) goto L16;
    L17:
        r8.add(new C0798Si(r102, r13, r113));
    L16:
        r113 = AbstractC0295Gu.m625r(-76862734727221L);
        goto L17
    L11:
        r12 = null;
        goto L12
    L18:
        this.f2677e = r8;
        this.f2678f = r8;
        LinearLayout r73 = new LinearLayout(r20);
        r73.setOrientation(1);
        r73.setBackgroundColor(r20.getColor(R.color.colorBackground));
        r73.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f2673a = r73;
        LinearLayout r103 = new LinearLayout(r20);
        r103.setOrientation(0);
        r103.setGravity(16);
        r103.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r103.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(6));
        LinearLayout r82 = new LinearLayout(r20);
        r82.setOrientation(0);
        r82.setGravity(16);
        r82.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable r9 = new GradientDrawable();
        r9.setColor(r20.getColor(R.color.cardBackground));
        r9.setCornerRadius(AbstractC0295Gu.m616i(12));
        r9.setStroke(AbstractC0295Gu.m616i(1), r20.getColor(R.color.cardStroke));
        r82.setBackground(r9);
        r82.setPadding(AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(10));
        ImageView r5 = new ImageView(r20);
        LinearLayout.LayoutParams r92 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        r92.setMarginEnd(AbstractC0295Gu.m616i(10));
        r5.setLayoutParams(r92);
        r5.setImageResource(R.drawable.ic_search);
        r5.setColorFilter(r20.getColor(R.color.textSummary));
        r5.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r82.addView(r5);
        EditText r52 = new EditText(r20);
        r52.setHint(AbstractC0295Gu.m625r(-76489072572469L));
        r52.setTextSize(15.0f);
        r52.setTextColor(r20.getColor(R.color.textTitle));
        r52.setHintTextColor(r20.getColor(R.color.textSummary));
        r52.setBackground(null);
        r52.setSingleLine(true);
        LinearLayout.LayoutParams r123 = new LinearLayout.LayoutParams(0, -2);
        r123.weight = 1.0f;
        r52.setLayoutParams(r123);
        r52.addTextChangedListener(new C1351e5(2, this));
        r82.addView(r52);
        r103.addView(r82);
        r73.addView(r103);
        ViewGroup r53 = this.f2673a;
        ViewGroup r54 = r53;
        if (r53 != null) goto L21;
        AbstractC0295Gu.m625r(-76909979367477L);
        r54 = null;
    L21:
        HorizontalScrollView r74 = new HorizontalScrollView(r20);
        r74.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r74.setHorizontalScrollBarEnabled(false);
        r74.setOverScrollMode(2);
        LinearLayout r104 = new LinearLayout(r20);
        r104.setOrientation(0);
        r104.setGravity(16);
        r104.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(6));
        ArrayList r83 = this.f2681i;
        r83.clear();
        Iterator r93 = r11.iterator();
    L23:
        if (r93.hasNext() == false) goto L25;
        C0755Ri r114 = (C0755Ri) r93.next();
        TextView r124 = new TextView(r20);
        r124.setText(r114.f2392a);
        r124.setTextSize(13.0f);
        r124.setGravity(17);
        Integer r18 = r2;
        r124.setPadding(AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(6));
        LinearLayout.LayoutParams r22 = new LinearLayout.LayoutParams(-2, -2);
        r22.setMarginEnd(AbstractC0295Gu.m616i(r18));
        r124.setLayoutParams(r22);
        r124.setClickable(true);
        r124.setFocusable(true);
        r124.setTag(r114.f2393b);
        r124.setOnClickListener(new ViewOnClickListenerC2176l5(11, this, r114));
        r83.add(r124);
        r104.addView(r124);
        r2 = r18;
        goto L23
    L25:
        Integer r182 = r2;
        r74.addView(r104);
        m1665f();
        r54.addView(r74);
        ScrollView r23 = new ScrollView(r20);
        LinearLayout.LayoutParams r3 = new LinearLayout.LayoutParams(-1, 0);
        r3.weight = 1.0f;
        r23.setLayoutParams(r3);
        r23.setVerticalScrollBarEnabled(false);
        r23.setOverScrollMode(2);
        LinearLayout r32 = new LinearLayout(r20);
        r32.setOrientation(1);
        r32.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r32.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(r182), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        this.f2674b = r32;
        r23.addView(r32);
        LinearLayout r1 = this.f2673a;
        if (r1 != null) goto L28;
        AbstractC0295Gu.m625r(-76454712834101L);
        ViewGroup r125 = null;
    L29:
        r125.addView(r23);
        m1664e();
        return;
    L28:
        r125 = r1;
        goto L29
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    public final void m1664e() {
        ?? r6 = 1;
        LinearLayout r8 = this.f2674b;
        if (r8 != null) goto L5;
        AbstractC0295Gu.m625r(-75247827023925L);
        r8 = null;
    L5:
        r8.removeAllViews();
        if (this.f2678f.isEmpty() == false) goto L24;
        LinearLayout r2 = this.f2674b;
        if (r2 != null) goto L10;
        AbstractC0295Gu.m625r(-75307956566069L);
        r2 = null;
    L10:
        Activity r4 = this.f2675c;
        if (r4 != null) goto L13;
        AbstractC0295Gu.m625r(-74818330294325L);
        r4 = null;
    L13:
        TextView r3 = new TextView(r4);
        if (this.f2680h.length() <= 0) goto L17;
        long r42 = -74856984999989L;
    L18:
        r3.setText(AbstractC0295Gu.m625r(r42));
        r3.setTextSize(15.0f);
        Activity r43 = this.f2675c;
        if (r43 != null) goto L21;
        AbstractC0295Gu.m625r(-74925704476725L);
        Activity r9 = null;
    L22:
        r3.setTextColor(r9.getColor(R.color.textSummary));
        r3.setGravity(17);
        r3.setPadding(0, AbstractC0295Gu.m616i(40), 0, AbstractC0295Gu.m616i(40));
        r2.addView(r3);
        return;
    L21:
        r9 = r43;
        goto L22
    L17:
        r42 = -74895639705653L;
        goto L18
    L24:
        LinearLayout r1 = this.f2674b;
        if (r1 != null) goto L27;
        AbstractC0295Gu.m625r(-74964359182389L);
        r1 = null;
    L27:
        Activity r12 = this.f2675c;
        if (r12 != null) goto L30;
        AbstractC0295Gu.m625r(-75024488724533L);
        r12 = null;
    L30:
        TextView r82 = new TextView(r12);
        r82.setText(AbstractC0295Gu.m625r(-75612899244085L) + this.f2678f.size() + AbstractC0295Gu.m625r(-75625784145973L));
        r82.setTextSize(13.0f);
        Activity r13 = this.f2675c;
        if (r13 != null) goto L33;
        AbstractC0295Gu.m625r(-75647258982453L);
        r13 = null;
    L33:
        r82.setTextColor(r13.getColor(R.color.textSummary));
        int r14 = -1;
        LinearLayout.LayoutParams r132 = new LinearLayout.LayoutParams(-1, -2);
        r132.bottomMargin = AbstractC0295Gu.m616i(8);
        r82.setLayoutParams(r132);
        r1.addView(r82);
        Iterator r15 = this.f2678f.iterator();
    L35:
        if (r15.hasNext() == false) goto L78;
        C0798Si r83 = (C0798Si) r15.next();
        AbstractC1101Zk r92 = r83.f2500a;
        Activity r133 = this.f2675c;
        if (r133 != null) goto L39;
        AbstractC0295Gu.m625r(-75685913688117L);
        r133 = null;
    L39:
        ArrayList r93 = r92.mo1096d(r133);
        if (r93.isEmpty() == true) goto L76;
        Activity r10 = this.f2675c;
        if (r10 != null) goto L44;
        AbstractC0295Gu.m625r(-75724568393781L);
        r10 = null;
    L44:
        LinearLayout r134 = new LinearLayout(r10);
        r134.setOrientation(r6);
        GradientDrawable r102 = new GradientDrawable();
        Activity r122 = this.f2675c;
        if (r122 != null) goto L47;
        AbstractC0295Gu.m625r(-75505525061685L);
        r122 = null;
    L47:
        r102.setColor(r122.getColor(R.color.cardBackground));
        r102.setCornerRadius(AbstractC0295Gu.m616i(12));
        int r44 = AbstractC0295Gu.m616i(1);
        Activity r123 = this.f2675c;
        if (r123 != null) goto L50;
        AbstractC0295Gu.m625r(-75544179767349L);
        r123 = null;
    L50:
        r102.setStroke(r44, r123.getColor(R.color.cardStroke));
        r134.setBackground(r102);
        LinearLayout.LayoutParams r45 = new LinearLayout.LayoutParams(r14, -2);
        r45.bottomMargin = AbstractC0295Gu.m616i(8);
        r134.setLayoutParams(r45);
        r134.setClipToOutline(r6);
        Activity r103 = this.f2675c;
        if (r103 != null) goto L53;
        AbstractC0295Gu.m625r(-75763223099445L);
        r103 = null;
    L53:
        LinearLayout r46 = new LinearLayout(r103);
        r46.setOrientation(0);
        r46.setGravity(16);
        r46.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(4));
        Activity r104 = this.f2675c;
        if (r104 != null) goto L56;
        AbstractC0295Gu.m625r(-75801877805109L);
        r104 = null;
    L56:
        TextView r62 = new TextView(r104);
        r62.setText(r83.f2500a.f3491a.f3521d);
        r62.setTextSize(13.0f);
        Activity r11 = this.f2675c;
        if (r11 != null) goto L59;
        AbstractC0295Gu.m625r(-75840532510773L);
        r11 = null;
    L59:
        r62.setTextColor(r11.getColor(R.color.colorPrimary));
        r62.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams r112 = new LinearLayout.LayoutParams(0, -2);
        r112.weight = 1.0f;
        r62.setLayoutParams(r112);
        r46.addView(r62);
        Activity r105 = this.f2675c;
        if (r105 != null) goto L62;
        AbstractC0295Gu.m625r(-75329431402549L);
        r105 = null;
    L62:
        TextView r63 = new TextView(r105);
        r63.setText(r83.f2502c);
        r63.setTextSize(10.0f);
        Activity r84 = this.f2675c;
        if (r84 != null) goto L65;
        AbstractC0295Gu.m625r(-75368086108213L);
        r84 = null;
    L65:
        r63.setTextColor(r84.getColor(R.color.textSummary));
        r63.setPadding(AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(1), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(1));
        GradientDrawable r85 = new GradientDrawable();
        Activity r106 = this.f2675c;
        if (r106 != null) goto L68;
        AbstractC0295Gu.m625r(-75406740813877L);
        r106 = null;
    L68:
        int r107 = r106.getColor(R.color.colorPrimary);
        r85.setColor(Color.argb((int) (255 * 0.08f), Color.red(r107), Color.green(r107), Color.blue(r107)));
        r85.setCornerRadius(AbstractC0295Gu.m616i(6));
        r63.setBackground(r85);
        r46.addView(r63);
        r134.addView(r46);
        Iterator r47 = r93.iterator();
    L70:
        if (r47.hasNext() == false) goto L72;
        View r64 = (View) r47.next();
        r64.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r64.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r134.addView(r64);
        goto L70
    L72:
        int r94 = -1;
        ViewGroup r48 = this.f2674b;
        ViewGroup r49 = r48;
        if (r48 != null) goto L75;
        AbstractC0295Gu.m625r(-75445395519541L);
        r49 = null;
    L75:
        r49.addView(r134);
    L77:
        r14 = r94;
        r6 = 1;
        goto L35
    L76:
        r94 = r14;
        goto L77
    }

    /* JADX INFO: renamed from: f */
    public final void m1665f() {
        Iterator r1 = this.f2681i.iterator();
    L4:
        if (r1.hasNext() == false) goto L23;
        TextView r2 = (TextView) r1.next();
        Object r3 = r2.getTag();
        AbstractC0295Gu.m625r(-76523432310837L);
        Activity r4 = null;
        if (AbstractC0585Nj.m1134a((String) r3, this.f2679g) == true) goto L7;
        Activity r32 = this.f2675c;
        if (r32 != null) goto L15;
        AbstractC0295Gu.m625r(-75131862906933L);
        r32 = null;
    L15:
        r2.setTextColor(r32.getColor(R.color.textSummary));
        r2.setTypeface(Typeface.DEFAULT);
        GradientDrawable r33 = new GradientDrawable();
        Activity r5 = this.f2675c;
        if (r5 != null) goto L18;
        AbstractC0295Gu.m625r(-75170517612597L);
        r5 = null;
    L18:
        r33.setColor(r5.getColor(R.color.cardBackground));
        r33.setCornerRadius(AbstractC0295Gu.m616i(20));
        int r52 = AbstractC0295Gu.m616i(1);
        Activity r6 = this.f2675c;
        if (r6 != null) goto L21;
        AbstractC0295Gu.m625r(-75209172318261L);
    L22:
        r33.setStroke(r52, r4.getColor(R.color.dividerColor));
        r2.setBackground(r33);
        goto L4
    L21:
        r4 = r6;
        goto L22
    L7:
        r2.setTextColor(-1);
        r2.setTypeface(Typeface.DEFAULT_BOLD);
        GradientDrawable r34 = new GradientDrawable();
        Activity r53 = this.f2675c;
        if (r53 != null) goto L10;
        AbstractC0295Gu.m625r(-75093208201269L);
    L11:
        r34.setColor(r4.getColor(R.color.colorPrimary));
        r34.setCornerRadius(AbstractC0295Gu.m616i(20));
        r2.setBackground(r34);
        goto L4
    L10:
        r4 = r53;
        goto L11
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        LinearLayout r0 = this.f2673a;
        if (r0 != null) goto L6;
        AbstractC0295Gu.m625r(-74010876442677L);
        return null;
    L6:
        return r0;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-74045236181045L);
    }
}
