// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ˆʿ.CLS62;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;

public final class CLS1563 implements CLS11 {
    public final ContentValues FLD4869;
    public final CLS1626 FLD4870;
    public final ArrayList FLD4871;
    public final CLS335 FLD4872;

    public CLS1563(ContentValues contentValues0, ArrayList arrayList0, CLS1626 ـﹳ0, CLS335 ˑٴ0) {
        this.FLD4869 = contentValues0;
        this.FLD4871 = arrayList0;
        this.FLD4870 = ـﹳ0;
        this.FLD4872 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS62.FLD190.MTH1347(this.FLD4869);
        this.FLD4871.remove(this.FLD4869);
        this.FLD4870.MTH7325("" + this.FLD4871.size());
        this.FLD4872.notifyDataSetChanged();
    }
}

