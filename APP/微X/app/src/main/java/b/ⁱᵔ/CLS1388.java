// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ˆʿ.CLS62;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;

public final class CLS1388 implements CLS11 {
    public final ContentValues FLD3929;
    public final CLS1626 FLD3930;
    public final ArrayList FLD3931;
    public final CLS335 FLD3932;

    public CLS1388(ContentValues contentValues0, ArrayList arrayList0, CLS1626 ـﹳ0, CLS335 ˑٴ0) {
        this.FLD3929 = contentValues0;
        this.FLD3931 = arrayList0;
        this.FLD3930 = ـﹳ0;
        this.FLD3932 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS62.FLD190.MTH1347(this.FLD3929);
        this.FLD3931.remove(this.FLD3929);
        this.FLD3930.MTH7325("" + this.FLD3931.size());
        this.FLD3932.notifyDataSetChanged();
    }
}

