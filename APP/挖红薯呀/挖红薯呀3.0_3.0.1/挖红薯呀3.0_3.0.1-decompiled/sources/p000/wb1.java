package p000;

import android.R;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class wb1 {

    /* JADX INFO: renamed from: h */
    private static boolean f7069h;

    /* JADX INFO: renamed from: a */
    public static final wb1 f7062a = new wb1();

    /* JADX INFO: renamed from: b */
    private static final u60 f7063b = new x51(new us0(21));

    /* JADX INFO: renamed from: c */
    private static final u60 f7064c = new x51(new us0(22));

    /* JADX INFO: renamed from: d */
    private static final u60 f7065d = new x51(new us0(23));

    /* JADX INFO: renamed from: e */
    private static final u60 f7066e = new x51(new us0(24));

    /* JADX INFO: renamed from: f */
    private static final u60 f7067f = new x51(new us0(19));

    /* JADX INFO: renamed from: g */
    private static final u60 f7068g = new x51(new us0(20));

    /* JADX INFO: renamed from: i */
    public static final int f7070i = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private wb1() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final String m4936A() {
        return (String) f7065d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    private final String m4937B() {
        return (String) f7063b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    private final String m4938C() {
        return (String) f7064c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    private final void m4939D(Context context, InterfaceC0742sw interfaceC0742sw) throws NoSuchAlgorithmException, InvalidKeyException {
        m4972J(context, true);
        new Handler(Looper.getMainLooper()).post(new RunnableC0751t4(10, context, interfaceC0742sw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m4940E(Context context, InterfaceC0742sw interfaceC0742sw) {
        f7062a.m4973K(context, "需要联网验证", "模块需要联网验证版本，请确保网络连接后重新打开小红书");
        interfaceC0742sw.invoke(Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    private final String m4941F(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = AbstractC0959yd.f7611a;
        byte[] bytes = str2.getBytes(charset);
        bytes.getClass();
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = str.getBytes(charset);
        bytes2.getClass();
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        bArrDoFinal.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDoFinal) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append(m4942G(b));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    private static final CharSequence m4942G(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final boolean m4943I(Context context) {
        Object systemService = context.getSystemService("uimode");
        systemService.getClass();
        return ((UiModeManager) systemService).getNightMode() == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final int m4944L(Context context, int i) {
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m4945M(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final String m4958m() {
        return ik0.f2579a.m1592a(42, 22, 26, 80, 36, 39, 6, 82, 20, 11, 17, 93, 63);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final String m4959n() {
        return ik0.f2579a.m1592a(61, 27, 47, 83, 39, 23, 19, 90);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final String m4960o() {
        return ik0.f2579a.m1592a(61, 27, 47, 83, 39, 23, 19, 90, 20, 12, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m4961p() {
        return ik0.f2579a.m1592a(61, 27, 27, 110, 59, 10, 21, 87, 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final String m4962q() {
        return "vcw";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final String m4963r() {
        return ik0.f2579a.m1592a(35, 12, 4, 65, 56, 66, 95, 30, 42, 22, 26, 80, 36, 74, 64, 3, 127, 86, 4, 94, 59, 87, 17, 68, 63, 16, 47, 95, 36, 12, 25, 82, 46, 87, 6, 84, 57, 11, 25, 94, 37, 39, 19, 89, 46, 27, 27, 31, 59, 16, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x015d */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112 A[Catch: Exception -> 0x0160, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0160, blocks: (B:3:0x0005, B:7:0x005c, B:13:0x0088, B:17:0x0099, B:21:0x00a5, B:41:0x00eb, B:43:0x00f2, B:71:0x0148, B:67:0x0138, B:54:0x0112, B:26:0x00b3), top: B:86:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138 A[Catch: Exception -> 0x0160, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0160, blocks: (B:3:0x0005, B:7:0x005c, B:13:0x0088, B:17:0x0099, B:21:0x00a5, B:41:0x00eb, B:43:0x00f2, B:71:0x0148, B:67:0x0138, B:54:0x0112, B:26:0x00b3), top: B:86:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Type inference failed for: r14v1, types: [wb1] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
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
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4964t(long j, Context context, InterfaceC0742sw interfaceC0742sw) throws NoSuchAlgorithmException, InvalidKeyException {
        Object obj;
        InterfaceC0742sw interfaceC0742sw2;
        Exception exc;
        ?? r7;
        wb1 wb1Var;
        HttpURLConnection httpURLConnection;
        int responseCode;
        boolean zOptBoolean;
        String strOptString;
        String str;
        String strOptString2;
        String str2;
        String strOptString3;
        try {
            String strValueOf = String.valueOf(j);
            wb1Var = f7062a;
            String strM4938C = wb1Var.m4938C();
            String strEncode = URLEncoder.encode("30121", "UTF-8");
            String strEncode2 = URLEncoder.encode(strValueOf, "UTF-8");
            StringBuilder sb = new StringBuilder();
            sb.append(strM4938C);
            obj = "?module_version=";
            sb.append("?module_version=");
            sb.append(strEncode);
            sb.append("&app_version=");
            sb.append(strEncode2);
            URLConnection uRLConnectionOpenConnection = new URL(sb.toString()).openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            responseCode = httpURLConnection.getResponseCode();
        } catch (Exception e) {
            e = e;
            obj = context;
            interfaceC0742sw2 = interfaceC0742sw;
        }
        try {
        } catch (Exception e2) {
            e = e2;
            exc = e;
            r7 = obj;
        }
        if (200 > responseCode || responseCode >= 300) {
            httpURLConnection.disconnect();
            wb1Var.m4939D(context, interfaceC0742sw);
            return;
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        inputStream.getClass();
        String strM4884F = w60.m4884F(new BufferedReader(new InputStreamReader(inputStream, AbstractC0959yd.f7611a), 8192));
        httpURLConnection.disconnect();
        try {
        } catch (Exception e3) {
            exc = e3;
            r7 = context;
            interfaceC0742sw2 = interfaceC0742sw;
            lb0 lb0Var = lb0.f3404a;
            ?? r14 = f7062a;
            lb0Var.m2014a(r14.m4937B(), "vc exception: " + exc.getClass().getSimpleName() + ": " + exc.getMessage());
            r14.m4939D(r7, interfaceC0742sw2);
        }
        if (k41.m1769a0(strM4884F)) {
            wb1Var.m4939D(context, interfaceC0742sw);
            return;
        }
        JSONObject jSONObject = new JSONObject(strM4884F);
        if (jSONObject.optInt("code", 0) != 200) {
            wb1Var.m4939D(context, interfaceC0742sw);
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            wb1Var.m4939D(context, interfaceC0742sw);
            return;
        }
        if (!jSONObjectOptJSONObject.has("need_update")) {
            String strOptString4 = jSONObjectOptJSONObject.optString("min_module_version", "");
            String strOptString5 = jSONObjectOptJSONObject.optString("min_app_version", "");
            strOptString4.getClass();
            if (strOptString4.length() > 0) {
                boolean z = 30121 < Long.parseLong(strOptString4);
                if (!z) {
                    strOptString5.getClass();
                    if (strOptString5.length() > 0) {
                        zOptBoolean = j < Long.parseLong(strOptString5) ? true : z;
                    }
                }
            }
            f7069h = false;
        }
        zOptBoolean = jSONObjectOptJSONObject.optBoolean("need_update", false);
        wb1 wb1Var2 = f7062a;
        wb1Var2.m4967w(context);
        if (zOptBoolean) {
            wb1Var2.m4972J(context, true);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("update_info");
            if (jSONObjectOptJSONObject2 == null || (strOptString = jSONObjectOptJSONObject2.optString("title", "")) == null) {
                strOptString = jSONObjectOptJSONObject.optString("update_title", "");
                if (strOptString.length() == 0) {
                    strOptString = "版本过低";
                }
                str = strOptString;
                if (jSONObjectOptJSONObject2 != null || (strOptString3 = jSONObjectOptJSONObject2.optString("content", "")) == null) {
                    strOptString2 = jSONObjectOptJSONObject.optString("update_content", "");
                    if (strOptString2.length() == 0) {
                        strOptString2 = "请更新模块到最新版本";
                    }
                    str2 = strOptString2;
                    new Handler(Looper.getMainLooper()).post(new RunnableC0669qy(context, str, str2, interfaceC0742sw, 1));
                } else {
                    str2 = strOptString3.length() != 0 ? strOptString3 : null;
                    if (str2 == null) {
                    }
                    new Handler(Looper.getMainLooper()).post(new RunnableC0669qy(context, str, str2, interfaceC0742sw, 1));
                }
            } else {
                if (strOptString.length() == 0) {
                    strOptString = null;
                }
                if (strOptString == null) {
                }
                str = strOptString;
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString2 = jSONObjectOptJSONObject.optString("update_content", "");
                    if (strOptString2.length() == 0) {
                    }
                    str2 = strOptString2;
                    new Handler(Looper.getMainLooper()).post(new RunnableC0669qy(context, str, str2, interfaceC0742sw, 1));
                }
            }
        } else {
            wb1Var2.m4972J(context, false);
            new Handler(Looper.getMainLooper()).post(new RunnableC0912x3(8, interfaceC0742sw));
        }
        f7069h = false;
        exc = e;
        r7 = obj;
        lb0 lb0Var2 = lb0.f3404a;
        ?? r142 = f7062a;
        lb0Var2.m2014a(r142.m4937B(), "vc exception: " + exc.getClass().getSimpleName() + ": " + exc.getMessage());
        r142.m4939D(r7, interfaceC0742sw2);
        f7069h = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m4965u(Context context, String str, String str2, InterfaceC0742sw interfaceC0742sw) {
        wb1 wb1Var = f7062a;
        str.getClass();
        str2.getClass();
        wb1Var.m4973K(context, str, str2);
        interfaceC0742sw.invoke(Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m4966v(InterfaceC0742sw interfaceC0742sw) {
        interfaceC0742sw.invoke(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    private final SharedPreferences m4967w(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(m4936A(), 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    private final String m4968x() {
        return (String) f7068g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    private final String m4969y() {
        return (String) f7066e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    private final String m4970z() {
        return (String) f7067f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final boolean m4971H(Context context) {
        context.getClass();
        SharedPreferences sharedPreferencesM4967w = m4967w(context);
        if (!sharedPreferencesM4967w.getBoolean(m4969y(), false)) {
            return false;
        }
        String string = sharedPreferencesM4967w.getString(m4970z(), null);
        if (string != null) {
            List listM1773e0 = k41.m1773e0(string, new String[]{"|"}, 2);
            if (listM1773e0.size() == 2) {
                return p30.m3002l((String) listM1773e0.get(1), m4941F((String) listM1773e0.get(0), m4968x()));
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m4972J(Context context, boolean z) throws NoSuchAlgorithmException, InvalidKeyException {
        context.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferencesM4967w = m4967w(context);
        sharedPreferencesM4967w.edit().putBoolean(m4969y(), z).apply();
        if (!z) {
            sharedPreferencesM4967w.edit().remove(m4970z()).apply();
            return;
        }
        String str = "1_" + jCurrentTimeMillis;
        String strM4941F = m4941F(str, m4968x());
        sharedPreferencesM4967w.edit().putString(m4970z(), str + "|" + strM4941F).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final void m4973K(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        boolean zM4943I = m4943I(context);
        int iArgb = zM4943I ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        if (!zM4943I) {
            Color.argb(255, 22, 22, 28);
        }
        int i = 90;
        int i2 = 80;
        int iArgb2 = zM4943I ? Color.argb(180, 255, 255, 255) : Color.argb(180, 80, 80, 90);
        int iArgb3 = Color.argb(220, 254, 44, 85);
        if (!zM4943I) {
            i = 210;
            i2 = 200;
        }
        Color.argb(140, i2, i2, i);
        if (!zM4943I) {
            Color.argb(255, 50, 50, 60);
        }
        mf0 mf0Var = new mf0(context, 2);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        linearLayout.setPadding(((Number) mf0Var.invoke(20)).intValue(), ((Number) mf0Var.invoke(28)).intValue(), ((Number) mf0Var.invoke(20)).intValue(), ((Number) mf0Var.invoke(20)).intValue());
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        textView.setText("⚠️");
        textView.setTextSize(40.0f);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, ((Number) mf0Var.invoke(16)).intValue());
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText(str);
        textView2.setTextSize(18.0f);
        textView2.setTextColor(iArgb3);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, ((Number) mf0Var.invoke(12)).intValue());
        linearLayout.addView(textView2);
        View view = new View(context);
        view.setBackgroundColor(zM4943I ? Color.argb(40, 255, 255, 255) : Color.argb(30, 0, 0, 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ((Number) mf0Var.invoke(1)).intValue());
        layoutParams.setMargins(((Number) mf0Var.invoke(16)).intValue(), 0, ((Number) mf0Var.invoke(16)).intValue(), ((Number) mf0Var.invoke(14)).intValue());
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        TextView textView3 = new TextView(context);
        textView3.setText(str2);
        textView3.setTextSize(14.0f);
        textView3.setTextColor(iArgb2);
        textView3.setGravity(17);
        textView3.setLineSpacing(((Number) mf0Var.invoke(4)).intValue(), 1.0f);
        textView3.setPadding(((Number) mf0Var.invoke(8)).intValue(), 0, ((Number) mf0Var.invoke(8)).intValue(), 0);
        linearLayout.addView(textView3);
        TextView textView4 = new TextView(context);
        textView4.setText("关闭");
        textView4.setTextSize(14.0f);
        textView4.setTextColor(-1);
        textView4.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(((Number) mf0Var.invoke(28)).intValue());
        gradientDrawable.setColor(iArgb3);
        textView4.setBackground(gradientDrawable);
        textView4.setPadding(0, ((Number) mf0Var.invoke(12)).intValue(), 0, ((Number) mf0Var.invoke(12)).intValue());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(((Number) mf0Var.invoke(40)).intValue(), ((Number) mf0Var.invoke(16)).intValue(), ((Number) mf0Var.invoke(40)).intValue(), 0);
        textView4.setLayoutParams(layoutParams2);
        textView4.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 21));
        linearLayout.addView(textView4);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setGravity(17);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m4974s(final Context context, final long j, final InterfaceC0742sw interfaceC0742sw) {
        context.getClass();
        interfaceC0742sw.getClass();
        if (f7069h) {
            return;
        }
        f7069h = true;
        new Thread(new Runnable() { // from class: vb1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() throws NoSuchAlgorithmException, InvalidKeyException {
                wb1.m4964t(j, context, interfaceC0742sw);
            }
        }).start();
    }
}
