// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS54;
import b.ᐧˉ.CLS910;
import java.io.File;
import java.util.ArrayList;

public final class CLS1542 implements CLS8 {
    public final File FLD4790;
    public final Activity FLD4791;

    public CLS1542(Activity activity0, File file0) {
        this.FLD4790 = file0;
        this.FLD4791 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((ArrayList)object0)) {
            String s = ((ContentValues)object1).getAsString("id");
            arrayList0.add(CLS54.FLD172.MTH1250(s));
        }
        if(arrayList0.isEmpty()) {
            return;
        }
        CLS910 ʻﹳ0 = new CLS910(this.FLD4790, arrayList0, this.FLD4791, 1);
        CLS40.FLD157.MTH1124(((CLS39)ʻﹳ0));
    }
}

