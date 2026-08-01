// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS43;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS79;
import b.ˊﾞ.CLS612;
import b.ⁱʾ.CLS359;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1514;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1627;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class CLS606 extends CLS99 {
    public final ArrayList FLD470;
    public String FLD471;
    public String FLD472;
    public String FLD473;
    public final ArrayList FLD474;

    // 此方法包含解密的字符串
    public CLS606() {
        this.FLD471 = "";
        this.FLD472 = "";
        this.FLD473 = "";
        this.FLD470 = new ArrayList();
        this.FLD474 = new ArrayList();
        this.FLD501 = 3;
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1929() {
        return true;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public void MTH1930(Activity activity0) {
        public final class CLS605 implements CLS8 {
            public final CLS606 FLD469;

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                CLS606 ⁱʽ0 = CLS606.this;
                ⁱʽ0.FLD474.clear();
                for(Object object1: ((ArrayList)object0)) {
                    ContentValues contentValues0 = (ContentValues)object1;
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        for(Object object2: contentValues0.keySet()) {
                            jSONObject0.put(((String)object2), contentValues0.get(((String)object2)));
                        }
                        ⁱʽ0.FLD474.add(jSONObject0.toString());
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }

        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.FLD474) {
            String s = (String)object0;
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                ContentValues contentValues0 = new ContentValues();
                Iterator iterator1 = jSONObject0.keys();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    contentValues0.put(((String)object1), jSONObject0.getString(((String)object1)));
                }
                arrayList0.add(contentValues0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        CLS605 ⁱʽ$ᵔʾ0 = new CLS605(this);
        String s1 = CLS27.MTH889("set_content");
        CLS1624 יﹳ0 = new CLS1624(activity0);
        CLS359 ⁱˉ0 = new CLS359(activity0, arrayList0);
        CLS523.MTH7160(activity0, s1, ((CLS17)new CLS612(activity0, arrayList0, ⁱˉ0, יﹳ0, 21)), ((CLS11)new CLS1514(ⁱˉ0, ⁱʽ$ᵔʾ0)));
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1931() {
        return true;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final JSONObject MTH1933() {
        JSONObject jSONObject0 = ((CLS99)this).super.MTH1933();
        try {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: this.FLD474) {
                jSONArray0.put(((String)object0));
            }
            jSONObject0.put("content", jSONArray0);
            JSONArray jSONArray1 = new JSONArray();
            for(Object object1: this.FLD470) {
                jSONArray1.put(((String)object1));
            }
            jSONObject0.put("target", jSONArray1);
            jSONObject0.put("chatroom_tag", this.FLD472);
            jSONObject0.put("contact_tag", this.FLD471);
            jSONObject0.put("chat_container", this.FLD473);
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
        return CLS27.MTH889("send_msg");
    }

    // 此方法包含解密的字符串
    public final void MTH1901(Activity activity0) {
        public final class CLS604 implements CLS2 {
            public final CLS606 FLD468;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS606.this.FLD470.clear();
                List list0 = Arrays.asList(CLS502.MTH6941(s));
                CLS606.this.FLD470.addAll(list0);
            }
        }

        HashSet hashSet0 = new HashSet();
        String s = CLS27.MTH904();
        CLS371.FLD3470.MTH5314(s, hashSet0);
        CLS387.MTH5585(true, activity0, CLS372.MTH5414(hashSet0), ((CLS2)new CLS604(this)), TextUtils.join(",", this.FLD470), -1);
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final void MTH1935(JSONObject jSONObject0) {
        ((CLS99)this).super.MTH1935(jSONObject0);
        try {
            if(jSONObject0.has("content")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("content");
                for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                    String s = jSONArray0.getString(v1);
                    this.FLD474.add(s);
                }
            }
            if(jSONObject0.has("target")) {
                JSONArray jSONArray1 = jSONObject0.getJSONArray("target");
                for(int v = 0; v < jSONArray1.length(); ++v) {
                    String s1 = jSONArray1.getString(v);
                    ArrayList arrayList0 = this.FLD470;
                    if(!arrayList0.contains(s1)) {
                        arrayList0.add(s1);
                    }
                }
            }
            this.FLD473 = jSONObject0.optString("chat_container");
            this.FLD472 = jSONObject0.optString("chatroom_tag");
            this.FLD471 = jSONObject0.optString("contact_tag");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final HashSet MTH1903() {
        ArrayList arrayList0 = this.FLD470;
        HashSet hashSet0 = new HashSet();
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            hashSet0.addAll(arrayList0);
        }
        if(!TextUtils.isEmpty(this.FLD472)) {
            String s = ((CLS43)CLS40.FLD157.MTH1118(CLS43.class)).MTH1162(this.FLD472);
            if(!TextUtils.isEmpty(s)) {
                String[] arr_s = CLS502.MTH6941(s);
                for(int v = 0; v < arr_s.length; ++v) {
                    String s1 = arr_s[v];
                    if(CLS371.FLD3470.MTH5383(s1)) {
                        hashSet0.add(s1);
                    }
                }
            }
        }
        if(!TextUtils.isEmpty(this.FLD471)) {
            for(Object object0: CLS371.FLD3470.MTH5328(this.FLD471)) {
                String s2 = (String)object0;
                if(CLS371.FLD3470.MTH5382(s2)) {
                    hashSet0.add(s2);
                }
            }
        }
        if(!TextUtils.isEmpty(this.FLD473)) {
            for(Object object1: CLS79.FLD292.MTH1655(this.FLD473)) {
                String s3 = (String)object1;
                if(CLS371.FLD3470.MTH5382(s3)) {
                    hashSet0.add(s3);
                }
            }
        }
        return hashSet0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public void MTH1936() {
        ArrayList arrayList0 = this.FLD474;
        if(arrayList0.isEmpty()) {
            return;
        }
        HashSet hashSet0 = this.MTH1903();
        if(hashSet0.isEmpty()) {
            return;
        }
        String s = TextUtils.join(",", hashSet0);
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            String s1 = (String)object0;
            try {
                JSONObject jSONObject0 = new JSONObject(s1);
                ContentValues contentValues0 = new ContentValues();
                Iterator iterator1 = jSONObject0.keys();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    contentValues0.put(((String)object1), jSONObject0.getString(((String)object1)));
                }
                arrayList1.add(contentValues0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        long v = CLS27.MTH895().MTH938("mass_send_user_priority", false) ? 4101550179058766645L : 4101550239188308789L;
        CLS21.FLD76.MTH818(CLS370.MTH5289(v), new Object[]{s, arrayList1, Boolean.TRUE});
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public void MTH1938(Activity activity0) {
        if(CLS500.FLD4928.MTH6895("contact_tags")) {
            CLS71 ˆٴ0 = new CLS71(activity0, null);
            ˆٴ0.MTH1572("chatroom_tags", ((CLS3)new CLS608(this, activity0, 0)));
            ˆٴ0.MTH1572("contact_tags", ((CLS3)new CLS608(this, activity0, 1)));
            ˆٴ0.MTH1572("chatcontainer", ((CLS3)new CLS608(this, activity0, 2)));
            ˆٴ0.MTH1572("radio_friends", ((CLS3)new CLS608(this, activity0, 3)));
            ˆٴ0.MTH1572("clear", ((CLS3)new CLS1627(2, this)));
            ˆٴ0.MTH1573();
            return;
        }
        this.MTH1901(activity0);
    }
}

