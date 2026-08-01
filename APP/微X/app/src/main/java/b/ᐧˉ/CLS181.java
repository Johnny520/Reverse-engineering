// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS29;
import b.ˆʿ.CLS42;
import b.ˆʿ.CLS54;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS82;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS848;
import b.ⁱʾ.CLS326;
import b.ⁱʾ.CLS350;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1357;
import b.ⁱᵔ.CLS1501;
import b.ⁱᵔ.CLS403.CLS1367;
import b.ⁱᵔ.CLS523;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS181 implements AdapterView.OnItemLongClickListener {
    public final int FLD1748;
    public final Object FLD1749;
    public final ArrayList FLD1750;
    public final Activity FLD1751;
    public final Object FLD1752;
    public final Object FLD1753;
    public final Serializable FLD1754;

    public CLS181(Activity activity0, CLS366 ﾞᐧ0, CLS42 ʾᵢ0, String s, ArrayList arrayList0, String[] arr_s) {
        this.FLD1748 = 3;
        super();
        this.FLD1752 = ﾞᐧ0;
        this.FLD1751 = activity0;
        this.FLD1749 = ʾᵢ0;
        this.FLD1754 = s;
        this.FLD1753 = arr_s;
        this.FLD1750 = arrayList0;
    }

    public CLS181(Activity activity0, ArrayList arrayList0, CLS29 ˎᵢ0, String s, String s1, CLS369 ﾞᵎ0) {
        this.FLD1748 = 2;
        super();
        this.FLD1752 = ﾞᵎ0;
        this.FLD1751 = activity0;
        this.FLD1749 = ˎᵢ0;
        this.FLD1754 = s;
        this.FLD1750 = arrayList0;
        this.FLD1753 = s1;
    }

    public CLS181(CLS1019 ˎʻ0, Activity activity0, CLS350 ᐧⁱ0, ArrayList arrayList0, ArrayList arrayList1, HashSet hashSet0) {
        this.FLD1748 = 0;
        super();
        this.FLD1752 = ˎʻ0;
        this.FLD1751 = activity0;
        this.FLD1749 = ᐧⁱ0;
        this.FLD1750 = arrayList0;
        this.FLD1754 = arrayList1;
        this.FLD1753 = hashSet0;
    }

    public CLS181(CLS326 ˉᐧ0, Activity activity0, ArrayList arrayList0, CLS54 ᐧˉ0, AlertDialog[] arr_alertDialog, CLS7 יᐧ0) {
        this.FLD1748 = 1;
        super();
        this.FLD1752 = ˉᐧ0;
        this.FLD1751 = activity0;
        this.FLD1750 = arrayList0;
        this.FLD1749 = ᐧˉ0;
        this.FLD1754 = arr_alertDialog;
        this.FLD1753 = יᐧ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        Activity activity0 = this.FLD1751;
        Object object0 = this.FLD1753;
        Serializable serializable0 = this.FLD1754;
        Object object1 = this.FLD1749;
        Object object2 = this.FLD1752;
        switch(this.FLD1748) {
            case 0: {
                ((CLS1019)object2).getClass();
                CLS523.MTH7142(activity0, ((CLS11)new CLS1011(((CLS1019)object2), ((CLS350)object1), v, this.FLD1750, ((ArrayList)serializable0), ((HashSet)object0))));
                return true;
            }
            case 1: {
                Object object3 = ((CLS326)object2).getItem(v);
                CLS71 ˆٴ0 = new CLS71(activity0, ((CLS82)object3).FLD317);
                ˆٴ0.MTH1572("modify", ((CLS3)new CLS702(activity0, ((CLS82)object3), ((CLS326)object2), 21)));
                ˆٴ0.MTH1572("merge", ((CLS3)new CLS848(activity0, ((CLS82)object3), this.FLD1750, ((CLS326)object2), 8)));
                ˆٴ0.MTH1572("delete", ((CLS3)new CLS848(((CLS54)object1), ((CLS82)object3), this.FLD1750, ((CLS326)object2), 9)));
                ˆٴ0.MTH1572("delay", ((CLS3)new CLS1357(activity0, ((CLS82)object3))));
                ˆٴ0.MTH1572("send", ((CLS3)new CLS848(activity0, ((CLS82)object3), ((AlertDialog[])serializable0), ((CLS7)object0), 10)));
                ˆٴ0.MTH1573();
                return true;
            }
            case 2: {
                Object object4 = ((CLS369)object2).getItem(v);
                CLS71 ˆٴ1 = new CLS71(activity0, null);
                ˆٴ1.MTH1572("delete", ((CLS3)new CLS1098(activity0, ((CLS29)object1), ((String)serializable0), ((String)object4), this.FLD1750, ((String)object0), ((CLS369)object2))));
                ˆٴ1.MTH1572("modify", ((CLS3)new CLS1501(activity0, ((String)object4), ((CLS29)object1), ((String)serializable0), this.FLD1750, v, ((String)object0), ((CLS369)object2))));
                ˆٴ1.MTH1573();
                return true;
            }
            default: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1367(((CLS42)object1), ((String)serializable0), ((CLS78)((CLS366)object2).getItem(v)), ((String[])object0), this.FLD1750, ((CLS366)object2))));
                return true;
            }
        }
    }
}

