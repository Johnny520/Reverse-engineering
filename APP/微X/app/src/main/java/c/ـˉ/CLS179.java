// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import java.util.ArrayList;

public class CLS179 {
    public interface CLS178 {
        void MTH3070(Object[] arg1);
    }

    public int FLD872;
    public final ArrayList FLD873;

    public CLS179() {
        this.FLD872 = -1;
        this.FLD873 = new ArrayList();
    }

    public int MTH3072() {
        return this.FLD872;
    }

    // 去混淆评级： 低(20)
    public CLS179 MTH3073(Object[] arr_object) {
        return CLS261.MTH3881().MTH4020() ? this : this.MTH3079(arr_object);
    }

    public CLS179 MTH3075(CLS178 ʽـ$ˆٴ0) {
        if(this.FLD873.contains(ʽـ$ˆٴ0)) {
            return this;
        }
        this.FLD873.add(ʽـ$ˆٴ0);
        return this;
    }

    public CLS179 MTH3077(Object[] arr_object) {
        for(Object object0: this.FLD873) {
            CLS178 ʽـ$ˆٴ0 = (CLS178)object0;
            try {
                ʽـ$ˆٴ0.MTH3070(arr_object);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return this;
    }

    public CLS179 MTH3078(Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020()) {
            int v = (int)(((Integer)arr_object[0]));
            for(Object object0: this.FLD873) {
                CLS178 ʽـ$ˆٴ0 = (CLS178)object0;
                try {
                    arr_object[0] = v;
                    ʽـ$ˆٴ0.MTH3070(arr_object);
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
                ++v;
            }
        }
        return this;
    }

    public CLS179 MTH3079(Object[] arr_object) {
        for(Object object0: this.FLD873) {
            CLS144.MTH2583().MTH2589(((CLS142)new CLS706(((CLS178)object0), arr_object)));
        }
        return this;
    }

    // 去混淆评级： 低(20)
    public CLS179 MTH3080(Object[] arr_object) {
        return CLS261.MTH3881().MTH4020() ? this : this.MTH3077(arr_object);
    }
}

