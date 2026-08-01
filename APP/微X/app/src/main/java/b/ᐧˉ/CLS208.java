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
import b.ᵔʾ.CLS1232;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;

public final class CLS208 implements AdapterView.OnItemLongClickListener {
    public final int FLD1982;
    public final ArrayList FLD1983;
    public final CLS359 FLD1984;
    public final CLS244 FLD1985;
    public final Activity FLD1986;

    public CLS208(CLS244 ᴵʻ0, Activity activity0, ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD1982 = v;
        this.FLD1985 = ᴵʻ0;
        this.FLD1984 = ⁱˉ0;
        this.FLD1986 = activity0;
        this.FLD1983 = arrayList0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        int v3;
        CLS71 ˆٴ1;
        ArrayList arrayList0 = this.FLD1983;
        CLS359 ⁱˉ0 = this.FLD1984;
        CLS244 ᴵʻ0 = this.FLD1985;
        if(this.FLD1982 == 0) {
            Activity activity0 = this.FLD1986;
            ᴵʻ0.getClass();
            ContentValues contentValues0 = (ContentValues)ⁱˉ0.getItem(v);
            if(contentValues0 != null) {
                int v2 = CLS182.MTH3474(0x38E88DFD2B3CD335L, contentValues0);
                String s = contentValues0.getAsString("desc");
                if(s.contains("<")) {
                    s = s.substring(0, s.indexOf("<"));
                }
                CLS71 ˆٴ0 = new CLS71(activity0, s);
                if(v2 == 101) {
                    ˆٴ1 = ˆٴ0;
                    v3 = 101;
                    ˆٴ1.MTH1572("add", ((CLS3)new CLS1176(0, activity0, contentValues0, ⁱˉ0, ᴵʻ0)));
                }
                else {
                    ˆٴ1 = ˆٴ0;
                    v3 = v2;
                }
                switch(v3) {
                    case 0xFFFFFFD1: 
                    case -33: 
                    case -16: 
                    case -2: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 16: 
                    case 101: {
                        ˆٴ1.MTH1572("preview", ((CLS3)new CLS1086(ᴵʻ0, v3, contentValues0, activity0, 0)));
                    }
                }
                ˆٴ1.MTH1572("delete", ((CLS3)new CLS1132(ⁱˉ0, arrayList0, contentValues0, 0)));
                switch(v3) {
                    case -333: 
                    case -104: 
                    case -103: 
                    case -102: 
                    case -101: 
                    case -100: 
                    case -49: 
                    case -33: 
                    case 1: 
                    case 101: {
                        ˆٴ1.MTH1572("modify", ((CLS3)new CLS998(ᴵʻ0, v3, activity0, contentValues0, ⁱˉ0, 0)));
                    }
                }
                if(v3 == 101) {
                    String[] arr_s = CLS502.MTH6941(contentValues0.getAsString("chatrooms"));
                    for(int v4 = 0; true; ++v4) {
                        boolean z = false;
                        if(v4 >= arr_s.length) {
                            break;
                        }
                        String s1 = arr_s[v4];
                        if(CLS66.MTH1455(s1) && !CLS66.MTH1433(s1, ᴵʻ0.FLD2546)) {
                            z = true;
                            break;
                        }
                    }
                    if(z) {
                        ˆٴ1.MTH1572("reason", ((CLS3)new CLS1232(contentValues0, activity0, 1)));
                    }
                }
                ˆٴ1.MTH1573();
            }
            return true;
        }
        Activity activity1 = this.FLD1986;
        ᴵʻ0.getClass();
        ContentValues contentValues1 = (ContentValues)ⁱˉ0.getItem(v);
        if(contentValues1 != null) {
            int v5 = CLS182.MTH3474(4100666300559053621L, contentValues1);
            String s2 = contentValues1.getAsString("desc");
            if(s2.contains("<")) {
                s2 = s2.substring(0, s2.indexOf("<"));
            }
            CLS71 ˆٴ2 = new CLS71(activity1, s2);
            if(v5 == 101) {
                ˆٴ2.MTH1572("add", ((CLS3)new CLS1176(1, activity1, contentValues1, ⁱˉ0, ᴵʻ0)));
            }
            if(v5 == 2 || v5 == 3) {
                ˆٴ2.MTH1572("preview", ((CLS3)new CLS1086(ᴵʻ0, v5, contentValues1, activity1, 1)));
            }
            else {
                switch(v5) {
                    case 0xFFFFFFD1: 
                    case -33: 
                    case -16: 
                    case -2: 
                    case 4: 
                    case 16: 
                    case 101: {
                        ˆٴ2.MTH1572("preview", ((CLS3)new CLS1086(ᴵʻ0, v5, contentValues1, activity1, 1)));
                    }
                }
            }
            ˆٴ2.MTH1572("delete", ((CLS3)new CLS1132(ⁱˉ0, arrayList0, contentValues1, 1)));
            switch(v5) {
                case -333: 
                case -202: 
                case -104: 
                case -103: 
                case -102: 
                case -101: 
                case -100: 
                case -49: 
                case -33: 
                case 1: 
                case 101: {
                    ˆٴ2.MTH1572("modify", ((CLS3)new CLS998(ᴵʻ0, v5, activity1, contentValues1, ⁱˉ0, 1)));
                }
            }
            if(v5 == 101) {
                ˆٴ2.MTH1572("order", ((CLS3)new CLS1232(contentValues1, activity1, 2)));
                String[] arr_s1 = CLS502.MTH6941(contentValues1.getAsString("chatrooms"));
                for(int v6 = 0; true; ++v6) {
                    boolean z1 = false;
                    if(v6 >= arr_s1.length) {
                        break;
                    }
                    String s3 = arr_s1[v6];
                    if(CLS66.MTH1455(s3) && !CLS66.MTH1433(s3, ᴵʻ0.FLD2546)) {
                        z1 = true;
                        break;
                    }
                }
                if(z1) {
                    ˆٴ2.MTH1572("reason", ((CLS3)new CLS1232(contentValues1, activity1, 3)));
                }
            }
            ˆٴ2.MTH1572("delay", ((CLS3)new CLS1232(contentValues1, activity1, 4)));
            ˆٴ2.MTH1572("move_to", ((CLS3)new CLS1071(activity1, v, ⁱˉ0, 0)));
            ˆٴ2.MTH1573();
        }
        return true;
    }
}

