// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS71;
import b.ˑٴ.CLS736;
import b.ᐧˉ.CLS1071;
import b.ᐧˉ.CLS1132;
import b.ᐧˉ.CLS1144;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class CLS504 implements AdapterView.OnItemLongClickListener {
    public final int FLD4964;
    public final Object FLD4965;
    public final Object FLD4966;
    public final Object FLD4967;

    public CLS504(Object object0, Object object1, Object object2, int v) {
        this.FLD4964 = v;
        this.FLD4966 = object0;
        this.FLD4965 = object1;
        this.FLD4967 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        Object object0 = this.FLD4967;
        Object object1 = this.FLD4965;
        Object object2 = this.FLD4966;
        switch(this.FLD4964) {
            case 0: {
                CLS7 יᐧ0 = (CLS7)object2;
                CLS369 ﾞᵎ0 = (CLS369)object1;
                LinkedHashMap linkedHashMap0 = (LinkedHashMap)object0;
                if(יᐧ0 != null) {
                    try {
                        יᐧ0.MTH784(linkedHashMap0.get(((String)ﾞᵎ0.getItem(v))));
                        return true;
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return true;
            }
            case 1: {
                CLS71 ˆٴ1 = new CLS71(((Activity)object2), null);
                ˆٴ1.MTH1572("delete", ((CLS3)new CLS736(((Activity)object2), ((ArrayList)object1), v, ((CLS347)object0), 2)));
                ˆٴ1.MTH1572("move_to", ((CLS3)new CLS1144(((Activity)object2), v, ((CLS347)object0), 1)));
                ˆٴ1.MTH1573();
                return true;
            }
            case 2: {
                CLS523.MTH7142(((Activity)object2), ((CLS11)new CLS1521(v, ((CLS335)object0), ((ArrayList)object1))));
                return true;
            }
            default: {
                ContentValues contentValues0 = (ContentValues)((CLS359)object2).getItem(v);
                if(contentValues0 != null) {
                    int v2 = CLS182.MTH3474(0x38E92FEF2B3CD335L, contentValues0);
                    CLS71 ˆٴ0 = new CLS71(((Activity)object1), null);
                    if(v2 == 2 || v2 == 3 || v2 == 4 || (v2 == 0xFFFFFFD1 || v2 == -16 || v2 == -2 || v2 == 16)) {
                        ˆٴ0.MTH1572("preview", ((CLS3)new CLS1560(v2, contentValues0, ((Activity)object1), 1)));
                    }
                    ˆٴ0.MTH1572("delete", ((CLS3)new CLS1132(((ArrayList)object0), contentValues0, ((CLS359)object2), 4)));
                    switch(v2) {
                        case -333: 
                        case -104: 
                        case -103: 
                        case -102: 
                        case -101: 
                        case -100: 
                        case -49: 
                        case 1: {
                            ˆٴ0.MTH1572("modify", ((CLS3)new CLS1584(v2, ((Activity)object1), contentValues0, ((CLS359)object2), 1)));
                        }
                    }
                    if(CLS500.FLD4928.MTH6895("mass_send_custom_delays")) {
                        ˆٴ0.MTH1572("delay", ((CLS3)new CLS1522(1, ((Activity)object1), contentValues0, ((CLS359)object2))));
                    }
                    ˆٴ0.MTH1572("move_to", ((CLS3)new CLS1071(((Activity)object1), v, ((CLS359)object2), 3)));
                    ˆٴ0.MTH1573();
                }
                return true;
            }
        }
    }
}

