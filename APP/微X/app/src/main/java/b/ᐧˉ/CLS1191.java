// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS69;
import b.ⁱᵔ.CLS466;
import java.io.File;

public final class CLS1191 implements CLS12 {
    public final int FLD2790;

    public CLS1191(int v) {
        this.FLD2790 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        switch(this.FLD2790) {
            case 0: {
                int v = CLS182.MTH3474(4101031888175289141L, ((ContentValues)object0));
                int v1 = CLS182.MTH3474(4101031905355158325L, ((ContentValues)object0));
                CLS21.FLD76.MTH818("accept_neighbor_friendreq", new Object[]{v, v1});
                return;
            }
            case 1: {
                CLS466.MTH6516(((File)object0));
                return;
            }
            default: {
                if(CLS31.MTH1024(((String)object0))) {
                    CLS69 ʾᵢ0 = new CLS69(((String)object0));
                    File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "temp_share_file");
                    CLS31.MTH1009(ʾᵢ0, file0);
                    CLS466.MTH6506(file0);
                }
            }
        }
    }
}

