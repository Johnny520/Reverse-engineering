package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import com.youth.banner.config.BannerConfig;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.AboutData;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.AppInfo;
import io.github.cherrywechat.network.model.Feature;
import io.github.cherrywechat.network.model.Link;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: classes.dex */
public final class C2213m extends LinearLayout implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public final int f7701a;

    /* JADX INFO: renamed from: b */
    public final int f7702b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f7703c;

    /* JADX INFO: renamed from: d */
    public List f7704d;

    /* JADX INFO: renamed from: e */
    public List f7705e;

    static {
        AbstractC0295Gu.m625r(-814248489908277L);
        AbstractC0295Gu.m625r(-814278554679349L);
        AbstractC0295Gu.m625r(-814308619450421L);
        AbstractC0295Gu.m625r(-814334389254197L);
        AbstractC0295Gu.m625r(-814347274156085L);
        AbstractC0295Gu.m625r(-814368748992565L);
        AbstractC0295Gu.m625r(-814390223829045L);
        AbstractC0295Gu.m625r(-814415993632821L);
        AbstractC0295Gu.m625r(-814437468469301L);
        AbstractC0295Gu.m625r(-814458943305781L);
        AbstractC0295Gu.m625r(-812831150700597L);
        AbstractC0295Gu.m625r(-812852625537077L);
        AbstractC0295Gu.m625r(-812869805406261L);
        AbstractC0295Gu.m625r(-812912755079221L);
        AbstractC0295Gu.m625r(-812942819850293L);
        AbstractC0295Gu.m625r(-812968589654069L);
    }

    public C2213m(Context r12) {
        AbstractC0295Gu.m625r(-817718823483445L);
        super(r12);
        this.f7701a = AbstractC0295Gu.m616i(Integer.valueOf(BannerConfig.SCROLL_TIME));
        this.f7702b = AbstractC0295Gu.m616i(16);
        setOrientation(1);
        setBackgroundColor(r12.getColor(R.color.colorBackground));
        ScrollView r1 = new ScrollView(r12);
        r1.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r1.setVerticalScrollBarEnabled(false);
        r1.setOverScrollMode(2);
        addView(r1);
        LinearLayout r5 = new LinearLayout(r12);
        r5.setOrientation(1);
        r5.setGravity(1);
        r5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r5.setPadding(0, 0, 0, AbstractC0295Gu.m616i(32));
        this.f7703c = r5;
        r1.addView(r5);
        LinearLayout r122 = new LinearLayout(getContext());
        r122.setOrientation(1);
        r122.setGravity(17);
        r122.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View r52 = new Space(r122.getContext());
        r52.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(20)));
        r122.addView(r52);
        LinearLayout r53 = new LinearLayout(r122.getContext());
        r53.setOrientation(1);
        r53.setGravity(17);
        r53.setPadding(0, AbstractC0295Gu.m616i(48), 0, AbstractC0295Gu.m616i(48));
        GradientDrawable r7 = new GradientDrawable();
        r7.setColor(r53.getContext().getColor(R.color.colorForeground));
        r7.setCornerRadius(AbstractC0295Gu.m616i(12));
        r53.setBackground(r7);
        r53.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        FrameLayout r72 = new FrameLayout(r53.getContext());
        r72.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(100), AbstractC0295Gu.m616i(100)));
        View r8 = new ImageView(r72.getContext());
        r8.setId(View.generateViewId());
        r8.setTag(AbstractC0295Gu.m625r(-817753183221813L));
        FrameLayout.LayoutParams r9 = new FrameLayout.LayoutParams(-1, -1);
        r9.gravity = 17;
        r8.setLayoutParams(r9);
        r8.setOutlineProvider(new C2122k(0));
        r8.setClipToOutline(true);
        r72.addView(r8);
        r53.addView(r72);
        TextView r73 = new TextView(r53.getContext());
        r73.setId(View.generateViewId());
        r73.setTag(AbstractC0295Gu.m625r(-816142570485813L));
        r73.setTextSize(26.0f);
        r73.setTextColor(r73.getContext().getColor(R.color.textTitle));
        r73.setTypeface(Typeface.DEFAULT_BOLD);
        r73.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(8));
        r73.setGravity(17);
        r73.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r53.addView(r73);
        TextView r74 = new TextView(r53.getContext());
        r74.setId(View.generateViewId());
        r74.setTag(AbstractC0295Gu.m625r(-816181225191477L));
        r74.setTextSize(16.0f);
        r74.setTextColor(r74.getContext().getColor(R.color.textSummary));
        r74.setLetterSpacing(0.02f);
        r74.setGravity(17);
        r74.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r53.addView(r74);
        r122.addView(r53);
        m4452i(r122);
        m4451h(AbstractC0295Gu.m625r(-816237059766325L), AbstractC2496sa.m4977b0(new C2078j[]{new C2078j(AbstractC0295Gu.m625r(-816258534602805L), AbstractC0295Gu.m625r(-816280009439285L), new C1345e(this, 0)), new C2078j(AbstractC0295Gu.m625r(-815846217742389L), AbstractC1450gG.f5068b, new C1345e(this, 1)), new C2078j(AbstractC0295Gu.m625r(-815867692578869L), AbstractC0295Gu.m625r(-815889167415349L), new C1345e(this, 2))}));
        C1498hd r123 = AbstractC1499he.f5282a;
        C2283nk r124 = AbstractC1106Zp.f3500a;
        C1419fm r0 = new C1419fm();
        r124.getClass();
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1406fG.m2700Z(r124, r0)), new C2170l(this, null, 0), 3);
        C0452Kf r125 = C0452Kf.f1484a;
        this.f7704d = r125;
        this.f7705e = r125;
    }

    /* JADX INFO: renamed from: a */
    public static final AboutData m4445a(C2213m r3, String r4) {
        C0029Am r0 = AbstractC2809zm.f9524a;     // Catch: Exception -> L5
        r0.getClass();     // Catch: Exception -> L5
        Object r42 = r0.m4550a(ApiResponse.Companion.serializer(AboutData.Companion.serializer()), r4);     // Catch: Exception -> L5
    L8:
        ApiResponse r43 = (ApiResponse) r42;     // Catch: Exception -> L16
        if (r43 != null) goto L12;
        return null;
    L12:
        if (r43.getCode() != 0) goto L23;
        return (AboutData) r43.getData();
    L23:
        return null;
    L16:
        e = move-exception;
        AbstractC0295Gu.m625r(-813857647884341L);
        e.getMessage();
        return null;
    L5:
        e = move-exception;
        AbstractC0295Gu.m625r(-813724503898165L);     // Catch: Exception -> L16
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L16
        AbstractC0295Gu.m625r(-813840468015157L);     // Catch: Exception -> L16
        e.getMessage();     // Catch: Exception -> L16
        r42 = null;
        goto L8
    }

    /* JADX INFO: renamed from: e */
    public static final void m4446e(C2213m r2, AppInfo r3) {
        TextView r0 = (TextView) r2.findViewWithTag(AbstractC0295Gu.m625r(-814141115725877L));
        if (r0 == null) goto L5;
        r0.setText(r3.getAppName());
    L5:
        TextView r02 = (TextView) r2.findViewWithTag(AbstractC0295Gu.m625r(-814179770431541L));
        if (r02 == null) goto L8;
        r02.setText(r3.getAppSubtitle());
    L8:
        ImageView r03 = (ImageView) r2.findViewWithTag(AbstractC0295Gu.m625r(-813685849192501L));
        if (r03 != null) goto L11;
        return;
    L11:
        if (r3.getLogoUrl().length() <= 0) goto L15;
        ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2414c(r2.getContext()).m2833n(r3.getLogoUrl()).m5324s(new C2446r9(), true)).m5312f(android.R.drawable.ic_menu_compass)).m2298A(r03);
        return;
    }

    /* JADX INFO: renamed from: f */
    public static final void m4447f(C2213m r7, List r8) {
        C0253Fv r0 = new C0253Fv();
        LinearLayout r1 = new LinearLayout(r7.getContext());
        r1.setOrientation(1);
        GradientDrawable r3 = new GradientDrawable();
        r3.setColor(r1.getContext().getColor(R.color.colorForeground));
        r3.setCornerRadius(AbstractC0295Gu.m616i(12));
        r1.setBackground(r3);
        LinearLayout.LayoutParams r32 = new LinearLayout.LayoutParams(-1, -2);
        r32.bottomMargin = AbstractC0295Gu.m616i(16);
        r1.setLayoutParams(r32);
        r1.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        r1.setClipToOutline(true);
        TextView r2 = new TextView(r7.getContext());
        r2.setText(AbstractC0295Gu.m625r(-814119640889397L));
        r2.setTextSize(15.0f);
        r2.setTextColor(r2.getContext().getColor(R.color.textSummary));
        r2.setTypeface(Typeface.DEFAULT_BOLD);
        r2.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(12));
        r7.m4452i(r2);
        m4450l(r1, r0, r8, r7);
        r7.m4452i(r1);
    }

    /* JADX INFO: renamed from: g */
    public static final void m4448g(C2213m r9, List r10) {
        String r0 = AbstractC0295Gu.m625r(-813913482459189L);
        ArrayList r1 = new ArrayList(2);
        ArrayList r2 = new ArrayList(AbstractC2539ta.m5019d0(r10, 10));
        Iterator r102 = r10.iterator();
    L4:
        if (r102.hasNext() == false) goto L6;
        Link r3 = (Link) r102.next();
        r2.add(new C2078j(r3.getTitle(), r3.getDescription(), new C1389f(0, r9, r3)));
        goto L4
    L6:
        Object[] r103 = r2.toArray(new C2078j[0]);
        if (r103 != null) goto L10;
    L12:
        r1.add(new C2078j(AbstractC0295Gu.m625r(-814489008076853L), AbstractC0295Gu.m625r(-814506187946037L), new C1345e(r9, 3)));
        r9.m4451h(r0, AbstractC2496sa.m4977b0(r1.toArray(new C2078j[r1.size()])));
        return;
    L10:
        if (r103.length <= 0) goto L12;
        r1.ensureCapacity(r1.size() + r103.length);
        Collections.addAll(r1, r103);
        goto L12
    }

    /* JADX INFO: renamed from: k */
    public static void m4449k(AlertDialog r9) {
        TextView r3 = (TextView) r9.findViewById(android.R.id.title);
        if (r3 == null) goto L5;
        r3.setTextSize(18.0f);
        r3.setTextColor(r3.getContext().getColor(R.color.textTitle));
        r3.setTypeface(Typeface.DEFAULT_BOLD);
        r3.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(16));
    L5:
        TextView r32 = (TextView) r9.findViewById(android.R.id.message);
        if (r32 == null) goto L8;
        r32.setTextSize(15.0f);
        r32.setTextColor(r32.getContext().getColor(R.color.textSummary));
        r32.setLineSpacing(8.0f, 1.0f);
        r32.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
    L8:
        Button r33 = r9.getButton(-1);
        if (r33 == null) goto L11;
        r33.setTextColor(r33.getContext().getColor(R.color.colorPrimary));
        r33.setTextSize(16.0f);
        r33.setAllCaps(false);
        r33.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8));
    L11:
        Window r92 = r9.getWindow();
        if (r92 == null) goto L15;
        GradientDrawable r1 = new GradientDrawable();
        r1.setColor(r92.getContext().getColor(R.color.colorForeground));
        r1.setCornerRadius(AbstractC0295Gu.m616i(16));
        r92.setBackgroundDrawable(r1);
        r92.setWindowAnimations(android.R.style.Animation.Dialog);
        r92.setDimAmount(0.5f);
        return;
    }

    /* JADX INFO: renamed from: l */
    public static final void m4450l(LinearLayout r18, C0253Fv r19, List r20, C2213m r21) {
        int r4 = 16;
        r18.removeAllViews();
        int r9 = 4;
        if (r19.f825a == false) goto L5;
        List r8 = r20;
        List r10 = r8;
    L6:
        Iterator r102 = r10.iterator();
        int r12 = 0;
    L8:
        if (r102.hasNext() == false) goto L19;
        Object r13 = r102.next();
        int r16 = r12 + 1;
        if (r12 < 0) goto L16;
        Feature r132 = (Feature) r13;
        if (r12 <= 0) goto L14;
        int r17 = r9;
        View r122 = new View(r21.getContext());
        r122.setBackgroundColor(r122.getContext().getColor(R.color.dividerColor));
        LinearLayout.LayoutParams r92 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
        r92.setMarginStart(AbstractC0295Gu.m616i(16));
        r122.setLayoutParams(r92);
        r18.addView(r122);
    L15:
        LinearLayout r93 = new LinearLayout(r21.getContext());
        r93.setOrientation(0);
        r93.setGravity(r4);
        r93.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16));
        LinearLayout r42 = new LinearLayout(r93.getContext());
        r42.setOrientation(1);
        r42.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r123 = new TextView(r42.getContext());
        r123.setText(r132.getTitle());
        r123.setTextSize(16.0f);
        r123.setTextColor(r123.getContext().getColor(R.color.textTitle));
        r42.addView(r123);
        TextView r124 = new TextView(r42.getContext());
        r124.setText(r132.getDescription());
        r124.setTextSize(14.0f);
        r124.setTextColor(r124.getContext().getColor(R.color.textSummary));
        r124.setPadding(0, AbstractC0295Gu.m616i(Integer.valueOf(r17)), 0, 0);
        r42.addView(r124);
        r93.addView(r42);
        r18.addView(r93);
        r12 = r16;
        r9 = r17;
        r4 = 16;
        goto L8
    L14:
        r17 = r9;
        goto L15
    L16:
        AbstractC2496sa.m4978c0();
        throw null;
    L19:
        if (r8.size() <= r9) goto L31;
        View r3 = new View(r21.getContext());
        r3.setBackgroundColor(r3.getContext().getColor(R.color.dividerColor));
        LinearLayout.LayoutParams r43 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
        r43.setMarginStart(AbstractC0295Gu.m616i(16));
        r3.setLayoutParams(r43);
        r18.addView(r3);
        TextView r7 = new TextView(r21.getContext());
        if (r19.f825a == false) goto L24;
        long r32 = -814205540235317L;
    L25:
        r7.setText(AbstractC0295Gu.m625r(r32));
        r7.setTextSize(15.0f);
        r7.setTextColor(r7.getContext().getColor(R.color.colorPrimary));
        r7.setGravity(17);
        r7.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
        StateListDrawable r0 = new StateListDrawable();
        r0.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(r7.getContext().getColor(R.color.pressedStateColor)));
        r0.addState(new int[0], new ColorDrawable(r7.getContext().getColor(R.color.colorForeground)));
        r7.setBackground(r0);
        r7.setClickable(true);
        r7.setOnClickListener(new ViewOnClickListenerC1433g(r19, r18, r8, r21, 0));
        r18.addView(r7);
        return;
    L24:
        r32 = -814218425137205L;
        goto L25
    L31:
        return;
    L5:
        r8 = r20;
        r10 = AbstractC2453ra.m4905o0(4, r8);
        goto L6
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-814587792324661L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-814626447030325L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r3) {
        AbstractC0295Gu.m625r(-814549137618997L);
    }

    @Override // p000.InterfaceC0972Wk
    public View getContentView() {
        return this;
    }

    @Override // p000.InterfaceC0972Wk
    public String getTitle() {
        return AbstractC0295Gu.m625r(-814665101735989L);
    }

    public int getViewId() {
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public final void m4451h(String r17, List r18) {
        TextView r2 = new TextView(getContext());
        r2.setText(r17);
        float r3 = 15.0f;
        r2.setTextSize(15.0f);
        r2.setTextColor(r2.getContext().getColor(R.color.textSummary));
        r2.setTypeface(Typeface.DEFAULT_BOLD);
        r2.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(12));
        m4452i(r2);
        LinearLayout r22 = new LinearLayout(getContext());
        r22.setOrientation(1);
        GradientDrawable r7 = new GradientDrawable();
        r7.setColor(r22.getContext().getColor(R.color.colorForeground));
        r7.setCornerRadius(AbstractC0295Gu.m616i(12));
        r22.setBackground(r7);
        int r72 = -1;
        LinearLayout.LayoutParams r6 = new LinearLayout.LayoutParams(-1, -2);
        int r11 = 16;
        r6.bottomMargin = AbstractC0295Gu.m616i(16);
        r22.setLayoutParams(r6);
        r22.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        r22.setClipToOutline(true);
        Iterator r62 = r18.iterator();
        int r13 = 0;
    L4:
        if (r62.hasNext() == false) goto L16;
        Object r14 = r62.next();
        int r15 = r13 + 1;
        if (r13 < 0) goto L14;
        C2078j r142 = (C2078j) r14;
        if (r13 <= 0) goto L10;
        View r132 = new View(r22.getContext());
        r132.setBackgroundColor(r132.getContext().getColor(R.color.dividerColor));
        LinearLayout.LayoutParams r5 = new LinearLayout.LayoutParams(r72, AbstractC0295Gu.m616i(1));
        r5.setMarginStart(AbstractC0295Gu.m616i(16));
        r132.setLayoutParams(r5);
        r22.addView(r132);
    L10:
        LinearLayout r52 = new LinearLayout(r22.getContext());
        r52.setOrientation(0);
        r52.setGravity(r11);
        r52.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(16));
        StateListDrawable r73 = new StateListDrawable();
        r73.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(r52.getContext().getColor(R.color.pressedStateColor)));
        r73.addState(new int[0], new ColorDrawable(r52.getContext().getColor(R.color.colorForeground)));
        r52.setBackground(r73);
        r52.setClickable(true);
        r52.setFocusable(true);
        TextView r74 = new TextView(r52.getContext());
        r74.setText(r142.f7335a);
        r74.setTextSize(16.0f);
        r74.setTextColor(r74.getContext().getColor(R.color.textTitle));
        r52.addView(r74);
        TextView r75 = new TextView(r52.getContext());
        r75.setText(r142.f7336b);
        r75.setTextSize(r3);
        r75.setTextColor(r75.getContext().getColor(R.color.textSummary));
        r75.setGravity(8388613);
        LinearLayout.LayoutParams r9 = new LinearLayout.LayoutParams(0, -2);
        r9.weight = 1.0f;
        r9.setMarginStart(AbstractC0295Gu.m616i(16));
        r75.setLayoutParams(r9);
        r52.addView(r75);
        if (r142.f7337c == null) goto L13;
        r52.setOnClickListener(new ViewOnClickListenerC1477h(0, r142));
    L13:
        r22.addView(r52);
        r13 = r15;
        r3 = 15.0f;
        r72 = -1;
        r11 = 16;
        goto L4
    L14:
        AbstractC2496sa.m4978c0();
        throw null;
    L16:
        m4452i(r22);
    }

    /* JADX INFO: renamed from: i */
    public final void m4452i(View r5) {
        FrameLayout r0 = new FrameLayout(getContext());
        r0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams r1 = new FrameLayout.LayoutParams(-1, -2);
        int r2 = this.f7702b;
        r1.setMarginStart(r2);
        r1.setMarginEnd(r2);
        int r3 = r0.getContext().getResources().getDisplayMetrics().widthPixels - (r2 * 2);
        r1.width = Math.min(this.f7701a, r3);
        r1.gravity = 1;
        r0.addView(r5, r1);
        this.f7703c.addView(r0);
    }

    /* JADX INFO: renamed from: j */
    public final void m4453j(String r4) {
        if (r4.length() > 0) goto L5;
    L10:
        AbstractC0295Gu.m625r(-814080986183733L);
        return;
    L5:
        if (r4.startsWith(AbstractC0295Gu.m625r(-813939252262965L)) == false) goto L7;
    L8:
        Context r0 = getContext();
        AbstractC0295Gu.m625r(-814012266706997L);
        C1456gf.m2803U(r0, r4);
        return;
    L7:
        if (r4.startsWith(AbstractC0295Gu.m625r(-813973612001333L)) == false) goto L10;
        goto L8
    }
}
