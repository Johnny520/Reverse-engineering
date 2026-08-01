// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;

public final class CLS271 implements View.OnClickListener {
    public final int FLD2825;
    public final String FLD2826;
    public final CLS1105 FLD2827;

    public CLS271(CLS1105 ᐧˈ0, String s, int v) {
        this.FLD2825 = v;
        this.FLD2827 = ᐧˈ0;
        this.FLD2826 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD2826;
        CLS1105 ᐧˈ0 = this.FLD2827;
        if(this.FLD2825 == 0) {
            CLS210 ˋʼ0 = ᐧˈ0.FLD2417;
            String s1 = CLS27.MTH889("config_responses");
            StringBuilder stringBuilder0 = CLS182.MTH3483(s);
            stringBuilder0.append("_REDPACKETS_");
            ˋʼ0.MTH3749(s1, stringBuilder0.toString(), true);
            return;
        }
        CLS244 ᴵʻ0 = ᐧˈ0.FLD2421;
        StringBuilder stringBuilder1 = CLS182.MTH3483(s);
        stringBuilder1.append("_REDPACKETS_");
        ᴵʻ0.MTH4271(stringBuilder1.toString());
    }
}

