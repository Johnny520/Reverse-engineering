package bb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p080fb.AbstractC1184v0;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p300ub.AbstractC4302b;
import p365y9.C6010f;
import p381zb.AbstractC6134c;

/* JADX INFO: renamed from: bb.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0250l {

    /* JADX INFO: renamed from: c */
    public static final C3147k f693c = new C3147k("[0-9a-fA-F]{24,64}");

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f694a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f695b = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0250l(Context context) {
        this.f694a = AbstractC4302b.m8640c(context, "Hchat_real_name_tail_config");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1001a(String str) {
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC6134c.m10905b(string)) {
            String strConcat = "tail_".concat(string);
            boolean zM3174A = AbstractC1184v0.m3174A(string);
            SharedPreferences sharedPreferences = this.f694a;
            ConcurrentHashMap concurrentHashMap = this.f695b;
            if (zM3174A) {
                String string2 = (String) concurrentHashMap.get(string);
                if (string2 == null && (string2 = sharedPreferences.getString(strConcat, HttpUrl.FRAGMENT_ENCODE_SET)) == null) {
                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String strM3180G = AbstractC1184v0.m3180G(string2);
                if (strM3180G.length() != 0 && (strM3180G.length() != 1 || AbstractC3149m.m6710i0(strM3180G, '*'))) {
                    concurrentHashMap.put(string, strM3180G);
                    if (!strM3180G.equals(string2)) {
                        sharedPreferences.edit().putString(strConcat, strM3180G).apply();
                    }
                    return strM3180G;
                }
                concurrentHashMap.remove(string);
                if (sharedPreferences.contains(strConcat)) {
                    sharedPreferences.edit().remove(strConcat).apply();
                }
            } else {
                concurrentHashMap.remove(string);
                if (sharedPreferences.contains(strConcat)) {
                    sharedPreferences.edit().remove(strConcat).apply();
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C6010f m1002b(String str) {
        SharedPreferences sharedPreferences = this.f694a;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferences.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str2 = string;
        }
        return AbstractC0018a.m219G(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m1003c(String str) {
        String strM1001a = m1001a(str);
        int length = strM1001a.length();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        SharedPreferences sharedPreferences = this.f694a;
        if (sharedPreferences.getBoolean("global_prefix_enable", false)) {
            String string = sharedPreferences.getString("global_prefix", HttpUrl.FRAGMENT_ENCODE_SET);
            if (string != null) {
                str2 = string;
            }
            String strReplace = AbstractC3156t.m6738b0(AbstractC3149m.m6703R0(str2).toString(), '\n', ' ').replace('\r', ' ');
            strReplace.getClass();
            String strReplace2 = strReplace.replace('\t', ' ');
            strReplace2.getClass();
            String strM6701P0 = AbstractC3149m.m6701P0(8, strReplace2);
            if (strM6701P0.length() != 0) {
                return strM6701P0.concat(AbstractC3149m.m6702Q0(1, strM1001a));
            }
        }
        return strM1001a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m1004d(int i9) {
        String str = i9 != 1 ? i9 != 2 ? "gender_unknown_text" : "gender_female_text" : "gender_male_text";
        String str2 = i9 != 1 ? i9 != 2 ? HttpUrl.FRAGMENT_ENCODE_SET : "女" : "男";
        String string = this.f694a.getString(str, str2);
        if (string != null) {
            str2 = string;
        }
        String strReplace = AbstractC3156t.m6738b0(AbstractC3149m.m6703R0(str2).toString(), '\n', ' ').replace('\r', ' ');
        strReplace.getClass();
        String strReplace2 = strReplace.replace('\t', ' ');
        strReplace2.getClass();
        return AbstractC3149m.m6701P0(12, strReplace2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m1005e(String str) {
        return m1001a(str).length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m1006f(String str) {
        return AbstractC1184v0.m3198h(this.f694a.getInt(str, 400));
    }
}
