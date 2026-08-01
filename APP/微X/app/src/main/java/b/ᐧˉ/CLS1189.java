// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1629.CLS548;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class CLS1189 implements CLS16, CLS548 {
    public final CLS899 FLD2783;
    public final CLS1622 FLD2784;

    public CLS1189(CLS899 ʻʼ0, CLS1622 ˑٴ0) {
        this.FLD2783 = ʻʼ0;
        this.FLD2784 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        Integer integer0;
        int v;
        CLS899 ʻʼ0 = this.FLD2783;
        ʻʼ0.getClass();
        switch(s) {
            case "create_chatroom": {
                v = 1;
                break;
            }
            case "send_text_message": {
                v = 0;
                break;
            }
            case "zombie_silent_mode": {
                v = 2;
                break;
            }
            case "zombie_transfer_mode": {
                v = 3;
                break;
            }
            default: {
                v = -1;
            }
        }
        CLS1622 ˑٴ0 = this.FLD2784;
        if(v == 0) {
            ˑٴ0.MTH801(0);
            integer0 = 1;
        }
        else {
            switch(v) {
                case 1: {
                    ˑٴ0.MTH801(8);
                    integer0 = 0;
                    break;
                }
                case 2: {
                    ˑٴ0.MTH801(8);
                    integer0 = 2;
                    break;
                }
                case 3: {
                    ˑٴ0.MTH801(8);
                    integer0 = 3;
                    break;
                }
                default: {
                    return;
                }
            }
        }
        ʻʼ0.FLD2151.MTH922(integer0, "scan_zombie_method");
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS1622 ˑٴ0 = this.FLD2784;
        CLS899 ʻʼ0 = this.FLD2783;
        ʻʼ0.getClass();
        try {
            HashSet hashSet0 = new HashSet();
            String s1 = ˑٴ0.MTH7285();
            if(!TextUtils.isEmpty(s1)) {
                hashSet0.addAll(Arrays.asList(s1.split(Pattern.quote("|"))));
            }
            hashSet0.add(s);
            String s2 = TextUtils.join("|", hashSet0);
            ʻʼ0.FLD2151.MTH922(s2, "keyword_remark");
            ˑٴ0.MTH7277(s2);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

