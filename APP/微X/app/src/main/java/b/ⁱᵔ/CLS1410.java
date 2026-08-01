// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS79;
import b.ᐧˉ.CLS1043;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class CLS1410 implements CLS16, CLS39 {
    public final HashMap FLD4043;
    public final ArrayList FLD4044;
    public final CLS79 FLD4045;
    public final CLS369 FLD4046;

    public CLS1410(CLS79 ˎᵢ0, HashMap hashMap0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD4045 = ˎᵢ0;
        this.FLD4043 = hashMap0;
        this.FLD4044 = arrayList0;
        this.FLD4046 = ﾞᵎ0;
    }

    public CLS1410(HashMap hashMap0, CLS79 ˎᵢ0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD4043 = hashMap0;
        this.FLD4045 = ˎᵢ0;
        this.FLD4044 = arrayList0;
        this.FLD4046 = ﾞᵎ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS79 ˎᵢ0;
        Iterator iterator0 = this.FLD4043.values().iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            ˎᵢ0 = this.FLD4045;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            String s = (String)object0;
            ˎᵢ0.getClass();
            if(!TextUtils.isEmpty(s)) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s);
                ˎᵢ0.MTH1618("wx_chatroom_containers", arrayList0);
            }
            ˎᵢ0.MTH1627();
            ˎᵢ0.MTH1657(s);
        }
        ˎᵢ0.MTH1633();
        this.FLD4044.clear();
        this.FLD4046.getClass();
        CLS1043 ˑˆ0 = new CLS1043(this.FLD4046, 14);
        CLS40.FLD157.MTH1116(((CLS39)ˑˆ0));
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        if(!TextUtils.isEmpty(s)) {
            String s1 = this.FLD4045.MTH1631(s);
            this.FLD4043.put(s, s1);
            this.FLD4044.clear();
            Set set0 = this.FLD4043.keySet();
            this.FLD4044.addAll(set0);
            this.FLD4046.notifyDataSetChanged();
        }
    }
}

