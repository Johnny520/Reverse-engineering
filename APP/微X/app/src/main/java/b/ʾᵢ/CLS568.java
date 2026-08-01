// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ˈˈ.CLS71;
import b.ˈˊ.CLS610;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS117;
import b.ˑٴ.CLS139;
import b.ˑٴ.CLS140;
import b.ˑٴ.CLS629;
import b.ˑٴ.CLS635;
import b.ˑٴ.CLS692;
import b.ˑٴ.CLS794;
import b.ˑٴ.CLS818;
import b.ˑٴ.CLS843;
import b.ˑٴ.CLS849;
import b.יᐧ.CLS151.CLS149;
import b.יᐧ.CLS151;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS1056;
import b.ᐧˉ.CLS1062;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS186;
import b.ᐧˉ.CLS219;
import b.ᐧˉ.CLS938;
import b.ᵔʾ.CLS1225;
import b.ⁱʾ.CLS353;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1465;
import b.ⁱᵔ.CLS1506;
import b.ⁱᵔ.CLS1509;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS418;
import b.ⁱᵔ.CLS425;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1616.CLS524;
import b.ﾞˎ.CLS1616;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1621;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1626;
import b.ﾞٴ.CLS1636;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class CLS568 implements CLS12 {
    public final int FLD127;
    public final Object FLD128;
    public final Object FLD129;

    public CLS568(CLS219 ˏʻ0, Activity activity0, int v) {
        this.FLD127 = v;
        this.FLD128 = ˏʻ0;
        this.FLD129 = activity0;
        super();
    }

    public CLS568(Object object0, Object object1, int v) {
        this.FLD127 = v;
        this.FLD129 = object0;
        this.FLD128 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        long v9;
        StringBuilder stringBuilder1;
        File file0 = null;
        int v = 0;
        Object object1 = this.FLD128;
        Object object2 = this.FLD129;
        switch(this.FLD127) {
            case 0: {
                CLS12 ᵔʾ0 = (CLS12)object1;
                if(((Intent)object0) != null) {
                    String s = CLS31.MTH969(((Activity)object2), ((Intent)object0).getData());
                    if(!TextUtils.isEmpty(s)) {
                        File file1 = new File(s);
                        if(file1.isFile()) {
                            file0 = file1.getParentFile();
                        }
                        else if(file1.isDirectory()) {
                            file0 = file1;
                        }
                        if(file0 != null && file0.canRead()) {
                            try {
                                ᵔʾ0.MTH791(file0);
                                return;
                            }
                            catch(Throwable throwable0) {
                                CLS27.MTH893(throwable0);
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                CLS1621 ˎᵢ0 = (CLS1621)object2;
                ˎᵢ0.getClass();
                ˎᵢ0.FLD5241 = (long)(((Long)object0));
                ((CLS1626)object1).MTH798(ˎᵢ0.MTH7261());
                CLS538 ˎᵢ$ˆٴ0 = ˎᵢ0.FLD5242;
                if(ˎᵢ$ˆٴ0 != null) {
                    try {
                        ˎᵢ$ˆٴ0.MTH7258(ˎᵢ0.FLD5241);
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 2: {
                CLS1616 ʻˏ0 = (CLS1616)object2;
                ʻˏ0.getClass();
                ʻˏ0.FLD5143 = ((Bundle)object0).getLong("start");
                ʻˏ0.FLD5137 = ((Bundle)object0).getLong("end");
                ((CLS1626)object1).MTH798(ʻˏ0.MTH7184());
                CLS524 ʻˏ$ˆٴ0 = ʻˏ0.FLD5144;
                if(ʻˏ$ˆٴ0 != null) {
                    try {
                        ʻˏ$ˆٴ0.MTH7175(ʻˏ0.FLD5143, ʻˏ0.FLD5137);
                        return;
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                return;
            }
            case 3: {
                ((CLS794)object2).getClass();
                CLS71 ˆٴ0 = new CLS71(((CLS140)(((CLS794)object2))).MTH3042(), null);
                ˆٴ0.MTH1572("move_out", ((CLS3)new CLS635(((CLS794)object2), ((String)object0), ((String)object1), 0)));
                ˆٴ0.MTH1572("move_to", ((CLS3)new CLS635(((CLS794)object2), ((String)object1), ((String)object0), 1)));
                ˆٴ0.MTH1573();
                return;
            }
            case 4: {
                CLS818 ᵎⁱ0 = (CLS818)object2;
                ArrayList arrayList0 = (ArrayList)object1;
                ᵎⁱ0.getClass();
                try {
                    int v1 = (int)(((Integer)object0));
                    if(v1 < arrayList0.size()) {
                        ContentValues contentValues0 = (ContentValues)arrayList0.get(v1);
                        String s1 = contentValues0.getAsString("nickname");
                        String s2 = contentValues0.getAsString("username");
                        String s3 = contentValues0.getAsString("ticket");
                        int v2 = (int)contentValues0.getAsInteger("scene");
                        String s4 = CLS27.MTH889("accept_friend_req");
                        CLS412.MTH6014(((CLS140)ᵎⁱ0).MTH3042(), String.format(s4, s1) + " " + (v1 + 1));
                        ᵎⁱ0.MTH2789(v2, s2, s3);
                        return;
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 5: {
                ((CLS629)object2).getClass();
                CLS151 ˊﾞ0 = new CLS151();
                ˊﾞ0.FLD1544 = new CLS843(((CLS629)object2), ((Boolean)object0).booleanValue());
                ˊﾞ0.MTH3138(1, ((CLS149)new CLS610(14)));
                ˊﾞ0.MTH3138(3, ((CLS149)new CLS610(15)));
                ˊﾞ0.FLD1540 = new CLS1225(11);
                ArrayList arrayList1 = new ArrayList();
                for(Object object3: ((List)object1)) {
                    long v3 = CLS166.MTH3185(object3, "field_msgSvrId");
                    long v4 = CLS166.MTH3185(object3, "field_msgId");
                    String s5 = (String)CLS166.MTH3194(object3, "field_imgPath");
                    int v5 = CLS166.MTH3181(object3, "field_isSend");
                    int v6 = CLS166.MTH3181(object3, "field_type");
                    if(v6 == 1 || v6 == 3) {
                        Bundle bundle0 = new Bundle();
                        bundle0.putInt("isSend", v5);
                        bundle0.putString("imgPath", s5);
                        bundle0.putLong("msgSvrId", v3);
                        bundle0.putLong("msgId", v4);
                        bundle0.putInt("type", v6);
                        if(v6 == 1) {
                            bundle0.putString("stripContent", CLS426.MTH6106(v5, ((String)CLS166.MTH3194(object3, "field_content")), ((String)CLS166.MTH3194(object3, "field_talker"))));
                        }
                        arrayList1.add(bundle0);
                    }
                }
                while(v < arrayList1.size()) {
                    Bundle bundle1 = (Bundle)arrayList1.get(v);
                    ˊﾞ0.MTH3134(bundle1.getInt("type"), bundle1);
                    ++v;
                }
                ˊﾞ0.MTH3137();
                return;
            }
            case 6: {
                ((CLS629)object2).getClass();
                long v7 = ((Bundle)object0).getLong("start");
                long v8 = ((Bundle)object0).getLong("end");
                String s6 = ((Bundle)object0).getString("members");
                CLS371 ʻ0 = CLS371.FLD3470;
                ʻ0.getClass();
                String s7 = "SELECT * FROM message WHERE talker = \'" + ((String)object1) + "\' AND createTime BETWEEN " + v7 + " AND " + v8;
                HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(s6)));
                if(CLS426.MTH6126(((String)object1))) {
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object4: hashSet0) {
                        String s8 = (String)object4;
                        if(!s8.equals(CLS27.MTH904())) {
                            arrayList2.add("content like \'" + s8 + ":%\'");
                        }
                    }
                    if(hashSet0.contains(CLS27.MTH904())) {
                        arrayList2.add("isSend = 1");
                    }
                    StringBuilder stringBuilder0 = CLS182.MTH3483(s7);
                    stringBuilder0.append(" AND (");
                    stringBuilder0.append(TextUtils.join(" OR ", arrayList2));
                    stringBuilder0.append(")");
                    s7 = stringBuilder0.toString();
                }
                else if(hashSet0.size() != 2) {
                    if(hashSet0.contains(CLS27.MTH904())) {
                        stringBuilder1 = CLS182.MTH3483(s7);
                        v9 = 4101300461070242613L;
                    }
                    else {
                        stringBuilder1 = CLS182.MTH3483(s7);
                        v9 = 4101300529789719349L;
                    }
                    s7 = CLS182.MTH3475(v9, stringBuilder1);
                }
                StringBuilder stringBuilder2 = CLS182.MTH3483(s7);
                stringBuilder2.append(" order by createTime asc");
                Cursor cursor0 = ʻ0.MTH5307(stringBuilder2.toString(), null);
                ArrayList arrayList3 = new ArrayList();
                Class class0 = CLS27.MTH894("msgClass");
                if(class0 != null && cursor0 != null) {
                    if(cursor0.moveToFirst()) {
                        while(true) {
                            Object object5 = CLS166.MTH3188(class0, new Object[0]);
                            CLS166.MTH3195(object5, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                            arrayList3.add(object5);
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                        }
                    }
                    if(!cursor0.isClosed()) {
                        cursor0.close();
                    }
                }
                CLS71 ˆٴ1 = new CLS71(((CLS140)(((CLS629)object2))).MTH3042(), null);
                CLS29 ˎᵢ1 = ((CLS629)object2).FLD1445;
                if(ˎᵢ1.MTH938("multi_voice_forward_enable", true)) {
                    ˆٴ1.MTH1572("forward_voices_to_friend", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 0)));
                }
                if(ˎᵢ1.MTH938("multi_broadcast_forward_enable", true)) {
                    ˆٴ1.MTH1572("mass_send", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 1)));
                }
                if(ˎᵢ1.MTH938("multi_image_forward_enable", true)) {
                    ˆٴ1.MTH1572("forward_images_to_sns", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 2)));
                    ˆٴ1.MTH1572("share_multi_images", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 3)));
                }
                if(ˎᵢ1.MTH938("forward_chat2chat", true)) {
                    ˆٴ1.MTH1572("forward_to_friends", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 4)));
                }
                boolean z = ˎᵢ1.MTH938("voice_manager", CLS412.MTH6002());
                CLS139 ﹶʼ0 = ((CLS629)object2).FLD1447;
                if(z && ﹶʼ0.FLD1438.MTH6895("voice_manager")) {
                    ˆٴ1.MTH1572("voice_manager_fav", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 5)));
                }
                if(ˎᵢ1.MTH938("merge_voice", CLS412.MTH6002()) && ﹶʼ0.FLD1438.MTH6895("merge_voice")) {
                    ˆٴ1.MTH1572("merge_voices", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 6)));
                }
                if(!CLS412.MTH6002()) {
                    if(ˎᵢ1.MTH938("chat_schedule_forward", false) && ﹶʼ0.FLD1438.MTH6895("chat_schedule_forward")) {
                        ˆٴ1.MTH1572("schedule_forward", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 7)));
                    }
                    if(ﹶʼ0.FLD1438.MTH6895("export_chat")) {
                        if(ˎᵢ1.MTH938("export_chat_msg", false)) {
                            ˆٴ1.MTH1572("export_chat_msg", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 8)));
                        }
                        if(ˎᵢ1.MTH938("copy_text", false)) {
                            ˆٴ1.MTH1572("copy_text", ((CLS3)new CLS849(((CLS629)object2), arrayList3, 9)));
                        }
                    }
                }
                ˆٴ1.MTH1573();
                return;
            }
            case 7: {
                ((CLS1019)object1).getClass();
                CLS403.MTH5861(((Activity)object2), "WxChatroomManagementTempl_", ((String)object0), new ArrayList(((CLS1019)object1).FLD2087), ((CLS17)new CLS938(((CLS1019)object1), 18)), ((CLS17)new CLS938(((CLS1019)object1), 19)));
                return;
            }
            case 8: {
                ((CLS1105)object1).getClass();
                CLS1056 יˏ0 = new CLS1056(((CLS1105)object1), 14);
                CLS1056 יˏ1 = new CLS1056(((CLS1105)object1), 15);
                CLS403.MTH5861(((Activity)object2), "WxRpCustomTempl_", ((String)object0), ((CLS1105)object1).FLD2419, ((CLS17)יˏ0), ((CLS17)יˏ1));
                return;
            }
            case 9: {
                ((CLS1105)object2).getClass();
                Integer integer0 = ((ContentValues)object0).getAsInteger("startH");
                Integer integer1 = ((ContentValues)object0).getAsInteger("startM");
                Integer integer2 = ((ContentValues)object0).getAsInteger("endH");
                Integer integer3 = ((ContentValues)object0).getAsInteger("endM");
                String s9 = CLS182.MTH3475(4100577300246745909L, CLS182.MTH3483(((String)object1)));
                ((CLS1105)object2).FLD2151.MTH922(integer0 + ":" + integer1 + ";" + integer2 + ":" + integer3, s9);
                return;
            }
            case 10: {
                Activity activity0 = (Activity)object2;
                ((CLS1062)object1).getClass();
                if(((ArrayList)object0) != null && !((ArrayList)object0).isEmpty()) {
                    if(((ArrayList)object0).size() == 1) {
                        File file2 = (File)((ArrayList)object0).get(0);
                        Uri uri0 = Uri.fromFile(file2);
                        String s10 = file2.getName();
                        int v10 = s10.lastIndexOf(".");
                        if(v10 != -1) {
                            s10 = s10.substring(0, v10);
                        }
                        CLS476.MTH6642(activity0, uri0, s10, new CLS186(((CLS1062)object1), file2.getAbsolutePath(), file2));
                        return;
                    }
                    CLS117 ˊʿ0 = new CLS117(((CLS1062)object1), ((ArrayList)object0), 1);
                    try {
                        CLS29 ˎᵢ2 = CLS27.MTH895();
                        CLS1622 ˑٴ0 = new CLS1622(activity0);
                        CLS523.MTH7145(activity0, CLS27.MTH889("encode"), ((CLS17)new CLS1049(ˑٴ0, ˎᵢ2, activity0, 21)), ((CLS11)new CLS1465(ˑٴ0, ˊʿ0)));
                        return;
                    }
                    catch(Throwable throwable4) {
                        CLS27.MTH893(throwable4);
                    }
                }
                return;
            }
            case 11: {
                if(!TextUtils.isEmpty(((String)object0))) {
                    ((String[])object2)[0] = (String)object0;
                    ((CLS3)object1).MTH774();
                }
                return;
            }
            case 12: {
                CLS1049 ˑᴵ0 = new CLS1049(((CLS557[])object2), ((ArrayList)object1), ((CLS12)object0), 18);
                CLS40.FLD157.MTH1124(((CLS39)ˑᴵ0));
                return;
            }
            case 13: {
                AlertDialog[] arr_alertDialog = (AlertDialog[])object2;
                CLS7 יᐧ0 = (CLS7)object1;
                try {
                    AlertDialog alertDialog0 = arr_alertDialog[0];
                    if(alertDialog0 != null) {
                        alertDialog0.dismiss();
                    }
                    if(יᐧ0 != null) {
                        יᐧ0.MTH784(object0);
                        return;
                    }
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 14: {
                String s11 = new File(((File)object0), CLS182.MTH3475(4101313350267097909L, CLS182.MTH3483(((String)object2)))).getAbsolutePath();
                CLS692 ˉᐧ0 = new CLS692(6, s11);
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                new CLS559(((CLS557)object1)).MTH7483(byteArrayOutputStream0);
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                try {
                    ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                    CLS1636 ˆٴ2 = new CLS1636(0);
                    if(ˆٴ2.FLD5437 != null) {
                        CLS612 ᵔʾ1 = new CLS612(ˆٴ2, byteArrayInputStream0, s11, ˉᐧ0, 0);
                        CLS40.FLD157.MTH1124(((CLS39)ᵔʾ1));
                        return;
                    }
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                return;
            }
            case 15: {
                ((CLS1626)object2).MTH798(((File)object0).getAbsolutePath());
                ((String[])object1)[0] = ((File)object0).getAbsolutePath();
                CLS27.MTH895().MTH922(((String[])object1)[0], "export_voice_path");
                return;
            }
            case 16: {
                if(((ArrayList)object0) != null && !((ArrayList)object0).isEmpty()) {
                    ((CLS363)object2).MTH5259(((ArrayList)object0));
                    ((CLS363)object2).notifyDataSetChanged();
                    ((CLS1626)object1).MTH7325(String.valueOf(((CLS363)object2).MTH5258()));
                }
                return;
            }
            case 17: {
                ArrayList arrayList4 = (ArrayList)object2;
                CLS369 ﾞᵎ0 = (CLS369)object1;
                String s12 = (String)object0;
                try {
                    JSONObject jSONObject0 = new JSONObject(s12);
                    JSONObject jSONObject1 = CLS27.MTH895().MTH921("invite_key_tags");
                    Iterator iterator2 = jSONObject0.keys();
                    while(iterator2.hasNext()) {
                        Object object6 = iterator2.next();
                        String s13 = (String)object6;
                        if(!jSONObject1.has(s13)) {
                            jSONObject1.put(s13, jSONObject0.optString(s13));
                        }
                    }
                    CLS27.MTH895().MTH922(jSONObject1, "invite_key_tags");
                    arrayList4.clear();
                    Iterator iterator3 = jSONObject1.keys();
                    while(iterator3.hasNext()) {
                        Object object7 = iterator3.next();
                        arrayList4.add(((String)object7));
                    }
                    ﾞᵎ0.notifyDataSetChanged();
                }
                catch(Throwable throwable7) {
                    CLS27.MTH893(throwable7);
                }
                return;
            }
            case 18: {
                if(((File)object0) != null && ((File)object0).isDirectory()) {
                    File[] arr_file = ((File)object0).listFiles(new CLS418(0));
                    ArrayList arrayList5 = ((CLS353)object2).FLD3403;
                    if(arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = ((CLS353)object2).FLD3400;
                    if(arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ((CLS353)object2).FLD3402.clear();
                    if(arr_file != null) {
                        while(v < arr_file.length) {
                            File file3 = arr_file[v];
                            ContentValues contentValues1 = new ContentValues();
                            contentValues1.put("file", file3.getAbsolutePath());
                            contentValues1.put("name", file3.getName());
                            contentValues1.put("ext", CLS31.MTH1006(file3));
                            ((ArrayList)object1).add(contentValues1);
                            ++v;
                        }
                    }
                    ((CLS353)object2).notifyDataSetChanged();
                }
                return;
            }
            case 19: {
                ((String[])object2)[0] = ((File)object0).getAbsolutePath();
                ((CLS12)object1).MTH791(((File)object0));
                return;
            }
            case 20: {
                String s14 = ((Bundle)object0).getString("vidUrl");
                if(!TextUtils.isEmpty(s14)) {
                    String s15 = ((Bundle)object0).getString("imgUrl");
                    CLS1506 ٴʿ0 = new CLS1506(((CLS1622)object2), s14, ((CLS1622)object1), (TextUtils.isEmpty(s15) ? s14 : s15), 10);
                    CLS40.FLD157.MTH1116(((CLS39)ٴʿ0));
                }
                return;
            }
            case 21: {
                CLS425 ˊﹳ0 = ((CLS1509)object2).FLD4596;
                ˊﹳ0.FLD4100.MTH1156(ˊﹳ0.FLD4106, ((ArrayList)object1));
                for(Object object8: ((ArrayList)object1)) {
                    ˊﹳ0.FLD4096.MTH5046(((String)object8));
                }
                ˊﹳ0.FLD4096.notifyDataSetChanged();
                ˊﹳ0.FLD4091.MTH1653(ˊﹳ0.FLD4088);
                return;
            }
            default: {
                CLS31.MTH1033(new File(((String)object2)), ((byte[])object0));
                ((ContentValues)object1).put("img", ((String)object2));
            }
        }
    }
}

