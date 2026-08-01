// Decompiled by JEB v5.42.0.202606242140

package b.ˆٴ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS575;
import b.ˈˈ.CLS97;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class CLS64 implements InvocationHandler {
    public final int FLD195;
    public final Object FLD196;

    public CLS64(int v, Object object0) {
        this.FLD195 = v;
        this.FLD196 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        Object object1 = this.FLD196;
        if(this.FLD195 == 0) {
            CLS97 ﾞٴ0 = (CLS97)object1;
            if(method0.getName().equals("toString")) {
                return "getappattachcb";
            }
            if(arr_object.length >= 2) {
                try {
                    int v = (int)(((Integer)arr_object[0]));
                    int v1 = (int)(((Integer)arr_object[1]));
                    if(v1 != 0 && v >= v1 && !ﾞٴ0.FLD413) {
                        CLS3 ˆٴ0 = ﾞٴ0.FLD411;
                        if(ˆٴ0 != null) {
                            ﾞٴ0.FLD413 = true;
                            CLS575 ⁱᵔ0 = new CLS575(ˆٴ0, 1);
                            CLS40.FLD157.MTH1123(((CLS39)ⁱᵔ0), 2000L);
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
        CLS12 ᵔʾ0 = (CLS12)object1;
        if(method0.getName().equals("toString")) {
            return "ImageScanCodeCallback";
        }
        if(arr_object.length >= 1) {
            try {
                ᵔʾ0.MTH791(((String)CLS166.MTH3194(CLS164.MTH3176(0, arr_object[0]), "result")));
                return null;
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        return null;
    }
}

