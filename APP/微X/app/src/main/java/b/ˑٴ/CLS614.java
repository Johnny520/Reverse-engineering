// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Bundle;
import b.ʻˑ.CLS2;
import b.ˈˊ.CLS610;
import b.יᐧ.CLS151.CLS149;
import b.יᐧ.CLS151;
import b.יﹳ.CLS166;
import b.ᵔʾ.CLS1225;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS426;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class CLS614 implements CLS2 {
    public final List FLD514;
    public final CLS629 FLD515;

    public CLS614(CLS629 ʻˋ0, AbstractList abstractList0) {
        this.FLD515 = ʻˋ0;
        this.FLD514 = abstractList0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            int v = CLS404.MTH5907();
            CLS151 ˊﾞ0 = new CLS151();
            ˊﾞ0.FLD1544 = new CLS838(this, arrayList0, v, 1);
            CLS610 ﾞٴ0 = new CLS610(16);
            CLS610 ﾞٴ1 = new CLS610(17);
            CLS610 ﾞٴ2 = new CLS610(18);
            ˊﾞ0.MTH3138(1, ((CLS149)new CLS610(19)));
            ˊﾞ0.MTH3138(3, ((CLS149)new CLS610(20)));
            ˊﾞ0.MTH3138(34, ((CLS149)new CLS610(21)));
            ˊﾞ0.MTH3138(42, ((CLS149)new CLS610(22)));
            ˊﾞ0.MTH3138(0x2F, ((CLS149)new CLS610(23)));
            ˊﾞ0.MTH3135(((CLS149)ﾞٴ0), new int[]{0x31000031, 0x1000031});
            ˊﾞ0.MTH3135(((CLS149)ﾞٴ1), new int[]{62, 43});
            ˊﾞ0.MTH3135(((CLS149)ﾞٴ2), new int[]{49, 0x2D000031, 0x3A000031, 0x41000031, 0x3E000031, 0x55000031, 0x54000031});
            ˊﾞ0.FLD1540 = new CLS1225(12);
            ArrayList arrayList1 = new ArrayList();
            HashSet hashSet0 = new HashSet();
            for(int v1 = 0; true; ++v1) {
                List list0 = this.FLD514;
                if(v1 >= list0.size()) {
                    break;
                }
                Object object0 = list0.get(v1);
                int v2 = CLS166.MTH3181(object0, "field_type");
                String s2 = (String)CLS166.MTH3194(object0, "field_content");
                String s3 = (String)CLS166.MTH3194(object0, "field_talker");
                int v3 = CLS166.MTH3181(object0, "field_isSend");
                String s4 = (String)CLS166.MTH3194(object0, "field_imgPath");
                String s5 = CLS426.MTH6106(v3, s2, s3);
                long v4 = CLS166.MTH3185(object0, "field_msgSvrId");
                long v5 = CLS166.MTH3185(object0, "field_msgId");
                Bundle bundle0 = new Bundle();
                bundle0.putInt("type", v2);
                bundle0.putInt("isSend", v3);
                bundle0.putString("content", s2);
                bundle0.putString("stripContent", s5);
                bundle0.putString("talker", s3);
                bundle0.putString("imgPath", s4);
                bundle0.putLong("msgSvrId", v4);
                bundle0.putLong("msgId", v5);
                if(!hashSet0.contains(v5) && ˊﾞ0.FLD1542.containsKey(v2)) {
                    hashSet0.add(v5);
                    arrayList1.add(bundle0);
                }
            }
            for(int v6 = 0; v6 < arrayList1.size(); ++v6) {
                Bundle bundle1 = (Bundle)arrayList1.get(v6);
                ˊﾞ0.MTH3134(bundle1.getInt("type"), bundle1);
            }
            ˊﾞ0.MTH3137();
        }
    }
}

