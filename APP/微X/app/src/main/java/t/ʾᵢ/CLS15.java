// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import t.ʻˑ.CLS3;
import t.ˆʿ.CLS46;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS139.CLS138;
import t.ᵔʾ.CLS301;
import t.ﾞٴ.CLS308;
import t.ﾞٴ.CLS309;
import t.ﾞٴ.CLS323;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS345;

public final class CLS15 {
    public static void MTH1071(CLS309 ʽﹶ0, int v, CLS123 ʾᵢ0, String s) {
        ʾᵢ0.MTH2002(s, ((CLS138)new CLS323(ʽﹶ0, v)));
    }

    public static Object MTH1072(long v, Object object0) {
        return CLS3.MTH989(object0, CLS133.MTH2115(CLS114.MTH1900(v)));
    }

    public static void MTH1073(long v, CLS332 ʻᵎ0) {
        ʻᵎ0.MTH2172(CLS133.MTH2099(CLS114.MTH1900(v)));
    }

    public static String MTH1074(long v, CLS345 ﹳˊ0, int v1) {
        ﹳˊ0.MTH2172(CLS133.MTH2099(CLS114.MTH1900(v)));
        return CLS46.MTH1453(v1);
    }

    public static String MTH1075(int v, CLS123 ʾᵢ0, String s, long v1) {
        ʾᵢ0.MTH2002(s, ((CLS138)new CLS301(v)));
        return CLS114.MTH1900(v1);
    }

    public static String MTH1076(String s, int v, int v1, StringBuilder stringBuilder0, int v2, int v3) {
        stringBuilder0.append(s.substring(v, v1));
        stringBuilder0.append(s.substring(v2 + v3));
        return stringBuilder0.toString();
    }

    public static boolean MTH1077(long v) {
        return TextUtils.isEmpty(CLS133.MTH2115(CLS114.MTH1900(v)));
    }

    public static void MTH1078(CLS309 ʽﹶ0, int v, CLS123 ʾᵢ0, String s) {
        ʾᵢ0.MTH2002(s, ((CLS138)new CLS308(ʽﹶ0, v)));
    }
}

