// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1384;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS491;
import b.ⁱᵔ.CLS500;
import java.io.File;

public final class CLS186 implements Handler.Callback {
    public final int FLD1784;
    public final Object FLD1785;
    public final String FLD1786;
    public final Object FLD1787;

    public CLS186(Activity activity0, CLS12 ᵔʾ0, String s) {
        this.FLD1784 = 1;
        super();
        this.FLD1786 = s;
        this.FLD1785 = activity0;
        this.FLD1787 = ᵔʾ0;
    }

    public CLS186(CLS1062 יٴ0, String s, File file0) {
        this.FLD1784 = 0;
        super();
        this.FLD1785 = יٴ0;
        this.FLD1786 = s;
        this.FLD1787 = file0;
    }

    // 此方法包含解密的字符串
    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        String s = this.FLD1786;
        Object object0 = this.FLD1787;
        Object object1 = this.FLD1785;
        if(this.FLD1784 == 0) {
            ((CLS1062)object1).getClass();
            Bundle bundle0 = message0.getData();
            String s1 = bundle0.getString("title");
            int v = bundle0.getInt("startCode");
            int v1 = bundle0.getInt("endCode");
            int v2 = bundle0.getInt("split");
            CLS81 יᐧ0 = new CLS81(CLS47.FLD167.MTH1197(), s1);
            יᐧ0.FLD305 = v2;
            CLS47.FLD167.MTH1194(יᐧ0);
            CLS40 ﾞᵎ0 = CLS40.FLD157;
            ﾞᵎ0.MTH1116(((CLS39)new CLS1115(((CLS1062)object1), 4)));
            if(s.endsWith(".wav")) {
                ﾞᵎ0.MTH1124(((CLS39)new CLS1384(s, v, v1, יᐧ0, ((CLS3)new CLS948(((CLS1062)object1), 1)), 1)));
                return true;
            }
            if(CLS500.FLD4928.MTH6895("voice_manager") && (s.endsWith(".silk") || s.endsWith(".slk") || s.endsWith("amr"))) {
                ﾞᵎ0.MTH1124(((CLS39)new CLS1049(s, יᐧ0, new CLS1182(((CLS1062)object1), ((File)object0), יᐧ0, 0), 3)));
                return true;
            }
            CLS491.MTH6815(v, v1, ((CLS3)new CLS948(((CLS1062)object1), 2)), יᐧ0, s);
            return true;
        }
        Bundle bundle1 = message0.getData();
        if(bundle1.containsKey("err")) {
            CLS412.MTH6014(((Activity)object1), CLS27.MTH889(CLS370.MTH5289((CLS21.FLD76.MTH830("is_vid_url_parser_available", new Object[]{s}) ? 4101317357471585077L : 4101317237212500789L))));
            return true;
        }
        ((CLS12)object0).MTH791(bundle1);
        return true;
    }
}

