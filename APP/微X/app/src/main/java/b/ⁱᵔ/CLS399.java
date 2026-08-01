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

public final class CLS399 implements InvocationHandler {
    public final long FLD3816;
    public final String FLD3817;
    public final CLS0 FLD3818;
    public final String FLD3819;
    public final HashMap FLD3820;

    public CLS399(long v, String s, CLS0 ʻˑ0, HashMap hashMap0, String s1) {
        this.FLD3816 = v;
        this.FLD3819 = s;
        this.FLD3818 = ʻˑ0;
        this.FLD3820 = hashMap0;
        this.FLD3817 = s1;
    }

    // 此方法包含解密的字符串
    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        long v = this.FLD3816;
        String s = this.FLD3819;
        HashMap hashMap0 = this.FLD3820;
        String s1 = this.FLD3817;
        if(method0.getName().equals("toString")) {
            return "getimgcb";
        }
        if(arr_object.length >= 2) {
            try {
                int v1 = (int)(((Integer)arr_object[0]));
                int v2 = (int)(((Integer)arr_object[1]));
                if(v2 != 0 && v1 >= v2) {
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
                    if(!TextUtils.isEmpty(s)) {
                        CLS0 ʻˑ0 = this.FLD3818;
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

