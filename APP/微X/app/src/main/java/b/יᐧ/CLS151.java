// Decompiled by JEB v5.42.0.202606242140

package b.יᐧ;

import android.os.Bundle;
import android.util.SparseArray;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˑٴ.CLS737;
import b.ᵔʾ.CLS1225;
import b.ⁱʾ.CLS1274;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS151 {
    public interface CLS148 {
        void MTH3131(SparseArray arg1);
    }

    public interface CLS149 {
        void MTH3132(int arg1, Object arg2, SparseArray arg3, CLS1274 arg4);
    }

    public interface CLS150 {
    }

    public final ConcurrentHashMap FLD1539;
    public CLS150 FLD1540;
    public final SparseArray FLD1541;
    public final HashMap FLD1542;
    public final ArrayList FLD1543;
    public CLS148 FLD1544;

    public CLS151() {
        this.FLD1542 = new HashMap();
        this.FLD1541 = new SparseArray();
        this.FLD1539 = new ConcurrentHashMap();
        this.FLD1543 = new ArrayList();
    }

    public final void MTH3134(int v, Bundle bundle0) {
        Number number0 = this.MTH3136(bundle0);
        this.FLD1539.put(number0, v);
        this.FLD1543.add(bundle0);
    }

    public final void MTH3135(CLS149 ˊﾞ$ٴـ0, int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            this.MTH3138(arr_v[v], ˊﾞ$ٴـ0);
        }
    }

    public final Number MTH3136(Object object0) {
        CLS150 ˊﾞ$ᵔʾ0 = this.FLD1540;
        if(ˊﾞ$ᵔʾ0 != null) {
            try {
                return ((CLS1225)ˊﾞ$ᵔʾ0).MTH4646(object0);
            }
            catch(Throwable unused_ex) {
            }
        }
        return object0.hashCode();
    }

    public final void MTH3137() {
        ArrayList arrayList0 = this.FLD1543;
        if(arrayList0.isEmpty()) {
            return;
        }
        for(int v = 0; v < arrayList0.size(); ++v) {
            Object object0 = arrayList0.get(v);
            ConcurrentHashMap concurrentHashMap0 = this.FLD1539;
            Integer integer0 = (int)(((Integer)concurrentHashMap0.get(this.MTH3136(object0))));
            CLS149 ˊﾞ$ٴـ0 = (CLS149)this.FLD1542.get(integer0);
            if(ˊﾞ$ٴـ0 == null) {
                concurrentHashMap0.remove(this.MTH3136(object0));
            }
            else {
                CLS737 ˑٴ0 = new CLS737(this, ˊﾞ$ٴـ0, v, object0, 8);
                CLS40.FLD157.MTH1124(((CLS39)ˑٴ0));
            }
        }
    }

    public final void MTH3138(int v, CLS149 ˊﾞ$ٴـ0) {
        this.FLD1542.put(v, ˊﾞ$ٴـ0);
    }
}

