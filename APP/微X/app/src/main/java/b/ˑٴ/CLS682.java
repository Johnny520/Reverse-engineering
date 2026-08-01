// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS42;
import b.ˆʿ.CLS61;
import b.ⁱᵔ.CLS426;

public final class CLS682 implements CLS39 {
    public final int FLD750;
    public final String FLD751;
    public final String FLD752;
    public final CLS794 FLD753;
    public final String FLD754;
    public final String FLD755;
    public final String FLD756;

    public CLS682(CLS794 ᴵʽ0, String s, String s1, String s2, String s3, String s4, int v) {
        this.FLD750 = v;
        this.FLD753 = ᴵʽ0;
        this.FLD752 = s;
        this.FLD754 = s1;
        this.FLD751 = s2;
        this.FLD756 = s3;
        this.FLD755 = s4;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS794 ᴵʽ0 = this.FLD753;
        boolean z = true;
        if(this.FLD750 == 0) {
            String s = this.FLD752;
            String s1 = this.FLD754;
            String s2 = this.FLD751;
            String s3 = this.FLD756;
            String s4 = this.FLD755;
            CLS61 ﾞٴ0 = CLS794.MTH2698();
            try {
                boolean z1 = ᴵʽ0.FLD1445.MTH938(s + "_autoban_enable", false) && ᴵʽ0.FLD1445.MTH938(s + "_mod_invite_only", false);
                boolean z2 = ᴵʽ0.FLD1445.MTH938(s + "_mod_invite_only_kickboth", false);
                boolean z3 = (z1 || z2) && !TextUtils.isEmpty(s1) && !s1.equals(CLS27.MTH904()) && !CLS426.MTH6118(s, s1) && !ﾞٴ0.MTH1302(s, s1);
                boolean z6 = false;
                if(TextUtils.isEmpty(s2) || s2.equals(CLS27.MTH904())) {
                    z6 = true;
                }
                else if(!z1 && !z2 || !z3) {
                    z6 = true;
                    if(!CLS426.MTH6118(s, s1) && ﾞٴ0.MTH1304(s, s2)) {
                        CLS426.MTH6132(s, s2, false);
                        return;
                    }
                }
                if(z6) {
                    CLS42 ʾᵢ0 = CLS794.MTH2694();
                    ʾᵢ0.getClass();
                    if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                        ʾᵢ0.MTH1139(ʾᵢ0.MTH1151(s, s1) + 1, 0L, s, "_INVITE_COUNT_", s1);
                    }
                    ᴵʽ0.MTH2706(s, s1, s3, s2, s4);
                    ᴵʽ0.MTH2697(s, s2);
                    return;
                }
                CLS794.MTH2689(s, CLS27.MTH889("mod_invite_only"));
                CLS426.MTH6108(s, s2);
                if(z2) {
                    CLS426.MTH6108(s, s1);
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        String s5 = this.FLD752;
        String s6 = this.FLD754;
        String s7 = this.FLD751;
        String s8 = this.FLD756;
        String s9 = this.FLD755;
        CLS61 ﾞٴ1 = CLS794.MTH2698();
        try {
            boolean z4 = ᴵʽ0.FLD1445.MTH938(s5 + "_autoban_enable", false) && ᴵʽ0.FLD1445.MTH938(s5 + "_mod_invite_only", false);
            boolean z5 = ᴵʽ0.FLD1445.MTH938(s5 + "_mod_invite_only_kickboth", false);
            if(!z4 && !z5 || TextUtils.isEmpty(s6) || s6.equals(CLS27.MTH904()) || CLS426.MTH6118(s5, s6) || ﾞٴ1.MTH1302(s5, s6)) {
                z = false;
            }
            boolean z7 = false;
            if(TextUtils.isEmpty(s7) || s7.equals(CLS27.MTH904())) {
                z7 = true;
            }
            else if(!z4 && !z5 || !z) {
                z7 = true;
                if(!CLS426.MTH6118(s5, s6) && ﾞٴ1.MTH1304(s5, s7)) {
                    CLS426.MTH6132(s5, s7, false);
                    return;
                }
            }
            if(z7) {
                ᴵʽ0.MTH2706(s5, s6, s8, s7, s9);
                ᴵʽ0.MTH2697(s5, s7);
                return;
            }
            CLS794.MTH2689(s5, CLS27.MTH889("mod_invite_only"));
            CLS426.MTH6108(s5, s7);
            if(z5) {
                CLS426.MTH6108(s5, s6);
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

