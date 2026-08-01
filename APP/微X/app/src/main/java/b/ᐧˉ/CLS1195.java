// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS525;

public final class CLS1195 implements CLS39, CLS378, CLS539 {
    public final int FLD2797;
    public final CLS946 FLD2798;

    public CLS1195(CLS946 ʿ0, int v) {
        this.FLD2797 = v;
        this.FLD2798 = ʿ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        String s = this.FLD2798.FLD2157;
        CLS78 ˊﾞ0 = new CLS78(s, CLS371.FLD3470.MTH5311(s));
        this.FLD2798.FLD1802.add(ˊﾞ0);
        CLS371.FLD3470.MTH5381(this.FLD2798.FLD2157, this.FLD2798.FLD1802);
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2798.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS946 ʿ0 = this.FLD2798;
        switch(this.FLD2797) {
            case 1: {
                ʿ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        Float float0 = Math.max(Float.parseFloat(s), 1.0f);
                        ʿ0.FLD2151.MTH922(float0, "modify_steps_multiplier");
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 2: {
                ʿ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        Integer integer0 = Integer.parseInt(s);
                        ʿ0.FLD2151.MTH922(integer0, "modify_steps_max");
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 3: {
                ʿ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        Integer integer1 = Integer.parseInt(s);
                        ʿ0.FLD2151.MTH922(integer1, "werun_steps");
                        return;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 4: {
                CLS29 ˎᵢ0 = ʿ0.FLD2151;
                if(!TextUtils.isEmpty(s) && CLS502.MTH6934(s, new String[]{","})) {
                    String[] arr_s = s.split(",");
                    try {
                        ˎᵢ0.MTH922(Integer.parseInt(arr_s[0]), "float_vid_width");
                    }
                    catch(Throwable unused_ex) {
                    }
                    try {
                        ˎᵢ0.MTH922(Integer.parseInt(arr_s[1]), "float_vid_height");
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                return;
            }
            case 5: {
                ʿ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    Integer integer2 = Integer.parseInt(s);
                    ʿ0.FLD2151.MTH922(integer2, "max_emoji");
                }
                return;
            }
            default: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(s, "fake_gps");
            }
        }
    }
}

