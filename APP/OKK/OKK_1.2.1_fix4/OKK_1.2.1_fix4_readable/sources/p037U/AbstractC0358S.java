package p037U;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
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
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.PathInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.emoji2.text.C0478c;
import androidx.emoji2.text.C0492q;
import androidx.emoji2.text.C0493r;
import com.abc.core.features.C0571A0;
import com.abc.core.features.C0601K0;
import com.abc.core.features.ConfigStore;
import com.abc.core.features.EnumC0583E0;
import com.abc.core.features.SettingsEntryHook;
import com.abc.core.hooks.ModuleLog;
import com.abc.core.runtime.C0817b;
import com.abc.internal.probe.AppFingerprint;
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
import com.abc.ui.C0752m;
import com.abc.ui.C0753n;
import com.abc.ui.C0754o;
import com.abc.ui.C0755p;
import com.abc.ui.SettingsAction;
import com.abc.ui.ViewOnClickListenerC0740a;
import com.abc.ui.ViewOnClickListenerC0745f;
import com.abc.ui.ViewOnKeyListenerC0747h;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.AbstractC0762d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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
import org.luckypray.dexkit.DexKitBridge;
import p000A.C0005f;
import p001A0.AbstractC0040p;
import p001A0.ViewOnClickListenerC0025a;
import p007D0.AbstractC0141g;
import p007D0.C0138d;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.AbstractC0188s;
import p009E0.AbstractC0193x;
import p009E0.C0172c;
import p009E0.C0190u;
import p014H0.C0206e;
import p014H0.InterfaceC0202a;
import p014H0.InterfaceC0205d;
import p016I0.C0210b;
import p016I0.C0211c;
import p018J0.AbstractC0231a;
import p020K0.C0240a;
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
import p037U.AbstractC0358S;
import p040V0.C0406i;
import p042W0.AbstractC0416a;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0419d;
import p043Y.AbstractC0464w;
import p043Y.AbstractC0466y;
import p043Y.C0463v;
import p057g.C0933v0;
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
    public static void m851A(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (!m856F(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !m856F(b4) && !m856F(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: B */
    public static void m852B(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (m856F(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || m856F(b4)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    /* JADX INFO: renamed from: C */
    public static void m853C(byte b2, byte b3, char[] cArr, int i2) {
        if (b2 < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (m856F(b3)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: D */
    public static byte[] m854D(byte[] bArr) {
        Object objM116u;
        Object objM116u2;
        if (bArr == null || bArr.length == 0) {
            return bArr == null ? new byte[0] : bArr;
        }
        try {
            objM116u = new String(bArr, AbstractC0416a.f921a);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if ((str != null && AbstractC0425j.m1005J0(str, "[已删除]", false)) || bArr.length == 0) {
            return bArr;
        }
        try {
            objM116u2 = m874Z(bArr);
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        Object obj = bArr;
        if (!(objM116u2 instanceof C0140f)) {
            obj = objM116u2;
        }
        return (byte[]) obj;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m855E(String str) {
        if (str == null) {
            str = "";
        }
        if (!AbstractC0425j.m1005J0(str, "SnsComment", true) || !AbstractC0425j.m1005J0(str, "commentflag", true)) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("commentflag\\s*=\\s*[12]\\b", C1121e.m2635b(2));
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        return patternCompile.matcher(str).find();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m856F(byte b2) {
        return b2 > -65;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m857G(byte b2) {
        return b2 >= 0;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m858H() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = f736p;
        return ((frameLayout2 != null ? frameLayout2.getParent() : null) == null || (frameLayout = f736p) == null || frameLayout.getVisibility() != 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m859I(String str) {
        AbstractC0307g.m703e(str, "text");
        if (AbstractC0425j.m1013R0(str) || (!AbstractC0425j.m1005J0(str, "撤回", false) && !AbstractC0425j.m1005J0(str, "拍了拍", false) && !AbstractC0425j.m1005J0(str, "recalled", true) && !AbstractC0425j.m1005J0(str, "patmsg", true))) {
            return false;
        }
        if (!AbstractC0425j.m1013R0(str)) {
            Pattern patternCompile = Pattern.compile("\\s+");
            AbstractC0307g.m702d(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(str).replaceAll("");
            AbstractC0307g.m702d(strReplaceAll, "replaceAll(...)");
            if (!AbstractC0425j.m1005J0(strReplaceAll, "你撤回了一条消息", false) && !AbstractC0425j.m1005J0(strReplaceAll, "你撤回一条消息", false) && !AbstractC0425j.m1005J0(strReplaceAll, "Yourecalledamessage", true) && (!AbstractC0425j.m1005J0(strReplaceAll, "撤回", false) || !AbstractC0425j.m1005J0(strReplaceAll, "重新编辑", false))) {
            }
        } else {
            if (AbstractC0425j.m1013R0(str)) {
                return false;
            }
            Pattern patternCompile2 = Pattern.compile("\\s+");
            AbstractC0307g.m702d(patternCompile2, "compile(...)");
            String strReplaceAll2 = patternCompile2.matcher(str).replaceAll("");
            AbstractC0307g.m702d(strReplaceAll2, "replaceAll(...)");
            if (!AbstractC0425j.m1005J0(strReplaceAll2, "<patmsg", true) && (!AbstractC0425j.m1005J0(strReplaceAll2, "patmsg", true) || !AbstractC0425j.m1005J0(strReplaceAll2, "template", true))) {
                if (!AbstractC0425j.m1005J0(strReplaceAll2, "拍了拍", false)) {
                    return false;
                }
                if (!AbstractC0433r.m1033H0(strReplaceAll2, "\"", false) && !AbstractC0433r.m1033H0(strReplaceAll2, "“", false) && !AbstractC0433r.m1033H0(strReplaceAll2, "你拍了拍", false) && !AbstractC0425j.m1005J0(strReplaceAll2, "拍了拍我", false)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m860J(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public static C0406i m861K(InterfaceC0290p interfaceC0290p) {
        InterfaceC0202a c0210b;
        AbstractC0307g.m703e(interfaceC0290p, "block");
        C0406i c0406i = new C0406i();
        AbstractC0307g.m703e(interfaceC0290p, "<this>");
        AbstractC0307g.m703e(c0406i, "completion");
        if (interfaceC0290p instanceof AbstractC0231a) {
            c0210b = ((AbstractC0231a) interfaceC0290p).mo519d(c0406i, c0406i);
        } else {
            InterfaceC0205d interfaceC0205dMo588c = c0406i.mo588c();
            c0210b = interfaceC0205dMo588c == C0206e.f423a ? new C0210b(c0406i, interfaceC0290p, c0406i) : new C0211c(c0406i, interfaceC0205dMo588c, interfaceC0290p, c0406i);
        }
        c0406i.f908d = c0210b;
        return c0406i;
    }

    /* JADX INFO: renamed from: L */
    public static AppFingerprint m862L() {
        Object objM116u;
        try {
            File file = new File(new File("/sdcard/Android/media/com.tencent.mm/OKK"), "compat_report.json");
            if (!file.isFile()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(AbstractC0270k.m692i0(file, AbstractC0416a.f921a));
            JSONArray jSONArray = jSONObject.getJSONArray("results");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string = jSONObject2.getString("id");
                AbstractC0307g.m702d(string, "getString(...)");
                String string2 = jSONObject2.getString("title");
                AbstractC0307g.m702d(string2, "getString(...)");
                String string3 = jSONObject2.getString("level");
                AbstractC0307g.m702d(string3, "getString(...)");
                DiagnosticLevel diagnosticLevelValueOf = DiagnosticLevel.valueOf(string3);
                String strOptString = jSONObject2.optString("detail", "");
                AbstractC0307g.m702d(strOptString, "optString(...)");
                arrayList.add(new DiagnosticItem(string, string2, diagnosticLevelValueOf, strOptString));
            }
            String string4 = jSONObject.getString("fingerprint");
            AbstractC0307g.m702d(string4, "getString(...)");
            String strOptString2 = jSONObject.optString("wechat", "");
            AbstractC0307g.m702d(strOptString2, "optString(...)");
            AppFingerprint appFingerprint = new AppFingerprint(string4, strOptString2, jSONObject.optLong("atMs", 0L), arrayList, false);
            f727g = appFingerprint;
            objM116u = appFingerprint;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (AppFingerprint) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: M */
    public static List m863M() {
        Object objM116u;
        Object next;
        try {
            ConfigStore configStore = ConfigStore.f2048a;
            objM116u = ConfigStore.m1662d("home_drawer_shortcuts", "");
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        List<String> listM1019X0 = AbstractC0425j.m1019X0((String) (objM116u instanceof C0140f ? "" : objM116u), new char[]{','});
        ArrayList arrayList = new ArrayList();
        for (String str : listM1019X0) {
            EnumC0583E0.f1752e.getClass();
            AbstractC0307g.m703e(str, "id");
            Iterator it = EnumC0583E0.f1755h.iterator();
            while (true) {
                C0172c c0172c = (C0172c) it;
                if (!c0172c.hasNext()) {
                    next = null;
                    break;
                }
                next = c0172c.next();
                if (AbstractC0433r.m1029D0(((EnumC0583E0) next).f1756a, AbstractC0425j.m1022a1(str).toString(), true)) {
                    break;
                }
            }
            EnumC0583E0 enumC0583E0 = (EnumC0583E0) next;
            if (enumC0583E0 != null) {
                arrayList.add(enumC0583E0);
            }
        }
        List listM549u0 = AbstractC0181l.m549u0(3, AbstractC0181l.m543o0(arrayList));
        if (!listM549u0.isEmpty()) {
            return listM549u0;
        }
        EnumC0583E0.f1752e.getClass();
        return EnumC0583E0.f1753f;
    }

    /* JADX INFO: renamed from: N */
    public static String m864N() {
        Object objM116u;
        try {
            File file = new File(new File("/sdcard/Android/media/com.tencent.mm/OKK"), "compat_dialog_shown.txt");
            if (!file.isFile()) {
                return null;
            }
            String string = AbstractC0425j.m1022a1(AbstractC0270k.m692i0(file, AbstractC0416a.f921a)).toString();
            boolean zM1013R0 = AbstractC0425j.m1013R0(string);
            objM116u = string;
            if (zM1013R0) {
                objM116u = null;
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (String) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: O */
    public static void m865O(String str) {
        AbstractC0307g.m703e(str, "fp");
        f728h = false;
        f729i = false;
        try {
            new File("/sdcard/Android/media/com.tencent.mm/OKK").mkdirs();
            AbstractC0270k.m693j0(new File(new File("/sdcard/Android/media/com.tencent.mm/OKK"), "compat_dialog_shown.txt"), str, AbstractC0416a.f921a);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m866P(LinearLayout linearLayout, Context context, int i2, int i3, int i4, float f2, List list) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i5 = 14;
        gradientDrawable.setCornerRadius(m867Q(14, f2));
        gradientDrawable.setColor(i2);
        linearLayout2.setBackground(gradientDrawable);
        linearLayout2.setElevation(m867Q(2, f2));
        int i6 = 0;
        for (Object obj : list) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                AbstractC0182m.m558j0();
                throw null;
            }
            C0752m c0752m = (C0752m) obj;
            if (i6 > 0) {
                View view = new View(context);
                view.setBackgroundColor(Color.parseColor("#0F000000"));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
                layoutParams.leftMargin = m867Q(52, f2);
                linearLayout2.addView(view, layoutParams);
            }
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(16);
            linearLayout3.setPadding(m867Q(i5, f2), m867Q(13, f2), m867Q(i5, f2), m867Q(13, f2));
            linearLayout3.setClickable(true);
            linearLayout3.setFocusable(true);
            int color = Color.parseColor((context.getResources().getConfiguration().uiMode & 48) == 32 ? "#33FFFFFF" : "#22000000");
            float fM867Q = m867Q(i5, f2);
            float f3 = i6 == 0 ? fM867Q : 0.0f;
            if (i6 != list.size() - 1) {
                fM867Q = 0.0f;
            }
            float[] fArr = {f3, f3, f3, f3, fM867Q, fM867Q, fM867Q, fM867Q};
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadii(fArr);
            gradientDrawable2.setColor(-1);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadii(fArr);
            gradientDrawable3.setColor(i2);
            linearLayout3.setBackground(new RippleDrawable(ColorStateList.valueOf(color), gradientDrawable3, gradientDrawable2));
            linearLayout3.setOnClickListener(new ViewOnClickListenerC0025a(4, c0752m));
            TextView textView = new TextView(context);
            textView.setText(c0752m.f2622a);
            textView.setTextSize(2, 16.0f);
            textView.setGravity(17);
            linearLayout3.addView(textView, new LinearLayout.LayoutParams(m867Q(28, f2), m867Q(28, f2)));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(1);
            linearLayout4.setPadding(m867Q(10, f2), 0, 0, 0);
            TextView textView2 = new TextView(context);
            textView2.setText(c0752m.f2623b);
            textView2.setTextColor(i3);
            textView2.setTextSize(2, 15.0f);
            linearLayout4.addView(textView2);
            TextView textView3 = new TextView(context);
            textView3.setText(c0752m.f2624c);
            textView3.setTextColor(i4);
            textView3.setTextSize(2, 11.0f);
            textView3.setPadding(0, m867Q(2, f2), 0, 0);
            linearLayout4.addView(textView3);
            linearLayout3.addView(linearLayout4, new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("›");
            textView4.setTextColor(i4);
            textView4.setTextSize(2, 18.0f);
            linearLayout3.addView(textView4);
            linearLayout2.addView(linearLayout3);
            i6 = i7;
            i5 = 14;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = m867Q(6, f2);
        linearLayout.addView(linearLayout2, layoutParams2);
    }

    /* JADX INFO: renamed from: Q */
    public static final int m867Q(int i2, float f2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m868R(Activity activity, InterfaceC0275a interfaceC0275a) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue;
        if (f739s) {
            return;
        }
        LinearLayout linearLayout = f737q;
        View view = f738r;
        if (linearLayout != null) {
            int width = linearLayout.getWidth();
            Integer numValueOf = Integer.valueOf(width);
            if (width <= 0) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : (linearLayout == null || (layoutParams = linearLayout.getLayoutParams()) == null) ? 0 : layoutParams.width;
        }
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView != null) {
            decorView.postDelayed(new RunnableC0321a(linearLayout, view, iIntValue), 50L);
        }
        if (decorView != null) {
            decorView.postDelayed(new RunnableC0328h(activity, interfaceC0275a, 5), 90L);
        }
    }

    /* JADX INFO: renamed from: S */
    public static boolean m869S(String str) {
        AbstractC0307g.m703e(str, "fp");
        String strM864N = m864N();
        return strM864N == null || !strM864N.equals(str);
    }

    /* JADX INFO: renamed from: T */
    public static ArrayList m870T(CompatibilityReport compatibilityReport, List list) {
        int i2;
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DiagnosticItem diagnosticItemM1375a = (DiagnosticItem) it.next();
            DiagnosticLevel diagnosticLevel = diagnosticItemM1375a.f1670c;
            if (diagnosticLevel != DiagnosticLevel.f1666c) {
                boolean z2 = compatibilityReport.f1688e == 8 && compatibilityReport.f1689f == 0 && 69 <= (i2 = compatibilityReport.f1690g) && i2 < 77;
                DiagnosticLevel diagnosticLevel2 = DiagnosticLevel.f1665b;
                String str = diagnosticItemM1375a.f1671d;
                if (!z2) {
                    diagnosticItemM1375a = DiagnosticItem.m1375a(diagnosticItemM1375a, null, diagnosticLevel2, AbstractC0425j.m1013R0(str) ? "超出主适配范围，按静态特征估计" : "超出主适配范围，按静态特征估计 · ".concat(str), 3);
                } else if (compatibilityReport.f1686c == EnumC0568r.f1681c && diagnosticLevel == DiagnosticLevel.f1664a) {
                    diagnosticItemM1375a = DiagnosticItem.m1375a(diagnosticItemM1375a, null, diagnosticLevel2, AbstractC0425j.m1013R0(str) ? "渠道未识别，需运行时验证" : "渠道未识别，需运行时验证 · ".concat(str), 3);
                }
            }
            arrayList.add(diagnosticItemM1375a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: W */
    public static C0753n m871W() {
        View view;
        int iIntValue;
        LinearLayout linearLayout = f737q;
        if (linearLayout == null || (view = f738r) == null) {
            return null;
        }
        int width = linearLayout.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            iIntValue = layoutParams != null ? layoutParams.width : 0;
        }
        if (iIntValue <= 0) {
            return null;
        }
        return new C0753n(linearLayout, view, iIntValue);
    }

    /* JADX INFO: renamed from: X */
    public static String m872X(Context context, String str) {
        Object objM116u;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0);
            objM116u = packageInfo.firstInstallTime + "_" + packageInfo.lastUpdateTime;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (AbstractC0141g.m465a(objM116u) != null) {
            objM116u = "na";
        }
        return (String) objM116u;
    }

    /* JADX INFO: renamed from: Y */
    public static int m873Y(String str, int i2) {
        Object objM116u;
        String string = AbstractC0425j.m1022a1(str).toString();
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return i2;
        }
        if (!AbstractC0433r.m1033H0(string, "#", false)) {
            string = "#".concat(string);
        }
        try {
            objM116u = Integer.valueOf(Color.parseColor(string));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object objValueOf = Integer.valueOf(i2);
        if (objM116u instanceof C0140f) {
            objM116u = objValueOf;
        }
        return ((Number) objM116u).intValue();
    }

    /* JADX INFO: renamed from: Z */
    public static byte[] m874Z(byte[] bArr) throws IOException {
        C0139e c0139eM880c0;
        int iIntValue;
        Object objM116u;
        byte[] bArrCopyOf;
        AbstractC0307g.m703e(bArr, "buf");
        if ("[已删除] ".length() == 0) {
            return bArr;
        }
        int length = bArr.length;
        byte[] bytes = "[已删除] ".getBytes(AbstractC0416a.f921a);
        AbstractC0307g.m702d(bytes, "getBytes(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length + bytes.length + 8);
        boolean z2 = false;
        int i2 = 0;
        while (i2 < bArr.length && (c0139eM880c0 = m880c0(bArr, i2)) != null) {
            long jLongValue = ((Number) c0139eM880c0.f328a).longValue();
            int iIntValue2 = ((Number) c0139eM880c0.f329b).intValue();
            int i3 = (int) (7 & jLongValue);
            int i4 = (int) (jLongValue >>> 3);
            if (i3 == 0) {
                C0139e c0139eM880c02 = m880c0(bArr, iIntValue2);
                if (c0139eM880c02 == null) {
                    i2 = iIntValue2;
                    break;
                }
                iIntValue = ((Number) c0139eM880c02.f329b).intValue();
                byteArrayOutputStream.write(bArr, i2, iIntValue - i2);
                i2 = iIntValue;
            } else if (i3 == 1) {
                iIntValue = iIntValue2 + 8;
                if (iIntValue > bArr.length) {
                    i2 = iIntValue2;
                    break;
                }
                byteArrayOutputStream.write(bArr, i2, (iIntValue2 - i2) + 8);
                i2 = iIntValue;
            } else {
                if (i3 == 2) {
                    C0139e c0139eM880c03 = m880c0(bArr, iIntValue2);
                    if (c0139eM880c03 != null) {
                        long jLongValue2 = ((Number) c0139eM880c03.f328a).longValue();
                        iIntValue2 = ((Number) c0139eM880c03.f329b).intValue();
                        int i5 = ((int) jLongValue2) + iIntValue2;
                        if (i5 <= bArr.length) {
                            if (!z2 && i4 == 8 && ((int) jLongValue) == 66) {
                                AbstractC0040p.m114s(i5, bArr.length);
                                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iIntValue2, i5);
                                AbstractC0307g.m702d(bArrCopyOfRange, "copyOfRange(...)");
                                try {
                                    objM116u = new String(bArrCopyOfRange, AbstractC0416a.f921a);
                                } catch (Throwable th) {
                                    objM116u = AbstractC0040p.m116u(th);
                                }
                                if (objM116u instanceof C0140f) {
                                    objM116u = null;
                                }
                                String str = (String) objM116u;
                                if (str == null || !(AbstractC0433r.m1033H0(str, "[已删除]", false) || AbstractC0425j.m1005J0(str, "[已删除]", false))) {
                                    if (str != null) {
                                        bArrCopyOf = "[已删除] ".concat(str).getBytes(AbstractC0416a.f921a);
                                        AbstractC0307g.m702d(bArrCopyOf, "getBytes(...)");
                                    } else {
                                        byte[] bytes2 = "[已删除] ".getBytes(AbstractC0416a.f921a);
                                        AbstractC0307g.m702d(bytes2, "getBytes(...)");
                                        int length2 = bytes2.length;
                                        int length3 = bArrCopyOfRange.length;
                                        bArrCopyOf = Arrays.copyOf(bytes2, length2 + length3);
                                        System.arraycopy(bArrCopyOfRange, 0, bArrCopyOf, length2, length3);
                                        AbstractC0307g.m700b(bArrCopyOf);
                                    }
                                    m917w0(byteArrayOutputStream, 66);
                                    m917w0(byteArrayOutputStream, bArrCopyOf.length);
                                    byteArrayOutputStream.write(bArrCopyOf);
                                } else {
                                    byteArrayOutputStream.write(bArr, i2, i5 - i2);
                                }
                                z2 = true;
                            } else {
                                byteArrayOutputStream.write(bArr, i2, i5 - i2);
                            }
                            i2 = i5;
                        }
                    }
                } else {
                    if (i3 != 5) {
                        return bArr;
                    }
                    iIntValue = iIntValue2 + 4;
                    if (iIntValue <= bArr.length) {
                        byteArrayOutputStream.write(bArr, i2, (iIntValue2 - i2) + 4);
                        i2 = iIntValue;
                    }
                }
                i2 = iIntValue2;
                break;
            }
        }
        if (!z2) {
            m917w0(byteArrayOutputStream, 66);
            byte[] bytes3 = AbstractC0425j.m1022a1("[已删除] ").toString().getBytes(AbstractC0416a.f921a);
            AbstractC0307g.m702d(bytes3, "getBytes(...)");
            m917w0(byteArrayOutputStream, bytes3.length);
            byteArrayOutputStream.write(bytes3);
        }
        if (i2 < bArr.length && !z2) {
            return bArr;
        }
        if (i2 < bArr.length) {
            byteArrayOutputStream.write(bArr, i2, bArr.length - i2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC0307g.m702d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX INFO: renamed from: a */
    public static final C0419d m875a(Matcher matcher, int i2, CharSequence charSequence) {
        if (matcher.find(i2)) {
            return new C0419d(matcher, charSequence);
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX INFO: renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m876a0(String str, int i2, boolean z2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC0307g.m702d(lowerCase, "toLowerCase(...)");
        if (AbstractC0433r.m1033H0(lowerCase, "get", false) || AbstractC0433r.m1033H0(lowerCase, "is", false) || AbstractC0433r.m1033H0(lowerCase, "has", false) || AbstractC0433r.m1033H0(lowerCase, "can", false) || AbstractC0433r.m1033H0(lowerCase, "should", false) || AbstractC0433r.m1033H0(lowerCase, "equals", false) || lowerCase.equals("hashcode") || lowerCase.equals("tostring") || lowerCase.equals("compareto")) {
            return -1000;
        }
        int i3 = z2 ? 50 : 0;
        if (i2 == 1) {
            i3 += 20;
        } else if (i2 == 2) {
            i3 += 10;
        }
        if (AbstractC0425j.m1005J0(lowerCase, "quote", false) || AbstractC0425j.m1005J0(lowerCase, "refer", false) || AbstractC0425j.m1005J0(lowerCase, "reply", false)) {
            i3 += 80;
        }
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 3706) {
            switch (iHashCode) {
                case 97:
                    if (lowerCase.equals("a")) {
                        i3 += 30;
                    }
                    break;
                case 98:
                    if (lowerCase.equals("b")) {
                    }
                    break;
                case 99:
                    if (lowerCase.equals("c")) {
                    }
                    break;
                case 100:
                    if (lowerCase.equals("d")) {
                    }
                    break;
            }
        } else if (lowerCase.equals("v0")) {
        }
        if (lowerCase.length() <= 3) {
            i3 += 15;
        }
        return lowerCase.length() <= 2 ? i3 + 10 : i3;
    }

    /* JADX INFO: renamed from: b */
    public static C0601K0 m877b(C0601K0 c0601k0, int i2, String str) {
        int i3 = i2 & 65535;
        int length = (i3 == 1 && (AbstractC0425j.m1013R0(str) ^ true)) ? str.length() : 0;
        int i4 = c0601k0.f1836b + 1;
        int i5 = c0601k0.f1837c;
        if (i3 == 1) {
            i5++;
        }
        int i6 = i5;
        int i7 = c0601k0.f1838d + length;
        int i8 = c0601k0.f1839e;
        if (i3 == 47) {
            i8++;
        }
        int i9 = i8;
        int i10 = c0601k0.f1840f;
        if (i3 == 419430449 || AbstractC0425j.m1005J0(str, "微信转账", false)) {
            i10++;
        }
        int i11 = i10;
        int i12 = c0601k0.f1841g;
        if (i3 == 436207665 || AbstractC0425j.m1005J0(str, "微信红包", false)) {
            i12++;
        }
        int i13 = i12;
        int i14 = c0601k0.f1842h;
        if (i3 == 6 || i3 == 1090519089) {
            i14++;
        }
        int i15 = i14;
        String str2 = c0601k0.f1835a;
        AbstractC0307g.m703e(str2, "dateKey");
        return new C0601K0(str2, i4, i6, i7, i9, i11, i13, i15);
    }

    /* JADX INFO: renamed from: b0 */
    public static C0248b m878b0(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    C0248b c0248b = new C0248b();
                    int iPosition = byteBufferDuplicate.position() + AbstractC0324d.m719b(byteBufferDuplicate, ByteOrder.LITTLE_ENDIAN);
                    c0248b.f214d = byteBufferDuplicate;
                    c0248b.f211a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0248b.f212b = i7;
                    c0248b.f213c = ((ByteBuffer) c0248b.f214d).getShort(i7);
                    return c0248b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: c */
    public static void m879c(StringBuilder sb, Object obj, InterfaceC0286l interfaceC0286l) {
        if (interfaceC0286l != null) {
            sb.append((CharSequence) interfaceC0286l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static C0139e m880c0(byte[] bArr, int i2) {
        long j2 = 0;
        for (int i3 = 0; i2 < bArr.length && i3 < 64; i3 += 7) {
            byte b2 = bArr[i2];
            i2++;
            j2 |= ((long) (b2 & 127)) << i3;
            if ((b2 & 128) == 0) {
                return new C0139e(Long.valueOf(j2), Integer.valueOf(i2));
            }
        }
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
    public static C0753n m881d(final Activity activity) {
        View childAt;
        String str;
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        Object objM116u4;
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            if (AbstractC0307g.m699a(viewGroup.getChildAt(i2).getTag(), "achat_home_side_drawer")) {
                childAt = viewGroup.getChildAt(i2);
                break;
            }
            i2++;
        }
        if (childAt != null) {
            ViewParent parent = childAt.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(childAt);
            }
        }
        final float f2 = activity.getResources().getDisplayMetrics().density;
        final int iMin = Math.min((int) (activity.getResources().getDisplayMetrics().widthPixels * 0.78f), (int) ((300 * f2) + 0.5f));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setTag("achat_home_side_drawer");
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(true);
        frameLayout.setElevation((int) ((24 * f2) + 0.5f));
        final View view = new View(activity);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(-16777216);
        view.setAlpha(0.0f);
        view.setOnClickListener(new ViewOnClickListenerC0740a());
        boolean z2 = (activity.getResources().getConfiguration().uiMode & 48) == 32;
        final int color = Color.parseColor(z2 ? "#1A1C1A" : "#F7F8F6");
        final int color2 = Color.parseColor(z2 ? "#F2F4F2" : "#1C1F1C");
        final int color3 = Color.parseColor(z2 ? "#9AA39A" : "#6B736C");
        int color4 = z2 ? Color.parseColor("#242724") : -1;
        final int color5 = Color.parseColor("#2F8A4E");
        Color.parseColor(z2 ? "#22FFFFFF" : "#0F000000");
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(color);
        linearLayout.setOutlineProvider(new C0754o(f2));
        linearLayout.setClipToOutline(true);
        View view2 = new View(activity);
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : (int) (28 * activity.getResources().getDisplayMetrics().density)));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(m883e(20, f2), m883e(18, f2), m883e(16, f2), m883e(18, f2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m883e(22, f2));
        gradientDrawable.setColor(Color.parseColor(z2 ? "#202A38" : "#EAF1EA"));
        linearLayout2.setBackground(gradientDrawable);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.parseColor("#D0D0D0"));
        imageView.setBackground(gradientDrawable2);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new C0571A0(1));
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(m883e(52, f2), m883e(52, f2)));
        InterfaceC0286l interfaceC0286l = f740t;
        if (interfaceC0286l != null) {
            interfaceC0286l.invoke(imageView);
        }
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(m883e(14, f2), 0, 0, 0);
        TextView textView = new TextView(activity);
        InterfaceC0275a interfaceC0275a = f741u;
        if (interfaceC0275a == null || (str = (String) interfaceC0275a.invoke()) == null) {
            str = "我";
        }
        textView.setText(str);
        textView.setTextColor(color2);
        textView.setTextSize(2, 19.0f);
        textView.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        textView.setMaxLines(1);
        linearLayout3.addView(textView);
        final TextView textView2 = new TextView(activity);
        try {
            ConfigStore configStore = ConfigStore.f2048a;
            objM116u = Boolean.valueOf(ConfigStore.m1661c("home_drawer_signature_tip_shown", false));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        boolean zBooleanValue = ((Boolean) objM116u).booleanValue();
        try {
            objM116u2 = ConfigStore.m1662d("home_drawer_signature", "OKK 快捷面板");
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        if (objM116u2 instanceof C0140f) {
            objM116u2 = "OKK 快捷面板";
        }
        CharSequence charSequence = (CharSequence) objM116u2;
        String strConcat = (String) (AbstractC0425j.m1013R0(charSequence) ? "OKK 快捷面板" : charSequence);
        if (!zBooleanValue) {
            strConcat = "点击编辑签名 · ".concat(strConcat);
        }
        textView2.setText(strConcat);
        if (!zBooleanValue) {
            ConfigStore.m1664h("home_drawer_signature_tip_shown", "true");
        }
        textView2.setContentDescription("编辑侧栏签名");
        textView2.setTextColor(Color.parseColor(z2 ? "#9DA9B8" : "#6E7D70"));
        textView2.setTextSize(2, 12.0f);
        textView2.setPadding(0, m883e(7, f2), 0, 0);
        textView2.setMaxLines(1);
        textView2.setClickable(true);
        textView2.setFocusable(true);
        final boolean z3 = z2;
        final int i3 = color4;
        ViewGroup viewGroup3 = viewGroup;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: d0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Object objM116u5;
                Activity activity2 = activity;
                AbstractC0307g.m703e(activity2, "$activity");
                TextView textView3 = textView2;
                AbstractC0307g.m703e(textView3, "$this_apply");
                float f3 = activity2.getResources().getDisplayMetrics().density;
                EditText editText = new EditText(activity2);
                try {
                    ConfigStore configStore2 = ConfigStore.f2048a;
                    objM116u5 = ConfigStore.m1662d("home_drawer_signature", "OKK 快捷面板");
                } catch (Throwable th3) {
                    objM116u5 = AbstractC0040p.m116u(th3);
                }
                if (objM116u5 instanceof C0140f) {
                    objM116u5 = "OKK 快捷面板";
                }
                CharSequence charSequence2 = (CharSequence) objM116u5;
                editText.setText((String) (AbstractC0425j.m1013R0(charSequence2) ? "OKK 快捷面板" : charSequence2));
                editText.setSelectAllOnFocus(false);
                editText.setSingleLine(true);
                editText.setMaxLines(1);
                int i4 = color2;
                editText.setTextColor(i4);
                editText.setTextSize(2, 15.0f);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setCornerRadius(AbstractC0358S.m909s0(10, f3));
                gradientDrawable3.setColor(i3);
                int iM909s0 = AbstractC0358S.m909s0(1, f3);
                boolean z4 = z3;
                gradientDrawable3.setStroke(iM909s0, Color.parseColor(z4 ? "#22FFFFFF" : "#18000000"));
                editText.setBackground(gradientDrawable3);
                editText.setPadding(AbstractC0358S.m909s0(12, f3), 0, AbstractC0358S.m909s0(12, f3), 0);
                LinearLayout linearLayout4 = new LinearLayout(activity2);
                linearLayout4.setOrientation(1);
                linearLayout4.setPadding(AbstractC0358S.m909s0(20, f3), AbstractC0358S.m909s0(18, f3), AbstractC0358S.m909s0(20, f3), AbstractC0358S.m909s0(16, f3));
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setCornerRadius(AbstractC0358S.m909s0(18, f3));
                gradientDrawable4.setColor(color);
                linearLayout4.setBackground(gradientDrawable4);
                TextView textView4 = new TextView(activity2);
                textView4.setText("侧栏签名");
                textView4.setTextColor(i4);
                textView4.setTextSize(2, 18.0f);
                textView4.setTypeface(Typeface.DEFAULT_BOLD);
                linearLayout4.addView(textView4);
                TextView textView5 = new TextView(activity2);
                textView5.setText("显示在昵称下方，点击侧边栏签名可随时修改");
                textView5.setTextColor(color3);
                textView5.setTextSize(2, 12.0f);
                textView5.setPadding(0, AbstractC0358S.m909s0(5, f3), 0, AbstractC0358S.m909s0(14, f3));
                linearLayout4.addView(textView5);
                linearLayout4.addView(editText, new LinearLayout.LayoutParams(-1, AbstractC0358S.m909s0(48, f3)));
                Dialog dialog = new Dialog(activity2);
                dialog.requestWindowFeature(1);
                dialog.setContentView(linearLayout4);
                dialog.setCanceledOnTouchOutside(true);
                LinearLayout linearLayout5 = new LinearLayout(activity2);
                linearLayout5.setGravity(8388613);
                linearLayout5.setPadding(0, AbstractC0358S.m909s0(14, f3), 0, 0);
                C0743d c0743d = new C0743d(dialog, 0);
                int i5 = color5;
                linearLayout5.addView(AbstractC0358S.m907r0(activity2, i4, f3, i5, z4, "取消", false, c0743d));
                TextView textViewM907r0 = AbstractC0358S.m907r0(activity2, i4, f3, i5, z4, "保存", true, new SettingsCallback(editText, textView3, activity2, dialog));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart(AbstractC0358S.m909s0(8, f3));
                linearLayout5.addView(textViewM907r0, layoutParams);
                linearLayout4.addView(linearLayout5);
                dialog.show();
                Window window2 = dialog.getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawableResource(R.color.transparent);
                    window2.setLayout((int) (activity2.getResources().getDisplayMetrics().widthPixels * 0.82f), -2);
                    window2.setDimAmount(0.45f);
                }
            }
        });
        linearLayout3.addView(textView2);
        final int i4 = 0;
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        View childAt2 = linearLayout3.getChildAt(0);
        final TextView textView3 = childAt2 instanceof TextView ? (TextView) childAt2 : null;
        linearLayout.post(new Runnable() { // from class: d0.k
            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        AbstractC0358S.m885f(textView3);
                        break;
                    case 1:
                        AbstractC0358S.m885f(textView3);
                        break;
                    default:
                        AbstractC0358S.m885f(textView3);
                        break;
                }
            }
        });
        final int i5 = 1;
        linearLayout.postDelayed(new Runnable() { // from class: d0.k
            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        AbstractC0358S.m885f(textView3);
                        break;
                    case 1:
                        AbstractC0358S.m885f(textView3);
                        break;
                    default:
                        AbstractC0358S.m885f(textView3);
                        break;
                }
            }
        }, 400L);
        final int i6 = 2;
        linearLayout.postDelayed(new Runnable() { // from class: d0.k
            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        AbstractC0358S.m885f(textView3);
                        break;
                    case 1:
                        AbstractC0358S.m885f(textView3);
                        break;
                    default:
                        AbstractC0358S.m885f(textView3);
                        break;
                }
            }
        }, 1200L);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = m883e(12, f2);
        layoutParams.rightMargin = m883e(12, f2);
        layoutParams.bottomMargin = m883e(8, f2);
        linearLayout.addView(linearLayout2, layoutParams);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setFillViewport(true);
        scrollView.setOverScrollMode(1);
        LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setOrientation(1);
        linearLayout4.setPadding(m883e(16, f2), m883e(14, f2), m883e(16, f2), m883e(28, f2));
        final boolean z4 = z2;
        final int i7 = color4;
        InterfaceC0275a interfaceC0275a2 = new InterfaceC0275a() { // from class: d0.l
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View, android.view.ViewGroup] */
            /* JADX WARN: Type inference failed for: r28v0, types: [android.view.ViewGroup] */
            /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
            /* JADX WARN: Type inference failed for: r31v0 */
            /* JADX WARN: Type inference failed for: r32v0, types: [android.app.Dialog] */
            /* JADX WARN: Type inference failed for: r3v8, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v24 */
            /* JADX WARN: Type inference failed for: r4v25 */
            /* JADX WARN: Type inference failed for: r7v10, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
            /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
            /* JADX WARN: Type inference failed for: r9v1 */
            /* JADX WARN: Type inference failed for: r9v5 */
            /* JADX WARN: Type inference failed for: r9v6 */
            @Override // p029P0.InterfaceC0275a
            public final Object invoke() {
                final boolean z5;
                final int i8;
                boolean z6;
                C0751l c0751l = this;
                final Activity activity2 = activity;
                AbstractC0307g.m703e(activity2, "$activity");
                SettingsAction settingsAction = new SettingsAction(activity2, 6);
                final float f3 = activity2.getResources().getDisplayMetrics().density;
                C0240a c0240a = EnumC0583E0.f1755h;
                final ArrayList arrayListM541A0 = AbstractC0181l.m541A0(AbstractC0358S.m863M());
                Dialog dialog = new Dialog(activity2);
                dialog.requestWindowFeature(1);
                dialog.setCancelable(true);
                dialog.setCanceledOnTouchOutside(true);
                ?? linearLayout5 = new LinearLayout(activity2);
                linearLayout5.setOrientation(1);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setCornerRadius(AbstractC0358S.m903p0(20, f3));
                gradientDrawable3.setColor(color);
                linearLayout5.setBackground(gradientDrawable3);
                linearLayout5.setPadding(AbstractC0358S.m903p0(18, f3), AbstractC0358S.m903p0(18, f3), AbstractC0358S.m903p0(18, f3), AbstractC0358S.m903p0(16, f3));
                ?? linearLayout6 = new LinearLayout(activity2);
                linearLayout6.setOrientation(0);
                linearLayout6.setGravity(16);
                LinearLayout linearLayout7 = new LinearLayout(activity2);
                linearLayout7.setOrientation(1);
                TextView textView4 = new TextView(activity2);
                textView4.setText("编辑快捷");
                int i9 = color2;
                textView4.setTextColor(i9);
                textView4.setTextSize(2, 18.0f);
                textView4.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                linearLayout7.addView(textView4);
                TextView textView5 = new TextView(activity2);
                textView5.setText("已选 " + arrayListM541A0.size() + "/3 · 点选切换");
                int i10 = color3;
                textView5.setTextColor(i10);
                textView5.setTextSize(2, 12.0f);
                textView5.setPadding(0, AbstractC0358S.m903p0(4, f3), 0, 0);
                linearLayout7.addView(textView5);
                linearLayout6.addView(linearLayout7, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayout5.addView(linearLayout6);
                linearLayout5.addView(new View(activity2), new LinearLayout.LayoutParams(-1, AbstractC0358S.m903p0(14, f3)));
                LinearLayout linearLayout8 = new LinearLayout(activity2);
                linearLayout8.setOrientation(1);
                Iterator it = c0240a.iterator();
                ?? r4 = linearLayout8;
                ?? r9 = linearLayout5;
                while (true) {
                    C0172c c0172c = (C0172c) it;
                    boolean zHasNext = c0172c.hasNext();
                    z5 = z4;
                    i8 = color5;
                    if (!zHasNext) {
                        break;
                    }
                    final EnumC0583E0 enumC0583E0 = (EnumC0583E0) c0172c.next();
                    if (arrayListM541A0.isEmpty()) {
                        z6 = false;
                    } else {
                        Iterator it2 = arrayListM541A0.iterator();
                        while (it2.hasNext()) {
                            if (((EnumC0583E0) it2.next()) == enumC0583E0) {
                                z6 = true;
                                break;
                            }
                        }
                        z6 = false;
                    }
                    final ?? linearLayout9 = new LinearLayout(activity2);
                    linearLayout9.setOrientation(0);
                    linearLayout9.setGravity(16);
                    ?? r28 = r4;
                    final TextView textView6 = textView5;
                    linearLayout9.setPadding(AbstractC0358S.m903p0(14, f3), AbstractC0358S.m903p0(12, f3), AbstractC0358S.m903p0(12, f3), AbstractC0358S.m903p0(12, f3));
                    linearLayout9.setClickable(true);
                    linearLayout9.setFocusable(true);
                    TextView textView7 = new TextView(activity2);
                    textView7.setText(enumC0583E0.f1759d);
                    textView7.setTextSize(2, 20.0f);
                    textView7.setGravity(17);
                    linearLayout9.addView(textView7, new LinearLayout.LayoutParams(AbstractC0358S.m903p0(32, f3), AbstractC0358S.m903p0(32, f3)));
                    LinearLayout linearLayout10 = new LinearLayout(activity2);
                    linearLayout10.setOrientation(1);
                    linearLayout10.setPadding(AbstractC0358S.m903p0(12, f3), 0, AbstractC0358S.m903p0(8, f3), 0);
                    TextView textView8 = new TextView(activity2);
                    textView8.setText(enumC0583E0.f1757b);
                    textView8.setTextColor(i9);
                    textView8.setTextSize(2, 15.0f);
                    Typeface typeface = Typeface.DEFAULT_BOLD;
                    textView8.setTypeface(typeface);
                    linearLayout10.addView(textView8);
                    TextView textView9 = new TextView(activity2);
                    textView9.setText(enumC0583E0.f1758c);
                    textView9.setTextColor(i10);
                    textView9.setTextSize(2, 11.0f);
                    textView9.setPadding(0, AbstractC0358S.m903p0(2, f3), 0, 0);
                    linearLayout10.addView(textView9);
                    linearLayout9.addView(linearLayout10, new LinearLayout.LayoutParams(0, -2, 1.0f));
                    TextView textView10 = new TextView(activity2);
                    textView10.setTag("check");
                    textView10.setGravity(17);
                    textView10.setTextSize(2, 14.0f);
                    textView10.setTypeface(typeface);
                    linearLayout9.addView(textView10, new LinearLayout.LayoutParams(AbstractC0358S.m903p0(28, f3), AbstractC0358S.m903p0(28, f3)));
                    final int i11 = i7;
                    AbstractC0358S.m905q0(i8, i10, i11, z5, f3, linearLayout9, z6);
                    final int i12 = i10;
                    linearLayout9.setOnClickListener(new View.OnClickListener() { // from class: d0.i
                        /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onClick(View view3) {
                            List list = arrayListM541A0;
                            AbstractC0307g.m703e(list, "$selected");
                            Activity activity3 = activity2;
                            AbstractC0307g.m703e(activity3, "$activity");
                            LinearLayout linearLayout11 = linearLayout9;
                            AbstractC0307g.m703e(linearLayout11, "$row");
                            EnumC0583E0 enumC0583E02 = enumC0583E0;
                            AbstractC0307g.m703e(enumC0583E02, "$s");
                            TextView textView11 = textView6;
                            AbstractC0307g.m703e(textView11, "$countTv");
                            boolean zIsEmpty = list.isEmpty();
                            int i13 = i8;
                            int i14 = i12;
                            int i15 = i11;
                            boolean z7 = z5;
                            float f4 = f3;
                            if (!zIsEmpty) {
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (((EnumC0583E0) it3.next()) == enumC0583E02) {
                                        if (list.size() <= 1) {
                                            Toast.makeText(activity3, "至少保留 1 个快捷", 0).show();
                                            return;
                                        } else {
                                            AbstractC0188s.m562n0(list, new SettingsEntryHook(4, enumC0583E02));
                                            AbstractC0358S.m905q0(i13, i14, i15, z7, f4, linearLayout11, false);
                                        }
                                    }
                                }
                                if (list.size() < 3) {
                                }
                            } else if (list.size() < 3) {
                                Toast.makeText(activity3, "最多选 3 个", 0).show();
                                return;
                            } else {
                                list.add(enumC0583E02);
                                AbstractC0358S.m905q0(i13, i14, i15, z7, f4, linearLayout11, true);
                            }
                            textView11.setText("已选 " + list.size() + "/3 · 点选切换");
                        }
                    });
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.bottomMargin = AbstractC0358S.m903p0(8, f3);
                    r28.addView(linearLayout9, layoutParams2);
                    r4 = r28;
                    i10 = i10;
                    textView5 = textView6;
                    i9 = i9;
                    r9 = r9;
                    dialog = dialog;
                    c0751l = this;
                }
                int i13 = i9;
                ?? r32 = dialog;
                ?? r11 = r9;
                r11.addView(r4);
                LinearLayout linearLayout11 = new LinearLayout(activity2);
                linearLayout11.setOrientation(0);
                linearLayout11.setGravity(8388613);
                linearLayout11.setPadding(0, AbstractC0358S.m903p0(8, f3), 0, 0);
                TextView textViewM901o0 = AbstractC0358S.m901o0(activity2, i13, f3, i8, z5, "取消", false, new C0743d(r32, 1));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.setMarginEnd(AbstractC0358S.m903p0(8, f3));
                linearLayout11.addView(textViewM901o0, layoutParams3);
                linearLayout11.addView(AbstractC0358S.m901o0(activity2, i13, f3, i8, z5, "保存", true, new SettingsCallback(arrayListM541A0, activity2, (Dialog) r32, settingsAction)));
                r11.addView(linearLayout11);
                r32.setContentView(r11);
                Window window2 = r32.getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawableResource(R.color.transparent);
                    window2.setLayout((int) (activity2.getResources().getDisplayMetrics().widthPixels * 0.86f), -2);
                    window2.setDimAmount(0.45f);
                }
                r32.show();
                return C0146l.f339a;
            }
        };
        LinearLayout linearLayout5 = new LinearLayout(activity);
        linearLayout5.setOrientation(0);
        linearLayout5.setGravity(16);
        linearLayout5.setPadding(m891i0(4, f2), m891i0(10, f2), m891i0(2, f2), m891i0(8, f2));
        TextView textView4 = new TextView(activity);
        textView4.setText("快捷");
        textView4.setTextColor(color3);
        textView4.setTextSize(2, 12.0f);
        textView4.setTypeface(Typeface.DEFAULT_BOLD);
        textView4.setLetterSpacing(0.04f);
        linearLayout5.addView(textView4, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView5 = new TextView(activity);
        textView5.setText("✎");
        textView5.setContentDescription("编辑快捷");
        textView5.setGravity(17);
        textView5.setTextSize(2, 13.0f);
        textView5.setTextColor(color5);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(1);
        gradientDrawable3.setColor(Color.argb(24, Color.red(color5), Color.green(color5), Color.blue(color5)));
        textView5.setBackground(gradientDrawable3);
        textView5.setClickable(true);
        textView5.setFocusable(true);
        textView5.setOnClickListener(new ViewOnClickListenerC0745f(interfaceC0275a2, 0));
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(1);
        gradientDrawable4.setColor(-1);
        textView5.setBackground(new RippleDrawable(ColorStateList.valueOf(Color.argb(40, Color.red(color5), Color.green(color5), Color.blue(color5))), textView5.getBackground(), gradientDrawable4));
        linearLayout5.addView(textView5, new LinearLayout.LayoutParams(m891i0(28, f2), m891i0(28, f2)));
        linearLayout4.addView(linearLayout5);
        List<EnumC0583E0> listM863M = m863M();
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(listM863M, 10));
        for (EnumC0583E0 enumC0583E0 : listM863M) {
            arrayList.add(new C0752m(enumC0583E0.f1759d, enumC0583E0.f1757b, enumC0583E0.f1758c, new C0741b(activity, enumC0583E0, 0)));
        }
        m866P(linearLayout4, activity, color4, color2, color3, f2, arrayList);
        m889h0(linearLayout4, activity, "OKK", color3, f2);
        try {
            ConfigStore configStore2 = ConfigStore.f2048a;
            objM116u3 = Boolean.valueOf(ConfigStore.m1661c("virtual_location_enabled", false));
        } catch (Throwable th3) {
            objM116u3 = AbstractC0040p.m116u(th3);
        }
        Object obj2 = Boolean.FALSE;
        if (objM116u3 instanceof C0140f) {
            objM116u3 = obj2;
        }
        boolean zBooleanValue2 = ((Boolean) objM116u3).booleanValue();
        try {
            ConfigStore configStore3 = ConfigStore.f2048a;
            objM116u4 = Boolean.valueOf(ConfigStore.m1661c("bottom_tab_floating", false));
        } catch (Throwable th4) {
            objM116u4 = AbstractC0040p.m116u(th4);
        }
        Object obj3 = Boolean.FALSE;
        if (objM116u4 instanceof C0140f) {
            objM116u4 = obj3;
        }
        m866P(linearLayout4, activity, color4, color2, color3, f2, AbstractC0182m.m556h0(new C0752m("⚙", "模块设置", "全部功能开关 · 配置", new SettingsAction(activity, 0)), new C0752m("🎨", "主题", "主界面壁纸 · 实时透明度", new SettingsAction(activity, 1)), new C0752m("📍", "虚拟定位", zBooleanValue2 ? "已开启 · 点进配置" : "未开启 · 点进配置", new SettingsAction(activity, 2)), new C0752m("▢", "悬浮底栏", ((Boolean) objM116u4).booleanValue() ? "已开启 · 点进配置" : "未开启 · 点进配置", new SettingsAction(activity, 3))));
        m889h0(linearLayout4, activity, "其它", color3, f2);
        m866P(linearLayout4, activity, color4, color2, color3, f2, AbstractC0182m.m556h0(new C0752m("💬", "帮助与反馈", "Telegram 群", new SettingsAction(activity, 11)), new C0752m("ℹ", "关于", "模块设置 · 关于页", new SettingsAction(activity, 12))));
        TextView textView6 = new TextView(activity);
        textView6.setText("长按无 · 左滑关闭侧栏");
        textView6.setTextColor(color3);
        textView6.setTextSize(2, 11.0f);
        textView6.setGravity(17);
        textView6.setPadding(0, m883e(18, f2), 0, m883e(8, f2));
        linearLayout4.addView(textView6);
        scrollView.addView(linearLayout4, new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        View view3 = new View(activity);
        view3.setBackgroundColor(color5);
        view3.setAlpha(0.85f);
        linearLayout.addView(view3, new LinearLayout.LayoutParams(-1, m883e(3, f2)));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iMin, -1);
        layoutParams2.gravity = 8388611;
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setTranslationX(-iMin);
        linearLayout.setElevation((int) ((10 * f2) + 0.5f));
        final C0311k c0311k = new C0311k();
        final C0310j c0310j = new C0310j();
        linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: d0.g
            /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean onTouch(View view4, MotionEvent motionEvent) {
                C0311k c0311k2 = c0311k;
                AbstractC0307g.m703e(c0311k2, "$dragStartX");
                C0310j c0310j2 = c0310j;
                AbstractC0307g.m703e(c0310j2, "$dragging");
                View view5 = view;
                AbstractC0307g.m703e(view5, "$dim");
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = false;
                if (actionMasked != 0) {
                    int i8 = iMin;
                    if (actionMasked == 1) {
                        if (c0310j2.f592a) {
                            if (view4.getTranslationX() < (-i8) * 0.25f) {
                                AbstractC0358S.m898n(true);
                            } else {
                                view4.animate().translationX(0.0f).setDuration(240L).setInterpolator(new PathInterpolator(0.22f, 1.0f, 0.36f, 1.0f)).start();
                                view5.animate().alpha(0.42f).setDuration(240L).start();
                            }
                            c0310j2.f592a = false;
                            z5 = true;
                        }
                    } else if (actionMasked == 2) {
                        float rawX = motionEvent.getRawX() - c0311k2.f593a;
                        if (!c0310j2.f592a && rawX < (-((int) ((8 * f2) + 0.5f)))) {
                            c0310j2.f592a = true;
                            ViewParent parent2 = view4.getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (c0310j2.f592a && rawX < 0.0f) {
                            float f3 = i8;
                            float f4 = -f3;
                            if (rawX < f4) {
                                rawX = f4;
                            }
                            view4.setTranslationX(rawX);
                            view5.setAlpha((1.0f - AbstractC0040p.m110o((-view4.getTranslationX()) / f3, 0.0f, 1.0f)) * 0.42f);
                            return true;
                        }
                    } else if (actionMasked == 3) {
                    }
                } else {
                    c0311k2.f593a = motionEvent.getRawX();
                    c0310j2.f592a = false;
                }
                return z5;
            }
        });
        frameLayout.addView(view);
        frameLayout.addView(linearLayout);
        viewGroup3.addView(frameLayout);
        frameLayout.requestFocus();
        frameLayout.setOnKeyListener(new ViewOnKeyListenerC0747h());
        f736p = frameLayout;
        f737q = linearLayout;
        f738r = view;
        return new C0753n(linearLayout, view, iMin);
    }

    /* JADX INFO: renamed from: d0 */
    public static CompatibilityReport m882d0(Context context) {
        Object objM116u;
        Object objM116u2;
        EnumC0568r enumC0568r;
        String str;
        AbstractC0307g.m703e(context, "context");
        CompatibilityReport compatibilityReport = CompatibilityReport.f1683h;
        if (compatibilityReport != null) {
            return compatibilityReport;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (!AbstractC0307g.m699a(packageName, ModernHookEntry.WECHAT_PACKAGE)) {
            packageName = null;
        }
        String str2 = packageName == null ? ModernHookEntry.WECHAT_PACKAGE : packageName;
        try {
            objM116u = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str2, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str2, 0);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        PackageInfo packageInfo = (PackageInfo) objM116u;
        String string = (packageInfo == null || (str = packageInfo.versionName) == null) ? null : AbstractC0425j.m1022a1(str).toString();
        if (string == null) {
            string = "";
        }
        if (AbstractC0425j.m1013R0(string)) {
            string = "unknown";
        }
        String str3 = string;
        long longVersionCode = packageInfo != null ? Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode : 0L;
        try {
            objM116u2 = Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(ModernHookEntry.WECHAT_PACKAGE).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(ModernHookEntry.WECHAT_PACKAGE);
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        String str4 = (String) (objM116u2 instanceof C0140f ? null : objM116u2);
        String str5 = str4 != null ? str4 : "";
        boolean zM1005J0 = AbstractC0425j.m1005J0(str5, "com.android.vending", true);
        EnumC0568r enumC0568r2 = EnumC0568r.f1680b;
        if (zM1005J0 || AbstractC0425j.m1005J0(str5, "google", true)) {
            enumC0568r = enumC0568r2;
        } else if (AbstractC0433r.m1033H0(str3, "8.0.", false)) {
            if (longVersionCode > 0 && longVersionCode % ((long) 10) == 0) {
                enumC0568r2 = EnumC0568r.f1679a;
            }
            enumC0568r = enumC0568r2;
        } else {
            enumC0568r = EnumC0568r.f1681c;
        }
        CompatibilityReport compatibilityReport2 = new CompatibilityReport(str3, longVersionCode, enumC0568r, str2);
        CompatibilityReport.f1683h = compatibilityReport2;
        try {
            AbstractC0762d.m1954d("[OKK-WxVer] " + AbstractC0324d.m725h("resolved ", compatibilityReport2.m1383a()));
        } catch (Throwable th3) {
            AbstractC0040p.m116u(th3);
        }
        return compatibilityReport2;
    }

    /* JADX INFO: renamed from: e */
    public static final int m883e(int i2, float f2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    /* JADX INFO: renamed from: e0 */
    public static AppFingerprint m884e0(final Context context, final C0817b c0817b, final ClassLoader classLoader, final String str) {
        Object objM116u;
        AbstractC0307g.m703e(context, "context");
        AbstractC0307g.m703e(classLoader, "classLoader");
        CompatibilityReport compatibilityReportM882d0 = m882d0(context);
        String strM912u = m912u(context, compatibilityReportM882d0, str);
        List list = FeatureProbeCatalog.f1659b;
        int size = list.size();
        m919x0("probe start fp=" + strM912u + " needDialog=true total=" + size);
        ModuleLog moduleLog = ModuleLog.INSTANCE;
        StringBuilder sb = new StringBuilder("适配检查开始 · 共 ");
        sb.append(size);
        sb.append(" 项 · fp=");
        sb.append(strM912u);
        moduleLog.m1813i(sb.toString());
        if (!f730j) {
            List listM886f0 = (List) DexKitManager.m1367f(context, classLoader, str, new InterfaceC0286l() { // from class: b0.d
                @Override // p029P0.InterfaceC0286l
                public final Object invoke(Object obj) {
                    DexKitBridge dexKitBridge = (DexKitBridge) obj;
                    ClassLoader classLoader2 = classLoader;
                    AbstractC0307g.m703e(classLoader2, "$classLoader");
                    Context context2 = context;
                    AbstractC0307g.m703e(context2, "$context");
                    AbstractC0307g.m703e(dexKitBridge, "bridge");
                    return AbstractC0358S.m886f0(new C0562l(classLoader2, dexKitBridge, context2, str), c0817b);
                }
            });
            if (listM886f0 == null) {
                m919x0("DexKit unavailable, class-only probes");
                listM886f0 = m886f0(new C0562l(classLoader, null, context, str), c0817b);
            }
            AppFingerprint appFingerprint = new AppFingerprint(strM912u, compatibilityReportM882d0.m1383a(), System.currentTimeMillis(), m870T(compatibilityReportM882d0, listM886f0), true);
            m888g0(appFingerprint);
            f730j = true;
            m919x0("probe done " + appFingerprint.m1361e());
            moduleLog.m1813i("适配检查完成 · " + appFingerprint.m1361e());
            return appFingerprint;
        }
        m919x0("re-scan: using cached probe results (bridge unavailable after first use)");
        moduleLog.m1813i("适配复检 · 跳过 DexKit bridge，复用首次扫描缓存");
        AppFingerprint appFingerprintM862L = m862L();
        if (appFingerprintM862L == null) {
            m919x0("re-scan but no cached report, doing full scan without bridge");
            try {
                objM116u = m886f0(new C0562l(classLoader, null, context, str), c0817b);
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Object obj = C0190u.f401a;
            if (objM116u instanceof C0140f) {
                objM116u = obj;
            }
            AppFingerprint appFingerprint2 = new AppFingerprint(strM912u, compatibilityReportM882d0.m1383a(), System.currentTimeMillis(), m870T(compatibilityReportM882d0, (List) objM116u), true);
            m888g0(appFingerprint2);
            return appFingerprint2;
        }
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0182m.m558j0();
                throw null;
            }
            c0817b.m2126a(Integer.valueOf(i3), Integer.valueOf(size), FeatureProbeCatalog.m1371a((C0556f) obj2, i2));
            try {
                Thread.sleep(15L);
            } catch (InterruptedException unused) {
            }
            i2 = i3;
        }
        AppFingerprint appFingerprint3 = new AppFingerprint(strM912u, compatibilityReportM882d0.m1383a(), System.currentTimeMillis(), appFingerprintM862L.f1641d, true);
        m888g0(appFingerprint3);
        m919x0("re-scan done (cached) " + appFingerprint3.m1361e());
        ModuleLog.INSTANCE.m1813i("适配复检完成（复用缓存） · " + appFingerprint3.m1361e());
        return appFingerprint3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m885f(TextView textView) {
        String str;
        InterfaceC0275a interfaceC0275a = f741u;
        if (interfaceC0275a == null || (str = (String) interfaceC0275a.invoke()) == null) {
            str = "我";
        } else {
            if (!(!AbstractC0425j.m1013R0(str))) {
                str = null;
            }
            if (str == null) {
            }
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static ArrayList m886f0(C0562l c0562l, C0817b c0817b) {
        Object objM116u;
        List list = FeatureProbeCatalog.f1659b;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0182m.m558j0();
                throw null;
            }
            C0556f c0556f = (C0556f) obj;
            String strM1371a = FeatureProbeCatalog.m1371a(c0556f, i2);
            c0817b.m2126a(Integer.valueOf(i3), Integer.valueOf(size), strM1371a);
            try {
                objM116u = c0556f.m1369a(c0562l);
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            if (thM465a != null) {
                DiagnosticLevel diagnosticLevel = DiagnosticLevel.f1666c;
                String message = thM465a.getMessage();
                if (message == null) {
                    message = "error";
                }
                objM116u = new DiagnosticItem("?", strM1371a, diagnosticLevel, message);
            }
            DiagnosticItem diagnosticItemM1375a = (DiagnosticItem) objM116u;
            String str = diagnosticItemM1375a.f1669b;
            if (AbstractC0425j.m1013R0(str) || str.equals("?")) {
                diagnosticItemM1375a = DiagnosticItem.m1375a(diagnosticItemM1375a, strM1371a, null, null, 13);
            }
            m919x0("${fixed.level} ${fixed.id} ${fixed.detail}");
            ModuleLog.INSTANCE.m1813i("适配 ${i + 1}/$total ${fixed.title}: ${fixed.level.name} · ${fixed.detail}");
            arrayList.add(diagnosticItemM1375a);
            try {
                Thread.sleep(40L);
            } catch (InterruptedException unused) {
            }
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static final Object m887g(Object obj, String str, Object... objArr) {
        if (obj == null) {
            throw new NullPointerException("receiver == null");
        }
        Class<?> cls = obj.getClass();
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj2 = objArr[i2];
            arrayList.add(obj2 != null ? obj2.getClass() : null);
        }
        try {
            return m910t(cls, str, (Class[]) arrayList.toArray(new Class[0])).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            AbstractC0307g.m702d(targetException, "getTargetException(...)");
            throw new C0138d(targetException);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m888g0(AppFingerprint appFingerprint) {
        Object objM116u;
        f727g = appFingerprint;
        f728h = appFingerprint.f1642e || m869S(appFingerprint.f1638a);
        try {
            new File("/sdcard/Android/media/com.tencent.mm/OKK").mkdirs();
            JSONArray jSONArray = new JSONArray();
            for (DiagnosticItem diagnosticItem : appFingerprint.f1641d) {
                jSONArray.put(new JSONObject().put("id", diagnosticItem.f1668a).put("title", diagnosticItem.f1669b).put("level", diagnosticItem.f1670c.name()).put("detail", diagnosticItem.f1671d));
            }
            JSONObject jSONObjectPut = new JSONObject().put("fingerprint", appFingerprint.f1638a).put("wechat", appFingerprint.f1639b).put("atMs", appFingerprint.f1640c).put("summary", appFingerprint.m1361e()).put("results", jSONArray).put("pendingDialog", f728h);
            File file = new File(new File("/sdcard/Android/media/com.tencent.mm/OKK"), "compat_report.json");
            String string = jSONObjectPut.toString(2);
            AbstractC0307g.m702d(string, "toString(...)");
            AbstractC0270k.m693j0(file, string, AbstractC0416a.f921a);
            appFingerprint.m1361e();
            objM116u = C0146l.f339a;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            thM465a.getMessage();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m889h0(LinearLayout linearLayout, Context context, String str, int i2, float f2) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(i2);
        textView.setTextSize(2, 12.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        int i3 = (int) ((4 * f2) + 0.5f);
        textView.setPadding(i3, (int) ((10 * f2) + 0.5f), i3, (int) ((8 * f2) + 0.5f));
        textView.setLetterSpacing(0.04f);
        linearLayout.addView(textView);
    }

    /* JADX INFO: renamed from: i */
    public static void m890i(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new C0340c(2, 36, 1));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final int m891i0(int i2, float f2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    /* JADX INFO: renamed from: j */
    public static int m892j(C0352L c0352l, C0385u c0385u, View view, View view2, AbstractC0343C abstractC0343C, boolean z2) {
        if (abstractC0343C.m813r() == 0 || c0352l.m832a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(AbstractC0343C.m765D(view) - AbstractC0343C.m765D(view2)) + 1;
        }
        return Math.min(c0385u.m974l(), c0385u.m964b(view2) - c0385u.m967e(view));
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m893j0(Object obj, Object obj2, String str) throws IllegalAccessException {
        m908s(obj.getClass(), str).set(obj, obj2);
    }

    /* JADX INFO: renamed from: k */
    public static int m894k(C0352L c0352l, C0385u c0385u, View view, View view2, AbstractC0343C abstractC0343C, boolean z2, boolean z3) {
        if (abstractC0343C.m813r() == 0 || c0352l.m832a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (c0352l.m832a() - Math.max(AbstractC0343C.m765D(view), AbstractC0343C.m765D(view2))) - 1) : Math.max(0, Math.min(AbstractC0343C.m765D(view), AbstractC0343C.m765D(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(c0385u.m964b(view2) - c0385u.m967e(view)) / (Math.abs(AbstractC0343C.m765D(view) - AbstractC0343C.m765D(view2)) + 1))) + (c0385u.m973k() - c0385u.m967e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: l */
    public static int m895l(C0352L c0352l, C0385u c0385u, View view, View view2, AbstractC0343C abstractC0343C, boolean z2) {
        if (abstractC0343C.m813r() == 0 || c0352l.m832a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return c0352l.m832a();
        }
        return (int) (((c0385u.m964b(view2) - c0385u.m967e(view)) / (Math.abs(AbstractC0343C.m765D(view) - AbstractC0343C.m765D(view2)) + 1)) * c0352l.m832a());
    }

    /* JADX INFO: renamed from: m */
    public static C0493r m896m(Context context) {
        ProviderInfo providerInfo;
        C0005f c0005f;
        ApplicationInfo applicationInfo;
        C1121e c0478c = Build.VERSION.SDK_INT >= 28 ? new C0478c(20) : new C1121e(20);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0040p.m106i(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0005f = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo1198d = c0478c.mo1198d(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo1198d) {
                    arrayList.add(signature.toByteArray());
                }
                c0005f = new C0005f(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                c0005f = null;
            }
        }
        if (c0005f == null) {
            return null;
        }
        return new C0493r(new C0492q(context, c0005f));
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m897m0(int i2, String str, String str2) {
        if (i2 == 10000 || i2 == 10002 || i2 == 922746929 || i2 == 318767153) {
            return false;
        }
        return ((!AbstractC0425j.m1013R0(str) && AbstractC0425j.m1005J0(str, "<sysmsg", false) && (AbstractC0425j.m1005J0(str, "revokemsg", false) || AbstractC0425j.m1005J0(str, "patmsg", false) || AbstractC0425j.m1005J0(str, "sysmsgtemplate", false))) || m859I(str) || m859I(str2)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m898n(boolean z2) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue;
        FrameLayout frameLayout = f736p;
        if (frameLayout == null) {
            return;
        }
        LinearLayout linearLayout = f737q;
        View view = f738r;
        if (linearLayout != null) {
            int width = linearLayout.getWidth();
            Integer numValueOf = Integer.valueOf(width);
            if (width <= 0) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : (linearLayout == null || (layoutParams = linearLayout.getLayoutParams()) == null) ? 0 : layoutParams.width;
        }
        if (!z2 || linearLayout == null || view == null) {
            m900o(view, frameLayout, linearLayout);
            return;
        }
        f739s = true;
        linearLayout.setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.TRANSLATION_X, linearLayout.getTranslationX(), -iIntValue), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f));
        animatorSet.addListener(new C0368d(view, frameLayout, linearLayout));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m899n0(Activity activity) {
        int i2 = 1;
        AbstractC0307g.m703e(activity, "activity");
        if (activity.isFinishing() || f739s || m858H()) {
            return;
        }
        new WeakReference(activity);
        C0753n c0753nM881d = m881d(activity);
        if (c0753nM881d == null) {
            return;
        }
        View view = c0753nM881d.f2626a;
        View view2 = c0753nM881d.f2627b;
        int i3 = c0753nM881d.f2628c;
        f739s = true;
        view.setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, -i3, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 0.42f));
        animatorSet.setDuration(280L);
        animatorSet.setInterpolator(new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f));
        animatorSet.addListener(new C0755p((LinearLayout) view, i2));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: o */
    public static final void m900o(View view, FrameLayout frameLayout, LinearLayout linearLayout) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (linearLayout != null) {
            try {
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = linearLayout.animate();
                if (viewPropertyAnimatorAnimate2 != null) {
                    viewPropertyAnimatorAnimate2.cancel();
                }
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        try {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        } catch (Throwable th2) {
            AbstractC0040p.m116u(th2);
        }
        if (f736p == frameLayout) {
            f736p = null;
            f737q = null;
            f738r = null;
        }
        f739s = false;
    }

    /* JADX INFO: renamed from: o0 */
    public static final TextView m901o0(Activity activity, int i2, float f2, int i3, boolean z2, String str, boolean z3, InterfaceC0275a interfaceC0275a) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(m903p0(18, f2), m903p0(10, f2), m903p0(18, f2), m903p0(10, f2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m903p0(12, f2));
        if (z3) {
            gradientDrawable.setColor(i3);
        } else {
            gradientDrawable.setColor(Color.parseColor(z2 ? "#22FFFFFF" : "#0F000000"));
        }
        textView.setBackground(gradientDrawable);
        if (z3) {
            i2 = -1;
        }
        textView.setTextColor(i2);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setOnClickListener(new ViewOnClickListenerC0745f(interfaceC0275a, 2));
        return textView;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m902p(char c, char c2, boolean z2) {
        if (c == c2) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: p0 */
    public static final int m903p0(int i2, float f2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    /* JADX INFO: renamed from: q */
    public static final C1121e m904q(Class cls, String str, Object... objArr) {
        Iterable iterableM82F;
        Class clsM906r;
        AbstractC0307g.m703e(cls, "clazz");
        AbstractC0307g.m703e(objArr, "parameterTypesAndCallback");
        Object obj = objArr.length == 0 ? null : objArr[objArr.length - 1];
        AbstractC0761c abstractC0761c = obj instanceof AbstractC0761c ? (AbstractC0761c) obj : null;
        if (abstractC0761c == null) {
            throw new IllegalArgumentException("no XC_MethodHook callback supplied");
        }
        int length = objArr.length - 1;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        if (length == 0) {
            iterableM82F = C0190u.f401a;
        } else if (length >= objArr.length) {
            iterableM82F = AbstractC0179j.m540q0(objArr);
        } else if (length == 1) {
            iterableM82F = AbstractC0040p.m82F(objArr[0]);
        } else {
            ArrayList arrayList = new ArrayList(length);
            int i2 = 0;
            for (Object obj2 : objArr) {
                arrayList.add(obj2);
                i2++;
                if (i2 == length) {
                    break;
                }
            }
            iterableM82F = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0183n.m559k0(iterableM82F, 10));
        for (Object obj3 : iterableM82F) {
            ClassLoader classLoader = cls.getClassLoader();
            if (obj3 == null) {
                clsM906r = null;
            } else if (obj3 instanceof Class) {
                clsM906r = (Class) obj3;
            } else {
                if (!(obj3 instanceof String)) {
                    throw new IllegalArgumentException("Unsupported parameter type spec: " + obj3);
                }
                clsM906r = m906r(classLoader, (String) obj3);
            }
            arrayList2.add(clsM906r);
        }
        return AbstractC0762d.m1952b(m910t(cls, str, (Class[]) arrayList2.toArray(new Class[0])), abstractC0761c);
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m905q0(int i2, int i3, int i4, boolean z2, float f2, LinearLayout linearLayout, boolean z3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m903p0(14, f2));
        gradientDrawable.setColor(i4);
        if (z3) {
            gradientDrawable.setStroke(m903p0(1, f2), i2);
        } else {
            gradientDrawable.setStroke(m903p0(1, f2), Color.parseColor(z2 ? "#22FFFFFF" : "#0F000000"));
        }
        linearLayout.setBackground(gradientDrawable);
        TextView textView = (TextView) linearLayout.findViewWithTag("check");
        if (textView != null) {
            textView.setText(z3 ? "✓" : "");
        }
        if (textView != null) {
            if (z3) {
                i3 = i2;
            }
            textView.setTextColor(i3);
        }
        if (textView != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            if (z3) {
                gradientDrawable2.setColor(Color.argb(28, Color.red(i2), Color.green(i2), Color.blue(i2)));
            } else {
                gradientDrawable2.setColor(Color.parseColor(z2 ? "#18FFFFFF" : "#0A000000"));
            }
            textView.setBackground(gradientDrawable2);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final Class m906r(ClassLoader classLoader, String str) {
        AbstractC0307g.m703e(str, "className");
        if (classLoader == null) {
            try {
                classLoader = ClassLoader.getSystemClassLoader();
            } catch (Throwable th) {
                throw new C0138d(th);
            }
        }
        return Class.forName(str, false, classLoader);
    }

    /* JADX INFO: renamed from: r0 */
    public static final TextView m907r0(Activity activity, int i2, float f2, int i3, boolean z2, String str, boolean z3, InterfaceC0275a interfaceC0275a) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(m909s0(18, f2), m909s0(10, f2), m909s0(18, f2), m909s0(10, f2));
        if (z3) {
            i2 = -1;
        }
        textView.setTextColor(i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m909s0(10, f2));
        if (!z3) {
            i3 = Color.parseColor(z2 ? "#22FFFFFF" : "#10000000");
        }
        gradientDrawable.setColor(i3);
        textView.setBackground(gradientDrawable);
        textView.setClickable(true);
        textView.setOnClickListener(new ViewOnClickListenerC0745f(interfaceC0275a, 1));
        return textView;
    }

    /* JADX INFO: renamed from: s */
    public static final Field m908s(Class cls, String str) {
        AbstractC0307g.m703e(str, "fieldName");
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldError(cls.getName() + "#" + str);
    }

    /* JADX INFO: renamed from: s0 */
    public static final int m909s0(int i2, float f2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x000d A[SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Method m910t(Class cls, String str, Class[] clsArr) {
        boolean z2;
        Method method = null;
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredMethods());
            while (c0172cM714c.hasNext()) {
                Method method2 = (Method) c0172cM714c.next();
                if (AbstractC0307g.m699a(method2.getName(), str) && method2.getParameterTypes().length == clsArr.length) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    boolean z3 = false;
                    Iterable c0340c = new C0340c(0, parameterTypes.length - 1, 1);
                    if ((c0340c instanceof Collection) && ((Collection) c0340c).isEmpty()) {
                        z2 = true;
                        if (!z2) {
                        }
                    } else {
                        Iterator it = c0340c.iterator();
                        while (((C0339b) it).f662c) {
                            int iM757a = ((C0339b) it).m757a();
                            Class cls2 = clsArr[iM757a];
                            if (!(cls2 == null ? !parameterTypes[iM757a].isPrimitive() : m915v0(parameterTypes[iM757a]).isAssignableFrom(m915v0(cls2)))) {
                                z2 = false;
                                break;
                            }
                        }
                        z2 = true;
                        if (!z2) {
                            method2.setAccessible(true);
                            return method2;
                        }
                        if (method == null) {
                            Class<?>[] parameterTypes2 = method2.getParameterTypes();
                            AbstractC0307g.m702d(parameterTypes2, "getParameterTypes(...)");
                            Iterable c0340c2 = new C0340c(0, parameterTypes2.length - 1, 1);
                            if ((c0340c2 instanceof Collection) && ((Collection) c0340c2).isEmpty()) {
                                z3 = true;
                                if (!z3) {
                                }
                            } else {
                                Iterator it2 = c0340c2.iterator();
                                while (((C0339b) it2).f662c) {
                                    int iM757a2 = ((C0339b) it2).m757a();
                                    if (clsArr[iM757a2] != null) {
                                        Class clsM915v0 = m915v0(parameterTypes2[iM757a2]);
                                        Class cls3 = clsArr[iM757a2];
                                        AbstractC0307g.m700b(cls3);
                                        if (!clsM915v0.isAssignableFrom(m915v0(cls3))) {
                                            break;
                                        }
                                    }
                                }
                                z3 = true;
                                if (!z3) {
                                    method = method2;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (method != null) {
            method.setAccessible(true);
            return method;
        }
        throw new NoSuchMethodError(cls.getName() + "#" + str + "/" + clsArr.length);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m911t0(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0464w.m1094b(viewGroup, z2);
        } else if (f723c) {
            try {
                AbstractC0464w.m1094b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f723c = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m912u(Context context, CompatibilityReport compatibilityReport, String str) {
        Object objM116u;
        AbstractC0307g.m703e(context, "context");
        String strM872X = m872X(context, ModernHookEntry.WECHAT_PACKAGE);
        if (str != null) {
            try {
                if (!(!AbstractC0425j.m1013R0(str))) {
                    str = null;
                }
                File file = str != null ? new File(str) : null;
                if (file == null || !file.isFile()) {
                    objM116u = null;
                } else {
                    objM116u = "apk_" + file.length() + "_" + file.lastModified();
                }
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
        }
        String strM872X2 = (String) (objM116u instanceof C0140f ? null : objM116u);
        if (strM872X2 == null || AbstractC0425j.m1013R0(strM872X2)) {
            strM872X2 = m872X(context, "com.abc.module");
        }
        return compatibilityReport.f1685b + "|" + compatibilityReport.f1684a + "|1.2.1|wx=" + strM872X + "|mod=" + strM872X2;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m913u0(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        m858H();
        if (m858H()) {
            m898n(true);
        } else {
            m899n0(activity);
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m914v(String str, C0601K0 c0601k0) {
        AbstractC0307g.m703e(str, "template");
        if (str.length() == 0) {
            return "";
        }
        int i2 = c0601k0.f1836b;
        C0139e c0139e = new C0139e("totalMsg", String.valueOf(i2));
        int i3 = c0601k0.f1837c;
        C0139e c0139e2 = new C0139e("textMsg", String.valueOf(i3));
        int i4 = c0601k0.f1838d;
        C0139e c0139e3 = new C0139e("textWord", String.valueOf(i4));
        int i5 = c0601k0.f1839e;
        C0139e c0139e4 = new C0139e("emojiMsg", String.valueOf(i5));
        int i6 = c0601k0.f1840f;
        C0139e c0139e5 = new C0139e("transferMsg", String.valueOf(i6));
        int i7 = c0601k0.f1841g;
        C0139e c0139e6 = new C0139e("redBagMsg", String.valueOf(i7));
        int i8 = c0601k0.f1842h;
        String strM1031F0 = str;
        for (Map.Entry entry : AbstractC0193x.m564h0(c0139e, c0139e2, c0139e3, c0139e4, c0139e5, c0139e6, new C0139e("fileMsg", String.valueOf(i8)), new C0139e("tatalmsg", String.valueOf(i2)), new C0139e("totalmsg", String.valueOf(i2)), new C0139e("totmsg", String.valueOf(i2)), new C0139e("textmsg", String.valueOf(i3)), new C0139e("textword", String.valueOf(i4)), new C0139e("emojimsg", String.valueOf(i5)), new C0139e("emoji", String.valueOf(i5)), new C0139e("transfermsg", String.valueOf(i6)), new C0139e("transfer", String.valueOf(i6)), new C0139e("redbagmsg", String.valueOf(i7)), new C0139e("redbag", String.valueOf(i7)), new C0139e("filemsg", String.valueOf(i8)), new C0139e("word", String.valueOf(i4))).entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String strM723f = AbstractC0324d.m723f("${", str2, "}");
            if (AbstractC0425j.m1005J0(strM1031F0, strM723f, true)) {
                strM1031F0 = AbstractC0433r.m1031F0(strM1031F0, strM723f, str3, true);
            }
        }
        return strM1031F0;
    }

    /* JADX INFO: renamed from: v0 */
    public static Class m915v0(Class cls) {
        return !cls.isPrimitive() ? cls : cls.equals(Boolean.TYPE) ? Boolean.class : cls.equals(Byte.TYPE) ? Byte.class : cls.equals(Character.TYPE) ? Character.class : cls.equals(Short.TYPE) ? Short.class : cls.equals(Integer.TYPE) ? Integer.class : cls.equals(Long.TYPE) ? Long.class : cls.equals(Float.TYPE) ? Float.class : cls.equals(Double.TYPE) ? Double.class : cls.equals(Void.TYPE) ? Void.class : cls;
    }

    /* JADX INFO: renamed from: w */
    public static Drawable m916w(Context context, int i2) {
        return C0933v0.m2263c().m2268e(context, i2);
    }

    /* JADX INFO: renamed from: w0 */
    public static void m917w0(ByteArrayOutputStream byteArrayOutputStream, long j2) {
        while (((-128) & j2) != 0) {
            byteArrayOutputStream.write((int) ((127 & j2) | 128));
            j2 >>>= 7;
        }
        byteArrayOutputStream.write((int) j2);
    }

    /* JADX INFO: renamed from: x */
    public static Set m918x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static void m919x0(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-CompatProbe] " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final Object m920y(Object obj, String str) {
        AbstractC0307g.m703e(str, "fieldName");
        if (obj != null) {
            return m908s(obj.getClass(), str).get(obj);
        }
        throw new NullPointerException("receiver == null");
    }

    /* JADX INFO: renamed from: U */
    public abstract void mo921U(Throwable th);

    /* JADX INFO: renamed from: V */
    public abstract void mo922V(C0463v c0463v);

    /* JADX INFO: renamed from: h */
    public abstract void m923h();

    /* JADX INFO: renamed from: k0 */
    public void mo924k0(View view, float f2) {
        if (f724d) {
            try {
                AbstractC0466y.m1098b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f724d = false;
            }
        }
        view.setAlpha(f2);
    }

    /* JADX INFO: renamed from: l0 */
    public void mo925l0(View view, int i2) {
        if (!f726f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f725e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f726f = true;
        }
        Field field = f725e;
        if (field != null) {
            try {
                f725e.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public float mo926z(View view) {
        if (f724d) {
            try {
                return AbstractC0466y.m1097a(view);
            } catch (NoSuchMethodError unused) {
                f724d = false;
            }
        }
        return view.getAlpha();
    }
}
