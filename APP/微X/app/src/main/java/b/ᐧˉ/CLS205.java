// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ˈˊ.CLS99;
import b.ⁱʾ.CLS316;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1616;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS536;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS205 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1972;
    public final Object FLD1973;
    public final Object FLD1974;
    public final Object FLD1975;

    public CLS205(CLS1173 ᵢᵢ0, JSONObject jSONObject0, String s) {
        this.FLD1972 = 4;
        super();
        this.FLD1974 = ᵢᵢ0;
        this.FLD1975 = jSONObject0;
        this.FLD1973 = s;
    }

    public CLS205(Object object0, Object object1, Object object2, int v) {
        this.FLD1972 = v;
        this.FLD1974 = object0;
        this.FLD1973 = object1;
        this.FLD1975 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        HashSet hashSet1;
        int v = 8;
        Object object0 = this.FLD1975;
        Object object1 = this.FLD1973;
        Object object2 = this.FLD1974;
        switch(this.FLD1972) {
            case 0: {
                String s = CLS182.MTH3475(4100982526116156213L, CLS34.MTH1066(((CLS1030)object2), ((String)object1)));
                CLS29 ˎᵢ0 = ((CLS1030)object2).FLD2151;
                ˎᵢ0.MTH922(Boolean.valueOf(z), s);
                if(!TextUtils.isEmpty(((String)object0))) {
                    String s1 = ˎᵢ0.MTH925("custom_autoreply_list", "");
                    HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s1)));
                    if(!CLS182.MTH3480(4100982148159034165L, CLS182.MTH3483(((String)object1)), ˎᵢ0, false)) {
                        hashSet0.remove(((String)object0));
                    }
                    else if(!CLS502.MTH6934(s1, new String[]{((String)object0)})) {
                        hashSet0.add(((String)object0));
                    }
                    ˎᵢ0.MTH922(TextUtils.join(",", hashSet0), "custom_autoreply_list");
                }
                return;
            }
            case 1: {
                String s2 = (String)object1;
                ((CLS1030)object2).getClass();
                StringBuilder stringBuilder0 = new StringBuilder();
                if(TextUtils.isEmpty(s2)) {
                    s2 = "_ANY_";
                }
                String s3 = CLS34.MTH1074(stringBuilder0, s2, 4100980580495971125L);
                ((CLS1030)object2).FLD2151.MTH922(Boolean.valueOf(z), s3);
                if(!z) {
                    v = 0;
                }
                ((CLS1625)object0).MTH801(v);
                return;
            }
            case 2: {
                ((CLS1145)object2).getClass();
                ((CLS1145)object2).FLD2151.MTH922(Boolean.valueOf(z), "darkmode_follow_system");
                if(!z) {
                    v = 0;
                }
                ((CLS1635)object1).MTH801(v);
                ((CLS536)object0).FLD5202.MTH801(v);
                ((CLS536)object0).FLD5204.MTH801(v);
                return;
            }
            case 3: {
                ((CLS1173)object2).getClass();
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append(((String)object1));
                String s4 = CLS182.MTH3475(4101061592169108277L, stringBuilder1);
                ((CLS1173)object2).FLD2151.MTH922(Boolean.valueOf(z), s4);
                if("custom".equalsIgnoreCase(((String)object1))) {
                    if(z) {
                        v = 0;
                    }
                    ((CLS1623)object0).MTH801(v);
                    ((CLS1173)object2).FLD2720.MTH801(v);
                    ((CLS1173)object2).FLD2724.MTH801(v);
                }
                return;
            }
            case 4: {
                JSONObject jSONObject0 = (JSONObject)object0;
                ((CLS1173)object2).getClass();
                try {
                    jSONObject0.put("notification_enable", z);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                if("custom".equalsIgnoreCase(((String)object1))) {
                    CLS1635 ﾞᵎ0 = ((CLS1173)object2).FLD2720;
                    if(z) {
                        v = 0;
                    }
                    ﾞᵎ0.MTH801(v);
                    ((CLS1173)object2).FLD2724.MTH801(v);
                }
                return;
            }
            case 5: {
                ((CLS1105)object2).getClass();
                ((CLS1105)object2).FLD2151.MTH922(Boolean.valueOf(z), "confirm_transfer_specific_enable");
                if(z) {
                    ((CLS1625)object1).MTH801(8);
                    ((CLS1625)object0).MTH801(0);
                    return;
                }
                ((CLS1625)object1).MTH801(0);
                ((CLS1625)object0).MTH801(8);
                return;
            }
            case 6: {
                ((CLS1105)object2).getClass();
                ((CLS1105)object2).FLD2151.MTH922(Boolean.valueOf(z), "confirm_transfer_random_delay_enable");
                if(z) {
                    ((CLS1621)object1).MTH801(8);
                    ((CLS1616)object0).MTH801(0);
                    return;
                }
                ((CLS1621)object1).MTH801(0);
                ((CLS1616)object0).MTH801(8);
                return;
            }
            case 7: {
                String s5 = CLS182.MTH3475(4100572704631739189L, CLS182.MTH3491(((CLS1105)object2), ((String)object1)));
                CLS29 ˎᵢ1 = ((CLS1105)object2).FLD2151;
                ˎᵢ1.MTH922(Boolean.valueOf(z), s5);
                String s6 = ˎᵢ1.MTH925("rp_custom_list", "");
                boolean z1 = TextUtils.isEmpty(((String)object1));
                if(z) {
                    if(!z1 && !CLS502.MTH6934(s6, new String[]{((String)object0)})) {
                        hashSet1 = new HashSet(Arrays.asList(CLS502.MTH6941(s6)));
                        hashSet1.add(((String)object0));
                        ˎᵢ1.MTH922(TextUtils.join(CLS370.MTH5289(4100573486315787061L), hashSet1), "rp_custom_list");
                        return;
                    }
                }
                else if(!z1 && CLS502.MTH6934(s6, new String[]{((String)object0)})) {
                    hashSet1 = new ArrayList(Arrays.asList(CLS502.MTH6941(s6)));
                    ((ArrayList)hashSet1).remove(((String)object0));
                    ˎᵢ1.MTH922(TextUtils.join(CLS370.MTH5289(4100573559330231093L), hashSet1), "rp_custom_list");
                }
                return;
            }
            case 8: {
                JSONObject jSONObject1 = (JSONObject)object2;
                CLS1616 ʻˏ0 = (CLS1616)object1;
                CLS1621 ˎᵢ2 = (CLS1621)object0;
                try {
                    jSONObject1.put("grab_red_packet_random_delay_enable", z);
                    if(z) {
                        ʻˏ0.MTH801(0);
                        ˎᵢ2.MTH801(8);
                        return;
                    }
                    ʻˏ0.MTH801(8);
                    ˎᵢ2.MTH801(0);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            default: {
                ((CLS99)object2).FLD497 = z;
                ((CLS316)object1).FLD3260 = ((CLS99)object2).FLD489 ? ((CLS99)object2).FLD496 : ((CLS99)object2).FLD499;
                ((CLS316)object1).notifyDataSetChanged();
                if(!((CLS99)object2).FLD495) {
                    CLS523.MTH7157(z, new CLS18[]{((CLS1635)object0)});
                }
            }
        }
    }
}

