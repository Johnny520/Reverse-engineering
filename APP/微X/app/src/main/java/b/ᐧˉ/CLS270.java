// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS34;

public final class CLS270 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2822;
    public final String FLD2823;
    public final CLS1112 FLD2824;

    public CLS270(CLS1112 ᐧˏ0, String s, int v) {
        this.FLD2822 = v;
        this.FLD2824 = ᐧˏ0;
        this.FLD2823 = s;
        super();
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        String s = this.FLD2823;
        CLS1112 ᐧˏ0 = this.FLD2824;
        if(this.FLD2822 == 0) {
            ᐧˏ0.FLD2151.MTH922(Boolean.valueOf(z), s);
            return;
        }
        ᐧˏ0.getClass();
        String s1 = CLS34.MTH1079(4100645740550607669L, new StringBuilder(), s, 4100645762025444149L);
        ᐧˏ0.FLD2151.MTH922(Boolean.valueOf(z), s1);
    }
}

