// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS500;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CLS1641 extends CLS595 {
    public CLS1641() {
        this.FLD501 = 9;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS595
    public String MTH1934() {
        return CLS27.MTH889("chatroom_invite_allow_by_identity_enable");
    }

    @Override  // b.ˈˊ.CLS595
    public final void MTH1827(String s) {
        if(!CLS426.MTH6126(s)) {
            return;
        }
        ((CLS595)this).super.MTH1827(s);
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS595
    public void MTH1936() {
        if(!CLS500.FLD4928.MTH6895("task_chatroom_invite_allow_by_identity")) {
            return;
        }
        ArrayList arrayList0 = this.FLD449;
        if(arrayList0.isEmpty()) {
            return;
        }
        for(Object object0: arrayList0) {
            CLS66.MTH1391(((String)object0), true);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS595
    public final void MTH1938(Activity activity0) {
        public final class CLS599 implements CLS2 {
            public final CLS1641 FLD455;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1641 ٴـ0 = CLS1641.this;
                ٴـ0.FLD449.clear();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    ٴـ0.MTH1827("");
                }
            }
        }

        String s = CLS27.MTH904();
        HashSet hashSet0 = new HashSet();
        CLS371.FLD3470.MTH5310(s, hashSet0);
        CLS387.MTH5585(false, activity0, CLS372.MTH5414(hashSet0), ((CLS2)new CLS599(this)), TextUtils.join(",", this.FLD449), -1);
    }
}

