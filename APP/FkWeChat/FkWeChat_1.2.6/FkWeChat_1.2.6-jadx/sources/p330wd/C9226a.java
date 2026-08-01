package p330wd;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import me.yun.fkwechat.core.config.AppConfig;
import okhttp3.internal.url._UrlKt;
import p084fd.AbstractC2422b;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: wd.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9226a {

    /* JADX INFO: renamed from: a */
    public static final C9226a f31490a = new C9226a();

    /* JADX INFO: renamed from: a */
    public static final String m35910a(String str) {
        String strM33069N;
        String strM33069N2;
        String str2;
        String str3;
        String str4 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (str == null || AbstractC8621f0.m33156p0(str)) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        try {
            String strM8720d = AbstractC2422b.m8720d();
            String str5 = strM8720d == null ? _UrlKt.FRAGMENT_ENCODE_SET : strM8720d;
            String strM8718b = AbstractC2422b.m8718b();
            if (strM8718b == null) {
                strM8718b = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            Map mapM8719c = AbstractC2422b.m8719c();
            String str6 = (mapM8719c == null || (str3 = (String) mapM8719c.get("last_login_alias")) == null) ? _UrlKt.FRAGMENT_ENCODE_SET : str3;
            if (mapM8719c != null && (str2 = (String) mapM8719c.get("last_login_bind_mobile")) != null) {
                str4 = str2;
            }
            String str7 = strM8718b;
            String strM33069N3 = AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(str, "$wxid", str5, false, 4, null), "$id", str5, false, 4, null), "$name", str7, false, 4, null), "$nickname", str7, false, 4, null);
            String str8 = str6;
            String strM33069N4 = AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(strM33069N3, "$wechatId", str8, false, 4, null), "$alias", str8, false, 4, null);
            String str9 = str4;
            strM33069N = AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(strM33069N4, "$phone", str9, false, 4, null), "$mobile", str9, false, 4, null);
            try {
                String str10 = AppConfig.moduleVersionName;
                if (str10 == null) {
                    str10 = "1.2.6";
                }
                String str11 = str10;
                String str12 = AppConfig.hostVersionName;
                if (str12 == null) {
                    str12 = "Unknown";
                }
                String str13 = str12;
                String str14 = Build.BRAND + " " + Build.MODEL;
                String str15 = "Android " + Build.VERSION.RELEASE;
                String str16 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
                String strM33069N5 = AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(strM33069N, "$moduleVersion", str11, false, 4, null), "$hostVersion", str13, false, 4, null), "$model", str14, false, 4, null), "$sysVersion", str15, false, 4, null);
                str16.getClass();
                strM33069N2 = AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(strM33069N5, "$time", str16, false, 4, null), "$date", (String) AbstractC8621f0.m33112S0(str16, new String[]{" "}, false, 0, 6, null).get(0), false, 4, null);
            } catch (Exception unused) {
                strM33069N2 = strM33069N;
            }
        } catch (Exception unused2) {
            strM33069N = str;
        }
        strM33069N2.getClass();
        return strM33069N2;
    }
}
