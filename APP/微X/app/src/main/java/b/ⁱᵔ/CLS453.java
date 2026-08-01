// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS21;

public final class CLS453 implements View.OnClickListener {
    public final int FLD4436;
    public final String FLD4437;
    public final String FLD4438;

    public CLS453(int v, String s, String s1) {
        this.FLD4436 = v;
        this.FLD4438 = s;
        this.FLD4437 = s1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD4437;
        String s1 = this.FLD4438;
        switch(this.FLD4436) {
            case 0: {
                CLS21.FLD76.MTH818("dialogWhitelist", new Object[]{s1, s});
                view0.setVisibility(8);
                return;
            }
            case 1: {
                CLS21.FLD76.MTH818("dialogUnWhitelist", new Object[]{s1, s});
                view0.setVisibility(8);
                return;
            }
            case 2: {
                CLS21.FLD76.MTH818("dialogUpgradeMod", new Object[]{s1, s});
                view0.setVisibility(8);
                return;
            }
            case 3: {
                CLS21.FLD76.MTH818("dialogDowngradeMod", new Object[]{s1, s});
                view0.setVisibility(8);
                return;
            }
            case 4: {
                CLS21.FLD76.MTH818("dialogPermaban", new Object[]{s1, s});
                view0.setVisibility(8);
                return;
            }
            default: {
                CLS21.FLD76.MTH818("dialogUnPermaban", new Object[]{s1, s});
                view0.setVisibility(8);
            }
        }
    }
}

