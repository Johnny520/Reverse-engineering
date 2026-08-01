// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS568;
import b.ˈˈ.CLS69;
import b.ˑٴ.CLS728;
import b.ˑٴ.CLS883;
import b.ᐧˉ.CLS186;
import b.ᵔʾ.CLS1262;
import b.ⁱˉ.CLS370;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

public final class CLS432 {
    // 此方法包含解密的字符串
    public static String MTH6170(ArrayList arrayList0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arrayList0.size(); v += 2) {
            stringBuilder0.append(CLS432.MTH6174(((String)arrayList0.get(v)), (v >= arrayList0.size() - 1 ? "" : ((String)arrayList0.get(v + 1)))));
        }
        return String.format(CLS27.MTH882("gen_img_html_multi"), stringBuilder0);
    }

    public static byte[] MTH6171(String s) {
        byte[] arr_b1;
        InputStream inputStream0;
        try {
            URL uRL0 = new URL(s);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            try {
                byte[] arr_b = new byte[0x1000];
                inputStream0 = uRL0.openStream();
                int v;
                while((v = inputStream0.read(arr_b)) > 0) {
                    byteArrayOutputStream0.write(arr_b, 0, v);
                }
                arr_b1 = byteArrayOutputStream0.toByteArray();
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
                return null;
            }
            try {
                byteArrayOutputStream0.close();
                inputStream0.close();
                return arr_b1;
            }
            catch(Throwable throwable1) {
            }
            CLS27.MTH893(throwable1);
            return arr_b1;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH6172(ArrayList arrayList0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arrayList0.size(); v += 2) {
            stringBuilder0.append(CLS432.MTH6174(((String)arrayList0.get(v)), (v >= arrayList0.size() - 1 ? "" : ((String)arrayList0.get(v + 1)))));
        }
        return String.format(CLS27.MTH882("gen_img_html"), stringBuilder0);
    }

    public static void MTH6173(String s, CLS3 ˆٴ0) {
        CLS1606 ﹶﾞ0 = new CLS1606(s, ˆٴ0);
        CLS40.FLD157.MTH1124(((CLS39)ﹶﾞ0));
    }

    // 此方法包含解密的字符串
    public static String MTH6174(String s, String s1) {
        long v1;
        long v;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("<tr>");
        if(TextUtils.isEmpty(s)) {
            v = 0x38EAC3102B3CD335L;
        }
        else {
            stringBuilder0.append("<td>");
            stringBuilder0.append(String.format(CLS27.MTH882("gen_img"), s));
            v = 4101304983670805301L;
        }
        stringBuilder0.append(CLS370.MTH5289(v));
        if(TextUtils.isEmpty(s1)) {
            v1 = 4101305005145641781L;
        }
        else {
            stringBuilder0.append("<td>");
            stringBuilder0.append(String.format(CLS27.MTH882("gen_img"), s1));
            v1 = 4101305653685703477L;
        }
        stringBuilder0.append(CLS370.MTH5289(v1));
        stringBuilder0.append("</tr>");
        return stringBuilder0.toString();
    }

    public static void MTH6175(int v, String s, CLS12 ᵔʾ0) {
        try {
            CLS423 ˊⁱ0 = new CLS423(s);
            ˊⁱ0.FLD4085 = true;
            ˊⁱ0.MTH6078(((CLS420)new CLS1262(ᵔʾ0, v, 6)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static boolean MTH6176(CLS69 ʾᵢ0, String s) {
        if(!CLS31.MTH1004(ʾᵢ0)) {
            return false;
        }
        try {
            byte[] arr_b = CLS432.MTH6171(s);
            if(arr_b != null) {
                return CLS31.MTH997(ʾᵢ0, arr_b);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static boolean MTH6177(Activity activity0, Uri uri0) {
        Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
        try {
            activity0.startActivity(intent0);
            return true;
        }
        catch(Throwable throwable0) {
            CLS412.MTH6017(activity0, uri0.toString());
            CLS412.MTH6014(activity0, CLS27.MTH889("copy_url"));
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6178(int v, CLS12 ᵔʾ0, String s) {
        String s1;
        try {
            switch(v) {
                case 0: {
                    s1 = String.format(CLS27.MTH882("query_web1"), URLEncoder.encode(s, "UTF-8"));
                    break;
                }
                case 1: {
                    s1 = String.format(CLS27.MTH882("query_web1_b"), URLEncoder.encode(s, "gb2312"));
                    break;
                }
                case 2: {
                    s1 = String.format(CLS27.MTH882("query_web1_c"), URLEncoder.encode(s, "UTF-8"));
                    break;
                }
                case 3: {
                    s1 = String.format(CLS27.MTH882("query_web1_d"), URLEncoder.encode(s, "gb2312"));
                    break;
                }
                case 5: {
                    s1 = String.format(CLS27.MTH882("query_web1_f"), URLEncoder.encode(s, "UTF-8"));
                    break;
                }
                default: {
                    return;
                }
            }
            CLS432.MTH6175(v, s1, ᵔʾ0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH6179(String s, CLS12 ᵔʾ0, CLS728 ˏٴ0) {
        CLS1279 ʻᐧ0 = new CLS1279(s, ᵔʾ0, ˏٴ0, 8);
        CLS40.FLD157.MTH1124(((CLS39)ʻᐧ0));
    }

    // 此方法包含解密的字符串
    public static void MTH6180(Activity activity0, CLS12 ᵔʾ0, String s) {
        Object[] arr_object = {s, new CLS186(activity0, ᵔʾ0, s)};
        CLS21.FLD76.MTH817("vidurlparser", "parse_vid_url", arr_object);
    }

    // 此方法包含解密的字符串
    public static boolean MTH6181(String s) {
        try {
            URL uRL0 = new URL(s);
            try {
                HttpURLConnection.setFollowRedirects(true);
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                httpURLConnection0.setConnectTimeout(5000);
                httpURLConnection0.setRequestMethod("HEAD");
                httpURLConnection0.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");
                if(httpURLConnection0.getResponseCode() == 200) {
                    return true;
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
                return false;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    public static void MTH6182(String s, CLS568 יᐧ0) {
        CLS432.MTH6179(s, ((CLS12)יᐧ0), null);
    }

    // 此方法包含解密的字符串
    public static void MTH6183(int v, CLS12 ᵔʾ0, String s, int v1) {
        String s1;
        try {
            if(v1 <= 0) {
                CLS432.MTH6178(v, ᵔʾ0, s);
                return;
            }
            switch(v) {
                case 0: {
                    s1 = String.format(CLS27.MTH882("query_web2"), URLEncoder.encode(s, "UTF-8"), v1);
                    break;
                }
                case 1: {
                    s1 = String.format(CLS27.MTH882("query_web2_b"), URLEncoder.encode(s, "gb2312"), v1);
                    break;
                }
                case 2: {
                    s1 = String.format(CLS27.MTH882("query_web2_c"), v1, URLEncoder.encode(s, "UTF-8"));
                    break;
                }
                case 3: {
                    s1 = String.format(CLS27.MTH882("query_web2_d"), URLEncoder.encode(s, "gb2312"), v1);
                    break;
                }
                case 5: {
                    s1 = String.format(CLS27.MTH882("query_web2_f"), URLEncoder.encode(s, "UTF-8"), v1);
                    break;
                }
                default: {
                    return;
                }
            }
            CLS432.MTH6175(v, s1, ᵔʾ0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH6184(String s, String s1, CLS3 ˆٴ0) {
        CLS883 ﾞᵎ0 = new CLS883(s1, s, ˆٴ0);
        CLS40.FLD157.MTH1124(((CLS39)ﾞᵎ0));
    }

    public static boolean MTH6185(String s, String s1) {
        if(!CLS31.MTH1003(s)) {
            return false;
        }
        try {
            byte[] arr_b = CLS432.MTH6171(s1);
            if(arr_b != null) {
                return CLS31.MTH1033(new File(s), arr_b);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }
}

