package com.abc.core.runtime;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.abc.core.features.C0709x1;
import com.abc.core.features.ConfigStore;
import com.abc.core.features.MessageActionDispatcher;
import com.abc.core.features.RoundAvatarHook;
import com.abc.ui.ViewOnClickListenerC0745f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p001A0.ViewOnClickListenerC0025a;
import p007D0.AbstractC0141g;
import p007D0.C0137c;
import p007D0.C0140f;
import p007D0.C0146l;
import p008E.AbstractC0150d;
import p009E0.AbstractC0179j;
import p009E0.C0169C;
import p009E0.C0189t;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.C0313m;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: f0.V */
/* JADX INFO: loaded from: classes.dex */
public final class SettingsUiBuilder {

    /* JADX INFO: renamed from: a */
    public static final SettingsUiBuilder f2933a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2934b = null;

    /* JADX INFO: renamed from: c */
    public static int f2935c;

    /* JADX INFO: renamed from: d */
    public static int f2936d;

    /* JADX INFO: renamed from: e */
    public static int f2937e;

    /* JADX INFO: renamed from: f */
    public static int f2938f;

    /* JADX INFO: renamed from: g */
    public static int f2939g;

    /* JADX INFO: renamed from: h */
    public static int f2940h;

    /* JADX INFO: renamed from: i */
    public static int f2941i;

    /* JADX INFO: renamed from: j */
    public static int f2942j;

    /* JADX INFO: renamed from: k */
    public static int f2943k;

    /* JADX INFO: renamed from: l */
    public static int f2944l;

    /* JADX INFO: renamed from: m */
    public static int f2945m;

    /* JADX INFO: renamed from: n */
    public static boolean f2946n;

    /* JADX INFO: renamed from: o */
    public static Dialog f2947o;

    static {
        f2933a = new SettingsUiBuilder();
        f2934b = new AtomicBoolean(false);
        f2935c = m2092l().f2900a;
        f2936d = m2092l().f2901b;
        f2937e = m2092l().f2902c;
        f2938f = m2092l().f2903d;
        f2939g = m2092l().f2904e;
        f2940h = m2092l().f2905f;
        f2941i = m2092l().f2906g;
        f2942j = m2092l().f2907h;
        f2943k = m2092l().f2908i;
        f2944l = m2092l().f2909j;
        m2092l();
        f2945m = m2092l().f2911l;
        m2092l();
        m2092l();
    }

    /* JADX INFO: renamed from: A */
    public static TextView m2080A(Context r1, String r2, float r3, int r4, boolean r5) {
        TextView r02 = new TextView(r1);
        r02.setText(r2);
        r02.setTextSize(2, r3);
        r02.setTextColor(r4);
        if (r5 == false) goto L5;
        r02.setTypeface(Typeface.create("sans-serif-medium", 0));
    L5:
        r02.setIncludeFontPadding(false);
        return r02;
    }

