// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Bundle;
import android.util.SparseArray;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˊﾞ.CLS101;
import b.יᐧ.CLS151.CLS149;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS466;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;
import java.io.File;
import java.util.HashMap;

public final class CLS632 implements CLS149 {
    public final int FLD565;
    public final File FLD566;

    public CLS632(int v, File file0) {
        this.FLD565 = v;
        this.FLD566 = file0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.יᐧ.CLS151$CLS149
    public final void MTH3132(int v, Object object0, SparseArray sparseArray0, CLS1274 ﾞˎ0) {
        File file0 = this.FLD566;
        switch(this.FLD565) {
            case 0: {
                long v1 = ((Bundle)object0).getLong("msgSvrId");
                long v2 = ((Bundle)object0).getLong("msgId");
                int v3 = ((Bundle)object0).getInt("isSend");
                String s1 = ((Bundle)object0).getString("imgPath");
                CLS466.MTH6539(v3, v2, v1, ((CLS0)new CLS755(file0, sparseArray0, v, ((Bundle)object0), ﾞˎ0)), s1);
                return;
            }
            case 1: {
                String s2 = ((Bundle)object0).getString("imgPath");
                CLS466.MTH6507(s2, ((CLS12)new CLS797(v, ((Bundle)object0), sparseArray0, ﾞˎ0, file0, s2)), false, 0);
                return;
            }
            case 2: {
                String s3 = ((Bundle)object0).getString("content");
                long v4 = ((Bundle)object0).getLong("msgId");
                HashMap hashMap0 = CLS392.MTH5633(s3, "msg");
                switch(Integer.parseInt(((String)hashMap0.get(".msg.appmsg.type")))) {
                    case 6: 
                    case 74: {
                        CLS66.MTH1470(v4, hashMap0, ((CLS17)new CLS737(file0, sparseArray0, v, ﾞˎ0, 3)));
                        return;
                    }
                    default: {
                        sparseArray0.put(v, ((Bundle)object0));
                        ﾞˎ0.MTH774();
                        return;
                    }
                }
            }
            case 3: {
                CLS69 ʾᵢ0 = new CLS69(CLS66.MTH1483(((Bundle)object0).getString("imgPath")));
                if(CLS31.MTH1029(ʾᵢ0)) {
                    String s4 = ʾᵢ0.MTH1555();
                    if(CLS27.MTH895().MTH938("export_chat_transcodevoice", false)) {
                        String s5 = ʾᵢ0.MTH1563();
                        String s6 = new File(file0, CLS182.MTH3475(4102163508978570037L, CLS182.MTH3483(s4.replace(".amr", "")))).getAbsolutePath();
                        CLS557 ˆٴ0 = CLS101.MTH1943(s5);
                        if(ˆٴ0 != null) {
                            new CLS559(ˆٴ0).MTH7485(s6);
                        }
                    }
                    else {
                        CLS31.MTH1009(ʾᵢ0, new File(file0, s4));
                    }
                }
                sparseArray0.put(v, ((Bundle)object0));
                ﾞˎ0.MTH774();
                return;
            }
            default: {
                String s = ((Bundle)object0).getString("imgPath");
                CLS66.MTH1396(new File(file0, CLS182.MTH3475(0x38EDCF342B3CD335L, CLS182.MTH3483(s))), s);
                sparseArray0.put(v, ((Bundle)object0));
                ﾞˎ0.MTH774();
            }
        }
    }
}

