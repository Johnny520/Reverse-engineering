// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.os.Environment;
import java.util.ArrayList;
import t.ˆʿ.CLS38.CLS37;
import t.ˆʿ.CLS38;
import t.ⁱʾ.CLS143;

public final class CLS222 implements CLS143 {
    public final int FLD252;
    public final ArrayList FLD253;
    public final Activity FLD254;
    public final CLS143 FLD255;

    public CLS222(Activity activity0, ArrayList arrayList0, CLS143 ˆٴ0, int v) {
        this.FLD252 = v;
        this.FLD254 = activity0;
        this.FLD253 = arrayList0;
        this.FLD255 = ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        CLS143 ˆٴ0 = this.FLD255;
        ArrayList arrayList0 = this.FLD253;
        Activity activity0 = this.FLD254;
        if(this.FLD252 == 0) {
            CLS38 יᐧ0 = new CLS38(activity0);
            יᐧ0.FLD476 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            יᐧ0.MTH1384("jpg,png,jpeg");
            CLS239 ᐧי0 = new CLS239(arrayList0, ˆٴ0, 0);
            יᐧ0.MTH1386(יᐧ0.FLD476, ((CLS37)ᐧי0));
            return;
        }
        CLS38 יᐧ1 = new CLS38(activity0);
        יᐧ1.FLD476 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
        יᐧ1.MTH1384("jpg,png,jpeg");
        CLS239 ᐧי1 = new CLS239(arrayList0, ˆٴ0, 3);
        יᐧ1.MTH1386(יᐧ1.FLD476, ((CLS37)ᐧי1));
    }
}

