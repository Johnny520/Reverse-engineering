// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS565;
import b.ʾᵢ.CLS568;
import b.ʾᵢ.CLS569;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˆʿ.CLS59;
import b.ˆʿ.CLS61;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS93;
import b.ˈˈ.CLS94;
import b.ˈˊ.CLS99;
import b.ˊﾞ.CLS612;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1043;
import b.ᐧˉ.CLS1078.CLS1077;
import b.ᐧˉ.CLS1078;
import b.ᐧˉ.CLS1112;
import b.ᐧˉ.CLS1156;
import b.ᐧˉ.CLS1173;
import b.ᐧˉ.CLS1208;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS244;
import b.ᐧˉ.CLS899;
import b.ᐧˉ.CLS957;
import b.ᐧˉ.CLS985;
import b.ᵔʾ.CLS1228;
import b.ⁱʾ.CLS326;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1434;
import b.ⁱᵔ.CLS1544;
import b.ⁱᵔ.CLS1570;
import b.ⁱᵔ.CLS1601;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387.CLS1322;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395.CLS1343;
import b.ⁱᵔ.CLS395.CLS1354;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS534.CLS533;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

public final class CLS702 implements CLS3 {
    public final int FLD813;
    public final Object FLD814;
    public final Object FLD815;
    public final Object FLD816;

    public CLS702(Object object0, Object object1, Object object2, int v) {
        this.FLD813 = v;
        this.FLD815 = object0;
        this.FLD814 = object1;
        this.FLD816 = object2;
        super();
    }

    public CLS702(Object object0, ArrayList arrayList0, Object object1, int v) {
        this.FLD813 = v;
        this.FLD815 = object0;
        this.FLD816 = arrayList0;
        this.FLD814 = object1;
        super();
    }

