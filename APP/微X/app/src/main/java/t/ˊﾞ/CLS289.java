// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.app.Activity;
import android.view.View;
import t.ˆʿ.CLS43;
import t.ᵔʾ.CLS139.CLS138;

public final class CLS289 implements CLS138 {
    public final CLS105 FLD746;
    public final Activity FLD747;
    public final CLS102 FLD748;

    public CLS289(CLS105 ـˏ0, CLS102 יﹳ0, Activity activity0) {
        this.FLD746 = ـˏ0;
        this.FLD748 = יﹳ0;
        this.FLD747 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        CLS105 ـˏ0 = this.FLD746;
        ـˏ0.getClass();
        View view0 = (View)arr_object[0];
        float f = (float)(((Float)arr_object[1]));
        CLS111 ⁱʾ0 = ـˏ0.FLD787;
        if(ⁱʾ0 != null) {
            if(((double)f) >= 0.995) {
                ⁱʾ0.FLD814 = true;
                ⁱʾ0.invalidateSelf();
            }
            else if(((double)f) <= 0.005) {
                ⁱʾ0.FLD814 = false;
                ⁱʾ0.invalidateSelf();
            }
            CLS111 ⁱʾ1 = ـˏ0.FLD787;
            ⁱʾ1.getClass();
            if(f > 1.0f || f < 0.0f) {
                throw new IllegalArgumentException("Value must be between 1 and zero inclusive!");
            }
            ⁱʾ1.FLD815 = f;
            ⁱʾ1.invalidateSelf();
        }
        CLS102 יﹳ0 = this.FLD748;
        if(יﹳ0.MTH1818("DrawerMoveMainOnSlide", false)) {
            boolean z = יﹳ0.MTH1818("DrawerOpenRight", false);
            ـˏ0.FLD781.setTranslationX((z ? -(((float)CLS43.MTH1417(this.FLD747)) - view0.getX()) : view0.getX() + ((float)view0.getWidth())));
        }
    }
}

