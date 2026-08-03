package p198nb;

import ac.AbstractC0063p;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p304uf.C4335i;
import tf.C4175v;

/* JADX INFO: renamed from: nb.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2957z {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f9702a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2957z(Context context) {
        this.f9702a = context != null ? AbstractC4302b.m8640c(context, "Hchat_text_speech_config") : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Set m6376a() {
        Object c3959f;
        String strM6379d = m6379d("text_speech_allowed_contacts", HttpUrl.FRAGMENT_ENCODE_SET);
        boolean zM6721t0 = AbstractC3149m.m6721t0(strM6379d);
        C4175v c4175v = C4175v.f13712g;
        if (zM6721t0) {
            return c4175v;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM6379d);
            C4335i c4335i = new C4335i();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                String strOptString = jSONArray.optString(i9);
                strOptString.getClass();
                String string = AbstractC3149m.m6703R0(strOptString).toString();
                if (string.length() > 0) {
                    c4335i.add(string);
                }
            }
            c3959f = AbstractC0063p.m415h(c4335i);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4175v;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (Set) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m6377b(String str) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f9702a;
            c3959f = Boolean.valueOf(sharedPreferences != null ? sharedPreferences.getBoolean(str, false) : false);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m6378c() {
        return AbstractC3149m.m6703R0(m6379d("text_speech_tts_engine", HttpUrl.FRAGMENT_ENCODE_SET)).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m6379d(String str, String str2) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f9702a;
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
}
