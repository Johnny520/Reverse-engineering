// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS81;
import b.ᐧˉ.CLS1062;
import b.ᐧˉ.CLS940;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS404;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class CLS302 implements AdapterView.OnItemClickListener {
    public final int FLD3152;
    public final Object FLD3153;
    public final Object FLD3154;
    public final Object FLD3155;
    public final Object FLD3156;

    public CLS302(CLS1062 יٴ0, CLS369 ﾞᵎ0, LinkedHashMap linkedHashMap0, Activity activity0) {
        this.FLD3152 = 1;
        super();
        this.FLD3154 = יٴ0;
        this.FLD3156 = ﾞᵎ0;
        this.FLD3153 = linkedHashMap0;
        this.FLD3155 = activity0;
    }

    public CLS302(Object object0, Object object1, Object object2, Object object3, int v) {
        this.FLD3152 = v;
        this.FLD3154 = object0;
        this.FLD3156 = object1;
        this.FLD3155 = object2;
        this.FLD3153 = object3;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Object object0 = this.FLD3153;
        Object object1 = this.FLD3155;
        Object object2 = this.FLD3156;
        Object object3 = this.FLD3154;
        switch(this.FLD3152) {
            case 0: {
                ((CLS298)object3).getClass();
                Object object4 = ((CLS335)object2).getItem(v);
                CLS71 ˆٴ0 = new CLS71(((Activity)object1), null);
                ˆٴ0.MTH1572("delete", ((CLS3)new CLS1235(((CLS298)object3), ((Activity)object1), ((ContentValues)object4), ((ArrayList)object0), ((CLS335)object2), 0)));
                ˆٴ0.MTH1573();
                return;
            }
            case 1: {
                CLS369 ﾞᵎ1 = (CLS369)object2;
                LinkedHashMap linkedHashMap1 = (LinkedHashMap)object0;
                Activity activity0 = (Activity)object1;
                ((CLS1062)object3).getClass();
                try {
                    CLS387.MTH5601(true, activity0, ((CLS2)new CLS940(((CLS81)linkedHashMap1.get(((String)ﾞᵎ1.getItem(v)))))), CLS404.MTH5907());
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            default: {
                CLS7 יᐧ0 = (CLS7)object3;
                AlertDialog[] arr_alertDialog = (AlertDialog[])object2;
                CLS369 ﾞᵎ0 = (CLS369)object1;
                LinkedHashMap linkedHashMap0 = (LinkedHashMap)object0;
                if(יᐧ0 != null) {
                    try {
                        arr_alertDialog[0].dismiss();
                        יᐧ0.MTH784(linkedHashMap0.get(((String)ﾞᵎ0.getItem(v))));
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }
}

