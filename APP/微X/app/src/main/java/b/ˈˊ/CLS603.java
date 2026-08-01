// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS43;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS79;
import b.יᐧ.CLS151.CLS149;
import b.יᐧ.CLS151;
import b.יﹳ.CLS166;
import b.ᵔʾ.CLS1225;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS1627;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS603 extends CLS99 {
    public final ArrayList FLD463;
    public String FLD464;
    public String FLD465;
    public String FLD466;
    public final ArrayList FLD467;

    // 此方法包含解密的字符串
    public CLS603() {
        this.FLD464 = "";
        this.FLD465 = "";
        this.FLD466 = "";
        this.FLD463 = new ArrayList();
        this.FLD467 = new ArrayList();
        this.FLD501 = 16;
        this.FLD500 = true;
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1929() {
        return true;
    }

    @Override  // b.ˈˊ.CLS99
    public final void MTH1930(Activity activity0) {
    }

    @Override  // b.ˈˊ.CLS99
    public final boolean MTH1931() {
        return false;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final JSONObject MTH1933() {
        JSONObject jSONObject0 = ((CLS99)this).super.MTH1933();
        try {
            jSONObject0.put("msgIds", TextUtils.join(",", this.FLD467));
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: this.FLD463) {
                jSONArray0.put(((String)object0));
            }
            jSONObject0.put("target", jSONArray0);
            jSONObject0.put("chatroom_tag", this.FLD465);
            jSONObject0.put("contact_tag", this.FLD464);
            jSONObject0.put("chat_container", this.FLD466);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final String MTH1934() {
        return CLS27.MTH889("forward_to_friends");
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final void MTH1935(JSONObject jSONObject0) {
        ((CLS99)this).super.MTH1935(jSONObject0);
        try {
            boolean z = jSONObject0.has("msgId");
            ArrayList arrayList0 = this.FLD467;
            if(z) {
                arrayList0.add(jSONObject0.getLong("msgId"));
            }
            if(jSONObject0.has("msgIds")) {
                String[] arr_s = jSONObject0.getString("msgIds").split(",");
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    arrayList0.add(Long.parseLong(arr_s[v1].trim()));
                }
            }
            if(jSONObject0.has("target")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("target");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    String s = jSONArray0.getString(v);
                    ArrayList arrayList1 = this.FLD463;
                    if(!arrayList1.contains(s)) {
                        arrayList1.add(s);
                    }
                }
            }
            this.FLD466 = jSONObject0.optString("chat_container");
            this.FLD465 = jSONObject0.optString("chatroom_tag");
            this.FLD464 = jSONObject0.optString("contact_tag");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1883(Activity activity0) {
        public final class CLS602 implements CLS2 {
            public final CLS603 FLD462;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS603.this.FLD463.clear();
                List list0 = Arrays.asList(CLS502.MTH6941(s));
                CLS603.this.FLD463.addAll(list0);
            }
        }

        HashSet hashSet0 = new HashSet();
        String s = CLS27.MTH904();
        CLS371.FLD3470.MTH5314(s, hashSet0);
        CLS387.MTH5585(false, activity0, CLS372.MTH5414(hashSet0), ((CLS2)new CLS602(this)), TextUtils.join(",", this.FLD463), -1);
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final void MTH1936() {
        ArrayList arrayList0 = this.FLD463;
        HashSet hashSet0 = new HashSet();
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            hashSet0.addAll(arrayList0);
        }
        if(!TextUtils.isEmpty(this.FLD465)) {
            String s = ((CLS43)CLS40.FLD157.MTH1118(CLS43.class)).MTH1162(this.FLD465);
            if(!TextUtils.isEmpty(s)) {
                String[] arr_s = CLS502.MTH6941(s);
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    String s1 = arr_s[v1];
                    if(CLS371.FLD3470.MTH5383(s1)) {
                        hashSet0.add(s1);
                    }
                }
            }
        }
        if(!TextUtils.isEmpty(this.FLD464)) {
            for(Object object0: CLS371.FLD3470.MTH5328(this.FLD464)) {
                String s2 = (String)object0;
                if(CLS371.FLD3470.MTH5382(s2)) {
                    hashSet0.add(s2);
                }
            }
        }
        if(!TextUtils.isEmpty(this.FLD466)) {
            for(Object object1: CLS79.FLD292.MTH1655(this.FLD466)) {
                String s3 = (String)object1;
                if(CLS371.FLD3470.MTH5382(s3)) {
                    hashSet0.add(s3);
                }
            }
        }
        if(hashSet0.isEmpty()) {
            return;
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: this.FLD467) {
            Object object3 = CLS66.MTH1495(((long)(((Long)object2))));
            if(object3 != null) {
                arrayList1.add(object3);
            }
        }
        CLS151 ˊﾞ0 = new CLS151();
        ˊﾞ0.FLD1544 = new CLS611(hashSet0);
        CLS610 ﾞٴ0 = new CLS610(0);
        CLS610 ﾞٴ1 = new CLS610(1);
        CLS610 ﾞٴ2 = new CLS610(2);
        ˊﾞ0.MTH3138(1, ((CLS149)new CLS610(3)));
        ˊﾞ0.MTH3138(0x30, ((CLS149)new CLS610(4)));
        ˊﾞ0.MTH3138(3, ((CLS149)new CLS610(5)));
        ˊﾞ0.MTH3138(34, ((CLS149)new CLS610(6)));
        ˊﾞ0.MTH3138(0x2F, ((CLS149)new CLS610(7)));
        ˊﾞ0.MTH3135(((CLS149)ﾞٴ0), new int[]{0x31000031, 0x1000031});
        ˊﾞ0.MTH3135(((CLS149)ﾞٴ1), new int[]{62, 43});
        ˊﾞ0.MTH3135(((CLS149)ﾞٴ2), new int[]{49, 0x2D000031, 0x3A000031, 0x41000031, 0x3E000031, 0x55000031, 0x54000031});
        ˊﾞ0.FLD1540 = new CLS1225(6);
        for(int v = 0; v < arrayList1.size(); ++v) {
            Object object4 = arrayList1.get(v);
            int v2 = CLS166.MTH3181(object4, "field_type");
            String s4 = (String)CLS166.MTH3194(object4, "field_content");
            String s5 = (String)CLS166.MTH3194(object4, "field_talker");
            int v3 = CLS166.MTH3181(object4, "field_isSend");
            String s6 = (String)CLS166.MTH3194(object4, "field_imgPath");
            String s7 = CLS426.MTH6106(v3, s4, s5);
            long v4 = CLS166.MTH3185(object4, "field_msgSvrId");
            long v5 = CLS166.MTH3185(object4, "field_msgId");
            Bundle bundle0 = new Bundle();
            bundle0.putInt("type", v2);
            bundle0.putInt("isSend", v3);
            bundle0.putString("content", s4);
            bundle0.putString("stripContent", s7);
            bundle0.putString("talker", s5);
            bundle0.putString("imgPath", s6);
            bundle0.putLong("msgSvrId", v4);
            bundle0.putLong("msgId", v5);
            ˊﾞ0.MTH3134(v2, bundle0);
        }
        ˊﾞ0.MTH3137();
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS99
    public final void MTH1938(Activity activity0) {
        if(CLS500.FLD4928.MTH6895("contact_tags")) {
            CLS71 ˆٴ0 = new CLS71(activity0, null);
            ˆٴ0.MTH1572("chatroom_tags", ((CLS3)new CLS586(this, activity0, 0)));
            ˆٴ0.MTH1572("contact_tags", ((CLS3)new CLS586(this, activity0, 1)));
            ˆٴ0.MTH1572("chatcontainer", ((CLS3)new CLS586(this, activity0, 2)));
            ˆٴ0.MTH1572("radio_friends", ((CLS3)new CLS586(this, activity0, 3)));
            ˆٴ0.MTH1572("clear", ((CLS3)new CLS1627(1, this)));
            ˆٴ0.MTH1573();
            return;
        }
        this.MTH1883(activity0);
    }
}

