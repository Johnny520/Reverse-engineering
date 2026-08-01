// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS78;
import b.ˈˊ.CLS99;
import b.ˑٴ.CLS736;
import b.ˑٴ.CLS838;
import b.ᵔʾ.CLS1232;
import b.ⁱʾ.CLS316;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1532;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS200 implements AdapterView.OnItemClickListener {
    public final int FLD1916;
    public final Object FLD1917;
    public final Object FLD1918;
    public final Object FLD1919;

    public CLS200(Object object0, Object object1, Object object2, int v) {
        this.FLD1916 = v;
        this.FLD1918 = object0;
        this.FLD1917 = object1;
        this.FLD1919 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Object object0 = this.FLD1919;
        Object object1 = this.FLD1917;
        Object object2 = this.FLD1918;
        switch(this.FLD1916) {
            case 0: {
                ((CLS1078)object2).getClass();
                ((CLS1078)object2).MTH4072(((CLS99)object1), ((String)((CLS316)object0).getItem(v)), new CLS978(((CLS316)object0), 1));
                return;
            }
            case 1: {
                CLS7 יᐧ0 = (CLS7)object1;
                CLS369 ﾞᵎ0 = (CLS369)object0;
                ((Dialog[])object2)[0].dismiss();
                if(יᐧ0 != null) {
                    try {
                        יᐧ0.MTH784(((String)ﾞᵎ0.getItem(v)));
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 2: {
                Object object3 = ((CLS335)object2).getItem(v);
                if(((ContentValues)object3) != null) {
                    CLS71 ˆٴ0 = new CLS71(((Activity)object1), null);
                    ˆٴ0.MTH1572("preview", ((CLS3)new CLS1232(((Activity)object1), ((ContentValues)object3), 8)));
                    ˆٴ0.MTH1572("forward_to_friends", ((CLS3)new CLS1232(((Activity)object1), ((ContentValues)object3), 9)));
                    ˆٴ0.MTH1572("forward_to_moments", ((CLS3)new CLS1232(((Activity)object1), ((ContentValues)object3), 10)));
                    ˆٴ0.MTH1572("export_", ((CLS3)new CLS1232(((ContentValues)object3), ((Activity)object1), 11)));
                    ˆٴ0.MTH1572("delete", ((CLS3)new CLS736(((ContentValues)object3), ((ArrayList)object0), v, ((CLS335)object2), 3)));
                    ˆٴ0.MTH1573();
                }
                return;
            }
            case 3: {
                CLS372.MTH5401(((Activity)object1), ((String)object0), ((ContentValues)((CLS335)object2).getItem(v)).getAsString("wxid"));
                return;
            }
            case 4: {
                CLS12 ᵔʾ0 = (CLS12)object2;
                CLS369 ﾞᵎ1 = (CLS369)object1;
                String s1 = (String)object0;
                if(ᵔʾ0 != null) {
                    try {
                        String s2 = (String)ﾞᵎ1.getItem(v);
                        ᵔʾ0.MTH791(CLS27.MTH895().MTH924(s1 + s2, new JSONObject()));
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 5: {
                String s3 = (String)((CLS369)object2).getItem(v);
                ArrayList arrayList0 = new ArrayList();
                CLS369 ﾞᵎ2 = new CLS369(((Activity)object1), arrayList0);
                String s4 = CLS27.MTH904();
                HashMap hashMap0 = new HashMap();
                AlertDialog[] arr_alertDialog = {null};
                arr_alertDialog[0] = CLS523.MTH7160(((Activity)object1), s3, ((CLS17)new CLS1089(arrayList0, hashMap0, s3, ﾞᵎ2, ((Activity)object1), s4, arr_alertDialog, ((CLS3)object0))), ((CLS11)new CLS1532()));
                return;
            }
            case 6: {
                ((int[])object2)[0] = v;
                CLS78 ˊﾞ0 = (CLS78)((CLS366)object1).getItem(v);
                ((CLS1626)object0).MTH7325("");
                ((CLS366)object1).FLD3457 = "";
                ((CLS366)object1).notifyDataSetChanged();
                return;
            }
            case 7: {
                CLS372.MTH5401(((Activity)object1), ((String)object0), "");
                return;
            }
            case 8: {
                Bundle bundle0 = (Bundle)object2;
                CLS335 ˑٴ0 = (CLS335)object1;
                Activity activity0 = (Activity)object0;
                try {
                    int v2 = bundle0.getInt("type");
                    if(v2 == 1) {
                        CLS462.MTH6489(activity0, ((ContentValues)ˑٴ0.getItem(v)).getAsString("img"));
                        return;
                    }
                    if(v2 == 15) {
                        CLS462.MTH6486(activity0, ((ContentValues)ˑٴ0.getItem(v)).getAsString("vid"));
                        return;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 9: {
                JSONObject jSONObject0 = (JSONObject)object2;
                CLS335 ˑٴ1 = (CLS335)object1;
                Activity activity1 = (Activity)object0;
                try {
                    int v3 = jSONObject0.getInt("type");
                    ContentValues contentValues0 = (ContentValues)ˑٴ1.getItem(v);
                    if(contentValues0.containsKey("img") || contentValues0.containsKey("vid")) {
                        if(v3 == 1) {
                            CLS462.MTH6489(activity1, contentValues0.getAsString("img"));
                            return;
                        }
                        if(v3 == 15) {
                            CLS462.MTH6486(activity1, contentValues0.getAsString("vid"));
                            return;
                        }
                    }
                    else if(contentValues0.containsKey("url")) {
                        CLS523.MTH7165(activity1, CLS27.MTH889("input_url"), "", contentValues0.getAsString("url"), 1, ((CLS16)new CLS838(contentValues0, v3, ˑٴ1, 8)));
                        return;
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 10: {
                String s5 = (String)((CLS369)object2).getItem(v);
                ((CLS1626)object1).MTH7325(s5);
                ((CLS369)object2).FLD3463 = s5;
                ((int[])object0)[0] = v;
                return;
            }
            default: {
                String s = (String)((CLS369)object2).getItem(v);
                if(((CLS8)object1) != null) {
                    ((CLS8)object1).MTH786(s);
                }
                ((AlertDialog[])object0)[0].dismiss();
            }
        }
    }
}

