// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.util.Pair;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS38.CLS37;
import b.ᐧˉ.CLS182;

public final class CLS676 implements CLS37 {
    public final int FLD730;
    public final CLS864 FLD731;

    public CLS676(CLS864 ﹶ0, int v) {
        this.FLD730 = v;
        this.FLD731 = ﹶ0;
        super();
    }

    // 去混淆评级： 低(36)
    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        CLS864 ﹶ0 = this.FLD731;
        switch(this.FLD730) {
            case 0: {
                return Boolean.valueOf(ﹶ0.FLD1386.contains(arr_object[0]));
            }
            case 1: {
                ﹶ0.getClass();
                return ﹶ0.FLD1445.MTH938("encrypted_mode_enable", false) ? Pair.create(CLS27.MTH889("send_encrypted_msg"), "send_encrypted") : null;
            }
            case 2: {
                ﹶ0.getClass();
                return !ﹶ0.FLD1445.MTH938("tts_send_mode_enable", false) || !CLS21.FLD76.MTH830("hasTTS", new Object[0]) ? null : Pair.create(CLS27.MTH889("send_tts_msg"), "send_tts");
            }
            case 3: {
                ﹶ0.getClass();
                return !ﹶ0.FLD1445.MTH938("tail_mode_enable", false) || (!ﹶ0.FLD1447.FLD1438.MTH6895("tail_mode") || !CLS27.MTH890("ChatQuoteItemViewHolderClass_1")) ? null : Pair.create(CLS27.MTH889("send_tail_msg"), "send_tail");
            }
            case 4: {
                ﹶ0.getClass();
                if(ﹶ0.FLD1445.MTH938("autorecall", false)) {
                    return ﹶ0.FLD1386.contains(ﹶ0.FLD1447.FLD1434) ? Pair.create(CLS27.MTH889("disable_autorecallmode"), "autorecall") : Pair.create(CLS27.MTH889("enable_autorecallmode"), "autorecall");
                }
                return null;
            }
            case 5: {
                ﹶ0.getClass();
                if(ﹶ0.FLD1445.MTH938("encrypted_mode_enable", false)) {
                    return ﹶ0.FLD1390.contains(ﹶ0.FLD1447.FLD1434) ? Pair.create(CLS27.MTH889("disable_encryptedmode"), "encrypted") : Pair.create(CLS27.MTH889("enable_encryptedmode"), "encrypted");
                }
                return null;
            }
            case 6: {
                ﹶ0.getClass();
                if(ﹶ0.FLD1445.MTH938("auto_translate_mode_enable", false)) {
                    return ﹶ0.FLD1383.contains(ﹶ0.FLD1447.FLD1434) ? Pair.create(CLS27.MTH889("disable_autotranslatemode"), "autotranslate") : Pair.create(CLS27.MTH889("enable_autotranslatemode"), "autotranslate");
                }
                return null;
            }
            case 7: {
                ﹶ0.getClass();
                if(ﹶ0.FLD1445.MTH938("tts_send_mode_enable", false)) {
                    return !CLS21.FLD76.MTH830("hasTTS", new Object[0]) || !ﹶ0.FLD1382.contains(ﹶ0.FLD1447.FLD1434) ? Pair.create(CLS27.MTH889("tts_start"), "tts") : Pair.create(CLS27.MTH889("tts_stop"), "tts");
                }
                return null;
            }
            case 8: {
                ﹶ0.getClass();
                if(ﹶ0.FLD1445.MTH938("auto_transcribe_mode_enable", false)) {
                    return ﹶ0.FLD1384.contains(ﹶ0.FLD1447.FLD1434) ? Pair.create(CLS27.MTH889("disable_autotranscribemode"), "autotranscribe") : Pair.create(CLS27.MTH889("enable_autotranscribemode"), "autotranscribe");
                }
                return null;
            }
            default: {
                ﹶ0.getClass();
                if(ﹶ0.FLD1445.MTH938("tail_mode_enable", false)) {
                    CLS139 ﹶʼ0 = ﹶ0.FLD1447;
                    if(ﹶʼ0.FLD1438.MTH6895("tail_mode") && !CLS182.MTH3470(0x38ECD66E2B3CD335L)) {
                        return ﹶ0.FLD1389.contains(ﹶʼ0.FLD1434) ? Pair.create(CLS27.MTH889("disable_tailmode"), "tail") : Pair.create(CLS27.MTH889("enable_tailmode"), "tail");
                    }
                }
                return null;
            }
        }
    }
}