    public CLS702(ArrayList arrayList0, Object object0, Object object1, int v) {
        this.FLD813 = v;
        this.FLD816 = arrayList0;
        this.FLD815 = object0;
        this.FLD814 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s3;
        String s2;
        int v = 3;
        Object object0 = this.FLD816;
        Object object1 = this.FLD814;
        Object object2 = this.FLD815;
        switch(this.FLD813) {
            case 0: {
                ((CLS662)object2).getClass();
                if(((Set)object1).isEmpty()) {
                    ((CLS662)object2).FLD677.MTH2061(null, ((ArrayList)object0));
                }
                return;
            }
            case 1: {
                ((CLS881)object2).getClass();
                CLS523.MTH7142(((Activity)object1), ((CLS11)new CLS645(((CLS881)object2), ((ImageView)object0))));
                return;
            }
            case 2: {
                CLS523.MTH7165(((CLS140)(((CLS770)object2))).MTH3042(), CLS27.MTH889("remark"), "", ((String)object1), 1, ((CLS16)new CLS565(8, ((String)object1), ((String)object0))));
                return;
            }
            case 3: {
                ((CLS139)object2).getClass();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object5: ((ArrayList)object0)) {
                    String s = (String)((Pair)object5).second;
                    String s1 = "";
                    new String("");
                    new String("");
                    new String("");
                    if(!TextUtils.isEmpty(s)) {
                        if(!s.contains("[[") || !s.contains("]]")) {
                            s2 = "";
                        }
                        else {
                            int v2 = s.indexOf("[[");
                            int v3 = s.lastIndexOf("]]");
                            s2 = s.substring(v2 + 2, v3);
                            s = CLS182.MTH3495(s, 0, v2, new StringBuilder(), v3, 2);
                        }
                        if(!s.contains("{") || !s.contains("}")) {
                            s3 = "";
                        }
                        else {
                            int v4 = s.indexOf("{");
                            int v5 = s.lastIndexOf("}");
                            s3 = s.substring(v4 + 1, v5);
                            s = CLS182.MTH3495(s, 0, v4, new StringBuilder(), v5, 1);
                        }
                        String s4 = "";
                        if(s.contains("((") && s.contains("))")) {
                            int v6 = s.indexOf("((");
                            int v7 = s.lastIndexOf("))");
                            String s5 = s.substring(v6 + 2, v7);
                            s = CLS182.MTH3495(s, 0, v6, new StringBuilder(), v7, 2);
                            s4 = s5;
                        }
                        s3.getClass();
                        s2.getClass();
                        s4.getClass();
                        s1 = s.trim();
                    }
                    linkedHashMap0.put(((String)((Pair)object5).first), s1);
                }
                CLS523.MTH7159(((CLS139)object2).MTH3026(), CLS27.MTH889("appname"), linkedHashMap0, ((CLS7)new CLS763(object1)));
                return;
            }
            case 4: {
                CLS244 ᴵʻ0 = (CLS244)object2;
                Activity activity0 = (Activity)object1;
                CLS1625 ـˏ0 = (CLS1625)object0;
                ᴵʻ0.getClass();
                try {
                    HashSet hashSet1 = new HashSet();
                    if(CLS502.MTH6934(ᴵʻ0.FLD2542, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"}) && !ᴵʻ0.FLD2538.MTH6895("rp_response_voice")) {
                        hashSet1.add(3);
                    }
                    CLS395.MTH5740(activity0, ((CLS7)new CLS1156(ᴵʻ0, ـˏ0, 0)), hashSet1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 5: {
                CLS210 ˋʼ0 = (CLS210)object2;
                Activity activity1 = (Activity)object1;
                CLS1625 ـˏ1 = (CLS1625)object0;
                ˋʼ0.getClass();
                try {
                    HashSet hashSet2 = new HashSet();
                    if(CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"}) && !ˋʼ0.FLD2011.MTH6895("rp_response_voice")) {
                        hashSet2.add(3);
                    }
                    CLS395.MTH5740(activity1, ((CLS7)new CLS1156(ˋʼ0, ـˏ1, 1)), hashSet2);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 6: {
                ((CLS1112)object2).getClass();
                CLS523.MTH7142(((Activity)object1), ((CLS11)new CLS985(((CLS1112)object2), ((String)object0))));
                return;
            }
            case 7: {
                ((CLS899)object2).getClass();
                if(!((CLS1635)object1).MTH7444()) {
                    v = ((CLS1635)object0).MTH7444() ? 2 : 0;
                }
                else if(!((CLS1635)object0).MTH7444()) {
                    v = 1;
                }
                ((CLS899)object2).FLD2151.MTH922(v, "friendreq_history_type");
                return;
            }
            case 8: {
                ((CLS1173)object2).getClass();
                new String("WxPersonalNotificationTempl_");
                CLS403.MTH5865(((Activity)object1), CLS27.MTH889("createTemplate"), "WxPersonalNotificationTemplates", "WxPersonalNotificationTempl_", ((CLS12)new CLS1228(((CLS1173)object2), ((Activity)object1), ((ArrayList)object0), 6)));
                return;
            }
            case 9: {
                ((CLS1078)object2).getClass();
                CLS523.MTH7142(((Activity)object1), ((CLS11)new CLS1077(((CLS1078)object2), ((CLS99)object0))));
                return;
            }
            case 10: {
                ((CLS81)object2).FLD309.clear();
                ((ArrayList)object0).clear();
                ((CLS369)object1).notifyDataSetChanged();
                return;
            }
            case 11: {
                ((ArrayList)object0).add(((String)object2));
                ((CLS369)object1).getClass();
                CLS1043 ˑˆ0 = new CLS1043(((CLS369)object1), 2);
                CLS40.FLD157.MTH1116(((CLS39)ˑˆ0));
                return;
            }
            case 12: {
                CLS1570 ᵢי0 = new CLS1570(((CLS347)object1), ((ArrayList)object0));
                CLS1620 ˊˏ0 = new CLS1620(((Activity)object2));
                CLS1622 ˑٴ0 = new CLS1622(((Activity)object2));
                ˑٴ0.MTH800(CLS27.MTH889("label"));
                CLS1622 ˑٴ1 = new CLS1622(((Activity)object2));
                ˑٴ1.MTH800(CLS27.MTH889("action"));
                ˑٴ1.MTH801(8);
                CLS69 ʾᵢ0 = new CLS69();
                ʾᵢ0.MTH1560(CLS34.MTH1059(4100848918273512245L, ʾᵢ0, CLS34.MTH1059(4100848823784231733L, ʾᵢ0, CLS34.MTH1059(4100852577585648437L, ʾᵢ0, CLS34.MTH1059(4100852508866171701L, ʾᵢ0, CLS34.MTH1059(4100852440146694965L, ʾᵢ0, CLS34.MTH1059(4100852371427218229L, ʾᵢ0, CLS34.MTH1059(4100852818103817013L, ʾᵢ0, CLS34.MTH1059(4100852702139700021L, ʾᵢ0, CLS34.MTH1059(4100852075074474805L, ʾᵢ0, CLS34.MTH1059(4100852023534867253L, ʾᵢ0, CLS27.MTH889("scan"), 4100852045009703733L), 4100852654895059765L), 4100852749384340277L), 0x38E927F92B3CD335L), 4100852410081923893L), 4100852470211466037L), 4100852547520877365L), 4100852607650419509L), 4100848888208741173L), 4100848948338283317L), "addfriend");
                ˊˏ0.MTH7248(((CLS533)new CLS1156(ʾᵢ0, ˑٴ1, 20)));
                ˊˏ0.MTH7247(ʾᵢ0.MTH1566());
                ˊˏ0.MTH7246(CLS27.MTH889("scan"));
                CLS523.MTH7160(((Activity)object2), CLS27.MTH889("add"), ((CLS17)new CLS612(((Activity)object2), ˊˏ0, ˑٴ0, ˑٴ1, 22)), ((CLS11)new CLS1434(ʾᵢ0, ˊˏ0, ˑٴ0, ˑٴ1, ᵢי0)));
                return;
            }
            case 13: {
                for(int v1 = 0; v1 < ((File[])object2).length; ++v1) {
                    CLS31.MTH1005(((File[])object2)[v1]);
                }
                ((ArrayList)object0).clear();
                ((CLS335)object1).notifyDataSetChanged();
                return;
            }
            case 14: {
                CLS395.MTH5735(((Activity)object2), 1, "", "", "", ((CLS8)new CLS1354(((Activity)object2), ((CLS29)object1), ((String)object0))));
                return;
            }
            case 15: {
                CLS1622 ˑٴ2 = (CLS1622)object2;
                CLS1622 ˑٴ3 = (CLS1622)object1;
                CLS16 ﾞˎ0 = (CLS16)object0;
                try {
                    String s6 = ˑٴ2.MTH7285();
                    if(!TextUtils.isEmpty(s6)) {
                        String s7 = ˑٴ3.MTH7285();
                        if(!TextUtils.isEmpty(s7)) {
                            s6 = s6 + "#" + s7;
                        }
                        if(ﾞˎ0 != null) {
                            ﾞˎ0.MTH795(s6);
                            return;
                        }
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 16: {
                CLS94 ⁱˉ0 = ((CLS59)object2).MTH1283(((CLS29)object1).MTH925("watermark_img", "watermark"));
                if(ⁱˉ0 == null) {
                    ⁱˉ0 = new CLS94(((CLS29)object1).MTH925("watermark_img", "watermark"));
                }
                Object[] arr_object = {ⁱˉ0, new CLS1343(((CLS59)object2), ((CLS1620)object0))};
                CLS21.FLD76.MTH818("show_watermark_dialog", arr_object);
                return;
            }
            case 17: {
                String s8 = CLS27.MTH889("select_web_fav_categorie");
                CLS395.MTH5747(((Activity)object2), ((CLS12)new CLS568(((String[])object1), ((CLS3)object0), 11)), s8);
                return;
            }
            case 18: {
                int v8 = CLS182.MTH3474(4100845409285231413L, ((ContentValues)object2));
                int v9 = CLS182.MTH3474(4100845439350002485L, ((ContentValues)object2));
                int v10 = CLS182.MTH3474(4100845469414773557L, ((ContentValues)object2));
                int v11 = CLS182.MTH3474(4100845490889610037L, ((ContentValues)object2));
                ((CLS1626)object1).MTH7325((v8 == -1 ? CLS27.MTH889("click_to_select") : String.format("%02d:%02d", v8, v9)));
                ((CLS1626)object0).MTH7325((v10 == -1 ? CLS27.MTH889("click_to_select") : String.format("%02d:%02d", v10, v11)));
                return;
            }
            case 19: {
                ((ArrayList)object0).clear();
                ((ArrayList)object0).addAll(((CLS54)object2).MTH1248());
                ((CLS326)object1).notifyDataSetChanged();
                return;
            }
            case 20: {
                CLS1228 ʾˈ0 = new CLS1228(((Activity)object2), ((ArrayList)object0), ((CLS326)object1), 8);
                String s9 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                CLS31.MTH1000(((Activity)object2), ((CLS17)new CLS569(((Activity)object2), ((CLS12)ʾˈ0), 0)), new String[]{"silk", "slk", "amr"}, new String[]{"audio/amr", "audio/silk"}, s9, null);
                return;
            }
            case 21: {
                CLS476.MTH6647(((Activity)object2), ((CLS82)object1), new CLS1544(((CLS326)object0)));
                return;
            }
            case 22: {
                CLS957 ˆʾ0 = new CLS957(((File)object2), ((Activity)object1), ((CLS3)object0));
                CLS40.FLD157.MTH1124(((CLS39)ˆʾ0));
                return;
            }
            case 23: {
                CLS1601 ﹶٴ0 = new CLS1601(((CLS1626)object0), ((CLS82)object1));
                CLS523.MTH7160(((Activity)object2), CLS27.MTH889("tags"), ((CLS17)new CLS1156(((CLS82)object1).FLD316, ((Activity)object2), 23)), ((CLS11)ﹶٴ0));
                return;
            }
            case 24: {
                ((CLS81)object1).FLD307 = ((File)object2).getName();
                CLS47.FLD167.MTH1194(((CLS81)object1));
                ((CLS3)object0).MTH774();
                return;
            }
            case 25: {
                CLS523.MTH7165(((Activity)object2), CLS27.MTH889("add"), "", "", 1, ((CLS16)new CLS1156(((ArrayList)object0), ((CLS341[])object1), 21)));
                return;
            }
            case 26: {
                for(Object object6: ((ArrayList)object0)) {
                    ((CLS61)object2).MTH1317(((String)object6));
                }
                ((ArrayList)object0).clear();
                ((CLS369)object1).notifyDataSetChanged();
                return;
            }
            case 27: {
                CLS61 ﾞٴ0 = (CLS61)object2;
                Activity activity2 = (Activity)object1;
                if(!((ArrayList)object0).isEmpty()) {
                    try {
                        JSONArray jSONArray0 = new JSONArray();
                        for(Object object7: ﾞٴ0.MTH1329()) {
                            jSONArray0.put(((CLS93)object7).MTH1751());
                        }
                        CLS523.MTH7165(activity2, CLS27.MTH889("export_"), CLS27.MTH889("input_filename"), "", 1, ((CLS16)new CLS1208(activity2, jSONArray0, 1)));
                        return;
                    }
                    catch(Throwable throwable3) {
                        CLS27.MTH893(throwable3);
                    }
                }
                return;
            }
            case 28: {
                ArrayList arrayList1 = new ArrayList();
                Class class0 = CLS27.MTH894("AddressBookUtilClass");
                if(class0 != null) {
                    try {
                        List list0 = (List)CLS166.MTH3192(class0, CLS27.MTH897("AddressBookUtilGetContactsMethod"), new Object[]{CLS27.MTH900()});
                        if(list0 != null && !list0.isEmpty()) {
                            for(Object object8: list0) {
                                String s10 = ((String[])object8)[2];
                                arrayList1.add(new CLS78(s10, ((String[])object8)[1] + " (" + s10 + ")"));
                            }
                        }
                    }
                    catch(Throwable throwable4) {
                        CLS27.MTH893(throwable4);
                    }
                }
                if(!arrayList1.isEmpty()) {
                    HashSet hashSet3 = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object9: arrayList1) {
                        CLS78 ˊﾞ1 = (CLS78)object9;
                        if(!hashSet3.contains("")) {
                            hashSet3.add("");
                            arrayList2.add(ˊﾞ1);
                        }
                    }
                    CLS387.MTH5585(false, ((Activity)object2), arrayList2, ((CLS2)new CLS1322(((Activity)object2), ((ArrayList)object0), ((HashSet)object1))), "", -1);
                }
                return;
            }
            default: {
                HashSet hashSet0 = new HashSet();
                for(Object object3: ((CLS371)object2).MTH5373()) {
                    hashSet0.addAll(((CLS371)object2).MTH5328(((String)object3)));
                }
                ArrayList arrayList0 = new ArrayList();
                for(Object object4: ((CLS363)object1).FLD3447) {
                    CLS78 ˊﾞ0 = (CLS78)object4;
                    if(!hashSet0.contains("")) {
                        arrayList0.add("");
                    }
                }
                ((CLS363)object1).MTH5263();
                ((CLS363)object1).MTH5259(arrayList0);
                ((CLS363)object1).notifyDataSetChanged();
                ((CLS1626)object0).MTH7325(String.valueOf(((CLS363)object1).MTH5258()));
            }
        }
    }
}

