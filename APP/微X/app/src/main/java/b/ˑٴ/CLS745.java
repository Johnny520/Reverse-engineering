// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS466;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class CLS745 implements CLS3 {
    public final int FLD952;
    public final String FLD953;
    public final CLS629 FLD954;

    public CLS745(CLS629 ʻˋ0, String s, int v) {
        this.FLD952 = v;
        this.FLD954 = ʻˋ0;
        this.FLD953 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD953;
        CLS629 ʻˋ0 = this.FLD954;
        switch(this.FLD952) {
            case 0: {
                ʻˋ0.getClass();
                CLS679 ˈʽ0 = new CLS679(ʻˋ0, 6);
                List list0 = CLS66.MTH1508(s);
                String s1 = CLS370.MTH5289(4102093651335500597L);
                CLS466.MTH6529(((CLS6)ˈʽ0), list0, ʻˋ0.FLD1445.MTH938(s1, false));
                return;
            }
            case 1: {
                ʻˋ0.getClass();
                CLS679 ˈʽ1 = new CLS679(ʻˋ0, 5);
                List list1 = CLS66.MTH1508(s);
                String s2 = CLS370.MTH5289(4102093402227397429L);
                CLS466.MTH6529(((CLS6)ˈʽ1), list1, ʻˋ0.FLD1445.MTH938(s2, false));
                return;
            }
            case 2: {
                ʻˋ0.getClass();
                String s3 = CLS66.MTH1410(s);
                String s4 = CLS370.MTH5289(4102126232957408053L);
                File file0 = new File(ʻˋ0.MTH2037(s3, ʻˋ0.FLD1445.MTH938(s4, false)));
                if(CLS31.MTH1001(file0)) {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(file0.getAbsolutePath());
                    CLS466.MTH6536(null, arrayList0);
                }
                return;
            }
            default: {
                CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS670(ʻˋ0, s)), -1);
            }
        }
    }
}

