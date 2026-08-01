// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS404;
import b.ﾞˎ.CLS1616.CLS524;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;

public final class CLS1118 implements CLS524, CLS538, CLS539 {
    public final int FLD2500;
    public final String FLD2501;
    public final CLS1030 FLD2502;

    public CLS1118(CLS1030 ˎᵢ0, String s, int v) {
        this.FLD2500 = v;
        this.FLD2502 = ˎᵢ0;
        this.FLD2501 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        long v;
        long v1;
        String s1 = this.FLD2501;
        CLS1030 ˎᵢ0 = this.FLD2502;
        switch(this.FLD2500) {
            case 2: {
                String s3 = CLS182.MTH3475(4100980653510415157L, CLS34.MTH1066(ˎᵢ0, s1));
                ˎᵢ0.FLD2151.MTH922(s, s3);
                return;
            }
            case 3: {
                String s4 = CLS182.MTH3475(4100980954158125877L, CLS34.MTH1066(ˎᵢ0, s1));
                ˎᵢ0.FLD2151.MTH922(s, s4);
                return;
            }
            case 5: {
                String s5 = CLS182.MTH3475(0x38E99F882B3CD335L, CLS34.MTH1066(ˎᵢ0, s1));
                ˎᵢ0.FLD2151.MTH922(s, s5);
                return;
            }
            case 6: {
                ˎᵢ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        Integer integer0 = Integer.parseInt(s);
                        ˎᵢ0.FLD2151.MTH922(integer0, s1 + "autoreply_max_count");
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 7: {
                ˎᵢ0.getClass();
                switch(CLS404.MTH5890(s1)) {
                    case "ibot_cloud": {
                        v1 = 4101000229971350325L;
                        break;
                    }
                    case "mly_bot": {
                        v1 = 4100999727460176693L;
                        break;
                    }
                    case "turing_robot": {
                        v1 = 4101000174136775477L;
                        break;
                    }
                    default: {
                        return;
                    }
                }
                String s6 = CLS370.MTH5289(v1);
                ˎᵢ0.FLD2151.MTH922(s, s6);
                return;
            }
            case 8: {
                String s7 = CLS182.MTH3475(4100972432943010613L, CLS34.MTH1066(ˎᵢ0, s1));
                ˎᵢ0.FLD2151.MTH922(s, s7);
                return;
            }
            case 9: {
                String s8 = CLS182.MTH3475(4100972355633599285L, CLS34.MTH1066(ˎᵢ0, s1));
                ˎᵢ0.FLD2151.MTH922(s, s8);
                return;
            }
            case 10: {
                ˎᵢ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    String s9 = CLS182.MTH3475(4100972274029220661L, CLS182.MTH3483(s1));
                    Integer integer1 = Integer.parseInt(s);
                    ˎᵢ0.FLD2151.MTH922(integer1, s9);
                }
                return;
            }
            default: {
                ˎᵢ0.getClass();
                switch(CLS404.MTH5890(s1)) {
                    case "ibot_cloud": {
                        v = 4100996209881961269L;
                        break;
                    }
                    case "mly_bot": {
                        v = 4100996244241699637L;
                        break;
                    }
                    case "openai": {
                        v = 4100996338730980149L;
                        break;
                    }
                    case "turing_robot": {
                        v = 4100996166932288309L;
                        break;
                    }
                    case "weixin_aibot": {
                        v = 4100996274306470709L;
                        break;
                    }
                    case "welm": {
                        v = 4100996381680653109L;
                        break;
                    }
                    default: {
                        return;
                    }
                }
                String s2 = CLS370.MTH5289(v);
                ˎᵢ0.FLD2151.MTH922(s, s2);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1616$CLS524
    public final void MTH7175(long v, long v1) {
        this.FLD2502.getClass();
        String s = CLS34.MTH1074(new StringBuilder(), this.FLD2501, 4100981327820280629L);
        this.FLD2502.FLD2151.MTH922(v / 1000L + "," + v1 / 1000L, s);
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        long v1;
        long v2;
        String s = this.FLD2501;
        CLS1030 ˎᵢ0 = this.FLD2502;
        switch(this.FLD2500) {
            case 0: {
                String s2 = CLS182.MTH3475(4100981430899495733L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(((int)v), s2);
                return;
            }
            case 4: {
                String s3 = CLS182.MTH3475(4100980769474532149L, CLS34.MTH1066(ˎᵢ0, s));
                ˎᵢ0.FLD2151.MTH922(((int)v), s3);
                return;
            }
            case 11: {
                ˎᵢ0.getClass();
                switch(CLS404.MTH5890(s)) {
                    case "chatgpt_for_bot": {
                        v2 = 4100975100117701429L;
                        break;
                    }
                    case "ibot_cloud": {
                        v2 = 4100974558951822133L;
                        break;
                    }
                    case "mly_bot": {
                        v2 = 4100974662031037237L;
                        break;
                    }
                    case "openai": {
                        v2 = 4100975435125150517L;
                        break;
                    }
                    case "turing_robot": {
                        v2 = 4100974447282672437L;
                        break;
                    }
                    case "weixin_aibot": {
                        v2 = 4100975310571098933L;
                        break;
                    }
                    case "welm": {
                        v2 = 4100974997038486325L;
                        break;
                    }
                    default: {
                        return;
                    }
                }
                String s4 = CLS370.MTH5289(v2);
                ˎᵢ0.FLD2151.MTH922(((int)v), s4);
                return;
            }
            default: {
                ˎᵢ0.getClass();
                switch(CLS404.MTH5890(s)) {
                    case "chatgpt_for_bot": {
                        v1 = 4100974009196008245L;
                        break;
                    }
                    case "ibot_cloud": {
                        v1 = 4100974146634961717L;
                        break;
                    }
                    case "mly_bot": {
                        v1 = 4100974223944373045L;
                        break;
                    }
                    case "openai": {
                        v1 = 4100974395743064885L;
                        break;
                    }
                    case "turing_robot": {
                        v1 = 4100995501212357429L;
                        break;
                    }
                    case "weixin_aibot": {
                        v1 = 4100974296958817077L;
                        break;
                    }
                    case "welm": {
                        v1 = 0x38E996102B3CD335L;
                        break;
                    }
                    default: {
                        return;
                    }
                }
                String s1 = CLS370.MTH5289(v1);
                ˎᵢ0.FLD2151.MTH922(((int)v), s1);
            }
        }
    }
}

