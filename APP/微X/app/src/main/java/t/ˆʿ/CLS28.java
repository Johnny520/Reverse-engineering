// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS135;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;

public final class CLS28 {
    public static final HashSet FLD427;

    static {
        CLS28.FLD427 = new HashSet();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1314(Activity activity0, String s) {
        ((ClipboardManager)activity0.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", s));
    }

    // 此方法包含解密的字符串
    public static void MTH1315(Context context0, String s) {
        if(!TextUtils.isEmpty(s) && context0 != null && !TextUtils.isEmpty(s)) {
            String s1 = "[" + CLS133.MTH2099("appname") + "] " + s;
            CLS133.MTH2109(s1);
            CLS276 ˊˏ0 = new CLS276(context0, s1);
            CLS137.FLD972.MTH2145(((CLS136)ˊˏ0));
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1316() {
        CLS135 ⁱˉ0 = CLS133.MTH2103();
        String s = ⁱˉ0.MTH2134("fp", "");
        String s1 = ⁱˉ0.MTH2134("fp_async", "");
        CLS28.FLD427.clear();
        List list0 = Arrays.asList(CLS33.MTH1352(s));
        CLS28.FLD427.addAll(list0);
        List list1 = Arrays.asList(CLS33.MTH1352(s1));
        CLS28.FLD427.addAll(list1);
        return CLS28.FLD427.contains("themes");
    }

    public static int MTH1317(int v, int v1) {
        if(v < v1) {
            int v2 = v1;
            v1 = v;
            v = v2;
        }
        try {
            return new Random(System.currentTimeMillis()).nextInt(Math.abs(v - v1) + 1) + v1;
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }

    // 去混淆评级： 中等(54)
    // 此方法包含解密的字符串
    public static boolean MTH1318() {
        CLS52 ⁱʾ0 = (CLS52)CLS137.FLD972.MTH2143(CLS52.class);
        ⁱʾ0.getClass();
        if(!ⁱʾ0.FLD511.getAsString("type").equals("xv")) {
            return (ⁱʾ0.FLD511.containsKey("apkType") ? ⁱʾ0.FLD511.getAsString("apkType") : "").equals("xv") ? true : (ⁱʾ0.FLD511.containsKey("custom_mark") ? ⁱʾ0.FLD511.getAsString("custom_mark") : "").equals("xv");
        }
        return true;
    }
}

