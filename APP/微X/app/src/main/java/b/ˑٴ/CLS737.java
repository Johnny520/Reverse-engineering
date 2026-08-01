// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS575;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS579;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS80;
import b.ˈˈ.CLS87;
import b.ˈˈ.CLS91;
import b.ˈˈ.CLS97;
import b.ˈˊ.CLS590;
import b.ˈˊ.CLS99;
import b.יᐧ.CLS151.CLS149;
import b.יᐧ.CLS151;
import b.יᐧ.CLS158;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS1135;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS200;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS231;
import b.ᐧˉ.CLS258;
import b.ᐧˉ.CLS968;
import b.ᐧˉ.CLS999;
import b.ᵔʾ.CLS309;
import b.ⁱʾ.CLS1274;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS409;
import b.ⁱᵔ.CLS412.CLS411;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS485.CLS484;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629.CLS548;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS530;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS737 implements CLS0, CLS16, CLS17, CLS39, CLS379, CLS411, CLS526, CLS548 {
    public final int FLD922;
    public final Object FLD923;
    public final Object FLD924;
    public final int FLD925;
    public final Object FLD926;

    public CLS737(int v, CLS87 ᐧˉ0, CLS629 ʻˋ0, String s) {
        this.FLD922 = 2;
        super();
        this.FLD926 = ʻˋ0;
        this.FLD924 = s;
        this.FLD925 = v;
        this.FLD923 = ᐧˉ0;
    }

    public CLS737(CLS786 ᐧᵢ0, String s, String s1, int v) {
        this.FLD922 = 4;
        super();
        this.FLD923 = ᐧᵢ0;
        this.FLD924 = s;
        this.FLD926 = s1;
        this.FLD925 = v;
    }

    public CLS737(CLS1105 ᐧˈ0, String s, Activity activity0, int v) {
        this.FLD922 = 6;
        super();
        this.FLD926 = ᐧˈ0;
        this.FLD924 = s;
        this.FLD923 = activity0;
        this.FLD925 = v;
    }

    public CLS737(CLS1622 ˑٴ0, String s, int v, String s1) {
        this.FLD922 = 7;
        super();
        this.FLD923 = ˑٴ0;
        this.FLD924 = s;
        this.FLD925 = v;
        this.FLD926 = s1;
    }

    public CLS737(Object object0, Object object1, int v, Object object2, int v1) {
        this.FLD922 = v1;
        this.FLD924 = object0;
        this.FLD926 = object1;
        this.FLD925 = v;
        this.FLD923 = object2;
        super();
    }

    public CLS737(Object object0, Object object1, Object object2, int v, int v1) {
        this.FLD922 = v1;
        this.FLD924 = object0;
        this.FLD926 = object1;
        this.FLD923 = object2;
        this.FLD925 = v;
        super();
    }

    public CLS737(int[] arr_v, int v, CLS97 ﾞٴ0, ProgressDialog progressDialog0) {
        this.FLD922 = 12;
        super();
        this.FLD924 = arr_v;
        this.FLD925 = v;
        this.FLD926 = ﾞٴ0;
        this.FLD923 = progressDialog0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        float f;
        int v11;
        int v7;
        int v6;
        int v5;
        String s6;
        int v4;
        int v3;
        int v2;
        CLS91 ᵔʾ0;
        int v = this.FLD925;
        Object object0 = this.FLD923;
        Object object1 = this.FLD926;
        Object object2 = this.FLD924;
        switch(this.FLD922) {
            case 0: {
                CLS309.FLD3190.getClass();
                ArrayList arrayList0 = CLS309.MTH4939();
                if(!arrayList0.isEmpty()) {
                    for(Object object11: arrayList0) {
                        CLS590 ˆٴ0 = (CLS590)(((CLS99)object11));
                        if(ˆٴ0.FLD500) {
                            CLS309.FLD3190.getClass();
                            if(CLS309.MTH4937(((CLS99)ˆٴ0)) && (((String)object2).equals(ˆٴ0.FLD434) || ((String)object1).equals(ˆٴ0.FLD435))) {
                                return;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
                CLS590 ˆٴ1 = new CLS590();
                ˆٴ1.FLD435 = (String)object1;
                ˆٴ1.FLD433 = (String)((Map)object0).get(".msg.appmsg.des");
                ˆٴ1.FLD434 = (String)object2;
                ˆٴ1.FLD432 = 1;
                CLS309.FLD3190.MTH4945(((CLS99)ˆٴ1), ((long)v));
                return;
            }
            case 4: {
                ((CLS786)object0).getClass();
                boolean z = CLS426.MTH6126(((String)object2));
                CLS139 ﹶʼ0 = ((CLS786)object0).FLD1447;
                boolean z1 = ﹶʼ0.FLD1438.MTH6895("rp_keyword");
                CLS44 ˆٴ2 = ((CLS786)object0).MTH2662();
                if(z1) {
                    HashSet hashSet0 = ˆٴ2.MTH1176("_MONEYTRANSFER_");
                    if(hashSet0.isEmpty()) {
                        ᵔʾ0 = null;
                    }
                    else {
                        ᵔʾ0 = null;
                        for(Object object12: hashSet0) {
                            String s18 = (String)object12;
                            if(!TextUtils.isEmpty(s18) && CLS502.MTH6930(s18, ((String)object1))) {
                                ᵔʾ0 = ((CLS786)object0).MTH2660(ˆٴ2.MTH1171("_MONEYTRANSFER_", s18), v, z, true);
                                if(ᵔʾ0 != null) {
                                    break;
                                }
                            }
                        }
                    }
                }
                else {
                    ᵔʾ0 = null;
                }
                if(ᵔʾ0 == null) {
                    ᵔʾ0 = ((CLS786)object0).MTH2660(ˆٴ2.MTH1173("_MONEYTRANSFER_"), v, z, z1);
                }
                if(ᵔʾ0 != null) {
                    String s19 = ᵔʾ0.MTH1735();
                    if(z1 && CLS502.MTH6934(s19, new String[]{"#A#"})) {
                        s19 = s19.replaceAll("#A#", String.valueOf(((double)v) / 100.0));
                    }
                    if(!TextUtils.isEmpty(s19) && (!s19.startsWith("#chatroom") || !z)) {
                        ﹶʼ0.MTH3016(s19, ((String)object2));
                    }
                }
                return;
            }
            case 8: {
                CLS1274 ﾞˎ0 = new CLS1274(((CLS151)object2), object0, 22);
                ((CLS149)object1).MTH3132(v, object0, ((CLS151)object2).FLD1541, ﾞˎ0);
                return;
            }
            default: {
                Class class0 = CLS27.MTH894("SightVideoJNI");
                Class class1 = CLS27.MTH894("SightClass1");
                Class class2 = CLS27.MTH894("VideoTransParaClass");
                Class class3 = CLS27.MTH894("PIntClass");
                Class class4 = CLS27.MTH894("SightInterface1");
                Class class5 = CLS27.MTH894("SubCoreVideoControlClass");
                String s = CLS31.MTH992(((String)object2));
                int v1 = (int)(((Integer)CLS166.MTH3192(class0, CLS27.MTH892("SightVideoJNI_shouldRemuxingVFS", "shouldRemuxingVFS"), new Object[]{s, 660, 500, 0x1900000, 300000.0, 1000000})));
                Class class6 = CLS485.class;
                if(v1 != 0) {
                    CLS27.MTH906(("shouldRemuxingVFS: " + v1));
                    CLS40 ﾞᵎ0 = CLS40.FLD157;
                    String s1 = CLS182.MTH3484(4101585831582290741L, new StringBuilder(), ((String)object1));
                    CLS484 ᐧﾞ$ˆٴ0 = (CLS484)ﾞᵎ0.FLD155.MTH1744(s1);
                    if(ᐧﾞ$ˆٴ0 != null) {
                        CLS485 ᐧﾞ0 = (CLS485)ﾞᵎ0.MTH1118(class6);
                        String s2 = CLS27.MTH889("mass_send_import_failed");
                        ᐧﾞ0.getClass();
                        CLS485.MTH6725(ᐧﾞ$ˆٴ0, s2, 0);
                    }
                    ﾞᵎ0.MTH1116(((CLS39)new CLS579(((CLS17)object0), ((String)object1), v, 0)));
                    return;
                }
                String s3 = CLS66.MTH1449(((String)object1));
                try {
                    MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
                    mediaMetadataRetriever0.setDataSource(s);
                    v2 = 0;
                    v2 = Integer.parseInt(mediaMetadataRetriever0.extractMetadata(18));
                    v3 = 0;
                    v3 = Integer.parseInt(mediaMetadataRetriever0.extractMetadata(19));
                    mediaMetadataRetriever0.release();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                String s4 = CLS27.MTH897("SightClass1_field2");
                try {
                    v4 = CLS166.MTH3187(class1, s4).getInt(null);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    CLS27.MTH893(illegalAccessException0);
                    throw new IllegalAccessError(illegalAccessException0.getMessage());
                }
                Object object3 = CLS166.MTH3188(class2, new Object[0]);
                Object object4 = CLS166.MTH3188(class3, new Object[0]);
                Object object5 = CLS166.MTH3188(class3, new Object[0]);
                Object object6 = CLS166.MTH3188(class3, new Object[0]);
                Object object7 = CLS166.MTH3188(class3, new Object[0]);
                Object object8 = CLS166.MTH3188(class3, new Object[0]);
                if(class4 == null) {
                    s6 = (String)object1;
                    CLS166.MTH3192(CLS27.MTH894("SightUtilClass"), CLS27.MTH897("SightInterface1_method1"), new Object[]{s, object4, object5, object6, object7, object8});
                }
                else {
                    Object object9 = CLS66.MTH1487(class4);
                    String s5 = CLS27.MTH897("SightInterface1_method1");
                    s6 = (String)object1;
                    CLS166.MTH3195(object9, s5, new Object[]{s, object4, object5, object6, object7, object8});
                }
                String s7 = CLS27.MTH897("VideoTransParaClass_durationField");
                CLS166.MTH3196(CLS166.MTH3181(object4, CLS27.MTH897("PIntClass_value")) / 1000, object3, s7);
                String s8 = CLS27.MTH897("VideoTransParaClass_widthField");
                CLS166.MTH3196(CLS166.MTH3181(object5, CLS27.MTH897("PIntClass_value")), object3, s8);
                String s9 = CLS27.MTH897("VideoTransParaClass_heightField");
                CLS166.MTH3196(CLS166.MTH3181(object6, CLS27.MTH897("PIntClass_value")), object3, s9);
                String s10 = CLS27.MTH897("VideoTransParaClass_fpsField");
                CLS166.MTH3196(CLS166.MTH3181(object7, CLS27.MTH897("PIntClass_value")), object3, s10);
                String s11 = CLS27.MTH897("VideoTransParaClass_bitrateField");
                CLS166.MTH3196(CLS166.MTH3181(object8, CLS27.MTH897("PIntClass_value")), object3, s11);
                Object object10 = CLS166.MTH3195(CLS166.MTH3192(class5, CLS27.MTH897("SubCoreVideoControlClass_method1"), new Object[0]), CLS27.MTH897("SubCoreVideoControlClass_method2"), new Object[]{object3, null});
                if(object10 == null) {
                    int v8 = v3;
                    int v9 = v2;
                    for(int v10 = 0; v10 < 3; ++v10) {
                        if(v9 % 2 != 0) {
                            --v9;
                        }
                        if(v8 % 2 != 0) {
                            --v8;
                        }
                        if(v9 >= v8 && (v9 <= 640 || v8 <= 480) || v9 <= v8 && (v9 <= 480 || v8 <= 640)) {
                            break;
                        }
                        v9 /= 2;
                        v8 /= 2;
                    }
                    v6 = v8;
                    v5 = v9;
                    v7 = v4;
                }
                else {
                    v5 = CLS166.MTH3181(object10, CLS27.MTH897("VideoTransParaClass_widthField"));
                    v6 = CLS166.MTH3181(object10, CLS27.MTH897("VideoTransParaClass_heightField"));
                    v7 = CLS166.MTH3181(object10, CLS27.MTH897("VideoTransParaClass_bitrateField"));
                }
                String s12 = CLS27.MTH892("SightVideoJNI_remuxingVFS", "remuxingVFS");
                Object[] arr_object = new Object[15];
                arr_object[0] = s;
                arr_object[1] = s3;
                arr_object[2] = v5;
                arr_object[3] = v6;
                arr_object[4] = v7;
                String s13 = CLS27.MTH897("SightClass1_field1");
                try {
                    v11 = CLS166.MTH3187(class1, s13).getInt(null);
                }
                catch(IllegalAccessException illegalAccessException1) {
                    CLS27.MTH893(illegalAccessException1);
                    throw new IllegalAccessError(illegalAccessException1.getMessage());
                }
                arr_object[5] = v11;
                arr_object[6] = 8;
                arr_object[7] = 2;
                arr_object[8] = 25.0f;
                String s14 = CLS27.MTH897("SightClass1_field3");
                try {
                    f = CLS166.MTH3187(class1, s14).getFloat(null);
                }
                catch(IllegalAccessException illegalAccessException2) {
                    CLS27.MTH893(illegalAccessException2);
                    throw new IllegalAccessError(illegalAccessException2.getMessage());
                }
                arr_object[9] = f;
                arr_object[10] = null;
                arr_object[11] = 0;
                arr_object[12] = Boolean.FALSE;
                arr_object[13] = 0;
                arr_object[14] = 51;
                int v12 = (int)(((Integer)CLS166.MTH3192(class0, s12, arr_object)));
                if(v12 < 0) {
                    CLS27.MTH906(("remuxingVFS error: " + v12));
                    CLS412.MTH6011(CLS27.MTH889("mass_send_import_failed"));
                    CLS40 ﾞᵎ1 = CLS40.FLD157;
                    String s15 = CLS182.MTH3484(4101584186609816373L, new StringBuilder(), s6);
                    CLS484 ᐧﾞ$ˆٴ1 = (CLS484)ﾞᵎ1.FLD155.MTH1744(s15);
                    if(ᐧﾞ$ˆٴ1 != null) {
                        CLS485 ᐧﾞ1 = (CLS485)ﾞᵎ1.MTH1118(class6);
                        String s16 = CLS27.MTH889("mass_send_import_failed");
                        ᐧﾞ1.getClass();
                        CLS485.MTH6725(ᐧﾞ$ˆٴ1, s16, 0);
                    }
                }
                else {
                    String s17 = CLS66.MTH1482(s6);
                    if(!TextUtils.isEmpty(s17) && !CLS31.MTH1024(s17)) {
                        CLS518.MTH7077(new File(s17), CLS518.MTH7052(s3));
                    }
                    CLS579 ﾞᐧ0 = new CLS579(((CLS17)object0), s6, v, 1);
                    CLS40.FLD157.MTH1116(((CLS39)ﾞᐧ0));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        CLS1622 ˑٴ0 = (CLS1622)this.FLD924;
        CLS1629 ⁱˉ0 = (CLS1629)this.FLD926;
        CLS1629 ⁱˉ1 = (CLS1629)this.FLD923;
        switch(s) {
            case "radio_multiple": {
                ˑٴ0.MTH801(0);
                ⁱˉ0.MTH801(8);
                break;
            }
            case "radio_single": {
                ˑٴ0.MTH801(8);
                if(this.FLD925 == 49) {
                    ⁱˉ0.MTH801(8);
                    ⁱˉ1.MTH801(0);
                    return;
                }
                ⁱˉ0.MTH801(0);
                break;
            }
            default: {
                return;
            }
        }
        ⁱˉ1.MTH801(8);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS0
    public final void MTH770(String s) {
        CLS629 ʻˋ0 = (CLS629)this.FLD926;
        ʻˋ0.getClass();
        CLS80 ˑٴ0 = new CLS80(((String)this.FLD924), this.FLD925, ((CLS87)this.FLD923));
        CLS158 ⁱʾ0 = ʻˋ0.FLD555;
        ⁱʾ0.MTH3150(ˑٴ0);
        int v = 0;
        if(!ʻˋ0.FLD1447.FLD1438.MTH6895("mass_send_by_one_hack") || !ʻˋ0.FLD1445.MTH938("mass_send_by_one_hack", false)) {
            if(!CLS412.MTH6002()) {
                v = 300000;
            }
            v = CLS412.MTH6005(v, "mass_send_delay");
        }
        ⁱʾ0.MTH3156(((long)v));
        ⁱʾ0.MTH3155();
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        int v = this.FLD925;
        Object object0 = this.FLD923;
        Object object1 = this.FLD926;
        Object object2 = this.FLD924;
        switch(this.FLD922) {
            case 3: {
                File file0 = (File)arr_object[0];
                CLS31.MTH1025(file0, new File(((File)object2), CLS31.MTH1034(file0.getName())));
                ((SparseArray)object1).put(v, arr_object);
                if(((CLS3)object0) != null) {
                    ((CLS3)object0).MTH774();
                }
                return;
            }
            case 7: {
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                ((CLS1622)object0).MTH800(((String)object2));
                ((CLS1622)object0).MTH7278(v);
                if(!TextUtils.isEmpty(((String)object1))) {
                    ((CLS1622)object0).MTH7277(((String)object1));
                }
                CLS523.MTH7147(linearLayout1, ((CLS18)(((CLS1622)object0))), true);
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                CLS1626 ـﹳ0 = new CLS1626(((Activity)object2));
                ـﹳ0.FLD5295 = false;
                ـﹳ0.FLD5301 = true;
                ـﹳ0.MTH800(CLS27.MTH889("selected"));
                CLS1624 יﹳ0 = new CLS1624(((Activity)object2));
                ArrayList arrayList0 = new ArrayList();
                for(Object object3: ((ArrayList)object1)) {
                    ContentValues contentValues0 = (ContentValues)object3;
                    if(contentValues0 != null) {
                        Date date0 = new Date(((long)contentValues0.getAsLong("startdate")));
                        Date date1 = new Date(((long)contentValues0.getAsLong("enddate")));
                        arrayList0.add(CLS372.MTH5417(contentValues0.getAsString("talker")) + "<br>" + CLS27.MTH889("timeframe_start_lbl") + CLS409.FLD3997.format(date0) + "<br>" + CLS27.MTH889("timeframe_end_lbl") + CLS409.FLD3997.format(date1) + "<br>");
                    }
                }
                CLS369 ﾞᵎ0 = new CLS369(((Activity)object2), arrayList0);
                יﹳ0.MTH7303(ﾞᵎ0);
                יﹳ0.MTH7308(5);
                if(v != -1) {
                    for(int v1 = 0; v1 < ((ArrayList)object1).size(); ++v1) {
                        if(((int)((ContentValues)((ArrayList)object1).get(v1)).getAsInteger("id")) == v) {
                            String s = (String)arrayList0.get(v1);
                            ـﹳ0.MTH7325(s);
                            ﾞᵎ0.FLD3463 = s;
                            ((int[])object0)[0] = v1;
                            break;
                        }
                    }
                }
                יﹳ0.MTH7301(new CLS200(ﾞᵎ0, ـﹳ0, ((int[])object0), 10));
                CLS1623 יᐧ0 = new CLS1623(((Activity)object2));
                יᐧ0.MTH7289(new Object[]{ـﹳ0, יﹳ0});
                יᐧ0.MTH7290(linearLayout0, CLS523.MTH7137(3));
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS412$CLS411
    public final void MTH5992(int v) {
        CLS839 ᵢⁱ0 = (CLS839)this.FLD924;
        String[] arr_s = (String[])this.FLD926;
        ArrayList arrayList0 = (ArrayList)this.FLD923;
        ᵢⁱ0.getClass();
        try {
            CLS66.MTH1464(arr_s[v], null, arrayList0);
            if(v == this.FLD925 - 1) {
                CLS412.MTH6014(((CLS140)ᵢⁱ0).MTH3042(), CLS27.MTH889("stop") + CLS27.MTH889("mass_invite_chatrooms"));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        CLS1105 ᐧˈ0 = (CLS1105)this.FLD926;
        String s = (String)this.FLD924;
        Activity activity0 = (Activity)this.FLD923;
        ᐧˈ0.getClass();
        String s1 = "";
        String s2 = CLS182.MTH3475(4100577991736480565L, CLS182.MTH3483(s));
        CLS29 ˎᵢ0 = ᐧˈ0.FLD2151;
        if(ˎᵢ0.MTH938(s2, false)) {
            s1 = ˎᵢ0.MTH925(CLS182.MTH3475(4100577609484391221L, CLS182.MTH3483(s)), CLS370.MTH5289(4100577746923344693L));
        }
        else if(CLS182.MTH3480(4100577751218311989L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            s1 = ˎᵢ0.MTH925(CLS182.MTH3475(4100574066136372021L, CLS182.MTH3483(s)), CLS370.MTH5289(4100574164920619829L));
        }
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˑٴ0.MTH800(CLS27.MTH889("keyword"));
        ˑٴ0.MTH798(CLS27.MTH889("fill_in_filter_keywords_separate_using"));
        ˑٴ0.MTH7277(s1);
        ˑٴ0.FLD5252 = new CLS999(ᐧˈ0, s, 7);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("add_keyword"));
        ـˏ0.MTH7320(new CLS258(ᐧˈ0, activity0, s, ˑٴ0));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH7289(new Object[]{ـˏ0, ˑٴ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), this.FLD925);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        ArrayList arrayList0 = (ArrayList)this.FLD926;
        CLS369 ﾞᵎ0 = (CLS369)this.FLD923;
        if(!TextUtils.isEmpty(s) && !((String)this.FLD924).equals(s)) {
            arrayList0.remove(this.FLD925);
            arrayList0.add(this.FLD925, s);
            ﾞᵎ0.notifyDataSetChanged();
            CLS27.MTH895().MTH922(TextUtils.join(",", arrayList0), "hidden_chat_menu_items");
        }
    }

    public final void MTH2457() {
        CLS97 ﾞٴ0 = (CLS97)this.FLD926;
        ProgressDialog progressDialog0 = (ProgressDialog)this.FLD923;
        int v = ((int[])this.FLD924)[0] + 1;
        ((int[])this.FLD924)[0] = v;
        int v1 = this.FLD925;
        if(v == v1) {
            if(!ﾞٴ0.FLD413) {
                CLS3 ˆٴ0 = ﾞٴ0.FLD411;
                if(ˆٴ0 != null) {
                    ﾞٴ0.FLD413 = true;
                    CLS575 ⁱᵔ0 = new CLS575(ˆٴ0, 1);
                    CLS40.FLD157.MTH1123(((CLS39)ⁱᵔ0), 2000L);
                }
            }
        }
        else if(progressDialog0 != null) {
            progressDialog0.setProgress(((int)Math.round((((double)v) + 1.0) / ((double)v1) * 100.0)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS210 ˋʼ0 = (CLS210)this.FLD924;
        Activity activity0 = (Activity)this.FLD926;
        CLS1625 ـˏ0 = (CLS1625)this.FLD923;
        ˋʼ0.getClass();
        CLS1635 ﾞᵎ0 = new CLS1635(activity0);
        ˋʼ0.FLD2012 = ﾞᵎ0;
        ﾞᵎ0.MTH800(CLS27.MTH889("enable"));
        CLS523.MTH7147(linearLayout0, ((CLS18)ˋʼ0.FLD2012), true);
        CLS500 ᵢﹶ0 = ˋʼ0.FLD2011;
        if(ᵢﹶ0.MTH6895("rp_keyword") && CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"})) {
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            ـﹳ0.MTH798(CLS27.MTH889("rp_amount_resp_desc"));
            ـﹳ0.FLD5295 = false;
            CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
        }
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        ˋʼ0.FLD2007 = ˑٴ0;
        ˑٴ0.MTH800(CLS27.MTH889("response"));
        if(ᵢﹶ0.MTH6895("text_rep_nickname") && !CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_FRIENDREQUEST_INTRO_", "_CHATROOM_INTRO_"})) {
            ˋʼ0.FLD2007.MTH798(CLS27.MTH889("text_rep_desc"));
        }
        CLS1622 ˑٴ1 = ˋʼ0.FLD2007;
        ˑٴ1.FLD5252 = new CLS1135(ˋʼ0, activity0);
        CLS523.MTH7147(linearLayout0, ((CLS18)ˑٴ1), true);
        ImageView imageView0 = new ImageView(activity0);
        ˋʼ0.FLD2019 = imageView0;
        CLS523.MTH7139(linearLayout0, imageView0, 0);
        ـˏ0.MTH800(CLS27.MTH889("preview"));
        ـˏ0.MTH801(8);
        ـˏ0.MTH7320(new CLS530(ˋʼ0, activity0, 5));
        CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ0), true);
        int v = this.FLD925;
        if(v == -1) {
            ˋʼ0.FLD2004 = null;
            ˋʼ0.FLD2008 = null;
        }
        else {
            CLS91 ᵔʾ0 = (CLS91)ˋʼ0.FLD2010.get(v);
            ˋʼ0.FLD2004 = ᵔʾ0.MTH1735();
            ˋʼ0.FLD2012.MTH7437(ᵔʾ0.FLD386 == 1);
            ˋʼ0.FLD2005 = ˋʼ0.FLD2012.MTH7444();
            ˋʼ0.FLD2018 = ᵔʾ0.MTH1738();
            ˋʼ0.FLD2013 = null;
            String s = "";
            if(ˋʼ0.FLD2004.startsWith("{")) {
                try {
                    JSONObject jSONObject0 = new JSONObject(ˋʼ0.FLD2004);
                    if(jSONObject0.has("meta")) {
                        ˋʼ0.FLD2018 = jSONObject0.getJSONObject("meta");
                    }
                    if(jSONObject0.has("response")) {
                        boolean z = false;
                        JSONArray jSONArray0 = jSONObject0.getJSONArray("response");
                        if(ᵔʾ0.FLD386 == 1) {
                            for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                                JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                                if(jSONObject1.has("checked") && jSONObject1.getBoolean("checked")) {
                                    s = jSONObject1.getString("msg");
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if(!z) {
                            s = jSONArray0.getJSONObject(0).getString("msg");
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                ˋʼ0.FLD2004 = s;
            }
            ˋʼ0.FLD2007.MTH7277(ᵔʾ0.MTH1735());
            if(s.startsWith("#img")) {
                String[] arr_s = s.split(" ");
                if(arr_s.length > 1) {
                    ˋʼ0.FLD2008 = arr_s[1];
                    ˋʼ0.FLD2019.setImageBitmap(ˋʼ0.FLD2002.MTH1253(arr_s[1]));
                }
            }
            else if(s.startsWith("#pic")) {
                String[] arr_s1 = s.split(" ");
                if(arr_s1.length > 1) {
                    ˋʼ0.FLD2019.setImageBitmap(CLS518.MTH7061(arr_s1[1]));
                }
            }
            else if(s.startsWith("#fav")) {
                ـˏ0.MTH801(0);
                String[] arr_s2 = s.split(" ");
                if(arr_s2.length > 1) {
                    Cursor cursor0 = ˋʼ0.FLD2021.MTH6388(arr_s2[1]);
                    if(cursor0 != null) {
                        if(cursor0.moveToFirst()) {
                            ContentValues contentValues0 = CLS404.MTH5911(cursor0);
                            if(contentValues0 != null && contentValues0.containsKey("img")) {
                                ˋʼ0.FLD2019.setImageBitmap(CLS518.MTH7061(contentValues0.getAsString("img")));
                            }
                        }
                        cursor0.close();
                    }
                }
            }
        }
        if(ᵢﹶ0.MTH6895("rp_keyword") && CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_REDPACKETS_", "_MONEYTRANSFER_"})) {
            CLS1635 ﾞᵎ1 = new CLS1635(activity0);
            CLS1635 ﾞᵎ2 = CLS34.MTH1086(4100604624828683061L, ﾞᵎ1, activity0);
            ﾞᵎ2.MTH800(CLS27.MTH889("private_chat"));
            CLS1622 ˑٴ2 = new CLS1622(activity0);
            ˑٴ2.MTH800(CLS27.MTH889("money_amount"));
            ˑٴ2.MTH7278(0x2000);
            try {
                if(ˋʼ0.FLD2018 == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    ˋʼ0.FLD2018 = jSONObject2;
                    jSONObject2.put("chatroom", true);
                    ˋʼ0.FLD2018.put("private", true);
                    ˋʼ0.FLD2018.put("amount", 0);
                }
                ﾞᵎ1.MTH7437(!ˋʼ0.FLD2018.has("chatroom") || ˋʼ0.FLD2018.getBoolean("chatroom"));
                ﾞᵎ2.MTH7437(!ˋʼ0.FLD2018.has("private") || ˋʼ0.FLD2018.getBoolean("private"));
                ˑٴ2.MTH7277(String.valueOf((ˋʼ0.FLD2018.has("amount") ? ((double)ˋʼ0.FLD2018.getInt("amount")) / 100.0 : 0.0)));
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            ﾞᵎ1.MTH7438(new CLS231(ˋʼ0, 1));
            ﾞᵎ2.MTH7438(new CLS231(ˋʼ0, 2));
            ˑٴ2.FLD5252 = new CLS968(ˋʼ0, 1);
            CLS1623 יᐧ0 = new CLS1623(activity0);
            CLS182.MTH3498(יᐧ0, new Object[]{ﾞᵎ1, ﾞᵎ2, ˑٴ2}, 10, linearLayout0, יᐧ0);
        }
    }
}

