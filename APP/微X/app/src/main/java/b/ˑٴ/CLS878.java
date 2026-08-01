// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.os.Environment;
import b.ʻˑ.CLS3;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1259;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS507.CLS506;
import b.ⁱᵔ.CLS507;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public final class CLS878 implements CLS3 {
    public final int FLD1477;
    public final CLS335 FLD1478;
    public final HashSet FLD1479;
    public final CLS881 FLD1480;
    public final ArrayList FLD1481;

    public CLS878(CLS881 ﾞˏ0, HashSet hashSet0, ArrayList arrayList0, CLS335 ˑٴ0, int v) {
        this.FLD1477 = v;
        this.FLD1480 = ﾞˏ0;
        this.FLD1479 = hashSet0;
        this.FLD1481 = arrayList0;
        this.FLD1478 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS335 ˑٴ0 = this.FLD1478;
        ArrayList arrayList0 = this.FLD1481;
        HashSet hashSet0 = this.FLD1479;
        CLS881 ﾞˏ0 = this.FLD1480;
        if(this.FLD1477 == 0) {
            CLS507 ﹳˊ0 = new CLS507(((CLS140)ﾞˏ0).MTH3042());
            boolean z = CLS502.MTH6934("jpg,jpeg,png", new String[]{","});
            HashSet hashSet1 = ﹳˊ0.FLD5003;
            if(z) {
                Collections.addAll(hashSet1, new String[]{"jpg", "jpeg", "png"});
            }
            else {
                hashSet1.add("jpg,jpeg,png");
            }
            String s = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            ﹳˊ0.FLD4998 = s;
            ﹳˊ0.MTH6979(s, ((CLS506)new CLS1259(hashSet0, arrayList0, ˑٴ0, 9)));
            return;
        }
        ArrayList arrayList1 = ﾞˏ0.FLD1518;
        if(!arrayList1.isEmpty()) {
            for(Object object0: arrayList1) {
                String s1 = (String)object0;
                if(!hashSet0.contains(s1)) {
                    hashSet0.add(s1);
                    File file0 = new File(s1);
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put(CLS182.MTH3496(4101882966009762613L, contentValues0, s1, 0x38ECD0D72B3CD335L), file0.getName());
                    arrayList0.add(contentValues0);
                }
            }
            ˑٴ0.MTH5112();
        }
    }
}

