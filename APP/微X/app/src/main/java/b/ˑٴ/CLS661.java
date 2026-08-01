// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS1191;
import b.ⁱᵔ.CLS1525;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import java.util.ArrayList;

public final class CLS661 implements CLS12 {
    public final CLS629 FLD673;
    public final long FLD674;
    public final int FLD675;
    public final String FLD676;

    public CLS661(CLS629 ʻˋ0, int v, long v1, String s) {
        this.FLD673 = ʻˋ0;
        this.FLD675 = v;
        this.FLD674 = v1;
        this.FLD676 = s;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        String s1;
        Activity activity0;
        CLS629 ʻˋ0 = this.FLD673;
        ʻˋ0.getClass();
        try {
            int v = this.FLD675;
            long v1 = this.FLD674;
            String s = this.FLD676;
            switch(((int)(((Integer)object0)))) {
                case 20000: {
                    switch(v) {
                        case 3: {
                            goto label_17;
                        }
                        case 43: 
                        case 62: {
                            goto label_9;
                        }
                    }
                    activity0 = ((CLS140)ʻˋ0).MTH3042();
                    s1 = "sns_forward_not_supported";
                    CLS412.MTH6014(activity0, CLS27.MTH889(s1));
                    return;
                    try {
                    label_9:
                        CLS466.MTH6507(s, ((CLS12)new CLS1525(1, s)), true, 0);
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                    return;
                label_17:
                    String s2 = ʻˋ0.FLD1444.MTH5319(v1);
                    if(!TextUtils.isEmpty(s2)) {
                        ArrayList arrayList0 = new ArrayList();
                        arrayList0.add(CLS66.MTH1410(s2));
                        CLS466.MTH6536(null, arrayList0);
                        return;
                    }
                    break;
                }
                case 20001: {
                    switch(v) {
                        case 3: {
                            CLS466.MTH6503(CLS66.MTH1410(CLS371.FLD3470.MTH5319(v1)), "image/jpeg");
                            return;
                        }
                        case 43: 
                        case 62: {
                            CLS466.MTH6507(s, ((CLS12)new CLS1191(1)), true, 0);
                            return;
                        }
                        default: {
                            activity0 = ((CLS140)ʻˋ0).MTH3042();
                            s1 = "sns_share_not_supported";
                            break;
                        }
                    }
                    CLS412.MTH6014(activity0, CLS27.MTH889(s1));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

