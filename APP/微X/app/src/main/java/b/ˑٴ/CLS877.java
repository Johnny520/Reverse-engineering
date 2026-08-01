// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS41;
import b.ˆʿ.CLS45;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.יᐧ.CLS158.CLS157;
import b.יᐧ.CLS158;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1225;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class CLS877 extends CLS140 {
    public String FLD1471;
    public Pattern FLD1472;
    public CLS45 FLD1473;
    public final long FLD1474;
    public CLS41 FLD1475;
    public final CLS158 FLD1476;

    // 此方法包含解密的字符串
    public CLS877(CLS139 ﹶʼ0) {
        public final class CLS875 implements CLS157 {
            public CLS875() {
                super();
            }

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
                if(!CLS404.MTH5901()) {
                    CLS66.MTH1373();
                }
            }

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                Long long0 = (Long)ⁱʾ0.MTH3152();
                if(long0 == null) {
                    return;
                }
                ContentValues contentValues0 = CLS66.MTH1430(((long)long0));
                if(contentValues0 != null && contentValues0.containsKey("sourceType") && CLS182.MTH3474(0x38ED8F992B3CD335L, contentValues0) == 8) {
                    return;
                }
                try {
                    Object object0 = CLS66.MTH1434(((long)long0));
                    if(object0 != null && CLS166.MTH3181(object0, "field_likeFlag") != 1) {
                        CLS166.MTH3196(1, object0, "field_likeFlag");
                        if(CLS27.MTH890("SnsInfoStorage_update")) {
                            CLS166.MTH3195(CLS166.MTH3192(CLS27.MTH894("SnsPathClass"), CLS27.MTH897("snsTextMethod1"), new Object[0]), CLS27.MTH897("SnsInfoStorage_update"), new Object[]{CLS166.MTH3185(object0, "field_snsId"), object0});
                        }
                        else {
                            Class class0 = CLS27.MTH894("SnsInfoClass");
                            if(class0 != null) {
                                CLS166.MTH3192(class0, CLS27.MTH892("updateSnsInfoMethod", "a"), new Object[]{"sns_table_" + CLS166.MTH3185(object0, "field_snsId"), object0});
                            }
                        }
                        int v = 7;
                        if(CLS27.MTH890("snsLikeClass2b")) {
                            Class class1 = CLS27.MTH894("snsLikeClass2b");
                            if(CLS27.MTH890("snsLikeMethod_b")) {
                                String s = CLS27.MTH897("snsLikeMethod_b");
                                Object[] arr_object = new Object[3];
                                if((CLS166.MTH3181(object0, "field_sourceType") & 0x20) <= 0) {
                                    v = 1;
                                }
                                arr_object[0] = v;
                                arr_object[1] = 1;
                                arr_object[2] = object0;
                                CLS166.MTH3192(class1, s, arr_object);
                                return;
                            }
                            String s1 = CLS27.MTH892("snsLikeMethod", "a");
                            Object[] arr_object1 = new Object[4];
                            arr_object1[0] = object0;
                            if((CLS166.MTH3181(object0, "field_sourceType") & 0x20) <= 0) {
                                v = 1;
                            }
                            arr_object1[1] = v;
                            arr_object1[2] = "";
                            arr_object1[3] = 0;
                            CLS166.MTH3192(class1, s1, arr_object1);
                            return;
                        }
                        if(CLS27.MTH890("snsLikeClass2")) {
                            Class class2 = CLS27.MTH894("snsLikeClass2");
                            String s2 = CLS27.MTH892("snsLikeMethod", "a");
                            Object[] arr_object2 = {object0, null, null};
                            if((CLS166.MTH3181(object0, "field_sourceType") & 0x20) <= 0) {
                                v = 1;
                            }
                            arr_object2[1] = v;
                            arr_object2[2] = "";
                            CLS166.MTH3192(class2, s2, arr_object2);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        super(ﹶʼ0);
        this.FLD1474 = 86400000L;
        this.FLD1476 = new CLS158(((CLS157)new CLS875()), ((long)this.FLD1445.MTH927(5000, "auto_like_delay")));
    }

    // 此方法包含解密的字符串
    public final void MTH3082(ContentValues contentValues0) {
        long v2;
        if(this.FLD1472 == null) {
            return;
        }
        Class class0 = CLS27.MTH894("snsAttrClass");
        if(class0 == null) {
            return;
        }
        long v1 = CLS34.MTH1080(0x38EDF28F2B3CD335L, contentValues0);
        if(!this.MTH3094().MTH1132(v1) && (this.FLD1445.MTH938("enable_moment_comments_filter", false) && contentValues0.containsKey("sourceType") && contentValues0.containsKey("attrBuf") && CLS182.MTH3474(4102202318303056693L, contentValues0) != 8)) {
            if(this.FLD1446.MTH5757(v1) == 8) {
                v2 = 0x38EDF3512B3CD335L;
                contentValues0.put(CLS370.MTH5289(v2), 8);
                return;
            }
            SparseArray sparseArray0 = CLS396.MTH5770(CLS66.MTH1381(class0, contentValues0.getAsByteArray("attrBuf")));
            for(int v = 0; v < sparseArray0.size(); ++v) {
                String s = CLS66.MTH1407(sparseArray0.get(sparseArray0.keyAt(v)));
                if(!TextUtils.isEmpty(s) && CLS502.MTH6935(this.FLD1472, s)) {
                    v2 = 4102202447152075573L;
                    contentValues0.put(CLS370.MTH5289(v2), 8);
                    return;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3083(long v, ContentValues contentValues0) {
        boolean z;
        CLS29 ˎᵢ0 = this.FLD1445;
        if(ˎᵢ0.MTH938("auto_like_enable", false) && !CLS66.MTH1479(v)) {
            String s = contentValues0.getAsString("userName");
            if(ˎᵢ0.MTH938("like_only_enable", false)) {
                if(!CLS502.MTH6934(ˎᵢ0.MTH925("like_only_list", ""), new String[]{s})) {
                    return;
                }
            }
            else if(CLS502.MTH6934(ˎᵢ0.MTH925("like_excl_list", ""), new String[]{s})) {
                return;
            }
            if(!this.MTH3098("like") && this.FLD1444.MTH5302(s)) {
                if(ˎᵢ0.MTH938("like_only_once_per_day_enable", false)) {
                    try {
                        JSONObject jSONObject0 = ˎᵢ0.MTH924("like_only_limited_per_day_json", new JSONObject());
                        JSONObject jSONObject1 = new JSONObject();
                        if(jSONObject0.has(s)) {
                            jSONObject1 = jSONObject0.getJSONObject(s);
                            long v1 = jSONObject1.getLong("last_like");
                            Calendar calendar0 = Calendar.getInstance();
                            calendar0.setTimeInMillis(v1);
                            int v2 = calendar0.get(6);
                            Calendar calendar1 = Calendar.getInstance();
                            calendar1.setTimeInMillis(System.currentTimeMillis());
                            if(v2 == calendar1.get(6)) {
                                int v3 = ˎᵢ0.MTH927(1, "like_only_limited_per_day_max");
                                int v4 = jSONObject1.getInt("like_cnt");
                                if(v3 == v4) {
                                    z = true;
                                }
                                else {
                                    jSONObject1.put("like_cnt", v4 + 1);
                                    jSONObject1.put("last_like", System.currentTimeMillis());
                                    jSONObject0.put(s, jSONObject1);
                                    ˎᵢ0.MTH922(jSONObject0, "like_only_limited_per_day_json");
                                    z = false;
                                }
                            }
                            else {
                                jSONObject1.put("like_cnt", 1);
                                jSONObject1.put("last_like", System.currentTimeMillis());
                                jSONObject0.put(s, jSONObject1);
                                ˎᵢ0.MTH922(jSONObject0, "like_only_limited_per_day_json");
                                z = false;
                            }
                        }
                        else {
                            jSONObject1.put("like_cnt", 1);
                            jSONObject1.put("last_like", System.currentTimeMillis());
                            jSONObject0.put(s, jSONObject1);
                            ˎᵢ0.MTH922(jSONObject0, "like_only_limited_per_day_json");
                            z = false;
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                        z = false;
                    }
                }
                else {
                    z = false;
                }
                if(z || ˎᵢ0.MTH938("like_only_on_already_liked", false) && CLS66.MTH1477(contentValues0.getAsByteArray("attrBuf")) < 1) {
                    return;
                }
                this.MTH3091(v);
            }
        }
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public final boolean MTH3084(String s) {
        return this.FLD1445.MTH938("enable_block_snsad", false) && "adsnsinfo".equalsIgnoreCase(s);
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3039() {
        CLS412.MTH6001(this.FLD1476.FLD1559);
    }

    // 此方法包含解密的字符串
    public final void MTH3086(ContentValues contentValues0) {
        if(!contentValues0.containsKey("snsId")) {
            return;
        }
        long v = CLS34.MTH1080(4102202520166519605L, contentValues0);
        if(v < 0L && contentValues0.containsKey("content") && contentValues0.containsKey("sourceType") && contentValues0.containsKey("userName")) {
            String s = contentValues0.getAsString("userName");
            if(s.equalsIgnoreCase(CLS27.MTH904())) {
                return;
            }
            if(!CLS502.MTH6934(this.FLD1445.MTH925("moments_filter_exclude", ""), new String[]{s}) && CLS182.MTH3474(0x38EDF3382B3CD335L, contentValues0) != 8) {
                if(this.FLD1446.MTH5757(v) == 8) {
                    contentValues0.put("sourceType", 8);
                    return;
                }
                if(this.MTH3087(contentValues0)) {
                    contentValues0.put("sourceType", 8);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH3087(ContentValues contentValues0) {
        try {
            CLS29 ˎᵢ0 = this.FLD1445;
            if(!ˎᵢ0.MTH938("enable_moment_filter", false)) {
                return false;
            }
            if(this.FLD1472 == null) {
                this.MTH3090();
            }
            Class class0 = CLS27.MTH894("snsContentClass");
            if(class0 == null) {
                return false;
            }
            int v = (int)contentValues0.getAsInteger("type");
            Object object0 = CLS66.MTH1381(class0, contentValues0.getAsByteArray("content"));
            String s = CLS66.MTH1511(object0);
            if(v == 3 && ˎᵢ0.MTH938("enable_moment_link_title_filter", false) && !TextUtils.isEmpty(CLS27.MTH897("snsContentLinkField")) && object0 != null) {
                s = s + " " + CLS166.MTH3194(CLS166.MTH3194(object0, CLS27.MTH897("snsContentLinkField")), CLS27.MTH897("snsContentLinkTitleField"));
            }
            if(ˎᵢ0.MTH938("enable_moment_link_filter", false) && v == 3 || !TextUtils.isEmpty(s) && CLS502.MTH6935(this.FLD1472, s) || ˎᵢ0.MTH938("enable_moment_gamescores_filter", false) && object0 != null && CLS166.MTH3194(object0, CLS27.MTH897("snsContentStatisticsField")).equals("MSG_SHARE_MOMENT_BEST_SCORE")) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        public final class CLS876 implements CLS8 {
            public final Handler.Callback FLD1470;

            public CLS876(Handler.Callback handler$Callback0) {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                if(TextUtils.isEmpty(((String)object0))) {
                    return;
                }
                Message message0 = new Message();
                Bundle bundle0 = new Bundle();
                bundle0.putString("sig", ((String)object0));
                message0.setData(bundle0);
                this.FLD1470.handleMessage(message0);
            }
        }

        CLS34.MTH1073(this, 0, ʾᵢ0, "a.on_MMFragmentActivity_onPause");
        CLS34.MTH1073(this, 7, ʾᵢ0, "b.on_MMFragmentActivity_onCreate");
        CLS34.MTH1073(this, 8, ʾᵢ0, "doFilterMoments");
        CLS34.MTH1073(this, 9, ʾᵢ0, "onsettingschange,onlauncheruienter.notactive");
        CLS34.MTH1073(this, 10, ʾᵢ0, "sns_silent_forward");
        ʾᵢ0.MTH828("on_sdk_xml_parsed", ((CLS35)new CLS762(8)));
        ʾᵢ0.MTH828("on_sdk_xml_parsed2", ((CLS35)new CLS762(9)));
        CLS34.MTH1073(this, 11, ʾᵢ0, "on_SnsTimeLineUI_setSnsAutoPlayMethod");
        CLS34.MTH1073(this, 12, ʾᵢ0, "on_SnsAutoPlayUtil_setSnsAutoPlayMethod");
        ʾᵢ0.MTH828("moment_export_video", ((CLS35)new CLS762(10)));
        ʾᵢ0.MTH828("moment_export_images", ((CLS35)new CLS762(4)));
        ʾᵢ0.MTH828("moment_export_text", ((CLS35)new CLS762(5)));
        ʾᵢ0.MTH828("moment_export_url", ((CLS35)new CLS762(6)));
        CLS34.MTH1073(this, 1, ʾᵢ0, "sns_silent_export");
        CLS34.MTH1073(this, 2, ʾᵢ0, "snsLikeDelayed");
        CLS34.MTH1073(this, 3, ʾᵢ0, "on_sns_img_compress");
        CLS34.MTH1073(this, 4, ʾᵢ0, "showMomentSignatureListDialog");
        ʾᵢ0.MTH828("refreshMoments", ((CLS35)new CLS762(7)));
        CLS34.MTH1073(this, 5, ʾᵢ0, "b.on_MMActivity_onCreate");
        CLS34.MTH1073(this, 6, ʾᵢ0, "on_mvvmlist_submitChange");
        CLS21 ʾᵢ1 = CLS21.FLD76;
        CLS34.MTH1073(this, 13, ʾᵢ1, "a.async.sqldb.insert");
        CLS34.MTH1073(this, 14, ʾᵢ1, "b.sqldb.update");
        CLS34.MTH1073(this, 15, ʾᵢ1, "a.async.sqldb.update");
        CLS34.MTH1073(this, 16, ʾᵢ1, "b.sqldb.rawquery");
        CLS34.MTH1073(this, 17, ʾᵢ1, "b.sqldb.insert");
        CLS34.MTH1073(this, 18, ʾᵢ1, "snsdb.init");
        CLS34.MTH1073(this, 23, ʾᵢ1, "a.on_MMActivity_onCreate");
        CLS34.MTH1073(this, 24, ʾᵢ1, "a.on_MMFragmentActivity_onPause");
        CLS34.MTH1073(this, 19, ʾᵢ1, "a.on_MMFragmentActivity_onResume,a.on_VASActivity_onResume");
        CLS34.MTH1073(this, 21, ʾᵢ1, "on_snsTimeLineUI_setTitleBarDoubleClickListener");
        CLS34.MTH1073(this, 22, ʾᵢ1, "on_snsTimeLineUI_setTitleBarDoubleClickListener_b");
        ʾᵢ1.MTH833("snstimelineui.optionsmenu.options", ((CLS37)new CLS711(this, 1)));
        ʾᵢ1.MTH833("snstimelineui.optionsmenu.options", ((CLS37)new CLS711(this, 2)));
        ʾᵢ1.MTH833("snstimelineui.optionsmenu.options", ((CLS37)new CLS711(this, 3)));
        ʾᵢ1.MTH833("snstimelineui.optionsmenu.options", ((CLS37)new CLS711(this, 4)));
        ʾᵢ1.MTH833("snstimelineui.optionsmenu.options", ((CLS37)new CLS711(this, 5)));
        ʾᵢ1.MTH833("snstimelineui.optionsmenu.options", ((CLS37)new CLS711(this, 6)));
        ʾᵢ1.MTH833("snstimelineui.optionsmenu.options", ((CLS37)new CLS711(this, 7)));
        ʾᵢ1.MTH833("snstimelineui.optionsmenu.options", ((CLS37)new CLS711(this, 0)));
        CLS34.MTH1073(this, 20, ʾᵢ1, "snstimelineui.optionsmenu.config");
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS711(this, 8)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS711(this, 9)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS711(this, 10)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS711(this, 11)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS711(this, 12)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS711(this, 13)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS711(this, 14)));
        CLS34.MTH1073(this, 28, ʾᵢ1, "sns.menu.config");
        ʾᵢ1.MTH828("sns.menu.config", ((CLS35)new CLS714(this, 1)));
        ʾᵢ1.MTH828("sns.menu.config", ((CLS35)new CLS714(this, 0)));
        CLS34.MTH1073(this, 25, ʾᵢ1, "sns.menu.config");
        CLS34.MTH1073(this, 26, ʾᵢ1, "sns.menu.config");
        ʾᵢ1.MTH828("sns.menu.config", ((CLS35)new CLS762(11)));
        CLS34.MTH1073(this, 27, ʾᵢ1, "sns.menu.config");
    }

    // 此方法包含解密的字符串
    public final boolean MTH3089(String s) {
        CLS29 ˎᵢ0 = this.FLD1445;
        if(!ˎᵢ0.MTH938("auto_comment_allowed_filter_enable", false)) {
            return true;
        }
        String s1 = ˎᵢ0.MTH925("auto_comment_allowed_filter", "");
        return TextUtils.isEmpty(s1) || CLS502.MTH6930(s1, s);
    }

    // 此方法包含解密的字符串
    public final void MTH3090() {
        try {
            CLS29 ˎᵢ0 = this.FLD1445;
            if(ˎᵢ0.MTH938("enable_moment_filter", false)) {
                String s = ˎᵢ0.MTH925("moment_filter", "");
                if(TextUtils.isEmpty(s)) {
                    this.FLD1472 = null;
                    return;
                }
                if(!TextUtils.isEmpty(this.FLD1471) && this.FLD1471.equals(s)) {
                    return;
                }
                this.FLD1472 = null;
                String[] arr_s = s.split(Pattern.quote("|"));
                ArrayList arrayList0 = new ArrayList();
                HashSet hashSet0 = new HashSet();
                for(int v = 0; v < arr_s.length; ++v) {
                    String s1 = arr_s[v];
                    if(!TextUtils.isEmpty(s1) && !hashSet0.contains(s1)) {
                        hashSet0.add(s1);
                        arrayList0.add(s1);
                    }
                }
                String s2 = TextUtils.join("|", arrayList0);
                this.FLD1471 = s2;
                if(s2.endsWith("|")) {
                    this.FLD1471 = this.FLD1471.substring(0, this.FLD1471.length() - 1);
                }
                ˎᵢ0.MTH922(this.FLD1471, "moment_filter");
                this.FLD1472 = Pattern.compile(this.FLD1471, 2);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3091(long v) {
        int v1 = this.FLD1445.MTH927(5000, "auto_like_delay");
        this.FLD1476.MTH3150(v);
        this.FLD1476.MTH3156(((long)v1));
        this.FLD1476.MTH3149(((long)v1));
    }

    public final CLS45 MTH3092() {
        if(this.FLD1473 == null) {
            CLS45 ˈˈ0 = new CLS45(CLS27.MTH900());
            this.FLD1473 = ˈˈ0;
            CLS40.FLD157.MTH1115(ˈˈ0);
        }
        return this.FLD1473;
    }

    // 此方法包含解密的字符串
    public final boolean MTH3093(String s) {
        CLS29 ˎᵢ0 = this.FLD1445;
        if(!ˎᵢ0.MTH938("auto_like_allowed_filter_enable", false)) {
            return true;
        }
        String s1 = ˎᵢ0.MTH925("auto_like_allowed_filter", "");
        return TextUtils.isEmpty(s1) || CLS502.MTH6930(s1, s);
    }

    public final CLS41 MTH3094() {
        if(this.FLD1475 == null) {
            CLS41 ʻˑ0 = new CLS41(CLS27.MTH900());
            this.FLD1475 = ʻˑ0;
            CLS40.FLD157.MTH1115(ʻˑ0);
        }
        return this.FLD1475;
    }

    // 此方法包含解密的字符串
    public final void MTH3095() {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: CLS21.FLD76.MTH832("snstimelineui.optionsmenu.options", new Object[0])) {
            linkedHashMap0.put(((String)((Pair)object0).first), ((Pair)object0).second);
        }
        CLS523.MTH7159(((CLS140)this).MTH3042(), CLS27.MTH889("appname"), linkedHashMap0, ((CLS7)new CLS1225(16)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3043() {
        this.MTH3092();
        this.MTH3094();
        if(this.FLD1445.MTH938("enable_block_snsad", false)) {
            this.FLD1446.MTH5753("AdSnsInfo");
        }
    }

    // 此方法包含解密的字符串
    public final boolean MTH3097(ContentValues contentValues0, String s) {
        CLS29 ˎᵢ0 = this.FLD1445;
        if(!ˎᵢ0.MTH938("auto_comment_like_filter_enable", false)) {
            return false;
        }
        Class class0 = CLS27.MTH894("snsContentClass");
        if(class0 == null) {
            return false;
        }
        String s1 = ˎᵢ0.MTH925("auto_comment_like_filter", "");
        if(CLS182.MTH3474(0x38EDFA702B3CD335L, contentValues0) == 3 && !CLS182.MTH3470(4102210216747914037L)) {
            Object object0 = CLS66.MTH1381(class0, contentValues0.getAsByteArray("content"));
            StringBuilder stringBuilder0 = CLS182.MTH3483(s);
            stringBuilder0.append(" ");
            stringBuilder0.append(CLS166.MTH3194(CLS166.MTH3194(object0, CLS27.MTH897("snsContentLinkField")), CLS27.MTH897("snsContentLinkTitleField")));
            s = stringBuilder0.toString();
        }
        return CLS502.MTH6930(s1, s);
    }

    // 此方法包含解密的字符串
    public final boolean MTH3098(String s) {
        String s1 = CLS34.MTH1079(4102208206703219509L, new StringBuilder(), s, 4102208232473023285L);
        CLS29 ˎᵢ0 = this.FLD1445;
        if(!ˎᵢ0.MTH938(s1, false)) {
            return false;
        }
        String s2 = ˎᵢ0.MTH925(CLS34.MTH1079(4102208309782434613L, new StringBuilder(), s, 0x38EDF8BF2B3CD335L), "");
        return !TextUtils.isEmpty(s2) && CLS481.MTH6697(s2);
    }

    // 此方法包含解密的字符串
    public final void MTH3099(ContentValues contentValues0, long v, String s) {
        boolean z;
        CLS29 ˎᵢ0 = this.FLD1445;
        int v1 = 0;
        if(!ˎᵢ0.MTH938("auto_comment_enable", false)) {
            return;
        }
        String s1 = contentValues0.getAsString("userName");
        if(ˎᵢ0.MTH938("auto_comment_only_enable", false)) {
            if(!CLS502.MTH6934(ˎᵢ0.MTH925("auto_comment_only_list", ""), new String[]{s1})) {
                return;
            }
        }
        else if(CLS502.MTH6934(ˎᵢ0.MTH925("auto_comment_excl_list", ""), new String[]{s1})) {
            return;
        }
        if(!this.MTH3098("comment") && this.FLD1444.MTH5302(s1)) {
            if(ˎᵢ0.MTH938("comment_only_once_per_day_enable", false)) {
                try {
                    JSONObject jSONObject0 = ˎᵢ0.MTH924("comment_only_limited_per_day_json", new JSONObject());
                    JSONObject jSONObject1 = new JSONObject();
                    if(jSONObject0.has(s1)) {
                        jSONObject1 = jSONObject0.getJSONObject(s1);
                        long v2 = jSONObject1.getLong("last_comment");
                        Calendar calendar0 = Calendar.getInstance();
                        calendar0.setTimeInMillis(v2);
                        int v3 = calendar0.get(6);
                        Calendar calendar1 = Calendar.getInstance();
                        calendar1.setTimeInMillis(System.currentTimeMillis());
                        if(v3 == calendar1.get(6)) {
                            int v4 = ˎᵢ0.MTH927(1, "comment_only_limited_per_day_max");
                            int v5 = jSONObject1.getInt("comment_cnt");
                            if(v4 == v5) {
                                z = true;
                            }
                            else {
                                jSONObject1.put("comment_cnt", v5 + 1);
                                jSONObject1.put("last_comment", System.currentTimeMillis());
                                jSONObject0.put(s1, jSONObject1);
                                ˎᵢ0.MTH922(jSONObject0, "comment_only_limited_per_day_json");
                                z = false;
                            }
                        }
                        else {
                            jSONObject1.put("comment_cnt", 1);
                            jSONObject1.put("last_comment", System.currentTimeMillis());
                            jSONObject0.put(s1, jSONObject1);
                            ˎᵢ0.MTH922(jSONObject0, "comment_only_limited_per_day_json");
                            z = false;
                        }
                    }
                    else {
                        jSONObject1.put("comment_cnt", 1);
                        jSONObject1.put("last_comment", System.currentTimeMillis());
                        jSONObject0.put(s1, jSONObject1);
                        ˎᵢ0.MTH922(jSONObject0, "comment_only_limited_per_day_json");
                        z = false;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    z = false;
                }
            }
            else {
                z = false;
            }
            if(!z) {
                if(ˎᵢ0.MTH938("comment_only_on_already_commented", false)) {
                    byte[] arr_b = contentValues0.getAsByteArray("attrBuf");
                    try {
                        Object object0 = CLS66.MTH1381(CLS27.MTH894("snsAttrClass"), arr_b);
                        if(object0 != null) {
                            v1 = ((LinkedList)CLS166.MTH3194(object0, CLS27.MTH897("snsAttrCommentsListField"))).size();
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                    if(v1 < 1) {
                        return;
                    }
                }
                CLS683 ˈˋ0 = new CLS683(this, v, s, s1);
                long v6 = (long)ˎᵢ0.MTH927(1500, "auto_comment_delay");
                CLS40.FLD157.MTH1123(((CLS39)ˈˋ0), v6);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH3100(CLS877 ﹶﾞ0, long v, ArrayList arrayList0, List[] arr_list, Object object0, String[] arr_s, int v1) {
        int v5;
        Object object2;
        ArrayDeque arrayDeque1;
        int v6;
        List list1;
        String s1;
        boolean z1;
        ﹶﾞ0.getClass();
        Class class0 = CLS27.MTH894("snsLikeClass");
        if(class0 != null && object0 != null) {
            try {
                if(ﹶﾞ0.MTH3094().MTH1132(v)) {
                    ContentValues contentValues0 = ﹶﾞ0.MTH3094().MTH1131(v);
                    if(contentValues0 != null) {
                        String s = contentValues0.getAsString("CREATETIMES");
                        LinkedList linkedList0 = new LinkedList();
                        for(Object object1: arr_list[0]) {
                            if(!CLS502.MTH6934(s, new String[]{String.valueOf(CLS166.MTH3181(object1, CLS27.MTH897("snsFieldCreateTime")))})) {
                                linkedList0.add(object1);
                            }
                        }
                        arr_list[0] = linkedList0;
                    }
                }
                ArrayList arrayList1 = new ArrayList();
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    int v2 = (int)(System.currentTimeMillis() / 1000L);
                    boolean z = CLS27.MTH895().MTH938("random_fake_comments", true);
                    List list0 = Arrays.asList(arr_s);
                    ArrayDeque arrayDeque0 = new ArrayDeque();
                    if(!z) {
                        arrayDeque0.addAll(list0);
                    }
                    Random random0 = new Random();
                    random0.setSeed(System.currentTimeMillis());
                    int v3 = CLS27.MTH895().MTH938("random_fake_comments", true) ? arrayList0.size() : arr_s.length;
                    Random random1 = new Random(System.currentTimeMillis());
                    SparseArray sparseArray0 = new SparseArray();
                    int v4 = 0;
                    while(v4 < v3) {
                        try {
                            z1 = false;
                            CLS78 ˊﾞ0 = (CLS78)arrayList0.get(v4);
                        }
                        catch(Throwable throwable1) {
                            z1 = z;
                            v5 = v2;
                            list1 = list0;
                            arrayDeque1 = arrayDeque0;
                            goto label_69;
                        }
                        if(z) {
                            try {
                                z1 = true;
                                object2 = list0.get(random0.nextInt(list0.size()));
                                s1 = (String)object2;
                                list1 = list0;
                                v5 = v2;
                                v6 = Math.max(v2 - random1.nextInt(10000), v1) + v4;
                                arrayDeque1 = arrayDeque0;
                                goto label_55;
                            label_40:
                                object2 = arrayDeque0.isEmpty() ? null : arrayDeque0.pop();
                                s1 = (String)object2;
                                list1 = list0;
                                v5 = v2;
                                v6 = Math.max(v2 - random1.nextInt(10000), v1) + v4;
                                arrayDeque1 = arrayDeque0;
                                goto label_55;
                            }
                            catch(Throwable throwable1) {
                            }
                            v5 = v2;
                            list1 = list0;
                            arrayDeque1 = arrayDeque0;
                            goto label_69;
                        }
                        else {
                            goto label_40;
                        }
                        s1 = (String)object2;
                        list1 = list0;
                        v5 = v2;
                        v6 = Math.max(v2 - random1.nextInt(10000), v1) + v4;
                        arrayDeque1 = arrayDeque0;
                        goto label_55;
                        try {
                            v5 = v2;
                            v6 = Math.max(v2 - random1.nextInt(10000), v1) + v4;
                            arrayDeque1 = arrayDeque0;
                            goto label_55;
                        }
                        catch(Throwable throwable1) {
                        }
                        arrayDeque1 = arrayDeque0;
                        goto label_69;
                        try {
                        label_55:
                            Object object3 = CLS166.MTH3188(class0, new Object[0]);
                            CLS166.MTH3198(object3, CLS27.MTH897("snsFieldUsername"), "");
                            CLS166.MTH3198(object3, CLS27.MTH897("snsFieldNickname"), "");
                            CLS166.MTH3198(object3, CLS27.MTH897("snsFieldType"), 2);
                            CLS166.MTH3196(v6, object3, CLS27.MTH897("snsFieldCreateTime"));
                            CLS166.MTH3198(object3, CLS27.MTH892("snsLikeContentField", CLS27.MTH897("snsCommentContentField")), s1);
                            CLS166.MTH3196(v6, object3, CLS27.MTH892("snsLikeField7", CLS27.MTH897("snsCommentField3")));
                            while(sparseArray0.indexOfKey(v6) >= 0) {
                                ++v6;
                            }
                            sparseArray0.append(v6, object3);
                            arrayList1.add(String.valueOf(v6));
                            goto label_70;
                        }
                        catch(Throwable throwable1) {
                        }
                    label_69:
                        CLS27.MTH893(throwable1);
                    label_70:
                        ++v4;
                        z = z1;
                        list0 = list1;
                        v2 = v5;
                        arrayDeque0 = arrayDeque1;
                    }
                    for(int v7 = 0; v7 < v3; ++v7) {
                        arr_list[0].add(sparseArray0.valueAt(v7));
                    }
                }
                if(arrayList0 == null || arrayList0.isEmpty()) {
                    ﹶﾞ0.MTH3094().MTH1129(v);
                    CLS166.MTH3198(object0, CLS27.MTH897("snsAttrCommentsListField"), arr_list[0]);
                }
                else {
                    ﹶﾞ0.MTH3094().MTH1130(v, TextUtils.join(",", arrayList1));
                    CLS166.MTH3198(object0, CLS27.MTH897("snsAttrCommentsListField"), arr_list[0]);
                    CLS166.MTH3196(arrayList0.size(), object0, CLS27.MTH897("snsAttrCommentFieldCount"));
                }
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("attrBuf", CLS396.MTH5764(object0));
                ﹶﾞ0.FLD1446.MTH5767("SnsInfo", contentValues1, "snsId = ?", new String[]{String.valueOf(v)});
                CLS66.MTH1373();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

