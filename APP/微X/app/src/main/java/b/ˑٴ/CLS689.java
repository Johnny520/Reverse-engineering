// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS426;
import java.util.Date;

public final class CLS689 implements CLS3 {
    public final CLS794 FLD776;
    public final String FLD777;
    public final String FLD778;
    public final long FLD779;

    public CLS689(CLS794 ᴵʽ0, String s, String s1, long v) {
        this.FLD776 = ᴵʽ0;
        this.FLD778 = s;
        this.FLD777 = s1;
        this.FLD779 = v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        boolean z;
        String s = this.FLD778;
        String s1 = this.FLD777;
        long v = this.FLD779;
        CLS794 ᴵʽ0 = this.FLD776;
        ᴵʽ0.getClass();
        CLS61 ﾞٴ0 = CLS794.MTH2698();
        String s2 = CLS182.MTH3475(0x38ECA0052B3CD335L, CLS182.MTH3483(s));
        CLS29 ˎᵢ0 = ᴵʽ0.FLD1445;
        if(ˎᵢ0.MTH938(s2, false)) {
            int v1 = CLS34.MTH1064(4101829459307189045L, CLS182.MTH3483(s), ˎᵢ0, 3);
            int v2 = CLS794.MTH2694().MTH1146(v1, v, s, s1, "_qrcode_BANWARNING_");
            z = v2 > v1 - 1;
            if(!z) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(ˎᵢ0.MTH925(CLS182.MTH3475(0x38ECA0DE2B3CD335L, CLS182.MTH3483(s)), CLS27.MTH889("warning_default_text")));
                stringBuilder0.append(" (");
                stringBuilder0.append(v2 + 1);
                stringBuilder0.append("/");
                stringBuilder0.append(v1);
                String s3 = CLS182.MTH3475(0x38ECA0922B3CD335L, stringBuilder0);
                String s4 = CLS426.MTH6125(s, s1);
                CLS66.MTH1393(s, s4 + s3, s1);
            }
        }
        else {
            z = true;
        }
        if(z) {
            String s5 = ˎᵢ0.MTH925(CLS182.MTH3475(0x38ECA0942B3CD335L, CLS182.MTH3483(s)), "");
            String s6 = CLS182.MTH3473(4101830094962348853L, ˎᵢ0, CLS182.MTH3475(4101830013357970229L, CLS182.MTH3483(s)));
            ﾞٴ0.MTH1331(s, s1, CLS27.MTH904(), s5, s6);
            if(ˎᵢ0.MTH938(s + "_chatroom_ban_sendmsg_enable", true)) {
                String s7 = CLS182.MTH3476(CLS426.MTH6125(s, s1), s6);
                if(ﾞٴ0.FLD186 && !TextUtils.isEmpty(s5)) {
                    long v3 = Long.parseLong(s5, 16);
                    StringBuilder stringBuilder2 = CLS182.MTH3483(s7);
                    stringBuilder2.append("\n");
                    s7 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{ᴵʽ0.FLD1152.format(new Date(v3 + System.currentTimeMillis()))}, stringBuilder2);
                }
                CLS66.MTH1393(s, s7, s1);
            }
            CLS426.MTH6132(s, s1, false);
        }
    }
}

