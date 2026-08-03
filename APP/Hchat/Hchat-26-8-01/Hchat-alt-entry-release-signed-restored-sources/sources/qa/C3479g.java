package qa;

import android.content.SharedPreferences;
import java.math.BigDecimal;
import java.math.RoundingMode;
import okhttp3.HttpUrl;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p276sf.C3959f;

/* JADX INFO: renamed from: qa.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3479g {

    /* JADX INFO: renamed from: a */
    public static final C3147k f11292a = new C3147k("[+-]?\\d+(?:\\.\\d+)?");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static BigDecimal m7289a(String str) {
        Object c3959f;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C3145i c3145iM6680b = C3147k.m6680b(f11292a, AbstractC3156t.m6737a0(str, ",", HttpUrl.FRAGMENT_ENCODE_SET, false));
        if (c3145iM6680b == null) {
            BigDecimal scale = BigDecimal.ZERO.setScale(2);
            scale.getClass();
            return scale;
        }
        try {
            c3959f = new BigDecimal(c3145iM6680b.m6678c()).setScale(2, RoundingMode.HALF_UP);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        BigDecimal scale2 = BigDecimal.ZERO.setScale(2);
        if (c3959f instanceof C3959f) {
            c3959f = scale2;
        }
        c3959f.getClass();
        return (BigDecimal) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m7290b(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        sharedPreferences.getClass();
        str.getClass();
        str3.getClass();
        if (sharedPreferences.contains(str)) {
            return m7293e(sharedPreferences.getString(str, str3), str3);
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6703R0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str2, ",", HttpUrl.FRAGMENT_ENCODE_SET, false), "¥", HttpUrl.FRAGMENT_ENCODE_SET, false), "￥", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
        return AbstractC3149m.m6694I0(string, '+') ? "increase" : AbstractC3149m.m6694I0(string, '-') ? "decrease" : m7293e(str3, "fixed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m7291c(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        return sharedPreferences.contains(str) ? sharedPreferences.getBoolean(str, false) : sharedPreferences.getBoolean("fake_wallet_balance_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m7292d(String str) {
        String plainString = m7289a(str).abs().setScale(2, RoundingMode.HALF_UP).toPlainString();
        plainString.getClass();
        return plainString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m7293e(String str, String str2) {
        if (str != null) {
            if (!(str.equals("fixed") || str.equals("increase") || str.equals("decrease"))) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return str2;
    }
}
