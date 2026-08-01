// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS47;
import java.io.File;
import java.util.ArrayList;

public final class CLS984 implements CLS8 {
    public final File FLD1951;
    public final Activity FLD1952;

    public CLS984(File file0, Activity activity0) {
        this.FLD1951 = file0;
        this.FLD1952 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        if(((ArrayList)object0) != null && !((ArrayList)object0).isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: ((ArrayList)object0)) {
                long v = (long)((ContentValues)object1).getAsLong("code");
                arrayList0.add(CLS47.FLD167.MTH1199(v));
            }
            CLS910 ʻﹳ0 = new CLS910(this.FLD1951, arrayList0, this.FLD1952, 0);
            CLS40.FLD157.MTH1124(((CLS39)ʻﹳ0));
        }
    }
}

