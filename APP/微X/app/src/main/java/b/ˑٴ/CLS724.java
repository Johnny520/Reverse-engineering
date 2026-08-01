// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS6;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS565;
import b.ʾᵢ.CLS574;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS92;
import b.ˈˈ.CLS98;
import b.ˊﾞ.CLS612;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS1255;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1279;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS443;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS485.CLS484;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public final class CLS724 implements CLS35 {
    public final int FLD878;
    public final CLS629 FLD879;

    public CLS724(CLS629 ʻˋ0, int v) {
        this.FLD878 = v;
        this.FLD879 = ʻˋ0;
        super();
    }

    // 此方法包含解密的字符串
    private final void MTH2387(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        try {
            int v = ((MenuItem)ᵔʾ0.MTH3204()[0]).getItemId();
            if(v == 20000 || v == 20001 || v == 20002 || v == 30000) {
                ᵔʾ0.MTH3207(null);
                Object object0 = TextUtils.isEmpty(CLS27.MTH897("imgGalleryField1")) ? CLS164.MTH3175(ᵔʾ0.MTH3205(), CLS27.MTH897("ImageGalleryUI")) : CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("imgGalleryField1"));
                if(object0 != null) {
                    int v1 = (int)(((Integer)CLS166.MTH3195(object0, CLS27.MTH897("getCurrentItem"), new Object[0])));
                    Object object1 = CLS166.MTH3195(CLS166.MTH3194(object0, CLS27.MTH897("imgGalleryField2")), CLS27.MTH897("imgGalleryMethod2"), new Object[]{v1});
                    long v2 = CLS166.MTH3185(object1, "field_msgSvrId");
                    Object object2 = CLS166.MTH3194(object1, "field_imgPath");
                    CLS661 ʿʼ0 = new CLS661(ʻˋ0, CLS166.MTH3181(object1, "field_type"), v2, ((String)object2));
                    if(v == 30000) {
                        CLS71 ˆٴ0 = new CLS71(((CLS140)ʻˋ0).MTH3042(), CLS404.MTH5899());
                        if(ˎᵢ0.MTH938("forward_chat2sns", true)) {
                            ˆٴ0.MTH1572("forward_chat_to_sns", ((CLS3)new CLS739(((CLS12)ʿʼ0), 0)));
                        }
                        if(ˎᵢ0.MTH938("share_chat", true)) {
                            ˆٴ0.MTH1572("share", ((CLS3)new CLS739(((CLS12)ʿʼ0), 1)));
                        }
                        ˆٴ0.MTH1573();
                        return;
                    }
                    ʿʼ0.MTH791(v);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2388(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        ʻˋ0.getClass();
        if("sns_save".equals(((String)arr_object[0]))) {
            long v = (long)(((Long)arr_object[1]));
            int v1 = ʻˋ0.FLD1446.MTH5755(v);
            if(v1 == 1) {
                CLS466.MTH6529(((CLS6)new CLS679(ʻˋ0, 2)), CLS66.MTH1508(("sns_table_" + v)), false);
                return;
            }
            if(v1 == 15) {
                CLS466.MTH6545(("sns_table_" + v), ((CLS13)new CLS679(ʻˋ0, 3)));
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2389(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        ʻˋ0.getClass();
        String s = (String)arr_object[0];
        String s1 = (String)arr_object[1];
        if("voice_manager".equals(s)) {
            CLS476.MTH6640(((CLS140)ʻˋ0).MTH3042(), ((CLS7)new CLS1255(ʻˋ0, s1, 21)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        String s16;
        Object object14;
        Object object6;
        Object object0 = null;
        CLS629 ʻˋ0 = this.FLD879;
        switch(this.FLD878) {
            case 0: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true)) {
                    Object object1 = arr_object[0];
                    CLS167 ᵔʾ0 = new CLS167(object1);
                    Object object2 = CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH892("FavSearchManager_field1", CLS27.MTH897("FavTopSearchUIC_field1")));
                    if(object2 != null && !CLS166.MTH3183(object2, CLS27.MTH897("FavTopSearchUIC_field1_field1"))) {
                        View view0 = (View)ᵔʾ0.MTH3204()[1];
                        if(view0 != null) {
                            Object object3 = view0.getTag();
                            if(object3 != null) {
                                Object object4 = CLS182.MTH3492(0x38EDA95F2B3CD335L, object3);
                                if(object4 != null) {
                                    CLS98 ﾞᐧ0 = new CLS98(ᵔʾ0.MTH3204()[0]);
                                    int v = CLS166.MTH3181(ᵔʾ0.MTH3205(), CLS27.MTH897("FavSearchManager_positionField"));
                                    CLS21.FLD76.MTH823("b.favsearch.menu.oncreate2", new Object[]{20000, v, ﾞᐧ0, object4, object1});
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true)) {
                    Object object5 = arr_object[0];
                    try {
                        Field field0 = object5.getClass().getDeclaredField("thisObject");
                        object6 = null;
                        if(field0 != null) {
                            field0.setAccessible(true);
                            object6 = field0.get(object5);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    Object object7 = CLS182.MTH3492(4102119747556791093L, object6);
                    if(object7 != null && !CLS166.MTH3183(object7, CLS27.MTH897("FavTopSearchUIC_field1_field1"))) {
                        try {
                            Field field1 = object5.getClass().getDeclaredField("args");
                            if(field1 != null) {
                                field1.setAccessible(true);
                                object0 = field1.get(object5);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        try {
                            int v1 = ((MenuItem)((Object[])object0)[0]).getItemId();
                            CLS21.FLD76.MTH834("on_favsearch_menu_click", v1, new Object[0]);
                            return;
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                }
                return;
            }
            case 2: {
                ʻˋ0.getClass();
                int v2 = (int)(((Integer)arr_object[0]));
                int v3 = (int)(((Integer)arr_object[1]));
                ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
                Object object8 = arr_object[3];
                int v4 = CLS166.MTH3181(object8, "field_type");
                if(v4 == 1 || v4 == 2 || v4 == 3 || v4 == 5 || v4 == 7) {
                label_51:
                    String s = v4 == 7 ? "" : CLS27.MTH889("forward") + " (" + CLS27.MTH889("appname") + ")";
                    if(!TextUtils.isEmpty(s) && (ʻˋ0.FLD1445.MTH938("favorite_forward_enable", true) && contextMenu0.findItem(v2) == null && CLS27.MTH894("favClass2") != null)) {
                        CLS743 יʻ0 = new CLS743(ʻˋ0, object8, 1);
                        contextMenu0.add(v3, v2, 0, s).setOnMenuItemClickListener(new CLS142(((CLS3)יʻ0), 8));
                        CLS882 ﾞٴ0 = new CLS882(((CLS3)יʻ0), 8);
                        CLS21.FLD76.MTH824("on_favsearch_menu_click", v2, ((CLS35)ﾞٴ0));
                    }
                }
                else {
                    switch(v4) {
                        case 4: 
                        case 16: {
                            goto label_51;
                        }
                        case 8: 
                        case 18: {
                            if(ʻˋ0.FLD1447.FLD1438.MTH6895("fav_wenote")) {
                                goto label_51;
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
            case 3: {
                ʻˋ0.getClass();
                CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
                if(ˎᵢ0.MTH938("forward_sns2sns", true) && CLS27.MTH894("SnsPathClass") != null) {
                    CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                    Object object9 = CLS182.MTH3470(0x38EDA49C2B3CD335L) ? CLS164.MTH3175(ᵔʾ1.MTH3205(), CLS27.MTH897("SnsOnlineVideoActivity")) : CLS182.MTH3492(4102115916445963061L, ᵔʾ1.MTH3205());
                    if(((Activity)object9) != null) {
                        String s1 = ((Activity)object9).getIntent().getStringExtra("intent_localid");
                        CLS764 ـᵢ0 = new CLS764(ʻˋ0, ((Activity)object9), Long.parseLong(s1.substring(s1.lastIndexOf("_") + 1)), 0);
                        ContextMenu contextMenu1 = (ContextMenu)ᵔʾ1.MTH3204()[0];
                        if(ˎᵢ0.MTH938("forward_sns2sns", true)) {
                            contextMenu1.add(CLS27.MTH889("forward_chat_to_sns")).setOnMenuItemClickListener(new CLS134(1, ـᵢ0));
                        }
                    }
                }
                return;
            }
            case 4: {
                ʻˋ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add("FlipView");
                arrayList0.add("SnsOnlineVideoActivity");
                arrayList0.add("SnsGalleryUI");
                arrayList0.add("SnsBaseGalleryUI");
                if(CLS27.MTH890("SnsOnlineVideoActivity_showLongPressMenu_cls")) {
                    arrayList0.add(CLS27.MTH897("SnsOnlineVideoActivity_showLongPressMenu_cls"));
                }
                if(!TextUtils.isEmpty(CLS164.MTH3170(arrayList0))) {
                    CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                    try {
                        int v5 = CLS27.MTH903(0, "icons_outlined_share");
                        if(ʻˋ0.FLD1445.MTH938("forward_sns2sns", true) && CLS166.MTH3195(ᵔʾ2.MTH3204()[0], "findItem", new Object[]{20000}) == null) {
                            CLS166.MTH3195(ᵔʾ2.MTH3204()[0], CLS27.MTH897("imgGalleryMethod3"), new Object[]{20000, CLS27.MTH889("forward_chat_to_sns"), v5, 0});
                            return;
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 5: {
                ʻˋ0.getClass();
                CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                MenuItem menuItem0 = (MenuItem)ᵔʾ3.MTH3204()[0];
                switch(menuItem0.getItemId()) {
                    case 20000: 
                    case 20001: {
                        ᵔʾ3.MTH3207(null);
                        try {
                            Activity activity0 = ((CLS140)ʻˋ0).MTH3042();
                            if(activity0 != null) {
                                String s2 = "";
                                Intent intent0 = activity0.getIntent();
                                if(intent0 != null) {
                                    if(CLS502.MTH6934(CLS412.MTH6009(activity0), new String[]{"SnsGalleryUI", "SnsBaseGalleryUI"})) {
                                        Object object10 = CLS27.MTH890("SnsGalleryUI_snsInfoFlip") ? CLS166.MTH3194(activity0, CLS27.MTH897("SnsGalleryUI_snsInfoFlip")) : CLS164.MTH3175(activity0, "SnsInfoFlip");
                                        if(object10 != null) {
                                            s2 = (String)CLS166.MTH3195(object10, CLS27.MTH892("SnsInfoFlip_getSelectId", "getSelectId"), new Object[0]);
                                        }
                                    }
                                    if(!TextUtils.isEmpty(s2)) {
                                    label_112:
                                        if(!TextUtils.isEmpty(s2)) {
                                            long v7 = Long.parseLong(s2.substring(s2.lastIndexOf("_") + 1));
                                            ContentValues contentValues0 = CLS66.MTH1430(v7);
                                            if(contentValues0 != null) {
                                                int v8 = (int)contentValues0.getAsInteger("type");
                                                if(menuItem0.getItemId() == 20001) {
                                                    CLS443.MTH6317(activity0, v7);
                                                    return;
                                                }
                                                Object object11 = CLS66.MTH1516(s2);
                                                String s3 = CLS66.MTH1399(object11);
                                                if(v8 == 15) {
                                                    CLS466.MTH6518(s2, object11, s3);
                                                    return;
                                                }
                                                if(v8 == 1) {
                                                    CLS466.MTH6543(activity0, s2, s3);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    else if(intent0.hasExtra("sns_gallery_localId")) {
                                        try {
                                            s2 = intent0.getStringExtra("sns_gallery_localId");
                                        }
                                        catch(Throwable unused_ex) {
                                        }
                                        if(TextUtils.isEmpty(s2)) {
                                            int v6 = intent0.getIntExtra("sns_gallery_localId", -1);
                                            if(v6 != -1) {
                                                s2 = "sns_table_" + v6;
                                                goto label_112;
                                            }
                                        }
                                        else {
                                            goto label_112;
                                        }
                                    }
                                    else if(intent0.hasExtra("intent_localid")) {
                                        s2 = intent0.getStringExtra("intent_localid");
                                        goto label_112;
                                    }
                                    else {
                                        goto label_112;
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable2) {
                            CLS27.MTH893(throwable2);
                        }
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 6: {
                ʻˋ0.getClass();
                CLS167 ᵔʾ4 = new CLS167(arr_object[0]);
                try {
                    if(ʻˋ0.FLD1445.MTH938("forward_sns2sns", true) && CLS166.MTH3195(ᵔʾ4.MTH3204()[0], "findItem", new Object[]{20000}) == null) {
                        CLS166.MTH3195(ᵔʾ4.MTH3204()[0], CLS27.MTH897("recordSightMethod2"), new Object[]{20000, CLS27.MTH889("forward_chat_to_sns")});
                        return;
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 7: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("forward_sns2sns", true)) {
                    CLS167 ᵔʾ5 = new CLS167(arr_object[0]);
                    MenuItem menuItem1 = (MenuItem)ᵔʾ5.MTH3204()[0];
                    switch(menuItem1.getItemId()) {
                        case 20000: 
                        case 20001: {
                            ᵔʾ5.MTH3207(null);
                            if(CLS27.MTH894("SnsPathClass") != null) {
                                try {
                                    Activity activity1 = (Activity)(TextUtils.isEmpty(CLS27.MTH897("snsonlinevideoField1")) ? CLS164.MTH3175(ᵔʾ5.MTH3205(), CLS27.MTH897("SnsOnlineVideoActivity")) : CLS166.MTH3194(ᵔʾ5.MTH3205(), CLS27.MTH897("snsonlinevideoField1")));
                                    if(activity1 == null) {
                                        activity1 = ((CLS140)ʻˋ0).MTH3042();
                                    }
                                    if(activity1 != null) {
                                        Intent intent1 = activity1.getIntent();
                                        String s4 = intent1.getStringExtra("intent_thumbpath");
                                        String s5 = intent1.getStringExtra("intent_videopath");
                                        String s6 = activity1.getIntent().getStringExtra("intent_localid");
                                        long v9 = Long.parseLong(s6.substring(s6.lastIndexOf("_") + 1));
                                        if(menuItem1.getItemId() == 20001) {
                                            CLS443.MTH6317(activity1, v9);
                                            return;
                                        }
                                        if(!TextUtils.isEmpty(s5)) {
                                            CLS466.MTH6522(s5, s4, "");
                                            return;
                                        }
                                        CLS466.MTH6527(v9);
                                        return;
                                    }
                                }
                                catch(Throwable throwable4) {
                                    CLS27.MTH893(throwable4);
                                }
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
            case 8: {
                ʻˋ0.getClass();
                CLS167 ᵔʾ6 = new CLS167(arr_object[0]);
                if(ʻˋ0.FLD545) {
                    try {
                        ʻˋ0.FLD545 = false;
                        ((Activity)ᵔʾ6.MTH3205()).finish();
                        ʻˋ0.FLD548.finish();
                        CLS1255 ᵢﹶ0 = new CLS1255(ʻˋ0, ᵔʾ6, 20);
                        CLS40.FLD157.MTH1124(((CLS39)ᵢﹶ0));
                        return;
                    }
                    catch(Throwable throwable5) {
                        CLS27.MTH893(throwable5);
                    }
                }
                return;
            }
            case 9: {
                ʻˋ0.getClass();
                ArrayList arrayList1 = (ArrayList)arr_object[0];
                String s7 = (String)arr_object[1];
                if(!TextUtils.isEmpty(s7) && arrayList1 != null && !arrayList1.isEmpty()) {
                    ʻˋ0.FLD554.addAll(arrayList1);
                    ʻˋ0.MTH2053(s7);
                }
                return;
            }
            case 10: {
                ʻˋ0.getClass();
                CLS167 ᵔʾ7 = new CLS167(arr_object[0]);
                String s8 = (String)CLS166.MTH3182(ᵔʾ7.MTH3205(), "wx");
                if(!TextUtils.isEmpty(s8)) {
                    int v10 = (int)(((Integer)ᵔʾ7.MTH3204()[1]));
                    int v11 = (int)(((Integer)ᵔʾ7.MTH3204()[2]));
                    String s9 = (String)ᵔʾ7.MTH3204()[3];
                    CLS40 ﾞᵎ0 = CLS40.FLD157;
                    String s10 = CLS182.MTH3484(4102100944189969205L, new StringBuilder(), s8);
                    Integer integer0 = -1;
                    HashMap hashMap0 = ﾞᵎ0.FLD152;
                    if(hashMap0.containsKey(s10)) {
                        object0 = hashMap0.get(s10);
                    }
                    if(object0 != null) {
                        integer0 = object0;
                    }
                    int v12 = (int)integer0;
                    String s11 = CLS182.MTH3484(4102101068744020789L, new StringBuilder(), s8);
                    Long long0 = 0L;
                    HashMap hashMap1 = ﾞᵎ0.FLD152;
                    Object object12 = hashMap1.containsKey(s11) ? hashMap1.get(s11) : null;
                    if(object12 != null) {
                        long0 = object12;
                    }
                    long v13 = (long)long0;
                    String s12 = CLS182.MTH3484(4102101712989115189L, new StringBuilder(), s8);
                    CLS92 ⁱʽ0 = ﾞᵎ0.FLD155;
                    CLS484 ᐧﾞ$ˆٴ0 = (CLS484)ⁱʽ0.MTH1744(s12);
                    Class class0 = CLS485.class;
                    if(v10 != 0 || v11 != 0) {
                        CLS166.MTH3193(ᵔʾ7.MTH3205(), "wx");
                        CLS412.MTH6014(((CLS140)ʻˋ0).MTH3042(), s9);
                        if(ᐧﾞ$ˆٴ0 != null) {
                            ((CLS485)ﾞᵎ0.MTH1118(class0)).getClass();
                            CLS485.MTH6725(ᐧﾞ$ˆٴ0, s9, 0);
                        }
                    }
                    else {
                        Object object13 = CLS182.MTH3492(4102101773118657333L, ᵔʾ7.MTH3205());
                        if(object13 == null) {
                            CLS166.MTH3193(ᵔʾ7.MTH3205(), "wx");
                            return;
                        }
                        int v14 = CLS166.MTH3181(object13, CLS27.MTH897("massSendClass2_field5"));
                        int v15 = CLS166.MTH3181(object13, CLS27.MTH897("massSendClass2_field_datalen"));
                        int v16 = CLS166.MTH3181(object13, CLS27.MTH897("massSendClass2_field_datanetoffset"));
                        if(v14 == 0xC7) {
                            CLS166.MTH3193(ᵔʾ7.MTH3205(), "wx");
                            hashMap1.remove("mass_send_upload_percentage_" + s8);
                            hashMap1.remove("mass_send_upload_tic_" + s8);
                            String s13 = CLS182.MTH3484(4102098079446782773L, new StringBuilder(), s8);
                            ⁱʽ0.FLD389.remove(s13);
                            String s14 = CLS27.MTH889("mass_send_upload_done") + " (" + CLS31.MTH994(v15) + ") " + CLS481.MTH6693(((int)(System.currentTimeMillis() - v13)));
                            CLS412.MTH6014(((CLS140)ʻˋ0).MTH3042(), s14);
                            if(ᐧﾞ$ˆٴ0 != null) {
                                ((CLS485)ﾞᵎ0.MTH1118(class0)).getClass();
                                CLS485.MTH6725(ᐧﾞ$ˆٴ0, s14, 100);
                                return;
                            }
                        }
                        else {
                            if(v13 == 0L) {
                                v13 = System.currentTimeMillis();
                                hashMap1.put(CLS182.MTH3484(4102097710079595317L, new StringBuilder(), s8), v13);
                            }
                            int v17 = Math.round(((float)v16) / ((float)v15) * 100.0f);
                            String s15 = String.format(CLS27.MTH889("mass_send_upload"), v12) + " (" + CLS31.MTH994(v16) + "/" + CLS31.MTH994(v15) + ") " + CLS481.MTH6693(((int)(System.currentTimeMillis() - v13)));
                            if(ᐧﾞ$ˆٴ0 != null) {
                                ((CLS485)ﾞᵎ0.MTH1118(class0)).getClass();
                                CLS485.MTH6725(ᐧﾞ$ˆٴ0, s15, v17);
                            }
                            if(v17 != v12) {
                                hashMap1.put(CLS182.MTH3484(4102098461698872117L, new StringBuilder(), s8), v17);
                                if(v17 % 10 == 0 && v17 != 100) {
                                    CLS412.MTH6014(((CLS140)ʻˋ0).MTH3042(), s15);
                                    return;
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 11: {
                ʻˋ0.getClass();
                Class class1 = CLS27.MTH894("SnsPathClass");
                if(CLS27.MTH894("snsContentClass") != null && class1 != null) {
                    try {
                        CLS167 ᵔʾ8 = new CLS167(arr_object[0]);
                        int v18 = ((MenuItem)ᵔʾ8.MTH3204()[0]).getItemId();
                        if(v18 == 20000 || v18 == 20001) {
                            ᵔʾ8.MTH3207(null);
                            if(TextUtils.isEmpty(CLS27.MTH897("flipviewField1"))) {
                                object14 = TextUtils.isEmpty(CLS27.MTH897("flipviewField3")) ? CLS164.MTH3175(ᵔʾ8.MTH3205(), CLS27.MTH897("FlipView")) : CLS166.MTH3194(ᵔʾ8.MTH3205(), CLS27.MTH897("flipviewField3"));
                                if(object14 != null) {
                                    s16 = "flipviewField2";
                                label_266:
                                    String s17 = (String)CLS166.MTH3194(object14, CLS27.MTH897(s16));
                                    if(!TextUtils.isEmpty(s17)) {
                                        Object object15 = CLS66.MTH1516(s17);
                                        if(object15 != null) {
                                            int v19 = CLS166.MTH3181(object15, "field_type");
                                            if(v19 == 1 || v19 == 15) {
                                                String s18 = CLS66.MTH1399(object15);
                                                if(v18 == 20000) {
                                                    switch(v19) {
                                                        case 1: {
                                                            CLS466.MTH6543(((CLS140)ʻˋ0).MTH3042(), s17, s18);
                                                            return;
                                                        }
                                                        case 15: {
                                                            CLS466.MTH6518(s17, object15, s18);
                                                            return;
                                                        }
                                                        default: {
                                                            return;
                                                        }
                                                    }
                                                }
                                                long v20 = Long.parseLong(s17.substring(s17.lastIndexOf("_") + 1));
                                                CLS443.MTH6317(((CLS140)ʻˋ0).MTH3042(), v20);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                object14 = ᵔʾ8.MTH3205();
                                s16 = "flipviewField1";
                                goto label_266;
                            }
                        }
                    }
                    catch(Throwable throwable6) {
                        CLS27.MTH893(throwable6);
                    }
                }
                return;
            }
            case 12: {
                this.MTH2399(arr_object);
                return;
            }
            case 13: {
                this.MTH2396(arr_object);
                return;
            }
            case 14: {
                ʻˋ0.getClass();
                if("forward_img_to_friends".equals(((String)arr_object[0]))) {
                    long v21 = (long)(((Long)arr_object[1]));
                    CLS395.MTH5733(((CLS140)ʻˋ0).MTH3042(), ʻˋ0.FLD1445.MTH938("add_img_watermark", false), ((CLS3)new CLS745(ʻˋ0, "sns_table_" + v21, 1)));
                }
                return;
            }
            case 15: {
                this.MTH2400(arr_object);
                return;
            }
            case 16: {
                this.MTH2393(arr_object);
                return;
            }
            case 17: {
                this.MTH2403(arr_object);
                return;
            }
            case 18: {
                this.MTH2402(arr_object);
                return;
            }
            case 19: {
                ʻˋ0.getClass();
                if("fast_forward_sns".equals(((String)arr_object[0]))) {
                    CLS443.MTH6317(((CLS140)ʻˋ0).MTH3042(), ((long)(((Long)arr_object[1]))));
                }
                return;
            }
            case 20: {
                this.MTH2388(arr_object);
                return;
            }
            case 21: {
                this.MTH2389(arr_object);
                return;
            }
            case 22: {
                this.MTH2387(arr_object);
                return;
            }
            case 23: {
                this.MTH2391(arr_object);
                return;
            }
            case 24: {
                this.MTH2398(arr_object);
                return;
            }
            case 25: {
                this.MTH2395(arr_object);
                return;
            }
            case 26: {
                this.MTH2401(arr_object);
                return;
            }
            case 27: {
                this.MTH2392(arr_object);
                return;
            }
            case 28: {
                this.MTH2394(arr_object);
                return;
            }
            default: {
                this.MTH2397(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2391(Object[] arr_object) {
        Object object1;
        this.FLD879.getClass();
        CLS29 ˎᵢ0 = this.FLD879.FLD1445;
        if(ˎᵢ0.MTH938("forward_chat2sns", true) || ˎᵢ0.MTH938("share_chat", false)) {
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
            Object object2 = ((Object[])object1)[0];
            if(CLS182.MTH3470(4102102112421073717L)) {
                int v = CLS27.MTH903(0, "icons_outlined_share");
                if(ˎᵢ0.MTH938("forward_chat2sns", true)) {
                    CLS166.MTH3195(object2, CLS27.MTH897("imgGalleryMethod3"), new Object[]{20000, CLS27.MTH889("forward_chat_to_sns"), v, 0});
                }
                if(ˎᵢ0.MTH938("share_chat", true)) {
                    CLS166.MTH3195(object2, CLS27.MTH897("imgGalleryMethod3"), new Object[]{20001, CLS27.MTH889("share"), v, 0});
                }
            }
            else {
                int v1 = CLS27.MTH903(0, "icons_wx");
                CLS166.MTH3195(object2, CLS27.MTH897("imgGalleryMethod3"), new Object[]{30000, CLS404.MTH5899(), v1, 0});
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2392(Object[] arr_object) {
        if(!this.FLD879.FLD1447.FLD1407.MTH5947("_config_fwd_fav")) {
            int v = (int)(((Integer)arr_object[0]));
            CLS98 ﾞᐧ0 = (CLS98)arr_object[1];
            Object object0 = arr_object[2];
            Object object1 = arr_object[3];
            switch(CLS166.MTH3181(object0, "field_type")) {
                case 4: 
                case 16: {
                    if(ﾞᐧ0.MTH1774(v) == null) {
                        Class class0 = CLS27.MTH894("favClass2");
                        if(class0 != null) {
                            CLS693 ˉᵎ0 = new CLS693(class0, object1, 0);
                            ﾞᐧ0.MTH1770(0, v, CLS27.MTH889("share"), CLS27.MTH897("icons_outlined_share"), v).setOnMenuItemClickListener(new CLS142(((CLS3)ˉᵎ0), 11));
                            CLS882 ﾞٴ0 = new CLS882(((CLS3)ˉᵎ0), 11);
                            CLS21.FLD76.MTH824("onfavmenu_click", v, ((CLS35)ﾞٴ0));
                        }
                    }
                    break;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2393(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        ʻˋ0.getClass();
        if("moment_img_screenshot".equals(((String)arr_object[0]))) {
            long v = (long)(((Long)arr_object[1]));
            String s = CLS502.MTH6931(ʻˋ0.FLD1446.MTH5752(v));
            long v1 = System.currentTimeMillis();
            Cursor cursor0 = ʻˋ0.FLD1446.MTH5763(v);
            if(cursor0 != null) {
                if(cursor0.moveToFirst()) {
                    v1 = 1000L * cursor0.getLong(cursor0.getColumnIndex("createTime"));
                }
                if(!cursor0.isClosed()) {
                    cursor0.close();
                }
            }
            CLS466.MTH6529(((CLS6)new CLS680(ʻˋ0, s, v1, 0)), CLS66.MTH1508(("sns_table_" + v)), false);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2394(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        CLS139 ﹶʼ0 = ʻˋ0.FLD1447;
        if(!ﹶʼ0.FLD1407.MTH5947("_config_mass_send")) {
            Class class0 = CLS27.MTH894("favClass2");
            if(class0 != null) {
                int v = (int)(((Integer)arr_object[0]));
                CLS98 ﾞᐧ0 = (CLS98)arr_object[1];
                Object object0 = arr_object[2];
                Object object1 = arr_object[3];
                int v1 = CLS166.MTH3181(object0, "field_type");
                switch(v1) {
                    case 1: 
                    case 2: {
                    label_14:
                        if(ʻˋ0.FLD1445.MTH938("broadcast_forward_enable", true) && ﾞᐧ0.MTH1774(v) == null) {
                            CLS734 ˑˉ0 = new CLS734(ʻˋ0, v1, object0, class0, object1, 3);
                            ﾞᐧ0.MTH1770(0, v, CLS27.MTH889("mass_send"), CLS27.MTH897("icons_outlined_share"), v).setOnMenuItemClickListener(new CLS142(((CLS3)ˑˉ0), 13));
                            CLS882 ﾞٴ0 = new CLS882(((CLS3)ˑˉ0), 13);
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

    // 此方法包含解密的字符串
    private final void MTH2395(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        ʻˋ0.getClass();
        if(ʻˋ0.FLD1445.MTH938("video_channel_live_forward", true)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            if(((MenuItem)ᵔʾ0.MTH3204()[0]).getItemId() == 20000) {
                ᵔʾ0.MTH3207(null);
                Class class0 = CLS27.MTH894("FinderItemClass1");
                if(class0 != null) {
                    Class class1 = CLS27.MTH894("FinderShareParserClass");
                    if(class1 != null) {
                        CLS612 ᵔʾ1 = new CLS612(ʻˋ0, ᵔʾ0, class0, class1, 6);
                        CLS40.FLD157.MTH1124(((CLS39)ᵔʾ1));
                    }
                }
            }
        }
    }

    private final void MTH2396(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        ʻˋ0.getClass();
        String s = (String)arr_object[0];
        if(CLS370.MTH5289(4102094029292622645L).equals(s)) {
            long v = (long)(((Long)arr_object[1]));
            CLS396 ʿʽ0 = ʻˋ0.FLD1446;
            int v1 = ʿʽ0.MTH5755(v);
            String s1 = CLS370.MTH5289(4102094072242295605L) + v;
            switch(v1) {
                case 1: {
                    CLS466.MTH6529(((CLS6)new CLS1225(9)), CLS66.MTH1508(s1), false);
                    return;
                }
                case 2: {
                    CLS466.MTH6512(CLS502.MTH6931(ʿʽ0.MTH5752(v)));
                    return;
                }
                case 3: {
                    Object object0 = CLS182.MTH3492(4100862009333830453L, CLS166.MTH3195(CLS404.MTH5894(v), CLS27.MTH897(CLS370.MTH5289(4100865788905050933L)), new Object[0]));
                    String s2 = (String)CLS182.MTH3492(4100862095233176373L, object0);
                    String s3 = (String)CLS182.MTH3492(4100862202607358773L, object0);
                    if(!TextUtils.isEmpty(s2)) {
                        if(CLS502.MTH6934(s2, new String[]{CLS370.MTH5289(0x38E930052B3CD335L)})) {
                            s2 = s2.split(CLS370.MTH5289(0x38E9300D2B3CD335L))[0];
                        }
                        CLS466.MTH6514(s2, s3);
                        return;
                    }
                    break;
                }
                case 15: {
                    CLS466.MTH6545(s1, ((CLS13)new CLS1225(10)));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2397(Object[] arr_object) {
        this.FLD879.getClass();
        try {
            if(this.FLD879.FLD1445.MTH938("record_forward_enable", true)) {
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                if(((int)(((Integer)ᵔʾ0.MTH3204()[1]))) == 20000) {
                    String s = (String)CLS166.MTH3195(CLS166.MTH3194(CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("recordImgField1")), CLS27.MTH897("recordImgField2")), CLS27.MTH897("recordImgGetPath"), new Object[0]);
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(s);
                    CLS466.MTH6536("", arrayList0);
                    ᵔʾ0.MTH3207(null);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2398(Object[] arr_object) {
        Object object1;
        this.FLD879.getClass();
        if(this.FLD879.FLD1445.MTH938("video_channel_live_forward", true)) {
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
            Object object2 = ((Object[])object1)[0];
            int v = CLS27.MTH903(0, "icons_outlined_share");
            CLS166.MTH3195(object2, CLS27.MTH897("imgGalleryMethod3"), new Object[]{20000, CLS27.MTH889("forward_to_friends"), v, 0});
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2399(Object[] arr_object) {
        Object object1;
        CLS629 ʻˋ0 = this.FLD879;
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
        Object object2 = ((Object[])object1)[0];
        CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
        if(ˎᵢ0.MTH938("forward_sns2sns", true)) {
            CLS166.MTH3195(object2, CLS27.MTH897("recordSightMethod2"), new Object[]{20000, CLS27.MTH889("forward_chat_to_sns")});
        }
        if(ʻˋ0.FLD1447.FLD1438.MTH6895("moment_fast_forward") && CLS27.MTH899(new String[]{"mmsnspostClass", "mmsnspostClass_b"}) && ˎᵢ0.MTH938("fast_forward_sns2sns", CLS412.MTH6002())) {
            CLS166.MTH3195(object2, CLS27.MTH897("recordSightMethod2"), new Object[]{20001, CLS27.MTH889("fast_forward_sns")});
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2400(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        ʻˋ0.getClass();
        if("mass_send".equals(((String)arr_object[0]))) {
            long v = (long)(((Long)arr_object[1]));
            int v1 = ʻˋ0.FLD1446.MTH5755(v);
            if(v1 == 1) {
                CLS395.MTH5733(((CLS140)ʻˋ0).MTH3042(), ʻˋ0.FLD1445.MTH938("add_img_watermark", false), ((CLS3)new CLS745(ʻˋ0, "sns_table_" + v, 0)));
                return;
            }
            if(v1 == 15) {
                CLS466.MTH6545(("sns_table_" + v), ((CLS13)new CLS679(ʻˋ0, 0)));
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2401(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        if(!ʻˋ0.FLD1447.FLD1407.MTH5947("_config_fwd_fav")) {
            int v = (int)(((Integer)arr_object[0]));
            CLS98 ﾞᐧ0 = (CLS98)arr_object[1];
            Object object0 = arr_object[2];
            Object object1 = arr_object[3];
            int v1 = CLS166.MTH3181(object0, "field_type");
            if(ﾞᐧ0.MTH1774(v) == null) {
                Class class0 = CLS27.MTH894("favClass2");
                if(class0 != null) {
                    CLS734 ˑˉ0 = new CLS734(ʻˋ0, v1, object0, class0, object1, 1);
                    ﾞᐧ0.MTH1770(0, v, (v1 == 3 || v1 == 8 || v1 == 18 ? CLS27.MTH889("forward") + " (" + CLS27.MTH889("appname") + ")" : CLS27.MTH889("forward_chat_to_sns")), CLS27.MTH897("icons_outlined_share"), v).setOnMenuItemClickListener(new CLS142(((CLS3)ˑˉ0), 9));
                    CLS882 ﾞٴ0 = new CLS882(((CLS3)ˑˉ0), 9);
                    CLS21.FLD76.MTH824("onfavmenu_click", v, ((CLS35)ﾞٴ0));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2402(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        ʻˋ0.getClass();
        if("forward_chat_to_sns".equals(((String)arr_object[0]))) {
            long v = (long)(((Long)arr_object[1]));
            int v1 = ʻˋ0.FLD1446.MTH5755(v);
            String s = CLS502.MTH6928(ʻˋ0.FLD1446.MTH5752(v));
            switch(v1) {
                case 1: {
                    CLS466.MTH6509();
                    CLS395.MTH5733(((CLS140)ʻˋ0).MTH3042(), ʻˋ0.FLD1445.MTH938("add_img_watermark", false), ((CLS3)new CLS574(2, s, "sns_table_" + v)));
                    return;
                }
                case 2: {
                    CLS466.MTH6504(s);
                    return;
                }
                case 3: {
                    Object object0 = CLS182.MTH3492(4100870259966006069L, CLS166.MTH3195(CLS404.MTH5894(v), CLS27.MTH897("snsSightMethod5"), new Object[0]));
                    String s1 = (String)CLS182.MTH3492(4100870345865351989L, object0);
                    String s2 = (String)CLS182.MTH3492(4100870453239534389L, object0);
                    if(!TextUtils.isEmpty(s1)) {
                        if(CLS502.MTH6934(s1, new String[]{"http://"})) {
                            s1 = s1.split(" ")[0];
                        }
                        Intent intent0 = new Intent();
                        intent0.putExtra("Kdescription", CLS466.MTH6541(s));
                        intent0.putExtra("Ksnsupload_type", 1);
                        intent0.putExtra("Ksnsupload_title", s1);
                        intent0.putExtra("Ksnsupload_link", s2);
                        intent0.putExtra("wexposed_wf", true);
                        LinkedList linkedList0 = (LinkedList)CLS166.MTH3194(object0, CLS27.MTH897("snsSightField3"));
                        if(linkedList0 != null && !linkedList0.isEmpty()) {
                            String s3 = CLS66.MTH1451(linkedList0.get(0));
                            if(CLS31.MTH1024(s3)) {
                                Bitmap bitmap0 = CLS518.MTH7060(s3);
                                if(bitmap0 != null) {
                                    intent0.putExtra("Ksnsupload_imgbuf", CLS518.MTH7054(bitmap0));
                                }
                            }
                        }
                        if(!CLS66.MTH1450("sns", ".ui.SnsUploadUI", intent0)) {
                            Activity activity0 = CLS404.MTH5891();
                            intent0.setClassName(activity0, CLS27.MTH897("SnsUploadUI"));
                            activity0.startActivity(intent0);
                            return;
                        }
                    }
                    break;
                }
                case 15: {
                    CLS466.MTH6518(("sns_table_" + v), CLS404.MTH5894(v), s);
                    return;
                }
                case 28: {
                    Class class0 = CLS27.MTH894("TimeLineConvertClass");
                    if(class0 != null) {
                        try {
                            Object object3 = CLS166.MTH3195(CLS404.MTH5894(v), CLS27.MTH897("snsSightMethod5"), new Object[0]);
                            String s7 = (String)CLS166.MTH3192(class0, CLS27.MTH897("TimeLineConvertMethod1"), new Object[]{object3});
                            CLS466.MTH6508(s7.substring(s7.indexOf("<finderFeed>"), s7.indexOf("</ContentObject>")), s);
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                        return;
                    }
                    break;
                }
                case 34: {
                    Class class1 = CLS27.MTH894("TimeLineConvertClass");
                    if(class1 != null) {
                        try {
                            Object object4 = CLS166.MTH3195(CLS404.MTH5894(v), CLS27.MTH897("snsSightMethod5"), new Object[0]);
                            String s8 = (String)CLS166.MTH3192(class1, CLS27.MTH897("TimeLineConvertMethod1"), new Object[]{object4});
                            int v2 = s8.indexOf("<finderFeed>");
                            if(v2 != -1) {
                                s8 = s8.substring(v2, s8.indexOf("</ContentObject>"));
                            }
                            CLS466.MTH6501(s8, s);
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                        return;
                    }
                    break;
                }
                case 4: 
                case 42: {
                    Object object1 = CLS182.MTH3492(4100868941411046197L, CLS166.MTH3195(CLS404.MTH5894(v), CLS27.MTH897("snsSightMethod5"), new Object[0]));
                    Intent intent1 = new Intent();
                    intent1.putExtra("Kdescription", CLS466.MTH6541(s));
                    intent1.putExtra("Ksnsupload_type", 2);
                    LinkedList linkedList1 = (LinkedList)CLS166.MTH3194(object1, CLS27.MTH897("snsSightField3"));
                    if(linkedList1 != null && !linkedList1.isEmpty()) {
                        Object object2 = linkedList1.get(0);
                        String s4 = (String)CLS182.MTH3492(4100869766044767029L, object2);
                        String s5 = (String)CLS182.MTH3492(4100869860534047541L, object2);
                        String s6 = (String)CLS182.MTH3492(4100869418152416053L, object2);
                        intent1.putExtra("Ksnsupload_title", s5);
                        intent1.putExtra("Ksnsupload_link", s6);
                        CLS518.MTH7068(s4, ((CLS516)new CLS1279(intent1, s6, s5, 11)));
                        return;
                    }
                    break;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2403(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD879;
        ʻˋ0.getClass();
        if("sns_export".equals(((String)arr_object[0]))) {
            long v = (long)(((Long)arr_object[1]));
            int v1 = ʻˋ0.FLD1446.MTH5755(v);
            String s = CLS502.MTH6931(ʻˋ0.FLD1446.MTH5752(v));
            Cursor cursor0 = ʻˋ0.FLD1446.MTH5763(v);
            ContentValues contentValues0 = new ContentValues();
            if(cursor0 != null) {
                if(cursor0.moveToFirst()) {
                    for(int v2 = 0; v2 < 2; ++v2) {
                        String s1 = new String[]{"userName", "createTime"}[v2];
                        contentValues0.put(s1, cursor0.getString(cursor0.getColumnIndex(s1)));
                    }
                }
                if(!cursor0.isClosed()) {
                    cursor0.close();
                }
            }
            String s2 = contentValues0.getAsString("userName");
            int v3 = CLS182.MTH3474(4102095506761372469L, contentValues0);
            switch(v1) {
                case 1: {
                    CLS466.MTH6529(((CLS6)new CLS565(v3, s2, s)), CLS66.MTH1508(("sns_table_" + v)), false);
                    return;
                }
                case 2: {
                    CLS21.FLD76.MTH818("moment_export_text", new Object[]{s2, v3, s});
                    return;
                }
                case 3: {
                    String s3 = (String)CLS182.MTH3492(4102096339985027893L, CLS182.MTH3492(4102096254085681973L, CLS166.MTH3195(CLS404.MTH5894(v), CLS27.MTH897("snsSightMethod5"), new Object[0])));
                    CLS21.FLD76.MTH818("moment_export_url", new Object[]{s2, v3, s3, s});
                    return;
                }
                case 15: {
                    CLS466.MTH6545(("sns_table_" + v), ((CLS13)new CLS565(v3, s2, s)));
                    return;
                }
                case 4: 
                case 42: {
                    LinkedList linkedList0 = (LinkedList)CLS182.MTH3492(4102096103761826613L, CLS182.MTH3492(4102096017862480693L, CLS166.MTH3195(CLS404.MTH5894(v), CLS27.MTH897("snsSightMethod5"), new Object[0])));
                    if(linkedList0 != null && !linkedList0.isEmpty()) {
                        String s4 = (String)CLS182.MTH3492(4102096168186336053L, linkedList0.get(0));
                        CLS21.FLD76.MTH818("moment_export_url", new Object[]{s2, v3, s4, s});
                        return;
                    }
                    break;
                }
            }
        }
    }
}

