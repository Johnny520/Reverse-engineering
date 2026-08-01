// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS7;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS403;

public final class CLS740 implements CLS7 {
    public final long FLD931;
    public final CLS629 FLD932;
    public final int FLD933;
    public final String FLD934;
    public final int FLD935;
    public final String FLD936;
    public final long FLD937;
    public final String FLD938;

    public CLS740(CLS629 ʻˋ0, int v, String s, String s1, int v1, String s2, long v2, long v3) {
        this.FLD932 = ʻˋ0;
        this.FLD935 = v;
        this.FLD934 = s;
        this.FLD936 = s1;
        this.FLD933 = v1;
        this.FLD938 = s2;
        this.FLD937 = v2;
        this.FLD931 = v3;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        int v4;
        int v = this.FLD935;
        String s = this.FLD934;
        String s1 = this.FLD936;
        int v1 = this.FLD933;
        String s2 = this.FLD938;
        long v2 = this.FLD937;
        long v3 = this.FLD931;
        CLS629 ʻˋ0 = this.FLD932;
        ʻˋ0.getClass();
        switch(CLS182.MTH3489(0x38EDA1E02B3CD335L, new StringBuilder(), object0)) {
            case "chat_container": {
                v4 = 2;
                break;
            }
            case "chatroom_tags": {
                v4 = 0;
                break;
            }
            case "contact_tags": {
                v4 = 1;
                break;
            }
            default: {
                v4 = -1;
            }
        }
        if(v4 != 0) {
            switch(v4) {
                case 1: {
                    CLS387.MTH5588(((CLS140)ʻˋ0).MTH3042(), ((CLS12)new CLS750(ʻˋ0, v, s, s1, v1, s2, v2, v3, 1)), null);
                    return;
                }
                case 2: {
                    CLS403.MTH5870(((CLS140)ʻˋ0).MTH3042(), null, null, ((CLS12)new CLS750(ʻˋ0, v, s, s1, v1, s2, v2, v3, 2)), false);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        ʻˋ0.MTH2051(v, v1, v2, v3, s, s1, s2);
    }
}

