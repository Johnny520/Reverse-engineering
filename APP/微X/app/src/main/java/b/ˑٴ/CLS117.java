// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.ᐧˉ.CLS1062;
import b.ⁱᵔ.CLS1537;
import b.ⁱᵔ.CLS412.CLS411;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS491;
import java.io.File;
import java.util.ArrayList;

public final class CLS117 implements Handler.Callback {
    public final int FLD794;
    public final Object FLD795;
    public final Object FLD796;

    public CLS117(Object object0, Object object1, int v) {
        this.FLD794 = v;
        this.FLD796 = object0;
        this.FLD795 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        Object object0 = this.FLD795;
        Object object1 = this.FLD796;
        switch(this.FLD794) {
            case 0: {
                ((CLS629)object1).getClass();
                Bundle bundle1 = message0.getData();
                String s = bundle1.getString("title");
                int v2 = bundle1.getInt("startCode");
                int v3 = bundle1.getInt("endCode");
                int v4 = bundle1.getInt("split");
                CLS81 יᐧ0 = new CLS81(CLS47.FLD167.MTH1197(), s);
                יᐧ0.FLD305 = v4;
                CLS47.FLD167.MTH1194(יᐧ0);
                String s1 = ((File)object0).getAbsolutePath();
                CLS491.MTH6815(v2, v3, ((CLS3)new CLS738(((CLS629)object1), 2)), יᐧ0, s1);
                return true;
            }
            case 1: {
                ((CLS1062)object1).getClass();
                CLS412.MTH6016(1000L, ((ArrayList)object0).size(), ((CLS411)new CLS838(((CLS1062)object1), ((ArrayList)object0), message0.getData().getInt("split"), 4)), null);
                return true;
            }
            default: {
                Bundle bundle0 = message0.getData();
                int v = bundle0.getInt("startCode");
                int v1 = bundle0.getInt("endCode");
                CLS1537 ᴵˉ0 = new CLS1537(((String)object1), bundle0.getInt("split"), ((CLS7)object0), v, v1);
                CLS40.FLD157.MTH1124(((CLS39)ᴵˉ0));
                return true;
            }
        }
    }
}

