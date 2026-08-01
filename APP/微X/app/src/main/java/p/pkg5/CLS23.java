// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import p.pkg1.CLS1;
import p.pkg8.CLS44;
import p.pkg8.CLS51;

public final class CLS23 {
    public static final HashSet FLD279;

    static {
        CLS23.FLD279 = new HashSet();
    }

    // 此方法包含解密的字符串
    public static void MTH809(String s) {
        boolean z;
        CLS51 ٴﹶ0 = CLS44.MTH891();
        if(ٴﹶ0 != null) {
            try {
                Object object0 = ٴﹶ0.MTH930(Boolean.FALSE, "_debug");
                if(object0 == null) {
                    goto label_10;
                }
                else {
                    z = ((Boolean)object0).booleanValue();
                }
            }
            catch(Throwable throwable0) {
                CLS44.MTH897(throwable0);
                z = false;
            }
            goto label_11;
        label_10:
            z = false;
        label_11:
            if(!z) {
                return;
            }
        }
        if(s instanceof Throwable) {
            CLS44.MTH897(((Throwable)s));
            return;
        }
        CLS44.MTH894(("" + s));
    }

    // 此方法包含解密的字符串
    public static boolean MTH810() {
        CLS51 ٴﹶ0 = CLS44.MTH891();
        String s = ٴﹶ0.MTH924("fp", "");
        String s1 = ٴﹶ0.MTH924("fp_async", "");
        CLS23.FLD279.clear();
        List list0 = Arrays.asList(CLS1.MTH402(s));
        CLS23.FLD279.addAll(list0);
        List list1 = Arrays.asList(CLS1.MTH402(s1));
        CLS23.FLD279.addAll(list1);
        return CLS23.FLD279.contains("vidurlparser");
    }

    public static int MTH811() {
        try {
            return new Random(System.currentTimeMillis()).nextInt(5001) + 5000;
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }
}

