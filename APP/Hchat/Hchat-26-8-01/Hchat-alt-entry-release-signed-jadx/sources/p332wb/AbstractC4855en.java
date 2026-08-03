package p332wb;

import af.C0081d;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import p012ah.C0086a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p292u1.AbstractC4229a;

/* JADX INFO: renamed from: wb.en */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4855en {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0081d m9257a(String str) {
        AbstractC4229a.m8495c(str);
        return new C0081d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static SharedPreferences.Editor m9258b(String str, InterfaceC1809a1 interfaceC1809a1, String str2, SharedPreferences sharedPreferences) {
        str.getClass();
        interfaceC1809a1.setValue(str2);
        return sharedPreferences.edit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C1368i m9259c() {
        WeChatApis.contact().getClass();
        return WeChatApis.contactApi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C1845j1 m9260d(SharedPreferences sharedPreferences, String str, int i9, C1836h0 c1836h0) {
        C1845j1 c1845j1M4639u = AbstractC1874r.m4639u(String.valueOf(sharedPreferences.getInt(str, i9)));
        c1836h0.m4545k0(c1845j1M4639u);
        return c1845j1M4639u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C1845j1 m9261e(SharedPreferences sharedPreferences, String str, boolean z9, C1836h0 c1836h0) {
        C1845j1 c1845j1M4639u = AbstractC1874r.m4639u(Boolean.valueOf(sharedPreferences.getBoolean(str, z9)));
        c1836h0.m4545k0(c1845j1M4639u);
        return c1845j1M4639u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m9262f(int i9, int i10, String str) {
        return str.substring(i10, str.length() - i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m9263g(String str, String str2) {
        return str + str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m9264h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m9265i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m9266j(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str);
        strOptString.getClass();
        return AbstractC3149m.m6703R0(strOptString).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static JSONObject m9267k(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, str2);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static JSONObject m9268l(String str, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, str2);
        jSONObject.put(str3, str4);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m9269m(InterfaceC1809a1 interfaceC1809a1, Boolean bool, SharedPreferences sharedPreferences, String str, boolean z9) {
        interfaceC1809a1.setValue(bool);
        sharedPreferences.edit().putBoolean(str, z9).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m9270n(Object obj) {
        if (obj == null) {
            return;
        }
        C0086a.m445d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m9271o(String str, int i9, String str2, Context context, int i10) {
        Toast.makeText(context, str + i9 + str2, i10).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m9272p(StringBuilder sb2, int i9, String str, int i10, String str2) {
        sb2.append(i9);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((r1v0 int) != (1 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (2 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (3 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (4 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (5 int)) ? ("null") : ("OR")) : ("AND")) : ("NOT")) : ("TERNARY")) : ("COMPARE") */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m9273q(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? "null" : "OR" : "AND" : "NOT" : "TERNARY" : "COMPARE";
    }
}
