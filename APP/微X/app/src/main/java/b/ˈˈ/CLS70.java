// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1025;
import b.ᐧˉ.CLS1116;
import b.ᐧˉ.CLS219;
import b.ᐧˉ.CLS928;
import b.ᐧˉ.CLS952;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS545;

public final class CLS70 implements View.OnClickListener {
    public final int FLD235;
    public final Object FLD236;

    public CLS70(int v, Object object0) {
        this.FLD235 = v;
        this.FLD236 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Object object0 = this.FLD236;
        switch(this.FLD235) {
            case 0: {
                ((CLS90)object0).MTH1727();
                return;
            }
            case 1: {
                for(Object object1: ((CLS545)object0).FLD5347.values()) {
                    RadioButton radioButton0 = (RadioButton)object1;
                    if(radioButton0.hashCode() != view0.hashCode() && radioButton0.isChecked()) {
                        radioButton0.setChecked(false);
                    }
                }
                ((RadioButton)view0).setChecked(true);
                RadioGroup.OnCheckedChangeListener radioGroup$OnCheckedChangeListener0 = ((CLS545)object0).FLD5348;
                if(radioGroup$OnCheckedChangeListener0 != null) {
                    radioGroup$OnCheckedChangeListener0.onCheckedChanged(null, view0.hashCode());
                }
                return;
            }
            case 2: {
                ((CLS928)object0).FLD1726.MTH3749(CLS27.MTH889("config_tail"), "_ANY_tail_", false);
                return;
            }
            case 3: {
                Activity activity1 = ((CLS219)(((CLS1019)object0))).MTH3883();
                CLS523.MTH7169(activity1, CLS27.MTH889("room_management"), ((CLS379)new CLS1116(((CLS1019)object0), activity1)));
                return;
            }
            case 4: {
                switch(((CLS1629)object0).MTH7373()) {
                    case "female": {
                        CLS66.MTH1494(2);
                        return;
                    }
                    case "male": {
                        CLS66.MTH1494(1);
                        return;
                    }
                    case "none": {
                        CLS66.MTH1494(-1);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            default: {
                ((CLS952)object0).getClass();
                CLS29 ˎᵢ0 = ((CLS952)object0).FLD2151;
                if(ˎᵢ0.MTH928("tts_play_voice_exclude_list")) {
                    ˎᵢ0.MTH932("tts_play_voice_exclude_list");
                }
                String s = ˎᵢ0.MTH925("tts_play_voice_include_list", "");
                Activity activity0 = ((CLS219)(((CLS952)object0))).MTH3883();
                CLS1025 ˎˏ0 = new CLS1025(((CLS952)object0));
                CLS387.MTH5585(true, activity0, ((CLS952)object0).FLD1833, ((CLS2)ˎˏ0), s, -1);
            }
        }
    }
}

