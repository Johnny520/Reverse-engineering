// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import d.ˎˏ.CLS1;
import d.ˎˏ.CLS2;
import d.ˎˏ.CLS4;
import d.יʻ.CLS61;
import d.יʻ.CLS62;
import d.יʻ.CLS68.CLS67;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;

public final class CLS13 {
    public interface CLS12 {
    }

    // 此方法包含解密的字符串
    public static String MTH425(String s) {
        String s4;
        try {
            if(TextUtils.isEmpty(s)) {
                return "";
            }
            String s1 = s.trim();
            if(s1.contains(" ")) {
                s1 = s1.replaceAll(" ", "");
            }
            if(s1.contains("：")) {
                s1 = s1.substring(s1.indexOf("：") + 1);
            }
            String s2 = s1.replaceAll("\\s+", "");
            if(s2.length() == 65) {
                s2 = s2.substring(0, s2.length() - 1);
            }
            if(s2.length() != 0x40) {
                try {
                    Matcher matcher0 = Pattern.compile("^[a-zA-Z0-9+/]*={0,2}$").matcher(s2);
                    if(matcher0.matches()) {
                        s2 = matcher0.group();
                    }
                }
                catch(Throwable throwable1) {
                    CLS69.MTH797(throwable1);
                }
            }
            if(s2.length() != 0x40) {
                String s3 = CLS69.MTH795("key_length_too_short");
                if(TextUtils.isEmpty(s3)) {
                    s4 = CLS69.MTH795("key_length_wrong") + "\n" + s2;
                }
                else {
                    int v = Math.abs(s2.length() - 0x40);
                    s4 = s2.length() > 0x40 ? String.format(CLS69.MTH795("key_length_too_long"), v) + "\n" + s2 : String.format(s3, v) + "\n" + s2;
                }
                CLS13.MTH431(s4);
                return "";
            }
            return s2;
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static void MTH426(Context context0, String s) {
        if(!TextUtils.isEmpty(s) && context0 != null && !TextUtils.isEmpty(s)) {
            String s1 = "[" + CLS69.MTH795("appname") + "] " + s;
            CLS69.MTH809(s1);
            CLS159 ـﾞ0 = new CLS159(context0, s1);
            CLS68.FLD326.MTH791(((CLS67)ـﾞ0));
        }
    }

    // 此方法包含解密的字符串
    public static void MTH427(Activity activity0) {
        try {
            String s = CLS69.MTH806("email");
            if(TextUtils.isEmpty(s)) {
                return;
            }
            String s1 = CLS62.FLD317.MTH756("getXpFrameWork", new Object[0]);
            CLS36 יʻ0 = (CLS36)CLS68.FLD326.MTH786(CLS36.class);
            יʻ0.getClass();
            String s2 = "#xposed_module " + CLS69.MTH795("appname") + " " + יʻ0.FLD191.getAsString("wxVersionName") + "_" + ((int)יʻ0.FLD191.getAsInteger("wxVersionCode"));
            if(יʻ0.MTH598()) {
                s2 = s2 + " play";
            }
            if(!TextUtils.isEmpty(s1)) {
                s2 = s2 + " [" + s1 + "]";
            }
            Intent intent0 = new Intent("android.intent.action.SENDTO");
            intent0.setData(Uri.parse("mailto:"));
            intent0.putExtra("android.intent.extra.EMAIL", new String[]{s});
            intent0.putExtra("android.intent.extra.SUBJECT", s2);
            activity0.startActivity(intent0);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH428(Activity activity0, String s) {
        ((ClipboardManager)activity0.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", s));
    }

    // 此方法包含解密的字符串
    public static String MTH429() {
        Context context0 = CLS69.MTH810();
        if(context0 == null) {
            return "";
        }
        try {
            Bundle bundle0 = context0.getPackageManager().getApplicationInfo(context0.getPackageName(), 0x80).metaData;
            if(bundle0 == null) {
                return CLS13.MTH435(context0);
            }
            if(bundle0.containsKey("com.tencent.mm.BuildInfo.CLIENT_VERSION")) {
                Object object0 = bundle0.get("com.tencent.mm.BuildInfo.CLIENT_VERSION");
                if(object0 instanceof Integer) {
                    return "0x" + Integer.toHexString(((int)(((Integer)object0))));
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return CLS13.MTH435(context0);
    }

    // 去混淆评级： 中等(75)
    // 此方法包含解密的字符串
    public static boolean MTH430() {
        CLS36 יʻ0 = (CLS36)CLS68.FLD326.MTH786(CLS36.class);
        return יʻ0.MTH597().equals("xv") ? true : (יʻ0.FLD191.containsKey("apkType") ? יʻ0.FLD191.getAsString("apkType") : "").equals("xv") || יʻ0.MTH595().equals("xv");
    }

    public static void MTH431(String s) {
        CLS13.MTH426(CLS69.MTH810(), s);
    }

    // 此方法包含解密的字符串
    public static String MTH432(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            String s1 = CLS69.MTH806("rsa_transfer_key");
            if(TextUtils.isEmpty(s1)) {
                return "";
            }
            byte[] arr_b = Base64.decode(s1, 0);
            PrivateKey privateKey0 = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(arr_b));
            Cipher cipher0 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher0.init(1, privateKey0);
            return Base64.encodeToString(cipher0.doFinal(s.getBytes()), 0);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static String MTH433() {
        try {
            if(!CLS53.FLD282.MTH710()) {
                return "";
            }
            String s = CLS1.MTH369();
            return TextUtils.isEmpty(s) ? "" : CLS13.MTH432((s + "," + 1 + "," + Long.toHexString(System.currentTimeMillis())));
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static void MTH434(Object object0) {
        CLS61 ˉᵢ0 = CLS69.MTH801();
        if(ˉᵢ0 != null && !ˉᵢ0.MTH748("_debug", false)) {
            return;
        }
        if(object0 instanceof Throwable) {
            CLS69.MTH797(((Throwable)object0));
            return;
        }
        CLS69.MTH809(("" + object0));
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static String MTH435(Context context0) {
        Class class0 = CLS69.MTH793("BuildConfigClass") ? CLS69.MTH811("BuildConfigClass") : null;
        if(class0 == null) {
            class0 = CLS2.MTH379((context0.getPackageName() + ".loader.BuildConfig"), context0.getClassLoader());
        }
        if(class0 == null) {
            class0 = CLS2.MTH379((context0.getPackageName() + ".boot.BuildConfig"), context0.getClassLoader());
        }
        if(class0 == null) {
            return "";
        }
        try {
            return CLS25.MTH490() ? ((String)CLS4.MTH384(class0, CLS69.MTH800("CLIENT_VERSION_ARM64", "CLIENT_VERSION_ARM64"))) : ((String)CLS4.MTH384(class0, CLS69.MTH800("CLIENT_VERSION_ARMEABI", "CLIENT_VERSION_ARMEABI")));
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return "";
        }
    }
}

