package p000;

import android.app.AlertDialog;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.application.MainApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X7 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0996X7 extends HorizontalScrollView implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public static final C0867U7 f3170f = null;

    /* JADX INFO: renamed from: g */
    public static final C0867U7 f3171g = null;

    /* JADX INFO: renamed from: h */
    public static final C0867U7 f3172h = null;

    /* JADX INFO: renamed from: i */
    public static final C0867U7 f3173i = null;

    /* JADX INFO: renamed from: j */
    public static final C0867U7 f3174j = null;

    /* JADX INFO: renamed from: k */
    public static final C0867U7 f3175k = null;

    /* JADX INFO: renamed from: l */
    public static final C0867U7 f3176l = null;

    /* JADX INFO: renamed from: m */
    public static final C0867U7 f3177m = null;

    /* JADX INFO: renamed from: n */
    public static final C0867U7 f3178n = null;

    /* JADX INFO: renamed from: a */
    public final View f3179a;

    /* JADX INFO: renamed from: b */
    public final AdapterView.OnItemClickListener f3180b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3181c;

    /* JADX INFO: renamed from: d */
    public C0953W7 f3182d;

    /* JADX INFO: renamed from: e */
    public final LinearLayout f3183e;

    static {
        f3170f = new C0867U7(AbstractC0295Gu.m625r(-497009320523829L), R.drawable.ic_panel_reply, AbstractC0295Gu.m625r(-497030795360309L), 0, -1, -1);
        f3171g = new C0867U7(AbstractC0295Gu.m625r(-497172529281077L), R.drawable.ic_panel_pic, AbstractC0295Gu.m625r(-497185414182965L), 1, 0, 0);
        f3172h = new C0867U7(AbstractC0295Gu.m625r(-497868313983029L), R.drawable.ic_panel_camera, AbstractC0295Gu.m625r(-497881198884917L), 2, 1, 0);
        f3173i = new C0867U7(AbstractC0295Gu.m625r(-498027227772981L), R.drawable.ic_panel_voipvoice, AbstractC0295Gu.m625r(-498048702609461L), 3, 2, 0);
        f3174j = new C0867U7(AbstractC0295Gu.m625r(-497657860585525L), R.drawable.ic_panel_location, AbstractC0295Gu.m625r(-497670745487413L), 4, 3, 0);
        f3175k = new C0867U7(AbstractC0295Gu.m625r(-496176096868405L), R.drawable.ic_panel_luckymoney, AbstractC0295Gu.m625r(-496188981770293L), 5, 4, 0);
        f3176l = new C0867U7(AbstractC0295Gu.m625r(-496352190527541L), R.drawable.ic_panel_transfer, AbstractC0295Gu.m625r(-496365075429429L), 6, 6, 0);
        f3177m = new C0867U7(AbstractC0295Gu.m625r(-495969938438197L), R.drawable.ic_panel_fav, AbstractC0295Gu.m625r(-495991413274677L), 7, 2, 1);
        f3178n = new C0867U7(AbstractC0295Gu.m625r(-496124557260853L), R.drawable.ic_panel_file_explorer, AbstractC0295Gu.m625r(-496137442162741L), 8, 0, 1);
    }

    public ViewOnClickListenerC0996X7(Context r18, View r19) {
        AbstractC0295Gu.m625r(-501222683441205L);
        AbstractC0295Gu.m625r(-501257043179573L);
        super(r18);
        this.f3179a = r19;
        String r3 = AbstractC0295Gu.m625r(-501304287819829L);
        AbstractC0295Gu.m625r(-579464102672437L);
        int r5 = AbstractC1450gG.f5067a;
        int r52 = 11;
        C2428qs r4 = new C2428qs(11, AbstractC1406fG.m2718r0(r3));
        r4.m4886x(new Object[]{Context.class, AttributeSet.class});
        Object r32 = r4.m4885w(new Object[]{r19.getContext(), null});
        C2648vx r42 = new C2648vx();
        r42.f9164c = r19;
        r42.f9163b = r19.getClass();
        r42.m5182e(AbstractC0295Gu.m625r(-500930625665077L));
        Object r43 = r42.m5178a();
        Field[] r8 = r43.getClass().getFields();
        AbstractC0295Gu.m625r(-499461746849845L);
        int r9 = r8.length;
        int r11 = 0;
    L3:
        if (r11 >= r9) goto L12;
        Field r12 = r8[r11];
        if (AbstractC0585Nj.m1134a(r12.getType(), Integer.TYPE) == false) goto L11;
        if (Modifier.isFinal(r12.getModifiers()) == true) goto L11;
        if (AbstractC0585Nj.m1134a(r12.get(r43), 0) == false) goto L11;
        r12.set(r43, 4);
    L11:
        r11 = r11 + 1;
        goto L3
    L12:
        int r82 = AbstractC1450gG.f5067a;
        Field[] r83 = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-499526171359285L)).getFields();
        AbstractC0295Gu.m625r(-499702265018421L);
        int r92 = r83.length;
        int r112 = 0;
    L13:
        if (r112 >= r92) goto L27;
        Field r122 = r83[r112];
        Class<?> r13 = r122.getType();
        if (r13.isInterface() == false) goto L24;
        String r14 = r13.getName();
        AbstractC0295Gu.m625r(-499216933713973L);
        if (AbstractC2564tz.m5051L(r14, AbstractC0295Gu.m625r(-499272768288821L), false) == true) goto L24;
        C2648vx r142 = new C2648vx();
        if ((r43 instanceof Class) == false) goto L21;
        r142.f9163b = (Class) r43;
    L22:
        r142.f9165d = r13;
        r122.set(r32, r142.m5178a());
    L26:
        r112 = r112 + 1;
        r52 = 11;
        goto L13
    L21:
        r142.f9164c = r43;
        r142.f9163b = r43.getClass();
    L24:
        if (AbstractC0585Nj.m1134a(r13.getSuperclass(), BaseAdapter.class) == false) goto L26;
        AbstractC0295Gu.m625r(-579988088682549L);
        C2428qs r143 = new C2428qs(r52, r13);
        r143.m4886x(new Object[]{AbstractC0295Gu.m625r(-499307128027189L), Context.class, List.class, Map.class, ArrayList.class});
        r122.set(r32, r143.m4885w(new Object[]{r32, r19.getContext(), new ArrayList(), new HashMap(), new ArrayList()}));
        goto L26
    L27:
        C2648vx r2 = new C2648vx();
        if ((r32 instanceof Class) == false) goto L30;
        r2.f9163b = (Class) r32;
    L35:
        r2.f9165d = SharedPreferences.class;
        Context r44 = MainApplication.f5549a;
        if (r44 != null) goto L42;
        r44 = C1456gf.f5172p;
        if (r44 != null) goto L42;
        r44 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L42:
        String r45 = r44.getApplicationInfo().packageName;
        AbstractC0295Gu.m625r(-837656061671477L);
        r2.m5181d(r18.getSharedPreferences(r45.concat(AbstractC0295Gu.m625r(-500032977500213L)), 0));
        AbstractC0295Gu.m625r(-500088812075061L);
        View r33 = (View) r32;
        C2648vx r22 = new C2648vx();
        r22.f9164c = r33;
        if (r33 == null) goto L45;
        Class<?> r7 = r33.getClass();
    L46:
        r22.f9163b = r7;
        r22.f9165d = AdapterView.OnItemClickListener.class;
        this.f3180b = (AdapterView.OnItemClickListener) r22.m5178a();
        this.f3181c = new ArrayList();
        setHorizontalScrollBarEnabled(false);
        LinearLayout r23 = new LinearLayout(r18);
        new LinearLayout(r18).setOrientation(0);
        this.f3183e = r23;
        FrameLayout.LayoutParams r1 = new FrameLayout.LayoutParams(-1, AbstractC0295Gu.m616i(30));
        r1.gravity = 16;
        addView(r23, r1);
        m1890c();
        m1889b();
        AbstractC0828TB.f2613e = this;
        return;
    L45:
        r7 = null;
        goto L46
    L30:
        r2.f9164c = r32;
        if (r32 == null) goto L33;
        Class<?> r46 = r32.getClass();
    L34:
        r2.f9163b = r46;
        goto L35
    L33:
        r46 = null;
        goto L34
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m1888a(ViewOnClickListenerC0996X7 r0) {
        return r0.getCurrentWxId();
    }

    public static final ArrayList<C0867U7> getAllAppPanelData() {
        return AbstractC0295Gu.m619l();
    }

    private final Object getAppPanelListener() {
        C2648vx r0 = new C2648vx();
        View r1 = this.f3179a;
        Class<?> r2 = null;
        r0.f9164c = r1;
        if (r1 == null) goto L5;
        Class<?> r12 = r1.getClass();
    L6:
        r0.f9163b = r12;
        r0.m5182e(AbstractC0295Gu.m625r(-499118149466165L));
        Object r02 = r0.m5178a();
        C2648vx r13 = new C2648vx();
        if ((r02 instanceof Class) == false) goto L9;
        r13.f9163b = (Class) r02;
    L13:
        String r03 = AbstractC0295Gu.m625r(-498748782278709L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r3 = AbstractC1450gG.f5067a;
        C1538iG r22 = new C1538iG(AbstractC1406fG.m2718r0(r03));
        r22.m2921f(AbstractC0295Gu.m625r(-497279903463477L));
        r13.f9165d = r22.m2920e().getParameterTypes()[0];
        return r13.m5178a();
    L9:
        r13.f9164c = r02;
        if (r02 == null) goto L12;
        r2 = r02.getClass();
    L12:
        r13.f9163b = r2;
        goto L13
    L5:
        r12 = null;
        goto L6
    }

    private final String getCurrentWxId() {
        Object r0 = this.f3179a.getTag(R.id.tag_chat_foot_userName);
        if ((r0 instanceof String) == true) goto L5;
        return null;
    L5:
        return (String) r0;
    }

    private final int getItemBgColor() {
        HashMap r0 = AbstractC0999XA.f3193a;
        int r02 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-498405184895029L));
        if (C1517hw.m2895h() == false) goto L14;
        if (r02 == 0) goto L8;
        C0183EA.f539a.getClass();
        if (C0183EA.m374b().f232j == true) goto L8;
    L15:
        return r02;
    L8:
        C0183EA.f539a.getClass();
        if (C0183EA.m373a().equals(AbstractC0295Gu.m625r(-498512559077429L)) == false) goto L12;
        return -15066598;
    L12:
        return 268435456;
    L14:
        if (r02 != 0) goto L15;
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m1889b() {
        ArrayList r0 = this.f3181c;
        r0.clear();
        String r1 = AbstractC0599Nx.f1939a.getString(AbstractC0295Gu.m625r(-839013271337013L), AbstractC0295Gu.m625r(-839133530421301L));
        Pattern r2 = Pattern.compile(AbstractC0295Gu.m625r(-499775279462453L));
        AbstractC2564tz.m5063X(0);
        Matcher r22 = r2.matcher(r1);
        if (r22.find() == true) goto L5;
        List r12 = Collections.singletonList(r1.toString());
    L10:
        if (r12.isEmpty() == true) goto L18;
        ListIterator r23 = r12.listIterator(r12.size());
    L13:
        if (r23.hasPrevious() == false) goto L18;
        if (((String) r23.previous()).length() == 0) goto L13;
        Collection r13 = AbstractC2453ra.m4905o0(r23.nextIndex() + 1, r12);
    L19:
        r0.addAll(Arrays.asList(r13.toArray(new String[0])));
        C0953W7 r02 = this.f3182d;
        if (r02 == null) goto L28;
        r02.notifyDataSetChanged();
        return;
    L28:
        return;
    L18:
        r13 = C0452Kf.f1484a;
        goto L19
    L5:
        ArrayList r4 = new ArrayList(10);
        int r5 = 0;
    L6:
        r4.add(r1.subSequence(r5, r22.start()).toString());
        r5 = r22.end();
        if (r22.find() == true) goto L6;
        r4.add(r1.subSequence(r5, r1.length()).toString());
        r12 = r4;
        goto L10
    }

    /* JADX INFO: renamed from: c */
    public final void m1890c() {
        LinearLayout r1 = this.f3183e;
        if (r1 == null) goto L5;
        r1.removeAllViews();
    L5:
        String r2 = AbstractC0599Nx.f1939a.getString(AbstractC0295Gu.m625r(-839416998262837L), AbstractC0295Gu.m625r(-838935961925685L));
        Pattern r3 = Pattern.compile(AbstractC0295Gu.m625r(-500526898739253L));
        AbstractC2564tz.m5063X(0);
        Matcher r32 = r3.matcher(r2);
        if (r32.find() == true) goto L8;
        List r22 = Collections.singletonList(r2.toString());
    L13:
        if (r22.isEmpty() == true) goto L21;
        ListIterator r33 = r22.listIterator(r22.size());
    L16:
        if (r33.hasPrevious() == false) goto L21;
        if (((String) r33.previous()).length() == 0) goto L16;
        Collection r23 = AbstractC2453ra.m4905o0(r33.nextIndex() + 1, r22);
    L22:
        String[] r24 = (String[]) r23.toArray(new String[0]);
        int r5 = 8;
        if (r24.length != 0) goto L26;
        setVisibility(8);
        return;
    L26:
        int r34 = r24.length;
        int r6 = 0;
    L27:
        if (r6 >= r34) goto L55;
        switch(Integer.parseInt(r24[r6])) {
            case 0: goto L38;
            case 1: goto L37;
            case 2: goto L36;
            case 3: goto L35;
            case 4: goto L34;
            case 5: goto L33;
            case 6: goto L32;
            case 7: goto L31;
            default: goto L30;
        };
    L30:
        C0867U7 r7 = f3178n;
    L39:
        LinearLayout r10 = new LinearLayout(getContext());
        r10.setOrientation(0);
        Integer r11 = Integer.valueOf(r5);
        r10.setPadding(AbstractC0295Gu.m616i(r11), 0, AbstractC0295Gu.m616i(r11), 0);
        r10.setMinimumHeight(AbstractC0295Gu.m616i(30));
        GradientDrawable r112 = new GradientDrawable();
        r112.setColor(getItemBgColor());
        r112.setCornerRadius(10.0f);
        r10.setBackground(r112);
        LinearLayout.LayoutParams r113 = new LinearLayout.LayoutParams(-2, -2);
        r113.setMargins(AbstractC0295Gu.m616i(5), AbstractC0295Gu.m616i(3), AbstractC0295Gu.m616i(5), AbstractC0295Gu.m616i(3));
        r10.setLayoutParams(r113);
        ImageView r52 = new ImageView(r10.getContext());
        r52.setScaleType(ImageView.ScaleType.FIT_CENTER);
        HashMap r114 = AbstractC0999XA.f3193a;
        Drawable r115 = C1517hw.m2890b(r7.f2739c);
        if (r115 == null) goto L42;
        r52.setImageDrawable(r115);
        LinearLayout.LayoutParams r8 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(25), AbstractC0295Gu.m616i(25));
    L46:
        r8.gravity = 16;
        r10.addView(r52, r8);
        TextView r53 = new TextView(r10.getContext());
        int r82 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-499891243579445L));
        if (r82 == 0) goto L49;
        r53.setTextColor(r82);
    L54:
        r53.setText(r7.f2737a);
        LinearLayout.LayoutParams r83 = new LinearLayout.LayoutParams(-2, -2);
        r83.gravity = 16;
        r83.setMarginStart(AbstractC0295Gu.m616i(5));
        r10.addView(r53, r83);
        r10.setTag(r7);
        r10.setOnClickListener(this);
        r1.addView(r10);
        r6 = r6 + 1;
        r5 = 8;
        goto L27
    L49:
        Context r84 = r53.getContext();
        AbstractC0295Gu.m625r(-499985732859957L);
        if (C1517hw.m2894f(r84) == false) goto L52;
        int r85 = -1;
    L53:
        r53.setTextColor(r85);
        goto L54
    L52:
        r85 = -16777216;
        goto L53
    L42:
        r52.setImageResource(r7.f2738b);
        int r9 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-499796754298933L));
        if (r9 == 0) goto L45;
        r52.setColorFilter(r9);
    L45:
        r8 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(15), AbstractC0295Gu.m616i(15));
        goto L46
    L31:
        r7 = f3177m;
        goto L39
    L32:
        r7 = f3176l;
        goto L39
    L33:
        r7 = f3175k;
        goto L39
    L34:
        r7 = f3174j;
        goto L39
    L35:
        r7 = f3173i;
        goto L39
    L36:
        r7 = f3172h;
        goto L39
    L37:
        r7 = f3171g;
        goto L39
    L38:
        r7 = f3170f;
        goto L39
    L55:
        return;
    L21:
        r23 = C0452Kf.f1484a;
        goto L22
    L8:
        ArrayList r54 = new ArrayList(10);
        int r62 = 0;
    L9:
        r54.add(r2.subSequence(r62, r32.start()).toString());
        r62 = r32.end();
        if (r32.find() == true) goto L9;
        r54.add(r2.subSequence(r62, r2.length()).toString());
        r22 = r54;
        goto L13
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r12) {
        AbstractC0295Gu.m625r(-498521149012021L);
        Object r122 = r12.getTag();
        AbstractC0295Gu.m625r(-498529738946613L);
        C0867U7 r123 = (C0867U7) r122;
        int r0 = r123.f2740d;
        if (r0 != f3177m.f2740d) goto L15;
        C1214bG r124 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-819045968377909L));
        if (r124 == null) goto L7;
        Object r125 = r124.f4146a;
    L9:
        if ((r125 instanceof Method) == false) goto L11;
        Method r126 = (Method) r125;
    L12:
        r126.invoke(getAppPanelListener(), null);
        return;
    L11:
        r126 = null;
        goto L12
    L7:
        r125 = null;
        goto L9
    L15:
        if (r0 != f3178n.f2740d) goto L43;
        LinkedHashMap r127 = AbstractC1257cG.f4258a;
        C1214bG r3 = (C1214bG) r127.get(AbstractC0295Gu.m625r(-818620766615605L));
        if (r3 == null) goto L19;
        Object r32 = r3.f4146a;
    L21:
        if ((r32 instanceof Method) == false) goto L23;
        Method r33 = (Method) r32;
    L24:
        Object r4 = getAppPanelListener();
        C2648vx r5 = new C2648vx();
        if ((r4 instanceof Class) == false) goto L27;
        r5.f9163b = (Class) r4;
    L32:
        C1214bG r128 = (C1214bG) r127.get(AbstractC0295Gu.m625r(-818620766615605L));
        if (r128 == null) goto L35;
        Object r129 = r128.f4146a;
    L37:
        if ((r129 instanceof Method) == false) goto L39;
        Method r1210 = (Method) r129;
    L40:
        r5.f9165d = r1210.getDeclaringClass();
        r33.invoke(r5.m5178a(), null);
        return;
    L39:
        r1210 = null;
        goto L40
    L35:
        r129 = null;
        goto L37
    L27:
        r5.f9164c = r4;
        if (r4 == null) goto L30;
        Class<?> r42 = r4.getClass();
    L31:
        r5.f9163b = r42;
        goto L32
    L30:
        r42 = null;
        goto L31
    L23:
        r33 = null;
        goto L24
    L19:
        r32 = null;
        goto L21
    L43:
        if (r0 != f3170f.f2740d) goto L48;
        LinearLayout r1211 = new LinearLayout(getContext());
        r1211.setOrientation(1);
        FrameLayout r1 = new FrameLayout(getContext());
        TextView r43 = new TextView(getContext());
        r43.setText(AbstractC0295Gu.m625r(-497365802809397L));
        r43.setTextColor(r43.getContext().getColor(R.color.textTitle));
        r43.setTextSize(18.0f);
        r43.setTypeface(null, 1);
        FrameLayout.LayoutParams r02 = new FrameLayout.LayoutParams(-2, -2);
        r02.gravity = 17;
        r1.addView(r43, r02);
        ImageView r03 = new ImageView(getContext());
        r03.setImageResource(R.drawable.ic_panel_add);
        r03.setColorFilter(r03.getContext().getColor(R.color.textSummary), PorterDuff.Mode.SRC_IN);
        r03.setOnClickListener(new ViewOnClickListenerC1477h(2, this));
        FrameLayout.LayoutParams r44 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(30));
        r44.gravity = 21;
        r44.rightMargin = AbstractC0295Gu.m616i(20);
        r1.addView(r03, r44);
        LinearLayout.LayoutParams r04 = new LinearLayout.LayoutParams(-1, -2);
        r04.setMargins(0, AbstractC0295Gu.m616i(10), 0, AbstractC0295Gu.m616i(10));
        r1211.addView(r1, r04);
        C0382Iv r05 = new C0382Iv();
        ListView r13 = new ListView(getContext());
        r13.setDividerHeight(0);
        C0953W7 r34 = new C0953W7(this, r13, r05);
        this.f3182d = r34;
        r13.setAdapter(r34);
        Context r6 = getContext();
        AbstractC0295Gu.m625r(-497387277645877L);
        AbstractC0295Gu.m625r(-837063356184629L);
        DisplayMetrics r7 = new DisplayMetrics();
        Object r62 = r6.getSystemService(AbstractC0295Gu.m625r(-837097715922997L));
        AbstractC0295Gu.m625r(-837127780694069L);
        ((WindowManager) r62).getDefaultDisplay().getMetrics(r7);
        LinearLayout.LayoutParams r35 = new LinearLayout.LayoutParams(-1, r7.heightPixels / 2);
        r35.topMargin = AbstractC0295Gu.m616i(10);
        r1211.addView(r13, r35);
        AlertDialog r1212 = new AlertDialog.Builder(getContext()).setView(r1211).setOnDismissListener(new DialogInterfaceOnDismissListenerC0824T7(0, this)).create();
        r05.f1315a = r1212;
        r1212.show();
        Window r1213 = ((AlertDialog) r05.f1315a).getWindow();
        if (r1213 == null) goto L86;
        GradientDrawable r06 = new GradientDrawable();
        r06.setColor(r1213.getContext().getColor(R.color.colorBackground));
        r06.setCornerRadius(AbstractC0295Gu.m616i(16));
        r1213.setBackgroundDrawable(r06);
        r1213.setLayout((int) (((double) r1213.getContext().getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        return;
    L86:
        return;
    L48:
        String r14 = getCurrentWxId();
        if (r14 != null) goto L51;
        return;
    L51:
        if (r14.length() == 0) goto L90;
        boolean r2 = r14.equals(AbstractC0295Gu.m625r(-498959235676213L));
        AdapterView.OnItemClickListener r45 = this.f3180b;
        C0867U7 r52 = f3174j;
        C0867U7 r63 = f3176l;
        C0867U7 r72 = f3175k;
        C0867U7 r8 = f3173i;
        if (r2 == false) goto L66;
        if (r0 != r8.f2740d) goto L58;
    L63:
        AbstractC0213Ey.m413k(-499006480316469L, getContext(), 0);
        return;
    L58:
        if (r0 == r72.f2740d) goto L63;
        if (r0 == r63.f2740d) goto L63;
        if (r0 == r52.f2740d) goto L63;
    L83:
        if (r45 == null) goto L89;
        r45.onItemClick(null, null, r123.f2741e, r123.f2742f);
        return;
    L89:
        return;
    L66:
        if (r14.startsWith(AbstractC0295Gu.m625r(-499053724956725L)) == false) goto L83;
        if (r0 != r8.f2740d) goto L70;
    L81:
        AbstractC0213Ey.m413k(-499070904825909L, getContext(), 0);
        return;
    L70:
        if (r0 == r72.f2740d) goto L81;
        if (r0 == r63.f2740d) goto L81;
        if (r0 == f3172h.f2740d) goto L81;
        if (r0 != r52.f2740d) goto L83;
        if (r45 == null) goto L88;
        r45.onItemClick(null, null, 1, r123.f2742f);
        return;
    L88:
        return;
    }
}
