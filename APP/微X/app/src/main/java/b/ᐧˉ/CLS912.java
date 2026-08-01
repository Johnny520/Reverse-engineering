// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class CLS912 implements CLS16 {
    public final int FLD1703;
    public final CLS1622 FLD1704;
    public final CLS1019 FLD1705;

    public CLS912(CLS1019 ˎʻ0, CLS1622 ˑٴ0, int v) {
        this.FLD1703 = v;
        this.FLD1705 = ˎʻ0;
        this.FLD1704 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS1019 ˎʻ0 = this.FLD1705;
        CLS1622 ˑٴ0 = this.FLD1704;
        if(this.FLD1703 == 0) {
            ˎʻ0.getClass();
            try {
                HashSet hashSet0 = new HashSet();
                String s1 = ˑٴ0.MTH7285();
                if(!TextUtils.isEmpty(s1)) {
                    hashSet0.addAll(Arrays.asList(s1.split(Pattern.quote("|"))));
                }
                hashSet0.add(s);
                String s2 = TextUtils.join("|", hashSet0);
                ˎʻ0.FLD2151.MTH922(s2, "auto_exit_chatroom_keyword_text");
                ˑٴ0.MTH7277(s2);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        ˎʻ0.getClass();
        try {
            HashSet hashSet1 = new HashSet();
            String s3 = ˑٴ0.MTH7285();
            if(!TextUtils.isEmpty(s3)) {
                hashSet1.addAll(Arrays.asList(s3.split(Pattern.quote("|"))));
            }
            hashSet1.add(s);
            String s4 = TextUtils.join("|", hashSet1);
            ˎʻ0.FLD2151.MTH922(s4, "auto_kick_keyword_text");
            ˑٴ0.MTH7277(s4);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

