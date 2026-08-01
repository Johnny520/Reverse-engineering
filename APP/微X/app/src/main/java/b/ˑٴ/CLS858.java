// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS1;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.ⁱᵔ.CLS404;
import java.util.ArrayList;

public final class CLS858 implements CLS1 {
    public final int FLD1358;
    public final String FLD1359;
    public final Object FLD1360;

    public CLS858(CLS818 ᵎⁱ0, String s, int v) {
        this.FLD1358 = v;
        this.FLD1360 = ᵎⁱ0;
        this.FLD1359 = s;
        super();
    }

    public CLS858(String s, ArrayList arrayList0) {
        this.FLD1358 = 2;
        super();
        this.FLD1359 = s;
        this.FLD1360 = arrayList0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS1
    public final void MTH771() {
        String s = this.FLD1359;
        Object object0 = this.FLD1360;
        switch(this.FLD1358) {
            case 0: {
                CLS73 ˈˊ0 = ((CLS818)object0).FLD1232;
                if(!ˈˊ0.MTH1579(s)) {
                    ˈˊ0.MTH1578(s);
                    CLS827 ᵔᐧ0 = new CLS827(((CLS818)object0), s, 5);
                    long v = (long)CLS404.MTH5913("_SELF_ACCEPT_");
                    CLS40.FLD157.MTH1123(((CLS39)ᵔᐧ0), v);
                }
                return;
            }
            case 1: {
                boolean z = ((CLS818)object0).FLD1447.FLD1438.MTH6895("no_confirmation_accept");
                CLS29 ˎᵢ0 = ((CLS818)object0).FLD1445;
                if(!z && ˎᵢ0.MTH938("auto_enable_verification", false)) {
                    int v1 = ˎᵢ0.MTH927(0, "nca2_cnt");
                    ˎᵢ0.MTH922(((int)(v1 + 1)), "nca2_cnt");
                    int v2 = ˎᵢ0.MTH927(0, "nca2_cnt_max");
                    if(v2 != 0 && v1 + 1 >= v2) {
                        try {
                            if(!CLS66.MTH1497()) {
                                CLS66.MTH1360(true);
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                }
                if(ˎᵢ0.MTH938("auto_remark_enable", false)) {
                    CLS827 ᵔᐧ1 = new CLS827(((CLS818)object0), s, 6);
                    CLS40.FLD157.MTH1123(((CLS39)ᵔᐧ1), 5000L);
                }
                ((CLS818)object0).MTH2790(s);
                return;
            }
            default: {
                CLS66.MTH1425(s, "", "wx2", ((ArrayList)object0));
            }
        }
    }
}

