// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS573;
import b.ˆʿ.CLS54;
import b.ˈˈ.CLS82;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;

public final class CLS1357 implements CLS3 {
    public final int FLD3781;
    public final Activity FLD3782;
    public final CLS82 FLD3783;

    public CLS1357(Activity activity0, CLS82 יﹳ0) {
        this.FLD3781 = 0;
        super();
        this.FLD3782 = activity0;
        this.FLD3783 = יﹳ0;
    }

    public CLS1357(CLS82 יﹳ0, Activity activity0) {
        this.FLD3781 = 1;
        super();
        this.FLD3783 = יﹳ0;
        this.FLD3782 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS82 יﹳ0 = this.FLD3783;
        if(this.FLD3781 == 0) {
            long v = (long)יﹳ0.MTH1675();
            CLS573 ⁱʽ0 = new CLS573(8, יﹳ0);
            CLS395.MTH5726(this.FLD3782, v, ((CLS12)ⁱʽ0), false, false, true);
            return;
        }
        CLS54 ᐧˉ0 = CLS54.FLD172;
        ᐧˉ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        if(יﹳ0 != null) {
            for(int v1 = 0; true; ++v1) {
                try {
                    if(v1 >= יﹳ0.MTH1678()) {
                        break;
                    }
                    InputStream inputStream0 = ᐧˉ0.FLD175.MTH857(יﹳ0.MTH1674(v1));
                    if(inputStream0 != null) {
                        File file0 = new File(CLS27.MTH900().getCacheDir(), יﹳ0.MTH1674(v1));
                        CLS31.MTH1037(inputStream0, file0);
                        CLS31.MTH996(file0.getAbsolutePath());
                        arrayList0.add(file0.getAbsolutePath());
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    break;
                }
            }
        }
        String s = CLS27.MTH889("merge_voices");
        CLS1562 ᵔᵎ0 = new CLS1562(arrayList0, this.FLD3782, 1);
        CLS523.MTH7145(this.FLD3782, s, ((CLS17)ᵔᵎ0), null);
    }
}

