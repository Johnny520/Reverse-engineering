// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.util.Pair;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS38.CLS37;
import b.יﹳ.CLS166;
import b.ﾞˎ.CLS528;

public final class CLS791 implements CLS37 {
    public final int FLD1138;
    public final CLS830 FLD1139;

    public CLS791(CLS830 ᵔᵢ0, int v) {
        this.FLD1138 = v;
        this.FLD1139 = ᵔᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        boolean z = false;
        CLS830 ᵔᵢ0 = this.FLD1139;
        switch(this.FLD1138) {
            case 0: {
                if(!ᵔᵢ0.FLD1447.FLD1407.MTH5947("_config_tts") && ᵔᵢ0.FLD1445.MTH938("tts_enable", true)) {
                    CLS528 ʽי1 = new CLS528();
                    ʽי1.FLD5167 = "7";
                    ʽי1.FLD5165 = "tts_play_as_voice";
                    return Pair.create(CLS27.MTH889("tts_play_as_voice"), "");
                }
                return null;
            }
            case 1: {
                ᵔᵢ0.getClass();
                return ᵔᵢ0.FLD1445.MTH938("tts_shortcut_enable", false) ? Pair.create(CLS27.MTH889("tts_shortcut_enable"), "tts_shortcut") : null;
            }
            case 2: {
                if(ᵔᵢ0.FLD1277 != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            default: {
                ᵔᵢ0.getClass();
                switch(CLS166.MTH3181(arr_object[0], "field_type")) {
                    case 1: 
                    case 0x1000031: 
                    case 0x31000031: {
                        if(ᵔᵢ0.FLD1445.MTH938("tts_enable", true)) {
                            CLS528 ʽי0 = new CLS528();
                            ʽי0.FLD5167 = "6";
                            ʽי0.FLD5165 = "tts";
                            ʽי0.FLD5166 = "editor_voiceplayer_play";
                            return Pair.create(CLS27.MTH889("tts_play_as_voice"), "");
                        }
                        return null;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }
}