    /* JADX INFO: renamed from: a */
    public static final String m2081a(SettingsUiBuilder r4, Uri r5) {
        int r02 = 0;
        r4.getClass();
        Object r42 = DocumentsContract.getTreeDocumentId(r5);     // Catch: Throwable -> L5
    L8:
        if ((r42 instanceof C0140f) == false) goto L10;
        r42 = null;
    L10:
        String r43 = (String) r42;
        if (r43 == null) goto L32;
        int r52 = AbstractC0425j.m1010O0(r43, ':', 0, false, 6);
        if (r52 < 0) goto L26;
        String r2 = r43.substring(0, r52);
        AbstractC0307g.m702d(r2, "substring(...)");
        String r53 = r43.substring(r52 + 1);
        AbstractC0307g.m702d(r53, "substring(...)");
        if (r2.equals("primary") == false) goto L26;
        char[] r44 = {'/'};
        int r22 = r53.length();
    L18:
        if (r02 >= r22) goto L23;
        if (AbstractC0179j.m532i0(r44, r53.charAt(r02)) == false) goto L21;
        r02 = r02 + 1;
        goto L18
    L21:
        CharSequence r45 = r53.subSequence(r02, r53.length());
    L31:
        return AbstractC0324d.m725h("/storage/emulated/0/", r45.toString());
    L23:
        r45 = "";
    L26:
        return r43;
    L32:
        return null;
    L5:
        th = move-exception;
        r42 = AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: b */
    public static void m2082b(Activity r16, LinearLayout r17, EditText r18, List r19, int r20, InterfaceC0275a r21) {
        int r10 = 0;
        TextView r3 = m2080A(r16, "点击占位符自动添加以下字段：", 12.0f, f2940h, false);
        int r11 = 4;
        int r12 = 8;
        r3.setPadding(m2087g(r16, 4), m2087g(r16, 12), m2087g(r16, 4), m2087g(r16, 8));
        r17.addView(r3);
        if (r20 <= 0) goto L43;
        if (r20 <= 0) goto L43;
        if ((r19 instanceof RandomAccess) == false) goto L22;
        int r32 = r19.size();
        int r4 = r32 / r20;
        if ((r32 % r20) != 0) goto L10;
        int r5 = 0;
    L11:
        ArrayList r52 = new ArrayList(r4 + r5);
        int r42 = 0;
    L12:
        if (r42 < 0) goto L30;
        if (r42 >= r32) goto L30;
        int r6 = r32 - r42;
        if (r20 > r6) goto L18;
        r6 = r20;
    L18:
        ArrayList r7 = new ArrayList(r6);
        int r8 = 0;
    L19:
        if (r8 >= r6) goto L21;
        r7.add(r19.get(r8 + r42));
        r8 = r8 + 1;
        goto L19
    L21:
        r52.add(r7);
        r42 = r42 + r20;
    L30:
        Iterator r2 = r52.iterator();
    L32:
        if (r2.hasNext() == false) goto L41;
        List r33 = (List) r2.next();
        LinearLayout r43 = new LinearLayout(r16);
        r43.setOrientation(r10);
        int r53 = 6;
        r43.setPadding(r10, r10, r10, m2087g(r16, 6));
        int r62 = r10;
    L34:
        if (r62 >= r20) goto L40;
        if (r62 >= r33.size()) goto L38;
        String r72 = (String) r33.get(r62);
        TextView r15 = new TextView(r16);
        r15.setText(r72);
        r15.setTextSize(12.5f);
        r15.setTextColor(f2939g);
        r15.setGravity(17);
        r15.setPaintFlags(r15.getPaintFlags() | r12);
        r15.setPadding(m2087g(r16, r11), m2087g(r16, r53), m2087g(r16, r11), m2087g(r16, r53));
        GradientDrawable r82 = new GradientDrawable();
        r82.setColor(221219406);
        r82.setCornerRadius(r53 * r16.getResources().getDisplayMetrics().density);
        r15.setBackground(r82);
        r15.setClickable(true);
        r15.setFocusable(true);
        r15.setOnClickListener(new ViewOnClickListenerC0834m(r18, r72, r21, 1));
        int r83 = 0;
        LinearLayout.LayoutParams r73 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        r73.setMarginStart(m2087g(r16, 3));
        r73.setMarginEnd(m2087g(r16, 3));
        r43.addView(r15, r73);
    L39:
        r62 = r62 + 1;
        r10 = r83;
        r53 = 6;
        r11 = 4;
        r12 = 8;
        goto L34
    L38:
        r83 = r10;
        View r152 = new View(r16);
        LinearLayout.LayoutParams r54 = new LinearLayout.LayoutParams(r83, -2, 1.0f);
        r54.setMarginStart(m2087g(r16, 3));
        r54.setMarginEnd(m2087g(r16, 3));
        r43.addView(r152, r54);
        goto L39
    L40:
        r17.addView(r43);
        r11 = 4;
        r12 = 8;
        goto L32
    L41:
        return;
    L10:
        r5 = 1;
        goto L11
    L22:
        ArrayList r14 = new ArrayList();
        Iterator r55 = r19.iterator();
        AbstractC0307g.m703e(r55, "iterator");
        if (r55.hasNext() == true) goto L25;
        Iterator r22 = C0189t.f400a;
    L27:
        if (r22.hasNext() == false) goto L29;
        r14.add((List) r22.next());
        goto L27
    L29:
        r52 = r14;
        goto L30
    L25:
        r22 = AbstractC0358S.m861K(new C0169C(r20, r20, r55, false, true, null));
    L43:
        throw new IllegalArgumentException(("size " + r20 + " must be greater than zero.").toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m2083c(View r1, int r2, int r3) {
        r1.setBackground(m2089i(r2, r3));
        r1.setClipToOutline(true);
        r1.setOutlineProvider(new C0807S(r2, 0));
        r1.setElevation(0.0f);
        r1.setTranslationZ(0.0f);
        r1.setStateListAnimator(null);
        r1.setForeground(null);
    }

    /* JADX INFO: renamed from: d */
    public static void m2084d(C0799J r1) {
        f2935c = r1.f2900a;
        f2936d = r1.f2901b;
        f2937e = r1.f2902c;
        f2938f = r1.f2903d;
        f2939g = r1.f2904e;
        f2940h = r1.f2905f;
        f2941i = r1.f2906g;
        f2942j = r1.f2907h;
        f2943k = r1.f2908i;
        f2944l = r1.f2909j;
        f2945m = r1.f2911l;
        f2946n = r1.f2914o;
    }

    /* JADX INFO: renamed from: e */
    public static String m2085e(float r3) {
        C0709x1 r02 = RoundAvatarHook.f2212b;
        float r32 = AbstractC0040p.m110o(r3, 0.05f, 0.5f);
        if (r32 > 0.08f) goto L6;
        String r03 = "正方";
    L15:
        return "圆度 " + String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(r32)}, 1)) + " · " + r03;
    L6:
        if (r32 < 0.49f) goto L9;
        r03 = "圆形";
        goto L15
    L9:
        if (0.34f <= r32) goto L11;
    L13:
        r03 = "自定义";
        goto L15
    L11:
        if (r32 > 0.38f) goto L13;
        r03 = "方圆";
        goto L15
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2086f(int r8) {
        double r02 = ((double) Color.red(r8)) / 255.0d;
        double r4 = ((double) Color.green(r8)) / 255.0d;
        double r42 = r4 * 0.7152d;
        double r6 = (((double) Color.blue(r8)) / 255.0d) * 0.0722d;
        if ((r6 + (r42 + (r02 * 0.2126d))) >= 0.35d) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static int m2087g(Context r02, int r1) {
        return (int) ((r1 * r02.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: h */
    public static C0798I m2088h(Context r5, String r6, final String r7, final String r8) {
        final EditText r02 = new EditText(r5);
        ConfigStore r1 = ConfigStore.f2048a;
        r02.setText(ConfigStore.m1662d(r7, r8));
        r02.setHint(r8);
        r02.setTextSize(2, 14.5f);
        r02.setTextColor(f2939g);
        r02.setHintTextColor(f2940h);
        r02.setBackground(m2089i(m2087g(r5, 10), f2937e));
        r02.setPadding(m2087g(r5, 12), m2087g(r5, 10), m2087g(r5, 12), m2087g(r5, 10));
        r02.setMinHeight(m2087g(r5, 44));
        r02.setSingleLine(true);
        r02.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0844w(r7, r02, r8));
        LinearLayout r72 = new LinearLayout(r5);
        r72.setOrientation(1);
        r72.setPadding(0, m2087g(r5, 4), 0, m2087g(r5, 4));
        TextView r62 = m2080A(r5, r6, 12.5f, f2940h, false);
        r62.setPadding(0, 0, 0, m2087g(r5, 4));
        r72.addView(r62);
        r72.addView(r02, new LinearLayout.LayoutParams(-1, -2));
        return new C0798I(r72, r02);
    }

    /* JADX INFO: renamed from: i */
    public static GradientDrawable m2089i(int r2, int r3) {
        GradientDrawable r02 = new GradientDrawable();
        r02.setShape(0);
        r02.setCornerRadius(r2);
        r02.setColor(r3);
        r02.setStroke(0, 0);
        return r02;
    }

    /* JADX INFO: renamed from: j */
    public static void m2090j(LinearLayout r10, Context r11, View... r12) {
        LinearLayout r02 = new LinearLayout(r11);
        r02.setOrientation(1);
        r02.setBackground(m2100t(f2936d, m2087g(r11, 16)));
        int r2 = r12.length;
        int r4 = 0;
        int r5 = 0;
    L4:
        if (r4 >= r2) goto L9;
        View r7 = r12[r4];
        int r8 = r5 + 1;
        if (r5 <= 0) goto L8;
        View r52 = new View(r11);
        r52.setBackgroundColor(f2944l);
        LinearLayout.LayoutParams r9 = new LinearLayout.LayoutParams(-1, 1);
        r9.setMarginStart(m2087g(r11, 16));
        r9.setMarginEnd(m2087g(r11, 16));
        r02.addView(r52, r9);
    L8:
        r02.addView(r7);
        r4 = r4 + 1;
        r5 = r8;
        goto L4
    L9:
        LinearLayout.LayoutParams r122 = new LinearLayout.LayoutParams(-1, -2);
        r122.bottomMargin = m2087g(r11, 12);
        r10.addView(r02, r122);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2091k(Context r5) {
        AbstractC0307g.m703e(r5, "ctx");
        boolean r2 = true;
        if ((r5.getResources().getConfiguration().uiMode & 48) == 32) goto L17;
        TypedValue r02 = new TypedValue();     // Catch: Throwable -> L14
        if (r5.getTheme().resolveAttribute(R.attr.windowBackground, r02, true) == false) goto L16;
        int r3 = r02.type;     // Catch: Throwable -> L14
        if (28 > r3) goto L16;
        if (r3 >= 32) goto L16;
        if (m2086f(r02.data) == true) goto L17;
    L16:
        TypedArray r52 = r5.obtainStyledAttributes(new int[]{R.attr.colorBackground});     // Catch: Throwable -> L14
        AbstractC0307g.m702d(r52, "obtainStyledAttributes(...)");     // Catch: Throwable -> L14
        int r03 = r52.getColor(0, -1);     // Catch: Throwable -> L14
        r52.recycle();     // Catch: Throwable -> L14
        r2 = m2086f(r03);     // Catch: Throwable -> L14
    L17:
        Object r53 = Boolean.valueOf(r2);     // Catch: Throwable -> L14
    L20:
        Object r04 = Boolean.FALSE;
        if ((r53 instanceof C0140f) == false) goto L24;
        r53 = r04;
    L24:
        return ((Boolean) r53).booleanValue();
    L14:
        th = move-exception;
        r53 = AbstractC0040p.m116u(th);
        goto L20
    }

    /* JADX INFO: renamed from: l */
    public static C0799J m2092l() {
        return new C0799J(Color.parseColor("#F2F4F2"), Color.parseColor("#FFFFFF"), Color.parseColor("#F7F8F7"), Color.parseColor("#1C1F1C"), Color.parseColor("#2A2E2A"), Color.parseColor("#6B736C"), Color.parseColor("#8A928A"), Color.parseColor("#2F8A4E"), Color.parseColor("#E3F3E8"), Color.parseColor("#0F000000"), Color.parseColor("#A0A8A0"), Color.parseColor("#7A847A"), Color.parseColor("#FFFFFF"), Color.parseColor("#2A2E2A"), false);
    }

    /* JADX INFO: renamed from: m */
    public static LinearLayout m2093m(Context r6, String r7, String r8) {
        LinearLayout r02 = new LinearLayout(r6);
        r02.setOrientation(0);
        r02.setGravity(16);
        r02.setMinimumHeight(m2087g(r6, 50));
        r02.setPadding(m2087g(r6, 16), m2087g(r6, 10), m2087g(r6, 16), m2087g(r6, 10));
        r02.addView(m2080A(r6, r7, 14.5f, f2939g, false), new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r72 = new TextView(r6);
        r72.setText(r8);
        r72.setTextSize(2, 12.5f);
        r72.setTextColor(f2940h);
        r72.setMaxLines(4);
        r72.setGravity(8388613);
        r72.setPadding(m2087g(r6, 8), 0, 0, 0);
        r02.addView(r72, new LinearLayout.LayoutParams(0, -2, 1.2f));
        return r02;
    }

    /* JADX INFO: renamed from: n */
    public static LinearLayout m2094n(Context r5, String r6, String r7, final String r8, boolean r9, final boolean r10, final InterfaceC0275a r11) {
        if (r8.equals("night_mode") == false) goto L7;
        ConfigStore r1 = ConfigStore.f2048a;
        if (ConfigStore.m1661c("night_mode_follow", true) == false) goto L7;
    L8:
        Switch r12 = new Switch(r5);
        r12.setEnabled(r10);
        r12.setChecked(r9);
        r12.setOnCheckedChangeListener(new C0836o(r10, r8, r11));
        LinearLayout r82 = new LinearLayout(r5);
        r82.setOrientation(0);
        r82.setGravity(16);
        r82.setMinimumHeight(m2087g(r5, 56));
        r82.setPadding(m2087g(r5, 16), m2087g(r5, 10), m2087g(r5, 12), m2087g(r5, 10));
        if (r10 == false) goto L11;
        float r2 = 1.0f;
    L12:
        r82.setAlpha(r2);
        LinearLayout r22 = new LinearLayout(r5);
        r22.setOrientation(1);
        r22.addView(m2080A(r5, r6, 15.0f, f2939g, true));
        if ((!AbstractC0425j.m1013R0(r7)) == false) goto L15;
        TextView r62 = m2080A(r5, r7, 12.0f, f2940h, false);
        r62.setPadding(0, m2087g(r5, 2), 0, 0);
        r62.setMaxLines(2);
        r62.setAlpha(0.9f);
        r22.addView(r62);
    L15:
        LinearLayout.LayoutParams r63 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        r63.setMarginEnd(m2087g(r5, 8));
        r82.addView(r22, r63);
        r82.addView(r12);
        if (r10 == false) goto L18;
        r82.setClickable(true);
        r82.setFocusable(true);
        r82.setOnClickListener(new ViewOnClickListenerC0835n(r12, 1));
    L18:
        return r82;
    L11:
        r2 = 0.45f;
    L7:
        ConfigStore r13 = ConfigStore.f2048a;
        r9 = ConfigStore.m1661c(r8, r9);
        goto L8
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ LinearLayout m2095o(SettingsUiBuilder r7, Context r8, String r9, String r10, String r11, boolean r12, InterfaceC0275a r13, int r14) {
        if ((r14 & 64) == 0) goto L5;
        r13 = null;
    L5:
        r7.getClass();
        return m2094n(r8, r9, r10, r11, r12, true, r13);
    }

    /* JADX INFO: renamed from: p */
    public static C0799J m2096p(Context r18) {
        if (ConfigStore.m1661c("night_mode_follow", true) == false) goto L5;
        boolean r02 = m2091k(r18);
    L6:
        if (r02 == false) goto L9;
        return new C0799J(Color.parseColor("#121412"), Color.parseColor("#1C1F1C"), Color.parseColor("#242824"), Color.parseColor("#E8ECE8"), Color.parseColor("#D8DCD8"), Color.parseColor("#9AA29A"), Color.parseColor("#7A827A"), Color.parseColor("#7FBF90"), Color.parseColor("#243028"), Color.parseColor("#14FFFFFF"), Color.parseColor("#6A726A"), Color.parseColor("#8A928A"), Color.parseColor("#1C1F1C"), Color.parseColor("#D8DCD8"), true);
    L9:
        return m2092l();
    L5:
        r02 = ConfigStore.m1661c("night_mode", false);
        goto L6
    }

    /* JADX INFO: renamed from: q */
    public static TextView m2097q(Context r4, String r5, InterfaceC0275a r6) {
        TextView r02 = new TextView(r4);
        r02.setText(r5);
        r02.setTextSize(2, 16.0f);
        r02.setTextColor(f2940h);
        r02.setGravity(17);
        r02.setPadding(m2087g(r4, 10), m2087g(r4, 4), m2087g(r4, 10), m2087g(r4, 4));
        r02.setClickable(true);
        r02.setOnClickListener(new ViewOnClickListenerC0745f(r6, 5));
        return r02;
    }

    /* JADX INFO: renamed from: r */
    public static TextView m2098r(Context r3, String r4, InterfaceC0275a r5) {
        TextView r02 = new TextView(r3);
        r02.setText(r4);
        r02.setTextSize(2, 15.0f);
        r02.setGravity(17);
        r02.setTextColor(-1);
        r02.setTypeface(Typeface.create("sans-serif-medium", 0));
        r02.setBackground(m2100t(f2942j, m2087g(r3, 14)));
        r02.setClickable(true);
        r02.setFocusable(true);
        r02.setPadding(0, m2087g(r3, 10), 0, m2087g(r3, 10));
        r02.setOnClickListener(new ViewOnClickListenerC0745f(r5, 6));
        return r02;
    }

    /* JADX INFO: renamed from: s */
    public static final void m2099s(String r1, EditText r2, String r3) {
        String r22 = AbstractC0425j.m1022a1(r2.getText().toString()).toString();
        if (AbstractC0425j.m1013R0(r22) == true) goto L6;
        r3 = r22;
    L6:
        ConfigStore.f2048a.m1666f(r1, r3, false);
    }

    /* JADX INFO: renamed from: t */
    public static GradientDrawable m2100t(int r1, int r2) {
        GradientDrawable r02 = new GradientDrawable();
        r02.setColor(r1);
        r02.setCornerRadius(r2);
        return r02;
    }

    /* JADX INFO: renamed from: u */
    public static TextView m2101u(Context r3, String r4, InterfaceC0275a r5) {
        TextView r02 = new TextView(r3);
        r02.setText(r4);
        r02.setTextSize(2, 14.0f);
        r02.setGravity(17);
        r02.setTextColor(f2942j);
        r02.setTypeface(Typeface.create("sans-serif-medium", 0));
        r02.setBackground(m2100t(f2943k, m2087g(r3, 14)));
        r02.setClickable(true);
        r02.setFocusable(true);
        r02.setPadding(0, m2087g(r3, 8), 0, m2087g(r3, 8));
        r02.setOnClickListener(new ViewOnClickListenerC0745f(r5, 4));
        return r02;
    }

    /* JADX INFO: renamed from: v */
    public static void m2102v(LinearLayout r4, Context r5, String r6) {
        TextView r02 = new TextView(r5);
        r02.setText(r6);
        r02.setTextSize(2, 13.0f);
        r02.setTextColor(f2941i);
        r02.setTypeface(Typeface.create("sans-serif-medium", 0));
        r02.setIncludeFontPadding(false);
        r02.setPadding(m2087g(r5, 4), m2087g(r5, 10), m2087g(r5, 4), m2087g(r5, 6));
        r4.addView(r02);
    }

    /* JADX INFO: renamed from: x */
    public static final void m2103x(LinearLayout r1, FrameLayout r2, SettingsUiBuilder r3, LinearLayout r4, Activity r5, Dialog r6) {
        r1.setBackgroundColor(f2935c);
        r2.setBackgroundColor(f2935c);
        r3.getClass();
        m2083c(r4, m2087g(r5, 26), f2936d);
        Window r12 = r6.getWindow();
        if (r12 == null) goto L10;
        r12.setBackgroundDrawable(new ColorDrawable(f2935c));
        r12.setStatusBarColor(f2935c);
        r12.setNavigationBarColor(f2935c);
        View r13 = r12.getDecorView();
        if (f2946n == false) goto L7;
        int r22 = 0;
    L8:
        r13.setSystemUiVisibility(r22);
        return;
    L7:
        r22 = 8192;
        goto L8
    }

    /* JADX INFO: renamed from: y */
    public static void m2104y(Activity r9, String r10, final InterfaceC0275a r11, InterfaceC0286l r12) {
        Dialog r02 = new Dialog(r9, R.style.Theme.DeviceDefault.Light.Dialog.NoActionBar.MinWidth);
        r02.setCancelable(true);
        r02.setCanceledOnTouchOutside(true);
        LinearLayout r2 = new LinearLayout(r9);
        r2.setOrientation(1);
        r2.setBackground(m2100t(f2936d, m2087g(r9, 18)));
        r2.setPadding(m2087g(r9, 18), m2087g(r9, 16), m2087g(r9, 18), m2087g(r9, 18));
        LinearLayout r3 = new LinearLayout(r9);
        r3.setOrientation(0);
        r3.setGravity(16);
        r3.addView(m2080A(r9, r10, 17.0f, f2938f, true), new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r102 = new TextView(r9);
        r102.setText("✕");
        r102.setTextSize(2, 16.0f);
        r102.setTextColor(f2940h);
        r102.setPadding(m2087g(r9, 8), m2087g(r9, 4), m2087g(r9, 4), m2087g(r9, 4));
        r102.setClickable(true);
        r102.setOnClickListener(new ViewOnClickListenerC0025a(5, r02));
        r3.addView(r102);
        LinearLayout.LayoutParams r103 = new LinearLayout.LayoutParams(-1, -2);
        r103.bottomMargin = m2087g(r9, 12);
        r2.addView(r3, r103);
        ScrollView r104 = new ScrollView(r9);
        r104.setFillViewport(true);
        r104.setOverScrollMode(1);
        LinearLayout r32 = new LinearLayout(r9);
        r32.setOrientation(1);
        r12.invoke(r32);
        r104.addView(r32);
        r2.addView(r104, new LinearLayout.LayoutParams(-1, m2087g(r9, 340)));
        FrameLayout r105 = new FrameLayout(r9);
        r105.setPadding(m2087g(r9, 20), m2087g(r9, 20), m2087g(r9, 20), m2087g(r9, 20));
        r105.addView(r2);
        r02.setContentView(r105);
        Window r92 = r02.getWindow();
        if (r92 == null) goto L5;
        r92.setBackgroundDrawableResource(R.color.transparent);
    L5:
        r02.setOnDismissListener(new DialogInterfaceOnDismissListenerC0838q(r11));
        r02.show();
    }

    /* JADX INFO: renamed from: z */
    public static void m2105z(Context r1, String r2) {
        Toast.makeText(r1, r2, 0).show();
    }

    /* JADX INFO: renamed from: w */
    public final void m2106w(final Activity r22, AbstractC0805P r23) {
        int r2 = 8;
        AbstractC0307g.m703e(r22, "host");
        if (r22.isFinishing() == false) goto L76;
        return;
    L76:
        Dialog r02 = f2947o;     // Catch: Throwable -> L9
        if (r02 == null) goto L11;
        r02.dismiss();     // Catch: Throwable -> L9
    L11:
        f2947o = null;     // Catch: Throwable -> L9
        ConfigStore r03 = ConfigStore.f2048a;     // Catch: Throwable -> L9
        ConfigStore.m1659a();     // Catch: Throwable -> L9
        m2084d(m2096p(r22));     // Catch: Throwable -> L9
        final Dialog r11 = new Dialog(r22, R.style.Theme.DeviceDefault.Light.NoActionBar);     // Catch: Throwable -> L9
        r11.setCancelable(false);     // Catch: Throwable -> L9
        r11.setCanceledOnTouchOutside(false);     // Catch: Throwable -> L9
        if (f2934b.compareAndSet(false, true) == true) goto L74;
    L21:
        final C0313m r5 = new C0313m();     // Catch: Throwable -> L9
        if (r23.equals(C0803N.f2918b) == false) goto L24;
    L36:
        EnumC0806Q r04 = EnumC0806Q.f2921c;     // Catch: Throwable -> L9
    L37:
        r5.f595a = r04;     // Catch: Throwable -> L9
        final C0313m r6 = new C0313m();     // Catch: Throwable -> L9
        if ((r23 instanceof C0801L) == false) goto L40;
        r6.f595a = ((C0801L) r23).f2916b;     // Catch: Throwable -> L9
    L40:
        int r05 = r22.getResources().getIdentifier("status_bar_height", "dimen", "android");     // Catch: Throwable -> L9
        if (r05 <= 0) goto L43;
        int r06 = r22.getResources().getDimensionPixelSize(r05);     // Catch: Throwable -> L9
    L44:
        int r1 = r22.getResources().getIdentifier("navigation_bar_height", "dimen", "android");     // Catch: Throwable -> L9
        if (r1 <= 0) goto L47;
        int r12 = r22.getResources().getDimensionPixelSize(r1);     // Catch: Throwable -> L9
    L48:
        final LinearLayout r10 = new LinearLayout(r22);     // Catch: Throwable -> L9
        r10.setOrientation(1);     // Catch: Throwable -> L9
        r10.setBackgroundColor(f2935c);     // Catch: Throwable -> L9
        r10.setPadding(0, r06, 0, Math.max(r12, m2087g(r22, 8)));     // Catch: Throwable -> L9
        final ScrollView r07 = new ScrollView(r22);     // Catch: Throwable -> L9
        r07.setFillViewport(true);     // Catch: Throwable -> L9
        r07.setOverScrollMode(1);     // Catch: Throwable -> L9
        r07.setClipToPadding(false);     // Catch: Throwable -> L9
        final LinearLayout r4 = new LinearLayout(r22);     // Catch: Throwable -> L9
        r4.setOrientation(1);     // Catch: Throwable -> L9
        r4.setPadding(m2087g(r22, 16), m2087g(r22, 12), m2087g(r22, 16), m2087g(r22, 20));     // Catch: Throwable -> L9
        r07.addView(r4, new ViewGroup.LayoutParams(-1, -2));     // Catch: Throwable -> L9
        final FrameLayout r7 = new FrameLayout(r22);     // Catch: Throwable -> L9
        r7.setBackgroundColor(f2935c);     // Catch: Throwable -> L9
        r7.setPadding(0, m2087g(r22, 6), 0, m2087g(r22, 8));     // Catch: Throwable -> L9
        final LinearLayout r8 = new LinearLayout(r22);     // Catch: Throwable -> L9
        r8.setOrientation(0);     // Catch: Throwable -> L9
        r8.setGravity(16);     // Catch: Throwable -> L9
        r8.setPadding(m2087g(r22, 6), 0, m2087g(r22, 6), 0);     // Catch: Throwable -> L9
        r7.addView(r8, new FrameLayout.LayoutParams(m2087g(r22, 280), m2087g(r22, 52), 1));     // Catch: Throwable -> L9
        final C0313m r3 = new C0313m();     // Catch: Throwable -> L9
        r3.f595a = new C0846y(this, r22, r4, r5, r6, r3, r8, r07, r10, r7, r11);     // Catch: Throwable -> L53
        r10.addView(r07, new LinearLayout.LayoutParams(-1, 0, 1.0f));     // Catch: Throwable -> L53
        r10.addView(r7, new LinearLayout.LayoutParams(-1, -2));     // Catch: Throwable -> L53
        r11.setContentView(r10, new ViewGroup.LayoutParams(-1, -1));     // Catch: Throwable -> L53
        Window r08 = r11.getWindow();     // Catch: Throwable -> L53
        if (r08 == null) goto L55;
        r08.setLayout(-1, -1);     // Catch: Throwable -> L53
        r08.addFlags(Integer.MIN_VALUE);     // Catch: Throwable -> L53
        r08.setSoftInputMode(18);     // Catch: Throwable -> L53
    L55:
        m2103x(r10, r7, this, r8, r22, r11);     // Catch: Throwable -> L53
        r11.setOnKeyListener(new DialogInterfaceOnKeyListenerC0847z(r11));     // Catch: Throwable -> L53
        final C0313m r09 = new C0313m();     // Catch: Throwable -> L53
        if (Build.VERSION.SDK_INT < 33) goto L58;
        r09.f595a = new C0790A(0, r11);     // Catch: Throwable -> L53
        AbstractC0150d.m475f(AbstractC0150d.m474e(r11), AbstractC0150d.m473d(r09.f595a));     // Catch: Throwable -> L53
    L58:
        r11.setOnDismissListener(new DialogInterfaceOnDismissListenerC0791B(r09, this, r11, r22));     // Catch: Throwable -> L63
        f2947o = r11;     // Catch: Throwable -> L63
        Object r010 = r3.f595a;     // Catch: Throwable -> L63
        if (r010 == null) goto L65;
        ((InterfaceC0275a) r010).invoke();     // Catch: Throwable -> L63
        r11.show();     // Catch: Throwable -> L63
        Object r011 = C0146l.f339a;     // Catch: Throwable -> L63
    L68:
        Throwable r012 = AbstractC0141g.m465a(r011);
        if (r012 == null) goto L80;
        Toast.makeText(r22, "OKK 打开失败: " + r012.getClass().getSimpleName() + ": " + r012.getMessage(), 1).show();
        return;
    L80:
        return;
    L65:
        AbstractC0307g.m705g("render");     // Catch: Throwable -> L63
        throw null;     // Catch: Throwable -> L63
    L63:
        th = th;
    L67:
        r011 = AbstractC0040p.m116u(th);
    L53:
        th = th;
        goto L67
    L47:
        r12 = 0;
        goto L48
    L43:
        r06 = m2087g(r22, 24);     // Catch: Throwable -> L9
        goto L44
    L24:
        if (r23.equals(C0802M.f2917b) == true) goto L36;
        if ((r23 instanceof C0801L) == true) goto L36;
        if (r23.equals(C0800K.f2915b) == false) goto L32;
        r04 = EnumC0806Q.f2922d;     // Catch: Throwable -> L9
        goto L37
    L32:
        if (r23.equals(C0804O.f2919b) == false) goto L35;
        r04 = EnumC0806Q.f2923e;     // Catch: Throwable -> L9
        goto L37
    L35:
        throw new C0137c();     // Catch: Throwable -> L9
    L74:
        Class r62 = Integer.TYPE;     // Catch: Throwable -> L15
        AbstractC0358S.m904q(Activity.class, "onActivityResult", new Object[]{r62, r62, Intent.class, new MessageActionDispatcher(r2, this)});     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L9
    L9:
        th = th;
        goto L67
    }
}
