// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import p.pkg11.CLS195;
import p.pkg11.CLS68;
import p.pkg11.CLS72;
import p.pkg5.CLS24;
import p.pkg5.CLS25;
import p.pkg5.CLS31;

public final class CLS185 implements CLS42 {
    public final int FLD335;
    public final Object FLD336;
    public final Object FLD337;

    public CLS185(Object object0, Object object1, int v) {
        this.FLD335 = v;
        this.FLD337 = object0;
        this.FLD336 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg8.CLS43$CLS42
    public final void run() {
        Object object0 = this.FLD336;
        Object object1 = this.FLD337;
        switch(this.FLD335) {
            case 0: {
                ((CLS54)object1).MTH948(((Object[])object0));
                return;
            }
            case 1: {
                HashSet hashSet0 = new HashSet();
                if(!TextUtils.isEmpty(((String)object1))) {
                    hashSet0.addAll(Arrays.asList(((String)object1).split(";")));
                }
                if(!TextUtils.isEmpty(((String)object0))) {
                    hashSet0.addAll(Arrays.asList(((String)object0).split(";")));
                }
                if(!hashSet0.isEmpty()) {
                    String s = ((CLS31)CLS43.FLD320.MTH883(CLS31.class)).MTH836();
                    for(Object object2: hashSet0) {
                        if(s.contains(((String)object2).trim())) {
                            CLS53.FLD362.MTH936("disable", new Object[0]);
                            CLS53.FLD362.MTH944("core", "unloadFeature", new Object[]{"vidurlparser"});
                            CLS53.FLD362.MTH941();
                            return;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return;
            }
            case 2: {
                CLS195 ᐧᴵ0 = new CLS195(((CLS72)object0), CLS24.MTH813(((CLS68)object1).FLD420), 0);
                CLS43.FLD320.MTH880(((CLS42)ᐧᴵ0));
                return;
            }
            default: {
                ((CLS25)object1).getClass();
                String[] arr_s = ((String)object0).split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    ((CLS25)object1).FLD284.MTH1128(arr_s[v], Boolean.TRUE);
                }
            }
        }
    }
}

