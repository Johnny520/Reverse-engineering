// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS25.CLS24;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS575;
import b.ˆʿ.CLS42;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS67;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS82;
import b.ˈˊ.CLS99;
import b.ᐧˉ.CLS1043;
import b.ᐧˉ.CLS1078;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS1156;
import b.ᐧˉ.CLS1177;
import b.ᐧˉ.CLS1214;
import b.ᐧˉ.CLS176;
import b.ᐧˉ.CLS181;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS200;
import b.ᐧˉ.CLS205;
import b.ᐧˉ.CLS211;
import b.ᐧˉ.CLS237;
import b.ᐧˉ.CLS249;
import b.ᐧˉ.CLS250;
import b.ᐧˉ.CLS258;
import b.ᐧˉ.CLS267;
import b.ᐧˉ.CLS276;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS1234;
import b.ᵔʾ.CLS1235;
import b.ᵔʾ.CLS288;
import b.ᵔʾ.CLS302;
import b.ᵔʾ.CLS310;
import b.ⁱʾ.CLS1266;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS316;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1326;
import b.ⁱᵔ.CLS1425;
import b.ⁱᵔ.CLS1471;
import b.ⁱᵔ.CLS1473;
import b.ⁱᵔ.CLS1479;
import b.ⁱᵔ.CLS1481;
import b.ⁱᵔ.CLS1506;
import b.ⁱᵔ.CLS1594;
import b.ⁱᵔ.CLS1599;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS373;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS438;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS456;
import b.ⁱᵔ.CLS467;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS510;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS534.CLS533;
import b.ﾞᐧ.CLS557;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS766 implements CLS7, CLS16, CLS17, CLS39, CLS378, CLS379, CLS441, CLS533 {
    public final int FLD1047;
    public final Object FLD1048;
    public final Object FLD1049;
    public final Object FLD1050;
    public final Object FLD1051;
    public final Object FLD1052;

    public CLS766(int v, Object object0, Object object1, Object object2, Object object3, ArrayList arrayList0) {
        this.FLD1047 = v;
        this.FLD1049 = object0;
        this.FLD1051 = object1;
        this.FLD1048 = object2;
        this.FLD1050 = arrayList0;
        this.FLD1052 = object3;
        super();
    }

    public CLS766(Activity activity0, CLS43 ˆʿ0, ArrayList arrayList0, ArrayList arrayList1, CLS347 ᐧי0) {
        this.FLD1047 = 15;
        super();
        this.FLD1049 = ˆʿ0;
        this.FLD1051 = activity0;
        this.FLD1050 = arrayList0;
        this.FLD1052 = ᐧי0;
        this.FLD1048 = arrayList1;
    }

    public CLS766(CLS54 ᐧˉ0, Activity activity0, CLS341[] arr_ـﹳ, ArrayList arrayList0) {
        this.FLD1047 = 13;
        super();
        this.FLD1049 = ᐧˉ0;
        this.FLD1051 = activity0;
        this.FLD1048 = arr_ـﹳ;
        this.FLD1052 = null;
        this.FLD1050 = arrayList0;
    }

    public CLS766(CLS369 ﾞᵎ0, CLS29 ˎᵢ0, String s, String s1, ArrayList arrayList0) {
        this.FLD1047 = 20;
        super();
        this.FLD1051 = s;
        this.FLD1050 = arrayList0;
        this.FLD1049 = ˎᵢ0;
        this.FLD1048 = s1;
        this.FLD1052 = ﾞᵎ0;
    }

    public CLS766(CLS500 ᵢﹶ0, Activity activity0, CLS29 ˎᵢ0, String s, CLS1622 ˑٴ0) {
        this.FLD1047 = 25;
        super();
        this.FLD1049 = ᵢﹶ0;
        this.FLD1050 = activity0;
        this.FLD1048 = ˎᵢ0;
        this.FLD1051 = s;
        this.FLD1052 = ˑٴ0;
    }

    public CLS766(Object object0, BaseAdapter baseAdapter0, Object object1, String s, ArrayList arrayList0, int v) {
        this.FLD1047 = v;
        this.FLD1049 = object0;
        this.FLD1048 = baseAdapter0;
        this.FLD1052 = object1;
        this.FLD1051 = s;
        this.FLD1050 = arrayList0;
        super();
    }

    public CLS766(Object object0, Object object1, Object object2, Object object3, Object object4, int v) {
        this.FLD1047 = v;
        this.FLD1049 = object0;
        this.FLD1051 = object1;
        this.FLD1050 = object2;
        this.FLD1048 = object3;
        this.FLD1052 = object4;
        super();
    }

    public CLS766(Object object0, Object object1, Object object2, Object object3, Object object4, int v, int v1) {
        this.FLD1047 = v;
        this.FLD1049 = object0;
        this.FLD1050 = object1;
        this.FLD1051 = object2;
        this.FLD1048 = object3;
        this.FLD1052 = object4;
        super();
    }

    public CLS766(ArrayList arrayList0, HashMap hashMap0, CLS363 ﾞٴ0, CLS371 ʻ0, CLS1626 ـﹳ0) {
        this.FLD1047 = 23;
        super();
        this.FLD1050 = arrayList0;
        this.FLD1049 = hashMap0;
        this.FLD1051 = ﾞٴ0;
        this.FLD1048 = ʻ0;
        this.FLD1052 = ـﹳ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object object0 = this.FLD1051;
        Object object1 = this.FLD1052;
        Object object2 = this.FLD1048;
        Object object3 = this.FLD1050;
        Object object4 = this.FLD1049;
        switch(this.FLD1047) {
            case 5: {
                File file0 = (File)object2;
                ((CLS1177)object4).getClass();
                if(((ArrayList)object0) != null && !((ArrayList)object0).isEmpty()) {
                    for(Object object7: ((ArrayList)object0)) {
                        CLS81 יᐧ0 = (CLS81)((HashMap)object3).get(((ContentValues)object7).getAsLong("code"));
                        CLS47 ˈˊ0 = CLS47.FLD167;
                        ˈˊ0.getClass();
                        ArrayList arrayList1 = new ArrayList();
                        try {
                            File file1 = new File(file0, יᐧ0.FLD310 + "_amr");
                            if(!CLS31.MTH1001(file1)) {
                                file1 = new File(file0, CLS31.MTH979((יᐧ0.FLD310 + "_amr"), "amr"));
                            }
                            if(CLS31.MTH1001(file1)) {
                                arrayList1.add(file1);
                            }
                            else {
                                ArrayList arrayList2 = יᐧ0.FLD306;
                                for(int v = 0; v < arrayList2.size(); ++v) {
                                    String s1 = יᐧ0.FLD310 + "_p" + v + "_amr";
                                    File file2 = new File(file0, s1);
                                    if(!CLS31.MTH1001(file2)) {
                                        file2 = new File(file0, CLS31.MTH979(s1, "amr"));
                                    }
                                    if(CLS31.MTH1001(file2)) {
                                        arrayList1.add(file2);
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                            arrayList1 = null;
                        }
                        if(arrayList1 != null && !arrayList1.isEmpty()) {
                            if(ˈˊ0.FLD164.containsKey(יᐧ0.FLD308)) {
                                long v1 = ˈˊ0.MTH1197();
                                יᐧ0.FLD310 = "sf_" + v1;
                                יᐧ0.FLD308 = v1;
                                if(arrayList1.size() == 1) {
                                    try {
                                        File file3 = (File)arrayList1.get(0);
                                        CLS24 ˉᐧ$ˆٴ0 = ˈˊ0.FLD165;
                                        String s2 = CLS31.MTH979((יᐧ0.FLD310 + "_amr"), CLS31.MTH1006(file3));
                                        String s3 = CLS31.MTH986(file3);
                                        CLS31.MTH990(file3, CLS25.MTH872(ˉᐧ$ˆٴ0.FLD87, s2, s3, ˉᐧ$ˆٴ0.FLD89));
                                    }
                                    catch(Throwable throwable1) {
                                        CLS27.MTH893(throwable1);
                                    }
                                }
                                else {
                                    for(int v2 = 0; v2 < arrayList1.size(); ++v2) {
                                        try {
                                            File file4 = (File)arrayList1.get(v2);
                                            CLS24 ˉᐧ$ˆٴ1 = ˈˊ0.FLD165;
                                            String s4 = CLS31.MTH979((יᐧ0.FLD310 + "_p" + v2 + "_amr"), CLS31.MTH1006(file4));
                                            String s5 = CLS31.MTH986(file4);
                                            CLS31.MTH990(file4, CLS25.MTH872(ˉᐧ$ˆٴ1.FLD87, s4, s5, ˉᐧ$ˆٴ1.FLD89));
                                        }
                                        catch(Throwable throwable2) {
                                            CLS27.MTH893(throwable2);
                                        }
                                    }
                                }
                            }
                            else {
                                for(Object object8: arrayList1) {
                                    File file5 = (File)object8;
                                    try {
                                        CLS24 ˉᐧ$ˆٴ2 = ˈˊ0.FLD165;
                                        String s6 = file5.getName();
                                        String s7 = CLS31.MTH986(file5);
                                        CLS31.MTH990(file5, CLS25.MTH872(ˉᐧ$ˆٴ2.FLD87, s6, s7, ˉᐧ$ˆٴ2.FLD89));
                                    }
                                    catch(Throwable throwable3) {
                                        CLS27.MTH893(throwable3);
                                    }
                                }
                            }
                            ˈˊ0.MTH1194(יᐧ0);
                        }
                    }
                    CLS31.MTH1035(file0);
                    CLS412.MTH6013(((Activity)object1), CLS27.MTH889("import_done"));
                    CLS1229 ˆٴ0 = new CLS1229(26, ((CLS1177)object4));
                    CLS40.FLD157.MTH1116(((CLS39)ˆٴ0));
                }
                return;
            }
            case 14: {
                File file6 = (File)object3;
                for(Object object9: ((ArrayList)object4)) {
                    CLS82 יﹳ0 = (CLS82)((HashMap)object0).get(((ContentValues)object9).getAsString("id"));
                    CLS54 ᐧˉ0 = CLS54.FLD172;
                    ᐧˉ0.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    if(יﹳ0 != null) {
                        for(int v3 = 0; true; ++v3) {
                            try {
                                if(v3 >= יﹳ0.MTH1678()) {
                                    break;
                                }
                                File file7 = new File(file6, יﹳ0.MTH1674(v3));
                                if(CLS31.MTH1001(file7)) {
                                    arrayList3.add(file7);
                                }
                            }
                            catch(Throwable throwable4) {
                                CLS27.MTH893(throwable4);
                                break;
                            }
                        }
                    }
                    if(!arrayList3.isEmpty()) {
                        for(Object object10: arrayList3) {
                            File file8 = (File)object10;
                            try {
                                CLS31.MTH990(file8, CLS25.MTH865(11, file8.getName(), CLS31.MTH986(file8)));
                            }
                            catch(Throwable throwable5) {
                                CLS27.MTH893(throwable5);
                            }
                        }
                        ᐧˉ0.MTH1244(יﹳ0);
                    }
                }
                CLS31.MTH1035(file6);
                CLS412.MTH6013(((Activity)object2), CLS27.MTH889("import_done"));
                ((CLS3)object1).getClass();
                CLS575 ⁱᵔ0 = new CLS575(((CLS3)object1), 5);
                CLS40.FLD157.MTH1116(((CLS39)ⁱᵔ0));
                return;
            }
            default: {
                HashSet hashSet0 = new HashSet(((ArrayList)object4));
                Iterator iterator0 = ((ArrayList)object3).iterator();
                while(iterator0.hasNext()) {
                    Object object5 = iterator0.next();
                    if(hashSet0.contains(((String)object5))) {
                        iterator0.remove();
                    }
                }
                for(Object object6: ((ArrayList)object4)) {
                    String s = (String)((HashMap)object0).get(((String)object6));
                    ((CLS79)object2).getClass();
                    if(!TextUtils.isEmpty(s)) {
                        ArrayList arrayList0 = new ArrayList();
                        arrayList0.add(s);
                        ((CLS79)object2).MTH1618("wx_chatroom_containers", arrayList0);
                    }
                    ((CLS79)object2).MTH1627();
                    ((CLS79)object2).MTH1657(s);
                }
                CLS1156 ᵔᵎ0 = new CLS1156(((CLS79)object2), ((CLS369)object1), 27);
                CLS40.FLD157.MTH1116(((CLS39)ᵔᵎ0));
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        Object object0 = this.FLD1052;
        Object object1 = this.FLD1048;
        Object object2 = this.FLD1051;
        Object object3 = this.FLD1050;
        Object object4 = this.FLD1049;
        switch(this.FLD1047) {
            case 3: {
                ((CLS1105)object4).getClass();
                ʻˑ0.MTH7187("apply_template", ((CLS3)new CLS1235(((CLS1105)object4), ((Activity)object3), ((String)object2), ((CLS380[])object1), ((String)object0), 4)));
                return;
            }
            case 15: {
                ʻˑ0.MTH7187("export_", ((CLS3)new CLS1471(((CLS43)object4), ((Activity)object2))));
                ʻˑ0.MTH7187("import_", ((CLS3)new CLS848(((CLS43)object4), ((Activity)object2), ((ArrayList)object3), ((CLS347)object0), 13)));
                ʻˑ0.MTH7187("delete", ((CLS3)new CLS1425(((Activity)object2), ((ArrayList)object3), ((CLS43)object4), ((ArrayList)object1), ((CLS347)object0))));
                ʻˑ0.MTH7187("add", ((CLS3)new CLS1425(((Activity)object2), ((CLS43)object4), ((ArrayList)object3), ((ArrayList)object1), ((CLS347)object0))));
                return;
            }
            default: {
                if(TextUtils.isEmpty(((String[])object4)[0])) {
                    ʻˑ0.MTH7187("select_video", ((CLS3)new CLS1235(((String[])object4), ((CLS1626)object2), ((CLS1626)object3), ((CLS557[])object1), ((MediaPlayer)object0), 14)));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        String s1;
        Object object0 = this.FLD1052;
        Object object1 = this.FLD1048;
        Object object2 = this.FLD1051;
        Object object3 = this.FLD1050;
        Object object4 = this.FLD1049;
        if(this.FLD1047 == 7) {
            int v1 = ((CLS29)object4).MTH927(0, "web_img_search_type");
            if(v1 == 1) {
                s1 = (String)((ArrayList)object3).get(v);
                if(!TextUtils.isEmpty(s1)) {
                    ((WebView)object2).loadData(s1, "text/html", CLS370.MTH5289(4100830067662050101L));
                    return;
                }
            }
            else if(v1 == 2) {
                s1 = (String)((ArrayList)object1).get(v);
                if(!TextUtils.isEmpty(s1)) {
                    ((WebView)object2).loadData(s1, "text/html", CLS370.MTH5289(4100830686137340725L));
                    return;
                }
            }
            else {
                s1 = (String)((ArrayList)object0).get(v);
                if(!TextUtils.isEmpty(s1)) {
                    ((WebView)object2).loadData(s1, "text/html", CLS370.MTH5289(4100830754856817461L));
                }
            }
            return;
        }
        ArrayList arrayList0 = (ArrayList)object3;
        HashMap hashMap0 = (HashMap)object4;
        CLS363 ﾞٴ0 = (CLS363)object2;
        CLS371 ʻ0 = (CLS371)object1;
        CLS1626 ـﹳ0 = (CLS1626)object0;
        try {
            String s2 = (String)arrayList0.get(v);
            if(s2.startsWith("[")) {
                Object[] arr_object = {hashMap0.get(s2)};
                String s3 = CLS21.FLD76.MTH826("getChatroomTag_chatrooms", arr_object);
                if(!TextUtils.isEmpty(s3)) {
                    ﾞٴ0.MTH5259(Arrays.asList(CLS502.MTH6941(s3)));
                }
            }
            else if(s2.startsWith("{")) {
                Object[] arr_object1 = {hashMap0.get(s2)};
                HashSet hashSet0 = (HashSet)CLS21.FLD76.MTH836("getContainerContent", arr_object1);
                if(!hashSet0.isEmpty()) {
                    ﾞٴ0.MTH5259(new ArrayList(hashSet0));
                }
            }
            else {
                ﾞٴ0.MTH5259(ʻ0.MTH5328(((String)hashMap0.get(s2))));
            }
            ﾞٴ0.notifyDataSetChanged();
            ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Object object0 = this.FLD1052;
        Object object1 = this.FLD1050;
        Object object2 = this.FLD1048;
        Object object3 = this.FLD1051;
        Object object4 = this.FLD1049;
        switch(this.FLD1047) {
            case 1: {
                ((CLS881)object4).getClass();
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                CLS525 ʻˑ0 = new CLS525(((Activity)object3), linearLayout1, menu0);
                if(CLS21.FLD76.MTH830("hasReadStoragePermission", new Object[0])) {
                    ʻˑ0.MTH7187("select_img2", ((CLS3)new CLS878(((CLS881)object4), ((HashSet)object2), ((ArrayList)object1), ((CLS335)object0), 0)));
                }
                if(CLS27.MTH890("AlbumPreviewUI")) {
                    ((CLS881)object4).FLD1491 = new CLS878(((CLS881)object4), ((HashSet)object2), ((ArrayList)object1), ((CLS335)object0), 1);
                    ʻˑ0.MTH7187("select_img3", ((CLS3)new CLS788(((CLS881)object4), 0)));
                }
                ʻˑ0.MTH7188();
                CLS1624 יﹳ0 = new CLS1624(((Activity)object3));
                יﹳ0.MTH7303(((CLS335)object0));
                יﹳ0.MTH7311();
                CLS523.MTH7147(linearLayout1, ((CLS18)יﹳ0), true);
                return;
            }
            case 6: {
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                ((CLS1624)object4).FLD5272.setChoiceMode(2);
                ((CLS1624)object4).FLD5274 = new CLS1229(28, ((CLS341)object2));
                ((CLS1624)object4).MTH7302();
                CLS1626 ـﹳ0 = new CLS1626(((Activity)object0));
                ـﹳ0.FLD5301 = true;
                ـﹳ0.FLD5295 = false;
                ـﹳ0.MTH800(CLS27.MTH889("selected"));
                CLS1623 יᐧ1 = new CLS1623(((Activity)object0));
                יᐧ1.FLD5259 = false;
                יᐧ1.MTH7296(ـﹳ0);
                ((CLS1624)object4).MTH7303(((CLS341)object2));
                CLS1635 ﾞᵎ0 = new CLS1635(((Activity)object0));
                ﾞᵎ0.MTH800(CLS27.MTH889("select_all"));
                ﾞᵎ0.FLD5426 = true;
                ﾞᵎ0.MTH7438(new CLS276(((CLS341)object2), ـﹳ0, 13));
                יᐧ1.MTH7296(ﾞᵎ0);
                ((CLS1624)object4).MTH7301(new CLS211(((CLS341)object2), ـﹳ0, 2));
                יᐧ1.MTH7296(((CLS1624)object4));
                CLS523.MTH7154(linearLayout2, ((CLS18)יᐧ1), CLS523.MTH7137(3));
                if(!TextUtils.isEmpty(((String)object3))) {
                    String[] arr_s = CLS502.MTH6941(((String)object3));
                    HashSet hashSet0 = new HashSet();
                    Collections.addAll(hashSet0, arr_s);
                    for(int v = 0; v < ((ArrayList)object1).size(); ++v) {
                        if(hashSet0.contains(((ArrayList)object1).get(v))) {
                            ((CLS341)object2).MTH5152(v, true);
                        }
                    }
                    ((CLS341)object2).notifyDataSetChanged();
                }
                return;
            }
            case 8: {
                LinearLayout linearLayout3 = (LinearLayout)arr_object[1];
                CLS1625 ـˏ0 = new CLS1625(((Activity)object4));
                ـˏ0.MTH800(CLS27.MTH889("select_contact"));
                ـˏ0.MTH7320(new CLS258(((String)object3), ((Activity)object4), ((String[])object1), ـˏ0));
                CLS523.MTH7147(linearLayout3, ((CLS18)ـˏ0), true);
                CLS1623 יᐧ2 = new CLS1623(((Activity)object4));
                CLS1626 ـﹳ1 = new CLS1626(((Activity)object4));
                ـﹳ1.MTH7324(new CLS438(((Activity)object4), ((Calendar)object2), ـﹳ1, 0));
                יᐧ2.MTH7296(ـﹳ1);
                CLS1626 ـﹳ2 = new CLS1626(((Activity)object4));
                ـﹳ2.MTH7324(new CLS438(((Activity)object4), ((Calendar)object2), ـﹳ2, 1));
                יᐧ2.MTH7296(ـﹳ2);
                ـﹳ1.MTH800(new SimpleDateFormat("yyyy-MM-dd").format(((Calendar)object2).getTime()));
                ـﹳ2.MTH800(new SimpleDateFormat("HH:mm").format(((Calendar)object2).getTime()));
                יᐧ2.MTH7290(linearLayout3, CLS523.MTH7137(10));
                CLS523.MTH7147(linearLayout3, ((CLS18)(((CLS1622)object0))), true);
                return;
            }
            case 9: {
                LinearLayout linearLayout4 = (LinearLayout)arr_object[1];
                ((CLS1622)object4).MTH800(CLS27.MTH889("transfer_amount"));
                ((CLS1622)object4).MTH7278(0x2000);
                ((CLS1622)object4).MTH7277(((String)object3));
                ((CLS1622)object1).MTH800(CLS27.MTH889("transfer_amount_desc"));
                ((CLS1622)object1).MTH7278(1);
                if(!TextUtils.isEmpty(((String)object2))) {
                    ((CLS1622)object1).MTH7277(((String)object2));
                }
                CLS1623 יᐧ3 = new CLS1623(((Activity)object0));
                CLS182.MTH3498(יᐧ3, new Object[]{((CLS1622)object4), ((CLS1622)object1)}, 10, linearLayout4, יᐧ3);
                return;
            }
            case 10: {
                LinearLayout linearLayout5 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ4 = new CLS1623(((Activity)object4));
                יᐧ4.MTH7289(new Object[]{((CLS1622)object3), ((CLS1622)object1), ((CLS1622)object2), ((CLS1622)object0)});
                יᐧ4.MTH7290(linearLayout5, 0);
                return;
            }
            case 11: {
                Menu menu1 = (Menu)arr_object[0];
                LinearLayout linearLayout6 = (LinearLayout)arr_object[1];
                CLS525 ʻˑ1 = new CLS525(((Activity)object4), linearLayout6, menu1);
                ʻˑ1.MTH7187("add", ((CLS3)new CLS1479(0, ((Activity)object4), ((CLS369)object2), ((CLS29)object3), ((ArrayList)object1))));
                ʻˑ1.MTH7187("delete_all", ((CLS3)new CLS1479(1, ((Activity)object4), ((CLS369)object2), ((CLS29)object3), ((ArrayList)object1))));
                ʻˑ1.MTH7188();
                CLS1624 יﹳ1 = new CLS1624(((Activity)object4));
                יﹳ1.FLD5274 = new CLS1043(((CLS369)object2), 5);
                יﹳ1.MTH7302();
                יﹳ1.MTH7303(((CLS369)object2));
                יﹳ1.MTH7301(new CLS467(((CLS369)object2), ((CLS12)object0)));
                יﹳ1.MTH7305(new CLS456(1, ((Activity)object4), ((CLS369)object2), ((CLS29)object3), ((ArrayList)object1)));
                CLS523.MTH7147(linearLayout6, ((CLS18)יﹳ1), true);
                return;
            }
            case 12: {
                Menu menu2 = (Menu)arr_object[0];
                LinearLayout linearLayout7 = (LinearLayout)arr_object[1];
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                int v1 = 0;
                for(Object object5: ((CLS47)object4).FLD164.values()) {
                    linkedHashMap0.put(v1 + ": " + ((CLS81)object5).FLD307, ((CLS81)object5).FLD308);
                    ++v1;
                }
                CLS369 ﾞᵎ1 = new CLS369(((Activity)object3), new ArrayList(linkedHashMap0.keySet()));
                if(((CLS7)object1) != null) {
                    CLS525 ʻˑ2 = new CLS525(((Activity)object3), linearLayout7, menu2);
                    ʻˑ2.MTH7187("send_audio", ((CLS3)new CLS1274(((Activity)object3), ((CLS7)object1), 26)));
                    if(CLS500.FLD4928.MTH6895("extract_vid_audio") && CLS27.MTH895().MTH938("forward_vid_audio", true)) {
                        ʻˑ2.MTH7187("send_vid_audio", ((CLS3)new CLS651(((Activity)object3), 2)));
                    }
                    ʻˑ2.MTH7188();
                }
                CLS1624 יﹳ2 = new CLS1624(((Activity)object3));
                יﹳ2.FLD5274 = new CLS1043(ﾞᵎ1, 6);
                יﹳ2.MTH7302();
                יﹳ2.MTH7311();
                יﹳ2.MTH7303(ﾞᵎ1);
                יﹳ2.MTH7308(10);
                יﹳ2.MTH7301(new CLS302(((CLS7)object2), ((AlertDialog[])object0), ﾞᵎ1, linkedHashMap0, 2));
                CLS523.MTH7147(linearLayout7, ((CLS18)יﹳ2), true);
                return;
            }
            case 13: {
                Menu menu3 = (Menu)arr_object[0];
                LinearLayout linearLayout8 = (LinearLayout)arr_object[1];
                ArrayList arrayList0 = new ArrayList(((CLS54)object4).FLD174);
                CLS1624 יﹳ3 = new CLS1624(((Activity)object3));
                CLS525 ʻˑ3 = new CLS525(((Activity)object3), linearLayout8, menu3);
                ʻˑ3.MTH7187("add", ((CLS3)new CLS702(((Activity)object3), arrayList0, ((CLS341[])object2), 25)));
                ʻˑ3.MTH7187("delete_all", ((CLS3)new CLS848(((Activity)object3), ((CLS54)object4), arrayList0, ((CLS341[])object2), 12)));
                ʻˑ3.MTH7188();
                ((CLS341[])object2)[0] = new CLS341(((Activity)object3), arrayList0, יﹳ3.FLD5272);
                יﹳ3.FLD5274 = new CLS1481(2, ((CLS341[])object2));
                יﹳ3.MTH7302();
                if(((HashSet)object0) != null) {
                    CLS341 ـﹳ3 = ((CLS341[])object2)[0];
                    for(int v2 = 0; v2 < ـﹳ3.FLD3365.size(); ++v2) {
                        if(((HashSet)object0).contains(((String)ـﹳ3.FLD3365.get(v2)))) {
                            ـﹳ3.MTH5152(v2, true);
                        }
                    }
                }
                יﹳ3.MTH7303(((CLS341[])object2)[0]);
                יﹳ3.MTH7301(new CLS249(6, ((CLS341[])object2)));
                יﹳ3.MTH7305(new CLS250(((Activity)object3), ((CLS341[])object2), arrayList0, ((ArrayList)object1), 2));
                CLS523.MTH7147(linearLayout8, ((CLS18)יﹳ3), true);
                return;
            }
            case 18: {
                Menu menu4 = (Menu)arr_object[0];
                LinearLayout linearLayout9 = (LinearLayout)arr_object[1];
                CLS525 ʻˑ4 = new CLS525(((Activity)object4), linearLayout9, menu4);
                ʻˑ4.MTH7187("apply", ((CLS3)new CLS848(((Activity)object4), ((ArrayList)object1), ((CLS17)object3), ((JSONObject)object2), 15, 0)));
                ʻˑ4.MTH7188();
                if(((CLS17)object0) != null) {
                    ((CLS17)object0).MTH796(new Object[]{((JSONObject)object2), linearLayout9});
                }
                return;
            }
            case 19: {
                Menu menu5 = (Menu)arr_object[0];
                LinearLayout linearLayout10 = (LinearLayout)arr_object[1];
                Object object6 = CLS40.FLD157.MTH1118(CLS42.class);
                CLS366 ﾞᐧ0 = new CLS366(((Activity)object4));
                if(TextUtils.isEmpty(((String)object3))) {
                    CLS1620 ˊˏ1 = new CLS1620(((Activity)object4));
                    CLS69 ʾᵢ0 = new CLS69();
                    ʾᵢ0.MTH1560(CLS34.MTH1059(4101198034690167605L, ʾᵢ0, CLS34.MTH1059(4101197905841148725L, ʾᵢ0, CLS34.MTH1059(4101197235826250549L, ʾᵢ0, CLS34.MTH1059(0x38EA610A2B3CD335L, ʾᵢ0, CLS27.MTH889("article"), 0x38EA611F2B3CD335L), 4101197308840694581L), 4101198008920363829L), 0x38EA61F62B3CD335L), "_KEYWORD_BANWARNING_");
                    if(!CLS412.MTH6002()) {
                        ʾᵢ0.MTH1560(CLS27.MTH889("qrcode2"), "_qrcode_BANWARNING_");
                    }
                    ˊˏ1.MTH7248(((CLS533)new CLS580(((String[])object2), ʾᵢ0, ((ArrayList)object1), ((CLS42)object6), ((String)object0), ﾞᐧ0)));
                    ˊˏ1.MTH7247(ʾᵢ0.MTH1566());
                    ˊˏ1.MTH7246(CLS27.MTH889("article"));
                    CLS523.MTH7147(linearLayout10, ((CLS18)ˊˏ1), true);
                }
                CLS1624 יﹳ4 = new CLS1624(((Activity)object4));
                יﹳ4.FLD5274 = new CLS1599(ﾞᐧ0, 1);
                יﹳ4.MTH7302();
                CLS525 ʻˑ5 = new CLS525(((Activity)object4), linearLayout10, menu5);
                ʻˑ5.MTH7187("delete_all", ((CLS3)new CLS1234(((Activity)object4), ﾞᐧ0, ((CLS42)object6), ((String)object0), ((ArrayList)object1), ((String[])object2))));
                ʻˑ5.MTH7188();
                if(!TextUtils.isEmpty(((String)object3))) {
                    ((String[])object2)[0] = (String)object3;
                    ((ArrayList)object1).clear();
                    for(Object object7: ((CLS42)object6).MTH1150(((String)object0), ((String)object3))) {
                        String s = ((Bundle)object7).getString("username");
                        int v3 = ((Bundle)object7).getInt("count");
                        ((ArrayList)object1).add(new CLS78(s, CLS66.MTH1452(((String)object0), s) + " (" + v3 + ")"));
                    }
                    ﾞᐧ0.MTH5276(((ArrayList)object1));
                }
                יﹳ4.MTH7305(new CLS181(((Activity)object4), ﾞᐧ0, ((CLS42)object6), ((String)object0), ((ArrayList)object1), ((String[])object2)));
                יﹳ4.MTH7303(ﾞᐧ0);
                יﹳ4.FLD5276 = false;
                CLS523.MTH7147(linearLayout10, ((CLS18)יﹳ4), true);
                return;
            }
            case 24: {
                Menu menu6 = (Menu)arr_object[0];
                LinearLayout linearLayout11 = (LinearLayout)arr_object[1];
                if(((CLS500)object4).MTH6895("friend_request_type")) {
                    CLS525 ʻˑ6 = new CLS525(((Activity)object3), linearLayout11, menu6);
                    ʻˑ6.MTH7187("friend_request_type", ((CLS3)new CLS651(((Activity)object3), 7)));
                    ʻˑ6.MTH7187("export_", ((CLS3)new CLS651(((Activity)object3), 8)));
                    ʻˑ6.MTH7187("import_", ((CLS3)new CLS720(2)));
                    ʻˑ6.MTH7187("copy_clipboard", ((CLS3)new CLS651(((Activity)object3), 9)));
                    ʻˑ6.MTH7188();
                }
                int v4 = CLS523.MTH7137(10);
                if(!CLS412.MTH6002()) {
                    CLS1626 ـﹳ4 = new CLS1626(((Activity)object3));
                    ـﹳ4.MTH798(CLS27.MTH889("add_contacts_warn"));
                    ـﹳ4.FLD5295 = false;
                    CLS523.MTH7147(linearLayout11, ((CLS18)ـﹳ4), true);
                }
                CLS1623 יᐧ5 = new CLS1623(((Activity)object3));
                if(!CLS182.MTH3470(0x38EAF0E92B3CD335L)) {
                    CLS1635 ﾞᵎ2 = new CLS1635(((Activity)object3));
                    ﾞᵎ2.MTH800(CLS27.MTH889("simulate_manual"));
                    ﾞᵎ2.MTH7437(((CLS29)object1).MTH938("nearby_friendreq_manual", false));
                    ﾞᵎ2.MTH7438(new CLS373(((CLS29)object1), 6));
                    יᐧ5.MTH7296(ﾞᵎ2);
                }
                ((CLS1622)object2).MTH800(CLS27.MTH889("max"));
                ((CLS1622)object2).MTH7278(2);
                יᐧ5.MTH7296(((CLS1622)object2));
                ((CLS1629)object0).MTH7381("radio_male");
                ((CLS1629)object0).MTH7381("radio_female");
                ((CLS1629)object0).MTH7381("radio_all");
                ((CLS1629)object0).MTH7375("radio_all");
                יᐧ5.MTH7296(((CLS1629)object0));
                CLS523.MTH7154(linearLayout11, ((CLS18)יᐧ5), v4);
                CLS387.MTH5587(((Activity)object3), linearLayout11);
                ((CLS29)object1).MTH922("", "nearby_friend_req_excl");
                CLS1266 ʾᵢ1 = new CLS1266(((Activity)object3));
                ʾᵢ1.FLD3438 = new CLS1225(25);
                CLS1625 ـˏ1 = new CLS1625(((Activity)object3));
                ـˏ1.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ1.MTH7320(new CLS67(ʾᵢ1, ((Activity)object3), ((CLS29)object1), 27));
                CLS1623 יᐧ6 = new CLS1623(((Activity)object3));
                יᐧ6.MTH7296(ـˏ1);
                CLS523.MTH7154(linearLayout11, ((CLS18)יᐧ6), v4);
                if(!CLS27.MTH895().MTH938("nearby_friendreq_manual", false)) {
                    CLS1623 יᐧ7 = new CLS1623(((Activity)object3));
                    CLS1625 ـˏ2 = new CLS1625(((Activity)object3));
                    ـˏ2.MTH800(CLS27.MTH889("stop_requests"));
                    ـˏ2.MTH7320(new CLS267(21));
                    יᐧ7.MTH7296(ـˏ2);
                    CLS1625 ـˏ3 = new CLS1625(((Activity)object3));
                    CLS1625 ـˏ4 = new CLS1625(((Activity)object3));
                    ـˏ3.MTH800(CLS27.MTH889("pause_requests"));
                    ـˏ3.MTH7320(new CLS237(ـˏ3, ـˏ4, 6));
                    יᐧ7.MTH7296(ـˏ3);
                    ـˏ4.MTH800(CLS27.MTH889("resume_requests"));
                    ـˏ4.MTH7320(new CLS237(ـˏ3, ـˏ4, 7));
                    יᐧ7.MTH7296(ـˏ4);
                    CLS288 ˈˊ0 = CLS288.FLD2989;
                    if(ˈˊ0.FLD2975) {
                        ـˏ3.MTH801(8);
                        ـˏ4.MTH801(0);
                    }
                    else {
                        ـˏ4.MTH801(8);
                        ـˏ3.MTH801(0);
                    }
                    CLS1625 ـˏ5 = new CLS1625(((Activity)object3));
                    ـˏ5.MTH800(CLS27.MTH889("clear_count"));
                    ـˏ5.MTH7320(new CLS267(20));
                    יᐧ7.MTH7296(ـˏ5);
                    CLS1626 ـﹳ5 = new CLS1626(((Activity)object3));
                    ـﹳ5.FLD5295 = false;
                    CLS1214 ﾞᴵ0 = new CLS1214(ـﹳ5, 3);
                    ﾞᴵ0.MTH774();
                    ˈˊ0.FLD2979 = ﾞᴵ0;
                    יᐧ7.MTH7296(ـﹳ5);
                    CLS523.MTH7154(linearLayout11, ((CLS18)יᐧ7), v4);
                }
                return;
            }
            case 25: {
                Activity activity0 = (Activity)object1;
                Menu menu7 = (Menu)arr_object[0];
                LinearLayout linearLayout12 = (LinearLayout)arr_object[1];
                if(((CLS500)object4).MTH6895("friend_request_type")) {
                    CLS525 ʻˑ7 = new CLS525(activity0, linearLayout12, menu7);
                    ʻˑ7.MTH7187("friend_request_type", ((CLS3)new CLS651(activity0, 6)));
                    ʻˑ7.MTH7188();
                }
                ((CLS29)object2).MTH922("", "chatroom_friend_req_excl");
                ArrayList arrayList1 = new ArrayList();
                CLS371.FLD3470.MTH5349(((String)object3), arrayList1);
                for(Object object8: arrayList1) {
                    CLS66.MTH1420(((CLS78)object8));
                }
                int v5 = CLS523.MTH7137(10);
                if(!CLS412.MTH6002()) {
                    CLS1626 ـﹳ6 = new CLS1626(activity0);
                    ـﹳ6.MTH798(CLS27.MTH889("add_contacts_warn"));
                    ـﹳ6.FLD5295 = false;
                    CLS523.MTH7147(linearLayout12, ((CLS18)ـﹳ6), true);
                }
                CLS1623 יᐧ8 = new CLS1623(activity0);
                ((CLS1622)object0).MTH800(CLS27.MTH889("max"));
                ((CLS1622)object0).MTH7278(2);
                ((CLS1622)object0).MTH7277(String.valueOf(arrayList1.size()));
                יᐧ8.MTH7296(((CLS1622)object0));
                CLS523.MTH7154(linearLayout12, ((CLS18)יᐧ8), v5);
                CLS387.MTH5587(activity0, linearLayout12);
                CLS1225 ʻˏ0 = new CLS1225(24);
                CLS1266 ʾᵢ2 = new CLS1266(activity0);
                CLS1266 ʾᵢ3 = new CLS1266(activity0);
                ʾᵢ2.FLD3438 = ʻˏ0;
                ʾᵢ3.FLD3438 = ʻˏ0;
                CLS1625 ـˏ6 = new CLS1625(activity0);
                ـˏ6.MTH800(CLS27.MTH889("config_include"));
                ـˏ6.MTH7320(new CLS510(arrayList1, ((CLS29)object2), ʾᵢ2, activity0, ((String)object3)));
                CLS1625 ـˏ7 = new CLS1625(activity0);
                ـˏ7.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ7.MTH7320(new CLS510(arrayList1, ʾᵢ3, activity0, ((String)object3), ((CLS29)object2)));
                CLS1635 ﾞᵎ3 = new CLS1635(activity0);
                ﾞᵎ3.MTH800(CLS27.MTH889("chatroom_friend_req_excl_owner"));
                ﾞᵎ3.MTH7437(((CLS29)object2).MTH938("chatroom_friend_req_excl_owner", false));
                ﾞᵎ3.MTH7438(new CLS373(((CLS29)object2), 4));
                CLS1635 ﾞᵎ4 = new CLS1635(activity0);
                ﾞᵎ4.MTH800(CLS27.MTH889("chatroom_friend_req_excl_mod"));
                ﾞᵎ4.MTH7437(((CLS29)object2).MTH938("chatroom_friend_req_excl_mod", false));
                ﾞᵎ4.MTH7438(new CLS373(((CLS29)object2), 5));
                CLS1623 יᐧ9 = new CLS1623(activity0);
                יᐧ9.MTH7289(new Object[]{ـˏ6, ـˏ7, ﾞᵎ3, ﾞᵎ4});
                CLS523.MTH7154(linearLayout12, ((CLS18)יᐧ9), v5);
                CLS1623 יᐧ10 = new CLS1623(activity0);
                CLS1625 ـˏ8 = new CLS1625(activity0);
                ـˏ8.MTH800(CLS27.MTH889("stop_requests"));
                ـˏ8.MTH7320(new CLS267(18));
                יᐧ10.MTH7296(ـˏ8);
                CLS1625 ـˏ9 = new CLS1625(activity0);
                CLS1625 ـˏ10 = new CLS1625(activity0);
                ـˏ9.MTH800(CLS27.MTH889("pause_requests"));
                ـˏ9.MTH7320(new CLS237(ـˏ9, ـˏ10, 4));
                יᐧ10.MTH7296(ـˏ9);
                ـˏ10.MTH800(CLS27.MTH889("resume_requests"));
                ـˏ10.MTH7320(new CLS237(ـˏ9, ـˏ10, 5));
                יᐧ10.MTH7296(ـˏ10);
                CLS288 ˈˊ1 = CLS288.FLD2989;
                if(ˈˊ1.FLD2975) {
                    ـˏ9.MTH801(8);
                    ـˏ10.MTH801(0);
                }
                else {
                    ـˏ10.MTH801(8);
                    ـˏ9.MTH801(0);
                }
                CLS1625 ـˏ11 = new CLS1625(activity0);
                ـˏ11.MTH800(CLS27.MTH889("clear_count"));
                ـˏ11.MTH7320(new CLS267(19));
                יᐧ10.MTH7296(ـˏ11);
                CLS1626 ـﹳ7 = new CLS1626(activity0);
                ـﹳ7.FLD5295 = false;
                CLS1214 ﾞᴵ1 = new CLS1214(ـﹳ7, 2);
                ﾞᴵ1.MTH774();
                ˈˊ1.FLD2979 = ﾞᴵ1;
                יᐧ10.MTH7296(ـﹳ7);
                CLS523.MTH7154(linearLayout12, ((CLS18)יᐧ10), v5);
                return;
            }
            case 26: {
                int v6 = CLS523.MTH7137(10);
                LinearLayout linearLayout13 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ11 = new CLS1623(((Activity)object4));
                ((CLS1622)object3).MTH800(CLS27.MTH889("max"));
                ((CLS1622)object3).MTH7278(2);
                ((CLS1622)object3).MTH7277(String.valueOf(CLS371.FLD3470.MTH5321(true).size()));
                יᐧ11.MTH7296(((CLS1622)object3));
                ((CLS1629)object1).MTH7381("radio_male");
                ((CLS1629)object1).MTH7381("radio_female");
                ((CLS1629)object1).MTH7381("radio_all");
                ((CLS1629)object1).MTH7375("radio_all");
                יᐧ11.MTH7296(((CLS1629)object1));
                ((CLS1629)object2).MTH7381("radio_order_up");
                ((CLS1629)object2).MTH7381("radio_order_down");
                ((CLS1629)object2).MTH7375("radio_order_down");
                יᐧ11.MTH7296(((CLS1629)object2));
                CLS1621 ˎᵢ0 = new CLS1621(((Activity)object4));
                ˎᵢ0.MTH800(CLS27.MTH889("delay"));
                ˎᵢ0.MTH7268(((long)CLS412.MTH6005(3000, "mass_friend_acc_delay")));
                ˎᵢ0.FLD5242 = new CLS1473(((CLS29)object0), 5);
                יᐧ11.MTH7296(ˎᵢ0);
                יᐧ11.MTH7290(linearLayout13, v6);
                CLS1635 ﾞᵎ5 = new CLS1635(((Activity)object4));
                ﾞᵎ5.MTH800(CLS27.MTH889("send_accept_reply"));
                ﾞᵎ5.MTH7437(((CLS29)object0).MTH938("send_accept_reply", false));
                ﾞᵎ5.MTH7438(new CLS373(((CLS29)object0), 7));
                CLS1625 ـˏ12 = new CLS1625(((Activity)object4));
                ـˏ12.MTH800(CLS27.MTH889("config_responses"));
                ـˏ12.MTH7320(new CLS267(24));
                CLS1623 יᐧ12 = new CLS1623(((Activity)object4));
                יᐧ12.MTH7289(new Object[]{ﾞᵎ5, ـˏ12});
                CLS523.MTH7154(linearLayout13, ((CLS18)יᐧ12), v6);
                return;
            }
            case 27: {
                Menu menu8 = (Menu)arr_object[0];
                LinearLayout linearLayout14 = (LinearLayout)arr_object[1];
                CLS525 ʻˑ8 = new CLS525(((Activity)object4), linearLayout14, menu8);
                ʻˑ8.MTH7187("show_not_participating", ((CLS3)new CLS1594(((Activity)object4), ((String)object3), ((ArrayList)object1))));
                ʻˑ8.MTH7187("export_not_participating", ((CLS3)new CLS1594(((ArrayList)object1), ((Activity)object4), ((String)object3), 3)));
                ʻˑ8.MTH7187("export_members", ((CLS3)new CLS1594(((ArrayList)object2), ((Activity)object4), ((String)object3), 4)));
                ʻˑ8.MTH7187("at_participating", ((CLS3)new CLS1594(((Activity)object4), ((String)object3), ((ArrayList)object2), 5)));
                ʻˑ8.MTH7187("at_not_participating", ((CLS3)new CLS1594(((Activity)object4), ((String)object3), ((ArrayList)object1), 6)));
                ʻˑ8.MTH7188();
                CLS366 ﾞᐧ1 = new CLS366(((Activity)object4), ((ArrayList)object0));
                CLS1624 יﹳ5 = new CLS1624(((Activity)object4));
                יﹳ5.FLD5274 = new CLS1599(ﾞᐧ1, 4);
                יﹳ5.MTH7302();
                יﹳ5.MTH7303(ﾞᐧ1);
                יﹳ5.FLD5276 = false;
                יﹳ5.MTH7301(new CLS200(ﾞᐧ1, ((Activity)object4), ((String)object3), 7));
                CLS1623 יᐧ13 = new CLS1623(((Activity)object4));
                יᐧ13.MTH7296(יﹳ5);
                CLS523.MTH7154(linearLayout14, ((CLS18)יᐧ13), CLS523.MTH7137(3));
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ0 = new CLS1623(((Activity)object4));
                יᐧ0.FLD5259 = false;
                יᐧ0.FLD5261 = true;
                CLS1620 ˊˏ0 = new CLS1620(((Activity)object4));
                CLS1629 ⁱˉ0 = new CLS1629(((Activity)object4));
                ⁱˉ0.FLD5360 = true;
                ⁱˉ0.MTH7381("radio_male");
                ⁱˉ0.MTH7381("radio_female");
                ⁱˉ0.MTH7381("none");
                ⁱˉ0.MTH7381("radio_all");
                ⁱˉ0.MTH7375("radio_all");
                if(CLS500.FLD4928.MTH6895("contacts_select_sex")) {
                    יᐧ0.MTH7296(ⁱˉ0);
                }
                ⁱˉ0.FLD5356 = new CLS1506(ⁱˉ0, ˊˏ0, ((CLS366)object3), ((ArrayList)object1));
                ˊˏ0.FLD5220 = true;
                ˊˏ0.MTH7248(((CLS533)new CLS1326(((ArrayList)object1), ⁱˉ0, ((CLS366)object3))));
                ˊˏ0.MTH7247(((ArrayList)object2));
                ((CLS1624)object0).FLD5274 = new CLS1326(ⁱˉ0, ((CLS366)object3), ((ArrayList)object1));
                ((CLS1624)object0).MTH7302();
                ((CLS1624)object0).MTH7303(((CLS366)object3));
                ((CLS1624)object0).FLD5276 = false;
                CLS182.MTH3498(יᐧ0, new Object[]{ˊˏ0, ((CLS1624)object0)}, 3, linearLayout0, יᐧ0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS792 ᴵʽ$ˆٴ0 = (CLS792)this.FLD1049;
        String s1 = (String)this.FLD1051;
        ᴵʽ$ˆٴ0.getClass();
        CLS66.MTH1427(s1, CLS426.MTH6121(s1, ((ArrayList)this.FLD1050)) + s, ((ArrayList)this.FLD1050));
        if(((ArrayList)this.FLD1048).size() == ((ArrayList)this.FLD1052).size()) {
            CLS371 ʻ0 = ᴵʽ$ˆٴ0.FLD1141.FLD1444;
            String s2 = "@" + CLS27.MTH889("all") + " " + s;
            ʻ0.getClass();
            try {
                ContentValues contentValues0 = CLS371.MTH5368(ʻ0.MTH5315(s1));
                if(contentValues0 != null) {
                    long v = (long)contentValues0.getAsLong("msgId");
                    if(v != 0L) {
                        ContentValues contentValues1 = new ContentValues();
                        contentValues1.put("content", s2);
                        ʻ0.MTH5366(v, contentValues1);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS442$CLS441
    public final void MTH6222(InputStream inputStream0) {
        int v = 0;
        Object object0 = this.FLD1052;
        Object object1 = this.FLD1050;
        Object object2 = this.FLD1048;
        Object object3 = this.FLD1051;
        Object object4 = this.FLD1049;
        if(this.FLD1047 == 16) {
            CLS79 ˎᵢ0 = (CLS79)object4;
            String s = (String)object3;
            HashMap hashMap0 = (HashMap)object2;
            ArrayList arrayList0 = (ArrayList)object1;
            CLS369 ﾞᵎ0 = (CLS369)object0;
            String s1 = CLS31.MTH998(inputStream0);
            if(!TextUtils.isEmpty(s1)) {
                try {
                    ˎᵢ0.MTH1629(new JSONArray(s1));
                    String[] arr_s = CLS502.MTH6941(ˎᵢ0.MTH1624());
                    while(v < arr_s.length) {
                        String s2 = arr_s[v];
                        if(s2.startsWith("wx__c_") && (TextUtils.isEmpty(s) || !s2.equals(s))) {
                            hashMap0.put(ˎᵢ0.MTH1625(s2), s2);
                        }
                        ++v;
                    }
                    arrayList0.clear();
                    arrayList0.addAll(hashMap0.keySet());
                    ﾞᵎ0.notifyDataSetChanged();
                    return;
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            return;
        }
        String s3 = (String)object3;
        ArrayList arrayList1 = (ArrayList)object1;
        CLS29 ˎᵢ1 = (CLS29)object4;
        String s4 = (String)object2;
        CLS369 ﾞᵎ1 = (CLS369)object0;
        String s5 = CLS31.MTH998(inputStream0);
        if(!TextUtils.isEmpty(s5)) {
            try {
                JSONArray jSONArray0 = new JSONArray(s5);
                while(v < jSONArray0.length()) {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    if(jSONObject0.has("templateName") || jSONObject0.has(s3)) {
                        String s6 = jSONObject0.getString("templateName");
                        if(!arrayList1.contains(s6)) {
                            arrayList1.add(s6);
                            ˎᵢ1.MTH922(TextUtils.join(",", arrayList1), s3);
                            ˎᵢ1.MTH922(jSONObject0, s4 + s6);
                        }
                    }
                    ++v;
                }
                ﾞᵎ1.notifyDataSetChanged();
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        HashSet hashSet0 = (HashSet)this.FLD1050;
        String s = (String)this.FLD1051;
        HashSet hashSet1 = (HashSet)this.FLD1048;
        HashSet hashSet2 = (HashSet)this.FLD1052;
        if(((HashSet)this.FLD1049).contains(((String)object0))) {
            CLS21.FLD76.MTH818("specialModes.config", new Object[]{((String)object0)});
            return;
        }
        if(hashSet0.contains(((String)object0))) {
            CLS21.FLD76.MTH819("chattingui.optionsmenu.config", new Object[]{((String)object0), s});
            return;
        }
        if(hashSet1.contains(((String)object0))) {
            CLS21.FLD76.MTH819("b.chatroominfoui.menu.config", new Object[]{((String)object0), s});
            return;
        }
        if(hashSet2.contains(((String)object0))) {
            CLS21.FLD76.MTH819("b.contactinfoui.menu.config", new Object[]{((String)object0), s});
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        Object object0 = this.FLD1052;
        Object object1 = this.FLD1048;
        Object object2 = this.FLD1050;
        Object object3 = this.FLD1051;
        Object object4 = this.FLD1049;
        switch(this.FLD1047) {
            case 4: {
                ((CLS1078)object4).getClass();
                CLS1624 יﹳ0 = new CLS1624(((Activity)object3));
                CLS1635 ﾞᵎ0 = new CLS1635(((Activity)object3));
                CLS1635 ﾞᵎ1 = new CLS1635(((Activity)object3));
                CLS1625 ـˏ0 = new CLS1625(((Activity)object3));
                CLS1625 ـˏ1 = new CLS1625(((Activity)object3));
                int v = CLS523.MTH7137(10);
                CLS316 ʽי0 = new CLS316(((Activity)object3), (((CLS99)object2).FLD489 ? ((CLS99)object2).FLD496 : ((CLS99)object2).FLD499));
                CLS1623 יᐧ0 = new CLS1623(((Activity)object3));
                ((CLS1622)object1).MTH800(CLS27.MTH889("task_name"));
                ((CLS1622)object1).MTH7277(((CLS99)object2).FLD491);
                יᐧ0.MTH7296(((CLS1622)object1));
                ((CLS1635)object0).MTH800(CLS27.MTH889("enable"));
                ((CLS1635)object0).MTH7437(((CLS99)object2).FLD500);
                יᐧ0.MTH7296(((CLS1635)object0));
                ﾞᵎ0.MTH800(CLS27.MTH889("repeat"));
                ﾞᵎ0.MTH7437(((CLS99)object2).FLD489);
                ﾞᵎ0.MTH7438(new CLS276(((CLS99)object2), ʽי0, 12));
                if(!((CLS99)object2).FLD495) {
                    יᐧ0.MTH7296(ﾞᵎ0);
                }
                ﾞᵎ1.MTH800(CLS27.MTH889("once_only"));
                ﾞᵎ1.MTH7437(((CLS99)object2).FLD497);
                ﾞᵎ1.MTH7438(new CLS205(((CLS99)object2), ʽי0, ﾞᵎ0, 9));
                יᐧ0.MTH7296(ﾞᵎ1);
                if(!((CLS99)object2).FLD495) {
                    CLS523.MTH7157(((CLS99)object2).FLD497, new CLS18[]{ﾞᵎ0});
                }
                ـˏ0.MTH800(CLS27.MTH889("set_content"));
                ـˏ0.MTH7320(new CLS176(((CLS99)object2), ((Activity)object3), 0));
                יᐧ0.MTH7296(ـˏ0);
                ـˏ1.MTH800(CLS27.MTH889("set_target"));
                ـˏ1.MTH7320(new CLS176(((CLS99)object2), ((Activity)object3), 1));
                יᐧ0.MTH7296(ـˏ1);
                ـˏ0.MTH801(0);
                ـˏ1.MTH801(0);
                if(!((CLS99)object2).MTH1931()) {
                    ـˏ0.MTH801(8);
                }
                if(!((CLS99)object2).MTH1929()) {
                    ـˏ1.MTH801(8);
                }
                CLS1625 ـˏ2 = new CLS1625(((Activity)object3));
                ـˏ2.MTH800(CLS27.MTH889("add_time"));
                ـˏ2.MTH7320(new CLS67(((CLS1078)object4), ((CLS99)object2), ʽי0, 19));
                יᐧ0.MTH7296(ـˏ2);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
                יﹳ0.MTH7303(ʽי0);
                יﹳ0.MTH7301(new CLS200(((CLS1078)object4), ((CLS99)object2), ʽי0, 0));
                יﹳ0.MTH7305(new CLS250(((CLS1078)object4), ((Activity)object3), ((CLS99)object2), ʽי0, 0));
                CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
                return;
            }
            case 17: {
                CLS1624 יﹳ1 = new CLS1624(((Activity)object4));
                יﹳ1.MTH7303(((CLS366)object1));
                יﹳ1.FLD5274 = new CLS1599(((CLS366)object1), 0);
                יﹳ1.MTH7302();
                יﹳ1.MTH7308(6);
                יﹳ1.MTH7301(new CLS211(((CLS366)object1), ((Activity)object4), 5));
                יﹳ1.MTH7305(new CLS310(((Activity)object4), ((CLS366)object1), ((CLS43)object0), ((String)object3), ((ArrayList)object2)));
                CLS1623 יᐧ1 = new CLS1623(((Activity)object4));
                יᐧ1.MTH7296(יﹳ1);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), CLS523.MTH7137(3));
                return;
            }
            default: {
                ((CLS1624)object4).MTH7303(((CLS366)object3));
                ((CLS1624)object4).FLD5276 = false;
                ((CLS1624)object4).MTH7301(new CLS200(((int[])object2), ((CLS366)object3), ((CLS1626)object1), 6));
                ((CLS1623)object0).MTH7296(((CLS1624)object4));
                CLS523.MTH7154(linearLayout0, ((CLS18)(((CLS1623)object0))), CLS523.MTH7137(3));
            }
        }
    }
}

