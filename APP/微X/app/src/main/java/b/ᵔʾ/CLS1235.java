// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.media.MediaPlayer;
import android.widget.ImageView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS566;
import b.ˆʿ.CLS44;
import b.ˈˈ.CLS81;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS718;
import b.ˑٴ.CLS757;
import b.ˑٴ.CLS794;
import b.ˑٴ.CLS800;
import b.ˑٴ.CLS881;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS1062.CLS1059;
import b.ᐧˉ.CLS1062;
import b.ᐧˉ.CLS1105;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1398;
import b.ⁱᵔ.CLS1506;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395.CLS1341;
import b.ⁱᵔ.CLS395.CLS1345;
import b.ⁱᵔ.CLS395.CLS1349;
import b.ⁱᵔ.CLS395.CLS1355;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS403.CLS1377;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS462.CLS1497;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1626;
import b.ﾞᐧ.CLS557;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class CLS1235 implements CLS3 {
    public final int FLD3034;
    public final Object FLD3035;
    public final Object FLD3036;
    public final Object FLD3037;
    public final Object FLD3038;
    public final Object FLD3039;

    public CLS1235(int v, Activity activity0, Object object0, Object object1, Object object2, ArrayList arrayList0) {
        this.FLD3034 = v;
        this.FLD3038 = activity0;
        this.FLD3036 = object0;
        this.FLD3037 = arrayList0;
        this.FLD3035 = object1;
        this.FLD3039 = object2;
        super();
    }

    public CLS1235(int v, Object object0, Object object1, Object object2, Object object3, ArrayList arrayList0) {
        this.FLD3034 = v;
        this.FLD3036 = object0;
        this.FLD3037 = arrayList0;
        this.FLD3038 = object1;
        this.FLD3035 = object2;
        this.FLD3039 = object3;
        super();
    }

    public CLS1235(Activity activity0, ContentValues contentValues0, CLS1225 ʻˏ0, CLS338 יᐧ0, CLS3 ˆٴ0) {
        this.FLD3034 = 8;
        super();
        this.FLD3038 = activity0;
        this.FLD3035 = contentValues0;
        this.FLD3036 = ʻˏ0;
        this.FLD3037 = יᐧ0;
        this.FLD3039 = ˆٴ0;
    }

    public CLS1235(Activity activity0, Object object0, Object object1, Object object2, Object object3, int v) {
        this.FLD3034 = v;
        this.FLD3038 = activity0;
        this.FLD3036 = object0;
        this.FLD3035 = object1;
        this.FLD3037 = object2;
        this.FLD3039 = object3;
        super();
    }

    public CLS1235(Activity activity0, ArrayList arrayList0, CLS29 ˎᵢ0, String s, String s1) {
        this.FLD3034 = 13;
        super();
        this.FLD3038 = activity0;
        this.FLD3037 = arrayList0;
        this.FLD3036 = ˎᵢ0;
        this.FLD3035 = s;
        this.FLD3039 = s1;
    }

    public CLS1235(ContentValues contentValues0, CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS1622 ˑٴ2, CLS1622 ˑٴ3) {
        this.FLD3034 = 10;
        super();
        this.FLD3035 = contentValues0;
        this.FLD3036 = ˑٴ0;
        this.FLD3038 = ˑٴ1;
        this.FLD3037 = ˑٴ2;
        this.FLD3039 = ˑٴ3;
    }

    public CLS1235(CLS794 ᴵʽ0, String s, Activity activity0, CLS3 ˆٴ0, String s1) {
        this.FLD3034 = 2;
        super();
        this.FLD3036 = ᴵʽ0;
        this.FLD3035 = s;
        this.FLD3038 = activity0;
        this.FLD3037 = ˆٴ0;
        this.FLD3039 = s1;
    }

    public CLS1235(Object object0, Object object1, Object object2, Object object3, Object object4, int v) {
        this.FLD3034 = v;
        this.FLD3036 = object0;
        this.FLD3038 = object1;
        this.FLD3035 = object2;
        this.FLD3037 = object3;
        this.FLD3039 = object4;
        super();
    }

    public CLS1235(ArrayList arrayList0, Activity activity0, HashMap hashMap0, String s, CLS363 ﾞٴ0) {
        this.FLD3034 = 12;
        super();
        this.FLD3037 = arrayList0;
        this.FLD3038 = activity0;
        this.FLD3036 = hashMap0;
        this.FLD3035 = s;
        this.FLD3039 = ﾞٴ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Object object0 = this.FLD3039;
        Object object1 = this.FLD3037;
        Object object2 = this.FLD3035;
        Object object3 = this.FLD3038;
        Object object4 = this.FLD3036;
        switch(this.FLD3034) {
            case 0: {
                ((CLS298)object4).getClass();
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS1226(((CLS298)object4), ((ContentValues)object2), ((ArrayList)object1), ((CLS335)object0))));
                return;
            }
            case 1: {
                ArrayList arrayList0 = (ArrayList)object1;
                JSONObject jSONObject0 = (JSONObject)object3;
                if(((Set)object4).isEmpty() && !arrayList0.isEmpty()) {
                    try {
                        jSONObject0.put("content", arrayList0.get(0));
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    ((List)object2).add(jSONObject0.toString());
                    ((CLS3)object0).MTH774();
                }
                return;
            }
            case 2: {
                ArrayList arrayList1 = ((CLS794)object4).FLD1147.MTH1634(((String)object2));
                ArrayList arrayList2 = new ArrayList();
                Iterator iterator0 = arrayList1.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList2.add("");
                }
                CLS387.MTH5585(false, ((Activity)object3), arrayList1, ((CLS2)new CLS718(((CLS794)object4), ((String)object2), ((Activity)object3), ((CLS3)object1), arrayList2, ((String)object0))), "", -1);
                return;
            }
            case 3: {
                ((CLS881)object4).getClass();
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS800(((CLS881)object4), ((File)object2), ((ImageView)object1), ((String)object0))));
                return;
            }
            case 4: {
                ((CLS1105)object4).getClass();
                new String("WxRpCustomTempl_");
                CLS403.MTH5868(((Activity)object3), CLS27.MTH889("apply_template"), "WxRpCustomTemplates", "WxRpCustomTempl_", ((CLS12)new CLS566(((CLS1105)object4), ((String)object2), ((CLS380[])object1), ((String)object0), 3)));
                return;
            }
            case 5: {
                ((CLS1062)object4).getClass();
                HashSet hashSet0 = new HashSet();
                for(Object object5: ((CLS1062)object4).FLD2276.MTH1198()) {
                    hashSet0.addAll(((CLS81)object5).FLD309);
                }
                for(Object object6: ((ArrayList)object1)) {
                    hashSet0.remove(((String)object6));
                }
                if(!hashSet0.isEmpty()) {
                    CLS523.MTH7146(((Activity)object3), CLS27.MTH889("tags"), new ArrayList(hashSet0), ((CLS8)new CLS1059(((CLS81)object2), ((ArrayList)object1), ((CLS369)object0))), null);
                }
                return;
            }
            case 6: {
                CLS395.MTH5735(((Activity)object3), 2, ((String)object4), "", (((HashMap)object2).containsKey(((String)object4)) ? ((String)((HashMap)object2).get(((String)object4))) : ""), ((CLS8)new CLS1355(((Activity)object3), ((CLS29)object1), ((String)object0), ((String)object4))));
                return;
            }
            case 7: {
                CLS395.MTH5729(((Activity)object3), ((CLS8)new CLS1345(((CLS1225)object4), ((ArrayList)object1), ((CLS338)object2), ((CLS3)object0))), "");
                return;
            }
            case 8: {
                String s = ((ContentValues)object2).getAsString("timeframe");
                CLS395.MTH5729(((Activity)object3), ((CLS8)new CLS1341(((CLS1225)object4), ((ContentValues)object2), ((CLS338)object1), ((CLS3)object0))), s);
                return;
            }
            case 9: {
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS1349(((CLS338)object4), ((ArrayList)object1), ((ContentValues)object2), ((CLS3)object0))));
                return;
            }
            case 10: {
                Object[] arr_object = {new CLS757(((ContentValues)object2), ((CLS1622)object4), ((CLS1622)object3), ((CLS1622)object1), ((CLS1622)object0))};
                CLS21.FLD76.MTH818("getLatLng", arr_object);
                return;
            }
            case 11: {
                CLS523.MTH7165(((Activity)object3), CLS27.MTH889("create_tag"), "", "", 1, ((CLS16)new CLS612(((HashMap)object4), ((CLS1620)object2), ((String)object1), ((CLS363)object0), 27)));
                return;
            }
            case 12: {
                if(!((ArrayList)object1).isEmpty()) {
                    CLS523.MTH7163(false, ((Activity)object3), CLS27.MTH889("add_to_tag"), new ArrayList(((HashMap)object4).keySet()), ((CLS7)new CLS1049(((HashMap)object4), ((String)object2), ((CLS363)object0), 24)));
                }
                return;
            }
            case 13: {
                CLS523.MTH7144(((Activity)object3), ((CLS8)new CLS1377(((Activity)object3), ((CLS29)object4), ((String)object2), ((String)object0))), null, ((ArrayList)object1));
                return;
            }
            case 14: {
                Object[] arr_object1 = {new CLS1497(((String[])object4), ((CLS1626)object3), ((CLS1626)object2), ((CLS557[])object1), ((MediaPlayer)object0))};
                CLS21.FLD76.MTH818("selectVid", arr_object1);
                return;
            }
            case 15: {
                CLS523.MTH7165(((Activity)object3), CLS27.MTH889("add"), "", "", 1, ((CLS16)new CLS1506(((String)object4), ((ArrayList)object1), ((CLS44)object2), ((CLS344)object0), 9)));
                return;
            }
            default: {
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS1398(((CLS366)object0), ((CLS29)object4), ((String)object2), ((ArrayList)object1))));
            }
        }
    }
}

