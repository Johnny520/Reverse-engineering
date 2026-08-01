// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import java.util.ArrayList;
import java.util.HashSet;

public class CLS255 {
    public interface CLS254 {
        Object MTH3685(Object[] arg1);
    }

    public final ArrayList FLD1078;

    public CLS255() {
        this.FLD1078 = new ArrayList();
    }

    public int MTH3687(Object[] arr_object) {
        Object object0 = this.MTH3693(arr_object);
        if(object0 == null) {
            return 0;
        }
        return object0 instanceof String ? Integer.parseInt(((String)object0)) : ((int)(((Integer)object0)));
    }

    public ArrayList MTH3688(Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.FLD1078) {
            CLS254 ᵔﹶ$ˆٴ0 = (CLS254)object0;
            try {
                Object object1 = ᵔﹶ$ˆٴ0.MTH3685(arr_object);
                if(object1 == null || hashSet0.contains(object1)) {
                    continue;
                }
                arrayList0.add(object1);
                hashSet0.add(object1);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return arrayList0;
    }

    public boolean MTH3689(Object[] arr_object) {
        Object object0 = this.MTH3693(arr_object);
        if(object0 == null) {
            return false;
        }
        return object0 instanceof String ? Boolean.parseBoolean(((String)object0)) : ((Boolean)object0).booleanValue();
    }

    public String MTH3690(Object[] arr_object) {
        Object object0 = this.MTH3693(arr_object);
        return object0 == null ? "" : ((String)object0);
    }

    public Object MTH3691(Object[] arr_object) {
        ArrayList arrayList0 = this.MTH3688(arr_object);
        return arrayList0.isEmpty() ? null : arrayList0.get(0);
    }

    public CLS255 MTH3692(CLS254 ᵔﹶ$ˆٴ0) {
        if(this.FLD1078.contains(ᵔﹶ$ˆٴ0)) {
            return this;
        }
        this.FLD1078.add(ᵔﹶ$ˆٴ0);
        return this;
    }

    public Object MTH3693(Object[] arr_object) {
        ArrayList arrayList0 = this.MTH3694(arr_object);
        return arrayList0.isEmpty() ? null : arrayList0.get(0);
    }

    // 去混淆评级： 低(20)
    public ArrayList MTH3694(Object[] arr_object) {
        return CLS261.MTH3881().MTH4020() ? new ArrayList() : this.MTH3688(arr_object);
    }
}

