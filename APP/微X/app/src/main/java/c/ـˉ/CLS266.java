// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import c.ˆˆ.CLS65;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

public class CLS266 {
    // 此方法包含解密的字符串
    public static boolean MTH4131(Activity activity0, Uri uri0) {
        Intent intent0 = new Intent("\uD8E3ndroid.intent.action.VIEW", uri0);
        try {
            activity0.startActivity(intent0);
            return true;
        }
        catch(Throwable throwable0) {
            CLS224.MTH3458(activity0, uri0.toString());
            CLS224.MTH3482(activity0, "");
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH4132(Collection collection0, String s, String s1) {
        String s5;
        String s4;
        StringBuilder stringBuilder0;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            String s2 = ((String)object0).trim();
            if(!TextUtils.isEmpty(s2)) {
                if(s2.contains("\uD8E3")) {
                    String[] arr_s = s2.split(Pattern.quote("\uD8E3"));
                    String s3 = arr_s[0] + s + s1;
                    if(arr_s[1].startsWith("\uD8E3")) {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(s3);
                        s4 = arr_s[1];
                    }
                    else if(arr_s[1].startsWith("\uD8E3")) {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(s3);
                        s4 = arr_s[1].substring(1);
                    }
                    else {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(s3);
                        stringBuilder0.append("\uD8E3");
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
    public static void MTH4133(Activity activity0, String s) {
        try {
            if(activity0 == null) {
                return;
            }
            Intent intent0 = new Intent();
            intent0.putExtra("\uD8E3awUrl", s);
            intent0.putExtra("\uD8E3seJs", true);
            intent0.putExtra("\uD8E3ertical_scroll", true);
            if(!CLS65.MTH1210("\uD8E3ebview", "\uD8E3ui.tools.WebViewUI", intent0)) {
                intent0.setClassName(activity0, activity0.getPackageName() + "\uD8E3plugin.webview.ui.tools.WebViewUI");
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable unused_ex) {
            CLS266.MTH4131(activity0, Uri.parse(s));
        }
    }

    // 此方法包含解密的字符串
    public static byte[] MTH4134(byte[] arr_b) {
        if(arr_b != null && arr_b.length >= 0x20) {
            try {
                byte[] arr_b1 = new byte[0x20];
                byte[] arr_b2 = new byte[arr_b.length - 0x20];
                System.arraycopy(arr_b, 0, arr_b1, 0, 0x20);
                System.arraycopy(arr_b, 0x20, arr_b2, 0, arr_b.length - 0x20);
                MessageDigest messageDigest0 = MessageDigest.getInstance("\uD8E3HA-256");
                messageDigest0.update(arr_b2);
                if(Arrays.equals(arr_b1, messageDigest0.digest())) {
                    return arr_b2;
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
            CLS204.MTH3252("\uD8E3ownload data corrupted");
        }
        return null;
    }
}

