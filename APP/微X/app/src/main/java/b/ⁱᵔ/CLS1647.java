// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS563;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1629;
import java.util.Random;

public final class CLS1647 implements CLS563 {
    public final int FLD3811;
    public final CLS1629 FLD3812;
    public final CLS1622 FLD3813;
    public final CLS1629 FLD3814;
    public final CLS1629 FLD3815;

    public CLS1647(int v, CLS1629 ⁱˉ0, CLS1622 ˑٴ0, CLS1629 ⁱˉ1, CLS1629 ⁱˉ2) {
        this.FLD3811 = v;
        this.FLD3814 = ⁱˉ0;
        this.FLD3813 = ˑٴ0;
        this.FLD3815 = ⁱˉ1;
        this.FLD3812 = ⁱˉ2;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            boolean z = this.FLD3814.MTH7371("radio_multiple");
            int v = this.FLD3811;
            if(!z) {
                if(v == 49) {
                    Object[] arr_object = {49, Integer.valueOf(this.FLD3815.MTH7373())};
                    CLS21.FLD76.MTH818("sendDice", arr_object);
                    return;
                }
                Object[] arr_object1 = {v, Integer.valueOf(this.FLD3812.MTH7373())};
                CLS21.FLD76.MTH818("sendDice", arr_object1);
                return;
            }
            String s = this.FLD3813.MTH7285();
            if(TextUtils.isEmpty(s)) {
                return;
            }
            char[] arr_c = s.toCharArray();
            if(v == 49) {
                for(int v1 = 0; v1 < arr_c.length; ++v1) {
                    int v2 = Math.min(Math.max(Integer.parseInt(("" + arr_c[v1])), 1), 3);
                    CLS21.FLD76.MTH818("sendDice", new Object[]{49, ((int)(v2 - 1))});
                }
                return;
            }
        label_23:
            for(int v3 = 0; v3 < arr_c.length; ++v3) {
                int v4 = Math.min(Math.max(Integer.parseInt(("" + arr_c[v3])), 1), 6);
                CLS21.FLD76.MTH818("sendDice", new Object[]{v, ((int)(v4 - 1))});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            if(true) {
                return;
            }
            goto label_23;
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS563
    public final void MTH775() {
        Object[] arr_object = {this.FLD3811, new Random(System.currentTimeMillis()).nextInt((this.FLD3811 == 49 ? 2 : 5) + 1)};
        CLS21.FLD76.MTH818("sendDice", arr_object);
    }
}

