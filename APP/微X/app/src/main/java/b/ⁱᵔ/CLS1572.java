// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS1622;

public final class CLS1572 implements CLS3 {
    public final int FLD4915;
    public final CLS1622 FLD4916;
    public final String FLD4917;

    public CLS1572(CLS1622 ˑٴ0, String s) {
        this.FLD4915 = 0;
        super();
        this.FLD4916 = ˑٴ0;
        this.FLD4917 = s;
    }

    public CLS1572(String s, CLS1622 ˑٴ0, int v) {
        this.FLD4915 = v;
        this.FLD4917 = s;
        this.FLD4916 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD4917;
        CLS1622 ˑٴ0 = this.FLD4916;
        switch(this.FLD4915) {
            case 0: {
                StringBuilder stringBuilder2 = CLS182.MTH3483(ˑٴ0.MTH7285());
                stringBuilder2.append("{#");
                stringBuilder2.append(s);
                stringBuilder2.append("#}");
                ˑٴ0.MTH7277(stringBuilder2.toString());
                return;
            }
            case 1: {
                String s2 = CLS27.MTH895().MTH925("moment_sig", "");
                if(!TextUtils.isEmpty(s2)) {
                    int v1 = CLS27.MTH895().MTH927(0, "moment_sig_type");
                    if(v1 == 1) {
                        StringBuilder stringBuilder3 = CLS182.MTH3483(s2);
                        stringBuilder3.append("\n\n");
                        stringBuilder3.append(s);
                        ˑٴ0.MTH7277(stringBuilder3.toString());
                        return;
                    }
                    if(v1 == 2) {
                        StringBuilder stringBuilder4 = CLS182.MTH3483(s);
                        stringBuilder4.append("\n\n");
                        stringBuilder4.append(s2);
                        ˑٴ0.MTH7277(stringBuilder4.toString());
                        return;
                    }
                    if(v1 == 0) {
                        ˑٴ0.MTH7277(s);
                    }
                }
                return;
            }
            default: {
                String s1 = CLS27.MTH895().MTH925("moment_sig", "");
                if(!TextUtils.isEmpty(s1)) {
                    int v = CLS27.MTH895().MTH927(0, "moment_sig_type");
                    if(v == 1) {
                        StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                        stringBuilder0.append("\n\n");
                        stringBuilder0.append(s);
                        ˑٴ0.MTH7277(stringBuilder0.toString());
                        return;
                    }
                    if(v == 2) {
                        StringBuilder stringBuilder1 = CLS182.MTH3483(s);
                        stringBuilder1.append("\n\n");
                        stringBuilder1.append(s1);
                        ˑٴ0.MTH7277(stringBuilder1.toString());
                        return;
                    }
                    if(v == 0) {
                        ˑٴ0.MTH7277(s);
                    }
                }
            }
        }
    }
}

