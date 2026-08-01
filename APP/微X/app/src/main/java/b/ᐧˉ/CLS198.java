// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ﾞˎ.CLS1616;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1635;
import org.json.JSONObject;

public final class CLS198 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1900;
    public final CLS18 FLD1901;
    public final CLS1621 FLD1902;
    public final Object FLD1903;
    public final Object FLD1904;

    public CLS198(CLS219 ˏʻ0, String s, CLS1621 ˎᵢ0, CLS18 ﾞᐧ0, int v) {
        this.FLD1900 = v;
        this.FLD1904 = ˏʻ0;
        this.FLD1903 = s;
        this.FLD1902 = ˎᵢ0;
        this.FLD1901 = ﾞᐧ0;
        super();
    }

    public CLS198(JSONObject jSONObject0, CLS1635 ﾞᵎ0, CLS1616 ʻˏ0, CLS1621 ˎᵢ0) {
        this.FLD1900 = 3;
        super();
        this.FLD1904 = jSONObject0;
        this.FLD1903 = ﾞᵎ0;
        this.FLD1901 = ʻˏ0;
        this.FLD1902 = ˎᵢ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        int v = 0;
        CLS1621 ˎᵢ0 = this.FLD1902;
        CLS18 ﾞᐧ0 = this.FLD1901;
        Object object0 = this.FLD1903;
        Object object1 = this.FLD1904;
        switch(this.FLD1900) {
            case 0: {
                String s = CLS182.MTH3475(0x38E99CF62B3CD335L, CLS34.MTH1066(((CLS1030)object1), ((String)object0)));
                ((CLS1030)object1).FLD2151.MTH922(Boolean.valueOf(z), s);
                if(z) {
                    ˎᵢ0.MTH801(8);
                    ((CLS1616)ﾞᐧ0).MTH801(0);
                    return;
                }
                ˎᵢ0.MTH801(0);
                ((CLS1616)ﾞᐧ0).MTH801(8);
                return;
            }
            case 1: {
                String s1 = CLS182.MTH3475(4100577862887461685L, CLS182.MTH3491(((CLS1105)object1), ((String)object0)));
                ((CLS1105)object1).FLD2151.MTH922(Boolean.valueOf(z), s1);
                if(!z) {
                    v = 8;
                }
                ˎᵢ0.MTH801(v);
                ((CLS1635)ﾞᐧ0).MTH801(v);
                return;
            }
            case 2: {
                String s2 = CLS182.MTH3475(4100577158512825141L, CLS182.MTH3491(((CLS1105)object1), ((String)object0)));
                ((CLS1105)object1).FLD2151.MTH922(Boolean.valueOf(z), s2);
                if(z) {
                    ˎᵢ0.MTH801(8);
                    ((CLS1616)ﾞᐧ0).MTH801(0);
                    return;
                }
                ˎᵢ0.MTH801(0);
                ((CLS1616)ﾞᐧ0).MTH801(8);
                return;
            }
            default: {
                JSONObject jSONObject0 = (JSONObject)object1;
                CLS1635 ﾞᵎ0 = (CLS1635)object0;
                CLS1616 ʻˏ0 = (CLS1616)ﾞᐧ0;
                try {
                    jSONObject0.put("grab_red_packet_delay_enable", z);
                    if(z) {
                        ﾞᵎ0.MTH801(0);
                        if(jSONObject0.optBoolean("grab_red_packet_random_delay_enable", false)) {
                            ʻˏ0.MTH801(0);
                            return;
                        }
                        ˎᵢ0.MTH801(0);
                        return;
                    }
                    ˎᵢ0.MTH801(8);
                    ﾞᵎ0.MTH801(8);
                    ʻˏ0.MTH801(8);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

