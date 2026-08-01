// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;

public final class CLS1405 implements CLS11 {
    public final CLS1622 FLD4005;
    public final CLS1635 FLD4006;
    public final ArrayList FLD4007;

    public CLS1405(CLS1622 ˑٴ0, ArrayList arrayList0, CLS1635 ﾞᵎ0) {
        this.FLD4005 = ˑٴ0;
        this.FLD4007 = arrayList0;
        this.FLD4006 = ﾞᵎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s1;
        String s = this.FLD4005.MTH7285();
        int v = CLS27.MTH895().MTH927(0, "renameRemarkType");
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList0 = this.FLD4007;
            if(v1 >= arrayList0.size()) {
                break;
            }
            if(this.FLD4006.MTH7444()) {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append(v1 + 1);
                s1 = stringBuilder0.toString();
            }
            else {
                s1 = s;
            }
            CLS78 ˊﾞ0 = (CLS78)arrayList0.get(v1);
            switch(v) {
                case 1: {
                    s1 = "" + s1;
                    break;
                }
                case 2: {
                    StringBuilder stringBuilder1 = CLS182.MTH3483(s1);
                    stringBuilder1.append("");
                    s1 = stringBuilder1.toString();
                }
            }
            if(!CLS426.MTH6126("")) {
                CLS372.MTH5408("", s1);
            }
            else if(CLS27.MTH890("chatroomRenameMethod1")) {
                try {
                    Object object0 = CLS66.MTH1487(CLS27.MTH894("delChatroomClass5"));
                    if(object0 != null) {
                        Object object1 = CLS166.MTH3195(CLS166.MTH3195(object0, CLS27.MTH897("delChatroomMethod_21"), new Object[]{""}), CLS27.MTH897("chatroomRenameMethod1"), new Object[]{"", s1});
                        if(CLS27.MTH890("delChatroomMethod_23")) {
                            CLS166.MTH3195(object1, CLS27.MTH897("delChatroomMethod_23"), new Object[]{null});
                        }
                        CLS166.MTH3195(object1, CLS27.MTH897("delChatroomMethod_24"), new Object[0]);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

