// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.os.Bundle;
import android.util.SparseArray;
import b.ʾᵢ.CLS31;
import b.יᐧ.CLS151.CLS149;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS1274;
import java.io.File;
import java.text.SimpleDateFormat;

public final class CLS665 implements CLS149 {
    public final File FLD691;
    public final SimpleDateFormat FLD692;

    public CLS665(File file0, SimpleDateFormat simpleDateFormat0) {
        this.FLD691 = file0;
        this.FLD692 = simpleDateFormat0;
    }

    // 此方法包含解密的字符串
    @Override  // b.יᐧ.CLS151$CLS149
    public final void MTH3132(int v, Object object0, SparseArray sparseArray0, CLS1274 ﾞˎ0) {
        String s = ((Bundle)object0).getString("stripContent");
        String s1 = ((Bundle)object0).getString("username");
        long v1 = ((Bundle)object0).getLong("createTime");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.FLD692.format(v1));
        stringBuilder0.append("_");
        stringBuilder0.append(s1);
        String s2 = CLS182.MTH3475(4102159647802970933L, stringBuilder0);
        CLS31.MTH1030(new File(this.FLD691, s2), s);
        sparseArray0.put(v, ((Bundle)object0));
        ﾞˎ0.MTH774();
    }
}

