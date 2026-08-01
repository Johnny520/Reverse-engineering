// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import t.ʻˑ.CLS4;
import t.ᵔʾ.CLS139.CLS138;
import t.ⁱʾ.CLS146;

public final class CLS310 implements CLS138 {
    public final int FLD1030;
    public final CLS150 FLD1031;

    public CLS310(CLS150 ʻˑ0, int v) {
        this.FLD1030 = v;
        this.FLD1031 = ʻˑ0;
        super();
    }

    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        CLS150 ʻˑ0 = this.FLD1031;
        switch(this.FLD1030) {
            case 0: {
                ʻˑ0.getClass();
                ʻˑ0.FLD994 = (String)arr_object[0];
                return;
            }
            case 1: {
                ʻˑ0.getClass();
                ʻˑ0.FLD993 = new WeakReference(((Activity)arr_object[0]));
                return;
            }
            case 2: {
                ʻˑ0.getClass();
                ʻˑ0.FLD995 = new WeakReference(((Activity)arr_object[0]));
                return;
            }
            case 3: {
                ʻˑ0.getClass();
                CLS4 ᵔʾ0 = new CLS4(arr_object[0]);
                int v1 = (int)(((Integer)ᵔʾ0.MTH1001()[0]));
                int v2 = (int)(((Integer)ᵔʾ0.MTH1001()[1]));
                Intent intent1 = (Intent)ᵔʾ0.MTH1001()[2];
                if(v2 == -1 && intent1 != null) {
                    HashMap hashMap0 = ʻˑ0.FLD991;
                    if(hashMap0.containsKey(v1)) {
                        CLS146 ᵔʾ1 = (CLS146)hashMap0.get(v1);
                        if(ᵔʾ1 != null) {
                            hashMap0.remove(v1);
                            ᵔʾ1.MTH2177(intent1);
                        }
                    }
                }
                return;
            }
            default: {
                ʻˑ0.getClass();
                Intent intent0 = (Intent)arr_object[0];
                int v = (int)(((Integer)arr_object[1]));
                ʻˑ0.FLD991.put(v, ((CLS146)arr_object[2]));
                Activity activity0 = ʻˑ0.MTH2203();
                if(activity0 != null) {
                    activity0.startActivityForResult(intent0, v);
                }
            }
        }
    }
}

