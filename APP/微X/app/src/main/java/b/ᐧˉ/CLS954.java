// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS93;
import b.ˑٴ.CLS783;
import b.ⁱᵔ.CLS1285;
import b.ⁱᵔ.CLS1510;
import b.ⁱᵔ.CLS1562;
import b.ⁱᵔ.CLS387.CLS1312;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import org.json.JSONArray;

public final class CLS954 implements CLS3 {
    public final int FLD1840;
    public final ArrayList FLD1841;
    public final Activity FLD1842;

    public CLS954(Activity activity0, ArrayList arrayList0) {
        this.FLD1840 = 0;
        super();
        this.FLD1841 = arrayList0;
        this.FLD1842 = activity0;
    }

    public CLS954(Activity activity0, ArrayList arrayList0, int v) {
        this.FLD1840 = v;
        this.FLD1842 = activity0;
        this.FLD1841 = arrayList0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD1842;
        ArrayList arrayList0 = this.FLD1841;
        switch(this.FLD1840) {
            case 0: {
                if(!arrayList0.isEmpty()) {
                    try {
                        JSONArray jSONArray0 = new JSONArray();
                        for(Object object0: arrayList0) {
                            jSONArray0.put(((CLS93)object0).MTH1751());
                        }
                        CLS523.MTH7165(activity0, CLS27.MTH889("input_filename"), "", "", 1, ((CLS16)new CLS1208(activity0, jSONArray0, 0)));
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 1: {
                String s = CLS27.MTH889("add_to_web_image_fav");
                CLS395.MTH5747(activity0, ((CLS12)new CLS1510(2, arrayList0)), s);
                return;
            }
            case 2: {
                String s1 = CLS27.MTH889("delete_member");
                String s2 = CLS27.MTH889("duplicate_members_delete_confirmation");
                CLS1285 ʼˏ0 = new CLS1285(arrayList0);
                CLS523.MTH7160(activity0, s1, ((CLS17)new CLS783(activity0, s2, false)), ((CLS11)ʼˏ0));
                return;
            }
            case 3: {
                CLS523.MTH7146(activity0, CLS27.MTH889("delete"), arrayList0, ((CLS8)new CLS1312(activity0)), null);
                return;
            }
            default: {
                CLS523.MTH7165(activity0, CLS27.MTH889("export_"), "", "", 1, ((CLS16)new CLS1562(activity0, arrayList0, 5)));
            }
        }
    }
}

