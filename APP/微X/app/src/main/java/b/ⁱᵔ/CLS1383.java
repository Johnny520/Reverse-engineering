// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ـˏ.CLS169;
import b.ـˏ.CLS889;
import b.ٴـ.CLS896.CLS170;
import java.io.File;
import java.util.ArrayList;

public final class CLS1383 implements CLS2 {
    public final ContentValues FLD3907;

    public CLS1383(ContentValues contentValues0) {
        this.FLD3907 = contentValues0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            Object[] arr_object = {new CLS170(((CLS169)new CLS889(new File(this.FLD3907.getAsString("vid")))), 2, arrayList0)};
            CLS21.FLD76.MTH818("sendMessageForwardItem", arr_object);
        }
    }
}

