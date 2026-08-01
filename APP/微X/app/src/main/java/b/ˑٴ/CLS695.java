// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS79;
import b.ⁱᵔ.CLS371;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.regex.Pattern;

public final class CLS695 implements CLS39 {
    public final int FLD790;
    public final CLS794 FLD791;

    public CLS695(CLS794 ᴵʽ0, int v) {
        this.FLD790 = v;
        this.FLD791 = ᴵʽ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS794 ᴵʽ0 = this.FLD791;
        if(this.FLD790 == 0) {
            ᴵʽ0.getClass();
            for(Object object0: CLS371.FLD3470.MTH5309()) {
                String s = (String)object0;
                HashMap hashMap0 = ᴵʽ0.FLD1145;
                if(!hashMap0.containsKey(s)) {
                    hashMap0.put(s, CLS66.MTH1505(s));
                }
            }
            return;
        }
        ᴵʽ0.getClass();
        ᴵʽ0.FLD1152 = new SimpleDateFormat(CLS27.MTH889("date_format"));
        String s1 = ᴵʽ0.FLD1445.MTH925("auto_exit_chatroom_keyword_text", "");
        if(!TextUtils.isEmpty(s1)) {
            if(s1.endsWith("|")) {
                s1 = s1.substring(0, s1.length() - 1);
            }
            ᴵʽ0.FLD1158 = Pattern.compile(s1, 2);
        }
        ᴵʽ0.FLD1154.clear();
        CLS79 ˎᵢ0 = ᴵʽ0.FLD1147;
        if(ˎᵢ0.FLD299) {
            ˎᵢ0.FLD299 = false;
            ˎᵢ0.FLD300.clear();
            ˎᵢ0.MTH1619();
        }
    }
}

