// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ˆʿ.CLS54;
import b.ˆʿ.CLS62;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS82;
import b.ˊﾞ.CLS101;
import b.ˑٴ.CLS794;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1509;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS387.CLS1305;
import b.ⁱᵔ.CLS387.CLS1317;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS425;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS1626;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS566 implements CLS12 {
    public final int FLD80;
    public final Object FLD81;
    public final Object FLD82;
    public final Object FLD83;
    public final Object FLD84;

    public CLS566(Activity activity0, String s, CLS557[] arr_ˆٴ, String[] arr_s) {
        this.FLD80 = 7;
        super();
        this.FLD82 = arr_ˆٴ;
        this.FLD84 = arr_s;
        this.FLD81 = s;
        this.FLD83 = activity0;
    }

    public CLS566(Object object0, Object object1, Object object2, Object object3, int v) {
        this.FLD80 = v;
        this.FLD83 = object0;
        this.FLD82 = object1;
        this.FLD84 = object2;
        this.FLD81 = object3;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        boolean z;
        int v = 0;
        Object object1 = this.FLD81;
        Object object2 = this.FLD84;
        Object object3 = this.FLD82;
        Object object4 = this.FLD83;
        switch(this.FLD80) {
            case 0: {
                Activity activity0 = (Activity)object4;
                CLS17 ﾞٴ0 = (CLS17)object3;
                CLS17 ﾞٴ1 = (CLS17)object2;
                CLS17 ﾞٴ2 = (CLS17)object1;
                Intent intent0 = (Intent)object0;
                if(intent0 != null) {
                    try {
                        Uri uri0 = intent0.getData();
                        if(uri0 != null) {
                            String s1 = CLS31.MTH985(activity0, uri0);
                            String s2 = CLS31.MTH1023(uri0);
                            String s3 = CLS31.MTH969(activity0, uri0);
                            if(!TextUtils.isEmpty(s3)) {
                                File file0 = new File(s3);
                                if(file0.canRead() && ﾞٴ0 != null) {
                                    ﾞٴ0.MTH796(new Object[]{file0, s1, s2});
                                    return;
                                }
                            }
                            if(ﾞٴ1 != null) {
                                try {
                                    ﾞٴ1.MTH796(new Object[]{uri0, s1, s2});
                                    return;
                                }
                                catch(Throwable throwable1) {
                                    CLS27.MTH893(throwable1);
                                }
                            }
                            InputStream inputStream0 = activity0.getContentResolver().openInputStream(uri0);
                            if(inputStream0 != null && ﾞٴ2 != null) {
                                try {
                                    ﾞٴ2.MTH796(new Object[]{inputStream0, s1, s2});
                                }
                                catch(Throwable throwable2) {
                                    CLS27.MTH893(throwable2);
                                }
                                return;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 1: {
                ((CLS794)object4).FLD1147.MTH1646(((String)object3), ((ArrayList)object2));
                ((CLS3)object1).MTH774();
                ArrayList arrayList0 = ((CLS794)object4).FLD1147.MTH1634(((String)object3));
                ArrayList arrayList1 = new ArrayList();
                Iterator iterator1 = arrayList0.iterator();
                while(iterator1.hasNext()) {
                    iterator1.next();
                    arrayList1.add("");
                }
                CLS404.MTH5896(((String)object3), arrayList1, arrayList0);
                return;
            }
            case 2: {
                String s4 = new String(((byte[])object0));
                ((Set)object4).remove(((String)object3));
                if(!TextUtils.isEmpty(s4)) {
                    String s5 = CLS502.MTH6921(s4);
                    ((ContentValues)object2).remove("url");
                    ((ContentValues)object2).put("type", 1);
                    ((ContentValues)object2).put("content", s5);
                    ((ContentValues)object2).put("desc", s5);
                }
                ((CLS3)object1).MTH774();
                return;
            }
            case 3: {
                ((CLS1105)object4).getClass();
                ((CLS1105)object4).MTH4172(((String)object3), ((JSONObject)object0));
                ((CLS380[])object2)[0].dismiss();
                ((CLS1105)object4).MTH4174(((String)object3), ((String)object1));
                return;
            }
            case 4: {
                for(Object object6: ((ArrayList)object0)) {
                    File file1 = (File)object6;
                    CLS557 ˆٴ0 = CLS101.MTH1943(file1.getAbsolutePath());
                    if(ˆٴ0 == null) {
                        CLS412.MTH6013(((Activity)object4), file1.getAbsolutePath() + " " + CLS27.MTH889("failed"));
                    }
                    else {
                        int v1 = ˆٴ0.MTH7474();
                        CLS54.FLD172.MTH1243(((CLS82)object3), file1, v1);
                        ((ArrayList)object2).add(((double)ˆٴ0.MTH7474()) / 1000.0 + " " + CLS27.MTH889("second"));
                        ((CLS369)object1).notifyDataSetChanged();
                    }
                }
                return;
            }
            case 5: {
                Activity activity1 = (Activity)object4;
                HashSet hashSet0 = (HashSet)object3;
                ArrayList arrayList2 = (ArrayList)object2;
                String s6 = (String)object0;
                if(!TextUtils.isEmpty(s6)) {
                    HashSet hashSet1 = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    if(!s6.startsWith("[{") && !s6.startsWith("{")) {
                        String[] arr_s = CLS502.MTH6941(s6);
                        while(v < arr_s.length) {
                            String s7 = arr_s[v].trim();
                            if(!hashSet1.contains(s7)) {
                                hashSet1.add(s7);
                                arrayList3.add(new CLS78(s7, ((CLS371)object1).MTH5311(s7)));
                            }
                            ++v;
                        }
                        CLS387.MTH5585(false, activity1, arrayList3, ((CLS2)new CLS1305(activity1, arrayList2, hashSet0)), "", -1);
                        return;
                    }
                    try {
                        JSONArray jSONArray0 = new JSONArray(s6);
                        while(true) {
                            if(v >= jSONArray0.length()) {
                                CLS387.MTH5585(false, activity1, arrayList3, ((CLS2)new CLS1317(activity1, arrayList2, hashSet0)), "", -1);
                                return;
                            }
                            JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                            if(!jSONObject0.has("username")) {
                                break;
                            }
                            String s8 = jSONObject0.getString("username");
                            String s9 = jSONObject0.optString("nickname");
                            if(TextUtils.isEmpty(s9)) {
                                s9 = s8;
                            }
                            CLS78 ˊﾞ0 = new CLS78(s8, s9);
                            if(jSONObject0.has("alias")) {
                                ˊﾞ0.FLD276 = jSONObject0.getString("alias");
                            }
                            if(jSONObject0.has("v1")) {
                                ˊﾞ0.FLD273 = jSONObject0.getString("v1");
                            }
                            if(jSONObject0.has("sex")) {
                                ˊﾞ0.FLD278 = jSONObject0.getInt("sex");
                            }
                            if(jSONObject0.has("location")) {
                                ˊﾞ0.FLD277 = jSONObject0.getString("location");
                            }
                            if(!hashSet1.contains(s8)) {
                                hashSet1.add(s8);
                                arrayList3.add(ˊﾞ0);
                            }
                            ++v;
                        }
                    }
                    catch(Throwable throwable3) {
                        CLS27.MTH893(throwable3);
                    }
                }
                return;
            }
            case 6: {
                String s10 = (String)object4;
                ArrayList arrayList4 = (ArrayList)object3;
                CLS1626 ـﹳ0 = (CLS1626)object2;
                CLS335 ˑٴ0 = (CLS335)object1;
                String s11 = (String)object0;
                try {
                    JSONArray jSONArray1 = new JSONArray(s11);
                    for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                        JSONObject jSONObject1 = jSONArray1.getJSONObject(v2);
                        String s12 = jSONObject1.getString("SECRETKEY");
                        if(jSONObject1.getString("TAG").equals(s10)) {
                            CLS62 ﾞᐧ0 = CLS62.FLD190;
                            Cursor cursor0 = ﾞᐧ0.FLD189.MTH1207(s12);
                            if(cursor0 == null) {
                                z = false;
                            }
                            else {
                                int v3 = cursor0.getCount();
                                cursor0.close();
                                if(v3 > 0) {
                                    z = true;
                                }
                            }
                            if(!z) {
                                ContentValues contentValues0 = CLS412.MTH6006(jSONObject1);
                                ﾞᐧ0.FLD189.MTH1211(contentValues0);
                                contentValues0.put("desc", CLS426.MTH6119(contentValues0));
                                arrayList4.add(contentValues0);
                            }
                        }
                    }
                    ـﹳ0.MTH7325("" + arrayList4.size());
                    ˑٴ0.notifyDataSetChanged();
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 7: {
                if(((CLS557[])object3)[0] == null) {
                    ((CLS557[])object3)[0] = CLS101.MTH1947(CLS462.FLD4511, CLS462.FLD4513, ((String[])object2)[0]);
                }
                CLS559 ᵔʾ0 = new CLS559(((CLS557[])object3)[0]);
                String s13 = new File(((File)object0), CLS182.MTH3476(((String)object1), ".wav")).getAbsolutePath();
                if(ᵔʾ0.MTH7485(s13)) {
                    CLS412.MTH6013(((Activity)object4), CLS27.MTH889("file_written_to") + s13);
                }
                return;
            }
            default: {
                CLS425 ˊﹳ0 = ((CLS1509)object4).FLD4596;
                String s = ˊﹳ0.FLD4088;
                ˊﹳ0.FLD4091.MTH1646(s, ((ArrayList)object3));
                for(Object object5: ((ArrayList)object3)) {
                    ˊﹳ0.FLD4096.MTH5046(((String)object5));
                }
                ˊﹳ0.FLD4096.notifyDataSetChanged();
                CLS404.MTH5896(s, ((ArrayList)object2), ((ArrayList)object1));
            }
        }
    }
}

