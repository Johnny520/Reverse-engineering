package p346x9;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p343x6.AbstractC5700d;
import tf.C4173t;

/* JADX INFO: renamed from: x9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5738e {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f23383a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5738e(Context context) {
        this.f23383a = AbstractC4302b.m8640c(context, "Hchat_keyword_notification_config");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m10431a(String str, boolean z9) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f23383a;
            c3959f = Boolean.valueOf(sharedPreferences != null ? sharedPreferences.getBoolean(str, z9) : z9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object objValueOf = Boolean.valueOf(z9);
        if (c3959f instanceof C3959f) {
            c3959f = objValueOf;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m10432b(String str, String str2) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f23383a;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(str, str2);
                c3959f = string;
                if (string == null) {
                    c3959f = str2;
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = str2;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00e3 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    public final List m10433c() {
        ?? c3959f;
        String strM10432b = m10432b("keyword_notify_keywords", HttpUrl.FRAGMENT_ENCODE_SET);
        boolean zM6721t0 = AbstractC3149m.m6721t0(strM10432b);
        C4173t c4173t = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (AbstractC3156t.m6740d0(AbstractC3149m.m6703R0(strM10432b).toString(), "[", false)) {
                JSONArray jSONArray = new JSONArray(strM10432b);
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("keyword");
                        strOptString.getClass();
                        String string = AbstractC3149m.m6703R0(strOptString).toString();
                        if (string.length() > 0) {
                            arrayList.add(new C5739f(string, jSONObjectOptJSONObject.optBoolean("wholeWord", false)));
                        }
                    } else {
                        String strOptString2 = jSONArray.optString(i9);
                        strOptString2.getClass();
                        String string2 = AbstractC3149m.m6703R0(strOptString2).toString();
                        if (string2.length() > 0) {
                            arrayList.add(new C5739f(string2, false));
                        }
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject(strM10432b);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    next.getClass();
                    String string3 = AbstractC3149m.m6703R0(next).toString();
                    if (string3.length() > 0) {
                        arrayList.add(new C5739f(string3, jSONObject.optBoolean(string3, false)));
                    }
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((C5739f) obj).f23384a)) {
                    c3959f.add(obj);
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        ?? r2 = c4173t;
        if (!(c3959f instanceof C3959f)) {
            r2 = c3959f;
        }
        return (List) r2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m10434d(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        SharedPreferences sharedPreferences = this.f23383a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutString = editorEdit.putString(str, str2)) == null) {
            return;
        }
        editorPutString.apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m10435e(String str) {
        if (!AbstractC3149m.m6721t0(str)) {
            if (m10431a("keyword_notify_filter_mode", false)) {
                return AbstractC5700d.m10262T(m10432b("keyword_notify_include_contacts", HttpUrl.FRAGMENT_ENCODE_SET)).contains(str);
            }
            if (!AbstractC5700d.m10262T(m10432b("keyword_notify_exclude_contacts", HttpUrl.FRAGMENT_ENCODE_SET)).contains(str)) {
                return true;
            }
        }
        return false;
    }
}
