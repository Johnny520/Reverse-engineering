package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AndroidAppHelper;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.application.MainApplication;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: gf */
/* JADX INFO: loaded from: classes.dex */
public class C1456gf implements InterfaceC1092Zb, InterfaceC1233bs, InterfaceC2819zw, InterfaceC2142kc, InterfaceC0120Cr, InterfaceC2394q0, InterfaceC0718Qn, InterfaceC0565N5, InterfaceC1440g6, InterfaceC0667Pf {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C1456gf f5158b = null;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C1456gf f5159c = null;

    /* JADX INFO: renamed from: d */
    public static final C1456gf f5160d = null;

    /* JADX INFO: renamed from: e */
    public static final C1456gf f5161e = null;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ C1456gf f5162f = null;

    /* JADX INFO: renamed from: g */
    public static final C1456gf f5163g = null;

    /* JADX INFO: renamed from: h */
    public static final C1456gf f5164h = null;

    /* JADX INFO: renamed from: i */
    public static final C1456gf f5165i = null;

    /* JADX INFO: renamed from: j */
    public static final C1456gf f5166j = null;

    /* JADX INFO: renamed from: k */
    public static final C1456gf f5167k = null;

    /* JADX INFO: renamed from: l */
    public static final C1456gf f5168l = null;

    /* JADX INFO: renamed from: m */
    public static final C1456gf f5169m = null;

    /* JADX INFO: renamed from: n */
    public static final C1456gf f5170n = null;

    /* JADX INFO: renamed from: o */
    public static int f5171o;

    /* JADX INFO: renamed from: p */
    public static Application f5172p;

    /* JADX INFO: renamed from: q */
    public static WeakReference f5173q;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5174a;

    static {
        f5158b = new C1456gf(1);
        f5159c = new C1456gf(2);
        f5160d = new C1456gf(5);
        f5161e = new C1456gf(6);
        f5162f = new C1456gf(7);
        f5163g = new C1456gf(8);
        f5164h = new C1456gf(9);
        f5165i = new C1456gf(11);
        f5166j = new C1456gf(12);
        f5167k = new C1456gf(13);
        f5168l = new C1456gf(14);
        f5169m = new C1456gf(15);
        f5170n = new C1456gf(16);
    }

    public /* synthetic */ C1456gf(int r1) {
        this.f5174a = r1;
    }

    /* JADX INFO: renamed from: A */
    public static Application m2783A() {
        MainApplication r0 = MainApplication.f5549a;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Application r02 = f5172p;
        if (r02 == null) goto L8;
        return r02;
    L8:
        Application r03 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
        return r03;
    }

    /* JADX INFO: renamed from: B */
    public static LinearLayout m2784B(Context r6) {
        EditText r1 = new EditText(r6);
        r1.setTextColor(r6.getColor(R.color.textTitle));
        r1.setFocusable(true);
        r1.setFocusableInTouchMode(true);
        r1.requestFocus();
        Drawable r2 = r1.getBackground();
        if (r2 == null) goto L5;
        r2.setColorFilter(new PorterDuffColorFilter(-12417548, PorterDuff.Mode.SRC_ATOP));
    L5:
        LinearLayout r22 = new LinearLayout(r6);
        LinearLayout.LayoutParams r62 = new LinearLayout.LayoutParams(-1, -2);
        r62.setMargins(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(24), 0);
        r1.setLayoutParams(r62);
        r22.addView(r1);
        return r22;
    }

