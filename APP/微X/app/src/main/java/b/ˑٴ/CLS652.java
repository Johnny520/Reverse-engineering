// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ⁱᵔ.CLS502;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS652 implements CLS39 {
    public final int FLD646;
    public final Object[] FLD647;
    public final CLS786 FLD648;

    public CLS652(CLS786 ᐧᵢ0, Object[] arr_object, int v) {
        this.FLD646 = v;
        this.FLD648 = ᐧᵢ0;
        this.FLD647 = arr_object;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object[] arr_object = this.FLD647;
        CLS786 ᐧᵢ0 = this.FLD648;
        switch(this.FLD646) {
            case 0: {
                ᐧᵢ0.getClass();
                ᐧᵢ0.MTH2656(((String)arr_object[0]));
                return;
            }
            case 1: {
                ᐧᵢ0.getClass();
                ᐧᵢ0.MTH2663(((String)arr_object[0]));
                return;
            }
            default: {
                ᐧᵢ0.getClass();
                String s = (String)arr_object[0];
                CLS29 ˎᵢ0 = ᐧᵢ0.FLD1445;
                try {
                    String s1 = ˎᵢ0.MTH925("grab_red_packet_exclude", "");
                    if(CLS502.MTH6934(s1, new String[]{s})) {
                        HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s1)));
                        hashSet0.remove(s);
                        ˎᵢ0.MTH922(TextUtils.join(",", hashSet0), "grab_red_packet_exclude");
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

