// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ˈˈ.CLS69;
import java.util.ArrayList;

public final class CLS1175 implements CLS8 {
    public final CLS69 FLD2727;
    public final CLS899 FLD2728;

    public CLS1175(CLS899 ʻʼ0, CLS69 ʾᵢ0) {
        this.FLD2728 = ʻʼ0;
        this.FLD2727 = ʾᵢ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((ArrayList)object0)) {
            arrayList0.add(((String)this.FLD2727.MTH1565(((String)object1))));
        }
        String s = TextUtils.join(",", arrayList0);
        this.FLD2728.FLD2151.MTH922(s, "detect_zombie_type");
    }
}

