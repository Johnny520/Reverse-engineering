package p000;

import android.R;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class hk0 {

    /* JADX INFO: renamed from: f */
    private static boolean f2280f;

    /* JADX INFO: renamed from: a */
    public static final hk0 f2275a = new hk0();

    /* JADX INFO: renamed from: b */
    private static final u60 f2276b = new x51(new sc0(25));

    /* JADX INFO: renamed from: c */
    private static final u60 f2277c = new x51(new sc0(26));

    /* JADX INFO: renamed from: d */
    private static final u60 f2278d = new x51(new sc0(27));

    /* JADX INFO: renamed from: e */
    private static final String f2279e = "ntc";

    /* JADX INFO: renamed from: g */
    public static final int f2281g = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private hk0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m1329A(InterfaceC0298hw interfaceC0298hw) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m1330B(InterfaceC0298hw interfaceC0298hw) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m1331C(Context context, String str, String str2, String str3, String str4) {
        hk0 hk0Var = f2275a;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        hk0Var.m1342N(context, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m1332D(InterfaceC0298hw interfaceC0298hw) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m1333E(InterfaceC0298hw interfaceC0298hw) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m1334F(InterfaceC0298hw interfaceC0298hw) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m1335G(InterfaceC0298hw interfaceC0298hw) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m1336H(InterfaceC0298hw interfaceC0298hw) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final SharedPreferences m1337I(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(m1340L(), 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    private final String m1338J() {
        return (String) f2278d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    private final String m1339K() {
        return (String) f2276b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    private final String m1340L() {
        return (String) f2277c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    private final boolean m1341M(Context context) {
        Object systemService = context.getSystemService("uimode");
        systemService.getClass();
        return ((UiModeManager) systemService).getNightMode() == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    private final void m1342N(Context context, String str, String str2, String str3, String str4) {
        int i;
        boolean zM1341M = m1341M(context);
        int iArgb = zM1341M ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        if (!zM1341M) {
            Color.argb(255, 22, 22, 28);
        }
        int i2 = 80;
        int iArgb2 = zM1341M ? Color.argb(180, 255, 255, 255) : Color.argb(180, 80, 80, 90);
        int iArgb3 = Color.argb(220, 254, 44, 85);
        if (zM1341M) {
            i = 90;
        } else {
            i = 210;
            i2 = 200;
        }
        int iArgb4 = Color.argb(140, i2, i2, i);
        int iArgb5 = zM1341M ? -1 : Color.argb(255, 50, 50, 60);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(false);
        mf0 mf0Var = new mf0(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        linearLayout.setPadding(((Number) mf0Var.invoke(20)).intValue(), ((Number) mf0Var.invoke(24)).intValue(), ((Number) mf0Var.invoke(20)).intValue(), ((Number) mf0Var.invoke(16)).intValue());
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, str, 18.0f, iArgb3);
        textViewM4151i.setTypeface(Typeface.DEFAULT_BOLD);
        textViewM4151i.setGravity(17);
        textViewM4151i.setPadding(0, 0, 0, ((Number) mf0Var.invoke(16)).intValue());
        linearLayout.addView(textViewM4151i);
        View view = new View(context);
        view.setBackgroundColor(zM1341M ? Color.argb(40, 255, 255, 255) : Color.argb(30, 0, 0, 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ((Number) mf0Var.invoke(1)).intValue());
        layoutParams.setMargins(((Number) mf0Var.invoke(8)).intValue(), 0, ((Number) mf0Var.invoke(8)).intValue(), ((Number) mf0Var.invoke(14)).intValue());
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str2);
        textView.setTextSize(14.0f);
        textView.setTextColor(iArgb2);
        textView.setLineSpacing(((Number) mf0Var.invoke(4)).intValue(), 1.0f);
        textView.setPadding(((Number) mf0Var.invoke(4)).intValue(), 0, ((Number) mf0Var.invoke(4)).intValue(), ((Number) mf0Var.invoke(12)).intValue());
        linearLayout2.addView(textView);
        scrollView.addView(linearLayout2);
        linearLayout.addView(scrollView);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setPadding(0, ((Number) mf0Var.invoke(8)).intValue(), 0, 0);
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "关闭", 14.0f, iArgb5, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(((Number) mf0Var.invoke(28)).intValue());
        gradientDrawableM4150h.setColor(iArgb4);
        textViewM4152j.setBackground(gradientDrawableM4150h);
        textViewM4152j.setPadding(0, ((Number) mf0Var.invoke(12)).intValue(), 0, ((Number) mf0Var.invoke(12)).intValue());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(0, 0, ((Number) mf0Var.invoke(6)).intValue(), 0);
        textViewM4152j.setLayoutParams(layoutParams2);
        textViewM4152j.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 20));
        linearLayout3.addView(textViewM4152j);
        TextView textViewM4152j2 = AbstractC0748t1.m4152j(context, str3, 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h2 = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h2.setCornerRadius(((Number) mf0Var.invoke(28)).intValue());
        gradientDrawableM4150h2.setColor(iArgb3);
        textViewM4152j2.setBackground(gradientDrawableM4150h2);
        textViewM4152j2.setPadding(0, ((Number) mf0Var.invoke(12)).intValue(), 0, ((Number) mf0Var.invoke(12)).intValue());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams3.setMargins(((Number) mf0Var.invoke(6)).intValue(), 0, 0, 0);
        textViewM4152j2.setLayoutParams(layoutParams3);
        textViewM4152j2.setOnClickListener(new ViewOnClickListenerC0354jg(dialog, str4, context));
        linearLayout3.addView(textViewM4152j2);
        linearLayout.addView(linearLayout3);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.88d), (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.55d));
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
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final int m1343O(Context context, int i) {
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final void m1344P(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m1345Q(Dialog dialog, String str, Context context, View view) {
        String str2;
        dialog.dismiss();
        if (k41.m1769a0(str)) {
            return;
        }
        try {
            if (k41.m1764V(str, "://", false)) {
                str2 = str;
            } else {
                str2 = "https://" + str;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            lb0.f3404a.m2014a(f2279e, "open url fail: " + e.getMessage());
            new Handler(Looper.getMainLooper()).post(new RunnableC0063bp(context, str, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m1346R(Context context, String str) {
        Toast.makeText(context, "无法打开链接：" + str, 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final String m1365s() {
        return ik0.f2579a.m1592a(39, 25, 3, 69, 20, 22, 31, 69, 34, 27, 21, 110, 61, 29, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final String m1366t() {
        return ik0.f2579a.m1592a(35, 12, 4, 65, 56, 66, 95, 30, 42, 22, 26, 80, 36, 74, 64, 3, 127, 86, 4, 94, 59, 87, 17, 68, 63, 16, 47, 95, 36, 12, 25, 82, 46, 87, 30, 94, 63, 17, 19, 84, 101, 8, 24, 65);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final String m1367u() {
        return ik0.f2579a.m1592a(37, 23, 4, 88, 40, 29, 47, 65, 57, 29, 22, 66);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m1368w(Context context) {
        hk0 hk0Var;
        HttpURLConnection httpURLConnection;
        int responseCode;
        try {
            hk0Var = f2275a;
            URLConnection uRLConnectionOpenConnection = new URL(hk0Var.m1339K()).openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            responseCode = httpURLConnection.getResponseCode();
        } catch (Exception e) {
            AbstractC0748t1.m4161s("fetch error: ", e.getMessage(), lb0.f3404a, f2279e);
        }
        if (200 > responseCode || responseCode >= 300) {
            httpURLConnection.disconnect();
            f2280f = false;
            return;
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        inputStream.getClass();
        String strM4884F = w60.m4884F(new BufferedReader(new InputStreamReader(inputStream, AbstractC0959yd.f7611a), 8192));
        httpURLConnection.disconnect();
        if (k41.m1769a0(strM4884F)) {
            f2280f = false;
            return;
        }
        JSONObject jSONObject = new JSONObject(strM4884F);
        if (jSONObject.optInt("code", 0) != 200) {
            f2280f = false;
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            f2280f = false;
            return;
        }
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", false);
        SharedPreferences sharedPreferencesM1337I = hk0Var.m1337I(context);
        if (zOptBoolean) {
            String strOptString = jSONObjectOptJSONObject.optString("title", "通知");
            String strOptString2 = jSONObjectOptJSONObject.optString("content", "");
            String strOptString3 = jSONObjectOptJSONObject.optString("button_text", "我知道了");
            String strOptString4 = jSONObjectOptJSONObject.optString("button_url", "");
            int iHashCode = (strOptString + strOptString2).hashCode();
            if (iHashCode != sharedPreferencesM1337I.getInt(hk0Var.m1338J(), 0)) {
                sharedPreferencesM1337I.edit().putInt(hk0Var.m1338J(), iHashCode).apply();
                new Handler(Looper.getMainLooper()).post(new gk0(context, strOptString, strOptString2, strOptString3, strOptString4, 1));
            }
        } else {
            sharedPreferencesM1337I.edit().remove(hk0Var.m1338J()).apply();
        }
        f2280f = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m1369x(Context context, String str, String str2, String str3, String str4) {
        hk0 hk0Var = f2275a;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        hk0Var.m1342N(context, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m1370z(InterfaceC0298hw interfaceC0298hw, Context context) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(f2275a.m1339K()).openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            responseCode = httpURLConnection.getResponseCode();
        } catch (Exception unused) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0824v1(4, interfaceC0298hw));
        }
        if (200 > responseCode || responseCode >= 300) {
            httpURLConnection.disconnect();
            new Handler(Looper.getMainLooper()).post(new RunnableC0824v1(6, interfaceC0298hw));
            f2280f = false;
            return;
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        inputStream.getClass();
        String strM4884F = w60.m4884F(new BufferedReader(new InputStreamReader(inputStream, AbstractC0959yd.f7611a), 8192));
        httpURLConnection.disconnect();
        if (k41.m1769a0(strM4884F)) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0824v1(7, interfaceC0298hw));
            f2280f = false;
            return;
        }
        JSONObject jSONObject = new JSONObject(strM4884F);
        if (jSONObject.optInt("code", 0) != 200) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0824v1(8, interfaceC0298hw));
            f2280f = false;
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0824v1(2, interfaceC0298hw));
            f2280f = false;
        } else {
            if (!jSONObjectOptJSONObject.optBoolean("enabled", false)) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0824v1(3, interfaceC0298hw));
                f2280f = false;
                return;
            }
            new Handler(Looper.getMainLooper()).post(new gk0(context, jSONObjectOptJSONObject.optString("title", "通知"), jSONObjectOptJSONObject.optString("content", ""), jSONObjectOptJSONObject.optString("button_text", "我知道了"), jSONObjectOptJSONObject.optString("button_url", ""), 0));
            f2280f = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m1371v(Context context) {
        context.getClass();
        if (f2280f) {
            return;
        }
        f2280f = true;
        new Thread(new nb0(context, 1)).start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m1372y(Context context, InterfaceC0298hw interfaceC0298hw) {
        context.getClass();
        interfaceC0298hw.getClass();
        if (f2280f) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0824v1(5, interfaceC0298hw));
        } else {
            f2280f = true;
            new Thread(new RunnableC0751t4(9, interfaceC0298hw, context)).start();
        }
    }
}
