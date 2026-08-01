// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import org.json.JSONObject;
import p.pkg5.CLS23;

public final class CLS188 implements CLS54 {
    public final int FLD367;

    public CLS188(int v) {
        this.FLD367 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg8.CLS55$CLS54
    public final void MTH948(Object[] arr_object) {
        switch(this.FLD367) {
            case 0: {
                CLS44.FLD330 = (HashMap)arr_object[0];
                return;
            }
            case 1: {
                CLS44.FLD326 = (HashMap)arr_object[0];
                return;
            }
            case 2: {
                CLS44.FLD324 = (HashMap)arr_object[0];
                return;
            }
            case 3: {
                CLS53.FLD362.MTH944("core", "unloadFeature", new Object[]{"vidurlparser", "vidurlparser disabled"});
                CLS53.FLD362.MTH941();
                return;
            }
            case 4: {
                CLS43 ʼˉ0 = CLS43.FLD320;
                CLS187 יٴ0 = new CLS187(2);
                long v = (long)CLS23.MTH811();
                if(v == 0L) {
                    ʼˉ0.MTH879(((CLS42)יٴ0));
                    return;
                }
                ʼˉ0.MTH882().postDelayed(new CLS45(((CLS42)יٴ0), 1), v);
                return;
            }
            case 5: {
                CLS43 ʼˉ1 = CLS43.FLD320;
                CLS187 יٴ1 = new CLS187(1);
                long v1 = (long)CLS23.MTH811();
                if(v1 == 0L) {
                    ʼˉ1.MTH880(((CLS42)יٴ1));
                    return;
                }
                if(ʼˉ1.FLD322 == null) {
                    ʼˉ1.FLD322 = new Handler(Looper.getMainLooper());
                }
                ʼˉ1.FLD322.postDelayed(new CLS45(((CLS42)יٴ1), 2), v1);
                return;
            }
            default: {
                try {
                    JSONObject jSONObject0 = (JSONObject)arr_object[0];
                    if(jSONObject0.has("_fapps7")) {
                        CLS44.MTH891().MTH927(jSONObject0.optString("_fapps7"), "_fapps7");
                        CLS48.MTH910();
                    }
                }
                catch(Throwable throwable0) {
                    CLS44.MTH897(throwable0);
                }
            }
        }
    }
}

