// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ˆʿ.CLS47;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS98;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ٴـ.CLS171;
import b.ٴـ.CLS896;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS708 implements CLS35 {
    public final int FLD836;
    public final CLS139 FLD837;

    public CLS708(CLS139 ﹶʼ0, int v) {
        this.FLD836 = v;
        this.FLD837 = ﹶʼ0;
        super();
    }

    // 此方法包含解密的字符串
    private final void MTH2331(Object[] arr_object) {
        CLS139 ﹶʼ0 = this.FLD837;
        ﹶʼ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        try {
            CLS21 ʾᵢ0 = CLS21.FLD76;
            if(!ʾᵢ0.MTH830("isCreateOptionsMenuInMain", new Object[]{ᵔʾ0.MTH3205()})) {
                Menu menu0 = (Menu)ᵔʾ0.MTH3204()[0];
                String s = ʾᵢ0.MTH826("getCurrentTalker", new Object[]{ᵔʾ0.MTH3205()});
                if(!ﹶʼ0.FLD1431.MTH938("hideChatOptions", true) && !CLS481.MTH6698()) {
                    ArrayList arrayList0 = ʾᵢ0.MTH832("specialModes.options", new Object[0]);
                    int v = 20001;
                    if(arrayList0 != null && !arrayList0.isEmpty()) {
                        if(menu0.findItem(20001) == null) {
                            menu0.add(0, 20001, 0, CLS27.MTH889("specialModes")).setOnMenuItemClickListener(new CLS134(4, ﹶʼ0));
                        }
                        v = 20002;
                    }
                    ArrayList arrayList1 = ʾᵢ0.MTH832("chattingui.optionsmenu.options", new Object[]{s});
                    if(arrayList1 != null && !arrayList1.isEmpty()) {
                        for(Object object0: arrayList1) {
                            Pair pair0 = (Pair)object0;
                            if(menu0.findItem(v) == null) {
                                menu0.add(0, v, 0, ((CharSequence)pair0.first)).setOnMenuItemClickListener(new CLS114(pair0, s, 0));
                            }
                            ++v;
                        }
                    }
                }
                CLS21.FLD76.MTH817("themes", "a.chattingui.oncreateoptionsmenu2", new Object[]{menu0, ᵔʾ0.FLD1585, s});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2332(Object[] arr_object) {
        CLS139 ﹶʼ0 = this.FLD837;
        ﹶʼ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        ﹶʼ0.FLD1423 = new WeakReference(ᵔʾ0.MTH3205());
        if(!CLS182.MTH3470(0x38EC073E2B3CD335L)) {
            ﹶʼ0.FLD1439 = CLS182.MTH3492(0x38EC07CF2B3CD335L, ᵔʾ0.MTH3205());
        }
        if(!CLS182.MTH3470(4101662020007154485L)) {
            ﹶʼ0.FLD1429 = CLS182.MTH3492(0x38EC07FF2B3CD335L, ᵔʾ0.MTH3205());
            if(!CLS182.MTH3470(0x38EC079E2B3CD335L)) {
                Class class0 = CLS27.MTH894("ChatFooterComponentClass1");
                if(class0 != null) {
                    Object object0 = CLS166.MTH3195((CLS27.MTH890("ChattingComponentManagerField1_field1") ? CLS182.MTH3492(0x38EC04002B3CD335L, ﹶʼ0.FLD1429) : ﹶʼ0.FLD1429), CLS27.MTH897("ChattingComponentManagerGetMethod"), new Object[]{class0});
                    if(object0 != null) {
                        if(CLS27.MTH890("getChatFooterMethod_b")) {
                            ﹶʼ0.FLD1413 = CLS166.MTH3195(object0, CLS27.MTH897("getChatFooterMethod_b"), new Object[0]);
                        }
                        else if(CLS27.MTH890("FootComponent_chatfooterfield")) {
                            ﹶʼ0.FLD1413 = CLS182.MTH3492(0x38EC04922B3CD335L, object0);
                        }
                    }
                }
            }
        }
        else if(!CLS182.MTH3470(0x38EC04B02B3CD335L)) {
            ﹶʼ0.FLD1413 = CLS182.MTH3492(0x38EC04BB2B3CD335L, ᵔʾ0.MTH3205());
        }
        else if(!CLS182.MTH3470(0x38EC05462B3CD335L)) {
            ﹶʼ0.FLD1413 = CLS166.MTH3195(ᵔʾ0.MTH3205(), CLS27.MTH897("getChatFooterMethod"), new Object[0]);
        }
        Object[] arr_object1 = {ᵔʾ0.MTH3205()};
        ﹶʼ0.FLD1434 = CLS21.FLD76.MTH826("getCurrentTalker", arr_object1);
        CLS21.FLD76.MTH819("set_current_talker", new Object[]{ﹶʼ0.FLD1434});
        ﹶʼ0.FLD1408.MTH6740(ﹶʼ0.FLD1434);
        CLS21.FLD76.MTH819("b.chat.onresume", new Object[]{arr_object[0], ﹶʼ0.FLD1434, ﹶʼ0.FLD1413});
    }

    // 此方法包含解密的字符串
    private final void MTH2333(Object[] arr_object) {
        this.FLD837.getClass();
        CLS21.FLD76.MTH819("a.chat.onresume", new Object[]{arr_object[0], this.FLD837.FLD1434, this.FLD837.FLD1413});
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object17;
        String s15;
        String s14;
        Object object10;
        Object object8;
        Object object3;
        Object object1;
        CLS139 ﹶʼ0 = this.FLD837;
        switch(this.FLD836) {
            case 0: {
                ﹶʼ0.getClass();
                File file0 = CLS31.MTH988();
                if(file0 == null) {
                    file0 = CLS27.MTH900().getCacheDir();
                }
                File file1 = new File(file0, CLS27.MTH889("appname") + "_" + CLS27.MTH904() + "_update_settings.json");
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("version", 2);
                    jSONObject0.put("module", "wechatxposed");
                    jSONObject0.put("wxdata", ﹶʼ0.FLD1431.MTH940());
                    CLS21.FLD76.MTH819("export_settings", new Object[]{jSONObject0});
                    if(CLS31.MTH1022(file1)) {
                        CLS31.MTH1030(file1, jSONObject0.toString());
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                ﹶʼ0.MTH3024();
                return;
            }
            case 2: {
                ﹶʼ0.MTH3011();
                CLS404.MTH5916();
                return;
            }
            case 3: {
                ﹶʼ0.MTH3011();
                ﹶʼ0.FLD1426 = false;
                CLS21.FLD76.MTH819("set_current_talker", new Object[]{null});
                return;
            }
            case 4: {
                ﹶʼ0.getClass();
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
                Intent intent0 = ((Activity)object1).getIntent();
                if(intent0.hasExtra("donate")) {
                    intent0.removeExtra("donate");
                }
                ﹶʼ0.FLD1426 = true;
                return;
            }
            case 5: {
                ﹶʼ0.getClass();
                Object object2 = arr_object[0];
                try {
                    Field field1 = object2.getClass().getDeclaredField("thisObject");
                    object3 = null;
                    if(field1 != null) {
                        field1.setAccessible(true);
                        object3 = field1.get(object2);
                    }
                }
                catch(Throwable unused_ex) {
                }
                String s = CLS412.MTH6009(((Activity)object3));
                if(CLS502.MTH6943(s, new String[]{CLS27.MTH897("LoginVoiceUI"), CLS27.MTH897("LoginHistoryUI"), CLS27.MTH897("LoginPasswordUI")})) {
                    ﹶʼ0.MTH3020(((Activity)object3));
                    return;
                }
                if(!CLS412.MTH6002() && s.endsWith("RegByMobileRegAIOUI")) {
                    CLS412.MTH6008(ﹶʼ0.MTH3026(), CLS27.MTH889("new_reg_xp_warning"), 60000L);
                }
                return;
            }
            case 6: {
                ﹶʼ0.getClass();
                if(!CLS481.MTH6698()) {
                    CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                    Activity activity0 = (Activity)ᵔʾ0.MTH3205();
                    String s1 = CLS412.MTH6009(activity0);
                    String s2 = CLS27.MTH892("addTextOptionMenu", "a");
                    Intent intent1 = activity0.getIntent();
                    boolean z = CLS27.MTH890("MMActivity_getMMTitleView");
                    CLS29 ˎᵢ0 = ﹶʼ0.FLD1431;
                    View view0 = !z || !ˎᵢ0.MTH938("infoui_show_optionsmenu", CLS412.MTH6002()) ? null : ((View)CLS166.MTH3195(ᵔʾ0.MTH3205(), CLS27.MTH897("MMActivity_getMMTitleView"), new Object[0]));
                    if(s1.equals(CLS27.MTH897("ChatroomInfoUI"))) {
                        String s3 = intent1.getStringExtra("RoomInfo_Id");
                        if(view0 != null) {
                            view0.setOnLongClickListener(new CLS122(ﹶʼ0, s3));
                        }
                        if(!ˎᵢ0.MTH938("hideInfoOptions", false)) {
                            ArrayList arrayList0 = CLS21.FLD76.MTH832("b.chatroominfoui.menu.options", new Object[]{s3});
                            if(!arrayList0.isEmpty()) {
                                if(arrayList0.size() < 2) {
                                    for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                                        Pair pair0 = (Pair)arrayList0.get(v1);
                                        CLS166.MTH3195(ᵔʾ0.MTH3205(), s2, new Object[]{v1, pair0.first, new CLS114(pair0, s3, 1)});
                                    }
                                    return;
                                }
                                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                                for(Object object4: arrayList0) {
                                    linkedHashMap0.put(((String)((Pair)object4).first), ((Pair)object4).second);
                                }
                                CLS166.MTH3195(ᵔʾ0.MTH3205(), s2, new Object[]{1, CLS27.MTH889("appname"), new CLS104(ﹶʼ0, linkedHashMap0, s3)});
                                return;
                            }
                        }
                    }
                    else {
                        boolean z1 = s1.equals(CLS27.MTH897("ContactInfoUI"));
                        CLS371 ʻ0 = ﹶʼ0.FLD1428;
                        if(z1) {
                            String s4 = intent1.getStringExtra("Contact_User");
                            String s5 = intent1.hasExtra("Contact_Alias") ? intent1.getStringExtra("Contact_Alias") : "";
                            if(TextUtils.isEmpty(s5)) {
                                ContentValues contentValues0 = ʻ0.MTH5359(s4);
                                if(contentValues0 != null) {
                                    s5 = contentValues0.getAsString("alias");
                                }
                            }
                            if(view0 != null) {
                                view0.setOnLongClickListener(new CLS111(ﹶʼ0, s4, s5, 0));
                            }
                            if(!ˎᵢ0.MTH938("hideInfoOptions", false)) {
                                ArrayList arrayList1 = CLS21.FLD76.MTH832("b.contactinfoui.menu.options", new Object[]{s4});
                                if(!arrayList1.isEmpty()) {
                                    if(arrayList1.size() < 2) {
                                        for(int v2 = 0; v2 < arrayList1.size(); ++v2) {
                                            Pair pair1 = (Pair)arrayList1.get(v2);
                                            CLS166.MTH3195(ᵔʾ0.MTH3205(), s2, new Object[]{((int)(v2 + 10)), pair1.first, new CLS123(pair1, s4, s5, 0)});
                                        }
                                        return;
                                    }
                                    LinkedHashMap linkedHashMap1 = new LinkedHashMap();
                                    for(Object object5: arrayList1) {
                                        linkedHashMap1.put(((String)((Pair)object5).first), ((Pair)object5).second);
                                    }
                                    CLS166.MTH3195(ᵔʾ0.MTH3205(), s2, new Object[]{10, CLS27.MTH889("appname"), new CLS102(ﹶʼ0, linkedHashMap1, s4, s5, 0)});
                                    return;
                                }
                            }
                        }
                        else if(s1.equals(CLS27.MTH897("SingleChatInfoUI"))) {
                            String s6 = intent1.getStringExtra("Single_Chat_Talker");
                            String s7 = intent1.hasExtra("Contact_Alias") ? intent1.getStringExtra("Contact_Alias") : "";
                            if(TextUtils.isEmpty(s7)) {
                                ContentValues contentValues1 = ʻ0.MTH5359(s6);
                                if(contentValues1 != null) {
                                    s7 = contentValues1.getAsString("alias");
                                }
                            }
                            if(view0 != null) {
                                view0.setOnLongClickListener(new CLS111(ﹶʼ0, s6, s7, 1));
                            }
                            if(!ˎᵢ0.MTH938("hideInfoOptions", false)) {
                                ArrayList arrayList2 = CLS21.FLD76.MTH832("b.singlechatinfoui.menu.options", new Object[]{s6});
                                if(!arrayList2.isEmpty()) {
                                    if(arrayList2.size() < 2) {
                                        for(int v3 = 0; v3 < arrayList2.size(); ++v3) {
                                            Pair pair2 = (Pair)arrayList2.get(v3);
                                            CLS166.MTH3195(ᵔʾ0.MTH3205(), s2, new Object[]{v3, pair2.first, new CLS123(pair2, s6, s7, 1)});
                                        }
                                        return;
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for(Object object6: arrayList2) {
                                        linkedHashMap2.put(((String)((Pair)object6).first), ((Pair)object6).second);
                                    }
                                    CLS166.MTH3195(ᵔʾ0.MTH3205(), s2, new Object[]{1, CLS27.MTH889("appname"), new CLS102(ﹶʼ0, linkedHashMap2, s6, s7, 1)});
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 7: {
                ﹶʼ0.getClass();
                if(!CLS481.MTH6698()) {
                    Object object7 = arr_object[0];
                    try {
                        Field field2 = object7.getClass().getDeclaredField("args");
                        object8 = null;
                        if(field2 != null) {
                            field2.setAccessible(true);
                            object8 = field2.get(object7);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    Menu menu0 = (Menu)((Object[])object8)[0];
                    CLS29 ˎᵢ1 = ﹶʼ0.FLD1431;
                    if(ˎᵢ1.MTH938("add_actionbar_items_enable", false)) {
                        JSONArray jSONArray0 = ˎᵢ1.MTH937("actionbar_items", new JSONArray());
                        for(int v4 = 0; v4 < jSONArray0.length(); ++v4) {
                            try {
                                JSONObject jSONObject1 = jSONArray0.getJSONObject(v4);
                                String s8 = jSONObject1.getString("name");
                                String s9 = jSONObject1.optString("label");
                                String s10 = jSONObject1.optString("cls");
                                MenuItem menuItem0 = menu0.add(0, v4 + 30000, 0, s9);
                                menuItem0.setShowAsAction(2);
                                menuItem0.setOnMenuItemClickListener(new CLS104(ﹶʼ0, s8, s10));
                            }
                            catch(Throwable throwable1) {
                                CLS27.MTH893(throwable1);
                            }
                        }
                    }
                }
                return;
            }
            case 8: {
                ﹶʼ0.getClass();
                if(!CLS481.MTH6698() && (!ﹶʼ0.FLD1431.MTH938("hideMainOptions", true) && !ﹶʼ0.FLD1414)) {
                    Object object9 = arr_object[0];
                    try {
                        Field field3 = object9.getClass().getDeclaredField("args");
                        object10 = null;
                        if(field3 != null) {
                            field3.setAccessible(true);
                            object10 = field3.get(object9);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    Menu menu1 = (Menu)((Object[])object10)[0];
                    try {
                        Method method0 = object9.getClass().getDeclaredMethod("getResult");
                        method0.setAccessible(true);
                        Object object11 = null;
                        object11 = method0.invoke(object9);
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(((Boolean)object11).booleanValue()) {
                        ArrayList arrayList3 = CLS21.FLD76.MTH832("plus.options", new Object[0]);
                        if(arrayList3 != null && !arrayList3.isEmpty()) {
                            SparseArray sparseArray0 = new SparseArray();
                            int v5 = 0;
                            for(Object object12: arrayList3) {
                                Pair pair3 = (Pair)object12;
                                if(CLS502.MTH6934(((String)pair3.second), new String[]{"#"})) {
                                    String s11 = (String)pair3.second;
                                    sparseArray0.put(Integer.parseInt(s11.substring(s11.lastIndexOf("#") + 1)), pair3);
                                }
                                else {
                                    ++v5;
                                    sparseArray0.put(v5, pair3);
                                }
                            }
                            for(int v6 = 0; v6 < sparseArray0.size(); ++v6) {
                                Pair pair4 = (Pair)sparseArray0.valueAt(v6);
                                String s12 = (String)pair4.second;
                                if(CLS502.MTH6934(s12, new String[]{"#"})) {
                                    s12 = s12.substring(0, s12.lastIndexOf("#"));
                                }
                                MenuItem menuItem1 = menu1.add(0, v6 + 20000, 0, ((CharSequence)pair4.first));
                                menuItem1.setOnMenuItemClickListener(new CLS134(3, s12));
                                menuItem1.setShowAsAction(0);
                                menuItem1.setShowAsActionFlags(0);
                                CLS777 ᐧʾ0 = new CLS777(0, s12);
                                CLS21.FLD76.MTH824("on_launcherui_options_selected", v6 + 20000, ((CLS35)ᐧʾ0));
                            }
                        }
                    }
                }
                return;
            }
            case 9: {
                ﹶʼ0.getClass();
                Activity activity1 = (Activity)arr_object[0];
                ﹶʼ0.MTH3009();
                Intent intent2 = activity1.getIntent();
                if(intent2.hasExtra("forwardmp3")) {
                    intent2.removeExtra("forwardmp3");
                    CLS47.FLD167.FLD164.clear();
                    CLS47.FLD167.MTH1196();
                    if(CLS47.FLD167.FLD164.isEmpty()) {
                        CLS412.MTH6014(activity1, CLS27.MTH889("mp3_not_found"));
                        return;
                    }
                    int v7 = intent2.getIntExtra("mp3_code", 0);
                    CLS387.MTH5601(false, ﹶʼ0.MTH3026(), ((CLS2)new CLS854(ﹶʼ0, v7)), CLS404.MTH5907());
                }
                ﹶʼ0.MTH3024();
                boolean z2 = CLS27.MTH901();
                CLS485 ᐧﾞ0 = ﹶʼ0.FLD1408;
                if(z2) {
                    ᐧﾞ0.getClass();
                    if(!ᐧﾞ0.FLD4739) {
                        ᐧﾞ0.FLD4739 = true;
                    }
                }
                if(ᐧﾞ0.FLD4739) {
                    for(int v = 0; v < ᐧﾞ0.FLD4737.size(); ++v) {
                        ᐧﾞ0.MTH6733(v);
                    }
                    HashMap hashMap0 = ᐧﾞ0.FLD4736;
                    for(Object object13: hashMap0.keySet()) {
                        for(Object object14: ((ArrayList)hashMap0.get(((String)object13)))) {
                            ᐧﾞ0.MTH6733(((int)(((Integer)object14))));
                        }
                    }
                    hashMap0.clear();
                    HashMap hashMap1 = ᐧﾞ0.FLD4738;
                    for(Object object15: hashMap1.values()) {
                        ᐧﾞ0.MTH6733(((int)(((Integer)object15))));
                    }
                    hashMap1.clear();
                    ᐧﾞ0.MTH6733(5555);
                    HashMap hashMap2 = ᐧﾞ0.FLD4735;
                    for(Object object16: hashMap2.values()) {
                        ᐧﾞ0.MTH6733(((int)(((Integer)object16))));
                    }
                    hashMap2.clear();
                    ᐧﾞ0.MTH6733(11122201);
                }
                CLS404.MTH5892(activity1);
                return;
            }
            case 10: {
                if(!ﹶʼ0.FLD1410) {
                    CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                    try {
                        Message message0 = (Message)ᵔʾ1.MTH3204()[0];
                        String s13 = message0.getData().getString("notification.show.talker");
                        if(!CLS372.MTH5400(s13)) {
                            int v8 = message0.getData().getInt("notification.show.message.type");
                            CLS29 ˎᵢ2 = ﹶʼ0.FLD1431;
                            if(v8 == 10000 && (ˎᵢ2.MTH938("prevent_msg_recall", true) && CLS502.MTH6934(message0.getData().getString("notification.show.message.content"), new String[]{CLS27.MTH882("recall1"), CLS27.MTH882("recall2"), "recall"})) || CLS21.FLD76.MTH830("isHidden", new Object[]{s13})) {
                                ᵔʾ1.MTH3207(null);
                                return;
                            }
                            switch(v8) {
                                case 1: 
                                case 3: 
                                case 34: 
                                case 42: 
                                case 43: 
                                case 0x2F: 
                                case 0x30: 
                                case 49: 
                                case 62: 
                                case 0x1000031: 
                                case 0x13000031: 
                                case 0x19000031: 
                                case 0x1A000031: 
                                case 0x31000031: {
                                    goto label_282;
                                }
                            }
                            return;
                        label_282:
                            if((TextUtils.isEmpty(ﹶʼ0.FLD1434) || !ﹶʼ0.FLD1434.equals(s13)) && !CLS372.MTH5396(s13) && (ˎᵢ2.MTH938("notif_" + s13 + "_" + "notification_enable", false) || ˎᵢ2.MTH938("custom_notification_enable", false))) {
                                ᵔʾ1.MTH3207(null);
                                return;
                            }
                        }
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                return;
            }
            case 11: {
                if(!ﹶʼ0.FLD1410) {
                    CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                    if(ᵔʾ2.MTH3204().length == 6) {
                        s14 = (String)ᵔʾ2.MTH3204()[1];
                        s15 = (String)ᵔʾ2.MTH3204()[2];
                        object17 = ᵔʾ2.MTH3204()[3];
                    }
                    else {
                        s14 = (String)ᵔʾ2.MTH3204()[0];
                        s15 = (String)ᵔʾ2.MTH3204()[1];
                        object17 = ᵔʾ2.MTH3204()[2];
                    }
                    int v9 = (int)(((Integer)object17));
                    if(!CLS372.MTH5400(s14)) {
                        try {
                            CLS29 ˎᵢ3 = ﹶʼ0.FLD1431;
                            if(v9 == 10000 && (ˎᵢ3.MTH938("prevent_msg_recall", true) && CLS502.MTH6934(s15, new String[]{CLS27.MTH882("recall1"), CLS27.MTH882("recall2"), "recall"})) || CLS21.FLD76.MTH830("isHidden", new Object[]{s14})) {
                                ᵔʾ2.MTH3207(null);
                                return;
                            }
                            switch(v9) {
                                case 1: 
                                case 3: 
                                case 34: 
                                case 42: 
                                case 43: 
                                case 0x2F: 
                                case 0x30: 
                                case 49: 
                                case 62: 
                                case 0x1000031: 
                                case 0x13000031: 
                                case 0x19000031: 
                                case 0x1A000031: 
                                case 0x31000031: {
                                    goto label_304;
                                }
                            }
                            return;
                        label_304:
                            if((TextUtils.isEmpty(ﹶʼ0.FLD1434) || !ﹶʼ0.FLD1434.equals(s14)) && !CLS372.MTH5396(s14) && (ˎᵢ3.MTH938("notif_" + s14 + "_" + "notification_enable", false) || ˎᵢ3.MTH938("custom_notification_enable", false))) {
                                ᵔʾ2.MTH3207(null);
                                return;
                            }
                        }
                        catch(Throwable throwable3) {
                            CLS27.MTH893(throwable3);
                        }
                    }
                }
                return;
            }
            case 12: {
                if(!ﹶʼ0.FLD1410) {
                    CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                    Object object18 = ᵔʾ3.MTH3204()[0];
                    int v10 = CLS166.MTH3181(object18, "field_isSend");
                    String s16 = (String)CLS166.MTH3194(object18, "field_talker");
                    int v11 = CLS166.MTH3181(object18, "field_type");
                    String s17 = (String)CLS166.MTH3194(object18, "field_content");
                    if(v10 != 1) {
                        if(v11 == 1 && !CLS426.MTH6126(s16) && s17.startsWith("#fkz_")) {
                            ᵔʾ3.MTH3207(null);
                            return;
                        }
                        CLS21.FLD76.MTH819("b.notification", new Object[]{arr_object[0], object18, v10, s16, s17, v11});
                    }
                }
                return;
            }
            case 13: {
                this.MTH2340(arr_object);
                return;
            }
            case 14: {
                this.MTH2338(arr_object);
                return;
            }
            case 15: {
                this.MTH2341(arr_object);
                return;
            }
            case 16: {
                if(!ﹶʼ0.FLD1410) {
                    CLS167 ᵔʾ4 = new CLS167(arr_object[0]);
                    if(ᵔʾ4.MTH3204().length == 1) {
                        try {
                            if(ﹶʼ0.MTH3007(CLS166.MTH3194(ᵔʾ4.MTH3204()[0], CLS27.MTH897("dataField")))) {
                                ᵔʾ4.MTH3207(null);
                                return;
                            }
                        }
                        catch(Throwable throwable4) {
                            CLS27.MTH893(throwable4);
                        }
                    }
                }
                return;
            }
            case 17: {
                this.MTH2336(arr_object);
                return;
            }
            case 18: {
                if(!ﹶʼ0.FLD1410) {
                    CLS167 ᵔʾ5 = new CLS167(arr_object[0]);
                    try {
                        Object object19 = ᵔʾ5.MTH3204()[0];
                        if(object19 != null && ﹶʼ0.MTH3007(CLS166.MTH3194(object19, CLS27.MTH897("dataField")))) {
                            ᵔʾ5.MTH3207(null);
                            return;
                        }
                    }
                    catch(Throwable throwable5) {
                        CLS27.MTH893(throwable5);
                    }
                }
                return;
            }
            case 19: {
                this.MTH2344(arr_object);
                return;
            }
            case 20: {
                this.MTH2343(arr_object);
                return;
            }
            case 21: {
                this.MTH2332(arr_object);
                return;
            }
            case 22: {
                this.MTH2333(arr_object);
                return;
            }
            case 23: {
                this.MTH2331(arr_object);
                return;
            }
            case 24: {
                this.MTH2335();
                return;
            }
            case 25: {
                this.MTH2339(arr_object);
                return;
            }
            case 26: {
                this.MTH2337(arr_object);
                return;
            }
            default: {
                this.MTH2342(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2335() {
        this.FLD837.FLD1434 = null;
        this.FLD837.FLD1439 = null;
        CLS21.FLD76.MTH819("set_current_talker", new Object[]{this.FLD837.FLD1434});
    }

    // 此方法包含解密的字符串
    private final void MTH2336(Object[] arr_object) {
        CLS139 ﹶʼ0 = this.FLD837;
        if(!ﹶʼ0.FLD1410) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            try {
                Class class0 = CLS27.MTH894("dataClass3");
                Class class1 = CLS27.MTH894("dataClass4");
                if(class0 != null && class1 != null) {
                    byte[] arr_b = (byte[])CLS166.MTH3192(class0, CLS27.MTH897("dataMethod2"), new Object[]{CLS166.MTH3194(ᵔʾ0.MTH3204()[0], CLS27.MTH897("dataField1"))});
                    if(CLS166.MTH3181(ᵔʾ0.MTH3204()[0], CLS27.MTH897("dataField2")) == 5 && ﹶʼ0.MTH3007(CLS166.MTH3195(CLS166.MTH3188(class1, new Object[0]), CLS27.MTH897("dataMethod3"), new Object[]{arr_b}))) {
                        ᵔʾ0.MTH3207(Boolean.FALSE);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2337(Object[] arr_object) {
        long v;
        CLS139 ﹶʼ0 = this.FLD837;
        if(!ﹶʼ0.FLD1410) {
            String s = (String)arr_object[2];
            if("message".equalsIgnoreCase(s)) {
                ContentValues contentValues0 = (ContentValues)arr_object[3];
                String s1 = contentValues0.getAsString("talker");
                if((contentValues0.containsKey("isSend") ? CLS182.MTH3474(4101692793447830325L, contentValues0) : 0) != 0) {
                    if(contentValues0.containsKey("msgId")) {
                        v = 4101692849282405173L;
                        goto label_12;
                    }
                    else if(contentValues0.containsKey("msgid")) {
                        v = 4101692900822012725L;
                    label_12:
                        long v1 = CLS34.MTH1080(v, contentValues0);
                        CLS896 ˆٴ0 = ﹶʼ0.FLD1400;
                        if(ˆٴ0.FLD1634) {
                            HashSet hashSet0 = ˆٴ0.FLD1639;
                            if(!hashSet0.isEmpty() && hashSet0.contains(s1)) {
                                hashSet0.remove(s1);
                                ˆٴ0.FLD1643.add(v1);
                            }
                        }
                    }
                }
                String s2 = contentValues0.getAsString("talker");
                int v2 = contentValues0.containsKey("status") ? CLS182.MTH3474(4101672435302847285L, contentValues0) : 0;
                int v3 = contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38EC11672B3CD335L, contentValues0) : 0;
                String s3 = contentValues0.getAsString("content");
                if(CLS182.MTH3470(0x38EC11762B3CD335L) && CLS182.MTH3470(4101672053050757941L) && CLS182.MTH3470(4101672100295398197L)) {
                    contentValues0.put("webwx", Boolean.valueOf(v3 == 1 && v2 == 3));
                    if(CLS426.MTH6126(s2) && CLS426.MTH6129(s3) && CLS502.MTH6934(s3, new String[]{"@" + CLS66.MTH1452(s2, CLS27.MTH904())})) {
                        contentValues0.put("atuserlist", CLS27.MTH904());
                        contentValues0.put("atusercount", 1);
                    }
                }
                CLS21.FLD76.MTH819("a.dbinsert.message", new Object[]{arr_object[0], contentValues0, s});
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2338(Object[] arr_object) {
        CLS139 ﹶʼ0 = this.FLD837;
        ﹶʼ0.getClass();
        Object object0 = arr_object[0];
        CLS167 ᵔʾ0 = new CLS167(object0);
        if(ﹶʼ0.FLD1431.MTH938("favorite_forward_enable", true) && !CLS481.MTH6698()) {
            Class class0 = CLS27.MTH894("favClass2");
            if(class0 != null) {
                try {
                    ContextMenu contextMenu0 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                    Object object1 = TextUtils.isEmpty(CLS27.MTH897("favContextField1")) ? CLS164.MTH3175(ᵔʾ0.MTH3205(), CLS27.MTH897("FavoriteIndexUI")) : CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("favContextField1"));
                    if(object1 != null) {
                        ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0 = (ContextMenu.ContextMenuInfo)ᵔʾ0.MTH3204()[2];
                        ListView listView0 = (ListView)CLS166.MTH3194(object1, CLS27.MTH897("favListView"));
                        int v = ((AdapterView.AdapterContextMenuInfo)contextMenu$ContextMenuInfo0).position;
                        int v1 = listView0.getHeaderViewsCount();
                        int v2 = CLS27.MTH903(0, "favPosOffset");
                        Object object2 = CLS166.MTH3195(CLS166.MTH3194(object1, CLS27.MTH897("favField1")), CLS27.MTH897("favGetItemMethod"), new Object[]{((int)(v - v1 - 1 + v2))});
                        long v3 = CLS166.MTH3185(object2, "field_localId");
                        int v4 = CLS166.MTH3181(object2, "field_type");
                        if(v4 == 1 || v4 == 2 || v4 == 3 || v4 == 4 || v4 == 5) {
                            goto label_22;
                        }
                        switch(v4) {
                            case 7: 
                            case 16: {
                                goto label_22;
                            }
                            case 8: 
                            case 18: {
                                goto label_21;
                            }
                        }
                        return;
                    label_21:
                        if(ﹶʼ0.FLD1438.MTH6895("fav_wenote")) {
                        label_22:
                            Object object3 = CLS66.MTH1442(v3);
                            Object object4 = CLS166.MTH3192(class0, CLS27.MTH897("favMethod3"), new Object[]{object3});
                            CLS21.FLD76.MTH835("b.fav.menu.oncreate", new Object[]{20000, contextMenu0, object2, object4, object0});
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2339(Object[] arr_object) {
        String s1;
        CLS139 ﹶʼ0 = this.FLD837;
        ﹶʼ0.getClass();
        Object object0 = arr_object[0];
        String s = (String)arr_object[2];
        ContentValues contentValues0 = (ContentValues)arr_object[3];
        try {
            if("message".equalsIgnoreCase(s) && contentValues0 != null && contentValues0.containsKey("status") && (!contentValues0.containsKey("isSend") || ((int)contentValues0.getAsInteger("isSend")) == 1)) {
                int v = (int)contentValues0.getAsInteger("status");
                if(v == 2 || v == 5) {
                    boolean z = false;
                    if(contentValues0.containsKey("msgId")) {
                        z = true;
                        s1 = "msgId";
                    }
                    else if(contentValues0.containsKey("msgid")) {
                        z = true;
                        s1 = "msgid";
                    }
                    if(z) {
                        long v1 = (long)contentValues0.getAsLong(s1);
                        ((CLS171)ﹶʼ0.FLD1400).MTH3329(v1, v);
                        CLS21.FLD76.MTH819("resendcheck", new Object[]{contentValues0, object0});
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2340(Object[] arr_object) {
        CLS139 ﹶʼ0 = this.FLD837;
        ﹶʼ0.getClass();
        Object object0 = arr_object[0];
        CLS167 ᵔʾ0 = new CLS167(object0);
        if(ﹶʼ0.FLD1431.MTH938("favorite_forward_enable", true) && !CLS481.MTH6698()) {
            Class class0 = CLS27.MTH894("favClass2");
            if(class0 != null) {
                try {
                    ContextMenu contextMenu0 = (ContextMenu)ᵔʾ0.MTH3204()[0];
                    ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0 = (ContextMenu.ContextMenuInfo)ᵔʾ0.MTH3204()[2];
                    ListView listView0 = (ListView)CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("favListView"));
                    int v = ((AdapterView.AdapterContextMenuInfo)contextMenu$ContextMenuInfo0).position;
                    int v1 = listView0.getHeaderViewsCount();
                    int v2 = CLS27.MTH903(0, "favPosOffset");
                    Object object1 = CLS166.MTH3195(CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("favField1")), CLS27.MTH897("favGetItemMethod"), new Object[]{((int)(v - v1 - 1 + v2))});
                    long v3 = CLS166.MTH3185(object1, "field_localId");
                    int v4 = CLS166.MTH3181(object1, "field_type");
                    if(v4 == 1 || v4 == 2 || v4 == 3 || v4 == 4 || v4 == 5) {
                        goto label_20;
                    }
                    switch(v4) {
                        case 7: 
                        case 16: {
                            goto label_20;
                        }
                        case 8: 
                        case 18: {
                            goto label_19;
                        }
                    }
                    return;
                label_19:
                    if(ﹶʼ0.FLD1438.MTH6895("fav_wenote")) {
                    label_20:
                        Object object2 = CLS66.MTH1442(v3);
                        Object object3 = CLS166.MTH3192(class0, CLS27.MTH897("favMethod3"), new Object[]{object2});
                        CLS21.FLD76.MTH835("b.fav.menu.oncreate", new Object[]{20000, contextMenu0, object1, object3, object0});
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2341(Object[] arr_object) {
        CLS139 ﹶʼ0 = this.FLD837;
        ﹶʼ0.getClass();
        Object object0 = arr_object[0];
        CLS167 ᵔʾ0 = new CLS167(object0);
        if(ﹶʼ0.FLD1431.MTH938("favorite_forward_enable", true) && !CLS481.MTH6698()) {
            Class class0 = CLS27.MTH894("favClass2");
            if(class0 != null) {
                try {
                    CLS98 ﾞᐧ0 = new CLS98(ᵔʾ0.MTH3204()[0]);
                    Object object1 = TextUtils.isEmpty(CLS27.MTH897("favContextField1")) ? CLS164.MTH3175(ᵔʾ0.MTH3205(), CLS27.MTH897("FavoriteIndexUI")) : CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("favContextField1"));
                    if(object1 != null) {
                        ListView listView0 = (ListView)CLS166.MTH3194(object1, CLS27.MTH897("favListView"));
                        int v = CLS166.MTH3181(ᵔʾ0.MTH3205(), CLS27.MTH897("favOnCreateContextMenuClass1_positionField"));
                        int v1 = listView0.getHeaderViewsCount();
                        Object object2 = CLS166.MTH3195(CLS166.MTH3194(object1, CLS27.MTH897("favField1")), CLS27.MTH897("favGetItemMethod"), new Object[]{((int)(v - v1))});
                        long v2 = CLS166.MTH3185(object2, "field_localId");
                        int v3 = CLS166.MTH3181(object2, "field_type");
                        if(v3 == 1 || v3 == 2 || v3 == 3 || v3 == 4 || v3 == 5) {
                            goto label_20;
                        }
                        switch(v3) {
                            case 7: 
                            case 16: {
                                goto label_20;
                            }
                            case 8: 
                            case 18: {
                                goto label_19;
                            }
                        }
                        return;
                    label_19:
                        if(ﹶʼ0.FLD1438.MTH6895("fav_wenote")) {
                        label_20:
                            Object object3 = CLS66.MTH1442(v2);
                            Object object4 = CLS166.MTH3192(class0, CLS27.MTH897("favMethod3"), new Object[]{object3});
                            CLS21.FLD76.MTH835("b.fav.menu.oncreate2", new Object[]{20000, ﾞᐧ0, object2, object4, object0});
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2342(Object[] arr_object) {
        CLS139 ﹶʼ0 = this.FLD837;
        if(!ﹶʼ0.FLD1410) {
            String s = (String)arr_object[2];
            if("message".equalsIgnoreCase(s)) {
                ContentValues contentValues0 = (ContentValues)arr_object[3];
                if(CLS27.MTH901() && (contentValues0.containsKey("isSend") ? CLS182.MTH3474(4101671937086640949L, contentValues0) : 0) != 1) {
                    String s1 = contentValues0.getAsString("talker");
                    if(CLS426.MTH6126(s1)) {
                        String s2 = contentValues0.getAsString("content");
                        if(CLS426.MTH6129(s2)) {
                            String[] arr_s = CLS426.MTH6130(s2);
                            if(arr_s != null) {
                                HashMap hashMap0 = CLS66.MTH1400(s1, new ArrayList(Arrays.asList(CLS502.MTH6941(ﹶʼ0.FLD1428.MTH5335(s1)))), true);
                                ArrayList arrayList0 = new ArrayList();
                                for(int v = 0; v < arr_s.length; ++v) {
                                    String s3 = (String)hashMap0.get(arr_s[v]);
                                    if(!TextUtils.isEmpty(s3) && !CLS27.MTH904().equals(s3)) {
                                        arrayList0.add(s3);
                                    }
                                }
                                contentValues0.put("atuserlist", TextUtils.join(",", arrayList0));
                                contentValues0.put("atusercount", arrayList0.size());
                            }
                        }
                    }
                    CLS21.FLD76.MTH818("b.dbinsert.message.notpredb", new Object[]{arr_object[0], contentValues0, s});
                }
                CLS21.FLD76.MTH819("b.dbinsert.message", new Object[]{arr_object[0], contentValues0, s});
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2343(Object[] arr_object) {
        Object object0 = this.FLD837.FLD1413;
        if(object0 != null) {
            try {
                Object object1 = CLS166.MTH3194(object0, CLS27.MTH897("chatFooterField2"));
                String s = "" + CLS166.MTH3195(object1, "getText", new Object[0]);
                if(!TextUtils.isEmpty(s)) {
                    CLS21.FLD76.MTH818("b.chat.send.click", new Object[]{arr_object[0], object1, s});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2344(Object[] arr_object) {
        String s5;
        Pair pair1;
        long v4;
        long v3;
        long v2;
        CLS139 ﹶʼ0 = this.FLD837;
        ﹶʼ0.getClass();
        if(!CLS481.MTH6698()) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            ContextMenu contextMenu0 = (ContextMenu)ᵔʾ0.MTH3204()[0];
            View view0 = (View)ᵔʾ0.MTH3204()[1];
            if(view0 != null && !CLS502.MTH6934(view0.getClass().toString(), new String[]{"SnsCommentCollapseLayout", "ImproveCommentView"})) {
                int v = contextMenu0.size();
                if(14 - v >= 0) {
                    Object object0 = view0.getTag();
                    if(object0 == null) {
                        try {
                            long v1 = CLS166.MTH3185(CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("SnsSightMenu_cls1_field1")), CLS27.MTH897("BaseImproveClick_getInfo"), new Object[0]), CLS27.MTH897("ImproveSnsInfo_getSnsObject"), new Object[0]), CLS27.MTH897("snsSyncField2"));
                            v2 = ﹶʼ0.FLD1437.MTH5766(v1);
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                            v3 = -1L;
                            goto label_36;
                        }
                    }
                    else {
                        String s = object0.getClass().toString();
                        boolean z = s.endsWith(CLS27.MTH897("snsSightClass1"));
                        if(s.endsWith(CLS27.MTH897("snsContentClass"))) {
                            v2 = new BigInteger(((String)CLS166.MTH3194(object0, CLS27.MTH892("snsContentIdField", CLS27.MTH897("snsSightField4"))))).longValue();
                        }
                        else {
                            new String("");
                            if(z) {
                                v4 = 4100891554413859637L;
                            }
                            else if(s.endsWith(CLS27.MTH897("snsImgClass1"))) {
                                v4 = 4100892233018692405L;
                            }
                            else {
                                v4 = s.endsWith(CLS27.MTH897("snsArticleClass1")) ? 4100892366162678581L : 0x38E94BF22B3CD335L;
                            }
                            String s1 = (String)CLS182.MTH3492(v4, object0);
                            v2 = TextUtils.isEmpty(s1) ? -1L : Long.parseLong(s1.substring(s1.lastIndexOf("_") + 1));
                        }
                        if(v2 < 0L) {
                            v2 = CLS396.FLD3775.MTH5766(v2);
                        }
                    }
                    v3 = v2;
                label_36:
                    if(v3 != -1L) {
                        ArrayList arrayList0 = CLS21.FLD76.MTH832("sns.menu.options", new Object[]{v3});
                        if(arrayList0 != null && !arrayList0.isEmpty()) {
                            HashSet hashSet0 = new HashSet();
                            for(int v5 = 0; v5 < contextMenu0.size(); ++v5) {
                                hashSet0.add(CLS502.MTH6936(contextMenu0.getItem(v5).getTitle()));
                            }
                            SparseArray sparseArray0 = new SparseArray();
                            int v6 = 0;
                            Iterator iterator0 = arrayList0.iterator();
                            while(iterator0.hasNext()) {
                                String s2 = "";
                                Object object1 = iterator0.next();
                                Pair pair0 = (Pair)object1;
                                String s3 = (String)pair0.second;
                                new String("");
                                String s4 = "";
                                new String("");
                                new String("");
                                if(TextUtils.isEmpty(s3)) {
                                    pair1 = pair0;
                                }
                                else {
                                    if(!s3.contains("[[") || !s3.contains("]]")) {
                                        pair1 = pair0;
                                    }
                                    else {
                                        int v7 = s3.indexOf("[[");
                                        int v8 = s3.lastIndexOf("]]");
                                        s2 = s3.substring(v7 + 2, v8);
                                        pair1 = pair0;
                                        s3 = CLS182.MTH3495(s3, 0, v7, new StringBuilder(), v8, 2);
                                    }
                                    if(!s3.contains("{") || !s3.contains("}")) {
                                        s5 = "";
                                    }
                                    else {
                                        int v9 = s3.indexOf("{");
                                        int v10 = s3.lastIndexOf("}");
                                        s5 = s3.substring(v9 + 1, v10);
                                        s3 = CLS182.MTH3495(s3, 0, v9, new StringBuilder(), v10, 1);
                                    }
                                    String s6 = "";
                                    if(s3.contains("((") && s3.contains("))")) {
                                        int v11 = s3.indexOf("((");
                                        int v12 = s3.lastIndexOf("))");
                                        String s7 = s3.substring(v11 + 2, v12);
                                        s3 = CLS182.MTH3495(s3, 0, v11, new StringBuilder(), v12, 2);
                                        s6 = s7;
                                    }
                                    s3.getClass();
                                    s5.getClass();
                                    s4 = s2.trim();
                                    s6.getClass();
                                }
                                String s8 = (String)pair1.first;
                                if(CLS27.MTH895().MTH938("snsMenuItemAltModeEnable", CLS390.MTH5621())) {
                                    s8 = CLS182.MTH3475(0x38EC1A5B2B3CD335L, CLS182.MTH3483(s8));
                                }
                                if(hashSet0.contains(s8)) {
                                }
                                else if(TextUtils.isEmpty(s4)) {
                                    sparseArray0.put(v6 + 1, pair1);
                                    ++v6;
                                }
                                else {
                                    sparseArray0.put(Integer.parseInt(s4), pair1);
                                }
                            }
                            if(sparseArray0.size() != 0) {
                                ArrayList arrayList1 = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                for(int v13 = 0; v13 < sparseArray0.size(); ++v13) {
                                    Pair pair2 = (Pair)sparseArray0.valueAt(v13);
                                    if(v13 < 14 - v) {
                                        arrayList1.add(pair2);
                                    }
                                    else {
                                        arrayList2.add(pair2);
                                    }
                                }
                                if(arrayList2.size() == 1) {
                                    arrayList1.add(((Pair)arrayList2.get(0)));
                                }
                                if(CLS27.MTH895().MTH938("snsMenuItemAltModeEnable", CLS390.MTH5621())) {
                                    CLS21 ʾᵢ0 = CLS21.FLD76;
                                    ʾᵢ0.getClass();
                                    for(int v14 = 0; v14 < 1; ++v14) {
                                        String s9 = new String[]{"on_snstimelinemenu_click_"}[v14];
                                        ArrayList arrayList3 = new ArrayList();
                                        ConcurrentHashMap concurrentHashMap0 = ʾᵢ0.FLD71;
                                        for(Object object2: concurrentHashMap0.keySet()) {
                                            String s10 = (String)object2;
                                            if(s10.contains(s9)) {
                                                arrayList3.add(s10);
                                            }
                                        }
                                        for(Object object3: arrayList3) {
                                            concurrentHashMap0.remove(((String)object3));
                                        }
                                        arrayList3.clear();
                                        ConcurrentHashMap concurrentHashMap1 = ʾᵢ0.FLD73;
                                        for(Object object4: concurrentHashMap1.keySet()) {
                                            String s11 = (String)object4;
                                            if(s11.contains(s9)) {
                                                arrayList3.add(s11);
                                            }
                                        }
                                        for(Object object5: arrayList3) {
                                            concurrentHashMap1.remove(((String)object5));
                                        }
                                        arrayList3.clear();
                                        ConcurrentHashMap concurrentHashMap2 = ʾᵢ0.FLD74;
                                        for(Object object6: concurrentHashMap2.keySet()) {
                                            String s12 = (String)object6;
                                            if(s12.contains(s9)) {
                                                arrayList3.add(s12);
                                            }
                                        }
                                        for(Object object7: arrayList3) {
                                            concurrentHashMap2.remove(((String)object7));
                                        }
                                    }
                                }
                                if(!arrayList1.isEmpty()) {
                                    CLS853 ⁱﾞ0 = new CLS853(v3);
                                    Iterator iterator7 = arrayList1.iterator();
                                    for(int v15 = 56000; iterator7.hasNext(); ++v15) {
                                        String s13 = "";
                                        Object object8 = iterator7.next();
                                        String s14 = (String)((Pair)object8).second;
                                        String s15 = "";
                                        new String("");
                                        new String("");
                                        new String("");
                                        if(!TextUtils.isEmpty(s14)) {
                                            if(s14.contains("[[") && s14.contains("]]")) {
                                                int v16 = s14.indexOf("[[");
                                                int v17 = s14.lastIndexOf("]]");
                                                String s16 = s14.substring(v16 + 2, v17);
                                                s14 = CLS182.MTH3495(s14, 0, v16, new StringBuilder(), v17, 2);
                                                s13 = s16;
                                            }
                                            String s17 = "";
                                            if(s14.contains("{") && s14.contains("}")) {
                                                int v18 = s14.indexOf("{");
                                                int v19 = s14.lastIndexOf("}");
                                                String s18 = s14.substring(v18 + 1, v19);
                                                s14 = CLS182.MTH3495(s14, 0, v18, new StringBuilder(), v19, 1);
                                                s17 = s18;
                                            }
                                            String s19 = "";
                                            if(s14.contains("((") && s14.contains("))")) {
                                                int v20 = s14.indexOf("((");
                                                int v21 = s14.lastIndexOf("))");
                                                String s20 = s14.substring(v20 + 2, v21);
                                                s14 = CLS182.MTH3495(s14, 0, v20, new StringBuilder(), v21, 2);
                                                s19 = s20;
                                            }
                                            s17.getClass();
                                            s13.getClass();
                                            s19.getClass();
                                            s15 = s14.trim();
                                        }
                                        String s21 = (String)((Pair)object8).first;
                                        if(CLS27.MTH895().MTH938("snsMenuItemAltModeEnable", CLS390.MTH5621())) {
                                            s21 = CLS182.MTH3475(4101682124749067061L, CLS182.MTH3483(s21));
                                        }
                                        MenuItem menuItem0 = contextMenu0.add(0, v15, 0, s21);
                                        if(CLS27.MTH895().MTH938("snsMenuItemAltModeEnable", CLS390.MTH5621())) {
                                            String s22 = CLS182.MTH3484(4101682790468997941L, new StringBuilder(), s21);
                                            CLS21.FLD76.MTH814(s22);
                                            CLS719 ˎٴ0 = new CLS719(1, ((CLS12)ⁱﾞ0), s15);
                                            CLS21.FLD76.MTH828(s22, ((CLS35)ˎٴ0));
                                        }
                                        else {
                                            if(menuItem0 != null) {
                                                menuItem0.setOnMenuItemClickListener(new CLS136(1, ((CLS12)ⁱﾞ0), s15));
                                            }
                                            CLS719 ˎٴ1 = new CLS719(2, ((CLS12)ⁱﾞ0), s15);
                                            CLS21.FLD76.MTH824("ontimelinemenu_click", v15, ((CLS35)ˎٴ1));
                                        }
                                    }
                                }
                                if(!arrayList2.isEmpty() && contextMenu0.findItem(20000) == null) {
                                    CLS801 ᴵᵢ0 = new CLS801(ﹶʼ0, arrayList2, v3);
                                    String s23 = CLS27.MTH889("appname");
                                    if(CLS27.MTH895().MTH938("snsMenuItemAltModeEnable", CLS390.MTH5621())) {
                                        s23 = CLS182.MTH3475(4101682584310567733L, CLS182.MTH3483(s23));
                                    }
                                    MenuItem menuItem1 = contextMenu0.add(0, 20000, 0, s23);
                                    if(CLS27.MTH895().MTH938("snsMenuItemAltModeEnable", CLS390.MTH5621())) {
                                        String s24 = CLS182.MTH3484(4101682700274684725L, new StringBuilder(), s23);
                                        CLS21.FLD76.MTH814(s24);
                                        CLS882 ﾞٴ0 = new CLS882(((CLS3)ᴵᵢ0), 27);
                                        CLS21.FLD76.MTH828(s24, ((CLS35)ﾞٴ0));
                                        return;
                                    }
                                    if(menuItem1 != null) {
                                        menuItem1.setOnMenuItemClickListener(new CLS142(((CLS3)ᴵᵢ0), 27));
                                    }
                                    CLS882 ﾞٴ1 = new CLS882(((CLS3)ᴵᵢ0), 28);
                                    CLS21.FLD76.MTH824("ontimelinemenu_click", 20000, ((CLS35)ﾞٴ1));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

