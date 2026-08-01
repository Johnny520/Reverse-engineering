// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS29;
import b.ˆʿ.CLS43;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS81;
import b.ˑٴ.CLS736;
import b.ˑٴ.CLS848;
import b.ᐧˉ.CLS1040;
import b.ᐧˉ.CLS1062.CLS1061;
import b.ᐧˉ.CLS1062;
import b.ᐧˉ.CLS1144;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1280;
import b.ⁱᵔ.CLS1403;
import b.ⁱᵔ.CLS1466;
import b.ⁱᵔ.CLS1526;
import b.ⁱᵔ.CLS1568;
import b.ⁱᵔ.CLS1571;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS310 implements AdapterView.OnItemLongClickListener {
    public final int FLD3200;
    public final Object FLD3201;
    public final ArrayList FLD3202;
    public final Activity FLD3203;
    public final Object FLD3204;
    public final Object FLD3205;

    public CLS310(int v, Activity activity0, Object object0, Object object1, Object object2, ArrayList arrayList0) {
        this.FLD3200 = v;
        this.FLD3204 = object0;
        this.FLD3203 = activity0;
        this.FLD3201 = object1;
        this.FLD3205 = object2;
        this.FLD3202 = arrayList0;
        super();
    }

    public CLS310(Activity activity0, Bundle bundle0, CLS335 ˑٴ0, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD3200 = 6;
        super();
        this.FLD3203 = activity0;
        this.FLD3204 = bundle0;
        this.FLD3201 = ˑٴ0;
        this.FLD3202 = arrayList0;
        this.FLD3205 = arrayList1;
    }

    public CLS310(Activity activity0, CLS43 ˆʿ0, ArrayList arrayList0, ArrayList arrayList1, CLS347 ᐧי0) {
        this.FLD3200 = 4;
        super();
        this.FLD3204 = ᐧי0;
        this.FLD3203 = activity0;
        this.FLD3201 = ˆʿ0;
        this.FLD3202 = arrayList0;
        this.FLD3205 = arrayList1;
    }

    public CLS310(Activity activity0, CLS335 ˑٴ0, JSONObject jSONObject0, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD3200 = 8;
        super();
        this.FLD3203 = activity0;
        this.FLD3201 = ˑٴ0;
        this.FLD3204 = jSONObject0;
        this.FLD3202 = arrayList0;
        this.FLD3205 = arrayList1;
    }

    public CLS310(Activity activity0, CLS366 ﾞᐧ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
        this.FLD3200 = 7;
        super();
        this.FLD3203 = activity0;
        this.FLD3204 = ﾞᐧ0;
        this.FLD3202 = arrayList0;
        this.FLD3201 = ˎᵢ0;
        this.FLD3205 = s;
    }

    public CLS310(Activity activity0, CLS366 ﾞᐧ0, CLS43 ˆʿ0, String s, ArrayList arrayList0) {
        this.FLD3200 = 5;
        super();
        this.FLD3203 = activity0;
        this.FLD3204 = ﾞᐧ0;
        this.FLD3201 = ˆʿ0;
        this.FLD3205 = s;
        this.FLD3202 = arrayList0;
    }

    public CLS310(CLS298 יʼ0, CLS335 ˑٴ0, Activity activity0, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD3200 = 0;
        super();
        this.FLD3204 = יʼ0;
        this.FLD3201 = ˑٴ0;
        this.FLD3203 = activity0;
        this.FLD3202 = arrayList0;
        this.FLD3205 = arrayList1;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        String s3;
        String s2;
        Activity activity0 = this.FLD3203;
        Object object0 = this.FLD3205;
        Object object1 = this.FLD3201;
        Object object2 = this.FLD3204;
        switch(this.FLD3200) {
            case 0: {
                ((CLS298)object2).getClass();
                Object object4 = ((CLS335)object1).getItem(v);
                CLS71 ˆٴ1 = new CLS71(activity0, null);
                ˆٴ1.MTH1572("preview", ((CLS3)new CLS1232(((ContentValues)object4), activity0, 0)));
                ˆٴ1.MTH1572("delete", ((CLS3)new CLS1234(((CLS298)object2), activity0, ((ContentValues)object4), this.FLD3202, ((ArrayList)object0), ((CLS335)object1), 0)));
                ˆٴ1.MTH1572("move_to", ((CLS3)new CLS1250(activity0, v, ((CLS335)object1), 0)));
                ˆٴ1.MTH1573();
                return true;
            }
            case 1: {
                ((CLS1062)object2).getClass();
                CLS523.MTH7142(activity0, ((CLS11)new CLS1061(((CLS369)object1), v, ((CLS81)object0), this.FLD3202)));
                return true;
            }
            case 2: {
                Object object5 = ((CLS338)object2).getItem(v);
                CLS71 ˆٴ2 = new CLS71(activity0, null);
                ˆٴ2.MTH1572("modify", ((CLS3)new CLS1235(activity0, ((ContentValues)object5), ((CLS1225)object1), ((CLS338)object2), ((CLS3)object0))));
                ˆٴ2.MTH1572("delete", ((CLS3)new CLS1235(9, activity0, ((CLS338)object2), ((ContentValues)object5), ((CLS3)object0), this.FLD3202)));
                ˆٴ2.MTH1572("move_to", ((CLS3)new CLS1144(activity0, v, ((CLS338)object2), 2)));
                ˆٴ2.MTH1573();
                return true;
            }
            case 3: {
                Object object6 = ((CLS369)object2).getItem(v);
                CLS71 ˆٴ3 = new CLS71(activity0, null);
                ˆٴ3.MTH1572("delete", ((CLS3)new CLS1403(activity0, ((HashMap)object1), ((String)object6), ((CLS79)object0), this.FLD3202, ((CLS369)object2))));
                ˆٴ3.MTH1572("modify", ((CLS3)new CLS1040(activity0, ((String)object6), ((HashMap)object1), ((CLS79)object0), this.FLD3202, v, ((CLS369)object2))));
                ˆٴ3.MTH1573();
                return true;
            }
            case 4: {
                String s = "";
                ArrayList arrayList1 = this.FLD3202;
                String s1 = (String)((CLS347)object2).getItem(v);
                new String("");
                new String("");
                new String("");
                if(TextUtils.isEmpty(s1)) {
                    s2 = "";
                }
                else {
                    if(s1.contains("[[") && s1.contains("]]")) {
                        int v2 = s1.indexOf("[[");
                        int v3 = s1.lastIndexOf("]]");
                        s = s1.substring(v2 + 2, v3);
                        s1 = CLS182.MTH3495(s1, 0, v2, new StringBuilder(), v3, 2);
                    }
                    if(!s1.contains("{") || !s1.contains("}")) {
                        s3 = "";
                    }
                    else {
                        int v4 = s1.indexOf("{");
                        int v5 = s1.lastIndexOf("}");
                        s3 = s1.substring(v4 + 1, v5);
                        s1 = CLS182.MTH3495(s1, 0, v4, new StringBuilder(), v5, 1);
                    }
                    String s4 = "";
                    if(s1.contains("((") && s1.contains("))")) {
                        int v6 = s1.indexOf("((");
                        int v7 = s1.lastIndexOf("))");
                        String s5 = s1.substring(v6 + 2, v7);
                        s1 = CLS182.MTH3495(s1, 0, v6, new StringBuilder(), v7, 2);
                        s4 = s5;
                    }
                    s3.getClass();
                    s.getClass();
                    s4.getClass();
                    s2 = s1.trim();
                }
                CLS71 ˆٴ4 = new CLS71(activity0, null);
                ˆٴ4.MTH1572("delete", ((CLS3)new CLS1280(activity0, ((CLS43)object1), s2, arrayList1, v, ((ArrayList)object0), ((CLS347)object2))));
                ˆٴ4.MTH1572("modify", ((CLS3)new CLS1280(activity0, s2, ((CLS43)object1), arrayList1, v, ((ArrayList)object0), ((CLS347)object2))));
                ˆٴ4.MTH1573();
                return true;
            }
            case 5: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1466(((CLS366)object2), v, ((CLS43)object1), ((String)object0), this.FLD3202)));
                return true;
            }
            case 6: {
                CLS71 ˆٴ5 = new CLS71(activity0, null);
                ˆٴ5.MTH1572("preview", ((CLS3)new CLS736(((Bundle)object2), ((CLS335)object1), v, activity0, 6)));
                ˆٴ5.MTH1572("delete", ((CLS3)new CLS1571(activity0, ((Bundle)object2), this.FLD3202, v, ((ArrayList)object0), ((CLS335)object1), 1)));
                ˆٴ5.MTH1572("move_to", ((CLS3)new CLS1250(activity0, v, ((CLS335)object1), 1)));
                ˆٴ5.MTH1573();
                return true;
            }
            case 7: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1526(((CLS366)object2), v, this.FLD3202, ((CLS29)object1), ((String)object0))));
                return true;
            }
            default: {
                ArrayList arrayList0 = this.FLD3202;
                CLS71 ˆٴ0 = new CLS71(activity0, null);
                Object object3 = ((CLS335)object1).getItem(v);
                if(((ContentValues)object3).containsKey("img") || ((ContentValues)object3).containsKey("vid")) {
                    ˆٴ0.MTH1572("preview", ((CLS3)new CLS1568(((JSONObject)object2), ((ContentValues)object3), activity0, 3)));
                }
                if(((ContentValues)object3).containsKey("url")) {
                    ˆٴ0.MTH1572("modify", ((CLS3)new CLS848(activity0, ((ContentValues)object3), ((JSONObject)object2), ((CLS335)object1), 24)));
                }
                ˆٴ0.MTH1572("delete", ((CLS3)new CLS1571(activity0, ((JSONObject)object2), arrayList0, v, ((ArrayList)object0), ((CLS335)object1), 2)));
                ˆٴ0.MTH1572("move_to", ((CLS3)new CLS1250(activity0, v, ((CLS335)object1), 2)));
                ˆٴ0.MTH1573();
                return true;
            }
        }
    }
}

