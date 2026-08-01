// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ⁱʾ.CLS366;
import b.ﾞˎ.CLS1629.CLS548;
import java.util.ArrayList;

public final class CLS1547 implements CLS548 {
    public final int FLD4809;
    public final ArrayList FLD4810;
    public final ArrayList FLD4811;
    public final CLS366 FLD4812;
    public final ArrayList FLD4813;
    public final ArrayList FLD4814;

    public CLS1547(CLS366 ﾞᐧ0, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3, int v) {
        this.FLD4809 = v;
        this.FLD4812 = ﾞᐧ0;
        this.FLD4811 = arrayList0;
        this.FLD4813 = arrayList1;
        this.FLD4810 = arrayList2;
        this.FLD4814 = arrayList3;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        ArrayList arrayList0 = this.FLD4814;
        ArrayList arrayList1 = this.FLD4810;
        ArrayList arrayList2 = this.FLD4813;
        ArrayList arrayList3 = this.FLD4811;
        CLS366 ﾞᐧ0 = this.FLD4812;
        if(this.FLD4809 == 0) {
            switch(s) {
                case "radio_all": {
                    break;
                }
                case "radio_chatrooms": {
                    arrayList0 = arrayList1;
                    break;
                }
                case "radio_friends": {
                    arrayList0 = arrayList2;
                    break;
                }
                case "radio_public_account": {
                    arrayList0 = arrayList3;
                    break;
                }
                default: {
                    return;
                }
            }
            ﾞᐧ0.MTH5276(arrayList0);
            return;
        }
        switch(s) {
            case "radio_all": {
                break;
            }
            case "radio_chatrooms": {
                arrayList0 = arrayList1;
                break;
            }
            case "radio_friends": {
                arrayList0 = arrayList2;
                break;
            }
            case "radio_public_account": {
                arrayList0 = arrayList3;
                break;
            }
            default: {
                return;
            }
        }
        ﾞᐧ0.MTH5276(arrayList0);
    }
}

