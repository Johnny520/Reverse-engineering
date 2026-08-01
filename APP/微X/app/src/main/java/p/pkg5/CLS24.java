// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

import android.text.TextUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.pkg8.CLS44;

public final class CLS24 {
    public static final HashMap FLD280;

    static {
        CLS24.FLD280 = new HashMap();
    }

    // 此方法包含解密的字符串
    public static String MTH813(String s) {
        try {
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL(s).openConnection();
            httpURLConnection0.setRequestProperty("user-agent", "Mozilla/5.0.html (iPhone; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.html.2 Mobile/8J2 Safari/6533.18.5 ");
            httpURLConnection0.setInstanceFollowRedirects(false);
            String s1 = 302 == httpURLConnection0.getResponseCode() ? httpURLConnection0.getHeaderField("Location") : "";
            if(!TextUtils.isEmpty(s1)) {
                s = s1;
            }
            httpURLConnection0.disconnect();
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
        return s;
    }

    public static boolean MTH814(String s) {
        return CLS24.FLD280.containsKey(s);
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static String MTH815(String s) {
        Matcher matcher0 = Pattern.compile("((http|ftp|https)://)(([a-zA-Z0-9._-]+\\.[a-zA-Z]{2,6})|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,4})*(/[a-zA-Z0-9&%_./-~-]*)?", 2).matcher(s);
        return matcher0.find() ? matcher0.group() : "";
    }
}

