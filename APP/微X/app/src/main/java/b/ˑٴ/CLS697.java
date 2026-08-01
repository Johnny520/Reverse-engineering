// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import b.ʻˑ.CLS8;

public final class CLS697 implements CLS8 {
    public final int FLD799;
    public final CLS770 FLD800;
    public final long FLD801;

    public CLS697(CLS770 ٴʿ0, int v, long v1) {
        this.FLD800 = ٴʿ0;
        this.FLD799 = v;
        this.FLD801 = v1;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        ContentValues contentValues0 = new ContentValues();
        if(this.FLD799 == 1) {
            contentValues0.put("content", ((ContentValues)object0).getAsString("content"));
        }
        contentValues0.put("createTime", ((ContentValues)object0).getAsLong("time"));
        this.FLD800.FLD1444.MTH5366(this.FLD801, contentValues0);
        this.FLD800.FLD1447.MTH3012(this.FLD800.FLD1447.FLD1434);
    }
}

