// Decompiled by JEB v5.42.0.202606242140

package b.ˆٴ;

import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˑٴ.CLS737;
import b.ˑٴ.CLS759;
import b.ⁱᵔ.CLS485.CLS484;
import b.ⁱᵔ.CLS485;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class CLS65 implements InvocationHandler {
    public final CLS484 FLD209;
    public final CLS17 FLD210;

    public CLS65(CLS484 ᐧﾞ$ˆٴ0, CLS759 ـˏ0) {
        this.FLD209 = ᐧﾞ$ˆٴ0;
        this.FLD210 = ـˏ0;
    }

    // 此方法包含解密的字符串
    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        CLS484 ᐧﾞ$ˆٴ0 = this.FLD209;
        CLS17 ﾞٴ0 = this.FLD210;
        if(method0.getName().equals("toString")) {
            return "MicroMsg.ImportVideo callback wx";
        }
        if(arr_object.length == 5) {
            try {
                int v = (int)(((Integer)arr_object[0]));
                String s = (String)arr_object[1];
                String s1 = (String)arr_object[2];
                String s2 = (String)arr_object[3];
                int v1 = (int)(((Integer)arr_object[4]));
                CLS40 ﾞᵎ0 = CLS40.FLD157;
                ﾞᵎ0.MTH1119(1800000L, ᐧﾞ$ˆٴ0, "notification_" + s);
                if(v < 0 && v != -50002) {
                    ﾞٴ0.MTH796(new Object[]{s, v1});
                    return null;
                }
                CLS27.MTH906(String.format("need remux, ret = %d, filename = %s, str2 = %s, importPath = %s, len = %d", v, s, s1, s2, v1));
                CLS485 ᐧﾞ0 = (CLS485)ﾞᵎ0.MTH1118(CLS485.class);
                String s3 = CLS27.MTH889("remuxing_video");
                ᐧﾞ0.getClass();
                CLS485.MTH6725(ᐧﾞ$ˆٴ0, s3, 0);
                ﾞᵎ0.MTH1124(((CLS39)new CLS737(s2, s, ﾞٴ0, v1, 13)));
                return null;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return null;
    }
}

