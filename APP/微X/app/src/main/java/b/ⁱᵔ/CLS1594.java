// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1594 implements CLS3 {
    public final int FLD5021;
    public final Activity FLD5022;
    public final ArrayList FLD5023;
    public final String FLD5024;

    public CLS1594(Activity activity0, String s, ArrayList arrayList0) {
        this.FLD5021 = 2;
        super();
        this.FLD5022 = activity0;
        this.FLD5023 = arrayList0;
        this.FLD5024 = s;
    }

    public CLS1594(Activity activity0, String s, ArrayList arrayList0, int v) {
        this.FLD5021 = v;
        this.FLD5022 = activity0;
        this.FLD5024 = s;
        this.FLD5023 = arrayList0;
        super();
    }

    public CLS1594(ArrayList arrayList0, Activity activity0, String s, int v) {
        this.FLD5021 = v;
        this.FLD5023 = arrayList0;
        this.FLD5022 = activity0;
        this.FLD5024 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD5024;
        Activity activity0 = this.FLD5022;
        ArrayList arrayList0 = this.FLD5023;
        switch(this.FLD5021) {
            case 0: {
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object0: arrayList0) {
                        ContentValues contentValues0 = (ContentValues)object0;
                        JSONObject jSONObject0 = new JSONObject();
                        String s1 = contentValues0.getAsString("wxid");
                        if(!s1.equals(CLS27.MTH904())) {
                            jSONObject0.put("wxid", s1);
                            jSONObject0.put("name", contentValues0.getAsString("name"));
                            if(contentValues0.containsKey("remark")) {
                                jSONObject0.put("remark", contentValues0.getAsString("remark"));
                            }
                            if(contentValues0.containsKey("nicknameInChatroom")) {
                                jSONObject0.put("nickname", contentValues0.getAsString("nicknameInChatroom"));
                            }
                            if(contentValues0.containsKey("alias")) {
                                jSONObject0.put("alias", contentValues0.getAsString("alias"));
                            }
                            if(contentValues0.containsKey("sex")) {
                                jSONObject0.put("sex", contentValues0.getAsInteger("sex"));
                            }
                            if(contentValues0.containsKey("location")) {
                                jSONObject0.put("location", contentValues0.getAsString("location"));
                            }
                            if(contentValues0.containsKey("isOwner")) {
                                jSONObject0.put("isOwner", contentValues0.getAsBoolean("isOwner"));
                            }
                            if(contentValues0.containsKey("isMod")) {
                                jSONObject0.put("isMod", contentValues0.getAsBoolean("isMod"));
                            }
                            if(contentValues0.containsKey("time")) {
                                jSONObject0.put("lastMsgTime", contentValues0.getAsLong("time"));
                            }
                            if(contentValues0.containsKey("count")) {
                                jSONObject0.put("totalMsg", contentValues0.getAsInteger("count"));
                            }
                            if(contentValues0.containsKey("todayCount")) {
                                jSONObject0.put("todayMsg", contentValues0.getAsInteger("todayCount"));
                            }
                            jSONArray0.put(jSONObject0);
                        }
                    }
                    SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyyMMddHHmmss");
                    CLS31.MTH999(activity0, jSONArray0.toString(), CLS31.MTH979((s + " （" + CLS371.FLD3470.MTH5316(s) + ") " + simpleDateFormat0.format(new Date(System.currentTimeMillis()))), "json"));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                if(!arrayList0.isEmpty()) {
                    try {
                        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        JSONArray jSONArray1 = new JSONArray();
                        for(int v = 0; v < arrayList0.size(); ++v) {
                            ContentValues contentValues1 = (ContentValues)arrayList0.get(v);
                            String s2 = contentValues1.getAsString("CHATROOM");
                            int v1 = (int)contentValues1.getAsInteger("COUNT");
                            String s3 = contentValues1.getAsString("USERNAME");
                            long v2 = (long)contentValues1.getAsLong("TIME");
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("chatroom_id", s2);
                            jSONObject1.put("chatroom_name", CLS371.FLD3470.MTH5316(s2));
                            jSONObject1.put("wxid", s3);
                            jSONObject1.put("name", CLS426.MTH6116(s2, s3));
                            jSONObject1.put("count", v1);
                            jSONObject1.put("time", simpleDateFormat1.format(new Date(v2)));
                            jSONArray1.put(jSONObject1);
                        }
                        CLS31.MTH999(activity0, jSONArray1.toString(), s + "_checkin.json");
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 2: {
                CLS387.MTH5595(false, activity0, CLS27.MTH889("not_participating_members") + " (" + arrayList0.size() + ")", arrayList0, new CLS1307(activity0, s));
                return;
            }
            case 3: {
                try {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator iterator1 = arrayList0.iterator();
                    while(iterator1.hasNext()) {
                        iterator1.next();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("wxid", "");
                        jSONObject2.put("name", "");
                        jSONArray2.put(jSONObject2);
                    }
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss");
                    CLS31.MTH999(activity0, jSONArray2.toString(), CLS31.MTH979((s + " （" + CLS371.FLD3470.MTH5316(s) + ") " + simpleDateFormat2.format(new Date(System.currentTimeMillis()))), "json"));
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 4: {
                try {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator iterator2 = arrayList0.iterator();
                    while(iterator2.hasNext()) {
                        iterator2.next();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("wxid", "");
                        jSONObject3.put("name", "");
                        jSONArray3.put(jSONObject3);
                    }
                    SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyyMMddHHmmss");
                    CLS31.MTH999(activity0, jSONArray3.toString(), CLS31.MTH979((s + " （" + CLS371.FLD3470.MTH5316(s) + ") " + simpleDateFormat3.format(new Date(System.currentTimeMillis()))), "json"));
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 5: {
                CLS403.MTH5864(activity0, s, arrayList0, ((CLS2)new CLS1316(activity0, s)));
                return;
            }
            default: {
                CLS403.MTH5864(activity0, s, arrayList0, ((CLS2)new CLS1308(activity0, s)));
            }
        }
    }
}

