// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS42;
import b.ˆʿ.CLS43;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ˑٴ.CLS766;
import b.ᐧˉ.CLS1036;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS1144;
import b.ᐧˉ.CLS1181;
import b.ᐧˉ.CLS1208;
import b.ᵔʾ.CLS1248;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS528;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS403 {
    public static AlertDialog FLD3892;
    public static Dialog FLD3893;
    public static AlertDialog FLD3894;
    public static Dialog FLD3895;

    public static void MTH5861(Activity activity0, String s, String s1, ArrayList arrayList0, CLS17 ﾞٴ0, CLS17 ﾞٴ1) {
        public final class CLS1372 implements CLS11 {
            public final CLS29 FLD3857;
            public final String FLD3858;
            public final String FLD3859;
            public final JSONObject FLD3860;

            public CLS1372(CLS29 ˎᵢ0, String s, String s1, JSONObject jSONObject0) {
                this.FLD3859 = s;
                this.FLD3858 = s1;
                this.FLD3860 = jSONObject0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                this.FLD3857.MTH922(this.FLD3860, this.FLD3859 + this.FLD3858);
            }
        }


        public final class CLS1379 implements CLS2 {
            public final CLS17 FLD3890;
            public final JSONObject FLD3891;

            public CLS1379(CLS17 ﾞٴ0, JSONObject jSONObject0) {
                this.FLD3891 = jSONObject0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                for(Object object0: arrayList0) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    CLS17 ﾞٴ0 = this.FLD3890;
                    if(ﾞٴ0 != null) {
                        ﾞٴ0.MTH796(new Object[]{"", this.FLD3891});
                    }
                }
            }
        }

        if(TextUtils.isEmpty(s1)) {
            return;
        }
        CLS29 ˎᵢ0 = (CLS29)CLS40.FLD157.MTH1118(CLS29.class);
        JSONObject jSONObject0 = ˎᵢ0.MTH924(s + s1, new JSONObject());
        CLS523.MTH7145(activity0, s1, ((CLS17)new CLS766(activity0, arrayList0, ﾞٴ1, jSONObject0, ﾞٴ0, 18, 0)), ((CLS11)new CLS1372(ˎᵢ0, s, s1, jSONObject0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5862(Activity activity0, String s, String s1) {
        public final class CLS1367 implements CLS11 {
            public final CLS42 FLD3833;
            public final ArrayList FLD3834;
            public final CLS78 FLD3835;
            public final String FLD3836;
            public final String[] FLD3837;
            public final CLS366 FLD3838;

            public CLS1367(CLS42 ʾᵢ0, String s, CLS78 ˊﾞ0, String[] arr_s, ArrayList arrayList0, CLS366 ﾞᐧ0) {
                this.FLD3836 = s;
                this.FLD3835 = ˊﾞ0;
                this.FLD3837 = arr_s;
                this.FLD3834 = arrayList0;
                this.FLD3838 = ﾞᐧ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                this.FLD3833.MTH1139(0, 0L, this.FLD3836, this.FLD3837[0], "");
                Iterator iterator0 = this.FLD3834.iterator();
                if(iterator0.hasNext()) {
                    iterator0.next();
                    iterator0.remove();
                }
                this.FLD3838.notifyDataSetChanged();
            }
        }


        public final class CLS1378 implements CLS11 {
            public final CLS366 FLD3885;
            public final ArrayList FLD3886;
            public final String FLD3887;
            public final CLS42 FLD3888;
            public final String[] FLD3889;

            public CLS1378(CLS366 ﾞᐧ0, CLS42 ʾᵢ0, String s, String[] arr_s, ArrayList arrayList0) {
                this.FLD3888 = ʾᵢ0;
                this.FLD3887 = s;
                this.FLD3889 = arr_s;
                this.FLD3886 = arrayList0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS366 ﾞᐧ0 = this.FLD3885;
                Iterator iterator0 = ﾞᐧ0.FLD3455.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    this.FLD3888.MTH1139(0, 0L, this.FLD3887, this.FLD3889[0], "");
                }
                this.FLD3886.clear();
                ﾞᐧ0.notifyDataSetChanged();
            }
        }

        ArrayList arrayList0 = new ArrayList();
        CLS523.MTH7150(activity0, CLS27.MTH889("autokick_warning_management"), ((CLS17)new CLS766(19, activity0, s1, new String[]{""}, s, arrayList0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5863(Activity activity0, CLS12 ᵔʾ0, String s) {
        String s1 = CLS27.MTH889("chatroom_tags");
        CLS369 ﾞᵎ0 = new CLS369(activity0, ((CLS43)CLS40.FLD157.MTH1118(CLS43.class)).MTH1165());
        String[] arr_s = {""};
        if(!TextUtils.isEmpty(s)) {
            arr_s[0] = s;
            ﾞᵎ0.FLD3463 = s;
        }
        CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1387(activity0, ﾞᵎ0, arr_s, 1)), ((CLS11)new CLS1596(ᵔʾ0, arr_s)));
    }

    // 此方法包含解密的字符串
    public static void MTH5864(Activity activity0, String s, ArrayList arrayList0, CLS2 ˆʿ0) {
        if(CLS403.FLD3894 != null && CLS403.FLD3894.isShowing()) {
            CLS403.FLD3894.dismiss();
        }
        String s1 = CLS27.MTH889("select");
        CLS1624 יﹳ0 = new CLS1624(activity0);
        CLS363 ﾞٴ0 = new CLS363(activity0, arrayList0, יﹳ0);
        ﾞٴ0.FLD3440 = -1;
        CLS403.FLD3894 = CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1248(יﹳ0, ﾞٴ0, activity0, s, arrayList0)), ((CLS11)new CLS1428(ﾞٴ0, ˆʿ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5865(Activity activity0, String s, String s1, String s2, CLS12 ᵔʾ0) {
        public final class CLS1374 implements CLS11 {
            public final ArrayList FLD3865;
            public final CLS369 FLD3866;
            public final String FLD3867;
            public final CLS29 FLD3868;
            public final String FLD3869;

            public CLS1374(CLS369 ﾞᵎ0, CLS29 ˎᵢ0, String s, String s1, ArrayList arrayList0) {
                this.FLD3865 = arrayList0;
                this.FLD3868 = ˎᵢ0;
                this.FLD3867 = s;
                this.FLD3869 = s1;
                this.FLD3866 = ﾞᵎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS29 ˎᵢ0;
                try {
                    ArrayList arrayList0 = this.FLD3865;
                    Iterator iterator0 = arrayList0.iterator();
                    while(true) {
                        boolean z = iterator0.hasNext();
                        ˎᵢ0 = this.FLD3868;
                        if(!z) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        ˎᵢ0.MTH932(this.FLD3867 + ((String)object0));
                    }
                    ˎᵢ0.MTH932(this.FLD3869);
                    arrayList0.clear();
                    this.FLD3866.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1376 implements CLS11 {
            public final CLS29 FLD3875;
            public final String FLD3876;
            public final String FLD3877;
            public final String FLD3878;
            public final ArrayList FLD3879;
            public final CLS369 FLD3880;

            public CLS1376(CLS29 ˎᵢ0, String s, String s1, ArrayList arrayList0, String s2, CLS369 ﾞᵎ0) {
                this.FLD3878 = s;
                this.FLD3877 = s1;
                this.FLD3879 = arrayList0;
                this.FLD3876 = s2;
                this.FLD3880 = ﾞᵎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    this.FLD3875.MTH932(this.FLD3878 + this.FLD3877);
                    this.FLD3879.remove(this.FLD3877);
                    String s = TextUtils.join(",", this.FLD3879);
                    this.FLD3875.MTH922(s, this.FLD3876);
                    this.FLD3880.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1377 implements CLS8 {
            public final CLS29 FLD3881;
            public final String FLD3882;
            public final String FLD3883;
            public final Activity FLD3884;

            public CLS1377(Activity activity0, CLS29 ˎᵢ0, String s, String s1) {
                this.FLD3881 = ˎᵢ0;
                this.FLD3883 = s;
                this.FLD3882 = s1;
                this.FLD3884 = activity0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object1: ((ArrayList)object0)) {
                        JSONObject jSONObject0 = new JSONObject();
                        JSONObject jSONObject1 = this.FLD3881.MTH924(this.FLD3883 + ((String)object1), jSONObject0);
                        jSONObject1.put("templateName", ((String)object1));
                        jSONObject1.put(this.FLD3882, true);
                        jSONArray0.put(jSONObject1);
                    }
                    if(jSONArray0.length() == 0) {
                        return;
                    }
                    String s = CLS27.MTH889("export_");
                    String s1 = CLS27.MTH889("input_filename");
                    CLS1208 ﹶﹶ0 = new CLS1208(this.FLD3884, jSONArray0, 2);
                    CLS523.MTH7165(this.FLD3884, s, s1, "", 1, ((CLS16)ﹶﹶ0));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        Object object0 = CLS40.FLD157.MTH1118(CLS29.class);
        ArrayList arrayList0 = new ArrayList(Arrays.asList(((CLS29)object0).MTH925(s1, "").split(",")));
        CLS369 ﾞᵎ0 = new CLS369(activity0, arrayList0);
        CLS523.MTH7143(activity0, s, ((CLS379)new CLS1181(activity0, ﾞᵎ0, ᵔʾ0, ((CLS29)object0), s2, arrayList0, s1, 3)), ((CLS378)new CLS580(activity0, arrayList0, ((CLS29)object0), s1, s2, ﾞᵎ0)));
    }

    public static void MTH5866(Activity activity0, String s) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s);
        CLS403.MTH5872(false, activity0, arrayList0, null);
    }

    // 此方法包含解密的字符串
    public static void MTH5867(Activity activity0, CLS12 ᵔʾ0, String s) {
        String s1 = CLS27.MTH889("chatcontainer");
        CLS79 ˎᵢ0 = CLS79.FLD292;
        HashMap hashMap0 = new HashMap();
        String[] arr_s = CLS502.MTH6941(ˎᵢ0.MTH1624());
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            if(s2.startsWith("wx__c_")) {
                hashMap0.put(ˎᵢ0.MTH1625(s2), s2);
            }
        }
        CLS369 ﾞᵎ0 = new CLS369(activity0, new ArrayList(hashMap0.keySet()));
        String[] arr_s1 = {""};
        if(!TextUtils.isEmpty(s)) {
            arr_s1[0] = s;
            ﾞᵎ0.FLD3463 = s;
        }
        CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1387(activity0, ﾞᵎ0, arr_s1, 0)), ((CLS11)new CLS1484(arr_s1, hashMap0, ᵔʾ0)));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH5868(Activity activity0, String s, String s1, String s2, CLS12 ᵔʾ0) {
        CLS523.MTH7150(activity0, s, ((CLS17)new CLS1506(activity0, new CLS369(activity0, new ArrayList(Arrays.asList(((CLS29)CLS40.FLD157.MTH1118(CLS29.class)).MTH925(s1, "").split(",")))), ᵔʾ0, s2, 1)));
    }

    // 此方法包含解密的字符串
    public static void MTH5869(Activity activity0, ArrayList arrayList0, String s, boolean z, CLS1144 ᵎʻ0) {
        if(CLS403.FLD3892 != null && CLS403.FLD3892.isShowing()) {
            CLS403.FLD3892.dismiss();
        }
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(activity0);
        String s1 = CLS27.MTH889("delete_member");
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
        linearLayout0.setGravity(0x30);
        linearLayout0.setOrientation(1);
        linearLayout0.setFocusableInTouchMode(true);
        linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
        Menu menu0 = CLS523.MTH7167(activity0, linearLayout0, s1);
        LinearLayout linearLayout1 = new LinearLayout(activity0);
        linearLayout1.setGravity(0x30);
        linearLayout1.setOrientation(1);
        linearLayout1.setFocusableInTouchMode(true);
        linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
        if(CLS522.MTH7114()) {
            linearLayout1.setBackgroundColor(CLS522.MTH7108());
        }
        CLS29 ˎᵢ0 = CLS27.MTH895();
        int v = CLS523.MTH7137(10);
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(CLS371.FLD3470.MTH5304(s));
        stringBuilder0.append(" (");
        stringBuilder0.append(s);
        stringBuilder0.append(")");
        stringBuilder0.append("<br><br>");
        stringBuilder0.append(CLS27.MTH889("rooms"));
        stringBuilder0.append("<br>");
        for(Object object0: arrayList0) {
            stringBuilder0.append(CLS371.FLD3470.MTH5316(((String)object0)));
            stringBuilder0.append(": ");
            stringBuilder0.append(CLS66.MTH1452(((String)object0), s));
            stringBuilder0.append("<br>");
        }
        ـﹳ0.MTH800(stringBuilder0.toString());
        ـﹳ0.FLD5295 = false;
        CLS523.MTH7147(linearLayout1, ((CLS18)ـﹳ0), true);
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.MTH800(CLS27.MTH889("reason"));
        CLS1621 ˎᵢ1 = new CLS1621(activity0);
        ˎᵢ1.MTH800(CLS27.MTH889("ban_max_time_lbl"));
        String s2 = ˎᵢ0.MTH925("owner_ban_max_time", ˎᵢ0.MTH925("ban_max_time", ""));
        if(!TextUtils.isEmpty(s2)) {
            ˎᵢ1.MTH7268(Long.parseLong(s2, 16));
        }
        if(!z) {
            CLS1623 יᐧ0 = new CLS1623(activity0);
            יᐧ0.MTH7289(new Object[]{ˑٴ0, ˎᵢ1});
            CLS523.MTH7154(linearLayout1, ((CLS18)יᐧ0), v);
            CLS1625 ـˏ0 = new CLS1625(activity0);
            ـˏ0.MTH800(CLS27.MTH889("silent_kick"));
            ـˏ0.MTH7320(new CLS489(ˎᵢ1, ˑٴ0, arrayList0, s, false, ᵎʻ0));
            CLS523.MTH7147(linearLayout1, ((CLS18)ـˏ0), true);
        }
        if(!CLS523.MTH7140() || menu0 == null) {
            alertDialog$Builder0.setView(linearLayout1).setTitle(s1);
        }
        else {
            linearLayout0.addView(linearLayout1);
            alertDialog$Builder0.setView(linearLayout0);
        }
        alertDialog$Builder0.setPositiveButton(CLS27.MTH889("ban"), new CLS505(ˎᵢ1, ˑٴ0, arrayList0, s, z, ᵎʻ0));
        if(!z) {
            alertDialog$Builder0.setNeutralButton(CLS27.MTH889("ban_forever"), new CLS451(ˑٴ0, arrayList0, s, false, ᵎʻ0));
        }
        alertDialog$Builder0.setNegativeButton(0x1040000, new CLS458(1));
        AlertDialog alertDialog0 = alertDialog$Builder0.create();
        CLS403.FLD3892 = alertDialog0;
        alertDialog0.show();
    }

    // 此方法包含解密的字符串
    public static void MTH5870(Activity activity0, ArrayList arrayList0, String s, CLS12 ᵔʾ0, boolean z) {
        public final class CLS1370 implements CLS8 {
            public final Activity FLD3847;
            public final CLS369 FLD3848;
            public final HashMap FLD3849;
            public final ArrayList FLD3850;
            public final CLS79 FLD3851;

            public CLS1370(Activity activity0, ArrayList arrayList0, HashMap hashMap0, CLS79 ˎᵢ0, CLS369 ﾞᵎ0) {
                this.FLD3850 = arrayList0;
                this.FLD3849 = hashMap0;
                this.FLD3851 = ˎᵢ0;
                this.FLD3848 = ﾞᵎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                public final class CLS1369 implements CLS11 {
                    public final Object FLD3845;
                    public final CLS1370 FLD3846;

                    public CLS1369(Object object0) {
                        this.FLD3845 = object0;
                        super();
                    }

                    @Override  // b.ʻˑ.CLS11
                    public final void MTH789() {
                    }

                    @Override  // b.ʻˑ.CLS11
                    public final void MTH790() {
                        CLS766 ـﹶ0 = new CLS766(this.FLD3845, CLS1370.this.FLD3850, CLS1370.this.FLD3849, CLS1370.this.FLD3851, CLS1370.this.FLD3848, 21, 0);
                        CLS40.FLD157.MTH1124(((CLS39)ـﹶ0));
                    }
                }

                CLS1369 ˆˆ$ˆٴ$ˆٴ0 = new CLS1369(this, object0);
                CLS523.MTH7142(this.FLD3847, ((CLS11)ˆˆ$ˆٴ$ˆٴ0));
            }
        }


        public final class CLS1371 implements CLS11 {
            public final String[] FLD3852;
            public final CLS12 FLD3853;
            public final CLS79 FLD3854;
            public final HashMap FLD3855;
            public final ArrayList FLD3856;

            public CLS1371(String[] arr_s, HashMap hashMap0, CLS79 ˎᵢ0, ArrayList arrayList0, CLS12 ᵔʾ0) {
                this.FLD3855 = hashMap0;
                this.FLD3854 = ˎᵢ0;
                this.FLD3856 = arrayList0;
                this.FLD3853 = ᵔʾ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    HashMap hashMap0 = this.FLD3855;
                    String s = this.FLD3852[0];
                    if(TextUtils.isEmpty(s)) {
                        return;
                    }
                    if(!hashMap0.containsKey(s)) {
                        return;
                    }
                    String s1 = (String)hashMap0.get(s);
                    this.FLD3854.MTH1623(s1, this.FLD3856);
                    CLS12 ᵔʾ0 = this.FLD3853;
                    if(ᵔʾ0 != null) {
                        ᵔʾ0.MTH791(s1);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1373 implements CLS11 {
            public final HashMap FLD3861;
            public final ArrayList FLD3862;
            public final CLS79 FLD3863;
            public final CLS369 FLD3864;

            public CLS1373(HashMap hashMap0, CLS79 ˎᵢ0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
                this.FLD3863 = ˎᵢ0;
                this.FLD3862 = arrayList0;
                this.FLD3864 = ﾞᵎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    CLS1410 ˊˉ0 = new CLS1410(this.FLD3861, this.FLD3863, this.FLD3862, this.FLD3864);
                    CLS40.FLD157.MTH1124(((CLS39)ˊˉ0));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1375 implements CLS11 {
            public final HashMap FLD3870;
            public final CLS369 FLD3871;
            public final CLS79 FLD3872;
            public final String FLD3873;
            public final ArrayList FLD3874;

            public CLS1375(CLS369 ﾞᵎ0, CLS79 ˎᵢ0, String s, ArrayList arrayList0, HashMap hashMap0) {
                this.FLD3870 = hashMap0;
                this.FLD3873 = s;
                this.FLD3872 = ˎᵢ0;
                this.FLD3874 = arrayList0;
                this.FLD3871 = ﾞᵎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    CLS1049 ˑᴵ0 = new CLS1049(this.FLD3870, this.FLD3873, this.FLD3872, 28);
                    CLS40.FLD157.MTH1124(((CLS39)ˑᴵ0));
                    this.FLD3874.remove(this.FLD3873);
                    this.FLD3871.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        String s1 = CLS27.MTH889("chatcontainer");
        CLS79 ˎᵢ0 = CLS79.FLD292;
        HashMap hashMap0 = new HashMap();
        String[] arr_s = CLS502.MTH6941(ˎᵢ0.MTH1624());
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            if(s2.startsWith("wx__c_") && (TextUtils.isEmpty(s) || !s2.equals(s))) {
                hashMap0.put(ˎᵢ0.MTH1625(s2), s2);
            }
        }
        ArrayList arrayList1 = new ArrayList(hashMap0.keySet());
        CLS369 ﾞᵎ0 = new CLS369(activity0, arrayList1);
        String[] arr_s1 = {""};
        CLS523.MTH7162(z, activity0, s1, ((CLS379)new CLS580(activity0, ﾞᵎ0, arr_s1, hashMap0, ˎᵢ0, arrayList1)), ((CLS378)new CLS580(activity0, hashMap0, s, ˎᵢ0, arrayList1, ﾞᵎ0)), ((CLS11)new CLS1371(arr_s1, hashMap0, ˎᵢ0, arrayList0, ᵔʾ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH5871(Activity activity0, String s) {
        CLS29 ˎᵢ0 = CLS27.MTH895();
        CLS523.MTH7145(activity0, CLS27.MTH889("settings"), ((CLS17)new CLS1385(s, activity0, ˎᵢ0)), null);
    }

    // 此方法包含解密的字符串
    public static void MTH5872(boolean z, Activity activity0, ArrayList arrayList0, CLS12 ᵔʾ0) {
        public final class CLS1366 implements CLS8 {
            public final Activity FLD3828;
            public final CLS347 FLD3829;
            public final ArrayList FLD3830;
            public final CLS43 FLD3831;
            public final ArrayList FLD3832;

            public CLS1366(Activity activity0, CLS43 ˆʿ0, ArrayList arrayList0, ArrayList arrayList1, CLS347 ᐧי0) {
                this.FLD3831 = ˆʿ0;
                this.FLD3830 = arrayList0;
                this.FLD3832 = arrayList1;
                this.FLD3829 = ᐧי0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                public final class CLS1365 implements CLS11 {
                    public final ArrayList FLD3826;
                    public final CLS1366 FLD3827;

                    public CLS1365(ArrayList arrayList0) {
                        this.FLD3826 = arrayList0;
                        super();
                    }

                    @Override  // b.ʻˑ.CLS11
                    public final void MTH789() {
                    }

                    // 此方法包含解密的字符串
                    @Override  // b.ʻˑ.CLS11
                    public final void MTH790() {
                        CLS1366 ˆˆ$ʻˑ0;
                        Iterator iterator0 = this.FLD3826.iterator();
                        while(true) {
                            boolean z = iterator0.hasNext();
                            ˆˆ$ʻˑ0 = CLS1366.this;
                            if(!z) {
                                break;
                            }
                            Object object0 = iterator0.next();
                            ˆˆ$ʻˑ0.FLD3831.MTH1159(((String)object0));
                        }
                        ˆˆ$ʻˑ0.FLD3830.clear();
                        ArrayList arrayList0 = ˆˆ$ʻˑ0.FLD3831.MTH1165();
                        ˆˆ$ʻˑ0.FLD3830.addAll(arrayList0);
                        ˆˆ$ʻˑ0.FLD3832.clear();
                        for(Object object1: ˆˆ$ʻˑ0.FLD3830) {
                            CLS528 ʽי0 = new CLS528();
                            ʽי0.FLD5165 = (String)object1;
                            ʽי0.FLD5166 = "" + CLS502.MTH6941(ˆˆ$ʻˑ0.FLD3831.MTH1162(((String)object1))).length;
                            ˆˆ$ʻˑ0.FLD3832.add("");
                        }
                        ˆˆ$ʻˑ0.FLD3829.notifyDataSetChanged();
                    }
                }

                CLS1365 ˆˆ$ʻˑ$ˆٴ0 = new CLS1365(this, ((ArrayList)object0));
                CLS523.MTH7142(this.FLD3828, ((CLS11)ˆˆ$ʻˑ$ˆٴ0));
            }
        }


        public final class CLS1368 implements CLS11 {
            public final CLS43 FLD3839;
            public final ArrayList FLD3840;
            public final ArrayList FLD3841;
            public final String FLD3842;
            public final int FLD3843;
            public final CLS347 FLD3844;

            public CLS1368(CLS43 ˆʿ0, String s, ArrayList arrayList0, int v, ArrayList arrayList1, CLS347 ᐧי0) {
                this.FLD3842 = s;
                this.FLD3841 = arrayList0;
                this.FLD3843 = v;
                this.FLD3840 = arrayList1;
                this.FLD3844 = ᐧי0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                this.FLD3839.MTH1159(this.FLD3842);
                this.FLD3841.remove(this.FLD3843);
                this.FLD3840.remove(this.FLD3843);
                this.FLD3844.notifyDataSetChanged();
            }
        }

        CLS43 ˆʿ0 = (CLS43)CLS40.FLD157.MTH1118(CLS43.class);
        ArrayList arrayList1 = ˆʿ0.MTH1165();
        ArrayList arrayList2 = new ArrayList();
        for(Object object0: arrayList1) {
            CLS528 ʽי0 = new CLS528();
            ʽי0.FLD5165 = (String)object0;
            ʽי0.FLD5166 = "" + CLS502.MTH6941(ˆʿ0.MTH1162(((String)object0))).length;
            arrayList2.add("");
        }
        CLS347 ᐧי0 = new CLS347(activity0, arrayList2);
        CLS403.FLD3893 = CLS523.MTH7162(z, activity0, CLS27.MTH889("chatroom_tags"), ((CLS379)new CLS1036(activity0, ᐧי0, arrayList0, z, ˆʿ0, ᵔʾ0, arrayList1, arrayList2)), ((CLS378)new CLS766(activity0, ˆʿ0, arrayList1, arrayList2, ᐧי0)), null);
    }
}

