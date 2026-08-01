// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SearchView;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˆʿ.CLS59;
import b.ˆʿ.CLS61;
import b.ˈˈ.CLS67;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS94;
import b.ˈˈ.CLS96;
import b.ˊﾞ.CLS101;
import b.ˑٴ.CLS651;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS753;
import b.ˑٴ.CLS766;
import b.ᵔʾ.CLS1235;
import b.ᵔʾ.CLS302;
import b.ᵔʾ.CLS310;
import b.ⁱʾ.CLS1270;
import b.ⁱʾ.CLS1271;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS326;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1278;
import b.ⁱᵔ.CLS1362;
import b.ⁱᵔ.CLS1406;
import b.ⁱᵔ.CLS1408;
import b.ⁱᵔ.CLS1418;
import b.ⁱᵔ.CLS1437;
import b.ⁱᵔ.CLS1473;
import b.ⁱᵔ.CLS1480;
import b.ⁱᵔ.CLS1485;
import b.ⁱᵔ.CLS1510;
import b.ⁱᵔ.CLS1535;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS382;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS442;
import b.ⁱᵔ.CLS449;
import b.ⁱᵔ.CLS450;
import b.ⁱᵔ.CLS453;
import b.ⁱᵔ.CLS456;
import b.ⁱᵔ.CLS457;
import b.ⁱᵔ.CLS487;
import b.ⁱᵔ.CLS488;
import b.ⁱᵔ.CLS495;
import b.ⁱᵔ.CLS499;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS507;
import b.ⁱᵔ.CLS509;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1618;
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
import b.ﾞˎ.CLS545;
import b.ﾞᐧ.CLS557;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;

public final class CLS1049 implements CLS7, CLS16, CLS17, CLS39, CLS378, CLS379, CLS441, CLS516 {
    public final int FLD2239;
    public final Object FLD2240;
    public final Object FLD2241;
    public final Object FLD2242;

    public CLS1049(Activity activity0, Object object0, Object object1, int v) {
        this.FLD2239 = v;
        this.FLD2242 = activity0;
        this.FLD2240 = object0;
        this.FLD2241 = object1;
        super();
    }

    public CLS1049(CLS81 יᐧ0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD2239 = 1;
        super();
        this.FLD2241 = יᐧ0;
        this.FLD2240 = arrayList0;
        this.FLD2242 = ﾞᵎ0;
    }

    public CLS1049(Object object0, Activity activity0, Object object1, int v) {
        this.FLD2239 = v;
        this.FLD2240 = object0;
        this.FLD2242 = activity0;
        this.FLD2241 = object1;
        super();
    }

