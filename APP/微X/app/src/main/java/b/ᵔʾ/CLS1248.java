// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˊﾞ.CLS612;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1134;
import b.ᐧˉ.CLS181;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS253;
import b.ⁱʾ.CLS350;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1426;
import b.ⁱᵔ.CLS1543;
import b.ⁱᵔ.CLS1586;
import b.ⁱᵔ.CLS1610;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS381;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS513;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class CLS1248 implements CLS13, CLS16, CLS17, CLS39, CLS379 {
    public final Object FLD3119;
    public final ArrayList FLD3120;
    public final Object FLD3121;
    public final Object FLD3122;
    public final int FLD3123;
    public final Object FLD3124;
    public final Object FLD3125;

    public CLS1248(CLS29 ˎᵢ0, String s, String s1, ArrayList arrayList0, int v, String s2, CLS369 ﾞᵎ0) {
        this.FLD3119 = ˎᵢ0;
        this.FLD3121 = s;
        this.FLD3124 = s1;
        this.FLD3120 = arrayList0;
        this.FLD3123 = v;
        this.FLD3122 = s2;
        this.FLD3125 = ﾞᵎ0;
    }

    public CLS1248(CLS1019 ˎʻ0, Activity activity0, CLS350 ᐧⁱ0, int v, ArrayList arrayList0, ArrayList arrayList1, HashSet hashSet0) {
        this.FLD3119 = ˎʻ0;
        this.FLD3121 = activity0;
        this.FLD3124 = ᐧⁱ0;
        this.FLD3123 = v;
        this.FLD3120 = arrayList0;
        this.FLD3125 = arrayList1;
        this.FLD3122 = hashSet0;
    }

    public CLS1248(CLS280 ʻᵎ0, CLS12 ᵔʾ0, Object object0, String s, int v, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD3119 = ʻᵎ0;
        this.FLD3122 = ᵔʾ0;
        this.FLD3124 = object0;
        this.FLD3121 = s;
        this.FLD3123 = v;
        this.FLD3120 = arrayList0;
        this.FLD3125 = arrayList1;
    }

    public CLS1248(CLS280 ʻᵎ0, String s, CLS1228 ʾˈ0, String s1, int v, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD3119 = ʻᵎ0;
        this.FLD3121 = s;
        this.FLD3122 = ʾˈ0;
        this.FLD3124 = s1;
        this.FLD3123 = v;
        this.FLD3120 = arrayList0;
        this.FLD3125 = arrayList1;
    }

    public CLS1248(CLS1624 יﹳ0, CLS363 ﾞٴ0, Activity activity0, String s, ArrayList arrayList0) {
        this.FLD3119 = יﹳ0;
        this.FLD3122 = ﾞٴ0;
        this.FLD3125 = activity0;
        this.FLD3121 = s;
        this.FLD3123 = -1;
        this.FLD3124 = null;
        this.FLD3120 = arrayList0;
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS280 ʻᵎ0 = (CLS280)this.FLD3119;
        String s = (String)this.FLD3121;
        CLS12 ᵔʾ0 = (CLS12)this.FLD3122;
        String s1 = (String)this.FLD3124;
        int v = this.FLD3123;
        ArrayList arrayList0 = this.FLD3120;
        ArrayList arrayList1 = (ArrayList)this.FLD3125;
        ʻᵎ0.getClass();
        Object object0 = CLS66.MTH1516(s);
        if(object0 == null) {
            CLS280.MTH4660(ᵔʾ0, -1);
            return;
        }
        Object object1 = ((LinkedList)CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3195(object0, CLS27.MTH897("snsSightMethod5"), new Object[0]), CLS27.MTH897("snsContentLinkField")), CLS27.MTH897("snsSightField3"))).get(0);
        CLS466.MTH6517(object1, s, ((CLS13)new CLS1248(ʻᵎ0, ᵔʾ0, object1, s1, v, arrayList0, arrayList1)), false);
    }

    @Override  // b.ʻˑ.CLS13
    public final void MTH770(String s) {
        CLS280 ʻᵎ0 = (CLS280)this.FLD3119;
        CLS12 ᵔʾ0 = (CLS12)this.FLD3122;
        Object object0 = this.FLD3124;
        String s1 = (String)this.FLD3121;
        int v = this.FLD3123;
        ArrayList arrayList0 = this.FLD3120;
        ArrayList arrayList1 = (ArrayList)this.FLD3125;
        ʻᵎ0.getClass();
        if(!CLS31.MTH1024(s)) {
            CLS280.MTH4660(ᵔʾ0, -1);
            return;
        }
        CLS1231 ˉᐧ0 = new CLS1231(v, ʻᵎ0, ᵔʾ0, object0, s, s1, arrayList0, arrayList1);
        CLS40.FLD157.MTH1123(((CLS39)ˉᐧ0), 3000L);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        HashMap hashMap2;
        HashMap hashMap1;
        CLS1624 יﹳ0 = (CLS1624)this.FLD3119;
        CLS363 ﾞٴ0 = (CLS363)this.FLD3122;
        Activity activity0 = (Activity)this.FLD3125;
        String s = (String)this.FLD3121;
        String s1 = (String)this.FLD3124;
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        ((CLS1624)this.FLD3119).FLD5272.setChoiceMode(2);
        ((CLS1624)this.FLD3119).FLD5274 = new CLS1426(ﾞٴ0, 0);
        ((CLS1624)this.FLD3119).MTH7302();
        ((CLS1624)this.FLD3119).MTH7303(ﾞٴ0);
        ((CLS1624)this.FLD3119).FLD5276 = false;
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        CLS1620 ˊˏ0 = new CLS1620(activity0);
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        CLS525 ʻˑ0 = new CLS525(activity0, linearLayout0, menu0);
        ʻˑ0.MTH7187("clear", ((CLS3)new CLS1610(ﾞٴ0, ـﹳ0, 0)));
        ʻˑ0.MTH7187("inverse", ((CLS3)new CLS1610(ﾞٴ0, ـﹳ0, 1)));
        ʻˑ0.MTH7187("custom_select", ((CLS3)new CLS1586(activity0, ﾞٴ0, ـﹳ0, 0)));
        ʻˑ0.MTH7187("random", ((CLS3)new CLS1586(activity0, ﾞٴ0, ـﹳ0, 1)));
        if(CLS27.MTH902("multi_at_tags")) {
            hashMap1 = hashMap0;
            ʻˑ0.MTH7187("create_tag", ((CLS3)new CLS1235(activity0, hashMap0, ˊˏ0, s, ﾞٴ0, 11)));
            ʻˑ0.MTH7187("delete_tag", ((CLS3)new CLS1543(0, activity0, ˊˏ0, s, hashMap1)));
            ʻˑ0.MTH7187("rename_tag", ((CLS3)new CLS1543(1, activity0, ˊˏ0, s, hashMap1)));
            ʻˑ0.MTH7187("add_to_tag", ((CLS3)new CLS1235(arrayList0, activity0, hashMap1, s, ﾞٴ0)));
        }
        else {
            hashMap1 = hashMap0;
        }
        ʻˑ0.MTH7188();
        int v = CLS523.MTH7137(15);
        CLS1623 יᐧ0 = new CLS1623(activity0);
        ـﹳ0.MTH800(CLS27.MTH889("selected"));
        ـﹳ0.FLD5295 = false;
        ـﹳ0.FLD5301 = true;
        יᐧ0.MTH7296(ـﹳ0);
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        ﾞᵎ0.MTH800(CLS27.MTH889("select_all"));
        ﾞᵎ0.MTH7438(new CLS381(ﾞٴ0, ـﹳ0, 0));
        יᐧ0.MTH7296(ﾞᵎ0);
        if(CLS27.MTH902("multi_at_tags")) {
            ˊˏ0.FLD5220 = true;
            יᐧ0.MTH7296(ˊˏ0);
            arrayList0.add(CLS27.MTH889("tags"));
            JSONObject jSONObject0 = CLS27.MTH895().MTH924(CLS182.MTH3484(4101210996901466933L, new StringBuilder(), s), new JSONObject());
            try {
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s2 = (String)object0;
                    String s3 = jSONObject0.getString(s2);
                    hashMap2 = hashMap1;
                    try {
                        hashMap2.put(s3, s2);
                        arrayList0.add(s3);
                        hashMap1 = hashMap2;
                    }
                    catch(Throwable throwable0) {
                        goto label_61;
                    }
                }
                hashMap2 = hashMap1;
                goto label_62;
            }
            catch(Throwable throwable0) {
                hashMap2 = hashMap1;
            }
        label_61:
            CLS27.MTH893(throwable0);
        label_62:
            ˊˏ0.MTH7248(((CLS533)new CLS612(hashMap2, s, ﾞٴ0, ـﹳ0, 26)));
            ˊˏ0.MTH7247(arrayList0);
        }
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        יﹳ0.MTH7301(new CLS513(this.FLD3123, ﾞٴ0, ـﹳ0, 0));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
        if(!TextUtils.isEmpty(s1)) {
            String[] arr_s = CLS502.MTH6941(s1);
            HashSet hashSet0 = new HashSet();
            Collections.addAll(hashSet0, arr_s);
            for(int v1 = 0; v1 < this.FLD3120.size(); ++v1) {
                if(hashSet0.contains("")) {
                    ﾞٴ0.MTH5262(v1, true);
                }
            }
            ﾞٴ0.notifyDataSetChanged();
            ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = ((CLS29)this.FLD3119).MTH924(CLS182.MTH3476(((String)this.FLD3121), ((String)this.FLD3124)), jSONObject0);
        ((CLS29)this.FLD3119).MTH922(jSONObject1, ((String)this.FLD3121) + s);
        this.FLD3120.remove(((String)this.FLD3124));
        this.FLD3120.add(this.FLD3123, s);
        String s1 = TextUtils.join(",", this.FLD3120);
        ((CLS29)this.FLD3119).MTH922(s1, ((String)this.FLD3122));
        ((CLS369)this.FLD3125).notifyDataSetChanged();
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        ((CLS1019)this.FLD3119).getClass();
        CLS1624 יﹳ0 = new CLS1624(((Activity)this.FLD3121));
        יﹳ0.MTH7311();
        יﹳ0.MTH7303(((CLS350)this.FLD3124));
        יﹳ0.MTH7308(5);
        יﹳ0.MTH7301(new CLS253(this.FLD3123, ((CLS350)this.FLD3124), ((Activity)this.FLD3121), this.FLD3120));
        יﹳ0.MTH7305(new CLS181(((CLS1019)this.FLD3119), ((Activity)this.FLD3121), ((CLS350)this.FLD3124), this.FLD3120, ((ArrayList)this.FLD3125), ((HashSet)this.FLD3122)));
        יﹳ0.FLD5274 = new CLS1134(((CLS350)this.FLD3124), 1);
        יﹳ0.MTH7302();
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}

