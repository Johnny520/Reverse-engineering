// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ˈˊ.CLS99;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;

public final class CLS1120 implements CLS11 {
    public final boolean FLD2505;
    public final String FLD2506;
    public final ArrayList FLD2507;
    public final CLS99 FLD2508;
    public final CLS1635 FLD2509;
    public final CLS3 FLD2510;

    public CLS1120(boolean z, CLS99 ﾞᵎ0, ArrayList arrayList0, CLS1635 ﾞᵎ1, String s, CLS978 ˉˉ0) {
        this.FLD2505 = z;
        this.FLD2508 = ﾞᵎ0;
        this.FLD2507 = arrayList0;
        this.FLD2509 = ﾞᵎ1;
        this.FLD2506 = s;
        this.FLD2510 = ˉˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS99 ﾞᵎ0 = this.FLD2508;
        ArrayList arrayList0 = this.FLD2507;
        if(this.FLD2505 && ﾞᵎ0.FLD489 && ((String)arrayList0.get(0)).equals("#8") && this.FLD2509.MTH7444()) {
            arrayList0.set(1, "--");
        }
        else if(arrayList0.size() > 2) {
            arrayList0.set(2, "");
        }
        String s = TextUtils.join(" ", arrayList0);
        String s1 = this.FLD2506;
        if(s1.trim().equals(s.trim())) {
            return;
        }
        if(ﾞᵎ0.FLD489) {
            boolean z = TextUtils.isEmpty(s1);
            ArrayList arrayList1 = ﾞᵎ0.FLD496;
            if(!z) {
                arrayList1.remove(s1);
            }
            if(!TextUtils.isEmpty(s)) {
                arrayList1.add(s);
            }
        }
        else {
            if(!TextUtils.isEmpty(s1)) {
                ﾞᵎ0.FLD499.remove(s1);
            }
            ﾞᵎ0.MTH1932(s);
        }
        CLS3 ˆٴ0 = this.FLD2510;
        if(ˆٴ0 != null) {
            ˆٴ0.MTH774();
        }
    }
}

