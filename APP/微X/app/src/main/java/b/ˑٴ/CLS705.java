// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS705 implements CLS3 {
    public final HashSet FLD821;
    public final long FLD822;
    public final long FLD823;
    public final int FLD824;
    public final String FLD825;
    public final int FLD826;
    public final CLS629 FLD827;
    public final String FLD828;
    public final String FLD829;
    public final int FLD830;

    public CLS705(CLS629 ʻˋ0, int v, String s, String s1, int v1, String s2, long v2, long v3, HashSet hashSet0, int v4) {
        this.FLD824 = v4;
        this.FLD827 = ʻˋ0;
        this.FLD826 = v;
        this.FLD828 = s;
        this.FLD825 = s1;
        this.FLD830 = v1;
        this.FLD829 = s2;
        this.FLD822 = v2;
        this.FLD823 = v3;
        this.FLD821 = hashSet0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        HashSet hashSet0 = this.FLD821;
        if(this.FLD824 == 0) {
            this.FLD827.getClass();
            String s = TextUtils.join(",", hashSet0);
            this.FLD827.MTH2044(this.FLD826, this.FLD830, this.FLD822, this.FLD823, this.FLD828, this.FLD825, this.FLD829, s);
            return;
        }
        CLS629 ʻˋ0 = this.FLD827;
        ContentValues contentValues0 = ʻˋ0.MTH2057(this.FLD826, this.FLD830, this.FLD822, this.FLD823, this.FLD828, this.FLD825, this.FLD829);
        String s1 = TextUtils.join(",", hashSet0);
        if(contentValues0 != null) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(contentValues0);
            ʻˋ0.MTH2061(s1, arrayList0);
        }
    }
}

