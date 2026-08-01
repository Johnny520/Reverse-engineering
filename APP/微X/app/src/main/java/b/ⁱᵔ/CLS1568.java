// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ˆʿ.CLS44;
import b.ˈˈ.CLS69;
import b.ˊﾞ.CLS101;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS369;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS1568 implements CLS3 {
    public final int FLD4889;
    public final Object FLD4890;
    public final Object FLD4891;
    public final Object FLD4892;

    public CLS1568(Object object0, Object object1, Object object2, int v) {
        this.FLD4889 = v;
        this.FLD4891 = object0;
        this.FLD4890 = object1;
        this.FLD4892 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Object object0 = this.FLD4892;
        Object object1 = this.FLD4890;
        Object object2 = this.FLD4891;
        switch(this.FLD4889) {
            case 0: {
                if(((CLS557[])object2)[0] == null) {
                    ((CLS557[])object2)[0] = CLS101.MTH1947(CLS462.FLD4511, CLS462.FLD4513, ((String[])object1)[0]);
                }
                CLS559 ᵔʾ0 = new CLS559(((CLS557[])object2)[0]);
                String s = new File(CLS31.MTH1038(CLS27.MTH900()), CLS182.MTH3476(((String)object0), ".wav")).getAbsolutePath();
                if(ᵔʾ0.MTH7485(s)) {
                    CLS31.MTH996(s);
                    CLS466.MTH6506(new File(s));
                }
                return;
            }
            case 1: {
                ((CLS44)object2).MTH1180("_MOMENTS_SIGNATURES_");
                ((ArrayList)object1).clear();
                ((CLS344)object0).notifyDataSetChanged();
                return;
            }
            case 2: {
                CLS29 ˎᵢ0 = (CLS29)object2;
                ArrayList arrayList0 = (ArrayList)object1;
                CLS369 ﾞᵎ0 = (CLS369)object0;
                try {
                    for(Object object3: new HashSet(Arrays.asList(ˎᵢ0.MTH925("moments_container_list", "").split(";")))) {
                        ˎᵢ0.MTH932("momentscontainer_" + ((String)object3));
                    }
                    ˎᵢ0.MTH922("", "moments_container_list");
                    arrayList0.clear();
                    ﾞᵎ0.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 3: {
                JSONObject jSONObject0 = (JSONObject)object2;
                ContentValues contentValues0 = (ContentValues)object1;
                Activity activity0 = (Activity)object0;
                try {
                    int v = jSONObject0.getInt("type");
                    if(v == 1) {
                        CLS462.MTH6489(activity0, contentValues0.getAsString("img"));
                        return;
                    }
                    if(v == 15) {
                        CLS462.MTH6486(activity0, contentValues0.getAsString("vid"));
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 4: {
                if(((ProgressDialog)object2) != null && ((ProgressDialog)object2).isShowing()) {
                    ((ProgressDialog)object2).dismiss();
                }
                if(((CLS6)object1) != null) {
                    ((CLS6)object1).MTH783(((ArrayList)object0));
                }
                return;
            }
            case 5: {
                if(((ProgressDialog)object2) != null) {
                    ((ProgressDialog)object2).dismiss();
                }
                if(((CLS13)object1) != null) {
                    ((CLS13)object1).MTH770(((String)object0));
                }
                return;
            }
            default: {
                ((CLS17)object2).MTH796(new Object[]{((CLS69)object1).MTH1567(), ((String)object0)});
            }
        }
    }
}

