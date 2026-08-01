// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import java.util.ArrayList;
import java.util.HashSet;

public class CLS163 {
    public interface CLS162 {
        Object MTH2286(Object[] arg1);
    }

    public final ArrayList FLD654;

    public CLS163() {
        this.FLD654 = new ArrayList();
    }

    public String MTH2288(Object[] arr_object) {
        Object object0 = this.MTH2291(arr_object);
        return object0 == null ? "" : ((String)object0);
    }

    public ArrayList MTH2289(Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.FLD654) {
            CLS162 ˉˎ$ⁱˋ0 = (CLS162)object0;
            try {
                Object object1 = ˉˎ$ⁱˋ0.MTH2286(arr_object);
                if(object1 == null || hashSet0.contains(object1)) {
                    continue;
                }
                arrayList0.add(object1);
                hashSet0.add(object1);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return arrayList0;
    }

    // 去混淆评级： 低(20)
    public ArrayList MTH2290(Object[] arr_object) {
        return CLS170.MTH2460().MTH2372() ? new ArrayList() : this.MTH2289(arr_object);
    }

    public Object MTH2291(Object[] arr_object) {
        ArrayList arrayList0 = this.MTH2290(arr_object);
        return arrayList0.isEmpty() ? null : arrayList0.get(0);
    }

    public CLS163 MTH2292(CLS162 ˉˎ$ⁱˋ0) {
        if(this.FLD654.contains(ˉˎ$ⁱˋ0)) {
            return this;
        }
        this.FLD654.add(ˉˎ$ⁱˋ0);
        return this;
    }

    public boolean MTH2293(Object[] arr_object) {
        Object object0 = this.MTH2291(arr_object);
        if(object0 == null) {
            return false;
        }
        return object0 instanceof String ? Boolean.parseBoolean(((String)object0)) : ((Boolean)object0).booleanValue();
    }

    public Object MTH2294(Object[] arr_object) {
        ArrayList arrayList0 = this.MTH2289(arr_object);
        return arrayList0.isEmpty() ? null : arrayList0.get(0);
    }

    public int MTH2295(Object[] arr_object) {
        Object object0 = this.MTH2291(arr_object);
        if(object0 == null) {
            return 0;
        }
        return object0 instanceof String ? Integer.parseInt(((String)object0)) : ((int)(((Integer)object0)));
    }
}