    /* JADX INFO: renamed from: C */
    public static Drawable m2785C(String r4) {
        AbstractC0295Gu.m625r(-836646744356917L);
        C1214bG r0 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-586748367206453L));
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Class) == false) goto L9;
        Class r03 = (Class) r02;
    L10:
        Object r42 = r03.getConstructor(new Class[]{String.class, Float.TYPE}).newInstance(new Object[]{r4, Float.valueOf(0.5f)});
        if ((r42 instanceof Drawable) == true) goto L13;
        return null;
    L13:
        return (Drawable) r42;
    L9:
        r03 = null;
        goto L10
    L5:
        r02 = null;
        goto L7
    }

    /* JADX INFO: renamed from: D */
    public static String m2786D() {
        return AbstractC0295Gu.m625r(-391967305365557L) + Build.FINGERPRINT + AbstractC0295Gu.m625r(-391473384126517L) + m2792J() + AbstractC0295Gu.m625r(-391512038832181L) + m2789G();
    }

    /* JADX INFO: renamed from: E */
    public static HashMap m2787E() {
        C1214bG r0 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-587212223674421L));
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Method) == false) goto L9;
        Method r03 = (Method) r02;
    L10:
        Object r04 = r03.invoke(null, null);
        AbstractC0295Gu.m625r(-837707601279029L);
        return (HashMap) r04;
    L9:
        r03 = null;
        goto L10
    L5:
        r02 = null;
        goto L7
    }

    /* JADX INFO: renamed from: F */
    public static View m2788F(ViewGroup r4, int... r5) {
        AbstractC0295Gu.m625r(-838416270882869L);
        if (r4 == null) goto L14;
        int r0 = r5.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L19;
        View r42 = r4.getChildAt(r5[r1]);
        if (r1 == (r5.length - 1)) goto L13;
        if ((r42 instanceof ViewGroup) == false) goto L12;
        r4 = (ViewGroup) r42;
        r1 = r1 + 1;
        goto L5
    L12:
        throw new IllegalArgumentException(AbstractC0295Gu.m625r(-838450630621237L) + r1 + AbstractC0295Gu.m625r(-838515055130677L));
    L13:
        return r42;
    L19:
        return null;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: G */
    public static String m2789G() {
        Object r0 = m2787E().get(AbstractC0295Gu.m625r(-836139938215989L));
        if ((r0 instanceof String) == false) goto L5;
        String r02 = (String) r0;
    L6:
        if (r02 != null) goto L9;
        r02 = AbstractC0295Gu.m625r(-835671786780725L);
    L9:
        if (r02.length() == 0) goto L11;
        return r02;
    L11:
        return String.valueOf(Long.parseLong(r02) & 4294967295L);
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: H */
    public static Drawable m2790H() {
        Application r0 = m2783A();
        String r1 = m2783A().getApplicationInfo().packageName;
        AbstractC0295Gu.m625r(-837656061671477L);
        String r02 = r0.getSharedPreferences(r1.concat(AbstractC0295Gu.m625r(-835676081748021L)), 0).getString(AbstractC0295Gu.m625r(-835731916322869L), AbstractC0295Gu.m625r(-835804930766901L));
        AbstractC0295Gu.m625r(-835809225734197L);
        if (r02.length() == 0) goto L5;
        Bitmap r03 = BitmapFactory.decodeFile(r02);
        AbstractC0295Gu.m625r(-836578024880181L);
        Resources r12 = m2783A().getResources();
        AbstractC0295Gu.m625r(-836955982002229L);
        return new BitmapDrawable(r12, r03);
    L5:
        return new ColorDrawable(0);
    }

    /* JADX INFO: renamed from: I */
    public static String m2791I() {
        Object r0 = m2787E().get(AbstractC0295Gu.m625r(-837419838470197L));
        if ((r0 instanceof String) == false) goto L5;
        String r02 = (String) r0;
    L6:
        if (r02 == null) goto L8;
        return r02;
    L8:
        return AbstractC0295Gu.m625r(-837514327750709L);
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: J */
    public static String m2792J() {
        Object r0 = m2787E().get(AbstractC0295Gu.m625r(-836036859000885L));
        if ((r0 instanceof String) == false) goto L5;
        String r02 = (String) r0;
    L6:
        if (r02 == null) goto L8;
        return r02;
    L8:
        return AbstractC0295Gu.m625r(-836135643248693L);
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: K */
    public static String m2793K() {
        Object r0 = m2787E().get(AbstractC0295Gu.m625r(-835942369720373L));
        if ((r0 instanceof String) == false) goto L5;
        String r02 = (String) r0;
    L6:
        if (r02 == null) goto L8;
        return r02;
    L8:
        return AbstractC0295Gu.m625r(-836032564033589L);
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: L */
    public static String m2794L() {
        Object r0 = m2787E().get(AbstractC0295Gu.m625r(-837518622718005L));
        if ((r0 instanceof String) == false) goto L5;
        String r02 = (String) r0;
    L6:
        if (r02 == null) goto L8;
        return r02;
    L8:
        return m2791I();
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: M */
    public static void m2795M(ViewGroup r7, int r8, int r9, boolean r10) {
        if (r7 == null) goto L21;
        int r0 = r7.getChildCount();
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L25;
        View r3 = r7.getChildAt(r2);
        if ((r3 instanceof TextView) == false) goto L18;
        if (r10 == false) goto L11;
        if (r9 == 0) goto L18;
        m2797O((TextView) r3, r9);
        goto L18
    L11:
        TextView r4 = (TextView) r3;
        if (r4.getTextSize() >= AbstractC0295Gu.m616i(13)) goto L15;
        if (r9 == 0) goto L15;
        r4.setTextColor(r9);
    L15:
        if (r8 == 0) goto L18;
        r4.setTextColor(r8);
    L18:
        if ((r3 instanceof ViewGroup) == false) goto L20;
        m2795M((ViewGroup) r3, r8, r9, false);
    L20:
        r2 = r2 + 1;
        goto L5
    L25:
        return;
    }

    /* JADX INFO: renamed from: N */
    public static void m2796N(View r2, Drawable r3) {
        if (r2 == null) goto L5;
        r2.setTag(R.id.tag_view_bg_ban, null);
        r2.setBackground(r3);
        r2.setTag(R.id.tag_view_bg_ban, Object.class);
        return;
    }

    /* JADX INFO: renamed from: O */
    public static void m2797O(TextView r2, int r3) {
        if (r2 == null) goto L5;
        r2.setTag(R.id.tag_textview_color_ban, null);
        r2.setTextColor(r3);
        r2.setTag(R.id.tag_textview_color_ban, TextView.class);
        return;
    }

    /* JADX INFO: renamed from: P */
    public static void m2798P(Context r8, String r9, String r10, String r11, InterfaceC0579Nd r12) {
        AbstractC0295Gu.m625r(-827906485909557L);
        AbstractC0295Gu.m625r(-827391089834037L);
        m2799Q(r8, r9, r10, AbstractC0295Gu.m625r(-827429744539701L), r11, r12);
    }

    /* JADX INFO: renamed from: Q */
    public static void m2799Q(Context r5, String r6, String r7, String r8, String r9, InterfaceC0579Nd r10) {
        AbstractC0295Gu.m625r(-827489874081845L);
        AbstractC0295Gu.m625r(-827524233820213L);
        AbstractC0295Gu.m625r(-827541413689397L);
        LinearLayout r0 = m2784B(r5);
        View r2 = r0.getChildAt(0);
        AbstractC0295Gu.m625r(-827580068395061L);
        EditText r22 = (EditText) r2;
        String r82 = AbstractC0599Nx.m1173b(r8, r9);
        r22.setText(r82);
        r22.setSelection(r82.length());
        AlertDialog r52 = new AlertDialog.Builder(r5, android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(r6).setMessage(r7).setView(r0).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC0622Od(r10, r22)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0665Pd(r5, r22)).setNegativeButton(android.R.string.cancel, null).create();
        r52.show();
        m2802T(r52, false);
    }

    /* JADX INFO: renamed from: R */
    public static void m2800R(final Context r18, String r19, String r20, String r21, String r22, List r23, InterfaceC0579Nd r24) {
        Integer r6 = 10;
        AbstractC0295Gu.m625r(-843784980002869L);
        AbstractC0295Gu.m625r(-843819339741237L);
        AbstractC0295Gu.m625r(-843836519610421L);
        AbstractC0295Gu.m625r(-843875174316085L);
        LinearLayout r9 = m2784B(r18);
        int r10 = 1;
        r9.setOrientation(1);
        View r1 = r9.getChildAt(0);
        AbstractC0295Gu.m625r(-843359778240565L);
        final EditText r12 = (EditText) r1;
        String r2 = AbstractC0599Nx.m1173b(r21, r22);
        r12.setText(r2);
        r12.setSelection(r2.length());
        if (r23.isEmpty() == true) goto L9;
        TextView r122 = new TextView(r18);
        r122.setText(AbstractC0295Gu.m625r(-844171527059509L));
        r122.setTextSize(14.0f);
        r122.setTextColor(-16745729);
        r122.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8));
        r122.setClickable(true);
        LinearLayout r13 = new LinearLayout(r18);
        r13.setOrientation(1);
        ScrollView r14 = new ScrollView(r18);
        r14.setVisibility(8);
        r14.addView(r13);
        r122.setOnClickListener(new ViewOnClickListenerC2176l5(6, r14, r122));
        Iterator r15 = r23.iterator();
    L6:
        if (r15.hasNext() == false) goto L8;
        C0208Et r0 = (C0208Et) r15.next();
        String r5 = (String) r0.f613a;
        String r02 = (String) r0.f614b;
        LinearLayout r11 = new LinearLayout(r18);
        r11.setOrientation(r10);
        EditText r17 = r12;
        r11.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(r6), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(r6));
        r11.setClickable(true);
        GradientDrawable r16 = new GradientDrawable();
        r16.setColor(285212672);
        r16.setCornerRadius(AbstractC0295Gu.m616i(8));
        r11.setBackground(r16);
        TextView r110 = new TextView(r18);
        r110.setText(r5);
        r110.setTextSize(15.0f);
        r110.setTextColor(r18.getColor(R.color.textTitle));
        r110.setTypeface(Typeface.DEFAULT_BOLD);
        r11.addView(r110);
        TextView r111 = new TextView(r18);
        r111.setText(r02);
        r111.setTextSize(12.0f);
        r111.setTextColor(-7434605);
        r11.addView(r111);
        r12 = r17;
        r11.setOnClickListener(new ViewOnClickListenerC1433g(r12, r02, r18, r5, 1));
        LinearLayout.LayoutParams r03 = new LinearLayout.LayoutParams(-1, -2);
        r03.setMargins(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(24), 0);
        r13.addView(r11, r03);
        r6 = r6;
        r10 = 1;
        goto L6
    L8:
        r9.addView(r122);
        r9.addView(r14, new LinearLayout.LayoutParams(-1, -2));
    L9:
        AlertDialog r04 = new AlertDialog.Builder(r18, android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(r19).setMessage(r20).setView(r9).setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC0448Kb(1, r24, r12)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0493Ld(r18, r12)).setNegativeButton(android.R.string.cancel, null).create();
        r04.show();
        m2802T(r04, true);
    }

    /* JADX INFO: renamed from: S */
    public static void m2801S(Context r2, String r3, String r4, DialogInterface.OnClickListener r5, boolean r6) {
        AbstractC0295Gu.m625r(-827872126171189L);
        AlertDialog r22 = new AlertDialog.Builder(r2, android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(r3).setMessage(r4).setPositiveButton(android.R.string.ok, r5).setNegativeButton(android.R.string.cancel, null).create();
        r22.show();
        m2802T(r22, r6);
    }

    /* JADX INFO: renamed from: T */
    public static void m2802T(AlertDialog r7, boolean r8) {
        AbstractC0295Gu.m625r(-844334735816757L);
        TextView r2 = (TextView) r7.findViewById(android.R.id.title);
        if (r2 == null) goto L5;
        r2.setTextSize(18.0f);
        r2.setTextColor(r7.getContext().getColor(R.color.textTitle));
        r2.setTypeface(Typeface.DEFAULT_BOLD);
        r2.setPadding(0, AbstractC0295Gu.m616i(24), 0, AbstractC0295Gu.m616i(16));
    L5:
        TextView r22 = (TextView) r7.findViewById(android.R.id.message);
        if (r22 == null) goto L8;
        r22.setTextSize(15.0f);
        r22.setTextColor(-12829629);
        r22.setLineSpacing(8.0f, 1.0f);
        r22.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(24), 0);
        r22.setTextIsSelectable(true);
    L8:
        Button r1 = r7.getButton(-1);
        if (r1 == null) goto L11;
        r1.setTextColor(-16745729);
        r1.setTextSize(16.0f);
        r1.setAllCaps(false);
    L11:
        Button r5 = r7.getButton(-2);
        if (r5 == null) goto L14;
        r5.setTextColor(r7.getContext().getColor(R.color.textTitle));
        r5.setTextSize(16.0f);
        r5.setAllCaps(false);
    L14:
        Window r72 = r7.getWindow();
        if (r72 == null) goto L20;
        GradientDrawable r23 = new GradientDrawable();
        r23.setColor(r72.getContext().getColor(R.color.colorBackground));
        r23.setCornerRadius(AbstractC0295Gu.m616i(16));
        r72.setBackgroundDrawable(r23);
        if (r8 == false) goto L21;
        r72.setLayout((int) (((double) r72.getContext().getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        return;
    L21:
        return;
    }

    /* JADX INFO: renamed from: U */
    public static void m2803U(Context r3, String r4) {
        AbstractC0295Gu.m625r(-836191477823541L);
        AbstractC0295Gu.m625r(-836225837561909L);
        Intent r0 = new Intent();
        r0.setAction(AbstractC0295Gu.m625r(-817242082113589L));
        r0.addCategory(AbstractC0295Gu.m625r(-817358046230581L));
        r0.setData(Uri.parse(r4));
        r0.addFlags(268435456);
        r3.startActivity(r0);
    }

    /* JADX INFO: renamed from: n */
    public static final String m2804n(C1456gf r5, Map r6, long r7, String r9) {
        r5.getClass();
        TreeMap r52 = new TreeMap(r6);
        StringBuilder r62 = new StringBuilder();
        Iterator r53 = r52.entrySet().iterator();
    L4:
        if (r53.hasNext() == false) goto L12;
        Map.Entry r0 = (Map.Entry) r53.next();
        String r1 = (String) r0.getKey();
        Object r02 = r0.getValue();
        if (AbstractC0585Nj.m1134a(r1, AbstractC0295Gu.m625r(-391533513668661L)) == true) goto L4;
        if (r02.toString().startsWith(AbstractC0295Gu.m625r(-391554988505141L)) == true) goto L4;
        if (r02.toString().startsWith(AbstractC0295Gu.m625r(-391563578439733L)) == true) goto L4;
        r62.append(r1);
        r62.append(r02);
        goto L4
    L12:
        r62.append(r7);
        r62.append(r9);
        String r54 = r62.toString();
        AbstractC0295Gu.m625r(-391572168374325L);
        MessageDigest r63 = MessageDigest.getInstance(AbstractC0295Gu.m625r(-391885700986933L));
        byte[] r55 = r54.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-391902880856117L);
        return AbstractC0650P4.m1313H(r63.digest(r55), AbstractC0295Gu.m625r(-391963010398261L), new C1197b(12));
    }

    /* JADX INFO: renamed from: o */
    public static void m2805o(ViewGroup r4) {
        AbstractC0295Gu.m625r(-839734825842741L);
        m2807r(r4);
        int r0 = r4.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        View r2 = r4.getChildAt(r1);
        if ((r2 instanceof ViewGroup) == false) goto L7;
        m2805o((ViewGroup) r2);
    L8:
        r1 = r1 + 1;
        goto L3
    L7:
        m2807r(r2);
        goto L8
    }

    /* JADX INFO: renamed from: q */
    public static void m2806q(ViewGroup r4) {
        AbstractC0295Gu.m625r(-838128508074037L);
        m2807r(r4);
        int r0 = r4.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        View r2 = r4.getChildAt(r1);
        if ((r2 instanceof ViewGroup) == false) goto L8;
        m2806q((ViewGroup) r2);
    L10:
        r1 = r1 + 1;
        goto L3
    L8:
        if ((r2 instanceof TextView) == true) goto L10;
        m2807r(r2);
        goto L10
    }

    /* JADX INFO: renamed from: r */
    public static void m2807r(View r2) {
        if (r2 == null) goto L5;
        r2.setBackground(null);
        r2.setTag(R.id.tag_view_bg_ban, Object.class);
        return;
    }

    /* JADX INFO: renamed from: t */
    public static ImageView m2808t(Context r3, Drawable r4) {
        ImageView.ScaleType r0 = ImageView.ScaleType.CENTER_CROP;
        AbstractC0295Gu.m625r(-838635314214965L);
        AbstractC0295Gu.m625r(-837020406511669L);
        ImageView r1 = new ImageView(r3);
        r1.setScaleType(r0);
        r1.setImageDrawable(r4);
        return r1;
    }

    /* JADX INFO: renamed from: u */
    public static void m2809u(ViewGroup r12) {
        Float r0 = Float.valueOf(6.0f);
        Float r1 = Float.valueOf(32.0f);
        AbstractC0295Gu.m625r(-525094111672373L);
        View r2 = r12.findViewById(AbstractC0828TB.f2617i);
        TextView r5 = null;
        if (r2 == null) goto L7;
        ViewParent r6 = r2.getParent();
        AbstractC0295Gu.m625r(-525137061345333L);
        RelativeLayout r62 = (RelativeLayout) r6;
        HashMap r7 = AbstractC0999XA.f3193a;
        Drawable r72 = C1517hw.m2890b(AbstractC0295Gu.m625r(-523775556712501L));
        if (r72 == null) goto L8;
        r2.setAlpha(0.0f);
        Context r22 = r12.getContext();
        AbstractC0295Gu.m625r(-523393304623157L);
        ImageView r23 = m2808t(r22, r72);
        RelativeLayout.LayoutParams r73 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(r1), AbstractC0295Gu.m616i(r1));
        r73.addRule(15);
        r73.leftMargin = AbstractC0295Gu.m616i(r0);
        r62.addView(r23, r73);
    L8:
        ImageView r24 = m2813y(r12, AbstractC0295Gu.m625r(-523462024099893L));
        if (r24 == null) goto L15;
        HashMap r9 = AbstractC0999XA.f3193a;
        if (C1517hw.m2890b(AbstractC0295Gu.m625r(-523547923445813L)) == null) goto L15;
        r24.setAlpha(0.0f);
        Context r25 = r12.getContext();
        AbstractC0295Gu.m625r(-524265182984245L);
        ImageView r26 = m2808t(r25, C1517hw.m2890b(AbstractC0295Gu.m625r(-524333902460981L)));
        RelativeLayout.LayoutParams r92 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(r1), AbstractC0295Gu.m616i(r1));
        r92.addRule(15);
        r92.addRule(11, 1);
        r92.rightMargin = AbstractC0295Gu.m616i(r0);
        if (r62 == null) goto L15;
        r62.addView(r26, r92);
    L15:
        ImageView r27 = m2813y(r12, AbstractC0295Gu.m625r(-523951650371637L));
        if (r27 == null) goto L22;
        HashMap r93 = AbstractC0999XA.f3193a;
        Drawable r94 = C1517hw.m2890b(AbstractC0295Gu.m625r(-524067614488629L));
        if (r94 == null) goto L22;
        r27.setAlpha(0.0f);
        Context r122 = r12.getContext();
        AbstractC0295Gu.m625r(-522594440706101L);
        ImageView r123 = m2808t(r122, r94);
        RelativeLayout.LayoutParams r28 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(r1), AbstractC0295Gu.m616i(r1));
        r28.addRule(15);
        r28.addRule(11, 1);
        r28.rightMargin = AbstractC0295Gu.m616i(r0);
        if (r62 == null) goto L22;
        r62.addView(r123, r28);
    L22:
        if (r62 == null) goto L24;
        r5 = (TextView) r62.findViewById(android.R.id.text1);
    L24:
        HashMap r124 = AbstractC0999XA.f3193a;
        m2797O(r5, C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-522663160182837L)));
        return;
    L7:
        r62 = null;
        goto L8
    }

    /* JADX INFO: renamed from: v */
    public static View m2810v(ViewGroup r4, String r5) {
        if (r4 == null) goto L14;
        int r0 = r4.getChildCount();
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L21;
        View r2 = r4.getChildAt(r1);
        if (r2.getClass().getName().equals(r5) == true) goto L7;
        if ((r2 instanceof ViewGroup) == false) goto L13;
        View r22 = m2810v((ViewGroup) r2, r5);
        if (r22 == null) goto L13;
        return r22;
    L13:
        r1 = r1 + 1;
        goto L4
    L7:
        return r2;
    L21:
        return null;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static TextView m2811w(ViewGroup r5, String r6) {
        AbstractC0295Gu.m625r(-838171457746997L);
        AbstractC0295Gu.m625r(-838214407419957L);
        int r0 = r5.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L15;
        View r2 = r5.getChildAt(r1);
        if ((r2 instanceof TextView) == false) goto L10;
        TextView r3 = (TextView) r2;
        if (AbstractC0585Nj.m1134a(r3.getText().toString(), r6) == false) goto L10;
        return r3;
    L10:
        if ((r2 instanceof ViewGroup) == false) goto L14;
        TextView r22 = m2811w((ViewGroup) r2, r6);
        if (r22 == null) goto L14;
        return r22;
    L14:
        r1 = r1 + 1;
        goto L3
    L15:
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static void m2812x(ViewGroup r5, ArrayList r6) {
        int r0 = r5.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        View r2 = r5.getChildAt(r1);
        if (r2.getHeight() != 1) goto L8;
        r6.add(r2);
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L10;
        m2812x((ViewGroup) r2, r6);
    L10:
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: y */
    public static ImageView m2813y(ViewGroup r5, String r6) {
        AbstractC0295Gu.m625r(-838235882256437L);
        AbstractC0295Gu.m625r(-838278831929397L);
        int r0 = r5.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L15;
        View r2 = r5.getChildAt(r1);
        if ((r2 instanceof ImageView) == false) goto L10;
        ImageView r3 = (ImageView) r2;
        if (r6.equals(r3.getTag(R.id.tag_we_img_name)) == false) goto L10;
        return r3;
    L10:
        if ((r2 instanceof ViewGroup) == false) goto L14;
        ImageView r22 = m2813y((ViewGroup) r2, r6);
        if (r22 == null) goto L14;
        return r22;
    L14:
        r1 = r1 + 1;
        goto L3
    L15:
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static int m2814z(Activity r1) {
        int r0 = f5171o;
        if (r0 != 0) goto L7;
        if (r1 == null) goto L7;
        return new C2262n5(r1).f7975b;
    L7:
        return r0;
    }

    @Override // p000.InterfaceC1440g6
    /* JADX INFO: renamed from: a */
    public Class mo2751a() {
        switch(this.f5174a) {
            case 25: goto L6;
            default: goto L4;
        };
    L4:
        return InputStream.class;
    L6:
        return ByteBuffer.class;
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: b */
    public void mo193b(MenuC2204lr r1, boolean r2) {
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public boolean mo892c(Object r1, File r2, C2644vt r3) {
        AbstractC2529t6.m5012d((ByteBuffer) r1, r2);     // Catch: IOException -> L6
        return true;
    L6:
        return false;
    }

    @Override // p000.InterfaceC0718Qn
    /* JADX INFO: renamed from: d */
    public void mo1507d(InterfaceC0975Wn r1) {
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: e */
    public Bitmap mo51e(int r1, int r2, Bitmap.Config r3) {
        return Bitmap.createBitmap(r1, r2, r3);
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: g */
    public Bitmap mo52g(int r1, int r2, Bitmap.Config r3) {
        return Bitmap.createBitmap(r1, r2, r3);
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: h */
    public void mo53h(Bitmap r1) {
        r1.recycle();
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw r1, C2644vt r2) {
        return r1;
    }

    @Override // p000.InterfaceC1440g6
    /* JADX INFO: renamed from: j */
    public Object mo2752j(byte[] r2) {
        switch(this.f5174a) {
            case 25: goto L7;
            default: goto L5;
        };
    L5:
        return new ByteArrayInputStream(r2);
    L7:
        return ByteBuffer.wrap(r2);
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: k */
    public void mo54k(int r1) {
    }

    @Override // p000.InterfaceC0718Qn
    /* JADX INFO: renamed from: l */
    public void mo1508l(InterfaceC0975Wn r1) {
        r1.mo401k();
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: m */
    public void mo55m() {
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs r3) {
        switch(this.f5174a) {
            case 13: goto L9;
            case 26: goto L6;
            default: goto L4;
        };
    L4:
        C1456gf r0 = new C1456gf(27);
        return new C1484h6(0, r0);
    L6:
        C1456gf r02 = new C1456gf(25);
        return new C1484h6(0, r02);
    L9:
        return C0872UC.f2757b;
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public boolean mo194s(MenuC2204lr r1) {
        return false;
    }
}
