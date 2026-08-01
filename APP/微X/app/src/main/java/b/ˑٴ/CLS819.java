// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS568;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS98;
import b.ˈˊ.CLS603;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ـˏ.CLS1645;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ـˏ.CLS887;
import b.ـˏ.CLS888;
import b.ـˏ.CLS889;
import b.ـˏ.CLS892;
import b.ـˏ.CLS893;
import b.ـˏ.CLS894;
import b.ـˏ.CLS895;
import b.ٴـ.CLS896.CLS170;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS309;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS347;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1490;
import b.ⁱᵔ.CLS1555;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS449;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class CLS819 implements CLS35 {
    public final int FLD1246;
    public final CLS629 FLD1247;

    public CLS819(CLS629 ʻˋ0, int v) {
        this.FLD1246 = v;
        this.FLD1247 = ʻˋ0;
        super();
    }

    // 此方法包含解密的字符串
    private final void MTH2797(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        int v = (int)(((Integer)arr_object[0]));
        int v1 = (int)(((Integer)arr_object[1]));
        CLS98 ﾞᐧ0 = (CLS98)arr_object[2];
        Object object0 = arr_object[3];
        int v2 = CLS166.MTH3181(object0, "field_type");
        if(v2 == 1 || v2 == 2 || v2 == 3 || (v2 == 5 || v2 == 7) || v2 == 16) {
        label_11:
            String s = v2 == 7 ? "" : CLS27.MTH889("forward") + " (" + CLS27.MTH889("appname") + ")";
            if(!TextUtils.isEmpty(s) && (ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true) && ﾞᐧ0.MTH1774(v) == null && CLS27.MTH894("favClass2") != null)) {
                CLS743 יʻ0 = new CLS743(ʻˋ0, object0, 0);
                ﾞᐧ0.MTH1770(v1, v, s, CLS27.MTH897("icons_outlined_share"), v).setOnMenuItemClickListener(new CLS142(((CLS3)יʻ0), 6));
                CLS882 ﾞٴ0 = new CLS882(((CLS3)יʻ0), 6);
                CLS21.FLD76.MTH824("on_favsearch_menu_click", v, ((CLS35)ﾞٴ0));
            }
        }
        else {
            switch(v2) {
                case 4: {
                    goto label_11;
                }
                case 8: 
                case 18: {
                    if(ʻˋ0.FLD1447.FLD1438.MTH6895("fav_wenote")) {
                        goto label_11;
                    }
                    break;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2798(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        int v = (int)(((Integer)arr_object[0]));
        int v1 = (int)(((Integer)arr_object[1]));
        ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
        Object object0 = arr_object[3];
        int v2 = CLS166.MTH3181(object0, "field_type");
        if(v2 == 1 || v2 == 2 || v2 == 3 || (v2 == 5 || v2 == 7 || v2 == 16)) {
        label_11:
            String s = v2 == 3 || v2 == 8 || v2 == 18 ? "" : CLS27.MTH889("forward_to_moments");
            if(!TextUtils.isEmpty(s) && (ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true) && contextMenu0.findItem(v) == null && CLS27.MTH894("favClass2") != null)) {
                CLS743 יʻ0 = new CLS743(ʻˋ0, object0, 2);
                contextMenu0.add(v1, v, 0, s).setOnMenuItemClickListener(new CLS142(((CLS3)יʻ0), 12));
                CLS882 ﾞٴ0 = new CLS882(((CLS3)יʻ0), 12);
                CLS21.FLD76.MTH824("on_favsearch_menu_click", v, ((CLS35)ﾞٴ0));
            }
        }
        else {
            switch(v2) {
                case 4: {
                    goto label_11;
                }
                case 8: 
                case 18: {
                    if(ʻˋ0.FLD1447.FLD1438.MTH6895("fav_wenote")) {
                        goto label_11;
                    }
                    break;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2799(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        int v = (int)(((Integer)arr_object[0]));
        int v1 = (int)(((Integer)arr_object[1]));
        ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
        Object object0 = arr_object[3];
        int v2 = CLS166.MTH3181(object0, "field_type");
        CLS139 ﹶʼ0 = ʻˋ0.FLD1447;
        if(v2 == 1 || v2 == 2 || v2 == 3 || v2 == 5 || (v2 == 4 || v2 == 7 || v2 == 16) || (v2 == 8 || v2 == 18) && ﹶʼ0.FLD1438.MTH6895("fav_wenote")) {
            String s = "";
            CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
            switch(v2) {
                case 3: {
                    if(ﹶʼ0.FLD1438.MTH6895("fav_voice_mass_send")) {
                        goto label_14;
                    }
                    break;
                }
                case 1: 
                case 2: 
                case 4: 
                case 16: {
                label_14:
                    if(ˎᵢ0.MTH938("broadcast_forward_enable", true)) {
                        s = CLS27.MTH889("mass_send");
                    }
                }
            }
            if(!TextUtils.isEmpty(s) && ˎᵢ0.MTH938("favorite_forward_enable", true) && contextMenu0.findItem(v) == null && CLS27.MTH894("favClass2") != null) {
                CLS743 יʻ0 = new CLS743(ʻˋ0, object0, 4);
                contextMenu0.add(v1, v, 0, s).setOnMenuItemClickListener(new CLS142(((CLS3)יʻ0), 16));
                CLS882 ﾞٴ0 = new CLS882(((CLS3)יʻ0), 16);
                CLS21.FLD76.MTH824("on_favsearch_menu_click", v, ((CLS35)ﾞٴ0));
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        int v5;
        CLS894 ﾞˎ0;
        CLS629 ʻˋ0 = this.FLD1247;
        switch(this.FLD1246) {
            case 0: {
                Object object0 = null;
                ʻˋ0.getClass();
                Object object1 = arr_object[0];
                try {
                    Field field0 = object1.getClass().getDeclaredField("thisObject");
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object0 = field0.get(object1);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(CLS412.MTH6009(((Activity)object0)).equals(CLS27.MTH897("MassSendSelectContactUI"))) {
                    ʻˋ0.FLD548 = (Activity)object0;
                }
                return;
            }
            case 1: {
                Object object2 = null;
                ʻˋ0.getClass();
                Object object3 = arr_object[0];
                try {
                    Field field1 = object3.getClass().getDeclaredField("thisObject");
                    if(field1 != null) {
                        field1.setAccessible(true);
                        object2 = field1.get(object3);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(CLS502.MTH6934(CLS412.MTH6009(((Activity)object2)), new String[]{CLS27.MTH897("SnsUploadUI")})) {
                    Intent intent0 = ((Activity)object2).getIntent();
                    if(ʻˋ0.FLD1445.MTH938("sns_img_add_img_watermark", false) && intent0 != null && !intent0.hasExtra("wexposed_wf")) {
                        ʻˋ0.FLD552 = 0;
                        ArrayList arrayList0 = intent0.getStringArrayListExtra("sns_kemdia_path_list");
                        ArrayList arrayList1 = new ArrayList();
                        if(arrayList0 != null && !arrayList0.isEmpty()) {
                            CLS466.MTH6509();
                            for(Object object4: arrayList0) {
                                arrayList1.add(ʻˋ0.MTH2037(((String)object4), true));
                            }
                        }
                        if(!arrayList1.isEmpty()) {
                            intent0.putStringArrayListExtra("sns_kemdia_path_list", arrayList1);
                        }
                    }
                }
                return;
            }
            case 2: {
                Object object5 = null;
                ʻˋ0.getClass();
                Object object6 = arr_object[0];
                try {
                    Field field2 = object6.getClass().getDeclaredField("thisObject");
                    if(field2 != null) {
                        field2.setAccessible(true);
                        object5 = field2.get(object6);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(CLS412.MTH6009(((Activity)object5)).endsWith("FinderPostUI") && (ʻˋ0.FLD1445.MTH938("sight_forward_large_video_enable", false) && ʻˋ0.FLD1447.FLD1438.MTH6895("sight_forward_large_video") || ʻˋ0.FLD1445.MTH938("moments_forward_enable", false) && ʻˋ0.FLD1447.FLD1438.MTH6897())) {
                    ArrayList arrayList2 = ((Activity)object5).getIntent().getStringArrayListExtra("postMediaList");
                    if(arrayList2 != null && !arrayList2.isEmpty()) {
                        for(Object object7: arrayList2) {
                            String s = CLS31.MTH1017(CLS31.MTH992(((String)object7)));
                            ʻˋ0.FLD547.MTH1746(s, Boolean.TRUE);
                        }
                    }
                }
                return;
            }
            case 3: {
                Object object8 = null;
                ʻˋ0.getClass();
                Object object9 = arr_object[0];
                if(ʻˋ0.FLD1445.MTH938("sns_img_add_img_watermark", false)) {
                    try {
                        Field field3 = object9.getClass().getDeclaredField("args");
                        if(field3 != null) {
                            field3.setAccessible(true);
                            object8 = field3.get(object9);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    Intent intent1 = (Intent)((Object[])object8)[2];
                    if(intent1 != null && intent1.hasExtra("CropImage_OutputPath_List")) {
                        ArrayList arrayList3 = intent1.getStringArrayListExtra("CropImage_OutputPath_List");
                        ArrayList arrayList4 = new ArrayList();
                        if(arrayList3 == null) {
                            throw new NullPointerException();
                        }
                        for(Object object10: arrayList3) {
                            arrayList4.add(ʻˋ0.MTH2037(((String)object10), true));
                        }
                        if(!arrayList4.isEmpty()) {
                            intent1.putStringArrayListExtra("CropImage_OutputPath_List", arrayList4);
                        }
                    }
                }
                return;
            }
            case 4: {
                ʻˋ0.getClass();
                String s1 = (String)arr_object[0];
                if(!TextUtils.isEmpty(s1)) {
                    ArrayList arrayList5 = (ArrayList)arr_object[1];
                    if(arrayList5 != null && !arrayList5.isEmpty()) {
                        boolean z = arr_object.length <= 2 ? false : ((Boolean)arr_object[2]).booleanValue();
                        for(Object object11: arrayList5) {
                            ContentValues contentValues0 = (ContentValues)object11;
                            int v = contentValues0.containsKey("delay") ? CLS182.MTH3474(4102077536618206005L, contentValues0) : -1;
                            int v1 = CLS182.MTH3474(4102077562388009781L, contentValues0);
                            CLS139 ﹶʼ0 = ʻˋ0.FLD1447;
                            switch(v1) {
                                case -333: {
                                    if(CLS21.FLD76.MTH830("hasTTS", new Object[0])) {
                                        ﾞˎ0 = new CLS894();
                                        ﾞˎ0.MTH3304(contentValues0.getAsString("tts"));
                                        break;
                                    }
                                    ﾞˎ0 = null;
                                    break;
                                }
                                case -104: {
                                    CLS895 ﾞٴ0 = new CLS895();
                                    String s2 = contentValues0.getAsString("url");
                                    File file0 = new File(CLS31.MTH980());
                                    CLS432.MTH6184(file0.getAbsolutePath(), s2, ((CLS3)new CLS1274(ﾞٴ0, file0, 4)));
                                    ﾞˎ0 = ﾞٴ0;
                                    break;
                                }
                                case -103: {
                                    ﾞˎ0 = new CLS888();
                                    ((CLS888)ﾞˎ0).MTH3251(contentValues0.getAsString("url"));
                                    break;
                                }
                                case -102: {
                                    ﾞˎ0 = new CLS889();
                                    ((CLS889)ﾞˎ0).MTH3261(contentValues0.getAsString("url"));
                                    break;
                                }
                                case -101: {
                                    ﾞˎ0 = new CLS886();
                                    ((CLS886)ﾞˎ0).MTH3223(contentValues0.getAsString("url"));
                                    break;
                                }
                                case -100: {
                                    ﾞˎ0 = new CLS887();
                                    CLS1255 ᵢﹶ0 = new CLS1255(ﾞˎ0, contentValues0.getAsString("url"), 9);
                                    CLS40.FLD157.MTH1124(((CLS39)ᵢﹶ0));
                                    break;
                                }
                                case -49: {
                                    if(contentValues0.containsKey("path")) {
                                        ﾞˎ0 = new CLS888(contentValues0.getAsString("path"));
                                        break;
                                    }
                                    else if(contentValues0.containsKey("uri")) {
                                        ﾞˎ0 = new CLS888(Uri.parse(contentValues0.getAsString("uri")));
                                        break;
                                    }
                                    ﾞˎ0 = null;
                                    break;
                                }
                                case 0xFFFFFFD1: {
                                    ﾞˎ0 = new CLS895(contentValues0.getAsString("img"));
                                    break;
                                }
                                case -33: {
                                    if(CLS500.FLD4928.MTH6895("voice_manager")) {
                                        try {
                                            String s3 = contentValues0.getAsString("voice_id");
                                            CLS82 יﹳ0 = CLS54.FLD172.MTH1250(s3);
                                            ArrayList arrayList6 = CLS54.FLD172.MTH1241(יﹳ0);
                                            for(int v2 = 0; v2 < arrayList6.size(); ++v2) {
                                                CLS894 ﾞˎ1 = new CLS894(יﹳ0.MTH1679(v2), ((InputStream)arrayList6.get(v2)));
                                                ﾞˎ1.FLD1624 = v;
                                                ﹶʼ0.MTH3013(new CLS170(((CLS169)ﾞˎ1), s1), z);
                                            }
                                        }
                                        catch(Throwable throwable0) {
                                            goto label_153;
                                        }
                                    }
                                    ﾞˎ0 = null;
                                    break;
                                }
                                case -16: {
                                    ﾞˎ0 = new CLS889(new File(contentValues0.getAsString("path")));
                                    break;
                                }
                                case -4: {
                                    ﾞˎ0 = new CLS1645(CLS66.MTH1370(contentValues0.getAsString("avatar")));
                                    break;
                                }
                                case -3: {
                                    try {
                                        long v3 = (long)contentValues0.getAsLong("code");
                                        CLS81 יᐧ0 = CLS47.FLD167.MTH1199(v3);
                                        ArrayList arrayList7 = CLS47.FLD167.MTH1201(יᐧ0);
                                        for(int v4 = 0; v4 < arrayList7.size(); ++v4) {
                                            CLS894 ﾞˎ2 = new CLS894(((int)(((Integer)יᐧ0.FLD306.get(v4)))) * 1000, ((InputStream)arrayList7.get(v4)));
                                            ﾞˎ2.FLD1624 = v;
                                            ﹶʼ0.MTH3013(new CLS170(((CLS169)ﾞˎ2), s1), z);
                                        }
                                    }
                                    catch(Throwable throwable0) {
                                    label_153:
                                        CLS27.MTH893(throwable0);
                                    }
                                    ﾞˎ0 = null;
                                    break;
                                }
                                case 1: {
                                    ﾞˎ0 = new CLS887(contentValues0.getAsString("content"));
                                    break;
                                }
                                case -2: 
                                case 2: {
                                    ﾞˎ0 = new CLS886(new File(contentValues0.getAsString("img")));
                                    break;
                                }
                                case 3: 
                                case 34: {
                                    ﾞˎ0 = new CLS894(CLS182.MTH3474(4102077686942061365L, contentValues0), contentValues0.getAsString("voice"));
                                    break;
                                }
                                case 42: {
                                    ﾞˎ0 = new CLS1645(contentValues0.getAsString("content"));
                                    break;
                                }
                                case 0x30: {
                                    ﾞˎ0 = new CLS893(contentValues0.getAsString("lat"), contentValues0.getAsString("lng"), contentValues0.getAsString("addr"), contentValues0.getAsString("poi"));
                                    break;
                                }
                                case 43: 
                                case 62: {
                                    String s4 = contentValues0.getAsString("imgPath");
                                    ﾞˎ0 = new CLS889(CLS34.MTH1080(0x38ED819F2B3CD335L, contentValues0), s4);
                                    if(!TextUtils.isEmpty(s4)) {
                                        CLS466.MTH6507(s4, null, false, 0);
                                    }
                                    break;
                                }
                                case 49: 
                                case 0x2D000031: 
                                case 0x3A000031: {
                                    ﾞˎ0 = new CLS892(contentValues0.getAsString("content"), contentValues0.getAsByteArray("imgBuf"));
                                    break;
                                }
                                default: {
                                    if(contentValues0.containsKey("fav") && contentValues0.containsKey("localId")) {
                                        ﾞˎ0 = new CLS893(0, contentValues0.getAsString("localId"));
                                        break;
                                    }
                                    ﾞˎ0 = null;
                                    break;
                                }
                            }
                            if(ﾞˎ0 != null) {
                                ((CLS169)ﾞˎ0).MTH3233(v);
                                ﹶʼ0.MTH3013(new CLS170(((CLS169)ﾞˎ0), s1), z);
                            }
                        }
                    }
                }
                return;
            }
            case 5: {
                this.MTH2811(arr_object);
                return;
            }
            case 6: {
                CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                try {
                    if(ˎᵢ0.MTH938("multi_voice_forward_enable", true) && !CLS27.MTH901()) {
                        ContextMenu contextMenu0 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                        if(contextMenu0.findItem(20001) == null) {
                            contextMenu0.add(0, 20001, 20001, CLS27.MTH889("forward_voices_to_friend")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 9));
                        }
                    }
                    if(ˎᵢ0.MTH938("multi_broadcast_forward_enable", true) && !CLS27.MTH901()) {
                        ContextMenu contextMenu1 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                        if(contextMenu1.findItem(20002) == null) {
                            contextMenu1.add(0, 20002, 20002, CLS27.MTH889("mass_send")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 8));
                        }
                    }
                    if(ˎᵢ0.MTH938("multi_image_forward_enable", true)) {
                        if(!CLS27.MTH901()) {
                            ContextMenu contextMenu2 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                            if(contextMenu2.findItem(20000) == null) {
                                contextMenu2.add(0, 20000, 20000, CLS27.MTH889("forward_images_to_sns")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 7));
                            }
                        }
                        if(!CLS27.MTH901()) {
                            ContextMenu contextMenu3 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                            if(contextMenu3.findItem(20003) == null) {
                                contextMenu3.add(0, 20003, 20003, CLS27.MTH889("share_multi_images")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 1));
                            }
                        }
                    }
                    if(ˎᵢ0.MTH938("forward_chat2chat", true) && !CLS27.MTH901()) {
                        ContextMenu contextMenu4 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                        if(contextMenu4.findItem(20004) == null) {
                            contextMenu4.add(0, 20004, 20004, CLS27.MTH889("forward_to_friends")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 6));
                        }
                    }
                    boolean z1 = ˎᵢ0.MTH938("voice_manager", CLS412.MTH6002());
                    CLS139 ﹶʼ1 = ʻˋ0.FLD1447;
                    if(z1 && (ﹶʼ1.FLD1438.MTH6895("voice_manager") && !CLS27.MTH901())) {
                        ContextMenu contextMenu5 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                        if(contextMenu5.findItem(20005) == null) {
                            contextMenu5.add(0, 20005, 20005, CLS27.MTH889("voice_manager_fav")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 0));
                        }
                    }
                    if(ˎᵢ0.MTH938("merge_voice", CLS412.MTH6002()) && (ﹶʼ1.FLD1438.MTH6895("merge_voice") && !CLS27.MTH901())) {
                        ContextMenu contextMenu6 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                        if(contextMenu6.findItem(20006) == null) {
                            contextMenu6.add(0, 20006, 20006, CLS27.MTH889("merge_voices")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 3));
                        }
                    }
                    if(!CLS412.MTH6002()) {
                        if(ˎᵢ0.MTH938("chat_schedule_forward", false) && (ﹶʼ1.FLD1438.MTH6895("chat_schedule_forward") && !CLS27.MTH901())) {
                            ContextMenu contextMenu7 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                            if(contextMenu7.findItem(20007) == null) {
                                contextMenu7.add(0, 20007, 20007, CLS27.MTH889("schedule_forward")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 4));
                            }
                        }
                        if(ﹶʼ1.FLD1438.MTH6895("export_chat")) {
                            if(ˎᵢ0.MTH938("export_chat_msg", false) && !CLS27.MTH901()) {
                                ContextMenu contextMenu8 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                                if(contextMenu8.findItem(20008) == null) {
                                    contextMenu8.add(0, 20008, 20008, CLS27.MTH889("export_chat_msg")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 5));
                                }
                            }
                            if(ˎᵢ0.MTH938("copy_text", false) && !CLS27.MTH901()) {
                                ContextMenu contextMenu9 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                                if(contextMenu9.findItem(20009) == null) {
                                    contextMenu9.add(0, 20009, 20009, CLS27.MTH889("copy_text")).setOnMenuItemClickListener(new CLS105(ʻˋ0, ᵔʾ0, 2));
                                    return;
                                }
                            }
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 7: {
                this.MTH2808(arr_object);
                return;
            }
            case 8: {
                ʻˋ0.getClass();
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                switch(((MenuItem)ᵔʾ1.MTH3204()[0]).getItemId()) {
                    case 20000: {
                        try {
                            ʻˋ0.MTH2050(CLS629.MTH2052(ᵔʾ1));
                            return;
                        label_239:
                            ʻˋ0.MTH2058(CLS629.MTH2052(ᵔʾ1));
                            return;
                        label_241:
                            ʻˋ0.MTH2048(CLS629.MTH2052(ᵔʾ1));
                            return;
                        label_243:
                            ʻˋ0.MTH2045(CLS629.MTH2052(ᵔʾ1));
                            return;
                        label_245:
                            ʻˋ0.MTH2054(CLS629.MTH2052(ᵔʾ1));
                            return;
                        label_247:
                            ʻˋ0.MTH2042(CLS629.MTH2052(ᵔʾ1));
                            return;
                        label_249:
                            ʻˋ0.MTH2055(CLS629.MTH2052(ᵔʾ1));
                            return;
                        label_251:
                            CLS629.MTH2049(CLS629.MTH2052(ᵔʾ1));
                            return;
                        label_253:
                            ʻˋ0.MTH2059(CLS629.MTH2052(ᵔʾ1));
                            return;
                        label_255:
                            CLS629.MTH2060(CLS629.MTH2052(ᵔʾ1));
                        }
                        catch(Throwable throwable2) {
                            CLS27.MTH893(throwable2);
                        }
                        return;
                    }
                    case 20001: {
                        goto label_239;
                    }
                    case 20002: {
                        goto label_241;
                    }
                    case 20003: {
                        goto label_243;
                    }
                    case 20004: {
                        goto label_245;
                    }
                    case 20005: {
                        goto label_247;
                    }
                    case 20006: {
                        goto label_249;
                    }
                    case 20007: {
                        goto label_251;
                    }
                    case 20008: {
                        goto label_253;
                    }
                    case 20009: {
                        goto label_255;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 9: {
                ʻˋ0.getClass();
                String s5 = (String)arr_object[0];
                Object object12 = arr_object[1];
                try {
                    Field field4 = object12.getClass().getDeclaredField("args");
                    Object object13 = null;
                    if(field4 != null) {
                        field4.setAccessible(true);
                        object13 = field4.get(object12);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(((int)(((Integer)((Object[])object13)[0]))) == 0) {
                    switch(s5) {
                        case "FlipView": {
                            v5 = 1;
                            break;
                        }
                        case "ImageGalleryUI": {
                            v5 = 2;
                            break;
                        }
                        case "RecordMsgImageUI": {
                            v5 = 0;
                            break;
                        }
                        default: {
                            v5 = -1;
                        }
                    }
                    CLS29 ˎᵢ1 = ʻˋ0.FLD1445;
                    switch(v5) {
                        case 0: {
                            if(ˎᵢ1.MTH938("record_forward_enable", true)) {
                                Object[] arr_object1 = {arr_object[1], new Object[]{20000, CLS27.MTH889("forward_chat_to_sns")}};
                                CLS21.FLD76.MTH831("core", "invokeOriginalMethod", arr_object1);
                                return;
                            }
                            break;
                        }
                        case 1: {
                            if(ˎᵢ1.MTH938("forward_sns2sns", true)) {
                                Object[] arr_object2 = {arr_object[1], new Object[]{20000, CLS27.MTH889("forward_chat_to_sns")}};
                                CLS21.FLD76.MTH831("core", "invokeOriginalMethod", arr_object2);
                                return;
                            }
                            break;
                        }
                        case 2: {
                            if(!CLS182.MTH3470(0x38EDBEE62B3CD335L)) {
                                goto label_296;
                            }
                            if(ˎᵢ1.MTH938("forward_chat2sns", true)) {
                                Object[] arr_object3 = {arr_object[1], new Object[]{20000, CLS27.MTH889("forward_chat_to_sns")}};
                                CLS21.FLD76.MTH831("core", "invokeOriginalMethod", arr_object3);
                            }
                            if(ˎᵢ1.MTH938("share_chat", true)) {
                                Object[] arr_object4 = {arr_object[1], new Object[]{20001, CLS27.MTH889("share")}};
                                CLS21.FLD76.MTH831("core", "invokeOriginalMethod", arr_object4);
                                return;
                            label_296:
                                Object[] arr_object5 = {arr_object[1], new Object[]{30000, CLS404.MTH5899()}};
                                CLS21.FLD76.MTH831("core", "invokeOriginalMethod", arr_object5);
                                return;
                            }
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                }
                return;
            }
            case 10: {
                this.MTH2813(arr_object);
                return;
            }
            case 11: {
                this.MTH2803(arr_object);
                return;
            }
            case 12: {
                this.MTH2818(arr_object);
                return;
            }
            case 13: {
                this.MTH2817(arr_object);
                return;
            }
            case 14: {
                this.MTH2798(arr_object);
                return;
            }
            case 15: {
                this.MTH2799(arr_object);
                return;
            }
            case 16: {
                this.MTH2797(arr_object);
                return;
            }
            case 17: {
                this.MTH2801(arr_object);
                return;
            }
            case 18: {
                this.MTH2810(arr_object);
                return;
            }
            case 19: {
                this.MTH2807(arr_object);
                return;
            }
            case 20: {
                this.MTH2816(arr_object);
                return;
            }
            case 21: {
                this.MTH2802(arr_object);
                return;
            }
            case 22: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true)) {
                    CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                    Intent intent2 = ((Activity)ᵔʾ2.MTH3205()).getIntent();
                    String s6 = intent2.getStringExtra("key_to_user");
                    if(intent2.hasExtra("wexposed")) {
                        ʻˋ0.MTH2043(ᵔʾ2, s6);
                    }
                }
                return;
            }
            case 23: {
                this.MTH2809(arr_object);
                return;
            }
            case 24: {
                this.MTH2815(arr_object);
                return;
            }
            case 25: {
                this.MTH2804(arr_object);
                return;
            }
            case 26: {
                this.MTH2805(arr_object);
                return;
            }
            case 27: {
                this.MTH2812(arr_object);
                return;
            }
            case 28: {
                this.MTH2806(arr_object);
                return;
            }
            default: {
                this.MTH2814(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2801(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        int v = (int)(((Integer)arr_object[0]));
        int v1 = (int)(((Integer)arr_object[1]));
        CLS98 ﾞᐧ0 = (CLS98)arr_object[2];
        Object object0 = arr_object[3];
        int v2 = CLS166.MTH3181(object0, "field_type");
        if(v2 == 1 || v2 == 2 || v2 == 3 || v2 == 5 || (v2 == 7 || v2 == 16)) {
        label_11:
            String s = v2 == 3 || v2 == 8 || v2 == 18 ? "" : CLS27.MTH889("forward_to_moments");
            if(!TextUtils.isEmpty(s) && (ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true) && ﾞᐧ0.MTH1774(v) == null && CLS27.MTH894("favClass2") != null)) {
                CLS743 יʻ0 = new CLS743(ʻˋ0, object0, 5);
                ﾞᐧ0.MTH1770(v1, v, s, CLS27.MTH897("icons_outlined_share"), v).setOnMenuItemClickListener(new CLS142(((CLS3)יʻ0), 17));
                CLS882 ﾞٴ0 = new CLS882(((CLS3)יʻ0), 17);
                CLS21.FLD76.MTH824("on_favsearch_menu_click", v, ((CLS35)ﾞٴ0));
            }
        }
        else {
            switch(v2) {
                case 4: {
                    goto label_11;
                }
                case 8: 
                case 18: {
                    if(ʻˋ0.FLD1447.FLD1438.MTH6895("fav_wenote")) {
                        goto label_11;
                    }
                    break;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2802(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        if(((MenuItem)ᵔʾ0.MTH3204()[0]).getItemId() == 20000) {
            Object object0 = null;
            ᵔʾ0.MTH3207(null);
            try {
                long v = ((Activity)CLS164.MTH3176(0, CLS164.MTH3176(0, ᵔʾ0.MTH3205()))).getIntent().getLongExtra("key_detail_info_id", 0L);
                CLS449.FLD4410.getClass();
                Cursor cursor0 = CLS449.FLD4410.MTH6388(String.valueOf(v));
                if(cursor0 != null) {
                    Class class0 = CLS27.MTH894("favItemClass");
                    if(class0 != null) {
                        cursor0.moveToFirst();
                        object0 = CLS166.MTH3188(class0, new Object[0]);
                        CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                    }
                }
                ʻˋ0.MTH2047(object0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2803(Object[] arr_object) {
        if(!this.FLD1247.FLD1447.FLD1407.MTH5947("_config_fwd_fav")) {
            int v = (int)(((Integer)arr_object[0]));
            ContextMenu contextMenu0 = (ContextMenu)arr_object[1];
            Object object0 = arr_object[2];
            Object object1 = arr_object[3];
            switch(CLS166.MTH3181(object0, "field_type")) {
                case 4: 
                case 16: {
                    if(contextMenu0.findItem(v) == null) {
                        Class class0 = CLS27.MTH894("favClass2");
                        if(class0 != null) {
                            CLS693 ˉᵎ0 = new CLS693(class0, object1, 1);
                            contextMenu0.add(0, v, 0, CLS27.MTH889("share")).setOnMenuItemClickListener(new CLS142(((CLS3)ˉᵎ0), 14));
                            CLS882 ﾞٴ0 = new CLS882(((CLS3)ˉᵎ0), 14);
                            CLS21.FLD76.MTH824("onfavmenu_click", v, ((CLS35)ﾞٴ0));
                        }
                    }
                    break;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2804(Object[] arr_object) {
        int v;
        this.FLD1247.getClass();
        if(this.FLD1247.FLD1445.MTH938("favorite_forward_enable", true)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            try {
                v = CLS166.MTH3181(ᵔʾ0.MTH3204()[0], "field_type");
            }
            catch(Throwable unused_ex) {
                try {
                    v = (int)(((Integer)CLS166.MTH3195(ᵔʾ0.MTH3204()[0], "getType", new Object[0])));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    v = -1;
                }
            }
            if(v == 3) {
                ᵔʾ0.MTH3207(Boolean.FALSE);
            }
        }
    }

    private final void MTH2805(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        String s = CLS370.MTH5289(4102100626362389301L);
        if(ʻˋ0.FLD1445.MTH938(s, true)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            Activity activity0 = (Activity)CLS164.MTH3175(ᵔʾ0.MTH3205(), CLS27.MTH897(CLS370.MTH5289(4102100729441604405L)));
            if(activity0 != null) {
                String s1 = CLS370.MTH5289(4102100780981211957L);
                Intent intent0 = activity0.getIntent();
                if(intent0 != null && intent0.hasExtra(CLS370.MTH5289(4102100785276179253L))) {
                    s1 = intent0.getStringExtra(CLS370.MTH5289(4102100836815786805L));
                }
                if(!TextUtils.isEmpty(s1)) {
                    ʻˋ0.MTH2043(ᵔʾ0, s1);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2806(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        if(ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            Object object0 = CLS182.MTH3492(4102121418299069237L, ᵔʾ0.MTH3205());
            if(object0 != null && CLS166.MTH3183(object0, CLS27.MTH897("FavTopSearchUIC_field1_field1"))) {
                String s = (String)CLS182.MTH3492(4102100205455594293L, object0);
                if(!TextUtils.isEmpty(s)) {
                    ʻˋ0.MTH2043(ᵔʾ0, s);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2807(Object[] arr_object) {
        Object object1;
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        if(ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true) && CLS27.MTH894("favClass2") != null) {
            Object object0 = arr_object[0];
            try {
                Field field0 = object0.getClass().getDeclaredField("thisObject");
                object1 = null;
                if(field0 != null) {
                    field0.setAccessible(true);
                    object1 = field0.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            ((ListView)CLS182.MTH3492(4102124205732844341L, object1)).setOnItemLongClickListener(new CLS116(0, ʻˋ0));
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2808(Object[] arr_object) {
        Object object1;
        CLS629 ʻˋ0 = this.FLD1247;
        CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
        Object object0 = arr_object[0];
        try {
            Field field0 = object0.getClass().getDeclaredField("args");
            object1 = null;
            if(field0 != null) {
                field0.setAccessible(true);
                object1 = field0.get(object0);
            }
        }
        catch(Throwable unused_ex) {
        }
        CLS98 ﾞᐧ0 = new CLS98(((Object[])object1)[0]);
        try {
            if(ˎᵢ0.MTH938("multi_voice_forward_enable", true) && ﾞᐧ0.MTH1774(20001) == null) {
                ﾞᐧ0.MTH1772(20001, CLS27.MTH889("forward_voices_to_friend"));
            }
            if(ˎᵢ0.MTH938("multi_broadcast_forward_enable", true) && ﾞᐧ0.MTH1774(20002) == null) {
                ﾞᐧ0.MTH1772(20002, CLS27.MTH889("mass_send"));
            }
            if(ˎᵢ0.MTH938("multi_image_forward_enable", true)) {
                if(ﾞᐧ0.MTH1774(20000) == null) {
                    ﾞᐧ0.MTH1772(20000, CLS27.MTH889("forward_images_to_sns"));
                }
                if(ﾞᐧ0.MTH1774(20003) == null) {
                    ﾞᐧ0.MTH1772(20003, CLS27.MTH889("share_multi_images"));
                }
            }
            if(ˎᵢ0.MTH938("forward_chat2chat", true) && ﾞᐧ0.MTH1774(20004) == null) {
                ﾞᐧ0.MTH1772(20004, CLS27.MTH889("forward_to_friends"));
            }
            boolean z = ˎᵢ0.MTH938("voice_manager", CLS412.MTH6002());
            CLS139 ﹶʼ0 = ʻˋ0.FLD1447;
            if(z && (ﹶʼ0.FLD1438.MTH6895("voice_manager") && ﾞᐧ0.MTH1774(20005) == null)) {
                ﾞᐧ0.MTH1772(20005, CLS27.MTH889("voice_manager_fav"));
            }
            if(ˎᵢ0.MTH938("merge_voice", CLS412.MTH6002()) && (ﹶʼ0.FLD1438.MTH6895("merge_voice") && ﾞᐧ0.MTH1774(20006) == null)) {
                ﾞᐧ0.MTH1772(20006, CLS27.MTH889("merge_voices"));
            }
            if(!CLS412.MTH6002()) {
                if(ˎᵢ0.MTH938("chat_schedule_forward", false) && (ﹶʼ0.FLD1438.MTH6895("chat_schedule_forward") && ﾞᐧ0.MTH1774(20007) == null)) {
                    ﾞᐧ0.MTH1772(20007, CLS27.MTH889("schedule_forward"));
                }
                if(ﹶʼ0.FLD1438.MTH6895("export_chat")) {
                    if(ˎᵢ0.MTH938("export_chat_msg", false) && ﾞᐧ0.MTH1774(20008) == null) {
                        ﾞᐧ0.MTH1772(20008, CLS27.MTH889("export_chat_msg"));
                    }
                    if(ˎᵢ0.MTH938("copy_text", false) && ﾞᐧ0.MTH1774(20009) == null) {
                        ﾞᐧ0.MTH1772(20009, CLS27.MTH889("copy_text"));
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2809(Object[] arr_object) {
        Object object1;
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        Object object0 = arr_object[0];
        try {
            Field field0 = object0.getClass().getDeclaredField("args");
            object1 = null;
            if(field0 != null) {
                field0.setAccessible(true);
                object1 = field0.get(object0);
            }
        }
        catch(Throwable unused_ex) {
        }
        ʻˋ0.FLD549 = ((Object[])object1)[0];
    }

    // 此方法包含解密的字符串
    private final void MTH2810(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        int v = (int)(((Integer)arr_object[0]));
        int v1 = (int)(((Integer)arr_object[1]));
        CLS98 ﾞᐧ0 = (CLS98)arr_object[2];
        Object object0 = arr_object[3];
        int v2 = CLS166.MTH3181(object0, "field_type");
        CLS139 ﹶʼ0 = ʻˋ0.FLD1447;
        if(v2 == 1 || v2 == 2 || v2 == 3 || v2 == 5 || (v2 == 4 || v2 == 7 || v2 == 16) || (v2 == 8 || v2 == 18) && ﹶʼ0.FLD1438.MTH6895("fav_wenote")) {
            String s = "";
            CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
            switch(v2) {
                case 3: {
                    if(ﹶʼ0.FLD1438.MTH6895("fav_voice_mass_send")) {
                        goto label_14;
                    }
                    break;
                }
                case 1: 
                case 2: 
                case 4: 
                case 16: {
                label_14:
                    if(ˎᵢ0.MTH938("broadcast_forward_enable", true)) {
                        s = CLS27.MTH889("mass_send");
                    }
                }
            }
            if(!TextUtils.isEmpty(s) && ˎᵢ0.MTH938("favorite_forward_enable", true) && ﾞᐧ0.MTH1774(v) == null && CLS27.MTH894("favClass2") != null) {
                CLS743 יʻ0 = new CLS743(ʻˋ0, object0, 3);
                ﾞᐧ0.MTH1770(v1, v, s, CLS27.MTH897("icons_outlined_share"), v).setOnMenuItemClickListener(new CLS142(((CLS3)יʻ0), 15));
                CLS882 ﾞٴ0 = new CLS882(((CLS3)יʻ0), 15);
                CLS21.FLD76.MTH824("on_favsearch_menu_click", v, ((CLS35)ﾞٴ0));
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2811(Object[] arr_object) {
        int v7;
        int v5;
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        String s = (String)arr_object[0];
        Object object0 = arr_object[1];
        long v = CLS166.MTH3185(object0, "field_msgSvrId");
        long v1 = CLS166.MTH3185(object0, "field_msgId");
        String s1 = (String)CLS166.MTH3194(object0, "field_imgPath");
        int v2 = CLS166.MTH3181(object0, "field_type");
        String s2 = (String)CLS166.MTH3194(object0, "field_content");
        String s3 = (String)CLS166.MTH3194(object0, "field_talker");
        int v3 = CLS166.MTH3181(object0, "field_isSend");
        long v4 = CLS166.MTH3185(object0, "field_createTime");
        try {
            switch(s) {
                case "forward": {
                    v5 = 0;
                    break;
                }
                case "multi_select": {
                    v5 = 4;
                    break;
                }
                case "play_voice": {
                    v5 = 1;
                    break;
                }
                case "repeat_msg_send": {
                    v5 = 2;
                    break;
                }
                case "schedule_forward": {
                    v5 = 3;
                    break;
                }
                case "transcode": {
                    v5 = 5;
                    break;
                }
                default: {
                    v5 = -1;
                }
            }
            String s4 = "";
            switch(v5) {
                case 0: {
                    if(v2 == 1) {
                        s4 = CLS426.MTH6106(v3, s2, s3);
                    }
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    int v6 = v2 == 49 ? Integer.parseInt(((String)CLS392.MTH5633(s2, "msg").get(".msg.appmsg.type"))) : -1;
                    CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
                    if((v2 == 3 || v2 == 43 || (v2 == 1 || v2 == 49 || v2 == 62 || v2 == 0x1000031 || v2 == 0x31000031)) && ˎᵢ0.MTH938("forward_chat2sns", true)) {
                        if(v6 != 6 && v6 != 24 && v6 != 33 && v6 != 74) {
                            linkedHashMap0.put(CLS27.MTH889("forward_chat_to_sns"), "forward_chat_to_sns");
                        }
                        linkedHashMap0.put(CLS27.MTH889("forward_to_friends"), "forward_chat_to_friends");
                    }
                    if((v2 == 0x3E000031 || v2 == 0x41000031 || (v2 == 0x54000031 || v2 == 0x55000031)) && ˎᵢ0.MTH938("forward_chat2chat", true)) {
                        linkedHashMap0.put(CLS27.MTH889("forward_to_friends"), "forward_chat_to_friends");
                    }
                    if(v2 == 34 && ˎᵢ0.MTH938("voice_forward_enable", true)) {
                        linkedHashMap0.put(CLS27.MTH889("forward_to_friends"), "voice_forward_to_friends");
                    }
                    if(v2 == 42 && ˎᵢ0.MTH938("friendcard_forward_enable", true) && !TextUtils.isEmpty(s2)) {
                        linkedHashMap0.put(CLS27.MTH889("forward_to_friends"), "friendcard_forward");
                    }
                    if(v2 == 0x2D000031 || v2 == 0x3A000031) {
                        if(ˎᵢ0.MTH938("forward_chat2chat", true)) {
                            linkedHashMap0.put(CLS27.MTH889("forward_to_friends"), "forward_chat_to_friends");
                        }
                        if(ˎᵢ0.MTH938("forward_chat2sns", true)) {
                            linkedHashMap0.put(CLS27.MTH889("forward_chat_to_sns"), "forward_chat_to_sns");
                        }
                    }
                    switch(v2) {
                        case 1: 
                        case 3: 
                        case 34: 
                        case 43: 
                        case 62: 
                        case 0x1000031: 
                        case 0x31000031: {
                            if(ˎᵢ0.MTH938("share_chat", true)) {
                                linkedHashMap0.put(CLS27.MTH889((v2 == 34 ? "export_voice" : "share")), "export");
                            }
                        }
                    }
                    CLS139 ﹶʼ0 = ʻˋ0.FLD1447;
                    if(v2 == 43 || v2 == 62) {
                        v7 = v6;
                        if(ﹶʼ0.FLD1438.MTH6895("extract_vid_audio") && ˎᵢ0.MTH938("forward_vid_audio", true)) {
                            linkedHashMap0.put(CLS27.MTH889("forward_vid_audio"), "extract_audio");
                        }
                    }
                    else {
                        v7 = v6;
                    }
                    if((v2 == 1 || v2 == 34 && ﹶʼ0.FLD1438.MTH6895("forward_mass_send_voice") || (v2 == 3 || v2 == 43 || v2 == 62 || v2 == 0x1000031 || v2 == 0x31000031)) && ˎᵢ0.MTH938("broadcast_forward_enable", true)) {
                        linkedHashMap0.put(CLS27.MTH889("mass_send"), "mass_send");
                    }
                    switch(v2) {
                        case 1: 
                        case 3: 
                        case 34: 
                        case 42: 
                        case 43: 
                        case 49: 
                        case 62: 
                        case 0x1000031: 
                        case 0x2D000031: 
                        case 0x31000031: 
                        case 0x3A000031: 
                        case 0x3E000031: 
                        case 0x41000031: 
                        case 0x54000031: 
                        case 0x55000031: {
                            if(ﹶʼ0.FLD1438.MTH6895("tag_forward") && ˎᵢ0.MTH938("forward_chat2chat", true)) {
                                linkedHashMap0.put(CLS27.MTH889("tag_forward"), "tag_forward");
                            }
                        }
                    }
                    if(v2 == 34 && ˎᵢ0.MTH938("voice_manager", CLS412.MTH6002()) && ﹶʼ0.FLD1438.MTH6895("voice_manager")) {
                        linkedHashMap0.put(CLS27.MTH889("voice_manager_fav"), "voice_manager");
                    }
                    if(v2 == 49) {
                        if(ˎᵢ0.MTH938("share_chat", true)) {
                            linkedHashMap0.put(CLS27.MTH889("share"), "share_link");
                        }
                        if(ˎᵢ0.MTH938("forward_chat2chat", true)) {
                            linkedHashMap0.put(CLS27.MTH889("forward_link"), "forward_link");
                        }
                    }
                    if(!CLS412.MTH6002() && v2 == 1 && ˎᵢ0.MTH938("send_external_video_shortcut", false) && ﹶʼ0.FLD1438.MTH6895("sns_external_video") && CLS21.FLD76.MTH830("is_vid_url_parser_available", new Object[]{s4})) {
                        linkedHashMap0.put(CLS27.MTH889("send_external_video"), "send_external_video");
                    }
                    if(!linkedHashMap0.isEmpty()) {
                        CLS523.MTH7134(((CLS140)ʻˋ0).MTH3042(), CLS27.MTH889("forward") + " (" + CLS27.MTH889("appname") + ")", linkedHashMap0, ((CLS7)new CLS675(ʻˋ0, object0, v2, s3, s2, v3, s1, v, v1, s4, v7)), new CLS347(((CLS140)ʻˋ0).MTH3042(), new ArrayList(linkedHashMap0.keySet())));
                        return;
                    }
                    break;
                }
                case 1: {
                    if(v2 == 34) {
                        Activity activity1 = ((CLS140)ʻˋ0).MTH3042();
                        try {
                            CLS476.MTH6641(activity1, new File(CLS66.MTH1483(s1)));
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                        return;
                    }
                    break;
                }
                case 2: {
                    CLS466.MTH6524(object0);
                    return;
                }
                case 3: {
                    CLS309.FLD3190.getClass();
                    CLS603 ᐧⁱ0 = (CLS603)CLS309.MTH4946(16);
                    ᐧⁱ0.FLD467.add(v1);
                    ᐧⁱ0.FLD497 = true;
                    CLS21.FLD76.MTH818("showAddTaskScheduleDialog", new Object[]{ᐧⁱ0});
                    return;
                }
                case 4: {
                    Activity activity0 = ((CLS140)ʻˋ0).MTH3042();
                    CLS568 יᐧ0 = new CLS568(ʻˋ0, s3, 6);
                    String s5 = CLS27.MTH904();
                    CLS523.MTH7145(activity0, CLS27.MTH889("multi_select"), ((CLS17)new CLS1555(s3, activity0, v4, CLS371.FLD3470, s5)), ((CLS11)new CLS1490(יᐧ0)));
                    return;
                }
                case 5: {
                    CLS679 ˈʽ0 = new CLS679(ʻˋ0, 4);
                    CLS66.MTH1470(CLS166.MTH3185(object0, "field_msgId"), CLS392.MTH5633(((String)CLS166.MTH3194(object0, "field_content")), "msg"), ((CLS17)ˈʽ0));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2812(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        if(ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            Activity activity0 = (Activity)CLS164.MTH3175(ᵔʾ0.MTH3205(), CLS27.MTH897("FavFilterUI"));
            if(activity0 != null) {
                String s = "";
                Intent intent0 = activity0.getIntent();
                if(intent0 != null && intent0.hasExtra("key_to_user")) {
                    s = intent0.getStringExtra("key_to_user");
                }
                if(!TextUtils.isEmpty(s)) {
                    ʻˋ0.MTH2043(ᵔʾ0, s);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2813(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        if(!ʻˋ0.FLD1447.FLD1407.MTH5947("_config_fwd_fav")) {
            int v = (int)(((Integer)arr_object[0]));
            ContextMenu contextMenu0 = (ContextMenu)arr_object[1];
            Object object0 = arr_object[2];
            Object object1 = arr_object[3];
            int v1 = CLS166.MTH3181(object0, "field_type");
            if(contextMenu0.findItem(v) == null) {
                Class class0 = CLS27.MTH894("favClass2");
                if(class0 != null) {
                    CLS734 ˑˉ0 = new CLS734(ʻˋ0, v1, object0, class0, object1, 0);
                    contextMenu0.add(0, v, 0, (v1 == 3 || v1 == 8 || v1 == 18 ? CLS27.MTH889("forward") + " (" + CLS27.MTH889("appname") + ")" : CLS27.MTH889("forward_chat_to_sns"))).setOnMenuItemClickListener(new CLS142(((CLS3)ˑˉ0), 7));
                    CLS882 ﾞٴ0 = new CLS882(((CLS3)ˑˉ0), 7);
                    CLS21.FLD76.MTH824("onfavmenu_click", v, ((CLS35)ﾞٴ0));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2814(Object[] arr_object) {
        this.FLD1247.getClass();
        if(this.FLD1247.FLD1445.MTH938("favorite_forward_enable", true)) {
            Object object0 = arr_object[0];
            CLS167 ᵔʾ0 = new CLS167(object0);
            Object object1 = CLS182.MTH3492(4102120920082862901L, ᵔʾ0.MTH3205());
            if(object1 != null && !CLS166.MTH3183(object1, CLS27.MTH897("FavTopSearchUIC_field1_field1"))) {
                View view0 = (View)ᵔʾ0.MTH3204()[1];
                if(view0 != null) {
                    Object object2 = view0.getTag();
                    if(object2 != null) {
                        Object object3 = CLS182.MTH3492(0x38EDA9F32B3CD335L, object2);
                        if(object3 != null) {
                            ContextMenu contextMenu0 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                            int v = ((AdapterView.AdapterContextMenuInfo)ᵔʾ0.MTH3204()[2]).position;
                            CLS21.FLD76.MTH823("b.favsearch.menu.oncreate", new Object[]{20000, v, contextMenu0, object3, object0});
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2815(Object[] arr_object) {
        this.FLD1247.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        try {
            if(CLS166.MTH3195(ᵔʾ0.MTH3204()[0], "findItem", new Object[]{20000}) == null && (this.FLD1247.FLD549 != null && ((int)(((Integer)CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3194(this.FLD1247.FLD549, CLS27.MTH897("FavMediaGalleryUI_adapterField")), "getItem", new Object[]{CLS166.MTH3181(this.FLD1247.FLD549, CLS27.MTH897("FavMediaGalleryUI_indexField"))}), CLS27.MTH897("galleryItem_method2"), new Object[0])))) == 4)) {
                CLS166.MTH3195(ᵔʾ0.MTH3204()[0], CLS27.MTH897("recordSightMethod2"), new Object[]{20000, CLS27.MTH889("forward_chat_to_sns")});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    private final void MTH2816(Object[] arr_object) {
        Object object1;
        this.FLD1247.getClass();
        Object object0 = arr_object[0];
        try {
            String s = CLS370.MTH5289(0x38ED8FB62B3CD335L);
            try {
                Field field0 = object0.getClass().getDeclaredField(s);
                object1 = null;
                if(field0 != null) {
                    field0.setAccessible(true);
                    object1 = field0.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            CLS166.MTH3195(((Object[])object1)[0], CLS27.MTH897(CLS370.MTH5289(4102177914298880821L)), new Object[]{20000, CLS27.MTH889(CLS370.MTH5289(4102177995903259445L))});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2817(Object[] arr_object) {
        Object object1;
        CLS629 ʻˋ0 = this.FLD1247;
        ʻˋ0.getClass();
        if(ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true)) {
            Object object0 = arr_object[0];
            try {
                Field field0 = object0.getClass().getDeclaredField("thisObject");
                object1 = null;
                if(field0 != null) {
                    field0.setAccessible(true);
                    object1 = field0.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            WeakReference weakReference0 = new WeakReference(((Activity)object1));
            ʻˋ0.FLD551 = weakReference0;
            Intent intent0 = ((Activity)weakReference0.get()).getIntent();
            intent0.putExtra("key_fav_item_id", "");
            intent0.putExtra("wexposed", true);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2818(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD1247;
        CLS139 ﹶʼ0 = ʻˋ0.FLD1447;
        if(!ﹶʼ0.FLD1407.MTH5947("_config_mass_send")) {
            Class class0 = CLS27.MTH894("favClass2");
            if(class0 != null) {
                int v = (int)(((Integer)arr_object[0]));
                ContextMenu contextMenu0 = (ContextMenu)arr_object[1];
                Object object0 = arr_object[2];
                Object object1 = arr_object[3];
                int v1 = CLS166.MTH3181(object0, "field_type");
                switch(v1) {
                    case 1: 
                    case 2: {
                    label_14:
                        if(ʻˋ0.FLD1445.MTH938("broadcast_forward_enable", true) && contextMenu0.findItem(v) == null) {
                            CLS734 ˑˉ0 = new CLS734(ʻˋ0, v1, object0, class0, object1, 2);
                            contextMenu0.add(0, v, 0, CLS27.MTH889("mass_send")).setOnMenuItemClickListener(new CLS142(((CLS3)ˑˉ0), 10));
                            CLS882 ﾞٴ0 = new CLS882(((CLS3)ˑˉ0), 10);
                            CLS21.FLD76.MTH824("onfavmenu_click", v, ((CLS35)ﾞٴ0));
                        }
                        break;
                    }
                    case 3: {
                        if(ﹶʼ0.FLD1438.MTH6895("fav_voice_mass_send")) {
                            goto label_14;
                        }
                        else {
                        label_13:
                            if(v1 == 4 || v1 == 16) {
                                goto label_14;
                            }
                        }
                        break;
                    }
                    default: {
                        goto label_13;
                    }
                }
            }
        }
    }
}

