package p000a;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: a.Yc */
/* JADX INFO: loaded from: classes.dex */
public final class C0446Yc {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f1659b;

    /* JADX INFO: renamed from: e */
    public static volatile SharedPreferences f1662e;

    /* JADX INFO: renamed from: a */
    public static final String[] f1658a = {"https://raw.githubusercontent.com/mmjzmmww/FloatingClouds/main/kill_switch.json"};

    /* JADX INFO: renamed from: c */
    public static volatile String f1660c = "";

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f1661d = new AtomicBoolean(false);

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: A */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static boolean m1101a() {
        HttpURLConnection httpURLConnection;
        String str = f1658a[0];
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            C0631i9.m1480c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection.setConnectTimeout(8000);
                httpURLConnection.setReadTimeout(8000);
                httpURLConnection.setRequestProperty("User-Agent", "Floatingclouds-KillSwitch");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (Exception e) {
            Log.w("fc-remote-killswitch", "fetch failed from " + str + ": " + e.getMessage());
        }
        if (httpURLConnection.getResponseCode() != 200) {
            Log.w("fc-remote-killswitch", "HTTP " + httpURLConnection.getResponseCode() + " from " + str);
            Log.w("fc-remote-killswitch", "all 1 mirrors failed (keep " + f1659b + ")");
            return false;
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        C0631i9.m1481d(inputStream, "getInputStream(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C0382V2.f1441a), 8192);
        try {
            String strM1679v = C0726n9.m1679v(bufferedReader);
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(strM1679v);
            boolean zOptBoolean = jSONObject.optBoolean("disabled", false);
            String strOptString = jSONObject.optString("message", "");
            C0631i9.m1479b(strOptString);
            C0710mc c0710mcM1103c = m1103c(jSONObject, zOptBoolean, strOptString);
            boolean zBooleanValue = ((Boolean) c0710mcM1103c.f2680a).booleanValue();
            String str2 = (String) c0710mcM1103c.f2681b;
            if (zBooleanValue != f1659b || !C0631i9.m1478a(str2, f1660c)) {
                f1659b = zBooleanValue;
                f1660c = str2;
                m1102b(str2, zBooleanValue);
            }
            Log.i("fc-remote-killswitch", "OK from " + str + ": disabled=" + zBooleanValue + " (global=" + zOptBoolean + " v=3.1.5) msg=" + str2);
            return true;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1102b(String str, boolean z) {
        SharedPreferences sharedPreferences = f1662e;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putBoolean("remote_disabled", z).putString("remote_message", str).putLong("last_fetch_ts", System.currentTimeMillis()).apply();
            Log.i("fc-remote-killswitch", "persisted disabled=" + z + " msg=" + str);
        } catch (Exception e) {
            Log.w("fc-remote-killswitch", "persist failed: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static C0710mc m1103c(JSONObject jSONObject, boolean z, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (z) {
            return new C0710mc(Boolean.TRUE, str);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("versions");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("3.1.5")) == null || !jSONObjectOptJSONObject.optBoolean("disabled", false)) {
            return new C0710mc(Boolean.FALSE, "");
        }
        String strOptString = jSONObjectOptJSONObject.optString("message", "");
        if (strOptString.length() != 0) {
            str = strOptString;
        }
        return new C0710mc(Boolean.TRUE, str);
    }
}
