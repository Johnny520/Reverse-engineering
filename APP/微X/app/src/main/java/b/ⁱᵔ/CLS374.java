// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ˈˈ.CLS79;
import java.util.ArrayList;

public final class CLS374 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD3500;
    public final String FLD3501;
    public final CLS79 FLD3502;

    public CLS374(CLS79 ˎᵢ0, String s, int v) {
        this.FLD3500 = v;
        this.FLD3502 = ˎᵢ0;
        this.FLD3501 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        String s = this.FLD3501;
        CLS79 ˎᵢ0 = this.FLD3502;
        if(this.FLD3500 == 0) {
            if(z) {
                ˎᵢ0.MTH1638(s);
                return;
            }
            ˎᵢ0.getClass();
            if(!TextUtils.isEmpty(s)) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s);
                ˎᵢ0.MTH1618("wx_chatroom_containers", arrayList0);
            }
            ˎᵢ0.MTH1657(s);
            ˎᵢ0.MTH1633();
            ˎᵢ0.FLD300.remove(s);
            ˎᵢ0.FLD300.remove("wx__MAIN_");
            return;
        }
        if(ˎᵢ0.MTH1658(s)) {
            if(z) {
                CLS371.FLD3470.MTH5333(s);
            }
            else {
                CLS404.MTH5903(s);
            }
            ˎᵢ0.MTH1633();
        }
    }
}

