// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS21;
import b.ᵔʾ.CLS1228;
import b.ﾞˎ.CLS1626;
import java.util.HashMap;

public final class CLS452 implements View.OnClickListener {
    public final int FLD4432;
    public final CLS1626 FLD4433;
    public final HashMap FLD4434;
    public final CLS1626 FLD4435;

    public CLS452(HashMap hashMap0, CLS1626 ـﹳ0, CLS1626 ـﹳ1, int v) {
        this.FLD4432 = v;
        this.FLD4434 = hashMap0;
        this.FLD4433 = ـﹳ0;
        this.FLD4435 = ـﹳ1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1626 ـﹳ0 = this.FLD4435;
        CLS1626 ـﹳ1 = this.FLD4433;
        HashMap hashMap0 = this.FLD4434;
        if(this.FLD4432 == 0) {
            Object[] arr_object = {new CLS1228(hashMap0, ـﹳ1, ـﹳ0, 11)};
            CLS21.FLD76.MTH818("getLatLng", arr_object);
            return;
        }
        hashMap0.clear();
        ـﹳ1.MTH800("");
        ـﹳ0.MTH800("");
    }
}

