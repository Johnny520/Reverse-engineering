// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS563;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS573;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS78;
import b.ˈˊ.CLS592;
import b.ˈˊ.CLS99;
import b.ˑٴ.CLS751;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1036;
import b.ᐧˉ.CLS1106;
import b.ᐧˉ.CLS1181;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS953;
import b.ᵔʾ.CLS307.CLS306;
import b.ᵔʾ.CLS307;
import b.ᵔʾ.CLS309;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1627;
import b.ﾞˎ.CLS1635;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class CLS443 {
    public static String FLD4310;

    // 此方法包含解密的字符串
    public static void MTH6308(Activity activity0, String s) {
        public final class CLS1447 implements CLS2 {
            public final ArrayList FLD4275;

            public CLS1447(ArrayList arrayList0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                ArrayList arrayList1 = this.FLD4275;
                arrayList1.clear();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList1.add("");
                }
            }
        }


        public final class CLS1450 implements CLS2 {
            public final String FLD4279;

            public CLS1450(String s) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    CLS751 יﹳ0 = new CLS751(3, this.FLD4279, arrayList0);
                    CLS40.FLD157.MTH1124(((CLS39)יﹳ0));
                }
            }
        }


        public final class CLS1453 implements CLS2 {
            public final ArrayList FLD4300;

            public CLS1453(ArrayList arrayList0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                ArrayList arrayList1 = this.FLD4300;
                arrayList1.clear();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList1.add("");
                }
            }
        }


        public final class CLS1650 implements CLS563 {
            public final String FLD4292;
            public final CLS1622 FLD4293;
            public final int[] FLD4294;
            public final CLS1622 FLD4295;
            public final CLS1622 FLD4296;
            public final CLS1635 FLD4297;
            public final ArrayList FLD4298;
            public final ArrayList FLD4299;

            public CLS1650(CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS1622 ˑٴ2, CLS1635 ﾞᵎ0, int[] arr_v, ArrayList arrayList0, ArrayList arrayList1, String s) {
                this.FLD4296 = ˑٴ1;
                this.FLD4295 = ˑٴ2;
                this.FLD4297 = ﾞᵎ0;
                this.FLD4294 = arr_v;
                this.FLD4299 = arrayList0;
                this.FLD4298 = arrayList1;
                this.FLD4292 = s;
                super();
            }

            // 去混淆评级： 低(32)
            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                CLS27.MTH895().MTH922("", "sns_external_temp_vid");
                CLS27.MTH895().MTH922("", "sns_external_temp_thumb");
                CLS27.MTH895().MTH922("", "sns_external_temp_content");
                CLS27.MTH895().MTH922(Boolean.TRUE, "sns_external_temp_sendurl");
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = String.valueOf(System.currentTimeMillis() / 1000L);
                String s1 = this.FLD4293.MTH7285();
                String s2 = this.FLD4296.MTH7285();
                if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
                    CLS27.MTH895().MTH922("", "sns_external_temp_vid");
                    CLS27.MTH895().MTH922("", "sns_external_temp_thumb");
                    CLS27.MTH895().MTH922("", "sns_external_temp_content");
                    CLS27.MTH895().MTH922(Boolean.FALSE, "sns_external_temp_sendurl");
                    if(!this.FLD4297.MTH7444()) {
                        CLS580 ʻᵎ0 = new CLS580(s1, s2, this.FLD4295, this.FLD4294, this.FLD4299, this.FLD4298);
                        CLS40.FLD157.MTH1124(((CLS39)ʻᵎ0));
                        return;
                    }
                    String s3 = CLS27.MTH882("sns_external_video");
                    if(TextUtils.isEmpty(s3)) {
                        return;
                    }
                    String s4 = String.format(s3, this.FLD4292, s, s1, s2);
                    String s5 = this.FLD4295.MTH7285();
                    int v = this.FLD4294[0];
                    ArrayList arrayList0 = this.FLD4299;
                    ArrayList arrayList1 = this.FLD4298;
                    if(!TextUtils.isEmpty(s4)) {
                        Class class0 = CLS27.MTH894("SnsInfoClass2");
                        Class class1 = CLS27.MTH894("snsContentClass");
                        Object object0 = CLS166.MTH3192(CLS27.MTH894("TimeLineHelperClass"), CLS27.MTH897("TimeLineHelperMethod1"), new Object[]{s4});
                        Object object1 = CLS166.MTH3188(class0, new Object[0]);
                        CLS166.MTH3195(object1, CLS27.MTH897("SnsInfoClass2Method1"), new Object[]{object0});
                        ContentValues contentValues0 = (ContentValues)CLS166.MTH3195(object1, CLS27.MTH897("convertToMethod"), new Object[0]);
                        contentValues0.remove("rowid");
                        contentValues0.put("userName", CLS27.MTH904());
                        contentValues0.put(CLS182.MTH3479(0, contentValues0, "snsId", 4101624198525145909L), ((long)(System.currentTimeMillis() / 1000L)));
                        contentValues0.put(CLS182.MTH3479(15, contentValues0, CLS182.MTH3479(2, contentValues0, "localFlag", 0x38EBE50F2B3CD335L), 4101623760438481717L), 2);
                        Object object2 = CLS66.MTH1381(class1, contentValues0.getAsByteArray("content"));
                        if(object2 != null && !TextUtils.isEmpty(s5)) {
                            CLS166.MTH3198(object2, CLS27.MTH897("snsContentField"), s5);
                            contentValues0.put("content", CLS396.MTH5764(object2));
                        }
                        CLS66.MTH1506(CLS396.FLD3775.MTH5762(contentValues0, "SnsInfo", ""), v, arrayList0, arrayList1, null);
                    }
                    CLS66.MTH1373();
                }
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS563
            public final void MTH775() {
                String s = this.FLD4293.MTH7285();
                String s1 = this.FLD4296.MTH7285();
                String s2 = this.FLD4295.MTH7285();
                CLS27.MTH895().MTH922(s, "sns_external_temp_vid");
                CLS27.MTH895().MTH922(s1, "sns_external_temp_thumb");
                CLS27.MTH895().MTH922(s2, "sns_external_temp_content");
                CLS27.MTH895().MTH922(Boolean.valueOf(this.FLD4297.MTH7444()), "sns_external_temp_sendurl");
            }
        }

        int[] arr_v = {0};
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        String s1 = CLS27.MTH904();
        ArrayList arrayList2 = new ArrayList();
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        CLS1622 ˑٴ2 = new CLS1622(activity0);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        ﾞᵎ0.MTH800(CLS27.MTH889("send_ext_url"));
        ﾞᵎ0.MTH798(CLS27.MTH889("send_ext_url_desc"));
        ﾞᵎ0.MTH7437(CLS27.MTH895().MTH938("sns_external_temp_sendurl", false));
        String s2 = CLS27.MTH889("send_external_video");
        CLS1106 ᐧˉ0 = new CLS1106(ˑٴ0, ˑٴ1, ˑٴ2, ـˏ0, activity0, ﾞᵎ0, s, arr_v, arrayList2, s1, arrayList0, arrayList1);
        CLS1650 ˏˎ$ᵔʾ0 = new CLS1650(ˑٴ1, ˑٴ2, ˑٴ0, ﾞᵎ0, arr_v, arrayList1, arrayList0, s1);
        String s3 = CLS27.MTH889("temp_save");
        CLS523.MTH7151(activity0, s2, ((CLS17)new CLS1487(activity0, ((CLS17)ᐧˉ0), 1)), ((CLS11)ˏˎ$ᵔʾ0), s3);
    }

    // 此方法包含解密的字符串
    public static void MTH6309(Activity activity0, String s) {
        CLS371 ʻ0 = CLS371.FLD3470;
        Object object0 = CLS40.FLD157.MTH1118(CLS29.class);
        String s1 = CLS27.MTH904();
        ArrayList arrayList0 = new ArrayList();
        String[] arr_s = ((CLS29)object0).MTH925(CLS182.MTH3484(4101258104102769461L, new StringBuilder(), s), "").split(";");
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            if(!TextUtils.isEmpty(s2)) {
                arrayList0.add(new CLS78(s2, ʻ0.MTH5311(s2)));
            }
        }
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS1181(activity0, ʻ0, s1, arrayList0, ((CLS29)object0), s, new CLS366(activity0, arrayList0), 5)), null);
    }

    // 此方法包含解密的字符串
    public static void MTH6310(boolean z, Activity activity0, String s, CLS573 ⁱʽ0) {
        String s1 = CLS27.MTH889("moments_container");
        Object object0 = CLS40.FLD157.MTH1118(CLS29.class);
        ArrayList arrayList0 = new ArrayList();
        String[] arr_s = ((CLS29)object0).MTH925("moments_container_list", "").split(";");
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            if(!TextUtils.isEmpty(s2)) {
                arrayList0.add(s2);
            }
        }
        CLS369 ﾞᵎ0 = new CLS369(activity0, arrayList0);
        String[] arr_s1 = {""};
        if(((CLS29)object0).MTH938("moments_container_remember_selected", false)) {
            String s3 = ((CLS29)object0).MTH925("moments_container_selected", "");
            arr_s1[0] = s3;
            ﾞᵎ0.FLD3463 = s3;
        }
        String s4 = ⁱʽ0 == null || !TextUtils.isEmpty(s) ? "" : CLS27.MTH889("all");
        CLS523.MTH7156(z, activity0, s1, ((CLS379)new CLS1181(activity0, ﾞᵎ0, arr_s1, ⁱʽ0, s, ((CLS29)object0), arrayList0, 4)), ((CLS378)new CLS1588(activity0, ((CLS29)object0), arrayList0, ﾞᵎ0, z, s4, ⁱʽ0)), ((CLS11)new CLS1652(ⁱʽ0, arr_s1, s, ((CLS29)object0))), s4);
    }

    // 此方法包含解密的字符串
    public static void MTH6311(Activity activity0, JSONObject jSONObject0, CLS1274 ﾞˎ0, boolean z) {
        String s = CLS27.MTH889("add_moment");
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        CLS523.MTH7160(activity0, s, ((CLS17)new CLS1036(activity0, jSONObject0, arrayList0, arrayList1, z, new ArrayList(), CLS27.MTH904(), ˑٴ0)), ((CLS11)new CLS1561(jSONObject0, ˑٴ0, z, arrayList0, arrayList1, ﾞˎ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH6312(Activity activity0, boolean z) {
        ArrayList arrayList0 = new ArrayList();
        CLS1624 יﹳ0 = new CLS1624(activity0);
        CLS359 ⁱˉ0 = new CLS359(activity0, arrayList0);
        CLS523.MTH7162(z, activity0, CLS27.MTH889("mass_like_sns"), ((CLS379)new CLS1472(CLS396.FLD3775, arrayList0, ⁱˉ0, activity0, z, יﹳ0)), null, ((CLS11)new CLS1523(ⁱˉ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH6313(Activity activity0) {
        public final class CLS1445 implements CLS11 {
            public final CLS359 FLD4270;
            public final CLS3 FLD4271;
            public final Activity FLD4272;

            public CLS1445(CLS359 ⁱˉ0, Activity activity0, CLS953 ʿٴ0) {
                this.FLD4272 = activity0;
                this.FLD4271 = ʿٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                public final class CLS1444 implements CLS11 {
                    public final ArrayList FLD4268;
                    public final CLS1445 FLD4269;

                    public CLS1444(ArrayList arrayList0) {
                        this.FLD4268 = arrayList0;
                        super();
                    }

                    @Override  // b.ʻˑ.CLS11
                    public final void MTH789() {
                    }

                    @Override  // b.ʻˑ.CLS11
                    public final void MTH790() {
                        CLS1481 יˆ0 = new CLS1481(8, this.FLD4268);
                        CLS1627 ٴـ0 = new CLS1627(12, CLS1445.this.FLD4271);
                        CLS412.MTH6016(2000L, this.FLD4268.size(), ((CLS411)יˆ0), ٴـ0);
                    }
                }

                ArrayList arrayList0 = this.FLD4270.MTH5234();
                if(arrayList0.isEmpty()) {
                    return;
                }
                CLS1444 ˏˎ$ˈˈ$ˆٴ0 = new CLS1444(this, arrayList0);
                CLS523.MTH7142(this.FLD4272, ((CLS11)ˏˎ$ˈˈ$ˆٴ0));
            }
        }

        ArrayList arrayList0 = new ArrayList();
        CLS1624 יﹳ0 = new CLS1624(activity0);
        CLS359 ⁱˉ0 = new CLS359(activity0, arrayList0);
        String s = CLS27.MTH889("mass_del_sns");
        CLS953 ʿٴ0 = new CLS953(ⁱˉ0, CLS27.MTH904(), arrayList0);
        CLS523.MTH7153(activity0, s, ((CLS379)new CLS1506(activity0, ⁱˉ0, יﹳ0, ʿٴ0, 8)), ((CLS11)new CLS1445(ⁱˉ0, activity0, ʿٴ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH6314(Activity activity0) {
        public final class CLS1446 implements CLS8 {
            public final ArrayList FLD4273;
            public final CLS335 FLD4274;

            public CLS1446(CLS335 ˑٴ0, ArrayList arrayList0) {
                this.FLD4273 = arrayList0;
                this.FLD4274 = ˑٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                ArrayList arrayList0 = this.FLD4273;
                if(arrayList0.size() >= 9) {
                    return;
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("img", ((String)object0));
                contentValues0.put("desc", ((String)object0));
                arrayList0.add(contentValues0);
                this.FLD4274.MTH5112();
            }
        }


        public final class CLS1448 implements CLS8 {
            public final ArrayList FLD4276;
            public final CLS335 FLD4277;

            public CLS1448(CLS335 ˑٴ0, ArrayList arrayList0) {
                this.FLD4276 = arrayList0;
                this.FLD4277 = ˑٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                this.FLD4276.clear();
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("vid", ((String)object0));
                contentValues0.put("desc", ((String)object0));
                this.FLD4276.add(contentValues0);
                this.FLD4277.MTH5112();
            }
        }


        public final class CLS1449 implements CLS2 {
            public final ArrayList FLD4278;

            public CLS1449(ArrayList arrayList0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                this.FLD4278.clear();
                List list0 = Arrays.asList(s.split(","));
                this.FLD4278.addAll(list0);
            }
        }


        public final class CLS1451 implements CLS11 {
            public final Bundle FLD4280;
            public final CLS335 FLD4281;
            public final int FLD4282;
            public final ArrayList FLD4283;
            public final ArrayList FLD4284;

            public CLS1451(Bundle bundle0, ArrayList arrayList0, int v, ArrayList arrayList1, CLS335 ˑٴ0) {
                this.FLD4283 = arrayList0;
                this.FLD4282 = v;
                this.FLD4284 = arrayList1;
                this.FLD4281 = ˑٴ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    int v = this.FLD4280.getInt("type");
                    int v1 = this.FLD4282;
                    if(v == 1) {
                        this.FLD4283.remove(v1);
                    }
                    else if(v == 15) {
                        this.FLD4284.remove(v1);
                    }
                    this.FLD4281.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1452 implements CLS11 {
            public final CLS1622 FLD4285;
            public final ArrayList FLD4286;
            public final ArrayList FLD4287;
            public final ArrayList FLD4288;
            public final Bundle FLD4289;
            public final ArrayList FLD4290;
            public final ArrayList FLD4291;

            public CLS1452(CLS1622 ˑٴ0, ArrayList arrayList0, ArrayList arrayList1, Bundle bundle0, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
                this.FLD4288 = arrayList0;
                this.FLD4287 = arrayList1;
                this.FLD4289 = bundle0;
                this.FLD4286 = arrayList2;
                this.FLD4291 = arrayList3;
                this.FLD4290 = arrayList4;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                int v1;
                try {
                    Bundle bundle0 = this.FLD4289;
                    String s = CLS466.MTH6541(this.FLD4285.MTH7285());
                    String s1 = this.FLD4288.isEmpty() ? "" : ((ContentValues)this.FLD4288.get(0)).getAsString("vid");
                    boolean z = TextUtils.isEmpty(s);
                    ArrayList arrayList0 = this.FLD4287;
                    if(z && (TextUtils.isEmpty(s1) && arrayList0.isEmpty())) {
                        return;
                    }
                    int v = bundle0.getInt("shareType");
                    if(TextUtils.isEmpty(s1)) {
                        ArrayList arrayList1 = this.FLD4291;
                        ArrayList arrayList2 = this.FLD4286;
                        if(arrayList0.isEmpty()) {
                            v1 = TextUtils.isEmpty(s) ? -1 : CLS66.MTH1418(s, v, arrayList2, arrayList1);
                        }
                        else {
                            ArrayList arrayList3 = new ArrayList();
                            for(Object object0: arrayList0) {
                                arrayList3.add(((ContentValues)object0).getAsString("img"));
                            }
                            v1 = CLS66.MTH1366(s, v, arrayList3, arrayList2, arrayList1);
                        }
                    }
                    else {
                        if(!CLS31.MTH1001(new File(s1))) {
                            return;
                        }
                        File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_vid_thumb.jpg");
                        CLS518.MTH7053(file0, s1);
                        v1 = CLS66.MTH1478(v, s, s1, file0.getAbsolutePath(), this.FLD4286, this.FLD4291);
                    }
                    if(v1 == -1) {
                        return;
                    }
                    CLS309.FLD3190.getClass();
                    CLS592 ˈˊ0 = (CLS592)CLS309.MTH4946(17);
                    ˈˊ0.FLD439 = v1;
                    ˈˊ0.FLD438 = bundle0.getBoolean("deleteFlag", true);
                    ((CLS99)ˈˊ0).MTH1932(TextUtils.join(" ", this.FLD4290));
                    CLS309.FLD3190.MTH4941(((CLS99)ˈˊ0));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1454 implements CLS2 {
            public final ArrayList FLD4301;

            public CLS1454(ArrayList arrayList0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                this.FLD4301.clear();
                List list0 = Arrays.asList(s.split(","));
                this.FLD4301.addAll(list0);
            }
        }

        String s = CLS27.MTH889("post_auto_clean_moment");
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.FLD5243 = true;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String s1 = CLS27.MTH904();
        Bundle bundle0 = new Bundle();
        ArrayList arrayList5 = new ArrayList();
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTime(new Date(System.currentTimeMillis()));
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("HH:mm");
        CLS523.MTH7153(activity0, s, ((CLS379)new CLS1614(activity0, bundle0, arrayList5, new SimpleDateFormat("yyyy-MM-dd"), calendar0, simpleDateFormat0, arrayList0, arrayList1, arrayList4, s1, arrayList2, arrayList3, ˑٴ0)), ((CLS11)new CLS1452(ˑٴ0, arrayList1, arrayList0, bundle0, arrayList3, arrayList2, arrayList5)));
    }

    // 此方法包含解密的字符串
    public static void MTH6315(Activity activity0) {
        public final class CLS1440 implements CLS2 {
            public final String[] FLD4256;
            public final ArrayList FLD4257;
            public final SimpleDateFormat FLD4258;
            public final CLS1626 FLD4259;
            public final String[] FLD4260;
            public final CLS359 FLD4261;
            public final CLS396 FLD4262;

            public CLS1440(CLS359 ⁱˉ0, CLS1626 ـﹳ0, CLS396 ʿʽ0, SimpleDateFormat simpleDateFormat0, ArrayList arrayList0, String[] arr_s, String[] arr_s1) {
                this.FLD4256 = arr_s;
                this.FLD4259 = ـﹳ0;
                this.FLD4258 = simpleDateFormat0;
                this.FLD4260 = arr_s1;
                this.FLD4257 = arrayList0;
                this.FLD4262 = ʿʽ0;
                this.FLD4261 = ⁱˉ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                try {
                    String[] arr_s = this.FLD4260;
                    SimpleDateFormat simpleDateFormat0 = this.FLD4258;
                    ArrayList arrayList1 = this.FLD4257;
                    boolean z = TextUtils.isEmpty(s);
                    String[] arr_s1 = this.FLD4256;
                    arr_s1[0] = z || s.contains("_ALL_") ? "" : s;
                    CLS1626 ـﹳ0 = this.FLD4259;
                    if(arrayList0.isEmpty()) {
                        ـﹳ0.MTH798("");
                    }
                    else {
                        ـﹳ0.MTH798(s1);
                    }
                    Date date0 = simpleDateFormat0.parse(arr_s[0]);
                    Date date1 = simpleDateFormat0.parse(arr_s[1]);
                    arrayList1.clear();
                    long v = CLS481.MTH6689(date0).getTime();
                    long v1 = CLS481.MTH6695(date1).getTime();
                    arrayList1.addAll(this.FLD4262.MTH5760(v / 1000L, v1 / 1000L, arr_s1[0]));
                    this.FLD4261.MTH5235(arrayList1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1442 implements CLS11 {
            public final CLS359 FLD4264;
            public final Activity FLD4265;

            public CLS1442(Activity activity0, CLS359 ⁱˉ0) {
                this.FLD4264 = ⁱˉ0;
                this.FLD4265 = activity0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                ArrayList arrayList0 = this.FLD4264.MTH5234();
                if(arrayList0.isEmpty()) {
                    return;
                }
                Activity activity0 = this.FLD4265;
                ProgressDialog progressDialog0 = new ProgressDialog(activity0);
                progressDialog0.setCancelable(true);
                progressDialog0.setProgressStyle(1);
                progressDialog0.setProgress(0);
                progressDialog0.setMax(arrayList0.size());
                progressDialog0.show();
                int v = 0;
                while(v < arrayList0.size()) {
                    ContentValues contentValues0 = (ContentValues)arrayList0.get(v);
                    CLS21.FLD76.MTH818("sns_silent_export", new Object[]{contentValues0});
                    ++v;
                    progressDialog0.setProgress(v);
                }
                progressDialog0.dismiss();
                if(CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
                    File file0 = new File(CLS27.MTH895().MTH925("moment_export_path", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath()));
                    CLS412.MTH6013(activity0, CLS27.MTH889("file_written_to") + file0);
                }
            }
        }

        ArrayList arrayList0 = new ArrayList();
        CLS1624 יﹳ0 = new CLS1624(activity0);
        CLS359 ⁱˉ0 = new CLS359(activity0, arrayList0);
        CLS523.MTH7153(activity0, CLS27.MTH889("mass_export_sns"), ((CLS379)new CLS1295(activity0, arrayList0, CLS396.FLD3775, ⁱˉ0, יﹳ0, 1)), ((CLS11)new CLS1442(activity0, ⁱˉ0)));
    }

    // 此方法包含解密的字符串
    public static void MTH6316(Activity activity0, CLS8 ـˏ0) {
        public final class CLS1443 implements CLS11 {
            public final CLS8 FLD4266;
            public final String[] FLD4267;

            public CLS1443(CLS8 ـˏ0, String[] arr_s) {
                this.FLD4267 = arr_s;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS8 ـˏ0 = this.FLD4266;
                if(ـˏ0 != null) {
                    ـˏ0.MTH786(this.FLD4267[0]);
                }
            }
        }

        String[] arr_s = {""};
        CLS523.MTH7160(activity0, CLS27.MTH889("moment_signature"), ((CLS17)new CLS1552(activity0, arr_s)), ((CLS11)new CLS1443(ـˏ0, arr_s)));
    }

    // 此方法包含解密的字符串
    public static void MTH6317(Activity activity0, long v) {
        public final class CLS1441 implements CLS2 {
            public final ArrayList FLD4263;

            public CLS1441(ArrayList arrayList0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                ArrayList arrayList1 = this.FLD4263;
                arrayList1.clear();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList1.add("");
                }
            }
        }


        public final class CLS1455 implements CLS2 {
            public final ArrayList FLD4302;

            public CLS1455(ArrayList arrayList0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                ArrayList arrayList1 = this.FLD4302;
                arrayList1.clear();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList1.add("");
                }
            }
        }


        public final class CLS1456 implements CLS11 {
            public final HashMap FLD4303;
            public final ArrayList FLD4304;
            public final CLS1622 FLD4305;
            public final long FLD4306;
            public final int[] FLD4307;
            public final CLS1635 FLD4308;
            public final ArrayList FLD4309;

            public CLS1456(HashMap hashMap0, long v, CLS1622 ˑٴ0, int[] arr_v, ArrayList arrayList0, ArrayList arrayList1, CLS1635 ﾞᵎ0) {
                this.FLD4306 = v;
                this.FLD4305 = ˑٴ0;
                this.FLD4307 = arr_v;
                this.FLD4304 = arrayList0;
                this.FLD4309 = arrayList1;
                this.FLD4308 = ﾞᵎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                String s = "";
                HashMap hashMap0 = this.FLD4303;
                if(!hashMap0.isEmpty() && hashMap0.get("poiid") != null) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    stringBuilder0.append("<location poiAddress=\"");
                    stringBuilder0.append(((String)hashMap0.get("poiAddress")));
                    stringBuilder0.append("\" city=\"");
                    stringBuilder0.append(((String)hashMap0.get("city")));
                    stringBuilder0.append("\" poiName=\"");
                    stringBuilder0.append(((String)hashMap0.get("city")));
                    stringBuilder0.append("&#x20;·&#x20;");
                    stringBuilder0.append(((String)hashMap0.get("poiName")));
                    stringBuilder0.append("\" latitude=\"");
                    stringBuilder0.append(((String)hashMap0.get("lat")));
                    stringBuilder0.append("\" longitude=\"");
                    stringBuilder0.append(((String)hashMap0.get("lng")));
                    stringBuilder0.append("\" poiClassifyId=\"");
                    s = CLS34.MTH1074(stringBuilder0, ((String)hashMap0.get("poiid")), 4100814163398153013L);
                }
                String s1 = CLS466.MTH6541(this.FLD4305.MTH7285());
                int v = this.FLD4307[0];
                ArrayList arrayList0 = this.FLD4304;
                ArrayList arrayList1 = this.FLD4309;
                boolean z = this.FLD4308.MTH7444();
                long v1 = this.FLD4306;
                if(v1 != 0L) {
                    Class class0 = CLS27.MTH894("snsContentClass");
                    Class class1 = CLS27.MTH894("snsAttrClass");
                    CLS396 ʿʽ0 = CLS396.FLD3775;
                    ContentValues contentValues0 = CLS66.MTH1430(v1);
                    if(contentValues0 != null) {
                        contentValues0.remove("rowid");
                        contentValues0.put("userName", CLS27.MTH904());
                        contentValues0.put(CLS182.MTH3479(0, contentValues0, "snsId", 4101645123605812021L), ((long)(System.currentTimeMillis() / 1000L)));
                        Object object0 = CLS66.MTH1381(class0, contentValues0.getAsByteArray("content"));
                        if(object0 != null && !CLS66.MTH1511(object0).equals(s1)) {
                            CLS166.MTH3198(object0, CLS27.MTH897("snsContentField"), s1);
                            contentValues0.put("content", CLS396.MTH5764(object0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Object object1 = CLS66.MTH1381(class1, contentValues0.getAsByteArray("attrBuf"));
                        if(object1 != null) {
                            LinkedList linkedList0 = (LinkedList)CLS182.MTH3492(0x38EBF8B52B3CD335L, object1);
                            if(linkedList0 != null) {
                                linkedList0.clear();
                            }
                            CLS166.MTH3196(0, object1, CLS27.MTH897("snsAttrLikeFieldCount"));
                            LinkedList linkedList1 = (LinkedList)CLS166.MTH3194(object1, CLS27.MTH897("snsAttrCommentsListField"));
                            if(linkedList1 != null) {
                                if(z) {
                                    for(Object object2: linkedList1) {
                                        arrayList2.add(CLS66.MTH1407(object2));
                                    }
                                }
                                linkedList1.clear();
                            }
                            CLS166.MTH3196(0, object1, CLS27.MTH897("snsAttrCommentFieldCount"));
                            contentValues0.put("attrBuf", CLS396.MTH5764(object1));
                        }
                        int v2 = (int)ʿʽ0.MTH5762(contentValues0, "SnsInfo", "");
                        CLS66.MTH1506(v2, v, arrayList0, arrayList1, s);
                        if(v2 != -1 && !arrayList2.isEmpty()) {
                            for(Object object3: arrayList2) {
                                CLS306 ⁱʽ$ᵔʾ0 = new CLS306(3000, ((long)v2), "", ((String)object3));
                                CLS307.FLD3187.FLD3186.MTH3150(ⁱʽ$ᵔʾ0);
                                CLS307.FLD3187.FLD3186.MTH3149(5000L);
                            }
                        }
                    }
                }
                CLS66.MTH1373();
            }
        }

        int[] arr_v = {0};
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        String s = CLS27.MTH904();
        ArrayList arrayList2 = new ArrayList();
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.MTH800(CLS27.MTH889("content"));
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        ﾞᵎ0.MTH7437(false);
        HashMap hashMap0 = new HashMap();
        CLS523.MTH7145(activity0, CLS27.MTH889("fast_forward_sns"), ((CLS17)new CLS1504(v, ˑٴ0, activity0, hashMap0, arr_v, arrayList2, s, arrayList0, arrayList1, ﾞᵎ0)), ((CLS11)new CLS1456(hashMap0, v, ˑٴ0, arr_v, arrayList1, arrayList0, ﾞᵎ0)));
    }
}

