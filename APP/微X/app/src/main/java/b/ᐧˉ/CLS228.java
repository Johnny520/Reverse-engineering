// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS3;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS71;
import b.ˑٴ.CLS736;
import b.ˑٴ.CLS848;
import b.ᵔʾ.CLS1232;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;

public final class CLS228 implements AdapterView.OnItemLongClickListener {
    public final CLS210 FLD2221;
    public final int FLD2222;
    public final Activity FLD2223;
    public final CLS359 FLD2224;
    public final ArrayList FLD2225;

    public CLS228(int v, Activity activity0, CLS359 ⁱˉ0, CLS210 ˋʼ0, ArrayList arrayList0) {
        this.FLD2221 = ˋʼ0;
        this.FLD2224 = ⁱˉ0;
        this.FLD2223 = activity0;
        this.FLD2225 = arrayList0;
        this.FLD2222 = v;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        Activity activity0 = this.FLD2223;
        CLS210 ˋʼ0 = this.FLD2221;
        ˋʼ0.getClass();
        CLS359 ⁱˉ0 = this.FLD2224;
        Object object0 = ⁱˉ0.getItem(v);
        if(((ContentValues)object0) == null) {
            return true;
        }
        int v2 = CLS182.MTH3474(4100632383202317109L, ((ContentValues)object0));
        String s = ((ContentValues)object0).getAsString("desc");
        if(s.contains("<")) {
            s = s.substring(0, s.indexOf("<"));
        }
        CLS71 ˆٴ0 = new CLS71(activity0, s);
        switch(v2) {
            case -16: 
            case -2: 
            case 2: 
            case 3: 
            case 4: 
            case 16: {
                ˆٴ0.MTH1572("preview", ((CLS3)new CLS736(ˋʼ0, v2, ((ContentValues)object0), activity0, 1)));
                break;
            }
            case 101: {
                ˆٴ0.MTH1572("add", ((CLS3)new CLS848(ˋʼ0, ((ContentValues)object0), activity0, ⁱˉ0, 1)));
            label_15:
                if(v2 == 0xFFFFFFD1 || v2 == -33 || v2 == 101) {
                    ˆٴ0.MTH1572("preview", ((CLS3)new CLS736(ˋʼ0, v2, ((ContentValues)object0), activity0, 1)));
                }
                break;
            }
            default: {
                goto label_15;
            }
        }
        ˆٴ0.MTH1572("delete", ((CLS3)new CLS1132(ⁱˉ0, this.FLD2225, ((ContentValues)object0), 2)));
        if(v2 == 1 || v2 == 101) {
        label_23:
            ˆٴ0.MTH1572("modify", ((CLS3)new CLS951(ˋʼ0, v2, activity0, ((ContentValues)object0), ⁱˉ0, 0)));
            if(v2 == 101) {
                ˆٴ0.MTH1572("order", ((CLS3)new CLS1232(((ContentValues)object0), activity0, 5)));
                String[] arr_s = CLS502.MTH6941(((ContentValues)object0).getAsString("chatrooms"));
                for(int v3 = 0; true; ++v3) {
                    boolean z = false;
                    if(v3 >= arr_s.length) {
                        break;
                    }
                    String s1 = arr_s[v3];
                    if(CLS66.MTH1455(s1) && !CLS66.MTH1433(s1, ˋʼ0.FLD2015)) {
                        z = true;
                        break;
                    }
                }
                if(z) {
                    ˆٴ0.MTH1572("reason", ((CLS3)new CLS1232(((ContentValues)object0), activity0, 6)));
                }
            }
        }
        else {
            switch(v2) {
                case -333: 
                case -104: 
                case -103: 
                case -102: 
                case -101: 
                case -100: 
                case -49: 
                case -33: {
                    goto label_23;
                }
            }
        }
        ˆٴ0.MTH1572("delay", ((CLS3)new CLS1232(((ContentValues)object0), activity0, 7)));
        ˆٴ0.MTH1572("move_to", ((CLS3)new CLS1071(activity0, this.FLD2222, ⁱˉ0, 1)));
        ˆٴ0.MTH1573();
        return true;
    }
}

