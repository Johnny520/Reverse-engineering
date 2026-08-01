// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1629.CLS548;

public final class CLS1538 implements CLS548 {
    public final int FLD4777;
    public final CLS1625 FLD4778;
    public final int[] FLD4779;

    public CLS1538(int[] arr_v, CLS1625 ـˏ0, int v) {
        this.FLD4777 = v;
        this.FLD4779 = arr_v;
        this.FLD4778 = ـˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        CLS1625 ـˏ0 = this.FLD4778;
        int[] arr_v = this.FLD4779;
        if(this.FLD4777 == 0) {
            switch(s) {
                case "not_show_selected": {
                    arr_v[0] = 3;
                    break;
                }
                case "only_selected": {
                    arr_v[0] = 2;
                    break;
                }
                case "private": {
                    arr_v[0] = 1;
                    ـˏ0.MTH801(8);
                    return;
                }
                case "public": {
                    arr_v[0] = 0;
                    ـˏ0.MTH801(8);
                    return;
                }
                default: {
                    return;
                }
            }
            ـˏ0.MTH801(0);
            return;
        }
        switch(s) {
            case "not_show_selected": {
                arr_v[0] = 3;
                break;
            }
            case "only_selected": {
                arr_v[0] = 2;
                break;
            }
            case "private": {
                arr_v[0] = 1;
                ـˏ0.MTH801(8);
                return;
            }
            case "public": {
                arr_v[0] = 0;
                ـˏ0.MTH801(8);
                return;
            }
            default: {
                return;
            }
        }
        ـˏ0.MTH801(0);
    }
}

