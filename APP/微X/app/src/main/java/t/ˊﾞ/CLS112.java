// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.view.View.OnClickListener;
import android.view.View;
import t.ᵔʾ.CLS123;
import t.ⁱʾ.CLS143;

public final class CLS112 implements View.OnClickListener {
    public final int FLD834;
    public final CLS105 FLD835;

    public CLS112(CLS105 ـˏ0, int v) {
        this.FLD834 = v;
        this.FLD835 = ـˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS105 ـˏ0 = this.FLD835;
        if(this.FLD834 == 0) {
            ـˏ0.getClass();
            Object[] arr_object = {Boolean.valueOf(ـˏ0.FLD783.MTH1818("DrawerOpenRight", false))};
            CLS123.FLD912.MTH2004("core", "DrawerLayout_toggleDrawer", arr_object);
            return;
        }
        ـˏ0.getClass();
        if(ـˏ0.FLD783.MTH1818("DrawerShowAvatar", false)) {
            CLS143 ˆٴ0 = ـˏ0.FLD779;
            if(ˆٴ0 != null) {
                ˆٴ0.MTH2169();
            }
        }
    }
}

