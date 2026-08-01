// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import java.util.ArrayList;

public class CLS142 {
    public interface CLS141 {
        void MTH2135(Object[] arg1);
    }

    public final ArrayList FLD609;
    public int FLD610;

    public CLS142() {
        this.FLD610 = -1;
        this.FLD609 = new ArrayList();
    }

    public CLS142 MTH2138(CLS141 ʾˎ$ⁱˋ0) {
        if(this.FLD609.contains(ʾˎ$ⁱˋ0)) {
            return this;
        }
        this.FLD609.add(ʾˎ$ⁱˋ0);
        return this;
    }

    // 去混淆评级： 低(20)
    public CLS142 MTH2139(Object[] arr_object) {
        return CLS170.MTH2460().MTH2372() ? this : this.MTH2141(arr_object);
    }

    // 去混淆评级： 低(20)
    public CLS142 MTH2140(Object[] arr_object) {
        return CLS170.MTH2460().MTH2372() ? this : this.MTH2144(arr_object);
    }

    public CLS142 MTH2141(Object[] arr_object) {
        for(Object object0: this.FLD609) {
            CLS70.MTH1131().MTH1139(((CLS69)new CLS525(((CLS141)object0), arr_object)));
        }
        return this;
    }

    public CLS142 MTH2142(Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372()) {
            int v = (int)(((Integer)arr_object[0]));
            for(Object object0: this.FLD609) {
                CLS141 ʾˎ$ⁱˋ0 = (CLS141)object0;
                try {
                    arr_object[0] = v;
                    ʾˎ$ⁱˋ0.MTH2135(arr_object);
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
                ++v;
            }
        }
        return this;
    }

    public CLS142 MTH2144(Object[] arr_object) {
        for(Object object0: this.FLD609) {
            CLS141 ʾˎ$ⁱˋ0 = (CLS141)object0;
            try {
                ʾˎ$ⁱˋ0.MTH2135(arr_object);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return this;
    }

    public int MTH2145() {
        return this.FLD610;
    }
}

