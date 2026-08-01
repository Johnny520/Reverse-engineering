// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS1507;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public final class CLS289 implements AdapterView.OnItemClickListener {
    public final int FLD2993;
    public final Activity FLD2994;
    public final CLS335 FLD2995;

    public CLS289(int v, Activity activity0, CLS335 ˑٴ0) {
        this.FLD2993 = v;
        this.FLD2995 = ˑٴ0;
        this.FLD2994 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Activity activity0 = this.FLD2994;
        CLS335 ˑٴ0 = this.FLD2995;
        if(this.FLD2993 == 0) {
            try {
                ContentValues contentValues0 = (ContentValues)ˑٴ0.getItem(v);
                if(contentValues0.containsKey("img")) {
                    CLS462.MTH6489(activity0, contentValues0.getAsString("img"));
                    return;
                }
                if(contentValues0.containsKey("vid")) {
                    CLS462.MTH6486(activity0, contentValues0.getAsString("vid"));
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        ContentValues contentValues1 = (ContentValues)ˑٴ0.getItem(v);
        String s = contentValues1.getAsString("wxid");
        ArrayList arrayList0 = new ArrayList(Arrays.asList(CLS502.MTH6941(contentValues1.getAsString("chatrooms"))));
        HashMap hashMap0 = new HashMap();
        for(Object object0: arrayList0) {
            String s1 = (String)object0;
            CLS371 ʻ0 = CLS371.FLD3470;
            if(ʻ0.MTH5337(s1, s)) {
                hashMap0.put(ʻ0.MTH5316(s1), s1);
            }
        }
        ArrayList arrayList1 = new ArrayList(hashMap0.keySet());
        CLS523.MTH7146(activity0, CLS27.MTH889("delete_member"), arrayList1, ((CLS8)new CLS1507(hashMap0, activity0, s)), null);
    }
}

