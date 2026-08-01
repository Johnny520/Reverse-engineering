// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS86;
import b.ˈˈ.CLS91;
import b.ˈˊ.CLS99;
import b.ᵔʾ.CLS304.CLS303;
import b.ᵔʾ.CLS304;
import b.ⁱʾ.CLS316;
import b.ⁱʾ.CLS341;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS276 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2874;
    public final Object FLD2875;
    public final Object FLD2876;

    public CLS276(CLS174 ʻˑ0, CLS303 ᵔʾ$ˆٴ0) {
        this.FLD2874 = 1;
        super();
        this.FLD2875 = ʻˑ0;
        this.FLD2876 = ᵔʾ$ˆٴ0;
    }

    public CLS276(Object object0, Object object1, int v) {
        this.FLD2874 = v;
        this.FLD2876 = object0;
        this.FLD2875 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        int v = 8;
        Object object0 = this.FLD2875;
        Object object1 = this.FLD2876;
        switch(this.FLD2874) {
            case 0: {
                ((CLS303)object1).FLD3166 = z;
                ((CLS1622)object0).MTH7277((z ? ((CLS303)object1).MTH4903() : String.valueOf(((CLS303)object1).MTH4904())));
                return;
            }
            case 1: {
                ((CLS174)object0).getClass();
                ((CLS303)object1).FLD3159 = z;
                CLS304.FLD3172.MTH4909();
                ((CLS174)object0).FLD1681.notifyDataSetChanged();
                return;
            }
            case 2: {
                ((CLS244)object1).getClass();
                ((CLS91)object0).FLD386 = z;
                ((CLS244)object1).FLD2536.MTH1182(((CLS91)object0));
                ((CLS244)object1).FLD2543.notifyDataSetChanged();
                return;
            }
            case 3: {
                ((CLS210)object1).getClass();
                ((CLS91)object0).FLD386 = z;
                ((CLS210)object1).FLD2001.MTH1182(((CLS91)object0));
                ((CLS210)object1).FLD2020.notifyDataSetChanged();
                return;
            }
            case 4: {
                ((CLS1112)object1).getClass();
                ((CLS86)object0).FLD344 = z;
                ((CLS1112)object1).FLD2466.MTH1267(((CLS86)object0));
                ((CLS1112)object1).FLD2465.notifyDataSetChanged();
                return;
            }
            case 5: {
                ((CLS928)object1).getClass();
                ((CLS928)object1).FLD2151.MTH922(Boolean.valueOf(z), "persistent_special_mode_enable");
                if(((CLS928)object1).FLD2153.MTH6895("tail_mode") && !CLS182.MTH3470(0x38E9702A2B3CD335L)) {
                    CLS523.MTH7157(!z, new CLS18[]{((CLS1625)object0)});
                }
                return;
            }
            case 6: {
                ((CLS216)object1).getClass();
                CLS29 ˎᵢ0 = ((CLS216)object1).FLD2110;
                String s = ˎᵢ0.MTH925("custom_avatar_list", "");
                HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s)));
                if(!z) {
                    hashSet0.remove(((CLS216)object1).FLD2113);
                    ˎᵢ0.MTH932("custom_avatar_img_" + ((CLS216)object1).FLD2113);
                }
                else if(!CLS502.MTH6934(s, new String[]{((CLS216)object1).FLD2113})) {
                    hashSet0.add(((CLS216)object1).FLD2113);
                }
                ˎᵢ0.MTH922(TextUtils.join(",", hashSet0), "custom_avatar_list");
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(((String)object0));
                ˎᵢ0.MTH922(Boolean.valueOf(z), CLS182.MTH3475(4100648716962943797L, stringBuilder0));
                return;
            }
            case 7: {
                ((CLS1145)object1).getClass();
                ((CLS1145)object1).FLD2151.MTH922(Boolean.valueOf(z), "darkmode_follow_time");
                if(!z) {
                    v = 0;
                }
                ((CLS1635)object0).MTH801(v);
                return;
            }
            case 8: {
                ((CLS997)object1).getClass();
                if(!z) {
                    v = 0;
                }
                ((CLS1625)object0).MTH801(v);
                ((CLS997)object1).FLD2151.MTH922(Boolean.valueOf(z), "auto_comment_robot");
                return;
            }
            case 9: {
                ((CLS1105)object1).getClass();
                ((CLS1105)object1).FLD2151.MTH922(Boolean.valueOf(z), "grab_red_packet_master_enable");
                if(!z) {
                    v = 0;
                }
                ((CLS1623)object0).MTH801(v);
                return;
            }
            case 10: {
                ((CLS1105)object1).getClass();
                ((CLS1105)object1).FLD2151.MTH922(Boolean.valueOf(z), "red_packet_comp");
                if(z) {
                    v = 0;
                }
                ((CLS1629)object0).MTH801(v);
                return;
            }
            case 11: {
                JSONObject jSONObject0 = (JSONObject)object1;
                CLS1622 ˑٴ0 = (CLS1622)object0;
                try {
                    jSONObject0.put("rp_missed_toast_enable", z);
                    if(z) {
                        ˑٴ0.MTH801(0);
                        return;
                    }
                    ˑٴ0.MTH801(8);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 12: {
                ((CLS99)object1).FLD489 = z;
                ((CLS316)object0).FLD3260 = z ? ((CLS99)object1).FLD496 : ((CLS99)object1).FLD499;
                ((CLS316)object0).notifyDataSetChanged();
                return;
            }
            default: {
                if(z) {
                    for(int v2 = 0; v2 < ((CLS341)object1).FLD3365.size(); ++v2) {
                        ((CLS341)object1).MTH5152(v2, false);
                    }
                    ((CLS341)object1).notifyDataSetChanged();
                    for(int v3 = 0; v3 < ((CLS341)object1).FLD3365.size(); ++v3) {
                        ((CLS341)object1).MTH5152(v3, true);
                    }
                }
                else {
                    for(int v4 = 0; v4 < ((CLS341)object1).FLD3365.size(); ++v4) {
                        ((CLS341)object1).MTH5152(v4, false);
                    }
                }
                ((CLS341)object1).notifyDataSetChanged();
                int v5 = 0;
                for(int v1 = 0; true; ++v1) {
                    boolean[] arr_z = ((CLS341)object1).FLD3366;
                    if(v1 >= arr_z.length) {
                        break;
                    }
                    if(arr_z[v1]) {
                        ++v5;
                    }
                }
                ((CLS1626)object0).MTH7325(String.valueOf(v5));
            }
        }
    }
}

