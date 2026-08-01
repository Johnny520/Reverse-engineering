// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS79;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS404;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class CLS841 implements CLS39 {
    public final int FLD1315;
    public final String FLD1316;
    public final CLS794 FLD1317;

    public CLS841(CLS794 ᴵʽ0, String s, int v) {
        this.FLD1315 = v;
        this.FLD1317 = ᴵʽ0;
        this.FLD1316 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        String s = this.FLD1316;
        CLS794 ᴵʽ0 = this.FLD1317;
        switch(this.FLD1315) {
            case 0: {
                String s1 = "";
                ᴵʽ0.getClass();
                CLS29 ˎᵢ1 = ᴵʽ0.FLD1445;
                String s2 = new SimpleDateFormat(ˎᵢ1.MTH925("auto_remark_new_chat_member_date_format", "yyMMdd")).format(new Date(System.currentTimeMillis()));
                String s3 = CLS372.MTH5417(s);
                String s4 = ˎᵢ1.MTH925("auto_remark_new_chat_member_custom_text", "");
                if(ˎᵢ1.MTH938("auto_remark_new_chat_member_append", false)) {
                    if(ˎᵢ1.MTH938("auto_remark_new_chat_member_date", true)) {
                        s3 = CLS182.MTH3484(4101833221698540341L, CLS182.MTH3483(s3), s2);
                    }
                    if(ˎᵢ1.MTH938("auto_remark_new_chat_member_custom", false) && !TextUtils.isEmpty(s4)) {
                        StringBuilder stringBuilder0 = CLS182.MTH3483(s3);
                        stringBuilder0.append("_");
                        stringBuilder0.append(s4);
                        s3 = stringBuilder0.toString();
                    }
                }
                else {
                    if(ˎᵢ1.MTH938("auto_remark_new_chat_member_date", true)) {
                        s1 = CLS182.MTH3484(0x38ECA05E2B3CD335L, CLS182.MTH3483(s2), "");
                    }
                    if(ˎᵢ1.MTH938("auto_remark_new_chat_member_custom", false) && !TextUtils.isEmpty(s4)) {
                        s1 = CLS182.MTH3484(0x38ECA0032B3CD335L, CLS182.MTH3483(s4), s1);
                    }
                    s3 = s1 + s3;
                }
                CLS372.MTH5408(s, s3);
                return;
            }
            case 1: {
                Object object0 = ᴵʽ0.FLD1145.get(s);
                Object object1 = CLS66.MTH1505(s);
                if(object1 != null) {
                    CLS166.MTH3195(object1, CLS27.MTH897("chatroomDataUpdateMethod"), new Object[0]);
                    ᴵʽ0.MTH2691(s, ((Map)CLS164.MTH3175(object0, Map.class)), ((Map)CLS164.MTH3175(object1, Map.class)));
                }
                return;
            }
            default: {
                CLS79 ˎᵢ0 = ᴵʽ0.FLD1147;
                ArrayList arrayList0 = ˎᵢ0.MTH1634(s);
                HashSet hashSet0 = new HashSet();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    hashSet0.add("");
                }
                ˎᵢ0.FLD300.put(s, hashSet0);
                CLS404.MTH5889(arrayList0, s, null);
            }
        }
    }
}

