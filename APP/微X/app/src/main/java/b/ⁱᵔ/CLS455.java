// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import b.ʻˑ.CLS3;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS71;
import b.ᐧˉ.CLS1071;
import b.ᐧˉ.CLS1132;
import b.ᐧˉ.CLS1144;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;

public final class CLS455 implements AdapterView.OnItemLongClickListener {
    public final int FLD4455;
    public final BaseAdapter FLD4456;
    public final boolean FLD4457;
    public final Activity FLD4458;
    public final ArrayList FLD4459;
    public final Object FLD4460;

    public CLS455(Activity activity0, CLS359 ⁱˉ0, CLS500 ᵢﹶ0, ArrayList arrayList0, boolean z) {
        this.FLD4455 = 0;
        super();
        this.FLD4456 = ⁱˉ0;
        this.FLD4458 = activity0;
        this.FLD4459 = arrayList0;
        this.FLD4457 = z;
        this.FLD4460 = ᵢﹶ0;
    }

    public CLS455(CLS335 ˑٴ0, String s, Activity activity0, boolean z, ArrayList arrayList0) {
        this.FLD4455 = 1;
        super();
        this.FLD4456 = ˑٴ0;
        this.FLD4460 = s;
        this.FLD4458 = activity0;
        this.FLD4457 = z;
        this.FLD4459 = arrayList0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS71 ˆٴ1;
        BaseAdapter baseAdapter0 = this.FLD4456;
        boolean z = this.FLD4457;
        ArrayList arrayList0 = this.FLD4459;
        Object object0 = this.FLD4460;
        if(this.FLD4455 == 0) {
            Activity activity0 = this.FLD4458;
            Object object1 = ((CLS359)baseAdapter0).getItem(v);
            if(((ContentValues)object1) != null) {
                int v2 = CLS182.MTH3474(4100842162289955637L, ((ContentValues)object1));
                CLS71 ˆٴ0 = new CLS71(activity0, null);
                if(v2 == 2 || v2 == 3 || v2 == 4 || (v2 == 0xFFFFFFD1 || v2 == -16 || v2 == -2 || v2 == 16)) {
                    ˆٴ0.MTH1572("preview", ((CLS3)new CLS1560(v2, ((ContentValues)object1), activity0, 0)));
                }
                ˆٴ0.MTH1572("delete", ((CLS3)new CLS1132(arrayList0, ((ContentValues)object1), ((CLS359)baseAdapter0), 3)));
                switch(v2) {
                    case -333: 
                    case -104: 
                    case -103: 
                    case -102: 
                    case -101: 
                    case -100: 
                    case -49: 
                    case 1: 
                    case 0x30: {
                        ˆٴ1 = ˆٴ0;
                        ˆٴ1.MTH1572("modify", ((CLS3)new CLS1584(v2, activity0, ((ContentValues)object1), ((CLS359)baseAdapter0), 0)));
                        break;
                    }
                    default: {
                        ˆٴ1 = ˆٴ0;
                    }
                }
                if(!z && ((CLS500)object0).MTH6895("mass_send_custom_delays")) {
                    ˆٴ1.MTH1572("delay", ((CLS3)new CLS1522(0, activity0, ((ContentValues)object1), ((CLS359)baseAdapter0))));
                }
                ˆٴ1.MTH1572("move_to", ((CLS3)new CLS1071(activity0, v, ((CLS359)baseAdapter0), 2)));
                ˆٴ1.MTH1573();
            }
            return true;
        }
        String s = ((ContentValues)((CLS335)baseAdapter0).getItem(v)).getAsString("wxid");
        if(!CLS66.MTH1433(((String)object0), s)) {
            CLS1144 ᵎʻ0 = new CLS1144(arrayList0, v, ((CLS335)baseAdapter0), 4);
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(((String)object0));
            CLS403.MTH5869(this.FLD4458, arrayList1, s, z, ᵎʻ0);
        }
        return true;
    }
}

