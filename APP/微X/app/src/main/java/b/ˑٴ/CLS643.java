// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.Intent;
import android.graphics.Bitmap;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import java.io.File;

public final class CLS643 implements CLS516 {
    public final int FLD611;
    public final String FLD612;
    public final String FLD613;
    public final CLS725 FLD614;
    public final String FLD615;
    public final Bitmap FLD616;
    public final String FLD617;

    public CLS643(CLS725 ˏˈ0, String s, String s1, String s2, String s3, Bitmap bitmap0, int v) {
        this.FLD611 = v;
        this.FLD614 = ˏˈ0;
        this.FLD613 = s;
        this.FLD615 = s1;
        this.FLD612 = s2;
        this.FLD617 = s3;
        this.FLD616 = bitmap0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS518$CLS516
    public final void MTH7045(Bitmap bitmap0) {
        CLS725 ˏˈ0 = this.FLD614;
        if(this.FLD611 == 0) {
            ˏˈ0.getClass();
            String s = CLS31.MTH980();
            CLS518.MTH7058(new File(s), bitmap0);
            CLS485 ᐧﾞ0 = ˏˈ0.MTH2410();
            ˏˈ0.MTH2410().getClass();
            Intent intent0 = CLS485.MTH6731(this.FLD613);
            ᐧﾞ0.MTH6717(this.FLD613, this.FLD615, this.FLD612, "[" + CLS27.MTH889("emoji") + "]: " + CLS66.MTH1417(this.FLD617), this.FLD616, s, intent0);
            return;
        }
        ˏˈ0.getClass();
        String s1 = CLS31.MTH980();
        CLS518.MTH7058(new File(s1), bitmap0);
        CLS485 ᐧﾞ1 = ˏˈ0.MTH2410();
        ˏˈ0.MTH2410().getClass();
        Intent intent1 = CLS485.MTH6731(this.FLD613);
        ᐧﾞ1.MTH6717(this.FLD613, this.FLD615, this.FLD612, this.FLD617, this.FLD616, s1, intent1);
    }
}

