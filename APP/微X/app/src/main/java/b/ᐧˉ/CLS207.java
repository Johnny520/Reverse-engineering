// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS29;
import b.ⁱᵔ.CLS502;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS207 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1979;
    public final String FLD1980;
    public final CLS928 FLD1981;

    public CLS207(CLS928 ʼᴵ0, String s, int v) {
        this.FLD1979 = v;
        this.FLD1981 = ʼᴵ0;
        this.FLD1980 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        String s = this.FLD1980;
        CLS928 ʼᴵ0 = this.FLD1981;
        if(this.FLD1979 == 0) {
            ʼᴵ0.getClass();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(s);
            String s1 = CLS182.MTH3475(4100959101364523829L, stringBuilder0);
            CLS29 ˎᵢ0 = ʼᴵ0.FLD2151;
            ˎᵢ0.MTH922(Boolean.valueOf(z), s1);
            String s2 = ˎᵢ0.MTH925("custom_tailmode_list", "");
            HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s2)));
            if(!CLS182.MTH3480(4100959251688379189L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                hashSet0.remove(s);
            }
            else if(!CLS502.MTH6934(s2, new String[]{s})) {
                hashSet0.add(s);
            }
            ˎᵢ0.MTH922(TextUtils.join(",", hashSet0), "custom_tailmode_list");
            return;
        }
        ʼᴵ0.getClass();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(s);
        String s3 = CLS182.MTH3475(4100959556631057205L, stringBuilder1);
        ʼᴵ0.FLD2151.MTH922(Boolean.valueOf(z), s3);
    }
}

