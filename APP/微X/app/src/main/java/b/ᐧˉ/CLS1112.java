// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS56;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS86;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS116;
import b.ⁱʾ.CLS332;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1112 extends CLS219 {
    public CLS1635 FLD2447;
    public final ArrayList FLD2448;
    public CLS1635 FLD2449;
    public CLS1635 FLD2450;
    public CLS1635 FLD2451;
    public CLS1635 FLD2452;
    public final HashMap FLD2453;
    public ArrayList FLD2454;
    public CLS1635 FLD2455;
    public CLS1635 FLD2456;
    public ArrayList FLD2457;
    public CLS1635 FLD2458;
    public CLS369 FLD2459;
    public CLS1625 FLD2460;
    public CLS1635 FLD2461;
    public CLS1635 FLD2462;
    public String FLD2463;
    public String FLD2464;
    public CLS332 FLD2465;
    public final CLS56 FLD2466;
    public CLS1635 FLD2467;
    public CLS1635 FLD2468;
    public CLS1635 FLD2469;
    public CLS1626 FLD2470;
    public CLS1635 FLD2471;
    public final CLS371 FLD2472;
    public CLS1635 FLD2473;
    public CLS1635 FLD2474;
    public String FLD2475;
    public CLS1635 FLD2476;
    public CLS1635 FLD2477;
    public String FLD2478;
    public CLS1625 FLD2479;
    public CLS1635 FLD2480;
    public CLS1635 FLD2481;
    public final HashSet FLD2482;
    public CLS1635 FLD2483;

    // 此方法包含解密的字符串
    public CLS1112(String s, String s1) {
        super(s, s1);
        this.FLD2466 = (CLS56)CLS40.FLD157.MTH1118(CLS56.class);
        this.FLD2472 = CLS371.FLD3470;
        this.FLD2448 = new ArrayList();
        this.FLD2453 = new HashMap();
        this.FLD2454 = new ArrayList();
        this.FLD2482 = new HashSet();
        String s2 = this.FLD2151.MTH925("block_templates", "");
        try {
            if(!TextUtils.isEmpty(s2)) {
                JSONArray jSONArray0 = new JSONArray(s2);
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    this.FLD2482.add(jSONObject0);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD2454 = this.FLD2466.MTH1266();
        CLS1198 ﹳﹳ0 = new CLS1198(this, 2);
        CLS40.FLD157.MTH1124(((CLS39)ﹳﹳ0));
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1198(this, 1);
        ʼˎ0.FLD3526 = new CLS1069(((CLS219)this), z, z1, 1);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH4197(JSONObject jSONObject0) {
        public final class CLS1109 implements CLS2 {
            public final HashMap FLD2439;
            public final CLS1112 FLD2440;
            public final JSONObject FLD2441;

            public CLS1109(HashMap hashMap0, JSONObject jSONObject0) {
                this.FLD2439 = hashMap0;
                this.FLD2441 = jSONObject0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1112 ᐧˏ0;
                Iterator iterator0 = arrayList0.iterator();
                while(true) {
                    boolean z = iterator0.hasNext();
                    ᐧˏ0 = CLS1112.this;
                    if(!z) {
                        break;
                    }
                    iterator0.next();
                    CLS86 ٴـ0 = (CLS86)this.FLD2439.get("");
                    JSONObject jSONObject0 = this.FLD2441;
                    if(jSONObject0.has("e")) {
                        ٴـ0.FLD344 = jSONObject0.optInt("e");
                    }
                    ٴـ0.FLD349 = jSONObject0.optString("t");
                    ٴـ0.MTH1702();
                    ᐧˏ0.FLD2466.MTH1267(ٴـ0);
                }
                CLS332 ˊﾞ0 = ᐧˏ0.FLD2465;
                if(ˊﾞ0 != null) {
                    ˊﾞ0.notifyDataSetChanged();
                }
            }
        }

        if(jSONObject0 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.FLD2454) {
            hashMap0.put(((CLS86)object0).FLD346, ((CLS86)object0));
            String s = ((CLS86)object0).FLD346;
            arrayList0.add(new CLS78(s, CLS371.FLD3470.MTH5316(s)));
        }
        CLS387.MTH5585(true, ((CLS219)this).MTH3883(), arrayList0, ((CLS2)new CLS1109(this, hashMap0, jSONObject0)), "", -1);
    }

    public final void MTH4198(CLS86 ٴـ0, String s) {
        CLS523.MTH7133(((CLS219)this).MTH3883(), s, ((CLS379)new CLS1156(this, ٴـ0, 2)), null, ((CLS11)new CLS900(this)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ0.MTH800(CLS27.MTH889("enable_chatroom_blacklist"));
        boolean z3 = CLS412.MTH6002();
        ﾞᵎ0.MTH7437(this.FLD2151.MTH938("blacklist_enable", z3));
        ﾞᵎ0.MTH7438(new CLS261(1, this));
        CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
        this.FLD2465 = new CLS332(activity0, this.FLD2454);
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.FLD5274 = new CLS1198(this, 0);
        יﹳ0.MTH7302();
        יﹳ0.MTH7311();
        יﹳ0.MTH7303(this.FLD2465);
        יﹳ0.MTH7308(5);
        יﹳ0.MTH7301(new CLS247(this, 0));
        יﹳ0.MTH7305(new CLS116(4, this));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }

    // 此方法包含解密的字符串
    public final void MTH4200(JSONObject jSONObject0) {
        public final class CLS1110 implements CLS11 {
            public final CLS1622 FLD2442;
            public final CLS1112 FLD2443;
            public final JSONObject FLD2444;

            public CLS1110(CLS1622 ˑٴ0, JSONObject jSONObject0) {
                this.FLD2442 = ˑٴ0;
                this.FLD2444 = jSONObject0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    JSONObject jSONObject0 = this.FLD2444;
                    CLS1112 ᐧˏ0 = CLS1112.this;
                    String s = this.FLD2442.MTH7285();
                    if(TextUtils.isEmpty(s)) {
                        return;
                    }
                    try {
                        jSONObject0.put("n", s);
                        jSONObject0.put("t", ᐧˏ0.MTH4201());
                        jSONObject0.put("e", (ᐧˏ0.FLD2476.MTH7444() ? 1 : 0));
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                    if(!ᐧˏ0.FLD2482.contains(jSONObject0)) {
                        ᐧˏ0.FLD2482.add(jSONObject0);
                        ᐧˏ0.FLD2457.add(s);
                    }
                    try {
                        JSONArray jSONArray0 = new JSONArray();
                        for(Object object0: ᐧˏ0.FLD2482) {
                            jSONArray0.put(((JSONObject)object0));
                        }
                        ᐧˏ0.FLD2151.MTH922(jSONArray0.toString(), "block_templates");
                        CLS369 ﾞᵎ0 = ᐧˏ0.FLD2459;
                        if(ﾞᵎ0 != null) {
                            ﾞᵎ0.notifyDataSetChanged();
                        }
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        Activity activity0 = ((CLS219)this).MTH3883();
        String s = CLS27.MTH889("add");
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS523.MTH7133(activity0, s, ((CLS379)new CLS612(this, ˑٴ0, activity0, jSONObject0, 9)), ((CLS378)new CLS1156(this, jSONObject0, 3)), ((CLS11)new CLS1110(this, ˑٴ0, jSONObject0)));
    }

    // 此方法包含解密的字符串
    public final String MTH4201() {
        HashSet hashSet0 = new HashSet();
        if(this.FLD2477.MTH7444()) {
            hashSet0.add("0");
        }
        if(this.FLD2471.MTH7444()) {
            hashSet0.add("1");
        }
        if(this.FLD2451.MTH7444()) {
            hashSet0.add("2");
        }
        if(this.FLD2458.MTH7444()) {
            hashSet0.add("3");
        }
        if(this.FLD2483.MTH7444()) {
            hashSet0.add("4");
        }
        if(this.FLD2449.MTH7444()) {
            hashSet0.add("5");
        }
        if(this.FLD2462.MTH7444()) {
            hashSet0.add("6");
        }
        if(this.FLD2447.MTH7444()) {
            hashSet0.add("7");
        }
        if(this.FLD2474.MTH7444()) {
            hashSet0.add("8");
        }
        if(this.FLD2480.MTH7444()) {
            hashSet0.add("9");
        }
        if(this.FLD2452.MTH7444()) {
            hashSet0.add("10");
        }
        if(this.FLD2450.MTH7444()) {
            hashSet0.add("11");
        }
        if(this.FLD2455.MTH7444()) {
            hashSet0.add("12");
        }
        if(this.FLD2469.MTH7444()) {
            hashSet0.add("13");
        }
        if(this.FLD2481.MTH7444()) {
            hashSet0.add("15");
        }
        if(this.FLD2467.MTH7444()) {
            hashSet0.add("16");
        }
        if(this.FLD2456.MTH7444()) {
            hashSet0.add("17");
        }
        if(this.FLD2468.MTH7444()) {
            hashSet0.add("18");
        }
        if(this.FLD2473.MTH7444()) {
            hashSet0.add("19");
        }
        if(this.FLD2461.MTH7444()) {
            hashSet0.add("-1");
        }
        return TextUtils.join(",", hashSet0);
    }

    // 此方法包含解密的字符串
    public final void MTH4202(String s) {
        public final class CLS1111 implements CLS2 {
            public final String FLD2445;
            public final CLS1112 FLD2446;

            public CLS1111(String s) {
                this.FLD2445 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 去混淆评级： 低(20)
            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1112.this.FLD2151.MTH922(s, "all_" + this.FLD2445 + "_chat_blacklist_exclude");
            }
        }

        String s1 = CLS27.MTH889(("all_" + s + "_chat_blacklist"));
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS523.MTH7169(activity0, s1, ((CLS379)new CLS955(this, activity0, s, 1)));
    }

    public final int MTH4203(String s) {
        for(int v = 0; v < this.FLD2454.size(); ++v) {
            if(((CLS86)this.FLD2454.get(v)).FLD346.equals(s)) {
                return v;
            }
        }
        return -1;
    }

    public final void MTH4204(String s) {
        this.FLD2477.MTH7437(false);
        this.FLD2471.MTH7437(false);
        this.FLD2451.MTH7437(false);
        this.FLD2458.MTH7437(false);
        this.FLD2483.MTH7437(false);
        this.FLD2467.MTH7437(false);
        this.FLD2456.MTH7437(false);
        this.FLD2481.MTH7437(false);
        this.FLD2449.MTH7437(false);
        this.FLD2462.MTH7437(false);
        this.FLD2447.MTH7437(false);
        this.FLD2474.MTH7437(false);
        this.FLD2480.MTH7437(false);
        this.FLD2452.MTH7437(false);
        this.FLD2450.MTH7437(false);
        this.FLD2455.MTH7437(false);
        this.FLD2469.MTH7437(false);
        this.FLD2461.MTH7437(false);
        this.FLD2468.MTH7437(false);
        this.FLD2473.MTH7437(false);
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String[] arr_s = CLS502.MTH6941(s);
        for(int v = 0; v < arr_s.length; ++v) {
            switch(Integer.parseInt(arr_s[v])) {
                case -1: {
                    this.FLD2461.MTH7437(true);
                    break;
                }
                case 0: {
                    this.FLD2477.MTH7437(true);
                    break;
                }
                case 1: {
                    this.FLD2471.MTH7437(true);
                    break;
                }
                case 2: {
                    this.FLD2451.MTH7437(true);
                    break;
                }
                case 3: {
                    this.FLD2458.MTH7437(true);
                    break;
                }
                case 4: {
                    this.FLD2483.MTH7437(true);
                    break;
                }
                case 5: {
                    this.FLD2449.MTH7437(true);
                    break;
                }
                case 6: {
                    this.FLD2462.MTH7437(true);
                    break;
                }
                case 7: {
                    this.FLD2447.MTH7437(true);
                    break;
                }
                case 8: {
                    this.FLD2474.MTH7437(true);
                    break;
                }
                case 9: {
                    this.FLD2480.MTH7437(true);
                    break;
                }
                case 10: {
                    this.FLD2452.MTH7437(true);
                    break;
                }
                case 11: {
                    this.FLD2450.MTH7437(true);
                    break;
                }
                case 12: {
                    this.FLD2455.MTH7437(true);
                    break;
                }
                case 13: {
                    this.FLD2469.MTH7437(true);
                    break;
                }
                case 15: {
                    this.FLD2481.MTH7437(true);
                    break;
                }
                case 16: {
                    this.FLD2467.MTH7437(true);
                    break;
                }
                case 17: {
                    this.FLD2456.MTH7437(true);
                    break;
                }
                case 18: {
                    this.FLD2468.MTH7437(true);
                    break;
                }
                case 19: {
                    this.FLD2473.MTH7437(true);
                }
            }
        }
    }
}

