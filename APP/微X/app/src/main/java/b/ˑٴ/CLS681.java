// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS565;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;

public final class CLS681 implements CLS39 {
    public final int FLD745;
    public final String FLD746;
    public final CLS61 FLD747;
    public final CLS794 FLD748;
    public final String FLD749;

    public CLS681(CLS794 ᴵʽ0, CLS61 ﾞٴ0, String s, String s1) {
        this.FLD745 = 1;
        super();
        this.FLD748 = ᴵʽ0;
        this.FLD747 = ﾞٴ0;
        this.FLD749 = s;
        this.FLD746 = s1;
    }

    public CLS681(CLS794 ᴵʽ0, String s, String s1, CLS61 ﾞٴ0) {
        this.FLD745 = 0;
        super();
        this.FLD748 = ᴵʽ0;
        this.FLD749 = s;
        this.FLD746 = s1;
        this.FLD747 = ﾞٴ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v;
        String s = this.FLD749;
        CLS794 ᴵʽ0 = this.FLD748;
        CLS61 ﾞٴ0 = this.FLD747;
        String s1 = this.FLD746;
        if(this.FLD745 == 0) {
            CLS371 ʻ0 = ᴵʽ0.FLD1444;
            String s2 = ʻ0.MTH5316(s);
            String s3 = null;
            try {
                if(CLS502.MTH6934(s1, new String[]{CLS27.MTH882("renameroom")})) {
                    v = s1.indexOf(CLS27.MTH882("renameroom"));
                }
                else {
                    v = CLS502.MTH6934(s1, new String[]{" changed the group name"}) ? s1.indexOf(" changed the group name") : -1;
                }
                if(v != -1) {
                    s3 = s1.substring(0, v);
                    s3 = s3.replaceAll("\"", "");
                    String s4 = CLS426.MTH6112(s, s3);
                    if(!TextUtils.isEmpty(s4) && !s4.equals(CLS27.MTH904()) && !ﾞٴ0.MTH1332(s, s4)) {
                        CLS426.MTH6132(s, s4, true);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            int v1 = s1.lastIndexOf(" ");
            if(!s1.substring((v1 == -1 ? s1.lastIndexOf(CLS27.MTH882("cquote")) : v1 + 1) + 1, s1.length() - 1).equals(s2) && (TextUtils.isEmpty(s3) || !s3.equals(CLS27.MTH882("you")) && !s3.equals("You") && !s3.equals(CLS66.MTH1452(s, ʻ0.MTH5343(s))))) {
                CLS565 ˆʿ0 = new CLS565(5, s, s2);
                CLS40.FLD157.MTH1117(((CLS39)ˆʿ0), 3000L);
            }
            return;
        }
        ᴵʽ0.getClass();
        if(ﾞٴ0.MTH1304(s, s1) && !CLS426.MTH6118(s, s1)) {
            String s5 = CLS182.MTH3475(4101827548046742325L, CLS182.MTH3483(s));
            if(!ᴵʽ0.FLD1445.MTH938(s5, false) || !ﾞٴ0.MTH1337(s, s1)) {
                CLS426.MTH6132(s, s1, false);
            }
        }
    }
}

