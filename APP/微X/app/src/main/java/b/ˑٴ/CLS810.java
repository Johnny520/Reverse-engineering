// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS90;
import b.ˈˈ.CLS98;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS292;
import b.ᵔʾ.CLS299;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS529;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS810 implements CLS35 {
    public final int FLD1208;
    public final CLS770 FLD1209;

    public CLS810(CLS770 ٴʿ0, int v) {
        this.FLD1208 = v;
        this.FLD1209 = ٴʿ0;
        super();
    }

    // 此方法包含解密的字符串
    private final void MTH2754(Object[] arr_object) {
        this.FLD1209.getClass();
        if(this.FLD1209.FLD1445.MTH938("mute_shortcut", false)) {
            int v = (int)(((Integer)arr_object[0]));
            int v1 = (int)(((Integer)arr_object[1]));
            ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
            String s = (String)arr_object[3];
            if(!CLS372.MTH5410(s) && !CLS372.MTH5400(s) && !CLS404.MTH5909(s) && contextMenu0.findItem(v) == null) {
                CLS692 ˉᐧ0 = new CLS692(3, s);
                contextMenu0.add(v1, v, 0, CLS27.MTH889(CLS370.MTH5289((CLS372.MTH5396(s) ? 0x38EC6BA42B3CD335L : 0x38EC6BAB2B3CD335L)))).setOnMenuItemClickListener(new CLS142(((CLS3)ˉᐧ0), 23));
                CLS882 ﾞٴ0 = new CLS882(((CLS3)ˉᐧ0), 23);
                CLS21.FLD76.MTH824("onconversationmenu_click", v, ((CLS35)ﾞٴ0));
            }
        }
    }

    private final void MTH2755(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1209;
        ٴʿ0.getClass();
        String s = CLS370.MTH5289(4101767749217080117L);
        if(ٴʿ0.FLD1445.MTH938(s, false)) {
            int v = (int)(((Integer)arr_object[0]));
            int v1 = (int)(((Integer)arr_object[1]));
            ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
            String s1 = (String)arr_object[3];
            if(!CLS372.MTH5410(s1) && !CLS372.MTH5400(s1) && !CLS404.MTH5909(s1) && contextMenu0.findItem(v) == null) {
                CLS846 ⁱˎ0 = new CLS846(ٴʿ0, s1, 1);
                contextMenu0.add(v1, v, 0, CLS27.MTH889(CLS370.MTH5289((CLS426.MTH6126(s1) ? 0x38EC68212B3CD335L : 4101767916720804661L)))).setOnMenuItemClickListener(new CLS142(((CLS3)ⁱˎ0), 20));
                String s2 = CLS370.MTH5289(0x38EC68C02B3CD335L);
                CLS882 ﾞٴ0 = new CLS882(((CLS3)ⁱˎ0), 20);
                CLS21.FLD76.MTH824(s2, v, ((CLS35)ﾞٴ0));
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2756(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1209;
        ٴʿ0.getClass();
        boolean z = CLS412.MTH6002();
        if(ٴʿ0.FLD1445.MTH938("remark_contact_shortcut", z)) {
            int v = (int)(((Integer)arr_object[0]));
            int v1 = (int)(((Integer)arr_object[1]));
            ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
            String s = (String)arr_object[3];
            if(!CLS372.MTH5410(s) && !CLS372.MTH5400(s) && !CLS404.MTH5909(s) && !CLS426.MTH6126(s) && contextMenu0.findItem(v) == null) {
                String s1 = CLS371.FLD3470.MTH5323(s);
                if(!s.equals(CLS27.MTH904()) || !TextUtils.isEmpty(s1)) {
                    CLS702 ˊᵔ0 = new CLS702(ٴʿ0, s1, s, 2);
                    contextMenu0.add(v1, v, 0, CLS27.MTH889("remark")).setOnMenuItemClickListener(new CLS142(((CLS3)ˊᵔ0), 19));
                    CLS882 ﾞٴ0 = new CLS882(((CLS3)ˊᵔ0), 19);
                    CLS21.FLD76.MTH824("onconversationmenu_click", v, ((CLS35)ﾞٴ0));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object23;
        Object object10;
        Object object8;
        String s2;
        Object object4;
        Object object2;
        Object object0 = null;
        CLS770 ٴʿ0 = this.FLD1209;
        switch(this.FLD1208) {
            case 0: {
                ٴʿ0.getClass();
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                int v = (int)(((Integer)ᵔʾ0.MTH3204()[0]));
                int v1 = (int)(((Integer)ᵔʾ0.MTH3204()[1]));
                if(v == 1000) {
                    if(v1 == -1 && Build.VERSION.SDK_INT >= 23 && Settings.canDrawOverlays(((CLS140)ٴʿ0).MTH3042())) {
                        ٴʿ0.FLD1067.MTH1728();
                    }
                    ᵔʾ0.MTH3207(null);
                }
                return;
            }
            case 1: {
                ٴʿ0.getClass();
                Object object1 = arr_object[0];
                try {
                    Field field0 = object1.getClass().getDeclaredField("thisObject");
                    object2 = null;
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object2 = field0.get(object1);
                    }
                }
                catch(Throwable unused_ex) {
                }
                Activity activity0 = (Activity)object2;
                String s = CLS412.MTH6009(activity0);
                if(!ٴʿ0.FLD1445.MTH938("hideInfoOptions", false) && !CLS481.MTH6698() && s.endsWith("RemittanceBusiUI") && ٴʿ0.FLD1445.MTH938("show_view_id", false)) {
                    Intent intent0 = activity0.getIntent();
                    if(intent0.hasExtra("receiver_name")) {
                        String s1 = intent0.getStringExtra("receiver_name");
                        if(!TextUtils.isEmpty(s1) && !s1.startsWith("wxp://")) {
                            if(object2 == null) {
                                try {
                                    Field field1 = object1.getClass().getDeclaredField("thisObject");
                                    if(field1 != null) {
                                        field1.setAccessible(true);
                                        object0 = field1.get(object1);
                                    }
                                label_33:
                                    object2 = object0;
                                }
                                catch(Throwable unused_ex) {
                                    goto label_33;
                                }
                            }
                            CLS166.MTH3195(object2, CLS27.MTH892("addTextOptionMenu", "a"), new Object[]{2000, CLS27.MTH889("view_id"), new CLS529(activity0, s1, 2)});
                        }
                    }
                }
                return;
            }
            case 2: {
                ٴʿ0.getClass();
                Object object3 = arr_object[0];
                try {
                    Field field2 = object3.getClass().getDeclaredField("args");
                    object4 = null;
                    if(field2 != null) {
                        field2.setAccessible(true);
                        object4 = field2.get(object3);
                    }
                }
                catch(Throwable unused_ex) {
                }
                Intent intent1 = (Intent)((Object[])object4)[0];
                if(intent1 == null) {
                    s2 = CLS370.MTH5289(4101264568028549941L);
                }
                else {
                    ComponentName componentName0 = intent1.getComponent();
                    s2 = componentName0 == null ? CLS370.MTH5289(0x38EA9E662B3CD335L) : componentName0.getClassName();
                }
                CLS29 ˎᵢ0 = ٴʿ0.FLD1445;
                if(ˎᵢ0.MTH938("MultiWebView", false) && (s2.equals(CLS27.MTH897("WebViewUI")) || s2.endsWith("TmplWebViewTooLMpUI") || s2.endsWith("WebViewUI") || s2.endsWith("TmplWebViewToolUI") || s2.endsWith("TmplWebViewMMUI"))) {
                    if(Build.VERSION.SDK_INT >= 21) {
                        intent1.addFlags(0x80000);
                    }
                    intent1.addFlags(0x8000000);
                }
                if(ˎᵢ0.MTH938("BizConversationUI_enable", false) && (s2.endsWith("BizTimeLineUI") || s2.endsWith("BizFlutterTLFlutterViewActivity"))) {
                    try {
                        Field field3 = object3.getClass().getDeclaredField("thisObject");
                        if(field3 != null) {
                            field3.setAccessible(true);
                            object0 = field3.get(object3);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(CLS27.MTH890("BizConversationUI")) {
                        intent1.setClassName(CLS390.MTH5619(((Activity)object0)), CLS27.MTH897(CLS370.MTH5289(0x38EC42942B3CD335L)));
                        return;
                    }
                    if(CLS27.MTH890("NewBizConversationUI")) {
                        intent1.setClassName(CLS390.MTH5619(((Activity)object0)), CLS27.MTH897(CLS370.MTH5289(4101726732279403317L)));
                    }
                }
                return;
            }
            case 3: {
                ٴʿ0.getClass();
                CLS29 ˎᵢ1 = ٴʿ0.FLD1445;
                if(ˎᵢ1.MTH938("auto_clear_cache", false) && ٴʿ0.FLD1447.FLD1438.MTH6895("auto_clear_cache")) {
                    Context context0 = CLS27.MTH900();
                    if(context0 != null) {
                        File file0 = context0.getCacheDir();
                        if(CLS31.MTH1001(file0) && file0.canWrite() && CLS31.MTH1031(file0) >= ˎᵢ1.MTH936(500000000L, "clear_cache_size")) {
                            CLS31.MTH1005(file0);
                        }
                    }
                }
                return;
            }
            case 4: {
                ٴʿ0.getClass();
                ٴʿ0.FLD1065.add(((CLS12)arr_object[0]));
                try {
                    Intent intent2 = new Intent();
                    intent2.putExtra("map_view_type", 8);
                    intent2.setClassName(((CLS140)ٴʿ0).MTH3042(), CLS27.MTH897("RedirectUI"));
                    ((CLS140)ٴʿ0).MTH3042().startActivityForResult(intent2, 0x201);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 5: {
                ٴʿ0.getClass();
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                int v2 = (int)(((Integer)ᵔʾ1.MTH3204()[0]));
                ((Integer)ᵔʾ1.MTH3204()[1]).intValue();
                Intent intent3 = (Intent)ᵔʾ1.MTH3204()[2];
                if(v2 == 0x201) {
                    ᵔʾ1.MTH3207(null);
                    if(intent3 != null) {
                        try {
                            HashMap hashMap0 = new HashMap();
                            Parcelable parcelable0 = intent3.getParcelableExtra("KLocationIntent");
                            Method method0 = CLS164.MTH3174(parcelable0, "", String.class, new Object[0]);
                            if(method0 != null) {
                                String[] arr_s = ((String)CLS164.MTH3178(parcelable0, method0, new Object[0])).split(";");
                                for(int v3 = 0; v3 < arr_s.length; ++v3) {
                                    String[] arr_s1 = arr_s[v3].split(" ");
                                    if(arr_s1.length > 1) {
                                        hashMap0.put(arr_s1[0].trim(), arr_s1[1].trim());
                                    }
                                }
                            }
                            HashMap hashMap1 = new HashMap();
                            String[] arr_s2 = ("" + intent3.getParcelableExtra("key_pick_addr")).split(",");
                            for(int v4 = 0; v4 < arr_s2.length; ++v4) {
                                String[] arr_s3 = arr_s2[v4].split("=");
                                if(arr_s3.length > 1) {
                                    hashMap1.put(arr_s3[0].trim(), arr_s3[1].replaceAll("\'", ""));
                                }
                                else {
                                    hashMap1.put(arr_s3[0].trim(), "");
                                }
                            }
                            if(hashMap0.containsKey("poiid")) {
                                hashMap1.put("poiid", ((String)hashMap0.get("poiid")));
                            }
                            HashSet hashSet0 = ٴʿ0.FLD1065;
                            for(Object object5: hashSet0) {
                                ((CLS12)object5).MTH791(hashMap1);
                            }
                            hashSet0.clear();
                            return;
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                    }
                }
                return;
            }
            case 6: {
                ٴʿ0.getClass();
                Object object6 = arr_object[0];
                if(CLS27.MTH895().MTH938("fake_friendreq_amount_enable", false) && ٴʿ0.FLD1447.FLD1438.MTH6895("fake_friendreq_amount")) {
                    try {
                        Field field4 = object6.getClass().getDeclaredField("args");
                        if(field4 != null) {
                            field4.setAccessible(true);
                            object0 = field4.get(object6);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    ((Object[])object0)[0] = CLS27.MTH895().MTH927(0, "fake_friendreq_amount_number");
                }
                return;
            }
            case 7: {
                ٴʿ0.getClass();
                if(CLS27.MTH895().MTH938("scan_gallery_to_camera", false) && ٴʿ0.FLD1447.FLD1438.MTH6895("scan_gallery_to_camera")) {
                    CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                    if(ᵔʾ2.MTH3204().length >= 3 && ᵔʾ2.MTH3204()[0] instanceof Activity) {
                        if(((int)(((Integer)ᵔʾ2.MTH3204()[2]))) == 1) {
                            ᵔʾ2.MTH3204()[2] = 0;
                        }
                        if(ᵔʾ2.MTH3204()[3] instanceof Integer && ((int)(((Integer)ᵔʾ2.MTH3204()[3]))) == 34) {
                            ᵔʾ2.MTH3204()[3] = 4;
                        }
                    }
                }
                return;
            }
            case 8: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("chat_always_show_time", false) && CLS27.MTH890("ChattingDataAdapterField1")) {
                    Object object7 = arr_object[0];
                    try {
                        Field field5 = object7.getClass().getDeclaredField("args");
                        object8 = null;
                        if(field5 != null) {
                            field5.setAccessible(true);
                            object8 = field5.get(object7);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    int v5 = (int)(((Integer)((Object[])object8)[0]));
                    try {
                        Field field6 = object7.getClass().getDeclaredField("thisObject");
                        if(field6 != null) {
                            field6.setAccessible(true);
                            object0 = field6.get(object7);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    ((SparseIntArray)CLS182.MTH3492(0x38EC45422B3CD335L, object0)).put(v5, 1);
                }
                return;
            }
            case 9: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("chat_always_show_time", false)) {
                    Object object9 = arr_object[0];
                    try {
                        Field field7 = object9.getClass().getDeclaredField("args");
                        object10 = null;
                        if(field7 != null) {
                            field7.setAccessible(true);
                            object10 = field7.get(object9);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    int v6 = (int)(((Integer)((Object[])object10)[1]));
                    try {
                        Field field8 = object9.getClass().getDeclaredField("thisObject");
                        if(field8 != null) {
                            field8.setAccessible(true);
                            object0 = field8.get(object9);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    ((SparseIntArray)CLS182.MTH3492(0x38EC44F62B3CD335L, object0)).put(v6, 1);
                }
                return;
            }
            case 10: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("chat_always_show_time", false) || ٴʿ0.FLD1445.MTH938("show_time_detailed", false) || (CLS21.FLD76.MTH830("isThemeEnable", new Object[]{"showChatTimeTVDetailed"}) || CLS27.MTH895().MTH938("show_chatroom_mod_label", false)) || CLS27.MTH895().MTH938("show_realname_label_enable", false) && CLS500.FLD4928.MTH6895("show_realname")) {
                    CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                    int v7 = (int)(((Integer)ᵔʾ3.MTH3204()[2]));
                    View view0 = (View)CLS182.MTH3492(4101732440290939701L, ᵔʾ3.MTH3204()[0]);
                    if(view0 != null) {
                        Object object11 = view0.getTag();
                        Object object12 = CLS166.MTH3195(CLS182.MTH3492(4101732015089177397L, ᵔʾ3.MTH3205()), CLS27.MTH892("ChattingDataAdapterV3_getItem", "getItem"), new Object[]{v7});
                        long v8 = CLS27.MTH890("msgClass_getCreateTime") ? ((long)(((Long)CLS166.MTH3195(object12, CLS27.MTH897("msgClass_getCreateTime"), new Object[0])))) : CLS166.MTH3185(object12, "field_createTime");
                        int v9 = CLS166.MTH3181(object12, "field_isSend");
                        TextView textView0 = (TextView)CLS292.MTH4772(4101728355777041205L, "ChattingDataAdapterV3_timeTV", object11);
                        ViewParent viewParent0 = textView0.getParent();
                        if(viewParent0 != null && !(viewParent0 instanceof LinearLayout)) {
                            ٴʿ0.MTH2589(textView0, v9, v8);
                            TextView textView1 = (TextView)CLS292.MTH4772(4101729060151677749L, "ChattingDataAdapterV3_userTV", object11);
                            if(textView1 != null && textView1.getVisibility() == 0) {
                                CLS770.MTH2588(textView1, v9, object12);
                            }
                        }
                    }
                }
                return;
            }
            case 11: {
                if(!ٴʿ0.FLD1447.FLD1407.MTH5947("_config_fav_floatvideo")) {
                    int v10 = (int)(((Integer)arr_object[0]));
                    ContextMenu contextMenu0 = (ContextMenu)arr_object[1];
                    Object object13 = arr_object[2];
                    Object object14 = arr_object[3];
                    switch(CLS166.MTH3181(object13, "field_type")) {
                        case 4: 
                        case 16: {
                            Class class0 = CLS27.MTH894("favClass2");
                            if(class0 != null && contextMenu0.findItem(v10) == null && ٴʿ0.FLD1445.MTH938("float_video_enable", false)) {
                                contextMenu0.add(0, v10, 0, CLS27.MTH889("float_video")).setOnMenuItemClickListener(new CLS103(ٴʿ0, class0, object14, 0));
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
            case 12: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("chat_always_show_time", false) || ٴʿ0.FLD1445.MTH938("show_time_detailed", false) || (CLS21.FLD76.MTH830("isThemeEnable", new Object[]{"showChatTimeTVDetailed"}) || CLS27.MTH895().MTH938("show_chatroom_mod_label", false)) || CLS27.MTH895().MTH938("show_realname_label_enable", false) && CLS500.FLD4928.MTH6895("show_realname")) {
                    CLS167 ᵔʾ4 = new CLS167(arr_object[0]);
                    int v11 = (int)(((Integer)ᵔʾ4.MTH3204()[1]));
                    View view1 = (View)CLS182.MTH3492(0x38EC46062B3CD335L, ᵔʾ4.MTH3204()[0]);
                    if(view1 != null) {
                        Object object15 = view1.getTag();
                        Object object16 = CLS166.MTH3195(ᵔʾ4.MTH3205(), CLS27.MTH892("ChattingDataAdapterV2_getItem", "getItem"), new Object[]{v11});
                        long v12 = CLS27.MTH890("msgClass_getCreateTime") ? ((long)(((Long)CLS166.MTH3195(object16, CLS27.MTH897("msgClass_getCreateTime"), new Object[0])))) : CLS166.MTH3185(object16, "field_createTime");
                        int v13 = CLS166.MTH3181(object16, "field_isSend");
                        TextView textView2 = (TextView)CLS292.MTH4772(4101731091671208757L, "ChattingDataAdapterV2_timeTV", object15);
                        ViewParent viewParent1 = textView2.getParent();
                        if(viewParent1 != null && !(viewParent1 instanceof LinearLayout)) {
                            ٴʿ0.MTH2589(textView2, v13, v12);
                            TextView textView3 = (TextView)CLS292.MTH4772(4101731796045845301L, "ChattingDataAdapterV2_userTV", object15);
                            if(textView3 != null && textView3.getVisibility() == 0) {
                                CLS770.MTH2588(textView3, v13, object16);
                            }
                        }
                    }
                }
                return;
            }
            case 13: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("chat_always_show_time", false) || ٴʿ0.FLD1445.MTH938("show_time_detailed", false) || (CLS21.FLD76.MTH830("isThemeEnable", new Object[]{"showChatTimeTVDetailed"}) || CLS27.MTH895().MTH938("show_chatroom_mod_label", false)) || CLS27.MTH895().MTH938("show_realname_label_enable", false) && CLS500.FLD4928.MTH6895("show_realname")) {
                    CLS167 ᵔʾ5 = new CLS167(arr_object[0]);
                    int v14 = (int)(((Integer)ᵔʾ5.MTH3204()[0]));
                    View view2 = (View)ᵔʾ5.MTH3204()[1];
                    Object object17 = CLS166.MTH3195(ᵔʾ5.MTH3205(), CLS27.MTH892("ChattingDataAdapter_getItem", "getItem"), new Object[]{v14});
                    long v15 = CLS27.MTH890("msgClass_getCreateTime") ? ((long)(((Long)CLS166.MTH3195(object17, CLS27.MTH897("msgClass_getCreateTime"), new Object[0])))) : CLS166.MTH3185(object17, "field_createTime");
                    int v16 = CLS166.MTH3181(object17, "field_isSend");
                    if(view2 == null) {
                        Class class1 = CLS27.MTH894("ChattingItemFactoryClass");
                        Object object18 = CLS182.MTH3492(4101751540010505013L, ᵔʾ5.MTH3205());
                        view2 = (View)CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("ChattingItemFactoryClass_method1"), new Object[]{object17}), CLS27.MTH897("avatarClass3_inflateViewMethod"), new Object[]{object18, null});
                    }
                    if(view2 != null) {
                        Object object19 = view2.getTag();
                        TextView textView4 = (TextView)CLS292.MTH4772(4101752102651220789L, "ChattingDataAdapter_timeTV", object19);
                        ViewParent viewParent2 = textView4.getParent();
                        if(viewParent2 != null && !(viewParent2 instanceof LinearLayout)) {
                            ٴʿ0.MTH2589(textView4, v16, v15);
                            TextView textView5 = (TextView)CLS292.MTH4772(0x38EC59F02B3CD335L, "ChattingDataAdapter_userTV", object19);
                            if(textView5 != null && textView5.getVisibility() == 0) {
                                CLS770.MTH2588(textView5, v16, object17);
                            }
                        }
                    }
                }
                return;
            }
            case 14: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("disable_wechat_ads_enable", false)) {
                    CLS167 ᵔʾ6 = new CLS167(arr_object[0]);
                    String s3 = (String)ᵔʾ6.MTH3204()[0];
                    if("BizTimeLineOpenStatus".equalsIgnoreCase(s3) || "BizTimeLineAdOpen".equalsIgnoreCase(s3)) {
                        ᵔʾ6.MTH3207(0);
                    }
                }
                return;
            }
            case 15: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("url_open_browser_enable", false) || ٴʿ0.FLD1445.MTH938("article_open_browser_enable", false)) {
                    CLS167 ᵔʾ7 = new CLS167(arr_object[0]);
                    ٴʿ0.MTH2584(ᵔʾ7, ((String)ᵔʾ7.MTH3204()[1]), ((String)ᵔʾ7.MTH3204()[2]), ((Intent)ᵔʾ7.MTH3204()[3]));
                }
                return;
            }
            case 16: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("url_open_browser_enable", false) || ٴʿ0.FLD1445.MTH938("article_open_browser_enable", false)) {
                    CLS167 ᵔʾ8 = new CLS167(arr_object[0]);
                    ٴʿ0.MTH2584(ᵔʾ8, ((String)ᵔʾ8.MTH3204()[1]), ((String)ᵔʾ8.MTH3204()[2]), ((Intent)ᵔʾ8.MTH3204()[4]));
                }
                return;
            }
            case 17: {
                if(!ٴʿ0.FLD1447.FLD1407.MTH5947("_config_fav_floatvideo")) {
                    int v17 = (int)(((Integer)arr_object[0]));
                    CLS98 ﾞᐧ0 = (CLS98)arr_object[1];
                    Object object20 = arr_object[2];
                    Object object21 = arr_object[3];
                    switch(CLS166.MTH3181(object20, "field_type")) {
                        case 4: 
                        case 16: {
                            Class class2 = CLS27.MTH894("favClass2");
                            if(class2 != null && ﾞᐧ0.MTH1774(v17) == null && ٴʿ0.FLD1445.MTH938("float_video_enable", false)) {
                                ﾞᐧ0.MTH1770(0, v17, CLS27.MTH889("float_video"), CLS27.MTH897("icons_outlined_share"), v17).setOnMenuItemClickListener(new CLS103(ٴʿ0, class2, object21, 1));
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
            case 18: {
                ٴʿ0.getClass();
                if("float_video".equals(((String)arr_object[0]))) {
                    CLS90 ᐧⁱ0 = ٴʿ0.FLD1067;
                    if(ᐧⁱ0 != null) {
                        ᐧⁱ0.MTH1727();
                    }
                    CLS466.MTH6545(("sns_table_" + ((long)(((Long)arr_object[1])))), ((CLS13)new CLS1229(19, ٴʿ0)));
                }
                return;
            }
            case 19: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("webwx_auto_confirm", false)) {
                    Object object22 = arr_object[0];
                    try {
                        Field field9 = object22.getClass().getDeclaredField("thisObject");
                        object23 = null;
                        if(field9 != null) {
                            field9.setAccessible(true);
                            object23 = field9.get(object22);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(CLS412.MTH6009(((Activity)object23)).endsWith("ExtDeviceWXLoginUI")) {
                        Intent intent4 = ((Activity)object23).getIntent();
                        String s4 = intent4.getStringExtra("intent.key.login.url");
                        String s5 = intent4.getStringExtra("intent.key.ok.session.list");
                        try {
                            if(CLS27.MTH890("webwxConfirmationClass_b")) {
                                object0 = CLS166.MTH3188(CLS27.MTH894("webwxConfirmationClass_b"), new Object[]{s4, s5, Boolean.TRUE, Boolean.TRUE});
                            }
                            else if(CLS27.MTH890("webwxConfirmationClass")) {
                                object0 = CLS166.MTH3188(CLS27.MTH894("webwxConfirmationClass"), new Object[]{s4, s5, Boolean.TRUE});
                            }
                        }
                        catch(Throwable throwable2) {
                            CLS27.MTH893(throwable2);
                        }
                        if(object0 != null) {
                            CLS66.MTH1521(object0);
                        }
                    }
                }
                return;
            }
            case 20: {
                this.MTH2761(arr_object);
                return;
            }
            case 21: {
                this.MTH2760(arr_object);
                return;
            }
            case 22: {
                this.MTH2762(arr_object);
                return;
            }
            case 23: {
                this.MTH2759(arr_object);
                return;
            }
            case 24: {
                this.MTH2764(arr_object);
                return;
            }
            case 25: {
                this.MTH2763(arr_object);
                return;
            }
            case 26: {
                this.MTH2755(arr_object);
                return;
            }
            case 27: {
                this.MTH2756(arr_object);
                return;
            }
            case 28: {
                this.MTH2754(arr_object);
                return;
            }
            default: {
                this.MTH2758(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2758(Object[] arr_object) {
        this.FLD1209.getClass();
        boolean z = CLS412.MTH6002();
        if(this.FLD1209.FLD1445.MTH938("set_star_contact_shortcut", z)) {
            int v = (int)(((Integer)arr_object[0]));
            int v1 = (int)(((Integer)arr_object[1]));
            ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
            String s = (String)arr_object[3];
            if(!CLS372.MTH5410(s) && !CLS372.MTH5400(s) && !CLS404.MTH5909(s) && contextMenu0.findItem(v) == null) {
                CLS692 ˉᐧ0 = new CLS692(1, s);
                contextMenu0.add(v1, v, 0, CLS27.MTH889(CLS370.MTH5289((CLS66.MTH1392(s) ? 4101771941105161013L : 4101772022709539637L)))).setOnMenuItemClickListener(new CLS142(((CLS3)ˉᐧ0), 21));
                CLS882 ﾞٴ0 = new CLS882(((CLS3)ˉᐧ0), 21);
                CLS21.FLD76.MTH824("onconversationmenu_click", v, ((CLS35)ﾞٴ0));
            }
        }
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    private final void MTH2759(Object[] arr_object) {
        int v = 0;
        CLS770 ٴʿ0 = this.FLD1209;
        ٴʿ0.getClass();
        String s = (String)arr_object[2];
        ContentValues contentValues0 = (ContentValues)arr_object[3];
        if("message".equalsIgnoreCase(s) && contentValues0.containsKey("type") && contentValues0.containsKey("msgId") && ((contentValues0.containsKey("isSend") ? CLS182.MTH3474(4101727952050115381L, contentValues0) : 0) != 1 && CLS182.MTH3474(0x38EC43DE2B3CD335L, contentValues0) == 0x41000031)) {
            CLS29 ˎᵢ0 = ٴʿ0.FLD1445;
            if(ˎᵢ0.MTH938("auto_download_chat_file", false) && (ٴʿ0.FLD1447.FLD1438.MTH6895("auto_download_chat_media") && (!ˎᵢ0.MTH938("auto_download_media_wifi_only", false) || !CLS613.MTH1965(CLS27.MTH900())))) {
                String s1 = contentValues0.getAsString("talker");
                String s2 = ˎᵢ0.MTH925("auto_download_chat_file_excl", "");
                String s3 = ˎᵢ0.MTH925("auto_download_chat_file_incl", "");
                if((TextUtils.isEmpty(s2) || !CLS502.MTH6934(s2, new String[]{s1})) && (TextUtils.isEmpty(s3) || CLS502.MTH6934(s3, new String[]{s1}))) {
                    Long long0 = contentValues0.getAsLong("msgId");
                    HashMap hashMap0 = CLS392.MTH5633(CLS66.MTH1490(((long)long0)), "msg");
                    if(!TextUtils.isEmpty(((String)hashMap0.get(".msg.appmsg.appattach.attachid"))) && Integer.parseInt(((String)hashMap0.get(".msg.appmsg.type"))) == 6) {
                        if(CLS21.FLD76.MTH830("isAutoForward", new Object[]{contentValues0})) {
                            v = 10000;
                        }
                        CLS299.FLD3110.MTH4858(((long)long0), ((long)v));
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2760(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1209;
        ٴʿ0.getClass();
        Object object0 = arr_object[2];
        if(object0 != null) {
            boolean z = CLS412.MTH6002();
            CLS29 ˎᵢ0 = ٴʿ0.FLD1445;
            if(ˎᵢ0.MTH938("send_search_image", z) && ˎᵢ0.MTH938("send_search_image_longclick", CLS412.MTH6002()) && !CLS182.MTH3470(0x38EC40812B3CD335L)) {
                Object object1 = CLS182.MTH3492(0x38EC408E2B3CD335L, object0);
                if(object1 != null) {
                    CLS166.MTH3195(object1, "setOnLongClickListener", new Object[]{new CLS135(ٴʿ0, 0)});
                }
            }
            if(ˎᵢ0.MTH938("plusShowChatOptions", true) && CLS27.MTH890("chatting_attach_btn")) {
                Object object2 = CLS182.MTH3492(0x38EC415A2B3CD335L, object0);
                if(object2 != null) {
                    CLS166.MTH3195(object2, "setOnLongClickListener", new Object[]{new CLS135(ٴʿ0, 1)});
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2761(Object[] arr_object) {
        Object object1;
        CLS770 ٴʿ0 = this.FLD1209;
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
        String s = CLS412.MTH6009(((Activity)object1));
        CLS139 ﹶʼ0 = ٴʿ0.FLD1447;
        CLS29 ˎᵢ0 = ٴʿ0.FLD1445;
        if(s.endsWith("AlbumPreviewUI")) {
            Intent intent0 = ((Activity)object1).getIntent();
            if(ˎᵢ0.MTH938("remove_max_limit", CLS412.MTH6002())) {
                intent0.putExtra("max_select_count", 1000);
            }
            if(ﹶʼ0.FLD1438.MTH6895("send_raw_image") && ˎᵢ0.MTH938("send_raw_image", CLS412.MTH6002())) {
                intent0.putExtra("GalleryUI_SkipVideoSizeLimit", true);
                intent0.putExtra("key_send_raw_image", true);
            }
        }
        else {
            if((s.endsWith("ImagePreviewUI") || s.endsWith("GalleryEntryUI")) && (ﹶʼ0.FLD1438.MTH6895("send_raw_image") && ˎᵢ0.MTH938("send_raw_image", CLS412.MTH6002()))) {
                Intent intent1 = ((Activity)object1).getIntent();
                intent1.putExtra("key_send_raw_image", true);
                intent1.putExtra("send_raw_img", true);
                intent1.putExtra("GalleryUI_SkipVideoSizeLimit", true);
            }
            if((s.endsWith("SelectConversationUI") || s.endsWith("SelectContactUI")) && ˎᵢ0.MTH938("remove_max_limit", CLS412.MTH6002())) {
                ((Activity)object1).getIntent().putExtra("max_limit_num", 6000);
            }
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    private final void MTH2762(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1209;
        CLS139 ﹶʼ0 = ٴʿ0.FLD1447;
        if(!ﹶʼ0.FLD1410 && "message".equalsIgnoreCase(((String)arr_object[2]))) {
            ContentValues contentValues0 = (ContentValues)arr_object[3];
            if((contentValues0.containsKey("isSend") ? CLS182.MTH3474(4101724606270591797L, contentValues0) : 0) != 1) {
                boolean z = "gh_43f2581f6fd6".equals(contentValues0.getAsString("talker"));
                CLS500 ᵢﹶ0 = ﹶʼ0.FLD1438;
                if(z && ᵢﹶ0.MTH6895("werun_like_all") && CLS27.MTH895().MTH938("werun_autolike_enable", false) && !CLS481.MTH6686(ٴʿ0.FLD1068, contentValues0)) {
                    CLS1225 ʻˏ0 = new CLS1225(13);
                    CLS40.FLD157.MTH1123(((CLS39)ʻˏ0), 60000L);
                }
                if(ᵢﹶ0.MTH6895("auto_download_chat_media")) {
                    CLS29 ˎᵢ0 = ٴʿ0.FLD1445;
                    if(!ˎᵢ0.MTH938("auto_download_media_wifi_only", false) || !CLS613.MTH1965(CLS27.MTH900())) {
                        int v = CLS182.MTH3474(0x38EC7AF82B3CD335L, contentValues0);
                        int v1 = CLS21.FLD76.MTH830("isAutoForward", new Object[]{contentValues0}) ? 30000 : 0;
                        String s = contentValues0.getAsString("talker");
                        long v2 = CLS34.MTH1080(0x38EC7A922B3CD335L, contentValues0);
                        switch(v) {
                            case 3: {
                                if(ˎᵢ0.MTH938("auto_download_chat_img", false)) {
                                    String s3 = ˎᵢ0.MTH925("auto_download_chat_img_excl2", "");
                                    String s4 = ˎᵢ0.MTH925("auto_download_chat_img_incl2", "");
                                    if(!TextUtils.isEmpty(s3) && CLS502.MTH6934(s3, new String[]{s}) || !TextUtils.isEmpty(s4) && !CLS502.MTH6934(s4, new String[]{s})) {
                                        return;
                                    }
                                    CLS299.FLD3110.MTH4858(v2, ((long)v1));
                                    return;
                                }
                                break;
                            }
                            case 43: 
                            case 62: {
                                if(ˎᵢ0.MTH938("auto_download_chat_vid", false)) {
                                    String s1 = ˎᵢ0.MTH925("auto_download_chat_vid_excl", "");
                                    String s2 = ˎᵢ0.MTH925("auto_download_chat_vid_incl", "");
                                    if(!TextUtils.isEmpty(s1) && CLS502.MTH6934(s1, new String[]{s}) || !TextUtils.isEmpty(s2) && !CLS502.MTH6934(s2, new String[]{s})) {
                                        return;
                                    }
                                    CLS299.FLD3110.MTH4858(v2, ((long)v1));
                                    return;
                                }
                                break;
                            }
                            case 49: 
                            case 0x41000031: {
                                if(ˎᵢ0.MTH938("auto_download_chat_file", false)) {
                                    String s5 = ˎᵢ0.MTH925("auto_download_chat_file_excl", "");
                                    String s6 = ˎᵢ0.MTH925("auto_download_chat_file_incl", "");
                                    if((TextUtils.isEmpty(s5) || !CLS502.MTH6934(s5, new String[]{s})) && (TextUtils.isEmpty(s6) || CLS502.MTH6934(s6, new String[]{s}))) {
                                        HashMap hashMap0 = CLS392.MTH5633(CLS66.MTH1490(v2), "msg");
                                        if(!TextUtils.isEmpty(((String)hashMap0.get(".msg.appmsg.appattach.attachid")))) {
                                            switch(Integer.parseInt(((String)hashMap0.get(".msg.appmsg.type")))) {
                                                case 6: 
                                                case 74: {
                                                    CLS299.FLD3110.MTH4858(v2, ((long)v1));
                                                    break;
                                                }
                                                default: {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2763(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1209;
        ٴʿ0.getClass();
        boolean z = CLS412.MTH6002();
        if(ٴʿ0.FLD1445.MTH938("moments_shortcut", z)) {
            int v = (int)(((Integer)arr_object[0]));
            int v1 = (int)(((Integer)arr_object[1]));
            ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
            String s = (String)arr_object[3];
            if(!CLS372.MTH5410(s) && !CLS426.MTH6126(s) && !CLS372.MTH5400(s) && !CLS404.MTH5909(s) && contextMenu0.findItem(v) == null) {
                CLS846 ⁱˎ0 = new CLS846(ٴʿ0, s, 3);
                contextMenu0.add(v1, v, 0, CLS27.MTH889("moments")).setOnMenuItemClickListener(new CLS142(((CLS3)ⁱˎ0), 25));
                CLS882 ﾞٴ0 = new CLS882(((CLS3)ⁱˎ0), 25);
                CLS21.FLD76.MTH824("onconversationmenu_click", v, ((CLS35)ﾞٴ0));
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2764(Object[] arr_object) {
        this.FLD1209.getClass();
        if(this.FLD1209.FLD1445.MTH938("mass_delete_conversation_shortcut", false) && CLS182.MTH3470(0x38EC68AD2B3CD335L)) {
            int v = (int)(((Integer)arr_object[0]));
            int v1 = (int)(((Integer)arr_object[1]));
            ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
            String s = (String)arr_object[3];
            if(!CLS404.MTH5909(s) && contextMenu0.findItem(v) == null) {
                CLS692 ˉᐧ0 = new CLS692(2, s);
                contextMenu0.add(v1, v, 0, CLS27.MTH889("delete_conversation_keep_history")).setOnMenuItemClickListener(new CLS142(((CLS3)ˉᐧ0), 22));
                CLS882 ﾞٴ0 = new CLS882(((CLS3)ˉᐧ0), 22);
                CLS21.FLD76.MTH824("onconversationmenu_click", v, ((CLS35)ﾞٴ0));
            }
        }
    }
}

