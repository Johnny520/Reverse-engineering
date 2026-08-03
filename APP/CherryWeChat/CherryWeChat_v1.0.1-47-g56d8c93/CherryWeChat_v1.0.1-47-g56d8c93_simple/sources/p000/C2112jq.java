package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.AdListData;
import io.github.cherrywechat.network.model.AnnouncementItem;
import io.github.cherrywechat.network.model.AnnouncementsWrapper;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.RawAdItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: jq */
/* JADX INFO: loaded from: classes.dex */
public final class C2112jq extends LinearLayout implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f7429e = 0;

    /* JADX INFO: renamed from: a */
    public List f7430a;

    /* JADX INFO: renamed from: b */
    public final Banner f7431b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f7432c;

    /* JADX INFO: renamed from: d */
    public final LinearLayout f7433d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v22, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, jq] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    public C2112jq(Context r22) {
        AbstractC0295Gu.m625r(-826231448664117L);
        super(r22);
        ImageView r2 = new ImageView(r22);
        r2.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(60), AbstractC0295Gu.m616i(60)));
        TextView r3 = new TextView(r22);
        r3.setText(C1456gf.m2793K());
        r3.setTextSize(18.0f);
        r3.setTextColor(r22.getColor(R.color.textTitle));
        Integer r5 = 16;
        r3.setGravity(16);
        List r6 = AbstractC2496sa.m4977b0(new C1379eq[]{new C1379eq(10, AbstractC0295Gu.m625r(-826265808402485L), R.color.colorPrimary, AbstractC0295Gu.m625r(-825737527425077L), R.drawable.ic_theme), new C1379eq(2, AbstractC0295Gu.m625r(-825771887163445L), R.color.colorWarning, AbstractC0295Gu.m625r(-825793361999925L), R.drawable.ic_star), new C1379eq(4, AbstractC0295Gu.m625r(-825823426770997L), R.color.colorError, AbstractC0295Gu.m625r(-825844901607477L), R.drawable.ic_favorite), new C1379eq(6, AbstractC0295Gu.m625r(-825874966378549L), R.color.importIconColorDark, AbstractC0295Gu.m625r(-825896441215029L), R.drawable.ic_info)});
        this.f7430a = C0452Kf.f1484a;
        setOrientation(1);
        setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        setBackground(new ColorDrawable(getContext().getColor(R.color.colorBackground)));
        ScrollView r9 = new ScrollView(getContext());
        r9.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r9.setFillViewport(true);
        r9.setOverScrollMode(2);
        r9.setVerticalScrollBarEnabled(false);
        r9.setHorizontalScrollBarEnabled(false);
        LinearLayout r12 = new LinearLayout(getContext());
        r12.setOrientation(1);
        r12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f7433d = r12;
        r9.addView(r12);
        addView(r9);
        ?? r92 = new LinearLayout(getContext());
        r92.setOrientation(0);
        r92.setGravity(16);
        r92.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        GradientDrawable r1 = new GradientDrawable();
        r1.setShape(0);
        r1.setCornerRadius(AbstractC0295Gu.m616i(r5));
        r1.setColor(getContext().getColor(R.color.colorForeground));
        r92.setBackground(r1);
        r2.setImageDrawable(C1456gf.m2790H());
        GradientDrawable r13 = new GradientDrawable();
        r13.setShape(1);
        r13.setColor(r2.getContext().getColor(R.color.colorPrimary));
        r2.setBackground(r13);
        r2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        r2.setClipToOutline(true);
        r3.setTextSize(17.0f);
        Typeface r14 = Typeface.DEFAULT_BOLD;
        r3.setTypeface(r14);
        r3.setTextColor(r3.getContext().getColor(R.color.textTitle));
        LinearLayout.LayoutParams r11 = new LinearLayout.LayoutParams(-2, -2);
        r11.leftMargin = AbstractC0295Gu.m616i(0);
        r11.topMargin = AbstractC0295Gu.m616i(0);
        r3.setLayoutParams(r11);
        LinearLayout r112 = new LinearLayout(getContext());
        r112.setOrientation(0);
        r112.setGravity(16);
        LinearLayout.LayoutParams r142 = new LinearLayout.LayoutParams(-2, -2);
        r142.topMargin = AbstractC0295Gu.m616i(8);
        r142.leftMargin = AbstractC0295Gu.m616i(0);
        r112.setLayoutParams(r142);
        r112.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
        r112.setClickable(true);
        r112.setFocusable(true);
        r112.setOnClickListener(new ViewOnClickListenerC2176l5(17, r112, this));
        TextView r4 = new TextView(getContext());
        r4.setText(C1456gf.m2791I());
        r4.setTextSize(14.0f);
        r4.setTextColor(r4.getContext().getColor(R.color.textTitle));
        r4.setGravity(17);
        r4.setMaxLines(1);
        r4.setEllipsize(TextUtils.TruncateAt.END);
        r4.setTypeface(r14);
        r112.addView(r4);
        LinearLayout r15 = new LinearLayout(getContext());
        r15.setOrientation(1);
        LinearLayout.LayoutParams r42 = new LinearLayout.LayoutParams(0, -2);
        r42.leftMargin = AbstractC0295Gu.m616i(r5);
        r42.weight = 1.0f;
        r15.setLayoutParams(r42);
        r15.addView(r3);
        r15.addView(r112);
        ImageView r32 = new ImageView(getContext());
        LinearLayout.LayoutParams r43 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        r43.leftMargin = AbstractC0295Gu.m616i(12);
        r32.setLayoutParams(r43);
        r32.setImageResource(R.drawable.ic_info);
        r32.setColorFilter(r32.getContext().getColor(R.color.textSummary));
        r32.setAlpha(0.7f);
        r32.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r32.setClickable(true);
        r32.setFocusable(true);
        r32.setBackground(m4307j());
        r32.setPadding(AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4));
        r32.setOnClickListener(new ViewOnClickListenerC1477h(6, this));
        r92.addView(r2);
        r92.addView(r15);
        r92.addView(r32);
        LinearLayout r16 = this.f7433d;
        ?? r17 = r16;
        if (r16 != null) goto L5;
        AbstractC0295Gu.m625r(-825999520430133L);
        r17 = 0;
    L5:
        r17.addView(r92);
        LinearLayout r18 = new LinearLayout(getContext());
        r18.setOrientation(1);
        r18.setVisibility(8);
        LinearLayout.LayoutParams r33 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(160));
        r33.topMargin = AbstractC0295Gu.m616i(20);
        r18.setLayoutParams(r33);
        AbstractC0295Gu.m616i(4);
        r18.setBackground(m4305h());
        r18.setClipToOutline(true);
        this.f7432c = r18;
        Banner r19 = new Banner(getContext());
        r19.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r19.setAdapter(new C1467gq(r19, this.f7430a));
        r19.setIndicator(new CircleIndicator(r19.getContext()));
        r19.setLoopTime(3000);
        r19.isAutoLoop(true);
        r19.setOnBannerListener(new C2464rl(1, this));
        this.f7431b = r19;
        LinearLayout r110 = this.f7432c;
        if (r110 != null) goto L8;
        AbstractC0295Gu.m625r(-826437607094325L);
        r110 = null;
    L8:
        Banner r34 = this.f7431b;
        if (r34 != null) goto L11;
        AbstractC0295Gu.m625r(-826484851734581L);
        r34 = null;
    L11:
        r110.addView(r34);
        LinearLayout r111 = this.f7433d;
        if (r111 != null) goto L14;
        AbstractC0295Gu.m625r(-826514916505653L);
        r111 = null;
    L14:
        LinearLayout r35 = this.f7432c;
        if (r35 != null) goto L17;
        AbstractC0295Gu.m625r(-824938663508021L);
        r35 = null;
    L17:
        r111.addView(r35);
        ?? r113 = new LinearLayout(getContext());
        r113.setOrientation(1);
        LinearLayout.LayoutParams r36 = new LinearLayout.LayoutParams(-1, -2);
        r36.topMargin = AbstractC0295Gu.m616i(20);
        r113.setLayoutParams(r36);
        Iterator r37 = r6.iterator();
        int r143 = 0;
    L19:
        if (r37.hasNext() == false) goto L28;
        Object r44 = r37.next();
        int r10 = r143 + 1;
        if (r143 < 0) goto L26;
        C1379eq r45 = (C1379eq) r44;
        ?? r114 = new LinearLayout(getContext());
        r114.setOrientation(0);
        r114.setGravity(16);
        r114.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Iterator r20 = r37;
        r114.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(r5), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(r5));
        r114.setBackground(m4305h());
        r114.setClipToOutline(true);
        r114.setClickable(true);
        r114.setFocusable(true);
        StateListDrawable r23 = new StateListDrawable();
        r23.addState(new int[]{android.R.attr.state_pressed}, m4307j());
        r23.addState(new int[0], m4305h());
        r114.setBackground(r23);
        r114.setOnClickListener(new ViewOnClickListenerC2176l5(16, r45, this));
        ImageView r24 = new ImageView(r114.getContext());
        LinearLayout.LayoutParams r7 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32));
        r7.setMarginEnd(AbstractC0295Gu.m616i(r5));
        r24.setLayoutParams(r7);
        r24.setImageResource(r45.f4922e);
        r24.setColorFilter(r24.getContext().getColor(r45.f4920c));
        ImageView.ScaleType r38 = ImageView.ScaleType.FIT_CENTER;
        r24.setScaleType(r38);
        r114.addView(r24);
        ?? r25 = new LinearLayout(r114.getContext());
        r25.setOrientation(1);
        Integer r182 = r5;
        LinearLayout.LayoutParams r72 = new LinearLayout.LayoutParams(0, -2);
        r72.weight = 1.0f;
        r25.setLayoutParams(r72);
        TextView r73 = new TextView(r25.getContext());
        r73.setText(r45.f4919b);
        r73.setTextSize(16.0f);
        r73.setTextColor(r73.getContext().getColor(R.color.textTitle));
        r73.setTypeface(Typeface.DEFAULT_BOLD);
        r25.addView(r73);
        TextView r52 = new TextView(r25.getContext());
        r52.setText(r45.f4921d);
        r52.setTextSize(12.0f);
        r52.setTextColor(r52.getContext().getColor(R.color.textSummary));
        LinearLayout.LayoutParams r46 = new LinearLayout.LayoutParams(-2, -2);
        r46.topMargin = AbstractC0295Gu.m616i(4);
        r52.setLayoutParams(r46);
        r25.addView(r52);
        r114.addView(r25);
        ImageView r26 = new ImageView(r114.getContext());
        r26.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24)));
        r26.setImageResource(R.drawable.ic_arrow_right);
        r26.setColorFilter(r26.getContext().getColor(R.color.textSummary));
        r26.setAlpha(0.7f);
        r26.setScaleType(r38);
        r114.addView(r26);
        r113.addView(r114);
        if (r143 >= (r6.size() - 1)) goto L25;
        View r27 = new View(getContext());
        r27.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(12)));
        r113.addView(r27);
    L25:
        r143 = r10;
        r5 = r182;
        r37 = r20;
        goto L19
    L26:
        AbstractC2496sa.m4978c0();
        throw null;
    L28:
        InterfaceC0190Eb r172 = null;
        LinearLayout r28 = this.f7433d;
        ?? r29 = r28;
        if (r28 != null) goto L31;
        AbstractC0295Gu.m625r(-825131937036341L);
        r29 = 0;
    L31:
        r29.addView(r113);
        ?? r115 = new LinearLayout(getContext());
        r115.setOrientation(1);
        LinearLayout.LayoutParams r210 = new LinearLayout.LayoutParams(-1, -2);
        r210.topMargin = AbstractC0295Gu.m616i(40);
        r210.bottomMargin = AbstractC0295Gu.m616i(20);
        r115.setLayoutParams(r210);
        r115.setGravity(17);
        TextView r39 = new TextView(getContext());
        r39.setText(AbstractC0295Gu.m625r(-824655195666485L));
        r39.setTextSize(14.0f);
        r39.setTextColor(r39.getContext().getColor(R.color.textSummary));
        r39.setGravity(17);
        Typeface r211 = Typeface.DEFAULT;
        r39.setTypeface(r211);
        TextView r47 = new TextView(getContext());
        AbstractC0213Ey.m414l(-824796929587253L, r47, 12.0f);
        r47.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-824878533965877L)));
        r47.setGravity(17);
        r47.setTypeface(r211);
        LinearLayout.LayoutParams r212 = new LinearLayout.LayoutParams(-2, -2);
        r212.topMargin = AbstractC0295Gu.m616i(8);
        r47.setLayoutParams(r212);
        r115.addView(r39);
        r115.addView(r47);
        LinearLayout r213 = this.f7433d;
        ?? r214 = r213;
        if (r213 != null) goto L34;
        AbstractC0295Gu.m625r(-825462649518133L);
        r214 = 0;
    L34:
        r214.addView(r115);
        C1498hd r116 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1423fq(this, r172, 1), 3);
    }

    /* JADX INFO: renamed from: a */
    public static final List m4301a(C2112jq r10, String r11) {
        C0452Kf r102 = C0452Kf.f1484a;
        C0029Am r1 = AbstractC2809zm.f9524a;     // Catch: Exception -> L5
        r1.getClass();     // Catch: Exception -> L5
        Object r112 = r1.m4550a(ApiResponse.Companion.serializer(AdListData.Companion.serializer()), r11);     // Catch: Exception -> L5
    L8:
        ApiResponse r113 = (ApiResponse) r112;     // Catch: Exception -> L47
        if (r113 != null) goto L12;
        return r102;
    L12:
        if (r113.getCode() != 0) goto L67;
        AdListData r114 = (AdListData) r113.getData();     // Catch: Exception -> L47
        if (r114 == null) goto L68;
        List<RawAdItem> r115 = r114.getItems();     // Catch: Exception -> L47
        if (r115 == null) goto L69;
        long r12 = System.currentTimeMillis();     // Catch: Exception -> L47
        SimpleDateFormat r3 = new SimpleDateFormat(AbstractC0295Gu.m625r(-826755434674229L), Locale.getDefault());     // Catch: Exception -> L47
        ArrayList r4 = new ArrayList();     // Catch: Exception -> L47
        Iterator<T> r116 = r115.iterator();     // Catch: Exception -> L47
    L21:
        if (r116.hasNext() == false) goto L51;
        RawAdItem r5 = (RawAdItem) r116.next();     // Catch: Exception -> L47
        if (r5.getStatus() == 1) goto L25;
    L45:
        C1304d1 r6 = null;
    L49:
        if (r6 == null) goto L21;
        r4.add(r6);     // Catch: Exception -> L47
        goto L21
    L25:
        if (r5.getImageUrl().length() == 0) goto L45;
        if (r5.getLinkUrl().length() == 0) goto L45;
        String r62 = r5.getEndTime();     // Catch: Exception -> L55
        if (r62 == null) goto L46;
        if (r62.length() == 0) goto L46;
        if (r62.equals(AbstractC0295Gu.m625r(-826291578206261L)) == true) goto L46;
        Date r63 = r3.parse(r62);     // Catch: Exception -> L55
        if (r63 == null) goto L42;
        long r64 = r63.getTime();     // Catch: Exception -> L55
    L44:
        if (r64 > r12) goto L46;
    L42:
        r64 = 0;
    L46:
        r6 = new C1304d1(r5.getId(), r5.getImageUrl(), r5.getLinkUrl(), r5.getSortOrder());     // Catch: Exception -> L47
        goto L49
    L51:
        return AbstractC2453ra.m4904n0(r4, new C0963Wb(5));
    L69:
        return r102;
    L68:
        return r102;
    L67:
        return r102;
    L5:
        e = move-exception;
        AbstractC0295Gu.m625r(-826622290688053L);     // Catch: Exception -> L47
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L47
        AbstractC0295Gu.m625r(-826738254805045L);     // Catch: Exception -> L47
        e.getMessage();     // Catch: Exception -> L47
        r112 = null;
    L47:
        e = move-exception;
        e.printStackTrace();
        return r102;
    }

    /* JADX INFO: renamed from: e */
    public static final List m4302e(C2112jq r11, String r12) {
        C0452Kf r112 = C0452Kf.f1484a;
        C0029Am r0 = AbstractC2809zm.f9524a;     // Catch: Exception -> L5
        r0.getClass();     // Catch: Exception -> L5
        Object r122 = r0.m4550a(ApiResponse.Companion.serializer(AnnouncementsWrapper.Companion.serializer()), r12);     // Catch: Exception -> L5
    L8:
        ApiResponse r123 = (ApiResponse) r122;     // Catch: Exception -> L28
        if (r123 != null) goto L12;
        return r112;
    L12:
        if (r123.getCode() != 0) goto L40;
        AnnouncementsWrapper r124 = (AnnouncementsWrapper) r123.getData();     // Catch: Exception -> L28
        if (r124 == null) goto L41;
        List<AnnouncementItem> r125 = r124.getData();     // Catch: Exception -> L28
        if (r125 == null) goto L42;
        ArrayList r02 = new ArrayList(AbstractC2539ta.m5019d0(r125, 10));     // Catch: Exception -> L28
        Iterator<T> r126 = r125.iterator();     // Catch: Exception -> L28
    L20:
        if (r126.hasNext() == false) goto L43;
        AnnouncementItem r1 = (AnnouncementItem) r126.next();     // Catch: Exception -> L28
        String r3 = r1.getId();     // Catch: Exception -> L28
        String r4 = r1.getTitle();     // Catch: Exception -> L28
        String r5 = r1.getContent();     // Catch: Exception -> L28
        String r6 = r1.getType();     // Catch: Exception -> L28
        boolean r7 = r1.isPopup();     // Catch: Exception -> L28
        boolean r8 = r1.getCanClose();     // Catch: Exception -> L28
        String r9 = r1.getTargetUsers();     // Catch: Exception -> L28
        List<String> r13 = r1.getBetaUserList();     // Catch: Exception -> L28
        if (r13 != null) goto L25;
        List<String> r10 = r112;
    L26:
        r02.add(new C1335dq(r3, r4, r5, r6, r7, r8, r9, r10));     // Catch: Exception -> L28
        goto L20
    L25:
        r10 = r13;
        goto L26
    L43:
        return r02;
    L42:
        return r112;
    L41:
        return r112;
    L40:
        return r112;
    L28:
        e = move-exception;
        e.printStackTrace();
        return r112;
    L5:
        e = move-exception;
        AbstractC0295Gu.m625r(-823611518613557L);     // Catch: Exception -> L28
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L28
        AbstractC0295Gu.m625r(-823727482730549L);     // Catch: Exception -> L28
        e.getMessage();     // Catch: Exception -> L28
        r122 = null;
        goto L8
    }

    /* JADX INFO: renamed from: f */
    public static final void m4303f(C2112jq r11, C1335dq r12, C1389f r13) {
        Context r0 = r11.getContext();
        AbstractC0295Gu.m625r(-823744662599733L);
        ScrollView r1 = new ScrollView(r11.getContext());
        r1.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
        TextView r3 = new TextView(r11.getContext());
        r3.setText(r12.f4811c);
        r3.setTextSize(15.0f);
        r3.setTextColor(r3.getContext().getColor(R.color.textSummary));
        r3.setLineSpacing(8.0f, 1.0f);
        r1.addView(r3);
        AlertDialog r9 = new AlertDialog.Builder(r11.getContext(), android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(r12.f4810b).setView(r1).setPositiveButton(AbstractC0295Gu.m625r(-824543526516789L), null).setNegativeButton(AbstractC0295Gu.m625r(-824556411418677L), new DialogInterfaceOnClickListenerC0536Md(2, (Activity) r0)).setCancelable(false).create();
        r9.show();
        TextView r112 = (TextView) r9.findViewById(android.R.id.title);
        if (r112 == null) goto L5;
        r112.setTextSize(18.0f);
        r112.setTextColor(r112.getContext().getColor(R.color.textTitle));
        r112.setTypeface(Typeface.DEFAULT_BOLD);
        r112.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
    L5:
        Button r02 = r9.getButton(-1);
        if (r02 == null) goto L8;
        r02.setTextColor(r02.getContext().getColor(R.color.colorPrimary));
        r02.setTextSize(16.0f);
        r02.setAllCaps(false);
    L8:
        Button r03 = r9.getButton(-2);
        if (r03 == null) goto L11;
        r03.setTextColor(r03.getContext().getColor(R.color.colorError));
        r03.setTextSize(16.0f);
        r03.setAllCaps(false);
    L11:
        Window r04 = r9.getWindow();
        if (r04 == null) goto L14;
        GradientDrawable r14 = new GradientDrawable();
        r14.setColor(r04.getContext().getColor(R.color.colorForeground));
        r14.setCornerRadius(AbstractC0295Gu.m616i(16));
        r04.setBackgroundDrawable(r14);
        r04.setLayout((int) (((double) r04.getContext().getResources().getDisplayMetrics().widthPixels) * 0.9d), (int) (((double) r04.getContext().getResources().getDisplayMetrics().heightPixels) * 0.7d));
        r04.setDimAmount(0.5f);
    L14:
        Button r7 = r9.getButton(-1);
        r7.setEnabled(false);
        r7.setText(AbstractC0295Gu.m625r(-824569296320565L));
        C0339Hv r6 = new C0339Hv();
        r6.f1147a = 3;
        Handler r8 = new Handler(Looper.getMainLooper());
        r8.postDelayed(new RunnableC2069iq(r6, r7, r8, r9, r13), 1000);
    }

    /* JADX INFO: renamed from: g */
    public static int m4304g(int r2, float r3) {
        return Color.argb((int) (255 * r3), Color.red(r2), Color.green(r2), Color.blue(r2));
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-823907871356981L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-823946526062645L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r4) {
        AbstractC0295Gu.m625r(-823869216651317L);
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0562N2(19, this), 500);
    }

    @Override // p000.InterfaceC0972Wk
    public View getContentView() {
        return this;
    }

    @Override // p000.InterfaceC0972Wk
    public String getTitle() {
        return AbstractC0295Gu.m625r(-823985180768309L);
    }

    public int getViewId() {
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public final GradientDrawable m4305h() {
        GradientDrawable r0 = new GradientDrawable();
        r0.setColor(getContext().getColor(R.color.colorForeground));
        r0.setCornerRadius(AbstractC0295Gu.m616i(16));
        return r0;
    }

    /* JADX INFO: renamed from: i */
    public final LinearLayout m4306i(String r16, String r17, String r18, int r19, String r20, InterfaceC0884Ui r21) {
        LinearLayout r1 = new LinearLayout(getContext());
        r1.setOrientation(0);
        GradientDrawable r3 = new GradientDrawable();
        r3.setColor(r1.getContext().getColor(R.color.colorForeground));
        r3.setCornerRadius(AbstractC0295Gu.m616i(16));
        r1.setBackground(r3);
        r1.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        LinearLayout.LayoutParams r6 = new LinearLayout.LayoutParams(-1, -2);
        r6.bottomMargin = AbstractC0295Gu.m616i(14);
        r1.setLayoutParams(r6);
        LinearLayout r62 = new LinearLayout(r1.getContext());
        r62.setGravity(17);
        r62.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(52), AbstractC0295Gu.m616i(52)));
        int r10 = m4304g(r19, 0.15f);
        GradientDrawable r11 = new GradientDrawable();
        r11.setColor(r10);
        r11.setCornerRadius(AbstractC0295Gu.m616i(14));
        r62.setBackground(r11);
        TextView r7 = new TextView(r62.getContext());
        r7.setText(r16);
        r7.setTextSize(26.0f);
        r7.setGravity(17);
        r62.addView(r7);
        r1.addView(r62);
        LinearLayout r63 = new LinearLayout(r1.getContext());
        r63.setOrientation(1);
        LinearLayout.LayoutParams r102 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        r102.setMarginStart(AbstractC0295Gu.m616i(16));
        r63.setLayoutParams(r102);
        TextView r103 = new TextView(r63.getContext());
        r103.setText(r17);
        r103.setTextSize(16.0f);
        r103.setTextColor(r103.getContext().getColor(R.color.textTitle));
        Typeface r112 = Typeface.DEFAULT_BOLD;
        r103.setTypeface(r112);
        r63.addView(r103);
        TextView r104 = new TextView(r63.getContext());
        r104.setText(r18);
        r104.setTextSize(14.0f);
        r104.setTextColor(r104.getContext().getColor(R.color.textSummary));
        r104.setPadding(0, AbstractC0295Gu.m616i(4), 0, 0);
        r63.addView(r104);
        r1.addView(r63);
        TextView r2 = new TextView(r1.getContext());
        r2.setText(r20);
        r2.setTextSize(14.0f);
        r2.setTypeface(r112);
        r2.setTextColor(r19);
        r2.setGravity(17);
        int r64 = m4304g(r19, 0.12f);
        ColorStateList r9 = ColorStateList.valueOf(m4304g(r19, 0.2f));
        GradientDrawable r105 = new GradientDrawable();
        r105.setColor(r64);
        r105.setCornerRadius(AbstractC0295Gu.m616i(20));
        r105.setStroke(AbstractC0295Gu.m616i(1), m4304g(r19, 0.3f));
        r2.setBackground(new RippleDrawable(r9, r105, null));
        LinearLayout.LayoutParams r0 = new LinearLayout.LayoutParams(-2, -2);
        r0.gravity = 16;
        r0.setMarginStart(AbstractC0295Gu.m616i(16));
        r2.setLayoutParams(r0);
        r2.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(10));
        r2.setClickable(true);
        r2.setFocusable(true);
        r2.setOnClickListener(new ViewOnClickListenerC0462Kp(1, r21));
        r1.addView(r2);
        r1.setBackground(new RippleDrawable(ColorStateList.valueOf(520093696), r1.getBackground(), null));
        r1.setClickable(true);
        return r1;
    }

    /* JADX INFO: renamed from: j */
    public final RippleDrawable m4307j() {
        ColorStateList r0 = ColorStateList.valueOf(getContext().getColor(R.color.rippleColor));
        GradientDrawable r1 = new GradientDrawable();
        r1.setShape(0);
        r1.setCornerRadius(AbstractC0295Gu.m616i(20));
        return new RippleDrawable(r0, null, r1);
    }

    /* JADX INFO: renamed from: k */
    public final void m4308k(String r4) {
        Context r0 = getContext();     // Catch: Exception -> L4
        AbstractC0295Gu.m625r(-821382430586933L);     // Catch: Exception -> L4
        C1456gf.m2803U(r0, r4);     // Catch: Exception -> L4
        return;
    L4:
        AbstractC0213Ey.m413k(-821451150063669L, getContext(), 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m4309l(final ArrayList r18, final int r19) {
        if (r19 >= r18.size()) goto L23;
        C1335dq r5 = (C1335dq) r18.get(r19);
        ScrollView r6 = new ScrollView(getContext());
        r6.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        LinearLayout r7 = new LinearLayout(getContext());
        r7.setOrientation(1);
        TextView r9 = new TextView(getContext());
        r9.setText(r5.f4810b);
        r9.setTextSize(16.0f);
        r9.setTextColor(r9.getContext().getColor(R.color.textTitle));
        Typeface r11 = Typeface.DEFAULT_BOLD;
        r9.setTypeface(r11);
        r9.setPadding(0, 0, 0, AbstractC0295Gu.m616i(8));
        r7.addView(r9);
        TextView r92 = new TextView(getContext());
        r92.setText(r5.f4811c);
        r92.setTextSize(14.0f);
        r92.setTextColor(r92.getContext().getColor(R.color.textSummary));
        r92.setLineSpacing(6.0f, 1.0f);
        r92.setPadding(0, 0, 0, AbstractC0295Gu.m616i(16));
        r92.setTextIsSelectable(true);
        r7.addView(r92);
        r6.addView(r7);
        AlertDialog.Builder r62 = new AlertDialog.Builder(getContext(), android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-824599361091637L)).setView(r6);
        if (r5.f4814f == false) goto L8;
        r62.setPositiveButton(AbstractC0295Gu.m625r(-824612245993525L), new DialogInterfaceOnClickListenerC0536Md(1, r5));
        r62.setOnDismissListener(new DialogInterfaceOnDismissListenerC1187aq(this, r18, r19));
    L9:
        final AlertDialog r52 = r62.create();
        if (r19 >= (r18.size() - 1)) goto L12;
        r62.setNegativeButton(AbstractC0295Gu.m625r(-824633720830005L), new DialogInterfaceOnClickListenerC1231bq(r52, this, r18, r19));
    L12:
        r52.show();
        TextView r1 = (TextView) r52.findViewById(android.R.id.title);
        if (r1 == null) goto L15;
        r1.setTextSize(18.0f);
        r1.setTextColor(r1.getContext().getColor(R.color.textTitle));
        r1.setTypeface(r11);
        r1.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
    L15:
        Button r12 = r52.getButton(-1);
        if (r12 == null) goto L18;
        r12.setTextColor(r12.getContext().getColor(R.color.colorPrimary));
        r12.setTextSize(16.0f);
        r12.setAllCaps(false);
    L18:
        Window r13 = r52.getWindow();
        if (r13 == null) goto L22;
        GradientDrawable r2 = new GradientDrawable();
        r2.setColor(r13.getContext().getColor(R.color.colorForeground));
        r2.setCornerRadius(AbstractC0295Gu.m616i(16));
        r13.setBackgroundDrawable(r2);
        r13.setLayout((int) (((double) r13.getContext().getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        r13.setDimAmount(0.5f);
        return;
    L22:
        return;
    L8:
        r62.setCancelable(false);
        r62.setOnDismissListener(new DialogInterfaceOnDismissListenerC0824T7(1, this));
        goto L9
    }
}
