// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.widget.RadioButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;
import java.util.ArrayList;
import t.ʾᵢ.CLS258;
import t.ˆٴ.CLS64;

public final class CLS160 implements RadioGroup.OnCheckedChangeListener {
    public final CLS347 FLD1111;

    public CLS160(CLS347 ﾞᵎ0) {
        this.FLD1111 = ﾞᵎ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.RadioGroup$OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup0, int v) {
        CLS347 ﾞᵎ0 = this.FLD1111;
        for(Object object0: ﾞᵎ0.FLD1328) {
            RadioButton radioButton0 = (RadioButton)object0;
            if(radioButton0.isChecked()) {
                CLS184 ﾞᵎ$ˆٴ0 = ﾞᵎ0.FLD1320;
                String s = (String)radioButton0.getTag();
                CLS64 ˆٴ0 = (CLS64)((CLS258)ﾞᵎ$ˆٴ0).FLD360;
                ArrayList arrayList0 = (ArrayList)((CLS258)ﾞᵎ$ˆٴ0).FLD363;
                ArrayList arrayList1 = (ArrayList)((CLS258)ﾞᵎ$ˆٴ0).FLD362;
                ArrayList arrayList2 = (ArrayList)((CLS258)ﾞᵎ$ˆٴ0).FLD364;
                ArrayList arrayList3 = (ArrayList)((CLS258)ﾞᵎ$ˆٴ0).FLD361;
                switch(s) {
                    case "radio_all": {
                        ˆٴ0.MTH1521(arrayList3);
                        return;
                    }
                    case "radio_chatrooms": {
                        ˆٴ0.MTH1521(arrayList2);
                        return;
                    }
                    case "radio_friends": {
                        ˆٴ0.MTH1521(arrayList1);
                        return;
                    }
                    case "radio_public_account": {
                        ˆٴ0.MTH1521(arrayList0);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            if(false) {
                break;
            }
        }
    }
}

