// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS44;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˆʿ.CLS55;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS91;
import b.ᵔʾ.CLS1259;
import b.ⁱʾ.CLS356;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS449;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS528;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS244 {
    public String FLD2535;
    public final CLS44 FLD2536;
    public WeakReference FLD2537;
    public final CLS500 FLD2538;
    public String FLD2539;
    public CLS1622 FLD2540;
    public final CLS371 FLD2541;
    public String FLD2542;
    public CLS356 FLD2543;
    public boolean FLD2544;
    public ArrayList FLD2545;
    public final String FLD2546;
    public ImageView FLD2547;
    public boolean FLD2548;
    public CLS1635 FLD2549;
    public final CLS55 FLD2550;
    public JSONObject FLD2551;
    public final CLS29 FLD2552;
    public JSONObject FLD2553;
    public String FLD2554;
    public CLS1622 FLD2555;
    public final CLS449 FLD2556;
    public final CLS47 FLD2557;

    public CLS244(Activity activity0, String s) {
        this.FLD2537 = new WeakReference(activity0);
        this.FLD2546 = s;
        this.FLD2550 = (CLS55)CLS40.FLD157.MTH1118(CLS55.class);
        this.FLD2536 = (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
        this.FLD2557 = CLS47.FLD167;
        this.FLD2556 = CLS449.FLD4410;
        this.FLD2541 = CLS371.FLD3470;
        this.FLD2538 = CLS500.FLD4928;
        this.FLD2552 = CLS27.MTH895();
    }

    // 此方法包含解密的字符串
    public final void MTH4263(CLS91 ᵔʾ0, String s) {
        Activity activity0 = this.MTH4269();
        ArrayList arrayList0 = new ArrayList();
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.MTH7311();
        יﹳ0.MTH800(CLS27.MTH889("response"));
        CLS359 ⁱˉ0 = new CLS359(activity0, arrayList0);
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        CLS1635 ﾞᵎ1 = CLS34.MTH1086(4100669027863286581L, ﾞᵎ0, activity0);
        ﾞᵎ1.MTH800(CLS27.MTH889("keyword_cooldown"));
        CLS1621 ˎᵢ0 = new CLS1621(activity0);
        ˎᵢ0.MTH800(CLS27.MTH889("keyword_cooldown_time"));
        ˎᵢ0.MTH7268(60000L);
        CLS523.MTH7135(activity0, s, ((CLS379)new CLS941(this, activity0, ﾞᵎ0, ﾞᵎ1, ˎᵢ0, ᵔʾ0, arrayList0, ⁱˉ0, יﹳ0)), ((CLS378)new CLS1161(this, activity0, arrayList0, ⁱˉ0, 1)), ((CLS11)new CLS1033(this, ﾞᵎ0, ﾞᵎ1, ˎᵢ0, ⁱˉ0, ᵔʾ0, activity0)), null);
    }

    // 此方法包含解密的字符串
    public final void MTH4264(CLS12 ᵔʾ0, JSONArray jSONArray0) {
        public final class CLS1122 implements CLS2 {
            public final ArrayList FLD2513;
            public final CLS244 FLD2514;
            public final CLS359 FLD2515;

            public CLS1122(ArrayList arrayList0, CLS359 ⁱˉ0) {
                this.FLD2513 = arrayList0;
                this.FLD2515 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                String s2 = CLS34.MTH1079(4101070431211803445L, new StringBuilder(), s, 4101070478456443701L);
                ArrayList arrayList1 = new ArrayList();
                arrayList1.add(s);
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put(CLS182.MTH3479(101, contentValues0, "type", 4101070508521214773L), CLS27.MTH889("chatroom_invite") + ": " + CLS244.this.FLD2541.MTH5316(s));
                contentValues0.put(CLS182.MTH3496(4101070611600429877L, contentValues0, s2, 4101070079024485173L), TextUtils.join(",", arrayList1));
                contentValues0.put("checked", Boolean.TRUE);
                this.FLD2513.add(contentValues0);
                this.FLD2515.MTH5235(this.FLD2513);
                this.FLD2515.MTH5231(contentValues0);
            }
        }


        public final class CLS1123 implements CLS2 {
            public final ArrayList FLD2516;
            public final CLS359 FLD2517;

            public CLS1123(ArrayList arrayList0, CLS359 ⁱˉ0) {
                this.FLD2517 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                String s2 = CLS182.MTH3484(4101014850040025909L, new StringBuilder(), s);
                ContentValues contentValues0 = new ContentValues();
                String s3 = CLS182.MTH3479(-4, contentValues0, "type", 4101014892989698869L);
                CLS182.MTH3478(4101014914464535349L, new StringBuilder(), 4101014961709175605L, s1, contentValues0, s3);
                contentValues0.put("avatar", s);
                contentValues0.put("msg", s2);
                contentValues0.put("checked", Boolean.TRUE);
                this.FLD2516.add(contentValues0);
                this.FLD2517.MTH5235(this.FLD2516);
                this.FLD2517.MTH5231(contentValues0);
            }
        }


        public final class CLS1124 implements CLS11 {
            public final CLS359 FLD2518;
            public final CLS12 FLD2519;

            public CLS1124(CLS359 ⁱˉ0, CLS12 ᵔʾ0) {
                this.FLD2519 = ᵔʾ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    CLS359 ⁱˉ0 = this.FLD2518;
                    JSONArray jSONArray0 = new JSONArray();
                    for(int v = 0; v < ⁱˉ0.getCount(); ++v) {
                        JSONObject jSONObject0 = CLS412.MTH6010(((ContentValues)ⁱˉ0.getItem(v)));
                        jSONObject0.put("checked", ⁱˉ0.MTH5240(v));
                        jSONArray0.put(jSONObject0);
                    }
                    this.FLD2519.MTH791(jSONArray0);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1125 implements CLS8 {
            public final ArrayList FLD2520;
            public final CLS244 FLD2521;
            public final CLS359 FLD2522;

            public CLS1125(ArrayList arrayList0, CLS359 ⁱˉ0) {
                this.FLD2520 = arrayList0;
                this.FLD2522 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                String s2;
                try {
                    CLS359 ⁱˉ0 = this.FLD2522;
                    ArrayList arrayList0 = this.FLD2520;
                    CLS244 ᴵʻ0 = CLS244.this;
                    for(Object object1: ((ArrayList)object0)) {
                        String s = (String)object1;
                        if(CLS502.MTH6934(s, new String[]{"com.android.providers.media.photopicker"})) {
                            String s1 = ᴵʻ0.FLD2550.MTH1255(s);
                            s2 = "#img " + s1;
                            s = ᴵʻ0.FLD2550.MTH1254(s1);
                        }
                        else {
                            s2 = "#pic " + s;
                        }
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("img", s);
                        contentValues0.put("type", -2);
                        contentValues0.put("desc", CLS27.MTH889("image"));
                        contentValues0.put("msg", s2);
                        contentValues0.put("checked", Boolean.TRUE);
                        arrayList0.add(contentValues0);
                        ⁱˉ0.MTH5235(arrayList0);
                        ⁱˉ0.MTH5231(contentValues0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1126 implements CLS2 {
            public final ContentValues FLD2523;
            public final CLS359 FLD2524;

            public CLS1126(ContentValues contentValues0, CLS359 ⁱˉ0) {
                this.FLD2524 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                ArrayList arrayList1 = new ArrayList();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList1.add("");
                    stringBuilder0.append("#chatroom ");
                    stringBuilder0.append("");
                    stringBuilder0.append("|");
                }
                stringBuilder0.deleteCharAt(stringBuilder0.lastIndexOf("|"));
                new CLS528(this.FLD2523.getAsString("msg")).FLD5165 = stringBuilder0.toString();
                this.FLD2523.put("desc", CLS27.MTH889("chatroom_invite") + ": " + CLS502.MTH6923(s1));
                this.FLD2523.put("msg", "");
                String s2 = TextUtils.join(",", arrayList1);
                this.FLD2523.put("chatrooms", s2);
                this.FLD2524.notifyDataSetChanged();
            }
        }


        public final class CLS1127 implements CLS2 {
            public final ContentValues FLD2525;
            public final CLS244 FLD2526;
            public final CLS359 FLD2527;

            public CLS1127(ContentValues contentValues0, CLS359 ⁱˉ0) {
                this.FLD2525 = contentValues0;
                this.FLD2527 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                ContentValues contentValues0 = this.FLD2525;
                ArrayList arrayList1 = new ArrayList(Arrays.asList(CLS502.MTH6941(contentValues0.getAsString("chatrooms"))));
                arrayList1.add(s);
                ArrayList arrayList2 = new ArrayList();
                for(Object object0: arrayList1) {
                    arrayList2.add(CLS244.this.FLD2541.MTH5316(((String)object0)));
                    stringBuilder0.append("#chatroom ");
                    stringBuilder0.append(((String)object0));
                    stringBuilder0.append("|");
                }
                stringBuilder0.deleteCharAt(stringBuilder0.lastIndexOf("|"));
                new CLS528(contentValues0.getAsString("msg")).FLD5165 = stringBuilder0.toString();
                contentValues0.put("desc", CLS27.MTH889("chatroom_invite") + ": " + CLS502.MTH6923(TextUtils.join(",", arrayList2)));
                contentValues0.put("msg", "");
                contentValues0.put("chatrooms", TextUtils.join(",", arrayList1));
                this.FLD2527.notifyDataSetChanged();
            }
        }


        public final class CLS1128 implements CLS8 {
            public final ArrayList FLD2528;
            public final CLS244 FLD2529;
            public final CLS359 FLD2530;

            public CLS1128(ArrayList arrayList0, CLS359 ⁱˉ0) {
                this.FLD2528 = arrayList0;
                this.FLD2530 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                String s2;
                try {
                    CLS359 ⁱˉ0 = this.FLD2530;
                    ArrayList arrayList0 = this.FLD2528;
                    CLS244 ᴵʻ0 = CLS244.this;
                    String s = (String)object0;
                    if(CLS502.MTH6934(s, new String[]{"com.android.providers.media.photopicker"})) {
                        String s1 = ᴵʻ0.FLD2550.MTH1255(s);
                        s2 = "#img " + s1;
                        s = ᴵʻ0.FLD2550.MTH1254(s1);
                    }
                    else {
                        s2 = "#pic " + s;
                    }
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("img", s);
                    contentValues0.put("type", -2);
                    contentValues0.put("desc", CLS27.MTH889("image"));
                    contentValues0.put("msg", s2);
                    contentValues0.put("checked", Boolean.TRUE);
                    arrayList0.add(contentValues0);
                    ⁱˉ0.MTH5235(arrayList0);
                    ⁱˉ0.MTH5231(contentValues0);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1129 implements CLS8 {
            public final ArrayList FLD2531;
            public final CLS359 FLD2532;

            public CLS1129(ArrayList arrayList0, CLS359 ⁱˉ0) {
                this.FLD2532 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                String s = CLS182.MTH3489(0x38E9A0302B3CD335L, new StringBuilder(), object0);
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("img", ((String)object0));
                contentValues0.put(CLS182.MTH3479(0xFFFFFFD1, contentValues0, "type", 0x38E9A03F2B3CD335L), CLS27.MTH889("gif"));
                contentValues0.put("msg", s);
                contentValues0.put("checked", Boolean.TRUE);
                this.FLD2531.add(contentValues0);
                this.FLD2532.MTH5235(this.FLD2531);
                this.FLD2532.MTH5231(contentValues0);
            }
        }


        public final class CLS1130 implements CLS8 {
            public final ArrayList FLD2533;
            public final CLS359 FLD2534;

            public CLS1130(ArrayList arrayList0, CLS359 ⁱˉ0) {
                this.FLD2534 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                if(!TextUtils.isEmpty(((String)object0))) {
                    String s = CLS182.MTH3484(0x38E9F5F72B3CD335L, new StringBuilder(), ((String)object0));
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("type", -16);
                    contentValues0.put("path", ((String)object0));
                    contentValues0.put("desc", CLS27.MTH889("video"));
                    contentValues0.put("msg", s);
                    contentValues0.put("checked", Boolean.TRUE);
                    this.FLD2533.add(contentValues0);
                    this.FLD2534.MTH5235(this.FLD2533);
                    this.FLD2534.MTH5231(contentValues0);
                }
            }
        }

        Activity activity0 = this.MTH4269();
        ArrayList arrayList0 = new ArrayList();
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.MTH7311();
        יﹳ0.MTH800(CLS27.MTH889("response"));
        CLS359 ⁱˉ0 = new CLS359(activity0, arrayList0);
        CLS523.MTH7135(activity0, CLS27.MTH889("random_response_group"), ((CLS379)new CLS580(this, jSONArray0, arrayList0, ⁱˉ0, יﹳ0, activity0)), ((CLS378)new CLS1161(this, activity0, arrayList0, ⁱˉ0, 0)), ((CLS11)new CLS1124(ⁱˉ0, ᵔʾ0)), null);
    }

    // 此方法包含解密的字符串
    private void MTH4266(Activity activity0, CLS1635 ﾞᵎ0, CLS1635 ﾞᵎ1, CLS1621 ˎᵢ0, CLS91 ᵔʾ0, ArrayList arrayList0, CLS359 ⁱˉ0, CLS1624 יﹳ0, LinearLayout linearLayout0) {
        boolean z;
        JSONObject jSONObject1;
        boolean z1;
        JSONObject jSONObject0;
        Throwable throwable2;
        int v = CLS523.MTH7137(10);
        CLS500 ᵢﹶ0 = this.FLD2538;
        if(ᵢﹶ0.MTH6895("rp_keyword") && CLS502.MTH6934(this.FLD2542, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"})) {
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            ـﹳ0.MTH798(CLS27.MTH889("rp_amount_resp_desc"));
            ـﹳ0.MTH7331();
            CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
        }
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7296(ﾞᵎ0);
        יᐧ0.MTH7296(ﾞᵎ1);
        יᐧ0.MTH7296(ˎᵢ0);
        יᐧ0.MTH7290(linearLayout0, v);
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        this.FLD2555 = ˑٴ0;
        ˑٴ0.MTH800(CLS27.MTH889("keyword"));
        CLS523.MTH7147(linearLayout0, ((CLS18)this.FLD2555), true);
        this.FLD2553 = new JSONObject();
        this.FLD2535 = null;
        if(ᵔʾ0 != null) {
            try {
                this.FLD2535 = ᵔʾ0.MTH1736();
                String s = ᵔʾ0.MTH1735();
                this.FLD2539 = s;
                if(s.startsWith("{")) {
                    try {
                        this.FLD2553 = new JSONObject(this.FLD2539);
                    }
                    catch(Throwable throwable1) {
                        throwable2 = throwable1;
                        goto label_238;
                    }
                }
                else {
                    JSONArray jSONArray0 = new JSONArray();
                    CLS371 ʻ0 = this.FLD2541;
                    if(this.FLD2539.startsWith("#chatroom")) {
                        String[] arr_s = this.FLD2539.split(Pattern.quote("|"));
                        ArrayList arrayList1 = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            String[] arr_s1 = arr_s[v1].trim().split(" ");
                            if(arr_s1.length >= 2) {
                                String s1 = arr_s1[1];
                                if(CLS426.MTH6126(s1)) {
                                    arrayList1.add(s1);
                                    arrayList2.add(ʻ0.MTH5316(s1));
                                }
                            }
                        }
                        jSONObject0 = new JSONObject();
                        jSONObject0.put("type", 101);
                        jSONObject0.put("desc", CLS27.MTH889("chatroom_invite") + ": " + CLS502.MTH6923(TextUtils.join(",", arrayList2)));
                        jSONObject0.put("msg", this.FLD2539);
                        jSONObject0.put("chatrooms", TextUtils.join(",", arrayList1));
                        z = ᵔʾ0.MTH1734() == 1;
                        goto label_171;
                    }
                    else if(this.FLD2539.startsWith("#gif")) {
                        String s9 = this.FLD2539.substring(4).trim();
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("img", s9);
                        jSONObject1.put("type", 0xFFFFFFD1);
                        jSONObject1.put("desc", CLS27.MTH889("gif"));
                        jSONObject1.put("msg", this.FLD2539);
                        z1 = ᵔʾ0.MTH1734() == 1;
                    label_200:
                        jSONObject1.put("checked", z1);
                        jSONArray0.put(jSONObject1);
                    }
                    else if(this.FLD2539.startsWith("#vid")) {
                        String s8 = this.FLD2539.substring(4).trim();
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -16);
                        jSONObject1.put("path", s8);
                        jSONObject1.put("desc", CLS27.MTH889("video"));
                        jSONObject1.put("msg", this.FLD2539);
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#fc")) {
                        String[] arr_s5 = this.FLD2539.split(" ");
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -4);
                        jSONObject1.put("desc", CLS27.MTH889("friendcard") + ": " + ʻ0.MTH5311(arr_s5[1]));
                        jSONObject1.put("avatar", arr_s5[1]);
                        jSONObject1.put("msg", this.FLD2539);
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#fav")) {
                        jSONObject0 = CLS412.MTH6010(CLS404.MTH5911(CLS449.MTH6387().MTH6388(this.FLD2539.split(" ")[1])));
                        jSONObject0.put("msg", this.FLD2539);
                        z = ᵔʾ0.MTH1734() == 1;
                    label_171:
                        jSONObject0.put("checked", z);
                        jSONArray0.put(jSONObject0);
                    }
                    else if(this.FLD2539.startsWith("#mp3")) {
                        long v2 = Long.parseLong(this.FLD2539.substring(4).trim());
                        CLS81 יᐧ1 = this.FLD2557.MTH1199(v2);
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -3);
                        jSONObject1.put("desc", "MP3: " + יᐧ1.MTH1667());
                        jSONObject1.put("msg", this.FLD2539);
                        jSONObject1.put("code", יᐧ1.MTH1663());
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#img")) {
                        String[] arr_s2 = this.FLD2539.trim().split(" ");
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -2);
                        jSONObject1.put("desc", CLS27.MTH889("image"));
                        jSONObject1.put("msg", this.FLD2539);
                        jSONObject1.put("img", this.FLD2550.MTH1254(arr_s2[1]));
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#pic")) {
                        String[] arr_s3 = this.FLD2539.trim().split(" ");
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -2);
                        jSONObject1.put("desc", CLS27.MTH889("image"));
                        jSONObject1.put("msg", this.FLD2539);
                        jSONObject1.put("img", arr_s3[1]);
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#file")) {
                        String[] arr_s4 = this.FLD2539.trim().split(" ");
                        File file0 = new File(arr_s4[1]);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", -49);
                        jSONObject2.put("desc", CLS27.MTH889("file") + ": " + file0.getName());
                        jSONObject2.put("msg", this.FLD2539);
                        jSONObject2.put("path", arr_s4[1]);
                        jSONObject2.put("checked", ᵔʾ0.MTH1734() == 1);
                        jSONArray0.put(jSONObject2);
                    }
                    else if(this.FLD2539.startsWith("#web_img")) {
                        String s7 = this.FLD2539.trim().split(" ")[1].trim();
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -101);
                        jSONObject1.put("desc", CLS27.MTH889("web_img") + ": " + s7);
                        jSONObject1.put("msg", this.FLD2539);
                        jSONObject1.put("url", s7);
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#web_text")) {
                        String s6 = this.FLD2539.trim().split(" ")[1].trim();
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -100);
                        jSONObject1.put("desc", CLS27.MTH889("web_text") + ": " + s6);
                        jSONObject1.put("msg", this.FLD2539);
                        jSONObject1.put("url", s6);
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#web_gif")) {
                        String s5 = this.FLD2539.trim().split(" ")[1].trim();
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -104);
                        jSONObject1.put("desc", CLS27.MTH889("web_gif") + ": " + s5);
                        jSONObject1.put("msg", this.FLD2539);
                        jSONObject1.put("url", s5);
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#web_vid")) {
                        String s4 = this.FLD2539.trim().split(" ")[1].trim();
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -102);
                        jSONObject1.put("desc", CLS27.MTH889("web_vid") + ": " + s4);
                        jSONObject1.put("msg", this.FLD2539);
                        jSONObject1.put("url", s4);
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#web_file")) {
                        String s2 = this.FLD2539.trim().split(" ")[1].trim();
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -103);
                        jSONObject1.put("desc", CLS27.MTH889("web_file") + ": " + s2);
                        jSONObject1.put("msg", this.FLD2539);
                        jSONObject1.put("url", s2);
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#tts")) {
                        String s3 = this.FLD2539.trim().substring(4);
                        jSONObject1 = new JSONObject();
                        jSONObject1.put("type", -103);
                        jSONObject1.put("desc", CLS27.MTH889("tts") + ": " + s3);
                        jSONObject1.put("msg", this.FLD2539);
                        jSONObject1.put("tts", s3);
                        z1 = ᵔʾ0.MTH1734() == 1;
                        goto label_200;
                    }
                    else if(this.FLD2539.startsWith("#voice") && CLS500.MTH6892().MTH6895("voice_manager")) {
                        CLS82 יﹳ1 = CLS54.MTH1245().MTH1250(this.FLD2539.trim().substring(6));
                        if(יﹳ1 != null) {
                            jSONObject1 = new JSONObject();
                            jSONObject1.put("type", -33);
                            jSONObject1.put("desc", CLS27.MTH889("voice") + ": " + יﹳ1.MTH1677());
                            jSONObject1.put("msg", this.FLD2539);
                            z1 = ᵔʾ0.MTH1734() == 1;
                            goto label_200;
                        }
                    }
                    else if(this.FLD2539.startsWith("#nudge")) {
                        jSONObject0 = new JSONObject();
                        jSONObject0.put("type", -201);
                        jSONObject0.put("desc", CLS27.MTH889("patmsg"));
                        jSONObject0.put("msg", this.FLD2539);
                        z = ᵔʾ0.MTH1734() == 1;
                        goto label_171;
                    }
                    else {
                        jSONObject0 = new JSONObject();
                        jSONObject0.put("type", 1);
                        jSONObject0.put("desc", this.FLD2539);
                        jSONObject0.put("msg", this.FLD2539);
                        z = ᵔʾ0.MTH1734() == 1;
                        goto label_171;
                    }
                    this.FLD2553.put("response", jSONArray0);
                }
                JSONObject jSONObject3 = ᵔʾ0.MTH1738();
                this.FLD2551 = jSONObject3;
                if(jSONObject3 == null && this.FLD2553.has("meta")) {
                    this.FLD2551 = this.FLD2553.getJSONObject("meta");
                }
                if(this.FLD2551 == null) {
                    this.FLD2551 = new JSONObject();
                }
                JSONArray jSONArray1 = this.FLD2553.getJSONArray("response");
                for(int v3 = 0; v3 < jSONArray1.length(); ++v3) {
                    arrayList0.add(CLS412.MTH6006(jSONArray1.getJSONObject(v3)));
                }
                ⁱˉ0.MTH5235(arrayList0);
                for(int v4 = 0; v4 < ⁱˉ0.getCount(); ++v4) {
                    ContentValues contentValues0 = (ContentValues)ⁱˉ0.getItem(v4);
                    if(contentValues0.containsKey("checked") && contentValues0.getAsBoolean("checked").booleanValue()) {
                        ⁱˉ0.MTH5227(v4, true);
                    }
                }
                ⁱˉ0.notifyDataSetChanged();
                ﾞᵎ1.MTH7437(this.FLD2551.optBoolean("keyword_cooldown"));
                ˎᵢ0.MTH7268(this.FLD2551.optLong("keyword_cooldown_time", 60000L));
                this.FLD2555.MTH7277(this.FLD2535);
                if(CLS502.MTH6927(this.FLD2535)) {
                    ﾞᵎ0.MTH7437(true);
                }
                goto label_239;
            }
            catch(Throwable throwable0) {
                throwable2 = throwable0;
            }
        label_238:
            CLS27.MTH893(throwable2);
        }
    label_239:
        if(ᵢﹶ0.MTH6895("autoreply_id")) {
            CLS1635 ﾞᵎ2 = new CLS1635(activity0);
            ﾞᵎ2.MTH800(CLS27.MTH889("specify_id"));
            try {
                JSONObject jSONObject4 = this.FLD2551;
                if(jSONObject4 == null) {
                    JSONObject jSONObject5 = new JSONObject();
                    this.FLD2551 = jSONObject5;
                    jSONObject5.put("specify_id", true);
                }
                else {
                    ﾞᵎ2.MTH7437(!jSONObject4.has("specify_id") || this.FLD2551.getBoolean("specify_id"));
                }
            }
            catch(Throwable throwable3) {
                CLS27.MTH893(throwable3);
            }
            ﾞᵎ2.MTH7438(new CLS180(this, 1));
            CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ2), true);
        }
        if(ᵢﹶ0.MTH6895("rp_keyword") && CLS502.MTH6934(this.FLD2542, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"})) {
            CLS1635 ﾞᵎ3 = new CLS1635(activity0);
            CLS1635 ﾞᵎ4 = CLS34.MTH1086(4100652530893902645L, ﾞᵎ3, activity0);
            ﾞᵎ4.MTH800(CLS27.MTH889("private_chat"));
            CLS1622 ˑٴ1 = new CLS1622(activity0);
            ˑٴ1.MTH800(CLS27.MTH889("money_amount"));
            ˑٴ1.MTH7278(0x2000);
            try {
                if(this.FLD2551 == null) {
                    JSONObject jSONObject6 = new JSONObject();
                    this.FLD2551 = jSONObject6;
                    jSONObject6.put("chatroom", true);
                    this.FLD2551.put("private", true);
                    this.FLD2551.put("amount", 0);
                }
                ﾞᵎ3.MTH7437(!this.FLD2551.has("chatroom") || this.FLD2551.getBoolean("chatroom"));
                ﾞᵎ4.MTH7437(!this.FLD2551.has("private") || this.FLD2551.getBoolean("private"));
                ˑٴ1.MTH7277(String.valueOf((this.FLD2551.has("amount") ? ((double)this.FLD2551.getInt("amount")) / 100.0 : 0.0)));
            }
            catch(Throwable throwable4) {
                CLS27.MTH893(throwable4);
            }
            ﾞᵎ3.MTH7438(new CLS180(this, 2));
            ﾞᵎ4.MTH7438(new CLS180(this, 3));
            ˑٴ1.MTH7276(((CLS539)new CLS939(this, 2)));
            CLS1623 יᐧ2 = new CLS1623(activity0);
            יᐧ2.MTH798(CLS27.MTH889("rp_amount_resp_desc"));
            יᐧ2.MTH7289(new Object[]{ﾞᵎ3, ﾞᵎ4, ˑٴ1});
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        }
        יﹳ0.MTH7303(ⁱˉ0);
        יﹳ0.MTH7308(5);
        יﹳ0.MTH7301(new CLS204(ⁱˉ0, 1));
        יﹳ0.MTH7305(new CLS208(this, activity0, arrayList0, ⁱˉ0, 1));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }

    public static void MTH4267(CLS244 ᴵʻ0, CLS91 ᵔʾ0) {
        ᴵʻ0.getClass();
        try {
            ᵔʾ0.FLD382 = ᴵʻ0.FLD2535;
            ᵔʾ0.FLD385 = ᴵʻ0.FLD2553 == null ? ᴵʻ0.FLD2539 : ᴵʻ0.FLD2553.toString();
            ᵔʾ0.FLD386 = ᴵʻ0.FLD2548 ? 1 : 0;
            JSONObject jSONObject0 = ᴵʻ0.FLD2551;
            if(jSONObject0 != null && ᴵʻ0.FLD2553 == null) {
                ᵔʾ0.MTH1740(jSONObject0);
            }
            CLS44 ˆٴ0 = ᴵʻ0.FLD2536;
            if(ˆٴ0 != null) {
                ˆٴ0.MTH1182(ᵔʾ0);
            }
            ᵔʾ0.FLD383 = ᵔʾ0.MTH1737();
            ᵔʾ0.FLD387 = ᴵʻ0.FLD2535;
            CLS356 ⁱʾ0 = ᴵʻ0.FLD2543;
            if(ⁱʾ0 != null) {
                ⁱʾ0.notifyDataSetChanged();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public static void MTH4268(CLS244 ᴵʻ0, CLS91 ᵔʾ0) {
        CLS44 ˆٴ0 = ᴵʻ0.FLD2536;
        if(ˆٴ0 != null) {
            ˆٴ0.MTH1174(ᵔʾ0);
        }
        ᴵʻ0.FLD2545.remove(ᵔʾ0);
        CLS356 ⁱʾ0 = ᴵʻ0.FLD2543;
        if(ⁱʾ0 != null) {
            ⁱʾ0.notifyDataSetChanged();
        }
        String s = ᵔʾ0.MTH1735();
        CLS55 ᐧⁱ0 = ᴵʻ0.FLD2550;
        if(s.startsWith("#img")) {
            ᐧⁱ0.MTH1252(s.substring(s.indexOf(" ")).trim());
            return;
        }
        if(s.startsWith("{")) {
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                if(jSONObject0.has("response")) {
                    JSONArray jSONArray0 = jSONObject0.getJSONArray("response");
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        String s1 = jSONArray0.getJSONObject(v).getString("msg");
                        if(s1.startsWith("#img")) {
                            ᐧⁱ0.MTH1252(s1.substring(s1.indexOf(" ")).trim());
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public final Activity MTH4269() {
        return (Activity)this.FLD2537.get();
    }

    // 此方法包含解密的字符串
    public final void MTH4270(CLS91 ᵔʾ0, String s) {
        Activity activity0 = this.MTH4269();
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        CLS1635 ﾞᵎ1 = CLS34.MTH1086(4100668220409434933L, ﾞᵎ0, activity0);
        ﾞᵎ1.MTH800(CLS27.MTH889("keyword_cooldown"));
        CLS1621 ˎᵢ0 = new CLS1621(activity0);
        ˎᵢ0.MTH800(CLS27.MTH889("keyword_cooldown_time"));
        ˎᵢ0.MTH7268(60000L);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        CLS523.MTH7133(activity0, s, ((CLS379)new CLS1181(this, activity0, ﾞᵎ0, ﾞᵎ1, ˎᵢ0, ـˏ0, ᵔʾ0)), ((CLS378)new CLS1259(this, activity0, ـˏ0, 17)), ((CLS11)new CLS1158(this, ﾞᵎ0, ﾞᵎ1, ˎᵢ0, ᵔʾ0, activity0)));
    }

    // 此方法包含解密的字符串
    public final void MTH4271(String s) {
        this.FLD2542 = s;
        boolean z = s.equals("_MONEYTRANSFER_") || CLS502.MTH6934(s, new String[]{"_REDPACKETS_"});
        try {
            this.FLD2544 = z;
            Activity activity0 = this.MTH4269();
            CLS523.MTH7143(activity0, CLS27.MTH889("title_autoresponse_keywords"), ((CLS379)new CLS1055(this, activity0)), ((CLS378)new CLS1055(this, activity0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

