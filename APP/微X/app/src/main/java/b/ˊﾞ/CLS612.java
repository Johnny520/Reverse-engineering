// Decompiled by JEB v5.42.0.202606242140

package b.ˊﾞ;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
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
import b.ʾᵢ.CLS568;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS67;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS77;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS81;
import b.ˑٴ.CLS110;
import b.ˑٴ.CLS139;
import b.ˑٴ.CLS140;
import b.ˑٴ.CLS629;
import b.ˑٴ.CLS651;
import b.ˑٴ.CLS653;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS730;
import b.ˑٴ.CLS737;
import b.ˑٴ.CLS749;
import b.ˑٴ.CLS848;
import b.ˑٴ.CLS881;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ـˏ.CLS169;
import b.ـˏ.CLS885;
import b.ـˏ.CLS886;
import b.ـˏ.CLS888;
import b.ـˏ.CLS889;
import b.ـˏ.CLS891;
import b.ـˏ.CLS894;
import b.ٴـ.CLS896.CLS170;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS1062;
import b.ᐧˉ.CLS1078;
import b.ᐧˉ.CLS1089;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS1112;
import b.ᐧˉ.CLS1177;
import b.ᐧˉ.CLS181;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS195;
import b.ᐧˉ.CLS198;
import b.ᐧˉ.CLS200;
import b.ᐧˉ.CLS204;
import b.ᐧˉ.CLS205;
import b.ᐧˉ.CLS214;
import b.ᐧˉ.CLS215;
import b.ᐧˉ.CLS219;
import b.ᐧˉ.CLS224;
import b.ᐧˉ.CLS226;
import b.ᐧˉ.CLS252;
import b.ᐧˉ.CLS265;
import b.ᐧˉ.CLS271;
import b.ᐧˉ.CLS913;
import b.ᐧˉ.CLS999;
import b.ᐧⁱ.CLS1218;
import b.ᐧⁱ.CLS1220;
import b.ᵔʾ.CLS1235;
import b.ᵔʾ.CLS281;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS326;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1325;
import b.ⁱᵔ.CLS1481;
import b.ⁱᵔ.CLS1485;
import b.ⁱᵔ.CLS1492;
import b.ⁱᵔ.CLS1505;
import b.ⁱᵔ.CLS1581;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS377;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423.CLS422;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS495;
import b.ⁱᵔ.CLS496;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS504;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS521;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1616;
import b.ﾞˎ.CLS1617;
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
import b.ﾞˎ.CLS536;
import b.ﾞٴ.CLS1636;
import b.ﾞᐧ.CLS561;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS612 implements CLS7, CLS10, CLS16, CLS17, CLS39, CLS378, CLS379, CLS420, CLS440, CLS441, CLS533 {
    public final int FLD504;
    public final Object FLD505;
    public final Object FLD506;
    public final Object FLD507;
    public final Object FLD508;

    public CLS612(Object object0, Object object1, Object object2, Object object3, int v) {
        this.FLD504 = v;
        this.FLD507 = object0;
        this.FLD506 = object1;
        this.FLD508 = object2;
        this.FLD505 = object3;
        super();
    }

    public CLS612(Object object0, Object object1, Object object2, Object object3, int v, int v1) {
        this.FLD504 = v;
        this.FLD507 = object0;
        this.FLD506 = object1;
        this.FLD505 = object2;
        this.FLD508 = object3;
        super();
    }

    public CLS612(Object object0, String s, Object object1, Object object2, int v) {
        this.FLD504 = v;
        this.FLD507 = object0;
        this.FLD508 = s;
        this.FLD506 = object1;
        this.FLD505 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object object11;
        Object object10;
        String s12;
        int v2;
        Object object0 = this.FLD505;
        Object object1 = this.FLD508;
        Object object2 = this.FLD506;
        Object object3 = this.FLD507;
        int v = 0;
        switch(this.FLD504) {
            case 0: {
                CLS1636 ˆٴ0 = (CLS1636)object3;
                InputStream inputStream0 = (InputStream)object2;
                String s1 = (String)object1;
                CLS3 ˆٴ1 = (CLS3)object0;
                ˆٴ0.getClass();
                try {
                    ˆٴ0.MTH7447(new CLS561(inputStream0), s1, ˆٴ1);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 5: {
                CLS79 ˎᵢ0 = (CLS79)object3;
                CLS29 ˎᵢ1 = (CLS29)object2;
                String s2 = (String)object1;
                Activity activity1 = (Activity)object0;
                ˎᵢ0.getClass();
                try {
                    ArrayList arrayList1 = new ArrayList();
                    HashSet hashSet0 = new HashSet();
                    HashSet hashSet1 = new HashSet();
                    String s3 = ˎᵢ1.MTH925(s2 + "stickytops", "");
                    if(!TextUtils.isEmpty(s3)) {
                        hashSet0.addAll(Arrays.asList(CLS502.MTH6941(s3)));
                    }
                    String s4 = ˎᵢ1.MTH925(s2 + "stickybottoms", "");
                    if(!TextUtils.isEmpty(s4)) {
                        hashSet1.addAll(Arrays.asList(CLS502.MTH6941(s4)));
                    }
                    String s5 = s2.substring(3);
                    String s6 = ˎᵢ0.MTH1625(s2);
                    switch(s5) {
                        case "_GH_": {
                            v2 = 4;
                            break;
                        }
                        case "_MAIN_": {
                            v2 = 0;
                            break;
                        }
                        case "_MUTE_": {
                            v2 = 2;
                            break;
                        }
                        case "_OWN_": {
                            v2 = 1;
                            break;
                        }
                        case "_WORK_": {
                            v2 = 3;
                            break;
                        }
                        default: {
                            v2 = -1;
                        }
                    }
                    CLS371 ʻ0 = ˎᵢ0.FLD280;
                    switch(v2) {
                        case 0: {
                            HashSet hashSet2 = new HashSet(Arrays.asList(CLS502.MTH6941(ˎᵢ0.MTH1624())));
                            if(ˎᵢ0.MTH1643().MTH938("chatroom_container_work_enable", false) && !hashSet2.contains("wx__WORK_")) {
                                arrayList1.add(new CLS78("wx__WORK_", CLS27.MTH889("wework_chatrooms")));
                                hashSet0.add("wx__WORK_");
                            }
                            if(ˎᵢ0.MTH1643().MTH938("chatroom_container_mute_enable", false) && !hashSet2.contains("wx__MUTE_")) {
                                arrayList1.add(new CLS78("wx__MUTE_", CLS27.MTH889("mute_chatrooms")));
                                hashSet0.add("wx__MUTE_");
                            }
                            if(ˎᵢ0.MTH1643().MTH938("chatroom_container_own_enable", false) && !hashSet2.contains("wx__OWN_")) {
                                arrayList1.add(new CLS78("wx__OWN_", CLS27.MTH889("own_chatrooms")));
                                hashSet0.add("wx__OWN_");
                            }
                            if(ˎᵢ0.MTH1643().MTH938("chatroom_container_public_enable", false) && !hashSet2.contains("wx__GH_")) {
                                arrayList1.add(new CLS78("wx__GH_", CLS27.MTH889("public_accounts")));
                                hashSet0.add("wx__GH_");
                            }
                            if(ˎᵢ0.MTH1648().MTH6895("chatroom_container_tags") && ˎᵢ0.MTH1643().MTH938("chatroom_container_tag_enable", false)) {
                                HashSet hashSet3 = new HashSet(ˎᵢ0.MTH1644().MTH1165());
                                HashSet hashSet4 = new HashSet(Arrays.asList(ˎᵢ0.MTH1643().MTH925("chatroom_container_tags", "").split(",")));
                                ArrayList arrayList2 = new ArrayList();
                                for(Object object6: hashSet4) {
                                    String s13 = (String)object6;
                                    if(hashSet3.contains(s13) && !hashSet2.contains("wx_" + s13)) {
                                        arrayList2.add(s13);
                                    }
                                }
                                String s14 = "[" + CLS27.MTH889("chatroom_tags") + "] ";
                                for(Object object7: arrayList2) {
                                    String s15 = (String)object7;
                                    String s16 = ˎᵢ0.MTH1625("wx_" + s15);
                                    if(s16.equals("wx_" + s15)) {
                                        s16 = s14 + s15;
                                    }
                                    arrayList1.add(new CLS78("wx_" + s15, s16));
                                    hashSet0.add("wx_" + s15);
                                }
                            }
                            if(ˎᵢ0.MTH1643().MTH938("chatroom_container_all_enable", true)) {
                                ʻ0.MTH5294(CLS27.MTH904(), arrayList1);
                            }
                            else {
                                String s17 = ˎᵢ0.MTH1643().MTH925("chatroom_container_list", "");
                                if(!TextUtils.isEmpty(s17)) {
                                    String[] arr_s2 = CLS502.MTH6941(s17);
                                    for(int v5 = 0; v5 < arr_s2.length; ++v5) {
                                        String s18 = arr_s2[v5];
                                        arrayList1.add(new CLS78(s18, ʻ0.MTH5311(s18)));
                                    }
                                }
                            }
                            s12 = s6;
                            break;
                        }
                        case 1: {
                            ʻ0.MTH5292(CLS27.MTH904(), arrayList1);
                            s12 = s6;
                            break;
                        }
                        case 2: {
                            ʻ0.MTH5339(CLS27.MTH904(), arrayList1);
                            s12 = s6;
                            break;
                        }
                        case 3: {
                            ʻ0.MTH5357(CLS27.MTH904(), arrayList1);
                            s12 = s6;
                            break;
                        }
                        case 4: {
                            String s11 = CLS27.MTH889("public_accounts");
                            for(Object object5: ˎᵢ0.MTH1636()) {
                                arrayList1.add(new CLS78(((String)object5), ʻ0.MTH5311(((String)object5))));
                            }
                            s12 = s11;
                            break;
                        }
                        default: {
                            if(s5.startsWith("_c_")) {
                                String s7 = ˎᵢ1.MTH925(s2, "");
                                if(!TextUtils.isEmpty(s7)) {
                                    String[] arr_s = CLS502.MTH6941(s7);
                                    for(int v3 = 0; v3 < arr_s.length; ++v3) {
                                        String s8 = arr_s[v3];
                                        arrayList1.add(new CLS78(s8, ʻ0.MTH5316(s8)));
                                    }
                                }
                            }
                            else {
                                String s9 = ˎᵢ0.MTH1644().MTH1162(s5);
                                if(!TextUtils.isEmpty(s9)) {
                                    String[] arr_s1 = CLS502.MTH6941(s9);
                                    for(int v4 = 0; v4 < arr_s1.length; ++v4) {
                                        String s10 = arr_s1[v4];
                                        arrayList1.add(new CLS78(s10, ʻ0.MTH5316(s10)));
                                    }
                                }
                            }
                            s12 = s6;
                            break;
                        }
                    }
                    if(!arrayList1.isEmpty()) {
                        Iterator iterator4 = arrayList1.iterator();
                        while(iterator4.hasNext()) {
                            Object object8 = iterator4.next();
                            if(((CLS78)object8) == null || CLS21.FLD76.MTH830("isHidden", new Object[]{""})) {
                                iterator4.remove();
                            }
                        }
                    }
                    CLS580 ʻᵎ0 = new CLS580(s12, activity1, arrayList1, s2, hashSet0, hashSet1);
                    CLS40.FLD157.MTH1116(((CLS39)ʻᵎ0));
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 6: {
                CLS629 ʻˋ0 = (CLS629)object3;
                CLS167 ᵔʾ0 = (CLS167)object2;
                Class class0 = (Class)object1;
                Class class1 = (Class)object0;
                ʻˋ0.getClass();
                try {
                    byte[] arr_b = null;
                    Object object9 = CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("LiveFeedField1"));
                    if(object9 != null) {
                        if(TextUtils.isEmpty(CLS27.MTH897("getLiveDataMethod"))) {
                            Class class2 = CLS27.MTH894("businessClass1");
                            if(class2 != null) {
                                object10 = CLS166.MTH3195(object9, CLS27.MTH897("businessMethod"), new Object[]{class2});
                                if(object10 != null) {
                                    if(!TextUtils.isEmpty(CLS27.MTH897("getFinderObjectMethod1"))) {
                                        object11 = CLS166.MTH3195(object10, CLS27.MTH897("getFinderObjectMethod1"), new Object[0]);
                                    }
                                    else if(!TextUtils.isEmpty(CLS27.MTH897("businessField1"))) {
                                        object11 = CLS166.MTH3194(object10, CLS27.MTH897("businessField1"));
                                    }
                                    else {
                                        object11 = null;
                                    }
                                label_192:
                                    if(object11 != null) {
                                        Object object12 = CLS166.MTH3192(class0, CLS27.MTH897("FinderItemCreatorMethod1"), new Object[]{object11, 0x4000});
                                        if(object12 != null) {
                                            Object object13 = CLS166.MTH3195(object12, CLS27.MTH897("getFinderLiveMethod"), new Object[0]);
                                            if(object13 != null) {
                                                String s19 = (String)CLS166.MTH3194(object13, CLS27.MTH897("FinderItemCoverUrlField"));
                                                String s20 = (String)CLS166.MTH3192(class1, CLS27.MTH897("FinderShareParserMethod"), new Object[]{object13});
                                                if(!TextUtils.isEmpty(s20)) {
                                                    String s21 = String.format(CLS27.MTH882("finder_live_appmsg"), s20);
                                                    if(!TextUtils.isEmpty(s19)) {
                                                        try {
                                                            if(!TextUtils.isEmpty(s19)) {
                                                                arr_b = CLS518.MTH7073(new URL(s19));
                                                            }
                                                        }
                                                        catch(Throwable throwable4) {
                                                            CLS27.MTH893(throwable4);
                                                        }
                                                    }
                                                    CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS749(ʻˋ0, s21, arr_b)), -1);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            object10 = CLS166.MTH3195(object9, CLS27.MTH897("getLiveDataMethod"), new Object[0]);
                            if(object10 != null) {
                                object11 = CLS166.MTH3194(object10, CLS27.MTH897("finderObjectField1"));
                                goto label_192;
                            }
                        }
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 14: {
                HashMap hashMap0 = (HashMap)object1;
                ((CLS1062)object3).getClass();
                File file2 = new File(((File)object2), "sounds_db");
                if(CLS31.MTH1001(file2)) {
                    String s22 = CLS31.MTH977(file2);
                    if(!TextUtils.isEmpty(s22)) {
                        try {
                            JSONArray jSONArray0 = new JSONArray(s22);
                            while(true) {
                                if(v >= jSONArray0.length()) {
                                    goto label_241;
                                }
                                CLS81 יᐧ0 = new CLS81(jSONArray0.getJSONObject(v));
                                hashMap0.put(יᐧ0.FLD308, יᐧ0);
                                ++v;
                            }
                        }
                        catch(Throwable throwable5) {
                            CLS27.MTH893(throwable5);
                            goto label_241;
                        }
                    }
                }
                else {
                    File[] arr_file = ((File)object2).listFiles(new CLS214(0));
                    if(arr_file != null && arr_file.length != 0) {
                        while(v < arr_file.length) {
                            File file3 = arr_file[v];
                            if(file3.canRead()) {
                                String s23 = CLS31.MTH977(file3);
                                if(!TextUtils.isEmpty(s23)) {
                                    try {
                                        CLS81 יᐧ1 = new CLS81(new JSONObject(s23));
                                        hashMap0.put(יᐧ1.FLD308, יᐧ1);
                                    }
                                    catch(Throwable throwable6) {
                                        CLS27.MTH893(throwable6);
                                    }
                                }
                            }
                            ++v;
                        }
                    label_241:
                        if(hashMap0.isEmpty()) {
                            CLS412.MTH6013(((Activity)object0), CLS27.MTH889("import_failed"));
                            return;
                        }
                        CLS1062.MTH4023(((Activity)object0), CLS27.MTH889("import_"), hashMap0.values(), ((CLS8)new CLS1177(((Activity)object0), ((CLS1062)object3), ((File)object2), hashMap0)));
                    }
                }
                return;
            }
            default: {
                Activity activity0 = (Activity)object1;
                File file0 = (File)((Object[])object3)[0];
                if(file0 != null) {
                    ((CLS29)object2).MTH922(file0.getAbsolutePath(), "silk_last_dir");
                }
                ArrayList arrayList0 = new ArrayList();
                int v1 = (int)(((Integer)((Object[])object3)[2]));
                if(v1 == 1) {
                    arrayList0 = (ArrayList)((Object[])object3)[1];
                }
                else if(v1 == 2) {
                    for(Object object4: ((ArrayList)((Object[])object3)[1])) {
                        Uri uri0 = (Uri)object4;
                        try {
                            String s = CLS31.MTH985(activity0, uri0);
                            File file1 = new File(activity0.getCacheDir(), CLS31.MTH979(("wx_tmp_" + Long.toHexString(System.currentTimeMillis())), s));
                            CLS31.MTH1037(activity0.getContentResolver().openInputStream(uri0), file1);
                            CLS31.MTH996(file1.getAbsolutePath());
                            arrayList0.add(file1);
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                }
                ((CLS12)object0).MTH791(arrayList0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        ((CLS1019)this.FLD507).getClass();
        ʻˑ0.MTH7187("apply_template", ((CLS3)new CLS848(((CLS1019)this.FLD507), ((Activity)this.FLD506), ((CLS78)this.FLD508), ((CLS380[])this.FLD505), 2)));
    }

    @Override  // b.ⁱᵔ.CLS423$CLS420
    public final void MTH6065(CLS422 ˊⁱ$ᵔʾ0) {
        String s11;
        Bitmap bitmap0;
        Object object0 = this.FLD505;
        Object object1 = this.FLD506;
        Object object2 = this.FLD508;
        Object object3 = this.FLD507;
        if(this.FLD504 == 2) {
            CLS1218 ˆٴ0 = (CLS1218)object3;
            String s = (String)object2;
            String s1 = (String)object1;
            CLS10 ᐧˉ0 = (CLS10)object0;
            ˆٴ0.getClass();
            String s2 = ˊⁱ$ᵔʾ0.FLD4070;
            int v = ˊⁱ$ᵔʾ0.FLD4071;
            if(v != 200) {
                String s3 = CLS27.MTH889("chatgpt_for_bot") + " err: " + v;
                if(!TextUtils.isEmpty(s2)) {
                    s3 = s3 + " " + s2;
                }
                if(!TextUtils.isEmpty(ˊⁱ$ᵔʾ0.MTH6071())) {
                    s3 = s3 + " " + ˊⁱ$ᵔʾ0.MTH6071();
                }
                CLS412.MTH6011(s3);
                return;
            }
            String s4 = ˊⁱ$ᵔʾ0.MTH6071();
            if(TextUtils.isEmpty(s4)) {
                if(!TextUtils.isEmpty(s2)) {
                    CLS412.MTH6011((CLS27.MTH889("chatgpt_for_bot") + " err: " + s2));
                }
                CLS412.MTH5995(s2);
                return;
            }
            try {
                JSONObject jSONObject0 = new JSONObject(s4);
                if(CLS502.MTH6943(jSONObject0.optString("result"), new String[]{"DONE", "SUCCESS"})) {
                    ˆٴ0.MTH4618(ᐧˉ0, s, s1);
                    ArrayList arrayList0 = new ArrayList();
                    if(jSONObject0.has("message")) {
                        JSONArray jSONArray0 = jSONObject0.getJSONArray("message");
                        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                            String s5 = jSONArray0.getString(v1);
                            if(!TextUtils.isEmpty(s5)) {
                                ContentValues contentValues0 = new ContentValues();
                                contentValues0.put("type", "text");
                                contentValues0.put("content", s5);
                                arrayList0.add(contentValues0);
                            }
                        }
                    }
                    if(jSONObject0.has("image")) {
                        JSONArray jSONArray1 = jSONObject0.getJSONArray("image");
                        for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                            try {
                                String s6 = jSONArray1.getString(v2);
                                try {
                                    byte[] arr_b = Base64.decode(s6.split(",")[1].trim(), 0);
                                    bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                                }
                                catch(Throwable throwable2) {
                                    CLS27.MTH893(throwable2);
                                    bitmap0 = null;
                                }
                                if(bitmap0 != null) {
                                    File file0 = new File(CLS31.MTH980());
                                    CLS518.MTH7058(file0, bitmap0);
                                    ContentValues contentValues1 = new ContentValues();
                                    contentValues1.put("type", "image2");
                                    contentValues1.put("path", file0.getAbsolutePath());
                                    arrayList0.add(contentValues1);
                                }
                            }
                            catch(Throwable throwable1) {
                                CLS27.MTH893(throwable1);
                            }
                        }
                    }
                    if(jSONObject0.has("voice")) {
                        JSONArray jSONArray2 = jSONObject0.getJSONArray("voice");
                        for(int v3 = 0; v3 < jSONArray2.length(); ++v3) {
                            byte[] arr_b1 = Base64.decode(jSONArray2.getString(v3).split(",")[1], 0);
                            File file1 = new File(CLS31.MTH980());
                            CLS31.MTH1033(file1, arr_b1);
                            String s7 = file1.getAbsolutePath();
                            ArrayList arrayList1 = CLS101.MTH1944(new CLS100().MTH1941(0L, 0L, s7), 60);
                            for(int v4 = 0; v4 < arrayList1.size(); ++v4) {
                                CLS894 ﾞˎ0 = (CLS894)arrayList1.get(v4);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("type", "voice");
                                File file2 = new File(CLS31.MTH980());
                                if(!TextUtils.isEmpty(ﾞˎ0.FLD1620)) {
                                    CLS31.MTH1025(new File(ﾞˎ0.FLD1620), file2);
                                }
                                byte[] arr_b2 = ﾞˎ0.FLD1621;
                                if(arr_b2 != null) {
                                    CLS31.MTH1033(file2, arr_b2);
                                }
                                InputStream inputStream0 = ﾞˎ0.FLD1622;
                                if(inputStream0 != null) {
                                    CLS31.MTH1037(inputStream0, file2);
                                }
                                contentValues2.put("path", file2.getAbsolutePath());
                                contentValues2.put("duration", ﾞˎ0.FLD1623);
                                arrayList0.add(contentValues2);
                            }
                        }
                    }
                    if(!arrayList0.isEmpty()) {
                        ᐧˉ0.MTH788(arrayList0);
                        return;
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        CLS1220 ٴـ0 = (CLS1220)object3;
        String s8 = (String)object2;
        String s9 = (String)object1;
        CLS10 ᐧˉ1 = (CLS10)object0;
        ٴـ0.getClass();
        String s10 = ˊⁱ$ᵔʾ0.FLD4070;
        int v5 = ˊⁱ$ᵔʾ0.FLD4071;
        if(v5 != 200) {
            s11 = CLS27.MTH889("openai_chatgpt") + " err: " + v5;
            if(!TextUtils.isEmpty(s10)) {
                s11 = s11 + " " + s10;
            }
            if(TextUtils.isEmpty(ˊⁱ$ᵔʾ0.MTH6071())) {
                CLS412.MTH6011(s11);
                return;
            }
            s11 = s11 + " " + ˊⁱ$ᵔʾ0.MTH6071();
            CLS412.MTH6011(s11);
            return;
        }
        String s12 = ˊⁱ$ᵔʾ0.MTH6071();
        if(!TextUtils.isEmpty(s12)) {
            try {
                JSONObject jSONObject1 = new JSONObject(s12);
                if(jSONObject1.has("choices")) {
                    JSONArray jSONArray3 = jSONObject1.getJSONArray("choices");
                    if(jSONArray3.length() != 0) {
                        String s13 = jSONArray3.getJSONObject(0).getJSONObject("message").optString("content").trim();
                        if(!TextUtils.isEmpty(s13)) {
                            ٴـ0.MTH4623(s8, s9, s13);
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("type", "text");
                            contentValues3.put("content", s13);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(contentValues3);
                            ᐧˉ1.MTH788(arrayList2);
                        }
                    }
                }
            }
            catch(Throwable throwable3) {
                CLS27.MTH893(throwable3);
            }
        }
        else if(!TextUtils.isEmpty(s10)) {
            s11 = CLS27.MTH889("openai_chatgpt") + " err: " + s10;
            CLS412.MTH6011(s11);
        }
    }

    @Override  // b.ⁱᵔ.CLS442$CLS440
    public final void MTH6221(File file0) {
        Activity activity0 = (Activity)this.FLD507;
        CLS17 ﾞٴ0 = (CLS17)this.FLD506;
        CLS17 ﾞٴ1 = (CLS17)this.FLD508;
        CLS17 ﾞٴ2 = (CLS17)this.FLD505;
        if(!file0.isDirectory()) {
            String s = CLS31.MTH985(activity0, Uri.fromFile(file0));
            String s1 = file0.getName();
            if(ﾞٴ0 != null) {
                try {
                    ﾞٴ0.MTH796(new Object[]{file0, s, s1});
                    return;
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            if(ﾞٴ1 != null) {
                try {
                    ﾞٴ1.MTH796(new Object[]{CLS66.MTH1491(activity0, file0), s, s1});
                    return;
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
            if(ﾞٴ2 != null) {
                try {
                    ﾞٴ2.MTH796(new Object[]{new FileInputStream(file0), s, s1});
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        HashMap hashMap0 = (HashMap)this.FLD507;
        String s1 = (String)this.FLD508;
        CLS363 ﾞٴ0 = (CLS363)this.FLD506;
        CLS1626 ـﹳ0 = (CLS1626)this.FLD505;
        try {
            if(hashMap0.containsKey(s)) {
                String s2 = (String)hashMap0.get(s);
                String s3 = CLS27.MTH895().MTH925("at_multiple_tag_" + s1 + "_" + s2, "");
                if(!TextUtils.isEmpty(s3)) {
                    ﾞٴ0.MTH5263();
                    ﾞٴ0.MTH5259(Arrays.asList(s3.split(",")));
                    ﾞٴ0.notifyDataSetChanged();
                    ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        File file0;
        Object object0 = this.FLD505;
        Object object1 = this.FLD508;
        Object object2 = this.FLD506;
        Object object3 = this.FLD507;
        switch(this.FLD504) {
            case 7: {
                ((CLS881)object3).getClass();
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                ImageView imageView0 = new ImageView(((Activity)object2));
                CLS1626 ـﹳ0 = new CLS1626(((Activity)object2));
                ((CLS881)object3).FLD1493 = ـﹳ0;
                ـﹳ0.FLD5295 = false;
                ـﹳ0.MTH800(CLS27.MTH889("path"));
                CLS525 ʻˑ0 = new CLS525(((Activity)object2), linearLayout1, menu0);
                if(!TextUtils.isEmpty(((String)object1)) && CLS27.MTH890("MMNewPhotoEditUI")) {
                    ʻˑ0.MTH7187("edit_img", ((CLS3)new CLS730(((CLS881)object3), imageView0, 0)));
                }
                if(!TextUtils.isEmpty(((String)object0))) {
                    ʻˑ0.MTH7187("delete", ((CLS3)new CLS702(((CLS881)object3), ((Activity)object2), imageView0, 1)));
                }
                ʻˑ0.MTH7187("select_img1", ((CLS3)new CLS730(((CLS881)object3), imageView0, 1)));
                if(CLS21.FLD76.MTH830("hasReadStoragePermission", new Object[0])) {
                    ʻˑ0.MTH7187("select_img2", ((CLS3)new CLS730(((CLS881)object3), imageView0, 2)));
                }
                if(CLS27.MTH890("AlbumPreviewUI")) {
                    ʻˑ0.MTH7187("select_img3", ((CLS3)new CLS730(((CLS881)object3), imageView0, 3)));
                }
                ʻˑ0.MTH7188();
                if(!TextUtils.isEmpty(((String)object0))) {
                    ((CLS881)object3).FLD1501 = (String)object0;
                    ((CLS881)object3).FLD1493.MTH798(((String)object0));
                    imageView0.setImageBitmap(CLS518.MTH7060(((String)object0)));
                }
                if(!TextUtils.isEmpty(((String)object1))) {
                    ((CLS881)object3).FLD1510 = (String)object1;
                }
                CLS523.MTH7147(linearLayout1, ((CLS18)((CLS881)object3).FLD1493), false);
                CLS523.MTH7158(linearLayout1, imageView0, false);
                return;
            }
            case 8: {
                ((CLS881)object3).getClass();
                Menu menu1 = (Menu)arr_object[0];
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                ImageView imageView1 = new ImageView(((Activity)object2));
                CLS1626 ـﹳ1 = new CLS1626(((Activity)object2));
                ((CLS881)object3).FLD1493 = ـﹳ1;
                ـﹳ1.FLD5295 = false;
                ـﹳ1.MTH800(CLS27.MTH889("path"));
                ((CLS881)object3).FLD1501 = ((File)object0).getAbsolutePath();
                CLS525 ʻˑ1 = new CLS525(((Activity)object2), linearLayout2, menu1);
                if(CLS27.MTH890("MMNewPhotoEditUI")) {
                    ʻˑ1.MTH7187("edit_img", ((CLS3)new CLS653(((CLS881)object3), ((File)object0), imageView1, 0)));
                }
                ʻˑ1.MTH7187("delete", ((CLS3)new CLS1235(((CLS881)object3), ((Activity)object2), ((File)object0), imageView1, ((String)object1), 3)));
                ʻˑ1.MTH7187("select_img1", ((CLS3)new CLS653(((CLS881)object3), ((File)object0), imageView1, 1)));
                if(CLS21.FLD76.MTH830("hasReadStoragePermission", new Object[0])) {
                    ʻˑ1.MTH7187("select_img2", ((CLS3)new CLS653(((CLS881)object3), imageView1, ((File)object0), 2)));
                }
                if(CLS27.MTH890("AlbumPreviewUI")) {
                    ʻˑ1.MTH7187("select_img3", ((CLS3)new CLS653(((CLS881)object3), ((File)object0), imageView1, 3)));
                }
                ʻˑ1.MTH7188();
                ((CLS881)object3).FLD1493.MTH798(((CLS881)object3).FLD1501);
                if(CLS31.MTH1001(((File)object0))) {
                    imageView1.setImageBitmap(CLS518.MTH7060(((CLS881)object3).FLD1501));
                }
                ((CLS881)object3).FLD1510 = ((File)object0).getAbsolutePath();
                CLS523.MTH7147(linearLayout2, ((CLS18)((CLS881)object3).FLD1493), false);
                CLS523.MTH7158(linearLayout2, imageView1, false);
                return;
            }
            case 12: {
                ((CLS1078)object3).getClass();
                LinearLayout linearLayout3 = (LinearLayout)arr_object[1];
                Calendar calendar0 = Calendar.getInstance();
                calendar0.setTime(new Date(System.currentTimeMillis()));
                CLS1625 ـˏ1 = new CLS1625(((Activity)object2));
                CLS1626 ـﹳ2 = new CLS1626(((Activity)object2));
                ((ArrayList)object1).clear();
                Date date0 = calendar0.getTime();
                ((ArrayList)object1).add(((CLS1078)object3).FLD2316.format(date0));
                CLS69 ʾᵢ0 = new CLS69();
                ʾᵢ0.MTH1560(CLS182.MTH3497(7, ʾᵢ0, CLS182.MTH3497(6, ʾᵢ0, CLS182.MTH3497(5, ʾᵢ0, CLS182.MTH3497(4, ʾᵢ0, CLS182.MTH3497(3, ʾᵢ0, CLS182.MTH3497(2, ʾᵢ0, CLS27.MTH889("week_mon"), 4100608601968399157L), 4100608640623104821L), 4100608679277810485L), 4100608717932516149L), 0x38E849F02B3CD335L), 4100608795241927477L), 1);
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(CLS27.MTH889("week_mon"));
                arrayList0.add(CLS27.MTH889("week_tue"));
                arrayList0.add(CLS27.MTH889("week_wed"));
                arrayList0.add(CLS27.MTH889("week_thu"));
                arrayList0.add(CLS27.MTH889("week_fri"));
                arrayList0.add(CLS27.MTH889("week_sat"));
                arrayList0.add(CLS27.MTH889("week_sun"));
                ـˏ1.MTH800(CLS27.MTH889("select_days"));
                ـˏ1.MTH7320(new CLS281(((CLS1078)object3), ((ArrayList)object0), ʾᵢ0, ((Activity)object2), arrayList0));
                ـﹳ2.MTH800(CLS27.MTH889("select_time"));
                ـﹳ2.MTH7325(((String)((ArrayList)object1).get(0)));
                ـﹳ2.MTH7324(new CLS224(((CLS1078)object3), ((ArrayList)object1), ((Activity)object2), ـﹳ2, 0));
                CLS1623 יᐧ1 = new CLS1623(((Activity)object2));
                יᐧ1.MTH7289(new Object[]{ـˏ1, ـﹳ2});
                יᐧ1.MTH7290(linearLayout3, CLS523.MTH7137(3));
                return;
            }
            case 13: {
                String s = (String)arr_object[2];
                Object object4 = arr_object[0];
                if(object4 instanceof File) {
                    file0 = (File)object4;
                    CLS27.MTH895().MTH922(file0.getParent(), "silk_last_dir");
                }
                else if(object4 instanceof InputStream) {
                    if(TextUtils.isEmpty(s)) {
                        s = Long.toHexString(System.currentTimeMillis());
                    }
                    String s1 = (String)arr_object[1];
                    File file1 = new File(((Activity)object3).getCacheDir(), CLS31.MTH979(s, s1));
                    CLS31.MTH1037(((InputStream)object4), file1);
                    CLS31.MTH996(file1.getAbsolutePath());
                    file0 = file1;
                }
                else {
                    file0 = null;
                }
                if(file0 != null) {
                    if(TextUtils.isEmpty(s)) {
                        s = file0.getName();
                    }
                    CLS1049 ˑᴵ0 = new CLS1049(file0.getAbsolutePath(), ((CLS81)object2), new CLS702(((ArrayList)object1), s, ((CLS369)object0), 11), 3);
                    CLS40.FLD157.MTH1124(((CLS39)ˑᴵ0));
                }
                return;
            }
            case 19: {
                int v = CLS523.MTH7137(10);
                LinearLayout linearLayout4 = (LinearLayout)arr_object[1];
                ArrayList arrayList1 = new ArrayList();
                CLS371 ʻ0 = CLS371.FLD3470;
                for(Object object5: ((ArrayList)object3)) {
                    arrayList1.add(new CLS78(((String)object5), ʻ0.MTH5311(((String)object5))));
                }
                ((CLS1622)object2).MTH800(CLS27.MTH889("min_steps"));
                ((CLS1622)object2).MTH7278(2);
                ((CLS1622)object2).MTH7277(String.valueOf(((CLS29)object1).MTH927(0, "werun_steps")));
                CLS372.MTH5405(arrayList1);
                CLS1625 ـˏ2 = new CLS1625(((Activity)object0));
                ـˏ2.MTH800(CLS27.MTH889("config_exclude"));
                ـˏ2.MTH7320(new CLS67(((Activity)object0), arrayList1, ((CLS29)object1), 22));
                CLS1623 יᐧ2 = new CLS1623(((Activity)object0));
                יᐧ2.MTH7289(new Object[]{((CLS1622)object2), ـˏ2});
                CLS523.MTH7154(linearLayout4, ((CLS18)יᐧ2), v);
                return;
            }
            case 20: {
                LinearLayout linearLayout5 = (LinearLayout)arr_object[1];
                ((CLS1622)object3).MTH7277(((CLS29)object2).MTH925(CLS182.MTH3469(4100837025509069621L, ((CLS1622)object3), 4100837055573840693L), ""));
                ((CLS1621)object1).MTH800(CLS27.MTH889("delay"));
                ((CLS1621)object1).MTH7268(((long)CLS412.MTH6005(10000, "auto_remark_delay")));
                CLS1623 יᐧ3 = new CLS1623(((Activity)object0));
                יᐧ3.MTH7289(new Object[]{((CLS1622)object3), ((CLS1621)object1)});
                CLS523.MTH7154(linearLayout5, ((CLS18)יᐧ3), CLS523.MTH7137(10));
                CLS1624 יﹳ1 = new CLS1624(((Activity)object0));
                יﹳ1.MTH7303(new CLS369(((Activity)object0), ((ArrayList)CLS21.FLD76.MTH836("dialog_remark_listnames", new Object[0]))));
                CLS523.MTH7147(linearLayout5, ((CLS18)יﹳ1), true);
                return;
            }
            case 21: {
                CLS359 ⁱˉ0 = (CLS359)object1;
                Menu menu2 = (Menu)arr_object[0];
                LinearLayout linearLayout6 = (LinearLayout)arr_object[1];
                CLS47 ˈˊ0 = CLS47.FLD167;
                CLS525 ʻˑ2 = new CLS525(((Activity)object3), linearLayout6, menu2);
                ʻˑ2.MTH7187("text", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 6)));
                ʻˑ2.MTH7187("image", ((CLS3)new CLS913(((ArrayList)object2), ⁱˉ0, 7)));
                if(CLS404.MTH5905()) {
                    ʻˑ2.MTH7187("gif", ((CLS3)new CLS913(((ArrayList)object2), ⁱˉ0, 8)));
                }
                ʻˑ2.MTH7187("video", ((CLS3)new CLS913(((ArrayList)object2), ⁱˉ0, 9)));
                ʻˑ2.MTH7187("friendcard", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 13)));
                ʻˑ2.MTH7189("MP3", "MP3", ((CLS3)new CLS1492(((Activity)object3), ˈˊ0, ((ArrayList)object2), ⁱˉ0, 1)));
                ʻˑ2.MTH7187("fav_item", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 14)));
                if(CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(4100860321411683125L)) {
                    ʻˑ2.MTH7187("file", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 15)));
                }
                CLS500 ᵢﹶ0 = CLS500.FLD4928;
                if(ᵢﹶ0.MTH6895("voice_manager")) {
                    ʻˑ2.MTH7187("voice_manager", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 16)));
                }
                if(CLS21.FLD76.MTH830("hasTTS", new Object[0])) {
                    ʻˑ2.MTH7187("tts", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 17)));
                }
                if(CLS27.MTH902("web_response")) {
                    ʻˑ2.MTH7187("web_text", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 7)));
                    ʻˑ2.MTH7187("web_img", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 8)));
                    ʻˑ2.MTH7187("web_vid", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 9)));
                    ʻˑ2.MTH7187("web_gif", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 10)));
                    if(CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(0x38E92F302B3CD335L)) {
                        ʻˑ2.MTH7187("web_file", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 11)));
                    }
                }
                if(ᵢﹶ0.MTH6895("mass_send_save_load")) {
                    ʻˑ2.MTH7187("load", ((CLS3)new CLS1581(((Activity)object3), ((ArrayList)object2), ⁱˉ0, 12)));
                    ʻˑ2.MTH7187("save", ((CLS3)new CLS1325(1, ((Activity)object3), ⁱˉ0)));
                }
                ʻˑ2.MTH7188();
                CLS1635 ﾞᵎ0 = new CLS1635(((Activity)object3));
                ﾞᵎ0.MTH800(CLS27.MTH889("select_all"));
                ﾞᵎ0.MTH7438(new CLS496(ⁱˉ0, 1));
                CLS523.MTH7147(linearLayout6, ((CLS18)ﾞᵎ0), true);
                ((CLS1624)object0).MTH7303(ⁱˉ0);
                ((CLS1624)object0).MTH7311();
                if(((ArrayList)object2) != null && !((ArrayList)object2).isEmpty()) {
                    ⁱˉ0.MTH5229();
                    ﾞᵎ0.MTH7437(true);
                }
                ((CLS1624)object0).MTH7301(new CLS204(ⁱˉ0, 4));
                ((CLS1624)object0).MTH7305(new CLS504(ⁱˉ0, ((Activity)object3), ((ArrayList)object2), 3));
                CLS523.MTH7147(linearLayout6, ((CLS18)(((CLS1624)object0))), true);
                return;
            }
            case 22: {
                LinearLayout linearLayout7 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ4 = new CLS1623(((Activity)object3));
                יᐧ4.MTH7289(new Object[]{((CLS1620)object2), ((CLS1622)object1), ((CLS1622)object0)});
                יᐧ4.MTH7290(linearLayout7, CLS523.MTH7137(10));
                return;
            }
            case 23: {
                Menu menu3 = (Menu)arr_object[0];
                LinearLayout linearLayout8 = (LinearLayout)arr_object[1];
                ArrayList arrayList2 = ((CLS54)object3).MTH1248();
                Collections.sort(arrayList2, Comparator.comparing(new CLS521(1)));
                CLS326 ˉᐧ0 = new CLS326(((Activity)object2), arrayList2);
                CLS702 ˊᵔ0 = new CLS702(arrayList2, ((CLS54)object3), ˉᐧ0, 19);
                CLS525 ʻˑ3 = new CLS525(((Activity)object2), linearLayout8, menu3);
                ʻˑ3.MTH7187("filter_by_tags", ((CLS3)new CLS1505(((Activity)object2), arrayList2, ((CLS54)object3), ˉᐧ0)));
                ʻˑ3.MTH7187("delete_all", ((CLS3)new CLS1505(((Activity)object2), ((CLS54)object3), arrayList2, ˉᐧ0)));
                ʻˑ3.MTH7187("import_", ((CLS3)new CLS1274(((Activity)object2), ˊᵔ0, 27)));
                ʻˑ3.MTH7187("export_", ((CLS3)new CLS651(((Activity)object2), 3)));
                ʻˑ3.MTH7187("add_silk", ((CLS3)new CLS702(((Activity)object2), arrayList2, ˉᐧ0, 20)));
                ʻˑ3.MTH7188();
                CLS1624 יﹳ2 = new CLS1624(((Activity)object2));
                יﹳ2.FLD5274 = new CLS1485(ˉᐧ0, 1);
                יﹳ2.MTH7302();
                יﹳ2.MTH7303(ˉᐧ0);
                יﹳ2.MTH7308(10);
                יﹳ2.MTH7301(new CLS495(((AlertDialog[])object1), ((CLS7)object0), ˉᐧ0, 1));
                יﹳ2.MTH7305(new CLS181(ˉᐧ0, ((Activity)object2), arrayList2, ((CLS54)object3), ((AlertDialog[])object1), ((CLS7)object0)));
                CLS523.MTH7147(linearLayout8, ((CLS18)יﹳ2), true);
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                CLS1623 יᐧ0 = new CLS1623(((Activity)object3));
                CLS1622 ˑٴ0 = new CLS1622(((Activity)object3));
                ˑٴ0.MTH800(CLS27.MTH889("title"));
                ˑٴ0.FLD5252 = new CLS1481(1, ((CLS81)object2));
                יᐧ0.MTH7296(ˑٴ0);
                CLS1625 ـˏ0 = new CLS1625(((Activity)object3));
                ـˏ0.MTH800(CLS27.MTH889("add"));
                ـˏ0.MTH7320(new CLS377(((CLS3)object0), 0));
                יᐧ0.MTH7296(ـˏ0);
                יᐧ0.MTH7290(linearLayout0, CLS523.MTH7137(10));
                CLS1624 יﹳ0 = new CLS1624(((Activity)object3));
                יﹳ0.MTH7303(((CLS369)object1));
                CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH1958(LinearLayout linearLayout0) {
        File[] arr_file = (File[])this.FLD507;
        ArrayList arrayList0 = (ArrayList)this.FLD506;
        CLS335 ˑٴ0 = (CLS335)this.FLD508;
        Activity activity0 = (Activity)this.FLD505;
        try {
            ArrayList arrayList1 = new ArrayList();
            for(int v = 0; v < arr_file.length; ++v) {
                File file0 = arr_file[v];
                if(file0 != null) {
                    File[] arr_file1 = file0.listFiles();
                    if(arr_file1 != null && arr_file1.length > 0) {
                        arrayList1.addAll(Arrays.asList(arr_file1));
                    }
                }
            }
            Collections.sort(arrayList1, new CLS110(3));
            for(Object object0: arrayList1) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("vid", ((File)object0).getAbsolutePath());
                contentValues0.put("desc", ((File)object0).getName());
                arrayList0.add(contentValues0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        ˑٴ0.MTH5111(arrayList0);
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.MTH7303(ˑٴ0);
        יﹳ0.MTH7308(5);
        יﹳ0.MTH7301(new CLS200(ˑٴ0, activity0, arrayList0, 2));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7296(יﹳ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS10
    public final void MTH788(ArrayList arrayList0) {
        CLS170 ˆٴ$ˆٴ0;
        CLS77 ˊˏ0 = (CLS77)this.FLD507;
        String s = (String)this.FLD508;
        String s1 = (String)this.FLD506;
        String s2 = (String)this.FLD505;
        ˊˏ0.getClass();
        for(Object object0: arrayList0) {
            ContentValues contentValues0 = (ContentValues)object0;
            int v = 1;
            if(contentValues0.containsKey("plugin")) {
                CLS29 ˎᵢ0 = CLS27.MTH895();
                if(CLS182.MTH3480(4101554684479460149L, CLS182.MTH3483(s), ˎᵢ0, true) || !"null".equals(contentValues0.getAsString("plugin"))) {
                    goto label_13;
                }
            }
            else {
            label_13:
                switch(contentValues0.getAsString("type")) {
                    case "file": {
                        v = 3;
                        break;
                    }
                    case "image": {
                        break;
                    }
                    case "image2": {
                        v = 6;
                        break;
                    }
                    case "music": {
                        v = 4;
                        break;
                    }
                    case "text": {
                        v = 0;
                        break;
                    }
                    case "url": {
                        v = 5;
                        break;
                    }
                    case "video": {
                        v = 2;
                        break;
                    }
                    case "voice": {
                        v = 7;
                        break;
                    }
                    default: {
                        v = -1;
                    }
                }
                CLS139 ﹶʼ0 = ˊˏ0.FLD267;
                switch(v) {
                    case 0: {
                        ˊˏ0.MTH1603(contentValues0.getAsString("content"), s1, s, s2);
                        continue;
                    }
                    case 1: {
                        CLS886 ʾᵢ0 = new CLS886();
                        ʾᵢ0.MTH3223(contentValues0.getAsString("url"));
                        ˆٴ$ˆٴ0 = new CLS170(((CLS169)ʾᵢ0), s1);
                        break;
                    }
                    case 2: {
                        CLS889 ـˏ0 = new CLS889();
                        ـˏ0.MTH3261(contentValues0.getAsString("url"));
                        ˆٴ$ˆٴ0 = new CLS170(((CLS169)ـˏ0), s1);
                        break;
                    }
                    case 3: {
                        CLS888 ˊﾞ0 = new CLS888();
                        ˊﾞ0.MTH3251(contentValues0.getAsString("url"));
                        ˆٴ$ˆٴ0 = new CLS170(((CLS169)ˊﾞ0), s1);
                        break;
                    }
                    case 4: {
                        HashMap hashMap0 = new HashMap();
                        hashMap0.put("description", contentValues0.getAsString("description"));
                        hashMap0.put("title", contentValues0.getAsString("title"));
                        if(contentValues0.containsKey("thumbUrl")) {
                            hashMap0.put("thumbUrl", contentValues0.getAsString("thumbUrl"));
                        }
                        hashMap0.put("musicDataUrl", contentValues0.getAsString("url"));
                        hashMap0.put("musicUrl", contentValues0.getAsString("url"));
                        ﹶʼ0.MTH3029(new CLS170(((CLS169)new CLS885(hashMap0)), s1));
                        continue;
                    }
                    case 5: {
                        String s3 = contentValues0.containsKey("title") ? contentValues0.getAsString("title") : "";
                        String s4 = contentValues0.containsKey("description") ? contentValues0.getAsString("description") : "";
                        String s5 = contentValues0.containsKey("url") ? contentValues0.getAsString("url") : "";
                        String s6 = null;
                        byte[] arr_b = contentValues0.containsKey("thumbData") ? contentValues0.getAsByteArray("thumbData") : null;
                        if(contentValues0.containsKey("thumbUrl")) {
                            s6 = contentValues0.getAsString("thumbUrl");
                        }
                        ˆٴ$ˆٴ0 = new CLS170(((CLS169)(TextUtils.isEmpty(s6) ? new CLS891(s5, s3, s4, arr_b) : new CLS891(s5, s3, s4, s6))), s1);
                        break;
                    }
                    case 6: {
                        ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS886(new File(contentValues0.getAsString("path")))), s1);
                        break;
                    }
                    case 7: {
                        ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS894(CLS182.MTH3474(4101555908545139509L, contentValues0), contentValues0.getAsString("path"))), s1);
                        break;
                    }
                    default: {
                        continue;
                    }
                }
                ﹶʼ0.MTH3029(ˆٴ$ˆٴ0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        Object object0 = this.FLD505;
        Object object1 = this.FLD508;
        Object object2 = this.FLD506;
        Object object3 = this.FLD507;
        if(this.FLD504 == 27) {
            HashMap hashMap0 = (HashMap)object3;
            String s1 = (String)object1;
            if(!TextUtils.isEmpty(s)) {
                String s2 = Long.toHexString(System.currentTimeMillis());
                hashMap0.put(s, s2);
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(CLS27.MTH889("tags"));
                arrayList0.addAll(hashMap0.keySet());
                ((CLS1620)object2).MTH7247(arrayList0);
                JSONObject jSONObject0 = new JSONObject();
                try {
                    for(Object object4: hashMap0.keySet()) {
                        String s3 = (String)object4;
                        String s4 = (String)hashMap0.get(s3);
                        if(!TextUtils.isEmpty(s4)) {
                            jSONObject0.put(s4, s3);
                        }
                    }
                    CLS27.MTH895().MTH922(jSONObject0, "at_multiple_tags_" + s1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                HashSet hashSet0 = new HashSet();
                Iterator iterator1 = ((CLS363)object0).MTH5261().iterator();
                while(iterator1.hasNext()) {
                    iterator1.next();
                    hashSet0.add("");
                }
                if(!hashSet0.isEmpty()) {
                    CLS27.MTH895().MTH922(TextUtils.join(",", hashSet0), "at_multiple_tag_" + s1 + "_" + s2);
                }
            }
            return;
        }
        HashMap hashMap1 = (HashMap)object3;
        String s5 = (String)object0;
        if(!TextUtils.isEmpty(s)) {
            String s6 = (String)hashMap1.get(((String)object1));
            hashMap1.remove(((String)object1));
            hashMap1.put(s, s6);
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(CLS27.MTH889("tags"));
            arrayList1.addAll(hashMap1.keySet());
            ((CLS1620)object2).MTH7247(arrayList1);
            JSONObject jSONObject1 = new JSONObject();
            try {
                for(Object object5: hashMap1.keySet()) {
                    String s7 = (String)object5;
                    String s8 = (String)hashMap1.get(s7);
                    if(!TextUtils.isEmpty(s8)) {
                        jSONObject1.put(s8, s7);
                    }
                }
                CLS27.MTH895().MTH922(jSONObject1, "at_multiple_tags_" + s5);
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS442$CLS441
    public final void MTH6222(InputStream inputStream0) {
        CLS43 ˆʿ0 = (CLS43)this.FLD507;
        Activity activity0 = (Activity)this.FLD506;
        ArrayList arrayList0 = (ArrayList)this.FLD508;
        CLS347 ᐧי0 = (CLS347)this.FLD505;
        if(inputStream0 != null) {
            try {
                String s = CLS31.MTH998(inputStream0);
                if(!TextUtils.isEmpty(s)) {
                    try {
                        ˆʿ0.MTH1163(new JSONArray(s));
                        CLS412.MTH6013(activity0, CLS27.MTH889("import_done"));
                        arrayList0.clear();
                        arrayList0.addAll(ˆʿ0.MTH1165());
                        ᐧי0.notifyDataSetChanged();
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
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
        CLS71 ˆٴ0 = new CLS71(((Activity)this.FLD507), null);
        ˆٴ0.MTH1572("delete", ((CLS3)new CLS848(((Activity)this.FLD507), ((CLS29)this.FLD506), ((String)object0), ((String)this.FLD508), 5, 0)));
        ˆٴ0.MTH1572("modify", ((CLS3)new CLS1235(((Activity)this.FLD507), ((String)object0), ((HashMap)this.FLD505), ((CLS29)this.FLD506), ((String)this.FLD508), 6)));
        ˆٴ0.MTH1573();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        Object object0 = this.FLD505;
        Object object1 = this.FLD508;
        Object object2 = this.FLD506;
        Object object3 = this.FLD507;
        switch(this.FLD504) {
            case 9: {
                CLS1112 ᐧˏ0 = (CLS1112)object3;
                Activity activity0 = (Activity)object1;
                ᐧˏ0.getClass();
                ((CLS1622)object2).MTH800(CLS27.MTH889("template_name"));
                CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1622)object2))), true);
                ᐧˏ0.FLD2476 = new CLS1635(activity0);
                if(((JSONObject)object0).has("e")) {
                    ᐧˏ0.FLD2476.MTH7437(((JSONObject)object0).optInt("e") == 1);
                }
                CLS1635 ﾞᵎ0 = CLS34.MTH1086(4100644507894993717L, ᐧˏ0.FLD2476, activity0);
                ᐧˏ0.FLD2477 = ﾞᵎ0;
                CLS1635 ﾞᵎ1 = CLS34.MTH1086(4100644537959764789L, ﾞᵎ0, activity0);
                ᐧˏ0.FLD2471 = ﾞᵎ1;
                CLS1635 ﾞᵎ2 = CLS34.MTH1086(4100644009678787381L, ﾞᵎ1, activity0);
                ᐧˏ0.FLD2458 = ﾞᵎ2;
                CLS1635 ﾞᵎ3 = CLS34.MTH1086(4100644035448591157L, ﾞᵎ2, activity0);
                ᐧˏ0.FLD2451 = ﾞᵎ3;
                CLS1635 ﾞᵎ4 = CLS34.MTH1086(4100644061218394933L, ﾞᵎ3, activity0);
                ᐧˏ0.FLD2483 = ﾞᵎ4;
                CLS1635 ﾞᵎ5 = CLS34.MTH1086(4100644086988198709L, ﾞᵎ4, activity0);
                ᐧˏ0.FLD2467 = ﾞᵎ5;
                CLS1635 ﾞᵎ6 = CLS34.MTH1086(4100644121347937077L, ﾞᵎ5, activity0);
                ᐧˏ0.FLD2481 = ﾞᵎ6;
                CLS1635 ﾞᵎ7 = CLS34.MTH1086(4100644147117740853L, ﾞᵎ6, activity0);
                ᐧˏ0.FLD2449 = ﾞᵎ7;
                CLS1635 ﾞᵎ8 = CLS34.MTH1086(4100644185772446517L, ﾞᵎ7, activity0);
                ᐧˏ0.FLD2462 = ﾞᵎ8;
                CLS1635 ﾞᵎ9 = CLS34.MTH1086(4100644233017086773L, ﾞᵎ8, activity0);
                ᐧˏ0.FLD2447 = ﾞᵎ9;
                CLS1635 ﾞᵎ10 = CLS34.MTH1086(4100644258786890549L, ﾞᵎ9, activity0);
                ᐧˏ0.FLD2474 = ﾞᵎ10;
                CLS1635 ﾞᵎ11 = CLS34.MTH1086(4100644855787344693L, ﾞᵎ10, activity0);
                ᐧˏ0.FLD2480 = ﾞᵎ11;
                CLS1635 ﾞᵎ12 = CLS34.MTH1086(4100644915916886837L, ﾞᵎ11, activity0);
                ᐧˏ0.FLD2452 = ﾞᵎ12;
                CLS1635 ﾞᵎ13 = CLS34.MTH1086(4100644958866559797L, ﾞᵎ12, activity0);
                ᐧˏ0.FLD2450 = ﾞᵎ13;
                CLS1635 ﾞᵎ14 = CLS34.MTH1086(4100644997521265461L, ﾞᵎ13, activity0);
                ᐧˏ0.FLD2455 = ﾞᵎ14;
                CLS1635 ﾞᵎ15 = CLS34.MTH1086(4100645040470938421L, ﾞᵎ14, activity0);
                ᐧˏ0.FLD2469 = ﾞᵎ15;
                CLS1635 ﾞᵎ16 = CLS34.MTH1086(4100645074830676789L, ﾞᵎ15, activity0);
                ᐧˏ0.FLD2456 = ﾞᵎ16;
                CLS1635 ﾞᵎ17 = CLS34.MTH1086(4100645100600480565L, ﾞᵎ16, activity0);
                ᐧˏ0.FLD2468 = ﾞᵎ17;
                CLS1635 ﾞᵎ18 = CLS34.MTH1086(4100644580909437749L, ﾞᵎ17, activity0);
                ᐧˏ0.FLD2473 = ﾞᵎ18;
                CLS1635 ﾞᵎ19 = CLS34.MTH1086(4100644628154078005L, ﾞᵎ18, activity0);
                ᐧˏ0.FLD2461 = ﾞᵎ19;
                ﾞᵎ19.MTH800(CLS27.MTH889("anymsg"));
                CLS1623 יᐧ1 = new CLS1623(activity0);
                יᐧ1.MTH7296(ᐧˏ0.FLD2476);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), CLS523.MTH7137(10));
                CLS1623 יᐧ2 = new CLS1623(activity0);
                יᐧ2.MTH800(CLS27.MTH889("types"));
                יᐧ2.MTH7289(new Object[]{ᐧˏ0.FLD2477, ᐧˏ0.FLD2471, ᐧˏ0.FLD2458, ᐧˏ0.FLD2451, ᐧˏ0.FLD2483, ᐧˏ0.FLD2467, ᐧˏ0.FLD2481, ᐧˏ0.FLD2449, ᐧˏ0.FLD2462, ᐧˏ0.FLD2447, ᐧˏ0.FLD2474, ᐧˏ0.FLD2480, ᐧˏ0.FLD2452, ᐧˏ0.FLD2450, ᐧˏ0.FLD2455, ᐧˏ0.FLD2469, ᐧˏ0.FLD2456, ᐧˏ0.FLD2468, ᐧˏ0.FLD2473, ᐧˏ0.FLD2461});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), CLS523.MTH7137(10));
                ((CLS1622)object2).MTH7277(((JSONObject)object0).optString("n"));
                ᐧˏ0.MTH4204(((JSONObject)object0).optString("t"));
                return;
            }
            case 11: {
                CLS1105 ᐧˈ0 = (CLS1105)object3;
                String s = (String)object1;
                Activity activity1 = (Activity)object2;
                ᐧˈ0.getClass();
                int v1 = CLS523.MTH7137(10);
                String s1 = CLS182.MTH3475(4100568031707321141L, CLS182.MTH3483(s));
                CLS29 ˎᵢ0 = ᐧˈ0.FLD2151;
                int v2 = ˎᵢ0.MTH927(1, s1);
                CLS485 ᐧﾞ0 = ᐧˈ0.FLD2414;
                if(v2 == 0 && CLS182.MTH3480(4100568121901634357L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                    ᐧﾞ0.getClass();
                    CLS485.MTH6726(activity1, "rp_" + s);
                }
                CLS1635 ﾞᵎ20 = new CLS1635(activity1);
                CLS1635 ﾞᵎ21 = new CLS1635(activity1);
                CLS1635 ﾞᵎ22 = new CLS1635(activity1);
                CLS1635 ﾞᵎ23 = new CLS1635(activity1);
                CLS1635 ﾞᵎ24 = new CLS1635(activity1);
                CLS1621 ˎᵢ1 = new CLS1621(activity1);
                CLS1616 ʻˏ0 = new CLS1616(activity1);
                CLS1635 ﾞᵎ25 = new CLS1635(activity1);
                CLS1635 ﾞᵎ26 = new CLS1635(activity1);
                CLS1635 ﾞᵎ27 = new CLS1635(activity1);
                CLS1622 ˑٴ0 = new CLS1622(activity1);
                CLS1625 ـˏ0 = new CLS1625(activity1);
                CLS1625 ـˏ1 = new CLS1625(activity1);
                CLS1625 ـˏ2 = new CLS1625(activity1);
                CLS1625 ـˏ3 = new CLS1625(activity1);
                CLS1635 ﾞᵎ28 = new CLS1635(activity1);
                CLS1635 ﾞᵎ29 = new CLS1635(activity1);
                CLS1617 ʻᵎ0 = new CLS1617(activity1);
                CLS1635 ﾞᵎ30 = new CLS1635(activity1);
                CLS1635 ﾞᵎ31 = new CLS1635(activity1);
                CLS1635 ﾞᵎ32 = new CLS1635(activity1);
                CLS1635 ﾞᵎ33 = new CLS1635(activity1);
                CLS1629 ⁱˉ0 = new CLS1629(activity1);
                CLS1626 ـﹳ0 = new CLS1626(activity1);
                CLS1635 ﾞᵎ34 = new CLS1635(activity1);
                CLS1635 ﾞᵎ35 = new CLS1635(activity1);
                CLS1622 ˑٴ1 = new CLS1622(activity1);
                CLS1622 ˑٴ2 = new CLS1622(activity1);
                CLS1635 ﾞᵎ36 = new CLS1635(activity1);
                CLS1623 יᐧ3 = new CLS1623(activity1);
                CLS1635 ﾞᵎ37 = new CLS1635(activity1);
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append("grab_red_packet_enable");
                ﾞᵎ37.MTH7437(ˎᵢ0.MTH938(stringBuilder0.toString(), false));
                ﾞᵎ37.MTH800(CLS27.MTH889("grab_red_packet_enable"));
                ﾞᵎ37.MTH7438(new CLS205(ᐧˈ0, s, ((String)object0), 7));
                CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ37), true);
                ﾞᵎ20.MTH7437(ˎᵢ0.MTH938(s + "grab_red_packet_mute_enable", false));
                ﾞᵎ20.MTH800(CLS27.MTH889("grab_red_packet_mute_enable"));
                ﾞᵎ20.MTH7438(new CLS265(ᐧˈ0, s, 5));
                יᐧ3.MTH7296(ﾞᵎ20);
                ﾞᵎ21.MTH7437(ˎᵢ0.MTH938(s + "grab_red_packet_notself_enable", false));
                ﾞᵎ21.MTH800(CLS27.MTH889("grab_red_packet_notself_enable"));
                ﾞᵎ21.MTH7438(new CLS265(ᐧˈ0, s, 11));
                יᐧ3.MTH7296(ﾞᵎ21);
                if(TextUtils.isEmpty(s)) {
                    ﾞᵎ22.MTH7437(ˎᵢ0.MTH938("grab_red_packet_notprivate_enable", false));
                    ﾞᵎ22.MTH800(CLS27.MTH889("grab_red_packet_notprivate_enable"));
                    ﾞᵎ22.MTH7438(new CLS226(ᐧˈ0, 22));
                    יᐧ3.MTH7296(ﾞᵎ22);
                }
                CLS1623 יᐧ4 = CLS34.MTH1087(linearLayout0, יᐧ3, v1, activity1);
                StringBuilder stringBuilder1 = CLS182.MTH3483(s);
                stringBuilder1.append("grab_red_packet_filter_onlyopen_enable");
                ﾞᵎ32.MTH7437(ˎᵢ0.MTH938(stringBuilder1.toString(), false));
                ﾞᵎ32.MTH800(CLS27.MTH889("grab_red_packet_filter_onlyopen_enable"));
                ﾞᵎ32.MTH7438(new CLS195(ᐧˈ0, s, ﾞᵎ29, 0));
                יᐧ4.MTH7296(ﾞᵎ32);
                ﾞᵎ29.MTH7437(ˎᵢ0.MTH938(s + "grab_red_packet_filter_notopen_enable", false));
                ﾞᵎ29.MTH800(CLS27.MTH889("grab_red_packet_filter_notopen_enable"));
                ﾞᵎ29.MTH7438(new CLS195(ᐧˈ0, s, ﾞᵎ32, 1));
                יᐧ4.MTH7296(ﾞᵎ29);
                ʻᵎ0.MTH800(CLS27.MTH889("add_keyword"));
                ʻᵎ0.FLD5159 = new CLS737(ᐧˈ0, s, activity1, v1);
                if(CLS182.MTH3480(4100565033820148533L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                    ﾞᵎ29.MTH7437(false);
                    ﾞᵎ29.MTH801(8);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(s);
                    String s2 = CLS182.MTH3475(4100565751079686965L, stringBuilder2);
                    ˎᵢ0.MTH922(Boolean.FALSE, s2);
                }
                if(CLS182.MTH3480(0x38E822F92B3CD335L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                    ﾞᵎ32.MTH7437(false);
                    ﾞᵎ32.MTH801(8);
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(s);
                    String s3 = CLS182.MTH3475(0x38E8229F2B3CD335L, stringBuilder3);
                    ˎᵢ0.MTH922(Boolean.FALSE, s3);
                }
                יᐧ4.MTH7296(ʻᵎ0);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ4), v1);
                CLS1623 יᐧ5 = new CLS1623(activity1);
                StringBuilder stringBuilder4 = CLS182.MTH3483(s);
                stringBuilder4.append("grab_red_packet_delay_enable");
                ﾞᵎ23.MTH7437(ˎᵢ0.MTH938(stringBuilder4.toString(), false));
                ﾞᵎ23.MTH800(CLS27.MTH889("grab_red_packet_delay_enable"));
                ﾞᵎ23.MTH7438(new CLS198(((CLS219)ᐧˈ0), s, ˎᵢ1, ((CLS18)ﾞᵎ24), 1));
                יᐧ5.MTH7296(ﾞᵎ23);
                ﾞᵎ24.MTH7437(ˎᵢ0.MTH938(s + "grab_red_packet_random_delay_enable", false));
                ﾞᵎ24.MTH800(CLS27.MTH889("random_delay"));
                ﾞᵎ24.MTH7438(new CLS198(((CLS219)ᐧˈ0), s, ˎᵢ1, ((CLS18)ʻˏ0), 2));
                יᐧ5.MTH7296(ﾞᵎ24);
                ˎᵢ1.MTH800(CLS27.MTH889("delay"));
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(s);
                ˎᵢ1.MTH7268(((long)CLS34.MTH1064(4100566180576416565L, stringBuilder5, ˎᵢ0, 0)));
                ˎᵢ1.FLD5242 = new CLS999(ᐧˈ0, s, 4);
                ʻˏ0.MTH800(CLS27.MTH889("delay"));
                ʻˏ0.FLD5144 = new CLS999(ᐧˈ0, s, 0);
                ʻˏ0.FLD5143 = (long)CLS34.MTH1064(4100566850591314741L, CLS182.MTH3483(s), ˎᵢ0, 0);
                ʻˏ0.FLD5137 = (long)CLS34.MTH1064(4100566966555431733L, CLS182.MTH3483(s), ˎᵢ0, 5000);
                if(CLS182.MTH3480(4100566532763734837L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                    ˎᵢ1.MTH801(8);
                    ʻˏ0.MTH801(0);
                }
                else {
                    ˎᵢ1.MTH801(0);
                    ʻˏ0.MTH801(8);
                }
                יᐧ5.MTH7289(new Object[]{ˎᵢ1, ʻˏ0});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ5), v1);
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append(s);
                String s4 = ˎᵢ0.MTH925(CLS182.MTH3475(4100566687382557493L, stringBuilder6), "");
                ContentValues contentValues0 = new ContentValues();
                if(TextUtils.isEmpty(s4)) {
                    contentValues0.put("startH", -1);
                    contentValues0.put("startM", 0);
                    contentValues0.put("endH", -1);
                    contentValues0.put("endM", 0);
                }
                else {
                    String[] arr_s = s4.split(";");
                    String[] arr_s1 = arr_s[0].split(":");
                    String[] arr_s2 = arr_s[1].split(":");
                    contentValues0.put("startH", arr_s1[0]);
                    contentValues0.put("startM", arr_s1[1]);
                    contentValues0.put("endH", arr_s2[0]);
                    contentValues0.put("endM", arr_s2[1]);
                }
                CLS568 יᐧ6 = new CLS568(ᐧˈ0, s, 9);
                ᐧˈ0.FLD2418 = new CLS536(activity1, contentValues0, ((CLS12)יᐧ6), ((CLS12)יᐧ6));
                StringBuilder stringBuilder7 = CLS182.MTH3487(4100563131149636405L, ﾞᵎ36, s);
                stringBuilder7.append("rp_timeframe_enable");
                ﾞᵎ36.MTH7437(ˎᵢ0.MTH938(stringBuilder7.toString(), false));
                ﾞᵎ36.MTH7438(new CLS265(ᐧˈ0, s, 0));
                CLS1623 יᐧ7 = new CLS1623(activity1);
                יᐧ7.MTH7296(ﾞᵎ36);
                ᐧˈ0.FLD2418.MTH7234(יᐧ7);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ7), v1);
                CLS1623 יᐧ8 = new CLS1623(activity1);
                StringBuilder stringBuilder8 = CLS182.MTH3483(s);
                stringBuilder8.append("red_packet_msg_enable");
                ﾞᵎ25.MTH7437(ˎᵢ0.MTH938(stringBuilder8.toString(), false));
                ﾞᵎ25.MTH800(CLS27.MTH889("red_packet_msg_enable"));
                ﾞᵎ25.MTH7438(new CLS265(ᐧˈ0, s, 1));
                יᐧ8.MTH7296(ﾞᵎ25);
                ˑٴ0.MTH800(CLS27.MTH889("red_packet_msg_lbl"));
                StringBuilder stringBuilder9 = new StringBuilder();
                stringBuilder9.append(s);
                ˑٴ0.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3475(0x38E820D82B3CD335L, stringBuilder9), ""));
                ˑٴ0.FLD5252 = new CLS999(ᐧˈ0, s, 1);
                יᐧ8.MTH7296(ˑٴ0);
                ﾞᵎ28.MTH800(CLS27.MTH889("config_grab_reply_enable"));
                StringBuilder stringBuilder10 = new StringBuilder();
                stringBuilder10.append(s);
                stringBuilder10.append("config_grab_reply_enable");
                ﾞᵎ28.MTH7437(ˎᵢ0.MTH938(stringBuilder10.toString(), false));
                ﾞᵎ28.MTH7438(new CLS265(ᐧˈ0, s, 2));
                יᐧ8.MTH7296(ﾞᵎ28);
                ـˏ3.MTH800(CLS27.MTH889("config_responses"));
                ـˏ3.MTH7320(new CLS271(ᐧˈ0, s, 0));
                יᐧ8.MTH7296(ـˏ3);
                CLS500 ᵢﹶ0 = ᐧˈ0.FLD2153;
                if(ᵢﹶ0.MTH6895("rp_keyword")) {
                    ـˏ0.MTH800(CLS27.MTH889("title_autoresponse_keywords"));
                    ـˏ0.MTH7320(new CLS271(ᐧˈ0, s, 1));
                    יᐧ8.MTH7296(ـˏ0);
                }
                StringBuilder stringBuilder11 = CLS182.MTH3487(4100564118992114485L, ﾞᵎ27, s);
                stringBuilder11.append("_inherit_general");
                ﾞᵎ27.MTH7437(ˎᵢ0.MTH938(stringBuilder11.toString(), false));
                ﾞᵎ27.MTH7438(new CLS265(ᐧˈ0, s, 3));
                if(!TextUtils.isEmpty(s)) {
                    יᐧ8.MTH7296(ﾞᵎ27);
                }
                StringBuilder stringBuilder12 = CLS182.MTH3487(4100564260726035253L, ﾞᵎ33, s);
                stringBuilder12.append("rp_reply_at");
                ﾞᵎ33.MTH7437(ˎᵢ0.MTH938(stringBuilder12.toString(), false));
                ﾞᵎ33.MTH7438(new CLS265(ᐧˈ0, s, 4));
                יᐧ8.MTH7296(ﾞᵎ33);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ8), v1);
                CLS1623 יᐧ9 = new CLS1623(activity1);
                StringBuilder stringBuilder13 = CLS182.MTH3487(4100563801164534581L, ﾞᵎ26, s);
                stringBuilder13.append("red_packet_notification_enable");
                ﾞᵎ26.MTH7437(ˎᵢ0.MTH938(stringBuilder13.toString(), false));
                ﾞᵎ26.MTH7438(new CLS265(ᐧˈ0, s, 6));
                יᐧ9.MTH7296(ﾞᵎ26);
                ⁱˉ0.MTH800(CLS27.MTH889("rp_notification_type"));
                ⁱˉ0.MTH7381("radio_type_notification");
                ⁱˉ0.MTH7381("radio_type_toast");
                StringBuilder stringBuilder14 = new StringBuilder();
                stringBuilder14.append(s);
                ⁱˉ0.MTH7375(CLS370.MTH5289((CLS34.MTH1064(4100564333740479285L, stringBuilder14, ˎᵢ0, 1) == 1 ? 4100564423934792501L : 0x38E821AF2B3CD335L)));
                ⁱˉ0.FLD5356 = new CLS1089(ᐧˈ0, s, activity1, ـˏ1, ـˏ2, ﾞᵎ30, ﾞᵎ31, ـﹳ0);
                יᐧ9.MTH7296(ⁱˉ0);
                ﾞᵎ30.MTH800(CLS27.MTH889("rp_sound"));
                ﾞᵎ30.MTH7437(ˎᵢ0.MTH938(s + "rp_sound", false));
                ﾞᵎ30.MTH7438(new CLS265(ᐧˈ0, s, 7));
                יᐧ9.MTH7296(ﾞᵎ30);
                ـﹳ0.MTH800(CLS27.MTH889("select_ringtone"));
                StringBuilder stringBuilder15 = new StringBuilder();
                stringBuilder15.append(s);
                String s5 = ˎᵢ0.MTH925(CLS182.MTH3475(4100578489952686901L, stringBuilder15), "");
                ـﹳ0.MTH7325((TextUtils.isEmpty(s5) ? CLS27.MTH889("default_text") : RingtoneManager.getRingtone(activity1.getApplicationContext(), Uri.parse(s5)).getTitle(activity1)));
                ـﹳ0.MTH7324(new CLS67(ᐧˈ0, ـﹳ0, s, 17));
                יᐧ9.MTH7296(ـﹳ0);
                ﾞᵎ31.MTH800(CLS27.MTH889("rp_vibrate"));
                ﾞᵎ31.MTH7437(ˎᵢ0.MTH938(s + "rp_vibrate", false));
                ﾞᵎ31.MTH7438(new CLS265(ᐧˈ0, s, 8));
                יᐧ9.MTH7296(ﾞᵎ31);
                ـˏ1.MTH800(CLS27.MTH889("config_notification"));
                ـˏ1.MTH7320(new CLS67(ᐧˈ0, activity1, s, 18));
                יᐧ9.MTH7296(ـˏ1);
                ـˏ2.MTH800(CLS27.MTH889("reset_notification_channel"));
                ـˏ2.MTH7320(new CLS252(ᐧˈ0, activity1, s, ﾞᵎ30, ﾞᵎ31, ـﹳ0, 1));
                יᐧ9.MTH7296(ـˏ2);
                StringBuilder stringBuilder16 = new StringBuilder();
                stringBuilder16.append(s);
                if(CLS34.MTH1064(4100578902269547317L, stringBuilder16, ˎᵢ0, 1) == 0) {
                    ᐧﾞ0.getClass();
                    if(CLS485.MTH6739(activity1, "wx_rp_" + s)) {
                        CLS523.MTH7157(true, new CLS18[]{ﾞᵎ30, ﾞᵎ31, ـﹳ0});
                    }
                    else {
                        CLS523.MTH7157(true, new CLS18[]{ـˏ1, ـˏ2});
                    }
                }
                else {
                    CLS523.MTH7157(true, new CLS18[]{ـˏ1, ـˏ2});
                }
                StringBuilder stringBuilder17 = CLS182.MTH3487(4100579022528631605L, ﾞᵎ34, s);
                stringBuilder17.append("rp_missed_toast_enable");
                ﾞᵎ34.MTH7437(ˎᵢ0.MTH938(stringBuilder17.toString(), true));
                ﾞᵎ34.MTH7438(new CLS265(ᐧˈ0, s, 9));
                יᐧ9.MTH7296(ﾞᵎ34);
                ˑٴ2.FLD5256 = String.format(CLS27.MTH889("rp_missed"), ((int)(new Random().nextInt(10) + 1)));
                ˑٴ2.MTH7277(ˎᵢ0.MTH925(CLS182.MTH3475(4100578713290986293L, CLS182.MTH3483(s)), ""));
                ˑٴ2.FLD5252 = new CLS999(ᐧˈ0, s, 2);
                יᐧ9.MTH7296(ˑٴ2);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ9), v1);
                if(ˎᵢ0.MTH938("tts_enable", true)) {
                    StringBuilder stringBuilder18 = CLS182.MTH3487(4100578829255103285L, ﾞᵎ35, s);
                    stringBuilder18.append("rp_speak_amount");
                    ﾞᵎ35.MTH7437(ˎᵢ0.MTH938(stringBuilder18.toString(), false));
                    ﾞᵎ35.MTH7438(new CLS265(ᐧˈ0, s, 10));
                    ˑٴ1.MTH7277(String.valueOf(((double)CLS34.MTH1064(4100579602349216565L, CLS34.MTH1085(4100579516449870645L, ˑٴ1, s), ˎᵢ0, 0)) / 100.0));
                    ˑٴ1.FLD5252 = new CLS999(ᐧˈ0, s, 3);
                    CLS1623 יᐧ10 = new CLS1623(activity1);
                    יᐧ10.MTH7289(new Object[]{ﾞᵎ35, ˑٴ1});
                    CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ10), v1);
                }
                if(CLS426.MTH6126(((String)object0))) {
                    CLS1623 יᐧ11 = new CLS1623(activity1);
                    CLS1625 ـˏ4 = new CLS1625(activity1);
                    ـˏ4.MTH800(CLS27.MTH889("config_exclude"));
                    ـˏ4.MTH7320(new CLS215(ᐧˈ0, ((String)object0), activity1, s, 0));
                    יᐧ11.MTH7296(ـˏ4);
                    CLS1625 ـˏ5 = new CLS1625(activity1);
                    ـˏ5.MTH800(CLS27.MTH889("config_include"));
                    ـˏ5.MTH7320(new CLS215(ᐧˈ0, ((String)object0), activity1, s, 1));
                    יᐧ11.MTH7296(ـˏ5);
                    יᐧ11.MTH7290(linearLayout0, v1);
                }
                if(!TextUtils.isEmpty(s) && ᵢﹶ0.MTH6895("remote_rp_cmd")) {
                    try {
                        int v3 = CLS523.MTH7137(10);
                        Activity activity2 = ((CLS219)ᐧˈ0).MTH3883();
                        CLS1635 ﾞᵎ38 = new CLS1635(activity2);
                        ﾞᵎ38.MTH7437(ˎᵢ0.MTH938(s + "remote_excl_rp_enable", true));
                        ﾞᵎ38.MTH800(CLS27.MTH889("remote_excl_rp_enable"));
                        ﾞᵎ38.MTH7438(new CLS265(ᐧˈ0, s, 12));
                        CLS1622 ˑٴ3 = new CLS1622(activity2);
                        ˑٴ3.MTH800(CLS27.MTH889("remote_excl_rp_keyword"));
                        ˑٴ3.MTH7277(ˎᵢ0.MTH925(s + "remote_excl_rp_keyword", ""));
                        ˑٴ3.FLD5252 = new CLS999(ᐧˈ0, s, 5);
                        CLS1622 ˑٴ4 = new CLS1622(activity2);
                        ˑٴ4.MTH800(CLS27.MTH889("remote_incl_rp_keyword"));
                        ˑٴ4.MTH7277(ˎᵢ0.MTH925(s + "remote_incl_rp_keyword", ""));
                        ˑٴ4.FLD5252 = new CLS999(ᐧˈ0, s, 6);
                        CLS1623 יᐧ12 = new CLS1623(activity2);
                        יᐧ12.MTH7289(new Object[]{ﾞᵎ38, ˑٴ3, ˑٴ4});
                        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ12), v3);
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 15: {
                CLS1624 יﹳ0 = new CLS1624(((Activity)object3));
                CLS369 ﾞᵎ39 = new CLS369(((Activity)object3), ((ArrayList)object2));
                יﹳ0.MTH7303(ﾞᵎ39);
                יﹳ0.MTH7301(new CLS200(((Dialog[])object1), ((CLS7)object0), ﾞᵎ39, 1));
                CLS1623 יᐧ13 = new CLS1623(((Activity)object3));
                יᐧ13.MTH7296(יﹳ0);
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ13), CLS523.MTH7137(3));
                return;
            }
            case 16: {
                this.MTH1958(linearLayout0);
                return;
            }
            default: {
                ((CLS1622)object3).MTH7277(((CLS29)object2).MTH925(CLS182.MTH3469(4100854055054398261L, ((CLS1622)object3), 4100854136658776885L), ""));
                ((CLS1622)object1).MTH800(CLS27.MTH889("preconfigrps_desc"));
                ((CLS1622)object1).MTH7277(((CLS29)object2).MTH925("preconfigrps", ""));
                int v = CLS523.MTH7137(10);
                CLS1623 יᐧ0 = new CLS1623(((Activity)object0));
                יᐧ0.MTH7289(new Object[]{((CLS1622)object3), ((CLS1622)object1)});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
            }
        }
    }
}

