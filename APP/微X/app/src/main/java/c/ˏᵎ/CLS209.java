// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import c.ᵎʾ.CLS299;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

public class CLS209 {
    // 此方法包含解密的字符串
    public static void MTH2984(Activity activity0, String s) {
        try {
            if(activity0 == null) {
                return;
            }
            Intent intent0 = new Intent();
            intent0.putExtra("rawUrl", s);
            intent0.putExtra("useJs", true);
            intent0.putExtra("vertical_scroll", true);
            if(!CLS299.MTH4273("webview", ".ui.tools.WebViewUI", intent0)) {
                intent0.setClassName(activity0, activity0.getPackageName() + ".plugin.webview.ui.tools.WebViewUI");
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable unused_ex) {
            CLS209.MTH2987(activity0, Uri.parse(s));
        }
    }

    // 此方法包含解密的字符串
    public static byte[] MTH2985(byte[] arr_b) {
        if(arr_b != null && arr_b.length >= 0x20) {
            try {
                byte[] arr_b1 = new byte[0x20];
                byte[] arr_b2 = new byte[arr_b.length - 0x20];
                System.arraycopy(arr_b, 0, arr_b1, 0, 0x20);
                System.arraycopy(arr_b, 0x20, arr_b2, 0, arr_b.length - 0x20);
                MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
                messageDigest0.update(arr_b2);
                if(Arrays.equals(arr_b1, messageDigest0.digest())) {
                    return arr_b2;
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
            CLS185.MTH2711("download data corrupted");
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH2986(Collection collection0, String s, String s1) {
        String s5;
        String s4;
        StringBuilder stringBuilder0;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            String s2 = ((String)object0).trim();
            if(!TextUtils.isEmpty(s2)) {
                if(s2.contains("|")) {
                    String[] arr_s = s2.split(Pattern.quote("|"));
                    String s3 = arr_s[0] + s + s1;
                    if(arr_s[1].startsWith("?")) {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(s3);
                        s4 = arr_s[1];
                    }
                    else if(arr_s[1].startsWith("$")) {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(s3);
                        s4 = arr_s[1].substring(1);
                    }
                    else {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(s3);
                        stringBuilder0.append(".");
                        s4 = arr_s[1];
                    }
                    stringBuilder0.append(s4);
                    s5 = stringBuilder0.toString();
                }
                else {
                    s5 = s2 + s + s1;
                }
                arrayList0.add(s5);
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2987(Activity activity0, Uri uri0) {
        Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
        try {
            activity0.startActivity(intent0);
            return true;
        }
        catch(Throwable throwable0) {
            CLS184.MTH2667(activity0, uri0.toString());
            CLS184.MTH2702(activity0, "");
            CLS185.MTH2708(throwable0);
            return false;
        }
    }
}

