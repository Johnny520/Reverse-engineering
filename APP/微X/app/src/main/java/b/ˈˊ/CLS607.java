// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS1274;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class CLS607 implements CLS3 {
    public final int FLD476;
    public final ArrayList FLD477;
    public final ArrayList FLD478;
    public final Set FLD479;
    public final JSONObject FLD480;
    public final CLS3 FLD481;
    public final List FLD482;

    public CLS607(Set set0, ArrayList arrayList0, ArrayList arrayList1, JSONObject jSONObject0, List list0, CLS1274 ﾞˎ0) {
        this.FLD476 = 0;
        super();
        this.FLD479 = set0;
        this.FLD478 = arrayList0;
        this.FLD477 = arrayList1;
        this.FLD480 = jSONObject0;
        this.FLD482 = list0;
        this.FLD481 = ﾞˎ0;
    }

    public CLS607(Set set0, ArrayList arrayList0, JSONObject jSONObject0, ArrayList arrayList1, List list0, CLS1274 ﾞˎ0) {
        this.FLD476 = 1;
        super();
        this.FLD479 = set0;
        this.FLD478 = arrayList0;
        this.FLD480 = jSONObject0;
        this.FLD477 = arrayList1;
        this.FLD482 = list0;
        this.FLD481 = ﾞˎ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS3 ˆٴ0 = this.FLD481;
        List list0 = this.FLD482;
        ArrayList arrayList0 = this.FLD477;
        ArrayList arrayList1 = this.FLD478;
        Set set0 = this.FLD479;
        JSONObject jSONObject0 = this.FLD480;
        if(this.FLD476 == 0) {
            if(set0.isEmpty() && !arrayList1.isEmpty()) {
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(TextUtils.isEmpty(((String)object0))) {
                        iterator0.remove();
                    }
                }
                try {
                    jSONObject0.put("imgPaths", TextUtils.join(",", arrayList0));
                    jSONObject0.put("content", arrayList1.get(0));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                list0.add(jSONObject0.toString());
                ˆٴ0.MTH774();
            }
            return;
        }
        if(set0.isEmpty() && !arrayList1.isEmpty()) {
            try {
                jSONObject0.put("vidPath", arrayList0.get(0));
                jSONObject0.put("content", arrayList1.get(0));
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            list0.add(jSONObject0.toString());
            ˆٴ0.MTH774();
        }
    }
}

