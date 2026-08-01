// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.os.Environment;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS566;
import b.ʾᵢ.CLS568;
import b.ʾᵢ.CLS569;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS44;
import b.ˆʿ.CLS54;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS91;
import b.ˊﾞ.CLS612;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS1062;
import b.ᐧˉ.CLS1093;
import b.ᐧˉ.CLS1156;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS210;
import b.ᵔʾ.CLS1228;
import b.ᵔʾ.CLS1259;
import b.ⁱʾ.CLS326;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS338;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS344;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS350;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1279;
import b.ⁱᵔ.CLS1291;
import b.ⁱᵔ.CLS1328;
import b.ⁱᵔ.CLS1412;
import b.ⁱᵔ.CLS1556;
import b.ⁱᵔ.CLS1603;
import b.ⁱᵔ.CLS1609;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS387.CLS1321;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395.CLS1339;
import b.ⁱᵔ.CLS395.CLS1352;
import b.ⁱᵔ.CLS403.CLS1379;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1626;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS848 implements CLS3 {
    public final int FLD1331;
    public final Object FLD1332;
    public final Object FLD1333;
    public final Object FLD1334;
    public final Object FLD1335;

    public CLS848(Activity activity0, String[] arr_s, CLS568 יᐧ0, String s) {
        this.FLD1331 = 21;
        super();
        this.FLD1334 = activity0;
        this.FLD1335 = arr_s;
        this.FLD1332 = יᐧ0;
        this.FLD1333 = s;
    }

    public CLS848(CLS1019 ˎʻ0, CLS3 ˆٴ0, CLS350 ᐧⁱ0, Activity activity0) {
        this.FLD1331 = 3;
        super();
        this.FLD1333 = ˎʻ0;
        this.FLD1334 = ˆٴ0;
        this.FLD1335 = ᐧⁱ0;
        this.FLD1332 = activity0;
    }

    public CLS848(Object object0, Object object1, Object object2, Object object3, int v) {
        this.FLD1331 = v;
        this.FLD1334 = object0;
        this.FLD1333 = object1;
        this.FLD1335 = object2;
        this.FLD1332 = object3;
        super();
    }

    public CLS848(Object object0, Object object1, Object object2, Object object3, int v, int v1) {
        this.FLD1331 = v;
        this.FLD1334 = object0;
        this.FLD1335 = object1;
        this.FLD1333 = object2;
        this.FLD1332 = object3;
        super();
    }

    public CLS848(String s, Activity activity0, HashSet hashSet0, ArrayList arrayList0) {
        this.FLD1331 = 16;
        super();
        this.FLD1333 = s;
        this.FLD1334 = activity0;
        this.FLD1332 = hashSet0;
        this.FLD1335 = arrayList0;
    }

    public CLS848(ArrayList arrayList0, HashMap hashMap0, String s, CLS369 ﾞᵎ0) {
        this.FLD1331 = 18;
        super();
        this.FLD1335 = arrayList0;
        this.FLD1334 = hashMap0;
        this.FLD1333 = s;
        this.FLD1332 = ﾞᵎ0;
    }

    public CLS848(String[] arr_s, HashSet hashSet0, CLS29 ˎᵢ0, CLS1603 ﹶᵎ0) {
        this.FLD1331 = 7;
        super();
        this.FLD1333 = arr_s;
        this.FLD1335 = hashSet0;
        this.FLD1332 = ˎᵢ0;
        this.FLD1334 = ﹶᵎ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        StringBuilder stringBuilder0;
        int v = 0;
        Object object0 = this.FLD1332;
        Object object1 = this.FLD1335;
        Object object2 = this.FLD1333;
        Object object3 = this.FLD1334;
        switch(this.FLD1331) {
            case 0: {
                ((CLS3)object3).MTH774();
                CLS404.MTH5896(((String)object2), ((ArrayList)object1), ((ArrayList)object0));
                return;
            }
            case 1: {
                ((CLS210)object3).getClass();
                ArrayList arrayList0 = new ArrayList();
                ((CLS210)object3).FLD2006.MTH5313(((CLS210)object3).FLD2015, arrayList0);
                HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(((ContentValues)object2).getAsString("chatrooms"))));
                ArrayList arrayList1 = new ArrayList();
                for(Object object4: arrayList0) {
                    CLS78 ˊﾞ0 = (CLS78)object4;
                    if(!hashSet0.contains("")) {
                        hashSet0.add("");
                        arrayList1.add(ˊﾞ0);
                    }
                }
                CLS372.MTH5405(arrayList1);
                CLS387.MTH5600(true, ((Activity)object1), arrayList1, ((CLS2)new CLS1093(((CLS210)object3), ((ContentValues)object2), ((CLS359)object0))));
                return;
            }
            case 2: {
                ((CLS1019)object3).getClass();
                new String("WxChatroomManagementTempl_");
                CLS403.MTH5868(((Activity)object2), CLS27.MTH889("apply_template"), "WxChatroomManagementTemplates", "WxChatroomManagementTempl_", ((CLS12)new CLS1228(((CLS1019)object3), ((CLS78)object1), ((CLS380[])object0), 5)));
                return;
            }
            case 3: {
                ((CLS1019)object2).getClass();
                CLS31.MTH991(((Activity)object0), ((CLS441)new CLS1259(((CLS1019)object2), ((CLS3)object3), ((CLS350)object1), 24)));
                return;
            }
            case 4: {
                ((CLS1062)object3).getClass();
                CLS612 ᵔʾ0 = new CLS612(((CLS1062)object3), ((File)object2), ((HashMap)object1), ((Activity)object0), 14);
                CLS40.FLD157.MTH1124(((CLS39)ᵔʾ0));
                return;
            }
            case 5: {
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS1339(((Activity)object3), ((CLS29)object1), ((String)object2), ((String)object0))));
                return;
            }
            case 6: {
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS1352(((ArrayList)object1), ((String)object2), ((CLS338)object0))));
                return;
            }
            case 7: {
                String s = ((String[])object2)[0];
                if(!TextUtils.isEmpty(s) && !((HashSet)object1).isEmpty()) {
                    HashSet hashSet1 = new HashSet(Arrays.asList(((CLS29)object0).MTH925(CLS182.MTH3484(4100830419849368373L, new StringBuilder(), s), "").split(";")));
                    for(Object object5: ((HashSet)object1)) {
                        hashSet1.remove(((String)object5));
                    }
                    String s1 = CLS182.MTH3484(4100830462799041333L, new StringBuilder(), s);
                    ((CLS29)object0).MTH922(TextUtils.join(";", hashSet1), s1);
                    ((CLS3)object3).MTH774();
                }
                return;
            }
            case 8: {
                CLS1049 ˑᴵ0 = new CLS1049(((CLS82)object2), ((ArrayList)object1), ((CLS326)object0), 20);
                AlertDialog[] arr_alertDialog = {null};
                arr_alertDialog[0] = CLS523.MTH7150(((Activity)object3), "", ((CLS17)new CLS1049(((Activity)object3), arr_alertDialog, ˑᴵ0, 22)));
                return;
            }
            case 9: {
                ((CLS54)object3).MTH1246(((CLS82)object2));
                ((ArrayList)object1).remove(((CLS82)object2));
                ((CLS326)object0).notifyDataSetChanged();
                return;
            }
            case 10: {
                CLS568 יᐧ0 = new CLS568(((AlertDialog[])object1), ((CLS7)object0), 13);
                ArrayList arrayList2 = new ArrayList();
                while(v < ((CLS82)object2).MTH1678()) {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("desc", ((double)((CLS82)object2).MTH1679(v)) / 1000.0 + " " + CLS27.MTH889("second"));
                    contentValues0.put("file", ((CLS82)object2).MTH1674(v));
                    contentValues0.put("length", ((CLS82)object2).MTH1679(v));
                    arrayList2.add(contentValues0);
                    ++v;
                }
                CLS1624 יﹳ0 = new CLS1624(((Activity)object3));
                CLS338 יᐧ1 = new CLS338(((Activity)object3), arrayList2, יﹳ0);
                CLS523.MTH7160(((Activity)object3), CLS27.MTH889("send"), ((CLS17)new CLS1156(יﹳ0, יᐧ1, 24)), ((CLS11)new CLS1291(יᐧ1, ((CLS82)object2), יᐧ0)));
                return;
            }
            case 11: {
                CLS566 ˈˊ0 = new CLS566(((Activity)object3), ((CLS82)object2), ((ArrayList)object1), ((CLS369)object0), 4);
                String s2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                CLS31.MTH1000(((Activity)object3), ((CLS17)new CLS569(((Activity)object3), ((CLS12)ˈˊ0), 0)), new String[]{"silk", "slk", "amr"}, new String[]{"audio/amr", "audio/silk"}, s2, null);
                return;
            }
            case 12: {
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS1609(((CLS54)object2), ((ArrayList)object1), ((CLS341[])object0))));
                return;
            }
            case 13: {
                CLS31.MTH991(((Activity)object2), ((CLS441)new CLS612(((CLS43)object3), ((Activity)object2), ((ArrayList)object1), ((CLS347)object0), 29)));
                return;
            }
            case 14: {
                CLS31.MTH991(((Activity)object0), ((CLS441)new CLS1049(((CLS61)object3), ((ArrayList)object1), ((CLS369)object2), 27)));
                return;
            }
            case 15: {
                CLS387.MTH5585(false, ((Activity)object3), ((ArrayList)object1), ((CLS2)new CLS1379(((CLS17)object2), ((JSONObject)object0))), null, -1);
                return;
            }
            case 16: {
                ArrayList arrayList3 = new ArrayList();
                String[] arr_s = CLS502.MTH6941(((String)object2));
                while(v < arr_s.length) {
                    String s3 = arr_s[v];
                    CLS78 ˊﾞ1 = new CLS78(s3, CLS371.FLD3470.MTH5311(s3));
                    ˊﾞ1.FLD271 = true;
                    arrayList3.add(ˊﾞ1);
                    ++v;
                }
                CLS387.MTH5585(false, ((Activity)object3), arrayList3, ((CLS2)new CLS1321(((Activity)object3), ((ArrayList)object1), ((HashSet)object0))), "", -1);
                return;
            }
            case 17: {
                CLS568 יᐧ2 = new CLS568(((CLS363)object2), ((CLS1626)object0), 16);
                if(!((ArrayList)object1).isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(((ArrayList)object1));
                    CLS372.MTH5405(arrayList4);
                    HashSet hashSet2 = new HashSet();
                    for(Object object6: arrayList4) {
                        CLS78 ˊﾞ2 = (CLS78)object6;
                        CLS66.MTH1420(ˊﾞ2);
                        if(!TextUtils.isEmpty(ˊﾞ2.FLD277)) {
                            hashSet2.add(ˊﾞ2.FLD277);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(hashSet2);
                    Collections.sort(arrayList5, new CLS110(7));
                    arrayList5.add(0, CLS27.MTH889("radio_all"));
                    CLS1624 יﹳ1 = new CLS1624(((Activity)object3));
                    CLS366 ﾞᐧ0 = new CLS366(((Activity)object3), arrayList4);
                    ﾞᐧ0.FLD3456 = true;
                    CLS523.MTH7160(((Activity)object3), CLS27.MTH889("location_addr"), ((CLS17)new CLS766(((Activity)object3), ﾞᐧ0, arrayList4, arrayList5, יﹳ1, 28)), ((CLS11)new CLS1328(ﾞᐧ0, יᐧ2)));
                }
                return;
            }
            case 18: {
                ((ArrayList)object1).clear();
                ((HashMap)object3).clear();
                for(Object object7: CLS371.FLD3470.MTH5328(((String)object2))) {
                    String s4 = (String)object7;
                    CLS371 ʻ0 = CLS371.FLD3470;
                    if(ʻ0.MTH5382(s4)) {
                        String s5 = ʻ0.MTH5311(s4);
                        ((HashMap)object3).put(s5, s4);
                        ((ArrayList)object1).add(s5);
                    }
                }
                ((CLS369)object0).notifyDataSetChanged();
                return;
            }
            case 19: {
                HashMap hashMap0 = (HashMap)object3;
                String s6 = (String)object2;
                Activity activity0 = (Activity)object1;
                String s7 = (String)object0;
                try {
                    String s8 = TextUtils.join(",", hashMap0.values());
                    ArrayList arrayList6 = new ArrayList();
                    CLS371.FLD3470.MTH5381(s6, arrayList6);
                    CLS387.MTH5585(false, activity0, arrayList6, ((CLS2)new CLS1412(s7, hashMap0)), s8, -1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 20: {
                CLS523.MTH7142(((Activity)object3), ((CLS11)new CLS1556(((ArrayList)object1), ((CLS1626)object2), ((CLS335)object0))));
                return;
            }
            case 21: {
                CLS31.MTH982(((Activity)object3), ((CLS12)new CLS568(((String[])object1), ((CLS12)object0), 19)), ((String)object2), ((String[])object1)[0]);
                return;
            }
            case 22: {
                ContentValues contentValues1 = (ContentValues)object3;
                String s9 = (String)object2;
                JSONObject jSONObject0 = (JSONObject)object1;
                contentValues1.put("url", s9);
                try {
                    int v1 = jSONObject0.getInt("type");
                    if(v1 == 1) {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(CLS27.MTH889("web_img"));
                        goto label_162;
                    }
                    else if(v1 == 15) {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(CLS27.MTH889("web_vid"));
                    label_162:
                        stringBuilder0.append(": ");
                        stringBuilder0.append(s9);
                        contentValues1.put("desc", stringBuilder0.toString());
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                ((CLS335)object0).notifyDataSetChanged();
                return;
            }
            case 23: {
                CLS523.MTH7165(((Activity)object3), CLS27.MTH889("modify"), "", ((CLS91)object2).MTH1735(), 1, ((CLS16)new CLS1279(((CLS91)object2), ((CLS44)object1), ((CLS344)object0), 7)));
                return;
            }
            default: {
                CLS523.MTH7165(((Activity)object3), CLS27.MTH889("input_url"), "", ((ContentValues)object2).getAsString("url"), 1, ((CLS16)new CLS1279(((ContentValues)object2), ((JSONObject)object1), ((CLS335)object0), 6)));
            }
        }
    }
}

