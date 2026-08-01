// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.LinearLayout;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS67;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS86;
import b.ˊﾞ.CLS101;
import b.ˊﾞ.CLS613;
import b.ˑٴ.CLS117;
import b.ˑٴ.CLS755;
import b.ـˏ.CLS169;
import b.ـˏ.CLS894;
import b.ٴـ.CLS896.CLS170;
import b.ᵔʾ.CLS314;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1400;
import b.ⁱᵔ.CLS1426;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS412.CLS411;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS442;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS488;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS507;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629.CLS548;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS530;
import b.ﾞˎ.CLS534.CLS533;
import b.ﾞᐧ.CLS557;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class CLS1156 implements CLS7, CLS16, CLS17, CLS39, CLS378, CLS379, CLS411, CLS533, CLS539, CLS548 {
    public final int FLD2643;
    public final Object FLD2644;
    public final Object FLD2645;

    public CLS1156(Object object0, Object object1, int v) {
        this.FLD2643 = v;
        this.FLD2644 = object0;
        this.FLD2645 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object object0 = this.FLD2645;
        Object object1 = this.FLD2644;
        switch(this.FLD2643) {
            case 16: {
                ((CLS442)object1).getClass();
                if(!CLS31.MTH987(((File)object0))) {
                    File file0 = new File(((CLS442)object1).MTH6227().getCacheDir(), CLS31.MTH979(((File)object0).getName(), "zip"));
                    CLS613.MTH1976(((File)object0), file0);
                    CLS31.MTH996(file0.getAbsolutePath());
                    CLS466.MTH6506(file0);
                }
                return;
            }
            case 17: {
                ((CLS507)object1).getClass();
                if(!CLS31.MTH987(((File)object0))) {
                    File file1 = new File(((CLS507)object1).MTH6977().getCacheDir(), CLS31.MTH979(((File)object0).getName(), "zip"));
                    CLS613.MTH1976(((File)object0), file1);
                    CLS31.MTH996(file1.getAbsolutePath());
                    CLS466.MTH6506(file1);
                }
                return;
            }
            case 18: {
                ((CLS500)object1).getClass();
                String[] arr_s = ((String)object0).split(",");
                for(int v = 0; v < arr_s.length; ++v) {
                    ((CLS500)object1).FLD4923.MTH1746(arr_s[v], Boolean.TRUE);
                }
                return;
            }
            case 25: {
                for(Object object2: CLS101.MTH1944(((CLS557)object1), CLS27.MTH895().MTH927(60, "merge_voices_split"))) {
                    Object[] arr_object = {new CLS170(((CLS169)(((CLS894)object2))), ((String)object0))};
                    CLS21.FLD76.MTH818("sendMessageForwardItem", arr_object);
                }
                return;
            }
            default: {
                ((CLS79)object1).MTH1633();
                ((CLS369)object0).notifyDataSetChanged();
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        ((CLS1112)this.FLD2644).getClass();
        ʻˑ0.MTH7187("apply", ((CLS3)new CLS950(((CLS1112)this.FLD2644), ((JSONObject)this.FLD2645), 1)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        ArrayList arrayList0 = (ArrayList)this.FLD2644;
        CLS1622 ˑٴ0 = (CLS1622)this.FLD2645;
        try {
            String[] arr_s = ((String)arrayList0.get(2)).split("_");
            arr_s[2] = s;
            arrayList0.set(2, TextUtils.join("_", arr_s));
            ˑٴ0.MTH798((arr_s.length <= 3 || !"t".equals(arr_s[3]) ? "" : String.format(CLS27.MTH889("timestring_repeat_interval"), arr_s[0], arr_s[1], arr_s[2])));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        CLS1635 ﾞᵎ0 = (CLS1635)this.FLD2644;
        CLS1635 ﾞᵎ1 = (CLS1635)this.FLD2645;
        if("friendreq_permission_moments".equals(s)) {
            CLS27.MTH895().MTH922(0, "friendreq_permission_type");
            ﾞᵎ0.MTH801(0);
            ﾞᵎ1.MTH801(0);
            return;
        }
        CLS27.MTH895().MTH922(1, "friendreq_permission_type");
        ﾞᵎ0.MTH801(8);
        ﾞᵎ1.MTH801(8);
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        Object object0 = this.FLD2645;
        Object object1 = this.FLD2644;
        switch(this.FLD2643) {
            case 6: {
                ((CLS1019)object1).getClass();
                if(!((ArrayList)object0).isEmpty()) {
                    Object object2 = ((ArrayList)object0).get(v);
                    ((CLS1019)object1).FLD2151.MTH922(object2, "chatroom_auto_accept_block_tmp");
                }
                return;
            }
            case 19: {
                String s1 = (String)((ArrayList)object1).get(v);
                if(!TextUtils.isEmpty(s1)) {
                    ((WebView)object0).loadData(s1, "text/html", "UTF-8");
                }
                return;
            }
            default: {
                ((CLS1622)object0).MTH801((((String)((CLS69)object1).MTH1565(s)).equals("custom") ? 0 : 8));
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        File file0;
        Object object0 = this.FLD2645;
        Object object1 = this.FLD2644;
        switch(this.FLD2643) {
            case 8: {
                ((CLS899)object1).getClass();
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                CLS1622 ˑٴ0 = new CLS1622(((Activity)object0));
                ˑٴ0.MTH800(CLS27.MTH889("keyword"));
                ˑٴ0.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                ˑٴ0.MTH7277(((CLS899)object1).FLD2151.MTH925("keyword_remark", ""));
                ˑٴ0.FLD5252 = new CLS1088(((CLS899)object1), 28);
                CLS1625 ـˏ0 = new CLS1625(((Activity)object0));
                ـˏ0.MTH800(CLS27.MTH889("add_keyword"));
                ـˏ0.MTH7320(new CLS67(((CLS899)object1), ((Activity)object0), ˑٴ0, 15));
                CLS1622 ˑٴ1 = new CLS1622(((Activity)object0));
                ˑٴ1.MTH800(CLS27.MTH889("remark"));
                ˑٴ1.FLD5252 = new CLS1088(((CLS899)object1), 29);
                CLS1623 יᐧ0 = new CLS1623(((Activity)object0));
                CLS182.MTH3498(יᐧ0, new Object[]{ˑٴ0, ـˏ0, ˑٴ1}, 10, linearLayout1, יᐧ0);
                return;
            }
            case 15: {
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                CLS523.MTH7147(linearLayout2, ((CLS18)(((CLS1635)object1))), true);
                CLS523.MTH7147(linearLayout2, ((CLS18)(((CLS1622)object0))), true);
                return;
            }
            case 22: {
                String s = (String)arr_object[1];
                Object object2 = arr_object[0];
                if(object2 instanceof File) {
                    file0 = (File)object2;
                    CLS27.MTH895().MTH922(file0.getParent(), "mp3_last_dir");
                }
                else if(object2 instanceof InputStream) {
                    File file1 = new File(((Activity)object1).getCacheDir(), CLS31.MTH979(Long.toHexString(System.currentTimeMillis()), s));
                    CLS31.MTH1037(((InputStream)object2), file1);
                    CLS31.MTH996(file1.getAbsolutePath());
                    file0 = file1;
                }
                else {
                    file0 = null;
                }
                if(file0 != null) {
                    if(!s.endsWith("amr") && !s.endsWith("silk") && !s.endsWith("slk")) {
                        Uri uri0 = Uri.fromFile(file0);
                        String s1 = file0.getName();
                        int v = s1.lastIndexOf(".");
                        if(v != -1) {
                            s1 = s1.substring(0, v);
                        }
                        CLS476.MTH6642(((Activity)object1), uri0, s1, new CLS117(file0.getAbsolutePath(), ((CLS7)object0), 2));
                        return;
                    }
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(new CLS894(1, file0.getAbsolutePath()));
                    ((CLS7)object0).MTH784(arrayList0);
                }
                return;
            }
            case 23: {
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout3 = (LinearLayout)arr_object[1];
                ArrayList arrayList1 = new ArrayList(((HashSet)object1));
                CLS1624 יﹳ0 = new CLS1624(((Activity)object0));
                CLS369 ﾞᵎ0 = new CLS369(((Activity)object0), arrayList1);
                CLS525 ʻˑ0 = new CLS525(((Activity)object0), linearLayout3, menu0);
                ʻˑ0.MTH7187("add", ((CLS3)new CLS1400(((Activity)object0), ((HashSet)object1), arrayList1, ﾞᵎ0)));
                ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1400(((Activity)object0), arrayList1, ((HashSet)object1), ﾞᵎ0)));
                ʻˑ0.MTH7188();
                יﹳ0.FLD5274 = new CLS1043(ﾞᵎ0, 7);
                יﹳ0.MTH7302();
                יﹳ0.MTH7303(ﾞᵎ0);
                יﹳ0.MTH7305(new CLS250(((Activity)object0), ﾞᵎ0, arrayList1, ((HashSet)object1), 3));
                CLS523.MTH7147(linearLayout3, ((CLS18)יﹳ0), true);
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                ((CLS1624)object1).MTH7303(((CLS338)object0));
                ((CLS1624)object1).MTH7301(new CLS488(((CLS338)object0), 1));
                CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1624)object1))), true);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS412$CLS411
    public final void MTH5992(int v) {
        CLS81 יᐧ0 = (CLS81)this.FLD2645;
        if(v < ((ArrayList)this.FLD2644).size()) {
            CLS21.FLD76.MTH818("sendSoundFile", new Object[]{יᐧ0, ""});
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        Object object0 = this.FLD2645;
        Object object1 = this.FLD2644;
        switch(this.FLD2643) {
            case 4: {
                ((CLS928)object1).getClass();
                String s1 = ((CLS1622)object0).MTH7285();
                ArrayList arrayList1 = new ArrayList();
                HashSet hashSet0 = new HashSet();
                String[] arr_s = s1.split(Pattern.quote("|"));
                for(int v = 0; v < arr_s.length; ++v) {
                    String s2 = arr_s[v];
                    if(!TextUtils.isEmpty(s2) && !hashSet0.contains(s2)) {
                        hashSet0.add(s2);
                        arrayList1.add(s2);
                    }
                }
                if(!hashSet0.contains(s)) {
                    arrayList1.add(s);
                }
                String s3 = TextUtils.join("|", arrayList1);
                ((CLS1622)object0).MTH7277(s3);
                ((CLS928)object1).FLD2151.MTH922(s3, "chat_filter");
                return;
            }
            case 11: {
                ((CLS1062)object1).getClass();
                if(!s.equals(((CLS81)object0).FLD307)) {
                    ((CLS81)object0).FLD307 = s;
                    ((CLS1062)object1).FLD2276.MTH1194(((CLS81)object0));
                    ((CLS1062)object1).MTH4021();
                }
                return;
            }
            case 14: {
                CLS314.FLD3231.MTH5004("", ((String)object0), s);
                CLS314.FLD3231.MTH5002();
                return;
            }
            case 21: {
                ((ArrayList)object1).add(s);
                ((CLS341[])object0)[0].MTH5151(((ArrayList)object1));
                return;
            }
            default: {
                ArrayList arrayList0 = new ArrayList(((HashSet)object0));
                CLS314.FLD3231.MTH5003("", s, arrayList0);
                CLS314.FLD3231.MTH5002();
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        Object object1 = this.FLD2645;
        Object object2 = this.FLD2644;
        switch(this.FLD2643) {
            case 0: {
                ((CLS244)object2).getClass();
                String s = CLS182.MTH3474(4100663418635998005L, ((ContentValues)object0)) == 1 ? ((ContentValues)object0).getAsString("content") : "#fav " + ((ContentValues)object0).getAsString("localId");
                if(((ContentValues)object0).containsKey("img")) {
                    ((CLS244)object2).FLD2547.setImageBitmap(CLS518.MTH7061(((ContentValues)object0).getAsString("img")));
                }
                ((CLS244)object2).FLD2540.MTH7277(s);
                ((CLS1625)object1).MTH801(0);
                return;
            }
            case 1: {
                ((CLS210)object2).getClass();
                String s1 = CLS182.MTH3474(0x38E8594F2B3CD335L, ((ContentValues)object0)) == 1 ? ((ContentValues)object0).getAsString("content") : "#fav " + ((ContentValues)object0).getAsString("localId");
                if(((ContentValues)object0).containsKey("img")) {
                    ((CLS210)object2).FLD2019.setImageBitmap(CLS518.MTH7061(((ContentValues)object0).getAsString("img")));
                }
                ((CLS210)object2).FLD2007.MTH7277(s1);
                ((CLS1625)object1).MTH801(0);
                return;
            }
            case 7: {
                ((CLS899)object2).getClass();
                ((CLS899)object2).FLD2151.MTH922(((String)object0), "auto_label_existing_label_data");
                ((CLS1626)object1).MTH800(((String)object0));
                return;
            }
            default: {
                ((CLS1062)object2).getClass();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object3: ((CLS1062)object2).FLD2276.MTH1198()) {
                    CLS81 יᐧ0 = (CLS81)object3;
                    if(יᐧ0.FLD309.contains(((String)object0))) {
                        StringBuilder stringBuilder0 = CLS182.MTH3483(יᐧ0.FLD307);
                        stringBuilder0.append("<br>");
                        stringBuilder0.append(CLS27.MTH889("tags"));
                        stringBuilder0.append(": ");
                        stringBuilder0.append(TextUtils.join(" ", יᐧ0.FLD309));
                        StringBuilder stringBuilder1 = CLS182.MTH3483(stringBuilder0.toString());
                        stringBuilder1.append("<br>");
                        stringBuilder1.append(CLS27.MTH889("status"));
                        stringBuilder1.append(יᐧ0.MTH1665());
                        linkedHashMap0.put(stringBuilder1.toString(), יᐧ0);
                    }
                }
                if(!linkedHashMap0.isEmpty()) {
                    CLS523.MTH7169(((Activity)object1), ((String)object0), ((CLS379)new CLS1049(((CLS1062)object2), linkedHashMap0, ((Activity)object1), 2)));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        Activity activity2;
        CLS1625 ـˏ3;
        Object object0 = this.FLD2645;
        Object object1 = this.FLD2644;
        switch(this.FLD2643) {
            case 2: {
                CLS1112 ᐧˏ0 = (CLS1112)object1;
                Activity activity0 = ((CLS219)ᐧˏ0).MTH3883();
                CLS1635 ﾞᵎ0 = new CLS1635(activity0);
                ᐧˏ0.FLD2476 = ﾞᵎ0;
                ﾞᵎ0.MTH800(CLS27.MTH889("enable"));
                CLS1623 יᐧ0 = new CLS1623(activity0);
                יᐧ0.MTH7296(ᐧˏ0.FLD2476);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
                CLS1626 ـﹳ0 = new CLS1626(activity0);
                ᐧˏ0.FLD2470 = ـﹳ0;
                ـﹳ0.MTH800(CLS27.MTH889("chatroom_lbl"));
                ᐧˏ0.FLD2470.MTH7325(CLS27.MTH889("click_to_select"));
                ᐧˏ0.FLD2470.MTH7324(new CLS192(ᐧˏ0, 0));
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ᐧˏ0.FLD2479 = ـˏ0;
                ـˏ0.MTH800(CLS27.MTH889("members"));
                ᐧˏ0.FLD2479.MTH798(CLS27.MTH889("blacklist_members_desc"));
                ᐧˏ0.FLD2479.MTH7320(new CLS192(ᐧˏ0, 1));
                CLS1625 ـˏ1 = new CLS1625(activity0);
                ᐧˏ0.FLD2460 = ـˏ1;
                ـˏ1.MTH800(CLS27.MTH889("config_exclude"));
                ᐧˏ0.FLD2460.MTH7320(new CLS530(ᐧˏ0, activity0, 6));
                CLS1623 יᐧ1 = new CLS1623(activity0);
                יᐧ1.MTH7289(new Object[]{ᐧˏ0.FLD2470, ᐧˏ0.FLD2479, ᐧˏ0.FLD2460});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), CLS523.MTH7137(10));
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add("");
                for(Object object2: ᐧˏ0.FLD2482) {
                    JSONObject jSONObject0 = (JSONObject)object2;
                    try {
                        arrayList0.add(jSONObject0.getString("n"));
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                CLS1620 ˊˏ0 = new CLS1620(activity0);
                ˊˏ0.MTH7248(((CLS533)new CLS1198(ᐧˏ0, 3)));
                ˊˏ0.MTH7247(arrayList0);
                CLS523.MTH7147(linearLayout0, ((CLS18)ˊˏ0), true);
                CLS1635 ﾞᵎ1 = new CLS1635(activity0);
                ᐧˏ0.FLD2477 = ﾞᵎ1;
                CLS1635 ﾞᵎ2 = CLS34.MTH1086(4100650245971301173L, ﾞᵎ1, activity0);
                ᐧˏ0.FLD2471 = ﾞᵎ2;
                CLS1635 ﾞᵎ3 = CLS34.MTH1086(4100650267446137653L, ﾞᵎ2, activity0);
                ᐧˏ0.FLD2458 = ﾞᵎ3;
                CLS1635 ﾞᵎ4 = CLS34.MTH1086(4100650293215941429L, ﾞᵎ3, activity0);
                ᐧˏ0.FLD2451 = ﾞᵎ4;
                CLS1635 ﾞᵎ5 = CLS34.MTH1086(4100650318985745205L, ﾞᵎ4, activity0);
                ᐧˏ0.FLD2483 = ﾞᵎ5;
                CLS1635 ﾞᵎ6 = CLS34.MTH1086(4100646496464851765L, ﾞᵎ5, activity0);
                ᐧˏ0.FLD2467 = ﾞᵎ6;
                CLS1635 ﾞᵎ7 = CLS34.MTH1086(4100646530824590133L, ﾞᵎ6, activity0);
                ᐧˏ0.FLD2481 = ﾞᵎ7;
                CLS1635 ﾞᵎ8 = CLS34.MTH1086(4100646556594393909L, ﾞᵎ7, activity0);
                ᐧˏ0.FLD2449 = ﾞᵎ8;
                CLS1635 ﾞᵎ9 = CLS34.MTH1086(4100646595249099573L, ﾞᵎ8, activity0);
                ᐧˏ0.FLD2462 = ﾞᵎ9;
                CLS1635 ﾞᵎ10 = CLS34.MTH1086(4100646642493739829L, ﾞᵎ9, activity0);
                ᐧˏ0.FLD2447 = ﾞᵎ10;
                CLS1635 ﾞᵎ11 = CLS34.MTH1086(4100646668263543605L, ﾞᵎ10, activity0);
                ᐧˏ0.FLD2474 = ﾞᵎ11;
                CLS1635 ﾞᵎ12 = CLS34.MTH1086(4100646715508183861L, ﾞᵎ11, activity0);
                ᐧˏ0.FLD2480 = ﾞᵎ12;
                CLS1635 ﾞᵎ13 = CLS34.MTH1086(0x38E86C042B3CD335L, ﾞᵎ12, activity0);
                ᐧˏ0.FLD2452 = ﾞᵎ13;
                CLS1635 ﾞᵎ14 = CLS34.MTH1086(4100646268831585077L, ﾞᵎ13, activity0);
                ᐧˏ0.FLD2450 = ﾞᵎ14;
                CLS1635 ﾞᵎ15 = CLS34.MTH1086(4100646307486290741L, ﾞᵎ14, activity0);
                ᐧˏ0.FLD2455 = ﾞᵎ15;
                CLS1635 ﾞᵎ16 = CLS34.MTH1086(4100646350435963701L, ﾞᵎ15, activity0);
                ᐧˏ0.FLD2469 = ﾞᵎ16;
                CLS1635 ﾞᵎ17 = CLS34.MTH1086(4100646384795702069L, ﾞᵎ16, activity0);
                ᐧˏ0.FLD2456 = ﾞᵎ17;
                CLS1635 ﾞᵎ18 = CLS34.MTH1086(4100646410565505845L, ﾞᵎ17, activity0);
                ᐧˏ0.FLD2468 = ﾞᵎ18;
                CLS1635 ﾞᵎ19 = CLS34.MTH1086(4100646440630276917L, ﾞᵎ18, activity0);
                ᐧˏ0.FLD2473 = ﾞᵎ19;
                CLS1635 ﾞᵎ20 = CLS34.MTH1086(4100647037630731061L, ﾞᵎ19, activity0);
                ᐧˏ0.FLD2461 = ﾞᵎ20;
                ﾞᵎ20.MTH800(CLS27.MTH889("anymsg"));
                CLS1623 יᐧ2 = new CLS1623(activity0);
                יᐧ2.MTH800(CLS27.MTH889("types"));
                CLS182.MTH3498(יᐧ2, new Object[]{ᐧˏ0.FLD2477, ᐧˏ0.FLD2471, ᐧˏ0.FLD2458, ᐧˏ0.FLD2451, ᐧˏ0.FLD2483, ᐧˏ0.FLD2467, ᐧˏ0.FLD2481, ᐧˏ0.FLD2449, ᐧˏ0.FLD2462, ᐧˏ0.FLD2447, ᐧˏ0.FLD2474, ᐧˏ0.FLD2480, ᐧˏ0.FLD2452, ᐧˏ0.FLD2450, ᐧˏ0.FLD2455, ᐧˏ0.FLD2469, ᐧˏ0.FLD2456, ᐧˏ0.FLD2468, ᐧˏ0.FLD2473, ᐧˏ0.FLD2461}, 10, linearLayout0, יᐧ2);
                if(((CLS86)object0) != null) {
                    CLS1626 ـﹳ1 = ᐧˏ0.FLD2470;
                    String[] arr_s = CLS502.MTH6941(((CLS86)object0).FLD346);
                    ArrayList arrayList1 = new ArrayList();
                    for(int v = 0; v < arr_s.length; ++v) {
                        arrayList1.add(ᐧˏ0.FLD2472.MTH5316(arr_s[v]));
                    }
                    ـﹳ1.MTH798(TextUtils.join(",", arrayList1));
                    ᐧˏ0.FLD2463 = ((CLS86)object0).FLD346;
                    ᐧˏ0.FLD2464 = ((CLS86)object0).FLD345;
                    ᐧˏ0.FLD2476.MTH7437(((CLS86)object0).FLD344 == 1);
                    ᐧˏ0.FLD2475 = ((CLS86)object0).MTH1699();
                    if(CLS426.MTH6126(ᐧˏ0.FLD2463)) {
                        ᐧˏ0.FLD2479.MTH801(0);
                        ᐧˏ0.FLD2460.MTH801(0);
                        ᐧˏ0.FLD2480.MTH801(8);
                    }
                    else {
                        ᐧˏ0.FLD2479.MTH801(8);
                        ᐧˏ0.FLD2460.MTH801(8);
                        ᐧˏ0.FLD2480.MTH801(0);
                    }
                    ᐧˏ0.MTH4204(((CLS86)object0).FLD349);
                    return;
                }
                if(!TextUtils.isEmpty(ᐧˏ0.FLD2463)) {
                    if(CLS426.MTH6126(ᐧˏ0.FLD2463)) {
                        ᐧˏ0.FLD2479.MTH801(0);
                        ᐧˏ0.FLD2460.MTH801(0);
                        ᐧˏ0.FLD2480.MTH801(8);
                    }
                    else {
                        ᐧˏ0.FLD2479.MTH801(8);
                        ᐧˏ0.FLD2460.MTH801(8);
                        ᐧˏ0.FLD2480.MTH801(0);
                    }
                }
                ᐧˏ0.FLD2475 = "";
                return;
            }
            case 5: {
                CLS1019 ˎʻ0 = (CLS1019)object1;
                ˎʻ0.getClass();
                int v1 = CLS523.MTH7137(10);
                boolean z = CLS66.MTH1433("", ˎʻ0.FLD2157);
                Activity activity1 = ((CLS219)ˎʻ0).MTH3883();
                if(z) {
                    CLS1617 ʻᵎ0 = new CLS1617(activity1);
                    ʻᵎ0.MTH800(CLS27.MTH889("autoban"));
                    ʻᵎ0.FLD5159 = new CLS755(ˎʻ0, activity1, "", v1, ((CLS78)object0));
                    CLS523.MTH7147(linearLayout0, ((CLS18)ʻᵎ0), true);
                }
                CLS1623 יᐧ3 = new CLS1623(activity1);
                CLS1635 ﾞᵎ21 = new CLS1635(activity1);
                String s = CLS182.MTH3475(4100787594730459957L, CLS182.MTH3487(4100787521716015925L, ﾞᵎ21, ""));
                CLS29 ˎᵢ0 = ˎʻ0.FLD2151;
                ﾞᵎ21.MTH7437(ˎᵢ0.MTH938(s, false));
                CLS34.MTH1083(ˎʻ0, "", 2, ﾞᵎ21);
                יᐧ3.MTH7296(ﾞᵎ21);
                new StringBuilder().append("");
                boolean z1 = ˎᵢ0.MTH938("_exit_room_notice_enable", ˎᵢ0.MTH938("exit_room_notice_enable", CLS412.MTH6002()));
                CLS1635 ﾞᵎ22 = new CLS1635(activity1);
                ﾞᵎ22.MTH800(CLS27.MTH889("exit_room_notice_enable"));
                ﾞᵎ22.MTH7437(z1);
                ﾞᵎ22.MTH7438(new CLS259(ˎʻ0, "", 3));
                יᐧ3.MTH7296(ﾞᵎ22);
                CLS1635 ﾞᵎ23 = new CLS1635(activity1);
                StringBuilder stringBuilder0 = CLS182.MTH3487(4100788565393068853L, ﾞᵎ23, "");
                stringBuilder0.append("_exit_room_sendmsg_enable");
                ﾞᵎ23.MTH7437(ˎᵢ0.MTH938(stringBuilder0.toString(), false));
                CLS34.MTH1083(ˎʻ0, "", 4, ﾞᵎ23);
                CLS1622 ˑٴ0 = CLS182.MTH3486(יᐧ3, ﾞᵎ23, activity1);
                ˑٴ0.MTH800(CLS27.MTH889("exit_room_sendmsg_txt"));
                CLS500 ᵢﹶ0 = CLS500.FLD4928;
                if(ᵢﹶ0.MTH6895("text_rep_nickname")) {
                    String s1 = CLS27.MTH889("text_rep_desc");
                    if(CLS27.MTH895().MTH938("show_realname_label_enable", false) && ᵢﹶ0.MTH6895("show_realname")) {
                        StringBuilder stringBuilder1 = CLS182.MTH3483(s1);
                        stringBuilder1.append(CLS27.MTH889("text_rep_realname_desc"));
                        s1 = stringBuilder1.toString();
                    }
                    ˑٴ0.MTH798(s1);
                }
                ˑٴ0.MTH7277(ˎᵢ0.MTH925("_exit_room_sendmsg_txt", CLS426.MTH6122()));
                ˑٴ0.FLD5252 = new CLS1096(ˎʻ0, "", 3);
                יᐧ3.MTH7296(ˑٴ0);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ3), v1);
                if(z && CLS27.MTH902("auto_accept_chatroom_verify_application") && CLS66.MTH1455("") && !CLS182.MTH3470(4100785163778970421L)) {
                    CLS1635 ﾞᵎ24 = new CLS1635(activity1);
                    StringBuilder stringBuilder2 = CLS182.MTH3487(4100785219613545269L, ﾞᵎ24, "");
                    stringBuilder2.append("_auto_accept_chatroom_verify_application");
                    ﾞᵎ24.MTH7437(ˎᵢ0.MTH938(stringBuilder2.toString(), false));
                    ﾞᵎ24.MTH7438(new CLS259(ˎʻ0, "", 5));
                    CLS1622 ˑٴ1 = new CLS1622(activity1);
                    ˑٴ1.MTH7277(ˎᵢ0.MTH925("_auto_accept_chatroom_verify_application_keywords", ""));
                    ˑٴ1.MTH800(CLS27.MTH889("keyword"));
                    ˑٴ1.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
                    ˑٴ1.FLD5252 = new CLS1096(ˎʻ0, "", 4);
                    CLS1625 ـˏ2 = new CLS1625(activity1);
                    ـˏ2.MTH800(CLS27.MTH889("add_keyword"));
                    ـˏ2.MTH7320(new CLS263(activity1, ˑٴ1, 0));
                    CLS1623 יᐧ4 = new CLS1623(activity1);
                    יᐧ4.MTH7289(new Object[]{ﾞᵎ24, ˑٴ1, ـˏ2});
                    יᐧ4.MTH7290(linearLayout0, v1);
                }
                CLS1623 יᐧ5 = new CLS1623(activity1);
                CLS1635 ﾞᵎ25 = new CLS1635(activity1);
                StringBuilder stringBuilder3 = CLS182.MTH3487(4100785558915961653L, ﾞᵎ25, "chatroom_intro_");
                stringBuilder3.append("_enable");
                ﾞᵎ25.MTH7437(ˎᵢ0.MTH938(stringBuilder3.toString(), false));
                CLS34.MTH1083(ˎʻ0, "chatroom_intro_", 6, ﾞᵎ25);
                יᐧ5.MTH7296(ﾞᵎ25);
                if(ˎʻ0.FLD2153.MTH6895("multi_response")) {
                    ـˏ3 = new CLS1625(activity1);
                    ـˏ3.MTH800(CLS27.MTH889("chatroom_intro"));
                    activity2 = activity1;
                    ـˏ3.MTH7320(new CLS258(activity1, ˎʻ0, "chatroom_intro_", "", 1));
                }
                else {
                    activity2 = activity1;
                    ـˏ3 = new CLS1622(activity2);
                    ((CLS1622)ـˏ3).MTH7277(ˎᵢ0.MTH925(CLS182.MTH3475(4100785881038508853L, CLS34.MTH1085(4100786366369813301L, ((CLS1622)ـˏ3), "chatroom_intro_")), ""));
                    ((CLS1622)ـˏ3).MTH7278(0x20001);
                    ـˏ3.FLD5252 = new CLS1096(ˎʻ0, "chatroom_intro_", 0);
                }
                יᐧ5.MTH7296(ـˏ3);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v1);
                CLS1623 יᐧ6 = new CLS1623(activity2);
                CLS1635 ﾞᵎ26 = new CLS1635(activity2);
                StringBuilder stringBuilder4 = CLS182.MTH3487(0x38E8EB0F2B3CD335L, ﾞᵎ26, "");
                stringBuilder4.append("_checkin_enable");
                ﾞᵎ26.MTH7437(ˎᵢ0.MTH938(stringBuilder4.toString(), false));
                CLS34.MTH1083(ˎʻ0, "", 0, ﾞᵎ26);
                יᐧ6.MTH7296(ﾞᵎ26);
                CLS1635 ﾞᵎ27 = new CLS1635(activity2);
                StringBuilder stringBuilder5 = CLS182.MTH3487(4100786044247266101L, ﾞᵎ27, "");
                stringBuilder5.append("_auto_checkin_enable");
                ﾞᵎ27.MTH7437(ˎᵢ0.MTH938(stringBuilder5.toString(), false));
                CLS34.MTH1083(ˎʻ0, "", 1, ﾞᵎ27);
                CLS1622 ˑٴ2 = CLS182.MTH3486(יᐧ6, ﾞᵎ27, activity2);
                ˑٴ2.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3475(4100786838816215861L, CLS34.MTH1085(4100786770096739125L, ˑٴ2, "")), CLS27.MTH889("checkin_keyword_default")));
                ˑٴ2.MTH7278(1);
                ˑٴ2.FLD5252 = new CLS1096(ˎʻ0, "", 1);
                CLS1622 ˑٴ3 = CLS34.MTH1069(יᐧ6, ˑٴ2, activity2);
                ˑٴ3.MTH800(CLS27.MTH889("checkin_msg"));
                ˑٴ3.MTH798(CLS27.MTH889("checkin_msg_desc"));
                new StringBuilder().append("");
                ˑٴ3.MTH7277(ˎᵢ0.MTH925("_checkin_msg", CLS27.MTH889("checkin_templ_msg")));
                ˑٴ3.MTH7278(0x20001);
                ˑٴ3.FLD5252 = new CLS1096(ˎʻ0, "", 2);
                יᐧ6.MTH7296(ˑٴ3);
                CLS1625 ـˏ4 = new CLS1625(activity2);
                ـˏ4.MTH800(CLS27.MTH889("manage_checkin"));
                ـˏ4.MTH7320(new CLS230("", activity2, 2));
                יᐧ6.MTH7296(ـˏ4);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ6), v1);
                if(z) {
                    CLS1625 ـˏ5 = new CLS1625(activity2);
                    ـˏ5.MTH800(CLS27.MTH889("delete_all_members"));
                    ـˏ5.MTH7320(new CLS67(ˎʻ0, activity2, "", 11));
                    CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ5), true);
                }
                return;
            }
            case 9: {
                ((CLS1173)object1).getClass();
                int v2 = CLS523.MTH7137(10);
                if(((CLS1173)object1).FLD2153.MTH6895("videocall_ringtone_advanced")) {
                    CLS1623 יᐧ7 = new CLS1623(((Activity)object0));
                    CLS1625 ـˏ6 = new CLS1625(((Activity)object0));
                    ـˏ6.MTH800(CLS27.MTH889("general_settings"));
                    ـˏ6.MTH7320(new CLS175(((CLS1173)object1), 9));
                    יᐧ7.MTH7296(ـˏ6);
                    CLS1625 ـˏ7 = new CLS1625(((Activity)object0));
                    ـˏ7.MTH800(CLS27.MTH889("custom_settings"));
                    ـˏ7.MTH7320(new CLS248(((CLS1173)object1), ((Activity)object0), 2));
                    יᐧ7.MTH7296(ـˏ7);
                    יᐧ7.MTH7290(linearLayout0, v2);
                    return;
                }
                ((CLS1173)object1).FLD2721 = "videocall";
                CLS1623 יᐧ8 = new CLS1623(((Activity)object0));
                CLS1635 ﾞᵎ28 = new CLS1635(((Activity)object0));
                ﾞᵎ28.MTH800(CLS27.MTH889("enable_ringtone"));
                String s2 = CLS34.MTH1074(new StringBuilder(), ((CLS1173)object1).FLD2721, 4101061536334533429L);
                ﾞᵎ28.MTH7437(((CLS1173)object1).FLD2151.MTH938(s2, false));
                ﾞᵎ28.MTH7438(new CLS235(((CLS1173)object1), 4));
                יᐧ8.MTH7296(ﾞᵎ28);
                CLS1626 ـﹳ2 = new CLS1626(((Activity)object0));
                ((CLS1173)object1).FLD2719 = ـﹳ2;
                ـﹳ2.MTH800(CLS27.MTH889("select_ringtone"));
                ((CLS1173)object1).FLD2719.MTH7324(new CLS175(((CLS1173)object1), 10));
                String s3 = CLS34.MTH1074(new StringBuilder(), ((CLS1173)object1).FLD2721, 4101057829777756981L);
                String s4 = ((CLS1173)object1).FLD2151.MTH925(s3, "");
                if(TextUtils.isEmpty(s4)) {
                    ((CLS1173)object1).FLD2719.MTH7325(CLS27.MTH889("default_text"));
                }
                else {
                    Ringtone ringtone0 = RingtoneManager.getRingtone(((Activity)object0).getApplicationContext(), Uri.parse(s4));
                    ((CLS1173)object1).FLD2719.MTH7325(ringtone0.getTitle(((Activity)object0)));
                }
                יᐧ8.MTH7296(((CLS1173)object1).FLD2719);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ8), v2);
                return;
            }
            default: {
                ((CLS1624)object1).FLD5274 = new CLS1426(((CLS363)object0), 1);
                ((CLS1624)object1).MTH7302();
                ((CLS1624)object1).MTH7303(((CLS363)object0));
                ((CLS1624)object1).FLD5276 = false;
                ((CLS1624)object1).MTH7301(new CLS249(7, ((CLS363)object0)));
                CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1624)object1))), true);
            }
        }
    }
}

