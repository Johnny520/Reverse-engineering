// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.text.TextUtils;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import java.util.Arrays;
import java.util.HashSet;
import t.ˆʿ.CLS33;
import t.ᵔʾ.CLS135;

public final class CLS12 implements CompoundButton.OnCheckedChangeListener {
    public final CLS216 FLD148;
    public final String FLD149;
    public final String FLD150;

    public CLS12(CLS216 ˎﾞ0, String s, String s1) {
        this.FLD148 = ˎﾞ0;
        this.FLD150 = s;
        this.FLD149 = s1;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.FLD148.getClass();
        String s = this.FLD149;
        CLS135 ⁱˉ0 = this.FLD148.FLD135;
        ⁱˉ0.MTH2125(Boolean.valueOf(z), this.FLD150 + s);
        if(!TextUtils.isEmpty(s)) {
            HashSet hashSet0 = new HashSet();
            String s1 = ⁱˉ0.MTH2134("rndbg_list", "");
            if(!TextUtils.isEmpty(s1)) {
                hashSet0.addAll(Arrays.asList(CLS33.MTH1352(s1)));
            }
            if(z) {
                hashSet0.add(s);
            }
            else {
                hashSet0.remove(s);
            }
            ⁱˉ0.MTH2125(TextUtils.join(",", hashSet0), "rndbg_list");
        }
    }
}

