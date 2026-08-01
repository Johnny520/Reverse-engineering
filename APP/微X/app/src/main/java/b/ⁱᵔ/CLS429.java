// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS0;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

public final class CLS429 implements InvocationHandler {
    public final String FLD4132;
    public final long FLD4133;
    public final Object FLD4134;
    public final boolean FLD4135;
    public final String FLD4136;
    public final long FLD4137;
    public final HashMap FLD4138;
    public final CLS0 FLD4139;

    public CLS429(long v, String s, boolean z, long v1, Object object0, CLS0 ʻˑ0, HashMap hashMap0, String s1) {
        this.FLD4133 = v;
        this.FLD4136 = s;
        this.FLD4135 = z;
        this.FLD4137 = v1;
        this.FLD4134 = object0;
        this.FLD4139 = ʻˑ0;
        this.FLD4138 = hashMap0;
        this.FLD4132 = s1;
    }

    // 此方法包含解密的字符串
    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        long v = this.FLD4133;
        String s = this.FLD4136;
        long v1 = this.FLD4137;
        Object object1 = this.FLD4134;
        HashMap hashMap0 = this.FLD4138;
        String s1 = this.FLD4132;
        if(method0.getName().equals("toString")) {
            return "getimgcb";
        }
        if(arr_object.length >= 2) {
            try {
                int v2 = (int)(((Integer)arr_object[0]));
                int v3 = (int)(((Integer)arr_object[1]));
                if(v3 != 0 && v2 >= v3) {
                    String s2 = CLS371.FLD3470.MTH5360(String.valueOf(v));
                    String s3 = s2.substring(s2.lastIndexOf("_") + 1);
                    if(!new CLS69(CLS66.MTH1410(s)).MTH1561()) {
                        if(new CLS69(CLS66.MTH1374((s3 + ".jpg"))).MTH1561()) {
                            s = s3 + ".jpg";
                        }
                        else if(new CLS69(CLS66.MTH1374((s3 + ".png"))).MTH1561()) {
                            s = s3 + ".png";
                        }
                        else if(new CLS69(CLS66.MTH1374((s3 + ".gif"))).MTH1561()) {
                            s = s3 + ".gif";
                        }
                        else {
                            s = s3;
                        }
                    }
                    if(this.FLD4135) {
                        CLS66.MTH1398(v, v1, object1, true);
                        return null;
                    }
                    if(!TextUtils.isEmpty(s)) {
                        CLS0 ʻˑ0 = this.FLD4139;
                        if(ʻˑ0 != null) {
                            ʻˑ0.MTH770(s);
                        }
                        hashMap0.put(s1, s);
                        return null;
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return null;
    }
}

