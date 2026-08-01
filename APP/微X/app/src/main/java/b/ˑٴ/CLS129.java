// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.widget.RadioButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;
import b.ﾞˎ.CLS1629;

public final class CLS129 implements RadioGroup.OnCheckedChangeListener {
    public final int FLD1165;
    public final Object FLD1166;

    public CLS129(int v, Object object0) {
        this.FLD1165 = v;
        this.FLD1166 = object0;
        super();
    }

    @Override  // android.widget.RadioGroup$OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup0, int v) {
        Object object0 = this.FLD1166;
        switch(this.FLD1165) {
            case 0: {
                if(((CLS881)object0).FLD1495 != null) {
                    if(((CLS881)object0).FLD1514.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD399 = 0;
                        return;
                    }
                    if(((CLS881)object0).FLD1503.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD399 = 1;
                        return;
                    }
                    if(((CLS881)object0).FLD1511.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD399 = 4;
                        return;
                    }
                    if(((CLS881)object0).FLD1504.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD399 = 2;
                        return;
                    }
                    if(((CLS881)object0).FLD1512.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD399 = 3;
                    }
                }
                return;
            }
            case 1: {
                if(((CLS881)object0).FLD1495 != null) {
                    if(((CLS881)object0).FLD1508.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD404 = 0;
                        return;
                    }
                    if(((CLS881)object0).FLD1499.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD404 = 1;
                        return;
                    }
                    if(((CLS881)object0).FLD1492.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD404 = 4;
                        return;
                    }
                    if(((CLS881)object0).FLD1519.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD404 = 2;
                        return;
                    }
                    if(((CLS881)object0).FLD1506.isChecked()) {
                        ((CLS881)object0).FLD1495.FLD404 = 3;
                    }
                }
                return;
            }
            default: {
                for(Object object1: ((CLS1629)object0).FLD5361) {
                    RadioButton radioButton0 = (RadioButton)object1;
                    if(radioButton0.isChecked()) {
                        ((CLS1629)object0).FLD5356.MTH7368(((String)radioButton0.getTag()));
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
    }
}

