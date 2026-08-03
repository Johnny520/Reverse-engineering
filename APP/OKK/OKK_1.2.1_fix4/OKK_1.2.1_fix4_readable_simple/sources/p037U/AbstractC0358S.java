package p037U;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.emoji2.text.C0478c;
import androidx.emoji2.text.C0492q;
import androidx.emoji2.text.C0493r;
import com.abc.core.features.C0571A0;
import com.abc.core.features.C0601K0;
import com.abc.core.features.ConfigStore;
import com.abc.core.features.EnumC0583E0;
import com.abc.core.hooks.ModuleLog;
import com.abc.core.runtime.C0817b;
import com.abc.internal.probe.AppFingerprint;
import com.abc.internal.probe.C0554d;
import com.abc.internal.probe.C0556f;
import com.abc.internal.probe.C0562l;
import com.abc.internal.probe.CompatibilityReport;
import com.abc.internal.probe.DexKitManager;
import com.abc.internal.probe.DiagnosticItem;
import com.abc.internal.probe.DiagnosticLevel;
import com.abc.internal.probe.EnumC0568r;
import com.abc.internal.probe.FeatureProbeCatalog;
import com.abc.loader.ModernHookEntry;
import com.abc.ui.C0741b;
import com.abc.ui.C0751l;
import com.abc.ui.C0752m;
import com.abc.ui.C0753n;
import com.abc.ui.C0754o;
import com.abc.ui.C0755p;
import com.abc.ui.RunnableC0750k;
import com.abc.ui.SettingsAction;
import com.abc.ui.ViewOnClickListenerC0740a;
import com.abc.ui.ViewOnClickListenerC0745f;
import com.abc.ui.ViewOnClickListenerC0749j;
import com.abc.ui.ViewOnKeyListenerC0747h;
import com.abc.ui.ViewOnTouchListenerC0746g;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.AbstractC0762d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p000A.C0005f;
import p001A0.AbstractC0040p;
import p001A0.ViewOnClickListenerC0025a;
import p002B.AbstractC0053c;
import p006D.AbstractC0130v;
import p007D0.AbstractC0141g;
import p007D0.C0138d;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0146l;
import p008E.AbstractC0150d;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.AbstractC0193x;
import p009E0.C0172c;
import p009E0.C0190u;
import p014H0.C0206e;
import p014H0.InterfaceC0202a;
import p014H0.InterfaceC0205d;
import p016I0.C0210b;
import p016I0.C0211c;
import p018J0.AbstractC0231a;
import p023M.C0248b;
import p026N0.AbstractC0270k;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0286l;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p031Q0.C0310j;
import p031Q0.C0311k;
import p034S.AbstractC0324d;
import p034S.RunnableC0321a;
import p034S.RunnableC0328h;
import p036T0.C0339b;
import p036T0.C0340c;
import p040V0.C0406i;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0419d;
import p043Y.AbstractC0464w;
import p043Y.AbstractC0466y;
import p043Y.C0463v;
import p057g.C0933v0;
import p077q0.AbstractC1056b;
import p089x0.C1121e;

