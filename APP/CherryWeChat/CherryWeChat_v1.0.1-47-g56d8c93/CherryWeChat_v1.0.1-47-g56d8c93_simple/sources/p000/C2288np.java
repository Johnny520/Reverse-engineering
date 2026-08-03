package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.ApiResponse;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: np */
/* JADX INFO: loaded from: classes.dex */
public final class C2288np implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public LinearLayout f8028a;

    /* JADX INFO: renamed from: b */
    public Activity f8029b;

    /* JADX INFO: renamed from: c */
    public EditText f8030c;

    /* JADX INFO: renamed from: d */
    public EditText f8031d;

    /* JADX INFO: renamed from: e */
    public TextView f8032e;

    /* JADX INFO: renamed from: f */
    public TextView f8033f;

    /* JADX INFO: renamed from: a */
    public static final Object m4620a(C2288np r9, String r10, AbstractC0233Fb r11) {
        if ((r11 instanceof C2245mp) == false) goto L7;
        C2245mp r0 = (C2245mp) r11;
        int r1 = r0.f7944f;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.f7944f = r1 - Integer.MIN_VALUE;
    L8:
        Object r112 = r0.f7942d;
        int r12 = r0.f7944f;
        Activity r5 = null;
        EnumC1453gc r6 = EnumC1453gc.f5148a;
        if (r12 == 0) goto L20;
        if (r12 == 1) goto L18;
        if (r12 != 2) goto L17;
        AbstractC0628Oj.m1232T(r112);     // Catch: Exception -> L14
    L53:
        Activity r102 = r9.f8029b;     // Catch: Exception -> L14
        if (r102 != null) goto L56;
        AbstractC0295Gu.m625r(-131082401871925L);     // Catch: Exception -> L14
    L57:
        r5.finish();     // Catch: Exception -> L14
    L62:
        return C0829TC.f2620a;
    L56:
        r5 = r102;
        goto L57
    L17:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-131730941933621L));
    L18:
        AbstractC0628Oj.m1232T(r112);     // Catch: Exception -> L14
    L24:
        String r113 = (String) r112;     // Catch: Exception -> L14
        C0029Am r103 = AbstractC2809zm.f9524a;     // Catch: Exception -> L27
        r103.getClass();     // Catch: Exception -> L27
        Object r104 = r103.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), r113);     // Catch: Exception -> L27
    L30:
        ApiResponse r105 = (ApiResponse) r104;     // Catch: Exception -> L14
        if (r105 == null) goto L33;
        int r13 = r105.getCode();     // Catch: Exception -> L14
    L34:
        if (r105 == null) goto L42;
        String r106 = r105.getMessage();     // Catch: Exception -> L14
        if (r106 == null) goto L42;
        if (r106.length() > 0) goto L41;
        r106 = null;
    L41:
        if (r106 == null) goto L42;
    L43:
        if (r13 != 0) goto L58;
        r9.m4623g(AbstractC0295Gu.m625r(-131060927035445L), false);     // Catch: Exception -> L14
        TextView r107 = r9.f8033f;     // Catch: Exception -> L14
        if (r107 != null) goto L47;
        AbstractC0295Gu.m625r(-131632157685813L);     // Catch: Exception -> L14
        r107 = null;
    L47:
        Activity r14 = r9.f8029b;     // Catch: Exception -> L14
        if (r14 != null) goto L50;
        AbstractC0295Gu.m625r(-130047314753589L);     // Catch: Exception -> L14
        r14 = null;
    L50:
        r107.setTextColor(r14.getColor(R.color.colorSuccess));     // Catch: Exception -> L14
        C0183EA.f539a.getClass();     // Catch: Exception -> L14
        C0183EA.m382j(r113);     // Catch: Exception -> L14
        r0.f7944f = 2;     // Catch: Exception -> L14
        if (AbstractC1293cr.m2557v(1500, r0) != r6) goto L53;
        return r6;
    L58:
        r9.m4623g(AbstractC0295Gu.m625r(-131670812391477L).concat(r106), true);     // Catch: Exception -> L14
        r9.m4622f(false);     // Catch: Exception -> L14
    L42:
        r106 = AbstractC0295Gu.m625r(-131039452198965L);     // Catch: Exception -> L14
        goto L43
    L33:
        r13 = -1;
        goto L34
    L27:
        e = move-exception;
        AbstractC0295Gu.m625r(-130906308212789L);     // Catch: Exception -> L14
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L14
        AbstractC0295Gu.m625r(-131022272329781L);     // Catch: Exception -> L14
        e.getMessage();     // Catch: Exception -> L14
        r104 = null;
        goto L30
    L20:
        AbstractC0628Oj.m1232T(r112);
        C1498hd r114 = AbstractC1499he.f5282a;     // Catch: Exception -> L14
        ExecutorC0921Vc r115 = ExecutorC0921Vc.f2876b;     // Catch: Exception -> L14
        C0991X2 r15 = new C0991X2(r10, null);     // Catch: Exception -> L14
        r0.f7944f = 1;     // Catch: Exception -> L14
        r112 = AbstractC0585Nj.m1133N(r115, r15, r0);     // Catch: Exception -> L14
        if (r112 != r6) goto L24;
        return r6;
    L14:
        e = move-exception;
        r9.m4623g(AbstractC0213Ey.m405c(-131696582195253L, new StringBuilder(), e), true);
        r9.m4622f(false);
    L7:
        r0 = new C2245mp(r9, r11);
        goto L8
    }

    /* JADX INFO: renamed from: e */
    public static final void m4621e(C2288np r4, String r5, String r6) {
        C2171l0 r1 = new C2171l0(C1456gf.m2791I(), r5, r6);     // Catch: Exception -> L7
        C2214m0 r52 = C2214m0.f7706a;     // Catch: Exception -> L7
        Activity r42 = r4.f8029b;     // Catch: Exception -> L7
        if (r42 != null) goto L5;
        AbstractC0295Gu.m625r(-130867653507125L);     // Catch: Exception -> L7
        r42 = null;
    L5:
        r52.getClass();     // Catch: Exception -> L7
        C2214m0.m4457d(r42, r1);     // Catch: Exception -> L7
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-130085969459253L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-130124624164917L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r18) {
        AbstractC0295Gu.m625r(-80964428494901L);
        this.f8029b = r18;
        LinearLayout r2 = new LinearLayout(r18);
        r2.setOrientation(1);
        r2.setBackgroundColor(r2.getContext().getColor(R.color.colorBackground));
        r2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r2.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
        this.f8028a = r2;
        LinearLayout r22 = new LinearLayout(r18);
        r22.setOrientation(1);
        LinearLayout.LayoutParams r7 = new LinearLayout.LayoutParams(-1, -2);
        r7.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), 0);
        r22.setLayoutParams(r7);
        GradientDrawable r72 = new GradientDrawable();
        r72.setColor(r18.getColor(R.color.cardBackground));
        r72.setCornerRadius(AbstractC0295Gu.m616i(16));
        r72.setStroke(AbstractC0295Gu.m616i(1), r18.getColor(R.color.cardStroke));
        r22.setBackground(r72);
        r22.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24));
        LinearLayout r3 = new LinearLayout(r18);
        r3.setOrientation(0);
        LinearLayout.LayoutParams r73 = new LinearLayout.LayoutParams(-1, -2);
        r73.bottomMargin = AbstractC0295Gu.m616i(24);
        r3.setLayoutParams(r73);
        r3.setGravity(16);
        ImageView r74 = new ImageView(r18);
        r74.setImageResource(android.R.drawable.ic_menu_manage);
        LinearLayout.LayoutParams r12 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32));
        r12.setMarginEnd(AbstractC0295Gu.m616i(12));
        r12.gravity = 16;
        r74.setLayoutParams(r12);
        r74.setColorFilter(r18.getColor(R.color.textTitle));
        r3.addView(r74);
        TextView r75 = new TextView(r18);
        AbstractC0213Ey.m414l(-81003083200565L, r75, 20.0f);
        r75.setTextColor(r18.getColor(R.color.textTitle));
        Typeface r10 = Typeface.DEFAULT_BOLD;
        r75.setTypeface(r10);
        r3.addView(r75);
        r22.addView(r3);
        LinearLayout r32 = new LinearLayout(r18);
        r32.setOrientation(1);
        LinearLayout.LayoutParams r76 = new LinearLayout.LayoutParams(-1, -2);
        r76.bottomMargin = AbstractC0295Gu.m616i(16);
        r32.setLayoutParams(r76);
        TextView r77 = new TextView(r18);
        AbstractC0213Ey.m414l(-81024558037045L, r77, 14.0f);
        r77.setTextColor(r18.getColor(R.color.textTitle));
        r77.setTypeface(r10);
        LinearLayout.LayoutParams r11 = new LinearLayout.LayoutParams(-1, -2);
        r11.bottomMargin = AbstractC0295Gu.m616i(8);
        r77.setLayoutParams(r11);
        r32.addView(r77);
        EditText r78 = new EditText(r18);
        r78.setText(Editable.Factory.getInstance().newEditable(C1456gf.m2791I()));
        r78.setEnabled(false);
        r78.setTextSize(16.0f);
        r78.setTextColor(r18.getColor(R.color.textSummary));
        r78.setHintTextColor(r18.getColor(R.color.textSecondary));
        GradientDrawable r122 = new GradientDrawable();
        r122.setColor(r18.getColor(R.color.iconBackground));
        r122.setCornerRadius(AbstractC0295Gu.m616i(8));
        r122.setStroke(AbstractC0295Gu.m616i(1), r18.getColor(R.color.cardStroke));
        r78.setBackground(r122);
        r78.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        r78.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r32.addView(r78);
        TextView r5 = new TextView(r18);
        AbstractC0213Ey.m414l(-79465484908597L, r5, 12.0f);
        r5.setTextColor(r18.getColor(R.color.textSecondary));
        LinearLayout.LayoutParams r79 = new LinearLayout.LayoutParams(-1, -2);
        r79.topMargin = AbstractC0295Gu.m616i(4);
        r5.setLayoutParams(r79);
        r32.addView(r5);
        r22.addView(r32);
        LinearLayout r33 = new LinearLayout(r18);
        r33.setOrientation(1);
        LinearLayout.LayoutParams r52 = new LinearLayout.LayoutParams(-1, -2);
        r52.bottomMargin = AbstractC0295Gu.m616i(16);
        r33.setLayoutParams(r52);
        TextView r53 = new TextView(r18);
        AbstractC0213Ey.m414l(-79521319483445L, r53, 14.0f);
        r53.setTextColor(r18.getColor(R.color.textTitle));
        r53.setTypeface(r10);
        LinearLayout.LayoutParams r710 = new LinearLayout.LayoutParams(-1, -2);
        r710.bottomMargin = AbstractC0295Gu.m616i(8);
        r53.setLayoutParams(r710);
        r33.addView(r53);
        EditText r54 = new EditText(r18);
        r54.setHint(AbstractC0295Gu.m625r(-79542794319925L));
        r54.setTextSize(16.0f);
        r54.setTextColor(r18.getColor(R.color.textTitle));
        r54.setHintTextColor(r18.getColor(R.color.textSecondary));
        r54.setInputType(33);
        GradientDrawable r711 = new GradientDrawable();
        r711.setColor(r18.getColor(R.color.iconBackground));
        r711.setCornerRadius(AbstractC0295Gu.m616i(8));
        r711.setStroke(AbstractC0295Gu.m616i(1), r18.getColor(R.color.cardStroke));
        r54.setBackground(r711);
        r54.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        r54.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f8030c = r54;
        r33.addView(r54);
        LinearLayout r55 = new LinearLayout(r18);
        r55.setOrientation(0);
        LinearLayout.LayoutParams r712 = new LinearLayout.LayoutParams(-1, -2);
        r712.topMargin = AbstractC0295Gu.m616i(4);
        r55.setLayoutParams(r712);
        r55.setGravity(16);
        TextView r713 = new TextView(r18);
        AbstractC0213Ey.m414l(-79637283600437L, r713, 12.0f);
        r713.setTextColor(r18.getColor(R.color.textSecondary));
        r713.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r55.addView(r713);
        C2214m0 r4 = C2214m0.f7706a;
        String r714 = C1456gf.m2791I();
        r4.getClass();
        if (C2214m0.m4455b(r18, r714) == false) goto L5;
        TextView r42 = new TextView(r18);
        AbstractC0213Ey.m414l(-79714593011765L, r42, 11.0f);
        r42.setTextColor(r18.getColor(R.color.colorError));
        r42.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(4), 0, AbstractC0295Gu.m616i(4));
        r42.setClickable(true);
        final int r9 = 0;
        r42.setOnClickListener(new ViewOnClickListenerC2159kp(this, r9));
        r55.addView(r42);
    L5:
        r33.addView(r55);
        r22.addView(r33);
        LinearLayout r34 = new LinearLayout(r18);
        r34.setOrientation(1);
        LinearLayout.LayoutParams r43 = new LinearLayout.LayoutParams(-1, -2);
        r43.bottomMargin = AbstractC0295Gu.m616i(24);
        r34.setLayoutParams(r43);
        TextView r44 = new TextView(r18);
        AbstractC0213Ey.m414l(-79199196936245L, r44, 14.0f);
        r44.setTextColor(r18.getColor(R.color.textTitle));
        r44.setTypeface(r10);
        LinearLayout.LayoutParams r56 = new LinearLayout.LayoutParams(-1, -2);
        r56.bottomMargin = AbstractC0295Gu.m616i(8);
        r44.setLayoutParams(r56);
        r34.addView(r44);
        EditText r45 = new EditText(r18);
        r45.setHint(AbstractC0295Gu.m625r(-79220671772725L));
        r45.setTextSize(16.0f);
        r45.setTextColor(r18.getColor(R.color.textTitle));
        r45.setHintTextColor(r18.getColor(R.color.textSecondary));
        r45.setInputType(129);
        GradientDrawable r57 = new GradientDrawable();
        r57.setColor(r18.getColor(R.color.cardBackground));
        r57.setCornerRadius(AbstractC0295Gu.m616i(8));
        r57.setStroke(AbstractC0295Gu.m616i(1), r18.getColor(R.color.cardStroke));
        r45.setBackground(r57);
        r45.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        r45.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f8031d = r45;
        r34.addView(r45);
        r22.addView(r34);
        TextView r35 = new TextView(r18);
        AbstractC0213Ey.m414l(-79353815758901L, r35, 16.0f);
        r35.setTextColor(r18.getColor(R.color.buttonTextPrimary));
        r35.setTypeface(r10);
        r35.setGravity(17);
        GradientDrawable r58 = new GradientDrawable();
        r58.setColor(r18.getColor(R.color.buttonPrimary));
        r58.setCornerRadius(AbstractC0295Gu.m616i(8));
        r35.setBackground(r58);
        r35.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        LinearLayout.LayoutParams r59 = new LinearLayout.LayoutParams(-1, -2);
        r59.bottomMargin = AbstractC0295Gu.m616i(16);
        r35.setLayoutParams(r59);
        r35.setClickable(true);
        r35.setFocusable(true);
        final int r715 = 1;
        r35.setOnClickListener(new ViewOnClickListenerC2159kp(this, r715));
        this.f8032e = r35;
        r35.setOnTouchListener(new ViewOnTouchListenerC2586ue(2, r35));
        View r36 = this.f8032e;
        if (r36 != null) goto L8;
        AbstractC0295Gu.m625r(-79431125170229L);
        r36 = null;
    L8:
        r22.addView(r36);
        TextView r37 = new TextView(r18);
        AbstractC0213Ey.m414l(-80032420591669L, r37, 14.0f);
        r37.setTextColor(r18.getColor(R.color.textSummary));
        r37.setGravity(17);
        r37.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f8033f = r37;
        r22.addView(r37);
        this.f8028a.addView(r22);
        LinearLayout r23 = new LinearLayout(r18);
        r23.setOrientation(1);
        LinearLayout.LayoutParams r38 = new LinearLayout.LayoutParams(-1, -2);
        r38.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), 0);
        r23.setLayoutParams(r38);
        GradientDrawable r39 = new GradientDrawable();
        r39.setColor(r18.getColor(R.color.importCardBackground));
        r39.setCornerRadius(AbstractC0295Gu.m616i(12));
        r39.setStroke(AbstractC0295Gu.m616i(1), r18.getColor(R.color.importCardStroke));
        r23.setBackground(r39);
        r23.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        TextView r310 = new TextView(r18);
        AbstractC0213Ey.m414l(-80148384708661L, r310, 16.0f);
        r310.setTextColor(r18.getColor(R.color.textTitle));
        r310.setTypeface(r10);
        LinearLayout.LayoutParams r46 = new LinearLayout.LayoutParams(-1, -2);
        r46.bottomMargin = AbstractC0295Gu.m616i(12);
        r310.setLayoutParams(r46);
        r23.addView(r310);
        Iterator r311 = Collections.singletonList(AbstractC0295Gu.m625r(-80182744447029L)).iterator();
    L10:
        if (r311.hasNext() == false) goto L12;
        String r47 = (String) r311.next();
        TextView r510 = new TextView(r18);
        r510.setText(r47);
        r510.setTextSize(14.0f);
        r510.setTextColor(r18.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r6 = new LinearLayout.LayoutParams(-1, -2);
        r6.bottomMargin = AbstractC0295Gu.m616i(8);
        r510.setLayoutParams(r6);
        r510.setLineSpacing(AbstractC0295Gu.m616i(4), 1.0f);
        r23.addView(r510);
        goto L10
    L12:
        this.f8028a.addView(r23);
    }

    /* JADX INFO: renamed from: f */
    public final void m4622f(boolean r6) {
        TextView r0 = this.f8032e;
        EditText r1 = null;
        if (r0 != null) goto L5;
        AbstractC0295Gu.m625r(-131937100363829L);
        r0 = null;
    L5:
        if (r6 == false) goto L8;
        long r2 = -131438884157493L;
    L9:
        r0.setText(AbstractC0295Gu.m625r(r2));
        boolean r22 = !r6;
        r0.setClickable(r22);
        if (r6 == false) goto L12;
        float r62 = 0.6f;
    L13:
        r0.setAlpha(r62);
        EditText r63 = this.f8031d;
        if (r63 != null) goto L16;
        AbstractC0295Gu.m625r(-131494718732341L);
    L17:
        r1.setEnabled(r22);
        return;
    L16:
        r1 = r63;
        goto L17
    L12:
        r62 = 1.0f;
        goto L13
    L8:
        r2 = -131468948928565L;
        goto L9
    }

    /* JADX INFO: renamed from: g */
    public final void m4623g(String r3, boolean r4) {
        TextView r0 = this.f8033f;
        if (r0 != null) goto L5;
        AbstractC0295Gu.m625r(-131567733176373L);
        r0 = null;
    L5:
        r0.setText(r3);
        Context r32 = r0.getContext();
        if (r4 == false) goto L8;
        int r42 = R.color.colorError;
    L9:
        r0.setTextColor(r32.getColor(r42));
        return;
    L8:
        r42 = R.color.textSummary;
        goto L9
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        return this.f8028a;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-130163278870581L);
    }
}
