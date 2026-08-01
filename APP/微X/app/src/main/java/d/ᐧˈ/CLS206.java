// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.os.Build.VERSION;
import android.os.HandlerThread;
import d.ˑʽ.CLS38;
import d.ˑʽ.CLS46;
import d.יʻ.CLS62;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS123;

public final class CLS206 implements CLS123 {
    public final int FLD624;

    public CLS206(int v) {
        this.FLD624 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        switch(this.FLD624) {
            case 0: {
                CLS46.FLD233.MTH671();
                return;
            }
            case 1: {
                CLS46.FLD233.MTH671();
                return;
            }
            case 2: {
                CLS46.FLD233.MTH671();
                return;
            }
            case 3: {
                Object[] arr_object = {CLS69.MTH795("donate_thx")};
                CLS62.FLD317.MTH758("showtoast", arr_object);
                String s = CLS69.MTH806("wx_donate_update_check_url");
                CLS38.FLD200.getClass();
                CLS38.MTH612(s, true);
                return;
            }
            case 4: {
                Object[] arr_object1 = {CLS69.MTH795("donate_thx")};
                CLS62.FLD317.MTH758("showtoast", arr_object1);
                String s1 = CLS69.MTH806("wx_donate_update_check_url");
                CLS38.FLD200.getClass();
                CLS38.MTH612(s1, true);
                return;
            }
            case 5: {
                CLS46.FLD233.MTH671();
                return;
            }
            default: {
                HandlerThread handlerThread0 = CLS68.FLD326.FLD325;
                if(handlerThread0 != null) {
                    try {
                        if(handlerThread0.isAlive()) {
                            if(Build.VERSION.SDK_INT >= 18) {
                                handlerThread0.quitSafely();
                                return;
                            }
                            handlerThread0.quit();
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS69.MTH797(throwable0);
                    }
                }
            }
        }
    }
}

