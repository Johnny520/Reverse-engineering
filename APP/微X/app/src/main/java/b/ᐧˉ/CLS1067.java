// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS412;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1067 implements CLS39, CLS378, CLS538, CLS539 {
    public final int FLD2288;
    public final CLS928 FLD2289;

    public CLS1067(CLS928 ʼᴵ0, int v) {
        this.FLD2288 = v;
        this.FLD2289 = ʼᴵ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS928 ʼᴵ0 = this.FLD2289;
        ʼᴵ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        CLS371.FLD3470.MTH5293(ʼᴵ0.FLD2157, arrayList0);
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!hashSet0.contains("")) {
                hashSet0.add("");
                ʼᴵ0.FLD1725.add(ˊﾞ0);
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2289.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS928 ʼᴵ0 = this.FLD2289;
        switch(this.FLD2288) {
            case 0: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(s, "encrypted_tag");
                return;
            }
            case 1: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(s, "auto_container_pattern");
                return;
            }
            case 3: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(s, "custom_nudging_original");
                return;
            }
            case 4: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(s, "custom_nudging_modified");
                return;
            }
            case 6: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(s, "show_time_detailed_pattern");
                return;
            }
            case 7: {
                ʼᴵ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    try {
                        double f = Double.parseDouble(s);
                        ʼᴵ0.FLD2151.MTH922(f, "tailmode_random_value");
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 10: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(s, "chat_filter");
                return;
            }
            default: {
                ʼᴵ0.getClass();
                ʼᴵ0.FLD2151.MTH922(s, "chat_filtered_msg");
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        CLS928 ʼᴵ0 = this.FLD2289;
        if(this.FLD2288 == 2) {
            ʼᴵ0.getClass();
            ʼᴵ0.FLD2151.MTH922(CLS412.MTH6007(1000, 60000, ((int)v)), "voice_length");
            return;
        }
        ʼᴵ0.getClass();
        ʼᴵ0.FLD2151.MTH922(((int)v), "pat_all_delay");
    }
}

