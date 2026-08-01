// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.os.Environment;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS81;
import b.ˊﾞ.CLS612;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS897 implements CLS3 {
    public final int FLD1649;
    public final CLS369 FLD1650;
    public final CLS81 FLD1651;
    public final Activity FLD1652;
    public final ArrayList FLD1653;

    public CLS897(Activity activity0, CLS81 יᐧ0, ArrayList arrayList0, CLS369 ﾞᵎ0, int v) {
        this.FLD1649 = v;
        this.FLD1652 = activity0;
        this.FLD1651 = יᐧ0;
        this.FLD1653 = arrayList0;
        this.FLD1650 = ﾞᵎ0;
        super();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        if(this.FLD1649 == 0) {
            CLS612 ᵔʾ0 = new CLS612(this.FLD1652, this.FLD1651, this.FLD1653, this.FLD1650, 13);
            String s = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            String s1 = CLS27.MTH895().MTH925("silk_last_dir", "");
            CLS31.MTH1007(this.FLD1652, ((CLS17)ᵔʾ0), ((CLS17)ᵔʾ0), null, new String[]{"silk", "slk", "amr"}, new String[]{"audio/amr", "audio/silk"}, s, s1);
            return;
        }
        CLS1049 ˑᴵ0 = new CLS1049(this.FLD1651, this.FLD1653, this.FLD1650);
        CLS523.MTH7131(this.FLD1652, "", "", ((CLS16)ˑᴵ0));
    }
}

