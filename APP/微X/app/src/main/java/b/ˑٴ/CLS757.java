// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS62;
import b.ⁱʾ.CLS335;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS757 implements CLS12 {
    public final int FLD1003;
    public final Object FLD1004;
    public final Object FLD1005;
    public final Object FLD1006;
    public final Object FLD1007;
    public final Object FLD1008;

    public CLS757(Activity activity0, CLS335 ˑٴ0, CLS1626 ـﹳ0, String s, ArrayList arrayList0) {
        this.FLD1003 = 2;
        super();
        this.FLD1005 = s;
        this.FLD1004 = arrayList0;
        this.FLD1006 = ـﹳ0;
        this.FLD1007 = ˑٴ0;
        this.FLD1008 = activity0;
    }

    public CLS757(ContentValues contentValues0, CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS1622 ˑٴ2, CLS1622 ˑٴ3) {
        this.FLD1003 = 1;
        super();
        this.FLD1006 = contentValues0;
        this.FLD1005 = ˑٴ0;
        this.FLD1007 = ˑٴ1;
        this.FLD1004 = ˑٴ2;
        this.FLD1008 = ˑٴ3;
    }

    public CLS757(CLS718 ˎـ0, String s, ArrayList arrayList0, CLS3 ˆٴ0, String s1) {
        this.FLD1003 = 0;
        super();
        this.FLD1006 = ˎـ0;
        this.FLD1005 = s;
        this.FLD1004 = arrayList0;
        this.FLD1008 = ˆٴ0;
        this.FLD1007 = s1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        Object object1 = this.FLD1007;
        Object object2 = this.FLD1008;
        Object object3 = this.FLD1004;
        Object object4 = this.FLD1005;
        Object object5 = this.FLD1006;
        switch(this.FLD1003) {
            case 0: {
                ((CLS718)object5).FLD860.FLD1153.MTH1156(((String)object4), ((ArrayList)object3));
                ((CLS3)object2).MTH774();
                ((CLS718)object5).FLD860.FLD1147.MTH1653(((String)object1));
                return;
            }
            case 1: {
                HashMap hashMap0 = (HashMap)object0;
                if(hashMap0 != null && !hashMap0.isEmpty()) {
                    if(hashMap0.containsKey("poi_name")) {
                        String s1 = (String)hashMap0.get("poi_name");
                        if(TextUtils.isEmpty(s1) && hashMap0.containsKey("address")) {
                            s1 = (String)hashMap0.get("address");
                        }
                        ((ContentValues)object5).put("poi", s1);
                        ((CLS1622)object4).MTH7277(s1);
                    }
                    if(hashMap0.containsKey("locality") && hashMap0.containsKey("sublocality") && hashMap0.containsKey("streetNum")) {
                        String s2 = ((String)hashMap0.get("locality")) + ((String)hashMap0.get("sublocality")) + ((String)hashMap0.get("streetNum"));
                        ((ContentValues)object5).put("addr", s2);
                        ((CLS1622)object1).MTH7277(s2);
                    }
                    else if(hashMap0.containsKey("address")) {
                        ((ContentValues)object5).put("addr", ((String)hashMap0.get("address")));
                        ((CLS1622)object1).MTH7277(((String)hashMap0.get("address")));
                    }
                    if(hashMap0.containsKey("lat")) {
                        ((ContentValues)object5).put("lat", ((String)hashMap0.get("lat")));
                        ((CLS1622)object3).MTH7277(((String)hashMap0.get("lat")));
                    }
                    if(hashMap0.containsKey("lng")) {
                        ((ContentValues)object5).put("lng", ((String)hashMap0.get("lng")));
                        ((CLS1622)object2).MTH7277(((String)hashMap0.get("lng")));
                    }
                }
                return;
            }
            default: {
                CLS62.FLD190.FLD189.getClass();
                String[] arr_s = CLS502.MTH6941(((String)object0));
                for(int v = 0; v < arr_s.length; ++v) {
                    ContentValues contentValues0 = CLS62.FLD190.MTH1348(arr_s[v].trim(), ((String)object4));
                    if(contentValues0 != null) {
                        contentValues0.put("desc", CLS426.MTH6119(contentValues0));
                        ((ArrayList)object3).add(contentValues0);
                    }
                }
                ((CLS1626)object5).MTH7325("" + ((ArrayList)object3).size());
                ((CLS335)object1).notifyDataSetChanged();
                String s = CLS27.MTH889("imported_n");
                Object[] arr_object = new Object[1];
                CLS62.FLD190.FLD189.getClass();
                arr_object[0] = 0;
                CLS412.MTH6013(((Activity)object2), String.format(s, arr_object));
            }
        }
    }
}

