// Decompiled by JEB v5.42.0.202606242140

package p.pkg10;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import p.pkg3.CLS10;
import p.pkg3.CLS11;
import p.pkg3.CLS12.CLS199;
import p.pkg3.CLS12.CLS89;
import p.pkg3.CLS12;
import p.pkg3.CLS13;
import p.pkg3.CLS17;
import p.pkg3.CLS181;
import p.pkg3.CLS18;
import p.pkg3.CLS9;
import p.pkg9.CLS207;

public final class CLS65 {
    public static CLS207 MTH1117(String s) {
        CLS181 ﾞᵢ0 = new CLS181();
        StringReader stringReader0 = new StringReader(s);
        CLS18 ﾞˈ0 = new CLS18(ﾞᵢ0);
        CLS207 ﾞˈ1 = new CLS207("");
        ﾞᵢ0.FLD31 = ﾞˈ1;
        ﾞˈ1.FLD413 = ﾞˈ0;
        ﾞᵢ0.FLD36 = ﾞˈ0;
        ﾞᵢ0.FLD38 = CLS9.FLD44;
        CLS13 ٴʼ0 = new CLS13(stringReader0, 0x8000);
        ﾞᵢ0.FLD41 = ٴʼ0;
        CLS10 ˎᵔ0 = ﾞˈ0.FLD251;
        boolean z = ˎᵔ0.FLD46 > 0;
        if(z && ٴʼ0.FLD94 == null) {
            ٴʼ0.FLD94 = new ArrayList(409);
            ٴʼ0.MTH517();
        }
        else if(!z) {
            ٴʼ0.FLD94 = null;
        }
        ﾞᵢ0.FLD40 = null;
        ﾞᵢ0.FLD39 = new CLS11(ﾞᵢ0.FLD41, ˎᵔ0);
        ﾞᵢ0.FLD33 = new ArrayList(0x20);
        ﾞᵢ0.FLD35 = new HashMap();
        ﾞᵢ0.FLD32 = "";
        ﾞᵢ0.FLD258 = CLS17.FLD240;
        ﾞᵢ0.FLD252 = null;
        ﾞᵢ0.FLD261 = false;
        ﾞᵢ0.FLD266 = null;
        ﾞᵢ0.FLD270 = null;
        ﾞᵢ0.FLD260 = new ArrayList();
        ﾞᵢ0.FLD265 = new ArrayList();
        ﾞᵢ0.FLD269 = new ArrayList();
        ﾞᵢ0.FLD263 = new CLS199();
        ﾞᵢ0.FLD253 = true;
        ﾞᵢ0.FLD262 = false;
        CLS11 ˑᵎ0 = ﾞᵢ0.FLD39;
        while(true) {
            if(ˑᵎ0.FLD52) {
                StringBuilder stringBuilder0 = ˑᵎ0.FLD66;
                CLS89 יٴ$ﾞᵢ0 = ˑᵎ0.FLD50;
                if(stringBuilder0.length() == 0) {
                    String s1 = ˑᵎ0.FLD51;
                    if(s1 == null) {
                        ˑᵎ0.FLD52 = false;
                        יٴ$ﾞᵢ0 = ˑᵎ0.FLD49;
                    }
                    else {
                        יٴ$ﾞᵢ0.FLD86 = s1;
                        ˑᵎ0.FLD51 = null;
                    }
                }
                else {
                    stringBuilder0.delete(0, stringBuilder0.length());
                    יٴ$ﾞᵢ0.FLD86 = stringBuilder0.toString();
                    ˑᵎ0.FLD51 = null;
                }
                ﾞᵢ0.MTH446(((CLS12)יٴ$ﾞᵢ0));
                ((CLS12)יٴ$ﾞᵢ0).MTH507();
                if(יٴ$ﾞᵢ0.FLD87 == 6) {
                    break;
                }
            }
            else {
                ˑᵎ0.FLD65.MTH680(ˑᵎ0, ˑᵎ0.FLD58);
            }
        }
        ﾞᵢ0.FLD41.MTH519();
        ﾞᵢ0.FLD41 = null;
        ﾞᵢ0.FLD39 = null;
        ﾞᵢ0.FLD33 = null;
        ﾞᵢ0.FLD35 = null;
        return ﾞᵢ0.FLD31;
    }
}

