// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.widget.RadioButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import b.ˈˈ.CLS70;
import b.ⁱᵔ.CLS522;
import java.util.HashMap;

public final class CLS545 {
    public final HashMap FLD5347;
    public RadioGroup.OnCheckedChangeListener FLD5348;

    public CLS545() {
        this.FLD5347 = new HashMap();
    }

    public final void MTH7361(RadioButton radioButton0) {
        if(CLS522.MTH7114()) {
            radioButton0.setTextColor(CLS522.MTH7109());
        }
        this.FLD5347.put(radioButton0.hashCode(), radioButton0);
        radioButton0.setOnClickListener(new CLS70(1, this));
    }

    public final void MTH7362(RadioButton radioButton0) {
        HashMap hashMap0 = this.FLD5347;
        for(Object object0: hashMap0.values()) {
            RadioButton radioButton1 = (RadioButton)object0;
            if(radioButton1.isChecked()) {
                radioButton1.setChecked(false);
            }
        }
        RadioButton radioButton2 = (RadioButton)hashMap0.get(radioButton0.hashCode());
        if(radioButton2 != null) {
            radioButton2.setChecked(true);
        }
    }
}

