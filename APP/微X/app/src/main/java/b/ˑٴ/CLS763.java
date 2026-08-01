// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;

public final class CLS763 implements CLS7, CLS39 {
    public final Object FLD1034;

    public CLS763(Object object0) {
        this.FLD1034 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        boolean z = CLS27.MTH890("msgAdapterHandleMsgChangeMethod");
        Object object0 = this.FLD1034;
        if(z) {
            CLS166.MTH3195(object0, CLS27.MTH897("msgAdapterHandleMsgChangeMethod"), new Object[0]);
            return;
        }
        CLS166.MTH3195(object0, "notifyDataSetChanged", new Object[0]);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        String s = CLS182.MTH3489(0x38EC02FC2B3CD335L, new StringBuilder(), object0);
        CLS21.FLD76.MTH819("chat.menu.config", new Object[]{s, this.FLD1034});
    }
}

