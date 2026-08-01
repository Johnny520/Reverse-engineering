// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera;
import android.os.Environment;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1227;
import b.ᵔʾ.CLS292;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1283;
import b.ⁱᵔ.CLS1381;
import b.ⁱᵔ.CLS1511;
import b.ⁱᵔ.CLS1647;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS434;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS529;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public final class CLS861 implements CLS35 {
    public final int FLD1368;
    public final CLS770 FLD1369;

    public CLS861(CLS770 ٴʿ0, int v) {
        this.FLD1368 = v;
        this.FLD1369 = ٴʿ0;
        super();
    }

    // 此方法包含解密的字符串
    private final void MTH2976(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1369;
        if(ٴʿ0.FLD1447.FLD1438.MTH6895("werun_like_all")) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            try {
                CLS166.MTH3195(ᵔʾ0.MTH3205(), CLS27.MTH892("addTextOptionMenu", "a"), new Object[]{1, CLS27.MTH889("like_all"), new CLS529(ٴʿ0, ᵔʾ0, 3)});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2977(Object[] arr_object) {
        Object object1;
        CLS770 ٴʿ0 = this.FLD1369;
        ٴʿ0.getClass();
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
        if(CLS412.MTH6009(((Activity)object1)).endsWith("VideoActivity")) {
            Intent intent0 = ((Activity)object1).getIntent();
            ٴʿ0.FLD1061 = intent0.getBooleanExtra("Voip_Outcall", false);
            ٴʿ0.FLD1066 = intent0.getBooleanExtra("Voip_VideoCall", false);
            ٴʿ0.FLD1064 = intent0.getStringExtra("Voip_User");
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2978(Object[] arr_object) {
        this.FLD1369.getClass();
        CLS29 ˎᵢ0 = this.FLD1369.FLD1445;
        if(ˎᵢ0.MTH938("modify_steps_enable", false) && this.FLD1369.FLD1447.FLD1438.MTH6895("modify_steps")) {
            float f = ˎᵢ0.MTH931("modify_steps_multiplier");
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            long v = (long)Math.round(f * ((float)(((long)(((Long)ᵔʾ0.MTH3206()))))));
            if(ˎᵢ0.MTH938("modify_steps_max_enable", false)) {
                int v1 = ˎᵢ0.MTH927(0, "modify_steps_max");
                if(v1 != 0) {
                    v = Math.min(v, v1);
                }
            }
            ᵔʾ0.MTH3207(v);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object5;
        File file0;
        int v8;
        Object object0 = null;
        CLS770 ٴʿ0 = this.FLD1369;
        int v = 0;
        switch(this.FLD1368) {
            case 0: {
                ٴʿ0.getClass();
                if(!CLS412.MTH6002() && ٴʿ0.FLD1447.FLD1438.MTH6895("send_multple_friendcard") && ٴʿ0.FLD1445.MTH938("recommend_friend_card_shortcut", false)) {
                    int v1 = (int)(((Integer)arr_object[0]));
                    int v2 = (int)(((Integer)arr_object[1]));
                    ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
                    String s = (String)arr_object[3];
                    if(!CLS372.MTH5410(s) && !CLS372.MTH5400(s) && !CLS404.MTH5909(s) && !CLS426.MTH6126(s) && contextMenu0.findItem(v1) == null) {
                        CLS846 ⁱˎ0 = new CLS846(ٴʿ0, s, 0);
                        contextMenu0.add(v2, v1, 0, CLS27.MTH889("recommend_friend_card")).setOnMenuItemClickListener(new CLS142(((CLS3)ⁱˎ0), 18));
                        CLS882 ﾞٴ0 = new CLS882(((CLS3)ⁱˎ0), 18);
                        CLS21.FLD76.MTH824("onconversationmenu_click", v1, ((CLS35)ﾞٴ0));
                    }
                }
                return;
            }
            case 1: {
                ٴʿ0.getClass();
                if(!CLS412.MTH6002() && (ٴʿ0.FLD1445.MTH938("send_wear_yo_shortcut", false) && (CLS27.MTH890("sendWearYoClass") || CLS27.MTH890("sendWearYoClass_b")))) {
                    int v3 = (int)(((Integer)arr_object[0]));
                    int v4 = (int)(((Integer)arr_object[1]));
                    ContextMenu contextMenu1 = (ContextMenu)arr_object[2];
                    String s1 = (String)arr_object[3];
                    if(!CLS372.MTH5410(s1) && !CLS372.MTH5400(s1) && !CLS404.MTH5909(s1) && !CLS426.MTH6126(s1) && contextMenu1.findItem(v3) == null) {
                        CLS692 ˉᐧ0 = new CLS692(4, s1);
                        contextMenu1.add(v4, v3, 0, CLS27.MTH889("send_wear_yo")).setOnMenuItemClickListener(new CLS142(((CLS3)ˉᐧ0), 24));
                        CLS882 ﾞٴ1 = new CLS882(((CLS3)ˉᐧ0), 24);
                        CLS21.FLD76.MTH824("onconversationmenu_click", v3, ((CLS35)ﾞٴ1));
                    }
                }
                return;
            }
            case 2: {
                ٴʿ0.getClass();
                boolean z = CLS412.MTH6002();
                if(ٴʿ0.FLD1445.MTH938("remove_max_limit", z)) {
                    Object object1 = arr_object[0];
                    try {
                        Method method0 = object1.getClass().getDeclaredMethod("setResult", Object.class);
                        method0.setAccessible(true);
                        method0.invoke(object1, Boolean.FALSE);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                return;
            }
            case 3: {
                ٴʿ0.getClass();
                switch(((String)arr_object[0])) {
                    case "config_change_camera": {
                        CLS395.MTH5730(((CLS140)ٴʿ0).MTH3042(), null);
                        return;
                    }
                    case "config_close_floating_video": {
                        ٴʿ0.FLD1067.MTH1727();
                        return;
                    }
                    case "config_mark_read": {
                        CLS40 ﾞᵎ0 = CLS40.FLD157;
                        CLS485 ᐧﾞ0 = (CLS485)ﾞᵎ0.MTH1118(CLS485.class);
                        while(v < ᐧﾞ0.FLD4737.size()) {
                            ᐧﾞ0.MTH6733(v);
                            ++v;
                        }
                        ﾞᵎ0.MTH1124(((CLS39)new CLS1511(8)));
                        return;
                    }
                    case "config_mass_delete_msg": {
                        CLS395.MTH5744(false, ((CLS140)ٴʿ0).MTH3042(), CLS371.FLD3470.MTH5377(), null);
                        return;
                    }
                    case "fast_switch_account": {
                        CLS395.MTH5724(((CLS140)ٴʿ0).MTH3042());
                        return;
                    }
                    case "mass_delete_conversation": {
                        CLS395.MTH5738(((CLS140)ٴʿ0).MTH3042(), false);
                        return;
                    }
                    case "mass_remove_stickytop": {
                        Activity activity0 = ((CLS140)ٴʿ0).MTH3042();
                        String s2 = CLS27.MTH889("mass_remove_stickytop");
                        String s3 = CLS27.MTH889("mass_remove_stickytop");
                        CLS836 ᵢˎ0 = new CLS836();
                        CLS523.MTH7160(activity0, s2, ((CLS17)new CLS783(activity0, s3, false)), ((CLS11)ᵢˎ0));
                        return;
                    }
                    case "mass_unhide_conversation": {
                        CLS395.MTH5734(((CLS140)ٴʿ0).MTH3042(), false);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 4: {
                ٴʿ0.getClass();
                String s4 = (String)arr_object[0];
                Object object2 = arr_object[1];
                int v5 = CLS166.MTH3181(object2, "field_type");
                String s5 = (String)CLS166.MTH3194(object2, "field_content");
                String s6 = (String)CLS166.MTH3194(object2, "field_imgPath");
                String s7 = (String)CLS166.MTH3194(object2, "field_talker");
                int v6 = CLS166.MTH3181(object2, "field_isSend");
                long v7 = CLS166.MTH3185(object2, "field_msgId");
                try {
                    switch(s4) {
                        case "export_emoji_as_gif": {
                            v8 = 3;
                            break;
                        }
                        case "float_video": {
                            v8 = 1;
                            break;
                        }
                        case "modify_message": {
                            v8 = 6;
                            break;
                        }
                        case "quote": {
                            v8 = 2;
                            break;
                        }
                        case "selective_copy": {
                            v8 = 0;
                            break;
                        }
                        case "set_fake_amount": {
                            v8 = 4;
                            break;
                        }
                        case "show_groupnote_members": {
                            v8 = 5;
                            break;
                        }
                        default: {
                            v8 = -1;
                        }
                    }
                    CLS139 ﹶʼ0 = ٴʿ0.FLD1447;
                    switch(v8) {
                        case 0: {
                            String s8 = CLS426.MTH6106(v6, s5, s7);
                            if(v5 == 0x1000031 || v5 == 0x31000031) {
                                s8 = (String)CLS392.MTH5633(s8, "msg").get(".msg.appmsg.title");
                            }
                            CLS395.MTH5746(((CLS140)ٴʿ0).MTH3042(), s8);
                            return;
                        }
                        case 1: {
                            CLS466.MTH6507(s6, ((CLS12)new CLS832(ٴʿ0, 2)), false, 0);
                            return;
                        }
                        case 2: {
                            String s9 = CLS27.MTH904();
                            if(v6 == 0) {
                                s9 = CLS426.MTH6126(s7) ? CLS426.MTH6109(s5) : s7;
                            }
                            String s10 = CLS426.MTH6106(v6, s5, s7);
                            if(v5 == 0x1000031 || v5 == 0x31000031) {
                                s10 = (String)CLS392.MTH5633(s10, "msg").get(".msg.appmsg.title");
                            }
                            ﹶʼ0.MTH3022(String.format(CLS27.MTH882("quotation"), CLS613.MTH1971((CLS426.MTH6126(s7) ? CLS66.MTH1452(s7, s9) : ٴʿ0.FLD1444.MTH5311(s9))), s10));
                            return;
                        }
                        case 3: {
                            if(CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
                                String s14 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                                file0 = new File(ٴʿ0.FLD1445.MTH925("export_emoji_gif_path", s14));
                            }
                            else {
                                file0 = null;
                            }
                            if(file0 != null && file0.canWrite()) {
                                File file1 = new File(file0, s6 + ".gif");
                                if(CLS66.MTH1396(file1, s6)) {
                                    CLS412.MTH6014(((CLS140)ٴʿ0).MTH3042(), CLS27.MTH889("file_written_to") + file1.getAbsolutePath());
                                    return;
                                }
                            }
                            File file2 = new File(CLS31.MTH1038(CLS27.MTH900()), s6 + ".gif");
                            if(CLS66.MTH1396(file2, s6)) {
                                CLS31.MTH996(file2.getAbsolutePath());
                                CLS466.MTH6506(file2);
                                return;
                            }
                            break;
                        }
                        case 4: {
                            String s11 = (String)CLS166.MTH3194(object2, "field_reserved");
                            HashMap hashMap0 = TextUtils.isEmpty(s11) ? CLS392.MTH5633(s5, "msg") : CLS434.MTH6191(s11);
                            String s12 = ((String)hashMap0.get(".msg.appmsg.wcpayinfo.feedesc")).substring(1);
                            String s13 = (String)hashMap0.get(".msg.appmsg.wcpayinfo.pay_memo");
                            boolean z1 = hashMap0.containsKey(".msg.appmsg.backup");
                            CLS713 ˎʻ0 = new CLS713(ٴʿ0, hashMap0, s5, object2, v7);
                            Activity activity1 = ((CLS140)ٴʿ0).MTH3042();
                            CLS798 ᴵٴ0 = new CLS798(ٴʿ0, s5, s13, hashMap0, object2, v7);
                            if(!z1) {
                                ˎʻ0 = null;
                            }
                            CLS395.MTH5742(activity1, s12, s13, ᴵٴ0, ˎʻ0);
                            return;
                        }
                        case 5: {
                            CLS387.MTH5599(((CLS140)ٴʿ0).MTH3042(), s7, v7);
                            return;
                        }
                        case 6: {
                            if(ﹶʼ0.FLD1438.MTH6895("modifyMessage") && CLS27.MTH895().MTH938("modify_message", true)) {
                                CLS395.MTH5731(((CLS140)ٴʿ0).MTH3042(), new CLS697(ٴʿ0, v5, v7), object2);
                                return;
                            }
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 5: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("sight_use_front_camera_enable", false) && ٴʿ0.FLD1445.MTH938("sight_front_camera_enable", false)) {
                    Object object3 = arr_object[0];
                    try {
                        Field field0 = object3.getClass().getDeclaredField("args");
                        if(field0 != null) {
                            field0.setAccessible(true);
                            object0 = field0.get(object3);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    try {
                        Camera.CameraInfo camera$CameraInfo0 = new Camera.CameraInfo();
                        int v9 = Camera.getNumberOfCameras();
                        while(true) {
                        label_154:
                            if(v < v9) {
                                Camera.getCameraInfo(v, camera$CameraInfo0);
                                break;
                            }
                            v = -1;
                            ((Object[])object0)[1] = v;
                            return;
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                        v = -1;
                        ((Object[])object0)[1] = v;
                        return;
                    }
                    if(camera$CameraInfo0.facing != 1) {
                        ++v;
                        goto label_154;
                    }
                    ((Object[])object0)[1] = v;
                }
                return;
            }
            case 6: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("sight_use_front_camera_enable", false) && ٴʿ0.FLD1445.MTH938("sight_front_camera_enable", false)) {
                    Object object4 = arr_object[0];
                    try {
                        Field field1 = object4.getClass().getDeclaredField("args");
                        if(field1 != null) {
                            field1.setAccessible(true);
                            object0 = field1.get(object4);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    ((Object[])object0)[2] = 270;
                }
                return;
            }
            case 7: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("sight_use_front_camera_enable", false)) {
                    if(ٴʿ0.FLD1062) {
                        ٴʿ0.FLD1062 = false;
                        return;
                    }
                    CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                    if(((int)(((Integer)ᵔʾ0.MTH3204()[0]))) == 1) {
                        ᵔʾ0.MTH3207(null);
                        CLS395.MTH5730(((CLS140)ٴʿ0).MTH3042(), new CLS868(ٴʿ0, ᵔʾ0));
                    }
                }
                return;
            }
            case 8: {
                ٴʿ0.getClass();
                String s15 = (String)arr_object[0];
                String s16 = (String)arr_object[1];
                switch(s15) {
                    case "extract_url": {
                        CLS462.MTH6490(((CLS140)ٴʿ0).MTH3042(), ((CLS12)new CLS1283(((CLS12)new CLS832(ٴʿ0, 1)), 0)));
                        return;
                    }
                    case "insert_fake_message": {
                        Activity activity2 = ((CLS140)ٴʿ0).MTH3042();
                        CLS846 ⁱˎ1 = new CLS846(ٴʿ0, s16, 2);
                        Calendar calendar0 = Calendar.getInstance();
                        calendar0.setTime(new Date(System.currentTimeMillis()));
                        CLS1622 ˑٴ0 = new CLS1622(activity2);
                        String[] arr_s = {""};
                        CLS523.MTH7160(activity2, CLS27.MTH889("insert_fake_message"), ((CLS17)new CLS766(activity2, s16, arr_s, calendar0, ˑٴ0, 8)), ((CLS11)new CLS1381(arr_s, ˑٴ0, s16, calendar0, ⁱˎ1)));
                        return;
                    }
                    case "pre_config_dice": {
                        CLS395.MTH5743(((CLS140)ٴʿ0).MTH3042(), false);
                        return;
                    }
                    case "search_chat_history": {
                        Intent intent0 = new Intent();
                        intent0.putExtra("detail_username", s16);
                        if(!CLS66.MTH1502(intent0, CLS27.MTH897("FTSChattingConvUI"))) {
                            Activity activity3 = ((CLS140)ٴʿ0).MTH3042();
                            intent0.setClassName(CLS390.MTH5619(activity3), CLS27.MTH897("FTSChattingConvUI"));
                            activity3.startActivity(intent0);
                            return;
                        }
                        return;
                    }
                    case "send_img_as_gif": {
                        CLS462.MTH6485(((CLS140)ٴʿ0).MTH3042(), ((CLS8)new CLS715(s16)));
                        return;
                    }
                    case "send_search_image": {
                        ٴʿ0.MTH2583(s16);
                        return;
                    }
                    case "send_wear_yo": {
                        CLS66.MTH1513(s16);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 9: {
                ٴʿ0.getClass();
                CLS29 ˎᵢ0 = ٴʿ0.FLD1445;
                if(ˎᵢ0.MTH938("custom_dice_enable", false)) {
                    CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                    String s17 = CLS27.MTH897("diceClass2b");
                    if(TextUtils.isEmpty(s17)) {
                        s17 = CLS27.MTH897("diceClass2");
                    }
                    switch(ᵔʾ1.MTH3204().length) {
                        case 2: {
                            object5 = ᵔʾ1.MTH3204()[1];
                            goto label_233;
                        }
                        case 3: {
                            if(!(ᵔʾ1.MTH3204()[2] instanceof Integer)) {
                                object5 = CLS164.MTH3175(ᵔʾ1.MTH3204()[2], s17);
                                goto label_233;
                            }
                            break;
                        }
                        case 4: {
                            if(!(ᵔʾ1.MTH3204()[3] instanceof Integer)) {
                                object5 = CLS164.MTH3175(ᵔʾ1.MTH3204()[3], s17);
                            label_233:
                                if(object5 != null) {
                                    String s18 = (String)CLS166.MTH3194(object5, "field_content");
                                    if(!TextUtils.isEmpty(s18)) {
                                        int v10 = Integer.parseInt(s18);
                                        if(v10 == 49 || v10 == 50) {
                                            ᵔʾ1.MTH3207(null);
                                            try {
                                                if(v10 == 49) {
                                                    String s19 = ˎᵢ0.MTH925("preconfigrps", "");
                                                    if(!TextUtils.isEmpty(s19)) {
                                                        char[] arr_c = s19.toCharArray();
                                                        ArrayDeque arrayDeque0 = new ArrayDeque();
                                                        for(int v11 = 0; v11 < arr_c.length; ++v11) {
                                                            arrayDeque0.add("" + arr_c[v11]);
                                                        }
                                                        String s20 = (String)arrayDeque0.poll();
                                                        ˎᵢ0.MTH922(TextUtils.join("", arrayDeque0), "preconfigrps");
                                                        int v12 = Math.min(Math.max(Integer.parseInt(s20), 1), 3);
                                                        CLS21.FLD76.MTH818("sendDice", new Object[]{49, ((int)(v12 - 1))});
                                                        return;
                                                    }
                                                }
                                                else {
                                                    String s21 = ˎᵢ0.MTH925("preconfigdice", "");
                                                    if(!TextUtils.isEmpty(s21)) {
                                                        char[] arr_c1 = s21.toCharArray();
                                                        ArrayDeque arrayDeque1 = new ArrayDeque();
                                                        for(int v13 = 0; v13 < arr_c1.length; ++v13) {
                                                            arrayDeque1.add("" + arr_c1[v13]);
                                                        }
                                                        String s22 = (String)arrayDeque1.poll();
                                                        ˎᵢ0.MTH922(TextUtils.join("", arrayDeque1), "preconfigdice");
                                                        int v14 = Math.min(Math.max(Integer.parseInt(s22), 1), 6);
                                                        CLS21.FLD76.MTH818("sendDice", new Object[]{v10, ((int)(v14 - 1))});
                                                        return;
                                                    }
                                                }
                                            }
                                            catch(Throwable throwable2) {
                                                CLS27.MTH893(throwable2);
                                            }
                                            Activity activity4 = ((CLS140)ٴʿ0).MTH3042();
                                            if(CLS395.FLD3770 != null && CLS395.FLD3770.isShowing()) {
                                                CLS395.FLD3770.dismiss();
                                            }
                                            String s23 = CLS27.MTH889(CLS370.MTH5289((v10 == 49 ? 4100851190311211829L : 4100851237555852085L)));
                                            CLS1622 ˑٴ1 = new CLS1622(activity4);
                                            CLS1629 ⁱˉ0 = new CLS1629(activity4);
                                            CLS1629 ⁱˉ1 = new CLS1629(activity4);
                                            CLS1629 ⁱˉ2 = new CLS1629(activity4);
                                            CLS395.FLD3770 = CLS523.MTH7151(activity4, s23, ((CLS17)new CLS1227(activity4, ⁱˉ0, ˑٴ1, ⁱˉ1, ⁱˉ2, v10)), ((CLS11)new CLS1647(v10, ⁱˉ0, ˑٴ1, ⁱˉ2, ⁱˉ1)), CLS27.MTH889("random"));
                                        }
                                    }
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
            case 10: {
                ٴʿ0.getClass();
                CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                int v15 = CLS166.MTH3181(ᵔʾ2.MTH3205(), "field_type");
                String s24 = (String)CLS166.MTH3194(ᵔʾ2.MTH3205(), "field_content");
                if(v15 == 0x35000031 && CLS502.MTH6934(s24, new String[]{"<patMsg>"})) {
                    CLS29 ˎᵢ1 = ٴʿ0.FLD1445;
                    if(ˎᵢ1.MTH938("custom_nudging_msg_enable", false)) {
                        String s25 = CLS182.MTH3473(0x38EC69DE2B3CD335L, ˎᵢ1, "custom_nudging_original");
                        String s26 = CLS182.MTH3473(0x38EC69862B3CD335L, ˎᵢ1, "custom_nudging_modified");
                        if(!TextUtils.isEmpty(s25) && !TextUtils.isEmpty(s26) && !s25.equals(s26)) {
                            CLS166.MTH3198(ᵔʾ2.MTH3205(), "field_content", s24.replace(s25, s26));
                        }
                    }
                }
                return;
            }
            case 11: {
                this.MTH2983(arr_object);
                return;
            }
            case 12: {
                this.MTH2982(arr_object);
                return;
            }
            case 13: {
                this.MTH2984(arr_object);
                return;
            }
            case 14: {
                this.MTH2981(arr_object);
                return;
            }
            case 15: {
                this.MTH2986(arr_object);
                return;
            }
            case 16: {
                this.MTH2985(arr_object);
                return;
            }
            case 17: {
                this.MTH2977(arr_object);
                return;
            }
            case 18: {
                this.MTH2978(arr_object);
                return;
            }
            case 19: {
                this.MTH2976(arr_object);
                return;
            }
            default: {
                this.MTH2980(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2980(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1369;
        ٴʿ0.getClass();
        CLS29 ˎᵢ0 = ٴʿ0.FLD1445;
        if(ˎᵢ0.MTH938("fake_gps_enable", false)) {
            String s = " ";
            String s1 = ˎᵢ0.MTH925("fake_gps", "");
            if(!TextUtils.isEmpty(s1) && ٴʿ0.FLD1447.FLD1438.MTH6895("fake_gps")) {
                if(CLS502.MTH6934(s1, new String[]{","})) {
                    s = ",";
                }
                String[] arr_s = s1.split(s);
                if(arr_s.length == 2) {
                    CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                    Object[] arr_object1 = ᵔʾ0.MTH3204();
                    arr_object1[1] = Double.parseDouble(arr_s[0].trim());
                    Object[] arr_object2 = ᵔʾ0.MTH3204();
                    arr_object2[2] = Double.parseDouble(arr_s[1].trim());
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2981(Object[] arr_object) {
        Object object1;
        CLS770 ٴʿ0 = this.FLD1369;
        ٴʿ0.getClass();
        if(ٴʿ0.FLD1445.MTH938("fake_amount_enable", false) && !ٴʿ0.FLD1447.FLD1407.MTH5947("fake_amount")) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            Object object0 = ᵔʾ0.MTH3204()[0];
            if(object0 != null) {
                if(CLS182.MTH3470(0x38EC630D2B3CD335L)) {
                    Object object2 = CLS164.MTH3176(0, object0);
                    object1 = object2 instanceof String ? CLS164.MTH3176(1, object0) : object2;
                }
                else {
                    object1 = CLS182.MTH3492(4101762371918025525L, object0);
                }
                if(object1 != null) {
                    String s = (String)CLS292.MTH4772(0x38EC63DE2B3CD335L, "fakeAmountClass3_field2_urlField", object1);
                    if(!TextUtils.isEmpty(s)) {
                        String s1 = (String)ᵔʾ0.MTH3204()[3];
                        if(!TextUtils.isEmpty(s1)) {
                            if("balance".equals(s)) {
                                Object[] arr_object1 = ᵔʾ0.MTH3204();
                                arr_object1[3] = ٴʿ0.MTH2585(s1, false);
                                return;
                            }
                            if(CLS502.MTH6934(s, new String[]{"lingqiantong"}) || s.equals("lqt")) {
                                Object[] arr_object2 = ᵔʾ0.MTH3204();
                                arr_object2[3] = ٴʿ0.MTH2585(s1, true);
                            }
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2982(Object[] arr_object) {
        Object object1;
        this.FLD1369.getClass();
        CLS29 ˎᵢ0 = this.FLD1369.FLD1445;
        if(ˎᵢ0.MTH938("fake_amount_enable", false) && !this.FLD1369.FLD1447.FLD1407.MTH5947("fake_amount")) {
            String s = ˎᵢ0.MTH925("fake_amount_d", "0.0");
            if(!TextUtils.isEmpty(s)) {
                String s1 = CLS66.MTH1476();
                Object object0 = arr_object[0];
                String s2 = String.format(CLS182.MTH3475(0x38EC60372B3CD335L, CLS182.MTH3483(s1)), Double.valueOf(s));
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
                CLS164.MTH3171(((LinearLayout)((Object[])object1)[0]), s1, s2);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2983(Object[] arr_object) {
        this.FLD1369.getClass();
        if(this.FLD1369.FLD1445.MTH938("disable_nudging", false)) {
            Object object0 = arr_object[0];
            try {
                Method method0 = object0.getClass().getDeclaredMethod("setResult", Object.class);
                method0.setAccessible(true);
                method0.invoke(object0, Boolean.FALSE);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2984(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1369;
        ٴʿ0.getClass();
        if(ٴʿ0.FLD1445.MTH938("fake_amount_enable", false) && (!ٴʿ0.FLD1447.FLD1407.MTH5947("fake_amount") && TextUtils.isEmpty(CLS164.MTH3177("MallWalletSectionCellView")))) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            String s = (String)ᵔʾ0.MTH3204()[0];
            if(!TextUtils.isEmpty(CLS164.MTH3177("WalletLqtDetailUI"))) {
                Object[] arr_object1 = ᵔʾ0.MTH3204();
                arr_object1[0] = ٴʿ0.MTH2585(s, true);
                return;
            }
            if(CLS27.MTH903(0, "fake_money_type") == 1) {
                CLS371 ʻ0 = CLS371.FLD3470;
                String s1 = ʻ0.MTH5334("USERINFO_NEW_BALANCE_LONG");
                if(!TextUtils.isEmpty(s1) && s.equals(s1)) {
                    Object[] arr_object2 = ᵔʾ0.MTH3204();
                    arr_object2[0] = ٴʿ0.MTH2585(s, false);
                    return;
                }
                String s2 = ʻ0.MTH5334("USERINFO_NEW_LQT_LONG");
                if(!TextUtils.isEmpty(s2) && s.equals(s2)) {
                    Object[] arr_object3 = ᵔʾ0.MTH3204();
                    arr_object3[0] = ٴʿ0.MTH2585(s, true);
                    return;
                }
                Object[] arr_object4 = ᵔʾ0.MTH3204();
                arr_object4[0] = ٴʿ0.MTH2585(s, false);
                return;
            }
            Object[] arr_object5 = ᵔʾ0.MTH3204();
            arr_object5[0] = ٴʿ0.MTH2585(s, false);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2985(Object[] arr_object) {
        String s1;
        CLS770 ٴʿ0 = this.FLD1369;
        ٴʿ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        String s = (String)ᵔʾ0.MTH3204()[0];
        if(s.startsWith("android.resource://") && !CLS182.MTH3470(4101761049068098357L) && s.endsWith(CLS27.MTH897("phonering"))) {
            boolean z = ٴʿ0.FLD1447.FLD1438.MTH6895("videocall_ringtone_advanced");
            CLS29 ˎᵢ0 = ٴʿ0.FLD1445;
            if(!z) {
                if(ˎᵢ0.MTH938("videocall_ringtone_enable", false)) {
                    s1 = ˎᵢ0.MTH925("videocall_ringtone", CLS370.MTH5289(4101772237457904437L));
                label_53:
                    if(!TextUtils.isEmpty(s1)) {
                        ᵔʾ0.MTH3204()[0] = s1;
                    }
                }
            }
            else if(!ٴʿ0.FLD1066) {
                if(!ٴʿ0.FLD1061) {
                    if(ˎᵢ0.MTH938("audiocall_" + ٴʿ0.FLD1064 + "_incoming_ringtone_enable", false)) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("audiocall_");
                        s1 = ˎᵢ0.MTH925(CLS34.MTH1074(stringBuilder3, ٴʿ0.FLD1064, 0x38EC6F8D2B3CD335L), CLS370.MTH5289(0x38EC6FA02B3CD335L));
                    }
                    else if(ˎᵢ0.MTH938("audiocall_general_incoming_ringtone_enable", false)) {
                        s1 = ˎᵢ0.MTH925("audiocall_general_incoming_ringtone", CLS370.MTH5289(0x38EC6C702B3CD335L));
                    }
                    else {
                        s1 = null;
                    }
                }
                else if(ˎᵢ0.MTH938("audiocall_" + ٴʿ0.FLD1064 + "_outgoing_ringtone_enable", false)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("audiocall_");
                    s1 = ˎᵢ0.MTH925(CLS34.MTH1074(stringBuilder2, ٴʿ0.FLD1064, 0x38EC6F792B3CD335L), CLS370.MTH5289(0x38EC6F0C2B3CD335L));
                }
                else if(ˎᵢ0.MTH938("audiocall_general_outgoing_ringtone_enable", false)) {
                    s1 = ˎᵢ0.MTH925("audiocall_general_outgoing_ringtone", CLS370.MTH5289(4101776352036574005L));
                }
                else {
                    s1 = null;
                }
                goto label_53;
            }
            else if(!ٴʿ0.FLD1061) {
                if(ˎᵢ0.MTH938("videocall_" + ٴʿ0.FLD1064 + "_incoming_ringtone_enable", false)) {
                    StringBuilder stringBuilder1 = new StringBuilder();
                    stringBuilder1.append("videocall_");
                    s1 = ˎᵢ0.MTH925(CLS34.MTH1074(stringBuilder1, ٴʿ0.FLD1064, 0x38EC6EE52B3CD335L), CLS370.MTH5289(4101775372784030517L));
                }
                else if(ˎᵢ0.MTH938("videocall_general_incoming_ringtone_enable", false)) {
                    s1 = ˎᵢ0.MTH925("videocall_general_incoming_ringtone", CLS370.MTH5289(0x38EC6F482B3CD335L));
                }
                else {
                    s1 = null;
                }
                goto label_53;
            }
            else if(ˎᵢ0.MTH938("videocall_" + ٴʿ0.FLD1064 + "_outgoing_ringtone_enable", false)) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("videocall_");
                s1 = ˎᵢ0.MTH925(CLS34.MTH1074(stringBuilder0, ٴʿ0.FLD1064, 4101774655524492085L), CLS370.MTH5289(4101774737128870709L));
                goto label_53;
            }
            else {
                s1 = ˎᵢ0.MTH938("videocall_general_outgoing_ringtone_enable", false) ? ˎᵢ0.MTH925("videocall_general_outgoing_ringtone", CLS370.MTH5289(4101774530970440501L)) : null;
                goto label_53;
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2986(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1369;
        ٴʿ0.getClass();
        boolean z = false;
        if(CLS27.MTH895().MTH938("set_fake_transfer_amount_enable", false) && ٴʿ0.FLD1447.FLD1438.MTH6895("fake_transfer_amount")) {
            String s = "";
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            Object object0 = ᵔʾ0.MTH3204()[3];
            Intent intent0 = ((Activity)ᵔʾ0.MTH3205()).getIntent();
            String s1 = intent0.getStringExtra("transfer_id");
            int v = intent0.getIntExtra("appmsg_type", 0);
            ٴʿ0.FLD1444.getClass();
            HashMap hashMap0 = null;
            Cursor cursor0 = ٴʿ0.FLD1444.MTH5307("SELECT * FROM message WHERE content LIKE \'%" + s1 + "%\' AND content LIKE \'%paysubtype^>" + v + "%\' ESCAPE \'^\'", null);
            if(cursor0 != null) {
                if(cursor0.moveToFirst()) {
                    while(true) {
                        s = CLS182.MTH3472(0x38EA94BB2B3CD335L, cursor0);
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                    }
                }
                if(!cursor0.isClosed()) {
                    cursor0.close();
                }
                if(!TextUtils.isEmpty(s)) {
                    hashMap0 = CLS434.MTH6191(s);
                }
            }
            if(hashMap0 != null && hashMap0.containsKey(".msg.appmsg.backup")) {
                if(!CLS182.MTH3470(4101765365510230837L)) {
                    try {
                        String s2 = CLS27.MTH897("transferQueryFieldFee");
                        try {
                            double f = CLS166.MTH3187(object0.getClass(), s2).getDouble(object0);
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            CLS27.MTH893(illegalAccessException0);
                            throw new IllegalAccessError(illegalAccessException0.getMessage());
                        }
                        String s3 = ((String)hashMap0.get(".msg.appmsg.wcpayinfo.feedesc")).substring(1);
                        if(!TextUtils.isEmpty(s3) && !s3.equalsIgnoreCase(String.valueOf(f))) {
                            String s4 = CLS27.MTH897("transferQueryFieldFee");
                            double f1 = Double.parseDouble(s3);
                            try {
                                CLS166.MTH3187(object0.getClass(), s4).setDouble(object0, f1);
                            }
                            catch(IllegalAccessException illegalAccessException1) {
                                CLS27.MTH893(illegalAccessException1);
                                throw new IllegalAccessError(illegalAccessException1.getMessage());
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                if(!CLS182.MTH3470(4101765228071277365L)) {
                    try {
                        String s5 = (String)hashMap0.get(".msg.appmsg.wcpayinfo.pay_memo");
                        Object object1 = ((ArrayList)CLS166.MTH3194(object0, CLS27.MTH897("transferQueryFieldDescItemList"))).get(0);
                        String s6 = (String)CLS166.MTH3194(object1, CLS27.MTH892("transferQueryFieldDescItem_contentField", "content"));
                        if(CLS502.MTH6934(s6, new String[]{":"})) {
                            int v2 = 0;
                            for(int v1 = 0; v1 < s6.length(); ++v1) {
                                if(s6.charAt(v1) == 58) {
                                    ++v2;
                                }
                            }
                            if(v2 == 2) {
                                z = true;
                            }
                        }
                        if(!z) {
                            if(!s6.equals(s5)) {
                                CLS166.MTH3198(object1, CLS27.MTH892("transferQueryFieldDescItem_contentField", "content"), s5);
                            }
                        }
                        else if(!TextUtils.isEmpty(s5)) {
                            CLS166.MTH3198(object1, CLS27.MTH892("transferQueryFieldDescItem_titleField", "title"), CLS27.MTH889("transfer_amount_desc"));
                            CLS166.MTH3198(object1, CLS27.MTH892("transferQueryFieldDescItem_contentField", "content"), s5);
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
            }
        }
    }
}