    public CLS1049(Object object0, Object object1, Object object2, int v) {
        this.FLD2239 = v;
        this.FLD2240 = object0;
        this.FLD2241 = object1;
        this.FLD2242 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS557 ˆٴ2;
        Object object0 = this.FLD2242;
        Object object1 = this.FLD2241;
        Object object2 = this.FLD2240;
        int v = 0;
        switch(this.FLD2239) {
            case 3: {
                CLS81 יᐧ0 = (CLS81)object1;
                CLS3 ˆٴ0 = (CLS3)object0;
                File file0 = new File(((String)object2));
                if(CLS31.MTH1001(file0)) {
                    CLS557 ˆٴ1 = CLS101.MTH1943(((String)object2));
                    if(ˆٴ1 == null || ˆٴ1.MTH7474() == 0) {
                        CLS412.MTH6013(CLS27.MTH900(), CLS27.MTH889("failed"));
                    }
                    else {
                        ArrayList arrayList1 = יᐧ0.FLD306;
                        CLS47.FLD167.getClass();
                        OutputStream outputStream0 = CLS25.MTH865(3, CLS31.MTH979((יᐧ0.FLD310 + "_p" + arrayList1.size() + "_amr"), "amr"), "audio/amr");
                        try {
                            if(CLS31.MTH990(file0, outputStream0)) {
                                arrayList1.add(Math.max(1, ˆٴ1.MTH7474() / 1000));
                                if(!arrayList1.isEmpty()) {
                                    for(Object object3: arrayList1) {
                                        v += (int)(((Integer)object3));
                                    }
                                }
                                יᐧ0.FLD311 = v * 1000;
                                if(יᐧ0.MTH1666() != 0) {
                                    יᐧ0.FLD312 = 1;
                                    CLS47.FLD167.MTH1194(יᐧ0);
                                }
                                ˆٴ0.MTH774();
                                return;
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                            return;
                        }
                    }
                }
                try {
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 18: {
                if(((CLS557[])object2)[0] == null) {
                    if(((ArrayList)object1) == null || ((ArrayList)object1).isEmpty()) {
                        ˆٴ2 = null;
                    }
                    else {
                        ˆٴ2 = CLS101.MTH1943(((String)((ArrayList)object1).get(0)));
                        if(((ArrayList)object1).size() > 1) {
                            ArrayList arrayList2 = new ArrayList();
                            for(int v1 = 1; v1 < ((ArrayList)object1).size(); ++v1) {
                                arrayList2.add(CLS101.MTH1943(((String)((ArrayList)object1).get(v1))));
                            }
                            int v2 = ˆٴ2.FLD5444.length;
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ˆٴ2.FLD5444);
                            for(Object object4: arrayList2) {
                                byte[] arr_b = ((CLS557)object4).FLD5444;
                                arrayList3.add(arr_b);
                                v2 += arr_b.length;
                            }
                            byte[] arr_b1 = new byte[v2];
                            int v4 = 0;
                            for(int v3 = 0; v3 < arrayList3.size(); ++v3) {
                                byte[] arr_b2 = (byte[])arrayList3.get(v3);
                                System.arraycopy(arr_b2, 0, arr_b1, v4, arr_b2.length);
                                v4 += arr_b2.length;
                            }
                            ˆٴ2.FLD5444 = arr_b1;
                            ˆٴ2.FLD5443 = CLS557.MTH7470(((int)ˆٴ2.FLD5443.FLD5447), v2, ((CLS557)arrayList2.get(0)).FLD5443.FLD5446);
                        }
                    }
                    ((CLS557[])object2)[0] = ˆٴ2;
                }
                ((CLS12)object0).MTH791(((CLS557[])object2)[0]);
                return;
            }
            default: {
                String s = (String)((HashMap)object2).get(((String)object1));
                ((CLS79)object0).getClass();
                if(!TextUtils.isEmpty(s)) {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(s);
                    ((CLS79)object0).MTH1618("wx_chatroom_containers", arrayList0);
                }
                ((CLS79)object0).MTH1627();
                ((CLS79)object0).MTH1657(s);
                ((CLS79)object0).MTH1633();
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        Object object0 = this.FLD2242;
        Object object1 = this.FLD2241;
        Object object2 = this.FLD2240;
        if(this.FLD2239 == 6) {
            ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS702(((File[])object2), ((ArrayList)object1), ((CLS335)object0), 13)));
            return;
        }
        if(((CLS378)object2) != null) {
            ((CLS378)object2).MTH5452(ʻˑ0);
        }
        if(CLS500.FLD4928.MTH6895("sort_contacts")) {
            ʻˑ0.MTH7187("sort", ((CLS3)new CLS1437(((Activity)object0), ((CLS366)object1), 0)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Object object0 = this.FLD2242;
        Object object1 = this.FLD2241;
        Object object2 = this.FLD2240;
        switch(this.FLD2239) {
            case 0: {
                ((CLS1062)object2).getClass();
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                ArrayList arrayList0 = new ArrayList(((CLS81)object1).FLD309);
                CLS369 ﾞᵎ0 = new CLS369(((Activity)object0), arrayList0);
                CLS525 ʻˑ0 = new CLS525(((Activity)object0), linearLayout1, menu0);
                ʻˑ0.MTH7187("tags", ((CLS3)new CLS1235(5, ((CLS1062)object2), ((Activity)object0), ((CLS81)object1), ﾞᵎ0, arrayList0)));
                ʻˑ0.MTH7187("add", ((CLS3)new CLS897(((Activity)object0), ((CLS81)object1), arrayList0, ﾞᵎ0, 1)));
                ʻˑ0.MTH7187("clear", ((CLS3)new CLS702(((CLS81)object1), arrayList0, ﾞᵎ0, 10)));
                ʻˑ0.MTH7188();
                CLS1624 יﹳ0 = new CLS1624(((Activity)object0));
                יﹳ0.MTH7311();
                יﹳ0.FLD5274 = new CLS1043(ﾞᵎ0, 0);
                יﹳ0.MTH7302();
                יﹳ0.MTH7303(ﾞᵎ0);
                יﹳ0.MTH7305(new CLS310(1, ((Activity)object0), ((CLS1062)object2), ﾞᵎ0, ((CLS81)object1), arrayList0));
                CLS523.MTH7147(linearLayout1, ((CLS18)יﹳ0), true);
                return;
            }
            case 4: {
                ((CLS442)object2).getClass();
                Menu menu1 = (Menu)arr_object[0];
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                CLS525 ʻˑ1 = new CLS525(((Activity)object0), linearLayout2, menu1);
                if(!TextUtils.isEmpty(((CLS442)object2).FLD4214)) {
                    ʻˑ1.MTH7187("gotodefault", ((CLS3)new CLS1406(((CLS442)object2))));
                }
                ʻˑ1.MTH7188();
                ((CLS442)object2).FLD4218 = new CLS335(((Activity)object0));
                CLS1624 יﹳ1 = new CLS1624(((Activity)object0));
                ((CLS442)object2).FLD4216 = יﹳ1;
                יﹳ1.MTH7311();
                CLS1626 ـﹳ0 = new CLS1626(((Activity)object0));
                ((CLS442)object2).FLD4215 = ـﹳ0;
                ـﹳ0.FLD5295 = false;
                CLS523.MTH7147(linearLayout2, ((CLS18)ـﹳ0), true);
                ((CLS442)object2).FLD4216.MTH7301(new CLS249(4, ((CLS442)object2)));
                ((CLS442)object2).FLD4216.MTH7305(new CLS220(3, ((Activity)object0), ((CLS442)object2)));
                ((CLS442)object2).FLD4216.MTH7303(((CLS442)object2).FLD4218);
                CLS523.MTH7147(linearLayout2, ((CLS18)((CLS442)object2).FLD4216), true);
                File file0 = new File(((String)object1));
                ((CLS442)object2).FLD4219 = file0;
                if(!file0.isDirectory()) {
                    file0 = file0.getParentFile();
                }
                ((CLS442)object2).FLD4224 = file0;
                ((CLS442)object2).FLD4219 = file0;
                ((CLS442)object2).MTH6229();
                return;
            }
            case 5: {
                ((CLS507)object2).getClass();
                Menu menu2 = (Menu)arr_object[0];
                LinearLayout linearLayout3 = (LinearLayout)arr_object[1];
                CLS525 ʻˑ2 = new CLS525(((Activity)object0), linearLayout3, menu2);
                if(!TextUtils.isEmpty(((CLS507)object2).FLD4998)) {
                    ʻˑ2.MTH7187("gotodefault", ((CLS3)new CLS1278(((CLS507)object2), 0)));
                }
                ʻˑ2.MTH7187("select_all", ((CLS3)new CLS1278(((CLS507)object2), 1)));
                ʻˑ2.MTH7187("inverse", ((CLS3)new CLS1278(((CLS507)object2), 2)));
                ʻˑ2.MTH7188();
                ((CLS507)object2).FLD4996 = new CLS359(((Activity)object0));
                CLS1624 יﹳ2 = new CLS1624(((Activity)object0));
                ((CLS507)object2).FLD4997 = יﹳ2;
                יﹳ2.MTH7311();
                CLS1626 ـﹳ1 = new CLS1626(((Activity)object0));
                ((CLS507)object2).FLD5005 = ـﹳ1;
                ـﹳ1.FLD5295 = false;
                CLS523.MTH7147(linearLayout3, ((CLS18)ـﹳ1), true);
                ((CLS507)object2).FLD4997.MTH7301(new CLS249(5, ((CLS507)object2)));
                ((CLS507)object2).FLD4997.MTH7305(new CLS220(4, ((Activity)object0), ((CLS507)object2)));
                ((CLS507)object2).FLD4997.MTH7303(((CLS507)object2).FLD4996);
                CLS523.MTH7147(linearLayout3, ((CLS18)((CLS507)object2).FLD4997), true);
                File file1 = new File(((String)object1));
                if(!file1.isDirectory()) {
                    file1 = file1.getParentFile();
                }
                ((CLS507)object2).FLD5001 = file1;
                ((CLS507)object2).FLD5000 = file1;
                ((CLS507)object2).MTH6978();
                return;
            }
            case 7: {
                Activity activity0 = (Activity)object0;
                Menu menu3 = (Menu)arr_object[0];
                LinearLayout linearLayout4 = (LinearLayout)arr_object[1];
                HashSet hashSet0 = new HashSet();
                HashSet hashSet1 = new HashSet();
                CLS96 ﾞˎ0 = new CLS96();
                ﾞˎ0.FLD410 = new CLS1510(0, ((ArrayList)object2));
                ﾞˎ0.FLD409 = new CLS1510(1, ((ArrayList)object2));
                WebView webView0 = new WebView(activity0);
                webView0.getSettings().setJavaScriptEnabled(true);
                webView0.addJavascriptInterface(ﾞˎ0, "jsinterface");
                String[] arr_s = {""};
                ArrayList arrayList1 = new ArrayList();
                arrayList1.add("");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("");
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add("");
                CLS29 ˎᵢ0 = CLS27.MTH895();
                CLS1620 ˊˏ0 = new CLS1620(activity0);
                ˊˏ0.MTH7248(((CLS533)new CLS766(ˎᵢ0, arrayList1, webView0, arrayList2, arrayList3, 7, 0)));
                ˊˏ0.MTH7254("1");
                CLS1408 ˊʽ0 = new CLS1408(arr_s, ˎᵢ0, hashSet1, hashSet0, ˊˏ0, arrayList1, arrayList2, arrayList3, webView0);
                try {
                    SearchView searchView0 = new SearchView(activity0);
                    searchView0.setIconifiedByDefault(false);
                    searchView0.setSubmitButtonEnabled(true);
                    searchView0.setQueryHint(CLS27.MTH889("search_here"));
                    searchView0.setOnQueryTextListener(new CLS450(ˊʽ0));
                    searchView0.requestFocus();
                    CLS523.MTH7141(searchView0);
                    CLS523.MTH7158(linearLayout4, searchView0, true);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                CLS1535 ᴵʽ0 = new CLS1535(ˎᵢ0, ˊˏ0, hashSet1, hashSet0, arrayList1, arrayList2, arrayList3, webView0, arr_s, new int[]{1});
                CLS525 ʻˑ3 = new CLS525(activity0, linearLayout4, menu3);
                ʻˑ3.MTH7187("web_img_search_src", ((CLS3)new CLS1418(activity0, ˎᵢ0, 0)));
                ʻˑ3.MTH7187("web_img_search_type", ((CLS3)new CLS1098(activity0, ˎᵢ0, arrayList1, ˊˏ0, webView0, arrayList2, arrayList3)));
                ʻˑ3.MTH7187("add_to_web_image_fav", ((CLS3)new CLS954(activity0, ((ArrayList)object2), 1)));
                ʻˑ3.MTH7187("web_fav_image", ((CLS3)new CLS1480(activity0, ((CLS8)object1), 0)));
                ʻˑ3.MTH7187("load_more", ((CLS3)ᴵʽ0));
                if(CLS27.MTH895().MTH938("send_as_gif_enable", false) && (CLS500.FLD4928.MTH6895("send_as_gif") && !CLS182.MTH3470(4100831807123804981L) && CLS27.MTH899(new String[]{"MMAnimateViewClass", "MMAnimateViewClass_b", "MMAnimateViewClass_c"}))) {
                    ʻˑ3.MTH7187("send_img_as_gif", ((CLS3)new CLS651(activity0, 1)));
                }
                ʻˑ3.MTH7188();
                CLS523.MTH7147(linearLayout4, ((CLS18)ˊˏ0), true);
                ˊˏ0.MTH801(8);
                CLS523.MTH7158(linearLayout4, webView0, false);
                return;
            }
            case 8: {
                Activity activity1 = (Activity)object0;
                Menu menu4 = (Menu)arr_object[0];
                LinearLayout linearLayout5 = (LinearLayout)arr_object[1];
                ArrayList arrayList4 = new ArrayList();
                CLS96 ﾞˎ1 = new CLS96();
                ﾞˎ1.FLD408 = new CLS1362(((String[])object2), 0);
                WebView webView1 = new WebView(activity1);
                webView1.getSettings().setJavaScriptEnabled(true);
                webView1.addJavascriptInterface(ﾞˎ1, "jsinterface");
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add("");
                String[] arr_s1 = {""};
                CLS1620 ˊˏ1 = new CLS1620(activity1);
                ˊˏ1.MTH7248(((CLS533)new CLS1156(arrayList5, webView1, 19)));
                ˊˏ1.MTH7254("1");
                CLS29 ˎᵢ1 = CLS27.MTH895();
                CLS753 יﾞ0 = new CLS753(arr_s1, ˎᵢ1, arrayList4, ˊˏ1, arrayList5, webView1);
                try {
                    SearchView searchView1 = new SearchView(activity1);
                    searchView1.setIconifiedByDefault(false);
                    searchView1.setSubmitButtonEnabled(true);
                    searchView1.setQueryHint(CLS27.MTH889("search_here"));
                    searchView1.setOnQueryTextListener(new CLS509(יﾞ0));
                    searchView1.requestFocus();
                    CLS523.MTH7141(searchView1);
                    CLS523.MTH7158(linearLayout5, searchView1, false);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                CLS1098 ٴﹶ0 = new CLS1098(ˎᵢ1, ˊˏ1, arrayList4, arrayList5, webView1, arr_s1, new int[]{1});
                CLS525 ʻˑ4 = new CLS525(activity1, linearLayout5, menu4);
                ʻˑ4.MTH7187("web_img_search_src", ((CLS3)new CLS1418(activity1, ˎᵢ1, 1)));
                ʻˑ4.MTH7187("add_to_web_image_fav", ((CLS3)new CLS1274(activity1, ((String[])object2), 25)));
                ʻˑ4.MTH7187("web_fav_image", ((CLS3)new CLS1480(activity1, ((CLS8)object1), 1)));
                ʻˑ4.MTH7187("load_more", ((CLS3)ٴﹶ0));
                ʻˑ4.MTH7188();
                CLS523.MTH7147(linearLayout5, ((CLS18)ˊˏ1), true);
                ˊˏ1.MTH801(8);
                CLS523.MTH7158(linearLayout5, webView1, true);
                return;
            }
            case 9: {
                CLS523.MTH7137(10);
                Menu menu5 = (Menu)arr_object[0];
                LinearLayout linearLayout6 = (LinearLayout)arr_object[1];
                CLS1620 ˊˏ2 = new CLS1620(((Activity)object0));
                ˊˏ2.MTH7248(((CLS533)new CLS1473(((CLS29)object2), 0)));
                CLS525 ʻˑ5 = new CLS525(((Activity)object0), linearLayout6, menu5);
                ʻˑ5.MTH7187("config_img_watermark", ((CLS3)new CLS702(((CLS59)object1), ((CLS29)object2), ˊˏ2, 16)));
                ʻˑ5.MTH7188();
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(CLS27.MTH889("empty"));
                for(Object object3: ((CLS59)object1).MTH1285()) {
                    arrayList6.add(((CLS94)object3).FLD398);
                }
                ˊˏ2.MTH7247(arrayList6);
                ˊˏ2.MTH7246(((CLS29)object2).MTH925("watermark_img", "watermark"));
                CLS523.MTH7147(linearLayout6, ((CLS18)ˊˏ2), true);
                return;
            }
            case 10: {
                LinearLayout linearLayout7 = (LinearLayout)arr_object[1];
                CLS1635 ﾞᵎ1 = new CLS1635(((Activity)object0));
                ﾞᵎ1.MTH800(CLS27.MTH889("select_all"));
                ﾞᵎ1.MTH7438(new CLS499(((CLS338)object2), 0));
                CLS523.MTH7147(linearLayout7, ((CLS18)ﾞᵎ1), true);
                ((CLS1624)object1).FLD5274 = new CLS1271(((CLS338)object2), 2);
                ((CLS1624)object1).MTH7311();
                ((CLS1624)object1).MTH7302();
                ((CLS1624)object1).MTH7303(((CLS338)object2));
                ((CLS1624)object1).FLD5276 = false;
                ((CLS1624)object1).MTH7301(new CLS488(((CLS338)object2), 0));
                CLS523.MTH7147(linearLayout7, ((CLS18)(((CLS1624)object1))), true);
                return;
            }
            case 11: {
                String s = ((CLS29)object2).MTH925("mass_send_data_tags", "");
                ArrayList arrayList7 = new ArrayList();
                if(!TextUtils.isEmpty(s)) {
                    arrayList7.addAll(Arrays.asList(s.split(",")));
                }
                LinearLayout linearLayout8 = (LinearLayout)arr_object[1];
                CLS369 ﾞᵎ2 = new CLS369(((Activity)object0), arrayList7);
                CLS1624 יﹳ3 = new CLS1624(((Activity)object0));
                יﹳ3.FLD5274 = new CLS1043(ﾞᵎ2, 4);
                יﹳ3.MTH7302();
                יﹳ3.MTH7303(ﾞᵎ2);
                יﹳ3.MTH7301(new CLS457(((String[])object1), ﾞᵎ2));
                יﹳ3.MTH7305(new CLS456(0, ((Activity)object0), ﾞᵎ2, ((CLS29)object2), arrayList7));
                CLS523.MTH7147(linearLayout8, ((CLS18)יﹳ3), true);
                return;
            }
            case 12: {
                LinearLayout linearLayout9 = (LinearLayout)arr_object[1];
                CLS335 ˑٴ0 = new CLS335(((Activity)object0));
                CLS449.FLD4410.getClass();
                String s1 = CLS27.MTH882("q_fav2");
                Cursor cursor0 = CLS449.FLD4410.MTH6390(s1, null);
                if(cursor0 != null) {
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    if(cursor0.moveToFirst()) {
                        while(true) {
                            ContentValues contentValues0 = CLS404.MTH5911(cursor0);
                            if(contentValues0 != null) {
                                int v1 = CLS182.MTH3474(4100839293251801909L, contentValues0);
                                if(!((HashSet)object2).contains(v1)) {
                                    arrayList8.add(contentValues0);
                                    switch(v1) {
                                        case 1: {
                                            arrayList12.add(contentValues0);
                                            break;
                                        }
                                        case 2: {
                                            arrayList9.add(contentValues0);
                                            break;
                                        }
                                        case 3: {
                                            arrayList10.add(contentValues0);
                                            break;
                                        }
                                        case 4: 
                                        case 16: {
                                            arrayList11.add(contentValues0);
                                            break;
                                        }
                                        default: {
                                            arrayList13.add(contentValues0);
                                        }
                                    }
                                }
                            }
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                        }
                    }
                    if(!cursor0.isClosed()) {
                        cursor0.close();
                    }
                    CLS545 ᵔˉ0 = new CLS545();
                    LinearLayout linearLayout10 = new LinearLayout(((Activity)object0));
                    linearLayout10.setOrientation(0);
                    linearLayout10.setGravity(1);
                    LinearLayout linearLayout11 = new LinearLayout(((Activity)object0));
                    linearLayout11.setOrientation(0);
                    linearLayout11.setGravity(1);
                    RadioButton radioButton0 = new RadioButton(((Activity)object0));
                    RadioButton radioButton1 = new RadioButton(((Activity)object0));
                    RadioButton radioButton2 = new RadioButton(((Activity)object0));
                    RadioButton radioButton3 = new RadioButton(((Activity)object0));
                    if(!((HashSet)object2).contains(2)) {
                        radioButton0.setText(CLS27.MTH889("radio_img"));
                        linearLayout10.addView(radioButton0);
                        ᵔˉ0.MTH7361(radioButton0);
                    }
                    if(!((HashSet)object2).contains(1)) {
                        radioButton1.setText(CLS27.MTH889("radio_txt"));
                        linearLayout10.addView(radioButton1);
                        ᵔˉ0.MTH7361(radioButton1);
                    }
                    if(!((HashSet)object2).contains(3)) {
                        radioButton2.setText(CLS27.MTH889("radio_voice"));
                        linearLayout10.addView(radioButton2);
                        ᵔˉ0.MTH7361(radioButton2);
                    }
                    if(!((HashSet)object2).contains(4) && !((HashSet)object2).contains(16)) {
                        radioButton3.setText(CLS27.MTH889("radio_video"));
                        linearLayout11.addView(radioButton3);
                        ᵔˉ0.MTH7361(radioButton3);
                    }
                    RadioButton radioButton4 = new RadioButton(((Activity)object0));
                    radioButton4.setText(CLS27.MTH889("radio_others"));
                    linearLayout11.addView(radioButton4);
                    ᵔˉ0.MTH7361(radioButton4);
                    RadioButton radioButton5 = new RadioButton(((Activity)object0));
                    radioButton5.setText(CLS27.MTH889("radio_all"));
                    linearLayout11.addView(radioButton5);
                    ᵔˉ0.MTH7361(radioButton5);
                    ᵔˉ0.MTH7362(radioButton5);
                    ˑٴ0.MTH5111(arrayList8);
                    CLS1618 ʽﹶ0 = new CLS1618(((Activity)object0));
                    List list0 = Arrays.asList(new View[]{linearLayout10, linearLayout11});
                    ʽﹶ0.FLD5172.addAll(list0);
                    ᵔˉ0.FLD5348 = new CLS382(((ContentValues[])object1), ˑٴ0, radioButton5, arrayList8, radioButton0, arrayList9, radioButton1, arrayList12, radioButton3, arrayList11, radioButton2, arrayList10, radioButton4, arrayList13);
                    CLS1624 יﹳ4 = new CLS1624(((Activity)object0));
                    יﹳ4.FLD5274 = new CLS1270(ˑٴ0, 2);
                    יﹳ4.MTH7302();
                    יﹳ4.MTH7303(ˑٴ0);
                    יﹳ4.MTH7308(5);
                    יﹳ4.MTH7301(new CLS211(((ContentValues[])object1), ˑٴ0, 4));
                    יﹳ4.MTH7305(new CLS487(0, ((Activity)object0), ˑٴ0));
                    CLS1623 יᐧ2 = new CLS1623(((Activity)object0));
                    CLS182.MTH3498(יᐧ2, new Object[]{ʽﹶ0, יﹳ4}, 10, linearLayout9, יᐧ2);
                }
                return;
            }
            case 13: {
                LinearLayout linearLayout12 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ3 = new CLS1623(((Activity)object0));
                יᐧ3.MTH7289(new Object[]{((CLS1621)object2), ((CLS1621)object1)});
                יᐧ3.MTH7290(linearLayout12, 0);
                return;
            }
            case 14: {
                LinearLayout linearLayout13 = (LinearLayout)arr_object[1];
                for(Object object4: ((ArrayList)object2)) {
                    ((CLS1629)object1).MTH7372(((String)object4), ((String)object4));
                }
                if(!TextUtils.isEmpty(((String)object0))) {
                    ((CLS1629)object1).MTH7375(((String)object0));
                }
                CLS523.MTH7147(linearLayout13, ((CLS18)(((CLS1629)object1))), true);
                return;
            }
            case 15: {
                LinearLayout linearLayout14 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ4 = new CLS1623(((Activity)object0));
                יᐧ4.MTH7289(new Object[]{((CLS1626)object2), ((CLS1626)object1)});
                יᐧ4.MTH7290(linearLayout14, 0);
                return;
            }
            case 21: {
                LinearLayout linearLayout15 = (LinearLayout)arr_object[1];
                ((CLS1622)object2).MTH800(CLS27.MTH889("mp3_split"));
                ((CLS1622)object2).MTH7277(String.valueOf(((CLS29)object1).MTH927(60, "mp3_split")));
                ((CLS1622)object2).FLD5252 = new CLS1473(((CLS29)object1), 1);
                CLS1623 יᐧ5 = new CLS1623(((Activity)object0));
                יᐧ5.MTH7296(((CLS1622)object2));
                CLS523.MTH7154(linearLayout15, ((CLS18)יᐧ5), CLS523.MTH7137(10));
                return;
            }
            case 22: {
                LinearLayout linearLayout16 = (LinearLayout)arr_object[1];
                CLS326 ˉᐧ0 = new CLS326(((Activity)object0), CLS54.FLD172.MTH1248());
                CLS1624 יﹳ5 = new CLS1624(((Activity)object0));
                יﹳ5.FLD5274 = new CLS1485(ˉᐧ0, 0);
                יﹳ5.MTH7302();
                יﹳ5.MTH7303(ˉᐧ0);
                יﹳ5.MTH7308(10);
                יﹳ5.MTH7301(new CLS495(((AlertDialog[])object2), ((CLS7)object1), ˉᐧ0, 0));
                CLS523.MTH7147(linearLayout16, ((CLS18)יﹳ5), true);
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ0 = new CLS1623(((Activity)object0));
                int v = CLS523.MTH7137(10);
                CLS1625 ـˏ0 = new CLS1625(((Activity)object0));
                ـˏ0.MTH800(CLS27.MTH889("ban"));
                ـˏ0.MTH7320(new CLS67(((Activity)object0), ((String)object2), ((String)object1), 25));
                CLS1625 ـˏ1 = new CLS1625(((Activity)object0));
                ـˏ1.MTH800(CLS27.MTH889("unban"));
                ـˏ1.MTH7320(new CLS67(((String)object2), ((String)object1), ـˏ1, 26));
                CLS1625 ـˏ2 = new CLS1625(((Activity)object0));
                ـˏ2.MTH800(CLS27.MTH889("whitelist"));
                ـˏ2.MTH7320(new CLS453(0, ((String)object2), ((String)object1)));
                CLS1625 ـˏ3 = new CLS1625(((Activity)object0));
                ـˏ3.MTH800(CLS27.MTH889("changeChatroomName"));
                ـˏ3.MTH7320(new CLS230(((Activity)object0), ((String)object2), 11));
                יᐧ0.MTH7289(new Object[]{ـˏ0, ـˏ1, ـˏ2, ـˏ3});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
                CLS1623 יᐧ1 = new CLS1623(((Activity)object0));
                יᐧ1.MTH800(CLS27.MTH889("supermodconfig"));
                CLS1625 ـˏ4 = new CLS1625(((Activity)object0));
                ـˏ4.MTH800(CLS27.MTH889("remove_whitelist"));
                ـˏ4.MTH7320(new CLS453(1, ((String)object2), ((String)object1)));
                יᐧ1.MTH7296(ـˏ4);
                CLS1625 ـˏ5 = new CLS1625(((Activity)object0));
                ـˏ5.MTH800(CLS27.MTH889("add_chatroom_moderator"));
                ـˏ5.MTH7320(new CLS453(2, ((String)object2), ((String)object1)));
                יᐧ1.MTH7296(ـˏ5);
                CLS1625 ـˏ6 = new CLS1625(((Activity)object0));
                ـˏ6.MTH800(CLS27.MTH889("remove_chatroom_moderator"));
                ـˏ6.MTH7320(new CLS453(3, ((String)object2), ((String)object1)));
                יᐧ1.MTH7296(ـˏ6);
                CLS1625 ـˏ7 = new CLS1625(((Activity)object0));
                ـˏ7.MTH800(CLS27.MTH889("add_permaban"));
                ـˏ7.MTH7320(new CLS453(4, ((String)object2), ((String)object1)));
                יᐧ1.MTH7296(ـˏ7);
                CLS1625 ـˏ8 = new CLS1625(((Activity)object0));
                ـˏ8.MTH800(CLS27.MTH889("remove_permaban"));
                ـˏ8.MTH7320(new CLS453(5, ((String)object2), ((String)object1)));
                יᐧ1.MTH7296(ـˏ8);
                CLS1625 ـˏ9 = new CLS1625(((Activity)object0));
                ـˏ9.MTH800(CLS27.MTH889("groupAnnounce"));
                ـˏ9.MTH7320(new CLS230(((Activity)object0), ((String)object2), 12));
                יᐧ1.MTH7296(ـˏ9);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS518$CLS516
    public final void MTH7045(Bitmap bitmap0) {
        File file0 = (File)this.FLD2240;
        CLS8 ـˏ0 = (CLS8)this.FLD2242;
        CLS518.MTH7077(file0, bitmap0);
        String s = CLS31.MTH986(file0);
        CLS31.MTH990(file0, CLS25.MTH865(15, ((String)this.FLD2241), s));
        if(ـˏ0 != null) {
            try {
                ـˏ0.MTH786(file0.getAbsolutePath());
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        Object object0 = this.FLD2242;
        Object object1 = this.FLD2240;
        Object object2 = this.FLD2241;
        switch(this.FLD2239) {
            case 1: {
                if(!TextUtils.isEmpty(s)) {
                    ((CLS81)object2).FLD309.add(s);
                    ((ArrayList)object1).add(s);
                    ((CLS369)object0).notifyDataSetChanged();
                }
                return;
            }
            case 25: {
                ((CLS1626)object1).MTH7325(s);
                ((CLS79)object2).MTH1628(((String)object0), s);
                ((CLS79)object2).MTH1633();
                return;
            }
            default: {
                CLS21.FLD76.MTH818("dialogBan", new Object[]{((String)object1), ((String)object2), s});
                ((View)object0).setVisibility(8);
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS442$CLS441
    public final void MTH6222(InputStream inputStream0) {
        CLS61 ﾞٴ0 = (CLS61)this.FLD2240;
        ArrayList arrayList0 = (ArrayList)this.FLD2241;
        CLS369 ﾞᵎ0 = (CLS369)this.FLD2242;
        String s = CLS31.MTH998(inputStream0);
        if(!TextUtils.isEmpty(s)) {
            try {
                JSONArray jSONArray0 = new JSONArray(s);
                if(jSONArray0.length() != 0) {
                    ﾞٴ0.MTH1343(jSONArray0);
                    arrayList0.clear();
                    arrayList0.addAll(ﾞٴ0.MTH1316());
                    ﾞᵎ0.notifyDataSetChanged();
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        Object object1 = this.FLD2242;
        Object object2 = this.FLD2241;
        Object object3 = this.FLD2240;
        switch(this.FLD2239) {
            case 17: {
                if(((ArrayList)object0) != null && !((ArrayList)object0).isEmpty()) {
                    ((HashSet)object3).addAll(((ArrayList)object0));
                    ((ArrayList)object2).clear();
                    ((ArrayList)object2).addAll(((HashSet)object3));
                    ((CLS369)object1).notifyDataSetChanged();
                }
                return;
            }
            case 19: {
                if(((ArrayList)object0) == null || ((ArrayList)object0).isEmpty()) {
                    ((ArrayList)object3).clear();
                    ((ArrayList)object3).addAll(((CLS54)object2).MTH1248());
                }
                else {
                    ArrayList arrayList0 = new ArrayList();
                    Iterator iterator1 = ((CLS54)object2).MTH1248().iterator();
                    while(iterator1.hasNext()) {
                        boolean z = false;
                        Object object4 = iterator1.next();
                        CLS82 יﹳ0 = (CLS82)object4;
                        יﹳ0.getClass();
                        for(Object object5: ((ArrayList)object0)) {
                            if(יﹳ0.FLD316.contains(((String)object5))) {
                                z = true;
                                break;
                            }
                        }
                        if(z) {
                            arrayList0.add(יﹳ0);
                        }
                    }
                    ((ArrayList)object3).clear();
                    ((ArrayList)object3).addAll(arrayList0);
                }
                ((CLS326)object1).notifyDataSetChanged();
                return;
            }
            case 20: {
                CLS54 ᐧˉ0 = CLS54.FLD172;
                ᐧˉ0.getClass();
                if(!((CLS82)object0).FLD314.equals(((CLS82)object3).FLD314)) {
                    ((CLS82)object0).FLD316.addAll(((CLS82)object3).FLD316);
                    ((CLS82)object0).FLD313.addAll(((CLS82)object3).FLD313);
                    ᐧˉ0.FLD171.remove(((CLS82)object3).FLD314);
                    ((CLS82)object0).MTH1672();
                }
                ((ArrayList)object2).remove(((CLS82)object3));
                ((CLS326)object1).notifyDataSetChanged();
                return;
            }
            default: {
                String s = (String)((HashMap)object3).get(((String)object0));
                String s1 = CLS27.MTH895().MTH925("at_multiple_tag_" + ((String)object2) + "_" + s, "");
                HashSet hashSet0 = new HashSet();
                if(!TextUtils.isEmpty(s1)) {
                    hashSet0.addAll(Arrays.asList(s1.split(",")));
                }
                Iterator iterator0 = ((CLS363)object1).MTH5261().iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    hashSet0.add("");
                }
                CLS27.MTH895().MTH922(TextUtils.join(",", hashSet0), "at_multiple_tag_" + ((String)object2) + "_" + s);
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        ((CLS1062)this.FLD2240).getClass();
        ArrayList arrayList0 = new ArrayList(((LinkedHashMap)this.FLD2241).keySet());
        CLS369 ﾞᵎ0 = new CLS369(((Activity)this.FLD2242), arrayList0);
        CLS1624 יﹳ0 = new CLS1624(((Activity)this.FLD2242));
        יﹳ0.FLD5274 = new CLS1043(ﾞᵎ0, 1);
        יﹳ0.MTH7302();
        יﹳ0.MTH7311();
        יﹳ0.MTH7303(ﾞᵎ0);
        יﹳ0.MTH7301(new CLS302(((CLS1062)this.FLD2240), ﾞᵎ0, ((LinkedHashMap)this.FLD2241), ((Activity)this.FLD2242)));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}

