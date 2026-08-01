// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS69;
import b.ᵔʾ.CLS281;
import b.ᵔʾ.CLS310;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS359;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1325;
import b.ⁱᵔ.CLS1460;
import b.ⁱᵔ.CLS1481;
import b.ⁱᵔ.CLS1492;
import b.ⁱᵔ.CLS1536;
import b.ⁱᵔ.CLS1581;
import b.ⁱᵔ.CLS1606;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS455;
import b.ⁱᵔ.CLS486;
import b.ⁱᵔ.CLS496;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS530;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS1036 implements CLS17, CLS379, CLS533 {
    public final Object FLD2173;
    public final Object FLD2174;
    public final int FLD2175;
    public final Object FLD2176;
    public final ArrayList FLD2177;
    public final boolean FLD2178;
    public final Object FLD2179;
    public final Object FLD2180;
    public final Object FLD2181;

    public CLS1036(Activity activity0, CLS347 ᐧי0, ArrayList arrayList0, boolean z, CLS43 ˆʿ0, CLS12 ᵔʾ0, ArrayList arrayList1, ArrayList arrayList2) {
        this.FLD2175 = 2;
        super();
        this.FLD2179 = activity0;
        this.FLD2176 = ᐧי0;
        this.FLD2177 = arrayList0;
        this.FLD2178 = z;
        this.FLD2181 = ˆʿ0;
        this.FLD2180 = ᵔʾ0;
        this.FLD2173 = arrayList1;
        this.FLD2174 = arrayList2;
    }

    public CLS1036(Activity activity0, HashSet hashSet0, boolean z, CLS500 ᵢﹶ0, ArrayList arrayList0, CLS359 ⁱˉ0, CLS47 ˈˊ0, CLS1624 יﹳ0) {
        this.FLD2175 = 1;
        super();
        this.FLD2179 = activity0;
        this.FLD2176 = hashSet0;
        this.FLD2178 = z;
        this.FLD2181 = ᵢﹶ0;
        this.FLD2177 = arrayList0;
        this.FLD2180 = ⁱˉ0;
        this.FLD2173 = ˈˊ0;
        this.FLD2174 = יﹳ0;
    }

    public CLS1036(Activity activity0, JSONObject jSONObject0, ArrayList arrayList0, ArrayList arrayList1, boolean z, ArrayList arrayList2, String s, CLS1622 ˑٴ0) {
        this.FLD2175 = 3;
        super();
        this.FLD2179 = activity0;
        this.FLD2176 = jSONObject0;
        this.FLD2177 = arrayList0;
        this.FLD2181 = arrayList1;
        this.FLD2178 = z;
        this.FLD2180 = arrayList2;
        this.FLD2173 = s;
        this.FLD2174 = ˑٴ0;
    }

    public CLS1036(ArrayList arrayList0, CLS69 ʾᵢ0, boolean z, CLS1635 ﾞᵎ0, CLS1626 ـﹳ0, CLS1626 ـﹳ1, CLS1622 ˑٴ0, CLS1626 ـﹳ2) {
        this.FLD2175 = 0;
        super();
        this.FLD2177 = arrayList0;
        this.FLD2179 = ʾᵢ0;
        this.FLD2178 = z;
        this.FLD2176 = ﾞᵎ0;
        this.FLD2181 = ـﹳ0;
        this.FLD2180 = ـﹳ1;
        this.FLD2174 = ˑٴ0;
        this.FLD2173 = ـﹳ2;
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        CLS1635 ﾞᵎ0 = (CLS1635)this.FLD2176;
        CLS1626 ـﹳ0 = (CLS1626)this.FLD2181;
        CLS1626 ـﹳ1 = (CLS1626)this.FLD2180;
        CLS1622 ˑٴ0 = (CLS1622)this.FLD2174;
        CLS1626 ـﹳ2 = (CLS1626)this.FLD2173;
        this.FLD2177.set(0, "#" + ((CLS69)this.FLD2179).MTH1565(s));
        if(this.FLD2178 && ((int)(((Integer)((CLS69)this.FLD2179).MTH1565(s)))) == 8) {
            CLS523.MTH7157(!ﾞᵎ0.MTH7444(), new CLS18[]{ـﹳ0, ـﹳ1, ˑٴ0});
            CLS523.MTH7157(ﾞᵎ0.MTH7444(), new CLS18[]{ـﹳ2});
            CLS523.MTH7157(false, new CLS18[]{ﾞᵎ0});
            return;
        }
        CLS523.MTH7157(true, new CLS18[]{ﾞᵎ0, ـﹳ0, ـﹳ1, ˑٴ0});
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        String s6;
        int v3;
        int v2;
        StringBuilder stringBuilder0;
        String s1;
        ContentValues contentValues0;
        String s;
        int v1;
        ArrayList arrayList3;
        ArrayList arrayList2;
        ArrayList arrayList1;
        CLS525 ʻˑ1;
        Object object0 = this.FLD2174;
        Object object1 = this.FLD2173;
        Object object2 = this.FLD2180;
        Object object3 = this.FLD2181;
        Object object4 = this.FLD2176;
        Object object5 = this.FLD2179;
        if(this.FLD2175 == 1) {
            boolean z = this.FLD2178;
            ArrayList arrayList0 = this.FLD2177;
            CLS359 ⁱˉ0 = (CLS359)object2;
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            CLS525 ʻˑ0 = new CLS525(((Activity)object5), linearLayout0, menu0);
            if(((HashSet)object4).contains("text")) {
                ʻˑ1 = ʻˑ0;
                arrayList1 = arrayList0;
            }
            else {
                ʻˑ1 = ʻˑ0;
                arrayList1 = arrayList0;
                ʻˑ1.MTH7187("text", ((CLS3)new CLS1536(((Activity)object5), ⁱˉ0, ((CLS500)object3), arrayList1, z)));
            }
            if(((HashSet)object4).contains("image")) {
                arrayList2 = arrayList1;
            }
            else {
                arrayList2 = arrayList1;
                ʻˑ1.MTH7187("image", ((CLS3)new CLS913(arrayList2, ⁱˉ0, 3)));
                ʻˑ1.MTH7187("multi_img", ((CLS3)new CLS913(arrayList2, ⁱˉ0, 4)));
            }
            if(!z && !((HashSet)object4).contains("gif") && CLS404.MTH5905()) {
                ʻˑ1.MTH7187("gif", ((CLS3)new CLS913(arrayList2, ⁱˉ0, 5)));
            }
            if(!((HashSet)object4).contains("video")) {
                ʻˑ1.MTH7187("video", ((CLS3)new CLS913(arrayList2, ⁱˉ0, 6)));
            }
            if(!z && !((HashSet)object4).contains("friendcard")) {
                ʻˑ1.MTH7187("friendcard", ((CLS3)new CLS1581(((Activity)object5), arrayList2, ⁱˉ0, 3)));
            }
            if(!z && !((HashSet)object4).contains("location")) {
                ʻˑ1.MTH7187("location_msg", ((CLS3)new CLS1581(((Activity)object5), arrayList2, ⁱˉ0, 4)));
            }
            if(z || ((HashSet)object4).contains("mp3")) {
                arrayList3 = arrayList2;
            }
            else {
                arrayList3 = arrayList2;
                ʻˑ1.MTH7187("MP3", ((CLS3)new CLS1492(((Activity)object5), ((CLS47)object1), arrayList2, ⁱˉ0, 0)));
            }
            if(!((HashSet)object4).contains("fav")) {
                ʻˑ1.MTH7187("fav_item", ((CLS3)new CLS1536(((HashSet)object4), z, ((Activity)object5), arrayList3, ⁱˉ0)));
            }
            if(!z && !((HashSet)object4).contains("file") && CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(4100827825689121589L)) {
                ʻˑ1.MTH7187("file", ((CLS3)new CLS1581(((Activity)object5), arrayList3, ⁱˉ0, 5)));
            }
            if(!z && !((HashSet)object4).contains("voice") && ((CLS500)object3).MTH6895("voice_manager")) {
                ʻˑ1.MTH7187("voice_manager", ((CLS3)new CLS1152(((Activity)object5), arrayList3, ⁱˉ0, 24)));
            }
            if(!z && !((HashSet)object4).contains("voice") && CLS21.FLD76.MTH830("hasTTS", new Object[0])) {
                ʻˑ1.MTH7187("tts", ((CLS3)new CLS1152(((Activity)object5), arrayList3, ⁱˉ0, 25)));
            }
            if(CLS27.MTH902("web_response")) {
                if(!((HashSet)object4).contains("text")) {
                    ʻˑ1.MTH7187("web_text", ((CLS3)new CLS1152(((Activity)object5), arrayList3, ⁱˉ0, 26)));
                }
                if(!((HashSet)object4).contains("image")) {
                    ʻˑ1.MTH7187("web_img", ((CLS3)new CLS1152(((Activity)object5), arrayList3, ⁱˉ0, 27)));
                }
                if(!z && !((HashSet)object4).contains("gif")) {
                    ʻˑ1.MTH7187("web_gif", ((CLS3)new CLS1152(((Activity)object5), arrayList3, ⁱˉ0, 28)));
                }
                if(!((HashSet)object4).contains("video")) {
                    ʻˑ1.MTH7187("web_vid", ((CLS3)new CLS1152(((Activity)object5), arrayList3, ⁱˉ0, 29)));
                }
                if(!z && !((HashSet)object4).contains("file") && CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(4100842231009432373L)) {
                    ʻˑ1.MTH7187("web_file", ((CLS3)new CLS1581(((Activity)object5), arrayList3, ⁱˉ0, 0)));
                }
            }
            if(!CLS412.MTH6002() && !((HashSet)object4).contains("extract_url") && !((HashSet)object4).contains("video") && CLS21.FLD76.MTH830("has_vid_url_parser", new Object[0])) {
                ʻˑ1.MTH7187("extract_url", ((CLS3)new CLS1581(((Activity)object5), arrayList3, ⁱˉ0, 1)));
            }
            if(!z && ((CLS500)object3).MTH6895("mass_send_save_load")) {
                ʻˑ1.MTH7187("load", ((CLS3)new CLS1581(((Activity)object5), arrayList3, ⁱˉ0, 2)));
                ʻˑ1.MTH7187("save", ((CLS3)new CLS1325(0, ((Activity)object5), ⁱˉ0)));
            }
            ʻˑ1.MTH7188();
            CLS1635 ﾞᵎ0 = new CLS1635(((Activity)object5));
            ﾞᵎ0.MTH800(CLS27.MTH889("select_all"));
            ﾞᵎ0.MTH7438(new CLS496(ⁱˉ0, 0));
            CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
            ((CLS1624)object0).MTH7311();
            ((CLS1624)object0).MTH7303(ⁱˉ0);
            ((CLS1624)object0).MTH7301(new CLS204(ⁱˉ0, 3));
            ((CLS1624)object0).MTH7305(new CLS455(((Activity)object5), ⁱˉ0, ((CLS500)object3), arrayList3, z));
            CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1624)object0))), true);
            return;
        }
        JSONObject jSONObject0 = (JSONObject)object4;
        ArrayList arrayList4 = this.FLD2177;
        ArrayList arrayList5 = (ArrayList)object3;
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS1623 יᐧ0 = new CLS1623(((Activity)object5));
        CLS1624 יﹳ0 = new CLS1624(((Activity)object5));
        יﹳ0.MTH7311();
        int v = CLS523.MTH7137(10);
        try {
            if(jSONObject0.has("imgPaths")) {
                String[] arr_s = jSONObject0.optString("imgPaths").split(",");
                v1 = 0;
                while(true) {
                label_85:
                    if(v1 >= arr_s.length) {
                        break;
                    }
                    s = arr_s[v1];
                    contentValues0 = new ContentValues();
                    if(s.startsWith("url:")) {
                        s1 = s.substring(4);
                        contentValues0.put("web_img", s1);
                        contentValues0.put("url", s1);
                        stringBuilder0 = new StringBuilder();
                        v2 = v;
                        goto label_98;
                    }
                    else {
                        goto label_104;
                    }
                    ++v1;
                    v = v2;
                }
            }
            goto label_112;
        }
        catch(Throwable throwable0) {
            v2 = v;
            goto label_129;
        }
        try {
        label_98:
            stringBuilder0.append(CLS27.MTH889("web_img"));
            stringBuilder0.append(": ");
            stringBuilder0.append(s1);
            contentValues0.put("desc", stringBuilder0.toString());
            arrayList4.add(contentValues0);
            ++v1;
            v = v2;
            goto label_85;
        label_104:
            v2 = v;
            if(CLS31.MTH1024(s)) {
                contentValues0.put("img", s);
                contentValues0.put("desc", s);
                arrayList4.add(contentValues0);
            }
            ++v1;
            v = v2;
            goto label_85;
        label_112:
            v2 = v;
            if(jSONObject0.has("vidPath")) {
                ContentValues contentValues1 = new ContentValues();
                String s2 = jSONObject0.getString("vidPath");
                if(s2.startsWith("url:")) {
                    String s3 = s2.substring(4);
                    contentValues1.put("web_vid", s3);
                    contentValues1.put("url", s3);
                    contentValues1.put("desc", CLS27.MTH889("web_vid") + ": " + s3);
                    arrayList5.add(contentValues1);
                }
                else if(CLS31.MTH1024(s2)) {
                    contentValues1.put("vid", s2);
                    contentValues1.put("desc", s2);
                    arrayList5.add(contentValues1);
                }
            }
            goto label_130;
        }
        catch(Throwable throwable0) {
        }
    label_129:
        CLS27.MTH893(throwable0);
    label_130:
        CLS335 ˑٴ0 = new CLS335(((Activity)object5));
        ˑٴ0.FLD3331 = true;
        CLS1625 ـˏ0 = new CLS1625(((Activity)object5));
        CLS1625 ـˏ1 = new CLS1625(((Activity)object5));
        CLS1625 ـˏ2 = new CLS1625(((Activity)object5));
        CLS1625 ـˏ3 = new CLS1625(((Activity)object5));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(CLS27.MTH889("text"));
        arrayList6.add(CLS27.MTH889("image"));
        arrayList6.add(CLS27.MTH889("video"));
        CLS69 ʾᵢ0 = new CLS69();
        ʾᵢ0.MTH1560(CLS182.MTH3497(3, ʾᵢ0, CLS182.MTH3497(2, ʾᵢ0, CLS182.MTH3497(1, ʾᵢ0, CLS27.MTH889("image"), 4101233901962056501L), 0x38EA82862B3CD335L), 0x38EA828B2B3CD335L), 15);
        CLS1620 ˊˏ0 = new CLS1620(((Activity)object5));
        ˊˏ0.MTH800(CLS27.MTH889("types"));
        ˊˏ0.MTH7248(((CLS533)new CLS1460(ʾᵢ0, jSONObject0, ـˏ2, ـˏ3, ـˏ1, ـˏ0, ˑٴ0, arrayList4, יﹳ0, arrayList5)));
        try {
            if(jSONObject0.has("type")) {
                v3 = jSONObject0.getInt("type");
            }
            else {
                goto label_152;
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            v3 = 1;
        }
        goto label_153;
    label_152:
        v3 = 1;
    label_153:
        ˊˏ0.MTH7247(arrayList6);
        ˊˏ0.MTH7246(((String)ʾᵢ0.MTH1559(v3)));
        boolean z1 = this.FLD2178;
        if(!z1) {
            יᐧ0.MTH7296(ˊˏ0);
        }
        CLS1629 ⁱˉ1 = new CLS1629(((Activity)object5));
        ⁱˉ1.MTH7381("public");
        ⁱˉ1.MTH7381("private");
        ⁱˉ1.MTH7381("only_selected");
        ⁱˉ1.MTH7381("not_show_selected");
        ⁱˉ1.MTH7375("public");
        CLS1625 ـˏ4 = new CLS1625(((Activity)object5));
        ـˏ4.MTH800(CLS27.MTH889("select"));
        ـˏ4.MTH7320(new CLS258(((Activity)object5), ((ArrayList)object2), ((String)object1), jSONObject0, 12));
        ـˏ4.MTH801(8);
        יᐧ0.MTH7296(ـˏ4);
        ⁱˉ1.FLD5356 = new CLS1606(jSONObject0, ـˏ4, 2);
        יᐧ0.MTH7296(ⁱˉ1);
        ((CLS1622)object0).MTH800(CLS27.MTH889("content"));
        יᐧ0.MTH7296(((CLS1622)object0));
        String s4 = "";
        String s5 = "";
        if(v3 == 1) {
            s4 = CLS27.MTH889("add_img_path");
            s5 = CLS27.MTH889(CLS370.MTH5289(4101234949934076725L));
        }
        else if(v3 == 15) {
            s4 = CLS27.MTH889("set_vid_path");
            s5 = CLS27.MTH889(CLS370.MTH5289(4101234490372576053L));
        }
        ـˏ0.MTH800(CLS27.MTH889("web_text"));
        ـˏ0.MTH7320(new CLS263(((Activity)object5), ((CLS1622)object0), 3));
        ـˏ1.MTH800(s5);
        CLS1622 ˑٴ1 = (CLS1622)object0;
        ـˏ1.MTH7320(new CLS281(jSONObject0, ((Activity)object5), arrayList4, ˑٴ0, arrayList5, 5));
        ـˏ2.MTH800(s4);
        ـˏ2.MTH7320(new CLS258(jSONObject0, arrayList4, ˑٴ0, arrayList5));
        ـˏ3.MTH800(CLS27.MTH889("add_multi_img"));
        ـˏ3.MTH7320(new CLS530(arrayList4, ˑٴ0, 18));
        if(z1 || v3 != 1 && v3 != 15) {
            ـˏ2.MTH801(8);
            ـˏ1.MTH801(8);
            ـˏ3.MTH801(8);
        }
        if(CLS27.MTH902("web_response")) {
            יᐧ0.MTH7289(new Object[]{ـˏ0, ـˏ1});
        }
        יᐧ0.MTH7296(ـˏ2);
        יᐧ0.MTH7296(ـˏ3);
        CLS523.MTH7154(linearLayout1, ((CLS18)יᐧ0), v2);
        if(!z1) {
            יﹳ0.MTH7303(ˑٴ0);
        }
        try {
            if(jSONObject0.has("content")) {
                ˑٴ1.MTH7277(jSONObject0.getString("content"));
            }
            int v4 = jSONObject0.has("shareType") ? jSONObject0.getInt("shareType") : 0;
            if(v4 == 0) {
                ـˏ4.MTH801(8);
            }
            switch(v4) {
                case 0: {
                    s6 = "public";
                    break;
                }
                case 1: {
                    s6 = "private";
                    break;
                }
                case 2: {
                    s6 = "only_selected";
                    break;
                }
                case 3: {
                    s6 = "not_show_selected";
                    break;
                }
                default: {
                    goto label_220;
                }
            }
            ⁱˉ1.MTH7375(s6);
        }
        catch(Throwable throwable2) {
            CLS27.MTH893(throwable2);
        }
    label_220:
        if(!z1) {
            יﹳ0.MTH7305(new CLS310(((Activity)object5), ˑٴ0, jSONObject0, arrayList4, arrayList5));
            יﹳ0.MTH7301(new CLS200(jSONObject0, ˑٴ0, ((Activity)object5), 9));
            CLS523.MTH7147(linearLayout1, ((CLS18)יﹳ0), true);
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1624 יﹳ0 = new CLS1624(((Activity)this.FLD2179));
        יﹳ0.MTH7303(((CLS347)this.FLD2176));
        יﹳ0.FLD5274 = new CLS1481(3, ((CLS347)this.FLD2176));
        יﹳ0.MTH7302();
        יﹳ0.MTH7301(new CLS486(((CLS347)this.FLD2176), this.FLD2177, this.FLD2178, ((Activity)this.FLD2179), ((CLS43)this.FLD2181), ((CLS12)this.FLD2180)));
        יﹳ0.MTH7305(new CLS310(((Activity)this.FLD2179), ((CLS43)this.FLD2181), ((ArrayList)this.FLD2173), ((ArrayList)this.FLD2174), ((CLS347)this.FLD2176)));
        CLS1623 יᐧ0 = new CLS1623(((Activity)this.FLD2179));
        יᐧ0.MTH7296(יﹳ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(3));
    }
}

