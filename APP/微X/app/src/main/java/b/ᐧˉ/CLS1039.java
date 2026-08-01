// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS1572;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class CLS1039 implements CLS16, CLS17 {
    public final int FLD2205;
    public final CLS1622 FLD2206;

    public CLS1039(CLS1622 ˑٴ0, int v) {
        this.FLD2205 = v;
        this.FLD2206 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS523.MTH7147(((LinearLayout)arr_object[1]), ((CLS18)this.FLD2206), true);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS1622 ˑٴ0 = this.FLD2206;
        if(this.FLD2205 == 0) {
            try {
                HashSet hashSet0 = new HashSet();
                String s1 = ˑٴ0.MTH7285();
                if(!TextUtils.isEmpty(s1)) {
                    hashSet0.addAll(Arrays.asList(s1.split(Pattern.quote("|"))));
                }
                hashSet0.add(s);
                ˑٴ0.MTH7277(TextUtils.join("|", hashSet0));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        if(!TextUtils.isEmpty(s)) {
            CLS432.MTH6173(s, ((CLS3)new CLS1572(ˑٴ0, s)));
        }
    }
}

