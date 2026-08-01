// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS91;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS350;
import b.ⁱʾ.CLS353;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1392;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1626;

public final class CLS211 implements AdapterView.OnItemClickListener {
    public final int FLD2033;
    public final Object FLD2034;
    public final Object FLD2035;

    public CLS211(Object object0, Object object1, int v) {
        this.FLD2033 = v;
        this.FLD2035 = object0;
        this.FLD2034 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Object object0 = this.FLD2034;
        Object object1 = this.FLD2035;
        switch(this.FLD2033) {
            case 0: {
                ((CLS1019)object1).getClass();
                ((CLS1019)object1).MTH3824(((CLS78)((CLS350)object0).getItem(v)));
                return;
            }
            case 1: {
                CLS1062 יٴ0 = (CLS1062)object1;
                Activity activity0 = (Activity)object0;
                יٴ0.getClass();
                try {
                    String s = (String)יٴ0.FLD2278.getItem(v);
                    CLS387.MTH5601(true, activity0, ((CLS2)new CLS940(((CLS81)יٴ0.FLD2277.get(s)))), CLS404.MTH5907());
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 2: {
                ((CLS341)object1).MTH5152(v, ((boolean)(true ^ ((CLS341)object1).FLD3366[v])));
                ((CLS341)object1).notifyDataSetChanged();
                int v3 = 0;
                for(int v2 = 0; true; ++v2) {
                    boolean[] arr_z = ((CLS341)object1).FLD3366;
                    if(v2 >= arr_z.length) {
                        break;
                    }
                    if(arr_z[v2]) {
                        ++v3;
                    }
                }
                ((CLS1626)object0).MTH7325(String.valueOf(v3));
                return;
            }
            case 3: {
                ((CLS338)object1).MTH5127(v);
                ((ContentValues)((CLS338)object1).getItem(v)).put("enable", Boolean.valueOf(((CLS338)object1).MTH5134(v)));
                ((CLS3)object0).MTH774();
                return;
            }
            case 4: {
                ((ContentValues[])object1)[0] = (ContentValues)((CLS335)object0).getItem(v);
                ((CLS335)object0).FLD3337 = v;
                ((CLS335)object0).notifyDataSetChanged();
                return;
            }
            case 5: {
                CLS366 ﾞᐧ0 = (CLS366)object1;
                Activity activity1 = (Activity)object0;
                try {
                    if(CLS403.FLD3893 != null && CLS403.FLD3893.isShowing()) {
                        CLS403.FLD3893.dismiss();
                    }
                    if(CLS403.FLD3895 != null && CLS403.FLD3895.isShowing()) {
                        CLS403.FLD3895.dismiss();
                    }
                    CLS78 ˊﾞ0 = (CLS78)ﾞᐧ0.getItem(v);
                    Intent intent0 = new Intent();
                    intent0.putExtra("Chat_Mode", 1);
                    intent0.putExtra("Chat_User", "");
                    if(!CLS66.MTH1502(intent0, ".ui.chatting.ChattingUI")) {
                        intent0.setClassName(CLS390.MTH5619(activity1), CLS27.MTH897("ChattingUI"));
                        activity1.startActivity(intent0);
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 6: {
                ((CLS8)object0).MTH786(((CLS78)((CLS366)object1).getItem(v)));
                return;
            }
            case 7: {
                String s1 = (String)((CLS369)object0).getItem(v);
                CLS523.MTH7145(((Activity)object1), s1, ((CLS17)new CLS1392(((Activity)object1), s1, 2)), null);
                return;
            }
            case 8: {
                ((CLS353)object1).FLD3405 = v;
                ((ContentValues[])object0)[0] = (ContentValues)((CLS353)object1).getItem(v);
                ((CLS353)object1).notifyDataSetChanged();
                return;
            }
            default: {
                CLS91 ᵔʾ0 = (CLS91)((CLS344)object1).getItem(v);
                ((String[])object0)[0] = ᵔʾ0.MTH1735();
                ((CLS344)object1).FLD3370 = ᵔʾ0;
                ((CLS344)object1).notifyDataSetChanged();
            }
        }
    }
}

