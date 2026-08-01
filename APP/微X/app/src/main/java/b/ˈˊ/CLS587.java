// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ᵔʾ.CLS1228;
import b.ᵔʾ.CLS1235;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS443;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class CLS587 extends CLS99 {
    public final ArrayList FLD421;

    public CLS587() {
        this.FLD421 = new ArrayList();
        this.FLD501 = 4;
    }

    @Override  // b.ˈˊ.CLS99
    public boolean MTH1929() {
        return false;
    }

    @Override  // b.ˈˊ.CLS99
    public void MTH1930(Activity activity0) {
        try {
            JSONObject jSONObject0 = this.FLD421.isEmpty() ? new JSONObject() : new JSONObject(((String)this.FLD421.get(0)));
            CLS443.MTH6311(activity0, jSONObject0, new CLS1274(this, jSONObject0, 10), false);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ˈˊ.CLS99
    public boolean MTH1931() {
        return true;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public JSONObject MTH1933() {
        JSONObject jSONObject0 = ((CLS99)this).super.MTH1933();
        try {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: this.FLD421) {
                jSONArray0.put(((String)object0));
            }
            jSONObject0.put("content", jSONArray0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public String MTH1934() {
        return CLS27.MTH889("post_moment");
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public void MTH1935(JSONObject jSONObject0) {
        ((CLS99)this).super.MTH1935(jSONObject0);
        try {
            if(jSONObject0.has("content")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("content");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    String s = jSONArray0.getString(v);
                    this.FLD421.add(s);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1788(String s, ArrayList arrayList0, Set set0, CLS3 ˆٴ0) {
        if(CLS502.MTH6934(s, new String[]{"{#"}) && CLS502.MTH6934(s, new String[]{"#}"})) {
            int v = s.indexOf("{#");
            int v1 = s.indexOf("#}");
            String s1 = s.substring(v + 2, v1).trim();
            set0.add(s1);
            CLS432.MTH6179(s1, ((CLS12)new CLS593(this, set0, s1, s, v, v1, arrayList0, ˆٴ0)), null);
            return;
        }
        arrayList0.add(s);
        ˆٴ0.MTH774();
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public void MTH1936() {
        ArrayList arrayList9;
        ArrayList arrayList8;
        Set set1;
        String s3;
        Iterator iterator1;
        CLS607 ⁱˉ1;
        ArrayList arrayList7;
        ArrayList arrayList6;
        JSONObject jSONObject0;
        if(!CLS500.FLD4928.MTH6897()) {
            return;
        }
        ArrayList arrayList0 = this.FLD421;
        if(arrayList0.isEmpty()) {
            return;
        }
        List list0 = Collections.synchronizedList(new ArrayList());
        CLS1274 ﾞˎ0 = new CLS1274(list0, arrayList0, 9);
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            try {
                jSONObject0 = new JSONObject(s);
                if(jSONObject0.has("imgPaths")) {
                    ArrayList arrayList1 = new ArrayList(Arrays.asList(jSONObject0.getString("imgPaths").split(",")));
                    Set set0 = Collections.synchronizedSet(new HashSet());
                    ArrayList arrayList2 = new ArrayList();
                    for(int v = 0; v < arrayList1.size(); ++v) {
                        arrayList2.add("");
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = arrayList3;
                    ArrayList arrayList5 = arrayList2;
                    CLS607 ⁱˉ0 = new CLS607(set0, arrayList3, arrayList2, jSONObject0, list0, ﾞˎ0);
                    int v1 = 0;
                    while(v1 < arrayList1.size()) {
                        String s1 = (String)arrayList1.get(v1);
                        if(s1.startsWith("url:")) {
                            String s2 = s1.substring(4);
                            set0.add(s2);
                            arrayList6 = arrayList1;
                            CLS432.MTH6179(s2, ((CLS12)new CLS601(set0, s2, arrayList5, v1, ⁱˉ0)), null);
                        }
                        else {
                            arrayList6 = arrayList1;
                            if(CLS31.MTH1024(s1)) {
                                arrayList7 = arrayList5;
                                arrayList7.set(v1, s1);
                                goto label_40;
                            }
                        }
                        arrayList7 = arrayList5;
                    label_40:
                        ++v1;
                        arrayList5 = arrayList7;
                        arrayList1 = arrayList6;
                    }
                    if(jSONObject0.has("content")) {
                        ⁱˉ1 = ⁱˉ0;
                        this.MTH1788(jSONObject0.getString("content"), arrayList4, set0, ((CLS3)ⁱˉ1));
                    }
                    else {
                        ⁱˉ1 = ⁱˉ0;
                    }
                    ⁱˉ1.MTH774();
                    iterator1 = iterator0;
                }
                else if(jSONObject0.has("vidPath")) {
                    s3 = jSONObject0.getString("vidPath");
                    set1 = Collections.synchronizedSet(new HashSet());
                    arrayList8 = new ArrayList();
                    arrayList9 = new ArrayList();
                    iterator1 = iterator0;
                    goto label_62;
                }
                else {
                    goto label_74;
                }
                goto label_83;
            }
            catch(Throwable throwable0) {
                iterator1 = iterator0;
                goto label_82;
            }
            try {
            label_62:
                CLS607 ⁱˉ2 = new CLS607(set1, arrayList8, jSONObject0, arrayList9, list0, ﾞˎ0);
                if(s3.startsWith("url:")) {
                    String s4 = s3.substring(4);
                    set1.add(s4);
                    CLS432.MTH6179(s4, ((CLS12)new CLS1228(set1, s4, ⁱˉ2, 2)), null);
                }
                else if(CLS31.MTH1024(s3)) {
                    arrayList9.add(s3);
                }
                if(jSONObject0.has("content")) {
                    this.MTH1788(jSONObject0.getString("content"), arrayList8, set1, ((CLS3)ⁱˉ2));
                }
                ⁱˉ2.MTH774();
                goto label_83;
            label_74:
                iterator1 = iterator0;
                if(jSONObject0.has("content")) {
                    ArrayList arrayList10 = new ArrayList();
                    Set set2 = Collections.synchronizedSet(new HashSet());
                    CLS1235 ˎ0 = new CLS1235(1, set2, jSONObject0, list0, ﾞˎ0, arrayList10);
                    this.MTH1788(jSONObject0.optString("content"), arrayList10, set2, ((CLS3)ˎ0));
                }
                goto label_83;
            }
            catch(Throwable throwable0) {
            }
        label_82:
            CLS27.MTH893(throwable0);
        label_83:
            iterator0 = iterator1;
        }
        ﾞˎ0.MTH774();
    }

    @Override  // b.ˈˊ.CLS99
    public void MTH1938(Activity activity0) {
    }
}

