// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ˆʿ.CLS44;
import b.ˆʿ.CLS61;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS91;
import b.ˈˊ.CLS99;
import b.ˑٴ.CLS736;
import b.ˑٴ.CLS848;
import b.ⁱʾ.CLS316;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1292;
import b.ⁱᵔ.CLS1419;
import b.ⁱᵔ.CLS1513;
import b.ⁱᵔ.CLS1549;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS250 implements AdapterView.OnItemLongClickListener {
    public final int FLD2608;
    public final Object FLD2609;
    public final Object FLD2610;
    public final Activity FLD2611;
    public final Object FLD2612;

    public CLS250(Activity activity0, Object object0, Object object1, Object object2, int v) {
        this.FLD2608 = v;
        this.FLD2611 = activity0;
        this.FLD2610 = object0;
        this.FLD2612 = object1;
        this.FLD2609 = object2;
        super();
    }

    public CLS250(Object object0, Activity activity0, Object object1, Object object2, int v) {
        this.FLD2608 = v;
        this.FLD2610 = object0;
        this.FLD2611 = activity0;
        this.FLD2612 = object1;
        this.FLD2609 = object2;
        super();
    }

    public CLS250(HashMap hashMap0, CLS369 ﾞᵎ0, Activity activity0, String s) {
        this.FLD2608 = 5;
        super();
        this.FLD2610 = hashMap0;
        this.FLD2612 = ﾞᵎ0;
        this.FLD2611 = activity0;
        this.FLD2609 = s;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        Activity activity0 = this.FLD2611;
        Object object0 = this.FLD2609;
        Object object1 = this.FLD2612;
        Object object2 = this.FLD2610;
        switch(this.FLD2608) {
            case 0: {
                ((CLS1078)object2).getClass();
                CLS523.MTH7142(activity0, ((CLS11)new CLS1076(((CLS99)object1), ((CLS316)object0), v)));
                return true;
            }
            case 1: {
                CLS71 ˆٴ1 = new CLS71(activity0, null);
                ˆٴ1.MTH1572("delete", ((CLS3)new CLS951(activity0, ((ArrayList)object2), v, ((CLS369)object1), ((CLS82)object0))));
                ˆٴ1.MTH1572("move_to", ((CLS3)new CLS736(activity0, v, ((CLS369)object1), ((CLS82)object0), 4)));
                ˆٴ1.MTH1572("preview", ((CLS3)new CLS1144(((CLS82)object0), v, activity0, 3)));
                ˆٴ1.MTH1573();
                return true;
            }
            case 2: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1513(((CLS341[])object2), v, ((ArrayList)object1), ((ArrayList)object0))));
                return true;
            }
            case 3: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1419(((CLS369)object2), v, ((ArrayList)object1), ((HashSet)object0))));
                return true;
            }
            case 4: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1549(((CLS369)object2), v, ((CLS61)object1), ((ArrayList)object0))));
                return true;
            }
            case 5: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1292(((String)object0), ((String)((HashMap)object2).get(((CLS369)object1).getItem(v))))));
                return true;
            }
            default: {
                Object object3 = ((CLS344)object2).getItem(v);
                CLS71 ˆٴ0 = new CLS71(activity0, null);
                ˆٴ0.MTH1572("modify", ((CLS3)new CLS848(activity0, ((CLS91)object3), ((CLS44)object1), ((CLS344)object2), 23)));
                ˆٴ0.MTH1572("delete", ((CLS3)new CLS951(((ArrayList)object0), v, ((CLS344)object2), ((CLS44)object1), ((CLS91)object3), 2)));
                ˆٴ0.MTH1573();
                return true;
            }
        }
    }
}