/* JADX INFO: renamed from: U.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0358S {

    /* JADX INFO: renamed from: a */
    public static long f721a = 0;

    /* JADX INFO: renamed from: b */
    public static Method f722b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f723c = true;

    /* JADX INFO: renamed from: d */
    public static boolean f724d = true;

    /* JADX INFO: renamed from: e */
    public static Field f725e;

    /* JADX INFO: renamed from: f */
    public static boolean f726f;

    /* JADX INFO: renamed from: g */
    public static volatile AppFingerprint f727g;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f728h;

    /* JADX INFO: renamed from: i */
    public static volatile boolean f729i;

    /* JADX INFO: renamed from: j */
    public static volatile boolean f730j;

    /* JADX INFO: renamed from: k */
    public static volatile InterfaceC0286l f731k;

    /* JADX INFO: renamed from: l */
    public static volatile InterfaceC0286l f732l;

    /* JADX INFO: renamed from: m */
    public static volatile InterfaceC0286l f733m;

    /* JADX INFO: renamed from: n */
    public static volatile InterfaceC0286l f734n;

    /* JADX INFO: renamed from: o */
    public static volatile InterfaceC0286l f735o;

    /* JADX INFO: renamed from: p */
    public static volatile FrameLayout f736p;

    /* JADX INFO: renamed from: q */
    public static volatile LinearLayout f737q;

    /* JADX INFO: renamed from: r */
    public static volatile View f738r;

    /* JADX INFO: renamed from: s */
    public static volatile boolean f739s;

    /* JADX INFO: renamed from: t */
    public static volatile InterfaceC0286l f740t;

    /* JADX INFO: renamed from: u */
    public static volatile InterfaceC0275a f741u;

    /* JADX INFO: renamed from: v */
    public static volatile boolean f742v;

    /* JADX INFO: renamed from: w */
    public static volatile boolean f743w;

    /* JADX INFO: renamed from: x */
    public static volatile float f744x;

    /* JADX INFO: renamed from: y */
    public static volatile float f745y;

    /* JADX INFO: renamed from: A */
    public static void m851A(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
        if (m856F(r3) == true) goto L13;
        int r1 = r3 + 112;
        if (((r1 + (r2 << 28)) >> 30) != 0) goto L13;
        if (m856F(r4) == true) goto L13;
        if (m856F(r5) == true) goto L13;
        int r22 = ((((r2 & 7) << 18) | ((r3 & 63) << 12)) | ((r4 & 63) << 6)) | (r5 & 63);
        r6[r7] = (char) ((r22 >>> 10) + 55232);
        r6[r7 + 1] = (char) ((r22 & 1023) + 56320);
        return;
    L13:
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: B */
    public static void m852B(byte r2, byte r3, byte r4, char[] r5, int r6) {
        if (m856F(r3) == true) goto L15;
        if (r2 != (-32)) goto L8;
        if (r3 < (-96)) goto L15;
    L8:
        if (r2 != (-19)) goto L11;
        if (r3 >= (-96)) goto L15;
    L11:
        if (m856F(r4) == true) goto L15;
        r5[r6] = (char) ((((r2 & 15) << 12) | ((r3 & 63) << 6)) | (r4 & 63));
        return;
    L15:
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: C */
    public static void m853C(byte r1, byte r2, char[] r3, int r4) {
        if (r1 < (-62)) goto L11;
        if (m856F(r2) == true) goto L9;
        r3[r4] = (char) (((r1 & 31) << 6) | (r2 & 63));
        return;
    L9:
        throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
    L11:
        throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
    }

    /* JADX INFO: renamed from: D */
    public static byte[] m854D(byte[] r3) {
        if (r3 != null) goto L5;
    L32:
        if (r3 == null) goto L34;
        return r3;
    L34:
        return new byte[0];
    L5:
        if (r3.length == 0) goto L32;
        Object r1 = new String(r3, AbstractC0416a.f921a);     // Catch: Throwable -> L9
    L12:
        if ((r1 instanceof C0140f) == false) goto L14;
        r1 = null;
    L14:
        String r12 = (String) r1;
        if (r12 == null) goto L20;
        if (AbstractC0425j.m1005J0(r12, "[已删除]", false) == false) goto L20;
        return r3;
    L20:
        if (r3.length == 0) goto L39;
        Object r02 = m874Z(r3);     // Catch: Throwable -> L24
    L26:
        Object r32 = r3;
        if ((r02 instanceof C0140f) == true) goto L31;
        r32 = r02;
    L31:
        return (byte[]) r32;
    L24:
        th = move-exception;
        r02 = AbstractC0040p.m116u(th);
        goto L26
    L39:
        return r3;
    L9:
        th = move-exception;
        r1 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: E */
    public static boolean m855E(String r3) {
        if (r3 != null) goto L5;
        r3 = "";
    L5:
        if (AbstractC0425j.m1005J0(r3, "SnsComment", true) == true) goto L8;
        return false;
    L8:
        if (AbstractC0425j.m1005J0(r3, "commentflag", true) == true) goto L10;
        return false;
    L10:
        Pattern r02 = Pattern.compile("commentflag\\s*=\\s*[12]\\b", C1121e.m2635b(2));
        AbstractC0307g.m702d(r02, "compile(...)");
        return r02.matcher(r3).find();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m856F(byte r1) {
        if (r1 <= (-65)) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m857G(byte r02) {
        if (r02 < 0) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m858H() {
        FrameLayout r02 = f736p;
        if (r02 == null) goto L5;
        ViewParent r03 = r02.getParent();
    L6:
        if (r03 == null) goto L12;
        FrameLayout r04 = f736p;
        if (r04 == null) goto L12;
        if (r04.getVisibility() != 0) goto L12;
        return true;
    L12:
        return false;
    L5:
        r03 = null;
        goto L6
    }

    /* JADX INFO: renamed from: I */
    public static boolean m859I(String r11) {
        AbstractC0307g.m703e(r11, "text");
        if (AbstractC0425j.m1013R0(r11) == false) goto L6;
    L14:
        return false;
    L6:
        if (AbstractC0425j.m1005J0(r11, "撤回", false) == true) goto L16;
        if (AbstractC0425j.m1005J0(r11, "拍了拍", false) == true) goto L16;
        if (AbstractC0425j.m1005J0(r11, "recalled", true) == true) goto L16;
        if (AbstractC0425j.m1005J0(r11, "patmsg", true) == false) goto L14;
    L16:
        if (AbstractC0425j.m1013R0(r11) == true) goto L33;
        Pattern r2 = Pattern.compile("\\s+");
        AbstractC0307g.m702d(r2, "compile(...)");
        String r22 = r2.matcher(r11).replaceAll("");
        AbstractC0307g.m702d(r22, "replaceAll(...)");
        if (AbstractC0425j.m1005J0(r22, "你撤回了一条消息", false) == true) goto L55;
        if (AbstractC0425j.m1005J0(r22, "你撤回一条消息", false) == true) goto L55;
        if (AbstractC0425j.m1005J0(r22, "Yourecalledamessage", true) == true) goto L55;
        if (AbstractC0425j.m1005J0(r22, "撤回", false) == false) goto L33;
        if (AbstractC0425j.m1005J0(r22, "重新编辑", false) == false) goto L33;
    L55:
        return true;
    L33:
        if (AbstractC0425j.m1013R0(r11) == true) goto L57;
        Pattern r02 = Pattern.compile("\\s+");
        AbstractC0307g.m702d(r02, "compile(...)");
        String r112 = r02.matcher(r11).replaceAll("");
        AbstractC0307g.m702d(r112, "replaceAll(...)");
        if (AbstractC0425j.m1005J0(r112, "<patmsg", true) == true) goto L55;
        if (AbstractC0425j.m1005J0(r112, "patmsg", true) == false) goto L44;
        if (AbstractC0425j.m1005J0(r112, "template", true) == true) goto L55;
    L44:
        if (AbstractC0425j.m1005J0(r112, "拍了拍", false) == true) goto L47;
        return false;
    L47:
        if (AbstractC0433r.m1033H0(r112, "\"", false) == true) goto L55;
        if (AbstractC0433r.m1033H0(r112, "“", false) == true) goto L55;
        if (AbstractC0433r.m1033H0(r112, "你拍了拍", false) == true) goto L55;
        if (AbstractC0425j.m1005J0(r112, "拍了拍我", false) == true) goto L55;
        return false;
    L57:
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m860J(char r1) {
        if (Character.isWhitespace(r1) == false) goto L5;
    L8:
        return true;
    L5:
        if (Character.isSpaceChar(r1) == true) goto L8;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public static C0406i m861K(InterfaceC0290p r3) {
        AbstractC0307g.m703e(r3, "block");
        C0406i r02 = new C0406i();
        AbstractC0307g.m703e(r3, "<this>");
        AbstractC0307g.m703e(r02, "completion");
        if ((r3 instanceof AbstractC0231a) == false) goto L5;
        InterfaceC0202a r32 = ((AbstractC0231a) r3).mo519d(r02, r02);
    L9:
        r02.f908d = r32;
        return r02;
    L5:
        InterfaceC0205d r1 = r02.mo588c();
        if (r1 != C0206e.f423a) goto L8;
        r32 = new C0210b(r02, r3, r02);
        goto L9
    L8:
        r32 = new C0211c(r02, r1, r3, r02);
        goto L9
    }

    /* JADX INFO: renamed from: L */
    public static AppFingerprint m862L() {
        Object r02 = null;
        File r1 = new File(new File("/sdcard/Android/media/com.tencent.mm/OKK"), "compat_report.json");     // Catch: Throwable -> L11
        if (r1.isFile() == true) goto L6;
        return null;
    L6:
        JSONObject r2 = new JSONObject(AbstractC0270k.m692i0(r1, AbstractC0416a.f921a));     // Catch: Throwable -> L11
        JSONArray r12 = r2.getJSONArray("results");     // Catch: Throwable -> L11
        ArrayList r8 = new ArrayList();     // Catch: Throwable -> L11
        int r3 = r12.length();     // Catch: Throwable -> L11
        int r4 = 0;
    L9:
        if (r4 >= r3) goto L13;
        JSONObject r9 = r12.getJSONObject(r4);     // Catch: Throwable -> L11
        String r11 = r9.getString("id");     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r11, "getString(...)");     // Catch: Throwable -> L11
        String r122 = r9.getString("title");     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r122, "getString(...)");     // Catch: Throwable -> L11
        String r13 = r9.getString("level");     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r13, "getString(...)");     // Catch: Throwable -> L11
        DiagnosticLevel r7 = DiagnosticLevel.valueOf(r13);     // Catch: Throwable -> L11
        String r6 = r9.optString("detail", "");     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r6, "optString(...)");     // Catch: Throwable -> L11
        r8.add(new DiagnosticItem(r11, r122, r7, r6));     // Catch: Throwable -> L11
        r4 = r4 + 1;     // Catch: Throwable -> L11
        goto L9
    L13:
        String r42 = r2.getString("fingerprint");     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r42, "getString(...)");     // Catch: Throwable -> L11
        String r62 = r2.optString("wechat", "");     // Catch: Throwable -> L11
        AbstractC0307g.m702d(r62, "optString(...)");     // Catch: Throwable -> L11
        AppFingerprint r14 = new AppFingerprint(r42, r62, r2.optLong("atMs", 0), r8, false);     // Catch: Throwable -> L11
        f727g = r14;     // Catch: Throwable -> L11
        Object r15 = r14;
    L17:
        if ((r15 instanceof C0140f) == true) goto L21;
        r02 = r15;
    L21:
        return (AppFingerprint) r02;
    L11:
        th = move-exception;
        r15 = AbstractC0040p.m116u(th);
        goto L17
    }

    /* JADX INFO: renamed from: M */
    public static List m863M() {
        Object r1 = "";
        ConfigStore r2 = ConfigStore.f2048a;     // Catch: Throwable -> L5
        Object r22 = ConfigStore.m1662d("home_drawer_shortcuts", "");     // Catch: Throwable -> L5
    L8:
        if ((r22 instanceof C0140f) == true) goto L11;
        r1 = r22;
    L11:
        List r12 = AbstractC0425j.m1019X0((String) r1, new char[]{','});
        ArrayList r23 = new ArrayList();
        Iterator r13 = r12.iterator();
    L13:
        if (r13.hasNext() == false) goto L24;
        String r3 = (String) r13.next();
        EnumC0583E0.f1752e.getClass();
        AbstractC0307g.m703e(r3, "id");
        Iterator r4 = EnumC0583E0.f1755h.iterator();
    L15:
        C0172c r5 = (C0172c) r4;
        if (r5.hasNext() == false) goto L20;
        Object r52 = r5.next();
        if (AbstractC0433r.m1029D0(((EnumC0583E0) r52).f1756a, AbstractC0425j.m1022a1(r3).toString(), true) == false) goto L15;
    L21:
        EnumC0583E0 r53 = (EnumC0583E0) r52;
        if (r53 == null) goto L13;
        r23.add(r53);
        goto L13
    L20:
        r52 = null;
        goto L21
    L24:
        List r02 = AbstractC0181l.m549u0(3, AbstractC0181l.m543o0(r23));
        if (r02.isEmpty() == false) goto L38;
        EnumC0583E0.f1752e.getClass();
        return EnumC0583E0.f1753f;
    L38:
        return r02;
    L5:
        th = move-exception;
        r22 = AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: N */
    public static String m864N() {
        Object r02 = null;
        File r1 = new File(new File("/sdcard/Android/media/com.tencent.mm/OKK"), "compat_dialog_shown.txt");     // Catch: Throwable -> L9
        if (r1.isFile() == true) goto L6;
        return null;
    L6:
        String r12 = AbstractC0425j.m1022a1(AbstractC0270k.m692i0(r1, AbstractC0416a.f921a)).toString();     // Catch: Throwable -> L9
        boolean r2 = AbstractC0425j.m1013R0(r12);     // Catch: Throwable -> L9
        Object r13 = r12;
        if (r2 == false) goto L12;
        r13 = null;
    L12:
        if ((r13 instanceof C0140f) == true) goto L16;
        r02 = r13;
    L16:
        return (String) r02;
    L9:
        th = move-exception;
        r13 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: O */
    public static void m865O(String r3) {
        AbstractC0307g.m703e(r3, "fp");
        f728h = false;
        f729i = false;
        new File("/sdcard/Android/media/com.tencent.mm/OKK").mkdirs();     // Catch: Throwable -> L5
        AbstractC0270k.m694k0(new File(new File("/sdcard/Android/media/com.tencent.mm/OKK"), "compat_dialog_shown.txt"), r3);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: P */
    public static void m866P(LinearLayout r19, Context r20, int r21, int r22, int r23, float r24, List r25) {
        LinearLayout r7 = new LinearLayout(r20);
        r7.setOrientation(1);
        GradientDrawable r9 = new GradientDrawable();
        r9.setShape(0);
        int r11 = 14;
        r9.setCornerRadius(m867Q(14, r24));
        r9.setColor(r21);
        r7.setBackground(r9);
        r7.setElevation(m867Q(2, r24));
        Iterator r92 = r25.iterator();
        int r12 = 0;
    L4:
        if (r92.hasNext() == false) goto L25;
        Object r13 = r92.next();
        int r16 = r12 + 1;
        if (r12 < 0) goto L23;
        C0752m r132 = (C0752m) r13;
        if (r12 <= 0) goto L10;
        View r14 = new View(r20);
        r14.setBackgroundColor(Color.parseColor("#0F000000"));
        LinearLayout.LayoutParams r4 = new LinearLayout.LayoutParams(-1, 1);
        r4.leftMargin = m867Q(52, r24);
        r7.addView(r14, r4);
    L10:
        LinearLayout r42 = new LinearLayout(r20);
        r42.setOrientation(0);
        r42.setGravity(16);
        r42.setPadding(m867Q(r11, r24), m867Q(13, r24), m867Q(r11, r24), m867Q(13, r24));
        r42.setClickable(true);
        r42.setFocusable(true);
        if ((r20.getResources().getConfiguration().uiMode & 48) != 32) goto L13;
        String r5 = "#33FFFFFF";
    L14:
        int r52 = Color.parseColor(r5);
        float r6 = m867Q(r11, r24);
        if (r12 != 0) goto L17;
        float r15 = r6;
    L19:
        if (r12 == (r25.size() - 1)) goto L22;
        r6 = 0.0f;
    L22:
        float[] r112 = {r15, r15, r15, r15, r6, r6, r6, r6};
        GradientDrawable r62 = new GradientDrawable();
        r62.setShape(0);
        r62.setCornerRadii(r112);
        r62.setColor(-1);
        GradientDrawable r122 = new GradientDrawable();
        r122.setShape(0);
        r122.setCornerRadii(r112);
        r122.setColor(r21);
        r42.setBackground(new RippleDrawable(ColorStateList.valueOf(r52), r122, r62));
        r42.setOnClickListener(new ViewOnClickListenerC0025a(4, r132));
        TextView r53 = new TextView(r20);
        r53.setText(r132.f2622a);
        r53.setTextSize(2, 16.0f);
        r53.setGravity(17);
        r42.addView(r53, new LinearLayout.LayoutParams(m867Q(28, r24), m867Q(28, r24)));
        LinearLayout r54 = new LinearLayout(r20);
        r54.setOrientation(1);
        r54.setPadding(m867Q(10, r24), 0, 0, 0);
        TextView r113 = new TextView(r20);
        r113.setText(r132.f2623b);
        r113.setTextColor(r22);
        r113.setTextSize(2, 15.0f);
        r54.addView(r113);
        TextView r114 = new TextView(r20);
        r114.setText(r132.f2624c);
        r114.setTextColor(r23);
        r114.setTextSize(2, 11.0f);
        r114.setPadding(0, m867Q(2, r24), 0, 0);
        r54.addView(r114);
        r42.addView(r54, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r55 = new TextView(r20);
        r55.setText("›");
        r55.setTextColor(r23);
        r55.setTextSize(2, 18.0f);
        r42.addView(r55);
        r7.addView(r42);
        r12 = r16;
        r11 = 14;
        goto L4
    L17:
        r15 = 0.0f;
        goto L19
    L13:
        r5 = "#22000000";
        goto L14
    L23:
        AbstractC0182m.m558j0();
        throw null;
    L25:
        LinearLayout.LayoutParams r02 = new LinearLayout.LayoutParams(-1, -2);
        r02.bottomMargin = m867Q(6, r24);
        r19.addView(r7, r02);
    }

    /* JADX INFO: renamed from: Q */
    public static final int m867Q(int r02, float r1) {
        return (int) ((r02 * r1) + 0.5f);
    }

    /* JADX INFO: renamed from: R */
    public static void m868R(Activity r5, InterfaceC0275a r6) {
        if (f739s == false) goto L5;
        return;
    L5:
        LinearLayout r02 = f737q;
        View r1 = f738r;
        View r2 = null;
        if (r02 == null) goto L13;
        int r3 = r02.getWidth();
        Integer r4 = Integer.valueOf(r3);
        if (r3 > 0) goto L11;
        r4 = null;
    L11:
        if (r4 == null) goto L13;
        int r32 = r4.intValue();
    L18:
        Window r42 = r5.getWindow();
        if (r42 == null) goto L21;
        r2 = r42.getDecorView();
    L21:
        if (r2 == null) goto L23;
        r2.postDelayed(new RunnableC0321a(r02, r1, r32), 50);
    L23:
        if (r2 == null) goto L26;
        r2.postDelayed(new RunnableC0328h(r5, r6, 5), 90);
        return;
    L26:
        return;
    L13:
        if (r02 == null) goto L17;
        ViewGroup.LayoutParams r33 = r02.getLayoutParams();
        if (r33 == null) goto L17;
        r32 = r33.width;
    L17:
        r32 = 0;
        goto L18
    }

    /* JADX INFO: renamed from: S */
    public static boolean m869S(String r1) {
        AbstractC0307g.m703e(r1, "fp");
        String r02 = m864N();
        if (r02 != null) goto L5;
    L8:
        return true;
    L5:
        if (r02.equals(r1) == false) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: T */
    public static ArrayList m870T(CompatibilityReport r9, List r10) {
        ArrayList r02 = new ArrayList(AbstractC0183n.m559k0(r10, 10));
        Iterator r102 = r10.iterator();
    L4:
        if (r102.hasNext() == false) goto L35;
        DiagnosticItem r1 = (DiagnosticItem) r102.next();
        DiagnosticLevel r2 = r1.f1670c;
        if (r2 == DiagnosticLevel.f1666c) goto L34;
        if (r9.f1688e == 8) goto L11;
    L17:
        boolean r3 = false;
    L18:
        DiagnosticLevel r6 = DiagnosticLevel.f1665b;
        String r7 = r1.f1671d;
        if (r3 == false) goto L21;
        EnumC0568r r32 = EnumC0568r.f1681c;
        if (r9.f1686c != r32) goto L34;
        if (r2 != DiagnosticLevel.f1664a) goto L34;
        if (AbstractC0425j.m1013R0(r7) == false) goto L32;
        String r22 = "渠道未识别，需运行时验证";
    L33:
        r1 = DiagnosticItem.m1375a(r1, null, r6, r22, 3);
        goto L34
    L32:
        r22 = "渠道未识别，需运行时验证 · ".concat(r7);
        goto L33
    L21:
        if (AbstractC0425j.m1013R0(r7) == false) goto L23;
        String r23 = "超出主适配范围，按静态特征估计";
    L24:
        r1 = DiagnosticItem.m1375a(r1, null, r6, r23, 3);
        goto L34
    L23:
        r23 = "超出主适配范围，按静态特征估计 · ".concat(r7);
        goto L24
    L11:
        if (r9.f1689f != 0) goto L17;
        int r4 = r9.f1690g;
        if (69 > r4) goto L17;
        if (r4 >= 77) goto L17;
        r3 = true;
    L34:
        r02.add(r1);
        goto L4
    L35:
        return r02;
    }

    /* JADX INFO: renamed from: W */
    public static C0753n m871W() {
        LinearLayout r02 = f737q;
        if (r02 != null) goto L5;
        return null;
    L5:
        View r2 = f738r;
        if (r2 != null) goto L8;
        return null;
    L8:
        int r3 = r02.getWidth();
        Integer r4 = Integer.valueOf(r3);
        if (r3 > 0) goto L12;
        r4 = null;
    L12:
        if (r4 == null) goto L14;
        int r32 = r4.intValue();
    L18:
        if (r32 > 0) goto L21;
        return null;
    L21:
        return new C0753n(r02, r2, r32);
    L14:
        ViewGroup.LayoutParams r33 = r02.getLayoutParams();
        if (r33 == null) goto L17;
        r32 = r33.width;
        goto L18
    L17:
        r32 = 0;
        goto L18
    }

    /* JADX INFO: renamed from: X */
    public static String m872X(Context r3, String r4) {
        PackageManager r32 = r3.getPackageManager();     // Catch: Throwable -> L5
        if (Build.VERSION.SDK_INT < 33) goto L7;
        PackageInfo r33 = AbstractC0150d.m470a(r32, r4, AbstractC0150d.m471b());     // Catch: Throwable -> L5
    L8:
        Object r34 = r33.firstInstallTime + "_" + r33.lastUpdateTime;     // Catch: Throwable -> L5
    L12:
        if (AbstractC0141g.m465a(r34) == null) goto L16;
        r34 = "na";
    L16:
        return (String) r34;
    L7:
        r33 = r32.getPackageInfo(r4, 0);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r34 = AbstractC0040p.m116u(th);
        goto L12
    }

    /* JADX INFO: renamed from: Y */
    public static int m873Y(String r2, int r3) {
        String r22 = AbstractC0425j.m1022a1(r2).toString();
        if (r22 != null) goto L6;
        r22 = "";
    L6:
        if (r22.length() != 0) goto L9;
        return r3;
    L9:
        if (AbstractC0433r.m1033H0(r22, "#", false) == true) goto L21;
        r22 = "#".concat(r22);
    L21:
        Object r23 = Integer.valueOf(Color.parseColor(r22));     // Catch: Throwable -> L14
    L16:
        Object r32 = Integer.valueOf(r3);
        if ((r23 instanceof C0140f) == false) goto L20;
        r23 = r32;
    L20:
        return ((Number) r23).intValue();
    L14:
        th = move-exception;
        r23 = AbstractC0040p.m116u(th);
        goto L16
    }

    /* JADX INFO: renamed from: Z */
    public static byte[] m874Z(byte[] r16) {
        AbstractC0307g.m703e(r16, "buf");
        if ("[已删除] ".length() != 0) goto L5;
        return r16;
    L5:
        int r02 = r16.length;
        byte[] r4 = "[已删除] ".getBytes(AbstractC0416a.f921a);
        AbstractC0307g.m702d(r4, "getBytes(...)");
        ByteArrayOutputStream r3 = new ByteArrayOutputStream((r02 + r4.length) + 8);
        boolean r03 = false;
        int r7 = 0;
    L7:
        if (r7 >= r16.length) goto L63;
        C0139e r8 = m880c0(r16, r7);
        if (r8 == null) goto L63;
        long r10 = ((Number) r8.f328a).longValue();
        int r82 = ((Number) r8.f329b).intValue();
        int r12 = (int) (7 & r10);
        int r13 = (int) (r10 >>> 3);
        if (r12 == 0) goto L59;
        if (r12 == 1) goto L56;
        if (r12 != 2) goto L18;
        C0139e r122 = m880c0(r16, r82);
        if (r122 == null) goto L55;
        long r14 = ((Number) r122.f328a).longValue();
        r82 = ((Number) r122.f329b).intValue();
        int r123 = ((int) r14) + r82;
        if (r123 > r16.length) goto L55;
        if (r03 == true) goto L53;
        if (r13 != 8) goto L53;
        if (((int) r10) != 66) goto L53;
        AbstractC0040p.m114s(r123, r16.length);
        byte[] r83 = Arrays.copyOfRange(r16, r82, r123);
        AbstractC0307g.m702d(r83, "copyOfRange(...)");
        Object r04 = new String(r83, AbstractC0416a.f921a);     // Catch: Throwable -> L36
    L39:
        if ((r04 instanceof C0140f) == false) goto L41;
        r04 = null;
    L41:
        String r05 = (String) r04;
        if (r05 != null) goto L44;
    L48:
        if (r05 == null) goto L50;
        byte[] r06 = "[已删除] ".concat(r05).getBytes(AbstractC0416a.f921a);
        AbstractC0307g.m702d(r06, "getBytes(...)");
    L51:
        m917w0(r3, 66);
        m917w0(r3, r06.length);
        r3.write(r06);
    L52:
        r03 = true;
    L54:
        r7 = r123;
        goto L7
    L50:
        byte[] r07 = "[已删除] ".getBytes(AbstractC0416a.f921a);
        AbstractC0307g.m702d(r07, "getBytes(...)");
        int r72 = r07.length;
        int r102 = r83.length;
        r06 = Arrays.copyOf(r07, r72 + r102);
        System.arraycopy(r83, 0, r06, r72, r102);
        AbstractC0307g.m700b(r06);
        goto L51
    L44:
        if (AbstractC0433r.m1033H0(r05, "[已删除]", false) == false) goto L46;
    L47:
        r3.write(r16, r7, r123 - r7);
        goto L52
    L46:
        if (AbstractC0425j.m1005J0(r05, "[已删除]", false) == false) goto L48;
    L36:
        th = move-exception;
        r04 = AbstractC0040p.m116u(th);
    L53:
        r3.write(r16, r7, r123 - r7);
    L55:
        r7 = r82;
        goto L63
    L18:
        if (r12 != 5) goto L19;
        int r103 = r82 + 4;
        if (r103 > r16.length) goto L55;
        r3.write(r16, r7, (r82 - r7) + 4);
    L23:
        r7 = r103;
        goto L7
    L19:
        return r16;
    L56:
        r103 = r82 + 8;
        if (r103 > r16.length) goto L55;
        r3.write(r16, r7, (r82 - r7) + 8);
        goto L23
    L59:
        C0139e r104 = m880c0(r16, r82);
        if (r104 == null) goto L55;
        r103 = ((Number) r104.f329b).intValue();
        r3.write(r16, r7, r103 - r7);
    L63:
        if (r03 == true) goto L66;
        m917w0(r3, 66);
        byte[] r2 = AbstractC0425j.m1022a1("[已删除] ").toString().getBytes(AbstractC0416a.f921a);
        AbstractC0307g.m702d(r2, "getBytes(...)");
        m917w0(r3, r2.length);
        r3.write(r2);
    L66:
        if (r7 >= r16.length) goto L70;
        if (r03 == true) goto L70;
        return r16;
    L70:
        if (r7 >= r16.length) goto L72;
        r3.write(r16, r7, r16.length - r7);
    L72:
        byte[] r08 = r3.toByteArray();
        AbstractC0307g.m702d(r08, "toByteArray(...)");
        return r08;
    }

    /* JADX INFO: renamed from: a */
    public static final C0419d m875a(Matcher r02, int r1, CharSequence r2) {
        if (r02.find(r1) == true) goto L6;
        return null;
    L6:
        return new C0419d(r02, r2);
    }

    /* JADX INFO: renamed from: a0 */
    public static int m876a0(String r3, int r4, boolean r5) {
        String r32 = r3.toLowerCase(Locale.ROOT);
        AbstractC0307g.m702d(r32, "toLowerCase(...)");
        if (AbstractC0433r.m1033H0(r32, "get", false) == false) goto L5;
        return -1000;
    L5:
        if (AbstractC0433r.m1033H0(r32, "is", false) == false) goto L7;
        return -1000;
    L7:
        if (AbstractC0433r.m1033H0(r32, "has", false) == false) goto L9;
        return -1000;
    L9:
        if (AbstractC0433r.m1033H0(r32, "can", false) == false) goto L11;
        return -1000;
    L11:
        if (AbstractC0433r.m1033H0(r32, "should", false) == false) goto L13;
        return -1000;
    L13:
        if (AbstractC0433r.m1033H0(r32, "equals", false) == false) goto L15;
        return -1000;
    L15:
        if (r32.equals("hashcode") == false) goto L17;
        return -1000;
    L17:
        if (r32.equals("tostring") == false) goto L19;
        return -1000;
    L19:
        if (r32.equals("compareto") == true) goto L73;
        if (r5 == false) goto L23;
        int r52 = 50;
    L25:
        if (r4 == 1) goto L29;
        if (r4 != 2) goto L31;
        r52 = r52 + 10;
    L31:
        if (AbstractC0425j.m1005J0(r32, "quote", false) == false) goto L33;
    L36:
        r52 = r52 + 80;
    L37:
        int r42 = r32.hashCode();
        if (r42 == 3706) goto L54;
        switch(r42) {
            case 97: goto L51;
            case 98: goto L48;
            case 99: goto L45;
            case 100: goto L42;
            default: goto L57;
        };
    L42:
        if (r32.equals("d") == false) goto L57;
    L55:
        r52 = r52 + 30;
        goto L57
    L45:
        if (r32.equals("c") == true) goto L55;
    L48:
        if (r32.equals("b") == true) goto L55;
    L51:
        if (r32.equals("a") == true) goto L55;
    L57:
        if (r32.length() > 3) goto L60;
        r52 = r52 + 15;
    L60:
        if (r32.length() <= 2) goto L62;
        return r52;
    L62:
        return r52 + 10;
    L54:
        if (r32.equals("v0") == false) goto L57;
    L33:
        if (AbstractC0425j.m1005J0(r32, "refer", false) == true) goto L36;
        if (AbstractC0425j.m1005J0(r32, "reply", false) == false) goto L37;
    L29:
        r52 = r52 + 20;
        goto L31
    L23:
        r52 = 0;
        goto L25
    L73:
        return -1000;
    }

    /* JADX INFO: renamed from: b */
    public static C0601K0 m877b(C0601K0 r13, int r14, String r15) {
        int r142 = r14 & 65535;
        if (r142 == 1) goto L5;
    L7:
        int r2 = 0;
    L8:
        int r6 = r13.f1836b + 1;
        int r3 = r13.f1837c;
        if (r142 != 1) goto L11;
        r3 = r3 + 1;
    L11:
        int r7 = r3;
        int r8 = r13.f1838d + r2;
        int r22 = r13.f1839e;
        if (r142 != 47) goto L14;
        r22 = r22 + 1;
    L14:
        int r9 = r22;
        int r23 = r13.f1840f;
        if (r142 != 419430449) goto L17;
    L20:
        r23 = r23 + 1;
    L19:
        int r10 = r23;
        int r24 = r13.f1841g;
        if (r142 != 436207665) goto L24;
    L27:
        r24 = r24 + 1;
    L26:
        int r11 = r24;
        int r02 = r13.f1842h;
        if (r142 != 6) goto L31;
    L33:
        r02 = r02 + 1;
    L32:
        int r12 = r02;
        String r5 = r13.f1835a;
        AbstractC0307g.m703e(r5, "dateKey");
        return new C0601K0(r5, r6, r7, r8, r9, r10, r11, r12);
    L31:
        if (r142 == 1090519089) goto L33;
    L24:
        if (AbstractC0425j.m1005J0(r15, "微信红包", false) == false) goto L26;
    L17:
        if (AbstractC0425j.m1005J0(r15, "微信转账", false) == false) goto L19;
    L5:
        if ((!AbstractC0425j.m1013R0(r15)) == false) goto L7;
        r2 = r15.length();
        goto L8
    }

    /* JADX INFO: renamed from: b0 */
    public static C0248b m878b0(MappedByteBuffer r13) {
        ByteBuffer r132 = r13.duplicate();
        r132.order(ByteOrder.BIG_ENDIAN);
        r132.position(r132.position() + 4);
        int r02 = r132.getShort() & 65535;
        if (r02 > 100) goto L28;
        r132.position(r132.position() + 6);
        int r1 = 0;
        int r3 = 0;
    L6:
        if (r3 >= r02) goto L11;
        int r8 = r132.getInt();
        r132.position(r132.position() + 4);
        long r9 = ((long) r132.getInt()) & 4294967295L;
        r132.position(r132.position() + 4);
        if (1835365473 == r8) goto L13;
        r3 = r3 + 1;
    L13:
        if (r9 == (-1)) goto L26;
        r132.position(r132.position() + ((int) (r9 - ((long) r132.position()))));
        r132.position(r132.position() + 12);
        long r6 = ((long) r132.getInt()) & 4294967295L;
    L16:
        if (r1 >= r6) goto L26;
        int r03 = r132.getInt();
        long r11 = ((long) r132.getInt()) & 4294967295L;
        r132.getInt();
        if (1164798569 == r03) goto L23;
        if (1701669481 == r03) goto L23;
        r1 = r1 + 1;
    L23:
        r132.position((int) (r11 + r9));
        C0248b r04 = new C0248b();
        int r2 = r132.position() + AbstractC0324d.m719b(r132, ByteOrder.LITTLE_ENDIAN);
        r04.f214d = r132;
        r04.f211a = r2;
        int r22 = r2 - r132.getInt(r2);
        r04.f212b = r22;
        r04.f213c = ((ByteBuffer) r04.f214d).getShort(r22);
        return r04;
    L26:
        throw new IOException("Cannot read metadata.");
    L11:
        r9 = -1;
        goto L13
    L28:
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: c */
    public static void m879c(StringBuilder r02, Object r1, InterfaceC0286l r2) {
        if (r2 == null) goto L4;
        r02.append((CharSequence) r2.invoke(r1));
        return;
    L4:
        if (r1 != null) goto L6;
        boolean r22 = true;
    L7:
        if (r22 == false) goto L10;
        r02.append((CharSequence) r1);
        return;
    L10:
        if ((r1 instanceof Character) == false) goto L12;
        r02.append(((Character) r1).charValue());
        return;
    L12:
        r02.append(String.valueOf(r1));
        return;
    L6:
        r22 = r1 instanceof CharSequence;
        goto L7
    }

    /* JADX INFO: renamed from: c0 */
    public static C0139e m880c0(byte[] r6, int r7) {
        long r02 = 0;
        int r2 = 0;
    L4:
        if (r7 >= r6.length) goto L12;
        if (r2 >= 64) goto L17;
        byte r3 = r6[r7];
        r7 = r7 + 1;
        r02 = r02 | (((long) (r3 & 127)) << r2);
        if ((r3 & 128) == 0) goto L10;
        r2 = r2 + 7;
        goto L4
    L10:
        return new C0139e(Long.valueOf(r02), Integer.valueOf(r7));
    L17:
        return null;
    L12:
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static C0753n m881d(final Activity r32) {
        Window r02 = r32.getWindow();
        TextView r16 = null;
        if (r02 == null) goto L5;
        View r03 = r02.getDecorView();
    L7:
        if ((r03 instanceof ViewGroup) == false) goto L9;
        ViewGroup r9 = (ViewGroup) r03;
    L10:
        if (r9 != null) goto L12;
        return null;
    L12:
        int r04 = r9.getChildCount();
        int r2 = 0;
    L14:
        if (r2 >= r04) goto L19;
        if (AbstractC0307g.m699a(r9.getChildAt(r2).getTag(), "achat_home_side_drawer") == true) goto L17;
        r2 = r2 + 1;
        goto L14
    L17:
        View r05 = r9.getChildAt(r2);
    L20:
        if (r05 == null) goto L27;
        ViewParent r22 = r05.getParent();
        if ((r22 instanceof ViewGroup) == false) goto L24;
        ViewGroup r23 = (ViewGroup) r22;
    L25:
        if (r23 == null) goto L27;
        r23.removeView(r05);
        goto L27
    L24:
        r23 = null;
    L27:
        final float r8 = r32.getResources().getDisplayMetrics().density;
        final int r7 = Math.min((int) (r32.getResources().getDisplayMetrics().widthPixels * 0.78f), (int) ((300 * r8) + 0.5f));
        FrameLayout r6 = new FrameLayout(r32);
        r6.setTag("achat_home_side_drawer");
        r6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r6.setClickable(true);
        r6.setFocusable(true);
        r6.setFocusableInTouchMode(true);
        r6.setElevation((int) ((24 * r8) + 0.5f));
        final View r3 = new View(r32);
        r3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r3.setBackgroundColor(-16777216);
        r3.setAlpha(0.0f);
        r3.setOnClickListener(new ViewOnClickListenerC0740a());
        if ((r32.getResources().getConfiguration().uiMode & 48) != 32) goto L30;
        boolean r18 = true;
    L31:
        if (r18 == false) goto L34;
        String r06 = "#1A1C1A";
    L33:
        final int r07 = Color.parseColor(r06);
        if (r18 == false) goto L38;
        String r08 = "#F2F4F2";
    L37:
        final int r09 = Color.parseColor(r08);
        if (r18 == false) goto L42;
        String r010 = "#9AA39A";
    L41:
        final int r011 = Color.parseColor(r010);
        if (r18 == false) goto L45;
        int r21 = Color.parseColor("#242724");
    L46:
        final int r12 = Color.parseColor("#2F8A4E");
        if (r18 == false) goto L50;
        String r012 = "#22FFFFFF";
    L49:
        Color.parseColor(r012);
        LinearLayout r13 = new LinearLayout(r32);
        r13.setOrientation(1);
        r13.setBackgroundColor(r07);
        r13.setOutlineProvider(new C0754o(r8));
        r13.setClipToOutline(true);
        View r013 = new View(r32);
        int r24 = r32.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (r24 <= 0) goto L55;
        int r25 = r32.getResources().getDimensionPixelSize(r24);
    L56:
        r13.addView(r013, new LinearLayout.LayoutParams(-1, r25));
        LinearLayout r15 = new LinearLayout(r32);
        r15.setOrientation(0);
        r15.setGravity(16);
        r15.setPadding(m883e(20, r8), m883e(18, r8), m883e(16, r8), m883e(18, r8));
        GradientDrawable r014 = new GradientDrawable();
        r014.setShape(0);
        r014.setCornerRadius(m883e(22, r8));
        if (r18 == false) goto L60;
        String r4 = "#202A38";
    L61:
        r014.setColor(Color.parseColor(r4));
        r15.setBackground(r014);
        ImageView r015 = new ImageView(r32);
        r015.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable r42 = new GradientDrawable();
        r42.setShape(1);
        r42.setColor(Color.parseColor("#D0D0D0"));
        r015.setBackground(r42);
        r015.setClipToOutline(true);
        r015.setOutlineProvider(new C0571A0(1));
        r15.addView(r015, new LinearLayout.LayoutParams(m883e(52, r8), m883e(52, r8)));
        InterfaceC0286l r43 = f740t;
        if (r43 == null) goto L64;
        r43.invoke(r015);
    L64:
        LinearLayout r14 = new LinearLayout(r32);
        r14.setOrientation(1);
        r14.setPadding(m883e(14, r8), 0, 0, 0);
        TextView r016 = new TextView(r32);
        InterfaceC0275a r44 = f741u;
        if (r44 == null) goto L69;
        String r45 = (String) r44.invoke();
        if (r45 == null) goto L69;
    L70:
        r016.setText(r45);
        r016.setTextColor(r09);
        r016.setTextSize(2, 19.0f);
        r016.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        r016.setMaxLines(1);
        r14.addView(r016);
        final TextView r46 = new TextView(r32);
        ConfigStore r017 = ConfigStore.f2048a;     // Catch: Throwable -> L73
        Object r018 = Boolean.valueOf(ConfigStore.m1661c("home_drawer_signature_tip_shown", false));     // Catch: Throwable -> L73
    L75:
        Object r26 = Boolean.FALSE;
        if ((r018 instanceof C0140f) == false) goto L78;
        r018 = r26;
    L78:
        boolean r27 = ((Boolean) r018).booleanValue();
        CharSequence r5 = "OKK 快捷面板";
        Object r019 = ConfigStore.m1662d("home_drawer_signature", "OKK 快捷面板");     // Catch: Throwable -> L81
    L84:
        if ((r019 instanceof C0140f) == false) goto L86;
        r019 = "OKK 快捷面板";
    L86:
        CharSequence r020 = (CharSequence) r019;
        if (AbstractC0425j.m1013R0(r020) == true) goto L90;
        r5 = r020;
    L90:
        String r52 = (String) r5;
        if (r27 == true) goto L94;
        r52 = "点击编辑签名 · ".concat(r52);
    L94:
        r46.setText(r52);
        if (r27 == true) goto L97;
        ConfigStore.m1664h("home_drawer_signature_tip_shown", "true");
    L97:
        r46.setContentDescription("编辑侧栏签名");
        if (r18 == false) goto L101;
        String r021 = "#9DA9B8";
    L102:
        r46.setTextColor(Color.parseColor(r021));
        r46.setTextSize(2, 12.0f);
        r46.setPadding(0, m883e(7, r8), 0, 0);
        r46.setMaxLines(1);
        r46.setClickable(true);
        r46.setFocusable(true);
        final boolean r47 = r18;
        final int r72 = r21;
        ViewGroup r30 = r9;
        r46.setOnClickListener(new ViewOnClickListenerC0749j(r32, r46, r47, r09, r011, r72, r12, r07));
        r14.addView(r46);
        final int r1 = 0;
        r15.addView(r14, new LinearLayout.LayoutParams(0, -2, 1.0f));
        View r022 = r14.getChildAt(0);
        if ((r022 instanceof TextView) == false) goto L105;
        r16 = (TextView) r022;
    L105:
        final TextView r023 = r16;
        r13.post(new RunnableC0750k(r023, r1));
        final int r28 = 1;
        r13.postDelayed(new RunnableC0750k(r023, r28), 400);
        final int r29 = 2;
        r13.postDelayed(new RunnableC0750k(r023, r29), 1200);
        LinearLayout.LayoutParams r024 = new LinearLayout.LayoutParams(-1, -2);
        r024.leftMargin = m883e(12, r8);
        r024.rightMargin = m883e(12, r8);
        r024.bottomMargin = m883e(8, r8);
        r13.addView(r15, r024);
        ScrollView r152 = new ScrollView(r32);
        r152.setFillViewport(true);
        r152.setOverScrollMode(1);
        LinearLayout r62 = new LinearLayout(r32);
        r62.setOrientation(1);
        r62.setPadding(m883e(16, r8), m883e(14, r8), m883e(16, r8), m883e(28, r8));
        final boolean r33 = r18;
        final int r63 = r21;
        InterfaceC0275a r025 = new C0751l(r32, r33, r09, r011, r63, r12, r07);
        LinearLayout r17 = new LinearLayout(r32);
        r17.setOrientation(0);
        r17.setGravity(16);
        r17.setPadding(m891i0(4, r8), m891i0(10, r8), m891i0(2, r8), m891i0(8, r8));
        TextView r210 = new TextView(r32);
        r210.setText("快捷");
        r210.setTextColor(r011);
        r210.setTextSize(2, 12.0f);
        r210.setTypeface(Typeface.DEFAULT_BOLD);
        r210.setLetterSpacing(0.04f);
        r17.addView(r210, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r211 = new TextView(r32);
        r211.setText("✎");
        r211.setContentDescription("编辑快捷");
        r211.setGravity(17);
        r211.setTextSize(2, 13.0f);
        r211.setTextColor(r12);
        GradientDrawable r34 = new GradientDrawable();
        r34.setShape(1);
        r34.setColor(Color.argb(24, Color.red(r12), Color.green(r12), Color.blue(r12)));
        r211.setBackground(r34);
        r211.setClickable(true);
        r211.setFocusable(true);
        r211.setOnClickListener(new ViewOnClickListenerC0745f(r025, 0));
        GradientDrawable r026 = new GradientDrawable();
        r026.setShape(1);
        r026.setColor(-1);
        r211.setBackground(new RippleDrawable(ColorStateList.valueOf(Color.argb(40, Color.red(r12), Color.green(r12), Color.blue(r12))), r211.getBackground(), r026));
        r17.addView(r211, new LinearLayout.LayoutParams(m891i0(28, r8), m891i0(28, r8)));
        r62.addView(r17);
        List r027 = m863M();
        ArrayList r73 = new ArrayList(AbstractC0183n.m559k0(r027, 10));
        Iterator r028 = r027.iterator();
    L107:
        if (r028.hasNext() == false) goto L109;
        EnumC0583E0 r19 = (EnumC0583E0) r028.next();
        r73.add(new C0752m(r19.f1759d, r19.f1757b, r19.f1758c, new C0741b(r32, r19, 0)));
        goto L107
    L109:
        m866P(r62, r32, r21, r09, r011, r8, r73);
        m889h0(r62, r32, "OKK", r011, r8);
        ConfigStore r029 = ConfigStore.f2048a;     // Catch: Throwable -> L112
        Object r030 = Boolean.valueOf(ConfigStore.m1661c("virtual_location_enabled", false));     // Catch: Throwable -> L112
    L114:
        Object r110 = Boolean.FALSE;
        if ((r030 instanceof C0140f) == false) goto L117;
        r030 = r110;
    L117:
        boolean r111 = ((Boolean) r030).booleanValue();
        ConfigStore r031 = ConfigStore.f2048a;     // Catch: Throwable -> L120
        Object r032 = Boolean.valueOf(ConfigStore.m1661c("bottom_tab_floating", false));     // Catch: Throwable -> L120
    L122:
        Object r212 = Boolean.FALSE;
        if ((r032 instanceof C0140f) == false) goto L125;
        r032 = r212;
    L125:
        boolean r033 = ((Boolean) r032).booleanValue();
        C0752m r213 = new C0752m("⚙", "模块设置", "全部功能开关 · 配置", new SettingsAction(r32, 0));
        C0752m r35 = new C0752m("🎨", "主题", "主界面壁纸 · 实时透明度", new SettingsAction(r32, 1));
        if (r111 == false) goto L128;
        String r112 = "已开启 · 点进配置";
    L129:
        C0752m r48 = new C0752m("📍", "虚拟定位", r112, new SettingsAction(r32, 2));
        if (r033 == false) goto L132;
        String r53 = "已开启 · 点进配置";
    L133:
        m866P(r62, r32, r21, r09, r011, r8, AbstractC0182m.m556h0(new C0752m[]{r213, r35, r48, new C0752m("▢", "悬浮底栏", r53, new SettingsAction(r32, 3))}));
        m889h0(r62, r32, "其它", r011, r8);
        m866P(r62, r32, r21, r09, r011, r8, AbstractC0182m.m556h0(new C0752m[]{new C0752m("💬", "帮助与反馈", "Telegram 群", new SettingsAction(r32, 11)), new C0752m("ℹ", "关于", "模块设置 · 关于页", new SettingsAction(r32, 12))}));
        TextView r034 = new TextView(r32);
        r034.setText("长按无 · 左滑关闭侧栏");
        r034.setTextColor(r011);
        r034.setTextSize(2, 11.0f);
        r034.setGravity(17);
        r034.setPadding(0, m883e(18, r8), 0, m883e(8, r8));
        r62.addView(r034);
        r152.addView(r62, new ViewGroup.LayoutParams(-1, -2));
        r13.addView(r152, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        View r035 = new View(r32);
        r035.setBackgroundColor(r12);
        r035.setAlpha(0.85f);
        r13.addView(r035, new LinearLayout.LayoutParams(-1, m883e(3, r8)));
        FrameLayout.LayoutParams r036 = new FrameLayout.LayoutParams(r7, -1);
        r036.gravity = 8388611;
        r13.setLayoutParams(r036);
        r13.setTranslationX(-r7);
        r13.setElevation((int) ((10 * r8) + 0.5f));
        final C0311k r182 = new C0311k();
        final C0310j r192 = new C0310j();
        r13.setOnTouchListener(new ViewOnTouchListenerC0746g(r182, r192, r7, r3, r8));
        r6.addView(r3);
        r6.addView(r13);
        r30.addView(r6);
        r6.requestFocus();
        r6.setOnKeyListener(new ViewOnKeyListenerC0747h());
        f736p = r6;
        f737q = r13;
        f738r = r3;
        return new C0753n(r13, r3, r7);
    L132:
        r53 = "未开启 · 点进配置";
        goto L133
    L128:
        r112 = "未开启 · 点进配置";
    L120:
        th = move-exception;
        r032 = AbstractC0040p.m116u(th);
    L112:
        th = move-exception;
        r030 = AbstractC0040p.m116u(th);
        goto L114
    L101:
        r021 = "#6E7D70";
    L81:
        th = move-exception;
        r019 = AbstractC0040p.m116u(th);
    L73:
        th = move-exception;
        r018 = AbstractC0040p.m116u(th);
    L69:
        r45 = "我";
        goto L70
    L60:
        r4 = "#EAF1EA";
        goto L61
    L55:
        r25 = (int) (28 * r32.getResources().getDisplayMetrics().density);
        goto L56
    L50:
        r012 = "#0F000000";
        goto L49
    L45:
        r21 = -1;
        goto L46
    L42:
        r010 = "#6B736C";
        goto L41
    L38:
        r08 = "#1C1F1C";
        goto L37
    L34:
        r06 = "#F7F8F6";
        goto L33
    L30:
        r18 = false;
        goto L31
    L19:
        r05 = null;
        goto L20
    L9:
        r9 = null;
        goto L10
    L5:
        r03 = null;
        goto L7
    }

    /* JADX INFO: renamed from: d0 */
    public static CompatibilityReport m882d0(Context r13) {
        AbstractC0307g.m703e(r13, "context");
        CompatibilityReport r02 = CompatibilityReport.f1683h;
        if (r02 == null) goto L5;
        return r02;
    L5:
        PackageManager r03 = r13.getPackageManager();
        String r1 = r13.getPackageName();
        Object r4 = null;
        if (AbstractC0307g.m699a(r1, ModernHookEntry.WECHAT_PACKAGE) == true) goto L9;
        r1 = null;
    L9:
        if (r1 != null) goto L11;
        String r10 = ModernHookEntry.WECHAT_PACKAGE;
    L80:
    L16:
        th = move-exception;
        Object r04 = AbstractC0040p.m116u(th);
    L22:
        if ((r04 instanceof C0140f) == false) goto L24;
        r04 = null;
    L24:
        PackageInfo r05 = (PackageInfo) r04;
        if (r05 == null) goto L29;
        String r3 = r05.versionName;
        if (r3 == null) goto L29;
        String r32 = AbstractC0425j.m1022a1(r3).toString();
    L30:
        String r5 = "";
        if (r32 != null) goto L34;
        r32 = "";
    L34:
        if (AbstractC0425j.m1013R0(r32) == false) goto L36;
        r32 = "unknown";
    L36:
        String r6 = r32;
        if (r05 != null) goto L39;
        long r11 = 0;
    L84:
    L46:
        th = move-exception;
        Object r132 = AbstractC0040p.m116u(th);
    L52:
        if ((r132 instanceof C0140f) == true) goto L55;
        r4 = r132;
    L55:
        String r42 = (String) r4;
        if (r42 == null) goto L59;
        r5 = r42;
    L59:
        boolean r133 = AbstractC0425j.m1005J0(r5, "com.android.vending", true);
        EnumC0568r r2 = EnumC0568r.f1680b;
        if (r133 == false) goto L62;
    L71:
        EnumC0568r r9 = r2;
    L73:
        CompatibilityReport r134 = new CompatibilityReport(r6, r11, r9, r10);
        CompatibilityReport.f1683h = r134;
        AbstractC0762d.m1954d("[OKK-WxVer] " + AbstractC0324d.m725h("resolved ", r134.m1383a()));     // Catch: Throwable -> L76
    L78:
        return r134;
    L76:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L78
    L62:
        if (AbstractC0425j.m1005J0(r5, "google", true) == true) goto L71;
        if (AbstractC0433r.m1033H0(r6, "8.0.", false) == true) goto L67;
        r9 = EnumC0568r.f1681c;
        goto L73
    L67:
        if (r11 <= 0) goto L71;
        if ((r11 % ((long) 10)) != 0) goto L71;
        r2 = EnumC0568r.f1679a;
        goto L71
    L44:
        if (Build.VERSION.SDK_INT < 30) goto L48;
        r132 = AbstractC1056b.m2532a(AbstractC0130v.m440e(r13.getPackageManager()));     // Catch: Throwable -> L46
        goto L52
    L48:
        r132 = r13.getPackageManager().getInstallerPackageName(ModernHookEntry.WECHAT_PACKAGE);     // Catch: Throwable -> L46
        goto L52
    L39:
        if (Build.VERSION.SDK_INT < 28) goto L41;
        r11 = AbstractC0053c.m173d(r05);
        goto L84
    L41:
        r11 = r05.versionCode;
    L29:
        r32 = null;
        goto L30
    L14:
        if (Build.VERSION.SDK_INT < 33) goto L18;
        r04 = AbstractC0150d.m470a(r03, r10, AbstractC0150d.m471b());     // Catch: Throwable -> L16
    L79:
        goto L22
    L18:
        r04 = r03.getPackageInfo(r10, 0);     // Catch: Throwable -> L16
        goto L79
    L11:
        r10 = r1;
        goto L80
    }

    /* JADX INFO: renamed from: e */
    public static final int m883e(int r02, float r1) {
        return (int) ((r02 * r1) + 0.5f);
    }

    /* JADX INFO: renamed from: e0 */
    public static AppFingerprint m884e0(final Context r9, final C0817b r10, final ClassLoader r11, final String r12) {
        AbstractC0307g.m703e(r9, "context");
        AbstractC0307g.m703e(r11, "classLoader");
        CompatibilityReport r02 = m882d0(r9);
        String r2 = m912u(r9, r02, r12);
        List r1 = FeatureProbeCatalog.f1659b;
        int r3 = r1.size();
        m919x0("probe start fp=" + r2 + " needDialog=true total=" + r3);
        ModuleLog r8 = ModuleLog.INSTANCE;
        StringBuilder r4 = new StringBuilder("适配检查开始 · 共 ");
        r4.append(r3);
        r4.append(" 项 · fp=");
        r4.append(r2);
        r8.m1813i(r4.toString());
        if (f730j == true) goto L9;
        List r13 = (List) DexKitManager.m1367f(r9, r11, r12, new C0554d(r9, r10, r11, r12));
        if (r13 != null) goto L7;
        m919x0("DexKit unavailable, class-only probes");
        r13 = m886f0(new C0562l(r11, null, r9, r12), r10);
    L7:
        AppFingerprint r92 = new AppFingerprint(r2, r02.m1383a(), System.currentTimeMillis(), m870T(r02, r13), true);
        m888g0(r92);
        f730j = true;
        m919x0("probe done " + r92.m1361e());
        r8.m1813i("适配检查完成 · " + r92.m1361e());
        return r92;
    L9:
        m919x0("re-scan: using cached probe results (bridge unavailable after first use)");
        r8.m1813i("适配复检 · 跳过 DexKit bridge，复用首次扫描缓存");
        AppFingerprint r42 = m862L();
        if (r42 == null) goto L23;
        Iterator r93 = r1.iterator();
        int r112 = 0;
    L13:
        if (r93.hasNext() == false) goto L21;
        Object r122 = r93.next();
        int r14 = r112 + 1;
        if (r112 < 0) goto L19;
        r10.m2126a(Integer.valueOf(r14), Integer.valueOf(r3), FeatureProbeCatalog.m1371a((C0556f) r122, r112));
        Thread.sleep(15);     // Catch: InterruptedException -> L33
    L18:
        r112 = r14;
        goto L13
    L19:
        AbstractC0182m.m558j0();
        throw null;
    L21:
        AppFingerprint r94 = new AppFingerprint(r2, r02.m1383a(), System.currentTimeMillis(), r42.f1641d, true);
        m888g0(r94);
        m919x0("re-scan done (cached) " + r94.m1361e());
        ModuleLog.INSTANCE.m1813i("适配复检完成（复用缓存） · " + r94.m1361e());
        return r94;
    L23:
        m919x0("re-scan but no cached report, doing full scan without bridge");
        Object r95 = m886f0(new C0562l(r11, null, r9, r12), r10);     // Catch: Throwable -> L26
    L28:
        Object r102 = C0190u.f401a;
        if ((r95 instanceof C0140f) == false) goto L31;
        r95 = r102;
    L31:
        AppFingerprint r96 = new AppFingerprint(r2, r02.m1383a(), System.currentTimeMillis(), m870T(r02, (List) r95), true);
        m888g0(r96);
        return r96;
    L26:
        th = move-exception;
        r95 = AbstractC0040p.m116u(th);
        goto L28
    }

    /* JADX INFO: renamed from: f */
    public static final void m885f(TextView r2) {
        InterfaceC0275a r02 = f741u;
        if (r02 == null) goto L11;
        String r03 = (String) r02.invoke();
        if (r03 == null) goto L11;
        if ((!AbstractC0425j.m1013R0(r03)) == true) goto L10;
        r03 = null;
    L10:
        if (r03 == null) goto L11;
    L12:
        if (r2 == null) goto L15;
        r2.setText(r03);
        return;
    L15:
        return;
    L11:
        r03 = "我";
        goto L12
    }

    /* JADX INFO: renamed from: f0 */
    public static ArrayList m886f0(C0562l r10, C0817b r11) {
        List r02 = FeatureProbeCatalog.f1659b;
        int r1 = r02.size();
        ArrayList r2 = new ArrayList(r1);
        Iterator r03 = r02.iterator();
        int r3 = 0;
    L4:
        if (r03.hasNext() == false) goto L29;
        Object r4 = r03.next();
        int r5 = r3 + 1;
        if (r3 < 0) goto L27;
        C0556f r42 = (C0556f) r4;
        String r32 = FeatureProbeCatalog.m1371a(r42, r3);
        r11.m2126a(Integer.valueOf(r5), Integer.valueOf(r1), r32);
        Object r43 = r42.m1369a(r10);     // Catch: Throwable -> L10
    L12:
        Throwable r7 = AbstractC0141g.m465a(r43);
        if (r7 == null) goto L19;
        DiagnosticLevel r9 = DiagnosticLevel.f1666c;
        String r72 = r7.getMessage();
        if (r72 != null) goto L18;
        r72 = "error";
    L18:
        r43 = new DiagnosticItem("?", r32, r9, r72);
    L19:
        DiagnosticItem r44 = (DiagnosticItem) r43;
        String r73 = r44.f1669b;
        if (AbstractC0425j.m1013R0(r73) == false) goto L22;
    L23:
        r44 = DiagnosticItem.m1375a(r44, r32, null, null, 13);
    L24:
        m919x0("${fixed.level} ${fixed.id} ${fixed.detail}");
        ModuleLog.INSTANCE.m1813i("适配 ${i + 1}/$total ${fixed.title}: ${fixed.level.name} · ${fixed.detail}");
        r2.add(r44);
        Thread.sleep(40);     // Catch: InterruptedException -> L30
    L26:
        r3 = r5;
        goto L4
    L22:
        if (r73.equals("?") == false) goto L24;
    L10:
        th = move-exception;
        r43 = AbstractC0040p.m116u(th);
        goto L12
    L27:
        AbstractC0182m.m558j0();
        throw null;
    L29:
        return r2;
    }

    /* JADX INFO: renamed from: g */
    public static final Object m887g(Object r6, String r7, Object... r8) {
        if (r6 == null) goto L17;
        Class<?> r02 = r6.getClass();
        ArrayList r1 = new ArrayList(r8.length);
        int r2 = r8.length;
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L18;
        Object r5 = r8[r4];
        if (r5 == null) goto L8;
        Class<?> r52 = r5.getClass();
    L9:
        r1.add(r52);
        r4 = r4 + 1;
        goto L4
    L8:
        r52 = null;
        goto L9
    L18:
        return m910t(r02, r7, (Class[]) r1.toArray(new Class[0])).invoke(r6, Arrays.copyOf(r8, r8.length));
    L13:
        e = move-exception;
        Throwable r62 = e.getTargetException();
        AbstractC0307g.m702d(r62, "getTargetException(...)");
        throw new C0138d(r62);
    L17:
        throw new NullPointerException("receiver == null");
    }

    /* JADX INFO: renamed from: g0 */
    public static void m888g0(AppFingerprint r7) {
        f727g = r7;
        if (r7.f1642e == false) goto L5;
    L8:
        boolean r1 = true;
    L9:
        f728h = r1;
        new File("/sdcard/Android/media/com.tencent.mm/OKK").mkdirs();     // Catch: Throwable -> L14
        JSONArray r12 = new JSONArray();     // Catch: Throwable -> L14
        Iterator r2 = r7.f1641d.iterator();     // Catch: Throwable -> L14
    L12:
        if (r2.hasNext() == false) goto L16;
        DiagnosticItem r3 = (DiagnosticItem) r2.next();     // Catch: Throwable -> L14
        r12.put(new JSONObject().put("id", r3.f1668a).put("title", r3.f1669b).put("level", r3.f1670c.name()).put("detail", r3.f1671d));     // Catch: Throwable -> L14
        goto L12
    L16:
        JSONObject r13 = new JSONObject().put("fingerprint", r7.f1638a).put("wechat", r7.f1639b).put("atMs", r7.f1640c).put("summary", r7.m1361e()).put("results", r12).put("pendingDialog", f728h);     // Catch: Throwable -> L14
        File r22 = new File(new File("/sdcard/Android/media/com.tencent.mm/OKK"), "compat_report.json");     // Catch: Throwable -> L14
        String r02 = r13.toString(2);     // Catch: Throwable -> L14
        AbstractC0307g.m702d(r02, "toString(...)");     // Catch: Throwable -> L14
        AbstractC0270k.m694k0(r22, r02);     // Catch: Throwable -> L14
        r7.m1361e();     // Catch: Throwable -> L14
        Object r72 = C0146l.f339a;     // Catch: Throwable -> L14
    L19:
        Throwable r73 = AbstractC0141g.m465a(r72);
        if (r73 == null) goto L26;
        r73.getMessage();
        return;
    L26:
        return;
    L14:
        th = move-exception;
        r72 = AbstractC0040p.m116u(th);
        goto L19
    L5:
        if (m869S(r7.f1638a) == true) goto L8;
        r1 = false;
        goto L9
    }

    /* JADX INFO: renamed from: h0 */
    public static void m889h0(LinearLayout r2, Context r3, String r4, int r5, float r6) {
        TextView r02 = new TextView(r3);
        r02.setText(r4);
        r02.setTextColor(r5);
        r02.setTextSize(2, 12.0f);
        r02.setTypeface(Typeface.DEFAULT_BOLD);
        int r32 = (int) ((4 * r6) + 0.5f);
        r02.setPadding(r32, (int) ((10 * r6) + 0.5f), r32, (int) ((8 * r6) + 0.5f));
        r02.setLetterSpacing(0.04f);
        r2.addView(r02);
    }

    /* JADX INFO: renamed from: i */
    public static void m890i(int r5) {
        if (2 > r5) goto L8;
        if (r5 >= 37) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("radix " + r5 + " was not in valid range " + new C0340c(2, 36, 1));
    }

    /* JADX INFO: renamed from: i0 */
    public static final int m891i0(int r02, float r1) {
        return (int) ((r02 * r1) + 0.5f);
    }

    /* JADX INFO: renamed from: j */
    public static int m892j(C0352L r02, C0385u r1, View r2, View r3, AbstractC0343C r4, boolean r5) {
        if (r4.m813r() != 0) goto L5;
        return 0;
    L5:
        if (r02.m832a() == 0) goto L16;
        if (r2 == null) goto L17;
        if (r3 == null) goto L18;
        if (r5 == false) goto L11;
        int r03 = r1.m964b(r3) - r1.m967e(r2);
        return Math.min(r1.m974l(), r03);
    L11:
        return Math.abs(AbstractC0343C.m765D(r2) - AbstractC0343C.m765D(r3)) + 1;
    L18:
        return 0;
    L17:
        return 0;
    L16:
        return 0;
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m893j0(Object r1, Object r2, String r3) {
        m908s(r1.getClass(), r3).set(r1, r2);
    }

    /* JADX INFO: renamed from: k */
    public static int m894k(C0352L r3, C0385u r4, View r5, View r6, AbstractC0343C r7, boolean r8, boolean r9) {
        if (r7.m813r() != 0) goto L5;
    L17:
        return 0;
    L5:
        if (r3.m832a() == 0) goto L17;
        if (r5 == null) goto L17;
        if (r6 == null) goto L17;
        int r72 = Math.min(AbstractC0343C.m765D(r5), AbstractC0343C.m765D(r6));
        int r1 = Math.max(AbstractC0343C.m765D(r5), AbstractC0343C.m765D(r6));
        if (r9 == false) goto L12;
        int r32 = Math.max(0, (r3.m832a() - r1) - 1);
    L13:
        if (r8 == true) goto L16;
        return r32;
    L16:
        return Math.round((r32 * (Math.abs(r4.m964b(r6) - r4.m967e(r5)) / (Math.abs(AbstractC0343C.m765D(r5) - AbstractC0343C.m765D(r6)) + 1))) + (r4.m973k() - r4.m967e(r5)));
    L12:
        r32 = Math.max(0, r72);
        goto L13
    }

    /* JADX INFO: renamed from: l */
    public static int m895l(C0352L r02, C0385u r1, View r2, View r3, AbstractC0343C r4, boolean r5) {
        if (r4.m813r() != 0) goto L5;
        return 0;
    L5:
        if (r02.m832a() == 0) goto L16;
        if (r2 == null) goto L17;
        if (r3 == null) goto L18;
        if (r5 == true) goto L13;
        return r02.m832a();
    L13:
        return (int) (((r1.m964b(r3) - r1.m967e(r2)) / (Math.abs(AbstractC0343C.m765D(r2) - AbstractC0343C.m765D(r3)) + 1)) * r02.m832a());
    L18:
        return 0;
    L17:
        return 0;
    L16:
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static C0493r m896m(Context r8) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        C1121e r02 = new C0478c(20);
    L6:
        PackageManager r1 = r8.getPackageManager();
        AbstractC0040p.m106i(r1, "Package manager required to locate emoji font provider");
        int r3 = 0;
        Iterator<ResolveInfo> r2 = r1.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
    L8:
        if (r2.hasNext() == false) goto L16;
        ProviderInfo r4 = r2.next().providerInfo;
        if (r4 == null) goto L8;
        ApplicationInfo r6 = r4.applicationInfo;
        if (r6 == null) goto L8;
        if ((r6.flags & 1) != 1) goto L8;
    L17:
        if (r4 != null) goto L30;
    L18:
        C0005f r12 = null;
    L26:
        if (r12 != null) goto L29;
        return null;
    L29:
        return new C0493r(new C0492q(r8, r12));
    L30:
        String r22 = r4.authority;     // Catch: PackageManager.NameNotFoundException -> L24
        String r42 = r4.packageName;     // Catch: PackageManager.NameNotFoundException -> L24
        Signature[] r03 = r02.mo1198d(r1, r42);     // Catch: PackageManager.NameNotFoundException -> L24
        ArrayList r13 = new ArrayList();     // Catch: PackageManager.NameNotFoundException -> L24
        int r62 = r03.length;     // Catch: PackageManager.NameNotFoundException -> L24
    L20:
        if (r3 >= r62) goto L22;
        r13.add(r03[r3].toByteArray());     // Catch: PackageManager.NameNotFoundException -> L24
        r3 = r3 + 1;     // Catch: PackageManager.NameNotFoundException -> L24
        goto L20
    L22:
        r12 = new C0005f(r22, r42, "emojicompat-emoji-font", Collections.singletonList(r13));     // Catch: PackageManager.NameNotFoundException -> L24
    L24:
        e = move-exception;
        Log.wtf("emoji2.text.DefaultEmojiConfig", e);
        goto L18
    L16:
        r4 = null;
        goto L17
    L5:
        r02 = new C1121e(20);
        goto L6
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m897m0(int r2, String r3, String r4) {
        if (r2 != 10000) goto L5;
        return false;
    L5:
        if (r2 != 10002) goto L7;
        return false;
    L7:
        if (r2 != 922746929) goto L9;
        return false;
    L9:
        if (r2 != 318767153) goto L11;
        return false;
    L11:
        if (AbstractC0425j.m1013R0(r3) == true) goto L23;
        if (AbstractC0425j.m1005J0(r3, "<sysmsg", false) == false) goto L23;
        if (AbstractC0425j.m1005J0(r3, "revokemsg", false) == false) goto L18;
    L21:
        return false;
    L18:
        if (AbstractC0425j.m1005J0(r3, "patmsg", false) == true) goto L21;
        if (AbstractC0425j.m1005J0(r3, "sysmsgtemplate", false) == true) goto L21;
    L23:
        if (m859I(r3) == false) goto L25;
        return false;
    L25:
        if (m859I(r4) == true) goto L33;
        return true;
    L33:
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m898n(boolean r11) {
        FrameLayout r3 = f736p;
        if (r3 != null) goto L5;
        return;
    L5:
        LinearLayout r4 = f737q;
        View r5 = f738r;
        if (r4 == null) goto L13;
        int r7 = r4.getWidth();
        Integer r8 = Integer.valueOf(r7);
        if (r7 > 0) goto L11;
        r8 = null;
    L11:
        if (r8 == null) goto L13;
        int r72 = r8.intValue();
    L18:
        if (r11 == false) goto L24;
        if (r4 == null) goto L24;
        if (r5 == null) goto L24;
        f739s = true;
        r4.setLayerType(2, null);
        AnimatorSet r112 = new AnimatorSet();
        r112.playTogether(new Animator[]{ObjectAnimator.ofFloat(r4, View.TRANSLATION_X, new float[]{r4.getTranslationX(), -r72}), ObjectAnimator.ofFloat(r5, View.ALPHA, new float[]{r5.getAlpha(), 0.0f})});
        r112.setDuration(180);
        r112.setInterpolator(new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f));
        r112.addListener(new C0368d(r5, r3, r4));
        r112.start();
        return;
    L24:
        m900o(r5, r3, r4);
        return;
    L13:
        if (r4 == null) goto L17;
        ViewGroup.LayoutParams r73 = r4.getLayoutParams();
        if (r73 == null) goto L17;
        r72 = r73.width;
    L17:
        r72 = 0;
        goto L18
    }

    /* JADX INFO: renamed from: n0 */
    public static void m899n0(Activity r9) {
        int r2 = 1;
        AbstractC0307g.m703e(r9, "activity");
        if (r9.isFinishing() == false) goto L6;
        return;
    L6:
        if (f739s == false) goto L9;
        return;
    L9:
        if (m858H() == false) goto L11;
        return;
    L11:
        new WeakReference(r9);
        C0753n r92 = m881d(r9);
        if (r92 != null) goto L14;
        return;
    L14:
        View r3 = r92.f2626a;
        View r4 = r92.f2627b;
        int r93 = r92.f2628c;
        f739s = true;
        r3.setLayerType(2, null);
        AnimatorSet r5 = new AnimatorSet();
        r5.playTogether(new Animator[]{ObjectAnimator.ofFloat(r3, View.TRANSLATION_X, new float[]{-r93, 0.0f}), ObjectAnimator.ofFloat(r4, View.ALPHA, new float[]{0.0f, 0.42f})});
        r5.setDuration(280);
        r5.setInterpolator(new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f));
        r5.addListener(new C0755p((LinearLayout) r3, r2));
        r5.start();
    }

    /* JADX INFO: renamed from: o */
    public static final void m900o(View r1, FrameLayout r2, LinearLayout r3) {
        if (r3 != null) goto L32;
    L8:
        if (r1 == null) goto L30;
        ViewPropertyAnimator r12 = r1.animate();     // Catch: Throwable -> L6
        if (r12 == null) goto L30;
        r12.cancel();     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L30:
        ViewParent r32 = r2.getParent();     // Catch: Throwable -> L18
        if ((r32 instanceof ViewGroup) == false) goto L20;
        ViewGroup r33 = (ViewGroup) r32;     // Catch: Throwable -> L18
    L21:
        if (r33 == null) goto L26;
        r33.removeView(r2);     // Catch: Throwable -> L18
    L26:
        if (f736p != r2) goto L28;
        f736p = null;
        f737q = null;
        f738r = null;
    L28:
        f739s = false;
        return;
    L20:
        r33 = null;
    L18:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L26
    L32:
        ViewPropertyAnimator r34 = r3.animate();     // Catch: Throwable -> L6
        if (r34 == null) goto L8;
        r34.cancel();     // Catch: Throwable -> L6
        goto L8
    }

    /* JADX INFO: renamed from: o0 */
    public static final TextView m901o0(Activity r3, int r4, float r5, int r6, boolean r7, String r8, boolean r9, InterfaceC0275a r10) {
        TextView r02 = new TextView(r3);
        r02.setText(r8);
        r02.setGravity(17);
        r02.setTextSize(2, 14.0f);
        r02.setTypeface(Typeface.DEFAULT_BOLD);
        r02.setPadding(m903p0(18, r5), m903p0(10, r5), m903p0(18, r5), m903p0(10, r5));
        GradientDrawable r32 = new GradientDrawable();
        r32.setShape(0);
        r32.setCornerRadius(m903p0(12, r5));
        if (r9 == false) goto L5;
        r32.setColor(r6);
    L10:
        r02.setBackground(r32);
        if (r9 == false) goto L13;
        r4 = -1;
    L13:
        r02.setTextColor(r4);
        r02.setClickable(true);
        r02.setFocusable(true);
        r02.setOnClickListener(new ViewOnClickListenerC0745f(r10, 2));
        return r02;
    L5:
        if (r7 == false) goto L8;
        String r52 = "#22FFFFFF";
    L9:
        r32.setColor(Color.parseColor(r52));
        goto L10
    L8:
        r52 = "#0F000000";
        goto L9
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m902p(char r2, char r3, boolean r4) {
        if (r2 != r3) goto L6;
        return true;
    L6:
        if (r4 == true) goto L8;
        return false;
    L8:
        char r22 = Character.toUpperCase(r2);
        char r32 = Character.toUpperCase(r3);
        if (r22 != r32) goto L11;
        return true;
    L11:
        if (Character.toLowerCase(r22) != Character.toLowerCase(r32)) goto L14;
        return true;
    L14:
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public static final int m903p0(int r02, float r1) {
        return (int) ((r02 * r1) + 0.5f);
    }

    /* JADX INFO: renamed from: q */
    public static final C1121e m904q(Class r10, String r11, Object... r12) {
        AbstractC0307g.m703e(r10, "clazz");
        AbstractC0307g.m703e(r12, "parameterTypesAndCallback");
        if (r12.length != 0) goto L5;
        Object r02 = null;
    L7:
        if ((r02 instanceof AbstractC0761c) == false) goto L9;
        AbstractC0761c r03 = (AbstractC0761c) r02;
    L10:
        if (r03 == null) goto L49;
        int r3 = r12.length - 1;
        if (r3 >= 0) goto L14;
        r3 = 0;
    L14:
        if (r3 < 0) goto L47;
        if (r3 != 0) goto L18;
        Iterable r122 = C0190u.f401a;
    L29:
        ArrayList r1 = new ArrayList(AbstractC0183n.m559k0(r122, 10));
        Iterator r123 = r122.iterator();
    L31:
        if (r123.hasNext() == false) goto L45;
        Object r32 = r123.next();
        ClassLoader r5 = r10.getClassLoader();
        if (r32 != null) goto L36;
        Class r33 = null;
    L41:
        r1.add(r33);
        goto L31
    L36:
        if ((r32 instanceof Class) == false) goto L39;
        r33 = (Class) r32;
        goto L41
    L39:
        if ((r32 instanceof String) == false) goto L43;
        r33 = m906r(r5, (String) r32);
        goto L41
    L43:
        throw new IllegalArgumentException("Unsupported parameter type spec: " + r32);
    L45:
        return AbstractC0762d.m1952b(m910t(r10, r11, (Class[]) r1.toArray(new Class[0])), r03);
    L18:
        if (r3 < r12.length) goto L20;
        r122 = AbstractC0179j.m540q0(r12);
        goto L29
    L20:
        if (r3 != 1) goto L22;
        r122 = AbstractC0040p.m82F(r12[0]);
        goto L29
    L22:
        ArrayList r52 = new ArrayList(r3);
        int r6 = r12.length;
        int r7 = 0;
        int r8 = 0;
    L23:
        if (r7 >= r6) goto L28;
        r52.add(r12[r7]);
        r8 = r8 + 1;
        if (r8 == r3) goto L28;
        r7 = r7 + 1;
    L28:
        r122 = r52;
        goto L29
    L47:
        throw new IllegalArgumentException(("Requested element count " + r3 + " is less than zero.").toString());
    L49:
        throw new IllegalArgumentException("no XC_MethodHook callback supplied");
    L9:
        r03 = null;
        goto L10
    L5:
        r02 = r12[r12.length - 1];
        goto L7
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m905q0(int r2, int r3, int r4, boolean r5, float r6, LinearLayout r7, boolean r8) {
        GradientDrawable r02 = new GradientDrawable();
        r02.setShape(0);
        r02.setCornerRadius(m903p0(14, r6));
        r02.setColor(r4);
        if (r8 == false) goto L5;
        r02.setStroke(m903p0(1, r6), r2);
    L11:
        r7.setBackground(r02);
        TextView r62 = (TextView) r7.findViewWithTag("check");
        if (r62 == null) goto L17;
        if (r8 == false) goto L15;
        String r72 = "✓";
    L16:
        r62.setText(r72);
        goto L17
    L15:
        r72 = "";
    L17:
        if (r62 == null) goto L21;
        if (r8 == false) goto L20;
        r3 = r2;
    L20:
        r62.setTextColor(r3);
    L21:
        if (r62 == null) goto L32;
        GradientDrawable r32 = new GradientDrawable();
        r32.setShape(1);
        if (r8 == false) goto L25;
        r32.setColor(Color.argb(28, Color.red(r2), Color.green(r2), Color.blue(r2)));
    L30:
        r62.setBackground(r32);
        return;
    L25:
        if (r5 == false) goto L28;
        String r22 = "#18FFFFFF";
    L29:
        r32.setColor(Color.parseColor(r22));
        goto L30
    L28:
        r22 = "#0A000000";
        goto L29
    L32:
        return;
    L5:
        int r63 = m903p0(1, r6);
        if (r5 == false) goto L9;
        String r1 = "#22FFFFFF";
    L10:
        r02.setStroke(r63, Color.parseColor(r1));
        goto L11
    L9:
        r1 = "#0F000000";
        goto L10
    }

    /* JADX INFO: renamed from: r */
    public static final Class m906r(ClassLoader r1, String r2) {
        AbstractC0307g.m703e(r2, "className");
        if (r1 == null) goto L11;
    L7:
        return Class.forName(r2, false, r1);
    L5:
        th = move-exception;
        throw new C0138d(th);
    L11:
        r1 = ClassLoader.getSystemClassLoader();     // Catch: Throwable -> L5
        goto L7
    }

    /* JADX INFO: renamed from: r0 */
    public static final TextView m907r0(Activity r4, int r5, float r6, int r7, boolean r8, String r9, boolean r10, InterfaceC0275a r11) {
        TextView r02 = new TextView(r4);
        r02.setText(r9);
        r02.setGravity(17);
        r02.setTextSize(2, 14.0f);
        r02.setTypeface(Typeface.DEFAULT_BOLD);
        r02.setPadding(m909s0(18, r6), m909s0(10, r6), m909s0(18, r6), m909s0(10, r6));
        if (r10 == false) goto L5;
        r5 = -1;
    L5:
        r02.setTextColor(r5);
        GradientDrawable r42 = new GradientDrawable();
        r42.setShape(0);
        r42.setCornerRadius(m909s0(10, r6));
        if (r10 == true) goto L12;
        if (r8 == false) goto L11;
        String r52 = "#22FFFFFF";
    L10:
        r7 = Color.parseColor(r52);
        goto L12
    L11:
        r52 = "#10000000";
    L12:
        r42.setColor(r7);
        r02.setBackground(r42);
        r02.setClickable(true);
        r02.setOnClickListener(new ViewOnClickListenerC0745f(r11, 1));
        return r02;
    }

    /* JADX INFO: renamed from: s */
    public static final Field m908s(Class r3, String r4) {
        AbstractC0307g.m703e(r4, "fieldName");
        Class r02 = r3;
    L3:
        if (r02 == null) goto L8;
        Field r1 = r02.getDeclaredField(r4);     // Catch: NoSuchFieldException -> L6
        r1.setAccessible(true);     // Catch: NoSuchFieldException -> L6
        return r1;
    L6:
        r02 = r02.getSuperclass();
        goto L3
    L8:
        throw new NoSuchFieldError(r3.getName() + "#" + r4);
    }

    /* JADX INFO: renamed from: s0 */
    public static final int m909s0(int r02, float r1) {
        return (int) ((r02 * r1) + 0.5f);
    }

    /* JADX INFO: renamed from: t */
    public static Method m910t(Class r11, String r12, Class[] r13) {
        Method r02 = null;
        Class r1 = r11;
    L4:
        if (r1 == null) goto L50;
        C0172c r3 = AbstractC0317q.m714c(r1.getDeclaredMethods());
    L7:
        if (r3.hasNext() == false) goto L49;
        Method r4 = (Method) r3.next();
        if (AbstractC0307g.m699a(r4.getName(), r12) == false) goto L7;
        if (r4.getParameterTypes().length != r13.length) goto L7;
        Class<?>[] r5 = r4.getParameterTypes();
        AbstractC0307g.m702d(r5, "getParameterTypes(...)");
        boolean r9 = false;
        Iterable r7 = new C0340c(0, r5.length - 1, 1);
        if ((r7 instanceof Collection) == true) goto L16;
    L18:
        Iterator r72 = r7.iterator();
    L20:
        if (((C0339b) r72).f662c == false) goto L17;
        int r8 = ((C0339b) r72).m757a();
        Class r10 = r13[r8];
        if (r10 == null) goto L24;
        boolean r82 = m915v0(r5[r8]).isAssignableFrom(m915v0(r10));
    L28:
        if (r82 == true) goto L20;
        boolean r52 = false;
    L30:
        if (r52 == true) goto L31;
        if (r02 != null) goto L7;
        Class<?>[] r53 = r4.getParameterTypes();
        AbstractC0307g.m702d(r53, "getParameterTypes(...)");
        Iterable r6 = new C0340c(0, r53.length - 1, 1);
        if ((r6 instanceof Collection) == true) goto L37;
    L39:
        Iterator r62 = r6.iterator();
    L41:
        if (((C0339b) r62).f662c == false) goto L38;
        int r73 = ((C0339b) r62).m757a();
        if (r13[r73] == null) goto L41;
        Class r83 = m915v0(r53[r73]);
        Class r74 = r13[r73];
        AbstractC0307g.m700b(r74);
        if (r83.isAssignableFrom(m915v0(r74)) == true) goto L41;
    L47:
        if (r9 == false) goto L7;
        r02 = r4;
    L38:
        r9 = true;
        goto L47
    L37:
        if (((Collection) r6).isEmpty() == false) goto L39;
    L31:
        r4.setAccessible(true);
        return r4;
    L24:
        if (r5[r8].isPrimitive() == true) goto L26;
        r82 = true;
        goto L28
    L26:
        r82 = false;
    L17:
        r52 = true;
        goto L30
    L16:
        if (((Collection) r7).isEmpty() == false) goto L18;
    L49:
        r1 = r1.getSuperclass();
        goto L4
    L50:
        if (r02 == null) goto L54;
        r02.setAccessible(true);
        return r02;
    L54:
        throw new NoSuchMethodError(r11.getName() + "#" + r12 + "/" + r13.length);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m911t0(ViewGroup r2, boolean r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        AbstractC0464w.m1094b(r2, r3);
        return;
    L6:
        if (f723c == false) goto L14;
        AbstractC0464w.m1094b(r2, r3);     // Catch: NoSuchMethodError -> L9
        return;
    L9:
        f723c = false;
        return;
    }

    /* JADX INFO: renamed from: u */
    public static String m912u(Context r8, CompatibilityReport r9, String r10) {
        AbstractC0307g.m703e(r8, "context");
        String r02 = m872X(r8, ModernHookEntry.WECHAT_PACKAGE);
        Object r2 = null;
        if (r10 != null) goto L31;
    L12:
        File r3 = null;
    L13:
        if (r3 != null) goto L15;
    L19:
        Object r102 = null;
    L21:
        if ((r102 instanceof C0140f) == true) goto L24;
        r2 = r102;
    L24:
        String r22 = (String) r2;
        if (r22 != null) goto L27;
    L28:
        r22 = m872X(r8, "com.abc.module");
    L30:
        return r9.f1685b + "|" + r9.f1684a + "|1.2.1|wx=" + r02 + "|mod=" + r22;
    L27:
        if (AbstractC0425j.m1013R0(r22) == false) goto L30;
    L15:
        if (r3.isFile() == false) goto L19;
        r102 = "apk_" + r3.length() + "_" + r3.lastModified();     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r102 = AbstractC0040p.m116u(th);
        goto L21
    L31:
        if ((!AbstractC0425j.m1013R0(r10)) == true) goto L8;
        r10 = null;
    L8:
        if (r10 == null) goto L12;
        r3 = new File(r10);     // Catch: Throwable -> L10
        goto L13
    }

    /* JADX INFO: renamed from: u0 */
    public static void m913u0(Activity r1) {
        AbstractC0307g.m703e(r1, "activity");
        m858H();
        if (m858H() == false) goto L5;
        m898n(true);
        return;
    L5:
        m899n0(r1);
    }

    /* JADX INFO: renamed from: v */
    public static String m914v(String r24, C0601K0 r25) {
        AbstractC0307g.m703e(r24, "template");
        if (r24.length() != 0) goto L6;
        return "";
    L6:
        int r1 = r25.f1836b;
        C0139e r4 = new C0139e("totalMsg", String.valueOf(r1));
        int r3 = r25.f1837c;
        C0139e r6 = new C0139e("textMsg", String.valueOf(r3));
        int r5 = r25.f1838d;
        C0139e r8 = new C0139e("textWord", String.valueOf(r5));
        int r7 = r25.f1839e;
        C0139e r10 = new C0139e("emojiMsg", String.valueOf(r7));
        int r9 = r25.f1840f;
        C0139e r12 = new C0139e("transferMsg", String.valueOf(r9));
        int r11 = r25.f1841g;
        C0139e r14 = new C0139e("redBagMsg", String.valueOf(r11));
        int r02 = r25.f1842h;
        Iterator r03 = AbstractC0193x.m564h0(new C0139e[]{r4, r6, r8, r10, r12, r14, new C0139e("fileMsg", String.valueOf(r02)), new C0139e("tatalmsg", String.valueOf(r1)), new C0139e("totalmsg", String.valueOf(r1)), new C0139e("totmsg", String.valueOf(r1)), new C0139e("textmsg", String.valueOf(r3)), new C0139e("textword", String.valueOf(r5)), new C0139e("emojimsg", String.valueOf(r7)), new C0139e("emoji", String.valueOf(r7)), new C0139e("transfermsg", String.valueOf(r9)), new C0139e("transfer", String.valueOf(r9)), new C0139e("redbagmsg", String.valueOf(r11)), new C0139e("redbag", String.valueOf(r11)), new C0139e("filemsg", String.valueOf(r02)), new C0139e("word", String.valueOf(r5))}).entrySet().iterator();
        String r13 = r24;
    L8:
        if (r03.hasNext() == false) goto L12;
        Map.Entry r2 = (Map.Entry) r03.next();
        String r32 = (String) r2.getKey();
        String r22 = (String) r2.getValue();
        String r33 = AbstractC0324d.m723f("${", r32, "}");
        if (AbstractC0425j.m1005J0(r13, r33, true) == false) goto L8;
        r13 = AbstractC0433r.m1031F0(r13, r33, r22, true);
        goto L8
    L12:
        return r13;
    }

    /* JADX INFO: renamed from: v0 */
    public static Class m915v0(Class r1) {
        if (r1.isPrimitive() == true) goto L6;
        return r1;
    L6:
        if (r1.equals(Boolean.TYPE) == false) goto L9;
        return Boolean.class;
    L9:
        if (r1.equals(Byte.TYPE) == false) goto L12;
        return Byte.class;
    L12:
        if (r1.equals(Character.TYPE) == false) goto L15;
        return Character.class;
    L15:
        if (r1.equals(Short.TYPE) == false) goto L18;
        return Short.class;
    L18:
        if (r1.equals(Integer.TYPE) == false) goto L21;
        return Integer.class;
    L21:
        if (r1.equals(Long.TYPE) == false) goto L24;
        return Long.class;
    L24:
        if (r1.equals(Float.TYPE) == false) goto L27;
        return Float.class;
    L27:
        if (r1.equals(Double.TYPE) == false) goto L30;
        return Double.class;
    L30:
        if (r1.equals(Void.TYPE) == false) goto L41;
        return Void.class;
    L41:
        return r1;
    }

    /* JADX INFO: renamed from: w */
    public static Drawable m916w(Context r1, int r2) {
        return C0933v0.m2263c().m2268e(r1, r2);
    }

    /* JADX INFO: renamed from: w0 */
    public static void m917w0(ByteArrayOutputStream r4, long r5) {
    L3:
        if (((-128) & r5) == 0) goto L4;
        r4.write((int) ((127 & r5) | 128));
        r5 = r5 >>> 7;
        goto L3
    L4:
        r4.write((int) r5);
    }

    /* JADX INFO: renamed from: x */
    public static Set m918x() {
        Object r02 = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);     // Catch: Throwable -> L13
        if (r02 == null) goto L5;
        Set r03 = (Set) r02;     // Catch: Throwable -> L13
        Iterator r1 = r03.iterator();     // Catch: Throwable -> L13
    L8:
        if (r1.hasNext() == false) goto L19;
        if ((r1.next() instanceof int[]) == true) goto L8;
        return Collections.emptySet();
    L19:
        return r03;
    L5:
        return Collections.emptySet();
    L14:
        return Collections.emptySet();
    }

    /* JADX INFO: renamed from: x0 */
    public static void m919x0(String r2) {
        AbstractC0762d.m1954d("[OKK-CompatProbe] " + r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    /* JADX INFO: renamed from: y */
    public static final Object m920y(Object r1, String r2) {
        AbstractC0307g.m703e(r2, "fieldName");
        if (r1 == null) goto L7;
        return m908s(r1.getClass(), r2).get(r1);
    L7:
        throw new NullPointerException("receiver == null");
    }

    /* JADX INFO: renamed from: U */
    public abstract void mo921U(Throwable r1);

    /* JADX INFO: renamed from: V */
    public abstract void mo922V(C0463v r1);

    /* JADX INFO: renamed from: h */
    public abstract void m923h();

    /* JADX INFO: renamed from: k0 */
    public void mo924k0(View r2, float r3) {
        if (f724d == true) goto L9;
    L7:
        r2.setAlpha(r3);
        return;
    L9:
        AbstractC0466y.m1098b(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f724d = false;
        goto L7
    }

    /* JADX INFO: renamed from: l0 */
    public void mo925l0(View r4, int r5) {
        if (f726f == false) goto L15;
    L7:
        Field r02 = f725e;
        if (r02 == null) goto L17;
        int r03 = r02.getInt(r4);     // Catch: IllegalAccessException -> L12
        f725e.setInt(r4, r5 | (r03 & (-13)));     // Catch: IllegalAccessException -> L12
        return;
    L18:
        return;
    L17:
        return;
    L15:
        Field r1 = View.class.getDeclaredField("mViewFlags");     // Catch: NoSuchFieldException -> L11
        f725e = r1;     // Catch: NoSuchFieldException -> L11
        r1.setAccessible(true);     // Catch: NoSuchFieldException -> L11
    L6:
        f726f = true;
        goto L7
    }

    /* JADX INFO: renamed from: z */
    public float mo926z(View r2) {
        if (f724d == false) goto L8;
        return AbstractC0466y.m1097a(r2);
    L6:
        f724d = false;
    L8:
        return r2.getAlpha();
    }
}
